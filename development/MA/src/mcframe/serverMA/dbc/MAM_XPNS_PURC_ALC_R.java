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
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCDatePermColumn;
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
 * "経費配賦振替マスタ // Expenses allocation transfer master"DBコンテナRowクラスです。<p>
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
 *  	<td>K</td>
 *  	<td>xpns_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>xpns_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>xpns_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>xpns_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>ac_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会計理由ＣＤ</td>
 *  	<td>Accounting reason cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>calc_ctg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算カテゴリＣＤ</td>
 *  	<td>Calculation category cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>st_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>適用開始日</td>
 *  	<td>Application start date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>end_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>適用終了日</td>
 *  	<td>Application end date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_ac_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦科目ＣＤ</td>
 *  	<td>Allocation account cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦ワーキンググループＣＤ</td>
 *  	<td>Allocation WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>部門引継ＦＬＧ</td>
 *  	<td>Dept. copy flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先部門ＣＤ</td>
 *  	<td>Allocation destination dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引先引継ＦＬＧ</td>
 *  	<td>BP copy flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先取引先ＣＤ</td>
 *  	<td>Allocation destination BP cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_no_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロットＮＯ引継ＦＬＧ</td>
 *  	<td>Lot No. copy flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先ロットＮＯ</td>
 *  	<td>Allocation destination lot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sublot_no_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ引継ＦＬＧ</td>
 *  	<td>Sublot No. copy flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先サブロットＮＯ</td>
 *  	<td>Allocation destination sublot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno1_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１引継ＦＬＧ</td>
 *  	<td>SEIBAN No. 1 copy flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先手配ＮＯ１</td>
 *  	<td>Allocation destination SEIBAN No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno2_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２引継ＦＬＧ</td>
 *  	<td>SEIBAN No. 2 copy flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先手配ＮＯ２</td>
 *  	<td>Allocation destination SEIBAN No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno3_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３引継ＦＬＧ</td>
 *  	<td>SEIBAN No. 3 copy flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先手配ＮＯ３</td>
 *  	<td>Allocation destination SEIBAN No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno4_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４引継ＦＬＧ</td>
 *  	<td>SEIBAN No. 4 copy flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先手配ＮＯ４</td>
 *  	<td>Allocation destination SEIBAN No. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ctg_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先品群ＣＤ</td>
 *  	<td>Allocation destination item category cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先品目ＣＤ</td>
 *  	<td>Allocation destination item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先枝番１</td>
 *  	<td>Allocation destination branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先枝番２</td>
 *  	<td>Allocation destination branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先枝番３</td>
 *  	<td>Allocation destination branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先場所ＣＤ</td>
 *  	<td>Allocation destination location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先工程ＣＤ</td>
 *  	<td>Allocation destination operation cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>po_no_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注ＮＯ引継ＦＬＧ</td>
 *  	<td>PO No. copy flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_no_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注ＮＯ引継ＦＬＧ</td>
 *  	<td>Sales order No. copy flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>iv_no_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>インボイスＮＯ引継ＦＬＧ</td>
 *  	<td>Invoice No. copy flg.</td>
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
 *  	<td>xpns_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>ITM1.ITM_NM</td>
 *  	<td>品名</td>
 *  	<td>Item name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_rsn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>AC_RSN1.AC_RSN_NM</td>
 *  	<td>会計理由名</td>
 *  	<td>Accounting reason name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>calc_ctg_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>CALC_CTG1.CALC_CTG_NM</td>
 *  	<td>計算カテゴリ名</td>
 *  	<td>Calculation category name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>WG1.WG_NM</td>
 *  	<td>ワーキンググループ名</td>
 *  	<td>WG name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_ac_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>ALC_AC1.ALC_AC_NM</td>
 *  	<td>配賦科目名</td>
 *  	<td>Allocation account name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_ac_grp_cd1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td>ALC_AC1.ALC_AC_GRP_CD1</td>
 *  	<td>配賦科目グループＣＤ１</td>
 *  	<td>Allocation account group cd. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_ac_grp_cd2</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td>ALC_AC1.ALC_AC_GRP_CD2</td>
 *  	<td>配賦科目グループＣＤ２</td>
 *  	<td>Allocation account group cd. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_ac_grp_cd3</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td>ALC_AC1.ALC_AC_GRP_CD3</td>
 *  	<td>配賦科目グループＣＤ３</td>
 *  	<td>Allocation account group cd. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_wg_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>WG2.WG_NM</td>
 *  	<td>配賦ワーキンググループ名</td>
 *  	<td>Allocation WG name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>BP1.BP_NM</td>
 *  	<td>配賦先取引先名</td>
 *  	<td>Allocation destination BP name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ctg_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>COST_CTG1.CTG_NM</td>
 *  	<td>配賦先品群名</td>
 *  	<td>Allocation destination item category name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>ITM2.ITM_NM</td>
 *  	<td>配賦先品名</td>
 *  	<td>Allocation destination item name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>LOC1.LOC_NM</td>
 *  	<td>配賦先場所名</td>
 *  	<td>Allocation destination location name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>OPER1.OPER_NM</td>
 *  	<td>配賦先工程名</td>
 *  	<td>Allocation destination operation name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_XPNS_PURC_ALC_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_XPNS_PURC_ALC";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public static final String $xpns_itm_cd = "xpns_itm_cd";
	private static final MCPermColumnInfo _xpns_itm_cd = createColumnInfo("xpns_itm_cd");
	public final MCStringPermColumn xpns_itm_cd = createStringColumn(_xpns_itm_cd);
	
	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public static final String $xpns_itm_sub1 = "xpns_itm_sub1";
	private static final MCPermColumnInfo _xpns_itm_sub1 = createColumnInfo("xpns_itm_sub1");
	public final MCStringPermColumn xpns_itm_sub1 = createStringColumn(_xpns_itm_sub1);
	
	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public static final String $xpns_itm_sub2 = "xpns_itm_sub2";
	private static final MCPermColumnInfo _xpns_itm_sub2 = createColumnInfo("xpns_itm_sub2");
	public final MCStringPermColumn xpns_itm_sub2 = createStringColumn(_xpns_itm_sub2);
	
	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public static final String $xpns_itm_sub3 = "xpns_itm_sub3";
	private static final MCPermColumnInfo _xpns_itm_sub3 = createColumnInfo("xpns_itm_sub3");
	public final MCStringPermColumn xpns_itm_sub3 = createStringColumn(_xpns_itm_sub3);
	
	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	private static final MCPermColumnInfo _ac_rsn_cd = createColumnInfo("ac_rsn_cd");
	public final MCStringPermColumn ac_rsn_cd = createStringColumn(_ac_rsn_cd);
	
	/**
	 * 計算カテゴリＣＤ. Calculation category cd..<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	private static final MCPermColumnInfo _calc_ctg_cd = createColumnInfo("calc_ctg_cd");
	public final MCStringPermColumn calc_ctg_cd = createStringColumn(_calc_ctg_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	private static final MCPermColumnInfo _st_dt = createColumnInfo("st_dt");
	public final MCDatePermColumn st_dt = createDateColumn(_st_dt);
	
	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	private static final MCPermColumnInfo _end_dt = createColumnInfo("end_dt");
	public final MCDatePermColumn end_dt = createDateColumn(_end_dt);
	
	/**
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public static final String $alc_ac_cd = "alc_ac_cd";
	private static final MCPermColumnInfo _alc_ac_cd = createColumnInfo("alc_ac_cd");
	public final MCStringPermColumn alc_ac_cd = createStringColumn(_alc_ac_cd);
	
	/**
	 * 配賦ワーキンググループＣＤ. Allocation WG cd..<p>
	 *
	 */
	public static final String $alc_wg_cd = "alc_wg_cd";
	private static final MCPermColumnInfo _alc_wg_cd = createColumnInfo("alc_wg_cd");
	public final MCStringPermColumn alc_wg_cd = createStringColumn(_alc_wg_cd);
	
	/**
	 * 部門引継ＦＬＧ. Dept. copy flg..<p>
	 *
	 */
	public static final String $dpt_flg = "dpt_flg";
	private static final MCPermColumnInfo _dpt_flg = createColumnInfo("dpt_flg");
	public final MCBooleanPermColumn dpt_flg = createBooleanColumn(_dpt_flg);
	
	/**
	 * 配賦先部門ＣＤ. Allocation destination dept. cd..<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	private static final MCPermColumnInfo _dpt_cd = createColumnInfo("dpt_cd");
	public final MCStringPermColumn dpt_cd = createStringColumn(_dpt_cd);
	
	/**
	 * 取引先引継ＦＬＧ. BP copy flg..<p>
	 *
	 */
	public static final String $bp_flg = "bp_flg";
	private static final MCPermColumnInfo _bp_flg = createColumnInfo("bp_flg");
	public final MCBooleanPermColumn bp_flg = createBooleanColumn(_bp_flg);
	
	/**
	 * 配賦先取引先ＣＤ. Allocation destination BP cd..<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	private static final MCPermColumnInfo _bp_cd = createColumnInfo("bp_cd");
	public final MCStringPermColumn bp_cd = createStringColumn(_bp_cd);
	
	/**
	 * ロットＮＯ引継ＦＬＧ. Lot No. copy flg..<p>
	 *
	 */
	public static final String $lot_no_flg = "lot_no_flg";
	private static final MCPermColumnInfo _lot_no_flg = createColumnInfo("lot_no_flg");
	public final MCBooleanPermColumn lot_no_flg = createBooleanColumn(_lot_no_flg);
	
	/**
	 * 配賦先ロットＮＯ. Allocation destination lot No..<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	private static final MCPermColumnInfo _lot_no = createColumnInfo("lot_no");
	public final MCStringPermColumn lot_no = createStringColumn(_lot_no);
	
	/**
	 * サブロットＮＯ引継ＦＬＧ. Sublot No. copy flg..<p>
	 *
	 */
	public static final String $sublot_no_flg = "sublot_no_flg";
	private static final MCPermColumnInfo _sublot_no_flg = createColumnInfo("sublot_no_flg");
	public final MCBooleanPermColumn sublot_no_flg = createBooleanColumn(_sublot_no_flg);
	
	/**
	 * 配賦先サブロットＮＯ. Allocation destination sublot No..<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	private static final MCPermColumnInfo _sublot_no = createColumnInfo("sublot_no");
	public final MCStringPermColumn sublot_no = createStringColumn(_sublot_no);
	
	/**
	 * 手配ＮＯ１引継ＦＬＧ. SEIBAN No. 1 copy flg..<p>
	 *
	 */
	public static final String $sno1_flg = "sno1_flg";
	private static final MCPermColumnInfo _sno1_flg = createColumnInfo("sno1_flg");
	public final MCBooleanPermColumn sno1_flg = createBooleanColumn(_sno1_flg);
	
	/**
	 * 配賦先手配ＮＯ１. Allocation destination SEIBAN No. 1.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	private static final MCPermColumnInfo _sno1 = createColumnInfo("sno1");
	public final MCStringPermColumn sno1 = createStringColumn(_sno1);
	
	/**
	 * 手配ＮＯ２引継ＦＬＧ. SEIBAN No. 2 copy flg..<p>
	 *
	 */
	public static final String $sno2_flg = "sno2_flg";
	private static final MCPermColumnInfo _sno2_flg = createColumnInfo("sno2_flg");
	public final MCBooleanPermColumn sno2_flg = createBooleanColumn(_sno2_flg);
	
	/**
	 * 配賦先手配ＮＯ２. Allocation destination SEIBAN No. 2.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	private static final MCPermColumnInfo _sno2 = createColumnInfo("sno2");
	public final MCStringPermColumn sno2 = createStringColumn(_sno2);
	
	/**
	 * 手配ＮＯ３引継ＦＬＧ. SEIBAN No. 3 copy flg..<p>
	 *
	 */
	public static final String $sno3_flg = "sno3_flg";
	private static final MCPermColumnInfo _sno3_flg = createColumnInfo("sno3_flg");
	public final MCBooleanPermColumn sno3_flg = createBooleanColumn(_sno3_flg);
	
	/**
	 * 配賦先手配ＮＯ３. Allocation destination SEIBAN No. 3.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	private static final MCPermColumnInfo _sno3 = createColumnInfo("sno3");
	public final MCStringPermColumn sno3 = createStringColumn(_sno3);
	
	/**
	 * 手配ＮＯ４引継ＦＬＧ. SEIBAN No. 4 copy flg..<p>
	 *
	 */
	public static final String $sno4_flg = "sno4_flg";
	private static final MCPermColumnInfo _sno4_flg = createColumnInfo("sno4_flg");
	public final MCBooleanPermColumn sno4_flg = createBooleanColumn(_sno4_flg);
	
	/**
	 * 配賦先手配ＮＯ４. Allocation destination SEIBAN No. 4.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	private static final MCPermColumnInfo _sno4 = createColumnInfo("sno4");
	public final MCStringPermColumn sno4 = createStringColumn(_sno4);
	
	/**
	 * 配賦先品群ＣＤ. Allocation destination item category cd..<p>
	 *
	 */
	public static final String $ctg_cd = "ctg_cd";
	private static final MCPermColumnInfo _ctg_cd = createColumnInfo("ctg_cd");
	public final MCStringPermColumn ctg_cd = createStringColumn(_ctg_cd);
	
	/**
	 * 配賦先品目ＣＤ. Allocation destination item cd..<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	private static final MCPermColumnInfo _itm_cd = createColumnInfo("itm_cd");
	public final MCStringPermColumn itm_cd = createStringColumn(_itm_cd);
	
	/**
	 * 配賦先枝番１. Allocation destination branch No. 1.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	private static final MCPermColumnInfo _itm_sub1 = createColumnInfo("itm_sub1");
	public final MCStringPermColumn itm_sub1 = createStringColumn(_itm_sub1);
	
	/**
	 * 配賦先枝番２. Allocation destination branch No. 2.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	private static final MCPermColumnInfo _itm_sub2 = createColumnInfo("itm_sub2");
	public final MCStringPermColumn itm_sub2 = createStringColumn(_itm_sub2);
	
	/**
	 * 配賦先枝番３. Allocation destination branch No. 3.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	private static final MCPermColumnInfo _itm_sub3 = createColumnInfo("itm_sub3");
	public final MCStringPermColumn itm_sub3 = createStringColumn(_itm_sub3);
	
	/**
	 * 配賦先場所ＣＤ. Allocation destination location cd..<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	private static final MCPermColumnInfo _loc_cd = createColumnInfo("loc_cd");
	public final MCStringPermColumn loc_cd = createStringColumn(_loc_cd);
	
	/**
	 * 配賦先工程ＣＤ. Allocation destination operation cd..<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	private static final MCPermColumnInfo _oper_cd = createColumnInfo("oper_cd");
	public final MCStringPermColumn oper_cd = createStringColumn(_oper_cd);
	
	/**
	 * 発注ＮＯ引継ＦＬＧ. PO No. copy flg..<p>
	 *
	 */
	public static final String $po_no_flg = "po_no_flg";
	private static final MCPermColumnInfo _po_no_flg = createColumnInfo("po_no_flg");
	public final MCBooleanPermColumn po_no_flg = createBooleanColumn(_po_no_flg);
	
	/**
	 * 受注ＮＯ引継ＦＬＧ. Sales order No. copy flg..<p>
	 *
	 */
	public static final String $slo_no_flg = "slo_no_flg";
	private static final MCPermColumnInfo _slo_no_flg = createColumnInfo("slo_no_flg");
	public final MCBooleanPermColumn slo_no_flg = createBooleanColumn(_slo_no_flg);
	
	/**
	 * インボイスＮＯ引継ＦＬＧ. Invoice No. copy flg..<p>
	 *
	 */
	public static final String $iv_no_flg = "iv_no_flg";
	private static final MCPermColumnInfo _iv_no_flg = createColumnInfo("iv_no_flg");
	public final MCBooleanPermColumn iv_no_flg = createBooleanColumn(_iv_no_flg);
	
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
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $xpns_itm_nm = "xpns_itm_nm";
	
	/**
	 * 会計理由名. Accounting reason name.<p>
	 *
	 */
	public static final String $ac_rsn_nm = "ac_rsn_nm";
	
	/**
	 * 計算カテゴリ名. Calculation category name.<p>
	 *
	 */
	public static final String $calc_ctg_nm = "calc_ctg_nm";
	
	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	
	/**
	 * 配賦科目名. Allocation account name.<p>
	 *
	 */
	public static final String $alc_ac_nm = "alc_ac_nm";
	
	/**
	 * 配賦科目グループＣＤ１. Allocation account group cd. 1.<p>
	 *
	 */
	public static final String $alc_ac_grp_cd1 = "alc_ac_grp_cd1";
	
	/**
	 * 配賦科目グループＣＤ２. Allocation account group cd. 2.<p>
	 *
	 */
	public static final String $alc_ac_grp_cd2 = "alc_ac_grp_cd2";
	
	/**
	 * 配賦科目グループＣＤ３. Allocation account group cd. 3.<p>
	 *
	 */
	public static final String $alc_ac_grp_cd3 = "alc_ac_grp_cd3";
	
	/**
	 * 配賦ワーキンググループ名. Allocation WG name.<p>
	 *
	 */
	public static final String $alc_wg_nm = "alc_wg_nm";
	
	/**
	 * 配賦先取引先名. Allocation destination BP name.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	
	/**
	 * 配賦先品群名. Allocation destination item category name.<p>
	 *
	 */
	public static final String $ctg_nm = "ctg_nm";
	
	/**
	 * 配賦先品名. Allocation destination item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	
	/**
	 * 配賦先場所名. Allocation destination location name.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	
	/**
	 * 配賦先工程名. Allocation destination operation name.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	
	public static final MCMeta xpns_itm_cd_META = createCommonMeta($xpns_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta xpns_itm_sub1_META = createCommonMeta($xpns_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta xpns_itm_sub2_META = createCommonMeta($xpns_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta xpns_itm_sub3_META = createCommonMeta($xpns_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta alc_ac_cd_META = createCommonMeta($alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta alc_wg_cd_META = createCommonMeta($alc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta dpt_flg_META = createCommonMeta($dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta bp_flg_META = createCommonMeta($bp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta lot_no_flg_META = createCommonMeta($lot_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_flg_META = createCommonMeta($sublot_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_flg_META = createCommonMeta($sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_flg_META = createCommonMeta($sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_flg_META = createCommonMeta($sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_flg_META = createCommonMeta($sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta ctg_cd_META = createCommonMeta($ctg_cd, mcframe.commonMA.meta.MA_META.COST_CTG_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta po_no_flg_META = createCommonMeta($po_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_no_flg_META = createCommonMeta($slo_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_no_flg_META = createCommonMeta($iv_no_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta xpns_itm_nm_META = createCommonMeta($xpns_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta alc_ac_nm_META = createCommonMeta($alc_ac_nm, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta alc_ac_grp_cd1_META = createCommonMeta($alc_ac_grp_cd1, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta alc_ac_grp_cd2_META = createCommonMeta($alc_ac_grp_cd2, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta alc_ac_grp_cd3_META = createCommonMeta($alc_ac_grp_cd3, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta alc_wg_nm_META = createCommonMeta($alc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ctg_nm_META = createCommonMeta($ctg_nm, mcframe.commonMA.meta.MA_META.COST_CTG_NM);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $ITM1 = "ITM1";
	public static final String $AC_RSN1 = "AC_RSN1";
	public static final String $CALC_CTG1 = "CALC_CTG1";
	public static final String $WG1 = "WG1";
	public static final String $ALC_AC1 = "ALC_AC1";
	public static final String $WG2 = "WG2";
	public static final String $BP1 = "BP1";
	public static final String $COST_CTG1 = "COST_CTG1";
	public static final String $ITM2 = "ITM2";
	public static final String $LOC1 = "LOC1";
	public static final String $OPER1 = "OPER1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM",
				$ITM1,
				new String[][]{
						{"xpns_itm_cd", "itm_cd"},
						{"xpns_itm_sub1", "itm_sub1"},
						{"xpns_itm_sub2", "itm_sub2"},
						{"xpns_itm_sub3", "itm_sub3"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ITM_R.create("ITM1");
				},
				(alias) -> {
					MAM_XPNS_PURC_ALC_R own = MAM_XPNS_PURC_ALC_R.create(alias);
					mcframe.serverMA.dbc.MAM_ITM_R ref = mcframe.serverMA.dbc.MAM_ITM_R.create("ITM1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.xpns_itm_cd.eq(ref.itm_cd));
					cond = cond.and(own.xpns_itm_sub1.eq(ref.itm_sub1));
					cond = cond.and(own.xpns_itm_sub2.eq(ref.itm_sub2));
					cond = cond.and(own.xpns_itm_sub3.eq(ref.itm_sub3));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_AC_RSN",
				$AC_RSN1,
				new String[][]{
						{"ac_rsn_cd", "ac_rsn_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_AC_RSN_R.create("AC_RSN1");
				},
				(alias) -> {
					MAM_XPNS_PURC_ALC_R own = MAM_XPNS_PURC_ALC_R.create(alias);
					mcframe.serverMA.dbc.MAM_AC_RSN_R ref = mcframe.serverMA.dbc.MAM_AC_RSN_R.create("AC_RSN1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.ac_rsn_cd.eq(ref.ac_rsn_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CALC_CTG",
				$CALC_CTG1,
				new String[][]{
						{"calc_ctg_cd", "calc_ctg_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CALC_CTG_R.create("CALC_CTG1");
				},
				(alias) -> {
					MAM_XPNS_PURC_ALC_R own = MAM_XPNS_PURC_ALC_R.create(alias);
					mcframe.serverMA.dbc.MAM_CALC_CTG_R ref = mcframe.serverMA.dbc.MAM_CALC_CTG_R.create("CALC_CTG1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.calc_ctg_cd.eq(ref.calc_ctg_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_WG",
				$WG1,
				new String[][]{
						{"wg_cd", "wg_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_WG_R.create("WG1");
				},
				(alias) -> {
					MAM_XPNS_PURC_ALC_R own = MAM_XPNS_PURC_ALC_R.create(alias);
					mcframe.serverMA.dbc.MAM_WG_R ref = mcframe.serverMA.dbc.MAM_WG_R.create("WG1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.wg_cd.eq(ref.wg_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ALC_AC",
				$ALC_AC1,
				new String[][]{
						{"alc_ac_cd", "alc_ac_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ALC_AC_R.create("ALC_AC1");
				},
				(alias) -> {
					MAM_XPNS_PURC_ALC_R own = MAM_XPNS_PURC_ALC_R.create(alias);
					mcframe.serverMA.dbc.MAM_ALC_AC_R ref = mcframe.serverMA.dbc.MAM_ALC_AC_R.create("ALC_AC1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.alc_ac_cd.eq(ref.alc_ac_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_WG",
				$WG2,
				new String[][]{
						{"alc_wg_cd", "wg_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_WG_R.create("WG2");
				},
				(alias) -> {
					MAM_XPNS_PURC_ALC_R own = MAM_XPNS_PURC_ALC_R.create(alias);
					mcframe.serverMA.dbc.MAM_WG_R ref = mcframe.serverMA.dbc.MAM_WG_R.create("WG2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.alc_wg_cd.eq(ref.wg_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_BP",
				$BP1,
				new String[][]{
						{"bp_cd", "bp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_BP_R.create("BP1");
				},
				(alias) -> {
					MAM_XPNS_PURC_ALC_R own = MAM_XPNS_PURC_ALC_R.create(alias);
					mcframe.serverMA.dbc.MAM_BP_R ref = mcframe.serverMA.dbc.MAM_BP_R.create("BP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.bp_cd.eq(ref.bp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_COST_CTG",
				$COST_CTG1,
				new String[][]{
						{"ctg_cd", "ctg_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_COST_CTG_R.create("COST_CTG1");
				},
				(alias) -> {
					MAM_XPNS_PURC_ALC_R own = MAM_XPNS_PURC_ALC_R.create(alias);
					mcframe.serverMA.dbc.MAM_COST_CTG_R ref = mcframe.serverMA.dbc.MAM_COST_CTG_R.create("COST_CTG1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.ctg_cd.eq(ref.ctg_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM",
				$ITM2,
				new String[][]{
						{"itm_cd", "itm_cd"},
						{"itm_sub1", "itm_sub1"},
						{"itm_sub2", "itm_sub2"},
						{"itm_sub3", "itm_sub3"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ITM_R.create("ITM2");
				},
				(alias) -> {
					MAM_XPNS_PURC_ALC_R own = MAM_XPNS_PURC_ALC_R.create(alias);
					mcframe.serverMA.dbc.MAM_ITM_R ref = mcframe.serverMA.dbc.MAM_ITM_R.create("ITM2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.itm_cd.eq(ref.itm_cd));
					cond = cond.and(own.itm_sub1.eq(ref.itm_sub1));
					cond = cond.and(own.itm_sub2.eq(ref.itm_sub2));
					cond = cond.and(own.itm_sub3.eq(ref.itm_sub3));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_LOC",
				$LOC1,
				new String[][]{
						{"loc_cd", "loc_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_LOC_R.create("LOC1");
				},
				(alias) -> {
					MAM_XPNS_PURC_ALC_R own = MAM_XPNS_PURC_ALC_R.create(alias);
					mcframe.serverMA.dbc.MAM_LOC_R ref = mcframe.serverMA.dbc.MAM_LOC_R.create("LOC1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.loc_cd.eq(ref.loc_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_OPER",
				$OPER1,
				new String[][]{
						{"oper_cd", "oper_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_OPER_R.create("OPER1");
				},
				(alias) -> {
					MAM_XPNS_PURC_ALC_R own = MAM_XPNS_PURC_ALC_R.create(alias);
					mcframe.serverMA.dbc.MAM_OPER_R ref = mcframe.serverMA.dbc.MAM_OPER_R.create("OPER1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.oper_cd.eq(ref.oper_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_XPNS_PURC_ALC_R> constMetas = new ConstMetaList<MAM_XPNS_PURC_ALC_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			xpns_itm_cd_META,
			xpns_itm_sub1_META,
			xpns_itm_sub2_META,
			xpns_itm_sub3_META,
			ac_rsn_cd_META,
			calc_ctg_cd_META,
			wg_cd_META,
			st_dt_META,
			end_dt_META,
			alc_ac_cd_META,
			alc_wg_cd_META,
			dpt_flg_META,
			dpt_cd_META,
			bp_flg_META,
			bp_cd_META,
			lot_no_flg_META,
			lot_no_META,
			sublot_no_flg_META,
			sublot_no_META,
			sno1_flg_META,
			sno1_META,
			sno2_flg_META,
			sno2_META,
			sno3_flg_META,
			sno3_META,
			sno4_flg_META,
			sno4_META,
			ctg_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			loc_cd_META,
			oper_cd_META,
			po_no_flg_META,
			slo_no_flg_META,
			iv_no_flg_META,
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
			xpns_itm_nm_META,
			ac_rsn_nm_META,
			calc_ctg_nm_META,
			wg_nm_META,
			alc_ac_nm_META,
			alc_ac_grp_cd1_META,
			alc_ac_grp_cd2_META,
			alc_ac_grp_cd3_META,
			alc_wg_nm_META,
			bp_nm_META,
			ctg_nm_META,
			itm_nm_META,
			loc_nm_META,
			oper_nm_META
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
	protected MAM_XPNS_PURC_ALC_R(ConstMetaList<? extends MAM_XPNS_PURC_ALC_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_XPNS_PURC_ALC_R(ConstMetaList<? extends MAM_XPNS_PURC_ALC_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$xpns_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$xpns_itm_cd,
				"xpns_itm_cd",
				xpns_itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$xpns_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$xpns_itm_sub1,
				"xpns_itm_sub1",
				xpns_itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$xpns_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$xpns_itm_sub2,
				"xpns_itm_sub2",
				xpns_itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$xpns_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$xpns_itm_sub3,
				"xpns_itm_sub3",
				xpns_itm_sub3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$ac_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$ac_rsn_cd,
				"ac_rsn_cd",
				ac_rsn_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$calc_ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$calc_ctg_cd,
				"calc_ctg_cd",
				calc_ctg_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$wg_cd,
				"wg_cd",
				wg_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_XPNS_PURC_ALC_R.$st_dt,
				"st_dt",
				st_dt,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_XPNS_PURC_ALC_R.$end_dt,
				"end_dt",
				end_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$alc_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$alc_ac_cd,
				"alc_ac_cd",
				alc_ac_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$alc_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$alc_wg_cd,
				"alc_wg_cd",
				alc_wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$dpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_XPNS_PURC_ALC_R.$dpt_flg,
				"dpt_flg",
				dpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$dpt_cd,
				"dpt_cd",
				dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$bp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_XPNS_PURC_ALC_R.$bp_flg,
				"bp_flg",
				bp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$bp_cd,
				"bp_cd",
				bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$lot_no_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_XPNS_PURC_ALC_R.$lot_no_flg,
				"lot_no_flg",
				lot_no_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$lot_no,
				"lot_no",
				lot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$sublot_no_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_XPNS_PURC_ALC_R.$sublot_no_flg,
				"sublot_no_flg",
				sublot_no_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$sublot_no,
				"sublot_no",
				sublot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$sno1_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_XPNS_PURC_ALC_R.$sno1_flg,
				"sno1_flg",
				sno1_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$sno1,
				"sno1",
				sno1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$sno2_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_XPNS_PURC_ALC_R.$sno2_flg,
				"sno2_flg",
				sno2_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$sno2,
				"sno2",
				sno2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$sno3_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_XPNS_PURC_ALC_R.$sno3_flg,
				"sno3_flg",
				sno3_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$sno3,
				"sno3",
				sno3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$sno4_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_XPNS_PURC_ALC_R.$sno4_flg,
				"sno4_flg",
				sno4_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$sno4,
				"sno4",
				sno4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$ctg_cd,
				"ctg_cd",
				ctg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$itm_cd,
				"itm_cd",
				itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$loc_cd,
				"loc_cd",
				loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$oper_cd,
				"oper_cd",
				oper_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$po_no_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_XPNS_PURC_ALC_R.$po_no_flg,
				"po_no_flg",
				po_no_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$slo_no_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_XPNS_PURC_ALC_R.$slo_no_flg,
				"slo_no_flg",
				slo_no_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$iv_no_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_XPNS_PURC_ALC_R.$iv_no_flg,
				"iv_no_flg",
				iv_no_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$memo1,
				"memo1",
				memo1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$memo2,
				"memo2",
				memo2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$memo3,
				"memo3",
				memo3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_XPNS_PURC_ALC_R.$del_flg,
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
			MAM_XPNS_PURC_ALC_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$del_usr_id,
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
			MAM_XPNS_PURC_ALC_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$del_usr_nm,
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
			MAM_XPNS_PURC_ALC_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_XPNS_PURC_ALC_R.$del_ts,
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
			MAM_XPNS_PURC_ALC_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$ins_usr_id,
				"ins_usr_id",
				ins_usr_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$ins_usr_nm,
				"ins_usr_nm",
				ins_usr_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_XPNS_PURC_ALC_R.$ins_ts,
				"ins_ts",
				ins_ts,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$ins_func_id,
				"ins_func_id",
				ins_func_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_XPNS_PURC_ALC_R.$upd_cntr,
				"upd_cntr",
				upd_cntr,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$upd_usr_id,
				"upd_usr_id",
				upd_usr_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$upd_usr_nm,
				"upd_usr_nm",
				upd_usr_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_XPNS_PURC_ALC_R.$upd_ts,
				"upd_ts",
				upd_ts,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$upd_func_id,
				"upd_func_id",
				upd_func_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$upd_srv_req_no,
				"upd_srv_req_no",
				upd_srv_req_no,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$xpns_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$xpns_itm_nm,
				"xpns_itm_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ITM1.ITM_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$ac_rsn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$ac_rsn_nm,
				"ac_rsn_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"AC_RSN1.AC_RSN_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$calc_ctg_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$calc_ctg_nm,
				"calc_ctg_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"CALC_CTG1.CALC_CTG_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$wg_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$wg_nm,
				"wg_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"WG1.WG_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$alc_ac_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$alc_ac_nm,
				"alc_ac_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ALC_AC1.ALC_AC_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$alc_ac_grp_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$alc_ac_grp_cd1,
				"alc_ac_grp_cd1",
				null,
				false,
				true,
				false,
				false,
				true,
				"ALC_AC1.ALC_AC_GRP_CD1"
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$alc_ac_grp_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$alc_ac_grp_cd2,
				"alc_ac_grp_cd2",
				null,
				false,
				true,
				false,
				false,
				true,
				"ALC_AC1.ALC_AC_GRP_CD2"
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$alc_ac_grp_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$alc_ac_grp_cd3,
				"alc_ac_grp_cd3",
				null,
				false,
				true,
				false,
				false,
				true,
				"ALC_AC1.ALC_AC_GRP_CD3"
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$alc_wg_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$alc_wg_nm,
				"alc_wg_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"WG2.WG_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$bp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$bp_nm,
				"bp_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"BP1.BP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$ctg_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$ctg_nm,
				"ctg_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"COST_CTG1.CTG_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$itm_nm,
				"itm_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ITM2.ITM_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$loc_nm,
				"loc_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"LOC1.LOC_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_XPNS_PURC_ALC_R.$oper_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_XPNS_PURC_ALC_R.$oper_nm,
				"oper_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"OPER1.OPER_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_XPNS_PURC_ALC_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_XPNS_PURC_ALC_R create(String alias) {
		MAM_XPNS_PURC_ALC_R row = new MAM_XPNS_PURC_ALC_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_XPNS_PURC_ALC_R createByName(T proto) {
		MAM_XPNS_PURC_ALC_R row = MAM_XPNS_PURC_ALC_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_XPNS_PURC_ALC_R clone() {
		return (MAM_XPNS_PURC_ALC_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_XPNS_PURC_ALC_R createInstance() {
		return (MAM_XPNS_PURC_ALC_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_XPNS_PURC_ALC_R getValues(String... names) {
		return (MAM_XPNS_PURC_ALC_R) super.getValues(names);
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
		return true;
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
	 public MAW_XPNS_PURC_ALC_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_XPNS_PURC_ALC_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_XPNS_PURC_ALC_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_XPNS_PURC_ALC_KEY_R.TABLE_NAME);
	 }

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String xpns_itm_cd() {
		return getConstString(offset + 0, $xpns_itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void xpns_itm_cd(String value) {
		setConstString(offset + 0, $xpns_itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String xpns_itm_sub1() {
		return getConstString(offset + 1, $xpns_itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void xpns_itm_sub1(String value) {
		setConstString(offset + 1, $xpns_itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String xpns_itm_sub2() {
		return getConstString(offset + 2, $xpns_itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void xpns_itm_sub2(String value) {
		setConstString(offset + 2, $xpns_itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String xpns_itm_sub3() {
		return getConstString(offset + 3, $xpns_itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void xpns_itm_sub3(String value) {
		setConstString(offset + 3, $xpns_itm_sub3, value);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 4, $ac_rsn_cd);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 4, $ac_rsn_cd, value);
	}

	/**
	 * 計算カテゴリＣＤ. Calculation category cd..<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 5, $calc_ctg_cd);
	}

	/**
	 * 計算カテゴリＣＤ. Calculation category cd..<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 5, $calc_ctg_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 6, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 6, $wg_cd, value);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 7, $st_dt);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 7, $st_dt, value);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 8, $end_dt);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 8, $end_dt, value);
	}

	/**
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public String alc_ac_cd() {
		return getConstString(offset + 9, $alc_ac_cd);
	}

	/**
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		setConstString(offset + 9, $alc_ac_cd, value);
	}

	/**
	 * 配賦ワーキンググループＣＤ. Allocation WG cd..<p>
	 *
	 */
	public String alc_wg_cd() {
		return getConstString(offset + 10, $alc_wg_cd);
	}

	/**
	 * 配賦ワーキンググループＣＤ. Allocation WG cd..<p>
	 *
	 */
	public void alc_wg_cd(String value) {
		setConstString(offset + 10, $alc_wg_cd, value);
	}

	/**
	 * 部門引継ＦＬＧ. Dept. copy flg..<p>
	 *
	 */
	public boolean dpt_flg() {
		return getConstBoolean(offset + 11, $dpt_flg);
	}

	/**
	 * 部門引継ＦＬＧ. Dept. copy flg..<p>
	 *
	 */
	public void dpt_flg(boolean value) {
		setConstBoolean(offset + 11, $dpt_flg, value);
	}

	/**
	 * 配賦先部門ＣＤ. Allocation destination dept. cd..<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 12, $dpt_cd);
	}

	/**
	 * 配賦先部門ＣＤ. Allocation destination dept. cd..<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 12, $dpt_cd, value);
	}

	/**
	 * 取引先引継ＦＬＧ. BP copy flg..<p>
	 *
	 */
	public boolean bp_flg() {
		return getConstBoolean(offset + 13, $bp_flg);
	}

	/**
	 * 取引先引継ＦＬＧ. BP copy flg..<p>
	 *
	 */
	public void bp_flg(boolean value) {
		setConstBoolean(offset + 13, $bp_flg, value);
	}

	/**
	 * 配賦先取引先ＣＤ. Allocation destination BP cd..<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 14, $bp_cd);
	}

	/**
	 * 配賦先取引先ＣＤ. Allocation destination BP cd..<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 14, $bp_cd, value);
	}

	/**
	 * ロットＮＯ引継ＦＬＧ. Lot No. copy flg..<p>
	 *
	 */
	public boolean lot_no_flg() {
		return getConstBoolean(offset + 15, $lot_no_flg);
	}

	/**
	 * ロットＮＯ引継ＦＬＧ. Lot No. copy flg..<p>
	 *
	 */
	public void lot_no_flg(boolean value) {
		setConstBoolean(offset + 15, $lot_no_flg, value);
	}

	/**
	 * 配賦先ロットＮＯ. Allocation destination lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 16, $lot_no);
	}

	/**
	 * 配賦先ロットＮＯ. Allocation destination lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 16, $lot_no, value);
	}

	/**
	 * サブロットＮＯ引継ＦＬＧ. Sublot No. copy flg..<p>
	 *
	 */
	public boolean sublot_no_flg() {
		return getConstBoolean(offset + 17, $sublot_no_flg);
	}

	/**
	 * サブロットＮＯ引継ＦＬＧ. Sublot No. copy flg..<p>
	 *
	 */
	public void sublot_no_flg(boolean value) {
		setConstBoolean(offset + 17, $sublot_no_flg, value);
	}

	/**
	 * 配賦先サブロットＮＯ. Allocation destination sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 18, $sublot_no);
	}

	/**
	 * 配賦先サブロットＮＯ. Allocation destination sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 18, $sublot_no, value);
	}

	/**
	 * 手配ＮＯ１引継ＦＬＧ. SEIBAN No. 1 copy flg..<p>
	 *
	 */
	public boolean sno1_flg() {
		return getConstBoolean(offset + 19, $sno1_flg);
	}

	/**
	 * 手配ＮＯ１引継ＦＬＧ. SEIBAN No. 1 copy flg..<p>
	 *
	 */
	public void sno1_flg(boolean value) {
		setConstBoolean(offset + 19, $sno1_flg, value);
	}

	/**
	 * 配賦先手配ＮＯ１. Allocation destination SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 20, $sno1);
	}

	/**
	 * 配賦先手配ＮＯ１. Allocation destination SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 20, $sno1, value);
	}

	/**
	 * 手配ＮＯ２引継ＦＬＧ. SEIBAN No. 2 copy flg..<p>
	 *
	 */
	public boolean sno2_flg() {
		return getConstBoolean(offset + 21, $sno2_flg);
	}

	/**
	 * 手配ＮＯ２引継ＦＬＧ. SEIBAN No. 2 copy flg..<p>
	 *
	 */
	public void sno2_flg(boolean value) {
		setConstBoolean(offset + 21, $sno2_flg, value);
	}

	/**
	 * 配賦先手配ＮＯ２. Allocation destination SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 22, $sno2);
	}

	/**
	 * 配賦先手配ＮＯ２. Allocation destination SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 22, $sno2, value);
	}

	/**
	 * 手配ＮＯ３引継ＦＬＧ. SEIBAN No. 3 copy flg..<p>
	 *
	 */
	public boolean sno3_flg() {
		return getConstBoolean(offset + 23, $sno3_flg);
	}

	/**
	 * 手配ＮＯ３引継ＦＬＧ. SEIBAN No. 3 copy flg..<p>
	 *
	 */
	public void sno3_flg(boolean value) {
		setConstBoolean(offset + 23, $sno3_flg, value);
	}

	/**
	 * 配賦先手配ＮＯ３. Allocation destination SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 24, $sno3);
	}

	/**
	 * 配賦先手配ＮＯ３. Allocation destination SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 24, $sno3, value);
	}

	/**
	 * 手配ＮＯ４引継ＦＬＧ. SEIBAN No. 4 copy flg..<p>
	 *
	 */
	public boolean sno4_flg() {
		return getConstBoolean(offset + 25, $sno4_flg);
	}

	/**
	 * 手配ＮＯ４引継ＦＬＧ. SEIBAN No. 4 copy flg..<p>
	 *
	 */
	public void sno4_flg(boolean value) {
		setConstBoolean(offset + 25, $sno4_flg, value);
	}

	/**
	 * 配賦先手配ＮＯ４. Allocation destination SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 26, $sno4);
	}

	/**
	 * 配賦先手配ＮＯ４. Allocation destination SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 26, $sno4, value);
	}

	/**
	 * 配賦先品群ＣＤ. Allocation destination item category cd..<p>
	 *
	 */
	public String ctg_cd() {
		return getConstString(offset + 27, $ctg_cd);
	}

	/**
	 * 配賦先品群ＣＤ. Allocation destination item category cd..<p>
	 *
	 */
	public void ctg_cd(String value) {
		setConstString(offset + 27, $ctg_cd, value);
	}

	/**
	 * 配賦先品目ＣＤ. Allocation destination item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 28, $itm_cd);
	}

	/**
	 * 配賦先品目ＣＤ. Allocation destination item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 28, $itm_cd, value);
	}

	/**
	 * 配賦先枝番１. Allocation destination branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 29, $itm_sub1);
	}

	/**
	 * 配賦先枝番１. Allocation destination branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 29, $itm_sub1, value);
	}

	/**
	 * 配賦先枝番２. Allocation destination branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 30, $itm_sub2);
	}

	/**
	 * 配賦先枝番２. Allocation destination branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 30, $itm_sub2, value);
	}

	/**
	 * 配賦先枝番３. Allocation destination branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 31, $itm_sub3);
	}

	/**
	 * 配賦先枝番３. Allocation destination branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 31, $itm_sub3, value);
	}

	/**
	 * 配賦先場所ＣＤ. Allocation destination location cd..<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 32, $loc_cd);
	}

	/**
	 * 配賦先場所ＣＤ. Allocation destination location cd..<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 32, $loc_cd, value);
	}

	/**
	 * 配賦先工程ＣＤ. Allocation destination operation cd..<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 33, $oper_cd);
	}

	/**
	 * 配賦先工程ＣＤ. Allocation destination operation cd..<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 33, $oper_cd, value);
	}

	/**
	 * 発注ＮＯ引継ＦＬＧ. PO No. copy flg..<p>
	 *
	 */
	public boolean po_no_flg() {
		return getConstBoolean(offset + 34, $po_no_flg);
	}

	/**
	 * 発注ＮＯ引継ＦＬＧ. PO No. copy flg..<p>
	 *
	 */
	public void po_no_flg(boolean value) {
		setConstBoolean(offset + 34, $po_no_flg, value);
	}

	/**
	 * 受注ＮＯ引継ＦＬＧ. Sales order No. copy flg..<p>
	 *
	 */
	public boolean slo_no_flg() {
		return getConstBoolean(offset + 35, $slo_no_flg);
	}

	/**
	 * 受注ＮＯ引継ＦＬＧ. Sales order No. copy flg..<p>
	 *
	 */
	public void slo_no_flg(boolean value) {
		setConstBoolean(offset + 35, $slo_no_flg, value);
	}

	/**
	 * インボイスＮＯ引継ＦＬＧ. Invoice No. copy flg..<p>
	 *
	 */
	public boolean iv_no_flg() {
		return getConstBoolean(offset + 36, $iv_no_flg);
	}

	/**
	 * インボイスＮＯ引継ＦＬＧ. Invoice No. copy flg..<p>
	 *
	 */
	public void iv_no_flg(boolean value) {
		setConstBoolean(offset + 36, $iv_no_flg, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 37, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 37, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 38, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 38, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 39, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 39, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 40, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 40, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 41, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 41, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 42, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 42, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 43, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 43, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 44, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 44, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 45, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 45, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 46, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 46, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 47, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 47, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 48, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 49, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 49, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 50, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 50, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 51, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 51, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 52, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 52, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 53, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 53, $upd_srv_req_no, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String xpns_itm_nm() {
		return getConstString(offset + 54, $xpns_itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void xpns_itm_nm(String value) {
		setConstString(offset + 54, $xpns_itm_nm, value);
	}

	/**
	 * 会計理由名. Accounting reason name.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 55, $ac_rsn_nm);
	}

	/**
	 * 会計理由名. Accounting reason name.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 55, $ac_rsn_nm, value);
	}

	/**
	 * 計算カテゴリ名. Calculation category name.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 56, $calc_ctg_nm);
	}

	/**
	 * 計算カテゴリ名. Calculation category name.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 56, $calc_ctg_nm, value);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 57, $wg_nm);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 57, $wg_nm, value);
	}

	/**
	 * 配賦科目名. Allocation account name.<p>
	 *
	 */
	public String alc_ac_nm() {
		return getConstString(offset + 58, $alc_ac_nm);
	}

	/**
	 * 配賦科目名. Allocation account name.<p>
	 *
	 */
	public void alc_ac_nm(String value) {
		setConstString(offset + 58, $alc_ac_nm, value);
	}

	/**
	 * 配賦科目グループＣＤ１. Allocation account group cd. 1.<p>
	 *
	 */
	public String alc_ac_grp_cd1() {
		return getConstString(offset + 59, $alc_ac_grp_cd1);
	}

	/**
	 * 配賦科目グループＣＤ１. Allocation account group cd. 1.<p>
	 *
	 */
	public void alc_ac_grp_cd1(String value) {
		setConstString(offset + 59, $alc_ac_grp_cd1, value);
	}

	/**
	 * 配賦科目グループＣＤ２. Allocation account group cd. 2.<p>
	 *
	 */
	public String alc_ac_grp_cd2() {
		return getConstString(offset + 60, $alc_ac_grp_cd2);
	}

	/**
	 * 配賦科目グループＣＤ２. Allocation account group cd. 2.<p>
	 *
	 */
	public void alc_ac_grp_cd2(String value) {
		setConstString(offset + 60, $alc_ac_grp_cd2, value);
	}

	/**
	 * 配賦科目グループＣＤ３. Allocation account group cd. 3.<p>
	 *
	 */
	public String alc_ac_grp_cd3() {
		return getConstString(offset + 61, $alc_ac_grp_cd3);
	}

	/**
	 * 配賦科目グループＣＤ３. Allocation account group cd. 3.<p>
	 *
	 */
	public void alc_ac_grp_cd3(String value) {
		setConstString(offset + 61, $alc_ac_grp_cd3, value);
	}

	/**
	 * 配賦ワーキンググループ名. Allocation WG name.<p>
	 *
	 */
	public String alc_wg_nm() {
		return getConstString(offset + 62, $alc_wg_nm);
	}

	/**
	 * 配賦ワーキンググループ名. Allocation WG name.<p>
	 *
	 */
	public void alc_wg_nm(String value) {
		setConstString(offset + 62, $alc_wg_nm, value);
	}

	/**
	 * 配賦先取引先名. Allocation destination BP name.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 63, $bp_nm);
	}

	/**
	 * 配賦先取引先名. Allocation destination BP name.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 63, $bp_nm, value);
	}

	/**
	 * 配賦先品群名. Allocation destination item category name.<p>
	 *
	 */
	public String ctg_nm() {
		return getConstString(offset + 64, $ctg_nm);
	}

	/**
	 * 配賦先品群名. Allocation destination item category name.<p>
	 *
	 */
	public void ctg_nm(String value) {
		setConstString(offset + 64, $ctg_nm, value);
	}

	/**
	 * 配賦先品名. Allocation destination item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 65, $itm_nm);
	}

	/**
	 * 配賦先品名. Allocation destination item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 65, $itm_nm, value);
	}

	/**
	 * 配賦先場所名. Allocation destination location name.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 66, $loc_nm);
	}

	/**
	 * 配賦先場所名. Allocation destination location name.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 66, $loc_nm, value);
	}

	/**
	 * 配賦先工程名. Allocation destination operation name.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 67, $oper_nm);
	}

	/**
	 * 配賦先工程名. Allocation destination operation name.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 67, $oper_nm, value);
	}

	public String getString(String name) {
		if ($xpns_itm_cd.equalsIgnoreCase(name)) {
			return xpns_itm_cd();
		}
		if ($xpns_itm_sub1.equalsIgnoreCase(name)) {
			return xpns_itm_sub1();
		}
		if ($xpns_itm_sub2.equalsIgnoreCase(name)) {
			return xpns_itm_sub2();
		}
		if ($xpns_itm_sub3.equalsIgnoreCase(name)) {
			return xpns_itm_sub3();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_wg_cd.equalsIgnoreCase(name)) {
			return alc_wg_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
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
		if ($xpns_itm_nm.equalsIgnoreCase(name)) {
			return xpns_itm_nm();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd1();
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd2();
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd3();
		}
		if ($alc_wg_nm.equalsIgnoreCase(name)) {
			return alc_wg_nm();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDate(name);
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
		if ($dpt_flg.equalsIgnoreCase(name)) {
			return dpt_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($lot_no_flg.equalsIgnoreCase(name)) {
			return lot_no_flg();
		}
		if ($sublot_no_flg.equalsIgnoreCase(name)) {
			return sublot_no_flg();
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			return sno1_flg();
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			return sno2_flg();
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			return sno3_flg();
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			return sno4_flg();
		}
		if ($po_no_flg.equalsIgnoreCase(name)) {
			return po_no_flg();
		}
		if ($slo_no_flg.equalsIgnoreCase(name)) {
			return slo_no_flg();
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			return iv_no_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($xpns_itm_cd.equalsIgnoreCase(name)) {
			return xpns_itm_cd();
		}
		if ($xpns_itm_sub1.equalsIgnoreCase(name)) {
			return xpns_itm_sub1();
		}
		if ($xpns_itm_sub2.equalsIgnoreCase(name)) {
			return xpns_itm_sub2();
		}
		if ($xpns_itm_sub3.equalsIgnoreCase(name)) {
			return xpns_itm_sub3();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_wg_cd.equalsIgnoreCase(name)) {
			return alc_wg_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
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
		if ($xpns_itm_nm.equalsIgnoreCase(name)) {
			return xpns_itm_nm();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd1();
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd2();
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd3();
		}
		if ($alc_wg_nm.equalsIgnoreCase(name)) {
			return alc_wg_nm();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDateNE(name);
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
		if ($dpt_flg.equalsIgnoreCase(name)) {
			return dpt_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($lot_no_flg.equalsIgnoreCase(name)) {
			return lot_no_flg();
		}
		if ($sublot_no_flg.equalsIgnoreCase(name)) {
			return sublot_no_flg();
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			return sno1_flg();
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			return sno2_flg();
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			return sno3_flg();
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			return sno4_flg();
		}
		if ($po_no_flg.equalsIgnoreCase(name)) {
			return po_no_flg();
		}
		if ($slo_no_flg.equalsIgnoreCase(name)) {
			return slo_no_flg();
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			return iv_no_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($xpns_itm_cd.equalsIgnoreCase(name)) {
			xpns_itm_cd(value);
			return;
		}
		if ($xpns_itm_sub1.equalsIgnoreCase(name)) {
			xpns_itm_sub1(value);
			return;
		}
		if ($xpns_itm_sub2.equalsIgnoreCase(name)) {
			xpns_itm_sub2(value);
			return;
		}
		if ($xpns_itm_sub3.equalsIgnoreCase(name)) {
			xpns_itm_sub3(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_wg_cd.equalsIgnoreCase(name)) {
			alc_wg_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
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
		if ($xpns_itm_nm.equalsIgnoreCase(name)) {
			xpns_itm_nm(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			alc_ac_grp_cd1(value);
			return;
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			alc_ac_grp_cd2(value);
			return;
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			alc_ac_grp_cd3(value);
			return;
		}
		if ($alc_wg_nm.equalsIgnoreCase(name)) {
			alc_wg_nm(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDate(name, value);
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
		if ($dpt_flg.equalsIgnoreCase(name)) {
			dpt_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($lot_no_flg.equalsIgnoreCase(name)) {
			lot_no_flg(value);
			return;
		}
		if ($sublot_no_flg.equalsIgnoreCase(name)) {
			sublot_no_flg(value);
			return;
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			sno1_flg(value);
			return;
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			sno2_flg(value);
			return;
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			sno3_flg(value);
			return;
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			sno4_flg(value);
			return;
		}
		if ($po_no_flg.equalsIgnoreCase(name)) {
			po_no_flg(value);
			return;
		}
		if ($slo_no_flg.equalsIgnoreCase(name)) {
			slo_no_flg(value);
			return;
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			iv_no_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($xpns_itm_cd.equalsIgnoreCase(name)) {
			xpns_itm_cd(value);
			return;
		}
		if ($xpns_itm_sub1.equalsIgnoreCase(name)) {
			xpns_itm_sub1(value);
			return;
		}
		if ($xpns_itm_sub2.equalsIgnoreCase(name)) {
			xpns_itm_sub2(value);
			return;
		}
		if ($xpns_itm_sub3.equalsIgnoreCase(name)) {
			xpns_itm_sub3(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_wg_cd.equalsIgnoreCase(name)) {
			alc_wg_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
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
		if ($xpns_itm_nm.equalsIgnoreCase(name)) {
			xpns_itm_nm(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			alc_ac_grp_cd1(value);
			return;
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			alc_ac_grp_cd2(value);
			return;
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			alc_ac_grp_cd3(value);
			return;
		}
		if ($alc_wg_nm.equalsIgnoreCase(name)) {
			alc_wg_nm(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDateNE(name, value);
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
		if ($dpt_flg.equalsIgnoreCase(name)) {
			dpt_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($lot_no_flg.equalsIgnoreCase(name)) {
			lot_no_flg(value);
			return;
		}
		if ($sublot_no_flg.equalsIgnoreCase(name)) {
			sublot_no_flg(value);
			return;
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			sno1_flg(value);
			return;
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			sno2_flg(value);
			return;
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			sno3_flg(value);
			return;
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			sno4_flg(value);
			return;
		}
		if ($po_no_flg.equalsIgnoreCase(name)) {
			po_no_flg(value);
			return;
		}
		if ($slo_no_flg.equalsIgnoreCase(name)) {
			slo_no_flg(value);
			return;
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			iv_no_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
