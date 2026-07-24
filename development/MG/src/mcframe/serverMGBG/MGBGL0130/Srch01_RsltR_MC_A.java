package mcframe.serverMGBG.MGBGL0130;

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
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm = "calc_ctg_nm";
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
	 * Term 期.<p>
	 *
	 */
	public static final String $term = "term";
	/**
	 * Term name 期名称.<p>
	 *
	 */
	public static final String $term_nm = "term_nm";
	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public static final String $pre_alc_rate_cd = "pre_alc_rate_cd";
	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public static final String $pre_alc_rate_nm = "pre_alc_rate_nm";
	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public static final String $pre_alc_ptn_cd = "pre_alc_ptn_cd";
	/**
	 * Allocation pattern name 配賦パタン名称.<p>
	 *
	 */
	public static final String $pre_alc_ptn_nm = "pre_alc_ptn_nm";
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
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
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
	 * Transfer WG cd. 振替ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $trd_wg_cd = "trd_wg_cd";
	/**
	 * Transfer WG name 振替ワーキンググループ名.<p>
	 *
	 */
	public static final String $trd_wg_nm = "trd_wg_nm";
	/**
	 * Ratio 比率.<p>
	 *
	 */
	public static final String $pre_alc_rate = "pre_alc_rate";
	/**
	 * Difference adjustment 差額調整.<p>
	 *
	 */
	public static final String $adj_flg = "adj_flg";
	/**
	 * Period remarks 期間備考.<p>
	 *
	 */
	public static final String $term_rmrks = "term_rmrks";
	/**
	 * Period spare 1 期間予備１.<p>
	 *
	 */
	public static final String $term_sub_char1 = "term_sub_char1";
	/**
	 * Period spare 2 期間予備２.<p>
	 *
	 */
	public static final String $term_sub_char2 = "term_sub_char2";
	/**
	 * Period spare 3 期間予備３.<p>
	 *
	 */
	public static final String $term_sub_char3 = "term_sub_char3";
	/**
	 * Monthly remarks 月次備考.<p>
	 *
	 */
	public static final String $mly_rmrks = "mly_rmrks";
	/**
	 * Monthly spare 1 月次予備１.<p>
	 *
	 */
	public static final String $mly_sub_char1 = "mly_sub_char1";
	/**
	 * Monthly spare 2 月次予備２.<p>
	 *
	 */
	public static final String $mly_sub_char2 = "mly_sub_char2";
	/**
	 * Monthly spare 3 月次予備３.<p>
	 *
	 */
	public static final String $mly_sub_char3 = "mly_sub_char3";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Dept. allocation type 部門配賦区分.<p>
	 *
	 */
	public static final String $dpt_alc_typ = "dpt_alc_typ";
	/**
	 * Location allocation type 場所配賦区分.<p>
	 *
	 */
	public static final String $loc_alc_typ = "loc_alc_typ";
	/**
	 * Operation allocation type 工程配賦区分.<p>
	 *
	 */
	public static final String $oper_alc_typ = "oper_alc_typ";
	/**
	 * BP allocation type 取引先配賦区分.<p>
	 *
	 */
	public static final String $bp_alc_typ = "bp_alc_typ";
	/**
	 * Item category allocation type 品群配賦区分.<p>
	 *
	 */
	public static final String $ctg_alc_typ = "ctg_alc_typ";
	/**
	 * Item allocation type 品目配賦区分.<p>
	 *
	 */
	public static final String $itm_alc_typ = "itm_alc_typ";
	/**
	 * Lot No. allocation type ロットＮＯ配賦区分.<p>
	 *
	 */
	public static final String $lot_alc_typ = "lot_alc_typ";
	/**
	 * Sublot No. allocation type サブロットＮＯ配賦区分.<p>
	 *
	 */
	public static final String $sublot_alc_typ = "sublot_alc_typ";
	/**
	 * SEIBAN No. 1 allocation type 手配ＮＯ１配賦区分.<p>
	 *
	 */
	public static final String $sno1_alc_typ = "sno1_alc_typ";
	/**
	 * SEIBAN No. 2 allocation type 手配ＮＯ２配賦区分.<p>
	 *
	 */
	public static final String $sno2_alc_typ = "sno2_alc_typ";
	/**
	 * SEIBAN No. 3 allocation type 手配ＮＯ３配賦区分.<p>
	 *
	 */
	public static final String $sno3_alc_typ = "sno3_alc_typ";
	/**
	 * SEIBAN No. 4 allocation type 手配ＮＯ４配賦区分.<p>
	 *
	 */
	public static final String $sno4_alc_typ = "sno4_alc_typ";
	/**
	 * Order allocation type 指図配賦区分.<p>
	 *
	 */
	public static final String $inst_alc_typ = "inst_alc_typ";
	/**
	 * Invoice allocation type インボイス配賦区分.<p>
	 *
	 */
	public static final String $iv_alc_typ = "iv_alc_typ";
	/**
	 * PO allocation type 発注配賦区分.<p>
	 *
	 */
	public static final String $po_alc_typ = "po_alc_typ";
	/**
	 * Sales order allocation type 受注配賦区分.<p>
	 *
	 */
	public static final String $slo_alc_typ = "slo_alc_typ";
	/**
	 * Allocation account allocation type 配賦科目配賦区分.<p>
	 *
	 */
	public static final String $alc_ac_alc_typ = "alc_ac_alc_typ";
	/**
	 * WG allocation type ワーキンググループ配賦区分.<p>
	 *
	 */
	public static final String $wg_alc_typ = "wg_alc_typ";


	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta term_nm_META = createCommonMeta($term_nm, mcframe.commonMA.meta.MA_META.TERM_NM);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta pre_alc_rate_cd_META = createCommonMeta($pre_alc_rate_cd, mcframe.commonMA.meta.MA_META.PRE_ALC_RATE_CD);
	public static final MCMeta pre_alc_rate_nm_META = createCommonMeta($pre_alc_rate_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_RATE_NM);
	public static final MCMeta pre_alc_ptn_cd_META = createCommonMeta($pre_alc_ptn_cd, mcframe.commonMA.meta.MA_META.PRE_ALC_PTN_CD);
	public static final MCMeta pre_alc_ptn_nm_META = createCommonMeta($pre_alc_ptn_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_PTN_NM);
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
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta alc_ac_cd_META = createCommonMeta($alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta alc_ac_nm_META = createCommonMeta($alc_ac_nm, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta trd_wg_cd_META = createCommonMeta($trd_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta trd_wg_nm_META = createCommonMeta($trd_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta pre_alc_rate_META = createCommonMeta($pre_alc_rate, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta adj_flg_META = createCommonMeta($adj_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta term_rmrks_META = createCommonMeta($term_rmrks, mcframe.commonMG.meta.MG_META.PRE_RATE_TERM_RMRKS);
	public static final MCMeta term_sub_char1_META = createCommonMeta($term_sub_char1, mcframe.commonMG.meta.MG_META.PRE_RATE_TERM_SUB_CHAR1);
	public static final MCMeta term_sub_char2_META = createCommonMeta($term_sub_char2, mcframe.commonMG.meta.MG_META.PRE_RATE_TERM_SUB_CHAR2);
	public static final MCMeta term_sub_char3_META = createCommonMeta($term_sub_char3, mcframe.commonMG.meta.MG_META.PRE_RATE_TERM_SUB_CHAR3);
	public static final MCMeta mly_rmrks_META = createCommonMeta($mly_rmrks, mcframe.commonMG.meta.MG_META.PRE_RATE_MLY_RMRKS);
	public static final MCMeta mly_sub_char1_META = createCommonMeta($mly_sub_char1, mcframe.commonMG.meta.MG_META.PRE_RATE_MLY_SUB_CHAR1);
	public static final MCMeta mly_sub_char2_META = createCommonMeta($mly_sub_char2, mcframe.commonMG.meta.MG_META.PRE_RATE_MLY_SUB_CHAR2);
	public static final MCMeta mly_sub_char3_META = createCommonMeta($mly_sub_char3, mcframe.commonMG.meta.MG_META.PRE_RATE_MLY_SUB_CHAR3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta dpt_alc_typ_META = createCommonMeta($dpt_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta loc_alc_typ_META = createCommonMeta($loc_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta oper_alc_typ_META = createCommonMeta($oper_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta bp_alc_typ_META = createCommonMeta($bp_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta ctg_alc_typ_META = createCommonMeta($ctg_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta itm_alc_typ_META = createCommonMeta($itm_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta lot_alc_typ_META = createCommonMeta($lot_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta sublot_alc_typ_META = createCommonMeta($sublot_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta sno1_alc_typ_META = createCommonMeta($sno1_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta sno2_alc_typ_META = createCommonMeta($sno2_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta sno3_alc_typ_META = createCommonMeta($sno3_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta sno4_alc_typ_META = createCommonMeta($sno4_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta inst_alc_typ_META = createCommonMeta($inst_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta iv_alc_typ_META = createCommonMeta($iv_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta po_alc_typ_META = createCommonMeta($po_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta slo_alc_typ_META = createCommonMeta($slo_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta alc_ac_alc_typ_META = createCommonMeta($alc_ac_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta wg_alc_typ_META = createCommonMeta($wg_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_ctg_cd_META,
			calc_ctg_nm_META,
			wg_cd_META,
			wg_nm_META,
			term_META,
			term_nm_META,
			ym_META,
			pre_alc_rate_cd_META,
			pre_alc_rate_nm_META,
			pre_alc_ptn_cd_META,
			pre_alc_ptn_nm_META,
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
			iv_no_META,
			po_no_META,
			slo_no_META,
			alc_ac_cd_META,
			alc_ac_nm_META,
			trd_wg_cd_META,
			trd_wg_nm_META,
			pre_alc_rate_META,
			adj_flg_META,
			term_rmrks_META,
			term_sub_char1_META,
			term_sub_char2_META,
			term_sub_char3_META,
			mly_rmrks_META,
			mly_sub_char1_META,
			mly_sub_char2_META,
			mly_sub_char3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META,
			upd_cntr_META,
			dpt_alc_typ_META,
			loc_alc_typ_META,
			oper_alc_typ_META,
			bp_alc_typ_META,
			ctg_alc_typ_META,
			itm_alc_typ_META,
			lot_alc_typ_META,
			sublot_alc_typ_META,
			sno1_alc_typ_META,
			sno2_alc_typ_META,
			sno3_alc_typ_META,
			sno4_alc_typ_META,
			inst_alc_typ_META,
			iv_alc_typ_META,
			po_alc_typ_META,
			slo_alc_typ_META,
			alc_ac_alc_typ_META,
			wg_alc_typ_META
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
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 0, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 0, $calc_ctg_cd, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 1, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 1, $calc_ctg_nm, value);
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
	 * Term 期.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 4, $term);
	}

	/**
	 * Term 期.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 4, $term, value);
	}


	/**
	 * Term name 期名称.<p>
	 *
	 */
	public String term_nm() {
		return getConstString(offset + 5, $term_nm);
	}

	/**
	 * Term name 期名称.<p>
	 *
	 */
	public void term_nm(String value) {
		setConstString(offset + 5, $term_nm, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 6, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 6, $ym, value);
	}


	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public String pre_alc_rate_cd() {
		return getConstString(offset + 7, $pre_alc_rate_cd);
	}

	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public void pre_alc_rate_cd(String value) {
		setConstString(offset + 7, $pre_alc_rate_cd, value);
	}


	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public String pre_alc_rate_nm() {
		return getConstString(offset + 8, $pre_alc_rate_nm);
	}

	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public void pre_alc_rate_nm(String value) {
		setConstString(offset + 8, $pre_alc_rate_nm, value);
	}


	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public String pre_alc_ptn_cd() {
		return getConstString(offset + 9, $pre_alc_ptn_cd);
	}

	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public void pre_alc_ptn_cd(String value) {
		setConstString(offset + 9, $pre_alc_ptn_cd, value);
	}


	/**
	 * Allocation pattern name 配賦パタン名称.<p>
	 *
	 */
	public String pre_alc_ptn_nm() {
		return getConstString(offset + 10, $pre_alc_ptn_nm);
	}

	/**
	 * Allocation pattern name 配賦パタン名称.<p>
	 *
	 */
	public void pre_alc_ptn_nm(String value) {
		setConstString(offset + 10, $pre_alc_ptn_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 11, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 11, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 12, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 12, $dpt_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 13, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 13, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 14, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 14, $loc_nm, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 15, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 15, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 16, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 16, $oper_nm, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 17, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 17, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 18, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 18, $bp_nm, value);
	}


	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public String ctg_cd() {
		return getConstString(offset + 19, $ctg_cd);
	}

	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public void ctg_cd(String value) {
		setConstString(offset + 19, $ctg_cd, value);
	}


	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public String ctg_nm() {
		return getConstString(offset + 20, $ctg_nm);
	}

	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public void ctg_nm(String value) {
		setConstString(offset + 20, $ctg_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 21, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 21, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 22, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 22, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 23, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 23, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 24, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 24, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 25, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 25, $itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 26, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 26, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 27, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 27, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 28, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 28, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 29, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 29, $itm_typ_d_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 30, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 30, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 31, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 31, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 32, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 32, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 33, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 33, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 34, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 34, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 35, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 35, $sno4, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 36, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 36, $itm_mfg_inst_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 37, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 37, $iv_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 38, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 38, $po_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 39, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 39, $slo_no, value);
	}


	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public String alc_ac_cd() {
		return getConstString(offset + 40, $alc_ac_cd);
	}

	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		setConstString(offset + 40, $alc_ac_cd, value);
	}


	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public String alc_ac_nm() {
		return getConstString(offset + 41, $alc_ac_nm);
	}

	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public void alc_ac_nm(String value) {
		setConstString(offset + 41, $alc_ac_nm, value);
	}


	/**
	 * Transfer WG cd. 振替ワーキンググループＣＤ.<p>
	 *
	 */
	public String trd_wg_cd() {
		return getConstString(offset + 42, $trd_wg_cd);
	}

	/**
	 * Transfer WG cd. 振替ワーキンググループＣＤ.<p>
	 *
	 */
	public void trd_wg_cd(String value) {
		setConstString(offset + 42, $trd_wg_cd, value);
	}


	/**
	 * Transfer WG name 振替ワーキンググループ名.<p>
	 *
	 */
	public String trd_wg_nm() {
		return getConstString(offset + 43, $trd_wg_nm);
	}

	/**
	 * Transfer WG name 振替ワーキンググループ名.<p>
	 *
	 */
	public void trd_wg_nm(String value) {
		setConstString(offset + 43, $trd_wg_nm, value);
	}


	/**
	 * Ratio 比率.<p>
	 *
	 */
	public MCNumber pre_alc_rate() {
		return getConstNumber(offset + 44, $pre_alc_rate);
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public void pre_alc_rate(MCNumber value) {
		setConstNumber(offset + 44, $pre_alc_rate, value);
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public void pre_alc_rate(int value) {
		setConstNumber(offset + 44, $pre_alc_rate, value);
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public void pre_alc_rate(long value) {
		setConstNumber(offset + 44, $pre_alc_rate, value);
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public void pre_alc_rate(float value) {
		setConstNumber(offset + 44, $pre_alc_rate, value);
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public void pre_alc_rate(double value) {
		setConstNumber(offset + 44, $pre_alc_rate, value);
	}


	/**
	 * Difference adjustment 差額調整.<p>
	 *
	 */
	public boolean adj_flg() {
		return getConstBoolean(offset + 45, $adj_flg);
	}

	/**
	 * Difference adjustment 差額調整.<p>
	 *
	 */
	public void adj_flg(boolean value) {
		setConstBoolean(offset + 45, $adj_flg, value);
	}


	/**
	 * Period remarks 期間備考.<p>
	 *
	 */
	public String term_rmrks() {
		return getConstString(offset + 46, $term_rmrks);
	}

	/**
	 * Period remarks 期間備考.<p>
	 *
	 */
	public void term_rmrks(String value) {
		setConstString(offset + 46, $term_rmrks, value);
	}


	/**
	 * Period spare 1 期間予備１.<p>
	 *
	 */
	public String term_sub_char1() {
		return getConstString(offset + 47, $term_sub_char1);
	}

	/**
	 * Period spare 1 期間予備１.<p>
	 *
	 */
	public void term_sub_char1(String value) {
		setConstString(offset + 47, $term_sub_char1, value);
	}


	/**
	 * Period spare 2 期間予備２.<p>
	 *
	 */
	public String term_sub_char2() {
		return getConstString(offset + 48, $term_sub_char2);
	}

	/**
	 * Period spare 2 期間予備２.<p>
	 *
	 */
	public void term_sub_char2(String value) {
		setConstString(offset + 48, $term_sub_char2, value);
	}


	/**
	 * Period spare 3 期間予備３.<p>
	 *
	 */
	public String term_sub_char3() {
		return getConstString(offset + 49, $term_sub_char3);
	}

	/**
	 * Period spare 3 期間予備３.<p>
	 *
	 */
	public void term_sub_char3(String value) {
		setConstString(offset + 49, $term_sub_char3, value);
	}


	/**
	 * Monthly remarks 月次備考.<p>
	 *
	 */
	public String mly_rmrks() {
		return getConstString(offset + 50, $mly_rmrks);
	}

	/**
	 * Monthly remarks 月次備考.<p>
	 *
	 */
	public void mly_rmrks(String value) {
		setConstString(offset + 50, $mly_rmrks, value);
	}


	/**
	 * Monthly spare 1 月次予備１.<p>
	 *
	 */
	public String mly_sub_char1() {
		return getConstString(offset + 51, $mly_sub_char1);
	}

	/**
	 * Monthly spare 1 月次予備１.<p>
	 *
	 */
	public void mly_sub_char1(String value) {
		setConstString(offset + 51, $mly_sub_char1, value);
	}


	/**
	 * Monthly spare 2 月次予備２.<p>
	 *
	 */
	public String mly_sub_char2() {
		return getConstString(offset + 52, $mly_sub_char2);
	}

	/**
	 * Monthly spare 2 月次予備２.<p>
	 *
	 */
	public void mly_sub_char2(String value) {
		setConstString(offset + 52, $mly_sub_char2, value);
	}


	/**
	 * Monthly spare 3 月次予備３.<p>
	 *
	 */
	public String mly_sub_char3() {
		return getConstString(offset + 53, $mly_sub_char3);
	}

	/**
	 * Monthly spare 3 月次予備３.<p>
	 *
	 */
	public void mly_sub_char3(String value) {
		setConstString(offset + 53, $mly_sub_char3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 54, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 54, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 55, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 55, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 56, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 56, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 57, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 57, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 58, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 58, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 59, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 59, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 60, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 60, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 61, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 61, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 62, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 62, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 63, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 63, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 64, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 64, $upd_srv_req_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 65, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 65, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 65, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 65, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 65, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 65, $upd_cntr, value);
	}


	/**
	 * Dept. allocation type 部門配賦区分.<p>
	 *
	 */
	public String dpt_alc_typ() {
		return getConstString(offset + 66, $dpt_alc_typ);
	}

	/**
	 * Dept. allocation type 部門配賦区分.<p>
	 *
	 */
	public void dpt_alc_typ(String value) {
		setConstString(offset + 66, $dpt_alc_typ, value);
	}


	/**
	 * Location allocation type 場所配賦区分.<p>
	 *
	 */
	public String loc_alc_typ() {
		return getConstString(offset + 67, $loc_alc_typ);
	}

	/**
	 * Location allocation type 場所配賦区分.<p>
	 *
	 */
	public void loc_alc_typ(String value) {
		setConstString(offset + 67, $loc_alc_typ, value);
	}


	/**
	 * Operation allocation type 工程配賦区分.<p>
	 *
	 */
	public String oper_alc_typ() {
		return getConstString(offset + 68, $oper_alc_typ);
	}

	/**
	 * Operation allocation type 工程配賦区分.<p>
	 *
	 */
	public void oper_alc_typ(String value) {
		setConstString(offset + 68, $oper_alc_typ, value);
	}


	/**
	 * BP allocation type 取引先配賦区分.<p>
	 *
	 */
	public String bp_alc_typ() {
		return getConstString(offset + 69, $bp_alc_typ);
	}

	/**
	 * BP allocation type 取引先配賦区分.<p>
	 *
	 */
	public void bp_alc_typ(String value) {
		setConstString(offset + 69, $bp_alc_typ, value);
	}


	/**
	 * Item category allocation type 品群配賦区分.<p>
	 *
	 */
	public String ctg_alc_typ() {
		return getConstString(offset + 70, $ctg_alc_typ);
	}

	/**
	 * Item category allocation type 品群配賦区分.<p>
	 *
	 */
	public void ctg_alc_typ(String value) {
		setConstString(offset + 70, $ctg_alc_typ, value);
	}


	/**
	 * Item allocation type 品目配賦区分.<p>
	 *
	 */
	public String itm_alc_typ() {
		return getConstString(offset + 71, $itm_alc_typ);
	}

	/**
	 * Item allocation type 品目配賦区分.<p>
	 *
	 */
	public void itm_alc_typ(String value) {
		setConstString(offset + 71, $itm_alc_typ, value);
	}


	/**
	 * Lot No. allocation type ロットＮＯ配賦区分.<p>
	 *
	 */
	public String lot_alc_typ() {
		return getConstString(offset + 72, $lot_alc_typ);
	}

	/**
	 * Lot No. allocation type ロットＮＯ配賦区分.<p>
	 *
	 */
	public void lot_alc_typ(String value) {
		setConstString(offset + 72, $lot_alc_typ, value);
	}


	/**
	 * Sublot No. allocation type サブロットＮＯ配賦区分.<p>
	 *
	 */
	public String sublot_alc_typ() {
		return getConstString(offset + 73, $sublot_alc_typ);
	}

	/**
	 * Sublot No. allocation type サブロットＮＯ配賦区分.<p>
	 *
	 */
	public void sublot_alc_typ(String value) {
		setConstString(offset + 73, $sublot_alc_typ, value);
	}


	/**
	 * SEIBAN No. 1 allocation type 手配ＮＯ１配賦区分.<p>
	 *
	 */
	public String sno1_alc_typ() {
		return getConstString(offset + 74, $sno1_alc_typ);
	}

	/**
	 * SEIBAN No. 1 allocation type 手配ＮＯ１配賦区分.<p>
	 *
	 */
	public void sno1_alc_typ(String value) {
		setConstString(offset + 74, $sno1_alc_typ, value);
	}


	/**
	 * SEIBAN No. 2 allocation type 手配ＮＯ２配賦区分.<p>
	 *
	 */
	public String sno2_alc_typ() {
		return getConstString(offset + 75, $sno2_alc_typ);
	}

	/**
	 * SEIBAN No. 2 allocation type 手配ＮＯ２配賦区分.<p>
	 *
	 */
	public void sno2_alc_typ(String value) {
		setConstString(offset + 75, $sno2_alc_typ, value);
	}


	/**
	 * SEIBAN No. 3 allocation type 手配ＮＯ３配賦区分.<p>
	 *
	 */
	public String sno3_alc_typ() {
		return getConstString(offset + 76, $sno3_alc_typ);
	}

	/**
	 * SEIBAN No. 3 allocation type 手配ＮＯ３配賦区分.<p>
	 *
	 */
	public void sno3_alc_typ(String value) {
		setConstString(offset + 76, $sno3_alc_typ, value);
	}


	/**
	 * SEIBAN No. 4 allocation type 手配ＮＯ４配賦区分.<p>
	 *
	 */
	public String sno4_alc_typ() {
		return getConstString(offset + 77, $sno4_alc_typ);
	}

	/**
	 * SEIBAN No. 4 allocation type 手配ＮＯ４配賦区分.<p>
	 *
	 */
	public void sno4_alc_typ(String value) {
		setConstString(offset + 77, $sno4_alc_typ, value);
	}


	/**
	 * Order allocation type 指図配賦区分.<p>
	 *
	 */
	public String inst_alc_typ() {
		return getConstString(offset + 78, $inst_alc_typ);
	}

	/**
	 * Order allocation type 指図配賦区分.<p>
	 *
	 */
	public void inst_alc_typ(String value) {
		setConstString(offset + 78, $inst_alc_typ, value);
	}


	/**
	 * Invoice allocation type インボイス配賦区分.<p>
	 *
	 */
	public String iv_alc_typ() {
		return getConstString(offset + 79, $iv_alc_typ);
	}

	/**
	 * Invoice allocation type インボイス配賦区分.<p>
	 *
	 */
	public void iv_alc_typ(String value) {
		setConstString(offset + 79, $iv_alc_typ, value);
	}


	/**
	 * PO allocation type 発注配賦区分.<p>
	 *
	 */
	public String po_alc_typ() {
		return getConstString(offset + 80, $po_alc_typ);
	}

	/**
	 * PO allocation type 発注配賦区分.<p>
	 *
	 */
	public void po_alc_typ(String value) {
		setConstString(offset + 80, $po_alc_typ, value);
	}


	/**
	 * Sales order allocation type 受注配賦区分.<p>
	 *
	 */
	public String slo_alc_typ() {
		return getConstString(offset + 81, $slo_alc_typ);
	}

	/**
	 * Sales order allocation type 受注配賦区分.<p>
	 *
	 */
	public void slo_alc_typ(String value) {
		setConstString(offset + 81, $slo_alc_typ, value);
	}


	/**
	 * Allocation account allocation type 配賦科目配賦区分.<p>
	 *
	 */
	public String alc_ac_alc_typ() {
		return getConstString(offset + 82, $alc_ac_alc_typ);
	}

	/**
	 * Allocation account allocation type 配賦科目配賦区分.<p>
	 *
	 */
	public void alc_ac_alc_typ(String value) {
		setConstString(offset + 82, $alc_ac_alc_typ, value);
	}


	/**
	 * WG allocation type ワーキンググループ配賦区分.<p>
	 *
	 */
	public String wg_alc_typ() {
		return getConstString(offset + 83, $wg_alc_typ);
	}

	/**
	 * WG allocation type ワーキンググループ配賦区分.<p>
	 *
	 */
	public void wg_alc_typ(String value) {
		setConstString(offset + 83, $wg_alc_typ, value);
	}


	public String getString(String name) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			return term_nm();
		}
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			return pre_alc_rate_cd();
		}
		if ($pre_alc_rate_nm.equalsIgnoreCase(name)) {
			return pre_alc_rate_nm();
		}
		if ($pre_alc_ptn_cd.equalsIgnoreCase(name)) {
			return pre_alc_ptn_cd();
		}
		if ($pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			return pre_alc_ptn_nm();
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
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($trd_wg_cd.equalsIgnoreCase(name)) {
			return trd_wg_cd();
		}
		if ($trd_wg_nm.equalsIgnoreCase(name)) {
			return trd_wg_nm();
		}
		if ($term_rmrks.equalsIgnoreCase(name)) {
			return term_rmrks();
		}
		if ($term_sub_char1.equalsIgnoreCase(name)) {
			return term_sub_char1();
		}
		if ($term_sub_char2.equalsIgnoreCase(name)) {
			return term_sub_char2();
		}
		if ($term_sub_char3.equalsIgnoreCase(name)) {
			return term_sub_char3();
		}
		if ($mly_rmrks.equalsIgnoreCase(name)) {
			return mly_rmrks();
		}
		if ($mly_sub_char1.equalsIgnoreCase(name)) {
			return mly_sub_char1();
		}
		if ($mly_sub_char2.equalsIgnoreCase(name)) {
			return mly_sub_char2();
		}
		if ($mly_sub_char3.equalsIgnoreCase(name)) {
			return mly_sub_char3();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($dpt_alc_typ.equalsIgnoreCase(name)) {
			return dpt_alc_typ();
		}
		if ($loc_alc_typ.equalsIgnoreCase(name)) {
			return loc_alc_typ();
		}
		if ($oper_alc_typ.equalsIgnoreCase(name)) {
			return oper_alc_typ();
		}
		if ($bp_alc_typ.equalsIgnoreCase(name)) {
			return bp_alc_typ();
		}
		if ($ctg_alc_typ.equalsIgnoreCase(name)) {
			return ctg_alc_typ();
		}
		if ($itm_alc_typ.equalsIgnoreCase(name)) {
			return itm_alc_typ();
		}
		if ($lot_alc_typ.equalsIgnoreCase(name)) {
			return lot_alc_typ();
		}
		if ($sublot_alc_typ.equalsIgnoreCase(name)) {
			return sublot_alc_typ();
		}
		if ($sno1_alc_typ.equalsIgnoreCase(name)) {
			return sno1_alc_typ();
		}
		if ($sno2_alc_typ.equalsIgnoreCase(name)) {
			return sno2_alc_typ();
		}
		if ($sno3_alc_typ.equalsIgnoreCase(name)) {
			return sno3_alc_typ();
		}
		if ($sno4_alc_typ.equalsIgnoreCase(name)) {
			return sno4_alc_typ();
		}
		if ($inst_alc_typ.equalsIgnoreCase(name)) {
			return inst_alc_typ();
		}
		if ($iv_alc_typ.equalsIgnoreCase(name)) {
			return iv_alc_typ();
		}
		if ($po_alc_typ.equalsIgnoreCase(name)) {
			return po_alc_typ();
		}
		if ($slo_alc_typ.equalsIgnoreCase(name)) {
			return slo_alc_typ();
		}
		if ($alc_ac_alc_typ.equalsIgnoreCase(name)) {
			return alc_ac_alc_typ();
		}
		if ($wg_alc_typ.equalsIgnoreCase(name)) {
			return wg_alc_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			return pre_alc_rate();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($adj_flg.equalsIgnoreCase(name)) {
			return adj_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			return term_nm();
		}
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			return pre_alc_rate_cd();
		}
		if ($pre_alc_rate_nm.equalsIgnoreCase(name)) {
			return pre_alc_rate_nm();
		}
		if ($pre_alc_ptn_cd.equalsIgnoreCase(name)) {
			return pre_alc_ptn_cd();
		}
		if ($pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			return pre_alc_ptn_nm();
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
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($trd_wg_cd.equalsIgnoreCase(name)) {
			return trd_wg_cd();
		}
		if ($trd_wg_nm.equalsIgnoreCase(name)) {
			return trd_wg_nm();
		}
		if ($term_rmrks.equalsIgnoreCase(name)) {
			return term_rmrks();
		}
		if ($term_sub_char1.equalsIgnoreCase(name)) {
			return term_sub_char1();
		}
		if ($term_sub_char2.equalsIgnoreCase(name)) {
			return term_sub_char2();
		}
		if ($term_sub_char3.equalsIgnoreCase(name)) {
			return term_sub_char3();
		}
		if ($mly_rmrks.equalsIgnoreCase(name)) {
			return mly_rmrks();
		}
		if ($mly_sub_char1.equalsIgnoreCase(name)) {
			return mly_sub_char1();
		}
		if ($mly_sub_char2.equalsIgnoreCase(name)) {
			return mly_sub_char2();
		}
		if ($mly_sub_char3.equalsIgnoreCase(name)) {
			return mly_sub_char3();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($dpt_alc_typ.equalsIgnoreCase(name)) {
			return dpt_alc_typ();
		}
		if ($loc_alc_typ.equalsIgnoreCase(name)) {
			return loc_alc_typ();
		}
		if ($oper_alc_typ.equalsIgnoreCase(name)) {
			return oper_alc_typ();
		}
		if ($bp_alc_typ.equalsIgnoreCase(name)) {
			return bp_alc_typ();
		}
		if ($ctg_alc_typ.equalsIgnoreCase(name)) {
			return ctg_alc_typ();
		}
		if ($itm_alc_typ.equalsIgnoreCase(name)) {
			return itm_alc_typ();
		}
		if ($lot_alc_typ.equalsIgnoreCase(name)) {
			return lot_alc_typ();
		}
		if ($sublot_alc_typ.equalsIgnoreCase(name)) {
			return sublot_alc_typ();
		}
		if ($sno1_alc_typ.equalsIgnoreCase(name)) {
			return sno1_alc_typ();
		}
		if ($sno2_alc_typ.equalsIgnoreCase(name)) {
			return sno2_alc_typ();
		}
		if ($sno3_alc_typ.equalsIgnoreCase(name)) {
			return sno3_alc_typ();
		}
		if ($sno4_alc_typ.equalsIgnoreCase(name)) {
			return sno4_alc_typ();
		}
		if ($inst_alc_typ.equalsIgnoreCase(name)) {
			return inst_alc_typ();
		}
		if ($iv_alc_typ.equalsIgnoreCase(name)) {
			return iv_alc_typ();
		}
		if ($po_alc_typ.equalsIgnoreCase(name)) {
			return po_alc_typ();
		}
		if ($slo_alc_typ.equalsIgnoreCase(name)) {
			return slo_alc_typ();
		}
		if ($alc_ac_alc_typ.equalsIgnoreCase(name)) {
			return alc_ac_alc_typ();
		}
		if ($wg_alc_typ.equalsIgnoreCase(name)) {
			return wg_alc_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			return pre_alc_rate();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($adj_flg.equalsIgnoreCase(name)) {
			return adj_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
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
		if ($term_nm.equalsIgnoreCase(name)) {
			term_nm(value);
			return;
		}
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			pre_alc_rate_cd(value);
			return;
		}
		if ($pre_alc_rate_nm.equalsIgnoreCase(name)) {
			pre_alc_rate_nm(value);
			return;
		}
		if ($pre_alc_ptn_cd.equalsIgnoreCase(name)) {
			pre_alc_ptn_cd(value);
			return;
		}
		if ($pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			pre_alc_ptn_nm(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($trd_wg_cd.equalsIgnoreCase(name)) {
			trd_wg_cd(value);
			return;
		}
		if ($trd_wg_nm.equalsIgnoreCase(name)) {
			trd_wg_nm(value);
			return;
		}
		if ($term_rmrks.equalsIgnoreCase(name)) {
			term_rmrks(value);
			return;
		}
		if ($term_sub_char1.equalsIgnoreCase(name)) {
			term_sub_char1(value);
			return;
		}
		if ($term_sub_char2.equalsIgnoreCase(name)) {
			term_sub_char2(value);
			return;
		}
		if ($term_sub_char3.equalsIgnoreCase(name)) {
			term_sub_char3(value);
			return;
		}
		if ($mly_rmrks.equalsIgnoreCase(name)) {
			mly_rmrks(value);
			return;
		}
		if ($mly_sub_char1.equalsIgnoreCase(name)) {
			mly_sub_char1(value);
			return;
		}
		if ($mly_sub_char2.equalsIgnoreCase(name)) {
			mly_sub_char2(value);
			return;
		}
		if ($mly_sub_char3.equalsIgnoreCase(name)) {
			mly_sub_char3(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($dpt_alc_typ.equalsIgnoreCase(name)) {
			dpt_alc_typ(value);
			return;
		}
		if ($loc_alc_typ.equalsIgnoreCase(name)) {
			loc_alc_typ(value);
			return;
		}
		if ($oper_alc_typ.equalsIgnoreCase(name)) {
			oper_alc_typ(value);
			return;
		}
		if ($bp_alc_typ.equalsIgnoreCase(name)) {
			bp_alc_typ(value);
			return;
		}
		if ($ctg_alc_typ.equalsIgnoreCase(name)) {
			ctg_alc_typ(value);
			return;
		}
		if ($itm_alc_typ.equalsIgnoreCase(name)) {
			itm_alc_typ(value);
			return;
		}
		if ($lot_alc_typ.equalsIgnoreCase(name)) {
			lot_alc_typ(value);
			return;
		}
		if ($sublot_alc_typ.equalsIgnoreCase(name)) {
			sublot_alc_typ(value);
			return;
		}
		if ($sno1_alc_typ.equalsIgnoreCase(name)) {
			sno1_alc_typ(value);
			return;
		}
		if ($sno2_alc_typ.equalsIgnoreCase(name)) {
			sno2_alc_typ(value);
			return;
		}
		if ($sno3_alc_typ.equalsIgnoreCase(name)) {
			sno3_alc_typ(value);
			return;
		}
		if ($sno4_alc_typ.equalsIgnoreCase(name)) {
			sno4_alc_typ(value);
			return;
		}
		if ($inst_alc_typ.equalsIgnoreCase(name)) {
			inst_alc_typ(value);
			return;
		}
		if ($iv_alc_typ.equalsIgnoreCase(name)) {
			iv_alc_typ(value);
			return;
		}
		if ($po_alc_typ.equalsIgnoreCase(name)) {
			po_alc_typ(value);
			return;
		}
		if ($slo_alc_typ.equalsIgnoreCase(name)) {
			slo_alc_typ(value);
			return;
		}
		if ($alc_ac_alc_typ.equalsIgnoreCase(name)) {
			alc_ac_alc_typ(value);
			return;
		}
		if ($wg_alc_typ.equalsIgnoreCase(name)) {
			wg_alc_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($adj_flg.equalsIgnoreCase(name)) {
			adj_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
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
		if ($term_nm.equalsIgnoreCase(name)) {
			term_nm(value);
			return;
		}
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			pre_alc_rate_cd(value);
			return;
		}
		if ($pre_alc_rate_nm.equalsIgnoreCase(name)) {
			pre_alc_rate_nm(value);
			return;
		}
		if ($pre_alc_ptn_cd.equalsIgnoreCase(name)) {
			pre_alc_ptn_cd(value);
			return;
		}
		if ($pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			pre_alc_ptn_nm(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($trd_wg_cd.equalsIgnoreCase(name)) {
			trd_wg_cd(value);
			return;
		}
		if ($trd_wg_nm.equalsIgnoreCase(name)) {
			trd_wg_nm(value);
			return;
		}
		if ($term_rmrks.equalsIgnoreCase(name)) {
			term_rmrks(value);
			return;
		}
		if ($term_sub_char1.equalsIgnoreCase(name)) {
			term_sub_char1(value);
			return;
		}
		if ($term_sub_char2.equalsIgnoreCase(name)) {
			term_sub_char2(value);
			return;
		}
		if ($term_sub_char3.equalsIgnoreCase(name)) {
			term_sub_char3(value);
			return;
		}
		if ($mly_rmrks.equalsIgnoreCase(name)) {
			mly_rmrks(value);
			return;
		}
		if ($mly_sub_char1.equalsIgnoreCase(name)) {
			mly_sub_char1(value);
			return;
		}
		if ($mly_sub_char2.equalsIgnoreCase(name)) {
			mly_sub_char2(value);
			return;
		}
		if ($mly_sub_char3.equalsIgnoreCase(name)) {
			mly_sub_char3(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($dpt_alc_typ.equalsIgnoreCase(name)) {
			dpt_alc_typ(value);
			return;
		}
		if ($loc_alc_typ.equalsIgnoreCase(name)) {
			loc_alc_typ(value);
			return;
		}
		if ($oper_alc_typ.equalsIgnoreCase(name)) {
			oper_alc_typ(value);
			return;
		}
		if ($bp_alc_typ.equalsIgnoreCase(name)) {
			bp_alc_typ(value);
			return;
		}
		if ($ctg_alc_typ.equalsIgnoreCase(name)) {
			ctg_alc_typ(value);
			return;
		}
		if ($itm_alc_typ.equalsIgnoreCase(name)) {
			itm_alc_typ(value);
			return;
		}
		if ($lot_alc_typ.equalsIgnoreCase(name)) {
			lot_alc_typ(value);
			return;
		}
		if ($sublot_alc_typ.equalsIgnoreCase(name)) {
			sublot_alc_typ(value);
			return;
		}
		if ($sno1_alc_typ.equalsIgnoreCase(name)) {
			sno1_alc_typ(value);
			return;
		}
		if ($sno2_alc_typ.equalsIgnoreCase(name)) {
			sno2_alc_typ(value);
			return;
		}
		if ($sno3_alc_typ.equalsIgnoreCase(name)) {
			sno3_alc_typ(value);
			return;
		}
		if ($sno4_alc_typ.equalsIgnoreCase(name)) {
			sno4_alc_typ(value);
			return;
		}
		if ($inst_alc_typ.equalsIgnoreCase(name)) {
			inst_alc_typ(value);
			return;
		}
		if ($iv_alc_typ.equalsIgnoreCase(name)) {
			iv_alc_typ(value);
			return;
		}
		if ($po_alc_typ.equalsIgnoreCase(name)) {
			po_alc_typ(value);
			return;
		}
		if ($slo_alc_typ.equalsIgnoreCase(name)) {
			slo_alc_typ(value);
			return;
		}
		if ($alc_ac_alc_typ.equalsIgnoreCase(name)) {
			alc_ac_alc_typ(value);
			return;
		}
		if ($wg_alc_typ.equalsIgnoreCase(name)) {
			wg_alc_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($adj_flg.equalsIgnoreCase(name)) {
			adj_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

