/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.servlet.http.HttpServletRequest
 *  javax.servlet.http.HttpServletResponse
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.lang.MCStringUtil
 *  mcframe.commonCore.notice.Core_Msg
 *  mcframe.commonCore.notice.MCException
 *  mcframe.serverCore.login.ExtAuthR
 *  mcframe.serverCore.login.MCLoginInfo
 *  mcframe.serverCore.login.MCUserAuthAgent
 */
package mcframe.serverCore.atwork;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCStringUtil;
import mcframe.commonCore.notice.Core_Msg;
import mcframe.commonCore.notice.MCException;
import mcframe.serverCore.atwork.MCAWAgent;
import mcframe.serverCore.atwork.MCAWLogic;
import mcframe.serverCore.atwork.ResponseData;
import mcframe.serverCore.login.ExtAuthR;
import mcframe.serverCore.login.MCLoginInfo;
import mcframe.serverCore.login.MCUserAuthAgent;

public class MCAWAuthLogic
extends MCAWLogic {
    @Override
    public ResponseData execute(HttpServletRequest req, HttpServletResponse res) {
        String id = req.getParameter("userId");
        String pw = req.getParameter("userPw");
        String cltId = req.getParameter("cltId");
        MCList<ExtAuthR> extParams = this.getExtAuth(req);
        try {
            MCUserAuthAgent agent = MCUserAuthAgent.getAgent();
            MCLoginInfo loginInfo = null;
            loginInfo = !MCStringUtil.isNull((String)this.getExtAuthMode(extParams)) ? agent.awauthExternal(extParams, cltId) : agent.awauthDefault(id, pw, cltId);
            ResponseData data = ResponseData.ok();
            data.setProperty("mcuserid", loginInfo.userID());
            data.setProperty("token", MCAWAgent.issueToken(loginInfo.userID()));
            data.setProperty("errorcode", "0");
            return data;
        }
        catch (MCException e) {
            ResponseData data = ResponseData.error();
            if (Core_Msg.FCBHC0057.equals(e.getID())) {
                data.setProperty("errorcode", "2");
                return data;
            }
            if (Core_Msg.FCBHC0004.equals(e.getID()) || Core_Msg.FCBJC0035.equals(e.getID()) || Core_Msg.FCBHC0150.equals(e.getID()) || Core_Msg.FCBHC0151.equals(e.getID()) || Core_Msg.FCBHC0152.equals(e.getID()) || Core_Msg.FCBHC0153.equals(e.getID()) || Core_Msg.FCBHC0154.equals(e.getID()) || Core_Msg.FCBHC0155.equals(e.getID())) {
                data.setProperty("errorcode", "1");
                return data;
            }
            throw e;
        }
    }

    private MCList<ExtAuthR> getExtAuth(HttpServletRequest req) {
        String[] samlkeys = new String[]{"extmode", "user_id", "principal", "session_id"};
        MCList extParams = MCList.create(ExtAuthR.class);
        String[] stringArray = samlkeys;
        int n = samlkeys.length;
        int n2 = 0;
        while (n2 < n) {
            String k = stringArray[n2];
            ExtAuthR r = ExtAuthR.create();
            r.authKey(k);
            r.authValue(req.getParameter(k));
            extParams.add((MCRow)r);
            ++n2;
        }
        return extParams;
    }

    private String getExtAuthMode(MCList<ExtAuthR> extParams) {
        ExtAuthR ext_mode = (ExtAuthR)extParams.getFirst("authKey", (Comparable)((Object)"extmode"));
        if (ext_mode != null) {
            return ext_mode.authValue();
        }
        return null;
    }
}

