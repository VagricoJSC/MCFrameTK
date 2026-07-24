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
 * "前渡金実績 // Advance payment result"DBコンテナRowクラスです。<p>
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
 *  	<td>adv_pay_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>前渡金実績ＮＯ</td>
 *  	<td>Advance payment result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>adv_pay_act_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>前渡金実績連番</td>
 *  	<td>Advance payment result sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>adv_pay_act_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>前渡金実績改訂番号</td>
 *  	<td>Advance payment result revision number</td>
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
 *  	<td>psppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払先ＣＤ</td>
 *  	<td>Payee cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bsppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払予定管理先ＣＤ</td>
 *  	<td>Scheduled payee cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bsppl_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払予定管理先担当部門ＣＤ</td>
 *  	<td>Cd. of dept. in charge of scheduled payee</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bd_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>負担部門ＣＤ</td>
 *  	<td>Charged dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払部門ＣＤ</td>
 *  	<td>Payment dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払担当者ＣＤ</td>
 *  	<td>Payment PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_act_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払実績日</td>
 *  	<td>Actual payment date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計上日</td>
 *  	<td>Recording date</td>
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
 *  	<td>Y</td>
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
 *  	<td>ap_sttl_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債務決済方法ＣＤ</td>
 *  	<td>AP settlement method cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ap_sttl_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債務決済区分</td>
 *  	<td>AP settlement type</td>
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
 *  	<td>com_paid_ap_sttl_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手数料債務決済方法ＣＤ</td>
 *  	<td>Fee AP settlement method cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>com_paid_ap_sttl_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手数料債務決済区分</td>
 *  	<td>Fee AP settlement type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>com_paid_ac_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手数料会計理由ＣＤ</td>
 *  	<td>Fee accounting reason cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_com_paid_tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手数料税ＣＤ</td>
 *  	<td>Fee tax cd.</td>
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
 *  	<td>pay_bank_ac_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払先口座ＣＤ</td>
 *  	<td>Payee account cd.</td>
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
 *  	<td>trd_cur_com_paid</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨手数料金額</td>
 *  	<td>Fee amount (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_com_paid_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨手数料税額</td>
 *  	<td>Fee tax amount (Transaction currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_exc_com_paid</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨手数料税抜額</td>
 *  	<td>Fee amount without tax (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_setoff_tgt_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨相殺対象額</td>
 *  	<td>Offset target amount (Transaction currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_setoff_schd_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨相殺予定額</td>
 *  	<td>Offset schedule amount (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_setoff_act_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨相殺実績額</td>
 *  	<td>Offset result amount (Transaction currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_not_proc_bal</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨未処理残高</td>
 *  	<td>Unreconciled balance (Transaction currency)</td>
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
 *  	<td>base_cur_com_paid</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨手数料金額</td>
 *  	<td>Fee (Base currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_com_paid_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準通貨手数料税額</td>
 *  	<td>Fee tax amount (Base currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_exc_com_paid</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準通貨手数料税抜額</td>
 *  	<td>Fee without tax (Base currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_setoff_tgt_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨相殺対象額</td>
 *  	<td>Offset amount (Base currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_chk_mng_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払照合管理ＮＯ</td>
 *  	<td>Payment collation management No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_ntc_adv_pay_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払通知書前渡金表示ＦＬＧ</td>
 *  	<td>Display advance payment on payment notice flg.</td>
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
 *  	<td>intr_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内部備考</td>
 *  	<td>Internal remarks</td>
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
public class MST_ADV_PAY_ACT_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_ADV_PAY_ACT";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 前渡金実績ＮＯ. Advance payment result No..<p>
	 *
	 */
	public static final String $adv_pay_act_no = "adv_pay_act_no";
	private static final MCPermColumnInfo _adv_pay_act_no = createColumnInfo("adv_pay_act_no");
	public final MCStringPermColumn adv_pay_act_no = createStringColumn(_adv_pay_act_no);
	
	/**
	 * 前渡金実績連番. Advance payment result sequence number.<p>
	 *
	 */
	public static final String $adv_pay_act_seq = "adv_pay_act_seq";
	private static final MCPermColumnInfo _adv_pay_act_seq = createColumnInfo("adv_pay_act_seq");
	public final MCNumberPermColumn adv_pay_act_seq = createNumberColumn(_adv_pay_act_seq);
	
	/**
	 * 前渡金実績改訂番号. Advance payment result revision number.<p>
	 *
	 */
	public static final String $adv_pay_act_rev = "adv_pay_act_rev";
	private static final MCPermColumnInfo _adv_pay_act_rev = createColumnInfo("adv_pay_act_rev");
	public final MCNumberPermColumn adv_pay_act_rev = createNumberColumn(_adv_pay_act_rev);
	
	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	private static final MCPermColumnInfo _slip_sts_typ = createColumnInfo("slip_sts_typ");
	public final MCStringPermColumn slip_sts_typ = createStringColumn(_slip_sts_typ);
	
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
	 * 支払予定管理先担当部門ＣＤ. Cd. of dept. in charge of scheduled payee.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd = "bsppl_dpt_cd";
	private static final MCPermColumnInfo _bsppl_dpt_cd = createColumnInfo("bsppl_dpt_cd");
	public final MCStringPermColumn bsppl_dpt_cd = createStringColumn(_bsppl_dpt_cd);
	
	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	private static final MCPermColumnInfo _bd_dpt_cd = createColumnInfo("bd_dpt_cd");
	public final MCStringPermColumn bd_dpt_cd = createStringColumn(_bd_dpt_cd);
	
	/**
	 * 支払部門ＣＤ. Payment dept. cd..<p>
	 *
	 */
	public static final String $pay_dpt_cd = "pay_dpt_cd";
	private static final MCPermColumnInfo _pay_dpt_cd = createColumnInfo("pay_dpt_cd");
	public final MCStringPermColumn pay_dpt_cd = createStringColumn(_pay_dpt_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 支払担当者ＣＤ. Payment PIC cd..<p>
	 *
	 */
	public static final String $pay_usr_cd = "pay_usr_cd";
	private static final MCPermColumnInfo _pay_usr_cd = createColumnInfo("pay_usr_cd");
	public final MCStringPermColumn pay_usr_cd = createStringColumn(_pay_usr_cd);
	
	/**
	 * 支払実績日. Actual payment date.<p>
	 *
	 */
	public static final String $pay_act_dt = "pay_act_dt";
	private static final MCPermColumnInfo _pay_act_dt = createColumnInfo("pay_act_dt");
	public final MCDatePermColumn pay_act_dt = createDateColumn(_pay_act_dt);
	
	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	private static final MCPermColumnInfo _ac_dt = createColumnInfo("ac_dt");
	public final MCDatePermColumn ac_dt = createDateColumn(_ac_dt);
	
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
	 * 債務決済方法ＣＤ. AP settlement method cd..<p>
	 *
	 */
	public static final String $ap_sttl_cd = "ap_sttl_cd";
	private static final MCPermColumnInfo _ap_sttl_cd = createColumnInfo("ap_sttl_cd");
	public final MCStringPermColumn ap_sttl_cd = createStringColumn(_ap_sttl_cd);
	
	/**
	 * 債務決済区分. AP settlement type.<p>
	 *
	 */
	public static final String $ap_sttl_typ = "ap_sttl_typ";
	private static final MCPermColumnInfo _ap_sttl_typ = createColumnInfo("ap_sttl_typ");
	public final MCStringPermColumn ap_sttl_typ = createStringColumn(_ap_sttl_typ);
	
	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	private static final MCPermColumnInfo _ac_rsn_cd = createColumnInfo("ac_rsn_cd");
	public final MCStringPermColumn ac_rsn_cd = createStringColumn(_ac_rsn_cd);
	
	/**
	 * 手数料債務決済方法ＣＤ. Fee AP settlement method cd..<p>
	 *
	 */
	public static final String $com_paid_ap_sttl_cd = "com_paid_ap_sttl_cd";
	private static final MCPermColumnInfo _com_paid_ap_sttl_cd = createColumnInfo("com_paid_ap_sttl_cd");
	public final MCStringPermColumn com_paid_ap_sttl_cd = createStringColumn(_com_paid_ap_sttl_cd);
	
	/**
	 * 手数料債務決済区分. Fee AP settlement type.<p>
	 *
	 */
	public static final String $com_paid_ap_sttl_typ = "com_paid_ap_sttl_typ";
	private static final MCPermColumnInfo _com_paid_ap_sttl_typ = createColumnInfo("com_paid_ap_sttl_typ");
	public final MCStringPermColumn com_paid_ap_sttl_typ = createStringColumn(_com_paid_ap_sttl_typ);
	
	/**
	 * 手数料会計理由ＣＤ. Fee accounting reason cd..<p>
	 *
	 */
	public static final String $com_paid_ac_rsn_cd = "com_paid_ac_rsn_cd";
	private static final MCPermColumnInfo _com_paid_ac_rsn_cd = createColumnInfo("com_paid_ac_rsn_cd");
	public final MCStringPermColumn com_paid_ac_rsn_cd = createStringColumn(_com_paid_ac_rsn_cd);
	
	/**
	 * 手数料税ＣＤ. Fee tax cd..<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_cd = "trd_cur_com_paid_tax_cd";
	private static final MCPermColumnInfo _trd_cur_com_paid_tax_cd = createColumnInfo("trd_cur_com_paid_tax_cd");
	public final MCStringPermColumn trd_cur_com_paid_tax_cd = createStringColumn(_trd_cur_com_paid_tax_cd);
	
	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	private static final MCPermColumnInfo _bank_ac_cd = createColumnInfo("bank_ac_cd");
	public final MCStringPermColumn bank_ac_cd = createStringColumn(_bank_ac_cd);
	
	/**
	 * 支払先口座ＣＤ. Payee account cd..<p>
	 *
	 */
	public static final String $pay_bank_ac_cd = "pay_bank_ac_cd";
	private static final MCPermColumnInfo _pay_bank_ac_cd = createColumnInfo("pay_bank_ac_cd");
	public final MCStringPermColumn pay_bank_ac_cd = createStringColumn(_pay_bank_ac_cd);
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	private static final MCPermColumnInfo _trd_cur_amt = createColumnInfo("trd_cur_amt");
	public final MCNumberPermColumn trd_cur_amt = createNumberColumn(_trd_cur_amt);
	
	/**
	 * 取引通貨手数料金額. Fee amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_com_paid = "trd_cur_com_paid";
	private static final MCPermColumnInfo _trd_cur_com_paid = createColumnInfo("trd_cur_com_paid");
	public final MCNumberPermColumn trd_cur_com_paid = createNumberColumn(_trd_cur_com_paid);
	
	/**
	 * 取引通貨手数料税額. Fee tax amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_amt = "trd_cur_com_paid_tax_amt";
	private static final MCPermColumnInfo _trd_cur_com_paid_tax_amt = createColumnInfo("trd_cur_com_paid_tax_amt");
	public final MCNumberPermColumn trd_cur_com_paid_tax_amt = createNumberColumn(_trd_cur_com_paid_tax_amt);
	
	/**
	 * 取引通貨手数料税抜額. Fee amount without tax (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_exc_com_paid = "trd_cur_exc_com_paid";
	private static final MCPermColumnInfo _trd_cur_exc_com_paid = createColumnInfo("trd_cur_exc_com_paid");
	public final MCNumberPermColumn trd_cur_exc_com_paid = createNumberColumn(_trd_cur_exc_com_paid);
	
	/**
	 * 取引通貨相殺対象額. Offset target amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_setoff_tgt_amt = "trd_cur_setoff_tgt_amt";
	private static final MCPermColumnInfo _trd_cur_setoff_tgt_amt = createColumnInfo("trd_cur_setoff_tgt_amt");
	public final MCNumberPermColumn trd_cur_setoff_tgt_amt = createNumberColumn(_trd_cur_setoff_tgt_amt);
	
	/**
	 * 取引通貨相殺予定額. Offset schedule amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_setoff_schd_amt = "trd_cur_setoff_schd_amt";
	private static final MCPermColumnInfo _trd_cur_setoff_schd_amt = createColumnInfo("trd_cur_setoff_schd_amt");
	public final MCNumberPermColumn trd_cur_setoff_schd_amt = createNumberColumn(_trd_cur_setoff_schd_amt);
	
	/**
	 * 取引通貨相殺実績額. Offset result amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_setoff_act_amt = "trd_cur_setoff_act_amt";
	private static final MCPermColumnInfo _trd_cur_setoff_act_amt = createColumnInfo("trd_cur_setoff_act_amt");
	public final MCNumberPermColumn trd_cur_setoff_act_amt = createNumberColumn(_trd_cur_setoff_act_amt);
	
	/**
	 * 取引通貨未処理残高. Unreconciled balance (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_not_proc_bal = "trd_cur_not_proc_bal";
	private static final MCPermColumnInfo _trd_cur_not_proc_bal = createColumnInfo("trd_cur_not_proc_bal");
	public final MCNumberPermColumn trd_cur_not_proc_bal = createNumberColumn(_trd_cur_not_proc_bal);
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	private static final MCPermColumnInfo _base_cur_amt = createColumnInfo("base_cur_amt");
	public final MCNumberPermColumn base_cur_amt = createNumberColumn(_base_cur_amt);
	
	/**
	 * 基準通貨手数料金額. Fee (Base currency).<p>
	 *
	 */
	public static final String $base_cur_com_paid = "base_cur_com_paid";
	private static final MCPermColumnInfo _base_cur_com_paid = createColumnInfo("base_cur_com_paid");
	public final MCNumberPermColumn base_cur_com_paid = createNumberColumn(_base_cur_com_paid);
	
	/**
	 * 基準通貨手数料税額. Fee tax amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_com_paid_tax_amt = "base_cur_com_paid_tax_amt";
	private static final MCPermColumnInfo _base_cur_com_paid_tax_amt = createColumnInfo("base_cur_com_paid_tax_amt");
	public final MCNumberPermColumn base_cur_com_paid_tax_amt = createNumberColumn(_base_cur_com_paid_tax_amt);
	
	/**
	 * 基準通貨手数料税抜額. Fee without tax (Base currency).<p>
	 *
	 */
	public static final String $base_cur_exc_com_paid = "base_cur_exc_com_paid";
	private static final MCPermColumnInfo _base_cur_exc_com_paid = createColumnInfo("base_cur_exc_com_paid");
	public final MCNumberPermColumn base_cur_exc_com_paid = createNumberColumn(_base_cur_exc_com_paid);
	
	/**
	 * 基準通貨相殺対象額. Offset amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_setoff_tgt_amt = "base_cur_setoff_tgt_amt";
	private static final MCPermColumnInfo _base_cur_setoff_tgt_amt = createColumnInfo("base_cur_setoff_tgt_amt");
	public final MCNumberPermColumn base_cur_setoff_tgt_amt = createNumberColumn(_base_cur_setoff_tgt_amt);
	
	/**
	 * 支払照合管理ＮＯ. Payment collation management No..<p>
	 *
	 */
	public static final String $pay_chk_mng_no = "pay_chk_mng_no";
	private static final MCPermColumnInfo _pay_chk_mng_no = createColumnInfo("pay_chk_mng_no");
	public final MCStringPermColumn pay_chk_mng_no = createStringColumn(_pay_chk_mng_no);
	
	/**
	 * 支払通知書前渡金表示ＦＬＧ. Display advance payment on payment notice flg..<p>
	 *
	 */
	public static final String $pay_ntc_adv_pay_flg = "pay_ntc_adv_pay_flg";
	private static final MCPermColumnInfo _pay_ntc_adv_pay_flg = createColumnInfo("pay_ntc_adv_pay_flg");
	public final MCBooleanPermColumn pay_ntc_adv_pay_flg = createBooleanColumn(_pay_ntc_adv_pay_flg);
	
	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	private static final MCPermColumnInfo _trd_rmrks = createColumnInfo("trd_rmrks");
	public final MCStringPermColumn trd_rmrks = createStringColumn(_trd_rmrks);
	
	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	private static final MCPermColumnInfo _intr_rmrks = createColumnInfo("intr_rmrks");
	public final MCStringPermColumn intr_rmrks = createStringColumn(_intr_rmrks);
	
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
	
	public static final MCMeta adv_pay_act_no_META = createCommonMeta($adv_pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta adv_pay_act_seq_META = createCommonMeta($adv_pay_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta adv_pay_act_rev_META = createCommonMeta($adv_pay_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pay_dpt_cd_META = createCommonMeta($pay_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta pay_usr_cd_META = createCommonMeta($pay_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta pay_act_dt_META = createCommonMeta($pay_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ap_sttl_cd_META = createCommonMeta($ap_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ap_sttl_typ_META = createCommonMeta($ap_sttl_typ, mcframe.commonMA.meta.MA_META.AP_STTL_TYP);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta com_paid_ap_sttl_cd_META = createCommonMeta($com_paid_ap_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta com_paid_ap_sttl_typ_META = createCommonMeta($com_paid_ap_sttl_typ, mcframe.commonMA.meta.MA_META.AP_STTL_TYP);
	public static final MCMeta com_paid_ac_rsn_cd_META = createCommonMeta($com_paid_ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta trd_cur_com_paid_tax_cd_META = createCommonMeta($trd_cur_com_paid_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta pay_bank_ac_cd_META = createCommonMeta($pay_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_com_paid_META = createCommonMeta($trd_cur_com_paid, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_com_paid_tax_amt_META = createCommonMeta($trd_cur_com_paid_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_exc_com_paid_META = createCommonMeta($trd_cur_exc_com_paid, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_setoff_tgt_amt_META = createCommonMeta($trd_cur_setoff_tgt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_setoff_schd_amt_META = createCommonMeta($trd_cur_setoff_schd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_setoff_act_amt_META = createCommonMeta($trd_cur_setoff_act_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_not_proc_bal_META = createCommonMeta($trd_cur_not_proc_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_com_paid_META = createCommonMeta($base_cur_com_paid, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_com_paid_tax_amt_META = createCommonMeta($base_cur_com_paid_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_exc_com_paid_META = createCommonMeta($base_cur_exc_com_paid, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_setoff_tgt_amt_META = createCommonMeta($base_cur_setoff_tgt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_chk_mng_no_META = createCommonMeta($pay_chk_mng_no, mcframe.commonMA.meta.MA_META.PAY_CHK_MNG_NO);
	public static final MCMeta pay_ntc_adv_pay_flg_META = createCommonMeta($pay_ntc_adv_pay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.ADV_PAY_ACT_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.ADV_PAY_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.ADV_PAY_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.ADV_PAY_ACT_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_ADV_PAY_ACT_R> constMetas = new ConstMetaList<MST_ADV_PAY_ACT_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			adv_pay_act_no_META,
			adv_pay_act_seq_META,
			adv_pay_act_rev_META,
			slip_sts_typ_META,
			psppl_cd_META,
			bsppl_cd_META,
			bsppl_dpt_cd_META,
			bd_dpt_cd_META,
			pay_dpt_cd_META,
			wg_cd_META,
			pay_usr_cd_META,
			pay_act_dt_META,
			ac_dt_META,
			ac_ym_META,
			trd_cur_cd_META,
			base_cur_cd_META,
			xrate_cd_META,
			xrate_META,
			ap_sttl_cd_META,
			ap_sttl_typ_META,
			ac_rsn_cd_META,
			com_paid_ap_sttl_cd_META,
			com_paid_ap_sttl_typ_META,
			com_paid_ac_rsn_cd_META,
			trd_cur_com_paid_tax_cd_META,
			bank_ac_cd_META,
			pay_bank_ac_cd_META,
			trd_cur_amt_META,
			trd_cur_com_paid_META,
			trd_cur_com_paid_tax_amt_META,
			trd_cur_exc_com_paid_META,
			trd_cur_setoff_tgt_amt_META,
			trd_cur_setoff_schd_amt_META,
			trd_cur_setoff_act_amt_META,
			trd_cur_not_proc_bal_META,
			base_cur_amt_META,
			base_cur_com_paid_META,
			base_cur_com_paid_tax_amt_META,
			base_cur_exc_com_paid_META,
			base_cur_setoff_tgt_amt_META,
			pay_chk_mng_no_META,
			pay_ntc_adv_pay_flg_META,
			trd_rmrks_META,
			intr_rmrks_META,
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
	protected MST_ADV_PAY_ACT_R(ConstMetaList<? extends MST_ADV_PAY_ACT_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_ADV_PAY_ACT_R(ConstMetaList<? extends MST_ADV_PAY_ACT_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$adv_pay_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$adv_pay_act_no,
				"adv_pay_act_no",
				adv_pay_act_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$adv_pay_act_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ADV_PAY_ACT_R.$adv_pay_act_seq,
				"adv_pay_act_seq",
				adv_pay_act_seq,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$adv_pay_act_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ADV_PAY_ACT_R.$adv_pay_act_rev,
				"adv_pay_act_rev",
				adv_pay_act_rev,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$slip_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$slip_sts_typ,
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
			MST_ADV_PAY_ACT_R.$psppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$psppl_cd,
				"psppl_cd",
				psppl_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$bsppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$bsppl_cd,
				"bsppl_cd",
				bsppl_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$bsppl_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$bsppl_dpt_cd,
				"bsppl_dpt_cd",
				bsppl_dpt_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$bd_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$bd_dpt_cd,
				"bd_dpt_cd",
				bd_dpt_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$pay_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$pay_dpt_cd,
				"pay_dpt_cd",
				pay_dpt_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$wg_cd,
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
			MST_ADV_PAY_ACT_R.$pay_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$pay_usr_cd,
				"pay_usr_cd",
				pay_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$pay_act_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ADV_PAY_ACT_R.$pay_act_dt,
				"pay_act_dt",
				pay_act_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ADV_PAY_ACT_R.$ac_dt,
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
			MST_ADV_PAY_ACT_R.$ac_ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ADV_PAY_ACT_R.$ac_ym,
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
			MST_ADV_PAY_ACT_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$trd_cur_cd,
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
			MST_ADV_PAY_ACT_R.$base_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$base_cur_cd,
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
			MST_ADV_PAY_ACT_R.$xrate_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$xrate_cd,
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
			MST_ADV_PAY_ACT_R.$xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ADV_PAY_ACT_R.$xrate,
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
			MST_ADV_PAY_ACT_R.$ap_sttl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$ap_sttl_cd,
				"ap_sttl_cd",
				ap_sttl_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$ap_sttl_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$ap_sttl_typ,
				"ap_sttl_typ",
				ap_sttl_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$ac_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$ac_rsn_cd,
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
			MST_ADV_PAY_ACT_R.$com_paid_ap_sttl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$com_paid_ap_sttl_cd,
				"com_paid_ap_sttl_cd",
				com_paid_ap_sttl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$com_paid_ap_sttl_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$com_paid_ap_sttl_typ,
				"com_paid_ap_sttl_typ",
				com_paid_ap_sttl_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$com_paid_ac_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$com_paid_ac_rsn_cd,
				"com_paid_ac_rsn_cd",
				com_paid_ac_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$trd_cur_com_paid_tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$trd_cur_com_paid_tax_cd,
				"trd_cur_com_paid_tax_cd",
				trd_cur_com_paid_tax_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$bank_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$bank_ac_cd,
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
			MST_ADV_PAY_ACT_R.$pay_bank_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$pay_bank_ac_cd,
				"pay_bank_ac_cd",
				pay_bank_ac_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$trd_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ADV_PAY_ACT_R.$trd_cur_amt,
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
			MST_ADV_PAY_ACT_R.$trd_cur_com_paid,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ADV_PAY_ACT_R.$trd_cur_com_paid,
				"trd_cur_com_paid",
				trd_cur_com_paid,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$trd_cur_com_paid_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ADV_PAY_ACT_R.$trd_cur_com_paid_tax_amt,
				"trd_cur_com_paid_tax_amt",
				trd_cur_com_paid_tax_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$trd_cur_exc_com_paid,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ADV_PAY_ACT_R.$trd_cur_exc_com_paid,
				"trd_cur_exc_com_paid",
				trd_cur_exc_com_paid,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$trd_cur_setoff_tgt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ADV_PAY_ACT_R.$trd_cur_setoff_tgt_amt,
				"trd_cur_setoff_tgt_amt",
				trd_cur_setoff_tgt_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$trd_cur_setoff_schd_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ADV_PAY_ACT_R.$trd_cur_setoff_schd_amt,
				"trd_cur_setoff_schd_amt",
				trd_cur_setoff_schd_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$trd_cur_setoff_act_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ADV_PAY_ACT_R.$trd_cur_setoff_act_amt,
				"trd_cur_setoff_act_amt",
				trd_cur_setoff_act_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$trd_cur_not_proc_bal,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ADV_PAY_ACT_R.$trd_cur_not_proc_bal,
				"trd_cur_not_proc_bal",
				trd_cur_not_proc_bal,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$base_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ADV_PAY_ACT_R.$base_cur_amt,
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
			MST_ADV_PAY_ACT_R.$base_cur_com_paid,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ADV_PAY_ACT_R.$base_cur_com_paid,
				"base_cur_com_paid",
				base_cur_com_paid,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$base_cur_com_paid_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ADV_PAY_ACT_R.$base_cur_com_paid_tax_amt,
				"base_cur_com_paid_tax_amt",
				base_cur_com_paid_tax_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$base_cur_exc_com_paid,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ADV_PAY_ACT_R.$base_cur_exc_com_paid,
				"base_cur_exc_com_paid",
				base_cur_exc_com_paid,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$base_cur_setoff_tgt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ADV_PAY_ACT_R.$base_cur_setoff_tgt_amt,
				"base_cur_setoff_tgt_amt",
				base_cur_setoff_tgt_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$pay_chk_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$pay_chk_mng_no,
				"pay_chk_mng_no",
				pay_chk_mng_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$pay_ntc_adv_pay_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ADV_PAY_ACT_R.$pay_ntc_adv_pay_flg,
				"pay_ntc_adv_pay_flg",
				pay_ntc_adv_pay_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ADV_PAY_ACT_R.$trd_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$trd_rmrks,
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
			MST_ADV_PAY_ACT_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$intr_rmrks,
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
			MST_ADV_PAY_ACT_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$sub_char1,
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
			MST_ADV_PAY_ACT_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$sub_char2,
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
			MST_ADV_PAY_ACT_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$sub_char3,
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
			MST_ADV_PAY_ACT_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$ins_usr_id,
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
			MST_ADV_PAY_ACT_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$ins_usr_nm,
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
			MST_ADV_PAY_ACT_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_ADV_PAY_ACT_R.$ins_ts,
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
			MST_ADV_PAY_ACT_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$ins_func_id,
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
			MST_ADV_PAY_ACT_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ADV_PAY_ACT_R.$upd_cntr,
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
			MST_ADV_PAY_ACT_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$upd_usr_id,
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
			MST_ADV_PAY_ACT_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$upd_usr_nm,
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
			MST_ADV_PAY_ACT_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_ADV_PAY_ACT_R.$upd_ts,
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
			MST_ADV_PAY_ACT_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$upd_func_id,
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
			MST_ADV_PAY_ACT_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ADV_PAY_ACT_R.$upd_srv_req_no,
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
	public static MST_ADV_PAY_ACT_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_ADV_PAY_ACT_R create(String alias) {
		MST_ADV_PAY_ACT_R row = new MST_ADV_PAY_ACT_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_ADV_PAY_ACT_R createByName(T proto) {
		MST_ADV_PAY_ACT_R row = MST_ADV_PAY_ACT_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ADV_PAY_ACT_R clone() {
		return (MST_ADV_PAY_ACT_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ADV_PAY_ACT_R createInstance() {
		return (MST_ADV_PAY_ACT_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ADV_PAY_ACT_R getValues(String... names) {
		return (MST_ADV_PAY_ACT_R) super.getValues(names);
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
	 public MSW_ADV_PAY_ACT_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_ADV_PAY_ACT_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_ADV_PAY_ACT_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_ADV_PAY_ACT_KEY_R.TABLE_NAME);
	 }

	/**
	 * 前渡金実績ＮＯ. Advance payment result No..<p>
	 *
	 */
	public String adv_pay_act_no() {
		return getConstString(offset + 0, $adv_pay_act_no);
	}

	/**
	 * 前渡金実績ＮＯ. Advance payment result No..<p>
	 *
	 */
	public void adv_pay_act_no(String value) {
		setConstString(offset + 0, $adv_pay_act_no, value);
	}

	/**
	 * 前渡金実績連番. Advance payment result sequence number.<p>
	 *
	 */
	public MCNumber adv_pay_act_seq() {
		return getConstNumber(offset + 1, $adv_pay_act_seq);
	}

	/**
	 * 前渡金実績連番. Advance payment result sequence number.<p>
	 *
	 */
	public void adv_pay_act_seq(MCNumber value) {
		setConstNumber(offset + 1, $adv_pay_act_seq, value);
	}
	
	/**
	 * 前渡金実績連番. Advance payment result sequence number.<p>
	 *
	 */
	public void adv_pay_act_seq(int value) {
		setConstNumber(offset + 1, $adv_pay_act_seq, value);
	}
	
	/**
	 * 前渡金実績連番. Advance payment result sequence number.<p>
	 *
	 */
	public void adv_pay_act_seq(long value) {
		setConstNumber(offset + 1, $adv_pay_act_seq, value);
	}
	
	/**
	 * 前渡金実績連番. Advance payment result sequence number.<p>
	 *
	 */
	public void adv_pay_act_seq(float value) {
		setConstNumber(offset + 1, $adv_pay_act_seq, value);
	}
	
	/**
	 * 前渡金実績連番. Advance payment result sequence number.<p>
	 *
	 */
	public void adv_pay_act_seq(double value) {
		setConstNumber(offset + 1, $adv_pay_act_seq, value);
	}
	
	/**
	 * 前渡金実績改訂番号. Advance payment result revision number.<p>
	 *
	 */
	public MCNumber adv_pay_act_rev() {
		return getConstNumber(offset + 2, $adv_pay_act_rev);
	}

	/**
	 * 前渡金実績改訂番号. Advance payment result revision number.<p>
	 *
	 */
	public void adv_pay_act_rev(MCNumber value) {
		setConstNumber(offset + 2, $adv_pay_act_rev, value);
	}
	
	/**
	 * 前渡金実績改訂番号. Advance payment result revision number.<p>
	 *
	 */
	public void adv_pay_act_rev(int value) {
		setConstNumber(offset + 2, $adv_pay_act_rev, value);
	}
	
	/**
	 * 前渡金実績改訂番号. Advance payment result revision number.<p>
	 *
	 */
	public void adv_pay_act_rev(long value) {
		setConstNumber(offset + 2, $adv_pay_act_rev, value);
	}
	
	/**
	 * 前渡金実績改訂番号. Advance payment result revision number.<p>
	 *
	 */
	public void adv_pay_act_rev(float value) {
		setConstNumber(offset + 2, $adv_pay_act_rev, value);
	}
	
	/**
	 * 前渡金実績改訂番号. Advance payment result revision number.<p>
	 *
	 */
	public void adv_pay_act_rev(double value) {
		setConstNumber(offset + 2, $adv_pay_act_rev, value);
	}
	
	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 3, $slip_sts_typ);
	}

	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 3, $slip_sts_typ, value);
	}

	/**
	 * 支払先ＣＤ. Payee cd..<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 4, $psppl_cd);
	}

	/**
	 * 支払先ＣＤ. Payee cd..<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 4, $psppl_cd, value);
	}

	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 5, $bsppl_cd);
	}

	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 5, $bsppl_cd, value);
	}

	/**
	 * 支払予定管理先担当部門ＣＤ. Cd. of dept. in charge of scheduled payee.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 6, $bsppl_dpt_cd);
	}

	/**
	 * 支払予定管理先担当部門ＣＤ. Cd. of dept. in charge of scheduled payee.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 6, $bsppl_dpt_cd, value);
	}

	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 7, $bd_dpt_cd);
	}

	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 7, $bd_dpt_cd, value);
	}

	/**
	 * 支払部門ＣＤ. Payment dept. cd..<p>
	 *
	 */
	public String pay_dpt_cd() {
		return getConstString(offset + 8, $pay_dpt_cd);
	}

	/**
	 * 支払部門ＣＤ. Payment dept. cd..<p>
	 *
	 */
	public void pay_dpt_cd(String value) {
		setConstString(offset + 8, $pay_dpt_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 9, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 9, $wg_cd, value);
	}

	/**
	 * 支払担当者ＣＤ. Payment PIC cd..<p>
	 *
	 */
	public String pay_usr_cd() {
		return getConstString(offset + 10, $pay_usr_cd);
	}

	/**
	 * 支払担当者ＣＤ. Payment PIC cd..<p>
	 *
	 */
	public void pay_usr_cd(String value) {
		setConstString(offset + 10, $pay_usr_cd, value);
	}

	/**
	 * 支払実績日. Actual payment date.<p>
	 *
	 */
	public MCDate pay_act_dt() {
		return getConstDate(offset + 11, $pay_act_dt);
	}

	/**
	 * 支払実績日. Actual payment date.<p>
	 *
	 */
	public void pay_act_dt(MCDate value) {
		setConstDate(offset + 11, $pay_act_dt, value);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 12, $ac_dt);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 12, $ac_dt, value);
	}

	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 13, $ac_ym);
	}

	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 13, $ac_ym, value);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 14, $trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 14, $trd_cur_cd, value);
	}

	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 15, $base_cur_cd);
	}

	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 15, $base_cur_cd, value);
	}

	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 16, $xrate_cd);
	}

	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 16, $xrate_cd, value);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 17, $xrate);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 17, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 17, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 17, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 17, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 17, $xrate, value);
	}
	
	/**
	 * 債務決済方法ＣＤ. AP settlement method cd..<p>
	 *
	 */
	public String ap_sttl_cd() {
		return getConstString(offset + 18, $ap_sttl_cd);
	}

	/**
	 * 債務決済方法ＣＤ. AP settlement method cd..<p>
	 *
	 */
	public void ap_sttl_cd(String value) {
		setConstString(offset + 18, $ap_sttl_cd, value);
	}

	/**
	 * 債務決済区分. AP settlement type.<p>
	 *
	 */
	public String ap_sttl_typ() {
		return getConstString(offset + 19, $ap_sttl_typ);
	}

	/**
	 * 債務決済区分. AP settlement type.<p>
	 *
	 */
	public void ap_sttl_typ(String value) {
		setConstString(offset + 19, $ap_sttl_typ, value);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 20, $ac_rsn_cd);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 20, $ac_rsn_cd, value);
	}

	/**
	 * 手数料債務決済方法ＣＤ. Fee AP settlement method cd..<p>
	 *
	 */
	public String com_paid_ap_sttl_cd() {
		return getConstString(offset + 21, $com_paid_ap_sttl_cd);
	}

	/**
	 * 手数料債務決済方法ＣＤ. Fee AP settlement method cd..<p>
	 *
	 */
	public void com_paid_ap_sttl_cd(String value) {
		setConstString(offset + 21, $com_paid_ap_sttl_cd, value);
	}

	/**
	 * 手数料債務決済区分. Fee AP settlement type.<p>
	 *
	 */
	public String com_paid_ap_sttl_typ() {
		return getConstString(offset + 22, $com_paid_ap_sttl_typ);
	}

	/**
	 * 手数料債務決済区分. Fee AP settlement type.<p>
	 *
	 */
	public void com_paid_ap_sttl_typ(String value) {
		setConstString(offset + 22, $com_paid_ap_sttl_typ, value);
	}

	/**
	 * 手数料会計理由ＣＤ. Fee accounting reason cd..<p>
	 *
	 */
	public String com_paid_ac_rsn_cd() {
		return getConstString(offset + 23, $com_paid_ac_rsn_cd);
	}

	/**
	 * 手数料会計理由ＣＤ. Fee accounting reason cd..<p>
	 *
	 */
	public void com_paid_ac_rsn_cd(String value) {
		setConstString(offset + 23, $com_paid_ac_rsn_cd, value);
	}

	/**
	 * 手数料税ＣＤ. Fee tax cd..<p>
	 *
	 */
	public String trd_cur_com_paid_tax_cd() {
		return getConstString(offset + 24, $trd_cur_com_paid_tax_cd);
	}

	/**
	 * 手数料税ＣＤ. Fee tax cd..<p>
	 *
	 */
	public void trd_cur_com_paid_tax_cd(String value) {
		setConstString(offset + 24, $trd_cur_com_paid_tax_cd, value);
	}

	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 25, $bank_ac_cd);
	}

	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 25, $bank_ac_cd, value);
	}

	/**
	 * 支払先口座ＣＤ. Payee account cd..<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return getConstString(offset + 26, $pay_bank_ac_cd);
	}

	/**
	 * 支払先口座ＣＤ. Payee account cd..<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		setConstString(offset + 26, $pay_bank_ac_cd, value);
	}

	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 27, $trd_cur_amt);
	}

	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 27, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 27, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 27, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 27, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 27, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨手数料金額. Fee amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_com_paid() {
		return getConstNumber(offset + 28, $trd_cur_com_paid);
	}

	/**
	 * 取引通貨手数料金額. Fee amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_com_paid(MCNumber value) {
		setConstNumber(offset + 28, $trd_cur_com_paid, value);
	}
	
	/**
	 * 取引通貨手数料金額. Fee amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_com_paid(int value) {
		setConstNumber(offset + 28, $trd_cur_com_paid, value);
	}
	
	/**
	 * 取引通貨手数料金額. Fee amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_com_paid(long value) {
		setConstNumber(offset + 28, $trd_cur_com_paid, value);
	}
	
	/**
	 * 取引通貨手数料金額. Fee amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_com_paid(float value) {
		setConstNumber(offset + 28, $trd_cur_com_paid, value);
	}
	
	/**
	 * 取引通貨手数料金額. Fee amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_com_paid(double value) {
		setConstNumber(offset + 28, $trd_cur_com_paid, value);
	}
	
	/**
	 * 取引通貨手数料税額. Fee tax amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_com_paid_tax_amt() {
		return getConstNumber(offset + 29, $trd_cur_com_paid_tax_amt);
	}

	/**
	 * 取引通貨手数料税額. Fee tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(MCNumber value) {
		setConstNumber(offset + 29, $trd_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 取引通貨手数料税額. Fee tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(int value) {
		setConstNumber(offset + 29, $trd_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 取引通貨手数料税額. Fee tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(long value) {
		setConstNumber(offset + 29, $trd_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 取引通貨手数料税額. Fee tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(float value) {
		setConstNumber(offset + 29, $trd_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 取引通貨手数料税額. Fee tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(double value) {
		setConstNumber(offset + 29, $trd_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 取引通貨手数料税抜額. Fee amount without tax (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_exc_com_paid() {
		return getConstNumber(offset + 30, $trd_cur_exc_com_paid);
	}

	/**
	 * 取引通貨手数料税抜額. Fee amount without tax (Transaction currency).<p>
	 *
	 */
	public void trd_cur_exc_com_paid(MCNumber value) {
		setConstNumber(offset + 30, $trd_cur_exc_com_paid, value);
	}
	
	/**
	 * 取引通貨手数料税抜額. Fee amount without tax (Transaction currency).<p>
	 *
	 */
	public void trd_cur_exc_com_paid(int value) {
		setConstNumber(offset + 30, $trd_cur_exc_com_paid, value);
	}
	
	/**
	 * 取引通貨手数料税抜額. Fee amount without tax (Transaction currency).<p>
	 *
	 */
	public void trd_cur_exc_com_paid(long value) {
		setConstNumber(offset + 30, $trd_cur_exc_com_paid, value);
	}
	
	/**
	 * 取引通貨手数料税抜額. Fee amount without tax (Transaction currency).<p>
	 *
	 */
	public void trd_cur_exc_com_paid(float value) {
		setConstNumber(offset + 30, $trd_cur_exc_com_paid, value);
	}
	
	/**
	 * 取引通貨手数料税抜額. Fee amount without tax (Transaction currency).<p>
	 *
	 */
	public void trd_cur_exc_com_paid(double value) {
		setConstNumber(offset + 30, $trd_cur_exc_com_paid, value);
	}
	
	/**
	 * 取引通貨相殺対象額. Offset target amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_setoff_tgt_amt() {
		return getConstNumber(offset + 31, $trd_cur_setoff_tgt_amt);
	}

	/**
	 * 取引通貨相殺対象額. Offset target amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_setoff_tgt_amt(MCNumber value) {
		setConstNumber(offset + 31, $trd_cur_setoff_tgt_amt, value);
	}
	
	/**
	 * 取引通貨相殺対象額. Offset target amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_setoff_tgt_amt(int value) {
		setConstNumber(offset + 31, $trd_cur_setoff_tgt_amt, value);
	}
	
	/**
	 * 取引通貨相殺対象額. Offset target amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_setoff_tgt_amt(long value) {
		setConstNumber(offset + 31, $trd_cur_setoff_tgt_amt, value);
	}
	
	/**
	 * 取引通貨相殺対象額. Offset target amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_setoff_tgt_amt(float value) {
		setConstNumber(offset + 31, $trd_cur_setoff_tgt_amt, value);
	}
	
	/**
	 * 取引通貨相殺対象額. Offset target amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_setoff_tgt_amt(double value) {
		setConstNumber(offset + 31, $trd_cur_setoff_tgt_amt, value);
	}
	
	/**
	 * 取引通貨相殺予定額. Offset schedule amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_setoff_schd_amt() {
		return getConstNumber(offset + 32, $trd_cur_setoff_schd_amt);
	}

	/**
	 * 取引通貨相殺予定額. Offset schedule amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_setoff_schd_amt(MCNumber value) {
		setConstNumber(offset + 32, $trd_cur_setoff_schd_amt, value);
	}
	
	/**
	 * 取引通貨相殺予定額. Offset schedule amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_setoff_schd_amt(int value) {
		setConstNumber(offset + 32, $trd_cur_setoff_schd_amt, value);
	}
	
	/**
	 * 取引通貨相殺予定額. Offset schedule amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_setoff_schd_amt(long value) {
		setConstNumber(offset + 32, $trd_cur_setoff_schd_amt, value);
	}
	
	/**
	 * 取引通貨相殺予定額. Offset schedule amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_setoff_schd_amt(float value) {
		setConstNumber(offset + 32, $trd_cur_setoff_schd_amt, value);
	}
	
	/**
	 * 取引通貨相殺予定額. Offset schedule amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_setoff_schd_amt(double value) {
		setConstNumber(offset + 32, $trd_cur_setoff_schd_amt, value);
	}
	
	/**
	 * 取引通貨相殺実績額. Offset result amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_setoff_act_amt() {
		return getConstNumber(offset + 33, $trd_cur_setoff_act_amt);
	}

	/**
	 * 取引通貨相殺実績額. Offset result amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_setoff_act_amt(MCNumber value) {
		setConstNumber(offset + 33, $trd_cur_setoff_act_amt, value);
	}
	
	/**
	 * 取引通貨相殺実績額. Offset result amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_setoff_act_amt(int value) {
		setConstNumber(offset + 33, $trd_cur_setoff_act_amt, value);
	}
	
	/**
	 * 取引通貨相殺実績額. Offset result amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_setoff_act_amt(long value) {
		setConstNumber(offset + 33, $trd_cur_setoff_act_amt, value);
	}
	
	/**
	 * 取引通貨相殺実績額. Offset result amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_setoff_act_amt(float value) {
		setConstNumber(offset + 33, $trd_cur_setoff_act_amt, value);
	}
	
	/**
	 * 取引通貨相殺実績額. Offset result amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_setoff_act_amt(double value) {
		setConstNumber(offset + 33, $trd_cur_setoff_act_amt, value);
	}
	
	/**
	 * 取引通貨未処理残高. Unreconciled balance (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_not_proc_bal() {
		return getConstNumber(offset + 34, $trd_cur_not_proc_bal);
	}

	/**
	 * 取引通貨未処理残高. Unreconciled balance (Transaction currency).<p>
	 *
	 */
	public void trd_cur_not_proc_bal(MCNumber value) {
		setConstNumber(offset + 34, $trd_cur_not_proc_bal, value);
	}
	
	/**
	 * 取引通貨未処理残高. Unreconciled balance (Transaction currency).<p>
	 *
	 */
	public void trd_cur_not_proc_bal(int value) {
		setConstNumber(offset + 34, $trd_cur_not_proc_bal, value);
	}
	
	/**
	 * 取引通貨未処理残高. Unreconciled balance (Transaction currency).<p>
	 *
	 */
	public void trd_cur_not_proc_bal(long value) {
		setConstNumber(offset + 34, $trd_cur_not_proc_bal, value);
	}
	
	/**
	 * 取引通貨未処理残高. Unreconciled balance (Transaction currency).<p>
	 *
	 */
	public void trd_cur_not_proc_bal(float value) {
		setConstNumber(offset + 34, $trd_cur_not_proc_bal, value);
	}
	
	/**
	 * 取引通貨未処理残高. Unreconciled balance (Transaction currency).<p>
	 *
	 */
	public void trd_cur_not_proc_bal(double value) {
		setConstNumber(offset + 34, $trd_cur_not_proc_bal, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 35, $base_cur_amt);
	}

	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 35, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 35, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 35, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 35, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 35, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨手数料金額. Fee (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_com_paid() {
		return getConstNumber(offset + 36, $base_cur_com_paid);
	}

	/**
	 * 基準通貨手数料金額. Fee (Base currency).<p>
	 *
	 */
	public void base_cur_com_paid(MCNumber value) {
		setConstNumber(offset + 36, $base_cur_com_paid, value);
	}
	
	/**
	 * 基準通貨手数料金額. Fee (Base currency).<p>
	 *
	 */
	public void base_cur_com_paid(int value) {
		setConstNumber(offset + 36, $base_cur_com_paid, value);
	}
	
	/**
	 * 基準通貨手数料金額. Fee (Base currency).<p>
	 *
	 */
	public void base_cur_com_paid(long value) {
		setConstNumber(offset + 36, $base_cur_com_paid, value);
	}
	
	/**
	 * 基準通貨手数料金額. Fee (Base currency).<p>
	 *
	 */
	public void base_cur_com_paid(float value) {
		setConstNumber(offset + 36, $base_cur_com_paid, value);
	}
	
	/**
	 * 基準通貨手数料金額. Fee (Base currency).<p>
	 *
	 */
	public void base_cur_com_paid(double value) {
		setConstNumber(offset + 36, $base_cur_com_paid, value);
	}
	
	/**
	 * 基準通貨手数料税額. Fee tax amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_com_paid_tax_amt() {
		return getConstNumber(offset + 37, $base_cur_com_paid_tax_amt);
	}

	/**
	 * 基準通貨手数料税額. Fee tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(MCNumber value) {
		setConstNumber(offset + 37, $base_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 基準通貨手数料税額. Fee tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(int value) {
		setConstNumber(offset + 37, $base_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 基準通貨手数料税額. Fee tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(long value) {
		setConstNumber(offset + 37, $base_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 基準通貨手数料税額. Fee tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(float value) {
		setConstNumber(offset + 37, $base_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 基準通貨手数料税額. Fee tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(double value) {
		setConstNumber(offset + 37, $base_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 基準通貨手数料税抜額. Fee without tax (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_exc_com_paid() {
		return getConstNumber(offset + 38, $base_cur_exc_com_paid);
	}

	/**
	 * 基準通貨手数料税抜額. Fee without tax (Base currency).<p>
	 *
	 */
	public void base_cur_exc_com_paid(MCNumber value) {
		setConstNumber(offset + 38, $base_cur_exc_com_paid, value);
	}
	
	/**
	 * 基準通貨手数料税抜額. Fee without tax (Base currency).<p>
	 *
	 */
	public void base_cur_exc_com_paid(int value) {
		setConstNumber(offset + 38, $base_cur_exc_com_paid, value);
	}
	
	/**
	 * 基準通貨手数料税抜額. Fee without tax (Base currency).<p>
	 *
	 */
	public void base_cur_exc_com_paid(long value) {
		setConstNumber(offset + 38, $base_cur_exc_com_paid, value);
	}
	
	/**
	 * 基準通貨手数料税抜額. Fee without tax (Base currency).<p>
	 *
	 */
	public void base_cur_exc_com_paid(float value) {
		setConstNumber(offset + 38, $base_cur_exc_com_paid, value);
	}
	
	/**
	 * 基準通貨手数料税抜額. Fee without tax (Base currency).<p>
	 *
	 */
	public void base_cur_exc_com_paid(double value) {
		setConstNumber(offset + 38, $base_cur_exc_com_paid, value);
	}
	
	/**
	 * 基準通貨相殺対象額. Offset amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_setoff_tgt_amt() {
		return getConstNumber(offset + 39, $base_cur_setoff_tgt_amt);
	}

	/**
	 * 基準通貨相殺対象額. Offset amount (Base currency).<p>
	 *
	 */
	public void base_cur_setoff_tgt_amt(MCNumber value) {
		setConstNumber(offset + 39, $base_cur_setoff_tgt_amt, value);
	}
	
	/**
	 * 基準通貨相殺対象額. Offset amount (Base currency).<p>
	 *
	 */
	public void base_cur_setoff_tgt_amt(int value) {
		setConstNumber(offset + 39, $base_cur_setoff_tgt_amt, value);
	}
	
	/**
	 * 基準通貨相殺対象額. Offset amount (Base currency).<p>
	 *
	 */
	public void base_cur_setoff_tgt_amt(long value) {
		setConstNumber(offset + 39, $base_cur_setoff_tgt_amt, value);
	}
	
	/**
	 * 基準通貨相殺対象額. Offset amount (Base currency).<p>
	 *
	 */
	public void base_cur_setoff_tgt_amt(float value) {
		setConstNumber(offset + 39, $base_cur_setoff_tgt_amt, value);
	}
	
	/**
	 * 基準通貨相殺対象額. Offset amount (Base currency).<p>
	 *
	 */
	public void base_cur_setoff_tgt_amt(double value) {
		setConstNumber(offset + 39, $base_cur_setoff_tgt_amt, value);
	}
	
	/**
	 * 支払照合管理ＮＯ. Payment collation management No..<p>
	 *
	 */
	public String pay_chk_mng_no() {
		return getConstString(offset + 40, $pay_chk_mng_no);
	}

	/**
	 * 支払照合管理ＮＯ. Payment collation management No..<p>
	 *
	 */
	public void pay_chk_mng_no(String value) {
		setConstString(offset + 40, $pay_chk_mng_no, value);
	}

	/**
	 * 支払通知書前渡金表示ＦＬＧ. Display advance payment on payment notice flg..<p>
	 *
	 */
	public boolean pay_ntc_adv_pay_flg() {
		return getConstBoolean(offset + 41, $pay_ntc_adv_pay_flg);
	}

	/**
	 * 支払通知書前渡金表示ＦＬＧ. Display advance payment on payment notice flg..<p>
	 *
	 */
	public void pay_ntc_adv_pay_flg(boolean value) {
		setConstBoolean(offset + 41, $pay_ntc_adv_pay_flg, value);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 42, $trd_rmrks);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 42, $trd_rmrks, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 43, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 43, $intr_rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 44, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 44, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 45, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 45, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 46, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 46, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 47, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 47, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 48, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 48, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 49, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 49, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 50, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 50, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 51, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 52, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 52, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 53, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 53, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 54, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 54, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 55, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 55, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 56, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 56, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			return adv_pay_act_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($pay_usr_cd.equalsIgnoreCase(name)) {
			return pay_usr_cd();
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
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			return ap_sttl_typ();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($com_paid_ap_sttl_cd.equalsIgnoreCase(name)) {
			return com_paid_ap_sttl_cd();
		}
		if ($com_paid_ap_sttl_typ.equalsIgnoreCase(name)) {
			return com_paid_ap_sttl_typ();
		}
		if ($com_paid_ac_rsn_cd.equalsIgnoreCase(name)) {
			return com_paid_ac_rsn_cd();
		}
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_cd();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			return pay_chk_mng_no();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			return adv_pay_act_seq();
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			return adv_pay_act_rev();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			return trd_cur_com_paid();
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_amt();
		}
		if ($trd_cur_exc_com_paid.equalsIgnoreCase(name)) {
			return trd_cur_exc_com_paid();
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			return trd_cur_setoff_tgt_amt();
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			return trd_cur_setoff_schd_amt();
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			return trd_cur_setoff_act_amt();
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			return trd_cur_not_proc_bal();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			return base_cur_com_paid();
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_com_paid_tax_amt();
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			return base_cur_exc_com_paid();
		}
		if ($base_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			return base_cur_setoff_tgt_amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			return pay_act_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
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
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			return pay_ntc_adv_pay_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			return adv_pay_act_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($pay_usr_cd.equalsIgnoreCase(name)) {
			return pay_usr_cd();
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
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			return ap_sttl_typ();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($com_paid_ap_sttl_cd.equalsIgnoreCase(name)) {
			return com_paid_ap_sttl_cd();
		}
		if ($com_paid_ap_sttl_typ.equalsIgnoreCase(name)) {
			return com_paid_ap_sttl_typ();
		}
		if ($com_paid_ac_rsn_cd.equalsIgnoreCase(name)) {
			return com_paid_ac_rsn_cd();
		}
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_cd();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			return pay_chk_mng_no();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			return adv_pay_act_seq();
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			return adv_pay_act_rev();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			return trd_cur_com_paid();
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_amt();
		}
		if ($trd_cur_exc_com_paid.equalsIgnoreCase(name)) {
			return trd_cur_exc_com_paid();
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			return trd_cur_setoff_tgt_amt();
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			return trd_cur_setoff_schd_amt();
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			return trd_cur_setoff_act_amt();
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			return trd_cur_not_proc_bal();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			return base_cur_com_paid();
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_com_paid_tax_amt();
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			return base_cur_exc_com_paid();
		}
		if ($base_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			return base_cur_setoff_tgt_amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			return pay_act_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
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
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			return pay_ntc_adv_pay_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			adv_pay_act_no(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
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
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			pay_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($pay_usr_cd.equalsIgnoreCase(name)) {
			pay_usr_cd(value);
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
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			ap_sttl_cd(value);
			return;
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			ap_sttl_typ(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($com_paid_ap_sttl_cd.equalsIgnoreCase(name)) {
			com_paid_ap_sttl_cd(value);
			return;
		}
		if ($com_paid_ap_sttl_typ.equalsIgnoreCase(name)) {
			com_paid_ap_sttl_typ(value);
			return;
		}
		if ($com_paid_ac_rsn_cd.equalsIgnoreCase(name)) {
			com_paid_ac_rsn_cd(value);
			return;
		}
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_cd(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			pay_chk_mng_no(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			adv_pay_act_rev(value);
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
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($trd_cur_exc_com_paid.equalsIgnoreCase(name)) {
			trd_cur_exc_com_paid(value);
			return;
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_tgt_amt(value);
			return;
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_schd_amt(value);
			return;
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_act_amt(value);
			return;
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			trd_cur_not_proc_bal(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			base_cur_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			base_cur_exc_com_paid(value);
			return;
		}
		if ($base_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_tgt_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			adv_pay_act_rev(value);
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
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($trd_cur_exc_com_paid.equalsIgnoreCase(name)) {
			trd_cur_exc_com_paid(value);
			return;
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_tgt_amt(value);
			return;
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_schd_amt(value);
			return;
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_act_amt(value);
			return;
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			trd_cur_not_proc_bal(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			base_cur_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			base_cur_exc_com_paid(value);
			return;
		}
		if ($base_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_tgt_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			adv_pay_act_rev(value);
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
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($trd_cur_exc_com_paid.equalsIgnoreCase(name)) {
			trd_cur_exc_com_paid(value);
			return;
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_tgt_amt(value);
			return;
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_schd_amt(value);
			return;
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_act_amt(value);
			return;
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			trd_cur_not_proc_bal(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			base_cur_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			base_cur_exc_com_paid(value);
			return;
		}
		if ($base_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_tgt_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			adv_pay_act_rev(value);
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
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($trd_cur_exc_com_paid.equalsIgnoreCase(name)) {
			trd_cur_exc_com_paid(value);
			return;
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_tgt_amt(value);
			return;
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_schd_amt(value);
			return;
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_act_amt(value);
			return;
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			trd_cur_not_proc_bal(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			base_cur_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			base_cur_exc_com_paid(value);
			return;
		}
		if ($base_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_tgt_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			adv_pay_act_rev(value);
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
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($trd_cur_exc_com_paid.equalsIgnoreCase(name)) {
			trd_cur_exc_com_paid(value);
			return;
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_tgt_amt(value);
			return;
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_schd_amt(value);
			return;
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_act_amt(value);
			return;
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			trd_cur_not_proc_bal(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			base_cur_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			base_cur_exc_com_paid(value);
			return;
		}
		if ($base_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_tgt_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			pay_act_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
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
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			pay_ntc_adv_pay_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			adv_pay_act_no(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
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
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			pay_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($pay_usr_cd.equalsIgnoreCase(name)) {
			pay_usr_cd(value);
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
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			ap_sttl_cd(value);
			return;
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			ap_sttl_typ(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($com_paid_ap_sttl_cd.equalsIgnoreCase(name)) {
			com_paid_ap_sttl_cd(value);
			return;
		}
		if ($com_paid_ap_sttl_typ.equalsIgnoreCase(name)) {
			com_paid_ap_sttl_typ(value);
			return;
		}
		if ($com_paid_ac_rsn_cd.equalsIgnoreCase(name)) {
			com_paid_ac_rsn_cd(value);
			return;
		}
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_cd(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			pay_chk_mng_no(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			adv_pay_act_rev(value);
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
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($trd_cur_exc_com_paid.equalsIgnoreCase(name)) {
			trd_cur_exc_com_paid(value);
			return;
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_tgt_amt(value);
			return;
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_schd_amt(value);
			return;
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_act_amt(value);
			return;
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			trd_cur_not_proc_bal(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			base_cur_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			base_cur_exc_com_paid(value);
			return;
		}
		if ($base_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_tgt_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			adv_pay_act_rev(value);
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
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($trd_cur_exc_com_paid.equalsIgnoreCase(name)) {
			trd_cur_exc_com_paid(value);
			return;
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_tgt_amt(value);
			return;
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_schd_amt(value);
			return;
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_act_amt(value);
			return;
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			trd_cur_not_proc_bal(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			base_cur_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			base_cur_exc_com_paid(value);
			return;
		}
		if ($base_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_tgt_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			adv_pay_act_rev(value);
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
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($trd_cur_exc_com_paid.equalsIgnoreCase(name)) {
			trd_cur_exc_com_paid(value);
			return;
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_tgt_amt(value);
			return;
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_schd_amt(value);
			return;
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_act_amt(value);
			return;
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			trd_cur_not_proc_bal(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			base_cur_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			base_cur_exc_com_paid(value);
			return;
		}
		if ($base_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_tgt_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			adv_pay_act_rev(value);
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
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($trd_cur_exc_com_paid.equalsIgnoreCase(name)) {
			trd_cur_exc_com_paid(value);
			return;
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_tgt_amt(value);
			return;
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_schd_amt(value);
			return;
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_act_amt(value);
			return;
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			trd_cur_not_proc_bal(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			base_cur_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			base_cur_exc_com_paid(value);
			return;
		}
		if ($base_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_tgt_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			adv_pay_act_rev(value);
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
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($trd_cur_exc_com_paid.equalsIgnoreCase(name)) {
			trd_cur_exc_com_paid(value);
			return;
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_tgt_amt(value);
			return;
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_schd_amt(value);
			return;
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_act_amt(value);
			return;
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			trd_cur_not_proc_bal(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid.equalsIgnoreCase(name)) {
			base_cur_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			base_cur_exc_com_paid(value);
			return;
		}
		if ($base_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_tgt_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			pay_act_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
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
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			pay_ntc_adv_pay_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
