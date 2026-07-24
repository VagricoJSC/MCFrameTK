/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.servlet.http.HttpServletRequest
 *  javax.servlet.http.HttpServletResponse
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.jwt.MCJwtException
 *  mcframe.commonCore.lang.MCBinary
 *  mcframe.commonCore.param.MCDownloadStream
 *  mcframe.serverCore.dbc.MAVM_USR_MST_R
 *  mcframe.serverCore.mcjdbc.MCTransactionManager
 *  mcframe.serverCore.queryapi.IFMCFMSQL$MCFMEDColumnGroup
 *  mcframe.serverCore.queryapi.IFMCSQL
 *  mcframe.serverCore.queryapi.IFMCSQL$MCDerivedView
 *  mcframe.serverCore.queryapi.IFMCSQL$MCMainQuery
 */
package mcframe.serverCore.atwork;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.jwt.MCJwtException;
import mcframe.commonCore.lang.MCBinary;
import mcframe.commonCore.param.MCDownloadStream;
import mcframe.serverCore.atwork.MCAWCocdResolver;
import mcframe.serverCore.atwork.MCAWLogic;
import mcframe.serverCore.atwork.ResponseData;
import mcframe.serverCore.dbc.MAVM_USR_MST_R;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import mcframe.serverCore.queryapi.IFMCFMSQL;
import mcframe.serverCore.queryapi.IFMCSQL;

public class MCAWUserIconLogic
extends MCAWLogic {
    private static final MAVM_USR_MST_R S0 = MAVM_USR_MST_R.create();
    private static final IFMCSQL.MCMainQuery SQL = (IFMCSQL.MCMainQuery)((IFMCSQL.MCMainQuery)IFMCSQL.sql((String)"FC_AW_GET_USERS_ICON_FROM_MA").mainQuery().select(new IFMCFMSQL.MCFMEDColumnGroup[]{MCAWUserIconLogic.S0.th_image, MCAWUserIconLogic.S0.co_cd}).from((IFMCSQL.MCDerivedView)S0)).where(MCAWUserIconLogic.S0.usr_cd.eq((Object)IFMCSQL.bind((String)"usr_cd")));

    @Override
    public ResponseData execute(HttpServletRequest req, HttpServletResponse res) {
        String cocd;
        String userId = req.getParameter("userId");
        if (userId == null || userId.isEmpty()) {
            return ResponseData.error();
        }
        String token = req.getParameter("token");
        if (token == null || token.isEmpty()) {
            return ResponseData.error();
        }
        String awid = req.getParameter("awid");
        try {
            cocd = MCAWCocdResolver.resolveCoCd(awid, userId, token);
        }
        catch (MCJwtException mCJwtException) {
            return ResponseData.error();
        }
        if (cocd == null || cocd.isEmpty()) {
            return ResponseData.error();
        }
        ResponseData data = this.getDataFromMa(userId, cocd);
        return data;
    }

    private ResponseData getDataFromMa(String userId, String cocd) {
        byte[] bytes;
        MCList list = MCList.create(MCRow.class);
        list.addBinaryColumn("TH_IMAGE");
        MCRow bindMap = MCRow.create();
        bindMap.setStringNE("usr_cd", userId);
        SQL.executeQuery(bindMap, list);
        if (list.isEmpty()) {
            return ResponseData.error();
        }
        MCRow row = this.getRow((MCList<MCRow>)list, cocd);
        if (row == null) {
            return ResponseData.error();
        }
        MCBinary bin = row.getBinary("TH_IMAGE");
        try {
            bytes = this.getBytes(bin);
        }
        catch (IOException iOException) {
            return ResponseData.error();
        }
        String strData = null;
        if (bytes != null) {
            strData = this.data2String(bytes);
        }
        ResponseData data = ResponseData.ok();
        data.setProperty("icon", strData);
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

    /*
     * Loose catch block
     */
    private byte[] getBytes(MCBinary bin) throws IOException {
        if (bin == null) {
            return null;
        }
        Throwable throwable = null;
        Object var3_4 = null;
        try {
            byte[] byArray;
            ByteArrayOutputStream bout;
            MCDownloadStream ds;
            block18: {
                block17: {
                    int len;
                    ds = MCTransactionManager.dbTran().statement().selectBinary(bin.toDBPointer());
                    bout = new ByteArrayOutputStream();
                    byte[] buffer = new byte[1024];
                    while ((len = ds.read(buffer)) >= 0) {
                        bout.write(buffer, 0, len);
                    }
                    byArray = bout.toByteArray();
                    if (bout == null) break block17;
                    bout.close();
                }
                if (ds == null) break block18;
                ds.close();
            }
            return byArray;
            {
                catch (Throwable throwable2) {
                    try {
                        if (bout != null) {
                            bout.close();
                        }
                        throw throwable2;
                    }
                    catch (Throwable throwable3) {
                        if (throwable == null) {
                            throwable = throwable3;
                        } else if (throwable != throwable3) {
                            throwable.addSuppressed(throwable3);
                        }
                        if (ds != null) {
                            ds.close();
                        }
                        throw throwable;
                    }
                }
            }
        }
        catch (Throwable throwable4) {
            if (throwable == null) {
                throwable = throwable4;
            } else if (throwable != throwable4) {
                throwable.addSuppressed(throwable4);
            }
            throw throwable;
        }
    }

    private String data2String(byte[] src) {
        return Base64.getEncoder().encodeToString(src);
    }
}

