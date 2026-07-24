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
 * "支払手形 // Notes payable"DBコンテナRowクラスです。<p>
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
 *  	<td>pay_note_mng_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払手形管理ＮＯ</td>
 *  	<td>Notes payable management No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>pay_note_mng_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払手形管理連番</td>
 *  	<td>Notes payable management sequence number</td>
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
 *  	<td>note_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手形番号</td>
 *  	<td>Note number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>note_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
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
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>振出日</td>
 *  	<td>Drawing date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>due_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
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
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>振出人名</td>
 *  	<td>Drawer name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>draw_bank_cd</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>振出銀行ＣＤ</td>
 *  	<td>Drawing bank cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>draw_branch_cd</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
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
 *  	<td>note_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手形額</td>
 *  	<td>Note amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>通貨ＣＤ</td>
 *  	<td>Currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払実績ＮＯ</td>
 *  	<td>Payment result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_act_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払実績連番</td>
 *  	<td>Payment result sequence No.</td>
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
 *  	<td>adv_pay_act_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前渡金支払実績連番</td>
 *  	<td>Advance payment amount payment result sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>a_imp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会計ＩＦ取込済ＦＬＧ</td>
 *  	<td>Accounting IF imported flg.</td>
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
public class MST_PAY_NOTE_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_PAY_NOTE";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 支払手形管理ＮＯ. Notes payable management No..<p>
	 *
	 */
	public static final String $pay_note_mng_no = "pay_note_mng_no";
	private static final MCPermColumnInfo _pay_note_mng_no = createColumnInfo("pay_note_mng_no");
	public final MCStringPermColumn pay_note_mng_no = createStringColumn(_pay_note_mng_no);
	
	/**
	 * 支払手形管理連番. Notes payable management sequence number.<p>
	 *
	 */
	public static final String $pay_note_mng_seq = "pay_note_mng_seq";
	private static final MCPermColumnInfo _pay_note_mng_seq = createColumnInfo("pay_note_mng_seq");
	public final MCNumberPermColumn pay_note_mng_seq = createNumberColumn(_pay_note_mng_seq);
	
	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	private static final MCPermColumnInfo _slip_sts_typ = createColumnInfo("slip_sts_typ");
	public final MCStringPermColumn slip_sts_typ = createStringColumn(_slip_sts_typ);
	
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
	 * 手形額. Note amount.<p>
	 *
	 */
	public static final String $note_amt = "note_amt";
	private static final MCPermColumnInfo _note_amt = createColumnInfo("note_amt");
	public final MCNumberPermColumn note_amt = createNumberColumn(_note_amt);
	
	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	private static final MCPermColumnInfo _cur_cd = createColumnInfo("cur_cd");
	public final MCStringPermColumn cur_cd = createStringColumn(_cur_cd);
	
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
	 * 前渡金支払実績ＮＯ. Advance payment amount payment result No..<p>
	 *
	 */
	public static final String $adv_pay_act_no = "adv_pay_act_no";
	private static final MCPermColumnInfo _adv_pay_act_no = createColumnInfo("adv_pay_act_no");
	public final MCStringPermColumn adv_pay_act_no = createStringColumn(_adv_pay_act_no);
	
	/**
	 * 前渡金支払実績連番. Advance payment amount payment result sequence number.<p>
	 *
	 */
	public static final String $adv_pay_act_seq = "adv_pay_act_seq";
	private static final MCPermColumnInfo _adv_pay_act_seq = createColumnInfo("adv_pay_act_seq");
	public final MCNumberPermColumn adv_pay_act_seq = createNumberColumn(_adv_pay_act_seq);
	
	/**
	 * 会計ＩＦ取込済ＦＬＧ. Accounting IF imported flg..<p>
	 *
	 */
	public static final String $a_imp_flg = "a_imp_flg";
	private static final MCPermColumnInfo _a_imp_flg = createColumnInfo("a_imp_flg");
	public final MCBooleanPermColumn a_imp_flg = createBooleanColumn(_a_imp_flg);
	
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
	
	public static final MCMeta pay_note_mng_no_META = createCommonMeta($pay_note_mng_no, mcframe.commonMA.meta.MA_META.PAY_NOTE_MNG_NO);
	public static final MCMeta pay_note_mng_seq_META = createCommonMeta($pay_note_mng_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
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
	public static final MCMeta note_amt_META = createCommonMeta($note_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta pay_act_no_META = createCommonMeta($pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta pay_act_seq_META = createCommonMeta($pay_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta adv_pay_act_no_META = createCommonMeta($adv_pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta adv_pay_act_seq_META = createCommonMeta($adv_pay_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta a_imp_flg_META = createCommonMeta($a_imp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PAY_NOTE_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PAY_NOTE_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PAY_NOTE_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_PAY_NOTE_R> constMetas = new ConstMetaList<MST_PAY_NOTE_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			pay_note_mng_no_META,
			pay_note_mng_seq_META,
			slip_sts_typ_META,
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
			note_amt_META,
			cur_cd_META,
			pay_act_no_META,
			pay_act_seq_META,
			adv_pay_act_no_META,
			adv_pay_act_seq_META,
			a_imp_flg_META,
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
	protected MST_PAY_NOTE_R(ConstMetaList<? extends MST_PAY_NOTE_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_PAY_NOTE_R(ConstMetaList<? extends MST_PAY_NOTE_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_PAY_NOTE_R.$pay_note_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$pay_note_mng_no,
				"pay_note_mng_no",
				pay_note_mng_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NOTE_R.$pay_note_mng_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NOTE_R.$pay_note_mng_seq,
				"pay_note_mng_seq",
				pay_note_mng_seq,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NOTE_R.$slip_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$slip_sts_typ,
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
			MST_PAY_NOTE_R.$note_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$note_no,
				"note_no",
				note_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NOTE_R.$note_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$note_typ,
				"note_typ",
				note_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NOTE_R.$note_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$note_rsn_cd,
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
			MST_PAY_NOTE_R.$draw_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PAY_NOTE_R.$draw_dt,
				"draw_dt",
				draw_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NOTE_R.$due_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PAY_NOTE_R.$due_dt,
				"due_dt",
				due_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NOTE_R.$note_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NOTE_R.$note_days,
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
			MST_PAY_NOTE_R.$drawer_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$drawer_nm,
				"drawer_nm",
				drawer_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NOTE_R.$draw_bank_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$draw_bank_cd,
				"draw_bank_cd",
				draw_bank_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NOTE_R.$draw_branch_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$draw_branch_cd,
				"draw_branch_cd",
				draw_branch_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NOTE_R.$endrsr,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$endrsr,
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
			MST_PAY_NOTE_R.$accptr,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$accptr,
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
			MST_PAY_NOTE_R.$note_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NOTE_R.$note_amt,
				"note_amt",
				note_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NOTE_R.$cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$cur_cd,
				"cur_cd",
				cur_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NOTE_R.$pay_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$pay_act_no,
				"pay_act_no",
				pay_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NOTE_R.$pay_act_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NOTE_R.$pay_act_seq,
				"pay_act_seq",
				pay_act_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NOTE_R.$adv_pay_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$adv_pay_act_no,
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
			MST_PAY_NOTE_R.$adv_pay_act_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NOTE_R.$adv_pay_act_seq,
				"adv_pay_act_seq",
				adv_pay_act_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NOTE_R.$a_imp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PAY_NOTE_R.$a_imp_flg,
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
			MST_PAY_NOTE_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$sub_char1,
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
			MST_PAY_NOTE_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$sub_char2,
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
			MST_PAY_NOTE_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$sub_char3,
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
			MST_PAY_NOTE_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$ins_usr_id,
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
			MST_PAY_NOTE_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$ins_usr_nm,
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
			MST_PAY_NOTE_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PAY_NOTE_R.$ins_ts,
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
			MST_PAY_NOTE_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$ins_func_id,
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
			MST_PAY_NOTE_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NOTE_R.$upd_cntr,
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
			MST_PAY_NOTE_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$upd_usr_id,
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
			MST_PAY_NOTE_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$upd_usr_nm,
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
			MST_PAY_NOTE_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PAY_NOTE_R.$upd_ts,
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
			MST_PAY_NOTE_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$upd_func_id,
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
			MST_PAY_NOTE_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NOTE_R.$upd_srv_req_no,
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
	public static MST_PAY_NOTE_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_PAY_NOTE_R create(String alias) {
		MST_PAY_NOTE_R row = new MST_PAY_NOTE_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_PAY_NOTE_R createByName(T proto) {
		MST_PAY_NOTE_R row = MST_PAY_NOTE_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PAY_NOTE_R clone() {
		return (MST_PAY_NOTE_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PAY_NOTE_R createInstance() {
		return (MST_PAY_NOTE_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PAY_NOTE_R getValues(String... names) {
		return (MST_PAY_NOTE_R) super.getValues(names);
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
	 public MSW_PAY_NOTE_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_PAY_NOTE_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_PAY_NOTE_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_PAY_NOTE_KEY_R.TABLE_NAME);
	 }

	/**
	 * 支払手形管理ＮＯ. Notes payable management No..<p>
	 *
	 */
	public String pay_note_mng_no() {
		return getConstString(offset + 0, $pay_note_mng_no);
	}

	/**
	 * 支払手形管理ＮＯ. Notes payable management No..<p>
	 *
	 */
	public void pay_note_mng_no(String value) {
		setConstString(offset + 0, $pay_note_mng_no, value);
	}

	/**
	 * 支払手形管理連番. Notes payable management sequence number.<p>
	 *
	 */
	public MCNumber pay_note_mng_seq() {
		return getConstNumber(offset + 1, $pay_note_mng_seq);
	}

	/**
	 * 支払手形管理連番. Notes payable management sequence number.<p>
	 *
	 */
	public void pay_note_mng_seq(MCNumber value) {
		setConstNumber(offset + 1, $pay_note_mng_seq, value);
	}
	
	/**
	 * 支払手形管理連番. Notes payable management sequence number.<p>
	 *
	 */
	public void pay_note_mng_seq(int value) {
		setConstNumber(offset + 1, $pay_note_mng_seq, value);
	}
	
	/**
	 * 支払手形管理連番. Notes payable management sequence number.<p>
	 *
	 */
	public void pay_note_mng_seq(long value) {
		setConstNumber(offset + 1, $pay_note_mng_seq, value);
	}
	
	/**
	 * 支払手形管理連番. Notes payable management sequence number.<p>
	 *
	 */
	public void pay_note_mng_seq(float value) {
		setConstNumber(offset + 1, $pay_note_mng_seq, value);
	}
	
	/**
	 * 支払手形管理連番. Notes payable management sequence number.<p>
	 *
	 */
	public void pay_note_mng_seq(double value) {
		setConstNumber(offset + 1, $pay_note_mng_seq, value);
	}
	
	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 2, $slip_sts_typ);
	}

	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 2, $slip_sts_typ, value);
	}

	/**
	 * 手形番号. Note number.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 3, $note_no);
	}

	/**
	 * 手形番号. Note number.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 3, $note_no, value);
	}

	/**
	 * 手形区分. Note type.<p>
	 *
	 */
	public String note_typ() {
		return getConstString(offset + 4, $note_typ);
	}

	/**
	 * 手形区分. Note type.<p>
	 *
	 */
	public void note_typ(String value) {
		setConstString(offset + 4, $note_typ, value);
	}

	/**
	 * 手形理由ＣＤ. Note reason cd..<p>
	 *
	 */
	public String note_rsn_cd() {
		return getConstString(offset + 5, $note_rsn_cd);
	}

	/**
	 * 手形理由ＣＤ. Note reason cd..<p>
	 *
	 */
	public void note_rsn_cd(String value) {
		setConstString(offset + 5, $note_rsn_cd, value);
	}

	/**
	 * 振出日. Drawing date.<p>
	 *
	 */
	public MCDate draw_dt() {
		return getConstDate(offset + 6, $draw_dt);
	}

	/**
	 * 振出日. Drawing date.<p>
	 *
	 */
	public void draw_dt(MCDate value) {
		setConstDate(offset + 6, $draw_dt, value);
	}

	/**
	 * 支払期日. Payment due date.<p>
	 *
	 */
	public MCDate due_dt() {
		return getConstDate(offset + 7, $due_dt);
	}

	/**
	 * 支払期日. Payment due date.<p>
	 *
	 */
	public void due_dt(MCDate value) {
		setConstDate(offset + 7, $due_dt, value);
	}

	/**
	 * 手形サイト. Note sight.<p>
	 *
	 */
	public MCNumber note_days() {
		return getConstNumber(offset + 8, $note_days);
	}

	/**
	 * 手形サイト. Note sight.<p>
	 *
	 */
	public void note_days(MCNumber value) {
		setConstNumber(offset + 8, $note_days, value);
	}
	
	/**
	 * 手形サイト. Note sight.<p>
	 *
	 */
	public void note_days(int value) {
		setConstNumber(offset + 8, $note_days, value);
	}
	
	/**
	 * 手形サイト. Note sight.<p>
	 *
	 */
	public void note_days(long value) {
		setConstNumber(offset + 8, $note_days, value);
	}
	
	/**
	 * 手形サイト. Note sight.<p>
	 *
	 */
	public void note_days(float value) {
		setConstNumber(offset + 8, $note_days, value);
	}
	
	/**
	 * 手形サイト. Note sight.<p>
	 *
	 */
	public void note_days(double value) {
		setConstNumber(offset + 8, $note_days, value);
	}
	
	/**
	 * 振出人名. Drawer name.<p>
	 *
	 */
	public String drawer_nm() {
		return getConstString(offset + 9, $drawer_nm);
	}

	/**
	 * 振出人名. Drawer name.<p>
	 *
	 */
	public void drawer_nm(String value) {
		setConstString(offset + 9, $drawer_nm, value);
	}

	/**
	 * 振出銀行ＣＤ. Drawing bank cd..<p>
	 *
	 */
	public String draw_bank_cd() {
		return getConstString(offset + 10, $draw_bank_cd);
	}

	/**
	 * 振出銀行ＣＤ. Drawing bank cd..<p>
	 *
	 */
	public void draw_bank_cd(String value) {
		setConstString(offset + 10, $draw_bank_cd, value);
	}

	/**
	 * 振出支店ＣＤ. Drawing branch cd..<p>
	 *
	 */
	public String draw_branch_cd() {
		return getConstString(offset + 11, $draw_branch_cd);
	}

	/**
	 * 振出支店ＣＤ. Drawing branch cd..<p>
	 *
	 */
	public void draw_branch_cd(String value) {
		setConstString(offset + 11, $draw_branch_cd, value);
	}

	/**
	 * 裏書人. Endorser.<p>
	 *
	 */
	public String endrsr() {
		return getConstString(offset + 12, $endrsr);
	}

	/**
	 * 裏書人. Endorser.<p>
	 *
	 */
	public void endrsr(String value) {
		setConstString(offset + 12, $endrsr, value);
	}

	/**
	 * 引受人. Accepted by.<p>
	 *
	 */
	public String accptr() {
		return getConstString(offset + 13, $accptr);
	}

	/**
	 * 引受人. Accepted by.<p>
	 *
	 */
	public void accptr(String value) {
		setConstString(offset + 13, $accptr, value);
	}

	/**
	 * 手形額. Note amount.<p>
	 *
	 */
	public MCNumber note_amt() {
		return getConstNumber(offset + 14, $note_amt);
	}

	/**
	 * 手形額. Note amount.<p>
	 *
	 */
	public void note_amt(MCNumber value) {
		setConstNumber(offset + 14, $note_amt, value);
	}
	
	/**
	 * 手形額. Note amount.<p>
	 *
	 */
	public void note_amt(int value) {
		setConstNumber(offset + 14, $note_amt, value);
	}
	
	/**
	 * 手形額. Note amount.<p>
	 *
	 */
	public void note_amt(long value) {
		setConstNumber(offset + 14, $note_amt, value);
	}
	
	/**
	 * 手形額. Note amount.<p>
	 *
	 */
	public void note_amt(float value) {
		setConstNumber(offset + 14, $note_amt, value);
	}
	
	/**
	 * 手形額. Note amount.<p>
	 *
	 */
	public void note_amt(double value) {
		setConstNumber(offset + 14, $note_amt, value);
	}
	
	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 15, $cur_cd);
	}

	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 15, $cur_cd, value);
	}

	/**
	 * 支払実績ＮＯ. Payment result No..<p>
	 *
	 */
	public String pay_act_no() {
		return getConstString(offset + 16, $pay_act_no);
	}

	/**
	 * 支払実績ＮＯ. Payment result No..<p>
	 *
	 */
	public void pay_act_no(String value) {
		setConstString(offset + 16, $pay_act_no, value);
	}

	/**
	 * 支払実績連番. Payment result sequence No..<p>
	 *
	 */
	public MCNumber pay_act_seq() {
		return getConstNumber(offset + 17, $pay_act_seq);
	}

	/**
	 * 支払実績連番. Payment result sequence No..<p>
	 *
	 */
	public void pay_act_seq(MCNumber value) {
		setConstNumber(offset + 17, $pay_act_seq, value);
	}
	
	/**
	 * 支払実績連番. Payment result sequence No..<p>
	 *
	 */
	public void pay_act_seq(int value) {
		setConstNumber(offset + 17, $pay_act_seq, value);
	}
	
	/**
	 * 支払実績連番. Payment result sequence No..<p>
	 *
	 */
	public void pay_act_seq(long value) {
		setConstNumber(offset + 17, $pay_act_seq, value);
	}
	
	/**
	 * 支払実績連番. Payment result sequence No..<p>
	 *
	 */
	public void pay_act_seq(float value) {
		setConstNumber(offset + 17, $pay_act_seq, value);
	}
	
	/**
	 * 支払実績連番. Payment result sequence No..<p>
	 *
	 */
	public void pay_act_seq(double value) {
		setConstNumber(offset + 17, $pay_act_seq, value);
	}
	
	/**
	 * 前渡金支払実績ＮＯ. Advance payment amount payment result No..<p>
	 *
	 */
	public String adv_pay_act_no() {
		return getConstString(offset + 18, $adv_pay_act_no);
	}

	/**
	 * 前渡金支払実績ＮＯ. Advance payment amount payment result No..<p>
	 *
	 */
	public void adv_pay_act_no(String value) {
		setConstString(offset + 18, $adv_pay_act_no, value);
	}

	/**
	 * 前渡金支払実績連番. Advance payment amount payment result sequence number.<p>
	 *
	 */
	public MCNumber adv_pay_act_seq() {
		return getConstNumber(offset + 19, $adv_pay_act_seq);
	}

	/**
	 * 前渡金支払実績連番. Advance payment amount payment result sequence number.<p>
	 *
	 */
	public void adv_pay_act_seq(MCNumber value) {
		setConstNumber(offset + 19, $adv_pay_act_seq, value);
	}
	
	/**
	 * 前渡金支払実績連番. Advance payment amount payment result sequence number.<p>
	 *
	 */
	public void adv_pay_act_seq(int value) {
		setConstNumber(offset + 19, $adv_pay_act_seq, value);
	}
	
	/**
	 * 前渡金支払実績連番. Advance payment amount payment result sequence number.<p>
	 *
	 */
	public void adv_pay_act_seq(long value) {
		setConstNumber(offset + 19, $adv_pay_act_seq, value);
	}
	
	/**
	 * 前渡金支払実績連番. Advance payment amount payment result sequence number.<p>
	 *
	 */
	public void adv_pay_act_seq(float value) {
		setConstNumber(offset + 19, $adv_pay_act_seq, value);
	}
	
	/**
	 * 前渡金支払実績連番. Advance payment amount payment result sequence number.<p>
	 *
	 */
	public void adv_pay_act_seq(double value) {
		setConstNumber(offset + 19, $adv_pay_act_seq, value);
	}
	
	/**
	 * 会計ＩＦ取込済ＦＬＧ. Accounting IF imported flg..<p>
	 *
	 */
	public boolean a_imp_flg() {
		return getConstBoolean(offset + 20, $a_imp_flg);
	}

	/**
	 * 会計ＩＦ取込済ＦＬＧ. Accounting IF imported flg..<p>
	 *
	 */
	public void a_imp_flg(boolean value) {
		setConstBoolean(offset + 20, $a_imp_flg, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 21, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 21, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 22, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 22, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 23, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 23, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 24, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 24, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 25, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 25, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 26, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 26, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 27, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 27, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 28, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 28, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 28, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 28, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 28, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 28, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 29, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 29, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 30, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 30, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 31, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 31, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 32, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 32, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 33, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 33, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($pay_note_mng_no.equalsIgnoreCase(name)) {
			return pay_note_mng_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			return adv_pay_act_no();
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
		if ($pay_note_mng_seq.equalsIgnoreCase(name)) {
			return pay_note_mng_seq();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			return note_amt();
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			return pay_act_seq();
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			return adv_pay_act_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
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
		if ($a_imp_flg.equalsIgnoreCase(name)) {
			return a_imp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($pay_note_mng_no.equalsIgnoreCase(name)) {
			return pay_note_mng_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			return adv_pay_act_no();
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
		if ($pay_note_mng_seq.equalsIgnoreCase(name)) {
			return pay_note_mng_seq();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			return note_amt();
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			return pay_act_seq();
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			return adv_pay_act_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
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
		if ($a_imp_flg.equalsIgnoreCase(name)) {
			return a_imp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($pay_note_mng_no.equalsIgnoreCase(name)) {
			pay_note_mng_no(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			adv_pay_act_no(value);
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
		if ($pay_note_mng_seq.equalsIgnoreCase(name)) {
			pay_note_mng_seq(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($pay_note_mng_seq.equalsIgnoreCase(name)) {
			pay_note_mng_seq(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($pay_note_mng_seq.equalsIgnoreCase(name)) {
			pay_note_mng_seq(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($pay_note_mng_seq.equalsIgnoreCase(name)) {
			pay_note_mng_seq(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($pay_note_mng_seq.equalsIgnoreCase(name)) {
			pay_note_mng_seq(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
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
		if ($a_imp_flg.equalsIgnoreCase(name)) {
			a_imp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pay_note_mng_no.equalsIgnoreCase(name)) {
			pay_note_mng_no(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			adv_pay_act_no(value);
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
		if ($pay_note_mng_seq.equalsIgnoreCase(name)) {
			pay_note_mng_seq(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($pay_note_mng_seq.equalsIgnoreCase(name)) {
			pay_note_mng_seq(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($pay_note_mng_seq.equalsIgnoreCase(name)) {
			pay_note_mng_seq(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($pay_note_mng_seq.equalsIgnoreCase(name)) {
			pay_note_mng_seq(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($pay_note_mng_seq.equalsIgnoreCase(name)) {
			pay_note_mng_seq(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
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
		if ($a_imp_flg.equalsIgnoreCase(name)) {
			a_imp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
