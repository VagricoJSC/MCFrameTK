/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.servlet.http.HttpServletRequest
 *  javax.servlet.http.HttpServletResponse
 */
package mcframe.serverCore.atwork;

import java.util.EnumSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mcframe.serverCore.atwork.MCAWAuthLogic;
import mcframe.serverCore.atwork.MCAWCompanyLogic;
import mcframe.serverCore.atwork.MCAWMCSystemDateLogic;
import mcframe.serverCore.atwork.MCAWUserCompanyLogic;
import mcframe.serverCore.atwork.MCAWUserIconLogic;
import mcframe.serverCore.atwork.MCAWUserListLogic;
import mcframe.serverCore.atwork.MCAWUserLogic;
import mcframe.serverCore.atwork.ResponseData;

public enum MCAWDispatcher {
    AUTH{

        @Override
        boolean match(String method) {
            return "auth".equals(method);
        }

        @Override
        public ResponseData execute(HttpServletRequest req, HttpServletResponse res) {
            MCAWAuthLogic logic = new MCAWAuthLogic();
            return logic.execute(req, res);
        }
    }
    ,
    USER{

        @Override
        boolean match(String method) {
            return "user".equals(method);
        }

        @Override
        public ResponseData execute(HttpServletRequest req, HttpServletResponse res) {
            MCAWUserLogic logic = new MCAWUserLogic();
            return logic.execute(req, res);
        }
    }
    ,
    USERCOMPANY{

        @Override
        boolean match(String method) {
            return "usercompany".equals(method);
        }

        @Override
        public ResponseData execute(HttpServletRequest req, HttpServletResponse res) {
            MCAWUserCompanyLogic logic = new MCAWUserCompanyLogic();
            return logic.execute(req, res);
        }
    }
    ,
    COMPANY{

        @Override
        boolean match(String method) {
            return "company".equals(method);
        }

        @Override
        public ResponseData execute(HttpServletRequest req, HttpServletResponse res) {
            MCAWCompanyLogic logic = new MCAWCompanyLogic();
            return logic.execute(req, res);
        }
    }
    ,
    USERLIST{

        @Override
        boolean match(String method) {
            return "userlist".equals(method);
        }

        @Override
        public ResponseData execute(HttpServletRequest req, HttpServletResponse res) {
            MCAWUserListLogic logic = new MCAWUserListLogic();
            return logic.execute(req, res);
        }
    }
    ,
    USERICON{

        @Override
        boolean match(String method) {
            return "usericon".equals(method);
        }

        @Override
        public ResponseData execute(HttpServletRequest req, HttpServletResponse res) {
            MCAWUserIconLogic logic = new MCAWUserIconLogic();
            return logic.execute(req, res);
        }
    }
    ,
    MCSYSDATE{

        @Override
        boolean match(String method) {
            return "mcsystemdate".equals(method);
        }

        @Override
        public ResponseData execute(HttpServletRequest req, HttpServletResponse res) {
            MCAWMCSystemDateLogic logic = new MCAWMCSystemDateLogic();
            return logic.execute(req, res);
        }
    };

    private static final EnumSet<MCAWDispatcher> _all;

    static {
        _all = EnumSet.allOf(MCAWDispatcher.class);
    }

    private MCAWDispatcher() {
    }

    abstract boolean match(String var1);

    public abstract ResponseData execute(HttpServletRequest var1, HttpServletResponse var2);

    public static MCAWDispatcher dispatch(String function) {
        MCAWDispatcher result = null;
        for (MCAWDispatcher logic : _all) {
            if (!logic.match(function)) continue;
            result = logic;
            break;
        }
        return result;
    }

    /* synthetic */ MCAWDispatcher(String string, int n, MCAWDispatcher mCAWDispatcher) {
        this();
    }
}

