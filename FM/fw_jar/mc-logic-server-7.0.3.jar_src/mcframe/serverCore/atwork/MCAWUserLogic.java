/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.servlet.http.HttpServletRequest
 *  javax.servlet.http.HttpServletResponse
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.jwt.MCJWT
 *  mcframe.commonCore.jwt.MCJwtException
 *  mcframe.commonCore.login.MCAuth
 *  mcframe.serverCore.dbc.MAVM_USR_MST_R
 *  mcframe.serverCore.login.MCUserAuthAgent
 *  mcframe.serverCore.login.MCUserR
 *  mcframe.serverCore.queryapi.IFMCFMSQL$MCFMEDColumnGroup
 *  mcframe.serverCore.queryapi.IFMCSQL
 *  mcframe.serverCore.queryapi.IFMCSQL$MCDerivedView
 *  mcframe.serverCore.queryapi.IFMCSQL$MCMainQuery
 */
package mcframe.serverCore.atwork;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.jwt.MCJWT;
import mcframe.commonCore.jwt.MCJwtException;
import mcframe.commonCore.login.MCAuth;
import mcframe.serverCore.atwork.MCAWCocdResolver;
import mcframe.serverCore.atwork.MCAWLogic;
import mcframe.serverCore.atwork.ResponseData;
import mcframe.serverCore.dbc.MAVM_USR_MST_R;
import mcframe.serverCore.login.MCUserAuthAgent;
import mcframe.serverCore.login.MCUserR;
import mcframe.serverCore.queryapi.IFMCFMSQL;
import mcframe.serverCore.queryapi.IFMCSQL;

public class MCAWUserLogic
extends MCAWLogic {
    private static final MAVM_USR_MST_R S0 = MAVM_USR_MST_R.create();
    private static final IFMCSQL.MCMainQuery SQL = (IFMCSQL.MCMainQuery)((IFMCSQL.MCMainQuery)IFMCSQL.sql((String)"FC_AW_GET_USERS_INFO_FROM_MA").mainQuery().select(new IFMCFMSQL.MCFMEDColumnGroup[]{MCAWUserLogic.S0.usr_nm, MCAWUserLogic.S0.email1, MCAWUserLogic.S0.email2, MCAWUserLogic.S0.email3, MCAWUserLogic.S0.tel1, MCAWUserLogic.S0.tel2, MCAWUserLogic.S0.tel3, MCAWUserLogic.S0.co_cd}).from((IFMCSQL.MCDerivedView)S0)).where(MCAWUserLogic.S0.usr_cd.eq((Object)IFMCSQL.bind((String)"usr_cd")));

    @Override
    public ResponseData execute(HttpServletRequest req, HttpServletResponse res) {
        ResponseData data;
        String userId = req.getParameter("userId");
        if (userId == null || userId.isEmpty()) {
            return ResponseData.error();
        }
        String token = req.getParameter("token");
        if (token == null || token.isEmpty()) {
            return ResponseData.error();
        }
        String awid = req.getParameter("awid");
        String cocd = null;
        try {
            String tokenUserId = MCJWT.decode((String)token, null).getUserId();
            String tokenStr = token;
            if (!userId.equals(tokenUserId)) {
                tokenStr = null;
            }
            cocd = MCAWCocdResolver.resolveCoCd(awid, userId, tokenStr);
        }
        catch (MCJwtException mCJwtException) {
            return ResponseData.error();
        }
        if (cocd == null || cocd.isEmpty() || MCAuth.isAdminUser((String)userId)) {
            data = this.getDataFromAgent(userId);
        } else {
            data = this.getDataFromMa(userId, cocd);
            if (data == null) {
                data = this.getDataFromAgent(userId);
            }
        }
        return data;
    }

    private ResponseData getDataFromAgent(String userId) {
        MCUserAuthAgent agent = MCUserAuthAgent.getAgent();
        MCUserR userRow = agent.getUserRow(userId);
        if (userRow == null) {
            return null;
        }
        ResponseData data = ResponseData.ok();
        data.setProperty("id", userRow.user_id());
        data.setProperty("name", userRow.user_nm());
        data.setProperty("email1", "");
        data.setProperty("email2", "");
        data.setProperty("email3", "");
        data.setProperty("tel1", "");
        data.setProperty("tel2", "");
        data.setProperty("tel3", "");
        data.setProperty("is_system_admin", MCAuth.isAdminUser((String)userId));
        return data;
    }

    private ResponseData getDataFromMa(String userId, String cocd) {
        MCList list = MCList.create(MCRow.class);
        MCRow bindMap = MCRow.create();
        bindMap.setStringNE("usr_cd", userId);
        SQL.executeQuery(bindMap, list);
        if (list.isEmpty()) {
            return null;
        }
        MCRow row = this.getRow((MCList<MCRow>)list, cocd);
        if (row == null) {
            return null;
        }
        ResponseData data = ResponseData.ok();
        data.setProperty("id", userId);
        data.setProperty("name", row.getStringNE("USR_NM"));
        data.setProperty("email1", row.getStringNE("EMAIL1"));
        data.setProperty("email2", row.getStringNE("EMAIL2"));
        data.setProperty("email3", row.getStringNE("EMAIL3"));
        data.setProperty("tel1", row.getStringNE("TEL1"));
        data.setProperty("tel2", row.getStringNE("TEL2"));
        data.setProperty("tel3", row.getStringNE("TEL3"));
        data.setProperty("is_system_admin", false);
        return data;
    }

    private MCRow getRow(MCList<MCRow> list, String cocd) {
        if (list.size() == 1) {
            return list.get(0);
        }
        for (MCRow row : list) {
            if (!cocd.equals(row.getStringNE("CO_CD"))) continue;
            return row;
        }
        return null;
    }
}

