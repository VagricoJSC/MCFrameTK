/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.servlet.http.HttpServletRequest
 *  javax.servlet.http.HttpServletResponse
 *  mcframe.commonCore.container.MCList
 *  mcframe.serverCore.login.MCUserAuthAgent
 *  mcframe.serverCore.login.MCUserR
 */
package mcframe.serverCore.atwork;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mcframe.commonCore.container.MCList;
import mcframe.serverCore.atwork.MCAWCocdResolver;
import mcframe.serverCore.atwork.MCAWLogic;
import mcframe.serverCore.atwork.ResponseData;
import mcframe.serverCore.login.MCUserAuthAgent;
import mcframe.serverCore.login.MCUserR;

public class MCAWUserListLogic
extends MCAWLogic {
    @Override
    public ResponseData execute(HttpServletRequest req, HttpServletResponse res) {
        String q = req.getParameter("q");
        String[] cocds = req.getParameterValues("company");
        MCUserAuthAgent agent = MCUserAuthAgent.getAgent();
        MCList list = agent.getUserList();
        ArrayList<ResponseData> resultList = new ArrayList<ResponseData>();
        for (MCUserR userRow : list) {
            if (!this.isAddResult(q, userRow, cocds)) continue;
            ResponseData data = new ResponseData();
            data.setProperty("id", userRow.user_id());
            data.setProperty("name", userRow.user_nm());
            data.setProperty("email1", "");
            data.setProperty("email2", "");
            data.setProperty("email3", "");
            data.setProperty("tel1", "");
            data.setProperty("tel2", "");
            data.setProperty("tel3", "");
            resultList.add(data);
        }
        return ResponseData.ok().setProperty("userList", resultList);
    }

    private boolean isAddResult(String q, MCUserR user, String[] cocds) {
        boolean b;
        boolean bl = b = q == null || q.equals("") || user.user_id() != null && user.user_id().contains(q) || user.user_nm() != null && user.user_nm().contains(q);
        if (b) {
            if (cocds == null || cocds.length == 0) {
                return true;
            }
            if (MCAWCocdResolver.isUserCompany(user.user_id(), cocds)) {
                return true;
            }
        }
        return false;
    }
}

