package mcframe.serverMG.dbc;

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
 * "原価計算設定情報ワーク // Calculation setting info. work"DBコンテナRowクラスです。<p>
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
 *  	<td>calc_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>原価計算ＮＯ</td>
 *  	<td>Calculation No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>calc_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算グループＣＤ</td>
 *  	<td>Calculation group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>term</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>期</td>
 *  	<td>Term</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>st_ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>対象期間先頭年月</td>
 *  	<td>First month of the term</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>end_ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>対象期間末尾年月</td>
 *  	<td>Last month of the term</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sa_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>予実区分</td>
 *  	<td>Plan/Result type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>exp_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>展開計算区分</td>
 *  	<td>BOM explosion calculation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pre_alc_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>一次配賦計算区分</td>
 *  	<td>Departmental alloc. calculation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦率計算区分</td>
 *  	<td>Allocation rate calculation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cost_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>原価計算区分</td>
 *  	<td>Calculation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>eval_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額評価区分</td>
 *  	<td>Amount evaluation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_calc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入計算ＦＬＧ</td>
 *  	<td>Input calculation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wk_calc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工数計算ＦＬＧ</td>
 *  	<td>Man-hour calculation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prov_calc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支給計算ＦＬＧ</td>
 *  	<td>Supply calculation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xfr_calc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>移動計算ＦＬＧ</td>
 *  	<td>Movement calculation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xrate_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>為替レートＣＤ</td>
 *  	<td>Exchange rate cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>runtime_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実行時ワーキンググループＣＤ</td>
 *  	<td>Execution working group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>calc_st</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算開始時刻</td>
 *  	<td>Calculation start time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>calc_fin</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計算終了時刻</td>
 *  	<td>Calculation end time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>calc_cnt</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算回数</td>
 *  	<td>Calculation count</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>calc_exec_cnt</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算実行回数</td>
 *  	<td>Number of calculation execute</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_err_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>未配賦ＦＬＧ</td>
 *  	<td>Unallocated flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_amt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>振替差額ＦＬＧ</td>
 *  	<td>Transfer difference flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>adj_amt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受払差額ＦＬＧ</td>
 *  	<td>GR/GI difference flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>minus_stk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>マイナス在庫ＦＬＧ</td>
 *  	<td>Negative inventory flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>other_chk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>任意チェックＦＬＧ</td>
 *  	<td>Optional check flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_limit_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目指定ＦＬＧ</td>
 *  	<td>Item specification flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>data_check_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>データ確認ＦＬＧ</td>
 *  	<td>Data check flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>carry_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>繰越ＦＬＧ</td>
 *  	<td>Carry-over flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>non_del_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>削除不可ＦＬＧ</td>
 *  	<td>Undeletable flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>確定ＦＬＧ</td>
 *  	<td>Firm flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rate_fix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦率確定ＦＬＧ</td>
 *  	<td>Firm Allocation rate flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>calc_err_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>エラーＦＬＧ</td>
 *  	<td>Error flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ins_srv_req_no</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録リクエストＮＯ</td>
 *  	<td>Entry request No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>batch_log_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>バッチログＮＯ</td>
 *  	<td>Batch log No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>備考</td>
 *  	<td>Remarks</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGW_ARG_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MGW_ARG";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public static final String $calc_no = "calc_no";
	private static final MCPermColumnInfo _calc_no = createColumnInfo("calc_no");
	public final MCStringPermColumn calc_no = createStringColumn(_calc_no);
	
	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	private static final MCPermColumnInfo _calc_grp_cd = createColumnInfo("calc_grp_cd");
	public final MCStringPermColumn calc_grp_cd = createStringColumn(_calc_grp_cd);
	
	/**
	 * 期. Term.<p>
	 *
	 */
	public static final String $term = "term";
	private static final MCPermColumnInfo _term = createColumnInfo("term");
	public final MCDatePermColumn term = createDateColumn(_term);
	
	/**
	 * 対象期間先頭年月. First month of the term.<p>
	 *
	 */
	public static final String $st_ym = "st_ym";
	private static final MCPermColumnInfo _st_ym = createColumnInfo("st_ym");
	public final MCDatePermColumn st_ym = createDateColumn(_st_ym);
	
	/**
	 * 対象期間末尾年月. Last month of the term.<p>
	 *
	 */
	public static final String $end_ym = "end_ym";
	private static final MCPermColumnInfo _end_ym = createColumnInfo("end_ym");
	public final MCDatePermColumn end_ym = createDateColumn(_end_ym);
	
	/**
	 * 予実区分. Plan/Result type.<p>
	 *
	 */
	public static final String $sa_typ = "sa_typ";
	private static final MCPermColumnInfo _sa_typ = createColumnInfo("sa_typ");
	public final MCStringPermColumn sa_typ = createStringColumn(_sa_typ);
	
	/**
	 * 展開計算区分. BOM explosion calculation type.<p>
	 *
	 */
	public static final String $exp_calc_typ = "exp_calc_typ";
	private static final MCPermColumnInfo _exp_calc_typ = createColumnInfo("exp_calc_typ");
	public final MCStringPermColumn exp_calc_typ = createStringColumn(_exp_calc_typ);
	
	/**
	 * 一次配賦計算区分. Departmental alloc. calculation type.<p>
	 *
	 */
	public static final String $pre_alc_calc_typ = "pre_alc_calc_typ";
	private static final MCPermColumnInfo _pre_alc_calc_typ = createColumnInfo("pre_alc_calc_typ");
	public final MCStringPermColumn pre_alc_calc_typ = createStringColumn(_pre_alc_calc_typ);
	
	/**
	 * 配賦率計算区分. Allocation rate calculation type.<p>
	 *
	 */
	public static final String $alc_calc_typ = "alc_calc_typ";
	private static final MCPermColumnInfo _alc_calc_typ = createColumnInfo("alc_calc_typ");
	public final MCStringPermColumn alc_calc_typ = createStringColumn(_alc_calc_typ);
	
	/**
	 * 原価計算区分. Calculation type.<p>
	 *
	 */
	public static final String $cost_calc_typ = "cost_calc_typ";
	private static final MCPermColumnInfo _cost_calc_typ = createColumnInfo("cost_calc_typ");
	public final MCStringPermColumn cost_calc_typ = createStringColumn(_cost_calc_typ);
	
	/**
	 * 金額評価区分. Amount evaluation type.<p>
	 *
	 */
	public static final String $eval_typ = "eval_typ";
	private static final MCPermColumnInfo _eval_typ = createColumnInfo("eval_typ");
	public final MCStringPermColumn eval_typ = createStringColumn(_eval_typ);
	
	/**
	 * 投入計算ＦＬＧ. Input calculation flg..<p>
	 *
	 */
	public static final String $inpt_calc_flg = "inpt_calc_flg";
	private static final MCPermColumnInfo _inpt_calc_flg = createColumnInfo("inpt_calc_flg");
	public final MCBooleanPermColumn inpt_calc_flg = createBooleanColumn(_inpt_calc_flg);
	
	/**
	 * 工数計算ＦＬＧ. Man-hour calculation flg..<p>
	 *
	 */
	public static final String $wk_calc_flg = "wk_calc_flg";
	private static final MCPermColumnInfo _wk_calc_flg = createColumnInfo("wk_calc_flg");
	public final MCBooleanPermColumn wk_calc_flg = createBooleanColumn(_wk_calc_flg);
	
	/**
	 * 支給計算ＦＬＧ. Supply calculation flg..<p>
	 *
	 */
	public static final String $prov_calc_flg = "prov_calc_flg";
	private static final MCPermColumnInfo _prov_calc_flg = createColumnInfo("prov_calc_flg");
	public final MCBooleanPermColumn prov_calc_flg = createBooleanColumn(_prov_calc_flg);
	
	/**
	 * 移動計算ＦＬＧ. Movement calculation flg..<p>
	 *
	 */
	public static final String $xfr_calc_flg = "xfr_calc_flg";
	private static final MCPermColumnInfo _xfr_calc_flg = createColumnInfo("xfr_calc_flg");
	public final MCBooleanPermColumn xfr_calc_flg = createBooleanColumn(_xfr_calc_flg);
	
	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	private static final MCPermColumnInfo _xrate_cd = createColumnInfo("xrate_cd");
	public final MCStringPermColumn xrate_cd = createStringColumn(_xrate_cd);
	
	/**
	 * 実行時ワーキンググループＣＤ. Execution working group cd..<p>
	 *
	 */
	public static final String $runtime_wg_cd = "runtime_wg_cd";
	private static final MCPermColumnInfo _runtime_wg_cd = createColumnInfo("runtime_wg_cd");
	public final MCStringPermColumn runtime_wg_cd = createStringColumn(_runtime_wg_cd);
	
	/**
	 * 計算開始時刻. Calculation start time.<p>
	 *
	 */
	public static final String $calc_st = "calc_st";
	private static final MCPermColumnInfo _calc_st = createColumnInfo("calc_st");
	public final MCDatePermColumn calc_st = createDateColumn(_calc_st);
	
	/**
	 * 計算終了時刻. Calculation end time.<p>
	 *
	 */
	public static final String $calc_fin = "calc_fin";
	private static final MCPermColumnInfo _calc_fin = createColumnInfo("calc_fin");
	public final MCDatePermColumn calc_fin = createDateColumn(_calc_fin);
	
	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public static final String $calc_cnt = "calc_cnt";
	private static final MCPermColumnInfo _calc_cnt = createColumnInfo("calc_cnt");
	public final MCNumberPermColumn calc_cnt = createNumberColumn(_calc_cnt);
	
	/**
	 * 計算実行回数. Number of calculation execute.<p>
	 *
	 */
	public static final String $calc_exec_cnt = "calc_exec_cnt";
	private static final MCPermColumnInfo _calc_exec_cnt = createColumnInfo("calc_exec_cnt");
	public final MCNumberPermColumn calc_exec_cnt = createNumberColumn(_calc_exec_cnt);
	
	/**
	 * 未配賦ＦＬＧ. Unallocated flg..<p>
	 *
	 */
	public static final String $alc_err_flg = "alc_err_flg";
	private static final MCPermColumnInfo _alc_err_flg = createColumnInfo("alc_err_flg");
	public final MCBooleanPermColumn alc_err_flg = createBooleanColumn(_alc_err_flg);
	
	/**
	 * 振替差額ＦＬＧ. Transfer difference flg..<p>
	 *
	 */
	public static final String $trd_amt_flg = "trd_amt_flg";
	private static final MCPermColumnInfo _trd_amt_flg = createColumnInfo("trd_amt_flg");
	public final MCBooleanPermColumn trd_amt_flg = createBooleanColumn(_trd_amt_flg);
	
	/**
	 * 受払差額ＦＬＧ. GR/GI difference flg..<p>
	 *
	 */
	public static final String $adj_amt_flg = "adj_amt_flg";
	private static final MCPermColumnInfo _adj_amt_flg = createColumnInfo("adj_amt_flg");
	public final MCBooleanPermColumn adj_amt_flg = createBooleanColumn(_adj_amt_flg);
	
	/**
	 * マイナス在庫ＦＬＧ. Negative inventory flg..<p>
	 *
	 */
	public static final String $minus_stk_flg = "minus_stk_flg";
	private static final MCPermColumnInfo _minus_stk_flg = createColumnInfo("minus_stk_flg");
	public final MCBooleanPermColumn minus_stk_flg = createBooleanColumn(_minus_stk_flg);
	
	/**
	 * 任意チェックＦＬＧ. Optional check flg..<p>
	 *
	 */
	public static final String $other_chk_flg = "other_chk_flg";
	private static final MCPermColumnInfo _other_chk_flg = createColumnInfo("other_chk_flg");
	public final MCBooleanPermColumn other_chk_flg = createBooleanColumn(_other_chk_flg);
	
	/**
	 * 品目指定ＦＬＧ. Item specification flg..<p>
	 *
	 */
	public static final String $itm_limit_flg = "itm_limit_flg";
	private static final MCPermColumnInfo _itm_limit_flg = createColumnInfo("itm_limit_flg");
	public final MCBooleanPermColumn itm_limit_flg = createBooleanColumn(_itm_limit_flg);
	
	/**
	 * データ確認ＦＬＧ. Data check flg..<p>
	 *
	 */
	public static final String $data_check_flg = "data_check_flg";
	private static final MCPermColumnInfo _data_check_flg = createColumnInfo("data_check_flg");
	public final MCBooleanPermColumn data_check_flg = createBooleanColumn(_data_check_flg);
	
	/**
	 * 繰越ＦＬＧ. Carry-over flg..<p>
	 *
	 */
	public static final String $carry_flg = "carry_flg";
	private static final MCPermColumnInfo _carry_flg = createColumnInfo("carry_flg");
	public final MCBooleanPermColumn carry_flg = createBooleanColumn(_carry_flg);
	
	/**
	 * 削除不可ＦＬＧ. Undeletable flg..<p>
	 *
	 */
	public static final String $non_del_flg = "non_del_flg";
	private static final MCPermColumnInfo _non_del_flg = createColumnInfo("non_del_flg");
	public final MCBooleanPermColumn non_del_flg = createBooleanColumn(_non_del_flg);
	
	/**
	 * 確定ＦＬＧ. Firm flg..<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	private static final MCPermColumnInfo _fix_flg = createColumnInfo("fix_flg");
	public final MCBooleanPermColumn fix_flg = createBooleanColumn(_fix_flg);
	
	/**
	 * 配賦率確定ＦＬＧ. Firm Allocation rate flg..<p>
	 *
	 */
	public static final String $rate_fix_flg = "rate_fix_flg";
	private static final MCPermColumnInfo _rate_fix_flg = createColumnInfo("rate_fix_flg");
	public final MCBooleanPermColumn rate_fix_flg = createBooleanColumn(_rate_fix_flg);
	
	/**
	 * エラーＦＬＧ. Error flg..<p>
	 *
	 */
	public static final String $calc_err_flg = "calc_err_flg";
	private static final MCPermColumnInfo _calc_err_flg = createColumnInfo("calc_err_flg");
	public final MCBooleanPermColumn calc_err_flg = createBooleanColumn(_calc_err_flg);
	
	/**
	 * 登録リクエストＮＯ. Entry request No..<p>
	 *
	 */
	public static final String $ins_srv_req_no = "ins_srv_req_no";
	private static final MCPermColumnInfo _ins_srv_req_no = createColumnInfo("ins_srv_req_no");
	public final MCStringPermColumn ins_srv_req_no = createStringColumn(_ins_srv_req_no);
	
	/**
	 * バッチログＮＯ. Batch log No..<p>
	 *
	 */
	public static final String $batch_log_no = "batch_log_no";
	private static final MCPermColumnInfo _batch_log_no = createColumnInfo("batch_log_no");
	public final MCStringPermColumn batch_log_no = createStringColumn(_batch_log_no);
	
	/**
	 * 備考. Remarks.<p>
	 *
	 */
	public static final String $rmrks = "rmrks";
	private static final MCPermColumnInfo _rmrks = createColumnInfo("rmrks");
	public final MCStringPermColumn rmrks = createStringColumn(_rmrks);
	
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
	
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta st_ym_META = createCommonMeta($st_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta end_ym_META = createCommonMeta($end_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta sa_typ_META = createCommonMeta($sa_typ, mcframe.commonMA.meta.MA_META.SA_TYP);
	public static final MCMeta exp_calc_typ_META = createCommonMeta($exp_calc_typ, mcframe.commonMA.meta.MA_META.EXP_CALC_TYP);
	public static final MCMeta pre_alc_calc_typ_META = createCommonMeta($pre_alc_calc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_CALC_TYP);
	public static final MCMeta alc_calc_typ_META = createCommonMeta($alc_calc_typ, mcframe.commonMA.meta.MA_META.ALC_CALC_TYP);
	public static final MCMeta cost_calc_typ_META = createCommonMeta($cost_calc_typ, mcframe.commonMA.meta.MA_META.COST_CALC_TYP);
	public static final MCMeta eval_typ_META = createCommonMeta($eval_typ, mcframe.commonMA.meta.MA_META.EVAL_TYP);
	public static final MCMeta inpt_calc_flg_META = createCommonMeta($inpt_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_calc_flg_META = createCommonMeta($wk_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_calc_flg_META = createCommonMeta($prov_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_calc_flg_META = createCommonMeta($xfr_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta runtime_wg_cd_META = createCommonMeta($runtime_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta calc_st_META = createCommonMeta($calc_st, mcframe.commonMA.meta.MA_META.YMDHMS);
	public static final MCMeta calc_fin_META = createCommonMeta($calc_fin, mcframe.commonMA.meta.MA_META.YMDHMS);
	public static final MCMeta calc_cnt_META = createCommonMeta($calc_cnt, mcframe.commonMG.meta.MG_META.CALC_CNT);
	public static final MCMeta calc_exec_cnt_META = createCommonMeta($calc_exec_cnt, mcframe.commonMG.meta.MG_META.CALC_CNT);
	public static final MCMeta alc_err_flg_META = createCommonMeta($alc_err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_amt_flg_META = createCommonMeta($trd_amt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta adj_amt_flg_META = createCommonMeta($adj_amt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta minus_stk_flg_META = createCommonMeta($minus_stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta other_chk_flg_META = createCommonMeta($other_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_limit_flg_META = createCommonMeta($itm_limit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_check_flg_META = createCommonMeta($data_check_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta carry_flg_META = createCommonMeta($carry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_del_flg_META = createCommonMeta($non_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rate_fix_flg_META = createCommonMeta($rate_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_err_flg_META = createCommonMeta($calc_err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ins_srv_req_no_META = createCommonMeta($ins_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta batch_log_no_META = createCommonMeta($batch_log_no, mcframe.commonMA.meta.MA_META.BATCH_LOG_NO);
	public static final MCMeta rmrks_META = createCommonMeta($rmrks, mcframe.commonMG.meta.MG_META.CALC_ARG_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMG.meta.MG_META.CALC_ARG_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMG.meta.MG_META.CALC_ARG_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMG.meta.MG_META.CALC_ARG_SUB_CHAR3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGW_ARG_R> constMetas = new ConstMetaList<MGW_ARG_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			calc_no_META,
			calc_grp_cd_META,
			term_META,
			st_ym_META,
			end_ym_META,
			sa_typ_META,
			exp_calc_typ_META,
			pre_alc_calc_typ_META,
			alc_calc_typ_META,
			cost_calc_typ_META,
			eval_typ_META,
			inpt_calc_flg_META,
			wk_calc_flg_META,
			prov_calc_flg_META,
			xfr_calc_flg_META,
			xrate_cd_META,
			runtime_wg_cd_META,
			calc_st_META,
			calc_fin_META,
			calc_cnt_META,
			calc_exec_cnt_META,
			alc_err_flg_META,
			trd_amt_flg_META,
			adj_amt_flg_META,
			minus_stk_flg_META,
			other_chk_flg_META,
			itm_limit_flg_META,
			data_check_flg_META,
			carry_flg_META,
			non_del_flg_META,
			fix_flg_META,
			rate_fix_flg_META,
			calc_err_flg_META,
			ins_srv_req_no_META,
			batch_log_no_META,
			rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META
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
	protected MGW_ARG_R(ConstMetaList<? extends MGW_ARG_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGW_ARG_R(ConstMetaList<? extends MGW_ARG_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGW_ARG_R.$calc_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ARG_R.$calc_no,
				"calc_no",
				calc_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$calc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ARG_R.$calc_grp_cd,
				"calc_grp_cd",
				calc_grp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$term,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGW_ARG_R.$term,
				"term",
				term,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$st_ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGW_ARG_R.$st_ym,
				"st_ym",
				st_ym,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$end_ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGW_ARG_R.$end_ym,
				"end_ym",
				end_ym,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$sa_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ARG_R.$sa_typ,
				"sa_typ",
				sa_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$exp_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ARG_R.$exp_calc_typ,
				"exp_calc_typ",
				exp_calc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$pre_alc_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ARG_R.$pre_alc_calc_typ,
				"pre_alc_calc_typ",
				pre_alc_calc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$alc_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ARG_R.$alc_calc_typ,
				"alc_calc_typ",
				alc_calc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$cost_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ARG_R.$cost_calc_typ,
				"cost_calc_typ",
				cost_calc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$eval_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ARG_R.$eval_typ,
				"eval_typ",
				eval_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$inpt_calc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_ARG_R.$inpt_calc_flg,
				"inpt_calc_flg",
				inpt_calc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$wk_calc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_ARG_R.$wk_calc_flg,
				"wk_calc_flg",
				wk_calc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$prov_calc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_ARG_R.$prov_calc_flg,
				"prov_calc_flg",
				prov_calc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$xfr_calc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_ARG_R.$xfr_calc_flg,
				"xfr_calc_flg",
				xfr_calc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$xrate_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ARG_R.$xrate_cd,
				"xrate_cd",
				xrate_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$runtime_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ARG_R.$runtime_wg_cd,
				"runtime_wg_cd",
				runtime_wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$calc_st,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGW_ARG_R.$calc_st,
				"calc_st",
				calc_st,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$calc_fin,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGW_ARG_R.$calc_fin,
				"calc_fin",
				calc_fin,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$calc_cnt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_ARG_R.$calc_cnt,
				"calc_cnt",
				calc_cnt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$calc_exec_cnt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_ARG_R.$calc_exec_cnt,
				"calc_exec_cnt",
				calc_exec_cnt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$alc_err_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_ARG_R.$alc_err_flg,
				"alc_err_flg",
				alc_err_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$trd_amt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_ARG_R.$trd_amt_flg,
				"trd_amt_flg",
				trd_amt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$adj_amt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_ARG_R.$adj_amt_flg,
				"adj_amt_flg",
				adj_amt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$minus_stk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_ARG_R.$minus_stk_flg,
				"minus_stk_flg",
				minus_stk_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$other_chk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_ARG_R.$other_chk_flg,
				"other_chk_flg",
				other_chk_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$itm_limit_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_ARG_R.$itm_limit_flg,
				"itm_limit_flg",
				itm_limit_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$data_check_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_ARG_R.$data_check_flg,
				"data_check_flg",
				data_check_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$carry_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_ARG_R.$carry_flg,
				"carry_flg",
				carry_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$non_del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_ARG_R.$non_del_flg,
				"non_del_flg",
				non_del_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$fix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_ARG_R.$fix_flg,
				"fix_flg",
				fix_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$rate_fix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_ARG_R.$rate_fix_flg,
				"rate_fix_flg",
				rate_fix_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$calc_err_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_ARG_R.$calc_err_flg,
				"calc_err_flg",
				calc_err_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$ins_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ARG_R.$ins_srv_req_no,
				"ins_srv_req_no",
				ins_srv_req_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$batch_log_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ARG_R.$batch_log_no,
				"batch_log_no",
				batch_log_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ARG_R.$rmrks,
				"rmrks",
				rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ARG_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ARG_R.$sub_char1,
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
			MGW_ARG_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ARG_R.$sub_char2,
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
			MGW_ARG_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ARG_R.$sub_char3,
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
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGW_ARG_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGW_ARG_R create(String alias) {
		MGW_ARG_R row = new MGW_ARG_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGW_ARG_R createByName(T proto) {
		MGW_ARG_R row = MGW_ARG_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ARG_R clone() {
		return (MGW_ARG_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ARG_R createInstance() {
		return (MGW_ARG_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ARG_R getValues(String... names) {
		return (MGW_ARG_R) super.getValues(names);
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
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 0, $calc_no);
	}

	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 0, $calc_no, value);
	}

	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 1, $calc_grp_cd);
	}

	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 1, $calc_grp_cd, value);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 2, $term);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 2, $term, value);
	}

	/**
	 * 対象期間先頭年月. First month of the term.<p>
	 *
	 */
	public MCDate st_ym() {
		return getConstDate(offset + 3, $st_ym);
	}

	/**
	 * 対象期間先頭年月. First month of the term.<p>
	 *
	 */
	public void st_ym(MCDate value) {
		setConstDate(offset + 3, $st_ym, value);
	}

	/**
	 * 対象期間末尾年月. Last month of the term.<p>
	 *
	 */
	public MCDate end_ym() {
		return getConstDate(offset + 4, $end_ym);
	}

	/**
	 * 対象期間末尾年月. Last month of the term.<p>
	 *
	 */
	public void end_ym(MCDate value) {
		setConstDate(offset + 4, $end_ym, value);
	}

	/**
	 * 予実区分. Plan/Result type.<p>
	 *
	 */
	public String sa_typ() {
		return getConstString(offset + 5, $sa_typ);
	}

	/**
	 * 予実区分. Plan/Result type.<p>
	 *
	 */
	public void sa_typ(String value) {
		setConstString(offset + 5, $sa_typ, value);
	}

	/**
	 * 展開計算区分. BOM explosion calculation type.<p>
	 *
	 */
	public String exp_calc_typ() {
		return getConstString(offset + 6, $exp_calc_typ);
	}

	/**
	 * 展開計算区分. BOM explosion calculation type.<p>
	 *
	 */
	public void exp_calc_typ(String value) {
		setConstString(offset + 6, $exp_calc_typ, value);
	}

	/**
	 * 一次配賦計算区分. Departmental alloc. calculation type.<p>
	 *
	 */
	public String pre_alc_calc_typ() {
		return getConstString(offset + 7, $pre_alc_calc_typ);
	}

	/**
	 * 一次配賦計算区分. Departmental alloc. calculation type.<p>
	 *
	 */
	public void pre_alc_calc_typ(String value) {
		setConstString(offset + 7, $pre_alc_calc_typ, value);
	}

	/**
	 * 配賦率計算区分. Allocation rate calculation type.<p>
	 *
	 */
	public String alc_calc_typ() {
		return getConstString(offset + 8, $alc_calc_typ);
	}

	/**
	 * 配賦率計算区分. Allocation rate calculation type.<p>
	 *
	 */
	public void alc_calc_typ(String value) {
		setConstString(offset + 8, $alc_calc_typ, value);
	}

	/**
	 * 原価計算区分. Calculation type.<p>
	 *
	 */
	public String cost_calc_typ() {
		return getConstString(offset + 9, $cost_calc_typ);
	}

	/**
	 * 原価計算区分. Calculation type.<p>
	 *
	 */
	public void cost_calc_typ(String value) {
		setConstString(offset + 9, $cost_calc_typ, value);
	}

	/**
	 * 金額評価区分. Amount evaluation type.<p>
	 *
	 */
	public String eval_typ() {
		return getConstString(offset + 10, $eval_typ);
	}

	/**
	 * 金額評価区分. Amount evaluation type.<p>
	 *
	 */
	public void eval_typ(String value) {
		setConstString(offset + 10, $eval_typ, value);
	}

	/**
	 * 投入計算ＦＬＧ. Input calculation flg..<p>
	 *
	 */
	public boolean inpt_calc_flg() {
		return getConstBoolean(offset + 11, $inpt_calc_flg);
	}

	/**
	 * 投入計算ＦＬＧ. Input calculation flg..<p>
	 *
	 */
	public void inpt_calc_flg(boolean value) {
		setConstBoolean(offset + 11, $inpt_calc_flg, value);
	}

	/**
	 * 工数計算ＦＬＧ. Man-hour calculation flg..<p>
	 *
	 */
	public boolean wk_calc_flg() {
		return getConstBoolean(offset + 12, $wk_calc_flg);
	}

	/**
	 * 工数計算ＦＬＧ. Man-hour calculation flg..<p>
	 *
	 */
	public void wk_calc_flg(boolean value) {
		setConstBoolean(offset + 12, $wk_calc_flg, value);
	}

	/**
	 * 支給計算ＦＬＧ. Supply calculation flg..<p>
	 *
	 */
	public boolean prov_calc_flg() {
		return getConstBoolean(offset + 13, $prov_calc_flg);
	}

	/**
	 * 支給計算ＦＬＧ. Supply calculation flg..<p>
	 *
	 */
	public void prov_calc_flg(boolean value) {
		setConstBoolean(offset + 13, $prov_calc_flg, value);
	}

	/**
	 * 移動計算ＦＬＧ. Movement calculation flg..<p>
	 *
	 */
	public boolean xfr_calc_flg() {
		return getConstBoolean(offset + 14, $xfr_calc_flg);
	}

	/**
	 * 移動計算ＦＬＧ. Movement calculation flg..<p>
	 *
	 */
	public void xfr_calc_flg(boolean value) {
		setConstBoolean(offset + 14, $xfr_calc_flg, value);
	}

	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 15, $xrate_cd);
	}

	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 15, $xrate_cd, value);
	}

	/**
	 * 実行時ワーキンググループＣＤ. Execution working group cd..<p>
	 *
	 */
	public String runtime_wg_cd() {
		return getConstString(offset + 16, $runtime_wg_cd);
	}

	/**
	 * 実行時ワーキンググループＣＤ. Execution working group cd..<p>
	 *
	 */
	public void runtime_wg_cd(String value) {
		setConstString(offset + 16, $runtime_wg_cd, value);
	}

	/**
	 * 計算開始時刻. Calculation start time.<p>
	 *
	 */
	public MCDate calc_st() {
		return getConstDate(offset + 17, $calc_st);
	}

	/**
	 * 計算開始時刻. Calculation start time.<p>
	 *
	 */
	public void calc_st(MCDate value) {
		setConstDate(offset + 17, $calc_st, value);
	}

	/**
	 * 計算終了時刻. Calculation end time.<p>
	 *
	 */
	public MCDate calc_fin() {
		return getConstDate(offset + 18, $calc_fin);
	}

	/**
	 * 計算終了時刻. Calculation end time.<p>
	 *
	 */
	public void calc_fin(MCDate value) {
		setConstDate(offset + 18, $calc_fin, value);
	}

	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public MCNumber calc_cnt() {
		return getConstNumber(offset + 19, $calc_cnt);
	}

	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public void calc_cnt(MCNumber value) {
		setConstNumber(offset + 19, $calc_cnt, value);
	}
	
	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public void calc_cnt(int value) {
		setConstNumber(offset + 19, $calc_cnt, value);
	}
	
	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public void calc_cnt(long value) {
		setConstNumber(offset + 19, $calc_cnt, value);
	}
	
	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public void calc_cnt(float value) {
		setConstNumber(offset + 19, $calc_cnt, value);
	}
	
	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public void calc_cnt(double value) {
		setConstNumber(offset + 19, $calc_cnt, value);
	}
	
	/**
	 * 計算実行回数. Number of calculation execute.<p>
	 *
	 */
	public MCNumber calc_exec_cnt() {
		return getConstNumber(offset + 20, $calc_exec_cnt);
	}

	/**
	 * 計算実行回数. Number of calculation execute.<p>
	 *
	 */
	public void calc_exec_cnt(MCNumber value) {
		setConstNumber(offset + 20, $calc_exec_cnt, value);
	}
	
	/**
	 * 計算実行回数. Number of calculation execute.<p>
	 *
	 */
	public void calc_exec_cnt(int value) {
		setConstNumber(offset + 20, $calc_exec_cnt, value);
	}
	
	/**
	 * 計算実行回数. Number of calculation execute.<p>
	 *
	 */
	public void calc_exec_cnt(long value) {
		setConstNumber(offset + 20, $calc_exec_cnt, value);
	}
	
	/**
	 * 計算実行回数. Number of calculation execute.<p>
	 *
	 */
	public void calc_exec_cnt(float value) {
		setConstNumber(offset + 20, $calc_exec_cnt, value);
	}
	
	/**
	 * 計算実行回数. Number of calculation execute.<p>
	 *
	 */
	public void calc_exec_cnt(double value) {
		setConstNumber(offset + 20, $calc_exec_cnt, value);
	}
	
	/**
	 * 未配賦ＦＬＧ. Unallocated flg..<p>
	 *
	 */
	public boolean alc_err_flg() {
		return getConstBoolean(offset + 21, $alc_err_flg);
	}

	/**
	 * 未配賦ＦＬＧ. Unallocated flg..<p>
	 *
	 */
	public void alc_err_flg(boolean value) {
		setConstBoolean(offset + 21, $alc_err_flg, value);
	}

	/**
	 * 振替差額ＦＬＧ. Transfer difference flg..<p>
	 *
	 */
	public boolean trd_amt_flg() {
		return getConstBoolean(offset + 22, $trd_amt_flg);
	}

	/**
	 * 振替差額ＦＬＧ. Transfer difference flg..<p>
	 *
	 */
	public void trd_amt_flg(boolean value) {
		setConstBoolean(offset + 22, $trd_amt_flg, value);
	}

	/**
	 * 受払差額ＦＬＧ. GR/GI difference flg..<p>
	 *
	 */
	public boolean adj_amt_flg() {
		return getConstBoolean(offset + 23, $adj_amt_flg);
	}

	/**
	 * 受払差額ＦＬＧ. GR/GI difference flg..<p>
	 *
	 */
	public void adj_amt_flg(boolean value) {
		setConstBoolean(offset + 23, $adj_amt_flg, value);
	}

	/**
	 * マイナス在庫ＦＬＧ. Negative inventory flg..<p>
	 *
	 */
	public boolean minus_stk_flg() {
		return getConstBoolean(offset + 24, $minus_stk_flg);
	}

	/**
	 * マイナス在庫ＦＬＧ. Negative inventory flg..<p>
	 *
	 */
	public void minus_stk_flg(boolean value) {
		setConstBoolean(offset + 24, $minus_stk_flg, value);
	}

	/**
	 * 任意チェックＦＬＧ. Optional check flg..<p>
	 *
	 */
	public boolean other_chk_flg() {
		return getConstBoolean(offset + 25, $other_chk_flg);
	}

	/**
	 * 任意チェックＦＬＧ. Optional check flg..<p>
	 *
	 */
	public void other_chk_flg(boolean value) {
		setConstBoolean(offset + 25, $other_chk_flg, value);
	}

	/**
	 * 品目指定ＦＬＧ. Item specification flg..<p>
	 *
	 */
	public boolean itm_limit_flg() {
		return getConstBoolean(offset + 26, $itm_limit_flg);
	}

	/**
	 * 品目指定ＦＬＧ. Item specification flg..<p>
	 *
	 */
	public void itm_limit_flg(boolean value) {
		setConstBoolean(offset + 26, $itm_limit_flg, value);
	}

	/**
	 * データ確認ＦＬＧ. Data check flg..<p>
	 *
	 */
	public boolean data_check_flg() {
		return getConstBoolean(offset + 27, $data_check_flg);
	}

	/**
	 * データ確認ＦＬＧ. Data check flg..<p>
	 *
	 */
	public void data_check_flg(boolean value) {
		setConstBoolean(offset + 27, $data_check_flg, value);
	}

	/**
	 * 繰越ＦＬＧ. Carry-over flg..<p>
	 *
	 */
	public boolean carry_flg() {
		return getConstBoolean(offset + 28, $carry_flg);
	}

	/**
	 * 繰越ＦＬＧ. Carry-over flg..<p>
	 *
	 */
	public void carry_flg(boolean value) {
		setConstBoolean(offset + 28, $carry_flg, value);
	}

	/**
	 * 削除不可ＦＬＧ. Undeletable flg..<p>
	 *
	 */
	public boolean non_del_flg() {
		return getConstBoolean(offset + 29, $non_del_flg);
	}

	/**
	 * 削除不可ＦＬＧ. Undeletable flg..<p>
	 *
	 */
	public void non_del_flg(boolean value) {
		setConstBoolean(offset + 29, $non_del_flg, value);
	}

	/**
	 * 確定ＦＬＧ. Firm flg..<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 30, $fix_flg);
	}

	/**
	 * 確定ＦＬＧ. Firm flg..<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 30, $fix_flg, value);
	}

	/**
	 * 配賦率確定ＦＬＧ. Firm Allocation rate flg..<p>
	 *
	 */
	public boolean rate_fix_flg() {
		return getConstBoolean(offset + 31, $rate_fix_flg);
	}

	/**
	 * 配賦率確定ＦＬＧ. Firm Allocation rate flg..<p>
	 *
	 */
	public void rate_fix_flg(boolean value) {
		setConstBoolean(offset + 31, $rate_fix_flg, value);
	}

	/**
	 * エラーＦＬＧ. Error flg..<p>
	 *
	 */
	public boolean calc_err_flg() {
		return getConstBoolean(offset + 32, $calc_err_flg);
	}

	/**
	 * エラーＦＬＧ. Error flg..<p>
	 *
	 */
	public void calc_err_flg(boolean value) {
		setConstBoolean(offset + 32, $calc_err_flg, value);
	}

	/**
	 * 登録リクエストＮＯ. Entry request No..<p>
	 *
	 */
	public String ins_srv_req_no() {
		return getConstString(offset + 33, $ins_srv_req_no);
	}

	/**
	 * 登録リクエストＮＯ. Entry request No..<p>
	 *
	 */
	public void ins_srv_req_no(String value) {
		setConstString(offset + 33, $ins_srv_req_no, value);
	}

	/**
	 * バッチログＮＯ. Batch log No..<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 34, $batch_log_no);
	}

	/**
	 * バッチログＮＯ. Batch log No..<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 34, $batch_log_no, value);
	}

	/**
	 * 備考. Remarks.<p>
	 *
	 */
	public String rmrks() {
		return getConstString(offset + 35, $rmrks);
	}

	/**
	 * 備考. Remarks.<p>
	 *
	 */
	public void rmrks(String value) {
		setConstString(offset + 35, $rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 36, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 36, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 37, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 37, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 38, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 38, $sub_char3, value);
	}

	public String getString(String name) {
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($sa_typ.equalsIgnoreCase(name)) {
			return sa_typ();
		}
		if ($exp_calc_typ.equalsIgnoreCase(name)) {
			return exp_calc_typ();
		}
		if ($pre_alc_calc_typ.equalsIgnoreCase(name)) {
			return pre_alc_calc_typ();
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			return alc_calc_typ();
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			return cost_calc_typ();
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			return eval_typ();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($runtime_wg_cd.equalsIgnoreCase(name)) {
			return runtime_wg_cd();
		}
		if ($ins_srv_req_no.equalsIgnoreCase(name)) {
			return ins_srv_req_no();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
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
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($calc_cnt.equalsIgnoreCase(name)) {
			return calc_cnt();
		}
		if ($calc_exec_cnt.equalsIgnoreCase(name)) {
			return calc_exec_cnt();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		if ($st_ym.equalsIgnoreCase(name)) {
			return st_ym();
		}
		if ($end_ym.equalsIgnoreCase(name)) {
			return end_ym();
		}
		if ($calc_st.equalsIgnoreCase(name)) {
			return calc_st();
		}
		if ($calc_fin.equalsIgnoreCase(name)) {
			return calc_fin();
		}
		return super.getDate(name);
	}

	public boolean getBoolean(String name) {
		if ($inpt_calc_flg.equalsIgnoreCase(name)) {
			return inpt_calc_flg();
		}
		if ($wk_calc_flg.equalsIgnoreCase(name)) {
			return wk_calc_flg();
		}
		if ($prov_calc_flg.equalsIgnoreCase(name)) {
			return prov_calc_flg();
		}
		if ($xfr_calc_flg.equalsIgnoreCase(name)) {
			return xfr_calc_flg();
		}
		if ($alc_err_flg.equalsIgnoreCase(name)) {
			return alc_err_flg();
		}
		if ($trd_amt_flg.equalsIgnoreCase(name)) {
			return trd_amt_flg();
		}
		if ($adj_amt_flg.equalsIgnoreCase(name)) {
			return adj_amt_flg();
		}
		if ($minus_stk_flg.equalsIgnoreCase(name)) {
			return minus_stk_flg();
		}
		if ($other_chk_flg.equalsIgnoreCase(name)) {
			return other_chk_flg();
		}
		if ($itm_limit_flg.equalsIgnoreCase(name)) {
			return itm_limit_flg();
		}
		if ($data_check_flg.equalsIgnoreCase(name)) {
			return data_check_flg();
		}
		if ($carry_flg.equalsIgnoreCase(name)) {
			return carry_flg();
		}
		if ($non_del_flg.equalsIgnoreCase(name)) {
			return non_del_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($rate_fix_flg.equalsIgnoreCase(name)) {
			return rate_fix_flg();
		}
		if ($calc_err_flg.equalsIgnoreCase(name)) {
			return calc_err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($sa_typ.equalsIgnoreCase(name)) {
			return sa_typ();
		}
		if ($exp_calc_typ.equalsIgnoreCase(name)) {
			return exp_calc_typ();
		}
		if ($pre_alc_calc_typ.equalsIgnoreCase(name)) {
			return pre_alc_calc_typ();
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			return alc_calc_typ();
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			return cost_calc_typ();
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			return eval_typ();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($runtime_wg_cd.equalsIgnoreCase(name)) {
			return runtime_wg_cd();
		}
		if ($ins_srv_req_no.equalsIgnoreCase(name)) {
			return ins_srv_req_no();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
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
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($calc_cnt.equalsIgnoreCase(name)) {
			return calc_cnt();
		}
		if ($calc_exec_cnt.equalsIgnoreCase(name)) {
			return calc_exec_cnt();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		if ($st_ym.equalsIgnoreCase(name)) {
			return st_ym();
		}
		if ($end_ym.equalsIgnoreCase(name)) {
			return end_ym();
		}
		if ($calc_st.equalsIgnoreCase(name)) {
			return calc_st();
		}
		if ($calc_fin.equalsIgnoreCase(name)) {
			return calc_fin();
		}
		return super.getDateNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($inpt_calc_flg.equalsIgnoreCase(name)) {
			return inpt_calc_flg();
		}
		if ($wk_calc_flg.equalsIgnoreCase(name)) {
			return wk_calc_flg();
		}
		if ($prov_calc_flg.equalsIgnoreCase(name)) {
			return prov_calc_flg();
		}
		if ($xfr_calc_flg.equalsIgnoreCase(name)) {
			return xfr_calc_flg();
		}
		if ($alc_err_flg.equalsIgnoreCase(name)) {
			return alc_err_flg();
		}
		if ($trd_amt_flg.equalsIgnoreCase(name)) {
			return trd_amt_flg();
		}
		if ($adj_amt_flg.equalsIgnoreCase(name)) {
			return adj_amt_flg();
		}
		if ($minus_stk_flg.equalsIgnoreCase(name)) {
			return minus_stk_flg();
		}
		if ($other_chk_flg.equalsIgnoreCase(name)) {
			return other_chk_flg();
		}
		if ($itm_limit_flg.equalsIgnoreCase(name)) {
			return itm_limit_flg();
		}
		if ($data_check_flg.equalsIgnoreCase(name)) {
			return data_check_flg();
		}
		if ($carry_flg.equalsIgnoreCase(name)) {
			return carry_flg();
		}
		if ($non_del_flg.equalsIgnoreCase(name)) {
			return non_del_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($rate_fix_flg.equalsIgnoreCase(name)) {
			return rate_fix_flg();
		}
		if ($calc_err_flg.equalsIgnoreCase(name)) {
			return calc_err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($sa_typ.equalsIgnoreCase(name)) {
			sa_typ(value);
			return;
		}
		if ($exp_calc_typ.equalsIgnoreCase(name)) {
			exp_calc_typ(value);
			return;
		}
		if ($pre_alc_calc_typ.equalsIgnoreCase(name)) {
			pre_alc_calc_typ(value);
			return;
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			alc_calc_typ(value);
			return;
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			cost_calc_typ(value);
			return;
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			eval_typ(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($runtime_wg_cd.equalsIgnoreCase(name)) {
			runtime_wg_cd(value);
			return;
		}
		if ($ins_srv_req_no.equalsIgnoreCase(name)) {
			ins_srv_req_no(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
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
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_exec_cnt.equalsIgnoreCase(name)) {
			calc_exec_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_exec_cnt.equalsIgnoreCase(name)) {
			calc_exec_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_exec_cnt.equalsIgnoreCase(name)) {
			calc_exec_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_exec_cnt.equalsIgnoreCase(name)) {
			calc_exec_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_exec_cnt.equalsIgnoreCase(name)) {
			calc_exec_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		if ($st_ym.equalsIgnoreCase(name)) {
			st_ym(value);
			return;
		}
		if ($end_ym.equalsIgnoreCase(name)) {
			end_ym(value);
			return;
		}
		if ($calc_st.equalsIgnoreCase(name)) {
			calc_st(value);
			return;
		}
		if ($calc_fin.equalsIgnoreCase(name)) {
			calc_fin(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($inpt_calc_flg.equalsIgnoreCase(name)) {
			inpt_calc_flg(value);
			return;
		}
		if ($wk_calc_flg.equalsIgnoreCase(name)) {
			wk_calc_flg(value);
			return;
		}
		if ($prov_calc_flg.equalsIgnoreCase(name)) {
			prov_calc_flg(value);
			return;
		}
		if ($xfr_calc_flg.equalsIgnoreCase(name)) {
			xfr_calc_flg(value);
			return;
		}
		if ($alc_err_flg.equalsIgnoreCase(name)) {
			alc_err_flg(value);
			return;
		}
		if ($trd_amt_flg.equalsIgnoreCase(name)) {
			trd_amt_flg(value);
			return;
		}
		if ($adj_amt_flg.equalsIgnoreCase(name)) {
			adj_amt_flg(value);
			return;
		}
		if ($minus_stk_flg.equalsIgnoreCase(name)) {
			minus_stk_flg(value);
			return;
		}
		if ($other_chk_flg.equalsIgnoreCase(name)) {
			other_chk_flg(value);
			return;
		}
		if ($itm_limit_flg.equalsIgnoreCase(name)) {
			itm_limit_flg(value);
			return;
		}
		if ($data_check_flg.equalsIgnoreCase(name)) {
			data_check_flg(value);
			return;
		}
		if ($carry_flg.equalsIgnoreCase(name)) {
			carry_flg(value);
			return;
		}
		if ($non_del_flg.equalsIgnoreCase(name)) {
			non_del_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($rate_fix_flg.equalsIgnoreCase(name)) {
			rate_fix_flg(value);
			return;
		}
		if ($calc_err_flg.equalsIgnoreCase(name)) {
			calc_err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($sa_typ.equalsIgnoreCase(name)) {
			sa_typ(value);
			return;
		}
		if ($exp_calc_typ.equalsIgnoreCase(name)) {
			exp_calc_typ(value);
			return;
		}
		if ($pre_alc_calc_typ.equalsIgnoreCase(name)) {
			pre_alc_calc_typ(value);
			return;
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			alc_calc_typ(value);
			return;
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			cost_calc_typ(value);
			return;
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			eval_typ(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($runtime_wg_cd.equalsIgnoreCase(name)) {
			runtime_wg_cd(value);
			return;
		}
		if ($ins_srv_req_no.equalsIgnoreCase(name)) {
			ins_srv_req_no(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
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
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_exec_cnt.equalsIgnoreCase(name)) {
			calc_exec_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_exec_cnt.equalsIgnoreCase(name)) {
			calc_exec_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_exec_cnt.equalsIgnoreCase(name)) {
			calc_exec_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_exec_cnt.equalsIgnoreCase(name)) {
			calc_exec_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_exec_cnt.equalsIgnoreCase(name)) {
			calc_exec_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		if ($st_ym.equalsIgnoreCase(name)) {
			st_ym(value);
			return;
		}
		if ($end_ym.equalsIgnoreCase(name)) {
			end_ym(value);
			return;
		}
		if ($calc_st.equalsIgnoreCase(name)) {
			calc_st(value);
			return;
		}
		if ($calc_fin.equalsIgnoreCase(name)) {
			calc_fin(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($inpt_calc_flg.equalsIgnoreCase(name)) {
			inpt_calc_flg(value);
			return;
		}
		if ($wk_calc_flg.equalsIgnoreCase(name)) {
			wk_calc_flg(value);
			return;
		}
		if ($prov_calc_flg.equalsIgnoreCase(name)) {
			prov_calc_flg(value);
			return;
		}
		if ($xfr_calc_flg.equalsIgnoreCase(name)) {
			xfr_calc_flg(value);
			return;
		}
		if ($alc_err_flg.equalsIgnoreCase(name)) {
			alc_err_flg(value);
			return;
		}
		if ($trd_amt_flg.equalsIgnoreCase(name)) {
			trd_amt_flg(value);
			return;
		}
		if ($adj_amt_flg.equalsIgnoreCase(name)) {
			adj_amt_flg(value);
			return;
		}
		if ($minus_stk_flg.equalsIgnoreCase(name)) {
			minus_stk_flg(value);
			return;
		}
		if ($other_chk_flg.equalsIgnoreCase(name)) {
			other_chk_flg(value);
			return;
		}
		if ($itm_limit_flg.equalsIgnoreCase(name)) {
			itm_limit_flg(value);
			return;
		}
		if ($data_check_flg.equalsIgnoreCase(name)) {
			data_check_flg(value);
			return;
		}
		if ($carry_flg.equalsIgnoreCase(name)) {
			carry_flg(value);
			return;
		}
		if ($non_del_flg.equalsIgnoreCase(name)) {
			non_del_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($rate_fix_flg.equalsIgnoreCase(name)) {
			rate_fix_flg(value);
			return;
		}
		if ($calc_err_flg.equalsIgnoreCase(name)) {
			calc_err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
