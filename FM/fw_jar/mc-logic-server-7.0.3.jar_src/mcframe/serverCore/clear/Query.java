/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.serverCore.dbc.FCT_BINARY_R
 *  mcframe.serverCore.dbc.FCT_PRINT_DAT_R
 *  mcframe.serverCore.dbc.FCT_PRINT_IMG_R
 *  mcframe.serverCore.dbc.FCT_SRV_REQUEST_FILE_R
 *  mcframe.serverCore.dbc.FCT_SRV_REQUEST_R
 *  mcframe.serverCore.dbc.FCW_DELETE_BINARY_R
 *  mcframe.serverCore.queryapi.IFMCFMSQL$MCFMEDColumnGroup
 *  mcframe.serverCore.queryapi.IFMCSQL
 *  mcframe.serverCore.queryapi.IFMCSQL$MCDelete
 *  mcframe.serverCore.queryapi.IFMCSQL$MCDerivedView
 *  mcframe.serverCore.queryapi.IFMCSQL$MCPermView
 *  mcframe.serverCore.queryapi.IFMCSQL$MCStringValue
 *  mcframe.serverCore.queryapi.IFMCSQL$MCSubQuery
 */
package mcframe.serverCore.clear;

import java.util.stream.IntStream;
import mcframe.serverCore.dbc.FCT_BINARY_R;
import mcframe.serverCore.dbc.FCT_PRINT_DAT_R;
import mcframe.serverCore.dbc.FCT_PRINT_IMG_R;
import mcframe.serverCore.dbc.FCT_SRV_REQUEST_FILE_R;
import mcframe.serverCore.dbc.FCT_SRV_REQUEST_R;
import mcframe.serverCore.dbc.FCW_DELETE_BINARY_R;
import mcframe.serverCore.queryapi.IFMCFMSQL;
import mcframe.serverCore.queryapi.IFMCSQL;

public class Query {
    static IFMCSQL.MCDelete clearBinary_D01() {
        FCT_BINARY_R d0 = FCT_BINARY_R.create((String)"T1");
        FCW_DELETE_BINARY_R sub = FCW_DELETE_BINARY_R.create((String)"T2");
        return IFMCSQL.sql((String)"FCBCL0100_ClearBinary_D01").delete((IFMCSQL.MCPermView)d0).where(IFMCSQL.notExists((IFMCSQL.MCSubQuery)IFMCSQL.subQuery().select(new IFMCFMSQL.MCFMEDColumnGroup[]{sub.prAll()}).from((IFMCSQL.MCDerivedView)sub).where(d0.bid.eq((Object)sub.bid))).and(d0.upd_ts.lt((Object)IFMCSQL.bind((String)"timestamp"))));
    }

    static IFMCSQL.MCDelete clearPrintData_D01() {
        FCT_PRINT_DAT_R d01 = FCT_PRINT_DAT_R.create((String)"T");
        return IFMCSQL.sql((String)"FCBCL0100_ClearPrintData_D01").delete((IFMCSQL.MCPermView)d01).where(d01.print_dt.lt((Object)IFMCSQL.bind((String)"date")).and(d01.persistent.eq((Object)IFMCSQL.bind((String)"persistent"))));
    }

    static IFMCSQL.MCDelete clearPrintData_D02() {
        FCT_PRINT_IMG_R d01 = FCT_PRINT_IMG_R.create((String)"T1");
        FCT_PRINT_DAT_R sub = FCT_PRINT_DAT_R.create((String)"T2");
        return IFMCSQL.sql((String)"FCBCL0100_ClearPrintData_D02").delete((IFMCSQL.MCPermView)d01).where(IFMCSQL.exists((IFMCSQL.MCSubQuery)IFMCSQL.subQuery().select(new IFMCFMSQL.MCFMEDColumnGroup[]{sub.prAll()}).from((IFMCSQL.MCDerivedView)sub).where(sub.print_dt.lt((Object)IFMCSQL.bind((String)"date")).and(sub.persistent.eq((Object)IFMCSQL.bind((String)"persistent")).and(sub.print_seq.eq((Object)d01.print_seq))))));
    }

    static IFMCSQL.MCDelete clearSrvRequestFile_D01() {
        FCT_SRV_REQUEST_FILE_R d0 = FCT_SRV_REQUEST_FILE_R.create((String)"T1");
        FCT_SRV_REQUEST_R sub = FCT_SRV_REQUEST_R.create((String)"T2");
        return IFMCSQL.sql((String)"FCBCL0100_ClearSrvRequestFile_D01").delete((IFMCSQL.MCPermView)d0).where(d0.srv_req_no.in((IFMCSQL.MCSubQuery)IFMCSQL.subQuery().select(new IFMCFMSQL.MCFMEDColumnGroup[]{sub.srv_req_no}).from((IFMCSQL.MCDerivedView)sub).where(IFMCSQL.value((int)0).eq((Object)IFMCSQL.value((int)0)).and(sub.end_dt.lt((Object)IFMCSQL.bind((String)"date"))).and(sub.status.neq((Object)IFMCSQL.bind((String)"status"))))));
    }

    static IFMCSQL.MCDelete clearSrvRequest_D01() {
        FCT_SRV_REQUEST_R d0 = FCT_SRV_REQUEST_R.create((String)"T");
        return IFMCSQL.sql((String)"FCBCL0100_ClearSrvRequest_D01").delete((IFMCSQL.MCPermView)d0).where(IFMCSQL.value((int)0).eq((Object)IFMCSQL.value((int)0)).and(d0.end_dt.lt((Object)IFMCSQL.bind((String)"date"))).and(d0.status.neq((Object)IFMCSQL.bind((String)"status"))));
    }

    static IFMCSQL.MCSubQuery multiStatus(String ... status) {
        Object[] s = new IFMCSQL.MCStringValue[status.length];
        IntStream.range(0, status.length).forEach(arg_0 -> Query.lambda$0((IFMCSQL.MCStringValue[])s, status, arg_0));
        FCT_SRV_REQUEST_R sub = FCT_SRV_REQUEST_R.create((String)"T2");
        return IFMCSQL.subQuery().select(new IFMCFMSQL.MCFMEDColumnGroup[]{sub.srv_req_no}).from((IFMCSQL.MCDerivedView)sub).where(IFMCSQL.value((int)0).eq((Object)IFMCSQL.value((int)0)).and(sub.end_dt.lt((Object)IFMCSQL.bind((String)"date"))).and(sub.status.in(s)));
    }

    private static /* synthetic */ void lambda$0(IFMCSQL.MCStringValue[] mCStringValueArray, String[] stringArray, int i) {
        IFMCSQL.MCStringValue mCStringValue = IFMCSQL.value((String)stringArray[i]);
    }
}

