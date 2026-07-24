/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.lang.MCNumber
 *  mcframe.commonCore.lang.MCTimestamp
 *  mcframe.commonCore.resource.ctrl.MCResource
 */
package mcframe.serverCore.stateless;

import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.resource.ctrl.MCResource;

public class MCStatelessContext {
    private final String requestNo;
    private int reqseq = -1;
    private final String clientid;
    private final String userid;
    private String loginseq = "";
    private final Locale locale;
    private final TimeZone timezone;
    private final String reqsrcid;
    private MCTimestamp createdTime;
    private final MCNumber limitDlSize;
    private final String extArgs;
    private final String userpw;
    private String cocd;
    private String extAttr1;
    private String extAttr2;
    private String extAttr3;

    protected MCStatelessContext(String requestNo, boolean subReqNo, String clientID, MCTimestamp createdTime, String userID, String password, String locale, String timezone, String sourceID, String coCD, String extAttr1, String extAttr2, String extAttr3) {
        this.requestNo = requestNo != null ? requestNo : String.valueOf(new Date().getTime());
        this.reqseq = subReqNo ? 0 : -1;
        this.clientid = clientID;
        this.createdTime = createdTime;
        this.limitDlSize = MCNumber.valueOf((int)-1);
        this.userid = userID;
        this.locale = locale != null ? MCResource.convLocale((String)locale) : Locale.getDefault();
        this.timezone = timezone != null ? TimeZone.getTimeZone(timezone) : TimeZone.getDefault();
        this.reqsrcid = sourceID;
        this.extArgs = null;
        this.userpw = password;
        this.cocd = coCD;
        this.extAttr1 = extAttr1;
        this.extAttr2 = extAttr2;
        this.extAttr3 = extAttr3;
    }

    public String requestNo() {
        return this.reqseq < 0 ? this.requestNo : String.valueOf(this.requestNo) + '$' + this.reqseq++;
    }

    public String clientID() {
        return this.clientid;
    }

    public String userID() {
        return this.userid;
    }

    public String loginSequence() {
        return this.loginseq;
    }

    protected void loginSequence(String loginseq) {
        this.loginseq = loginseq;
    }

    public Locale locale() {
        return this.locale;
    }

    public TimeZone timezone() {
        return this.timezone;
    }

    public String reqSrcID() {
        return this.reqsrcid;
    }

    public MCTimestamp createdTime() {
        return this.createdTime;
    }

    protected void createdTime(MCTimestamp createdTime) {
        this.createdTime = createdTime;
    }

    public MCNumber limitDlSize() {
        return this.limitDlSize;
    }

    public String extArgs() {
        return this.extArgs;
    }

    public String userPassword() {
        return this.userpw;
    }

    public String coCD() {
        return this.cocd;
    }

    public void coCD(String cocd) {
        this.cocd = cocd;
    }

    public String extAttr1() {
        return this.extAttr1;
    }

    public void extAttr1(String extAttr1) {
        this.extAttr1 = extAttr1;
    }

    public String extAttr2() {
        return this.extAttr2;
    }

    public void extAttr2(String extAttr2) {
        this.extAttr2 = extAttr2;
    }

    public String extAttr3() {
        return this.extAttr3;
    }

    public void extAttr3(String extAttr3) {
        this.extAttr3 = extAttr3;
    }

    public boolean isLogin() {
        return this.loginseq != null && this.loginseq.length() > 0;
    }
}

