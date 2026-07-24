package mcframe.clientMGBD.MGBDP0140;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public static final String $calc_grp_nm = "calc_grp_nm";
	public static final String $calc_no_p = "calc_no_p";
	/**
	 * Term 期.<p>
	 *
	 */
	public static final String $term = "term";
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
	public static final String $itm_typ_p = "itm_typ_p";
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
	public static final String $itm_p = "itm_p";
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
	 * Supply type 支給区分.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public static final String $prov_typ_nm = "prov_typ_nm";
	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public static final String $prsppl_cd = "prsppl_cd";
	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public static final String $prsppl_nm = "prsppl_nm";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $prsppl_cntry_cd = "prsppl_cntry_cd";
	/**
	 * Country name 国名.<p>
	 *
	 */
	public static final String $prsppl_cntry_nm = "prsppl_cntry_nm";
	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public static final String $prsppl_area_cd = "prsppl_area_cd";
	/**
	 * Region name 地域名.<p>
	 *
	 */
	public static final String $prsppl_area_nm = "prsppl_area_nm";
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
	 * Subcontractor classification cd. 1 支給先分類ＣＤ１.<p>
	 *
	 */
	public static final String $prsppl_grp_cd1 = "prsppl_grp_cd1";
	/**
	 * Subcontractor classification name 1 支給先分類名１.<p>
	 *
	 */
	public static final String $prsppl_grp_nm1 = "prsppl_grp_nm1";
	/**
	 * Subcontractor classification cd. 2 支給先分類ＣＤ２.<p>
	 *
	 */
	public static final String $prsppl_grp_cd2 = "prsppl_grp_cd2";
	/**
	 * Subcontractor classification name 2 支給先分類名２.<p>
	 *
	 */
	public static final String $prsppl_grp_nm2 = "prsppl_grp_nm2";
	/**
	 * Subcontractor classification cd. 3 支給先分類ＣＤ３.<p>
	 *
	 */
	public static final String $prsppl_grp_cd3 = "prsppl_grp_cd3";
	/**
	 * Subcontractor classification name 3 支給先分類名３.<p>
	 *
	 */
	public static final String $prsppl_grp_nm3 = "prsppl_grp_nm3";
	/**
	 * Subcontractor classification cd. 4 支給先分類ＣＤ４.<p>
	 *
	 */
	public static final String $prsppl_grp_cd4 = "prsppl_grp_cd4";
	/**
	 * Subcontractor classification name 4 支給先分類名４.<p>
	 *
	 */
	public static final String $prsppl_grp_nm4 = "prsppl_grp_nm4";
	/**
	 * Subcontractor classification cd. 5 支給先分類ＣＤ５.<p>
	 *
	 */
	public static final String $prsppl_grp_cd5 = "prsppl_grp_cd5";
	/**
	 * Subcontractor classification name 5 支給先分類名５.<p>
	 *
	 */
	public static final String $prsppl_grp_nm5 = "prsppl_grp_nm5";
	/**
	 * Subcontractor classification cd. 6 支給先分類ＣＤ６.<p>
	 *
	 */
	public static final String $prsppl_grp_cd6 = "prsppl_grp_cd6";
	/**
	 * Subcontractor classification name 6 支給先分類名６.<p>
	 *
	 */
	public static final String $prsppl_grp_nm6 = "prsppl_grp_nm6";
	/**
	 * Subcontractor classification cd. 7 支給先分類ＣＤ７.<p>
	 *
	 */
	public static final String $prsppl_grp_cd7 = "prsppl_grp_cd7";
	/**
	 * Subcontractor classification name 7 支給先分類名７.<p>
	 *
	 */
	public static final String $prsppl_grp_nm7 = "prsppl_grp_nm7";
	/**
	 * Subcontractor classification cd. 8 支給先分類ＣＤ８.<p>
	 *
	 */
	public static final String $prsppl_grp_cd8 = "prsppl_grp_cd8";
	/**
	 * Subcontractor classification name 8 支給先分類名８.<p>
	 *
	 */
	public static final String $prsppl_grp_nm8 = "prsppl_grp_nm8";
	/**
	 * Subcontractor classification cd. 9 支給先分類ＣＤ９.<p>
	 *
	 */
	public static final String $prsppl_grp_cd9 = "prsppl_grp_cd9";
	/**
	 * Subcontractor classification name 9 支給先分類名９.<p>
	 *
	 */
	public static final String $prsppl_grp_nm9 = "prsppl_grp_nm9";
	/**
	 * Subcontractor classification cd. 10 支給先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $prsppl_grp_cd10 = "prsppl_grp_cd10";
	/**
	 * Subcontractor classification name 10 支給先分類名１０.<p>
	 *
	 */
	public static final String $prsppl_grp_nm10 = "prsppl_grp_nm10";
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public static final String $wg_flg = "wg_flg";
	/**
	 * Management dept. 管理部門.<p>
	 *
	 */
	public static final String $mng_dpt_flg = "mng_dpt_flg";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_flg = "lot_flg";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_flg = "sublot_flg";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1_flg = "sno1_flg";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2_flg = "sno2_flg";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3_flg = "sno3_flg";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4_flg = "sno4_flg";
	/**
	 * Subcontractor 支給先.<p>
	 *
	 */
	public static final String $prsppl_flg = "prsppl_flg";
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public static final String $prov_flg = "prov_flg";

	public static final String $calc_no = $calc_no_p + ".calc_no";
	public static final String $rmrks = $calc_no_p + ".rmrks";
	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";

	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta calc_no_p_META = createInnerRowMeta($calc_no_p, mcframe.clientMGUB.MGUBP0010.CalcNoR.class);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_typ_nm_META = createCommonMeta($prov_typ_nm, mcframe.commonMA.meta.MA_META.PROV_TYP_NM);
	public static final MCMeta prsppl_cd_META = createCommonMeta($prsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta prsppl_nm_META = createCommonMeta($prsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta prsppl_cntry_cd_META = createCommonMeta($prsppl_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta prsppl_cntry_nm_META = createCommonMeta($prsppl_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta prsppl_area_cd_META = createCommonMeta($prsppl_area_cd, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta prsppl_area_nm_META = createCommonMeta($prsppl_area_nm, mcframe.commonMA.meta.MA_META.AREA_NM);
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
	public static final MCMeta prsppl_grp_cd1_META = createCommonMeta($prsppl_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm1_META = createCommonMeta($prsppl_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_cd2_META = createCommonMeta($prsppl_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm2_META = createCommonMeta($prsppl_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_cd3_META = createCommonMeta($prsppl_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm3_META = createCommonMeta($prsppl_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_cd4_META = createCommonMeta($prsppl_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm4_META = createCommonMeta($prsppl_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_cd5_META = createCommonMeta($prsppl_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm5_META = createCommonMeta($prsppl_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_cd6_META = createCommonMeta($prsppl_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm6_META = createCommonMeta($prsppl_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_cd7_META = createCommonMeta($prsppl_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm7_META = createCommonMeta($prsppl_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_cd8_META = createCommonMeta($prsppl_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm8_META = createCommonMeta($prsppl_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_cd9_META = createCommonMeta($prsppl_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm9_META = createCommonMeta($prsppl_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_cd10_META = createCommonMeta($prsppl_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm10_META = createCommonMeta($prsppl_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta wg_flg_META = createCommonMeta($wg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mng_dpt_flg_META = createCommonMeta($mng_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_flg_META = createCommonMeta($lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_flg_META = createCommonMeta($sublot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_flg_META = createCommonMeta($sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_flg_META = createCommonMeta($sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_flg_META = createCommonMeta($sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_flg_META = createCommonMeta($sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_flg_META = createCommonMeta($prsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_flg_META = createCommonMeta($prov_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_grp_cd_META,
			calc_grp_nm_META,
			calc_no_p_META,
			term_META,
			wg_cd_META,
			wg_nm_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			itm_typ_p_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			itm_p_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			prov_typ_META,
			prov_typ_nm_META,
			prsppl_cd_META,
			prsppl_nm_META,
			prsppl_cntry_cd_META,
			prsppl_cntry_nm_META,
			prsppl_area_cd_META,
			prsppl_area_nm_META,
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
			prsppl_grp_cd1_META,
			prsppl_grp_nm1_META,
			prsppl_grp_cd2_META,
			prsppl_grp_nm2_META,
			prsppl_grp_cd3_META,
			prsppl_grp_nm3_META,
			prsppl_grp_cd4_META,
			prsppl_grp_nm4_META,
			prsppl_grp_cd5_META,
			prsppl_grp_nm5_META,
			prsppl_grp_cd6_META,
			prsppl_grp_nm6_META,
			prsppl_grp_cd7_META,
			prsppl_grp_nm7_META,
			prsppl_grp_cd8_META,
			prsppl_grp_nm8_META,
			prsppl_grp_cd9_META,
			prsppl_grp_nm9_META,
			prsppl_grp_cd10_META,
			prsppl_grp_nm10_META,
			wg_flg_META,
			mng_dpt_flg_META,
			lot_flg_META,
			sublot_flg_META,
			sno1_flg_META,
			sno2_flg_META,
			sno3_flg_META,
			sno4_flg_META,
			prsppl_flg_META,
			prov_flg_META
		},
		new String[][]{
			{
				"calc_no",
				"rmrks",
				"itm_typ",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm"
			},
			{
				$calc_no,
				$rmrks,
				$itm_typ,
				$itm_typ_d_cd,
				$itm_typ_d_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm
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

	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CLEAR]のキー定数 */
	public static final String $$CLEAR = "CLEAR";
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[HKEY]のキー定数 */
	public static final String $$HKEY = "HKEY";
	/** 項目属性情報のグループ[OTHER]のキー定数 */
	public static final String $$OTHER = "OTHER";
	/** 項目属性情報のグループ[HVAL]のキー定数 */
	public static final String $$HVAL = "HVAL";
	/** 項目属性情報のグループ[ELM]のキー定数 */
	public static final String $$ELM = "ELM";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$sno1, "SNO1"},	// sno1
				{$sno2, "SNO2"},	// sno2
				{$sno3, "SNO3"},	// sno3
				{$sno4, "SNO4"},	// sno4
				{$wg_flg, "WG"},	// wg_flg
				{$sno1_flg, "SNO1"},	// sno1_flg
				{$sno2_flg, "SNO2"},	// sno2_flg
				{$sno3_flg, "SNO3"},	// sno3_flg
				{$sno4_flg, "SNO4"}	// sno4_flg
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$mng_dpt_cd, "dpt_nm"},	// mng_dpt_cd
				{$prsppl_cd, "bp_nm"},	// prsppl_cd
				{$prsppl_cntry_cd, "cntry_nm"},	// prsppl_cntry_cd
				{$prsppl_area_cd, "area_nm"},	// prsppl_area_cd
				{$itm_grp_cd1, "itm_grp_nm"},	// itm_grp_cd1
				{$itm_grp_cd2, "itm_grp_nm"},	// itm_grp_cd2
				{$itm_grp_cd3, "itm_grp_nm"},	// itm_grp_cd3
				{$itm_grp_cd4, "itm_grp_nm"},	// itm_grp_cd4
				{$itm_grp_cd5, "itm_grp_nm"},	// itm_grp_cd5
				{$itm_grp_cd6, "itm_grp_nm"},	// itm_grp_cd6
				{$itm_grp_cd7, "itm_grp_nm"},	// itm_grp_cd7
				{$itm_grp_cd8, "itm_grp_nm"},	// itm_grp_cd8
				{$itm_grp_cd9, "itm_grp_nm"},	// itm_grp_cd9
				{$itm_grp_cd10, "itm_grp_nm"},	// itm_grp_cd10
				{$prsppl_grp_cd1, "bp_grp_nm"},	// prsppl_grp_cd1
				{$prsppl_grp_cd2, "bp_grp_nm"},	// prsppl_grp_cd2
				{$prsppl_grp_cd3, "bp_grp_nm"},	// prsppl_grp_cd3
				{$prsppl_grp_cd4, "bp_grp_nm"},	// prsppl_grp_cd4
				{$prsppl_grp_cd5, "bp_grp_nm"},	// prsppl_grp_cd5
				{$prsppl_grp_cd6, "bp_grp_nm"},	// prsppl_grp_cd6
				{$prsppl_grp_cd7, "bp_grp_nm"},	// prsppl_grp_cd7
				{$prsppl_grp_cd8, "bp_grp_nm"},	// prsppl_grp_cd8
				{$prsppl_grp_cd9, "bp_grp_nm"},	// prsppl_grp_cd9
				{$prsppl_grp_cd10, "bp_grp_nm"}	// prsppl_grp_cd10
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$calc_grp_cd, "true"},	// calc_grp_cd
				{$calc_no_p + ".calc_no", "calc_grp_cd"},	// calc_no_p.calc_no
				{$wg_cd, "true"},	// wg_cd
				{$mng_dpt_cd, "term"},	// mng_dpt_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$prsppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"}	// prsppl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$calc_grp_cd, "prov_calc_flg"},	// calc_grp_cd
				{$wg_cd, "rd_flg"},	// wg_cd
				{$mng_dpt_cd, "ym"},	// mng_dpt_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$prsppl_cd, "bp_is_srch_typ"}	// prsppl_cd
			}
		)),
		new MCExtMap.Entry($$CLEAR, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$HKEY, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$OTHER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$HVAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ELM, new MCExtList(
			new String[][]{
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
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
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 1, $calc_grp_nm);
	}

	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 1, $calc_grp_nm, value);
	}


	public mcframe.clientMGUB.MGUBP0010.CalcNoR calc_no_p(){
		return (mcframe.clientMGUB.MGUBP0010.CalcNoR) getConstInnerRow(offset + 2, $calc_no_p);
	}
	
	public void calc_no_p(mcframe.clientMGUB.MGUBP0010.CalcNoR row){
		setConstInnerRow(offset + 2, $calc_no_p, row);
	}


	/**
	 * Term 期.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 3, $term);
	}

	/**
	 * Term 期.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 3, $term, value);
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


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 8, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 8, $itm_typ_p, row);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 9, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 9, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 10, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 10, $itm_jnl_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 11, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 11, $itm_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 12, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 12, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 13, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 13, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 14, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 14, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 15, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 15, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 16, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 16, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 17, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 17, $sno4, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 18, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 18, $prov_typ, value);
	}


	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public String prov_typ_nm() {
		return getConstString(offset + 19, $prov_typ_nm);
	}

	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public void prov_typ_nm(String value) {
		setConstString(offset + 19, $prov_typ_nm, value);
	}


	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public String prsppl_cd() {
		return getConstString(offset + 20, $prsppl_cd);
	}

	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public void prsppl_cd(String value) {
		setConstString(offset + 20, $prsppl_cd, value);
	}


	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public String prsppl_nm() {
		return getConstString(offset + 21, $prsppl_nm);
	}

	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public void prsppl_nm(String value) {
		setConstString(offset + 21, $prsppl_nm, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String prsppl_cntry_cd() {
		return getConstString(offset + 22, $prsppl_cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void prsppl_cntry_cd(String value) {
		setConstString(offset + 22, $prsppl_cntry_cd, value);
	}


	/**
	 * Country name 国名.<p>
	 *
	 */
	public String prsppl_cntry_nm() {
		return getConstString(offset + 23, $prsppl_cntry_nm);
	}

	/**
	 * Country name 国名.<p>
	 *
	 */
	public void prsppl_cntry_nm(String value) {
		setConstString(offset + 23, $prsppl_cntry_nm, value);
	}


	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public String prsppl_area_cd() {
		return getConstString(offset + 24, $prsppl_area_cd);
	}

	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public void prsppl_area_cd(String value) {
		setConstString(offset + 24, $prsppl_area_cd, value);
	}


	/**
	 * Region name 地域名.<p>
	 *
	 */
	public String prsppl_area_nm() {
		return getConstString(offset + 25, $prsppl_area_nm);
	}

	/**
	 * Region name 地域名.<p>
	 *
	 */
	public void prsppl_area_nm(String value) {
		setConstString(offset + 25, $prsppl_area_nm, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 26, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 26, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 27, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 27, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 28, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 28, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 29, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 29, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 30, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 30, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 31, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 31, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 32, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 32, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 33, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 33, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 34, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 34, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 35, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 35, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 36, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 36, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 37, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 37, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 38, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 38, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 39, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 39, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 40, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 40, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 41, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 41, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 42, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 42, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 43, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 43, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 44, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 44, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 45, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 45, $itm_grp_nm10, value);
	}


	/**
	 * Subcontractor classification cd. 1 支給先分類ＣＤ１.<p>
	 *
	 */
	public String prsppl_grp_cd1() {
		return getConstString(offset + 46, $prsppl_grp_cd1);
	}

	/**
	 * Subcontractor classification cd. 1 支給先分類ＣＤ１.<p>
	 *
	 */
	public void prsppl_grp_cd1(String value) {
		setConstString(offset + 46, $prsppl_grp_cd1, value);
	}


	/**
	 * Subcontractor classification name 1 支給先分類名１.<p>
	 *
	 */
	public String prsppl_grp_nm1() {
		return getConstString(offset + 47, $prsppl_grp_nm1);
	}

	/**
	 * Subcontractor classification name 1 支給先分類名１.<p>
	 *
	 */
	public void prsppl_grp_nm1(String value) {
		setConstString(offset + 47, $prsppl_grp_nm1, value);
	}


	/**
	 * Subcontractor classification cd. 2 支給先分類ＣＤ２.<p>
	 *
	 */
	public String prsppl_grp_cd2() {
		return getConstString(offset + 48, $prsppl_grp_cd2);
	}

	/**
	 * Subcontractor classification cd. 2 支給先分類ＣＤ２.<p>
	 *
	 */
	public void prsppl_grp_cd2(String value) {
		setConstString(offset + 48, $prsppl_grp_cd2, value);
	}


	/**
	 * Subcontractor classification name 2 支給先分類名２.<p>
	 *
	 */
	public String prsppl_grp_nm2() {
		return getConstString(offset + 49, $prsppl_grp_nm2);
	}

	/**
	 * Subcontractor classification name 2 支給先分類名２.<p>
	 *
	 */
	public void prsppl_grp_nm2(String value) {
		setConstString(offset + 49, $prsppl_grp_nm2, value);
	}


	/**
	 * Subcontractor classification cd. 3 支給先分類ＣＤ３.<p>
	 *
	 */
	public String prsppl_grp_cd3() {
		return getConstString(offset + 50, $prsppl_grp_cd3);
	}

	/**
	 * Subcontractor classification cd. 3 支給先分類ＣＤ３.<p>
	 *
	 */
	public void prsppl_grp_cd3(String value) {
		setConstString(offset + 50, $prsppl_grp_cd3, value);
	}


	/**
	 * Subcontractor classification name 3 支給先分類名３.<p>
	 *
	 */
	public String prsppl_grp_nm3() {
		return getConstString(offset + 51, $prsppl_grp_nm3);
	}

	/**
	 * Subcontractor classification name 3 支給先分類名３.<p>
	 *
	 */
	public void prsppl_grp_nm3(String value) {
		setConstString(offset + 51, $prsppl_grp_nm3, value);
	}


	/**
	 * Subcontractor classification cd. 4 支給先分類ＣＤ４.<p>
	 *
	 */
	public String prsppl_grp_cd4() {
		return getConstString(offset + 52, $prsppl_grp_cd4);
	}

	/**
	 * Subcontractor classification cd. 4 支給先分類ＣＤ４.<p>
	 *
	 */
	public void prsppl_grp_cd4(String value) {
		setConstString(offset + 52, $prsppl_grp_cd4, value);
	}


	/**
	 * Subcontractor classification name 4 支給先分類名４.<p>
	 *
	 */
	public String prsppl_grp_nm4() {
		return getConstString(offset + 53, $prsppl_grp_nm4);
	}

	/**
	 * Subcontractor classification name 4 支給先分類名４.<p>
	 *
	 */
	public void prsppl_grp_nm4(String value) {
		setConstString(offset + 53, $prsppl_grp_nm4, value);
	}


	/**
	 * Subcontractor classification cd. 5 支給先分類ＣＤ５.<p>
	 *
	 */
	public String prsppl_grp_cd5() {
		return getConstString(offset + 54, $prsppl_grp_cd5);
	}

	/**
	 * Subcontractor classification cd. 5 支給先分類ＣＤ５.<p>
	 *
	 */
	public void prsppl_grp_cd5(String value) {
		setConstString(offset + 54, $prsppl_grp_cd5, value);
	}


	/**
	 * Subcontractor classification name 5 支給先分類名５.<p>
	 *
	 */
	public String prsppl_grp_nm5() {
		return getConstString(offset + 55, $prsppl_grp_nm5);
	}

	/**
	 * Subcontractor classification name 5 支給先分類名５.<p>
	 *
	 */
	public void prsppl_grp_nm5(String value) {
		setConstString(offset + 55, $prsppl_grp_nm5, value);
	}


	/**
	 * Subcontractor classification cd. 6 支給先分類ＣＤ６.<p>
	 *
	 */
	public String prsppl_grp_cd6() {
		return getConstString(offset + 56, $prsppl_grp_cd6);
	}

	/**
	 * Subcontractor classification cd. 6 支給先分類ＣＤ６.<p>
	 *
	 */
	public void prsppl_grp_cd6(String value) {
		setConstString(offset + 56, $prsppl_grp_cd6, value);
	}


	/**
	 * Subcontractor classification name 6 支給先分類名６.<p>
	 *
	 */
	public String prsppl_grp_nm6() {
		return getConstString(offset + 57, $prsppl_grp_nm6);
	}

	/**
	 * Subcontractor classification name 6 支給先分類名６.<p>
	 *
	 */
	public void prsppl_grp_nm6(String value) {
		setConstString(offset + 57, $prsppl_grp_nm6, value);
	}


	/**
	 * Subcontractor classification cd. 7 支給先分類ＣＤ７.<p>
	 *
	 */
	public String prsppl_grp_cd7() {
		return getConstString(offset + 58, $prsppl_grp_cd7);
	}

	/**
	 * Subcontractor classification cd. 7 支給先分類ＣＤ７.<p>
	 *
	 */
	public void prsppl_grp_cd7(String value) {
		setConstString(offset + 58, $prsppl_grp_cd7, value);
	}


	/**
	 * Subcontractor classification name 7 支給先分類名７.<p>
	 *
	 */
	public String prsppl_grp_nm7() {
		return getConstString(offset + 59, $prsppl_grp_nm7);
	}

	/**
	 * Subcontractor classification name 7 支給先分類名７.<p>
	 *
	 */
	public void prsppl_grp_nm7(String value) {
		setConstString(offset + 59, $prsppl_grp_nm7, value);
	}


	/**
	 * Subcontractor classification cd. 8 支給先分類ＣＤ８.<p>
	 *
	 */
	public String prsppl_grp_cd8() {
		return getConstString(offset + 60, $prsppl_grp_cd8);
	}

	/**
	 * Subcontractor classification cd. 8 支給先分類ＣＤ８.<p>
	 *
	 */
	public void prsppl_grp_cd8(String value) {
		setConstString(offset + 60, $prsppl_grp_cd8, value);
	}


	/**
	 * Subcontractor classification name 8 支給先分類名８.<p>
	 *
	 */
	public String prsppl_grp_nm8() {
		return getConstString(offset + 61, $prsppl_grp_nm8);
	}

	/**
	 * Subcontractor classification name 8 支給先分類名８.<p>
	 *
	 */
	public void prsppl_grp_nm8(String value) {
		setConstString(offset + 61, $prsppl_grp_nm8, value);
	}


	/**
	 * Subcontractor classification cd. 9 支給先分類ＣＤ９.<p>
	 *
	 */
	public String prsppl_grp_cd9() {
		return getConstString(offset + 62, $prsppl_grp_cd9);
	}

	/**
	 * Subcontractor classification cd. 9 支給先分類ＣＤ９.<p>
	 *
	 */
	public void prsppl_grp_cd9(String value) {
		setConstString(offset + 62, $prsppl_grp_cd9, value);
	}


	/**
	 * Subcontractor classification name 9 支給先分類名９.<p>
	 *
	 */
	public String prsppl_grp_nm9() {
		return getConstString(offset + 63, $prsppl_grp_nm9);
	}

	/**
	 * Subcontractor classification name 9 支給先分類名９.<p>
	 *
	 */
	public void prsppl_grp_nm9(String value) {
		setConstString(offset + 63, $prsppl_grp_nm9, value);
	}


	/**
	 * Subcontractor classification cd. 10 支給先分類ＣＤ１０.<p>
	 *
	 */
	public String prsppl_grp_cd10() {
		return getConstString(offset + 64, $prsppl_grp_cd10);
	}

	/**
	 * Subcontractor classification cd. 10 支給先分類ＣＤ１０.<p>
	 *
	 */
	public void prsppl_grp_cd10(String value) {
		setConstString(offset + 64, $prsppl_grp_cd10, value);
	}


	/**
	 * Subcontractor classification name 10 支給先分類名１０.<p>
	 *
	 */
	public String prsppl_grp_nm10() {
		return getConstString(offset + 65, $prsppl_grp_nm10);
	}

	/**
	 * Subcontractor classification name 10 支給先分類名１０.<p>
	 *
	 */
	public void prsppl_grp_nm10(String value) {
		setConstString(offset + 65, $prsppl_grp_nm10, value);
	}


	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public boolean wg_flg() {
		return getConstBoolean(offset + 66, $wg_flg);
	}

	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public void wg_flg(boolean value) {
		setConstBoolean(offset + 66, $wg_flg, value);
	}


	/**
	 * Management dept. 管理部門.<p>
	 *
	 */
	public boolean mng_dpt_flg() {
		return getConstBoolean(offset + 67, $mng_dpt_flg);
	}

	/**
	 * Management dept. 管理部門.<p>
	 *
	 */
	public void mng_dpt_flg(boolean value) {
		setConstBoolean(offset + 67, $mng_dpt_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public boolean lot_flg() {
		return getConstBoolean(offset + 68, $lot_flg);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_flg(boolean value) {
		setConstBoolean(offset + 68, $lot_flg, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public boolean sublot_flg() {
		return getConstBoolean(offset + 69, $sublot_flg);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_flg(boolean value) {
		setConstBoolean(offset + 69, $sublot_flg, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public boolean sno1_flg() {
		return getConstBoolean(offset + 70, $sno1_flg);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1_flg(boolean value) {
		setConstBoolean(offset + 70, $sno1_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public boolean sno2_flg() {
		return getConstBoolean(offset + 71, $sno2_flg);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2_flg(boolean value) {
		setConstBoolean(offset + 71, $sno2_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public boolean sno3_flg() {
		return getConstBoolean(offset + 72, $sno3_flg);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3_flg(boolean value) {
		setConstBoolean(offset + 72, $sno3_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public boolean sno4_flg() {
		return getConstBoolean(offset + 73, $sno4_flg);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4_flg(boolean value) {
		setConstBoolean(offset + 73, $sno4_flg, value);
	}


	/**
	 * Subcontractor 支給先.<p>
	 *
	 */
	public boolean prsppl_flg() {
		return getConstBoolean(offset + 74, $prsppl_flg);
	}

	/**
	 * Subcontractor 支給先.<p>
	 *
	 */
	public void prsppl_flg(boolean value) {
		setConstBoolean(offset + 74, $prsppl_flg, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public boolean prov_flg() {
		return getConstBoolean(offset + 75, $prov_flg);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_flg(boolean value) {
		setConstBoolean(offset + 75, $prov_flg, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
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
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			return prov_typ_nm();
		}
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			return prsppl_cd();
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			return prsppl_nm();
		}
		if ($prsppl_cntry_cd.equalsIgnoreCase(name)) {
			return prsppl_cntry_cd();
		}
		if ($prsppl_cntry_nm.equalsIgnoreCase(name)) {
			return prsppl_cntry_nm();
		}
		if ($prsppl_area_cd.equalsIgnoreCase(name)) {
			return prsppl_area_cd();
		}
		if ($prsppl_area_nm.equalsIgnoreCase(name)) {
			return prsppl_area_nm();
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
		if ($prsppl_grp_cd1.equalsIgnoreCase(name)) {
			return prsppl_grp_cd1();
		}
		if ($prsppl_grp_nm1.equalsIgnoreCase(name)) {
			return prsppl_grp_nm1();
		}
		if ($prsppl_grp_cd2.equalsIgnoreCase(name)) {
			return prsppl_grp_cd2();
		}
		if ($prsppl_grp_nm2.equalsIgnoreCase(name)) {
			return prsppl_grp_nm2();
		}
		if ($prsppl_grp_cd3.equalsIgnoreCase(name)) {
			return prsppl_grp_cd3();
		}
		if ($prsppl_grp_nm3.equalsIgnoreCase(name)) {
			return prsppl_grp_nm3();
		}
		if ($prsppl_grp_cd4.equalsIgnoreCase(name)) {
			return prsppl_grp_cd4();
		}
		if ($prsppl_grp_nm4.equalsIgnoreCase(name)) {
			return prsppl_grp_nm4();
		}
		if ($prsppl_grp_cd5.equalsIgnoreCase(name)) {
			return prsppl_grp_cd5();
		}
		if ($prsppl_grp_nm5.equalsIgnoreCase(name)) {
			return prsppl_grp_nm5();
		}
		if ($prsppl_grp_cd6.equalsIgnoreCase(name)) {
			return prsppl_grp_cd6();
		}
		if ($prsppl_grp_nm6.equalsIgnoreCase(name)) {
			return prsppl_grp_nm6();
		}
		if ($prsppl_grp_cd7.equalsIgnoreCase(name)) {
			return prsppl_grp_cd7();
		}
		if ($prsppl_grp_nm7.equalsIgnoreCase(name)) {
			return prsppl_grp_nm7();
		}
		if ($prsppl_grp_cd8.equalsIgnoreCase(name)) {
			return prsppl_grp_cd8();
		}
		if ($prsppl_grp_nm8.equalsIgnoreCase(name)) {
			return prsppl_grp_nm8();
		}
		if ($prsppl_grp_cd9.equalsIgnoreCase(name)) {
			return prsppl_grp_cd9();
		}
		if ($prsppl_grp_nm9.equalsIgnoreCase(name)) {
			return prsppl_grp_nm9();
		}
		if ($prsppl_grp_cd10.equalsIgnoreCase(name)) {
			return prsppl_grp_cd10();
		}
		if ($prsppl_grp_nm10.equalsIgnoreCase(name)) {
			return prsppl_grp_nm10();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($mng_dpt_flg.equalsIgnoreCase(name)) {
			return mng_dpt_flg();
		}
		if ($lot_flg.equalsIgnoreCase(name)) {
			return lot_flg();
		}
		if ($sublot_flg.equalsIgnoreCase(name)) {
			return sublot_flg();
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			return sno1_flg();
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			return sno2_flg();
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			return sno3_flg();
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			return sno4_flg();
		}
		if ($prsppl_flg.equalsIgnoreCase(name)) {
			return prsppl_flg();
		}
		if ($prov_flg.equalsIgnoreCase(name)) {
			return prov_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
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
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			return prov_typ_nm();
		}
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			return prsppl_cd();
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			return prsppl_nm();
		}
		if ($prsppl_cntry_cd.equalsIgnoreCase(name)) {
			return prsppl_cntry_cd();
		}
		if ($prsppl_cntry_nm.equalsIgnoreCase(name)) {
			return prsppl_cntry_nm();
		}
		if ($prsppl_area_cd.equalsIgnoreCase(name)) {
			return prsppl_area_cd();
		}
		if ($prsppl_area_nm.equalsIgnoreCase(name)) {
			return prsppl_area_nm();
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
		if ($prsppl_grp_cd1.equalsIgnoreCase(name)) {
			return prsppl_grp_cd1();
		}
		if ($prsppl_grp_nm1.equalsIgnoreCase(name)) {
			return prsppl_grp_nm1();
		}
		if ($prsppl_grp_cd2.equalsIgnoreCase(name)) {
			return prsppl_grp_cd2();
		}
		if ($prsppl_grp_nm2.equalsIgnoreCase(name)) {
			return prsppl_grp_nm2();
		}
		if ($prsppl_grp_cd3.equalsIgnoreCase(name)) {
			return prsppl_grp_cd3();
		}
		if ($prsppl_grp_nm3.equalsIgnoreCase(name)) {
			return prsppl_grp_nm3();
		}
		if ($prsppl_grp_cd4.equalsIgnoreCase(name)) {
			return prsppl_grp_cd4();
		}
		if ($prsppl_grp_nm4.equalsIgnoreCase(name)) {
			return prsppl_grp_nm4();
		}
		if ($prsppl_grp_cd5.equalsIgnoreCase(name)) {
			return prsppl_grp_cd5();
		}
		if ($prsppl_grp_nm5.equalsIgnoreCase(name)) {
			return prsppl_grp_nm5();
		}
		if ($prsppl_grp_cd6.equalsIgnoreCase(name)) {
			return prsppl_grp_cd6();
		}
		if ($prsppl_grp_nm6.equalsIgnoreCase(name)) {
			return prsppl_grp_nm6();
		}
		if ($prsppl_grp_cd7.equalsIgnoreCase(name)) {
			return prsppl_grp_cd7();
		}
		if ($prsppl_grp_nm7.equalsIgnoreCase(name)) {
			return prsppl_grp_nm7();
		}
		if ($prsppl_grp_cd8.equalsIgnoreCase(name)) {
			return prsppl_grp_cd8();
		}
		if ($prsppl_grp_nm8.equalsIgnoreCase(name)) {
			return prsppl_grp_nm8();
		}
		if ($prsppl_grp_cd9.equalsIgnoreCase(name)) {
			return prsppl_grp_cd9();
		}
		if ($prsppl_grp_nm9.equalsIgnoreCase(name)) {
			return prsppl_grp_nm9();
		}
		if ($prsppl_grp_cd10.equalsIgnoreCase(name)) {
			return prsppl_grp_cd10();
		}
		if ($prsppl_grp_nm10.equalsIgnoreCase(name)) {
			return prsppl_grp_nm10();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($mng_dpt_flg.equalsIgnoreCase(name)) {
			return mng_dpt_flg();
		}
		if ($lot_flg.equalsIgnoreCase(name)) {
			return lot_flg();
		}
		if ($sublot_flg.equalsIgnoreCase(name)) {
			return sublot_flg();
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			return sno1_flg();
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			return sno2_flg();
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			return sno3_flg();
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			return sno4_flg();
		}
		if ($prsppl_flg.equalsIgnoreCase(name)) {
			return prsppl_flg();
		}
		if ($prov_flg.equalsIgnoreCase(name)) {
			return prov_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
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
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			prov_typ_nm(value);
			return;
		}
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			prsppl_cd(value);
			return;
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			prsppl_nm(value);
			return;
		}
		if ($prsppl_cntry_cd.equalsIgnoreCase(name)) {
			prsppl_cntry_cd(value);
			return;
		}
		if ($prsppl_cntry_nm.equalsIgnoreCase(name)) {
			prsppl_cntry_nm(value);
			return;
		}
		if ($prsppl_area_cd.equalsIgnoreCase(name)) {
			prsppl_area_cd(value);
			return;
		}
		if ($prsppl_area_nm.equalsIgnoreCase(name)) {
			prsppl_area_nm(value);
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
		if ($prsppl_grp_cd1.equalsIgnoreCase(name)) {
			prsppl_grp_cd1(value);
			return;
		}
		if ($prsppl_grp_nm1.equalsIgnoreCase(name)) {
			prsppl_grp_nm1(value);
			return;
		}
		if ($prsppl_grp_cd2.equalsIgnoreCase(name)) {
			prsppl_grp_cd2(value);
			return;
		}
		if ($prsppl_grp_nm2.equalsIgnoreCase(name)) {
			prsppl_grp_nm2(value);
			return;
		}
		if ($prsppl_grp_cd3.equalsIgnoreCase(name)) {
			prsppl_grp_cd3(value);
			return;
		}
		if ($prsppl_grp_nm3.equalsIgnoreCase(name)) {
			prsppl_grp_nm3(value);
			return;
		}
		if ($prsppl_grp_cd4.equalsIgnoreCase(name)) {
			prsppl_grp_cd4(value);
			return;
		}
		if ($prsppl_grp_nm4.equalsIgnoreCase(name)) {
			prsppl_grp_nm4(value);
			return;
		}
		if ($prsppl_grp_cd5.equalsIgnoreCase(name)) {
			prsppl_grp_cd5(value);
			return;
		}
		if ($prsppl_grp_nm5.equalsIgnoreCase(name)) {
			prsppl_grp_nm5(value);
			return;
		}
		if ($prsppl_grp_cd6.equalsIgnoreCase(name)) {
			prsppl_grp_cd6(value);
			return;
		}
		if ($prsppl_grp_nm6.equalsIgnoreCase(name)) {
			prsppl_grp_nm6(value);
			return;
		}
		if ($prsppl_grp_cd7.equalsIgnoreCase(name)) {
			prsppl_grp_cd7(value);
			return;
		}
		if ($prsppl_grp_nm7.equalsIgnoreCase(name)) {
			prsppl_grp_nm7(value);
			return;
		}
		if ($prsppl_grp_cd8.equalsIgnoreCase(name)) {
			prsppl_grp_cd8(value);
			return;
		}
		if ($prsppl_grp_nm8.equalsIgnoreCase(name)) {
			prsppl_grp_nm8(value);
			return;
		}
		if ($prsppl_grp_cd9.equalsIgnoreCase(name)) {
			prsppl_grp_cd9(value);
			return;
		}
		if ($prsppl_grp_nm9.equalsIgnoreCase(name)) {
			prsppl_grp_nm9(value);
			return;
		}
		if ($prsppl_grp_cd10.equalsIgnoreCase(name)) {
			prsppl_grp_cd10(value);
			return;
		}
		if ($prsppl_grp_nm10.equalsIgnoreCase(name)) {
			prsppl_grp_nm10(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($mng_dpt_flg.equalsIgnoreCase(name)) {
			mng_dpt_flg(value);
			return;
		}
		if ($lot_flg.equalsIgnoreCase(name)) {
			lot_flg(value);
			return;
		}
		if ($sublot_flg.equalsIgnoreCase(name)) {
			sublot_flg(value);
			return;
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			sno1_flg(value);
			return;
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			sno2_flg(value);
			return;
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			sno3_flg(value);
			return;
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			sno4_flg(value);
			return;
		}
		if ($prsppl_flg.equalsIgnoreCase(name)) {
			prsppl_flg(value);
			return;
		}
		if ($prov_flg.equalsIgnoreCase(name)) {
			prov_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
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
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			prov_typ_nm(value);
			return;
		}
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			prsppl_cd(value);
			return;
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			prsppl_nm(value);
			return;
		}
		if ($prsppl_cntry_cd.equalsIgnoreCase(name)) {
			prsppl_cntry_cd(value);
			return;
		}
		if ($prsppl_cntry_nm.equalsIgnoreCase(name)) {
			prsppl_cntry_nm(value);
			return;
		}
		if ($prsppl_area_cd.equalsIgnoreCase(name)) {
			prsppl_area_cd(value);
			return;
		}
		if ($prsppl_area_nm.equalsIgnoreCase(name)) {
			prsppl_area_nm(value);
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
		if ($prsppl_grp_cd1.equalsIgnoreCase(name)) {
			prsppl_grp_cd1(value);
			return;
		}
		if ($prsppl_grp_nm1.equalsIgnoreCase(name)) {
			prsppl_grp_nm1(value);
			return;
		}
		if ($prsppl_grp_cd2.equalsIgnoreCase(name)) {
			prsppl_grp_cd2(value);
			return;
		}
		if ($prsppl_grp_nm2.equalsIgnoreCase(name)) {
			prsppl_grp_nm2(value);
			return;
		}
		if ($prsppl_grp_cd3.equalsIgnoreCase(name)) {
			prsppl_grp_cd3(value);
			return;
		}
		if ($prsppl_grp_nm3.equalsIgnoreCase(name)) {
			prsppl_grp_nm3(value);
			return;
		}
		if ($prsppl_grp_cd4.equalsIgnoreCase(name)) {
			prsppl_grp_cd4(value);
			return;
		}
		if ($prsppl_grp_nm4.equalsIgnoreCase(name)) {
			prsppl_grp_nm4(value);
			return;
		}
		if ($prsppl_grp_cd5.equalsIgnoreCase(name)) {
			prsppl_grp_cd5(value);
			return;
		}
		if ($prsppl_grp_nm5.equalsIgnoreCase(name)) {
			prsppl_grp_nm5(value);
			return;
		}
		if ($prsppl_grp_cd6.equalsIgnoreCase(name)) {
			prsppl_grp_cd6(value);
			return;
		}
		if ($prsppl_grp_nm6.equalsIgnoreCase(name)) {
			prsppl_grp_nm6(value);
			return;
		}
		if ($prsppl_grp_cd7.equalsIgnoreCase(name)) {
			prsppl_grp_cd7(value);
			return;
		}
		if ($prsppl_grp_nm7.equalsIgnoreCase(name)) {
			prsppl_grp_nm7(value);
			return;
		}
		if ($prsppl_grp_cd8.equalsIgnoreCase(name)) {
			prsppl_grp_cd8(value);
			return;
		}
		if ($prsppl_grp_nm8.equalsIgnoreCase(name)) {
			prsppl_grp_nm8(value);
			return;
		}
		if ($prsppl_grp_cd9.equalsIgnoreCase(name)) {
			prsppl_grp_cd9(value);
			return;
		}
		if ($prsppl_grp_nm9.equalsIgnoreCase(name)) {
			prsppl_grp_nm9(value);
			return;
		}
		if ($prsppl_grp_cd10.equalsIgnoreCase(name)) {
			prsppl_grp_cd10(value);
			return;
		}
		if ($prsppl_grp_nm10.equalsIgnoreCase(name)) {
			prsppl_grp_nm10(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($mng_dpt_flg.equalsIgnoreCase(name)) {
			mng_dpt_flg(value);
			return;
		}
		if ($lot_flg.equalsIgnoreCase(name)) {
			lot_flg(value);
			return;
		}
		if ($sublot_flg.equalsIgnoreCase(name)) {
			sublot_flg(value);
			return;
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			sno1_flg(value);
			return;
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			sno2_flg(value);
			return;
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			sno3_flg(value);
			return;
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			sno4_flg(value);
			return;
		}
		if ($prsppl_flg.equalsIgnoreCase(name)) {
			prsppl_flg(value);
			return;
		}
		if ($prov_flg.equalsIgnoreCase(name)) {
			prov_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($calc_no_p.equalsIgnoreCase(name)) {
			return calc_no_p();
		}
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($calc_no_p.equalsIgnoreCase(name)) {
			calc_no_p(
				((MCContainerMeta) calc_no_p_META).castInnerRow(mcframe.clientMGUB.MGUBP0010.CalcNoR.class, value)
			);
			return;
		}
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			itm_typ_p(
				((MCContainerMeta) itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String calc_no() {
		return calc_no_p().calc_no();
	}

	public void calc_no(String value) {
		calc_no_p().calc_no(value);
	}

	public String rmrks() {
		return calc_no_p().rmrks();
	}

	public void rmrks(String value) {
		calc_no_p().rmrks(value);
	}

	public String itm_typ() {
		return itm_typ_p().itm_typ();
	}

	public void itm_typ(String value) {
		itm_typ_p().itm_typ(value);
	}

	public String itm_typ_d_cd() {
		return itm_typ_p().itm_typ_d_cd();
	}

	public void itm_typ_d_cd(String value) {
		itm_typ_p().itm_typ_d_cd(value);
	}

	public String itm_typ_d_nm() {
		return itm_typ_p().itm_typ_d_nm();
	}

	public void itm_typ_d_nm(String value) {
		itm_typ_p().itm_typ_d_nm(value);
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

}

