package mcframe.serverMGBF.MGBFL0260;

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
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public static final String $itm_grp_nm1 = "itm_grp_nm1";
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public static final String $itm_grp_nm2 = "itm_grp_nm2";
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public static final String $itm_grp_nm3 = "itm_grp_nm3";
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public static final String $itm_grp_nm4 = "itm_grp_nm4";
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public static final String $itm_grp_nm5 = "itm_grp_nm5";
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public static final String $itm_grp_nm6 = "itm_grp_nm6";
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public static final String $itm_grp_nm7 = "itm_grp_nm7";
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public static final String $itm_grp_nm8 = "itm_grp_nm8";
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public static final String $itm_grp_nm9 = "itm_grp_nm9";
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public static final String $itm_grp_nm10 = "itm_grp_nm10";
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
	 * Quantity 01 数量０１.<p>
	 *
	 */
	public static final String $qty01 = "qty01";
	/**
	 * Amount 01 金額０１.<p>
	 *
	 */
	public static final String $amt01 = "amt01";
	/**
	 * Standard 01 標準０１.<p>
	 *
	 */
	public static final String $std01 = "std01";
	/**
	 * Quantity 02 数量０２.<p>
	 *
	 */
	public static final String $qty02 = "qty02";
	/**
	 * Amount 02 金額０２.<p>
	 *
	 */
	public static final String $amt02 = "amt02";
	/**
	 * Standard 02 標準０２.<p>
	 *
	 */
	public static final String $std02 = "std02";
	/**
	 * Quantity 03 数量０３.<p>
	 *
	 */
	public static final String $qty03 = "qty03";
	/**
	 * Amount 03 金額０３.<p>
	 *
	 */
	public static final String $amt03 = "amt03";
	/**
	 * Standard 03 標準０３.<p>
	 *
	 */
	public static final String $std03 = "std03";
	/**
	 * Quantity 04 数量０４.<p>
	 *
	 */
	public static final String $qty04 = "qty04";
	/**
	 * Amount 04 金額０４.<p>
	 *
	 */
	public static final String $amt04 = "amt04";
	/**
	 * Standard 04 標準０４.<p>
	 *
	 */
	public static final String $std04 = "std04";
	/**
	 * Quantity 05 数量０５.<p>
	 *
	 */
	public static final String $qty05 = "qty05";
	/**
	 * Amount 05 金額０５.<p>
	 *
	 */
	public static final String $amt05 = "amt05";
	/**
	 * Standard 05 標準０５.<p>
	 *
	 */
	public static final String $std05 = "std05";
	/**
	 * Quantity 06 数量０６.<p>
	 *
	 */
	public static final String $qty06 = "qty06";
	/**
	 * Amount 06 金額０６.<p>
	 *
	 */
	public static final String $amt06 = "amt06";
	/**
	 * Standard 06 標準０６.<p>
	 *
	 */
	public static final String $std06 = "std06";
	/**
	 * Quantity 07 数量０７.<p>
	 *
	 */
	public static final String $qty07 = "qty07";
	/**
	 * Amount 07 金額０７.<p>
	 *
	 */
	public static final String $amt07 = "amt07";
	/**
	 * Standard 07 標準０７.<p>
	 *
	 */
	public static final String $std07 = "std07";
	/**
	 * Quantity 08 数量０８.<p>
	 *
	 */
	public static final String $qty08 = "qty08";
	/**
	 * Amount 08 金額０８.<p>
	 *
	 */
	public static final String $amt08 = "amt08";
	/**
	 * Standard 08 標準０８.<p>
	 *
	 */
	public static final String $std08 = "std08";
	/**
	 * Quantity 09 数量０９.<p>
	 *
	 */
	public static final String $qty09 = "qty09";
	/**
	 * Amount 09 金額０９.<p>
	 *
	 */
	public static final String $amt09 = "amt09";
	/**
	 * Standard 09 標準０９.<p>
	 *
	 */
	public static final String $std09 = "std09";
	/**
	 * Quantity 10 数量１０.<p>
	 *
	 */
	public static final String $qty10 = "qty10";
	/**
	 * Amount 10 金額１０.<p>
	 *
	 */
	public static final String $amt10 = "amt10";
	/**
	 * Standard 10 標準１０.<p>
	 *
	 */
	public static final String $std10 = "std10";
	/**
	 * Quantity 11 数量１１.<p>
	 *
	 */
	public static final String $qty11 = "qty11";
	/**
	 * Amount 11 金額１１.<p>
	 *
	 */
	public static final String $amt11 = "amt11";
	/**
	 * Standard 11 標準１１.<p>
	 *
	 */
	public static final String $std11 = "std11";
	/**
	 * Quantity 12 数量１２.<p>
	 *
	 */
	public static final String $qty12 = "qty12";
	/**
	 * Amount 12 金額１２.<p>
	 *
	 */
	public static final String $amt12 = "amt12";
	/**
	 * Standard 12 標準１２.<p>
	 *
	 */
	public static final String $std12 = "std12";
	/**
	 * Quantity 13 数量１３.<p>
	 *
	 */
	public static final String $qty13 = "qty13";
	/**
	 * Amount 13 金額１３.<p>
	 *
	 */
	public static final String $amt13 = "amt13";
	/**
	 * Standard 13 標準１３.<p>
	 *
	 */
	public static final String $std13 = "std13";
	/**
	 * Quantity 14 数量１４.<p>
	 *
	 */
	public static final String $qty14 = "qty14";
	/**
	 * Amount 14 金額１４.<p>
	 *
	 */
	public static final String $amt14 = "amt14";
	/**
	 * Standard 14 標準１４.<p>
	 *
	 */
	public static final String $std14 = "std14";
	/**
	 * Quantity 15 数量１５.<p>
	 *
	 */
	public static final String $qty15 = "qty15";
	/**
	 * Amount 15 金額１５.<p>
	 *
	 */
	public static final String $amt15 = "amt15";
	/**
	 * Standard 15 標準１５.<p>
	 *
	 */
	public static final String $std15 = "std15";
	/**
	 * Quantity 16 数量１６.<p>
	 *
	 */
	public static final String $qty16 = "qty16";
	/**
	 * Amount 16 金額１６.<p>
	 *
	 */
	public static final String $amt16 = "amt16";
	/**
	 * Standard 16 標準１６.<p>
	 *
	 */
	public static final String $std16 = "std16";
	/**
	 * Quantity 17 数量１７.<p>
	 *
	 */
	public static final String $qty17 = "qty17";
	/**
	 * Amount 17 金額１７.<p>
	 *
	 */
	public static final String $amt17 = "amt17";
	/**
	 * Standard 17 標準１７.<p>
	 *
	 */
	public static final String $std17 = "std17";
	/**
	 * Quantity 18 数量１８.<p>
	 *
	 */
	public static final String $qty18 = "qty18";
	/**
	 * Amount 18 金額１８.<p>
	 *
	 */
	public static final String $amt18 = "amt18";
	/**
	 * Standard 18 標準１８.<p>
	 *
	 */
	public static final String $std18 = "std18";
	/**
	 * Quantity 19 数量１９.<p>
	 *
	 */
	public static final String $qty19 = "qty19";
	/**
	 * Amount 19 金額１９.<p>
	 *
	 */
	public static final String $amt19 = "amt19";
	/**
	 * Standard 19 標準１９.<p>
	 *
	 */
	public static final String $std19 = "std19";
	/**
	 * Quantity 20 数量２０.<p>
	 *
	 */
	public static final String $qty20 = "qty20";
	/**
	 * Amount 20 金額２０.<p>
	 *
	 */
	public static final String $amt20 = "amt20";
	/**
	 * Standard 20 標準２０.<p>
	 *
	 */
	public static final String $std20 = "std20";
	/**
	 * Quantity 21 数量２１.<p>
	 *
	 */
	public static final String $qty21 = "qty21";
	/**
	 * Amount 21 金額２１.<p>
	 *
	 */
	public static final String $amt21 = "amt21";
	/**
	 * Standard 21 標準２１.<p>
	 *
	 */
	public static final String $std21 = "std21";
	/**
	 * Quantity 22 数量２２.<p>
	 *
	 */
	public static final String $qty22 = "qty22";
	/**
	 * Amount 22 金額２２.<p>
	 *
	 */
	public static final String $amt22 = "amt22";
	/**
	 * Standard 22 標準２２.<p>
	 *
	 */
	public static final String $std22 = "std22";
	/**
	 * Quantity 23 数量２３.<p>
	 *
	 */
	public static final String $qty23 = "qty23";
	/**
	 * Amount 23 金額２３.<p>
	 *
	 */
	public static final String $amt23 = "amt23";
	/**
	 * Standard 23 標準２３.<p>
	 *
	 */
	public static final String $std23 = "std23";
	/**
	 * Quantity 24 数量２４.<p>
	 *
	 */
	public static final String $qty24 = "qty24";
	/**
	 * Amount 24 金額２４.<p>
	 *
	 */
	public static final String $amt24 = "amt24";
	/**
	 * Standard 24 標準２４.<p>
	 *
	 */
	public static final String $std24 = "std24";
	/**
	 * Quantity 25 数量２５.<p>
	 *
	 */
	public static final String $qty25 = "qty25";
	/**
	 * Amount 25 金額２５.<p>
	 *
	 */
	public static final String $amt25 = "amt25";
	/**
	 * Standard 25 標準２５.<p>
	 *
	 */
	public static final String $std25 = "std25";
	/**
	 * Quantity 26 数量２６.<p>
	 *
	 */
	public static final String $qty26 = "qty26";
	/**
	 * Amount 26 金額２６.<p>
	 *
	 */
	public static final String $amt26 = "amt26";
	/**
	 * Standard 26 標準２６.<p>
	 *
	 */
	public static final String $std26 = "std26";
	/**
	 * Quantity 27 数量２７.<p>
	 *
	 */
	public static final String $qty27 = "qty27";
	/**
	 * Amount 27 金額２７.<p>
	 *
	 */
	public static final String $amt27 = "amt27";
	/**
	 * Standard 27 標準２７.<p>
	 *
	 */
	public static final String $std27 = "std27";
	/**
	 * Quantity 28 数量２８.<p>
	 *
	 */
	public static final String $qty28 = "qty28";
	/**
	 * Amount 28 金額２８.<p>
	 *
	 */
	public static final String $amt28 = "amt28";
	/**
	 * Standard 28 標準２８.<p>
	 *
	 */
	public static final String $std28 = "std28";
	/**
	 * Quantity 29 数量２９.<p>
	 *
	 */
	public static final String $qty29 = "qty29";
	/**
	 * Amount 29 金額２９.<p>
	 *
	 */
	public static final String $amt29 = "amt29";
	/**
	 * Standard 29 標準２９.<p>
	 *
	 */
	public static final String $std29 = "std29";
	/**
	 * Quantity 30 数量３０.<p>
	 *
	 */
	public static final String $qty30 = "qty30";
	/**
	 * Amount 30 金額３０.<p>
	 *
	 */
	public static final String $amt30 = "amt30";
	/**
	 * Standard 30 標準３０.<p>
	 *
	 */
	public static final String $std30 = "std30";
	/**
	 * Quantity difference 数量差.<p>
	 *
	 */
	public static final String $diff_qty = "diff_qty";
	/**
	 * Amount variance 金額差.<p>
	 *
	 */
	public static final String $diff_amt = "diff_amt";
	/**
	 * Standard variance 標準差.<p>
	 *
	 */
	public static final String $diff_std = "diff_std";
	/**
	 * Number of aggregation 集計件数.<p>
	 *
	 */
	public static final String $ave_tgt = "ave_tgt";


	public static final MCMeta dummy_term_META = createCommonMeta($dummy_term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta qty01_META = createCommonMeta($qty01, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt01_META = createCommonMeta($amt01, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std01_META = createCommonMeta($std01, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty02_META = createCommonMeta($qty02, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt02_META = createCommonMeta($amt02, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std02_META = createCommonMeta($std02, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty03_META = createCommonMeta($qty03, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt03_META = createCommonMeta($amt03, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std03_META = createCommonMeta($std03, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty04_META = createCommonMeta($qty04, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt04_META = createCommonMeta($amt04, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std04_META = createCommonMeta($std04, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty05_META = createCommonMeta($qty05, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt05_META = createCommonMeta($amt05, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std05_META = createCommonMeta($std05, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty06_META = createCommonMeta($qty06, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt06_META = createCommonMeta($amt06, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std06_META = createCommonMeta($std06, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty07_META = createCommonMeta($qty07, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt07_META = createCommonMeta($amt07, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std07_META = createCommonMeta($std07, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty08_META = createCommonMeta($qty08, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt08_META = createCommonMeta($amt08, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std08_META = createCommonMeta($std08, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty09_META = createCommonMeta($qty09, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt09_META = createCommonMeta($amt09, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std09_META = createCommonMeta($std09, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty10_META = createCommonMeta($qty10, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt10_META = createCommonMeta($amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std10_META = createCommonMeta($std10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty11_META = createCommonMeta($qty11, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt11_META = createCommonMeta($amt11, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std11_META = createCommonMeta($std11, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty12_META = createCommonMeta($qty12, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt12_META = createCommonMeta($amt12, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std12_META = createCommonMeta($std12, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty13_META = createCommonMeta($qty13, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt13_META = createCommonMeta($amt13, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std13_META = createCommonMeta($std13, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty14_META = createCommonMeta($qty14, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt14_META = createCommonMeta($amt14, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std14_META = createCommonMeta($std14, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty15_META = createCommonMeta($qty15, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt15_META = createCommonMeta($amt15, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std15_META = createCommonMeta($std15, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty16_META = createCommonMeta($qty16, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt16_META = createCommonMeta($amt16, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std16_META = createCommonMeta($std16, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty17_META = createCommonMeta($qty17, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt17_META = createCommonMeta($amt17, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std17_META = createCommonMeta($std17, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty18_META = createCommonMeta($qty18, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt18_META = createCommonMeta($amt18, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std18_META = createCommonMeta($std18, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty19_META = createCommonMeta($qty19, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt19_META = createCommonMeta($amt19, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std19_META = createCommonMeta($std19, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty20_META = createCommonMeta($qty20, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt20_META = createCommonMeta($amt20, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std20_META = createCommonMeta($std20, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty21_META = createCommonMeta($qty21, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt21_META = createCommonMeta($amt21, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std21_META = createCommonMeta($std21, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty22_META = createCommonMeta($qty22, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt22_META = createCommonMeta($amt22, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std22_META = createCommonMeta($std22, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty23_META = createCommonMeta($qty23, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt23_META = createCommonMeta($amt23, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std23_META = createCommonMeta($std23, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty24_META = createCommonMeta($qty24, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt24_META = createCommonMeta($amt24, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std24_META = createCommonMeta($std24, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty25_META = createCommonMeta($qty25, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt25_META = createCommonMeta($amt25, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std25_META = createCommonMeta($std25, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty26_META = createCommonMeta($qty26, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt26_META = createCommonMeta($amt26, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std26_META = createCommonMeta($std26, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty27_META = createCommonMeta($qty27, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt27_META = createCommonMeta($amt27, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std27_META = createCommonMeta($std27, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty28_META = createCommonMeta($qty28, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt28_META = createCommonMeta($amt28, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std28_META = createCommonMeta($std28, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty29_META = createCommonMeta($qty29, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt29_META = createCommonMeta($amt29, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std29_META = createCommonMeta($std29, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty30_META = createCommonMeta($qty30, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt30_META = createCommonMeta($amt30, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std30_META = createCommonMeta($std30, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_qty_META = createCommonMeta($diff_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta diff_amt_META = createCommonMeta($diff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_std_META = createCommonMeta($diff_std, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ave_tgt_META = createCommonMeta($ave_tgt, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dummy_term_META,
			calc_grp_cd_META,
			calc_no_META,
			ym_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			itm_grp_nm1_META,
			itm_grp_nm2_META,
			itm_grp_nm3_META,
			itm_grp_nm4_META,
			itm_grp_nm5_META,
			itm_grp_nm6_META,
			itm_grp_nm7_META,
			itm_grp_nm8_META,
			itm_grp_nm9_META,
			itm_grp_nm10_META,
			wg_cd_META,
			wg_nm_META,
			bp_cd_META,
			bp_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			qty01_META,
			amt01_META,
			std01_META,
			qty02_META,
			amt02_META,
			std02_META,
			qty03_META,
			amt03_META,
			std03_META,
			qty04_META,
			amt04_META,
			std04_META,
			qty05_META,
			amt05_META,
			std05_META,
			qty06_META,
			amt06_META,
			std06_META,
			qty07_META,
			amt07_META,
			std07_META,
			qty08_META,
			amt08_META,
			std08_META,
			qty09_META,
			amt09_META,
			std09_META,
			qty10_META,
			amt10_META,
			std10_META,
			qty11_META,
			amt11_META,
			std11_META,
			qty12_META,
			amt12_META,
			std12_META,
			qty13_META,
			amt13_META,
			std13_META,
			qty14_META,
			amt14_META,
			std14_META,
			qty15_META,
			amt15_META,
			std15_META,
			qty16_META,
			amt16_META,
			std16_META,
			qty17_META,
			amt17_META,
			std17_META,
			qty18_META,
			amt18_META,
			std18_META,
			qty19_META,
			amt19_META,
			std19_META,
			qty20_META,
			amt20_META,
			std20_META,
			qty21_META,
			amt21_META,
			std21_META,
			qty22_META,
			amt22_META,
			std22_META,
			qty23_META,
			amt23_META,
			std23_META,
			qty24_META,
			amt24_META,
			std24_META,
			qty25_META,
			amt25_META,
			std25_META,
			qty26_META,
			amt26_META,
			std26_META,
			qty27_META,
			amt27_META,
			std27_META,
			qty28_META,
			amt28_META,
			std28_META,
			qty29_META,
			amt29_META,
			std29_META,
			qty30_META,
			amt30_META,
			std30_META,
			diff_qty_META,
			diff_amt_META,
			diff_std_META,
			ave_tgt_META
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
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 3, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 3, $ym, value);
	}


	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 4, $mng_dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 4, $mng_dpt_cd, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 5, $mng_dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 5, $mng_dpt_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 6, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 6, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 7, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 7, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 8, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 8, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 9, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 9, $itm_typ_d_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 10, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 10, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 11, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 11, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 12, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 12, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 13, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 13, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 14, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 14, $itm_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 15, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 15, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 16, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 16, $itm_jnl_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 17, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 17, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 18, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 18, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 19, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 19, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 20, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 20, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 21, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 21, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 22, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 22, $sno4, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 23, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 23, $itm_grp_nm1, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 24, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 24, $itm_grp_nm2, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 25, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 25, $itm_grp_nm3, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 26, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 26, $itm_grp_nm4, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 27, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 27, $itm_grp_nm5, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 28, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 28, $itm_grp_nm6, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 29, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 29, $itm_grp_nm7, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 30, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 30, $itm_grp_nm8, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 31, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 31, $itm_grp_nm9, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 32, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 32, $itm_grp_nm10, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 33, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 33, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 34, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 34, $wg_nm, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 35, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 35, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 36, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 36, $bp_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 37, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 37, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 38, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 38, $asst_typ_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 39, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 39, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 40, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 40, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 41, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 41, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 41, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 41, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 41, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 41, $dec_place, value);
	}


	/**
	 * Quantity 01 数量０１.<p>
	 *
	 */
	public MCNumber qty01() {
		return getConstNumber(offset + 42, $qty01);
	}

	/**
	 * Quantity 01 数量０１.<p>
	 *
	 */
	public void qty01(MCNumber value) {
		setConstNumber(offset + 42, $qty01, value);
	}

	/**
	 * Quantity 01 数量０１.<p>
	 *
	 */
	public void qty01(int value) {
		setConstNumber(offset + 42, $qty01, value);
	}

	/**
	 * Quantity 01 数量０１.<p>
	 *
	 */
	public void qty01(long value) {
		setConstNumber(offset + 42, $qty01, value);
	}

	/**
	 * Quantity 01 数量０１.<p>
	 *
	 */
	public void qty01(float value) {
		setConstNumber(offset + 42, $qty01, value);
	}

	/**
	 * Quantity 01 数量０１.<p>
	 *
	 */
	public void qty01(double value) {
		setConstNumber(offset + 42, $qty01, value);
	}


	/**
	 * Amount 01 金額０１.<p>
	 *
	 */
	public MCNumber amt01() {
		return getConstNumber(offset + 43, $amt01);
	}

	/**
	 * Amount 01 金額０１.<p>
	 *
	 */
	public void amt01(MCNumber value) {
		setConstNumber(offset + 43, $amt01, value);
	}

	/**
	 * Amount 01 金額０１.<p>
	 *
	 */
	public void amt01(int value) {
		setConstNumber(offset + 43, $amt01, value);
	}

	/**
	 * Amount 01 金額０１.<p>
	 *
	 */
	public void amt01(long value) {
		setConstNumber(offset + 43, $amt01, value);
	}

	/**
	 * Amount 01 金額０１.<p>
	 *
	 */
	public void amt01(float value) {
		setConstNumber(offset + 43, $amt01, value);
	}

	/**
	 * Amount 01 金額０１.<p>
	 *
	 */
	public void amt01(double value) {
		setConstNumber(offset + 43, $amt01, value);
	}


	/**
	 * Standard 01 標準０１.<p>
	 *
	 */
	public MCNumber std01() {
		return getConstNumber(offset + 44, $std01);
	}

	/**
	 * Standard 01 標準０１.<p>
	 *
	 */
	public void std01(MCNumber value) {
		setConstNumber(offset + 44, $std01, value);
	}

	/**
	 * Standard 01 標準０１.<p>
	 *
	 */
	public void std01(int value) {
		setConstNumber(offset + 44, $std01, value);
	}

	/**
	 * Standard 01 標準０１.<p>
	 *
	 */
	public void std01(long value) {
		setConstNumber(offset + 44, $std01, value);
	}

	/**
	 * Standard 01 標準０１.<p>
	 *
	 */
	public void std01(float value) {
		setConstNumber(offset + 44, $std01, value);
	}

	/**
	 * Standard 01 標準０１.<p>
	 *
	 */
	public void std01(double value) {
		setConstNumber(offset + 44, $std01, value);
	}


	/**
	 * Quantity 02 数量０２.<p>
	 *
	 */
	public MCNumber qty02() {
		return getConstNumber(offset + 45, $qty02);
	}

	/**
	 * Quantity 02 数量０２.<p>
	 *
	 */
	public void qty02(MCNumber value) {
		setConstNumber(offset + 45, $qty02, value);
	}

	/**
	 * Quantity 02 数量０２.<p>
	 *
	 */
	public void qty02(int value) {
		setConstNumber(offset + 45, $qty02, value);
	}

	/**
	 * Quantity 02 数量０２.<p>
	 *
	 */
	public void qty02(long value) {
		setConstNumber(offset + 45, $qty02, value);
	}

	/**
	 * Quantity 02 数量０２.<p>
	 *
	 */
	public void qty02(float value) {
		setConstNumber(offset + 45, $qty02, value);
	}

	/**
	 * Quantity 02 数量０２.<p>
	 *
	 */
	public void qty02(double value) {
		setConstNumber(offset + 45, $qty02, value);
	}


	/**
	 * Amount 02 金額０２.<p>
	 *
	 */
	public MCNumber amt02() {
		return getConstNumber(offset + 46, $amt02);
	}

	/**
	 * Amount 02 金額０２.<p>
	 *
	 */
	public void amt02(MCNumber value) {
		setConstNumber(offset + 46, $amt02, value);
	}

	/**
	 * Amount 02 金額０２.<p>
	 *
	 */
	public void amt02(int value) {
		setConstNumber(offset + 46, $amt02, value);
	}

	/**
	 * Amount 02 金額０２.<p>
	 *
	 */
	public void amt02(long value) {
		setConstNumber(offset + 46, $amt02, value);
	}

	/**
	 * Amount 02 金額０２.<p>
	 *
	 */
	public void amt02(float value) {
		setConstNumber(offset + 46, $amt02, value);
	}

	/**
	 * Amount 02 金額０２.<p>
	 *
	 */
	public void amt02(double value) {
		setConstNumber(offset + 46, $amt02, value);
	}


	/**
	 * Standard 02 標準０２.<p>
	 *
	 */
	public MCNumber std02() {
		return getConstNumber(offset + 47, $std02);
	}

	/**
	 * Standard 02 標準０２.<p>
	 *
	 */
	public void std02(MCNumber value) {
		setConstNumber(offset + 47, $std02, value);
	}

	/**
	 * Standard 02 標準０２.<p>
	 *
	 */
	public void std02(int value) {
		setConstNumber(offset + 47, $std02, value);
	}

	/**
	 * Standard 02 標準０２.<p>
	 *
	 */
	public void std02(long value) {
		setConstNumber(offset + 47, $std02, value);
	}

	/**
	 * Standard 02 標準０２.<p>
	 *
	 */
	public void std02(float value) {
		setConstNumber(offset + 47, $std02, value);
	}

	/**
	 * Standard 02 標準０２.<p>
	 *
	 */
	public void std02(double value) {
		setConstNumber(offset + 47, $std02, value);
	}


	/**
	 * Quantity 03 数量０３.<p>
	 *
	 */
	public MCNumber qty03() {
		return getConstNumber(offset + 48, $qty03);
	}

	/**
	 * Quantity 03 数量０３.<p>
	 *
	 */
	public void qty03(MCNumber value) {
		setConstNumber(offset + 48, $qty03, value);
	}

	/**
	 * Quantity 03 数量０３.<p>
	 *
	 */
	public void qty03(int value) {
		setConstNumber(offset + 48, $qty03, value);
	}

	/**
	 * Quantity 03 数量０３.<p>
	 *
	 */
	public void qty03(long value) {
		setConstNumber(offset + 48, $qty03, value);
	}

	/**
	 * Quantity 03 数量０３.<p>
	 *
	 */
	public void qty03(float value) {
		setConstNumber(offset + 48, $qty03, value);
	}

	/**
	 * Quantity 03 数量０３.<p>
	 *
	 */
	public void qty03(double value) {
		setConstNumber(offset + 48, $qty03, value);
	}


	/**
	 * Amount 03 金額０３.<p>
	 *
	 */
	public MCNumber amt03() {
		return getConstNumber(offset + 49, $amt03);
	}

	/**
	 * Amount 03 金額０３.<p>
	 *
	 */
	public void amt03(MCNumber value) {
		setConstNumber(offset + 49, $amt03, value);
	}

	/**
	 * Amount 03 金額０３.<p>
	 *
	 */
	public void amt03(int value) {
		setConstNumber(offset + 49, $amt03, value);
	}

	/**
	 * Amount 03 金額０３.<p>
	 *
	 */
	public void amt03(long value) {
		setConstNumber(offset + 49, $amt03, value);
	}

	/**
	 * Amount 03 金額０３.<p>
	 *
	 */
	public void amt03(float value) {
		setConstNumber(offset + 49, $amt03, value);
	}

	/**
	 * Amount 03 金額０３.<p>
	 *
	 */
	public void amt03(double value) {
		setConstNumber(offset + 49, $amt03, value);
	}


	/**
	 * Standard 03 標準０３.<p>
	 *
	 */
	public MCNumber std03() {
		return getConstNumber(offset + 50, $std03);
	}

	/**
	 * Standard 03 標準０３.<p>
	 *
	 */
	public void std03(MCNumber value) {
		setConstNumber(offset + 50, $std03, value);
	}

	/**
	 * Standard 03 標準０３.<p>
	 *
	 */
	public void std03(int value) {
		setConstNumber(offset + 50, $std03, value);
	}

	/**
	 * Standard 03 標準０３.<p>
	 *
	 */
	public void std03(long value) {
		setConstNumber(offset + 50, $std03, value);
	}

	/**
	 * Standard 03 標準０３.<p>
	 *
	 */
	public void std03(float value) {
		setConstNumber(offset + 50, $std03, value);
	}

	/**
	 * Standard 03 標準０３.<p>
	 *
	 */
	public void std03(double value) {
		setConstNumber(offset + 50, $std03, value);
	}


	/**
	 * Quantity 04 数量０４.<p>
	 *
	 */
	public MCNumber qty04() {
		return getConstNumber(offset + 51, $qty04);
	}

	/**
	 * Quantity 04 数量０４.<p>
	 *
	 */
	public void qty04(MCNumber value) {
		setConstNumber(offset + 51, $qty04, value);
	}

	/**
	 * Quantity 04 数量０４.<p>
	 *
	 */
	public void qty04(int value) {
		setConstNumber(offset + 51, $qty04, value);
	}

	/**
	 * Quantity 04 数量０４.<p>
	 *
	 */
	public void qty04(long value) {
		setConstNumber(offset + 51, $qty04, value);
	}

	/**
	 * Quantity 04 数量０４.<p>
	 *
	 */
	public void qty04(float value) {
		setConstNumber(offset + 51, $qty04, value);
	}

	/**
	 * Quantity 04 数量０４.<p>
	 *
	 */
	public void qty04(double value) {
		setConstNumber(offset + 51, $qty04, value);
	}


	/**
	 * Amount 04 金額０４.<p>
	 *
	 */
	public MCNumber amt04() {
		return getConstNumber(offset + 52, $amt04);
	}

	/**
	 * Amount 04 金額０４.<p>
	 *
	 */
	public void amt04(MCNumber value) {
		setConstNumber(offset + 52, $amt04, value);
	}

	/**
	 * Amount 04 金額０４.<p>
	 *
	 */
	public void amt04(int value) {
		setConstNumber(offset + 52, $amt04, value);
	}

	/**
	 * Amount 04 金額０４.<p>
	 *
	 */
	public void amt04(long value) {
		setConstNumber(offset + 52, $amt04, value);
	}

	/**
	 * Amount 04 金額０４.<p>
	 *
	 */
	public void amt04(float value) {
		setConstNumber(offset + 52, $amt04, value);
	}

	/**
	 * Amount 04 金額０４.<p>
	 *
	 */
	public void amt04(double value) {
		setConstNumber(offset + 52, $amt04, value);
	}


	/**
	 * Standard 04 標準０４.<p>
	 *
	 */
	public MCNumber std04() {
		return getConstNumber(offset + 53, $std04);
	}

	/**
	 * Standard 04 標準０４.<p>
	 *
	 */
	public void std04(MCNumber value) {
		setConstNumber(offset + 53, $std04, value);
	}

	/**
	 * Standard 04 標準０４.<p>
	 *
	 */
	public void std04(int value) {
		setConstNumber(offset + 53, $std04, value);
	}

	/**
	 * Standard 04 標準０４.<p>
	 *
	 */
	public void std04(long value) {
		setConstNumber(offset + 53, $std04, value);
	}

	/**
	 * Standard 04 標準０４.<p>
	 *
	 */
	public void std04(float value) {
		setConstNumber(offset + 53, $std04, value);
	}

	/**
	 * Standard 04 標準０４.<p>
	 *
	 */
	public void std04(double value) {
		setConstNumber(offset + 53, $std04, value);
	}


	/**
	 * Quantity 05 数量０５.<p>
	 *
	 */
	public MCNumber qty05() {
		return getConstNumber(offset + 54, $qty05);
	}

	/**
	 * Quantity 05 数量０５.<p>
	 *
	 */
	public void qty05(MCNumber value) {
		setConstNumber(offset + 54, $qty05, value);
	}

	/**
	 * Quantity 05 数量０５.<p>
	 *
	 */
	public void qty05(int value) {
		setConstNumber(offset + 54, $qty05, value);
	}

	/**
	 * Quantity 05 数量０５.<p>
	 *
	 */
	public void qty05(long value) {
		setConstNumber(offset + 54, $qty05, value);
	}

	/**
	 * Quantity 05 数量０５.<p>
	 *
	 */
	public void qty05(float value) {
		setConstNumber(offset + 54, $qty05, value);
	}

	/**
	 * Quantity 05 数量０５.<p>
	 *
	 */
	public void qty05(double value) {
		setConstNumber(offset + 54, $qty05, value);
	}


	/**
	 * Amount 05 金額０５.<p>
	 *
	 */
	public MCNumber amt05() {
		return getConstNumber(offset + 55, $amt05);
	}

	/**
	 * Amount 05 金額０５.<p>
	 *
	 */
	public void amt05(MCNumber value) {
		setConstNumber(offset + 55, $amt05, value);
	}

	/**
	 * Amount 05 金額０５.<p>
	 *
	 */
	public void amt05(int value) {
		setConstNumber(offset + 55, $amt05, value);
	}

	/**
	 * Amount 05 金額０５.<p>
	 *
	 */
	public void amt05(long value) {
		setConstNumber(offset + 55, $amt05, value);
	}

	/**
	 * Amount 05 金額０５.<p>
	 *
	 */
	public void amt05(float value) {
		setConstNumber(offset + 55, $amt05, value);
	}

	/**
	 * Amount 05 金額０５.<p>
	 *
	 */
	public void amt05(double value) {
		setConstNumber(offset + 55, $amt05, value);
	}


	/**
	 * Standard 05 標準０５.<p>
	 *
	 */
	public MCNumber std05() {
		return getConstNumber(offset + 56, $std05);
	}

	/**
	 * Standard 05 標準０５.<p>
	 *
	 */
	public void std05(MCNumber value) {
		setConstNumber(offset + 56, $std05, value);
	}

	/**
	 * Standard 05 標準０５.<p>
	 *
	 */
	public void std05(int value) {
		setConstNumber(offset + 56, $std05, value);
	}

	/**
	 * Standard 05 標準０５.<p>
	 *
	 */
	public void std05(long value) {
		setConstNumber(offset + 56, $std05, value);
	}

	/**
	 * Standard 05 標準０５.<p>
	 *
	 */
	public void std05(float value) {
		setConstNumber(offset + 56, $std05, value);
	}

	/**
	 * Standard 05 標準０５.<p>
	 *
	 */
	public void std05(double value) {
		setConstNumber(offset + 56, $std05, value);
	}


	/**
	 * Quantity 06 数量０６.<p>
	 *
	 */
	public MCNumber qty06() {
		return getConstNumber(offset + 57, $qty06);
	}

	/**
	 * Quantity 06 数量０６.<p>
	 *
	 */
	public void qty06(MCNumber value) {
		setConstNumber(offset + 57, $qty06, value);
	}

	/**
	 * Quantity 06 数量０６.<p>
	 *
	 */
	public void qty06(int value) {
		setConstNumber(offset + 57, $qty06, value);
	}

	/**
	 * Quantity 06 数量０６.<p>
	 *
	 */
	public void qty06(long value) {
		setConstNumber(offset + 57, $qty06, value);
	}

	/**
	 * Quantity 06 数量０６.<p>
	 *
	 */
	public void qty06(float value) {
		setConstNumber(offset + 57, $qty06, value);
	}

	/**
	 * Quantity 06 数量０６.<p>
	 *
	 */
	public void qty06(double value) {
		setConstNumber(offset + 57, $qty06, value);
	}


	/**
	 * Amount 06 金額０６.<p>
	 *
	 */
	public MCNumber amt06() {
		return getConstNumber(offset + 58, $amt06);
	}

	/**
	 * Amount 06 金額０６.<p>
	 *
	 */
	public void amt06(MCNumber value) {
		setConstNumber(offset + 58, $amt06, value);
	}

	/**
	 * Amount 06 金額０６.<p>
	 *
	 */
	public void amt06(int value) {
		setConstNumber(offset + 58, $amt06, value);
	}

	/**
	 * Amount 06 金額０６.<p>
	 *
	 */
	public void amt06(long value) {
		setConstNumber(offset + 58, $amt06, value);
	}

	/**
	 * Amount 06 金額０６.<p>
	 *
	 */
	public void amt06(float value) {
		setConstNumber(offset + 58, $amt06, value);
	}

	/**
	 * Amount 06 金額０６.<p>
	 *
	 */
	public void amt06(double value) {
		setConstNumber(offset + 58, $amt06, value);
	}


	/**
	 * Standard 06 標準０６.<p>
	 *
	 */
	public MCNumber std06() {
		return getConstNumber(offset + 59, $std06);
	}

	/**
	 * Standard 06 標準０６.<p>
	 *
	 */
	public void std06(MCNumber value) {
		setConstNumber(offset + 59, $std06, value);
	}

	/**
	 * Standard 06 標準０６.<p>
	 *
	 */
	public void std06(int value) {
		setConstNumber(offset + 59, $std06, value);
	}

	/**
	 * Standard 06 標準０６.<p>
	 *
	 */
	public void std06(long value) {
		setConstNumber(offset + 59, $std06, value);
	}

	/**
	 * Standard 06 標準０６.<p>
	 *
	 */
	public void std06(float value) {
		setConstNumber(offset + 59, $std06, value);
	}

	/**
	 * Standard 06 標準０６.<p>
	 *
	 */
	public void std06(double value) {
		setConstNumber(offset + 59, $std06, value);
	}


	/**
	 * Quantity 07 数量０７.<p>
	 *
	 */
	public MCNumber qty07() {
		return getConstNumber(offset + 60, $qty07);
	}

	/**
	 * Quantity 07 数量０７.<p>
	 *
	 */
	public void qty07(MCNumber value) {
		setConstNumber(offset + 60, $qty07, value);
	}

	/**
	 * Quantity 07 数量０７.<p>
	 *
	 */
	public void qty07(int value) {
		setConstNumber(offset + 60, $qty07, value);
	}

	/**
	 * Quantity 07 数量０７.<p>
	 *
	 */
	public void qty07(long value) {
		setConstNumber(offset + 60, $qty07, value);
	}

	/**
	 * Quantity 07 数量０７.<p>
	 *
	 */
	public void qty07(float value) {
		setConstNumber(offset + 60, $qty07, value);
	}

	/**
	 * Quantity 07 数量０７.<p>
	 *
	 */
	public void qty07(double value) {
		setConstNumber(offset + 60, $qty07, value);
	}


	/**
	 * Amount 07 金額０７.<p>
	 *
	 */
	public MCNumber amt07() {
		return getConstNumber(offset + 61, $amt07);
	}

	/**
	 * Amount 07 金額０７.<p>
	 *
	 */
	public void amt07(MCNumber value) {
		setConstNumber(offset + 61, $amt07, value);
	}

	/**
	 * Amount 07 金額０７.<p>
	 *
	 */
	public void amt07(int value) {
		setConstNumber(offset + 61, $amt07, value);
	}

	/**
	 * Amount 07 金額０７.<p>
	 *
	 */
	public void amt07(long value) {
		setConstNumber(offset + 61, $amt07, value);
	}

	/**
	 * Amount 07 金額０７.<p>
	 *
	 */
	public void amt07(float value) {
		setConstNumber(offset + 61, $amt07, value);
	}

	/**
	 * Amount 07 金額０７.<p>
	 *
	 */
	public void amt07(double value) {
		setConstNumber(offset + 61, $amt07, value);
	}


	/**
	 * Standard 07 標準０７.<p>
	 *
	 */
	public MCNumber std07() {
		return getConstNumber(offset + 62, $std07);
	}

	/**
	 * Standard 07 標準０７.<p>
	 *
	 */
	public void std07(MCNumber value) {
		setConstNumber(offset + 62, $std07, value);
	}

	/**
	 * Standard 07 標準０７.<p>
	 *
	 */
	public void std07(int value) {
		setConstNumber(offset + 62, $std07, value);
	}

	/**
	 * Standard 07 標準０７.<p>
	 *
	 */
	public void std07(long value) {
		setConstNumber(offset + 62, $std07, value);
	}

	/**
	 * Standard 07 標準０７.<p>
	 *
	 */
	public void std07(float value) {
		setConstNumber(offset + 62, $std07, value);
	}

	/**
	 * Standard 07 標準０７.<p>
	 *
	 */
	public void std07(double value) {
		setConstNumber(offset + 62, $std07, value);
	}


	/**
	 * Quantity 08 数量０８.<p>
	 *
	 */
	public MCNumber qty08() {
		return getConstNumber(offset + 63, $qty08);
	}

	/**
	 * Quantity 08 数量０８.<p>
	 *
	 */
	public void qty08(MCNumber value) {
		setConstNumber(offset + 63, $qty08, value);
	}

	/**
	 * Quantity 08 数量０８.<p>
	 *
	 */
	public void qty08(int value) {
		setConstNumber(offset + 63, $qty08, value);
	}

	/**
	 * Quantity 08 数量０８.<p>
	 *
	 */
	public void qty08(long value) {
		setConstNumber(offset + 63, $qty08, value);
	}

	/**
	 * Quantity 08 数量０８.<p>
	 *
	 */
	public void qty08(float value) {
		setConstNumber(offset + 63, $qty08, value);
	}

	/**
	 * Quantity 08 数量０８.<p>
	 *
	 */
	public void qty08(double value) {
		setConstNumber(offset + 63, $qty08, value);
	}


	/**
	 * Amount 08 金額０８.<p>
	 *
	 */
	public MCNumber amt08() {
		return getConstNumber(offset + 64, $amt08);
	}

	/**
	 * Amount 08 金額０８.<p>
	 *
	 */
	public void amt08(MCNumber value) {
		setConstNumber(offset + 64, $amt08, value);
	}

	/**
	 * Amount 08 金額０８.<p>
	 *
	 */
	public void amt08(int value) {
		setConstNumber(offset + 64, $amt08, value);
	}

	/**
	 * Amount 08 金額０８.<p>
	 *
	 */
	public void amt08(long value) {
		setConstNumber(offset + 64, $amt08, value);
	}

	/**
	 * Amount 08 金額０８.<p>
	 *
	 */
	public void amt08(float value) {
		setConstNumber(offset + 64, $amt08, value);
	}

	/**
	 * Amount 08 金額０８.<p>
	 *
	 */
	public void amt08(double value) {
		setConstNumber(offset + 64, $amt08, value);
	}


	/**
	 * Standard 08 標準０８.<p>
	 *
	 */
	public MCNumber std08() {
		return getConstNumber(offset + 65, $std08);
	}

	/**
	 * Standard 08 標準０８.<p>
	 *
	 */
	public void std08(MCNumber value) {
		setConstNumber(offset + 65, $std08, value);
	}

	/**
	 * Standard 08 標準０８.<p>
	 *
	 */
	public void std08(int value) {
		setConstNumber(offset + 65, $std08, value);
	}

	/**
	 * Standard 08 標準０８.<p>
	 *
	 */
	public void std08(long value) {
		setConstNumber(offset + 65, $std08, value);
	}

	/**
	 * Standard 08 標準０８.<p>
	 *
	 */
	public void std08(float value) {
		setConstNumber(offset + 65, $std08, value);
	}

	/**
	 * Standard 08 標準０８.<p>
	 *
	 */
	public void std08(double value) {
		setConstNumber(offset + 65, $std08, value);
	}


	/**
	 * Quantity 09 数量０９.<p>
	 *
	 */
	public MCNumber qty09() {
		return getConstNumber(offset + 66, $qty09);
	}

	/**
	 * Quantity 09 数量０９.<p>
	 *
	 */
	public void qty09(MCNumber value) {
		setConstNumber(offset + 66, $qty09, value);
	}

	/**
	 * Quantity 09 数量０９.<p>
	 *
	 */
	public void qty09(int value) {
		setConstNumber(offset + 66, $qty09, value);
	}

	/**
	 * Quantity 09 数量０９.<p>
	 *
	 */
	public void qty09(long value) {
		setConstNumber(offset + 66, $qty09, value);
	}

	/**
	 * Quantity 09 数量０９.<p>
	 *
	 */
	public void qty09(float value) {
		setConstNumber(offset + 66, $qty09, value);
	}

	/**
	 * Quantity 09 数量０９.<p>
	 *
	 */
	public void qty09(double value) {
		setConstNumber(offset + 66, $qty09, value);
	}


	/**
	 * Amount 09 金額０９.<p>
	 *
	 */
	public MCNumber amt09() {
		return getConstNumber(offset + 67, $amt09);
	}

	/**
	 * Amount 09 金額０９.<p>
	 *
	 */
	public void amt09(MCNumber value) {
		setConstNumber(offset + 67, $amt09, value);
	}

	/**
	 * Amount 09 金額０９.<p>
	 *
	 */
	public void amt09(int value) {
		setConstNumber(offset + 67, $amt09, value);
	}

	/**
	 * Amount 09 金額０９.<p>
	 *
	 */
	public void amt09(long value) {
		setConstNumber(offset + 67, $amt09, value);
	}

	/**
	 * Amount 09 金額０９.<p>
	 *
	 */
	public void amt09(float value) {
		setConstNumber(offset + 67, $amt09, value);
	}

	/**
	 * Amount 09 金額０９.<p>
	 *
	 */
	public void amt09(double value) {
		setConstNumber(offset + 67, $amt09, value);
	}


	/**
	 * Standard 09 標準０９.<p>
	 *
	 */
	public MCNumber std09() {
		return getConstNumber(offset + 68, $std09);
	}

	/**
	 * Standard 09 標準０９.<p>
	 *
	 */
	public void std09(MCNumber value) {
		setConstNumber(offset + 68, $std09, value);
	}

	/**
	 * Standard 09 標準０９.<p>
	 *
	 */
	public void std09(int value) {
		setConstNumber(offset + 68, $std09, value);
	}

	/**
	 * Standard 09 標準０９.<p>
	 *
	 */
	public void std09(long value) {
		setConstNumber(offset + 68, $std09, value);
	}

	/**
	 * Standard 09 標準０９.<p>
	 *
	 */
	public void std09(float value) {
		setConstNumber(offset + 68, $std09, value);
	}

	/**
	 * Standard 09 標準０９.<p>
	 *
	 */
	public void std09(double value) {
		setConstNumber(offset + 68, $std09, value);
	}


	/**
	 * Quantity 10 数量１０.<p>
	 *
	 */
	public MCNumber qty10() {
		return getConstNumber(offset + 69, $qty10);
	}

	/**
	 * Quantity 10 数量１０.<p>
	 *
	 */
	public void qty10(MCNumber value) {
		setConstNumber(offset + 69, $qty10, value);
	}

	/**
	 * Quantity 10 数量１０.<p>
	 *
	 */
	public void qty10(int value) {
		setConstNumber(offset + 69, $qty10, value);
	}

	/**
	 * Quantity 10 数量１０.<p>
	 *
	 */
	public void qty10(long value) {
		setConstNumber(offset + 69, $qty10, value);
	}

	/**
	 * Quantity 10 数量１０.<p>
	 *
	 */
	public void qty10(float value) {
		setConstNumber(offset + 69, $qty10, value);
	}

	/**
	 * Quantity 10 数量１０.<p>
	 *
	 */
	public void qty10(double value) {
		setConstNumber(offset + 69, $qty10, value);
	}


	/**
	 * Amount 10 金額１０.<p>
	 *
	 */
	public MCNumber amt10() {
		return getConstNumber(offset + 70, $amt10);
	}

	/**
	 * Amount 10 金額１０.<p>
	 *
	 */
	public void amt10(MCNumber value) {
		setConstNumber(offset + 70, $amt10, value);
	}

	/**
	 * Amount 10 金額１０.<p>
	 *
	 */
	public void amt10(int value) {
		setConstNumber(offset + 70, $amt10, value);
	}

	/**
	 * Amount 10 金額１０.<p>
	 *
	 */
	public void amt10(long value) {
		setConstNumber(offset + 70, $amt10, value);
	}

	/**
	 * Amount 10 金額１０.<p>
	 *
	 */
	public void amt10(float value) {
		setConstNumber(offset + 70, $amt10, value);
	}

	/**
	 * Amount 10 金額１０.<p>
	 *
	 */
	public void amt10(double value) {
		setConstNumber(offset + 70, $amt10, value);
	}


	/**
	 * Standard 10 標準１０.<p>
	 *
	 */
	public MCNumber std10() {
		return getConstNumber(offset + 71, $std10);
	}

	/**
	 * Standard 10 標準１０.<p>
	 *
	 */
	public void std10(MCNumber value) {
		setConstNumber(offset + 71, $std10, value);
	}

	/**
	 * Standard 10 標準１０.<p>
	 *
	 */
	public void std10(int value) {
		setConstNumber(offset + 71, $std10, value);
	}

	/**
	 * Standard 10 標準１０.<p>
	 *
	 */
	public void std10(long value) {
		setConstNumber(offset + 71, $std10, value);
	}

	/**
	 * Standard 10 標準１０.<p>
	 *
	 */
	public void std10(float value) {
		setConstNumber(offset + 71, $std10, value);
	}

	/**
	 * Standard 10 標準１０.<p>
	 *
	 */
	public void std10(double value) {
		setConstNumber(offset + 71, $std10, value);
	}


	/**
	 * Quantity 11 数量１１.<p>
	 *
	 */
	public MCNumber qty11() {
		return getConstNumber(offset + 72, $qty11);
	}

	/**
	 * Quantity 11 数量１１.<p>
	 *
	 */
	public void qty11(MCNumber value) {
		setConstNumber(offset + 72, $qty11, value);
	}

	/**
	 * Quantity 11 数量１１.<p>
	 *
	 */
	public void qty11(int value) {
		setConstNumber(offset + 72, $qty11, value);
	}

	/**
	 * Quantity 11 数量１１.<p>
	 *
	 */
	public void qty11(long value) {
		setConstNumber(offset + 72, $qty11, value);
	}

	/**
	 * Quantity 11 数量１１.<p>
	 *
	 */
	public void qty11(float value) {
		setConstNumber(offset + 72, $qty11, value);
	}

	/**
	 * Quantity 11 数量１１.<p>
	 *
	 */
	public void qty11(double value) {
		setConstNumber(offset + 72, $qty11, value);
	}


	/**
	 * Amount 11 金額１１.<p>
	 *
	 */
	public MCNumber amt11() {
		return getConstNumber(offset + 73, $amt11);
	}

	/**
	 * Amount 11 金額１１.<p>
	 *
	 */
	public void amt11(MCNumber value) {
		setConstNumber(offset + 73, $amt11, value);
	}

	/**
	 * Amount 11 金額１１.<p>
	 *
	 */
	public void amt11(int value) {
		setConstNumber(offset + 73, $amt11, value);
	}

	/**
	 * Amount 11 金額１１.<p>
	 *
	 */
	public void amt11(long value) {
		setConstNumber(offset + 73, $amt11, value);
	}

	/**
	 * Amount 11 金額１１.<p>
	 *
	 */
	public void amt11(float value) {
		setConstNumber(offset + 73, $amt11, value);
	}

	/**
	 * Amount 11 金額１１.<p>
	 *
	 */
	public void amt11(double value) {
		setConstNumber(offset + 73, $amt11, value);
	}


	/**
	 * Standard 11 標準１１.<p>
	 *
	 */
	public MCNumber std11() {
		return getConstNumber(offset + 74, $std11);
	}

	/**
	 * Standard 11 標準１１.<p>
	 *
	 */
	public void std11(MCNumber value) {
		setConstNumber(offset + 74, $std11, value);
	}

	/**
	 * Standard 11 標準１１.<p>
	 *
	 */
	public void std11(int value) {
		setConstNumber(offset + 74, $std11, value);
	}

	/**
	 * Standard 11 標準１１.<p>
	 *
	 */
	public void std11(long value) {
		setConstNumber(offset + 74, $std11, value);
	}

	/**
	 * Standard 11 標準１１.<p>
	 *
	 */
	public void std11(float value) {
		setConstNumber(offset + 74, $std11, value);
	}

	/**
	 * Standard 11 標準１１.<p>
	 *
	 */
	public void std11(double value) {
		setConstNumber(offset + 74, $std11, value);
	}


	/**
	 * Quantity 12 数量１２.<p>
	 *
	 */
	public MCNumber qty12() {
		return getConstNumber(offset + 75, $qty12);
	}

	/**
	 * Quantity 12 数量１２.<p>
	 *
	 */
	public void qty12(MCNumber value) {
		setConstNumber(offset + 75, $qty12, value);
	}

	/**
	 * Quantity 12 数量１２.<p>
	 *
	 */
	public void qty12(int value) {
		setConstNumber(offset + 75, $qty12, value);
	}

	/**
	 * Quantity 12 数量１２.<p>
	 *
	 */
	public void qty12(long value) {
		setConstNumber(offset + 75, $qty12, value);
	}

	/**
	 * Quantity 12 数量１２.<p>
	 *
	 */
	public void qty12(float value) {
		setConstNumber(offset + 75, $qty12, value);
	}

	/**
	 * Quantity 12 数量１２.<p>
	 *
	 */
	public void qty12(double value) {
		setConstNumber(offset + 75, $qty12, value);
	}


	/**
	 * Amount 12 金額１２.<p>
	 *
	 */
	public MCNumber amt12() {
		return getConstNumber(offset + 76, $amt12);
	}

	/**
	 * Amount 12 金額１２.<p>
	 *
	 */
	public void amt12(MCNumber value) {
		setConstNumber(offset + 76, $amt12, value);
	}

	/**
	 * Amount 12 金額１２.<p>
	 *
	 */
	public void amt12(int value) {
		setConstNumber(offset + 76, $amt12, value);
	}

	/**
	 * Amount 12 金額１２.<p>
	 *
	 */
	public void amt12(long value) {
		setConstNumber(offset + 76, $amt12, value);
	}

	/**
	 * Amount 12 金額１２.<p>
	 *
	 */
	public void amt12(float value) {
		setConstNumber(offset + 76, $amt12, value);
	}

	/**
	 * Amount 12 金額１２.<p>
	 *
	 */
	public void amt12(double value) {
		setConstNumber(offset + 76, $amt12, value);
	}


	/**
	 * Standard 12 標準１２.<p>
	 *
	 */
	public MCNumber std12() {
		return getConstNumber(offset + 77, $std12);
	}

	/**
	 * Standard 12 標準１２.<p>
	 *
	 */
	public void std12(MCNumber value) {
		setConstNumber(offset + 77, $std12, value);
	}

	/**
	 * Standard 12 標準１２.<p>
	 *
	 */
	public void std12(int value) {
		setConstNumber(offset + 77, $std12, value);
	}

	/**
	 * Standard 12 標準１２.<p>
	 *
	 */
	public void std12(long value) {
		setConstNumber(offset + 77, $std12, value);
	}

	/**
	 * Standard 12 標準１２.<p>
	 *
	 */
	public void std12(float value) {
		setConstNumber(offset + 77, $std12, value);
	}

	/**
	 * Standard 12 標準１２.<p>
	 *
	 */
	public void std12(double value) {
		setConstNumber(offset + 77, $std12, value);
	}


	/**
	 * Quantity 13 数量１３.<p>
	 *
	 */
	public MCNumber qty13() {
		return getConstNumber(offset + 78, $qty13);
	}

	/**
	 * Quantity 13 数量１３.<p>
	 *
	 */
	public void qty13(MCNumber value) {
		setConstNumber(offset + 78, $qty13, value);
	}

	/**
	 * Quantity 13 数量１３.<p>
	 *
	 */
	public void qty13(int value) {
		setConstNumber(offset + 78, $qty13, value);
	}

	/**
	 * Quantity 13 数量１３.<p>
	 *
	 */
	public void qty13(long value) {
		setConstNumber(offset + 78, $qty13, value);
	}

	/**
	 * Quantity 13 数量１３.<p>
	 *
	 */
	public void qty13(float value) {
		setConstNumber(offset + 78, $qty13, value);
	}

	/**
	 * Quantity 13 数量１３.<p>
	 *
	 */
	public void qty13(double value) {
		setConstNumber(offset + 78, $qty13, value);
	}


	/**
	 * Amount 13 金額１３.<p>
	 *
	 */
	public MCNumber amt13() {
		return getConstNumber(offset + 79, $amt13);
	}

	/**
	 * Amount 13 金額１３.<p>
	 *
	 */
	public void amt13(MCNumber value) {
		setConstNumber(offset + 79, $amt13, value);
	}

	/**
	 * Amount 13 金額１３.<p>
	 *
	 */
	public void amt13(int value) {
		setConstNumber(offset + 79, $amt13, value);
	}

	/**
	 * Amount 13 金額１３.<p>
	 *
	 */
	public void amt13(long value) {
		setConstNumber(offset + 79, $amt13, value);
	}

	/**
	 * Amount 13 金額１３.<p>
	 *
	 */
	public void amt13(float value) {
		setConstNumber(offset + 79, $amt13, value);
	}

	/**
	 * Amount 13 金額１３.<p>
	 *
	 */
	public void amt13(double value) {
		setConstNumber(offset + 79, $amt13, value);
	}


	/**
	 * Standard 13 標準１３.<p>
	 *
	 */
	public MCNumber std13() {
		return getConstNumber(offset + 80, $std13);
	}

	/**
	 * Standard 13 標準１３.<p>
	 *
	 */
	public void std13(MCNumber value) {
		setConstNumber(offset + 80, $std13, value);
	}

	/**
	 * Standard 13 標準１３.<p>
	 *
	 */
	public void std13(int value) {
		setConstNumber(offset + 80, $std13, value);
	}

	/**
	 * Standard 13 標準１３.<p>
	 *
	 */
	public void std13(long value) {
		setConstNumber(offset + 80, $std13, value);
	}

	/**
	 * Standard 13 標準１３.<p>
	 *
	 */
	public void std13(float value) {
		setConstNumber(offset + 80, $std13, value);
	}

	/**
	 * Standard 13 標準１３.<p>
	 *
	 */
	public void std13(double value) {
		setConstNumber(offset + 80, $std13, value);
	}


	/**
	 * Quantity 14 数量１４.<p>
	 *
	 */
	public MCNumber qty14() {
		return getConstNumber(offset + 81, $qty14);
	}

	/**
	 * Quantity 14 数量１４.<p>
	 *
	 */
	public void qty14(MCNumber value) {
		setConstNumber(offset + 81, $qty14, value);
	}

	/**
	 * Quantity 14 数量１４.<p>
	 *
	 */
	public void qty14(int value) {
		setConstNumber(offset + 81, $qty14, value);
	}

	/**
	 * Quantity 14 数量１４.<p>
	 *
	 */
	public void qty14(long value) {
		setConstNumber(offset + 81, $qty14, value);
	}

	/**
	 * Quantity 14 数量１４.<p>
	 *
	 */
	public void qty14(float value) {
		setConstNumber(offset + 81, $qty14, value);
	}

	/**
	 * Quantity 14 数量１４.<p>
	 *
	 */
	public void qty14(double value) {
		setConstNumber(offset + 81, $qty14, value);
	}


	/**
	 * Amount 14 金額１４.<p>
	 *
	 */
	public MCNumber amt14() {
		return getConstNumber(offset + 82, $amt14);
	}

	/**
	 * Amount 14 金額１４.<p>
	 *
	 */
	public void amt14(MCNumber value) {
		setConstNumber(offset + 82, $amt14, value);
	}

	/**
	 * Amount 14 金額１４.<p>
	 *
	 */
	public void amt14(int value) {
		setConstNumber(offset + 82, $amt14, value);
	}

	/**
	 * Amount 14 金額１４.<p>
	 *
	 */
	public void amt14(long value) {
		setConstNumber(offset + 82, $amt14, value);
	}

	/**
	 * Amount 14 金額１４.<p>
	 *
	 */
	public void amt14(float value) {
		setConstNumber(offset + 82, $amt14, value);
	}

	/**
	 * Amount 14 金額１４.<p>
	 *
	 */
	public void amt14(double value) {
		setConstNumber(offset + 82, $amt14, value);
	}


	/**
	 * Standard 14 標準１４.<p>
	 *
	 */
	public MCNumber std14() {
		return getConstNumber(offset + 83, $std14);
	}

	/**
	 * Standard 14 標準１４.<p>
	 *
	 */
	public void std14(MCNumber value) {
		setConstNumber(offset + 83, $std14, value);
	}

	/**
	 * Standard 14 標準１４.<p>
	 *
	 */
	public void std14(int value) {
		setConstNumber(offset + 83, $std14, value);
	}

	/**
	 * Standard 14 標準１４.<p>
	 *
	 */
	public void std14(long value) {
		setConstNumber(offset + 83, $std14, value);
	}

	/**
	 * Standard 14 標準１４.<p>
	 *
	 */
	public void std14(float value) {
		setConstNumber(offset + 83, $std14, value);
	}

	/**
	 * Standard 14 標準１４.<p>
	 *
	 */
	public void std14(double value) {
		setConstNumber(offset + 83, $std14, value);
	}


	/**
	 * Quantity 15 数量１５.<p>
	 *
	 */
	public MCNumber qty15() {
		return getConstNumber(offset + 84, $qty15);
	}

	/**
	 * Quantity 15 数量１５.<p>
	 *
	 */
	public void qty15(MCNumber value) {
		setConstNumber(offset + 84, $qty15, value);
	}

	/**
	 * Quantity 15 数量１５.<p>
	 *
	 */
	public void qty15(int value) {
		setConstNumber(offset + 84, $qty15, value);
	}

	/**
	 * Quantity 15 数量１５.<p>
	 *
	 */
	public void qty15(long value) {
		setConstNumber(offset + 84, $qty15, value);
	}

	/**
	 * Quantity 15 数量１５.<p>
	 *
	 */
	public void qty15(float value) {
		setConstNumber(offset + 84, $qty15, value);
	}

	/**
	 * Quantity 15 数量１５.<p>
	 *
	 */
	public void qty15(double value) {
		setConstNumber(offset + 84, $qty15, value);
	}


	/**
	 * Amount 15 金額１５.<p>
	 *
	 */
	public MCNumber amt15() {
		return getConstNumber(offset + 85, $amt15);
	}

	/**
	 * Amount 15 金額１５.<p>
	 *
	 */
	public void amt15(MCNumber value) {
		setConstNumber(offset + 85, $amt15, value);
	}

	/**
	 * Amount 15 金額１５.<p>
	 *
	 */
	public void amt15(int value) {
		setConstNumber(offset + 85, $amt15, value);
	}

	/**
	 * Amount 15 金額１５.<p>
	 *
	 */
	public void amt15(long value) {
		setConstNumber(offset + 85, $amt15, value);
	}

	/**
	 * Amount 15 金額１５.<p>
	 *
	 */
	public void amt15(float value) {
		setConstNumber(offset + 85, $amt15, value);
	}

	/**
	 * Amount 15 金額１５.<p>
	 *
	 */
	public void amt15(double value) {
		setConstNumber(offset + 85, $amt15, value);
	}


	/**
	 * Standard 15 標準１５.<p>
	 *
	 */
	public MCNumber std15() {
		return getConstNumber(offset + 86, $std15);
	}

	/**
	 * Standard 15 標準１５.<p>
	 *
	 */
	public void std15(MCNumber value) {
		setConstNumber(offset + 86, $std15, value);
	}

	/**
	 * Standard 15 標準１５.<p>
	 *
	 */
	public void std15(int value) {
		setConstNumber(offset + 86, $std15, value);
	}

	/**
	 * Standard 15 標準１５.<p>
	 *
	 */
	public void std15(long value) {
		setConstNumber(offset + 86, $std15, value);
	}

	/**
	 * Standard 15 標準１５.<p>
	 *
	 */
	public void std15(float value) {
		setConstNumber(offset + 86, $std15, value);
	}

	/**
	 * Standard 15 標準１５.<p>
	 *
	 */
	public void std15(double value) {
		setConstNumber(offset + 86, $std15, value);
	}


	/**
	 * Quantity 16 数量１６.<p>
	 *
	 */
	public MCNumber qty16() {
		return getConstNumber(offset + 87, $qty16);
	}

	/**
	 * Quantity 16 数量１６.<p>
	 *
	 */
	public void qty16(MCNumber value) {
		setConstNumber(offset + 87, $qty16, value);
	}

	/**
	 * Quantity 16 数量１６.<p>
	 *
	 */
	public void qty16(int value) {
		setConstNumber(offset + 87, $qty16, value);
	}

	/**
	 * Quantity 16 数量１６.<p>
	 *
	 */
	public void qty16(long value) {
		setConstNumber(offset + 87, $qty16, value);
	}

	/**
	 * Quantity 16 数量１６.<p>
	 *
	 */
	public void qty16(float value) {
		setConstNumber(offset + 87, $qty16, value);
	}

	/**
	 * Quantity 16 数量１６.<p>
	 *
	 */
	public void qty16(double value) {
		setConstNumber(offset + 87, $qty16, value);
	}


	/**
	 * Amount 16 金額１６.<p>
	 *
	 */
	public MCNumber amt16() {
		return getConstNumber(offset + 88, $amt16);
	}

	/**
	 * Amount 16 金額１６.<p>
	 *
	 */
	public void amt16(MCNumber value) {
		setConstNumber(offset + 88, $amt16, value);
	}

	/**
	 * Amount 16 金額１６.<p>
	 *
	 */
	public void amt16(int value) {
		setConstNumber(offset + 88, $amt16, value);
	}

	/**
	 * Amount 16 金額１６.<p>
	 *
	 */
	public void amt16(long value) {
		setConstNumber(offset + 88, $amt16, value);
	}

	/**
	 * Amount 16 金額１６.<p>
	 *
	 */
	public void amt16(float value) {
		setConstNumber(offset + 88, $amt16, value);
	}

	/**
	 * Amount 16 金額１６.<p>
	 *
	 */
	public void amt16(double value) {
		setConstNumber(offset + 88, $amt16, value);
	}


	/**
	 * Standard 16 標準１６.<p>
	 *
	 */
	public MCNumber std16() {
		return getConstNumber(offset + 89, $std16);
	}

	/**
	 * Standard 16 標準１６.<p>
	 *
	 */
	public void std16(MCNumber value) {
		setConstNumber(offset + 89, $std16, value);
	}

	/**
	 * Standard 16 標準１６.<p>
	 *
	 */
	public void std16(int value) {
		setConstNumber(offset + 89, $std16, value);
	}

	/**
	 * Standard 16 標準１６.<p>
	 *
	 */
	public void std16(long value) {
		setConstNumber(offset + 89, $std16, value);
	}

	/**
	 * Standard 16 標準１６.<p>
	 *
	 */
	public void std16(float value) {
		setConstNumber(offset + 89, $std16, value);
	}

	/**
	 * Standard 16 標準１６.<p>
	 *
	 */
	public void std16(double value) {
		setConstNumber(offset + 89, $std16, value);
	}


	/**
	 * Quantity 17 数量１７.<p>
	 *
	 */
	public MCNumber qty17() {
		return getConstNumber(offset + 90, $qty17);
	}

	/**
	 * Quantity 17 数量１７.<p>
	 *
	 */
	public void qty17(MCNumber value) {
		setConstNumber(offset + 90, $qty17, value);
	}

	/**
	 * Quantity 17 数量１７.<p>
	 *
	 */
	public void qty17(int value) {
		setConstNumber(offset + 90, $qty17, value);
	}

	/**
	 * Quantity 17 数量１７.<p>
	 *
	 */
	public void qty17(long value) {
		setConstNumber(offset + 90, $qty17, value);
	}

	/**
	 * Quantity 17 数量１７.<p>
	 *
	 */
	public void qty17(float value) {
		setConstNumber(offset + 90, $qty17, value);
	}

	/**
	 * Quantity 17 数量１７.<p>
	 *
	 */
	public void qty17(double value) {
		setConstNumber(offset + 90, $qty17, value);
	}


	/**
	 * Amount 17 金額１７.<p>
	 *
	 */
	public MCNumber amt17() {
		return getConstNumber(offset + 91, $amt17);
	}

	/**
	 * Amount 17 金額１７.<p>
	 *
	 */
	public void amt17(MCNumber value) {
		setConstNumber(offset + 91, $amt17, value);
	}

	/**
	 * Amount 17 金額１７.<p>
	 *
	 */
	public void amt17(int value) {
		setConstNumber(offset + 91, $amt17, value);
	}

	/**
	 * Amount 17 金額１７.<p>
	 *
	 */
	public void amt17(long value) {
		setConstNumber(offset + 91, $amt17, value);
	}

	/**
	 * Amount 17 金額１７.<p>
	 *
	 */
	public void amt17(float value) {
		setConstNumber(offset + 91, $amt17, value);
	}

	/**
	 * Amount 17 金額１７.<p>
	 *
	 */
	public void amt17(double value) {
		setConstNumber(offset + 91, $amt17, value);
	}


	/**
	 * Standard 17 標準１７.<p>
	 *
	 */
	public MCNumber std17() {
		return getConstNumber(offset + 92, $std17);
	}

	/**
	 * Standard 17 標準１７.<p>
	 *
	 */
	public void std17(MCNumber value) {
		setConstNumber(offset + 92, $std17, value);
	}

	/**
	 * Standard 17 標準１７.<p>
	 *
	 */
	public void std17(int value) {
		setConstNumber(offset + 92, $std17, value);
	}

	/**
	 * Standard 17 標準１７.<p>
	 *
	 */
	public void std17(long value) {
		setConstNumber(offset + 92, $std17, value);
	}

	/**
	 * Standard 17 標準１７.<p>
	 *
	 */
	public void std17(float value) {
		setConstNumber(offset + 92, $std17, value);
	}

	/**
	 * Standard 17 標準１７.<p>
	 *
	 */
	public void std17(double value) {
		setConstNumber(offset + 92, $std17, value);
	}


	/**
	 * Quantity 18 数量１８.<p>
	 *
	 */
	public MCNumber qty18() {
		return getConstNumber(offset + 93, $qty18);
	}

	/**
	 * Quantity 18 数量１８.<p>
	 *
	 */
	public void qty18(MCNumber value) {
		setConstNumber(offset + 93, $qty18, value);
	}

	/**
	 * Quantity 18 数量１８.<p>
	 *
	 */
	public void qty18(int value) {
		setConstNumber(offset + 93, $qty18, value);
	}

	/**
	 * Quantity 18 数量１８.<p>
	 *
	 */
	public void qty18(long value) {
		setConstNumber(offset + 93, $qty18, value);
	}

	/**
	 * Quantity 18 数量１８.<p>
	 *
	 */
	public void qty18(float value) {
		setConstNumber(offset + 93, $qty18, value);
	}

	/**
	 * Quantity 18 数量１８.<p>
	 *
	 */
	public void qty18(double value) {
		setConstNumber(offset + 93, $qty18, value);
	}


	/**
	 * Amount 18 金額１８.<p>
	 *
	 */
	public MCNumber amt18() {
		return getConstNumber(offset + 94, $amt18);
	}

	/**
	 * Amount 18 金額１８.<p>
	 *
	 */
	public void amt18(MCNumber value) {
		setConstNumber(offset + 94, $amt18, value);
	}

	/**
	 * Amount 18 金額１８.<p>
	 *
	 */
	public void amt18(int value) {
		setConstNumber(offset + 94, $amt18, value);
	}

	/**
	 * Amount 18 金額１８.<p>
	 *
	 */
	public void amt18(long value) {
		setConstNumber(offset + 94, $amt18, value);
	}

	/**
	 * Amount 18 金額１８.<p>
	 *
	 */
	public void amt18(float value) {
		setConstNumber(offset + 94, $amt18, value);
	}

	/**
	 * Amount 18 金額１８.<p>
	 *
	 */
	public void amt18(double value) {
		setConstNumber(offset + 94, $amt18, value);
	}


	/**
	 * Standard 18 標準１８.<p>
	 *
	 */
	public MCNumber std18() {
		return getConstNumber(offset + 95, $std18);
	}

	/**
	 * Standard 18 標準１８.<p>
	 *
	 */
	public void std18(MCNumber value) {
		setConstNumber(offset + 95, $std18, value);
	}

	/**
	 * Standard 18 標準１８.<p>
	 *
	 */
	public void std18(int value) {
		setConstNumber(offset + 95, $std18, value);
	}

	/**
	 * Standard 18 標準１８.<p>
	 *
	 */
	public void std18(long value) {
		setConstNumber(offset + 95, $std18, value);
	}

	/**
	 * Standard 18 標準１８.<p>
	 *
	 */
	public void std18(float value) {
		setConstNumber(offset + 95, $std18, value);
	}

	/**
	 * Standard 18 標準１８.<p>
	 *
	 */
	public void std18(double value) {
		setConstNumber(offset + 95, $std18, value);
	}


	/**
	 * Quantity 19 数量１９.<p>
	 *
	 */
	public MCNumber qty19() {
		return getConstNumber(offset + 96, $qty19);
	}

	/**
	 * Quantity 19 数量１９.<p>
	 *
	 */
	public void qty19(MCNumber value) {
		setConstNumber(offset + 96, $qty19, value);
	}

	/**
	 * Quantity 19 数量１９.<p>
	 *
	 */
	public void qty19(int value) {
		setConstNumber(offset + 96, $qty19, value);
	}

	/**
	 * Quantity 19 数量１９.<p>
	 *
	 */
	public void qty19(long value) {
		setConstNumber(offset + 96, $qty19, value);
	}

	/**
	 * Quantity 19 数量１９.<p>
	 *
	 */
	public void qty19(float value) {
		setConstNumber(offset + 96, $qty19, value);
	}

	/**
	 * Quantity 19 数量１９.<p>
	 *
	 */
	public void qty19(double value) {
		setConstNumber(offset + 96, $qty19, value);
	}


	/**
	 * Amount 19 金額１９.<p>
	 *
	 */
	public MCNumber amt19() {
		return getConstNumber(offset + 97, $amt19);
	}

	/**
	 * Amount 19 金額１９.<p>
	 *
	 */
	public void amt19(MCNumber value) {
		setConstNumber(offset + 97, $amt19, value);
	}

	/**
	 * Amount 19 金額１９.<p>
	 *
	 */
	public void amt19(int value) {
		setConstNumber(offset + 97, $amt19, value);
	}

	/**
	 * Amount 19 金額１９.<p>
	 *
	 */
	public void amt19(long value) {
		setConstNumber(offset + 97, $amt19, value);
	}

	/**
	 * Amount 19 金額１９.<p>
	 *
	 */
	public void amt19(float value) {
		setConstNumber(offset + 97, $amt19, value);
	}

	/**
	 * Amount 19 金額１９.<p>
	 *
	 */
	public void amt19(double value) {
		setConstNumber(offset + 97, $amt19, value);
	}


	/**
	 * Standard 19 標準１９.<p>
	 *
	 */
	public MCNumber std19() {
		return getConstNumber(offset + 98, $std19);
	}

	/**
	 * Standard 19 標準１９.<p>
	 *
	 */
	public void std19(MCNumber value) {
		setConstNumber(offset + 98, $std19, value);
	}

	/**
	 * Standard 19 標準１９.<p>
	 *
	 */
	public void std19(int value) {
		setConstNumber(offset + 98, $std19, value);
	}

	/**
	 * Standard 19 標準１９.<p>
	 *
	 */
	public void std19(long value) {
		setConstNumber(offset + 98, $std19, value);
	}

	/**
	 * Standard 19 標準１９.<p>
	 *
	 */
	public void std19(float value) {
		setConstNumber(offset + 98, $std19, value);
	}

	/**
	 * Standard 19 標準１９.<p>
	 *
	 */
	public void std19(double value) {
		setConstNumber(offset + 98, $std19, value);
	}


	/**
	 * Quantity 20 数量２０.<p>
	 *
	 */
	public MCNumber qty20() {
		return getConstNumber(offset + 99, $qty20);
	}

	/**
	 * Quantity 20 数量２０.<p>
	 *
	 */
	public void qty20(MCNumber value) {
		setConstNumber(offset + 99, $qty20, value);
	}

	/**
	 * Quantity 20 数量２０.<p>
	 *
	 */
	public void qty20(int value) {
		setConstNumber(offset + 99, $qty20, value);
	}

	/**
	 * Quantity 20 数量２０.<p>
	 *
	 */
	public void qty20(long value) {
		setConstNumber(offset + 99, $qty20, value);
	}

	/**
	 * Quantity 20 数量２０.<p>
	 *
	 */
	public void qty20(float value) {
		setConstNumber(offset + 99, $qty20, value);
	}

	/**
	 * Quantity 20 数量２０.<p>
	 *
	 */
	public void qty20(double value) {
		setConstNumber(offset + 99, $qty20, value);
	}


	/**
	 * Amount 20 金額２０.<p>
	 *
	 */
	public MCNumber amt20() {
		return getConstNumber(offset + 100, $amt20);
	}

	/**
	 * Amount 20 金額２０.<p>
	 *
	 */
	public void amt20(MCNumber value) {
		setConstNumber(offset + 100, $amt20, value);
	}

	/**
	 * Amount 20 金額２０.<p>
	 *
	 */
	public void amt20(int value) {
		setConstNumber(offset + 100, $amt20, value);
	}

	/**
	 * Amount 20 金額２０.<p>
	 *
	 */
	public void amt20(long value) {
		setConstNumber(offset + 100, $amt20, value);
	}

	/**
	 * Amount 20 金額２０.<p>
	 *
	 */
	public void amt20(float value) {
		setConstNumber(offset + 100, $amt20, value);
	}

	/**
	 * Amount 20 金額２０.<p>
	 *
	 */
	public void amt20(double value) {
		setConstNumber(offset + 100, $amt20, value);
	}


	/**
	 * Standard 20 標準２０.<p>
	 *
	 */
	public MCNumber std20() {
		return getConstNumber(offset + 101, $std20);
	}

	/**
	 * Standard 20 標準２０.<p>
	 *
	 */
	public void std20(MCNumber value) {
		setConstNumber(offset + 101, $std20, value);
	}

	/**
	 * Standard 20 標準２０.<p>
	 *
	 */
	public void std20(int value) {
		setConstNumber(offset + 101, $std20, value);
	}

	/**
	 * Standard 20 標準２０.<p>
	 *
	 */
	public void std20(long value) {
		setConstNumber(offset + 101, $std20, value);
	}

	/**
	 * Standard 20 標準２０.<p>
	 *
	 */
	public void std20(float value) {
		setConstNumber(offset + 101, $std20, value);
	}

	/**
	 * Standard 20 標準２０.<p>
	 *
	 */
	public void std20(double value) {
		setConstNumber(offset + 101, $std20, value);
	}


	/**
	 * Quantity 21 数量２１.<p>
	 *
	 */
	public MCNumber qty21() {
		return getConstNumber(offset + 102, $qty21);
	}

	/**
	 * Quantity 21 数量２１.<p>
	 *
	 */
	public void qty21(MCNumber value) {
		setConstNumber(offset + 102, $qty21, value);
	}

	/**
	 * Quantity 21 数量２１.<p>
	 *
	 */
	public void qty21(int value) {
		setConstNumber(offset + 102, $qty21, value);
	}

	/**
	 * Quantity 21 数量２１.<p>
	 *
	 */
	public void qty21(long value) {
		setConstNumber(offset + 102, $qty21, value);
	}

	/**
	 * Quantity 21 数量２１.<p>
	 *
	 */
	public void qty21(float value) {
		setConstNumber(offset + 102, $qty21, value);
	}

	/**
	 * Quantity 21 数量２１.<p>
	 *
	 */
	public void qty21(double value) {
		setConstNumber(offset + 102, $qty21, value);
	}


	/**
	 * Amount 21 金額２１.<p>
	 *
	 */
	public MCNumber amt21() {
		return getConstNumber(offset + 103, $amt21);
	}

	/**
	 * Amount 21 金額２１.<p>
	 *
	 */
	public void amt21(MCNumber value) {
		setConstNumber(offset + 103, $amt21, value);
	}

	/**
	 * Amount 21 金額２１.<p>
	 *
	 */
	public void amt21(int value) {
		setConstNumber(offset + 103, $amt21, value);
	}

	/**
	 * Amount 21 金額２１.<p>
	 *
	 */
	public void amt21(long value) {
		setConstNumber(offset + 103, $amt21, value);
	}

	/**
	 * Amount 21 金額２１.<p>
	 *
	 */
	public void amt21(float value) {
		setConstNumber(offset + 103, $amt21, value);
	}

	/**
	 * Amount 21 金額２１.<p>
	 *
	 */
	public void amt21(double value) {
		setConstNumber(offset + 103, $amt21, value);
	}


	/**
	 * Standard 21 標準２１.<p>
	 *
	 */
	public MCNumber std21() {
		return getConstNumber(offset + 104, $std21);
	}

	/**
	 * Standard 21 標準２１.<p>
	 *
	 */
	public void std21(MCNumber value) {
		setConstNumber(offset + 104, $std21, value);
	}

	/**
	 * Standard 21 標準２１.<p>
	 *
	 */
	public void std21(int value) {
		setConstNumber(offset + 104, $std21, value);
	}

	/**
	 * Standard 21 標準２１.<p>
	 *
	 */
	public void std21(long value) {
		setConstNumber(offset + 104, $std21, value);
	}

	/**
	 * Standard 21 標準２１.<p>
	 *
	 */
	public void std21(float value) {
		setConstNumber(offset + 104, $std21, value);
	}

	/**
	 * Standard 21 標準２１.<p>
	 *
	 */
	public void std21(double value) {
		setConstNumber(offset + 104, $std21, value);
	}


	/**
	 * Quantity 22 数量２２.<p>
	 *
	 */
	public MCNumber qty22() {
		return getConstNumber(offset + 105, $qty22);
	}

	/**
	 * Quantity 22 数量２２.<p>
	 *
	 */
	public void qty22(MCNumber value) {
		setConstNumber(offset + 105, $qty22, value);
	}

	/**
	 * Quantity 22 数量２２.<p>
	 *
	 */
	public void qty22(int value) {
		setConstNumber(offset + 105, $qty22, value);
	}

	/**
	 * Quantity 22 数量２２.<p>
	 *
	 */
	public void qty22(long value) {
		setConstNumber(offset + 105, $qty22, value);
	}

	/**
	 * Quantity 22 数量２２.<p>
	 *
	 */
	public void qty22(float value) {
		setConstNumber(offset + 105, $qty22, value);
	}

	/**
	 * Quantity 22 数量２２.<p>
	 *
	 */
	public void qty22(double value) {
		setConstNumber(offset + 105, $qty22, value);
	}


	/**
	 * Amount 22 金額２２.<p>
	 *
	 */
	public MCNumber amt22() {
		return getConstNumber(offset + 106, $amt22);
	}

	/**
	 * Amount 22 金額２２.<p>
	 *
	 */
	public void amt22(MCNumber value) {
		setConstNumber(offset + 106, $amt22, value);
	}

	/**
	 * Amount 22 金額２２.<p>
	 *
	 */
	public void amt22(int value) {
		setConstNumber(offset + 106, $amt22, value);
	}

	/**
	 * Amount 22 金額２２.<p>
	 *
	 */
	public void amt22(long value) {
		setConstNumber(offset + 106, $amt22, value);
	}

	/**
	 * Amount 22 金額２２.<p>
	 *
	 */
	public void amt22(float value) {
		setConstNumber(offset + 106, $amt22, value);
	}

	/**
	 * Amount 22 金額２２.<p>
	 *
	 */
	public void amt22(double value) {
		setConstNumber(offset + 106, $amt22, value);
	}


	/**
	 * Standard 22 標準２２.<p>
	 *
	 */
	public MCNumber std22() {
		return getConstNumber(offset + 107, $std22);
	}

	/**
	 * Standard 22 標準２２.<p>
	 *
	 */
	public void std22(MCNumber value) {
		setConstNumber(offset + 107, $std22, value);
	}

	/**
	 * Standard 22 標準２２.<p>
	 *
	 */
	public void std22(int value) {
		setConstNumber(offset + 107, $std22, value);
	}

	/**
	 * Standard 22 標準２２.<p>
	 *
	 */
	public void std22(long value) {
		setConstNumber(offset + 107, $std22, value);
	}

	/**
	 * Standard 22 標準２２.<p>
	 *
	 */
	public void std22(float value) {
		setConstNumber(offset + 107, $std22, value);
	}

	/**
	 * Standard 22 標準２２.<p>
	 *
	 */
	public void std22(double value) {
		setConstNumber(offset + 107, $std22, value);
	}


	/**
	 * Quantity 23 数量２３.<p>
	 *
	 */
	public MCNumber qty23() {
		return getConstNumber(offset + 108, $qty23);
	}

	/**
	 * Quantity 23 数量２３.<p>
	 *
	 */
	public void qty23(MCNumber value) {
		setConstNumber(offset + 108, $qty23, value);
	}

	/**
	 * Quantity 23 数量２３.<p>
	 *
	 */
	public void qty23(int value) {
		setConstNumber(offset + 108, $qty23, value);
	}

	/**
	 * Quantity 23 数量２３.<p>
	 *
	 */
	public void qty23(long value) {
		setConstNumber(offset + 108, $qty23, value);
	}

	/**
	 * Quantity 23 数量２３.<p>
	 *
	 */
	public void qty23(float value) {
		setConstNumber(offset + 108, $qty23, value);
	}

	/**
	 * Quantity 23 数量２３.<p>
	 *
	 */
	public void qty23(double value) {
		setConstNumber(offset + 108, $qty23, value);
	}


	/**
	 * Amount 23 金額２３.<p>
	 *
	 */
	public MCNumber amt23() {
		return getConstNumber(offset + 109, $amt23);
	}

	/**
	 * Amount 23 金額２３.<p>
	 *
	 */
	public void amt23(MCNumber value) {
		setConstNumber(offset + 109, $amt23, value);
	}

	/**
	 * Amount 23 金額２３.<p>
	 *
	 */
	public void amt23(int value) {
		setConstNumber(offset + 109, $amt23, value);
	}

	/**
	 * Amount 23 金額２３.<p>
	 *
	 */
	public void amt23(long value) {
		setConstNumber(offset + 109, $amt23, value);
	}

	/**
	 * Amount 23 金額２３.<p>
	 *
	 */
	public void amt23(float value) {
		setConstNumber(offset + 109, $amt23, value);
	}

	/**
	 * Amount 23 金額２３.<p>
	 *
	 */
	public void amt23(double value) {
		setConstNumber(offset + 109, $amt23, value);
	}


	/**
	 * Standard 23 標準２３.<p>
	 *
	 */
	public MCNumber std23() {
		return getConstNumber(offset + 110, $std23);
	}

	/**
	 * Standard 23 標準２３.<p>
	 *
	 */
	public void std23(MCNumber value) {
		setConstNumber(offset + 110, $std23, value);
	}

	/**
	 * Standard 23 標準２３.<p>
	 *
	 */
	public void std23(int value) {
		setConstNumber(offset + 110, $std23, value);
	}

	/**
	 * Standard 23 標準２３.<p>
	 *
	 */
	public void std23(long value) {
		setConstNumber(offset + 110, $std23, value);
	}

	/**
	 * Standard 23 標準２３.<p>
	 *
	 */
	public void std23(float value) {
		setConstNumber(offset + 110, $std23, value);
	}

	/**
	 * Standard 23 標準２３.<p>
	 *
	 */
	public void std23(double value) {
		setConstNumber(offset + 110, $std23, value);
	}


	/**
	 * Quantity 24 数量２４.<p>
	 *
	 */
	public MCNumber qty24() {
		return getConstNumber(offset + 111, $qty24);
	}

	/**
	 * Quantity 24 数量２４.<p>
	 *
	 */
	public void qty24(MCNumber value) {
		setConstNumber(offset + 111, $qty24, value);
	}

	/**
	 * Quantity 24 数量２４.<p>
	 *
	 */
	public void qty24(int value) {
		setConstNumber(offset + 111, $qty24, value);
	}

	/**
	 * Quantity 24 数量２４.<p>
	 *
	 */
	public void qty24(long value) {
		setConstNumber(offset + 111, $qty24, value);
	}

	/**
	 * Quantity 24 数量２４.<p>
	 *
	 */
	public void qty24(float value) {
		setConstNumber(offset + 111, $qty24, value);
	}

	/**
	 * Quantity 24 数量２４.<p>
	 *
	 */
	public void qty24(double value) {
		setConstNumber(offset + 111, $qty24, value);
	}


	/**
	 * Amount 24 金額２４.<p>
	 *
	 */
	public MCNumber amt24() {
		return getConstNumber(offset + 112, $amt24);
	}

	/**
	 * Amount 24 金額２４.<p>
	 *
	 */
	public void amt24(MCNumber value) {
		setConstNumber(offset + 112, $amt24, value);
	}

	/**
	 * Amount 24 金額２４.<p>
	 *
	 */
	public void amt24(int value) {
		setConstNumber(offset + 112, $amt24, value);
	}

	/**
	 * Amount 24 金額２４.<p>
	 *
	 */
	public void amt24(long value) {
		setConstNumber(offset + 112, $amt24, value);
	}

	/**
	 * Amount 24 金額２４.<p>
	 *
	 */
	public void amt24(float value) {
		setConstNumber(offset + 112, $amt24, value);
	}

	/**
	 * Amount 24 金額２４.<p>
	 *
	 */
	public void amt24(double value) {
		setConstNumber(offset + 112, $amt24, value);
	}


	/**
	 * Standard 24 標準２４.<p>
	 *
	 */
	public MCNumber std24() {
		return getConstNumber(offset + 113, $std24);
	}

	/**
	 * Standard 24 標準２４.<p>
	 *
	 */
	public void std24(MCNumber value) {
		setConstNumber(offset + 113, $std24, value);
	}

	/**
	 * Standard 24 標準２４.<p>
	 *
	 */
	public void std24(int value) {
		setConstNumber(offset + 113, $std24, value);
	}

	/**
	 * Standard 24 標準２４.<p>
	 *
	 */
	public void std24(long value) {
		setConstNumber(offset + 113, $std24, value);
	}

	/**
	 * Standard 24 標準２４.<p>
	 *
	 */
	public void std24(float value) {
		setConstNumber(offset + 113, $std24, value);
	}

	/**
	 * Standard 24 標準２４.<p>
	 *
	 */
	public void std24(double value) {
		setConstNumber(offset + 113, $std24, value);
	}


	/**
	 * Quantity 25 数量２５.<p>
	 *
	 */
	public MCNumber qty25() {
		return getConstNumber(offset + 114, $qty25);
	}

	/**
	 * Quantity 25 数量２５.<p>
	 *
	 */
	public void qty25(MCNumber value) {
		setConstNumber(offset + 114, $qty25, value);
	}

	/**
	 * Quantity 25 数量２５.<p>
	 *
	 */
	public void qty25(int value) {
		setConstNumber(offset + 114, $qty25, value);
	}

	/**
	 * Quantity 25 数量２５.<p>
	 *
	 */
	public void qty25(long value) {
		setConstNumber(offset + 114, $qty25, value);
	}

	/**
	 * Quantity 25 数量２５.<p>
	 *
	 */
	public void qty25(float value) {
		setConstNumber(offset + 114, $qty25, value);
	}

	/**
	 * Quantity 25 数量２５.<p>
	 *
	 */
	public void qty25(double value) {
		setConstNumber(offset + 114, $qty25, value);
	}


	/**
	 * Amount 25 金額２５.<p>
	 *
	 */
	public MCNumber amt25() {
		return getConstNumber(offset + 115, $amt25);
	}

	/**
	 * Amount 25 金額２５.<p>
	 *
	 */
	public void amt25(MCNumber value) {
		setConstNumber(offset + 115, $amt25, value);
	}

	/**
	 * Amount 25 金額２５.<p>
	 *
	 */
	public void amt25(int value) {
		setConstNumber(offset + 115, $amt25, value);
	}

	/**
	 * Amount 25 金額２５.<p>
	 *
	 */
	public void amt25(long value) {
		setConstNumber(offset + 115, $amt25, value);
	}

	/**
	 * Amount 25 金額２５.<p>
	 *
	 */
	public void amt25(float value) {
		setConstNumber(offset + 115, $amt25, value);
	}

	/**
	 * Amount 25 金額２５.<p>
	 *
	 */
	public void amt25(double value) {
		setConstNumber(offset + 115, $amt25, value);
	}


	/**
	 * Standard 25 標準２５.<p>
	 *
	 */
	public MCNumber std25() {
		return getConstNumber(offset + 116, $std25);
	}

	/**
	 * Standard 25 標準２５.<p>
	 *
	 */
	public void std25(MCNumber value) {
		setConstNumber(offset + 116, $std25, value);
	}

	/**
	 * Standard 25 標準２５.<p>
	 *
	 */
	public void std25(int value) {
		setConstNumber(offset + 116, $std25, value);
	}

	/**
	 * Standard 25 標準２５.<p>
	 *
	 */
	public void std25(long value) {
		setConstNumber(offset + 116, $std25, value);
	}

	/**
	 * Standard 25 標準２５.<p>
	 *
	 */
	public void std25(float value) {
		setConstNumber(offset + 116, $std25, value);
	}

	/**
	 * Standard 25 標準２５.<p>
	 *
	 */
	public void std25(double value) {
		setConstNumber(offset + 116, $std25, value);
	}


	/**
	 * Quantity 26 数量２６.<p>
	 *
	 */
	public MCNumber qty26() {
		return getConstNumber(offset + 117, $qty26);
	}

	/**
	 * Quantity 26 数量２６.<p>
	 *
	 */
	public void qty26(MCNumber value) {
		setConstNumber(offset + 117, $qty26, value);
	}

	/**
	 * Quantity 26 数量２６.<p>
	 *
	 */
	public void qty26(int value) {
		setConstNumber(offset + 117, $qty26, value);
	}

	/**
	 * Quantity 26 数量２６.<p>
	 *
	 */
	public void qty26(long value) {
		setConstNumber(offset + 117, $qty26, value);
	}

	/**
	 * Quantity 26 数量２６.<p>
	 *
	 */
	public void qty26(float value) {
		setConstNumber(offset + 117, $qty26, value);
	}

	/**
	 * Quantity 26 数量２６.<p>
	 *
	 */
	public void qty26(double value) {
		setConstNumber(offset + 117, $qty26, value);
	}


	/**
	 * Amount 26 金額２６.<p>
	 *
	 */
	public MCNumber amt26() {
		return getConstNumber(offset + 118, $amt26);
	}

	/**
	 * Amount 26 金額２６.<p>
	 *
	 */
	public void amt26(MCNumber value) {
		setConstNumber(offset + 118, $amt26, value);
	}

	/**
	 * Amount 26 金額２６.<p>
	 *
	 */
	public void amt26(int value) {
		setConstNumber(offset + 118, $amt26, value);
	}

	/**
	 * Amount 26 金額２６.<p>
	 *
	 */
	public void amt26(long value) {
		setConstNumber(offset + 118, $amt26, value);
	}

	/**
	 * Amount 26 金額２６.<p>
	 *
	 */
	public void amt26(float value) {
		setConstNumber(offset + 118, $amt26, value);
	}

	/**
	 * Amount 26 金額２６.<p>
	 *
	 */
	public void amt26(double value) {
		setConstNumber(offset + 118, $amt26, value);
	}


	/**
	 * Standard 26 標準２６.<p>
	 *
	 */
	public MCNumber std26() {
		return getConstNumber(offset + 119, $std26);
	}

	/**
	 * Standard 26 標準２６.<p>
	 *
	 */
	public void std26(MCNumber value) {
		setConstNumber(offset + 119, $std26, value);
	}

	/**
	 * Standard 26 標準２６.<p>
	 *
	 */
	public void std26(int value) {
		setConstNumber(offset + 119, $std26, value);
	}

	/**
	 * Standard 26 標準２６.<p>
	 *
	 */
	public void std26(long value) {
		setConstNumber(offset + 119, $std26, value);
	}

	/**
	 * Standard 26 標準２６.<p>
	 *
	 */
	public void std26(float value) {
		setConstNumber(offset + 119, $std26, value);
	}

	/**
	 * Standard 26 標準２６.<p>
	 *
	 */
	public void std26(double value) {
		setConstNumber(offset + 119, $std26, value);
	}


	/**
	 * Quantity 27 数量２７.<p>
	 *
	 */
	public MCNumber qty27() {
		return getConstNumber(offset + 120, $qty27);
	}

	/**
	 * Quantity 27 数量２７.<p>
	 *
	 */
	public void qty27(MCNumber value) {
		setConstNumber(offset + 120, $qty27, value);
	}

	/**
	 * Quantity 27 数量２７.<p>
	 *
	 */
	public void qty27(int value) {
		setConstNumber(offset + 120, $qty27, value);
	}

	/**
	 * Quantity 27 数量２７.<p>
	 *
	 */
	public void qty27(long value) {
		setConstNumber(offset + 120, $qty27, value);
	}

	/**
	 * Quantity 27 数量２７.<p>
	 *
	 */
	public void qty27(float value) {
		setConstNumber(offset + 120, $qty27, value);
	}

	/**
	 * Quantity 27 数量２７.<p>
	 *
	 */
	public void qty27(double value) {
		setConstNumber(offset + 120, $qty27, value);
	}


	/**
	 * Amount 27 金額２７.<p>
	 *
	 */
	public MCNumber amt27() {
		return getConstNumber(offset + 121, $amt27);
	}

	/**
	 * Amount 27 金額２７.<p>
	 *
	 */
	public void amt27(MCNumber value) {
		setConstNumber(offset + 121, $amt27, value);
	}

	/**
	 * Amount 27 金額２７.<p>
	 *
	 */
	public void amt27(int value) {
		setConstNumber(offset + 121, $amt27, value);
	}

	/**
	 * Amount 27 金額２７.<p>
	 *
	 */
	public void amt27(long value) {
		setConstNumber(offset + 121, $amt27, value);
	}

	/**
	 * Amount 27 金額２７.<p>
	 *
	 */
	public void amt27(float value) {
		setConstNumber(offset + 121, $amt27, value);
	}

	/**
	 * Amount 27 金額２７.<p>
	 *
	 */
	public void amt27(double value) {
		setConstNumber(offset + 121, $amt27, value);
	}


	/**
	 * Standard 27 標準２７.<p>
	 *
	 */
	public MCNumber std27() {
		return getConstNumber(offset + 122, $std27);
	}

	/**
	 * Standard 27 標準２７.<p>
	 *
	 */
	public void std27(MCNumber value) {
		setConstNumber(offset + 122, $std27, value);
	}

	/**
	 * Standard 27 標準２７.<p>
	 *
	 */
	public void std27(int value) {
		setConstNumber(offset + 122, $std27, value);
	}

	/**
	 * Standard 27 標準２７.<p>
	 *
	 */
	public void std27(long value) {
		setConstNumber(offset + 122, $std27, value);
	}

	/**
	 * Standard 27 標準２７.<p>
	 *
	 */
	public void std27(float value) {
		setConstNumber(offset + 122, $std27, value);
	}

	/**
	 * Standard 27 標準２７.<p>
	 *
	 */
	public void std27(double value) {
		setConstNumber(offset + 122, $std27, value);
	}


	/**
	 * Quantity 28 数量２８.<p>
	 *
	 */
	public MCNumber qty28() {
		return getConstNumber(offset + 123, $qty28);
	}

	/**
	 * Quantity 28 数量２８.<p>
	 *
	 */
	public void qty28(MCNumber value) {
		setConstNumber(offset + 123, $qty28, value);
	}

	/**
	 * Quantity 28 数量２８.<p>
	 *
	 */
	public void qty28(int value) {
		setConstNumber(offset + 123, $qty28, value);
	}

	/**
	 * Quantity 28 数量２８.<p>
	 *
	 */
	public void qty28(long value) {
		setConstNumber(offset + 123, $qty28, value);
	}

	/**
	 * Quantity 28 数量２８.<p>
	 *
	 */
	public void qty28(float value) {
		setConstNumber(offset + 123, $qty28, value);
	}

	/**
	 * Quantity 28 数量２８.<p>
	 *
	 */
	public void qty28(double value) {
		setConstNumber(offset + 123, $qty28, value);
	}


	/**
	 * Amount 28 金額２８.<p>
	 *
	 */
	public MCNumber amt28() {
		return getConstNumber(offset + 124, $amt28);
	}

	/**
	 * Amount 28 金額２８.<p>
	 *
	 */
	public void amt28(MCNumber value) {
		setConstNumber(offset + 124, $amt28, value);
	}

	/**
	 * Amount 28 金額２８.<p>
	 *
	 */
	public void amt28(int value) {
		setConstNumber(offset + 124, $amt28, value);
	}

	/**
	 * Amount 28 金額２８.<p>
	 *
	 */
	public void amt28(long value) {
		setConstNumber(offset + 124, $amt28, value);
	}

	/**
	 * Amount 28 金額２８.<p>
	 *
	 */
	public void amt28(float value) {
		setConstNumber(offset + 124, $amt28, value);
	}

	/**
	 * Amount 28 金額２８.<p>
	 *
	 */
	public void amt28(double value) {
		setConstNumber(offset + 124, $amt28, value);
	}


	/**
	 * Standard 28 標準２８.<p>
	 *
	 */
	public MCNumber std28() {
		return getConstNumber(offset + 125, $std28);
	}

	/**
	 * Standard 28 標準２８.<p>
	 *
	 */
	public void std28(MCNumber value) {
		setConstNumber(offset + 125, $std28, value);
	}

	/**
	 * Standard 28 標準２８.<p>
	 *
	 */
	public void std28(int value) {
		setConstNumber(offset + 125, $std28, value);
	}

	/**
	 * Standard 28 標準２８.<p>
	 *
	 */
	public void std28(long value) {
		setConstNumber(offset + 125, $std28, value);
	}

	/**
	 * Standard 28 標準２８.<p>
	 *
	 */
	public void std28(float value) {
		setConstNumber(offset + 125, $std28, value);
	}

	/**
	 * Standard 28 標準２８.<p>
	 *
	 */
	public void std28(double value) {
		setConstNumber(offset + 125, $std28, value);
	}


	/**
	 * Quantity 29 数量２９.<p>
	 *
	 */
	public MCNumber qty29() {
		return getConstNumber(offset + 126, $qty29);
	}

	/**
	 * Quantity 29 数量２９.<p>
	 *
	 */
	public void qty29(MCNumber value) {
		setConstNumber(offset + 126, $qty29, value);
	}

	/**
	 * Quantity 29 数量２９.<p>
	 *
	 */
	public void qty29(int value) {
		setConstNumber(offset + 126, $qty29, value);
	}

	/**
	 * Quantity 29 数量２９.<p>
	 *
	 */
	public void qty29(long value) {
		setConstNumber(offset + 126, $qty29, value);
	}

	/**
	 * Quantity 29 数量２９.<p>
	 *
	 */
	public void qty29(float value) {
		setConstNumber(offset + 126, $qty29, value);
	}

	/**
	 * Quantity 29 数量２９.<p>
	 *
	 */
	public void qty29(double value) {
		setConstNumber(offset + 126, $qty29, value);
	}


	/**
	 * Amount 29 金額２９.<p>
	 *
	 */
	public MCNumber amt29() {
		return getConstNumber(offset + 127, $amt29);
	}

	/**
	 * Amount 29 金額２９.<p>
	 *
	 */
	public void amt29(MCNumber value) {
		setConstNumber(offset + 127, $amt29, value);
	}

	/**
	 * Amount 29 金額２９.<p>
	 *
	 */
	public void amt29(int value) {
		setConstNumber(offset + 127, $amt29, value);
	}

	/**
	 * Amount 29 金額２９.<p>
	 *
	 */
	public void amt29(long value) {
		setConstNumber(offset + 127, $amt29, value);
	}

	/**
	 * Amount 29 金額２９.<p>
	 *
	 */
	public void amt29(float value) {
		setConstNumber(offset + 127, $amt29, value);
	}

	/**
	 * Amount 29 金額２９.<p>
	 *
	 */
	public void amt29(double value) {
		setConstNumber(offset + 127, $amt29, value);
	}


	/**
	 * Standard 29 標準２９.<p>
	 *
	 */
	public MCNumber std29() {
		return getConstNumber(offset + 128, $std29);
	}

	/**
	 * Standard 29 標準２９.<p>
	 *
	 */
	public void std29(MCNumber value) {
		setConstNumber(offset + 128, $std29, value);
	}

	/**
	 * Standard 29 標準２９.<p>
	 *
	 */
	public void std29(int value) {
		setConstNumber(offset + 128, $std29, value);
	}

	/**
	 * Standard 29 標準２９.<p>
	 *
	 */
	public void std29(long value) {
		setConstNumber(offset + 128, $std29, value);
	}

	/**
	 * Standard 29 標準２９.<p>
	 *
	 */
	public void std29(float value) {
		setConstNumber(offset + 128, $std29, value);
	}

	/**
	 * Standard 29 標準２９.<p>
	 *
	 */
	public void std29(double value) {
		setConstNumber(offset + 128, $std29, value);
	}


	/**
	 * Quantity 30 数量３０.<p>
	 *
	 */
	public MCNumber qty30() {
		return getConstNumber(offset + 129, $qty30);
	}

	/**
	 * Quantity 30 数量３０.<p>
	 *
	 */
	public void qty30(MCNumber value) {
		setConstNumber(offset + 129, $qty30, value);
	}

	/**
	 * Quantity 30 数量３０.<p>
	 *
	 */
	public void qty30(int value) {
		setConstNumber(offset + 129, $qty30, value);
	}

	/**
	 * Quantity 30 数量３０.<p>
	 *
	 */
	public void qty30(long value) {
		setConstNumber(offset + 129, $qty30, value);
	}

	/**
	 * Quantity 30 数量３０.<p>
	 *
	 */
	public void qty30(float value) {
		setConstNumber(offset + 129, $qty30, value);
	}

	/**
	 * Quantity 30 数量３０.<p>
	 *
	 */
	public void qty30(double value) {
		setConstNumber(offset + 129, $qty30, value);
	}


	/**
	 * Amount 30 金額３０.<p>
	 *
	 */
	public MCNumber amt30() {
		return getConstNumber(offset + 130, $amt30);
	}

	/**
	 * Amount 30 金額３０.<p>
	 *
	 */
	public void amt30(MCNumber value) {
		setConstNumber(offset + 130, $amt30, value);
	}

	/**
	 * Amount 30 金額３０.<p>
	 *
	 */
	public void amt30(int value) {
		setConstNumber(offset + 130, $amt30, value);
	}

	/**
	 * Amount 30 金額３０.<p>
	 *
	 */
	public void amt30(long value) {
		setConstNumber(offset + 130, $amt30, value);
	}

	/**
	 * Amount 30 金額３０.<p>
	 *
	 */
	public void amt30(float value) {
		setConstNumber(offset + 130, $amt30, value);
	}

	/**
	 * Amount 30 金額３０.<p>
	 *
	 */
	public void amt30(double value) {
		setConstNumber(offset + 130, $amt30, value);
	}


	/**
	 * Standard 30 標準３０.<p>
	 *
	 */
	public MCNumber std30() {
		return getConstNumber(offset + 131, $std30);
	}

	/**
	 * Standard 30 標準３０.<p>
	 *
	 */
	public void std30(MCNumber value) {
		setConstNumber(offset + 131, $std30, value);
	}

	/**
	 * Standard 30 標準３０.<p>
	 *
	 */
	public void std30(int value) {
		setConstNumber(offset + 131, $std30, value);
	}

	/**
	 * Standard 30 標準３０.<p>
	 *
	 */
	public void std30(long value) {
		setConstNumber(offset + 131, $std30, value);
	}

	/**
	 * Standard 30 標準３０.<p>
	 *
	 */
	public void std30(float value) {
		setConstNumber(offset + 131, $std30, value);
	}

	/**
	 * Standard 30 標準３０.<p>
	 *
	 */
	public void std30(double value) {
		setConstNumber(offset + 131, $std30, value);
	}


	/**
	 * Quantity difference 数量差.<p>
	 *
	 */
	public MCNumber diff_qty() {
		return getConstNumber(offset + 132, $diff_qty);
	}

	/**
	 * Quantity difference 数量差.<p>
	 *
	 */
	public void diff_qty(MCNumber value) {
		setConstNumber(offset + 132, $diff_qty, value);
	}

	/**
	 * Quantity difference 数量差.<p>
	 *
	 */
	public void diff_qty(int value) {
		setConstNumber(offset + 132, $diff_qty, value);
	}

	/**
	 * Quantity difference 数量差.<p>
	 *
	 */
	public void diff_qty(long value) {
		setConstNumber(offset + 132, $diff_qty, value);
	}

	/**
	 * Quantity difference 数量差.<p>
	 *
	 */
	public void diff_qty(float value) {
		setConstNumber(offset + 132, $diff_qty, value);
	}

	/**
	 * Quantity difference 数量差.<p>
	 *
	 */
	public void diff_qty(double value) {
		setConstNumber(offset + 132, $diff_qty, value);
	}


	/**
	 * Amount variance 金額差.<p>
	 *
	 */
	public MCNumber diff_amt() {
		return getConstNumber(offset + 133, $diff_amt);
	}

	/**
	 * Amount variance 金額差.<p>
	 *
	 */
	public void diff_amt(MCNumber value) {
		setConstNumber(offset + 133, $diff_amt, value);
	}

	/**
	 * Amount variance 金額差.<p>
	 *
	 */
	public void diff_amt(int value) {
		setConstNumber(offset + 133, $diff_amt, value);
	}

	/**
	 * Amount variance 金額差.<p>
	 *
	 */
	public void diff_amt(long value) {
		setConstNumber(offset + 133, $diff_amt, value);
	}

	/**
	 * Amount variance 金額差.<p>
	 *
	 */
	public void diff_amt(float value) {
		setConstNumber(offset + 133, $diff_amt, value);
	}

	/**
	 * Amount variance 金額差.<p>
	 *
	 */
	public void diff_amt(double value) {
		setConstNumber(offset + 133, $diff_amt, value);
	}


	/**
	 * Standard variance 標準差.<p>
	 *
	 */
	public MCNumber diff_std() {
		return getConstNumber(offset + 134, $diff_std);
	}

	/**
	 * Standard variance 標準差.<p>
	 *
	 */
	public void diff_std(MCNumber value) {
		setConstNumber(offset + 134, $diff_std, value);
	}

	/**
	 * Standard variance 標準差.<p>
	 *
	 */
	public void diff_std(int value) {
		setConstNumber(offset + 134, $diff_std, value);
	}

	/**
	 * Standard variance 標準差.<p>
	 *
	 */
	public void diff_std(long value) {
		setConstNumber(offset + 134, $diff_std, value);
	}

	/**
	 * Standard variance 標準差.<p>
	 *
	 */
	public void diff_std(float value) {
		setConstNumber(offset + 134, $diff_std, value);
	}

	/**
	 * Standard variance 標準差.<p>
	 *
	 */
	public void diff_std(double value) {
		setConstNumber(offset + 134, $diff_std, value);
	}


	/**
	 * Number of aggregation 集計件数.<p>
	 *
	 */
	public MCNumber ave_tgt() {
		return getConstNumber(offset + 135, $ave_tgt);
	}

	/**
	 * Number of aggregation 集計件数.<p>
	 *
	 */
	public void ave_tgt(MCNumber value) {
		setConstNumber(offset + 135, $ave_tgt, value);
	}

	/**
	 * Number of aggregation 集計件数.<p>
	 *
	 */
	public void ave_tgt(int value) {
		setConstNumber(offset + 135, $ave_tgt, value);
	}

	/**
	 * Number of aggregation 集計件数.<p>
	 *
	 */
	public void ave_tgt(long value) {
		setConstNumber(offset + 135, $ave_tgt, value);
	}

	/**
	 * Number of aggregation 集計件数.<p>
	 *
	 */
	public void ave_tgt(float value) {
		setConstNumber(offset + 135, $ave_tgt, value);
	}

	/**
	 * Number of aggregation 集計件数.<p>
	 *
	 */
	public void ave_tgt(double value) {
		setConstNumber(offset + 135, $ave_tgt, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
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
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($qty01.equalsIgnoreCase(name)) {
			return qty01();
		}
		if ($amt01.equalsIgnoreCase(name)) {
			return amt01();
		}
		if ($std01.equalsIgnoreCase(name)) {
			return std01();
		}
		if ($qty02.equalsIgnoreCase(name)) {
			return qty02();
		}
		if ($amt02.equalsIgnoreCase(name)) {
			return amt02();
		}
		if ($std02.equalsIgnoreCase(name)) {
			return std02();
		}
		if ($qty03.equalsIgnoreCase(name)) {
			return qty03();
		}
		if ($amt03.equalsIgnoreCase(name)) {
			return amt03();
		}
		if ($std03.equalsIgnoreCase(name)) {
			return std03();
		}
		if ($qty04.equalsIgnoreCase(name)) {
			return qty04();
		}
		if ($amt04.equalsIgnoreCase(name)) {
			return amt04();
		}
		if ($std04.equalsIgnoreCase(name)) {
			return std04();
		}
		if ($qty05.equalsIgnoreCase(name)) {
			return qty05();
		}
		if ($amt05.equalsIgnoreCase(name)) {
			return amt05();
		}
		if ($std05.equalsIgnoreCase(name)) {
			return std05();
		}
		if ($qty06.equalsIgnoreCase(name)) {
			return qty06();
		}
		if ($amt06.equalsIgnoreCase(name)) {
			return amt06();
		}
		if ($std06.equalsIgnoreCase(name)) {
			return std06();
		}
		if ($qty07.equalsIgnoreCase(name)) {
			return qty07();
		}
		if ($amt07.equalsIgnoreCase(name)) {
			return amt07();
		}
		if ($std07.equalsIgnoreCase(name)) {
			return std07();
		}
		if ($qty08.equalsIgnoreCase(name)) {
			return qty08();
		}
		if ($amt08.equalsIgnoreCase(name)) {
			return amt08();
		}
		if ($std08.equalsIgnoreCase(name)) {
			return std08();
		}
		if ($qty09.equalsIgnoreCase(name)) {
			return qty09();
		}
		if ($amt09.equalsIgnoreCase(name)) {
			return amt09();
		}
		if ($std09.equalsIgnoreCase(name)) {
			return std09();
		}
		if ($qty10.equalsIgnoreCase(name)) {
			return qty10();
		}
		if ($amt10.equalsIgnoreCase(name)) {
			return amt10();
		}
		if ($std10.equalsIgnoreCase(name)) {
			return std10();
		}
		if ($qty11.equalsIgnoreCase(name)) {
			return qty11();
		}
		if ($amt11.equalsIgnoreCase(name)) {
			return amt11();
		}
		if ($std11.equalsIgnoreCase(name)) {
			return std11();
		}
		if ($qty12.equalsIgnoreCase(name)) {
			return qty12();
		}
		if ($amt12.equalsIgnoreCase(name)) {
			return amt12();
		}
		if ($std12.equalsIgnoreCase(name)) {
			return std12();
		}
		if ($qty13.equalsIgnoreCase(name)) {
			return qty13();
		}
		if ($amt13.equalsIgnoreCase(name)) {
			return amt13();
		}
		if ($std13.equalsIgnoreCase(name)) {
			return std13();
		}
		if ($qty14.equalsIgnoreCase(name)) {
			return qty14();
		}
		if ($amt14.equalsIgnoreCase(name)) {
			return amt14();
		}
		if ($std14.equalsIgnoreCase(name)) {
			return std14();
		}
		if ($qty15.equalsIgnoreCase(name)) {
			return qty15();
		}
		if ($amt15.equalsIgnoreCase(name)) {
			return amt15();
		}
		if ($std15.equalsIgnoreCase(name)) {
			return std15();
		}
		if ($qty16.equalsIgnoreCase(name)) {
			return qty16();
		}
		if ($amt16.equalsIgnoreCase(name)) {
			return amt16();
		}
		if ($std16.equalsIgnoreCase(name)) {
			return std16();
		}
		if ($qty17.equalsIgnoreCase(name)) {
			return qty17();
		}
		if ($amt17.equalsIgnoreCase(name)) {
			return amt17();
		}
		if ($std17.equalsIgnoreCase(name)) {
			return std17();
		}
		if ($qty18.equalsIgnoreCase(name)) {
			return qty18();
		}
		if ($amt18.equalsIgnoreCase(name)) {
			return amt18();
		}
		if ($std18.equalsIgnoreCase(name)) {
			return std18();
		}
		if ($qty19.equalsIgnoreCase(name)) {
			return qty19();
		}
		if ($amt19.equalsIgnoreCase(name)) {
			return amt19();
		}
		if ($std19.equalsIgnoreCase(name)) {
			return std19();
		}
		if ($qty20.equalsIgnoreCase(name)) {
			return qty20();
		}
		if ($amt20.equalsIgnoreCase(name)) {
			return amt20();
		}
		if ($std20.equalsIgnoreCase(name)) {
			return std20();
		}
		if ($qty21.equalsIgnoreCase(name)) {
			return qty21();
		}
		if ($amt21.equalsIgnoreCase(name)) {
			return amt21();
		}
		if ($std21.equalsIgnoreCase(name)) {
			return std21();
		}
		if ($qty22.equalsIgnoreCase(name)) {
			return qty22();
		}
		if ($amt22.equalsIgnoreCase(name)) {
			return amt22();
		}
		if ($std22.equalsIgnoreCase(name)) {
			return std22();
		}
		if ($qty23.equalsIgnoreCase(name)) {
			return qty23();
		}
		if ($amt23.equalsIgnoreCase(name)) {
			return amt23();
		}
		if ($std23.equalsIgnoreCase(name)) {
			return std23();
		}
		if ($qty24.equalsIgnoreCase(name)) {
			return qty24();
		}
		if ($amt24.equalsIgnoreCase(name)) {
			return amt24();
		}
		if ($std24.equalsIgnoreCase(name)) {
			return std24();
		}
		if ($qty25.equalsIgnoreCase(name)) {
			return qty25();
		}
		if ($amt25.equalsIgnoreCase(name)) {
			return amt25();
		}
		if ($std25.equalsIgnoreCase(name)) {
			return std25();
		}
		if ($qty26.equalsIgnoreCase(name)) {
			return qty26();
		}
		if ($amt26.equalsIgnoreCase(name)) {
			return amt26();
		}
		if ($std26.equalsIgnoreCase(name)) {
			return std26();
		}
		if ($qty27.equalsIgnoreCase(name)) {
			return qty27();
		}
		if ($amt27.equalsIgnoreCase(name)) {
			return amt27();
		}
		if ($std27.equalsIgnoreCase(name)) {
			return std27();
		}
		if ($qty28.equalsIgnoreCase(name)) {
			return qty28();
		}
		if ($amt28.equalsIgnoreCase(name)) {
			return amt28();
		}
		if ($std28.equalsIgnoreCase(name)) {
			return std28();
		}
		if ($qty29.equalsIgnoreCase(name)) {
			return qty29();
		}
		if ($amt29.equalsIgnoreCase(name)) {
			return amt29();
		}
		if ($std29.equalsIgnoreCase(name)) {
			return std29();
		}
		if ($qty30.equalsIgnoreCase(name)) {
			return qty30();
		}
		if ($amt30.equalsIgnoreCase(name)) {
			return amt30();
		}
		if ($std30.equalsIgnoreCase(name)) {
			return std30();
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			return diff_qty();
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			return diff_amt();
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			return diff_std();
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			return ave_tgt();
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
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($qty01.equalsIgnoreCase(name)) {
			return qty01();
		}
		if ($amt01.equalsIgnoreCase(name)) {
			return amt01();
		}
		if ($std01.equalsIgnoreCase(name)) {
			return std01();
		}
		if ($qty02.equalsIgnoreCase(name)) {
			return qty02();
		}
		if ($amt02.equalsIgnoreCase(name)) {
			return amt02();
		}
		if ($std02.equalsIgnoreCase(name)) {
			return std02();
		}
		if ($qty03.equalsIgnoreCase(name)) {
			return qty03();
		}
		if ($amt03.equalsIgnoreCase(name)) {
			return amt03();
		}
		if ($std03.equalsIgnoreCase(name)) {
			return std03();
		}
		if ($qty04.equalsIgnoreCase(name)) {
			return qty04();
		}
		if ($amt04.equalsIgnoreCase(name)) {
			return amt04();
		}
		if ($std04.equalsIgnoreCase(name)) {
			return std04();
		}
		if ($qty05.equalsIgnoreCase(name)) {
			return qty05();
		}
		if ($amt05.equalsIgnoreCase(name)) {
			return amt05();
		}
		if ($std05.equalsIgnoreCase(name)) {
			return std05();
		}
		if ($qty06.equalsIgnoreCase(name)) {
			return qty06();
		}
		if ($amt06.equalsIgnoreCase(name)) {
			return amt06();
		}
		if ($std06.equalsIgnoreCase(name)) {
			return std06();
		}
		if ($qty07.equalsIgnoreCase(name)) {
			return qty07();
		}
		if ($amt07.equalsIgnoreCase(name)) {
			return amt07();
		}
		if ($std07.equalsIgnoreCase(name)) {
			return std07();
		}
		if ($qty08.equalsIgnoreCase(name)) {
			return qty08();
		}
		if ($amt08.equalsIgnoreCase(name)) {
			return amt08();
		}
		if ($std08.equalsIgnoreCase(name)) {
			return std08();
		}
		if ($qty09.equalsIgnoreCase(name)) {
			return qty09();
		}
		if ($amt09.equalsIgnoreCase(name)) {
			return amt09();
		}
		if ($std09.equalsIgnoreCase(name)) {
			return std09();
		}
		if ($qty10.equalsIgnoreCase(name)) {
			return qty10();
		}
		if ($amt10.equalsIgnoreCase(name)) {
			return amt10();
		}
		if ($std10.equalsIgnoreCase(name)) {
			return std10();
		}
		if ($qty11.equalsIgnoreCase(name)) {
			return qty11();
		}
		if ($amt11.equalsIgnoreCase(name)) {
			return amt11();
		}
		if ($std11.equalsIgnoreCase(name)) {
			return std11();
		}
		if ($qty12.equalsIgnoreCase(name)) {
			return qty12();
		}
		if ($amt12.equalsIgnoreCase(name)) {
			return amt12();
		}
		if ($std12.equalsIgnoreCase(name)) {
			return std12();
		}
		if ($qty13.equalsIgnoreCase(name)) {
			return qty13();
		}
		if ($amt13.equalsIgnoreCase(name)) {
			return amt13();
		}
		if ($std13.equalsIgnoreCase(name)) {
			return std13();
		}
		if ($qty14.equalsIgnoreCase(name)) {
			return qty14();
		}
		if ($amt14.equalsIgnoreCase(name)) {
			return amt14();
		}
		if ($std14.equalsIgnoreCase(name)) {
			return std14();
		}
		if ($qty15.equalsIgnoreCase(name)) {
			return qty15();
		}
		if ($amt15.equalsIgnoreCase(name)) {
			return amt15();
		}
		if ($std15.equalsIgnoreCase(name)) {
			return std15();
		}
		if ($qty16.equalsIgnoreCase(name)) {
			return qty16();
		}
		if ($amt16.equalsIgnoreCase(name)) {
			return amt16();
		}
		if ($std16.equalsIgnoreCase(name)) {
			return std16();
		}
		if ($qty17.equalsIgnoreCase(name)) {
			return qty17();
		}
		if ($amt17.equalsIgnoreCase(name)) {
			return amt17();
		}
		if ($std17.equalsIgnoreCase(name)) {
			return std17();
		}
		if ($qty18.equalsIgnoreCase(name)) {
			return qty18();
		}
		if ($amt18.equalsIgnoreCase(name)) {
			return amt18();
		}
		if ($std18.equalsIgnoreCase(name)) {
			return std18();
		}
		if ($qty19.equalsIgnoreCase(name)) {
			return qty19();
		}
		if ($amt19.equalsIgnoreCase(name)) {
			return amt19();
		}
		if ($std19.equalsIgnoreCase(name)) {
			return std19();
		}
		if ($qty20.equalsIgnoreCase(name)) {
			return qty20();
		}
		if ($amt20.equalsIgnoreCase(name)) {
			return amt20();
		}
		if ($std20.equalsIgnoreCase(name)) {
			return std20();
		}
		if ($qty21.equalsIgnoreCase(name)) {
			return qty21();
		}
		if ($amt21.equalsIgnoreCase(name)) {
			return amt21();
		}
		if ($std21.equalsIgnoreCase(name)) {
			return std21();
		}
		if ($qty22.equalsIgnoreCase(name)) {
			return qty22();
		}
		if ($amt22.equalsIgnoreCase(name)) {
			return amt22();
		}
		if ($std22.equalsIgnoreCase(name)) {
			return std22();
		}
		if ($qty23.equalsIgnoreCase(name)) {
			return qty23();
		}
		if ($amt23.equalsIgnoreCase(name)) {
			return amt23();
		}
		if ($std23.equalsIgnoreCase(name)) {
			return std23();
		}
		if ($qty24.equalsIgnoreCase(name)) {
			return qty24();
		}
		if ($amt24.equalsIgnoreCase(name)) {
			return amt24();
		}
		if ($std24.equalsIgnoreCase(name)) {
			return std24();
		}
		if ($qty25.equalsIgnoreCase(name)) {
			return qty25();
		}
		if ($amt25.equalsIgnoreCase(name)) {
			return amt25();
		}
		if ($std25.equalsIgnoreCase(name)) {
			return std25();
		}
		if ($qty26.equalsIgnoreCase(name)) {
			return qty26();
		}
		if ($amt26.equalsIgnoreCase(name)) {
			return amt26();
		}
		if ($std26.equalsIgnoreCase(name)) {
			return std26();
		}
		if ($qty27.equalsIgnoreCase(name)) {
			return qty27();
		}
		if ($amt27.equalsIgnoreCase(name)) {
			return amt27();
		}
		if ($std27.equalsIgnoreCase(name)) {
			return std27();
		}
		if ($qty28.equalsIgnoreCase(name)) {
			return qty28();
		}
		if ($amt28.equalsIgnoreCase(name)) {
			return amt28();
		}
		if ($std28.equalsIgnoreCase(name)) {
			return std28();
		}
		if ($qty29.equalsIgnoreCase(name)) {
			return qty29();
		}
		if ($amt29.equalsIgnoreCase(name)) {
			return amt29();
		}
		if ($std29.equalsIgnoreCase(name)) {
			return std29();
		}
		if ($qty30.equalsIgnoreCase(name)) {
			return qty30();
		}
		if ($amt30.equalsIgnoreCase(name)) {
			return amt30();
		}
		if ($std30.equalsIgnoreCase(name)) {
			return std30();
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			return diff_qty();
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			return diff_amt();
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			return diff_std();
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			return ave_tgt();
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
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
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
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($qty13.equalsIgnoreCase(name)) {
			qty13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($qty14.equalsIgnoreCase(name)) {
			qty14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($qty15.equalsIgnoreCase(name)) {
			qty15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($qty16.equalsIgnoreCase(name)) {
			qty16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($qty17.equalsIgnoreCase(name)) {
			qty17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($qty18.equalsIgnoreCase(name)) {
			qty18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($qty19.equalsIgnoreCase(name)) {
			qty19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($qty20.equalsIgnoreCase(name)) {
			qty20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($qty21.equalsIgnoreCase(name)) {
			qty21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($qty22.equalsIgnoreCase(name)) {
			qty22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($qty23.equalsIgnoreCase(name)) {
			qty23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($qty24.equalsIgnoreCase(name)) {
			qty24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($qty25.equalsIgnoreCase(name)) {
			qty25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($qty26.equalsIgnoreCase(name)) {
			qty26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($qty27.equalsIgnoreCase(name)) {
			qty27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($qty28.equalsIgnoreCase(name)) {
			qty28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($qty29.equalsIgnoreCase(name)) {
			qty29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($qty30.equalsIgnoreCase(name)) {
			qty30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
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
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($qty13.equalsIgnoreCase(name)) {
			qty13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($qty14.equalsIgnoreCase(name)) {
			qty14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($qty15.equalsIgnoreCase(name)) {
			qty15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($qty16.equalsIgnoreCase(name)) {
			qty16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($qty17.equalsIgnoreCase(name)) {
			qty17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($qty18.equalsIgnoreCase(name)) {
			qty18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($qty19.equalsIgnoreCase(name)) {
			qty19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($qty20.equalsIgnoreCase(name)) {
			qty20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($qty21.equalsIgnoreCase(name)) {
			qty21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($qty22.equalsIgnoreCase(name)) {
			qty22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($qty23.equalsIgnoreCase(name)) {
			qty23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($qty24.equalsIgnoreCase(name)) {
			qty24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($qty25.equalsIgnoreCase(name)) {
			qty25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($qty26.equalsIgnoreCase(name)) {
			qty26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($qty27.equalsIgnoreCase(name)) {
			qty27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($qty28.equalsIgnoreCase(name)) {
			qty28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($qty29.equalsIgnoreCase(name)) {
			qty29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($qty30.equalsIgnoreCase(name)) {
			qty30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
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
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($qty13.equalsIgnoreCase(name)) {
			qty13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($qty14.equalsIgnoreCase(name)) {
			qty14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($qty15.equalsIgnoreCase(name)) {
			qty15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($qty16.equalsIgnoreCase(name)) {
			qty16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($qty17.equalsIgnoreCase(name)) {
			qty17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($qty18.equalsIgnoreCase(name)) {
			qty18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($qty19.equalsIgnoreCase(name)) {
			qty19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($qty20.equalsIgnoreCase(name)) {
			qty20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($qty21.equalsIgnoreCase(name)) {
			qty21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($qty22.equalsIgnoreCase(name)) {
			qty22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($qty23.equalsIgnoreCase(name)) {
			qty23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($qty24.equalsIgnoreCase(name)) {
			qty24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($qty25.equalsIgnoreCase(name)) {
			qty25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($qty26.equalsIgnoreCase(name)) {
			qty26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($qty27.equalsIgnoreCase(name)) {
			qty27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($qty28.equalsIgnoreCase(name)) {
			qty28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($qty29.equalsIgnoreCase(name)) {
			qty29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($qty30.equalsIgnoreCase(name)) {
			qty30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
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
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($qty13.equalsIgnoreCase(name)) {
			qty13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($qty14.equalsIgnoreCase(name)) {
			qty14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($qty15.equalsIgnoreCase(name)) {
			qty15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($qty16.equalsIgnoreCase(name)) {
			qty16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($qty17.equalsIgnoreCase(name)) {
			qty17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($qty18.equalsIgnoreCase(name)) {
			qty18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($qty19.equalsIgnoreCase(name)) {
			qty19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($qty20.equalsIgnoreCase(name)) {
			qty20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($qty21.equalsIgnoreCase(name)) {
			qty21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($qty22.equalsIgnoreCase(name)) {
			qty22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($qty23.equalsIgnoreCase(name)) {
			qty23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($qty24.equalsIgnoreCase(name)) {
			qty24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($qty25.equalsIgnoreCase(name)) {
			qty25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($qty26.equalsIgnoreCase(name)) {
			qty26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($qty27.equalsIgnoreCase(name)) {
			qty27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($qty28.equalsIgnoreCase(name)) {
			qty28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($qty29.equalsIgnoreCase(name)) {
			qty29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($qty30.equalsIgnoreCase(name)) {
			qty30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
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
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($qty13.equalsIgnoreCase(name)) {
			qty13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($qty14.equalsIgnoreCase(name)) {
			qty14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($qty15.equalsIgnoreCase(name)) {
			qty15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($qty16.equalsIgnoreCase(name)) {
			qty16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($qty17.equalsIgnoreCase(name)) {
			qty17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($qty18.equalsIgnoreCase(name)) {
			qty18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($qty19.equalsIgnoreCase(name)) {
			qty19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($qty20.equalsIgnoreCase(name)) {
			qty20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($qty21.equalsIgnoreCase(name)) {
			qty21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($qty22.equalsIgnoreCase(name)) {
			qty22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($qty23.equalsIgnoreCase(name)) {
			qty23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($qty24.equalsIgnoreCase(name)) {
			qty24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($qty25.equalsIgnoreCase(name)) {
			qty25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($qty26.equalsIgnoreCase(name)) {
			qty26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($qty27.equalsIgnoreCase(name)) {
			qty27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($qty28.equalsIgnoreCase(name)) {
			qty28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($qty29.equalsIgnoreCase(name)) {
			qty29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($qty30.equalsIgnoreCase(name)) {
			qty30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
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
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
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
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($qty13.equalsIgnoreCase(name)) {
			qty13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($qty14.equalsIgnoreCase(name)) {
			qty14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($qty15.equalsIgnoreCase(name)) {
			qty15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($qty16.equalsIgnoreCase(name)) {
			qty16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($qty17.equalsIgnoreCase(name)) {
			qty17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($qty18.equalsIgnoreCase(name)) {
			qty18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($qty19.equalsIgnoreCase(name)) {
			qty19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($qty20.equalsIgnoreCase(name)) {
			qty20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($qty21.equalsIgnoreCase(name)) {
			qty21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($qty22.equalsIgnoreCase(name)) {
			qty22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($qty23.equalsIgnoreCase(name)) {
			qty23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($qty24.equalsIgnoreCase(name)) {
			qty24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($qty25.equalsIgnoreCase(name)) {
			qty25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($qty26.equalsIgnoreCase(name)) {
			qty26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($qty27.equalsIgnoreCase(name)) {
			qty27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($qty28.equalsIgnoreCase(name)) {
			qty28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($qty29.equalsIgnoreCase(name)) {
			qty29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($qty30.equalsIgnoreCase(name)) {
			qty30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
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
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($qty13.equalsIgnoreCase(name)) {
			qty13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($qty14.equalsIgnoreCase(name)) {
			qty14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($qty15.equalsIgnoreCase(name)) {
			qty15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($qty16.equalsIgnoreCase(name)) {
			qty16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($qty17.equalsIgnoreCase(name)) {
			qty17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($qty18.equalsIgnoreCase(name)) {
			qty18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($qty19.equalsIgnoreCase(name)) {
			qty19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($qty20.equalsIgnoreCase(name)) {
			qty20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($qty21.equalsIgnoreCase(name)) {
			qty21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($qty22.equalsIgnoreCase(name)) {
			qty22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($qty23.equalsIgnoreCase(name)) {
			qty23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($qty24.equalsIgnoreCase(name)) {
			qty24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($qty25.equalsIgnoreCase(name)) {
			qty25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($qty26.equalsIgnoreCase(name)) {
			qty26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($qty27.equalsIgnoreCase(name)) {
			qty27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($qty28.equalsIgnoreCase(name)) {
			qty28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($qty29.equalsIgnoreCase(name)) {
			qty29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($qty30.equalsIgnoreCase(name)) {
			qty30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
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
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($qty13.equalsIgnoreCase(name)) {
			qty13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($qty14.equalsIgnoreCase(name)) {
			qty14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($qty15.equalsIgnoreCase(name)) {
			qty15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($qty16.equalsIgnoreCase(name)) {
			qty16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($qty17.equalsIgnoreCase(name)) {
			qty17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($qty18.equalsIgnoreCase(name)) {
			qty18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($qty19.equalsIgnoreCase(name)) {
			qty19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($qty20.equalsIgnoreCase(name)) {
			qty20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($qty21.equalsIgnoreCase(name)) {
			qty21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($qty22.equalsIgnoreCase(name)) {
			qty22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($qty23.equalsIgnoreCase(name)) {
			qty23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($qty24.equalsIgnoreCase(name)) {
			qty24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($qty25.equalsIgnoreCase(name)) {
			qty25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($qty26.equalsIgnoreCase(name)) {
			qty26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($qty27.equalsIgnoreCase(name)) {
			qty27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($qty28.equalsIgnoreCase(name)) {
			qty28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($qty29.equalsIgnoreCase(name)) {
			qty29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($qty30.equalsIgnoreCase(name)) {
			qty30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
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
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($qty13.equalsIgnoreCase(name)) {
			qty13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($qty14.equalsIgnoreCase(name)) {
			qty14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($qty15.equalsIgnoreCase(name)) {
			qty15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($qty16.equalsIgnoreCase(name)) {
			qty16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($qty17.equalsIgnoreCase(name)) {
			qty17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($qty18.equalsIgnoreCase(name)) {
			qty18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($qty19.equalsIgnoreCase(name)) {
			qty19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($qty20.equalsIgnoreCase(name)) {
			qty20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($qty21.equalsIgnoreCase(name)) {
			qty21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($qty22.equalsIgnoreCase(name)) {
			qty22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($qty23.equalsIgnoreCase(name)) {
			qty23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($qty24.equalsIgnoreCase(name)) {
			qty24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($qty25.equalsIgnoreCase(name)) {
			qty25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($qty26.equalsIgnoreCase(name)) {
			qty26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($qty27.equalsIgnoreCase(name)) {
			qty27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($qty28.equalsIgnoreCase(name)) {
			qty28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($qty29.equalsIgnoreCase(name)) {
			qty29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($qty30.equalsIgnoreCase(name)) {
			qty30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
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
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($amt01.equalsIgnoreCase(name)) {
			amt01(value);
			return;
		}
		if ($std01.equalsIgnoreCase(name)) {
			std01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($amt02.equalsIgnoreCase(name)) {
			amt02(value);
			return;
		}
		if ($std02.equalsIgnoreCase(name)) {
			std02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($amt03.equalsIgnoreCase(name)) {
			amt03(value);
			return;
		}
		if ($std03.equalsIgnoreCase(name)) {
			std03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($amt04.equalsIgnoreCase(name)) {
			amt04(value);
			return;
		}
		if ($std04.equalsIgnoreCase(name)) {
			std04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($amt05.equalsIgnoreCase(name)) {
			amt05(value);
			return;
		}
		if ($std05.equalsIgnoreCase(name)) {
			std05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($amt06.equalsIgnoreCase(name)) {
			amt06(value);
			return;
		}
		if ($std06.equalsIgnoreCase(name)) {
			std06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($amt07.equalsIgnoreCase(name)) {
			amt07(value);
			return;
		}
		if ($std07.equalsIgnoreCase(name)) {
			std07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($amt08.equalsIgnoreCase(name)) {
			amt08(value);
			return;
		}
		if ($std08.equalsIgnoreCase(name)) {
			std08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($amt09.equalsIgnoreCase(name)) {
			amt09(value);
			return;
		}
		if ($std09.equalsIgnoreCase(name)) {
			std09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($amt10.equalsIgnoreCase(name)) {
			amt10(value);
			return;
		}
		if ($std10.equalsIgnoreCase(name)) {
			std10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($amt11.equalsIgnoreCase(name)) {
			amt11(value);
			return;
		}
		if ($std11.equalsIgnoreCase(name)) {
			std11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		if ($amt12.equalsIgnoreCase(name)) {
			amt12(value);
			return;
		}
		if ($std12.equalsIgnoreCase(name)) {
			std12(value);
			return;
		}
		if ($qty13.equalsIgnoreCase(name)) {
			qty13(value);
			return;
		}
		if ($amt13.equalsIgnoreCase(name)) {
			amt13(value);
			return;
		}
		if ($std13.equalsIgnoreCase(name)) {
			std13(value);
			return;
		}
		if ($qty14.equalsIgnoreCase(name)) {
			qty14(value);
			return;
		}
		if ($amt14.equalsIgnoreCase(name)) {
			amt14(value);
			return;
		}
		if ($std14.equalsIgnoreCase(name)) {
			std14(value);
			return;
		}
		if ($qty15.equalsIgnoreCase(name)) {
			qty15(value);
			return;
		}
		if ($amt15.equalsIgnoreCase(name)) {
			amt15(value);
			return;
		}
		if ($std15.equalsIgnoreCase(name)) {
			std15(value);
			return;
		}
		if ($qty16.equalsIgnoreCase(name)) {
			qty16(value);
			return;
		}
		if ($amt16.equalsIgnoreCase(name)) {
			amt16(value);
			return;
		}
		if ($std16.equalsIgnoreCase(name)) {
			std16(value);
			return;
		}
		if ($qty17.equalsIgnoreCase(name)) {
			qty17(value);
			return;
		}
		if ($amt17.equalsIgnoreCase(name)) {
			amt17(value);
			return;
		}
		if ($std17.equalsIgnoreCase(name)) {
			std17(value);
			return;
		}
		if ($qty18.equalsIgnoreCase(name)) {
			qty18(value);
			return;
		}
		if ($amt18.equalsIgnoreCase(name)) {
			amt18(value);
			return;
		}
		if ($std18.equalsIgnoreCase(name)) {
			std18(value);
			return;
		}
		if ($qty19.equalsIgnoreCase(name)) {
			qty19(value);
			return;
		}
		if ($amt19.equalsIgnoreCase(name)) {
			amt19(value);
			return;
		}
		if ($std19.equalsIgnoreCase(name)) {
			std19(value);
			return;
		}
		if ($qty20.equalsIgnoreCase(name)) {
			qty20(value);
			return;
		}
		if ($amt20.equalsIgnoreCase(name)) {
			amt20(value);
			return;
		}
		if ($std20.equalsIgnoreCase(name)) {
			std20(value);
			return;
		}
		if ($qty21.equalsIgnoreCase(name)) {
			qty21(value);
			return;
		}
		if ($amt21.equalsIgnoreCase(name)) {
			amt21(value);
			return;
		}
		if ($std21.equalsIgnoreCase(name)) {
			std21(value);
			return;
		}
		if ($qty22.equalsIgnoreCase(name)) {
			qty22(value);
			return;
		}
		if ($amt22.equalsIgnoreCase(name)) {
			amt22(value);
			return;
		}
		if ($std22.equalsIgnoreCase(name)) {
			std22(value);
			return;
		}
		if ($qty23.equalsIgnoreCase(name)) {
			qty23(value);
			return;
		}
		if ($amt23.equalsIgnoreCase(name)) {
			amt23(value);
			return;
		}
		if ($std23.equalsIgnoreCase(name)) {
			std23(value);
			return;
		}
		if ($qty24.equalsIgnoreCase(name)) {
			qty24(value);
			return;
		}
		if ($amt24.equalsIgnoreCase(name)) {
			amt24(value);
			return;
		}
		if ($std24.equalsIgnoreCase(name)) {
			std24(value);
			return;
		}
		if ($qty25.equalsIgnoreCase(name)) {
			qty25(value);
			return;
		}
		if ($amt25.equalsIgnoreCase(name)) {
			amt25(value);
			return;
		}
		if ($std25.equalsIgnoreCase(name)) {
			std25(value);
			return;
		}
		if ($qty26.equalsIgnoreCase(name)) {
			qty26(value);
			return;
		}
		if ($amt26.equalsIgnoreCase(name)) {
			amt26(value);
			return;
		}
		if ($std26.equalsIgnoreCase(name)) {
			std26(value);
			return;
		}
		if ($qty27.equalsIgnoreCase(name)) {
			qty27(value);
			return;
		}
		if ($amt27.equalsIgnoreCase(name)) {
			amt27(value);
			return;
		}
		if ($std27.equalsIgnoreCase(name)) {
			std27(value);
			return;
		}
		if ($qty28.equalsIgnoreCase(name)) {
			qty28(value);
			return;
		}
		if ($amt28.equalsIgnoreCase(name)) {
			amt28(value);
			return;
		}
		if ($std28.equalsIgnoreCase(name)) {
			std28(value);
			return;
		}
		if ($qty29.equalsIgnoreCase(name)) {
			qty29(value);
			return;
		}
		if ($amt29.equalsIgnoreCase(name)) {
			amt29(value);
			return;
		}
		if ($std29.equalsIgnoreCase(name)) {
			std29(value);
			return;
		}
		if ($qty30.equalsIgnoreCase(name)) {
			qty30(value);
			return;
		}
		if ($amt30.equalsIgnoreCase(name)) {
			amt30(value);
			return;
		}
		if ($std30.equalsIgnoreCase(name)) {
			std30(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($diff_std.equalsIgnoreCase(name)) {
			diff_std(value);
			return;
		}
		if ($ave_tgt.equalsIgnoreCase(name)) {
			ave_tgt(value);
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

