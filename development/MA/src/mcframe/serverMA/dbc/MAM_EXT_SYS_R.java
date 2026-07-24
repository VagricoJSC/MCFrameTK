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
 * "外部システムマスタ // External system master"DBコンテナRowクラスです。<p>
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
 *  	<td>ext_sys_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外部システムＣＤ</td>
 *  	<td>External system cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ext_sys_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外部システム名</td>
 *  	<td>External system name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_ext_sys_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外部システム名（ベース）</td>
 *  	<td>External system name(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ext_sys_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外部システム区分</td>
 *  	<td>External system type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>web_api_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>Ｗｅｂ　ＡＰＩＦＬＧ</td>
 *  	<td>Web API flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cmd_exec_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>コマンド実行ＦＬＧ</td>
 *  	<td>Command execution flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>real_imp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>リアルタイム取込ＦＬＧ</td>
 *  	<td>Real time import flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>not_send_upd_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>送信後訂正不可ＦＬＧ</td>
 *  	<td>Uncorrectable after exporting flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>not_dup_imp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>重複取込不可ＦＬＧ</td>
 *  	<td>Do not allow duplicate import flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_upd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ更新区分</td>
 *  	<td>IF update type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_slip_split_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品書単位分割ＦＬＧ</td>
 *  	<td>Delivery note unit split flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>null_val_if_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＮＵＬＬ文字ＩＦＦＬＧ</td>
 *  	<td>NULL character IF flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upri_not_chk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>単価チェック対象外ＦＬＧ</td>
 *  	<td>Not for unit price check flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt_not_chk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額チェック対象外ＦＬＧ</td>
 *  	<td>Not for amount check flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_not_chk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>税チェック対象外ＦＬＧ</td>
 *  	<td>Not for tax check flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１</td>
 *  	<td>Memo 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２</td>
 *  	<td>Memo 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ３</td>
 *  	<td>Memo 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>論理削除ＦＬＧ</td>
 *  	<td>Logical delete flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザＩＤ</td>
 *  	<td>Logical delete user ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザ名</td>
 *  	<td>Logical delete user name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除日時</td>
 *  	<td>Logical delete date and time</td>
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
public class MAM_EXT_SYS_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_EXT_SYS";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	private static final MCPermColumnInfo _ext_sys_cd = createColumnInfo("ext_sys_cd");
	public final MCStringPermColumn ext_sys_cd = createStringColumn(_ext_sys_cd);
	
	/**
	 * 外部システム名. External system name.<p>
	 *
	 */
	public static final String $ext_sys_nm = "ext_sys_nm";
	private static final MCPermColumnInfo _ext_sys_nm = createColumnInfo("ext_sys_nm");
	public final MCStringPermColumn ext_sys_nm = createStringColumn(_ext_sys_nm);
	
	/**
	 * 外部システム名（ベース）. External system name(Base).<p>
	 *
	 */
	public static final String $base_ext_sys_nm = "base_ext_sys_nm";
	private static final MCPermColumnInfo _base_ext_sys_nm = createColumnInfo("base_ext_sys_nm");
	public final MCStringPermColumn base_ext_sys_nm = createStringColumn(_base_ext_sys_nm);
	
	/**
	 * 外部システム区分. External system type.<p>
	 *
	 */
	public static final String $ext_sys_typ = "ext_sys_typ";
	private static final MCPermColumnInfo _ext_sys_typ = createColumnInfo("ext_sys_typ");
	public final MCStringPermColumn ext_sys_typ = createStringColumn(_ext_sys_typ);
	
	/**
	 * Ｗｅｂ　ＡＰＩＦＬＧ. Web API flg..<p>
	 *
	 */
	public static final String $web_api_flg = "web_api_flg";
	private static final MCPermColumnInfo _web_api_flg = createColumnInfo("web_api_flg");
	public final MCBooleanPermColumn web_api_flg = createBooleanColumn(_web_api_flg);
	
	/**
	 * コマンド実行ＦＬＧ. Command execution flg..<p>
	 *
	 */
	public static final String $cmd_exec_flg = "cmd_exec_flg";
	private static final MCPermColumnInfo _cmd_exec_flg = createColumnInfo("cmd_exec_flg");
	public final MCBooleanPermColumn cmd_exec_flg = createBooleanColumn(_cmd_exec_flg);
	
	/**
	 * リアルタイム取込ＦＬＧ. Real time import flg..<p>
	 *
	 */
	public static final String $real_imp_flg = "real_imp_flg";
	private static final MCPermColumnInfo _real_imp_flg = createColumnInfo("real_imp_flg");
	public final MCBooleanPermColumn real_imp_flg = createBooleanColumn(_real_imp_flg);
	
	/**
	 * 送信後訂正不可ＦＬＧ. Uncorrectable after exporting flg..<p>
	 *
	 */
	public static final String $not_send_upd_flg = "not_send_upd_flg";
	private static final MCPermColumnInfo _not_send_upd_flg = createColumnInfo("not_send_upd_flg");
	public final MCBooleanPermColumn not_send_upd_flg = createBooleanColumn(_not_send_upd_flg);
	
	/**
	 * 重複取込不可ＦＬＧ. Do not allow duplicate import flg..<p>
	 *
	 */
	public static final String $not_dup_imp_flg = "not_dup_imp_flg";
	private static final MCPermColumnInfo _not_dup_imp_flg = createColumnInfo("not_dup_imp_flg");
	public final MCBooleanPermColumn not_dup_imp_flg = createBooleanColumn(_not_dup_imp_flg);
	
	/**
	 * ＩＦ更新区分. IF update type.<p>
	 *
	 */
	public static final String $if_upd_typ = "if_upd_typ";
	private static final MCPermColumnInfo _if_upd_typ = createColumnInfo("if_upd_typ");
	public final MCStringPermColumn if_upd_typ = createStringColumn(_if_upd_typ);
	
	/**
	 * 納品書単位分割ＦＬＧ. Delivery note unit split flg..<p>
	 *
	 */
	public static final String $dlv_slip_split_flg = "dlv_slip_split_flg";
	private static final MCPermColumnInfo _dlv_slip_split_flg = createColumnInfo("dlv_slip_split_flg");
	public final MCBooleanPermColumn dlv_slip_split_flg = createBooleanColumn(_dlv_slip_split_flg);
	
	/**
	 * ＮＵＬＬ文字ＩＦＦＬＧ. NULL character IF flg..<p>
	 *
	 */
	public static final String $null_val_if_flg = "null_val_if_flg";
	private static final MCPermColumnInfo _null_val_if_flg = createColumnInfo("null_val_if_flg");
	public final MCBooleanPermColumn null_val_if_flg = createBooleanColumn(_null_val_if_flg);
	
	/**
	 * 単価チェック対象外ＦＬＧ. Not for unit price check flg..<p>
	 *
	 */
	public static final String $upri_not_chk_flg = "upri_not_chk_flg";
	private static final MCPermColumnInfo _upri_not_chk_flg = createColumnInfo("upri_not_chk_flg");
	public final MCBooleanPermColumn upri_not_chk_flg = createBooleanColumn(_upri_not_chk_flg);
	
	/**
	 * 金額チェック対象外ＦＬＧ. Not for amount check flg..<p>
	 *
	 */
	public static final String $amt_not_chk_flg = "amt_not_chk_flg";
	private static final MCPermColumnInfo _amt_not_chk_flg = createColumnInfo("amt_not_chk_flg");
	public final MCBooleanPermColumn amt_not_chk_flg = createBooleanColumn(_amt_not_chk_flg);
	
	/**
	 * 税チェック対象外ＦＬＧ. Not for tax check flg..<p>
	 *
	 */
	public static final String $tax_not_chk_flg = "tax_not_chk_flg";
	private static final MCPermColumnInfo _tax_not_chk_flg = createColumnInfo("tax_not_chk_flg");
	public final MCBooleanPermColumn tax_not_chk_flg = createBooleanColumn(_tax_not_chk_flg);
	
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
	
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta base_ext_sys_nm_META = createCommonMeta($base_ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_sys_typ_META = createCommonMeta($ext_sys_typ, mcframe.commonMA.meta.MA_META.EXT_SYS_TYP);
	public static final MCMeta web_api_flg_META = createCommonMeta($web_api_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cmd_exec_flg_META = createCommonMeta($cmd_exec_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta real_imp_flg_META = createCommonMeta($real_imp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_send_upd_flg_META = createCommonMeta($not_send_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_dup_imp_flg_META = createCommonMeta($not_dup_imp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta if_upd_typ_META = createCommonMeta($if_upd_typ, mcframe.commonMA.meta.MA_META.IF_UPD_TYP);
	public static final MCMeta dlv_slip_split_flg_META = createCommonMeta($dlv_slip_split_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta null_val_if_flg_META = createCommonMeta($null_val_if_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upri_not_chk_flg_META = createCommonMeta($upri_not_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta amt_not_chk_flg_META = createCommonMeta($amt_not_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_not_chk_flg_META = createCommonMeta($tax_not_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
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

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAM_EXT_SYS_R> constMetas = new ConstMetaList<MAM_EXT_SYS_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			ext_sys_cd_META,
			ext_sys_nm_META,
			base_ext_sys_nm_META,
			ext_sys_typ_META,
			web_api_flg_META,
			cmd_exec_flg_META,
			real_imp_flg_META,
			not_send_upd_flg_META,
			not_dup_imp_flg_META,
			if_upd_typ_META,
			dlv_slip_split_flg_META,
			null_val_if_flg_META,
			upri_not_chk_flg_META,
			amt_not_chk_flg_META,
			tax_not_chk_flg_META,
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
	protected MAM_EXT_SYS_R(ConstMetaList<? extends MAM_EXT_SYS_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_EXT_SYS_R(ConstMetaList<? extends MAM_EXT_SYS_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_EXT_SYS_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_EXT_SYS_R.$ext_sys_cd,
				"ext_sys_cd",
				ext_sys_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_EXT_SYS_R.$ext_sys_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_EXT_SYS_R.$ext_sys_nm,
				"ext_sys_nm",
				ext_sys_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_EXT_SYS_R.$base_ext_sys_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_EXT_SYS_R.$base_ext_sys_nm,
				"base_ext_sys_nm",
				base_ext_sys_nm,
				false,
				false,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_EXT_SYS_R.$ext_sys_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_EXT_SYS_R.$ext_sys_typ,
				"ext_sys_typ",
				ext_sys_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_EXT_SYS_R.$web_api_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_EXT_SYS_R.$web_api_flg,
				"web_api_flg",
				web_api_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_EXT_SYS_R.$cmd_exec_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_EXT_SYS_R.$cmd_exec_flg,
				"cmd_exec_flg",
				cmd_exec_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_EXT_SYS_R.$real_imp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_EXT_SYS_R.$real_imp_flg,
				"real_imp_flg",
				real_imp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_EXT_SYS_R.$not_send_upd_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_EXT_SYS_R.$not_send_upd_flg,
				"not_send_upd_flg",
				not_send_upd_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_EXT_SYS_R.$not_dup_imp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_EXT_SYS_R.$not_dup_imp_flg,
				"not_dup_imp_flg",
				not_dup_imp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_EXT_SYS_R.$if_upd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_EXT_SYS_R.$if_upd_typ,
				"if_upd_typ",
				if_upd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_EXT_SYS_R.$dlv_slip_split_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_EXT_SYS_R.$dlv_slip_split_flg,
				"dlv_slip_split_flg",
				dlv_slip_split_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_EXT_SYS_R.$null_val_if_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_EXT_SYS_R.$null_val_if_flg,
				"null_val_if_flg",
				null_val_if_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_EXT_SYS_R.$upri_not_chk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_EXT_SYS_R.$upri_not_chk_flg,
				"upri_not_chk_flg",
				upri_not_chk_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_EXT_SYS_R.$amt_not_chk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_EXT_SYS_R.$amt_not_chk_flg,
				"amt_not_chk_flg",
				amt_not_chk_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_EXT_SYS_R.$tax_not_chk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_EXT_SYS_R.$tax_not_chk_flg,
				"tax_not_chk_flg",
				tax_not_chk_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_EXT_SYS_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_EXT_SYS_R.$memo1,
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
			MAM_EXT_SYS_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_EXT_SYS_R.$memo2,
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
			MAM_EXT_SYS_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_EXT_SYS_R.$memo3,
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
			MAM_EXT_SYS_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_EXT_SYS_R.$del_flg,
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
			MAM_EXT_SYS_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_EXT_SYS_R.$del_usr_id,
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
			MAM_EXT_SYS_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_EXT_SYS_R.$del_usr_nm,
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
			MAM_EXT_SYS_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_EXT_SYS_R.$del_ts,
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
			MAM_EXT_SYS_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_EXT_SYS_R.$ins_usr_id,
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
			MAM_EXT_SYS_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_EXT_SYS_R.$ins_usr_nm,
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
			MAM_EXT_SYS_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_EXT_SYS_R.$ins_ts,
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
			MAM_EXT_SYS_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_EXT_SYS_R.$ins_func_id,
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
			MAM_EXT_SYS_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_EXT_SYS_R.$upd_cntr,
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
			MAM_EXT_SYS_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_EXT_SYS_R.$upd_usr_id,
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
			MAM_EXT_SYS_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_EXT_SYS_R.$upd_usr_nm,
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
			MAM_EXT_SYS_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_EXT_SYS_R.$upd_ts,
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
			MAM_EXT_SYS_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_EXT_SYS_R.$upd_func_id,
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
			MAM_EXT_SYS_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_EXT_SYS_R.$upd_srv_req_no,
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
	public static MAM_EXT_SYS_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_EXT_SYS_R create(String alias) {
		MAM_EXT_SYS_R row = new MAM_EXT_SYS_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_EXT_SYS_R createByName(T proto) {
		MAM_EXT_SYS_R row = MAM_EXT_SYS_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_EXT_SYS_R clone() {
		return (MAM_EXT_SYS_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_EXT_SYS_R createInstance() {
		return (MAM_EXT_SYS_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_EXT_SYS_R getValues(String... names) {
		return (MAM_EXT_SYS_R) super.getValues(names);
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
	 public MAW_EXT_SYS_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_EXT_SYS_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_EXT_SYS_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_EXT_SYS_KEY_R.TABLE_NAME);
	 }

	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 0, $ext_sys_cd);
	}

	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 0, $ext_sys_cd, value);
	}

	/**
	 * 外部システム名. External system name.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 1, $ext_sys_nm);
	}

	/**
	 * 外部システム名. External system name.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 1, $ext_sys_nm, value);
	}

	/**
	 * 外部システム名（ベース）. External system name(Base).<p>
	 *
	 */
	public String base_ext_sys_nm() {
		return getConstString(offset + 2, $base_ext_sys_nm);
	}

	/**
	 * 外部システム名（ベース）. External system name(Base).<p>
	 *
	 */
	public void base_ext_sys_nm(String value) {
		setConstString(offset + 2, $base_ext_sys_nm, value);
	}

	/**
	 * 外部システム区分. External system type.<p>
	 *
	 */
	public String ext_sys_typ() {
		return getConstString(offset + 3, $ext_sys_typ);
	}

	/**
	 * 外部システム区分. External system type.<p>
	 *
	 */
	public void ext_sys_typ(String value) {
		setConstString(offset + 3, $ext_sys_typ, value);
	}

	/**
	 * Ｗｅｂ　ＡＰＩＦＬＧ. Web API flg..<p>
	 *
	 */
	public boolean web_api_flg() {
		return getConstBoolean(offset + 4, $web_api_flg);
	}

	/**
	 * Ｗｅｂ　ＡＰＩＦＬＧ. Web API flg..<p>
	 *
	 */
	public void web_api_flg(boolean value) {
		setConstBoolean(offset + 4, $web_api_flg, value);
	}

	/**
	 * コマンド実行ＦＬＧ. Command execution flg..<p>
	 *
	 */
	public boolean cmd_exec_flg() {
		return getConstBoolean(offset + 5, $cmd_exec_flg);
	}

	/**
	 * コマンド実行ＦＬＧ. Command execution flg..<p>
	 *
	 */
	public void cmd_exec_flg(boolean value) {
		setConstBoolean(offset + 5, $cmd_exec_flg, value);
	}

	/**
	 * リアルタイム取込ＦＬＧ. Real time import flg..<p>
	 *
	 */
	public boolean real_imp_flg() {
		return getConstBoolean(offset + 6, $real_imp_flg);
	}

	/**
	 * リアルタイム取込ＦＬＧ. Real time import flg..<p>
	 *
	 */
	public void real_imp_flg(boolean value) {
		setConstBoolean(offset + 6, $real_imp_flg, value);
	}

	/**
	 * 送信後訂正不可ＦＬＧ. Uncorrectable after exporting flg..<p>
	 *
	 */
	public boolean not_send_upd_flg() {
		return getConstBoolean(offset + 7, $not_send_upd_flg);
	}

	/**
	 * 送信後訂正不可ＦＬＧ. Uncorrectable after exporting flg..<p>
	 *
	 */
	public void not_send_upd_flg(boolean value) {
		setConstBoolean(offset + 7, $not_send_upd_flg, value);
	}

	/**
	 * 重複取込不可ＦＬＧ. Do not allow duplicate import flg..<p>
	 *
	 */
	public boolean not_dup_imp_flg() {
		return getConstBoolean(offset + 8, $not_dup_imp_flg);
	}

	/**
	 * 重複取込不可ＦＬＧ. Do not allow duplicate import flg..<p>
	 *
	 */
	public void not_dup_imp_flg(boolean value) {
		setConstBoolean(offset + 8, $not_dup_imp_flg, value);
	}

	/**
	 * ＩＦ更新区分. IF update type.<p>
	 *
	 */
	public String if_upd_typ() {
		return getConstString(offset + 9, $if_upd_typ);
	}

	/**
	 * ＩＦ更新区分. IF update type.<p>
	 *
	 */
	public void if_upd_typ(String value) {
		setConstString(offset + 9, $if_upd_typ, value);
	}

	/**
	 * 納品書単位分割ＦＬＧ. Delivery note unit split flg..<p>
	 *
	 */
	public boolean dlv_slip_split_flg() {
		return getConstBoolean(offset + 10, $dlv_slip_split_flg);
	}

	/**
	 * 納品書単位分割ＦＬＧ. Delivery note unit split flg..<p>
	 *
	 */
	public void dlv_slip_split_flg(boolean value) {
		setConstBoolean(offset + 10, $dlv_slip_split_flg, value);
	}

	/**
	 * ＮＵＬＬ文字ＩＦＦＬＧ. NULL character IF flg..<p>
	 *
	 */
	public boolean null_val_if_flg() {
		return getConstBoolean(offset + 11, $null_val_if_flg);
	}

	/**
	 * ＮＵＬＬ文字ＩＦＦＬＧ. NULL character IF flg..<p>
	 *
	 */
	public void null_val_if_flg(boolean value) {
		setConstBoolean(offset + 11, $null_val_if_flg, value);
	}

	/**
	 * 単価チェック対象外ＦＬＧ. Not for unit price check flg..<p>
	 *
	 */
	public boolean upri_not_chk_flg() {
		return getConstBoolean(offset + 12, $upri_not_chk_flg);
	}

	/**
	 * 単価チェック対象外ＦＬＧ. Not for unit price check flg..<p>
	 *
	 */
	public void upri_not_chk_flg(boolean value) {
		setConstBoolean(offset + 12, $upri_not_chk_flg, value);
	}

	/**
	 * 金額チェック対象外ＦＬＧ. Not for amount check flg..<p>
	 *
	 */
	public boolean amt_not_chk_flg() {
		return getConstBoolean(offset + 13, $amt_not_chk_flg);
	}

	/**
	 * 金額チェック対象外ＦＬＧ. Not for amount check flg..<p>
	 *
	 */
	public void amt_not_chk_flg(boolean value) {
		setConstBoolean(offset + 13, $amt_not_chk_flg, value);
	}

	/**
	 * 税チェック対象外ＦＬＧ. Not for tax check flg..<p>
	 *
	 */
	public boolean tax_not_chk_flg() {
		return getConstBoolean(offset + 14, $tax_not_chk_flg);
	}

	/**
	 * 税チェック対象外ＦＬＧ. Not for tax check flg..<p>
	 *
	 */
	public void tax_not_chk_flg(boolean value) {
		setConstBoolean(offset + 14, $tax_not_chk_flg, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 15, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 15, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 16, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 16, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 17, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 17, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 18, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 18, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 19, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 19, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 20, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 20, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 21, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 21, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 22, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 22, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 23, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 23, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 24, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 24, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 25, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 25, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 26, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 26, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 26, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 26, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 26, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 26, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 27, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 27, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 28, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 28, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 29, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 29, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 30, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 30, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 31, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 31, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($base_ext_sys_nm.equalsIgnoreCase(name)) {
			return base_ext_sys_nm();
		}
		if ($ext_sys_typ.equalsIgnoreCase(name)) {
			return ext_sys_typ();
		}
		if ($if_upd_typ.equalsIgnoreCase(name)) {
			return if_upd_typ();
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
		if ($web_api_flg.equalsIgnoreCase(name)) {
			return web_api_flg();
		}
		if ($cmd_exec_flg.equalsIgnoreCase(name)) {
			return cmd_exec_flg();
		}
		if ($real_imp_flg.equalsIgnoreCase(name)) {
			return real_imp_flg();
		}
		if ($not_send_upd_flg.equalsIgnoreCase(name)) {
			return not_send_upd_flg();
		}
		if ($not_dup_imp_flg.equalsIgnoreCase(name)) {
			return not_dup_imp_flg();
		}
		if ($dlv_slip_split_flg.equalsIgnoreCase(name)) {
			return dlv_slip_split_flg();
		}
		if ($null_val_if_flg.equalsIgnoreCase(name)) {
			return null_val_if_flg();
		}
		if ($upri_not_chk_flg.equalsIgnoreCase(name)) {
			return upri_not_chk_flg();
		}
		if ($amt_not_chk_flg.equalsIgnoreCase(name)) {
			return amt_not_chk_flg();
		}
		if ($tax_not_chk_flg.equalsIgnoreCase(name)) {
			return tax_not_chk_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($base_ext_sys_nm.equalsIgnoreCase(name)) {
			return base_ext_sys_nm();
		}
		if ($ext_sys_typ.equalsIgnoreCase(name)) {
			return ext_sys_typ();
		}
		if ($if_upd_typ.equalsIgnoreCase(name)) {
			return if_upd_typ();
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
		if ($web_api_flg.equalsIgnoreCase(name)) {
			return web_api_flg();
		}
		if ($cmd_exec_flg.equalsIgnoreCase(name)) {
			return cmd_exec_flg();
		}
		if ($real_imp_flg.equalsIgnoreCase(name)) {
			return real_imp_flg();
		}
		if ($not_send_upd_flg.equalsIgnoreCase(name)) {
			return not_send_upd_flg();
		}
		if ($not_dup_imp_flg.equalsIgnoreCase(name)) {
			return not_dup_imp_flg();
		}
		if ($dlv_slip_split_flg.equalsIgnoreCase(name)) {
			return dlv_slip_split_flg();
		}
		if ($null_val_if_flg.equalsIgnoreCase(name)) {
			return null_val_if_flg();
		}
		if ($upri_not_chk_flg.equalsIgnoreCase(name)) {
			return upri_not_chk_flg();
		}
		if ($amt_not_chk_flg.equalsIgnoreCase(name)) {
			return amt_not_chk_flg();
		}
		if ($tax_not_chk_flg.equalsIgnoreCase(name)) {
			return tax_not_chk_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($base_ext_sys_nm.equalsIgnoreCase(name)) {
			base_ext_sys_nm(value);
			return;
		}
		if ($ext_sys_typ.equalsIgnoreCase(name)) {
			ext_sys_typ(value);
			return;
		}
		if ($if_upd_typ.equalsIgnoreCase(name)) {
			if_upd_typ(value);
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
		if ($web_api_flg.equalsIgnoreCase(name)) {
			web_api_flg(value);
			return;
		}
		if ($cmd_exec_flg.equalsIgnoreCase(name)) {
			cmd_exec_flg(value);
			return;
		}
		if ($real_imp_flg.equalsIgnoreCase(name)) {
			real_imp_flg(value);
			return;
		}
		if ($not_send_upd_flg.equalsIgnoreCase(name)) {
			not_send_upd_flg(value);
			return;
		}
		if ($not_dup_imp_flg.equalsIgnoreCase(name)) {
			not_dup_imp_flg(value);
			return;
		}
		if ($dlv_slip_split_flg.equalsIgnoreCase(name)) {
			dlv_slip_split_flg(value);
			return;
		}
		if ($null_val_if_flg.equalsIgnoreCase(name)) {
			null_val_if_flg(value);
			return;
		}
		if ($upri_not_chk_flg.equalsIgnoreCase(name)) {
			upri_not_chk_flg(value);
			return;
		}
		if ($amt_not_chk_flg.equalsIgnoreCase(name)) {
			amt_not_chk_flg(value);
			return;
		}
		if ($tax_not_chk_flg.equalsIgnoreCase(name)) {
			tax_not_chk_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($base_ext_sys_nm.equalsIgnoreCase(name)) {
			base_ext_sys_nm(value);
			return;
		}
		if ($ext_sys_typ.equalsIgnoreCase(name)) {
			ext_sys_typ(value);
			return;
		}
		if ($if_upd_typ.equalsIgnoreCase(name)) {
			if_upd_typ(value);
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
		if ($web_api_flg.equalsIgnoreCase(name)) {
			web_api_flg(value);
			return;
		}
		if ($cmd_exec_flg.equalsIgnoreCase(name)) {
			cmd_exec_flg(value);
			return;
		}
		if ($real_imp_flg.equalsIgnoreCase(name)) {
			real_imp_flg(value);
			return;
		}
		if ($not_send_upd_flg.equalsIgnoreCase(name)) {
			not_send_upd_flg(value);
			return;
		}
		if ($not_dup_imp_flg.equalsIgnoreCase(name)) {
			not_dup_imp_flg(value);
			return;
		}
		if ($dlv_slip_split_flg.equalsIgnoreCase(name)) {
			dlv_slip_split_flg(value);
			return;
		}
		if ($null_val_if_flg.equalsIgnoreCase(name)) {
			null_val_if_flg(value);
			return;
		}
		if ($upri_not_chk_flg.equalsIgnoreCase(name)) {
			upri_not_chk_flg(value);
			return;
		}
		if ($amt_not_chk_flg.equalsIgnoreCase(name)) {
			amt_not_chk_flg(value);
			return;
		}
		if ($tax_not_chk_flg.equalsIgnoreCase(name)) {
			tax_not_chk_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
