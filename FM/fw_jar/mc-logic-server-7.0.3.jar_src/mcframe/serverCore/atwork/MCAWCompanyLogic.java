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

public class MCAWCompanyLogic
extends MCAWLogic {
    @Override
    public ResponseData execute(HttpServletRequest req, HttpServletResponse res) {
        String[] cocds = req.getParameterValues("company");
        String locale = req.getParameter("locale");
        if (cocds == null || cocds.length == 0) {
            return ResponseData.error();
        }
        List<MCAWCo> ret = MCAWCocdResolver.getCoCd(cocds, locale);
        ResponseData data = ResponseData.ok();
        data.setProperty("companies", ret);
        return data;
    }
}

