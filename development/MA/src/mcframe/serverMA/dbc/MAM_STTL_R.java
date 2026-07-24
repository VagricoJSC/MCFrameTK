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
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
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
 * "決済方法マスタ // Settlement method master"DBコンテナRowクラスです。<p>
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
 *  	<td>sttl_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>決済方法ＣＤ</td>
 *  	<td>Settlement method cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sttl_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>決済方法名</td>
 *  	<td>Settlement method name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_sttl_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>決済方法名（ベース）</td>
 *  	<td>Settlement method name(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_sttl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債権決済方法ＦＬＧ</td>
 *  	<td>AR settlement method flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ap_sttl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債務決済方法ＦＬＧ</td>
 *  	<td>AP settlement method flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_sttl_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権決済区分</td>
 *  	<td>AR settlement type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcv_reg_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金登録区分</td>
 *  	<td>Payment received entry type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_purc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上仕入税区分</td>
 *  	<td>Sales purchase tax type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>calc_com_paid_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手数料計算ＦＬＧ</td>
 *  	<td>Fee calculation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_setoff_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>相殺方法ＣＤ</td>
 *  	<td>Offset method cd.</td>
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
 *  	<td>ap_sttl_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債務決済区分</td>
 *  	<td>AP settlement type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ap_setoff_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債務相殺先区分</td>
 *  	<td>AP offset destination type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ap_setoff_act_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債務相殺実績計上ＦＬＧ</td>
 *  	<td>AP offset result recording flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_tax_disp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求書税額表示ＦＬＧ</td>
 *  	<td>Display tax amount on invoice flg.</td>
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
 *  	<td>memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１</td>
 *  	<td>Memo 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２</td>
 *  	<td>Memo 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ３</td>
 *  	<td>Memo 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>論理削除ＦＬＧ</td>
 *  	<td>Logical delete flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザＩＤ</td>
 *  	<td>Logical delete user ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザ名</td>
 *  	<td>Logical delete user name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除日時</td>
 *  	<td>Logical delete date and time</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_STTL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_STTL";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 決済方法ＣＤ. Settlement method cd..<p>
	 *
	 */
	public static final String $sttl_cd = "sttl_cd";
	private static final MCPermColumnInfo _sttl_cd = createColumnInfo("sttl_cd");
	public final MCStringPermColumn sttl_cd = createStringColumn(_sttl_cd);
	
	/**
	 * 決済方法名. Settlement method name.<p>
	 *
	 */
	public static final String $sttl_nm = "sttl_nm";
	private static final MCPermColumnInfo _sttl_nm = createColumnInfo("sttl_nm");
	public final MCStringPermColumn sttl_nm = createStringColumn(_sttl_nm);
	
	/**
	 * 決済方法名（ベース）. Settlement method name(Base).<p>
	 *
	 */
	public static final String $base_sttl_nm = "base_sttl_nm";
	private static final MCPermColumnInfo _base_sttl_nm = createColumnInfo("base_sttl_nm");
	public final MCStringPermColumn base_sttl_nm = createStringColumn(_base_sttl_nm);
	
	/**
	 * 債権決済方法ＦＬＧ. AR settlement method flg..<p>
	 *
	 */
	public static final String $ar_sttl_flg = "ar_sttl_flg";
	private static final MCPermColumnInfo _ar_sttl_flg = createColumnInfo("ar_sttl_flg");
	public final MCBooleanPermColumn ar_sttl_flg = createBooleanColumn(_ar_sttl_flg);
	
	/**
	 * 債務決済方法ＦＬＧ. AP settlement method flg..<p>
	 *
	 */
	public static final String $ap_sttl_flg = "ap_sttl_flg";
	private static final MCPermColumnInfo _ap_sttl_flg = createColumnInfo("ap_sttl_flg");
	public final MCBooleanPermColumn ap_sttl_flg = createBooleanColumn(_ap_sttl_flg);
	
	/**
	 * 債権決済区分. AR settlement type.<p>
	 *
	 */
	public static final String $ar_sttl_typ = "ar_sttl_typ";
	private static final MCPermColumnInfo _ar_sttl_typ = createColumnInfo("ar_sttl_typ");
	public final MCStringPermColumn ar_sttl_typ = createStringColumn(_ar_sttl_typ);
	
	/**
	 * 入金登録区分. Payment received entry type.<p>
	 *
	 */
	public static final String $rcv_reg_typ = "rcv_reg_typ";
	private static final MCPermColumnInfo _rcv_reg_typ = createColumnInfo("rcv_reg_typ");
	public final MCStringPermColumn rcv_reg_typ = createStringColumn(_rcv_reg_typ);
	
	/**
	 * 売上仕入税区分. Sales purchase tax type.<p>
	 *
	 */
	public static final String $sls_purc_typ = "sls_purc_typ";
	private static final MCPermColumnInfo _sls_purc_typ = createColumnInfo("sls_purc_typ");
	public final MCStringPermColumn sls_purc_typ = createStringColumn(_sls_purc_typ);
	
	/**
	 * 手数料計算ＦＬＧ. Fee calculation flg..<p>
	 *
	 */
	public static final String $calc_com_paid_flg = "calc_com_paid_flg";
	private static final MCPermColumnInfo _calc_com_paid_flg = createColumnInfo("calc_com_paid_flg");
	public final MCBooleanPermColumn calc_com_paid_flg = createBooleanColumn(_calc_com_paid_flg);
	
	/**
	 * 相殺方法ＣＤ. Offset method cd..<p>
	 *
	 */
	public static final String $ar_setoff_cd = "ar_setoff_cd";
	private static final MCPermColumnInfo _ar_setoff_cd = createColumnInfo("ar_setoff_cd");
	public final MCStringPermColumn ar_setoff_cd = createStringColumn(_ar_setoff_cd);
	
	/**
	 * 債権債務先識別区分. AR/AP BP identification type.<p>
	 *
	 */
	public static final String $debt_cred_id_typ = "debt_cred_id_typ";
	private static final MCPermColumnInfo _debt_cred_id_typ = createColumnInfo("debt_cred_id_typ");
	public final MCStringPermColumn debt_cred_id_typ = createStringColumn(_debt_cred_id_typ);
	
	/**
	 * 債務決済区分. AP settlement type.<p>
	 *
	 */
	public static final String $ap_sttl_typ = "ap_sttl_typ";
	private static final MCPermColumnInfo _ap_sttl_typ = createColumnInfo("ap_sttl_typ");
	public final MCStringPermColumn ap_sttl_typ = createStringColumn(_ap_sttl_typ);
	
	/**
	 * 債務相殺先区分. AP offset destination type.<p>
	 *
	 */
	public static final String $ap_setoff_typ = "ap_setoff_typ";
	private static final MCPermColumnInfo _ap_setoff_typ = createColumnInfo("ap_setoff_typ");
	public final MCStringPermColumn ap_setoff_typ = createStringColumn(_ap_setoff_typ);
	
	/**
	 * 債務相殺実績計上ＦＬＧ. AP offset result recording flg..<p>
	 *
	 */
	public static final String $ap_setoff_act_flg = "ap_setoff_act_flg";
	private static final MCPermColumnInfo _ap_setoff_act_flg = createColumnInfo("ap_setoff_act_flg");
	public final MCBooleanPermColumn ap_setoff_act_flg = createBooleanColumn(_ap_setoff_act_flg);
	
	/**
	 * 請求書税額表示ＦＬＧ. Display tax amount on invoice flg..<p>
	 *
	 */
	public static final String $bill_tax_disp_flg = "bill_tax_disp_flg";
	private static final MCPermColumnInfo _bill_tax_disp_flg = createColumnInfo("bill_tax_disp_flg");
	public final MCBooleanPermColumn bill_tax_disp_flg = createBooleanColumn(_bill_tax_disp_flg);
	
	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	private static final MCPermColumnInfo _ac_rsn_cd = createColumnInfo("ac_rsn_cd");
	public final MCStringPermColumn ac_rsn_cd = createStringColumn(_ac_rsn_cd);
	
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
	 * 会計理由名. Accounting reason name.<p>
	 *
	 */
	public static final String $ac_rsn_nm = "ac_rsn_nm";
	
	public static final MCMeta sttl_cd_META = createCommonMeta($sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta sttl_nm_META = createCommonMeta($sttl_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta base_sttl_nm_META = createCommonMeta($base_sttl_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta ar_sttl_flg_META = createCommonMeta($ar_sttl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_sttl_flg_META = createCommonMeta($ap_sttl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_sttl_typ_META = createCommonMeta($ar_sttl_typ, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta rcv_reg_typ_META = createCommonMeta($rcv_reg_typ, mcframe.commonMA.meta.MA_META.RCV_REG_TYP);
	public static final MCMeta sls_purc_typ_META = createCommonMeta($sls_purc_typ, mcframe.commonMA.meta.MA_META.SLS_PURC_TYP);
	public static final MCMeta calc_com_paid_flg_META = createCommonMeta($calc_com_paid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_setoff_cd_META = createCommonMeta($ar_setoff_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta debt_cred_id_typ_META = createCommonMeta($debt_cred_id_typ, mcframe.commonMA.meta.MA_META.DEBT_CRED_ID_TYP);
	public static final MCMeta ap_sttl_typ_META = createCommonMeta($ap_sttl_typ, mcframe.commonMA.meta.MA_META.AP_STTL_TYP);
	public static final MCMeta ap_setoff_typ_META = createCommonMeta($ap_setoff_typ, mcframe.commonMA.meta.MA_META.AP_SETOFF_TYP);
	public static final MCMeta ap_setoff_act_flg_META = createCommonMeta($ap_setoff_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_tax_disp_flg_META = createCommonMeta($bill_tax_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
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
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $AC_RSN1 = "AC_RSN1";
	static {
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
					MAM_STTL_R own = MAM_STTL_R.create(alias);
					mcframe.serverMA.dbc.MAM_AC_RSN_R ref = mcframe.serverMA.dbc.MAM_AC_RSN_R.create("AC_RSN1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.ac_rsn_cd.eq(ref.ac_rsn_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_STTL_R> constMetas = new ConstMetaList<MAM_STTL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			sttl_cd_META,
			sttl_nm_META,
			base_sttl_nm_META,
			ar_sttl_flg_META,
			ap_sttl_flg_META,
			ar_sttl_typ_META,
			rcv_reg_typ_META,
			sls_purc_typ_META,
			calc_com_paid_flg_META,
			ar_setoff_cd_META,
			debt_cred_id_typ_META,
			ap_sttl_typ_META,
			ap_setoff_typ_META,
			ap_setoff_act_flg_META,
			bill_tax_disp_flg_META,
			ac_rsn_cd_META,
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
			ac_rsn_nm_META
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
	protected MAM_STTL_R(ConstMetaList<? extends MAM_STTL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_STTL_R(ConstMetaList<? extends MAM_STTL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_STTL_R.$sttl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$sttl_cd,
				"sttl_cd",
				sttl_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STTL_R.$sttl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$sttl_nm,
				"sttl_nm",
				sttl_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STTL_R.$base_sttl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$base_sttl_nm,
				"base_sttl_nm",
				base_sttl_nm,
				false,
				false,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STTL_R.$ar_sttl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_STTL_R.$ar_sttl_flg,
				"ar_sttl_flg",
				ar_sttl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STTL_R.$ap_sttl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_STTL_R.$ap_sttl_flg,
				"ap_sttl_flg",
				ap_sttl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STTL_R.$ar_sttl_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$ar_sttl_typ,
				"ar_sttl_typ",
				ar_sttl_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STTL_R.$rcv_reg_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$rcv_reg_typ,
				"rcv_reg_typ",
				rcv_reg_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STTL_R.$sls_purc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$sls_purc_typ,
				"sls_purc_typ",
				sls_purc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STTL_R.$calc_com_paid_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_STTL_R.$calc_com_paid_flg,
				"calc_com_paid_flg",
				calc_com_paid_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STTL_R.$ar_setoff_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$ar_setoff_cd,
				"ar_setoff_cd",
				ar_setoff_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STTL_R.$debt_cred_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$debt_cred_id_typ,
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
			MAM_STTL_R.$ap_sttl_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$ap_sttl_typ,
				"ap_sttl_typ",
				ap_sttl_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STTL_R.$ap_setoff_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$ap_setoff_typ,
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
			MAM_STTL_R.$ap_setoff_act_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_STTL_R.$ap_setoff_act_flg,
				"ap_setoff_act_flg",
				ap_setoff_act_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STTL_R.$bill_tax_disp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_STTL_R.$bill_tax_disp_flg,
				"bill_tax_disp_flg",
				bill_tax_disp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STTL_R.$ac_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$ac_rsn_cd,
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
			MAM_STTL_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$memo1,
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
			MAM_STTL_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$memo2,
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
			MAM_STTL_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$memo3,
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
			MAM_STTL_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_STTL_R.$del_flg,
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
			MAM_STTL_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$del_usr_id,
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
			MAM_STTL_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$del_usr_nm,
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
			MAM_STTL_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_STTL_R.$del_ts,
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
			MAM_STTL_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$ins_usr_id,
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
			MAM_STTL_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$ins_usr_nm,
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
			MAM_STTL_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_STTL_R.$ins_ts,
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
			MAM_STTL_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$ins_func_id,
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
			MAM_STTL_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_STTL_R.$upd_cntr,
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
			MAM_STTL_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$upd_usr_id,
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
			MAM_STTL_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$upd_usr_nm,
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
			MAM_STTL_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_STTL_R.$upd_ts,
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
			MAM_STTL_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$upd_func_id,
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
			MAM_STTL_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$upd_srv_req_no,
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
			MAM_STTL_R.$ac_rsn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STTL_R.$ac_rsn_nm,
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
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_STTL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_STTL_R create(String alias) {
		MAM_STTL_R row = new MAM_STTL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_STTL_R createByName(T proto) {
		MAM_STTL_R row = MAM_STTL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_STTL_R clone() {
		return (MAM_STTL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_STTL_R createInstance() {
		return (MAM_STTL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_STTL_R getValues(String... names) {
		return (MAM_STTL_R) super.getValues(names);
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
		return true;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_STTL_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_STTL_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_STTL_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_STTL_KEY_R.TABLE_NAME);
	 }

	/**
	 * 決済方法ＣＤ. Settlement method cd..<p>
	 *
	 */
	public String sttl_cd() {
		return getConstString(offset + 0, $sttl_cd);
	}

	/**
	 * 決済方法ＣＤ. Settlement method cd..<p>
	 *
	 */
	public void sttl_cd(String value) {
		setConstString(offset + 0, $sttl_cd, value);
	}

	/**
	 * 決済方法名. Settlement method name.<p>
	 *
	 */
	public String sttl_nm() {
		return getConstString(offset + 1, $sttl_nm);
	}

	/**
	 * 決済方法名. Settlement method name.<p>
	 *
	 */
	public void sttl_nm(String value) {
		setConstString(offset + 1, $sttl_nm, value);
	}

	/**
	 * 決済方法名（ベース）. Settlement method name(Base).<p>
	 *
	 */
	public String base_sttl_nm() {
		return getConstString(offset + 2, $base_sttl_nm);
	}

	/**
	 * 決済方法名（ベース）. Settlement method name(Base).<p>
	 *
	 */
	public void base_sttl_nm(String value) {
		setConstString(offset + 2, $base_sttl_nm, value);
	}

	/**
	 * 債権決済方法ＦＬＧ. AR settlement method flg..<p>
	 *
	 */
	public boolean ar_sttl_flg() {
		return getConstBoolean(offset + 3, $ar_sttl_flg);
	}

	/**
	 * 債権決済方法ＦＬＧ. AR settlement method flg..<p>
	 *
	 */
	public void ar_sttl_flg(boolean value) {
		setConstBoolean(offset + 3, $ar_sttl_flg, value);
	}

	/**
	 * 債務決済方法ＦＬＧ. AP settlement method flg..<p>
	 *
	 */
	public boolean ap_sttl_flg() {
		return getConstBoolean(offset + 4, $ap_sttl_flg);
	}

	/**
	 * 債務決済方法ＦＬＧ. AP settlement method flg..<p>
	 *
	 */
	public void ap_sttl_flg(boolean value) {
		setConstBoolean(offset + 4, $ap_sttl_flg, value);
	}

	/**
	 * 債権決済区分. AR settlement type.<p>
	 *
	 */
	public String ar_sttl_typ() {
		return getConstString(offset + 5, $ar_sttl_typ);
	}

	/**
	 * 債権決済区分. AR settlement type.<p>
	 *
	 */
	public void ar_sttl_typ(String value) {
		setConstString(offset + 5, $ar_sttl_typ, value);
	}

	/**
	 * 入金登録区分. Payment received entry type.<p>
	 *
	 */
	public String rcv_reg_typ() {
		return getConstString(offset + 6, $rcv_reg_typ);
	}

	/**
	 * 入金登録区分. Payment received entry type.<p>
	 *
	 */
	public void rcv_reg_typ(String value) {
		setConstString(offset + 6, $rcv_reg_typ, value);
	}

	/**
	 * 売上仕入税区分. Sales purchase tax type.<p>
	 *
	 */
	public String sls_purc_typ() {
		return getConstString(offset + 7, $sls_purc_typ);
	}

	/**
	 * 売上仕入税区分. Sales purchase tax type.<p>
	 *
	 */
	public void sls_purc_typ(String value) {
		setConstString(offset + 7, $sls_purc_typ, value);
	}

	/**
	 * 手数料計算ＦＬＧ. Fee calculation flg..<p>
	 *
	 */
	public boolean calc_com_paid_flg() {
		return getConstBoolean(offset + 8, $calc_com_paid_flg);
	}

	/**
	 * 手数料計算ＦＬＧ. Fee calculation flg..<p>
	 *
	 */
	public void calc_com_paid_flg(boolean value) {
		setConstBoolean(offset + 8, $calc_com_paid_flg, value);
	}

	/**
	 * 相殺方法ＣＤ. Offset method cd..<p>
	 *
	 */
	public String ar_setoff_cd() {
		return getConstString(offset + 9, $ar_setoff_cd);
	}

	/**
	 * 相殺方法ＣＤ. Offset method cd..<p>
	 *
	 */
	public void ar_setoff_cd(String value) {
		setConstString(offset + 9, $ar_setoff_cd, value);
	}

	/**
	 * 債権債務先識別区分. AR/AP BP identification type.<p>
	 *
	 */
	public String debt_cred_id_typ() {
		return getConstString(offset + 10, $debt_cred_id_typ);
	}

	/**
	 * 債権債務先識別区分. AR/AP BP identification type.<p>
	 *
	 */
	public void debt_cred_id_typ(String value) {
		setConstString(offset + 10, $debt_cred_id_typ, value);
	}

	/**
	 * 債務決済区分. AP settlement type.<p>
	 *
	 */
	public String ap_sttl_typ() {
		return getConstString(offset + 11, $ap_sttl_typ);
	}

	/**
	 * 債務決済区分. AP settlement type.<p>
	 *
	 */
	public void ap_sttl_typ(String value) {
		setConstString(offset + 11, $ap_sttl_typ, value);
	}

	/**
	 * 債務相殺先区分. AP offset destination type.<p>
	 *
	 */
	public String ap_setoff_typ() {
		return getConstString(offset + 12, $ap_setoff_typ);
	}

	/**
	 * 債務相殺先区分. AP offset destination type.<p>
	 *
	 */
	public void ap_setoff_typ(String value) {
		setConstString(offset + 12, $ap_setoff_typ, value);
	}

	/**
	 * 債務相殺実績計上ＦＬＧ. AP offset result recording flg..<p>
	 *
	 */
	public boolean ap_setoff_act_flg() {
		return getConstBoolean(offset + 13, $ap_setoff_act_flg);
	}

	/**
	 * 債務相殺実績計上ＦＬＧ. AP offset result recording flg..<p>
	 *
	 */
	public void ap_setoff_act_flg(boolean value) {
		setConstBoolean(offset + 13, $ap_setoff_act_flg, value);
	}

	/**
	 * 請求書税額表示ＦＬＧ. Display tax amount on invoice flg..<p>
	 *
	 */
	public boolean bill_tax_disp_flg() {
		return getConstBoolean(offset + 14, $bill_tax_disp_flg);
	}

	/**
	 * 請求書税額表示ＦＬＧ. Display tax amount on invoice flg..<p>
	 *
	 */
	public void bill_tax_disp_flg(boolean value) {
		setConstBoolean(offset + 14, $bill_tax_disp_flg, value);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 15, $ac_rsn_cd);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 15, $ac_rsn_cd, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 16, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 16, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 17, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 17, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 18, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 18, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 19, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 19, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 20, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 20, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 21, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 21, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 22, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 22, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 23, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 23, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 24, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 24, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 25, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 25, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 26, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 26, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 27, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 28, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 28, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 29, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 29, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 30, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 30, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 31, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 31, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 32, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 32, $upd_srv_req_no, value);
	}

	/**
	 * 会計理由名. Accounting reason name.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 33, $ac_rsn_nm);
	}

	/**
	 * 会計理由名. Accounting reason name.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 33, $ac_rsn_nm, value);
	}

	public String getString(String name) {
		if ($sttl_cd.equalsIgnoreCase(name)) {
			return sttl_cd();
		}
		if ($sttl_nm.equalsIgnoreCase(name)) {
			return sttl_nm();
		}
		if ($base_sttl_nm.equalsIgnoreCase(name)) {
			return base_sttl_nm();
		}
		if ($ar_sttl_typ.equalsIgnoreCase(name)) {
			return ar_sttl_typ();
		}
		if ($rcv_reg_typ.equalsIgnoreCase(name)) {
			return rcv_reg_typ();
		}
		if ($sls_purc_typ.equalsIgnoreCase(name)) {
			return sls_purc_typ();
		}
		if ($ar_setoff_cd.equalsIgnoreCase(name)) {
			return ar_setoff_cd();
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			return debt_cred_id_typ();
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			return ap_sttl_typ();
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			return ap_setoff_typ();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
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
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
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
		if ($ar_sttl_flg.equalsIgnoreCase(name)) {
			return ar_sttl_flg();
		}
		if ($ap_sttl_flg.equalsIgnoreCase(name)) {
			return ap_sttl_flg();
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			return calc_com_paid_flg();
		}
		if ($ap_setoff_act_flg.equalsIgnoreCase(name)) {
			return ap_setoff_act_flg();
		}
		if ($bill_tax_disp_flg.equalsIgnoreCase(name)) {
			return bill_tax_disp_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($sttl_cd.equalsIgnoreCase(name)) {
			return sttl_cd();
		}
		if ($sttl_nm.equalsIgnoreCase(name)) {
			return sttl_nm();
		}
		if ($base_sttl_nm.equalsIgnoreCase(name)) {
			return base_sttl_nm();
		}
		if ($ar_sttl_typ.equalsIgnoreCase(name)) {
			return ar_sttl_typ();
		}
		if ($rcv_reg_typ.equalsIgnoreCase(name)) {
			return rcv_reg_typ();
		}
		if ($sls_purc_typ.equalsIgnoreCase(name)) {
			return sls_purc_typ();
		}
		if ($ar_setoff_cd.equalsIgnoreCase(name)) {
			return ar_setoff_cd();
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			return debt_cred_id_typ();
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			return ap_sttl_typ();
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			return ap_setoff_typ();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
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
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
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
		if ($ar_sttl_flg.equalsIgnoreCase(name)) {
			return ar_sttl_flg();
		}
		if ($ap_sttl_flg.equalsIgnoreCase(name)) {
			return ap_sttl_flg();
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			return calc_com_paid_flg();
		}
		if ($ap_setoff_act_flg.equalsIgnoreCase(name)) {
			return ap_setoff_act_flg();
		}
		if ($bill_tax_disp_flg.equalsIgnoreCase(name)) {
			return bill_tax_disp_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($sttl_cd.equalsIgnoreCase(name)) {
			sttl_cd(value);
			return;
		}
		if ($sttl_nm.equalsIgnoreCase(name)) {
			sttl_nm(value);
			return;
		}
		if ($base_sttl_nm.equalsIgnoreCase(name)) {
			base_sttl_nm(value);
			return;
		}
		if ($ar_sttl_typ.equalsIgnoreCase(name)) {
			ar_sttl_typ(value);
			return;
		}
		if ($rcv_reg_typ.equalsIgnoreCase(name)) {
			rcv_reg_typ(value);
			return;
		}
		if ($sls_purc_typ.equalsIgnoreCase(name)) {
			sls_purc_typ(value);
			return;
		}
		if ($ar_setoff_cd.equalsIgnoreCase(name)) {
			ar_setoff_cd(value);
			return;
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			debt_cred_id_typ(value);
			return;
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			ap_sttl_typ(value);
			return;
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			ap_setoff_typ(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
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
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
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
		if ($ar_sttl_flg.equalsIgnoreCase(name)) {
			ar_sttl_flg(value);
			return;
		}
		if ($ap_sttl_flg.equalsIgnoreCase(name)) {
			ap_sttl_flg(value);
			return;
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			calc_com_paid_flg(value);
			return;
		}
		if ($ap_setoff_act_flg.equalsIgnoreCase(name)) {
			ap_setoff_act_flg(value);
			return;
		}
		if ($bill_tax_disp_flg.equalsIgnoreCase(name)) {
			bill_tax_disp_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sttl_cd.equalsIgnoreCase(name)) {
			sttl_cd(value);
			return;
		}
		if ($sttl_nm.equalsIgnoreCase(name)) {
			sttl_nm(value);
			return;
		}
		if ($base_sttl_nm.equalsIgnoreCase(name)) {
			base_sttl_nm(value);
			return;
		}
		if ($ar_sttl_typ.equalsIgnoreCase(name)) {
			ar_sttl_typ(value);
			return;
		}
		if ($rcv_reg_typ.equalsIgnoreCase(name)) {
			rcv_reg_typ(value);
			return;
		}
		if ($sls_purc_typ.equalsIgnoreCase(name)) {
			sls_purc_typ(value);
			return;
		}
		if ($ar_setoff_cd.equalsIgnoreCase(name)) {
			ar_setoff_cd(value);
			return;
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			debt_cred_id_typ(value);
			return;
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			ap_sttl_typ(value);
			return;
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			ap_setoff_typ(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
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
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
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
		if ($ar_sttl_flg.equalsIgnoreCase(name)) {
			ar_sttl_flg(value);
			return;
		}
		if ($ap_sttl_flg.equalsIgnoreCase(name)) {
			ap_sttl_flg(value);
			return;
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			calc_com_paid_flg(value);
			return;
		}
		if ($ap_setoff_act_flg.equalsIgnoreCase(name)) {
			ap_setoff_act_flg(value);
			return;
		}
		if ($bill_tax_disp_flg.equalsIgnoreCase(name)) {
			bill_tax_disp_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
