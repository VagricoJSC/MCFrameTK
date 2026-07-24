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
 * "支払予定 // Payment schedule"DBコンテナRowクラスです。<p>
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
 *  	<td>pay_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払予定ＮＯ</td>
 *  	<td>Payment schedule No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_chk_mng_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払照合管理ＮＯ</td>
 *  	<td>Payment collation management No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>asppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>買掛先ＣＤ</td>
 *  	<td>AP supplier cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ap_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債務部門ＣＤ</td>
 *  	<td>AP dept. cd.</td>
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
 *  	<td>pay_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払予定日</td>
 *  	<td>Scheduled payment date</td>
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
 *  	<td>trd_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨金額</td>
 *  	<td>Amount (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_com_paid_tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手数料税ＣＤ</td>
 *  	<td>Fee tax cd.</td>
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
 *  	<td>trd_cur_appl_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨消込額</td>
 *  	<td>Reconciled amount (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払状況区分</td>
 *  	<td>Payment status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sw_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>振替済ＦＬＧ</td>
 *  	<td>Transferred flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_bill_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>相手先請求書ＮＯ</td>
 *  	<td>Counterpart invoice No.</td>
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
 *  	<td>note_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手形番号</td>
 *  	<td>Note number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>note_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手形区分</td>
 *  	<td>Note type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>note_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手形理由ＣＤ</td>
 *  	<td>Note reason cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>draw_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振出日</td>
 *  	<td>Drawing date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>due_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払期日</td>
 *  	<td>Payment due date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>note_days</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手形サイト</td>
 *  	<td>Note sight</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>drawer_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振出人名</td>
 *  	<td>Drawer name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>draw_bank_cd</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振出銀行ＣＤ</td>
 *  	<td>Drawing bank cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>draw_branch_cd</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振出支店ＣＤ</td>
 *  	<td>Drawing branch cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>endrsr</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>裏書人</td>
 *  	<td>Endorser</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>accptr</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>引受人</td>
 *  	<td>Accepted by</td>
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
 *  	<td>pay_schd_print_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定表備考</td>
 *  	<td>Payment schedule table details</td>
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
public class MST_PAY_SCHD_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_PAY_SCHD";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
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
	 * 支払部門ＣＤ. Payment dept. cd..<p>
	 *
	 */
	public static final String $pay_dpt_cd = "pay_dpt_cd";
	private static final MCPermColumnInfo _pay_dpt_cd = createColumnInfo("pay_dpt_cd");
	public final MCStringPermColumn pay_dpt_cd = createStringColumn(_pay_dpt_cd);
	
	/**
	 * 債務区分. AP type.<p>
	 *
	 */
	public static final String $ap_typ = "ap_typ";
	private static final MCPermColumnInfo _ap_typ = createColumnInfo("ap_typ");
	public final MCStringPermColumn ap_typ = createStringColumn(_ap_typ);
	
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
	 * 支払予定日. Scheduled payment date.<p>
	 *
	 */
	public static final String $pay_schd_dt = "pay_schd_dt";
	private static final MCPermColumnInfo _pay_schd_dt = createColumnInfo("pay_schd_dt");
	public final MCDatePermColumn pay_schd_dt = createDateColumn(_pay_schd_dt);
	
	/**
	 * 支払先口座ＣＤ. Payee account cd..<p>
	 *
	 */
	public static final String $pay_bank_ac_cd = "pay_bank_ac_cd";
	private static final MCPermColumnInfo _pay_bank_ac_cd = createColumnInfo("pay_bank_ac_cd");
	public final MCStringPermColumn pay_bank_ac_cd = createStringColumn(_pay_bank_ac_cd);
	
	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	private static final MCPermColumnInfo _bank_ac_cd = createColumnInfo("bank_ac_cd");
	public final MCStringPermColumn bank_ac_cd = createStringColumn(_bank_ac_cd);
	
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
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	private static final MCPermColumnInfo _xrate = createColumnInfo("xrate");
	public final MCNumberPermColumn xrate = createNumberColumn(_xrate);
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	private static final MCPermColumnInfo _trd_cur_amt = createColumnInfo("trd_cur_amt");
	public final MCNumberPermColumn trd_cur_amt = createNumberColumn(_trd_cur_amt);
	
	/**
	 * 手数料税ＣＤ. Fee tax cd..<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_cd = "trd_cur_com_paid_tax_cd";
	private static final MCPermColumnInfo _trd_cur_com_paid_tax_cd = createColumnInfo("trd_cur_com_paid_tax_cd");
	public final MCStringPermColumn trd_cur_com_paid_tax_cd = createStringColumn(_trd_cur_com_paid_tax_cd);
	
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
	 * 取引通貨消込額. Reconciled amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_appl_amt = "trd_cur_appl_amt";
	private static final MCPermColumnInfo _trd_cur_appl_amt = createColumnInfo("trd_cur_appl_amt");
	public final MCNumberPermColumn trd_cur_appl_amt = createNumberColumn(_trd_cur_appl_amt);
	
	/**
	 * 支払状況区分. Payment status type.<p>
	 *
	 */
	public static final String $pay_sts_typ = "pay_sts_typ";
	private static final MCPermColumnInfo _pay_sts_typ = createColumnInfo("pay_sts_typ");
	public final MCStringPermColumn pay_sts_typ = createStringColumn(_pay_sts_typ);
	
	/**
	 * 振替済ＦＬＧ. Transferred flg..<p>
	 *
	 */
	public static final String $sw_flg = "sw_flg";
	private static final MCPermColumnInfo _sw_flg = createColumnInfo("sw_flg");
	public final MCBooleanPermColumn sw_flg = createBooleanColumn(_sw_flg);
	
	/**
	 * 相手先請求書ＮＯ. Counterpart invoice No..<p>
	 *
	 */
	public static final String $rcv_bill_no = "rcv_bill_no";
	private static final MCPermColumnInfo _rcv_bill_no = createColumnInfo("rcv_bill_no");
	public final MCStringPermColumn rcv_bill_no = createStringColumn(_rcv_bill_no);
	
	/**
	 * 前渡金支払実績ＮＯ. Advance payment amount payment result No..<p>
	 *
	 */
	public static final String $adv_pay_act_no = "adv_pay_act_no";
	private static final MCPermColumnInfo _adv_pay_act_no = createColumnInfo("adv_pay_act_no");
	public final MCStringPermColumn adv_pay_act_no = createStringColumn(_adv_pay_act_no);
	
	/**
	 * 手形番号. Note number.<p>
	 *
	 */
	public static final String $note_no = "note_no";
	private static final MCPermColumnInfo _note_no = createColumnInfo("note_no");
	public final MCStringPermColumn note_no = createStringColumn(_note_no);
	
	/**
	 * 手形区分. Note type.<p>
	 *
	 */
	public static final String $note_typ = "note_typ";
	private static final MCPermColumnInfo _note_typ = createColumnInfo("note_typ");
	public final MCStringPermColumn note_typ = createStringColumn(_note_typ);
	
	/**
	 * 手形理由ＣＤ. Note reason cd..<p>
	 *
	 */
	public static final String $note_rsn_cd = "note_rsn_cd";
	private static final MCPermColumnInfo _note_rsn_cd = createColumnInfo("note_rsn_cd");
	public final MCStringPermColumn note_rsn_cd = createStringColumn(_note_rsn_cd);
	
	/**
	 * 振出日. Drawing date.<p>
	 *
	 */
	public static final String $draw_dt = "draw_dt";
	private static final MCPermColumnInfo _draw_dt = createColumnInfo("draw_dt");
	public final MCDatePermColumn draw_dt = createDateColumn(_draw_dt);
	
	/**
	 * 支払期日. Payment due date.<p>
	 *
	 */
	public static final String $due_dt = "due_dt";
	private static final MCPermColumnInfo _due_dt = createColumnInfo("due_dt");
	public final MCDatePermColumn due_dt = createDateColumn(_due_dt);
	
	/**
	 * 手形サイト. Note sight.<p>
	 *
	 */
	public static final String $note_days = "note_days";
	private static final MCPermColumnInfo _note_days = createColumnInfo("note_days");
	public final MCNumberPermColumn note_days = createNumberColumn(_note_days);
	
	/**
	 * 振出人名. Drawer name.<p>
	 *
	 */
	public static final String $drawer_nm = "drawer_nm";
	private static final MCPermColumnInfo _drawer_nm = createColumnInfo("drawer_nm");
	public final MCStringPermColumn drawer_nm = createStringColumn(_drawer_nm);
	
	/**
	 * 振出銀行ＣＤ. Drawing bank cd..<p>
	 *
	 */
	public static final String $draw_bank_cd = "draw_bank_cd";
	private static final MCPermColumnInfo _draw_bank_cd = createColumnInfo("draw_bank_cd");
	public final MCStringPermColumn draw_bank_cd = createStringColumn(_draw_bank_cd);
	
	/**
	 * 振出支店ＣＤ. Drawing branch cd..<p>
	 *
	 */
	public static final String $draw_branch_cd = "draw_branch_cd";
	private static final MCPermColumnInfo _draw_branch_cd = createColumnInfo("draw_branch_cd");
	public final MCStringPermColumn draw_branch_cd = createStringColumn(_draw_branch_cd);
	
	/**
	 * 裏書人. Endorser.<p>
	 *
	 */
	public static final String $endrsr = "endrsr";
	private static final MCPermColumnInfo _endrsr = createColumnInfo("endrsr");
	public final MCStringPermColumn endrsr = createStringColumn(_endrsr);
	
	/**
	 * 引受人. Accepted by.<p>
	 *
	 */
	public static final String $accptr = "accptr";
	private static final MCPermColumnInfo _accptr = createColumnInfo("accptr");
	public final MCStringPermColumn accptr = createStringColumn(_accptr);
	
	/**
	 * 支払通知書明細備考. Payment notice details remarks.<p>
	 *
	 */
	public static final String $pay_ntc_d_print_rmrks = "pay_ntc_d_print_rmrks";
	private static final MCPermColumnInfo _pay_ntc_d_print_rmrks = createColumnInfo("pay_ntc_d_print_rmrks");
	public final MCStringPermColumn pay_ntc_d_print_rmrks = createStringColumn(_pay_ntc_d_print_rmrks);
	
	/**
	 * 支払予定表備考. Payment schedule table details.<p>
	 *
	 */
	public static final String $pay_schd_print_rmrks = "pay_schd_print_rmrks";
	private static final MCPermColumnInfo _pay_schd_print_rmrks = createColumnInfo("pay_schd_print_rmrks");
	public final MCStringPermColumn pay_schd_print_rmrks = createStringColumn(_pay_schd_print_rmrks);
	
	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	private static final MCPermColumnInfo _trd_d_rmrks = createColumnInfo("trd_d_rmrks");
	public final MCStringPermColumn trd_d_rmrks = createStringColumn(_trd_d_rmrks);
	
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
	
	public static final MCMeta pay_schd_no_META = createCommonMeta($pay_schd_no, mcframe.commonMA.meta.MA_META.PAY_SCHD_NO);
	public static final MCMeta pay_chk_mng_no_META = createCommonMeta($pay_chk_mng_no, mcframe.commonMA.meta.MA_META.PAY_CHK_MNG_NO);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pay_dpt_cd_META = createCommonMeta($pay_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_typ_META = createCommonMeta($ap_typ, mcframe.commonMA.meta.MA_META.AP_TYP);
	public static final MCMeta ap_sttl_cd_META = createCommonMeta($ap_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ap_sttl_typ_META = createCommonMeta($ap_sttl_typ, mcframe.commonMA.meta.MA_META.AP_STTL_TYP);
	public static final MCMeta pay_schd_dt_META = createCommonMeta($pay_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_bank_ac_cd_META = createCommonMeta($pay_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta ap_setoff_typ_META = createCommonMeta($ap_setoff_typ, mcframe.commonMA.meta.MA_META.AP_SETOFF_TYP);
	public static final MCMeta setoff_cd_META = createCommonMeta($setoff_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta setoff_nm_META = createCommonMeta($setoff_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta so_dpt_cd_META = createCommonMeta($so_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_com_paid_tax_cd_META = createCommonMeta($trd_cur_com_paid_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta trd_cur_com_paid_tax_amt_META = createCommonMeta($trd_cur_com_paid_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_exc_com_paid_META = createCommonMeta($trd_cur_exc_com_paid, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_appl_amt_META = createCommonMeta($trd_cur_appl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_sts_typ_META = createCommonMeta($pay_sts_typ, mcframe.commonMS.meta.MS_META.PAY_STS_TYP);
	public static final MCMeta sw_flg_META = createCommonMeta($sw_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_bill_no_META = createCommonMeta($rcv_bill_no, mcframe.commonMA.meta.MA_META.RCV_BILL_NO);
	public static final MCMeta adv_pay_act_no_META = createCommonMeta($adv_pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta note_no_META = createCommonMeta($note_no, mcframe.commonMA.meta.MA_META.NOTE_NO);
	public static final MCMeta note_typ_META = createCommonMeta($note_typ, mcframe.commonMA.meta.MA_META.NOTE_TYP);
	public static final MCMeta note_rsn_cd_META = createCommonMeta($note_rsn_cd, mcframe.commonMA.meta.MA_META.NOTE_RSN_CD);
	public static final MCMeta draw_dt_META = createCommonMeta($draw_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta due_dt_META = createCommonMeta($due_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta note_days_META = createCommonMeta($note_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta drawer_nm_META = createCommonMeta($drawer_nm, mcframe.commonMA.meta.MA_META.DRAWER_NM);
	public static final MCMeta draw_bank_cd_META = createCommonMeta($draw_bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta draw_branch_cd_META = createCommonMeta($draw_branch_cd, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta endrsr_META = createCommonMeta($endrsr, mcframe.commonMA.meta.MA_META.NOTE_ENDRSR);
	public static final MCMeta accptr_META = createCommonMeta($accptr, mcframe.commonMA.meta.MA_META.NOTE_ACCPTR);
	public static final MCMeta pay_ntc_d_print_rmrks_META = createCommonMeta($pay_ntc_d_print_rmrks, mcframe.commonMS.meta.MS_META.PAY_NTC_D_PRINT_RMRKS);
	public static final MCMeta pay_schd_print_rmrks_META = createCommonMeta($pay_schd_print_rmrks, mcframe.commonMS.meta.MS_META.PAY_SCHD_PRINT_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PAY_SCHD_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PAY_SCHD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PAY_SCHD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PAY_SCHD_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_PAY_SCHD_R> constMetas = new ConstMetaList<MST_PAY_SCHD_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			pay_schd_no_META,
			pay_chk_mng_no_META,
			asppl_cd_META,
			ap_dpt_cd_META,
			pay_dpt_cd_META,
			ap_typ_META,
			ap_sttl_cd_META,
			ap_sttl_typ_META,
			pay_schd_dt_META,
			pay_bank_ac_cd_META,
			bank_ac_cd_META,
			ap_setoff_typ_META,
			setoff_cd_META,
			setoff_nm_META,
			so_dpt_cd_META,
			xrate_META,
			trd_cur_amt_META,
			trd_cur_com_paid_tax_cd_META,
			trd_cur_com_paid_tax_amt_META,
			trd_cur_exc_com_paid_META,
			trd_cur_appl_amt_META,
			pay_sts_typ_META,
			sw_flg_META,
			rcv_bill_no_META,
			adv_pay_act_no_META,
			note_no_META,
			note_typ_META,
			note_rsn_cd_META,
			draw_dt_META,
			due_dt_META,
			note_days_META,
			drawer_nm_META,
			draw_bank_cd_META,
			draw_branch_cd_META,
			endrsr_META,
			accptr_META,
			pay_ntc_d_print_rmrks_META,
			pay_schd_print_rmrks_META,
			trd_d_rmrks_META,
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
	protected MST_PAY_SCHD_R(ConstMetaList<? extends MST_PAY_SCHD_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_PAY_SCHD_R(ConstMetaList<? extends MST_PAY_SCHD_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_PAY_SCHD_R.$pay_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$pay_schd_no,
				"pay_schd_no",
				pay_schd_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_SCHD_R.$pay_chk_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$pay_chk_mng_no,
				"pay_chk_mng_no",
				pay_chk_mng_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_SCHD_R.$asppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$asppl_cd,
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
			MST_PAY_SCHD_R.$ap_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$ap_dpt_cd,
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
			MST_PAY_SCHD_R.$pay_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$pay_dpt_cd,
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
			MST_PAY_SCHD_R.$ap_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$ap_typ,
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
			MST_PAY_SCHD_R.$ap_sttl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$ap_sttl_cd,
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
			MST_PAY_SCHD_R.$ap_sttl_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$ap_sttl_typ,
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
			MST_PAY_SCHD_R.$pay_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PAY_SCHD_R.$pay_schd_dt,
				"pay_schd_dt",
				pay_schd_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_SCHD_R.$pay_bank_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$pay_bank_ac_cd,
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
			MST_PAY_SCHD_R.$bank_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$bank_ac_cd,
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
			MST_PAY_SCHD_R.$ap_setoff_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$ap_setoff_typ,
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
			MST_PAY_SCHD_R.$setoff_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$setoff_cd,
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
			MST_PAY_SCHD_R.$setoff_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$setoff_nm,
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
			MST_PAY_SCHD_R.$so_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$so_dpt_cd,
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
			MST_PAY_SCHD_R.$xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_SCHD_R.$xrate,
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
			MST_PAY_SCHD_R.$trd_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_SCHD_R.$trd_cur_amt,
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
			MST_PAY_SCHD_R.$trd_cur_com_paid_tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$trd_cur_com_paid_tax_cd,
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
			MST_PAY_SCHD_R.$trd_cur_com_paid_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_SCHD_R.$trd_cur_com_paid_tax_amt,
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
			MST_PAY_SCHD_R.$trd_cur_exc_com_paid,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_SCHD_R.$trd_cur_exc_com_paid,
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
			MST_PAY_SCHD_R.$trd_cur_appl_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_SCHD_R.$trd_cur_appl_amt,
				"trd_cur_appl_amt",
				trd_cur_appl_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_SCHD_R.$pay_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$pay_sts_typ,
				"pay_sts_typ",
				pay_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_SCHD_R.$sw_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PAY_SCHD_R.$sw_flg,
				"sw_flg",
				sw_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_SCHD_R.$rcv_bill_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$rcv_bill_no,
				"rcv_bill_no",
				rcv_bill_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_SCHD_R.$adv_pay_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$adv_pay_act_no,
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
			MST_PAY_SCHD_R.$note_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$note_no,
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
			MST_PAY_SCHD_R.$note_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$note_typ,
				"note_typ",
				note_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_SCHD_R.$note_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$note_rsn_cd,
				"note_rsn_cd",
				note_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_SCHD_R.$draw_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PAY_SCHD_R.$draw_dt,
				"draw_dt",
				draw_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_SCHD_R.$due_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PAY_SCHD_R.$due_dt,
				"due_dt",
				due_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_SCHD_R.$note_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_SCHD_R.$note_days,
				"note_days",
				note_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_SCHD_R.$drawer_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$drawer_nm,
				"drawer_nm",
				drawer_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_SCHD_R.$draw_bank_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$draw_bank_cd,
				"draw_bank_cd",
				draw_bank_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_SCHD_R.$draw_branch_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$draw_branch_cd,
				"draw_branch_cd",
				draw_branch_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_SCHD_R.$endrsr,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$endrsr,
				"endrsr",
				endrsr,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_SCHD_R.$accptr,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$accptr,
				"accptr",
				accptr,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_SCHD_R.$pay_ntc_d_print_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$pay_ntc_d_print_rmrks,
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
			MST_PAY_SCHD_R.$pay_schd_print_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$pay_schd_print_rmrks,
				"pay_schd_print_rmrks",
				pay_schd_print_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_SCHD_R.$trd_d_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$trd_d_rmrks,
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
			MST_PAY_SCHD_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$intr_rmrks,
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
			MST_PAY_SCHD_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$sub_char1,
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
			MST_PAY_SCHD_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$sub_char2,
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
			MST_PAY_SCHD_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$sub_char3,
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
			MST_PAY_SCHD_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$ins_usr_id,
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
			MST_PAY_SCHD_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$ins_usr_nm,
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
			MST_PAY_SCHD_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PAY_SCHD_R.$ins_ts,
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
			MST_PAY_SCHD_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$ins_func_id,
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
			MST_PAY_SCHD_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_SCHD_R.$upd_cntr,
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
			MST_PAY_SCHD_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$upd_usr_id,
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
			MST_PAY_SCHD_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$upd_usr_nm,
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
			MST_PAY_SCHD_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PAY_SCHD_R.$upd_ts,
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
			MST_PAY_SCHD_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$upd_func_id,
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
			MST_PAY_SCHD_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_SCHD_R.$upd_srv_req_no,
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
	public static MST_PAY_SCHD_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_PAY_SCHD_R create(String alias) {
		MST_PAY_SCHD_R row = new MST_PAY_SCHD_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_PAY_SCHD_R createByName(T proto) {
		MST_PAY_SCHD_R row = MST_PAY_SCHD_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PAY_SCHD_R clone() {
		return (MST_PAY_SCHD_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PAY_SCHD_R createInstance() {
		return (MST_PAY_SCHD_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PAY_SCHD_R getValues(String... names) {
		return (MST_PAY_SCHD_R) super.getValues(names);
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
	 public MSW_PAY_SCHD_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_PAY_SCHD_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_PAY_SCHD_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_PAY_SCHD_KEY_R.TABLE_NAME);
	 }

	/**
	 * 支払予定ＮＯ. Payment schedule No..<p>
	 *
	 */
	public String pay_schd_no() {
		return getConstString(offset + 0, $pay_schd_no);
	}

	/**
	 * 支払予定ＮＯ. Payment schedule No..<p>
	 *
	 */
	public void pay_schd_no(String value) {
		setConstString(offset + 0, $pay_schd_no, value);
	}

	/**
	 * 支払照合管理ＮＯ. Payment collation management No..<p>
	 *
	 */
	public String pay_chk_mng_no() {
		return getConstString(offset + 1, $pay_chk_mng_no);
	}

	/**
	 * 支払照合管理ＮＯ. Payment collation management No..<p>
	 *
	 */
	public void pay_chk_mng_no(String value) {
		setConstString(offset + 1, $pay_chk_mng_no, value);
	}

	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 2, $asppl_cd);
	}

	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 2, $asppl_cd, value);
	}

	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 3, $ap_dpt_cd);
	}

	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 3, $ap_dpt_cd, value);
	}

	/**
	 * 支払部門ＣＤ. Payment dept. cd..<p>
	 *
	 */
	public String pay_dpt_cd() {
		return getConstString(offset + 4, $pay_dpt_cd);
	}

	/**
	 * 支払部門ＣＤ. Payment dept. cd..<p>
	 *
	 */
	public void pay_dpt_cd(String value) {
		setConstString(offset + 4, $pay_dpt_cd, value);
	}

	/**
	 * 債務区分. AP type.<p>
	 *
	 */
	public String ap_typ() {
		return getConstString(offset + 5, $ap_typ);
	}

	/**
	 * 債務区分. AP type.<p>
	 *
	 */
	public void ap_typ(String value) {
		setConstString(offset + 5, $ap_typ, value);
	}

	/**
	 * 債務決済方法ＣＤ. AP settlement method cd..<p>
	 *
	 */
	public String ap_sttl_cd() {
		return getConstString(offset + 6, $ap_sttl_cd);
	}

	/**
	 * 債務決済方法ＣＤ. AP settlement method cd..<p>
	 *
	 */
	public void ap_sttl_cd(String value) {
		setConstString(offset + 6, $ap_sttl_cd, value);
	}

	/**
	 * 債務決済区分. AP settlement type.<p>
	 *
	 */
	public String ap_sttl_typ() {
		return getConstString(offset + 7, $ap_sttl_typ);
	}

	/**
	 * 債務決済区分. AP settlement type.<p>
	 *
	 */
	public void ap_sttl_typ(String value) {
		setConstString(offset + 7, $ap_sttl_typ, value);
	}

	/**
	 * 支払予定日. Scheduled payment date.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return getConstDate(offset + 8, $pay_schd_dt);
	}

	/**
	 * 支払予定日. Scheduled payment date.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		setConstDate(offset + 8, $pay_schd_dt, value);
	}

	/**
	 * 支払先口座ＣＤ. Payee account cd..<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return getConstString(offset + 9, $pay_bank_ac_cd);
	}

	/**
	 * 支払先口座ＣＤ. Payee account cd..<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		setConstString(offset + 9, $pay_bank_ac_cd, value);
	}

	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 10, $bank_ac_cd);
	}

	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 10, $bank_ac_cd, value);
	}

	/**
	 * 相殺先区分. Offset destination type.<p>
	 *
	 */
	public String ap_setoff_typ() {
		return getConstString(offset + 11, $ap_setoff_typ);
	}

	/**
	 * 相殺先区分. Offset destination type.<p>
	 *
	 */
	public void ap_setoff_typ(String value) {
		setConstString(offset + 11, $ap_setoff_typ, value);
	}

	/**
	 * 相殺先ＣＤ. Offset destination cd..<p>
	 *
	 */
	public String setoff_cd() {
		return getConstString(offset + 12, $setoff_cd);
	}

	/**
	 * 相殺先ＣＤ. Offset destination cd..<p>
	 *
	 */
	public void setoff_cd(String value) {
		setConstString(offset + 12, $setoff_cd, value);
	}

	/**
	 * 相殺先名. Offset destination name.<p>
	 *
	 */
	public String setoff_nm() {
		return getConstString(offset + 13, $setoff_nm);
	}

	/**
	 * 相殺先名. Offset destination name.<p>
	 *
	 */
	public void setoff_nm(String value) {
		setConstString(offset + 13, $setoff_nm, value);
	}

	/**
	 * 相殺部門ＣＤ. Offset dept. cd..<p>
	 *
	 */
	public String so_dpt_cd() {
		return getConstString(offset + 14, $so_dpt_cd);
	}

	/**
	 * 相殺部門ＣＤ. Offset dept. cd..<p>
	 *
	 */
	public void so_dpt_cd(String value) {
		setConstString(offset + 14, $so_dpt_cd, value);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 15, $xrate);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 15, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 15, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 15, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 15, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 15, $xrate, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 16, $trd_cur_amt);
	}

	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 16, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 16, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 16, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 16, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 16, $trd_cur_amt, value);
	}
	
	/**
	 * 手数料税ＣＤ. Fee tax cd..<p>
	 *
	 */
	public String trd_cur_com_paid_tax_cd() {
		return getConstString(offset + 17, $trd_cur_com_paid_tax_cd);
	}

	/**
	 * 手数料税ＣＤ. Fee tax cd..<p>
	 *
	 */
	public void trd_cur_com_paid_tax_cd(String value) {
		setConstString(offset + 17, $trd_cur_com_paid_tax_cd, value);
	}

	/**
	 * 取引通貨手数料税額. Fee tax amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_com_paid_tax_amt() {
		return getConstNumber(offset + 18, $trd_cur_com_paid_tax_amt);
	}

	/**
	 * 取引通貨手数料税額. Fee tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(MCNumber value) {
		setConstNumber(offset + 18, $trd_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 取引通貨手数料税額. Fee tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(int value) {
		setConstNumber(offset + 18, $trd_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 取引通貨手数料税額. Fee tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(long value) {
		setConstNumber(offset + 18, $trd_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 取引通貨手数料税額. Fee tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(float value) {
		setConstNumber(offset + 18, $trd_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 取引通貨手数料税額. Fee tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(double value) {
		setConstNumber(offset + 18, $trd_cur_com_paid_tax_amt, value);
	}
	
	/**
	 * 取引通貨手数料税抜額. Fee amount without tax (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_exc_com_paid() {
		return getConstNumber(offset + 19, $trd_cur_exc_com_paid);
	}

	/**
	 * 取引通貨手数料税抜額. Fee amount without tax (Transaction currency).<p>
	 *
	 */
	public void trd_cur_exc_com_paid(MCNumber value) {
		setConstNumber(offset + 19, $trd_cur_exc_com_paid, value);
	}
	
	/**
	 * 取引通貨手数料税抜額. Fee amount without tax (Transaction currency).<p>
	 *
	 */
	public void trd_cur_exc_com_paid(int value) {
		setConstNumber(offset + 19, $trd_cur_exc_com_paid, value);
	}
	
	/**
	 * 取引通貨手数料税抜額. Fee amount without tax (Transaction currency).<p>
	 *
	 */
	public void trd_cur_exc_com_paid(long value) {
		setConstNumber(offset + 19, $trd_cur_exc_com_paid, value);
	}
	
	/**
	 * 取引通貨手数料税抜額. Fee amount without tax (Transaction currency).<p>
	 *
	 */
	public void trd_cur_exc_com_paid(float value) {
		setConstNumber(offset + 19, $trd_cur_exc_com_paid, value);
	}
	
	/**
	 * 取引通貨手数料税抜額. Fee amount without tax (Transaction currency).<p>
	 *
	 */
	public void trd_cur_exc_com_paid(double value) {
		setConstNumber(offset + 19, $trd_cur_exc_com_paid, value);
	}
	
	/**
	 * 取引通貨消込額. Reconciled amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_appl_amt() {
		return getConstNumber(offset + 20, $trd_cur_appl_amt);
	}

	/**
	 * 取引通貨消込額. Reconciled amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_appl_amt(MCNumber value) {
		setConstNumber(offset + 20, $trd_cur_appl_amt, value);
	}
	
	/**
	 * 取引通貨消込額. Reconciled amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_appl_amt(int value) {
		setConstNumber(offset + 20, $trd_cur_appl_amt, value);
	}
	
	/**
	 * 取引通貨消込額. Reconciled amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_appl_amt(long value) {
		setConstNumber(offset + 20, $trd_cur_appl_amt, value);
	}
	
	/**
	 * 取引通貨消込額. Reconciled amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_appl_amt(float value) {
		setConstNumber(offset + 20, $trd_cur_appl_amt, value);
	}
	
	/**
	 * 取引通貨消込額. Reconciled amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_appl_amt(double value) {
		setConstNumber(offset + 20, $trd_cur_appl_amt, value);
	}
	
	/**
	 * 支払状況区分. Payment status type.<p>
	 *
	 */
	public String pay_sts_typ() {
		return getConstString(offset + 21, $pay_sts_typ);
	}

	/**
	 * 支払状況区分. Payment status type.<p>
	 *
	 */
	public void pay_sts_typ(String value) {
		setConstString(offset + 21, $pay_sts_typ, value);
	}

	/**
	 * 振替済ＦＬＧ. Transferred flg..<p>
	 *
	 */
	public boolean sw_flg() {
		return getConstBoolean(offset + 22, $sw_flg);
	}

	/**
	 * 振替済ＦＬＧ. Transferred flg..<p>
	 *
	 */
	public void sw_flg(boolean value) {
		setConstBoolean(offset + 22, $sw_flg, value);
	}

	/**
	 * 相手先請求書ＮＯ. Counterpart invoice No..<p>
	 *
	 */
	public String rcv_bill_no() {
		return getConstString(offset + 23, $rcv_bill_no);
	}

	/**
	 * 相手先請求書ＮＯ. Counterpart invoice No..<p>
	 *
	 */
	public void rcv_bill_no(String value) {
		setConstString(offset + 23, $rcv_bill_no, value);
	}

	/**
	 * 前渡金支払実績ＮＯ. Advance payment amount payment result No..<p>
	 *
	 */
	public String adv_pay_act_no() {
		return getConstString(offset + 24, $adv_pay_act_no);
	}

	/**
	 * 前渡金支払実績ＮＯ. Advance payment amount payment result No..<p>
	 *
	 */
	public void adv_pay_act_no(String value) {
		setConstString(offset + 24, $adv_pay_act_no, value);
	}

	/**
	 * 手形番号. Note number.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 25, $note_no);
	}

	/**
	 * 手形番号. Note number.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 25, $note_no, value);
	}

	/**
	 * 手形区分. Note type.<p>
	 *
	 */
	public String note_typ() {
		return getConstString(offset + 26, $note_typ);
	}

	/**
	 * 手形区分. Note type.<p>
	 *
	 */
	public void note_typ(String value) {
		setConstString(offset + 26, $note_typ, value);
	}

	/**
	 * 手形理由ＣＤ. Note reason cd..<p>
	 *
	 */
	public String note_rsn_cd() {
		return getConstString(offset + 27, $note_rsn_cd);
	}

	/**
	 * 手形理由ＣＤ. Note reason cd..<p>
	 *
	 */
	public void note_rsn_cd(String value) {
		setConstString(offset + 27, $note_rsn_cd, value);
	}

	/**
	 * 振出日. Drawing date.<p>
	 *
	 */
	public MCDate draw_dt() {
		return getConstDate(offset + 28, $draw_dt);
	}

	/**
	 * 振出日. Drawing date.<p>
	 *
	 */
	public void draw_dt(MCDate value) {
		setConstDate(offset + 28, $draw_dt, value);
	}

	/**
	 * 支払期日. Payment due date.<p>
	 *
	 */
	public MCDate due_dt() {
		return getConstDate(offset + 29, $due_dt);
	}

	/**
	 * 支払期日. Payment due date.<p>
	 *
	 */
	public void due_dt(MCDate value) {
		setConstDate(offset + 29, $due_dt, value);
	}

	/**
	 * 手形サイト. Note sight.<p>
	 *
	 */
	public MCNumber note_days() {
		return getConstNumber(offset + 30, $note_days);
	}

	/**
	 * 手形サイト. Note sight.<p>
	 *
	 */
	public void note_days(MCNumber value) {
		setConstNumber(offset + 30, $note_days, value);
	}
	
	/**
	 * 手形サイト. Note sight.<p>
	 *
	 */
	public void note_days(int value) {
		setConstNumber(offset + 30, $note_days, value);
	}
	
	/**
	 * 手形サイト. Note sight.<p>
	 *
	 */
	public void note_days(long value) {
		setConstNumber(offset + 30, $note_days, value);
	}
	
	/**
	 * 手形サイト. Note sight.<p>
	 *
	 */
	public void note_days(float value) {
		setConstNumber(offset + 30, $note_days, value);
	}
	
	/**
	 * 手形サイト. Note sight.<p>
	 *
	 */
	public void note_days(double value) {
		setConstNumber(offset + 30, $note_days, value);
	}
	
	/**
	 * 振出人名. Drawer name.<p>
	 *
	 */
	public String drawer_nm() {
		return getConstString(offset + 31, $drawer_nm);
	}

	/**
	 * 振出人名. Drawer name.<p>
	 *
	 */
	public void drawer_nm(String value) {
		setConstString(offset + 31, $drawer_nm, value);
	}

	/**
	 * 振出銀行ＣＤ. Drawing bank cd..<p>
	 *
	 */
	public String draw_bank_cd() {
		return getConstString(offset + 32, $draw_bank_cd);
	}

	/**
	 * 振出銀行ＣＤ. Drawing bank cd..<p>
	 *
	 */
	public void draw_bank_cd(String value) {
		setConstString(offset + 32, $draw_bank_cd, value);
	}

	/**
	 * 振出支店ＣＤ. Drawing branch cd..<p>
	 *
	 */
	public String draw_branch_cd() {
		return getConstString(offset + 33, $draw_branch_cd);
	}

	/**
	 * 振出支店ＣＤ. Drawing branch cd..<p>
	 *
	 */
	public void draw_branch_cd(String value) {
		setConstString(offset + 33, $draw_branch_cd, value);
	}

	/**
	 * 裏書人. Endorser.<p>
	 *
	 */
	public String endrsr() {
		return getConstString(offset + 34, $endrsr);
	}

	/**
	 * 裏書人. Endorser.<p>
	 *
	 */
	public void endrsr(String value) {
		setConstString(offset + 34, $endrsr, value);
	}

	/**
	 * 引受人. Accepted by.<p>
	 *
	 */
	public String accptr() {
		return getConstString(offset + 35, $accptr);
	}

	/**
	 * 引受人. Accepted by.<p>
	 *
	 */
	public void accptr(String value) {
		setConstString(offset + 35, $accptr, value);
	}

	/**
	 * 支払通知書明細備考. Payment notice details remarks.<p>
	 *
	 */
	public String pay_ntc_d_print_rmrks() {
		return getConstString(offset + 36, $pay_ntc_d_print_rmrks);
	}

	/**
	 * 支払通知書明細備考. Payment notice details remarks.<p>
	 *
	 */
	public void pay_ntc_d_print_rmrks(String value) {
		setConstString(offset + 36, $pay_ntc_d_print_rmrks, value);
	}

	/**
	 * 支払予定表備考. Payment schedule table details.<p>
	 *
	 */
	public String pay_schd_print_rmrks() {
		return getConstString(offset + 37, $pay_schd_print_rmrks);
	}

	/**
	 * 支払予定表備考. Payment schedule table details.<p>
	 *
	 */
	public void pay_schd_print_rmrks(String value) {
		setConstString(offset + 37, $pay_schd_print_rmrks, value);
	}

	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 38, $trd_d_rmrks);
	}

	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 38, $trd_d_rmrks, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 39, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 39, $intr_rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 40, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 40, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 41, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 41, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 42, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 42, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 43, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 43, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 44, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 44, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 45, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 45, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 46, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 46, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 47, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 48, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 48, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 49, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 49, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 50, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 50, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 51, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 51, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 52, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 52, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			return pay_schd_no();
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			return pay_chk_mng_no();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			return ap_sttl_typ();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
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
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_cd();
		}
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			return pay_sts_typ();
		}
		if ($rcv_bill_no.equalsIgnoreCase(name)) {
			return rcv_bill_no();
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			return adv_pay_act_no();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			return note_typ();
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			return note_rsn_cd();
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			return drawer_nm();
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			return draw_bank_cd();
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			return draw_branch_cd();
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			return endrsr();
		}
		if ($accptr.equalsIgnoreCase(name)) {
			return accptr();
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_ntc_d_print_rmrks();
		}
		if ($pay_schd_print_rmrks.equalsIgnoreCase(name)) {
			return pay_schd_print_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
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
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
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
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			return trd_cur_appl_amt();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			return draw_dt();
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
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
		if ($sw_flg.equalsIgnoreCase(name)) {
			return sw_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			return pay_schd_no();
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			return pay_chk_mng_no();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			return ap_sttl_typ();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
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
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_cd();
		}
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			return pay_sts_typ();
		}
		if ($rcv_bill_no.equalsIgnoreCase(name)) {
			return rcv_bill_no();
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			return adv_pay_act_no();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			return note_typ();
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			return note_rsn_cd();
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			return drawer_nm();
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			return draw_bank_cd();
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			return draw_branch_cd();
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			return endrsr();
		}
		if ($accptr.equalsIgnoreCase(name)) {
			return accptr();
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_ntc_d_print_rmrks();
		}
		if ($pay_schd_print_rmrks.equalsIgnoreCase(name)) {
			return pay_schd_print_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
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
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
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
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			return trd_cur_appl_amt();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			return draw_dt();
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
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
		if ($sw_flg.equalsIgnoreCase(name)) {
			return sw_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			pay_schd_no(value);
			return;
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			pay_chk_mng_no(value);
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
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			pay_dpt_cd(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
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
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
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
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_cd(value);
			return;
		}
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			pay_sts_typ(value);
			return;
		}
		if ($rcv_bill_no.equalsIgnoreCase(name)) {
			rcv_bill_no(value);
			return;
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			adv_pay_act_no(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			note_typ(value);
			return;
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			note_rsn_cd(value);
			return;
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			drawer_nm(value);
			return;
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			draw_bank_cd(value);
			return;
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			draw_branch_cd(value);
			return;
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			endrsr(value);
			return;
		}
		if ($accptr.equalsIgnoreCase(name)) {
			accptr(value);
			return;
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_ntc_d_print_rmrks(value);
			return;
		}
		if ($pay_schd_print_rmrks.equalsIgnoreCase(name)) {
			pay_schd_print_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
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
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			trd_cur_appl_amt(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
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
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			trd_cur_appl_amt(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
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
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			trd_cur_appl_amt(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
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
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			trd_cur_appl_amt(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
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
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			trd_cur_appl_amt(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			draw_dt(value);
			return;
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			due_dt(value);
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
		if ($sw_flg.equalsIgnoreCase(name)) {
			sw_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			pay_schd_no(value);
			return;
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			pay_chk_mng_no(value);
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
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			pay_dpt_cd(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
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
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
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
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_cd(value);
			return;
		}
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			pay_sts_typ(value);
			return;
		}
		if ($rcv_bill_no.equalsIgnoreCase(name)) {
			rcv_bill_no(value);
			return;
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			adv_pay_act_no(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			note_typ(value);
			return;
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			note_rsn_cd(value);
			return;
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			drawer_nm(value);
			return;
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			draw_bank_cd(value);
			return;
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			draw_branch_cd(value);
			return;
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			endrsr(value);
			return;
		}
		if ($accptr.equalsIgnoreCase(name)) {
			accptr(value);
			return;
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_ntc_d_print_rmrks(value);
			return;
		}
		if ($pay_schd_print_rmrks.equalsIgnoreCase(name)) {
			pay_schd_print_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
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
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			trd_cur_appl_amt(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
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
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			trd_cur_appl_amt(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
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
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			trd_cur_appl_amt(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
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
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			trd_cur_appl_amt(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
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
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			trd_cur_appl_amt(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			draw_dt(value);
			return;
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			due_dt(value);
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
		if ($sw_flg.equalsIgnoreCase(name)) {
			sw_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
