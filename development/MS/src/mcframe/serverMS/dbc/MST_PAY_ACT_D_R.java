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
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCTimestampPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "支払実績明細 // Payment result details"DBコンテナRowクラスです。<p>
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
 *  	<td>pay_act_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払実績明細ＮＯ</td>
 *  	<td>Payment result details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>pay_act_d_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払実績明細連番</td>
 *  	<td>Payment result details sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払実績ＮＯ</td>
 *  	<td>Payment result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_act_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払実績連番</td>
 *  	<td>Payment result sequence No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>disp_seq</td>
 *  	<td>N</td>
 *  	<td>5,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>表示順</td>
 *  	<td>Display order</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ap_appl_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>買掛消込予定ＮＯ</td>
 *  	<td>AP reconciliation schedule No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定ＮＯ</td>
 *  	<td>Payment schedule No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_chk_mng_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払照合管理ＮＯ</td>
 *  	<td>Payment collation management No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_chk_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払照合ＮＯ</td>
 *  	<td>Payment collation No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>calc_tgt_pay_chk_mng_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計算対象支払照合管理ＮＯ</td>
 *  	<td>(Calculation) Payment collation management No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ap_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>買掛明細ＮＯ</td>
 *  	<td>AP details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ap_sttl_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債務決済方法ＣＤ</td>
 *  	<td>AP settlement method cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ap_sttl_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債務決済区分</td>
 *  	<td>AP settlement type</td>
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
 *  	<td>bank_ac_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>口座ＣＤ</td>
 *  	<td>Bank account cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_bank_ac_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払先口座ＣＤ</td>
 *  	<td>Payee account cd.</td>
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
 *  	<td>ap_setoff_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>相殺先区分</td>
 *  	<td>Offset destination type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>setoff_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>相殺先ＣＤ</td>
 *  	<td>Offset destination cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>setoff_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>相殺先名</td>
 *  	<td>Offset destination name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>so_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>相殺部門ＣＤ</td>
 *  	<td>Offset dept. cd.</td>
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
 *  	<td>trd_cur_com_paid_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨手数料税額</td>
 *  	<td>Fee tax amount (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_exc_com_paid</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨手数料税抜額</td>
 *  	<td>Fee amount without tax (Transaction currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨金額</td>
 *  	<td>Amount (Base currency)</td>
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
 *  	<td>rcv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金ＮＯ</td>
 *  	<td>Payment received No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>adv_pay_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前渡金支払実績ＮＯ</td>
 *  	<td>Advance payment amount payment result No.</td>
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
 *  	<td>asppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>買掛先ＣＤ</td>
 *  	<td>AP supplier cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ap_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債務部門ＣＤ</td>
 *  	<td>AP dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入実績ＮＯ</td>
 *  	<td>Purchase result No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcpt_iv_mng_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受領インボイス管理ＮＯ</td>
 *  	<td>Purchase invoice management No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcpt_iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受領インボイスＮＯ</td>
 *  	<td>Purchase invoice No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wrk_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>案件ＮＯ</td>
 *  	<td>Sales project No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ap_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債務区分</td>
 *  	<td>AP type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_ntc_d_print_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払通知書明細備考</td>
 *  	<td>Payment notice details remarks</td>
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
 *  	<td>intr_d_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内部明細備考</td>
 *  	<td>Internal details remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_pay_act_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親支払実績明細ＮＯ</td>
 *  	<td>Parent payment result details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_pay_act_d_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親支払実績明細連番</td>
 *  	<td>Parent payment result details sequence number</td>
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
public class MST_PAY_ACT_D_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_PAY_ACT_D";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 支払実績明細ＮＯ. Payment result details No..<p>
	 *
	 */
	public static final String $pay_act_d_no = "pay_act_d_no";
	private static final MCPermColumnInfo _pay_act_d_no = createColumnInfo("pay_act_d_no");
	public final MCStringPermColumn pay_act_d_no = createStringColumn(_pay_act_d_no);
	
	/**
	 * 支払実績明細連番. Payment result details sequence number.<p>
	 *
	 */
	public static final String $pay_act_d_seq = "pay_act_d_seq";
	private static final MCPermColumnInfo _pay_act_d_seq = createColumnInfo("pay_act_d_seq");
	public final MCNumberPermColumn pay_act_d_seq = createNumberColumn(_pay_act_d_seq);
	
	/**
	 * 支払実績ＮＯ. Payment result No..<p>
	 *
	 */
	public static final String $pay_act_no = "pay_act_no";
	private static final MCPermColumnInfo _pay_act_no = createColumnInfo("pay_act_no");
	public final MCStringPermColumn pay_act_no = createStringColumn(_pay_act_no);
	
	/**
	 * 支払実績連番. Payment result sequence No..<p>
	 *
	 */
	public static final String $pay_act_seq = "pay_act_seq";
	private static final MCPermColumnInfo _pay_act_seq = createColumnInfo("pay_act_seq");
	public final MCNumberPermColumn pay_act_seq = createNumberColumn(_pay_act_seq);
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	private static final MCPermColumnInfo _disp_seq = createColumnInfo("disp_seq");
	public final MCNumberPermColumn disp_seq = createNumberColumn(_disp_seq);
	
	/**
	 * 買掛消込予定ＮＯ. AP reconciliation schedule No..<p>
	 *
	 */
	public static final String $ap_appl_schd_no = "ap_appl_schd_no";
	private static final MCPermColumnInfo _ap_appl_schd_no = createColumnInfo("ap_appl_schd_no");
	public final MCStringPermColumn ap_appl_schd_no = createStringColumn(_ap_appl_schd_no);
	
	/**
	 * 支払予定ＮＯ. Payment schedule No..<p>
	 *
	 */
	public static final String $pay_schd_no = "pay_schd_no";
	private static final MCPermColumnInfo _pay_schd_no = createColumnInfo("pay_schd_no");
	public final MCStringPermColumn pay_schd_no = createStringColumn(_pay_schd_no);
	
	/**
	 * 支払照合管理ＮＯ. Payment collation management No..<p>
	 *
	 */
	public static final String $pay_chk_mng_no = "pay_chk_mng_no";
	private static final MCPermColumnInfo _pay_chk_mng_no = createColumnInfo("pay_chk_mng_no");
	public final MCStringPermColumn pay_chk_mng_no = createStringColumn(_pay_chk_mng_no);
	
	/**
	 * 支払照合ＮＯ. Payment collation No..<p>
	 *
	 */
	public static final String $pay_chk_no = "pay_chk_no";
	private static final MCPermColumnInfo _pay_chk_no = createColumnInfo("pay_chk_no");
	public final MCStringPermColumn pay_chk_no = createStringColumn(_pay_chk_no);
	
	/**
	 * 計算対象支払照合管理ＮＯ. (Calculation) Payment collation management No..<p>
	 *
	 */
	public static final String $calc_tgt_pay_chk_mng_no = "calc_tgt_pay_chk_mng_no";
	private static final MCPermColumnInfo _calc_tgt_pay_chk_mng_no = createColumnInfo("calc_tgt_pay_chk_mng_no");
	public final MCStringPermColumn calc_tgt_pay_chk_mng_no = createStringColumn(_calc_tgt_pay_chk_mng_no);
	
	/**
	 * 買掛明細ＮＯ. AP details No..<p>
	 *
	 */
	public static final String $ap_d_no = "ap_d_no";
	private static final MCPermColumnInfo _ap_d_no = createColumnInfo("ap_d_no");
	public final MCStringPermColumn ap_d_no = createStringColumn(_ap_d_no);
	
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
	 * 手数料税ＣＤ. Fee tax cd..<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_cd = "trd_cur_com_paid_tax_cd";
	private static final MCPermColumnInfo _trd_cur_com_paid_tax_cd = createColumnInfo("trd_cur_com_paid_tax_cd");
	public final MCStringPermColumn trd_cur_com_paid_tax_cd = createStringColumn(_trd_cur_com_paid_tax_cd);
	
	/**
	 * 相殺先区分. Offset destination type.<p>
	 *
	 */
	public static final String $ap_setoff_typ = "ap_setoff_typ";
	private static final MCPermColumnInfo _ap_setoff_typ = createColumnInfo("ap_setoff_typ");
	public final MCStringPermColumn ap_setoff_typ = createStringColumn(_ap_setoff_typ);
	
	/**
	 * 相殺先ＣＤ. Offset destination cd..<p>
	 *
	 */
	public static final String $setoff_cd = "setoff_cd";
	private static final MCPermColumnInfo _setoff_cd = createColumnInfo("setoff_cd");
	public final MCStringPermColumn setoff_cd = createStringColumn(_setoff_cd);
	
	/**
	 * 相殺先名. Offset destination name.<p>
	 *
	 */
	public static final String $setoff_nm = "setoff_nm";
	private static final MCPermColumnInfo _setoff_nm = createColumnInfo("setoff_nm");
	public final MCStringPermColumn setoff_nm = createStringColumn(_setoff_nm);
	
	/**
	 * 相殺部門ＣＤ. Offset dept. cd..<p>
	 *
	 */
	public static final String $so_dpt_cd = "so_dpt_cd";
	private static final MCPermColumnInfo _so_dpt_cd = createColumnInfo("so_dpt_cd");
	public final MCStringPermColumn so_dpt_cd = createStringColumn(_so_dpt_cd);
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	private static final MCPermColumnInfo _trd_cur_amt = createColumnInfo("trd_cur_amt");
	public final MCNumberPermColumn trd_cur_amt = createNumberColumn(_trd_cur_amt);
	
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
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	private static final MCPermColumnInfo _base_cur_amt = createColumnInfo("base_cur_amt");
	public final MCNumberPermColumn base_cur_amt = createNumberColumn(_base_cur_amt);
	
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
	 * 入金ＮＯ. Payment received No..<p>
	 *
	 */
	public static final String $rcv_no = "rcv_no";
	private static final MCPermColumnInfo _rcv_no = createColumnInfo("rcv_no");
	public final MCStringPermColumn rcv_no = createStringColumn(_rcv_no);
	
	/**
	 * 前渡金支払実績ＮＯ. Advance payment amount payment result No..<p>
	 *
	 */
	public static final String $adv_pay_act_no = "adv_pay_act_no";
	private static final MCPermColumnInfo _adv_pay_act_no = createColumnInfo("adv_pay_act_no");
	public final MCStringPermColumn adv_pay_act_no = createStringColumn(_adv_pay_act_no);
	
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
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	private static final MCPermColumnInfo _asppl_cd = createColumnInfo("asppl_cd");
	public final MCStringPermColumn asppl_cd = createStringColumn(_asppl_cd);
	
	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	private static final MCPermColumnInfo _ap_dpt_cd = createColumnInfo("ap_dpt_cd");
	public final MCStringPermColumn ap_dpt_cd = createStringColumn(_ap_dpt_cd);
	
	/**
	 * 仕入実績ＮＯ. Purchase result No..<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	private static final MCPermColumnInfo _purc_act_no = createColumnInfo("purc_act_no");
	public final MCStringPermColumn purc_act_no = createStringColumn(_purc_act_no);
	
	/**
	 * 受領インボイス管理ＮＯ. Purchase invoice management No..<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	private static final MCPermColumnInfo _rcpt_iv_mng_no = createColumnInfo("rcpt_iv_mng_no");
	public final MCStringPermColumn rcpt_iv_mng_no = createStringColumn(_rcpt_iv_mng_no);
	
	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	private static final MCPermColumnInfo _rcpt_iv_no = createColumnInfo("rcpt_iv_no");
	public final MCStringPermColumn rcpt_iv_no = createStringColumn(_rcpt_iv_no);
	
	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	private static final MCPermColumnInfo _wrk_no = createColumnInfo("wrk_no");
	public final MCStringPermColumn wrk_no = createStringColumn(_wrk_no);
	
	/**
	 * 債務区分. AP type.<p>
	 *
	 */
	public static final String $ap_typ = "ap_typ";
	private static final MCPermColumnInfo _ap_typ = createColumnInfo("ap_typ");
	public final MCStringPermColumn ap_typ = createStringColumn(_ap_typ);
	
	/**
	 * 支払通知書明細備考. Payment notice details remarks.<p>
	 *
	 */
	public static final String $pay_ntc_d_print_rmrks = "pay_ntc_d_print_rmrks";
	private static final MCPermColumnInfo _pay_ntc_d_print_rmrks = createColumnInfo("pay_ntc_d_print_rmrks");
	public final MCStringPermColumn pay_ntc_d_print_rmrks = createStringColumn(_pay_ntc_d_print_rmrks);
	
	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	private static final MCPermColumnInfo _trd_d_rmrks = createColumnInfo("trd_d_rmrks");
	public final MCStringPermColumn trd_d_rmrks = createStringColumn(_trd_d_rmrks);
	
	/**
	 * 内部明細備考. Internal details remarks.<p>
	 *
	 */
	public static final String $intr_d_rmrks = "intr_d_rmrks";
	private static final MCPermColumnInfo _intr_d_rmrks = createColumnInfo("intr_d_rmrks");
	public final MCStringPermColumn intr_d_rmrks = createStringColumn(_intr_d_rmrks);
	
	/**
	 * 親支払実績明細ＮＯ. Parent payment result details No..<p>
	 *
	 */
	public static final String $par_pay_act_d_no = "par_pay_act_d_no";
	private static final MCPermColumnInfo _par_pay_act_d_no = createColumnInfo("par_pay_act_d_no");
	public final MCStringPermColumn par_pay_act_d_no = createStringColumn(_par_pay_act_d_no);
	
	/**
	 * 親支払実績明細連番. Parent payment result details sequence number.<p>
	 *
	 */
	public static final String $par_pay_act_d_seq = "par_pay_act_d_seq";
	private static final MCPermColumnInfo _par_pay_act_d_seq = createColumnInfo("par_pay_act_d_seq");
	public final MCNumberPermColumn par_pay_act_d_seq = createNumberColumn(_par_pay_act_d_seq);
	
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
	
	public static final MCMeta pay_act_d_no_META = createCommonMeta($pay_act_d_no, mcframe.commonMA.meta.MA_META.PAY_ACT_D_NO);
	public static final MCMeta pay_act_d_seq_META = createCommonMeta($pay_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta pay_act_no_META = createCommonMeta($pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta pay_act_seq_META = createCommonMeta($pay_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta ap_appl_schd_no_META = createCommonMeta($ap_appl_schd_no, mcframe.commonMA.meta.MA_META.AP_APPL_SCHD_NO);
	public static final MCMeta pay_schd_no_META = createCommonMeta($pay_schd_no, mcframe.commonMA.meta.MA_META.PAY_SCHD_NO);
	public static final MCMeta pay_chk_mng_no_META = createCommonMeta($pay_chk_mng_no, mcframe.commonMA.meta.MA_META.PAY_CHK_MNG_NO);
	public static final MCMeta pay_chk_no_META = createCommonMeta($pay_chk_no, mcframe.commonMA.meta.MA_META.PAY_CHK_NO);
	public static final MCMeta calc_tgt_pay_chk_mng_no_META = createCommonMeta($calc_tgt_pay_chk_mng_no, mcframe.commonMA.meta.MA_META.PAY_CHK_MNG_NO);
	public static final MCMeta ap_d_no_META = createCommonMeta($ap_d_no, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta ap_sttl_cd_META = createCommonMeta($ap_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ap_sttl_typ_META = createCommonMeta($ap_sttl_typ, mcframe.commonMA.meta.MA_META.AP_STTL_TYP);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta pay_bank_ac_cd_META = createCommonMeta($pay_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta trd_cur_com_paid_tax_cd_META = createCommonMeta($trd_cur_com_paid_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta ap_setoff_typ_META = createCommonMeta($ap_setoff_typ, mcframe.commonMA.meta.MA_META.AP_SETOFF_TYP);
	public static final MCMeta setoff_cd_META = createCommonMeta($setoff_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta setoff_nm_META = createCommonMeta($setoff_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta so_dpt_cd_META = createCommonMeta($so_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_com_paid_tax_amt_META = createCommonMeta($trd_cur_com_paid_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_exc_com_paid_META = createCommonMeta($trd_cur_exc_com_paid, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_com_paid_tax_amt_META = createCommonMeta($base_cur_com_paid_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_exc_com_paid_META = createCommonMeta($base_cur_exc_com_paid, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_no_META = createCommonMeta($rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta adv_pay_act_no_META = createCommonMeta($adv_pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta ap_typ_META = createCommonMeta($ap_typ, mcframe.commonMA.meta.MA_META.AP_TYP);
	public static final MCMeta pay_ntc_d_print_rmrks_META = createCommonMeta($pay_ntc_d_print_rmrks, mcframe.commonMS.meta.MS_META.PAY_NTC_D_PRINT_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_d_rmrks_META = createCommonMeta($intr_d_rmrks, mcframe.commonMS.meta.MS_META.PAY_ACT_D_INTR_RMRKS);
	public static final MCMeta par_pay_act_d_no_META = createCommonMeta($par_pay_act_d_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta par_pay_act_d_seq_META = createCommonMeta($par_pay_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PAY_ACT_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PAY_ACT_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PAY_ACT_D_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_PAY_ACT_D_R> constMetas = new ConstMetaList<MST_PAY_ACT_D_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			pay_act_d_no_META,
			pay_act_d_seq_META,
			pay_act_no_META,
			pay_act_seq_META,
			disp_seq_META,
			ap_appl_schd_no_META,
			pay_schd_no_META,
			pay_chk_mng_no_META,
			pay_chk_no_META,
			calc_tgt_pay_chk_mng_no_META,
			ap_d_no_META,
			ap_sttl_cd_META,
			ap_sttl_typ_META,
			ac_rsn_cd_META,
			bank_ac_cd_META,
			pay_bank_ac_cd_META,
			trd_cur_com_paid_tax_cd_META,
			ap_setoff_typ_META,
			setoff_cd_META,
			setoff_nm_META,
			so_dpt_cd_META,
			trd_cur_amt_META,
			trd_cur_com_paid_tax_amt_META,
			trd_cur_exc_com_paid_META,
			base_cur_amt_META,
			base_cur_com_paid_tax_amt_META,
			base_cur_exc_com_paid_META,
			rcv_no_META,
			adv_pay_act_no_META,
			bsppl_cd_META,
			bsppl_dpt_cd_META,
			asppl_cd_META,
			ap_dpt_cd_META,
			purc_act_no_META,
			rcpt_iv_mng_no_META,
			rcpt_iv_no_META,
			wrk_no_META,
			ap_typ_META,
			pay_ntc_d_print_rmrks_META,
			trd_d_rmrks_META,
			intr_d_rmrks_META,
			par_pay_act_d_no_META,
			par_pay_act_d_seq_META,
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
	protected MST_PAY_ACT_D_R(ConstMetaList<? extends MST_PAY_ACT_D_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_PAY_ACT_D_R(ConstMetaList<? extends MST_PAY_ACT_D_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$pay_act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$pay_act_d_no,
				"pay_act_d_no",
				pay_act_d_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$pay_act_d_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_ACT_D_R.$pay_act_d_seq,
				"pay_act_d_seq",
				pay_act_d_seq,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$pay_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$pay_act_no,
				"pay_act_no",
				pay_act_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$pay_act_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_ACT_D_R.$pay_act_seq,
				"pay_act_seq",
				pay_act_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$disp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_ACT_D_R.$disp_seq,
				"disp_seq",
				disp_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$ap_appl_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$ap_appl_schd_no,
				"ap_appl_schd_no",
				ap_appl_schd_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$pay_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$pay_schd_no,
				"pay_schd_no",
				pay_schd_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$pay_chk_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$pay_chk_mng_no,
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
			MST_PAY_ACT_D_R.$pay_chk_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$pay_chk_no,
				"pay_chk_no",
				pay_chk_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$calc_tgt_pay_chk_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$calc_tgt_pay_chk_mng_no,
				"calc_tgt_pay_chk_mng_no",
				calc_tgt_pay_chk_mng_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$ap_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$ap_d_no,
				"ap_d_no",
				ap_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$ap_sttl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$ap_sttl_cd,
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
			MST_PAY_ACT_D_R.$ap_sttl_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$ap_sttl_typ,
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
			MST_PAY_ACT_D_R.$ac_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$ac_rsn_cd,
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
			MST_PAY_ACT_D_R.$bank_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$bank_ac_cd,
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
			MST_PAY_ACT_D_R.$pay_bank_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$pay_bank_ac_cd,
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
			MST_PAY_ACT_D_R.$trd_cur_com_paid_tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$trd_cur_com_paid_tax_cd,
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
			MST_PAY_ACT_D_R.$ap_setoff_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$ap_setoff_typ,
				"ap_setoff_typ",
				ap_setoff_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$setoff_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$setoff_cd,
				"setoff_cd",
				setoff_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$setoff_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$setoff_nm,
				"setoff_nm",
				setoff_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$so_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$so_dpt_cd,
				"so_dpt_cd",
				so_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$trd_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_ACT_D_R.$trd_cur_amt,
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
			MST_PAY_ACT_D_R.$trd_cur_com_paid_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_ACT_D_R.$trd_cur_com_paid_tax_amt,
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
			MST_PAY_ACT_D_R.$trd_cur_exc_com_paid,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_ACT_D_R.$trd_cur_exc_com_paid,
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
			MST_PAY_ACT_D_R.$base_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_ACT_D_R.$base_cur_amt,
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
			MST_PAY_ACT_D_R.$base_cur_com_paid_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_ACT_D_R.$base_cur_com_paid_tax_amt,
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
			MST_PAY_ACT_D_R.$base_cur_exc_com_paid,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_ACT_D_R.$base_cur_exc_com_paid,
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
			MST_PAY_ACT_D_R.$rcv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$rcv_no,
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
			MST_PAY_ACT_D_R.$adv_pay_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$adv_pay_act_no,
				"adv_pay_act_no",
				adv_pay_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$bsppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$bsppl_cd,
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
			MST_PAY_ACT_D_R.$bsppl_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$bsppl_dpt_cd,
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
			MST_PAY_ACT_D_R.$asppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$asppl_cd,
				"asppl_cd",
				asppl_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$ap_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$ap_dpt_cd,
				"ap_dpt_cd",
				ap_dpt_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$purc_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$purc_act_no,
				"purc_act_no",
				purc_act_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$rcpt_iv_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$rcpt_iv_mng_no,
				"rcpt_iv_mng_no",
				rcpt_iv_mng_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$rcpt_iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$rcpt_iv_no,
				"rcpt_iv_no",
				rcpt_iv_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$wrk_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$wrk_no,
				"wrk_no",
				wrk_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$ap_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$ap_typ,
				"ap_typ",
				ap_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$pay_ntc_d_print_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$pay_ntc_d_print_rmrks,
				"pay_ntc_d_print_rmrks",
				pay_ntc_d_print_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$trd_d_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$trd_d_rmrks,
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
			MST_PAY_ACT_D_R.$intr_d_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$intr_d_rmrks,
				"intr_d_rmrks",
				intr_d_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$par_pay_act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$par_pay_act_d_no,
				"par_pay_act_d_no",
				par_pay_act_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$par_pay_act_d_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_ACT_D_R.$par_pay_act_d_seq,
				"par_pay_act_d_seq",
				par_pay_act_d_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_ACT_D_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$sub_char1,
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
			MST_PAY_ACT_D_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$sub_char2,
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
			MST_PAY_ACT_D_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$sub_char3,
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
			MST_PAY_ACT_D_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$ins_usr_id,
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
			MST_PAY_ACT_D_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$ins_usr_nm,
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
			MST_PAY_ACT_D_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PAY_ACT_D_R.$ins_ts,
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
			MST_PAY_ACT_D_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$ins_func_id,
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
			MST_PAY_ACT_D_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_ACT_D_R.$upd_cntr,
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
			MST_PAY_ACT_D_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$upd_usr_id,
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
			MST_PAY_ACT_D_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$upd_usr_nm,
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
			MST_PAY_ACT_D_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PAY_ACT_D_R.$upd_ts,
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
			MST_PAY_ACT_D_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$upd_func_id,
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
			MST_PAY_ACT_D_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_ACT_D_R.$upd_srv_req_no,
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
	public static MST_PAY_ACT_D_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_PAY_ACT_D_R create(String alias) {
		MST_PAY_ACT_D_R row = new MST_PAY_ACT_D_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_PAY_ACT_D_R createByName(T proto) {
		MST_PAY_ACT_D_R row = MST_PAY_ACT_D_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PAY_ACT_D_R clone() {
		return (MST_PAY_ACT_D_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PAY_ACT_D_R createInstance() {
		return (MST_PAY_ACT_D_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PAY_ACT_D_R getValues(String... names) {
		return (MST_PAY_ACT_D_R) super.getValues(names);
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
	 public MSW_PAY_ACT_D_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_PAY_ACT_D_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_PAY_ACT_D_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_PAY_ACT_D_KEY_R.TABLE_NAME);
	 }

	/**
	 * 支払実績明細ＮＯ. Payment result details No..<p>
	 *
	 */
	public String pay_act_d_no() {
		return getConstString(offset + 0, $pay_act_d_no);
	}

	/**
	 * 支払実績明細ＮＯ. Payment result details No..<p>
	 *
	 */
	public void pay_act_d_no(String value) {
		setConstString(offset + 0, $pay_act_d_no, value);
	}

	/**
	 * 支払実績明細連番. Payment result details sequence number.<p>
	 *
	 */
	public MCNumber pay_act_d_seq() {
		return getConstNumber(offset + 1, $pay_act_d_seq);
	}

	/**
	 * 支払実績明細連番. Payment result details sequence number.<p>
	 *
	 */
	public void pay_act_d_seq(MCNumber value) {
		setConstNumber(offset + 1, $pay_act_d_seq, value);
	}
	
	/**
	 * 支払実績明細連番. Payment result details sequence number.<p>
	 *
	 */
	public void pay_act_d_seq(int value) {
		setConstNumber(offset + 1, $pay_act_d_seq, value);
	}
	
	/**
	 * 支払実績明細連番. Payment result details sequence number.<p>
	 *
	 */
	public void pay_act_d_seq(long value) {
		setConstNumber(offset + 1, $pay_act_d_seq, value);
	}
	
	/**
	 * 支払実績明細連番. Payment result details sequence number.<p>
	 *
	 */
	public void pay_act_d_seq(float value) {
		setConstNumber(offset + 1, $pay_act_d_seq, value);
	}
	
	/**
	 * 支払実績明細連番. Payment result details sequence number.<p>
	 *
	 */
	public void pay_act_d_seq(double value) {
		setConstNumber(offset + 1, $pay_act_d_seq, value);
	}
	
	/**
	 * 支払実績ＮＯ. Payment result No..<p>
	 *
	 */
	public String pay_act_no() {
		return getConstString(offset + 2, $pay_act_no);
	}

	/**
	 * 支払実績ＮＯ. Payment result No..<p>
	 *
	 */
	public void pay_act_no(String value) {
		setConstString(offset + 2, $pay_act_no, value);
	}

	/**
	 * 支払実績連番. Payment result sequence No..<p>
	 *
	 */
	public MCNumber pay_act_seq() {
		return getConstNumber(offset + 3, $pay_act_seq);
	}

	/**
	 * 支払実績連番. Payment result sequence No..<p>
	 *
	 */
	public void pay_act_seq(MCNumber value) {
		setConstNumber(offset + 3, $pay_act_seq, value);
	}
	
	/**
	 * 支払実績連番. Payment result sequence No..<p>
	 *
	 */
	public void pay_act_seq(int value) {
		setConstNumber(offset + 3, $pay_act_seq, value);
	}
	
	/**
	 * 支払実績連番. Payment result sequence No..<p>
	 *
	 */
	public void pay_act_seq(long value) {
		setConstNumber(offset + 3, $pay_act_seq, value);
	}
	
	/**
	 * 支払実績連番. Payment result sequence No..<p>
	 *
	 */
	public void pay_act_seq(float value) {
		setConstNumber(offset + 3, $pay_act_seq, value);
	}
	
	/**
	 * 支払実績連番. Payment result sequence No..<p>
	 *
	 */
	public void pay_act_seq(double value) {
		setConstNumber(offset + 3, $pay_act_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 4, $disp_seq);
	}

	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 4, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 4, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 4, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 4, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 4, $disp_seq, value);
	}
	
	/**
	 * 買掛消込予定ＮＯ. AP reconciliation schedule No..<p>
	 *
	 */
	public String ap_appl_schd_no() {
		return getConstString(offset + 5, $ap_appl_schd_no);
	}

	/**
	 * 買掛消込予定ＮＯ. AP reconciliation schedule No..<p>
	 *
	 */
	public void ap_appl_schd_no(String value) {
		setConstString(offset + 5, $ap_appl_schd_no, value);
	}

	/**
	 * 支払予定ＮＯ. Payment schedule No..<p>
	 *
	 */
	public String pay_schd_no() {
		return getConstString(offset + 6, $pay_schd_no);
	}

	/**
	 * 支払予定ＮＯ. Payment schedule No..<p>
	 *
	 */
	public void pay_schd_no(String value) {
		setConstString(offset + 6, $pay_schd_no, value);
	}

	/**
	 * 支払照合管理ＮＯ. Payment collation management No..<p>
	 *
	 */
	public String pay_chk_mng_no() {
		return getConstString(offset + 7, $pay_chk_mng_no);
	}

	/**
	 * 支払照合管理ＮＯ. Payment collation management No..<p>
	 *
	 */
	public void pay_chk_mng_no(String value) {
		setConstString(offset + 7, $pay_chk_mng_no, value);
	}

	/**
	 * 支払照合ＮＯ. Payment collation No..<p>
	 *
	 */
	public String pay_chk_no() {
		return getConstString(offset + 8, $pay_chk_no);
	}

	/**
	 * 支払照合ＮＯ. Payment collation No..<p>
	 *
	 */
	public void pay_chk_no(String value) {
		setConstString(offset + 8, $pay_chk_no, value);
	}

	/**
	 * 計算対象支払照合管理ＮＯ. (Calculation) Payment collation management No..<p>
	 *
	 */
	public String calc_tgt_pay_chk_mng_no() {
		return getConstString(offset + 9, $calc_tgt_pay_chk_mng_no);
	}

	/**
	 * 計算対象支払照合管理ＮＯ. (Calculation) Payment collation management No..<p>
	 *
	 */
	public void calc_tgt_pay_chk_mng_no(String value) {
		setConstString(offset + 9, $calc_tgt_pay_chk_mng_no, value);
	}

	/**
	 * 買掛明細ＮＯ. AP details No..<p>
	 *
	 */
	public String ap_d_no() {
		return getConstString(offset + 10, $ap_d_no);
	}

	/**
	 * 買掛明細ＮＯ. AP details No..<p>
	 *
	 */
	public void ap_d_no(String value) {
		setConstString(offset + 10, $ap_d_no, value);
	}

	/**
	 * 債務決済方法ＣＤ. AP settlement method cd..<p>
	 *
	 */
	public String ap_sttl_cd() {
		return getConstString(offset + 11, $ap_sttl_cd);
	}

	/**
	 * 債務決済方法ＣＤ. AP settlement method cd..<p>
	 *
	 */
	public void ap_sttl_cd(String value) {
		setConstString(offset + 11, $ap_sttl_cd, value);
	}

	/**
	 * 債務決済区分. AP settlement type.<p>
	 *
	 */
	public String ap_sttl_typ() {
		return getConstString(offset + 12, $ap_sttl_typ);
	}

	/**
	 * 債務決済区分. AP settlement type.<p>
	 *
	 */
	public void ap_sttl_typ(String value) {
		setConstString(offset + 12, $ap_sttl_typ, value);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 13, $ac_rsn_cd);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 13, $ac_rsn_cd, value);
	}

	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 14, $bank_ac_cd);
	}

	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 14, $bank_ac_cd, value);
	}

	/**
	 * 支払先口座ＣＤ. Payee account cd..<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return getConstString(offset + 15, $pay_bank_ac_cd);
	}

	/**
	 * 支払先口座ＣＤ. Payee account cd..<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		setConstString(offset + 15, $pay_bank_ac_cd, value);
	}

	/**
	 * 手数料税ＣＤ. Fee tax cd..<p>
	 *
	 */
	public String trd_cur_com_paid_tax_cd() {
		return getConstString(offset + 16, $trd_cur_com_paid_tax_cd);
	}

	/**
	 * 手数料税ＣＤ. Fee tax cd..<p>
	 *
	 */
	public void trd_cur_com_paid_tax_cd(String value) {
		setConstString(offset + 16, $trd_cur_com_paid_tax_cd, value);
	}

	/**
	 * 相殺先区分. Offset destination type.<p>
	 *
	 */
	public String ap_setoff_typ() {
		return getConstString(offset + 17, $ap_setoff_typ);
	}

	/**
	 * 相殺先区分. Offset destination type.<p>
	 *
	 */
	public void ap_setoff_typ(String value) {
		setConstString(offset + 17, $ap_setoff_typ, value);
	}

	/**
	 * 相殺先ＣＤ. Offset destination cd..<p>
	 *
	 */
	public String setoff_cd() {
		return getConstString(offset + 18, $setoff_cd);
	}

	/**
	 * 相殺先ＣＤ. Offset destination cd..<p>
	 *
	 */
	public void setoff_cd(String value) {
		setConstString(offset + 18, $setoff_cd, value);
	}

	/**
	 * 相殺先名. Offset destination name.<p>
	 *
	 */
	public String setoff_nm() {
		return getConstString(offset + 19, $setoff_nm);
	}

	/**
	 * 相殺先名. Offset destination name.<p>
	 *
	 */
	public void setoff_nm(String value) {
		setConstString(offset + 19, $setoff_nm, value);
	}

	/**
	 * 相殺部門ＣＤ. Offset dept. cd..<p>
	 *
	 */
	public String so_dpt_cd() {
		return getConstString(offset + 20, $so_dpt_cd);
	}

	/**
	 * 相殺部門ＣＤ. Offset dept. cd..<p>
	 *
	 */
	public void so_dpt_cd(String value) {
		setConstString(offset + 20, $so_dpt_cd, value);
	}

	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 21, $trd_cur_amt);
	}

	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 21, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 21, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 21, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 21, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 21, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨手数料税額. Fee tax amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_com_paid_tax_amt() {
		return getConstNumber(offset + 22, $trd_cur_com_paid_tax_amt);
	}

	/**
	 * 取引通貨手数料税額. Fee tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(MCNumber value) {
		setConstNumber(offset + 22, $trd_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 取引通貨手数料税額. Fee tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(int value) {
		setConstNumber(offset + 22, $trd_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 取引通貨手数料税額. Fee tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(long value) {
		setConstNumber(offset + 22, $trd_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 取引通貨手数料税額. Fee tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(float value) {
		setConstNumber(offset + 22, $trd_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 取引通貨手数料税額. Fee tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(double value) {
		setConstNumber(offset + 22, $trd_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 取引通貨手数料税抜額. Fee amount without tax (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_exc_com_paid() {
		return getConstNumber(offset + 23, $trd_cur_exc_com_paid);
	}

	/**
	 * 取引通貨手数料税抜額. Fee amount without tax (Transaction currency).<p>
	 *
	 */
	public void trd_cur_exc_com_paid(MCNumber value) {
		setConstNumber(offset + 23, $trd_cur_exc_com_paid, value);
	}
	
	/**
	 * 取引通貨手数料税抜額. Fee amount without tax (Transaction currency).<p>
	 *
	 */
	public void trd_cur_exc_com_paid(int value) {
		setConstNumber(offset + 23, $trd_cur_exc_com_paid, value);
	}
	
	/**
	 * 取引通貨手数料税抜額. Fee amount without tax (Transaction currency).<p>
	 *
	 */
	public void trd_cur_exc_com_paid(long value) {
		setConstNumber(offset + 23, $trd_cur_exc_com_paid, value);
	}
	
	/**
	 * 取引通貨手数料税抜額. Fee amount without tax (Transaction currency).<p>
	 *
	 */
	public void trd_cur_exc_com_paid(float value) {
		setConstNumber(offset + 23, $trd_cur_exc_com_paid, value);
	}
	
	/**
	 * 取引通貨手数料税抜額. Fee amount without tax (Transaction currency).<p>
	 *
	 */
	public void trd_cur_exc_com_paid(double value) {
		setConstNumber(offset + 23, $trd_cur_exc_com_paid, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 24, $base_cur_amt);
	}

	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 24, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 24, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 24, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 24, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨金額. Amount (Base currency).<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 24, $base_cur_amt, value);
	}
	
	/**
	 * 基準通貨手数料税額. Fee tax amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_com_paid_tax_amt() {
		return getConstNumber(offset + 25, $base_cur_com_paid_tax_amt);
	}

	/**
	 * 基準通貨手数料税額. Fee tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(MCNumber value) {
		setConstNumber(offset + 25, $base_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 基準通貨手数料税額. Fee tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(int value) {
		setConstNumber(offset + 25, $base_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 基準通貨手数料税額. Fee tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(long value) {
		setConstNumber(offset + 25, $base_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 基準通貨手数料税額. Fee tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(float value) {
		setConstNumber(offset + 25, $base_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 基準通貨手数料税額. Fee tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(double value) {
		setConstNumber(offset + 25, $base_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 基準通貨手数料税抜額. Fee without tax (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_exc_com_paid() {
		return getConstNumber(offset + 26, $base_cur_exc_com_paid);
	}

	/**
	 * 基準通貨手数料税抜額. Fee without tax (Base currency).<p>
	 *
	 */
	public void base_cur_exc_com_paid(MCNumber value) {
		setConstNumber(offset + 26, $base_cur_exc_com_paid, value);
	}
	
	/**
	 * 基準通貨手数料税抜額. Fee without tax (Base currency).<p>
	 *
	 */
	public void base_cur_exc_com_paid(int value) {
		setConstNumber(offset + 26, $base_cur_exc_com_paid, value);
	}
	
	/**
	 * 基準通貨手数料税抜額. Fee without tax (Base currency).<p>
	 *
	 */
	public void base_cur_exc_com_paid(long value) {
		setConstNumber(offset + 26, $base_cur_exc_com_paid, value);
	}
	
	/**
	 * 基準通貨手数料税抜額. Fee without tax (Base currency).<p>
	 *
	 */
	public void base_cur_exc_com_paid(float value) {
		setConstNumber(offset + 26, $base_cur_exc_com_paid, value);
	}
	
	/**
	 * 基準通貨手数料税抜額. Fee without tax (Base currency).<p>
	 *
	 */
	public void base_cur_exc_com_paid(double value) {
		setConstNumber(offset + 26, $base_cur_exc_com_paid, value);
	}
	
	/**
	 * 入金ＮＯ. Payment received No..<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 27, $rcv_no);
	}

	/**
	 * 入金ＮＯ. Payment received No..<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 27, $rcv_no, value);
	}

	/**
	 * 前渡金支払実績ＮＯ. Advance payment amount payment result No..<p>
	 *
	 */
	public String adv_pay_act_no() {
		return getConstString(offset + 28, $adv_pay_act_no);
	}

	/**
	 * 前渡金支払実績ＮＯ. Advance payment amount payment result No..<p>
	 *
	 */
	public void adv_pay_act_no(String value) {
		setConstString(offset + 28, $adv_pay_act_no, value);
	}

	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 29, $bsppl_cd);
	}

	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 29, $bsppl_cd, value);
	}

	/**
	 * 支払予定管理先担当部門ＣＤ. Cd. of dept. in charge of scheduled payee.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 30, $bsppl_dpt_cd);
	}

	/**
	 * 支払予定管理先担当部門ＣＤ. Cd. of dept. in charge of scheduled payee.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 30, $bsppl_dpt_cd, value);
	}

	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 31, $asppl_cd);
	}

	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 31, $asppl_cd, value);
	}

	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 32, $ap_dpt_cd);
	}

	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 32, $ap_dpt_cd, value);
	}

	/**
	 * 仕入実績ＮＯ. Purchase result No..<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 33, $purc_act_no);
	}

	/**
	 * 仕入実績ＮＯ. Purchase result No..<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 33, $purc_act_no, value);
	}

	/**
	 * 受領インボイス管理ＮＯ. Purchase invoice management No..<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 34, $rcpt_iv_mng_no);
	}

	/**
	 * 受領インボイス管理ＮＯ. Purchase invoice management No..<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 34, $rcpt_iv_mng_no, value);
	}

	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 35, $rcpt_iv_no);
	}

	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 35, $rcpt_iv_no, value);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 36, $wrk_no);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 36, $wrk_no, value);
	}

	/**
	 * 債務区分. AP type.<p>
	 *
	 */
	public String ap_typ() {
		return getConstString(offset + 37, $ap_typ);
	}

	/**
	 * 債務区分. AP type.<p>
	 *
	 */
	public void ap_typ(String value) {
		setConstString(offset + 37, $ap_typ, value);
	}

	/**
	 * 支払通知書明細備考. Payment notice details remarks.<p>
	 *
	 */
	public String pay_ntc_d_print_rmrks() {
		return getConstString(offset + 38, $pay_ntc_d_print_rmrks);
	}

	/**
	 * 支払通知書明細備考. Payment notice details remarks.<p>
	 *
	 */
	public void pay_ntc_d_print_rmrks(String value) {
		setConstString(offset + 38, $pay_ntc_d_print_rmrks, value);
	}

	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 39, $trd_d_rmrks);
	}

	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 39, $trd_d_rmrks, value);
	}

	/**
	 * 内部明細備考. Internal details remarks.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 40, $intr_d_rmrks);
	}

	/**
	 * 内部明細備考. Internal details remarks.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 40, $intr_d_rmrks, value);
	}

	/**
	 * 親支払実績明細ＮＯ. Parent payment result details No..<p>
	 *
	 */
	public String par_pay_act_d_no() {
		return getConstString(offset + 41, $par_pay_act_d_no);
	}

	/**
	 * 親支払実績明細ＮＯ. Parent payment result details No..<p>
	 *
	 */
	public void par_pay_act_d_no(String value) {
		setConstString(offset + 41, $par_pay_act_d_no, value);
	}

	/**
	 * 親支払実績明細連番. Parent payment result details sequence number.<p>
	 *
	 */
	public MCNumber par_pay_act_d_seq() {
		return getConstNumber(offset + 42, $par_pay_act_d_seq);
	}

	/**
	 * 親支払実績明細連番. Parent payment result details sequence number.<p>
	 *
	 */
	public void par_pay_act_d_seq(MCNumber value) {
		setConstNumber(offset + 42, $par_pay_act_d_seq, value);
	}
	
	/**
	 * 親支払実績明細連番. Parent payment result details sequence number.<p>
	 *
	 */
	public void par_pay_act_d_seq(int value) {
		setConstNumber(offset + 42, $par_pay_act_d_seq, value);
	}
	
	/**
	 * 親支払実績明細連番. Parent payment result details sequence number.<p>
	 *
	 */
	public void par_pay_act_d_seq(long value) {
		setConstNumber(offset + 42, $par_pay_act_d_seq, value);
	}
	
	/**
	 * 親支払実績明細連番. Parent payment result details sequence number.<p>
	 *
	 */
	public void par_pay_act_d_seq(float value) {
		setConstNumber(offset + 42, $par_pay_act_d_seq, value);
	}
	
	/**
	 * 親支払実績明細連番. Parent payment result details sequence number.<p>
	 *
	 */
	public void par_pay_act_d_seq(double value) {
		setConstNumber(offset + 42, $par_pay_act_d_seq, value);
	}
	
	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 43, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 43, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 44, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 44, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 45, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 45, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 46, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 46, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 47, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 47, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 48, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 48, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 49, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 49, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 50, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 50, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 50, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 50, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 50, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 50, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 51, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 51, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 52, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 52, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 53, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 53, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 54, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 54, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 55, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 55, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			return pay_act_d_no();
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		if ($ap_appl_schd_no.equalsIgnoreCase(name)) {
			return ap_appl_schd_no();
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			return pay_schd_no();
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			return pay_chk_mng_no();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($calc_tgt_pay_chk_mng_no.equalsIgnoreCase(name)) {
			return calc_tgt_pay_chk_mng_no();
		}
		if ($ap_d_no.equalsIgnoreCase(name)) {
			return ap_d_no();
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
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_cd();
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			return ap_setoff_typ();
		}
		if ($setoff_cd.equalsIgnoreCase(name)) {
			return setoff_cd();
		}
		if ($setoff_nm.equalsIgnoreCase(name)) {
			return setoff_nm();
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			return so_dpt_cd();
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			return adv_pay_act_no();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_ntc_d_print_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($par_pay_act_d_no.equalsIgnoreCase(name)) {
			return par_pay_act_d_no();
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
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			return pay_act_d_seq();
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			return pay_act_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_amt();
		}
		if ($trd_cur_exc_com_paid.equalsIgnoreCase(name)) {
			return trd_cur_exc_com_paid();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_com_paid_tax_amt();
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			return base_cur_exc_com_paid();
		}
		if ($par_pay_act_d_seq.equalsIgnoreCase(name)) {
			return par_pay_act_d_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
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

	public String getStringNE(String name) {
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			return pay_act_d_no();
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		if ($ap_appl_schd_no.equalsIgnoreCase(name)) {
			return ap_appl_schd_no();
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			return pay_schd_no();
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			return pay_chk_mng_no();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($calc_tgt_pay_chk_mng_no.equalsIgnoreCase(name)) {
			return calc_tgt_pay_chk_mng_no();
		}
		if ($ap_d_no.equalsIgnoreCase(name)) {
			return ap_d_no();
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
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_cd();
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			return ap_setoff_typ();
		}
		if ($setoff_cd.equalsIgnoreCase(name)) {
			return setoff_cd();
		}
		if ($setoff_nm.equalsIgnoreCase(name)) {
			return setoff_nm();
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			return so_dpt_cd();
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			return adv_pay_act_no();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_ntc_d_print_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($par_pay_act_d_no.equalsIgnoreCase(name)) {
			return par_pay_act_d_no();
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
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			return pay_act_d_seq();
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			return pay_act_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_amt();
		}
		if ($trd_cur_exc_com_paid.equalsIgnoreCase(name)) {
			return trd_cur_exc_com_paid();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_com_paid_tax_amt();
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			return base_cur_exc_com_paid();
		}
		if ($par_pay_act_d_seq.equalsIgnoreCase(name)) {
			return par_pay_act_d_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
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

	public void setString(String name, String value) {
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			pay_act_d_no(value);
			return;
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		if ($ap_appl_schd_no.equalsIgnoreCase(name)) {
			ap_appl_schd_no(value);
			return;
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			pay_schd_no(value);
			return;
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			pay_chk_mng_no(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($calc_tgt_pay_chk_mng_no.equalsIgnoreCase(name)) {
			calc_tgt_pay_chk_mng_no(value);
			return;
		}
		if ($ap_d_no.equalsIgnoreCase(name)) {
			ap_d_no(value);
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
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_cd(value);
			return;
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			ap_setoff_typ(value);
			return;
		}
		if ($setoff_cd.equalsIgnoreCase(name)) {
			setoff_cd(value);
			return;
		}
		if ($setoff_nm.equalsIgnoreCase(name)) {
			setoff_nm(value);
			return;
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			so_dpt_cd(value);
			return;
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			adv_pay_act_no(value);
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
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_ntc_d_print_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		if ($par_pay_act_d_no.equalsIgnoreCase(name)) {
			par_pay_act_d_no(value);
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
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
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
		if ($par_pay_act_d_seq.equalsIgnoreCase(name)) {
			par_pay_act_d_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
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
		if ($par_pay_act_d_seq.equalsIgnoreCase(name)) {
			par_pay_act_d_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
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
		if ($par_pay_act_d_seq.equalsIgnoreCase(name)) {
			par_pay_act_d_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
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
		if ($par_pay_act_d_seq.equalsIgnoreCase(name)) {
			par_pay_act_d_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
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
		if ($par_pay_act_d_seq.equalsIgnoreCase(name)) {
			par_pay_act_d_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
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

	public void setStringNE(String name, String value) {
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			pay_act_d_no(value);
			return;
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		if ($ap_appl_schd_no.equalsIgnoreCase(name)) {
			ap_appl_schd_no(value);
			return;
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			pay_schd_no(value);
			return;
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			pay_chk_mng_no(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($calc_tgt_pay_chk_mng_no.equalsIgnoreCase(name)) {
			calc_tgt_pay_chk_mng_no(value);
			return;
		}
		if ($ap_d_no.equalsIgnoreCase(name)) {
			ap_d_no(value);
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
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_cd(value);
			return;
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			ap_setoff_typ(value);
			return;
		}
		if ($setoff_cd.equalsIgnoreCase(name)) {
			setoff_cd(value);
			return;
		}
		if ($setoff_nm.equalsIgnoreCase(name)) {
			setoff_nm(value);
			return;
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			so_dpt_cd(value);
			return;
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			adv_pay_act_no(value);
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
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_ntc_d_print_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		if ($par_pay_act_d_no.equalsIgnoreCase(name)) {
			par_pay_act_d_no(value);
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
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
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
		if ($par_pay_act_d_seq.equalsIgnoreCase(name)) {
			par_pay_act_d_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
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
		if ($par_pay_act_d_seq.equalsIgnoreCase(name)) {
			par_pay_act_d_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
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
		if ($par_pay_act_d_seq.equalsIgnoreCase(name)) {
			par_pay_act_d_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
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
		if ($par_pay_act_d_seq.equalsIgnoreCase(name)) {
			par_pay_act_d_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
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
		if ($par_pay_act_d_seq.equalsIgnoreCase(name)) {
			par_pay_act_d_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
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

}
