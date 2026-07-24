package mcframe.clientMGBD.MGBDP0100;

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
 * ブロック"DispRslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DispRsltR_MC_A extends MCConstRow {

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
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public static final String $sppl_grp_cd1 = "sppl_grp_cd1";
	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public static final String $sppl_grp_nm1 = "sppl_grp_nm1";
	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public static final String $sppl_grp_cd2 = "sppl_grp_cd2";
	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public static final String $sppl_grp_nm2 = "sppl_grp_nm2";
	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public static final String $sppl_grp_cd3 = "sppl_grp_cd3";
	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public static final String $sppl_grp_nm3 = "sppl_grp_nm3";
	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public static final String $sppl_grp_cd4 = "sppl_grp_cd4";
	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public static final String $sppl_grp_nm4 = "sppl_grp_nm4";
	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public static final String $sppl_grp_cd5 = "sppl_grp_cd5";
	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public static final String $sppl_grp_nm5 = "sppl_grp_nm5";
	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public static final String $sppl_grp_cd6 = "sppl_grp_cd6";
	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public static final String $sppl_grp_nm6 = "sppl_grp_nm6";
	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public static final String $sppl_grp_cd7 = "sppl_grp_cd7";
	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public static final String $sppl_grp_nm7 = "sppl_grp_nm7";
	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public static final String $sppl_grp_cd8 = "sppl_grp_cd8";
	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public static final String $sppl_grp_nm8 = "sppl_grp_nm8";
	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public static final String $sppl_grp_cd9 = "sppl_grp_cd9";
	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public static final String $sppl_grp_nm9 = "sppl_grp_nm9";
	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $sppl_grp_cd10 = "sppl_grp_cd10";
	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public static final String $sppl_grp_nm10 = "sppl_grp_nm10";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cntry_cd = "sppl_cntry_cd";
	/**
	 * Country name 国名.<p>
	 *
	 */
	public static final String $sppl_cntry_nm = "sppl_cntry_nm";
	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public static final String $sppl_area_cd = "sppl_area_cd";
	/**
	 * Region name 地域名.<p>
	 *
	 */
	public static final String $sppl_area_nm = "sppl_area_nm";
	/**
	 * Allocation dept. cd. 配賦部門ＣＤ.<p>
	 *
	 */
	public static final String $alc_dpt_cd = "alc_dpt_cd";
	/**
	 * Allocation dept. name 配賦部門名.<p>
	 *
	 */
	public static final String $alc_dpt_nm = "alc_dpt_nm";
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
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Key index キーインデックス.<p>
	 *
	 */
	public static final String $key_idx = "key_idx";
	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public static final String $elm_no = "elm_no";
	/**
	 * Column key 項目キー.<p>
	 *
	 */
	public static final String $elm = "elm";
	/**
	 * Column 項目.<p>
	 *
	 */
	public static final String $elm_nm = "elm_nm";
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
	public static final String $ttl_qty_p = "ttl_qty_p";
	public static final String $qty_00_p = "qty_00_p";
	public static final String $qty_01_p = "qty_01_p";
	public static final String $qty_02_p = "qty_02_p";
	public static final String $qty_03_p = "qty_03_p";
	public static final String $qty_04_p = "qty_04_p";
	public static final String $qty_05_p = "qty_05_p";
	public static final String $qty_06_p = "qty_06_p";
	public static final String $qty_07_p = "qty_07_p";
	public static final String $qty_08_p = "qty_08_p";
	public static final String $qty_09_p = "qty_09_p";
	public static final String $qty_10_p = "qty_10_p";
	public static final String $qty_11_p = "qty_11_p";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $ttl = $ttl_qty_p + ".qty";
	public static final String $col_00 = $qty_00_p + ".qty";
	public static final String $col_01 = $qty_01_p + ".qty";
	public static final String $col_02 = $qty_02_p + ".qty";
	public static final String $col_03 = $qty_03_p + ".qty";
	public static final String $col_04 = $qty_04_p + ".qty";
	public static final String $col_05 = $qty_05_p + ".qty";
	public static final String $col_06 = $qty_06_p + ".qty";
	public static final String $col_07 = $qty_07_p + ".qty";
	public static final String $col_08 = $qty_08_p + ".qty";
	public static final String $col_09 = $qty_09_p + ".qty";
	public static final String $col_10 = $qty_10_p + ".qty";
	public static final String $col_11 = $qty_11_p + ".qty";

	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
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
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_grp_cd1_META = createCommonMeta($sppl_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm1_META = createCommonMeta($sppl_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd2_META = createCommonMeta($sppl_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm2_META = createCommonMeta($sppl_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd3_META = createCommonMeta($sppl_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm3_META = createCommonMeta($sppl_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd4_META = createCommonMeta($sppl_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm4_META = createCommonMeta($sppl_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd5_META = createCommonMeta($sppl_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm5_META = createCommonMeta($sppl_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd6_META = createCommonMeta($sppl_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm6_META = createCommonMeta($sppl_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd7_META = createCommonMeta($sppl_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm7_META = createCommonMeta($sppl_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd8_META = createCommonMeta($sppl_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm8_META = createCommonMeta($sppl_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd9_META = createCommonMeta($sppl_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm9_META = createCommonMeta($sppl_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd10_META = createCommonMeta($sppl_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm10_META = createCommonMeta($sppl_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_cntry_cd_META = createCommonMeta($sppl_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta sppl_cntry_nm_META = createCommonMeta($sppl_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta sppl_area_cd_META = createCommonMeta($sppl_area_cd, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta sppl_area_nm_META = createCommonMeta($sppl_area_nm, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta alc_dpt_cd_META = createCommonMeta($alc_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta alc_dpt_nm_META = createCommonMeta($alc_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta key_idx_META = createNumberMeta($key_idx);
	public static final MCMeta elm_no_META = createNumberMeta($elm_no);
	public static final MCMeta elm_META = createStringMeta($elm);
	public static final MCMeta elm_nm_META = createStringMeta($elm_nm);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta ttl_qty_p_META = createInnerRowMeta($ttl_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_00_p_META = createInnerRowMeta($qty_00_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_01_p_META = createInnerRowMeta($qty_01_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_02_p_META = createInnerRowMeta($qty_02_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_03_p_META = createInnerRowMeta($qty_03_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_04_p_META = createInnerRowMeta($qty_04_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_05_p_META = createInnerRowMeta($qty_05_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_06_p_META = createInnerRowMeta($qty_06_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_07_p_META = createInnerRowMeta($qty_07_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_08_p_META = createInnerRowMeta($qty_08_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_09_p_META = createInnerRowMeta($qty_09_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_10_p_META = createInnerRowMeta($qty_10_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_11_p_META = createInnerRowMeta($qty_11_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);

	protected static final ConstMetaList<DispRsltR> constMetas = new ConstMetaList<DispRsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_grp_cd_META,
			calc_no_META,
			wg_cd_META,
			wg_nm_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
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
			loc_cd_META,
			loc_nm_META,
			site_cd_META,
			site_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			sppl_grp_cd1_META,
			sppl_grp_nm1_META,
			sppl_grp_cd2_META,
			sppl_grp_nm2_META,
			sppl_grp_cd3_META,
			sppl_grp_nm3_META,
			sppl_grp_cd4_META,
			sppl_grp_nm4_META,
			sppl_grp_cd5_META,
			sppl_grp_nm5_META,
			sppl_grp_cd6_META,
			sppl_grp_nm6_META,
			sppl_grp_cd7_META,
			sppl_grp_nm7_META,
			sppl_grp_cd8_META,
			sppl_grp_nm8_META,
			sppl_grp_cd9_META,
			sppl_grp_nm9_META,
			sppl_grp_cd10_META,
			sppl_grp_nm10_META,
			sppl_cntry_cd_META,
			sppl_cntry_nm_META,
			sppl_area_cd_META,
			sppl_area_nm_META,
			alc_dpt_cd_META,
			alc_dpt_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			dec_place_META,
			key_idx_META,
			elm_no_META,
			elm_META,
			elm_nm_META,
			unit_cd_META,
			unit_nm_META,
			ttl_qty_p_META,
			qty_00_p_META,
			qty_01_p_META,
			qty_02_p_META,
			qty_03_p_META,
			qty_04_p_META,
			qty_05_p_META,
			qty_06_p_META,
			qty_07_p_META,
			qty_08_p_META,
			qty_09_p_META,
			qty_10_p_META,
			qty_11_p_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"ttl",
				"col_00",
				"col_01",
				"col_02",
				"col_03",
				"col_04",
				"col_05",
				"col_06",
				"col_07",
				"col_08",
				"col_09",
				"col_10",
				"col_11"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$ttl,
				$col_00,
				$col_01,
				$col_02,
				$col_03,
				$col_04,
				$col_05,
				$col_06,
				$col_07,
				$col_08,
				$col_09,
				$col_10,
				$col_11
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
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"}	// site_nm
			}
		)),
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
		new MCExtMap.Entry($$CLEAR, new MCExtList(
			new String[][]{
				{$calc_grp_cd, "Key"},	// calc_grp_cd
				{$calc_no, "Key"},	// calc_no
				{$wg_cd, "Key"},	// wg_cd
				{$wg_nm, "Key"},	// wg_nm
				{$mng_dpt_cd, "Key"},	// mng_dpt_cd
				{$mng_dpt_nm, "Key"},	// mng_dpt_nm
				{$itm_p, "Key"},	// itm_p
				{$itm_typ, "Key"},	// itm_typ
				{$itm_typ_nm, "Key"},	// itm_typ_nm
				{$itm_typ_d_cd, "Key"},	// itm_typ_d_cd
				{$itm_typ_d_nm, "Key"},	// itm_typ_d_nm
				{$itm_jnl_cd, "Key"},	// itm_jnl_cd
				{$itm_jnl_nm, "Key"},	// itm_jnl_nm
				{$itm_grp_cd1, "Key"},	// itm_grp_cd1
				{$itm_grp_nm1, "Key"},	// itm_grp_nm1
				{$itm_grp_cd2, "Key"},	// itm_grp_cd2
				{$itm_grp_nm2, "Key"},	// itm_grp_nm2
				{$itm_grp_cd3, "Key"},	// itm_grp_cd3
				{$itm_grp_nm3, "Key"},	// itm_grp_nm3
				{$itm_grp_cd4, "Key"},	// itm_grp_cd4
				{$itm_grp_nm4, "Key"},	// itm_grp_nm4
				{$itm_grp_cd5, "Key"},	// itm_grp_cd5
				{$itm_grp_nm5, "Key"},	// itm_grp_nm5
				{$itm_grp_cd6, "Key"},	// itm_grp_cd6
				{$itm_grp_nm6, "Key"},	// itm_grp_nm6
				{$itm_grp_cd7, "Key"},	// itm_grp_cd7
				{$itm_grp_nm7, "Key"},	// itm_grp_nm7
				{$itm_grp_cd8, "Key"},	// itm_grp_cd8
				{$itm_grp_nm8, "Key"},	// itm_grp_nm8
				{$itm_grp_cd9, "Key"},	// itm_grp_cd9
				{$itm_grp_nm9, "Key"},	// itm_grp_nm9
				{$itm_grp_cd10, "Key"},	// itm_grp_cd10
				{$itm_grp_nm10, "Key"},	// itm_grp_nm10
				{$lot_no, "Key"},	// lot_no
				{$sublot_no, "Key"},	// sublot_no
				{$sno1, "Key"},	// sno1
				{$sno2, "Key"},	// sno2
				{$sno3, "Key"},	// sno3
				{$sno4, "Key"},	// sno4
				{$loc_cd, "Key"},	// loc_cd
				{$loc_nm, "Key"},	// loc_nm
				{$site_cd, "Key"},	// site_cd
				{$site_nm, "Key"},	// site_nm
				{$sppl_cd, "Key"},	// sppl_cd
				{$sppl_nm, "Key"},	// sppl_nm
				{$sppl_grp_cd1, "Key"},	// sppl_grp_cd1
				{$sppl_grp_nm1, "Key"},	// sppl_grp_nm1
				{$sppl_grp_cd2, "Key"},	// sppl_grp_cd2
				{$sppl_grp_nm2, "Key"},	// sppl_grp_nm2
				{$sppl_grp_cd3, "Key"},	// sppl_grp_cd3
				{$sppl_grp_nm3, "Key"},	// sppl_grp_nm3
				{$sppl_grp_cd4, "Key"},	// sppl_grp_cd4
				{$sppl_grp_nm4, "Key"},	// sppl_grp_nm4
				{$sppl_grp_cd5, "Key"},	// sppl_grp_cd5
				{$sppl_grp_nm5, "Key"},	// sppl_grp_nm5
				{$sppl_grp_cd6, "Key"},	// sppl_grp_cd6
				{$sppl_grp_nm6, "Key"},	// sppl_grp_nm6
				{$sppl_grp_cd7, "Key"},	// sppl_grp_cd7
				{$sppl_grp_nm7, "Key"},	// sppl_grp_nm7
				{$sppl_grp_cd8, "Key"},	// sppl_grp_cd8
				{$sppl_grp_nm8, "Key"},	// sppl_grp_nm8
				{$sppl_grp_cd9, "Key"},	// sppl_grp_cd9
				{$sppl_grp_nm9, "Key"},	// sppl_grp_nm9
				{$sppl_grp_cd10, "Key"},	// sppl_grp_cd10
				{$sppl_grp_nm10, "Key"},	// sppl_grp_nm10
				{$sppl_cntry_cd, "Key"},	// sppl_cntry_cd
				{$sppl_cntry_nm, "Key"},	// sppl_cntry_nm
				{$sppl_area_cd, "Key"},	// sppl_area_cd
				{$sppl_area_nm, "Key"},	// sppl_area_nm
				{$alc_dpt_cd, "Key"},	// alc_dpt_cd
				{$alc_dpt_nm, "Key"},	// alc_dpt_nm
				{$asst_typ, "Key"},	// asst_typ
				{$asst_typ_nm, "Key"}	// asst_typ_nm
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
				{$calc_grp_cd, "mng_dpt_flg"},	// calc_grp_cd
				{$calc_no, "mng_dpt_flg"},	// calc_no
				{$wg_cd, "wg_flg"},	// wg_cd
				{$wg_nm, "wg_flg"},	// wg_nm
				{$mng_dpt_cd, "mng_dpt_flg"},	// mng_dpt_cd
				{$mng_dpt_nm, "mng_dpt_flg"},	// mng_dpt_nm
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
				{$loc_cd, "loc_flg"},	// loc_cd
				{$loc_nm, "loc_flg"},	// loc_nm
				{$site_cd, "site_flg"},	// site_cd
				{$site_nm, "site_flg"},	// site_nm
				{$sppl_cd, "sppl_flg"},	// sppl_cd
				{$sppl_nm, "sppl_flg"},	// sppl_nm
				{$sppl_grp_cd1, "sppl_grp_flg1"},	// sppl_grp_cd1
				{$sppl_grp_nm1, "sppl_grp_flg1"},	// sppl_grp_nm1
				{$sppl_grp_cd2, "sppl_grp_flg2"},	// sppl_grp_cd2
				{$sppl_grp_nm2, "sppl_grp_flg2"},	// sppl_grp_nm2
				{$sppl_grp_cd3, "sppl_grp_flg3"},	// sppl_grp_cd3
				{$sppl_grp_nm3, "sppl_grp_flg3"},	// sppl_grp_nm3
				{$sppl_grp_cd4, "sppl_grp_flg4"},	// sppl_grp_cd4
				{$sppl_grp_nm4, "sppl_grp_flg4"},	// sppl_grp_nm4
				{$sppl_grp_cd5, "sppl_grp_flg5"},	// sppl_grp_cd5
				{$sppl_grp_nm5, "sppl_grp_flg5"},	// sppl_grp_nm5
				{$sppl_grp_cd6, "sppl_grp_flg6"},	// sppl_grp_cd6
				{$sppl_grp_nm6, "sppl_grp_flg6"},	// sppl_grp_nm6
				{$sppl_grp_cd7, "sppl_grp_flg7"},	// sppl_grp_cd7
				{$sppl_grp_nm7, "sppl_grp_flg7"},	// sppl_grp_nm7
				{$sppl_grp_cd8, "sppl_grp_flg8"},	// sppl_grp_cd8
				{$sppl_grp_nm8, "sppl_grp_flg8"},	// sppl_grp_nm8
				{$sppl_grp_cd9, "sppl_grp_flg9"},	// sppl_grp_cd9
				{$sppl_grp_nm9, "sppl_grp_flg9"},	// sppl_grp_nm9
				{$sppl_grp_cd10, "sppl_grp_flg10"},	// sppl_grp_cd10
				{$sppl_grp_nm10, "sppl_grp_flg10"},	// sppl_grp_nm10
				{$sppl_cntry_cd, "sppl_cntry_flg"},	// sppl_cntry_cd
				{$sppl_cntry_nm, "sppl_cntry_flg"},	// sppl_cntry_nm
				{$sppl_area_cd, "sppl_area_flg"},	// sppl_area_cd
				{$sppl_area_nm, "sppl_area_flg"},	// sppl_area_nm
				{$alc_dpt_cd, "alc_dpt_flg"},	// alc_dpt_cd
				{$alc_dpt_nm, "alc_dpt_flg"},	// alc_dpt_nm
				{$asst_typ, "asst_flg"},	// asst_typ
				{$asst_typ_nm, "asst_flg"}	// asst_typ_nm
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
				{$qty_00_p + ".qty", "Key"},	// qty_00_p.qty
				{$qty_01_p + ".qty", "Key"},	// qty_01_p.qty
				{$qty_02_p + ".qty", "Key"},	// qty_02_p.qty
				{$qty_03_p + ".qty", "Key"},	// qty_03_p.qty
				{$qty_04_p + ".qty", "Key"},	// qty_04_p.qty
				{$qty_05_p + ".qty", "Key"},	// qty_05_p.qty
				{$qty_06_p + ".qty", "Key"},	// qty_06_p.qty
				{$qty_07_p + ".qty", "Key"},	// qty_07_p.qty
				{$qty_08_p + ".qty", "Key"},	// qty_08_p.qty
				{$qty_09_p + ".qty", "Key"},	// qty_09_p.qty
				{$qty_10_p + ".qty", "Key"},	// qty_10_p.qty
				{$qty_11_p + ".qty", "Key"}	// qty_11_p.qty
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
	protected DispRsltR_MC_A(ConstMetaList<? extends DispRsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispRsltR clone() {
		return (DispRsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispRsltR createInstance() {
		return (DispRsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispRsltR getValues(String... names) {
		return (DispRsltR) super.getValues(names);
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


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 6, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 6, $itm_p, row);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 7, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 7, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 8, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 8, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 9, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 9, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 10, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 10, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 11, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 11, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 12, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 12, $itm_jnl_nm, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 13, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 13, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 14, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 14, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 15, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 15, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 16, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 16, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 17, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 17, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 18, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 18, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 19, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 19, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 20, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 20, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 21, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 21, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 22, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 22, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 23, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 23, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 24, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 24, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 25, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 25, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 26, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 26, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 27, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 27, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 28, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 28, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 29, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 29, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 30, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 30, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 31, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 31, $itm_grp_cd10, value);
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
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 33, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 33, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 34, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 34, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 35, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 35, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 36, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 36, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 37, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 37, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 38, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 38, $sno4, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 39, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 39, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 40, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 40, $loc_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 41, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 41, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 42, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 42, $site_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 43, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 43, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 44, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 44, $sppl_nm, value);
	}


	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public String sppl_grp_cd1() {
		return getConstString(offset + 45, $sppl_grp_cd1);
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public void sppl_grp_cd1(String value) {
		setConstString(offset + 45, $sppl_grp_cd1, value);
	}


	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public String sppl_grp_nm1() {
		return getConstString(offset + 46, $sppl_grp_nm1);
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public void sppl_grp_nm1(String value) {
		setConstString(offset + 46, $sppl_grp_nm1, value);
	}


	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public String sppl_grp_cd2() {
		return getConstString(offset + 47, $sppl_grp_cd2);
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public void sppl_grp_cd2(String value) {
		setConstString(offset + 47, $sppl_grp_cd2, value);
	}


	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public String sppl_grp_nm2() {
		return getConstString(offset + 48, $sppl_grp_nm2);
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public void sppl_grp_nm2(String value) {
		setConstString(offset + 48, $sppl_grp_nm2, value);
	}


	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public String sppl_grp_cd3() {
		return getConstString(offset + 49, $sppl_grp_cd3);
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public void sppl_grp_cd3(String value) {
		setConstString(offset + 49, $sppl_grp_cd3, value);
	}


	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public String sppl_grp_nm3() {
		return getConstString(offset + 50, $sppl_grp_nm3);
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public void sppl_grp_nm3(String value) {
		setConstString(offset + 50, $sppl_grp_nm3, value);
	}


	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public String sppl_grp_cd4() {
		return getConstString(offset + 51, $sppl_grp_cd4);
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public void sppl_grp_cd4(String value) {
		setConstString(offset + 51, $sppl_grp_cd4, value);
	}


	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public String sppl_grp_nm4() {
		return getConstString(offset + 52, $sppl_grp_nm4);
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public void sppl_grp_nm4(String value) {
		setConstString(offset + 52, $sppl_grp_nm4, value);
	}


	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public String sppl_grp_cd5() {
		return getConstString(offset + 53, $sppl_grp_cd5);
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public void sppl_grp_cd5(String value) {
		setConstString(offset + 53, $sppl_grp_cd5, value);
	}


	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public String sppl_grp_nm5() {
		return getConstString(offset + 54, $sppl_grp_nm5);
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public void sppl_grp_nm5(String value) {
		setConstString(offset + 54, $sppl_grp_nm5, value);
	}


	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public String sppl_grp_cd6() {
		return getConstString(offset + 55, $sppl_grp_cd6);
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public void sppl_grp_cd6(String value) {
		setConstString(offset + 55, $sppl_grp_cd6, value);
	}


	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public String sppl_grp_nm6() {
		return getConstString(offset + 56, $sppl_grp_nm6);
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public void sppl_grp_nm6(String value) {
		setConstString(offset + 56, $sppl_grp_nm6, value);
	}


	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public String sppl_grp_cd7() {
		return getConstString(offset + 57, $sppl_grp_cd7);
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public void sppl_grp_cd7(String value) {
		setConstString(offset + 57, $sppl_grp_cd7, value);
	}


	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public String sppl_grp_nm7() {
		return getConstString(offset + 58, $sppl_grp_nm7);
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public void sppl_grp_nm7(String value) {
		setConstString(offset + 58, $sppl_grp_nm7, value);
	}


	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public String sppl_grp_cd8() {
		return getConstString(offset + 59, $sppl_grp_cd8);
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public void sppl_grp_cd8(String value) {
		setConstString(offset + 59, $sppl_grp_cd8, value);
	}


	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public String sppl_grp_nm8() {
		return getConstString(offset + 60, $sppl_grp_nm8);
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public void sppl_grp_nm8(String value) {
		setConstString(offset + 60, $sppl_grp_nm8, value);
	}


	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public String sppl_grp_cd9() {
		return getConstString(offset + 61, $sppl_grp_cd9);
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public void sppl_grp_cd9(String value) {
		setConstString(offset + 61, $sppl_grp_cd9, value);
	}


	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public String sppl_grp_nm9() {
		return getConstString(offset + 62, $sppl_grp_nm9);
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public void sppl_grp_nm9(String value) {
		setConstString(offset + 62, $sppl_grp_nm9, value);
	}


	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public String sppl_grp_cd10() {
		return getConstString(offset + 63, $sppl_grp_cd10);
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public void sppl_grp_cd10(String value) {
		setConstString(offset + 63, $sppl_grp_cd10, value);
	}


	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public String sppl_grp_nm10() {
		return getConstString(offset + 64, $sppl_grp_nm10);
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public void sppl_grp_nm10(String value) {
		setConstString(offset + 64, $sppl_grp_nm10, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String sppl_cntry_cd() {
		return getConstString(offset + 65, $sppl_cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void sppl_cntry_cd(String value) {
		setConstString(offset + 65, $sppl_cntry_cd, value);
	}


	/**
	 * Country name 国名.<p>
	 *
	 */
	public String sppl_cntry_nm() {
		return getConstString(offset + 66, $sppl_cntry_nm);
	}

	/**
	 * Country name 国名.<p>
	 *
	 */
	public void sppl_cntry_nm(String value) {
		setConstString(offset + 66, $sppl_cntry_nm, value);
	}


	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public String sppl_area_cd() {
		return getConstString(offset + 67, $sppl_area_cd);
	}

	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public void sppl_area_cd(String value) {
		setConstString(offset + 67, $sppl_area_cd, value);
	}


	/**
	 * Region name 地域名.<p>
	 *
	 */
	public String sppl_area_nm() {
		return getConstString(offset + 68, $sppl_area_nm);
	}

	/**
	 * Region name 地域名.<p>
	 *
	 */
	public void sppl_area_nm(String value) {
		setConstString(offset + 68, $sppl_area_nm, value);
	}


	/**
	 * Allocation dept. cd. 配賦部門ＣＤ.<p>
	 *
	 */
	public String alc_dpt_cd() {
		return getConstString(offset + 69, $alc_dpt_cd);
	}

	/**
	 * Allocation dept. cd. 配賦部門ＣＤ.<p>
	 *
	 */
	public void alc_dpt_cd(String value) {
		setConstString(offset + 69, $alc_dpt_cd, value);
	}


	/**
	 * Allocation dept. name 配賦部門名.<p>
	 *
	 */
	public String alc_dpt_nm() {
		return getConstString(offset + 70, $alc_dpt_nm);
	}

	/**
	 * Allocation dept. name 配賦部門名.<p>
	 *
	 */
	public void alc_dpt_nm(String value) {
		setConstString(offset + 70, $alc_dpt_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 71, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 71, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 72, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 72, $asst_typ_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 73, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 73, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 73, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 73, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 73, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 73, $dec_place, value);
	}


	/**
	 * Key index キーインデックス.<p>
	 *
	 */
	public MCNumber key_idx() {
		return getConstNumber(offset + 74, $key_idx);
	}

	/**
	 * Key index キーインデックス.<p>
	 *
	 */
	public void key_idx(MCNumber value) {
		setConstNumber(offset + 74, $key_idx, value);
	}

	/**
	 * Key index キーインデックス.<p>
	 *
	 */
	public void key_idx(int value) {
		setConstNumber(offset + 74, $key_idx, value);
	}

	/**
	 * Key index キーインデックス.<p>
	 *
	 */
	public void key_idx(long value) {
		setConstNumber(offset + 74, $key_idx, value);
	}

	/**
	 * Key index キーインデックス.<p>
	 *
	 */
	public void key_idx(float value) {
		setConstNumber(offset + 74, $key_idx, value);
	}

	/**
	 * Key index キーインデックス.<p>
	 *
	 */
	public void key_idx(double value) {
		setConstNumber(offset + 74, $key_idx, value);
	}


	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public MCNumber elm_no() {
		return getConstNumber(offset + 75, $elm_no);
	}

	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public void elm_no(MCNumber value) {
		setConstNumber(offset + 75, $elm_no, value);
	}

	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public void elm_no(int value) {
		setConstNumber(offset + 75, $elm_no, value);
	}

	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public void elm_no(long value) {
		setConstNumber(offset + 75, $elm_no, value);
	}

	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public void elm_no(float value) {
		setConstNumber(offset + 75, $elm_no, value);
	}

	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public void elm_no(double value) {
		setConstNumber(offset + 75, $elm_no, value);
	}


	/**
	 * Column key 項目キー.<p>
	 *
	 */
	public String elm() {
		return getConstString(offset + 76, $elm);
	}

	/**
	 * Column key 項目キー.<p>
	 *
	 */
	public void elm(String value) {
		setConstString(offset + 76, $elm, value);
	}


	/**
	 * Column 項目.<p>
	 *
	 */
	public String elm_nm() {
		return getConstString(offset + 77, $elm_nm);
	}

	/**
	 * Column 項目.<p>
	 *
	 */
	public void elm_nm(String value) {
		setConstString(offset + 77, $elm_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 78, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 78, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 79, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 79, $unit_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR ttl_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 80, $ttl_qty_p);
	}
	
	public void ttl_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 80, $ttl_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_00_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 81, $qty_00_p);
	}
	
	public void qty_00_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 81, $qty_00_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_01_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 82, $qty_01_p);
	}
	
	public void qty_01_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 82, $qty_01_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_02_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 83, $qty_02_p);
	}
	
	public void qty_02_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 83, $qty_02_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_03_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 84, $qty_03_p);
	}
	
	public void qty_03_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 84, $qty_03_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_04_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 85, $qty_04_p);
	}
	
	public void qty_04_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 85, $qty_04_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_05_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 86, $qty_05_p);
	}
	
	public void qty_05_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 86, $qty_05_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_06_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 87, $qty_06_p);
	}
	
	public void qty_06_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 87, $qty_06_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_07_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 88, $qty_07_p);
	}
	
	public void qty_07_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 88, $qty_07_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_08_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 89, $qty_08_p);
	}
	
	public void qty_08_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 89, $qty_08_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_09_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 90, $qty_09_p);
	}
	
	public void qty_09_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 90, $qty_09_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_10_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 91, $qty_10_p);
	}
	
	public void qty_10_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 91, $qty_10_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_11_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 92, $qty_11_p);
	}
	
	public void qty_11_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 92, $qty_11_p, row);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			return sppl_grp_cd1();
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			return sppl_grp_nm1();
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			return sppl_grp_cd2();
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			return sppl_grp_nm2();
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			return sppl_grp_cd3();
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			return sppl_grp_nm3();
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			return sppl_grp_cd4();
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			return sppl_grp_nm4();
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			return sppl_grp_cd5();
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			return sppl_grp_nm5();
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			return sppl_grp_cd6();
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			return sppl_grp_nm6();
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			return sppl_grp_cd7();
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			return sppl_grp_nm7();
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			return sppl_grp_cd8();
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			return sppl_grp_nm8();
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			return sppl_grp_cd9();
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			return sppl_grp_nm9();
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			return sppl_grp_cd10();
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			return sppl_grp_nm10();
		}
		if ($sppl_cntry_cd.equalsIgnoreCase(name)) {
			return sppl_cntry_cd();
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			return sppl_cntry_nm();
		}
		if ($sppl_area_cd.equalsIgnoreCase(name)) {
			return sppl_area_cd();
		}
		if ($sppl_area_nm.equalsIgnoreCase(name)) {
			return sppl_area_nm();
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			return alc_dpt_cd();
		}
		if ($alc_dpt_nm.equalsIgnoreCase(name)) {
			return alc_dpt_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($elm.equalsIgnoreCase(name)) {
			return elm();
		}
		if ($elm_nm.equalsIgnoreCase(name)) {
			return elm_nm();
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
		if ($key_idx.equalsIgnoreCase(name)) {
			return key_idx();
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			return elm_no();
		}
		return super.getNumber(name);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			return sppl_grp_cd1();
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			return sppl_grp_nm1();
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			return sppl_grp_cd2();
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			return sppl_grp_nm2();
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			return sppl_grp_cd3();
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			return sppl_grp_nm3();
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			return sppl_grp_cd4();
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			return sppl_grp_nm4();
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			return sppl_grp_cd5();
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			return sppl_grp_nm5();
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			return sppl_grp_cd6();
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			return sppl_grp_nm6();
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			return sppl_grp_cd7();
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			return sppl_grp_nm7();
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			return sppl_grp_cd8();
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			return sppl_grp_nm8();
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			return sppl_grp_cd9();
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			return sppl_grp_nm9();
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			return sppl_grp_cd10();
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			return sppl_grp_nm10();
		}
		if ($sppl_cntry_cd.equalsIgnoreCase(name)) {
			return sppl_cntry_cd();
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			return sppl_cntry_nm();
		}
		if ($sppl_area_cd.equalsIgnoreCase(name)) {
			return sppl_area_cd();
		}
		if ($sppl_area_nm.equalsIgnoreCase(name)) {
			return sppl_area_nm();
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			return alc_dpt_cd();
		}
		if ($alc_dpt_nm.equalsIgnoreCase(name)) {
			return alc_dpt_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($elm.equalsIgnoreCase(name)) {
			return elm();
		}
		if ($elm_nm.equalsIgnoreCase(name)) {
			return elm_nm();
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
		if ($key_idx.equalsIgnoreCase(name)) {
			return key_idx();
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			return elm_no();
		}
		return super.getNumberNE(name);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			sppl_grp_cd1(value);
			return;
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			sppl_grp_nm1(value);
			return;
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			sppl_grp_cd2(value);
			return;
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			sppl_grp_nm2(value);
			return;
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			sppl_grp_cd3(value);
			return;
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			sppl_grp_nm3(value);
			return;
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			sppl_grp_cd4(value);
			return;
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			sppl_grp_nm4(value);
			return;
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			sppl_grp_cd5(value);
			return;
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			sppl_grp_nm5(value);
			return;
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			sppl_grp_cd6(value);
			return;
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			sppl_grp_nm6(value);
			return;
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			sppl_grp_cd7(value);
			return;
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			sppl_grp_nm7(value);
			return;
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			sppl_grp_cd8(value);
			return;
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			sppl_grp_nm8(value);
			return;
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			sppl_grp_cd9(value);
			return;
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			sppl_grp_nm9(value);
			return;
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			sppl_grp_cd10(value);
			return;
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			sppl_grp_nm10(value);
			return;
		}
		if ($sppl_cntry_cd.equalsIgnoreCase(name)) {
			sppl_cntry_cd(value);
			return;
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			sppl_cntry_nm(value);
			return;
		}
		if ($sppl_area_cd.equalsIgnoreCase(name)) {
			sppl_area_cd(value);
			return;
		}
		if ($sppl_area_nm.equalsIgnoreCase(name)) {
			sppl_area_nm(value);
			return;
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			alc_dpt_cd(value);
			return;
		}
		if ($alc_dpt_nm.equalsIgnoreCase(name)) {
			alc_dpt_nm(value);
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
		if ($elm.equalsIgnoreCase(name)) {
			elm(value);
			return;
		}
		if ($elm_nm.equalsIgnoreCase(name)) {
			elm_nm(value);
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
		if ($key_idx.equalsIgnoreCase(name)) {
			key_idx(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($key_idx.equalsIgnoreCase(name)) {
			key_idx(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($key_idx.equalsIgnoreCase(name)) {
			key_idx(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($key_idx.equalsIgnoreCase(name)) {
			key_idx(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($key_idx.equalsIgnoreCase(name)) {
			key_idx(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			sppl_grp_cd1(value);
			return;
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			sppl_grp_nm1(value);
			return;
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			sppl_grp_cd2(value);
			return;
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			sppl_grp_nm2(value);
			return;
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			sppl_grp_cd3(value);
			return;
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			sppl_grp_nm3(value);
			return;
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			sppl_grp_cd4(value);
			return;
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			sppl_grp_nm4(value);
			return;
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			sppl_grp_cd5(value);
			return;
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			sppl_grp_nm5(value);
			return;
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			sppl_grp_cd6(value);
			return;
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			sppl_grp_nm6(value);
			return;
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			sppl_grp_cd7(value);
			return;
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			sppl_grp_nm7(value);
			return;
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			sppl_grp_cd8(value);
			return;
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			sppl_grp_nm8(value);
			return;
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			sppl_grp_cd9(value);
			return;
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			sppl_grp_nm9(value);
			return;
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			sppl_grp_cd10(value);
			return;
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			sppl_grp_nm10(value);
			return;
		}
		if ($sppl_cntry_cd.equalsIgnoreCase(name)) {
			sppl_cntry_cd(value);
			return;
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			sppl_cntry_nm(value);
			return;
		}
		if ($sppl_area_cd.equalsIgnoreCase(name)) {
			sppl_area_cd(value);
			return;
		}
		if ($sppl_area_nm.equalsIgnoreCase(name)) {
			sppl_area_nm(value);
			return;
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			alc_dpt_cd(value);
			return;
		}
		if ($alc_dpt_nm.equalsIgnoreCase(name)) {
			alc_dpt_nm(value);
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
		if ($elm.equalsIgnoreCase(name)) {
			elm(value);
			return;
		}
		if ($elm_nm.equalsIgnoreCase(name)) {
			elm_nm(value);
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
		if ($key_idx.equalsIgnoreCase(name)) {
			key_idx(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($key_idx.equalsIgnoreCase(name)) {
			key_idx(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($key_idx.equalsIgnoreCase(name)) {
			key_idx(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($key_idx.equalsIgnoreCase(name)) {
			key_idx(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($key_idx.equalsIgnoreCase(name)) {
			key_idx(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($ttl_qty_p.equalsIgnoreCase(name)) {
			return ttl_qty_p();
		}
		if ($qty_00_p.equalsIgnoreCase(name)) {
			return qty_00_p();
		}
		if ($qty_01_p.equalsIgnoreCase(name)) {
			return qty_01_p();
		}
		if ($qty_02_p.equalsIgnoreCase(name)) {
			return qty_02_p();
		}
		if ($qty_03_p.equalsIgnoreCase(name)) {
			return qty_03_p();
		}
		if ($qty_04_p.equalsIgnoreCase(name)) {
			return qty_04_p();
		}
		if ($qty_05_p.equalsIgnoreCase(name)) {
			return qty_05_p();
		}
		if ($qty_06_p.equalsIgnoreCase(name)) {
			return qty_06_p();
		}
		if ($qty_07_p.equalsIgnoreCase(name)) {
			return qty_07_p();
		}
		if ($qty_08_p.equalsIgnoreCase(name)) {
			return qty_08_p();
		}
		if ($qty_09_p.equalsIgnoreCase(name)) {
			return qty_09_p();
		}
		if ($qty_10_p.equalsIgnoreCase(name)) {
			return qty_10_p();
		}
		if ($qty_11_p.equalsIgnoreCase(name)) {
			return qty_11_p();
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
		if ($ttl_qty_p.equalsIgnoreCase(name)) {
			ttl_qty_p(
				((MCContainerMeta) ttl_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_00_p.equalsIgnoreCase(name)) {
			qty_00_p(
				((MCContainerMeta) qty_00_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_01_p.equalsIgnoreCase(name)) {
			qty_01_p(
				((MCContainerMeta) qty_01_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_02_p.equalsIgnoreCase(name)) {
			qty_02_p(
				((MCContainerMeta) qty_02_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_03_p.equalsIgnoreCase(name)) {
			qty_03_p(
				((MCContainerMeta) qty_03_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_04_p.equalsIgnoreCase(name)) {
			qty_04_p(
				((MCContainerMeta) qty_04_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_05_p.equalsIgnoreCase(name)) {
			qty_05_p(
				((MCContainerMeta) qty_05_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_06_p.equalsIgnoreCase(name)) {
			qty_06_p(
				((MCContainerMeta) qty_06_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_07_p.equalsIgnoreCase(name)) {
			qty_07_p(
				((MCContainerMeta) qty_07_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_08_p.equalsIgnoreCase(name)) {
			qty_08_p(
				((MCContainerMeta) qty_08_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_09_p.equalsIgnoreCase(name)) {
			qty_09_p(
				((MCContainerMeta) qty_09_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_10_p.equalsIgnoreCase(name)) {
			qty_10_p(
				((MCContainerMeta) qty_10_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_11_p.equalsIgnoreCase(name)) {
			qty_11_p(
				((MCContainerMeta) qty_11_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
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

	/**
	 * Total 合計.<p>
	 *
	 */
	public MCNumber ttl() {
		return ttl_qty_p().qty();
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(MCNumber value) {
		ttl_qty_p().qty(value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(int value) {
		ttl_qty_p().qty(value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(long value) {
		ttl_qty_p().qty(value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(float value) {
		ttl_qty_p().qty(value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(double value) {
		ttl_qty_p().qty(value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public MCNumber col_00() {
		return qty_00_p().qty();
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_00(MCNumber value) {
		qty_00_p().qty(value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_00(int value) {
		qty_00_p().qty(value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_00(long value) {
		qty_00_p().qty(value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_00(float value) {
		qty_00_p().qty(value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_00(double value) {
		qty_00_p().qty(value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public MCNumber col_01() {
		return qty_01_p().qty();
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_01(MCNumber value) {
		qty_01_p().qty(value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_01(int value) {
		qty_01_p().qty(value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_01(long value) {
		qty_01_p().qty(value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_01(float value) {
		qty_01_p().qty(value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_01(double value) {
		qty_01_p().qty(value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public MCNumber col_02() {
		return qty_02_p().qty();
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_02(MCNumber value) {
		qty_02_p().qty(value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_02(int value) {
		qty_02_p().qty(value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_02(long value) {
		qty_02_p().qty(value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_02(float value) {
		qty_02_p().qty(value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_02(double value) {
		qty_02_p().qty(value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public MCNumber col_03() {
		return qty_03_p().qty();
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_03(MCNumber value) {
		qty_03_p().qty(value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_03(int value) {
		qty_03_p().qty(value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_03(long value) {
		qty_03_p().qty(value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_03(float value) {
		qty_03_p().qty(value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_03(double value) {
		qty_03_p().qty(value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public MCNumber col_04() {
		return qty_04_p().qty();
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_04(MCNumber value) {
		qty_04_p().qty(value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_04(int value) {
		qty_04_p().qty(value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_04(long value) {
		qty_04_p().qty(value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_04(float value) {
		qty_04_p().qty(value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_04(double value) {
		qty_04_p().qty(value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public MCNumber col_05() {
		return qty_05_p().qty();
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_05(MCNumber value) {
		qty_05_p().qty(value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_05(int value) {
		qty_05_p().qty(value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_05(long value) {
		qty_05_p().qty(value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_05(float value) {
		qty_05_p().qty(value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_05(double value) {
		qty_05_p().qty(value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public MCNumber col_06() {
		return qty_06_p().qty();
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_06(MCNumber value) {
		qty_06_p().qty(value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_06(int value) {
		qty_06_p().qty(value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_06(long value) {
		qty_06_p().qty(value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_06(float value) {
		qty_06_p().qty(value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_06(double value) {
		qty_06_p().qty(value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public MCNumber col_07() {
		return qty_07_p().qty();
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_07(MCNumber value) {
		qty_07_p().qty(value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_07(int value) {
		qty_07_p().qty(value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_07(long value) {
		qty_07_p().qty(value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_07(float value) {
		qty_07_p().qty(value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_07(double value) {
		qty_07_p().qty(value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public MCNumber col_08() {
		return qty_08_p().qty();
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_08(MCNumber value) {
		qty_08_p().qty(value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_08(int value) {
		qty_08_p().qty(value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_08(long value) {
		qty_08_p().qty(value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_08(float value) {
		qty_08_p().qty(value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_08(double value) {
		qty_08_p().qty(value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public MCNumber col_09() {
		return qty_09_p().qty();
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_09(MCNumber value) {
		qty_09_p().qty(value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_09(int value) {
		qty_09_p().qty(value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_09(long value) {
		qty_09_p().qty(value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_09(float value) {
		qty_09_p().qty(value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_09(double value) {
		qty_09_p().qty(value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public MCNumber col_10() {
		return qty_10_p().qty();
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_10(MCNumber value) {
		qty_10_p().qty(value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_10(int value) {
		qty_10_p().qty(value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_10(long value) {
		qty_10_p().qty(value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_10(float value) {
		qty_10_p().qty(value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_10(double value) {
		qty_10_p().qty(value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public MCNumber col_11() {
		return qty_11_p().qty();
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void col_11(MCNumber value) {
		qty_11_p().qty(value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void col_11(int value) {
		qty_11_p().qty(value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void col_11(long value) {
		qty_11_p().qty(value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void col_11(float value) {
		qty_11_p().qty(value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void col_11(double value) {
		qty_11_p().qty(value);
	}

}

