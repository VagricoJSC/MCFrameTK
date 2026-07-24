package mcframe.clientMSBE.MSBEP0150;

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
 * ブロック"AllocDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class AllocDtlR_MC_A extends MCConstRow {

	/**
	 * Late delivery 納期遅延.<p>
	 *
	 */
	public static final String $prms_delay_flg = "prms_delay_flg";
	/**
	 * GR split 入庫分割.<p>
	 *
	 */
	public static final String $split_flg = "split_flg";
	/**
	 * Original order 元順.<p>
	 *
	 */
	public static final String $pre_alloc_prio = "pre_alloc_prio";
	/**
	 * Allocation sequence No. 引当順ＮＯ.<p>
	 *
	 */
	public static final String $alloc_prio = "alloc_prio";
	public static final String $itm_p = "itm_p";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public static final String $xfr_schd_no = "xfr_schd_no";
	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public static final String $ship_schd_no = "ship_schd_no";
	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public static final String $alloc_typ = "alloc_typ";
	/**
	 * Allocation type name 引当区分名.<p>
	 *
	 */
	public static final String $alloc_typ_nm = "alloc_typ_nm";
	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public static final String $pr_sts_typ = "pr_sts_typ";
	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public static final String $pr_sts_typ_nm = "pr_sts_typ_nm";
	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public static final String $ship_schd_dt = "ship_schd_dt";
	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public static final String $ship_schd_hm = "ship_schd_hm";
	/**
	 * Replied delivery date 回答納入日.<p>
	 *
	 */
	public static final String $prms_dlv_dt = "prms_dlv_dt";
	/**
	 * Replied delivery time 回答納入時刻.<p>
	 *
	 */
	public static final String $prms_dlv_hm = "prms_dlv_hm";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_no = "cst_po_no";
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public static final String $dlv_id_typ = "dlv_id_typ";
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public static final String $dlv_id_typ_nm = "dlv_id_typ_nm";
	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public static final String $dlv_id_cd = "dlv_id_cd";
	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public static final String $dlv_id_nm = "dlv_id_nm";
	public static final String $sno_p = "sno_p";
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public static final String $rqst_dpt_cd = "rqst_dpt_cd";
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public static final String $rqst_dpt_nm = "rqst_dpt_nm";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	public static final String $base_unit_qty_p = "base_unit_qty_p";
	public static final String $alloc_qty_p = "alloc_qty_p";
	public static final String $wait_qty_p = "wait_qty_p";
	public static final String $cml_wait_qty_p = "cml_wait_qty_p";
	public static final String $alloc_avl_qty_p = "alloc_avl_qty_p";
	/**
	 * GI available date 出庫可能日.<p>
	 *
	 */
	public static final String $avl_schd_dt = "avl_schd_dt";
	public static final String $not_alloc_avail_qty_p = "not_alloc_avail_qty_p";
	public static final String $cml_not_alloc_avail_qty_p = "cml_not_alloc_avail_qty_p";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_d_rmrks = "intr_d_rmrks";
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $ship_pr_no = "ship_pr_no";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public static final String $ship_pr_upd_cntr = "ship_pr_upd_cntr";
	/**
	 * Delivery rack/line cd. 納品棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $dlv_str_ln_cd = "dlv_str_ln_cd";
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public static final String $alloc_scope_typ = "alloc_scope_typ";
	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_cd = "ship_fr_lg_grp_cd";
	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_to_lg_grp_cd = "ship_to_lg_grp_cd";
	/**
	 * Allocation shipping distribution group cd. 引当出荷物流グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_ship_lg_grp_cd = "alloc_ship_lg_grp_cd";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public static final String $ship_schd_tm = "ship_schd_tm";
	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public static final String $dlv_schd_tm = "dlv_schd_tm";
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public static final String $not_lot_mix_flg = "not_lot_mix_flg";
	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public static final String $not_sublot_mix_flg = "not_sublot_mix_flg";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $trd_unit_rnd_typ = "trd_unit_rnd_typ";
	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public static final String $pack_flg = "pack_flg";
	/**
	 * SKU allocation 荷姿引当.<p>
	 *
	 */
	public static final String $pack_alloc_flg = "pack_alloc_flg";
	/**
	 * Expiration date (Lower limit) 有効期限（下限）.<p>
	 *
	 */
	public static final String $valid_dt_fr = "valid_dt_fr";
	/**
	 * Expiration date (Lower limit) copy group 有効期限（下限）継承グループ.<p>
	 *
	 */
	public static final String $valid_dt_fr_grp = "valid_dt_fr_grp";
	/**
	 * Expiration date (Upper limit) 有効期限（上限）.<p>
	 *
	 */
	public static final String $valid_dt_to = "valid_dt_to";
	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public static final String $sls_cststk_flg = "sls_cststk_flg";
	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public static final String $sls_schd_dt = "sls_schd_dt";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $sno1_null_flg = $sno_p + ".sno1_null_flg";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2_null_flg = $sno_p + ".sno2_null_flg";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3_null_flg = $sno_p + ".sno3_null_flg";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4_null_flg = $sno_p + ".sno4_null_flg";
	public static final String $sno4 = $sno_p + ".sno4";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $alloc_qty = $alloc_qty_p + ".qty";
	public static final String $wait_qty = $wait_qty_p + ".qty";
	public static final String $cml_wait_qty = $cml_wait_qty_p + ".qty";
	public static final String $alloc_avl_qty = $alloc_avl_qty_p + ".qty";
	public static final String $not_alloc_avail_qty = $not_alloc_avail_qty_p + ".qty";
	public static final String $cml_not_alloc_avail_qty = $cml_not_alloc_avail_qty_p + ".qty";

	public static final MCMeta prms_delay_flg_META = createCommonMeta($prms_delay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta split_flg_META = createCommonMeta($split_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pre_alloc_prio_META = createCommonMeta($pre_alloc_prio, mcframe.commonMS.meta.MS_META.STK_ALLOC_PRIO);
	public static final MCMeta alloc_prio_META = createCommonMeta($alloc_prio, mcframe.commonMS.meta.MS_META.STK_ALLOC_PRIO);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta xfr_schd_no_META = createCommonMeta($xfr_schd_no, mcframe.commonMA.meta.MA_META.XFR_SCHD_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta ship_schd_no_META = createCommonMeta($ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta alloc_typ_META = createCommonMeta($alloc_typ, mcframe.commonMA.meta.MA_META.ALLOC_TYP);
	public static final MCMeta alloc_typ_nm_META = createCommonMeta($alloc_typ_nm, mcframe.commonMA.meta.MA_META.ALLOC_TYP_NM);
	public static final MCMeta pr_sts_typ_META = createCommonMeta($pr_sts_typ, mcframe.commonMS.meta.MS_META.PR_STS_TYP);
	public static final MCMeta pr_sts_typ_nm_META = createCommonMeta($pr_sts_typ_nm, mcframe.commonMS.meta.MS_META.PR_STS_TYP);
	public static final MCMeta ship_schd_dt_META = createCommonMeta($ship_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_schd_hm_META = createCommonMeta($ship_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta prms_dlv_dt_META = createCommonMeta($prms_dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prms_dlv_hm_META = createCommonMeta($prms_dlv_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta dlv_id_typ_META = createCommonMeta($dlv_id_typ, mcframe.commonMS.meta.MS_META.DLV_ID_TYP);
	public static final MCMeta dlv_id_typ_nm_META = createCommonMeta($dlv_id_typ_nm, mcframe.commonMS.meta.MS_META.DLV_ID_TYP_NM);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMAUB.MAUBP5070.SnoR.class);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta rqst_dpt_cd_META = createCommonMeta($rqst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_dpt_nm_META = createCommonMeta($rqst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta alloc_qty_p_META = createInnerRowMeta($alloc_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta wait_qty_p_META = createInnerRowMeta($wait_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta cml_wait_qty_p_META = createInnerRowMeta($cml_wait_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta alloc_avl_qty_p_META = createInnerRowMeta($alloc_avl_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta avl_schd_dt_META = createCommonMeta($avl_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta not_alloc_avail_qty_p_META = createInnerRowMeta($not_alloc_avail_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta cml_not_alloc_avail_qty_p_META = createInnerRowMeta($cml_not_alloc_avail_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.STK_XFR_ACT_INTR_RMRKS);
	public static final MCMeta intr_d_rmrks_META = createCommonMeta($intr_d_rmrks, mcframe.commonMS.meta.MS_META.STK_XFR_ACT_INTR_D_RMRKS);
	public static final MCMeta ship_pr_no_META = createCommonMeta($ship_pr_no, mcframe.commonMA.meta.MA_META.SHIP_PR_NO);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta ship_pr_upd_cntr_META = createCommonMeta($ship_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta dlv_str_ln_cd_META = createCommonMeta($dlv_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta alloc_scope_typ_META = createCommonMeta($alloc_scope_typ, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP);
	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_to_lg_grp_cd_META = createCommonMeta($ship_to_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta alloc_ship_lg_grp_cd_META = createCommonMeta($alloc_ship_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ship_schd_tm_META = createCommonMeta($ship_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_schd_tm_META = createCommonMeta($dlv_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta not_lot_mix_flg_META = createCommonMeta($not_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sublot_mix_flg_META = createCommonMeta($not_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_flg_META = createCommonMeta($pack_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pack_alloc_flg_META = createCommonMeta($pack_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta valid_dt_fr_META = createCommonMeta($valid_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta valid_dt_fr_grp_META = createCommonMeta($valid_dt_fr_grp, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta valid_dt_to_META = createCommonMeta($valid_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_cststk_flg_META = createCommonMeta($sls_cststk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_schd_dt_META = createCommonMeta($sls_schd_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<AllocDtlR> constMetas = new ConstMetaList<AllocDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			prms_delay_flg_META,
			split_flg_META,
			pre_alloc_prio_META,
			alloc_prio_META,
			itm_p_META,
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			slo_no_META,
			slo_d_no_META,
			xfr_schd_no_META,
			iv_no_META,
			ship_schd_no_META,
			alloc_typ_META,
			alloc_typ_nm_META,
			pr_sts_typ_META,
			pr_sts_typ_nm_META,
			ship_schd_dt_META,
			ship_schd_hm_META,
			prms_dlv_dt_META,
			prms_dlv_hm_META,
			cst_cd_META,
			cst_nm_META,
			cst_po_no_META,
			dlv_id_typ_META,
			dlv_id_typ_nm_META,
			dlv_id_cd_META,
			dlv_id_nm_META,
			sno_p_META,
			loc_cd_META,
			loc_nm_META,
			rqst_dpt_cd_META,
			rqst_dpt_nm_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_qty_p_META,
			alloc_qty_p_META,
			wait_qty_p_META,
			cml_wait_qty_p_META,
			alloc_avl_qty_p_META,
			avl_schd_dt_META,
			not_alloc_avail_qty_p_META,
			cml_not_alloc_avail_qty_p_META,
			intr_rmrks_META,
			intr_d_rmrks_META,
			ship_pr_no_META,
			upd_cntr_META,
			ship_pr_upd_cntr_META,
			dlv_str_ln_cd_META,
			str_ln_cd_META,
			alloc_grp_cd_META,
			alloc_scope_typ_META,
			ship_fr_lg_grp_cd_META,
			ship_to_lg_grp_cd_META,
			alloc_ship_lg_grp_cd_META,
			wg_cd_META,
			ship_schd_tm_META,
			dlv_schd_tm_META,
			ship_term_cd_META,
			ver_no_META,
			gd_cd_META,
			quality_typ_META,
			stk_id_typ_META,
			stk_bp_cd_META,
			trd_unit_cd_META,
			not_lot_mix_flg_META,
			not_sublot_mix_flg_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			pack_flg_META,
			pack_alloc_flg_META,
			valid_dt_fr_META,
			valid_dt_fr_grp_META,
			valid_dt_to_META,
			sls_cststk_flg_META,
			sls_schd_dt_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"sno1_null_flg",
				"sno1",
				"sno2_null_flg",
				"sno2",
				"sno3_null_flg",
				"sno3",
				"sno4_null_flg",
				"sno4",
				"base_unit_qty",
				"alloc_qty",
				"wait_qty",
				"cml_wait_qty",
				"alloc_avl_qty",
				"not_alloc_avail_qty",
				"cml_not_alloc_avail_qty"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$sno1_null_flg,
				$sno1,
				$sno2_null_flg,
				$sno2,
				$sno3_null_flg,
				$sno3,
				$sno4_null_flg,
				$sno4,
				$base_unit_qty,
				$alloc_qty,
				$wait_qty,
				$cml_wait_qty,
				$alloc_avl_qty,
				$not_alloc_avail_qty,
				$cml_not_alloc_avail_qty
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
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

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
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$ship_schd_hm, "TM"},	// ship_schd_hm
				{$prms_dlv_hm, "TM"}	// prms_dlv_hm
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
	protected AllocDtlR_MC_A(ConstMetaList<? extends AllocDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AllocDtlR clone() {
		return (AllocDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AllocDtlR createInstance() {
		return (AllocDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AllocDtlR getValues(String... names) {
		return (AllocDtlR) super.getValues(names);
	}



	/**
	 * Late delivery 納期遅延.<p>
	 *
	 */
	public boolean prms_delay_flg() {
		return getConstBoolean(offset + 0, $prms_delay_flg);
	}

	/**
	 * Late delivery 納期遅延.<p>
	 *
	 */
	public void prms_delay_flg(boolean value) {
		setConstBoolean(offset + 0, $prms_delay_flg, value);
	}


	/**
	 * GR split 入庫分割.<p>
	 *
	 */
	public boolean split_flg() {
		return getConstBoolean(offset + 1, $split_flg);
	}

	/**
	 * GR split 入庫分割.<p>
	 *
	 */
	public void split_flg(boolean value) {
		setConstBoolean(offset + 1, $split_flg, value);
	}


	/**
	 * Original order 元順.<p>
	 *
	 */
	public String pre_alloc_prio() {
		return getConstString(offset + 2, $pre_alloc_prio);
	}

	/**
	 * Original order 元順.<p>
	 *
	 */
	public void pre_alloc_prio(String value) {
		setConstString(offset + 2, $pre_alloc_prio, value);
	}


	/**
	 * Allocation sequence No. 引当順ＮＯ.<p>
	 *
	 */
	public String alloc_prio() {
		return getConstString(offset + 3, $alloc_prio);
	}

	/**
	 * Allocation sequence No. 引当順ＮＯ.<p>
	 *
	 */
	public void alloc_prio(String value) {
		setConstString(offset + 3, $alloc_prio, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 4, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 4, $itm_p, row);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 5, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 5, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 6, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 6, $trd_nm, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 7, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 7, $trd_ptn_typ, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 8, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 8, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 9, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 9, $slo_d_no, value);
	}


	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public String xfr_schd_no() {
		return getConstString(offset + 10, $xfr_schd_no);
	}

	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public void xfr_schd_no(String value) {
		setConstString(offset + 10, $xfr_schd_no, value);
	}


	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 11, $iv_no);
	}

	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 11, $iv_no, value);
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return getConstString(offset + 12, $ship_schd_no);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		setConstString(offset + 12, $ship_schd_no, value);
	}


	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public String alloc_typ() {
		return getConstString(offset + 13, $alloc_typ);
	}

	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public void alloc_typ(String value) {
		setConstString(offset + 13, $alloc_typ, value);
	}


	/**
	 * Allocation type name 引当区分名.<p>
	 *
	 */
	public String alloc_typ_nm() {
		return getConstString(offset + 14, $alloc_typ_nm);
	}

	/**
	 * Allocation type name 引当区分名.<p>
	 *
	 */
	public void alloc_typ_nm(String value) {
		setConstString(offset + 14, $alloc_typ_nm, value);
	}


	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public String pr_sts_typ() {
		return getConstString(offset + 15, $pr_sts_typ);
	}

	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public void pr_sts_typ(String value) {
		setConstString(offset + 15, $pr_sts_typ, value);
	}


	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public String pr_sts_typ_nm() {
		return getConstString(offset + 16, $pr_sts_typ_nm);
	}

	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public void pr_sts_typ_nm(String value) {
		setConstString(offset + 16, $pr_sts_typ_nm, value);
	}


	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public MCDate ship_schd_dt() {
		return getConstDate(offset + 17, $ship_schd_dt);
	}

	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public void ship_schd_dt(MCDate value) {
		setConstDate(offset + 17, $ship_schd_dt, value);
	}


	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public MCDate ship_schd_hm() {
		return getConstDate(offset + 18, $ship_schd_hm);
	}

	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public void ship_schd_hm(MCDate value) {
		setConstDate(offset + 18, $ship_schd_hm, value);
	}


	/**
	 * Replied delivery date 回答納入日.<p>
	 *
	 */
	public MCDate prms_dlv_dt() {
		return getConstDate(offset + 19, $prms_dlv_dt);
	}

	/**
	 * Replied delivery date 回答納入日.<p>
	 *
	 */
	public void prms_dlv_dt(MCDate value) {
		setConstDate(offset + 19, $prms_dlv_dt, value);
	}


	/**
	 * Replied delivery time 回答納入時刻.<p>
	 *
	 */
	public MCDate prms_dlv_hm() {
		return getConstDate(offset + 20, $prms_dlv_hm);
	}

	/**
	 * Replied delivery time 回答納入時刻.<p>
	 *
	 */
	public void prms_dlv_hm(MCDate value) {
		setConstDate(offset + 20, $prms_dlv_hm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 21, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 21, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 22, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 22, $cst_nm, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 23, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 23, $cst_po_no, value);
	}


	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public String dlv_id_typ() {
		return getConstString(offset + 24, $dlv_id_typ);
	}

	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		setConstString(offset + 24, $dlv_id_typ, value);
	}


	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public String dlv_id_typ_nm() {
		return getConstString(offset + 25, $dlv_id_typ_nm);
	}

	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public void dlv_id_typ_nm(String value) {
		setConstString(offset + 25, $dlv_id_typ_nm, value);
	}


	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 26, $dlv_id_cd);
	}

	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 26, $dlv_id_cd, value);
	}


	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 27, $dlv_id_nm);
	}

	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 27, $dlv_id_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5070.SnoR sno_p(){
		return (mcframe.clientMAUB.MAUBP5070.SnoR) getConstInnerRow(offset + 28, $sno_p);
	}
	
	public void sno_p(mcframe.clientMAUB.MAUBP5070.SnoR row){
		setConstInnerRow(offset + 28, $sno_p, row);
	}


	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 29, $loc_cd);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 29, $loc_cd, value);
	}


	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 30, $loc_nm);
	}

	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 30, $loc_nm, value);
	}


	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return getConstString(offset + 31, $rqst_dpt_cd);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		setConstString(offset + 31, $rqst_dpt_cd, value);
	}


	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public String rqst_dpt_nm() {
		return getConstString(offset + 32, $rqst_dpt_nm);
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public void rqst_dpt_nm(String value) {
		setConstString(offset + 32, $rqst_dpt_nm, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 33, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 33, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 34, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 34, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 35, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 35, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 35, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 35, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 35, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 35, $base_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 36, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 36, $base_unit_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR alloc_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 37, $alloc_qty_p);
	}
	
	public void alloc_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 37, $alloc_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR wait_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 38, $wait_qty_p);
	}
	
	public void wait_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 38, $wait_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR cml_wait_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 39, $cml_wait_qty_p);
	}
	
	public void cml_wait_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 39, $cml_wait_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR alloc_avl_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 40, $alloc_avl_qty_p);
	}
	
	public void alloc_avl_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 40, $alloc_avl_qty_p, row);
	}


	/**
	 * GI available date 出庫可能日.<p>
	 *
	 */
	public MCDate avl_schd_dt() {
		return getConstDate(offset + 41, $avl_schd_dt);
	}

	/**
	 * GI available date 出庫可能日.<p>
	 *
	 */
	public void avl_schd_dt(MCDate value) {
		setConstDate(offset + 41, $avl_schd_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR not_alloc_avail_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 42, $not_alloc_avail_qty_p);
	}
	
	public void not_alloc_avail_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 42, $not_alloc_avail_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR cml_not_alloc_avail_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 43, $cml_not_alloc_avail_qty_p);
	}
	
	public void cml_not_alloc_avail_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 43, $cml_not_alloc_avail_qty_p, row);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 44, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 44, $intr_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 45, $intr_d_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 45, $intr_d_rmrks, value);
	}


	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public String ship_pr_no() {
		return getConstString(offset + 46, $ship_pr_no);
	}

	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public void ship_pr_no(String value) {
		setConstString(offset + 46, $ship_pr_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 47, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}


	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public MCNumber ship_pr_upd_cntr() {
		return getConstNumber(offset + 48, $ship_pr_upd_cntr);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 48, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(int value) {
		setConstNumber(offset + 48, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(long value) {
		setConstNumber(offset + 48, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(float value) {
		setConstNumber(offset + 48, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(double value) {
		setConstNumber(offset + 48, $ship_pr_upd_cntr, value);
	}


	/**
	 * Delivery rack/line cd. 納品棚・ラインＣＤ.<p>
	 *
	 */
	public String dlv_str_ln_cd() {
		return getConstString(offset + 49, $dlv_str_ln_cd);
	}

	/**
	 * Delivery rack/line cd. 納品棚・ラインＣＤ.<p>
	 *
	 */
	public void dlv_str_ln_cd(String value) {
		setConstString(offset + 49, $dlv_str_ln_cd, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 50, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 50, $str_ln_cd, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 51, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 51, $alloc_grp_cd, value);
	}


	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public String alloc_scope_typ() {
		return getConstString(offset + 52, $alloc_scope_typ);
	}

	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public void alloc_scope_typ(String value) {
		setConstString(offset + 52, $alloc_scope_typ, value);
	}


	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 53, $ship_fr_lg_grp_cd);
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 53, $ship_fr_lg_grp_cd, value);
	}


	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public String ship_to_lg_grp_cd() {
		return getConstString(offset + 54, $ship_to_lg_grp_cd);
	}

	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public void ship_to_lg_grp_cd(String value) {
		setConstString(offset + 54, $ship_to_lg_grp_cd, value);
	}


	/**
	 * Allocation shipping distribution group cd. 引当出荷物流グループＣＤ.<p>
	 *
	 */
	public String alloc_ship_lg_grp_cd() {
		return getConstString(offset + 55, $alloc_ship_lg_grp_cd);
	}

	/**
	 * Allocation shipping distribution group cd. 引当出荷物流グループＣＤ.<p>
	 *
	 */
	public void alloc_ship_lg_grp_cd(String value) {
		setConstString(offset + 55, $alloc_ship_lg_grp_cd, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 56, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 56, $wg_cd, value);
	}


	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public MCDate ship_schd_tm() {
		return getConstDate(offset + 57, $ship_schd_tm);
	}

	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public void ship_schd_tm(MCDate value) {
		setConstDate(offset + 57, $ship_schd_tm, value);
	}


	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public MCDate dlv_schd_tm() {
		return getConstDate(offset + 58, $dlv_schd_tm);
	}

	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public void dlv_schd_tm(MCDate value) {
		setConstDate(offset + 58, $dlv_schd_tm, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 59, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 59, $ship_term_cd, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 60, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 60, $ver_no, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 61, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 61, $gd_cd, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 62, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 62, $quality_typ, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 63, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 63, $stk_id_typ, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 64, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 64, $stk_bp_cd, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 65, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 65, $trd_unit_cd, value);
	}


	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return getConstBoolean(offset + 66, $not_lot_mix_flg);
	}

	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 66, $not_lot_mix_flg, value);
	}


	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return getConstBoolean(offset + 67, $not_sublot_mix_flg);
	}

	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 67, $not_sublot_mix_flg, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 68, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 68, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 68, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 68, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 68, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 68, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 69, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 69, $trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 70, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 70, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 70, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 70, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 70, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 70, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 71, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 71, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 71, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 71, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 71, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 71, $trd_unit_conv_qty, value);
	}


	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public boolean pack_flg() {
		return getConstBoolean(offset + 72, $pack_flg);
	}

	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public void pack_flg(boolean value) {
		setConstBoolean(offset + 72, $pack_flg, value);
	}


	/**
	 * SKU allocation 荷姿引当.<p>
	 *
	 */
	public boolean pack_alloc_flg() {
		return getConstBoolean(offset + 73, $pack_alloc_flg);
	}

	/**
	 * SKU allocation 荷姿引当.<p>
	 *
	 */
	public void pack_alloc_flg(boolean value) {
		setConstBoolean(offset + 73, $pack_alloc_flg, value);
	}


	/**
	 * Expiration date (Lower limit) 有効期限（下限）.<p>
	 *
	 */
	public MCDate valid_dt_fr() {
		return getConstDate(offset + 74, $valid_dt_fr);
	}

	/**
	 * Expiration date (Lower limit) 有効期限（下限）.<p>
	 *
	 */
	public void valid_dt_fr(MCDate value) {
		setConstDate(offset + 74, $valid_dt_fr, value);
	}


	/**
	 * Expiration date (Lower limit) copy group 有効期限（下限）継承グループ.<p>
	 *
	 */
	public MCNumber valid_dt_fr_grp() {
		return getConstNumber(offset + 75, $valid_dt_fr_grp);
	}

	/**
	 * Expiration date (Lower limit) copy group 有効期限（下限）継承グループ.<p>
	 *
	 */
	public void valid_dt_fr_grp(MCNumber value) {
		setConstNumber(offset + 75, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date (Lower limit) copy group 有効期限（下限）継承グループ.<p>
	 *
	 */
	public void valid_dt_fr_grp(int value) {
		setConstNumber(offset + 75, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date (Lower limit) copy group 有効期限（下限）継承グループ.<p>
	 *
	 */
	public void valid_dt_fr_grp(long value) {
		setConstNumber(offset + 75, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date (Lower limit) copy group 有効期限（下限）継承グループ.<p>
	 *
	 */
	public void valid_dt_fr_grp(float value) {
		setConstNumber(offset + 75, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date (Lower limit) copy group 有効期限（下限）継承グループ.<p>
	 *
	 */
	public void valid_dt_fr_grp(double value) {
		setConstNumber(offset + 75, $valid_dt_fr_grp, value);
	}


	/**
	 * Expiration date (Upper limit) 有効期限（上限）.<p>
	 *
	 */
	public MCDate valid_dt_to() {
		return getConstDate(offset + 76, $valid_dt_to);
	}

	/**
	 * Expiration date (Upper limit) 有効期限（上限）.<p>
	 *
	 */
	public void valid_dt_to(MCDate value) {
		setConstDate(offset + 76, $valid_dt_to, value);
	}


	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public boolean sls_cststk_flg() {
		return getConstBoolean(offset + 77, $sls_cststk_flg);
	}

	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public void sls_cststk_flg(boolean value) {
		setConstBoolean(offset + 77, $sls_cststk_flg, value);
	}


	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public MCDate sls_schd_dt() {
		return getConstDate(offset + 78, $sls_schd_dt);
	}

	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public void sls_schd_dt(MCDate value) {
		setConstDate(offset + 78, $sls_schd_dt, value);
	}


	public String getString(String name) {
		if ($pre_alloc_prio.equalsIgnoreCase(name)) {
			return pre_alloc_prio();
		}
		if ($alloc_prio.equalsIgnoreCase(name)) {
			return alloc_prio();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			return alloc_typ();
		}
		if ($alloc_typ_nm.equalsIgnoreCase(name)) {
			return alloc_typ_nm();
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			return dlv_id_typ_nm();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_dpt_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($dlv_str_ln_cd.equalsIgnoreCase(name)) {
			return dlv_str_ln_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_to_lg_grp_cd();
		}
		if ($alloc_ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return alloc_ship_lg_grp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			return valid_dt_fr_grp();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ship_schd_dt.equalsIgnoreCase(name)) {
			return ship_schd_dt();
		}
		if ($ship_schd_hm.equalsIgnoreCase(name)) {
			return ship_schd_hm();
		}
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			return prms_dlv_dt();
		}
		if ($prms_dlv_hm.equalsIgnoreCase(name)) {
			return prms_dlv_hm();
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			return avl_schd_dt();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			return valid_dt_fr();
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			return valid_dt_to();
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			return sls_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($prms_delay_flg.equalsIgnoreCase(name)) {
			return prms_delay_flg();
		}
		if ($split_flg.equalsIgnoreCase(name)) {
			return split_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($pack_alloc_flg.equalsIgnoreCase(name)) {
			return pack_alloc_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($pre_alloc_prio.equalsIgnoreCase(name)) {
			return pre_alloc_prio();
		}
		if ($alloc_prio.equalsIgnoreCase(name)) {
			return alloc_prio();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			return alloc_typ();
		}
		if ($alloc_typ_nm.equalsIgnoreCase(name)) {
			return alloc_typ_nm();
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			return dlv_id_typ_nm();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_dpt_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($dlv_str_ln_cd.equalsIgnoreCase(name)) {
			return dlv_str_ln_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_to_lg_grp_cd();
		}
		if ($alloc_ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return alloc_ship_lg_grp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			return valid_dt_fr_grp();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ship_schd_dt.equalsIgnoreCase(name)) {
			return ship_schd_dt();
		}
		if ($ship_schd_hm.equalsIgnoreCase(name)) {
			return ship_schd_hm();
		}
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			return prms_dlv_dt();
		}
		if ($prms_dlv_hm.equalsIgnoreCase(name)) {
			return prms_dlv_hm();
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			return avl_schd_dt();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			return valid_dt_fr();
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			return valid_dt_to();
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			return sls_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($prms_delay_flg.equalsIgnoreCase(name)) {
			return prms_delay_flg();
		}
		if ($split_flg.equalsIgnoreCase(name)) {
			return split_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($pack_alloc_flg.equalsIgnoreCase(name)) {
			return pack_alloc_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($pre_alloc_prio.equalsIgnoreCase(name)) {
			pre_alloc_prio(value);
			return;
		}
		if ($alloc_prio.equalsIgnoreCase(name)) {
			alloc_prio(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			alloc_typ(value);
			return;
		}
		if ($alloc_typ_nm.equalsIgnoreCase(name)) {
			alloc_typ_nm(value);
			return;
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			pr_sts_typ_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			dlv_id_typ_nm(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
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
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			rqst_dpt_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($dlv_str_ln_cd.equalsIgnoreCase(name)) {
			dlv_str_ln_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_to_lg_grp_cd(value);
			return;
		}
		if ($alloc_ship_lg_grp_cd.equalsIgnoreCase(name)) {
			alloc_ship_lg_grp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ship_schd_dt.equalsIgnoreCase(name)) {
			ship_schd_dt(value);
			return;
		}
		if ($ship_schd_hm.equalsIgnoreCase(name)) {
			ship_schd_hm(value);
			return;
		}
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			prms_dlv_dt(value);
			return;
		}
		if ($prms_dlv_hm.equalsIgnoreCase(name)) {
			prms_dlv_hm(value);
			return;
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			avl_schd_dt(value);
			return;
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			valid_dt_fr(value);
			return;
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			valid_dt_to(value);
			return;
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			sls_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($prms_delay_flg.equalsIgnoreCase(name)) {
			prms_delay_flg(value);
			return;
		}
		if ($split_flg.equalsIgnoreCase(name)) {
			split_flg(value);
			return;
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			not_lot_mix_flg(value);
			return;
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			not_sublot_mix_flg(value);
			return;
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($pack_alloc_flg.equalsIgnoreCase(name)) {
			pack_alloc_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pre_alloc_prio.equalsIgnoreCase(name)) {
			pre_alloc_prio(value);
			return;
		}
		if ($alloc_prio.equalsIgnoreCase(name)) {
			alloc_prio(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			alloc_typ(value);
			return;
		}
		if ($alloc_typ_nm.equalsIgnoreCase(name)) {
			alloc_typ_nm(value);
			return;
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			pr_sts_typ_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			dlv_id_typ_nm(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
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
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			rqst_dpt_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($dlv_str_ln_cd.equalsIgnoreCase(name)) {
			dlv_str_ln_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_to_lg_grp_cd(value);
			return;
		}
		if ($alloc_ship_lg_grp_cd.equalsIgnoreCase(name)) {
			alloc_ship_lg_grp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ship_schd_dt.equalsIgnoreCase(name)) {
			ship_schd_dt(value);
			return;
		}
		if ($ship_schd_hm.equalsIgnoreCase(name)) {
			ship_schd_hm(value);
			return;
		}
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			prms_dlv_dt(value);
			return;
		}
		if ($prms_dlv_hm.equalsIgnoreCase(name)) {
			prms_dlv_hm(value);
			return;
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			avl_schd_dt(value);
			return;
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			valid_dt_fr(value);
			return;
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			valid_dt_to(value);
			return;
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			sls_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($prms_delay_flg.equalsIgnoreCase(name)) {
			prms_delay_flg(value);
			return;
		}
		if ($split_flg.equalsIgnoreCase(name)) {
			split_flg(value);
			return;
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			not_lot_mix_flg(value);
			return;
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			not_sublot_mix_flg(value);
			return;
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($pack_alloc_flg.equalsIgnoreCase(name)) {
			pack_alloc_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($alloc_qty_p.equalsIgnoreCase(name)) {
			return alloc_qty_p();
		}
		if ($wait_qty_p.equalsIgnoreCase(name)) {
			return wait_qty_p();
		}
		if ($cml_wait_qty_p.equalsIgnoreCase(name)) {
			return cml_wait_qty_p();
		}
		if ($alloc_avl_qty_p.equalsIgnoreCase(name)) {
			return alloc_avl_qty_p();
		}
		if ($not_alloc_avail_qty_p.equalsIgnoreCase(name)) {
			return not_alloc_avail_qty_p();
		}
		if ($cml_not_alloc_avail_qty_p.equalsIgnoreCase(name)) {
			return cml_not_alloc_avail_qty_p();
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
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5070.SnoR.class, value)
			);
			return;
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			base_unit_qty_p(
				((MCContainerMeta) base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($alloc_qty_p.equalsIgnoreCase(name)) {
			alloc_qty_p(
				((MCContainerMeta) alloc_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($wait_qty_p.equalsIgnoreCase(name)) {
			wait_qty_p(
				((MCContainerMeta) wait_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($cml_wait_qty_p.equalsIgnoreCase(name)) {
			cml_wait_qty_p(
				((MCContainerMeta) cml_wait_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($alloc_avl_qty_p.equalsIgnoreCase(name)) {
			alloc_avl_qty_p(
				((MCContainerMeta) alloc_avl_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($not_alloc_avail_qty_p.equalsIgnoreCase(name)) {
			not_alloc_avail_qty_p(
				((MCContainerMeta) not_alloc_avail_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($cml_not_alloc_avail_qty_p.equalsIgnoreCase(name)) {
			cml_not_alloc_avail_qty_p(
				((MCContainerMeta) cml_not_alloc_avail_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
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

	public boolean sno1_null_flg() {
		return sno_p().sno1_null_flg();
	}

	public void sno1_null_flg(boolean value) {
		sno_p().sno1_null_flg(value);
	}

	public String sno1() {
		return sno_p().sno1();
	}

	public void sno1(String value) {
		sno_p().sno1(value);
	}

	public boolean sno2_null_flg() {
		return sno_p().sno2_null_flg();
	}

	public void sno2_null_flg(boolean value) {
		sno_p().sno2_null_flg(value);
	}

	public String sno2() {
		return sno_p().sno2();
	}

	public void sno2(String value) {
		sno_p().sno2(value);
	}

	public boolean sno3_null_flg() {
		return sno_p().sno3_null_flg();
	}

	public void sno3_null_flg(boolean value) {
		sno_p().sno3_null_flg(value);
	}

	public String sno3() {
		return sno_p().sno3();
	}

	public void sno3(String value) {
		sno_p().sno3(value);
	}

	public boolean sno4_null_flg() {
		return sno_p().sno4_null_flg();
	}

	public void sno4_null_flg(boolean value) {
		sno_p().sno4_null_flg(value);
	}

	public String sno4() {
		return sno_p().sno4();
	}

	public void sno4(String value) {
		sno_p().sno4(value);
	}

	/**
	 * GI scheduled qty. 出庫予定数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return base_unit_qty_p().qty();
	}

	/**
	 * GI scheduled qty. 出庫予定数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * GI scheduled qty. 出庫予定数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * GI scheduled qty. 出庫予定数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * GI scheduled qty. 出庫予定数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * GI scheduled qty. 出庫予定数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Allocated qty. 引当済数量.<p>
	 *
	 */
	public MCNumber alloc_qty() {
		return alloc_qty_p().qty();
	}

	/**
	 * Allocated qty. 引当済数量.<p>
	 *
	 */
	public void alloc_qty(MCNumber value) {
		alloc_qty_p().qty(value);
	}

	/**
	 * Allocated qty. 引当済数量.<p>
	 *
	 */
	public void alloc_qty(int value) {
		alloc_qty_p().qty(value);
	}

	/**
	 * Allocated qty. 引当済数量.<p>
	 *
	 */
	public void alloc_qty(long value) {
		alloc_qty_p().qty(value);
	}

	/**
	 * Allocated qty. 引当済数量.<p>
	 *
	 */
	public void alloc_qty(float value) {
		alloc_qty_p().qty(value);
	}

	/**
	 * Allocated qty. 引当済数量.<p>
	 *
	 */
	public void alloc_qty(double value) {
		alloc_qty_p().qty(value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public MCNumber wait_qty() {
		return wait_qty_p().qty();
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(MCNumber value) {
		wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(int value) {
		wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(long value) {
		wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(float value) {
		wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(double value) {
		wait_qty_p().qty(value);
	}

	/**
	 * Total pending qty. 保留数量累計.<p>
	 *
	 */
	public MCNumber cml_wait_qty() {
		return cml_wait_qty_p().qty();
	}

	/**
	 * Total pending qty. 保留数量累計.<p>
	 *
	 */
	public void cml_wait_qty(MCNumber value) {
		cml_wait_qty_p().qty(value);
	}

	/**
	 * Total pending qty. 保留数量累計.<p>
	 *
	 */
	public void cml_wait_qty(int value) {
		cml_wait_qty_p().qty(value);
	}

	/**
	 * Total pending qty. 保留数量累計.<p>
	 *
	 */
	public void cml_wait_qty(long value) {
		cml_wait_qty_p().qty(value);
	}

	/**
	 * Total pending qty. 保留数量累計.<p>
	 *
	 */
	public void cml_wait_qty(float value) {
		cml_wait_qty_p().qty(value);
	}

	/**
	 * Total pending qty. 保留数量累計.<p>
	 *
	 */
	public void cml_wait_qty(double value) {
		cml_wait_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public MCNumber alloc_avl_qty() {
		return alloc_avl_qty_p().qty();
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void alloc_avl_qty(MCNumber value) {
		alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void alloc_avl_qty(int value) {
		alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void alloc_avl_qty(long value) {
		alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void alloc_avl_qty(float value) {
		alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void alloc_avl_qty(double value) {
		alloc_avl_qty_p().qty(value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public MCNumber not_alloc_avail_qty() {
		return not_alloc_avail_qty_p().qty();
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void not_alloc_avail_qty(MCNumber value) {
		not_alloc_avail_qty_p().qty(value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void not_alloc_avail_qty(int value) {
		not_alloc_avail_qty_p().qty(value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void not_alloc_avail_qty(long value) {
		not_alloc_avail_qty_p().qty(value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void not_alloc_avail_qty(float value) {
		not_alloc_avail_qty_p().qty(value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void not_alloc_avail_qty(double value) {
		not_alloc_avail_qty_p().qty(value);
	}

	/**
	 * Total insufficient qty. 不足数量累計.<p>
	 *
	 */
	public MCNumber cml_not_alloc_avail_qty() {
		return cml_not_alloc_avail_qty_p().qty();
	}

	/**
	 * Total insufficient qty. 不足数量累計.<p>
	 *
	 */
	public void cml_not_alloc_avail_qty(MCNumber value) {
		cml_not_alloc_avail_qty_p().qty(value);
	}

	/**
	 * Total insufficient qty. 不足数量累計.<p>
	 *
	 */
	public void cml_not_alloc_avail_qty(int value) {
		cml_not_alloc_avail_qty_p().qty(value);
	}

	/**
	 * Total insufficient qty. 不足数量累計.<p>
	 *
	 */
	public void cml_not_alloc_avail_qty(long value) {
		cml_not_alloc_avail_qty_p().qty(value);
	}

	/**
	 * Total insufficient qty. 不足数量累計.<p>
	 *
	 */
	public void cml_not_alloc_avail_qty(float value) {
		cml_not_alloc_avail_qty_p().qty(value);
	}

	/**
	 * Total insufficient qty. 不足数量累計.<p>
	 *
	 */
	public void cml_not_alloc_avail_qty(double value) {
		cml_not_alloc_avail_qty_p().qty(value);
	}

}

