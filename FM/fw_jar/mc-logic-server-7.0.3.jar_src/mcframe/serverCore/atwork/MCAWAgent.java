/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.jwt.MCJWT
 *  mcframe.commonCore.jwt.MCJwtException
 *  mcframe.commonCore.jwt.MCJwtToken
 *  mcframe.commonCore.notice.Core_Msg_FW_A
 *  mcframe.commonCore.notice.MCException
 *  mcframe.serverCore.resource.MCConfig
 *  mcframe.serverCore.resource.MCConst
 *  mcframe.serverCore.sys.MCSys
 */
package mcframe.serverCore.atwork;

import mcframe.commonCore.jwt.MCJWT;
import mcframe.commonCore.jwt.MCJwtException;
import mcframe.commonCore.jwt.MCJwtToken;
import mcframe.commonCore.notice.Core_Msg_FW_A;
import mcframe.commonCore.notice.MCException;
import mcframe.serverCore.resource.MCConfig;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.sys.MCSys;

public class MCAWAgent {
    private static final String KEY_TYPE = MCConfig.createKey((String[])new String[]{"communication", "type"});
    private static final String KEY_TOKEN_PERIOD = MCConst.createKey((String[])new String[]{"communication", "token", "period"});
    private static final String KEY_TOKEN_EXCLUDEDATE = MCConst.createKey((String[])new String[]{"communication", "token", "excludedate"});

    public static String getUrl() {
        String result = null;
        String type = MCConfig.common.getString(KEY_TYPE);
        if ("1".equals(type)) {
            result = MCConfig.common.getString(MCConfig.createKey((String[])new String[]{"communication", "url"}));
        } else if ("2".equals(type)) {
            result = MCConfig.common.getString(MCConfig.createKey((String[])new String[]{"communication", MCSys.user.coCD(), "url"}));
        }
        if (result != null && !result.endsWith("/")) {
            result = String.valueOf(result) + "/";
        }
        return result;
    }

    public static String issueToken(String userId) {
        try {
            int period = MCConst.app.getInteger(KEY_TOKEN_PERIOD, 3);
            MCJWT jwt = MCJWT.jwt((long)(period * 24 * 60 * 60));
            return jwt.setSystemId(MCSys.catalog.systemid()).setCoCd(MCSys.user.coCD()).setUserId(userId).encode();
        }
        catch (MCJwtException e) {
            throw new MCException((Throwable)e, Core_Msg_FW_A.FCBGC1301, new Object[0]);
        }
    }

    public static String issueToken() {
        return MCAWAgent.issueToken(MCSys.user.ID());
    }

    static MCJwtToken verifyToken(String token) {
        try {
            return MCJWT.decode((String)token, (String)MCConst.app.getString(KEY_TOKEN_EXCLUDEDATE));
        }
        catch (MCJwtException e) {
            throw new MCException((Throwable)e, Core_Msg_FW_A.FCBGC1302, new Object[0]);
        }
    }
}

