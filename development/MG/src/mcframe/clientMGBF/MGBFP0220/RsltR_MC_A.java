package mcframe.clientMGBF.MGBFP0220;

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
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
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
	public static final String $st_stk_upri = "st_stk_upri";
	public static final String $qty1_p = "qty1_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $st_stk_amt = "st_stk_amt";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $mfg_upri = "mfg_upri";
	public static final String $qty2_p = "qty2_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $mfg_amt = "mfg_amt";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $purc_upri = "purc_upri";
	public static final String $qty3_p = "qty3_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $purc_amt = "purc_amt";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $mfg_gr_upri = "mfg_gr_upri";
	public static final String $qty4_p = "qty4_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $mfg_gr_amt = "mfg_gr_amt";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $othr_gr_upri = "othr_gr_upri";
	public static final String $qty5_p = "qty5_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $othr_gr_amt = "othr_gr_amt";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $alc_upri = "alc_upri";
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public static final String $alc_qty = "alc_qty";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $alc_amt = "alc_amt";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $ave_amt = "ave_amt";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $ave_upri1 = "ave_upri1";
	public static final String $qty6_p = "qty6_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $ave_upri = "ave_upri";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $inpt_upri = "inpt_upri";
	public static final String $qty7_p = "qty7_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $inpt_amt = "inpt_amt";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $plnt_gi_upri = "plnt_gi_upri";
	public static final String $qty8_p = "qty8_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $plnt_gi_amt = "plnt_gi_amt";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $othr_gi_upri = "othr_gi_upri";
	public static final String $qty9_p = "qty9_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $othr_gi_amt = "othr_gi_amt";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $prov_upri = "prov_upri";
	public static final String $qty10_p = "qty10_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $prov_amt = "prov_amt";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $sls_upri = "sls_upri";
	public static final String $qty11_p = "qty11_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $sls_amt = "sls_amt";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $end_stk_upri = "end_stk_upri";
	public static final String $qty12_p = "qty12_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $end_stk_amt = "end_stk_amt";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $diff_upri = "diff_upri";
	public static final String $qty13_p = "qty13_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $diff_amt = "diff_amt";
	public static final String $qty14_p = "qty14_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $xpns_inpt_amt = "xpns_inpt_amt";
	/**
	 * Rate 率.<p>
	 *
	 */
	public static final String $stk_trn_rate = "stk_trn_rate";
	/**
	 * Number of days 日数.<p>
	 *
	 */
	public static final String $stk_trn_days = "stk_trn_days";
	/**
	 * Rate 率.<p>
	 *
	 */
	public static final String $stk_trn_rate_qty = "stk_trn_rate_qty";
	/**
	 * Number of days 日数.<p>
	 *
	 */
	public static final String $stk_trn_days_qty = "stk_trn_days_qty";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $st_stk_qty = $qty1_p + ".qty";
	public static final String $mfg_qty = $qty2_p + ".qty";
	public static final String $purc_qty = $qty3_p + ".qty";
	public static final String $mfg_gr_qty = $qty4_p + ".qty";
	public static final String $othr_gr_qty = $qty5_p + ".qty";
	public static final String $std_qty = $qty6_p + ".qty";
	public static final String $inpt_qty = $qty7_p + ".qty";
	public static final String $plnt_gi_qty = $qty8_p + ".qty";
	public static final String $othr_gi_qty = $qty9_p + ".qty";
	public static final String $prov_qty = $qty10_p + ".qty";
	public static final String $sls_qty = $qty11_p + ".qty";
	public static final String $end_stk_qty = $qty12_p + ".qty";
	public static final String $diff_qty = $qty13_p + ".qty";
	public static final String $xpns_inpt_qty = $qty14_p + ".qty";

	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
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
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta st_stk_upri_META = createCommonMeta($st_stk_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty1_p_META = createInnerRowMeta($qty1_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta st_stk_amt_META = createCommonMeta($st_stk_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta mfg_upri_META = createCommonMeta($mfg_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty2_p_META = createInnerRowMeta($qty2_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta mfg_amt_META = createCommonMeta($mfg_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_upri_META = createCommonMeta($purc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty3_p_META = createInnerRowMeta($qty3_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_amt_META = createCommonMeta($purc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta mfg_gr_upri_META = createCommonMeta($mfg_gr_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty4_p_META = createInnerRowMeta($qty4_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta mfg_gr_amt_META = createCommonMeta($mfg_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta othr_gr_upri_META = createCommonMeta($othr_gr_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty5_p_META = createInnerRowMeta($qty5_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta othr_gr_amt_META = createCommonMeta($othr_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta alc_upri_META = createCommonMeta($alc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta alc_qty_META = createCommonMeta($alc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alc_amt_META = createCommonMeta($alc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ave_amt_META = createCommonMeta($ave_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ave_upri1_META = createCommonMeta($ave_upri1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty6_p_META = createInnerRowMeta($qty6_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta ave_upri_META = createCommonMeta($ave_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta inpt_upri_META = createCommonMeta($inpt_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty7_p_META = createInnerRowMeta($qty7_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta inpt_amt_META = createCommonMeta($inpt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta plnt_gi_upri_META = createCommonMeta($plnt_gi_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty8_p_META = createInnerRowMeta($qty8_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta plnt_gi_amt_META = createCommonMeta($plnt_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta othr_gi_upri_META = createCommonMeta($othr_gi_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty9_p_META = createInnerRowMeta($qty9_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta othr_gi_amt_META = createCommonMeta($othr_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prov_upri_META = createCommonMeta($prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty10_p_META = createInnerRowMeta($qty10_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta prov_amt_META = createCommonMeta($prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_upri_META = createCommonMeta($sls_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty11_p_META = createInnerRowMeta($qty11_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta sls_amt_META = createCommonMeta($sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta end_stk_upri_META = createCommonMeta($end_stk_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty12_p_META = createInnerRowMeta($qty12_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta end_stk_amt_META = createCommonMeta($end_stk_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_upri_META = createCommonMeta($diff_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty13_p_META = createInnerRowMeta($qty13_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta diff_amt_META = createCommonMeta($diff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty14_p_META = createInnerRowMeta($qty14_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta xpns_inpt_amt_META = createCommonMeta($xpns_inpt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta stk_trn_rate_META = createCommonMeta($stk_trn_rate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta stk_trn_days_META = createCommonMeta($stk_trn_days, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta stk_trn_rate_qty_META = createCommonMeta($stk_trn_rate_qty, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta stk_trn_days_qty_META = createCommonMeta($stk_trn_days_qty, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			wg_cd_META,
			wg_nm_META,
			ym_META,
			dpt_cd_META,
			dpt_nm_META,
			itm_p_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
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
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			asst_typ_META,
			asst_typ_nm_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			st_stk_upri_META,
			qty1_p_META,
			st_stk_amt_META,
			mfg_upri_META,
			qty2_p_META,
			mfg_amt_META,
			purc_upri_META,
			qty3_p_META,
			purc_amt_META,
			mfg_gr_upri_META,
			qty4_p_META,
			mfg_gr_amt_META,
			othr_gr_upri_META,
			qty5_p_META,
			othr_gr_amt_META,
			alc_upri_META,
			alc_qty_META,
			alc_amt_META,
			ave_amt_META,
			ave_upri1_META,
			qty6_p_META,
			ave_upri_META,
			inpt_upri_META,
			qty7_p_META,
			inpt_amt_META,
			plnt_gi_upri_META,
			qty8_p_META,
			plnt_gi_amt_META,
			othr_gi_upri_META,
			qty9_p_META,
			othr_gi_amt_META,
			prov_upri_META,
			qty10_p_META,
			prov_amt_META,
			sls_upri_META,
			qty11_p_META,
			sls_amt_META,
			end_stk_upri_META,
			qty12_p_META,
			end_stk_amt_META,
			diff_upri_META,
			qty13_p_META,
			diff_amt_META,
			qty14_p_META,
			xpns_inpt_amt_META,
			stk_trn_rate_META,
			stk_trn_days_META,
			stk_trn_rate_qty_META,
			stk_trn_days_qty_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"st_stk_qty",
				"mfg_qty",
				"purc_qty",
				"mfg_gr_qty",
				"othr_gr_qty",
				"std_qty",
				"inpt_qty",
				"plnt_gi_qty",
				"othr_gi_qty",
				"prov_qty",
				"sls_qty",
				"end_stk_qty",
				"diff_qty",
				"xpns_inpt_qty"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$st_stk_qty,
				$mfg_qty,
				$purc_qty,
				$mfg_gr_qty,
				$othr_gr_qty,
				$std_qty,
				$inpt_qty,
				$plnt_gi_qty,
				$othr_gi_qty,
				$prov_qty,
				$sls_qty,
				$end_stk_qty,
				$diff_qty,
				$xpns_inpt_qty
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
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";

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
				{$ym, "ym_flg"},	// ym
				{$dpt_cd, "dpt_flg"},	// dpt_cd
				{$dpt_nm, "dpt_flg"},	// dpt_nm
				{$itm_p, "itm_flg"},	// itm_p
				{$itm_typ, "itm_typ_flg"},	// itm_typ
				{$itm_typ_nm, "itm_typ_flg"},	// itm_typ_nm
				{$itm_typ_d_cd, "itm_typ_d_flg"},	// itm_typ_d_cd
				{$itm_typ_d_nm, "itm_typ_d_flg"},	// itm_typ_d_nm
				{$itm_jnl_cd, "itm_jnl_flg"},	// itm_jnl_cd
				{$itm_jnl_nm, "itm_jnl_flg"},	// itm_jnl_nm
				{$itm_grp_cd1, "itm_grp_flg1"},	// itm_grp_cd1
				{$itm_grp_nm1, "itm_grp_flg1"},	// itm_grp_nm1
				{$itm_grp_cd2, "itm_grp_flg2"},	// itm_grp_cd2
				{$itm_grp_nm2, "itm_grp_flg2"},	// itm_grp_nm2
				{$itm_grp_cd3, "itm_grp_flg3"},	// itm_grp_cd3
				{$itm_grp_nm3, "itm_grp_flg3"},	// itm_grp_nm3
				{$itm_grp_cd4, "itm_grp_flg4"},	// itm_grp_cd4
				{$itm_grp_nm4, "itm_grp_flg4"},	// itm_grp_nm4
				{$itm_grp_cd5, "itm_grp_flg5"},	// itm_grp_cd5
				{$itm_grp_nm5, "itm_grp_flg5"},	// itm_grp_nm5
				{$itm_grp_cd6, "itm_grp_flg6"},	// itm_grp_cd6
				{$itm_grp_nm6, "itm_grp_flg6"},	// itm_grp_nm6
				{$itm_grp_cd7, "itm_grp_flg7"},	// itm_grp_cd7
				{$itm_grp_nm7, "itm_grp_flg7"},	// itm_grp_nm7
				{$itm_grp_cd8, "itm_grp_flg8"},	// itm_grp_cd8
				{$itm_grp_nm8, "itm_grp_flg8"},	// itm_grp_nm8
				{$itm_grp_cd9, "itm_grp_flg9"},	// itm_grp_cd9
				{$itm_grp_nm9, "itm_grp_flg9"},	// itm_grp_nm9
				{$itm_grp_cd10, "itm_grp_flg10"},	// itm_grp_cd10
				{$itm_grp_nm10, "itm_grp_flg10"},	// itm_grp_nm10
				{$lot_no, "lot_flg"},	// lot_no
				{$sublot_no, "sublot_flg"},	// sublot_no
				{$sno1, "sno1_flg"},	// sno1
				{$sno2, "sno2_flg"},	// sno2
				{$sno3, "sno3_flg"},	// sno3
				{$sno4, "sno4_flg"},	// sno4
				{$asst_typ, "asst_flg"},	// asst_typ
				{$asst_typ_nm, "asst_flg"},	// asst_typ_nm
				{$unit_cd, "qty_flg"},	// unit_cd
				{$unit_nm, "qty_flg"},	// unit_nm
				{$st_stk_upri, "qty_flg"},	// st_stk_upri
				{$qty1_p, "qty_flg"},	// qty1_p
				{$mfg_upri, "qty_flg"},	// mfg_upri
				{$qty2_p, "qty_flg"},	// qty2_p
				{$purc_upri, "qty_flg"},	// purc_upri
				{$qty3_p, "qty_flg"},	// qty3_p
				{$mfg_gr_upri, "qty_flg"},	// mfg_gr_upri
				{$qty4_p, "qty_flg"},	// qty4_p
				{$othr_gr_upri, "qty_flg"},	// othr_gr_upri
				{$qty5_p, "qty_flg"},	// qty5_p
				{$ave_upri1, "qty_flg"},	// ave_upri1
				{$qty6_p, "qty_flg"},	// qty6_p
				{$ave_upri, "qty_flg"},	// ave_upri
				{$qty7_p, "qty_flg"},	// qty7_p
				{$qty8_p, "qty_flg"},	// qty8_p
				{$qty9_p, "qty_flg"},	// qty9_p
				{$qty10_p, "qty_flg"},	// qty10_p
				{$qty11_p, "qty_flg"},	// qty11_p
				{$qty12_p, "qty_flg"},	// qty12_p
				{$qty13_p, "qty_flg"},	// qty13_p
				{$qty14_p, "qty_flg"},	// qty14_p
				{$stk_trn_rate_qty, "qty_flg"},	// stk_trn_rate_qty
				{$stk_trn_days_qty, "qty_flg"}	// stk_trn_days_qty
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
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
				{$st_stk_upri, "UNIT"},	// st_stk_upri
				{$st_stk_amt, "AMT"},	// st_stk_amt
				{$mfg_upri, "UNIT"},	// mfg_upri
				{$mfg_amt, "AMT"},	// mfg_amt
				{$purc_upri, "UNIT"},	// purc_upri
				{$purc_amt, "AMT"},	// purc_amt
				{$mfg_gr_upri, "UNIT"},	// mfg_gr_upri
				{$mfg_gr_amt, "AMT"},	// mfg_gr_amt
				{$othr_gr_upri, "UNIT"},	// othr_gr_upri
				{$othr_gr_amt, "AMT"},	// othr_gr_amt
				{$alc_amt, "AMT"},	// alc_amt
				{$ave_upri1, "UNIT"},	// ave_upri1
				{$ave_upri, "UNIT"},	// ave_upri
				{$inpt_amt, "AMT"},	// inpt_amt
				{$plnt_gi_amt, "AMT"},	// plnt_gi_amt
				{$othr_gi_amt, "AMT"},	// othr_gi_amt
				{$prov_amt, "AMT"},	// prov_amt
				{$sls_amt, "AMT"},	// sls_amt
				{$end_stk_amt, "AMT"},	// end_stk_amt
				{$diff_amt, "AMT"},	// diff_amt
				{$xpns_inpt_amt, "AMT"},	// xpns_inpt_amt
				{$stk_trn_rate, "INPUT"},	// stk_trn_rate
				{$stk_trn_days, "INPUT"},	// stk_trn_days
				{$stk_trn_rate_qty, "INPUT"},	// stk_trn_rate_qty
				{$stk_trn_days_qty, "INPUT"}	// stk_trn_days_qty
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
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 0, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 0, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 1, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 1, $wg_nm, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 2, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 2, $ym, value);
	}


	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 3, $dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 3, $dpt_cd, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 4, $dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 4, $dpt_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 5, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 5, $itm_p, row);
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
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 10, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 10, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 11, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 11, $itm_jnl_nm, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 12, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 12, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 13, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 13, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 14, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 14, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 15, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 15, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 16, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 16, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 17, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 17, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 18, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 18, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 19, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 19, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 20, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 20, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 21, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 21, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 22, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 22, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 23, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 23, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 24, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 24, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 25, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 25, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 26, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 26, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 27, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 27, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 28, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 28, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 29, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 29, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 30, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 30, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 31, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 31, $itm_grp_nm10, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 32, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 32, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 33, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 33, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 34, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 34, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 35, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 35, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 36, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 36, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 37, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 37, $sno4, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 38, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 38, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 39, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 39, $asst_typ_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 40, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 40, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 41, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 41, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 42, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 42, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 42, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 42, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 42, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 42, $dec_place, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber st_stk_upri() {
		return getConstNumber(offset + 43, $st_stk_upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void st_stk_upri(MCNumber value) {
		setConstNumber(offset + 43, $st_stk_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void st_stk_upri(int value) {
		setConstNumber(offset + 43, $st_stk_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void st_stk_upri(long value) {
		setConstNumber(offset + 43, $st_stk_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void st_stk_upri(float value) {
		setConstNumber(offset + 43, $st_stk_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void st_stk_upri(double value) {
		setConstNumber(offset + 43, $st_stk_upri, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty1_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 44, $qty1_p);
	}
	
	public void qty1_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 44, $qty1_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber st_stk_amt() {
		return getConstNumber(offset + 45, $st_stk_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void st_stk_amt(MCNumber value) {
		setConstNumber(offset + 45, $st_stk_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void st_stk_amt(int value) {
		setConstNumber(offset + 45, $st_stk_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void st_stk_amt(long value) {
		setConstNumber(offset + 45, $st_stk_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void st_stk_amt(float value) {
		setConstNumber(offset + 45, $st_stk_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void st_stk_amt(double value) {
		setConstNumber(offset + 45, $st_stk_amt, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber mfg_upri() {
		return getConstNumber(offset + 46, $mfg_upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void mfg_upri(MCNumber value) {
		setConstNumber(offset + 46, $mfg_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void mfg_upri(int value) {
		setConstNumber(offset + 46, $mfg_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void mfg_upri(long value) {
		setConstNumber(offset + 46, $mfg_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void mfg_upri(float value) {
		setConstNumber(offset + 46, $mfg_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void mfg_upri(double value) {
		setConstNumber(offset + 46, $mfg_upri, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty2_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 47, $qty2_p);
	}
	
	public void qty2_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 47, $qty2_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber mfg_amt() {
		return getConstNumber(offset + 48, $mfg_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void mfg_amt(MCNumber value) {
		setConstNumber(offset + 48, $mfg_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void mfg_amt(int value) {
		setConstNumber(offset + 48, $mfg_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void mfg_amt(long value) {
		setConstNumber(offset + 48, $mfg_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void mfg_amt(float value) {
		setConstNumber(offset + 48, $mfg_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void mfg_amt(double value) {
		setConstNumber(offset + 48, $mfg_amt, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber purc_upri() {
		return getConstNumber(offset + 49, $purc_upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void purc_upri(MCNumber value) {
		setConstNumber(offset + 49, $purc_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void purc_upri(int value) {
		setConstNumber(offset + 49, $purc_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void purc_upri(long value) {
		setConstNumber(offset + 49, $purc_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void purc_upri(float value) {
		setConstNumber(offset + 49, $purc_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void purc_upri(double value) {
		setConstNumber(offset + 49, $purc_upri, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty3_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 50, $qty3_p);
	}
	
	public void qty3_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 50, $qty3_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber purc_amt() {
		return getConstNumber(offset + 51, $purc_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void purc_amt(MCNumber value) {
		setConstNumber(offset + 51, $purc_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void purc_amt(int value) {
		setConstNumber(offset + 51, $purc_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void purc_amt(long value) {
		setConstNumber(offset + 51, $purc_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void purc_amt(float value) {
		setConstNumber(offset + 51, $purc_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void purc_amt(double value) {
		setConstNumber(offset + 51, $purc_amt, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber mfg_gr_upri() {
		return getConstNumber(offset + 52, $mfg_gr_upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void mfg_gr_upri(MCNumber value) {
		setConstNumber(offset + 52, $mfg_gr_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void mfg_gr_upri(int value) {
		setConstNumber(offset + 52, $mfg_gr_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void mfg_gr_upri(long value) {
		setConstNumber(offset + 52, $mfg_gr_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void mfg_gr_upri(float value) {
		setConstNumber(offset + 52, $mfg_gr_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void mfg_gr_upri(double value) {
		setConstNumber(offset + 52, $mfg_gr_upri, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty4_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 53, $qty4_p);
	}
	
	public void qty4_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 53, $qty4_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber mfg_gr_amt() {
		return getConstNumber(offset + 54, $mfg_gr_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void mfg_gr_amt(MCNumber value) {
		setConstNumber(offset + 54, $mfg_gr_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void mfg_gr_amt(int value) {
		setConstNumber(offset + 54, $mfg_gr_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void mfg_gr_amt(long value) {
		setConstNumber(offset + 54, $mfg_gr_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void mfg_gr_amt(float value) {
		setConstNumber(offset + 54, $mfg_gr_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void mfg_gr_amt(double value) {
		setConstNumber(offset + 54, $mfg_gr_amt, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber othr_gr_upri() {
		return getConstNumber(offset + 55, $othr_gr_upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void othr_gr_upri(MCNumber value) {
		setConstNumber(offset + 55, $othr_gr_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void othr_gr_upri(int value) {
		setConstNumber(offset + 55, $othr_gr_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void othr_gr_upri(long value) {
		setConstNumber(offset + 55, $othr_gr_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void othr_gr_upri(float value) {
		setConstNumber(offset + 55, $othr_gr_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void othr_gr_upri(double value) {
		setConstNumber(offset + 55, $othr_gr_upri, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty5_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 56, $qty5_p);
	}
	
	public void qty5_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 56, $qty5_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber othr_gr_amt() {
		return getConstNumber(offset + 57, $othr_gr_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void othr_gr_amt(MCNumber value) {
		setConstNumber(offset + 57, $othr_gr_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void othr_gr_amt(int value) {
		setConstNumber(offset + 57, $othr_gr_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void othr_gr_amt(long value) {
		setConstNumber(offset + 57, $othr_gr_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void othr_gr_amt(float value) {
		setConstNumber(offset + 57, $othr_gr_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void othr_gr_amt(double value) {
		setConstNumber(offset + 57, $othr_gr_amt, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber alc_upri() {
		return getConstNumber(offset + 58, $alc_upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void alc_upri(MCNumber value) {
		setConstNumber(offset + 58, $alc_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void alc_upri(int value) {
		setConstNumber(offset + 58, $alc_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void alc_upri(long value) {
		setConstNumber(offset + 58, $alc_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void alc_upri(float value) {
		setConstNumber(offset + 58, $alc_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void alc_upri(double value) {
		setConstNumber(offset + 58, $alc_upri, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber alc_qty() {
		return getConstNumber(offset + 59, $alc_qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void alc_qty(MCNumber value) {
		setConstNumber(offset + 59, $alc_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void alc_qty(int value) {
		setConstNumber(offset + 59, $alc_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void alc_qty(long value) {
		setConstNumber(offset + 59, $alc_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void alc_qty(float value) {
		setConstNumber(offset + 59, $alc_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void alc_qty(double value) {
		setConstNumber(offset + 59, $alc_qty, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber alc_amt() {
		return getConstNumber(offset + 60, $alc_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void alc_amt(MCNumber value) {
		setConstNumber(offset + 60, $alc_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void alc_amt(int value) {
		setConstNumber(offset + 60, $alc_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void alc_amt(long value) {
		setConstNumber(offset + 60, $alc_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void alc_amt(float value) {
		setConstNumber(offset + 60, $alc_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void alc_amt(double value) {
		setConstNumber(offset + 60, $alc_amt, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber ave_amt() {
		return getConstNumber(offset + 61, $ave_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void ave_amt(MCNumber value) {
		setConstNumber(offset + 61, $ave_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void ave_amt(int value) {
		setConstNumber(offset + 61, $ave_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void ave_amt(long value) {
		setConstNumber(offset + 61, $ave_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void ave_amt(float value) {
		setConstNumber(offset + 61, $ave_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void ave_amt(double value) {
		setConstNumber(offset + 61, $ave_amt, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber ave_upri1() {
		return getConstNumber(offset + 62, $ave_upri1);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void ave_upri1(MCNumber value) {
		setConstNumber(offset + 62, $ave_upri1, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void ave_upri1(int value) {
		setConstNumber(offset + 62, $ave_upri1, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void ave_upri1(long value) {
		setConstNumber(offset + 62, $ave_upri1, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void ave_upri1(float value) {
		setConstNumber(offset + 62, $ave_upri1, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void ave_upri1(double value) {
		setConstNumber(offset + 62, $ave_upri1, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty6_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 63, $qty6_p);
	}
	
	public void qty6_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 63, $qty6_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber ave_upri() {
		return getConstNumber(offset + 64, $ave_upri);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void ave_upri(MCNumber value) {
		setConstNumber(offset + 64, $ave_upri, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void ave_upri(int value) {
		setConstNumber(offset + 64, $ave_upri, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void ave_upri(long value) {
		setConstNumber(offset + 64, $ave_upri, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void ave_upri(float value) {
		setConstNumber(offset + 64, $ave_upri, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void ave_upri(double value) {
		setConstNumber(offset + 64, $ave_upri, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber inpt_upri() {
		return getConstNumber(offset + 65, $inpt_upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void inpt_upri(MCNumber value) {
		setConstNumber(offset + 65, $inpt_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void inpt_upri(int value) {
		setConstNumber(offset + 65, $inpt_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void inpt_upri(long value) {
		setConstNumber(offset + 65, $inpt_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void inpt_upri(float value) {
		setConstNumber(offset + 65, $inpt_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void inpt_upri(double value) {
		setConstNumber(offset + 65, $inpt_upri, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty7_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 66, $qty7_p);
	}
	
	public void qty7_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 66, $qty7_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber inpt_amt() {
		return getConstNumber(offset + 67, $inpt_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void inpt_amt(MCNumber value) {
		setConstNumber(offset + 67, $inpt_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void inpt_amt(int value) {
		setConstNumber(offset + 67, $inpt_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void inpt_amt(long value) {
		setConstNumber(offset + 67, $inpt_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void inpt_amt(float value) {
		setConstNumber(offset + 67, $inpt_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void inpt_amt(double value) {
		setConstNumber(offset + 67, $inpt_amt, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber plnt_gi_upri() {
		return getConstNumber(offset + 68, $plnt_gi_upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void plnt_gi_upri(MCNumber value) {
		setConstNumber(offset + 68, $plnt_gi_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void plnt_gi_upri(int value) {
		setConstNumber(offset + 68, $plnt_gi_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void plnt_gi_upri(long value) {
		setConstNumber(offset + 68, $plnt_gi_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void plnt_gi_upri(float value) {
		setConstNumber(offset + 68, $plnt_gi_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void plnt_gi_upri(double value) {
		setConstNumber(offset + 68, $plnt_gi_upri, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty8_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 69, $qty8_p);
	}
	
	public void qty8_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 69, $qty8_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber plnt_gi_amt() {
		return getConstNumber(offset + 70, $plnt_gi_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void plnt_gi_amt(MCNumber value) {
		setConstNumber(offset + 70, $plnt_gi_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void plnt_gi_amt(int value) {
		setConstNumber(offset + 70, $plnt_gi_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void plnt_gi_amt(long value) {
		setConstNumber(offset + 70, $plnt_gi_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void plnt_gi_amt(float value) {
		setConstNumber(offset + 70, $plnt_gi_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void plnt_gi_amt(double value) {
		setConstNumber(offset + 70, $plnt_gi_amt, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber othr_gi_upri() {
		return getConstNumber(offset + 71, $othr_gi_upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void othr_gi_upri(MCNumber value) {
		setConstNumber(offset + 71, $othr_gi_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void othr_gi_upri(int value) {
		setConstNumber(offset + 71, $othr_gi_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void othr_gi_upri(long value) {
		setConstNumber(offset + 71, $othr_gi_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void othr_gi_upri(float value) {
		setConstNumber(offset + 71, $othr_gi_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void othr_gi_upri(double value) {
		setConstNumber(offset + 71, $othr_gi_upri, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty9_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 72, $qty9_p);
	}
	
	public void qty9_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 72, $qty9_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber othr_gi_amt() {
		return getConstNumber(offset + 73, $othr_gi_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void othr_gi_amt(MCNumber value) {
		setConstNumber(offset + 73, $othr_gi_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void othr_gi_amt(int value) {
		setConstNumber(offset + 73, $othr_gi_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void othr_gi_amt(long value) {
		setConstNumber(offset + 73, $othr_gi_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void othr_gi_amt(float value) {
		setConstNumber(offset + 73, $othr_gi_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void othr_gi_amt(double value) {
		setConstNumber(offset + 73, $othr_gi_amt, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber prov_upri() {
		return getConstNumber(offset + 74, $prov_upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void prov_upri(MCNumber value) {
		setConstNumber(offset + 74, $prov_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void prov_upri(int value) {
		setConstNumber(offset + 74, $prov_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void prov_upri(long value) {
		setConstNumber(offset + 74, $prov_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void prov_upri(float value) {
		setConstNumber(offset + 74, $prov_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void prov_upri(double value) {
		setConstNumber(offset + 74, $prov_upri, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty10_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 75, $qty10_p);
	}
	
	public void qty10_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 75, $qty10_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber prov_amt() {
		return getConstNumber(offset + 76, $prov_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void prov_amt(MCNumber value) {
		setConstNumber(offset + 76, $prov_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void prov_amt(int value) {
		setConstNumber(offset + 76, $prov_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void prov_amt(long value) {
		setConstNumber(offset + 76, $prov_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void prov_amt(float value) {
		setConstNumber(offset + 76, $prov_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void prov_amt(double value) {
		setConstNumber(offset + 76, $prov_amt, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber sls_upri() {
		return getConstNumber(offset + 77, $sls_upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void sls_upri(MCNumber value) {
		setConstNumber(offset + 77, $sls_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void sls_upri(int value) {
		setConstNumber(offset + 77, $sls_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void sls_upri(long value) {
		setConstNumber(offset + 77, $sls_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void sls_upri(float value) {
		setConstNumber(offset + 77, $sls_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void sls_upri(double value) {
		setConstNumber(offset + 77, $sls_upri, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty11_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 78, $qty11_p);
	}
	
	public void qty11_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 78, $qty11_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 79, $sls_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 79, $sls_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 79, $sls_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 79, $sls_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 79, $sls_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 79, $sls_amt, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber end_stk_upri() {
		return getConstNumber(offset + 80, $end_stk_upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void end_stk_upri(MCNumber value) {
		setConstNumber(offset + 80, $end_stk_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void end_stk_upri(int value) {
		setConstNumber(offset + 80, $end_stk_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void end_stk_upri(long value) {
		setConstNumber(offset + 80, $end_stk_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void end_stk_upri(float value) {
		setConstNumber(offset + 80, $end_stk_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void end_stk_upri(double value) {
		setConstNumber(offset + 80, $end_stk_upri, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty12_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 81, $qty12_p);
	}
	
	public void qty12_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 81, $qty12_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber end_stk_amt() {
		return getConstNumber(offset + 82, $end_stk_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void end_stk_amt(MCNumber value) {
		setConstNumber(offset + 82, $end_stk_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void end_stk_amt(int value) {
		setConstNumber(offset + 82, $end_stk_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void end_stk_amt(long value) {
		setConstNumber(offset + 82, $end_stk_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void end_stk_amt(float value) {
		setConstNumber(offset + 82, $end_stk_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void end_stk_amt(double value) {
		setConstNumber(offset + 82, $end_stk_amt, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber diff_upri() {
		return getConstNumber(offset + 83, $diff_upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void diff_upri(MCNumber value) {
		setConstNumber(offset + 83, $diff_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void diff_upri(int value) {
		setConstNumber(offset + 83, $diff_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void diff_upri(long value) {
		setConstNumber(offset + 83, $diff_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void diff_upri(float value) {
		setConstNumber(offset + 83, $diff_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void diff_upri(double value) {
		setConstNumber(offset + 83, $diff_upri, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty13_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 84, $qty13_p);
	}
	
	public void qty13_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 84, $qty13_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber diff_amt() {
		return getConstNumber(offset + 85, $diff_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void diff_amt(MCNumber value) {
		setConstNumber(offset + 85, $diff_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void diff_amt(int value) {
		setConstNumber(offset + 85, $diff_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void diff_amt(long value) {
		setConstNumber(offset + 85, $diff_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void diff_amt(float value) {
		setConstNumber(offset + 85, $diff_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void diff_amt(double value) {
		setConstNumber(offset + 85, $diff_amt, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty14_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 86, $qty14_p);
	}
	
	public void qty14_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 86, $qty14_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber xpns_inpt_amt() {
		return getConstNumber(offset + 87, $xpns_inpt_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void xpns_inpt_amt(MCNumber value) {
		setConstNumber(offset + 87, $xpns_inpt_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void xpns_inpt_amt(int value) {
		setConstNumber(offset + 87, $xpns_inpt_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void xpns_inpt_amt(long value) {
		setConstNumber(offset + 87, $xpns_inpt_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void xpns_inpt_amt(float value) {
		setConstNumber(offset + 87, $xpns_inpt_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void xpns_inpt_amt(double value) {
		setConstNumber(offset + 87, $xpns_inpt_amt, value);
	}


	/**
	 * Rate 率.<p>
	 *
	 */
	public MCNumber stk_trn_rate() {
		return getConstNumber(offset + 88, $stk_trn_rate);
	}

	/**
	 * Rate 率.<p>
	 *
	 */
	public void stk_trn_rate(MCNumber value) {
		setConstNumber(offset + 88, $stk_trn_rate, value);
	}

	/**
	 * Rate 率.<p>
	 *
	 */
	public void stk_trn_rate(int value) {
		setConstNumber(offset + 88, $stk_trn_rate, value);
	}

	/**
	 * Rate 率.<p>
	 *
	 */
	public void stk_trn_rate(long value) {
		setConstNumber(offset + 88, $stk_trn_rate, value);
	}

	/**
	 * Rate 率.<p>
	 *
	 */
	public void stk_trn_rate(float value) {
		setConstNumber(offset + 88, $stk_trn_rate, value);
	}

	/**
	 * Rate 率.<p>
	 *
	 */
	public void stk_trn_rate(double value) {
		setConstNumber(offset + 88, $stk_trn_rate, value);
	}


	/**
	 * Number of days 日数.<p>
	 *
	 */
	public MCNumber stk_trn_days() {
		return getConstNumber(offset + 89, $stk_trn_days);
	}

	/**
	 * Number of days 日数.<p>
	 *
	 */
	public void stk_trn_days(MCNumber value) {
		setConstNumber(offset + 89, $stk_trn_days, value);
	}

	/**
	 * Number of days 日数.<p>
	 *
	 */
	public void stk_trn_days(int value) {
		setConstNumber(offset + 89, $stk_trn_days, value);
	}

	/**
	 * Number of days 日数.<p>
	 *
	 */
	public void stk_trn_days(long value) {
		setConstNumber(offset + 89, $stk_trn_days, value);
	}

	/**
	 * Number of days 日数.<p>
	 *
	 */
	public void stk_trn_days(float value) {
		setConstNumber(offset + 89, $stk_trn_days, value);
	}

	/**
	 * Number of days 日数.<p>
	 *
	 */
	public void stk_trn_days(double value) {
		setConstNumber(offset + 89, $stk_trn_days, value);
	}


	/**
	 * Rate 率.<p>
	 *
	 */
	public MCNumber stk_trn_rate_qty() {
		return getConstNumber(offset + 90, $stk_trn_rate_qty);
	}

	/**
	 * Rate 率.<p>
	 *
	 */
	public void stk_trn_rate_qty(MCNumber value) {
		setConstNumber(offset + 90, $stk_trn_rate_qty, value);
	}

	/**
	 * Rate 率.<p>
	 *
	 */
	public void stk_trn_rate_qty(int value) {
		setConstNumber(offset + 90, $stk_trn_rate_qty, value);
	}

	/**
	 * Rate 率.<p>
	 *
	 */
	public void stk_trn_rate_qty(long value) {
		setConstNumber(offset + 90, $stk_trn_rate_qty, value);
	}

	/**
	 * Rate 率.<p>
	 *
	 */
	public void stk_trn_rate_qty(float value) {
		setConstNumber(offset + 90, $stk_trn_rate_qty, value);
	}

	/**
	 * Rate 率.<p>
	 *
	 */
	public void stk_trn_rate_qty(double value) {
		setConstNumber(offset + 90, $stk_trn_rate_qty, value);
	}


	/**
	 * Number of days 日数.<p>
	 *
	 */
	public MCNumber stk_trn_days_qty() {
		return getConstNumber(offset + 91, $stk_trn_days_qty);
	}

	/**
	 * Number of days 日数.<p>
	 *
	 */
	public void stk_trn_days_qty(MCNumber value) {
		setConstNumber(offset + 91, $stk_trn_days_qty, value);
	}

	/**
	 * Number of days 日数.<p>
	 *
	 */
	public void stk_trn_days_qty(int value) {
		setConstNumber(offset + 91, $stk_trn_days_qty, value);
	}

	/**
	 * Number of days 日数.<p>
	 *
	 */
	public void stk_trn_days_qty(long value) {
		setConstNumber(offset + 91, $stk_trn_days_qty, value);
	}

	/**
	 * Number of days 日数.<p>
	 *
	 */
	public void stk_trn_days_qty(float value) {
		setConstNumber(offset + 91, $stk_trn_days_qty, value);
	}

	/**
	 * Number of days 日数.<p>
	 *
	 */
	public void stk_trn_days_qty(double value) {
		setConstNumber(offset + 91, $stk_trn_days_qty, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
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
		if ($st_stk_upri.equalsIgnoreCase(name)) {
			return st_stk_upri();
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			return st_stk_amt();
		}
		if ($mfg_upri.equalsIgnoreCase(name)) {
			return mfg_upri();
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			return mfg_amt();
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			return purc_upri();
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			return purc_amt();
		}
		if ($mfg_gr_upri.equalsIgnoreCase(name)) {
			return mfg_gr_upri();
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			return mfg_gr_amt();
		}
		if ($othr_gr_upri.equalsIgnoreCase(name)) {
			return othr_gr_upri();
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			return othr_gr_amt();
		}
		if ($alc_upri.equalsIgnoreCase(name)) {
			return alc_upri();
		}
		if ($alc_qty.equalsIgnoreCase(name)) {
			return alc_qty();
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			return alc_amt();
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			return ave_amt();
		}
		if ($ave_upri1.equalsIgnoreCase(name)) {
			return ave_upri1();
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			return ave_upri();
		}
		if ($inpt_upri.equalsIgnoreCase(name)) {
			return inpt_upri();
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			return inpt_amt();
		}
		if ($plnt_gi_upri.equalsIgnoreCase(name)) {
			return plnt_gi_upri();
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			return plnt_gi_amt();
		}
		if ($othr_gi_upri.equalsIgnoreCase(name)) {
			return othr_gi_upri();
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			return othr_gi_amt();
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			return prov_upri();
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			return prov_amt();
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			return sls_upri();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($end_stk_upri.equalsIgnoreCase(name)) {
			return end_stk_upri();
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			return end_stk_amt();
		}
		if ($diff_upri.equalsIgnoreCase(name)) {
			return diff_upri();
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			return diff_amt();
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			return xpns_inpt_amt();
		}
		if ($stk_trn_rate.equalsIgnoreCase(name)) {
			return stk_trn_rate();
		}
		if ($stk_trn_days.equalsIgnoreCase(name)) {
			return stk_trn_days();
		}
		if ($stk_trn_rate_qty.equalsIgnoreCase(name)) {
			return stk_trn_rate_qty();
		}
		if ($stk_trn_days_qty.equalsIgnoreCase(name)) {
			return stk_trn_days_qty();
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
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
		if ($st_stk_upri.equalsIgnoreCase(name)) {
			return st_stk_upri();
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			return st_stk_amt();
		}
		if ($mfg_upri.equalsIgnoreCase(name)) {
			return mfg_upri();
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			return mfg_amt();
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			return purc_upri();
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			return purc_amt();
		}
		if ($mfg_gr_upri.equalsIgnoreCase(name)) {
			return mfg_gr_upri();
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			return mfg_gr_amt();
		}
		if ($othr_gr_upri.equalsIgnoreCase(name)) {
			return othr_gr_upri();
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			return othr_gr_amt();
		}
		if ($alc_upri.equalsIgnoreCase(name)) {
			return alc_upri();
		}
		if ($alc_qty.equalsIgnoreCase(name)) {
			return alc_qty();
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			return alc_amt();
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			return ave_amt();
		}
		if ($ave_upri1.equalsIgnoreCase(name)) {
			return ave_upri1();
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			return ave_upri();
		}
		if ($inpt_upri.equalsIgnoreCase(name)) {
			return inpt_upri();
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			return inpt_amt();
		}
		if ($plnt_gi_upri.equalsIgnoreCase(name)) {
			return plnt_gi_upri();
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			return plnt_gi_amt();
		}
		if ($othr_gi_upri.equalsIgnoreCase(name)) {
			return othr_gi_upri();
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			return othr_gi_amt();
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			return prov_upri();
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			return prov_amt();
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			return sls_upri();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($end_stk_upri.equalsIgnoreCase(name)) {
			return end_stk_upri();
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			return end_stk_amt();
		}
		if ($diff_upri.equalsIgnoreCase(name)) {
			return diff_upri();
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			return diff_amt();
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			return xpns_inpt_amt();
		}
		if ($stk_trn_rate.equalsIgnoreCase(name)) {
			return stk_trn_rate();
		}
		if ($stk_trn_days.equalsIgnoreCase(name)) {
			return stk_trn_days();
		}
		if ($stk_trn_rate_qty.equalsIgnoreCase(name)) {
			return stk_trn_rate_qty();
		}
		if ($stk_trn_days_qty.equalsIgnoreCase(name)) {
			return stk_trn_days_qty();
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
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
		if ($st_stk_upri.equalsIgnoreCase(name)) {
			st_stk_upri(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_upri.equalsIgnoreCase(name)) {
			mfg_upri(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_upri.equalsIgnoreCase(name)) {
			mfg_gr_upri(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_upri.equalsIgnoreCase(name)) {
			othr_gr_upri(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_upri.equalsIgnoreCase(name)) {
			alc_upri(value);
			return;
		}
		if ($alc_qty.equalsIgnoreCase(name)) {
			alc_qty(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			ave_amt(value);
			return;
		}
		if ($ave_upri1.equalsIgnoreCase(name)) {
			ave_upri1(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($inpt_upri.equalsIgnoreCase(name)) {
			inpt_upri(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_upri.equalsIgnoreCase(name)) {
			plnt_gi_upri(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_upri.equalsIgnoreCase(name)) {
			othr_gi_upri(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			prov_upri(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
			return;
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			sls_upri(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($end_stk_upri.equalsIgnoreCase(name)) {
			end_stk_upri(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_upri.equalsIgnoreCase(name)) {
			diff_upri(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		if ($stk_trn_rate.equalsIgnoreCase(name)) {
			stk_trn_rate(value);
			return;
		}
		if ($stk_trn_days.equalsIgnoreCase(name)) {
			stk_trn_days(value);
			return;
		}
		if ($stk_trn_rate_qty.equalsIgnoreCase(name)) {
			stk_trn_rate_qty(value);
			return;
		}
		if ($stk_trn_days_qty.equalsIgnoreCase(name)) {
			stk_trn_days_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_stk_upri.equalsIgnoreCase(name)) {
			st_stk_upri(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_upri.equalsIgnoreCase(name)) {
			mfg_upri(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_upri.equalsIgnoreCase(name)) {
			mfg_gr_upri(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_upri.equalsIgnoreCase(name)) {
			othr_gr_upri(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_upri.equalsIgnoreCase(name)) {
			alc_upri(value);
			return;
		}
		if ($alc_qty.equalsIgnoreCase(name)) {
			alc_qty(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			ave_amt(value);
			return;
		}
		if ($ave_upri1.equalsIgnoreCase(name)) {
			ave_upri1(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($inpt_upri.equalsIgnoreCase(name)) {
			inpt_upri(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_upri.equalsIgnoreCase(name)) {
			plnt_gi_upri(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_upri.equalsIgnoreCase(name)) {
			othr_gi_upri(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			prov_upri(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
			return;
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			sls_upri(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($end_stk_upri.equalsIgnoreCase(name)) {
			end_stk_upri(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_upri.equalsIgnoreCase(name)) {
			diff_upri(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		if ($stk_trn_rate.equalsIgnoreCase(name)) {
			stk_trn_rate(value);
			return;
		}
		if ($stk_trn_days.equalsIgnoreCase(name)) {
			stk_trn_days(value);
			return;
		}
		if ($stk_trn_rate_qty.equalsIgnoreCase(name)) {
			stk_trn_rate_qty(value);
			return;
		}
		if ($stk_trn_days_qty.equalsIgnoreCase(name)) {
			stk_trn_days_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_stk_upri.equalsIgnoreCase(name)) {
			st_stk_upri(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_upri.equalsIgnoreCase(name)) {
			mfg_upri(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_upri.equalsIgnoreCase(name)) {
			mfg_gr_upri(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_upri.equalsIgnoreCase(name)) {
			othr_gr_upri(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_upri.equalsIgnoreCase(name)) {
			alc_upri(value);
			return;
		}
		if ($alc_qty.equalsIgnoreCase(name)) {
			alc_qty(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			ave_amt(value);
			return;
		}
		if ($ave_upri1.equalsIgnoreCase(name)) {
			ave_upri1(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($inpt_upri.equalsIgnoreCase(name)) {
			inpt_upri(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_upri.equalsIgnoreCase(name)) {
			plnt_gi_upri(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_upri.equalsIgnoreCase(name)) {
			othr_gi_upri(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			prov_upri(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
			return;
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			sls_upri(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($end_stk_upri.equalsIgnoreCase(name)) {
			end_stk_upri(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_upri.equalsIgnoreCase(name)) {
			diff_upri(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		if ($stk_trn_rate.equalsIgnoreCase(name)) {
			stk_trn_rate(value);
			return;
		}
		if ($stk_trn_days.equalsIgnoreCase(name)) {
			stk_trn_days(value);
			return;
		}
		if ($stk_trn_rate_qty.equalsIgnoreCase(name)) {
			stk_trn_rate_qty(value);
			return;
		}
		if ($stk_trn_days_qty.equalsIgnoreCase(name)) {
			stk_trn_days_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_stk_upri.equalsIgnoreCase(name)) {
			st_stk_upri(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_upri.equalsIgnoreCase(name)) {
			mfg_upri(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_upri.equalsIgnoreCase(name)) {
			mfg_gr_upri(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_upri.equalsIgnoreCase(name)) {
			othr_gr_upri(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_upri.equalsIgnoreCase(name)) {
			alc_upri(value);
			return;
		}
		if ($alc_qty.equalsIgnoreCase(name)) {
			alc_qty(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			ave_amt(value);
			return;
		}
		if ($ave_upri1.equalsIgnoreCase(name)) {
			ave_upri1(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($inpt_upri.equalsIgnoreCase(name)) {
			inpt_upri(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_upri.equalsIgnoreCase(name)) {
			plnt_gi_upri(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_upri.equalsIgnoreCase(name)) {
			othr_gi_upri(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			prov_upri(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
			return;
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			sls_upri(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($end_stk_upri.equalsIgnoreCase(name)) {
			end_stk_upri(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_upri.equalsIgnoreCase(name)) {
			diff_upri(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		if ($stk_trn_rate.equalsIgnoreCase(name)) {
			stk_trn_rate(value);
			return;
		}
		if ($stk_trn_days.equalsIgnoreCase(name)) {
			stk_trn_days(value);
			return;
		}
		if ($stk_trn_rate_qty.equalsIgnoreCase(name)) {
			stk_trn_rate_qty(value);
			return;
		}
		if ($stk_trn_days_qty.equalsIgnoreCase(name)) {
			stk_trn_days_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_stk_upri.equalsIgnoreCase(name)) {
			st_stk_upri(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_upri.equalsIgnoreCase(name)) {
			mfg_upri(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_upri.equalsIgnoreCase(name)) {
			mfg_gr_upri(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_upri.equalsIgnoreCase(name)) {
			othr_gr_upri(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_upri.equalsIgnoreCase(name)) {
			alc_upri(value);
			return;
		}
		if ($alc_qty.equalsIgnoreCase(name)) {
			alc_qty(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			ave_amt(value);
			return;
		}
		if ($ave_upri1.equalsIgnoreCase(name)) {
			ave_upri1(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($inpt_upri.equalsIgnoreCase(name)) {
			inpt_upri(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_upri.equalsIgnoreCase(name)) {
			plnt_gi_upri(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_upri.equalsIgnoreCase(name)) {
			othr_gi_upri(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			prov_upri(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
			return;
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			sls_upri(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($end_stk_upri.equalsIgnoreCase(name)) {
			end_stk_upri(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_upri.equalsIgnoreCase(name)) {
			diff_upri(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		if ($stk_trn_rate.equalsIgnoreCase(name)) {
			stk_trn_rate(value);
			return;
		}
		if ($stk_trn_days.equalsIgnoreCase(name)) {
			stk_trn_days(value);
			return;
		}
		if ($stk_trn_rate_qty.equalsIgnoreCase(name)) {
			stk_trn_rate_qty(value);
			return;
		}
		if ($stk_trn_days_qty.equalsIgnoreCase(name)) {
			stk_trn_days_qty(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
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
		if ($st_stk_upri.equalsIgnoreCase(name)) {
			st_stk_upri(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_upri.equalsIgnoreCase(name)) {
			mfg_upri(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_upri.equalsIgnoreCase(name)) {
			mfg_gr_upri(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_upri.equalsIgnoreCase(name)) {
			othr_gr_upri(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_upri.equalsIgnoreCase(name)) {
			alc_upri(value);
			return;
		}
		if ($alc_qty.equalsIgnoreCase(name)) {
			alc_qty(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			ave_amt(value);
			return;
		}
		if ($ave_upri1.equalsIgnoreCase(name)) {
			ave_upri1(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($inpt_upri.equalsIgnoreCase(name)) {
			inpt_upri(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_upri.equalsIgnoreCase(name)) {
			plnt_gi_upri(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_upri.equalsIgnoreCase(name)) {
			othr_gi_upri(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			prov_upri(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
			return;
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			sls_upri(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($end_stk_upri.equalsIgnoreCase(name)) {
			end_stk_upri(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_upri.equalsIgnoreCase(name)) {
			diff_upri(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		if ($stk_trn_rate.equalsIgnoreCase(name)) {
			stk_trn_rate(value);
			return;
		}
		if ($stk_trn_days.equalsIgnoreCase(name)) {
			stk_trn_days(value);
			return;
		}
		if ($stk_trn_rate_qty.equalsIgnoreCase(name)) {
			stk_trn_rate_qty(value);
			return;
		}
		if ($stk_trn_days_qty.equalsIgnoreCase(name)) {
			stk_trn_days_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_stk_upri.equalsIgnoreCase(name)) {
			st_stk_upri(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_upri.equalsIgnoreCase(name)) {
			mfg_upri(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_upri.equalsIgnoreCase(name)) {
			mfg_gr_upri(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_upri.equalsIgnoreCase(name)) {
			othr_gr_upri(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_upri.equalsIgnoreCase(name)) {
			alc_upri(value);
			return;
		}
		if ($alc_qty.equalsIgnoreCase(name)) {
			alc_qty(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			ave_amt(value);
			return;
		}
		if ($ave_upri1.equalsIgnoreCase(name)) {
			ave_upri1(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($inpt_upri.equalsIgnoreCase(name)) {
			inpt_upri(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_upri.equalsIgnoreCase(name)) {
			plnt_gi_upri(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_upri.equalsIgnoreCase(name)) {
			othr_gi_upri(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			prov_upri(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
			return;
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			sls_upri(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($end_stk_upri.equalsIgnoreCase(name)) {
			end_stk_upri(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_upri.equalsIgnoreCase(name)) {
			diff_upri(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		if ($stk_trn_rate.equalsIgnoreCase(name)) {
			stk_trn_rate(value);
			return;
		}
		if ($stk_trn_days.equalsIgnoreCase(name)) {
			stk_trn_days(value);
			return;
		}
		if ($stk_trn_rate_qty.equalsIgnoreCase(name)) {
			stk_trn_rate_qty(value);
			return;
		}
		if ($stk_trn_days_qty.equalsIgnoreCase(name)) {
			stk_trn_days_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_stk_upri.equalsIgnoreCase(name)) {
			st_stk_upri(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_upri.equalsIgnoreCase(name)) {
			mfg_upri(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_upri.equalsIgnoreCase(name)) {
			mfg_gr_upri(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_upri.equalsIgnoreCase(name)) {
			othr_gr_upri(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_upri.equalsIgnoreCase(name)) {
			alc_upri(value);
			return;
		}
		if ($alc_qty.equalsIgnoreCase(name)) {
			alc_qty(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			ave_amt(value);
			return;
		}
		if ($ave_upri1.equalsIgnoreCase(name)) {
			ave_upri1(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($inpt_upri.equalsIgnoreCase(name)) {
			inpt_upri(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_upri.equalsIgnoreCase(name)) {
			plnt_gi_upri(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_upri.equalsIgnoreCase(name)) {
			othr_gi_upri(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			prov_upri(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
			return;
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			sls_upri(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($end_stk_upri.equalsIgnoreCase(name)) {
			end_stk_upri(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_upri.equalsIgnoreCase(name)) {
			diff_upri(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		if ($stk_trn_rate.equalsIgnoreCase(name)) {
			stk_trn_rate(value);
			return;
		}
		if ($stk_trn_days.equalsIgnoreCase(name)) {
			stk_trn_days(value);
			return;
		}
		if ($stk_trn_rate_qty.equalsIgnoreCase(name)) {
			stk_trn_rate_qty(value);
			return;
		}
		if ($stk_trn_days_qty.equalsIgnoreCase(name)) {
			stk_trn_days_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_stk_upri.equalsIgnoreCase(name)) {
			st_stk_upri(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_upri.equalsIgnoreCase(name)) {
			mfg_upri(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_upri.equalsIgnoreCase(name)) {
			mfg_gr_upri(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_upri.equalsIgnoreCase(name)) {
			othr_gr_upri(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_upri.equalsIgnoreCase(name)) {
			alc_upri(value);
			return;
		}
		if ($alc_qty.equalsIgnoreCase(name)) {
			alc_qty(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			ave_amt(value);
			return;
		}
		if ($ave_upri1.equalsIgnoreCase(name)) {
			ave_upri1(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($inpt_upri.equalsIgnoreCase(name)) {
			inpt_upri(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_upri.equalsIgnoreCase(name)) {
			plnt_gi_upri(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_upri.equalsIgnoreCase(name)) {
			othr_gi_upri(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			prov_upri(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
			return;
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			sls_upri(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($end_stk_upri.equalsIgnoreCase(name)) {
			end_stk_upri(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_upri.equalsIgnoreCase(name)) {
			diff_upri(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		if ($stk_trn_rate.equalsIgnoreCase(name)) {
			stk_trn_rate(value);
			return;
		}
		if ($stk_trn_days.equalsIgnoreCase(name)) {
			stk_trn_days(value);
			return;
		}
		if ($stk_trn_rate_qty.equalsIgnoreCase(name)) {
			stk_trn_rate_qty(value);
			return;
		}
		if ($stk_trn_days_qty.equalsIgnoreCase(name)) {
			stk_trn_days_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_stk_upri.equalsIgnoreCase(name)) {
			st_stk_upri(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_upri.equalsIgnoreCase(name)) {
			mfg_upri(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_upri.equalsIgnoreCase(name)) {
			mfg_gr_upri(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_upri.equalsIgnoreCase(name)) {
			othr_gr_upri(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_upri.equalsIgnoreCase(name)) {
			alc_upri(value);
			return;
		}
		if ($alc_qty.equalsIgnoreCase(name)) {
			alc_qty(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			ave_amt(value);
			return;
		}
		if ($ave_upri1.equalsIgnoreCase(name)) {
			ave_upri1(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($inpt_upri.equalsIgnoreCase(name)) {
			inpt_upri(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_upri.equalsIgnoreCase(name)) {
			plnt_gi_upri(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_upri.equalsIgnoreCase(name)) {
			othr_gi_upri(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			prov_upri(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
			return;
		}
		if ($sls_upri.equalsIgnoreCase(name)) {
			sls_upri(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($end_stk_upri.equalsIgnoreCase(name)) {
			end_stk_upri(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_upri.equalsIgnoreCase(name)) {
			diff_upri(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		if ($stk_trn_rate.equalsIgnoreCase(name)) {
			stk_trn_rate(value);
			return;
		}
		if ($stk_trn_days.equalsIgnoreCase(name)) {
			stk_trn_days(value);
			return;
		}
		if ($stk_trn_rate_qty.equalsIgnoreCase(name)) {
			stk_trn_rate_qty(value);
			return;
		}
		if ($stk_trn_days_qty.equalsIgnoreCase(name)) {
			stk_trn_days_qty(value);
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
		if ($qty1_p.equalsIgnoreCase(name)) {
			return qty1_p();
		}
		if ($qty2_p.equalsIgnoreCase(name)) {
			return qty2_p();
		}
		if ($qty3_p.equalsIgnoreCase(name)) {
			return qty3_p();
		}
		if ($qty4_p.equalsIgnoreCase(name)) {
			return qty4_p();
		}
		if ($qty5_p.equalsIgnoreCase(name)) {
			return qty5_p();
		}
		if ($qty6_p.equalsIgnoreCase(name)) {
			return qty6_p();
		}
		if ($qty7_p.equalsIgnoreCase(name)) {
			return qty7_p();
		}
		if ($qty8_p.equalsIgnoreCase(name)) {
			return qty8_p();
		}
		if ($qty9_p.equalsIgnoreCase(name)) {
			return qty9_p();
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
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($qty1_p.equalsIgnoreCase(name)) {
			qty1_p(
				((MCContainerMeta) qty1_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty2_p.equalsIgnoreCase(name)) {
			qty2_p(
				((MCContainerMeta) qty2_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty3_p.equalsIgnoreCase(name)) {
			qty3_p(
				((MCContainerMeta) qty3_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty4_p.equalsIgnoreCase(name)) {
			qty4_p(
				((MCContainerMeta) qty4_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty5_p.equalsIgnoreCase(name)) {
			qty5_p(
				((MCContainerMeta) qty5_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty6_p.equalsIgnoreCase(name)) {
			qty6_p(
				((MCContainerMeta) qty6_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty7_p.equalsIgnoreCase(name)) {
			qty7_p(
				((MCContainerMeta) qty7_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty8_p.equalsIgnoreCase(name)) {
			qty8_p(
				((MCContainerMeta) qty8_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty9_p.equalsIgnoreCase(name)) {
			qty9_p(
				((MCContainerMeta) qty9_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
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

	public MCNumber st_stk_qty() {
		return qty1_p().qty();
	}

	public void st_stk_qty(MCNumber value) {
		qty1_p().qty(value);
	}

	public void st_stk_qty(int value) {
		qty1_p().qty(value);
	}

	public void st_stk_qty(long value) {
		qty1_p().qty(value);
	}

	public void st_stk_qty(float value) {
		qty1_p().qty(value);
	}

	public void st_stk_qty(double value) {
		qty1_p().qty(value);
	}

	public MCNumber mfg_qty() {
		return qty2_p().qty();
	}

	public void mfg_qty(MCNumber value) {
		qty2_p().qty(value);
	}

	public void mfg_qty(int value) {
		qty2_p().qty(value);
	}

	public void mfg_qty(long value) {
		qty2_p().qty(value);
	}

	public void mfg_qty(float value) {
		qty2_p().qty(value);
	}

	public void mfg_qty(double value) {
		qty2_p().qty(value);
	}

	public MCNumber purc_qty() {
		return qty3_p().qty();
	}

	public void purc_qty(MCNumber value) {
		qty3_p().qty(value);
	}

	public void purc_qty(int value) {
		qty3_p().qty(value);
	}

	public void purc_qty(long value) {
		qty3_p().qty(value);
	}

	public void purc_qty(float value) {
		qty3_p().qty(value);
	}

	public void purc_qty(double value) {
		qty3_p().qty(value);
	}

	public MCNumber mfg_gr_qty() {
		return qty4_p().qty();
	}

	public void mfg_gr_qty(MCNumber value) {
		qty4_p().qty(value);
	}

	public void mfg_gr_qty(int value) {
		qty4_p().qty(value);
	}

	public void mfg_gr_qty(long value) {
		qty4_p().qty(value);
	}

	public void mfg_gr_qty(float value) {
		qty4_p().qty(value);
	}

	public void mfg_gr_qty(double value) {
		qty4_p().qty(value);
	}

	public MCNumber othr_gr_qty() {
		return qty5_p().qty();
	}

	public void othr_gr_qty(MCNumber value) {
		qty5_p().qty(value);
	}

	public void othr_gr_qty(int value) {
		qty5_p().qty(value);
	}

	public void othr_gr_qty(long value) {
		qty5_p().qty(value);
	}

	public void othr_gr_qty(float value) {
		qty5_p().qty(value);
	}

	public void othr_gr_qty(double value) {
		qty5_p().qty(value);
	}

	public MCNumber std_qty() {
		return qty6_p().qty();
	}

	public void std_qty(MCNumber value) {
		qty6_p().qty(value);
	}

	public void std_qty(int value) {
		qty6_p().qty(value);
	}

	public void std_qty(long value) {
		qty6_p().qty(value);
	}

	public void std_qty(float value) {
		qty6_p().qty(value);
	}

	public void std_qty(double value) {
		qty6_p().qty(value);
	}

	public MCNumber inpt_qty() {
		return qty7_p().qty();
	}

	public void inpt_qty(MCNumber value) {
		qty7_p().qty(value);
	}

	public void inpt_qty(int value) {
		qty7_p().qty(value);
	}

	public void inpt_qty(long value) {
		qty7_p().qty(value);
	}

	public void inpt_qty(float value) {
		qty7_p().qty(value);
	}

	public void inpt_qty(double value) {
		qty7_p().qty(value);
	}

	public MCNumber plnt_gi_qty() {
		return qty8_p().qty();
	}

	public void plnt_gi_qty(MCNumber value) {
		qty8_p().qty(value);
	}

	public void plnt_gi_qty(int value) {
		qty8_p().qty(value);
	}

	public void plnt_gi_qty(long value) {
		qty8_p().qty(value);
	}

	public void plnt_gi_qty(float value) {
		qty8_p().qty(value);
	}

	public void plnt_gi_qty(double value) {
		qty8_p().qty(value);
	}

	public MCNumber othr_gi_qty() {
		return qty9_p().qty();
	}

	public void othr_gi_qty(MCNumber value) {
		qty9_p().qty(value);
	}

	public void othr_gi_qty(int value) {
		qty9_p().qty(value);
	}

	public void othr_gi_qty(long value) {
		qty9_p().qty(value);
	}

	public void othr_gi_qty(float value) {
		qty9_p().qty(value);
	}

	public void othr_gi_qty(double value) {
		qty9_p().qty(value);
	}

	public MCNumber prov_qty() {
		return qty10_p().qty();
	}

	public void prov_qty(MCNumber value) {
		qty10_p().qty(value);
	}

	public void prov_qty(int value) {
		qty10_p().qty(value);
	}

	public void prov_qty(long value) {
		qty10_p().qty(value);
	}

	public void prov_qty(float value) {
		qty10_p().qty(value);
	}

	public void prov_qty(double value) {
		qty10_p().qty(value);
	}

	public MCNumber sls_qty() {
		return qty11_p().qty();
	}

	public void sls_qty(MCNumber value) {
		qty11_p().qty(value);
	}

	public void sls_qty(int value) {
		qty11_p().qty(value);
	}

	public void sls_qty(long value) {
		qty11_p().qty(value);
	}

	public void sls_qty(float value) {
		qty11_p().qty(value);
	}

	public void sls_qty(double value) {
		qty11_p().qty(value);
	}

	public MCNumber end_stk_qty() {
		return qty12_p().qty();
	}

	public void end_stk_qty(MCNumber value) {
		qty12_p().qty(value);
	}

	public void end_stk_qty(int value) {
		qty12_p().qty(value);
	}

	public void end_stk_qty(long value) {
		qty12_p().qty(value);
	}

	public void end_stk_qty(float value) {
		qty12_p().qty(value);
	}

	public void end_stk_qty(double value) {
		qty12_p().qty(value);
	}

	public MCNumber diff_qty() {
		return qty13_p().qty();
	}

	public void diff_qty(MCNumber value) {
		qty13_p().qty(value);
	}

	public void diff_qty(int value) {
		qty13_p().qty(value);
	}

	public void diff_qty(long value) {
		qty13_p().qty(value);
	}

	public void diff_qty(float value) {
		qty13_p().qty(value);
	}

	public void diff_qty(double value) {
		qty13_p().qty(value);
	}

	public MCNumber xpns_inpt_qty() {
		return qty14_p().qty();
	}

	public void xpns_inpt_qty(MCNumber value) {
		qty14_p().qty(value);
	}

	public void xpns_inpt_qty(int value) {
		qty14_p().qty(value);
	}

	public void xpns_inpt_qty(long value) {
		qty14_p().qty(value);
	}

	public void xpns_inpt_qty(float value) {
		qty14_p().qty(value);
	}

	public void xpns_inpt_qty(double value) {
		qty14_p().qty(value);
	}

}

