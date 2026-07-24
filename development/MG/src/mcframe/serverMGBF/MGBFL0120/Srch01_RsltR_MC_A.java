package mcframe.serverMGBF.MGBFL0120;

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
	 * Dept. master (Dummy for join) 部門マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_mng_dpt = "dummy_mng_dpt";
	/**
	 * Dept. master (Dummy for join) 部門マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_alc_dpt = "dummy_alc_dpt";
	/**
	 * Item master (Dummy for join) 品目マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm = "dummy_itm";
	/**
	 * Item type details master (Dummy for join) 品目区分詳細マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_typ_d = "dummy_itm_typ_d";
	/**
	 * Item journal master (Dummy for join) 品目仕訳マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_jnl = "dummy_itm_jnl";
	/**
	 * Location master (Dummy for join) 場所マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_loc = "dummy_loc";
	/**
	 * Factory/Distribution warehouse master (Dummy for join) 工場・物流倉庫マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_site = "dummy_site";
	/**
	 * Line master (Dummy for join) ラインマスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_str_ln = "dummy_str_ln";
	/**
	 * BP master (Dummy for join) 取引先マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp = "dummy_bp";
	/**
	 * Country (BP) master (Dummy for Join) 国（取引先）マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_cntry = "dummy_bp_cntry";
	/**
	 * Region (BP) Master (Dummy for join) 地域（取引先）マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_area = "dummy_bp_area";
	/**
	 * Accounting reason master (Dummy for join) 会計理由マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_ac_rsn = "dummy_ac_rsn";
	/**
	 * Operation master (Dummy for join) 工程マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_oper = "dummy_oper";
	/**
	 * Work element master (Dummy for join) 工数管理マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_wk_cost = "dummy_wk_cost";
	/**
	 * Man-hour reason master (Dummy for Joining) 工数理由マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_wk_rsn = "dummy_wk_rsn";
	/**
	 * General purpose allocation classification master (coupling dummy) 汎用配賦分類マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_gp_alc = "dummy_gp_alc";
	/**
	 * Allocation account group 1 (Dummy for join) 配賦科目グループ１マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_alc_ac_grp1 = "dummy_alc_ac_grp1";
	/**
	 * Allocation account group 2 (Dummy for join) 配賦科目グループ２マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_alc_ac_grp2 = "dummy_alc_ac_grp2";
	/**
	 * Allocation account group 3 (Dummy for join) 配賦科目グループ３マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_alc_ac_grp3 = "dummy_alc_ac_grp3";
	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp1 = "dummy_itm_grp1";
	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp2 = "dummy_itm_grp2";
	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp3 = "dummy_itm_grp3";
	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp4 = "dummy_itm_grp4";
	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp5 = "dummy_itm_grp5";
	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp6 = "dummy_itm_grp6";
	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp7 = "dummy_itm_grp7";
	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp8 = "dummy_itm_grp8";
	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp9 = "dummy_itm_grp9";
	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp10 = "dummy_itm_grp10";
	/**
	 * BP classification master 1 (Dummy for join) 取引先分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_grp1 = "dummy_bp_grp1";
	/**
	 * BP classification master 2 (Dummy for join) 取引先分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_grp2 = "dummy_bp_grp2";
	/**
	 * BP classification master 3 (Dummy for join) 取引先分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_grp3 = "dummy_bp_grp3";
	/**
	 * BP classification master 4 (Dummy for join) 取引先分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_grp4 = "dummy_bp_grp4";
	/**
	 * BP classification master 5 (Dummy for join) 取引先分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_grp5 = "dummy_bp_grp5";
	/**
	 * BP classification master 6 (Dummy for join) 取引先分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_grp6 = "dummy_bp_grp6";
	/**
	 * BP classification master 7 (Dummy for join) 取引先分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_grp7 = "dummy_bp_grp7";
	/**
	 * BP classification master 8 (Dummy for join) 取引先分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_grp8 = "dummy_bp_grp8";
	/**
	 * BP classification master 9 (Dummy for join) 取引先分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_grp9 = "dummy_bp_grp9";
	/**
	 * BP classification master 10 (Dummy for join) 取引先分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_grp10 = "dummy_bp_grp10";
	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Input expense type 入力費用区分.<p>
	 *
	 */
	public static final String $inpt_alc_typ = "inpt_alc_typ";
	/**
	 * Input expense type name 入力費用区分名.<p>
	 *
	 */
	public static final String $inpt_alc_typ_nm = "inpt_alc_typ_nm";
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public static final String $alc_ac_cd = "alc_ac_cd";
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public static final String $alc_ac_nm = "alc_ac_nm";
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
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
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
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
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
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public static final String $ctg_cd = "ctg_cd";
	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public static final String $ctg_nm = "ctg_nm";
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
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
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
	 * Cost element group cd. 費目グループＣＤ.<p>
	 *
	 */
	public static final String $expns_grp_cd = "expns_grp_cd";
	/**
	 * Cost element group name 費目グループ名.<p>
	 *
	 */
	public static final String $expns_grp_nm = "expns_grp_nm";
	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public static final String $expns_cd = "expns_cd";
	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public static final String $expns_nm = "expns_nm";
	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public static final String $alc_ptn_cd = "alc_ptn_cd";
	/**
	 * Allocation pattern name 配賦パタン名.<p>
	 *
	 */
	public static final String $alc_ptn_nm = "alc_ptn_nm";
	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public static final String $alc_amt = "alc_amt";
	/**
	 * Fraction adjustment amount 端数調整金額.<p>
	 *
	 */
	public static final String $adj_amt = "adj_amt";
	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public static final String $alc_tgt_val = "alc_tgt_val";
	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public static final String $alc_rate = "alc_rate";
	/**
	 * Standard allocation rate 標準配賦率.<p>
	 *
	 */
	public static final String $std_alc_rate = "std_alc_rate";
	/**
	 * Allocation target (Without coefficient) 配賦対象（係数無）.<p>
	 *
	 */
	public static final String $alc_org_tgt_val = "alc_org_tgt_val";


	public static final MCMeta dummy_term_META = createCommonMeta($dummy_term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta dummy_mng_dpt_META = createCommonMeta($dummy_mng_dpt, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta dummy_alc_dpt_META = createCommonMeta($dummy_alc_dpt, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta dummy_itm_META = createCommonMeta($dummy_itm, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta dummy_itm_typ_d_META = createCommonMeta($dummy_itm_typ_d, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta dummy_itm_jnl_META = createCommonMeta($dummy_itm_jnl, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta dummy_loc_META = createCommonMeta($dummy_loc, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta dummy_site_META = createCommonMeta($dummy_site, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta dummy_str_ln_META = createCommonMeta($dummy_str_ln, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta dummy_bp_META = createCommonMeta($dummy_bp, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dummy_bp_cntry_META = createCommonMeta($dummy_bp_cntry, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta dummy_bp_area_META = createCommonMeta($dummy_bp_area, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta dummy_ac_rsn_META = createCommonMeta($dummy_ac_rsn, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta dummy_oper_META = createCommonMeta($dummy_oper, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta dummy_wk_cost_META = createCommonMeta($dummy_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta dummy_wk_rsn_META = createCommonMeta($dummy_wk_rsn, mcframe.commonMA.meta.MA_META.WK_RSN_CD);
	public static final MCMeta dummy_gp_alc_META = createCommonMeta($dummy_gp_alc, mcframe.commonMA.meta.MA_META.GP_ALC_CD);
	public static final MCMeta dummy_alc_ac_grp1_META = createCommonMeta($dummy_alc_ac_grp1, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta dummy_alc_ac_grp2_META = createCommonMeta($dummy_alc_ac_grp2, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta dummy_alc_ac_grp3_META = createCommonMeta($dummy_alc_ac_grp3, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta dummy_itm_grp1_META = createCommonMeta($dummy_itm_grp1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp2_META = createCommonMeta($dummy_itm_grp2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp3_META = createCommonMeta($dummy_itm_grp3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp4_META = createCommonMeta($dummy_itm_grp4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp5_META = createCommonMeta($dummy_itm_grp5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp6_META = createCommonMeta($dummy_itm_grp6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp7_META = createCommonMeta($dummy_itm_grp7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp8_META = createCommonMeta($dummy_itm_grp8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp9_META = createCommonMeta($dummy_itm_grp9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp10_META = createCommonMeta($dummy_itm_grp10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_bp_grp1_META = createCommonMeta($dummy_bp_grp1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_bp_grp2_META = createCommonMeta($dummy_bp_grp2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_bp_grp3_META = createCommonMeta($dummy_bp_grp3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_bp_grp4_META = createCommonMeta($dummy_bp_grp4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_bp_grp5_META = createCommonMeta($dummy_bp_grp5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_bp_grp6_META = createCommonMeta($dummy_bp_grp6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_bp_grp7_META = createCommonMeta($dummy_bp_grp7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_bp_grp8_META = createCommonMeta($dummy_bp_grp8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_bp_grp9_META = createCommonMeta($dummy_bp_grp9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_bp_grp10_META = createCommonMeta($dummy_bp_grp10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta inpt_alc_typ_META = createCommonMeta($inpt_alc_typ, mcframe.commonMG.meta.MG_META.INPT_ALC_TYP);
	public static final MCMeta inpt_alc_typ_nm_META = createCommonMeta($inpt_alc_typ_nm, mcframe.commonMG.meta.MG_META.INPT_ALC_TYP_NM);
	public static final MCMeta alc_ac_cd_META = createCommonMeta($alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta alc_ac_nm_META = createCommonMeta($alc_ac_nm, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ctg_cd_META = createCommonMeta($ctg_cd, mcframe.commonMA.meta.MA_META.COST_CTG_CD);
	public static final MCMeta ctg_nm_META = createCommonMeta($ctg_nm, mcframe.commonMA.meta.MA_META.COST_CTG_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta expns_grp_cd_META = createCommonMeta($expns_grp_cd, mcframe.commonMA.meta.MA_META.EXPNS_GRP_CD);
	public static final MCMeta expns_grp_nm_META = createCommonMeta($expns_grp_nm, mcframe.commonMA.meta.MA_META.EXPNS_GRP_NM);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta expns_nm_META = createCommonMeta($expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta alc_ptn_cd_META = createCommonMeta($alc_ptn_cd, mcframe.commonMA.meta.MA_META.ALC_PTN_CD);
	public static final MCMeta alc_ptn_nm_META = createCommonMeta($alc_ptn_nm, mcframe.commonMA.meta.MA_META.ALC_PTN_NM);
	public static final MCMeta alc_amt_META = createCommonMeta($alc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adj_amt_META = createCommonMeta($adj_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta alc_tgt_val_META = createCommonMeta($alc_tgt_val, mcframe.commonMG.meta.MG_META.ALC_TGT_VAL);
	public static final MCMeta alc_rate_META = createCommonMeta($alc_rate, mcframe.commonMA.meta.MA_META.ALC_RATE);
	public static final MCMeta std_alc_rate_META = createCommonMeta($std_alc_rate, mcframe.commonMA.meta.MA_META.ALC_RATE);
	public static final MCMeta alc_org_tgt_val_META = createCommonMeta($alc_org_tgt_val, mcframe.commonMG.meta.MG_META.ALC_TGT_VAL);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dummy_term_META,
			dummy_mng_dpt_META,
			dummy_alc_dpt_META,
			dummy_itm_META,
			dummy_itm_typ_d_META,
			dummy_itm_jnl_META,
			dummy_loc_META,
			dummy_site_META,
			dummy_str_ln_META,
			dummy_bp_META,
			dummy_bp_cntry_META,
			dummy_bp_area_META,
			dummy_ac_rsn_META,
			dummy_oper_META,
			dummy_wk_cost_META,
			dummy_wk_rsn_META,
			dummy_gp_alc_META,
			dummy_alc_ac_grp1_META,
			dummy_alc_ac_grp2_META,
			dummy_alc_ac_grp3_META,
			dummy_itm_grp1_META,
			dummy_itm_grp2_META,
			dummy_itm_grp3_META,
			dummy_itm_grp4_META,
			dummy_itm_grp5_META,
			dummy_itm_grp6_META,
			dummy_itm_grp7_META,
			dummy_itm_grp8_META,
			dummy_itm_grp9_META,
			dummy_itm_grp10_META,
			dummy_bp_grp1_META,
			dummy_bp_grp2_META,
			dummy_bp_grp3_META,
			dummy_bp_grp4_META,
			dummy_bp_grp5_META,
			dummy_bp_grp6_META,
			dummy_bp_grp7_META,
			dummy_bp_grp8_META,
			dummy_bp_grp9_META,
			dummy_bp_grp10_META,
			ym_META,
			inpt_alc_typ_META,
			inpt_alc_typ_nm_META,
			alc_ac_cd_META,
			alc_ac_nm_META,
			wg_cd_META,
			wg_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			loc_cd_META,
			loc_nm_META,
			oper_cd_META,
			oper_nm_META,
			bp_cd_META,
			bp_nm_META,
			ctg_cd_META,
			ctg_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			itm_mfg_inst_no_META,
			po_no_META,
			slo_no_META,
			iv_no_META,
			expns_grp_cd_META,
			expns_grp_nm_META,
			expns_cd_META,
			expns_nm_META,
			alc_ptn_cd_META,
			alc_ptn_nm_META,
			alc_amt_META,
			adj_amt_META,
			alc_tgt_val_META,
			alc_rate_META,
			std_alc_rate_META,
			alc_org_tgt_val_META
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
				{$inpt_alc_typ, "MGC_INPT_ALC_TYP"},	// inpt_alc_typ
				{$itm_typ, "MAC_ITM_TYP"}	// itm_typ
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
	 * Dept. master (Dummy for join) 部門マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_mng_dpt() {
		return getConstString(offset + 1, $dummy_mng_dpt);
	}

	/**
	 * Dept. master (Dummy for join) 部門マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_mng_dpt(String value) {
		setConstString(offset + 1, $dummy_mng_dpt, value);
	}


	/**
	 * Dept. master (Dummy for join) 部門マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_alc_dpt() {
		return getConstString(offset + 2, $dummy_alc_dpt);
	}

	/**
	 * Dept. master (Dummy for join) 部門マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_alc_dpt(String value) {
		setConstString(offset + 2, $dummy_alc_dpt, value);
	}


	/**
	 * Item master (Dummy for join) 品目マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm() {
		return getConstString(offset + 3, $dummy_itm);
	}

	/**
	 * Item master (Dummy for join) 品目マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm(String value) {
		setConstString(offset + 3, $dummy_itm, value);
	}


	/**
	 * Item type details master (Dummy for join) 品目区分詳細マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_typ_d() {
		return getConstString(offset + 4, $dummy_itm_typ_d);
	}

	/**
	 * Item type details master (Dummy for join) 品目区分詳細マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_typ_d(String value) {
		setConstString(offset + 4, $dummy_itm_typ_d, value);
	}


	/**
	 * Item journal master (Dummy for join) 品目仕訳マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_jnl() {
		return getConstString(offset + 5, $dummy_itm_jnl);
	}

	/**
	 * Item journal master (Dummy for join) 品目仕訳マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_jnl(String value) {
		setConstString(offset + 5, $dummy_itm_jnl, value);
	}


	/**
	 * Location master (Dummy for join) 場所マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_loc() {
		return getConstString(offset + 6, $dummy_loc);
	}

	/**
	 * Location master (Dummy for join) 場所マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_loc(String value) {
		setConstString(offset + 6, $dummy_loc, value);
	}


	/**
	 * Factory/Distribution warehouse master (Dummy for join) 工場・物流倉庫マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_site() {
		return getConstString(offset + 7, $dummy_site);
	}

	/**
	 * Factory/Distribution warehouse master (Dummy for join) 工場・物流倉庫マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_site(String value) {
		setConstString(offset + 7, $dummy_site, value);
	}


	/**
	 * Line master (Dummy for join) ラインマスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_str_ln() {
		return getConstString(offset + 8, $dummy_str_ln);
	}

	/**
	 * Line master (Dummy for join) ラインマスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_str_ln(String value) {
		setConstString(offset + 8, $dummy_str_ln, value);
	}


	/**
	 * BP master (Dummy for join) 取引先マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp() {
		return getConstString(offset + 9, $dummy_bp);
	}

	/**
	 * BP master (Dummy for join) 取引先マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp(String value) {
		setConstString(offset + 9, $dummy_bp, value);
	}


	/**
	 * Country (BP) master (Dummy for Join) 国（取引先）マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_cntry() {
		return getConstString(offset + 10, $dummy_bp_cntry);
	}

	/**
	 * Country (BP) master (Dummy for Join) 国（取引先）マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_cntry(String value) {
		setConstString(offset + 10, $dummy_bp_cntry, value);
	}


	/**
	 * Region (BP) Master (Dummy for join) 地域（取引先）マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_area() {
		return getConstString(offset + 11, $dummy_bp_area);
	}

	/**
	 * Region (BP) Master (Dummy for join) 地域（取引先）マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_area(String value) {
		setConstString(offset + 11, $dummy_bp_area, value);
	}


	/**
	 * Accounting reason master (Dummy for join) 会計理由マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_ac_rsn() {
		return getConstString(offset + 12, $dummy_ac_rsn);
	}

	/**
	 * Accounting reason master (Dummy for join) 会計理由マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_ac_rsn(String value) {
		setConstString(offset + 12, $dummy_ac_rsn, value);
	}


	/**
	 * Operation master (Dummy for join) 工程マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_oper() {
		return getConstString(offset + 13, $dummy_oper);
	}

	/**
	 * Operation master (Dummy for join) 工程マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_oper(String value) {
		setConstString(offset + 13, $dummy_oper, value);
	}


	/**
	 * Work element master (Dummy for join) 工数管理マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_wk_cost() {
		return getConstString(offset + 14, $dummy_wk_cost);
	}

	/**
	 * Work element master (Dummy for join) 工数管理マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_wk_cost(String value) {
		setConstString(offset + 14, $dummy_wk_cost, value);
	}


	/**
	 * Man-hour reason master (Dummy for Joining) 工数理由マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_wk_rsn() {
		return getConstString(offset + 15, $dummy_wk_rsn);
	}

	/**
	 * Man-hour reason master (Dummy for Joining) 工数理由マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_wk_rsn(String value) {
		setConstString(offset + 15, $dummy_wk_rsn, value);
	}


	/**
	 * General purpose allocation classification master (coupling dummy) 汎用配賦分類マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_gp_alc() {
		return getConstString(offset + 16, $dummy_gp_alc);
	}

	/**
	 * General purpose allocation classification master (coupling dummy) 汎用配賦分類マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_gp_alc(String value) {
		setConstString(offset + 16, $dummy_gp_alc, value);
	}


	/**
	 * Allocation account group 1 (Dummy for join) 配賦科目グループ１マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_alc_ac_grp1() {
		return getConstString(offset + 17, $dummy_alc_ac_grp1);
	}

	/**
	 * Allocation account group 1 (Dummy for join) 配賦科目グループ１マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_alc_ac_grp1(String value) {
		setConstString(offset + 17, $dummy_alc_ac_grp1, value);
	}


	/**
	 * Allocation account group 2 (Dummy for join) 配賦科目グループ２マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_alc_ac_grp2() {
		return getConstString(offset + 18, $dummy_alc_ac_grp2);
	}

	/**
	 * Allocation account group 2 (Dummy for join) 配賦科目グループ２マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_alc_ac_grp2(String value) {
		setConstString(offset + 18, $dummy_alc_ac_grp2, value);
	}


	/**
	 * Allocation account group 3 (Dummy for join) 配賦科目グループ３マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_alc_ac_grp3() {
		return getConstString(offset + 19, $dummy_alc_ac_grp3);
	}

	/**
	 * Allocation account group 3 (Dummy for join) 配賦科目グループ３マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_alc_ac_grp3(String value) {
		setConstString(offset + 19, $dummy_alc_ac_grp3, value);
	}


	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp1() {
		return getConstString(offset + 20, $dummy_itm_grp1);
	}

	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp1(String value) {
		setConstString(offset + 20, $dummy_itm_grp1, value);
	}


	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp2() {
		return getConstString(offset + 21, $dummy_itm_grp2);
	}

	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp2(String value) {
		setConstString(offset + 21, $dummy_itm_grp2, value);
	}


	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp3() {
		return getConstString(offset + 22, $dummy_itm_grp3);
	}

	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp3(String value) {
		setConstString(offset + 22, $dummy_itm_grp3, value);
	}


	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp4() {
		return getConstString(offset + 23, $dummy_itm_grp4);
	}

	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp4(String value) {
		setConstString(offset + 23, $dummy_itm_grp4, value);
	}


	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp5() {
		return getConstString(offset + 24, $dummy_itm_grp5);
	}

	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp5(String value) {
		setConstString(offset + 24, $dummy_itm_grp5, value);
	}


	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp6() {
		return getConstString(offset + 25, $dummy_itm_grp6);
	}

	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp6(String value) {
		setConstString(offset + 25, $dummy_itm_grp6, value);
	}


	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp7() {
		return getConstString(offset + 26, $dummy_itm_grp7);
	}

	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp7(String value) {
		setConstString(offset + 26, $dummy_itm_grp7, value);
	}


	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp8() {
		return getConstString(offset + 27, $dummy_itm_grp8);
	}

	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp8(String value) {
		setConstString(offset + 27, $dummy_itm_grp8, value);
	}


	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp9() {
		return getConstString(offset + 28, $dummy_itm_grp9);
	}

	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp9(String value) {
		setConstString(offset + 28, $dummy_itm_grp9, value);
	}


	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp10() {
		return getConstString(offset + 29, $dummy_itm_grp10);
	}

	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp10(String value) {
		setConstString(offset + 29, $dummy_itm_grp10, value);
	}


	/**
	 * BP classification master 1 (Dummy for join) 取引先分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp1() {
		return getConstString(offset + 30, $dummy_bp_grp1);
	}

	/**
	 * BP classification master 1 (Dummy for join) 取引先分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp1(String value) {
		setConstString(offset + 30, $dummy_bp_grp1, value);
	}


	/**
	 * BP classification master 2 (Dummy for join) 取引先分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp2() {
		return getConstString(offset + 31, $dummy_bp_grp2);
	}

	/**
	 * BP classification master 2 (Dummy for join) 取引先分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp2(String value) {
		setConstString(offset + 31, $dummy_bp_grp2, value);
	}


	/**
	 * BP classification master 3 (Dummy for join) 取引先分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp3() {
		return getConstString(offset + 32, $dummy_bp_grp3);
	}

	/**
	 * BP classification master 3 (Dummy for join) 取引先分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp3(String value) {
		setConstString(offset + 32, $dummy_bp_grp3, value);
	}


	/**
	 * BP classification master 4 (Dummy for join) 取引先分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp4() {
		return getConstString(offset + 33, $dummy_bp_grp4);
	}

	/**
	 * BP classification master 4 (Dummy for join) 取引先分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp4(String value) {
		setConstString(offset + 33, $dummy_bp_grp4, value);
	}


	/**
	 * BP classification master 5 (Dummy for join) 取引先分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp5() {
		return getConstString(offset + 34, $dummy_bp_grp5);
	}

	/**
	 * BP classification master 5 (Dummy for join) 取引先分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp5(String value) {
		setConstString(offset + 34, $dummy_bp_grp5, value);
	}


	/**
	 * BP classification master 6 (Dummy for join) 取引先分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp6() {
		return getConstString(offset + 35, $dummy_bp_grp6);
	}

	/**
	 * BP classification master 6 (Dummy for join) 取引先分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp6(String value) {
		setConstString(offset + 35, $dummy_bp_grp6, value);
	}


	/**
	 * BP classification master 7 (Dummy for join) 取引先分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp7() {
		return getConstString(offset + 36, $dummy_bp_grp7);
	}

	/**
	 * BP classification master 7 (Dummy for join) 取引先分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp7(String value) {
		setConstString(offset + 36, $dummy_bp_grp7, value);
	}


	/**
	 * BP classification master 8 (Dummy for join) 取引先分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp8() {
		return getConstString(offset + 37, $dummy_bp_grp8);
	}

	/**
	 * BP classification master 8 (Dummy for join) 取引先分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp8(String value) {
		setConstString(offset + 37, $dummy_bp_grp8, value);
	}


	/**
	 * BP classification master 9 (Dummy for join) 取引先分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp9() {
		return getConstString(offset + 38, $dummy_bp_grp9);
	}

	/**
	 * BP classification master 9 (Dummy for join) 取引先分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp9(String value) {
		setConstString(offset + 38, $dummy_bp_grp9, value);
	}


	/**
	 * BP classification master 10 (Dummy for join) 取引先分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp10() {
		return getConstString(offset + 39, $dummy_bp_grp10);
	}

	/**
	 * BP classification master 10 (Dummy for join) 取引先分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp10(String value) {
		setConstString(offset + 39, $dummy_bp_grp10, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 40, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 40, $ym, value);
	}


	/**
	 * Input expense type 入力費用区分.<p>
	 *
	 */
	public String inpt_alc_typ() {
		return getConstString(offset + 41, $inpt_alc_typ);
	}

	/**
	 * Input expense type 入力費用区分.<p>
	 *
	 */
	public void inpt_alc_typ(String value) {
		setConstString(offset + 41, $inpt_alc_typ, value);
	}


	/**
	 * Input expense type name 入力費用区分名.<p>
	 *
	 */
	public String inpt_alc_typ_nm() {
		return getConstString(offset + 42, $inpt_alc_typ_nm);
	}

	/**
	 * Input expense type name 入力費用区分名.<p>
	 *
	 */
	public void inpt_alc_typ_nm(String value) {
		setConstString(offset + 42, $inpt_alc_typ_nm, value);
	}


	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public String alc_ac_cd() {
		return getConstString(offset + 43, $alc_ac_cd);
	}

	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		setConstString(offset + 43, $alc_ac_cd, value);
	}


	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public String alc_ac_nm() {
		return getConstString(offset + 44, $alc_ac_nm);
	}

	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public void alc_ac_nm(String value) {
		setConstString(offset + 44, $alc_ac_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 45, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 45, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 46, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 46, $wg_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 47, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 47, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 48, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 48, $dpt_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 49, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 49, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 50, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 50, $loc_nm, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 51, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 51, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 52, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 52, $oper_nm, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 53, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 53, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 54, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 54, $bp_nm, value);
	}


	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public String ctg_cd() {
		return getConstString(offset + 55, $ctg_cd);
	}

	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public void ctg_cd(String value) {
		setConstString(offset + 55, $ctg_cd, value);
	}


	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public String ctg_nm() {
		return getConstString(offset + 56, $ctg_nm);
	}

	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public void ctg_nm(String value) {
		setConstString(offset + 56, $ctg_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 57, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 57, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 58, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 58, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 59, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 59, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 60, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 60, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 61, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 61, $itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 62, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 62, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 63, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 63, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 64, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 64, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 65, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 65, $itm_typ_d_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 66, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 66, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 67, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 67, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 68, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 68, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 69, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 69, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 70, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 70, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 71, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 71, $sno4, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 72, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 72, $itm_mfg_inst_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 73, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 73, $po_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 74, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 74, $slo_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 75, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 75, $iv_no, value);
	}


	/**
	 * Cost element group cd. 費目グループＣＤ.<p>
	 *
	 */
	public String expns_grp_cd() {
		return getConstString(offset + 76, $expns_grp_cd);
	}

	/**
	 * Cost element group cd. 費目グループＣＤ.<p>
	 *
	 */
	public void expns_grp_cd(String value) {
		setConstString(offset + 76, $expns_grp_cd, value);
	}


	/**
	 * Cost element group name 費目グループ名.<p>
	 *
	 */
	public String expns_grp_nm() {
		return getConstString(offset + 77, $expns_grp_nm);
	}

	/**
	 * Cost element group name 費目グループ名.<p>
	 *
	 */
	public void expns_grp_nm(String value) {
		setConstString(offset + 77, $expns_grp_nm, value);
	}


	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 78, $expns_cd);
	}

	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 78, $expns_cd, value);
	}


	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public String expns_nm() {
		return getConstString(offset + 79, $expns_nm);
	}

	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public void expns_nm(String value) {
		setConstString(offset + 79, $expns_nm, value);
	}


	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public String alc_ptn_cd() {
		return getConstString(offset + 80, $alc_ptn_cd);
	}

	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public void alc_ptn_cd(String value) {
		setConstString(offset + 80, $alc_ptn_cd, value);
	}


	/**
	 * Allocation pattern name 配賦パタン名.<p>
	 *
	 */
	public String alc_ptn_nm() {
		return getConstString(offset + 81, $alc_ptn_nm);
	}

	/**
	 * Allocation pattern name 配賦パタン名.<p>
	 *
	 */
	public void alc_ptn_nm(String value) {
		setConstString(offset + 81, $alc_ptn_nm, value);
	}


	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public MCNumber alc_amt() {
		return getConstNumber(offset + 82, $alc_amt);
	}

	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public void alc_amt(MCNumber value) {
		setConstNumber(offset + 82, $alc_amt, value);
	}

	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public void alc_amt(int value) {
		setConstNumber(offset + 82, $alc_amt, value);
	}

	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public void alc_amt(long value) {
		setConstNumber(offset + 82, $alc_amt, value);
	}

	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public void alc_amt(float value) {
		setConstNumber(offset + 82, $alc_amt, value);
	}

	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public void alc_amt(double value) {
		setConstNumber(offset + 82, $alc_amt, value);
	}


	/**
	 * Fraction adjustment amount 端数調整金額.<p>
	 *
	 */
	public MCNumber adj_amt() {
		return getConstNumber(offset + 83, $adj_amt);
	}

	/**
	 * Fraction adjustment amount 端数調整金額.<p>
	 *
	 */
	public void adj_amt(MCNumber value) {
		setConstNumber(offset + 83, $adj_amt, value);
	}

	/**
	 * Fraction adjustment amount 端数調整金額.<p>
	 *
	 */
	public void adj_amt(int value) {
		setConstNumber(offset + 83, $adj_amt, value);
	}

	/**
	 * Fraction adjustment amount 端数調整金額.<p>
	 *
	 */
	public void adj_amt(long value) {
		setConstNumber(offset + 83, $adj_amt, value);
	}

	/**
	 * Fraction adjustment amount 端数調整金額.<p>
	 *
	 */
	public void adj_amt(float value) {
		setConstNumber(offset + 83, $adj_amt, value);
	}

	/**
	 * Fraction adjustment amount 端数調整金額.<p>
	 *
	 */
	public void adj_amt(double value) {
		setConstNumber(offset + 83, $adj_amt, value);
	}


	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public MCNumber alc_tgt_val() {
		return getConstNumber(offset + 84, $alc_tgt_val);
	}

	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public void alc_tgt_val(MCNumber value) {
		setConstNumber(offset + 84, $alc_tgt_val, value);
	}

	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public void alc_tgt_val(int value) {
		setConstNumber(offset + 84, $alc_tgt_val, value);
	}

	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public void alc_tgt_val(long value) {
		setConstNumber(offset + 84, $alc_tgt_val, value);
	}

	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public void alc_tgt_val(float value) {
		setConstNumber(offset + 84, $alc_tgt_val, value);
	}

	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public void alc_tgt_val(double value) {
		setConstNumber(offset + 84, $alc_tgt_val, value);
	}


	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public MCNumber alc_rate() {
		return getConstNumber(offset + 85, $alc_rate);
	}

	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public void alc_rate(MCNumber value) {
		setConstNumber(offset + 85, $alc_rate, value);
	}

	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public void alc_rate(int value) {
		setConstNumber(offset + 85, $alc_rate, value);
	}

	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public void alc_rate(long value) {
		setConstNumber(offset + 85, $alc_rate, value);
	}

	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public void alc_rate(float value) {
		setConstNumber(offset + 85, $alc_rate, value);
	}

	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public void alc_rate(double value) {
		setConstNumber(offset + 85, $alc_rate, value);
	}


	/**
	 * Standard allocation rate 標準配賦率.<p>
	 *
	 */
	public MCNumber std_alc_rate() {
		return getConstNumber(offset + 86, $std_alc_rate);
	}

	/**
	 * Standard allocation rate 標準配賦率.<p>
	 *
	 */
	public void std_alc_rate(MCNumber value) {
		setConstNumber(offset + 86, $std_alc_rate, value);
	}

	/**
	 * Standard allocation rate 標準配賦率.<p>
	 *
	 */
	public void std_alc_rate(int value) {
		setConstNumber(offset + 86, $std_alc_rate, value);
	}

	/**
	 * Standard allocation rate 標準配賦率.<p>
	 *
	 */
	public void std_alc_rate(long value) {
		setConstNumber(offset + 86, $std_alc_rate, value);
	}

	/**
	 * Standard allocation rate 標準配賦率.<p>
	 *
	 */
	public void std_alc_rate(float value) {
		setConstNumber(offset + 86, $std_alc_rate, value);
	}

	/**
	 * Standard allocation rate 標準配賦率.<p>
	 *
	 */
	public void std_alc_rate(double value) {
		setConstNumber(offset + 86, $std_alc_rate, value);
	}


	/**
	 * Allocation target (Without coefficient) 配賦対象（係数無）.<p>
	 *
	 */
	public MCNumber alc_org_tgt_val() {
		return getConstNumber(offset + 87, $alc_org_tgt_val);
	}

	/**
	 * Allocation target (Without coefficient) 配賦対象（係数無）.<p>
	 *
	 */
	public void alc_org_tgt_val(MCNumber value) {
		setConstNumber(offset + 87, $alc_org_tgt_val, value);
	}

	/**
	 * Allocation target (Without coefficient) 配賦対象（係数無）.<p>
	 *
	 */
	public void alc_org_tgt_val(int value) {
		setConstNumber(offset + 87, $alc_org_tgt_val, value);
	}

	/**
	 * Allocation target (Without coefficient) 配賦対象（係数無）.<p>
	 *
	 */
	public void alc_org_tgt_val(long value) {
		setConstNumber(offset + 87, $alc_org_tgt_val, value);
	}

	/**
	 * Allocation target (Without coefficient) 配賦対象（係数無）.<p>
	 *
	 */
	public void alc_org_tgt_val(float value) {
		setConstNumber(offset + 87, $alc_org_tgt_val, value);
	}

	/**
	 * Allocation target (Without coefficient) 配賦対象（係数無）.<p>
	 *
	 */
	public void alc_org_tgt_val(double value) {
		setConstNumber(offset + 87, $alc_org_tgt_val, value);
	}


	public String getString(String name) {
		if ($dummy_mng_dpt.equalsIgnoreCase(name)) {
			return dummy_mng_dpt();
		}
		if ($dummy_alc_dpt.equalsIgnoreCase(name)) {
			return dummy_alc_dpt();
		}
		if ($dummy_itm.equalsIgnoreCase(name)) {
			return dummy_itm();
		}
		if ($dummy_itm_typ_d.equalsIgnoreCase(name)) {
			return dummy_itm_typ_d();
		}
		if ($dummy_itm_jnl.equalsIgnoreCase(name)) {
			return dummy_itm_jnl();
		}
		if ($dummy_loc.equalsIgnoreCase(name)) {
			return dummy_loc();
		}
		if ($dummy_site.equalsIgnoreCase(name)) {
			return dummy_site();
		}
		if ($dummy_str_ln.equalsIgnoreCase(name)) {
			return dummy_str_ln();
		}
		if ($dummy_bp.equalsIgnoreCase(name)) {
			return dummy_bp();
		}
		if ($dummy_bp_cntry.equalsIgnoreCase(name)) {
			return dummy_bp_cntry();
		}
		if ($dummy_bp_area.equalsIgnoreCase(name)) {
			return dummy_bp_area();
		}
		if ($dummy_ac_rsn.equalsIgnoreCase(name)) {
			return dummy_ac_rsn();
		}
		if ($dummy_oper.equalsIgnoreCase(name)) {
			return dummy_oper();
		}
		if ($dummy_wk_cost.equalsIgnoreCase(name)) {
			return dummy_wk_cost();
		}
		if ($dummy_wk_rsn.equalsIgnoreCase(name)) {
			return dummy_wk_rsn();
		}
		if ($dummy_gp_alc.equalsIgnoreCase(name)) {
			return dummy_gp_alc();
		}
		if ($dummy_alc_ac_grp1.equalsIgnoreCase(name)) {
			return dummy_alc_ac_grp1();
		}
		if ($dummy_alc_ac_grp2.equalsIgnoreCase(name)) {
			return dummy_alc_ac_grp2();
		}
		if ($dummy_alc_ac_grp3.equalsIgnoreCase(name)) {
			return dummy_alc_ac_grp3();
		}
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			return dummy_itm_grp1();
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			return dummy_itm_grp2();
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			return dummy_itm_grp3();
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			return dummy_itm_grp4();
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			return dummy_itm_grp5();
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			return dummy_itm_grp6();
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			return dummy_itm_grp7();
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			return dummy_itm_grp8();
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			return dummy_itm_grp9();
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			return dummy_itm_grp10();
		}
		if ($dummy_bp_grp1.equalsIgnoreCase(name)) {
			return dummy_bp_grp1();
		}
		if ($dummy_bp_grp2.equalsIgnoreCase(name)) {
			return dummy_bp_grp2();
		}
		if ($dummy_bp_grp3.equalsIgnoreCase(name)) {
			return dummy_bp_grp3();
		}
		if ($dummy_bp_grp4.equalsIgnoreCase(name)) {
			return dummy_bp_grp4();
		}
		if ($dummy_bp_grp5.equalsIgnoreCase(name)) {
			return dummy_bp_grp5();
		}
		if ($dummy_bp_grp6.equalsIgnoreCase(name)) {
			return dummy_bp_grp6();
		}
		if ($dummy_bp_grp7.equalsIgnoreCase(name)) {
			return dummy_bp_grp7();
		}
		if ($dummy_bp_grp8.equalsIgnoreCase(name)) {
			return dummy_bp_grp8();
		}
		if ($dummy_bp_grp9.equalsIgnoreCase(name)) {
			return dummy_bp_grp9();
		}
		if ($dummy_bp_grp10.equalsIgnoreCase(name)) {
			return dummy_bp_grp10();
		}
		if ($inpt_alc_typ.equalsIgnoreCase(name)) {
			return inpt_alc_typ();
		}
		if ($inpt_alc_typ_nm.equalsIgnoreCase(name)) {
			return inpt_alc_typ_nm();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
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
		if ($expns_grp_cd.equalsIgnoreCase(name)) {
			return expns_grp_cd();
		}
		if ($expns_grp_nm.equalsIgnoreCase(name)) {
			return expns_grp_nm();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			return expns_nm();
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			return alc_ptn_cd();
		}
		if ($alc_ptn_nm.equalsIgnoreCase(name)) {
			return alc_ptn_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($alc_amt.equalsIgnoreCase(name)) {
			return alc_amt();
		}
		if ($adj_amt.equalsIgnoreCase(name)) {
			return adj_amt();
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			return alc_tgt_val();
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			return alc_rate();
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			return std_alc_rate();
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			return alc_org_tgt_val();
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
		if ($dummy_mng_dpt.equalsIgnoreCase(name)) {
			return dummy_mng_dpt();
		}
		if ($dummy_alc_dpt.equalsIgnoreCase(name)) {
			return dummy_alc_dpt();
		}
		if ($dummy_itm.equalsIgnoreCase(name)) {
			return dummy_itm();
		}
		if ($dummy_itm_typ_d.equalsIgnoreCase(name)) {
			return dummy_itm_typ_d();
		}
		if ($dummy_itm_jnl.equalsIgnoreCase(name)) {
			return dummy_itm_jnl();
		}
		if ($dummy_loc.equalsIgnoreCase(name)) {
			return dummy_loc();
		}
		if ($dummy_site.equalsIgnoreCase(name)) {
			return dummy_site();
		}
		if ($dummy_str_ln.equalsIgnoreCase(name)) {
			return dummy_str_ln();
		}
		if ($dummy_bp.equalsIgnoreCase(name)) {
			return dummy_bp();
		}
		if ($dummy_bp_cntry.equalsIgnoreCase(name)) {
			return dummy_bp_cntry();
		}
		if ($dummy_bp_area.equalsIgnoreCase(name)) {
			return dummy_bp_area();
		}
		if ($dummy_ac_rsn.equalsIgnoreCase(name)) {
			return dummy_ac_rsn();
		}
		if ($dummy_oper.equalsIgnoreCase(name)) {
			return dummy_oper();
		}
		if ($dummy_wk_cost.equalsIgnoreCase(name)) {
			return dummy_wk_cost();
		}
		if ($dummy_wk_rsn.equalsIgnoreCase(name)) {
			return dummy_wk_rsn();
		}
		if ($dummy_gp_alc.equalsIgnoreCase(name)) {
			return dummy_gp_alc();
		}
		if ($dummy_alc_ac_grp1.equalsIgnoreCase(name)) {
			return dummy_alc_ac_grp1();
		}
		if ($dummy_alc_ac_grp2.equalsIgnoreCase(name)) {
			return dummy_alc_ac_grp2();
		}
		if ($dummy_alc_ac_grp3.equalsIgnoreCase(name)) {
			return dummy_alc_ac_grp3();
		}
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			return dummy_itm_grp1();
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			return dummy_itm_grp2();
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			return dummy_itm_grp3();
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			return dummy_itm_grp4();
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			return dummy_itm_grp5();
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			return dummy_itm_grp6();
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			return dummy_itm_grp7();
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			return dummy_itm_grp8();
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			return dummy_itm_grp9();
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			return dummy_itm_grp10();
		}
		if ($dummy_bp_grp1.equalsIgnoreCase(name)) {
			return dummy_bp_grp1();
		}
		if ($dummy_bp_grp2.equalsIgnoreCase(name)) {
			return dummy_bp_grp2();
		}
		if ($dummy_bp_grp3.equalsIgnoreCase(name)) {
			return dummy_bp_grp3();
		}
		if ($dummy_bp_grp4.equalsIgnoreCase(name)) {
			return dummy_bp_grp4();
		}
		if ($dummy_bp_grp5.equalsIgnoreCase(name)) {
			return dummy_bp_grp5();
		}
		if ($dummy_bp_grp6.equalsIgnoreCase(name)) {
			return dummy_bp_grp6();
		}
		if ($dummy_bp_grp7.equalsIgnoreCase(name)) {
			return dummy_bp_grp7();
		}
		if ($dummy_bp_grp8.equalsIgnoreCase(name)) {
			return dummy_bp_grp8();
		}
		if ($dummy_bp_grp9.equalsIgnoreCase(name)) {
			return dummy_bp_grp9();
		}
		if ($dummy_bp_grp10.equalsIgnoreCase(name)) {
			return dummy_bp_grp10();
		}
		if ($inpt_alc_typ.equalsIgnoreCase(name)) {
			return inpt_alc_typ();
		}
		if ($inpt_alc_typ_nm.equalsIgnoreCase(name)) {
			return inpt_alc_typ_nm();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
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
		if ($expns_grp_cd.equalsIgnoreCase(name)) {
			return expns_grp_cd();
		}
		if ($expns_grp_nm.equalsIgnoreCase(name)) {
			return expns_grp_nm();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			return expns_nm();
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			return alc_ptn_cd();
		}
		if ($alc_ptn_nm.equalsIgnoreCase(name)) {
			return alc_ptn_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($alc_amt.equalsIgnoreCase(name)) {
			return alc_amt();
		}
		if ($adj_amt.equalsIgnoreCase(name)) {
			return adj_amt();
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			return alc_tgt_val();
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			return alc_rate();
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			return std_alc_rate();
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			return alc_org_tgt_val();
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
		if ($dummy_mng_dpt.equalsIgnoreCase(name)) {
			dummy_mng_dpt(value);
			return;
		}
		if ($dummy_alc_dpt.equalsIgnoreCase(name)) {
			dummy_alc_dpt(value);
			return;
		}
		if ($dummy_itm.equalsIgnoreCase(name)) {
			dummy_itm(value);
			return;
		}
		if ($dummy_itm_typ_d.equalsIgnoreCase(name)) {
			dummy_itm_typ_d(value);
			return;
		}
		if ($dummy_itm_jnl.equalsIgnoreCase(name)) {
			dummy_itm_jnl(value);
			return;
		}
		if ($dummy_loc.equalsIgnoreCase(name)) {
			dummy_loc(value);
			return;
		}
		if ($dummy_site.equalsIgnoreCase(name)) {
			dummy_site(value);
			return;
		}
		if ($dummy_str_ln.equalsIgnoreCase(name)) {
			dummy_str_ln(value);
			return;
		}
		if ($dummy_bp.equalsIgnoreCase(name)) {
			dummy_bp(value);
			return;
		}
		if ($dummy_bp_cntry.equalsIgnoreCase(name)) {
			dummy_bp_cntry(value);
			return;
		}
		if ($dummy_bp_area.equalsIgnoreCase(name)) {
			dummy_bp_area(value);
			return;
		}
		if ($dummy_ac_rsn.equalsIgnoreCase(name)) {
			dummy_ac_rsn(value);
			return;
		}
		if ($dummy_oper.equalsIgnoreCase(name)) {
			dummy_oper(value);
			return;
		}
		if ($dummy_wk_cost.equalsIgnoreCase(name)) {
			dummy_wk_cost(value);
			return;
		}
		if ($dummy_wk_rsn.equalsIgnoreCase(name)) {
			dummy_wk_rsn(value);
			return;
		}
		if ($dummy_gp_alc.equalsIgnoreCase(name)) {
			dummy_gp_alc(value);
			return;
		}
		if ($dummy_alc_ac_grp1.equalsIgnoreCase(name)) {
			dummy_alc_ac_grp1(value);
			return;
		}
		if ($dummy_alc_ac_grp2.equalsIgnoreCase(name)) {
			dummy_alc_ac_grp2(value);
			return;
		}
		if ($dummy_alc_ac_grp3.equalsIgnoreCase(name)) {
			dummy_alc_ac_grp3(value);
			return;
		}
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			dummy_itm_grp1(value);
			return;
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			dummy_itm_grp2(value);
			return;
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			dummy_itm_grp3(value);
			return;
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			dummy_itm_grp4(value);
			return;
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			dummy_itm_grp5(value);
			return;
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			dummy_itm_grp6(value);
			return;
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			dummy_itm_grp7(value);
			return;
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			dummy_itm_grp8(value);
			return;
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			dummy_itm_grp9(value);
			return;
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			dummy_itm_grp10(value);
			return;
		}
		if ($dummy_bp_grp1.equalsIgnoreCase(name)) {
			dummy_bp_grp1(value);
			return;
		}
		if ($dummy_bp_grp2.equalsIgnoreCase(name)) {
			dummy_bp_grp2(value);
			return;
		}
		if ($dummy_bp_grp3.equalsIgnoreCase(name)) {
			dummy_bp_grp3(value);
			return;
		}
		if ($dummy_bp_grp4.equalsIgnoreCase(name)) {
			dummy_bp_grp4(value);
			return;
		}
		if ($dummy_bp_grp5.equalsIgnoreCase(name)) {
			dummy_bp_grp5(value);
			return;
		}
		if ($dummy_bp_grp6.equalsIgnoreCase(name)) {
			dummy_bp_grp6(value);
			return;
		}
		if ($dummy_bp_grp7.equalsIgnoreCase(name)) {
			dummy_bp_grp7(value);
			return;
		}
		if ($dummy_bp_grp8.equalsIgnoreCase(name)) {
			dummy_bp_grp8(value);
			return;
		}
		if ($dummy_bp_grp9.equalsIgnoreCase(name)) {
			dummy_bp_grp9(value);
			return;
		}
		if ($dummy_bp_grp10.equalsIgnoreCase(name)) {
			dummy_bp_grp10(value);
			return;
		}
		if ($inpt_alc_typ.equalsIgnoreCase(name)) {
			inpt_alc_typ(value);
			return;
		}
		if ($inpt_alc_typ_nm.equalsIgnoreCase(name)) {
			inpt_alc_typ_nm(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
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
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
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
		if ($expns_grp_cd.equalsIgnoreCase(name)) {
			expns_grp_cd(value);
			return;
		}
		if ($expns_grp_nm.equalsIgnoreCase(name)) {
			expns_grp_nm(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			expns_nm(value);
			return;
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			alc_ptn_cd(value);
			return;
		}
		if ($alc_ptn_nm.equalsIgnoreCase(name)) {
			alc_ptn_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($adj_amt.equalsIgnoreCase(name)) {
			adj_amt(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			std_alc_rate(value);
			return;
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			alc_org_tgt_val(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($adj_amt.equalsIgnoreCase(name)) {
			adj_amt(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			std_alc_rate(value);
			return;
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			alc_org_tgt_val(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($adj_amt.equalsIgnoreCase(name)) {
			adj_amt(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			std_alc_rate(value);
			return;
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			alc_org_tgt_val(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($adj_amt.equalsIgnoreCase(name)) {
			adj_amt(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			std_alc_rate(value);
			return;
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			alc_org_tgt_val(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($adj_amt.equalsIgnoreCase(name)) {
			adj_amt(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			std_alc_rate(value);
			return;
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			alc_org_tgt_val(value);
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
		if ($dummy_mng_dpt.equalsIgnoreCase(name)) {
			dummy_mng_dpt(value);
			return;
		}
		if ($dummy_alc_dpt.equalsIgnoreCase(name)) {
			dummy_alc_dpt(value);
			return;
		}
		if ($dummy_itm.equalsIgnoreCase(name)) {
			dummy_itm(value);
			return;
		}
		if ($dummy_itm_typ_d.equalsIgnoreCase(name)) {
			dummy_itm_typ_d(value);
			return;
		}
		if ($dummy_itm_jnl.equalsIgnoreCase(name)) {
			dummy_itm_jnl(value);
			return;
		}
		if ($dummy_loc.equalsIgnoreCase(name)) {
			dummy_loc(value);
			return;
		}
		if ($dummy_site.equalsIgnoreCase(name)) {
			dummy_site(value);
			return;
		}
		if ($dummy_str_ln.equalsIgnoreCase(name)) {
			dummy_str_ln(value);
			return;
		}
		if ($dummy_bp.equalsIgnoreCase(name)) {
			dummy_bp(value);
			return;
		}
		if ($dummy_bp_cntry.equalsIgnoreCase(name)) {
			dummy_bp_cntry(value);
			return;
		}
		if ($dummy_bp_area.equalsIgnoreCase(name)) {
			dummy_bp_area(value);
			return;
		}
		if ($dummy_ac_rsn.equalsIgnoreCase(name)) {
			dummy_ac_rsn(value);
			return;
		}
		if ($dummy_oper.equalsIgnoreCase(name)) {
			dummy_oper(value);
			return;
		}
		if ($dummy_wk_cost.equalsIgnoreCase(name)) {
			dummy_wk_cost(value);
			return;
		}
		if ($dummy_wk_rsn.equalsIgnoreCase(name)) {
			dummy_wk_rsn(value);
			return;
		}
		if ($dummy_gp_alc.equalsIgnoreCase(name)) {
			dummy_gp_alc(value);
			return;
		}
		if ($dummy_alc_ac_grp1.equalsIgnoreCase(name)) {
			dummy_alc_ac_grp1(value);
			return;
		}
		if ($dummy_alc_ac_grp2.equalsIgnoreCase(name)) {
			dummy_alc_ac_grp2(value);
			return;
		}
		if ($dummy_alc_ac_grp3.equalsIgnoreCase(name)) {
			dummy_alc_ac_grp3(value);
			return;
		}
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			dummy_itm_grp1(value);
			return;
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			dummy_itm_grp2(value);
			return;
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			dummy_itm_grp3(value);
			return;
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			dummy_itm_grp4(value);
			return;
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			dummy_itm_grp5(value);
			return;
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			dummy_itm_grp6(value);
			return;
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			dummy_itm_grp7(value);
			return;
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			dummy_itm_grp8(value);
			return;
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			dummy_itm_grp9(value);
			return;
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			dummy_itm_grp10(value);
			return;
		}
		if ($dummy_bp_grp1.equalsIgnoreCase(name)) {
			dummy_bp_grp1(value);
			return;
		}
		if ($dummy_bp_grp2.equalsIgnoreCase(name)) {
			dummy_bp_grp2(value);
			return;
		}
		if ($dummy_bp_grp3.equalsIgnoreCase(name)) {
			dummy_bp_grp3(value);
			return;
		}
		if ($dummy_bp_grp4.equalsIgnoreCase(name)) {
			dummy_bp_grp4(value);
			return;
		}
		if ($dummy_bp_grp5.equalsIgnoreCase(name)) {
			dummy_bp_grp5(value);
			return;
		}
		if ($dummy_bp_grp6.equalsIgnoreCase(name)) {
			dummy_bp_grp6(value);
			return;
		}
		if ($dummy_bp_grp7.equalsIgnoreCase(name)) {
			dummy_bp_grp7(value);
			return;
		}
		if ($dummy_bp_grp8.equalsIgnoreCase(name)) {
			dummy_bp_grp8(value);
			return;
		}
		if ($dummy_bp_grp9.equalsIgnoreCase(name)) {
			dummy_bp_grp9(value);
			return;
		}
		if ($dummy_bp_grp10.equalsIgnoreCase(name)) {
			dummy_bp_grp10(value);
			return;
		}
		if ($inpt_alc_typ.equalsIgnoreCase(name)) {
			inpt_alc_typ(value);
			return;
		}
		if ($inpt_alc_typ_nm.equalsIgnoreCase(name)) {
			inpt_alc_typ_nm(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
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
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
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
		if ($expns_grp_cd.equalsIgnoreCase(name)) {
			expns_grp_cd(value);
			return;
		}
		if ($expns_grp_nm.equalsIgnoreCase(name)) {
			expns_grp_nm(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			expns_nm(value);
			return;
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			alc_ptn_cd(value);
			return;
		}
		if ($alc_ptn_nm.equalsIgnoreCase(name)) {
			alc_ptn_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($adj_amt.equalsIgnoreCase(name)) {
			adj_amt(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			std_alc_rate(value);
			return;
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			alc_org_tgt_val(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($adj_amt.equalsIgnoreCase(name)) {
			adj_amt(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			std_alc_rate(value);
			return;
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			alc_org_tgt_val(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($adj_amt.equalsIgnoreCase(name)) {
			adj_amt(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			std_alc_rate(value);
			return;
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			alc_org_tgt_val(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($adj_amt.equalsIgnoreCase(name)) {
			adj_amt(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			std_alc_rate(value);
			return;
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			alc_org_tgt_val(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($adj_amt.equalsIgnoreCase(name)) {
			adj_amt(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			std_alc_rate(value);
			return;
		}
		if ($alc_org_tgt_val.equalsIgnoreCase(name)) {
			alc_org_tgt_val(value);
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

