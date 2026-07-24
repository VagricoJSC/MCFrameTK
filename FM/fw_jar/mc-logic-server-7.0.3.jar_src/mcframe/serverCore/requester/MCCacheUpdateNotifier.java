/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.notice.Core_Msg_FW_A
 *  mcframe.commonCore.notice.MCException
 *  mcframe.commonCore.notice.MCLog
 *  mcframe.commonCore.notice.MCServerAppException
 *  mcframe.commonCore.notice.MCServerException
 *  mcframe.serverCore.logic.MCOperation
 *  mcframe.serverCore.queryapi.MCDBContainer
 *  mcframe.serverCore.requester.MCBroadcastCaller
 *  mcframe.serverCore.requester.MCClusterCaller$Task
 *  mcframe.serverCore.requester.MCRequest
 *  mcframe.serverCore.requester.MCRequestInfo
 *  mcframe.serverCore.requester.MCRequestObject
 *  mcframe.serverCore.requester.MCUser
 *  mcframe.serverCore.requester.MCUserInfo
 *  mcframe.serverCore.sys.MCSys
 */
package mcframe.serverCore.requester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.notice.Core_Msg_FW_A;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCLog;
import mcframe.commonCore.notice.MCServerAppException;
import mcframe.commonCore.notice.MCServerException;
import mcframe.serverCore.cache.MCTableCacheUtil;
import mcframe.serverCore.cache.ctrl.CndR;
import mcframe.serverCore.cache.ctrl.InfoR;
import mcframe.serverCore.cache.ctrl.MCTableCacheCtrl;
import mcframe.serverCore.cache.ctrl.MCTableCacheCtrl_FW;
import mcframe.serverCore.logic.MCOperation;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.requester.MCBroadcastCaller;
import mcframe.serverCore.requester.MCClusterCaller;
import mcframe.serverCore.requester.MCRequest;
import mcframe.serverCore.requester.MCRequestInfo;
import mcframe.serverCore.requester.MCRequestObject;
import mcframe.serverCore.requester.MCUser;
import mcframe.serverCore.requester.MCUserInfo;
import mcframe.serverCore.sys.MCSys;

public class MCCacheUpdateNotifier {
    private final List<UpdateInfo> _infos = Collections.synchronizedList(new ArrayList());

    public static void addToRequest(MCDBContainer dbc, ModifyType type) {
        MCCacheUpdateNotifier notifier = (MCCacheUpdateNotifier)MCRequestObject.object(MCCacheUpdateNotifier.class);
        if (notifier != null) {
            notifier.add(dbc, type);
        }
    }

    public static void notifyFromRequest() {
        MCCacheUpdateNotifier notifier = (MCCacheUpdateNotifier)MCRequestObject.object(MCCacheUpdateNotifier.class);
        if (notifier != null) {
            try {
                notifier.notifyUpdate();
            }
            catch (Throwable t) {
                MCLog.write((Throwable)new MCException(t, Core_Msg_FW_A.FCBGC0470, new Object[0]));
            }
        }
    }

    public <T extends MCDBContainer> void add(T dbc, ModifyType type) {
        String table = dbc.tableName();
        this._infos.add(new UpdateInfo(table, type));
    }

    private Set<String> getUpdateSet(List<UpdateInfo> infos) {
        HashSet<String> tables = new HashSet<String>();
        for (UpdateInfo info : infos) {
            String table = info.table;
            ModifyType type = info.type;
            String[] stringArray = new String[2];
            stringArray[0] = table;
            String[] ts = stringArray;
            ts[1] = table.endsWith("_ALL") ? table.substring(0, table.length() - 4) : String.valueOf(table) + "_ALL";
            String[] stringArray2 = ts;
            int n = ts.length;
            int n2 = 0;
            while (n2 < n) {
                String t = stringArray2[n2];
                tables.add(t);
                switch (type) {
                    case INSERT: 
                    case UPDATE: {
                        String t_view = String.valueOf(t) + "_LCL";
                        tables.add(t_view);
                        int pos = t.lastIndexOf(95);
                        if (pos <= 0) break;
                        String t_table = String.valueOf(t.substring(0, pos)) + "_LCL" + t.substring(pos);
                        tables.add(t_table);
                        break;
                    }
                }
                ++n2;
            }
        }
        return tables;
    }

    public void notifyUpdate() {
        if (MCSys.user.ID() == null || MCSys.user.loginSequence() == null) {
            return;
        }
        if (this._infos.size() <= 0) {
            return;
        }
        ArrayList<UpdateInfo> infoList = new ArrayList<UpdateInfo>(this._infos);
        String co_cd = MCSys.user.coCD();
        Locale lcl = MCSys.user.locale();
        String lcl_cd = lcl != null ? lcl.toString() : null;
        Map reqobj = MCRequestObject.get();
        new Thread(() -> {
            try {
                MCRequestObject.init();
                MCRequestInfo reqinfo = (MCRequestInfo)reqobj.get(MCRequestInfo.class);
                MCRequest.init((MCRequestInfo)reqinfo);
                MCUserInfo usrinfo = (MCUserInfo)reqobj.get(MCUserInfo.class);
                MCUser.init((MCUserInfo)usrinfo);
                Set<String> tableSet = this.getUpdateSet(infoList);
                MCTableCacheCtrl_FW.UpdateNotify un = MCTableCacheCtrl.crtUpdateNotify();
                for (String table : tableSet) {
                    if (!MCTableCacheUtil.checkTarget(table)) continue;
                    InfoR infoR = (InfoR)un.up1().add();
                    infoR.table(table);
                }
                if (un.up1().size() <= 0) {
                    return;
                }
                CndR cndR = un.up0();
                cndR.co_cd(co_cd);
                cndR.lcl_cd(lcl_cd);
                MCBroadcastCaller caller = new MCBroadcastCaller();
                caller.broadcast((MCOperation)un, null, (op, e) -> {
                    if (e instanceof MCServerException || e instanceof MCServerAppException) {
                        MCClusterCaller.Task task = caller.getTask((MCOperation)op);
                        int taskno = task.getNo();
                        String url = task.getURL();
                        String clreqno = task.getParam().getClientRequestNo();
                        String svreqno = task.getParam().getServerRequestNo();
                        MCException mce = new MCException((Throwable)e, Core_Msg_FW_A.FCBGC0471, new Object[]{taskno, url, clreqno, svreqno});
                        MCLog.write((Throwable)mce);
                    } else {
                        MCLog.write((Throwable)e);
                    }
                });
            }
            finally {
                MCRequestObject.destory();
            }
        }, "CacheUpdateCallThread - " + MCSys.request.clientRequestNo() + "/" + MCSys.request.serverRequestNo()).start();
    }

    public static enum ModifyType {
        INSERT,
        UPDATE,
        DELETE;

    }

    private static class UpdateInfo {
        String table = null;
        ModifyType type = null;

        UpdateInfo(String table, ModifyType type) {
            this.table = table;
            this.type = type;
        }
    }
}

