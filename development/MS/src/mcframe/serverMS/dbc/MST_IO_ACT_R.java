package mcframe.serverMS.dbc;

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
 * "受払実績 // GR/GI result"DBコンテナRowクラスです。<p>
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
 *  	<td>slip_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>伝票ＮＯ</td>
 *  	<td>Slip No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>slip_seq_no</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>伝票連番</td>
 *  	<td>Slip sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計上年月</td>
 *  	<td>Recording month</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計上日</td>
 *  	<td>Recording date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>実績日時</td>
 *  	<td>Actual date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slip_rev_no</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>伝票改訂番号</td>
 *  	<td>Slip rev. number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ヘッダ実績ＮＯ</td>
 *  	<td>Header result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ヘッダ実績連番</td>
 *  	<td>Header result sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_rev_no</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ヘッダ実績改訂番号</td>
 *  	<td>Header result rev. number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>明細実績ＮＯ</td>
 *  	<td>Details result No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_d_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>明細実績連番</td>
 *  	<td>Details result sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_io_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実績受払ＮＯ</td>
 *  	<td>Result GR/GI No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_io_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実績受払連番</td>
 *  	<td>Result GR/GI sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slip_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>伝票状況区分</td>
 *  	<td>Slip status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>un_fix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額未確定ＦＬＧ</td>
 *  	<td>Amount unfirm flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>temp_ap_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>暫定買掛ＦＬＧ</td>
 *  	<td>Temporary AP flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cd</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引ＣＤ</td>
 *  	<td>Transaction cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_ptn_typ</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引パタン区分</td>
 *  	<td>Transaction pattern type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trn_typ</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>トランザクション区分</td>
 *  	<td>Transaction type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_act_typ</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受払区分</td>
 *  	<td>GR/GI type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入出庫区分</td>
 *  	<td>GR/GI type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_slip_typ</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計伝票区分</td>
 *  	<td>Accounting slip type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>理由ＣＤ</td>
 *  	<td>Reason cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計理由ＣＤ</td>
 *  	<td>Accounting reason cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫ワーキンググループＣＤ</td>
 *  	<td>GI WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入庫ワーキンググループＣＤ</td>
 *  	<td>GR WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実施部門ＣＤ</td>
 *  	<td>Implement dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購買部門ＣＤ</td>
 *  	<td>Purchasing dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ap_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債務部門ＣＤ</td>
 *  	<td>AP dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上部門ＣＤ</td>
 *  	<td>Sales dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ar_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権部門ＣＤ</td>
 *  	<td>AR dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫部門ＣＤ</td>
 *  	<td>GI dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入庫部門ＣＤ</td>
 *  	<td>GR dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bd_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担部門ＣＤ</td>
 *  	<td>Charged dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_dpt_cd1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備部門ＣＤ１</td>
 *  	<td>Spare dept. cd. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_dpt_cd2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備部門ＣＤ２</td>
 *  	<td>Spare dept. cd. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_dpt_cd3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備部門ＣＤ３</td>
 *  	<td>Spare dept. cd. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実施担当者ＣＤ</td>
 *  	<td>Implementation PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上担当者ＣＤ</td>
 *  	<td>Sales PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造担当者ＣＤ</td>
 *  	<td>Mfg. PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購買担当者ＣＤ</td>
 *  	<td>Purchasing PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_itm_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計品目分類ＣＤ</td>
 *  	<td>Accounting item classification cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_jnl_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目仕訳ＣＤ</td>
 *  	<td>Item journal cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品名</td>
 *  	<td>Item name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫管理区分</td>
 *  	<td>Inventory management type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>asset_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>資産管理区分</td>
 *  	<td>Asset management type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sundry_itm_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>諸口品ＦＬＧ</td>
 *  	<td>Miscellaneous item flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>場所ＣＤ</td>
 *  	<td>Location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>棚・ラインＣＤ</td>
 *  	<td>Rack/Line cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_arrv_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫着荷先ＣＤ</td>
 *  	<td>Inventory arriving point cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロットＮＯ</td>
 *  	<td>Lot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ</td>
 *  	<td>Sublot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１</td>
 *  	<td>SEIBAN No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２</td>
 *  	<td>SEIBAN No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３</td>
 *  	<td>SEIBAN No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４</td>
 *  	<td>SEIBAN No. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fix_no_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>確定ＮＯ区分</td>
 *  	<td>Firm No. type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fix_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>確定ＮＯ</td>
 *  	<td>Firm No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gd_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格付ＣＤ</td>
 *  	<td>Grading cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>in_xfr_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>積送品区分</td>
 *  	<td>In-transit type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>quality_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>良品区分</td>
 *  	<td>Conforming type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>asst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>資産区分</td>
 *  	<td>Asset type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_insp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫検査区分</td>
 *  	<td>Inventory inspection type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫識別区分</td>
 *  	<td>Inventory identification type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫取引先ＣＤ</td>
 *  	<td>Inventory BP cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引単位数量</td>
 *  	<td>Transaction unit qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引単位ＣＤ</td>
 *  	<td>Transaction unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pack_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿単位数量</td>
 *  	<td>SKU qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pack_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>荷姿単位ＣＤ</td>
 *  	<td>SKU cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位数量</td>
 *  	<td>Base unit qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位ＣＤ</td>
 *  	<td>Base unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨ＣＤ</td>
 *  	<td>Transaction currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨単価</td>
 *  	<td>Unit price (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨金額</td>
 *  	<td>Amount (Transaction currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_proc_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨加工金額</td>
 *  	<td>Subcontracting amount (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_onr_prov_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨有償支給金額</td>
 *  	<td>Chargeable supply amount (Transaction currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨税額</td>
 *  	<td>Tax amount (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準通貨ＣＤ</td>
 *  	<td>Base currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準通貨単価</td>
 *  	<td>Unit price (Base currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準通貨金額</td>
 *  	<td>Amount (Base currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_proc_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準通貨加工金額</td>
 *  	<td>Subcontracting amount (Base currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_onr_prov_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準通貨有償支給金額</td>
 *  	<td>Chargeable supply amount (Base currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準通貨税額</td>
 *  	<td>Tax amount (Base currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ptax_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納税通貨ＣＤ</td>
 *  	<td>Taxpaying currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ptax_cur_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納税通貨単価</td>
 *  	<td>Unit price (Tax currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ptax_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納税通貨金額</td>
 *  	<td>Amount (Tax currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ptax_cur_proc_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納税通貨加工金額</td>
 *  	<td>Subcontracting amount (Tax currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ptax_cur_onr_prov_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納税通貨有償支給金額</td>
 *  	<td>Chargeable supply amount (Tax currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ptax_cur_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納税通貨税額</td>
 *  	<td>Tax amount (Tax currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wtax_rate</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>源泉税率</td>
 *  	<td>Withholding tax rate</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wtax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>源泉税額</td>
 *  	<td>Withholding tax</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税ＣＤ</td>
 *  	<td>Tax cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>foreign_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>国外取引ＦＬＧ</td>
 *  	<td>Foreign transaction flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xrate_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>為替レートＣＤ</td>
 *  	<td>Exchange rate cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>為替レート</td>
 *  	<td>Exchange rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ptax_xrate_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納税為替レートＣＤ</td>
 *  	<td>Taxpaying exchange rate cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ptax_xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納税為替レート</td>
 *  	<td>Taxpaying exchange rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注ＮＯ</td>
 *  	<td>Sales order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>po_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注ＮＯ</td>
 *  	<td>PO No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>インボイスＮＯ</td>
 *  	<td>Invoice No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcpt_iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受領インボイスＮＯ</td>
 *  	<td>Purchase invoice No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bd_ctg_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担品群ＣＤ</td>
 *  	<td>Charged item category cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bd_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担取引先ＣＤ</td>
 *  	<td>Charged BP cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bd_oper_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担工程ＣＤ</td>
 *  	<td>Charged operation cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bd_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担場所ＣＤ</td>
 *  	<td>Charged location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bd_slo_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担受注ＮＯ</td>
 *  	<td>Charged sales No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bd_po_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担発注ＮＯ</td>
 *  	<td>Charged PO No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bd_iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担インボイスＮＯ</td>
 *  	<td>Charged invoice No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bd_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担ワーキンググループＣＤ</td>
 *  	<td>Charged WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先ＣＤ</td>
 *  	<td>Delivery destination cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tdlv_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先ＣＤ</td>
 *  	<td>Receiving point cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金先ＣＤ</td>
 *  	<td>Payer cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bcst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求先ＣＤ</td>
 *  	<td>Billing customer cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>acst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売掛先ＣＤ</td>
 *  	<td>AR customer cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先ＣＤ</td>
 *  	<td>Customer cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dest_cd1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕向先ＣＤ１</td>
 *  	<td>Distribution channel cd. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dest_cd2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕向先ＣＤ２</td>
 *  	<td>Distribution channel cd. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dest_cd3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕向先ＣＤ３</td>
 *  	<td>Distribution channel cd. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>psppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払先ＣＤ</td>
 *  	<td>Payee cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bsppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定管理先ＣＤ</td>
 *  	<td>Scheduled payee cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>asppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>買掛先ＣＤ</td>
 *  	<td>AP supplier cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先ＣＤ</td>
 *  	<td>Supplier cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cred_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>与信管理先ＣＤ</td>
 *  	<td>Credit managed BP cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>spot_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>都度精算ＦＬＧ</td>
 *  	<td>Settlement per transaction flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sttl_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>決済予定日</td>
 *  	<td>Scheduled settlement date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sttl_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>決済方法ＣＤ</td>
 *  	<td>Settlement method cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先品目ＣＤ</td>
 *  	<td>Customer item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先品名</td>
 *  	<td>Customer item name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先品目ＣＤ</td>
 *  	<td>Supplier item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先品名</td>
 *  	<td>Supplier item name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購買区分</td>
 *  	<td>Purchase type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>area_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>地域ＣＤ</td>
 *  	<td>Region cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cntry_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>国ＣＤ</td>
 *  	<td>Country cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目製造指図ＮＯ</td>
 *  	<td>Item mfg. order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_inst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目指図数量</td>
 *  	<td>Item order qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造指図ＮＯ</td>
 *  	<td>Mfg. order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造実績ＮＯ</td>
 *  	<td>Mfg. result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_st_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造着手数量</td>
 *  	<td>Mfg. start qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程実績ＮＯ</td>
 *  	<td>Operation result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>yield_rate</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出来高進捗度</td>
 *  	<td>Output progress</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>disp_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工順</td>
 *  	<td>Routing</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程ＣＤ</td>
 *  	<td>Operation cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inpt_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>投入場所ＣＤ</td>
 *  	<td>Input location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>投入棚・ラインＣＤ</td>
 *  	<td>Input rack/line cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>outsrc_mfg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外注製造場所ＣＤ</td>
 *  	<td>Subcontracting mfg. location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>outsrc_mfg_loc_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外注製造場所部門ＣＤ</td>
 *  	<td>Subcontracting mfg. location dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>outsrc_mfg_loc_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外注製造場所ワーキンググループＣＤ</td>
 *  	<td>Subcontracting mfg. location WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>strg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格納場所ＣＤ</td>
 *  	<td>Storage location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>strg_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格納棚・ラインＣＤ</td>
 *  	<td>Storage rack/line cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_inst_unit_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造指図単位区分</td>
 *  	<td>Mfg. order unit type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>repurc_obli_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>買戻義務ＦＬＧ</td>
 *  	<td>Repurchase obligation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫場所ＣＤ</td>
 *  	<td>GI location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入庫場所ＣＤ</td>
 *  	<td>GR location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stktk_base_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>棚卸基準日</td>
 *  	<td>Base date of inventory count</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_ac_itm_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親会計品目分類ＣＤ</td>
 *  	<td>Parent accounting item classification cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_itm_jnl_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親品目仕訳ＣＤ</td>
 *  	<td>Parent item journal cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親品目ＣＤ</td>
 *  	<td>Parent item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親品目枝番１</td>
 *  	<td>Parent item branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親品目枝番２</td>
 *  	<td>Parent item branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親品目枝番３</td>
 *  	<td>Parent item branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親品名</td>
 *  	<td>Parent item name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親ロットＮＯ</td>
 *  	<td>Parent lot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親サブロットＮＯ</td>
 *  	<td>Parent sublot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親手配ＮＯ１</td>
 *  	<td>Parent SEIBAN No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親手配ＮＯ２</td>
 *  	<td>Parent SEIBAN No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親手配ＮＯ３</td>
 *  	<td>Parent SEIBAN No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親手配ＮＯ４</td>
 *  	<td>Parent SEIBAN No. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>accrual_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫発生基準ＦＬＧ</td>
 *  	<td>Inventory accrual base flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>accpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>資産発生基準ＦＬＧ</td>
 *  	<td>Asset accrual base flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>avl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>使用可能日基準ＦＬＧ</td>
 *  	<td>Available date basis flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引備考</td>
 *  	<td>Transaction remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_d_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引明細備考</td>
 *  	<td>Transaction details remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char1</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１</td>
 *  	<td>Spare CHAR column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char2</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２</td>
 *  	<td>Spare CHAR column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char3</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目３</td>
 *  	<td>Spare CHAR column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char4</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目４</td>
 *  	<td>Spare CHAR column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char5</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目５</td>
 *  	<td>Spare CHAR column 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char6</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目６</td>
 *  	<td>Spare CHAR column 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char7</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目７</td>
 *  	<td>Spare CHAR column 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char8</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目８</td>
 *  	<td>Spare CHAR column 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char9</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目９</td>
 *  	<td>Spare CHAR column 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char10</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１０</td>
 *  	<td>Spare CHAR column 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_num1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目１</td>
 *  	<td>Spare NUM column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_num2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目２</td>
 *  	<td>Spare NUM column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_num3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目３</td>
 *  	<td>Spare NUM column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_dt1</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目１</td>
 *  	<td>Spare DATE column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_dt2</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目２</td>
 *  	<td>Spare DATE column 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_dt3</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目３</td>
 *  	<td>Spare DATE column 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_slip_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親伝票ＮＯ</td>
 *  	<td>Parent slip No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_slip_seq_no</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親伝票連番</td>
 *  	<td>Parent slip sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slip_cmpl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>補完ＦＬＧ</td>
 *  	<td>Complement flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>send_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>送信対象ＦＬＧ</td>
 *  	<td>To be exported flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>c_imp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>原価取込済ＦＬＧ</td>
 *  	<td>Cost imported flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>a_imp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会計ＩＦ取込済ＦＬＧ</td>
 *  	<td>Accounting IF imported flg.</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_IO_ACT_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_IO_ACT";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 伝票ＮＯ. Slip No..<p>
	 *
	 */
	public static final String $slip_no = "slip_no";
	private static final MCPermColumnInfo _slip_no = createColumnInfo("slip_no");
	public final MCStringPermColumn slip_no = createStringColumn(_slip_no);
	
	/**
	 * 伝票連番. Slip sequence number.<p>
	 *
	 */
	public static final String $slip_seq_no = "slip_seq_no";
	private static final MCPermColumnInfo _slip_seq_no = createColumnInfo("slip_seq_no");
	public final MCNumberPermColumn slip_seq_no = createNumberColumn(_slip_seq_no);
	
	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	private static final MCPermColumnInfo _ac_ym = createColumnInfo("ac_ym");
	public final MCDatePermColumn ac_ym = createDateColumn(_ac_ym);
	
	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	private static final MCPermColumnInfo _ac_dt = createColumnInfo("ac_dt");
	public final MCDatePermColumn ac_dt = createDateColumn(_ac_dt);
	
	/**
	 * 実績日時. Actual date and time.<p>
	 *
	 */
	public static final String $act_tm = "act_tm";
	private static final MCPermColumnInfo _act_tm = createColumnInfo("act_tm");
	public final MCDatePermColumn act_tm = createDateColumn(_act_tm);
	
	/**
	 * 伝票改訂番号. Slip rev. number.<p>
	 *
	 */
	public static final String $slip_rev_no = "slip_rev_no";
	private static final MCPermColumnInfo _slip_rev_no = createColumnInfo("slip_rev_no");
	public final MCNumberPermColumn slip_rev_no = createNumberColumn(_slip_rev_no);
	
	/**
	 * ヘッダ実績ＮＯ. Header result No..<p>
	 *
	 */
	public static final String $act_no = "act_no";
	private static final MCPermColumnInfo _act_no = createColumnInfo("act_no");
	public final MCStringPermColumn act_no = createStringColumn(_act_no);
	
	/**
	 * ヘッダ実績連番. Header result sequence number.<p>
	 *
	 */
	public static final String $act_seq = "act_seq";
	private static final MCPermColumnInfo _act_seq = createColumnInfo("act_seq");
	public final MCNumberPermColumn act_seq = createNumberColumn(_act_seq);
	
	/**
	 * ヘッダ実績改訂番号. Header result rev. number.<p>
	 *
	 */
	public static final String $act_rev_no = "act_rev_no";
	private static final MCPermColumnInfo _act_rev_no = createColumnInfo("act_rev_no");
	public final MCNumberPermColumn act_rev_no = createNumberColumn(_act_rev_no);
	
	/**
	 * 明細実績ＮＯ. Details result No..<p>
	 *
	 */
	public static final String $act_d_no = "act_d_no";
	private static final MCPermColumnInfo _act_d_no = createColumnInfo("act_d_no");
	public final MCStringPermColumn act_d_no = createStringColumn(_act_d_no);
	
	/**
	 * 明細実績連番. Details result sequence number.<p>
	 *
	 */
	public static final String $act_d_seq = "act_d_seq";
	private static final MCPermColumnInfo _act_d_seq = createColumnInfo("act_d_seq");
	public final MCNumberPermColumn act_d_seq = createNumberColumn(_act_d_seq);
	
	/**
	 * 実績受払ＮＯ. Result GR/GI No..<p>
	 *
	 */
	public static final String $act_io_no = "act_io_no";
	private static final MCPermColumnInfo _act_io_no = createColumnInfo("act_io_no");
	public final MCStringPermColumn act_io_no = createStringColumn(_act_io_no);
	
	/**
	 * 実績受払連番. Result GR/GI sequence number.<p>
	 *
	 */
	public static final String $act_io_seq = "act_io_seq";
	private static final MCPermColumnInfo _act_io_seq = createColumnInfo("act_io_seq");
	public final MCNumberPermColumn act_io_seq = createNumberColumn(_act_io_seq);
	
	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	private static final MCPermColumnInfo _slip_sts_typ = createColumnInfo("slip_sts_typ");
	public final MCStringPermColumn slip_sts_typ = createStringColumn(_slip_sts_typ);
	
	/**
	 * 金額未確定ＦＬＧ. Amount unfirm flg..<p>
	 *
	 */
	public static final String $un_fix_flg = "un_fix_flg";
	private static final MCPermColumnInfo _un_fix_flg = createColumnInfo("un_fix_flg");
	public final MCBooleanPermColumn un_fix_flg = createBooleanColumn(_un_fix_flg);
	
	/**
	 * 暫定買掛ＦＬＧ. Temporary AP flg..<p>
	 *
	 */
	public static final String $temp_ap_flg = "temp_ap_flg";
	private static final MCPermColumnInfo _temp_ap_flg = createColumnInfo("temp_ap_flg");
	public final MCBooleanPermColumn temp_ap_flg = createBooleanColumn(_temp_ap_flg);
	
	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	private static final MCPermColumnInfo _trd_cd = createColumnInfo("trd_cd");
	public final MCStringPermColumn trd_cd = createStringColumn(_trd_cd);
	
	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	private static final MCPermColumnInfo _trd_ptn_typ = createColumnInfo("trd_ptn_typ");
	public final MCStringPermColumn trd_ptn_typ = createStringColumn(_trd_ptn_typ);
	
	/**
	 * トランザクション区分. Transaction type.<p>
	 *
	 */
	public static final String $trn_typ = "trn_typ";
	private static final MCPermColumnInfo _trn_typ = createColumnInfo("trn_typ");
	public final MCStringPermColumn trn_typ = createStringColumn(_trn_typ);
	
	/**
	 * 受払区分. GR/GI type.<p>
	 *
	 */
	public static final String $io_act_typ = "io_act_typ";
	private static final MCPermColumnInfo _io_act_typ = createColumnInfo("io_act_typ");
	public final MCStringPermColumn io_act_typ = createStringColumn(_io_act_typ);
	
	/**
	 * 入出庫区分. GR/GI type.<p>
	 *
	 */
	public static final String $io_typ = "io_typ";
	private static final MCPermColumnInfo _io_typ = createColumnInfo("io_typ");
	public final MCStringPermColumn io_typ = createStringColumn(_io_typ);
	
	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public static final String $ac_slip_typ = "ac_slip_typ";
	private static final MCPermColumnInfo _ac_slip_typ = createColumnInfo("ac_slip_typ");
	public final MCStringPermColumn ac_slip_typ = createStringColumn(_ac_slip_typ);
	
	/**
	 * 理由ＣＤ. Reason cd..<p>
	 *
	 */
	public static final String $rsn_cd = "rsn_cd";
	private static final MCPermColumnInfo _rsn_cd = createColumnInfo("rsn_cd");
	public final MCStringPermColumn rsn_cd = createStringColumn(_rsn_cd);
	
	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	private static final MCPermColumnInfo _ac_rsn_cd = createColumnInfo("ac_rsn_cd");
	public final MCStringPermColumn ac_rsn_cd = createStringColumn(_ac_rsn_cd);
	
	/**
	 * 出庫ワーキンググループＣＤ. GI WG cd..<p>
	 *
	 */
	public static final String $gi_wg_cd = "gi_wg_cd";
	private static final MCPermColumnInfo _gi_wg_cd = createColumnInfo("gi_wg_cd");
	public final MCStringPermColumn gi_wg_cd = createStringColumn(_gi_wg_cd);
	
	/**
	 * 入庫ワーキンググループＣＤ. GR WG cd..<p>
	 *
	 */
	public static final String $gr_wg_cd = "gr_wg_cd";
	private static final MCPermColumnInfo _gr_wg_cd = createColumnInfo("gr_wg_cd");
	public final MCStringPermColumn gr_wg_cd = createStringColumn(_gr_wg_cd);
	
	/**
	 * 実施部門ＣＤ. Implement dept. cd..<p>
	 *
	 */
	public static final String $act_dpt_cd = "act_dpt_cd";
	private static final MCPermColumnInfo _act_dpt_cd = createColumnInfo("act_dpt_cd");
	public final MCStringPermColumn act_dpt_cd = createStringColumn(_act_dpt_cd);
	
	/**
	 * 購買部門ＣＤ. Purchasing dept. cd..<p>
	 *
	 */
	public static final String $purc_dpt_cd = "purc_dpt_cd";
	private static final MCPermColumnInfo _purc_dpt_cd = createColumnInfo("purc_dpt_cd");
	public final MCStringPermColumn purc_dpt_cd = createStringColumn(_purc_dpt_cd);
	
	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	private static final MCPermColumnInfo _ap_dpt_cd = createColumnInfo("ap_dpt_cd");
	public final MCStringPermColumn ap_dpt_cd = createStringColumn(_ap_dpt_cd);
	
	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	private static final MCPermColumnInfo _sls_dpt_cd = createColumnInfo("sls_dpt_cd");
	public final MCStringPermColumn sls_dpt_cd = createStringColumn(_sls_dpt_cd);
	
	/**
	 * 債権部門ＣＤ. AR dept. cd..<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	private static final MCPermColumnInfo _ar_dpt_cd = createColumnInfo("ar_dpt_cd");
	public final MCStringPermColumn ar_dpt_cd = createStringColumn(_ar_dpt_cd);
	
	/**
	 * 出庫部門ＣＤ. GI dept. cd..<p>
	 *
	 */
	public static final String $gi_dpt_cd = "gi_dpt_cd";
	private static final MCPermColumnInfo _gi_dpt_cd = createColumnInfo("gi_dpt_cd");
	public final MCStringPermColumn gi_dpt_cd = createStringColumn(_gi_dpt_cd);
	
	/**
	 * 入庫部門ＣＤ. GR dept. cd..<p>
	 *
	 */
	public static final String $gr_dpt_cd = "gr_dpt_cd";
	private static final MCPermColumnInfo _gr_dpt_cd = createColumnInfo("gr_dpt_cd");
	public final MCStringPermColumn gr_dpt_cd = createStringColumn(_gr_dpt_cd);
	
	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	private static final MCPermColumnInfo _bd_dpt_cd = createColumnInfo("bd_dpt_cd");
	public final MCStringPermColumn bd_dpt_cd = createStringColumn(_bd_dpt_cd);
	
	/**
	 * 予備部門ＣＤ１. Spare dept. cd. 1.<p>
	 *
	 */
	public static final String $sub_dpt_cd1 = "sub_dpt_cd1";
	private static final MCPermColumnInfo _sub_dpt_cd1 = createColumnInfo("sub_dpt_cd1");
	public final MCStringPermColumn sub_dpt_cd1 = createStringColumn(_sub_dpt_cd1);
	
	/**
	 * 予備部門ＣＤ２. Spare dept. cd. 2.<p>
	 *
	 */
	public static final String $sub_dpt_cd2 = "sub_dpt_cd2";
	private static final MCPermColumnInfo _sub_dpt_cd2 = createColumnInfo("sub_dpt_cd2");
	public final MCStringPermColumn sub_dpt_cd2 = createStringColumn(_sub_dpt_cd2);
	
	/**
	 * 予備部門ＣＤ３. Spare dept. cd. 3.<p>
	 *
	 */
	public static final String $sub_dpt_cd3 = "sub_dpt_cd3";
	private static final MCPermColumnInfo _sub_dpt_cd3 = createColumnInfo("sub_dpt_cd3");
	public final MCStringPermColumn sub_dpt_cd3 = createStringColumn(_sub_dpt_cd3);
	
	/**
	 * 実施担当者ＣＤ. Implementation PIC cd..<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	private static final MCPermColumnInfo _act_usr_cd = createColumnInfo("act_usr_cd");
	public final MCStringPermColumn act_usr_cd = createStringColumn(_act_usr_cd);
	
	/**
	 * 売上担当者ＣＤ. Sales PIC cd..<p>
	 *
	 */
	public static final String $sls_usr_cd = "sls_usr_cd";
	private static final MCPermColumnInfo _sls_usr_cd = createColumnInfo("sls_usr_cd");
	public final MCStringPermColumn sls_usr_cd = createStringColumn(_sls_usr_cd);
	
	/**
	 * 製造担当者ＣＤ. Mfg. PIC cd..<p>
	 *
	 */
	public static final String $mfg_usr_cd = "mfg_usr_cd";
	private static final MCPermColumnInfo _mfg_usr_cd = createColumnInfo("mfg_usr_cd");
	public final MCStringPermColumn mfg_usr_cd = createStringColumn(_mfg_usr_cd);
	
	/**
	 * 購買担当者ＣＤ. Purchasing PIC cd..<p>
	 *
	 */
	public static final String $purc_usr_cd = "purc_usr_cd";
	private static final MCPermColumnInfo _purc_usr_cd = createColumnInfo("purc_usr_cd");
	public final MCStringPermColumn purc_usr_cd = createStringColumn(_purc_usr_cd);
	
	/**
	 * 会計品目分類ＣＤ. Accounting item classification cd..<p>
	 *
	 */
	public static final String $ac_itm_grp_cd = "ac_itm_grp_cd";
	private static final MCPermColumnInfo _ac_itm_grp_cd = createColumnInfo("ac_itm_grp_cd");
	public final MCStringPermColumn ac_itm_grp_cd = createStringColumn(_ac_itm_grp_cd);
	
	/**
	 * 品目仕訳ＣＤ. Item journal cd..<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	private static final MCPermColumnInfo _itm_jnl_cd = createColumnInfo("itm_jnl_cd");
	public final MCStringPermColumn itm_jnl_cd = createStringColumn(_itm_jnl_cd);
	
	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	private static final MCPermColumnInfo _itm_cd = createColumnInfo("itm_cd");
	public final MCStringPermColumn itm_cd = createStringColumn(_itm_cd);
	
	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	private static final MCPermColumnInfo _itm_sub1 = createColumnInfo("itm_sub1");
	public final MCStringPermColumn itm_sub1 = createStringColumn(_itm_sub1);
	
	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	private static final MCPermColumnInfo _itm_sub2 = createColumnInfo("itm_sub2");
	public final MCStringPermColumn itm_sub2 = createStringColumn(_itm_sub2);
	
	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	private static final MCPermColumnInfo _itm_sub3 = createColumnInfo("itm_sub3");
	public final MCStringPermColumn itm_sub3 = createStringColumn(_itm_sub3);
	
	/**
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	private static final MCPermColumnInfo _itm_nm = createColumnInfo("itm_nm");
	public final MCStringPermColumn itm_nm = createStringColumn(_itm_nm);
	
	/**
	 * 在庫管理区分. Inventory management type.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	private static final MCPermColumnInfo _stk_mng_typ = createColumnInfo("stk_mng_typ");
	public final MCStringPermColumn stk_mng_typ = createStringColumn(_stk_mng_typ);
	
	/**
	 * 資産管理区分. Asset management type.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	private static final MCPermColumnInfo _asset_mng_typ = createColumnInfo("asset_mng_typ");
	public final MCStringPermColumn asset_mng_typ = createStringColumn(_asset_mng_typ);
	
	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	private static final MCPermColumnInfo _sundry_itm_flg = createColumnInfo("sundry_itm_flg");
	public final MCBooleanPermColumn sundry_itm_flg = createBooleanColumn(_sundry_itm_flg);
	
	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	private static final MCPermColumnInfo _loc_cd = createColumnInfo("loc_cd");
	public final MCStringPermColumn loc_cd = createStringColumn(_loc_cd);
	
	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	private static final MCPermColumnInfo _str_ln_cd = createColumnInfo("str_ln_cd");
	public final MCStringPermColumn str_ln_cd = createStringColumn(_str_ln_cd);
	
	/**
	 * 在庫着荷先ＣＤ. Inventory arriving point cd..<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	private static final MCPermColumnInfo _stk_arrv_bp_cd = createColumnInfo("stk_arrv_bp_cd");
	public final MCStringPermColumn stk_arrv_bp_cd = createStringColumn(_stk_arrv_bp_cd);
	
	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	private static final MCPermColumnInfo _lot_no = createColumnInfo("lot_no");
	public final MCStringPermColumn lot_no = createStringColumn(_lot_no);
	
	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	private static final MCPermColumnInfo _sublot_no = createColumnInfo("sublot_no");
	public final MCStringPermColumn sublot_no = createStringColumn(_sublot_no);
	
	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	private static final MCPermColumnInfo _sno1 = createColumnInfo("sno1");
	public final MCStringPermColumn sno1 = createStringColumn(_sno1);
	
	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	private static final MCPermColumnInfo _sno2 = createColumnInfo("sno2");
	public final MCStringPermColumn sno2 = createStringColumn(_sno2);
	
	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	private static final MCPermColumnInfo _sno3 = createColumnInfo("sno3");
	public final MCStringPermColumn sno3 = createStringColumn(_sno3);
	
	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	private static final MCPermColumnInfo _sno4 = createColumnInfo("sno4");
	public final MCStringPermColumn sno4 = createStringColumn(_sno4);
	
	/**
	 * 確定ＮＯ区分. Firm No. type.<p>
	 *
	 */
	public static final String $fix_no_typ = "fix_no_typ";
	private static final MCPermColumnInfo _fix_no_typ = createColumnInfo("fix_no_typ");
	public final MCStringPermColumn fix_no_typ = createStringColumn(_fix_no_typ);
	
	/**
	 * 確定ＮＯ. Firm No..<p>
	 *
	 */
	public static final String $fix_no = "fix_no";
	private static final MCPermColumnInfo _fix_no = createColumnInfo("fix_no");
	public final MCStringPermColumn fix_no = createStringColumn(_fix_no);
	
	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	private static final MCPermColumnInfo _gd_cd = createColumnInfo("gd_cd");
	public final MCStringPermColumn gd_cd = createStringColumn(_gd_cd);
	
	/**
	 * 積送品区分. In-transit type.<p>
	 *
	 */
	public static final String $in_xfr_typ = "in_xfr_typ";
	private static final MCPermColumnInfo _in_xfr_typ = createColumnInfo("in_xfr_typ");
	public final MCStringPermColumn in_xfr_typ = createStringColumn(_in_xfr_typ);
	
	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	private static final MCPermColumnInfo _quality_typ = createColumnInfo("quality_typ");
	public final MCStringPermColumn quality_typ = createStringColumn(_quality_typ);
	
	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	private static final MCPermColumnInfo _asst_typ = createColumnInfo("asst_typ");
	public final MCStringPermColumn asst_typ = createStringColumn(_asst_typ);
	
	/**
	 * 在庫検査区分. Inventory inspection type.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	private static final MCPermColumnInfo _stk_insp_typ = createColumnInfo("stk_insp_typ");
	public final MCStringPermColumn stk_insp_typ = createStringColumn(_stk_insp_typ);
	
	/**
	 * 在庫識別区分. Inventory identification type.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	private static final MCPermColumnInfo _stk_id_typ = createColumnInfo("stk_id_typ");
	public final MCStringPermColumn stk_id_typ = createStringColumn(_stk_id_typ);
	
	/**
	 * 在庫取引先ＣＤ. Inventory BP cd..<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	private static final MCPermColumnInfo _stk_bp_cd = createColumnInfo("stk_bp_cd");
	public final MCStringPermColumn stk_bp_cd = createStringColumn(_stk_bp_cd);
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	private static final MCPermColumnInfo _trd_unit_qty = createColumnInfo("trd_unit_qty");
	public final MCNumberPermColumn trd_unit_qty = createNumberColumn(_trd_unit_qty);
	
	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	private static final MCPermColumnInfo _trd_unit_cd = createColumnInfo("trd_unit_cd");
	public final MCStringPermColumn trd_unit_cd = createStringColumn(_trd_unit_cd);
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public static final String $pack_unit_qty = "pack_unit_qty";
	private static final MCPermColumnInfo _pack_unit_qty = createColumnInfo("pack_unit_qty");
	public final MCNumberPermColumn pack_unit_qty = createNumberColumn(_pack_unit_qty);
	
	/**
	 * 荷姿単位ＣＤ. SKU cd..<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	private static final MCPermColumnInfo _pack_unit_cd = createColumnInfo("pack_unit_cd");
	public final MCStringPermColumn pack_unit_cd = createStringColumn(_pack_unit_cd);
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	private static final MCPermColumnInfo _base_unit_qty = createColumnInfo("base_unit_qty");
	public final MCNumberPermColumn base_unit_qty = createNumberColumn(_base_unit_qty);
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	private static final MCPermColumnInfo _base_unit_cd = createColumnInfo("base_unit_cd");
	public final MCStringPermColumn base_unit_cd = createStringColumn(_base_unit_cd);
	
	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	private static final MCPermColumnInfo _trd_cur_cd = createColumnInfo("trd_cur_cd");
	public final MCStringPermColumn trd_cur_cd = createStringColumn(_trd_cur_cd);
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	private static final MCPermColumnInfo _trd_cur_upri = createColumnInfo("trd_cur_upri");
	public final MCNumberPermColumn trd_cur_upri = createNumberColumn(_trd_cur_upri);
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	private static final MCPermColumnInfo _trd_cur_amt = createColumnInfo("trd_cur_amt");
	public final MCNumberPermColumn trd_cur_amt = createNumberColumn(_trd_cur_amt);
	
	/**
	 * 取引通貨加工金額. Subcontracting amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_proc_amt = "trd_cur_proc_amt";
	private static final MCPermColumnInfo _trd_cur_proc_amt = createColumnInfo("trd_cur_proc_amt");
	public final MCNumberPermColumn trd_cur_proc_amt = createNumberColumn(_trd_cur_proc_amt);
	
	/**
	 * 取引通貨有償支給金額. Chargeable supply amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_onr_prov_amt = "trd_cur_onr_prov_amt";
	private static final MCPermColumnInfo _trd_cur_onr_prov_amt = createColumnInfo("trd_cur_onr_prov_amt");
	public final MCNumberPermColumn trd_cur_onr_prov_amt = createNumberColumn(_trd_cur_onr_prov_amt);
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	private static final MCPermColumnInfo _trd_cur_tax_amt = createColumnInfo("trd_cur_tax_amt");
	public final MCNumberPermColumn trd_cur_tax_amt = createNumberColumn(_trd_cur_tax_amt);
	
	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	private static final MCPermColumnInfo _base_cur_cd = createColumnInfo("base_cur_cd");
	public final MCStringPermColumn base_cur_cd = createStringColumn(_base_cur_cd);
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public static final String $base_cur_upri = "base_cur_upri";
	private static final MCPermColumnInfo _base_cur_upri = createColumnInfo("base_cur_upri");
	public final MCNumberPermColumn base_cur_upri = createNumberColumn(_base_cur_upri);
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	private static final MCPermColumnInfo _base_cur_amt = createColumnInfo("base_cur_amt");
	public final MCNumberPermColumn base_cur_amt = createNumberColumn(_base_cur_amt);
	
	/**
	 * 基準通貨加工金額. Subcontracting amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_proc_amt = "base_cur_proc_amt";
	private static final MCPermColumnInfo _base_cur_proc_amt = createColumnInfo("base_cur_proc_amt");
	public final MCNumberPermColumn base_cur_proc_amt = createNumberColumn(_base_cur_proc_amt);
	
	/**
	 * 基準通貨有償支給金額. Chargeable supply amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_onr_prov_amt = "base_cur_onr_prov_amt";
	private static final MCPermColumnInfo _base_cur_onr_prov_amt = createColumnInfo("base_cur_onr_prov_amt");
	public final MCNumberPermColumn base_cur_onr_prov_amt = createNumberColumn(_base_cur_onr_prov_amt);
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	private static final MCPermColumnInfo _base_cur_tax_amt = createColumnInfo("base_cur_tax_amt");
	public final MCNumberPermColumn base_cur_tax_amt = createNumberColumn(_base_cur_tax_amt);
	
	/**
	 * 納税通貨ＣＤ. Taxpaying currency cd..<p>
	 *
	 */
	public static final String $ptax_cur_cd = "ptax_cur_cd";
	private static final MCPermColumnInfo _ptax_cur_cd = createColumnInfo("ptax_cur_cd");
	public final MCStringPermColumn ptax_cur_cd = createStringColumn(_ptax_cur_cd);
	
	/**
	 * 納税通貨単価. Unit price (Tax currency).<p>
	 *
	 */
	public static final String $ptax_cur_upri = "ptax_cur_upri";
	private static final MCPermColumnInfo _ptax_cur_upri = createColumnInfo("ptax_cur_upri");
	public final MCNumberPermColumn ptax_cur_upri = createNumberColumn(_ptax_cur_upri);
	
	/**
	 * 納税通貨金額. Amount (Tax currency).<p>
	 *
	 */
	public static final String $ptax_cur_amt = "ptax_cur_amt";
	private static final MCPermColumnInfo _ptax_cur_amt = createColumnInfo("ptax_cur_amt");
	public final MCNumberPermColumn ptax_cur_amt = createNumberColumn(_ptax_cur_amt);
	
	/**
	 * 納税通貨加工金額. Subcontracting amount (Tax currency).<p>
	 *
	 */
	public static final String $ptax_cur_proc_amt = "ptax_cur_proc_amt";
	private static final MCPermColumnInfo _ptax_cur_proc_amt = createColumnInfo("ptax_cur_proc_amt");
	public final MCNumberPermColumn ptax_cur_proc_amt = createNumberColumn(_ptax_cur_proc_amt);
	
	/**
	 * 納税通貨有償支給金額. Chargeable supply amount (Tax currency).<p>
	 *
	 */
	public static final String $ptax_cur_onr_prov_amt = "ptax_cur_onr_prov_amt";
	private static final MCPermColumnInfo _ptax_cur_onr_prov_amt = createColumnInfo("ptax_cur_onr_prov_amt");
	public final MCNumberPermColumn ptax_cur_onr_prov_amt = createNumberColumn(_ptax_cur_onr_prov_amt);
	
	/**
	 * 納税通貨税額. Tax amount (Tax currency).<p>
	 *
	 */
	public static final String $ptax_cur_tax_amt = "ptax_cur_tax_amt";
	private static final MCPermColumnInfo _ptax_cur_tax_amt = createColumnInfo("ptax_cur_tax_amt");
	public final MCNumberPermColumn ptax_cur_tax_amt = createNumberColumn(_ptax_cur_tax_amt);
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	private static final MCPermColumnInfo _wtax_rate = createColumnInfo("wtax_rate");
	public final MCNumberPermColumn wtax_rate = createNumberColumn(_wtax_rate);
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public static final String $wtax_amt = "wtax_amt";
	private static final MCPermColumnInfo _wtax_amt = createColumnInfo("wtax_amt");
	public final MCNumberPermColumn wtax_amt = createNumberColumn(_wtax_amt);
	
	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	private static final MCPermColumnInfo _tax_cd = createColumnInfo("tax_cd");
	public final MCStringPermColumn tax_cd = createStringColumn(_tax_cd);
	
	/**
	 * 国外取引ＦＬＧ. Foreign transaction flg..<p>
	 *
	 */
	public static final String $foreign_flg = "foreign_flg";
	private static final MCPermColumnInfo _foreign_flg = createColumnInfo("foreign_flg");
	public final MCBooleanPermColumn foreign_flg = createBooleanColumn(_foreign_flg);
	
	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	private static final MCPermColumnInfo _xrate_cd = createColumnInfo("xrate_cd");
	public final MCStringPermColumn xrate_cd = createStringColumn(_xrate_cd);
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	private static final MCPermColumnInfo _xrate = createColumnInfo("xrate");
	public final MCNumberPermColumn xrate = createNumberColumn(_xrate);
	
	/**
	 * 納税為替レートＣＤ. Taxpaying exchange rate cd..<p>
	 *
	 */
	public static final String $ptax_xrate_cd = "ptax_xrate_cd";
	private static final MCPermColumnInfo _ptax_xrate_cd = createColumnInfo("ptax_xrate_cd");
	public final MCStringPermColumn ptax_xrate_cd = createStringColumn(_ptax_xrate_cd);
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public static final String $ptax_xrate = "ptax_xrate";
	private static final MCPermColumnInfo _ptax_xrate = createColumnInfo("ptax_xrate");
	public final MCNumberPermColumn ptax_xrate = createNumberColumn(_ptax_xrate);
	
	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	private static final MCPermColumnInfo _slo_no = createColumnInfo("slo_no");
	public final MCStringPermColumn slo_no = createStringColumn(_slo_no);
	
	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public static final String $po_no = "po_no";
	private static final MCPermColumnInfo _po_no = createColumnInfo("po_no");
	public final MCStringPermColumn po_no = createStringColumn(_po_no);
	
	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	private static final MCPermColumnInfo _iv_no = createColumnInfo("iv_no");
	public final MCStringPermColumn iv_no = createStringColumn(_iv_no);
	
	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	private static final MCPermColumnInfo _rcpt_iv_no = createColumnInfo("rcpt_iv_no");
	public final MCStringPermColumn rcpt_iv_no = createStringColumn(_rcpt_iv_no);
	
	/**
	 * 負担品群ＣＤ. Charged item category cd..<p>
	 *
	 */
	public static final String $bd_ctg_cd = "bd_ctg_cd";
	private static final MCPermColumnInfo _bd_ctg_cd = createColumnInfo("bd_ctg_cd");
	public final MCStringPermColumn bd_ctg_cd = createStringColumn(_bd_ctg_cd);
	
	/**
	 * 負担取引先ＣＤ. Charged BP cd..<p>
	 *
	 */
	public static final String $bd_bp_cd = "bd_bp_cd";
	private static final MCPermColumnInfo _bd_bp_cd = createColumnInfo("bd_bp_cd");
	public final MCStringPermColumn bd_bp_cd = createStringColumn(_bd_bp_cd);
	
	/**
	 * 負担工程ＣＤ. Charged operation cd..<p>
	 *
	 */
	public static final String $bd_oper_cd = "bd_oper_cd";
	private static final MCPermColumnInfo _bd_oper_cd = createColumnInfo("bd_oper_cd");
	public final MCStringPermColumn bd_oper_cd = createStringColumn(_bd_oper_cd);
	
	/**
	 * 負担場所ＣＤ. Charged location cd..<p>
	 *
	 */
	public static final String $bd_loc_cd = "bd_loc_cd";
	private static final MCPermColumnInfo _bd_loc_cd = createColumnInfo("bd_loc_cd");
	public final MCStringPermColumn bd_loc_cd = createStringColumn(_bd_loc_cd);
	
	/**
	 * 負担受注ＮＯ. Charged sales No..<p>
	 *
	 */
	public static final String $bd_slo_no = "bd_slo_no";
	private static final MCPermColumnInfo _bd_slo_no = createColumnInfo("bd_slo_no");
	public final MCStringPermColumn bd_slo_no = createStringColumn(_bd_slo_no);
	
	/**
	 * 負担発注ＮＯ. Charged PO No..<p>
	 *
	 */
	public static final String $bd_po_no = "bd_po_no";
	private static final MCPermColumnInfo _bd_po_no = createColumnInfo("bd_po_no");
	public final MCStringPermColumn bd_po_no = createStringColumn(_bd_po_no);
	
	/**
	 * 負担インボイスＮＯ. Charged invoice No..<p>
	 *
	 */
	public static final String $bd_iv_no = "bd_iv_no";
	private static final MCPermColumnInfo _bd_iv_no = createColumnInfo("bd_iv_no");
	public final MCStringPermColumn bd_iv_no = createStringColumn(_bd_iv_no);
	
	/**
	 * 負担ワーキンググループＣＤ. Charged WG cd..<p>
	 *
	 */
	public static final String $bd_wg_cd = "bd_wg_cd";
	private static final MCPermColumnInfo _bd_wg_cd = createColumnInfo("bd_wg_cd");
	public final MCStringPermColumn bd_wg_cd = createStringColumn(_bd_wg_cd);
	
	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	private static final MCPermColumnInfo _dlv_cd = createColumnInfo("dlv_cd");
	public final MCStringPermColumn dlv_cd = createStringColumn(_dlv_cd);
	
	/**
	 * 配送先ＣＤ. Receiving point cd..<p>
	 *
	 */
	public static final String $tdlv_cd = "tdlv_cd";
	private static final MCPermColumnInfo _tdlv_cd = createColumnInfo("tdlv_cd");
	public final MCStringPermColumn tdlv_cd = createStringColumn(_tdlv_cd);
	
	/**
	 * 入金先ＣＤ. Payer cd..<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	private static final MCPermColumnInfo _rcst_cd = createColumnInfo("rcst_cd");
	public final MCStringPermColumn rcst_cd = createStringColumn(_rcst_cd);
	
	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	private static final MCPermColumnInfo _bcst_cd = createColumnInfo("bcst_cd");
	public final MCStringPermColumn bcst_cd = createStringColumn(_bcst_cd);
	
	/**
	 * 売掛先ＣＤ. AR customer cd..<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	private static final MCPermColumnInfo _acst_cd = createColumnInfo("acst_cd");
	public final MCStringPermColumn acst_cd = createStringColumn(_acst_cd);
	
	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	private static final MCPermColumnInfo _cst_cd = createColumnInfo("cst_cd");
	public final MCStringPermColumn cst_cd = createStringColumn(_cst_cd);
	
	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	private static final MCPermColumnInfo _dest_cd1 = createColumnInfo("dest_cd1");
	public final MCStringPermColumn dest_cd1 = createStringColumn(_dest_cd1);
	
	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	private static final MCPermColumnInfo _dest_cd2 = createColumnInfo("dest_cd2");
	public final MCStringPermColumn dest_cd2 = createStringColumn(_dest_cd2);
	
	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	private static final MCPermColumnInfo _dest_cd3 = createColumnInfo("dest_cd3");
	public final MCStringPermColumn dest_cd3 = createStringColumn(_dest_cd3);
	
	/**
	 * 支払先ＣＤ. Payee cd..<p>
	 *
	 */
	public static final String $psppl_cd = "psppl_cd";
	private static final MCPermColumnInfo _psppl_cd = createColumnInfo("psppl_cd");
	public final MCStringPermColumn psppl_cd = createStringColumn(_psppl_cd);
	
	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	private static final MCPermColumnInfo _bsppl_cd = createColumnInfo("bsppl_cd");
	public final MCStringPermColumn bsppl_cd = createStringColumn(_bsppl_cd);
	
	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	private static final MCPermColumnInfo _asppl_cd = createColumnInfo("asppl_cd");
	public final MCStringPermColumn asppl_cd = createStringColumn(_asppl_cd);
	
	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	private static final MCPermColumnInfo _sppl_cd = createColumnInfo("sppl_cd");
	public final MCStringPermColumn sppl_cd = createStringColumn(_sppl_cd);
	
	/**
	 * 与信管理先ＣＤ. Credit managed BP cd..<p>
	 *
	 */
	public static final String $cred_cd = "cred_cd";
	private static final MCPermColumnInfo _cred_cd = createColumnInfo("cred_cd");
	public final MCStringPermColumn cred_cd = createStringColumn(_cred_cd);
	
	/**
	 * 都度精算ＦＬＧ. Settlement per transaction flg..<p>
	 *
	 */
	public static final String $spot_flg = "spot_flg";
	private static final MCPermColumnInfo _spot_flg = createColumnInfo("spot_flg");
	public final MCBooleanPermColumn spot_flg = createBooleanColumn(_spot_flg);
	
	/**
	 * 決済予定日. Scheduled settlement date.<p>
	 *
	 */
	public static final String $sttl_schd_dt = "sttl_schd_dt";
	private static final MCPermColumnInfo _sttl_schd_dt = createColumnInfo("sttl_schd_dt");
	public final MCDatePermColumn sttl_schd_dt = createDateColumn(_sttl_schd_dt);
	
	/**
	 * 決済方法ＣＤ. Settlement method cd..<p>
	 *
	 */
	public static final String $sttl_cd = "sttl_cd";
	private static final MCPermColumnInfo _sttl_cd = createColumnInfo("sttl_cd");
	public final MCStringPermColumn sttl_cd = createStringColumn(_sttl_cd);
	
	/**
	 * 得意先品目ＣＤ. Customer item cd..<p>
	 *
	 */
	public static final String $cst_itm_cd = "cst_itm_cd";
	private static final MCPermColumnInfo _cst_itm_cd = createColumnInfo("cst_itm_cd");
	public final MCStringPermColumn cst_itm_cd = createStringColumn(_cst_itm_cd);
	
	/**
	 * 得意先品名. Customer item name.<p>
	 *
	 */
	public static final String $cst_itm_nm = "cst_itm_nm";
	private static final MCPermColumnInfo _cst_itm_nm = createColumnInfo("cst_itm_nm");
	public final MCStringPermColumn cst_itm_nm = createStringColumn(_cst_itm_nm);
	
	/**
	 * 発注先品目ＣＤ. Supplier item cd..<p>
	 *
	 */
	public static final String $sppl_itm_cd = "sppl_itm_cd";
	private static final MCPermColumnInfo _sppl_itm_cd = createColumnInfo("sppl_itm_cd");
	public final MCStringPermColumn sppl_itm_cd = createStringColumn(_sppl_itm_cd);
	
	/**
	 * 発注先品名. Supplier item name.<p>
	 *
	 */
	public static final String $sppl_itm_nm = "sppl_itm_nm";
	private static final MCPermColumnInfo _sppl_itm_nm = createColumnInfo("sppl_itm_nm");
	public final MCStringPermColumn sppl_itm_nm = createStringColumn(_sppl_itm_nm);
	
	/**
	 * 購買区分. Purchase type.<p>
	 *
	 */
	public static final String $purc_typ = "purc_typ";
	private static final MCPermColumnInfo _purc_typ = createColumnInfo("purc_typ");
	public final MCStringPermColumn purc_typ = createStringColumn(_purc_typ);
	
	/**
	 * 地域ＣＤ. Region cd..<p>
	 *
	 */
	public static final String $area_cd = "area_cd";
	private static final MCPermColumnInfo _area_cd = createColumnInfo("area_cd");
	public final MCStringPermColumn area_cd = createStringColumn(_area_cd);
	
	/**
	 * 国ＣＤ. Country cd..<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	private static final MCPermColumnInfo _cntry_cd = createColumnInfo("cntry_cd");
	public final MCStringPermColumn cntry_cd = createStringColumn(_cntry_cd);
	
	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	private static final MCPermColumnInfo _itm_mfg_inst_no = createColumnInfo("itm_mfg_inst_no");
	public final MCStringPermColumn itm_mfg_inst_no = createStringColumn(_itm_mfg_inst_no);
	
	/**
	 * 品目指図数量. Item order qty..<p>
	 *
	 */
	public static final String $itm_inst_qty = "itm_inst_qty";
	private static final MCPermColumnInfo _itm_inst_qty = createColumnInfo("itm_inst_qty");
	public final MCNumberPermColumn itm_inst_qty = createNumberColumn(_itm_inst_qty);
	
	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	private static final MCPermColumnInfo _mfg_inst_no = createColumnInfo("mfg_inst_no");
	public final MCStringPermColumn mfg_inst_no = createStringColumn(_mfg_inst_no);
	
	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	private static final MCPermColumnInfo _mfg_act_no = createColumnInfo("mfg_act_no");
	public final MCStringPermColumn mfg_act_no = createStringColumn(_mfg_act_no);
	
	/**
	 * 製造着手数量. Mfg. start qty..<p>
	 *
	 */
	public static final String $mfg_st_qty = "mfg_st_qty";
	private static final MCPermColumnInfo _mfg_st_qty = createColumnInfo("mfg_st_qty");
	public final MCNumberPermColumn mfg_st_qty = createNumberColumn(_mfg_st_qty);
	
	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	private static final MCPermColumnInfo _oper_act_no = createColumnInfo("oper_act_no");
	public final MCStringPermColumn oper_act_no = createStringColumn(_oper_act_no);
	
	/**
	 * 出来高進捗度. Output progress.<p>
	 *
	 */
	public static final String $yield_rate = "yield_rate";
	private static final MCPermColumnInfo _yield_rate = createColumnInfo("yield_rate");
	public final MCNumberPermColumn yield_rate = createNumberColumn(_yield_rate);
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	private static final MCPermColumnInfo _disp_seq = createColumnInfo("disp_seq");
	public final MCNumberPermColumn disp_seq = createNumberColumn(_disp_seq);
	
	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	private static final MCPermColumnInfo _oper_cd = createColumnInfo("oper_cd");
	public final MCStringPermColumn oper_cd = createStringColumn(_oper_cd);
	
	/**
	 * 投入場所ＣＤ. Input location cd..<p>
	 *
	 */
	public static final String $inpt_loc_cd = "inpt_loc_cd";
	private static final MCPermColumnInfo _inpt_loc_cd = createColumnInfo("inpt_loc_cd");
	public final MCStringPermColumn inpt_loc_cd = createStringColumn(_inpt_loc_cd);
	
	/**
	 * 投入棚・ラインＣＤ. Input rack/line cd..<p>
	 *
	 */
	public static final String $inpt_str_ln_cd = "inpt_str_ln_cd";
	private static final MCPermColumnInfo _inpt_str_ln_cd = createColumnInfo("inpt_str_ln_cd");
	public final MCStringPermColumn inpt_str_ln_cd = createStringColumn(_inpt_str_ln_cd);
	
	/**
	 * 外注製造場所ＣＤ. Subcontracting mfg. location cd..<p>
	 *
	 */
	public static final String $outsrc_mfg_loc_cd = "outsrc_mfg_loc_cd";
	private static final MCPermColumnInfo _outsrc_mfg_loc_cd = createColumnInfo("outsrc_mfg_loc_cd");
	public final MCStringPermColumn outsrc_mfg_loc_cd = createStringColumn(_outsrc_mfg_loc_cd);
	
	/**
	 * 外注製造場所部門ＣＤ. Subcontracting mfg. location dept. cd..<p>
	 *
	 */
	public static final String $outsrc_mfg_loc_dpt_cd = "outsrc_mfg_loc_dpt_cd";
	private static final MCPermColumnInfo _outsrc_mfg_loc_dpt_cd = createColumnInfo("outsrc_mfg_loc_dpt_cd");
	public final MCStringPermColumn outsrc_mfg_loc_dpt_cd = createStringColumn(_outsrc_mfg_loc_dpt_cd);
	
	/**
	 * 外注製造場所ワーキンググループＣＤ. Subcontracting mfg. location WG cd..<p>
	 *
	 */
	public static final String $outsrc_mfg_loc_wg_cd = "outsrc_mfg_loc_wg_cd";
	private static final MCPermColumnInfo _outsrc_mfg_loc_wg_cd = createColumnInfo("outsrc_mfg_loc_wg_cd");
	public final MCStringPermColumn outsrc_mfg_loc_wg_cd = createStringColumn(_outsrc_mfg_loc_wg_cd);
	
	/**
	 * 格納場所ＣＤ. Storage location cd..<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	private static final MCPermColumnInfo _strg_loc_cd = createColumnInfo("strg_loc_cd");
	public final MCStringPermColumn strg_loc_cd = createStringColumn(_strg_loc_cd);
	
	/**
	 * 格納棚・ラインＣＤ. Storage rack/line cd..<p>
	 *
	 */
	public static final String $strg_str_ln_cd = "strg_str_ln_cd";
	private static final MCPermColumnInfo _strg_str_ln_cd = createColumnInfo("strg_str_ln_cd");
	public final MCStringPermColumn strg_str_ln_cd = createStringColumn(_strg_str_ln_cd);
	
	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	private static final MCPermColumnInfo _mfg_inst_unit_typ = createColumnInfo("mfg_inst_unit_typ");
	public final MCStringPermColumn mfg_inst_unit_typ = createStringColumn(_mfg_inst_unit_typ);
	
	/**
	 * 買戻義務ＦＬＧ. Repurchase obligation flg..<p>
	 *
	 */
	public static final String $repurc_obli_flg = "repurc_obli_flg";
	private static final MCPermColumnInfo _repurc_obli_flg = createColumnInfo("repurc_obli_flg");
	public final MCBooleanPermColumn repurc_obli_flg = createBooleanColumn(_repurc_obli_flg);
	
	/**
	 * 出庫場所ＣＤ. GI location cd..<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	private static final MCPermColumnInfo _gi_loc_cd = createColumnInfo("gi_loc_cd");
	public final MCStringPermColumn gi_loc_cd = createStringColumn(_gi_loc_cd);
	
	/**
	 * 入庫場所ＣＤ. GR location cd..<p>
	 *
	 */
	public static final String $gr_loc_cd = "gr_loc_cd";
	private static final MCPermColumnInfo _gr_loc_cd = createColumnInfo("gr_loc_cd");
	public final MCStringPermColumn gr_loc_cd = createStringColumn(_gr_loc_cd);
	
	/**
	 * 棚卸基準日. Base date of inventory count.<p>
	 *
	 */
	public static final String $stktk_base_dt = "stktk_base_dt";
	private static final MCPermColumnInfo _stktk_base_dt = createColumnInfo("stktk_base_dt");
	public final MCDatePermColumn stktk_base_dt = createDateColumn(_stktk_base_dt);
	
	/**
	 * 親会計品目分類ＣＤ. Parent accounting item classification cd..<p>
	 *
	 */
	public static final String $par_ac_itm_grp_cd = "par_ac_itm_grp_cd";
	private static final MCPermColumnInfo _par_ac_itm_grp_cd = createColumnInfo("par_ac_itm_grp_cd");
	public final MCStringPermColumn par_ac_itm_grp_cd = createStringColumn(_par_ac_itm_grp_cd);
	
	/**
	 * 親品目仕訳ＣＤ. Parent item journal cd..<p>
	 *
	 */
	public static final String $par_itm_jnl_cd = "par_itm_jnl_cd";
	private static final MCPermColumnInfo _par_itm_jnl_cd = createColumnInfo("par_itm_jnl_cd");
	public final MCStringPermColumn par_itm_jnl_cd = createStringColumn(_par_itm_jnl_cd);
	
	/**
	 * 親品目ＣＤ. Parent item cd..<p>
	 *
	 */
	public static final String $par_itm_cd = "par_itm_cd";
	private static final MCPermColumnInfo _par_itm_cd = createColumnInfo("par_itm_cd");
	public final MCStringPermColumn par_itm_cd = createStringColumn(_par_itm_cd);
	
	/**
	 * 親品目枝番１. Parent item branch No. 1.<p>
	 *
	 */
	public static final String $par_itm_sub1 = "par_itm_sub1";
	private static final MCPermColumnInfo _par_itm_sub1 = createColumnInfo("par_itm_sub1");
	public final MCStringPermColumn par_itm_sub1 = createStringColumn(_par_itm_sub1);
	
	/**
	 * 親品目枝番２. Parent item branch No. 2.<p>
	 *
	 */
	public static final String $par_itm_sub2 = "par_itm_sub2";
	private static final MCPermColumnInfo _par_itm_sub2 = createColumnInfo("par_itm_sub2");
	public final MCStringPermColumn par_itm_sub2 = createStringColumn(_par_itm_sub2);
	
	/**
	 * 親品目枝番３. Parent item branch No. 3.<p>
	 *
	 */
	public static final String $par_itm_sub3 = "par_itm_sub3";
	private static final MCPermColumnInfo _par_itm_sub3 = createColumnInfo("par_itm_sub3");
	public final MCStringPermColumn par_itm_sub3 = createStringColumn(_par_itm_sub3);
	
	/**
	 * 親品名. Parent item name.<p>
	 *
	 */
	public static final String $par_itm_nm = "par_itm_nm";
	private static final MCPermColumnInfo _par_itm_nm = createColumnInfo("par_itm_nm");
	public final MCStringPermColumn par_itm_nm = createStringColumn(_par_itm_nm);
	
	/**
	 * 親ロットＮＯ. Parent lot No..<p>
	 *
	 */
	public static final String $par_lot_no = "par_lot_no";
	private static final MCPermColumnInfo _par_lot_no = createColumnInfo("par_lot_no");
	public final MCStringPermColumn par_lot_no = createStringColumn(_par_lot_no);
	
	/**
	 * 親サブロットＮＯ. Parent sublot No..<p>
	 *
	 */
	public static final String $par_sublot_no = "par_sublot_no";
	private static final MCPermColumnInfo _par_sublot_no = createColumnInfo("par_sublot_no");
	public final MCStringPermColumn par_sublot_no = createStringColumn(_par_sublot_no);
	
	/**
	 * 親手配ＮＯ１. Parent SEIBAN No. 1.<p>
	 *
	 */
	public static final String $par_sno1 = "par_sno1";
	private static final MCPermColumnInfo _par_sno1 = createColumnInfo("par_sno1");
	public final MCStringPermColumn par_sno1 = createStringColumn(_par_sno1);
	
	/**
	 * 親手配ＮＯ２. Parent SEIBAN No. 2.<p>
	 *
	 */
	public static final String $par_sno2 = "par_sno2";
	private static final MCPermColumnInfo _par_sno2 = createColumnInfo("par_sno2");
	public final MCStringPermColumn par_sno2 = createStringColumn(_par_sno2);
	
	/**
	 * 親手配ＮＯ３. Parent SEIBAN No. 3.<p>
	 *
	 */
	public static final String $par_sno3 = "par_sno3";
	private static final MCPermColumnInfo _par_sno3 = createColumnInfo("par_sno3");
	public final MCStringPermColumn par_sno3 = createStringColumn(_par_sno3);
	
	/**
	 * 親手配ＮＯ４. Parent SEIBAN No. 4.<p>
	 *
	 */
	public static final String $par_sno4 = "par_sno4";
	private static final MCPermColumnInfo _par_sno4 = createColumnInfo("par_sno4");
	public final MCStringPermColumn par_sno4 = createStringColumn(_par_sno4);
	
	/**
	 * 在庫発生基準ＦＬＧ. Inventory accrual base flg..<p>
	 *
	 */
	public static final String $accrual_flg = "accrual_flg";
	private static final MCPermColumnInfo _accrual_flg = createColumnInfo("accrual_flg");
	public final MCBooleanPermColumn accrual_flg = createBooleanColumn(_accrual_flg);
	
	/**
	 * 資産発生基準ＦＬＧ. Asset accrual base flg..<p>
	 *
	 */
	public static final String $accpt_flg = "accpt_flg";
	private static final MCPermColumnInfo _accpt_flg = createColumnInfo("accpt_flg");
	public final MCBooleanPermColumn accpt_flg = createBooleanColumn(_accpt_flg);
	
	/**
	 * 使用可能日基準ＦＬＧ. Available date basis flg..<p>
	 *
	 */
	public static final String $avl_flg = "avl_flg";
	private static final MCPermColumnInfo _avl_flg = createColumnInfo("avl_flg");
	public final MCBooleanPermColumn avl_flg = createBooleanColumn(_avl_flg);
	
	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	private static final MCPermColumnInfo _trd_rmrks = createColumnInfo("trd_rmrks");
	public final MCStringPermColumn trd_rmrks = createStringColumn(_trd_rmrks);
	
	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	private static final MCPermColumnInfo _trd_d_rmrks = createColumnInfo("trd_d_rmrks");
	public final MCStringPermColumn trd_d_rmrks = createStringColumn(_trd_d_rmrks);
	
	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	private static final MCPermColumnInfo _sub_char1 = createColumnInfo("sub_char1");
	public final MCStringPermColumn sub_char1 = createStringColumn(_sub_char1);
	
	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	private static final MCPermColumnInfo _sub_char2 = createColumnInfo("sub_char2");
	public final MCStringPermColumn sub_char2 = createStringColumn(_sub_char2);
	
	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	private static final MCPermColumnInfo _sub_char3 = createColumnInfo("sub_char3");
	public final MCStringPermColumn sub_char3 = createStringColumn(_sub_char3);
	
	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public static final String $sub_char4 = "sub_char4";
	private static final MCPermColumnInfo _sub_char4 = createColumnInfo("sub_char4");
	public final MCStringPermColumn sub_char4 = createStringColumn(_sub_char4);
	
	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public static final String $sub_char5 = "sub_char5";
	private static final MCPermColumnInfo _sub_char5 = createColumnInfo("sub_char5");
	public final MCStringPermColumn sub_char5 = createStringColumn(_sub_char5);
	
	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public static final String $sub_char6 = "sub_char6";
	private static final MCPermColumnInfo _sub_char6 = createColumnInfo("sub_char6");
	public final MCStringPermColumn sub_char6 = createStringColumn(_sub_char6);
	
	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public static final String $sub_char7 = "sub_char7";
	private static final MCPermColumnInfo _sub_char7 = createColumnInfo("sub_char7");
	public final MCStringPermColumn sub_char7 = createStringColumn(_sub_char7);
	
	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public static final String $sub_char8 = "sub_char8";
	private static final MCPermColumnInfo _sub_char8 = createColumnInfo("sub_char8");
	public final MCStringPermColumn sub_char8 = createStringColumn(_sub_char8);
	
	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public static final String $sub_char9 = "sub_char9";
	private static final MCPermColumnInfo _sub_char9 = createColumnInfo("sub_char9");
	public final MCStringPermColumn sub_char9 = createStringColumn(_sub_char9);
	
	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public static final String $sub_char10 = "sub_char10";
	private static final MCPermColumnInfo _sub_char10 = createColumnInfo("sub_char10");
	public final MCStringPermColumn sub_char10 = createStringColumn(_sub_char10);
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public static final String $sub_num1 = "sub_num1";
	private static final MCPermColumnInfo _sub_num1 = createColumnInfo("sub_num1");
	public final MCNumberPermColumn sub_num1 = createNumberColumn(_sub_num1);
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public static final String $sub_num2 = "sub_num2";
	private static final MCPermColumnInfo _sub_num2 = createColumnInfo("sub_num2");
	public final MCNumberPermColumn sub_num2 = createNumberColumn(_sub_num2);
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public static final String $sub_num3 = "sub_num3";
	private static final MCPermColumnInfo _sub_num3 = createColumnInfo("sub_num3");
	public final MCNumberPermColumn sub_num3 = createNumberColumn(_sub_num3);
	
	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public static final String $sub_dt1 = "sub_dt1";
	private static final MCPermColumnInfo _sub_dt1 = createColumnInfo("sub_dt1");
	public final MCDatePermColumn sub_dt1 = createDateColumn(_sub_dt1);
	
	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public static final String $sub_dt2 = "sub_dt2";
	private static final MCPermColumnInfo _sub_dt2 = createColumnInfo("sub_dt2");
	public final MCDatePermColumn sub_dt2 = createDateColumn(_sub_dt2);
	
	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public static final String $sub_dt3 = "sub_dt3";
	private static final MCPermColumnInfo _sub_dt3 = createColumnInfo("sub_dt3");
	public final MCDatePermColumn sub_dt3 = createDateColumn(_sub_dt3);
	
	/**
	 * 親伝票ＮＯ. Parent slip No..<p>
	 *
	 */
	public static final String $par_slip_no = "par_slip_no";
	private static final MCPermColumnInfo _par_slip_no = createColumnInfo("par_slip_no");
	public final MCStringPermColumn par_slip_no = createStringColumn(_par_slip_no);
	
	/**
	 * 親伝票連番. Parent slip sequence number.<p>
	 *
	 */
	public static final String $par_slip_seq_no = "par_slip_seq_no";
	private static final MCPermColumnInfo _par_slip_seq_no = createColumnInfo("par_slip_seq_no");
	public final MCNumberPermColumn par_slip_seq_no = createNumberColumn(_par_slip_seq_no);
	
	/**
	 * 補完ＦＬＧ. Complement flg..<p>
	 *
	 */
	public static final String $slip_cmpl_flg = "slip_cmpl_flg";
	private static final MCPermColumnInfo _slip_cmpl_flg = createColumnInfo("slip_cmpl_flg");
	public final MCBooleanPermColumn slip_cmpl_flg = createBooleanColumn(_slip_cmpl_flg);
	
	/**
	 * 送信対象ＦＬＧ. To be exported flg..<p>
	 *
	 */
	public static final String $send_flg = "send_flg";
	private static final MCPermColumnInfo _send_flg = createColumnInfo("send_flg");
	public final MCBooleanPermColumn send_flg = createBooleanColumn(_send_flg);
	
	/**
	 * 原価取込済ＦＬＧ. Cost imported flg..<p>
	 *
	 */
	public static final String $c_imp_flg = "c_imp_flg";
	private static final MCPermColumnInfo _c_imp_flg = createColumnInfo("c_imp_flg");
	public final MCBooleanPermColumn c_imp_flg = createBooleanColumn(_c_imp_flg);
	
	/**
	 * 会計ＩＦ取込済ＦＬＧ. Accounting IF imported flg..<p>
	 *
	 */
	public static final String $a_imp_flg = "a_imp_flg";
	private static final MCPermColumnInfo _a_imp_flg = createColumnInfo("a_imp_flg");
	public final MCBooleanPermColumn a_imp_flg = createBooleanColumn(_a_imp_flg);
	
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
	
	public static final MCMeta slip_no_META = createCommonMeta($slip_no, mcframe.commonMA.meta.MA_META.SLIP_NO);
	public static final MCMeta slip_seq_no_META = createCommonMeta($slip_seq_no, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta act_tm_META = createCommonMeta($act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta slip_rev_no_META = createCommonMeta($slip_rev_no, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta act_no_META = createCommonMeta($act_no, mcframe.commonMA.meta.MA_META.ACT_NO);
	public static final MCMeta act_seq_META = createCommonMeta($act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta act_rev_no_META = createCommonMeta($act_rev_no, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta act_d_no_META = createCommonMeta($act_d_no, mcframe.commonMA.meta.MA_META.ACT_D_NO);
	public static final MCMeta act_d_seq_META = createCommonMeta($act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta act_io_no_META = createCommonMeta($act_io_no, mcframe.commonMA.meta.MA_META.ACT_IO_NO);
	public static final MCMeta act_io_seq_META = createCommonMeta($act_io_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta un_fix_flg_META = createCommonMeta($un_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta temp_ap_flg_META = createCommonMeta($temp_ap_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta trn_typ_META = createCommonMeta($trn_typ, mcframe.commonMS.meta.MS_META.TRN_TYP);
	public static final MCMeta io_act_typ_META = createCommonMeta($io_act_typ, mcframe.commonMS.meta.MS_META.IO_ACT_TYP);
	public static final MCMeta io_typ_META = createCommonMeta($io_typ, mcframe.commonMS.meta.MS_META.IO_TYP);
	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta gi_wg_cd_META = createCommonMeta($gi_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gr_wg_cd_META = createCommonMeta($gr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta purc_dpt_cd_META = createCommonMeta($purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta gi_dpt_cd_META = createCommonMeta($gi_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta gr_dpt_cd_META = createCommonMeta($gr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sub_dpt_cd1_META = createCommonMeta($sub_dpt_cd1, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sub_dpt_cd2_META = createCommonMeta($sub_dpt_cd2, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sub_dpt_cd3_META = createCommonMeta($sub_dpt_cd3, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta mfg_usr_cd_META = createCommonMeta($mfg_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta purc_usr_cd_META = createCommonMeta($purc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta ac_itm_grp_cd_META = createCommonMeta($ac_itm_grp_cd, mcframe.commonMA.meta.MA_META.AC_ITM_GRP_CD);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta fix_no_typ_META = createCommonMeta($fix_no_typ, mcframe.commonMS.meta.MS_META.FIX_NO_TYP);
	public static final MCMeta fix_no_META = createCommonMeta($fix_no, mcframe.commonMA.meta.MA_META.FIX_NO);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta in_xfr_typ_META = createCommonMeta($in_xfr_typ, mcframe.commonMS.meta.MS_META.IN_XFR_TYP);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_proc_amt_META = createCommonMeta($trd_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_onr_prov_amt_META = createCommonMeta($trd_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_upri_META = createCommonMeta($base_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_proc_amt_META = createCommonMeta($base_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_onr_prov_amt_META = createCommonMeta($base_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_cur_upri_META = createCommonMeta($ptax_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_amt_META = createCommonMeta($ptax_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_proc_amt_META = createCommonMeta($ptax_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_onr_prov_amt_META = createCommonMeta($ptax_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_tax_amt_META = createCommonMeta($ptax_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_META = createCommonMeta($wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta foreign_flg_META = createCommonMeta($foreign_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_xrate_cd_META = createCommonMeta($ptax_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta ptax_xrate_META = createCommonMeta($ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta bd_ctg_cd_META = createCommonMeta($bd_ctg_cd, mcframe.commonMA.meta.MA_META.COST_CTG_CD);
	public static final MCMeta bd_bp_cd_META = createCommonMeta($bd_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bd_oper_cd_META = createCommonMeta($bd_oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta bd_loc_cd_META = createCommonMeta($bd_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta bd_slo_no_META = createCommonMeta($bd_slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta bd_po_no_META = createCommonMeta($bd_po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta bd_iv_no_META = createCommonMeta($bd_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta bd_wg_cd_META = createCommonMeta($bd_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cred_cd_META = createCommonMeta($cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta spot_flg_META = createCommonMeta($spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sttl_schd_dt_META = createCommonMeta($sttl_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sttl_cd_META = createCommonMeta($sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta purc_typ_META = createCommonMeta($purc_typ, mcframe.commonMA.meta.MA_META.PURC_TYP);
	public static final MCMeta area_cd_META = createCommonMeta($area_cd, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta itm_inst_qty_META = createCommonMeta($itm_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta mfg_st_qty_META = createCommonMeta($mfg_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta yield_rate_META = createCommonMeta($yield_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta inpt_loc_cd_META = createCommonMeta($inpt_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inpt_str_ln_cd_META = createCommonMeta($inpt_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta outsrc_mfg_loc_cd_META = createCommonMeta($outsrc_mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta outsrc_mfg_loc_dpt_cd_META = createCommonMeta($outsrc_mfg_loc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta outsrc_mfg_loc_wg_cd_META = createCommonMeta($outsrc_mfg_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_str_ln_cd_META = createCommonMeta($strg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gr_loc_cd_META = createCommonMeta($gr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta stktk_base_dt_META = createCommonMeta($stktk_base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta par_ac_itm_grp_cd_META = createCommonMeta($par_ac_itm_grp_cd, mcframe.commonMA.meta.MA_META.AC_ITM_GRP_CD);
	public static final MCMeta par_itm_jnl_cd_META = createCommonMeta($par_itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta par_itm_cd_META = createCommonMeta($par_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta par_itm_sub1_META = createCommonMeta($par_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta par_itm_sub2_META = createCommonMeta($par_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta par_itm_sub3_META = createCommonMeta($par_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta par_itm_nm_META = createCommonMeta($par_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta par_lot_no_META = createCommonMeta($par_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta par_sublot_no_META = createCommonMeta($par_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta par_sno1_META = createCommonMeta($par_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta par_sno2_META = createCommonMeta($par_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta par_sno3_META = createCommonMeta($par_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta par_sno4_META = createCommonMeta($par_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta accrual_flg_META = createCommonMeta($accrual_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta accpt_flg_META = createCommonMeta($accpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta avl_flg_META = createCommonMeta($avl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMA.meta.MA_META.SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMA.meta.MA_META.SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMA.meta.MA_META.SUB_CHAR3);
	public static final MCMeta sub_char4_META = createCommonMeta($sub_char4, mcframe.commonMA.meta.MA_META.SUB_CHAR4);
	public static final MCMeta sub_char5_META = createCommonMeta($sub_char5, mcframe.commonMA.meta.MA_META.SUB_CHAR5);
	public static final MCMeta sub_char6_META = createCommonMeta($sub_char6, mcframe.commonMA.meta.MA_META.SUB_CHAR6);
	public static final MCMeta sub_char7_META = createCommonMeta($sub_char7, mcframe.commonMA.meta.MA_META.SUB_CHAR7);
	public static final MCMeta sub_char8_META = createCommonMeta($sub_char8, mcframe.commonMA.meta.MA_META.SUB_CHAR8);
	public static final MCMeta sub_char9_META = createCommonMeta($sub_char9, mcframe.commonMA.meta.MA_META.SUB_CHAR9);
	public static final MCMeta sub_char10_META = createCommonMeta($sub_char10, mcframe.commonMA.meta.MA_META.SUB_CHAR10);
	public static final MCMeta sub_num1_META = createCommonMeta($sub_num1, mcframe.commonMA.meta.MA_META.SUB_NUM1);
	public static final MCMeta sub_num2_META = createCommonMeta($sub_num2, mcframe.commonMA.meta.MA_META.SUB_NUM2);
	public static final MCMeta sub_num3_META = createCommonMeta($sub_num3, mcframe.commonMA.meta.MA_META.SUB_NUM3);
	public static final MCMeta sub_dt1_META = createCommonMeta($sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt2_META = createCommonMeta($sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt3_META = createCommonMeta($sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta par_slip_no_META = createCommonMeta($par_slip_no, mcframe.commonMA.meta.MA_META.SLIP_NO);
	public static final MCMeta par_slip_seq_no_META = createCommonMeta($par_slip_seq_no, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta slip_cmpl_flg_META = createCommonMeta($slip_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta send_flg_META = createCommonMeta($send_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta c_imp_flg_META = createCommonMeta($c_imp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta a_imp_flg_META = createCommonMeta($a_imp_flg, mcframe.commonMA.meta.MA_META.FLG);
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

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MST_IO_ACT_R> constMetas = new ConstMetaList<MST_IO_ACT_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			slip_no_META,
			slip_seq_no_META,
			ac_ym_META,
			ac_dt_META,
			act_tm_META,
			slip_rev_no_META,
			act_no_META,
			act_seq_META,
			act_rev_no_META,
			act_d_no_META,
			act_d_seq_META,
			act_io_no_META,
			act_io_seq_META,
			slip_sts_typ_META,
			un_fix_flg_META,
			temp_ap_flg_META,
			trd_cd_META,
			trd_ptn_typ_META,
			trn_typ_META,
			io_act_typ_META,
			io_typ_META,
			ac_slip_typ_META,
			rsn_cd_META,
			ac_rsn_cd_META,
			gi_wg_cd_META,
			gr_wg_cd_META,
			act_dpt_cd_META,
			purc_dpt_cd_META,
			ap_dpt_cd_META,
			sls_dpt_cd_META,
			ar_dpt_cd_META,
			gi_dpt_cd_META,
			gr_dpt_cd_META,
			bd_dpt_cd_META,
			sub_dpt_cd1_META,
			sub_dpt_cd2_META,
			sub_dpt_cd3_META,
			act_usr_cd_META,
			sls_usr_cd_META,
			mfg_usr_cd_META,
			purc_usr_cd_META,
			ac_itm_grp_cd_META,
			itm_jnl_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			stk_mng_typ_META,
			asset_mng_typ_META,
			sundry_itm_flg_META,
			loc_cd_META,
			str_ln_cd_META,
			stk_arrv_bp_cd_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			fix_no_typ_META,
			fix_no_META,
			gd_cd_META,
			in_xfr_typ_META,
			quality_typ_META,
			asst_typ_META,
			stk_insp_typ_META,
			stk_id_typ_META,
			stk_bp_cd_META,
			trd_unit_qty_META,
			trd_unit_cd_META,
			pack_unit_qty_META,
			pack_unit_cd_META,
			base_unit_qty_META,
			base_unit_cd_META,
			trd_cur_cd_META,
			trd_cur_upri_META,
			trd_cur_amt_META,
			trd_cur_proc_amt_META,
			trd_cur_onr_prov_amt_META,
			trd_cur_tax_amt_META,
			base_cur_cd_META,
			base_cur_upri_META,
			base_cur_amt_META,
			base_cur_proc_amt_META,
			base_cur_onr_prov_amt_META,
			base_cur_tax_amt_META,
			ptax_cur_cd_META,
			ptax_cur_upri_META,
			ptax_cur_amt_META,
			ptax_cur_proc_amt_META,
			ptax_cur_onr_prov_amt_META,
			ptax_cur_tax_amt_META,
			wtax_rate_META,
			wtax_amt_META,
			tax_cd_META,
			foreign_flg_META,
			xrate_cd_META,
			xrate_META,
			ptax_xrate_cd_META,
			ptax_xrate_META,
			slo_no_META,
			po_no_META,
			iv_no_META,
			rcpt_iv_no_META,
			bd_ctg_cd_META,
			bd_bp_cd_META,
			bd_oper_cd_META,
			bd_loc_cd_META,
			bd_slo_no_META,
			bd_po_no_META,
			bd_iv_no_META,
			bd_wg_cd_META,
			dlv_cd_META,
			tdlv_cd_META,
			rcst_cd_META,
			bcst_cd_META,
			acst_cd_META,
			cst_cd_META,
			dest_cd1_META,
			dest_cd2_META,
			dest_cd3_META,
			psppl_cd_META,
			bsppl_cd_META,
			asppl_cd_META,
			sppl_cd_META,
			cred_cd_META,
			spot_flg_META,
			sttl_schd_dt_META,
			sttl_cd_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			purc_typ_META,
			area_cd_META,
			cntry_cd_META,
			itm_mfg_inst_no_META,
			itm_inst_qty_META,
			mfg_inst_no_META,
			mfg_act_no_META,
			mfg_st_qty_META,
			oper_act_no_META,
			yield_rate_META,
			disp_seq_META,
			oper_cd_META,
			inpt_loc_cd_META,
			inpt_str_ln_cd_META,
			outsrc_mfg_loc_cd_META,
			outsrc_mfg_loc_dpt_cd_META,
			outsrc_mfg_loc_wg_cd_META,
			strg_loc_cd_META,
			strg_str_ln_cd_META,
			mfg_inst_unit_typ_META,
			repurc_obli_flg_META,
			gi_loc_cd_META,
			gr_loc_cd_META,
			stktk_base_dt_META,
			par_ac_itm_grp_cd_META,
			par_itm_jnl_cd_META,
			par_itm_cd_META,
			par_itm_sub1_META,
			par_itm_sub2_META,
			par_itm_sub3_META,
			par_itm_nm_META,
			par_lot_no_META,
			par_sublot_no_META,
			par_sno1_META,
			par_sno2_META,
			par_sno3_META,
			par_sno4_META,
			accrual_flg_META,
			accpt_flg_META,
			avl_flg_META,
			trd_rmrks_META,
			trd_d_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			sub_char4_META,
			sub_char5_META,
			sub_char6_META,
			sub_char7_META,
			sub_char8_META,
			sub_char9_META,
			sub_char10_META,
			sub_num1_META,
			sub_num2_META,
			sub_num3_META,
			sub_dt1_META,
			sub_dt2_META,
			sub_dt3_META,
			par_slip_no_META,
			par_slip_seq_no_META,
			slip_cmpl_flg_META,
			send_flg_META,
			c_imp_flg_META,
			a_imp_flg_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_srv_req_no_META
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
	protected MST_IO_ACT_R(ConstMetaList<? extends MST_IO_ACT_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_IO_ACT_R(ConstMetaList<? extends MST_IO_ACT_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_IO_ACT_R.$slip_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$slip_no,
				"slip_no",
				slip_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$slip_seq_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$slip_seq_no,
				"slip_seq_no",
				slip_seq_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$ac_ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_IO_ACT_R.$ac_ym,
				"ac_ym",
				ac_ym,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_IO_ACT_R.$ac_dt,
				"ac_dt",
				ac_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$act_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_IO_ACT_R.$act_tm,
				"act_tm",
				act_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$slip_rev_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$slip_rev_no,
				"slip_rev_no",
				slip_rev_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$act_no,
				"act_no",
				act_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$act_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$act_seq,
				"act_seq",
				act_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$act_rev_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$act_rev_no,
				"act_rev_no",
				act_rev_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$act_d_no,
				"act_d_no",
				act_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$act_d_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$act_d_seq,
				"act_d_seq",
				act_d_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$act_io_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$act_io_no,
				"act_io_no",
				act_io_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$act_io_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$act_io_seq,
				"act_io_seq",
				act_io_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$slip_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$slip_sts_typ,
				"slip_sts_typ",
				slip_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$un_fix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IO_ACT_R.$un_fix_flg,
				"un_fix_flg",
				un_fix_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$temp_ap_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IO_ACT_R.$temp_ap_flg,
				"temp_ap_flg",
				temp_ap_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$trd_cd,
				"trd_cd",
				trd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$trd_ptn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$trd_ptn_typ,
				"trd_ptn_typ",
				trd_ptn_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$trn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$trn_typ,
				"trn_typ",
				trn_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$io_act_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$io_act_typ,
				"io_act_typ",
				io_act_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$io_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$io_typ,
				"io_typ",
				io_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$ac_slip_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$ac_slip_typ,
				"ac_slip_typ",
				ac_slip_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$rsn_cd,
				"rsn_cd",
				rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$ac_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$ac_rsn_cd,
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
			MST_IO_ACT_R.$gi_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$gi_wg_cd,
				"gi_wg_cd",
				gi_wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$gr_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$gr_wg_cd,
				"gr_wg_cd",
				gr_wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$act_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$act_dpt_cd,
				"act_dpt_cd",
				act_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$purc_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$purc_dpt_cd,
				"purc_dpt_cd",
				purc_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$ap_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$ap_dpt_cd,
				"ap_dpt_cd",
				ap_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sls_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sls_dpt_cd,
				"sls_dpt_cd",
				sls_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$ar_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$ar_dpt_cd,
				"ar_dpt_cd",
				ar_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$gi_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$gi_dpt_cd,
				"gi_dpt_cd",
				gi_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$gr_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$gr_dpt_cd,
				"gr_dpt_cd",
				gr_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$bd_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$bd_dpt_cd,
				"bd_dpt_cd",
				bd_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sub_dpt_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sub_dpt_cd1,
				"sub_dpt_cd1",
				sub_dpt_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sub_dpt_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sub_dpt_cd2,
				"sub_dpt_cd2",
				sub_dpt_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sub_dpt_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sub_dpt_cd3,
				"sub_dpt_cd3",
				sub_dpt_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$act_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$act_usr_cd,
				"act_usr_cd",
				act_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sls_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sls_usr_cd,
				"sls_usr_cd",
				sls_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$mfg_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$mfg_usr_cd,
				"mfg_usr_cd",
				mfg_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$purc_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$purc_usr_cd,
				"purc_usr_cd",
				purc_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$ac_itm_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$ac_itm_grp_cd,
				"ac_itm_grp_cd",
				ac_itm_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$itm_jnl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$itm_jnl_cd,
				"itm_jnl_cd",
				itm_jnl_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$itm_cd,
				"itm_cd",
				itm_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$itm_nm,
				"itm_nm",
				itm_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$stk_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$stk_mng_typ,
				"stk_mng_typ",
				stk_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$asset_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$asset_mng_typ,
				"asset_mng_typ",
				asset_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sundry_itm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IO_ACT_R.$sundry_itm_flg,
				"sundry_itm_flg",
				sundry_itm_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$loc_cd,
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
			MST_IO_ACT_R.$str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$str_ln_cd,
				"str_ln_cd",
				str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$stk_arrv_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$stk_arrv_bp_cd,
				"stk_arrv_bp_cd",
				stk_arrv_bp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$lot_no,
				"lot_no",
				lot_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sublot_no,
				"sublot_no",
				sublot_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sno1,
				"sno1",
				sno1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sno2,
				"sno2",
				sno2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sno3,
				"sno3",
				sno3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sno4,
				"sno4",
				sno4,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$fix_no_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$fix_no_typ,
				"fix_no_typ",
				fix_no_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$fix_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$fix_no,
				"fix_no",
				fix_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$gd_cd,
				"gd_cd",
				gd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$in_xfr_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$in_xfr_typ,
				"in_xfr_typ",
				in_xfr_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$quality_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$quality_typ,
				"quality_typ",
				quality_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$asst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$asst_typ,
				"asst_typ",
				asst_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$stk_insp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$stk_insp_typ,
				"stk_insp_typ",
				stk_insp_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$stk_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$stk_id_typ,
				"stk_id_typ",
				stk_id_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$stk_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$stk_bp_cd,
				"stk_bp_cd",
				stk_bp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$trd_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$trd_unit_qty,
				"trd_unit_qty",
				trd_unit_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$trd_unit_cd,
				"trd_unit_cd",
				trd_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$pack_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$pack_unit_qty,
				"pack_unit_qty",
				pack_unit_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$pack_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$pack_unit_cd,
				"pack_unit_cd",
				pack_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$base_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$base_unit_qty,
				"base_unit_qty",
				base_unit_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$base_unit_cd,
				"base_unit_cd",
				base_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$trd_cur_cd,
				"trd_cur_cd",
				trd_cur_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$trd_cur_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$trd_cur_upri,
				"trd_cur_upri",
				trd_cur_upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$trd_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$trd_cur_amt,
				"trd_cur_amt",
				trd_cur_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$trd_cur_proc_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$trd_cur_proc_amt,
				"trd_cur_proc_amt",
				trd_cur_proc_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$trd_cur_onr_prov_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$trd_cur_onr_prov_amt,
				"trd_cur_onr_prov_amt",
				trd_cur_onr_prov_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$trd_cur_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$trd_cur_tax_amt,
				"trd_cur_tax_amt",
				trd_cur_tax_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$base_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$base_cur_cd,
				"base_cur_cd",
				base_cur_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$base_cur_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$base_cur_upri,
				"base_cur_upri",
				base_cur_upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$base_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$base_cur_amt,
				"base_cur_amt",
				base_cur_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$base_cur_proc_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$base_cur_proc_amt,
				"base_cur_proc_amt",
				base_cur_proc_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$base_cur_onr_prov_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$base_cur_onr_prov_amt,
				"base_cur_onr_prov_amt",
				base_cur_onr_prov_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$base_cur_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$base_cur_tax_amt,
				"base_cur_tax_amt",
				base_cur_tax_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$ptax_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$ptax_cur_cd,
				"ptax_cur_cd",
				ptax_cur_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$ptax_cur_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$ptax_cur_upri,
				"ptax_cur_upri",
				ptax_cur_upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$ptax_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$ptax_cur_amt,
				"ptax_cur_amt",
				ptax_cur_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$ptax_cur_proc_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$ptax_cur_proc_amt,
				"ptax_cur_proc_amt",
				ptax_cur_proc_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$ptax_cur_onr_prov_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$ptax_cur_onr_prov_amt,
				"ptax_cur_onr_prov_amt",
				ptax_cur_onr_prov_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$ptax_cur_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$ptax_cur_tax_amt,
				"ptax_cur_tax_amt",
				ptax_cur_tax_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$wtax_rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$wtax_rate,
				"wtax_rate",
				wtax_rate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$wtax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$wtax_amt,
				"wtax_amt",
				wtax_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$tax_cd,
				"tax_cd",
				tax_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$foreign_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IO_ACT_R.$foreign_flg,
				"foreign_flg",
				foreign_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$xrate_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$xrate_cd,
				"xrate_cd",
				xrate_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$xrate,
				"xrate",
				xrate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$ptax_xrate_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$ptax_xrate_cd,
				"ptax_xrate_cd",
				ptax_xrate_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$ptax_xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$ptax_xrate,
				"ptax_xrate",
				ptax_xrate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$slo_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$slo_no,
				"slo_no",
				slo_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$po_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$po_no,
				"po_no",
				po_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$iv_no,
				"iv_no",
				iv_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$rcpt_iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$rcpt_iv_no,
				"rcpt_iv_no",
				rcpt_iv_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$bd_ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$bd_ctg_cd,
				"bd_ctg_cd",
				bd_ctg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$bd_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$bd_bp_cd,
				"bd_bp_cd",
				bd_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$bd_oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$bd_oper_cd,
				"bd_oper_cd",
				bd_oper_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$bd_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$bd_loc_cd,
				"bd_loc_cd",
				bd_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$bd_slo_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$bd_slo_no,
				"bd_slo_no",
				bd_slo_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$bd_po_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$bd_po_no,
				"bd_po_no",
				bd_po_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$bd_iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$bd_iv_no,
				"bd_iv_no",
				bd_iv_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$bd_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$bd_wg_cd,
				"bd_wg_cd",
				bd_wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$dlv_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$dlv_cd,
				"dlv_cd",
				dlv_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$tdlv_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$tdlv_cd,
				"tdlv_cd",
				tdlv_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$rcst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$rcst_cd,
				"rcst_cd",
				rcst_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$bcst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$bcst_cd,
				"bcst_cd",
				bcst_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$acst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$acst_cd,
				"acst_cd",
				acst_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$cst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$cst_cd,
				"cst_cd",
				cst_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$dest_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$dest_cd1,
				"dest_cd1",
				dest_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$dest_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$dest_cd2,
				"dest_cd2",
				dest_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$dest_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$dest_cd3,
				"dest_cd3",
				dest_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$psppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$psppl_cd,
				"psppl_cd",
				psppl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$bsppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$bsppl_cd,
				"bsppl_cd",
				bsppl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$asppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$asppl_cd,
				"asppl_cd",
				asppl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sppl_cd,
				"sppl_cd",
				sppl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$cred_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$cred_cd,
				"cred_cd",
				cred_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$spot_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IO_ACT_R.$spot_flg,
				"spot_flg",
				spot_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sttl_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_IO_ACT_R.$sttl_schd_dt,
				"sttl_schd_dt",
				sttl_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sttl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sttl_cd,
				"sttl_cd",
				sttl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$cst_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$cst_itm_cd,
				"cst_itm_cd",
				cst_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$cst_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$cst_itm_nm,
				"cst_itm_nm",
				cst_itm_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sppl_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sppl_itm_cd,
				"sppl_itm_cd",
				sppl_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sppl_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sppl_itm_nm,
				"sppl_itm_nm",
				sppl_itm_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$purc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$purc_typ,
				"purc_typ",
				purc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$area_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$area_cd,
				"area_cd",
				area_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$cntry_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$cntry_cd,
				"cntry_cd",
				cntry_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$itm_mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$itm_mfg_inst_no,
				"itm_mfg_inst_no",
				itm_mfg_inst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$itm_inst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$itm_inst_qty,
				"itm_inst_qty",
				itm_inst_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$mfg_inst_no,
				"mfg_inst_no",
				mfg_inst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$mfg_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$mfg_act_no,
				"mfg_act_no",
				mfg_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$mfg_st_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$mfg_st_qty,
				"mfg_st_qty",
				mfg_st_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$oper_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$oper_act_no,
				"oper_act_no",
				oper_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$yield_rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$yield_rate,
				"yield_rate",
				yield_rate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$disp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$disp_seq,
				"disp_seq",
				disp_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$oper_cd,
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
			MST_IO_ACT_R.$inpt_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$inpt_loc_cd,
				"inpt_loc_cd",
				inpt_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$inpt_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$inpt_str_ln_cd,
				"inpt_str_ln_cd",
				inpt_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$outsrc_mfg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$outsrc_mfg_loc_cd,
				"outsrc_mfg_loc_cd",
				outsrc_mfg_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$outsrc_mfg_loc_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$outsrc_mfg_loc_dpt_cd,
				"outsrc_mfg_loc_dpt_cd",
				outsrc_mfg_loc_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$outsrc_mfg_loc_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$outsrc_mfg_loc_wg_cd,
				"outsrc_mfg_loc_wg_cd",
				outsrc_mfg_loc_wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$strg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$strg_loc_cd,
				"strg_loc_cd",
				strg_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$strg_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$strg_str_ln_cd,
				"strg_str_ln_cd",
				strg_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$mfg_inst_unit_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$mfg_inst_unit_typ,
				"mfg_inst_unit_typ",
				mfg_inst_unit_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$repurc_obli_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IO_ACT_R.$repurc_obli_flg,
				"repurc_obli_flg",
				repurc_obli_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$gi_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$gi_loc_cd,
				"gi_loc_cd",
				gi_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$gr_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$gr_loc_cd,
				"gr_loc_cd",
				gr_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$stktk_base_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_IO_ACT_R.$stktk_base_dt,
				"stktk_base_dt",
				stktk_base_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$par_ac_itm_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$par_ac_itm_grp_cd,
				"par_ac_itm_grp_cd",
				par_ac_itm_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$par_itm_jnl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$par_itm_jnl_cd,
				"par_itm_jnl_cd",
				par_itm_jnl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$par_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$par_itm_cd,
				"par_itm_cd",
				par_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$par_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$par_itm_sub1,
				"par_itm_sub1",
				par_itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$par_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$par_itm_sub2,
				"par_itm_sub2",
				par_itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$par_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$par_itm_sub3,
				"par_itm_sub3",
				par_itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$par_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$par_itm_nm,
				"par_itm_nm",
				par_itm_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$par_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$par_lot_no,
				"par_lot_no",
				par_lot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$par_sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$par_sublot_no,
				"par_sublot_no",
				par_sublot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$par_sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$par_sno1,
				"par_sno1",
				par_sno1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$par_sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$par_sno2,
				"par_sno2",
				par_sno2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$par_sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$par_sno3,
				"par_sno3",
				par_sno3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$par_sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$par_sno4,
				"par_sno4",
				par_sno4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$accrual_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IO_ACT_R.$accrual_flg,
				"accrual_flg",
				accrual_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$accpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IO_ACT_R.$accpt_flg,
				"accpt_flg",
				accpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$avl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IO_ACT_R.$avl_flg,
				"avl_flg",
				avl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$trd_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$trd_rmrks,
				"trd_rmrks",
				trd_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$trd_d_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$trd_d_rmrks,
				"trd_d_rmrks",
				trd_d_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sub_char1,
				"sub_char1",
				sub_char1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sub_char2,
				"sub_char2",
				sub_char2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sub_char3,
				"sub_char3",
				sub_char3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sub_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sub_char4,
				"sub_char4",
				sub_char4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sub_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sub_char5,
				"sub_char5",
				sub_char5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sub_char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sub_char6,
				"sub_char6",
				sub_char6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sub_char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sub_char7,
				"sub_char7",
				sub_char7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sub_char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sub_char8,
				"sub_char8",
				sub_char8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sub_char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sub_char9,
				"sub_char9",
				sub_char9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sub_char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$sub_char10,
				"sub_char10",
				sub_char10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sub_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$sub_num1,
				"sub_num1",
				sub_num1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sub_num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$sub_num2,
				"sub_num2",
				sub_num2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sub_num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$sub_num3,
				"sub_num3",
				sub_num3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sub_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_IO_ACT_R.$sub_dt1,
				"sub_dt1",
				sub_dt1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sub_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_IO_ACT_R.$sub_dt2,
				"sub_dt2",
				sub_dt2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$sub_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_IO_ACT_R.$sub_dt3,
				"sub_dt3",
				sub_dt3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$par_slip_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$par_slip_no,
				"par_slip_no",
				par_slip_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$par_slip_seq_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$par_slip_seq_no,
				"par_slip_seq_no",
				par_slip_seq_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$slip_cmpl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IO_ACT_R.$slip_cmpl_flg,
				"slip_cmpl_flg",
				slip_cmpl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$send_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IO_ACT_R.$send_flg,
				"send_flg",
				send_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$c_imp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IO_ACT_R.$c_imp_flg,
				"c_imp_flg",
				c_imp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$a_imp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_IO_ACT_R.$a_imp_flg,
				"a_imp_flg",
				a_imp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_IO_ACT_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$ins_usr_id,
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
			MST_IO_ACT_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$ins_usr_nm,
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
			MST_IO_ACT_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_IO_ACT_R.$ins_ts,
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
			MST_IO_ACT_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$ins_func_id,
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
			MST_IO_ACT_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_IO_ACT_R.$upd_cntr,
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
			MST_IO_ACT_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$upd_usr_id,
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
			MST_IO_ACT_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$upd_usr_nm,
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
			MST_IO_ACT_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_IO_ACT_R.$upd_ts,
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
			MST_IO_ACT_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$upd_func_id,
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
			MST_IO_ACT_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_IO_ACT_R.$upd_srv_req_no,
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
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_IO_ACT_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_IO_ACT_R create(String alias) {
		MST_IO_ACT_R row = new MST_IO_ACT_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_IO_ACT_R createByName(T proto) {
		MST_IO_ACT_R row = MST_IO_ACT_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_IO_ACT_R clone() {
		return (MST_IO_ACT_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_IO_ACT_R createInstance() {
		return (MST_IO_ACT_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_IO_ACT_R getValues(String... names) {
		return (MST_IO_ACT_R) super.getValues(names);
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
	 public MSW_IO_ACT_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_IO_ACT_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_IO_ACT_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_IO_ACT_KEY_R.TABLE_NAME);
	 }

	/**
	 * 伝票ＮＯ. Slip No..<p>
	 *
	 */
	public String slip_no() {
		return getConstString(offset + 0, $slip_no);
	}

	/**
	 * 伝票ＮＯ. Slip No..<p>
	 *
	 */
	public void slip_no(String value) {
		setConstString(offset + 0, $slip_no, value);
	}

	/**
	 * 伝票連番. Slip sequence number.<p>
	 *
	 */
	public MCNumber slip_seq_no() {
		return getConstNumber(offset + 1, $slip_seq_no);
	}

	/**
	 * 伝票連番. Slip sequence number.<p>
	 *
	 */
	public void slip_seq_no(MCNumber value) {
		setConstNumber(offset + 1, $slip_seq_no, value);
	}
	
	/**
	 * 伝票連番. Slip sequence number.<p>
	 *
	 */
	public void slip_seq_no(int value) {
		setConstNumber(offset + 1, $slip_seq_no, value);
	}
	
	/**
	 * 伝票連番. Slip sequence number.<p>
	 *
	 */
	public void slip_seq_no(long value) {
		setConstNumber(offset + 1, $slip_seq_no, value);
	}
	
	/**
	 * 伝票連番. Slip sequence number.<p>
	 *
	 */
	public void slip_seq_no(float value) {
		setConstNumber(offset + 1, $slip_seq_no, value);
	}
	
	/**
	 * 伝票連番. Slip sequence number.<p>
	 *
	 */
	public void slip_seq_no(double value) {
		setConstNumber(offset + 1, $slip_seq_no, value);
	}
	
	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 2, $ac_ym);
	}

	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 2, $ac_ym, value);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 3, $ac_dt);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 3, $ac_dt, value);
	}

	/**
	 * 実績日時. Actual date and time.<p>
	 *
	 */
	public MCDate act_tm() {
		return getConstDate(offset + 4, $act_tm);
	}

	/**
	 * 実績日時. Actual date and time.<p>
	 *
	 */
	public void act_tm(MCDate value) {
		setConstDate(offset + 4, $act_tm, value);
	}

	/**
	 * 伝票改訂番号. Slip rev. number.<p>
	 *
	 */
	public MCNumber slip_rev_no() {
		return getConstNumber(offset + 5, $slip_rev_no);
	}

	/**
	 * 伝票改訂番号. Slip rev. number.<p>
	 *
	 */
	public void slip_rev_no(MCNumber value) {
		setConstNumber(offset + 5, $slip_rev_no, value);
	}
	
	/**
	 * 伝票改訂番号. Slip rev. number.<p>
	 *
	 */
	public void slip_rev_no(int value) {
		setConstNumber(offset + 5, $slip_rev_no, value);
	}
	
	/**
	 * 伝票改訂番号. Slip rev. number.<p>
	 *
	 */
	public void slip_rev_no(long value) {
		setConstNumber(offset + 5, $slip_rev_no, value);
	}
	
	/**
	 * 伝票改訂番号. Slip rev. number.<p>
	 *
	 */
	public void slip_rev_no(float value) {
		setConstNumber(offset + 5, $slip_rev_no, value);
	}
	
	/**
	 * 伝票改訂番号. Slip rev. number.<p>
	 *
	 */
	public void slip_rev_no(double value) {
		setConstNumber(offset + 5, $slip_rev_no, value);
	}
	
	/**
	 * ヘッダ実績ＮＯ. Header result No..<p>
	 *
	 */
	public String act_no() {
		return getConstString(offset + 6, $act_no);
	}

	/**
	 * ヘッダ実績ＮＯ. Header result No..<p>
	 *
	 */
	public void act_no(String value) {
		setConstString(offset + 6, $act_no, value);
	}

	/**
	 * ヘッダ実績連番. Header result sequence number.<p>
	 *
	 */
	public MCNumber act_seq() {
		return getConstNumber(offset + 7, $act_seq);
	}

	/**
	 * ヘッダ実績連番. Header result sequence number.<p>
	 *
	 */
	public void act_seq(MCNumber value) {
		setConstNumber(offset + 7, $act_seq, value);
	}
	
	/**
	 * ヘッダ実績連番. Header result sequence number.<p>
	 *
	 */
	public void act_seq(int value) {
		setConstNumber(offset + 7, $act_seq, value);
	}
	
	/**
	 * ヘッダ実績連番. Header result sequence number.<p>
	 *
	 */
	public void act_seq(long value) {
		setConstNumber(offset + 7, $act_seq, value);
	}
	
	/**
	 * ヘッダ実績連番. Header result sequence number.<p>
	 *
	 */
	public void act_seq(float value) {
		setConstNumber(offset + 7, $act_seq, value);
	}
	
	/**
	 * ヘッダ実績連番. Header result sequence number.<p>
	 *
	 */
	public void act_seq(double value) {
		setConstNumber(offset + 7, $act_seq, value);
	}
	
	/**
	 * ヘッダ実績改訂番号. Header result rev. number.<p>
	 *
	 */
	public MCNumber act_rev_no() {
		return getConstNumber(offset + 8, $act_rev_no);
	}

	/**
	 * ヘッダ実績改訂番号. Header result rev. number.<p>
	 *
	 */
	public void act_rev_no(MCNumber value) {
		setConstNumber(offset + 8, $act_rev_no, value);
	}
	
	/**
	 * ヘッダ実績改訂番号. Header result rev. number.<p>
	 *
	 */
	public void act_rev_no(int value) {
		setConstNumber(offset + 8, $act_rev_no, value);
	}
	
	/**
	 * ヘッダ実績改訂番号. Header result rev. number.<p>
	 *
	 */
	public void act_rev_no(long value) {
		setConstNumber(offset + 8, $act_rev_no, value);
	}
	
	/**
	 * ヘッダ実績改訂番号. Header result rev. number.<p>
	 *
	 */
	public void act_rev_no(float value) {
		setConstNumber(offset + 8, $act_rev_no, value);
	}
	
	/**
	 * ヘッダ実績改訂番号. Header result rev. number.<p>
	 *
	 */
	public void act_rev_no(double value) {
		setConstNumber(offset + 8, $act_rev_no, value);
	}
	
	/**
	 * 明細実績ＮＯ. Details result No..<p>
	 *
	 */
	public String act_d_no() {
		return getConstString(offset + 9, $act_d_no);
	}

	/**
	 * 明細実績ＮＯ. Details result No..<p>
	 *
	 */
	public void act_d_no(String value) {
		setConstString(offset + 9, $act_d_no, value);
	}

	/**
	 * 明細実績連番. Details result sequence number.<p>
	 *
	 */
	public MCNumber act_d_seq() {
		return getConstNumber(offset + 10, $act_d_seq);
	}

	/**
	 * 明細実績連番. Details result sequence number.<p>
	 *
	 */
	public void act_d_seq(MCNumber value) {
		setConstNumber(offset + 10, $act_d_seq, value);
	}
	
	/**
	 * 明細実績連番. Details result sequence number.<p>
	 *
	 */
	public void act_d_seq(int value) {
		setConstNumber(offset + 10, $act_d_seq, value);
	}
	
	/**
	 * 明細実績連番. Details result sequence number.<p>
	 *
	 */
	public void act_d_seq(long value) {
		setConstNumber(offset + 10, $act_d_seq, value);
	}
	
	/**
	 * 明細実績連番. Details result sequence number.<p>
	 *
	 */
	public void act_d_seq(float value) {
		setConstNumber(offset + 10, $act_d_seq, value);
	}
	
	/**
	 * 明細実績連番. Details result sequence number.<p>
	 *
	 */
	public void act_d_seq(double value) {
		setConstNumber(offset + 10, $act_d_seq, value);
	}
	
	/**
	 * 実績受払ＮＯ. Result GR/GI No..<p>
	 *
	 */
	public String act_io_no() {
		return getConstString(offset + 11, $act_io_no);
	}

	/**
	 * 実績受払ＮＯ. Result GR/GI No..<p>
	 *
	 */
	public void act_io_no(String value) {
		setConstString(offset + 11, $act_io_no, value);
	}

	/**
	 * 実績受払連番. Result GR/GI sequence number.<p>
	 *
	 */
	public MCNumber act_io_seq() {
		return getConstNumber(offset + 12, $act_io_seq);
	}

	/**
	 * 実績受払連番. Result GR/GI sequence number.<p>
	 *
	 */
	public void act_io_seq(MCNumber value) {
		setConstNumber(offset + 12, $act_io_seq, value);
	}
	
	/**
	 * 実績受払連番. Result GR/GI sequence number.<p>
	 *
	 */
	public void act_io_seq(int value) {
		setConstNumber(offset + 12, $act_io_seq, value);
	}
	
	/**
	 * 実績受払連番. Result GR/GI sequence number.<p>
	 *
	 */
	public void act_io_seq(long value) {
		setConstNumber(offset + 12, $act_io_seq, value);
	}
	
	/**
	 * 実績受払連番. Result GR/GI sequence number.<p>
	 *
	 */
	public void act_io_seq(float value) {
		setConstNumber(offset + 12, $act_io_seq, value);
	}
	
	/**
	 * 実績受払連番. Result GR/GI sequence number.<p>
	 *
	 */
	public void act_io_seq(double value) {
		setConstNumber(offset + 12, $act_io_seq, value);
	}
	
	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 13, $slip_sts_typ);
	}

	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 13, $slip_sts_typ, value);
	}

	/**
	 * 金額未確定ＦＬＧ. Amount unfirm flg..<p>
	 *
	 */
	public boolean un_fix_flg() {
		return getConstBoolean(offset + 14, $un_fix_flg);
	}

	/**
	 * 金額未確定ＦＬＧ. Amount unfirm flg..<p>
	 *
	 */
	public void un_fix_flg(boolean value) {
		setConstBoolean(offset + 14, $un_fix_flg, value);
	}

	/**
	 * 暫定買掛ＦＬＧ. Temporary AP flg..<p>
	 *
	 */
	public boolean temp_ap_flg() {
		return getConstBoolean(offset + 15, $temp_ap_flg);
	}

	/**
	 * 暫定買掛ＦＬＧ. Temporary AP flg..<p>
	 *
	 */
	public void temp_ap_flg(boolean value) {
		setConstBoolean(offset + 15, $temp_ap_flg, value);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 16, $trd_cd);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 16, $trd_cd, value);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 17, $trd_ptn_typ);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 17, $trd_ptn_typ, value);
	}

	/**
	 * トランザクション区分. Transaction type.<p>
	 *
	 */
	public String trn_typ() {
		return getConstString(offset + 18, $trn_typ);
	}

	/**
	 * トランザクション区分. Transaction type.<p>
	 *
	 */
	public void trn_typ(String value) {
		setConstString(offset + 18, $trn_typ, value);
	}

	/**
	 * 受払区分. GR/GI type.<p>
	 *
	 */
	public String io_act_typ() {
		return getConstString(offset + 19, $io_act_typ);
	}

	/**
	 * 受払区分. GR/GI type.<p>
	 *
	 */
	public void io_act_typ(String value) {
		setConstString(offset + 19, $io_act_typ, value);
	}

	/**
	 * 入出庫区分. GR/GI type.<p>
	 *
	 */
	public String io_typ() {
		return getConstString(offset + 20, $io_typ);
	}

	/**
	 * 入出庫区分. GR/GI type.<p>
	 *
	 */
	public void io_typ(String value) {
		setConstString(offset + 20, $io_typ, value);
	}

	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 21, $ac_slip_typ);
	}

	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 21, $ac_slip_typ, value);
	}

	/**
	 * 理由ＣＤ. Reason cd..<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 22, $rsn_cd);
	}

	/**
	 * 理由ＣＤ. Reason cd..<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 22, $rsn_cd, value);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 23, $ac_rsn_cd);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 23, $ac_rsn_cd, value);
	}

	/**
	 * 出庫ワーキンググループＣＤ. GI WG cd..<p>
	 *
	 */
	public String gi_wg_cd() {
		return getConstString(offset + 24, $gi_wg_cd);
	}

	/**
	 * 出庫ワーキンググループＣＤ. GI WG cd..<p>
	 *
	 */
	public void gi_wg_cd(String value) {
		setConstString(offset + 24, $gi_wg_cd, value);
	}

	/**
	 * 入庫ワーキンググループＣＤ. GR WG cd..<p>
	 *
	 */
	public String gr_wg_cd() {
		return getConstString(offset + 25, $gr_wg_cd);
	}

	/**
	 * 入庫ワーキンググループＣＤ. GR WG cd..<p>
	 *
	 */
	public void gr_wg_cd(String value) {
		setConstString(offset + 25, $gr_wg_cd, value);
	}

	/**
	 * 実施部門ＣＤ. Implement dept. cd..<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 26, $act_dpt_cd);
	}

	/**
	 * 実施部門ＣＤ. Implement dept. cd..<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 26, $act_dpt_cd, value);
	}

	/**
	 * 購買部門ＣＤ. Purchasing dept. cd..<p>
	 *
	 */
	public String purc_dpt_cd() {
		return getConstString(offset + 27, $purc_dpt_cd);
	}

	/**
	 * 購買部門ＣＤ. Purchasing dept. cd..<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		setConstString(offset + 27, $purc_dpt_cd, value);
	}

	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 28, $ap_dpt_cd);
	}

	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 28, $ap_dpt_cd, value);
	}

	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 29, $sls_dpt_cd);
	}

	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 29, $sls_dpt_cd, value);
	}

	/**
	 * 債権部門ＣＤ. AR dept. cd..<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 30, $ar_dpt_cd);
	}

	/**
	 * 債権部門ＣＤ. AR dept. cd..<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 30, $ar_dpt_cd, value);
	}

	/**
	 * 出庫部門ＣＤ. GI dept. cd..<p>
	 *
	 */
	public String gi_dpt_cd() {
		return getConstString(offset + 31, $gi_dpt_cd);
	}

	/**
	 * 出庫部門ＣＤ. GI dept. cd..<p>
	 *
	 */
	public void gi_dpt_cd(String value) {
		setConstString(offset + 31, $gi_dpt_cd, value);
	}

	/**
	 * 入庫部門ＣＤ. GR dept. cd..<p>
	 *
	 */
	public String gr_dpt_cd() {
		return getConstString(offset + 32, $gr_dpt_cd);
	}

	/**
	 * 入庫部門ＣＤ. GR dept. cd..<p>
	 *
	 */
	public void gr_dpt_cd(String value) {
		setConstString(offset + 32, $gr_dpt_cd, value);
	}

	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 33, $bd_dpt_cd);
	}

	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 33, $bd_dpt_cd, value);
	}

	/**
	 * 予備部門ＣＤ１. Spare dept. cd. 1.<p>
	 *
	 */
	public String sub_dpt_cd1() {
		return getConstString(offset + 34, $sub_dpt_cd1);
	}

	/**
	 * 予備部門ＣＤ１. Spare dept. cd. 1.<p>
	 *
	 */
	public void sub_dpt_cd1(String value) {
		setConstString(offset + 34, $sub_dpt_cd1, value);
	}

	/**
	 * 予備部門ＣＤ２. Spare dept. cd. 2.<p>
	 *
	 */
	public String sub_dpt_cd2() {
		return getConstString(offset + 35, $sub_dpt_cd2);
	}

	/**
	 * 予備部門ＣＤ２. Spare dept. cd. 2.<p>
	 *
	 */
	public void sub_dpt_cd2(String value) {
		setConstString(offset + 35, $sub_dpt_cd2, value);
	}

	/**
	 * 予備部門ＣＤ３. Spare dept. cd. 3.<p>
	 *
	 */
	public String sub_dpt_cd3() {
		return getConstString(offset + 36, $sub_dpt_cd3);
	}

	/**
	 * 予備部門ＣＤ３. Spare dept. cd. 3.<p>
	 *
	 */
	public void sub_dpt_cd3(String value) {
		setConstString(offset + 36, $sub_dpt_cd3, value);
	}

	/**
	 * 実施担当者ＣＤ. Implementation PIC cd..<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 37, $act_usr_cd);
	}

	/**
	 * 実施担当者ＣＤ. Implementation PIC cd..<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 37, $act_usr_cd, value);
	}

	/**
	 * 売上担当者ＣＤ. Sales PIC cd..<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 38, $sls_usr_cd);
	}

	/**
	 * 売上担当者ＣＤ. Sales PIC cd..<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 38, $sls_usr_cd, value);
	}

	/**
	 * 製造担当者ＣＤ. Mfg. PIC cd..<p>
	 *
	 */
	public String mfg_usr_cd() {
		return getConstString(offset + 39, $mfg_usr_cd);
	}

	/**
	 * 製造担当者ＣＤ. Mfg. PIC cd..<p>
	 *
	 */
	public void mfg_usr_cd(String value) {
		setConstString(offset + 39, $mfg_usr_cd, value);
	}

	/**
	 * 購買担当者ＣＤ. Purchasing PIC cd..<p>
	 *
	 */
	public String purc_usr_cd() {
		return getConstString(offset + 40, $purc_usr_cd);
	}

	/**
	 * 購買担当者ＣＤ. Purchasing PIC cd..<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		setConstString(offset + 40, $purc_usr_cd, value);
	}

	/**
	 * 会計品目分類ＣＤ. Accounting item classification cd..<p>
	 *
	 */
	public String ac_itm_grp_cd() {
		return getConstString(offset + 41, $ac_itm_grp_cd);
	}

	/**
	 * 会計品目分類ＣＤ. Accounting item classification cd..<p>
	 *
	 */
	public void ac_itm_grp_cd(String value) {
		setConstString(offset + 41, $ac_itm_grp_cd, value);
	}

	/**
	 * 品目仕訳ＣＤ. Item journal cd..<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 42, $itm_jnl_cd);
	}

	/**
	 * 品目仕訳ＣＤ. Item journal cd..<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 42, $itm_jnl_cd, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 43, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 43, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 44, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 44, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 45, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 45, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 46, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 46, $itm_sub3, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 47, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 47, $itm_nm, value);
	}

	/**
	 * 在庫管理区分. Inventory management type.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 48, $stk_mng_typ);
	}

	/**
	 * 在庫管理区分. Inventory management type.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 48, $stk_mng_typ, value);
	}

	/**
	 * 資産管理区分. Asset management type.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 49, $asset_mng_typ);
	}

	/**
	 * 資産管理区分. Asset management type.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 49, $asset_mng_typ, value);
	}

	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 50, $sundry_itm_flg);
	}

	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 50, $sundry_itm_flg, value);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 51, $loc_cd);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 51, $loc_cd, value);
	}

	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 52, $str_ln_cd);
	}

	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 52, $str_ln_cd, value);
	}

	/**
	 * 在庫着荷先ＣＤ. Inventory arriving point cd..<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 53, $stk_arrv_bp_cd);
	}

	/**
	 * 在庫着荷先ＣＤ. Inventory arriving point cd..<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 53, $stk_arrv_bp_cd, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 54, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 54, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 55, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 55, $sublot_no, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 56, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 56, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 57, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 57, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 58, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 58, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 59, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 59, $sno4, value);
	}

	/**
	 * 確定ＮＯ区分. Firm No. type.<p>
	 *
	 */
	public String fix_no_typ() {
		return getConstString(offset + 60, $fix_no_typ);
	}

	/**
	 * 確定ＮＯ区分. Firm No. type.<p>
	 *
	 */
	public void fix_no_typ(String value) {
		setConstString(offset + 60, $fix_no_typ, value);
	}

	/**
	 * 確定ＮＯ. Firm No..<p>
	 *
	 */
	public String fix_no() {
		return getConstString(offset + 61, $fix_no);
	}

	/**
	 * 確定ＮＯ. Firm No..<p>
	 *
	 */
	public void fix_no(String value) {
		setConstString(offset + 61, $fix_no, value);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 62, $gd_cd);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 62, $gd_cd, value);
	}

	/**
	 * 積送品区分. In-transit type.<p>
	 *
	 */
	public String in_xfr_typ() {
		return getConstString(offset + 63, $in_xfr_typ);
	}

	/**
	 * 積送品区分. In-transit type.<p>
	 *
	 */
	public void in_xfr_typ(String value) {
		setConstString(offset + 63, $in_xfr_typ, value);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 64, $quality_typ);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 64, $quality_typ, value);
	}

	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 65, $asst_typ);
	}

	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 65, $asst_typ, value);
	}

	/**
	 * 在庫検査区分. Inventory inspection type.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 66, $stk_insp_typ);
	}

	/**
	 * 在庫検査区分. Inventory inspection type.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 66, $stk_insp_typ, value);
	}

	/**
	 * 在庫識別区分. Inventory identification type.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 67, $stk_id_typ);
	}

	/**
	 * 在庫識別区分. Inventory identification type.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 67, $stk_id_typ, value);
	}

	/**
	 * 在庫取引先ＣＤ. Inventory BP cd..<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 68, $stk_bp_cd);
	}

	/**
	 * 在庫取引先ＣＤ. Inventory BP cd..<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 68, $stk_bp_cd, value);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 69, $trd_unit_qty);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 69, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 69, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 69, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 69, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 69, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 70, $trd_unit_cd);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 70, $trd_unit_cd, value);
	}

	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 71, $pack_unit_qty);
	}

	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 71, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 71, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 71, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 71, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 71, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位ＣＤ. SKU cd..<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 72, $pack_unit_cd);
	}

	/**
	 * 荷姿単位ＣＤ. SKU cd..<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 72, $pack_unit_cd, value);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 73, $base_unit_qty);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 73, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 73, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 73, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 73, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 73, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 74, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 74, $base_unit_cd, value);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 75, $trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 75, $trd_cur_cd, value);
	}

	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 76, $trd_cur_upri);
	}

	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 76, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 76, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 76, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 76, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 76, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 77, $trd_cur_amt);
	}

	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 77, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 77, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 77, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 77, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 77, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨加工金額. Subcontracting amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return getConstNumber(offset + 78, $trd_cur_proc_amt);
	}

	/**
	 * 取引通貨加工金額. Subcontracting amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 78, $trd_cur_proc_amt, value);
	}
	
	/**
	 * 取引通貨加工金額. Subcontracting amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		setConstNumber(offset + 78, $trd_cur_proc_amt, value);
	}
	
	/**
	 * 取引通貨加工金額. Subcontracting amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		setConstNumber(offset + 78, $trd_cur_proc_amt, value);
	}
	
	/**
	 * 取引通貨加工金額. Subcontracting amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		setConstNumber(offset + 78, $trd_cur_proc_amt, value);
	}
	
	/**
	 * 取引通貨加工金額. Subcontracting amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		setConstNumber(offset + 78, $trd_cur_proc_amt, value);
	}
	
	/**
	 * 取引通貨有償支給金額. Chargeable supply amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return getConstNumber(offset + 79, $trd_cur_onr_prov_amt);
	}

	/**
	 * 取引通貨有償支給金額. Chargeable supply amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 79, $trd_cur_onr_prov_amt, value);
	}
	
	/**
	 * 取引通貨有償支給金額. Chargeable supply amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 79, $trd_cur_onr_prov_amt, value);
	}
	
	/**
	 * 取引通貨有償支給金額. Chargeable supply amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 79, $trd_cur_onr_prov_amt, value);
	}
	
	/**
	 * 取引通貨有償支給金額. Chargeable supply amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 79, $trd_cur_onr_prov_amt, value);
	}
	
	/**
	 * 取引通貨有償支給金額. Chargeable supply amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 79, $trd_cur_onr_prov_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 80, $trd_cur_tax_amt);
	}

	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 80, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 80, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 80, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 80, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 80, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 81, $base_cur_cd);
	}

	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 81, $base_cur_cd, value);
	}

	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return getConstNumber(offset + 82, $base_cur_upri);
	}

	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		setConstNumber(offset + 82, $base_cur_upri, value);
	}
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public void base_cur_upri(int value) {
		setConstNumber(offset + 82, $base_cur_upri, value);
	}
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public void base_cur_upri(long value) {
		setConstNumber(offset + 82, $base_cur_upri, value);
	}
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public void base_cur_upri(float value) {
		setConstNumber(offset + 82, $base_cur_upri, value);
	}
	
	/**
	 * 基準通貨単価. Unit price (Base currency).<p>
	 *
	 */
	public void base_cur_upri(double value) {
		setConstNumber(offset + 82, $base_cur_upri, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 83, $base_cur_amt);
	}

	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 83, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 83, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 83, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 83, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 83, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨加工金額. Subcontracting amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_proc_amt() {
		return getConstNumber(offset + 84, $base_cur_proc_amt);
	}

	/**
	 * 基準通貨加工金額. Subcontracting amount (Base currency).<p>
	 *
	 */
	public void base_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 84, $base_cur_proc_amt, value);
	}
	
	/**
	 * 基準通貨加工金額. Subcontracting amount (Base currency).<p>
	 *
	 */
	public void base_cur_proc_amt(int value) {
		setConstNumber(offset + 84, $base_cur_proc_amt, value);
	}
	
	/**
	 * 基準通貨加工金額. Subcontracting amount (Base currency).<p>
	 *
	 */
	public void base_cur_proc_amt(long value) {
		setConstNumber(offset + 84, $base_cur_proc_amt, value);
	}
	
	/**
	 * 基準通貨加工金額. Subcontracting amount (Base currency).<p>
	 *
	 */
	public void base_cur_proc_amt(float value) {
		setConstNumber(offset + 84, $base_cur_proc_amt, value);
	}
	
	/**
	 * 基準通貨加工金額. Subcontracting amount (Base currency).<p>
	 *
	 */
	public void base_cur_proc_amt(double value) {
		setConstNumber(offset + 84, $base_cur_proc_amt, value);
	}
	
	/**
	 * 基準通貨有償支給金額. Chargeable supply amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_amt() {
		return getConstNumber(offset + 85, $base_cur_onr_prov_amt);
	}

	/**
	 * 基準通貨有償支給金額. Chargeable supply amount (Base currency).<p>
	 *
	 */
	public void base_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 85, $base_cur_onr_prov_amt, value);
	}
	
	/**
	 * 基準通貨有償支給金額. Chargeable supply amount (Base currency).<p>
	 *
	 */
	public void base_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 85, $base_cur_onr_prov_amt, value);
	}
	
	/**
	 * 基準通貨有償支給金額. Chargeable supply amount (Base currency).<p>
	 *
	 */
	public void base_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 85, $base_cur_onr_prov_amt, value);
	}
	
	/**
	 * 基準通貨有償支給金額. Chargeable supply amount (Base currency).<p>
	 *
	 */
	public void base_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 85, $base_cur_onr_prov_amt, value);
	}
	
	/**
	 * 基準通貨有償支給金額. Chargeable supply amount (Base currency).<p>
	 *
	 */
	public void base_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 85, $base_cur_onr_prov_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 86, $base_cur_tax_amt);
	}

	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 86, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 86, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 86, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 86, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨税額. Tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 86, $base_cur_tax_amt, value);
	}
	
	/**
	 * 納税通貨ＣＤ. Taxpaying currency cd..<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 87, $ptax_cur_cd);
	}

	/**
	 * 納税通貨ＣＤ. Taxpaying currency cd..<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 87, $ptax_cur_cd, value);
	}

	/**
	 * 納税通貨単価. Unit price (Tax currency).<p>
	 *
	 */
	public MCNumber ptax_cur_upri() {
		return getConstNumber(offset + 88, $ptax_cur_upri);
	}

	/**
	 * 納税通貨単価. Unit price (Tax currency).<p>
	 *
	 */
	public void ptax_cur_upri(MCNumber value) {
		setConstNumber(offset + 88, $ptax_cur_upri, value);
	}
	
	/**
	 * 納税通貨単価. Unit price (Tax currency).<p>
	 *
	 */
	public void ptax_cur_upri(int value) {
		setConstNumber(offset + 88, $ptax_cur_upri, value);
	}
	
	/**
	 * 納税通貨単価. Unit price (Tax currency).<p>
	 *
	 */
	public void ptax_cur_upri(long value) {
		setConstNumber(offset + 88, $ptax_cur_upri, value);
	}
	
	/**
	 * 納税通貨単価. Unit price (Tax currency).<p>
	 *
	 */
	public void ptax_cur_upri(float value) {
		setConstNumber(offset + 88, $ptax_cur_upri, value);
	}
	
	/**
	 * 納税通貨単価. Unit price (Tax currency).<p>
	 *
	 */
	public void ptax_cur_upri(double value) {
		setConstNumber(offset + 88, $ptax_cur_upri, value);
	}
	
	/**
	 * 納税通貨金額. Amount (Tax currency).<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return getConstNumber(offset + 89, $ptax_cur_amt);
	}

	/**
	 * 納税通貨金額. Amount (Tax currency).<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		setConstNumber(offset + 89, $ptax_cur_amt, value);
	}
	
	/**
	 * 納税通貨金額. Amount (Tax currency).<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		setConstNumber(offset + 89, $ptax_cur_amt, value);
	}
	
	/**
	 * 納税通貨金額. Amount (Tax currency).<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		setConstNumber(offset + 89, $ptax_cur_amt, value);
	}
	
	/**
	 * 納税通貨金額. Amount (Tax currency).<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		setConstNumber(offset + 89, $ptax_cur_amt, value);
	}
	
	/**
	 * 納税通貨金額. Amount (Tax currency).<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		setConstNumber(offset + 89, $ptax_cur_amt, value);
	}
	
	/**
	 * 納税通貨加工金額. Subcontracting amount (Tax currency).<p>
	 *
	 */
	public MCNumber ptax_cur_proc_amt() {
		return getConstNumber(offset + 90, $ptax_cur_proc_amt);
	}

	/**
	 * 納税通貨加工金額. Subcontracting amount (Tax currency).<p>
	 *
	 */
	public void ptax_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 90, $ptax_cur_proc_amt, value);
	}
	
	/**
	 * 納税通貨加工金額. Subcontracting amount (Tax currency).<p>
	 *
	 */
	public void ptax_cur_proc_amt(int value) {
		setConstNumber(offset + 90, $ptax_cur_proc_amt, value);
	}
	
	/**
	 * 納税通貨加工金額. Subcontracting amount (Tax currency).<p>
	 *
	 */
	public void ptax_cur_proc_amt(long value) {
		setConstNumber(offset + 90, $ptax_cur_proc_amt, value);
	}
	
	/**
	 * 納税通貨加工金額. Subcontracting amount (Tax currency).<p>
	 *
	 */
	public void ptax_cur_proc_amt(float value) {
		setConstNumber(offset + 90, $ptax_cur_proc_amt, value);
	}
	
	/**
	 * 納税通貨加工金額. Subcontracting amount (Tax currency).<p>
	 *
	 */
	public void ptax_cur_proc_amt(double value) {
		setConstNumber(offset + 90, $ptax_cur_proc_amt, value);
	}
	
	/**
	 * 納税通貨有償支給金額. Chargeable supply amount (Tax currency).<p>
	 *
	 */
	public MCNumber ptax_cur_onr_prov_amt() {
		return getConstNumber(offset + 91, $ptax_cur_onr_prov_amt);
	}

	/**
	 * 納税通貨有償支給金額. Chargeable supply amount (Tax currency).<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 91, $ptax_cur_onr_prov_amt, value);
	}
	
	/**
	 * 納税通貨有償支給金額. Chargeable supply amount (Tax currency).<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 91, $ptax_cur_onr_prov_amt, value);
	}
	
	/**
	 * 納税通貨有償支給金額. Chargeable supply amount (Tax currency).<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 91, $ptax_cur_onr_prov_amt, value);
	}
	
	/**
	 * 納税通貨有償支給金額. Chargeable supply amount (Tax currency).<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 91, $ptax_cur_onr_prov_amt, value);
	}
	
	/**
	 * 納税通貨有償支給金額. Chargeable supply amount (Tax currency).<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 91, $ptax_cur_onr_prov_amt, value);
	}
	
	/**
	 * 納税通貨税額. Tax amount (Tax currency).<p>
	 *
	 */
	public MCNumber ptax_cur_tax_amt() {
		return getConstNumber(offset + 92, $ptax_cur_tax_amt);
	}

	/**
	 * 納税通貨税額. Tax amount (Tax currency).<p>
	 *
	 */
	public void ptax_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 92, $ptax_cur_tax_amt, value);
	}
	
	/**
	 * 納税通貨税額. Tax amount (Tax currency).<p>
	 *
	 */
	public void ptax_cur_tax_amt(int value) {
		setConstNumber(offset + 92, $ptax_cur_tax_amt, value);
	}
	
	/**
	 * 納税通貨税額. Tax amount (Tax currency).<p>
	 *
	 */
	public void ptax_cur_tax_amt(long value) {
		setConstNumber(offset + 92, $ptax_cur_tax_amt, value);
	}
	
	/**
	 * 納税通貨税額. Tax amount (Tax currency).<p>
	 *
	 */
	public void ptax_cur_tax_amt(float value) {
		setConstNumber(offset + 92, $ptax_cur_tax_amt, value);
	}
	
	/**
	 * 納税通貨税額. Tax amount (Tax currency).<p>
	 *
	 */
	public void ptax_cur_tax_amt(double value) {
		setConstNumber(offset + 92, $ptax_cur_tax_amt, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 93, $wtax_rate);
	}

	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 93, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 93, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 93, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 93, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 93, $wtax_rate, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return getConstNumber(offset + 94, $wtax_amt);
	}

	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		setConstNumber(offset + 94, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(int value) {
		setConstNumber(offset + 94, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(long value) {
		setConstNumber(offset + 94, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(float value) {
		setConstNumber(offset + 94, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(double value) {
		setConstNumber(offset + 94, $wtax_amt, value);
	}
	
	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 95, $tax_cd);
	}

	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 95, $tax_cd, value);
	}

	/**
	 * 国外取引ＦＬＧ. Foreign transaction flg..<p>
	 *
	 */
	public boolean foreign_flg() {
		return getConstBoolean(offset + 96, $foreign_flg);
	}

	/**
	 * 国外取引ＦＬＧ. Foreign transaction flg..<p>
	 *
	 */
	public void foreign_flg(boolean value) {
		setConstBoolean(offset + 96, $foreign_flg, value);
	}

	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 97, $xrate_cd);
	}

	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 97, $xrate_cd, value);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 98, $xrate);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 98, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 98, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 98, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 98, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 98, $xrate, value);
	}
	
	/**
	 * 納税為替レートＣＤ. Taxpaying exchange rate cd..<p>
	 *
	 */
	public String ptax_xrate_cd() {
		return getConstString(offset + 99, $ptax_xrate_cd);
	}

	/**
	 * 納税為替レートＣＤ. Taxpaying exchange rate cd..<p>
	 *
	 */
	public void ptax_xrate_cd(String value) {
		setConstString(offset + 99, $ptax_xrate_cd, value);
	}

	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return getConstNumber(offset + 100, $ptax_xrate);
	}

	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		setConstNumber(offset + 100, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		setConstNumber(offset + 100, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		setConstNumber(offset + 100, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		setConstNumber(offset + 100, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		setConstNumber(offset + 100, $ptax_xrate, value);
	}
	
	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 101, $slo_no);
	}

	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 101, $slo_no, value);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 102, $po_no);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 102, $po_no, value);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 103, $iv_no);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 103, $iv_no, value);
	}

	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 104, $rcpt_iv_no);
	}

	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 104, $rcpt_iv_no, value);
	}

	/**
	 * 負担品群ＣＤ. Charged item category cd..<p>
	 *
	 */
	public String bd_ctg_cd() {
		return getConstString(offset + 105, $bd_ctg_cd);
	}

	/**
	 * 負担品群ＣＤ. Charged item category cd..<p>
	 *
	 */
	public void bd_ctg_cd(String value) {
		setConstString(offset + 105, $bd_ctg_cd, value);
	}

	/**
	 * 負担取引先ＣＤ. Charged BP cd..<p>
	 *
	 */
	public String bd_bp_cd() {
		return getConstString(offset + 106, $bd_bp_cd);
	}

	/**
	 * 負担取引先ＣＤ. Charged BP cd..<p>
	 *
	 */
	public void bd_bp_cd(String value) {
		setConstString(offset + 106, $bd_bp_cd, value);
	}

	/**
	 * 負担工程ＣＤ. Charged operation cd..<p>
	 *
	 */
	public String bd_oper_cd() {
		return getConstString(offset + 107, $bd_oper_cd);
	}

	/**
	 * 負担工程ＣＤ. Charged operation cd..<p>
	 *
	 */
	public void bd_oper_cd(String value) {
		setConstString(offset + 107, $bd_oper_cd, value);
	}

	/**
	 * 負担場所ＣＤ. Charged location cd..<p>
	 *
	 */
	public String bd_loc_cd() {
		return getConstString(offset + 108, $bd_loc_cd);
	}

	/**
	 * 負担場所ＣＤ. Charged location cd..<p>
	 *
	 */
	public void bd_loc_cd(String value) {
		setConstString(offset + 108, $bd_loc_cd, value);
	}

	/**
	 * 負担受注ＮＯ. Charged sales No..<p>
	 *
	 */
	public String bd_slo_no() {
		return getConstString(offset + 109, $bd_slo_no);
	}

	/**
	 * 負担受注ＮＯ. Charged sales No..<p>
	 *
	 */
	public void bd_slo_no(String value) {
		setConstString(offset + 109, $bd_slo_no, value);
	}

	/**
	 * 負担発注ＮＯ. Charged PO No..<p>
	 *
	 */
	public String bd_po_no() {
		return getConstString(offset + 110, $bd_po_no);
	}

	/**
	 * 負担発注ＮＯ. Charged PO No..<p>
	 *
	 */
	public void bd_po_no(String value) {
		setConstString(offset + 110, $bd_po_no, value);
	}

	/**
	 * 負担インボイスＮＯ. Charged invoice No..<p>
	 *
	 */
	public String bd_iv_no() {
		return getConstString(offset + 111, $bd_iv_no);
	}

	/**
	 * 負担インボイスＮＯ. Charged invoice No..<p>
	 *
	 */
	public void bd_iv_no(String value) {
		setConstString(offset + 111, $bd_iv_no, value);
	}

	/**
	 * 負担ワーキンググループＣＤ. Charged WG cd..<p>
	 *
	 */
	public String bd_wg_cd() {
		return getConstString(offset + 112, $bd_wg_cd);
	}

	/**
	 * 負担ワーキンググループＣＤ. Charged WG cd..<p>
	 *
	 */
	public void bd_wg_cd(String value) {
		setConstString(offset + 112, $bd_wg_cd, value);
	}

	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 113, $dlv_cd);
	}

	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 113, $dlv_cd, value);
	}

	/**
	 * 配送先ＣＤ. Receiving point cd..<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 114, $tdlv_cd);
	}

	/**
	 * 配送先ＣＤ. Receiving point cd..<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 114, $tdlv_cd, value);
	}

	/**
	 * 入金先ＣＤ. Payer cd..<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 115, $rcst_cd);
	}

	/**
	 * 入金先ＣＤ. Payer cd..<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 115, $rcst_cd, value);
	}

	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 116, $bcst_cd);
	}

	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 116, $bcst_cd, value);
	}

	/**
	 * 売掛先ＣＤ. AR customer cd..<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 117, $acst_cd);
	}

	/**
	 * 売掛先ＣＤ. AR customer cd..<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 117, $acst_cd, value);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 118, $cst_cd);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 118, $cst_cd, value);
	}

	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 119, $dest_cd1);
	}

	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 119, $dest_cd1, value);
	}

	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 120, $dest_cd2);
	}

	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 120, $dest_cd2, value);
	}

	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 121, $dest_cd3);
	}

	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 121, $dest_cd3, value);
	}

	/**
	 * 支払先ＣＤ. Payee cd..<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 122, $psppl_cd);
	}

	/**
	 * 支払先ＣＤ. Payee cd..<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 122, $psppl_cd, value);
	}

	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 123, $bsppl_cd);
	}

	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 123, $bsppl_cd, value);
	}

	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 124, $asppl_cd);
	}

	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 124, $asppl_cd, value);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 125, $sppl_cd);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 125, $sppl_cd, value);
	}

	/**
	 * 与信管理先ＣＤ. Credit managed BP cd..<p>
	 *
	 */
	public String cred_cd() {
		return getConstString(offset + 126, $cred_cd);
	}

	/**
	 * 与信管理先ＣＤ. Credit managed BP cd..<p>
	 *
	 */
	public void cred_cd(String value) {
		setConstString(offset + 126, $cred_cd, value);
	}

	/**
	 * 都度精算ＦＬＧ. Settlement per transaction flg..<p>
	 *
	 */
	public boolean spot_flg() {
		return getConstBoolean(offset + 127, $spot_flg);
	}

	/**
	 * 都度精算ＦＬＧ. Settlement per transaction flg..<p>
	 *
	 */
	public void spot_flg(boolean value) {
		setConstBoolean(offset + 127, $spot_flg, value);
	}

	/**
	 * 決済予定日. Scheduled settlement date.<p>
	 *
	 */
	public MCDate sttl_schd_dt() {
		return getConstDate(offset + 128, $sttl_schd_dt);
	}

	/**
	 * 決済予定日. Scheduled settlement date.<p>
	 *
	 */
	public void sttl_schd_dt(MCDate value) {
		setConstDate(offset + 128, $sttl_schd_dt, value);
	}

	/**
	 * 決済方法ＣＤ. Settlement method cd..<p>
	 *
	 */
	public String sttl_cd() {
		return getConstString(offset + 129, $sttl_cd);
	}

	/**
	 * 決済方法ＣＤ. Settlement method cd..<p>
	 *
	 */
	public void sttl_cd(String value) {
		setConstString(offset + 129, $sttl_cd, value);
	}

	/**
	 * 得意先品目ＣＤ. Customer item cd..<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 130, $cst_itm_cd);
	}

	/**
	 * 得意先品目ＣＤ. Customer item cd..<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 130, $cst_itm_cd, value);
	}

	/**
	 * 得意先品名. Customer item name.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 131, $cst_itm_nm);
	}

	/**
	 * 得意先品名. Customer item name.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 131, $cst_itm_nm, value);
	}

	/**
	 * 発注先品目ＣＤ. Supplier item cd..<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 132, $sppl_itm_cd);
	}

	/**
	 * 発注先品目ＣＤ. Supplier item cd..<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 132, $sppl_itm_cd, value);
	}

	/**
	 * 発注先品名. Supplier item name.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 133, $sppl_itm_nm);
	}

	/**
	 * 発注先品名. Supplier item name.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 133, $sppl_itm_nm, value);
	}

	/**
	 * 購買区分. Purchase type.<p>
	 *
	 */
	public String purc_typ() {
		return getConstString(offset + 134, $purc_typ);
	}

	/**
	 * 購買区分. Purchase type.<p>
	 *
	 */
	public void purc_typ(String value) {
		setConstString(offset + 134, $purc_typ, value);
	}

	/**
	 * 地域ＣＤ. Region cd..<p>
	 *
	 */
	public String area_cd() {
		return getConstString(offset + 135, $area_cd);
	}

	/**
	 * 地域ＣＤ. Region cd..<p>
	 *
	 */
	public void area_cd(String value) {
		setConstString(offset + 135, $area_cd, value);
	}

	/**
	 * 国ＣＤ. Country cd..<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 136, $cntry_cd);
	}

	/**
	 * 国ＣＤ. Country cd..<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 136, $cntry_cd, value);
	}

	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 137, $itm_mfg_inst_no);
	}

	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 137, $itm_mfg_inst_no, value);
	}

	/**
	 * 品目指図数量. Item order qty..<p>
	 *
	 */
	public MCNumber itm_inst_qty() {
		return getConstNumber(offset + 138, $itm_inst_qty);
	}

	/**
	 * 品目指図数量. Item order qty..<p>
	 *
	 */
	public void itm_inst_qty(MCNumber value) {
		setConstNumber(offset + 138, $itm_inst_qty, value);
	}
	
	/**
	 * 品目指図数量. Item order qty..<p>
	 *
	 */
	public void itm_inst_qty(int value) {
		setConstNumber(offset + 138, $itm_inst_qty, value);
	}
	
	/**
	 * 品目指図数量. Item order qty..<p>
	 *
	 */
	public void itm_inst_qty(long value) {
		setConstNumber(offset + 138, $itm_inst_qty, value);
	}
	
	/**
	 * 品目指図数量. Item order qty..<p>
	 *
	 */
	public void itm_inst_qty(float value) {
		setConstNumber(offset + 138, $itm_inst_qty, value);
	}
	
	/**
	 * 品目指図数量. Item order qty..<p>
	 *
	 */
	public void itm_inst_qty(double value) {
		setConstNumber(offset + 138, $itm_inst_qty, value);
	}
	
	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 139, $mfg_inst_no);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 139, $mfg_inst_no, value);
	}

	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 140, $mfg_act_no);
	}

	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 140, $mfg_act_no, value);
	}

	/**
	 * 製造着手数量. Mfg. start qty..<p>
	 *
	 */
	public MCNumber mfg_st_qty() {
		return getConstNumber(offset + 141, $mfg_st_qty);
	}

	/**
	 * 製造着手数量. Mfg. start qty..<p>
	 *
	 */
	public void mfg_st_qty(MCNumber value) {
		setConstNumber(offset + 141, $mfg_st_qty, value);
	}
	
	/**
	 * 製造着手数量. Mfg. start qty..<p>
	 *
	 */
	public void mfg_st_qty(int value) {
		setConstNumber(offset + 141, $mfg_st_qty, value);
	}
	
	/**
	 * 製造着手数量. Mfg. start qty..<p>
	 *
	 */
	public void mfg_st_qty(long value) {
		setConstNumber(offset + 141, $mfg_st_qty, value);
	}
	
	/**
	 * 製造着手数量. Mfg. start qty..<p>
	 *
	 */
	public void mfg_st_qty(float value) {
		setConstNumber(offset + 141, $mfg_st_qty, value);
	}
	
	/**
	 * 製造着手数量. Mfg. start qty..<p>
	 *
	 */
	public void mfg_st_qty(double value) {
		setConstNumber(offset + 141, $mfg_st_qty, value);
	}
	
	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 142, $oper_act_no);
	}

	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 142, $oper_act_no, value);
	}

	/**
	 * 出来高進捗度. Output progress.<p>
	 *
	 */
	public MCNumber yield_rate() {
		return getConstNumber(offset + 143, $yield_rate);
	}

	/**
	 * 出来高進捗度. Output progress.<p>
	 *
	 */
	public void yield_rate(MCNumber value) {
		setConstNumber(offset + 143, $yield_rate, value);
	}
	
	/**
	 * 出来高進捗度. Output progress.<p>
	 *
	 */
	public void yield_rate(int value) {
		setConstNumber(offset + 143, $yield_rate, value);
	}
	
	/**
	 * 出来高進捗度. Output progress.<p>
	 *
	 */
	public void yield_rate(long value) {
		setConstNumber(offset + 143, $yield_rate, value);
	}
	
	/**
	 * 出来高進捗度. Output progress.<p>
	 *
	 */
	public void yield_rate(float value) {
		setConstNumber(offset + 143, $yield_rate, value);
	}
	
	/**
	 * 出来高進捗度. Output progress.<p>
	 *
	 */
	public void yield_rate(double value) {
		setConstNumber(offset + 143, $yield_rate, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 144, $disp_seq);
	}

	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 144, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 144, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 144, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 144, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 144, $disp_seq, value);
	}
	
	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 145, $oper_cd);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 145, $oper_cd, value);
	}

	/**
	 * 投入場所ＣＤ. Input location cd..<p>
	 *
	 */
	public String inpt_loc_cd() {
		return getConstString(offset + 146, $inpt_loc_cd);
	}

	/**
	 * 投入場所ＣＤ. Input location cd..<p>
	 *
	 */
	public void inpt_loc_cd(String value) {
		setConstString(offset + 146, $inpt_loc_cd, value);
	}

	/**
	 * 投入棚・ラインＣＤ. Input rack/line cd..<p>
	 *
	 */
	public String inpt_str_ln_cd() {
		return getConstString(offset + 147, $inpt_str_ln_cd);
	}

	/**
	 * 投入棚・ラインＣＤ. Input rack/line cd..<p>
	 *
	 */
	public void inpt_str_ln_cd(String value) {
		setConstString(offset + 147, $inpt_str_ln_cd, value);
	}

	/**
	 * 外注製造場所ＣＤ. Subcontracting mfg. location cd..<p>
	 *
	 */
	public String outsrc_mfg_loc_cd() {
		return getConstString(offset + 148, $outsrc_mfg_loc_cd);
	}

	/**
	 * 外注製造場所ＣＤ. Subcontracting mfg. location cd..<p>
	 *
	 */
	public void outsrc_mfg_loc_cd(String value) {
		setConstString(offset + 148, $outsrc_mfg_loc_cd, value);
	}

	/**
	 * 外注製造場所部門ＣＤ. Subcontracting mfg. location dept. cd..<p>
	 *
	 */
	public String outsrc_mfg_loc_dpt_cd() {
		return getConstString(offset + 149, $outsrc_mfg_loc_dpt_cd);
	}

	/**
	 * 外注製造場所部門ＣＤ. Subcontracting mfg. location dept. cd..<p>
	 *
	 */
	public void outsrc_mfg_loc_dpt_cd(String value) {
		setConstString(offset + 149, $outsrc_mfg_loc_dpt_cd, value);
	}

	/**
	 * 外注製造場所ワーキンググループＣＤ. Subcontracting mfg. location WG cd..<p>
	 *
	 */
	public String outsrc_mfg_loc_wg_cd() {
		return getConstString(offset + 150, $outsrc_mfg_loc_wg_cd);
	}

	/**
	 * 外注製造場所ワーキンググループＣＤ. Subcontracting mfg. location WG cd..<p>
	 *
	 */
	public void outsrc_mfg_loc_wg_cd(String value) {
		setConstString(offset + 150, $outsrc_mfg_loc_wg_cd, value);
	}

	/**
	 * 格納場所ＣＤ. Storage location cd..<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 151, $strg_loc_cd);
	}

	/**
	 * 格納場所ＣＤ. Storage location cd..<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 151, $strg_loc_cd, value);
	}

	/**
	 * 格納棚・ラインＣＤ. Storage rack/line cd..<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return getConstString(offset + 152, $strg_str_ln_cd);
	}

	/**
	 * 格納棚・ラインＣＤ. Storage rack/line cd..<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		setConstString(offset + 152, $strg_str_ln_cd, value);
	}

	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 153, $mfg_inst_unit_typ);
	}

	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 153, $mfg_inst_unit_typ, value);
	}

	/**
	 * 買戻義務ＦＬＧ. Repurchase obligation flg..<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 154, $repurc_obli_flg);
	}

	/**
	 * 買戻義務ＦＬＧ. Repurchase obligation flg..<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 154, $repurc_obli_flg, value);
	}

	/**
	 * 出庫場所ＣＤ. GI location cd..<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 155, $gi_loc_cd);
	}

	/**
	 * 出庫場所ＣＤ. GI location cd..<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 155, $gi_loc_cd, value);
	}

	/**
	 * 入庫場所ＣＤ. GR location cd..<p>
	 *
	 */
	public String gr_loc_cd() {
		return getConstString(offset + 156, $gr_loc_cd);
	}

	/**
	 * 入庫場所ＣＤ. GR location cd..<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		setConstString(offset + 156, $gr_loc_cd, value);
	}

	/**
	 * 棚卸基準日. Base date of inventory count.<p>
	 *
	 */
	public MCDate stktk_base_dt() {
		return getConstDate(offset + 157, $stktk_base_dt);
	}

	/**
	 * 棚卸基準日. Base date of inventory count.<p>
	 *
	 */
	public void stktk_base_dt(MCDate value) {
		setConstDate(offset + 157, $stktk_base_dt, value);
	}

	/**
	 * 親会計品目分類ＣＤ. Parent accounting item classification cd..<p>
	 *
	 */
	public String par_ac_itm_grp_cd() {
		return getConstString(offset + 158, $par_ac_itm_grp_cd);
	}

	/**
	 * 親会計品目分類ＣＤ. Parent accounting item classification cd..<p>
	 *
	 */
	public void par_ac_itm_grp_cd(String value) {
		setConstString(offset + 158, $par_ac_itm_grp_cd, value);
	}

	/**
	 * 親品目仕訳ＣＤ. Parent item journal cd..<p>
	 *
	 */
	public String par_itm_jnl_cd() {
		return getConstString(offset + 159, $par_itm_jnl_cd);
	}

	/**
	 * 親品目仕訳ＣＤ. Parent item journal cd..<p>
	 *
	 */
	public void par_itm_jnl_cd(String value) {
		setConstString(offset + 159, $par_itm_jnl_cd, value);
	}

	/**
	 * 親品目ＣＤ. Parent item cd..<p>
	 *
	 */
	public String par_itm_cd() {
		return getConstString(offset + 160, $par_itm_cd);
	}

	/**
	 * 親品目ＣＤ. Parent item cd..<p>
	 *
	 */
	public void par_itm_cd(String value) {
		setConstString(offset + 160, $par_itm_cd, value);
	}

	/**
	 * 親品目枝番１. Parent item branch No. 1.<p>
	 *
	 */
	public String par_itm_sub1() {
		return getConstString(offset + 161, $par_itm_sub1);
	}

	/**
	 * 親品目枝番１. Parent item branch No. 1.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		setConstString(offset + 161, $par_itm_sub1, value);
	}

	/**
	 * 親品目枝番２. Parent item branch No. 2.<p>
	 *
	 */
	public String par_itm_sub2() {
		return getConstString(offset + 162, $par_itm_sub2);
	}

	/**
	 * 親品目枝番２. Parent item branch No. 2.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		setConstString(offset + 162, $par_itm_sub2, value);
	}

	/**
	 * 親品目枝番３. Parent item branch No. 3.<p>
	 *
	 */
	public String par_itm_sub3() {
		return getConstString(offset + 163, $par_itm_sub3);
	}

	/**
	 * 親品目枝番３. Parent item branch No. 3.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		setConstString(offset + 163, $par_itm_sub3, value);
	}

	/**
	 * 親品名. Parent item name.<p>
	 *
	 */
	public String par_itm_nm() {
		return getConstString(offset + 164, $par_itm_nm);
	}

	/**
	 * 親品名. Parent item name.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		setConstString(offset + 164, $par_itm_nm, value);
	}

	/**
	 * 親ロットＮＯ. Parent lot No..<p>
	 *
	 */
	public String par_lot_no() {
		return getConstString(offset + 165, $par_lot_no);
	}

	/**
	 * 親ロットＮＯ. Parent lot No..<p>
	 *
	 */
	public void par_lot_no(String value) {
		setConstString(offset + 165, $par_lot_no, value);
	}

	/**
	 * 親サブロットＮＯ. Parent sublot No..<p>
	 *
	 */
	public String par_sublot_no() {
		return getConstString(offset + 166, $par_sublot_no);
	}

	/**
	 * 親サブロットＮＯ. Parent sublot No..<p>
	 *
	 */
	public void par_sublot_no(String value) {
		setConstString(offset + 166, $par_sublot_no, value);
	}

	/**
	 * 親手配ＮＯ１. Parent SEIBAN No. 1.<p>
	 *
	 */
	public String par_sno1() {
		return getConstString(offset + 167, $par_sno1);
	}

	/**
	 * 親手配ＮＯ１. Parent SEIBAN No. 1.<p>
	 *
	 */
	public void par_sno1(String value) {
		setConstString(offset + 167, $par_sno1, value);
	}

	/**
	 * 親手配ＮＯ２. Parent SEIBAN No. 2.<p>
	 *
	 */
	public String par_sno2() {
		return getConstString(offset + 168, $par_sno2);
	}

	/**
	 * 親手配ＮＯ２. Parent SEIBAN No. 2.<p>
	 *
	 */
	public void par_sno2(String value) {
		setConstString(offset + 168, $par_sno2, value);
	}

	/**
	 * 親手配ＮＯ３. Parent SEIBAN No. 3.<p>
	 *
	 */
	public String par_sno3() {
		return getConstString(offset + 169, $par_sno3);
	}

	/**
	 * 親手配ＮＯ３. Parent SEIBAN No. 3.<p>
	 *
	 */
	public void par_sno3(String value) {
		setConstString(offset + 169, $par_sno3, value);
	}

	/**
	 * 親手配ＮＯ４. Parent SEIBAN No. 4.<p>
	 *
	 */
	public String par_sno4() {
		return getConstString(offset + 170, $par_sno4);
	}

	/**
	 * 親手配ＮＯ４. Parent SEIBAN No. 4.<p>
	 *
	 */
	public void par_sno4(String value) {
		setConstString(offset + 170, $par_sno4, value);
	}

	/**
	 * 在庫発生基準ＦＬＧ. Inventory accrual base flg..<p>
	 *
	 */
	public boolean accrual_flg() {
		return getConstBoolean(offset + 171, $accrual_flg);
	}

	/**
	 * 在庫発生基準ＦＬＧ. Inventory accrual base flg..<p>
	 *
	 */
	public void accrual_flg(boolean value) {
		setConstBoolean(offset + 171, $accrual_flg, value);
	}

	/**
	 * 資産発生基準ＦＬＧ. Asset accrual base flg..<p>
	 *
	 */
	public boolean accpt_flg() {
		return getConstBoolean(offset + 172, $accpt_flg);
	}

	/**
	 * 資産発生基準ＦＬＧ. Asset accrual base flg..<p>
	 *
	 */
	public void accpt_flg(boolean value) {
		setConstBoolean(offset + 172, $accpt_flg, value);
	}

	/**
	 * 使用可能日基準ＦＬＧ. Available date basis flg..<p>
	 *
	 */
	public boolean avl_flg() {
		return getConstBoolean(offset + 173, $avl_flg);
	}

	/**
	 * 使用可能日基準ＦＬＧ. Available date basis flg..<p>
	 *
	 */
	public void avl_flg(boolean value) {
		setConstBoolean(offset + 173, $avl_flg, value);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 174, $trd_rmrks);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 174, $trd_rmrks, value);
	}

	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 175, $trd_d_rmrks);
	}

	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 175, $trd_d_rmrks, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 176, $sub_char1);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 176, $sub_char1, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 177, $sub_char2);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 177, $sub_char2, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 178, $sub_char3);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 178, $sub_char3, value);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 179, $sub_char4);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 179, $sub_char4, value);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 180, $sub_char5);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 180, $sub_char5, value);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 181, $sub_char6);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 181, $sub_char6, value);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 182, $sub_char7);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 182, $sub_char7, value);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 183, $sub_char8);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 183, $sub_char8, value);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 184, $sub_char9);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 184, $sub_char9, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 185, $sub_char10);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 185, $sub_char10, value);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 186, $sub_num1);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 186, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 186, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 186, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 186, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 186, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 187, $sub_num2);
	}

	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 187, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 187, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 187, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 187, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 187, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 188, $sub_num3);
	}

	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 188, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 188, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 188, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 188, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 188, $sub_num3, value);
	}
	
	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 189, $sub_dt1);
	}

	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 189, $sub_dt1, value);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 190, $sub_dt2);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 190, $sub_dt2, value);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 191, $sub_dt3);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 191, $sub_dt3, value);
	}

	/**
	 * 親伝票ＮＯ. Parent slip No..<p>
	 *
	 */
	public String par_slip_no() {
		return getConstString(offset + 192, $par_slip_no);
	}

	/**
	 * 親伝票ＮＯ. Parent slip No..<p>
	 *
	 */
	public void par_slip_no(String value) {
		setConstString(offset + 192, $par_slip_no, value);
	}

	/**
	 * 親伝票連番. Parent slip sequence number.<p>
	 *
	 */
	public MCNumber par_slip_seq_no() {
		return getConstNumber(offset + 193, $par_slip_seq_no);
	}

	/**
	 * 親伝票連番. Parent slip sequence number.<p>
	 *
	 */
	public void par_slip_seq_no(MCNumber value) {
		setConstNumber(offset + 193, $par_slip_seq_no, value);
	}
	
	/**
	 * 親伝票連番. Parent slip sequence number.<p>
	 *
	 */
	public void par_slip_seq_no(int value) {
		setConstNumber(offset + 193, $par_slip_seq_no, value);
	}
	
	/**
	 * 親伝票連番. Parent slip sequence number.<p>
	 *
	 */
	public void par_slip_seq_no(long value) {
		setConstNumber(offset + 193, $par_slip_seq_no, value);
	}
	
	/**
	 * 親伝票連番. Parent slip sequence number.<p>
	 *
	 */
	public void par_slip_seq_no(float value) {
		setConstNumber(offset + 193, $par_slip_seq_no, value);
	}
	
	/**
	 * 親伝票連番. Parent slip sequence number.<p>
	 *
	 */
	public void par_slip_seq_no(double value) {
		setConstNumber(offset + 193, $par_slip_seq_no, value);
	}
	
	/**
	 * 補完ＦＬＧ. Complement flg..<p>
	 *
	 */
	public boolean slip_cmpl_flg() {
		return getConstBoolean(offset + 194, $slip_cmpl_flg);
	}

	/**
	 * 補完ＦＬＧ. Complement flg..<p>
	 *
	 */
	public void slip_cmpl_flg(boolean value) {
		setConstBoolean(offset + 194, $slip_cmpl_flg, value);
	}

	/**
	 * 送信対象ＦＬＧ. To be exported flg..<p>
	 *
	 */
	public boolean send_flg() {
		return getConstBoolean(offset + 195, $send_flg);
	}

	/**
	 * 送信対象ＦＬＧ. To be exported flg..<p>
	 *
	 */
	public void send_flg(boolean value) {
		setConstBoolean(offset + 195, $send_flg, value);
	}

	/**
	 * 原価取込済ＦＬＧ. Cost imported flg..<p>
	 *
	 */
	public boolean c_imp_flg() {
		return getConstBoolean(offset + 196, $c_imp_flg);
	}

	/**
	 * 原価取込済ＦＬＧ. Cost imported flg..<p>
	 *
	 */
	public void c_imp_flg(boolean value) {
		setConstBoolean(offset + 196, $c_imp_flg, value);
	}

	/**
	 * 会計ＩＦ取込済ＦＬＧ. Accounting IF imported flg..<p>
	 *
	 */
	public boolean a_imp_flg() {
		return getConstBoolean(offset + 197, $a_imp_flg);
	}

	/**
	 * 会計ＩＦ取込済ＦＬＧ. Accounting IF imported flg..<p>
	 *
	 */
	public void a_imp_flg(boolean value) {
		setConstBoolean(offset + 197, $a_imp_flg, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 198, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 198, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 199, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 199, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 200, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 200, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 201, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 201, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 202, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 202, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 202, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 202, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 202, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 202, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 203, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 203, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 204, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 204, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 205, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 205, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 206, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 206, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 207, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 207, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($slip_no.equalsIgnoreCase(name)) {
			return slip_no();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($act_io_no.equalsIgnoreCase(name)) {
			return act_io_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			return trn_typ();
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			return io_act_typ();
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			return io_typ();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($gi_dpt_cd.equalsIgnoreCase(name)) {
			return gi_dpt_cd();
		}
		if ($gr_dpt_cd.equalsIgnoreCase(name)) {
			return gr_dpt_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($sub_dpt_cd1.equalsIgnoreCase(name)) {
			return sub_dpt_cd1();
		}
		if ($sub_dpt_cd2.equalsIgnoreCase(name)) {
			return sub_dpt_cd2();
		}
		if ($sub_dpt_cd3.equalsIgnoreCase(name)) {
			return sub_dpt_cd3();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($mfg_usr_cd.equalsIgnoreCase(name)) {
			return mfg_usr_cd();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			return ac_itm_grp_cd();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
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
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			return fix_no();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			return in_xfr_typ();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($ptax_xrate_cd.equalsIgnoreCase(name)) {
			return ptax_xrate_cd();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($bd_ctg_cd.equalsIgnoreCase(name)) {
			return bd_ctg_cd();
		}
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			return bd_bp_cd();
		}
		if ($bd_oper_cd.equalsIgnoreCase(name)) {
			return bd_oper_cd();
		}
		if ($bd_loc_cd.equalsIgnoreCase(name)) {
			return bd_loc_cd();
		}
		if ($bd_slo_no.equalsIgnoreCase(name)) {
			return bd_slo_no();
		}
		if ($bd_po_no.equalsIgnoreCase(name)) {
			return bd_po_no();
		}
		if ($bd_iv_no.equalsIgnoreCase(name)) {
			return bd_iv_no();
		}
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			return bd_wg_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($sttl_cd.equalsIgnoreCase(name)) {
			return sttl_cd();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($purc_typ.equalsIgnoreCase(name)) {
			return purc_typ();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($outsrc_mfg_loc_cd.equalsIgnoreCase(name)) {
			return outsrc_mfg_loc_cd();
		}
		if ($outsrc_mfg_loc_dpt_cd.equalsIgnoreCase(name)) {
			return outsrc_mfg_loc_dpt_cd();
		}
		if ($outsrc_mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return outsrc_mfg_loc_wg_cd();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($par_ac_itm_grp_cd.equalsIgnoreCase(name)) {
			return par_ac_itm_grp_cd();
		}
		if ($par_itm_jnl_cd.equalsIgnoreCase(name)) {
			return par_itm_jnl_cd();
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			return par_lot_no();
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			return par_sublot_no();
		}
		if ($par_sno1.equalsIgnoreCase(name)) {
			return par_sno1();
		}
		if ($par_sno2.equalsIgnoreCase(name)) {
			return par_sno2();
		}
		if ($par_sno3.equalsIgnoreCase(name)) {
			return par_sno3();
		}
		if ($par_sno4.equalsIgnoreCase(name)) {
			return par_sno4();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($sub_char4.equalsIgnoreCase(name)) {
			return sub_char4();
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			return sub_char5();
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			return sub_char6();
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			return sub_char7();
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			return sub_char8();
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			return sub_char9();
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			return sub_char10();
		}
		if ($par_slip_no.equalsIgnoreCase(name)) {
			return par_slip_no();
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
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			return slip_seq_no();
		}
		if ($slip_rev_no.equalsIgnoreCase(name)) {
			return slip_rev_no();
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			return act_seq();
		}
		if ($act_rev_no.equalsIgnoreCase(name)) {
			return act_rev_no();
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			return act_d_seq();
		}
		if ($act_io_seq.equalsIgnoreCase(name)) {
			return act_io_seq();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return trd_cur_proc_amt();
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			return base_cur_proc_amt();
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			return ptax_cur_upri();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			return ptax_cur_proc_amt();
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return ptax_cur_onr_prov_amt();
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_tax_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			return itm_inst_qty();
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			return mfg_st_qty();
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			return yield_rate();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			return sub_num1();
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			return sub_num2();
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			return sub_num3();
		}
		if ($par_slip_seq_no.equalsIgnoreCase(name)) {
			return par_slip_seq_no();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($act_tm.equalsIgnoreCase(name)) {
			return act_tm();
		}
		if ($sttl_schd_dt.equalsIgnoreCase(name)) {
			return sttl_schd_dt();
		}
		if ($stktk_base_dt.equalsIgnoreCase(name)) {
			return stktk_base_dt();
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			return sub_dt1();
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			return sub_dt2();
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			return sub_dt3();
		}
		return super.getDate(name);
	}

	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}

	public boolean getBoolean(String name) {
		if ($un_fix_flg.equalsIgnoreCase(name)) {
			return un_fix_flg();
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			return temp_ap_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($spot_flg.equalsIgnoreCase(name)) {
			return spot_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($accrual_flg.equalsIgnoreCase(name)) {
			return accrual_flg();
		}
		if ($accpt_flg.equalsIgnoreCase(name)) {
			return accpt_flg();
		}
		if ($avl_flg.equalsIgnoreCase(name)) {
			return avl_flg();
		}
		if ($slip_cmpl_flg.equalsIgnoreCase(name)) {
			return slip_cmpl_flg();
		}
		if ($send_flg.equalsIgnoreCase(name)) {
			return send_flg();
		}
		if ($c_imp_flg.equalsIgnoreCase(name)) {
			return c_imp_flg();
		}
		if ($a_imp_flg.equalsIgnoreCase(name)) {
			return a_imp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($slip_no.equalsIgnoreCase(name)) {
			return slip_no();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($act_io_no.equalsIgnoreCase(name)) {
			return act_io_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			return trn_typ();
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			return io_act_typ();
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			return io_typ();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($gi_dpt_cd.equalsIgnoreCase(name)) {
			return gi_dpt_cd();
		}
		if ($gr_dpt_cd.equalsIgnoreCase(name)) {
			return gr_dpt_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($sub_dpt_cd1.equalsIgnoreCase(name)) {
			return sub_dpt_cd1();
		}
		if ($sub_dpt_cd2.equalsIgnoreCase(name)) {
			return sub_dpt_cd2();
		}
		if ($sub_dpt_cd3.equalsIgnoreCase(name)) {
			return sub_dpt_cd3();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($mfg_usr_cd.equalsIgnoreCase(name)) {
			return mfg_usr_cd();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			return ac_itm_grp_cd();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
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
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			return fix_no();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			return in_xfr_typ();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($ptax_xrate_cd.equalsIgnoreCase(name)) {
			return ptax_xrate_cd();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($bd_ctg_cd.equalsIgnoreCase(name)) {
			return bd_ctg_cd();
		}
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			return bd_bp_cd();
		}
		if ($bd_oper_cd.equalsIgnoreCase(name)) {
			return bd_oper_cd();
		}
		if ($bd_loc_cd.equalsIgnoreCase(name)) {
			return bd_loc_cd();
		}
		if ($bd_slo_no.equalsIgnoreCase(name)) {
			return bd_slo_no();
		}
		if ($bd_po_no.equalsIgnoreCase(name)) {
			return bd_po_no();
		}
		if ($bd_iv_no.equalsIgnoreCase(name)) {
			return bd_iv_no();
		}
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			return bd_wg_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($sttl_cd.equalsIgnoreCase(name)) {
			return sttl_cd();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($purc_typ.equalsIgnoreCase(name)) {
			return purc_typ();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($outsrc_mfg_loc_cd.equalsIgnoreCase(name)) {
			return outsrc_mfg_loc_cd();
		}
		if ($outsrc_mfg_loc_dpt_cd.equalsIgnoreCase(name)) {
			return outsrc_mfg_loc_dpt_cd();
		}
		if ($outsrc_mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return outsrc_mfg_loc_wg_cd();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($par_ac_itm_grp_cd.equalsIgnoreCase(name)) {
			return par_ac_itm_grp_cd();
		}
		if ($par_itm_jnl_cd.equalsIgnoreCase(name)) {
			return par_itm_jnl_cd();
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			return par_lot_no();
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			return par_sublot_no();
		}
		if ($par_sno1.equalsIgnoreCase(name)) {
			return par_sno1();
		}
		if ($par_sno2.equalsIgnoreCase(name)) {
			return par_sno2();
		}
		if ($par_sno3.equalsIgnoreCase(name)) {
			return par_sno3();
		}
		if ($par_sno4.equalsIgnoreCase(name)) {
			return par_sno4();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($sub_char4.equalsIgnoreCase(name)) {
			return sub_char4();
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			return sub_char5();
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			return sub_char6();
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			return sub_char7();
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			return sub_char8();
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			return sub_char9();
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			return sub_char10();
		}
		if ($par_slip_no.equalsIgnoreCase(name)) {
			return par_slip_no();
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
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			return slip_seq_no();
		}
		if ($slip_rev_no.equalsIgnoreCase(name)) {
			return slip_rev_no();
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			return act_seq();
		}
		if ($act_rev_no.equalsIgnoreCase(name)) {
			return act_rev_no();
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			return act_d_seq();
		}
		if ($act_io_seq.equalsIgnoreCase(name)) {
			return act_io_seq();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return trd_cur_proc_amt();
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			return base_cur_proc_amt();
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			return ptax_cur_upri();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			return ptax_cur_proc_amt();
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return ptax_cur_onr_prov_amt();
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_tax_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			return itm_inst_qty();
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			return mfg_st_qty();
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			return yield_rate();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			return sub_num1();
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			return sub_num2();
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			return sub_num3();
		}
		if ($par_slip_seq_no.equalsIgnoreCase(name)) {
			return par_slip_seq_no();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($act_tm.equalsIgnoreCase(name)) {
			return act_tm();
		}
		if ($sttl_schd_dt.equalsIgnoreCase(name)) {
			return sttl_schd_dt();
		}
		if ($stktk_base_dt.equalsIgnoreCase(name)) {
			return stktk_base_dt();
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			return sub_dt1();
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			return sub_dt2();
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			return sub_dt3();
		}
		return super.getDateNE(name);
	}

	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($un_fix_flg.equalsIgnoreCase(name)) {
			return un_fix_flg();
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			return temp_ap_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($spot_flg.equalsIgnoreCase(name)) {
			return spot_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($accrual_flg.equalsIgnoreCase(name)) {
			return accrual_flg();
		}
		if ($accpt_flg.equalsIgnoreCase(name)) {
			return accpt_flg();
		}
		if ($avl_flg.equalsIgnoreCase(name)) {
			return avl_flg();
		}
		if ($slip_cmpl_flg.equalsIgnoreCase(name)) {
			return slip_cmpl_flg();
		}
		if ($send_flg.equalsIgnoreCase(name)) {
			return send_flg();
		}
		if ($c_imp_flg.equalsIgnoreCase(name)) {
			return c_imp_flg();
		}
		if ($a_imp_flg.equalsIgnoreCase(name)) {
			return a_imp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($slip_no.equalsIgnoreCase(name)) {
			slip_no(value);
			return;
		}
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
			return;
		}
		if ($act_io_no.equalsIgnoreCase(name)) {
			act_io_no(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			trn_typ(value);
			return;
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			io_act_typ(value);
			return;
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			io_typ(value);
			return;
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($gi_dpt_cd.equalsIgnoreCase(name)) {
			gi_dpt_cd(value);
			return;
		}
		if ($gr_dpt_cd.equalsIgnoreCase(name)) {
			gr_dpt_cd(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($sub_dpt_cd1.equalsIgnoreCase(name)) {
			sub_dpt_cd1(value);
			return;
		}
		if ($sub_dpt_cd2.equalsIgnoreCase(name)) {
			sub_dpt_cd2(value);
			return;
		}
		if ($sub_dpt_cd3.equalsIgnoreCase(name)) {
			sub_dpt_cd3(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($mfg_usr_cd.equalsIgnoreCase(name)) {
			mfg_usr_cd(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			ac_itm_grp_cd(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
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
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			fix_no_typ(value);
			return;
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			fix_no(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			in_xfr_typ(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($ptax_xrate_cd.equalsIgnoreCase(name)) {
			ptax_xrate_cd(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($bd_ctg_cd.equalsIgnoreCase(name)) {
			bd_ctg_cd(value);
			return;
		}
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			bd_bp_cd(value);
			return;
		}
		if ($bd_oper_cd.equalsIgnoreCase(name)) {
			bd_oper_cd(value);
			return;
		}
		if ($bd_loc_cd.equalsIgnoreCase(name)) {
			bd_loc_cd(value);
			return;
		}
		if ($bd_slo_no.equalsIgnoreCase(name)) {
			bd_slo_no(value);
			return;
		}
		if ($bd_po_no.equalsIgnoreCase(name)) {
			bd_po_no(value);
			return;
		}
		if ($bd_iv_no.equalsIgnoreCase(name)) {
			bd_iv_no(value);
			return;
		}
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			bd_wg_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($sttl_cd.equalsIgnoreCase(name)) {
			sttl_cd(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($purc_typ.equalsIgnoreCase(name)) {
			purc_typ(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
			return;
		}
		if ($outsrc_mfg_loc_cd.equalsIgnoreCase(name)) {
			outsrc_mfg_loc_cd(value);
			return;
		}
		if ($outsrc_mfg_loc_dpt_cd.equalsIgnoreCase(name)) {
			outsrc_mfg_loc_dpt_cd(value);
			return;
		}
		if ($outsrc_mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			outsrc_mfg_loc_wg_cd(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($par_ac_itm_grp_cd.equalsIgnoreCase(name)) {
			par_ac_itm_grp_cd(value);
			return;
		}
		if ($par_itm_jnl_cd.equalsIgnoreCase(name)) {
			par_itm_jnl_cd(value);
			return;
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
			return;
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			par_lot_no(value);
			return;
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			par_sublot_no(value);
			return;
		}
		if ($par_sno1.equalsIgnoreCase(name)) {
			par_sno1(value);
			return;
		}
		if ($par_sno2.equalsIgnoreCase(name)) {
			par_sno2(value);
			return;
		}
		if ($par_sno3.equalsIgnoreCase(name)) {
			par_sno3(value);
			return;
		}
		if ($par_sno4.equalsIgnoreCase(name)) {
			par_sno4(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($sub_char4.equalsIgnoreCase(name)) {
			sub_char4(value);
			return;
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			sub_char5(value);
			return;
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			sub_char6(value);
			return;
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			sub_char7(value);
			return;
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			sub_char8(value);
			return;
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			sub_char9(value);
			return;
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			sub_char10(value);
			return;
		}
		if ($par_slip_no.equalsIgnoreCase(name)) {
			par_slip_no(value);
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
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($slip_rev_no.equalsIgnoreCase(name)) {
			slip_rev_no(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev_no.equalsIgnoreCase(name)) {
			act_rev_no(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($act_io_seq.equalsIgnoreCase(name)) {
			act_io_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			itm_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($par_slip_seq_no.equalsIgnoreCase(name)) {
			par_slip_seq_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($slip_rev_no.equalsIgnoreCase(name)) {
			slip_rev_no(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev_no.equalsIgnoreCase(name)) {
			act_rev_no(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($act_io_seq.equalsIgnoreCase(name)) {
			act_io_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			itm_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($par_slip_seq_no.equalsIgnoreCase(name)) {
			par_slip_seq_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($slip_rev_no.equalsIgnoreCase(name)) {
			slip_rev_no(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev_no.equalsIgnoreCase(name)) {
			act_rev_no(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($act_io_seq.equalsIgnoreCase(name)) {
			act_io_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			itm_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($par_slip_seq_no.equalsIgnoreCase(name)) {
			par_slip_seq_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($slip_rev_no.equalsIgnoreCase(name)) {
			slip_rev_no(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev_no.equalsIgnoreCase(name)) {
			act_rev_no(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($act_io_seq.equalsIgnoreCase(name)) {
			act_io_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			itm_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($par_slip_seq_no.equalsIgnoreCase(name)) {
			par_slip_seq_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($slip_rev_no.equalsIgnoreCase(name)) {
			slip_rev_no(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev_no.equalsIgnoreCase(name)) {
			act_rev_no(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($act_io_seq.equalsIgnoreCase(name)) {
			act_io_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			itm_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($par_slip_seq_no.equalsIgnoreCase(name)) {
			par_slip_seq_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($act_tm.equalsIgnoreCase(name)) {
			act_tm(value);
			return;
		}
		if ($sttl_schd_dt.equalsIgnoreCase(name)) {
			sttl_schd_dt(value);
			return;
		}
		if ($stktk_base_dt.equalsIgnoreCase(name)) {
			stktk_base_dt(value);
			return;
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			sub_dt1(value);
			return;
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			sub_dt2(value);
			return;
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			sub_dt3(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setTimestamp(String name, MCTimestamp value) {
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
		if ($un_fix_flg.equalsIgnoreCase(name)) {
			un_fix_flg(value);
			return;
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			temp_ap_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($spot_flg.equalsIgnoreCase(name)) {
			spot_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($accrual_flg.equalsIgnoreCase(name)) {
			accrual_flg(value);
			return;
		}
		if ($accpt_flg.equalsIgnoreCase(name)) {
			accpt_flg(value);
			return;
		}
		if ($avl_flg.equalsIgnoreCase(name)) {
			avl_flg(value);
			return;
		}
		if ($slip_cmpl_flg.equalsIgnoreCase(name)) {
			slip_cmpl_flg(value);
			return;
		}
		if ($send_flg.equalsIgnoreCase(name)) {
			send_flg(value);
			return;
		}
		if ($c_imp_flg.equalsIgnoreCase(name)) {
			c_imp_flg(value);
			return;
		}
		if ($a_imp_flg.equalsIgnoreCase(name)) {
			a_imp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($slip_no.equalsIgnoreCase(name)) {
			slip_no(value);
			return;
		}
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
			return;
		}
		if ($act_io_no.equalsIgnoreCase(name)) {
			act_io_no(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			trn_typ(value);
			return;
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			io_act_typ(value);
			return;
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			io_typ(value);
			return;
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($gi_dpt_cd.equalsIgnoreCase(name)) {
			gi_dpt_cd(value);
			return;
		}
		if ($gr_dpt_cd.equalsIgnoreCase(name)) {
			gr_dpt_cd(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($sub_dpt_cd1.equalsIgnoreCase(name)) {
			sub_dpt_cd1(value);
			return;
		}
		if ($sub_dpt_cd2.equalsIgnoreCase(name)) {
			sub_dpt_cd2(value);
			return;
		}
		if ($sub_dpt_cd3.equalsIgnoreCase(name)) {
			sub_dpt_cd3(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($mfg_usr_cd.equalsIgnoreCase(name)) {
			mfg_usr_cd(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			ac_itm_grp_cd(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
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
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			fix_no_typ(value);
			return;
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			fix_no(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			in_xfr_typ(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($ptax_xrate_cd.equalsIgnoreCase(name)) {
			ptax_xrate_cd(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($bd_ctg_cd.equalsIgnoreCase(name)) {
			bd_ctg_cd(value);
			return;
		}
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			bd_bp_cd(value);
			return;
		}
		if ($bd_oper_cd.equalsIgnoreCase(name)) {
			bd_oper_cd(value);
			return;
		}
		if ($bd_loc_cd.equalsIgnoreCase(name)) {
			bd_loc_cd(value);
			return;
		}
		if ($bd_slo_no.equalsIgnoreCase(name)) {
			bd_slo_no(value);
			return;
		}
		if ($bd_po_no.equalsIgnoreCase(name)) {
			bd_po_no(value);
			return;
		}
		if ($bd_iv_no.equalsIgnoreCase(name)) {
			bd_iv_no(value);
			return;
		}
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			bd_wg_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($sttl_cd.equalsIgnoreCase(name)) {
			sttl_cd(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($purc_typ.equalsIgnoreCase(name)) {
			purc_typ(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
			return;
		}
		if ($outsrc_mfg_loc_cd.equalsIgnoreCase(name)) {
			outsrc_mfg_loc_cd(value);
			return;
		}
		if ($outsrc_mfg_loc_dpt_cd.equalsIgnoreCase(name)) {
			outsrc_mfg_loc_dpt_cd(value);
			return;
		}
		if ($outsrc_mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			outsrc_mfg_loc_wg_cd(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($par_ac_itm_grp_cd.equalsIgnoreCase(name)) {
			par_ac_itm_grp_cd(value);
			return;
		}
		if ($par_itm_jnl_cd.equalsIgnoreCase(name)) {
			par_itm_jnl_cd(value);
			return;
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
			return;
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			par_lot_no(value);
			return;
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			par_sublot_no(value);
			return;
		}
		if ($par_sno1.equalsIgnoreCase(name)) {
			par_sno1(value);
			return;
		}
		if ($par_sno2.equalsIgnoreCase(name)) {
			par_sno2(value);
			return;
		}
		if ($par_sno3.equalsIgnoreCase(name)) {
			par_sno3(value);
			return;
		}
		if ($par_sno4.equalsIgnoreCase(name)) {
			par_sno4(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($sub_char4.equalsIgnoreCase(name)) {
			sub_char4(value);
			return;
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			sub_char5(value);
			return;
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			sub_char6(value);
			return;
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			sub_char7(value);
			return;
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			sub_char8(value);
			return;
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			sub_char9(value);
			return;
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			sub_char10(value);
			return;
		}
		if ($par_slip_no.equalsIgnoreCase(name)) {
			par_slip_no(value);
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
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($slip_rev_no.equalsIgnoreCase(name)) {
			slip_rev_no(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev_no.equalsIgnoreCase(name)) {
			act_rev_no(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($act_io_seq.equalsIgnoreCase(name)) {
			act_io_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			itm_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($par_slip_seq_no.equalsIgnoreCase(name)) {
			par_slip_seq_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($slip_rev_no.equalsIgnoreCase(name)) {
			slip_rev_no(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev_no.equalsIgnoreCase(name)) {
			act_rev_no(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($act_io_seq.equalsIgnoreCase(name)) {
			act_io_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			itm_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($par_slip_seq_no.equalsIgnoreCase(name)) {
			par_slip_seq_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($slip_rev_no.equalsIgnoreCase(name)) {
			slip_rev_no(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev_no.equalsIgnoreCase(name)) {
			act_rev_no(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($act_io_seq.equalsIgnoreCase(name)) {
			act_io_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			itm_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($par_slip_seq_no.equalsIgnoreCase(name)) {
			par_slip_seq_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($slip_rev_no.equalsIgnoreCase(name)) {
			slip_rev_no(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev_no.equalsIgnoreCase(name)) {
			act_rev_no(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($act_io_seq.equalsIgnoreCase(name)) {
			act_io_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			itm_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($par_slip_seq_no.equalsIgnoreCase(name)) {
			par_slip_seq_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($slip_rev_no.equalsIgnoreCase(name)) {
			slip_rev_no(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev_no.equalsIgnoreCase(name)) {
			act_rev_no(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($act_io_seq.equalsIgnoreCase(name)) {
			act_io_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			itm_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($par_slip_seq_no.equalsIgnoreCase(name)) {
			par_slip_seq_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($act_tm.equalsIgnoreCase(name)) {
			act_tm(value);
			return;
		}
		if ($sttl_schd_dt.equalsIgnoreCase(name)) {
			sttl_schd_dt(value);
			return;
		}
		if ($stktk_base_dt.equalsIgnoreCase(name)) {
			stktk_base_dt(value);
			return;
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			sub_dt1(value);
			return;
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			sub_dt2(value);
			return;
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			sub_dt3(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setTimestampNE(String name, MCTimestamp value) {
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
		if ($un_fix_flg.equalsIgnoreCase(name)) {
			un_fix_flg(value);
			return;
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			temp_ap_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($spot_flg.equalsIgnoreCase(name)) {
			spot_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($accrual_flg.equalsIgnoreCase(name)) {
			accrual_flg(value);
			return;
		}
		if ($accpt_flg.equalsIgnoreCase(name)) {
			accpt_flg(value);
			return;
		}
		if ($avl_flg.equalsIgnoreCase(name)) {
			avl_flg(value);
			return;
		}
		if ($slip_cmpl_flg.equalsIgnoreCase(name)) {
			slip_cmpl_flg(value);
			return;
		}
		if ($send_flg.equalsIgnoreCase(name)) {
			send_flg(value);
			return;
		}
		if ($c_imp_flg.equalsIgnoreCase(name)) {
			c_imp_flg(value);
			return;
		}
		if ($a_imp_flg.equalsIgnoreCase(name)) {
			a_imp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
