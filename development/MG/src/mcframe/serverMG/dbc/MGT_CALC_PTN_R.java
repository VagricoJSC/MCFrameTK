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
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "計算対象計算パタン情報 // (Calculation) Calculation pattern info."DBコンテナRowクラスです。<p>
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
 *  	<td>calc_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>原価計算ＮＯ</td>
 *  	<td>Calculation No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>calc_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算グループＣＤ</td>
 *  	<td>Calculation group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>calc_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算パタンＣＤ</td>
 *  	<td>Calculation pattern cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_purc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造購買区分</td>
 *  	<td>Mfg. purchase type</td>
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
 *  	<td>dpt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門計算区分</td>
 *  	<td>Dept. calculation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットＮＯ計算区分</td>
 *  	<td>Lot No. calculation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sublot_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ計算区分</td>
 *  	<td>Sublot No. calculation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno1_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１計算区分</td>
 *  	<td>SEIBAN No. 1 calculation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno2_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２計算区分</td>
 *  	<td>SEIBAN No. 2 calculation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno3_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３計算区分</td>
 *  	<td>SEIBAN No. 3 calculation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno4_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４計算区分</td>
 *  	<td>SEIBAN No. 4 calculation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lot_exp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットＮＯ展開区分</td>
 *  	<td>Lot No. explosion type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sublot_exp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ展開区分</td>
 *  	<td>Sublot No. explosion type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno1_exp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１展開区分</td>
 *  	<td>SEIBAN No. 1 explosion type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno2_exp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２展開区分</td>
 *  	<td>SEIBAN No. 2 explosion type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno3_exp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３展開区分</td>
 *  	<td>SEIBAN No. 3 explosion type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno4_exp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４展開区分</td>
 *  	<td>SEIBAN No. 4 explosion type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準端数処理区分</td>
 *  	<td>Rounding type (Standard)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準小数部有効桁数</td>
 *  	<td>Standard number of decimal places</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額端数処理区分</td>
 *  	<td>Rounding type (Amount)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt_dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額小数部有効桁数</td>
 *  	<td>Amount number of decimal places</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ave_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>単価端数処理区分</td>
 *  	<td>Rounding type (Unit price)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ave_dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>単価小数部有効桁数</td>
 *  	<td>Unit price number of decimal places</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>adj_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>端数調整区分</td>
 *  	<td>Fraction adjustment type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wip_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕掛区分</td>
 *  	<td>WIP type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bd_agg_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内訳集計区分</td>
 *  	<td>Breakdown aggregated type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mrgn_expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>調整費目ＣＤ</td>
 *  	<td>Adjustment cost element cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購買費目ＣＤ</td>
 *  	<td>Purchase cost element item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>out_expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外注費目ＣＤ</td>
 *  	<td>Subcontract cost element cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inpt_expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>投入費目ＣＤ</td>
 *  	<td>Input cost element cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ss_expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>自給費目ＣＤ</td>
 *  	<td>Self supply cost element cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prov_expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有償差額費目ＣＤ</td>
 *  	<td>Cost element cd. for gain or loss of chargeable item</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>exp_alloc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>展開割付区分</td>
 *  	<td>Explosion allocation type</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGT_CALC_PTN_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MGT_CALC_PTN";

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
	 * 計算パタンＣＤ. Calculation pattern cd..<p>
	 *
	 */
	public static final String $calc_ptn_cd = "calc_ptn_cd";
	private static final MCPermColumnInfo _calc_ptn_cd = createColumnInfo("calc_ptn_cd");
	public final MCStringPermColumn calc_ptn_cd = createStringColumn(_calc_ptn_cd);
	
	/**
	 * 製造購買区分. Mfg. purchase type.<p>
	 *
	 */
	public static final String $mfg_purc_typ = "mfg_purc_typ";
	private static final MCPermColumnInfo _mfg_purc_typ = createColumnInfo("mfg_purc_typ");
	public final MCStringPermColumn mfg_purc_typ = createStringColumn(_mfg_purc_typ);
	
	/**
	 * 金額評価区分. Amount evaluation type.<p>
	 *
	 */
	public static final String $eval_typ = "eval_typ";
	private static final MCPermColumnInfo _eval_typ = createColumnInfo("eval_typ");
	public final MCStringPermColumn eval_typ = createStringColumn(_eval_typ);
	
	/**
	 * 部門計算区分. Dept. calculation type.<p>
	 *
	 */
	public static final String $dpt_typ = "dpt_typ";
	private static final MCPermColumnInfo _dpt_typ = createColumnInfo("dpt_typ");
	public final MCStringPermColumn dpt_typ = createStringColumn(_dpt_typ);
	
	/**
	 * ロットＮＯ計算区分. Lot No. calculation type.<p>
	 *
	 */
	public static final String $lot_typ = "lot_typ";
	private static final MCPermColumnInfo _lot_typ = createColumnInfo("lot_typ");
	public final MCStringPermColumn lot_typ = createStringColumn(_lot_typ);
	
	/**
	 * サブロットＮＯ計算区分. Sublot No. calculation type.<p>
	 *
	 */
	public static final String $sublot_typ = "sublot_typ";
	private static final MCPermColumnInfo _sublot_typ = createColumnInfo("sublot_typ");
	public final MCStringPermColumn sublot_typ = createStringColumn(_sublot_typ);
	
	/**
	 * 手配ＮＯ１計算区分. SEIBAN No. 1 calculation type.<p>
	 *
	 */
	public static final String $sno1_typ = "sno1_typ";
	private static final MCPermColumnInfo _sno1_typ = createColumnInfo("sno1_typ");
	public final MCStringPermColumn sno1_typ = createStringColumn(_sno1_typ);
	
	/**
	 * 手配ＮＯ２計算区分. SEIBAN No. 2 calculation type.<p>
	 *
	 */
	public static final String $sno2_typ = "sno2_typ";
	private static final MCPermColumnInfo _sno2_typ = createColumnInfo("sno2_typ");
	public final MCStringPermColumn sno2_typ = createStringColumn(_sno2_typ);
	
	/**
	 * 手配ＮＯ３計算区分. SEIBAN No. 3 calculation type.<p>
	 *
	 */
	public static final String $sno3_typ = "sno3_typ";
	private static final MCPermColumnInfo _sno3_typ = createColumnInfo("sno3_typ");
	public final MCStringPermColumn sno3_typ = createStringColumn(_sno3_typ);
	
	/**
	 * 手配ＮＯ４計算区分. SEIBAN No. 4 calculation type.<p>
	 *
	 */
	public static final String $sno4_typ = "sno4_typ";
	private static final MCPermColumnInfo _sno4_typ = createColumnInfo("sno4_typ");
	public final MCStringPermColumn sno4_typ = createStringColumn(_sno4_typ);
	
	/**
	 * ロットＮＯ展開区分. Lot No. explosion type.<p>
	 *
	 */
	public static final String $lot_exp_typ = "lot_exp_typ";
	private static final MCPermColumnInfo _lot_exp_typ = createColumnInfo("lot_exp_typ");
	public final MCStringPermColumn lot_exp_typ = createStringColumn(_lot_exp_typ);
	
	/**
	 * サブロットＮＯ展開区分. Sublot No. explosion type.<p>
	 *
	 */
	public static final String $sublot_exp_typ = "sublot_exp_typ";
	private static final MCPermColumnInfo _sublot_exp_typ = createColumnInfo("sublot_exp_typ");
	public final MCStringPermColumn sublot_exp_typ = createStringColumn(_sublot_exp_typ);
	
	/**
	 * 手配ＮＯ１展開区分. SEIBAN No. 1 explosion type.<p>
	 *
	 */
	public static final String $sno1_exp_typ = "sno1_exp_typ";
	private static final MCPermColumnInfo _sno1_exp_typ = createColumnInfo("sno1_exp_typ");
	public final MCStringPermColumn sno1_exp_typ = createStringColumn(_sno1_exp_typ);
	
	/**
	 * 手配ＮＯ２展開区分. SEIBAN No. 2 explosion type.<p>
	 *
	 */
	public static final String $sno2_exp_typ = "sno2_exp_typ";
	private static final MCPermColumnInfo _sno2_exp_typ = createColumnInfo("sno2_exp_typ");
	public final MCStringPermColumn sno2_exp_typ = createStringColumn(_sno2_exp_typ);
	
	/**
	 * 手配ＮＯ３展開区分. SEIBAN No. 3 explosion type.<p>
	 *
	 */
	public static final String $sno3_exp_typ = "sno3_exp_typ";
	private static final MCPermColumnInfo _sno3_exp_typ = createColumnInfo("sno3_exp_typ");
	public final MCStringPermColumn sno3_exp_typ = createStringColumn(_sno3_exp_typ);
	
	/**
	 * 手配ＮＯ４展開区分. SEIBAN No. 4 explosion type.<p>
	 *
	 */
	public static final String $sno4_exp_typ = "sno4_exp_typ";
	private static final MCPermColumnInfo _sno4_exp_typ = createColumnInfo("sno4_exp_typ");
	public final MCStringPermColumn sno4_exp_typ = createStringColumn(_sno4_exp_typ);
	
	/**
	 * 標準端数処理区分. Rounding type (Standard).<p>
	 *
	 */
	public static final String $std_rnd_typ = "std_rnd_typ";
	private static final MCPermColumnInfo _std_rnd_typ = createColumnInfo("std_rnd_typ");
	public final MCStringPermColumn std_rnd_typ = createStringColumn(_std_rnd_typ);
	
	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public static final String $std_dec_place = "std_dec_place";
	private static final MCPermColumnInfo _std_dec_place = createColumnInfo("std_dec_place");
	public final MCNumberPermColumn std_dec_place = createNumberColumn(_std_dec_place);
	
	/**
	 * 金額端数処理区分. Rounding type (Amount).<p>
	 *
	 */
	public static final String $amt_rnd_typ = "amt_rnd_typ";
	private static final MCPermColumnInfo _amt_rnd_typ = createColumnInfo("amt_rnd_typ");
	public final MCStringPermColumn amt_rnd_typ = createStringColumn(_amt_rnd_typ);
	
	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	private static final MCPermColumnInfo _amt_dec_place = createColumnInfo("amt_dec_place");
	public final MCNumberPermColumn amt_dec_place = createNumberColumn(_amt_dec_place);
	
	/**
	 * 単価端数処理区分. Rounding type (Unit price).<p>
	 *
	 */
	public static final String $ave_rnd_typ = "ave_rnd_typ";
	private static final MCPermColumnInfo _ave_rnd_typ = createColumnInfo("ave_rnd_typ");
	public final MCStringPermColumn ave_rnd_typ = createStringColumn(_ave_rnd_typ);
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public static final String $ave_dec_place = "ave_dec_place";
	private static final MCPermColumnInfo _ave_dec_place = createColumnInfo("ave_dec_place");
	public final MCNumberPermColumn ave_dec_place = createNumberColumn(_ave_dec_place);
	
	/**
	 * 端数調整区分. Fraction adjustment type.<p>
	 *
	 */
	public static final String $adj_typ = "adj_typ";
	private static final MCPermColumnInfo _adj_typ = createColumnInfo("adj_typ");
	public final MCStringPermColumn adj_typ = createStringColumn(_adj_typ);
	
	/**
	 * 仕掛区分. WIP type.<p>
	 *
	 */
	public static final String $wip_typ = "wip_typ";
	private static final MCPermColumnInfo _wip_typ = createColumnInfo("wip_typ");
	public final MCStringPermColumn wip_typ = createStringColumn(_wip_typ);
	
	/**
	 * 内訳集計区分. Breakdown aggregated type.<p>
	 *
	 */
	public static final String $bd_agg_typ = "bd_agg_typ";
	private static final MCPermColumnInfo _bd_agg_typ = createColumnInfo("bd_agg_typ");
	public final MCStringPermColumn bd_agg_typ = createStringColumn(_bd_agg_typ);
	
	/**
	 * 調整費目ＣＤ. Adjustment cost element cd..<p>
	 *
	 */
	public static final String $mrgn_expns_cd = "mrgn_expns_cd";
	private static final MCPermColumnInfo _mrgn_expns_cd = createColumnInfo("mrgn_expns_cd");
	public final MCStringPermColumn mrgn_expns_cd = createStringColumn(_mrgn_expns_cd);
	
	/**
	 * 購買費目ＣＤ. Purchase cost element item cd..<p>
	 *
	 */
	public static final String $purc_expns_cd = "purc_expns_cd";
	private static final MCPermColumnInfo _purc_expns_cd = createColumnInfo("purc_expns_cd");
	public final MCStringPermColumn purc_expns_cd = createStringColumn(_purc_expns_cd);
	
	/**
	 * 外注費目ＣＤ. Subcontract cost element cd..<p>
	 *
	 */
	public static final String $out_expns_cd = "out_expns_cd";
	private static final MCPermColumnInfo _out_expns_cd = createColumnInfo("out_expns_cd");
	public final MCStringPermColumn out_expns_cd = createStringColumn(_out_expns_cd);
	
	/**
	 * 投入費目ＣＤ. Input cost element cd..<p>
	 *
	 */
	public static final String $inpt_expns_cd = "inpt_expns_cd";
	private static final MCPermColumnInfo _inpt_expns_cd = createColumnInfo("inpt_expns_cd");
	public final MCStringPermColumn inpt_expns_cd = createStringColumn(_inpt_expns_cd);
	
	/**
	 * 自給費目ＣＤ. Self supply cost element cd..<p>
	 *
	 */
	public static final String $ss_expns_cd = "ss_expns_cd";
	private static final MCPermColumnInfo _ss_expns_cd = createColumnInfo("ss_expns_cd");
	public final MCStringPermColumn ss_expns_cd = createStringColumn(_ss_expns_cd);
	
	/**
	 * 有償差額費目ＣＤ. Cost element cd. for gain or loss of chargeable item.<p>
	 *
	 */
	public static final String $prov_expns_cd = "prov_expns_cd";
	private static final MCPermColumnInfo _prov_expns_cd = createColumnInfo("prov_expns_cd");
	public final MCStringPermColumn prov_expns_cd = createStringColumn(_prov_expns_cd);
	
	/**
	 * 展開割付区分. Explosion allocation type.<p>
	 *
	 */
	public static final String $exp_alloc_typ = "exp_alloc_typ";
	private static final MCPermColumnInfo _exp_alloc_typ = createColumnInfo("exp_alloc_typ");
	public final MCStringPermColumn exp_alloc_typ = createStringColumn(_exp_alloc_typ);
	
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_ptn_cd_META = createCommonMeta($calc_ptn_cd, mcframe.commonMA.meta.MA_META.CALC_PTN_CD);
	public static final MCMeta mfg_purc_typ_META = createCommonMeta($mfg_purc_typ, mcframe.commonMA.meta.MA_META.MFG_PURC_TYP);
	public static final MCMeta eval_typ_META = createCommonMeta($eval_typ, mcframe.commonMA.meta.MA_META.EVAL_TYP);
	public static final MCMeta dpt_typ_META = createCommonMeta($dpt_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta lot_typ_META = createCommonMeta($lot_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta sublot_typ_META = createCommonMeta($sublot_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta sno1_typ_META = createCommonMeta($sno1_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta sno2_typ_META = createCommonMeta($sno2_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta sno3_typ_META = createCommonMeta($sno3_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta sno4_typ_META = createCommonMeta($sno4_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta lot_exp_typ_META = createCommonMeta($lot_exp_typ, mcframe.commonMA.meta.MA_META.EXP_SET_TYP);
	public static final MCMeta sublot_exp_typ_META = createCommonMeta($sublot_exp_typ, mcframe.commonMA.meta.MA_META.EXP_SET_TYP);
	public static final MCMeta sno1_exp_typ_META = createCommonMeta($sno1_exp_typ, mcframe.commonMA.meta.MA_META.EXP_SET_TYP);
	public static final MCMeta sno2_exp_typ_META = createCommonMeta($sno2_exp_typ, mcframe.commonMA.meta.MA_META.EXP_SET_TYP);
	public static final MCMeta sno3_exp_typ_META = createCommonMeta($sno3_exp_typ, mcframe.commonMA.meta.MA_META.EXP_SET_TYP);
	public static final MCMeta sno4_exp_typ_META = createCommonMeta($sno4_exp_typ, mcframe.commonMA.meta.MA_META.EXP_SET_TYP);
	public static final MCMeta std_rnd_typ_META = createCommonMeta($std_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta std_dec_place_META = createCommonMeta($std_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta amt_rnd_typ_META = createCommonMeta($amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ave_rnd_typ_META = createCommonMeta($ave_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta ave_dec_place_META = createCommonMeta($ave_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta adj_typ_META = createCommonMeta($adj_typ, mcframe.commonMA.meta.MA_META.ADJ_TYP);
	public static final MCMeta wip_typ_META = createCommonMeta($wip_typ, mcframe.commonMA.meta.MA_META.WIP_TYP);
	public static final MCMeta bd_agg_typ_META = createCommonMeta($bd_agg_typ, mcframe.commonMA.meta.MA_META.BD_AGG_TYP);
	public static final MCMeta mrgn_expns_cd_META = createCommonMeta($mrgn_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta purc_expns_cd_META = createCommonMeta($purc_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta out_expns_cd_META = createCommonMeta($out_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta inpt_expns_cd_META = createCommonMeta($inpt_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta ss_expns_cd_META = createCommonMeta($ss_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta prov_expns_cd_META = createCommonMeta($prov_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta exp_alloc_typ_META = createCommonMeta($exp_alloc_typ, mcframe.commonMA.meta.MA_META.EXP_ALLOC_TYP);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $ARG1 = "ARG1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MGT_ARG",
				$ARG1,
				new String[][]{
						{"calc_no", "calc_no"},
						{"calc_grp_cd", "calc_grp_cd"}
				},
				() -> {
					return mcframe.serverMG.dbc.MGT_ARG_R.create("ARG1");
				},
				(alias) -> {
					MGT_CALC_PTN_R own = MGT_CALC_PTN_R.create(alias);
					mcframe.serverMG.dbc.MGT_ARG_R ref = mcframe.serverMG.dbc.MGT_ARG_R.create("ARG1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.calc_no.eq(ref.calc_no));
					cond = cond.and(own.calc_grp_cd.eq(ref.calc_grp_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MGT_CALC_PTN_R> constMetas = new ConstMetaList<MGT_CALC_PTN_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			calc_no_META,
			calc_grp_cd_META,
			calc_ptn_cd_META,
			mfg_purc_typ_META,
			eval_typ_META,
			dpt_typ_META,
			lot_typ_META,
			sublot_typ_META,
			sno1_typ_META,
			sno2_typ_META,
			sno3_typ_META,
			sno4_typ_META,
			lot_exp_typ_META,
			sublot_exp_typ_META,
			sno1_exp_typ_META,
			sno2_exp_typ_META,
			sno3_exp_typ_META,
			sno4_exp_typ_META,
			std_rnd_typ_META,
			std_dec_place_META,
			amt_rnd_typ_META,
			amt_dec_place_META,
			ave_rnd_typ_META,
			ave_dec_place_META,
			adj_typ_META,
			wip_typ_META,
			bd_agg_typ_META,
			mrgn_expns_cd_META,
			purc_expns_cd_META,
			out_expns_cd_META,
			inpt_expns_cd_META,
			ss_expns_cd_META,
			prov_expns_cd_META,
			exp_alloc_typ_META
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
	protected MGT_CALC_PTN_R(ConstMetaList<? extends MGT_CALC_PTN_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGT_CALC_PTN_R(ConstMetaList<? extends MGT_CALC_PTN_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$calc_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$calc_no,
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
			MGT_CALC_PTN_R.$calc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$calc_grp_cd,
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
			MGT_CALC_PTN_R.$calc_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$calc_ptn_cd,
				"calc_ptn_cd",
				calc_ptn_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$mfg_purc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$mfg_purc_typ,
				"mfg_purc_typ",
				mfg_purc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$eval_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$eval_typ,
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
			MGT_CALC_PTN_R.$dpt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$dpt_typ,
				"dpt_typ",
				dpt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$lot_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$lot_typ,
				"lot_typ",
				lot_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$sublot_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$sublot_typ,
				"sublot_typ",
				sublot_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$sno1_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$sno1_typ,
				"sno1_typ",
				sno1_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$sno2_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$sno2_typ,
				"sno2_typ",
				sno2_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$sno3_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$sno3_typ,
				"sno3_typ",
				sno3_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$sno4_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$sno4_typ,
				"sno4_typ",
				sno4_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$lot_exp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$lot_exp_typ,
				"lot_exp_typ",
				lot_exp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$sublot_exp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$sublot_exp_typ,
				"sublot_exp_typ",
				sublot_exp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$sno1_exp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$sno1_exp_typ,
				"sno1_exp_typ",
				sno1_exp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$sno2_exp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$sno2_exp_typ,
				"sno2_exp_typ",
				sno2_exp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$sno3_exp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$sno3_exp_typ,
				"sno3_exp_typ",
				sno3_exp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$sno4_exp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$sno4_exp_typ,
				"sno4_exp_typ",
				sno4_exp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$std_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$std_rnd_typ,
				"std_rnd_typ",
				std_rnd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$std_dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_CALC_PTN_R.$std_dec_place,
				"std_dec_place",
				std_dec_place,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$amt_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$amt_rnd_typ,
				"amt_rnd_typ",
				amt_rnd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$amt_dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_CALC_PTN_R.$amt_dec_place,
				"amt_dec_place",
				amt_dec_place,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$ave_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$ave_rnd_typ,
				"ave_rnd_typ",
				ave_rnd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$ave_dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_CALC_PTN_R.$ave_dec_place,
				"ave_dec_place",
				ave_dec_place,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$adj_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$adj_typ,
				"adj_typ",
				adj_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$wip_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$wip_typ,
				"wip_typ",
				wip_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$bd_agg_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$bd_agg_typ,
				"bd_agg_typ",
				bd_agg_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$mrgn_expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$mrgn_expns_cd,
				"mrgn_expns_cd",
				mrgn_expns_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$purc_expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$purc_expns_cd,
				"purc_expns_cd",
				purc_expns_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$out_expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$out_expns_cd,
				"out_expns_cd",
				out_expns_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$inpt_expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$inpt_expns_cd,
				"inpt_expns_cd",
				inpt_expns_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$ss_expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$ss_expns_cd,
				"ss_expns_cd",
				ss_expns_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$prov_expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$prov_expns_cd,
				"prov_expns_cd",
				prov_expns_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_CALC_PTN_R.$exp_alloc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_CALC_PTN_R.$exp_alloc_typ,
				"exp_alloc_typ",
				exp_alloc_typ,
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
	public static MGT_CALC_PTN_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGT_CALC_PTN_R create(String alias) {
		MGT_CALC_PTN_R row = new MGT_CALC_PTN_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGT_CALC_PTN_R createByName(T proto) {
		MGT_CALC_PTN_R row = MGT_CALC_PTN_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_CALC_PTN_R clone() {
		return (MGT_CALC_PTN_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_CALC_PTN_R createInstance() {
		return (MGT_CALC_PTN_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_CALC_PTN_R getValues(String... names) {
		return (MGT_CALC_PTN_R) super.getValues(names);
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
	 public MGW_CALC_PTN_KEY_R getPkWorkDbc(String alias) {
	 	return MGW_CALC_PTN_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MGW_CALC_PTN_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MGW_CALC_PTN_KEY_R.TABLE_NAME);
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
	 * 計算パタンＣＤ. Calculation pattern cd..<p>
	 *
	 */
	public String calc_ptn_cd() {
		return getConstString(offset + 2, $calc_ptn_cd);
	}

	/**
	 * 計算パタンＣＤ. Calculation pattern cd..<p>
	 *
	 */
	public void calc_ptn_cd(String value) {
		setConstString(offset + 2, $calc_ptn_cd, value);
	}

	/**
	 * 製造購買区分. Mfg. purchase type.<p>
	 *
	 */
	public String mfg_purc_typ() {
		return getConstString(offset + 3, $mfg_purc_typ);
	}

	/**
	 * 製造購買区分. Mfg. purchase type.<p>
	 *
	 */
	public void mfg_purc_typ(String value) {
		setConstString(offset + 3, $mfg_purc_typ, value);
	}

	/**
	 * 金額評価区分. Amount evaluation type.<p>
	 *
	 */
	public String eval_typ() {
		return getConstString(offset + 4, $eval_typ);
	}

	/**
	 * 金額評価区分. Amount evaluation type.<p>
	 *
	 */
	public void eval_typ(String value) {
		setConstString(offset + 4, $eval_typ, value);
	}

	/**
	 * 部門計算区分. Dept. calculation type.<p>
	 *
	 */
	public String dpt_typ() {
		return getConstString(offset + 5, $dpt_typ);
	}

	/**
	 * 部門計算区分. Dept. calculation type.<p>
	 *
	 */
	public void dpt_typ(String value) {
		setConstString(offset + 5, $dpt_typ, value);
	}

	/**
	 * ロットＮＯ計算区分. Lot No. calculation type.<p>
	 *
	 */
	public String lot_typ() {
		return getConstString(offset + 6, $lot_typ);
	}

	/**
	 * ロットＮＯ計算区分. Lot No. calculation type.<p>
	 *
	 */
	public void lot_typ(String value) {
		setConstString(offset + 6, $lot_typ, value);
	}

	/**
	 * サブロットＮＯ計算区分. Sublot No. calculation type.<p>
	 *
	 */
	public String sublot_typ() {
		return getConstString(offset + 7, $sublot_typ);
	}

	/**
	 * サブロットＮＯ計算区分. Sublot No. calculation type.<p>
	 *
	 */
	public void sublot_typ(String value) {
		setConstString(offset + 7, $sublot_typ, value);
	}

	/**
	 * 手配ＮＯ１計算区分. SEIBAN No. 1 calculation type.<p>
	 *
	 */
	public String sno1_typ() {
		return getConstString(offset + 8, $sno1_typ);
	}

	/**
	 * 手配ＮＯ１計算区分. SEIBAN No. 1 calculation type.<p>
	 *
	 */
	public void sno1_typ(String value) {
		setConstString(offset + 8, $sno1_typ, value);
	}

	/**
	 * 手配ＮＯ２計算区分. SEIBAN No. 2 calculation type.<p>
	 *
	 */
	public String sno2_typ() {
		return getConstString(offset + 9, $sno2_typ);
	}

	/**
	 * 手配ＮＯ２計算区分. SEIBAN No. 2 calculation type.<p>
	 *
	 */
	public void sno2_typ(String value) {
		setConstString(offset + 9, $sno2_typ, value);
	}

	/**
	 * 手配ＮＯ３計算区分. SEIBAN No. 3 calculation type.<p>
	 *
	 */
	public String sno3_typ() {
		return getConstString(offset + 10, $sno3_typ);
	}

	/**
	 * 手配ＮＯ３計算区分. SEIBAN No. 3 calculation type.<p>
	 *
	 */
	public void sno3_typ(String value) {
		setConstString(offset + 10, $sno3_typ, value);
	}

	/**
	 * 手配ＮＯ４計算区分. SEIBAN No. 4 calculation type.<p>
	 *
	 */
	public String sno4_typ() {
		return getConstString(offset + 11, $sno4_typ);
	}

	/**
	 * 手配ＮＯ４計算区分. SEIBAN No. 4 calculation type.<p>
	 *
	 */
	public void sno4_typ(String value) {
		setConstString(offset + 11, $sno4_typ, value);
	}

	/**
	 * ロットＮＯ展開区分. Lot No. explosion type.<p>
	 *
	 */
	public String lot_exp_typ() {
		return getConstString(offset + 12, $lot_exp_typ);
	}

	/**
	 * ロットＮＯ展開区分. Lot No. explosion type.<p>
	 *
	 */
	public void lot_exp_typ(String value) {
		setConstString(offset + 12, $lot_exp_typ, value);
	}

	/**
	 * サブロットＮＯ展開区分. Sublot No. explosion type.<p>
	 *
	 */
	public String sublot_exp_typ() {
		return getConstString(offset + 13, $sublot_exp_typ);
	}

	/**
	 * サブロットＮＯ展開区分. Sublot No. explosion type.<p>
	 *
	 */
	public void sublot_exp_typ(String value) {
		setConstString(offset + 13, $sublot_exp_typ, value);
	}

	/**
	 * 手配ＮＯ１展開区分. SEIBAN No. 1 explosion type.<p>
	 *
	 */
	public String sno1_exp_typ() {
		return getConstString(offset + 14, $sno1_exp_typ);
	}

	/**
	 * 手配ＮＯ１展開区分. SEIBAN No. 1 explosion type.<p>
	 *
	 */
	public void sno1_exp_typ(String value) {
		setConstString(offset + 14, $sno1_exp_typ, value);
	}

	/**
	 * 手配ＮＯ２展開区分. SEIBAN No. 2 explosion type.<p>
	 *
	 */
	public String sno2_exp_typ() {
		return getConstString(offset + 15, $sno2_exp_typ);
	}

	/**
	 * 手配ＮＯ２展開区分. SEIBAN No. 2 explosion type.<p>
	 *
	 */
	public void sno2_exp_typ(String value) {
		setConstString(offset + 15, $sno2_exp_typ, value);
	}

	/**
	 * 手配ＮＯ３展開区分. SEIBAN No. 3 explosion type.<p>
	 *
	 */
	public String sno3_exp_typ() {
		return getConstString(offset + 16, $sno3_exp_typ);
	}

	/**
	 * 手配ＮＯ３展開区分. SEIBAN No. 3 explosion type.<p>
	 *
	 */
	public void sno3_exp_typ(String value) {
		setConstString(offset + 16, $sno3_exp_typ, value);
	}

	/**
	 * 手配ＮＯ４展開区分. SEIBAN No. 4 explosion type.<p>
	 *
	 */
	public String sno4_exp_typ() {
		return getConstString(offset + 17, $sno4_exp_typ);
	}

	/**
	 * 手配ＮＯ４展開区分. SEIBAN No. 4 explosion type.<p>
	 *
	 */
	public void sno4_exp_typ(String value) {
		setConstString(offset + 17, $sno4_exp_typ, value);
	}

	/**
	 * 標準端数処理区分. Rounding type (Standard).<p>
	 *
	 */
	public String std_rnd_typ() {
		return getConstString(offset + 18, $std_rnd_typ);
	}

	/**
	 * 標準端数処理区分. Rounding type (Standard).<p>
	 *
	 */
	public void std_rnd_typ(String value) {
		setConstString(offset + 18, $std_rnd_typ, value);
	}

	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public MCNumber std_dec_place() {
		return getConstNumber(offset + 19, $std_dec_place);
	}

	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public void std_dec_place(MCNumber value) {
		setConstNumber(offset + 19, $std_dec_place, value);
	}
	
	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public void std_dec_place(int value) {
		setConstNumber(offset + 19, $std_dec_place, value);
	}
	
	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public void std_dec_place(long value) {
		setConstNumber(offset + 19, $std_dec_place, value);
	}
	
	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public void std_dec_place(float value) {
		setConstNumber(offset + 19, $std_dec_place, value);
	}
	
	/**
	 * 標準小数部有効桁数. Standard number of decimal places.<p>
	 *
	 */
	public void std_dec_place(double value) {
		setConstNumber(offset + 19, $std_dec_place, value);
	}
	
	/**
	 * 金額端数処理区分. Rounding type (Amount).<p>
	 *
	 */
	public String amt_rnd_typ() {
		return getConstString(offset + 20, $amt_rnd_typ);
	}

	/**
	 * 金額端数処理区分. Rounding type (Amount).<p>
	 *
	 */
	public void amt_rnd_typ(String value) {
		setConstString(offset + 20, $amt_rnd_typ, value);
	}

	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 21, $amt_dec_place);
	}

	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 21, $amt_dec_place, value);
	}
	
	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 21, $amt_dec_place, value);
	}
	
	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 21, $amt_dec_place, value);
	}
	
	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 21, $amt_dec_place, value);
	}
	
	/**
	 * 金額小数部有効桁数. Amount number of decimal places.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 21, $amt_dec_place, value);
	}
	
	/**
	 * 単価端数処理区分. Rounding type (Unit price).<p>
	 *
	 */
	public String ave_rnd_typ() {
		return getConstString(offset + 22, $ave_rnd_typ);
	}

	/**
	 * 単価端数処理区分. Rounding type (Unit price).<p>
	 *
	 */
	public void ave_rnd_typ(String value) {
		setConstString(offset + 22, $ave_rnd_typ, value);
	}

	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public MCNumber ave_dec_place() {
		return getConstNumber(offset + 23, $ave_dec_place);
	}

	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(MCNumber value) {
		setConstNumber(offset + 23, $ave_dec_place, value);
	}
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(int value) {
		setConstNumber(offset + 23, $ave_dec_place, value);
	}
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(long value) {
		setConstNumber(offset + 23, $ave_dec_place, value);
	}
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(float value) {
		setConstNumber(offset + 23, $ave_dec_place, value);
	}
	
	/**
	 * 単価小数部有効桁数. Unit price number of decimal places.<p>
	 *
	 */
	public void ave_dec_place(double value) {
		setConstNumber(offset + 23, $ave_dec_place, value);
	}
	
	/**
	 * 端数調整区分. Fraction adjustment type.<p>
	 *
	 */
	public String adj_typ() {
		return getConstString(offset + 24, $adj_typ);
	}

	/**
	 * 端数調整区分. Fraction adjustment type.<p>
	 *
	 */
	public void adj_typ(String value) {
		setConstString(offset + 24, $adj_typ, value);
	}

	/**
	 * 仕掛区分. WIP type.<p>
	 *
	 */
	public String wip_typ() {
		return getConstString(offset + 25, $wip_typ);
	}

	/**
	 * 仕掛区分. WIP type.<p>
	 *
	 */
	public void wip_typ(String value) {
		setConstString(offset + 25, $wip_typ, value);
	}

	/**
	 * 内訳集計区分. Breakdown aggregated type.<p>
	 *
	 */
	public String bd_agg_typ() {
		return getConstString(offset + 26, $bd_agg_typ);
	}

	/**
	 * 内訳集計区分. Breakdown aggregated type.<p>
	 *
	 */
	public void bd_agg_typ(String value) {
		setConstString(offset + 26, $bd_agg_typ, value);
	}

	/**
	 * 調整費目ＣＤ. Adjustment cost element cd..<p>
	 *
	 */
	public String mrgn_expns_cd() {
		return getConstString(offset + 27, $mrgn_expns_cd);
	}

	/**
	 * 調整費目ＣＤ. Adjustment cost element cd..<p>
	 *
	 */
	public void mrgn_expns_cd(String value) {
		setConstString(offset + 27, $mrgn_expns_cd, value);
	}

	/**
	 * 購買費目ＣＤ. Purchase cost element item cd..<p>
	 *
	 */
	public String purc_expns_cd() {
		return getConstString(offset + 28, $purc_expns_cd);
	}

	/**
	 * 購買費目ＣＤ. Purchase cost element item cd..<p>
	 *
	 */
	public void purc_expns_cd(String value) {
		setConstString(offset + 28, $purc_expns_cd, value);
	}

	/**
	 * 外注費目ＣＤ. Subcontract cost element cd..<p>
	 *
	 */
	public String out_expns_cd() {
		return getConstString(offset + 29, $out_expns_cd);
	}

	/**
	 * 外注費目ＣＤ. Subcontract cost element cd..<p>
	 *
	 */
	public void out_expns_cd(String value) {
		setConstString(offset + 29, $out_expns_cd, value);
	}

	/**
	 * 投入費目ＣＤ. Input cost element cd..<p>
	 *
	 */
	public String inpt_expns_cd() {
		return getConstString(offset + 30, $inpt_expns_cd);
	}

	/**
	 * 投入費目ＣＤ. Input cost element cd..<p>
	 *
	 */
	public void inpt_expns_cd(String value) {
		setConstString(offset + 30, $inpt_expns_cd, value);
	}

	/**
	 * 自給費目ＣＤ. Self supply cost element cd..<p>
	 *
	 */
	public String ss_expns_cd() {
		return getConstString(offset + 31, $ss_expns_cd);
	}

	/**
	 * 自給費目ＣＤ. Self supply cost element cd..<p>
	 *
	 */
	public void ss_expns_cd(String value) {
		setConstString(offset + 31, $ss_expns_cd, value);
	}

	/**
	 * 有償差額費目ＣＤ. Cost element cd. for gain or loss of chargeable item.<p>
	 *
	 */
	public String prov_expns_cd() {
		return getConstString(offset + 32, $prov_expns_cd);
	}

	/**
	 * 有償差額費目ＣＤ. Cost element cd. for gain or loss of chargeable item.<p>
	 *
	 */
	public void prov_expns_cd(String value) {
		setConstString(offset + 32, $prov_expns_cd, value);
	}

	/**
	 * 展開割付区分. Explosion allocation type.<p>
	 *
	 */
	public String exp_alloc_typ() {
		return getConstString(offset + 33, $exp_alloc_typ);
	}

	/**
	 * 展開割付区分. Explosion allocation type.<p>
	 *
	 */
	public void exp_alloc_typ(String value) {
		setConstString(offset + 33, $exp_alloc_typ, value);
	}

	public String getString(String name) {
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			return calc_ptn_cd();
		}
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			return mfg_purc_typ();
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			return eval_typ();
		}
		if ($dpt_typ.equalsIgnoreCase(name)) {
			return dpt_typ();
		}
		if ($lot_typ.equalsIgnoreCase(name)) {
			return lot_typ();
		}
		if ($sublot_typ.equalsIgnoreCase(name)) {
			return sublot_typ();
		}
		if ($sno1_typ.equalsIgnoreCase(name)) {
			return sno1_typ();
		}
		if ($sno2_typ.equalsIgnoreCase(name)) {
			return sno2_typ();
		}
		if ($sno3_typ.equalsIgnoreCase(name)) {
			return sno3_typ();
		}
		if ($sno4_typ.equalsIgnoreCase(name)) {
			return sno4_typ();
		}
		if ($lot_exp_typ.equalsIgnoreCase(name)) {
			return lot_exp_typ();
		}
		if ($sublot_exp_typ.equalsIgnoreCase(name)) {
			return sublot_exp_typ();
		}
		if ($sno1_exp_typ.equalsIgnoreCase(name)) {
			return sno1_exp_typ();
		}
		if ($sno2_exp_typ.equalsIgnoreCase(name)) {
			return sno2_exp_typ();
		}
		if ($sno3_exp_typ.equalsIgnoreCase(name)) {
			return sno3_exp_typ();
		}
		if ($sno4_exp_typ.equalsIgnoreCase(name)) {
			return sno4_exp_typ();
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			return std_rnd_typ();
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			return amt_rnd_typ();
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			return ave_rnd_typ();
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			return adj_typ();
		}
		if ($wip_typ.equalsIgnoreCase(name)) {
			return wip_typ();
		}
		if ($bd_agg_typ.equalsIgnoreCase(name)) {
			return bd_agg_typ();
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			return mrgn_expns_cd();
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			return purc_expns_cd();
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			return out_expns_cd();
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			return inpt_expns_cd();
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			return ss_expns_cd();
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			return prov_expns_cd();
		}
		if ($exp_alloc_typ.equalsIgnoreCase(name)) {
			return exp_alloc_typ();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			return std_dec_place();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			return ave_dec_place();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			return calc_ptn_cd();
		}
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			return mfg_purc_typ();
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			return eval_typ();
		}
		if ($dpt_typ.equalsIgnoreCase(name)) {
			return dpt_typ();
		}
		if ($lot_typ.equalsIgnoreCase(name)) {
			return lot_typ();
		}
		if ($sublot_typ.equalsIgnoreCase(name)) {
			return sublot_typ();
		}
		if ($sno1_typ.equalsIgnoreCase(name)) {
			return sno1_typ();
		}
		if ($sno2_typ.equalsIgnoreCase(name)) {
			return sno2_typ();
		}
		if ($sno3_typ.equalsIgnoreCase(name)) {
			return sno3_typ();
		}
		if ($sno4_typ.equalsIgnoreCase(name)) {
			return sno4_typ();
		}
		if ($lot_exp_typ.equalsIgnoreCase(name)) {
			return lot_exp_typ();
		}
		if ($sublot_exp_typ.equalsIgnoreCase(name)) {
			return sublot_exp_typ();
		}
		if ($sno1_exp_typ.equalsIgnoreCase(name)) {
			return sno1_exp_typ();
		}
		if ($sno2_exp_typ.equalsIgnoreCase(name)) {
			return sno2_exp_typ();
		}
		if ($sno3_exp_typ.equalsIgnoreCase(name)) {
			return sno3_exp_typ();
		}
		if ($sno4_exp_typ.equalsIgnoreCase(name)) {
			return sno4_exp_typ();
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			return std_rnd_typ();
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			return amt_rnd_typ();
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			return ave_rnd_typ();
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			return adj_typ();
		}
		if ($wip_typ.equalsIgnoreCase(name)) {
			return wip_typ();
		}
		if ($bd_agg_typ.equalsIgnoreCase(name)) {
			return bd_agg_typ();
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			return mrgn_expns_cd();
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			return purc_expns_cd();
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			return out_expns_cd();
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			return inpt_expns_cd();
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			return ss_expns_cd();
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			return prov_expns_cd();
		}
		if ($exp_alloc_typ.equalsIgnoreCase(name)) {
			return exp_alloc_typ();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			return std_dec_place();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			return ave_dec_place();
		}
		return super.getNumberNE(name);
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
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			calc_ptn_cd(value);
			return;
		}
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			mfg_purc_typ(value);
			return;
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			eval_typ(value);
			return;
		}
		if ($dpt_typ.equalsIgnoreCase(name)) {
			dpt_typ(value);
			return;
		}
		if ($lot_typ.equalsIgnoreCase(name)) {
			lot_typ(value);
			return;
		}
		if ($sublot_typ.equalsIgnoreCase(name)) {
			sublot_typ(value);
			return;
		}
		if ($sno1_typ.equalsIgnoreCase(name)) {
			sno1_typ(value);
			return;
		}
		if ($sno2_typ.equalsIgnoreCase(name)) {
			sno2_typ(value);
			return;
		}
		if ($sno3_typ.equalsIgnoreCase(name)) {
			sno3_typ(value);
			return;
		}
		if ($sno4_typ.equalsIgnoreCase(name)) {
			sno4_typ(value);
			return;
		}
		if ($lot_exp_typ.equalsIgnoreCase(name)) {
			lot_exp_typ(value);
			return;
		}
		if ($sublot_exp_typ.equalsIgnoreCase(name)) {
			sublot_exp_typ(value);
			return;
		}
		if ($sno1_exp_typ.equalsIgnoreCase(name)) {
			sno1_exp_typ(value);
			return;
		}
		if ($sno2_exp_typ.equalsIgnoreCase(name)) {
			sno2_exp_typ(value);
			return;
		}
		if ($sno3_exp_typ.equalsIgnoreCase(name)) {
			sno3_exp_typ(value);
			return;
		}
		if ($sno4_exp_typ.equalsIgnoreCase(name)) {
			sno4_exp_typ(value);
			return;
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			std_rnd_typ(value);
			return;
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			amt_rnd_typ(value);
			return;
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			ave_rnd_typ(value);
			return;
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			adj_typ(value);
			return;
		}
		if ($wip_typ.equalsIgnoreCase(name)) {
			wip_typ(value);
			return;
		}
		if ($bd_agg_typ.equalsIgnoreCase(name)) {
			bd_agg_typ(value);
			return;
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			mrgn_expns_cd(value);
			return;
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			purc_expns_cd(value);
			return;
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			out_expns_cd(value);
			return;
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			inpt_expns_cd(value);
			return;
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			ss_expns_cd(value);
			return;
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			prov_expns_cd(value);
			return;
		}
		if ($exp_alloc_typ.equalsIgnoreCase(name)) {
			exp_alloc_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			calc_ptn_cd(value);
			return;
		}
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			mfg_purc_typ(value);
			return;
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			eval_typ(value);
			return;
		}
		if ($dpt_typ.equalsIgnoreCase(name)) {
			dpt_typ(value);
			return;
		}
		if ($lot_typ.equalsIgnoreCase(name)) {
			lot_typ(value);
			return;
		}
		if ($sublot_typ.equalsIgnoreCase(name)) {
			sublot_typ(value);
			return;
		}
		if ($sno1_typ.equalsIgnoreCase(name)) {
			sno1_typ(value);
			return;
		}
		if ($sno2_typ.equalsIgnoreCase(name)) {
			sno2_typ(value);
			return;
		}
		if ($sno3_typ.equalsIgnoreCase(name)) {
			sno3_typ(value);
			return;
		}
		if ($sno4_typ.equalsIgnoreCase(name)) {
			sno4_typ(value);
			return;
		}
		if ($lot_exp_typ.equalsIgnoreCase(name)) {
			lot_exp_typ(value);
			return;
		}
		if ($sublot_exp_typ.equalsIgnoreCase(name)) {
			sublot_exp_typ(value);
			return;
		}
		if ($sno1_exp_typ.equalsIgnoreCase(name)) {
			sno1_exp_typ(value);
			return;
		}
		if ($sno2_exp_typ.equalsIgnoreCase(name)) {
			sno2_exp_typ(value);
			return;
		}
		if ($sno3_exp_typ.equalsIgnoreCase(name)) {
			sno3_exp_typ(value);
			return;
		}
		if ($sno4_exp_typ.equalsIgnoreCase(name)) {
			sno4_exp_typ(value);
			return;
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			std_rnd_typ(value);
			return;
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			amt_rnd_typ(value);
			return;
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			ave_rnd_typ(value);
			return;
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			adj_typ(value);
			return;
		}
		if ($wip_typ.equalsIgnoreCase(name)) {
			wip_typ(value);
			return;
		}
		if ($bd_agg_typ.equalsIgnoreCase(name)) {
			bd_agg_typ(value);
			return;
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			mrgn_expns_cd(value);
			return;
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			purc_expns_cd(value);
			return;
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			out_expns_cd(value);
			return;
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			inpt_expns_cd(value);
			return;
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			ss_expns_cd(value);
			return;
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			prov_expns_cd(value);
			return;
		}
		if ($exp_alloc_typ.equalsIgnoreCase(name)) {
			exp_alloc_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
