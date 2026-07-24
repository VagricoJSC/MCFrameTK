/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.lang.MCDate
 *  mcframe.commonCore.lang.MCNumber
 *  mcframe.serverCore.dbc.FCM_GRANT_USER_GRP_R
 *  mcframe.serverCore.dbc.FCM_USER_GRP_R
 *  mcframe.serverCore.login.MCUserAuthAgent
 *  mcframe.serverCore.login.MCUserR
 *  mcframe.serverCore.queryapi.IFMCSQL
 *  mcframe.serverCore.queryapi.IFMCSQL$MCColumn
 *  mcframe.serverCore.queryapi.IFMCSQL$MCSingleView
 *  mcframe.serverCore.queryapi.MCDBContainer
 *  mcframe.serverCore.queryapi.MCQueryApiBuilder
 *  mcframe.serverCore.util.MCDBUtil
 */
package mcframe.serverCore.group;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.dbc.FCM_GRANT_USER_GRP_R;
import mcframe.serverCore.dbc.FCM_USER_GRP_R;
import mcframe.serverCore.group.MCUserGroupR;
import mcframe.serverCore.login.MCUserAuthAgent;
import mcframe.serverCore.login.MCUserR;
import mcframe.serverCore.queryapi.IFMCSQL;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverCore.util.MCDBUtil;

public class MCUserGroupManager {
    private static MCUserGroupManager _agent = null;

    private MCUserGroupManager() {
    }

    public static final MCUserGroupManager getManager() {
        if (_agent == null) {
            return new MCUserGroupManager();
        }
        return _agent;
    }

    public MCList<MCUserGroupR> getUserGroupList() {
        MCList dbL = MCList.create(FCM_USER_GRP_R.class);
        FCM_USER_GRP_R t = FCM_USER_GRP_R.create((String)"T");
        MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create((MCDBContainer)t);
        MCDBUtil.dbSelect((String)"FCBFL0100_FCM_USER_GRP_S01", (MCList)dbL, (MCQueryApiBuilder)dbL_bldr);
        MCList mcL = MCList.create(MCUserGroupR.class);
        for (FCM_USER_GRP_R dbR : dbL) {
            MCUserGroupR r = this.convUserGroupRow(dbR);
            mcL.add((MCRow)r);
        }
        return mcL;
    }

    public MCList<MCUserGroupR> getUserGroupList(String userid) {
        return this.getUserGroupList(userid, MCDate.today());
    }

    public MCList<MCUserGroupR> getUserGroupList(String userid, MCDate date) {
        FCM_GRANT_USER_GRP_R t2 = FCM_GRANT_USER_GRP_R.create((String)"T2");
        MCList l = MCList.create(FCM_USER_GRP_R.class);
        FCM_USER_GRP_R t = FCM_USER_GRP_R.create((String)"T");
        MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create((MCDBContainer)t);
        l_bldr.addInnerJoin((IFMCSQL.MCSingleView)t2, t.ugid.eq((Object)t2.ugid));
        l_bldr.addWhereWithAnd(t2.user_id.eq((Object)IFMCSQL.value((String)userid)), new Comparable[0]);
        l_bldr.addWhereWithAnd(t2.st_dt.lte((Object)IFMCSQL.value((MCDate)date)), new Comparable[0]);
        l_bldr.addWhereWithAnd(t2.end_dt.gte((Object)IFMCSQL.value((MCDate)date)), new Comparable[0]);
        l_bldr.setDistinct();
        if (MCDBUtil.dbSelect((String)"FCBFL0100_FCM_GRANT_USER_GRP_S01", (MCList)l, (MCQueryApiBuilder)l_bldr) <= 0) {
            return null;
        }
        MCList list = MCList.create(MCUserGroupR.class);
        for (FCM_USER_GRP_R r : l) {
            MCUserGroupR row = this.convUserGroupRow(r);
            list.add((MCRow)row);
        }
        return list;
    }

    private MCUserGroupR convUserGroupRow(FCM_USER_GRP_R dbR) {
        if (dbR == null) {
            return null;
        }
        MCUserGroupR r = MCUserGroupR.create();
        r.ugid(dbR.ugid());
        r.group_id(dbR.group_id());
        r.group_nm(dbR.group_nm());
        r.co_cd(dbR.co_cd());
        r.ext_attr1(dbR.ext_attr1());
        r.ext_attr2(dbR.ext_attr2());
        r.ext_attr3(dbR.ext_attr3());
        r.upd_cntr(dbR.upd_cntr());
        return r;
    }

    public MCList<MCUserR> getGrantUserList(MCUserGroupR UserGroupR) {
        return this.getGrantUserList(UserGroupR.group_id());
    }

    public MCList<MCUserR> getGrantUserList(String usergroup) {
        return this.getGrantUserList(usergroup, MCDate.today());
    }

    public MCList<MCUserR> getGrantUserList(MCUserGroupR UserGroupR, MCDate date) {
        return this.getGrantUserList(UserGroupR.group_id(), date);
    }

    public MCList<MCUserR> getGrantUserList(String usergroup, MCDate date) {
        FCM_USER_GRP_R grpR = FCM_USER_GRP_R.create();
        FCM_USER_GRP_R t = FCM_USER_GRP_R.create((String)"T");
        MCQueryApiBuilder grpR_bldr = MCQueryApiBuilder.create((MCDBContainer)t);
        grpR_bldr.addWhereWithAnd(t.group_id.eq((Object)IFMCSQL.value((String)usergroup)), new Comparable[0]);
        MCDBUtil.dbSelect((String)"FCBFL0100_FCM_USER_GRP_S02", (MCRow)grpR, (MCQueryApiBuilder)grpR_bldr);
        MCList grpL = MCList.create(FCM_GRANT_USER_GRP_R.class);
        FCM_GRANT_USER_GRP_R tl = FCM_GRANT_USER_GRP_R.create((String)"T");
        MCQueryApiBuilder grpL_bldr = MCQueryApiBuilder.create((MCDBContainer)tl);
        grpL_bldr.setSelect(new IFMCSQL.MCColumn[]{tl.user_id});
        grpL_bldr.addWhereWithAnd(tl.ugid.eq((Object)IFMCSQL.value((MCNumber)grpR.ugid())), new Comparable[0]);
        grpL_bldr.addWhereWithAnd(tl.st_dt.lte((Object)IFMCSQL.value((MCDate)date)), new Comparable[0]);
        grpL_bldr.addWhereWithAnd(tl.end_dt.gte((Object)IFMCSQL.value((MCDate)date)), new Comparable[0]);
        grpL_bldr.setDistinct();
        if (MCDBUtil.dbSelect((String)"FCBFL0100_FCM_GRANT_USER_GRP_S02", (MCList)grpL, (MCQueryApiBuilder)grpL_bldr) < 1) {
            return null;
        }
        MCList tmpL = MCUserAuthAgent.getAgent().getUserList();
        MCList userL = MCList.create(MCUserR.class);
        for (FCM_GRANT_USER_GRP_R r : grpL) {
            MCUserR userR = (MCUserR)tmpL.getFirst("user_id", (Comparable)((Object)r.user_id()));
            if (userR == null) continue;
            userL.add((MCRow)userR);
        }
        return userL;
    }
}

