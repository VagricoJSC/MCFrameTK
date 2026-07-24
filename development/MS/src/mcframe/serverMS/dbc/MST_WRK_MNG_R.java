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
 * "案件管理 // Sales project management"DBコンテナRowクラスです。<p>
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
 *  	<td>wrk_mng_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>案件管理区分</td>
 *  	<td>Sales project management type</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>wrk_mng_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>案件管理ＣＤ</td>
 *  	<td>Sales project management cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wrk_mng_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>案件管理名</td>
 *  	<td>Sales project management name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>str1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列１</td>
 *  	<td>String 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>str2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列２</td>
 *  	<td>String 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>str3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列３</td>
 *  	<td>String 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>num1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数値１</td>
 *  	<td>Numerical 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>num2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数値２</td>
 *  	<td>Numerical 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>num3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数値３</td>
 *  	<td>Numerical 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>flg1</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>フラグ１</td>
 *  	<td>Flg. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>flg2</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>フラグ２</td>
 *  	<td>Flg. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>flg3</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>フラグ３</td>
 *  	<td>Flg. 3</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_WRK_MNG_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_WRK_MNG";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 案件管理区分. Sales project management type.<p>
	 *
	 */
	public static final String $wrk_mng_typ = "wrk_mng_typ";
	private static final MCPermColumnInfo _wrk_mng_typ = createColumnInfo("wrk_mng_typ");
	public final MCStringPermColumn wrk_mng_typ = createStringColumn(_wrk_mng_typ);
	
	/**
	 * 案件管理ＣＤ. Sales project management cd..<p>
	 *
	 */
	public static final String $wrk_mng_cd = "wrk_mng_cd";
	private static final MCPermColumnInfo _wrk_mng_cd = createColumnInfo("wrk_mng_cd");
	public final MCStringPermColumn wrk_mng_cd = createStringColumn(_wrk_mng_cd);
	
	/**
	 * 案件管理名. Sales project management name.<p>
	 *
	 */
	public static final String $wrk_mng_nm = "wrk_mng_nm";
	private static final MCPermColumnInfo _wrk_mng_nm = createColumnInfo("wrk_mng_nm");
	public final MCStringPermColumn wrk_mng_nm = createStringColumn(_wrk_mng_nm);
	
	/**
	 * 文字列１. String 1.<p>
	 *
	 */
	public static final String $str1 = "str1";
	private static final MCPermColumnInfo _str1 = createColumnInfo("str1");
	public final MCStringPermColumn str1 = createStringColumn(_str1);
	
	/**
	 * 文字列２. String 2.<p>
	 *
	 */
	public static final String $str2 = "str2";
	private static final MCPermColumnInfo _str2 = createColumnInfo("str2");
	public final MCStringPermColumn str2 = createStringColumn(_str2);
	
	/**
	 * 文字列３. String 3.<p>
	 *
	 */
	public static final String $str3 = "str3";
	private static final MCPermColumnInfo _str3 = createColumnInfo("str3");
	public final MCStringPermColumn str3 = createStringColumn(_str3);
	
	/**
	 * 数値１. Numerical 1.<p>
	 *
	 */
	public static final String $num1 = "num1";
	private static final MCPermColumnInfo _num1 = createColumnInfo("num1");
	public final MCNumberPermColumn num1 = createNumberColumn(_num1);
	
	/**
	 * 数値２. Numerical 2.<p>
	 *
	 */
	public static final String $num2 = "num2";
	private static final MCPermColumnInfo _num2 = createColumnInfo("num2");
	public final MCNumberPermColumn num2 = createNumberColumn(_num2);
	
	/**
	 * 数値３. Numerical 3.<p>
	 *
	 */
	public static final String $num3 = "num3";
	private static final MCPermColumnInfo _num3 = createColumnInfo("num3");
	public final MCNumberPermColumn num3 = createNumberColumn(_num3);
	
	/**
	 * フラグ１. Flg. 1.<p>
	 *
	 */
	public static final String $flg1 = "flg1";
	private static final MCPermColumnInfo _flg1 = createColumnInfo("flg1");
	public final MCBooleanPermColumn flg1 = createBooleanColumn(_flg1);
	
	/**
	 * フラグ２. Flg. 2.<p>
	 *
	 */
	public static final String $flg2 = "flg2";
	private static final MCPermColumnInfo _flg2 = createColumnInfo("flg2");
	public final MCBooleanPermColumn flg2 = createBooleanColumn(_flg2);
	
	/**
	 * フラグ３. Flg. 3.<p>
	 *
	 */
	public static final String $flg3 = "flg3";
	private static final MCPermColumnInfo _flg3 = createColumnInfo("flg3");
	public final MCBooleanPermColumn flg3 = createBooleanColumn(_flg3);
	
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
	
	public static final MCMeta wrk_mng_typ_META = createCommonMeta($wrk_mng_typ, mcframe.commonMS.meta.MS_META.WRK_MNG_TYP);
	public static final MCMeta wrk_mng_cd_META = createCommonMeta($wrk_mng_cd, mcframe.commonMS.meta.MS_META.WRK_MNG_CD);
	public static final MCMeta wrk_mng_nm_META = createCommonMeta($wrk_mng_nm, mcframe.commonMS.meta.MS_META.WRK_MNG_NM);
	public static final MCMeta str1_META = createCommonMeta($str1, mcframe.commonMS.meta.MS_META.WRK_STR1);
	public static final MCMeta str2_META = createCommonMeta($str2, mcframe.commonMS.meta.MS_META.WRK_STR2);
	public static final MCMeta str3_META = createCommonMeta($str3, mcframe.commonMS.meta.MS_META.WRK_STR3);
	public static final MCMeta num1_META = createCommonMeta($num1, mcframe.commonMS.meta.MS_META.WRK_NUM1);
	public static final MCMeta num2_META = createCommonMeta($num2, mcframe.commonMS.meta.MS_META.WRK_NUM2);
	public static final MCMeta num3_META = createCommonMeta($num3, mcframe.commonMS.meta.MS_META.WRK_NUM3);
	public static final MCMeta flg1_META = createCommonMeta($flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg2_META = createCommonMeta($flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg3_META = createCommonMeta($flg3, mcframe.commonMA.meta.MA_META.FLG);
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
	
	protected static final ConstMetaList<MST_WRK_MNG_R> constMetas = new ConstMetaList<MST_WRK_MNG_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			wrk_mng_typ_META,
			wrk_mng_cd_META,
			wrk_mng_nm_META,
			str1_META,
			str2_META,
			str3_META,
			num1_META,
			num2_META,
			num3_META,
			flg1_META,
			flg2_META,
			flg3_META,
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
	protected MST_WRK_MNG_R(ConstMetaList<? extends MST_WRK_MNG_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_WRK_MNG_R(ConstMetaList<? extends MST_WRK_MNG_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_WRK_MNG_R.$wrk_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WRK_MNG_R.$wrk_mng_typ,
				"wrk_mng_typ",
				wrk_mng_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WRK_MNG_R.$wrk_mng_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WRK_MNG_R.$wrk_mng_cd,
				"wrk_mng_cd",
				wrk_mng_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WRK_MNG_R.$wrk_mng_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WRK_MNG_R.$wrk_mng_nm,
				"wrk_mng_nm",
				wrk_mng_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WRK_MNG_R.$str1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WRK_MNG_R.$str1,
				"str1",
				str1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WRK_MNG_R.$str2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WRK_MNG_R.$str2,
				"str2",
				str2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WRK_MNG_R.$str3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WRK_MNG_R.$str3,
				"str3",
				str3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WRK_MNG_R.$num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_WRK_MNG_R.$num1,
				"num1",
				num1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WRK_MNG_R.$num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_WRK_MNG_R.$num2,
				"num2",
				num2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WRK_MNG_R.$num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_WRK_MNG_R.$num3,
				"num3",
				num3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WRK_MNG_R.$flg1,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_WRK_MNG_R.$flg1,
				"flg1",
				flg1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WRK_MNG_R.$flg2,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_WRK_MNG_R.$flg2,
				"flg2",
				flg2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WRK_MNG_R.$flg3,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_WRK_MNG_R.$flg3,
				"flg3",
				flg3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WRK_MNG_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WRK_MNG_R.$memo1,
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
			MST_WRK_MNG_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WRK_MNG_R.$memo2,
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
			MST_WRK_MNG_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WRK_MNG_R.$memo3,
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
			MST_WRK_MNG_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_WRK_MNG_R.$del_flg,
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
			MST_WRK_MNG_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WRK_MNG_R.$del_usr_id,
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
			MST_WRK_MNG_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WRK_MNG_R.$del_usr_nm,
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
			MST_WRK_MNG_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_WRK_MNG_R.$del_ts,
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
			MST_WRK_MNG_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WRK_MNG_R.$ins_usr_id,
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
			MST_WRK_MNG_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WRK_MNG_R.$ins_usr_nm,
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
			MST_WRK_MNG_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_WRK_MNG_R.$ins_ts,
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
			MST_WRK_MNG_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WRK_MNG_R.$ins_func_id,
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
			MST_WRK_MNG_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_WRK_MNG_R.$upd_cntr,
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
			MST_WRK_MNG_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WRK_MNG_R.$upd_usr_id,
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
			MST_WRK_MNG_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WRK_MNG_R.$upd_usr_nm,
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
			MST_WRK_MNG_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_WRK_MNG_R.$upd_ts,
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
			MST_WRK_MNG_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WRK_MNG_R.$upd_func_id,
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
			MST_WRK_MNG_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WRK_MNG_R.$upd_srv_req_no,
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
	public static MST_WRK_MNG_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_WRK_MNG_R create(String alias) {
		MST_WRK_MNG_R row = new MST_WRK_MNG_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_WRK_MNG_R createByName(T proto) {
		MST_WRK_MNG_R row = MST_WRK_MNG_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_WRK_MNG_R clone() {
		return (MST_WRK_MNG_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_WRK_MNG_R createInstance() {
		return (MST_WRK_MNG_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_WRK_MNG_R getValues(String... names) {
		return (MST_WRK_MNG_R) super.getValues(names);
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
	 public MSW_WRK_MNG_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_WRK_MNG_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_WRK_MNG_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_WRK_MNG_KEY_R.TABLE_NAME);
	 }

	/**
	 * 案件管理区分. Sales project management type.<p>
	 *
	 */
	public String wrk_mng_typ() {
		return getConstString(offset + 0, $wrk_mng_typ);
	}

	/**
	 * 案件管理区分. Sales project management type.<p>
	 *
	 */
	public void wrk_mng_typ(String value) {
		setConstString(offset + 0, $wrk_mng_typ, value);
	}

	/**
	 * 案件管理ＣＤ. Sales project management cd..<p>
	 *
	 */
	public String wrk_mng_cd() {
		return getConstString(offset + 1, $wrk_mng_cd);
	}

	/**
	 * 案件管理ＣＤ. Sales project management cd..<p>
	 *
	 */
	public void wrk_mng_cd(String value) {
		setConstString(offset + 1, $wrk_mng_cd, value);
	}

	/**
	 * 案件管理名. Sales project management name.<p>
	 *
	 */
	public String wrk_mng_nm() {
		return getConstString(offset + 2, $wrk_mng_nm);
	}

	/**
	 * 案件管理名. Sales project management name.<p>
	 *
	 */
	public void wrk_mng_nm(String value) {
		setConstString(offset + 2, $wrk_mng_nm, value);
	}

	/**
	 * 文字列１. String 1.<p>
	 *
	 */
	public String str1() {
		return getConstString(offset + 3, $str1);
	}

	/**
	 * 文字列１. String 1.<p>
	 *
	 */
	public void str1(String value) {
		setConstString(offset + 3, $str1, value);
	}

	/**
	 * 文字列２. String 2.<p>
	 *
	 */
	public String str2() {
		return getConstString(offset + 4, $str2);
	}

	/**
	 * 文字列２. String 2.<p>
	 *
	 */
	public void str2(String value) {
		setConstString(offset + 4, $str2, value);
	}

	/**
	 * 文字列３. String 3.<p>
	 *
	 */
	public String str3() {
		return getConstString(offset + 5, $str3);
	}

	/**
	 * 文字列３. String 3.<p>
	 *
	 */
	public void str3(String value) {
		setConstString(offset + 5, $str3, value);
	}

	/**
	 * 数値１. Numerical 1.<p>
	 *
	 */
	public MCNumber num1() {
		return getConstNumber(offset + 6, $num1);
	}

	/**
	 * 数値１. Numerical 1.<p>
	 *
	 */
	public void num1(MCNumber value) {
		setConstNumber(offset + 6, $num1, value);
	}
	
	/**
	 * 数値１. Numerical 1.<p>
	 *
	 */
	public void num1(int value) {
		setConstNumber(offset + 6, $num1, value);
	}
	
	/**
	 * 数値１. Numerical 1.<p>
	 *
	 */
	public void num1(long value) {
		setConstNumber(offset + 6, $num1, value);
	}
	
	/**
	 * 数値１. Numerical 1.<p>
	 *
	 */
	public void num1(float value) {
		setConstNumber(offset + 6, $num1, value);
	}
	
	/**
	 * 数値１. Numerical 1.<p>
	 *
	 */
	public void num1(double value) {
		setConstNumber(offset + 6, $num1, value);
	}
	
	/**
	 * 数値２. Numerical 2.<p>
	 *
	 */
	public MCNumber num2() {
		return getConstNumber(offset + 7, $num2);
	}

	/**
	 * 数値２. Numerical 2.<p>
	 *
	 */
	public void num2(MCNumber value) {
		setConstNumber(offset + 7, $num2, value);
	}
	
	/**
	 * 数値２. Numerical 2.<p>
	 *
	 */
	public void num2(int value) {
		setConstNumber(offset + 7, $num2, value);
	}
	
	/**
	 * 数値２. Numerical 2.<p>
	 *
	 */
	public void num2(long value) {
		setConstNumber(offset + 7, $num2, value);
	}
	
	/**
	 * 数値２. Numerical 2.<p>
	 *
	 */
	public void num2(float value) {
		setConstNumber(offset + 7, $num2, value);
	}
	
	/**
	 * 数値２. Numerical 2.<p>
	 *
	 */
	public void num2(double value) {
		setConstNumber(offset + 7, $num2, value);
	}
	
	/**
	 * 数値３. Numerical 3.<p>
	 *
	 */
	public MCNumber num3() {
		return getConstNumber(offset + 8, $num3);
	}

	/**
	 * 数値３. Numerical 3.<p>
	 *
	 */
	public void num3(MCNumber value) {
		setConstNumber(offset + 8, $num3, value);
	}
	
	/**
	 * 数値３. Numerical 3.<p>
	 *
	 */
	public void num3(int value) {
		setConstNumber(offset + 8, $num3, value);
	}
	
	/**
	 * 数値３. Numerical 3.<p>
	 *
	 */
	public void num3(long value) {
		setConstNumber(offset + 8, $num3, value);
	}
	
	/**
	 * 数値３. Numerical 3.<p>
	 *
	 */
	public void num3(float value) {
		setConstNumber(offset + 8, $num3, value);
	}
	
	/**
	 * 数値３. Numerical 3.<p>
	 *
	 */
	public void num3(double value) {
		setConstNumber(offset + 8, $num3, value);
	}
	
	/**
	 * フラグ１. Flg. 1.<p>
	 *
	 */
	public boolean flg1() {
		return getConstBoolean(offset + 9, $flg1);
	}

	/**
	 * フラグ１. Flg. 1.<p>
	 *
	 */
	public void flg1(boolean value) {
		setConstBoolean(offset + 9, $flg1, value);
	}

	/**
	 * フラグ２. Flg. 2.<p>
	 *
	 */
	public boolean flg2() {
		return getConstBoolean(offset + 10, $flg2);
	}

	/**
	 * フラグ２. Flg. 2.<p>
	 *
	 */
	public void flg2(boolean value) {
		setConstBoolean(offset + 10, $flg2, value);
	}

	/**
	 * フラグ３. Flg. 3.<p>
	 *
	 */
	public boolean flg3() {
		return getConstBoolean(offset + 11, $flg3);
	}

	/**
	 * フラグ３. Flg. 3.<p>
	 *
	 */
	public void flg3(boolean value) {
		setConstBoolean(offset + 11, $flg3, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 12, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 12, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 13, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 13, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 14, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 14, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 15, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 15, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 16, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 16, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 17, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 17, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 18, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 18, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 19, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 19, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 20, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 20, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 21, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 21, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 22, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 22, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 23, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 24, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 24, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 25, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 25, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 26, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 26, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 27, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 27, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 28, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 28, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($wrk_mng_typ.equalsIgnoreCase(name)) {
			return wrk_mng_typ();
		}
		if ($wrk_mng_cd.equalsIgnoreCase(name)) {
			return wrk_mng_cd();
		}
		if ($wrk_mng_nm.equalsIgnoreCase(name)) {
			return wrk_mng_nm();
		}
		if ($str1.equalsIgnoreCase(name)) {
			return str1();
		}
		if ($str2.equalsIgnoreCase(name)) {
			return str2();
		}
		if ($str3.equalsIgnoreCase(name)) {
			return str3();
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
		if ($num1.equalsIgnoreCase(name)) {
			return num1();
		}
		if ($num2.equalsIgnoreCase(name)) {
			return num2();
		}
		if ($num3.equalsIgnoreCase(name)) {
			return num3();
		}
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
		if ($flg1.equalsIgnoreCase(name)) {
			return flg1();
		}
		if ($flg2.equalsIgnoreCase(name)) {
			return flg2();
		}
		if ($flg3.equalsIgnoreCase(name)) {
			return flg3();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wrk_mng_typ.equalsIgnoreCase(name)) {
			return wrk_mng_typ();
		}
		if ($wrk_mng_cd.equalsIgnoreCase(name)) {
			return wrk_mng_cd();
		}
		if ($wrk_mng_nm.equalsIgnoreCase(name)) {
			return wrk_mng_nm();
		}
		if ($str1.equalsIgnoreCase(name)) {
			return str1();
		}
		if ($str2.equalsIgnoreCase(name)) {
			return str2();
		}
		if ($str3.equalsIgnoreCase(name)) {
			return str3();
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
		if ($num1.equalsIgnoreCase(name)) {
			return num1();
		}
		if ($num2.equalsIgnoreCase(name)) {
			return num2();
		}
		if ($num3.equalsIgnoreCase(name)) {
			return num3();
		}
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
		if ($flg1.equalsIgnoreCase(name)) {
			return flg1();
		}
		if ($flg2.equalsIgnoreCase(name)) {
			return flg2();
		}
		if ($flg3.equalsIgnoreCase(name)) {
			return flg3();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wrk_mng_typ.equalsIgnoreCase(name)) {
			wrk_mng_typ(value);
			return;
		}
		if ($wrk_mng_cd.equalsIgnoreCase(name)) {
			wrk_mng_cd(value);
			return;
		}
		if ($wrk_mng_nm.equalsIgnoreCase(name)) {
			wrk_mng_nm(value);
			return;
		}
		if ($str1.equalsIgnoreCase(name)) {
			str1(value);
			return;
		}
		if ($str2.equalsIgnoreCase(name)) {
			str2(value);
			return;
		}
		if ($str3.equalsIgnoreCase(name)) {
			str3(value);
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
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
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
		if ($flg1.equalsIgnoreCase(name)) {
			flg1(value);
			return;
		}
		if ($flg2.equalsIgnoreCase(name)) {
			flg2(value);
			return;
		}
		if ($flg3.equalsIgnoreCase(name)) {
			flg3(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wrk_mng_typ.equalsIgnoreCase(name)) {
			wrk_mng_typ(value);
			return;
		}
		if ($wrk_mng_cd.equalsIgnoreCase(name)) {
			wrk_mng_cd(value);
			return;
		}
		if ($wrk_mng_nm.equalsIgnoreCase(name)) {
			wrk_mng_nm(value);
			return;
		}
		if ($str1.equalsIgnoreCase(name)) {
			str1(value);
			return;
		}
		if ($str2.equalsIgnoreCase(name)) {
			str2(value);
			return;
		}
		if ($str3.equalsIgnoreCase(name)) {
			str3(value);
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
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
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
		if ($flg1.equalsIgnoreCase(name)) {
			flg1(value);
			return;
		}
		if ($flg2.equalsIgnoreCase(name)) {
			flg2(value);
			return;
		}
		if ($flg3.equalsIgnoreCase(name)) {
			flg3(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
