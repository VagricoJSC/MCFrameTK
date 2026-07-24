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
 * "入荷進捗 // Receipt progress"DBコンテナRowクラスです。<p>
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
 *  	<td>arr_pr_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷進捗ＮＯ</td>
 *  	<td>Receipt progress No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cd</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引ＣＤ</td>
 *  	<td>Transaction cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_ptn_typ</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引パタン区分</td>
 *  	<td>Transaction pattern type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>po_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注明細ＮＯ</td>
 *  	<td>PO details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_ret_schd_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上返品予定明細ＮＯ</td>
 *  	<td>Sales return schedule details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_slip_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品書明細ＮＯ</td>
 *  	<td>Delivery note details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>iv_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>インボイス明細ＮＯ</td>
 *  	<td>Invoice details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqst_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼元部門ＣＤ</td>
 *  	<td>Requesting dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqst_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼元ワーキンググループＣＤ</td>
 *  	<td>Requesting WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqst_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼元担当者ＣＤ</td>
 *  	<td>Requesting PIC cd.</td>
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
 *  	<td>sret_fr_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>引取先ＣＤ</td>
 *  	<td>Pickup company cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先ＣＤ</td>
 *  	<td>Supplier cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ret_dlv_slip_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品元納品書明細ＮＯ</td>
 *  	<td>Return-from delivery note details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ret_stk_arrv_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品元在庫着荷先ＣＤ</td>
 *  	<td>Return-from inventory arrival destination cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_rqst_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入希望日時</td>
 *  	<td>Desired delivery date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prms_rcpt_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納期回答受領日</td>
 *  	<td>Order promising result received date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prms_dlv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>回答納入日</td>
 *  	<td>Replied delivery date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prms_refl_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納期回答反映日</td>
 *  	<td>Order promising applied date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_inst_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入指示日</td>
 *  	<td>Delivery order date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_inst_prms_rcpt_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入指示回答受領日</td>
 *  	<td>Delivery order replied received date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_inst_prms_refl_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入指示回答反映日</td>
 *  	<td>Delivery order reply applied date</td>
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
 *  	<td>arr_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入荷日時</td>
 *  	<td>Receipt date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入日</td>
 *  	<td>Purchase date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引単位数量</td>
 *  	<td>Transaction unit qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引単位ＣＤ</td>
 *  	<td>Transaction unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pack_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>荷姿単位数量</td>
 *  	<td>SKU qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pack_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>荷姿単位ＣＤ</td>
 *  	<td>SKU cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位数量</td>
 *  	<td>Base unit qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位ＣＤ</td>
 *  	<td>Base unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prms_rcpt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納期回答受領数量</td>
 *  	<td>Order promising result received qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prms_refl_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納期回答反映済数量</td>
 *  	<td>Order promising applied qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_inst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入指示数量</td>
 *  	<td>Delivery order qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_inst_prms_rcpt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入指示回答受領数量</td>
 *  	<td>Delivery order replied received qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_inst_prms_refl_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入指示回答反映済数量</td>
 *  	<td>Delivery order reply applied qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>re_arr_schd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>再入荷予定数量</td>
 *  	<td>Scheduled re-receipt qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcpt_iv_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受領インボイス数量</td>
 *  	<td>Purchase invoice qty.</td>
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
 *  	<td>abort_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>打切ＦＬＧ</td>
 *  	<td>Cancel remaining flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>arr_schd_abort_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷予定打切数量</td>
 *  	<td>Cancelled remaining receipt schedule qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_schd_abort_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入予定打切数量</td>
 *  	<td>Cancelled remaining purchase schedule qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_ret_schd_abort_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上返品予定打切数量</td>
 *  	<td>Cancelled remaining sales return schedule qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>accpt_dfct_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検収不良数量</td>
 *  	<td>Acceptance defective qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_purc_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準納入ＬＴ</td>
 *  	<td>Standard delivery LT</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_purc_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入ＬＴ</td>
 *  	<td>Delivery LT</td>
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
 *  	<td>purc_ddlv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入直送ＦＬＧ</td>
 *  	<td>Direct delivery flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購買状況区分</td>
 *  	<td>Purchase status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prms_dlv_dt_overdue_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>回答納入日遅れＦＬＧ</td>
 *  	<td>Replied delivery date delay flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_rqst_dt_overdue_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入希望日遅れＦＬＧ</td>
 *  	<td>Delivery dates delayed flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>arr_schd_split_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷予定分割ＦＬＧ</td>
 *  	<td>Scheduled receipt split flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>arr_schd_refl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷予定反映済ＦＬＧ</td>
 *  	<td>Receipt schedule applied flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>arr_cmpl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷完了ＦＬＧ</td>
 *  	<td>Receipt completed flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_cmpl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入完了ＦＬＧ</td>
 *  	<td>Purchase completion flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_ret_cmpl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上返品完了ＦＬＧ</td>
 *  	<td>Sales return completion flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>arr_cnt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入荷連絡備考</td>
 *  	<td>Receipt contact remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備１</td>
 *  	<td>Spare 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備２</td>
 *  	<td>Spare 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備３</td>
 *  	<td>Spare 3</td>
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
public class MST_ARR_PR_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_ARR_PR";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 入荷進捗ＮＯ. Receipt progress No..<p>
	 *
	 */
	public static final String $arr_pr_no = "arr_pr_no";
	private static final MCPermColumnInfo _arr_pr_no = createColumnInfo("arr_pr_no");
	public final MCStringPermColumn arr_pr_no = createStringColumn(_arr_pr_no);
	
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
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	private static final MCPermColumnInfo _po_d_no = createColumnInfo("po_d_no");
	public final MCStringPermColumn po_d_no = createStringColumn(_po_d_no);
	
	/**
	 * 売上返品予定明細ＮＯ. Sales return schedule details No..<p>
	 *
	 */
	public static final String $sls_ret_schd_d_no = "sls_ret_schd_d_no";
	private static final MCPermColumnInfo _sls_ret_schd_d_no = createColumnInfo("sls_ret_schd_d_no");
	public final MCStringPermColumn sls_ret_schd_d_no = createStringColumn(_sls_ret_schd_d_no);
	
	/**
	 * 納品書明細ＮＯ. Delivery note details No..<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	private static final MCPermColumnInfo _dlv_slip_d_no = createColumnInfo("dlv_slip_d_no");
	public final MCStringPermColumn dlv_slip_d_no = createStringColumn(_dlv_slip_d_no);
	
	/**
	 * インボイス明細ＮＯ. Invoice details No..<p>
	 *
	 */
	public static final String $iv_d_no = "iv_d_no";
	private static final MCPermColumnInfo _iv_d_no = createColumnInfo("iv_d_no");
	public final MCStringPermColumn iv_d_no = createStringColumn(_iv_d_no);
	
	/**
	 * 依頼元部門ＣＤ. Requesting dept. cd..<p>
	 *
	 */
	public static final String $rqst_dpt_cd = "rqst_dpt_cd";
	private static final MCPermColumnInfo _rqst_dpt_cd = createColumnInfo("rqst_dpt_cd");
	public final MCStringPermColumn rqst_dpt_cd = createStringColumn(_rqst_dpt_cd);
	
	/**
	 * 依頼元ワーキンググループＣＤ. Requesting WG cd..<p>
	 *
	 */
	public static final String $rqst_wg_cd = "rqst_wg_cd";
	private static final MCPermColumnInfo _rqst_wg_cd = createColumnInfo("rqst_wg_cd");
	public final MCStringPermColumn rqst_wg_cd = createStringColumn(_rqst_wg_cd);
	
	/**
	 * 依頼元担当者ＣＤ. Requesting PIC cd..<p>
	 *
	 */
	public static final String $rqst_usr_cd = "rqst_usr_cd";
	private static final MCPermColumnInfo _rqst_usr_cd = createColumnInfo("rqst_usr_cd");
	public final MCStringPermColumn rqst_usr_cd = createStringColumn(_rqst_usr_cd);
	
	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	private static final MCPermColumnInfo _cst_cd = createColumnInfo("cst_cd");
	public final MCStringPermColumn cst_cd = createStringColumn(_cst_cd);
	
	/**
	 * 引取先ＣＤ. Pickup company cd..<p>
	 *
	 */
	public static final String $sret_fr_cd = "sret_fr_cd";
	private static final MCPermColumnInfo _sret_fr_cd = createColumnInfo("sret_fr_cd");
	public final MCStringPermColumn sret_fr_cd = createStringColumn(_sret_fr_cd);
	
	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	private static final MCPermColumnInfo _sppl_cd = createColumnInfo("sppl_cd");
	public final MCStringPermColumn sppl_cd = createStringColumn(_sppl_cd);
	
	/**
	 * 返品元納品書明細ＮＯ. Return-from delivery note details No..<p>
	 *
	 */
	public static final String $ret_dlv_slip_d_no = "ret_dlv_slip_d_no";
	private static final MCPermColumnInfo _ret_dlv_slip_d_no = createColumnInfo("ret_dlv_slip_d_no");
	public final MCStringPermColumn ret_dlv_slip_d_no = createStringColumn(_ret_dlv_slip_d_no);
	
	/**
	 * 返品元在庫着荷先ＣＤ. Return-from inventory arrival destination cd..<p>
	 *
	 */
	public static final String $ret_stk_arrv_bp_cd = "ret_stk_arrv_bp_cd";
	private static final MCPermColumnInfo _ret_stk_arrv_bp_cd = createColumnInfo("ret_stk_arrv_bp_cd");
	public final MCStringPermColumn ret_stk_arrv_bp_cd = createStringColumn(_ret_stk_arrv_bp_cd);
	
	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public static final String $dlv_rqst_tm = "dlv_rqst_tm";
	private static final MCPermColumnInfo _dlv_rqst_tm = createColumnInfo("dlv_rqst_tm");
	public final MCDatePermColumn dlv_rqst_tm = createDateColumn(_dlv_rqst_tm);
	
	/**
	 * 納期回答受領日. Order promising result received date.<p>
	 *
	 */
	public static final String $prms_rcpt_dt = "prms_rcpt_dt";
	private static final MCPermColumnInfo _prms_rcpt_dt = createColumnInfo("prms_rcpt_dt");
	public final MCDatePermColumn prms_rcpt_dt = createDateColumn(_prms_rcpt_dt);
	
	/**
	 * 回答納入日. Replied delivery date.<p>
	 *
	 */
	public static final String $prms_dlv_dt = "prms_dlv_dt";
	private static final MCPermColumnInfo _prms_dlv_dt = createColumnInfo("prms_dlv_dt");
	public final MCDatePermColumn prms_dlv_dt = createDateColumn(_prms_dlv_dt);
	
	/**
	 * 納期回答反映日. Order promising applied date.<p>
	 *
	 */
	public static final String $prms_refl_dt = "prms_refl_dt";
	private static final MCPermColumnInfo _prms_refl_dt = createColumnInfo("prms_refl_dt");
	public final MCDatePermColumn prms_refl_dt = createDateColumn(_prms_refl_dt);
	
	/**
	 * 納入指示日. Delivery order date.<p>
	 *
	 */
	public static final String $dlv_inst_dt = "dlv_inst_dt";
	private static final MCPermColumnInfo _dlv_inst_dt = createColumnInfo("dlv_inst_dt");
	public final MCDatePermColumn dlv_inst_dt = createDateColumn(_dlv_inst_dt);
	
	/**
	 * 納入指示回答受領日. Delivery order replied received date.<p>
	 *
	 */
	public static final String $dlv_inst_prms_rcpt_dt = "dlv_inst_prms_rcpt_dt";
	private static final MCPermColumnInfo _dlv_inst_prms_rcpt_dt = createColumnInfo("dlv_inst_prms_rcpt_dt");
	public final MCDatePermColumn dlv_inst_prms_rcpt_dt = createDateColumn(_dlv_inst_prms_rcpt_dt);
	
	/**
	 * 納入指示回答反映日. Delivery order reply applied date.<p>
	 *
	 */
	public static final String $dlv_inst_prms_refl_dt = "dlv_inst_prms_refl_dt";
	private static final MCPermColumnInfo _dlv_inst_prms_refl_dt = createColumnInfo("dlv_inst_prms_refl_dt");
	public final MCDatePermColumn dlv_inst_prms_refl_dt = createDateColumn(_dlv_inst_prms_refl_dt);
	
	/**
	 * 入荷予定日時. Scheduled receipt date and time.<p>
	 *
	 */
	public static final String $arr_schd_tm = "arr_schd_tm";
	private static final MCPermColumnInfo _arr_schd_tm = createColumnInfo("arr_schd_tm");
	public final MCDatePermColumn arr_schd_tm = createDateColumn(_arr_schd_tm);
	
	/**
	 * 入荷日時. Receipt date and time.<p>
	 *
	 */
	public static final String $arr_tm = "arr_tm";
	private static final MCPermColumnInfo _arr_tm = createColumnInfo("arr_tm");
	public final MCDatePermColumn arr_tm = createDateColumn(_arr_tm);
	
	/**
	 * 仕入日. Purchase date.<p>
	 *
	 */
	public static final String $purc_dt = "purc_dt";
	private static final MCPermColumnInfo _purc_dt = createColumnInfo("purc_dt");
	public final MCDatePermColumn purc_dt = createDateColumn(_purc_dt);
	
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
	 * 納期回答受領数量. Order promising result received qty..<p>
	 *
	 */
	public static final String $prms_rcpt_qty = "prms_rcpt_qty";
	private static final MCPermColumnInfo _prms_rcpt_qty = createColumnInfo("prms_rcpt_qty");
	public final MCNumberPermColumn prms_rcpt_qty = createNumberColumn(_prms_rcpt_qty);
	
	/**
	 * 納期回答反映済数量. Order promising applied qty..<p>
	 *
	 */
	public static final String $prms_refl_qty = "prms_refl_qty";
	private static final MCPermColumnInfo _prms_refl_qty = createColumnInfo("prms_refl_qty");
	public final MCNumberPermColumn prms_refl_qty = createNumberColumn(_prms_refl_qty);
	
	/**
	 * 納入指示数量. Delivery order qty..<p>
	 *
	 */
	public static final String $dlv_inst_qty = "dlv_inst_qty";
	private static final MCPermColumnInfo _dlv_inst_qty = createColumnInfo("dlv_inst_qty");
	public final MCNumberPermColumn dlv_inst_qty = createNumberColumn(_dlv_inst_qty);
	
	/**
	 * 納入指示回答受領数量. Delivery order replied received qty..<p>
	 *
	 */
	public static final String $dlv_inst_prms_rcpt_qty = "dlv_inst_prms_rcpt_qty";
	private static final MCPermColumnInfo _dlv_inst_prms_rcpt_qty = createColumnInfo("dlv_inst_prms_rcpt_qty");
	public final MCNumberPermColumn dlv_inst_prms_rcpt_qty = createNumberColumn(_dlv_inst_prms_rcpt_qty);
	
	/**
	 * 納入指示回答反映済数量. Delivery order reply applied qty..<p>
	 *
	 */
	public static final String $dlv_inst_prms_refl_qty = "dlv_inst_prms_refl_qty";
	private static final MCPermColumnInfo _dlv_inst_prms_refl_qty = createColumnInfo("dlv_inst_prms_refl_qty");
	public final MCNumberPermColumn dlv_inst_prms_refl_qty = createNumberColumn(_dlv_inst_prms_refl_qty);
	
	/**
	 * 再入荷予定数量. Scheduled re-receipt qty..<p>
	 *
	 */
	public static final String $re_arr_schd_qty = "re_arr_schd_qty";
	private static final MCPermColumnInfo _re_arr_schd_qty = createColumnInfo("re_arr_schd_qty");
	public final MCNumberPermColumn re_arr_schd_qty = createNumberColumn(_re_arr_schd_qty);
	
	/**
	 * 受領インボイス数量. Purchase invoice qty..<p>
	 *
	 */
	public static final String $rcpt_iv_qty = "rcpt_iv_qty";
	private static final MCPermColumnInfo _rcpt_iv_qty = createColumnInfo("rcpt_iv_qty");
	public final MCNumberPermColumn rcpt_iv_qty = createNumberColumn(_rcpt_iv_qty);
	
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
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	private static final MCPermColumnInfo _abort_flg = createColumnInfo("abort_flg");
	public final MCBooleanPermColumn abort_flg = createBooleanColumn(_abort_flg);
	
	/**
	 * 入荷予定打切数量. Cancelled remaining receipt schedule qty..<p>
	 *
	 */
	public static final String $arr_schd_abort_qty = "arr_schd_abort_qty";
	private static final MCPermColumnInfo _arr_schd_abort_qty = createColumnInfo("arr_schd_abort_qty");
	public final MCNumberPermColumn arr_schd_abort_qty = createNumberColumn(_arr_schd_abort_qty);
	
	/**
	 * 仕入予定打切数量. Cancelled remaining purchase schedule qty..<p>
	 *
	 */
	public static final String $purc_schd_abort_qty = "purc_schd_abort_qty";
	private static final MCPermColumnInfo _purc_schd_abort_qty = createColumnInfo("purc_schd_abort_qty");
	public final MCNumberPermColumn purc_schd_abort_qty = createNumberColumn(_purc_schd_abort_qty);
	
	/**
	 * 売上返品予定打切数量. Cancelled remaining sales return schedule qty..<p>
	 *
	 */
	public static final String $sls_ret_schd_abort_qty = "sls_ret_schd_abort_qty";
	private static final MCPermColumnInfo _sls_ret_schd_abort_qty = createColumnInfo("sls_ret_schd_abort_qty");
	public final MCNumberPermColumn sls_ret_schd_abort_qty = createNumberColumn(_sls_ret_schd_abort_qty);
	
	/**
	 * 検収不良数量. Acceptance defective qty..<p>
	 *
	 */
	public static final String $accpt_dfct_qty = "accpt_dfct_qty";
	private static final MCPermColumnInfo _accpt_dfct_qty = createColumnInfo("accpt_dfct_qty");
	public final MCNumberPermColumn accpt_dfct_qty = createNumberColumn(_accpt_dfct_qty);
	
	/**
	 * 標準納入ＬＴ. Standard delivery LT.<p>
	 *
	 */
	public static final String $std_purc_lt = "std_purc_lt";
	private static final MCPermColumnInfo _std_purc_lt = createColumnInfo("std_purc_lt");
	public final MCNumberPermColumn std_purc_lt = createNumberColumn(_std_purc_lt);
	
	/**
	 * 納入ＬＴ. Delivery LT.<p>
	 *
	 */
	public static final String $act_purc_lt = "act_purc_lt";
	private static final MCPermColumnInfo _act_purc_lt = createColumnInfo("act_purc_lt");
	public final MCNumberPermColumn act_purc_lt = createNumberColumn(_act_purc_lt);
	
	/**
	 * 理由ＣＤ. Reason cd..<p>
	 *
	 */
	public static final String $rsn_cd = "rsn_cd";
	private static final MCPermColumnInfo _rsn_cd = createColumnInfo("rsn_cd");
	public final MCStringPermColumn rsn_cd = createStringColumn(_rsn_cd);
	
	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	private static final MCPermColumnInfo _bd_dpt_cd = createColumnInfo("bd_dpt_cd");
	public final MCStringPermColumn bd_dpt_cd = createStringColumn(_bd_dpt_cd);
	
	/**
	 * 負担ワーキンググループＣＤ. Charged WG cd..<p>
	 *
	 */
	public static final String $bd_wg_cd = "bd_wg_cd";
	private static final MCPermColumnInfo _bd_wg_cd = createColumnInfo("bd_wg_cd");
	public final MCStringPermColumn bd_wg_cd = createStringColumn(_bd_wg_cd);
	
	/**
	 * 仕入直送ＦＬＧ. Direct delivery flg..<p>
	 *
	 */
	public static final String $purc_ddlv_flg = "purc_ddlv_flg";
	private static final MCPermColumnInfo _purc_ddlv_flg = createColumnInfo("purc_ddlv_flg");
	public final MCBooleanPermColumn purc_ddlv_flg = createBooleanColumn(_purc_ddlv_flg);
	
	/**
	 * 購買状況区分. Purchase status type.<p>
	 *
	 */
	public static final String $purc_sts_typ = "purc_sts_typ";
	private static final MCPermColumnInfo _purc_sts_typ = createColumnInfo("purc_sts_typ");
	public final MCStringPermColumn purc_sts_typ = createStringColumn(_purc_sts_typ);
	
	/**
	 * 回答納入日遅れＦＬＧ. Replied delivery date delay flg..<p>
	 *
	 */
	public static final String $prms_dlv_dt_overdue_flg = "prms_dlv_dt_overdue_flg";
	private static final MCPermColumnInfo _prms_dlv_dt_overdue_flg = createColumnInfo("prms_dlv_dt_overdue_flg");
	public final MCBooleanPermColumn prms_dlv_dt_overdue_flg = createBooleanColumn(_prms_dlv_dt_overdue_flg);
	
	/**
	 * 納入希望日遅れＦＬＧ. Delivery dates delayed flg..<p>
	 *
	 */
	public static final String $dlv_rqst_dt_overdue_flg = "dlv_rqst_dt_overdue_flg";
	private static final MCPermColumnInfo _dlv_rqst_dt_overdue_flg = createColumnInfo("dlv_rqst_dt_overdue_flg");
	public final MCBooleanPermColumn dlv_rqst_dt_overdue_flg = createBooleanColumn(_dlv_rqst_dt_overdue_flg);
	
	/**
	 * 入荷予定分割ＦＬＧ. Scheduled receipt split flg..<p>
	 *
	 */
	public static final String $arr_schd_split_flg = "arr_schd_split_flg";
	private static final MCPermColumnInfo _arr_schd_split_flg = createColumnInfo("arr_schd_split_flg");
	public final MCBooleanPermColumn arr_schd_split_flg = createBooleanColumn(_arr_schd_split_flg);
	
	/**
	 * 入荷予定反映済ＦＬＧ. Receipt schedule applied flg..<p>
	 *
	 */
	public static final String $arr_schd_refl_flg = "arr_schd_refl_flg";
	private static final MCPermColumnInfo _arr_schd_refl_flg = createColumnInfo("arr_schd_refl_flg");
	public final MCBooleanPermColumn arr_schd_refl_flg = createBooleanColumn(_arr_schd_refl_flg);
	
	/**
	 * 入荷完了ＦＬＧ. Receipt completed flg..<p>
	 *
	 */
	public static final String $arr_cmpl_flg = "arr_cmpl_flg";
	private static final MCPermColumnInfo _arr_cmpl_flg = createColumnInfo("arr_cmpl_flg");
	public final MCBooleanPermColumn arr_cmpl_flg = createBooleanColumn(_arr_cmpl_flg);
	
	/**
	 * 仕入完了ＦＬＧ. Purchase completion flg..<p>
	 *
	 */
	public static final String $purc_cmpl_flg = "purc_cmpl_flg";
	private static final MCPermColumnInfo _purc_cmpl_flg = createColumnInfo("purc_cmpl_flg");
	public final MCBooleanPermColumn purc_cmpl_flg = createBooleanColumn(_purc_cmpl_flg);
	
	/**
	 * 売上返品完了ＦＬＧ. Sales return completion flg..<p>
	 *
	 */
	public static final String $sls_ret_cmpl_flg = "sls_ret_cmpl_flg";
	private static final MCPermColumnInfo _sls_ret_cmpl_flg = createColumnInfo("sls_ret_cmpl_flg");
	public final MCBooleanPermColumn sls_ret_cmpl_flg = createBooleanColumn(_sls_ret_cmpl_flg);
	
	/**
	 * 入荷連絡備考. Receipt contact remarks.<p>
	 *
	 */
	public static final String $arr_cnt_rmrks = "arr_cnt_rmrks";
	private static final MCPermColumnInfo _arr_cnt_rmrks = createColumnInfo("arr_cnt_rmrks");
	public final MCStringPermColumn arr_cnt_rmrks = createStringColumn(_arr_cnt_rmrks);
	
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
	
	public static final MCMeta arr_pr_no_META = createCommonMeta($arr_pr_no, mcframe.commonMA.meta.MA_META.ARR_PR_NO);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta sls_ret_schd_d_no_META = createCommonMeta($sls_ret_schd_d_no, mcframe.commonMA.meta.MA_META.SLS_RET_SCHD_D_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta iv_d_no_META = createCommonMeta($iv_d_no, mcframe.commonMA.meta.MA_META.IV_D_NO);
	public static final MCMeta rqst_dpt_cd_META = createCommonMeta($rqst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_usr_cd_META = createCommonMeta($rqst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sret_fr_cd_META = createCommonMeta($sret_fr_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ret_dlv_slip_d_no_META = createCommonMeta($ret_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta ret_stk_arrv_bp_cd_META = createCommonMeta($ret_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_rqst_tm_META = createCommonMeta($dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta prms_rcpt_dt_META = createCommonMeta($prms_rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prms_dlv_dt_META = createCommonMeta($prms_dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prms_refl_dt_META = createCommonMeta($prms_refl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_dt_META = createCommonMeta($dlv_inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_prms_rcpt_dt_META = createCommonMeta($dlv_inst_prms_rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_prms_refl_dt_META = createCommonMeta($dlv_inst_prms_refl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_schd_tm_META = createCommonMeta($arr_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta arr_tm_META = createCommonMeta($arr_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta purc_dt_META = createCommonMeta($purc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta prms_rcpt_qty_META = createCommonMeta($prms_rcpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prms_refl_qty_META = createCommonMeta($prms_refl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dlv_inst_qty_META = createCommonMeta($dlv_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dlv_inst_prms_rcpt_qty_META = createCommonMeta($dlv_inst_prms_rcpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dlv_inst_prms_refl_qty_META = createCommonMeta($dlv_inst_prms_refl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta re_arr_schd_qty_META = createCommonMeta($re_arr_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rcpt_iv_qty_META = createCommonMeta($rcpt_iv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta arr_qty_META = createCommonMeta($arr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_qty_META = createCommonMeta($purc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_ret_qty_META = createCommonMeta($sls_ret_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_schd_abort_qty_META = createCommonMeta($arr_schd_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_schd_abort_qty_META = createCommonMeta($purc_schd_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_ret_schd_abort_qty_META = createCommonMeta($sls_ret_schd_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta accpt_dfct_qty_META = createCommonMeta($accpt_dfct_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta std_purc_lt_META = createCommonMeta($std_purc_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta act_purc_lt_META = createCommonMeta($act_purc_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_wg_cd_META = createCommonMeta($bd_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta purc_ddlv_flg_META = createCommonMeta($purc_ddlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_sts_typ_META = createCommonMeta($purc_sts_typ, mcframe.commonMS.meta.MS_META.PURC_STS_TYP);
	public static final MCMeta prms_dlv_dt_overdue_flg_META = createCommonMeta($prms_dlv_dt_overdue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_rqst_dt_overdue_flg_META = createCommonMeta($dlv_rqst_dt_overdue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_schd_split_flg_META = createCommonMeta($arr_schd_split_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_schd_refl_flg_META = createCommonMeta($arr_schd_refl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_cmpl_flg_META = createCommonMeta($arr_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cmpl_flg_META = createCommonMeta($purc_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_ret_cmpl_flg_META = createCommonMeta($sls_ret_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_cnt_rmrks_META = createCommonMeta($arr_cnt_rmrks, mcframe.commonMS.meta.MS_META.ARR_CNT_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.ARR_PR_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.ARR_PR_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.ARR_PR_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_ARR_PR_R> constMetas = new ConstMetaList<MST_ARR_PR_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			arr_pr_no_META,
			trd_cd_META,
			trd_ptn_typ_META,
			po_d_no_META,
			sls_ret_schd_d_no_META,
			dlv_slip_d_no_META,
			iv_d_no_META,
			rqst_dpt_cd_META,
			rqst_wg_cd_META,
			rqst_usr_cd_META,
			cst_cd_META,
			sret_fr_cd_META,
			sppl_cd_META,
			ret_dlv_slip_d_no_META,
			ret_stk_arrv_bp_cd_META,
			dlv_rqst_tm_META,
			prms_rcpt_dt_META,
			prms_dlv_dt_META,
			prms_refl_dt_META,
			dlv_inst_dt_META,
			dlv_inst_prms_rcpt_dt_META,
			dlv_inst_prms_refl_dt_META,
			arr_schd_tm_META,
			arr_tm_META,
			purc_dt_META,
			trd_unit_qty_META,
			trd_unit_cd_META,
			pack_unit_qty_META,
			pack_unit_cd_META,
			base_unit_qty_META,
			base_unit_cd_META,
			prms_rcpt_qty_META,
			prms_refl_qty_META,
			dlv_inst_qty_META,
			dlv_inst_prms_rcpt_qty_META,
			dlv_inst_prms_refl_qty_META,
			re_arr_schd_qty_META,
			rcpt_iv_qty_META,
			arr_qty_META,
			purc_qty_META,
			sls_ret_qty_META,
			abort_flg_META,
			arr_schd_abort_qty_META,
			purc_schd_abort_qty_META,
			sls_ret_schd_abort_qty_META,
			accpt_dfct_qty_META,
			std_purc_lt_META,
			act_purc_lt_META,
			rsn_cd_META,
			bd_dpt_cd_META,
			bd_wg_cd_META,
			purc_ddlv_flg_META,
			purc_sts_typ_META,
			prms_dlv_dt_overdue_flg_META,
			dlv_rqst_dt_overdue_flg_META,
			arr_schd_split_flg_META,
			arr_schd_refl_flg_META,
			arr_cmpl_flg_META,
			purc_cmpl_flg_META,
			sls_ret_cmpl_flg_META,
			arr_cnt_rmrks_META,
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
	protected MST_ARR_PR_R(ConstMetaList<? extends MST_ARR_PR_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_ARR_PR_R(ConstMetaList<? extends MST_ARR_PR_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_ARR_PR_R.$arr_pr_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$arr_pr_no,
				"arr_pr_no",
				arr_pr_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$trd_cd,
				"trd_cd",
				trd_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$trd_ptn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$trd_ptn_typ,
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
			MST_ARR_PR_R.$po_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$po_d_no,
				"po_d_no",
				po_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$sls_ret_schd_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$sls_ret_schd_d_no,
				"sls_ret_schd_d_no",
				sls_ret_schd_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$dlv_slip_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$dlv_slip_d_no,
				"dlv_slip_d_no",
				dlv_slip_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$iv_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$iv_d_no,
				"iv_d_no",
				iv_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$rqst_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$rqst_dpt_cd,
				"rqst_dpt_cd",
				rqst_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$rqst_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$rqst_wg_cd,
				"rqst_wg_cd",
				rqst_wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$rqst_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$rqst_usr_cd,
				"rqst_usr_cd",
				rqst_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$cst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$cst_cd,
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
			MST_ARR_PR_R.$sret_fr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$sret_fr_cd,
				"sret_fr_cd",
				sret_fr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$sppl_cd,
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
			MST_ARR_PR_R.$ret_dlv_slip_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$ret_dlv_slip_d_no,
				"ret_dlv_slip_d_no",
				ret_dlv_slip_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$ret_stk_arrv_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$ret_stk_arrv_bp_cd,
				"ret_stk_arrv_bp_cd",
				ret_stk_arrv_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$dlv_rqst_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ARR_PR_R.$dlv_rqst_tm,
				"dlv_rqst_tm",
				dlv_rqst_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$prms_rcpt_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ARR_PR_R.$prms_rcpt_dt,
				"prms_rcpt_dt",
				prms_rcpt_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$prms_dlv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ARR_PR_R.$prms_dlv_dt,
				"prms_dlv_dt",
				prms_dlv_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$prms_refl_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ARR_PR_R.$prms_refl_dt,
				"prms_refl_dt",
				prms_refl_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$dlv_inst_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ARR_PR_R.$dlv_inst_dt,
				"dlv_inst_dt",
				dlv_inst_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$dlv_inst_prms_rcpt_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ARR_PR_R.$dlv_inst_prms_rcpt_dt,
				"dlv_inst_prms_rcpt_dt",
				dlv_inst_prms_rcpt_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$dlv_inst_prms_refl_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ARR_PR_R.$dlv_inst_prms_refl_dt,
				"dlv_inst_prms_refl_dt",
				dlv_inst_prms_refl_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$arr_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ARR_PR_R.$arr_schd_tm,
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
			MST_ARR_PR_R.$arr_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ARR_PR_R.$arr_tm,
				"arr_tm",
				arr_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$purc_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ARR_PR_R.$purc_dt,
				"purc_dt",
				purc_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$trd_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_PR_R.$trd_unit_qty,
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
			MST_ARR_PR_R.$trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$trd_unit_cd,
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
			MST_ARR_PR_R.$pack_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_PR_R.$pack_unit_qty,
				"pack_unit_qty",
				pack_unit_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$pack_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$pack_unit_cd,
				"pack_unit_cd",
				pack_unit_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$base_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_PR_R.$base_unit_qty,
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
			MST_ARR_PR_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$base_unit_cd,
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
			MST_ARR_PR_R.$prms_rcpt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_PR_R.$prms_rcpt_qty,
				"prms_rcpt_qty",
				prms_rcpt_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$prms_refl_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_PR_R.$prms_refl_qty,
				"prms_refl_qty",
				prms_refl_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$dlv_inst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_PR_R.$dlv_inst_qty,
				"dlv_inst_qty",
				dlv_inst_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$dlv_inst_prms_rcpt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_PR_R.$dlv_inst_prms_rcpt_qty,
				"dlv_inst_prms_rcpt_qty",
				dlv_inst_prms_rcpt_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$dlv_inst_prms_refl_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_PR_R.$dlv_inst_prms_refl_qty,
				"dlv_inst_prms_refl_qty",
				dlv_inst_prms_refl_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$re_arr_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_PR_R.$re_arr_schd_qty,
				"re_arr_schd_qty",
				re_arr_schd_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$rcpt_iv_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_PR_R.$rcpt_iv_qty,
				"rcpt_iv_qty",
				rcpt_iv_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$arr_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_PR_R.$arr_qty,
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
			MST_ARR_PR_R.$purc_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_PR_R.$purc_qty,
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
			MST_ARR_PR_R.$sls_ret_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_PR_R.$sls_ret_qty,
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
			MST_ARR_PR_R.$abort_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_PR_R.$abort_flg,
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
			MST_ARR_PR_R.$arr_schd_abort_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_PR_R.$arr_schd_abort_qty,
				"arr_schd_abort_qty",
				arr_schd_abort_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$purc_schd_abort_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_PR_R.$purc_schd_abort_qty,
				"purc_schd_abort_qty",
				purc_schd_abort_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$sls_ret_schd_abort_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_PR_R.$sls_ret_schd_abort_qty,
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
			MST_ARR_PR_R.$accpt_dfct_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_PR_R.$accpt_dfct_qty,
				"accpt_dfct_qty",
				accpt_dfct_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$std_purc_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_PR_R.$std_purc_lt,
				"std_purc_lt",
				std_purc_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$act_purc_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_PR_R.$act_purc_lt,
				"act_purc_lt",
				act_purc_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$rsn_cd,
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
			MST_ARR_PR_R.$bd_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$bd_dpt_cd,
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
			MST_ARR_PR_R.$bd_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$bd_wg_cd,
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
			MST_ARR_PR_R.$purc_ddlv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_PR_R.$purc_ddlv_flg,
				"purc_ddlv_flg",
				purc_ddlv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$purc_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$purc_sts_typ,
				"purc_sts_typ",
				purc_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$prms_dlv_dt_overdue_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_PR_R.$prms_dlv_dt_overdue_flg,
				"prms_dlv_dt_overdue_flg",
				prms_dlv_dt_overdue_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$dlv_rqst_dt_overdue_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_PR_R.$dlv_rqst_dt_overdue_flg,
				"dlv_rqst_dt_overdue_flg",
				dlv_rqst_dt_overdue_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$arr_schd_split_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_PR_R.$arr_schd_split_flg,
				"arr_schd_split_flg",
				arr_schd_split_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$arr_schd_refl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_PR_R.$arr_schd_refl_flg,
				"arr_schd_refl_flg",
				arr_schd_refl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$arr_cmpl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_PR_R.$arr_cmpl_flg,
				"arr_cmpl_flg",
				arr_cmpl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$purc_cmpl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_PR_R.$purc_cmpl_flg,
				"purc_cmpl_flg",
				purc_cmpl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$sls_ret_cmpl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ARR_PR_R.$sls_ret_cmpl_flg,
				"sls_ret_cmpl_flg",
				sls_ret_cmpl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ARR_PR_R.$arr_cnt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$arr_cnt_rmrks,
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
			MST_ARR_PR_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$sub_char1,
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
			MST_ARR_PR_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$sub_char2,
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
			MST_ARR_PR_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$sub_char3,
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
			MST_ARR_PR_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$ins_usr_id,
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
			MST_ARR_PR_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$ins_usr_nm,
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
			MST_ARR_PR_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_ARR_PR_R.$ins_ts,
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
			MST_ARR_PR_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$ins_func_id,
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
			MST_ARR_PR_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ARR_PR_R.$upd_cntr,
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
			MST_ARR_PR_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$upd_usr_id,
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
			MST_ARR_PR_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$upd_usr_nm,
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
			MST_ARR_PR_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_ARR_PR_R.$upd_ts,
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
			MST_ARR_PR_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$upd_func_id,
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
			MST_ARR_PR_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ARR_PR_R.$upd_srv_req_no,
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
	public static MST_ARR_PR_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_ARR_PR_R create(String alias) {
		MST_ARR_PR_R row = new MST_ARR_PR_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_ARR_PR_R createByName(T proto) {
		MST_ARR_PR_R row = MST_ARR_PR_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ARR_PR_R clone() {
		return (MST_ARR_PR_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ARR_PR_R createInstance() {
		return (MST_ARR_PR_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ARR_PR_R getValues(String... names) {
		return (MST_ARR_PR_R) super.getValues(names);
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
	 public MSW_ARR_PR_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_ARR_PR_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_ARR_PR_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_ARR_PR_KEY_R.TABLE_NAME);
	 }

	/**
	 * 入荷進捗ＮＯ. Receipt progress No..<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 0, $arr_pr_no);
	}

	/**
	 * 入荷進捗ＮＯ. Receipt progress No..<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 0, $arr_pr_no, value);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 1, $trd_cd);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 1, $trd_cd, value);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 2, $trd_ptn_typ);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 2, $trd_ptn_typ, value);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 3, $po_d_no);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 3, $po_d_no, value);
	}

	/**
	 * 売上返品予定明細ＮＯ. Sales return schedule details No..<p>
	 *
	 */
	public String sls_ret_schd_d_no() {
		return getConstString(offset + 4, $sls_ret_schd_d_no);
	}

	/**
	 * 売上返品予定明細ＮＯ. Sales return schedule details No..<p>
	 *
	 */
	public void sls_ret_schd_d_no(String value) {
		setConstString(offset + 4, $sls_ret_schd_d_no, value);
	}

	/**
	 * 納品書明細ＮＯ. Delivery note details No..<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 5, $dlv_slip_d_no);
	}

	/**
	 * 納品書明細ＮＯ. Delivery note details No..<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 5, $dlv_slip_d_no, value);
	}

	/**
	 * インボイス明細ＮＯ. Invoice details No..<p>
	 *
	 */
	public String iv_d_no() {
		return getConstString(offset + 6, $iv_d_no);
	}

	/**
	 * インボイス明細ＮＯ. Invoice details No..<p>
	 *
	 */
	public void iv_d_no(String value) {
		setConstString(offset + 6, $iv_d_no, value);
	}

	/**
	 * 依頼元部門ＣＤ. Requesting dept. cd..<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return getConstString(offset + 7, $rqst_dpt_cd);
	}

	/**
	 * 依頼元部門ＣＤ. Requesting dept. cd..<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		setConstString(offset + 7, $rqst_dpt_cd, value);
	}

	/**
	 * 依頼元ワーキンググループＣＤ. Requesting WG cd..<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 8, $rqst_wg_cd);
	}

	/**
	 * 依頼元ワーキンググループＣＤ. Requesting WG cd..<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 8, $rqst_wg_cd, value);
	}

	/**
	 * 依頼元担当者ＣＤ. Requesting PIC cd..<p>
	 *
	 */
	public String rqst_usr_cd() {
		return getConstString(offset + 9, $rqst_usr_cd);
	}

	/**
	 * 依頼元担当者ＣＤ. Requesting PIC cd..<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		setConstString(offset + 9, $rqst_usr_cd, value);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 10, $cst_cd);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 10, $cst_cd, value);
	}

	/**
	 * 引取先ＣＤ. Pickup company cd..<p>
	 *
	 */
	public String sret_fr_cd() {
		return getConstString(offset + 11, $sret_fr_cd);
	}

	/**
	 * 引取先ＣＤ. Pickup company cd..<p>
	 *
	 */
	public void sret_fr_cd(String value) {
		setConstString(offset + 11, $sret_fr_cd, value);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 12, $sppl_cd);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 12, $sppl_cd, value);
	}

	/**
	 * 返品元納品書明細ＮＯ. Return-from delivery note details No..<p>
	 *
	 */
	public String ret_dlv_slip_d_no() {
		return getConstString(offset + 13, $ret_dlv_slip_d_no);
	}

	/**
	 * 返品元納品書明細ＮＯ. Return-from delivery note details No..<p>
	 *
	 */
	public void ret_dlv_slip_d_no(String value) {
		setConstString(offset + 13, $ret_dlv_slip_d_no, value);
	}

	/**
	 * 返品元在庫着荷先ＣＤ. Return-from inventory arrival destination cd..<p>
	 *
	 */
	public String ret_stk_arrv_bp_cd() {
		return getConstString(offset + 14, $ret_stk_arrv_bp_cd);
	}

	/**
	 * 返品元在庫着荷先ＣＤ. Return-from inventory arrival destination cd..<p>
	 *
	 */
	public void ret_stk_arrv_bp_cd(String value) {
		setConstString(offset + 14, $ret_stk_arrv_bp_cd, value);
	}

	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return getConstDate(offset + 15, $dlv_rqst_tm);
	}

	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 15, $dlv_rqst_tm, value);
	}

	/**
	 * 納期回答受領日. Order promising result received date.<p>
	 *
	 */
	public MCDate prms_rcpt_dt() {
		return getConstDate(offset + 16, $prms_rcpt_dt);
	}

	/**
	 * 納期回答受領日. Order promising result received date.<p>
	 *
	 */
	public void prms_rcpt_dt(MCDate value) {
		setConstDate(offset + 16, $prms_rcpt_dt, value);
	}

	/**
	 * 回答納入日. Replied delivery date.<p>
	 *
	 */
	public MCDate prms_dlv_dt() {
		return getConstDate(offset + 17, $prms_dlv_dt);
	}

	/**
	 * 回答納入日. Replied delivery date.<p>
	 *
	 */
	public void prms_dlv_dt(MCDate value) {
		setConstDate(offset + 17, $prms_dlv_dt, value);
	}

	/**
	 * 納期回答反映日. Order promising applied date.<p>
	 *
	 */
	public MCDate prms_refl_dt() {
		return getConstDate(offset + 18, $prms_refl_dt);
	}

	/**
	 * 納期回答反映日. Order promising applied date.<p>
	 *
	 */
	public void prms_refl_dt(MCDate value) {
		setConstDate(offset + 18, $prms_refl_dt, value);
	}

	/**
	 * 納入指示日. Delivery order date.<p>
	 *
	 */
	public MCDate dlv_inst_dt() {
		return getConstDate(offset + 19, $dlv_inst_dt);
	}

	/**
	 * 納入指示日. Delivery order date.<p>
	 *
	 */
	public void dlv_inst_dt(MCDate value) {
		setConstDate(offset + 19, $dlv_inst_dt, value);
	}

	/**
	 * 納入指示回答受領日. Delivery order replied received date.<p>
	 *
	 */
	public MCDate dlv_inst_prms_rcpt_dt() {
		return getConstDate(offset + 20, $dlv_inst_prms_rcpt_dt);
	}

	/**
	 * 納入指示回答受領日. Delivery order replied received date.<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_dt(MCDate value) {
		setConstDate(offset + 20, $dlv_inst_prms_rcpt_dt, value);
	}

	/**
	 * 納入指示回答反映日. Delivery order reply applied date.<p>
	 *
	 */
	public MCDate dlv_inst_prms_refl_dt() {
		return getConstDate(offset + 21, $dlv_inst_prms_refl_dt);
	}

	/**
	 * 納入指示回答反映日. Delivery order reply applied date.<p>
	 *
	 */
	public void dlv_inst_prms_refl_dt(MCDate value) {
		setConstDate(offset + 21, $dlv_inst_prms_refl_dt, value);
	}

	/**
	 * 入荷予定日時. Scheduled receipt date and time.<p>
	 *
	 */
	public MCDate arr_schd_tm() {
		return getConstDate(offset + 22, $arr_schd_tm);
	}

	/**
	 * 入荷予定日時. Scheduled receipt date and time.<p>
	 *
	 */
	public void arr_schd_tm(MCDate value) {
		setConstDate(offset + 22, $arr_schd_tm, value);
	}

	/**
	 * 入荷日時. Receipt date and time.<p>
	 *
	 */
	public MCDate arr_tm() {
		return getConstDate(offset + 23, $arr_tm);
	}

	/**
	 * 入荷日時. Receipt date and time.<p>
	 *
	 */
	public void arr_tm(MCDate value) {
		setConstDate(offset + 23, $arr_tm, value);
	}

	/**
	 * 仕入日. Purchase date.<p>
	 *
	 */
	public MCDate purc_dt() {
		return getConstDate(offset + 24, $purc_dt);
	}

	/**
	 * 仕入日. Purchase date.<p>
	 *
	 */
	public void purc_dt(MCDate value) {
		setConstDate(offset + 24, $purc_dt, value);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 25, $trd_unit_qty);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 25, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 25, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 25, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 25, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 25, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 26, $trd_unit_cd);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 26, $trd_unit_cd, value);
	}

	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 27, $pack_unit_qty);
	}

	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 27, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 27, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 27, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 27, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 27, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位ＣＤ. SKU cd..<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 28, $pack_unit_cd);
	}

	/**
	 * 荷姿単位ＣＤ. SKU cd..<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 28, $pack_unit_cd, value);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 29, $base_unit_qty);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 29, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 29, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 29, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 29, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 29, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 30, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 30, $base_unit_cd, value);
	}

	/**
	 * 納期回答受領数量. Order promising result received qty..<p>
	 *
	 */
	public MCNumber prms_rcpt_qty() {
		return getConstNumber(offset + 31, $prms_rcpt_qty);
	}

	/**
	 * 納期回答受領数量. Order promising result received qty..<p>
	 *
	 */
	public void prms_rcpt_qty(MCNumber value) {
		setConstNumber(offset + 31, $prms_rcpt_qty, value);
	}
	
	/**
	 * 納期回答受領数量. Order promising result received qty..<p>
	 *
	 */
	public void prms_rcpt_qty(int value) {
		setConstNumber(offset + 31, $prms_rcpt_qty, value);
	}
	
	/**
	 * 納期回答受領数量. Order promising result received qty..<p>
	 *
	 */
	public void prms_rcpt_qty(long value) {
		setConstNumber(offset + 31, $prms_rcpt_qty, value);
	}
	
	/**
	 * 納期回答受領数量. Order promising result received qty..<p>
	 *
	 */
	public void prms_rcpt_qty(float value) {
		setConstNumber(offset + 31, $prms_rcpt_qty, value);
	}
	
	/**
	 * 納期回答受領数量. Order promising result received qty..<p>
	 *
	 */
	public void prms_rcpt_qty(double value) {
		setConstNumber(offset + 31, $prms_rcpt_qty, value);
	}
	
	/**
	 * 納期回答反映済数量. Order promising applied qty..<p>
	 *
	 */
	public MCNumber prms_refl_qty() {
		return getConstNumber(offset + 32, $prms_refl_qty);
	}

	/**
	 * 納期回答反映済数量. Order promising applied qty..<p>
	 *
	 */
	public void prms_refl_qty(MCNumber value) {
		setConstNumber(offset + 32, $prms_refl_qty, value);
	}
	
	/**
	 * 納期回答反映済数量. Order promising applied qty..<p>
	 *
	 */
	public void prms_refl_qty(int value) {
		setConstNumber(offset + 32, $prms_refl_qty, value);
	}
	
	/**
	 * 納期回答反映済数量. Order promising applied qty..<p>
	 *
	 */
	public void prms_refl_qty(long value) {
		setConstNumber(offset + 32, $prms_refl_qty, value);
	}
	
	/**
	 * 納期回答反映済数量. Order promising applied qty..<p>
	 *
	 */
	public void prms_refl_qty(float value) {
		setConstNumber(offset + 32, $prms_refl_qty, value);
	}
	
	/**
	 * 納期回答反映済数量. Order promising applied qty..<p>
	 *
	 */
	public void prms_refl_qty(double value) {
		setConstNumber(offset + 32, $prms_refl_qty, value);
	}
	
	/**
	 * 納入指示数量. Delivery order qty..<p>
	 *
	 */
	public MCNumber dlv_inst_qty() {
		return getConstNumber(offset + 33, $dlv_inst_qty);
	}

	/**
	 * 納入指示数量. Delivery order qty..<p>
	 *
	 */
	public void dlv_inst_qty(MCNumber value) {
		setConstNumber(offset + 33, $dlv_inst_qty, value);
	}
	
	/**
	 * 納入指示数量. Delivery order qty..<p>
	 *
	 */
	public void dlv_inst_qty(int value) {
		setConstNumber(offset + 33, $dlv_inst_qty, value);
	}
	
	/**
	 * 納入指示数量. Delivery order qty..<p>
	 *
	 */
	public void dlv_inst_qty(long value) {
		setConstNumber(offset + 33, $dlv_inst_qty, value);
	}
	
	/**
	 * 納入指示数量. Delivery order qty..<p>
	 *
	 */
	public void dlv_inst_qty(float value) {
		setConstNumber(offset + 33, $dlv_inst_qty, value);
	}
	
	/**
	 * 納入指示数量. Delivery order qty..<p>
	 *
	 */
	public void dlv_inst_qty(double value) {
		setConstNumber(offset + 33, $dlv_inst_qty, value);
	}
	
	/**
	 * 納入指示回答受領数量. Delivery order replied received qty..<p>
	 *
	 */
	public MCNumber dlv_inst_prms_rcpt_qty() {
		return getConstNumber(offset + 34, $dlv_inst_prms_rcpt_qty);
	}

	/**
	 * 納入指示回答受領数量. Delivery order replied received qty..<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(MCNumber value) {
		setConstNumber(offset + 34, $dlv_inst_prms_rcpt_qty, value);
	}
	
	/**
	 * 納入指示回答受領数量. Delivery order replied received qty..<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(int value) {
		setConstNumber(offset + 34, $dlv_inst_prms_rcpt_qty, value);
	}
	
	/**
	 * 納入指示回答受領数量. Delivery order replied received qty..<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(long value) {
		setConstNumber(offset + 34, $dlv_inst_prms_rcpt_qty, value);
	}
	
	/**
	 * 納入指示回答受領数量. Delivery order replied received qty..<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(float value) {
		setConstNumber(offset + 34, $dlv_inst_prms_rcpt_qty, value);
	}
	
	/**
	 * 納入指示回答受領数量. Delivery order replied received qty..<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(double value) {
		setConstNumber(offset + 34, $dlv_inst_prms_rcpt_qty, value);
	}
	
	/**
	 * 納入指示回答反映済数量. Delivery order reply applied qty..<p>
	 *
	 */
	public MCNumber dlv_inst_prms_refl_qty() {
		return getConstNumber(offset + 35, $dlv_inst_prms_refl_qty);
	}

	/**
	 * 納入指示回答反映済数量. Delivery order reply applied qty..<p>
	 *
	 */
	public void dlv_inst_prms_refl_qty(MCNumber value) {
		setConstNumber(offset + 35, $dlv_inst_prms_refl_qty, value);
	}
	
	/**
	 * 納入指示回答反映済数量. Delivery order reply applied qty..<p>
	 *
	 */
	public void dlv_inst_prms_refl_qty(int value) {
		setConstNumber(offset + 35, $dlv_inst_prms_refl_qty, value);
	}
	
	/**
	 * 納入指示回答反映済数量. Delivery order reply applied qty..<p>
	 *
	 */
	public void dlv_inst_prms_refl_qty(long value) {
		setConstNumber(offset + 35, $dlv_inst_prms_refl_qty, value);
	}
	
	/**
	 * 納入指示回答反映済数量. Delivery order reply applied qty..<p>
	 *
	 */
	public void dlv_inst_prms_refl_qty(float value) {
		setConstNumber(offset + 35, $dlv_inst_prms_refl_qty, value);
	}
	
	/**
	 * 納入指示回答反映済数量. Delivery order reply applied qty..<p>
	 *
	 */
	public void dlv_inst_prms_refl_qty(double value) {
		setConstNumber(offset + 35, $dlv_inst_prms_refl_qty, value);
	}
	
	/**
	 * 再入荷予定数量. Scheduled re-receipt qty..<p>
	 *
	 */
	public MCNumber re_arr_schd_qty() {
		return getConstNumber(offset + 36, $re_arr_schd_qty);
	}

	/**
	 * 再入荷予定数量. Scheduled re-receipt qty..<p>
	 *
	 */
	public void re_arr_schd_qty(MCNumber value) {
		setConstNumber(offset + 36, $re_arr_schd_qty, value);
	}
	
	/**
	 * 再入荷予定数量. Scheduled re-receipt qty..<p>
	 *
	 */
	public void re_arr_schd_qty(int value) {
		setConstNumber(offset + 36, $re_arr_schd_qty, value);
	}
	
	/**
	 * 再入荷予定数量. Scheduled re-receipt qty..<p>
	 *
	 */
	public void re_arr_schd_qty(long value) {
		setConstNumber(offset + 36, $re_arr_schd_qty, value);
	}
	
	/**
	 * 再入荷予定数量. Scheduled re-receipt qty..<p>
	 *
	 */
	public void re_arr_schd_qty(float value) {
		setConstNumber(offset + 36, $re_arr_schd_qty, value);
	}
	
	/**
	 * 再入荷予定数量. Scheduled re-receipt qty..<p>
	 *
	 */
	public void re_arr_schd_qty(double value) {
		setConstNumber(offset + 36, $re_arr_schd_qty, value);
	}
	
	/**
	 * 受領インボイス数量. Purchase invoice qty..<p>
	 *
	 */
	public MCNumber rcpt_iv_qty() {
		return getConstNumber(offset + 37, $rcpt_iv_qty);
	}

	/**
	 * 受領インボイス数量. Purchase invoice qty..<p>
	 *
	 */
	public void rcpt_iv_qty(MCNumber value) {
		setConstNumber(offset + 37, $rcpt_iv_qty, value);
	}
	
	/**
	 * 受領インボイス数量. Purchase invoice qty..<p>
	 *
	 */
	public void rcpt_iv_qty(int value) {
		setConstNumber(offset + 37, $rcpt_iv_qty, value);
	}
	
	/**
	 * 受領インボイス数量. Purchase invoice qty..<p>
	 *
	 */
	public void rcpt_iv_qty(long value) {
		setConstNumber(offset + 37, $rcpt_iv_qty, value);
	}
	
	/**
	 * 受領インボイス数量. Purchase invoice qty..<p>
	 *
	 */
	public void rcpt_iv_qty(float value) {
		setConstNumber(offset + 37, $rcpt_iv_qty, value);
	}
	
	/**
	 * 受領インボイス数量. Purchase invoice qty..<p>
	 *
	 */
	public void rcpt_iv_qty(double value) {
		setConstNumber(offset + 37, $rcpt_iv_qty, value);
	}
	
	/**
	 * 入荷数量. Receipt qty..<p>
	 *
	 */
	public MCNumber arr_qty() {
		return getConstNumber(offset + 38, $arr_qty);
	}

	/**
	 * 入荷数量. Receipt qty..<p>
	 *
	 */
	public void arr_qty(MCNumber value) {
		setConstNumber(offset + 38, $arr_qty, value);
	}
	
	/**
	 * 入荷数量. Receipt qty..<p>
	 *
	 */
	public void arr_qty(int value) {
		setConstNumber(offset + 38, $arr_qty, value);
	}
	
	/**
	 * 入荷数量. Receipt qty..<p>
	 *
	 */
	public void arr_qty(long value) {
		setConstNumber(offset + 38, $arr_qty, value);
	}
	
	/**
	 * 入荷数量. Receipt qty..<p>
	 *
	 */
	public void arr_qty(float value) {
		setConstNumber(offset + 38, $arr_qty, value);
	}
	
	/**
	 * 入荷数量. Receipt qty..<p>
	 *
	 */
	public void arr_qty(double value) {
		setConstNumber(offset + 38, $arr_qty, value);
	}
	
	/**
	 * 仕入数量. Purchase qty..<p>
	 *
	 */
	public MCNumber purc_qty() {
		return getConstNumber(offset + 39, $purc_qty);
	}

	/**
	 * 仕入数量. Purchase qty..<p>
	 *
	 */
	public void purc_qty(MCNumber value) {
		setConstNumber(offset + 39, $purc_qty, value);
	}
	
	/**
	 * 仕入数量. Purchase qty..<p>
	 *
	 */
	public void purc_qty(int value) {
		setConstNumber(offset + 39, $purc_qty, value);
	}
	
	/**
	 * 仕入数量. Purchase qty..<p>
	 *
	 */
	public void purc_qty(long value) {
		setConstNumber(offset + 39, $purc_qty, value);
	}
	
	/**
	 * 仕入数量. Purchase qty..<p>
	 *
	 */
	public void purc_qty(float value) {
		setConstNumber(offset + 39, $purc_qty, value);
	}
	
	/**
	 * 仕入数量. Purchase qty..<p>
	 *
	 */
	public void purc_qty(double value) {
		setConstNumber(offset + 39, $purc_qty, value);
	}
	
	/**
	 * 売上返品数量. Sales return qty..<p>
	 *
	 */
	public MCNumber sls_ret_qty() {
		return getConstNumber(offset + 40, $sls_ret_qty);
	}

	/**
	 * 売上返品数量. Sales return qty..<p>
	 *
	 */
	public void sls_ret_qty(MCNumber value) {
		setConstNumber(offset + 40, $sls_ret_qty, value);
	}
	
	/**
	 * 売上返品数量. Sales return qty..<p>
	 *
	 */
	public void sls_ret_qty(int value) {
		setConstNumber(offset + 40, $sls_ret_qty, value);
	}
	
	/**
	 * 売上返品数量. Sales return qty..<p>
	 *
	 */
	public void sls_ret_qty(long value) {
		setConstNumber(offset + 40, $sls_ret_qty, value);
	}
	
	/**
	 * 売上返品数量. Sales return qty..<p>
	 *
	 */
	public void sls_ret_qty(float value) {
		setConstNumber(offset + 40, $sls_ret_qty, value);
	}
	
	/**
	 * 売上返品数量. Sales return qty..<p>
	 *
	 */
	public void sls_ret_qty(double value) {
		setConstNumber(offset + 40, $sls_ret_qty, value);
	}
	
	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 41, $abort_flg);
	}

	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 41, $abort_flg, value);
	}

	/**
	 * 入荷予定打切数量. Cancelled remaining receipt schedule qty..<p>
	 *
	 */
	public MCNumber arr_schd_abort_qty() {
		return getConstNumber(offset + 42, $arr_schd_abort_qty);
	}

	/**
	 * 入荷予定打切数量. Cancelled remaining receipt schedule qty..<p>
	 *
	 */
	public void arr_schd_abort_qty(MCNumber value) {
		setConstNumber(offset + 42, $arr_schd_abort_qty, value);
	}
	
	/**
	 * 入荷予定打切数量. Cancelled remaining receipt schedule qty..<p>
	 *
	 */
	public void arr_schd_abort_qty(int value) {
		setConstNumber(offset + 42, $arr_schd_abort_qty, value);
	}
	
	/**
	 * 入荷予定打切数量. Cancelled remaining receipt schedule qty..<p>
	 *
	 */
	public void arr_schd_abort_qty(long value) {
		setConstNumber(offset + 42, $arr_schd_abort_qty, value);
	}
	
	/**
	 * 入荷予定打切数量. Cancelled remaining receipt schedule qty..<p>
	 *
	 */
	public void arr_schd_abort_qty(float value) {
		setConstNumber(offset + 42, $arr_schd_abort_qty, value);
	}
	
	/**
	 * 入荷予定打切数量. Cancelled remaining receipt schedule qty..<p>
	 *
	 */
	public void arr_schd_abort_qty(double value) {
		setConstNumber(offset + 42, $arr_schd_abort_qty, value);
	}
	
	/**
	 * 仕入予定打切数量. Cancelled remaining purchase schedule qty..<p>
	 *
	 */
	public MCNumber purc_schd_abort_qty() {
		return getConstNumber(offset + 43, $purc_schd_abort_qty);
	}

	/**
	 * 仕入予定打切数量. Cancelled remaining purchase schedule qty..<p>
	 *
	 */
	public void purc_schd_abort_qty(MCNumber value) {
		setConstNumber(offset + 43, $purc_schd_abort_qty, value);
	}
	
	/**
	 * 仕入予定打切数量. Cancelled remaining purchase schedule qty..<p>
	 *
	 */
	public void purc_schd_abort_qty(int value) {
		setConstNumber(offset + 43, $purc_schd_abort_qty, value);
	}
	
	/**
	 * 仕入予定打切数量. Cancelled remaining purchase schedule qty..<p>
	 *
	 */
	public void purc_schd_abort_qty(long value) {
		setConstNumber(offset + 43, $purc_schd_abort_qty, value);
	}
	
	/**
	 * 仕入予定打切数量. Cancelled remaining purchase schedule qty..<p>
	 *
	 */
	public void purc_schd_abort_qty(float value) {
		setConstNumber(offset + 43, $purc_schd_abort_qty, value);
	}
	
	/**
	 * 仕入予定打切数量. Cancelled remaining purchase schedule qty..<p>
	 *
	 */
	public void purc_schd_abort_qty(double value) {
		setConstNumber(offset + 43, $purc_schd_abort_qty, value);
	}
	
	/**
	 * 売上返品予定打切数量. Cancelled remaining sales return schedule qty..<p>
	 *
	 */
	public MCNumber sls_ret_schd_abort_qty() {
		return getConstNumber(offset + 44, $sls_ret_schd_abort_qty);
	}

	/**
	 * 売上返品予定打切数量. Cancelled remaining sales return schedule qty..<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(MCNumber value) {
		setConstNumber(offset + 44, $sls_ret_schd_abort_qty, value);
	}
	
	/**
	 * 売上返品予定打切数量. Cancelled remaining sales return schedule qty..<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(int value) {
		setConstNumber(offset + 44, $sls_ret_schd_abort_qty, value);
	}
	
	/**
	 * 売上返品予定打切数量. Cancelled remaining sales return schedule qty..<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(long value) {
		setConstNumber(offset + 44, $sls_ret_schd_abort_qty, value);
	}
	
	/**
	 * 売上返品予定打切数量. Cancelled remaining sales return schedule qty..<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(float value) {
		setConstNumber(offset + 44, $sls_ret_schd_abort_qty, value);
	}
	
	/**
	 * 売上返品予定打切数量. Cancelled remaining sales return schedule qty..<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(double value) {
		setConstNumber(offset + 44, $sls_ret_schd_abort_qty, value);
	}
	
	/**
	 * 検収不良数量. Acceptance defective qty..<p>
	 *
	 */
	public MCNumber accpt_dfct_qty() {
		return getConstNumber(offset + 45, $accpt_dfct_qty);
	}

	/**
	 * 検収不良数量. Acceptance defective qty..<p>
	 *
	 */
	public void accpt_dfct_qty(MCNumber value) {
		setConstNumber(offset + 45, $accpt_dfct_qty, value);
	}
	
	/**
	 * 検収不良数量. Acceptance defective qty..<p>
	 *
	 */
	public void accpt_dfct_qty(int value) {
		setConstNumber(offset + 45, $accpt_dfct_qty, value);
	}
	
	/**
	 * 検収不良数量. Acceptance defective qty..<p>
	 *
	 */
	public void accpt_dfct_qty(long value) {
		setConstNumber(offset + 45, $accpt_dfct_qty, value);
	}
	
	/**
	 * 検収不良数量. Acceptance defective qty..<p>
	 *
	 */
	public void accpt_dfct_qty(float value) {
		setConstNumber(offset + 45, $accpt_dfct_qty, value);
	}
	
	/**
	 * 検収不良数量. Acceptance defective qty..<p>
	 *
	 */
	public void accpt_dfct_qty(double value) {
		setConstNumber(offset + 45, $accpt_dfct_qty, value);
	}
	
	/**
	 * 標準納入ＬＴ. Standard delivery LT.<p>
	 *
	 */
	public MCNumber std_purc_lt() {
		return getConstNumber(offset + 46, $std_purc_lt);
	}

	/**
	 * 標準納入ＬＴ. Standard delivery LT.<p>
	 *
	 */
	public void std_purc_lt(MCNumber value) {
		setConstNumber(offset + 46, $std_purc_lt, value);
	}
	
	/**
	 * 標準納入ＬＴ. Standard delivery LT.<p>
	 *
	 */
	public void std_purc_lt(int value) {
		setConstNumber(offset + 46, $std_purc_lt, value);
	}
	
	/**
	 * 標準納入ＬＴ. Standard delivery LT.<p>
	 *
	 */
	public void std_purc_lt(long value) {
		setConstNumber(offset + 46, $std_purc_lt, value);
	}
	
	/**
	 * 標準納入ＬＴ. Standard delivery LT.<p>
	 *
	 */
	public void std_purc_lt(float value) {
		setConstNumber(offset + 46, $std_purc_lt, value);
	}
	
	/**
	 * 標準納入ＬＴ. Standard delivery LT.<p>
	 *
	 */
	public void std_purc_lt(double value) {
		setConstNumber(offset + 46, $std_purc_lt, value);
	}
	
	/**
	 * 納入ＬＴ. Delivery LT.<p>
	 *
	 */
	public MCNumber act_purc_lt() {
		return getConstNumber(offset + 47, $act_purc_lt);
	}

	/**
	 * 納入ＬＴ. Delivery LT.<p>
	 *
	 */
	public void act_purc_lt(MCNumber value) {
		setConstNumber(offset + 47, $act_purc_lt, value);
	}
	
	/**
	 * 納入ＬＴ. Delivery LT.<p>
	 *
	 */
	public void act_purc_lt(int value) {
		setConstNumber(offset + 47, $act_purc_lt, value);
	}
	
	/**
	 * 納入ＬＴ. Delivery LT.<p>
	 *
	 */
	public void act_purc_lt(long value) {
		setConstNumber(offset + 47, $act_purc_lt, value);
	}
	
	/**
	 * 納入ＬＴ. Delivery LT.<p>
	 *
	 */
	public void act_purc_lt(float value) {
		setConstNumber(offset + 47, $act_purc_lt, value);
	}
	
	/**
	 * 納入ＬＴ. Delivery LT.<p>
	 *
	 */
	public void act_purc_lt(double value) {
		setConstNumber(offset + 47, $act_purc_lt, value);
	}
	
	/**
	 * 理由ＣＤ. Reason cd..<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 48, $rsn_cd);
	}

	/**
	 * 理由ＣＤ. Reason cd..<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 48, $rsn_cd, value);
	}

	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 49, $bd_dpt_cd);
	}

	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 49, $bd_dpt_cd, value);
	}

	/**
	 * 負担ワーキンググループＣＤ. Charged WG cd..<p>
	 *
	 */
	public String bd_wg_cd() {
		return getConstString(offset + 50, $bd_wg_cd);
	}

	/**
	 * 負担ワーキンググループＣＤ. Charged WG cd..<p>
	 *
	 */
	public void bd_wg_cd(String value) {
		setConstString(offset + 50, $bd_wg_cd, value);
	}

	/**
	 * 仕入直送ＦＬＧ. Direct delivery flg..<p>
	 *
	 */
	public boolean purc_ddlv_flg() {
		return getConstBoolean(offset + 51, $purc_ddlv_flg);
	}

	/**
	 * 仕入直送ＦＬＧ. Direct delivery flg..<p>
	 *
	 */
	public void purc_ddlv_flg(boolean value) {
		setConstBoolean(offset + 51, $purc_ddlv_flg, value);
	}

	/**
	 * 購買状況区分. Purchase status type.<p>
	 *
	 */
	public String purc_sts_typ() {
		return getConstString(offset + 52, $purc_sts_typ);
	}

	/**
	 * 購買状況区分. Purchase status type.<p>
	 *
	 */
	public void purc_sts_typ(String value) {
		setConstString(offset + 52, $purc_sts_typ, value);
	}

	/**
	 * 回答納入日遅れＦＬＧ. Replied delivery date delay flg..<p>
	 *
	 */
	public boolean prms_dlv_dt_overdue_flg() {
		return getConstBoolean(offset + 53, $prms_dlv_dt_overdue_flg);
	}

	/**
	 * 回答納入日遅れＦＬＧ. Replied delivery date delay flg..<p>
	 *
	 */
	public void prms_dlv_dt_overdue_flg(boolean value) {
		setConstBoolean(offset + 53, $prms_dlv_dt_overdue_flg, value);
	}

	/**
	 * 納入希望日遅れＦＬＧ. Delivery dates delayed flg..<p>
	 *
	 */
	public boolean dlv_rqst_dt_overdue_flg() {
		return getConstBoolean(offset + 54, $dlv_rqst_dt_overdue_flg);
	}

	/**
	 * 納入希望日遅れＦＬＧ. Delivery dates delayed flg..<p>
	 *
	 */
	public void dlv_rqst_dt_overdue_flg(boolean value) {
		setConstBoolean(offset + 54, $dlv_rqst_dt_overdue_flg, value);
	}

	/**
	 * 入荷予定分割ＦＬＧ. Scheduled receipt split flg..<p>
	 *
	 */
	public boolean arr_schd_split_flg() {
		return getConstBoolean(offset + 55, $arr_schd_split_flg);
	}

	/**
	 * 入荷予定分割ＦＬＧ. Scheduled receipt split flg..<p>
	 *
	 */
	public void arr_schd_split_flg(boolean value) {
		setConstBoolean(offset + 55, $arr_schd_split_flg, value);
	}

	/**
	 * 入荷予定反映済ＦＬＧ. Receipt schedule applied flg..<p>
	 *
	 */
	public boolean arr_schd_refl_flg() {
		return getConstBoolean(offset + 56, $arr_schd_refl_flg);
	}

	/**
	 * 入荷予定反映済ＦＬＧ. Receipt schedule applied flg..<p>
	 *
	 */
	public void arr_schd_refl_flg(boolean value) {
		setConstBoolean(offset + 56, $arr_schd_refl_flg, value);
	}

	/**
	 * 入荷完了ＦＬＧ. Receipt completed flg..<p>
	 *
	 */
	public boolean arr_cmpl_flg() {
		return getConstBoolean(offset + 57, $arr_cmpl_flg);
	}

	/**
	 * 入荷完了ＦＬＧ. Receipt completed flg..<p>
	 *
	 */
	public void arr_cmpl_flg(boolean value) {
		setConstBoolean(offset + 57, $arr_cmpl_flg, value);
	}

	/**
	 * 仕入完了ＦＬＧ. Purchase completion flg..<p>
	 *
	 */
	public boolean purc_cmpl_flg() {
		return getConstBoolean(offset + 58, $purc_cmpl_flg);
	}

	/**
	 * 仕入完了ＦＬＧ. Purchase completion flg..<p>
	 *
	 */
	public void purc_cmpl_flg(boolean value) {
		setConstBoolean(offset + 58, $purc_cmpl_flg, value);
	}

	/**
	 * 売上返品完了ＦＬＧ. Sales return completion flg..<p>
	 *
	 */
	public boolean sls_ret_cmpl_flg() {
		return getConstBoolean(offset + 59, $sls_ret_cmpl_flg);
	}

	/**
	 * 売上返品完了ＦＬＧ. Sales return completion flg..<p>
	 *
	 */
	public void sls_ret_cmpl_flg(boolean value) {
		setConstBoolean(offset + 59, $sls_ret_cmpl_flg, value);
	}

	/**
	 * 入荷連絡備考. Receipt contact remarks.<p>
	 *
	 */
	public String arr_cnt_rmrks() {
		return getConstString(offset + 60, $arr_cnt_rmrks);
	}

	/**
	 * 入荷連絡備考. Receipt contact remarks.<p>
	 *
	 */
	public void arr_cnt_rmrks(String value) {
		setConstString(offset + 60, $arr_cnt_rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 61, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 61, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 62, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 62, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 63, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 63, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 64, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 64, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 65, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 65, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 66, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 66, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 67, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 67, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 68, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 68, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 68, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 68, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 68, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 68, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 69, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 69, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 70, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 70, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 71, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 71, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 72, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 72, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 73, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 73, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($sls_ret_schd_d_no.equalsIgnoreCase(name)) {
			return sls_ret_schd_d_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($sret_fr_cd.equalsIgnoreCase(name)) {
			return sret_fr_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($ret_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return ret_dlv_slip_d_no();
		}
		if ($ret_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return ret_stk_arrv_bp_cd();
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
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			return bd_wg_cd();
		}
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			return purc_sts_typ();
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($prms_rcpt_qty.equalsIgnoreCase(name)) {
			return prms_rcpt_qty();
		}
		if ($prms_refl_qty.equalsIgnoreCase(name)) {
			return prms_refl_qty();
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			return dlv_inst_qty();
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			return dlv_inst_prms_rcpt_qty();
		}
		if ($dlv_inst_prms_refl_qty.equalsIgnoreCase(name)) {
			return dlv_inst_prms_refl_qty();
		}
		if ($re_arr_schd_qty.equalsIgnoreCase(name)) {
			return re_arr_schd_qty();
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			return rcpt_iv_qty();
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
		if ($arr_schd_abort_qty.equalsIgnoreCase(name)) {
			return arr_schd_abort_qty();
		}
		if ($purc_schd_abort_qty.equalsIgnoreCase(name)) {
			return purc_schd_abort_qty();
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			return sls_ret_schd_abort_qty();
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			return accpt_dfct_qty();
		}
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			return std_purc_lt();
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			return act_purc_lt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($prms_rcpt_dt.equalsIgnoreCase(name)) {
			return prms_rcpt_dt();
		}
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			return prms_dlv_dt();
		}
		if ($prms_refl_dt.equalsIgnoreCase(name)) {
			return prms_refl_dt();
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			return dlv_inst_dt();
		}
		if ($dlv_inst_prms_rcpt_dt.equalsIgnoreCase(name)) {
			return dlv_inst_prms_rcpt_dt();
		}
		if ($dlv_inst_prms_refl_dt.equalsIgnoreCase(name)) {
			return dlv_inst_prms_refl_dt();
		}
		if ($arr_schd_tm.equalsIgnoreCase(name)) {
			return arr_schd_tm();
		}
		if ($arr_tm.equalsIgnoreCase(name)) {
			return arr_tm();
		}
		if ($purc_dt.equalsIgnoreCase(name)) {
			return purc_dt();
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
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_flg();
		}
		if ($prms_dlv_dt_overdue_flg.equalsIgnoreCase(name)) {
			return prms_dlv_dt_overdue_flg();
		}
		if ($dlv_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_overdue_flg();
		}
		if ($arr_schd_split_flg.equalsIgnoreCase(name)) {
			return arr_schd_split_flg();
		}
		if ($arr_schd_refl_flg.equalsIgnoreCase(name)) {
			return arr_schd_refl_flg();
		}
		if ($arr_cmpl_flg.equalsIgnoreCase(name)) {
			return arr_cmpl_flg();
		}
		if ($purc_cmpl_flg.equalsIgnoreCase(name)) {
			return purc_cmpl_flg();
		}
		if ($sls_ret_cmpl_flg.equalsIgnoreCase(name)) {
			return sls_ret_cmpl_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($sls_ret_schd_d_no.equalsIgnoreCase(name)) {
			return sls_ret_schd_d_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($sret_fr_cd.equalsIgnoreCase(name)) {
			return sret_fr_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($ret_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return ret_dlv_slip_d_no();
		}
		if ($ret_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return ret_stk_arrv_bp_cd();
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
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			return bd_wg_cd();
		}
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			return purc_sts_typ();
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($prms_rcpt_qty.equalsIgnoreCase(name)) {
			return prms_rcpt_qty();
		}
		if ($prms_refl_qty.equalsIgnoreCase(name)) {
			return prms_refl_qty();
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			return dlv_inst_qty();
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			return dlv_inst_prms_rcpt_qty();
		}
		if ($dlv_inst_prms_refl_qty.equalsIgnoreCase(name)) {
			return dlv_inst_prms_refl_qty();
		}
		if ($re_arr_schd_qty.equalsIgnoreCase(name)) {
			return re_arr_schd_qty();
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			return rcpt_iv_qty();
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
		if ($arr_schd_abort_qty.equalsIgnoreCase(name)) {
			return arr_schd_abort_qty();
		}
		if ($purc_schd_abort_qty.equalsIgnoreCase(name)) {
			return purc_schd_abort_qty();
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			return sls_ret_schd_abort_qty();
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			return accpt_dfct_qty();
		}
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			return std_purc_lt();
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			return act_purc_lt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($prms_rcpt_dt.equalsIgnoreCase(name)) {
			return prms_rcpt_dt();
		}
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			return prms_dlv_dt();
		}
		if ($prms_refl_dt.equalsIgnoreCase(name)) {
			return prms_refl_dt();
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			return dlv_inst_dt();
		}
		if ($dlv_inst_prms_rcpt_dt.equalsIgnoreCase(name)) {
			return dlv_inst_prms_rcpt_dt();
		}
		if ($dlv_inst_prms_refl_dt.equalsIgnoreCase(name)) {
			return dlv_inst_prms_refl_dt();
		}
		if ($arr_schd_tm.equalsIgnoreCase(name)) {
			return arr_schd_tm();
		}
		if ($arr_tm.equalsIgnoreCase(name)) {
			return arr_tm();
		}
		if ($purc_dt.equalsIgnoreCase(name)) {
			return purc_dt();
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
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_flg();
		}
		if ($prms_dlv_dt_overdue_flg.equalsIgnoreCase(name)) {
			return prms_dlv_dt_overdue_flg();
		}
		if ($dlv_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_overdue_flg();
		}
		if ($arr_schd_split_flg.equalsIgnoreCase(name)) {
			return arr_schd_split_flg();
		}
		if ($arr_schd_refl_flg.equalsIgnoreCase(name)) {
			return arr_schd_refl_flg();
		}
		if ($arr_cmpl_flg.equalsIgnoreCase(name)) {
			return arr_cmpl_flg();
		}
		if ($purc_cmpl_flg.equalsIgnoreCase(name)) {
			return purc_cmpl_flg();
		}
		if ($sls_ret_cmpl_flg.equalsIgnoreCase(name)) {
			return sls_ret_cmpl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
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
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($sls_ret_schd_d_no.equalsIgnoreCase(name)) {
			sls_ret_schd_d_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
			return;
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			rqst_usr_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($sret_fr_cd.equalsIgnoreCase(name)) {
			sret_fr_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($ret_dlv_slip_d_no.equalsIgnoreCase(name)) {
			ret_dlv_slip_d_no(value);
			return;
		}
		if ($ret_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			ret_stk_arrv_bp_cd(value);
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
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			bd_wg_cd(value);
			return;
		}
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			purc_sts_typ(value);
			return;
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
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
		if ($prms_rcpt_qty.equalsIgnoreCase(name)) {
			prms_rcpt_qty(value);
			return;
		}
		if ($prms_refl_qty.equalsIgnoreCase(name)) {
			prms_refl_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_refl_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_refl_qty(value);
			return;
		}
		if ($re_arr_schd_qty.equalsIgnoreCase(name)) {
			re_arr_schd_qty(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
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
		if ($arr_schd_abort_qty.equalsIgnoreCase(name)) {
			arr_schd_abort_qty(value);
			return;
		}
		if ($purc_schd_abort_qty.equalsIgnoreCase(name)) {
			purc_schd_abort_qty(value);
			return;
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
			return;
		}
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			std_purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
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
		if ($prms_rcpt_qty.equalsIgnoreCase(name)) {
			prms_rcpt_qty(value);
			return;
		}
		if ($prms_refl_qty.equalsIgnoreCase(name)) {
			prms_refl_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_refl_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_refl_qty(value);
			return;
		}
		if ($re_arr_schd_qty.equalsIgnoreCase(name)) {
			re_arr_schd_qty(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
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
		if ($arr_schd_abort_qty.equalsIgnoreCase(name)) {
			arr_schd_abort_qty(value);
			return;
		}
		if ($purc_schd_abort_qty.equalsIgnoreCase(name)) {
			purc_schd_abort_qty(value);
			return;
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
			return;
		}
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			std_purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
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
		if ($prms_rcpt_qty.equalsIgnoreCase(name)) {
			prms_rcpt_qty(value);
			return;
		}
		if ($prms_refl_qty.equalsIgnoreCase(name)) {
			prms_refl_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_refl_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_refl_qty(value);
			return;
		}
		if ($re_arr_schd_qty.equalsIgnoreCase(name)) {
			re_arr_schd_qty(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
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
		if ($arr_schd_abort_qty.equalsIgnoreCase(name)) {
			arr_schd_abort_qty(value);
			return;
		}
		if ($purc_schd_abort_qty.equalsIgnoreCase(name)) {
			purc_schd_abort_qty(value);
			return;
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
			return;
		}
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			std_purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
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
		if ($prms_rcpt_qty.equalsIgnoreCase(name)) {
			prms_rcpt_qty(value);
			return;
		}
		if ($prms_refl_qty.equalsIgnoreCase(name)) {
			prms_refl_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_refl_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_refl_qty(value);
			return;
		}
		if ($re_arr_schd_qty.equalsIgnoreCase(name)) {
			re_arr_schd_qty(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
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
		if ($arr_schd_abort_qty.equalsIgnoreCase(name)) {
			arr_schd_abort_qty(value);
			return;
		}
		if ($purc_schd_abort_qty.equalsIgnoreCase(name)) {
			purc_schd_abort_qty(value);
			return;
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
			return;
		}
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			std_purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
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
		if ($prms_rcpt_qty.equalsIgnoreCase(name)) {
			prms_rcpt_qty(value);
			return;
		}
		if ($prms_refl_qty.equalsIgnoreCase(name)) {
			prms_refl_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_refl_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_refl_qty(value);
			return;
		}
		if ($re_arr_schd_qty.equalsIgnoreCase(name)) {
			re_arr_schd_qty(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
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
		if ($arr_schd_abort_qty.equalsIgnoreCase(name)) {
			arr_schd_abort_qty(value);
			return;
		}
		if ($purc_schd_abort_qty.equalsIgnoreCase(name)) {
			purc_schd_abort_qty(value);
			return;
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
			return;
		}
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			std_purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($prms_rcpt_dt.equalsIgnoreCase(name)) {
			prms_rcpt_dt(value);
			return;
		}
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			prms_dlv_dt(value);
			return;
		}
		if ($prms_refl_dt.equalsIgnoreCase(name)) {
			prms_refl_dt(value);
			return;
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			dlv_inst_dt(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_dt.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_dt(value);
			return;
		}
		if ($dlv_inst_prms_refl_dt.equalsIgnoreCase(name)) {
			dlv_inst_prms_refl_dt(value);
			return;
		}
		if ($arr_schd_tm.equalsIgnoreCase(name)) {
			arr_schd_tm(value);
			return;
		}
		if ($arr_tm.equalsIgnoreCase(name)) {
			arr_tm(value);
			return;
		}
		if ($purc_dt.equalsIgnoreCase(name)) {
			purc_dt(value);
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
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			purc_ddlv_flg(value);
			return;
		}
		if ($prms_dlv_dt_overdue_flg.equalsIgnoreCase(name)) {
			prms_dlv_dt_overdue_flg(value);
			return;
		}
		if ($dlv_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			dlv_rqst_dt_overdue_flg(value);
			return;
		}
		if ($arr_schd_split_flg.equalsIgnoreCase(name)) {
			arr_schd_split_flg(value);
			return;
		}
		if ($arr_schd_refl_flg.equalsIgnoreCase(name)) {
			arr_schd_refl_flg(value);
			return;
		}
		if ($arr_cmpl_flg.equalsIgnoreCase(name)) {
			arr_cmpl_flg(value);
			return;
		}
		if ($purc_cmpl_flg.equalsIgnoreCase(name)) {
			purc_cmpl_flg(value);
			return;
		}
		if ($sls_ret_cmpl_flg.equalsIgnoreCase(name)) {
			sls_ret_cmpl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
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
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($sls_ret_schd_d_no.equalsIgnoreCase(name)) {
			sls_ret_schd_d_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
			return;
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			rqst_usr_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($sret_fr_cd.equalsIgnoreCase(name)) {
			sret_fr_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($ret_dlv_slip_d_no.equalsIgnoreCase(name)) {
			ret_dlv_slip_d_no(value);
			return;
		}
		if ($ret_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			ret_stk_arrv_bp_cd(value);
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
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			bd_wg_cd(value);
			return;
		}
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			purc_sts_typ(value);
			return;
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
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
		if ($prms_rcpt_qty.equalsIgnoreCase(name)) {
			prms_rcpt_qty(value);
			return;
		}
		if ($prms_refl_qty.equalsIgnoreCase(name)) {
			prms_refl_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_refl_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_refl_qty(value);
			return;
		}
		if ($re_arr_schd_qty.equalsIgnoreCase(name)) {
			re_arr_schd_qty(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
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
		if ($arr_schd_abort_qty.equalsIgnoreCase(name)) {
			arr_schd_abort_qty(value);
			return;
		}
		if ($purc_schd_abort_qty.equalsIgnoreCase(name)) {
			purc_schd_abort_qty(value);
			return;
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
			return;
		}
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			std_purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
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
		if ($prms_rcpt_qty.equalsIgnoreCase(name)) {
			prms_rcpt_qty(value);
			return;
		}
		if ($prms_refl_qty.equalsIgnoreCase(name)) {
			prms_refl_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_refl_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_refl_qty(value);
			return;
		}
		if ($re_arr_schd_qty.equalsIgnoreCase(name)) {
			re_arr_schd_qty(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
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
		if ($arr_schd_abort_qty.equalsIgnoreCase(name)) {
			arr_schd_abort_qty(value);
			return;
		}
		if ($purc_schd_abort_qty.equalsIgnoreCase(name)) {
			purc_schd_abort_qty(value);
			return;
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
			return;
		}
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			std_purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
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
		if ($prms_rcpt_qty.equalsIgnoreCase(name)) {
			prms_rcpt_qty(value);
			return;
		}
		if ($prms_refl_qty.equalsIgnoreCase(name)) {
			prms_refl_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_refl_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_refl_qty(value);
			return;
		}
		if ($re_arr_schd_qty.equalsIgnoreCase(name)) {
			re_arr_schd_qty(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
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
		if ($arr_schd_abort_qty.equalsIgnoreCase(name)) {
			arr_schd_abort_qty(value);
			return;
		}
		if ($purc_schd_abort_qty.equalsIgnoreCase(name)) {
			purc_schd_abort_qty(value);
			return;
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
			return;
		}
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			std_purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
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
		if ($prms_rcpt_qty.equalsIgnoreCase(name)) {
			prms_rcpt_qty(value);
			return;
		}
		if ($prms_refl_qty.equalsIgnoreCase(name)) {
			prms_refl_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_refl_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_refl_qty(value);
			return;
		}
		if ($re_arr_schd_qty.equalsIgnoreCase(name)) {
			re_arr_schd_qty(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
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
		if ($arr_schd_abort_qty.equalsIgnoreCase(name)) {
			arr_schd_abort_qty(value);
			return;
		}
		if ($purc_schd_abort_qty.equalsIgnoreCase(name)) {
			purc_schd_abort_qty(value);
			return;
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
			return;
		}
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			std_purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
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
		if ($prms_rcpt_qty.equalsIgnoreCase(name)) {
			prms_rcpt_qty(value);
			return;
		}
		if ($prms_refl_qty.equalsIgnoreCase(name)) {
			prms_refl_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_refl_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_refl_qty(value);
			return;
		}
		if ($re_arr_schd_qty.equalsIgnoreCase(name)) {
			re_arr_schd_qty(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
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
		if ($arr_schd_abort_qty.equalsIgnoreCase(name)) {
			arr_schd_abort_qty(value);
			return;
		}
		if ($purc_schd_abort_qty.equalsIgnoreCase(name)) {
			purc_schd_abort_qty(value);
			return;
		}
		if ($sls_ret_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_ret_schd_abort_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
			return;
		}
		if ($std_purc_lt.equalsIgnoreCase(name)) {
			std_purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($prms_rcpt_dt.equalsIgnoreCase(name)) {
			prms_rcpt_dt(value);
			return;
		}
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			prms_dlv_dt(value);
			return;
		}
		if ($prms_refl_dt.equalsIgnoreCase(name)) {
			prms_refl_dt(value);
			return;
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			dlv_inst_dt(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_dt.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_dt(value);
			return;
		}
		if ($dlv_inst_prms_refl_dt.equalsIgnoreCase(name)) {
			dlv_inst_prms_refl_dt(value);
			return;
		}
		if ($arr_schd_tm.equalsIgnoreCase(name)) {
			arr_schd_tm(value);
			return;
		}
		if ($arr_tm.equalsIgnoreCase(name)) {
			arr_tm(value);
			return;
		}
		if ($purc_dt.equalsIgnoreCase(name)) {
			purc_dt(value);
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
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			purc_ddlv_flg(value);
			return;
		}
		if ($prms_dlv_dt_overdue_flg.equalsIgnoreCase(name)) {
			prms_dlv_dt_overdue_flg(value);
			return;
		}
		if ($dlv_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			dlv_rqst_dt_overdue_flg(value);
			return;
		}
		if ($arr_schd_split_flg.equalsIgnoreCase(name)) {
			arr_schd_split_flg(value);
			return;
		}
		if ($arr_schd_refl_flg.equalsIgnoreCase(name)) {
			arr_schd_refl_flg(value);
			return;
		}
		if ($arr_cmpl_flg.equalsIgnoreCase(name)) {
			arr_cmpl_flg(value);
			return;
		}
		if ($purc_cmpl_flg.equalsIgnoreCase(name)) {
			purc_cmpl_flg(value);
			return;
		}
		if ($sls_ret_cmpl_flg.equalsIgnoreCase(name)) {
			sls_ret_cmpl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
