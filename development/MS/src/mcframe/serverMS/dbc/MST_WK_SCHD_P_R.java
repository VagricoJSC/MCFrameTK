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
 * "工数予定（改訂履歴） // Man-hour schedule (Rev. history)"DBコンテナRowクラスです。<p>
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
 *  	<td>wk_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工数予定ＮＯ</td>
 *  	<td>Man-hour schedule No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>mfg_inst_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造指図改訂番号</td>
 *  	<td>Mfg. order rev. number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造指図ＮＯ</td>
 *  	<td>Mfg. order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目製造指図ＮＯ</td>
 *  	<td>Item mfg. order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程指図ＮＯ</td>
 *  	<td>Operation order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wk_cost_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工数管理ＣＤ</td>
 *  	<td>Work element cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wk_cost_calc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>自動工数計算ＦＬＧ</td>
 *  	<td>Auto man-hour calculation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fxd_wk_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>予定工数（固定）</td>
 *  	<td>Schedule man-hour (Constant)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wk_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>予定工数（数量依存）</td>
 *  	<td>Schedule man-hour (Qty.-dependent)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mst_fxd_wk_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>マスタ工数（固定）</td>
 *  	<td>Master man-hour (Constant)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mst_wk_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>マスタ工数（数量依存）</td>
 *  	<td>Master man-hour (Qty.-dependent)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>disp_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>表示順</td>
 *  	<td>Display order</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>can_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取消ＦＬＧ</td>
 *  	<td>Cancel flg.</td>
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
public class MST_WK_SCHD_P_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_WK_SCHD_P";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 工数予定ＮＯ. Man-hour schedule No..<p>
	 *
	 */
	public static final String $wk_schd_no = "wk_schd_no";
	private static final MCPermColumnInfo _wk_schd_no = createColumnInfo("wk_schd_no");
	public final MCStringPermColumn wk_schd_no = createStringColumn(_wk_schd_no);
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public static final String $mfg_inst_rev = "mfg_inst_rev";
	private static final MCPermColumnInfo _mfg_inst_rev = createColumnInfo("mfg_inst_rev");
	public final MCNumberPermColumn mfg_inst_rev = createNumberColumn(_mfg_inst_rev);
	
	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	private static final MCPermColumnInfo _mfg_inst_no = createColumnInfo("mfg_inst_no");
	public final MCStringPermColumn mfg_inst_no = createStringColumn(_mfg_inst_no);
	
	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	private static final MCPermColumnInfo _itm_mfg_inst_no = createColumnInfo("itm_mfg_inst_no");
	public final MCStringPermColumn itm_mfg_inst_no = createStringColumn(_itm_mfg_inst_no);
	
	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	private static final MCPermColumnInfo _oper_inst_no = createColumnInfo("oper_inst_no");
	public final MCStringPermColumn oper_inst_no = createStringColumn(_oper_inst_no);
	
	/**
	 * 工数管理ＣＤ. Work element cd..<p>
	 *
	 */
	public static final String $wk_cost_cd = "wk_cost_cd";
	private static final MCPermColumnInfo _wk_cost_cd = createColumnInfo("wk_cost_cd");
	public final MCStringPermColumn wk_cost_cd = createStringColumn(_wk_cost_cd);
	
	/**
	 * 自動工数計算ＦＬＧ. Auto man-hour calculation flg..<p>
	 *
	 */
	public static final String $wk_cost_calc_flg = "wk_cost_calc_flg";
	private static final MCPermColumnInfo _wk_cost_calc_flg = createColumnInfo("wk_cost_calc_flg");
	public final MCBooleanPermColumn wk_cost_calc_flg = createBooleanColumn(_wk_cost_calc_flg);
	
	/**
	 * 予定工数（固定）. Schedule man-hour (Constant).<p>
	 *
	 */
	public static final String $fxd_wk_cost = "fxd_wk_cost";
	private static final MCPermColumnInfo _fxd_wk_cost = createColumnInfo("fxd_wk_cost");
	public final MCNumberPermColumn fxd_wk_cost = createNumberColumn(_fxd_wk_cost);
	
	/**
	 * 予定工数（数量依存）. Schedule man-hour (Qty.-dependent).<p>
	 *
	 */
	public static final String $wk_cost = "wk_cost";
	private static final MCPermColumnInfo _wk_cost = createColumnInfo("wk_cost");
	public final MCNumberPermColumn wk_cost = createNumberColumn(_wk_cost);
	
	/**
	 * マスタ工数（固定）. Master man-hour (Constant).<p>
	 *
	 */
	public static final String $mst_fxd_wk_cost = "mst_fxd_wk_cost";
	private static final MCPermColumnInfo _mst_fxd_wk_cost = createColumnInfo("mst_fxd_wk_cost");
	public final MCNumberPermColumn mst_fxd_wk_cost = createNumberColumn(_mst_fxd_wk_cost);
	
	/**
	 * マスタ工数（数量依存）. Master man-hour (Qty.-dependent).<p>
	 *
	 */
	public static final String $mst_wk_cost = "mst_wk_cost";
	private static final MCPermColumnInfo _mst_wk_cost = createColumnInfo("mst_wk_cost");
	public final MCNumberPermColumn mst_wk_cost = createNumberColumn(_mst_wk_cost);
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	private static final MCPermColumnInfo _disp_seq = createColumnInfo("disp_seq");
	public final MCNumberPermColumn disp_seq = createNumberColumn(_disp_seq);
	
	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	private static final MCPermColumnInfo _can_flg = createColumnInfo("can_flg");
	public final MCBooleanPermColumn can_flg = createBooleanColumn(_can_flg);
	
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
	
	public static final MCMeta wk_schd_no_META = createCommonMeta($wk_schd_no, mcframe.commonMA.meta.MA_META.WK_SCHD_NO);
	public static final MCMeta mfg_inst_rev_META = createCommonMeta($mfg_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta wk_cost_cd_META = createCommonMeta($wk_cost_cd, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta wk_cost_calc_flg_META = createCommonMeta($wk_cost_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fxd_wk_cost_META = createCommonMeta($fxd_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta wk_cost_META = createCommonMeta($wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta mst_fxd_wk_cost_META = createCommonMeta($mst_fxd_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta mst_wk_cost_META = createCommonMeta($mst_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.WK_SCHD_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.WK_SCHD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.WK_SCHD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.WK_SCHD_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_WK_SCHD_P_R> constMetas = new ConstMetaList<MST_WK_SCHD_P_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			wk_schd_no_META,
			mfg_inst_rev_META,
			mfg_inst_no_META,
			itm_mfg_inst_no_META,
			oper_inst_no_META,
			wk_cost_cd_META,
			wk_cost_calc_flg_META,
			fxd_wk_cost_META,
			wk_cost_META,
			mst_fxd_wk_cost_META,
			mst_wk_cost_META,
			disp_seq_META,
			can_flg_META,
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
	protected MST_WK_SCHD_P_R(ConstMetaList<? extends MST_WK_SCHD_P_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_WK_SCHD_P_R(ConstMetaList<? extends MST_WK_SCHD_P_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$wk_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WK_SCHD_P_R.$wk_schd_no,
				"wk_schd_no",
				wk_schd_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$mfg_inst_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_WK_SCHD_P_R.$mfg_inst_rev,
				"mfg_inst_rev",
				mfg_inst_rev,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WK_SCHD_P_R.$mfg_inst_no,
				"mfg_inst_no",
				mfg_inst_no,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$itm_mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WK_SCHD_P_R.$itm_mfg_inst_no,
				"itm_mfg_inst_no",
				itm_mfg_inst_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$oper_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WK_SCHD_P_R.$oper_inst_no,
				"oper_inst_no",
				oper_inst_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$wk_cost_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WK_SCHD_P_R.$wk_cost_cd,
				"wk_cost_cd",
				wk_cost_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$wk_cost_calc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_WK_SCHD_P_R.$wk_cost_calc_flg,
				"wk_cost_calc_flg",
				wk_cost_calc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$fxd_wk_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_WK_SCHD_P_R.$fxd_wk_cost,
				"fxd_wk_cost",
				fxd_wk_cost,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$wk_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_WK_SCHD_P_R.$wk_cost,
				"wk_cost",
				wk_cost,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$mst_fxd_wk_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_WK_SCHD_P_R.$mst_fxd_wk_cost,
				"mst_fxd_wk_cost",
				mst_fxd_wk_cost,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$mst_wk_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_WK_SCHD_P_R.$mst_wk_cost,
				"mst_wk_cost",
				mst_wk_cost,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$disp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_WK_SCHD_P_R.$disp_seq,
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
			MST_WK_SCHD_P_R.$can_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_WK_SCHD_P_R.$can_flg,
				"can_flg",
				can_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WK_SCHD_P_R.$intr_rmrks,
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
			MST_WK_SCHD_P_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WK_SCHD_P_R.$sub_char1,
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
			MST_WK_SCHD_P_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WK_SCHD_P_R.$sub_char2,
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
			MST_WK_SCHD_P_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WK_SCHD_P_R.$sub_char3,
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
			MST_WK_SCHD_P_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WK_SCHD_P_R.$ins_usr_id,
				"ins_usr_id",
				ins_usr_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WK_SCHD_P_R.$ins_usr_nm,
				"ins_usr_nm",
				ins_usr_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_WK_SCHD_P_R.$ins_ts,
				"ins_ts",
				ins_ts,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WK_SCHD_P_R.$ins_func_id,
				"ins_func_id",
				ins_func_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_WK_SCHD_P_R.$upd_cntr,
				"upd_cntr",
				upd_cntr,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WK_SCHD_P_R.$upd_usr_id,
				"upd_usr_id",
				upd_usr_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WK_SCHD_P_R.$upd_usr_nm,
				"upd_usr_nm",
				upd_usr_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_WK_SCHD_P_R.$upd_ts,
				"upd_ts",
				upd_ts,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WK_SCHD_P_R.$upd_func_id,
				"upd_func_id",
				upd_func_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_WK_SCHD_P_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_WK_SCHD_P_R.$upd_srv_req_no,
				"upd_srv_req_no",
				upd_srv_req_no,
				false,
				true,
				false,
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
	public static MST_WK_SCHD_P_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_WK_SCHD_P_R create(String alias) {
		MST_WK_SCHD_P_R row = new MST_WK_SCHD_P_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_WK_SCHD_P_R createByName(T proto) {
		MST_WK_SCHD_P_R row = MST_WK_SCHD_P_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_WK_SCHD_P_R clone() {
		return (MST_WK_SCHD_P_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_WK_SCHD_P_R createInstance() {
		return (MST_WK_SCHD_P_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_WK_SCHD_P_R getValues(String... names) {
		return (MST_WK_SCHD_P_R) super.getValues(names);
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
	 public MSW_WK_SCHD_P_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_WK_SCHD_P_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_WK_SCHD_P_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_WK_SCHD_P_KEY_R.TABLE_NAME);
	 }

	/**
	 * 工数予定ＮＯ. Man-hour schedule No..<p>
	 *
	 */
	public String wk_schd_no() {
		return getConstString(offset + 0, $wk_schd_no);
	}

	/**
	 * 工数予定ＮＯ. Man-hour schedule No..<p>
	 *
	 */
	public void wk_schd_no(String value) {
		setConstString(offset + 0, $wk_schd_no, value);
	}

	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public MCNumber mfg_inst_rev() {
		return getConstNumber(offset + 1, $mfg_inst_rev);
	}

	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(MCNumber value) {
		setConstNumber(offset + 1, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(int value) {
		setConstNumber(offset + 1, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(long value) {
		setConstNumber(offset + 1, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(float value) {
		setConstNumber(offset + 1, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(double value) {
		setConstNumber(offset + 1, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 2, $mfg_inst_no);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 2, $mfg_inst_no, value);
	}

	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 3, $itm_mfg_inst_no);
	}

	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 3, $itm_mfg_inst_no, value);
	}

	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 4, $oper_inst_no);
	}

	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 4, $oper_inst_no, value);
	}

	/**
	 * 工数管理ＣＤ. Work element cd..<p>
	 *
	 */
	public String wk_cost_cd() {
		return getConstString(offset + 5, $wk_cost_cd);
	}

	/**
	 * 工数管理ＣＤ. Work element cd..<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		setConstString(offset + 5, $wk_cost_cd, value);
	}

	/**
	 * 自動工数計算ＦＬＧ. Auto man-hour calculation flg..<p>
	 *
	 */
	public boolean wk_cost_calc_flg() {
		return getConstBoolean(offset + 6, $wk_cost_calc_flg);
	}

	/**
	 * 自動工数計算ＦＬＧ. Auto man-hour calculation flg..<p>
	 *
	 */
	public void wk_cost_calc_flg(boolean value) {
		setConstBoolean(offset + 6, $wk_cost_calc_flg, value);
	}

	/**
	 * 予定工数（固定）. Schedule man-hour (Constant).<p>
	 *
	 */
	public MCNumber fxd_wk_cost() {
		return getConstNumber(offset + 7, $fxd_wk_cost);
	}

	/**
	 * 予定工数（固定）. Schedule man-hour (Constant).<p>
	 *
	 */
	public void fxd_wk_cost(MCNumber value) {
		setConstNumber(offset + 7, $fxd_wk_cost, value);
	}
	
	/**
	 * 予定工数（固定）. Schedule man-hour (Constant).<p>
	 *
	 */
	public void fxd_wk_cost(int value) {
		setConstNumber(offset + 7, $fxd_wk_cost, value);
	}
	
	/**
	 * 予定工数（固定）. Schedule man-hour (Constant).<p>
	 *
	 */
	public void fxd_wk_cost(long value) {
		setConstNumber(offset + 7, $fxd_wk_cost, value);
	}
	
	/**
	 * 予定工数（固定）. Schedule man-hour (Constant).<p>
	 *
	 */
	public void fxd_wk_cost(float value) {
		setConstNumber(offset + 7, $fxd_wk_cost, value);
	}
	
	/**
	 * 予定工数（固定）. Schedule man-hour (Constant).<p>
	 *
	 */
	public void fxd_wk_cost(double value) {
		setConstNumber(offset + 7, $fxd_wk_cost, value);
	}
	
	/**
	 * 予定工数（数量依存）. Schedule man-hour (Qty.-dependent).<p>
	 *
	 */
	public MCNumber wk_cost() {
		return getConstNumber(offset + 8, $wk_cost);
	}

	/**
	 * 予定工数（数量依存）. Schedule man-hour (Qty.-dependent).<p>
	 *
	 */
	public void wk_cost(MCNumber value) {
		setConstNumber(offset + 8, $wk_cost, value);
	}
	
	/**
	 * 予定工数（数量依存）. Schedule man-hour (Qty.-dependent).<p>
	 *
	 */
	public void wk_cost(int value) {
		setConstNumber(offset + 8, $wk_cost, value);
	}
	
	/**
	 * 予定工数（数量依存）. Schedule man-hour (Qty.-dependent).<p>
	 *
	 */
	public void wk_cost(long value) {
		setConstNumber(offset + 8, $wk_cost, value);
	}
	
	/**
	 * 予定工数（数量依存）. Schedule man-hour (Qty.-dependent).<p>
	 *
	 */
	public void wk_cost(float value) {
		setConstNumber(offset + 8, $wk_cost, value);
	}
	
	/**
	 * 予定工数（数量依存）. Schedule man-hour (Qty.-dependent).<p>
	 *
	 */
	public void wk_cost(double value) {
		setConstNumber(offset + 8, $wk_cost, value);
	}
	
	/**
	 * マスタ工数（固定）. Master man-hour (Constant).<p>
	 *
	 */
	public MCNumber mst_fxd_wk_cost() {
		return getConstNumber(offset + 9, $mst_fxd_wk_cost);
	}

	/**
	 * マスタ工数（固定）. Master man-hour (Constant).<p>
	 *
	 */
	public void mst_fxd_wk_cost(MCNumber value) {
		setConstNumber(offset + 9, $mst_fxd_wk_cost, value);
	}
	
	/**
	 * マスタ工数（固定）. Master man-hour (Constant).<p>
	 *
	 */
	public void mst_fxd_wk_cost(int value) {
		setConstNumber(offset + 9, $mst_fxd_wk_cost, value);
	}
	
	/**
	 * マスタ工数（固定）. Master man-hour (Constant).<p>
	 *
	 */
	public void mst_fxd_wk_cost(long value) {
		setConstNumber(offset + 9, $mst_fxd_wk_cost, value);
	}
	
	/**
	 * マスタ工数（固定）. Master man-hour (Constant).<p>
	 *
	 */
	public void mst_fxd_wk_cost(float value) {
		setConstNumber(offset + 9, $mst_fxd_wk_cost, value);
	}
	
	/**
	 * マスタ工数（固定）. Master man-hour (Constant).<p>
	 *
	 */
	public void mst_fxd_wk_cost(double value) {
		setConstNumber(offset + 9, $mst_fxd_wk_cost, value);
	}
	
	/**
	 * マスタ工数（数量依存）. Master man-hour (Qty.-dependent).<p>
	 *
	 */
	public MCNumber mst_wk_cost() {
		return getConstNumber(offset + 10, $mst_wk_cost);
	}

	/**
	 * マスタ工数（数量依存）. Master man-hour (Qty.-dependent).<p>
	 *
	 */
	public void mst_wk_cost(MCNumber value) {
		setConstNumber(offset + 10, $mst_wk_cost, value);
	}
	
	/**
	 * マスタ工数（数量依存）. Master man-hour (Qty.-dependent).<p>
	 *
	 */
	public void mst_wk_cost(int value) {
		setConstNumber(offset + 10, $mst_wk_cost, value);
	}
	
	/**
	 * マスタ工数（数量依存）. Master man-hour (Qty.-dependent).<p>
	 *
	 */
	public void mst_wk_cost(long value) {
		setConstNumber(offset + 10, $mst_wk_cost, value);
	}
	
	/**
	 * マスタ工数（数量依存）. Master man-hour (Qty.-dependent).<p>
	 *
	 */
	public void mst_wk_cost(float value) {
		setConstNumber(offset + 10, $mst_wk_cost, value);
	}
	
	/**
	 * マスタ工数（数量依存）. Master man-hour (Qty.-dependent).<p>
	 *
	 */
	public void mst_wk_cost(double value) {
		setConstNumber(offset + 10, $mst_wk_cost, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 11, $disp_seq);
	}

	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 11, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 11, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 11, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 11, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 11, $disp_seq, value);
	}
	
	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 12, $can_flg);
	}

	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 12, $can_flg, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 13, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 13, $intr_rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 14, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 14, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 15, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 15, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 16, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 16, $sub_char3, value);
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

	public String getString(String name) {
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			return wk_schd_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			return fxd_wk_cost();
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			return wk_cost();
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			return mst_fxd_wk_cost();
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			return mst_wk_cost();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
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

	public boolean getBoolean(String name) {
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			return wk_schd_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			return fxd_wk_cost();
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			return wk_cost();
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			return mst_fxd_wk_cost();
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			return mst_wk_cost();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
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

	public boolean getBooleanNE(String name) {
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			wk_schd_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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

	public void setBoolean(String name, boolean value) {
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			wk_schd_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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

	public void setBooleanNE(String name, boolean value) {
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
