package mcframe.serverMGBF.MGBFL0030;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Term master (Dummy for join) 期マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_term = "dummy_term";
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public static final String $calc_no = "calc_no";
	/**
	 * Month 対象年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public static final String $mng_dpt_cd = "mng_dpt_cd";
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public static final String $mng_dpt_nm = "mng_dpt_nm";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public static final String $asst_typ_nm = "asst_typ_nm";
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public static final String $qty = "qty";
	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public static final String $odr_qty = "odr_qty";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Purchase amount 購買金額.<p>
	 *
	 */
	public static final String $purc_amt = "purc_amt";
	/**
	 * Subcontracting cost 外注原価.<p>
	 *
	 */
	public static final String $out_cost = "out_cost";
	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public static final String $purc_upri = "purc_upri";
	/**
	 * Subcontracting cost unit price 外注原価単価.<p>
	 *
	 */
	public static final String $out_upri = "out_upri";
	/**
	 * Purchase unit price (Order) 購買単価（指図）.<p>
	 *
	 */
	public static final String $odr_purc_upri = "odr_purc_upri";
	/**
	 * Subcontracting cost unit price (Order) 外注原価単価（指図）.<p>
	 *
	 */
	public static final String $odr_out_upri = "odr_out_upri";
	/**
	 * Transaction unit price variance 取引単価差異.<p>
	 *
	 */
	public static final String $trd_upri_gap = "trd_upri_gap";
	/**
	 * Standard transaction unit price 標準取引単価.<p>
	 *
	 */
	public static final String $std_trd_upri = "std_trd_upri";
	/**
	 * Transaction unit price 取引単価.<p>
	 *
	 */
	public static final String $trd_upri = "trd_upri";
	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public static final String $trd_amt_gap = "trd_amt_gap";
	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public static final String $std_trd_amt = "std_trd_amt";
	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public static final String $trd_amt = "trd_amt";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_upri_dec_place = "trd_cur_upri_dec_place";
	/**
	 * Rate variance レート差異.<p>
	 *
	 */
	public static final String $xrate_gap = "xrate_gap";
	/**
	 * Standard exchange rate 標準為替レート.<p>
	 *
	 */
	public static final String $std_xrate = "std_xrate";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Subcontracting unit price variance 外注単価差異.<p>
	 *
	 */
	public static final String $out_unit_gap = "out_unit_gap";
	/**
	 * Standard subcontracting unit price 標準外注単価.<p>
	 *
	 */
	public static final String $std_out_unit = "std_out_unit";
	/**
	 * Subcontracting unit price 外注単価.<p>
	 *
	 */
	public static final String $out_unit = "out_unit";
	/**
	 * Purchase unit price variance 購買単価差異.<p>
	 *
	 */
	public static final String $purc_upri_gap = "purc_upri_gap";
	/**
	 * Standard purchase unit price 標準購買単価.<p>
	 *
	 */
	public static final String $std_purc_upri = "std_purc_upri";
	/**
	 * Subcontracting amount variance 外注金額差異.<p>
	 *
	 */
	public static final String $out_diff = "out_diff";
	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public static final String $upri_diff = "upri_diff";
	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public static final String $rate_diff = "rate_diff";
	/**
	 * Standard subcontracting amount 標準外注金額.<p>
	 *
	 */
	public static final String $std_out_amt = "std_out_amt";
	/**
	 * Subcontracting amount 外注金額.<p>
	 *
	 */
	public static final String $out_amt = "out_amt";
	/**
	 * Purchase amount variance 購買金額差異.<p>
	 *
	 */
	public static final String $purc_amt_gap = "purc_amt_gap";
	/**
	 * Standard purchase amount 標準購買金額.<p>
	 *
	 */
	public static final String $std_purc_amt = "std_purc_amt";
	/**
	 * Purchase cost variance 購買原価差異.<p>
	 *
	 */
	public static final String $purc_cost_gap = "purc_cost_gap";
	/**
	 * Standard purchase cost 標準購買原価.<p>
	 *
	 */
	public static final String $std_purc_cost = "std_purc_cost";
	/**
	 * Purchase cost 購買原価.<p>
	 *
	 */
	public static final String $ttl = "ttl";
	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public static final String $var_cost = "var_cost";
	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public static final String $fxd_cost = "fxd_cost";
	public static final String $col_000 = "col_000";
	public static final String $col_001 = "col_001";
	public static final String $col_002 = "col_002";
	public static final String $col_003 = "col_003";
	public static final String $col_004 = "col_004";
	public static final String $col_005 = "col_005";
	public static final String $col_006 = "col_006";
	public static final String $col_007 = "col_007";
	public static final String $col_008 = "col_008";
	public static final String $col_009 = "col_009";
	public static final String $col_010 = "col_010";
	public static final String $col_011 = "col_011";
	public static final String $col_012 = "col_012";
	public static final String $col_013 = "col_013";
	public static final String $col_014 = "col_014";
	public static final String $col_015 = "col_015";
	public static final String $col_016 = "col_016";
	public static final String $col_017 = "col_017";
	public static final String $col_018 = "col_018";
	public static final String $col_019 = "col_019";
	public static final String $col_020 = "col_020";
	public static final String $col_021 = "col_021";
	public static final String $col_022 = "col_022";
	public static final String $col_023 = "col_023";
	public static final String $col_024 = "col_024";
	public static final String $col_025 = "col_025";
	public static final String $col_026 = "col_026";
	public static final String $col_027 = "col_027";
	public static final String $col_028 = "col_028";
	public static final String $col_029 = "col_029";
	public static final String $col_030 = "col_030";
	public static final String $col_031 = "col_031";
	public static final String $col_032 = "col_032";
	public static final String $col_033 = "col_033";
	public static final String $col_034 = "col_034";
	public static final String $col_035 = "col_035";
	public static final String $col_036 = "col_036";
	public static final String $col_037 = "col_037";
	public static final String $col_038 = "col_038";
	public static final String $col_039 = "col_039";
	public static final String $col_040 = "col_040";
	public static final String $col_041 = "col_041";
	public static final String $col_042 = "col_042";
	public static final String $col_043 = "col_043";
	public static final String $col_044 = "col_044";
	public static final String $col_045 = "col_045";
	public static final String $col_046 = "col_046";
	public static final String $col_047 = "col_047";
	public static final String $col_048 = "col_048";
	public static final String $col_049 = "col_049";
	public static final String $col_050 = "col_050";
	public static final String $col_051 = "col_051";
	public static final String $col_052 = "col_052";
	public static final String $col_053 = "col_053";
	public static final String $col_054 = "col_054";
	public static final String $col_055 = "col_055";
	public static final String $col_056 = "col_056";
	public static final String $col_057 = "col_057";
	public static final String $col_058 = "col_058";
	public static final String $col_059 = "col_059";
	public static final String $col_060 = "col_060";
	public static final String $col_061 = "col_061";
	public static final String $col_062 = "col_062";
	public static final String $col_063 = "col_063";
	public static final String $col_064 = "col_064";
	public static final String $col_065 = "col_065";
	public static final String $col_066 = "col_066";
	public static final String $col_067 = "col_067";
	public static final String $col_068 = "col_068";
	public static final String $col_069 = "col_069";
	public static final String $col_070 = "col_070";
	public static final String $col_071 = "col_071";
	public static final String $col_072 = "col_072";
	public static final String $col_073 = "col_073";
	public static final String $col_074 = "col_074";
	public static final String $col_075 = "col_075";
	public static final String $col_076 = "col_076";
	public static final String $col_077 = "col_077";
	public static final String $col_078 = "col_078";
	public static final String $col_079 = "col_079";
	public static final String $col_080 = "col_080";
	public static final String $col_081 = "col_081";
	public static final String $col_082 = "col_082";
	public static final String $col_083 = "col_083";
	public static final String $col_084 = "col_084";
	public static final String $col_085 = "col_085";
	public static final String $col_086 = "col_086";
	public static final String $col_087 = "col_087";
	public static final String $col_088 = "col_088";
	public static final String $col_089 = "col_089";
	public static final String $col_090 = "col_090";
	public static final String $col_091 = "col_091";
	public static final String $col_092 = "col_092";
	public static final String $col_093 = "col_093";
	public static final String $col_094 = "col_094";
	public static final String $col_095 = "col_095";
	public static final String $col_096 = "col_096";
	public static final String $col_097 = "col_097";
	public static final String $col_098 = "col_098";
	public static final String $col_099 = "col_099";
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $itm_grp_cd1 = "itm_grp_cd1";
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public static final String $itm_grp_nm1 = "itm_grp_nm1";
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $itm_grp_cd2 = "itm_grp_cd2";
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public static final String $itm_grp_nm2 = "itm_grp_nm2";
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $itm_grp_cd3 = "itm_grp_cd3";
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public static final String $itm_grp_nm3 = "itm_grp_nm3";
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $itm_grp_cd4 = "itm_grp_cd4";
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public static final String $itm_grp_nm4 = "itm_grp_nm4";
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $itm_grp_cd5 = "itm_grp_cd5";
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public static final String $itm_grp_nm5 = "itm_grp_nm5";
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $itm_grp_cd6 = "itm_grp_cd6";
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public static final String $itm_grp_nm6 = "itm_grp_nm6";
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $itm_grp_cd7 = "itm_grp_cd7";
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public static final String $itm_grp_nm7 = "itm_grp_nm7";
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $itm_grp_cd8 = "itm_grp_cd8";
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public static final String $itm_grp_nm8 = "itm_grp_nm8";
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $itm_grp_cd9 = "itm_grp_cd9";
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public static final String $itm_grp_nm9 = "itm_grp_nm9";
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public static final String $itm_grp_nm10 = "itm_grp_nm10";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	/**
	 * Country name 国名.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public static final String $area_cd = "area_cd";
	/**
	 * Region name 地域名.<p>
	 *
	 */
	public static final String $area_nm = "area_nm";
	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public static final String $bp_grp_cd1 = "bp_grp_cd1";
	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public static final String $bp_grp_nm1 = "bp_grp_nm1";
	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public static final String $bp_grp_cd2 = "bp_grp_cd2";
	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public static final String $bp_grp_nm2 = "bp_grp_nm2";
	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public static final String $bp_grp_cd3 = "bp_grp_cd3";
	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public static final String $bp_grp_nm3 = "bp_grp_nm3";
	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public static final String $bp_grp_cd4 = "bp_grp_cd4";
	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public static final String $bp_grp_nm4 = "bp_grp_nm4";
	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public static final String $bp_grp_cd5 = "bp_grp_cd5";
	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public static final String $bp_grp_nm5 = "bp_grp_nm5";
	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public static final String $bp_grp_cd6 = "bp_grp_cd6";
	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public static final String $bp_grp_nm6 = "bp_grp_nm6";
	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public static final String $bp_grp_cd7 = "bp_grp_cd7";
	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public static final String $bp_grp_nm7 = "bp_grp_nm7";
	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public static final String $bp_grp_cd8 = "bp_grp_cd8";
	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public static final String $bp_grp_nm8 = "bp_grp_nm8";
	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public static final String $bp_grp_cd9 = "bp_grp_cd9";
	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public static final String $bp_grp_nm9 = "bp_grp_nm9";
	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $bp_grp_cd10 = "bp_grp_cd10";
	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public static final String $bp_grp_nm10 = "bp_grp_nm10";


	public static final MCMeta dummy_term_META = createCommonMeta($dummy_term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta odr_qty_META = createCommonMeta($odr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta purc_amt_META = createCommonMeta($purc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta out_cost_META = createCommonMeta($out_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_upri_META = createCommonMeta($purc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta out_upri_META = createCommonMeta($out_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta odr_purc_upri_META = createCommonMeta($odr_purc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta odr_out_upri_META = createCommonMeta($odr_out_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_upri_gap_META = createCommonMeta($trd_upri_gap, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_trd_upri_META = createCommonMeta($std_trd_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_upri_META = createCommonMeta($trd_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_amt_gap_META = createCommonMeta($trd_amt_gap, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_trd_amt_META = createCommonMeta($std_trd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_amt_META = createCommonMeta($trd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_upri_dec_place_META = createCommonMeta($trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta xrate_gap_META = createCommonMeta($xrate_gap, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_xrate_META = createCommonMeta($std_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta out_unit_gap_META = createCommonMeta($out_unit_gap, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_out_unit_META = createCommonMeta($std_out_unit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta out_unit_META = createCommonMeta($out_unit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_upri_gap_META = createCommonMeta($purc_upri_gap, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_purc_upri_META = createCommonMeta($std_purc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta out_diff_META = createCommonMeta($out_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri_diff_META = createCommonMeta($upri_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rate_diff_META = createCommonMeta($rate_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_out_amt_META = createCommonMeta($std_out_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta out_amt_META = createCommonMeta($out_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_amt_gap_META = createCommonMeta($purc_amt_gap, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_purc_amt_META = createCommonMeta($std_purc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_cost_gap_META = createCommonMeta($purc_cost_gap, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_purc_cost_META = createCommonMeta($std_purc_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_META = createCommonMeta($ttl, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta var_cost_META = createCommonMeta($var_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta fxd_cost_META = createCommonMeta($fxd_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_000_META = createCommonMeta($col_000, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_001_META = createCommonMeta($col_001, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_002_META = createCommonMeta($col_002, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_003_META = createCommonMeta($col_003, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_004_META = createCommonMeta($col_004, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_005_META = createCommonMeta($col_005, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_006_META = createCommonMeta($col_006, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_007_META = createCommonMeta($col_007, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_008_META = createCommonMeta($col_008, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_009_META = createCommonMeta($col_009, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_010_META = createCommonMeta($col_010, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_011_META = createCommonMeta($col_011, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_012_META = createCommonMeta($col_012, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_013_META = createCommonMeta($col_013, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_014_META = createCommonMeta($col_014, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_015_META = createCommonMeta($col_015, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_016_META = createCommonMeta($col_016, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_017_META = createCommonMeta($col_017, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_018_META = createCommonMeta($col_018, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_019_META = createCommonMeta($col_019, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_020_META = createCommonMeta($col_020, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_021_META = createCommonMeta($col_021, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_022_META = createCommonMeta($col_022, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_023_META = createCommonMeta($col_023, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_024_META = createCommonMeta($col_024, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_025_META = createCommonMeta($col_025, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_026_META = createCommonMeta($col_026, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_027_META = createCommonMeta($col_027, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_028_META = createCommonMeta($col_028, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_029_META = createCommonMeta($col_029, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_030_META = createCommonMeta($col_030, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_031_META = createCommonMeta($col_031, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_032_META = createCommonMeta($col_032, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_033_META = createCommonMeta($col_033, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_034_META = createCommonMeta($col_034, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_035_META = createCommonMeta($col_035, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_036_META = createCommonMeta($col_036, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_037_META = createCommonMeta($col_037, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_038_META = createCommonMeta($col_038, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_039_META = createCommonMeta($col_039, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_040_META = createCommonMeta($col_040, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_041_META = createCommonMeta($col_041, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_042_META = createCommonMeta($col_042, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_043_META = createCommonMeta($col_043, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_044_META = createCommonMeta($col_044, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_045_META = createCommonMeta($col_045, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_046_META = createCommonMeta($col_046, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_047_META = createCommonMeta($col_047, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_048_META = createCommonMeta($col_048, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_049_META = createCommonMeta($col_049, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_050_META = createCommonMeta($col_050, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_051_META = createCommonMeta($col_051, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_052_META = createCommonMeta($col_052, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_053_META = createCommonMeta($col_053, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_054_META = createCommonMeta($col_054, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_055_META = createCommonMeta($col_055, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_056_META = createCommonMeta($col_056, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_057_META = createCommonMeta($col_057, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_058_META = createCommonMeta($col_058, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_059_META = createCommonMeta($col_059, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_060_META = createCommonMeta($col_060, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_061_META = createCommonMeta($col_061, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_062_META = createCommonMeta($col_062, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_063_META = createCommonMeta($col_063, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_064_META = createCommonMeta($col_064, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_065_META = createCommonMeta($col_065, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_066_META = createCommonMeta($col_066, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_067_META = createCommonMeta($col_067, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_068_META = createCommonMeta($col_068, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_069_META = createCommonMeta($col_069, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_070_META = createCommonMeta($col_070, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_071_META = createCommonMeta($col_071, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_072_META = createCommonMeta($col_072, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_073_META = createCommonMeta($col_073, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_074_META = createCommonMeta($col_074, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_075_META = createCommonMeta($col_075, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_076_META = createCommonMeta($col_076, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_077_META = createCommonMeta($col_077, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_078_META = createCommonMeta($col_078, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_079_META = createCommonMeta($col_079, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_080_META = createCommonMeta($col_080, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_081_META = createCommonMeta($col_081, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_082_META = createCommonMeta($col_082, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_083_META = createCommonMeta($col_083, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_084_META = createCommonMeta($col_084, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_085_META = createCommonMeta($col_085, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_086_META = createCommonMeta($col_086, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_087_META = createCommonMeta($col_087, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_088_META = createCommonMeta($col_088, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_089_META = createCommonMeta($col_089, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_090_META = createCommonMeta($col_090, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_091_META = createCommonMeta($col_091, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_092_META = createCommonMeta($col_092, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_093_META = createCommonMeta($col_093, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_094_META = createCommonMeta($col_094, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_095_META = createCommonMeta($col_095, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_096_META = createCommonMeta($col_096, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_097_META = createCommonMeta($col_097, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_098_META = createCommonMeta($col_098, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_099_META = createCommonMeta($col_099, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta area_cd_META = createCommonMeta($area_cd, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta area_nm_META = createCommonMeta($area_nm, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta bp_grp_cd1_META = createCommonMeta($bp_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm1_META = createCommonMeta($bp_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd2_META = createCommonMeta($bp_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm2_META = createCommonMeta($bp_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd3_META = createCommonMeta($bp_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm3_META = createCommonMeta($bp_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd4_META = createCommonMeta($bp_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm4_META = createCommonMeta($bp_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd5_META = createCommonMeta($bp_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm5_META = createCommonMeta($bp_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd6_META = createCommonMeta($bp_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm6_META = createCommonMeta($bp_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd7_META = createCommonMeta($bp_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm7_META = createCommonMeta($bp_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd8_META = createCommonMeta($bp_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm8_META = createCommonMeta($bp_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd9_META = createCommonMeta($bp_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm9_META = createCommonMeta($bp_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd10_META = createCommonMeta($bp_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm10_META = createCommonMeta($bp_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dummy_term_META,
			calc_grp_cd_META,
			calc_no_META,
			ym_META,
			wg_cd_META,
			wg_nm_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			itm_mfg_inst_no_META,
			mfg_act_no_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			bp_cd_META,
			bp_nm_META,
			po_no_META,
			slo_no_META,
			iv_no_META,
			asst_typ_META,
			asst_typ_nm_META,
			qty_META,
			odr_qty_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			purc_amt_META,
			out_cost_META,
			purc_upri_META,
			out_upri_META,
			odr_purc_upri_META,
			odr_out_upri_META,
			trd_upri_gap_META,
			std_trd_upri_META,
			trd_upri_META,
			trd_amt_gap_META,
			std_trd_amt_META,
			trd_amt_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_cur_amt_dec_place_META,
			trd_cur_upri_dec_place_META,
			xrate_gap_META,
			std_xrate_META,
			xrate_META,
			out_unit_gap_META,
			std_out_unit_META,
			out_unit_META,
			purc_upri_gap_META,
			std_purc_upri_META,
			out_diff_META,
			upri_diff_META,
			rate_diff_META,
			std_out_amt_META,
			out_amt_META,
			purc_amt_gap_META,
			std_purc_amt_META,
			purc_cost_gap_META,
			std_purc_cost_META,
			ttl_META,
			var_cost_META,
			fxd_cost_META,
			col_000_META,
			col_001_META,
			col_002_META,
			col_003_META,
			col_004_META,
			col_005_META,
			col_006_META,
			col_007_META,
			col_008_META,
			col_009_META,
			col_010_META,
			col_011_META,
			col_012_META,
			col_013_META,
			col_014_META,
			col_015_META,
			col_016_META,
			col_017_META,
			col_018_META,
			col_019_META,
			col_020_META,
			col_021_META,
			col_022_META,
			col_023_META,
			col_024_META,
			col_025_META,
			col_026_META,
			col_027_META,
			col_028_META,
			col_029_META,
			col_030_META,
			col_031_META,
			col_032_META,
			col_033_META,
			col_034_META,
			col_035_META,
			col_036_META,
			col_037_META,
			col_038_META,
			col_039_META,
			col_040_META,
			col_041_META,
			col_042_META,
			col_043_META,
			col_044_META,
			col_045_META,
			col_046_META,
			col_047_META,
			col_048_META,
			col_049_META,
			col_050_META,
			col_051_META,
			col_052_META,
			col_053_META,
			col_054_META,
			col_055_META,
			col_056_META,
			col_057_META,
			col_058_META,
			col_059_META,
			col_060_META,
			col_061_META,
			col_062_META,
			col_063_META,
			col_064_META,
			col_065_META,
			col_066_META,
			col_067_META,
			col_068_META,
			col_069_META,
			col_070_META,
			col_071_META,
			col_072_META,
			col_073_META,
			col_074_META,
			col_075_META,
			col_076_META,
			col_077_META,
			col_078_META,
			col_079_META,
			col_080_META,
			col_081_META,
			col_082_META,
			col_083_META,
			col_084_META,
			col_085_META,
			col_086_META,
			col_087_META,
			col_088_META,
			col_089_META,
			col_090_META,
			col_091_META,
			col_092_META,
			col_093_META,
			col_094_META,
			col_095_META,
			col_096_META,
			col_097_META,
			col_098_META,
			col_099_META,
			itm_grp_cd1_META,
			itm_grp_nm1_META,
			itm_grp_cd2_META,
			itm_grp_nm2_META,
			itm_grp_cd3_META,
			itm_grp_nm3_META,
			itm_grp_cd4_META,
			itm_grp_nm4_META,
			itm_grp_cd5_META,
			itm_grp_nm5_META,
			itm_grp_cd6_META,
			itm_grp_nm6_META,
			itm_grp_cd7_META,
			itm_grp_nm7_META,
			itm_grp_cd8_META,
			itm_grp_nm8_META,
			itm_grp_cd9_META,
			itm_grp_nm9_META,
			itm_grp_cd10_META,
			itm_grp_nm10_META,
			cntry_cd_META,
			cntry_nm_META,
			area_cd_META,
			area_nm_META,
			bp_grp_cd1_META,
			bp_grp_nm1_META,
			bp_grp_cd2_META,
			bp_grp_nm2_META,
			bp_grp_cd3_META,
			bp_grp_nm3_META,
			bp_grp_cd4_META,
			bp_grp_nm4_META,
			bp_grp_cd5_META,
			bp_grp_nm5_META,
			bp_grp_cd6_META,
			bp_grp_nm6_META,
			bp_grp_cd7_META,
			bp_grp_nm7_META,
			bp_grp_cd8_META,
			bp_grp_nm8_META,
			bp_grp_cd9_META,
			bp_grp_nm9_META,
			bp_grp_cd10_META,
			bp_grp_nm10_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[FLG_COL]のキー定数 */
	public static final String $$FLG_COL = "FLG_COL";
	/** 項目属性情報のグループ[COL_SQL]のキー定数 */
	public static final String $$COL_SQL = "COL_SQL";
	/** 項目属性情報のグループ[SUM_SQL]のキー定数 */
	public static final String $$SUM_SQL = "SUM_SQL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$itm_typ, "MAC_ITM_TYP"},	// itm_typ
				{$asst_typ, "MAC_ASST_TYP"}	// asst_typ
			}
		)),
		new MCExtMap.Entry($$FLG_COL, new MCExtList(
			new String[][]{
				{$wg_cd, "wg_flg"},	// wg_cd
				{$wg_nm, "wg_flg"},	// wg_nm
				{$mng_dpt_cd, "mng_dpt_flg"},	// mng_dpt_cd
				{$mng_dpt_nm, "mng_dpt_flg"},	// mng_dpt_nm
				{$itm_cd, "itm_flg"},	// itm_cd
				{$itm_sub1, "itm_flg"},	// itm_sub1
				{$itm_sub2, "itm_flg"},	// itm_sub2
				{$itm_sub3, "itm_flg"},	// itm_sub3
				{$itm_nm, "itm_flg"},	// itm_nm
				{$itm_typ, "itm_typ_flg"},	// itm_typ
				{$itm_typ_nm, "itm_typ_flg"},	// itm_typ_nm
				{$itm_typ_d_cd, "itm_typ_d_flg"},	// itm_typ_d_cd
				{$itm_typ_d_nm, "itm_typ_d_flg"},	// itm_typ_d_nm
				{$itm_jnl_cd, "itm_jnl_flg"},	// itm_jnl_cd
				{$itm_jnl_nm, "itm_jnl_flg"},	// itm_jnl_nm
				{$itm_mfg_inst_no, "itm_mfg_inst_flg"},	// itm_mfg_inst_no
				{$mfg_act_no, "mfg_act_flg"},	// mfg_act_no
				{$lot_no, "lot_flg"},	// lot_no
				{$sublot_no, "sublot_flg"},	// sublot_no
				{$sno1, "sno1_flg"},	// sno1
				{$sno2, "sno2_flg"},	// sno2
				{$sno3, "sno3_flg"},	// sno3
				{$sno4, "sno4_flg"},	// sno4
				{$bp_cd, "bp_flg"},	// bp_cd
				{$bp_nm, "bp_flg"},	// bp_nm
				{$po_no, "po_no_flg"},	// po_no
				{$slo_no, "slo_no_flg"},	// slo_no
				{$iv_no, "iv_no_flg"},	// iv_no
				{$asst_typ, "asst_typ_flg"},	// asst_typ
				{$unit_cd, "itm_flg"},	// unit_cd
				{$unit_nm, "itm_flg"},	// unit_nm
				{$dec_place, "itm_flg"},	// dec_place
				{$trd_cur_cd, "trd_cur_flg"},	// trd_cur_cd
				{$trd_cur_nm, "trd_cur_flg"},	// trd_cur_nm
				{$trd_cur_amt_dec_place, "trd_cur_flg"},	// trd_cur_amt_dec_place
				{$trd_cur_upri_dec_place, "trd_cur_flg"},	// trd_cur_upri_dec_place
				{$std_xrate, "xrate_flg"},	// std_xrate
				{$xrate, "xrate_flg"}	// xrate
			}
		)),
		new MCExtMap.Entry($$COL_SQL, new MCExtList(
			new String[][]{
				{$calc_grp_cd, "T.CALC_GRP_CD"},	// calc_grp_cd
				{$calc_no, "T.CALC_NO"},	// calc_no
				{$ym, "T.YM"},	// ym
				{$wg_cd, "T.WG_CD"},	// wg_cd
				{$wg_nm, "T.WG_NM"},	// wg_nm
				{$mng_dpt_cd, "T.MNG_DPT_CD"},	// mng_dpt_cd
				{$mng_dpt_nm, "MNG_DPT.DPT_NM"},	// mng_dpt_nm
				{$itm_cd, "T.ITM_CD"},	// itm_cd
				{$itm_sub1, "T.ITM_SUB1"},	// itm_sub1
				{$itm_sub2, "T.ITM_SUB2"},	// itm_sub2
				{$itm_sub3, "T.ITM_SUB3"},	// itm_sub3
				{$itm_nm, "NVL(SUNDRY_ITM.ITM_NM, ITM.ITM_NM)"},	// itm_nm
				{$itm_typ, "ITM.ITM_TYP"},	// itm_typ
				{$itm_typ_d_cd, "ITM.ITM_TYP_D_CD"},	// itm_typ_d_cd
				{$itm_typ_d_nm, "ITM_TYP_D.ITM_TYP_D_NM"},	// itm_typ_d_nm
				{$itm_jnl_cd, "ITM.ITM_JNL_CD"},	// itm_jnl_cd
				{$itm_jnl_nm, "ITM_JNL.ITM_JNL_NM"},	// itm_jnl_nm
				{$itm_mfg_inst_no, "T.ITM_MFG_INST_NO"},	// itm_mfg_inst_no
				{$mfg_act_no, "T.MFG_ACT_NO"},	// mfg_act_no
				{$lot_no, "T.LOT_NO"},	// lot_no
				{$sublot_no, "T.SUBLOT_NO"},	// sublot_no
				{$sno1, "T.SNO1"},	// sno1
				{$sno2, "T.SNO2"},	// sno2
				{$sno3, "T.SNO3"},	// sno3
				{$sno4, "T.SNO4"},	// sno4
				{$bp_cd, "T.BP_CD"},	// bp_cd
				{$bp_nm, "BP.BP_NM"},	// bp_nm
				{$po_no, "T.PO_NO"},	// po_no
				{$slo_no, "T.SLO_NO"},	// slo_no
				{$iv_no, "T.IV_NO"},	// iv_no
				{$asst_typ, "T.ASST_TYP"},	// asst_typ
				{$unit_cd, "ITM.UNIT_CD"},	// unit_cd
				{$unit_nm, "UNIT.UNIT_NM"},	// unit_nm
				{$dec_place, "ITM.DEC_PLACE"},	// dec_place
				{$trd_cur_cd, "T.TRD_CUR_CD"},	// trd_cur_cd
				{$trd_cur_nm, "TRD_CUR.CUR_NM"},	// trd_cur_nm
				{$trd_cur_amt_dec_place, "TRD_CUR.AMT_DEC_PLACE"},	// trd_cur_amt_dec_place
				{$trd_cur_upri_dec_place, "TRD_CUR.UPRI_DEC_PLACE"},	// trd_cur_upri_dec_place
				{$std_xrate, "T.STD_XRATE"},	// std_xrate
				{$xrate, "T.XRATE"}	// xrate
			}
		)),
		new MCExtMap.Entry($$SUM_SQL, new MCExtList(
			new String[][]{
				{$std_purc_cost, "NVL(SUM(T.STD_COST),0)"},	// std_purc_cost
				{$ttl, "NVL(SUM(T.ACT_COST),0)"},	// ttl
				{$var_cost, "NVL(SUM(DECODE(T.VAR_TYP,MAC_VAR_TYP.VAR,T.ACT_COST,0)),0)"},	// var_cost
				{$fxd_cost, "NVL(SUM(DECODE(T.VAR_TYP,MAC_VAR_TYP.FXD,T.ACT_COST,0)),0)"},	// fxd_cost
				{$col_000, "CUSTOM_SUM_COL"},	// col_000
				{$col_001, "CUSTOM_SUM_COL"},	// col_001
				{$col_002, "CUSTOM_SUM_COL"},	// col_002
				{$col_003, "CUSTOM_SUM_COL"},	// col_003
				{$col_004, "CUSTOM_SUM_COL"},	// col_004
				{$col_005, "CUSTOM_SUM_COL"},	// col_005
				{$col_006, "CUSTOM_SUM_COL"},	// col_006
				{$col_007, "CUSTOM_SUM_COL"},	// col_007
				{$col_008, "CUSTOM_SUM_COL"},	// col_008
				{$col_009, "CUSTOM_SUM_COL"},	// col_009
				{$col_010, "CUSTOM_SUM_COL"},	// col_010
				{$col_011, "CUSTOM_SUM_COL"},	// col_011
				{$col_012, "CUSTOM_SUM_COL"},	// col_012
				{$col_013, "CUSTOM_SUM_COL"},	// col_013
				{$col_014, "CUSTOM_SUM_COL"},	// col_014
				{$col_015, "CUSTOM_SUM_COL"},	// col_015
				{$col_016, "CUSTOM_SUM_COL"},	// col_016
				{$col_017, "CUSTOM_SUM_COL"},	// col_017
				{$col_018, "CUSTOM_SUM_COL"},	// col_018
				{$col_019, "CUSTOM_SUM_COL"},	// col_019
				{$col_020, "CUSTOM_SUM_COL"},	// col_020
				{$col_021, "CUSTOM_SUM_COL"},	// col_021
				{$col_022, "CUSTOM_SUM_COL"},	// col_022
				{$col_023, "CUSTOM_SUM_COL"},	// col_023
				{$col_024, "CUSTOM_SUM_COL"},	// col_024
				{$col_025, "CUSTOM_SUM_COL"},	// col_025
				{$col_026, "CUSTOM_SUM_COL"},	// col_026
				{$col_027, "CUSTOM_SUM_COL"},	// col_027
				{$col_028, "CUSTOM_SUM_COL"},	// col_028
				{$col_029, "CUSTOM_SUM_COL"},	// col_029
				{$col_030, "CUSTOM_SUM_COL"},	// col_030
				{$col_031, "CUSTOM_SUM_COL"},	// col_031
				{$col_032, "CUSTOM_SUM_COL"},	// col_032
				{$col_033, "CUSTOM_SUM_COL"},	// col_033
				{$col_034, "CUSTOM_SUM_COL"},	// col_034
				{$col_035, "CUSTOM_SUM_COL"},	// col_035
				{$col_036, "CUSTOM_SUM_COL"},	// col_036
				{$col_037, "CUSTOM_SUM_COL"},	// col_037
				{$col_038, "CUSTOM_SUM_COL"},	// col_038
				{$col_039, "CUSTOM_SUM_COL"},	// col_039
				{$col_040, "CUSTOM_SUM_COL"},	// col_040
				{$col_041, "CUSTOM_SUM_COL"},	// col_041
				{$col_042, "CUSTOM_SUM_COL"},	// col_042
				{$col_043, "CUSTOM_SUM_COL"},	// col_043
				{$col_044, "CUSTOM_SUM_COL"},	// col_044
				{$col_045, "CUSTOM_SUM_COL"},	// col_045
				{$col_046, "CUSTOM_SUM_COL"},	// col_046
				{$col_047, "CUSTOM_SUM_COL"},	// col_047
				{$col_048, "CUSTOM_SUM_COL"},	// col_048
				{$col_049, "CUSTOM_SUM_COL"},	// col_049
				{$col_050, "CUSTOM_SUM_COL"},	// col_050
				{$col_051, "CUSTOM_SUM_COL"},	// col_051
				{$col_052, "CUSTOM_SUM_COL"},	// col_052
				{$col_053, "CUSTOM_SUM_COL"},	// col_053
				{$col_054, "CUSTOM_SUM_COL"},	// col_054
				{$col_055, "CUSTOM_SUM_COL"},	// col_055
				{$col_056, "CUSTOM_SUM_COL"},	// col_056
				{$col_057, "CUSTOM_SUM_COL"},	// col_057
				{$col_058, "CUSTOM_SUM_COL"},	// col_058
				{$col_059, "CUSTOM_SUM_COL"},	// col_059
				{$col_060, "CUSTOM_SUM_COL"},	// col_060
				{$col_061, "CUSTOM_SUM_COL"},	// col_061
				{$col_062, "CUSTOM_SUM_COL"},	// col_062
				{$col_063, "CUSTOM_SUM_COL"},	// col_063
				{$col_064, "CUSTOM_SUM_COL"},	// col_064
				{$col_065, "CUSTOM_SUM_COL"},	// col_065
				{$col_066, "CUSTOM_SUM_COL"},	// col_066
				{$col_067, "CUSTOM_SUM_COL"},	// col_067
				{$col_068, "CUSTOM_SUM_COL"},	// col_068
				{$col_069, "CUSTOM_SUM_COL"},	// col_069
				{$col_070, "CUSTOM_SUM_COL"},	// col_070
				{$col_071, "CUSTOM_SUM_COL"},	// col_071
				{$col_072, "CUSTOM_SUM_COL"},	// col_072
				{$col_073, "CUSTOM_SUM_COL"},	// col_073
				{$col_074, "CUSTOM_SUM_COL"},	// col_074
				{$col_075, "CUSTOM_SUM_COL"},	// col_075
				{$col_076, "CUSTOM_SUM_COL"},	// col_076
				{$col_077, "CUSTOM_SUM_COL"},	// col_077
				{$col_078, "CUSTOM_SUM_COL"},	// col_078
				{$col_079, "CUSTOM_SUM_COL"},	// col_079
				{$col_080, "CUSTOM_SUM_COL"},	// col_080
				{$col_081, "CUSTOM_SUM_COL"},	// col_081
				{$col_082, "CUSTOM_SUM_COL"},	// col_082
				{$col_083, "CUSTOM_SUM_COL"},	// col_083
				{$col_084, "CUSTOM_SUM_COL"},	// col_084
				{$col_085, "CUSTOM_SUM_COL"},	// col_085
				{$col_086, "CUSTOM_SUM_COL"},	// col_086
				{$col_087, "CUSTOM_SUM_COL"},	// col_087
				{$col_088, "CUSTOM_SUM_COL"},	// col_088
				{$col_089, "CUSTOM_SUM_COL"},	// col_089
				{$col_090, "CUSTOM_SUM_COL"},	// col_090
				{$col_091, "CUSTOM_SUM_COL"},	// col_091
				{$col_092, "CUSTOM_SUM_COL"},	// col_092
				{$col_093, "CUSTOM_SUM_COL"},	// col_093
				{$col_094, "CUSTOM_SUM_COL"},	// col_094
				{$col_095, "CUSTOM_SUM_COL"},	// col_095
				{$col_096, "CUSTOM_SUM_COL"},	// col_096
				{$col_097, "CUSTOM_SUM_COL"},	// col_097
				{$col_098, "CUSTOM_SUM_COL"},	// col_098
				{$col_099, "CUSTOM_SUM_COL"}	// col_099
			}
		))
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Term master (Dummy for join) 期マスタ（結合用ダミー）.<p>
	 *
	 */
	public MCDate dummy_term() {
		return getConstDate(offset + 0, $dummy_term);
	}

	/**
	 * Term master (Dummy for join) 期マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_term(MCDate value) {
		setConstDate(offset + 0, $dummy_term, value);
	}


	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 1, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 1, $calc_grp_cd, value);
	}


	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 2, $calc_no);
	}

	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 2, $calc_no, value);
	}


	/**
	 * Month 対象年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 3, $ym);
	}

	/**
	 * Month 対象年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 3, $ym, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 4, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 4, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 5, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 5, $wg_nm, value);
	}


	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 6, $mng_dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 6, $mng_dpt_cd, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 7, $mng_dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 7, $mng_dpt_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 8, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 8, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 9, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 9, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 10, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 10, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 11, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 11, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 12, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 12, $itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 13, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 13, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 14, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 14, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 15, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 15, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 16, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 16, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 17, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 17, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 18, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 18, $itm_jnl_nm, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 19, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 19, $itm_mfg_inst_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 20, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 20, $mfg_act_no, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 21, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 21, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 22, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 22, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 23, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 23, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 24, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 24, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 25, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 25, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 26, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 26, $sno4, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 27, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 27, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 28, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 28, $bp_nm, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 29, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 29, $po_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 30, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 30, $slo_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 31, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 31, $iv_no, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 32, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 32, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 33, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 33, $asst_typ_nm, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 34, $qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 34, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 34, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 34, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 34, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 34, $qty, value);
	}


	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public MCNumber odr_qty() {
		return getConstNumber(offset + 35, $odr_qty);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void odr_qty(MCNumber value) {
		setConstNumber(offset + 35, $odr_qty, value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void odr_qty(int value) {
		setConstNumber(offset + 35, $odr_qty, value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void odr_qty(long value) {
		setConstNumber(offset + 35, $odr_qty, value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void odr_qty(float value) {
		setConstNumber(offset + 35, $odr_qty, value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void odr_qty(double value) {
		setConstNumber(offset + 35, $odr_qty, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 36, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 36, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 37, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 37, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 38, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 38, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 38, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 38, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 38, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 38, $dec_place, value);
	}


	/**
	 * Purchase amount 購買金額.<p>
	 *
	 */
	public MCNumber purc_amt() {
		return getConstNumber(offset + 39, $purc_amt);
	}

	/**
	 * Purchase amount 購買金額.<p>
	 *
	 */
	public void purc_amt(MCNumber value) {
		setConstNumber(offset + 39, $purc_amt, value);
	}

	/**
	 * Purchase amount 購買金額.<p>
	 *
	 */
	public void purc_amt(int value) {
		setConstNumber(offset + 39, $purc_amt, value);
	}

	/**
	 * Purchase amount 購買金額.<p>
	 *
	 */
	public void purc_amt(long value) {
		setConstNumber(offset + 39, $purc_amt, value);
	}

	/**
	 * Purchase amount 購買金額.<p>
	 *
	 */
	public void purc_amt(float value) {
		setConstNumber(offset + 39, $purc_amt, value);
	}

	/**
	 * Purchase amount 購買金額.<p>
	 *
	 */
	public void purc_amt(double value) {
		setConstNumber(offset + 39, $purc_amt, value);
	}


	/**
	 * Subcontracting cost 外注原価.<p>
	 *
	 */
	public MCNumber out_cost() {
		return getConstNumber(offset + 40, $out_cost);
	}

	/**
	 * Subcontracting cost 外注原価.<p>
	 *
	 */
	public void out_cost(MCNumber value) {
		setConstNumber(offset + 40, $out_cost, value);
	}

	/**
	 * Subcontracting cost 外注原価.<p>
	 *
	 */
	public void out_cost(int value) {
		setConstNumber(offset + 40, $out_cost, value);
	}

	/**
	 * Subcontracting cost 外注原価.<p>
	 *
	 */
	public void out_cost(long value) {
		setConstNumber(offset + 40, $out_cost, value);
	}

	/**
	 * Subcontracting cost 外注原価.<p>
	 *
	 */
	public void out_cost(float value) {
		setConstNumber(offset + 40, $out_cost, value);
	}

	/**
	 * Subcontracting cost 外注原価.<p>
	 *
	 */
	public void out_cost(double value) {
		setConstNumber(offset + 40, $out_cost, value);
	}


	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public MCNumber purc_upri() {
		return getConstNumber(offset + 41, $purc_upri);
	}

	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public void purc_upri(MCNumber value) {
		setConstNumber(offset + 41, $purc_upri, value);
	}

	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public void purc_upri(int value) {
		setConstNumber(offset + 41, $purc_upri, value);
	}

	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public void purc_upri(long value) {
		setConstNumber(offset + 41, $purc_upri, value);
	}

	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public void purc_upri(float value) {
		setConstNumber(offset + 41, $purc_upri, value);
	}

	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public void purc_upri(double value) {
		setConstNumber(offset + 41, $purc_upri, value);
	}


	/**
	 * Subcontracting cost unit price 外注原価単価.<p>
	 *
	 */
	public MCNumber out_upri() {
		return getConstNumber(offset + 42, $out_upri);
	}

	/**
	 * Subcontracting cost unit price 外注原価単価.<p>
	 *
	 */
	public void out_upri(MCNumber value) {
		setConstNumber(offset + 42, $out_upri, value);
	}

	/**
	 * Subcontracting cost unit price 外注原価単価.<p>
	 *
	 */
	public void out_upri(int value) {
		setConstNumber(offset + 42, $out_upri, value);
	}

	/**
	 * Subcontracting cost unit price 外注原価単価.<p>
	 *
	 */
	public void out_upri(long value) {
		setConstNumber(offset + 42, $out_upri, value);
	}

	/**
	 * Subcontracting cost unit price 外注原価単価.<p>
	 *
	 */
	public void out_upri(float value) {
		setConstNumber(offset + 42, $out_upri, value);
	}

	/**
	 * Subcontracting cost unit price 外注原価単価.<p>
	 *
	 */
	public void out_upri(double value) {
		setConstNumber(offset + 42, $out_upri, value);
	}


	/**
	 * Purchase unit price (Order) 購買単価（指図）.<p>
	 *
	 */
	public MCNumber odr_purc_upri() {
		return getConstNumber(offset + 43, $odr_purc_upri);
	}

	/**
	 * Purchase unit price (Order) 購買単価（指図）.<p>
	 *
	 */
	public void odr_purc_upri(MCNumber value) {
		setConstNumber(offset + 43, $odr_purc_upri, value);
	}

	/**
	 * Purchase unit price (Order) 購買単価（指図）.<p>
	 *
	 */
	public void odr_purc_upri(int value) {
		setConstNumber(offset + 43, $odr_purc_upri, value);
	}

	/**
	 * Purchase unit price (Order) 購買単価（指図）.<p>
	 *
	 */
	public void odr_purc_upri(long value) {
		setConstNumber(offset + 43, $odr_purc_upri, value);
	}

	/**
	 * Purchase unit price (Order) 購買単価（指図）.<p>
	 *
	 */
	public void odr_purc_upri(float value) {
		setConstNumber(offset + 43, $odr_purc_upri, value);
	}

	/**
	 * Purchase unit price (Order) 購買単価（指図）.<p>
	 *
	 */
	public void odr_purc_upri(double value) {
		setConstNumber(offset + 43, $odr_purc_upri, value);
	}


	/**
	 * Subcontracting cost unit price (Order) 外注原価単価（指図）.<p>
	 *
	 */
	public MCNumber odr_out_upri() {
		return getConstNumber(offset + 44, $odr_out_upri);
	}

	/**
	 * Subcontracting cost unit price (Order) 外注原価単価（指図）.<p>
	 *
	 */
	public void odr_out_upri(MCNumber value) {
		setConstNumber(offset + 44, $odr_out_upri, value);
	}

	/**
	 * Subcontracting cost unit price (Order) 外注原価単価（指図）.<p>
	 *
	 */
	public void odr_out_upri(int value) {
		setConstNumber(offset + 44, $odr_out_upri, value);
	}

	/**
	 * Subcontracting cost unit price (Order) 外注原価単価（指図）.<p>
	 *
	 */
	public void odr_out_upri(long value) {
		setConstNumber(offset + 44, $odr_out_upri, value);
	}

	/**
	 * Subcontracting cost unit price (Order) 外注原価単価（指図）.<p>
	 *
	 */
	public void odr_out_upri(float value) {
		setConstNumber(offset + 44, $odr_out_upri, value);
	}

	/**
	 * Subcontracting cost unit price (Order) 外注原価単価（指図）.<p>
	 *
	 */
	public void odr_out_upri(double value) {
		setConstNumber(offset + 44, $odr_out_upri, value);
	}


	/**
	 * Transaction unit price variance 取引単価差異.<p>
	 *
	 */
	public MCNumber trd_upri_gap() {
		return getConstNumber(offset + 45, $trd_upri_gap);
	}

	/**
	 * Transaction unit price variance 取引単価差異.<p>
	 *
	 */
	public void trd_upri_gap(MCNumber value) {
		setConstNumber(offset + 45, $trd_upri_gap, value);
	}

	/**
	 * Transaction unit price variance 取引単価差異.<p>
	 *
	 */
	public void trd_upri_gap(int value) {
		setConstNumber(offset + 45, $trd_upri_gap, value);
	}

	/**
	 * Transaction unit price variance 取引単価差異.<p>
	 *
	 */
	public void trd_upri_gap(long value) {
		setConstNumber(offset + 45, $trd_upri_gap, value);
	}

	/**
	 * Transaction unit price variance 取引単価差異.<p>
	 *
	 */
	public void trd_upri_gap(float value) {
		setConstNumber(offset + 45, $trd_upri_gap, value);
	}

	/**
	 * Transaction unit price variance 取引単価差異.<p>
	 *
	 */
	public void trd_upri_gap(double value) {
		setConstNumber(offset + 45, $trd_upri_gap, value);
	}


	/**
	 * Standard transaction unit price 標準取引単価.<p>
	 *
	 */
	public MCNumber std_trd_upri() {
		return getConstNumber(offset + 46, $std_trd_upri);
	}

	/**
	 * Standard transaction unit price 標準取引単価.<p>
	 *
	 */
	public void std_trd_upri(MCNumber value) {
		setConstNumber(offset + 46, $std_trd_upri, value);
	}

	/**
	 * Standard transaction unit price 標準取引単価.<p>
	 *
	 */
	public void std_trd_upri(int value) {
		setConstNumber(offset + 46, $std_trd_upri, value);
	}

	/**
	 * Standard transaction unit price 標準取引単価.<p>
	 *
	 */
	public void std_trd_upri(long value) {
		setConstNumber(offset + 46, $std_trd_upri, value);
	}

	/**
	 * Standard transaction unit price 標準取引単価.<p>
	 *
	 */
	public void std_trd_upri(float value) {
		setConstNumber(offset + 46, $std_trd_upri, value);
	}

	/**
	 * Standard transaction unit price 標準取引単価.<p>
	 *
	 */
	public void std_trd_upri(double value) {
		setConstNumber(offset + 46, $std_trd_upri, value);
	}


	/**
	 * Transaction unit price 取引単価.<p>
	 *
	 */
	public MCNumber trd_upri() {
		return getConstNumber(offset + 47, $trd_upri);
	}

	/**
	 * Transaction unit price 取引単価.<p>
	 *
	 */
	public void trd_upri(MCNumber value) {
		setConstNumber(offset + 47, $trd_upri, value);
	}

	/**
	 * Transaction unit price 取引単価.<p>
	 *
	 */
	public void trd_upri(int value) {
		setConstNumber(offset + 47, $trd_upri, value);
	}

	/**
	 * Transaction unit price 取引単価.<p>
	 *
	 */
	public void trd_upri(long value) {
		setConstNumber(offset + 47, $trd_upri, value);
	}

	/**
	 * Transaction unit price 取引単価.<p>
	 *
	 */
	public void trd_upri(float value) {
		setConstNumber(offset + 47, $trd_upri, value);
	}

	/**
	 * Transaction unit price 取引単価.<p>
	 *
	 */
	public void trd_upri(double value) {
		setConstNumber(offset + 47, $trd_upri, value);
	}


	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public MCNumber trd_amt_gap() {
		return getConstNumber(offset + 48, $trd_amt_gap);
	}

	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public void trd_amt_gap(MCNumber value) {
		setConstNumber(offset + 48, $trd_amt_gap, value);
	}

	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public void trd_amt_gap(int value) {
		setConstNumber(offset + 48, $trd_amt_gap, value);
	}

	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public void trd_amt_gap(long value) {
		setConstNumber(offset + 48, $trd_amt_gap, value);
	}

	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public void trd_amt_gap(float value) {
		setConstNumber(offset + 48, $trd_amt_gap, value);
	}

	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public void trd_amt_gap(double value) {
		setConstNumber(offset + 48, $trd_amt_gap, value);
	}


	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public MCNumber std_trd_amt() {
		return getConstNumber(offset + 49, $std_trd_amt);
	}

	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public void std_trd_amt(MCNumber value) {
		setConstNumber(offset + 49, $std_trd_amt, value);
	}

	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public void std_trd_amt(int value) {
		setConstNumber(offset + 49, $std_trd_amt, value);
	}

	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public void std_trd_amt(long value) {
		setConstNumber(offset + 49, $std_trd_amt, value);
	}

	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public void std_trd_amt(float value) {
		setConstNumber(offset + 49, $std_trd_amt, value);
	}

	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public void std_trd_amt(double value) {
		setConstNumber(offset + 49, $std_trd_amt, value);
	}


	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public MCNumber trd_amt() {
		return getConstNumber(offset + 50, $trd_amt);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void trd_amt(MCNumber value) {
		setConstNumber(offset + 50, $trd_amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void trd_amt(int value) {
		setConstNumber(offset + 50, $trd_amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void trd_amt(long value) {
		setConstNumber(offset + 50, $trd_amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void trd_amt(float value) {
		setConstNumber(offset + 50, $trd_amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void trd_amt(double value) {
		setConstNumber(offset + 50, $trd_amt, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 51, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 51, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 52, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 52, $trd_cur_nm, value);
	}


	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 53, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 53, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 53, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 53, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 53, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 53, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_upri_dec_place() {
		return getConstNumber(offset + 54, $trd_cur_upri_dec_place);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 54, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 54, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 54, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 54, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 54, $trd_cur_upri_dec_place, value);
	}


	/**
	 * Rate variance レート差異.<p>
	 *
	 */
	public MCNumber xrate_gap() {
		return getConstNumber(offset + 55, $xrate_gap);
	}

	/**
	 * Rate variance レート差異.<p>
	 *
	 */
	public void xrate_gap(MCNumber value) {
		setConstNumber(offset + 55, $xrate_gap, value);
	}

	/**
	 * Rate variance レート差異.<p>
	 *
	 */
	public void xrate_gap(int value) {
		setConstNumber(offset + 55, $xrate_gap, value);
	}

	/**
	 * Rate variance レート差異.<p>
	 *
	 */
	public void xrate_gap(long value) {
		setConstNumber(offset + 55, $xrate_gap, value);
	}

	/**
	 * Rate variance レート差異.<p>
	 *
	 */
	public void xrate_gap(float value) {
		setConstNumber(offset + 55, $xrate_gap, value);
	}

	/**
	 * Rate variance レート差異.<p>
	 *
	 */
	public void xrate_gap(double value) {
		setConstNumber(offset + 55, $xrate_gap, value);
	}


	/**
	 * Standard exchange rate 標準為替レート.<p>
	 *
	 */
	public MCNumber std_xrate() {
		return getConstNumber(offset + 56, $std_xrate);
	}

	/**
	 * Standard exchange rate 標準為替レート.<p>
	 *
	 */
	public void std_xrate(MCNumber value) {
		setConstNumber(offset + 56, $std_xrate, value);
	}

	/**
	 * Standard exchange rate 標準為替レート.<p>
	 *
	 */
	public void std_xrate(int value) {
		setConstNumber(offset + 56, $std_xrate, value);
	}

	/**
	 * Standard exchange rate 標準為替レート.<p>
	 *
	 */
	public void std_xrate(long value) {
		setConstNumber(offset + 56, $std_xrate, value);
	}

	/**
	 * Standard exchange rate 標準為替レート.<p>
	 *
	 */
	public void std_xrate(float value) {
		setConstNumber(offset + 56, $std_xrate, value);
	}

	/**
	 * Standard exchange rate 標準為替レート.<p>
	 *
	 */
	public void std_xrate(double value) {
		setConstNumber(offset + 56, $std_xrate, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 57, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 57, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 57, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 57, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 57, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 57, $xrate, value);
	}


	/**
	 * Subcontracting unit price variance 外注単価差異.<p>
	 *
	 */
	public MCNumber out_unit_gap() {
		return getConstNumber(offset + 58, $out_unit_gap);
	}

	/**
	 * Subcontracting unit price variance 外注単価差異.<p>
	 *
	 */
	public void out_unit_gap(MCNumber value) {
		setConstNumber(offset + 58, $out_unit_gap, value);
	}

	/**
	 * Subcontracting unit price variance 外注単価差異.<p>
	 *
	 */
	public void out_unit_gap(int value) {
		setConstNumber(offset + 58, $out_unit_gap, value);
	}

	/**
	 * Subcontracting unit price variance 外注単価差異.<p>
	 *
	 */
	public void out_unit_gap(long value) {
		setConstNumber(offset + 58, $out_unit_gap, value);
	}

	/**
	 * Subcontracting unit price variance 外注単価差異.<p>
	 *
	 */
	public void out_unit_gap(float value) {
		setConstNumber(offset + 58, $out_unit_gap, value);
	}

	/**
	 * Subcontracting unit price variance 外注単価差異.<p>
	 *
	 */
	public void out_unit_gap(double value) {
		setConstNumber(offset + 58, $out_unit_gap, value);
	}


	/**
	 * Standard subcontracting unit price 標準外注単価.<p>
	 *
	 */
	public MCNumber std_out_unit() {
		return getConstNumber(offset + 59, $std_out_unit);
	}

	/**
	 * Standard subcontracting unit price 標準外注単価.<p>
	 *
	 */
	public void std_out_unit(MCNumber value) {
		setConstNumber(offset + 59, $std_out_unit, value);
	}

	/**
	 * Standard subcontracting unit price 標準外注単価.<p>
	 *
	 */
	public void std_out_unit(int value) {
		setConstNumber(offset + 59, $std_out_unit, value);
	}

	/**
	 * Standard subcontracting unit price 標準外注単価.<p>
	 *
	 */
	public void std_out_unit(long value) {
		setConstNumber(offset + 59, $std_out_unit, value);
	}

	/**
	 * Standard subcontracting unit price 標準外注単価.<p>
	 *
	 */
	public void std_out_unit(float value) {
		setConstNumber(offset + 59, $std_out_unit, value);
	}

	/**
	 * Standard subcontracting unit price 標準外注単価.<p>
	 *
	 */
	public void std_out_unit(double value) {
		setConstNumber(offset + 59, $std_out_unit, value);
	}


	/**
	 * Subcontracting unit price 外注単価.<p>
	 *
	 */
	public MCNumber out_unit() {
		return getConstNumber(offset + 60, $out_unit);
	}

	/**
	 * Subcontracting unit price 外注単価.<p>
	 *
	 */
	public void out_unit(MCNumber value) {
		setConstNumber(offset + 60, $out_unit, value);
	}

	/**
	 * Subcontracting unit price 外注単価.<p>
	 *
	 */
	public void out_unit(int value) {
		setConstNumber(offset + 60, $out_unit, value);
	}

	/**
	 * Subcontracting unit price 外注単価.<p>
	 *
	 */
	public void out_unit(long value) {
		setConstNumber(offset + 60, $out_unit, value);
	}

	/**
	 * Subcontracting unit price 外注単価.<p>
	 *
	 */
	public void out_unit(float value) {
		setConstNumber(offset + 60, $out_unit, value);
	}

	/**
	 * Subcontracting unit price 外注単価.<p>
	 *
	 */
	public void out_unit(double value) {
		setConstNumber(offset + 60, $out_unit, value);
	}


	/**
	 * Purchase unit price variance 購買単価差異.<p>
	 *
	 */
	public MCNumber purc_upri_gap() {
		return getConstNumber(offset + 61, $purc_upri_gap);
	}

	/**
	 * Purchase unit price variance 購買単価差異.<p>
	 *
	 */
	public void purc_upri_gap(MCNumber value) {
		setConstNumber(offset + 61, $purc_upri_gap, value);
	}

	/**
	 * Purchase unit price variance 購買単価差異.<p>
	 *
	 */
	public void purc_upri_gap(int value) {
		setConstNumber(offset + 61, $purc_upri_gap, value);
	}

	/**
	 * Purchase unit price variance 購買単価差異.<p>
	 *
	 */
	public void purc_upri_gap(long value) {
		setConstNumber(offset + 61, $purc_upri_gap, value);
	}

	/**
	 * Purchase unit price variance 購買単価差異.<p>
	 *
	 */
	public void purc_upri_gap(float value) {
		setConstNumber(offset + 61, $purc_upri_gap, value);
	}

	/**
	 * Purchase unit price variance 購買単価差異.<p>
	 *
	 */
	public void purc_upri_gap(double value) {
		setConstNumber(offset + 61, $purc_upri_gap, value);
	}


	/**
	 * Standard purchase unit price 標準購買単価.<p>
	 *
	 */
	public MCNumber std_purc_upri() {
		return getConstNumber(offset + 62, $std_purc_upri);
	}

	/**
	 * Standard purchase unit price 標準購買単価.<p>
	 *
	 */
	public void std_purc_upri(MCNumber value) {
		setConstNumber(offset + 62, $std_purc_upri, value);
	}

	/**
	 * Standard purchase unit price 標準購買単価.<p>
	 *
	 */
	public void std_purc_upri(int value) {
		setConstNumber(offset + 62, $std_purc_upri, value);
	}

	/**
	 * Standard purchase unit price 標準購買単価.<p>
	 *
	 */
	public void std_purc_upri(long value) {
		setConstNumber(offset + 62, $std_purc_upri, value);
	}

	/**
	 * Standard purchase unit price 標準購買単価.<p>
	 *
	 */
	public void std_purc_upri(float value) {
		setConstNumber(offset + 62, $std_purc_upri, value);
	}

	/**
	 * Standard purchase unit price 標準購買単価.<p>
	 *
	 */
	public void std_purc_upri(double value) {
		setConstNumber(offset + 62, $std_purc_upri, value);
	}


	/**
	 * Subcontracting amount variance 外注金額差異.<p>
	 *
	 */
	public MCNumber out_diff() {
		return getConstNumber(offset + 63, $out_diff);
	}

	/**
	 * Subcontracting amount variance 外注金額差異.<p>
	 *
	 */
	public void out_diff(MCNumber value) {
		setConstNumber(offset + 63, $out_diff, value);
	}

	/**
	 * Subcontracting amount variance 外注金額差異.<p>
	 *
	 */
	public void out_diff(int value) {
		setConstNumber(offset + 63, $out_diff, value);
	}

	/**
	 * Subcontracting amount variance 外注金額差異.<p>
	 *
	 */
	public void out_diff(long value) {
		setConstNumber(offset + 63, $out_diff, value);
	}

	/**
	 * Subcontracting amount variance 外注金額差異.<p>
	 *
	 */
	public void out_diff(float value) {
		setConstNumber(offset + 63, $out_diff, value);
	}

	/**
	 * Subcontracting amount variance 外注金額差異.<p>
	 *
	 */
	public void out_diff(double value) {
		setConstNumber(offset + 63, $out_diff, value);
	}


	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public MCNumber upri_diff() {
		return getConstNumber(offset + 64, $upri_diff);
	}

	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public void upri_diff(MCNumber value) {
		setConstNumber(offset + 64, $upri_diff, value);
	}

	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public void upri_diff(int value) {
		setConstNumber(offset + 64, $upri_diff, value);
	}

	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public void upri_diff(long value) {
		setConstNumber(offset + 64, $upri_diff, value);
	}

	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public void upri_diff(float value) {
		setConstNumber(offset + 64, $upri_diff, value);
	}

	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public void upri_diff(double value) {
		setConstNumber(offset + 64, $upri_diff, value);
	}


	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public MCNumber rate_diff() {
		return getConstNumber(offset + 65, $rate_diff);
	}

	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public void rate_diff(MCNumber value) {
		setConstNumber(offset + 65, $rate_diff, value);
	}

	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public void rate_diff(int value) {
		setConstNumber(offset + 65, $rate_diff, value);
	}

	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public void rate_diff(long value) {
		setConstNumber(offset + 65, $rate_diff, value);
	}

	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public void rate_diff(float value) {
		setConstNumber(offset + 65, $rate_diff, value);
	}

	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public void rate_diff(double value) {
		setConstNumber(offset + 65, $rate_diff, value);
	}


	/**
	 * Standard subcontracting amount 標準外注金額.<p>
	 *
	 */
	public MCNumber std_out_amt() {
		return getConstNumber(offset + 66, $std_out_amt);
	}

	/**
	 * Standard subcontracting amount 標準外注金額.<p>
	 *
	 */
	public void std_out_amt(MCNumber value) {
		setConstNumber(offset + 66, $std_out_amt, value);
	}

	/**
	 * Standard subcontracting amount 標準外注金額.<p>
	 *
	 */
	public void std_out_amt(int value) {
		setConstNumber(offset + 66, $std_out_amt, value);
	}

	/**
	 * Standard subcontracting amount 標準外注金額.<p>
	 *
	 */
	public void std_out_amt(long value) {
		setConstNumber(offset + 66, $std_out_amt, value);
	}

	/**
	 * Standard subcontracting amount 標準外注金額.<p>
	 *
	 */
	public void std_out_amt(float value) {
		setConstNumber(offset + 66, $std_out_amt, value);
	}

	/**
	 * Standard subcontracting amount 標準外注金額.<p>
	 *
	 */
	public void std_out_amt(double value) {
		setConstNumber(offset + 66, $std_out_amt, value);
	}


	/**
	 * Subcontracting amount 外注金額.<p>
	 *
	 */
	public MCNumber out_amt() {
		return getConstNumber(offset + 67, $out_amt);
	}

	/**
	 * Subcontracting amount 外注金額.<p>
	 *
	 */
	public void out_amt(MCNumber value) {
		setConstNumber(offset + 67, $out_amt, value);
	}

	/**
	 * Subcontracting amount 外注金額.<p>
	 *
	 */
	public void out_amt(int value) {
		setConstNumber(offset + 67, $out_amt, value);
	}

	/**
	 * Subcontracting amount 外注金額.<p>
	 *
	 */
	public void out_amt(long value) {
		setConstNumber(offset + 67, $out_amt, value);
	}

	/**
	 * Subcontracting amount 外注金額.<p>
	 *
	 */
	public void out_amt(float value) {
		setConstNumber(offset + 67, $out_amt, value);
	}

	/**
	 * Subcontracting amount 外注金額.<p>
	 *
	 */
	public void out_amt(double value) {
		setConstNumber(offset + 67, $out_amt, value);
	}


	/**
	 * Purchase amount variance 購買金額差異.<p>
	 *
	 */
	public MCNumber purc_amt_gap() {
		return getConstNumber(offset + 68, $purc_amt_gap);
	}

	/**
	 * Purchase amount variance 購買金額差異.<p>
	 *
	 */
	public void purc_amt_gap(MCNumber value) {
		setConstNumber(offset + 68, $purc_amt_gap, value);
	}

	/**
	 * Purchase amount variance 購買金額差異.<p>
	 *
	 */
	public void purc_amt_gap(int value) {
		setConstNumber(offset + 68, $purc_amt_gap, value);
	}

	/**
	 * Purchase amount variance 購買金額差異.<p>
	 *
	 */
	public void purc_amt_gap(long value) {
		setConstNumber(offset + 68, $purc_amt_gap, value);
	}

	/**
	 * Purchase amount variance 購買金額差異.<p>
	 *
	 */
	public void purc_amt_gap(float value) {
		setConstNumber(offset + 68, $purc_amt_gap, value);
	}

	/**
	 * Purchase amount variance 購買金額差異.<p>
	 *
	 */
	public void purc_amt_gap(double value) {
		setConstNumber(offset + 68, $purc_amt_gap, value);
	}


	/**
	 * Standard purchase amount 標準購買金額.<p>
	 *
	 */
	public MCNumber std_purc_amt() {
		return getConstNumber(offset + 69, $std_purc_amt);
	}

	/**
	 * Standard purchase amount 標準購買金額.<p>
	 *
	 */
	public void std_purc_amt(MCNumber value) {
		setConstNumber(offset + 69, $std_purc_amt, value);
	}

	/**
	 * Standard purchase amount 標準購買金額.<p>
	 *
	 */
	public void std_purc_amt(int value) {
		setConstNumber(offset + 69, $std_purc_amt, value);
	}

	/**
	 * Standard purchase amount 標準購買金額.<p>
	 *
	 */
	public void std_purc_amt(long value) {
		setConstNumber(offset + 69, $std_purc_amt, value);
	}

	/**
	 * Standard purchase amount 標準購買金額.<p>
	 *
	 */
	public void std_purc_amt(float value) {
		setConstNumber(offset + 69, $std_purc_amt, value);
	}

	/**
	 * Standard purchase amount 標準購買金額.<p>
	 *
	 */
	public void std_purc_amt(double value) {
		setConstNumber(offset + 69, $std_purc_amt, value);
	}


	/**
	 * Purchase cost variance 購買原価差異.<p>
	 *
	 */
	public MCNumber purc_cost_gap() {
		return getConstNumber(offset + 70, $purc_cost_gap);
	}

	/**
	 * Purchase cost variance 購買原価差異.<p>
	 *
	 */
	public void purc_cost_gap(MCNumber value) {
		setConstNumber(offset + 70, $purc_cost_gap, value);
	}

	/**
	 * Purchase cost variance 購買原価差異.<p>
	 *
	 */
	public void purc_cost_gap(int value) {
		setConstNumber(offset + 70, $purc_cost_gap, value);
	}

	/**
	 * Purchase cost variance 購買原価差異.<p>
	 *
	 */
	public void purc_cost_gap(long value) {
		setConstNumber(offset + 70, $purc_cost_gap, value);
	}

	/**
	 * Purchase cost variance 購買原価差異.<p>
	 *
	 */
	public void purc_cost_gap(float value) {
		setConstNumber(offset + 70, $purc_cost_gap, value);
	}

	/**
	 * Purchase cost variance 購買原価差異.<p>
	 *
	 */
	public void purc_cost_gap(double value) {
		setConstNumber(offset + 70, $purc_cost_gap, value);
	}


	/**
	 * Standard purchase cost 標準購買原価.<p>
	 *
	 */
	public MCNumber std_purc_cost() {
		return getConstNumber(offset + 71, $std_purc_cost);
	}

	/**
	 * Standard purchase cost 標準購買原価.<p>
	 *
	 */
	public void std_purc_cost(MCNumber value) {
		setConstNumber(offset + 71, $std_purc_cost, value);
	}

	/**
	 * Standard purchase cost 標準購買原価.<p>
	 *
	 */
	public void std_purc_cost(int value) {
		setConstNumber(offset + 71, $std_purc_cost, value);
	}

	/**
	 * Standard purchase cost 標準購買原価.<p>
	 *
	 */
	public void std_purc_cost(long value) {
		setConstNumber(offset + 71, $std_purc_cost, value);
	}

	/**
	 * Standard purchase cost 標準購買原価.<p>
	 *
	 */
	public void std_purc_cost(float value) {
		setConstNumber(offset + 71, $std_purc_cost, value);
	}

	/**
	 * Standard purchase cost 標準購買原価.<p>
	 *
	 */
	public void std_purc_cost(double value) {
		setConstNumber(offset + 71, $std_purc_cost, value);
	}


	/**
	 * Purchase cost 購買原価.<p>
	 *
	 */
	public MCNumber ttl() {
		return getConstNumber(offset + 72, $ttl);
	}

	/**
	 * Purchase cost 購買原価.<p>
	 *
	 */
	public void ttl(MCNumber value) {
		setConstNumber(offset + 72, $ttl, value);
	}

	/**
	 * Purchase cost 購買原価.<p>
	 *
	 */
	public void ttl(int value) {
		setConstNumber(offset + 72, $ttl, value);
	}

	/**
	 * Purchase cost 購買原価.<p>
	 *
	 */
	public void ttl(long value) {
		setConstNumber(offset + 72, $ttl, value);
	}

	/**
	 * Purchase cost 購買原価.<p>
	 *
	 */
	public void ttl(float value) {
		setConstNumber(offset + 72, $ttl, value);
	}

	/**
	 * Purchase cost 購買原価.<p>
	 *
	 */
	public void ttl(double value) {
		setConstNumber(offset + 72, $ttl, value);
	}


	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public MCNumber var_cost() {
		return getConstNumber(offset + 73, $var_cost);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(MCNumber value) {
		setConstNumber(offset + 73, $var_cost, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(int value) {
		setConstNumber(offset + 73, $var_cost, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(long value) {
		setConstNumber(offset + 73, $var_cost, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(float value) {
		setConstNumber(offset + 73, $var_cost, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(double value) {
		setConstNumber(offset + 73, $var_cost, value);
	}


	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public MCNumber fxd_cost() {
		return getConstNumber(offset + 74, $fxd_cost);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(MCNumber value) {
		setConstNumber(offset + 74, $fxd_cost, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(int value) {
		setConstNumber(offset + 74, $fxd_cost, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(long value) {
		setConstNumber(offset + 74, $fxd_cost, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(float value) {
		setConstNumber(offset + 74, $fxd_cost, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(double value) {
		setConstNumber(offset + 74, $fxd_cost, value);
	}


	public MCNumber col_000() {
		return getConstNumber(offset + 75, $col_000);
	}

	public void col_000(MCNumber value) {
		setConstNumber(offset + 75, $col_000, value);
	}

	public void col_000(int value) {
		setConstNumber(offset + 75, $col_000, value);
	}

	public void col_000(long value) {
		setConstNumber(offset + 75, $col_000, value);
	}

	public void col_000(float value) {
		setConstNumber(offset + 75, $col_000, value);
	}

	public void col_000(double value) {
		setConstNumber(offset + 75, $col_000, value);
	}


	public MCNumber col_001() {
		return getConstNumber(offset + 76, $col_001);
	}

	public void col_001(MCNumber value) {
		setConstNumber(offset + 76, $col_001, value);
	}

	public void col_001(int value) {
		setConstNumber(offset + 76, $col_001, value);
	}

	public void col_001(long value) {
		setConstNumber(offset + 76, $col_001, value);
	}

	public void col_001(float value) {
		setConstNumber(offset + 76, $col_001, value);
	}

	public void col_001(double value) {
		setConstNumber(offset + 76, $col_001, value);
	}


	public MCNumber col_002() {
		return getConstNumber(offset + 77, $col_002);
	}

	public void col_002(MCNumber value) {
		setConstNumber(offset + 77, $col_002, value);
	}

	public void col_002(int value) {
		setConstNumber(offset + 77, $col_002, value);
	}

	public void col_002(long value) {
		setConstNumber(offset + 77, $col_002, value);
	}

	public void col_002(float value) {
		setConstNumber(offset + 77, $col_002, value);
	}

	public void col_002(double value) {
		setConstNumber(offset + 77, $col_002, value);
	}


	public MCNumber col_003() {
		return getConstNumber(offset + 78, $col_003);
	}

	public void col_003(MCNumber value) {
		setConstNumber(offset + 78, $col_003, value);
	}

	public void col_003(int value) {
		setConstNumber(offset + 78, $col_003, value);
	}

	public void col_003(long value) {
		setConstNumber(offset + 78, $col_003, value);
	}

	public void col_003(float value) {
		setConstNumber(offset + 78, $col_003, value);
	}

	public void col_003(double value) {
		setConstNumber(offset + 78, $col_003, value);
	}


	public MCNumber col_004() {
		return getConstNumber(offset + 79, $col_004);
	}

	public void col_004(MCNumber value) {
		setConstNumber(offset + 79, $col_004, value);
	}

	public void col_004(int value) {
		setConstNumber(offset + 79, $col_004, value);
	}

	public void col_004(long value) {
		setConstNumber(offset + 79, $col_004, value);
	}

	public void col_004(float value) {
		setConstNumber(offset + 79, $col_004, value);
	}

	public void col_004(double value) {
		setConstNumber(offset + 79, $col_004, value);
	}


	public MCNumber col_005() {
		return getConstNumber(offset + 80, $col_005);
	}

	public void col_005(MCNumber value) {
		setConstNumber(offset + 80, $col_005, value);
	}

	public void col_005(int value) {
		setConstNumber(offset + 80, $col_005, value);
	}

	public void col_005(long value) {
		setConstNumber(offset + 80, $col_005, value);
	}

	public void col_005(float value) {
		setConstNumber(offset + 80, $col_005, value);
	}

	public void col_005(double value) {
		setConstNumber(offset + 80, $col_005, value);
	}


	public MCNumber col_006() {
		return getConstNumber(offset + 81, $col_006);
	}

	public void col_006(MCNumber value) {
		setConstNumber(offset + 81, $col_006, value);
	}

	public void col_006(int value) {
		setConstNumber(offset + 81, $col_006, value);
	}

	public void col_006(long value) {
		setConstNumber(offset + 81, $col_006, value);
	}

	public void col_006(float value) {
		setConstNumber(offset + 81, $col_006, value);
	}

	public void col_006(double value) {
		setConstNumber(offset + 81, $col_006, value);
	}


	public MCNumber col_007() {
		return getConstNumber(offset + 82, $col_007);
	}

	public void col_007(MCNumber value) {
		setConstNumber(offset + 82, $col_007, value);
	}

	public void col_007(int value) {
		setConstNumber(offset + 82, $col_007, value);
	}

	public void col_007(long value) {
		setConstNumber(offset + 82, $col_007, value);
	}

	public void col_007(float value) {
		setConstNumber(offset + 82, $col_007, value);
	}

	public void col_007(double value) {
		setConstNumber(offset + 82, $col_007, value);
	}


	public MCNumber col_008() {
		return getConstNumber(offset + 83, $col_008);
	}

	public void col_008(MCNumber value) {
		setConstNumber(offset + 83, $col_008, value);
	}

	public void col_008(int value) {
		setConstNumber(offset + 83, $col_008, value);
	}

	public void col_008(long value) {
		setConstNumber(offset + 83, $col_008, value);
	}

	public void col_008(float value) {
		setConstNumber(offset + 83, $col_008, value);
	}

	public void col_008(double value) {
		setConstNumber(offset + 83, $col_008, value);
	}


	public MCNumber col_009() {
		return getConstNumber(offset + 84, $col_009);
	}

	public void col_009(MCNumber value) {
		setConstNumber(offset + 84, $col_009, value);
	}

	public void col_009(int value) {
		setConstNumber(offset + 84, $col_009, value);
	}

	public void col_009(long value) {
		setConstNumber(offset + 84, $col_009, value);
	}

	public void col_009(float value) {
		setConstNumber(offset + 84, $col_009, value);
	}

	public void col_009(double value) {
		setConstNumber(offset + 84, $col_009, value);
	}


	public MCNumber col_010() {
		return getConstNumber(offset + 85, $col_010);
	}

	public void col_010(MCNumber value) {
		setConstNumber(offset + 85, $col_010, value);
	}

	public void col_010(int value) {
		setConstNumber(offset + 85, $col_010, value);
	}

	public void col_010(long value) {
		setConstNumber(offset + 85, $col_010, value);
	}

	public void col_010(float value) {
		setConstNumber(offset + 85, $col_010, value);
	}

	public void col_010(double value) {
		setConstNumber(offset + 85, $col_010, value);
	}


	public MCNumber col_011() {
		return getConstNumber(offset + 86, $col_011);
	}

	public void col_011(MCNumber value) {
		setConstNumber(offset + 86, $col_011, value);
	}

	public void col_011(int value) {
		setConstNumber(offset + 86, $col_011, value);
	}

	public void col_011(long value) {
		setConstNumber(offset + 86, $col_011, value);
	}

	public void col_011(float value) {
		setConstNumber(offset + 86, $col_011, value);
	}

	public void col_011(double value) {
		setConstNumber(offset + 86, $col_011, value);
	}


	public MCNumber col_012() {
		return getConstNumber(offset + 87, $col_012);
	}

	public void col_012(MCNumber value) {
		setConstNumber(offset + 87, $col_012, value);
	}

	public void col_012(int value) {
		setConstNumber(offset + 87, $col_012, value);
	}

	public void col_012(long value) {
		setConstNumber(offset + 87, $col_012, value);
	}

	public void col_012(float value) {
		setConstNumber(offset + 87, $col_012, value);
	}

	public void col_012(double value) {
		setConstNumber(offset + 87, $col_012, value);
	}


	public MCNumber col_013() {
		return getConstNumber(offset + 88, $col_013);
	}

	public void col_013(MCNumber value) {
		setConstNumber(offset + 88, $col_013, value);
	}

	public void col_013(int value) {
		setConstNumber(offset + 88, $col_013, value);
	}

	public void col_013(long value) {
		setConstNumber(offset + 88, $col_013, value);
	}

	public void col_013(float value) {
		setConstNumber(offset + 88, $col_013, value);
	}

	public void col_013(double value) {
		setConstNumber(offset + 88, $col_013, value);
	}


	public MCNumber col_014() {
		return getConstNumber(offset + 89, $col_014);
	}

	public void col_014(MCNumber value) {
		setConstNumber(offset + 89, $col_014, value);
	}

	public void col_014(int value) {
		setConstNumber(offset + 89, $col_014, value);
	}

	public void col_014(long value) {
		setConstNumber(offset + 89, $col_014, value);
	}

	public void col_014(float value) {
		setConstNumber(offset + 89, $col_014, value);
	}

	public void col_014(double value) {
		setConstNumber(offset + 89, $col_014, value);
	}


	public MCNumber col_015() {
		return getConstNumber(offset + 90, $col_015);
	}

	public void col_015(MCNumber value) {
		setConstNumber(offset + 90, $col_015, value);
	}

	public void col_015(int value) {
		setConstNumber(offset + 90, $col_015, value);
	}

	public void col_015(long value) {
		setConstNumber(offset + 90, $col_015, value);
	}

	public void col_015(float value) {
		setConstNumber(offset + 90, $col_015, value);
	}

	public void col_015(double value) {
		setConstNumber(offset + 90, $col_015, value);
	}


	public MCNumber col_016() {
		return getConstNumber(offset + 91, $col_016);
	}

	public void col_016(MCNumber value) {
		setConstNumber(offset + 91, $col_016, value);
	}

	public void col_016(int value) {
		setConstNumber(offset + 91, $col_016, value);
	}

	public void col_016(long value) {
		setConstNumber(offset + 91, $col_016, value);
	}

	public void col_016(float value) {
		setConstNumber(offset + 91, $col_016, value);
	}

	public void col_016(double value) {
		setConstNumber(offset + 91, $col_016, value);
	}


	public MCNumber col_017() {
		return getConstNumber(offset + 92, $col_017);
	}

	public void col_017(MCNumber value) {
		setConstNumber(offset + 92, $col_017, value);
	}

	public void col_017(int value) {
		setConstNumber(offset + 92, $col_017, value);
	}

	public void col_017(long value) {
		setConstNumber(offset + 92, $col_017, value);
	}

	public void col_017(float value) {
		setConstNumber(offset + 92, $col_017, value);
	}

	public void col_017(double value) {
		setConstNumber(offset + 92, $col_017, value);
	}


	public MCNumber col_018() {
		return getConstNumber(offset + 93, $col_018);
	}

	public void col_018(MCNumber value) {
		setConstNumber(offset + 93, $col_018, value);
	}

	public void col_018(int value) {
		setConstNumber(offset + 93, $col_018, value);
	}

	public void col_018(long value) {
		setConstNumber(offset + 93, $col_018, value);
	}

	public void col_018(float value) {
		setConstNumber(offset + 93, $col_018, value);
	}

	public void col_018(double value) {
		setConstNumber(offset + 93, $col_018, value);
	}


	public MCNumber col_019() {
		return getConstNumber(offset + 94, $col_019);
	}

	public void col_019(MCNumber value) {
		setConstNumber(offset + 94, $col_019, value);
	}

	public void col_019(int value) {
		setConstNumber(offset + 94, $col_019, value);
	}

	public void col_019(long value) {
		setConstNumber(offset + 94, $col_019, value);
	}

	public void col_019(float value) {
		setConstNumber(offset + 94, $col_019, value);
	}

	public void col_019(double value) {
		setConstNumber(offset + 94, $col_019, value);
	}


	public MCNumber col_020() {
		return getConstNumber(offset + 95, $col_020);
	}

	public void col_020(MCNumber value) {
		setConstNumber(offset + 95, $col_020, value);
	}

	public void col_020(int value) {
		setConstNumber(offset + 95, $col_020, value);
	}

	public void col_020(long value) {
		setConstNumber(offset + 95, $col_020, value);
	}

	public void col_020(float value) {
		setConstNumber(offset + 95, $col_020, value);
	}

	public void col_020(double value) {
		setConstNumber(offset + 95, $col_020, value);
	}


	public MCNumber col_021() {
		return getConstNumber(offset + 96, $col_021);
	}

	public void col_021(MCNumber value) {
		setConstNumber(offset + 96, $col_021, value);
	}

	public void col_021(int value) {
		setConstNumber(offset + 96, $col_021, value);
	}

	public void col_021(long value) {
		setConstNumber(offset + 96, $col_021, value);
	}

	public void col_021(float value) {
		setConstNumber(offset + 96, $col_021, value);
	}

	public void col_021(double value) {
		setConstNumber(offset + 96, $col_021, value);
	}


	public MCNumber col_022() {
		return getConstNumber(offset + 97, $col_022);
	}

	public void col_022(MCNumber value) {
		setConstNumber(offset + 97, $col_022, value);
	}

	public void col_022(int value) {
		setConstNumber(offset + 97, $col_022, value);
	}

	public void col_022(long value) {
		setConstNumber(offset + 97, $col_022, value);
	}

	public void col_022(float value) {
		setConstNumber(offset + 97, $col_022, value);
	}

	public void col_022(double value) {
		setConstNumber(offset + 97, $col_022, value);
	}


	public MCNumber col_023() {
		return getConstNumber(offset + 98, $col_023);
	}

	public void col_023(MCNumber value) {
		setConstNumber(offset + 98, $col_023, value);
	}

	public void col_023(int value) {
		setConstNumber(offset + 98, $col_023, value);
	}

	public void col_023(long value) {
		setConstNumber(offset + 98, $col_023, value);
	}

	public void col_023(float value) {
		setConstNumber(offset + 98, $col_023, value);
	}

	public void col_023(double value) {
		setConstNumber(offset + 98, $col_023, value);
	}


	public MCNumber col_024() {
		return getConstNumber(offset + 99, $col_024);
	}

	public void col_024(MCNumber value) {
		setConstNumber(offset + 99, $col_024, value);
	}

	public void col_024(int value) {
		setConstNumber(offset + 99, $col_024, value);
	}

	public void col_024(long value) {
		setConstNumber(offset + 99, $col_024, value);
	}

	public void col_024(float value) {
		setConstNumber(offset + 99, $col_024, value);
	}

	public void col_024(double value) {
		setConstNumber(offset + 99, $col_024, value);
	}


	public MCNumber col_025() {
		return getConstNumber(offset + 100, $col_025);
	}

	public void col_025(MCNumber value) {
		setConstNumber(offset + 100, $col_025, value);
	}

	public void col_025(int value) {
		setConstNumber(offset + 100, $col_025, value);
	}

	public void col_025(long value) {
		setConstNumber(offset + 100, $col_025, value);
	}

	public void col_025(float value) {
		setConstNumber(offset + 100, $col_025, value);
	}

	public void col_025(double value) {
		setConstNumber(offset + 100, $col_025, value);
	}


	public MCNumber col_026() {
		return getConstNumber(offset + 101, $col_026);
	}

	public void col_026(MCNumber value) {
		setConstNumber(offset + 101, $col_026, value);
	}

	public void col_026(int value) {
		setConstNumber(offset + 101, $col_026, value);
	}

	public void col_026(long value) {
		setConstNumber(offset + 101, $col_026, value);
	}

	public void col_026(float value) {
		setConstNumber(offset + 101, $col_026, value);
	}

	public void col_026(double value) {
		setConstNumber(offset + 101, $col_026, value);
	}


	public MCNumber col_027() {
		return getConstNumber(offset + 102, $col_027);
	}

	public void col_027(MCNumber value) {
		setConstNumber(offset + 102, $col_027, value);
	}

	public void col_027(int value) {
		setConstNumber(offset + 102, $col_027, value);
	}

	public void col_027(long value) {
		setConstNumber(offset + 102, $col_027, value);
	}

	public void col_027(float value) {
		setConstNumber(offset + 102, $col_027, value);
	}

	public void col_027(double value) {
		setConstNumber(offset + 102, $col_027, value);
	}


	public MCNumber col_028() {
		return getConstNumber(offset + 103, $col_028);
	}

	public void col_028(MCNumber value) {
		setConstNumber(offset + 103, $col_028, value);
	}

	public void col_028(int value) {
		setConstNumber(offset + 103, $col_028, value);
	}

	public void col_028(long value) {
		setConstNumber(offset + 103, $col_028, value);
	}

	public void col_028(float value) {
		setConstNumber(offset + 103, $col_028, value);
	}

	public void col_028(double value) {
		setConstNumber(offset + 103, $col_028, value);
	}


	public MCNumber col_029() {
		return getConstNumber(offset + 104, $col_029);
	}

	public void col_029(MCNumber value) {
		setConstNumber(offset + 104, $col_029, value);
	}

	public void col_029(int value) {
		setConstNumber(offset + 104, $col_029, value);
	}

	public void col_029(long value) {
		setConstNumber(offset + 104, $col_029, value);
	}

	public void col_029(float value) {
		setConstNumber(offset + 104, $col_029, value);
	}

	public void col_029(double value) {
		setConstNumber(offset + 104, $col_029, value);
	}


	public MCNumber col_030() {
		return getConstNumber(offset + 105, $col_030);
	}

	public void col_030(MCNumber value) {
		setConstNumber(offset + 105, $col_030, value);
	}

	public void col_030(int value) {
		setConstNumber(offset + 105, $col_030, value);
	}

	public void col_030(long value) {
		setConstNumber(offset + 105, $col_030, value);
	}

	public void col_030(float value) {
		setConstNumber(offset + 105, $col_030, value);
	}

	public void col_030(double value) {
		setConstNumber(offset + 105, $col_030, value);
	}


	public MCNumber col_031() {
		return getConstNumber(offset + 106, $col_031);
	}

	public void col_031(MCNumber value) {
		setConstNumber(offset + 106, $col_031, value);
	}

	public void col_031(int value) {
		setConstNumber(offset + 106, $col_031, value);
	}

	public void col_031(long value) {
		setConstNumber(offset + 106, $col_031, value);
	}

	public void col_031(float value) {
		setConstNumber(offset + 106, $col_031, value);
	}

	public void col_031(double value) {
		setConstNumber(offset + 106, $col_031, value);
	}


	public MCNumber col_032() {
		return getConstNumber(offset + 107, $col_032);
	}

	public void col_032(MCNumber value) {
		setConstNumber(offset + 107, $col_032, value);
	}

	public void col_032(int value) {
		setConstNumber(offset + 107, $col_032, value);
	}

	public void col_032(long value) {
		setConstNumber(offset + 107, $col_032, value);
	}

	public void col_032(float value) {
		setConstNumber(offset + 107, $col_032, value);
	}

	public void col_032(double value) {
		setConstNumber(offset + 107, $col_032, value);
	}


	public MCNumber col_033() {
		return getConstNumber(offset + 108, $col_033);
	}

	public void col_033(MCNumber value) {
		setConstNumber(offset + 108, $col_033, value);
	}

	public void col_033(int value) {
		setConstNumber(offset + 108, $col_033, value);
	}

	public void col_033(long value) {
		setConstNumber(offset + 108, $col_033, value);
	}

	public void col_033(float value) {
		setConstNumber(offset + 108, $col_033, value);
	}

	public void col_033(double value) {
		setConstNumber(offset + 108, $col_033, value);
	}


	public MCNumber col_034() {
		return getConstNumber(offset + 109, $col_034);
	}

	public void col_034(MCNumber value) {
		setConstNumber(offset + 109, $col_034, value);
	}

	public void col_034(int value) {
		setConstNumber(offset + 109, $col_034, value);
	}

	public void col_034(long value) {
		setConstNumber(offset + 109, $col_034, value);
	}

	public void col_034(float value) {
		setConstNumber(offset + 109, $col_034, value);
	}

	public void col_034(double value) {
		setConstNumber(offset + 109, $col_034, value);
	}


	public MCNumber col_035() {
		return getConstNumber(offset + 110, $col_035);
	}

	public void col_035(MCNumber value) {
		setConstNumber(offset + 110, $col_035, value);
	}

	public void col_035(int value) {
		setConstNumber(offset + 110, $col_035, value);
	}

	public void col_035(long value) {
		setConstNumber(offset + 110, $col_035, value);
	}

	public void col_035(float value) {
		setConstNumber(offset + 110, $col_035, value);
	}

	public void col_035(double value) {
		setConstNumber(offset + 110, $col_035, value);
	}


	public MCNumber col_036() {
		return getConstNumber(offset + 111, $col_036);
	}

	public void col_036(MCNumber value) {
		setConstNumber(offset + 111, $col_036, value);
	}

	public void col_036(int value) {
		setConstNumber(offset + 111, $col_036, value);
	}

	public void col_036(long value) {
		setConstNumber(offset + 111, $col_036, value);
	}

	public void col_036(float value) {
		setConstNumber(offset + 111, $col_036, value);
	}

	public void col_036(double value) {
		setConstNumber(offset + 111, $col_036, value);
	}


	public MCNumber col_037() {
		return getConstNumber(offset + 112, $col_037);
	}

	public void col_037(MCNumber value) {
		setConstNumber(offset + 112, $col_037, value);
	}

	public void col_037(int value) {
		setConstNumber(offset + 112, $col_037, value);
	}

	public void col_037(long value) {
		setConstNumber(offset + 112, $col_037, value);
	}

	public void col_037(float value) {
		setConstNumber(offset + 112, $col_037, value);
	}

	public void col_037(double value) {
		setConstNumber(offset + 112, $col_037, value);
	}


	public MCNumber col_038() {
		return getConstNumber(offset + 113, $col_038);
	}

	public void col_038(MCNumber value) {
		setConstNumber(offset + 113, $col_038, value);
	}

	public void col_038(int value) {
		setConstNumber(offset + 113, $col_038, value);
	}

	public void col_038(long value) {
		setConstNumber(offset + 113, $col_038, value);
	}

	public void col_038(float value) {
		setConstNumber(offset + 113, $col_038, value);
	}

	public void col_038(double value) {
		setConstNumber(offset + 113, $col_038, value);
	}


	public MCNumber col_039() {
		return getConstNumber(offset + 114, $col_039);
	}

	public void col_039(MCNumber value) {
		setConstNumber(offset + 114, $col_039, value);
	}

	public void col_039(int value) {
		setConstNumber(offset + 114, $col_039, value);
	}

	public void col_039(long value) {
		setConstNumber(offset + 114, $col_039, value);
	}

	public void col_039(float value) {
		setConstNumber(offset + 114, $col_039, value);
	}

	public void col_039(double value) {
		setConstNumber(offset + 114, $col_039, value);
	}


	public MCNumber col_040() {
		return getConstNumber(offset + 115, $col_040);
	}

	public void col_040(MCNumber value) {
		setConstNumber(offset + 115, $col_040, value);
	}

	public void col_040(int value) {
		setConstNumber(offset + 115, $col_040, value);
	}

	public void col_040(long value) {
		setConstNumber(offset + 115, $col_040, value);
	}

	public void col_040(float value) {
		setConstNumber(offset + 115, $col_040, value);
	}

	public void col_040(double value) {
		setConstNumber(offset + 115, $col_040, value);
	}


	public MCNumber col_041() {
		return getConstNumber(offset + 116, $col_041);
	}

	public void col_041(MCNumber value) {
		setConstNumber(offset + 116, $col_041, value);
	}

	public void col_041(int value) {
		setConstNumber(offset + 116, $col_041, value);
	}

	public void col_041(long value) {
		setConstNumber(offset + 116, $col_041, value);
	}

	public void col_041(float value) {
		setConstNumber(offset + 116, $col_041, value);
	}

	public void col_041(double value) {
		setConstNumber(offset + 116, $col_041, value);
	}


	public MCNumber col_042() {
		return getConstNumber(offset + 117, $col_042);
	}

	public void col_042(MCNumber value) {
		setConstNumber(offset + 117, $col_042, value);
	}

	public void col_042(int value) {
		setConstNumber(offset + 117, $col_042, value);
	}

	public void col_042(long value) {
		setConstNumber(offset + 117, $col_042, value);
	}

	public void col_042(float value) {
		setConstNumber(offset + 117, $col_042, value);
	}

	public void col_042(double value) {
		setConstNumber(offset + 117, $col_042, value);
	}


	public MCNumber col_043() {
		return getConstNumber(offset + 118, $col_043);
	}

	public void col_043(MCNumber value) {
		setConstNumber(offset + 118, $col_043, value);
	}

	public void col_043(int value) {
		setConstNumber(offset + 118, $col_043, value);
	}

	public void col_043(long value) {
		setConstNumber(offset + 118, $col_043, value);
	}

	public void col_043(float value) {
		setConstNumber(offset + 118, $col_043, value);
	}

	public void col_043(double value) {
		setConstNumber(offset + 118, $col_043, value);
	}


	public MCNumber col_044() {
		return getConstNumber(offset + 119, $col_044);
	}

	public void col_044(MCNumber value) {
		setConstNumber(offset + 119, $col_044, value);
	}

	public void col_044(int value) {
		setConstNumber(offset + 119, $col_044, value);
	}

	public void col_044(long value) {
		setConstNumber(offset + 119, $col_044, value);
	}

	public void col_044(float value) {
		setConstNumber(offset + 119, $col_044, value);
	}

	public void col_044(double value) {
		setConstNumber(offset + 119, $col_044, value);
	}


	public MCNumber col_045() {
		return getConstNumber(offset + 120, $col_045);
	}

	public void col_045(MCNumber value) {
		setConstNumber(offset + 120, $col_045, value);
	}

	public void col_045(int value) {
		setConstNumber(offset + 120, $col_045, value);
	}

	public void col_045(long value) {
		setConstNumber(offset + 120, $col_045, value);
	}

	public void col_045(float value) {
		setConstNumber(offset + 120, $col_045, value);
	}

	public void col_045(double value) {
		setConstNumber(offset + 120, $col_045, value);
	}


	public MCNumber col_046() {
		return getConstNumber(offset + 121, $col_046);
	}

	public void col_046(MCNumber value) {
		setConstNumber(offset + 121, $col_046, value);
	}

	public void col_046(int value) {
		setConstNumber(offset + 121, $col_046, value);
	}

	public void col_046(long value) {
		setConstNumber(offset + 121, $col_046, value);
	}

	public void col_046(float value) {
		setConstNumber(offset + 121, $col_046, value);
	}

	public void col_046(double value) {
		setConstNumber(offset + 121, $col_046, value);
	}


	public MCNumber col_047() {
		return getConstNumber(offset + 122, $col_047);
	}

	public void col_047(MCNumber value) {
		setConstNumber(offset + 122, $col_047, value);
	}

	public void col_047(int value) {
		setConstNumber(offset + 122, $col_047, value);
	}

	public void col_047(long value) {
		setConstNumber(offset + 122, $col_047, value);
	}

	public void col_047(float value) {
		setConstNumber(offset + 122, $col_047, value);
	}

	public void col_047(double value) {
		setConstNumber(offset + 122, $col_047, value);
	}


	public MCNumber col_048() {
		return getConstNumber(offset + 123, $col_048);
	}

	public void col_048(MCNumber value) {
		setConstNumber(offset + 123, $col_048, value);
	}

	public void col_048(int value) {
		setConstNumber(offset + 123, $col_048, value);
	}

	public void col_048(long value) {
		setConstNumber(offset + 123, $col_048, value);
	}

	public void col_048(float value) {
		setConstNumber(offset + 123, $col_048, value);
	}

	public void col_048(double value) {
		setConstNumber(offset + 123, $col_048, value);
	}


	public MCNumber col_049() {
		return getConstNumber(offset + 124, $col_049);
	}

	public void col_049(MCNumber value) {
		setConstNumber(offset + 124, $col_049, value);
	}

	public void col_049(int value) {
		setConstNumber(offset + 124, $col_049, value);
	}

	public void col_049(long value) {
		setConstNumber(offset + 124, $col_049, value);
	}

	public void col_049(float value) {
		setConstNumber(offset + 124, $col_049, value);
	}

	public void col_049(double value) {
		setConstNumber(offset + 124, $col_049, value);
	}


	public MCNumber col_050() {
		return getConstNumber(offset + 125, $col_050);
	}

	public void col_050(MCNumber value) {
		setConstNumber(offset + 125, $col_050, value);
	}

	public void col_050(int value) {
		setConstNumber(offset + 125, $col_050, value);
	}

	public void col_050(long value) {
		setConstNumber(offset + 125, $col_050, value);
	}

	public void col_050(float value) {
		setConstNumber(offset + 125, $col_050, value);
	}

	public void col_050(double value) {
		setConstNumber(offset + 125, $col_050, value);
	}


	public MCNumber col_051() {
		return getConstNumber(offset + 126, $col_051);
	}

	public void col_051(MCNumber value) {
		setConstNumber(offset + 126, $col_051, value);
	}

	public void col_051(int value) {
		setConstNumber(offset + 126, $col_051, value);
	}

	public void col_051(long value) {
		setConstNumber(offset + 126, $col_051, value);
	}

	public void col_051(float value) {
		setConstNumber(offset + 126, $col_051, value);
	}

	public void col_051(double value) {
		setConstNumber(offset + 126, $col_051, value);
	}


	public MCNumber col_052() {
		return getConstNumber(offset + 127, $col_052);
	}

	public void col_052(MCNumber value) {
		setConstNumber(offset + 127, $col_052, value);
	}

	public void col_052(int value) {
		setConstNumber(offset + 127, $col_052, value);
	}

	public void col_052(long value) {
		setConstNumber(offset + 127, $col_052, value);
	}

	public void col_052(float value) {
		setConstNumber(offset + 127, $col_052, value);
	}

	public void col_052(double value) {
		setConstNumber(offset + 127, $col_052, value);
	}


	public MCNumber col_053() {
		return getConstNumber(offset + 128, $col_053);
	}

	public void col_053(MCNumber value) {
		setConstNumber(offset + 128, $col_053, value);
	}

	public void col_053(int value) {
		setConstNumber(offset + 128, $col_053, value);
	}

	public void col_053(long value) {
		setConstNumber(offset + 128, $col_053, value);
	}

	public void col_053(float value) {
		setConstNumber(offset + 128, $col_053, value);
	}

	public void col_053(double value) {
		setConstNumber(offset + 128, $col_053, value);
	}


	public MCNumber col_054() {
		return getConstNumber(offset + 129, $col_054);
	}

	public void col_054(MCNumber value) {
		setConstNumber(offset + 129, $col_054, value);
	}

	public void col_054(int value) {
		setConstNumber(offset + 129, $col_054, value);
	}

	public void col_054(long value) {
		setConstNumber(offset + 129, $col_054, value);
	}

	public void col_054(float value) {
		setConstNumber(offset + 129, $col_054, value);
	}

	public void col_054(double value) {
		setConstNumber(offset + 129, $col_054, value);
	}


	public MCNumber col_055() {
		return getConstNumber(offset + 130, $col_055);
	}

	public void col_055(MCNumber value) {
		setConstNumber(offset + 130, $col_055, value);
	}

	public void col_055(int value) {
		setConstNumber(offset + 130, $col_055, value);
	}

	public void col_055(long value) {
		setConstNumber(offset + 130, $col_055, value);
	}

	public void col_055(float value) {
		setConstNumber(offset + 130, $col_055, value);
	}

	public void col_055(double value) {
		setConstNumber(offset + 130, $col_055, value);
	}


	public MCNumber col_056() {
		return getConstNumber(offset + 131, $col_056);
	}

	public void col_056(MCNumber value) {
		setConstNumber(offset + 131, $col_056, value);
	}

	public void col_056(int value) {
		setConstNumber(offset + 131, $col_056, value);
	}

	public void col_056(long value) {
		setConstNumber(offset + 131, $col_056, value);
	}

	public void col_056(float value) {
		setConstNumber(offset + 131, $col_056, value);
	}

	public void col_056(double value) {
		setConstNumber(offset + 131, $col_056, value);
	}


	public MCNumber col_057() {
		return getConstNumber(offset + 132, $col_057);
	}

	public void col_057(MCNumber value) {
		setConstNumber(offset + 132, $col_057, value);
	}

	public void col_057(int value) {
		setConstNumber(offset + 132, $col_057, value);
	}

	public void col_057(long value) {
		setConstNumber(offset + 132, $col_057, value);
	}

	public void col_057(float value) {
		setConstNumber(offset + 132, $col_057, value);
	}

	public void col_057(double value) {
		setConstNumber(offset + 132, $col_057, value);
	}


	public MCNumber col_058() {
		return getConstNumber(offset + 133, $col_058);
	}

	public void col_058(MCNumber value) {
		setConstNumber(offset + 133, $col_058, value);
	}

	public void col_058(int value) {
		setConstNumber(offset + 133, $col_058, value);
	}

	public void col_058(long value) {
		setConstNumber(offset + 133, $col_058, value);
	}

	public void col_058(float value) {
		setConstNumber(offset + 133, $col_058, value);
	}

	public void col_058(double value) {
		setConstNumber(offset + 133, $col_058, value);
	}


	public MCNumber col_059() {
		return getConstNumber(offset + 134, $col_059);
	}

	public void col_059(MCNumber value) {
		setConstNumber(offset + 134, $col_059, value);
	}

	public void col_059(int value) {
		setConstNumber(offset + 134, $col_059, value);
	}

	public void col_059(long value) {
		setConstNumber(offset + 134, $col_059, value);
	}

	public void col_059(float value) {
		setConstNumber(offset + 134, $col_059, value);
	}

	public void col_059(double value) {
		setConstNumber(offset + 134, $col_059, value);
	}


	public MCNumber col_060() {
		return getConstNumber(offset + 135, $col_060);
	}

	public void col_060(MCNumber value) {
		setConstNumber(offset + 135, $col_060, value);
	}

	public void col_060(int value) {
		setConstNumber(offset + 135, $col_060, value);
	}

	public void col_060(long value) {
		setConstNumber(offset + 135, $col_060, value);
	}

	public void col_060(float value) {
		setConstNumber(offset + 135, $col_060, value);
	}

	public void col_060(double value) {
		setConstNumber(offset + 135, $col_060, value);
	}


	public MCNumber col_061() {
		return getConstNumber(offset + 136, $col_061);
	}

	public void col_061(MCNumber value) {
		setConstNumber(offset + 136, $col_061, value);
	}

	public void col_061(int value) {
		setConstNumber(offset + 136, $col_061, value);
	}

	public void col_061(long value) {
		setConstNumber(offset + 136, $col_061, value);
	}

	public void col_061(float value) {
		setConstNumber(offset + 136, $col_061, value);
	}

	public void col_061(double value) {
		setConstNumber(offset + 136, $col_061, value);
	}


	public MCNumber col_062() {
		return getConstNumber(offset + 137, $col_062);
	}

	public void col_062(MCNumber value) {
		setConstNumber(offset + 137, $col_062, value);
	}

	public void col_062(int value) {
		setConstNumber(offset + 137, $col_062, value);
	}

	public void col_062(long value) {
		setConstNumber(offset + 137, $col_062, value);
	}

	public void col_062(float value) {
		setConstNumber(offset + 137, $col_062, value);
	}

	public void col_062(double value) {
		setConstNumber(offset + 137, $col_062, value);
	}


	public MCNumber col_063() {
		return getConstNumber(offset + 138, $col_063);
	}

	public void col_063(MCNumber value) {
		setConstNumber(offset + 138, $col_063, value);
	}

	public void col_063(int value) {
		setConstNumber(offset + 138, $col_063, value);
	}

	public void col_063(long value) {
		setConstNumber(offset + 138, $col_063, value);
	}

	public void col_063(float value) {
		setConstNumber(offset + 138, $col_063, value);
	}

	public void col_063(double value) {
		setConstNumber(offset + 138, $col_063, value);
	}


	public MCNumber col_064() {
		return getConstNumber(offset + 139, $col_064);
	}

	public void col_064(MCNumber value) {
		setConstNumber(offset + 139, $col_064, value);
	}

	public void col_064(int value) {
		setConstNumber(offset + 139, $col_064, value);
	}

	public void col_064(long value) {
		setConstNumber(offset + 139, $col_064, value);
	}

	public void col_064(float value) {
		setConstNumber(offset + 139, $col_064, value);
	}

	public void col_064(double value) {
		setConstNumber(offset + 139, $col_064, value);
	}


	public MCNumber col_065() {
		return getConstNumber(offset + 140, $col_065);
	}

	public void col_065(MCNumber value) {
		setConstNumber(offset + 140, $col_065, value);
	}

	public void col_065(int value) {
		setConstNumber(offset + 140, $col_065, value);
	}

	public void col_065(long value) {
		setConstNumber(offset + 140, $col_065, value);
	}

	public void col_065(float value) {
		setConstNumber(offset + 140, $col_065, value);
	}

	public void col_065(double value) {
		setConstNumber(offset + 140, $col_065, value);
	}


	public MCNumber col_066() {
		return getConstNumber(offset + 141, $col_066);
	}

	public void col_066(MCNumber value) {
		setConstNumber(offset + 141, $col_066, value);
	}

	public void col_066(int value) {
		setConstNumber(offset + 141, $col_066, value);
	}

	public void col_066(long value) {
		setConstNumber(offset + 141, $col_066, value);
	}

	public void col_066(float value) {
		setConstNumber(offset + 141, $col_066, value);
	}

	public void col_066(double value) {
		setConstNumber(offset + 141, $col_066, value);
	}


	public MCNumber col_067() {
		return getConstNumber(offset + 142, $col_067);
	}

	public void col_067(MCNumber value) {
		setConstNumber(offset + 142, $col_067, value);
	}

	public void col_067(int value) {
		setConstNumber(offset + 142, $col_067, value);
	}

	public void col_067(long value) {
		setConstNumber(offset + 142, $col_067, value);
	}

	public void col_067(float value) {
		setConstNumber(offset + 142, $col_067, value);
	}

	public void col_067(double value) {
		setConstNumber(offset + 142, $col_067, value);
	}


	public MCNumber col_068() {
		return getConstNumber(offset + 143, $col_068);
	}

	public void col_068(MCNumber value) {
		setConstNumber(offset + 143, $col_068, value);
	}

	public void col_068(int value) {
		setConstNumber(offset + 143, $col_068, value);
	}

	public void col_068(long value) {
		setConstNumber(offset + 143, $col_068, value);
	}

	public void col_068(float value) {
		setConstNumber(offset + 143, $col_068, value);
	}

	public void col_068(double value) {
		setConstNumber(offset + 143, $col_068, value);
	}


	public MCNumber col_069() {
		return getConstNumber(offset + 144, $col_069);
	}

	public void col_069(MCNumber value) {
		setConstNumber(offset + 144, $col_069, value);
	}

	public void col_069(int value) {
		setConstNumber(offset + 144, $col_069, value);
	}

	public void col_069(long value) {
		setConstNumber(offset + 144, $col_069, value);
	}

	public void col_069(float value) {
		setConstNumber(offset + 144, $col_069, value);
	}

	public void col_069(double value) {
		setConstNumber(offset + 144, $col_069, value);
	}


	public MCNumber col_070() {
		return getConstNumber(offset + 145, $col_070);
	}

	public void col_070(MCNumber value) {
		setConstNumber(offset + 145, $col_070, value);
	}

	public void col_070(int value) {
		setConstNumber(offset + 145, $col_070, value);
	}

	public void col_070(long value) {
		setConstNumber(offset + 145, $col_070, value);
	}

	public void col_070(float value) {
		setConstNumber(offset + 145, $col_070, value);
	}

	public void col_070(double value) {
		setConstNumber(offset + 145, $col_070, value);
	}


	public MCNumber col_071() {
		return getConstNumber(offset + 146, $col_071);
	}

	public void col_071(MCNumber value) {
		setConstNumber(offset + 146, $col_071, value);
	}

	public void col_071(int value) {
		setConstNumber(offset + 146, $col_071, value);
	}

	public void col_071(long value) {
		setConstNumber(offset + 146, $col_071, value);
	}

	public void col_071(float value) {
		setConstNumber(offset + 146, $col_071, value);
	}

	public void col_071(double value) {
		setConstNumber(offset + 146, $col_071, value);
	}


	public MCNumber col_072() {
		return getConstNumber(offset + 147, $col_072);
	}

	public void col_072(MCNumber value) {
		setConstNumber(offset + 147, $col_072, value);
	}

	public void col_072(int value) {
		setConstNumber(offset + 147, $col_072, value);
	}

	public void col_072(long value) {
		setConstNumber(offset + 147, $col_072, value);
	}

	public void col_072(float value) {
		setConstNumber(offset + 147, $col_072, value);
	}

	public void col_072(double value) {
		setConstNumber(offset + 147, $col_072, value);
	}


	public MCNumber col_073() {
		return getConstNumber(offset + 148, $col_073);
	}

	public void col_073(MCNumber value) {
		setConstNumber(offset + 148, $col_073, value);
	}

	public void col_073(int value) {
		setConstNumber(offset + 148, $col_073, value);
	}

	public void col_073(long value) {
		setConstNumber(offset + 148, $col_073, value);
	}

	public void col_073(float value) {
		setConstNumber(offset + 148, $col_073, value);
	}

	public void col_073(double value) {
		setConstNumber(offset + 148, $col_073, value);
	}


	public MCNumber col_074() {
		return getConstNumber(offset + 149, $col_074);
	}

	public void col_074(MCNumber value) {
		setConstNumber(offset + 149, $col_074, value);
	}

	public void col_074(int value) {
		setConstNumber(offset + 149, $col_074, value);
	}

	public void col_074(long value) {
		setConstNumber(offset + 149, $col_074, value);
	}

	public void col_074(float value) {
		setConstNumber(offset + 149, $col_074, value);
	}

	public void col_074(double value) {
		setConstNumber(offset + 149, $col_074, value);
	}


	public MCNumber col_075() {
		return getConstNumber(offset + 150, $col_075);
	}

	public void col_075(MCNumber value) {
		setConstNumber(offset + 150, $col_075, value);
	}

	public void col_075(int value) {
		setConstNumber(offset + 150, $col_075, value);
	}

	public void col_075(long value) {
		setConstNumber(offset + 150, $col_075, value);
	}

	public void col_075(float value) {
		setConstNumber(offset + 150, $col_075, value);
	}

	public void col_075(double value) {
		setConstNumber(offset + 150, $col_075, value);
	}


	public MCNumber col_076() {
		return getConstNumber(offset + 151, $col_076);
	}

	public void col_076(MCNumber value) {
		setConstNumber(offset + 151, $col_076, value);
	}

	public void col_076(int value) {
		setConstNumber(offset + 151, $col_076, value);
	}

	public void col_076(long value) {
		setConstNumber(offset + 151, $col_076, value);
	}

	public void col_076(float value) {
		setConstNumber(offset + 151, $col_076, value);
	}

	public void col_076(double value) {
		setConstNumber(offset + 151, $col_076, value);
	}


	public MCNumber col_077() {
		return getConstNumber(offset + 152, $col_077);
	}

	public void col_077(MCNumber value) {
		setConstNumber(offset + 152, $col_077, value);
	}

	public void col_077(int value) {
		setConstNumber(offset + 152, $col_077, value);
	}

	public void col_077(long value) {
		setConstNumber(offset + 152, $col_077, value);
	}

	public void col_077(float value) {
		setConstNumber(offset + 152, $col_077, value);
	}

	public void col_077(double value) {
		setConstNumber(offset + 152, $col_077, value);
	}


	public MCNumber col_078() {
		return getConstNumber(offset + 153, $col_078);
	}

	public void col_078(MCNumber value) {
		setConstNumber(offset + 153, $col_078, value);
	}

	public void col_078(int value) {
		setConstNumber(offset + 153, $col_078, value);
	}

	public void col_078(long value) {
		setConstNumber(offset + 153, $col_078, value);
	}

	public void col_078(float value) {
		setConstNumber(offset + 153, $col_078, value);
	}

	public void col_078(double value) {
		setConstNumber(offset + 153, $col_078, value);
	}


	public MCNumber col_079() {
		return getConstNumber(offset + 154, $col_079);
	}

	public void col_079(MCNumber value) {
		setConstNumber(offset + 154, $col_079, value);
	}

	public void col_079(int value) {
		setConstNumber(offset + 154, $col_079, value);
	}

	public void col_079(long value) {
		setConstNumber(offset + 154, $col_079, value);
	}

	public void col_079(float value) {
		setConstNumber(offset + 154, $col_079, value);
	}

	public void col_079(double value) {
		setConstNumber(offset + 154, $col_079, value);
	}


	public MCNumber col_080() {
		return getConstNumber(offset + 155, $col_080);
	}

	public void col_080(MCNumber value) {
		setConstNumber(offset + 155, $col_080, value);
	}

	public void col_080(int value) {
		setConstNumber(offset + 155, $col_080, value);
	}

	public void col_080(long value) {
		setConstNumber(offset + 155, $col_080, value);
	}

	public void col_080(float value) {
		setConstNumber(offset + 155, $col_080, value);
	}

	public void col_080(double value) {
		setConstNumber(offset + 155, $col_080, value);
	}


	public MCNumber col_081() {
		return getConstNumber(offset + 156, $col_081);
	}

	public void col_081(MCNumber value) {
		setConstNumber(offset + 156, $col_081, value);
	}

	public void col_081(int value) {
		setConstNumber(offset + 156, $col_081, value);
	}

	public void col_081(long value) {
		setConstNumber(offset + 156, $col_081, value);
	}

	public void col_081(float value) {
		setConstNumber(offset + 156, $col_081, value);
	}

	public void col_081(double value) {
		setConstNumber(offset + 156, $col_081, value);
	}


	public MCNumber col_082() {
		return getConstNumber(offset + 157, $col_082);
	}

	public void col_082(MCNumber value) {
		setConstNumber(offset + 157, $col_082, value);
	}

	public void col_082(int value) {
		setConstNumber(offset + 157, $col_082, value);
	}

	public void col_082(long value) {
		setConstNumber(offset + 157, $col_082, value);
	}

	public void col_082(float value) {
		setConstNumber(offset + 157, $col_082, value);
	}

	public void col_082(double value) {
		setConstNumber(offset + 157, $col_082, value);
	}


	public MCNumber col_083() {
		return getConstNumber(offset + 158, $col_083);
	}

	public void col_083(MCNumber value) {
		setConstNumber(offset + 158, $col_083, value);
	}

	public void col_083(int value) {
		setConstNumber(offset + 158, $col_083, value);
	}

	public void col_083(long value) {
		setConstNumber(offset + 158, $col_083, value);
	}

	public void col_083(float value) {
		setConstNumber(offset + 158, $col_083, value);
	}

	public void col_083(double value) {
		setConstNumber(offset + 158, $col_083, value);
	}


	public MCNumber col_084() {
		return getConstNumber(offset + 159, $col_084);
	}

	public void col_084(MCNumber value) {
		setConstNumber(offset + 159, $col_084, value);
	}

	public void col_084(int value) {
		setConstNumber(offset + 159, $col_084, value);
	}

	public void col_084(long value) {
		setConstNumber(offset + 159, $col_084, value);
	}

	public void col_084(float value) {
		setConstNumber(offset + 159, $col_084, value);
	}

	public void col_084(double value) {
		setConstNumber(offset + 159, $col_084, value);
	}


	public MCNumber col_085() {
		return getConstNumber(offset + 160, $col_085);
	}

	public void col_085(MCNumber value) {
		setConstNumber(offset + 160, $col_085, value);
	}

	public void col_085(int value) {
		setConstNumber(offset + 160, $col_085, value);
	}

	public void col_085(long value) {
		setConstNumber(offset + 160, $col_085, value);
	}

	public void col_085(float value) {
		setConstNumber(offset + 160, $col_085, value);
	}

	public void col_085(double value) {
		setConstNumber(offset + 160, $col_085, value);
	}


	public MCNumber col_086() {
		return getConstNumber(offset + 161, $col_086);
	}

	public void col_086(MCNumber value) {
		setConstNumber(offset + 161, $col_086, value);
	}

	public void col_086(int value) {
		setConstNumber(offset + 161, $col_086, value);
	}

	public void col_086(long value) {
		setConstNumber(offset + 161, $col_086, value);
	}

	public void col_086(float value) {
		setConstNumber(offset + 161, $col_086, value);
	}

	public void col_086(double value) {
		setConstNumber(offset + 161, $col_086, value);
	}


	public MCNumber col_087() {
		return getConstNumber(offset + 162, $col_087);
	}

	public void col_087(MCNumber value) {
		setConstNumber(offset + 162, $col_087, value);
	}

	public void col_087(int value) {
		setConstNumber(offset + 162, $col_087, value);
	}

	public void col_087(long value) {
		setConstNumber(offset + 162, $col_087, value);
	}

	public void col_087(float value) {
		setConstNumber(offset + 162, $col_087, value);
	}

	public void col_087(double value) {
		setConstNumber(offset + 162, $col_087, value);
	}


	public MCNumber col_088() {
		return getConstNumber(offset + 163, $col_088);
	}

	public void col_088(MCNumber value) {
		setConstNumber(offset + 163, $col_088, value);
	}

	public void col_088(int value) {
		setConstNumber(offset + 163, $col_088, value);
	}

	public void col_088(long value) {
		setConstNumber(offset + 163, $col_088, value);
	}

	public void col_088(float value) {
		setConstNumber(offset + 163, $col_088, value);
	}

	public void col_088(double value) {
		setConstNumber(offset + 163, $col_088, value);
	}


	public MCNumber col_089() {
		return getConstNumber(offset + 164, $col_089);
	}

	public void col_089(MCNumber value) {
		setConstNumber(offset + 164, $col_089, value);
	}

	public void col_089(int value) {
		setConstNumber(offset + 164, $col_089, value);
	}

	public void col_089(long value) {
		setConstNumber(offset + 164, $col_089, value);
	}

	public void col_089(float value) {
		setConstNumber(offset + 164, $col_089, value);
	}

	public void col_089(double value) {
		setConstNumber(offset + 164, $col_089, value);
	}


	public MCNumber col_090() {
		return getConstNumber(offset + 165, $col_090);
	}

	public void col_090(MCNumber value) {
		setConstNumber(offset + 165, $col_090, value);
	}

	public void col_090(int value) {
		setConstNumber(offset + 165, $col_090, value);
	}

	public void col_090(long value) {
		setConstNumber(offset + 165, $col_090, value);
	}

	public void col_090(float value) {
		setConstNumber(offset + 165, $col_090, value);
	}

	public void col_090(double value) {
		setConstNumber(offset + 165, $col_090, value);
	}


	public MCNumber col_091() {
		return getConstNumber(offset + 166, $col_091);
	}

	public void col_091(MCNumber value) {
		setConstNumber(offset + 166, $col_091, value);
	}

	public void col_091(int value) {
		setConstNumber(offset + 166, $col_091, value);
	}

	public void col_091(long value) {
		setConstNumber(offset + 166, $col_091, value);
	}

	public void col_091(float value) {
		setConstNumber(offset + 166, $col_091, value);
	}

	public void col_091(double value) {
		setConstNumber(offset + 166, $col_091, value);
	}


	public MCNumber col_092() {
		return getConstNumber(offset + 167, $col_092);
	}

	public void col_092(MCNumber value) {
		setConstNumber(offset + 167, $col_092, value);
	}

	public void col_092(int value) {
		setConstNumber(offset + 167, $col_092, value);
	}

	public void col_092(long value) {
		setConstNumber(offset + 167, $col_092, value);
	}

	public void col_092(float value) {
		setConstNumber(offset + 167, $col_092, value);
	}

	public void col_092(double value) {
		setConstNumber(offset + 167, $col_092, value);
	}


	public MCNumber col_093() {
		return getConstNumber(offset + 168, $col_093);
	}

	public void col_093(MCNumber value) {
		setConstNumber(offset + 168, $col_093, value);
	}

	public void col_093(int value) {
		setConstNumber(offset + 168, $col_093, value);
	}

	public void col_093(long value) {
		setConstNumber(offset + 168, $col_093, value);
	}

	public void col_093(float value) {
		setConstNumber(offset + 168, $col_093, value);
	}

	public void col_093(double value) {
		setConstNumber(offset + 168, $col_093, value);
	}


	public MCNumber col_094() {
		return getConstNumber(offset + 169, $col_094);
	}

	public void col_094(MCNumber value) {
		setConstNumber(offset + 169, $col_094, value);
	}

	public void col_094(int value) {
		setConstNumber(offset + 169, $col_094, value);
	}

	public void col_094(long value) {
		setConstNumber(offset + 169, $col_094, value);
	}

	public void col_094(float value) {
		setConstNumber(offset + 169, $col_094, value);
	}

	public void col_094(double value) {
		setConstNumber(offset + 169, $col_094, value);
	}


	public MCNumber col_095() {
		return getConstNumber(offset + 170, $col_095);
	}

	public void col_095(MCNumber value) {
		setConstNumber(offset + 170, $col_095, value);
	}

	public void col_095(int value) {
		setConstNumber(offset + 170, $col_095, value);
	}

	public void col_095(long value) {
		setConstNumber(offset + 170, $col_095, value);
	}

	public void col_095(float value) {
		setConstNumber(offset + 170, $col_095, value);
	}

	public void col_095(double value) {
		setConstNumber(offset + 170, $col_095, value);
	}


	public MCNumber col_096() {
		return getConstNumber(offset + 171, $col_096);
	}

	public void col_096(MCNumber value) {
		setConstNumber(offset + 171, $col_096, value);
	}

	public void col_096(int value) {
		setConstNumber(offset + 171, $col_096, value);
	}

	public void col_096(long value) {
		setConstNumber(offset + 171, $col_096, value);
	}

	public void col_096(float value) {
		setConstNumber(offset + 171, $col_096, value);
	}

	public void col_096(double value) {
		setConstNumber(offset + 171, $col_096, value);
	}


	public MCNumber col_097() {
		return getConstNumber(offset + 172, $col_097);
	}

	public void col_097(MCNumber value) {
		setConstNumber(offset + 172, $col_097, value);
	}

	public void col_097(int value) {
		setConstNumber(offset + 172, $col_097, value);
	}

	public void col_097(long value) {
		setConstNumber(offset + 172, $col_097, value);
	}

	public void col_097(float value) {
		setConstNumber(offset + 172, $col_097, value);
	}

	public void col_097(double value) {
		setConstNumber(offset + 172, $col_097, value);
	}


	public MCNumber col_098() {
		return getConstNumber(offset + 173, $col_098);
	}

	public void col_098(MCNumber value) {
		setConstNumber(offset + 173, $col_098, value);
	}

	public void col_098(int value) {
		setConstNumber(offset + 173, $col_098, value);
	}

	public void col_098(long value) {
		setConstNumber(offset + 173, $col_098, value);
	}

	public void col_098(float value) {
		setConstNumber(offset + 173, $col_098, value);
	}

	public void col_098(double value) {
		setConstNumber(offset + 173, $col_098, value);
	}


	public MCNumber col_099() {
		return getConstNumber(offset + 174, $col_099);
	}

	public void col_099(MCNumber value) {
		setConstNumber(offset + 174, $col_099, value);
	}

	public void col_099(int value) {
		setConstNumber(offset + 174, $col_099, value);
	}

	public void col_099(long value) {
		setConstNumber(offset + 174, $col_099, value);
	}

	public void col_099(float value) {
		setConstNumber(offset + 174, $col_099, value);
	}

	public void col_099(double value) {
		setConstNumber(offset + 174, $col_099, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 175, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 175, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 176, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 176, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 177, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 177, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 178, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 178, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 179, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 179, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 180, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 180, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 181, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 181, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 182, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 182, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 183, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 183, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 184, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 184, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 185, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 185, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 186, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 186, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 187, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 187, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 188, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 188, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 189, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 189, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 190, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 190, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 191, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 191, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 192, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 192, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 193, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 193, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 194, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 194, $itm_grp_nm10, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 195, $cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 195, $cntry_cd, value);
	}


	/**
	 * Country name 国名.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 196, $cntry_nm);
	}

	/**
	 * Country name 国名.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 196, $cntry_nm, value);
	}


	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public String area_cd() {
		return getConstString(offset + 197, $area_cd);
	}

	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public void area_cd(String value) {
		setConstString(offset + 197, $area_cd, value);
	}


	/**
	 * Region name 地域名.<p>
	 *
	 */
	public String area_nm() {
		return getConstString(offset + 198, $area_nm);
	}

	/**
	 * Region name 地域名.<p>
	 *
	 */
	public void area_nm(String value) {
		setConstString(offset + 198, $area_nm, value);
	}


	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return getConstString(offset + 199, $bp_grp_cd1);
	}

	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		setConstString(offset + 199, $bp_grp_cd1, value);
	}


	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return getConstString(offset + 200, $bp_grp_nm1);
	}

	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		setConstString(offset + 200, $bp_grp_nm1, value);
	}


	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return getConstString(offset + 201, $bp_grp_cd2);
	}

	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		setConstString(offset + 201, $bp_grp_cd2, value);
	}


	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return getConstString(offset + 202, $bp_grp_nm2);
	}

	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		setConstString(offset + 202, $bp_grp_nm2, value);
	}


	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return getConstString(offset + 203, $bp_grp_cd3);
	}

	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		setConstString(offset + 203, $bp_grp_cd3, value);
	}


	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return getConstString(offset + 204, $bp_grp_nm3);
	}

	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		setConstString(offset + 204, $bp_grp_nm3, value);
	}


	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return getConstString(offset + 205, $bp_grp_cd4);
	}

	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		setConstString(offset + 205, $bp_grp_cd4, value);
	}


	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return getConstString(offset + 206, $bp_grp_nm4);
	}

	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		setConstString(offset + 206, $bp_grp_nm4, value);
	}


	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return getConstString(offset + 207, $bp_grp_cd5);
	}

	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		setConstString(offset + 207, $bp_grp_cd5, value);
	}


	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return getConstString(offset + 208, $bp_grp_nm5);
	}

	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		setConstString(offset + 208, $bp_grp_nm5, value);
	}


	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return getConstString(offset + 209, $bp_grp_cd6);
	}

	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		setConstString(offset + 209, $bp_grp_cd6, value);
	}


	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return getConstString(offset + 210, $bp_grp_nm6);
	}

	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		setConstString(offset + 210, $bp_grp_nm6, value);
	}


	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return getConstString(offset + 211, $bp_grp_cd7);
	}

	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		setConstString(offset + 211, $bp_grp_cd7, value);
	}


	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return getConstString(offset + 212, $bp_grp_nm7);
	}

	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		setConstString(offset + 212, $bp_grp_nm7, value);
	}


	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return getConstString(offset + 213, $bp_grp_cd8);
	}

	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		setConstString(offset + 213, $bp_grp_cd8, value);
	}


	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return getConstString(offset + 214, $bp_grp_nm8);
	}

	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		setConstString(offset + 214, $bp_grp_nm8, value);
	}


	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return getConstString(offset + 215, $bp_grp_cd9);
	}

	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		setConstString(offset + 215, $bp_grp_cd9, value);
	}


	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return getConstString(offset + 216, $bp_grp_nm9);
	}

	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		setConstString(offset + 216, $bp_grp_nm9, value);
	}


	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return getConstString(offset + 217, $bp_grp_cd10);
	}

	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		setConstString(offset + 217, $bp_grp_cd10, value);
	}


	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return getConstString(offset + 218, $bp_grp_nm10);
	}

	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		setConstString(offset + 218, $bp_grp_nm10, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			return area_nm();
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			return bp_grp_cd1();
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			return bp_grp_nm1();
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			return bp_grp_cd2();
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			return bp_grp_nm2();
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			return bp_grp_cd3();
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			return bp_grp_nm3();
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			return bp_grp_cd4();
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			return bp_grp_nm4();
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			return bp_grp_cd5();
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			return bp_grp_nm5();
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			return bp_grp_cd6();
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			return bp_grp_nm6();
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			return bp_grp_cd7();
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			return bp_grp_nm7();
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			return bp_grp_cd8();
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			return bp_grp_nm8();
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			return bp_grp_cd9();
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			return bp_grp_nm9();
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			return bp_grp_cd10();
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			return bp_grp_nm10();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			return odr_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			return purc_amt();
		}
		if ($out_cost.equalsIgnoreCase(name)) {
			return out_cost();
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			return purc_upri();
		}
		if ($out_upri.equalsIgnoreCase(name)) {
			return out_upri();
		}
		if ($odr_purc_upri.equalsIgnoreCase(name)) {
			return odr_purc_upri();
		}
		if ($odr_out_upri.equalsIgnoreCase(name)) {
			return odr_out_upri();
		}
		if ($trd_upri_gap.equalsIgnoreCase(name)) {
			return trd_upri_gap();
		}
		if ($std_trd_upri.equalsIgnoreCase(name)) {
			return std_trd_upri();
		}
		if ($trd_upri.equalsIgnoreCase(name)) {
			return trd_upri();
		}
		if ($trd_amt_gap.equalsIgnoreCase(name)) {
			return trd_amt_gap();
		}
		if ($std_trd_amt.equalsIgnoreCase(name)) {
			return std_trd_amt();
		}
		if ($trd_amt.equalsIgnoreCase(name)) {
			return trd_amt();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($xrate_gap.equalsIgnoreCase(name)) {
			return xrate_gap();
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			return std_xrate();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($out_unit_gap.equalsIgnoreCase(name)) {
			return out_unit_gap();
		}
		if ($std_out_unit.equalsIgnoreCase(name)) {
			return std_out_unit();
		}
		if ($out_unit.equalsIgnoreCase(name)) {
			return out_unit();
		}
		if ($purc_upri_gap.equalsIgnoreCase(name)) {
			return purc_upri_gap();
		}
		if ($std_purc_upri.equalsIgnoreCase(name)) {
			return std_purc_upri();
		}
		if ($out_diff.equalsIgnoreCase(name)) {
			return out_diff();
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			return upri_diff();
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			return rate_diff();
		}
		if ($std_out_amt.equalsIgnoreCase(name)) {
			return std_out_amt();
		}
		if ($out_amt.equalsIgnoreCase(name)) {
			return out_amt();
		}
		if ($purc_amt_gap.equalsIgnoreCase(name)) {
			return purc_amt_gap();
		}
		if ($std_purc_amt.equalsIgnoreCase(name)) {
			return std_purc_amt();
		}
		if ($purc_cost_gap.equalsIgnoreCase(name)) {
			return purc_cost_gap();
		}
		if ($std_purc_cost.equalsIgnoreCase(name)) {
			return std_purc_cost();
		}
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			return var_cost();
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			return fxd_cost();
		}
		if ($col_000.equalsIgnoreCase(name)) {
			return col_000();
		}
		if ($col_001.equalsIgnoreCase(name)) {
			return col_001();
		}
		if ($col_002.equalsIgnoreCase(name)) {
			return col_002();
		}
		if ($col_003.equalsIgnoreCase(name)) {
			return col_003();
		}
		if ($col_004.equalsIgnoreCase(name)) {
			return col_004();
		}
		if ($col_005.equalsIgnoreCase(name)) {
			return col_005();
		}
		if ($col_006.equalsIgnoreCase(name)) {
			return col_006();
		}
		if ($col_007.equalsIgnoreCase(name)) {
			return col_007();
		}
		if ($col_008.equalsIgnoreCase(name)) {
			return col_008();
		}
		if ($col_009.equalsIgnoreCase(name)) {
			return col_009();
		}
		if ($col_010.equalsIgnoreCase(name)) {
			return col_010();
		}
		if ($col_011.equalsIgnoreCase(name)) {
			return col_011();
		}
		if ($col_012.equalsIgnoreCase(name)) {
			return col_012();
		}
		if ($col_013.equalsIgnoreCase(name)) {
			return col_013();
		}
		if ($col_014.equalsIgnoreCase(name)) {
			return col_014();
		}
		if ($col_015.equalsIgnoreCase(name)) {
			return col_015();
		}
		if ($col_016.equalsIgnoreCase(name)) {
			return col_016();
		}
		if ($col_017.equalsIgnoreCase(name)) {
			return col_017();
		}
		if ($col_018.equalsIgnoreCase(name)) {
			return col_018();
		}
		if ($col_019.equalsIgnoreCase(name)) {
			return col_019();
		}
		if ($col_020.equalsIgnoreCase(name)) {
			return col_020();
		}
		if ($col_021.equalsIgnoreCase(name)) {
			return col_021();
		}
		if ($col_022.equalsIgnoreCase(name)) {
			return col_022();
		}
		if ($col_023.equalsIgnoreCase(name)) {
			return col_023();
		}
		if ($col_024.equalsIgnoreCase(name)) {
			return col_024();
		}
		if ($col_025.equalsIgnoreCase(name)) {
			return col_025();
		}
		if ($col_026.equalsIgnoreCase(name)) {
			return col_026();
		}
		if ($col_027.equalsIgnoreCase(name)) {
			return col_027();
		}
		if ($col_028.equalsIgnoreCase(name)) {
			return col_028();
		}
		if ($col_029.equalsIgnoreCase(name)) {
			return col_029();
		}
		if ($col_030.equalsIgnoreCase(name)) {
			return col_030();
		}
		if ($col_031.equalsIgnoreCase(name)) {
			return col_031();
		}
		if ($col_032.equalsIgnoreCase(name)) {
			return col_032();
		}
		if ($col_033.equalsIgnoreCase(name)) {
			return col_033();
		}
		if ($col_034.equalsIgnoreCase(name)) {
			return col_034();
		}
		if ($col_035.equalsIgnoreCase(name)) {
			return col_035();
		}
		if ($col_036.equalsIgnoreCase(name)) {
			return col_036();
		}
		if ($col_037.equalsIgnoreCase(name)) {
			return col_037();
		}
		if ($col_038.equalsIgnoreCase(name)) {
			return col_038();
		}
		if ($col_039.equalsIgnoreCase(name)) {
			return col_039();
		}
		if ($col_040.equalsIgnoreCase(name)) {
			return col_040();
		}
		if ($col_041.equalsIgnoreCase(name)) {
			return col_041();
		}
		if ($col_042.equalsIgnoreCase(name)) {
			return col_042();
		}
		if ($col_043.equalsIgnoreCase(name)) {
			return col_043();
		}
		if ($col_044.equalsIgnoreCase(name)) {
			return col_044();
		}
		if ($col_045.equalsIgnoreCase(name)) {
			return col_045();
		}
		if ($col_046.equalsIgnoreCase(name)) {
			return col_046();
		}
		if ($col_047.equalsIgnoreCase(name)) {
			return col_047();
		}
		if ($col_048.equalsIgnoreCase(name)) {
			return col_048();
		}
		if ($col_049.equalsIgnoreCase(name)) {
			return col_049();
		}
		if ($col_050.equalsIgnoreCase(name)) {
			return col_050();
		}
		if ($col_051.equalsIgnoreCase(name)) {
			return col_051();
		}
		if ($col_052.equalsIgnoreCase(name)) {
			return col_052();
		}
		if ($col_053.equalsIgnoreCase(name)) {
			return col_053();
		}
		if ($col_054.equalsIgnoreCase(name)) {
			return col_054();
		}
		if ($col_055.equalsIgnoreCase(name)) {
			return col_055();
		}
		if ($col_056.equalsIgnoreCase(name)) {
			return col_056();
		}
		if ($col_057.equalsIgnoreCase(name)) {
			return col_057();
		}
		if ($col_058.equalsIgnoreCase(name)) {
			return col_058();
		}
		if ($col_059.equalsIgnoreCase(name)) {
			return col_059();
		}
		if ($col_060.equalsIgnoreCase(name)) {
			return col_060();
		}
		if ($col_061.equalsIgnoreCase(name)) {
			return col_061();
		}
		if ($col_062.equalsIgnoreCase(name)) {
			return col_062();
		}
		if ($col_063.equalsIgnoreCase(name)) {
			return col_063();
		}
		if ($col_064.equalsIgnoreCase(name)) {
			return col_064();
		}
		if ($col_065.equalsIgnoreCase(name)) {
			return col_065();
		}
		if ($col_066.equalsIgnoreCase(name)) {
			return col_066();
		}
		if ($col_067.equalsIgnoreCase(name)) {
			return col_067();
		}
		if ($col_068.equalsIgnoreCase(name)) {
			return col_068();
		}
		if ($col_069.equalsIgnoreCase(name)) {
			return col_069();
		}
		if ($col_070.equalsIgnoreCase(name)) {
			return col_070();
		}
		if ($col_071.equalsIgnoreCase(name)) {
			return col_071();
		}
		if ($col_072.equalsIgnoreCase(name)) {
			return col_072();
		}
		if ($col_073.equalsIgnoreCase(name)) {
			return col_073();
		}
		if ($col_074.equalsIgnoreCase(name)) {
			return col_074();
		}
		if ($col_075.equalsIgnoreCase(name)) {
			return col_075();
		}
		if ($col_076.equalsIgnoreCase(name)) {
			return col_076();
		}
		if ($col_077.equalsIgnoreCase(name)) {
			return col_077();
		}
		if ($col_078.equalsIgnoreCase(name)) {
			return col_078();
		}
		if ($col_079.equalsIgnoreCase(name)) {
			return col_079();
		}
		if ($col_080.equalsIgnoreCase(name)) {
			return col_080();
		}
		if ($col_081.equalsIgnoreCase(name)) {
			return col_081();
		}
		if ($col_082.equalsIgnoreCase(name)) {
			return col_082();
		}
		if ($col_083.equalsIgnoreCase(name)) {
			return col_083();
		}
		if ($col_084.equalsIgnoreCase(name)) {
			return col_084();
		}
		if ($col_085.equalsIgnoreCase(name)) {
			return col_085();
		}
		if ($col_086.equalsIgnoreCase(name)) {
			return col_086();
		}
		if ($col_087.equalsIgnoreCase(name)) {
			return col_087();
		}
		if ($col_088.equalsIgnoreCase(name)) {
			return col_088();
		}
		if ($col_089.equalsIgnoreCase(name)) {
			return col_089();
		}
		if ($col_090.equalsIgnoreCase(name)) {
			return col_090();
		}
		if ($col_091.equalsIgnoreCase(name)) {
			return col_091();
		}
		if ($col_092.equalsIgnoreCase(name)) {
			return col_092();
		}
		if ($col_093.equalsIgnoreCase(name)) {
			return col_093();
		}
		if ($col_094.equalsIgnoreCase(name)) {
			return col_094();
		}
		if ($col_095.equalsIgnoreCase(name)) {
			return col_095();
		}
		if ($col_096.equalsIgnoreCase(name)) {
			return col_096();
		}
		if ($col_097.equalsIgnoreCase(name)) {
			return col_097();
		}
		if ($col_098.equalsIgnoreCase(name)) {
			return col_098();
		}
		if ($col_099.equalsIgnoreCase(name)) {
			return col_099();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			return dummy_term();
		}
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			return area_nm();
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			return bp_grp_cd1();
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			return bp_grp_nm1();
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			return bp_grp_cd2();
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			return bp_grp_nm2();
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			return bp_grp_cd3();
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			return bp_grp_nm3();
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			return bp_grp_cd4();
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			return bp_grp_nm4();
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			return bp_grp_cd5();
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			return bp_grp_nm5();
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			return bp_grp_cd6();
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			return bp_grp_nm6();
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			return bp_grp_cd7();
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			return bp_grp_nm7();
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			return bp_grp_cd8();
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			return bp_grp_nm8();
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			return bp_grp_cd9();
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			return bp_grp_nm9();
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			return bp_grp_cd10();
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			return bp_grp_nm10();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			return odr_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			return purc_amt();
		}
		if ($out_cost.equalsIgnoreCase(name)) {
			return out_cost();
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			return purc_upri();
		}
		if ($out_upri.equalsIgnoreCase(name)) {
			return out_upri();
		}
		if ($odr_purc_upri.equalsIgnoreCase(name)) {
			return odr_purc_upri();
		}
		if ($odr_out_upri.equalsIgnoreCase(name)) {
			return odr_out_upri();
		}
		if ($trd_upri_gap.equalsIgnoreCase(name)) {
			return trd_upri_gap();
		}
		if ($std_trd_upri.equalsIgnoreCase(name)) {
			return std_trd_upri();
		}
		if ($trd_upri.equalsIgnoreCase(name)) {
			return trd_upri();
		}
		if ($trd_amt_gap.equalsIgnoreCase(name)) {
			return trd_amt_gap();
		}
		if ($std_trd_amt.equalsIgnoreCase(name)) {
			return std_trd_amt();
		}
		if ($trd_amt.equalsIgnoreCase(name)) {
			return trd_amt();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($xrate_gap.equalsIgnoreCase(name)) {
			return xrate_gap();
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			return std_xrate();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($out_unit_gap.equalsIgnoreCase(name)) {
			return out_unit_gap();
		}
		if ($std_out_unit.equalsIgnoreCase(name)) {
			return std_out_unit();
		}
		if ($out_unit.equalsIgnoreCase(name)) {
			return out_unit();
		}
		if ($purc_upri_gap.equalsIgnoreCase(name)) {
			return purc_upri_gap();
		}
		if ($std_purc_upri.equalsIgnoreCase(name)) {
			return std_purc_upri();
		}
		if ($out_diff.equalsIgnoreCase(name)) {
			return out_diff();
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			return upri_diff();
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			return rate_diff();
		}
		if ($std_out_amt.equalsIgnoreCase(name)) {
			return std_out_amt();
		}
		if ($out_amt.equalsIgnoreCase(name)) {
			return out_amt();
		}
		if ($purc_amt_gap.equalsIgnoreCase(name)) {
			return purc_amt_gap();
		}
		if ($std_purc_amt.equalsIgnoreCase(name)) {
			return std_purc_amt();
		}
		if ($purc_cost_gap.equalsIgnoreCase(name)) {
			return purc_cost_gap();
		}
		if ($std_purc_cost.equalsIgnoreCase(name)) {
			return std_purc_cost();
		}
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			return var_cost();
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			return fxd_cost();
		}
		if ($col_000.equalsIgnoreCase(name)) {
			return col_000();
		}
		if ($col_001.equalsIgnoreCase(name)) {
			return col_001();
		}
		if ($col_002.equalsIgnoreCase(name)) {
			return col_002();
		}
		if ($col_003.equalsIgnoreCase(name)) {
			return col_003();
		}
		if ($col_004.equalsIgnoreCase(name)) {
			return col_004();
		}
		if ($col_005.equalsIgnoreCase(name)) {
			return col_005();
		}
		if ($col_006.equalsIgnoreCase(name)) {
			return col_006();
		}
		if ($col_007.equalsIgnoreCase(name)) {
			return col_007();
		}
		if ($col_008.equalsIgnoreCase(name)) {
			return col_008();
		}
		if ($col_009.equalsIgnoreCase(name)) {
			return col_009();
		}
		if ($col_010.equalsIgnoreCase(name)) {
			return col_010();
		}
		if ($col_011.equalsIgnoreCase(name)) {
			return col_011();
		}
		if ($col_012.equalsIgnoreCase(name)) {
			return col_012();
		}
		if ($col_013.equalsIgnoreCase(name)) {
			return col_013();
		}
		if ($col_014.equalsIgnoreCase(name)) {
			return col_014();
		}
		if ($col_015.equalsIgnoreCase(name)) {
			return col_015();
		}
		if ($col_016.equalsIgnoreCase(name)) {
			return col_016();
		}
		if ($col_017.equalsIgnoreCase(name)) {
			return col_017();
		}
		if ($col_018.equalsIgnoreCase(name)) {
			return col_018();
		}
		if ($col_019.equalsIgnoreCase(name)) {
			return col_019();
		}
		if ($col_020.equalsIgnoreCase(name)) {
			return col_020();
		}
		if ($col_021.equalsIgnoreCase(name)) {
			return col_021();
		}
		if ($col_022.equalsIgnoreCase(name)) {
			return col_022();
		}
		if ($col_023.equalsIgnoreCase(name)) {
			return col_023();
		}
		if ($col_024.equalsIgnoreCase(name)) {
			return col_024();
		}
		if ($col_025.equalsIgnoreCase(name)) {
			return col_025();
		}
		if ($col_026.equalsIgnoreCase(name)) {
			return col_026();
		}
		if ($col_027.equalsIgnoreCase(name)) {
			return col_027();
		}
		if ($col_028.equalsIgnoreCase(name)) {
			return col_028();
		}
		if ($col_029.equalsIgnoreCase(name)) {
			return col_029();
		}
		if ($col_030.equalsIgnoreCase(name)) {
			return col_030();
		}
		if ($col_031.equalsIgnoreCase(name)) {
			return col_031();
		}
		if ($col_032.equalsIgnoreCase(name)) {
			return col_032();
		}
		if ($col_033.equalsIgnoreCase(name)) {
			return col_033();
		}
		if ($col_034.equalsIgnoreCase(name)) {
			return col_034();
		}
		if ($col_035.equalsIgnoreCase(name)) {
			return col_035();
		}
		if ($col_036.equalsIgnoreCase(name)) {
			return col_036();
		}
		if ($col_037.equalsIgnoreCase(name)) {
			return col_037();
		}
		if ($col_038.equalsIgnoreCase(name)) {
			return col_038();
		}
		if ($col_039.equalsIgnoreCase(name)) {
			return col_039();
		}
		if ($col_040.equalsIgnoreCase(name)) {
			return col_040();
		}
		if ($col_041.equalsIgnoreCase(name)) {
			return col_041();
		}
		if ($col_042.equalsIgnoreCase(name)) {
			return col_042();
		}
		if ($col_043.equalsIgnoreCase(name)) {
			return col_043();
		}
		if ($col_044.equalsIgnoreCase(name)) {
			return col_044();
		}
		if ($col_045.equalsIgnoreCase(name)) {
			return col_045();
		}
		if ($col_046.equalsIgnoreCase(name)) {
			return col_046();
		}
		if ($col_047.equalsIgnoreCase(name)) {
			return col_047();
		}
		if ($col_048.equalsIgnoreCase(name)) {
			return col_048();
		}
		if ($col_049.equalsIgnoreCase(name)) {
			return col_049();
		}
		if ($col_050.equalsIgnoreCase(name)) {
			return col_050();
		}
		if ($col_051.equalsIgnoreCase(name)) {
			return col_051();
		}
		if ($col_052.equalsIgnoreCase(name)) {
			return col_052();
		}
		if ($col_053.equalsIgnoreCase(name)) {
			return col_053();
		}
		if ($col_054.equalsIgnoreCase(name)) {
			return col_054();
		}
		if ($col_055.equalsIgnoreCase(name)) {
			return col_055();
		}
		if ($col_056.equalsIgnoreCase(name)) {
			return col_056();
		}
		if ($col_057.equalsIgnoreCase(name)) {
			return col_057();
		}
		if ($col_058.equalsIgnoreCase(name)) {
			return col_058();
		}
		if ($col_059.equalsIgnoreCase(name)) {
			return col_059();
		}
		if ($col_060.equalsIgnoreCase(name)) {
			return col_060();
		}
		if ($col_061.equalsIgnoreCase(name)) {
			return col_061();
		}
		if ($col_062.equalsIgnoreCase(name)) {
			return col_062();
		}
		if ($col_063.equalsIgnoreCase(name)) {
			return col_063();
		}
		if ($col_064.equalsIgnoreCase(name)) {
			return col_064();
		}
		if ($col_065.equalsIgnoreCase(name)) {
			return col_065();
		}
		if ($col_066.equalsIgnoreCase(name)) {
			return col_066();
		}
		if ($col_067.equalsIgnoreCase(name)) {
			return col_067();
		}
		if ($col_068.equalsIgnoreCase(name)) {
			return col_068();
		}
		if ($col_069.equalsIgnoreCase(name)) {
			return col_069();
		}
		if ($col_070.equalsIgnoreCase(name)) {
			return col_070();
		}
		if ($col_071.equalsIgnoreCase(name)) {
			return col_071();
		}
		if ($col_072.equalsIgnoreCase(name)) {
			return col_072();
		}
		if ($col_073.equalsIgnoreCase(name)) {
			return col_073();
		}
		if ($col_074.equalsIgnoreCase(name)) {
			return col_074();
		}
		if ($col_075.equalsIgnoreCase(name)) {
			return col_075();
		}
		if ($col_076.equalsIgnoreCase(name)) {
			return col_076();
		}
		if ($col_077.equalsIgnoreCase(name)) {
			return col_077();
		}
		if ($col_078.equalsIgnoreCase(name)) {
			return col_078();
		}
		if ($col_079.equalsIgnoreCase(name)) {
			return col_079();
		}
		if ($col_080.equalsIgnoreCase(name)) {
			return col_080();
		}
		if ($col_081.equalsIgnoreCase(name)) {
			return col_081();
		}
		if ($col_082.equalsIgnoreCase(name)) {
			return col_082();
		}
		if ($col_083.equalsIgnoreCase(name)) {
			return col_083();
		}
		if ($col_084.equalsIgnoreCase(name)) {
			return col_084();
		}
		if ($col_085.equalsIgnoreCase(name)) {
			return col_085();
		}
		if ($col_086.equalsIgnoreCase(name)) {
			return col_086();
		}
		if ($col_087.equalsIgnoreCase(name)) {
			return col_087();
		}
		if ($col_088.equalsIgnoreCase(name)) {
			return col_088();
		}
		if ($col_089.equalsIgnoreCase(name)) {
			return col_089();
		}
		if ($col_090.equalsIgnoreCase(name)) {
			return col_090();
		}
		if ($col_091.equalsIgnoreCase(name)) {
			return col_091();
		}
		if ($col_092.equalsIgnoreCase(name)) {
			return col_092();
		}
		if ($col_093.equalsIgnoreCase(name)) {
			return col_093();
		}
		if ($col_094.equalsIgnoreCase(name)) {
			return col_094();
		}
		if ($col_095.equalsIgnoreCase(name)) {
			return col_095();
		}
		if ($col_096.equalsIgnoreCase(name)) {
			return col_096();
		}
		if ($col_097.equalsIgnoreCase(name)) {
			return col_097();
		}
		if ($col_098.equalsIgnoreCase(name)) {
			return col_098();
		}
		if ($col_099.equalsIgnoreCase(name)) {
			return col_099();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			return dummy_term();
		}
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			area_nm(value);
			return;
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			bp_grp_cd1(value);
			return;
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			bp_grp_nm1(value);
			return;
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			bp_grp_cd2(value);
			return;
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			bp_grp_nm2(value);
			return;
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			bp_grp_cd3(value);
			return;
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			bp_grp_nm3(value);
			return;
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			bp_grp_cd4(value);
			return;
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			bp_grp_nm4(value);
			return;
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			bp_grp_cd5(value);
			return;
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			bp_grp_nm5(value);
			return;
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			bp_grp_cd6(value);
			return;
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			bp_grp_nm6(value);
			return;
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			bp_grp_cd7(value);
			return;
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			bp_grp_nm7(value);
			return;
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			bp_grp_cd8(value);
			return;
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			bp_grp_nm8(value);
			return;
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			bp_grp_cd9(value);
			return;
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			bp_grp_nm9(value);
			return;
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			bp_grp_cd10(value);
			return;
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			bp_grp_nm10(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			odr_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($out_cost.equalsIgnoreCase(name)) {
			out_cost(value);
			return;
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($out_upri.equalsIgnoreCase(name)) {
			out_upri(value);
			return;
		}
		if ($odr_purc_upri.equalsIgnoreCase(name)) {
			odr_purc_upri(value);
			return;
		}
		if ($odr_out_upri.equalsIgnoreCase(name)) {
			odr_out_upri(value);
			return;
		}
		if ($trd_upri_gap.equalsIgnoreCase(name)) {
			trd_upri_gap(value);
			return;
		}
		if ($std_trd_upri.equalsIgnoreCase(name)) {
			std_trd_upri(value);
			return;
		}
		if ($trd_upri.equalsIgnoreCase(name)) {
			trd_upri(value);
			return;
		}
		if ($trd_amt_gap.equalsIgnoreCase(name)) {
			trd_amt_gap(value);
			return;
		}
		if ($std_trd_amt.equalsIgnoreCase(name)) {
			std_trd_amt(value);
			return;
		}
		if ($trd_amt.equalsIgnoreCase(name)) {
			trd_amt(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($xrate_gap.equalsIgnoreCase(name)) {
			xrate_gap(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($out_unit_gap.equalsIgnoreCase(name)) {
			out_unit_gap(value);
			return;
		}
		if ($std_out_unit.equalsIgnoreCase(name)) {
			std_out_unit(value);
			return;
		}
		if ($out_unit.equalsIgnoreCase(name)) {
			out_unit(value);
			return;
		}
		if ($purc_upri_gap.equalsIgnoreCase(name)) {
			purc_upri_gap(value);
			return;
		}
		if ($std_purc_upri.equalsIgnoreCase(name)) {
			std_purc_upri(value);
			return;
		}
		if ($out_diff.equalsIgnoreCase(name)) {
			out_diff(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			rate_diff(value);
			return;
		}
		if ($std_out_amt.equalsIgnoreCase(name)) {
			std_out_amt(value);
			return;
		}
		if ($out_amt.equalsIgnoreCase(name)) {
			out_amt(value);
			return;
		}
		if ($purc_amt_gap.equalsIgnoreCase(name)) {
			purc_amt_gap(value);
			return;
		}
		if ($std_purc_amt.equalsIgnoreCase(name)) {
			std_purc_amt(value);
			return;
		}
		if ($purc_cost_gap.equalsIgnoreCase(name)) {
			purc_cost_gap(value);
			return;
		}
		if ($std_purc_cost.equalsIgnoreCase(name)) {
			std_purc_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			odr_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($out_cost.equalsIgnoreCase(name)) {
			out_cost(value);
			return;
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($out_upri.equalsIgnoreCase(name)) {
			out_upri(value);
			return;
		}
		if ($odr_purc_upri.equalsIgnoreCase(name)) {
			odr_purc_upri(value);
			return;
		}
		if ($odr_out_upri.equalsIgnoreCase(name)) {
			odr_out_upri(value);
			return;
		}
		if ($trd_upri_gap.equalsIgnoreCase(name)) {
			trd_upri_gap(value);
			return;
		}
		if ($std_trd_upri.equalsIgnoreCase(name)) {
			std_trd_upri(value);
			return;
		}
		if ($trd_upri.equalsIgnoreCase(name)) {
			trd_upri(value);
			return;
		}
		if ($trd_amt_gap.equalsIgnoreCase(name)) {
			trd_amt_gap(value);
			return;
		}
		if ($std_trd_amt.equalsIgnoreCase(name)) {
			std_trd_amt(value);
			return;
		}
		if ($trd_amt.equalsIgnoreCase(name)) {
			trd_amt(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($xrate_gap.equalsIgnoreCase(name)) {
			xrate_gap(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($out_unit_gap.equalsIgnoreCase(name)) {
			out_unit_gap(value);
			return;
		}
		if ($std_out_unit.equalsIgnoreCase(name)) {
			std_out_unit(value);
			return;
		}
		if ($out_unit.equalsIgnoreCase(name)) {
			out_unit(value);
			return;
		}
		if ($purc_upri_gap.equalsIgnoreCase(name)) {
			purc_upri_gap(value);
			return;
		}
		if ($std_purc_upri.equalsIgnoreCase(name)) {
			std_purc_upri(value);
			return;
		}
		if ($out_diff.equalsIgnoreCase(name)) {
			out_diff(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			rate_diff(value);
			return;
		}
		if ($std_out_amt.equalsIgnoreCase(name)) {
			std_out_amt(value);
			return;
		}
		if ($out_amt.equalsIgnoreCase(name)) {
			out_amt(value);
			return;
		}
		if ($purc_amt_gap.equalsIgnoreCase(name)) {
			purc_amt_gap(value);
			return;
		}
		if ($std_purc_amt.equalsIgnoreCase(name)) {
			std_purc_amt(value);
			return;
		}
		if ($purc_cost_gap.equalsIgnoreCase(name)) {
			purc_cost_gap(value);
			return;
		}
		if ($std_purc_cost.equalsIgnoreCase(name)) {
			std_purc_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			odr_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($out_cost.equalsIgnoreCase(name)) {
			out_cost(value);
			return;
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($out_upri.equalsIgnoreCase(name)) {
			out_upri(value);
			return;
		}
		if ($odr_purc_upri.equalsIgnoreCase(name)) {
			odr_purc_upri(value);
			return;
		}
		if ($odr_out_upri.equalsIgnoreCase(name)) {
			odr_out_upri(value);
			return;
		}
		if ($trd_upri_gap.equalsIgnoreCase(name)) {
			trd_upri_gap(value);
			return;
		}
		if ($std_trd_upri.equalsIgnoreCase(name)) {
			std_trd_upri(value);
			return;
		}
		if ($trd_upri.equalsIgnoreCase(name)) {
			trd_upri(value);
			return;
		}
		if ($trd_amt_gap.equalsIgnoreCase(name)) {
			trd_amt_gap(value);
			return;
		}
		if ($std_trd_amt.equalsIgnoreCase(name)) {
			std_trd_amt(value);
			return;
		}
		if ($trd_amt.equalsIgnoreCase(name)) {
			trd_amt(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($xrate_gap.equalsIgnoreCase(name)) {
			xrate_gap(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($out_unit_gap.equalsIgnoreCase(name)) {
			out_unit_gap(value);
			return;
		}
		if ($std_out_unit.equalsIgnoreCase(name)) {
			std_out_unit(value);
			return;
		}
		if ($out_unit.equalsIgnoreCase(name)) {
			out_unit(value);
			return;
		}
		if ($purc_upri_gap.equalsIgnoreCase(name)) {
			purc_upri_gap(value);
			return;
		}
		if ($std_purc_upri.equalsIgnoreCase(name)) {
			std_purc_upri(value);
			return;
		}
		if ($out_diff.equalsIgnoreCase(name)) {
			out_diff(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			rate_diff(value);
			return;
		}
		if ($std_out_amt.equalsIgnoreCase(name)) {
			std_out_amt(value);
			return;
		}
		if ($out_amt.equalsIgnoreCase(name)) {
			out_amt(value);
			return;
		}
		if ($purc_amt_gap.equalsIgnoreCase(name)) {
			purc_amt_gap(value);
			return;
		}
		if ($std_purc_amt.equalsIgnoreCase(name)) {
			std_purc_amt(value);
			return;
		}
		if ($purc_cost_gap.equalsIgnoreCase(name)) {
			purc_cost_gap(value);
			return;
		}
		if ($std_purc_cost.equalsIgnoreCase(name)) {
			std_purc_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			odr_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($out_cost.equalsIgnoreCase(name)) {
			out_cost(value);
			return;
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($out_upri.equalsIgnoreCase(name)) {
			out_upri(value);
			return;
		}
		if ($odr_purc_upri.equalsIgnoreCase(name)) {
			odr_purc_upri(value);
			return;
		}
		if ($odr_out_upri.equalsIgnoreCase(name)) {
			odr_out_upri(value);
			return;
		}
		if ($trd_upri_gap.equalsIgnoreCase(name)) {
			trd_upri_gap(value);
			return;
		}
		if ($std_trd_upri.equalsIgnoreCase(name)) {
			std_trd_upri(value);
			return;
		}
		if ($trd_upri.equalsIgnoreCase(name)) {
			trd_upri(value);
			return;
		}
		if ($trd_amt_gap.equalsIgnoreCase(name)) {
			trd_amt_gap(value);
			return;
		}
		if ($std_trd_amt.equalsIgnoreCase(name)) {
			std_trd_amt(value);
			return;
		}
		if ($trd_amt.equalsIgnoreCase(name)) {
			trd_amt(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($xrate_gap.equalsIgnoreCase(name)) {
			xrate_gap(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($out_unit_gap.equalsIgnoreCase(name)) {
			out_unit_gap(value);
			return;
		}
		if ($std_out_unit.equalsIgnoreCase(name)) {
			std_out_unit(value);
			return;
		}
		if ($out_unit.equalsIgnoreCase(name)) {
			out_unit(value);
			return;
		}
		if ($purc_upri_gap.equalsIgnoreCase(name)) {
			purc_upri_gap(value);
			return;
		}
		if ($std_purc_upri.equalsIgnoreCase(name)) {
			std_purc_upri(value);
			return;
		}
		if ($out_diff.equalsIgnoreCase(name)) {
			out_diff(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			rate_diff(value);
			return;
		}
		if ($std_out_amt.equalsIgnoreCase(name)) {
			std_out_amt(value);
			return;
		}
		if ($out_amt.equalsIgnoreCase(name)) {
			out_amt(value);
			return;
		}
		if ($purc_amt_gap.equalsIgnoreCase(name)) {
			purc_amt_gap(value);
			return;
		}
		if ($std_purc_amt.equalsIgnoreCase(name)) {
			std_purc_amt(value);
			return;
		}
		if ($purc_cost_gap.equalsIgnoreCase(name)) {
			purc_cost_gap(value);
			return;
		}
		if ($std_purc_cost.equalsIgnoreCase(name)) {
			std_purc_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			odr_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($out_cost.equalsIgnoreCase(name)) {
			out_cost(value);
			return;
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($out_upri.equalsIgnoreCase(name)) {
			out_upri(value);
			return;
		}
		if ($odr_purc_upri.equalsIgnoreCase(name)) {
			odr_purc_upri(value);
			return;
		}
		if ($odr_out_upri.equalsIgnoreCase(name)) {
			odr_out_upri(value);
			return;
		}
		if ($trd_upri_gap.equalsIgnoreCase(name)) {
			trd_upri_gap(value);
			return;
		}
		if ($std_trd_upri.equalsIgnoreCase(name)) {
			std_trd_upri(value);
			return;
		}
		if ($trd_upri.equalsIgnoreCase(name)) {
			trd_upri(value);
			return;
		}
		if ($trd_amt_gap.equalsIgnoreCase(name)) {
			trd_amt_gap(value);
			return;
		}
		if ($std_trd_amt.equalsIgnoreCase(name)) {
			std_trd_amt(value);
			return;
		}
		if ($trd_amt.equalsIgnoreCase(name)) {
			trd_amt(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($xrate_gap.equalsIgnoreCase(name)) {
			xrate_gap(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($out_unit_gap.equalsIgnoreCase(name)) {
			out_unit_gap(value);
			return;
		}
		if ($std_out_unit.equalsIgnoreCase(name)) {
			std_out_unit(value);
			return;
		}
		if ($out_unit.equalsIgnoreCase(name)) {
			out_unit(value);
			return;
		}
		if ($purc_upri_gap.equalsIgnoreCase(name)) {
			purc_upri_gap(value);
			return;
		}
		if ($std_purc_upri.equalsIgnoreCase(name)) {
			std_purc_upri(value);
			return;
		}
		if ($out_diff.equalsIgnoreCase(name)) {
			out_diff(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			rate_diff(value);
			return;
		}
		if ($std_out_amt.equalsIgnoreCase(name)) {
			std_out_amt(value);
			return;
		}
		if ($out_amt.equalsIgnoreCase(name)) {
			out_amt(value);
			return;
		}
		if ($purc_amt_gap.equalsIgnoreCase(name)) {
			purc_amt_gap(value);
			return;
		}
		if ($std_purc_amt.equalsIgnoreCase(name)) {
			std_purc_amt(value);
			return;
		}
		if ($purc_cost_gap.equalsIgnoreCase(name)) {
			purc_cost_gap(value);
			return;
		}
		if ($std_purc_cost.equalsIgnoreCase(name)) {
			std_purc_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			dummy_term(value);
			return;
		}
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			area_nm(value);
			return;
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			bp_grp_cd1(value);
			return;
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			bp_grp_nm1(value);
			return;
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			bp_grp_cd2(value);
			return;
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			bp_grp_nm2(value);
			return;
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			bp_grp_cd3(value);
			return;
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			bp_grp_nm3(value);
			return;
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			bp_grp_cd4(value);
			return;
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			bp_grp_nm4(value);
			return;
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			bp_grp_cd5(value);
			return;
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			bp_grp_nm5(value);
			return;
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			bp_grp_cd6(value);
			return;
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			bp_grp_nm6(value);
			return;
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			bp_grp_cd7(value);
			return;
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			bp_grp_nm7(value);
			return;
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			bp_grp_cd8(value);
			return;
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			bp_grp_nm8(value);
			return;
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			bp_grp_cd9(value);
			return;
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			bp_grp_nm9(value);
			return;
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			bp_grp_cd10(value);
			return;
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			bp_grp_nm10(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			odr_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($out_cost.equalsIgnoreCase(name)) {
			out_cost(value);
			return;
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($out_upri.equalsIgnoreCase(name)) {
			out_upri(value);
			return;
		}
		if ($odr_purc_upri.equalsIgnoreCase(name)) {
			odr_purc_upri(value);
			return;
		}
		if ($odr_out_upri.equalsIgnoreCase(name)) {
			odr_out_upri(value);
			return;
		}
		if ($trd_upri_gap.equalsIgnoreCase(name)) {
			trd_upri_gap(value);
			return;
		}
		if ($std_trd_upri.equalsIgnoreCase(name)) {
			std_trd_upri(value);
			return;
		}
		if ($trd_upri.equalsIgnoreCase(name)) {
			trd_upri(value);
			return;
		}
		if ($trd_amt_gap.equalsIgnoreCase(name)) {
			trd_amt_gap(value);
			return;
		}
		if ($std_trd_amt.equalsIgnoreCase(name)) {
			std_trd_amt(value);
			return;
		}
		if ($trd_amt.equalsIgnoreCase(name)) {
			trd_amt(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($xrate_gap.equalsIgnoreCase(name)) {
			xrate_gap(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($out_unit_gap.equalsIgnoreCase(name)) {
			out_unit_gap(value);
			return;
		}
		if ($std_out_unit.equalsIgnoreCase(name)) {
			std_out_unit(value);
			return;
		}
		if ($out_unit.equalsIgnoreCase(name)) {
			out_unit(value);
			return;
		}
		if ($purc_upri_gap.equalsIgnoreCase(name)) {
			purc_upri_gap(value);
			return;
		}
		if ($std_purc_upri.equalsIgnoreCase(name)) {
			std_purc_upri(value);
			return;
		}
		if ($out_diff.equalsIgnoreCase(name)) {
			out_diff(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			rate_diff(value);
			return;
		}
		if ($std_out_amt.equalsIgnoreCase(name)) {
			std_out_amt(value);
			return;
		}
		if ($out_amt.equalsIgnoreCase(name)) {
			out_amt(value);
			return;
		}
		if ($purc_amt_gap.equalsIgnoreCase(name)) {
			purc_amt_gap(value);
			return;
		}
		if ($std_purc_amt.equalsIgnoreCase(name)) {
			std_purc_amt(value);
			return;
		}
		if ($purc_cost_gap.equalsIgnoreCase(name)) {
			purc_cost_gap(value);
			return;
		}
		if ($std_purc_cost.equalsIgnoreCase(name)) {
			std_purc_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			odr_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($out_cost.equalsIgnoreCase(name)) {
			out_cost(value);
			return;
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($out_upri.equalsIgnoreCase(name)) {
			out_upri(value);
			return;
		}
		if ($odr_purc_upri.equalsIgnoreCase(name)) {
			odr_purc_upri(value);
			return;
		}
		if ($odr_out_upri.equalsIgnoreCase(name)) {
			odr_out_upri(value);
			return;
		}
		if ($trd_upri_gap.equalsIgnoreCase(name)) {
			trd_upri_gap(value);
			return;
		}
		if ($std_trd_upri.equalsIgnoreCase(name)) {
			std_trd_upri(value);
			return;
		}
		if ($trd_upri.equalsIgnoreCase(name)) {
			trd_upri(value);
			return;
		}
		if ($trd_amt_gap.equalsIgnoreCase(name)) {
			trd_amt_gap(value);
			return;
		}
		if ($std_trd_amt.equalsIgnoreCase(name)) {
			std_trd_amt(value);
			return;
		}
		if ($trd_amt.equalsIgnoreCase(name)) {
			trd_amt(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($xrate_gap.equalsIgnoreCase(name)) {
			xrate_gap(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($out_unit_gap.equalsIgnoreCase(name)) {
			out_unit_gap(value);
			return;
		}
		if ($std_out_unit.equalsIgnoreCase(name)) {
			std_out_unit(value);
			return;
		}
		if ($out_unit.equalsIgnoreCase(name)) {
			out_unit(value);
			return;
		}
		if ($purc_upri_gap.equalsIgnoreCase(name)) {
			purc_upri_gap(value);
			return;
		}
		if ($std_purc_upri.equalsIgnoreCase(name)) {
			std_purc_upri(value);
			return;
		}
		if ($out_diff.equalsIgnoreCase(name)) {
			out_diff(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			rate_diff(value);
			return;
		}
		if ($std_out_amt.equalsIgnoreCase(name)) {
			std_out_amt(value);
			return;
		}
		if ($out_amt.equalsIgnoreCase(name)) {
			out_amt(value);
			return;
		}
		if ($purc_amt_gap.equalsIgnoreCase(name)) {
			purc_amt_gap(value);
			return;
		}
		if ($std_purc_amt.equalsIgnoreCase(name)) {
			std_purc_amt(value);
			return;
		}
		if ($purc_cost_gap.equalsIgnoreCase(name)) {
			purc_cost_gap(value);
			return;
		}
		if ($std_purc_cost.equalsIgnoreCase(name)) {
			std_purc_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			odr_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($out_cost.equalsIgnoreCase(name)) {
			out_cost(value);
			return;
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($out_upri.equalsIgnoreCase(name)) {
			out_upri(value);
			return;
		}
		if ($odr_purc_upri.equalsIgnoreCase(name)) {
			odr_purc_upri(value);
			return;
		}
		if ($odr_out_upri.equalsIgnoreCase(name)) {
			odr_out_upri(value);
			return;
		}
		if ($trd_upri_gap.equalsIgnoreCase(name)) {
			trd_upri_gap(value);
			return;
		}
		if ($std_trd_upri.equalsIgnoreCase(name)) {
			std_trd_upri(value);
			return;
		}
		if ($trd_upri.equalsIgnoreCase(name)) {
			trd_upri(value);
			return;
		}
		if ($trd_amt_gap.equalsIgnoreCase(name)) {
			trd_amt_gap(value);
			return;
		}
		if ($std_trd_amt.equalsIgnoreCase(name)) {
			std_trd_amt(value);
			return;
		}
		if ($trd_amt.equalsIgnoreCase(name)) {
			trd_amt(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($xrate_gap.equalsIgnoreCase(name)) {
			xrate_gap(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($out_unit_gap.equalsIgnoreCase(name)) {
			out_unit_gap(value);
			return;
		}
		if ($std_out_unit.equalsIgnoreCase(name)) {
			std_out_unit(value);
			return;
		}
		if ($out_unit.equalsIgnoreCase(name)) {
			out_unit(value);
			return;
		}
		if ($purc_upri_gap.equalsIgnoreCase(name)) {
			purc_upri_gap(value);
			return;
		}
		if ($std_purc_upri.equalsIgnoreCase(name)) {
			std_purc_upri(value);
			return;
		}
		if ($out_diff.equalsIgnoreCase(name)) {
			out_diff(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			rate_diff(value);
			return;
		}
		if ($std_out_amt.equalsIgnoreCase(name)) {
			std_out_amt(value);
			return;
		}
		if ($out_amt.equalsIgnoreCase(name)) {
			out_amt(value);
			return;
		}
		if ($purc_amt_gap.equalsIgnoreCase(name)) {
			purc_amt_gap(value);
			return;
		}
		if ($std_purc_amt.equalsIgnoreCase(name)) {
			std_purc_amt(value);
			return;
		}
		if ($purc_cost_gap.equalsIgnoreCase(name)) {
			purc_cost_gap(value);
			return;
		}
		if ($std_purc_cost.equalsIgnoreCase(name)) {
			std_purc_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			odr_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($out_cost.equalsIgnoreCase(name)) {
			out_cost(value);
			return;
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($out_upri.equalsIgnoreCase(name)) {
			out_upri(value);
			return;
		}
		if ($odr_purc_upri.equalsIgnoreCase(name)) {
			odr_purc_upri(value);
			return;
		}
		if ($odr_out_upri.equalsIgnoreCase(name)) {
			odr_out_upri(value);
			return;
		}
		if ($trd_upri_gap.equalsIgnoreCase(name)) {
			trd_upri_gap(value);
			return;
		}
		if ($std_trd_upri.equalsIgnoreCase(name)) {
			std_trd_upri(value);
			return;
		}
		if ($trd_upri.equalsIgnoreCase(name)) {
			trd_upri(value);
			return;
		}
		if ($trd_amt_gap.equalsIgnoreCase(name)) {
			trd_amt_gap(value);
			return;
		}
		if ($std_trd_amt.equalsIgnoreCase(name)) {
			std_trd_amt(value);
			return;
		}
		if ($trd_amt.equalsIgnoreCase(name)) {
			trd_amt(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($xrate_gap.equalsIgnoreCase(name)) {
			xrate_gap(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($out_unit_gap.equalsIgnoreCase(name)) {
			out_unit_gap(value);
			return;
		}
		if ($std_out_unit.equalsIgnoreCase(name)) {
			std_out_unit(value);
			return;
		}
		if ($out_unit.equalsIgnoreCase(name)) {
			out_unit(value);
			return;
		}
		if ($purc_upri_gap.equalsIgnoreCase(name)) {
			purc_upri_gap(value);
			return;
		}
		if ($std_purc_upri.equalsIgnoreCase(name)) {
			std_purc_upri(value);
			return;
		}
		if ($out_diff.equalsIgnoreCase(name)) {
			out_diff(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			rate_diff(value);
			return;
		}
		if ($std_out_amt.equalsIgnoreCase(name)) {
			std_out_amt(value);
			return;
		}
		if ($out_amt.equalsIgnoreCase(name)) {
			out_amt(value);
			return;
		}
		if ($purc_amt_gap.equalsIgnoreCase(name)) {
			purc_amt_gap(value);
			return;
		}
		if ($std_purc_amt.equalsIgnoreCase(name)) {
			std_purc_amt(value);
			return;
		}
		if ($purc_cost_gap.equalsIgnoreCase(name)) {
			purc_cost_gap(value);
			return;
		}
		if ($std_purc_cost.equalsIgnoreCase(name)) {
			std_purc_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			odr_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($out_cost.equalsIgnoreCase(name)) {
			out_cost(value);
			return;
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($out_upri.equalsIgnoreCase(name)) {
			out_upri(value);
			return;
		}
		if ($odr_purc_upri.equalsIgnoreCase(name)) {
			odr_purc_upri(value);
			return;
		}
		if ($odr_out_upri.equalsIgnoreCase(name)) {
			odr_out_upri(value);
			return;
		}
		if ($trd_upri_gap.equalsIgnoreCase(name)) {
			trd_upri_gap(value);
			return;
		}
		if ($std_trd_upri.equalsIgnoreCase(name)) {
			std_trd_upri(value);
			return;
		}
		if ($trd_upri.equalsIgnoreCase(name)) {
			trd_upri(value);
			return;
		}
		if ($trd_amt_gap.equalsIgnoreCase(name)) {
			trd_amt_gap(value);
			return;
		}
		if ($std_trd_amt.equalsIgnoreCase(name)) {
			std_trd_amt(value);
			return;
		}
		if ($trd_amt.equalsIgnoreCase(name)) {
			trd_amt(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($xrate_gap.equalsIgnoreCase(name)) {
			xrate_gap(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($out_unit_gap.equalsIgnoreCase(name)) {
			out_unit_gap(value);
			return;
		}
		if ($std_out_unit.equalsIgnoreCase(name)) {
			std_out_unit(value);
			return;
		}
		if ($out_unit.equalsIgnoreCase(name)) {
			out_unit(value);
			return;
		}
		if ($purc_upri_gap.equalsIgnoreCase(name)) {
			purc_upri_gap(value);
			return;
		}
		if ($std_purc_upri.equalsIgnoreCase(name)) {
			std_purc_upri(value);
			return;
		}
		if ($out_diff.equalsIgnoreCase(name)) {
			out_diff(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($rate_diff.equalsIgnoreCase(name)) {
			rate_diff(value);
			return;
		}
		if ($std_out_amt.equalsIgnoreCase(name)) {
			std_out_amt(value);
			return;
		}
		if ($out_amt.equalsIgnoreCase(name)) {
			out_amt(value);
			return;
		}
		if ($purc_amt_gap.equalsIgnoreCase(name)) {
			purc_amt_gap(value);
			return;
		}
		if ($std_purc_amt.equalsIgnoreCase(name)) {
			std_purc_amt(value);
			return;
		}
		if ($purc_cost_gap.equalsIgnoreCase(name)) {
			purc_cost_gap(value);
			return;
		}
		if ($std_purc_cost.equalsIgnoreCase(name)) {
			std_purc_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			dummy_term(value);
			return;
		}
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

