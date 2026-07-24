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
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "出荷予定日計算ワーク // Scheduled shipping date calculation work"DBコンテナRowクラスです。<p>
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
 *  	<td>C</td>
 *  	<td>ship_to_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>送付先識別区分</td>
 *  	<td>Receiving point identification type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_to_id_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>送付先識別ＣＤ</td>
 *  	<td>Receiving point identification cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_to_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷先物流グループＣＤ</td>
 *  	<td>Receiving point distribution group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_fr_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷元物流グループＣＤ</td>
 *  	<td>Shipping point distribution group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_term_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷条件ＣＤ</td>
 *  	<td>Shipping conditions cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_rqst_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入希望日時</td>
 *  	<td>Desired delivery date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_day_week_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>着曜日</td>
 *  	<td>Arrival day of week</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_rqst_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷希望日時</td>
 *  	<td>Desired shipping date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準日</td>
 *  	<td>Base date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_inst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷指図区分</td>
 *  	<td>Shipping order type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cl_time_chk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>締時間チェックＦＬＧ</td>
 *  	<td>Closing time check flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_dt_chk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷日チェックＦＬＧ</td>
 *  	<td>Shipping date check flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xfr_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>移動ＬＴ</td>
 *  	<td>Movement LT</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fin_cl_time</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷締時間</td>
 *  	<td>Shipping closing time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_wk_grp_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷作業グループＣＤ</td>
 *  	<td>Shipping operation group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_wk_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷作業ＣＤ</td>
 *  	<td>Shipping operation cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_schd_time</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷予定時刻</td>
 *  	<td>Shipping schedule time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>to_cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷先カレンダＣＤ</td>
 *  	<td>Receiving point calendar cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fr_cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷元カレンダＣＤ</td>
 *  	<td>Shipping point calendar cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>est_ship_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>最早出荷予定日</td>
 *  	<td>Scheduled earliest shipping date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷予定日時</td>
 *  	<td>Scheduled shipping date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品予定日時</td>
 *  	<td>Scheduled delivery date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>peg_no</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>紐付けＮＯ</td>
 *  	<td>Pegging No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷作業カレンダＣＤ</td>
 *  	<td>Shipping operation calendar cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>early_ship_dt_add_days</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>最早出荷日加算日数</td>
 *  	<td>Number of days added to earliest shipping date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_cal_cd_chk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷作業カレンダチェックＦＬＧ</td>
 *  	<td>Shipping operation calendar cd check flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>early_ship_dt_add_days_chk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>最早出荷日加算日数チェックＦＬＧ</td>
 *  	<td>Number of days added to earliest shipping date check flg.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_SHIP_SCHD_DT_CALC_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_SHIP_SCHD_DT_CALC";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 送付先識別区分. Receiving point identification type.<p>
	 *
	 */
	public static final String $ship_to_id_typ = "ship_to_id_typ";
	private static final MCPermColumnInfo _ship_to_id_typ = createColumnInfo("ship_to_id_typ");
	public final MCStringPermColumn ship_to_id_typ = createStringColumn(_ship_to_id_typ);
	
	/**
	 * 送付先識別ＣＤ. Receiving point identification cd..<p>
	 *
	 */
	public static final String $ship_to_id_cd = "ship_to_id_cd";
	private static final MCPermColumnInfo _ship_to_id_cd = createColumnInfo("ship_to_id_cd");
	public final MCStringPermColumn ship_to_id_cd = createStringColumn(_ship_to_id_cd);
	
	/**
	 * 出荷先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public static final String $ship_to_lg_grp_cd = "ship_to_lg_grp_cd";
	private static final MCPermColumnInfo _ship_to_lg_grp_cd = createColumnInfo("ship_to_lg_grp_cd");
	public final MCStringPermColumn ship_to_lg_grp_cd = createStringColumn(_ship_to_lg_grp_cd);
	
	/**
	 * 出荷元物流グループＣＤ. Shipping point distribution group cd..<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_cd = "ship_fr_lg_grp_cd";
	private static final MCPermColumnInfo _ship_fr_lg_grp_cd = createColumnInfo("ship_fr_lg_grp_cd");
	public final MCStringPermColumn ship_fr_lg_grp_cd = createStringColumn(_ship_fr_lg_grp_cd);
	
	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	private static final MCPermColumnInfo _ship_term_cd = createColumnInfo("ship_term_cd");
	public final MCStringPermColumn ship_term_cd = createStringColumn(_ship_term_cd);
	
	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public static final String $dlv_rqst_tm = "dlv_rqst_tm";
	private static final MCPermColumnInfo _dlv_rqst_tm = createColumnInfo("dlv_rqst_tm");
	public final MCDatePermColumn dlv_rqst_tm = createDateColumn(_dlv_rqst_tm);
	
	/**
	 * 着曜日. Arrival day of week.<p>
	 *
	 */
	public static final String $dlv_day_week_typ = "dlv_day_week_typ";
	private static final MCPermColumnInfo _dlv_day_week_typ = createColumnInfo("dlv_day_week_typ");
	public final MCStringPermColumn dlv_day_week_typ = createStringColumn(_dlv_day_week_typ);
	
	/**
	 * 出荷希望日時. Desired shipping date and time.<p>
	 *
	 */
	public static final String $ship_rqst_tm = "ship_rqst_tm";
	private static final MCPermColumnInfo _ship_rqst_tm = createColumnInfo("ship_rqst_tm");
	public final MCDatePermColumn ship_rqst_tm = createDateColumn(_ship_rqst_tm);
	
	/**
	 * 基準日. Base date.<p>
	 *
	 */
	public static final String $base_dt = "base_dt";
	private static final MCPermColumnInfo _base_dt = createColumnInfo("base_dt");
	public final MCDatePermColumn base_dt = createDateColumn(_base_dt);
	
	/**
	 * 出荷指図区分. Shipping order type.<p>
	 *
	 */
	public static final String $ship_inst_typ = "ship_inst_typ";
	private static final MCPermColumnInfo _ship_inst_typ = createColumnInfo("ship_inst_typ");
	public final MCStringPermColumn ship_inst_typ = createStringColumn(_ship_inst_typ);
	
	/**
	 * 締時間チェックＦＬＧ. Closing time check flg..<p>
	 *
	 */
	public static final String $cl_time_chk_flg = "cl_time_chk_flg";
	private static final MCPermColumnInfo _cl_time_chk_flg = createColumnInfo("cl_time_chk_flg");
	public final MCBooleanPermColumn cl_time_chk_flg = createBooleanColumn(_cl_time_chk_flg);
	
	/**
	 * 出荷日チェックＦＬＧ. Shipping date check flg..<p>
	 *
	 */
	public static final String $ship_dt_chk_flg = "ship_dt_chk_flg";
	private static final MCPermColumnInfo _ship_dt_chk_flg = createColumnInfo("ship_dt_chk_flg");
	public final MCBooleanPermColumn ship_dt_chk_flg = createBooleanColumn(_ship_dt_chk_flg);
	
	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public static final String $xfr_lt = "xfr_lt";
	private static final MCPermColumnInfo _xfr_lt = createColumnInfo("xfr_lt");
	public final MCNumberPermColumn xfr_lt = createNumberColumn(_xfr_lt);
	
	/**
	 * 出荷締時間. Shipping closing time.<p>
	 *
	 */
	public static final String $fin_cl_time = "fin_cl_time";
	private static final MCPermColumnInfo _fin_cl_time = createColumnInfo("fin_cl_time");
	public final MCStringPermColumn fin_cl_time = createStringColumn(_fin_cl_time);
	
	/**
	 * 出荷作業グループＣＤ. Shipping operation group cd..<p>
	 *
	 */
	public static final String $ship_wk_grp_cd = "ship_wk_grp_cd";
	private static final MCPermColumnInfo _ship_wk_grp_cd = createColumnInfo("ship_wk_grp_cd");
	public final MCStringPermColumn ship_wk_grp_cd = createStringColumn(_ship_wk_grp_cd);
	
	/**
	 * 出荷作業ＣＤ. Shipping operation cd..<p>
	 *
	 */
	public static final String $ship_wk_cd = "ship_wk_cd";
	private static final MCPermColumnInfo _ship_wk_cd = createColumnInfo("ship_wk_cd");
	public final MCStringPermColumn ship_wk_cd = createStringColumn(_ship_wk_cd);
	
	/**
	 * 出荷予定時刻. Shipping schedule time.<p>
	 *
	 */
	public static final String $ship_schd_time = "ship_schd_time";
	private static final MCPermColumnInfo _ship_schd_time = createColumnInfo("ship_schd_time");
	public final MCStringPermColumn ship_schd_time = createStringColumn(_ship_schd_time);
	
	/**
	 * 出荷先カレンダＣＤ. Receiving point calendar cd..<p>
	 *
	 */
	public static final String $to_cal_cd = "to_cal_cd";
	private static final MCPermColumnInfo _to_cal_cd = createColumnInfo("to_cal_cd");
	public final MCStringPermColumn to_cal_cd = createStringColumn(_to_cal_cd);
	
	/**
	 * 出荷元カレンダＣＤ. Shipping point calendar cd..<p>
	 *
	 */
	public static final String $fr_cal_cd = "fr_cal_cd";
	private static final MCPermColumnInfo _fr_cal_cd = createColumnInfo("fr_cal_cd");
	public final MCStringPermColumn fr_cal_cd = createStringColumn(_fr_cal_cd);
	
	/**
	 * 最早出荷予定日. Scheduled earliest shipping date.<p>
	 *
	 */
	public static final String $est_ship_schd_dt = "est_ship_schd_dt";
	private static final MCPermColumnInfo _est_ship_schd_dt = createColumnInfo("est_ship_schd_dt");
	public final MCDatePermColumn est_ship_schd_dt = createDateColumn(_est_ship_schd_dt);
	
	/**
	 * 出荷予定日時. Scheduled shipping date and time.<p>
	 *
	 */
	public static final String $ship_schd_tm = "ship_schd_tm";
	private static final MCPermColumnInfo _ship_schd_tm = createColumnInfo("ship_schd_tm");
	public final MCDatePermColumn ship_schd_tm = createDateColumn(_ship_schd_tm);
	
	/**
	 * 納品予定日時. Scheduled delivery date and time.<p>
	 *
	 */
	public static final String $dlv_schd_tm = "dlv_schd_tm";
	private static final MCPermColumnInfo _dlv_schd_tm = createColumnInfo("dlv_schd_tm");
	public final MCDatePermColumn dlv_schd_tm = createDateColumn(_dlv_schd_tm);
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	private static final MCPermColumnInfo _peg_no = createColumnInfo("peg_no");
	public final MCNumberPermColumn peg_no = createNumberColumn(_peg_no);
	
	/**
	 * 出荷作業カレンダＣＤ. Shipping operation calendar cd..<p>
	 *
	 */
	public static final String $ship_cal_cd = "ship_cal_cd";
	private static final MCPermColumnInfo _ship_cal_cd = createColumnInfo("ship_cal_cd");
	public final MCStringPermColumn ship_cal_cd = createStringColumn(_ship_cal_cd);
	
	/**
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public static final String $early_ship_dt_add_days = "early_ship_dt_add_days";
	private static final MCPermColumnInfo _early_ship_dt_add_days = createColumnInfo("early_ship_dt_add_days");
	public final MCNumberPermColumn early_ship_dt_add_days = createNumberColumn(_early_ship_dt_add_days);
	
	/**
	 * 出荷作業カレンダチェックＦＬＧ. Shipping operation calendar cd check flg..<p>
	 *
	 */
	public static final String $ship_cal_cd_chk_flg = "ship_cal_cd_chk_flg";
	private static final MCPermColumnInfo _ship_cal_cd_chk_flg = createColumnInfo("ship_cal_cd_chk_flg");
	public final MCBooleanPermColumn ship_cal_cd_chk_flg = createBooleanColumn(_ship_cal_cd_chk_flg);
	
	/**
	 * 最早出荷日加算日数チェックＦＬＧ. Number of days added to earliest shipping date check flg..<p>
	 *
	 */
	public static final String $early_ship_dt_add_days_chk_flg = "early_ship_dt_add_days_chk_flg";
	private static final MCPermColumnInfo _early_ship_dt_add_days_chk_flg = createColumnInfo("early_ship_dt_add_days_chk_flg");
	public final MCBooleanPermColumn early_ship_dt_add_days_chk_flg = createBooleanColumn(_early_ship_dt_add_days_chk_flg);
	
	public static final MCMeta ship_to_id_typ_META = createCommonMeta($ship_to_id_typ, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP);
	public static final MCMeta ship_to_id_cd_META = createCommonMeta($ship_to_id_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta ship_to_lg_grp_cd_META = createCommonMeta($ship_to_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta dlv_rqst_tm_META = createCommonMeta($dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_day_week_typ_META = createCommonMeta($dlv_day_week_typ, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP);
	public static final MCMeta ship_rqst_tm_META = createCommonMeta($ship_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta base_dt_META = createCommonMeta($base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_inst_typ_META = createCommonMeta($ship_inst_typ, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP);
	public static final MCMeta cl_time_chk_flg_META = createCommonMeta($cl_time_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_dt_chk_flg_META = createCommonMeta($ship_dt_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_lt_META = createCommonMeta($xfr_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta fin_cl_time_META = createCommonMeta($fin_cl_time, mcframe.commonMA.meta.MA_META.CHAR_HM);
	public static final MCMeta ship_wk_grp_cd_META = createCommonMeta($ship_wk_grp_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_GRP_CD);
	public static final MCMeta ship_wk_cd_META = createCommonMeta($ship_wk_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_CD);
	public static final MCMeta ship_schd_time_META = createCommonMeta($ship_schd_time, mcframe.commonMA.meta.MA_META.CHAR_HM);
	public static final MCMeta to_cal_cd_META = createCommonMeta($to_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta fr_cal_cd_META = createCommonMeta($fr_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta est_ship_schd_dt_META = createCommonMeta($est_ship_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_schd_tm_META = createCommonMeta($ship_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_schd_tm_META = createCommonMeta($dlv_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ship_cal_cd_META = createCommonMeta($ship_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta early_ship_dt_add_days_META = createCommonMeta($early_ship_dt_add_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta ship_cal_cd_chk_flg_META = createCommonMeta($ship_cal_cd_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta early_ship_dt_add_days_chk_flg_META = createCommonMeta($early_ship_dt_add_days_chk_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSW_SHIP_SCHD_DT_CALC_R> constMetas = new ConstMetaList<MSW_SHIP_SCHD_DT_CALC_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			ship_to_id_typ_META,
			ship_to_id_cd_META,
			ship_to_lg_grp_cd_META,
			ship_fr_lg_grp_cd_META,
			ship_term_cd_META,
			dlv_rqst_tm_META,
			dlv_day_week_typ_META,
			ship_rqst_tm_META,
			base_dt_META,
			ship_inst_typ_META,
			cl_time_chk_flg_META,
			ship_dt_chk_flg_META,
			xfr_lt_META,
			fin_cl_time_META,
			ship_wk_grp_cd_META,
			ship_wk_cd_META,
			ship_schd_time_META,
			to_cal_cd_META,
			fr_cal_cd_META,
			est_ship_schd_dt_META,
			ship_schd_tm_META,
			dlv_schd_tm_META,
			peg_no_META,
			ship_cal_cd_META,
			early_ship_dt_add_days_META,
			ship_cal_cd_chk_flg_META,
			early_ship_dt_add_days_chk_flg_META
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
	protected MSW_SHIP_SCHD_DT_CALC_R(ConstMetaList<? extends MSW_SHIP_SCHD_DT_CALC_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_SHIP_SCHD_DT_CALC_R(ConstMetaList<? extends MSW_SHIP_SCHD_DT_CALC_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$ship_to_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SHIP_SCHD_DT_CALC_R.$ship_to_id_typ,
				"ship_to_id_typ",
				ship_to_id_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$ship_to_id_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SHIP_SCHD_DT_CALC_R.$ship_to_id_cd,
				"ship_to_id_cd",
				ship_to_id_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$ship_to_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SHIP_SCHD_DT_CALC_R.$ship_to_lg_grp_cd,
				"ship_to_lg_grp_cd",
				ship_to_lg_grp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$ship_fr_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SHIP_SCHD_DT_CALC_R.$ship_fr_lg_grp_cd,
				"ship_fr_lg_grp_cd",
				ship_fr_lg_grp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$ship_term_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SHIP_SCHD_DT_CALC_R.$ship_term_cd,
				"ship_term_cd",
				ship_term_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$dlv_rqst_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_SHIP_SCHD_DT_CALC_R.$dlv_rqst_tm,
				"dlv_rqst_tm",
				dlv_rqst_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$dlv_day_week_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SHIP_SCHD_DT_CALC_R.$dlv_day_week_typ,
				"dlv_day_week_typ",
				dlv_day_week_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$ship_rqst_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_SHIP_SCHD_DT_CALC_R.$ship_rqst_tm,
				"ship_rqst_tm",
				ship_rqst_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$base_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_SHIP_SCHD_DT_CALC_R.$base_dt,
				"base_dt",
				base_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$ship_inst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SHIP_SCHD_DT_CALC_R.$ship_inst_typ,
				"ship_inst_typ",
				ship_inst_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$cl_time_chk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSW_SHIP_SCHD_DT_CALC_R.$cl_time_chk_flg,
				"cl_time_chk_flg",
				cl_time_chk_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$ship_dt_chk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSW_SHIP_SCHD_DT_CALC_R.$ship_dt_chk_flg,
				"ship_dt_chk_flg",
				ship_dt_chk_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$xfr_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SHIP_SCHD_DT_CALC_R.$xfr_lt,
				"xfr_lt",
				xfr_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$fin_cl_time,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SHIP_SCHD_DT_CALC_R.$fin_cl_time,
				"fin_cl_time",
				fin_cl_time,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$ship_wk_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SHIP_SCHD_DT_CALC_R.$ship_wk_grp_cd,
				"ship_wk_grp_cd",
				ship_wk_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$ship_wk_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SHIP_SCHD_DT_CALC_R.$ship_wk_cd,
				"ship_wk_cd",
				ship_wk_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$ship_schd_time,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SHIP_SCHD_DT_CALC_R.$ship_schd_time,
				"ship_schd_time",
				ship_schd_time,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$to_cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SHIP_SCHD_DT_CALC_R.$to_cal_cd,
				"to_cal_cd",
				to_cal_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$fr_cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SHIP_SCHD_DT_CALC_R.$fr_cal_cd,
				"fr_cal_cd",
				fr_cal_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$est_ship_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_SHIP_SCHD_DT_CALC_R.$est_ship_schd_dt,
				"est_ship_schd_dt",
				est_ship_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$ship_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_SHIP_SCHD_DT_CALC_R.$ship_schd_tm,
				"ship_schd_tm",
				ship_schd_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$dlv_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_SHIP_SCHD_DT_CALC_R.$dlv_schd_tm,
				"dlv_schd_tm",
				dlv_schd_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$peg_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SHIP_SCHD_DT_CALC_R.$peg_no,
				"peg_no",
				peg_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$ship_cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SHIP_SCHD_DT_CALC_R.$ship_cal_cd,
				"ship_cal_cd",
				ship_cal_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$early_ship_dt_add_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SHIP_SCHD_DT_CALC_R.$early_ship_dt_add_days,
				"early_ship_dt_add_days",
				early_ship_dt_add_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$ship_cal_cd_chk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSW_SHIP_SCHD_DT_CALC_R.$ship_cal_cd_chk_flg,
				"ship_cal_cd_chk_flg",
				ship_cal_cd_chk_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_SCHD_DT_CALC_R.$early_ship_dt_add_days_chk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSW_SHIP_SCHD_DT_CALC_R.$early_ship_dt_add_days_chk_flg,
				"early_ship_dt_add_days_chk_flg",
				early_ship_dt_add_days_chk_flg,
				false,
				false,
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
	public static MSW_SHIP_SCHD_DT_CALC_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_SHIP_SCHD_DT_CALC_R create(String alias) {
		MSW_SHIP_SCHD_DT_CALC_R row = new MSW_SHIP_SCHD_DT_CALC_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_SHIP_SCHD_DT_CALC_R createByName(T proto) {
		MSW_SHIP_SCHD_DT_CALC_R row = MSW_SHIP_SCHD_DT_CALC_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SHIP_SCHD_DT_CALC_R clone() {
		return (MSW_SHIP_SCHD_DT_CALC_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SHIP_SCHD_DT_CALC_R createInstance() {
		return (MSW_SHIP_SCHD_DT_CALC_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SHIP_SCHD_DT_CALC_R getValues(String... names) {
		return (MSW_SHIP_SCHD_DT_CALC_R) super.getValues(names);
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
		return false;
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
	 public MCDBContainer getPkWorkDbc(String alias) {
	 	return null;
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MCDBContainer getPkWorkDbc() {
	 	return null;
	 }

	/**
	 * 送付先識別区分. Receiving point identification type.<p>
	 *
	 */
	public String ship_to_id_typ() {
		return getConstString(offset + 0, $ship_to_id_typ);
	}

	/**
	 * 送付先識別区分. Receiving point identification type.<p>
	 *
	 */
	public void ship_to_id_typ(String value) {
		setConstString(offset + 0, $ship_to_id_typ, value);
	}

	/**
	 * 送付先識別ＣＤ. Receiving point identification cd..<p>
	 *
	 */
	public String ship_to_id_cd() {
		return getConstString(offset + 1, $ship_to_id_cd);
	}

	/**
	 * 送付先識別ＣＤ. Receiving point identification cd..<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		setConstString(offset + 1, $ship_to_id_cd, value);
	}

	/**
	 * 出荷先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public String ship_to_lg_grp_cd() {
		return getConstString(offset + 2, $ship_to_lg_grp_cd);
	}

	/**
	 * 出荷先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public void ship_to_lg_grp_cd(String value) {
		setConstString(offset + 2, $ship_to_lg_grp_cd, value);
	}

	/**
	 * 出荷元物流グループＣＤ. Shipping point distribution group cd..<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 3, $ship_fr_lg_grp_cd);
	}

	/**
	 * 出荷元物流グループＣＤ. Shipping point distribution group cd..<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 3, $ship_fr_lg_grp_cd, value);
	}

	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 4, $ship_term_cd);
	}

	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 4, $ship_term_cd, value);
	}

	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return getConstDate(offset + 5, $dlv_rqst_tm);
	}

	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 5, $dlv_rqst_tm, value);
	}

	/**
	 * 着曜日. Arrival day of week.<p>
	 *
	 */
	public String dlv_day_week_typ() {
		return getConstString(offset + 6, $dlv_day_week_typ);
	}

	/**
	 * 着曜日. Arrival day of week.<p>
	 *
	 */
	public void dlv_day_week_typ(String value) {
		setConstString(offset + 6, $dlv_day_week_typ, value);
	}

	/**
	 * 出荷希望日時. Desired shipping date and time.<p>
	 *
	 */
	public MCDate ship_rqst_tm() {
		return getConstDate(offset + 7, $ship_rqst_tm);
	}

	/**
	 * 出荷希望日時. Desired shipping date and time.<p>
	 *
	 */
	public void ship_rqst_tm(MCDate value) {
		setConstDate(offset + 7, $ship_rqst_tm, value);
	}

	/**
	 * 基準日. Base date.<p>
	 *
	 */
	public MCDate base_dt() {
		return getConstDate(offset + 8, $base_dt);
	}

	/**
	 * 基準日. Base date.<p>
	 *
	 */
	public void base_dt(MCDate value) {
		setConstDate(offset + 8, $base_dt, value);
	}

	/**
	 * 出荷指図区分. Shipping order type.<p>
	 *
	 */
	public String ship_inst_typ() {
		return getConstString(offset + 9, $ship_inst_typ);
	}

	/**
	 * 出荷指図区分. Shipping order type.<p>
	 *
	 */
	public void ship_inst_typ(String value) {
		setConstString(offset + 9, $ship_inst_typ, value);
	}

	/**
	 * 締時間チェックＦＬＧ. Closing time check flg..<p>
	 *
	 */
	public boolean cl_time_chk_flg() {
		return getConstBoolean(offset + 10, $cl_time_chk_flg);
	}

	/**
	 * 締時間チェックＦＬＧ. Closing time check flg..<p>
	 *
	 */
	public void cl_time_chk_flg(boolean value) {
		setConstBoolean(offset + 10, $cl_time_chk_flg, value);
	}

	/**
	 * 出荷日チェックＦＬＧ. Shipping date check flg..<p>
	 *
	 */
	public boolean ship_dt_chk_flg() {
		return getConstBoolean(offset + 11, $ship_dt_chk_flg);
	}

	/**
	 * 出荷日チェックＦＬＧ. Shipping date check flg..<p>
	 *
	 */
	public void ship_dt_chk_flg(boolean value) {
		setConstBoolean(offset + 11, $ship_dt_chk_flg, value);
	}

	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public MCNumber xfr_lt() {
		return getConstNumber(offset + 12, $xfr_lt);
	}

	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public void xfr_lt(MCNumber value) {
		setConstNumber(offset + 12, $xfr_lt, value);
	}
	
	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public void xfr_lt(int value) {
		setConstNumber(offset + 12, $xfr_lt, value);
	}
	
	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public void xfr_lt(long value) {
		setConstNumber(offset + 12, $xfr_lt, value);
	}
	
	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public void xfr_lt(float value) {
		setConstNumber(offset + 12, $xfr_lt, value);
	}
	
	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public void xfr_lt(double value) {
		setConstNumber(offset + 12, $xfr_lt, value);
	}
	
	/**
	 * 出荷締時間. Shipping closing time.<p>
	 *
	 */
	public String fin_cl_time() {
		return getConstString(offset + 13, $fin_cl_time);
	}

	/**
	 * 出荷締時間. Shipping closing time.<p>
	 *
	 */
	public void fin_cl_time(String value) {
		setConstString(offset + 13, $fin_cl_time, value);
	}

	/**
	 * 出荷作業グループＣＤ. Shipping operation group cd..<p>
	 *
	 */
	public String ship_wk_grp_cd() {
		return getConstString(offset + 14, $ship_wk_grp_cd);
	}

	/**
	 * 出荷作業グループＣＤ. Shipping operation group cd..<p>
	 *
	 */
	public void ship_wk_grp_cd(String value) {
		setConstString(offset + 14, $ship_wk_grp_cd, value);
	}

	/**
	 * 出荷作業ＣＤ. Shipping operation cd..<p>
	 *
	 */
	public String ship_wk_cd() {
		return getConstString(offset + 15, $ship_wk_cd);
	}

	/**
	 * 出荷作業ＣＤ. Shipping operation cd..<p>
	 *
	 */
	public void ship_wk_cd(String value) {
		setConstString(offset + 15, $ship_wk_cd, value);
	}

	/**
	 * 出荷予定時刻. Shipping schedule time.<p>
	 *
	 */
	public String ship_schd_time() {
		return getConstString(offset + 16, $ship_schd_time);
	}

	/**
	 * 出荷予定時刻. Shipping schedule time.<p>
	 *
	 */
	public void ship_schd_time(String value) {
		setConstString(offset + 16, $ship_schd_time, value);
	}

	/**
	 * 出荷先カレンダＣＤ. Receiving point calendar cd..<p>
	 *
	 */
	public String to_cal_cd() {
		return getConstString(offset + 17, $to_cal_cd);
	}

	/**
	 * 出荷先カレンダＣＤ. Receiving point calendar cd..<p>
	 *
	 */
	public void to_cal_cd(String value) {
		setConstString(offset + 17, $to_cal_cd, value);
	}

	/**
	 * 出荷元カレンダＣＤ. Shipping point calendar cd..<p>
	 *
	 */
	public String fr_cal_cd() {
		return getConstString(offset + 18, $fr_cal_cd);
	}

	/**
	 * 出荷元カレンダＣＤ. Shipping point calendar cd..<p>
	 *
	 */
	public void fr_cal_cd(String value) {
		setConstString(offset + 18, $fr_cal_cd, value);
	}

	/**
	 * 最早出荷予定日. Scheduled earliest shipping date.<p>
	 *
	 */
	public MCDate est_ship_schd_dt() {
		return getConstDate(offset + 19, $est_ship_schd_dt);
	}

	/**
	 * 最早出荷予定日. Scheduled earliest shipping date.<p>
	 *
	 */
	public void est_ship_schd_dt(MCDate value) {
		setConstDate(offset + 19, $est_ship_schd_dt, value);
	}

	/**
	 * 出荷予定日時. Scheduled shipping date and time.<p>
	 *
	 */
	public MCDate ship_schd_tm() {
		return getConstDate(offset + 20, $ship_schd_tm);
	}

	/**
	 * 出荷予定日時. Scheduled shipping date and time.<p>
	 *
	 */
	public void ship_schd_tm(MCDate value) {
		setConstDate(offset + 20, $ship_schd_tm, value);
	}

	/**
	 * 納品予定日時. Scheduled delivery date and time.<p>
	 *
	 */
	public MCDate dlv_schd_tm() {
		return getConstDate(offset + 21, $dlv_schd_tm);
	}

	/**
	 * 納品予定日時. Scheduled delivery date and time.<p>
	 *
	 */
	public void dlv_schd_tm(MCDate value) {
		setConstDate(offset + 21, $dlv_schd_tm, value);
	}

	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 22, $peg_no);
	}

	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 22, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 22, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 22, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 22, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 22, $peg_no, value);
	}
	
	/**
	 * 出荷作業カレンダＣＤ. Shipping operation calendar cd..<p>
	 *
	 */
	public String ship_cal_cd() {
		return getConstString(offset + 23, $ship_cal_cd);
	}

	/**
	 * 出荷作業カレンダＣＤ. Shipping operation calendar cd..<p>
	 *
	 */
	public void ship_cal_cd(String value) {
		setConstString(offset + 23, $ship_cal_cd, value);
	}

	/**
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public MCNumber early_ship_dt_add_days() {
		return getConstNumber(offset + 24, $early_ship_dt_add_days);
	}

	/**
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public void early_ship_dt_add_days(MCNumber value) {
		setConstNumber(offset + 24, $early_ship_dt_add_days, value);
	}
	
	/**
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public void early_ship_dt_add_days(int value) {
		setConstNumber(offset + 24, $early_ship_dt_add_days, value);
	}
	
	/**
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public void early_ship_dt_add_days(long value) {
		setConstNumber(offset + 24, $early_ship_dt_add_days, value);
	}
	
	/**
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public void early_ship_dt_add_days(float value) {
		setConstNumber(offset + 24, $early_ship_dt_add_days, value);
	}
	
	/**
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public void early_ship_dt_add_days(double value) {
		setConstNumber(offset + 24, $early_ship_dt_add_days, value);
	}
	
	/**
	 * 出荷作業カレンダチェックＦＬＧ. Shipping operation calendar cd check flg..<p>
	 *
	 */
	public boolean ship_cal_cd_chk_flg() {
		return getConstBoolean(offset + 25, $ship_cal_cd_chk_flg);
	}

	/**
	 * 出荷作業カレンダチェックＦＬＧ. Shipping operation calendar cd check flg..<p>
	 *
	 */
	public void ship_cal_cd_chk_flg(boolean value) {
		setConstBoolean(offset + 25, $ship_cal_cd_chk_flg, value);
	}

	/**
	 * 最早出荷日加算日数チェックＦＬＧ. Number of days added to earliest shipping date check flg..<p>
	 *
	 */
	public boolean early_ship_dt_add_days_chk_flg() {
		return getConstBoolean(offset + 26, $early_ship_dt_add_days_chk_flg);
	}

	/**
	 * 最早出荷日加算日数チェックＦＬＧ. Number of days added to earliest shipping date check flg..<p>
	 *
	 */
	public void early_ship_dt_add_days_chk_flg(boolean value) {
		setConstBoolean(offset + 26, $early_ship_dt_add_days_chk_flg, value);
	}

	public String getString(String name) {
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_to_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($fin_cl_time.equalsIgnoreCase(name)) {
			return fin_cl_time();
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			return ship_wk_grp_cd();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($ship_schd_time.equalsIgnoreCase(name)) {
			return ship_schd_time();
		}
		if ($to_cal_cd.equalsIgnoreCase(name)) {
			return to_cal_cd();
		}
		if ($fr_cal_cd.equalsIgnoreCase(name)) {
			return fr_cal_cd();
		}
		if ($ship_cal_cd.equalsIgnoreCase(name)) {
			return ship_cal_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			return xfr_lt();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			return early_ship_dt_add_days();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			return ship_rqst_tm();
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		if ($est_ship_schd_dt.equalsIgnoreCase(name)) {
			return est_ship_schd_dt();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		return super.getDate(name);
	}

	public boolean getBoolean(String name) {
		if ($cl_time_chk_flg.equalsIgnoreCase(name)) {
			return cl_time_chk_flg();
		}
		if ($ship_dt_chk_flg.equalsIgnoreCase(name)) {
			return ship_dt_chk_flg();
		}
		if ($ship_cal_cd_chk_flg.equalsIgnoreCase(name)) {
			return ship_cal_cd_chk_flg();
		}
		if ($early_ship_dt_add_days_chk_flg.equalsIgnoreCase(name)) {
			return early_ship_dt_add_days_chk_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_to_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($fin_cl_time.equalsIgnoreCase(name)) {
			return fin_cl_time();
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			return ship_wk_grp_cd();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($ship_schd_time.equalsIgnoreCase(name)) {
			return ship_schd_time();
		}
		if ($to_cal_cd.equalsIgnoreCase(name)) {
			return to_cal_cd();
		}
		if ($fr_cal_cd.equalsIgnoreCase(name)) {
			return fr_cal_cd();
		}
		if ($ship_cal_cd.equalsIgnoreCase(name)) {
			return ship_cal_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			return xfr_lt();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			return early_ship_dt_add_days();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			return ship_rqst_tm();
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		if ($est_ship_schd_dt.equalsIgnoreCase(name)) {
			return est_ship_schd_dt();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		return super.getDateNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($cl_time_chk_flg.equalsIgnoreCase(name)) {
			return cl_time_chk_flg();
		}
		if ($ship_dt_chk_flg.equalsIgnoreCase(name)) {
			return ship_dt_chk_flg();
		}
		if ($ship_cal_cd_chk_flg.equalsIgnoreCase(name)) {
			return ship_cal_cd_chk_flg();
		}
		if ($early_ship_dt_add_days_chk_flg.equalsIgnoreCase(name)) {
			return early_ship_dt_add_days_chk_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_to_lg_grp_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			dlv_day_week_typ(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($fin_cl_time.equalsIgnoreCase(name)) {
			fin_cl_time(value);
			return;
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			ship_wk_grp_cd(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($ship_schd_time.equalsIgnoreCase(name)) {
			ship_schd_time(value);
			return;
		}
		if ($to_cal_cd.equalsIgnoreCase(name)) {
			to_cal_cd(value);
			return;
		}
		if ($fr_cal_cd.equalsIgnoreCase(name)) {
			fr_cal_cd(value);
			return;
		}
		if ($ship_cal_cd.equalsIgnoreCase(name)) {
			ship_cal_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			ship_rqst_tm(value);
			return;
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		if ($est_ship_schd_dt.equalsIgnoreCase(name)) {
			est_ship_schd_dt(value);
			return;
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($cl_time_chk_flg.equalsIgnoreCase(name)) {
			cl_time_chk_flg(value);
			return;
		}
		if ($ship_dt_chk_flg.equalsIgnoreCase(name)) {
			ship_dt_chk_flg(value);
			return;
		}
		if ($ship_cal_cd_chk_flg.equalsIgnoreCase(name)) {
			ship_cal_cd_chk_flg(value);
			return;
		}
		if ($early_ship_dt_add_days_chk_flg.equalsIgnoreCase(name)) {
			early_ship_dt_add_days_chk_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_to_lg_grp_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			dlv_day_week_typ(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($fin_cl_time.equalsIgnoreCase(name)) {
			fin_cl_time(value);
			return;
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			ship_wk_grp_cd(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($ship_schd_time.equalsIgnoreCase(name)) {
			ship_schd_time(value);
			return;
		}
		if ($to_cal_cd.equalsIgnoreCase(name)) {
			to_cal_cd(value);
			return;
		}
		if ($fr_cal_cd.equalsIgnoreCase(name)) {
			fr_cal_cd(value);
			return;
		}
		if ($ship_cal_cd.equalsIgnoreCase(name)) {
			ship_cal_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			ship_rqst_tm(value);
			return;
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		if ($est_ship_schd_dt.equalsIgnoreCase(name)) {
			est_ship_schd_dt(value);
			return;
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($cl_time_chk_flg.equalsIgnoreCase(name)) {
			cl_time_chk_flg(value);
			return;
		}
		if ($ship_dt_chk_flg.equalsIgnoreCase(name)) {
			ship_dt_chk_flg(value);
			return;
		}
		if ($ship_cal_cd_chk_flg.equalsIgnoreCase(name)) {
			ship_cal_cd_chk_flg(value);
			return;
		}
		if ($early_ship_dt_add_days_chk_flg.equalsIgnoreCase(name)) {
			early_ship_dt_add_days_chk_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
