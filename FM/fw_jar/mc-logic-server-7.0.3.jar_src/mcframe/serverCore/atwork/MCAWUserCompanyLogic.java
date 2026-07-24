/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.servlet.http.HttpServletRequest
 *  javax.servlet.http.HttpServletResponse
 */
package mcframe.serverCore.atwork;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mcframe.serverCore.atwork.MCAWCo;
import mcframe.serverCore.atwork.MCAWCocdResolver;
import mcframe.serverCore.atwork.MCAWLogic;
import mcframe.serverCore.atwork.ResponseData;

public class MCAWUserCompanyLogic
extends MCAWLogic {
    @Override
    public ResponseData execute(HttpServletRequest req, HttpServletResponse res) {
        String userId = req.getParameter("userId");
        if (userId == null || userId.isEmpty()) {
            return ResponseData.error();
        }
        String token = req.getParameter("token");
        if (token == null || token.isEmpty()) {
            return ResponseData.error();
        }
        String locale = req.getParameter("locale");
        List<MCAWCo> ret = MCAWCocdResolver.getUserCoCd(userId, locale);
        ResponseData data = ResponseData.ok();
        data.setProperty("companies", ret);
        return data;
    }
}

