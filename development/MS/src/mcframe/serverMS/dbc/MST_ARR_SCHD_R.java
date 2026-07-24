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
 * "入荷予定 // Receipt schedule"DBコンテナRowクラスです。<p>
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
 *  	<td>arr_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷予定ＮＯ</td>
 *  	<td>Receipt schedule No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>arr_pr_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷進捗ＮＯ</td>
 *  	<td>Receipt progress No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prms_rcpt_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納期回答受領明細ＮＯ</td>
 *  	<td>Order promising result received details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_inst_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入指示明細ＮＯ</td>
 *  	<td>Delivery order details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_act_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入実績明細ＮＯ</td>
 *  	<td>Purchase result details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcpt_iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受領インボイスＮＯ</td>
 *  	<td>Purchase invoice No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcpt_iv_mng_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受領インボイス管理ＮＯ</td>
 *  	<td>Purchase invoice management No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pr_sts_typ</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>進捗状況区分</td>
 *  	<td>Progress status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_slip_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品書ＮＯ</td>
 *  	<td>Delivery note No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_slip_mng_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品書管理ＮＯ</td>
 *  	<td>Delivery note management No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_slip_mng_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品書管理連番</td>
 *  	<td>Delivery note management sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_slip_mng_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品書明細管理ＮＯ</td>
 *  	<td>Delivery note details management No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_slip_mng_d_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品書明細管理連番</td>
 *  	<td>Delivery note details management sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>インボイスＮＯ</td>
 *  	<td>Invoice No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>arr_ptn_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷パタン区分</td>
 *  	<td>Receipt pattern type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>arr_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入荷予定日時</td>
 *  	<td>Scheduled receipt date and time</td>
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
 *  	<td>rcpt_iv_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受領インボイス表記品名</td>
 *  	<td>Item name for purchase invoice</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sundry_itm_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>諸口品ＦＬＧ</td>
 *  	<td>Miscellaneous item flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購買識別区分</td>
 *  	<td>Purchase identification type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１</td>
 *  	<td>SEIBAN No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２</td>
 *  	<td>SEIBAN No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３</td>
 *  	<td>SEIBAN No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４</td>
 *  	<td>SEIBAN No. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットＮＯ</td>
 *  	<td>Lot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ</td>
 *  	<td>Sublot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ver_no</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>版ＮＯ</td>
 *  	<td>Version No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_arrv_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫着荷先ＣＤ</td>
 *  	<td>Inventory arriving point cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gd_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格付ＣＤ</td>
 *  	<td>Grading cd.</td>
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
 *  	<td>stk_insp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫検査区分</td>
 *  	<td>Inventory inspection type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫識別区分</td>
 *  	<td>Inventory identification type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫取引先ＣＤ</td>
 *  	<td>Inventory BP cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ret_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品元場所ＣＤ</td>
 *  	<td>Return-from location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ret_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品元棚・ラインＣＤ</td>
 *  	<td>Return-from rack/line cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ret_gd_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品元格付ＣＤ</td>
 *  	<td>Return-from grading cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先品目ＣＤ</td>
 *  	<td>Supplier item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先品名</td>
 *  	<td>Supplier item name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>maker_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メーカＣＤ</td>
 *  	<td>Maker cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業者ロットＮＯ</td>
 *  	<td>Vendor lot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>物流グループＣＤ</td>
 *  	<td>Distribution group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>arr_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷場所ＣＤ</td>
 *  	<td>Receipt location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>棚・ラインＣＤ</td>
 *  	<td>Rack/Line cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引単位数量</td>
 *  	<td>Transaction unit qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引単位ＣＤ</td>
 *  	<td>Transaction unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位数量</td>
 *  	<td>Base unit qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位ＣＤ</td>
 *  	<td>Base unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>arr_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷数量</td>
 *  	<td>Receipt qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入数量</td>
 *  	<td>Purchase qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_ret_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上返品数量</td>
 *  	<td>Sales return qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>abort_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>打切数量</td>
 *  	<td>Cancelled remaining qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>abort_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>打切ＦＬＧ</td>
 *  	<td>Cancel remaining flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_ret_schd_abort_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上返品予定打切数量</td>
 *  	<td>Cancelled remaining sales return schedule qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_ret_schd_abort_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上返品予定打切ＦＬＧ</td>
 *  	<td>Cancel remaining sales return schedule flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sync_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>同時計上ＦＬＧ</td>
 *  	<td>Simultaneous recording flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cmpl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>完了ＦＬＧ</td>
 *  	<td>Completed flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_ret_schd_cmpl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上返品予定完了ＦＬＧ</td>
 *  	<td>Sales return schedule completion flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>arr_split_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷実績分割ＦＬＧ</td>
 *  	<td>Receipt result split flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>arr_skip_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷不要ＦＬＧ</td>
 *  	<td>Not receipt flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>re_arr_schd_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>再入荷予定ＦＬＧ</td>
 *  	<td>Scheduled re-receipt flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>outsrc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外注ＦＬＧ</td>
 *  	<td>Subcontracting flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造指図ＮＯ</td>
 *  	<td>Mfg. order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pre_outsrc_act_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外注実績先行ＦＬＧ</td>
 *  	<td>Subcontracting result prior flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pre_mfg_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>先行製造実績ＮＯ</td>
 *  	<td>Prior mfg. result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wms_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＷＭＳＦＬＧ</td>
 *  	<td>WMS flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>intr_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内部備考</td>
 *  	<td>Internal remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引備考</td>
 *  	<td>Transaction remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_d_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引明細備考</td>
 *  	<td>Transaction details remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>arr_cnt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入荷連絡備考</td>
 *  	<td>Receipt contact remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_slip_d_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品書明細備考</td>
 *  	<td>Delivery note details remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_pr_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受払進捗管理ＮＯ</td>
 *  	<td>GR/GI progress management No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備１</td>
 *  	<td>Spare 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備２</td>
 *  	<td>Spare 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備３</td>
 *  	<td>Spare 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ins_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録ユーザＩＤ</td>
 *  	<td>Entry user ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ins_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録ユーザ名</td>
 *  	<td>Entry user name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ins_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録日時</td>
 *  	<td>Entry date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ins_func_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録機能ＩＤ</td>
 *  	<td>Entry function ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_cntr</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新カウンタ</td>
 *  	<td>Update counter</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新ユーザＩＤ</td>
 *  	<td>Update user ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新ユーザ名</td>
 *  	<td>Update user name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新日時</td>
 *  	<td>Update date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_func_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新機能ＩＤ</td>
 *  	<td>Update function ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
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
public class MST_ARR_SCHD_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_ARR_SCHD";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 入荷予定ＮＯ. Receipt schedule No..<p>
	 *
	 */
	public static final String $arr_schd_no = "arr_schd_no";
	private static final MCPermColumnInfo _arr_schd_no = createColumnInfo("arr_schd_no");
	public final MCStringPermColumn arr_schd_no = createStringColumn(_arr_schd_no);
	
	/**
	 * 入荷進捗ＮＯ. Receipt progress No..<p>
	 *
	 */
	public static final String $arr_pr_no = "arr_pr_no";
	private static final MCPermColumnInfo _arr_pr_no = createColumnInfo("arr_pr_no");
	public final MCStringPermColumn arr_pr_no = createStringColumn(_arr_pr_no);
	
	/**
	 * 納期回答受領明細ＮＯ. Order promising result received details No..<p>
	 *
	 */
	public static final String $prms_rcpt_d_no = "prms_rcpt_d_no";
	private static final MCPermColumnInfo _prms_rcpt_d_no = createColumnInfo("prms_rcpt_d_no");
	public final MCStringPermColumn prms_rcpt_d_no = createStringColumn(_prms_rcpt_d_no);
	
	/**
	 * 納入指示明細ＮＯ. Delivery order details No..<p>
	 *
	 */
	public static final String $dlv_inst_d_no = "dlv_inst_d_no";
	private static final MCPermColumnInfo _dlv_inst_d_no = createColumnInfo("dlv_inst_d_no");
	public final MCStringPermColumn dlv_inst_d_no = createStringColumn(_dlv_inst_d_no);
	
	/**
	 * 仕入実績明細ＮＯ. Purchase result details No..<p>
	 *
	 */
	public static final String $purc_act_d_no = "purc_act_d_no";
	private static final MCPermColumnInfo _purc_act_d_no = createColumnInfo("purc_act_d_no");
	public final MCStringPermColumn purc_act_d_no = createStringColumn(_purc_act_d_no);
	
	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	private static final MCPermColumnInfo _rcpt_iv_no = createColumnInfo("rcpt_iv_no");
	public final MCStringPermColumn rcpt_iv_no = createStringColumn(_rcpt_iv_no);
	
	/**
	 * 受領インボイス管理ＮＯ. Purchase invoice management No..<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	private static final MCPermColumnInfo _rcpt_iv_mng_no = createColumnInfo("rcpt_iv_mng_no");
	public final MCStringPermColumn rcpt_iv_mng_no = createStringColumn(_rcpt_iv_mng_no);
	
	/**
	 * 進捗状況区分. Progress status type.<p>
	 *
	 */
	public static final String $pr_sts_typ = "pr_sts_typ";
	private static final MCPermColumnInfo _pr_sts_typ = createColumnInfo("pr_sts_typ");
	public final MCStringPermColumn pr_sts_typ = createStringColumn(_pr_sts_typ);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 納品書ＮＯ. Delivery note No..<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	private static final MCPermColumnInfo _dlv_slip_no = createColumnInfo("dlv_slip_no");
	public final MCStringPermColumn dlv_slip_no = createStringColumn(_dlv_slip_no);
	
	/**
	 * 納品書管理ＮＯ. Delivery note management No..<p>
	 *
	 */
	public static final String $dlv_slip_mng_no = "dlv_slip_mng_no";
	private static final MCPermColumnInfo _dlv_slip_mng_no = createColumnInfo("dlv_slip_mng_no");
	public final MCStringPermColumn dlv_slip_mng_no = createStringColumn(_dlv_slip_mng_no);
	
	/**
	 * 納品書管理連番. Delivery note management sequence number.<p>
	 *
	 */
	public static final String $dlv_slip_mng_seq = "dlv_slip_mng_seq";
	private static final MCPermColumnInfo _dlv_slip_mng_seq = createColumnInfo("dlv_slip_mng_seq");
	public final MCNumberPermColumn dlv_slip_mng_seq = createNumberColumn(_dlv_slip_mng_seq);
	
	/**
	 * 納品書明細管理ＮＯ. Delivery note details management No..<p>
	 *
	 */
	public static final String $dlv_slip_mng_d_no = "dlv_slip_mng_d_no";
	private static final MCPermColumnInfo _dlv_slip_mng_d_no = createColumnInfo("dlv_slip_mng_d_no");
	public final MCStringPermColumn dlv_slip_mng_d_no = createStringColumn(_dlv_slip_mng_d_no);
	
	/**
	 * 納品書明細管理連番. Delivery note details management sequence number.<p>
	 *
	 */
	public static final String $dlv_slip_mng_d_seq = "dlv_slip_mng_d_seq";
	private static final MCPermColumnInfo _dlv_slip_mng_d_seq = createColumnInfo("dlv_slip_mng_d_seq");
	public final MCNumberPermColumn dlv_slip_mng_d_seq = createNumberColumn(_dlv_slip_mng_d_seq);
	
	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	private static final MCPermColumnInfo _iv_no = createColumnInfo("iv_no");
	public final MCStringPermColumn iv_no = createStringColumn(_iv_no);
	
	/**
	 * 入荷パタン区分. Receipt pattern type.<p>
	 *
	 */
	public static final String $arr_ptn_typ = "arr_ptn_typ";
	private static final MCPermColumnInfo _arr_ptn_typ = createColumnInfo("arr_ptn_typ");
	public final MCStringPermColumn arr_ptn_typ = createStringColumn(_arr_ptn_typ);
	
	/**
	 * 入荷予定日時. Scheduled receipt date and time.<p>
	 *
	 */
	public static final String $arr_schd_tm = "arr_schd_tm";
	private static final MCPermColumnInfo _arr_schd_tm = createColumnInfo("arr_schd_tm");
	public final MCDatePermColumn arr_schd_tm = createDateColumn(_arr_schd_tm);
	
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
	 * 受領インボイス表記品名. Item name for purchase invoice.<p>
	 *
	 */
	public static final String $rcpt_iv_itm_nm = "rcpt_iv_itm_nm";
	private static final MCPermColumnInfo _rcpt_iv_itm_nm = createColumnInfo("rcpt_iv_itm_nm");
	public final MCStringPermColumn rcpt_iv_itm_nm = createStringColumn(_rcpt_iv_itm_nm);
	
	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	private static final MCPermColumnInfo _sundry_itm_flg = createColumnInfo("sundry_itm_flg");
	public final MCBooleanPermColumn sundry_itm_flg = createBooleanColumn(_sundry_itm_flg);
	
	/**
	 * 購買識別区分. Purchase identification type.<p>
	 *
	 */
	public static final String $purc_id_typ = "purc_id_typ";
	private static final MCPermColumnInfo _purc_id_typ = createColumnInfo("purc_id_typ");
	public final MCStringPermColumn purc_id_typ = createStringColumn(_purc_id_typ);
	
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
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	private static final MCPermColumnInfo _ver_no = createColumnInfo("ver_no");
	public final MCStringPermColumn ver_no = createStringColumn(_ver_no);
	
	/**
	 * 在庫着荷先ＣＤ. Inventory arriving point cd..<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	private static final MCPermColumnInfo _stk_arrv_bp_cd = createColumnInfo("stk_arrv_bp_cd");
	public final MCStringPermColumn stk_arrv_bp_cd = createStringColumn(_stk_arrv_bp_cd);
	
	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	private static final MCPermColumnInfo _gd_cd = createColumnInfo("gd_cd");
	public final MCStringPermColumn gd_cd = createStringColumn(_gd_cd);
	
	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	private static final MCPermColumnInfo _quality_typ = createColumnInfo("quality_typ");
	public final MCStringPermColumn quality_typ = createStringColumn(_quality_typ);
	
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
	 * 返品元場所ＣＤ. Return-from location cd..<p>
	 *
	 */
	public static final String $ret_loc_cd = "ret_loc_cd";
	private static final MCPermColumnInfo _ret_loc_cd = createColumnInfo("ret_loc_cd");
	public final MCStringPermColumn ret_loc_cd = createStringColumn(_ret_loc_cd);
	
	/**
	 * 返品元棚・ラインＣＤ. Return-from rack/line cd..<p>
	 *
	 */
	public static final String $ret_str_ln_cd = "ret_str_ln_cd";
	private static final MCPermColumnInfo _ret_str_ln_cd = createColumnInfo("ret_str_ln_cd");
	public final MCStringPermColumn ret_str_ln_cd = createStringColumn(_ret_str_ln_cd);
	
	/**
	 * 返品元格付ＣＤ. Return-from grading cd..<p>
	 *
	 */
	public static final String $ret_gd_cd = "ret_gd_cd";
	private static final MCPermColumnInfo _ret_gd_cd = createColumnInfo("ret_gd_cd");
	public final MCStringPermColumn ret_gd_cd = createStringColumn(_ret_gd_cd);
	
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
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	private static final MCPermColumnInfo _maker_cd = createColumnInfo("maker_cd");
	public final MCStringPermColumn maker_cd = createStringColumn(_maker_cd);
	
	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	private static final MCPermColumnInfo _bp_lot_no = createColumnInfo("bp_lot_no");
	public final MCStringPermColumn bp_lot_no = createStringColumn(_bp_lot_no);
	
	/**
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	private static final MCPermColumnInfo _lg_grp_cd = createColumnInfo("lg_grp_cd");
	public final MCStringPermColumn lg_grp_cd = createStringColumn(_lg_grp_cd);
	
	/**
	 * 入荷場所ＣＤ. Receipt location cd..<p>
	 *
	 */
	public static final String $arr_loc_cd = "arr_loc_cd";
	private static final MCPermColumnInfo _arr_loc_cd = createColumnInfo("arr_loc_cd");
	public final MCStringPermColumn arr_loc_cd = createStringColumn(_arr_loc_cd);
	
	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	private static final MCPermColumnInfo _str_ln_cd = createColumnInfo("str_ln_cd");
	public final MCStringPermColumn str_ln_cd = createStringColumn(_str_ln_cd);
	
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
	 * 入荷数量. Receipt qty..<p>
	 *
	 */
	public static final String $arr_qty = "arr_qty";
	private static final MCPermColumnInfo _arr_qty = createColumnInfo("arr_qty");
	public final MCNumberPermColumn arr_qty = createNumberColumn(_arr_qty);
	
	/**
	 * 仕入数量. Purchase qty..<p>
	 *
	 */
	public static final String $purc_qty = "purc_qty";
	private static final MCPermColumnInfo _purc_qty = createColumnInfo("purc_qty");
	public final MCNumberPermColumn purc_qty = createNumberColumn(_purc_qty);
	
	/**
	 * 売上返品数量. Sales return qty..<p>
	 *
	 */
	public static final String $sls_ret_qty = "sls_ret_qty";
	private static final MCPermColumnInfo _sls_ret_qty = createColumnInfo("sls_ret_qty");
	public final MCNumberPermColumn sls_ret_qty = createNumberColumn(_sls_ret_qty);
	
	/**
	 * 打切数量. Cancelled remaining qty..<p>
	 *
	 */
	public static final String $abort_qty = "abort_qty";
	private static final MCPermColumnInfo _abort_qty = createColumnInfo("abort_qty");
	public final MCNumberPermColumn abort_qty = createNumberColumn(_abort_qty);
	
	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	private static final MCPermColumnInfo _abort_flg = createColumnInfo("abort_flg");
	public final MCBooleanPermColumn abort_flg = createBooleanColumn(_abort_flg);
	
	/**
	 * 売上返品予定打切数量. Cancelled remaining sales return schedule qty..<p>
	 *
	 */
	public static final String $sls_ret_schd_abort_qty = "sls_ret_schd_abort_qty";
	private static final MCPermColumnInfo _sls_ret_schd_abort_qty = createColumnInfo("sls_ret_schd_abort_qty");
	public final MCNumberPermColumn sls_ret_schd_abort_qty = createNumberColumn(_sls_ret_schd_abort_qty);
	
	/**
	 * 売上返品予定打切ＦＬＧ. Cancel remaining sales return schedule flg..<p>
	 *
	 */
	public static final String $sls_ret_schd_abort_flg = "sls_ret_schd_abort_flg";
	private static final MCPermColumnInfo _sls_ret_schd_abort_flg = createColumnInfo("sls_ret_schd_abort_flg");
	public final MCBooleanPermColumn sls_ret_schd_abort_flg = createBooleanColumn(_sls_ret_schd_abort_flg);
	
	/**
	 * 同時計上ＦＬＧ. Simultaneous recording flg..<p>
	 *
	 */
	public static final String $sync_flg = "sync_flg";
	private static final MCPermColumnInfo _sync_flg = createColumnInfo("sync_flg");
	public final MCBooleanPermColumn sync_flg = createBooleanColumn(_sync_flg);
	
	/**
	 * 完了ＦＬＧ. Completed flg..<p>
	 *
	 */
	public static final String $cmpl_flg = "cmpl_flg";
	private static final MCPermColumnInfo _cmpl_flg = createColumnInfo("cmpl_flg");
	public final MCBooleanPermColumn cmpl_flg = createBooleanColumn(_cmpl_flg);
	
	/**
	 * 売上返品予定完了ＦＬＧ. Sales return schedule completion flg..<p>
	 *
	 */
	public static final String $sls_ret_schd_cmpl_flg = "sls_ret_schd_cmpl_flg";
	private static final MCPermColumnInfo _sls_ret_schd_cmpl_flg = createColumnInfo("sls_ret_schd_cmpl_flg");
	public final MCBooleanPermColumn sls_ret_schd_cmpl_flg = createBooleanColumn(_sls_ret_schd_cmpl_flg);
	
	/**
	 * 入荷実績分割ＦＬＧ. Receipt result split flg..<p>
	 *
	 */
	public static final String $arr_split_flg = "arr_split_flg";
	private static final MCPermColumnInfo _arr_split_flg = createColumnInfo("arr_split_flg");
	public final MCBooleanPermColumn arr_split_flg = createBooleanColumn(_arr_split_flg);
	
	/**
	 * 入荷不要ＦＬＧ. Not receipt flg..<p>
	 *
	 */
	public static final String $arr_skip_flg = "arr_skip_flg";
	private static final MCPermColumnInfo _arr_skip_flg = createColumnInfo("arr_skip_flg");
	public final MCBooleanPermColumn arr_skip_flg = createBooleanColumn(_arr_skip_flg);
	
	/**
	 * 再入荷予定ＦＬＧ. Scheduled re-receipt flg..<p>
	 *
	 */
	public static final String $re_arr_schd_flg = "re_arr_schd_flg";
	private static final MCPermColumnInfo _re_arr_schd_flg = createColumnInfo("re_arr_schd_flg");
	public final MCBooleanPermColumn re_arr_schd_flg = createBooleanColumn(_re_arr_schd_flg);
	
	/**
	 * 外注ＦＬＧ. Subcontracting flg..<p>
	 *
	 */
	public static final String $outsrc_flg = "outsrc_flg";
	private static final MCPermColumnInfo _outsrc_flg = createColumnInfo("outsrc_flg");
	public final MCBooleanPermColumn outsrc_flg = createBooleanColumn(_outsrc_flg);
	
	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	private static final MCPermColumnInfo _mfg_inst_no = createColumnInfo("mfg_inst_no");
	public final MCStringPermColumn mfg_inst_no = createStringColumn(_mfg_inst_no);
	
	/**
	 * 外注実績先行ＦＬＧ. Subcontracting result prior flg..<p>
	 *
	 */
	public static final String $pre_outsrc_act_flg = "pre_outsrc_act_flg";
	private static final MCPermColumnInfo _pre_outsrc_act_flg = createColumnInfo("pre_outsrc_act_flg");
	public final MCBooleanPermColumn pre_outsrc_act_flg = createBooleanColumn(_pre_outsrc_act_flg);
	
	/**
	 * 先行製造実績ＮＯ. Prior mfg. result No..<p>
	 *
	 */
	public static final String $pre_mfg_act_no = "pre_mfg_act_no";
	private static final MCPermColumnInfo _pre_mfg_act_no = createColumnInfo("pre_mfg_act_no");
	public final MCStringPermColumn pre_mfg_act_no = createStringColumn(_pre_mfg_act_no);
	
	/**
	 * ＷＭＳＦＬＧ. WMS flg..<p>
	 *
	 */
	public static final String $wms_flg = "wms_flg";
	private static final MCPermColumnInfo _wms_flg = createColumnInfo("wms_flg");
	public final MCBooleanPermColumn wms_flg = createBooleanColumn(_wms_flg);
	
	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	private static final MCPermColumnInfo _intr_rmrks = createColumnInfo("intr_rmrks");
	public final MCStringPermColumn intr_rmrks = createStringColumn(_intr_rmrks);
	
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
	 * 入荷連絡備考. Receipt contact remarks.<p>
	 *
	 */
	public static final String $arr_cnt_rmrks = "arr_cnt_rmrks";
	private static final MCPermColumnInfo _arr_cnt_rmrks = createColumnInfo("arr_cnt_rmrks");
	public final MCStringPermColumn arr_cnt_rmrks = createStringColumn(_arr_cnt_rmrks);
	
	/**
	 * 納品書明細備考. Delivery note details remarks.<p>
	 *
	 */
	public static final String $dlv_slip_d_rmrks = "dlv_slip_d_rmrks";
	private static final MCPermColumnInfo _dlv_slip_d_rmrks = createColumnInfo("dlv_slip_d_rmrks");
	public final MCStringPermColumn dlv_slip_d_rmrks = createStringColumn(_dlv_slip_d_rmrks);
	
	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	private static final MCPermColumnInfo _io_schd_pr_no = createColumnInfo("io_schd_pr_no");
	public final MCStringPermColumn io_schd_pr_no = createStringColumn(_io_schd_pr_no);
	
	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	private static final MCPermColumnInfo _sub_char1 = createColumnInfo("sub_char1");
	public final MCStringPermColumn sub_char1 = createStringColumn(_sub_char1);
	
	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	private static final MCPermColumnInfo _sub_char2 = createColumnInfo("sub_char2");
	public final MCStringPermColumn sub_char2 = createStringColumn(_sub_char2);
	
	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	private static final MCPermColumnInfo _sub_char3 = createColumnInfo("sub_char3");
	public final MCStringPermColumn sub_char3 = createStringColumn(_sub_char3);
	
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
	
	public static final MCMeta arr_schd_no_META = createCommonMeta($arr_schd_no, mcframe.commonMA.meta.MA_META.ARR_SCHD_NO);
	public static final MCMeta arr_pr_no_META = createCommonMeta($arr_pr_no, mcframe.commonMA.meta.MA_META.ARR_PR_NO);
	public static final MCMeta prms_rcpt_d_no_META = createCommonMeta($prms_rcpt_d_no, mcframe.commonMA.meta.MA_META.PRMS_RCPT_D_NO);
	public static final MCMeta dlv_inst_d_no_META = createCommonMeta($dlv_inst_d_no, mcframe.commonMA.meta.MA_META.DLV_INST_D_NO);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta pr_sts_typ_META = createCommonMeta($pr_sts_typ, mcframe.commonMS.meta.MS_META.PR_STS_TYP);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_mng_no_META = createCommonMeta($dlv_slip_mng_no, mcframe.commonMS.meta.MS_META.DLV_SLIP_MNG_NO);
	public static final MCMeta dlv_slip_mng_seq_META = createCommonMeta($dlv_slip_mng_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dlv_slip_mng_d_no_META = createCommonMeta($dlv_slip_mng_d_no, mcframe.commonMS.meta.MS_META.DLV_SLIP_MNG_D_NO);
	public static final MCMeta dlv_slip_mng_d_seq_META = createCommonMeta($dlv_slip_mng_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta arr_ptn_typ_META = createCommonMeta($arr_ptn_typ, mcframe.commonMA.meta.MA_META.ARR_PTN_TYP);
	public static final MCMeta arr_schd_tm_META = createCommonMeta($arr_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta rcpt_iv_itm_nm_META = createCommonMeta($rcpt_iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_id_typ_META = createCommonMeta($purc_id_typ, mcframe.commonMA.meta.MA_META.PURC_ID_TYP);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ret_loc_cd_META = createCommonMeta($ret_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta ret_str_ln_cd_META = createCommonMeta($ret_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta ret_gd_cd_META = createCommonMeta($ret_gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta arr_loc_cd_META = createCommonMeta($arr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta arr_qty_META = createCommonMeta($arr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_qty_META = createCommonMeta($purc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_ret_qty_META = createCommonMeta($sls_ret_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta abort_qty_META = createCommonMeta($abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_ret_schd_abort_qty_META = createCommonMeta($sls_ret_schd_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_ret_schd_abort_flg_META = createCommonMeta($sls_ret_schd_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sync_flg_META = createCommonMeta($sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cmpl_flg_META = createCommonMeta($cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_ret_schd_cmpl_flg_META = createCommonMeta($sls_ret_schd_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_split_flg_META = createCommonMeta($arr_split_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_skip_flg_META = createCommonMeta($arr_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_arr_schd_flg_META = createCommonMeta($re_arr_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta pre_outsrc_act_flg_META = createCommonMeta($pre_outsrc_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pre_mfg_act_no_META = createCommonMeta($pre_mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta wms_flg_META = createCommonMeta($wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.ARR_SCHD_INTR_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta arr_cnt_rmrks_META = createCommonMeta($arr_cnt_rmrks, mcframe.commonMS.meta.MS_META.ARR_CNT_RMRKS);
	public static final MCMeta dlv_slip_d_rmrks_META = createCommonMeta($dlv_slip_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.ARR_SCHD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.ARR_SCHD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.ARR_SCHD_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_ARR_SCHD_R> constMetas = new ConstMetaList<MST_ARR_SCHD_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			arr_schd_no_META,
			arr_pr_no_META,
			prms_rcpt_d_no_META,
			dlv_inst_d_no_META,
			purc_act_d_no_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			pr_sts_typ_META,
			wg_cd_META,
			dlv_slip_no_META,
			dlv_slip_mng_no_META,
			dlv_slip_mng_seq_META,
			dlv_slip_mng_d_no_META,
			dlv_slip_mng_d_seq_META,
			iv_no_META,
			arr_ptn_typ_META,
			arr_schd_tm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			rcpt_iv_itm_nm_META,
			sundry_itm_flg_META,
			purc_id_typ_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			lot_no_META,
			sublot_no_META,
			ver_no_META,
			stk_arrv_bp_cd_META,
			gd_cd_META,
			quality_typ_META,
			stk_insp_typ_META,
			stk_id_typ_META,
			stk_bp_cd_META,
			ret_loc_cd_META,
			ret_str_ln_cd_META,
			ret_gd_cd_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			maker_cd_META,
			bp_lot_no_META,
			lg_grp_cd_META,
			arr_loc_cd_META,
			str_ln_cd_META,
			trd_unit_qty_META,
			trd_unit_cd_META,
			base_unit_qty_META,
			base_unit_cd_META,
			arr_qty_META,
			purc_qty_META,
			sls_ret_qty_META,
			abort_qty_META,
			abort_flg_META,
			sls_ret_schd_abort_qty_META,
			sls_ret_schd_abort_flg_META,
			sync_flg_META,
			cmpl_flg_META,
			sls_ret_schd_cmpl_flg_META,
			arr_split_flg_META,
			arr_skip_flg_META,
			re_arr_schd_flg_META,
			outsrc_flg_META,
			mfg_inst_no_META,
			pre_outsrc_act_flg_META,
			pre_mfg_act_no_META,
			wms_flg_META,
			intr_rmrks_META,
			trd_rmrks_META,
			trd_d_rmrks_META,
			arr_cnt_rmrks_META,
			dlv_slip_d_rmrks_META,
			io_schd_pr_no_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
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
	protected MST_ARR_SCHD_R(ConstMetaList<? extends MST_ARR_SCHD_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_ARR_SCHD_R(ConstMetaList<? extends MST_ARR_SCHD_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$arr_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$arr_schd_no,
				"arr_schd_no",
				arr_schd_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$arr_pr_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$arr_pr_no,
				"arr_pr_no",
				arr_pr_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$prms_rcpt_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$prms_rcpt_d_no,
				"prms_rcpt_d_no",
				prms_rcpt_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$dlv_inst_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$dlv_inst_d_no,
				"dlv_inst_d_no",
				dlv_inst_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$purc_act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$purc_act_d_no,
				"purc_act_d_no",
				purc_act_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$rcpt_iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$rcpt_iv_no,
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
			MST_ARR_SCHD_R.$rcpt_iv_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$rcpt_iv_mng_no,
				"rcpt_iv_mng_no",
				rcpt_iv_mng_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$pr_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$pr_sts_typ,
				"pr_sts_typ",
				pr_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$wg_cd,
				"wg_cd",
				wg_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$dlv_slip_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$dlv_slip_no,
				"dlv_slip_no",
				dlv_slip_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$dlv_slip_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$dlv_slip_mng_no,
				"dlv_slip_mng_no",
				dlv_slip_mng_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$dlv_slip_mng_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_SCHD_R.$dlv_slip_mng_seq,
				"dlv_slip_mng_seq",
				dlv_slip_mng_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$dlv_slip_mng_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$dlv_slip_mng_d_no,
				"dlv_slip_mng_d_no",
				dlv_slip_mng_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$dlv_slip_mng_d_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_SCHD_R.$dlv_slip_mng_d_seq,
				"dlv_slip_mng_d_seq",
				dlv_slip_mng_d_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$iv_no,
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
			MST_ARR_SCHD_R.$arr_ptn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$arr_ptn_typ,
				"arr_ptn_typ",
				arr_ptn_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$arr_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ARR_SCHD_R.$arr_schd_tm,
				"arr_schd_tm",
				arr_schd_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$itm_cd,
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
			MST_ARR_SCHD_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$itm_sub1,
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
			MST_ARR_SCHD_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$itm_sub2,
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
			MST_ARR_SCHD_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$itm_sub3,
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
			MST_ARR_SCHD_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$itm_nm,
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
			MST_ARR_SCHD_R.$rcpt_iv_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$rcpt_iv_itm_nm,
				"rcpt_iv_itm_nm",
				rcpt_iv_itm_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$sundry_itm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_SCHD_R.$sundry_itm_flg,
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
			MST_ARR_SCHD_R.$purc_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$purc_id_typ,
				"purc_id_typ",
				purc_id_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$sno1,
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
			MST_ARR_SCHD_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$sno2,
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
			MST_ARR_SCHD_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$sno3,
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
			MST_ARR_SCHD_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$sno4,
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
			MST_ARR_SCHD_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$lot_no,
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
			MST_ARR_SCHD_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$sublot_no,
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
			MST_ARR_SCHD_R.$ver_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$ver_no,
				"ver_no",
				ver_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$stk_arrv_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$stk_arrv_bp_cd,
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
			MST_ARR_SCHD_R.$gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$gd_cd,
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
			MST_ARR_SCHD_R.$quality_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$quality_typ,
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
			MST_ARR_SCHD_R.$stk_insp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$stk_insp_typ,
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
			MST_ARR_SCHD_R.$stk_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$stk_id_typ,
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
			MST_ARR_SCHD_R.$stk_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$stk_bp_cd,
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
			MST_ARR_SCHD_R.$ret_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$ret_loc_cd,
				"ret_loc_cd",
				ret_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$ret_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$ret_str_ln_cd,
				"ret_str_ln_cd",
				ret_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$ret_gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$ret_gd_cd,
				"ret_gd_cd",
				ret_gd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$sppl_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$sppl_itm_cd,
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
			MST_ARR_SCHD_R.$sppl_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$sppl_itm_nm,
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
			MST_ARR_SCHD_R.$maker_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$maker_cd,
				"maker_cd",
				maker_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$bp_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$bp_lot_no,
				"bp_lot_no",
				bp_lot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$lg_grp_cd,
				"lg_grp_cd",
				lg_grp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$arr_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$arr_loc_cd,
				"arr_loc_cd",
				arr_loc_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$str_ln_cd,
				"str_ln_cd",
				str_ln_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$trd_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_SCHD_R.$trd_unit_qty,
				"trd_unit_qty",
				trd_unit_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$trd_unit_cd,
				"trd_unit_cd",
				trd_unit_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$base_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_SCHD_R.$base_unit_qty,
				"base_unit_qty",
				base_unit_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$base_unit_cd,
				"base_unit_cd",
				base_unit_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$arr_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_SCHD_R.$arr_qty,
				"arr_qty",
				arr_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$purc_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_SCHD_R.$purc_qty,
				"purc_qty",
				purc_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$sls_ret_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_SCHD_R.$sls_ret_qty,
				"sls_ret_qty",
				sls_ret_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$abort_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_SCHD_R.$abort_qty,
				"abort_qty",
				abort_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$abort_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_SCHD_R.$abort_flg,
				"abort_flg",
				abort_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$sls_ret_schd_abort_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_SCHD_R.$sls_ret_schd_abort_qty,
				"sls_ret_schd_abort_qty",
				sls_ret_schd_abort_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$sls_ret_schd_abort_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_SCHD_R.$sls_ret_schd_abort_flg,
				"sls_ret_schd_abort_flg",
				sls_ret_schd_abort_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$sync_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_SCHD_R.$sync_flg,
				"sync_flg",
				sync_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$cmpl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_SCHD_R.$cmpl_flg,
				"cmpl_flg",
				cmpl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$sls_ret_schd_cmpl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_SCHD_R.$sls_ret_schd_cmpl_flg,
				"sls_ret_schd_cmpl_flg",
				sls_ret_schd_cmpl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$arr_split_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_SCHD_R.$arr_split_flg,
				"arr_split_flg",
				arr_split_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$arr_skip_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_SCHD_R.$arr_skip_flg,
				"arr_skip_flg",
				arr_skip_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$re_arr_schd_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_SCHD_R.$re_arr_schd_flg,
				"re_arr_schd_flg",
				re_arr_schd_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$outsrc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_SCHD_R.$outsrc_flg,
				"outsrc_flg",
				outsrc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$mfg_inst_no,
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
			MST_ARR_SCHD_R.$pre_outsrc_act_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_SCHD_R.$pre_outsrc_act_flg,
				"pre_outsrc_act_flg",
				pre_outsrc_act_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$pre_mfg_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$pre_mfg_act_no,
				"pre_mfg_act_no",
				pre_mfg_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$wms_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_SCHD_R.$wms_flg,
				"wms_flg",
				wms_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$intr_rmrks,
				"intr_rmrks",
				intr_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$trd_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$trd_rmrks,
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
			MST_ARR_SCHD_R.$trd_d_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$trd_d_rmrks,
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
			MST_ARR_SCHD_R.$arr_cnt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$arr_cnt_rmrks,
				"arr_cnt_rmrks",
				arr_cnt_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$dlv_slip_d_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$dlv_slip_d_rmrks,
				"dlv_slip_d_rmrks",
				dlv_slip_d_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$io_schd_pr_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$io_schd_pr_no,
				"io_schd_pr_no",
				io_schd_pr_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_SCHD_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$sub_char1,
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
			MST_ARR_SCHD_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$sub_char2,
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
			MST_ARR_SCHD_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$sub_char3,
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
			MST_ARR_SCHD_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$ins_usr_id,
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
			MST_ARR_SCHD_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$ins_usr_nm,
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
			MST_ARR_SCHD_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_ARR_SCHD_R.$ins_ts,
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
			MST_ARR_SCHD_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$ins_func_id,
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
			MST_ARR_SCHD_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_SCHD_R.$upd_cntr,
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
			MST_ARR_SCHD_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$upd_usr_id,
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
			MST_ARR_SCHD_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$upd_usr_nm,
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
			MST_ARR_SCHD_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_ARR_SCHD_R.$upd_ts,
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
			MST_ARR_SCHD_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$upd_func_id,
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
			MST_ARR_SCHD_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_SCHD_R.$upd_srv_req_no,
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
	public static MST_ARR_SCHD_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_ARR_SCHD_R create(String alias) {
		MST_ARR_SCHD_R row = new MST_ARR_SCHD_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_ARR_SCHD_R createByName(T proto) {
		MST_ARR_SCHD_R row = MST_ARR_SCHD_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ARR_SCHD_R clone() {
		return (MST_ARR_SCHD_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ARR_SCHD_R createInstance() {
		return (MST_ARR_SCHD_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ARR_SCHD_R getValues(String... names) {
		return (MST_ARR_SCHD_R) super.getValues(names);
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
	 public MSW_ARR_SCHD_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_ARR_SCHD_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_ARR_SCHD_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_ARR_SCHD_KEY_R.TABLE_NAME);
	 }

	/**
	 * 入荷予定ＮＯ. Receipt schedule No..<p>
	 *
	 */
	public String arr_schd_no() {
		return getConstString(offset + 0, $arr_schd_no);
	}

	/**
	 * 入荷予定ＮＯ. Receipt schedule No..<p>
	 *
	 */
	public void arr_schd_no(String value) {
		setConstString(offset + 0, $arr_schd_no, value);
	}

	/**
	 * 入荷進捗ＮＯ. Receipt progress No..<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 1, $arr_pr_no);
	}

	/**
	 * 入荷進捗ＮＯ. Receipt progress No..<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 1, $arr_pr_no, value);
	}

	/**
	 * 納期回答受領明細ＮＯ. Order promising result received details No..<p>
	 *
	 */
	public String prms_rcpt_d_no() {
		return getConstString(offset + 2, $prms_rcpt_d_no);
	}

	/**
	 * 納期回答受領明細ＮＯ. Order promising result received details No..<p>
	 *
	 */
	public void prms_rcpt_d_no(String value) {
		setConstString(offset + 2, $prms_rcpt_d_no, value);
	}

	/**
	 * 納入指示明細ＮＯ. Delivery order details No..<p>
	 *
	 */
	public String dlv_inst_d_no() {
		return getConstString(offset + 3, $dlv_inst_d_no);
	}

	/**
	 * 納入指示明細ＮＯ. Delivery order details No..<p>
	 *
	 */
	public void dlv_inst_d_no(String value) {
		setConstString(offset + 3, $dlv_inst_d_no, value);
	}

	/**
	 * 仕入実績明細ＮＯ. Purchase result details No..<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 4, $purc_act_d_no);
	}

	/**
	 * 仕入実績明細ＮＯ. Purchase result details No..<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 4, $purc_act_d_no, value);
	}

	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 5, $rcpt_iv_no);
	}

	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 5, $rcpt_iv_no, value);
	}

	/**
	 * 受領インボイス管理ＮＯ. Purchase invoice management No..<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 6, $rcpt_iv_mng_no);
	}

	/**
	 * 受領インボイス管理ＮＯ. Purchase invoice management No..<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 6, $rcpt_iv_mng_no, value);
	}

	/**
	 * 進捗状況区分. Progress status type.<p>
	 *
	 */
	public String pr_sts_typ() {
		return getConstString(offset + 7, $pr_sts_typ);
	}

	/**
	 * 進捗状況区分. Progress status type.<p>
	 *
	 */
	public void pr_sts_typ(String value) {
		setConstString(offset + 7, $pr_sts_typ, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 8, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 8, $wg_cd, value);
	}

	/**
	 * 納品書ＮＯ. Delivery note No..<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 9, $dlv_slip_no);
	}

	/**
	 * 納品書ＮＯ. Delivery note No..<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 9, $dlv_slip_no, value);
	}

	/**
	 * 納品書管理ＮＯ. Delivery note management No..<p>
	 *
	 */
	public String dlv_slip_mng_no() {
		return getConstString(offset + 10, $dlv_slip_mng_no);
	}

	/**
	 * 納品書管理ＮＯ. Delivery note management No..<p>
	 *
	 */
	public void dlv_slip_mng_no(String value) {
		setConstString(offset + 10, $dlv_slip_mng_no, value);
	}

	/**
	 * 納品書管理連番. Delivery note management sequence number.<p>
	 *
	 */
	public MCNumber dlv_slip_mng_seq() {
		return getConstNumber(offset + 11, $dlv_slip_mng_seq);
	}

	/**
	 * 納品書管理連番. Delivery note management sequence number.<p>
	 *
	 */
	public void dlv_slip_mng_seq(MCNumber value) {
		setConstNumber(offset + 11, $dlv_slip_mng_seq, value);
	}
	
	/**
	 * 納品書管理連番. Delivery note management sequence number.<p>
	 *
	 */
	public void dlv_slip_mng_seq(int value) {
		setConstNumber(offset + 11, $dlv_slip_mng_seq, value);
	}
	
	/**
	 * 納品書管理連番. Delivery note management sequence number.<p>
	 *
	 */
	public void dlv_slip_mng_seq(long value) {
		setConstNumber(offset + 11, $dlv_slip_mng_seq, value);
	}
	
	/**
	 * 納品書管理連番. Delivery note management sequence number.<p>
	 *
	 */
	public void dlv_slip_mng_seq(float value) {
		setConstNumber(offset + 11, $dlv_slip_mng_seq, value);
	}
	
	/**
	 * 納品書管理連番. Delivery note management sequence number.<p>
	 *
	 */
	public void dlv_slip_mng_seq(double value) {
		setConstNumber(offset + 11, $dlv_slip_mng_seq, value);
	}
	
	/**
	 * 納品書明細管理ＮＯ. Delivery note details management No..<p>
	 *
	 */
	public String dlv_slip_mng_d_no() {
		return getConstString(offset + 12, $dlv_slip_mng_d_no);
	}

	/**
	 * 納品書明細管理ＮＯ. Delivery note details management No..<p>
	 *
	 */
	public void dlv_slip_mng_d_no(String value) {
		setConstString(offset + 12, $dlv_slip_mng_d_no, value);
	}

	/**
	 * 納品書明細管理連番. Delivery note details management sequence number.<p>
	 *
	 */
	public MCNumber dlv_slip_mng_d_seq() {
		return getConstNumber(offset + 13, $dlv_slip_mng_d_seq);
	}

	/**
	 * 納品書明細管理連番. Delivery note details management sequence number.<p>
	 *
	 */
	public void dlv_slip_mng_d_seq(MCNumber value) {
		setConstNumber(offset + 13, $dlv_slip_mng_d_seq, value);
	}
	
	/**
	 * 納品書明細管理連番. Delivery note details management sequence number.<p>
	 *
	 */
	public void dlv_slip_mng_d_seq(int value) {
		setConstNumber(offset + 13, $dlv_slip_mng_d_seq, value);
	}
	
	/**
	 * 納品書明細管理連番. Delivery note details management sequence number.<p>
	 *
	 */
	public void dlv_slip_mng_d_seq(long value) {
		setConstNumber(offset + 13, $dlv_slip_mng_d_seq, value);
	}
	
	/**
	 * 納品書明細管理連番. Delivery note details management sequence number.<p>
	 *
	 */
	public void dlv_slip_mng_d_seq(float value) {
		setConstNumber(offset + 13, $dlv_slip_mng_d_seq, value);
	}
	
	/**
	 * 納品書明細管理連番. Delivery note details management sequence number.<p>
	 *
	 */
	public void dlv_slip_mng_d_seq(double value) {
		setConstNumber(offset + 13, $dlv_slip_mng_d_seq, value);
	}
	
	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 14, $iv_no);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 14, $iv_no, value);
	}

	/**
	 * 入荷パタン区分. Receipt pattern type.<p>
	 *
	 */
	public String arr_ptn_typ() {
		return getConstString(offset + 15, $arr_ptn_typ);
	}

	/**
	 * 入荷パタン区分. Receipt pattern type.<p>
	 *
	 */
	public void arr_ptn_typ(String value) {
		setConstString(offset + 15, $arr_ptn_typ, value);
	}

	/**
	 * 入荷予定日時. Scheduled receipt date and time.<p>
	 *
	 */
	public MCDate arr_schd_tm() {
		return getConstDate(offset + 16, $arr_schd_tm);
	}

	/**
	 * 入荷予定日時. Scheduled receipt date and time.<p>
	 *
	 */
	public void arr_schd_tm(MCDate value) {
		setConstDate(offset + 16, $arr_schd_tm, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 17, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 17, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 18, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 18, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 19, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 19, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 20, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 20, $itm_sub3, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 21, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 21, $itm_nm, value);
	}

	/**
	 * 受領インボイス表記品名. Item name for purchase invoice.<p>
	 *
	 */
	public String rcpt_iv_itm_nm() {
		return getConstString(offset + 22, $rcpt_iv_itm_nm);
	}

	/**
	 * 受領インボイス表記品名. Item name for purchase invoice.<p>
	 *
	 */
	public void rcpt_iv_itm_nm(String value) {
		setConstString(offset + 22, $rcpt_iv_itm_nm, value);
	}

	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 23, $sundry_itm_flg);
	}

	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 23, $sundry_itm_flg, value);
	}

	/**
	 * 購買識別区分. Purchase identification type.<p>
	 *
	 */
	public String purc_id_typ() {
		return getConstString(offset + 24, $purc_id_typ);
	}

	/**
	 * 購買識別区分. Purchase identification type.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		setConstString(offset + 24, $purc_id_typ, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 25, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 25, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 26, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 26, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 27, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 27, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 28, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 28, $sno4, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 29, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 29, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 30, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 30, $sublot_no, value);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 31, $ver_no);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 31, $ver_no, value);
	}

	/**
	 * 在庫着荷先ＣＤ. Inventory arriving point cd..<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 32, $stk_arrv_bp_cd);
	}

	/**
	 * 在庫着荷先ＣＤ. Inventory arriving point cd..<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 32, $stk_arrv_bp_cd, value);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 33, $gd_cd);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 33, $gd_cd, value);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 34, $quality_typ);
	}

	/**
	 * 良品区分. Conforming type.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 34, $quality_typ, value);
	}

	/**
	 * 在庫検査区分. Inventory inspection type.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 35, $stk_insp_typ);
	}

	/**
	 * 在庫検査区分. Inventory inspection type.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 35, $stk_insp_typ, value);
	}

	/**
	 * 在庫識別区分. Inventory identification type.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 36, $stk_id_typ);
	}

	/**
	 * 在庫識別区分. Inventory identification type.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 36, $stk_id_typ, value);
	}

	/**
	 * 在庫取引先ＣＤ. Inventory BP cd..<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 37, $stk_bp_cd);
	}

	/**
	 * 在庫取引先ＣＤ. Inventory BP cd..<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 37, $stk_bp_cd, value);
	}

	/**
	 * 返品元場所ＣＤ. Return-from location cd..<p>
	 *
	 */
	public String ret_loc_cd() {
		return getConstString(offset + 38, $ret_loc_cd);
	}

	/**
	 * 返品元場所ＣＤ. Return-from location cd..<p>
	 *
	 */
	public void ret_loc_cd(String value) {
		setConstString(offset + 38, $ret_loc_cd, value);
	}

	/**
	 * 返品元棚・ラインＣＤ. Return-from rack/line cd..<p>
	 *
	 */
	public String ret_str_ln_cd() {
		return getConstString(offset + 39, $ret_str_ln_cd);
	}

	/**
	 * 返品元棚・ラインＣＤ. Return-from rack/line cd..<p>
	 *
	 */
	public void ret_str_ln_cd(String value) {
		setConstString(offset + 39, $ret_str_ln_cd, value);
	}

	/**
	 * 返品元格付ＣＤ. Return-from grading cd..<p>
	 *
	 */
	public String ret_gd_cd() {
		return getConstString(offset + 40, $ret_gd_cd);
	}

	/**
	 * 返品元格付ＣＤ. Return-from grading cd..<p>
	 *
	 */
	public void ret_gd_cd(String value) {
		setConstString(offset + 40, $ret_gd_cd, value);
	}

	/**
	 * 発注先品目ＣＤ. Supplier item cd..<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 41, $sppl_itm_cd);
	}

	/**
	 * 発注先品目ＣＤ. Supplier item cd..<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 41, $sppl_itm_cd, value);
	}

	/**
	 * 発注先品名. Supplier item name.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 42, $sppl_itm_nm);
	}

	/**
	 * 発注先品名. Supplier item name.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 42, $sppl_itm_nm, value);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 43, $maker_cd);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 43, $maker_cd, value);
	}

	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 44, $bp_lot_no);
	}

	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 44, $bp_lot_no, value);
	}

	/**
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 45, $lg_grp_cd);
	}

	/**
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 45, $lg_grp_cd, value);
	}

	/**
	 * 入荷場所ＣＤ. Receipt location cd..<p>
	 *
	 */
	public String arr_loc_cd() {
		return getConstString(offset + 46, $arr_loc_cd);
	}

	/**
	 * 入荷場所ＣＤ. Receipt location cd..<p>
	 *
	 */
	public void arr_loc_cd(String value) {
		setConstString(offset + 46, $arr_loc_cd, value);
	}

	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 47, $str_ln_cd);
	}

	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 47, $str_ln_cd, value);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 48, $trd_unit_qty);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 48, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 48, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 48, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 48, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 48, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 49, $trd_unit_cd);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 49, $trd_unit_cd, value);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 50, $base_unit_qty);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 50, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 50, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 50, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 50, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 50, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 51, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 51, $base_unit_cd, value);
	}

	/**
	 * 入荷数量. Receipt qty..<p>
	 *
	 */
	public MCNumber arr_qty() {
		return getConstNumber(offset + 52, $arr_qty);
	}

	/**
	 * 入荷数量. Receipt qty..<p>
	 *
	 */
	public void arr_qty(MCNumber value) {
		setConstNumber(offset + 52, $arr_qty, value);
	}
	
	/**
	 * 入荷数量. Receipt qty..<p>
	 *
	 */
	public void arr_qty(int value) {
		setConstNumber(offset + 52, $arr_qty, value);
	}
	
	/**
	 * 入荷数量. Receipt qty..<p>
	 *
	 */
	public void arr_qty(long value) {
		setConstNumber(offset + 52, $arr_qty, value);
	}
	
	/**
	 * 入荷数量. Receipt qty..<p>
	 *
	 */
	public void arr_qty(float value) {
		setConstNumber(offset + 52, $arr_qty, value);
	}
	
	/**
	 * 入荷数量. Receipt qty..<p>
	 *
	 */
	public void arr_qty(double value) {
		setConstNumber(offset + 52, $arr_qty, value);
	}
	
	/**
	 * 仕入数量. Purchase qty..<p>
	 *
	 */
	public MCNumber purc_qty() {
		return getConstNumber(offset + 53, $purc_qty);
	}

	/**
	 * 仕入数量. Purchase qty..<p>
	 *
	 */
	public void purc_qty(MCNumber value) {
		setConstNumber(offset + 53, $purc_qty, value);
	}
	
	/**
	 * 仕入数量. Purchase qty..<p>
	 *
	 */
	public void purc_qty(int value) {
		setConstNumber(offset + 53, $purc_qty, value);
	}
	
	/**
	 * 仕入数量. Purchase qty..<p>
	 *
	 */
	public void purc_qty(long value) {
		setConstNumber(offset + 53, $purc_qty, value);
	}
	
	/**
	 * 仕入数量. Purchase qty..<p>
	 *
	 */
	public void purc_qty(float value) {
		setConstNumber(offset + 53, $purc_qty, value);
	}
	
	/**
	 * 仕入数量. Purchase qty..<p>
	 *
	 */
	public void purc_qty(double value) {
		setConstNumber(offset + 53, $purc_qty, value);
	}
	
	/**
	 * 売上返品数量. Sales return qty..<p>
	 *
	 */
	public MCNumber sls_ret_qty() {
		return getConstNumber(offset + 54, $sls_ret_qty);
	}

	/**
	 * 売上返品数量. Sales return qty..<p>
	 *
	 */
	public void sls_ret_qty(MCNumber value) {
		setConstNumber(offset + 54, $sls_ret_qty, value);
	}
	
	/**
	 * 売上返品数量. Sales return qty..<p>
	 *
	 */
	public void sls_ret_qty(int value) {
		setConstNumber(offset + 54, $sls_ret_qty, value);
	}
	
	/**
	 * 売上返品数量. Sales return qty..<p>
	 *
	 */
	public void sls_ret_qty(long value) {
		setConstNumber(offset + 54, $sls_ret_qty, value);
	}
	
	/**
	 * 売上返品数量. Sales return qty..<p>
	 *
	 */
	public void sls_ret_qty(float value) {
		setConstNumber(offset + 54, $sls_ret_qty, value);
	}
	
	/**
	 * 売上返品数量. Sales return qty..<p>
	 *
	 */
	public void sls_ret_qty(double value) {
		setConstNumber(offset + 54, $sls_ret_qty, value);
	}
	
	/**
	 * 打切数量. Cancelled remaining qty..<p>
	 *
	 */
	public MCNumber abort_qty() {
		return getConstNumber(offset + 55, $abort_qty);
	}

	/**
	 * 打切数量. Cancelled remaining qty..<p>
	 *
	 */
	public void abort_qty(MCNumber value) {
		setConstNumber(offset + 55, $abort_qty, value);
	}
	
	/**
	 * 打切数量. Cancelled remaining qty..<p>
	 *
	 */
	public void abort_qty(int value) {
		setConstNumber(offset + 55, $abort_qty, value);
	}
	
	/**
	 * 打切数量. Cancelled remaining qty..<p>
	 *
	 */
	public void abort_qty(long value) {
		setConstNumber(offset + 55, $abort_qty, value);
	}
	
	/**
	 * 打切数量. Cancelled remaining qty..<p>
	 *
	 */
	public void abort_qty(float value) {
		setConstNumber(offset + 55, $abort_qty, value);
	}
	
	/**
	 * 打切数量. Cancelled remaining qty..<p>
	 *
	 */
	public void abort_qty(double value) {
		setConstNumber(offset + 55, $abort_qty, value);
	}
	
	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 56, $abort_flg);
	}

	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 56, $abort_flg, value);
	}

	/**
	 * 売上返品予定打切数量. Cancelled remaining sales return schedule qty..<p>
	 *
	 */
	public MCNumber sls_ret_schd_abort_qty() {
		return getConstNumber(offset + 57, $sls_ret_schd_abort_qty);
	}

	/**
	 * 売上返品予定打切数量. Cancelled remaining sales return schedule qty..<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(MCNumber value) {
		setConstNumber(offset + 57, $sls_ret_schd_abort_qty, value);
	}
	
	/**
	 * 売上返品予定打切数量. Cancelled remaining sales return schedule qty..<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(int value) {
		setConstNumber(offset + 57, $sls_ret_schd_abort_qty, value);
	}
	
	/**
	 * 売上返品予定打切数量. Cancelled remaining sales return schedule qty..<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(long value) {
		setConstNumber(offset + 57, $sls_ret_schd_abort_qty, value);
	}
	
	/**
	 * 売上返品予定打切数量. Cancelled remaining sales return schedule qty..<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(float value) {
		setConstNumber(offset + 57, $sls_ret_schd_abort_qty, value);
	}
	
	/**
	 * 売上返品予定打切数量. Cancelled remaining sales return schedule qty..<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(double value) {
		setConstNumber(offset + 57, $sls_ret_schd_abort_qty, value);
	}
	
	/**
	 * 売上返品予定打切ＦＬＧ. Cancel remaining sales return schedule flg..<p>
	 *
	 */
	public boolean sls_ret_schd_abort_flg() {
		return getConstBoolean(offset + 58, $sls_ret_schd_abort_flg);
	}

	/**
	 * 売上返品予定打切ＦＬＧ. Cancel remaining sales return schedule flg..<p>
	 *
	 */
	public void sls_ret_schd_abort_flg(boolean value) {
		setConstBoolean(offset + 58, $sls_ret_schd_abort_flg, value);
	}

	/**
	 * 同時計上ＦＬＧ. Simultaneous recording flg..<p>
	 *
	 */
	public boolean sync_flg() {
		return getConstBoolean(offset + 59, $sync_flg);
	}

	/**
	 * 同時計上ＦＬＧ. Simultaneous recording flg..<p>
	 *
	 */
	public void sync_flg(boolean value) {
		setConstBoolean(offset + 59, $sync_flg, value);
	}

	/**
	 * 完了ＦＬＧ. Completed flg..<p>
	 *
	 */
	public boolean cmpl_flg() {
		return getConstBoolean(offset + 60, $cmpl_flg);
	}

	/**
	 * 完了ＦＬＧ. Completed flg..<p>
	 *
	 */
	public void cmpl_flg(boolean value) {
		setConstBoolean(offset + 60, $cmpl_flg, value);
	}

	/**
	 * 売上返品予定完了ＦＬＧ. Sales return schedule completion flg..<p>
	 *
	 */
	public boolean sls_ret_schd_cmpl_flg() {
		return getConstBoolean(offset + 61, $sls_ret_schd_cmpl_flg);
	}

	/**
	 * 売上返品予定完了ＦＬＧ. Sales return schedule completion flg..<p>
	 *
	 */
	public void sls_ret_schd_cmpl_flg(boolean value) {
		setConstBoolean(offset + 61, $sls_ret_schd_cmpl_flg, value);
	}

	/**
	 * 入荷実績分割ＦＬＧ. Receipt result split flg..<p>
	 *
	 */
	public boolean arr_split_flg() {
		return getConstBoolean(offset + 62, $arr_split_flg);
	}

	/**
	 * 入荷実績分割ＦＬＧ. Receipt result split flg..<p>
	 *
	 */
	public void arr_split_flg(boolean value) {
		setConstBoolean(offset + 62, $arr_split_flg, value);
	}

	/**
	 * 入荷不要ＦＬＧ. Not receipt flg..<p>
	 *
	 */
	public boolean arr_skip_flg() {
		return getConstBoolean(offset + 63, $arr_skip_flg);
	}

	/**
	 * 入荷不要ＦＬＧ. Not receipt flg..<p>
	 *
	 */
	public void arr_skip_flg(boolean value) {
		setConstBoolean(offset + 63, $arr_skip_flg, value);
	}

	/**
	 * 再入荷予定ＦＬＧ. Scheduled re-receipt flg..<p>
	 *
	 */
	public boolean re_arr_schd_flg() {
		return getConstBoolean(offset + 64, $re_arr_schd_flg);
	}

	/**
	 * 再入荷予定ＦＬＧ. Scheduled re-receipt flg..<p>
	 *
	 */
	public void re_arr_schd_flg(boolean value) {
		setConstBoolean(offset + 64, $re_arr_schd_flg, value);
	}

	/**
	 * 外注ＦＬＧ. Subcontracting flg..<p>
	 *
	 */
	public boolean outsrc_flg() {
		return getConstBoolean(offset + 65, $outsrc_flg);
	}

	/**
	 * 外注ＦＬＧ. Subcontracting flg..<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		setConstBoolean(offset + 65, $outsrc_flg, value);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 66, $mfg_inst_no);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 66, $mfg_inst_no, value);
	}

	/**
	 * 外注実績先行ＦＬＧ. Subcontracting result prior flg..<p>
	 *
	 */
	public boolean pre_outsrc_act_flg() {
		return getConstBoolean(offset + 67, $pre_outsrc_act_flg);
	}

	/**
	 * 外注実績先行ＦＬＧ. Subcontracting result prior flg..<p>
	 *
	 */
	public void pre_outsrc_act_flg(boolean value) {
		setConstBoolean(offset + 67, $pre_outsrc_act_flg, value);
	}

	/**
	 * 先行製造実績ＮＯ. Prior mfg. result No..<p>
	 *
	 */
	public String pre_mfg_act_no() {
		return getConstString(offset + 68, $pre_mfg_act_no);
	}

	/**
	 * 先行製造実績ＮＯ. Prior mfg. result No..<p>
	 *
	 */
	public void pre_mfg_act_no(String value) {
		setConstString(offset + 68, $pre_mfg_act_no, value);
	}

	/**
	 * ＷＭＳＦＬＧ. WMS flg..<p>
	 *
	 */
	public boolean wms_flg() {
		return getConstBoolean(offset + 69, $wms_flg);
	}

	/**
	 * ＷＭＳＦＬＧ. WMS flg..<p>
	 *
	 */
	public void wms_flg(boolean value) {
		setConstBoolean(offset + 69, $wms_flg, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 70, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 70, $intr_rmrks, value);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 71, $trd_rmrks);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 71, $trd_rmrks, value);
	}

	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 72, $trd_d_rmrks);
	}

	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 72, $trd_d_rmrks, value);
	}

	/**
	 * 入荷連絡備考. Receipt contact remarks.<p>
	 *
	 */
	public String arr_cnt_rmrks() {
		return getConstString(offset + 73, $arr_cnt_rmrks);
	}

	/**
	 * 入荷連絡備考. Receipt contact remarks.<p>
	 *
	 */
	public void arr_cnt_rmrks(String value) {
		setConstString(offset + 73, $arr_cnt_rmrks, value);
	}

	/**
	 * 納品書明細備考. Delivery note details remarks.<p>
	 *
	 */
	public String dlv_slip_d_rmrks() {
		return getConstString(offset + 74, $dlv_slip_d_rmrks);
	}

	/**
	 * 納品書明細備考. Delivery note details remarks.<p>
	 *
	 */
	public void dlv_slip_d_rmrks(String value) {
		setConstString(offset + 74, $dlv_slip_d_rmrks, value);
	}

	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 75, $io_schd_pr_no);
	}

	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 75, $io_schd_pr_no, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 76, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 76, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 77, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 77, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 78, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 78, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 79, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 79, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 80, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 80, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 81, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 81, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 82, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 82, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 83, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 83, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 83, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 83, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 83, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 83, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 84, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 84, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 85, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 85, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 86, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 86, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 87, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 87, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 88, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 88, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($prms_rcpt_d_no.equalsIgnoreCase(name)) {
			return prms_rcpt_d_no();
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			return dlv_inst_d_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			return dlv_slip_mng_no();
		}
		if ($dlv_slip_mng_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_mng_d_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			return arr_ptn_typ();
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
		if ($rcpt_iv_itm_nm.equalsIgnoreCase(name)) {
			return rcpt_iv_itm_nm();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
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
		if ($ret_loc_cd.equalsIgnoreCase(name)) {
			return ret_loc_cd();
		}
		if ($ret_str_ln_cd.equalsIgnoreCase(name)) {
			return ret_str_ln_cd();
		}
		if ($ret_gd_cd.equalsIgnoreCase(name)) {
			return ret_gd_cd();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($arr_loc_cd.equalsIgnoreCase(name)) {
			return arr_loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($pre_mfg_act_no.equalsIgnoreCase(name)) {
			return pre_mfg_act_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_slip_d_rmrks();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
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
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			return dlv_slip_mng_seq();
		}
		if ($dlv_slip_mng_d_seq.equalsIgnoreCase(name)) {
			return dlv_slip_mng_d_seq();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			return arr_qty();
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			return purc_qty();
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			return sls_ret_qty();
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			return abort_qty();
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			return sls_ret_schd_abort_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($arr_schd_tm.equalsIgnoreCase(name)) {
			return arr_schd_tm();
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($sls_ret_schd_abort_flg.equalsIgnoreCase(name)) {
			return sls_ret_schd_abort_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		if ($sls_ret_schd_cmpl_flg.equalsIgnoreCase(name)) {
			return sls_ret_schd_cmpl_flg();
		}
		if ($arr_split_flg.equalsIgnoreCase(name)) {
			return arr_split_flg();
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			return arr_skip_flg();
		}
		if ($re_arr_schd_flg.equalsIgnoreCase(name)) {
			return re_arr_schd_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			return pre_outsrc_act_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($prms_rcpt_d_no.equalsIgnoreCase(name)) {
			return prms_rcpt_d_no();
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			return dlv_inst_d_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			return dlv_slip_mng_no();
		}
		if ($dlv_slip_mng_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_mng_d_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			return arr_ptn_typ();
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
		if ($rcpt_iv_itm_nm.equalsIgnoreCase(name)) {
			return rcpt_iv_itm_nm();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
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
		if ($ret_loc_cd.equalsIgnoreCase(name)) {
			return ret_loc_cd();
		}
		if ($ret_str_ln_cd.equalsIgnoreCase(name)) {
			return ret_str_ln_cd();
		}
		if ($ret_gd_cd.equalsIgnoreCase(name)) {
			return ret_gd_cd();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($arr_loc_cd.equalsIgnoreCase(name)) {
			return arr_loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($pre_mfg_act_no.equalsIgnoreCase(name)) {
			return pre_mfg_act_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_slip_d_rmrks();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
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
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			return dlv_slip_mng_seq();
		}
		if ($dlv_slip_mng_d_seq.equalsIgnoreCase(name)) {
			return dlv_slip_mng_d_seq();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			return arr_qty();
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			return purc_qty();
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			return sls_ret_qty();
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			return abort_qty();
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			return sls_ret_schd_abort_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($arr_schd_tm.equalsIgnoreCase(name)) {
			return arr_schd_tm();
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($sls_ret_schd_abort_flg.equalsIgnoreCase(name)) {
			return sls_ret_schd_abort_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		if ($sls_ret_schd_cmpl_flg.equalsIgnoreCase(name)) {
			return sls_ret_schd_cmpl_flg();
		}
		if ($arr_split_flg.equalsIgnoreCase(name)) {
			return arr_split_flg();
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			return arr_skip_flg();
		}
		if ($re_arr_schd_flg.equalsIgnoreCase(name)) {
			return re_arr_schd_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			return pre_outsrc_act_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($prms_rcpt_d_no.equalsIgnoreCase(name)) {
			prms_rcpt_d_no(value);
			return;
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			dlv_inst_d_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			dlv_slip_mng_no(value);
			return;
		}
		if ($dlv_slip_mng_d_no.equalsIgnoreCase(name)) {
			dlv_slip_mng_d_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			arr_ptn_typ(value);
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
		if ($rcpt_iv_itm_nm.equalsIgnoreCase(name)) {
			rcpt_iv_itm_nm(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
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
		if ($ret_loc_cd.equalsIgnoreCase(name)) {
			ret_loc_cd(value);
			return;
		}
		if ($ret_str_ln_cd.equalsIgnoreCase(name)) {
			ret_str_ln_cd(value);
			return;
		}
		if ($ret_gd_cd.equalsIgnoreCase(name)) {
			ret_gd_cd(value);
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
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($arr_loc_cd.equalsIgnoreCase(name)) {
			arr_loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($pre_mfg_act_no.equalsIgnoreCase(name)) {
			pre_mfg_act_no(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
			return;
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			dlv_slip_d_rmrks(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
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
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_mng_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_d_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_mng_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_d_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_mng_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_d_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_mng_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_d_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_mng_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_d_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($arr_schd_tm.equalsIgnoreCase(name)) {
			arr_schd_tm(value);
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($sls_ret_schd_abort_flg.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		if ($sls_ret_schd_cmpl_flg.equalsIgnoreCase(name)) {
			sls_ret_schd_cmpl_flg(value);
			return;
		}
		if ($arr_split_flg.equalsIgnoreCase(name)) {
			arr_split_flg(value);
			return;
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			arr_skip_flg(value);
			return;
		}
		if ($re_arr_schd_flg.equalsIgnoreCase(name)) {
			re_arr_schd_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			pre_outsrc_act_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($prms_rcpt_d_no.equalsIgnoreCase(name)) {
			prms_rcpt_d_no(value);
			return;
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			dlv_inst_d_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			dlv_slip_mng_no(value);
			return;
		}
		if ($dlv_slip_mng_d_no.equalsIgnoreCase(name)) {
			dlv_slip_mng_d_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			arr_ptn_typ(value);
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
		if ($rcpt_iv_itm_nm.equalsIgnoreCase(name)) {
			rcpt_iv_itm_nm(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
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
		if ($ret_loc_cd.equalsIgnoreCase(name)) {
			ret_loc_cd(value);
			return;
		}
		if ($ret_str_ln_cd.equalsIgnoreCase(name)) {
			ret_str_ln_cd(value);
			return;
		}
		if ($ret_gd_cd.equalsIgnoreCase(name)) {
			ret_gd_cd(value);
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
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($arr_loc_cd.equalsIgnoreCase(name)) {
			arr_loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($pre_mfg_act_no.equalsIgnoreCase(name)) {
			pre_mfg_act_no(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
			return;
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			dlv_slip_d_rmrks(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
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
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_mng_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_d_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_mng_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_d_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_mng_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_d_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_mng_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_d_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($dlv_slip_mng_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_d_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($arr_schd_tm.equalsIgnoreCase(name)) {
			arr_schd_tm(value);
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($sls_ret_schd_abort_flg.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		if ($sls_ret_schd_cmpl_flg.equalsIgnoreCase(name)) {
			sls_ret_schd_cmpl_flg(value);
			return;
		}
		if ($arr_split_flg.equalsIgnoreCase(name)) {
			arr_split_flg(value);
			return;
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			arr_skip_flg(value);
			return;
		}
		if ($re_arr_schd_flg.equalsIgnoreCase(name)) {
			re_arr_schd_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			pre_outsrc_act_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
