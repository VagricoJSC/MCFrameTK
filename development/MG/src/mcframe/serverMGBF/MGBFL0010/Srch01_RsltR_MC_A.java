package mcframe.serverMGBF.MGBFL0010;

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
	 * Country master (Dummy for join) 国マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_cntry = "dummy_cntry";
	/**
	 * Region master (Dummy for join) 地域マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_area = "dummy_area";
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
	 * Firm calculation No. 確定原価計算ＮＯ.<p>
	 *
	 */
	public static final String $fix_calc_no = "fix_calc_no";
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
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Line name ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
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
	 * Order qty. 指図数量.<p>
	 *
	 */
	public static final String $qty = "qty";
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
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public static final String $schd_st_dt = "schd_st_dt";
	/**
	 * Scheduled end date 終了予定日.<p>
	 *
	 */
	public static final String $schd_end_dt = "schd_end_dt";
	/**
	 * Actual start date 着手実績日.<p>
	 *
	 */
	public static final String $act_st_dt = "act_st_dt";
	/**
	 * Actual end date 終了実績日.<p>
	 *
	 */
	public static final String $act_end_dt = "act_end_dt";
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public static final String $rmrks = "rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $act_upri = "act_upri";
	/**
	 * Beginning WIP 月初仕掛.<p>
	 *
	 */
	public static final String $st_wip_cost = "st_wip_cost";
	/**
	 * Ending WIP 月末仕掛.<p>
	 *
	 */
	public static final String $end_wip_cost = "end_wip_cost";
	/**
	 * Incurred 発生.<p>
	 *
	 */
	public static final String $inst_cost = "inst_cost";
	/**
	 * Total 合計.<p>
	 *
	 */
	public static final String $ttl = "ttl";
	/**
	 * Completed 完成.<p>
	 *
	 */
	public static final String $comp_cost = "comp_cost";


	public static final MCMeta dummy_term_META = createCommonMeta($dummy_term, mcframe.commonMA.meta.MA_META.YM);
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
	public static final MCMeta dummy_cntry_META = createCommonMeta($dummy_cntry, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta dummy_area_META = createCommonMeta($dummy_area, mcframe.commonMA.meta.MA_META.AREA_CD);
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
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta fix_calc_no_META = createCommonMeta($fix_calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
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
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta schd_st_dt_META = createCommonMeta($schd_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta schd_end_dt_META = createCommonMeta($schd_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta act_st_dt_META = createCommonMeta($act_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta act_end_dt_META = createCommonMeta($act_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rmrks_META = createCommonMeta($rmrks, mcframe.commonMG.meta.MG_META.ITM_MFG_INST_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMG.meta.MG_META.ITM_MFG_INST_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMG.meta.MG_META.ITM_MFG_INST_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMG.meta.MG_META.ITM_MFG_INST_SUB_CHAR3);
	public static final MCMeta act_upri_META = createCommonMeta($act_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta st_wip_cost_META = createCommonMeta($st_wip_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta end_wip_cost_META = createCommonMeta($end_wip_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta inst_cost_META = createCommonMeta($inst_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_META = createCommonMeta($ttl, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta comp_cost_META = createCommonMeta($comp_cost, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dummy_term_META,
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
			dummy_cntry_META,
			dummy_area_META,
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
			calc_grp_cd_META,
			calc_no_META,
			fix_calc_no_META,
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
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			bp_cd_META,
			bp_nm_META,
			po_no_META,
			slo_no_META,
			iv_no_META,
			asst_typ_META,
			asst_typ_nm_META,
			qty_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			schd_st_dt_META,
			schd_end_dt_META,
			act_st_dt_META,
			act_end_dt_META,
			rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			act_upri_META,
			st_wip_cost_META,
			end_wip_cost_META,
			inst_cost_META,
			ttl_META,
			comp_cost_META
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
				{$lot_no, "lot_flg"},	// lot_no
				{$sublot_no, "sublot_flg"},	// sublot_no
				{$sno1, "sno1_flg"},	// sno1
				{$sno2, "sno2_flg"},	// sno2
				{$sno3, "sno3_flg"},	// sno3
				{$sno4, "sno4_flg"},	// sno4
				{$loc_cd, "loc_flg"},	// loc_cd
				{$loc_nm, "loc_flg"},	// loc_nm
				{$str_ln_cd, "str_ln_flg"},	// str_ln_cd
				{$str_ln_nm, "str_ln_flg"},	// str_ln_nm
				{$bp_cd, "bp_flg"},	// bp_cd
				{$bp_nm, "bp_flg"},	// bp_nm
				{$po_no, "po_no_flg"},	// po_no
				{$slo_no, "slo_no_flg"},	// slo_no
				{$iv_no, "iv_no_flg"},	// iv_no
				{$asst_typ, "asst_typ_flg"},	// asst_typ
				{$qty, "qty_flg"},	// qty
				{$unit_cd, "qty_flg"},	// unit_cd
				{$unit_nm, "qty_flg"},	// unit_nm
				{$dec_place, "qty_flg"},	// dec_place
				{$schd_st_dt, "mfg_inst_flg"},	// schd_st_dt
				{$schd_end_dt, "mfg_inst_flg"},	// schd_end_dt
				{$act_st_dt, "mfg_inst_flg"},	// act_st_dt
				{$act_end_dt, "mfg_inst_flg"},	// act_end_dt
				{$rmrks, "mfg_inst_flg"},	// rmrks
				{$sub_char1, "mfg_inst_flg"},	// sub_char1
				{$sub_char2, "mfg_inst_flg"},	// sub_char2
				{$sub_char3, "mfg_inst_flg"}	// sub_char3
			}
		)),
		new MCExtMap.Entry($$COL_SQL, new MCExtList(
			new String[][]{
				{$calc_grp_cd, "T.CALC_GRP_CD"},	// calc_grp_cd
				{$calc_no, "T.CALC_NO"},	// calc_no
				{$fix_calc_no, "T.FIX_CALC_NO"},	// fix_calc_no
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
				{$loc_cd, "T.LOC_CD"},	// loc_cd
				{$loc_nm, "LOC.LOC_NM"},	// loc_nm
				{$str_ln_cd, "T.STR_LN_CD"},	// str_ln_cd
				{$str_ln_nm, "STR_LN.STR_LN_NM"},	// str_ln_nm
				{$bp_cd, "T.BP_CD"},	// bp_cd
				{$bp_nm, "BP.BP_NM"},	// bp_nm
				{$po_no, "T.PO_NO"},	// po_no
				{$slo_no, "T.SLO_NO"},	// slo_no
				{$iv_no, "T.IV_NO"},	// iv_no
				{$asst_typ, "T.ASST_TYP"},	// asst_typ
				{$qty, "ITM_MFG_INST.QTY"},	// qty
				{$unit_cd, "ITM.UNIT_CD"},	// unit_cd
				{$unit_nm, "UNIT.UNIT_NM"},	// unit_nm
				{$dec_place, "ITM.DEC_PLACE"},	// dec_place
				{$schd_st_dt, "ITM_MFG_INST.SCHD_ST_DT"},	// schd_st_dt
				{$schd_end_dt, "ITM_MFG_INST.SCHD_END_DT"},	// schd_end_dt
				{$act_st_dt, "ITM_MFG_INST.ACT_ST_DT"},	// act_st_dt
				{$act_end_dt, "ITM_MFG_INST.ACT_END_DT"},	// act_end_dt
				{$rmrks, "ITM_MFG_INST.RMRKS"},	// rmrks
				{$sub_char1, "ITM_MFG_INST.SUB_CHAR1"},	// sub_char1
				{$sub_char2, "ITM_MFG_INST.SUB_CHAR2"},	// sub_char2
				{$sub_char3, "ITM_MFG_INST.SUB_CHAR3"}	// sub_char3
			}
		)),
		new MCExtMap.Entry($$SUM_SQL, new MCExtList(
			new String[][]{
				{$st_wip_cost, "NVL(SUM(T.ST_WIP_COST),0)"},	// st_wip_cost
				{$end_wip_cost, "NVL(SUM(T.END_WIP_COST),0)"},	// end_wip_cost
				{$inst_cost, "NVL(SUM(T.INST_COST),0)"}	// inst_cost
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
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp1() {
		return getConstString(offset + 1, $dummy_itm_grp1);
	}

	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp1(String value) {
		setConstString(offset + 1, $dummy_itm_grp1, value);
	}


	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp2() {
		return getConstString(offset + 2, $dummy_itm_grp2);
	}

	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp2(String value) {
		setConstString(offset + 2, $dummy_itm_grp2, value);
	}


	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp3() {
		return getConstString(offset + 3, $dummy_itm_grp3);
	}

	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp3(String value) {
		setConstString(offset + 3, $dummy_itm_grp3, value);
	}


	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp4() {
		return getConstString(offset + 4, $dummy_itm_grp4);
	}

	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp4(String value) {
		setConstString(offset + 4, $dummy_itm_grp4, value);
	}


	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp5() {
		return getConstString(offset + 5, $dummy_itm_grp5);
	}

	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp5(String value) {
		setConstString(offset + 5, $dummy_itm_grp5, value);
	}


	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp6() {
		return getConstString(offset + 6, $dummy_itm_grp6);
	}

	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp6(String value) {
		setConstString(offset + 6, $dummy_itm_grp6, value);
	}


	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp7() {
		return getConstString(offset + 7, $dummy_itm_grp7);
	}

	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp7(String value) {
		setConstString(offset + 7, $dummy_itm_grp7, value);
	}


	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp8() {
		return getConstString(offset + 8, $dummy_itm_grp8);
	}

	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp8(String value) {
		setConstString(offset + 8, $dummy_itm_grp8, value);
	}


	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp9() {
		return getConstString(offset + 9, $dummy_itm_grp9);
	}

	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp9(String value) {
		setConstString(offset + 9, $dummy_itm_grp9, value);
	}


	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp10() {
		return getConstString(offset + 10, $dummy_itm_grp10);
	}

	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp10(String value) {
		setConstString(offset + 10, $dummy_itm_grp10, value);
	}


	/**
	 * Country master (Dummy for join) 国マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_cntry() {
		return getConstString(offset + 11, $dummy_cntry);
	}

	/**
	 * Country master (Dummy for join) 国マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_cntry(String value) {
		setConstString(offset + 11, $dummy_cntry, value);
	}


	/**
	 * Region master (Dummy for join) 地域マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_area() {
		return getConstString(offset + 12, $dummy_area);
	}

	/**
	 * Region master (Dummy for join) 地域マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_area(String value) {
		setConstString(offset + 12, $dummy_area, value);
	}


	/**
	 * BP classification master 1 (Dummy for join) 取引先分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp1() {
		return getConstString(offset + 13, $dummy_bp_grp1);
	}

	/**
	 * BP classification master 1 (Dummy for join) 取引先分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp1(String value) {
		setConstString(offset + 13, $dummy_bp_grp1, value);
	}


	/**
	 * BP classification master 2 (Dummy for join) 取引先分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp2() {
		return getConstString(offset + 14, $dummy_bp_grp2);
	}

	/**
	 * BP classification master 2 (Dummy for join) 取引先分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp2(String value) {
		setConstString(offset + 14, $dummy_bp_grp2, value);
	}


	/**
	 * BP classification master 3 (Dummy for join) 取引先分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp3() {
		return getConstString(offset + 15, $dummy_bp_grp3);
	}

	/**
	 * BP classification master 3 (Dummy for join) 取引先分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp3(String value) {
		setConstString(offset + 15, $dummy_bp_grp3, value);
	}


	/**
	 * BP classification master 4 (Dummy for join) 取引先分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp4() {
		return getConstString(offset + 16, $dummy_bp_grp4);
	}

	/**
	 * BP classification master 4 (Dummy for join) 取引先分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp4(String value) {
		setConstString(offset + 16, $dummy_bp_grp4, value);
	}


	/**
	 * BP classification master 5 (Dummy for join) 取引先分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp5() {
		return getConstString(offset + 17, $dummy_bp_grp5);
	}

	/**
	 * BP classification master 5 (Dummy for join) 取引先分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp5(String value) {
		setConstString(offset + 17, $dummy_bp_grp5, value);
	}


	/**
	 * BP classification master 6 (Dummy for join) 取引先分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp6() {
		return getConstString(offset + 18, $dummy_bp_grp6);
	}

	/**
	 * BP classification master 6 (Dummy for join) 取引先分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp6(String value) {
		setConstString(offset + 18, $dummy_bp_grp6, value);
	}


	/**
	 * BP classification master 7 (Dummy for join) 取引先分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp7() {
		return getConstString(offset + 19, $dummy_bp_grp7);
	}

	/**
	 * BP classification master 7 (Dummy for join) 取引先分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp7(String value) {
		setConstString(offset + 19, $dummy_bp_grp7, value);
	}


	/**
	 * BP classification master 8 (Dummy for join) 取引先分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp8() {
		return getConstString(offset + 20, $dummy_bp_grp8);
	}

	/**
	 * BP classification master 8 (Dummy for join) 取引先分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp8(String value) {
		setConstString(offset + 20, $dummy_bp_grp8, value);
	}


	/**
	 * BP classification master 9 (Dummy for join) 取引先分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp9() {
		return getConstString(offset + 21, $dummy_bp_grp9);
	}

	/**
	 * BP classification master 9 (Dummy for join) 取引先分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp9(String value) {
		setConstString(offset + 21, $dummy_bp_grp9, value);
	}


	/**
	 * BP classification master 10 (Dummy for join) 取引先分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp10() {
		return getConstString(offset + 22, $dummy_bp_grp10);
	}

	/**
	 * BP classification master 10 (Dummy for join) 取引先分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp10(String value) {
		setConstString(offset + 22, $dummy_bp_grp10, value);
	}


	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 23, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 23, $calc_grp_cd, value);
	}


	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 24, $calc_no);
	}

	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 24, $calc_no, value);
	}


	/**
	 * Firm calculation No. 確定原価計算ＮＯ.<p>
	 *
	 */
	public String fix_calc_no() {
		return getConstString(offset + 25, $fix_calc_no);
	}

	/**
	 * Firm calculation No. 確定原価計算ＮＯ.<p>
	 *
	 */
	public void fix_calc_no(String value) {
		setConstString(offset + 25, $fix_calc_no, value);
	}


	/**
	 * Month 対象年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 26, $ym);
	}

	/**
	 * Month 対象年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 26, $ym, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 27, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 27, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 28, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 28, $wg_nm, value);
	}


	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 29, $mng_dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 29, $mng_dpt_cd, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 30, $mng_dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 30, $mng_dpt_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 31, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 31, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 32, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 32, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 33, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 33, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 34, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 34, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 35, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 35, $itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 36, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 36, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 37, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 37, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 38, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 38, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 39, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 39, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 40, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 40, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 41, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 41, $itm_jnl_nm, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 42, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 42, $itm_mfg_inst_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 43, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 43, $mfg_act_no, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 44, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 44, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 45, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 45, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 46, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 46, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 47, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 47, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 48, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 48, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 49, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 49, $sno4, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 50, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 50, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 51, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 51, $loc_nm, value);
	}


	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 52, $str_ln_cd);
	}

	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 52, $str_ln_cd, value);
	}


	/**
	 * Line name ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 53, $str_ln_nm);
	}

	/**
	 * Line name ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 53, $str_ln_nm, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 54, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 54, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 55, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 55, $bp_nm, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 56, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 56, $po_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 57, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 57, $slo_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 58, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 58, $iv_no, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 59, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 59, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 60, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 60, $asst_typ_nm, value);
	}


	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 61, $qty);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 61, $qty, value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 61, $qty, value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 61, $qty, value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 61, $qty, value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 61, $qty, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 62, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 62, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 63, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 63, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 64, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 64, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 64, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 64, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 64, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 64, $dec_place, value);
	}


	/**
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public MCDate schd_st_dt() {
		return getConstDate(offset + 65, $schd_st_dt);
	}

	/**
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public void schd_st_dt(MCDate value) {
		setConstDate(offset + 65, $schd_st_dt, value);
	}


	/**
	 * Scheduled end date 終了予定日.<p>
	 *
	 */
	public MCDate schd_end_dt() {
		return getConstDate(offset + 66, $schd_end_dt);
	}

	/**
	 * Scheduled end date 終了予定日.<p>
	 *
	 */
	public void schd_end_dt(MCDate value) {
		setConstDate(offset + 66, $schd_end_dt, value);
	}


	/**
	 * Actual start date 着手実績日.<p>
	 *
	 */
	public MCDate act_st_dt() {
		return getConstDate(offset + 67, $act_st_dt);
	}

	/**
	 * Actual start date 着手実績日.<p>
	 *
	 */
	public void act_st_dt(MCDate value) {
		setConstDate(offset + 67, $act_st_dt, value);
	}


	/**
	 * Actual end date 終了実績日.<p>
	 *
	 */
	public MCDate act_end_dt() {
		return getConstDate(offset + 68, $act_end_dt);
	}

	/**
	 * Actual end date 終了実績日.<p>
	 *
	 */
	public void act_end_dt(MCDate value) {
		setConstDate(offset + 68, $act_end_dt, value);
	}


	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String rmrks() {
		return getConstString(offset + 69, $rmrks);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void rmrks(String value) {
		setConstString(offset + 69, $rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 70, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 70, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 71, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 71, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 72, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 72, $sub_char3, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber act_upri() {
		return getConstNumber(offset + 73, $act_upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void act_upri(MCNumber value) {
		setConstNumber(offset + 73, $act_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void act_upri(int value) {
		setConstNumber(offset + 73, $act_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void act_upri(long value) {
		setConstNumber(offset + 73, $act_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void act_upri(float value) {
		setConstNumber(offset + 73, $act_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void act_upri(double value) {
		setConstNumber(offset + 73, $act_upri, value);
	}


	/**
	 * Beginning WIP 月初仕掛.<p>
	 *
	 */
	public MCNumber st_wip_cost() {
		return getConstNumber(offset + 74, $st_wip_cost);
	}

	/**
	 * Beginning WIP 月初仕掛.<p>
	 *
	 */
	public void st_wip_cost(MCNumber value) {
		setConstNumber(offset + 74, $st_wip_cost, value);
	}

	/**
	 * Beginning WIP 月初仕掛.<p>
	 *
	 */
	public void st_wip_cost(int value) {
		setConstNumber(offset + 74, $st_wip_cost, value);
	}

	/**
	 * Beginning WIP 月初仕掛.<p>
	 *
	 */
	public void st_wip_cost(long value) {
		setConstNumber(offset + 74, $st_wip_cost, value);
	}

	/**
	 * Beginning WIP 月初仕掛.<p>
	 *
	 */
	public void st_wip_cost(float value) {
		setConstNumber(offset + 74, $st_wip_cost, value);
	}

	/**
	 * Beginning WIP 月初仕掛.<p>
	 *
	 */
	public void st_wip_cost(double value) {
		setConstNumber(offset + 74, $st_wip_cost, value);
	}


	/**
	 * Ending WIP 月末仕掛.<p>
	 *
	 */
	public MCNumber end_wip_cost() {
		return getConstNumber(offset + 75, $end_wip_cost);
	}

	/**
	 * Ending WIP 月末仕掛.<p>
	 *
	 */
	public void end_wip_cost(MCNumber value) {
		setConstNumber(offset + 75, $end_wip_cost, value);
	}

	/**
	 * Ending WIP 月末仕掛.<p>
	 *
	 */
	public void end_wip_cost(int value) {
		setConstNumber(offset + 75, $end_wip_cost, value);
	}

	/**
	 * Ending WIP 月末仕掛.<p>
	 *
	 */
	public void end_wip_cost(long value) {
		setConstNumber(offset + 75, $end_wip_cost, value);
	}

	/**
	 * Ending WIP 月末仕掛.<p>
	 *
	 */
	public void end_wip_cost(float value) {
		setConstNumber(offset + 75, $end_wip_cost, value);
	}

	/**
	 * Ending WIP 月末仕掛.<p>
	 *
	 */
	public void end_wip_cost(double value) {
		setConstNumber(offset + 75, $end_wip_cost, value);
	}


	/**
	 * Incurred 発生.<p>
	 *
	 */
	public MCNumber inst_cost() {
		return getConstNumber(offset + 76, $inst_cost);
	}

	/**
	 * Incurred 発生.<p>
	 *
	 */
	public void inst_cost(MCNumber value) {
		setConstNumber(offset + 76, $inst_cost, value);
	}

	/**
	 * Incurred 発生.<p>
	 *
	 */
	public void inst_cost(int value) {
		setConstNumber(offset + 76, $inst_cost, value);
	}

	/**
	 * Incurred 発生.<p>
	 *
	 */
	public void inst_cost(long value) {
		setConstNumber(offset + 76, $inst_cost, value);
	}

	/**
	 * Incurred 発生.<p>
	 *
	 */
	public void inst_cost(float value) {
		setConstNumber(offset + 76, $inst_cost, value);
	}

	/**
	 * Incurred 発生.<p>
	 *
	 */
	public void inst_cost(double value) {
		setConstNumber(offset + 76, $inst_cost, value);
	}


	/**
	 * Total 合計.<p>
	 *
	 */
	public MCNumber ttl() {
		return getConstNumber(offset + 77, $ttl);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(MCNumber value) {
		setConstNumber(offset + 77, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(int value) {
		setConstNumber(offset + 77, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(long value) {
		setConstNumber(offset + 77, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(float value) {
		setConstNumber(offset + 77, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(double value) {
		setConstNumber(offset + 77, $ttl, value);
	}


	/**
	 * Completed 完成.<p>
	 *
	 */
	public MCNumber comp_cost() {
		return getConstNumber(offset + 78, $comp_cost);
	}

	/**
	 * Completed 完成.<p>
	 *
	 */
	public void comp_cost(MCNumber value) {
		setConstNumber(offset + 78, $comp_cost, value);
	}

	/**
	 * Completed 完成.<p>
	 *
	 */
	public void comp_cost(int value) {
		setConstNumber(offset + 78, $comp_cost, value);
	}

	/**
	 * Completed 完成.<p>
	 *
	 */
	public void comp_cost(long value) {
		setConstNumber(offset + 78, $comp_cost, value);
	}

	/**
	 * Completed 完成.<p>
	 *
	 */
	public void comp_cost(float value) {
		setConstNumber(offset + 78, $comp_cost, value);
	}

	/**
	 * Completed 完成.<p>
	 *
	 */
	public void comp_cost(double value) {
		setConstNumber(offset + 78, $comp_cost, value);
	}


	public String getString(String name) {
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
		if ($dummy_cntry.equalsIgnoreCase(name)) {
			return dummy_cntry();
		}
		if ($dummy_area.equalsIgnoreCase(name)) {
			return dummy_area();
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
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($fix_calc_no.equalsIgnoreCase(name)) {
			return fix_calc_no();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
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
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			return act_upri();
		}
		if ($st_wip_cost.equalsIgnoreCase(name)) {
			return st_wip_cost();
		}
		if ($end_wip_cost.equalsIgnoreCase(name)) {
			return end_wip_cost();
		}
		if ($inst_cost.equalsIgnoreCase(name)) {
			return inst_cost();
		}
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		if ($comp_cost.equalsIgnoreCase(name)) {
			return comp_cost();
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
		if ($schd_st_dt.equalsIgnoreCase(name)) {
			return schd_st_dt();
		}
		if ($schd_end_dt.equalsIgnoreCase(name)) {
			return schd_end_dt();
		}
		if ($act_st_dt.equalsIgnoreCase(name)) {
			return act_st_dt();
		}
		if ($act_end_dt.equalsIgnoreCase(name)) {
			return act_end_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
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
		if ($dummy_cntry.equalsIgnoreCase(name)) {
			return dummy_cntry();
		}
		if ($dummy_area.equalsIgnoreCase(name)) {
			return dummy_area();
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
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($fix_calc_no.equalsIgnoreCase(name)) {
			return fix_calc_no();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
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
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			return act_upri();
		}
		if ($st_wip_cost.equalsIgnoreCase(name)) {
			return st_wip_cost();
		}
		if ($end_wip_cost.equalsIgnoreCase(name)) {
			return end_wip_cost();
		}
		if ($inst_cost.equalsIgnoreCase(name)) {
			return inst_cost();
		}
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		if ($comp_cost.equalsIgnoreCase(name)) {
			return comp_cost();
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
		if ($schd_st_dt.equalsIgnoreCase(name)) {
			return schd_st_dt();
		}
		if ($schd_end_dt.equalsIgnoreCase(name)) {
			return schd_end_dt();
		}
		if ($act_st_dt.equalsIgnoreCase(name)) {
			return act_st_dt();
		}
		if ($act_end_dt.equalsIgnoreCase(name)) {
			return act_end_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
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
		if ($dummy_cntry.equalsIgnoreCase(name)) {
			dummy_cntry(value);
			return;
		}
		if ($dummy_area.equalsIgnoreCase(name)) {
			dummy_area(value);
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
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($fix_calc_no.equalsIgnoreCase(name)) {
			fix_calc_no(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
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
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($st_wip_cost.equalsIgnoreCase(name)) {
			st_wip_cost(value);
			return;
		}
		if ($end_wip_cost.equalsIgnoreCase(name)) {
			end_wip_cost(value);
			return;
		}
		if ($inst_cost.equalsIgnoreCase(name)) {
			inst_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($comp_cost.equalsIgnoreCase(name)) {
			comp_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($st_wip_cost.equalsIgnoreCase(name)) {
			st_wip_cost(value);
			return;
		}
		if ($end_wip_cost.equalsIgnoreCase(name)) {
			end_wip_cost(value);
			return;
		}
		if ($inst_cost.equalsIgnoreCase(name)) {
			inst_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($comp_cost.equalsIgnoreCase(name)) {
			comp_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($st_wip_cost.equalsIgnoreCase(name)) {
			st_wip_cost(value);
			return;
		}
		if ($end_wip_cost.equalsIgnoreCase(name)) {
			end_wip_cost(value);
			return;
		}
		if ($inst_cost.equalsIgnoreCase(name)) {
			inst_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($comp_cost.equalsIgnoreCase(name)) {
			comp_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($st_wip_cost.equalsIgnoreCase(name)) {
			st_wip_cost(value);
			return;
		}
		if ($end_wip_cost.equalsIgnoreCase(name)) {
			end_wip_cost(value);
			return;
		}
		if ($inst_cost.equalsIgnoreCase(name)) {
			inst_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($comp_cost.equalsIgnoreCase(name)) {
			comp_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($st_wip_cost.equalsIgnoreCase(name)) {
			st_wip_cost(value);
			return;
		}
		if ($end_wip_cost.equalsIgnoreCase(name)) {
			end_wip_cost(value);
			return;
		}
		if ($inst_cost.equalsIgnoreCase(name)) {
			inst_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($comp_cost.equalsIgnoreCase(name)) {
			comp_cost(value);
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
		if ($schd_st_dt.equalsIgnoreCase(name)) {
			schd_st_dt(value);
			return;
		}
		if ($schd_end_dt.equalsIgnoreCase(name)) {
			schd_end_dt(value);
			return;
		}
		if ($act_st_dt.equalsIgnoreCase(name)) {
			act_st_dt(value);
			return;
		}
		if ($act_end_dt.equalsIgnoreCase(name)) {
			act_end_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($dummy_cntry.equalsIgnoreCase(name)) {
			dummy_cntry(value);
			return;
		}
		if ($dummy_area.equalsIgnoreCase(name)) {
			dummy_area(value);
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
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($fix_calc_no.equalsIgnoreCase(name)) {
			fix_calc_no(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
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
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($st_wip_cost.equalsIgnoreCase(name)) {
			st_wip_cost(value);
			return;
		}
		if ($end_wip_cost.equalsIgnoreCase(name)) {
			end_wip_cost(value);
			return;
		}
		if ($inst_cost.equalsIgnoreCase(name)) {
			inst_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($comp_cost.equalsIgnoreCase(name)) {
			comp_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($st_wip_cost.equalsIgnoreCase(name)) {
			st_wip_cost(value);
			return;
		}
		if ($end_wip_cost.equalsIgnoreCase(name)) {
			end_wip_cost(value);
			return;
		}
		if ($inst_cost.equalsIgnoreCase(name)) {
			inst_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($comp_cost.equalsIgnoreCase(name)) {
			comp_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($st_wip_cost.equalsIgnoreCase(name)) {
			st_wip_cost(value);
			return;
		}
		if ($end_wip_cost.equalsIgnoreCase(name)) {
			end_wip_cost(value);
			return;
		}
		if ($inst_cost.equalsIgnoreCase(name)) {
			inst_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($comp_cost.equalsIgnoreCase(name)) {
			comp_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($st_wip_cost.equalsIgnoreCase(name)) {
			st_wip_cost(value);
			return;
		}
		if ($end_wip_cost.equalsIgnoreCase(name)) {
			end_wip_cost(value);
			return;
		}
		if ($inst_cost.equalsIgnoreCase(name)) {
			inst_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($comp_cost.equalsIgnoreCase(name)) {
			comp_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($st_wip_cost.equalsIgnoreCase(name)) {
			st_wip_cost(value);
			return;
		}
		if ($end_wip_cost.equalsIgnoreCase(name)) {
			end_wip_cost(value);
			return;
		}
		if ($inst_cost.equalsIgnoreCase(name)) {
			inst_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($comp_cost.equalsIgnoreCase(name)) {
			comp_cost(value);
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
		if ($schd_st_dt.equalsIgnoreCase(name)) {
			schd_st_dt(value);
			return;
		}
		if ($schd_end_dt.equalsIgnoreCase(name)) {
			schd_end_dt(value);
			return;
		}
		if ($act_st_dt.equalsIgnoreCase(name)) {
			act_st_dt(value);
			return;
		}
		if ($act_end_dt.equalsIgnoreCase(name)) {
			act_end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

