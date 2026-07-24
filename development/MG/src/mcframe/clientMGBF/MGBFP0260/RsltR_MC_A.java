package mcframe.clientMGBF.MGBFP0260;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

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
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
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
	public static final String $itm_p = "itm_p";
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
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri01 = "upri01";
	public static final String $qty01_p = "qty01_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std01 = "std01";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt01 = "amt01";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff01 = "diff01";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri02 = "upri02";
	public static final String $qty02_p = "qty02_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std02 = "std02";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt02 = "amt02";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff02 = "diff02";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri03 = "upri03";
	public static final String $qty03_p = "qty03_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std03 = "std03";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt03 = "amt03";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff03 = "diff03";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri04 = "upri04";
	public static final String $qty04_p = "qty04_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std04 = "std04";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt04 = "amt04";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff04 = "diff04";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri05 = "upri05";
	public static final String $qty05_p = "qty05_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std05 = "std05";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt05 = "amt05";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff05 = "diff05";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri06 = "upri06";
	public static final String $qty06_p = "qty06_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std06 = "std06";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt06 = "amt06";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff06 = "diff06";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri07 = "upri07";
	public static final String $qty07_p = "qty07_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std07 = "std07";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt07 = "amt07";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff07 = "diff07";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri08 = "upri08";
	public static final String $qty08_p = "qty08_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std08 = "std08";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt08 = "amt08";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff08 = "diff08";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri09 = "upri09";
	public static final String $qty09_p = "qty09_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std09 = "std09";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt09 = "amt09";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff09 = "diff09";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri10 = "upri10";
	public static final String $qty10_p = "qty10_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std10 = "std10";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt10 = "amt10";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff10 = "diff10";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri11 = "upri11";
	public static final String $qty11_p = "qty11_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std11 = "std11";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt11 = "amt11";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff11 = "diff11";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri12 = "upri12";
	public static final String $qty12_p = "qty12_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std12 = "std12";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt12 = "amt12";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff12 = "diff12";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri13 = "upri13";
	public static final String $qty13_p = "qty13_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std13 = "std13";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt13 = "amt13";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff13 = "diff13";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri14 = "upri14";
	public static final String $qty14_p = "qty14_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std14 = "std14";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt14 = "amt14";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff14 = "diff14";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri15 = "upri15";
	public static final String $qty15_p = "qty15_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std15 = "std15";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt15 = "amt15";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff15 = "diff15";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri16 = "upri16";
	public static final String $qty16_p = "qty16_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std16 = "std16";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt16 = "amt16";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff16 = "diff16";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri17 = "upri17";
	public static final String $qty17_p = "qty17_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std17 = "std17";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt17 = "amt17";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff17 = "diff17";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri18 = "upri18";
	public static final String $qty18_p = "qty18_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std18 = "std18";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt18 = "amt18";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff18 = "diff18";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri19 = "upri19";
	public static final String $qty19_p = "qty19_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std19 = "std19";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt19 = "amt19";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff19 = "diff19";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri20 = "upri20";
	public static final String $qty20_p = "qty20_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std20 = "std20";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt20 = "amt20";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff20 = "diff20";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri21 = "upri21";
	public static final String $qty21_p = "qty21_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std21 = "std21";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt21 = "amt21";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff21 = "diff21";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri22 = "upri22";
	public static final String $qty22_p = "qty22_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std22 = "std22";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt22 = "amt22";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff22 = "diff22";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri23 = "upri23";
	public static final String $qty23_p = "qty23_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std23 = "std23";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt23 = "amt23";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff23 = "diff23";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri24 = "upri24";
	public static final String $qty24_p = "qty24_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std24 = "std24";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt24 = "amt24";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff24 = "diff24";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri25 = "upri25";
	public static final String $qty25_p = "qty25_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std25 = "std25";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt25 = "amt25";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff25 = "diff25";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri26 = "upri26";
	public static final String $qty26_p = "qty26_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std26 = "std26";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt26 = "amt26";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff26 = "diff26";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri27 = "upri27";
	public static final String $qty27_p = "qty27_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std27 = "std27";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt27 = "amt27";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff27 = "diff27";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri28 = "upri28";
	public static final String $qty28_p = "qty28_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std28 = "std28";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt28 = "amt28";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff28 = "diff28";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri29 = "upri29";
	public static final String $qty29_p = "qty29_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std29 = "std29";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt29 = "amt29";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff29 = "diff29";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri30 = "upri30";
	public static final String $qty30_p = "qty30_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std30 = "std30";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt30 = "amt30";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff30 = "diff30";
	public static final String $diff_qty_p = "diff_qty_p";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $diff_std = "diff_std";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $diff_amt = "diff_amt";
	/**
	 * For weighted average unit price 総平均単価対象.<p>
	 *
	 */
	public static final String $ave_tgt = "ave_tgt";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $qty01 = $qty01_p + ".qty";
	public static final String $qty02 = $qty02_p + ".qty";
	public static final String $qty03 = $qty03_p + ".qty";
	public static final String $qty04 = $qty04_p + ".qty";
	public static final String $qty05 = $qty05_p + ".qty";
	public static final String $qty06 = $qty06_p + ".qty";
	public static final String $qty07 = $qty07_p + ".qty";
	public static final String $qty08 = $qty08_p + ".qty";
	public static final String $qty09 = $qty09_p + ".qty";
	public static final String $qty10 = $qty10_p + ".qty";
	public static final String $qty11 = $qty11_p + ".qty";
	public static final String $qty12 = $qty12_p + ".qty";
	public static final String $qty13 = $qty13_p + ".qty";
	public static final String $qty14 = $qty14_p + ".qty";
	public static final String $qty15 = $qty15_p + ".qty";
	public static final String $qty16 = $qty16_p + ".qty";
	public static final String $qty17 = $qty17_p + ".qty";
	public static final String $qty18 = $qty18_p + ".qty";
	public static final String $qty19 = $qty19_p + ".qty";
	public static final String $qty20 = $qty20_p + ".qty";
	public static final String $qty21 = $qty21_p + ".qty";
	public static final String $qty22 = $qty22_p + ".qty";
	public static final String $qty23 = $qty23_p + ".qty";
	public static final String $qty24 = $qty24_p + ".qty";
	public static final String $qty25 = $qty25_p + ".qty";
	public static final String $qty26 = $qty26_p + ".qty";
	public static final String $qty27 = $qty27_p + ".qty";
	public static final String $qty28 = $qty28_p + ".qty";
	public static final String $qty29 = $qty29_p + ".qty";
	public static final String $qty30 = $qty30_p + ".qty";
	public static final String $diff_qty = $diff_qty_p + ".qty";

	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta upri01_META = createCommonMeta($upri01, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty01_p_META = createInnerRowMeta($qty01_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std01_META = createCommonMeta($std01, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt01_META = createCommonMeta($amt01, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff01_META = createCommonMeta($diff01, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri02_META = createCommonMeta($upri02, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty02_p_META = createInnerRowMeta($qty02_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std02_META = createCommonMeta($std02, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt02_META = createCommonMeta($amt02, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff02_META = createCommonMeta($diff02, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri03_META = createCommonMeta($upri03, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty03_p_META = createInnerRowMeta($qty03_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std03_META = createCommonMeta($std03, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt03_META = createCommonMeta($amt03, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff03_META = createCommonMeta($diff03, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri04_META = createCommonMeta($upri04, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty04_p_META = createInnerRowMeta($qty04_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std04_META = createCommonMeta($std04, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt04_META = createCommonMeta($amt04, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff04_META = createCommonMeta($diff04, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri05_META = createCommonMeta($upri05, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty05_p_META = createInnerRowMeta($qty05_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std05_META = createCommonMeta($std05, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt05_META = createCommonMeta($amt05, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff05_META = createCommonMeta($diff05, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri06_META = createCommonMeta($upri06, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty06_p_META = createInnerRowMeta($qty06_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std06_META = createCommonMeta($std06, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt06_META = createCommonMeta($amt06, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff06_META = createCommonMeta($diff06, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri07_META = createCommonMeta($upri07, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty07_p_META = createInnerRowMeta($qty07_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std07_META = createCommonMeta($std07, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt07_META = createCommonMeta($amt07, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff07_META = createCommonMeta($diff07, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri08_META = createCommonMeta($upri08, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty08_p_META = createInnerRowMeta($qty08_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std08_META = createCommonMeta($std08, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt08_META = createCommonMeta($amt08, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff08_META = createCommonMeta($diff08, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri09_META = createCommonMeta($upri09, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty09_p_META = createInnerRowMeta($qty09_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std09_META = createCommonMeta($std09, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt09_META = createCommonMeta($amt09, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff09_META = createCommonMeta($diff09, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri10_META = createCommonMeta($upri10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty10_p_META = createInnerRowMeta($qty10_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std10_META = createCommonMeta($std10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt10_META = createCommonMeta($amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff10_META = createCommonMeta($diff10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri11_META = createCommonMeta($upri11, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty11_p_META = createInnerRowMeta($qty11_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std11_META = createCommonMeta($std11, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt11_META = createCommonMeta($amt11, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff11_META = createCommonMeta($diff11, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri12_META = createCommonMeta($upri12, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty12_p_META = createInnerRowMeta($qty12_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std12_META = createCommonMeta($std12, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt12_META = createCommonMeta($amt12, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff12_META = createCommonMeta($diff12, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri13_META = createCommonMeta($upri13, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty13_p_META = createInnerRowMeta($qty13_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std13_META = createCommonMeta($std13, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt13_META = createCommonMeta($amt13, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff13_META = createCommonMeta($diff13, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri14_META = createCommonMeta($upri14, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty14_p_META = createInnerRowMeta($qty14_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std14_META = createCommonMeta($std14, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt14_META = createCommonMeta($amt14, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff14_META = createCommonMeta($diff14, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri15_META = createCommonMeta($upri15, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty15_p_META = createInnerRowMeta($qty15_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std15_META = createCommonMeta($std15, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt15_META = createCommonMeta($amt15, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff15_META = createCommonMeta($diff15, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri16_META = createCommonMeta($upri16, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty16_p_META = createInnerRowMeta($qty16_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std16_META = createCommonMeta($std16, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt16_META = createCommonMeta($amt16, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff16_META = createCommonMeta($diff16, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri17_META = createCommonMeta($upri17, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty17_p_META = createInnerRowMeta($qty17_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std17_META = createCommonMeta($std17, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt17_META = createCommonMeta($amt17, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff17_META = createCommonMeta($diff17, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri18_META = createCommonMeta($upri18, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty18_p_META = createInnerRowMeta($qty18_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std18_META = createCommonMeta($std18, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt18_META = createCommonMeta($amt18, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff18_META = createCommonMeta($diff18, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri19_META = createCommonMeta($upri19, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty19_p_META = createInnerRowMeta($qty19_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std19_META = createCommonMeta($std19, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt19_META = createCommonMeta($amt19, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff19_META = createCommonMeta($diff19, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri20_META = createCommonMeta($upri20, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty20_p_META = createInnerRowMeta($qty20_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std20_META = createCommonMeta($std20, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt20_META = createCommonMeta($amt20, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff20_META = createCommonMeta($diff20, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri21_META = createCommonMeta($upri21, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty21_p_META = createInnerRowMeta($qty21_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std21_META = createCommonMeta($std21, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt21_META = createCommonMeta($amt21, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff21_META = createCommonMeta($diff21, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri22_META = createCommonMeta($upri22, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty22_p_META = createInnerRowMeta($qty22_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std22_META = createCommonMeta($std22, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt22_META = createCommonMeta($amt22, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff22_META = createCommonMeta($diff22, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri23_META = createCommonMeta($upri23, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty23_p_META = createInnerRowMeta($qty23_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std23_META = createCommonMeta($std23, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt23_META = createCommonMeta($amt23, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff23_META = createCommonMeta($diff23, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri24_META = createCommonMeta($upri24, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty24_p_META = createInnerRowMeta($qty24_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std24_META = createCommonMeta($std24, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt24_META = createCommonMeta($amt24, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff24_META = createCommonMeta($diff24, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri25_META = createCommonMeta($upri25, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty25_p_META = createInnerRowMeta($qty25_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std25_META = createCommonMeta($std25, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt25_META = createCommonMeta($amt25, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff25_META = createCommonMeta($diff25, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri26_META = createCommonMeta($upri26, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty26_p_META = createInnerRowMeta($qty26_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std26_META = createCommonMeta($std26, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt26_META = createCommonMeta($amt26, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff26_META = createCommonMeta($diff26, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri27_META = createCommonMeta($upri27, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty27_p_META = createInnerRowMeta($qty27_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std27_META = createCommonMeta($std27, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt27_META = createCommonMeta($amt27, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff27_META = createCommonMeta($diff27, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri28_META = createCommonMeta($upri28, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty28_p_META = createInnerRowMeta($qty28_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std28_META = createCommonMeta($std28, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt28_META = createCommonMeta($amt28, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff28_META = createCommonMeta($diff28, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri29_META = createCommonMeta($upri29, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty29_p_META = createInnerRowMeta($qty29_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std29_META = createCommonMeta($std29, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt29_META = createCommonMeta($amt29, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff29_META = createCommonMeta($diff29, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri30_META = createCommonMeta($upri30, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty30_p_META = createInnerRowMeta($qty30_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std30_META = createCommonMeta($std30, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt30_META = createCommonMeta($amt30, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff30_META = createCommonMeta($diff30, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_qty_p_META = createInnerRowMeta($diff_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta diff_std_META = createCommonMeta($diff_std, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_amt_META = createCommonMeta($diff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ave_tgt_META = createCommonMeta($ave_tgt, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_grp_cd_META,
			calc_no_META,
			wg_cd_META,
			wg_nm_META,
			ym_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			itm_p_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			bp_cd_META,
			bp_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			upri01_META,
			qty01_p_META,
			std01_META,
			amt01_META,
			diff01_META,
			upri02_META,
			qty02_p_META,
			std02_META,
			amt02_META,
			diff02_META,
			upri03_META,
			qty03_p_META,
			std03_META,
			amt03_META,
			diff03_META,
			upri04_META,
			qty04_p_META,
			std04_META,
			amt04_META,
			diff04_META,
			upri05_META,
			qty05_p_META,
			std05_META,
			amt05_META,
			diff05_META,
			upri06_META,
			qty06_p_META,
			std06_META,
			amt06_META,
			diff06_META,
			upri07_META,
			qty07_p_META,
			std07_META,
			amt07_META,
			diff07_META,
			upri08_META,
			qty08_p_META,
			std08_META,
			amt08_META,
			diff08_META,
			upri09_META,
			qty09_p_META,
			std09_META,
			amt09_META,
			diff09_META,
			upri10_META,
			qty10_p_META,
			std10_META,
			amt10_META,
			diff10_META,
			upri11_META,
			qty11_p_META,
			std11_META,
			amt11_META,
			diff11_META,
			upri12_META,
			qty12_p_META,
			std12_META,
			amt12_META,
			diff12_META,
			upri13_META,
			qty13_p_META,
			std13_META,
			amt13_META,
			diff13_META,
			upri14_META,
			qty14_p_META,
			std14_META,
			amt14_META,
			diff14_META,
			upri15_META,
			qty15_p_META,
			std15_META,
			amt15_META,
			diff15_META,
			upri16_META,
			qty16_p_META,
			std16_META,
			amt16_META,
			diff16_META,
			upri17_META,
			qty17_p_META,
			std17_META,
			amt17_META,
			diff17_META,
			upri18_META,
			qty18_p_META,
			std18_META,
			amt18_META,
			diff18_META,
			upri19_META,
			qty19_p_META,
			std19_META,
			amt19_META,
			diff19_META,
			upri20_META,
			qty20_p_META,
			std20_META,
			amt20_META,
			diff20_META,
			upri21_META,
			qty21_p_META,
			std21_META,
			amt21_META,
			diff21_META,
			upri22_META,
			qty22_p_META,
			std22_META,
			amt22_META,
			diff22_META,
			upri23_META,
			qty23_p_META,
			std23_META,
			amt23_META,
			diff23_META,
			upri24_META,
			qty24_p_META,
			std24_META,
			amt24_META,
			diff24_META,
			upri25_META,
			qty25_p_META,
			std25_META,
			amt25_META,
			diff25_META,
			upri26_META,
			qty26_p_META,
			std26_META,
			amt26_META,
			diff26_META,
			upri27_META,
			qty27_p_META,
			std27_META,
			amt27_META,
			diff27_META,
			upri28_META,
			qty28_p_META,
			std28_META,
			amt28_META,
			diff28_META,
			upri29_META,
			qty29_p_META,
			std29_META,
			amt29_META,
			diff29_META,
			upri30_META,
			qty30_p_META,
			std30_META,
			amt30_META,
			diff30_META,
			diff_qty_p_META,
			diff_std_META,
			diff_amt_META,
			ave_tgt_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"qty01",
				"qty02",
				"qty03",
				"qty04",
				"qty05",
				"qty06",
				"qty07",
				"qty08",
				"qty09",
				"qty10",
				"qty11",
				"qty12",
				"qty13",
				"qty14",
				"qty15",
				"qty16",
				"qty17",
				"qty18",
				"qty19",
				"qty20",
				"qty21",
				"qty22",
				"qty23",
				"qty24",
				"qty25",
				"qty26",
				"qty27",
				"qty28",
				"qty29",
				"qty30",
				"diff_qty"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$qty01,
				$qty02,
				$qty03,
				$qty04,
				$qty05,
				$qty06,
				$qty07,
				$qty08,
				$qty09,
				$qty10,
				$qty11,
				$qty12,
				$qty13,
				$qty14,
				$qty15,
				$qty16,
				$qty17,
				$qty18,
				$qty19,
				$qty20,
				$qty21,
				$qty22,
				$qty23,
				$qty24,
				$qty25,
				$qty26,
				$qty27,
				$qty28,
				$qty29,
				$qty30,
				$diff_qty
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";
	/** 項目属性情報のグループ[COL_TYP]のキー定数 */
	public static final String $$COL_TYP = "COL_TYP";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
				{$wg_cd, "wg_flg"},	// wg_cd
				{$wg_nm, "wg_flg"},	// wg_nm
				{$mng_dpt_cd, "mng_dpt_flg"},	// mng_dpt_cd
				{$mng_dpt_nm, "mng_dpt_flg"},	// mng_dpt_nm
				{$lot_no, "lot_flg"},	// lot_no
				{$sublot_no, "sublot_flg"},	// sublot_no
				{$sno1, "sno1_flg"},	// sno1
				{$sno2, "sno2_flg"},	// sno2
				{$sno3, "sno3_flg"},	// sno3
				{$sno4, "sno4_flg"},	// sno4
				{$bp_cd, "bp_flg"},	// bp_cd
				{$bp_nm, "bp_flg"},	// bp_nm
				{$asst_typ, "asst_typ_flg"},	// asst_typ
				{$asst_typ_nm, "asst_typ_flg"}	// asst_typ_nm
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
				{$upri01, "UNIT"},	// upri01
				{$std01, "AMT"},	// std01
				{$amt01, "AMT"},	// amt01
				{$diff01, "AMT"},	// diff01
				{$upri02, "UNIT"},	// upri02
				{$std02, "AMT"},	// std02
				{$amt02, "AMT"},	// amt02
				{$diff02, "AMT"},	// diff02
				{$upri03, "UNIT"},	// upri03
				{$std03, "AMT"},	// std03
				{$amt03, "AMT"},	// amt03
				{$diff03, "AMT"},	// diff03
				{$upri04, "UNIT"},	// upri04
				{$std04, "AMT"},	// std04
				{$amt04, "AMT"},	// amt04
				{$diff04, "AMT"},	// diff04
				{$upri05, "UNIT"},	// upri05
				{$std05, "AMT"},	// std05
				{$amt05, "AMT"},	// amt05
				{$diff05, "AMT"},	// diff05
				{$upri06, "UNIT"},	// upri06
				{$std06, "AMT"},	// std06
				{$amt06, "AMT"},	// amt06
				{$diff06, "AMT"},	// diff06
				{$upri07, "UNIT"},	// upri07
				{$std07, "AMT"},	// std07
				{$amt07, "AMT"},	// amt07
				{$diff07, "AMT"},	// diff07
				{$upri08, "UNIT"},	// upri08
				{$std08, "AMT"},	// std08
				{$amt08, "AMT"},	// amt08
				{$diff08, "AMT"},	// diff08
				{$upri09, "UNIT"},	// upri09
				{$std09, "AMT"},	// std09
				{$amt09, "AMT"},	// amt09
				{$diff09, "AMT"},	// diff09
				{$upri10, "UNIT"},	// upri10
				{$std10, "AMT"},	// std10
				{$amt10, "AMT"},	// amt10
				{$diff10, "AMT"},	// diff10
				{$upri11, "UNIT"},	// upri11
				{$std11, "AMT"},	// std11
				{$amt11, "AMT"},	// amt11
				{$diff11, "AMT"},	// diff11
				{$upri12, "UNIT"},	// upri12
				{$std12, "AMT"},	// std12
				{$amt12, "AMT"},	// amt12
				{$diff12, "AMT"},	// diff12
				{$upri13, "UNIT"},	// upri13
				{$std13, "AMT"},	// std13
				{$amt13, "AMT"},	// amt13
				{$diff13, "AMT"},	// diff13
				{$upri14, "UNIT"},	// upri14
				{$std14, "AMT"},	// std14
				{$amt14, "AMT"},	// amt14
				{$diff14, "AMT"},	// diff14
				{$upri15, "UNIT"},	// upri15
				{$std15, "AMT"},	// std15
				{$amt15, "AMT"},	// amt15
				{$diff15, "AMT"},	// diff15
				{$upri16, "UNIT"},	// upri16
				{$std16, "AMT"},	// std16
				{$amt16, "AMT"},	// amt16
				{$diff16, "AMT"},	// diff16
				{$upri17, "UNIT"},	// upri17
				{$std17, "AMT"},	// std17
				{$amt17, "AMT"},	// amt17
				{$diff17, "AMT"},	// diff17
				{$upri18, "UNIT"},	// upri18
				{$std18, "AMT"},	// std18
				{$amt18, "AMT"},	// amt18
				{$diff18, "AMT"},	// diff18
				{$upri19, "UNIT"},	// upri19
				{$std19, "AMT"},	// std19
				{$amt19, "AMT"},	// amt19
				{$diff19, "AMT"},	// diff19
				{$upri20, "UNIT"},	// upri20
				{$std20, "AMT"},	// std20
				{$amt20, "AMT"},	// amt20
				{$diff20, "AMT"},	// diff20
				{$upri21, "UNIT"},	// upri21
				{$std21, "AMT"},	// std21
				{$amt21, "AMT"},	// amt21
				{$diff21, "AMT"},	// diff21
				{$upri22, "UNIT"},	// upri22
				{$std22, "AMT"},	// std22
				{$amt22, "AMT"},	// amt22
				{$diff22, "AMT"},	// diff22
				{$upri23, "UNIT"},	// upri23
				{$std23, "AMT"},	// std23
				{$amt23, "AMT"},	// amt23
				{$diff23, "AMT"},	// diff23
				{$upri24, "UNIT"},	// upri24
				{$std24, "AMT"},	// std24
				{$amt24, "AMT"},	// amt24
				{$diff24, "AMT"},	// diff24
				{$upri25, "UNIT"},	// upri25
				{$std25, "AMT"},	// std25
				{$amt25, "AMT"},	// amt25
				{$diff25, "AMT"},	// diff25
				{$upri26, "UNIT"},	// upri26
				{$std26, "AMT"},	// std26
				{$amt26, "AMT"},	// amt26
				{$diff26, "AMT"},	// diff26
				{$upri27, "UNIT"},	// upri27
				{$std27, "AMT"},	// std27
				{$amt27, "AMT"},	// amt27
				{$diff27, "AMT"},	// diff27
				{$upri28, "UNIT"},	// upri28
				{$std28, "AMT"},	// std28
				{$amt28, "AMT"},	// amt28
				{$diff28, "AMT"},	// diff28
				{$upri29, "UNIT"},	// upri29
				{$std29, "AMT"},	// std29
				{$amt29, "AMT"},	// amt29
				{$diff29, "AMT"},	// diff29
				{$upri30, "UNIT"},	// upri30
				{$std30, "AMT"},	// std30
				{$amt30, "AMT"},	// amt30
				{$diff30, "AMT"},	// diff30
				{$diff_std, "AMT"},	// diff_std
				{$diff_amt, "AMT"}	// diff_amt
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$sno1, "SNO1"},	// sno1
				{$sno2, "SNO2"},	// sno2
				{$sno3, "SNO3"},	// sno3
				{$sno4, "SNO4"}	// sno4
			}
		)),
		new MCExtMap.Entry($$COL_TYP, new MCExtList(
			new String[][]{
				{$upri01, "UPRI"},	// upri01
				{$qty01_p + ".qty", "QTY"},	// qty01_p.qty
				{$std01, "STD"},	// std01
				{$amt01, "AMT"},	// amt01
				{$diff01, "DIFF"},	// diff01
				{$upri02, "UPRI"},	// upri02
				{$qty02_p + ".qty", "QTY"},	// qty02_p.qty
				{$std02, "STD"},	// std02
				{$amt02, "AMT"},	// amt02
				{$diff02, "DIFF"},	// diff02
				{$upri03, "UPRI"},	// upri03
				{$qty03_p + ".qty", "QTY"},	// qty03_p.qty
				{$std03, "STD"},	// std03
				{$amt03, "AMT"},	// amt03
				{$diff03, "DIFF"},	// diff03
				{$upri04, "UPRI"},	// upri04
				{$qty04_p + ".qty", "QTY"},	// qty04_p.qty
				{$std04, "STD"},	// std04
				{$amt04, "AMT"},	// amt04
				{$diff04, "DIFF"},	// diff04
				{$upri05, "UPRI"},	// upri05
				{$qty05_p + ".qty", "QTY"},	// qty05_p.qty
				{$std05, "STD"},	// std05
				{$amt05, "AMT"},	// amt05
				{$diff05, "DIFF"},	// diff05
				{$upri06, "UPRI"},	// upri06
				{$qty06_p + ".qty", "QTY"},	// qty06_p.qty
				{$std06, "STD"},	// std06
				{$amt06, "AMT"},	// amt06
				{$diff06, "DIFF"},	// diff06
				{$upri07, "UPRI"},	// upri07
				{$qty07_p + ".qty", "QTY"},	// qty07_p.qty
				{$std07, "STD"},	// std07
				{$amt07, "AMT"},	// amt07
				{$diff07, "DIFF"},	// diff07
				{$upri08, "UPRI"},	// upri08
				{$qty08_p + ".qty", "QTY"},	// qty08_p.qty
				{$std08, "STD"},	// std08
				{$amt08, "AMT"},	// amt08
				{$diff08, "DIFF"},	// diff08
				{$upri09, "UPRI"},	// upri09
				{$qty09_p + ".qty", "QTY"},	// qty09_p.qty
				{$std09, "STD"},	// std09
				{$amt09, "AMT"},	// amt09
				{$diff09, "DIFF"},	// diff09
				{$upri10, "UPRI"},	// upri10
				{$qty10_p + ".qty", "QTY"},	// qty10_p.qty
				{$std10, "STD"},	// std10
				{$amt10, "AMT"},	// amt10
				{$diff10, "DIFF"},	// diff10
				{$upri11, "UPRI"},	// upri11
				{$qty11_p + ".qty", "QTY"},	// qty11_p.qty
				{$std11, "STD"},	// std11
				{$amt11, "AMT"},	// amt11
				{$diff11, "DIFF"},	// diff11
				{$upri12, "UPRI"},	// upri12
				{$qty12_p + ".qty", "QTY"},	// qty12_p.qty
				{$std12, "STD"},	// std12
				{$amt12, "AMT"},	// amt12
				{$diff12, "DIFF"},	// diff12
				{$upri13, "UPRI"},	// upri13
				{$qty13_p + ".qty", "QTY"},	// qty13_p.qty
				{$std13, "STD"},	// std13
				{$amt13, "AMT"},	// amt13
				{$diff13, "DIFF"},	// diff13
				{$upri14, "UPRI"},	// upri14
				{$qty14_p + ".qty", "QTY"},	// qty14_p.qty
				{$std14, "STD"},	// std14
				{$amt14, "AMT"},	// amt14
				{$diff14, "DIFF"},	// diff14
				{$upri15, "UPRI"},	// upri15
				{$qty15_p + ".qty", "QTY"},	// qty15_p.qty
				{$std15, "STD"},	// std15
				{$amt15, "AMT"},	// amt15
				{$diff15, "DIFF"},	// diff15
				{$upri16, "UPRI"},	// upri16
				{$qty16_p + ".qty", "QTY"},	// qty16_p.qty
				{$std16, "STD"},	// std16
				{$amt16, "AMT"},	// amt16
				{$diff16, "DIFF"},	// diff16
				{$upri17, "UPRI"},	// upri17
				{$qty17_p + ".qty", "QTY"},	// qty17_p.qty
				{$std17, "STD"},	// std17
				{$amt17, "AMT"},	// amt17
				{$diff17, "DIFF"},	// diff17
				{$upri18, "UPRI"},	// upri18
				{$qty18_p + ".qty", "QTY"},	// qty18_p.qty
				{$std18, "STD"},	// std18
				{$amt18, "AMT"},	// amt18
				{$diff18, "DIFF"},	// diff18
				{$upri19, "UPRI"},	// upri19
				{$qty19_p + ".qty", "QTY"},	// qty19_p.qty
				{$std19, "STD"},	// std19
				{$amt19, "AMT"},	// amt19
				{$diff19, "DIFF"},	// diff19
				{$upri20, "UPRI"},	// upri20
				{$qty20_p + ".qty", "QTY"},	// qty20_p.qty
				{$std20, "STD"},	// std20
				{$amt20, "AMT"},	// amt20
				{$diff20, "DIFF"},	// diff20
				{$upri21, "UPRI"},	// upri21
				{$qty21_p + ".qty", "QTY"},	// qty21_p.qty
				{$std21, "STD"},	// std21
				{$amt21, "AMT"},	// amt21
				{$diff21, "DIFF"},	// diff21
				{$upri22, "UPRI"},	// upri22
				{$qty22_p + ".qty", "QTY"},	// qty22_p.qty
				{$std22, "STD"},	// std22
				{$amt22, "AMT"},	// amt22
				{$diff22, "DIFF"},	// diff22
				{$upri23, "UPRI"},	// upri23
				{$qty23_p + ".qty", "QTY"},	// qty23_p.qty
				{$std23, "STD"},	// std23
				{$amt23, "AMT"},	// amt23
				{$diff23, "DIFF"},	// diff23
				{$upri24, "UPRI"},	// upri24
				{$qty24_p + ".qty", "QTY"},	// qty24_p.qty
				{$std24, "STD"},	// std24
				{$amt24, "AMT"},	// amt24
				{$diff24, "DIFF"},	// diff24
				{$upri25, "UPRI"},	// upri25
				{$qty25_p + ".qty", "QTY"},	// qty25_p.qty
				{$std25, "STD"},	// std25
				{$amt25, "AMT"},	// amt25
				{$diff25, "DIFF"},	// diff25
				{$upri26, "UPRI"},	// upri26
				{$qty26_p + ".qty", "QTY"},	// qty26_p.qty
				{$std26, "STD"},	// std26
				{$amt26, "AMT"},	// amt26
				{$diff26, "DIFF"},	// diff26
				{$upri27, "UPRI"},	// upri27
				{$qty27_p + ".qty", "QTY"},	// qty27_p.qty
				{$std27, "STD"},	// std27
				{$amt27, "AMT"},	// amt27
				{$diff27, "DIFF"},	// diff27
				{$upri28, "UPRI"},	// upri28
				{$qty28_p + ".qty", "QTY"},	// qty28_p.qty
				{$std28, "STD"},	// std28
				{$amt28, "AMT"},	// amt28
				{$diff28, "DIFF"},	// diff28
				{$upri29, "UPRI"},	// upri29
				{$qty29_p + ".qty", "QTY"},	// qty29_p.qty
				{$std29, "STD"},	// std29
				{$amt29, "AMT"},	// amt29
				{$diff29, "DIFF"},	// diff29
				{$upri30, "UPRI"},	// upri30
				{$qty30_p + ".qty", "QTY"},	// qty30_p.qty
				{$std30, "STD"},	// std30
				{$amt30, "AMT"},	// amt30
				{$diff30, "DIFF"}	// diff30
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}



	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 0, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 0, $calc_grp_cd, value);
	}


	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 1, $calc_no);
	}

	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 1, $calc_no, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 3, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 3, $wg_nm, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 4, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 4, $ym, value);
	}


	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 5, $mng_dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 5, $mng_dpt_cd, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 6, $mng_dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 6, $mng_dpt_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 7, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 7, $itm_p, row);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 8, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 8, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 9, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 9, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 10, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 10, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 11, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 11, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 12, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 12, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 13, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 13, $itm_jnl_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 14, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 14, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 15, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 15, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 16, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 16, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 17, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 17, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 18, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 18, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 19, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 19, $sno4, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 20, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 20, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 21, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 21, $bp_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 22, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 22, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 23, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 23, $asst_typ_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 24, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 24, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 25, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 25, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 26, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 26, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 26, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 26, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 26, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 26, $dec_place, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri01() {
		return getConstNumber(offset + 27, $upri01);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri01(MCNumber value) {
		setConstNumber(offset + 27, $upri01, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri01(int value) {
		setConstNumber(offset + 27, $upri01, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri01(long value) {
		setConstNumber(offset + 27, $upri01, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri01(float value) {
		setConstNumber(offset + 27, $upri01, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri01(double value) {
		setConstNumber(offset + 27, $upri01, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty01_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 28, $qty01_p);
	}
	
	public void qty01_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 28, $qty01_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std01() {
		return getConstNumber(offset + 29, $std01);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std01(MCNumber value) {
		setConstNumber(offset + 29, $std01, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std01(int value) {
		setConstNumber(offset + 29, $std01, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std01(long value) {
		setConstNumber(offset + 29, $std01, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std01(float value) {
		setConstNumber(offset + 29, $std01, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std01(double value) {
		setConstNumber(offset + 29, $std01, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt01() {
		return getConstNumber(offset + 30, $amt01);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt01(MCNumber value) {
		setConstNumber(offset + 30, $amt01, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt01(int value) {
		setConstNumber(offset + 30, $amt01, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt01(long value) {
		setConstNumber(offset + 30, $amt01, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt01(float value) {
		setConstNumber(offset + 30, $amt01, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt01(double value) {
		setConstNumber(offset + 30, $amt01, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff01() {
		return getConstNumber(offset + 31, $diff01);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff01(MCNumber value) {
		setConstNumber(offset + 31, $diff01, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff01(int value) {
		setConstNumber(offset + 31, $diff01, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff01(long value) {
		setConstNumber(offset + 31, $diff01, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff01(float value) {
		setConstNumber(offset + 31, $diff01, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff01(double value) {
		setConstNumber(offset + 31, $diff01, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri02() {
		return getConstNumber(offset + 32, $upri02);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri02(MCNumber value) {
		setConstNumber(offset + 32, $upri02, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri02(int value) {
		setConstNumber(offset + 32, $upri02, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri02(long value) {
		setConstNumber(offset + 32, $upri02, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri02(float value) {
		setConstNumber(offset + 32, $upri02, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri02(double value) {
		setConstNumber(offset + 32, $upri02, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty02_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 33, $qty02_p);
	}
	
	public void qty02_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 33, $qty02_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std02() {
		return getConstNumber(offset + 34, $std02);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std02(MCNumber value) {
		setConstNumber(offset + 34, $std02, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std02(int value) {
		setConstNumber(offset + 34, $std02, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std02(long value) {
		setConstNumber(offset + 34, $std02, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std02(float value) {
		setConstNumber(offset + 34, $std02, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std02(double value) {
		setConstNumber(offset + 34, $std02, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt02() {
		return getConstNumber(offset + 35, $amt02);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt02(MCNumber value) {
		setConstNumber(offset + 35, $amt02, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt02(int value) {
		setConstNumber(offset + 35, $amt02, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt02(long value) {
		setConstNumber(offset + 35, $amt02, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt02(float value) {
		setConstNumber(offset + 35, $amt02, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt02(double value) {
		setConstNumber(offset + 35, $amt02, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff02() {
		return getConstNumber(offset + 36, $diff02);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff02(MCNumber value) {
		setConstNumber(offset + 36, $diff02, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff02(int value) {
		setConstNumber(offset + 36, $diff02, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff02(long value) {
		setConstNumber(offset + 36, $diff02, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff02(float value) {
		setConstNumber(offset + 36, $diff02, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff02(double value) {
		setConstNumber(offset + 36, $diff02, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri03() {
		return getConstNumber(offset + 37, $upri03);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri03(MCNumber value) {
		setConstNumber(offset + 37, $upri03, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri03(int value) {
		setConstNumber(offset + 37, $upri03, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri03(long value) {
		setConstNumber(offset + 37, $upri03, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri03(float value) {
		setConstNumber(offset + 37, $upri03, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri03(double value) {
		setConstNumber(offset + 37, $upri03, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty03_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 38, $qty03_p);
	}
	
	public void qty03_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 38, $qty03_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std03() {
		return getConstNumber(offset + 39, $std03);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std03(MCNumber value) {
		setConstNumber(offset + 39, $std03, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std03(int value) {
		setConstNumber(offset + 39, $std03, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std03(long value) {
		setConstNumber(offset + 39, $std03, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std03(float value) {
		setConstNumber(offset + 39, $std03, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std03(double value) {
		setConstNumber(offset + 39, $std03, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt03() {
		return getConstNumber(offset + 40, $amt03);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt03(MCNumber value) {
		setConstNumber(offset + 40, $amt03, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt03(int value) {
		setConstNumber(offset + 40, $amt03, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt03(long value) {
		setConstNumber(offset + 40, $amt03, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt03(float value) {
		setConstNumber(offset + 40, $amt03, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt03(double value) {
		setConstNumber(offset + 40, $amt03, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff03() {
		return getConstNumber(offset + 41, $diff03);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff03(MCNumber value) {
		setConstNumber(offset + 41, $diff03, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff03(int value) {
		setConstNumber(offset + 41, $diff03, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff03(long value) {
		setConstNumber(offset + 41, $diff03, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff03(float value) {
		setConstNumber(offset + 41, $diff03, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff03(double value) {
		setConstNumber(offset + 41, $diff03, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri04() {
		return getConstNumber(offset + 42, $upri04);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri04(MCNumber value) {
		setConstNumber(offset + 42, $upri04, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri04(int value) {
		setConstNumber(offset + 42, $upri04, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri04(long value) {
		setConstNumber(offset + 42, $upri04, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri04(float value) {
		setConstNumber(offset + 42, $upri04, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri04(double value) {
		setConstNumber(offset + 42, $upri04, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty04_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 43, $qty04_p);
	}
	
	public void qty04_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 43, $qty04_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std04() {
		return getConstNumber(offset + 44, $std04);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std04(MCNumber value) {
		setConstNumber(offset + 44, $std04, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std04(int value) {
		setConstNumber(offset + 44, $std04, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std04(long value) {
		setConstNumber(offset + 44, $std04, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std04(float value) {
		setConstNumber(offset + 44, $std04, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std04(double value) {
		setConstNumber(offset + 44, $std04, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt04() {
		return getConstNumber(offset + 45, $amt04);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt04(MCNumber value) {
		setConstNumber(offset + 45, $amt04, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt04(int value) {
		setConstNumber(offset + 45, $amt04, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt04(long value) {
		setConstNumber(offset + 45, $amt04, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt04(float value) {
		setConstNumber(offset + 45, $amt04, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt04(double value) {
		setConstNumber(offset + 45, $amt04, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff04() {
		return getConstNumber(offset + 46, $diff04);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff04(MCNumber value) {
		setConstNumber(offset + 46, $diff04, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff04(int value) {
		setConstNumber(offset + 46, $diff04, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff04(long value) {
		setConstNumber(offset + 46, $diff04, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff04(float value) {
		setConstNumber(offset + 46, $diff04, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff04(double value) {
		setConstNumber(offset + 46, $diff04, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri05() {
		return getConstNumber(offset + 47, $upri05);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri05(MCNumber value) {
		setConstNumber(offset + 47, $upri05, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri05(int value) {
		setConstNumber(offset + 47, $upri05, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri05(long value) {
		setConstNumber(offset + 47, $upri05, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri05(float value) {
		setConstNumber(offset + 47, $upri05, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri05(double value) {
		setConstNumber(offset + 47, $upri05, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty05_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 48, $qty05_p);
	}
	
	public void qty05_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 48, $qty05_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std05() {
		return getConstNumber(offset + 49, $std05);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std05(MCNumber value) {
		setConstNumber(offset + 49, $std05, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std05(int value) {
		setConstNumber(offset + 49, $std05, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std05(long value) {
		setConstNumber(offset + 49, $std05, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std05(float value) {
		setConstNumber(offset + 49, $std05, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std05(double value) {
		setConstNumber(offset + 49, $std05, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt05() {
		return getConstNumber(offset + 50, $amt05);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt05(MCNumber value) {
		setConstNumber(offset + 50, $amt05, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt05(int value) {
		setConstNumber(offset + 50, $amt05, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt05(long value) {
		setConstNumber(offset + 50, $amt05, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt05(float value) {
		setConstNumber(offset + 50, $amt05, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt05(double value) {
		setConstNumber(offset + 50, $amt05, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff05() {
		return getConstNumber(offset + 51, $diff05);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff05(MCNumber value) {
		setConstNumber(offset + 51, $diff05, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff05(int value) {
		setConstNumber(offset + 51, $diff05, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff05(long value) {
		setConstNumber(offset + 51, $diff05, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff05(float value) {
		setConstNumber(offset + 51, $diff05, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff05(double value) {
		setConstNumber(offset + 51, $diff05, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri06() {
		return getConstNumber(offset + 52, $upri06);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri06(MCNumber value) {
		setConstNumber(offset + 52, $upri06, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri06(int value) {
		setConstNumber(offset + 52, $upri06, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri06(long value) {
		setConstNumber(offset + 52, $upri06, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri06(float value) {
		setConstNumber(offset + 52, $upri06, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri06(double value) {
		setConstNumber(offset + 52, $upri06, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty06_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 53, $qty06_p);
	}
	
	public void qty06_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 53, $qty06_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std06() {
		return getConstNumber(offset + 54, $std06);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std06(MCNumber value) {
		setConstNumber(offset + 54, $std06, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std06(int value) {
		setConstNumber(offset + 54, $std06, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std06(long value) {
		setConstNumber(offset + 54, $std06, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std06(float value) {
		setConstNumber(offset + 54, $std06, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std06(double value) {
		setConstNumber(offset + 54, $std06, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt06() {
		return getConstNumber(offset + 55, $amt06);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt06(MCNumber value) {
		setConstNumber(offset + 55, $amt06, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt06(int value) {
		setConstNumber(offset + 55, $amt06, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt06(long value) {
		setConstNumber(offset + 55, $amt06, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt06(float value) {
		setConstNumber(offset + 55, $amt06, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt06(double value) {
		setConstNumber(offset + 55, $amt06, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff06() {
		return getConstNumber(offset + 56, $diff06);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff06(MCNumber value) {
		setConstNumber(offset + 56, $diff06, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff06(int value) {
		setConstNumber(offset + 56, $diff06, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff06(long value) {
		setConstNumber(offset + 56, $diff06, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff06(float value) {
		setConstNumber(offset + 56, $diff06, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff06(double value) {
		setConstNumber(offset + 56, $diff06, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri07() {
		return getConstNumber(offset + 57, $upri07);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri07(MCNumber value) {
		setConstNumber(offset + 57, $upri07, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri07(int value) {
		setConstNumber(offset + 57, $upri07, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri07(long value) {
		setConstNumber(offset + 57, $upri07, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri07(float value) {
		setConstNumber(offset + 57, $upri07, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri07(double value) {
		setConstNumber(offset + 57, $upri07, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty07_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 58, $qty07_p);
	}
	
	public void qty07_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 58, $qty07_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std07() {
		return getConstNumber(offset + 59, $std07);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std07(MCNumber value) {
		setConstNumber(offset + 59, $std07, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std07(int value) {
		setConstNumber(offset + 59, $std07, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std07(long value) {
		setConstNumber(offset + 59, $std07, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std07(float value) {
		setConstNumber(offset + 59, $std07, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std07(double value) {
		setConstNumber(offset + 59, $std07, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt07() {
		return getConstNumber(offset + 60, $amt07);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt07(MCNumber value) {
		setConstNumber(offset + 60, $amt07, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt07(int value) {
		setConstNumber(offset + 60, $amt07, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt07(long value) {
		setConstNumber(offset + 60, $amt07, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt07(float value) {
		setConstNumber(offset + 60, $amt07, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt07(double value) {
		setConstNumber(offset + 60, $amt07, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff07() {
		return getConstNumber(offset + 61, $diff07);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff07(MCNumber value) {
		setConstNumber(offset + 61, $diff07, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff07(int value) {
		setConstNumber(offset + 61, $diff07, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff07(long value) {
		setConstNumber(offset + 61, $diff07, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff07(float value) {
		setConstNumber(offset + 61, $diff07, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff07(double value) {
		setConstNumber(offset + 61, $diff07, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri08() {
		return getConstNumber(offset + 62, $upri08);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri08(MCNumber value) {
		setConstNumber(offset + 62, $upri08, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri08(int value) {
		setConstNumber(offset + 62, $upri08, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri08(long value) {
		setConstNumber(offset + 62, $upri08, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri08(float value) {
		setConstNumber(offset + 62, $upri08, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri08(double value) {
		setConstNumber(offset + 62, $upri08, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty08_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 63, $qty08_p);
	}
	
	public void qty08_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 63, $qty08_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std08() {
		return getConstNumber(offset + 64, $std08);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std08(MCNumber value) {
		setConstNumber(offset + 64, $std08, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std08(int value) {
		setConstNumber(offset + 64, $std08, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std08(long value) {
		setConstNumber(offset + 64, $std08, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std08(float value) {
		setConstNumber(offset + 64, $std08, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std08(double value) {
		setConstNumber(offset + 64, $std08, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt08() {
		return getConstNumber(offset + 65, $amt08);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt08(MCNumber value) {
		setConstNumber(offset + 65, $amt08, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt08(int value) {
		setConstNumber(offset + 65, $amt08, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt08(long value) {
		setConstNumber(offset + 65, $amt08, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt08(float value) {
		setConstNumber(offset + 65, $amt08, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt08(double value) {
		setConstNumber(offset + 65, $amt08, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff08() {
		return getConstNumber(offset + 66, $diff08);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff08(MCNumber value) {
		setConstNumber(offset + 66, $diff08, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff08(int value) {
		setConstNumber(offset + 66, $diff08, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff08(long value) {
		setConstNumber(offset + 66, $diff08, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff08(float value) {
		setConstNumber(offset + 66, $diff08, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff08(double value) {
		setConstNumber(offset + 66, $diff08, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri09() {
		return getConstNumber(offset + 67, $upri09);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri09(MCNumber value) {
		setConstNumber(offset + 67, $upri09, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri09(int value) {
		setConstNumber(offset + 67, $upri09, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri09(long value) {
		setConstNumber(offset + 67, $upri09, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri09(float value) {
		setConstNumber(offset + 67, $upri09, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri09(double value) {
		setConstNumber(offset + 67, $upri09, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty09_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 68, $qty09_p);
	}
	
	public void qty09_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 68, $qty09_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std09() {
		return getConstNumber(offset + 69, $std09);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std09(MCNumber value) {
		setConstNumber(offset + 69, $std09, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std09(int value) {
		setConstNumber(offset + 69, $std09, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std09(long value) {
		setConstNumber(offset + 69, $std09, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std09(float value) {
		setConstNumber(offset + 69, $std09, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std09(double value) {
		setConstNumber(offset + 69, $std09, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt09() {
		return getConstNumber(offset + 70, $amt09);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt09(MCNumber value) {
		setConstNumber(offset + 70, $amt09, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt09(int value) {
		setConstNumber(offset + 70, $amt09, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt09(long value) {
		setConstNumber(offset + 70, $amt09, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt09(float value) {
		setConstNumber(offset + 70, $amt09, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt09(double value) {
		setConstNumber(offset + 70, $amt09, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff09() {
		return getConstNumber(offset + 71, $diff09);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff09(MCNumber value) {
		setConstNumber(offset + 71, $diff09, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff09(int value) {
		setConstNumber(offset + 71, $diff09, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff09(long value) {
		setConstNumber(offset + 71, $diff09, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff09(float value) {
		setConstNumber(offset + 71, $diff09, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff09(double value) {
		setConstNumber(offset + 71, $diff09, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri10() {
		return getConstNumber(offset + 72, $upri10);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri10(MCNumber value) {
		setConstNumber(offset + 72, $upri10, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri10(int value) {
		setConstNumber(offset + 72, $upri10, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri10(long value) {
		setConstNumber(offset + 72, $upri10, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri10(float value) {
		setConstNumber(offset + 72, $upri10, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri10(double value) {
		setConstNumber(offset + 72, $upri10, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty10_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 73, $qty10_p);
	}
	
	public void qty10_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 73, $qty10_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std10() {
		return getConstNumber(offset + 74, $std10);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std10(MCNumber value) {
		setConstNumber(offset + 74, $std10, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std10(int value) {
		setConstNumber(offset + 74, $std10, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std10(long value) {
		setConstNumber(offset + 74, $std10, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std10(float value) {
		setConstNumber(offset + 74, $std10, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std10(double value) {
		setConstNumber(offset + 74, $std10, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt10() {
		return getConstNumber(offset + 75, $amt10);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt10(MCNumber value) {
		setConstNumber(offset + 75, $amt10, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt10(int value) {
		setConstNumber(offset + 75, $amt10, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt10(long value) {
		setConstNumber(offset + 75, $amt10, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt10(float value) {
		setConstNumber(offset + 75, $amt10, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt10(double value) {
		setConstNumber(offset + 75, $amt10, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff10() {
		return getConstNumber(offset + 76, $diff10);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff10(MCNumber value) {
		setConstNumber(offset + 76, $diff10, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff10(int value) {
		setConstNumber(offset + 76, $diff10, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff10(long value) {
		setConstNumber(offset + 76, $diff10, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff10(float value) {
		setConstNumber(offset + 76, $diff10, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff10(double value) {
		setConstNumber(offset + 76, $diff10, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri11() {
		return getConstNumber(offset + 77, $upri11);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri11(MCNumber value) {
		setConstNumber(offset + 77, $upri11, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri11(int value) {
		setConstNumber(offset + 77, $upri11, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri11(long value) {
		setConstNumber(offset + 77, $upri11, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri11(float value) {
		setConstNumber(offset + 77, $upri11, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri11(double value) {
		setConstNumber(offset + 77, $upri11, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty11_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 78, $qty11_p);
	}
	
	public void qty11_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 78, $qty11_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std11() {
		return getConstNumber(offset + 79, $std11);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std11(MCNumber value) {
		setConstNumber(offset + 79, $std11, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std11(int value) {
		setConstNumber(offset + 79, $std11, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std11(long value) {
		setConstNumber(offset + 79, $std11, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std11(float value) {
		setConstNumber(offset + 79, $std11, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std11(double value) {
		setConstNumber(offset + 79, $std11, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt11() {
		return getConstNumber(offset + 80, $amt11);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt11(MCNumber value) {
		setConstNumber(offset + 80, $amt11, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt11(int value) {
		setConstNumber(offset + 80, $amt11, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt11(long value) {
		setConstNumber(offset + 80, $amt11, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt11(float value) {
		setConstNumber(offset + 80, $amt11, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt11(double value) {
		setConstNumber(offset + 80, $amt11, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff11() {
		return getConstNumber(offset + 81, $diff11);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff11(MCNumber value) {
		setConstNumber(offset + 81, $diff11, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff11(int value) {
		setConstNumber(offset + 81, $diff11, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff11(long value) {
		setConstNumber(offset + 81, $diff11, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff11(float value) {
		setConstNumber(offset + 81, $diff11, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff11(double value) {
		setConstNumber(offset + 81, $diff11, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri12() {
		return getConstNumber(offset + 82, $upri12);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri12(MCNumber value) {
		setConstNumber(offset + 82, $upri12, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri12(int value) {
		setConstNumber(offset + 82, $upri12, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri12(long value) {
		setConstNumber(offset + 82, $upri12, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri12(float value) {
		setConstNumber(offset + 82, $upri12, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri12(double value) {
		setConstNumber(offset + 82, $upri12, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty12_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 83, $qty12_p);
	}
	
	public void qty12_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 83, $qty12_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std12() {
		return getConstNumber(offset + 84, $std12);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std12(MCNumber value) {
		setConstNumber(offset + 84, $std12, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std12(int value) {
		setConstNumber(offset + 84, $std12, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std12(long value) {
		setConstNumber(offset + 84, $std12, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std12(float value) {
		setConstNumber(offset + 84, $std12, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std12(double value) {
		setConstNumber(offset + 84, $std12, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt12() {
		return getConstNumber(offset + 85, $amt12);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt12(MCNumber value) {
		setConstNumber(offset + 85, $amt12, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt12(int value) {
		setConstNumber(offset + 85, $amt12, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt12(long value) {
		setConstNumber(offset + 85, $amt12, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt12(float value) {
		setConstNumber(offset + 85, $amt12, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt12(double value) {
		setConstNumber(offset + 85, $amt12, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff12() {
		return getConstNumber(offset + 86, $diff12);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff12(MCNumber value) {
		setConstNumber(offset + 86, $diff12, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff12(int value) {
		setConstNumber(offset + 86, $diff12, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff12(long value) {
		setConstNumber(offset + 86, $diff12, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff12(float value) {
		setConstNumber(offset + 86, $diff12, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff12(double value) {
		setConstNumber(offset + 86, $diff12, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri13() {
		return getConstNumber(offset + 87, $upri13);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri13(MCNumber value) {
		setConstNumber(offset + 87, $upri13, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri13(int value) {
		setConstNumber(offset + 87, $upri13, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri13(long value) {
		setConstNumber(offset + 87, $upri13, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri13(float value) {
		setConstNumber(offset + 87, $upri13, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri13(double value) {
		setConstNumber(offset + 87, $upri13, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty13_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 88, $qty13_p);
	}
	
	public void qty13_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 88, $qty13_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std13() {
		return getConstNumber(offset + 89, $std13);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std13(MCNumber value) {
		setConstNumber(offset + 89, $std13, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std13(int value) {
		setConstNumber(offset + 89, $std13, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std13(long value) {
		setConstNumber(offset + 89, $std13, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std13(float value) {
		setConstNumber(offset + 89, $std13, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std13(double value) {
		setConstNumber(offset + 89, $std13, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt13() {
		return getConstNumber(offset + 90, $amt13);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt13(MCNumber value) {
		setConstNumber(offset + 90, $amt13, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt13(int value) {
		setConstNumber(offset + 90, $amt13, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt13(long value) {
		setConstNumber(offset + 90, $amt13, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt13(float value) {
		setConstNumber(offset + 90, $amt13, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt13(double value) {
		setConstNumber(offset + 90, $amt13, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff13() {
		return getConstNumber(offset + 91, $diff13);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff13(MCNumber value) {
		setConstNumber(offset + 91, $diff13, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff13(int value) {
		setConstNumber(offset + 91, $diff13, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff13(long value) {
		setConstNumber(offset + 91, $diff13, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff13(float value) {
		setConstNumber(offset + 91, $diff13, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff13(double value) {
		setConstNumber(offset + 91, $diff13, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri14() {
		return getConstNumber(offset + 92, $upri14);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri14(MCNumber value) {
		setConstNumber(offset + 92, $upri14, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri14(int value) {
		setConstNumber(offset + 92, $upri14, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri14(long value) {
		setConstNumber(offset + 92, $upri14, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri14(float value) {
		setConstNumber(offset + 92, $upri14, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri14(double value) {
		setConstNumber(offset + 92, $upri14, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty14_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 93, $qty14_p);
	}
	
	public void qty14_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 93, $qty14_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std14() {
		return getConstNumber(offset + 94, $std14);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std14(MCNumber value) {
		setConstNumber(offset + 94, $std14, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std14(int value) {
		setConstNumber(offset + 94, $std14, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std14(long value) {
		setConstNumber(offset + 94, $std14, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std14(float value) {
		setConstNumber(offset + 94, $std14, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std14(double value) {
		setConstNumber(offset + 94, $std14, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt14() {
		return getConstNumber(offset + 95, $amt14);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt14(MCNumber value) {
		setConstNumber(offset + 95, $amt14, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt14(int value) {
		setConstNumber(offset + 95, $amt14, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt14(long value) {
		setConstNumber(offset + 95, $amt14, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt14(float value) {
		setConstNumber(offset + 95, $amt14, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt14(double value) {
		setConstNumber(offset + 95, $amt14, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff14() {
		return getConstNumber(offset + 96, $diff14);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff14(MCNumber value) {
		setConstNumber(offset + 96, $diff14, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff14(int value) {
		setConstNumber(offset + 96, $diff14, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff14(long value) {
		setConstNumber(offset + 96, $diff14, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff14(float value) {
		setConstNumber(offset + 96, $diff14, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff14(double value) {
		setConstNumber(offset + 96, $diff14, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri15() {
		return getConstNumber(offset + 97, $upri15);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri15(MCNumber value) {
		setConstNumber(offset + 97, $upri15, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri15(int value) {
		setConstNumber(offset + 97, $upri15, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri15(long value) {
		setConstNumber(offset + 97, $upri15, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri15(float value) {
		setConstNumber(offset + 97, $upri15, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri15(double value) {
		setConstNumber(offset + 97, $upri15, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty15_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 98, $qty15_p);
	}
	
	public void qty15_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 98, $qty15_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std15() {
		return getConstNumber(offset + 99, $std15);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std15(MCNumber value) {
		setConstNumber(offset + 99, $std15, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std15(int value) {
		setConstNumber(offset + 99, $std15, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std15(long value) {
		setConstNumber(offset + 99, $std15, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std15(float value) {
		setConstNumber(offset + 99, $std15, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std15(double value) {
		setConstNumber(offset + 99, $std15, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt15() {
		return getConstNumber(offset + 100, $amt15);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt15(MCNumber value) {
		setConstNumber(offset + 100, $amt15, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt15(int value) {
		setConstNumber(offset + 100, $amt15, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt15(long value) {
		setConstNumber(offset + 100, $amt15, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt15(float value) {
		setConstNumber(offset + 100, $amt15, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt15(double value) {
		setConstNumber(offset + 100, $amt15, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff15() {
		return getConstNumber(offset + 101, $diff15);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff15(MCNumber value) {
		setConstNumber(offset + 101, $diff15, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff15(int value) {
		setConstNumber(offset + 101, $diff15, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff15(long value) {
		setConstNumber(offset + 101, $diff15, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff15(float value) {
		setConstNumber(offset + 101, $diff15, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff15(double value) {
		setConstNumber(offset + 101, $diff15, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri16() {
		return getConstNumber(offset + 102, $upri16);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri16(MCNumber value) {
		setConstNumber(offset + 102, $upri16, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri16(int value) {
		setConstNumber(offset + 102, $upri16, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri16(long value) {
		setConstNumber(offset + 102, $upri16, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri16(float value) {
		setConstNumber(offset + 102, $upri16, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri16(double value) {
		setConstNumber(offset + 102, $upri16, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty16_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 103, $qty16_p);
	}
	
	public void qty16_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 103, $qty16_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std16() {
		return getConstNumber(offset + 104, $std16);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std16(MCNumber value) {
		setConstNumber(offset + 104, $std16, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std16(int value) {
		setConstNumber(offset + 104, $std16, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std16(long value) {
		setConstNumber(offset + 104, $std16, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std16(float value) {
		setConstNumber(offset + 104, $std16, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std16(double value) {
		setConstNumber(offset + 104, $std16, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt16() {
		return getConstNumber(offset + 105, $amt16);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt16(MCNumber value) {
		setConstNumber(offset + 105, $amt16, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt16(int value) {
		setConstNumber(offset + 105, $amt16, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt16(long value) {
		setConstNumber(offset + 105, $amt16, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt16(float value) {
		setConstNumber(offset + 105, $amt16, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt16(double value) {
		setConstNumber(offset + 105, $amt16, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff16() {
		return getConstNumber(offset + 106, $diff16);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff16(MCNumber value) {
		setConstNumber(offset + 106, $diff16, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff16(int value) {
		setConstNumber(offset + 106, $diff16, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff16(long value) {
		setConstNumber(offset + 106, $diff16, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff16(float value) {
		setConstNumber(offset + 106, $diff16, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff16(double value) {
		setConstNumber(offset + 106, $diff16, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri17() {
		return getConstNumber(offset + 107, $upri17);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri17(MCNumber value) {
		setConstNumber(offset + 107, $upri17, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri17(int value) {
		setConstNumber(offset + 107, $upri17, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri17(long value) {
		setConstNumber(offset + 107, $upri17, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri17(float value) {
		setConstNumber(offset + 107, $upri17, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri17(double value) {
		setConstNumber(offset + 107, $upri17, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty17_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 108, $qty17_p);
	}
	
	public void qty17_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 108, $qty17_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std17() {
		return getConstNumber(offset + 109, $std17);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std17(MCNumber value) {
		setConstNumber(offset + 109, $std17, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std17(int value) {
		setConstNumber(offset + 109, $std17, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std17(long value) {
		setConstNumber(offset + 109, $std17, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std17(float value) {
		setConstNumber(offset + 109, $std17, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std17(double value) {
		setConstNumber(offset + 109, $std17, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt17() {
		return getConstNumber(offset + 110, $amt17);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt17(MCNumber value) {
		setConstNumber(offset + 110, $amt17, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt17(int value) {
		setConstNumber(offset + 110, $amt17, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt17(long value) {
		setConstNumber(offset + 110, $amt17, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt17(float value) {
		setConstNumber(offset + 110, $amt17, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt17(double value) {
		setConstNumber(offset + 110, $amt17, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff17() {
		return getConstNumber(offset + 111, $diff17);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff17(MCNumber value) {
		setConstNumber(offset + 111, $diff17, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff17(int value) {
		setConstNumber(offset + 111, $diff17, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff17(long value) {
		setConstNumber(offset + 111, $diff17, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff17(float value) {
		setConstNumber(offset + 111, $diff17, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff17(double value) {
		setConstNumber(offset + 111, $diff17, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri18() {
		return getConstNumber(offset + 112, $upri18);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri18(MCNumber value) {
		setConstNumber(offset + 112, $upri18, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri18(int value) {
		setConstNumber(offset + 112, $upri18, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri18(long value) {
		setConstNumber(offset + 112, $upri18, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri18(float value) {
		setConstNumber(offset + 112, $upri18, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri18(double value) {
		setConstNumber(offset + 112, $upri18, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty18_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 113, $qty18_p);
	}
	
	public void qty18_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 113, $qty18_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std18() {
		return getConstNumber(offset + 114, $std18);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std18(MCNumber value) {
		setConstNumber(offset + 114, $std18, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std18(int value) {
		setConstNumber(offset + 114, $std18, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std18(long value) {
		setConstNumber(offset + 114, $std18, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std18(float value) {
		setConstNumber(offset + 114, $std18, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std18(double value) {
		setConstNumber(offset + 114, $std18, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt18() {
		return getConstNumber(offset + 115, $amt18);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt18(MCNumber value) {
		setConstNumber(offset + 115, $amt18, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt18(int value) {
		setConstNumber(offset + 115, $amt18, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt18(long value) {
		setConstNumber(offset + 115, $amt18, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt18(float value) {
		setConstNumber(offset + 115, $amt18, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt18(double value) {
		setConstNumber(offset + 115, $amt18, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff18() {
		return getConstNumber(offset + 116, $diff18);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff18(MCNumber value) {
		setConstNumber(offset + 116, $diff18, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff18(int value) {
		setConstNumber(offset + 116, $diff18, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff18(long value) {
		setConstNumber(offset + 116, $diff18, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff18(float value) {
		setConstNumber(offset + 116, $diff18, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff18(double value) {
		setConstNumber(offset + 116, $diff18, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri19() {
		return getConstNumber(offset + 117, $upri19);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri19(MCNumber value) {
		setConstNumber(offset + 117, $upri19, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri19(int value) {
		setConstNumber(offset + 117, $upri19, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri19(long value) {
		setConstNumber(offset + 117, $upri19, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri19(float value) {
		setConstNumber(offset + 117, $upri19, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri19(double value) {
		setConstNumber(offset + 117, $upri19, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty19_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 118, $qty19_p);
	}
	
	public void qty19_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 118, $qty19_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std19() {
		return getConstNumber(offset + 119, $std19);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std19(MCNumber value) {
		setConstNumber(offset + 119, $std19, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std19(int value) {
		setConstNumber(offset + 119, $std19, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std19(long value) {
		setConstNumber(offset + 119, $std19, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std19(float value) {
		setConstNumber(offset + 119, $std19, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std19(double value) {
		setConstNumber(offset + 119, $std19, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt19() {
		return getConstNumber(offset + 120, $amt19);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt19(MCNumber value) {
		setConstNumber(offset + 120, $amt19, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt19(int value) {
		setConstNumber(offset + 120, $amt19, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt19(long value) {
		setConstNumber(offset + 120, $amt19, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt19(float value) {
		setConstNumber(offset + 120, $amt19, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt19(double value) {
		setConstNumber(offset + 120, $amt19, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff19() {
		return getConstNumber(offset + 121, $diff19);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff19(MCNumber value) {
		setConstNumber(offset + 121, $diff19, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff19(int value) {
		setConstNumber(offset + 121, $diff19, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff19(long value) {
		setConstNumber(offset + 121, $diff19, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff19(float value) {
		setConstNumber(offset + 121, $diff19, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff19(double value) {
		setConstNumber(offset + 121, $diff19, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri20() {
		return getConstNumber(offset + 122, $upri20);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri20(MCNumber value) {
		setConstNumber(offset + 122, $upri20, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri20(int value) {
		setConstNumber(offset + 122, $upri20, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri20(long value) {
		setConstNumber(offset + 122, $upri20, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri20(float value) {
		setConstNumber(offset + 122, $upri20, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri20(double value) {
		setConstNumber(offset + 122, $upri20, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty20_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 123, $qty20_p);
	}
	
	public void qty20_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 123, $qty20_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std20() {
		return getConstNumber(offset + 124, $std20);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std20(MCNumber value) {
		setConstNumber(offset + 124, $std20, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std20(int value) {
		setConstNumber(offset + 124, $std20, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std20(long value) {
		setConstNumber(offset + 124, $std20, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std20(float value) {
		setConstNumber(offset + 124, $std20, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std20(double value) {
		setConstNumber(offset + 124, $std20, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt20() {
		return getConstNumber(offset + 125, $amt20);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt20(MCNumber value) {
		setConstNumber(offset + 125, $amt20, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt20(int value) {
		setConstNumber(offset + 125, $amt20, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt20(long value) {
		setConstNumber(offset + 125, $amt20, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt20(float value) {
		setConstNumber(offset + 125, $amt20, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt20(double value) {
		setConstNumber(offset + 125, $amt20, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff20() {
		return getConstNumber(offset + 126, $diff20);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff20(MCNumber value) {
		setConstNumber(offset + 126, $diff20, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff20(int value) {
		setConstNumber(offset + 126, $diff20, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff20(long value) {
		setConstNumber(offset + 126, $diff20, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff20(float value) {
		setConstNumber(offset + 126, $diff20, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff20(double value) {
		setConstNumber(offset + 126, $diff20, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri21() {
		return getConstNumber(offset + 127, $upri21);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri21(MCNumber value) {
		setConstNumber(offset + 127, $upri21, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri21(int value) {
		setConstNumber(offset + 127, $upri21, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri21(long value) {
		setConstNumber(offset + 127, $upri21, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri21(float value) {
		setConstNumber(offset + 127, $upri21, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri21(double value) {
		setConstNumber(offset + 127, $upri21, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty21_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 128, $qty21_p);
	}
	
	public void qty21_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 128, $qty21_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std21() {
		return getConstNumber(offset + 129, $std21);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std21(MCNumber value) {
		setConstNumber(offset + 129, $std21, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std21(int value) {
		setConstNumber(offset + 129, $std21, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std21(long value) {
		setConstNumber(offset + 129, $std21, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std21(float value) {
		setConstNumber(offset + 129, $std21, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std21(double value) {
		setConstNumber(offset + 129, $std21, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt21() {
		return getConstNumber(offset + 130, $amt21);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt21(MCNumber value) {
		setConstNumber(offset + 130, $amt21, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt21(int value) {
		setConstNumber(offset + 130, $amt21, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt21(long value) {
		setConstNumber(offset + 130, $amt21, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt21(float value) {
		setConstNumber(offset + 130, $amt21, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt21(double value) {
		setConstNumber(offset + 130, $amt21, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff21() {
		return getConstNumber(offset + 131, $diff21);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff21(MCNumber value) {
		setConstNumber(offset + 131, $diff21, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff21(int value) {
		setConstNumber(offset + 131, $diff21, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff21(long value) {
		setConstNumber(offset + 131, $diff21, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff21(float value) {
		setConstNumber(offset + 131, $diff21, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff21(double value) {
		setConstNumber(offset + 131, $diff21, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri22() {
		return getConstNumber(offset + 132, $upri22);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri22(MCNumber value) {
		setConstNumber(offset + 132, $upri22, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri22(int value) {
		setConstNumber(offset + 132, $upri22, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri22(long value) {
		setConstNumber(offset + 132, $upri22, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri22(float value) {
		setConstNumber(offset + 132, $upri22, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri22(double value) {
		setConstNumber(offset + 132, $upri22, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty22_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 133, $qty22_p);
	}
	
	public void qty22_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 133, $qty22_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std22() {
		return getConstNumber(offset + 134, $std22);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std22(MCNumber value) {
		setConstNumber(offset + 134, $std22, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std22(int value) {
		setConstNumber(offset + 134, $std22, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std22(long value) {
		setConstNumber(offset + 134, $std22, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std22(float value) {
		setConstNumber(offset + 134, $std22, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std22(double value) {
		setConstNumber(offset + 134, $std22, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt22() {
		return getConstNumber(offset + 135, $amt22);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt22(MCNumber value) {
		setConstNumber(offset + 135, $amt22, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt22(int value) {
		setConstNumber(offset + 135, $amt22, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt22(long value) {
		setConstNumber(offset + 135, $amt22, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt22(float value) {
		setConstNumber(offset + 135, $amt22, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt22(double value) {
		setConstNumber(offset + 135, $amt22, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff22() {
		return getConstNumber(offset + 136, $diff22);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff22(MCNumber value) {
		setConstNumber(offset + 136, $diff22, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff22(int value) {
		setConstNumber(offset + 136, $diff22, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff22(long value) {
		setConstNumber(offset + 136, $diff22, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff22(float value) {
		setConstNumber(offset + 136, $diff22, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff22(double value) {
		setConstNumber(offset + 136, $diff22, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri23() {
		return getConstNumber(offset + 137, $upri23);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri23(MCNumber value) {
		setConstNumber(offset + 137, $upri23, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri23(int value) {
		setConstNumber(offset + 137, $upri23, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri23(long value) {
		setConstNumber(offset + 137, $upri23, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri23(float value) {
		setConstNumber(offset + 137, $upri23, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri23(double value) {
		setConstNumber(offset + 137, $upri23, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty23_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 138, $qty23_p);
	}
	
	public void qty23_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 138, $qty23_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std23() {
		return getConstNumber(offset + 139, $std23);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std23(MCNumber value) {
		setConstNumber(offset + 139, $std23, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std23(int value) {
		setConstNumber(offset + 139, $std23, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std23(long value) {
		setConstNumber(offset + 139, $std23, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std23(float value) {
		setConstNumber(offset + 139, $std23, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std23(double value) {
		setConstNumber(offset + 139, $std23, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt23() {
		return getConstNumber(offset + 140, $amt23);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt23(MCNumber value) {
		setConstNumber(offset + 140, $amt23, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt23(int value) {
		setConstNumber(offset + 140, $amt23, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt23(long value) {
		setConstNumber(offset + 140, $amt23, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt23(float value) {
		setConstNumber(offset + 140, $amt23, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt23(double value) {
		setConstNumber(offset + 140, $amt23, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff23() {
		return getConstNumber(offset + 141, $diff23);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff23(MCNumber value) {
		setConstNumber(offset + 141, $diff23, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff23(int value) {
		setConstNumber(offset + 141, $diff23, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff23(long value) {
		setConstNumber(offset + 141, $diff23, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff23(float value) {
		setConstNumber(offset + 141, $diff23, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff23(double value) {
		setConstNumber(offset + 141, $diff23, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri24() {
		return getConstNumber(offset + 142, $upri24);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri24(MCNumber value) {
		setConstNumber(offset + 142, $upri24, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri24(int value) {
		setConstNumber(offset + 142, $upri24, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri24(long value) {
		setConstNumber(offset + 142, $upri24, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri24(float value) {
		setConstNumber(offset + 142, $upri24, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri24(double value) {
		setConstNumber(offset + 142, $upri24, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty24_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 143, $qty24_p);
	}
	
	public void qty24_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 143, $qty24_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std24() {
		return getConstNumber(offset + 144, $std24);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std24(MCNumber value) {
		setConstNumber(offset + 144, $std24, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std24(int value) {
		setConstNumber(offset + 144, $std24, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std24(long value) {
		setConstNumber(offset + 144, $std24, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std24(float value) {
		setConstNumber(offset + 144, $std24, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std24(double value) {
		setConstNumber(offset + 144, $std24, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt24() {
		return getConstNumber(offset + 145, $amt24);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt24(MCNumber value) {
		setConstNumber(offset + 145, $amt24, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt24(int value) {
		setConstNumber(offset + 145, $amt24, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt24(long value) {
		setConstNumber(offset + 145, $amt24, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt24(float value) {
		setConstNumber(offset + 145, $amt24, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt24(double value) {
		setConstNumber(offset + 145, $amt24, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff24() {
		return getConstNumber(offset + 146, $diff24);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff24(MCNumber value) {
		setConstNumber(offset + 146, $diff24, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff24(int value) {
		setConstNumber(offset + 146, $diff24, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff24(long value) {
		setConstNumber(offset + 146, $diff24, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff24(float value) {
		setConstNumber(offset + 146, $diff24, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff24(double value) {
		setConstNumber(offset + 146, $diff24, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri25() {
		return getConstNumber(offset + 147, $upri25);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri25(MCNumber value) {
		setConstNumber(offset + 147, $upri25, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri25(int value) {
		setConstNumber(offset + 147, $upri25, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri25(long value) {
		setConstNumber(offset + 147, $upri25, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri25(float value) {
		setConstNumber(offset + 147, $upri25, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri25(double value) {
		setConstNumber(offset + 147, $upri25, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty25_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 148, $qty25_p);
	}
	
	public void qty25_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 148, $qty25_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std25() {
		return getConstNumber(offset + 149, $std25);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std25(MCNumber value) {
		setConstNumber(offset + 149, $std25, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std25(int value) {
		setConstNumber(offset + 149, $std25, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std25(long value) {
		setConstNumber(offset + 149, $std25, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std25(float value) {
		setConstNumber(offset + 149, $std25, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std25(double value) {
		setConstNumber(offset + 149, $std25, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt25() {
		return getConstNumber(offset + 150, $amt25);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt25(MCNumber value) {
		setConstNumber(offset + 150, $amt25, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt25(int value) {
		setConstNumber(offset + 150, $amt25, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt25(long value) {
		setConstNumber(offset + 150, $amt25, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt25(float value) {
		setConstNumber(offset + 150, $amt25, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt25(double value) {
		setConstNumber(offset + 150, $amt25, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff25() {
		return getConstNumber(offset + 151, $diff25);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff25(MCNumber value) {
		setConstNumber(offset + 151, $diff25, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff25(int value) {
		setConstNumber(offset + 151, $diff25, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff25(long value) {
		setConstNumber(offset + 151, $diff25, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff25(float value) {
		setConstNumber(offset + 151, $diff25, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff25(double value) {
		setConstNumber(offset + 151, $diff25, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri26() {
		return getConstNumber(offset + 152, $upri26);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri26(MCNumber value) {
		setConstNumber(offset + 152, $upri26, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri26(int value) {
		setConstNumber(offset + 152, $upri26, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri26(long value) {
		setConstNumber(offset + 152, $upri26, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri26(float value) {
		setConstNumber(offset + 152, $upri26, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri26(double value) {
		setConstNumber(offset + 152, $upri26, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty26_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 153, $qty26_p);
	}
	
	public void qty26_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 153, $qty26_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std26() {
		return getConstNumber(offset + 154, $std26);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std26(MCNumber value) {
		setConstNumber(offset + 154, $std26, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std26(int value) {
		setConstNumber(offset + 154, $std26, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std26(long value) {
		setConstNumber(offset + 154, $std26, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std26(float value) {
		setConstNumber(offset + 154, $std26, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std26(double value) {
		setConstNumber(offset + 154, $std26, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt26() {
		return getConstNumber(offset + 155, $amt26);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt26(MCNumber value) {
		setConstNumber(offset + 155, $amt26, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt26(int value) {
		setConstNumber(offset + 155, $amt26, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt26(long value) {
		setConstNumber(offset + 155, $amt26, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt26(float value) {
		setConstNumber(offset + 155, $amt26, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt26(double value) {
		setConstNumber(offset + 155, $amt26, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff26() {
		return getConstNumber(offset + 156, $diff26);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff26(MCNumber value) {
		setConstNumber(offset + 156, $diff26, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff26(int value) {
		setConstNumber(offset + 156, $diff26, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff26(long value) {
		setConstNumber(offset + 156, $diff26, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff26(float value) {
		setConstNumber(offset + 156, $diff26, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff26(double value) {
		setConstNumber(offset + 156, $diff26, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri27() {
		return getConstNumber(offset + 157, $upri27);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri27(MCNumber value) {
		setConstNumber(offset + 157, $upri27, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri27(int value) {
		setConstNumber(offset + 157, $upri27, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri27(long value) {
		setConstNumber(offset + 157, $upri27, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri27(float value) {
		setConstNumber(offset + 157, $upri27, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri27(double value) {
		setConstNumber(offset + 157, $upri27, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty27_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 158, $qty27_p);
	}
	
	public void qty27_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 158, $qty27_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std27() {
		return getConstNumber(offset + 159, $std27);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std27(MCNumber value) {
		setConstNumber(offset + 159, $std27, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std27(int value) {
		setConstNumber(offset + 159, $std27, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std27(long value) {
		setConstNumber(offset + 159, $std27, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std27(float value) {
		setConstNumber(offset + 159, $std27, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std27(double value) {
		setConstNumber(offset + 159, $std27, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt27() {
		return getConstNumber(offset + 160, $amt27);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt27(MCNumber value) {
		setConstNumber(offset + 160, $amt27, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt27(int value) {
		setConstNumber(offset + 160, $amt27, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt27(long value) {
		setConstNumber(offset + 160, $amt27, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt27(float value) {
		setConstNumber(offset + 160, $amt27, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt27(double value) {
		setConstNumber(offset + 160, $amt27, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff27() {
		return getConstNumber(offset + 161, $diff27);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff27(MCNumber value) {
		setConstNumber(offset + 161, $diff27, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff27(int value) {
		setConstNumber(offset + 161, $diff27, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff27(long value) {
		setConstNumber(offset + 161, $diff27, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff27(float value) {
		setConstNumber(offset + 161, $diff27, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff27(double value) {
		setConstNumber(offset + 161, $diff27, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri28() {
		return getConstNumber(offset + 162, $upri28);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri28(MCNumber value) {
		setConstNumber(offset + 162, $upri28, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri28(int value) {
		setConstNumber(offset + 162, $upri28, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri28(long value) {
		setConstNumber(offset + 162, $upri28, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri28(float value) {
		setConstNumber(offset + 162, $upri28, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri28(double value) {
		setConstNumber(offset + 162, $upri28, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty28_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 163, $qty28_p);
	}
	
	public void qty28_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 163, $qty28_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std28() {
		return getConstNumber(offset + 164, $std28);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std28(MCNumber value) {
		setConstNumber(offset + 164, $std28, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std28(int value) {
		setConstNumber(offset + 164, $std28, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std28(long value) {
		setConstNumber(offset + 164, $std28, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std28(float value) {
		setConstNumber(offset + 164, $std28, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std28(double value) {
		setConstNumber(offset + 164, $std28, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt28() {
		return getConstNumber(offset + 165, $amt28);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt28(MCNumber value) {
		setConstNumber(offset + 165, $amt28, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt28(int value) {
		setConstNumber(offset + 165, $amt28, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt28(long value) {
		setConstNumber(offset + 165, $amt28, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt28(float value) {
		setConstNumber(offset + 165, $amt28, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt28(double value) {
		setConstNumber(offset + 165, $amt28, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff28() {
		return getConstNumber(offset + 166, $diff28);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff28(MCNumber value) {
		setConstNumber(offset + 166, $diff28, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff28(int value) {
		setConstNumber(offset + 166, $diff28, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff28(long value) {
		setConstNumber(offset + 166, $diff28, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff28(float value) {
		setConstNumber(offset + 166, $diff28, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff28(double value) {
		setConstNumber(offset + 166, $diff28, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri29() {
		return getConstNumber(offset + 167, $upri29);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri29(MCNumber value) {
		setConstNumber(offset + 167, $upri29, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri29(int value) {
		setConstNumber(offset + 167, $upri29, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri29(long value) {
		setConstNumber(offset + 167, $upri29, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri29(float value) {
		setConstNumber(offset + 167, $upri29, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri29(double value) {
		setConstNumber(offset + 167, $upri29, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty29_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 168, $qty29_p);
	}
	
	public void qty29_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 168, $qty29_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std29() {
		return getConstNumber(offset + 169, $std29);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std29(MCNumber value) {
		setConstNumber(offset + 169, $std29, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std29(int value) {
		setConstNumber(offset + 169, $std29, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std29(long value) {
		setConstNumber(offset + 169, $std29, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std29(float value) {
		setConstNumber(offset + 169, $std29, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std29(double value) {
		setConstNumber(offset + 169, $std29, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt29() {
		return getConstNumber(offset + 170, $amt29);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt29(MCNumber value) {
		setConstNumber(offset + 170, $amt29, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt29(int value) {
		setConstNumber(offset + 170, $amt29, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt29(long value) {
		setConstNumber(offset + 170, $amt29, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt29(float value) {
		setConstNumber(offset + 170, $amt29, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt29(double value) {
		setConstNumber(offset + 170, $amt29, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff29() {
		return getConstNumber(offset + 171, $diff29);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff29(MCNumber value) {
		setConstNumber(offset + 171, $diff29, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff29(int value) {
		setConstNumber(offset + 171, $diff29, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff29(long value) {
		setConstNumber(offset + 171, $diff29, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff29(float value) {
		setConstNumber(offset + 171, $diff29, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff29(double value) {
		setConstNumber(offset + 171, $diff29, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri30() {
		return getConstNumber(offset + 172, $upri30);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri30(MCNumber value) {
		setConstNumber(offset + 172, $upri30, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri30(int value) {
		setConstNumber(offset + 172, $upri30, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri30(long value) {
		setConstNumber(offset + 172, $upri30, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri30(float value) {
		setConstNumber(offset + 172, $upri30, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri30(double value) {
		setConstNumber(offset + 172, $upri30, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty30_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 173, $qty30_p);
	}
	
	public void qty30_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 173, $qty30_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std30() {
		return getConstNumber(offset + 174, $std30);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std30(MCNumber value) {
		setConstNumber(offset + 174, $std30, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std30(int value) {
		setConstNumber(offset + 174, $std30, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std30(long value) {
		setConstNumber(offset + 174, $std30, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std30(float value) {
		setConstNumber(offset + 174, $std30, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std30(double value) {
		setConstNumber(offset + 174, $std30, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt30() {
		return getConstNumber(offset + 175, $amt30);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt30(MCNumber value) {
		setConstNumber(offset + 175, $amt30, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt30(int value) {
		setConstNumber(offset + 175, $amt30, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt30(long value) {
		setConstNumber(offset + 175, $amt30, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt30(float value) {
		setConstNumber(offset + 175, $amt30, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt30(double value) {
		setConstNumber(offset + 175, $amt30, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff30() {
		return getConstNumber(offset + 176, $diff30);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff30(MCNumber value) {
		setConstNumber(offset + 176, $diff30, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff30(int value) {
		setConstNumber(offset + 176, $diff30, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff30(long value) {
		setConstNumber(offset + 176, $diff30, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff30(float value) {
		setConstNumber(offset + 176, $diff30, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff30(double value) {
		setConstNumber(offset + 176, $diff30, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR diff_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 177, $diff_qty_p);
	}
	
	public void diff_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 177, $diff_qty_p, row);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber diff_std() {
		return getConstNumber(offset + 178, $diff_std);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void diff_std(MCNumber value) {
		setConstNumber(offset + 178, $diff_std, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void diff_std(int value) {
		setConstNumber(offset + 178, $diff_std, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void diff_std(long value) {
		setConstNumber(offset + 178, $diff_std, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void diff_std(float value) {
		setConstNumber(offset + 178, $diff_std, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void diff_std(double value) {
		setConstNumber(offset + 178, $diff_std, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber diff_amt() {
		return getConstNumber(offset + 179, $diff_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void diff_amt(MCNumber value) {
		setConstNumber(offset + 179, $diff_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void diff_amt(int value) {
		setConstNumber(offset + 179, $diff_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void diff_amt(long value) {
		setConstNumber(offset + 179, $diff_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void diff_amt(float value) {
		setConstNumber(offset + 179, $diff_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void diff_amt(double value) {
		setConstNumber(offset + 179, $diff_amt, value);
	}


	/**
	 * For weighted average unit price 総平均単価対象.<p>
	 *
	 */
	public MCNumber ave_tgt() {
		return getConstNumber(offset + 180, $ave_tgt);
	}

	/**
	 * For weighted average unit price 総平均単価対象.<p>
	 *
	 */
	public void ave_tgt(MCNumber value) {
		setConstNumber(offset + 180, $ave_tgt, value);
	}

	/**
	 * For weighted average unit price 総平均単価対象.<p>
	 *
	 */
	public void ave_tgt(int value) {
		setConstNumber(offset + 180, $ave_tgt, value);
	}

	/**
	 * For weighted average unit price 総平均単価対象.<p>
	 *
	 */
	public void ave_tgt(long value) {
		setConstNumber(offset + 180, $ave_tgt, value);
	}

	/**
	 * For weighted average unit price 総平均単価対象.<p>
	 *
	 */
	public void ave_tgt(float value) {
		setConstNumber(offset + 180, $ave_tgt, value);
	}

	/**
	 * For weighted average unit price 総平均単価対象.<p>
	 *
	 */
	public void ave_tgt(double value) {
		setConstNumber(offset + 180, $ave_tgt, value);
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($upri01.equalsIgnoreCase(name)) {
			return upri01();
		}
		if ($std01.equalsIgnoreCase(name)) {
			return std01();
		}
		if ($amt01.equalsIgnoreCase(name)) {
			return amt01();
		}
		if ($diff01.equalsIgnoreCase(name)) {
			return diff01();
		}
		if ($upri02.equalsIgnoreCase(name)) {
			return upri02();
		}
		if ($std02.equalsIgnoreCase(name)) {
			return std02();
		}
		if ($amt02.equalsIgnoreCase(name)) {
			return amt02();
		}
		if ($diff02.equalsIgnoreCase(name)) {
			return diff02();
		}
		if ($upri03.equalsIgnoreCase(name)) {
			return upri03();
		}
		if ($std03.equalsIgnoreCase(name)) {
			return std03();
		}
		if ($amt03.equalsIgnoreCase(name)) {
			return amt03();
		}
		if ($diff03.equalsIgnoreCase(name)) {
			return diff03();
		}
		if ($upri04.equalsIgnoreCase(name)) {
			return upri04();
		}
		if ($std04.equalsIgnoreCase(name)) {
			return std04();
		}
		if ($amt04.equalsIgnoreCase(name)) {
			return amt04();
		}
		if ($diff04.equalsIgnoreCase(name)) {
			return diff04();
		}
		if ($upri05.equalsIgnoreCase(name)) {
			return upri05();
		}
		if ($std05.equalsIgnoreCase(name)) {
			return std05();
		}
		if ($amt05.equalsIgnoreCase(name)) {
			return amt05();
		}
		if ($diff05.equalsIgnoreCase(name)) {
			return diff05();
		}
		if ($upri06.equalsIgnoreCase(name)) {
			return upri06();
		}
		if ($std06.equalsIgnoreCase(name)) {
			return std06();
		}
		if ($amt06.equalsIgnoreCase(name)) {
			return amt06();
		}
		if ($diff06.equalsIgnoreCase(name)) {
			return diff06();
		}
		if ($upri07.equalsIgnoreCase(name)) {
			return upri07();
		}
		if ($std07.equalsIgnoreCase(name)) {
			return std07();
		}
		if ($amt07.equalsIgnoreCase(name)) {
			return amt07();
		}
		if ($diff07.equalsIgnoreCase(name)) {
			return diff07();
		}
		if ($upri08.equalsIgnoreCase(name)) {
			return upri08();
		}
		if ($std08.equalsIgnoreCase(name)) {
			return std08();
		}
		if ($amt08.equalsIgnoreCase(name)) {
			return amt08();
		}
		if ($diff08.equalsIgnoreCase(name)) {
			return diff08();
		}
		if ($upri09.equalsIgnoreCase(name)) {
			return upri09();
		}
		if ($std09.equalsIgnoreCase(name)) {
			return std09();
		}
		if ($amt09.equalsIgnoreCase(name)) {
			return amt09();
		}
		if ($diff09.equalsIgnoreCase(name)) {
			return diff09();
		}
		if ($upri10.equalsIgnoreCase(name)) {
			return upri10();
		}
		if ($std10.equalsIgnoreCase(name)) {
			return std10();
		}
		if ($amt10.equalsIgnoreCase(name)) {
			return amt10();
		}
		if ($diff10.equalsIgnoreCase(name)) {
			return diff10();
		}
		if ($upri11.equalsIgnoreCase(name)) {
			return upri11();
		}
		if ($std11.equalsIgnoreCase(name)) {
			return std11();
		}
		if ($amt11.equalsIgnoreCase(name)) {
			return amt11();
		}
		if ($diff11.equalsIgnoreCase(name)) {
			return diff11();
		}
		if ($upri12.equalsIgnoreCase(name)) {
			return upri12();
		}
		if ($std12.equalsIgnoreCase(name)) {
			return std12();
		}
		if ($amt12.equalsIgnoreCase(name)) {
			return amt12();
		}
		if ($diff12.equalsIgnoreCase(name)) {
			return diff12();
		}
		if ($upri13.equalsIgnoreCase(name)) {
			return upri13();
		}
		if ($std13.equalsIgnoreCase(name)) {
			return std13();
		}
		if ($amt13.equalsIgnoreCase(name)) {
			return amt13();
		}
		if ($diff13.equalsIgnoreCase(name)) {
			return diff13();
		}
		if ($upri14.equalsIgnoreCase(name)) {
			return upri14();
		}
		if ($std14.equalsIgnoreCase(name)) {
			return std14();
		}
		if ($amt14.equalsIgnoreCase(name)) {
			return amt14();
		}
		if ($diff14.equalsIgnoreCase(name)) {
			return diff14();
		}
		if ($upri15.equalsIgnoreCase(name)) {
			return upri15();
		}
		if ($std15.equalsIgnoreCase(name)) {
			return std15();
		}
		if ($amt15.equalsIgnoreCase(name)) {
			return amt15();
		}
		if ($diff15.equalsIgnoreCase(name)) {
			return diff15();
		}
		if ($upri16.equalsIgnoreCase(name)) {
			return upri16();
		}
		if ($std16.equalsIgnoreCase(name)) {
			return std16();
		}
		if ($amt16.equalsIgnoreCase(name)) {
			return amt16();
		}
		if ($diff16.equalsIgnoreCase(name)) {
			return diff16();
		}
		if ($upri17.equalsIgnoreCase(name)) {
			return upri17();
		}
		if ($std17.equalsIgnoreCase(name)) {
			return std17();
		}
		if ($amt17.equalsIgnoreCase(name)) {
			return amt17();
		}
		if ($diff17.equalsIgnoreCase(name)) {
			return diff17();
		}
		if ($upri18.equalsIgnoreCase(name)) {
			return upri18();
		}
		if ($std18.equalsIgnoreCase(name)) {
			return std18();
		}
		if ($amt18.equalsIgnoreCase(name)) {
			return amt18();
		}
		if ($diff18.equalsIgnoreCase(name)) {
			return diff18();
		}
		if ($upri19.equalsIgnoreCase(name)) {
			return upri19();
		}
		if ($std19.equalsIgnoreCase(name)) {
			return std19();
		}
		if ($amt19.equalsIgnoreCase(name)) {
			return amt19();
		}
		if ($diff19.equalsIgnoreCase(name)) {
			return diff19();
		}
		if ($upri20.equalsIgnoreCase(name)) {
			return upri20();
		}
		if ($std20.equalsIgnoreCase(name)) {
			return std20();
		}
		if ($amt20.equalsIgnoreCase(name)) {
			return amt20();
		}
		if ($diff20.equalsIgnoreCase(name)) {
			return diff20();
		}
		if ($upri21.equalsIgnoreCase(name)) {
			return upri21();
		}
		if ($std21.equalsIgnoreCase(name)) {
			return std21();
		}
		if ($amt21.equalsIgnoreCase(name)) {
			return amt21();
		}
		if ($diff21.equalsIgnoreCase(name)) {
			return diff21();
		}
		if ($upri22.equalsIgnoreCase(name)) {
			return upri22();
		}
		if ($std22.equalsIgnoreCase(name)) {
			return std22();
		}
		if ($amt22.equalsIgnoreCase(name)) {
			return amt22();
		}
		if ($diff22.equalsIgnoreCase(name)) {
			return diff22();
		}
		if ($upri23.equalsIgnoreCase(name)) {
			return upri23();
		}
		if ($std23.equalsIgnoreCase(name)) {
			return std23();
		}
		if ($amt23.equalsIgnoreCase(name)) {
			return amt23();
		}
		if ($diff23.equalsIgnoreCase(name)) {
			return diff23();
		}
		if ($upri24.equalsIgnoreCase(name)) {
			return upri24();
		}
		if ($std24.equalsIgnoreCase(name)) {
			return std24();
		}
		if ($amt24.equalsIgnoreCase(name)) {
			return amt24();
		}
		if ($diff24.equalsIgnoreCase(name)) {
			return diff24();
		}
		if ($upri25.equalsIgnoreCase(name)) {
			return upri25();
		}
		if ($std25.equalsIgnoreCase(name)) {
			return std25();
		}
		if ($amt25.equalsIgnoreCase(name)) {
			return amt25();
		}
		if ($diff25.equalsIgnoreCase(name)) {
			return diff25();
		}
		if ($upri26.equalsIgnoreCase(name)) {
			return upri26();
		}
		if ($std26.equalsIgnoreCase(name)) {
			return std26();
		}
		if ($amt26.equalsIgnoreCase(name)) {
			return amt26();
		}
		if ($diff26.equalsIgnoreCase(name)) {
			return diff26();
		}
		if ($upri27.equalsIgnoreCase(name)) {
			return upri27();
		}
		if ($std27.equalsIgnoreCase(name)) {
			return std27();
		}
		if ($amt27.equalsIgnoreCase(name)) {
			return amt27();
		}
		if ($diff27.equalsIgnoreCase(name)) {
			return diff27();
		}
		if ($upri28.equalsIgnoreCase(name)) {
			return upri28();
		}
		if ($std28.equalsIgnoreCase(name)) {
			return std28();
		}
		if ($amt28.equalsIgnoreCase(name)) {
			return amt28();
		}
		if ($diff28.equalsIgnoreCase(name)) {
			return diff28();
		}
		if ($upri29.equalsIgnoreCase(name)) {
			return upri29();
		}
		if ($std29.equalsIgnoreCase(name)) {
			return std29();
		}
		if ($amt29.equalsIgnoreCase(name)) {
			return amt29();
		}
		if ($diff29.equalsIgnoreCase(name)) {
			return diff29();
		}
		if ($upri30.equalsIgnoreCase(name)) {
			return upri30();
		}
		if ($std30.equalsIgnoreCase(name)) {
			return std30();
		}
		if ($amt30.equalsIgnoreCase(name)) {
			return amt30();
		}
		if ($diff30.equalsIgnoreCase(name)) {
			return diff30();
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			return diff_std();
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			return diff_amt();
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			return ave_tgt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($upri01.equalsIgnoreCase(name)) {
			return upri01();
		}
		if ($std01.equalsIgnoreCase(name)) {
			return std01();
		}
		if ($amt01.equalsIgnoreCase(name)) {
			return amt01();
		}
		if ($diff01.equalsIgnoreCase(name)) {
			return diff01();
		}
		if ($upri02.equalsIgnoreCase(name)) {
			return upri02();
		}
		if ($std02.equalsIgnoreCase(name)) {
			return std02();
		}
		if ($amt02.equalsIgnoreCase(name)) {
			return amt02();
		}
		if ($diff02.equalsIgnoreCase(name)) {
			return diff02();
		}
		if ($upri03.equalsIgnoreCase(name)) {
			return upri03();
		}
		if ($std03.equalsIgnoreCase(name)) {
			return std03();
		}
		if ($amt03.equalsIgnoreCase(name)) {
			return amt03();
		}
		if ($diff03.equalsIgnoreCase(name)) {
			return diff03();
		}
		if ($upri04.equalsIgnoreCase(name)) {
			return upri04();
		}
		if ($std04.equalsIgnoreCase(name)) {
			return std04();
		}
		if ($amt04.equalsIgnoreCase(name)) {
			return amt04();
		}
		if ($diff04.equalsIgnoreCase(name)) {
			return diff04();
		}
		if ($upri05.equalsIgnoreCase(name)) {
			return upri05();
		}
		if ($std05.equalsIgnoreCase(name)) {
			return std05();
		}
		if ($amt05.equalsIgnoreCase(name)) {
			return amt05();
		}
		if ($diff05.equalsIgnoreCase(name)) {
			return diff05();
		}
		if ($upri06.equalsIgnoreCase(name)) {
			return upri06();
		}
		if ($std06.equalsIgnoreCase(name)) {
			return std06();
		}
		if ($amt06.equalsIgnoreCase(name)) {
			return amt06();
		}
		if ($diff06.equalsIgnoreCase(name)) {
			return diff06();
		}
		if ($upri07.equalsIgnoreCase(name)) {
			return upri07();
		}
		if ($std07.equalsIgnoreCase(name)) {
			return std07();
		}
		if ($amt07.equalsIgnoreCase(name)) {
			return amt07();
		}
		if ($diff07.equalsIgnoreCase(name)) {
			return diff07();
		}
		if ($upri08.equalsIgnoreCase(name)) {
			return upri08();
		}
		if ($std08.equalsIgnoreCase(name)) {
			return std08();
		}
		if ($amt08.equalsIgnoreCase(name)) {
			return amt08();
		}
		if ($diff08.equalsIgnoreCase(name)) {
			return diff08();
		}
		if ($upri09.equalsIgnoreCase(name)) {
			return upri09();
		}
		if ($std09.equalsIgnoreCase(name)) {
			return std09();
		}
		if ($amt09.equalsIgnoreCase(name)) {
			return amt09();
		}
		if ($diff09.equalsIgnoreCase(name)) {
			return diff09();
		}
		if ($upri10.equalsIgnoreCase(name)) {
			return upri10();
		}
		if ($std10.equalsIgnoreCase(name)) {
			return std10();
		}
		if ($amt10.equalsIgnoreCase(name)) {
			return amt10();
		}
		if ($diff10.equalsIgnoreCase(name)) {
			return diff10();
		}
		if ($upri11.equalsIgnoreCase(name)) {
			return upri11();
		}
		if ($std11.equalsIgnoreCase(name)) {
			return std11();
		}
		if ($amt11.equalsIgnoreCase(name)) {
			return amt11();
		}
		if ($diff11.equalsIgnoreCase(name)) {
			return diff11();
		}
		if ($upri12.equalsIgnoreCase(name)) {
			return upri12();
		}
		if ($std12.equalsIgnoreCase(name)) {
			return std12();
		}
		if ($amt12.equalsIgnoreCase(name)) {
			return amt12();
		}
		if ($diff12.equalsIgnoreCase(name)) {
			return diff12();
		}
		if ($upri13.equalsIgnoreCase(name)) {
			return upri13();
		}
		if ($std13.equalsIgnoreCase(name)) {
			return std13();
		}
		if ($amt13.equalsIgnoreCase(name)) {
			return amt13();
		}
		if ($diff13.equalsIgnoreCase(name)) {
			return diff13();
		}
		if ($upri14.equalsIgnoreCase(name)) {
			return upri14();
		}
		if ($std14.equalsIgnoreCase(name)) {
			return std14();
		}
		if ($amt14.equalsIgnoreCase(name)) {
			return amt14();
		}
		if ($diff14.equalsIgnoreCase(name)) {
			return diff14();
		}
		if ($upri15.equalsIgnoreCase(name)) {
			return upri15();
		}
		if ($std15.equalsIgnoreCase(name)) {
			return std15();
		}
		if ($amt15.equalsIgnoreCase(name)) {
			return amt15();
		}
		if ($diff15.equalsIgnoreCase(name)) {
			return diff15();
		}
		if ($upri16.equalsIgnoreCase(name)) {
			return upri16();
		}
		if ($std16.equalsIgnoreCase(name)) {
			return std16();
		}
		if ($amt16.equalsIgnoreCase(name)) {
			return amt16();
		}
		if ($diff16.equalsIgnoreCase(name)) {
			return diff16();
		}
		if ($upri17.equalsIgnoreCase(name)) {
			return upri17();
		}
		if ($std17.equalsIgnoreCase(name)) {
			return std17();
		}
		if ($amt17.equalsIgnoreCase(name)) {
			return amt17();
		}
		if ($diff17.equalsIgnoreCase(name)) {
			return diff17();
		}
		if ($upri18.equalsIgnoreCase(name)) {
			return upri18();
		}
		if ($std18.equalsIgnoreCase(name)) {
			return std18();
		}
		if ($amt18.equalsIgnoreCase(name)) {
			return amt18();
		}
		if ($diff18.equalsIgnoreCase(name)) {
			return diff18();
		}
		if ($upri19.equalsIgnoreCase(name)) {
			return upri19();
		}
		if ($std19.equalsIgnoreCase(name)) {
			return std19();
		}
		if ($amt19.equalsIgnoreCase(name)) {
			return amt19();
		}
		if ($diff19.equalsIgnoreCase(name)) {
			return diff19();
		}
		if ($upri20.equalsIgnoreCase(name)) {
			return upri20();
		}
		if ($std20.equalsIgnoreCase(name)) {
			return std20();
		}
		if ($amt20.equalsIgnoreCase(name)) {
			return amt20();
		}
		if ($diff20.equalsIgnoreCase(name)) {
			return diff20();
		}
		if ($upri21.equalsIgnoreCase(name)) {
			return upri21();
		}
		if ($std21.equalsIgnoreCase(name)) {
			return std21();
		}
		if ($amt21.equalsIgnoreCase(name)) {
			return amt21();
		}
		if ($diff21.equalsIgnoreCase(name)) {
			return diff21();
		}
		if ($upri22.equalsIgnoreCase(name)) {
			return upri22();
		}
		if ($std22.equalsIgnoreCase(name)) {
			return std22();
		}
		if ($amt22.equalsIgnoreCase(name)) {
			return amt22();
		}
		if ($diff22.equalsIgnoreCase(name)) {
			return diff22();
		}
		if ($upri23.equalsIgnoreCase(name)) {
			return upri23();
		}
		if ($std23.equalsIgnoreCase(name)) {
			return std23();
		}
		if ($amt23.equalsIgnoreCase(name)) {
			return amt23();
		}
		if ($diff23.equalsIgnoreCase(name)) {
			return diff23();
		}
		if ($upri24.equalsIgnoreCase(name)) {
			return upri24();
		}
		if ($std24.equalsIgnoreCase(name)) {
			return std24();
		}
		if ($amt24.equalsIgnoreCase(name)) {
			return amt24();
		}
		if ($diff24.equalsIgnoreCase(name)) {
			return diff24();
		}
		if ($upri25.equalsIgnoreCase(name)) {
			return upri25();
		}
		if ($std25.equalsIgnoreCase(name)) {
			return std25();
		}
		if ($amt25.equalsIgnoreCase(name)) {
			return amt25();
		}
		if ($diff25.equalsIgnoreCase(name)) {
			return diff25();
		}
		if ($upri26.equalsIgnoreCase(name)) {
			return upri26();
		}
		if ($std26.equalsIgnoreCase(name)) {
			return std26();
		}
		if ($amt26.equalsIgnoreCase(name)) {
			return amt26();
		}
		if ($diff26.equalsIgnoreCase(name)) {
			return diff26();
		}
		if ($upri27.equalsIgnoreCase(name)) {
			return upri27();
		}
		if ($std27.equalsIgnoreCase(name)) {
			return std27();
		}
		if ($amt27.equalsIgnoreCase(name)) {
			return amt27();
		}
		if ($diff27.equalsIgnoreCase(name)) {
			return diff27();
		}
		if ($upri28.equalsIgnoreCase(name)) {
			return upri28();
		}
		if ($std28.equalsIgnoreCase(name)) {
			return std28();
		}
		if ($amt28.equalsIgnoreCase(name)) {
			return amt28();
		}
		if ($diff28.equalsIgnoreCase(name)) {
			return diff28();
		}
		if ($upri29.equalsIgnoreCase(name)) {
			return upri29();
		}
		if ($std29.equalsIgnoreCase(name)) {
			return std29();
		}
		if ($amt29.equalsIgnoreCase(name)) {
			return amt29();
		}
		if ($diff29.equalsIgnoreCase(name)) {
			return diff29();
		}
		if ($upri30.equalsIgnoreCase(name)) {
			return upri30();
		}
		if ($std30.equalsIgnoreCase(name)) {
			return std30();
		}
		if ($amt30.equalsIgnoreCase(name)) {
			return amt30();
		}
		if ($diff30.equalsIgnoreCase(name)) {
			return diff30();
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			return diff_std();
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			return diff_amt();
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			return ave_tgt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri01.equalsIgnoreCase(name)) {
			upri01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($diff01.equalsIgnoreCase(name)) {
			diff01(value);
			return;
		}
		if ($upri02.equalsIgnoreCase(name)) {
			upri02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($diff02.equalsIgnoreCase(name)) {
			diff02(value);
			return;
		}
		if ($upri03.equalsIgnoreCase(name)) {
			upri03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($diff03.equalsIgnoreCase(name)) {
			diff03(value);
			return;
		}
		if ($upri04.equalsIgnoreCase(name)) {
			upri04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($diff04.equalsIgnoreCase(name)) {
			diff04(value);
			return;
		}
		if ($upri05.equalsIgnoreCase(name)) {
			upri05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($diff05.equalsIgnoreCase(name)) {
			diff05(value);
			return;
		}
		if ($upri06.equalsIgnoreCase(name)) {
			upri06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($diff06.equalsIgnoreCase(name)) {
			diff06(value);
			return;
		}
		if ($upri07.equalsIgnoreCase(name)) {
			upri07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($diff07.equalsIgnoreCase(name)) {
			diff07(value);
			return;
		}
		if ($upri08.equalsIgnoreCase(name)) {
			upri08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($diff08.equalsIgnoreCase(name)) {
			diff08(value);
			return;
		}
		if ($upri09.equalsIgnoreCase(name)) {
			upri09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($diff09.equalsIgnoreCase(name)) {
			diff09(value);
			return;
		}
		if ($upri10.equalsIgnoreCase(name)) {
			upri10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($diff10.equalsIgnoreCase(name)) {
			diff10(value);
			return;
		}
		if ($upri11.equalsIgnoreCase(name)) {
			upri11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($diff11.equalsIgnoreCase(name)) {
			diff11(value);
			return;
		}
		if ($upri12.equalsIgnoreCase(name)) {
			upri12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($diff12.equalsIgnoreCase(name)) {
			diff12(value);
			return;
		}
		if ($upri13.equalsIgnoreCase(name)) {
			upri13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($diff13.equalsIgnoreCase(name)) {
			diff13(value);
			return;
		}
		if ($upri14.equalsIgnoreCase(name)) {
			upri14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($diff14.equalsIgnoreCase(name)) {
			diff14(value);
			return;
		}
		if ($upri15.equalsIgnoreCase(name)) {
			upri15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($diff15.equalsIgnoreCase(name)) {
			diff15(value);
			return;
		}
		if ($upri16.equalsIgnoreCase(name)) {
			upri16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($diff16.equalsIgnoreCase(name)) {
			diff16(value);
			return;
		}
		if ($upri17.equalsIgnoreCase(name)) {
			upri17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($diff17.equalsIgnoreCase(name)) {
			diff17(value);
			return;
		}
		if ($upri18.equalsIgnoreCase(name)) {
			upri18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($diff18.equalsIgnoreCase(name)) {
			diff18(value);
			return;
		}
		if ($upri19.equalsIgnoreCase(name)) {
			upri19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($diff19.equalsIgnoreCase(name)) {
			diff19(value);
			return;
		}
		if ($upri20.equalsIgnoreCase(name)) {
			upri20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($diff20.equalsIgnoreCase(name)) {
			diff20(value);
			return;
		}
		if ($upri21.equalsIgnoreCase(name)) {
			upri21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($diff21.equalsIgnoreCase(name)) {
			diff21(value);
			return;
		}
		if ($upri22.equalsIgnoreCase(name)) {
			upri22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($diff22.equalsIgnoreCase(name)) {
			diff22(value);
			return;
		}
		if ($upri23.equalsIgnoreCase(name)) {
			upri23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($diff23.equalsIgnoreCase(name)) {
			diff23(value);
			return;
		}
		if ($upri24.equalsIgnoreCase(name)) {
			upri24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($diff24.equalsIgnoreCase(name)) {
			diff24(value);
			return;
		}
		if ($upri25.equalsIgnoreCase(name)) {
			upri25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($diff25.equalsIgnoreCase(name)) {
			diff25(value);
			return;
		}
		if ($upri26.equalsIgnoreCase(name)) {
			upri26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($diff26.equalsIgnoreCase(name)) {
			diff26(value);
			return;
		}
		if ($upri27.equalsIgnoreCase(name)) {
			upri27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($diff27.equalsIgnoreCase(name)) {
			diff27(value);
			return;
		}
		if ($upri28.equalsIgnoreCase(name)) {
			upri28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($diff28.equalsIgnoreCase(name)) {
			diff28(value);
			return;
		}
		if ($upri29.equalsIgnoreCase(name)) {
			upri29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($diff29.equalsIgnoreCase(name)) {
			diff29(value);
			return;
		}
		if ($upri30.equalsIgnoreCase(name)) {
			upri30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($diff30.equalsIgnoreCase(name)) {
			diff30(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri01.equalsIgnoreCase(name)) {
			upri01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($diff01.equalsIgnoreCase(name)) {
			diff01(value);
			return;
		}
		if ($upri02.equalsIgnoreCase(name)) {
			upri02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($diff02.equalsIgnoreCase(name)) {
			diff02(value);
			return;
		}
		if ($upri03.equalsIgnoreCase(name)) {
			upri03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($diff03.equalsIgnoreCase(name)) {
			diff03(value);
			return;
		}
		if ($upri04.equalsIgnoreCase(name)) {
			upri04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($diff04.equalsIgnoreCase(name)) {
			diff04(value);
			return;
		}
		if ($upri05.equalsIgnoreCase(name)) {
			upri05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($diff05.equalsIgnoreCase(name)) {
			diff05(value);
			return;
		}
		if ($upri06.equalsIgnoreCase(name)) {
			upri06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($diff06.equalsIgnoreCase(name)) {
			diff06(value);
			return;
		}
		if ($upri07.equalsIgnoreCase(name)) {
			upri07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($diff07.equalsIgnoreCase(name)) {
			diff07(value);
			return;
		}
		if ($upri08.equalsIgnoreCase(name)) {
			upri08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($diff08.equalsIgnoreCase(name)) {
			diff08(value);
			return;
		}
		if ($upri09.equalsIgnoreCase(name)) {
			upri09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($diff09.equalsIgnoreCase(name)) {
			diff09(value);
			return;
		}
		if ($upri10.equalsIgnoreCase(name)) {
			upri10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($diff10.equalsIgnoreCase(name)) {
			diff10(value);
			return;
		}
		if ($upri11.equalsIgnoreCase(name)) {
			upri11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($diff11.equalsIgnoreCase(name)) {
			diff11(value);
			return;
		}
		if ($upri12.equalsIgnoreCase(name)) {
			upri12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($diff12.equalsIgnoreCase(name)) {
			diff12(value);
			return;
		}
		if ($upri13.equalsIgnoreCase(name)) {
			upri13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($diff13.equalsIgnoreCase(name)) {
			diff13(value);
			return;
		}
		if ($upri14.equalsIgnoreCase(name)) {
			upri14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($diff14.equalsIgnoreCase(name)) {
			diff14(value);
			return;
		}
		if ($upri15.equalsIgnoreCase(name)) {
			upri15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($diff15.equalsIgnoreCase(name)) {
			diff15(value);
			return;
		}
		if ($upri16.equalsIgnoreCase(name)) {
			upri16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($diff16.equalsIgnoreCase(name)) {
			diff16(value);
			return;
		}
		if ($upri17.equalsIgnoreCase(name)) {
			upri17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($diff17.equalsIgnoreCase(name)) {
			diff17(value);
			return;
		}
		if ($upri18.equalsIgnoreCase(name)) {
			upri18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($diff18.equalsIgnoreCase(name)) {
			diff18(value);
			return;
		}
		if ($upri19.equalsIgnoreCase(name)) {
			upri19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($diff19.equalsIgnoreCase(name)) {
			diff19(value);
			return;
		}
		if ($upri20.equalsIgnoreCase(name)) {
			upri20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($diff20.equalsIgnoreCase(name)) {
			diff20(value);
			return;
		}
		if ($upri21.equalsIgnoreCase(name)) {
			upri21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($diff21.equalsIgnoreCase(name)) {
			diff21(value);
			return;
		}
		if ($upri22.equalsIgnoreCase(name)) {
			upri22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($diff22.equalsIgnoreCase(name)) {
			diff22(value);
			return;
		}
		if ($upri23.equalsIgnoreCase(name)) {
			upri23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($diff23.equalsIgnoreCase(name)) {
			diff23(value);
			return;
		}
		if ($upri24.equalsIgnoreCase(name)) {
			upri24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($diff24.equalsIgnoreCase(name)) {
			diff24(value);
			return;
		}
		if ($upri25.equalsIgnoreCase(name)) {
			upri25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($diff25.equalsIgnoreCase(name)) {
			diff25(value);
			return;
		}
		if ($upri26.equalsIgnoreCase(name)) {
			upri26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($diff26.equalsIgnoreCase(name)) {
			diff26(value);
			return;
		}
		if ($upri27.equalsIgnoreCase(name)) {
			upri27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($diff27.equalsIgnoreCase(name)) {
			diff27(value);
			return;
		}
		if ($upri28.equalsIgnoreCase(name)) {
			upri28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($diff28.equalsIgnoreCase(name)) {
			diff28(value);
			return;
		}
		if ($upri29.equalsIgnoreCase(name)) {
			upri29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($diff29.equalsIgnoreCase(name)) {
			diff29(value);
			return;
		}
		if ($upri30.equalsIgnoreCase(name)) {
			upri30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($diff30.equalsIgnoreCase(name)) {
			diff30(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri01.equalsIgnoreCase(name)) {
			upri01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($diff01.equalsIgnoreCase(name)) {
			diff01(value);
			return;
		}
		if ($upri02.equalsIgnoreCase(name)) {
			upri02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($diff02.equalsIgnoreCase(name)) {
			diff02(value);
			return;
		}
		if ($upri03.equalsIgnoreCase(name)) {
			upri03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($diff03.equalsIgnoreCase(name)) {
			diff03(value);
			return;
		}
		if ($upri04.equalsIgnoreCase(name)) {
			upri04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($diff04.equalsIgnoreCase(name)) {
			diff04(value);
			return;
		}
		if ($upri05.equalsIgnoreCase(name)) {
			upri05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($diff05.equalsIgnoreCase(name)) {
			diff05(value);
			return;
		}
		if ($upri06.equalsIgnoreCase(name)) {
			upri06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($diff06.equalsIgnoreCase(name)) {
			diff06(value);
			return;
		}
		if ($upri07.equalsIgnoreCase(name)) {
			upri07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($diff07.equalsIgnoreCase(name)) {
			diff07(value);
			return;
		}
		if ($upri08.equalsIgnoreCase(name)) {
			upri08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($diff08.equalsIgnoreCase(name)) {
			diff08(value);
			return;
		}
		if ($upri09.equalsIgnoreCase(name)) {
			upri09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($diff09.equalsIgnoreCase(name)) {
			diff09(value);
			return;
		}
		if ($upri10.equalsIgnoreCase(name)) {
			upri10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($diff10.equalsIgnoreCase(name)) {
			diff10(value);
			return;
		}
		if ($upri11.equalsIgnoreCase(name)) {
			upri11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($diff11.equalsIgnoreCase(name)) {
			diff11(value);
			return;
		}
		if ($upri12.equalsIgnoreCase(name)) {
			upri12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($diff12.equalsIgnoreCase(name)) {
			diff12(value);
			return;
		}
		if ($upri13.equalsIgnoreCase(name)) {
			upri13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($diff13.equalsIgnoreCase(name)) {
			diff13(value);
			return;
		}
		if ($upri14.equalsIgnoreCase(name)) {
			upri14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($diff14.equalsIgnoreCase(name)) {
			diff14(value);
			return;
		}
		if ($upri15.equalsIgnoreCase(name)) {
			upri15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($diff15.equalsIgnoreCase(name)) {
			diff15(value);
			return;
		}
		if ($upri16.equalsIgnoreCase(name)) {
			upri16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($diff16.equalsIgnoreCase(name)) {
			diff16(value);
			return;
		}
		if ($upri17.equalsIgnoreCase(name)) {
			upri17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($diff17.equalsIgnoreCase(name)) {
			diff17(value);
			return;
		}
		if ($upri18.equalsIgnoreCase(name)) {
			upri18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($diff18.equalsIgnoreCase(name)) {
			diff18(value);
			return;
		}
		if ($upri19.equalsIgnoreCase(name)) {
			upri19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($diff19.equalsIgnoreCase(name)) {
			diff19(value);
			return;
		}
		if ($upri20.equalsIgnoreCase(name)) {
			upri20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($diff20.equalsIgnoreCase(name)) {
			diff20(value);
			return;
		}
		if ($upri21.equalsIgnoreCase(name)) {
			upri21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($diff21.equalsIgnoreCase(name)) {
			diff21(value);
			return;
		}
		if ($upri22.equalsIgnoreCase(name)) {
			upri22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($diff22.equalsIgnoreCase(name)) {
			diff22(value);
			return;
		}
		if ($upri23.equalsIgnoreCase(name)) {
			upri23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($diff23.equalsIgnoreCase(name)) {
			diff23(value);
			return;
		}
		if ($upri24.equalsIgnoreCase(name)) {
			upri24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($diff24.equalsIgnoreCase(name)) {
			diff24(value);
			return;
		}
		if ($upri25.equalsIgnoreCase(name)) {
			upri25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($diff25.equalsIgnoreCase(name)) {
			diff25(value);
			return;
		}
		if ($upri26.equalsIgnoreCase(name)) {
			upri26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($diff26.equalsIgnoreCase(name)) {
			diff26(value);
			return;
		}
		if ($upri27.equalsIgnoreCase(name)) {
			upri27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($diff27.equalsIgnoreCase(name)) {
			diff27(value);
			return;
		}
		if ($upri28.equalsIgnoreCase(name)) {
			upri28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($diff28.equalsIgnoreCase(name)) {
			diff28(value);
			return;
		}
		if ($upri29.equalsIgnoreCase(name)) {
			upri29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($diff29.equalsIgnoreCase(name)) {
			diff29(value);
			return;
		}
		if ($upri30.equalsIgnoreCase(name)) {
			upri30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($diff30.equalsIgnoreCase(name)) {
			diff30(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri01.equalsIgnoreCase(name)) {
			upri01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($diff01.equalsIgnoreCase(name)) {
			diff01(value);
			return;
		}
		if ($upri02.equalsIgnoreCase(name)) {
			upri02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($diff02.equalsIgnoreCase(name)) {
			diff02(value);
			return;
		}
		if ($upri03.equalsIgnoreCase(name)) {
			upri03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($diff03.equalsIgnoreCase(name)) {
			diff03(value);
			return;
		}
		if ($upri04.equalsIgnoreCase(name)) {
			upri04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($diff04.equalsIgnoreCase(name)) {
			diff04(value);
			return;
		}
		if ($upri05.equalsIgnoreCase(name)) {
			upri05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($diff05.equalsIgnoreCase(name)) {
			diff05(value);
			return;
		}
		if ($upri06.equalsIgnoreCase(name)) {
			upri06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($diff06.equalsIgnoreCase(name)) {
			diff06(value);
			return;
		}
		if ($upri07.equalsIgnoreCase(name)) {
			upri07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($diff07.equalsIgnoreCase(name)) {
			diff07(value);
			return;
		}
		if ($upri08.equalsIgnoreCase(name)) {
			upri08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($diff08.equalsIgnoreCase(name)) {
			diff08(value);
			return;
		}
		if ($upri09.equalsIgnoreCase(name)) {
			upri09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($diff09.equalsIgnoreCase(name)) {
			diff09(value);
			return;
		}
		if ($upri10.equalsIgnoreCase(name)) {
			upri10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($diff10.equalsIgnoreCase(name)) {
			diff10(value);
			return;
		}
		if ($upri11.equalsIgnoreCase(name)) {
			upri11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($diff11.equalsIgnoreCase(name)) {
			diff11(value);
			return;
		}
		if ($upri12.equalsIgnoreCase(name)) {
			upri12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($diff12.equalsIgnoreCase(name)) {
			diff12(value);
			return;
		}
		if ($upri13.equalsIgnoreCase(name)) {
			upri13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($diff13.equalsIgnoreCase(name)) {
			diff13(value);
			return;
		}
		if ($upri14.equalsIgnoreCase(name)) {
			upri14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($diff14.equalsIgnoreCase(name)) {
			diff14(value);
			return;
		}
		if ($upri15.equalsIgnoreCase(name)) {
			upri15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($diff15.equalsIgnoreCase(name)) {
			diff15(value);
			return;
		}
		if ($upri16.equalsIgnoreCase(name)) {
			upri16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($diff16.equalsIgnoreCase(name)) {
			diff16(value);
			return;
		}
		if ($upri17.equalsIgnoreCase(name)) {
			upri17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($diff17.equalsIgnoreCase(name)) {
			diff17(value);
			return;
		}
		if ($upri18.equalsIgnoreCase(name)) {
			upri18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($diff18.equalsIgnoreCase(name)) {
			diff18(value);
			return;
		}
		if ($upri19.equalsIgnoreCase(name)) {
			upri19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($diff19.equalsIgnoreCase(name)) {
			diff19(value);
			return;
		}
		if ($upri20.equalsIgnoreCase(name)) {
			upri20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($diff20.equalsIgnoreCase(name)) {
			diff20(value);
			return;
		}
		if ($upri21.equalsIgnoreCase(name)) {
			upri21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($diff21.equalsIgnoreCase(name)) {
			diff21(value);
			return;
		}
		if ($upri22.equalsIgnoreCase(name)) {
			upri22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($diff22.equalsIgnoreCase(name)) {
			diff22(value);
			return;
		}
		if ($upri23.equalsIgnoreCase(name)) {
			upri23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($diff23.equalsIgnoreCase(name)) {
			diff23(value);
			return;
		}
		if ($upri24.equalsIgnoreCase(name)) {
			upri24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($diff24.equalsIgnoreCase(name)) {
			diff24(value);
			return;
		}
		if ($upri25.equalsIgnoreCase(name)) {
			upri25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($diff25.equalsIgnoreCase(name)) {
			diff25(value);
			return;
		}
		if ($upri26.equalsIgnoreCase(name)) {
			upri26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($diff26.equalsIgnoreCase(name)) {
			diff26(value);
			return;
		}
		if ($upri27.equalsIgnoreCase(name)) {
			upri27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($diff27.equalsIgnoreCase(name)) {
			diff27(value);
			return;
		}
		if ($upri28.equalsIgnoreCase(name)) {
			upri28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($diff28.equalsIgnoreCase(name)) {
			diff28(value);
			return;
		}
		if ($upri29.equalsIgnoreCase(name)) {
			upri29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($diff29.equalsIgnoreCase(name)) {
			diff29(value);
			return;
		}
		if ($upri30.equalsIgnoreCase(name)) {
			upri30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($diff30.equalsIgnoreCase(name)) {
			diff30(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri01.equalsIgnoreCase(name)) {
			upri01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($diff01.equalsIgnoreCase(name)) {
			diff01(value);
			return;
		}
		if ($upri02.equalsIgnoreCase(name)) {
			upri02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($diff02.equalsIgnoreCase(name)) {
			diff02(value);
			return;
		}
		if ($upri03.equalsIgnoreCase(name)) {
			upri03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($diff03.equalsIgnoreCase(name)) {
			diff03(value);
			return;
		}
		if ($upri04.equalsIgnoreCase(name)) {
			upri04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($diff04.equalsIgnoreCase(name)) {
			diff04(value);
			return;
		}
		if ($upri05.equalsIgnoreCase(name)) {
			upri05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($diff05.equalsIgnoreCase(name)) {
			diff05(value);
			return;
		}
		if ($upri06.equalsIgnoreCase(name)) {
			upri06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($diff06.equalsIgnoreCase(name)) {
			diff06(value);
			return;
		}
		if ($upri07.equalsIgnoreCase(name)) {
			upri07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($diff07.equalsIgnoreCase(name)) {
			diff07(value);
			return;
		}
		if ($upri08.equalsIgnoreCase(name)) {
			upri08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($diff08.equalsIgnoreCase(name)) {
			diff08(value);
			return;
		}
		if ($upri09.equalsIgnoreCase(name)) {
			upri09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($diff09.equalsIgnoreCase(name)) {
			diff09(value);
			return;
		}
		if ($upri10.equalsIgnoreCase(name)) {
			upri10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($diff10.equalsIgnoreCase(name)) {
			diff10(value);
			return;
		}
		if ($upri11.equalsIgnoreCase(name)) {
			upri11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($diff11.equalsIgnoreCase(name)) {
			diff11(value);
			return;
		}
		if ($upri12.equalsIgnoreCase(name)) {
			upri12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($diff12.equalsIgnoreCase(name)) {
			diff12(value);
			return;
		}
		if ($upri13.equalsIgnoreCase(name)) {
			upri13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($diff13.equalsIgnoreCase(name)) {
			diff13(value);
			return;
		}
		if ($upri14.equalsIgnoreCase(name)) {
			upri14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($diff14.equalsIgnoreCase(name)) {
			diff14(value);
			return;
		}
		if ($upri15.equalsIgnoreCase(name)) {
			upri15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($diff15.equalsIgnoreCase(name)) {
			diff15(value);
			return;
		}
		if ($upri16.equalsIgnoreCase(name)) {
			upri16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($diff16.equalsIgnoreCase(name)) {
			diff16(value);
			return;
		}
		if ($upri17.equalsIgnoreCase(name)) {
			upri17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($diff17.equalsIgnoreCase(name)) {
			diff17(value);
			return;
		}
		if ($upri18.equalsIgnoreCase(name)) {
			upri18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($diff18.equalsIgnoreCase(name)) {
			diff18(value);
			return;
		}
		if ($upri19.equalsIgnoreCase(name)) {
			upri19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($diff19.equalsIgnoreCase(name)) {
			diff19(value);
			return;
		}
		if ($upri20.equalsIgnoreCase(name)) {
			upri20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($diff20.equalsIgnoreCase(name)) {
			diff20(value);
			return;
		}
		if ($upri21.equalsIgnoreCase(name)) {
			upri21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($diff21.equalsIgnoreCase(name)) {
			diff21(value);
			return;
		}
		if ($upri22.equalsIgnoreCase(name)) {
			upri22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($diff22.equalsIgnoreCase(name)) {
			diff22(value);
			return;
		}
		if ($upri23.equalsIgnoreCase(name)) {
			upri23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($diff23.equalsIgnoreCase(name)) {
			diff23(value);
			return;
		}
		if ($upri24.equalsIgnoreCase(name)) {
			upri24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($diff24.equalsIgnoreCase(name)) {
			diff24(value);
			return;
		}
		if ($upri25.equalsIgnoreCase(name)) {
			upri25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($diff25.equalsIgnoreCase(name)) {
			diff25(value);
			return;
		}
		if ($upri26.equalsIgnoreCase(name)) {
			upri26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($diff26.equalsIgnoreCase(name)) {
			diff26(value);
			return;
		}
		if ($upri27.equalsIgnoreCase(name)) {
			upri27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($diff27.equalsIgnoreCase(name)) {
			diff27(value);
			return;
		}
		if ($upri28.equalsIgnoreCase(name)) {
			upri28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($diff28.equalsIgnoreCase(name)) {
			diff28(value);
			return;
		}
		if ($upri29.equalsIgnoreCase(name)) {
			upri29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($diff29.equalsIgnoreCase(name)) {
			diff29(value);
			return;
		}
		if ($upri30.equalsIgnoreCase(name)) {
			upri30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($diff30.equalsIgnoreCase(name)) {
			diff30(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri01.equalsIgnoreCase(name)) {
			upri01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($diff01.equalsIgnoreCase(name)) {
			diff01(value);
			return;
		}
		if ($upri02.equalsIgnoreCase(name)) {
			upri02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($diff02.equalsIgnoreCase(name)) {
			diff02(value);
			return;
		}
		if ($upri03.equalsIgnoreCase(name)) {
			upri03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($diff03.equalsIgnoreCase(name)) {
			diff03(value);
			return;
		}
		if ($upri04.equalsIgnoreCase(name)) {
			upri04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($diff04.equalsIgnoreCase(name)) {
			diff04(value);
			return;
		}
		if ($upri05.equalsIgnoreCase(name)) {
			upri05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($diff05.equalsIgnoreCase(name)) {
			diff05(value);
			return;
		}
		if ($upri06.equalsIgnoreCase(name)) {
			upri06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($diff06.equalsIgnoreCase(name)) {
			diff06(value);
			return;
		}
		if ($upri07.equalsIgnoreCase(name)) {
			upri07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($diff07.equalsIgnoreCase(name)) {
			diff07(value);
			return;
		}
		if ($upri08.equalsIgnoreCase(name)) {
			upri08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($diff08.equalsIgnoreCase(name)) {
			diff08(value);
			return;
		}
		if ($upri09.equalsIgnoreCase(name)) {
			upri09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($diff09.equalsIgnoreCase(name)) {
			diff09(value);
			return;
		}
		if ($upri10.equalsIgnoreCase(name)) {
			upri10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($diff10.equalsIgnoreCase(name)) {
			diff10(value);
			return;
		}
		if ($upri11.equalsIgnoreCase(name)) {
			upri11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($diff11.equalsIgnoreCase(name)) {
			diff11(value);
			return;
		}
		if ($upri12.equalsIgnoreCase(name)) {
			upri12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($diff12.equalsIgnoreCase(name)) {
			diff12(value);
			return;
		}
		if ($upri13.equalsIgnoreCase(name)) {
			upri13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($diff13.equalsIgnoreCase(name)) {
			diff13(value);
			return;
		}
		if ($upri14.equalsIgnoreCase(name)) {
			upri14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($diff14.equalsIgnoreCase(name)) {
			diff14(value);
			return;
		}
		if ($upri15.equalsIgnoreCase(name)) {
			upri15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($diff15.equalsIgnoreCase(name)) {
			diff15(value);
			return;
		}
		if ($upri16.equalsIgnoreCase(name)) {
			upri16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($diff16.equalsIgnoreCase(name)) {
			diff16(value);
			return;
		}
		if ($upri17.equalsIgnoreCase(name)) {
			upri17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($diff17.equalsIgnoreCase(name)) {
			diff17(value);
			return;
		}
		if ($upri18.equalsIgnoreCase(name)) {
			upri18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($diff18.equalsIgnoreCase(name)) {
			diff18(value);
			return;
		}
		if ($upri19.equalsIgnoreCase(name)) {
			upri19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($diff19.equalsIgnoreCase(name)) {
			diff19(value);
			return;
		}
		if ($upri20.equalsIgnoreCase(name)) {
			upri20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($diff20.equalsIgnoreCase(name)) {
			diff20(value);
			return;
		}
		if ($upri21.equalsIgnoreCase(name)) {
			upri21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($diff21.equalsIgnoreCase(name)) {
			diff21(value);
			return;
		}
		if ($upri22.equalsIgnoreCase(name)) {
			upri22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($diff22.equalsIgnoreCase(name)) {
			diff22(value);
			return;
		}
		if ($upri23.equalsIgnoreCase(name)) {
			upri23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($diff23.equalsIgnoreCase(name)) {
			diff23(value);
			return;
		}
		if ($upri24.equalsIgnoreCase(name)) {
			upri24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($diff24.equalsIgnoreCase(name)) {
			diff24(value);
			return;
		}
		if ($upri25.equalsIgnoreCase(name)) {
			upri25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($diff25.equalsIgnoreCase(name)) {
			diff25(value);
			return;
		}
		if ($upri26.equalsIgnoreCase(name)) {
			upri26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($diff26.equalsIgnoreCase(name)) {
			diff26(value);
			return;
		}
		if ($upri27.equalsIgnoreCase(name)) {
			upri27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($diff27.equalsIgnoreCase(name)) {
			diff27(value);
			return;
		}
		if ($upri28.equalsIgnoreCase(name)) {
			upri28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($diff28.equalsIgnoreCase(name)) {
			diff28(value);
			return;
		}
		if ($upri29.equalsIgnoreCase(name)) {
			upri29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($diff29.equalsIgnoreCase(name)) {
			diff29(value);
			return;
		}
		if ($upri30.equalsIgnoreCase(name)) {
			upri30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($diff30.equalsIgnoreCase(name)) {
			diff30(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri01.equalsIgnoreCase(name)) {
			upri01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($diff01.equalsIgnoreCase(name)) {
			diff01(value);
			return;
		}
		if ($upri02.equalsIgnoreCase(name)) {
			upri02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($diff02.equalsIgnoreCase(name)) {
			diff02(value);
			return;
		}
		if ($upri03.equalsIgnoreCase(name)) {
			upri03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($diff03.equalsIgnoreCase(name)) {
			diff03(value);
			return;
		}
		if ($upri04.equalsIgnoreCase(name)) {
			upri04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($diff04.equalsIgnoreCase(name)) {
			diff04(value);
			return;
		}
		if ($upri05.equalsIgnoreCase(name)) {
			upri05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($diff05.equalsIgnoreCase(name)) {
			diff05(value);
			return;
		}
		if ($upri06.equalsIgnoreCase(name)) {
			upri06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($diff06.equalsIgnoreCase(name)) {
			diff06(value);
			return;
		}
		if ($upri07.equalsIgnoreCase(name)) {
			upri07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($diff07.equalsIgnoreCase(name)) {
			diff07(value);
			return;
		}
		if ($upri08.equalsIgnoreCase(name)) {
			upri08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($diff08.equalsIgnoreCase(name)) {
			diff08(value);
			return;
		}
		if ($upri09.equalsIgnoreCase(name)) {
			upri09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($diff09.equalsIgnoreCase(name)) {
			diff09(value);
			return;
		}
		if ($upri10.equalsIgnoreCase(name)) {
			upri10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($diff10.equalsIgnoreCase(name)) {
			diff10(value);
			return;
		}
		if ($upri11.equalsIgnoreCase(name)) {
			upri11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($diff11.equalsIgnoreCase(name)) {
			diff11(value);
			return;
		}
		if ($upri12.equalsIgnoreCase(name)) {
			upri12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($diff12.equalsIgnoreCase(name)) {
			diff12(value);
			return;
		}
		if ($upri13.equalsIgnoreCase(name)) {
			upri13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($diff13.equalsIgnoreCase(name)) {
			diff13(value);
			return;
		}
		if ($upri14.equalsIgnoreCase(name)) {
			upri14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($diff14.equalsIgnoreCase(name)) {
			diff14(value);
			return;
		}
		if ($upri15.equalsIgnoreCase(name)) {
			upri15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($diff15.equalsIgnoreCase(name)) {
			diff15(value);
			return;
		}
		if ($upri16.equalsIgnoreCase(name)) {
			upri16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($diff16.equalsIgnoreCase(name)) {
			diff16(value);
			return;
		}
		if ($upri17.equalsIgnoreCase(name)) {
			upri17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($diff17.equalsIgnoreCase(name)) {
			diff17(value);
			return;
		}
		if ($upri18.equalsIgnoreCase(name)) {
			upri18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($diff18.equalsIgnoreCase(name)) {
			diff18(value);
			return;
		}
		if ($upri19.equalsIgnoreCase(name)) {
			upri19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($diff19.equalsIgnoreCase(name)) {
			diff19(value);
			return;
		}
		if ($upri20.equalsIgnoreCase(name)) {
			upri20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($diff20.equalsIgnoreCase(name)) {
			diff20(value);
			return;
		}
		if ($upri21.equalsIgnoreCase(name)) {
			upri21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($diff21.equalsIgnoreCase(name)) {
			diff21(value);
			return;
		}
		if ($upri22.equalsIgnoreCase(name)) {
			upri22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($diff22.equalsIgnoreCase(name)) {
			diff22(value);
			return;
		}
		if ($upri23.equalsIgnoreCase(name)) {
			upri23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($diff23.equalsIgnoreCase(name)) {
			diff23(value);
			return;
		}
		if ($upri24.equalsIgnoreCase(name)) {
			upri24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($diff24.equalsIgnoreCase(name)) {
			diff24(value);
			return;
		}
		if ($upri25.equalsIgnoreCase(name)) {
			upri25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($diff25.equalsIgnoreCase(name)) {
			diff25(value);
			return;
		}
		if ($upri26.equalsIgnoreCase(name)) {
			upri26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($diff26.equalsIgnoreCase(name)) {
			diff26(value);
			return;
		}
		if ($upri27.equalsIgnoreCase(name)) {
			upri27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($diff27.equalsIgnoreCase(name)) {
			diff27(value);
			return;
		}
		if ($upri28.equalsIgnoreCase(name)) {
			upri28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($diff28.equalsIgnoreCase(name)) {
			diff28(value);
			return;
		}
		if ($upri29.equalsIgnoreCase(name)) {
			upri29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($diff29.equalsIgnoreCase(name)) {
			diff29(value);
			return;
		}
		if ($upri30.equalsIgnoreCase(name)) {
			upri30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($diff30.equalsIgnoreCase(name)) {
			diff30(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri01.equalsIgnoreCase(name)) {
			upri01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($diff01.equalsIgnoreCase(name)) {
			diff01(value);
			return;
		}
		if ($upri02.equalsIgnoreCase(name)) {
			upri02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($diff02.equalsIgnoreCase(name)) {
			diff02(value);
			return;
		}
		if ($upri03.equalsIgnoreCase(name)) {
			upri03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($diff03.equalsIgnoreCase(name)) {
			diff03(value);
			return;
		}
		if ($upri04.equalsIgnoreCase(name)) {
			upri04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($diff04.equalsIgnoreCase(name)) {
			diff04(value);
			return;
		}
		if ($upri05.equalsIgnoreCase(name)) {
			upri05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($diff05.equalsIgnoreCase(name)) {
			diff05(value);
			return;
		}
		if ($upri06.equalsIgnoreCase(name)) {
			upri06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($diff06.equalsIgnoreCase(name)) {
			diff06(value);
			return;
		}
		if ($upri07.equalsIgnoreCase(name)) {
			upri07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($diff07.equalsIgnoreCase(name)) {
			diff07(value);
			return;
		}
		if ($upri08.equalsIgnoreCase(name)) {
			upri08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($diff08.equalsIgnoreCase(name)) {
			diff08(value);
			return;
		}
		if ($upri09.equalsIgnoreCase(name)) {
			upri09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($diff09.equalsIgnoreCase(name)) {
			diff09(value);
			return;
		}
		if ($upri10.equalsIgnoreCase(name)) {
			upri10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($diff10.equalsIgnoreCase(name)) {
			diff10(value);
			return;
		}
		if ($upri11.equalsIgnoreCase(name)) {
			upri11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($diff11.equalsIgnoreCase(name)) {
			diff11(value);
			return;
		}
		if ($upri12.equalsIgnoreCase(name)) {
			upri12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($diff12.equalsIgnoreCase(name)) {
			diff12(value);
			return;
		}
		if ($upri13.equalsIgnoreCase(name)) {
			upri13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($diff13.equalsIgnoreCase(name)) {
			diff13(value);
			return;
		}
		if ($upri14.equalsIgnoreCase(name)) {
			upri14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($diff14.equalsIgnoreCase(name)) {
			diff14(value);
			return;
		}
		if ($upri15.equalsIgnoreCase(name)) {
			upri15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($diff15.equalsIgnoreCase(name)) {
			diff15(value);
			return;
		}
		if ($upri16.equalsIgnoreCase(name)) {
			upri16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($diff16.equalsIgnoreCase(name)) {
			diff16(value);
			return;
		}
		if ($upri17.equalsIgnoreCase(name)) {
			upri17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($diff17.equalsIgnoreCase(name)) {
			diff17(value);
			return;
		}
		if ($upri18.equalsIgnoreCase(name)) {
			upri18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($diff18.equalsIgnoreCase(name)) {
			diff18(value);
			return;
		}
		if ($upri19.equalsIgnoreCase(name)) {
			upri19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($diff19.equalsIgnoreCase(name)) {
			diff19(value);
			return;
		}
		if ($upri20.equalsIgnoreCase(name)) {
			upri20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($diff20.equalsIgnoreCase(name)) {
			diff20(value);
			return;
		}
		if ($upri21.equalsIgnoreCase(name)) {
			upri21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($diff21.equalsIgnoreCase(name)) {
			diff21(value);
			return;
		}
		if ($upri22.equalsIgnoreCase(name)) {
			upri22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($diff22.equalsIgnoreCase(name)) {
			diff22(value);
			return;
		}
		if ($upri23.equalsIgnoreCase(name)) {
			upri23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($diff23.equalsIgnoreCase(name)) {
			diff23(value);
			return;
		}
		if ($upri24.equalsIgnoreCase(name)) {
			upri24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($diff24.equalsIgnoreCase(name)) {
			diff24(value);
			return;
		}
		if ($upri25.equalsIgnoreCase(name)) {
			upri25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($diff25.equalsIgnoreCase(name)) {
			diff25(value);
			return;
		}
		if ($upri26.equalsIgnoreCase(name)) {
			upri26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($diff26.equalsIgnoreCase(name)) {
			diff26(value);
			return;
		}
		if ($upri27.equalsIgnoreCase(name)) {
			upri27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($diff27.equalsIgnoreCase(name)) {
			diff27(value);
			return;
		}
		if ($upri28.equalsIgnoreCase(name)) {
			upri28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($diff28.equalsIgnoreCase(name)) {
			diff28(value);
			return;
		}
		if ($upri29.equalsIgnoreCase(name)) {
			upri29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($diff29.equalsIgnoreCase(name)) {
			diff29(value);
			return;
		}
		if ($upri30.equalsIgnoreCase(name)) {
			upri30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($diff30.equalsIgnoreCase(name)) {
			diff30(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri01.equalsIgnoreCase(name)) {
			upri01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($diff01.equalsIgnoreCase(name)) {
			diff01(value);
			return;
		}
		if ($upri02.equalsIgnoreCase(name)) {
			upri02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($diff02.equalsIgnoreCase(name)) {
			diff02(value);
			return;
		}
		if ($upri03.equalsIgnoreCase(name)) {
			upri03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($diff03.equalsIgnoreCase(name)) {
			diff03(value);
			return;
		}
		if ($upri04.equalsIgnoreCase(name)) {
			upri04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($diff04.equalsIgnoreCase(name)) {
			diff04(value);
			return;
		}
		if ($upri05.equalsIgnoreCase(name)) {
			upri05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($diff05.equalsIgnoreCase(name)) {
			diff05(value);
			return;
		}
		if ($upri06.equalsIgnoreCase(name)) {
			upri06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($diff06.equalsIgnoreCase(name)) {
			diff06(value);
			return;
		}
		if ($upri07.equalsIgnoreCase(name)) {
			upri07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($diff07.equalsIgnoreCase(name)) {
			diff07(value);
			return;
		}
		if ($upri08.equalsIgnoreCase(name)) {
			upri08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($diff08.equalsIgnoreCase(name)) {
			diff08(value);
			return;
		}
		if ($upri09.equalsIgnoreCase(name)) {
			upri09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($diff09.equalsIgnoreCase(name)) {
			diff09(value);
			return;
		}
		if ($upri10.equalsIgnoreCase(name)) {
			upri10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($diff10.equalsIgnoreCase(name)) {
			diff10(value);
			return;
		}
		if ($upri11.equalsIgnoreCase(name)) {
			upri11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($diff11.equalsIgnoreCase(name)) {
			diff11(value);
			return;
		}
		if ($upri12.equalsIgnoreCase(name)) {
			upri12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($diff12.equalsIgnoreCase(name)) {
			diff12(value);
			return;
		}
		if ($upri13.equalsIgnoreCase(name)) {
			upri13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($diff13.equalsIgnoreCase(name)) {
			diff13(value);
			return;
		}
		if ($upri14.equalsIgnoreCase(name)) {
			upri14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($diff14.equalsIgnoreCase(name)) {
			diff14(value);
			return;
		}
		if ($upri15.equalsIgnoreCase(name)) {
			upri15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($diff15.equalsIgnoreCase(name)) {
			diff15(value);
			return;
		}
		if ($upri16.equalsIgnoreCase(name)) {
			upri16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($diff16.equalsIgnoreCase(name)) {
			diff16(value);
			return;
		}
		if ($upri17.equalsIgnoreCase(name)) {
			upri17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($diff17.equalsIgnoreCase(name)) {
			diff17(value);
			return;
		}
		if ($upri18.equalsIgnoreCase(name)) {
			upri18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($diff18.equalsIgnoreCase(name)) {
			diff18(value);
			return;
		}
		if ($upri19.equalsIgnoreCase(name)) {
			upri19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($diff19.equalsIgnoreCase(name)) {
			diff19(value);
			return;
		}
		if ($upri20.equalsIgnoreCase(name)) {
			upri20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($diff20.equalsIgnoreCase(name)) {
			diff20(value);
			return;
		}
		if ($upri21.equalsIgnoreCase(name)) {
			upri21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($diff21.equalsIgnoreCase(name)) {
			diff21(value);
			return;
		}
		if ($upri22.equalsIgnoreCase(name)) {
			upri22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($diff22.equalsIgnoreCase(name)) {
			diff22(value);
			return;
		}
		if ($upri23.equalsIgnoreCase(name)) {
			upri23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($diff23.equalsIgnoreCase(name)) {
			diff23(value);
			return;
		}
		if ($upri24.equalsIgnoreCase(name)) {
			upri24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($diff24.equalsIgnoreCase(name)) {
			diff24(value);
			return;
		}
		if ($upri25.equalsIgnoreCase(name)) {
			upri25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($diff25.equalsIgnoreCase(name)) {
			diff25(value);
			return;
		}
		if ($upri26.equalsIgnoreCase(name)) {
			upri26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($diff26.equalsIgnoreCase(name)) {
			diff26(value);
			return;
		}
		if ($upri27.equalsIgnoreCase(name)) {
			upri27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($diff27.equalsIgnoreCase(name)) {
			diff27(value);
			return;
		}
		if ($upri28.equalsIgnoreCase(name)) {
			upri28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($diff28.equalsIgnoreCase(name)) {
			diff28(value);
			return;
		}
		if ($upri29.equalsIgnoreCase(name)) {
			upri29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($diff29.equalsIgnoreCase(name)) {
			diff29(value);
			return;
		}
		if ($upri30.equalsIgnoreCase(name)) {
			upri30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($diff30.equalsIgnoreCase(name)) {
			diff30(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri01.equalsIgnoreCase(name)) {
			upri01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($diff01.equalsIgnoreCase(name)) {
			diff01(value);
			return;
		}
		if ($upri02.equalsIgnoreCase(name)) {
			upri02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($diff02.equalsIgnoreCase(name)) {
			diff02(value);
			return;
		}
		if ($upri03.equalsIgnoreCase(name)) {
			upri03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($diff03.equalsIgnoreCase(name)) {
			diff03(value);
			return;
		}
		if ($upri04.equalsIgnoreCase(name)) {
			upri04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($diff04.equalsIgnoreCase(name)) {
			diff04(value);
			return;
		}
		if ($upri05.equalsIgnoreCase(name)) {
			upri05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($diff05.equalsIgnoreCase(name)) {
			diff05(value);
			return;
		}
		if ($upri06.equalsIgnoreCase(name)) {
			upri06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($diff06.equalsIgnoreCase(name)) {
			diff06(value);
			return;
		}
		if ($upri07.equalsIgnoreCase(name)) {
			upri07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($diff07.equalsIgnoreCase(name)) {
			diff07(value);
			return;
		}
		if ($upri08.equalsIgnoreCase(name)) {
			upri08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($diff08.equalsIgnoreCase(name)) {
			diff08(value);
			return;
		}
		if ($upri09.equalsIgnoreCase(name)) {
			upri09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($diff09.equalsIgnoreCase(name)) {
			diff09(value);
			return;
		}
		if ($upri10.equalsIgnoreCase(name)) {
			upri10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($diff10.equalsIgnoreCase(name)) {
			diff10(value);
			return;
		}
		if ($upri11.equalsIgnoreCase(name)) {
			upri11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($diff11.equalsIgnoreCase(name)) {
			diff11(value);
			return;
		}
		if ($upri12.equalsIgnoreCase(name)) {
			upri12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($diff12.equalsIgnoreCase(name)) {
			diff12(value);
			return;
		}
		if ($upri13.equalsIgnoreCase(name)) {
			upri13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($diff13.equalsIgnoreCase(name)) {
			diff13(value);
			return;
		}
		if ($upri14.equalsIgnoreCase(name)) {
			upri14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($diff14.equalsIgnoreCase(name)) {
			diff14(value);
			return;
		}
		if ($upri15.equalsIgnoreCase(name)) {
			upri15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($diff15.equalsIgnoreCase(name)) {
			diff15(value);
			return;
		}
		if ($upri16.equalsIgnoreCase(name)) {
			upri16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($diff16.equalsIgnoreCase(name)) {
			diff16(value);
			return;
		}
		if ($upri17.equalsIgnoreCase(name)) {
			upri17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($diff17.equalsIgnoreCase(name)) {
			diff17(value);
			return;
		}
		if ($upri18.equalsIgnoreCase(name)) {
			upri18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($diff18.equalsIgnoreCase(name)) {
			diff18(value);
			return;
		}
		if ($upri19.equalsIgnoreCase(name)) {
			upri19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($diff19.equalsIgnoreCase(name)) {
			diff19(value);
			return;
		}
		if ($upri20.equalsIgnoreCase(name)) {
			upri20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($diff20.equalsIgnoreCase(name)) {
			diff20(value);
			return;
		}
		if ($upri21.equalsIgnoreCase(name)) {
			upri21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($diff21.equalsIgnoreCase(name)) {
			diff21(value);
			return;
		}
		if ($upri22.equalsIgnoreCase(name)) {
			upri22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($diff22.equalsIgnoreCase(name)) {
			diff22(value);
			return;
		}
		if ($upri23.equalsIgnoreCase(name)) {
			upri23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($diff23.equalsIgnoreCase(name)) {
			diff23(value);
			return;
		}
		if ($upri24.equalsIgnoreCase(name)) {
			upri24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($diff24.equalsIgnoreCase(name)) {
			diff24(value);
			return;
		}
		if ($upri25.equalsIgnoreCase(name)) {
			upri25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($diff25.equalsIgnoreCase(name)) {
			diff25(value);
			return;
		}
		if ($upri26.equalsIgnoreCase(name)) {
			upri26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($diff26.equalsIgnoreCase(name)) {
			diff26(value);
			return;
		}
		if ($upri27.equalsIgnoreCase(name)) {
			upri27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($diff27.equalsIgnoreCase(name)) {
			diff27(value);
			return;
		}
		if ($upri28.equalsIgnoreCase(name)) {
			upri28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($diff28.equalsIgnoreCase(name)) {
			diff28(value);
			return;
		}
		if ($upri29.equalsIgnoreCase(name)) {
			upri29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($diff29.equalsIgnoreCase(name)) {
			diff29(value);
			return;
		}
		if ($upri30.equalsIgnoreCase(name)) {
			upri30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($diff30.equalsIgnoreCase(name)) {
			diff30(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($qty01_p.equalsIgnoreCase(name)) {
			return qty01_p();
		}
		if ($qty02_p.equalsIgnoreCase(name)) {
			return qty02_p();
		}
		if ($qty03_p.equalsIgnoreCase(name)) {
			return qty03_p();
		}
		if ($qty04_p.equalsIgnoreCase(name)) {
			return qty04_p();
		}
		if ($qty05_p.equalsIgnoreCase(name)) {
			return qty05_p();
		}
		if ($qty06_p.equalsIgnoreCase(name)) {
			return qty06_p();
		}
		if ($qty07_p.equalsIgnoreCase(name)) {
			return qty07_p();
		}
		if ($qty08_p.equalsIgnoreCase(name)) {
			return qty08_p();
		}
		if ($qty09_p.equalsIgnoreCase(name)) {
			return qty09_p();
		}
		if ($qty10_p.equalsIgnoreCase(name)) {
			return qty10_p();
		}
		if ($qty11_p.equalsIgnoreCase(name)) {
			return qty11_p();
		}
		if ($qty12_p.equalsIgnoreCase(name)) {
			return qty12_p();
		}
		if ($qty13_p.equalsIgnoreCase(name)) {
			return qty13_p();
		}
		if ($qty14_p.equalsIgnoreCase(name)) {
			return qty14_p();
		}
		if ($qty15_p.equalsIgnoreCase(name)) {
			return qty15_p();
		}
		if ($qty16_p.equalsIgnoreCase(name)) {
			return qty16_p();
		}
		if ($qty17_p.equalsIgnoreCase(name)) {
			return qty17_p();
		}
		if ($qty18_p.equalsIgnoreCase(name)) {
			return qty18_p();
		}
		if ($qty19_p.equalsIgnoreCase(name)) {
			return qty19_p();
		}
		if ($qty20_p.equalsIgnoreCase(name)) {
			return qty20_p();
		}
		if ($qty21_p.equalsIgnoreCase(name)) {
			return qty21_p();
		}
		if ($qty22_p.equalsIgnoreCase(name)) {
			return qty22_p();
		}
		if ($qty23_p.equalsIgnoreCase(name)) {
			return qty23_p();
		}
		if ($qty24_p.equalsIgnoreCase(name)) {
			return qty24_p();
		}
		if ($qty25_p.equalsIgnoreCase(name)) {
			return qty25_p();
		}
		if ($qty26_p.equalsIgnoreCase(name)) {
			return qty26_p();
		}
		if ($qty27_p.equalsIgnoreCase(name)) {
			return qty27_p();
		}
		if ($qty28_p.equalsIgnoreCase(name)) {
			return qty28_p();
		}
		if ($qty29_p.equalsIgnoreCase(name)) {
			return qty29_p();
		}
		if ($qty30_p.equalsIgnoreCase(name)) {
			return qty30_p();
		}
		if ($diff_qty_p.equalsIgnoreCase(name)) {
			return diff_qty_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($qty01_p.equalsIgnoreCase(name)) {
			qty01_p(
				((MCContainerMeta) qty01_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty02_p.equalsIgnoreCase(name)) {
			qty02_p(
				((MCContainerMeta) qty02_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty03_p.equalsIgnoreCase(name)) {
			qty03_p(
				((MCContainerMeta) qty03_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty04_p.equalsIgnoreCase(name)) {
			qty04_p(
				((MCContainerMeta) qty04_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty05_p.equalsIgnoreCase(name)) {
			qty05_p(
				((MCContainerMeta) qty05_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty06_p.equalsIgnoreCase(name)) {
			qty06_p(
				((MCContainerMeta) qty06_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty07_p.equalsIgnoreCase(name)) {
			qty07_p(
				((MCContainerMeta) qty07_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty08_p.equalsIgnoreCase(name)) {
			qty08_p(
				((MCContainerMeta) qty08_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty09_p.equalsIgnoreCase(name)) {
			qty09_p(
				((MCContainerMeta) qty09_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty10_p.equalsIgnoreCase(name)) {
			qty10_p(
				((MCContainerMeta) qty10_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty11_p.equalsIgnoreCase(name)) {
			qty11_p(
				((MCContainerMeta) qty11_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty12_p.equalsIgnoreCase(name)) {
			qty12_p(
				((MCContainerMeta) qty12_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty13_p.equalsIgnoreCase(name)) {
			qty13_p(
				((MCContainerMeta) qty13_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty14_p.equalsIgnoreCase(name)) {
			qty14_p(
				((MCContainerMeta) qty14_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty15_p.equalsIgnoreCase(name)) {
			qty15_p(
				((MCContainerMeta) qty15_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty16_p.equalsIgnoreCase(name)) {
			qty16_p(
				((MCContainerMeta) qty16_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty17_p.equalsIgnoreCase(name)) {
			qty17_p(
				((MCContainerMeta) qty17_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty18_p.equalsIgnoreCase(name)) {
			qty18_p(
				((MCContainerMeta) qty18_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty19_p.equalsIgnoreCase(name)) {
			qty19_p(
				((MCContainerMeta) qty19_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty20_p.equalsIgnoreCase(name)) {
			qty20_p(
				((MCContainerMeta) qty20_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty21_p.equalsIgnoreCase(name)) {
			qty21_p(
				((MCContainerMeta) qty21_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty22_p.equalsIgnoreCase(name)) {
			qty22_p(
				((MCContainerMeta) qty22_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty23_p.equalsIgnoreCase(name)) {
			qty23_p(
				((MCContainerMeta) qty23_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty24_p.equalsIgnoreCase(name)) {
			qty24_p(
				((MCContainerMeta) qty24_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty25_p.equalsIgnoreCase(name)) {
			qty25_p(
				((MCContainerMeta) qty25_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty26_p.equalsIgnoreCase(name)) {
			qty26_p(
				((MCContainerMeta) qty26_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty27_p.equalsIgnoreCase(name)) {
			qty27_p(
				((MCContainerMeta) qty27_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty28_p.equalsIgnoreCase(name)) {
			qty28_p(
				((MCContainerMeta) qty28_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty29_p.equalsIgnoreCase(name)) {
			qty29_p(
				((MCContainerMeta) qty29_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty30_p.equalsIgnoreCase(name)) {
			qty30_p(
				((MCContainerMeta) qty30_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($diff_qty_p.equalsIgnoreCase(name)) {
			diff_qty_p(
				((MCContainerMeta) diff_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

	public MCNumber qty01() {
		return qty01_p().qty();
	}

	public void qty01(MCNumber value) {
		qty01_p().qty(value);
	}

	public void qty01(int value) {
		qty01_p().qty(value);
	}

	public void qty01(long value) {
		qty01_p().qty(value);
	}

	public void qty01(float value) {
		qty01_p().qty(value);
	}

	public void qty01(double value) {
		qty01_p().qty(value);
	}

	public MCNumber qty02() {
		return qty02_p().qty();
	}

	public void qty02(MCNumber value) {
		qty02_p().qty(value);
	}

	public void qty02(int value) {
		qty02_p().qty(value);
	}

	public void qty02(long value) {
		qty02_p().qty(value);
	}

	public void qty02(float value) {
		qty02_p().qty(value);
	}

	public void qty02(double value) {
		qty02_p().qty(value);
	}

	public MCNumber qty03() {
		return qty03_p().qty();
	}

	public void qty03(MCNumber value) {
		qty03_p().qty(value);
	}

	public void qty03(int value) {
		qty03_p().qty(value);
	}

	public void qty03(long value) {
		qty03_p().qty(value);
	}

	public void qty03(float value) {
		qty03_p().qty(value);
	}

	public void qty03(double value) {
		qty03_p().qty(value);
	}

	public MCNumber qty04() {
		return qty04_p().qty();
	}

	public void qty04(MCNumber value) {
		qty04_p().qty(value);
	}

	public void qty04(int value) {
		qty04_p().qty(value);
	}

	public void qty04(long value) {
		qty04_p().qty(value);
	}

	public void qty04(float value) {
		qty04_p().qty(value);
	}

	public void qty04(double value) {
		qty04_p().qty(value);
	}

	public MCNumber qty05() {
		return qty05_p().qty();
	}

	public void qty05(MCNumber value) {
		qty05_p().qty(value);
	}

	public void qty05(int value) {
		qty05_p().qty(value);
	}

	public void qty05(long value) {
		qty05_p().qty(value);
	}

	public void qty05(float value) {
		qty05_p().qty(value);
	}

	public void qty05(double value) {
		qty05_p().qty(value);
	}

	public MCNumber qty06() {
		return qty06_p().qty();
	}

	public void qty06(MCNumber value) {
		qty06_p().qty(value);
	}

	public void qty06(int value) {
		qty06_p().qty(value);
	}

	public void qty06(long value) {
		qty06_p().qty(value);
	}

	public void qty06(float value) {
		qty06_p().qty(value);
	}

	public void qty06(double value) {
		qty06_p().qty(value);
	}

	public MCNumber qty07() {
		return qty07_p().qty();
	}

	public void qty07(MCNumber value) {
		qty07_p().qty(value);
	}

	public void qty07(int value) {
		qty07_p().qty(value);
	}

	public void qty07(long value) {
		qty07_p().qty(value);
	}

	public void qty07(float value) {
		qty07_p().qty(value);
	}

	public void qty07(double value) {
		qty07_p().qty(value);
	}

	public MCNumber qty08() {
		return qty08_p().qty();
	}

	public void qty08(MCNumber value) {
		qty08_p().qty(value);
	}

	public void qty08(int value) {
		qty08_p().qty(value);
	}

	public void qty08(long value) {
		qty08_p().qty(value);
	}

	public void qty08(float value) {
		qty08_p().qty(value);
	}

	public void qty08(double value) {
		qty08_p().qty(value);
	}

	public MCNumber qty09() {
		return qty09_p().qty();
	}

	public void qty09(MCNumber value) {
		qty09_p().qty(value);
	}

	public void qty09(int value) {
		qty09_p().qty(value);
	}

	public void qty09(long value) {
		qty09_p().qty(value);
	}

	public void qty09(float value) {
		qty09_p().qty(value);
	}

	public void qty09(double value) {
		qty09_p().qty(value);
	}

	public MCNumber qty10() {
		return qty10_p().qty();
	}

	public void qty10(MCNumber value) {
		qty10_p().qty(value);
	}

	public void qty10(int value) {
		qty10_p().qty(value);
	}

	public void qty10(long value) {
		qty10_p().qty(value);
	}

	public void qty10(float value) {
		qty10_p().qty(value);
	}

	public void qty10(double value) {
		qty10_p().qty(value);
	}

	public MCNumber qty11() {
		return qty11_p().qty();
	}

	public void qty11(MCNumber value) {
		qty11_p().qty(value);
	}

	public void qty11(int value) {
		qty11_p().qty(value);
	}

	public void qty11(long value) {
		qty11_p().qty(value);
	}

	public void qty11(float value) {
		qty11_p().qty(value);
	}

	public void qty11(double value) {
		qty11_p().qty(value);
	}

	public MCNumber qty12() {
		return qty12_p().qty();
	}

	public void qty12(MCNumber value) {
		qty12_p().qty(value);
	}

	public void qty12(int value) {
		qty12_p().qty(value);
	}

	public void qty12(long value) {
		qty12_p().qty(value);
	}

	public void qty12(float value) {
		qty12_p().qty(value);
	}

	public void qty12(double value) {
		qty12_p().qty(value);
	}

	public MCNumber qty13() {
		return qty13_p().qty();
	}

	public void qty13(MCNumber value) {
		qty13_p().qty(value);
	}

	public void qty13(int value) {
		qty13_p().qty(value);
	}

	public void qty13(long value) {
		qty13_p().qty(value);
	}

	public void qty13(float value) {
		qty13_p().qty(value);
	}

	public void qty13(double value) {
		qty13_p().qty(value);
	}

	public MCNumber qty14() {
		return qty14_p().qty();
	}

	public void qty14(MCNumber value) {
		qty14_p().qty(value);
	}

	public void qty14(int value) {
		qty14_p().qty(value);
	}

	public void qty14(long value) {
		qty14_p().qty(value);
	}

	public void qty14(float value) {
		qty14_p().qty(value);
	}

	public void qty14(double value) {
		qty14_p().qty(value);
	}

	public MCNumber qty15() {
		return qty15_p().qty();
	}

	public void qty15(MCNumber value) {
		qty15_p().qty(value);
	}

	public void qty15(int value) {
		qty15_p().qty(value);
	}

	public void qty15(long value) {
		qty15_p().qty(value);
	}

	public void qty15(float value) {
		qty15_p().qty(value);
	}

	public void qty15(double value) {
		qty15_p().qty(value);
	}

	public MCNumber qty16() {
		return qty16_p().qty();
	}

	public void qty16(MCNumber value) {
		qty16_p().qty(value);
	}

	public void qty16(int value) {
		qty16_p().qty(value);
	}

	public void qty16(long value) {
		qty16_p().qty(value);
	}

	public void qty16(float value) {
		qty16_p().qty(value);
	}

	public void qty16(double value) {
		qty16_p().qty(value);
	}

	public MCNumber qty17() {
		return qty17_p().qty();
	}

	public void qty17(MCNumber value) {
		qty17_p().qty(value);
	}

	public void qty17(int value) {
		qty17_p().qty(value);
	}

	public void qty17(long value) {
		qty17_p().qty(value);
	}

	public void qty17(float value) {
		qty17_p().qty(value);
	}

	public void qty17(double value) {
		qty17_p().qty(value);
	}

	public MCNumber qty18() {
		return qty18_p().qty();
	}

	public void qty18(MCNumber value) {
		qty18_p().qty(value);
	}

	public void qty18(int value) {
		qty18_p().qty(value);
	}

	public void qty18(long value) {
		qty18_p().qty(value);
	}

	public void qty18(float value) {
		qty18_p().qty(value);
	}

	public void qty18(double value) {
		qty18_p().qty(value);
	}

	public MCNumber qty19() {
		return qty19_p().qty();
	}

	public void qty19(MCNumber value) {
		qty19_p().qty(value);
	}

	public void qty19(int value) {
		qty19_p().qty(value);
	}

	public void qty19(long value) {
		qty19_p().qty(value);
	}

	public void qty19(float value) {
		qty19_p().qty(value);
	}

	public void qty19(double value) {
		qty19_p().qty(value);
	}

	public MCNumber qty20() {
		return qty20_p().qty();
	}

	public void qty20(MCNumber value) {
		qty20_p().qty(value);
	}

	public void qty20(int value) {
		qty20_p().qty(value);
	}

	public void qty20(long value) {
		qty20_p().qty(value);
	}

	public void qty20(float value) {
		qty20_p().qty(value);
	}

	public void qty20(double value) {
		qty20_p().qty(value);
	}

	public MCNumber qty21() {
		return qty21_p().qty();
	}

	public void qty21(MCNumber value) {
		qty21_p().qty(value);
	}

	public void qty21(int value) {
		qty21_p().qty(value);
	}

	public void qty21(long value) {
		qty21_p().qty(value);
	}

	public void qty21(float value) {
		qty21_p().qty(value);
	}

	public void qty21(double value) {
		qty21_p().qty(value);
	}

	public MCNumber qty22() {
		return qty22_p().qty();
	}

	public void qty22(MCNumber value) {
		qty22_p().qty(value);
	}

	public void qty22(int value) {
		qty22_p().qty(value);
	}

	public void qty22(long value) {
		qty22_p().qty(value);
	}

	public void qty22(float value) {
		qty22_p().qty(value);
	}

	public void qty22(double value) {
		qty22_p().qty(value);
	}

	public MCNumber qty23() {
		return qty23_p().qty();
	}

	public void qty23(MCNumber value) {
		qty23_p().qty(value);
	}

	public void qty23(int value) {
		qty23_p().qty(value);
	}

	public void qty23(long value) {
		qty23_p().qty(value);
	}

	public void qty23(float value) {
		qty23_p().qty(value);
	}

	public void qty23(double value) {
		qty23_p().qty(value);
	}

	public MCNumber qty24() {
		return qty24_p().qty();
	}

	public void qty24(MCNumber value) {
		qty24_p().qty(value);
	}

	public void qty24(int value) {
		qty24_p().qty(value);
	}

	public void qty24(long value) {
		qty24_p().qty(value);
	}

	public void qty24(float value) {
		qty24_p().qty(value);
	}

	public void qty24(double value) {
		qty24_p().qty(value);
	}

	public MCNumber qty25() {
		return qty25_p().qty();
	}

	public void qty25(MCNumber value) {
		qty25_p().qty(value);
	}

	public void qty25(int value) {
		qty25_p().qty(value);
	}

	public void qty25(long value) {
		qty25_p().qty(value);
	}

	public void qty25(float value) {
		qty25_p().qty(value);
	}

	public void qty25(double value) {
		qty25_p().qty(value);
	}

	public MCNumber qty26() {
		return qty26_p().qty();
	}

	public void qty26(MCNumber value) {
		qty26_p().qty(value);
	}

	public void qty26(int value) {
		qty26_p().qty(value);
	}

	public void qty26(long value) {
		qty26_p().qty(value);
	}

	public void qty26(float value) {
		qty26_p().qty(value);
	}

	public void qty26(double value) {
		qty26_p().qty(value);
	}

	public MCNumber qty27() {
		return qty27_p().qty();
	}

	public void qty27(MCNumber value) {
		qty27_p().qty(value);
	}

	public void qty27(int value) {
		qty27_p().qty(value);
	}

	public void qty27(long value) {
		qty27_p().qty(value);
	}

	public void qty27(float value) {
		qty27_p().qty(value);
	}

	public void qty27(double value) {
		qty27_p().qty(value);
	}

	public MCNumber qty28() {
		return qty28_p().qty();
	}

	public void qty28(MCNumber value) {
		qty28_p().qty(value);
	}

	public void qty28(int value) {
		qty28_p().qty(value);
	}

	public void qty28(long value) {
		qty28_p().qty(value);
	}

	public void qty28(float value) {
		qty28_p().qty(value);
	}

	public void qty28(double value) {
		qty28_p().qty(value);
	}

	public MCNumber qty29() {
		return qty29_p().qty();
	}

	public void qty29(MCNumber value) {
		qty29_p().qty(value);
	}

	public void qty29(int value) {
		qty29_p().qty(value);
	}

	public void qty29(long value) {
		qty29_p().qty(value);
	}

	public void qty29(float value) {
		qty29_p().qty(value);
	}

	public void qty29(double value) {
		qty29_p().qty(value);
	}

	public MCNumber qty30() {
		return qty30_p().qty();
	}

	public void qty30(MCNumber value) {
		qty30_p().qty(value);
	}

	public void qty30(int value) {
		qty30_p().qty(value);
	}

	public void qty30(long value) {
		qty30_p().qty(value);
	}

	public void qty30(float value) {
		qty30_p().qty(value);
	}

	public void qty30(double value) {
		qty30_p().qty(value);
	}

	public MCNumber diff_qty() {
		return diff_qty_p().qty();
	}

	public void diff_qty(MCNumber value) {
		diff_qty_p().qty(value);
	}

	public void diff_qty(int value) {
		diff_qty_p().qty(value);
	}

	public void diff_qty(long value) {
		diff_qty_p().qty(value);
	}

	public void diff_qty(float value) {
		diff_qty_p().qty(value);
	}

	public void diff_qty(double value) {
		diff_qty_p().qty(value);
	}

}

