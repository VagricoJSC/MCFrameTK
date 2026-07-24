/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.servlet.http.HttpServletRequest
 *  javax.servlet.http.HttpServletResponse
 */
package mcframe.serverCore.atwork;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mcframe.serverCore.atwork.ResponseData;

public abstract class MCAWLogic {
    public abstract ResponseData execute(HttpServletRequest var1, HttpServletResponse var2);
}

