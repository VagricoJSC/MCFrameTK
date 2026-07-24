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
 * "会計伝票区分仕訳マスタ // Accounting slip type journal master"DBコンテナRowクラスです。<p>
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
 *  	<td>ac_slip_typ</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会計伝票区分</td>
 *  	<td>Accounting slip type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>summary_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>集計区分</td>
 *  	<td>Aggregation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_no_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注ＮＯ使用ＦＬＧ</td>
 *  	<td>Sales order No. used flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>po_no_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注ＮＯ使用ＦＬＧ</td>
 *  	<td>PO No. use flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>iv_no_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>インボイスＮＯ使用ＦＬＧ</td>
 *  	<td>Invoice No. used flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_no_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求／支払ＮＯ使用ＦＬＧ</td>
 *  	<td>Billing/payment No. used flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_unit_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引単位使用ＦＬＧ</td>
 *  	<td>Transaction unit used flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>red_input_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取消データ取込ＦＬＧ</td>
 *  	<td>Cancel data import flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>jnl_act_cd</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕訳実行ＣＤ</td>
 *  	<td>Journalizing cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>auto_jnl_key_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>自動仕訳キーＣＤ</td>
 *  	<td>Auto-journal key cd.</td>
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
 *  	<td>jnl_act_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>JNL_ACT1.JNL_ACT_NM</td>
 *  	<td>仕訳実行名</td>
 *  	<td>Journalizing name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>auto_jnl_key_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>AUTO_JNL_KEY1.AUTO_JNL_KEY_NM</td>
 *  	<td>自動仕訳キー名</td>
 *  	<td>Auto-journal key name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_SLIP_JNL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_SLIP_JNL";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public static final String $ac_slip_typ = "ac_slip_typ";
	private static final MCPermColumnInfo _ac_slip_typ = createColumnInfo("ac_slip_typ");
	public final MCStringPermColumn ac_slip_typ = createStringColumn(_ac_slip_typ);
	
	/**
	 * 集計区分. Aggregation type.<p>
	 *
	 */
	public static final String $summary_typ = "summary_typ";
	private static final MCPermColumnInfo _summary_typ = createColumnInfo("summary_typ");
	public final MCStringPermColumn summary_typ = createStringColumn(_summary_typ);
	
	/**
	 * 受注ＮＯ使用ＦＬＧ. Sales order No. used flg..<p>
	 *
	 */
	public static final String $slo_no_flg = "slo_no_flg";
	private static final MCPermColumnInfo _slo_no_flg = createColumnInfo("slo_no_flg");
	public final MCBooleanPermColumn slo_no_flg = createBooleanColumn(_slo_no_flg);
	
	/**
	 * 発注ＮＯ使用ＦＬＧ. PO No. use flg..<p>
	 *
	 */
	public static final String $po_no_flg = "po_no_flg";
	private static final MCPermColumnInfo _po_no_flg = createColumnInfo("po_no_flg");
	public final MCBooleanPermColumn po_no_flg = createBooleanColumn(_po_no_flg);
	
	/**
	 * インボイスＮＯ使用ＦＬＧ. Invoice No. used flg..<p>
	 *
	 */
	public static final String $iv_no_flg = "iv_no_flg";
	private static final MCPermColumnInfo _iv_no_flg = createColumnInfo("iv_no_flg");
	public final MCBooleanPermColumn iv_no_flg = createBooleanColumn(_iv_no_flg);
	
	/**
	 * 請求／支払ＮＯ使用ＦＬＧ. Billing/payment No. used flg..<p>
	 *
	 */
	public static final String $bill_no_flg = "bill_no_flg";
	private static final MCPermColumnInfo _bill_no_flg = createColumnInfo("bill_no_flg");
	public final MCBooleanPermColumn bill_no_flg = createBooleanColumn(_bill_no_flg);
	
	/**
	 * 取引単位使用ＦＬＧ. Transaction unit used flg..<p>
	 *
	 */
	public static final String $trd_unit_flg = "trd_unit_flg";
	private static final MCPermColumnInfo _trd_unit_flg = createColumnInfo("trd_unit_flg");
	public final MCBooleanPermColumn trd_unit_flg = createBooleanColumn(_trd_unit_flg);
	
	/**
	 * 取消データ取込ＦＬＧ. Cancel data import flg..<p>
	 *
	 */
	public static final String $red_input_flg = "red_input_flg";
	private static final MCPermColumnInfo _red_input_flg = createColumnInfo("red_input_flg");
	public final MCBooleanPermColumn red_input_flg = createBooleanColumn(_red_input_flg);
	
	/**
	 * 仕訳実行ＣＤ. Journalizing cd..<p>
	 *
	 */
	public static final String $jnl_act_cd = "jnl_act_cd";
	private static final MCPermColumnInfo _jnl_act_cd = createColumnInfo("jnl_act_cd");
	public final MCStringPermColumn jnl_act_cd = createStringColumn(_jnl_act_cd);
	
	/**
	 * 自動仕訳キーＣＤ. Auto-journal key cd..<p>
	 *
	 */
	public static final String $auto_jnl_key_cd = "auto_jnl_key_cd";
	private static final MCPermColumnInfo _auto_jnl_key_cd = createColumnInfo("auto_jnl_key_cd");
	public final MCStringPermColumn auto_jnl_key_cd = createStringColumn(_auto_jnl_key_cd);
	
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
	 * 仕訳実行名. Journalizing name.<p>
	 *
	 */
	public static final String $jnl_act_nm = "jnl_act_nm";
	
	/**
	 * 自動仕訳キー名. Auto-journal key name.<p>
	 *
	 */
	public static final String $auto_jnl_key_nm = "auto_jnl_key_nm";
	
	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta summary_typ_META = createCommonMeta($summary_typ, mcframe.commonMA.meta.MA_META.SUMMARY_TYP);
	public static final MCMeta slo_no_flg_META = createCommonMeta($slo_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_no_flg_META = createCommonMeta($po_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_no_flg_META = createCommonMeta($iv_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_no_flg_META = createCommonMeta($bill_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_flg_META = createCommonMeta($trd_unit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta red_input_flg_META = createCommonMeta($red_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta jnl_act_cd_META = createCommonMeta($jnl_act_cd, mcframe.commonMA.meta.MA_META.JNL_ACT_CD);
	public static final MCMeta auto_jnl_key_cd_META = createCommonMeta($auto_jnl_key_cd, mcframe.commonMA.meta.MA_META.AUTO_JNL_KEY_CD);
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
	public static final MCMeta jnl_act_nm_META = createCommonMeta($jnl_act_nm, mcframe.commonMA.meta.MA_META.JNL_ACT_NM);
	public static final MCMeta auto_jnl_key_nm_META = createCommonMeta($auto_jnl_key_nm, mcframe.commonMA.meta.MA_META.AUTO_JNL_KEY_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $JNL_ACT1 = "JNL_ACT1";
	public static final String $AUTO_JNL_KEY1 = "AUTO_JNL_KEY1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_JNL_ACT",
				$JNL_ACT1,
				new String[][]{
						{"jnl_act_cd", "jnl_act_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_JNL_ACT_R.create("JNL_ACT1");
				},
				(alias) -> {
					MAM_SLIP_JNL_R own = MAM_SLIP_JNL_R.create(alias);
					mcframe.serverMA.dbc.MAM_JNL_ACT_R ref = mcframe.serverMA.dbc.MAM_JNL_ACT_R.create("JNL_ACT1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.jnl_act_cd.eq(ref.jnl_act_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_AUTO_JNL_KEY",
				$AUTO_JNL_KEY1,
				new String[][]{
						{"auto_jnl_key_cd", "auto_jnl_key_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_AUTO_JNL_KEY_R.create("AUTO_JNL_KEY1");
				},
				(alias) -> {
					MAM_SLIP_JNL_R own = MAM_SLIP_JNL_R.create(alias);
					mcframe.serverMA.dbc.MAM_AUTO_JNL_KEY_R ref = mcframe.serverMA.dbc.MAM_AUTO_JNL_KEY_R.create("AUTO_JNL_KEY1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.auto_jnl_key_cd.eq(ref.auto_jnl_key_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_SLIP_JNL_R> constMetas = new ConstMetaList<MAM_SLIP_JNL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			ac_slip_typ_META,
			summary_typ_META,
			slo_no_flg_META,
			po_no_flg_META,
			iv_no_flg_META,
			bill_no_flg_META,
			trd_unit_flg_META,
			red_input_flg_META,
			jnl_act_cd_META,
			auto_jnl_key_cd_META,
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
			jnl_act_nm_META,
			auto_jnl_key_nm_META
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
	protected MAM_SLIP_JNL_R(ConstMetaList<? extends MAM_SLIP_JNL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_SLIP_JNL_R(ConstMetaList<? extends MAM_SLIP_JNL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_SLIP_JNL_R.$ac_slip_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SLIP_JNL_R.$ac_slip_typ,
				"ac_slip_typ",
				ac_slip_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SLIP_JNL_R.$summary_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SLIP_JNL_R.$summary_typ,
				"summary_typ",
				summary_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SLIP_JNL_R.$slo_no_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_SLIP_JNL_R.$slo_no_flg,
				"slo_no_flg",
				slo_no_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SLIP_JNL_R.$po_no_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_SLIP_JNL_R.$po_no_flg,
				"po_no_flg",
				po_no_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SLIP_JNL_R.$iv_no_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_SLIP_JNL_R.$iv_no_flg,
				"iv_no_flg",
				iv_no_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SLIP_JNL_R.$bill_no_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_SLIP_JNL_R.$bill_no_flg,
				"bill_no_flg",
				bill_no_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SLIP_JNL_R.$trd_unit_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_SLIP_JNL_R.$trd_unit_flg,
				"trd_unit_flg",
				trd_unit_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SLIP_JNL_R.$red_input_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_SLIP_JNL_R.$red_input_flg,
				"red_input_flg",
				red_input_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SLIP_JNL_R.$jnl_act_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SLIP_JNL_R.$jnl_act_cd,
				"jnl_act_cd",
				jnl_act_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SLIP_JNL_R.$auto_jnl_key_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SLIP_JNL_R.$auto_jnl_key_cd,
				"auto_jnl_key_cd",
				auto_jnl_key_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SLIP_JNL_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SLIP_JNL_R.$memo1,
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
			MAM_SLIP_JNL_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SLIP_JNL_R.$memo2,
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
			MAM_SLIP_JNL_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SLIP_JNL_R.$memo3,
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
			MAM_SLIP_JNL_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_SLIP_JNL_R.$del_flg,
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
			MAM_SLIP_JNL_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SLIP_JNL_R.$del_usr_id,
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
			MAM_SLIP_JNL_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SLIP_JNL_R.$del_usr_nm,
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
			MAM_SLIP_JNL_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_SLIP_JNL_R.$del_ts,
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
			MAM_SLIP_JNL_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SLIP_JNL_R.$ins_usr_id,
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
			MAM_SLIP_JNL_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SLIP_JNL_R.$ins_usr_nm,
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
			MAM_SLIP_JNL_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_SLIP_JNL_R.$ins_ts,
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
			MAM_SLIP_JNL_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SLIP_JNL_R.$ins_func_id,
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
			MAM_SLIP_JNL_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_SLIP_JNL_R.$upd_cntr,
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
			MAM_SLIP_JNL_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SLIP_JNL_R.$upd_usr_id,
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
			MAM_SLIP_JNL_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SLIP_JNL_R.$upd_usr_nm,
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
			MAM_SLIP_JNL_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_SLIP_JNL_R.$upd_ts,
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
			MAM_SLIP_JNL_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SLIP_JNL_R.$upd_func_id,
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
			MAM_SLIP_JNL_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SLIP_JNL_R.$upd_srv_req_no,
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
			MAM_SLIP_JNL_R.$jnl_act_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SLIP_JNL_R.$jnl_act_nm,
				"jnl_act_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"JNL_ACT1.JNL_ACT_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_SLIP_JNL_R.$auto_jnl_key_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SLIP_JNL_R.$auto_jnl_key_nm,
				"auto_jnl_key_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"AUTO_JNL_KEY1.AUTO_JNL_KEY_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_SLIP_JNL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_SLIP_JNL_R create(String alias) {
		MAM_SLIP_JNL_R row = new MAM_SLIP_JNL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_SLIP_JNL_R createByName(T proto) {
		MAM_SLIP_JNL_R row = MAM_SLIP_JNL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_SLIP_JNL_R clone() {
		return (MAM_SLIP_JNL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_SLIP_JNL_R createInstance() {
		return (MAM_SLIP_JNL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_SLIP_JNL_R getValues(String... names) {
		return (MAM_SLIP_JNL_R) super.getValues(names);
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
	 public MAW_SLIP_JNL_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_SLIP_JNL_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_SLIP_JNL_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_SLIP_JNL_KEY_R.TABLE_NAME);
	 }

	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 0, $ac_slip_typ);
	}

	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 0, $ac_slip_typ, value);
	}

	/**
	 * 集計区分. Aggregation type.<p>
	 *
	 */
	public String summary_typ() {
		return getConstString(offset + 1, $summary_typ);
	}

	/**
	 * 集計区分. Aggregation type.<p>
	 *
	 */
	public void summary_typ(String value) {
		setConstString(offset + 1, $summary_typ, value);
	}

	/**
	 * 受注ＮＯ使用ＦＬＧ. Sales order No. used flg..<p>
	 *
	 */
	public boolean slo_no_flg() {
		return getConstBoolean(offset + 2, $slo_no_flg);
	}

	/**
	 * 受注ＮＯ使用ＦＬＧ. Sales order No. used flg..<p>
	 *
	 */
	public void slo_no_flg(boolean value) {
		setConstBoolean(offset + 2, $slo_no_flg, value);
	}

	/**
	 * 発注ＮＯ使用ＦＬＧ. PO No. use flg..<p>
	 *
	 */
	public boolean po_no_flg() {
		return getConstBoolean(offset + 3, $po_no_flg);
	}

	/**
	 * 発注ＮＯ使用ＦＬＧ. PO No. use flg..<p>
	 *
	 */
	public void po_no_flg(boolean value) {
		setConstBoolean(offset + 3, $po_no_flg, value);
	}

	/**
	 * インボイスＮＯ使用ＦＬＧ. Invoice No. used flg..<p>
	 *
	 */
	public boolean iv_no_flg() {
		return getConstBoolean(offset + 4, $iv_no_flg);
	}

	/**
	 * インボイスＮＯ使用ＦＬＧ. Invoice No. used flg..<p>
	 *
	 */
	public void iv_no_flg(boolean value) {
		setConstBoolean(offset + 4, $iv_no_flg, value);
	}

	/**
	 * 請求／支払ＮＯ使用ＦＬＧ. Billing/payment No. used flg..<p>
	 *
	 */
	public boolean bill_no_flg() {
		return getConstBoolean(offset + 5, $bill_no_flg);
	}

	/**
	 * 請求／支払ＮＯ使用ＦＬＧ. Billing/payment No. used flg..<p>
	 *
	 */
	public void bill_no_flg(boolean value) {
		setConstBoolean(offset + 5, $bill_no_flg, value);
	}

	/**
	 * 取引単位使用ＦＬＧ. Transaction unit used flg..<p>
	 *
	 */
	public boolean trd_unit_flg() {
		return getConstBoolean(offset + 6, $trd_unit_flg);
	}

	/**
	 * 取引単位使用ＦＬＧ. Transaction unit used flg..<p>
	 *
	 */
	public void trd_unit_flg(boolean value) {
		setConstBoolean(offset + 6, $trd_unit_flg, value);
	}

	/**
	 * 取消データ取込ＦＬＧ. Cancel data import flg..<p>
	 *
	 */
	public boolean red_input_flg() {
		return getConstBoolean(offset + 7, $red_input_flg);
	}

	/**
	 * 取消データ取込ＦＬＧ. Cancel data import flg..<p>
	 *
	 */
	public void red_input_flg(boolean value) {
		setConstBoolean(offset + 7, $red_input_flg, value);
	}

	/**
	 * 仕訳実行ＣＤ. Journalizing cd..<p>
	 *
	 */
	public String jnl_act_cd() {
		return getConstString(offset + 8, $jnl_act_cd);
	}

	/**
	 * 仕訳実行ＣＤ. Journalizing cd..<p>
	 *
	 */
	public void jnl_act_cd(String value) {
		setConstString(offset + 8, $jnl_act_cd, value);
	}

	/**
	 * 自動仕訳キーＣＤ. Auto-journal key cd..<p>
	 *
	 */
	public String auto_jnl_key_cd() {
		return getConstString(offset + 9, $auto_jnl_key_cd);
	}

	/**
	 * 自動仕訳キーＣＤ. Auto-journal key cd..<p>
	 *
	 */
	public void auto_jnl_key_cd(String value) {
		setConstString(offset + 9, $auto_jnl_key_cd, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 10, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 10, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 11, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 11, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 12, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 12, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 13, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 13, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 14, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 14, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 15, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 15, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 16, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 16, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 17, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 17, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 18, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 18, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 19, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 19, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 20, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 20, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 21, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 21, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 21, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 21, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 21, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 21, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 22, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 22, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 23, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 23, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 24, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 24, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 25, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 25, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 26, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 26, $upd_srv_req_no, value);
	}

	/**
	 * 仕訳実行名. Journalizing name.<p>
	 *
	 */
	public String jnl_act_nm() {
		return getConstString(offset + 27, $jnl_act_nm);
	}

	/**
	 * 仕訳実行名. Journalizing name.<p>
	 *
	 */
	public void jnl_act_nm(String value) {
		setConstString(offset + 27, $jnl_act_nm, value);
	}

	/**
	 * 自動仕訳キー名. Auto-journal key name.<p>
	 *
	 */
	public String auto_jnl_key_nm() {
		return getConstString(offset + 28, $auto_jnl_key_nm);
	}

	/**
	 * 自動仕訳キー名. Auto-journal key name.<p>
	 *
	 */
	public void auto_jnl_key_nm(String value) {
		setConstString(offset + 28, $auto_jnl_key_nm, value);
	}

	public String getString(String name) {
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($summary_typ.equalsIgnoreCase(name)) {
			return summary_typ();
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			return jnl_act_cd();
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			return auto_jnl_key_cd();
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
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			return jnl_act_nm();
		}
		if ($auto_jnl_key_nm.equalsIgnoreCase(name)) {
			return auto_jnl_key_nm();
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
		if ($slo_no_flg.equalsIgnoreCase(name)) {
			return slo_no_flg();
		}
		if ($po_no_flg.equalsIgnoreCase(name)) {
			return po_no_flg();
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			return iv_no_flg();
		}
		if ($bill_no_flg.equalsIgnoreCase(name)) {
			return bill_no_flg();
		}
		if ($trd_unit_flg.equalsIgnoreCase(name)) {
			return trd_unit_flg();
		}
		if ($red_input_flg.equalsIgnoreCase(name)) {
			return red_input_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($summary_typ.equalsIgnoreCase(name)) {
			return summary_typ();
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			return jnl_act_cd();
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			return auto_jnl_key_cd();
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
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			return jnl_act_nm();
		}
		if ($auto_jnl_key_nm.equalsIgnoreCase(name)) {
			return auto_jnl_key_nm();
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
		if ($slo_no_flg.equalsIgnoreCase(name)) {
			return slo_no_flg();
		}
		if ($po_no_flg.equalsIgnoreCase(name)) {
			return po_no_flg();
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			return iv_no_flg();
		}
		if ($bill_no_flg.equalsIgnoreCase(name)) {
			return bill_no_flg();
		}
		if ($trd_unit_flg.equalsIgnoreCase(name)) {
			return trd_unit_flg();
		}
		if ($red_input_flg.equalsIgnoreCase(name)) {
			return red_input_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($summary_typ.equalsIgnoreCase(name)) {
			summary_typ(value);
			return;
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			jnl_act_cd(value);
			return;
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			auto_jnl_key_cd(value);
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
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			jnl_act_nm(value);
			return;
		}
		if ($auto_jnl_key_nm.equalsIgnoreCase(name)) {
			auto_jnl_key_nm(value);
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
		if ($slo_no_flg.equalsIgnoreCase(name)) {
			slo_no_flg(value);
			return;
		}
		if ($po_no_flg.equalsIgnoreCase(name)) {
			po_no_flg(value);
			return;
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			iv_no_flg(value);
			return;
		}
		if ($bill_no_flg.equalsIgnoreCase(name)) {
			bill_no_flg(value);
			return;
		}
		if ($trd_unit_flg.equalsIgnoreCase(name)) {
			trd_unit_flg(value);
			return;
		}
		if ($red_input_flg.equalsIgnoreCase(name)) {
			red_input_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($summary_typ.equalsIgnoreCase(name)) {
			summary_typ(value);
			return;
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			jnl_act_cd(value);
			return;
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			auto_jnl_key_cd(value);
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
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			jnl_act_nm(value);
			return;
		}
		if ($auto_jnl_key_nm.equalsIgnoreCase(name)) {
			auto_jnl_key_nm(value);
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
		if ($slo_no_flg.equalsIgnoreCase(name)) {
			slo_no_flg(value);
			return;
		}
		if ($po_no_flg.equalsIgnoreCase(name)) {
			po_no_flg(value);
			return;
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			iv_no_flg(value);
			return;
		}
		if ($bill_no_flg.equalsIgnoreCase(name)) {
			bill_no_flg(value);
			return;
		}
		if ($trd_unit_flg.equalsIgnoreCase(name)) {
			trd_unit_flg(value);
			return;
		}
		if ($red_input_flg.equalsIgnoreCase(name)) {
			red_input_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
