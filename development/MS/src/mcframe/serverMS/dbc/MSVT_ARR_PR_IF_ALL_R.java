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
 * "入荷進捗送信ＩＦビュー // Receipt progress export IF view"DBコンテナRowクラスです。<p>
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
 *  	<td>data_lno</td>
 *  	<td>N</td>
 *  	<td>15,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>データ行ＮＯ</td>
 *  	<td>Data row No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>co_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会社ＣＤ</td>
 *  	<td>Company cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>data_no</td>
 *  	<td>N</td>
 *  	<td>15,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>データＮＯ</td>
 *  	<td>Data No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>exe_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＰＧ実行状況区分</td>
 *  	<td>PG execution status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>data_crud_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>データ更新区分</td>
 *  	<td>Data update type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ext_sys_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外部システムＣＤ</td>
 *  	<td>External system cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_st_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門マスタ適用開始日</td>
 *  	<td>Dept. master application start date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>data_upd_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>送信元レコード更新日時</td>
 *  	<td>Update date and time of source record</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bi_not_send_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＢＩ送信対象外ＦＬＧ</td>
 *  	<td>BI not to be exported flg.</td>
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
 *  	<td>trd_cd</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>N</td>
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
 *  	<td>po_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注明細ＮＯ</td>
 *  	<td>PO details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_ret_schd_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上返品予定明細ＮＯ</td>
 *  	<td>Sales return schedule details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_slip_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品書明細ＮＯ</td>
 *  	<td>Delivery note details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>iv_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>インボイス明細ＮＯ</td>
 *  	<td>Invoice details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqst_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼元部門ＣＤ</td>
 *  	<td>Requesting dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqst_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼元ワーキンググループＣＤ</td>
 *  	<td>Requesting WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqst_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼元担当者ＣＤ</td>
 *  	<td>Requesting PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先ＣＤ</td>
 *  	<td>Customer cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sret_fr_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>引取先ＣＤ</td>
 *  	<td>Pickup company cd.</td>
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
 *  	<td>ret_dlv_slip_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品元納品書明細ＮＯ</td>
 *  	<td>Return-from delivery note details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ret_stk_arrv_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品元在庫着荷先ＣＤ</td>
 *  	<td>Return-from inventory arrival destination cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_rqst_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入希望日時</td>
 *  	<td>Desired delivery date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prms_rcpt_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納期回答受領日</td>
 *  	<td>Order promising result received date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prms_dlv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>回答納入日</td>
 *  	<td>Replied delivery date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prms_refl_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納期回答反映日</td>
 *  	<td>Order promising applied date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_inst_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入指示日</td>
 *  	<td>Delivery order date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_inst_prms_rcpt_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入指示回答受領日</td>
 *  	<td>Delivery order replied received date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_inst_prms_refl_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入指示回答反映日</td>
 *  	<td>Delivery order reply applied date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>arr_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入荷予定日時</td>
 *  	<td>Scheduled receipt date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>arr_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入荷日時</td>
 *  	<td>Receipt date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入日</td>
 *  	<td>Purchase date</td>
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
 *  	<td>pack_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>荷姿単位数量</td>
 *  	<td>SKU qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pack_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>荷姿単位ＣＤ</td>
 *  	<td>SKU cd.</td>
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
 *  	<td>prms_rcpt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納期回答受領数量</td>
 *  	<td>Order promising result received qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prms_refl_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納期回答反映済数量</td>
 *  	<td>Order promising applied qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_inst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入指示数量</td>
 *  	<td>Delivery order qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_inst_prms_rcpt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入指示回答受領数量</td>
 *  	<td>Delivery order replied received qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_inst_prms_refl_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入指示回答反映済数量</td>
 *  	<td>Delivery order reply applied qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>re_arr_schd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>再入荷予定数量</td>
 *  	<td>Scheduled re-receipt qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcpt_iv_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受領インボイス数量</td>
 *  	<td>Purchase invoice qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>arr_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷数量</td>
 *  	<td>Receipt qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入数量</td>
 *  	<td>Purchase qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_ret_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上返品数量</td>
 *  	<td>Sales return qty.</td>
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
 *  	<td>arr_schd_abort_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷予定打切数量</td>
 *  	<td>Cancelled remaining receipt schedule qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_schd_abort_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入予定打切数量</td>
 *  	<td>Cancelled remaining purchase schedule qty.</td>
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
 *  	<td>accpt_dfct_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検収不良数量</td>
 *  	<td>Acceptance defective qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_purc_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準納入ＬＴ</td>
 *  	<td>Standard delivery LT</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_purc_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入ＬＴ</td>
 *  	<td>Delivery LT</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>理由ＣＤ</td>
 *  	<td>Reason cd.</td>
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
 *  	<td>po_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注日</td>
 *  	<td>PO date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨ＣＤ</td>
 *  	<td>Transaction currency cd.</td>
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
 *  	<td>sub_char11</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１１</td>
 *  	<td>Spare CHAR column 11</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char12</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１２</td>
 *  	<td>Spare CHAR column 12</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char13</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１３</td>
 *  	<td>Spare CHAR column 13</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char14</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１４</td>
 *  	<td>Spare CHAR column 14</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char15</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１５</td>
 *  	<td>Spare CHAR column 15</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char16</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１６</td>
 *  	<td>Spare CHAR column 16</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char17</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１７</td>
 *  	<td>Spare CHAR column 17</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char18</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１８</td>
 *  	<td>Spare CHAR column 18</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char19</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１９</td>
 *  	<td>Spare CHAR column 19</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char20</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２０</td>
 *  	<td>Spare CHAR column 20</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char21</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２１</td>
 *  	<td>Spare CHAR column 21</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char22</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２２</td>
 *  	<td>Spare CHAR column 22</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char23</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２３</td>
 *  	<td>Spare CHAR column 23</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char24</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２４</td>
 *  	<td>Spare CHAR column 24</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char25</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２５</td>
 *  	<td>Spare CHAR column 25</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char26</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２６</td>
 *  	<td>Spare CHAR column 26</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char27</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２７</td>
 *  	<td>Spare CHAR column 27</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char28</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２８</td>
 *  	<td>Spare CHAR column 28</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char29</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２９</td>
 *  	<td>Spare CHAR column 29</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char30</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目３０</td>
 *  	<td>Spare CHAR column 30</td>
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
 *  	<td>sub_num4</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目４</td>
 *  	<td>Spare NUM column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_num5</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目５</td>
 *  	<td>Spare NUM column 5</td>
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
 *  	<td>sub_dt4</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目４</td>
 *  	<td>Spare DATE column 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_dt5</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目５</td>
 *  	<td>Spare DATE column 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>batch_log_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログＮＯ</td>
 *  	<td>Log No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>log_sub_key1</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログサブキー１</td>
 *  	<td>Log sub key 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>log_sub_key2</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログサブキー２</td>
 *  	<td>Log sub key 2</td>
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
public class MSVT_ARR_PR_IF_ALL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MSVT_ARR_PR_IF_ALL";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public static final String $data_lno = "data_lno";
	private static final MCPermColumnInfo _data_lno = createColumnInfo("data_lno");
	public final MCNumberPermColumn data_lno = createNumberColumn(_data_lno);
	
	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	private static final MCPermColumnInfo _co_cd = createColumnInfo("co_cd");
	public final MCStringPermColumn co_cd = createStringColumn(_co_cd);
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public static final String $data_no = "data_no";
	private static final MCPermColumnInfo _data_no = createColumnInfo("data_no");
	public final MCNumberPermColumn data_no = createNumberColumn(_data_no);
	
	/**
	 * ＰＧ実行状況区分. PG execution status type.<p>
	 *
	 */
	public static final String $exe_sts_typ = "exe_sts_typ";
	private static final MCPermColumnInfo _exe_sts_typ = createColumnInfo("exe_sts_typ");
	public final MCStringPermColumn exe_sts_typ = createStringColumn(_exe_sts_typ);
	
	/**
	 * データ更新区分. Data update type.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	private static final MCPermColumnInfo _data_crud_typ = createColumnInfo("data_crud_typ");
	public final MCStringPermColumn data_crud_typ = createStringColumn(_data_crud_typ);
	
	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	private static final MCPermColumnInfo _ext_sys_cd = createColumnInfo("ext_sys_cd");
	public final MCStringPermColumn ext_sys_cd = createStringColumn(_ext_sys_cd);
	
	/**
	 * 部門マスタ適用開始日. Dept. master application start date.<p>
	 *
	 */
	public static final String $dpt_st_dt = "dpt_st_dt";
	private static final MCPermColumnInfo _dpt_st_dt = createColumnInfo("dpt_st_dt");
	public final MCDatePermColumn dpt_st_dt = createDateColumn(_dpt_st_dt);
	
	/**
	 * 送信元レコード更新日時. Update date and time of source record.<p>
	 *
	 */
	public static final String $data_upd_ts = "data_upd_ts";
	private static final MCPermColumnInfo _data_upd_ts = createColumnInfo("data_upd_ts");
	public final MCTimestampPermColumn data_upd_ts = createTimestampColumn(_data_upd_ts);
	
	/**
	 * ＢＩ送信対象外ＦＬＧ. BI not to be exported flg..<p>
	 *
	 */
	public static final String $bi_not_send_flg = "bi_not_send_flg";
	private static final MCPermColumnInfo _bi_not_send_flg = createColumnInfo("bi_not_send_flg");
	public final MCBooleanPermColumn bi_not_send_flg = createBooleanColumn(_bi_not_send_flg);
	
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
	 * 発注日. PO date.<p>
	 *
	 */
	public static final String $po_dt = "po_dt";
	private static final MCPermColumnInfo _po_dt = createColumnInfo("po_dt");
	public final MCDatePermColumn po_dt = createDateColumn(_po_dt);
	
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
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	private static final MCPermColumnInfo _trd_cur_cd = createColumnInfo("trd_cur_cd");
	public final MCStringPermColumn trd_cur_cd = createStringColumn(_trd_cur_cd);
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	private static final MCPermColumnInfo _trd_cur_amt = createColumnInfo("trd_cur_amt");
	public final MCNumberPermColumn trd_cur_amt = createNumberColumn(_trd_cur_amt);
	
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
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public static final String $sub_char11 = "sub_char11";
	private static final MCPermColumnInfo _sub_char11 = createColumnInfo("sub_char11");
	public final MCStringPermColumn sub_char11 = createStringColumn(_sub_char11);
	
	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public static final String $sub_char12 = "sub_char12";
	private static final MCPermColumnInfo _sub_char12 = createColumnInfo("sub_char12");
	public final MCStringPermColumn sub_char12 = createStringColumn(_sub_char12);
	
	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public static final String $sub_char13 = "sub_char13";
	private static final MCPermColumnInfo _sub_char13 = createColumnInfo("sub_char13");
	public final MCStringPermColumn sub_char13 = createStringColumn(_sub_char13);
	
	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public static final String $sub_char14 = "sub_char14";
	private static final MCPermColumnInfo _sub_char14 = createColumnInfo("sub_char14");
	public final MCStringPermColumn sub_char14 = createStringColumn(_sub_char14);
	
	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public static final String $sub_char15 = "sub_char15";
	private static final MCPermColumnInfo _sub_char15 = createColumnInfo("sub_char15");
	public final MCStringPermColumn sub_char15 = createStringColumn(_sub_char15);
	
	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public static final String $sub_char16 = "sub_char16";
	private static final MCPermColumnInfo _sub_char16 = createColumnInfo("sub_char16");
	public final MCStringPermColumn sub_char16 = createStringColumn(_sub_char16);
	
	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public static final String $sub_char17 = "sub_char17";
	private static final MCPermColumnInfo _sub_char17 = createColumnInfo("sub_char17");
	public final MCStringPermColumn sub_char17 = createStringColumn(_sub_char17);
	
	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public static final String $sub_char18 = "sub_char18";
	private static final MCPermColumnInfo _sub_char18 = createColumnInfo("sub_char18");
	public final MCStringPermColumn sub_char18 = createStringColumn(_sub_char18);
	
	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public static final String $sub_char19 = "sub_char19";
	private static final MCPermColumnInfo _sub_char19 = createColumnInfo("sub_char19");
	public final MCStringPermColumn sub_char19 = createStringColumn(_sub_char19);
	
	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public static final String $sub_char20 = "sub_char20";
	private static final MCPermColumnInfo _sub_char20 = createColumnInfo("sub_char20");
	public final MCStringPermColumn sub_char20 = createStringColumn(_sub_char20);
	
	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public static final String $sub_char21 = "sub_char21";
	private static final MCPermColumnInfo _sub_char21 = createColumnInfo("sub_char21");
	public final MCStringPermColumn sub_char21 = createStringColumn(_sub_char21);
	
	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public static final String $sub_char22 = "sub_char22";
	private static final MCPermColumnInfo _sub_char22 = createColumnInfo("sub_char22");
	public final MCStringPermColumn sub_char22 = createStringColumn(_sub_char22);
	
	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public static final String $sub_char23 = "sub_char23";
	private static final MCPermColumnInfo _sub_char23 = createColumnInfo("sub_char23");
	public final MCStringPermColumn sub_char23 = createStringColumn(_sub_char23);
	
	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public static final String $sub_char24 = "sub_char24";
	private static final MCPermColumnInfo _sub_char24 = createColumnInfo("sub_char24");
	public final MCStringPermColumn sub_char24 = createStringColumn(_sub_char24);
	
	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public static final String $sub_char25 = "sub_char25";
	private static final MCPermColumnInfo _sub_char25 = createColumnInfo("sub_char25");
	public final MCStringPermColumn sub_char25 = createStringColumn(_sub_char25);
	
	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public static final String $sub_char26 = "sub_char26";
	private static final MCPermColumnInfo _sub_char26 = createColumnInfo("sub_char26");
	public final MCStringPermColumn sub_char26 = createStringColumn(_sub_char26);
	
	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public static final String $sub_char27 = "sub_char27";
	private static final MCPermColumnInfo _sub_char27 = createColumnInfo("sub_char27");
	public final MCStringPermColumn sub_char27 = createStringColumn(_sub_char27);
	
	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public static final String $sub_char28 = "sub_char28";
	private static final MCPermColumnInfo _sub_char28 = createColumnInfo("sub_char28");
	public final MCStringPermColumn sub_char28 = createStringColumn(_sub_char28);
	
	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public static final String $sub_char29 = "sub_char29";
	private static final MCPermColumnInfo _sub_char29 = createColumnInfo("sub_char29");
	public final MCStringPermColumn sub_char29 = createStringColumn(_sub_char29);
	
	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public static final String $sub_char30 = "sub_char30";
	private static final MCPermColumnInfo _sub_char30 = createColumnInfo("sub_char30");
	public final MCStringPermColumn sub_char30 = createStringColumn(_sub_char30);
	
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
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public static final String $sub_num4 = "sub_num4";
	private static final MCPermColumnInfo _sub_num4 = createColumnInfo("sub_num4");
	public final MCNumberPermColumn sub_num4 = createNumberColumn(_sub_num4);
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public static final String $sub_num5 = "sub_num5";
	private static final MCPermColumnInfo _sub_num5 = createColumnInfo("sub_num5");
	public final MCNumberPermColumn sub_num5 = createNumberColumn(_sub_num5);
	
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
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public static final String $sub_dt4 = "sub_dt4";
	private static final MCPermColumnInfo _sub_dt4 = createColumnInfo("sub_dt4");
	public final MCDatePermColumn sub_dt4 = createDateColumn(_sub_dt4);
	
	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public static final String $sub_dt5 = "sub_dt5";
	private static final MCPermColumnInfo _sub_dt5 = createColumnInfo("sub_dt5");
	public final MCDatePermColumn sub_dt5 = createDateColumn(_sub_dt5);
	
	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public static final String $batch_log_no = "batch_log_no";
	private static final MCPermColumnInfo _batch_log_no = createColumnInfo("batch_log_no");
	public final MCStringPermColumn batch_log_no = createStringColumn(_batch_log_no);
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public static final String $log_sub_key1 = "log_sub_key1";
	private static final MCPermColumnInfo _log_sub_key1 = createColumnInfo("log_sub_key1");
	public final MCNumberPermColumn log_sub_key1 = createNumberColumn(_log_sub_key1);
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public static final String $log_sub_key2 = "log_sub_key2";
	private static final MCPermColumnInfo _log_sub_key2 = createColumnInfo("log_sub_key2");
	public final MCNumberPermColumn log_sub_key2 = createNumberColumn(_log_sub_key2);
	
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
	
	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta exe_sts_typ_META = createCommonMeta($exe_sts_typ, mcframe.commonMA.meta.MA_META.EXE_STS_TYP);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta dpt_st_dt_META = createCommonMeta($dpt_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta data_upd_ts_META = createCommonMeta($data_upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta bi_not_send_flg_META = createCommonMeta($bi_not_send_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta purc_sts_typ_META = createCommonMeta($purc_sts_typ, mcframe.commonMS.meta.MS_META.PURC_STS_TYP);
	public static final MCMeta prms_dlv_dt_overdue_flg_META = createCommonMeta($prms_dlv_dt_overdue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_rqst_dt_overdue_flg_META = createCommonMeta($dlv_rqst_dt_overdue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_cmpl_flg_META = createCommonMeta($arr_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cmpl_flg_META = createCommonMeta($purc_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_ret_cmpl_flg_META = createCommonMeta($sls_ret_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_cnt_rmrks_META = createCommonMeta($arr_cnt_rmrks, mcframe.commonMS.meta.MS_META.ARR_CNT_RMRKS);
	public static final MCMeta po_dt_META = createCommonMeta($po_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta sub_char4_META = createCommonMeta($sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta sub_char5_META = createCommonMeta($sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta sub_char6_META = createCommonMeta($sub_char6, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR6);
	public static final MCMeta sub_char7_META = createCommonMeta($sub_char7, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR7);
	public static final MCMeta sub_char8_META = createCommonMeta($sub_char8, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR8);
	public static final MCMeta sub_char9_META = createCommonMeta($sub_char9, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR9);
	public static final MCMeta sub_char10_META = createCommonMeta($sub_char10, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR10);
	public static final MCMeta sub_char11_META = createCommonMeta($sub_char11, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR11);
	public static final MCMeta sub_char12_META = createCommonMeta($sub_char12, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR12);
	public static final MCMeta sub_char13_META = createCommonMeta($sub_char13, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR13);
	public static final MCMeta sub_char14_META = createCommonMeta($sub_char14, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR14);
	public static final MCMeta sub_char15_META = createCommonMeta($sub_char15, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR15);
	public static final MCMeta sub_char16_META = createCommonMeta($sub_char16, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR16);
	public static final MCMeta sub_char17_META = createCommonMeta($sub_char17, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR17);
	public static final MCMeta sub_char18_META = createCommonMeta($sub_char18, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR18);
	public static final MCMeta sub_char19_META = createCommonMeta($sub_char19, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR19);
	public static final MCMeta sub_char20_META = createCommonMeta($sub_char20, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR20);
	public static final MCMeta sub_char21_META = createCommonMeta($sub_char21, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR21);
	public static final MCMeta sub_char22_META = createCommonMeta($sub_char22, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR22);
	public static final MCMeta sub_char23_META = createCommonMeta($sub_char23, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR23);
	public static final MCMeta sub_char24_META = createCommonMeta($sub_char24, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR24);
	public static final MCMeta sub_char25_META = createCommonMeta($sub_char25, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR25);
	public static final MCMeta sub_char26_META = createCommonMeta($sub_char26, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR26);
	public static final MCMeta sub_char27_META = createCommonMeta($sub_char27, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR27);
	public static final MCMeta sub_char28_META = createCommonMeta($sub_char28, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR28);
	public static final MCMeta sub_char29_META = createCommonMeta($sub_char29, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR29);
	public static final MCMeta sub_char30_META = createCommonMeta($sub_char30, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR30);
	public static final MCMeta sub_num1_META = createCommonMeta($sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta sub_num2_META = createCommonMeta($sub_num2, mcframe.commonMA.meta.MA_META.IF_SUB_NUM2);
	public static final MCMeta sub_num3_META = createCommonMeta($sub_num3, mcframe.commonMA.meta.MA_META.IF_SUB_NUM3);
	public static final MCMeta sub_num4_META = createCommonMeta($sub_num4, mcframe.commonMA.meta.MA_META.IF_SUB_NUM4);
	public static final MCMeta sub_num5_META = createCommonMeta($sub_num5, mcframe.commonMA.meta.MA_META.IF_SUB_NUM5);
	public static final MCMeta sub_dt1_META = createCommonMeta($sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt2_META = createCommonMeta($sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt3_META = createCommonMeta($sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt4_META = createCommonMeta($sub_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt5_META = createCommonMeta($sub_dt5, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta batch_log_no_META = createCommonMeta($batch_log_no, mcframe.commonMA.meta.MA_META.BATCH_LOG_NO);
	public static final MCMeta log_sub_key1_META = createCommonMeta($log_sub_key1, mcframe.commonMA.meta.MA_META.BATCH_LOG_SUB_KEY1);
	public static final MCMeta log_sub_key2_META = createCommonMeta($log_sub_key2, mcframe.commonMA.meta.MA_META.BATCH_LOG_SUB_KEY2);
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
	public static final String $SDRV_IF1 = "SDRV_IF1";
	public static final String $CO_ALL1 = "CO_ALL1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"PFT_SDRV_IF",
				$SDRV_IF1,
				new String[][]{
						{"data_no", "data_no"}
				},
				() -> {
					return mcframe.serverPF.dbc.PFT_SDRV_IF_R.create("SDRV_IF1");
				},
				(alias) -> {
					MSVT_ARR_PR_IF_ALL_R own = MSVT_ARR_PR_IF_ALL_R.create(alias);
					mcframe.serverPF.dbc.PFT_SDRV_IF_R ref = mcframe.serverPF.dbc.PFT_SDRV_IF_R.create("SDRV_IF1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.data_no.eq(ref.data_no));
					return cond;
				}
			)
		);
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
	}
	
	protected static final ConstMetaList<MSVT_ARR_PR_IF_ALL_R> constMetas = new ConstMetaList<MSVT_ARR_PR_IF_ALL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			data_lno_META,
			co_cd_META,
			data_no_META,
			exe_sts_typ_META,
			data_crud_typ_META,
			ext_sys_cd_META,
			dpt_st_dt_META,
			data_upd_ts_META,
			bi_not_send_flg_META,
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
			purc_sts_typ_META,
			prms_dlv_dt_overdue_flg_META,
			dlv_rqst_dt_overdue_flg_META,
			arr_cmpl_flg_META,
			purc_cmpl_flg_META,
			sls_ret_cmpl_flg_META,
			arr_cnt_rmrks_META,
			po_dt_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			trd_cur_cd_META,
			trd_cur_amt_META,
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
			sub_char11_META,
			sub_char12_META,
			sub_char13_META,
			sub_char14_META,
			sub_char15_META,
			sub_char16_META,
			sub_char17_META,
			sub_char18_META,
			sub_char19_META,
			sub_char20_META,
			sub_char21_META,
			sub_char22_META,
			sub_char23_META,
			sub_char24_META,
			sub_char25_META,
			sub_char26_META,
			sub_char27_META,
			sub_char28_META,
			sub_char29_META,
			sub_char30_META,
			sub_num1_META,
			sub_num2_META,
			sub_num3_META,
			sub_num4_META,
			sub_num5_META,
			sub_dt1_META,
			sub_dt2_META,
			sub_dt3_META,
			sub_dt4_META,
			sub_dt5_META,
			batch_log_no_META,
			log_sub_key1_META,
			log_sub_key2_META,
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
	protected MSVT_ARR_PR_IF_ALL_R(ConstMetaList<? extends MSVT_ARR_PR_IF_ALL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSVT_ARR_PR_IF_ALL_R(ConstMetaList<? extends MSVT_ARR_PR_IF_ALL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$data_lno,
				"data_lno",
				data_lno,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$co_cd,
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
			MSVT_ARR_PR_IF_ALL_R.$data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$data_no,
				"data_no",
				data_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$exe_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$exe_sts_typ,
				"exe_sts_typ",
				exe_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$data_crud_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$data_crud_typ,
				"data_crud_typ",
				data_crud_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$ext_sys_cd,
				"ext_sys_cd",
				ext_sys_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$dpt_st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_ARR_PR_IF_ALL_R.$dpt_st_dt,
				"dpt_st_dt",
				dpt_st_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$data_upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MSVT_ARR_PR_IF_ALL_R.$data_upd_ts,
				"data_upd_ts",
				data_upd_ts,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$bi_not_send_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_ARR_PR_IF_ALL_R.$bi_not_send_flg,
				"bi_not_send_flg",
				bi_not_send_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$arr_pr_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$arr_pr_no,
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
			MSVT_ARR_PR_IF_ALL_R.$trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$trd_cd,
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
			MSVT_ARR_PR_IF_ALL_R.$trd_ptn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$trd_ptn_typ,
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
			MSVT_ARR_PR_IF_ALL_R.$po_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$po_d_no,
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
			MSVT_ARR_PR_IF_ALL_R.$sls_ret_schd_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sls_ret_schd_d_no,
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
			MSVT_ARR_PR_IF_ALL_R.$dlv_slip_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$dlv_slip_d_no,
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
			MSVT_ARR_PR_IF_ALL_R.$iv_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$iv_d_no,
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
			MSVT_ARR_PR_IF_ALL_R.$rqst_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$rqst_dpt_cd,
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
			MSVT_ARR_PR_IF_ALL_R.$rqst_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$rqst_wg_cd,
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
			MSVT_ARR_PR_IF_ALL_R.$rqst_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$rqst_usr_cd,
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
			MSVT_ARR_PR_IF_ALL_R.$cst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$cst_cd,
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
			MSVT_ARR_PR_IF_ALL_R.$sret_fr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sret_fr_cd,
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
			MSVT_ARR_PR_IF_ALL_R.$sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sppl_cd,
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
			MSVT_ARR_PR_IF_ALL_R.$ret_dlv_slip_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$ret_dlv_slip_d_no,
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
			MSVT_ARR_PR_IF_ALL_R.$ret_stk_arrv_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$ret_stk_arrv_bp_cd,
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
			MSVT_ARR_PR_IF_ALL_R.$dlv_rqst_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_ARR_PR_IF_ALL_R.$dlv_rqst_tm,
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
			MSVT_ARR_PR_IF_ALL_R.$prms_rcpt_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_ARR_PR_IF_ALL_R.$prms_rcpt_dt,
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
			MSVT_ARR_PR_IF_ALL_R.$prms_dlv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_ARR_PR_IF_ALL_R.$prms_dlv_dt,
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
			MSVT_ARR_PR_IF_ALL_R.$prms_refl_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_ARR_PR_IF_ALL_R.$prms_refl_dt,
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
			MSVT_ARR_PR_IF_ALL_R.$dlv_inst_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_ARR_PR_IF_ALL_R.$dlv_inst_dt,
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
			MSVT_ARR_PR_IF_ALL_R.$dlv_inst_prms_rcpt_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_ARR_PR_IF_ALL_R.$dlv_inst_prms_rcpt_dt,
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
			MSVT_ARR_PR_IF_ALL_R.$dlv_inst_prms_refl_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_ARR_PR_IF_ALL_R.$dlv_inst_prms_refl_dt,
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
			MSVT_ARR_PR_IF_ALL_R.$arr_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_ARR_PR_IF_ALL_R.$arr_schd_tm,
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
			MSVT_ARR_PR_IF_ALL_R.$arr_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_ARR_PR_IF_ALL_R.$arr_tm,
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
			MSVT_ARR_PR_IF_ALL_R.$purc_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_ARR_PR_IF_ALL_R.$purc_dt,
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
			MSVT_ARR_PR_IF_ALL_R.$trd_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$trd_unit_qty,
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
			MSVT_ARR_PR_IF_ALL_R.$trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$trd_unit_cd,
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
			MSVT_ARR_PR_IF_ALL_R.$pack_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$pack_unit_qty,
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
			MSVT_ARR_PR_IF_ALL_R.$pack_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$pack_unit_cd,
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
			MSVT_ARR_PR_IF_ALL_R.$base_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$base_unit_qty,
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
			MSVT_ARR_PR_IF_ALL_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$base_unit_cd,
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
			MSVT_ARR_PR_IF_ALL_R.$prms_rcpt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$prms_rcpt_qty,
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
			MSVT_ARR_PR_IF_ALL_R.$prms_refl_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$prms_refl_qty,
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
			MSVT_ARR_PR_IF_ALL_R.$dlv_inst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$dlv_inst_qty,
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
			MSVT_ARR_PR_IF_ALL_R.$dlv_inst_prms_rcpt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$dlv_inst_prms_rcpt_qty,
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
			MSVT_ARR_PR_IF_ALL_R.$dlv_inst_prms_refl_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$dlv_inst_prms_refl_qty,
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
			MSVT_ARR_PR_IF_ALL_R.$re_arr_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$re_arr_schd_qty,
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
			MSVT_ARR_PR_IF_ALL_R.$rcpt_iv_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$rcpt_iv_qty,
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
			MSVT_ARR_PR_IF_ALL_R.$arr_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$arr_qty,
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
			MSVT_ARR_PR_IF_ALL_R.$purc_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$purc_qty,
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
			MSVT_ARR_PR_IF_ALL_R.$sls_ret_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$sls_ret_qty,
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
			MSVT_ARR_PR_IF_ALL_R.$abort_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_ARR_PR_IF_ALL_R.$abort_flg,
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
			MSVT_ARR_PR_IF_ALL_R.$arr_schd_abort_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$arr_schd_abort_qty,
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
			MSVT_ARR_PR_IF_ALL_R.$purc_schd_abort_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$purc_schd_abort_qty,
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
			MSVT_ARR_PR_IF_ALL_R.$sls_ret_schd_abort_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$sls_ret_schd_abort_qty,
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
			MSVT_ARR_PR_IF_ALL_R.$accpt_dfct_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$accpt_dfct_qty,
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
			MSVT_ARR_PR_IF_ALL_R.$std_purc_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$std_purc_lt,
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
			MSVT_ARR_PR_IF_ALL_R.$act_purc_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$act_purc_lt,
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
			MSVT_ARR_PR_IF_ALL_R.$rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$rsn_cd,
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
			MSVT_ARR_PR_IF_ALL_R.$purc_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$purc_sts_typ,
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
			MSVT_ARR_PR_IF_ALL_R.$prms_dlv_dt_overdue_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_ARR_PR_IF_ALL_R.$prms_dlv_dt_overdue_flg,
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
			MSVT_ARR_PR_IF_ALL_R.$dlv_rqst_dt_overdue_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_ARR_PR_IF_ALL_R.$dlv_rqst_dt_overdue_flg,
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
			MSVT_ARR_PR_IF_ALL_R.$arr_cmpl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_ARR_PR_IF_ALL_R.$arr_cmpl_flg,
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
			MSVT_ARR_PR_IF_ALL_R.$purc_cmpl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_ARR_PR_IF_ALL_R.$purc_cmpl_flg,
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
			MSVT_ARR_PR_IF_ALL_R.$sls_ret_cmpl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_ARR_PR_IF_ALL_R.$sls_ret_cmpl_flg,
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
			MSVT_ARR_PR_IF_ALL_R.$arr_cnt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$arr_cnt_rmrks,
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
			MSVT_ARR_PR_IF_ALL_R.$po_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_ARR_PR_IF_ALL_R.$po_dt,
				"po_dt",
				po_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$itm_cd,
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
			MSVT_ARR_PR_IF_ALL_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$itm_sub1,
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
			MSVT_ARR_PR_IF_ALL_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$itm_sub2,
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
			MSVT_ARR_PR_IF_ALL_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$itm_sub3,
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
			MSVT_ARR_PR_IF_ALL_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$trd_cur_cd,
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
			MSVT_ARR_PR_IF_ALL_R.$trd_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$trd_cur_amt,
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
			MSVT_ARR_PR_IF_ALL_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char1,
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
			MSVT_ARR_PR_IF_ALL_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char2,
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
			MSVT_ARR_PR_IF_ALL_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char3,
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
			MSVT_ARR_PR_IF_ALL_R.$sub_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char4,
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
			MSVT_ARR_PR_IF_ALL_R.$sub_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char5,
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
			MSVT_ARR_PR_IF_ALL_R.$sub_char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char6,
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
			MSVT_ARR_PR_IF_ALL_R.$sub_char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char7,
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
			MSVT_ARR_PR_IF_ALL_R.$sub_char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char8,
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
			MSVT_ARR_PR_IF_ALL_R.$sub_char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char9,
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
			MSVT_ARR_PR_IF_ALL_R.$sub_char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char10,
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
			MSVT_ARR_PR_IF_ALL_R.$sub_char11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char11,
				"sub_char11",
				sub_char11,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_char12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char12,
				"sub_char12",
				sub_char12,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_char13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char13,
				"sub_char13",
				sub_char13,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_char14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char14,
				"sub_char14",
				sub_char14,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_char15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char15,
				"sub_char15",
				sub_char15,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_char16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char16,
				"sub_char16",
				sub_char16,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_char17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char17,
				"sub_char17",
				sub_char17,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_char18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char18,
				"sub_char18",
				sub_char18,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_char19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char19,
				"sub_char19",
				sub_char19,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_char20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char20,
				"sub_char20",
				sub_char20,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_char21,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char21,
				"sub_char21",
				sub_char21,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_char22,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char22,
				"sub_char22",
				sub_char22,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_char23,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char23,
				"sub_char23",
				sub_char23,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_char24,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char24,
				"sub_char24",
				sub_char24,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_char25,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char25,
				"sub_char25",
				sub_char25,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_char26,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char26,
				"sub_char26",
				sub_char26,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_char27,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char27,
				"sub_char27",
				sub_char27,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_char28,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char28,
				"sub_char28",
				sub_char28,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_char29,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char29,
				"sub_char29",
				sub_char29,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_char30,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$sub_char30,
				"sub_char30",
				sub_char30,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$sub_num1,
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
			MSVT_ARR_PR_IF_ALL_R.$sub_num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$sub_num2,
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
			MSVT_ARR_PR_IF_ALL_R.$sub_num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$sub_num3,
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
			MSVT_ARR_PR_IF_ALL_R.$sub_num4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$sub_num4,
				"sub_num4",
				sub_num4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_num5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$sub_num5,
				"sub_num5",
				sub_num5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_ARR_PR_IF_ALL_R.$sub_dt1,
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
			MSVT_ARR_PR_IF_ALL_R.$sub_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_ARR_PR_IF_ALL_R.$sub_dt2,
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
			MSVT_ARR_PR_IF_ALL_R.$sub_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_ARR_PR_IF_ALL_R.$sub_dt3,
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
			MSVT_ARR_PR_IF_ALL_R.$sub_dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_ARR_PR_IF_ALL_R.$sub_dt4,
				"sub_dt4",
				sub_dt4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$sub_dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_ARR_PR_IF_ALL_R.$sub_dt5,
				"sub_dt5",
				sub_dt5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$batch_log_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$batch_log_no,
				"batch_log_no",
				batch_log_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$log_sub_key1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$log_sub_key1,
				"log_sub_key1",
				log_sub_key1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$log_sub_key2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$log_sub_key2,
				"log_sub_key2",
				log_sub_key2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_ARR_PR_IF_ALL_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$ins_usr_id,
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
			MSVT_ARR_PR_IF_ALL_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$ins_usr_nm,
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
			MSVT_ARR_PR_IF_ALL_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MSVT_ARR_PR_IF_ALL_R.$ins_ts,
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
			MSVT_ARR_PR_IF_ALL_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$ins_func_id,
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
			MSVT_ARR_PR_IF_ALL_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_ARR_PR_IF_ALL_R.$upd_cntr,
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
			MSVT_ARR_PR_IF_ALL_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$upd_usr_id,
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
			MSVT_ARR_PR_IF_ALL_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$upd_usr_nm,
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
			MSVT_ARR_PR_IF_ALL_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MSVT_ARR_PR_IF_ALL_R.$upd_ts,
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
			MSVT_ARR_PR_IF_ALL_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$upd_func_id,
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
			MSVT_ARR_PR_IF_ALL_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_ARR_PR_IF_ALL_R.$upd_srv_req_no,
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
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSVT_ARR_PR_IF_ALL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSVT_ARR_PR_IF_ALL_R create(String alias) {
		MSVT_ARR_PR_IF_ALL_R row = new MSVT_ARR_PR_IF_ALL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSVT_ARR_PR_IF_ALL_R createByName(T proto) {
		MSVT_ARR_PR_IF_ALL_R row = MSVT_ARR_PR_IF_ALL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_ARR_PR_IF_ALL_R clone() {
		return (MSVT_ARR_PR_IF_ALL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_ARR_PR_IF_ALL_R createInstance() {
		return (MSVT_ARR_PR_IF_ALL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_ARR_PR_IF_ALL_R getValues(String... names) {
		return (MSVT_ARR_PR_IF_ALL_R) super.getValues(names);
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
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public MCNumber data_lno() {
		return getConstNumber(offset + 0, $data_lno);
	}

	/**
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		setConstNumber(offset + 0, $data_lno, value);
	}
	
	/**
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public void data_lno(int value) {
		setConstNumber(offset + 0, $data_lno, value);
	}
	
	/**
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public void data_lno(long value) {
		setConstNumber(offset + 0, $data_lno, value);
	}
	
	/**
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public void data_lno(float value) {
		setConstNumber(offset + 0, $data_lno, value);
	}
	
	/**
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public void data_lno(double value) {
		setConstNumber(offset + 0, $data_lno, value);
	}
	
	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 1, $co_cd);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 1, $co_cd, value);
	}

	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 2, $data_no);
	}

	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 2, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 2, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 2, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 2, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 2, $data_no, value);
	}
	
	/**
	 * ＰＧ実行状況区分. PG execution status type.<p>
	 *
	 */
	public String exe_sts_typ() {
		return getConstString(offset + 3, $exe_sts_typ);
	}

	/**
	 * ＰＧ実行状況区分. PG execution status type.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		setConstString(offset + 3, $exe_sts_typ, value);
	}

	/**
	 * データ更新区分. Data update type.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 4, $data_crud_typ);
	}

	/**
	 * データ更新区分. Data update type.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 4, $data_crud_typ, value);
	}

	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 5, $ext_sys_cd);
	}

	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 5, $ext_sys_cd, value);
	}

	/**
	 * 部門マスタ適用開始日. Dept. master application start date.<p>
	 *
	 */
	public MCDate dpt_st_dt() {
		return getConstDate(offset + 6, $dpt_st_dt);
	}

	/**
	 * 部門マスタ適用開始日. Dept. master application start date.<p>
	 *
	 */
	public void dpt_st_dt(MCDate value) {
		setConstDate(offset + 6, $dpt_st_dt, value);
	}

	/**
	 * 送信元レコード更新日時. Update date and time of source record.<p>
	 *
	 */
	public MCTimestamp data_upd_ts() {
		return getConstTimestamp(offset + 7, $data_upd_ts);
	}

	/**
	 * 送信元レコード更新日時. Update date and time of source record.<p>
	 *
	 */
	public void data_upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 7, $data_upd_ts, value);
	}

	/**
	 * ＢＩ送信対象外ＦＬＧ. BI not to be exported flg..<p>
	 *
	 */
	public boolean bi_not_send_flg() {
		return getConstBoolean(offset + 8, $bi_not_send_flg);
	}

	/**
	 * ＢＩ送信対象外ＦＬＧ. BI not to be exported flg..<p>
	 *
	 */
	public void bi_not_send_flg(boolean value) {
		setConstBoolean(offset + 8, $bi_not_send_flg, value);
	}

	/**
	 * 入荷進捗ＮＯ. Receipt progress No..<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 9, $arr_pr_no);
	}

	/**
	 * 入荷進捗ＮＯ. Receipt progress No..<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 9, $arr_pr_no, value);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 10, $trd_cd);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 10, $trd_cd, value);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 11, $trd_ptn_typ);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 11, $trd_ptn_typ, value);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 12, $po_d_no);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 12, $po_d_no, value);
	}

	/**
	 * 売上返品予定明細ＮＯ. Sales return schedule details No..<p>
	 *
	 */
	public String sls_ret_schd_d_no() {
		return getConstString(offset + 13, $sls_ret_schd_d_no);
	}

	/**
	 * 売上返品予定明細ＮＯ. Sales return schedule details No..<p>
	 *
	 */
	public void sls_ret_schd_d_no(String value) {
		setConstString(offset + 13, $sls_ret_schd_d_no, value);
	}

	/**
	 * 納品書明細ＮＯ. Delivery note details No..<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 14, $dlv_slip_d_no);
	}

	/**
	 * 納品書明細ＮＯ. Delivery note details No..<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 14, $dlv_slip_d_no, value);
	}

	/**
	 * インボイス明細ＮＯ. Invoice details No..<p>
	 *
	 */
	public String iv_d_no() {
		return getConstString(offset + 15, $iv_d_no);
	}

	/**
	 * インボイス明細ＮＯ. Invoice details No..<p>
	 *
	 */
	public void iv_d_no(String value) {
		setConstString(offset + 15, $iv_d_no, value);
	}

	/**
	 * 依頼元部門ＣＤ. Requesting dept. cd..<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return getConstString(offset + 16, $rqst_dpt_cd);
	}

	/**
	 * 依頼元部門ＣＤ. Requesting dept. cd..<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		setConstString(offset + 16, $rqst_dpt_cd, value);
	}

	/**
	 * 依頼元ワーキンググループＣＤ. Requesting WG cd..<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 17, $rqst_wg_cd);
	}

	/**
	 * 依頼元ワーキンググループＣＤ. Requesting WG cd..<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 17, $rqst_wg_cd, value);
	}

	/**
	 * 依頼元担当者ＣＤ. Requesting PIC cd..<p>
	 *
	 */
	public String rqst_usr_cd() {
		return getConstString(offset + 18, $rqst_usr_cd);
	}

	/**
	 * 依頼元担当者ＣＤ. Requesting PIC cd..<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		setConstString(offset + 18, $rqst_usr_cd, value);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 19, $cst_cd);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 19, $cst_cd, value);
	}

	/**
	 * 引取先ＣＤ. Pickup company cd..<p>
	 *
	 */
	public String sret_fr_cd() {
		return getConstString(offset + 20, $sret_fr_cd);
	}

	/**
	 * 引取先ＣＤ. Pickup company cd..<p>
	 *
	 */
	public void sret_fr_cd(String value) {
		setConstString(offset + 20, $sret_fr_cd, value);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 21, $sppl_cd);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 21, $sppl_cd, value);
	}

	/**
	 * 返品元納品書明細ＮＯ. Return-from delivery note details No..<p>
	 *
	 */
	public String ret_dlv_slip_d_no() {
		return getConstString(offset + 22, $ret_dlv_slip_d_no);
	}

	/**
	 * 返品元納品書明細ＮＯ. Return-from delivery note details No..<p>
	 *
	 */
	public void ret_dlv_slip_d_no(String value) {
		setConstString(offset + 22, $ret_dlv_slip_d_no, value);
	}

	/**
	 * 返品元在庫着荷先ＣＤ. Return-from inventory arrival destination cd..<p>
	 *
	 */
	public String ret_stk_arrv_bp_cd() {
		return getConstString(offset + 23, $ret_stk_arrv_bp_cd);
	}

	/**
	 * 返品元在庫着荷先ＣＤ. Return-from inventory arrival destination cd..<p>
	 *
	 */
	public void ret_stk_arrv_bp_cd(String value) {
		setConstString(offset + 23, $ret_stk_arrv_bp_cd, value);
	}

	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return getConstDate(offset + 24, $dlv_rqst_tm);
	}

	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 24, $dlv_rqst_tm, value);
	}

	/**
	 * 納期回答受領日. Order promising result received date.<p>
	 *
	 */
	public MCDate prms_rcpt_dt() {
		return getConstDate(offset + 25, $prms_rcpt_dt);
	}

	/**
	 * 納期回答受領日. Order promising result received date.<p>
	 *
	 */
	public void prms_rcpt_dt(MCDate value) {
		setConstDate(offset + 25, $prms_rcpt_dt, value);
	}

	/**
	 * 回答納入日. Replied delivery date.<p>
	 *
	 */
	public MCDate prms_dlv_dt() {
		return getConstDate(offset + 26, $prms_dlv_dt);
	}

	/**
	 * 回答納入日. Replied delivery date.<p>
	 *
	 */
	public void prms_dlv_dt(MCDate value) {
		setConstDate(offset + 26, $prms_dlv_dt, value);
	}

	/**
	 * 納期回答反映日. Order promising applied date.<p>
	 *
	 */
	public MCDate prms_refl_dt() {
		return getConstDate(offset + 27, $prms_refl_dt);
	}

	/**
	 * 納期回答反映日. Order promising applied date.<p>
	 *
	 */
	public void prms_refl_dt(MCDate value) {
		setConstDate(offset + 27, $prms_refl_dt, value);
	}

	/**
	 * 納入指示日. Delivery order date.<p>
	 *
	 */
	public MCDate dlv_inst_dt() {
		return getConstDate(offset + 28, $dlv_inst_dt);
	}

	/**
	 * 納入指示日. Delivery order date.<p>
	 *
	 */
	public void dlv_inst_dt(MCDate value) {
		setConstDate(offset + 28, $dlv_inst_dt, value);
	}

	/**
	 * 納入指示回答受領日. Delivery order replied received date.<p>
	 *
	 */
	public MCDate dlv_inst_prms_rcpt_dt() {
		return getConstDate(offset + 29, $dlv_inst_prms_rcpt_dt);
	}

	/**
	 * 納入指示回答受領日. Delivery order replied received date.<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_dt(MCDate value) {
		setConstDate(offset + 29, $dlv_inst_prms_rcpt_dt, value);
	}

	/**
	 * 納入指示回答反映日. Delivery order reply applied date.<p>
	 *
	 */
	public MCDate dlv_inst_prms_refl_dt() {
		return getConstDate(offset + 30, $dlv_inst_prms_refl_dt);
	}

	/**
	 * 納入指示回答反映日. Delivery order reply applied date.<p>
	 *
	 */
	public void dlv_inst_prms_refl_dt(MCDate value) {
		setConstDate(offset + 30, $dlv_inst_prms_refl_dt, value);
	}

	/**
	 * 入荷予定日時. Scheduled receipt date and time.<p>
	 *
	 */
	public MCDate arr_schd_tm() {
		return getConstDate(offset + 31, $arr_schd_tm);
	}

	/**
	 * 入荷予定日時. Scheduled receipt date and time.<p>
	 *
	 */
	public void arr_schd_tm(MCDate value) {
		setConstDate(offset + 31, $arr_schd_tm, value);
	}

	/**
	 * 入荷日時. Receipt date and time.<p>
	 *
	 */
	public MCDate arr_tm() {
		return getConstDate(offset + 32, $arr_tm);
	}

	/**
	 * 入荷日時. Receipt date and time.<p>
	 *
	 */
	public void arr_tm(MCDate value) {
		setConstDate(offset + 32, $arr_tm, value);
	}

	/**
	 * 仕入日. Purchase date.<p>
	 *
	 */
	public MCDate purc_dt() {
		return getConstDate(offset + 33, $purc_dt);
	}

	/**
	 * 仕入日. Purchase date.<p>
	 *
	 */
	public void purc_dt(MCDate value) {
		setConstDate(offset + 33, $purc_dt, value);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 34, $trd_unit_qty);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 34, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 34, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 34, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 34, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 34, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 35, $trd_unit_cd);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 35, $trd_unit_cd, value);
	}

	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 36, $pack_unit_qty);
	}

	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 36, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 36, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 36, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 36, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位数量. SKU qty..<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 36, $pack_unit_qty, value);
	}
	
	/**
	 * 荷姿単位ＣＤ. SKU cd..<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 37, $pack_unit_cd);
	}

	/**
	 * 荷姿単位ＣＤ. SKU cd..<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 37, $pack_unit_cd, value);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 38, $base_unit_qty);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 38, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 38, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 38, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 38, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 38, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 39, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 39, $base_unit_cd, value);
	}

	/**
	 * 納期回答受領数量. Order promising result received qty..<p>
	 *
	 */
	public MCNumber prms_rcpt_qty() {
		return getConstNumber(offset + 40, $prms_rcpt_qty);
	}

	/**
	 * 納期回答受領数量. Order promising result received qty..<p>
	 *
	 */
	public void prms_rcpt_qty(MCNumber value) {
		setConstNumber(offset + 40, $prms_rcpt_qty, value);
	}
	
	/**
	 * 納期回答受領数量. Order promising result received qty..<p>
	 *
	 */
	public void prms_rcpt_qty(int value) {
		setConstNumber(offset + 40, $prms_rcpt_qty, value);
	}
	
	/**
	 * 納期回答受領数量. Order promising result received qty..<p>
	 *
	 */
	public void prms_rcpt_qty(long value) {
		setConstNumber(offset + 40, $prms_rcpt_qty, value);
	}
	
	/**
	 * 納期回答受領数量. Order promising result received qty..<p>
	 *
	 */
	public void prms_rcpt_qty(float value) {
		setConstNumber(offset + 40, $prms_rcpt_qty, value);
	}
	
	/**
	 * 納期回答受領数量. Order promising result received qty..<p>
	 *
	 */
	public void prms_rcpt_qty(double value) {
		setConstNumber(offset + 40, $prms_rcpt_qty, value);
	}
	
	/**
	 * 納期回答反映済数量. Order promising applied qty..<p>
	 *
	 */
	public MCNumber prms_refl_qty() {
		return getConstNumber(offset + 41, $prms_refl_qty);
	}

	/**
	 * 納期回答反映済数量. Order promising applied qty..<p>
	 *
	 */
	public void prms_refl_qty(MCNumber value) {
		setConstNumber(offset + 41, $prms_refl_qty, value);
	}
	
	/**
	 * 納期回答反映済数量. Order promising applied qty..<p>
	 *
	 */
	public void prms_refl_qty(int value) {
		setConstNumber(offset + 41, $prms_refl_qty, value);
	}
	
	/**
	 * 納期回答反映済数量. Order promising applied qty..<p>
	 *
	 */
	public void prms_refl_qty(long value) {
		setConstNumber(offset + 41, $prms_refl_qty, value);
	}
	
	/**
	 * 納期回答反映済数量. Order promising applied qty..<p>
	 *
	 */
	public void prms_refl_qty(float value) {
		setConstNumber(offset + 41, $prms_refl_qty, value);
	}
	
	/**
	 * 納期回答反映済数量. Order promising applied qty..<p>
	 *
	 */
	public void prms_refl_qty(double value) {
		setConstNumber(offset + 41, $prms_refl_qty, value);
	}
	
	/**
	 * 納入指示数量. Delivery order qty..<p>
	 *
	 */
	public MCNumber dlv_inst_qty() {
		return getConstNumber(offset + 42, $dlv_inst_qty);
	}

	/**
	 * 納入指示数量. Delivery order qty..<p>
	 *
	 */
	public void dlv_inst_qty(MCNumber value) {
		setConstNumber(offset + 42, $dlv_inst_qty, value);
	}
	
	/**
	 * 納入指示数量. Delivery order qty..<p>
	 *
	 */
	public void dlv_inst_qty(int value) {
		setConstNumber(offset + 42, $dlv_inst_qty, value);
	}
	
	/**
	 * 納入指示数量. Delivery order qty..<p>
	 *
	 */
	public void dlv_inst_qty(long value) {
		setConstNumber(offset + 42, $dlv_inst_qty, value);
	}
	
	/**
	 * 納入指示数量. Delivery order qty..<p>
	 *
	 */
	public void dlv_inst_qty(float value) {
		setConstNumber(offset + 42, $dlv_inst_qty, value);
	}
	
	/**
	 * 納入指示数量. Delivery order qty..<p>
	 *
	 */
	public void dlv_inst_qty(double value) {
		setConstNumber(offset + 42, $dlv_inst_qty, value);
	}
	
	/**
	 * 納入指示回答受領数量. Delivery order replied received qty..<p>
	 *
	 */
	public MCNumber dlv_inst_prms_rcpt_qty() {
		return getConstNumber(offset + 43, $dlv_inst_prms_rcpt_qty);
	}

	/**
	 * 納入指示回答受領数量. Delivery order replied received qty..<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(MCNumber value) {
		setConstNumber(offset + 43, $dlv_inst_prms_rcpt_qty, value);
	}
	
	/**
	 * 納入指示回答受領数量. Delivery order replied received qty..<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(int value) {
		setConstNumber(offset + 43, $dlv_inst_prms_rcpt_qty, value);
	}
	
	/**
	 * 納入指示回答受領数量. Delivery order replied received qty..<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(long value) {
		setConstNumber(offset + 43, $dlv_inst_prms_rcpt_qty, value);
	}
	
	/**
	 * 納入指示回答受領数量. Delivery order replied received qty..<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(float value) {
		setConstNumber(offset + 43, $dlv_inst_prms_rcpt_qty, value);
	}
	
	/**
	 * 納入指示回答受領数量. Delivery order replied received qty..<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(double value) {
		setConstNumber(offset + 43, $dlv_inst_prms_rcpt_qty, value);
	}
	
	/**
	 * 納入指示回答反映済数量. Delivery order reply applied qty..<p>
	 *
	 */
	public MCNumber dlv_inst_prms_refl_qty() {
		return getConstNumber(offset + 44, $dlv_inst_prms_refl_qty);
	}

	/**
	 * 納入指示回答反映済数量. Delivery order reply applied qty..<p>
	 *
	 */
	public void dlv_inst_prms_refl_qty(MCNumber value) {
		setConstNumber(offset + 44, $dlv_inst_prms_refl_qty, value);
	}
	
	/**
	 * 納入指示回答反映済数量. Delivery order reply applied qty..<p>
	 *
	 */
	public void dlv_inst_prms_refl_qty(int value) {
		setConstNumber(offset + 44, $dlv_inst_prms_refl_qty, value);
	}
	
	/**
	 * 納入指示回答反映済数量. Delivery order reply applied qty..<p>
	 *
	 */
	public void dlv_inst_prms_refl_qty(long value) {
		setConstNumber(offset + 44, $dlv_inst_prms_refl_qty, value);
	}
	
	/**
	 * 納入指示回答反映済数量. Delivery order reply applied qty..<p>
	 *
	 */
	public void dlv_inst_prms_refl_qty(float value) {
		setConstNumber(offset + 44, $dlv_inst_prms_refl_qty, value);
	}
	
	/**
	 * 納入指示回答反映済数量. Delivery order reply applied qty..<p>
	 *
	 */
	public void dlv_inst_prms_refl_qty(double value) {
		setConstNumber(offset + 44, $dlv_inst_prms_refl_qty, value);
	}
	
	/**
	 * 再入荷予定数量. Scheduled re-receipt qty..<p>
	 *
	 */
	public MCNumber re_arr_schd_qty() {
		return getConstNumber(offset + 45, $re_arr_schd_qty);
	}

	/**
	 * 再入荷予定数量. Scheduled re-receipt qty..<p>
	 *
	 */
	public void re_arr_schd_qty(MCNumber value) {
		setConstNumber(offset + 45, $re_arr_schd_qty, value);
	}
	
	/**
	 * 再入荷予定数量. Scheduled re-receipt qty..<p>
	 *
	 */
	public void re_arr_schd_qty(int value) {
		setConstNumber(offset + 45, $re_arr_schd_qty, value);
	}
	
	/**
	 * 再入荷予定数量. Scheduled re-receipt qty..<p>
	 *
	 */
	public void re_arr_schd_qty(long value) {
		setConstNumber(offset + 45, $re_arr_schd_qty, value);
	}
	
	/**
	 * 再入荷予定数量. Scheduled re-receipt qty..<p>
	 *
	 */
	public void re_arr_schd_qty(float value) {
		setConstNumber(offset + 45, $re_arr_schd_qty, value);
	}
	
	/**
	 * 再入荷予定数量. Scheduled re-receipt qty..<p>
	 *
	 */
	public void re_arr_schd_qty(double value) {
		setConstNumber(offset + 45, $re_arr_schd_qty, value);
	}
	
	/**
	 * 受領インボイス数量. Purchase invoice qty..<p>
	 *
	 */
	public MCNumber rcpt_iv_qty() {
		return getConstNumber(offset + 46, $rcpt_iv_qty);
	}

	/**
	 * 受領インボイス数量. Purchase invoice qty..<p>
	 *
	 */
	public void rcpt_iv_qty(MCNumber value) {
		setConstNumber(offset + 46, $rcpt_iv_qty, value);
	}
	
	/**
	 * 受領インボイス数量. Purchase invoice qty..<p>
	 *
	 */
	public void rcpt_iv_qty(int value) {
		setConstNumber(offset + 46, $rcpt_iv_qty, value);
	}
	
	/**
	 * 受領インボイス数量. Purchase invoice qty..<p>
	 *
	 */
	public void rcpt_iv_qty(long value) {
		setConstNumber(offset + 46, $rcpt_iv_qty, value);
	}
	
	/**
	 * 受領インボイス数量. Purchase invoice qty..<p>
	 *
	 */
	public void rcpt_iv_qty(float value) {
		setConstNumber(offset + 46, $rcpt_iv_qty, value);
	}
	
	/**
	 * 受領インボイス数量. Purchase invoice qty..<p>
	 *
	 */
	public void rcpt_iv_qty(double value) {
		setConstNumber(offset + 46, $rcpt_iv_qty, value);
	}
	
	/**
	 * 入荷数量. Receipt qty..<p>
	 *
	 */
	public MCNumber arr_qty() {
		return getConstNumber(offset + 47, $arr_qty);
	}

	/**
	 * 入荷数量. Receipt qty..<p>
	 *
	 */
	public void arr_qty(MCNumber value) {
		setConstNumber(offset + 47, $arr_qty, value);
	}
	
	/**
	 * 入荷数量. Receipt qty..<p>
	 *
	 */
	public void arr_qty(int value) {
		setConstNumber(offset + 47, $arr_qty, value);
	}
	
	/**
	 * 入荷数量. Receipt qty..<p>
	 *
	 */
	public void arr_qty(long value) {
		setConstNumber(offset + 47, $arr_qty, value);
	}
	
	/**
	 * 入荷数量. Receipt qty..<p>
	 *
	 */
	public void arr_qty(float value) {
		setConstNumber(offset + 47, $arr_qty, value);
	}
	
	/**
	 * 入荷数量. Receipt qty..<p>
	 *
	 */
	public void arr_qty(double value) {
		setConstNumber(offset + 47, $arr_qty, value);
	}
	
	/**
	 * 仕入数量. Purchase qty..<p>
	 *
	 */
	public MCNumber purc_qty() {
		return getConstNumber(offset + 48, $purc_qty);
	}

	/**
	 * 仕入数量. Purchase qty..<p>
	 *
	 */
	public void purc_qty(MCNumber value) {
		setConstNumber(offset + 48, $purc_qty, value);
	}
	
	/**
	 * 仕入数量. Purchase qty..<p>
	 *
	 */
	public void purc_qty(int value) {
		setConstNumber(offset + 48, $purc_qty, value);
	}
	
	/**
	 * 仕入数量. Purchase qty..<p>
	 *
	 */
	public void purc_qty(long value) {
		setConstNumber(offset + 48, $purc_qty, value);
	}
	
	/**
	 * 仕入数量. Purchase qty..<p>
	 *
	 */
	public void purc_qty(float value) {
		setConstNumber(offset + 48, $purc_qty, value);
	}
	
	/**
	 * 仕入数量. Purchase qty..<p>
	 *
	 */
	public void purc_qty(double value) {
		setConstNumber(offset + 48, $purc_qty, value);
	}
	
	/**
	 * 売上返品数量. Sales return qty..<p>
	 *
	 */
	public MCNumber sls_ret_qty() {
		return getConstNumber(offset + 49, $sls_ret_qty);
	}

	/**
	 * 売上返品数量. Sales return qty..<p>
	 *
	 */
	public void sls_ret_qty(MCNumber value) {
		setConstNumber(offset + 49, $sls_ret_qty, value);
	}
	
	/**
	 * 売上返品数量. Sales return qty..<p>
	 *
	 */
	public void sls_ret_qty(int value) {
		setConstNumber(offset + 49, $sls_ret_qty, value);
	}
	
	/**
	 * 売上返品数量. Sales return qty..<p>
	 *
	 */
	public void sls_ret_qty(long value) {
		setConstNumber(offset + 49, $sls_ret_qty, value);
	}
	
	/**
	 * 売上返品数量. Sales return qty..<p>
	 *
	 */
	public void sls_ret_qty(float value) {
		setConstNumber(offset + 49, $sls_ret_qty, value);
	}
	
	/**
	 * 売上返品数量. Sales return qty..<p>
	 *
	 */
	public void sls_ret_qty(double value) {
		setConstNumber(offset + 49, $sls_ret_qty, value);
	}
	
	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 50, $abort_flg);
	}

	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 50, $abort_flg, value);
	}

	/**
	 * 入荷予定打切数量. Cancelled remaining receipt schedule qty..<p>
	 *
	 */
	public MCNumber arr_schd_abort_qty() {
		return getConstNumber(offset + 51, $arr_schd_abort_qty);
	}

	/**
	 * 入荷予定打切数量. Cancelled remaining receipt schedule qty..<p>
	 *
	 */
	public void arr_schd_abort_qty(MCNumber value) {
		setConstNumber(offset + 51, $arr_schd_abort_qty, value);
	}
	
	/**
	 * 入荷予定打切数量. Cancelled remaining receipt schedule qty..<p>
	 *
	 */
	public void arr_schd_abort_qty(int value) {
		setConstNumber(offset + 51, $arr_schd_abort_qty, value);
	}
	
	/**
	 * 入荷予定打切数量. Cancelled remaining receipt schedule qty..<p>
	 *
	 */
	public void arr_schd_abort_qty(long value) {
		setConstNumber(offset + 51, $arr_schd_abort_qty, value);
	}
	
	/**
	 * 入荷予定打切数量. Cancelled remaining receipt schedule qty..<p>
	 *
	 */
	public void arr_schd_abort_qty(float value) {
		setConstNumber(offset + 51, $arr_schd_abort_qty, value);
	}
	
	/**
	 * 入荷予定打切数量. Cancelled remaining receipt schedule qty..<p>
	 *
	 */
	public void arr_schd_abort_qty(double value) {
		setConstNumber(offset + 51, $arr_schd_abort_qty, value);
	}
	
	/**
	 * 仕入予定打切数量. Cancelled remaining purchase schedule qty..<p>
	 *
	 */
	public MCNumber purc_schd_abort_qty() {
		return getConstNumber(offset + 52, $purc_schd_abort_qty);
	}

	/**
	 * 仕入予定打切数量. Cancelled remaining purchase schedule qty..<p>
	 *
	 */
	public void purc_schd_abort_qty(MCNumber value) {
		setConstNumber(offset + 52, $purc_schd_abort_qty, value);
	}
	
	/**
	 * 仕入予定打切数量. Cancelled remaining purchase schedule qty..<p>
	 *
	 */
	public void purc_schd_abort_qty(int value) {
		setConstNumber(offset + 52, $purc_schd_abort_qty, value);
	}
	
	/**
	 * 仕入予定打切数量. Cancelled remaining purchase schedule qty..<p>
	 *
	 */
	public void purc_schd_abort_qty(long value) {
		setConstNumber(offset + 52, $purc_schd_abort_qty, value);
	}
	
	/**
	 * 仕入予定打切数量. Cancelled remaining purchase schedule qty..<p>
	 *
	 */
	public void purc_schd_abort_qty(float value) {
		setConstNumber(offset + 52, $purc_schd_abort_qty, value);
	}
	
	/**
	 * 仕入予定打切数量. Cancelled remaining purchase schedule qty..<p>
	 *
	 */
	public void purc_schd_abort_qty(double value) {
		setConstNumber(offset + 52, $purc_schd_abort_qty, value);
	}
	
	/**
	 * 売上返品予定打切数量. Cancelled remaining sales return schedule qty..<p>
	 *
	 */
	public MCNumber sls_ret_schd_abort_qty() {
		return getConstNumber(offset + 53, $sls_ret_schd_abort_qty);
	}

	/**
	 * 売上返品予定打切数量. Cancelled remaining sales return schedule qty..<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(MCNumber value) {
		setConstNumber(offset + 53, $sls_ret_schd_abort_qty, value);
	}
	
	/**
	 * 売上返品予定打切数量. Cancelled remaining sales return schedule qty..<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(int value) {
		setConstNumber(offset + 53, $sls_ret_schd_abort_qty, value);
	}
	
	/**
	 * 売上返品予定打切数量. Cancelled remaining sales return schedule qty..<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(long value) {
		setConstNumber(offset + 53, $sls_ret_schd_abort_qty, value);
	}
	
	/**
	 * 売上返品予定打切数量. Cancelled remaining sales return schedule qty..<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(float value) {
		setConstNumber(offset + 53, $sls_ret_schd_abort_qty, value);
	}
	
	/**
	 * 売上返品予定打切数量. Cancelled remaining sales return schedule qty..<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(double value) {
		setConstNumber(offset + 53, $sls_ret_schd_abort_qty, value);
	}
	
	/**
	 * 検収不良数量. Acceptance defective qty..<p>
	 *
	 */
	public MCNumber accpt_dfct_qty() {
		return getConstNumber(offset + 54, $accpt_dfct_qty);
	}

	/**
	 * 検収不良数量. Acceptance defective qty..<p>
	 *
	 */
	public void accpt_dfct_qty(MCNumber value) {
		setConstNumber(offset + 54, $accpt_dfct_qty, value);
	}
	
	/**
	 * 検収不良数量. Acceptance defective qty..<p>
	 *
	 */
	public void accpt_dfct_qty(int value) {
		setConstNumber(offset + 54, $accpt_dfct_qty, value);
	}
	
	/**
	 * 検収不良数量. Acceptance defective qty..<p>
	 *
	 */
	public void accpt_dfct_qty(long value) {
		setConstNumber(offset + 54, $accpt_dfct_qty, value);
	}
	
	/**
	 * 検収不良数量. Acceptance defective qty..<p>
	 *
	 */
	public void accpt_dfct_qty(float value) {
		setConstNumber(offset + 54, $accpt_dfct_qty, value);
	}
	
	/**
	 * 検収不良数量. Acceptance defective qty..<p>
	 *
	 */
	public void accpt_dfct_qty(double value) {
		setConstNumber(offset + 54, $accpt_dfct_qty, value);
	}
	
	/**
	 * 標準納入ＬＴ. Standard delivery LT.<p>
	 *
	 */
	public MCNumber std_purc_lt() {
		return getConstNumber(offset + 55, $std_purc_lt);
	}

	/**
	 * 標準納入ＬＴ. Standard delivery LT.<p>
	 *
	 */
	public void std_purc_lt(MCNumber value) {
		setConstNumber(offset + 55, $std_purc_lt, value);
	}
	
	/**
	 * 標準納入ＬＴ. Standard delivery LT.<p>
	 *
	 */
	public void std_purc_lt(int value) {
		setConstNumber(offset + 55, $std_purc_lt, value);
	}
	
	/**
	 * 標準納入ＬＴ. Standard delivery LT.<p>
	 *
	 */
	public void std_purc_lt(long value) {
		setConstNumber(offset + 55, $std_purc_lt, value);
	}
	
	/**
	 * 標準納入ＬＴ. Standard delivery LT.<p>
	 *
	 */
	public void std_purc_lt(float value) {
		setConstNumber(offset + 55, $std_purc_lt, value);
	}
	
	/**
	 * 標準納入ＬＴ. Standard delivery LT.<p>
	 *
	 */
	public void std_purc_lt(double value) {
		setConstNumber(offset + 55, $std_purc_lt, value);
	}
	
	/**
	 * 納入ＬＴ. Delivery LT.<p>
	 *
	 */
	public MCNumber act_purc_lt() {
		return getConstNumber(offset + 56, $act_purc_lt);
	}

	/**
	 * 納入ＬＴ. Delivery LT.<p>
	 *
	 */
	public void act_purc_lt(MCNumber value) {
		setConstNumber(offset + 56, $act_purc_lt, value);
	}
	
	/**
	 * 納入ＬＴ. Delivery LT.<p>
	 *
	 */
	public void act_purc_lt(int value) {
		setConstNumber(offset + 56, $act_purc_lt, value);
	}
	
	/**
	 * 納入ＬＴ. Delivery LT.<p>
	 *
	 */
	public void act_purc_lt(long value) {
		setConstNumber(offset + 56, $act_purc_lt, value);
	}
	
	/**
	 * 納入ＬＴ. Delivery LT.<p>
	 *
	 */
	public void act_purc_lt(float value) {
		setConstNumber(offset + 56, $act_purc_lt, value);
	}
	
	/**
	 * 納入ＬＴ. Delivery LT.<p>
	 *
	 */
	public void act_purc_lt(double value) {
		setConstNumber(offset + 56, $act_purc_lt, value);
	}
	
	/**
	 * 理由ＣＤ. Reason cd..<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 57, $rsn_cd);
	}

	/**
	 * 理由ＣＤ. Reason cd..<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 57, $rsn_cd, value);
	}

	/**
	 * 購買状況区分. Purchase status type.<p>
	 *
	 */
	public String purc_sts_typ() {
		return getConstString(offset + 58, $purc_sts_typ);
	}

	/**
	 * 購買状況区分. Purchase status type.<p>
	 *
	 */
	public void purc_sts_typ(String value) {
		setConstString(offset + 58, $purc_sts_typ, value);
	}

	/**
	 * 回答納入日遅れＦＬＧ. Replied delivery date delay flg..<p>
	 *
	 */
	public boolean prms_dlv_dt_overdue_flg() {
		return getConstBoolean(offset + 59, $prms_dlv_dt_overdue_flg);
	}

	/**
	 * 回答納入日遅れＦＬＧ. Replied delivery date delay flg..<p>
	 *
	 */
	public void prms_dlv_dt_overdue_flg(boolean value) {
		setConstBoolean(offset + 59, $prms_dlv_dt_overdue_flg, value);
	}

	/**
	 * 納入希望日遅れＦＬＧ. Delivery dates delayed flg..<p>
	 *
	 */
	public boolean dlv_rqst_dt_overdue_flg() {
		return getConstBoolean(offset + 60, $dlv_rqst_dt_overdue_flg);
	}

	/**
	 * 納入希望日遅れＦＬＧ. Delivery dates delayed flg..<p>
	 *
	 */
	public void dlv_rqst_dt_overdue_flg(boolean value) {
		setConstBoolean(offset + 60, $dlv_rqst_dt_overdue_flg, value);
	}

	/**
	 * 入荷完了ＦＬＧ. Receipt completed flg..<p>
	 *
	 */
	public boolean arr_cmpl_flg() {
		return getConstBoolean(offset + 61, $arr_cmpl_flg);
	}

	/**
	 * 入荷完了ＦＬＧ. Receipt completed flg..<p>
	 *
	 */
	public void arr_cmpl_flg(boolean value) {
		setConstBoolean(offset + 61, $arr_cmpl_flg, value);
	}

	/**
	 * 仕入完了ＦＬＧ. Purchase completion flg..<p>
	 *
	 */
	public boolean purc_cmpl_flg() {
		return getConstBoolean(offset + 62, $purc_cmpl_flg);
	}

	/**
	 * 仕入完了ＦＬＧ. Purchase completion flg..<p>
	 *
	 */
	public void purc_cmpl_flg(boolean value) {
		setConstBoolean(offset + 62, $purc_cmpl_flg, value);
	}

	/**
	 * 売上返品完了ＦＬＧ. Sales return completion flg..<p>
	 *
	 */
	public boolean sls_ret_cmpl_flg() {
		return getConstBoolean(offset + 63, $sls_ret_cmpl_flg);
	}

	/**
	 * 売上返品完了ＦＬＧ. Sales return completion flg..<p>
	 *
	 */
	public void sls_ret_cmpl_flg(boolean value) {
		setConstBoolean(offset + 63, $sls_ret_cmpl_flg, value);
	}

	/**
	 * 入荷連絡備考. Receipt contact remarks.<p>
	 *
	 */
	public String arr_cnt_rmrks() {
		return getConstString(offset + 64, $arr_cnt_rmrks);
	}

	/**
	 * 入荷連絡備考. Receipt contact remarks.<p>
	 *
	 */
	public void arr_cnt_rmrks(String value) {
		setConstString(offset + 64, $arr_cnt_rmrks, value);
	}

	/**
	 * 発注日. PO date.<p>
	 *
	 */
	public MCDate po_dt() {
		return getConstDate(offset + 65, $po_dt);
	}

	/**
	 * 発注日. PO date.<p>
	 *
	 */
	public void po_dt(MCDate value) {
		setConstDate(offset + 65, $po_dt, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 66, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 66, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 67, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 67, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 68, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 68, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 69, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 69, $itm_sub3, value);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 70, $trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 70, $trd_cur_cd, value);
	}

	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 71, $trd_cur_amt);
	}

	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 71, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 71, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 71, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 71, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 71, $trd_cur_amt, value);
	}
	
	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 72, $sub_char1);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 72, $sub_char1, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 73, $sub_char2);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 73, $sub_char2, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 74, $sub_char3);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 74, $sub_char3, value);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 75, $sub_char4);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 75, $sub_char4, value);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 76, $sub_char5);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 76, $sub_char5, value);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 77, $sub_char6);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 77, $sub_char6, value);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 78, $sub_char7);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 78, $sub_char7, value);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 79, $sub_char8);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 79, $sub_char8, value);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 80, $sub_char9);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 80, $sub_char9, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 81, $sub_char10);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 81, $sub_char10, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public String sub_char11() {
		return getConstString(offset + 82, $sub_char11);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public void sub_char11(String value) {
		setConstString(offset + 82, $sub_char11, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public String sub_char12() {
		return getConstString(offset + 83, $sub_char12);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public void sub_char12(String value) {
		setConstString(offset + 83, $sub_char12, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public String sub_char13() {
		return getConstString(offset + 84, $sub_char13);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public void sub_char13(String value) {
		setConstString(offset + 84, $sub_char13, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public String sub_char14() {
		return getConstString(offset + 85, $sub_char14);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public void sub_char14(String value) {
		setConstString(offset + 85, $sub_char14, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public String sub_char15() {
		return getConstString(offset + 86, $sub_char15);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public void sub_char15(String value) {
		setConstString(offset + 86, $sub_char15, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public String sub_char16() {
		return getConstString(offset + 87, $sub_char16);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public void sub_char16(String value) {
		setConstString(offset + 87, $sub_char16, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public String sub_char17() {
		return getConstString(offset + 88, $sub_char17);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public void sub_char17(String value) {
		setConstString(offset + 88, $sub_char17, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public String sub_char18() {
		return getConstString(offset + 89, $sub_char18);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public void sub_char18(String value) {
		setConstString(offset + 89, $sub_char18, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public String sub_char19() {
		return getConstString(offset + 90, $sub_char19);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public void sub_char19(String value) {
		setConstString(offset + 90, $sub_char19, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public String sub_char20() {
		return getConstString(offset + 91, $sub_char20);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public void sub_char20(String value) {
		setConstString(offset + 91, $sub_char20, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public String sub_char21() {
		return getConstString(offset + 92, $sub_char21);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public void sub_char21(String value) {
		setConstString(offset + 92, $sub_char21, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public String sub_char22() {
		return getConstString(offset + 93, $sub_char22);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public void sub_char22(String value) {
		setConstString(offset + 93, $sub_char22, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public String sub_char23() {
		return getConstString(offset + 94, $sub_char23);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public void sub_char23(String value) {
		setConstString(offset + 94, $sub_char23, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public String sub_char24() {
		return getConstString(offset + 95, $sub_char24);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public void sub_char24(String value) {
		setConstString(offset + 95, $sub_char24, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public String sub_char25() {
		return getConstString(offset + 96, $sub_char25);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public void sub_char25(String value) {
		setConstString(offset + 96, $sub_char25, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public String sub_char26() {
		return getConstString(offset + 97, $sub_char26);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public void sub_char26(String value) {
		setConstString(offset + 97, $sub_char26, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public String sub_char27() {
		return getConstString(offset + 98, $sub_char27);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public void sub_char27(String value) {
		setConstString(offset + 98, $sub_char27, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public String sub_char28() {
		return getConstString(offset + 99, $sub_char28);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public void sub_char28(String value) {
		setConstString(offset + 99, $sub_char28, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public String sub_char29() {
		return getConstString(offset + 100, $sub_char29);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public void sub_char29(String value) {
		setConstString(offset + 100, $sub_char29, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public String sub_char30() {
		return getConstString(offset + 101, $sub_char30);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public void sub_char30(String value) {
		setConstString(offset + 101, $sub_char30, value);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 102, $sub_num1);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 102, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 102, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 102, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 102, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 102, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 103, $sub_num2);
	}

	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 103, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 103, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 103, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 103, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 103, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 104, $sub_num3);
	}

	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 104, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 104, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 104, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 104, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 104, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return getConstNumber(offset + 105, $sub_num4);
	}

	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		setConstNumber(offset + 105, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(int value) {
		setConstNumber(offset + 105, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(long value) {
		setConstNumber(offset + 105, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(float value) {
		setConstNumber(offset + 105, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(double value) {
		setConstNumber(offset + 105, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return getConstNumber(offset + 106, $sub_num5);
	}

	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		setConstNumber(offset + 106, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(int value) {
		setConstNumber(offset + 106, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(long value) {
		setConstNumber(offset + 106, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(float value) {
		setConstNumber(offset + 106, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(double value) {
		setConstNumber(offset + 106, $sub_num5, value);
	}
	
	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 107, $sub_dt1);
	}

	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 107, $sub_dt1, value);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 108, $sub_dt2);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 108, $sub_dt2, value);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 109, $sub_dt3);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 109, $sub_dt3, value);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return getConstDate(offset + 110, $sub_dt4);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		setConstDate(offset + 110, $sub_dt4, value);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return getConstDate(offset + 111, $sub_dt5);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		setConstDate(offset + 111, $sub_dt5, value);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 112, $batch_log_no);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 112, $batch_log_no, value);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 113, $log_sub_key1);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 113, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 113, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 113, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 113, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 113, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 114, $log_sub_key2);
	}

	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 114, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 114, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 114, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 114, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 114, $log_sub_key2, value);
	}
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 115, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 115, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 116, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 116, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 117, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 117, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 118, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 118, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 119, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 119, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 119, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 119, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 119, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 119, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 120, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 120, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 121, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 121, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 122, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 122, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 123, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 123, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 124, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 124, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			return exe_sts_typ();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
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
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			return purc_sts_typ();
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
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
		if ($sub_char11.equalsIgnoreCase(name)) {
			return sub_char11();
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			return sub_char12();
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			return sub_char13();
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			return sub_char14();
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			return sub_char15();
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			return sub_char16();
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			return sub_char17();
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			return sub_char18();
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			return sub_char19();
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			return sub_char20();
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			return sub_char21();
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			return sub_char22();
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			return sub_char23();
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			return sub_char24();
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			return sub_char25();
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			return sub_char26();
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			return sub_char27();
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			return sub_char28();
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			return sub_char29();
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			return sub_char30();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
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
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
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
		if ($sub_num4.equalsIgnoreCase(name)) {
			return sub_num4();
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			return sub_num5();
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			return log_sub_key1();
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			return log_sub_key2();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($dpt_st_dt.equalsIgnoreCase(name)) {
			return dpt_st_dt();
		}
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
		if ($po_dt.equalsIgnoreCase(name)) {
			return po_dt();
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
		if ($sub_dt4.equalsIgnoreCase(name)) {
			return sub_dt4();
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			return sub_dt5();
		}
		return super.getDate(name);
	}

	public MCTimestamp getTimestamp(String name) {
		if ($data_upd_ts.equalsIgnoreCase(name)) {
			return data_upd_ts();
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
		if ($bi_not_send_flg.equalsIgnoreCase(name)) {
			return bi_not_send_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($prms_dlv_dt_overdue_flg.equalsIgnoreCase(name)) {
			return prms_dlv_dt_overdue_flg();
		}
		if ($dlv_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_overdue_flg();
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
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			return exe_sts_typ();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
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
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			return purc_sts_typ();
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
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
		if ($sub_char11.equalsIgnoreCase(name)) {
			return sub_char11();
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			return sub_char12();
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			return sub_char13();
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			return sub_char14();
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			return sub_char15();
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			return sub_char16();
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			return sub_char17();
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			return sub_char18();
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			return sub_char19();
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			return sub_char20();
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			return sub_char21();
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			return sub_char22();
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			return sub_char23();
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			return sub_char24();
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			return sub_char25();
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			return sub_char26();
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			return sub_char27();
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			return sub_char28();
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			return sub_char29();
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			return sub_char30();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
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
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
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
		if ($sub_num4.equalsIgnoreCase(name)) {
			return sub_num4();
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			return sub_num5();
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			return log_sub_key1();
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			return log_sub_key2();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($dpt_st_dt.equalsIgnoreCase(name)) {
			return dpt_st_dt();
		}
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
		if ($po_dt.equalsIgnoreCase(name)) {
			return po_dt();
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
		if ($sub_dt4.equalsIgnoreCase(name)) {
			return sub_dt4();
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			return sub_dt5();
		}
		return super.getDateNE(name);
	}

	public MCTimestamp getTimestampNE(String name) {
		if ($data_upd_ts.equalsIgnoreCase(name)) {
			return data_upd_ts();
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
		if ($bi_not_send_flg.equalsIgnoreCase(name)) {
			return bi_not_send_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($prms_dlv_dt_overdue_flg.equalsIgnoreCase(name)) {
			return prms_dlv_dt_overdue_flg();
		}
		if ($dlv_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_overdue_flg();
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
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			exe_sts_typ(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
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
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			purc_sts_typ(value);
			return;
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
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
		if ($sub_char11.equalsIgnoreCase(name)) {
			sub_char11(value);
			return;
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			sub_char12(value);
			return;
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			sub_char13(value);
			return;
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			sub_char14(value);
			return;
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			sub_char15(value);
			return;
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			sub_char16(value);
			return;
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			sub_char17(value);
			return;
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			sub_char18(value);
			return;
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			sub_char19(value);
			return;
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			sub_char20(value);
			return;
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			sub_char21(value);
			return;
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			sub_char22(value);
			return;
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			sub_char23(value);
			return;
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			sub_char24(value);
			return;
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			sub_char25(value);
			return;
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			sub_char26(value);
			return;
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			sub_char27(value);
			return;
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			sub_char28(value);
			return;
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			sub_char29(value);
			return;
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			sub_char30(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
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
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($dpt_st_dt.equalsIgnoreCase(name)) {
			dpt_st_dt(value);
			return;
		}
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
		if ($po_dt.equalsIgnoreCase(name)) {
			po_dt(value);
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
		if ($sub_dt4.equalsIgnoreCase(name)) {
			sub_dt4(value);
			return;
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			sub_dt5(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setTimestamp(String name, MCTimestamp value) {
		if ($data_upd_ts.equalsIgnoreCase(name)) {
			data_upd_ts(value);
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
		if ($bi_not_send_flg.equalsIgnoreCase(name)) {
			bi_not_send_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
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
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			exe_sts_typ(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
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
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			purc_sts_typ(value);
			return;
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
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
		if ($sub_char11.equalsIgnoreCase(name)) {
			sub_char11(value);
			return;
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			sub_char12(value);
			return;
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			sub_char13(value);
			return;
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			sub_char14(value);
			return;
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			sub_char15(value);
			return;
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			sub_char16(value);
			return;
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			sub_char17(value);
			return;
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			sub_char18(value);
			return;
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			sub_char19(value);
			return;
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			sub_char20(value);
			return;
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			sub_char21(value);
			return;
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			sub_char22(value);
			return;
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			sub_char23(value);
			return;
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			sub_char24(value);
			return;
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			sub_char25(value);
			return;
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			sub_char26(value);
			return;
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			sub_char27(value);
			return;
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			sub_char28(value);
			return;
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			sub_char29(value);
			return;
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			sub_char30(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
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
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($dpt_st_dt.equalsIgnoreCase(name)) {
			dpt_st_dt(value);
			return;
		}
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
		if ($po_dt.equalsIgnoreCase(name)) {
			po_dt(value);
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
		if ($sub_dt4.equalsIgnoreCase(name)) {
			sub_dt4(value);
			return;
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			sub_dt5(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setTimestampNE(String name, MCTimestamp value) {
		if ($data_upd_ts.equalsIgnoreCase(name)) {
			data_upd_ts(value);
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
		if ($bi_not_send_flg.equalsIgnoreCase(name)) {
			bi_not_send_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
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
