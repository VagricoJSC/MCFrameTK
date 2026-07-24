/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.servlet.http.HttpServletRequest
 *  javax.servlet.http.HttpServletResponse
 *  mcframe.commonCore.lang.MCTimestamp
 */
package mcframe.serverCore.atwork;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.serverCore.atwork.MCAWLogic;
import mcframe.serverCore.atwork.ResponseData;

public class MCAWMCSystemDateLogic
extends MCAWLogic {
    @Override
    public ResponseData execute(HttpServletRequest req, HttpServletResponse res) {
        ResponseData data = ResponseData.ok();
        data.setProperty("mcsystemdate", MCTimestamp.now().toString("yyyyMMddHHmmssSSS"));
        return data;
    }
}

