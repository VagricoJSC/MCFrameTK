package mcframe.serverMA.dbc;

import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCTimestampPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "業務理由マスタビュー // Business reason master view"DBコンテナRowクラスです。<p>
 *
 * <br>
 *
 * <table border=1 cellspacing=0 cellpadding=2 >
 *  <caption>[項目定義]</caption>
 * 	<tr bgcolor="#cccccc">
 *  	<th>区分</th>
 *  	<th>項目名</th>
 *  	<th>型</th>
 *  	<th>桁</th>
 *  	<th>Null</th>
 *  	<th>別名/参照先</th>
 *  	<th>日本語</th>
 *  	<th>フルネーム</th>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>biz_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>業務理由ＣＤ</td>
 *  	<td>Business reason cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>biz_rsn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>業務理由名</td>
 *  	<td>Business reason name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計理由ＣＤ</td>
 *  	<td>Accounting reason cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入ＦＬＧ</td>
 *  	<td>Purchase flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_sort_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入ソート順</td>
 *  	<td>Purchase sort order</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_rtn_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入返品ＦＬＧ</td>
 *  	<td>Purchase return flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_rtn_sort_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入返品ソート順</td>
 *  	<td>Purchase return sort order</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xpns_purc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>経費購買ＦＬＧ</td>
 *  	<td>Expenses purchasing flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_xpns_purc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注紐付経費購買ＦＬＧ</td>
 *  	<td>Expense purchase (pegged to sales order) flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_dscnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入調整ＦＬＧ</td>
 *  	<td>Purchase adjustment flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_dscnt_loc_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入調整管轄区分</td>
 *  	<td>Purchase adjustment controlling site type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_dscnt_sort_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入調整ソート順</td>
 *  	<td>Purchase adjustment sort order</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上ＦＬＧ</td>
 *  	<td>Sales flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_sort_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上ソート順</td>
 *  	<td>Sales sort order</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_rtn_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上返品ＦＬＧ</td>
 *  	<td>Sales return flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_rtn_sort_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上返品ソート順</td>
 *  	<td>Sales return sort order</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_acxfr_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>販売他勘定ＦＬＧ</td>
 *  	<td>Sales other accounting flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_dscnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上調整ＦＬＧ</td>
 *  	<td>Sales adjustment flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_dscnt_sort_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上調整ソート順</td>
 *  	<td>Sales adjustment sort order</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>acxfr_gr_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>他勘定入庫ＦＬＧ</td>
 *  	<td>Other accounting GR flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>acxfr_gr_sort_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>他勘定入庫ソート順</td>
 *  	<td>Other accounting GR sort order</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>acxfr_gi_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>他勘定出庫ＦＬＧ</td>
 *  	<td>Other accounting GI flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>acxfr_gi_sort_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>他勘定出庫ソート順</td>
 *  	<td>Other accounting GI sort order</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_acxfr_sort_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>投入他勘定ソート順</td>
 *  	<td>Input other accounting sort order</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>disp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>廃棄ＦＬＧ</td>
 *  	<td>Disposal flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>disp_sort_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>廃棄ソート順</td>
 *  	<td>Disposal sort order</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_xfr_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫振替ＦＬＧ</td>
 *  	<td>Inventory transfer flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_xfr_sort_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫振替ソート順</td>
 *  	<td>Inventory transfer sort order</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xfr_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>移送ＦＬＧ</td>
 *  	<td>Transport flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xfr_sort_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>移送ソート順</td>
 *  	<td>Transport sort order</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>yield_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出来高ＦＬＧ</td>
 *  	<td>Output flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>yield_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出来高区分</td>
 *  	<td>Output type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>yield_sort_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出来高ソート順</td>
 *  	<td>Output sort order</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>not_stk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>非在庫ＦＬＧ</td>
 *  	<td>MRO supply flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loss_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロスＦＬＧ</td>
 *  	<td>Loss flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fxd_loss_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>固定ロスＦＬＧ</td>
 *  	<td>Constant loss flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>not_lot_trace_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロットトレース対象外ＦＬＧ</td>
 *  	<td>Not for lot trace flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入ＦＬＧ</td>
 *  	<td>Input flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inpt_sort_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>投入ソート順</td>
 *  	<td>Input sort order</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dfct_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査不良ＦＬＧ</td>
 *  	<td>Inspection defective flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dfct_sort_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査不良ソート順</td>
 *  	<td>Inspection defective sort order</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１</td>
 *  	<td>Memo 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２</td>
 *  	<td>Memo 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ３</td>
 *  	<td>Memo 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>論理削除ＦＬＧ</td>
 *  	<td>Logical delete flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザＩＤ</td>
 *  	<td>Logical delete user ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザ名</td>
 *  	<td>Logical delete user name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除日時</td>
 *  	<td>Logical delete date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ins_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録ユーザＩＤ</td>
 *  	<td>Entry user ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ins_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録ユーザ名</td>
 *  	<td>Entry user name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ins_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録日時</td>
 *  	<td>Entry date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ins_func_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録機能ＩＤ</td>
 *  	<td>Entry function ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_cntr</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新カウンタ</td>
 *  	<td>Update counter</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新ユーザＩＤ</td>
 *  	<td>Update user ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新ユーザ名</td>
 *  	<td>Update user name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新日時</td>
 *  	<td>Update date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_func_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新機能ＩＤ</td>
 *  	<td>Update function ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_srv_req_no</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新リクエストＮＯ</td>
 *  	<td>Update request No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>co_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会社ＣＤ</td>
 *  	<td>Company cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>biz_rsn_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務理由名（ロケール１）</td>
 *  	<td>Business reason name (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>biz_rsn_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務理由名（ロケール２）</td>
 *  	<td>Business reason name (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>biz_rsn_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務理由名（ロケール３）</td>
 *  	<td>Business reason name (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>biz_rsn_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務理由名（ロケール４）</td>
 *  	<td>Business reason name (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>biz_rsn_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務理由名（ロケール５）</td>
 *  	<td>Business reason name (Locale 5)</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAVM_BIZ_RSN_MST_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_BIZ_RSN_MST";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 業務理由ＣＤ. Business reason cd..<p>
	 *
	 */
	public static final String $biz_rsn_cd = "biz_rsn_cd";
	private static final MCPermColumnInfo _biz_rsn_cd = createColumnInfo("biz_rsn_cd");
	public final MCStringPermColumn biz_rsn_cd = createStringColumn(_biz_rsn_cd);
	
	/**
	 * 業務理由名. Business reason name.<p>
	 *
	 */
	public static final String $biz_rsn_nm = "biz_rsn_nm";
	private static final MCPermColumnInfo _biz_rsn_nm = createColumnInfo("biz_rsn_nm");
	public final MCStringPermColumn biz_rsn_nm = createStringColumn(_biz_rsn_nm);
	
	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	private static final MCPermColumnInfo _ac_rsn_cd = createColumnInfo("ac_rsn_cd");
	public final MCStringPermColumn ac_rsn_cd = createStringColumn(_ac_rsn_cd);
	
	/**
	 * 仕入ＦＬＧ. Purchase flg..<p>
	 *
	 */
	public static final String $purc_flg = "purc_flg";
	private static final MCPermColumnInfo _purc_flg = createColumnInfo("purc_flg");
	public final MCBooleanPermColumn purc_flg = createBooleanColumn(_purc_flg);
	
	/**
	 * 仕入ソート順. Purchase sort order.<p>
	 *
	 */
	public static final String $purc_sort_seq = "purc_sort_seq";
	private static final MCPermColumnInfo _purc_sort_seq = createColumnInfo("purc_sort_seq");
	public final MCNumberPermColumn purc_sort_seq = createNumberColumn(_purc_sort_seq);
	
	/**
	 * 仕入返品ＦＬＧ. Purchase return flg..<p>
	 *
	 */
	public static final String $purc_rtn_flg = "purc_rtn_flg";
	private static final MCPermColumnInfo _purc_rtn_flg = createColumnInfo("purc_rtn_flg");
	public final MCBooleanPermColumn purc_rtn_flg = createBooleanColumn(_purc_rtn_flg);
	
	/**
	 * 仕入返品ソート順. Purchase return sort order.<p>
	 *
	 */
	public static final String $purc_rtn_sort_seq = "purc_rtn_sort_seq";
	private static final MCPermColumnInfo _purc_rtn_sort_seq = createColumnInfo("purc_rtn_sort_seq");
	public final MCNumberPermColumn purc_rtn_sort_seq = createNumberColumn(_purc_rtn_sort_seq);
	
	/**
	 * 経費購買ＦＬＧ. Expenses purchasing flg..<p>
	 *
	 */
	public static final String $xpns_purc_flg = "xpns_purc_flg";
	private static final MCPermColumnInfo _xpns_purc_flg = createColumnInfo("xpns_purc_flg");
	public final MCBooleanPermColumn xpns_purc_flg = createBooleanColumn(_xpns_purc_flg);
	
	/**
	 * 受注紐付経費購買ＦＬＧ. Expense purchase (pegged to sales order) flg..<p>
	 *
	 */
	public static final String $slo_xpns_purc_flg = "slo_xpns_purc_flg";
	private static final MCPermColumnInfo _slo_xpns_purc_flg = createColumnInfo("slo_xpns_purc_flg");
	public final MCBooleanPermColumn slo_xpns_purc_flg = createBooleanColumn(_slo_xpns_purc_flg);
	
	/**
	 * 仕入調整ＦＬＧ. Purchase adjustment flg..<p>
	 *
	 */
	public static final String $purc_dscnt_flg = "purc_dscnt_flg";
	private static final MCPermColumnInfo _purc_dscnt_flg = createColumnInfo("purc_dscnt_flg");
	public final MCBooleanPermColumn purc_dscnt_flg = createBooleanColumn(_purc_dscnt_flg);
	
	/**
	 * 仕入調整管轄区分. Purchase adjustment controlling site type.<p>
	 *
	 */
	public static final String $purc_dscnt_loc_mng_typ = "purc_dscnt_loc_mng_typ";
	private static final MCPermColumnInfo _purc_dscnt_loc_mng_typ = createColumnInfo("purc_dscnt_loc_mng_typ");
	public final MCStringPermColumn purc_dscnt_loc_mng_typ = createStringColumn(_purc_dscnt_loc_mng_typ);
	
	/**
	 * 仕入調整ソート順. Purchase adjustment sort order.<p>
	 *
	 */
	public static final String $purc_dscnt_sort_seq = "purc_dscnt_sort_seq";
	private static final MCPermColumnInfo _purc_dscnt_sort_seq = createColumnInfo("purc_dscnt_sort_seq");
	public final MCNumberPermColumn purc_dscnt_sort_seq = createNumberColumn(_purc_dscnt_sort_seq);
	
	/**
	 * 売上ＦＬＧ. Sales flg..<p>
	 *
	 */
	public static final String $sls_flg = "sls_flg";
	private static final MCPermColumnInfo _sls_flg = createColumnInfo("sls_flg");
	public final MCBooleanPermColumn sls_flg = createBooleanColumn(_sls_flg);
	
	/**
	 * 売上ソート順. Sales sort order.<p>
	 *
	 */
	public static final String $sls_sort_seq = "sls_sort_seq";
	private static final MCPermColumnInfo _sls_sort_seq = createColumnInfo("sls_sort_seq");
	public final MCNumberPermColumn sls_sort_seq = createNumberColumn(_sls_sort_seq);
	
	/**
	 * 売上返品ＦＬＧ. Sales return flg..<p>
	 *
	 */
	public static final String $sls_rtn_flg = "sls_rtn_flg";
	private static final MCPermColumnInfo _sls_rtn_flg = createColumnInfo("sls_rtn_flg");
	public final MCBooleanPermColumn sls_rtn_flg = createBooleanColumn(_sls_rtn_flg);
	
	/**
	 * 売上返品ソート順. Sales return sort order.<p>
	 *
	 */
	public static final String $sls_rtn_sort_seq = "sls_rtn_sort_seq";
	private static final MCPermColumnInfo _sls_rtn_sort_seq = createColumnInfo("sls_rtn_sort_seq");
	public final MCNumberPermColumn sls_rtn_sort_seq = createNumberColumn(_sls_rtn_sort_seq);
	
	/**
	 * 販売他勘定ＦＬＧ. Sales other accounting flg..<p>
	 *
	 */
	public static final String $sls_acxfr_flg = "sls_acxfr_flg";
	private static final MCPermColumnInfo _sls_acxfr_flg = createColumnInfo("sls_acxfr_flg");
	public final MCBooleanPermColumn sls_acxfr_flg = createBooleanColumn(_sls_acxfr_flg);
	
	/**
	 * 売上調整ＦＬＧ. Sales adjustment flg..<p>
	 *
	 */
	public static final String $sls_dscnt_flg = "sls_dscnt_flg";
	private static final MCPermColumnInfo _sls_dscnt_flg = createColumnInfo("sls_dscnt_flg");
	public final MCBooleanPermColumn sls_dscnt_flg = createBooleanColumn(_sls_dscnt_flg);
	
	/**
	 * 売上調整ソート順. Sales adjustment sort order.<p>
	 *
	 */
	public static final String $sls_dscnt_sort_seq = "sls_dscnt_sort_seq";
	private static final MCPermColumnInfo _sls_dscnt_sort_seq = createColumnInfo("sls_dscnt_sort_seq");
	public final MCNumberPermColumn sls_dscnt_sort_seq = createNumberColumn(_sls_dscnt_sort_seq);
	
	/**
	 * 他勘定入庫ＦＬＧ. Other accounting GR flg..<p>
	 *
	 */
	public static final String $acxfr_gr_flg = "acxfr_gr_flg";
	private static final MCPermColumnInfo _acxfr_gr_flg = createColumnInfo("acxfr_gr_flg");
	public final MCBooleanPermColumn acxfr_gr_flg = createBooleanColumn(_acxfr_gr_flg);
	
	/**
	 * 他勘定入庫ソート順. Other accounting GR sort order.<p>
	 *
	 */
	public static final String $acxfr_gr_sort_seq = "acxfr_gr_sort_seq";
	private static final MCPermColumnInfo _acxfr_gr_sort_seq = createColumnInfo("acxfr_gr_sort_seq");
	public final MCNumberPermColumn acxfr_gr_sort_seq = createNumberColumn(_acxfr_gr_sort_seq);
	
	/**
	 * 他勘定出庫ＦＬＧ. Other accounting GI flg..<p>
	 *
	 */
	public static final String $acxfr_gi_flg = "acxfr_gi_flg";
	private static final MCPermColumnInfo _acxfr_gi_flg = createColumnInfo("acxfr_gi_flg");
	public final MCBooleanPermColumn acxfr_gi_flg = createBooleanColumn(_acxfr_gi_flg);
	
	/**
	 * 他勘定出庫ソート順. Other accounting GI sort order.<p>
	 *
	 */
	public static final String $acxfr_gi_sort_seq = "acxfr_gi_sort_seq";
	private static final MCPermColumnInfo _acxfr_gi_sort_seq = createColumnInfo("acxfr_gi_sort_seq");
	public final MCNumberPermColumn acxfr_gi_sort_seq = createNumberColumn(_acxfr_gi_sort_seq);
	
	/**
	 * 投入他勘定ソート順. Input other accounting sort order.<p>
	 *
	 */
	public static final String $inpt_acxfr_sort_seq = "inpt_acxfr_sort_seq";
	private static final MCPermColumnInfo _inpt_acxfr_sort_seq = createColumnInfo("inpt_acxfr_sort_seq");
	public final MCNumberPermColumn inpt_acxfr_sort_seq = createNumberColumn(_inpt_acxfr_sort_seq);
	
	/**
	 * 廃棄ＦＬＧ. Disposal flg..<p>
	 *
	 */
	public static final String $disp_flg = "disp_flg";
	private static final MCPermColumnInfo _disp_flg = createColumnInfo("disp_flg");
	public final MCBooleanPermColumn disp_flg = createBooleanColumn(_disp_flg);
	
	/**
	 * 廃棄ソート順. Disposal sort order.<p>
	 *
	 */
	public static final String $disp_sort_seq = "disp_sort_seq";
	private static final MCPermColumnInfo _disp_sort_seq = createColumnInfo("disp_sort_seq");
	public final MCNumberPermColumn disp_sort_seq = createNumberColumn(_disp_sort_seq);
	
	/**
	 * 在庫振替ＦＬＧ. Inventory transfer flg..<p>
	 *
	 */
	public static final String $stk_xfr_flg = "stk_xfr_flg";
	private static final MCPermColumnInfo _stk_xfr_flg = createColumnInfo("stk_xfr_flg");
	public final MCBooleanPermColumn stk_xfr_flg = createBooleanColumn(_stk_xfr_flg);
	
	/**
	 * 在庫振替ソート順. Inventory transfer sort order.<p>
	 *
	 */
	public static final String $stk_xfr_sort_seq = "stk_xfr_sort_seq";
	private static final MCPermColumnInfo _stk_xfr_sort_seq = createColumnInfo("stk_xfr_sort_seq");
	public final MCNumberPermColumn stk_xfr_sort_seq = createNumberColumn(_stk_xfr_sort_seq);
	
	/**
	 * 移送ＦＬＧ. Transport flg..<p>
	 *
	 */
	public static final String $xfr_flg = "xfr_flg";
	private static final MCPermColumnInfo _xfr_flg = createColumnInfo("xfr_flg");
	public final MCBooleanPermColumn xfr_flg = createBooleanColumn(_xfr_flg);
	
	/**
	 * 移送ソート順. Transport sort order.<p>
	 *
	 */
	public static final String $xfr_sort_seq = "xfr_sort_seq";
	private static final MCPermColumnInfo _xfr_sort_seq = createColumnInfo("xfr_sort_seq");
	public final MCNumberPermColumn xfr_sort_seq = createNumberColumn(_xfr_sort_seq);
	
	/**
	 * 出来高ＦＬＧ. Output flg..<p>
	 *
	 */
	public static final String $yield_flg = "yield_flg";
	private static final MCPermColumnInfo _yield_flg = createColumnInfo("yield_flg");
	public final MCBooleanPermColumn yield_flg = createBooleanColumn(_yield_flg);
	
	/**
	 * 出来高区分. Output type.<p>
	 *
	 */
	public static final String $yield_typ = "yield_typ";
	private static final MCPermColumnInfo _yield_typ = createColumnInfo("yield_typ");
	public final MCStringPermColumn yield_typ = createStringColumn(_yield_typ);
	
	/**
	 * 出来高ソート順. Output sort order.<p>
	 *
	 */
	public static final String $yield_sort_seq = "yield_sort_seq";
	private static final MCPermColumnInfo _yield_sort_seq = createColumnInfo("yield_sort_seq");
	public final MCNumberPermColumn yield_sort_seq = createNumberColumn(_yield_sort_seq);
	
	/**
	 * 非在庫ＦＬＧ. MRO supply flg..<p>
	 *
	 */
	public static final String $not_stk_flg = "not_stk_flg";
	private static final MCPermColumnInfo _not_stk_flg = createColumnInfo("not_stk_flg");
	public final MCBooleanPermColumn not_stk_flg = createBooleanColumn(_not_stk_flg);
	
	/**
	 * ロスＦＬＧ. Loss flg..<p>
	 *
	 */
	public static final String $loss_flg = "loss_flg";
	private static final MCPermColumnInfo _loss_flg = createColumnInfo("loss_flg");
	public final MCBooleanPermColumn loss_flg = createBooleanColumn(_loss_flg);
	
	/**
	 * 固定ロスＦＬＧ. Constant loss flg..<p>
	 *
	 */
	public static final String $fxd_loss_flg = "fxd_loss_flg";
	private static final MCPermColumnInfo _fxd_loss_flg = createColumnInfo("fxd_loss_flg");
	public final MCBooleanPermColumn fxd_loss_flg = createBooleanColumn(_fxd_loss_flg);
	
	/**
	 * ロットトレース対象外ＦＬＧ. Not for lot trace flg..<p>
	 *
	 */
	public static final String $not_lot_trace_flg = "not_lot_trace_flg";
	private static final MCPermColumnInfo _not_lot_trace_flg = createColumnInfo("not_lot_trace_flg");
	public final MCBooleanPermColumn not_lot_trace_flg = createBooleanColumn(_not_lot_trace_flg);
	
	/**
	 * 投入ＦＬＧ. Input flg..<p>
	 *
	 */
	public static final String $inpt_flg = "inpt_flg";
	private static final MCPermColumnInfo _inpt_flg = createColumnInfo("inpt_flg");
	public final MCBooleanPermColumn inpt_flg = createBooleanColumn(_inpt_flg);
	
	/**
	 * 投入ソート順. Input sort order.<p>
	 *
	 */
	public static final String $inpt_sort_seq = "inpt_sort_seq";
	private static final MCPermColumnInfo _inpt_sort_seq = createColumnInfo("inpt_sort_seq");
	public final MCNumberPermColumn inpt_sort_seq = createNumberColumn(_inpt_sort_seq);
	
	/**
	 * 検査不良ＦＬＧ. Inspection defective flg..<p>
	 *
	 */
	public static final String $dfct_flg = "dfct_flg";
	private static final MCPermColumnInfo _dfct_flg = createColumnInfo("dfct_flg");
	public final MCBooleanPermColumn dfct_flg = createBooleanColumn(_dfct_flg);
	
	/**
	 * 検査不良ソート順. Inspection defective sort order.<p>
	 *
	 */
	public static final String $dfct_sort_seq = "dfct_sort_seq";
	private static final MCPermColumnInfo _dfct_sort_seq = createColumnInfo("dfct_sort_seq");
	public final MCNumberPermColumn dfct_sort_seq = createNumberColumn(_dfct_sort_seq);
	
	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	private static final MCPermColumnInfo _memo1 = createColumnInfo("memo1");
	public final MCStringPermColumn memo1 = createStringColumn(_memo1);
	
	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	private static final MCPermColumnInfo _memo2 = createColumnInfo("memo2");
	public final MCStringPermColumn memo2 = createStringColumn(_memo2);
	
	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	private static final MCPermColumnInfo _memo3 = createColumnInfo("memo3");
	public final MCStringPermColumn memo3 = createStringColumn(_memo3);
	
	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	private static final MCPermColumnInfo _del_flg = createColumnInfo("del_flg");
	public final MCBooleanPermColumn del_flg = createBooleanColumn(_del_flg);
	
	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	private static final MCPermColumnInfo _del_usr_id = createColumnInfo("del_usr_id");
	public final MCStringPermColumn del_usr_id = createStringColumn(_del_usr_id);
	
	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	private static final MCPermColumnInfo _del_usr_nm = createColumnInfo("del_usr_nm");
	public final MCStringPermColumn del_usr_nm = createStringColumn(_del_usr_nm);
	
	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";
	private static final MCPermColumnInfo _del_ts = createColumnInfo("del_ts");
	public final MCTimestampPermColumn del_ts = createTimestampColumn(_del_ts);
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	private static final MCPermColumnInfo _ins_usr_id = createColumnInfo("ins_usr_id");
	public final MCStringPermColumn ins_usr_id = createStringColumn(_ins_usr_id);
	
	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	private static final MCPermColumnInfo _ins_usr_nm = createColumnInfo("ins_usr_nm");
	public final MCStringPermColumn ins_usr_nm = createStringColumn(_ins_usr_nm);
	
	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	private static final MCPermColumnInfo _ins_ts = createColumnInfo("ins_ts");
	public final MCTimestampPermColumn ins_ts = createTimestampColumn(_ins_ts);
	
	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	private static final MCPermColumnInfo _ins_func_id = createColumnInfo("ins_func_id");
	public final MCStringPermColumn ins_func_id = createStringColumn(_ins_func_id);
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	private static final MCPermColumnInfo _upd_cntr = createColumnInfo("upd_cntr");
	public final MCNumberPermColumn upd_cntr = createNumberColumn(_upd_cntr);
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	private static final MCPermColumnInfo _upd_usr_id = createColumnInfo("upd_usr_id");
	public final MCStringPermColumn upd_usr_id = createStringColumn(_upd_usr_id);
	
	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	private static final MCPermColumnInfo _upd_usr_nm = createColumnInfo("upd_usr_nm");
	public final MCStringPermColumn upd_usr_nm = createStringColumn(_upd_usr_nm);
	
	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	private static final MCPermColumnInfo _upd_ts = createColumnInfo("upd_ts");
	public final MCTimestampPermColumn upd_ts = createTimestampColumn(_upd_ts);
	
	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	private static final MCPermColumnInfo _upd_func_id = createColumnInfo("upd_func_id");
	public final MCStringPermColumn upd_func_id = createStringColumn(_upd_func_id);
	
	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	private static final MCPermColumnInfo _upd_srv_req_no = createColumnInfo("upd_srv_req_no");
	public final MCStringPermColumn upd_srv_req_no = createStringColumn(_upd_srv_req_no);
	
	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	private static final MCPermColumnInfo _co_cd = createColumnInfo("co_cd");
	public final MCStringPermColumn co_cd = createStringColumn(_co_cd);
	
	/**
	 * 業務理由名（ロケール１）. Business reason name (Locale 1).<p>
	 *
	 */
	public static final String $biz_rsn_nm_lcl1 = "biz_rsn_nm_lcl1";
	private static final MCPermColumnInfo _biz_rsn_nm_lcl1 = createColumnInfo("biz_rsn_nm_lcl1");
	public final MCStringPermColumn biz_rsn_nm_lcl1 = createStringColumn(_biz_rsn_nm_lcl1);
	
	/**
	 * 業務理由名（ロケール２）. Business reason name (Locale 2).<p>
	 *
	 */
	public static final String $biz_rsn_nm_lcl2 = "biz_rsn_nm_lcl2";
	private static final MCPermColumnInfo _biz_rsn_nm_lcl2 = createColumnInfo("biz_rsn_nm_lcl2");
	public final MCStringPermColumn biz_rsn_nm_lcl2 = createStringColumn(_biz_rsn_nm_lcl2);
	
	/**
	 * 業務理由名（ロケール３）. Business reason name (Locale 3).<p>
	 *
	 */
	public static final String $biz_rsn_nm_lcl3 = "biz_rsn_nm_lcl3";
	private static final MCPermColumnInfo _biz_rsn_nm_lcl3 = createColumnInfo("biz_rsn_nm_lcl3");
	public final MCStringPermColumn biz_rsn_nm_lcl3 = createStringColumn(_biz_rsn_nm_lcl3);
	
	/**
	 * 業務理由名（ロケール４）. Business reason name (Locale 4).<p>
	 *
	 */
	public static final String $biz_rsn_nm_lcl4 = "biz_rsn_nm_lcl4";
	private static final MCPermColumnInfo _biz_rsn_nm_lcl4 = createColumnInfo("biz_rsn_nm_lcl4");
	public final MCStringPermColumn biz_rsn_nm_lcl4 = createStringColumn(_biz_rsn_nm_lcl4);
	
	/**
	 * 業務理由名（ロケール５）. Business reason name (Locale 5).<p>
	 *
	 */
	public static final String $biz_rsn_nm_lcl5 = "biz_rsn_nm_lcl5";
	private static final MCPermColumnInfo _biz_rsn_nm_lcl5 = createColumnInfo("biz_rsn_nm_lcl5");
	public final MCStringPermColumn biz_rsn_nm_lcl5 = createStringColumn(_biz_rsn_nm_lcl5);
	
	public static final MCMeta biz_rsn_cd_META = createCommonMeta($biz_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta biz_rsn_nm_META = createCommonMeta($biz_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_sort_seq_META = createCommonMeta($purc_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta purc_rtn_flg_META = createCommonMeta($purc_rtn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_rtn_sort_seq_META = createCommonMeta($purc_rtn_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta xpns_purc_flg_META = createCommonMeta($xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_xpns_purc_flg_META = createCommonMeta($slo_xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dscnt_flg_META = createCommonMeta($purc_dscnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dscnt_loc_mng_typ_META = createCommonMeta($purc_dscnt_loc_mng_typ, mcframe.commonMA.meta.MA_META.LOC_MNG_TYP);
	public static final MCMeta purc_dscnt_sort_seq_META = createCommonMeta($purc_dscnt_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_sort_seq_META = createCommonMeta($sls_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sls_rtn_flg_META = createCommonMeta($sls_rtn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_rtn_sort_seq_META = createCommonMeta($sls_rtn_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sls_acxfr_flg_META = createCommonMeta($sls_acxfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_dscnt_flg_META = createCommonMeta($sls_dscnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_dscnt_sort_seq_META = createCommonMeta($sls_dscnt_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta acxfr_gr_flg_META = createCommonMeta($acxfr_gr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acxfr_gr_sort_seq_META = createCommonMeta($acxfr_gr_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta acxfr_gi_flg_META = createCommonMeta($acxfr_gi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acxfr_gi_sort_seq_META = createCommonMeta($acxfr_gi_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta inpt_acxfr_sort_seq_META = createCommonMeta($inpt_acxfr_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta disp_flg_META = createCommonMeta($disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_sort_seq_META = createCommonMeta($disp_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta stk_xfr_flg_META = createCommonMeta($stk_xfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_xfr_sort_seq_META = createCommonMeta($stk_xfr_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta xfr_flg_META = createCommonMeta($xfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_sort_seq_META = createCommonMeta($xfr_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta yield_flg_META = createCommonMeta($yield_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yield_typ_META = createCommonMeta($yield_typ, mcframe.commonMA.meta.MA_META.YIELD_TYP);
	public static final MCMeta yield_sort_seq_META = createCommonMeta($yield_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta not_stk_flg_META = createCommonMeta($not_stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loss_flg_META = createCommonMeta($loss_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fxd_loss_flg_META = createCommonMeta($fxd_loss_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_lot_trace_flg_META = createCommonMeta($not_lot_trace_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_flg_META = createCommonMeta($inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_sort_seq_META = createCommonMeta($inpt_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta dfct_flg_META = createCommonMeta($dfct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dfct_sort_seq_META = createCommonMeta($dfct_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta biz_rsn_nm_lcl1_META = createCommonMeta($biz_rsn_nm_lcl1, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta biz_rsn_nm_lcl2_META = createCommonMeta($biz_rsn_nm_lcl2, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta biz_rsn_nm_lcl3_META = createCommonMeta($biz_rsn_nm_lcl3, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta biz_rsn_nm_lcl4_META = createCommonMeta($biz_rsn_nm_lcl4, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta biz_rsn_nm_lcl5_META = createCommonMeta($biz_rsn_nm_lcl5, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $CO_ALL1 = "CO_ALL1";
	public static final String $AC_RSN_CMN1 = "AC_RSN_CMN1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CO_ALL",
				$CO_ALL1,
				new String[][]{
						{"co_cd", "co_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_AC_RSN_CMN",
				$AC_RSN_CMN1,
				new String[][]{
						{"ac_rsn_cd", "ac_rsn_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAVM_BIZ_RSN_MST_R> constMetas = new ConstMetaList<MAVM_BIZ_RSN_MST_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			biz_rsn_cd_META,
			biz_rsn_nm_META,
			ac_rsn_cd_META,
			purc_flg_META,
			purc_sort_seq_META,
			purc_rtn_flg_META,
			purc_rtn_sort_seq_META,
			xpns_purc_flg_META,
			slo_xpns_purc_flg_META,
			purc_dscnt_flg_META,
			purc_dscnt_loc_mng_typ_META,
			purc_dscnt_sort_seq_META,
			sls_flg_META,
			sls_sort_seq_META,
			sls_rtn_flg_META,
			sls_rtn_sort_seq_META,
			sls_acxfr_flg_META,
			sls_dscnt_flg_META,
			sls_dscnt_sort_seq_META,
			acxfr_gr_flg_META,
			acxfr_gr_sort_seq_META,
			acxfr_gi_flg_META,
			acxfr_gi_sort_seq_META,
			inpt_acxfr_sort_seq_META,
			disp_flg_META,
			disp_sort_seq_META,
			stk_xfr_flg_META,
			stk_xfr_sort_seq_META,
			xfr_flg_META,
			xfr_sort_seq_META,
			yield_flg_META,
			yield_typ_META,
			yield_sort_seq_META,
			not_stk_flg_META,
			loss_flg_META,
			fxd_loss_flg_META,
			not_lot_trace_flg_META,
			inpt_flg_META,
			inpt_sort_seq_META,
			dfct_flg_META,
			dfct_sort_seq_META,
			memo1_META,
			memo2_META,
			memo3_META,
			del_flg_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_srv_req_no_META,
			co_cd_META,
			biz_rsn_nm_lcl1_META,
			biz_rsn_nm_lcl2_META,
			biz_rsn_nm_lcl3_META,
			biz_rsn_nm_lcl4_META,
			biz_rsn_nm_lcl5_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);
	

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * コンストラクタです。
	 */
	protected MAVM_BIZ_RSN_MST_R(ConstMetaList<? extends MAVM_BIZ_RSN_MST_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_BIZ_RSN_MST_R(ConstMetaList<? extends MAVM_BIZ_RSN_MST_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$biz_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$biz_rsn_cd,
				"biz_rsn_cd",
				biz_rsn_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$biz_rsn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$biz_rsn_nm,
				"biz_rsn_nm",
				biz_rsn_nm,
				false,
				false,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$ac_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$ac_rsn_cd,
				"ac_rsn_cd",
				ac_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$purc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$purc_flg,
				"purc_flg",
				purc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$purc_sort_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_BIZ_RSN_MST_R.$purc_sort_seq,
				"purc_sort_seq",
				purc_sort_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$purc_rtn_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$purc_rtn_flg,
				"purc_rtn_flg",
				purc_rtn_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$purc_rtn_sort_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_BIZ_RSN_MST_R.$purc_rtn_sort_seq,
				"purc_rtn_sort_seq",
				purc_rtn_sort_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$xpns_purc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$xpns_purc_flg,
				"xpns_purc_flg",
				xpns_purc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$slo_xpns_purc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$slo_xpns_purc_flg,
				"slo_xpns_purc_flg",
				slo_xpns_purc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$purc_dscnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$purc_dscnt_flg,
				"purc_dscnt_flg",
				purc_dscnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$purc_dscnt_loc_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$purc_dscnt_loc_mng_typ,
				"purc_dscnt_loc_mng_typ",
				purc_dscnt_loc_mng_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$purc_dscnt_sort_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_BIZ_RSN_MST_R.$purc_dscnt_sort_seq,
				"purc_dscnt_sort_seq",
				purc_dscnt_sort_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$sls_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$sls_flg,
				"sls_flg",
				sls_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$sls_sort_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_BIZ_RSN_MST_R.$sls_sort_seq,
				"sls_sort_seq",
				sls_sort_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$sls_rtn_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$sls_rtn_flg,
				"sls_rtn_flg",
				sls_rtn_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$sls_rtn_sort_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_BIZ_RSN_MST_R.$sls_rtn_sort_seq,
				"sls_rtn_sort_seq",
				sls_rtn_sort_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$sls_acxfr_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$sls_acxfr_flg,
				"sls_acxfr_flg",
				sls_acxfr_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$sls_dscnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$sls_dscnt_flg,
				"sls_dscnt_flg",
				sls_dscnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$sls_dscnt_sort_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_BIZ_RSN_MST_R.$sls_dscnt_sort_seq,
				"sls_dscnt_sort_seq",
				sls_dscnt_sort_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$acxfr_gr_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$acxfr_gr_flg,
				"acxfr_gr_flg",
				acxfr_gr_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$acxfr_gr_sort_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_BIZ_RSN_MST_R.$acxfr_gr_sort_seq,
				"acxfr_gr_sort_seq",
				acxfr_gr_sort_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$acxfr_gi_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$acxfr_gi_flg,
				"acxfr_gi_flg",
				acxfr_gi_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$acxfr_gi_sort_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_BIZ_RSN_MST_R.$acxfr_gi_sort_seq,
				"acxfr_gi_sort_seq",
				acxfr_gi_sort_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$inpt_acxfr_sort_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_BIZ_RSN_MST_R.$inpt_acxfr_sort_seq,
				"inpt_acxfr_sort_seq",
				inpt_acxfr_sort_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$disp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$disp_flg,
				"disp_flg",
				disp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$disp_sort_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_BIZ_RSN_MST_R.$disp_sort_seq,
				"disp_sort_seq",
				disp_sort_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$stk_xfr_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$stk_xfr_flg,
				"stk_xfr_flg",
				stk_xfr_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$stk_xfr_sort_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_BIZ_RSN_MST_R.$stk_xfr_sort_seq,
				"stk_xfr_sort_seq",
				stk_xfr_sort_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$xfr_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$xfr_flg,
				"xfr_flg",
				xfr_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$xfr_sort_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_BIZ_RSN_MST_R.$xfr_sort_seq,
				"xfr_sort_seq",
				xfr_sort_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$yield_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$yield_flg,
				"yield_flg",
				yield_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$yield_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$yield_typ,
				"yield_typ",
				yield_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$yield_sort_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_BIZ_RSN_MST_R.$yield_sort_seq,
				"yield_sort_seq",
				yield_sort_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$not_stk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$not_stk_flg,
				"not_stk_flg",
				not_stk_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$loss_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$loss_flg,
				"loss_flg",
				loss_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$fxd_loss_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$fxd_loss_flg,
				"fxd_loss_flg",
				fxd_loss_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$not_lot_trace_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$not_lot_trace_flg,
				"not_lot_trace_flg",
				not_lot_trace_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$inpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$inpt_flg,
				"inpt_flg",
				inpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$inpt_sort_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_BIZ_RSN_MST_R.$inpt_sort_seq,
				"inpt_sort_seq",
				inpt_sort_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$dfct_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$dfct_flg,
				"dfct_flg",
				dfct_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$dfct_sort_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_BIZ_RSN_MST_R.$dfct_sort_seq,
				"dfct_sort_seq",
				dfct_sort_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$memo1,
				"memo1",
				memo1,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$memo2,
				"memo2",
				memo2,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$memo3,
				"memo3",
				memo3,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_BIZ_RSN_MST_R.$del_flg,
				"del_flg",
				del_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$del_usr_id,
				"del_usr_id",
				del_usr_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$del_usr_nm,
				"del_usr_nm",
				del_usr_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_BIZ_RSN_MST_R.$del_ts,
				"del_ts",
				del_ts,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$ins_usr_id,
				"ins_usr_id",
				ins_usr_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$ins_usr_nm,
				"ins_usr_nm",
				ins_usr_nm,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_BIZ_RSN_MST_R.$ins_ts,
				"ins_ts",
				ins_ts,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$ins_func_id,
				"ins_func_id",
				ins_func_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_BIZ_RSN_MST_R.$upd_cntr,
				"upd_cntr",
				upd_cntr,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$upd_usr_id,
				"upd_usr_id",
				upd_usr_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$upd_usr_nm,
				"upd_usr_nm",
				upd_usr_nm,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_BIZ_RSN_MST_R.$upd_ts,
				"upd_ts",
				upd_ts,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$upd_func_id,
				"upd_func_id",
				upd_func_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$upd_srv_req_no,
				"upd_srv_req_no",
				upd_srv_req_no,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$co_cd,
				"co_cd",
				co_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$biz_rsn_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$biz_rsn_nm_lcl1,
				"biz_rsn_nm_lcl1",
				biz_rsn_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$biz_rsn_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$biz_rsn_nm_lcl2,
				"biz_rsn_nm_lcl2",
				biz_rsn_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$biz_rsn_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$biz_rsn_nm_lcl3,
				"biz_rsn_nm_lcl3",
				biz_rsn_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$biz_rsn_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$biz_rsn_nm_lcl4,
				"biz_rsn_nm_lcl4",
				biz_rsn_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_BIZ_RSN_MST_R.$biz_rsn_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_BIZ_RSN_MST_R.$biz_rsn_nm_lcl5,
				"biz_rsn_nm_lcl5",
				biz_rsn_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_BIZ_RSN_MST_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_BIZ_RSN_MST_R create(String alias) {
		MAVM_BIZ_RSN_MST_R row = new MAVM_BIZ_RSN_MST_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_BIZ_RSN_MST_R createByName(T proto) {
		MAVM_BIZ_RSN_MST_R row = MAVM_BIZ_RSN_MST_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_BIZ_RSN_MST_R clone() {
		return (MAVM_BIZ_RSN_MST_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_BIZ_RSN_MST_R createInstance() {
		return (MAVM_BIZ_RSN_MST_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_BIZ_RSN_MST_R getValues(String... names) {
		return (MAVM_BIZ_RSN_MST_R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	public boolean hasCocdFilter() {
		return false;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	public boolean hasLclFilter() {
		return false;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MCDBContainer getPkWorkDbc(String alias) {
	 	return null;
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MCDBContainer getPkWorkDbc() {
	 	return null;
	 }

	/**
	 * 業務理由ＣＤ. Business reason cd..<p>
	 *
	 */
	public String biz_rsn_cd() {
		return getConstString(offset + 0, $biz_rsn_cd);
	}

	/**
	 * 業務理由ＣＤ. Business reason cd..<p>
	 *
	 */
	public void biz_rsn_cd(String value) {
		setConstString(offset + 0, $biz_rsn_cd, value);
	}

	/**
	 * 業務理由名. Business reason name.<p>
	 *
	 */
	public String biz_rsn_nm() {
		return getConstString(offset + 1, $biz_rsn_nm);
	}

	/**
	 * 業務理由名. Business reason name.<p>
	 *
	 */
	public void biz_rsn_nm(String value) {
		setConstString(offset + 1, $biz_rsn_nm, value);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 2, $ac_rsn_cd);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 2, $ac_rsn_cd, value);
	}

	/**
	 * 仕入ＦＬＧ. Purchase flg..<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 3, $purc_flg);
	}

	/**
	 * 仕入ＦＬＧ. Purchase flg..<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 3, $purc_flg, value);
	}

	/**
	 * 仕入ソート順. Purchase sort order.<p>
	 *
	 */
	public MCNumber purc_sort_seq() {
		return getConstNumber(offset + 4, $purc_sort_seq);
	}

	/**
	 * 仕入ソート順. Purchase sort order.<p>
	 *
	 */
	public void purc_sort_seq(MCNumber value) {
		setConstNumber(offset + 4, $purc_sort_seq, value);
	}
	
	/**
	 * 仕入ソート順. Purchase sort order.<p>
	 *
	 */
	public void purc_sort_seq(int value) {
		setConstNumber(offset + 4, $purc_sort_seq, value);
	}
	
	/**
	 * 仕入ソート順. Purchase sort order.<p>
	 *
	 */
	public void purc_sort_seq(long value) {
		setConstNumber(offset + 4, $purc_sort_seq, value);
	}
	
	/**
	 * 仕入ソート順. Purchase sort order.<p>
	 *
	 */
	public void purc_sort_seq(float value) {
		setConstNumber(offset + 4, $purc_sort_seq, value);
	}
	
	/**
	 * 仕入ソート順. Purchase sort order.<p>
	 *
	 */
	public void purc_sort_seq(double value) {
		setConstNumber(offset + 4, $purc_sort_seq, value);
	}
	
	/**
	 * 仕入返品ＦＬＧ. Purchase return flg..<p>
	 *
	 */
	public boolean purc_rtn_flg() {
		return getConstBoolean(offset + 5, $purc_rtn_flg);
	}

	/**
	 * 仕入返品ＦＬＧ. Purchase return flg..<p>
	 *
	 */
	public void purc_rtn_flg(boolean value) {
		setConstBoolean(offset + 5, $purc_rtn_flg, value);
	}

	/**
	 * 仕入返品ソート順. Purchase return sort order.<p>
	 *
	 */
	public MCNumber purc_rtn_sort_seq() {
		return getConstNumber(offset + 6, $purc_rtn_sort_seq);
	}

	/**
	 * 仕入返品ソート順. Purchase return sort order.<p>
	 *
	 */
	public void purc_rtn_sort_seq(MCNumber value) {
		setConstNumber(offset + 6, $purc_rtn_sort_seq, value);
	}
	
	/**
	 * 仕入返品ソート順. Purchase return sort order.<p>
	 *
	 */
	public void purc_rtn_sort_seq(int value) {
		setConstNumber(offset + 6, $purc_rtn_sort_seq, value);
	}
	
	/**
	 * 仕入返品ソート順. Purchase return sort order.<p>
	 *
	 */
	public void purc_rtn_sort_seq(long value) {
		setConstNumber(offset + 6, $purc_rtn_sort_seq, value);
	}
	
	/**
	 * 仕入返品ソート順. Purchase return sort order.<p>
	 *
	 */
	public void purc_rtn_sort_seq(float value) {
		setConstNumber(offset + 6, $purc_rtn_sort_seq, value);
	}
	
	/**
	 * 仕入返品ソート順. Purchase return sort order.<p>
	 *
	 */
	public void purc_rtn_sort_seq(double value) {
		setConstNumber(offset + 6, $purc_rtn_sort_seq, value);
	}
	
	/**
	 * 経費購買ＦＬＧ. Expenses purchasing flg..<p>
	 *
	 */
	public boolean xpns_purc_flg() {
		return getConstBoolean(offset + 7, $xpns_purc_flg);
	}

	/**
	 * 経費購買ＦＬＧ. Expenses purchasing flg..<p>
	 *
	 */
	public void xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 7, $xpns_purc_flg, value);
	}

	/**
	 * 受注紐付経費購買ＦＬＧ. Expense purchase (pegged to sales order) flg..<p>
	 *
	 */
	public boolean slo_xpns_purc_flg() {
		return getConstBoolean(offset + 8, $slo_xpns_purc_flg);
	}

	/**
	 * 受注紐付経費購買ＦＬＧ. Expense purchase (pegged to sales order) flg..<p>
	 *
	 */
	public void slo_xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 8, $slo_xpns_purc_flg, value);
	}

	/**
	 * 仕入調整ＦＬＧ. Purchase adjustment flg..<p>
	 *
	 */
	public boolean purc_dscnt_flg() {
		return getConstBoolean(offset + 9, $purc_dscnt_flg);
	}

	/**
	 * 仕入調整ＦＬＧ. Purchase adjustment flg..<p>
	 *
	 */
	public void purc_dscnt_flg(boolean value) {
		setConstBoolean(offset + 9, $purc_dscnt_flg, value);
	}

	/**
	 * 仕入調整管轄区分. Purchase adjustment controlling site type.<p>
	 *
	 */
	public String purc_dscnt_loc_mng_typ() {
		return getConstString(offset + 10, $purc_dscnt_loc_mng_typ);
	}

	/**
	 * 仕入調整管轄区分. Purchase adjustment controlling site type.<p>
	 *
	 */
	public void purc_dscnt_loc_mng_typ(String value) {
		setConstString(offset + 10, $purc_dscnt_loc_mng_typ, value);
	}

	/**
	 * 仕入調整ソート順. Purchase adjustment sort order.<p>
	 *
	 */
	public MCNumber purc_dscnt_sort_seq() {
		return getConstNumber(offset + 11, $purc_dscnt_sort_seq);
	}

	/**
	 * 仕入調整ソート順. Purchase adjustment sort order.<p>
	 *
	 */
	public void purc_dscnt_sort_seq(MCNumber value) {
		setConstNumber(offset + 11, $purc_dscnt_sort_seq, value);
	}
	
	/**
	 * 仕入調整ソート順. Purchase adjustment sort order.<p>
	 *
	 */
	public void purc_dscnt_sort_seq(int value) {
		setConstNumber(offset + 11, $purc_dscnt_sort_seq, value);
	}
	
	/**
	 * 仕入調整ソート順. Purchase adjustment sort order.<p>
	 *
	 */
	public void purc_dscnt_sort_seq(long value) {
		setConstNumber(offset + 11, $purc_dscnt_sort_seq, value);
	}
	
	/**
	 * 仕入調整ソート順. Purchase adjustment sort order.<p>
	 *
	 */
	public void purc_dscnt_sort_seq(float value) {
		setConstNumber(offset + 11, $purc_dscnt_sort_seq, value);
	}
	
	/**
	 * 仕入調整ソート順. Purchase adjustment sort order.<p>
	 *
	 */
	public void purc_dscnt_sort_seq(double value) {
		setConstNumber(offset + 11, $purc_dscnt_sort_seq, value);
	}
	
	/**
	 * 売上ＦＬＧ. Sales flg..<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 12, $sls_flg);
	}

	/**
	 * 売上ＦＬＧ. Sales flg..<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 12, $sls_flg, value);
	}

	/**
	 * 売上ソート順. Sales sort order.<p>
	 *
	 */
	public MCNumber sls_sort_seq() {
		return getConstNumber(offset + 13, $sls_sort_seq);
	}

	/**
	 * 売上ソート順. Sales sort order.<p>
	 *
	 */
	public void sls_sort_seq(MCNumber value) {
		setConstNumber(offset + 13, $sls_sort_seq, value);
	}
	
	/**
	 * 売上ソート順. Sales sort order.<p>
	 *
	 */
	public void sls_sort_seq(int value) {
		setConstNumber(offset + 13, $sls_sort_seq, value);
	}
	
	/**
	 * 売上ソート順. Sales sort order.<p>
	 *
	 */
	public void sls_sort_seq(long value) {
		setConstNumber(offset + 13, $sls_sort_seq, value);
	}
	
	/**
	 * 売上ソート順. Sales sort order.<p>
	 *
	 */
	public void sls_sort_seq(float value) {
		setConstNumber(offset + 13, $sls_sort_seq, value);
	}
	
	/**
	 * 売上ソート順. Sales sort order.<p>
	 *
	 */
	public void sls_sort_seq(double value) {
		setConstNumber(offset + 13, $sls_sort_seq, value);
	}
	
	/**
	 * 売上返品ＦＬＧ. Sales return flg..<p>
	 *
	 */
	public boolean sls_rtn_flg() {
		return getConstBoolean(offset + 14, $sls_rtn_flg);
	}

	/**
	 * 売上返品ＦＬＧ. Sales return flg..<p>
	 *
	 */
	public void sls_rtn_flg(boolean value) {
		setConstBoolean(offset + 14, $sls_rtn_flg, value);
	}

	/**
	 * 売上返品ソート順. Sales return sort order.<p>
	 *
	 */
	public MCNumber sls_rtn_sort_seq() {
		return getConstNumber(offset + 15, $sls_rtn_sort_seq);
	}

	/**
	 * 売上返品ソート順. Sales return sort order.<p>
	 *
	 */
	public void sls_rtn_sort_seq(MCNumber value) {
		setConstNumber(offset + 15, $sls_rtn_sort_seq, value);
	}
	
	/**
	 * 売上返品ソート順. Sales return sort order.<p>
	 *
	 */
	public void sls_rtn_sort_seq(int value) {
		setConstNumber(offset + 15, $sls_rtn_sort_seq, value);
	}
	
	/**
	 * 売上返品ソート順. Sales return sort order.<p>
	 *
	 */
	public void sls_rtn_sort_seq(long value) {
		setConstNumber(offset + 15, $sls_rtn_sort_seq, value);
	}
	
	/**
	 * 売上返品ソート順. Sales return sort order.<p>
	 *
	 */
	public void sls_rtn_sort_seq(float value) {
		setConstNumber(offset + 15, $sls_rtn_sort_seq, value);
	}
	
	/**
	 * 売上返品ソート順. Sales return sort order.<p>
	 *
	 */
	public void sls_rtn_sort_seq(double value) {
		setConstNumber(offset + 15, $sls_rtn_sort_seq, value);
	}
	
	/**
	 * 販売他勘定ＦＬＧ. Sales other accounting flg..<p>
	 *
	 */
	public boolean sls_acxfr_flg() {
		return getConstBoolean(offset + 16, $sls_acxfr_flg);
	}

	/**
	 * 販売他勘定ＦＬＧ. Sales other accounting flg..<p>
	 *
	 */
	public void sls_acxfr_flg(boolean value) {
		setConstBoolean(offset + 16, $sls_acxfr_flg, value);
	}

	/**
	 * 売上調整ＦＬＧ. Sales adjustment flg..<p>
	 *
	 */
	public boolean sls_dscnt_flg() {
		return getConstBoolean(offset + 17, $sls_dscnt_flg);
	}

	/**
	 * 売上調整ＦＬＧ. Sales adjustment flg..<p>
	 *
	 */
	public void sls_dscnt_flg(boolean value) {
		setConstBoolean(offset + 17, $sls_dscnt_flg, value);
	}

	/**
	 * 売上調整ソート順. Sales adjustment sort order.<p>
	 *
	 */
	public MCNumber sls_dscnt_sort_seq() {
		return getConstNumber(offset + 18, $sls_dscnt_sort_seq);
	}

	/**
	 * 売上調整ソート順. Sales adjustment sort order.<p>
	 *
	 */
	public void sls_dscnt_sort_seq(MCNumber value) {
		setConstNumber(offset + 18, $sls_dscnt_sort_seq, value);
	}
	
	/**
	 * 売上調整ソート順. Sales adjustment sort order.<p>
	 *
	 */
	public void sls_dscnt_sort_seq(int value) {
		setConstNumber(offset + 18, $sls_dscnt_sort_seq, value);
	}
	
	/**
	 * 売上調整ソート順. Sales adjustment sort order.<p>
	 *
	 */
	public void sls_dscnt_sort_seq(long value) {
		setConstNumber(offset + 18, $sls_dscnt_sort_seq, value);
	}
	
	/**
	 * 売上調整ソート順. Sales adjustment sort order.<p>
	 *
	 */
	public void sls_dscnt_sort_seq(float value) {
		setConstNumber(offset + 18, $sls_dscnt_sort_seq, value);
	}
	
	/**
	 * 売上調整ソート順. Sales adjustment sort order.<p>
	 *
	 */
	public void sls_dscnt_sort_seq(double value) {
		setConstNumber(offset + 18, $sls_dscnt_sort_seq, value);
	}
	
	/**
	 * 他勘定入庫ＦＬＧ. Other accounting GR flg..<p>
	 *
	 */
	public boolean acxfr_gr_flg() {
		return getConstBoolean(offset + 19, $acxfr_gr_flg);
	}

	/**
	 * 他勘定入庫ＦＬＧ. Other accounting GR flg..<p>
	 *
	 */
	public void acxfr_gr_flg(boolean value) {
		setConstBoolean(offset + 19, $acxfr_gr_flg, value);
	}

	/**
	 * 他勘定入庫ソート順. Other accounting GR sort order.<p>
	 *
	 */
	public MCNumber acxfr_gr_sort_seq() {
		return getConstNumber(offset + 20, $acxfr_gr_sort_seq);
	}

	/**
	 * 他勘定入庫ソート順. Other accounting GR sort order.<p>
	 *
	 */
	public void acxfr_gr_sort_seq(MCNumber value) {
		setConstNumber(offset + 20, $acxfr_gr_sort_seq, value);
	}
	
	/**
	 * 他勘定入庫ソート順. Other accounting GR sort order.<p>
	 *
	 */
	public void acxfr_gr_sort_seq(int value) {
		setConstNumber(offset + 20, $acxfr_gr_sort_seq, value);
	}
	
	/**
	 * 他勘定入庫ソート順. Other accounting GR sort order.<p>
	 *
	 */
	public void acxfr_gr_sort_seq(long value) {
		setConstNumber(offset + 20, $acxfr_gr_sort_seq, value);
	}
	
	/**
	 * 他勘定入庫ソート順. Other accounting GR sort order.<p>
	 *
	 */
	public void acxfr_gr_sort_seq(float value) {
		setConstNumber(offset + 20, $acxfr_gr_sort_seq, value);
	}
	
	/**
	 * 他勘定入庫ソート順. Other accounting GR sort order.<p>
	 *
	 */
	public void acxfr_gr_sort_seq(double value) {
		setConstNumber(offset + 20, $acxfr_gr_sort_seq, value);
	}
	
	/**
	 * 他勘定出庫ＦＬＧ. Other accounting GI flg..<p>
	 *
	 */
	public boolean acxfr_gi_flg() {
		return getConstBoolean(offset + 21, $acxfr_gi_flg);
	}

	/**
	 * 他勘定出庫ＦＬＧ. Other accounting GI flg..<p>
	 *
	 */
	public void acxfr_gi_flg(boolean value) {
		setConstBoolean(offset + 21, $acxfr_gi_flg, value);
	}

	/**
	 * 他勘定出庫ソート順. Other accounting GI sort order.<p>
	 *
	 */
	public MCNumber acxfr_gi_sort_seq() {
		return getConstNumber(offset + 22, $acxfr_gi_sort_seq);
	}

	/**
	 * 他勘定出庫ソート順. Other accounting GI sort order.<p>
	 *
	 */
	public void acxfr_gi_sort_seq(MCNumber value) {
		setConstNumber(offset + 22, $acxfr_gi_sort_seq, value);
	}
	
	/**
	 * 他勘定出庫ソート順. Other accounting GI sort order.<p>
	 *
	 */
	public void acxfr_gi_sort_seq(int value) {
		setConstNumber(offset + 22, $acxfr_gi_sort_seq, value);
	}
	
	/**
	 * 他勘定出庫ソート順. Other accounting GI sort order.<p>
	 *
	 */
	public void acxfr_gi_sort_seq(long value) {
		setConstNumber(offset + 22, $acxfr_gi_sort_seq, value);
	}
	
	/**
	 * 他勘定出庫ソート順. Other accounting GI sort order.<p>
	 *
	 */
	public void acxfr_gi_sort_seq(float value) {
		setConstNumber(offset + 22, $acxfr_gi_sort_seq, value);
	}
	
	/**
	 * 他勘定出庫ソート順. Other accounting GI sort order.<p>
	 *
	 */
	public void acxfr_gi_sort_seq(double value) {
		setConstNumber(offset + 22, $acxfr_gi_sort_seq, value);
	}
	
	/**
	 * 投入他勘定ソート順. Input other accounting sort order.<p>
	 *
	 */
	public MCNumber inpt_acxfr_sort_seq() {
		return getConstNumber(offset + 23, $inpt_acxfr_sort_seq);
	}

	/**
	 * 投入他勘定ソート順. Input other accounting sort order.<p>
	 *
	 */
	public void inpt_acxfr_sort_seq(MCNumber value) {
		setConstNumber(offset + 23, $inpt_acxfr_sort_seq, value);
	}
	
	/**
	 * 投入他勘定ソート順. Input other accounting sort order.<p>
	 *
	 */
	public void inpt_acxfr_sort_seq(int value) {
		setConstNumber(offset + 23, $inpt_acxfr_sort_seq, value);
	}
	
	/**
	 * 投入他勘定ソート順. Input other accounting sort order.<p>
	 *
	 */
	public void inpt_acxfr_sort_seq(long value) {
		setConstNumber(offset + 23, $inpt_acxfr_sort_seq, value);
	}
	
	/**
	 * 投入他勘定ソート順. Input other accounting sort order.<p>
	 *
	 */
	public void inpt_acxfr_sort_seq(float value) {
		setConstNumber(offset + 23, $inpt_acxfr_sort_seq, value);
	}
	
	/**
	 * 投入他勘定ソート順. Input other accounting sort order.<p>
	 *
	 */
	public void inpt_acxfr_sort_seq(double value) {
		setConstNumber(offset + 23, $inpt_acxfr_sort_seq, value);
	}
	
	/**
	 * 廃棄ＦＬＧ. Disposal flg..<p>
	 *
	 */
	public boolean disp_flg() {
		return getConstBoolean(offset + 24, $disp_flg);
	}

	/**
	 * 廃棄ＦＬＧ. Disposal flg..<p>
	 *
	 */
	public void disp_flg(boolean value) {
		setConstBoolean(offset + 24, $disp_flg, value);
	}

	/**
	 * 廃棄ソート順. Disposal sort order.<p>
	 *
	 */
	public MCNumber disp_sort_seq() {
		return getConstNumber(offset + 25, $disp_sort_seq);
	}

	/**
	 * 廃棄ソート順. Disposal sort order.<p>
	 *
	 */
	public void disp_sort_seq(MCNumber value) {
		setConstNumber(offset + 25, $disp_sort_seq, value);
	}
	
	/**
	 * 廃棄ソート順. Disposal sort order.<p>
	 *
	 */
	public void disp_sort_seq(int value) {
		setConstNumber(offset + 25, $disp_sort_seq, value);
	}
	
	/**
	 * 廃棄ソート順. Disposal sort order.<p>
	 *
	 */
	public void disp_sort_seq(long value) {
		setConstNumber(offset + 25, $disp_sort_seq, value);
	}
	
	/**
	 * 廃棄ソート順. Disposal sort order.<p>
	 *
	 */
	public void disp_sort_seq(float value) {
		setConstNumber(offset + 25, $disp_sort_seq, value);
	}
	
	/**
	 * 廃棄ソート順. Disposal sort order.<p>
	 *
	 */
	public void disp_sort_seq(double value) {
		setConstNumber(offset + 25, $disp_sort_seq, value);
	}
	
	/**
	 * 在庫振替ＦＬＧ. Inventory transfer flg..<p>
	 *
	 */
	public boolean stk_xfr_flg() {
		return getConstBoolean(offset + 26, $stk_xfr_flg);
	}

	/**
	 * 在庫振替ＦＬＧ. Inventory transfer flg..<p>
	 *
	 */
	public void stk_xfr_flg(boolean value) {
		setConstBoolean(offset + 26, $stk_xfr_flg, value);
	}

	/**
	 * 在庫振替ソート順. Inventory transfer sort order.<p>
	 *
	 */
	public MCNumber stk_xfr_sort_seq() {
		return getConstNumber(offset + 27, $stk_xfr_sort_seq);
	}

	/**
	 * 在庫振替ソート順. Inventory transfer sort order.<p>
	 *
	 */
	public void stk_xfr_sort_seq(MCNumber value) {
		setConstNumber(offset + 27, $stk_xfr_sort_seq, value);
	}
	
	/**
	 * 在庫振替ソート順. Inventory transfer sort order.<p>
	 *
	 */
	public void stk_xfr_sort_seq(int value) {
		setConstNumber(offset + 27, $stk_xfr_sort_seq, value);
	}
	
	/**
	 * 在庫振替ソート順. Inventory transfer sort order.<p>
	 *
	 */
	public void stk_xfr_sort_seq(long value) {
		setConstNumber(offset + 27, $stk_xfr_sort_seq, value);
	}
	
	/**
	 * 在庫振替ソート順. Inventory transfer sort order.<p>
	 *
	 */
	public void stk_xfr_sort_seq(float value) {
		setConstNumber(offset + 27, $stk_xfr_sort_seq, value);
	}
	
	/**
	 * 在庫振替ソート順. Inventory transfer sort order.<p>
	 *
	 */
	public void stk_xfr_sort_seq(double value) {
		setConstNumber(offset + 27, $stk_xfr_sort_seq, value);
	}
	
	/**
	 * 移送ＦＬＧ. Transport flg..<p>
	 *
	 */
	public boolean xfr_flg() {
		return getConstBoolean(offset + 28, $xfr_flg);
	}

	/**
	 * 移送ＦＬＧ. Transport flg..<p>
	 *
	 */
	public void xfr_flg(boolean value) {
		setConstBoolean(offset + 28, $xfr_flg, value);
	}

	/**
	 * 移送ソート順. Transport sort order.<p>
	 *
	 */
	public MCNumber xfr_sort_seq() {
		return getConstNumber(offset + 29, $xfr_sort_seq);
	}

	/**
	 * 移送ソート順. Transport sort order.<p>
	 *
	 */
	public void xfr_sort_seq(MCNumber value) {
		setConstNumber(offset + 29, $xfr_sort_seq, value);
	}
	
	/**
	 * 移送ソート順. Transport sort order.<p>
	 *
	 */
	public void xfr_sort_seq(int value) {
		setConstNumber(offset + 29, $xfr_sort_seq, value);
	}
	
	/**
	 * 移送ソート順. Transport sort order.<p>
	 *
	 */
	public void xfr_sort_seq(long value) {
		setConstNumber(offset + 29, $xfr_sort_seq, value);
	}
	
	/**
	 * 移送ソート順. Transport sort order.<p>
	 *
	 */
	public void xfr_sort_seq(float value) {
		setConstNumber(offset + 29, $xfr_sort_seq, value);
	}
	
	/**
	 * 移送ソート順. Transport sort order.<p>
	 *
	 */
	public void xfr_sort_seq(double value) {
		setConstNumber(offset + 29, $xfr_sort_seq, value);
	}
	
	/**
	 * 出来高ＦＬＧ. Output flg..<p>
	 *
	 */
	public boolean yield_flg() {
		return getConstBoolean(offset + 30, $yield_flg);
	}

	/**
	 * 出来高ＦＬＧ. Output flg..<p>
	 *
	 */
	public void yield_flg(boolean value) {
		setConstBoolean(offset + 30, $yield_flg, value);
	}

	/**
	 * 出来高区分. Output type.<p>
	 *
	 */
	public String yield_typ() {
		return getConstString(offset + 31, $yield_typ);
	}

	/**
	 * 出来高区分. Output type.<p>
	 *
	 */
	public void yield_typ(String value) {
		setConstString(offset + 31, $yield_typ, value);
	}

	/**
	 * 出来高ソート順. Output sort order.<p>
	 *
	 */
	public MCNumber yield_sort_seq() {
		return getConstNumber(offset + 32, $yield_sort_seq);
	}

	/**
	 * 出来高ソート順. Output sort order.<p>
	 *
	 */
	public void yield_sort_seq(MCNumber value) {
		setConstNumber(offset + 32, $yield_sort_seq, value);
	}
	
	/**
	 * 出来高ソート順. Output sort order.<p>
	 *
	 */
	public void yield_sort_seq(int value) {
		setConstNumber(offset + 32, $yield_sort_seq, value);
	}
	
	/**
	 * 出来高ソート順. Output sort order.<p>
	 *
	 */
	public void yield_sort_seq(long value) {
		setConstNumber(offset + 32, $yield_sort_seq, value);
	}
	
	/**
	 * 出来高ソート順. Output sort order.<p>
	 *
	 */
	public void yield_sort_seq(float value) {
		setConstNumber(offset + 32, $yield_sort_seq, value);
	}
	
	/**
	 * 出来高ソート順. Output sort order.<p>
	 *
	 */
	public void yield_sort_seq(double value) {
		setConstNumber(offset + 32, $yield_sort_seq, value);
	}
	
	/**
	 * 非在庫ＦＬＧ. MRO supply flg..<p>
	 *
	 */
	public boolean not_stk_flg() {
		return getConstBoolean(offset + 33, $not_stk_flg);
	}

	/**
	 * 非在庫ＦＬＧ. MRO supply flg..<p>
	 *
	 */
	public void not_stk_flg(boolean value) {
		setConstBoolean(offset + 33, $not_stk_flg, value);
	}

	/**
	 * ロスＦＬＧ. Loss flg..<p>
	 *
	 */
	public boolean loss_flg() {
		return getConstBoolean(offset + 34, $loss_flg);
	}

	/**
	 * ロスＦＬＧ. Loss flg..<p>
	 *
	 */
	public void loss_flg(boolean value) {
		setConstBoolean(offset + 34, $loss_flg, value);
	}

	/**
	 * 固定ロスＦＬＧ. Constant loss flg..<p>
	 *
	 */
	public boolean fxd_loss_flg() {
		return getConstBoolean(offset + 35, $fxd_loss_flg);
	}

	/**
	 * 固定ロスＦＬＧ. Constant loss flg..<p>
	 *
	 */
	public void fxd_loss_flg(boolean value) {
		setConstBoolean(offset + 35, $fxd_loss_flg, value);
	}

	/**
	 * ロットトレース対象外ＦＬＧ. Not for lot trace flg..<p>
	 *
	 */
	public boolean not_lot_trace_flg() {
		return getConstBoolean(offset + 36, $not_lot_trace_flg);
	}

	/**
	 * ロットトレース対象外ＦＬＧ. Not for lot trace flg..<p>
	 *
	 */
	public void not_lot_trace_flg(boolean value) {
		setConstBoolean(offset + 36, $not_lot_trace_flg, value);
	}

	/**
	 * 投入ＦＬＧ. Input flg..<p>
	 *
	 */
	public boolean inpt_flg() {
		return getConstBoolean(offset + 37, $inpt_flg);
	}

	/**
	 * 投入ＦＬＧ. Input flg..<p>
	 *
	 */
	public void inpt_flg(boolean value) {
		setConstBoolean(offset + 37, $inpt_flg, value);
	}

	/**
	 * 投入ソート順. Input sort order.<p>
	 *
	 */
	public MCNumber inpt_sort_seq() {
		return getConstNumber(offset + 38, $inpt_sort_seq);
	}

	/**
	 * 投入ソート順. Input sort order.<p>
	 *
	 */
	public void inpt_sort_seq(MCNumber value) {
		setConstNumber(offset + 38, $inpt_sort_seq, value);
	}
	
	/**
	 * 投入ソート順. Input sort order.<p>
	 *
	 */
	public void inpt_sort_seq(int value) {
		setConstNumber(offset + 38, $inpt_sort_seq, value);
	}
	
	/**
	 * 投入ソート順. Input sort order.<p>
	 *
	 */
	public void inpt_sort_seq(long value) {
		setConstNumber(offset + 38, $inpt_sort_seq, value);
	}
	
	/**
	 * 投入ソート順. Input sort order.<p>
	 *
	 */
	public void inpt_sort_seq(float value) {
		setConstNumber(offset + 38, $inpt_sort_seq, value);
	}
	
	/**
	 * 投入ソート順. Input sort order.<p>
	 *
	 */
	public void inpt_sort_seq(double value) {
		setConstNumber(offset + 38, $inpt_sort_seq, value);
	}
	
	/**
	 * 検査不良ＦＬＧ. Inspection defective flg..<p>
	 *
	 */
	public boolean dfct_flg() {
		return getConstBoolean(offset + 39, $dfct_flg);
	}

	/**
	 * 検査不良ＦＬＧ. Inspection defective flg..<p>
	 *
	 */
	public void dfct_flg(boolean value) {
		setConstBoolean(offset + 39, $dfct_flg, value);
	}

	/**
	 * 検査不良ソート順. Inspection defective sort order.<p>
	 *
	 */
	public MCNumber dfct_sort_seq() {
		return getConstNumber(offset + 40, $dfct_sort_seq);
	}

	/**
	 * 検査不良ソート順. Inspection defective sort order.<p>
	 *
	 */
	public void dfct_sort_seq(MCNumber value) {
		setConstNumber(offset + 40, $dfct_sort_seq, value);
	}
	
	/**
	 * 検査不良ソート順. Inspection defective sort order.<p>
	 *
	 */
	public void dfct_sort_seq(int value) {
		setConstNumber(offset + 40, $dfct_sort_seq, value);
	}
	
	/**
	 * 検査不良ソート順. Inspection defective sort order.<p>
	 *
	 */
	public void dfct_sort_seq(long value) {
		setConstNumber(offset + 40, $dfct_sort_seq, value);
	}
	
	/**
	 * 検査不良ソート順. Inspection defective sort order.<p>
	 *
	 */
	public void dfct_sort_seq(float value) {
		setConstNumber(offset + 40, $dfct_sort_seq, value);
	}
	
	/**
	 * 検査不良ソート順. Inspection defective sort order.<p>
	 *
	 */
	public void dfct_sort_seq(double value) {
		setConstNumber(offset + 40, $dfct_sort_seq, value);
	}
	
	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 41, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 41, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 42, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 42, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 43, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 43, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 44, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 44, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 45, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 45, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 46, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 46, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 47, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 47, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 48, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 48, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 49, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 49, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 50, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 50, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 51, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 51, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 52, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 53, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 53, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 54, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 54, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 55, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 55, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 56, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 56, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 57, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 57, $upd_srv_req_no, value);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 58, $co_cd);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 58, $co_cd, value);
	}

	/**
	 * 業務理由名（ロケール１）. Business reason name (Locale 1).<p>
	 *
	 */
	public String biz_rsn_nm_lcl1() {
		return getConstString(offset + 59, $biz_rsn_nm_lcl1);
	}

	/**
	 * 業務理由名（ロケール１）. Business reason name (Locale 1).<p>
	 *
	 */
	public void biz_rsn_nm_lcl1(String value) {
		setConstString(offset + 59, $biz_rsn_nm_lcl1, value);
	}

	/**
	 * 業務理由名（ロケール２）. Business reason name (Locale 2).<p>
	 *
	 */
	public String biz_rsn_nm_lcl2() {
		return getConstString(offset + 60, $biz_rsn_nm_lcl2);
	}

	/**
	 * 業務理由名（ロケール２）. Business reason name (Locale 2).<p>
	 *
	 */
	public void biz_rsn_nm_lcl2(String value) {
		setConstString(offset + 60, $biz_rsn_nm_lcl2, value);
	}

	/**
	 * 業務理由名（ロケール３）. Business reason name (Locale 3).<p>
	 *
	 */
	public String biz_rsn_nm_lcl3() {
		return getConstString(offset + 61, $biz_rsn_nm_lcl3);
	}

	/**
	 * 業務理由名（ロケール３）. Business reason name (Locale 3).<p>
	 *
	 */
	public void biz_rsn_nm_lcl3(String value) {
		setConstString(offset + 61, $biz_rsn_nm_lcl3, value);
	}

	/**
	 * 業務理由名（ロケール４）. Business reason name (Locale 4).<p>
	 *
	 */
	public String biz_rsn_nm_lcl4() {
		return getConstString(offset + 62, $biz_rsn_nm_lcl4);
	}

	/**
	 * 業務理由名（ロケール４）. Business reason name (Locale 4).<p>
	 *
	 */
	public void biz_rsn_nm_lcl4(String value) {
		setConstString(offset + 62, $biz_rsn_nm_lcl4, value);
	}

	/**
	 * 業務理由名（ロケール５）. Business reason name (Locale 5).<p>
	 *
	 */
	public String biz_rsn_nm_lcl5() {
		return getConstString(offset + 63, $biz_rsn_nm_lcl5);
	}

	/**
	 * 業務理由名（ロケール５）. Business reason name (Locale 5).<p>
	 *
	 */
	public void biz_rsn_nm_lcl5(String value) {
		setConstString(offset + 63, $biz_rsn_nm_lcl5, value);
	}

	public String getString(String name) {
		if ($biz_rsn_cd.equalsIgnoreCase(name)) {
			return biz_rsn_cd();
		}
		if ($biz_rsn_nm.equalsIgnoreCase(name)) {
			return biz_rsn_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($purc_dscnt_loc_mng_typ.equalsIgnoreCase(name)) {
			return purc_dscnt_loc_mng_typ();
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($biz_rsn_nm_lcl1.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl1();
		}
		if ($biz_rsn_nm_lcl2.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl2();
		}
		if ($biz_rsn_nm_lcl3.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl3();
		}
		if ($biz_rsn_nm_lcl4.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl4();
		}
		if ($biz_rsn_nm_lcl5.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl5();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			return purc_sort_seq();
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			return purc_rtn_sort_seq();
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			return purc_dscnt_sort_seq();
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			return sls_sort_seq();
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			return sls_rtn_sort_seq();
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			return sls_dscnt_sort_seq();
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			return acxfr_gr_sort_seq();
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			return acxfr_gi_sort_seq();
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			return inpt_acxfr_sort_seq();
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			return disp_sort_seq();
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			return stk_xfr_sort_seq();
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			return xfr_sort_seq();
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			return yield_sort_seq();
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			return inpt_sort_seq();
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			return dfct_sort_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCTimestamp getTimestamp(String name) {
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}

	public boolean getBoolean(String name) {
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($purc_rtn_flg.equalsIgnoreCase(name)) {
			return purc_rtn_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($slo_xpns_purc_flg.equalsIgnoreCase(name)) {
			return slo_xpns_purc_flg();
		}
		if ($purc_dscnt_flg.equalsIgnoreCase(name)) {
			return purc_dscnt_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($sls_rtn_flg.equalsIgnoreCase(name)) {
			return sls_rtn_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($sls_dscnt_flg.equalsIgnoreCase(name)) {
			return sls_dscnt_flg();
		}
		if ($acxfr_gr_flg.equalsIgnoreCase(name)) {
			return acxfr_gr_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
		}
		if ($disp_flg.equalsIgnoreCase(name)) {
			return disp_flg();
		}
		if ($stk_xfr_flg.equalsIgnoreCase(name)) {
			return stk_xfr_flg();
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			return xfr_flg();
		}
		if ($yield_flg.equalsIgnoreCase(name)) {
			return yield_flg();
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			return not_stk_flg();
		}
		if ($loss_flg.equalsIgnoreCase(name)) {
			return loss_flg();
		}
		if ($fxd_loss_flg.equalsIgnoreCase(name)) {
			return fxd_loss_flg();
		}
		if ($not_lot_trace_flg.equalsIgnoreCase(name)) {
			return not_lot_trace_flg();
		}
		if ($inpt_flg.equalsIgnoreCase(name)) {
			return inpt_flg();
		}
		if ($dfct_flg.equalsIgnoreCase(name)) {
			return dfct_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($biz_rsn_cd.equalsIgnoreCase(name)) {
			return biz_rsn_cd();
		}
		if ($biz_rsn_nm.equalsIgnoreCase(name)) {
			return biz_rsn_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($purc_dscnt_loc_mng_typ.equalsIgnoreCase(name)) {
			return purc_dscnt_loc_mng_typ();
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($biz_rsn_nm_lcl1.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl1();
		}
		if ($biz_rsn_nm_lcl2.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl2();
		}
		if ($biz_rsn_nm_lcl3.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl3();
		}
		if ($biz_rsn_nm_lcl4.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl4();
		}
		if ($biz_rsn_nm_lcl5.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl5();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			return purc_sort_seq();
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			return purc_rtn_sort_seq();
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			return purc_dscnt_sort_seq();
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			return sls_sort_seq();
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			return sls_rtn_sort_seq();
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			return sls_dscnt_sort_seq();
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			return acxfr_gr_sort_seq();
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			return acxfr_gi_sort_seq();
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			return inpt_acxfr_sort_seq();
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			return disp_sort_seq();
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			return stk_xfr_sort_seq();
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			return xfr_sort_seq();
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			return yield_sort_seq();
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			return inpt_sort_seq();
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			return dfct_sort_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCTimestamp getTimestampNE(String name) {
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($purc_rtn_flg.equalsIgnoreCase(name)) {
			return purc_rtn_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($slo_xpns_purc_flg.equalsIgnoreCase(name)) {
			return slo_xpns_purc_flg();
		}
		if ($purc_dscnt_flg.equalsIgnoreCase(name)) {
			return purc_dscnt_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($sls_rtn_flg.equalsIgnoreCase(name)) {
			return sls_rtn_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($sls_dscnt_flg.equalsIgnoreCase(name)) {
			return sls_dscnt_flg();
		}
		if ($acxfr_gr_flg.equalsIgnoreCase(name)) {
			return acxfr_gr_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
		}
		if ($disp_flg.equalsIgnoreCase(name)) {
			return disp_flg();
		}
		if ($stk_xfr_flg.equalsIgnoreCase(name)) {
			return stk_xfr_flg();
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			return xfr_flg();
		}
		if ($yield_flg.equalsIgnoreCase(name)) {
			return yield_flg();
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			return not_stk_flg();
		}
		if ($loss_flg.equalsIgnoreCase(name)) {
			return loss_flg();
		}
		if ($fxd_loss_flg.equalsIgnoreCase(name)) {
			return fxd_loss_flg();
		}
		if ($not_lot_trace_flg.equalsIgnoreCase(name)) {
			return not_lot_trace_flg();
		}
		if ($inpt_flg.equalsIgnoreCase(name)) {
			return inpt_flg();
		}
		if ($dfct_flg.equalsIgnoreCase(name)) {
			return dfct_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($biz_rsn_cd.equalsIgnoreCase(name)) {
			biz_rsn_cd(value);
			return;
		}
		if ($biz_rsn_nm.equalsIgnoreCase(name)) {
			biz_rsn_nm(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($purc_dscnt_loc_mng_typ.equalsIgnoreCase(name)) {
			purc_dscnt_loc_mng_typ(value);
			return;
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($biz_rsn_nm_lcl1.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl1(value);
			return;
		}
		if ($biz_rsn_nm_lcl2.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl2(value);
			return;
		}
		if ($biz_rsn_nm_lcl3.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl3(value);
			return;
		}
		if ($biz_rsn_nm_lcl4.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl4(value);
			return;
		}
		if ($biz_rsn_nm_lcl5.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl5(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			purc_sort_seq(value);
			return;
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			purc_rtn_sort_seq(value);
			return;
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			purc_dscnt_sort_seq(value);
			return;
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			sls_sort_seq(value);
			return;
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			sls_rtn_sort_seq(value);
			return;
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			sls_dscnt_sort_seq(value);
			return;
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gr_sort_seq(value);
			return;
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gi_sort_seq(value);
			return;
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			inpt_acxfr_sort_seq(value);
			return;
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			disp_sort_seq(value);
			return;
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			stk_xfr_sort_seq(value);
			return;
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			xfr_sort_seq(value);
			return;
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			yield_sort_seq(value);
			return;
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			inpt_sort_seq(value);
			return;
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			dfct_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			purc_sort_seq(value);
			return;
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			purc_rtn_sort_seq(value);
			return;
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			purc_dscnt_sort_seq(value);
			return;
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			sls_sort_seq(value);
			return;
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			sls_rtn_sort_seq(value);
			return;
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			sls_dscnt_sort_seq(value);
			return;
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gr_sort_seq(value);
			return;
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gi_sort_seq(value);
			return;
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			inpt_acxfr_sort_seq(value);
			return;
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			disp_sort_seq(value);
			return;
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			stk_xfr_sort_seq(value);
			return;
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			xfr_sort_seq(value);
			return;
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			yield_sort_seq(value);
			return;
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			inpt_sort_seq(value);
			return;
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			dfct_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			purc_sort_seq(value);
			return;
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			purc_rtn_sort_seq(value);
			return;
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			purc_dscnt_sort_seq(value);
			return;
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			sls_sort_seq(value);
			return;
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			sls_rtn_sort_seq(value);
			return;
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			sls_dscnt_sort_seq(value);
			return;
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gr_sort_seq(value);
			return;
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gi_sort_seq(value);
			return;
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			inpt_acxfr_sort_seq(value);
			return;
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			disp_sort_seq(value);
			return;
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			stk_xfr_sort_seq(value);
			return;
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			xfr_sort_seq(value);
			return;
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			yield_sort_seq(value);
			return;
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			inpt_sort_seq(value);
			return;
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			dfct_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			purc_sort_seq(value);
			return;
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			purc_rtn_sort_seq(value);
			return;
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			purc_dscnt_sort_seq(value);
			return;
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			sls_sort_seq(value);
			return;
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			sls_rtn_sort_seq(value);
			return;
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			sls_dscnt_sort_seq(value);
			return;
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gr_sort_seq(value);
			return;
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gi_sort_seq(value);
			return;
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			inpt_acxfr_sort_seq(value);
			return;
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			disp_sort_seq(value);
			return;
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			stk_xfr_sort_seq(value);
			return;
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			xfr_sort_seq(value);
			return;
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			yield_sort_seq(value);
			return;
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			inpt_sort_seq(value);
			return;
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			dfct_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			purc_sort_seq(value);
			return;
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			purc_rtn_sort_seq(value);
			return;
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			purc_dscnt_sort_seq(value);
			return;
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			sls_sort_seq(value);
			return;
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			sls_rtn_sort_seq(value);
			return;
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			sls_dscnt_sort_seq(value);
			return;
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gr_sort_seq(value);
			return;
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gi_sort_seq(value);
			return;
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			inpt_acxfr_sort_seq(value);
			return;
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			disp_sort_seq(value);
			return;
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			stk_xfr_sort_seq(value);
			return;
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			xfr_sort_seq(value);
			return;
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			yield_sort_seq(value);
			return;
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			inpt_sort_seq(value);
			return;
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			dfct_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setTimestamp(String name, MCTimestamp value) {
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($purc_rtn_flg.equalsIgnoreCase(name)) {
			purc_rtn_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($slo_xpns_purc_flg.equalsIgnoreCase(name)) {
			slo_xpns_purc_flg(value);
			return;
		}
		if ($purc_dscnt_flg.equalsIgnoreCase(name)) {
			purc_dscnt_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($sls_rtn_flg.equalsIgnoreCase(name)) {
			sls_rtn_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($sls_dscnt_flg.equalsIgnoreCase(name)) {
			sls_dscnt_flg(value);
			return;
		}
		if ($acxfr_gr_flg.equalsIgnoreCase(name)) {
			acxfr_gr_flg(value);
			return;
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			acxfr_gi_flg(value);
			return;
		}
		if ($disp_flg.equalsIgnoreCase(name)) {
			disp_flg(value);
			return;
		}
		if ($stk_xfr_flg.equalsIgnoreCase(name)) {
			stk_xfr_flg(value);
			return;
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			xfr_flg(value);
			return;
		}
		if ($yield_flg.equalsIgnoreCase(name)) {
			yield_flg(value);
			return;
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			not_stk_flg(value);
			return;
		}
		if ($loss_flg.equalsIgnoreCase(name)) {
			loss_flg(value);
			return;
		}
		if ($fxd_loss_flg.equalsIgnoreCase(name)) {
			fxd_loss_flg(value);
			return;
		}
		if ($not_lot_trace_flg.equalsIgnoreCase(name)) {
			not_lot_trace_flg(value);
			return;
		}
		if ($inpt_flg.equalsIgnoreCase(name)) {
			inpt_flg(value);
			return;
		}
		if ($dfct_flg.equalsIgnoreCase(name)) {
			dfct_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($biz_rsn_cd.equalsIgnoreCase(name)) {
			biz_rsn_cd(value);
			return;
		}
		if ($biz_rsn_nm.equalsIgnoreCase(name)) {
			biz_rsn_nm(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($purc_dscnt_loc_mng_typ.equalsIgnoreCase(name)) {
			purc_dscnt_loc_mng_typ(value);
			return;
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($biz_rsn_nm_lcl1.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl1(value);
			return;
		}
		if ($biz_rsn_nm_lcl2.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl2(value);
			return;
		}
		if ($biz_rsn_nm_lcl3.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl3(value);
			return;
		}
		if ($biz_rsn_nm_lcl4.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl4(value);
			return;
		}
		if ($biz_rsn_nm_lcl5.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl5(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			purc_sort_seq(value);
			return;
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			purc_rtn_sort_seq(value);
			return;
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			purc_dscnt_sort_seq(value);
			return;
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			sls_sort_seq(value);
			return;
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			sls_rtn_sort_seq(value);
			return;
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			sls_dscnt_sort_seq(value);
			return;
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gr_sort_seq(value);
			return;
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gi_sort_seq(value);
			return;
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			inpt_acxfr_sort_seq(value);
			return;
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			disp_sort_seq(value);
			return;
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			stk_xfr_sort_seq(value);
			return;
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			xfr_sort_seq(value);
			return;
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			yield_sort_seq(value);
			return;
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			inpt_sort_seq(value);
			return;
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			dfct_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			purc_sort_seq(value);
			return;
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			purc_rtn_sort_seq(value);
			return;
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			purc_dscnt_sort_seq(value);
			return;
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			sls_sort_seq(value);
			return;
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			sls_rtn_sort_seq(value);
			return;
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			sls_dscnt_sort_seq(value);
			return;
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gr_sort_seq(value);
			return;
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gi_sort_seq(value);
			return;
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			inpt_acxfr_sort_seq(value);
			return;
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			disp_sort_seq(value);
			return;
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			stk_xfr_sort_seq(value);
			return;
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			xfr_sort_seq(value);
			return;
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			yield_sort_seq(value);
			return;
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			inpt_sort_seq(value);
			return;
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			dfct_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			purc_sort_seq(value);
			return;
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			purc_rtn_sort_seq(value);
			return;
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			purc_dscnt_sort_seq(value);
			return;
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			sls_sort_seq(value);
			return;
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			sls_rtn_sort_seq(value);
			return;
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			sls_dscnt_sort_seq(value);
			return;
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gr_sort_seq(value);
			return;
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gi_sort_seq(value);
			return;
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			inpt_acxfr_sort_seq(value);
			return;
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			disp_sort_seq(value);
			return;
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			stk_xfr_sort_seq(value);
			return;
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			xfr_sort_seq(value);
			return;
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			yield_sort_seq(value);
			return;
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			inpt_sort_seq(value);
			return;
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			dfct_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			purc_sort_seq(value);
			return;
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			purc_rtn_sort_seq(value);
			return;
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			purc_dscnt_sort_seq(value);
			return;
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			sls_sort_seq(value);
			return;
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			sls_rtn_sort_seq(value);
			return;
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			sls_dscnt_sort_seq(value);
			return;
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gr_sort_seq(value);
			return;
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gi_sort_seq(value);
			return;
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			inpt_acxfr_sort_seq(value);
			return;
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			disp_sort_seq(value);
			return;
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			stk_xfr_sort_seq(value);
			return;
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			xfr_sort_seq(value);
			return;
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			yield_sort_seq(value);
			return;
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			inpt_sort_seq(value);
			return;
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			dfct_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			purc_sort_seq(value);
			return;
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			purc_rtn_sort_seq(value);
			return;
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			purc_dscnt_sort_seq(value);
			return;
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			sls_sort_seq(value);
			return;
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			sls_rtn_sort_seq(value);
			return;
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			sls_dscnt_sort_seq(value);
			return;
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gr_sort_seq(value);
			return;
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gi_sort_seq(value);
			return;
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			inpt_acxfr_sort_seq(value);
			return;
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			disp_sort_seq(value);
			return;
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			stk_xfr_sort_seq(value);
			return;
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			xfr_sort_seq(value);
			return;
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			yield_sort_seq(value);
			return;
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			inpt_sort_seq(value);
			return;
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			dfct_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setTimestampNE(String name, MCTimestamp value) {
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($purc_rtn_flg.equalsIgnoreCase(name)) {
			purc_rtn_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($slo_xpns_purc_flg.equalsIgnoreCase(name)) {
			slo_xpns_purc_flg(value);
			return;
		}
		if ($purc_dscnt_flg.equalsIgnoreCase(name)) {
			purc_dscnt_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($sls_rtn_flg.equalsIgnoreCase(name)) {
			sls_rtn_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($sls_dscnt_flg.equalsIgnoreCase(name)) {
			sls_dscnt_flg(value);
			return;
		}
		if ($acxfr_gr_flg.equalsIgnoreCase(name)) {
			acxfr_gr_flg(value);
			return;
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			acxfr_gi_flg(value);
			return;
		}
		if ($disp_flg.equalsIgnoreCase(name)) {
			disp_flg(value);
			return;
		}
		if ($stk_xfr_flg.equalsIgnoreCase(name)) {
			stk_xfr_flg(value);
			return;
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			xfr_flg(value);
			return;
		}
		if ($yield_flg.equalsIgnoreCase(name)) {
			yield_flg(value);
			return;
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			not_stk_flg(value);
			return;
		}
		if ($loss_flg.equalsIgnoreCase(name)) {
			loss_flg(value);
			return;
		}
		if ($fxd_loss_flg.equalsIgnoreCase(name)) {
			fxd_loss_flg(value);
			return;
		}
		if ($not_lot_trace_flg.equalsIgnoreCase(name)) {
			not_lot_trace_flg(value);
			return;
		}
		if ($inpt_flg.equalsIgnoreCase(name)) {
			inpt_flg(value);
			return;
		}
		if ($dfct_flg.equalsIgnoreCase(name)) {
			dfct_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
