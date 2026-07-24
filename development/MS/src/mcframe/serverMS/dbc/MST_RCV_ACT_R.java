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
 * "入金実績ヘッダ // Payment received result header"DBコンテナRowクラスです。<p>
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
 *  	<td>rcv_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金実績ＮＯ</td>
 *  	<td>Payment received result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>rcv_act_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金実績連番</td>
 *  	<td>Payment received result sequence number</td>
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
 *  	<td>rcv_act_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金実績改訂番号</td>
 *  	<td>Payment received result rev. number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ar_trd_grp_typ</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債権取引グループ区分</td>
 *  	<td>AR transaction group type</td>
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
 *  	<td>rcv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金ＮＯ</td>
 *  	<td>Payment received No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門ＣＤ</td>
 *  	<td>Dept. cd.</td>
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
 *  	<td>usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者ＣＤ</td>
 *  	<td>PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金先ＣＤ</td>
 *  	<td>Payer cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bcst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求先ＣＤ</td>
 *  	<td>Billing customer cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求部門ＣＤ</td>
 *  	<td>Billing dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cred_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>与信管理先ＣＤ</td>
 *  	<td>Credit managed BP cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金日</td>
 *  	<td>Payment received date</td>
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
 *  	<td>bill_basis_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求起算日</td>
 *  	<td>Billing base date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計上年月</td>
 *  	<td>Recording month</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨ＣＤ</td>
 *  	<td>Transaction currency cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨ＣＤ</td>
 *  	<td>Base currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xrate_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>為替レートＣＤ</td>
 *  	<td>Exchange rate cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>為替レート</td>
 *  	<td>Exchange rate</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_ac_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引会計理由ＣＤ</td>
 *  	<td>Transaction accounting reason cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_sttl_cd1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権決済方法ＣＤ１</td>
 *  	<td>AR settlement method cd. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ar_sttl_typ1</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権決済区分１</td>
 *  	<td>AR settlement type 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_sttl_ac_rsn_cd1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権決済会計理由ＣＤ１</td>
 *  	<td>AR settlement accounting reason cd. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_cd1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税ＣＤ１</td>
 *  	<td>Tax cd. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bank_ac_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>口座ＣＤ</td>
 *  	<td>Bank account cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xfr_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振込人名</td>
 *  	<td>Payment person name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>note_mng_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手形管理ＮＯ</td>
 *  	<td>Note management No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>note_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手形番号</td>
 *  	<td>Note number</td>
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
 *  	<td>debt_cred_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権債務先識別区分</td>
 *  	<td>AR/AP BP identification type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>debt_cred_id_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権債務先識別ＣＤ</td>
 *  	<td>AR/AP identification cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>debt_cred_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権債務先名</td>
 *  	<td>AR/AP BP name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_sttl_cd2</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権決済方法ＣＤ２</td>
 *  	<td>AR settlement method cd. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ar_sttl_typ2</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権決済区分２</td>
 *  	<td>AR settlement type 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_sttl_ac_rsn_cd2</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権決済会計理由ＣＤ２</td>
 *  	<td>AR settlement accounting reason cd. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_cd2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税ＣＤ２</td>
 *  	<td>Tax cd. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_sttl_cd3</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権決済方法ＣＤ３</td>
 *  	<td>AR settlement method cd. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ar_sttl_typ3</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権決済区分３</td>
 *  	<td>AR settlement type 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_sttl_ac_rsn_cd3</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権決済会計理由ＣＤ３</td>
 *  	<td>AR settlement accounting reason cd. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_cd3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税ＣＤ３</td>
 *  	<td>Tax cd. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨金額</td>
 *  	<td>Amount (Transaction currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>subttl1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額小計１</td>
 *  	<td>Amount subtotal 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>subttl2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額小計２</td>
 *  	<td>Amount subtotal 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>subttl3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額小計３</td>
 *  	<td>Amount subtotal 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>内税額</td>
 *  	<td>Tax inclusive amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_subttl1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>内税小計１</td>
 *  	<td>Tax inclusive subtotal 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_subttl2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>内税小計２</td>
 *  	<td>Tax inclusive subtotal 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_subttl3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>内税小計３</td>
 *  	<td>Tax inclusive subtotal 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨金額</td>
 *  	<td>Amount (Base currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_subttl1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨小計１</td>
 *  	<td>Subtotal 1 (Base currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_subttl2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨小計２</td>
 *  	<td>Subtotal 2 (Base currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_subttl3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨小計３</td>
 *  	<td>Subtotal 3 (Base currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨内税額</td>
 *  	<td>Tax inclusive amount (Base currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_tax_subttl1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨内税小計１</td>
 *  	<td>Tax inclusive subtotal 1 (Base currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_tax_subttl2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨内税小計２</td>
 *  	<td>Tax inclusive subtotal 2 (Base currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_tax_subttl3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨内税小計３</td>
 *  	<td>Tax inclusive subtotal 3 (Base currency)</td>
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
 *  	<td>slip_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>伝票状況区分</td>
 *  	<td>Slip status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_rcv_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親入金実績ＮＯ</td>
 *  	<td>Parent incoming payment result No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_rcv_act_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親入金実績連番</td>
 *  	<td>Parent incoming payment result sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_slip_prnt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債権伝票帳票区分</td>
 *  	<td>AR slip report type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcv_auto_appl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金自動消込ＦＬＧ</td>
 *  	<td>Auto-reconciliation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発行済ＦＬＧ</td>
 *  	<td>Issued flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_dtl_adv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求書前受金表示ＦＬＧ</td>
 *  	<td>Display advance received on invoice flg.</td>
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
public class MST_RCV_ACT_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_RCV_ACT";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 入金実績ＮＯ. Payment received result No..<p>
	 *
	 */
	public static final String $rcv_act_no = "rcv_act_no";
	private static final MCPermColumnInfo _rcv_act_no = createColumnInfo("rcv_act_no");
	public final MCStringPermColumn rcv_act_no = createStringColumn(_rcv_act_no);
	
	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public static final String $rcv_act_seq = "rcv_act_seq";
	private static final MCPermColumnInfo _rcv_act_seq = createColumnInfo("rcv_act_seq");
	public final MCNumberPermColumn rcv_act_seq = createNumberColumn(_rcv_act_seq);
	
	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	private static final MCPermColumnInfo _trd_cd = createColumnInfo("trd_cd");
	public final MCStringPermColumn trd_cd = createStringColumn(_trd_cd);
	
	/**
	 * 入金実績改訂番号. Payment received result rev. number.<p>
	 *
	 */
	public static final String $rcv_act_rev = "rcv_act_rev";
	private static final MCPermColumnInfo _rcv_act_rev = createColumnInfo("rcv_act_rev");
	public final MCNumberPermColumn rcv_act_rev = createNumberColumn(_rcv_act_rev);
	
	/**
	 * 債権取引グループ区分. AR transaction group type.<p>
	 *
	 */
	public static final String $ar_trd_grp_typ = "ar_trd_grp_typ";
	private static final MCPermColumnInfo _ar_trd_grp_typ = createColumnInfo("ar_trd_grp_typ");
	public final MCStringPermColumn ar_trd_grp_typ = createStringColumn(_ar_trd_grp_typ);
	
	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	private static final MCPermColumnInfo _trd_ptn_typ = createColumnInfo("trd_ptn_typ");
	public final MCStringPermColumn trd_ptn_typ = createStringColumn(_trd_ptn_typ);
	
	/**
	 * 入金ＮＯ. Payment received No..<p>
	 *
	 */
	public static final String $rcv_no = "rcv_no";
	private static final MCPermColumnInfo _rcv_no = createColumnInfo("rcv_no");
	public final MCStringPermColumn rcv_no = createStringColumn(_rcv_no);
	
	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	private static final MCPermColumnInfo _dpt_cd = createColumnInfo("dpt_cd");
	public final MCStringPermColumn dpt_cd = createStringColumn(_dpt_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	private static final MCPermColumnInfo _usr_cd = createColumnInfo("usr_cd");
	public final MCStringPermColumn usr_cd = createStringColumn(_usr_cd);
	
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
	 * 請求部門ＣＤ. Billing dept. cd..<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	private static final MCPermColumnInfo _bill_dpt_cd = createColumnInfo("bill_dpt_cd");
	public final MCStringPermColumn bill_dpt_cd = createStringColumn(_bill_dpt_cd);
	
	/**
	 * 与信管理先ＣＤ. Credit managed BP cd..<p>
	 *
	 */
	public static final String $cred_cd = "cred_cd";
	private static final MCPermColumnInfo _cred_cd = createColumnInfo("cred_cd");
	public final MCStringPermColumn cred_cd = createStringColumn(_cred_cd);
	
	/**
	 * 入金日. Payment received date.<p>
	 *
	 */
	public static final String $rcv_dt = "rcv_dt";
	private static final MCPermColumnInfo _rcv_dt = createColumnInfo("rcv_dt");
	public final MCDatePermColumn rcv_dt = createDateColumn(_rcv_dt);
	
	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	private static final MCPermColumnInfo _ac_dt = createColumnInfo("ac_dt");
	public final MCDatePermColumn ac_dt = createDateColumn(_ac_dt);
	
	/**
	 * 請求起算日. Billing base date.<p>
	 *
	 */
	public static final String $bill_basis_dt = "bill_basis_dt";
	private static final MCPermColumnInfo _bill_basis_dt = createColumnInfo("bill_basis_dt");
	public final MCDatePermColumn bill_basis_dt = createDateColumn(_bill_basis_dt);
	
	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	private static final MCPermColumnInfo _ac_ym = createColumnInfo("ac_ym");
	public final MCDatePermColumn ac_ym = createDateColumn(_ac_ym);
	
	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	private static final MCPermColumnInfo _trd_cur_cd = createColumnInfo("trd_cur_cd");
	public final MCStringPermColumn trd_cur_cd = createStringColumn(_trd_cur_cd);
	
	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	private static final MCPermColumnInfo _base_cur_cd = createColumnInfo("base_cur_cd");
	public final MCStringPermColumn base_cur_cd = createStringColumn(_base_cur_cd);
	
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
	 * 取引会計理由ＣＤ. Transaction accounting reason cd..<p>
	 *
	 */
	public static final String $trd_ac_rsn_cd = "trd_ac_rsn_cd";
	private static final MCPermColumnInfo _trd_ac_rsn_cd = createColumnInfo("trd_ac_rsn_cd");
	public final MCStringPermColumn trd_ac_rsn_cd = createStringColumn(_trd_ac_rsn_cd);
	
	/**
	 * 債権決済方法ＣＤ１. AR settlement method cd. 1.<p>
	 *
	 */
	public static final String $ar_sttl_cd1 = "ar_sttl_cd1";
	private static final MCPermColumnInfo _ar_sttl_cd1 = createColumnInfo("ar_sttl_cd1");
	public final MCStringPermColumn ar_sttl_cd1 = createStringColumn(_ar_sttl_cd1);
	
	/**
	 * 債権決済区分１. AR settlement type 1.<p>
	 *
	 */
	public static final String $ar_sttl_typ1 = "ar_sttl_typ1";
	private static final MCPermColumnInfo _ar_sttl_typ1 = createColumnInfo("ar_sttl_typ1");
	public final MCStringPermColumn ar_sttl_typ1 = createStringColumn(_ar_sttl_typ1);
	
	/**
	 * 債権決済会計理由ＣＤ１. AR settlement accounting reason cd. 1.<p>
	 *
	 */
	public static final String $ar_sttl_ac_rsn_cd1 = "ar_sttl_ac_rsn_cd1";
	private static final MCPermColumnInfo _ar_sttl_ac_rsn_cd1 = createColumnInfo("ar_sttl_ac_rsn_cd1");
	public final MCStringPermColumn ar_sttl_ac_rsn_cd1 = createStringColumn(_ar_sttl_ac_rsn_cd1);
	
	/**
	 * 税ＣＤ１. Tax cd. 1.<p>
	 *
	 */
	public static final String $tax_cd1 = "tax_cd1";
	private static final MCPermColumnInfo _tax_cd1 = createColumnInfo("tax_cd1");
	public final MCStringPermColumn tax_cd1 = createStringColumn(_tax_cd1);
	
	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	private static final MCPermColumnInfo _bank_ac_cd = createColumnInfo("bank_ac_cd");
	public final MCStringPermColumn bank_ac_cd = createStringColumn(_bank_ac_cd);
	
	/**
	 * 振込人名. Payment person name.<p>
	 *
	 */
	public static final String $xfr_psn = "xfr_psn";
	private static final MCPermColumnInfo _xfr_psn = createColumnInfo("xfr_psn");
	public final MCStringPermColumn xfr_psn = createStringColumn(_xfr_psn);
	
	/**
	 * 手形管理ＮＯ. Note management No..<p>
	 *
	 */
	public static final String $note_mng_no = "note_mng_no";
	private static final MCPermColumnInfo _note_mng_no = createColumnInfo("note_mng_no");
	public final MCStringPermColumn note_mng_no = createStringColumn(_note_mng_no);
	
	/**
	 * 手形番号. Note number.<p>
	 *
	 */
	public static final String $note_no = "note_no";
	private static final MCPermColumnInfo _note_no = createColumnInfo("note_no");
	public final MCStringPermColumn note_no = createStringColumn(_note_no);
	
	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	private static final MCPermColumnInfo _bd_dpt_cd = createColumnInfo("bd_dpt_cd");
	public final MCStringPermColumn bd_dpt_cd = createStringColumn(_bd_dpt_cd);
	
	/**
	 * 債権債務先識別区分. AR/AP BP identification type.<p>
	 *
	 */
	public static final String $debt_cred_id_typ = "debt_cred_id_typ";
	private static final MCPermColumnInfo _debt_cred_id_typ = createColumnInfo("debt_cred_id_typ");
	public final MCStringPermColumn debt_cred_id_typ = createStringColumn(_debt_cred_id_typ);
	
	/**
	 * 債権債務先識別ＣＤ. AR/AP identification cd..<p>
	 *
	 */
	public static final String $debt_cred_id_cd = "debt_cred_id_cd";
	private static final MCPermColumnInfo _debt_cred_id_cd = createColumnInfo("debt_cred_id_cd");
	public final MCStringPermColumn debt_cred_id_cd = createStringColumn(_debt_cred_id_cd);
	
	/**
	 * 債権債務先名. AR/AP BP name.<p>
	 *
	 */
	public static final String $debt_cred_nm = "debt_cred_nm";
	private static final MCPermColumnInfo _debt_cred_nm = createColumnInfo("debt_cred_nm");
	public final MCStringPermColumn debt_cred_nm = createStringColumn(_debt_cred_nm);
	
	/**
	 * 債権決済方法ＣＤ２. AR settlement method cd. 2.<p>
	 *
	 */
	public static final String $ar_sttl_cd2 = "ar_sttl_cd2";
	private static final MCPermColumnInfo _ar_sttl_cd2 = createColumnInfo("ar_sttl_cd2");
	public final MCStringPermColumn ar_sttl_cd2 = createStringColumn(_ar_sttl_cd2);
	
	/**
	 * 債権決済区分２. AR settlement type 2.<p>
	 *
	 */
	public static final String $ar_sttl_typ2 = "ar_sttl_typ2";
	private static final MCPermColumnInfo _ar_sttl_typ2 = createColumnInfo("ar_sttl_typ2");
	public final MCStringPermColumn ar_sttl_typ2 = createStringColumn(_ar_sttl_typ2);
	
	/**
	 * 債権決済会計理由ＣＤ２. AR settlement accounting reason cd. 2.<p>
	 *
	 */
	public static final String $ar_sttl_ac_rsn_cd2 = "ar_sttl_ac_rsn_cd2";
	private static final MCPermColumnInfo _ar_sttl_ac_rsn_cd2 = createColumnInfo("ar_sttl_ac_rsn_cd2");
	public final MCStringPermColumn ar_sttl_ac_rsn_cd2 = createStringColumn(_ar_sttl_ac_rsn_cd2);
	
	/**
	 * 税ＣＤ２. Tax cd. 2.<p>
	 *
	 */
	public static final String $tax_cd2 = "tax_cd2";
	private static final MCPermColumnInfo _tax_cd2 = createColumnInfo("tax_cd2");
	public final MCStringPermColumn tax_cd2 = createStringColumn(_tax_cd2);
	
	/**
	 * 債権決済方法ＣＤ３. AR settlement method cd. 3.<p>
	 *
	 */
	public static final String $ar_sttl_cd3 = "ar_sttl_cd3";
	private static final MCPermColumnInfo _ar_sttl_cd3 = createColumnInfo("ar_sttl_cd3");
	public final MCStringPermColumn ar_sttl_cd3 = createStringColumn(_ar_sttl_cd3);
	
	/**
	 * 債権決済区分３. AR settlement type 3.<p>
	 *
	 */
	public static final String $ar_sttl_typ3 = "ar_sttl_typ3";
	private static final MCPermColumnInfo _ar_sttl_typ3 = createColumnInfo("ar_sttl_typ3");
	public final MCStringPermColumn ar_sttl_typ3 = createStringColumn(_ar_sttl_typ3);
	
	/**
	 * 債権決済会計理由ＣＤ３. AR settlement accounting reason cd. 3.<p>
	 *
	 */
	public static final String $ar_sttl_ac_rsn_cd3 = "ar_sttl_ac_rsn_cd3";
	private static final MCPermColumnInfo _ar_sttl_ac_rsn_cd3 = createColumnInfo("ar_sttl_ac_rsn_cd3");
	public final MCStringPermColumn ar_sttl_ac_rsn_cd3 = createStringColumn(_ar_sttl_ac_rsn_cd3);
	
	/**
	 * 税ＣＤ３. Tax cd. 3.<p>
	 *
	 */
	public static final String $tax_cd3 = "tax_cd3";
	private static final MCPermColumnInfo _tax_cd3 = createColumnInfo("tax_cd3");
	public final MCStringPermColumn tax_cd3 = createStringColumn(_tax_cd3);
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	private static final MCPermColumnInfo _trd_cur_amt = createColumnInfo("trd_cur_amt");
	public final MCNumberPermColumn trd_cur_amt = createNumberColumn(_trd_cur_amt);
	
	/**
	 * 金額小計１. Amount subtotal 1.<p>
	 *
	 */
	public static final String $subttl1 = "subttl1";
	private static final MCPermColumnInfo _subttl1 = createColumnInfo("subttl1");
	public final MCNumberPermColumn subttl1 = createNumberColumn(_subttl1);
	
	/**
	 * 金額小計２. Amount subtotal 2.<p>
	 *
	 */
	public static final String $subttl2 = "subttl2";
	private static final MCPermColumnInfo _subttl2 = createColumnInfo("subttl2");
	public final MCNumberPermColumn subttl2 = createNumberColumn(_subttl2);
	
	/**
	 * 金額小計３. Amount subtotal 3.<p>
	 *
	 */
	public static final String $subttl3 = "subttl3";
	private static final MCPermColumnInfo _subttl3 = createColumnInfo("subttl3");
	public final MCNumberPermColumn subttl3 = createNumberColumn(_subttl3);
	
	/**
	 * 内税額. Tax inclusive amount.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	private static final MCPermColumnInfo _tax_amt = createColumnInfo("tax_amt");
	public final MCNumberPermColumn tax_amt = createNumberColumn(_tax_amt);
	
	/**
	 * 内税小計１. Tax inclusive subtotal 1.<p>
	 *
	 */
	public static final String $tax_subttl1 = "tax_subttl1";
	private static final MCPermColumnInfo _tax_subttl1 = createColumnInfo("tax_subttl1");
	public final MCNumberPermColumn tax_subttl1 = createNumberColumn(_tax_subttl1);
	
	/**
	 * 内税小計２. Tax inclusive subtotal 2.<p>
	 *
	 */
	public static final String $tax_subttl2 = "tax_subttl2";
	private static final MCPermColumnInfo _tax_subttl2 = createColumnInfo("tax_subttl2");
	public final MCNumberPermColumn tax_subttl2 = createNumberColumn(_tax_subttl2);
	
	/**
	 * 内税小計３. Tax inclusive subtotal 3.<p>
	 *
	 */
	public static final String $tax_subttl3 = "tax_subttl3";
	private static final MCPermColumnInfo _tax_subttl3 = createColumnInfo("tax_subttl3");
	public final MCNumberPermColumn tax_subttl3 = createNumberColumn(_tax_subttl3);
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	private static final MCPermColumnInfo _base_cur_amt = createColumnInfo("base_cur_amt");
	public final MCNumberPermColumn base_cur_amt = createNumberColumn(_base_cur_amt);
	
	/**
	 * 基準通貨小計１. Subtotal 1 (Base currency).<p>
	 *
	 */
	public static final String $base_cur_subttl1 = "base_cur_subttl1";
	private static final MCPermColumnInfo _base_cur_subttl1 = createColumnInfo("base_cur_subttl1");
	public final MCNumberPermColumn base_cur_subttl1 = createNumberColumn(_base_cur_subttl1);
	
	/**
	 * 基準通貨小計２. Subtotal 2 (Base currency).<p>
	 *
	 */
	public static final String $base_cur_subttl2 = "base_cur_subttl2";
	private static final MCPermColumnInfo _base_cur_subttl2 = createColumnInfo("base_cur_subttl2");
	public final MCNumberPermColumn base_cur_subttl2 = createNumberColumn(_base_cur_subttl2);
	
	/**
	 * 基準通貨小計３. Subtotal 3 (Base currency).<p>
	 *
	 */
	public static final String $base_cur_subttl3 = "base_cur_subttl3";
	private static final MCPermColumnInfo _base_cur_subttl3 = createColumnInfo("base_cur_subttl3");
	public final MCNumberPermColumn base_cur_subttl3 = createNumberColumn(_base_cur_subttl3);
	
	/**
	 * 基準通貨内税額. Tax inclusive amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	private static final MCPermColumnInfo _base_cur_tax_amt = createColumnInfo("base_cur_tax_amt");
	public final MCNumberPermColumn base_cur_tax_amt = createNumberColumn(_base_cur_tax_amt);
	
	/**
	 * 基準通貨内税小計１. Tax inclusive subtotal 1 (Base currency).<p>
	 *
	 */
	public static final String $base_cur_tax_subttl1 = "base_cur_tax_subttl1";
	private static final MCPermColumnInfo _base_cur_tax_subttl1 = createColumnInfo("base_cur_tax_subttl1");
	public final MCNumberPermColumn base_cur_tax_subttl1 = createNumberColumn(_base_cur_tax_subttl1);
	
	/**
	 * 基準通貨内税小計２. Tax inclusive subtotal 2 (Base currency).<p>
	 *
	 */
	public static final String $base_cur_tax_subttl2 = "base_cur_tax_subttl2";
	private static final MCPermColumnInfo _base_cur_tax_subttl2 = createColumnInfo("base_cur_tax_subttl2");
	public final MCNumberPermColumn base_cur_tax_subttl2 = createNumberColumn(_base_cur_tax_subttl2);
	
	/**
	 * 基準通貨内税小計３. Tax inclusive subtotal 3 (Base currency).<p>
	 *
	 */
	public static final String $base_cur_tax_subttl3 = "base_cur_tax_subttl3";
	private static final MCPermColumnInfo _base_cur_tax_subttl3 = createColumnInfo("base_cur_tax_subttl3");
	public final MCNumberPermColumn base_cur_tax_subttl3 = createNumberColumn(_base_cur_tax_subttl3);
	
	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	private static final MCPermColumnInfo _trd_rmrks = createColumnInfo("trd_rmrks");
	public final MCStringPermColumn trd_rmrks = createStringColumn(_trd_rmrks);
	
	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	private static final MCPermColumnInfo _slip_sts_typ = createColumnInfo("slip_sts_typ");
	public final MCStringPermColumn slip_sts_typ = createStringColumn(_slip_sts_typ);
	
	/**
	 * 親入金実績ＮＯ. Parent incoming payment result No..<p>
	 *
	 */
	public static final String $par_rcv_act_no = "par_rcv_act_no";
	private static final MCPermColumnInfo _par_rcv_act_no = createColumnInfo("par_rcv_act_no");
	public final MCStringPermColumn par_rcv_act_no = createStringColumn(_par_rcv_act_no);
	
	/**
	 * 親入金実績連番. Parent incoming payment result sequence number.<p>
	 *
	 */
	public static final String $par_rcv_act_seq = "par_rcv_act_seq";
	private static final MCPermColumnInfo _par_rcv_act_seq = createColumnInfo("par_rcv_act_seq");
	public final MCNumberPermColumn par_rcv_act_seq = createNumberColumn(_par_rcv_act_seq);
	
	/**
	 * 債権伝票帳票区分. AR slip report type.<p>
	 *
	 */
	public static final String $ar_slip_prnt_typ = "ar_slip_prnt_typ";
	private static final MCPermColumnInfo _ar_slip_prnt_typ = createColumnInfo("ar_slip_prnt_typ");
	public final MCStringPermColumn ar_slip_prnt_typ = createStringColumn(_ar_slip_prnt_typ);
	
	/**
	 * 入金自動消込ＦＬＧ. Auto-reconciliation flg..<p>
	 *
	 */
	public static final String $rcv_auto_appl_flg = "rcv_auto_appl_flg";
	private static final MCPermColumnInfo _rcv_auto_appl_flg = createColumnInfo("rcv_auto_appl_flg");
	public final MCBooleanPermColumn rcv_auto_appl_flg = createBooleanColumn(_rcv_auto_appl_flg);
	
	/**
	 * 発行済ＦＬＧ. Issued flg..<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";
	private static final MCPermColumnInfo _prnt_flg = createColumnInfo("prnt_flg");
	public final MCBooleanPermColumn prnt_flg = createBooleanColumn(_prnt_flg);
	
	/**
	 * 請求書前受金表示ＦＬＧ. Display advance received on invoice flg..<p>
	 *
	 */
	public static final String $bill_dtl_adv_flg = "bill_dtl_adv_flg";
	private static final MCPermColumnInfo _bill_dtl_adv_flg = createColumnInfo("bill_dtl_adv_flg");
	public final MCBooleanPermColumn bill_dtl_adv_flg = createBooleanColumn(_bill_dtl_adv_flg);
	
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
	
	public static final MCMeta rcv_act_no_META = createCommonMeta($rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta rcv_act_seq_META = createCommonMeta($rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta rcv_act_rev_META = createCommonMeta($rcv_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta ar_trd_grp_typ_META = createCommonMeta($ar_trd_grp_typ, mcframe.commonMA.meta.MA_META.AR_TRD_GRP_TYP);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta rcv_no_META = createCommonMeta($rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta cred_cd_META = createCommonMeta($cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcv_dt_META = createCommonMeta($rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_basis_dt_META = createCommonMeta($bill_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_ac_rsn_cd_META = createCommonMeta($trd_ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta ar_sttl_cd1_META = createCommonMeta($ar_sttl_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_typ1_META = createCommonMeta($ar_sttl_typ1, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta ar_sttl_ac_rsn_cd1_META = createCommonMeta($ar_sttl_ac_rsn_cd1, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta tax_cd1_META = createCommonMeta($tax_cd1, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta xfr_psn_META = createCommonMeta($xfr_psn, mcframe.commonMA.meta.MA_META.XFR_PSN);
	public static final MCMeta note_mng_no_META = createCommonMeta($note_mng_no, mcframe.commonMA.meta.MA_META.NOTE_MNG_NO);
	public static final MCMeta note_no_META = createCommonMeta($note_no, mcframe.commonMA.meta.MA_META.NOTE_NO);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta debt_cred_id_typ_META = createCommonMeta($debt_cred_id_typ, mcframe.commonMA.meta.MA_META.DEBT_CRED_ID_TYP);
	public static final MCMeta debt_cred_id_cd_META = createCommonMeta($debt_cred_id_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta debt_cred_nm_META = createCommonMeta($debt_cred_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ar_sttl_cd2_META = createCommonMeta($ar_sttl_cd2, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_typ2_META = createCommonMeta($ar_sttl_typ2, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta ar_sttl_ac_rsn_cd2_META = createCommonMeta($ar_sttl_ac_rsn_cd2, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta tax_cd2_META = createCommonMeta($tax_cd2, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta ar_sttl_cd3_META = createCommonMeta($ar_sttl_cd3, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_typ3_META = createCommonMeta($ar_sttl_typ3, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta ar_sttl_ac_rsn_cd3_META = createCommonMeta($ar_sttl_ac_rsn_cd3, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta tax_cd3_META = createCommonMeta($tax_cd3, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta subttl1_META = createCommonMeta($subttl1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta subttl2_META = createCommonMeta($subttl2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta subttl3_META = createCommonMeta($subttl3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_subttl1_META = createCommonMeta($tax_subttl1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_subttl2_META = createCommonMeta($tax_subttl2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_subttl3_META = createCommonMeta($tax_subttl3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_subttl1_META = createCommonMeta($base_cur_subttl1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_subttl2_META = createCommonMeta($base_cur_subttl2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_subttl3_META = createCommonMeta($base_cur_subttl3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_subttl1_META = createCommonMeta($base_cur_tax_subttl1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_subttl2_META = createCommonMeta($base_cur_tax_subttl2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_subttl3_META = createCommonMeta($base_cur_tax_subttl3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta par_rcv_act_no_META = createCommonMeta($par_rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta par_rcv_act_seq_META = createCommonMeta($par_rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta ar_slip_prnt_typ_META = createCommonMeta($ar_slip_prnt_typ, mcframe.commonMS.meta.MS_META.AR_SLIP_PRNT_TYP);
	public static final MCMeta rcv_auto_appl_flg_META = createCommonMeta($rcv_auto_appl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dtl_adv_flg_META = createCommonMeta($bill_dtl_adv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_RCV_ACT_R> constMetas = new ConstMetaList<MST_RCV_ACT_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			rcv_act_no_META,
			rcv_act_seq_META,
			trd_cd_META,
			rcv_act_rev_META,
			ar_trd_grp_typ_META,
			trd_ptn_typ_META,
			rcv_no_META,
			dpt_cd_META,
			wg_cd_META,
			usr_cd_META,
			rcst_cd_META,
			bcst_cd_META,
			bill_dpt_cd_META,
			cred_cd_META,
			rcv_dt_META,
			ac_dt_META,
			bill_basis_dt_META,
			ac_ym_META,
			trd_cur_cd_META,
			base_cur_cd_META,
			xrate_cd_META,
			xrate_META,
			trd_ac_rsn_cd_META,
			ar_sttl_cd1_META,
			ar_sttl_typ1_META,
			ar_sttl_ac_rsn_cd1_META,
			tax_cd1_META,
			bank_ac_cd_META,
			xfr_psn_META,
			note_mng_no_META,
			note_no_META,
			bd_dpt_cd_META,
			debt_cred_id_typ_META,
			debt_cred_id_cd_META,
			debt_cred_nm_META,
			ar_sttl_cd2_META,
			ar_sttl_typ2_META,
			ar_sttl_ac_rsn_cd2_META,
			tax_cd2_META,
			ar_sttl_cd3_META,
			ar_sttl_typ3_META,
			ar_sttl_ac_rsn_cd3_META,
			tax_cd3_META,
			trd_cur_amt_META,
			subttl1_META,
			subttl2_META,
			subttl3_META,
			tax_amt_META,
			tax_subttl1_META,
			tax_subttl2_META,
			tax_subttl3_META,
			base_cur_amt_META,
			base_cur_subttl1_META,
			base_cur_subttl2_META,
			base_cur_subttl3_META,
			base_cur_tax_amt_META,
			base_cur_tax_subttl1_META,
			base_cur_tax_subttl2_META,
			base_cur_tax_subttl3_META,
			trd_rmrks_META,
			slip_sts_typ_META,
			par_rcv_act_no_META,
			par_rcv_act_seq_META,
			ar_slip_prnt_typ_META,
			rcv_auto_appl_flg_META,
			prnt_flg_META,
			bill_dtl_adv_flg_META,
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
	protected MST_RCV_ACT_R(ConstMetaList<? extends MST_RCV_ACT_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_RCV_ACT_R(ConstMetaList<? extends MST_RCV_ACT_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$rcv_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$rcv_act_no,
				"rcv_act_no",
				rcv_act_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$rcv_act_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$rcv_act_seq,
				"rcv_act_seq",
				rcv_act_seq,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$trd_cd,
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
			MST_RCV_ACT_R.$rcv_act_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$rcv_act_rev,
				"rcv_act_rev",
				rcv_act_rev,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$ar_trd_grp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$ar_trd_grp_typ,
				"ar_trd_grp_typ",
				ar_trd_grp_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$trd_ptn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$trd_ptn_typ,
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
			MST_RCV_ACT_R.$rcv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$rcv_no,
				"rcv_no",
				rcv_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$dpt_cd,
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
			MST_RCV_ACT_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$wg_cd,
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
			MST_RCV_ACT_R.$usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$usr_cd,
				"usr_cd",
				usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$rcst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$rcst_cd,
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
			MST_RCV_ACT_R.$bcst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$bcst_cd,
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
			MST_RCV_ACT_R.$bill_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$bill_dpt_cd,
				"bill_dpt_cd",
				bill_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$cred_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$cred_cd,
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
			MST_RCV_ACT_R.$rcv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_RCV_ACT_R.$rcv_dt,
				"rcv_dt",
				rcv_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_RCV_ACT_R.$ac_dt,
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
			MST_RCV_ACT_R.$bill_basis_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_RCV_ACT_R.$bill_basis_dt,
				"bill_basis_dt",
				bill_basis_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$ac_ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_RCV_ACT_R.$ac_ym,
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
			MST_RCV_ACT_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$trd_cur_cd,
				"trd_cur_cd",
				trd_cur_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$base_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$base_cur_cd,
				"base_cur_cd",
				base_cur_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$xrate_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$xrate_cd,
				"xrate_cd",
				xrate_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$xrate,
				"xrate",
				xrate,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$trd_ac_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$trd_ac_rsn_cd,
				"trd_ac_rsn_cd",
				trd_ac_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$ar_sttl_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$ar_sttl_cd1,
				"ar_sttl_cd1",
				ar_sttl_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$ar_sttl_typ1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$ar_sttl_typ1,
				"ar_sttl_typ1",
				ar_sttl_typ1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$ar_sttl_ac_rsn_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$ar_sttl_ac_rsn_cd1,
				"ar_sttl_ac_rsn_cd1",
				ar_sttl_ac_rsn_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$tax_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$tax_cd1,
				"tax_cd1",
				tax_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$bank_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$bank_ac_cd,
				"bank_ac_cd",
				bank_ac_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$xfr_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$xfr_psn,
				"xfr_psn",
				xfr_psn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$note_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$note_mng_no,
				"note_mng_no",
				note_mng_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$note_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$note_no,
				"note_no",
				note_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$bd_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$bd_dpt_cd,
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
			MST_RCV_ACT_R.$debt_cred_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$debt_cred_id_typ,
				"debt_cred_id_typ",
				debt_cred_id_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$debt_cred_id_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$debt_cred_id_cd,
				"debt_cred_id_cd",
				debt_cred_id_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$debt_cred_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$debt_cred_nm,
				"debt_cred_nm",
				debt_cred_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$ar_sttl_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$ar_sttl_cd2,
				"ar_sttl_cd2",
				ar_sttl_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$ar_sttl_typ2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$ar_sttl_typ2,
				"ar_sttl_typ2",
				ar_sttl_typ2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$ar_sttl_ac_rsn_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$ar_sttl_ac_rsn_cd2,
				"ar_sttl_ac_rsn_cd2",
				ar_sttl_ac_rsn_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$tax_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$tax_cd2,
				"tax_cd2",
				tax_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$ar_sttl_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$ar_sttl_cd3,
				"ar_sttl_cd3",
				ar_sttl_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$ar_sttl_typ3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$ar_sttl_typ3,
				"ar_sttl_typ3",
				ar_sttl_typ3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$ar_sttl_ac_rsn_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$ar_sttl_ac_rsn_cd3,
				"ar_sttl_ac_rsn_cd3",
				ar_sttl_ac_rsn_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$tax_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$tax_cd3,
				"tax_cd3",
				tax_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$trd_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$trd_cur_amt,
				"trd_cur_amt",
				trd_cur_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$subttl1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$subttl1,
				"subttl1",
				subttl1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$subttl2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$subttl2,
				"subttl2",
				subttl2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$subttl3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$subttl3,
				"subttl3",
				subttl3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$tax_amt,
				"tax_amt",
				tax_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$tax_subttl1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$tax_subttl1,
				"tax_subttl1",
				tax_subttl1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$tax_subttl2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$tax_subttl2,
				"tax_subttl2",
				tax_subttl2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$tax_subttl3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$tax_subttl3,
				"tax_subttl3",
				tax_subttl3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$base_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$base_cur_amt,
				"base_cur_amt",
				base_cur_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$base_cur_subttl1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$base_cur_subttl1,
				"base_cur_subttl1",
				base_cur_subttl1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$base_cur_subttl2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$base_cur_subttl2,
				"base_cur_subttl2",
				base_cur_subttl2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$base_cur_subttl3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$base_cur_subttl3,
				"base_cur_subttl3",
				base_cur_subttl3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$base_cur_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$base_cur_tax_amt,
				"base_cur_tax_amt",
				base_cur_tax_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$base_cur_tax_subttl1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$base_cur_tax_subttl1,
				"base_cur_tax_subttl1",
				base_cur_tax_subttl1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$base_cur_tax_subttl2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$base_cur_tax_subttl2,
				"base_cur_tax_subttl2",
				base_cur_tax_subttl2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$base_cur_tax_subttl3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$base_cur_tax_subttl3,
				"base_cur_tax_subttl3",
				base_cur_tax_subttl3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$trd_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$trd_rmrks,
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
			MST_RCV_ACT_R.$slip_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$slip_sts_typ,
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
			MST_RCV_ACT_R.$par_rcv_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$par_rcv_act_no,
				"par_rcv_act_no",
				par_rcv_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$par_rcv_act_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$par_rcv_act_seq,
				"par_rcv_act_seq",
				par_rcv_act_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$ar_slip_prnt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$ar_slip_prnt_typ,
				"ar_slip_prnt_typ",
				ar_slip_prnt_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$rcv_auto_appl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_RCV_ACT_R.$rcv_auto_appl_flg,
				"rcv_auto_appl_flg",
				rcv_auto_appl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_RCV_ACT_R.$prnt_flg,
				"prnt_flg",
				prnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$bill_dtl_adv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_RCV_ACT_R.$bill_dtl_adv_flg,
				"bill_dtl_adv_flg",
				bill_dtl_adv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$sub_char1,
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
			MST_RCV_ACT_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$sub_char2,
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
			MST_RCV_ACT_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$sub_char3,
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
			MST_RCV_ACT_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$ins_usr_id,
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
			MST_RCV_ACT_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$ins_usr_nm,
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
			MST_RCV_ACT_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_RCV_ACT_R.$ins_ts,
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
			MST_RCV_ACT_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$ins_func_id,
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
			MST_RCV_ACT_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_R.$upd_cntr,
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
			MST_RCV_ACT_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$upd_usr_id,
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
			MST_RCV_ACT_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$upd_usr_nm,
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
			MST_RCV_ACT_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_RCV_ACT_R.$upd_ts,
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
			MST_RCV_ACT_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$upd_func_id,
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
			MST_RCV_ACT_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_R.$upd_srv_req_no,
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
	public static MST_RCV_ACT_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_RCV_ACT_R create(String alias) {
		MST_RCV_ACT_R row = new MST_RCV_ACT_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_RCV_ACT_R createByName(T proto) {
		MST_RCV_ACT_R row = MST_RCV_ACT_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_RCV_ACT_R clone() {
		return (MST_RCV_ACT_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_RCV_ACT_R createInstance() {
		return (MST_RCV_ACT_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_RCV_ACT_R getValues(String... names) {
		return (MST_RCV_ACT_R) super.getValues(names);
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
	 public MSW_RCV_ACT_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_RCV_ACT_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_RCV_ACT_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_RCV_ACT_KEY_R.TABLE_NAME);
	 }

	/**
	 * 入金実績ＮＯ. Payment received result No..<p>
	 *
	 */
	public String rcv_act_no() {
		return getConstString(offset + 0, $rcv_act_no);
	}

	/**
	 * 入金実績ＮＯ. Payment received result No..<p>
	 *
	 */
	public void rcv_act_no(String value) {
		setConstString(offset + 0, $rcv_act_no, value);
	}

	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public MCNumber rcv_act_seq() {
		return getConstNumber(offset + 1, $rcv_act_seq);
	}

	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public void rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}
	
	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public void rcv_act_seq(int value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}
	
	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public void rcv_act_seq(long value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}
	
	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public void rcv_act_seq(float value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}
	
	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public void rcv_act_seq(double value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}
	
	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 2, $trd_cd);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 2, $trd_cd, value);
	}

	/**
	 * 入金実績改訂番号. Payment received result rev. number.<p>
	 *
	 */
	public MCNumber rcv_act_rev() {
		return getConstNumber(offset + 3, $rcv_act_rev);
	}

	/**
	 * 入金実績改訂番号. Payment received result rev. number.<p>
	 *
	 */
	public void rcv_act_rev(MCNumber value) {
		setConstNumber(offset + 3, $rcv_act_rev, value);
	}
	
	/**
	 * 入金実績改訂番号. Payment received result rev. number.<p>
	 *
	 */
	public void rcv_act_rev(int value) {
		setConstNumber(offset + 3, $rcv_act_rev, value);
	}
	
	/**
	 * 入金実績改訂番号. Payment received result rev. number.<p>
	 *
	 */
	public void rcv_act_rev(long value) {
		setConstNumber(offset + 3, $rcv_act_rev, value);
	}
	
	/**
	 * 入金実績改訂番号. Payment received result rev. number.<p>
	 *
	 */
	public void rcv_act_rev(float value) {
		setConstNumber(offset + 3, $rcv_act_rev, value);
	}
	
	/**
	 * 入金実績改訂番号. Payment received result rev. number.<p>
	 *
	 */
	public void rcv_act_rev(double value) {
		setConstNumber(offset + 3, $rcv_act_rev, value);
	}
	
	/**
	 * 債権取引グループ区分. AR transaction group type.<p>
	 *
	 */
	public String ar_trd_grp_typ() {
		return getConstString(offset + 4, $ar_trd_grp_typ);
	}

	/**
	 * 債権取引グループ区分. AR transaction group type.<p>
	 *
	 */
	public void ar_trd_grp_typ(String value) {
		setConstString(offset + 4, $ar_trd_grp_typ, value);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 5, $trd_ptn_typ);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 5, $trd_ptn_typ, value);
	}

	/**
	 * 入金ＮＯ. Payment received No..<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 6, $rcv_no);
	}

	/**
	 * 入金ＮＯ. Payment received No..<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 6, $rcv_no, value);
	}

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 7, $dpt_cd);
	}

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 7, $dpt_cd, value);
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
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 9, $usr_cd);
	}

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 9, $usr_cd, value);
	}

	/**
	 * 入金先ＣＤ. Payer cd..<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 10, $rcst_cd);
	}

	/**
	 * 入金先ＣＤ. Payer cd..<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 10, $rcst_cd, value);
	}

	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 11, $bcst_cd);
	}

	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 11, $bcst_cd, value);
	}

	/**
	 * 請求部門ＣＤ. Billing dept. cd..<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 12, $bill_dpt_cd);
	}

	/**
	 * 請求部門ＣＤ. Billing dept. cd..<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 12, $bill_dpt_cd, value);
	}

	/**
	 * 与信管理先ＣＤ. Credit managed BP cd..<p>
	 *
	 */
	public String cred_cd() {
		return getConstString(offset + 13, $cred_cd);
	}

	/**
	 * 与信管理先ＣＤ. Credit managed BP cd..<p>
	 *
	 */
	public void cred_cd(String value) {
		setConstString(offset + 13, $cred_cd, value);
	}

	/**
	 * 入金日. Payment received date.<p>
	 *
	 */
	public MCDate rcv_dt() {
		return getConstDate(offset + 14, $rcv_dt);
	}

	/**
	 * 入金日. Payment received date.<p>
	 *
	 */
	public void rcv_dt(MCDate value) {
		setConstDate(offset + 14, $rcv_dt, value);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 15, $ac_dt);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 15, $ac_dt, value);
	}

	/**
	 * 請求起算日. Billing base date.<p>
	 *
	 */
	public MCDate bill_basis_dt() {
		return getConstDate(offset + 16, $bill_basis_dt);
	}

	/**
	 * 請求起算日. Billing base date.<p>
	 *
	 */
	public void bill_basis_dt(MCDate value) {
		setConstDate(offset + 16, $bill_basis_dt, value);
	}

	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 17, $ac_ym);
	}

	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 17, $ac_ym, value);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 18, $trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 18, $trd_cur_cd, value);
	}

	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 19, $base_cur_cd);
	}

	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 19, $base_cur_cd, value);
	}

	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 20, $xrate_cd);
	}

	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 20, $xrate_cd, value);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 21, $xrate);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 21, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 21, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 21, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 21, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 21, $xrate, value);
	}
	
	/**
	 * 取引会計理由ＣＤ. Transaction accounting reason cd..<p>
	 *
	 */
	public String trd_ac_rsn_cd() {
		return getConstString(offset + 22, $trd_ac_rsn_cd);
	}

	/**
	 * 取引会計理由ＣＤ. Transaction accounting reason cd..<p>
	 *
	 */
	public void trd_ac_rsn_cd(String value) {
		setConstString(offset + 22, $trd_ac_rsn_cd, value);
	}

	/**
	 * 債権決済方法ＣＤ１. AR settlement method cd. 1.<p>
	 *
	 */
	public String ar_sttl_cd1() {
		return getConstString(offset + 23, $ar_sttl_cd1);
	}

	/**
	 * 債権決済方法ＣＤ１. AR settlement method cd. 1.<p>
	 *
	 */
	public void ar_sttl_cd1(String value) {
		setConstString(offset + 23, $ar_sttl_cd1, value);
	}

	/**
	 * 債権決済区分１. AR settlement type 1.<p>
	 *
	 */
	public String ar_sttl_typ1() {
		return getConstString(offset + 24, $ar_sttl_typ1);
	}

	/**
	 * 債権決済区分１. AR settlement type 1.<p>
	 *
	 */
	public void ar_sttl_typ1(String value) {
		setConstString(offset + 24, $ar_sttl_typ1, value);
	}

	/**
	 * 債権決済会計理由ＣＤ１. AR settlement accounting reason cd. 1.<p>
	 *
	 */
	public String ar_sttl_ac_rsn_cd1() {
		return getConstString(offset + 25, $ar_sttl_ac_rsn_cd1);
	}

	/**
	 * 債権決済会計理由ＣＤ１. AR settlement accounting reason cd. 1.<p>
	 *
	 */
	public void ar_sttl_ac_rsn_cd1(String value) {
		setConstString(offset + 25, $ar_sttl_ac_rsn_cd1, value);
	}

	/**
	 * 税ＣＤ１. Tax cd. 1.<p>
	 *
	 */
	public String tax_cd1() {
		return getConstString(offset + 26, $tax_cd1);
	}

	/**
	 * 税ＣＤ１. Tax cd. 1.<p>
	 *
	 */
	public void tax_cd1(String value) {
		setConstString(offset + 26, $tax_cd1, value);
	}

	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 27, $bank_ac_cd);
	}

	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 27, $bank_ac_cd, value);
	}

	/**
	 * 振込人名. Payment person name.<p>
	 *
	 */
	public String xfr_psn() {
		return getConstString(offset + 28, $xfr_psn);
	}

	/**
	 * 振込人名. Payment person name.<p>
	 *
	 */
	public void xfr_psn(String value) {
		setConstString(offset + 28, $xfr_psn, value);
	}

	/**
	 * 手形管理ＮＯ. Note management No..<p>
	 *
	 */
	public String note_mng_no() {
		return getConstString(offset + 29, $note_mng_no);
	}

	/**
	 * 手形管理ＮＯ. Note management No..<p>
	 *
	 */
	public void note_mng_no(String value) {
		setConstString(offset + 29, $note_mng_no, value);
	}

	/**
	 * 手形番号. Note number.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 30, $note_no);
	}

	/**
	 * 手形番号. Note number.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 30, $note_no, value);
	}

	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 31, $bd_dpt_cd);
	}

	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 31, $bd_dpt_cd, value);
	}

	/**
	 * 債権債務先識別区分. AR/AP BP identification type.<p>
	 *
	 */
	public String debt_cred_id_typ() {
		return getConstString(offset + 32, $debt_cred_id_typ);
	}

	/**
	 * 債権債務先識別区分. AR/AP BP identification type.<p>
	 *
	 */
	public void debt_cred_id_typ(String value) {
		setConstString(offset + 32, $debt_cred_id_typ, value);
	}

	/**
	 * 債権債務先識別ＣＤ. AR/AP identification cd..<p>
	 *
	 */
	public String debt_cred_id_cd() {
		return getConstString(offset + 33, $debt_cred_id_cd);
	}

	/**
	 * 債権債務先識別ＣＤ. AR/AP identification cd..<p>
	 *
	 */
	public void debt_cred_id_cd(String value) {
		setConstString(offset + 33, $debt_cred_id_cd, value);
	}

	/**
	 * 債権債務先名. AR/AP BP name.<p>
	 *
	 */
	public String debt_cred_nm() {
		return getConstString(offset + 34, $debt_cred_nm);
	}

	/**
	 * 債権債務先名. AR/AP BP name.<p>
	 *
	 */
	public void debt_cred_nm(String value) {
		setConstString(offset + 34, $debt_cred_nm, value);
	}

	/**
	 * 債権決済方法ＣＤ２. AR settlement method cd. 2.<p>
	 *
	 */
	public String ar_sttl_cd2() {
		return getConstString(offset + 35, $ar_sttl_cd2);
	}

	/**
	 * 債権決済方法ＣＤ２. AR settlement method cd. 2.<p>
	 *
	 */
	public void ar_sttl_cd2(String value) {
		setConstString(offset + 35, $ar_sttl_cd2, value);
	}

	/**
	 * 債権決済区分２. AR settlement type 2.<p>
	 *
	 */
	public String ar_sttl_typ2() {
		return getConstString(offset + 36, $ar_sttl_typ2);
	}

	/**
	 * 債権決済区分２. AR settlement type 2.<p>
	 *
	 */
	public void ar_sttl_typ2(String value) {
		setConstString(offset + 36, $ar_sttl_typ2, value);
	}

	/**
	 * 債権決済会計理由ＣＤ２. AR settlement accounting reason cd. 2.<p>
	 *
	 */
	public String ar_sttl_ac_rsn_cd2() {
		return getConstString(offset + 37, $ar_sttl_ac_rsn_cd2);
	}

	/**
	 * 債権決済会計理由ＣＤ２. AR settlement accounting reason cd. 2.<p>
	 *
	 */
	public void ar_sttl_ac_rsn_cd2(String value) {
		setConstString(offset + 37, $ar_sttl_ac_rsn_cd2, value);
	}

	/**
	 * 税ＣＤ２. Tax cd. 2.<p>
	 *
	 */
	public String tax_cd2() {
		return getConstString(offset + 38, $tax_cd2);
	}

	/**
	 * 税ＣＤ２. Tax cd. 2.<p>
	 *
	 */
	public void tax_cd2(String value) {
		setConstString(offset + 38, $tax_cd2, value);
	}

	/**
	 * 債権決済方法ＣＤ３. AR settlement method cd. 3.<p>
	 *
	 */
	public String ar_sttl_cd3() {
		return getConstString(offset + 39, $ar_sttl_cd3);
	}

	/**
	 * 債権決済方法ＣＤ３. AR settlement method cd. 3.<p>
	 *
	 */
	public void ar_sttl_cd3(String value) {
		setConstString(offset + 39, $ar_sttl_cd3, value);
	}

	/**
	 * 債権決済区分３. AR settlement type 3.<p>
	 *
	 */
	public String ar_sttl_typ3() {
		return getConstString(offset + 40, $ar_sttl_typ3);
	}

	/**
	 * 債権決済区分３. AR settlement type 3.<p>
	 *
	 */
	public void ar_sttl_typ3(String value) {
		setConstString(offset + 40, $ar_sttl_typ3, value);
	}

	/**
	 * 債権決済会計理由ＣＤ３. AR settlement accounting reason cd. 3.<p>
	 *
	 */
	public String ar_sttl_ac_rsn_cd3() {
		return getConstString(offset + 41, $ar_sttl_ac_rsn_cd3);
	}

	/**
	 * 債権決済会計理由ＣＤ３. AR settlement accounting reason cd. 3.<p>
	 *
	 */
	public void ar_sttl_ac_rsn_cd3(String value) {
		setConstString(offset + 41, $ar_sttl_ac_rsn_cd3, value);
	}

	/**
	 * 税ＣＤ３. Tax cd. 3.<p>
	 *
	 */
	public String tax_cd3() {
		return getConstString(offset + 42, $tax_cd3);
	}

	/**
	 * 税ＣＤ３. Tax cd. 3.<p>
	 *
	 */
	public void tax_cd3(String value) {
		setConstString(offset + 42, $tax_cd3, value);
	}

	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 43, $trd_cur_amt);
	}

	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 43, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 43, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 43, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 43, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 43, $trd_cur_amt, value);
	}
	
	/**
	 * 金額小計１. Amount subtotal 1.<p>
	 *
	 */
	public MCNumber subttl1() {
		return getConstNumber(offset + 44, $subttl1);
	}

	/**
	 * 金額小計１. Amount subtotal 1.<p>
	 *
	 */
	public void subttl1(MCNumber value) {
		setConstNumber(offset + 44, $subttl1, value);
	}
	
	/**
	 * 金額小計１. Amount subtotal 1.<p>
	 *
	 */
	public void subttl1(int value) {
		setConstNumber(offset + 44, $subttl1, value);
	}
	
	/**
	 * 金額小計１. Amount subtotal 1.<p>
	 *
	 */
	public void subttl1(long value) {
		setConstNumber(offset + 44, $subttl1, value);
	}
	
	/**
	 * 金額小計１. Amount subtotal 1.<p>
	 *
	 */
	public void subttl1(float value) {
		setConstNumber(offset + 44, $subttl1, value);
	}
	
	/**
	 * 金額小計１. Amount subtotal 1.<p>
	 *
	 */
	public void subttl1(double value) {
		setConstNumber(offset + 44, $subttl1, value);
	}
	
	/**
	 * 金額小計２. Amount subtotal 2.<p>
	 *
	 */
	public MCNumber subttl2() {
		return getConstNumber(offset + 45, $subttl2);
	}

	/**
	 * 金額小計２. Amount subtotal 2.<p>
	 *
	 */
	public void subttl2(MCNumber value) {
		setConstNumber(offset + 45, $subttl2, value);
	}
	
	/**
	 * 金額小計２. Amount subtotal 2.<p>
	 *
	 */
	public void subttl2(int value) {
		setConstNumber(offset + 45, $subttl2, value);
	}
	
	/**
	 * 金額小計２. Amount subtotal 2.<p>
	 *
	 */
	public void subttl2(long value) {
		setConstNumber(offset + 45, $subttl2, value);
	}
	
	/**
	 * 金額小計２. Amount subtotal 2.<p>
	 *
	 */
	public void subttl2(float value) {
		setConstNumber(offset + 45, $subttl2, value);
	}
	
	/**
	 * 金額小計２. Amount subtotal 2.<p>
	 *
	 */
	public void subttl2(double value) {
		setConstNumber(offset + 45, $subttl2, value);
	}
	
	/**
	 * 金額小計３. Amount subtotal 3.<p>
	 *
	 */
	public MCNumber subttl3() {
		return getConstNumber(offset + 46, $subttl3);
	}

	/**
	 * 金額小計３. Amount subtotal 3.<p>
	 *
	 */
	public void subttl3(MCNumber value) {
		setConstNumber(offset + 46, $subttl3, value);
	}
	
	/**
	 * 金額小計３. Amount subtotal 3.<p>
	 *
	 */
	public void subttl3(int value) {
		setConstNumber(offset + 46, $subttl3, value);
	}
	
	/**
	 * 金額小計３. Amount subtotal 3.<p>
	 *
	 */
	public void subttl3(long value) {
		setConstNumber(offset + 46, $subttl3, value);
	}
	
	/**
	 * 金額小計３. Amount subtotal 3.<p>
	 *
	 */
	public void subttl3(float value) {
		setConstNumber(offset + 46, $subttl3, value);
	}
	
	/**
	 * 金額小計３. Amount subtotal 3.<p>
	 *
	 */
	public void subttl3(double value) {
		setConstNumber(offset + 46, $subttl3, value);
	}
	
	/**
	 * 内税額. Tax inclusive amount.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 47, $tax_amt);
	}

	/**
	 * 内税額. Tax inclusive amount.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 47, $tax_amt, value);
	}
	
	/**
	 * 内税額. Tax inclusive amount.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 47, $tax_amt, value);
	}
	
	/**
	 * 内税額. Tax inclusive amount.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 47, $tax_amt, value);
	}
	
	/**
	 * 内税額. Tax inclusive amount.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 47, $tax_amt, value);
	}
	
	/**
	 * 内税額. Tax inclusive amount.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 47, $tax_amt, value);
	}
	
	/**
	 * 内税小計１. Tax inclusive subtotal 1.<p>
	 *
	 */
	public MCNumber tax_subttl1() {
		return getConstNumber(offset + 48, $tax_subttl1);
	}

	/**
	 * 内税小計１. Tax inclusive subtotal 1.<p>
	 *
	 */
	public void tax_subttl1(MCNumber value) {
		setConstNumber(offset + 48, $tax_subttl1, value);
	}
	
	/**
	 * 内税小計１. Tax inclusive subtotal 1.<p>
	 *
	 */
	public void tax_subttl1(int value) {
		setConstNumber(offset + 48, $tax_subttl1, value);
	}
	
	/**
	 * 内税小計１. Tax inclusive subtotal 1.<p>
	 *
	 */
	public void tax_subttl1(long value) {
		setConstNumber(offset + 48, $tax_subttl1, value);
	}
	
	/**
	 * 内税小計１. Tax inclusive subtotal 1.<p>
	 *
	 */
	public void tax_subttl1(float value) {
		setConstNumber(offset + 48, $tax_subttl1, value);
	}
	
	/**
	 * 内税小計１. Tax inclusive subtotal 1.<p>
	 *
	 */
	public void tax_subttl1(double value) {
		setConstNumber(offset + 48, $tax_subttl1, value);
	}
	
	/**
	 * 内税小計２. Tax inclusive subtotal 2.<p>
	 *
	 */
	public MCNumber tax_subttl2() {
		return getConstNumber(offset + 49, $tax_subttl2);
	}

	/**
	 * 内税小計２. Tax inclusive subtotal 2.<p>
	 *
	 */
	public void tax_subttl2(MCNumber value) {
		setConstNumber(offset + 49, $tax_subttl2, value);
	}
	
	/**
	 * 内税小計２. Tax inclusive subtotal 2.<p>
	 *
	 */
	public void tax_subttl2(int value) {
		setConstNumber(offset + 49, $tax_subttl2, value);
	}
	
	/**
	 * 内税小計２. Tax inclusive subtotal 2.<p>
	 *
	 */
	public void tax_subttl2(long value) {
		setConstNumber(offset + 49, $tax_subttl2, value);
	}
	
	/**
	 * 内税小計２. Tax inclusive subtotal 2.<p>
	 *
	 */
	public void tax_subttl2(float value) {
		setConstNumber(offset + 49, $tax_subttl2, value);
	}
	
	/**
	 * 内税小計２. Tax inclusive subtotal 2.<p>
	 *
	 */
	public void tax_subttl2(double value) {
		setConstNumber(offset + 49, $tax_subttl2, value);
	}
	
	/**
	 * 内税小計３. Tax inclusive subtotal 3.<p>
	 *
	 */
	public MCNumber tax_subttl3() {
		return getConstNumber(offset + 50, $tax_subttl3);
	}

	/**
	 * 内税小計３. Tax inclusive subtotal 3.<p>
	 *
	 */
	public void tax_subttl3(MCNumber value) {
		setConstNumber(offset + 50, $tax_subttl3, value);
	}
	
	/**
	 * 内税小計３. Tax inclusive subtotal 3.<p>
	 *
	 */
	public void tax_subttl3(int value) {
		setConstNumber(offset + 50, $tax_subttl3, value);
	}
	
	/**
	 * 内税小計３. Tax inclusive subtotal 3.<p>
	 *
	 */
	public void tax_subttl3(long value) {
		setConstNumber(offset + 50, $tax_subttl3, value);
	}
	
	/**
	 * 内税小計３. Tax inclusive subtotal 3.<p>
	 *
	 */
	public void tax_subttl3(float value) {
		setConstNumber(offset + 50, $tax_subttl3, value);
	}
	
	/**
	 * 内税小計３. Tax inclusive subtotal 3.<p>
	 *
	 */
	public void tax_subttl3(double value) {
		setConstNumber(offset + 50, $tax_subttl3, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 51, $base_cur_amt);
	}

	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 51, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 51, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 51, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 51, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 51, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨小計１. Subtotal 1 (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_subttl1() {
		return getConstNumber(offset + 52, $base_cur_subttl1);
	}

	/**
	 * 基準通貨小計１. Subtotal 1 (Base currency).<p>
	 *
	 */
	public void base_cur_subttl1(MCNumber value) {
		setConstNumber(offset + 52, $base_cur_subttl1, value);
	}
	
	/**
	 * 基準通貨小計１. Subtotal 1 (Base currency).<p>
	 *
	 */
	public void base_cur_subttl1(int value) {
		setConstNumber(offset + 52, $base_cur_subttl1, value);
	}
	
	/**
	 * 基準通貨小計１. Subtotal 1 (Base currency).<p>
	 *
	 */
	public void base_cur_subttl1(long value) {
		setConstNumber(offset + 52, $base_cur_subttl1, value);
	}
	
	/**
	 * 基準通貨小計１. Subtotal 1 (Base currency).<p>
	 *
	 */
	public void base_cur_subttl1(float value) {
		setConstNumber(offset + 52, $base_cur_subttl1, value);
	}
	
	/**
	 * 基準通貨小計１. Subtotal 1 (Base currency).<p>
	 *
	 */
	public void base_cur_subttl1(double value) {
		setConstNumber(offset + 52, $base_cur_subttl1, value);
	}
	
	/**
	 * 基準通貨小計２. Subtotal 2 (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_subttl2() {
		return getConstNumber(offset + 53, $base_cur_subttl2);
	}

	/**
	 * 基準通貨小計２. Subtotal 2 (Base currency).<p>
	 *
	 */
	public void base_cur_subttl2(MCNumber value) {
		setConstNumber(offset + 53, $base_cur_subttl2, value);
	}
	
	/**
	 * 基準通貨小計２. Subtotal 2 (Base currency).<p>
	 *
	 */
	public void base_cur_subttl2(int value) {
		setConstNumber(offset + 53, $base_cur_subttl2, value);
	}
	
	/**
	 * 基準通貨小計２. Subtotal 2 (Base currency).<p>
	 *
	 */
	public void base_cur_subttl2(long value) {
		setConstNumber(offset + 53, $base_cur_subttl2, value);
	}
	
	/**
	 * 基準通貨小計２. Subtotal 2 (Base currency).<p>
	 *
	 */
	public void base_cur_subttl2(float value) {
		setConstNumber(offset + 53, $base_cur_subttl2, value);
	}
	
	/**
	 * 基準通貨小計２. Subtotal 2 (Base currency).<p>
	 *
	 */
	public void base_cur_subttl2(double value) {
		setConstNumber(offset + 53, $base_cur_subttl2, value);
	}
	
	/**
	 * 基準通貨小計３. Subtotal 3 (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_subttl3() {
		return getConstNumber(offset + 54, $base_cur_subttl3);
	}

	/**
	 * 基準通貨小計３. Subtotal 3 (Base currency).<p>
	 *
	 */
	public void base_cur_subttl3(MCNumber value) {
		setConstNumber(offset + 54, $base_cur_subttl3, value);
	}
	
	/**
	 * 基準通貨小計３. Subtotal 3 (Base currency).<p>
	 *
	 */
	public void base_cur_subttl3(int value) {
		setConstNumber(offset + 54, $base_cur_subttl3, value);
	}
	
	/**
	 * 基準通貨小計３. Subtotal 3 (Base currency).<p>
	 *
	 */
	public void base_cur_subttl3(long value) {
		setConstNumber(offset + 54, $base_cur_subttl3, value);
	}
	
	/**
	 * 基準通貨小計３. Subtotal 3 (Base currency).<p>
	 *
	 */
	public void base_cur_subttl3(float value) {
		setConstNumber(offset + 54, $base_cur_subttl3, value);
	}
	
	/**
	 * 基準通貨小計３. Subtotal 3 (Base currency).<p>
	 *
	 */
	public void base_cur_subttl3(double value) {
		setConstNumber(offset + 54, $base_cur_subttl3, value);
	}
	
	/**
	 * 基準通貨内税額. Tax inclusive amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 55, $base_cur_tax_amt);
	}

	/**
	 * 基準通貨内税額. Tax inclusive amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 55, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨内税額. Tax inclusive amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 55, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨内税額. Tax inclusive amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 55, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨内税額. Tax inclusive amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 55, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨内税額. Tax inclusive amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 55, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨内税小計１. Tax inclusive subtotal 1 (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_tax_subttl1() {
		return getConstNumber(offset + 56, $base_cur_tax_subttl1);
	}

	/**
	 * 基準通貨内税小計１. Tax inclusive subtotal 1 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_subttl1(MCNumber value) {
		setConstNumber(offset + 56, $base_cur_tax_subttl1, value);
	}
	
	/**
	 * 基準通貨内税小計１. Tax inclusive subtotal 1 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_subttl1(int value) {
		setConstNumber(offset + 56, $base_cur_tax_subttl1, value);
	}
	
	/**
	 * 基準通貨内税小計１. Tax inclusive subtotal 1 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_subttl1(long value) {
		setConstNumber(offset + 56, $base_cur_tax_subttl1, value);
	}
	
	/**
	 * 基準通貨内税小計１. Tax inclusive subtotal 1 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_subttl1(float value) {
		setConstNumber(offset + 56, $base_cur_tax_subttl1, value);
	}
	
	/**
	 * 基準通貨内税小計１. Tax inclusive subtotal 1 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_subttl1(double value) {
		setConstNumber(offset + 56, $base_cur_tax_subttl1, value);
	}
	
	/**
	 * 基準通貨内税小計２. Tax inclusive subtotal 2 (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_tax_subttl2() {
		return getConstNumber(offset + 57, $base_cur_tax_subttl2);
	}

	/**
	 * 基準通貨内税小計２. Tax inclusive subtotal 2 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_subttl2(MCNumber value) {
		setConstNumber(offset + 57, $base_cur_tax_subttl2, value);
	}
	
	/**
	 * 基準通貨内税小計２. Tax inclusive subtotal 2 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_subttl2(int value) {
		setConstNumber(offset + 57, $base_cur_tax_subttl2, value);
	}
	
	/**
	 * 基準通貨内税小計２. Tax inclusive subtotal 2 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_subttl2(long value) {
		setConstNumber(offset + 57, $base_cur_tax_subttl2, value);
	}
	
	/**
	 * 基準通貨内税小計２. Tax inclusive subtotal 2 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_subttl2(float value) {
		setConstNumber(offset + 57, $base_cur_tax_subttl2, value);
	}
	
	/**
	 * 基準通貨内税小計２. Tax inclusive subtotal 2 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_subttl2(double value) {
		setConstNumber(offset + 57, $base_cur_tax_subttl2, value);
	}
	
	/**
	 * 基準通貨内税小計３. Tax inclusive subtotal 3 (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_tax_subttl3() {
		return getConstNumber(offset + 58, $base_cur_tax_subttl3);
	}

	/**
	 * 基準通貨内税小計３. Tax inclusive subtotal 3 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_subttl3(MCNumber value) {
		setConstNumber(offset + 58, $base_cur_tax_subttl3, value);
	}
	
	/**
	 * 基準通貨内税小計３. Tax inclusive subtotal 3 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_subttl3(int value) {
		setConstNumber(offset + 58, $base_cur_tax_subttl3, value);
	}
	
	/**
	 * 基準通貨内税小計３. Tax inclusive subtotal 3 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_subttl3(long value) {
		setConstNumber(offset + 58, $base_cur_tax_subttl3, value);
	}
	
	/**
	 * 基準通貨内税小計３. Tax inclusive subtotal 3 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_subttl3(float value) {
		setConstNumber(offset + 58, $base_cur_tax_subttl3, value);
	}
	
	/**
	 * 基準通貨内税小計３. Tax inclusive subtotal 3 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_subttl3(double value) {
		setConstNumber(offset + 58, $base_cur_tax_subttl3, value);
	}
	
	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 59, $trd_rmrks);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 59, $trd_rmrks, value);
	}

	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 60, $slip_sts_typ);
	}

	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 60, $slip_sts_typ, value);
	}

	/**
	 * 親入金実績ＮＯ. Parent incoming payment result No..<p>
	 *
	 */
	public String par_rcv_act_no() {
		return getConstString(offset + 61, $par_rcv_act_no);
	}

	/**
	 * 親入金実績ＮＯ. Parent incoming payment result No..<p>
	 *
	 */
	public void par_rcv_act_no(String value) {
		setConstString(offset + 61, $par_rcv_act_no, value);
	}

	/**
	 * 親入金実績連番. Parent incoming payment result sequence number.<p>
	 *
	 */
	public MCNumber par_rcv_act_seq() {
		return getConstNumber(offset + 62, $par_rcv_act_seq);
	}

	/**
	 * 親入金実績連番. Parent incoming payment result sequence number.<p>
	 *
	 */
	public void par_rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 62, $par_rcv_act_seq, value);
	}
	
	/**
	 * 親入金実績連番. Parent incoming payment result sequence number.<p>
	 *
	 */
	public void par_rcv_act_seq(int value) {
		setConstNumber(offset + 62, $par_rcv_act_seq, value);
	}
	
	/**
	 * 親入金実績連番. Parent incoming payment result sequence number.<p>
	 *
	 */
	public void par_rcv_act_seq(long value) {
		setConstNumber(offset + 62, $par_rcv_act_seq, value);
	}
	
	/**
	 * 親入金実績連番. Parent incoming payment result sequence number.<p>
	 *
	 */
	public void par_rcv_act_seq(float value) {
		setConstNumber(offset + 62, $par_rcv_act_seq, value);
	}
	
	/**
	 * 親入金実績連番. Parent incoming payment result sequence number.<p>
	 *
	 */
	public void par_rcv_act_seq(double value) {
		setConstNumber(offset + 62, $par_rcv_act_seq, value);
	}
	
	/**
	 * 債権伝票帳票区分. AR slip report type.<p>
	 *
	 */
	public String ar_slip_prnt_typ() {
		return getConstString(offset + 63, $ar_slip_prnt_typ);
	}

	/**
	 * 債権伝票帳票区分. AR slip report type.<p>
	 *
	 */
	public void ar_slip_prnt_typ(String value) {
		setConstString(offset + 63, $ar_slip_prnt_typ, value);
	}

	/**
	 * 入金自動消込ＦＬＧ. Auto-reconciliation flg..<p>
	 *
	 */
	public boolean rcv_auto_appl_flg() {
		return getConstBoolean(offset + 64, $rcv_auto_appl_flg);
	}

	/**
	 * 入金自動消込ＦＬＧ. Auto-reconciliation flg..<p>
	 *
	 */
	public void rcv_auto_appl_flg(boolean value) {
		setConstBoolean(offset + 64, $rcv_auto_appl_flg, value);
	}

	/**
	 * 発行済ＦＬＧ. Issued flg..<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 65, $prnt_flg);
	}

	/**
	 * 発行済ＦＬＧ. Issued flg..<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 65, $prnt_flg, value);
	}

	/**
	 * 請求書前受金表示ＦＬＧ. Display advance received on invoice flg..<p>
	 *
	 */
	public boolean bill_dtl_adv_flg() {
		return getConstBoolean(offset + 66, $bill_dtl_adv_flg);
	}

	/**
	 * 請求書前受金表示ＦＬＧ. Display advance received on invoice flg..<p>
	 *
	 */
	public void bill_dtl_adv_flg(boolean value) {
		setConstBoolean(offset + 66, $bill_dtl_adv_flg, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 67, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 67, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 68, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 68, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 69, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 69, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 70, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 70, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 71, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 71, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 72, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 72, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 73, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 73, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 74, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 74, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 74, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 74, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 74, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 74, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 75, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 75, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 76, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 76, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 77, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 77, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 78, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 78, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 79, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 79, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($trd_ac_rsn_cd.equalsIgnoreCase(name)) {
			return trd_ac_rsn_cd();
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			return ar_sttl_typ1();
		}
		if ($ar_sttl_ac_rsn_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_ac_rsn_cd1();
		}
		if ($tax_cd1.equalsIgnoreCase(name)) {
			return tax_cd1();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($note_mng_no.equalsIgnoreCase(name)) {
			return note_mng_no();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			return debt_cred_id_typ();
		}
		if ($debt_cred_id_cd.equalsIgnoreCase(name)) {
			return debt_cred_id_cd();
		}
		if ($debt_cred_nm.equalsIgnoreCase(name)) {
			return debt_cred_nm();
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			return ar_sttl_cd2();
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			return ar_sttl_typ2();
		}
		if ($ar_sttl_ac_rsn_cd2.equalsIgnoreCase(name)) {
			return ar_sttl_ac_rsn_cd2();
		}
		if ($tax_cd2.equalsIgnoreCase(name)) {
			return tax_cd2();
		}
		if ($ar_sttl_cd3.equalsIgnoreCase(name)) {
			return ar_sttl_cd3();
		}
		if ($ar_sttl_typ3.equalsIgnoreCase(name)) {
			return ar_sttl_typ3();
		}
		if ($ar_sttl_ac_rsn_cd3.equalsIgnoreCase(name)) {
			return ar_sttl_ac_rsn_cd3();
		}
		if ($tax_cd3.equalsIgnoreCase(name)) {
			return tax_cd3();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($par_rcv_act_no.equalsIgnoreCase(name)) {
			return par_rcv_act_no();
		}
		if ($ar_slip_prnt_typ.equalsIgnoreCase(name)) {
			return ar_slip_prnt_typ();
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
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			return rcv_act_rev();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			return subttl1();
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			return subttl2();
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			return subttl3();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			return tax_subttl1();
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			return tax_subttl2();
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			return tax_subttl3();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			return base_cur_subttl1();
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			return base_cur_subttl2();
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			return base_cur_subttl3();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			return base_cur_tax_subttl1();
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			return base_cur_tax_subttl2();
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			return base_cur_tax_subttl3();
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			return par_rcv_act_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
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
		if ($rcv_auto_appl_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_adv_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($trd_ac_rsn_cd.equalsIgnoreCase(name)) {
			return trd_ac_rsn_cd();
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			return ar_sttl_typ1();
		}
		if ($ar_sttl_ac_rsn_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_ac_rsn_cd1();
		}
		if ($tax_cd1.equalsIgnoreCase(name)) {
			return tax_cd1();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($note_mng_no.equalsIgnoreCase(name)) {
			return note_mng_no();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			return debt_cred_id_typ();
		}
		if ($debt_cred_id_cd.equalsIgnoreCase(name)) {
			return debt_cred_id_cd();
		}
		if ($debt_cred_nm.equalsIgnoreCase(name)) {
			return debt_cred_nm();
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			return ar_sttl_cd2();
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			return ar_sttl_typ2();
		}
		if ($ar_sttl_ac_rsn_cd2.equalsIgnoreCase(name)) {
			return ar_sttl_ac_rsn_cd2();
		}
		if ($tax_cd2.equalsIgnoreCase(name)) {
			return tax_cd2();
		}
		if ($ar_sttl_cd3.equalsIgnoreCase(name)) {
			return ar_sttl_cd3();
		}
		if ($ar_sttl_typ3.equalsIgnoreCase(name)) {
			return ar_sttl_typ3();
		}
		if ($ar_sttl_ac_rsn_cd3.equalsIgnoreCase(name)) {
			return ar_sttl_ac_rsn_cd3();
		}
		if ($tax_cd3.equalsIgnoreCase(name)) {
			return tax_cd3();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($par_rcv_act_no.equalsIgnoreCase(name)) {
			return par_rcv_act_no();
		}
		if ($ar_slip_prnt_typ.equalsIgnoreCase(name)) {
			return ar_slip_prnt_typ();
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
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			return rcv_act_rev();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			return subttl1();
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			return subttl2();
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			return subttl3();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			return tax_subttl1();
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			return tax_subttl2();
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			return tax_subttl3();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			return base_cur_subttl1();
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			return base_cur_subttl2();
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			return base_cur_subttl3();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			return base_cur_tax_subttl1();
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			return base_cur_tax_subttl2();
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			return base_cur_tax_subttl3();
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			return par_rcv_act_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
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
		if ($rcv_auto_appl_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_adv_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
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
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
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
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($trd_ac_rsn_cd.equalsIgnoreCase(name)) {
			trd_ac_rsn_cd(value);
			return;
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			ar_sttl_typ1(value);
			return;
		}
		if ($ar_sttl_ac_rsn_cd1.equalsIgnoreCase(name)) {
			ar_sttl_ac_rsn_cd1(value);
			return;
		}
		if ($tax_cd1.equalsIgnoreCase(name)) {
			tax_cd1(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($note_mng_no.equalsIgnoreCase(name)) {
			note_mng_no(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			debt_cred_id_typ(value);
			return;
		}
		if ($debt_cred_id_cd.equalsIgnoreCase(name)) {
			debt_cred_id_cd(value);
			return;
		}
		if ($debt_cred_nm.equalsIgnoreCase(name)) {
			debt_cred_nm(value);
			return;
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			ar_sttl_cd2(value);
			return;
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			ar_sttl_typ2(value);
			return;
		}
		if ($ar_sttl_ac_rsn_cd2.equalsIgnoreCase(name)) {
			ar_sttl_ac_rsn_cd2(value);
			return;
		}
		if ($tax_cd2.equalsIgnoreCase(name)) {
			tax_cd2(value);
			return;
		}
		if ($ar_sttl_cd3.equalsIgnoreCase(name)) {
			ar_sttl_cd3(value);
			return;
		}
		if ($ar_sttl_typ3.equalsIgnoreCase(name)) {
			ar_sttl_typ3(value);
			return;
		}
		if ($ar_sttl_ac_rsn_cd3.equalsIgnoreCase(name)) {
			ar_sttl_ac_rsn_cd3(value);
			return;
		}
		if ($tax_cd3.equalsIgnoreCase(name)) {
			tax_cd3(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($par_rcv_act_no.equalsIgnoreCase(name)) {
			par_rcv_act_no(value);
			return;
		}
		if ($ar_slip_prnt_typ.equalsIgnoreCase(name)) {
			ar_slip_prnt_typ(value);
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
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			base_cur_subttl1(value);
			return;
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			base_cur_subttl2(value);
			return;
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			base_cur_subttl3(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			base_cur_tax_subttl2(value);
			return;
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			base_cur_tax_subttl3(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			base_cur_subttl1(value);
			return;
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			base_cur_subttl2(value);
			return;
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			base_cur_subttl3(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			base_cur_tax_subttl2(value);
			return;
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			base_cur_tax_subttl3(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			base_cur_subttl1(value);
			return;
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			base_cur_subttl2(value);
			return;
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			base_cur_subttl3(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			base_cur_tax_subttl2(value);
			return;
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			base_cur_tax_subttl3(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			base_cur_subttl1(value);
			return;
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			base_cur_subttl2(value);
			return;
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			base_cur_subttl3(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			base_cur_tax_subttl2(value);
			return;
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			base_cur_tax_subttl3(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			base_cur_subttl1(value);
			return;
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			base_cur_subttl2(value);
			return;
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			base_cur_subttl3(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			base_cur_tax_subttl2(value);
			return;
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			base_cur_tax_subttl3(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
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
		if ($rcv_auto_appl_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			bill_dtl_adv_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
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
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
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
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($trd_ac_rsn_cd.equalsIgnoreCase(name)) {
			trd_ac_rsn_cd(value);
			return;
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			ar_sttl_typ1(value);
			return;
		}
		if ($ar_sttl_ac_rsn_cd1.equalsIgnoreCase(name)) {
			ar_sttl_ac_rsn_cd1(value);
			return;
		}
		if ($tax_cd1.equalsIgnoreCase(name)) {
			tax_cd1(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($note_mng_no.equalsIgnoreCase(name)) {
			note_mng_no(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			debt_cred_id_typ(value);
			return;
		}
		if ($debt_cred_id_cd.equalsIgnoreCase(name)) {
			debt_cred_id_cd(value);
			return;
		}
		if ($debt_cred_nm.equalsIgnoreCase(name)) {
			debt_cred_nm(value);
			return;
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			ar_sttl_cd2(value);
			return;
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			ar_sttl_typ2(value);
			return;
		}
		if ($ar_sttl_ac_rsn_cd2.equalsIgnoreCase(name)) {
			ar_sttl_ac_rsn_cd2(value);
			return;
		}
		if ($tax_cd2.equalsIgnoreCase(name)) {
			tax_cd2(value);
			return;
		}
		if ($ar_sttl_cd3.equalsIgnoreCase(name)) {
			ar_sttl_cd3(value);
			return;
		}
		if ($ar_sttl_typ3.equalsIgnoreCase(name)) {
			ar_sttl_typ3(value);
			return;
		}
		if ($ar_sttl_ac_rsn_cd3.equalsIgnoreCase(name)) {
			ar_sttl_ac_rsn_cd3(value);
			return;
		}
		if ($tax_cd3.equalsIgnoreCase(name)) {
			tax_cd3(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($par_rcv_act_no.equalsIgnoreCase(name)) {
			par_rcv_act_no(value);
			return;
		}
		if ($ar_slip_prnt_typ.equalsIgnoreCase(name)) {
			ar_slip_prnt_typ(value);
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
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			base_cur_subttl1(value);
			return;
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			base_cur_subttl2(value);
			return;
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			base_cur_subttl3(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			base_cur_tax_subttl2(value);
			return;
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			base_cur_tax_subttl3(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			base_cur_subttl1(value);
			return;
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			base_cur_subttl2(value);
			return;
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			base_cur_subttl3(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			base_cur_tax_subttl2(value);
			return;
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			base_cur_tax_subttl3(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			base_cur_subttl1(value);
			return;
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			base_cur_subttl2(value);
			return;
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			base_cur_subttl3(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			base_cur_tax_subttl2(value);
			return;
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			base_cur_tax_subttl3(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			base_cur_subttl1(value);
			return;
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			base_cur_subttl2(value);
			return;
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			base_cur_subttl3(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			base_cur_tax_subttl2(value);
			return;
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			base_cur_tax_subttl3(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			base_cur_subttl1(value);
			return;
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			base_cur_subttl2(value);
			return;
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			base_cur_subttl3(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			base_cur_tax_subttl2(value);
			return;
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			base_cur_tax_subttl3(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
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
		if ($rcv_auto_appl_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			bill_dtl_adv_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
