/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.core.JsonProcessingException
 *  com.fasterxml.jackson.databind.ObjectMapper
 *  mcframe.commonCore.notice.Core_Msg_FW_A
 *  mcframe.commonCore.notice.MCException
 *  mcframe.commonCore.notice.MCLog
 */
package mcframe.serverCore.atwork;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.LinkedHashMap;
import mcframe.commonCore.notice.Core_Msg_FW_A;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCLog;

public class ResponseData
extends LinkedHashMap<String, Object> {
    private static final long serialVersionUID = 1L;
    private boolean isDownload = false;

    ResponseData() {
    }

    public static ResponseData ok() {
        ResponseData res = new ResponseData();
        res.put("status", "SUCCESS");
        return res;
    }

    public static ResponseData error() {
        ResponseData res = new ResponseData();
        res.put("status", "ERROR");
        return res;
    }

    public ResponseData setProperty(String key, Object value) {
        this.put(key, value);
        return this;
    }

    public String toJson() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString((Object)this);
        }
        catch (JsonProcessingException e) {
            MCLog.write((Throwable)new MCException((Throwable)e, Core_Msg_FW_A.FCBGC1300, new Object[0]));
            return "{\"status\": \"ERROR\"}";
        }
    }

    public void setDownloadData(byte[] data) {
        this.isDownload = true;
        this.setProperty("download", data);
    }

    public boolean isDownload() {
        return this.isDownload;
    }
}

