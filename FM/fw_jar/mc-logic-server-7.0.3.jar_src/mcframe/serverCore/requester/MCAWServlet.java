/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.servlet.Servlet
 *  javax.servlet.ServletException
 *  javax.servlet.annotation.WebServlet
 *  javax.servlet.http.HttpServlet
 *  javax.servlet.http.HttpServletRequest
 *  javax.servlet.http.HttpServletResponse
 *  mcframe.commonCore.notice.MCException
 *  mcframe.commonCore.notice.MCLog
 *  mcframe.serverCore.mcjdbc.MCTransactionManager
 */
package mcframe.serverCore.requester;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCLog;
import mcframe.serverCore.atwork.MCAWCocdResolver;
import mcframe.serverCore.atwork.MCAWDispatcher;
import mcframe.serverCore.atwork.ResponseData;
import mcframe.serverCore.mcjdbc.MCTransactionManager;

@WebServlet(name="MCAWServlet", urlPatterns={"/MCAWServlet"}, loadOnStartup=4)
public class MCAWServlet
extends HttpServlet
implements Servlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");
        Throwable throwable = null;
        Object var4_5 = null;
        try (PrintWriter out = res.getWriter();){
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"ja\">");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>MCAWServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>MCFrame awserver start SUCCESS.</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        catch (Throwable throwable2) {
            if (throwable == null) {
                throwable = throwable2;
            } else if (throwable != throwable2) {
                throwable.addSuppressed(throwable2);
            }
            throw throwable;
        }
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        this.initThreadLocal();
        req.setCharacterEncoding("UTF-8");
        ResponseData data = null;
        try {
            try {
                MCAWDispatcher logic = MCAWDispatcher.dispatch(req.getParameter("aw_method"));
                data = logic.execute(req, res);
            }
            catch (Throwable throwable) {
                try {
                    MCTransactionManager.finalClose();
                }
                catch (MCException mCException) {}
                throw throwable;
            }
            try {
                MCTransactionManager.finalClose();
            }
            catch (MCException mCException) {}
        }
        catch (MCException e) {
            MCLog.write((Throwable)e);
            data = ResponseData.error();
        }
        catch (Throwable t) {
            MCLog.write((Throwable)t);
            data = ResponseData.error();
        }
        this.writeResponse(res, data);
    }

    private void initThreadLocal() {
        MCAWCocdResolver.init();
    }

    private void writeResponse(HttpServletResponse res, ResponseData data) throws IOException {
        res.setContentType("application/json; charset=UTF-8");
        res.setHeader("Access-Control-Allow-Origin", "*");
        res.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS");
        res.setHeader("Access-Control-Allow-Headers", "X-ATWORK-USER,Content-Type,Authorization");
        Throwable throwable = null;
        Object var4_5 = null;
        try (PrintWriter out = res.getWriter();){
            out.println(data.toJson());
        }
        catch (Throwable throwable2) {
            if (throwable == null) {
                throwable = throwable2;
            } else if (throwable != throwable2) {
                throwable.addSuppressed(throwable2);
            }
            throw throwable;
        }
    }
}

