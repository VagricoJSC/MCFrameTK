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
 * "仕入予定 // Purchase schedule"DBコンテナRowクラスです。<p>
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
 *  	<td>purc_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入予定ＮＯ</td>
 *  	<td>Purchase schedule No.</td>
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
 *  	<td>arr_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷予定ＮＯ</td>
 *  	<td>Receipt schedule No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入予定日</td>
 *  	<td>Scheduled purchase date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_unit_schd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引単位予定数量</td>
 *  	<td>Transaction unit scheduled qty.</td>
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
 *  	<td>base_unit_schd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位予定数量</td>
 *  	<td>Base unit scheduled qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_abort_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位打切数量</td>
 *  	<td>Base unit cancelled remaining qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_purc_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位仕入数量</td>
 *  	<td>Base unit purchase qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_temp_purc_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位仮仕入数量</td>
 *  	<td>Base unit temporary purchase qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_accpt_dfct_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位検収不良数量</td>
 *  	<td>Base unit acceptance detective qty.</td>
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
 *  	<td>non_purc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入対象外ＦＬＧ</td>
 *  	<td>Not for purchase flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cmpl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>完了ＦＬＧ</td>
 *  	<td>Completed flg.</td>
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
 *  	<td>purc_split_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入分割ＦＬＧ</td>
 *  	<td>Purchase split flg.</td>
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
public class MST_PURC_SCHD_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_PURC_SCHD";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 仕入予定ＮＯ. Purchase schedule No..<p>
	 *
	 */
	public static final String $purc_schd_no = "purc_schd_no";
	private static final MCPermColumnInfo _purc_schd_no = createColumnInfo("purc_schd_no");
	public final MCStringPermColumn purc_schd_no = createStringColumn(_purc_schd_no);
	
	/**
	 * 入荷進捗ＮＯ. Receipt progress No..<p>
	 *
	 */
	public static final String $arr_pr_no = "arr_pr_no";
	private static final MCPermColumnInfo _arr_pr_no = createColumnInfo("arr_pr_no");
	public final MCStringPermColumn arr_pr_no = createStringColumn(_arr_pr_no);
	
	/**
	 * 入荷予定ＮＯ. Receipt schedule No..<p>
	 *
	 */
	public static final String $arr_schd_no = "arr_schd_no";
	private static final MCPermColumnInfo _arr_schd_no = createColumnInfo("arr_schd_no");
	public final MCStringPermColumn arr_schd_no = createStringColumn(_arr_schd_no);
	
	/**
	 * 仕入予定日. Scheduled purchase date.<p>
	 *
	 */
	public static final String $purc_schd_dt = "purc_schd_dt";
	private static final MCPermColumnInfo _purc_schd_dt = createColumnInfo("purc_schd_dt");
	public final MCDatePermColumn purc_schd_dt = createDateColumn(_purc_schd_dt);
	
	/**
	 * 取引単位予定数量. Transaction unit scheduled qty..<p>
	 *
	 */
	public static final String $trd_unit_schd_qty = "trd_unit_schd_qty";
	private static final MCPermColumnInfo _trd_unit_schd_qty = createColumnInfo("trd_unit_schd_qty");
	public final MCNumberPermColumn trd_unit_schd_qty = createNumberColumn(_trd_unit_schd_qty);
	
	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	private static final MCPermColumnInfo _trd_unit_cd = createColumnInfo("trd_unit_cd");
	public final MCStringPermColumn trd_unit_cd = createStringColumn(_trd_unit_cd);
	
	/**
	 * 基準単位予定数量. Base unit scheduled qty..<p>
	 *
	 */
	public static final String $base_unit_schd_qty = "base_unit_schd_qty";
	private static final MCPermColumnInfo _base_unit_schd_qty = createColumnInfo("base_unit_schd_qty");
	public final MCNumberPermColumn base_unit_schd_qty = createNumberColumn(_base_unit_schd_qty);
	
	/**
	 * 基準単位打切数量. Base unit cancelled remaining qty..<p>
	 *
	 */
	public static final String $base_unit_abort_qty = "base_unit_abort_qty";
	private static final MCPermColumnInfo _base_unit_abort_qty = createColumnInfo("base_unit_abort_qty");
	public final MCNumberPermColumn base_unit_abort_qty = createNumberColumn(_base_unit_abort_qty);
	
	/**
	 * 基準単位仕入数量. Base unit purchase qty..<p>
	 *
	 */
	public static final String $base_unit_purc_qty = "base_unit_purc_qty";
	private static final MCPermColumnInfo _base_unit_purc_qty = createColumnInfo("base_unit_purc_qty");
	public final MCNumberPermColumn base_unit_purc_qty = createNumberColumn(_base_unit_purc_qty);
	
	/**
	 * 基準単位仮仕入数量. Base unit temporary purchase qty..<p>
	 *
	 */
	public static final String $base_unit_temp_purc_qty = "base_unit_temp_purc_qty";
	private static final MCPermColumnInfo _base_unit_temp_purc_qty = createColumnInfo("base_unit_temp_purc_qty");
	public final MCNumberPermColumn base_unit_temp_purc_qty = createNumberColumn(_base_unit_temp_purc_qty);
	
	/**
	 * 基準単位検収不良数量. Base unit acceptance detective qty..<p>
	 *
	 */
	public static final String $base_unit_accpt_dfct_qty = "base_unit_accpt_dfct_qty";
	private static final MCPermColumnInfo _base_unit_accpt_dfct_qty = createColumnInfo("base_unit_accpt_dfct_qty");
	public final MCNumberPermColumn base_unit_accpt_dfct_qty = createNumberColumn(_base_unit_accpt_dfct_qty);
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	private static final MCPermColumnInfo _base_unit_cd = createColumnInfo("base_unit_cd");
	public final MCStringPermColumn base_unit_cd = createStringColumn(_base_unit_cd);
	
	/**
	 * 仕入対象外ＦＬＧ. Not for purchase flg..<p>
	 *
	 */
	public static final String $non_purc_flg = "non_purc_flg";
	private static final MCPermColumnInfo _non_purc_flg = createColumnInfo("non_purc_flg");
	public final MCBooleanPermColumn non_purc_flg = createBooleanColumn(_non_purc_flg);
	
	/**
	 * 完了ＦＬＧ. Completed flg..<p>
	 *
	 */
	public static final String $cmpl_flg = "cmpl_flg";
	private static final MCPermColumnInfo _cmpl_flg = createColumnInfo("cmpl_flg");
	public final MCBooleanPermColumn cmpl_flg = createBooleanColumn(_cmpl_flg);
	
	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	private static final MCPermColumnInfo _abort_flg = createColumnInfo("abort_flg");
	public final MCBooleanPermColumn abort_flg = createBooleanColumn(_abort_flg);
	
	/**
	 * 仕入分割ＦＬＧ. Purchase split flg..<p>
	 *
	 */
	public static final String $purc_split_flg = "purc_split_flg";
	private static final MCPermColumnInfo _purc_split_flg = createColumnInfo("purc_split_flg");
	public final MCBooleanPermColumn purc_split_flg = createBooleanColumn(_purc_split_flg);
	
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
	
	public static final MCMeta purc_schd_no_META = createCommonMeta($purc_schd_no, mcframe.commonMA.meta.MA_META.PURC_SCHD_NO);
	public static final MCMeta arr_pr_no_META = createCommonMeta($arr_pr_no, mcframe.commonMA.meta.MA_META.ARR_PR_NO);
	public static final MCMeta arr_schd_no_META = createCommonMeta($arr_schd_no, mcframe.commonMA.meta.MA_META.ARR_SCHD_NO);
	public static final MCMeta purc_schd_dt_META = createCommonMeta($purc_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_unit_schd_qty_META = createCommonMeta($trd_unit_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_schd_qty_META = createCommonMeta($base_unit_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_abort_qty_META = createCommonMeta($base_unit_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_purc_qty_META = createCommonMeta($base_unit_purc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_temp_purc_qty_META = createCommonMeta($base_unit_temp_purc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_accpt_dfct_qty_META = createCommonMeta($base_unit_accpt_dfct_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta non_purc_flg_META = createCommonMeta($non_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cmpl_flg_META = createCommonMeta($cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_split_flg_META = createCommonMeta($purc_split_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PURC_SCHD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PURC_SCHD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PURC_SCHD_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_PURC_SCHD_R> constMetas = new ConstMetaList<MST_PURC_SCHD_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			purc_schd_no_META,
			arr_pr_no_META,
			arr_schd_no_META,
			purc_schd_dt_META,
			trd_unit_schd_qty_META,
			trd_unit_cd_META,
			base_unit_schd_qty_META,
			base_unit_abort_qty_META,
			base_unit_purc_qty_META,
			base_unit_temp_purc_qty_META,
			base_unit_accpt_dfct_qty_META,
			base_unit_cd_META,
			non_purc_flg_META,
			cmpl_flg_META,
			abort_flg_META,
			purc_split_flg_META,
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
	protected MST_PURC_SCHD_R(ConstMetaList<? extends MST_PURC_SCHD_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_PURC_SCHD_R(ConstMetaList<? extends MST_PURC_SCHD_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_PURC_SCHD_R.$purc_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_SCHD_R.$purc_schd_no,
				"purc_schd_no",
				purc_schd_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_SCHD_R.$arr_pr_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_SCHD_R.$arr_pr_no,
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
			MST_PURC_SCHD_R.$arr_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_SCHD_R.$arr_schd_no,
				"arr_schd_no",
				arr_schd_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_SCHD_R.$purc_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PURC_SCHD_R.$purc_schd_dt,
				"purc_schd_dt",
				purc_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_SCHD_R.$trd_unit_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_SCHD_R.$trd_unit_schd_qty,
				"trd_unit_schd_qty",
				trd_unit_schd_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_SCHD_R.$trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_SCHD_R.$trd_unit_cd,
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
			MST_PURC_SCHD_R.$base_unit_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_SCHD_R.$base_unit_schd_qty,
				"base_unit_schd_qty",
				base_unit_schd_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_SCHD_R.$base_unit_abort_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_SCHD_R.$base_unit_abort_qty,
				"base_unit_abort_qty",
				base_unit_abort_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_SCHD_R.$base_unit_purc_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_SCHD_R.$base_unit_purc_qty,
				"base_unit_purc_qty",
				base_unit_purc_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_SCHD_R.$base_unit_temp_purc_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_SCHD_R.$base_unit_temp_purc_qty,
				"base_unit_temp_purc_qty",
				base_unit_temp_purc_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_SCHD_R.$base_unit_accpt_dfct_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_SCHD_R.$base_unit_accpt_dfct_qty,
				"base_unit_accpt_dfct_qty",
				base_unit_accpt_dfct_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_SCHD_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_SCHD_R.$base_unit_cd,
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
			MST_PURC_SCHD_R.$non_purc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PURC_SCHD_R.$non_purc_flg,
				"non_purc_flg",
				non_purc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_SCHD_R.$cmpl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PURC_SCHD_R.$cmpl_flg,
				"cmpl_flg",
				cmpl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_SCHD_R.$abort_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PURC_SCHD_R.$abort_flg,
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
			MST_PURC_SCHD_R.$purc_split_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PURC_SCHD_R.$purc_split_flg,
				"purc_split_flg",
				purc_split_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_SCHD_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_SCHD_R.$sub_char1,
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
			MST_PURC_SCHD_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_SCHD_R.$sub_char2,
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
			MST_PURC_SCHD_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_SCHD_R.$sub_char3,
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
			MST_PURC_SCHD_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_SCHD_R.$ins_usr_id,
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
			MST_PURC_SCHD_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_SCHD_R.$ins_usr_nm,
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
			MST_PURC_SCHD_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PURC_SCHD_R.$ins_ts,
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
			MST_PURC_SCHD_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_SCHD_R.$ins_func_id,
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
			MST_PURC_SCHD_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_SCHD_R.$upd_cntr,
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
			MST_PURC_SCHD_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_SCHD_R.$upd_usr_id,
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
			MST_PURC_SCHD_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_SCHD_R.$upd_usr_nm,
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
			MST_PURC_SCHD_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PURC_SCHD_R.$upd_ts,
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
			MST_PURC_SCHD_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_SCHD_R.$upd_func_id,
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
			MST_PURC_SCHD_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_SCHD_R.$upd_srv_req_no,
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
	public static MST_PURC_SCHD_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_PURC_SCHD_R create(String alias) {
		MST_PURC_SCHD_R row = new MST_PURC_SCHD_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_PURC_SCHD_R createByName(T proto) {
		MST_PURC_SCHD_R row = MST_PURC_SCHD_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PURC_SCHD_R clone() {
		return (MST_PURC_SCHD_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PURC_SCHD_R createInstance() {
		return (MST_PURC_SCHD_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PURC_SCHD_R getValues(String... names) {
		return (MST_PURC_SCHD_R) super.getValues(names);
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
	 public MSW_PURC_SCHD_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_PURC_SCHD_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_PURC_SCHD_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_PURC_SCHD_KEY_R.TABLE_NAME);
	 }

	/**
	 * 仕入予定ＮＯ. Purchase schedule No..<p>
	 *
	 */
	public String purc_schd_no() {
		return getConstString(offset + 0, $purc_schd_no);
	}

	/**
	 * 仕入予定ＮＯ. Purchase schedule No..<p>
	 *
	 */
	public void purc_schd_no(String value) {
		setConstString(offset + 0, $purc_schd_no, value);
	}

	/**
	 * 入荷進捗ＮＯ. Receipt progress No..<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 1, $arr_pr_no);
	}

	/**
	 * 入荷進捗ＮＯ. Receipt progress No..<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 1, $arr_pr_no, value);
	}

	/**
	 * 入荷予定ＮＯ. Receipt schedule No..<p>
	 *
	 */
	public String arr_schd_no() {
		return getConstString(offset + 2, $arr_schd_no);
	}

	/**
	 * 入荷予定ＮＯ. Receipt schedule No..<p>
	 *
	 */
	public void arr_schd_no(String value) {
		setConstString(offset + 2, $arr_schd_no, value);
	}

	/**
	 * 仕入予定日. Scheduled purchase date.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return getConstDate(offset + 3, $purc_schd_dt);
	}

	/**
	 * 仕入予定日. Scheduled purchase date.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		setConstDate(offset + 3, $purc_schd_dt, value);
	}

	/**
	 * 取引単位予定数量. Transaction unit scheduled qty..<p>
	 *
	 */
	public MCNumber trd_unit_schd_qty() {
		return getConstNumber(offset + 4, $trd_unit_schd_qty);
	}

	/**
	 * 取引単位予定数量. Transaction unit scheduled qty..<p>
	 *
	 */
	public void trd_unit_schd_qty(MCNumber value) {
		setConstNumber(offset + 4, $trd_unit_schd_qty, value);
	}
	
	/**
	 * 取引単位予定数量. Transaction unit scheduled qty..<p>
	 *
	 */
	public void trd_unit_schd_qty(int value) {
		setConstNumber(offset + 4, $trd_unit_schd_qty, value);
	}
	
	/**
	 * 取引単位予定数量. Transaction unit scheduled qty..<p>
	 *
	 */
	public void trd_unit_schd_qty(long value) {
		setConstNumber(offset + 4, $trd_unit_schd_qty, value);
	}
	
	/**
	 * 取引単位予定数量. Transaction unit scheduled qty..<p>
	 *
	 */
	public void trd_unit_schd_qty(float value) {
		setConstNumber(offset + 4, $trd_unit_schd_qty, value);
	}
	
	/**
	 * 取引単位予定数量. Transaction unit scheduled qty..<p>
	 *
	 */
	public void trd_unit_schd_qty(double value) {
		setConstNumber(offset + 4, $trd_unit_schd_qty, value);
	}
	
	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 5, $trd_unit_cd);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 5, $trd_unit_cd, value);
	}

	/**
	 * 基準単位予定数量. Base unit scheduled qty..<p>
	 *
	 */
	public MCNumber base_unit_schd_qty() {
		return getConstNumber(offset + 6, $base_unit_schd_qty);
	}

	/**
	 * 基準単位予定数量. Base unit scheduled qty..<p>
	 *
	 */
	public void base_unit_schd_qty(MCNumber value) {
		setConstNumber(offset + 6, $base_unit_schd_qty, value);
	}
	
	/**
	 * 基準単位予定数量. Base unit scheduled qty..<p>
	 *
	 */
	public void base_unit_schd_qty(int value) {
		setConstNumber(offset + 6, $base_unit_schd_qty, value);
	}
	
	/**
	 * 基準単位予定数量. Base unit scheduled qty..<p>
	 *
	 */
	public void base_unit_schd_qty(long value) {
		setConstNumber(offset + 6, $base_unit_schd_qty, value);
	}
	
	/**
	 * 基準単位予定数量. Base unit scheduled qty..<p>
	 *
	 */
	public void base_unit_schd_qty(float value) {
		setConstNumber(offset + 6, $base_unit_schd_qty, value);
	}
	
	/**
	 * 基準単位予定数量. Base unit scheduled qty..<p>
	 *
	 */
	public void base_unit_schd_qty(double value) {
		setConstNumber(offset + 6, $base_unit_schd_qty, value);
	}
	
	/**
	 * 基準単位打切数量. Base unit cancelled remaining qty..<p>
	 *
	 */
	public MCNumber base_unit_abort_qty() {
		return getConstNumber(offset + 7, $base_unit_abort_qty);
	}

	/**
	 * 基準単位打切数量. Base unit cancelled remaining qty..<p>
	 *
	 */
	public void base_unit_abort_qty(MCNumber value) {
		setConstNumber(offset + 7, $base_unit_abort_qty, value);
	}
	
	/**
	 * 基準単位打切数量. Base unit cancelled remaining qty..<p>
	 *
	 */
	public void base_unit_abort_qty(int value) {
		setConstNumber(offset + 7, $base_unit_abort_qty, value);
	}
	
	/**
	 * 基準単位打切数量. Base unit cancelled remaining qty..<p>
	 *
	 */
	public void base_unit_abort_qty(long value) {
		setConstNumber(offset + 7, $base_unit_abort_qty, value);
	}
	
	/**
	 * 基準単位打切数量. Base unit cancelled remaining qty..<p>
	 *
	 */
	public void base_unit_abort_qty(float value) {
		setConstNumber(offset + 7, $base_unit_abort_qty, value);
	}
	
	/**
	 * 基準単位打切数量. Base unit cancelled remaining qty..<p>
	 *
	 */
	public void base_unit_abort_qty(double value) {
		setConstNumber(offset + 7, $base_unit_abort_qty, value);
	}
	
	/**
	 * 基準単位仕入数量. Base unit purchase qty..<p>
	 *
	 */
	public MCNumber base_unit_purc_qty() {
		return getConstNumber(offset + 8, $base_unit_purc_qty);
	}

	/**
	 * 基準単位仕入数量. Base unit purchase qty..<p>
	 *
	 */
	public void base_unit_purc_qty(MCNumber value) {
		setConstNumber(offset + 8, $base_unit_purc_qty, value);
	}
	
	/**
	 * 基準単位仕入数量. Base unit purchase qty..<p>
	 *
	 */
	public void base_unit_purc_qty(int value) {
		setConstNumber(offset + 8, $base_unit_purc_qty, value);
	}
	
	/**
	 * 基準単位仕入数量. Base unit purchase qty..<p>
	 *
	 */
	public void base_unit_purc_qty(long value) {
		setConstNumber(offset + 8, $base_unit_purc_qty, value);
	}
	
	/**
	 * 基準単位仕入数量. Base unit purchase qty..<p>
	 *
	 */
	public void base_unit_purc_qty(float value) {
		setConstNumber(offset + 8, $base_unit_purc_qty, value);
	}
	
	/**
	 * 基準単位仕入数量. Base unit purchase qty..<p>
	 *
	 */
	public void base_unit_purc_qty(double value) {
		setConstNumber(offset + 8, $base_unit_purc_qty, value);
	}
	
	/**
	 * 基準単位仮仕入数量. Base unit temporary purchase qty..<p>
	 *
	 */
	public MCNumber base_unit_temp_purc_qty() {
		return getConstNumber(offset + 9, $base_unit_temp_purc_qty);
	}

	/**
	 * 基準単位仮仕入数量. Base unit temporary purchase qty..<p>
	 *
	 */
	public void base_unit_temp_purc_qty(MCNumber value) {
		setConstNumber(offset + 9, $base_unit_temp_purc_qty, value);
	}
	
	/**
	 * 基準単位仮仕入数量. Base unit temporary purchase qty..<p>
	 *
	 */
	public void base_unit_temp_purc_qty(int value) {
		setConstNumber(offset + 9, $base_unit_temp_purc_qty, value);
	}
	
	/**
	 * 基準単位仮仕入数量. Base unit temporary purchase qty..<p>
	 *
	 */
	public void base_unit_temp_purc_qty(long value) {
		setConstNumber(offset + 9, $base_unit_temp_purc_qty, value);
	}
	
	/**
	 * 基準単位仮仕入数量. Base unit temporary purchase qty..<p>
	 *
	 */
	public void base_unit_temp_purc_qty(float value) {
		setConstNumber(offset + 9, $base_unit_temp_purc_qty, value);
	}
	
	/**
	 * 基準単位仮仕入数量. Base unit temporary purchase qty..<p>
	 *
	 */
	public void base_unit_temp_purc_qty(double value) {
		setConstNumber(offset + 9, $base_unit_temp_purc_qty, value);
	}
	
	/**
	 * 基準単位検収不良数量. Base unit acceptance detective qty..<p>
	 *
	 */
	public MCNumber base_unit_accpt_dfct_qty() {
		return getConstNumber(offset + 10, $base_unit_accpt_dfct_qty);
	}

	/**
	 * 基準単位検収不良数量. Base unit acceptance detective qty..<p>
	 *
	 */
	public void base_unit_accpt_dfct_qty(MCNumber value) {
		setConstNumber(offset + 10, $base_unit_accpt_dfct_qty, value);
	}
	
	/**
	 * 基準単位検収不良数量. Base unit acceptance detective qty..<p>
	 *
	 */
	public void base_unit_accpt_dfct_qty(int value) {
		setConstNumber(offset + 10, $base_unit_accpt_dfct_qty, value);
	}
	
	/**
	 * 基準単位検収不良数量. Base unit acceptance detective qty..<p>
	 *
	 */
	public void base_unit_accpt_dfct_qty(long value) {
		setConstNumber(offset + 10, $base_unit_accpt_dfct_qty, value);
	}
	
	/**
	 * 基準単位検収不良数量. Base unit acceptance detective qty..<p>
	 *
	 */
	public void base_unit_accpt_dfct_qty(float value) {
		setConstNumber(offset + 10, $base_unit_accpt_dfct_qty, value);
	}
	
	/**
	 * 基準単位検収不良数量. Base unit acceptance detective qty..<p>
	 *
	 */
	public void base_unit_accpt_dfct_qty(double value) {
		setConstNumber(offset + 10, $base_unit_accpt_dfct_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 11, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 11, $base_unit_cd, value);
	}

	/**
	 * 仕入対象外ＦＬＧ. Not for purchase flg..<p>
	 *
	 */
	public boolean non_purc_flg() {
		return getConstBoolean(offset + 12, $non_purc_flg);
	}

	/**
	 * 仕入対象外ＦＬＧ. Not for purchase flg..<p>
	 *
	 */
	public void non_purc_flg(boolean value) {
		setConstBoolean(offset + 12, $non_purc_flg, value);
	}

	/**
	 * 完了ＦＬＧ. Completed flg..<p>
	 *
	 */
	public boolean cmpl_flg() {
		return getConstBoolean(offset + 13, $cmpl_flg);
	}

	/**
	 * 完了ＦＬＧ. Completed flg..<p>
	 *
	 */
	public void cmpl_flg(boolean value) {
		setConstBoolean(offset + 13, $cmpl_flg, value);
	}

	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 14, $abort_flg);
	}

	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 14, $abort_flg, value);
	}

	/**
	 * 仕入分割ＦＬＧ. Purchase split flg..<p>
	 *
	 */
	public boolean purc_split_flg() {
		return getConstBoolean(offset + 15, $purc_split_flg);
	}

	/**
	 * 仕入分割ＦＬＧ. Purchase split flg..<p>
	 *
	 */
	public void purc_split_flg(boolean value) {
		setConstBoolean(offset + 15, $purc_split_flg, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 16, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 16, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 17, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 17, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 18, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 18, $sub_char3, value);
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
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
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
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			return trd_unit_schd_qty();
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			return base_unit_schd_qty();
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			return base_unit_abort_qty();
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			return base_unit_purc_qty();
		}
		if ($base_unit_temp_purc_qty.equalsIgnoreCase(name)) {
			return base_unit_temp_purc_qty();
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			return base_unit_accpt_dfct_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
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
		if ($non_purc_flg.equalsIgnoreCase(name)) {
			return non_purc_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($purc_split_flg.equalsIgnoreCase(name)) {
			return purc_split_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
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
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			return trd_unit_schd_qty();
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			return base_unit_schd_qty();
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			return base_unit_abort_qty();
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			return base_unit_purc_qty();
		}
		if ($base_unit_temp_purc_qty.equalsIgnoreCase(name)) {
			return base_unit_temp_purc_qty();
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			return base_unit_accpt_dfct_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
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
		if ($non_purc_flg.equalsIgnoreCase(name)) {
			return non_purc_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($purc_split_flg.equalsIgnoreCase(name)) {
			return purc_split_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
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
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			base_unit_abort_qty(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		if ($base_unit_temp_purc_qty.equalsIgnoreCase(name)) {
			base_unit_temp_purc_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			base_unit_abort_qty(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		if ($base_unit_temp_purc_qty.equalsIgnoreCase(name)) {
			base_unit_temp_purc_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			base_unit_abort_qty(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		if ($base_unit_temp_purc_qty.equalsIgnoreCase(name)) {
			base_unit_temp_purc_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			base_unit_abort_qty(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		if ($base_unit_temp_purc_qty.equalsIgnoreCase(name)) {
			base_unit_temp_purc_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			base_unit_abort_qty(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		if ($base_unit_temp_purc_qty.equalsIgnoreCase(name)) {
			base_unit_temp_purc_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
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
		if ($non_purc_flg.equalsIgnoreCase(name)) {
			non_purc_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($purc_split_flg.equalsIgnoreCase(name)) {
			purc_split_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
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
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			base_unit_abort_qty(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		if ($base_unit_temp_purc_qty.equalsIgnoreCase(name)) {
			base_unit_temp_purc_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			base_unit_abort_qty(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		if ($base_unit_temp_purc_qty.equalsIgnoreCase(name)) {
			base_unit_temp_purc_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			base_unit_abort_qty(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		if ($base_unit_temp_purc_qty.equalsIgnoreCase(name)) {
			base_unit_temp_purc_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			base_unit_abort_qty(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		if ($base_unit_temp_purc_qty.equalsIgnoreCase(name)) {
			base_unit_temp_purc_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			base_unit_abort_qty(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		if ($base_unit_temp_purc_qty.equalsIgnoreCase(name)) {
			base_unit_temp_purc_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
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
		if ($non_purc_flg.equalsIgnoreCase(name)) {
			non_purc_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($purc_split_flg.equalsIgnoreCase(name)) {
			purc_split_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
