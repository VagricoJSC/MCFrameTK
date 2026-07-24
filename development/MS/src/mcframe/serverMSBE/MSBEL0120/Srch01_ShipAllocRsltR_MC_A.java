package mcframe.serverMSBE.MSBEL0120;

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
 * ブロック"Srch01_ShipAllocRslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_ShipAllocRsltR_MC_A extends MCConstRow {

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
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public static final String $ship_schd_no = "ship_schd_no";
	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public static final String $ship_alloc_sts_no = "ship_alloc_sts_no";
	/**
	 * Inventory/GR schedule 在庫・入庫予定.<p>
	 *
	 */
	public static final String $vstk_in_schd_flg = "vstk_in_schd_flg";
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
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public static final String $ship_loc_cd = "ship_loc_cd";
	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public static final String $ship_loc_nm = "ship_loc_nm";
	/**
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $ship_str_ln_cd = "ship_str_ln_cd";
	/**
	 * Shipping rack/line name 出荷棚・ライン名.<p>
	 *
	 */
	public static final String $ship_str_ln_nm = "ship_str_ln_nm";
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
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
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_cd = "ship_fr_lg_grp_cd";
	/**
	 * Shipping point distribution group name 出荷元物流グループ名.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_nm = "ship_fr_lg_grp_nm";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public static final String $alloc_grp_nm = "alloc_grp_nm";
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public static final String $stk_id_typ_nm = "stk_id_typ_nm";
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
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
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public static final String $pack_unit_nm = "pack_unit_nm";
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public static final String $pack_unit_dec_place = "pack_unit_dec_place";
	/**
	 * SKU denominator qty. 荷姿単位分母数量.<p>
	 *
	 */
	public static final String $pack_unit_conv_base_qty = "pack_unit_conv_base_qty";
	/**
	 * SKU conversion qty. 荷姿単位換算数量.<p>
	 *
	 */
	public static final String $pack_unit_conv_qty = "pack_unit_conv_qty";
	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public static final String $alloc_abl_qty = "alloc_abl_qty";
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
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	/**
	 * Base unit allocatable qty. 基準単位引当可能数量.<p>
	 *
	 */
	public static final String $alloc_abl_base_unit_qty = "alloc_abl_base_unit_qty";
	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public static final String $dlv_rqst_dt = "dlv_rqst_dt";
	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public static final String $dlv_rqst_hm = "dlv_rqst_hm";
	/**
	 * Desired shipping date 出荷希望日.<p>
	 *
	 */
	public static final String $ship_rqst_dt = "ship_rqst_dt";
	/**
	 * Desired shipping time 出荷希望時刻.<p>
	 *
	 */
	public static final String $ship_rqst_hm = "ship_rqst_hm";
	/**
	 * Delivery request date 納品依頼日.<p>
	 *
	 */
	public static final String $pd_inst_dlv_dt = "pd_inst_dlv_dt";
	/**
	 * Delivery request time 納品依頼時刻.<p>
	 *
	 */
	public static final String $pd_inst_dlv_hm = "pd_inst_dlv_hm";
	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public static final String $dlv_inst_dt = "dlv_inst_dt";
	/**
	 * Delivery order time 納入指示時刻.<p>
	 *
	 */
	public static final String $dlv_inst_hm = "dlv_inst_hm";
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
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public static final String $dlv_schd_dt = "dlv_schd_dt";
	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public static final String $dlv_schd_hm = "dlv_schd_hm";
	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public static final String $rqst_usr_cd = "rqst_usr_cd";
	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public static final String $rqst_usr_nm = "rqst_usr_nm";
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
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public static final String $ship_to_id_typ = "ship_to_id_typ";
	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public static final String $ship_to_id_typ_nm = "ship_to_id_typ_nm";
	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public static final String $ship_to_id_cd = "ship_to_id_cd";
	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public static final String $ship_to_id_nm = "ship_to_id_nm";
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public static final String $alloc_scope_typ = "alloc_scope_typ";
	/**
	 * Allocation range type name 引当範囲区分名.<p>
	 *
	 */
	public static final String $alloc_scope_typ_nm = "alloc_scope_typ_nm";
	/**
	 * Prohibit mixed distribution G flg. 物流Ｇ混在不可ＦＬＧ.<p>
	 *
	 */
	public static final String $not_lg_mix_flg = "not_lg_mix_flg";
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $ship_pr_no = "ship_pr_no";
	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public static final String $ship_pr_upd_cntr = "ship_pr_upd_cntr";


	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta xfr_schd_no_META = createCommonMeta($xfr_schd_no, mcframe.commonMA.meta.MA_META.XFR_SCHD_NO);
	public static final MCMeta ship_schd_no_META = createCommonMeta($ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta ship_alloc_sts_no_META = createCommonMeta($ship_alloc_sts_no, mcframe.commonMA.meta.MA_META.SHIP_ALLOC_STS_NO);
	public static final MCMeta vstk_in_schd_flg_META = createCommonMeta($vstk_in_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ship_loc_cd_META = createCommonMeta($ship_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta ship_loc_nm_META = createCommonMeta($ship_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta ship_str_ln_cd_META = createCommonMeta($ship_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta ship_str_ln_nm_META = createCommonMeta($ship_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta not_lot_mix_flg_META = createCommonMeta($not_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sublot_mix_flg_META = createCommonMeta($not_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_fr_lg_grp_nm_META = createCommonMeta($ship_fr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pack_unit_dec_place_META = createCommonMeta($pack_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pack_unit_conv_base_qty_META = createCommonMeta($pack_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_conv_qty_META = createCommonMeta($pack_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alloc_abl_qty_META = createCommonMeta($alloc_abl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta alloc_abl_base_unit_qty_META = createCommonMeta($alloc_abl_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dlv_rqst_dt_META = createCommonMeta($dlv_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_rqst_hm_META = createCommonMeta($dlv_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta ship_rqst_dt_META = createCommonMeta($ship_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_rqst_hm_META = createCommonMeta($ship_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta pd_inst_dlv_dt_META = createCommonMeta($pd_inst_dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pd_inst_dlv_hm_META = createCommonMeta($pd_inst_dlv_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta dlv_inst_dt_META = createCommonMeta($dlv_inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_hm_META = createCommonMeta($dlv_inst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta ship_schd_dt_META = createCommonMeta($ship_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_schd_hm_META = createCommonMeta($ship_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta dlv_schd_dt_META = createCommonMeta($dlv_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_schd_hm_META = createCommonMeta($dlv_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta rqst_usr_cd_META = createCommonMeta($rqst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rqst_usr_nm_META = createCommonMeta($rqst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rqst_dpt_cd_META = createCommonMeta($rqst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_dpt_nm_META = createCommonMeta($rqst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ship_to_id_typ_META = createCommonMeta($ship_to_id_typ, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP);
	public static final MCMeta ship_to_id_typ_nm_META = createCommonMeta($ship_to_id_typ_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP_NM);
	public static final MCMeta ship_to_id_cd_META = createCommonMeta($ship_to_id_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta ship_to_id_nm_META = createCommonMeta($ship_to_id_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_NM);
	public static final MCMeta alloc_scope_typ_META = createCommonMeta($alloc_scope_typ, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP);
	public static final MCMeta alloc_scope_typ_nm_META = createCommonMeta($alloc_scope_typ_nm, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP_NM);
	public static final MCMeta not_lg_mix_flg_META = createCommonMeta($not_lg_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_pr_no_META = createCommonMeta($ship_pr_no, mcframe.commonMA.meta.MA_META.SHIP_PR_NO);
	public static final MCMeta ship_pr_upd_cntr_META = createCommonMeta($ship_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Srch01_ShipAllocRsltR> constMetas = new ConstMetaList<Srch01_ShipAllocRsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			slo_no_META,
			slo_d_no_META,
			xfr_schd_no_META,
			ship_schd_no_META,
			ship_alloc_sts_no_META,
			vstk_in_schd_flg_META,
			cst_cd_META,
			cst_nm_META,
			ship_loc_cd_META,
			ship_loc_nm_META,
			ship_str_ln_cd_META,
			ship_str_ln_nm_META,
			lot_no_META,
			sublot_no_META,
			ver_no_META,
			not_lot_mix_flg_META,
			not_sublot_mix_flg_META,
			wg_cd_META,
			wg_nm_META,
			site_cd_META,
			site_nm_META,
			ship_fr_lg_grp_cd_META,
			ship_fr_lg_grp_nm_META,
			alloc_grp_cd_META,
			alloc_grp_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			pack_unit_cd_META,
			pack_unit_nm_META,
			pack_unit_dec_place_META,
			pack_unit_conv_base_qty_META,
			pack_unit_conv_qty_META,
			alloc_abl_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			alloc_abl_base_unit_qty_META,
			dlv_rqst_dt_META,
			dlv_rqst_hm_META,
			ship_rqst_dt_META,
			ship_rqst_hm_META,
			pd_inst_dlv_dt_META,
			pd_inst_dlv_hm_META,
			dlv_inst_dt_META,
			dlv_inst_hm_META,
			ship_schd_dt_META,
			ship_schd_hm_META,
			dlv_schd_dt_META,
			dlv_schd_hm_META,
			rqst_usr_cd_META,
			rqst_usr_nm_META,
			rqst_dpt_cd_META,
			rqst_dpt_nm_META,
			ship_to_id_typ_META,
			ship_to_id_typ_nm_META,
			ship_to_id_cd_META,
			ship_to_id_nm_META,
			alloc_scope_typ_META,
			alloc_scope_typ_nm_META,
			not_lg_mix_flg_META,
			ship_pr_no_META,
			ship_pr_upd_cntr_META
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
				{$stk_id_typ, "MSC_STK_ID_TYP"},	// stk_id_typ
				{$ship_to_id_typ, "MSC_SHIP_TO_ID_TYP"},	// ship_to_id_typ
				{$alloc_scope_typ, "MAC_ALLOC_SCOPE_TYP"}	// alloc_scope_typ
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
	protected Srch01_ShipAllocRsltR_MC_A(ConstMetaList<? extends Srch01_ShipAllocRsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_ShipAllocRsltR clone() {
		return (Srch01_ShipAllocRsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_ShipAllocRsltR createInstance() {
		return (Srch01_ShipAllocRsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_ShipAllocRsltR getValues(String... names) {
		return (Srch01_ShipAllocRsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 0, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 0, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 1, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 1, $slo_d_no, value);
	}


	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public String xfr_schd_no() {
		return getConstString(offset + 2, $xfr_schd_no);
	}

	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public void xfr_schd_no(String value) {
		setConstString(offset + 2, $xfr_schd_no, value);
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return getConstString(offset + 3, $ship_schd_no);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		setConstString(offset + 3, $ship_schd_no, value);
	}


	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public String ship_alloc_sts_no() {
		return getConstString(offset + 4, $ship_alloc_sts_no);
	}

	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public void ship_alloc_sts_no(String value) {
		setConstString(offset + 4, $ship_alloc_sts_no, value);
	}


	/**
	 * Inventory/GR schedule 在庫・入庫予定.<p>
	 *
	 */
	public boolean vstk_in_schd_flg() {
		return getConstBoolean(offset + 5, $vstk_in_schd_flg);
	}

	/**
	 * Inventory/GR schedule 在庫・入庫予定.<p>
	 *
	 */
	public void vstk_in_schd_flg(boolean value) {
		setConstBoolean(offset + 5, $vstk_in_schd_flg, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 6, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 6, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 7, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 7, $cst_nm, value);
	}


	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public String ship_loc_cd() {
		return getConstString(offset + 8, $ship_loc_cd);
	}

	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public void ship_loc_cd(String value) {
		setConstString(offset + 8, $ship_loc_cd, value);
	}


	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public String ship_loc_nm() {
		return getConstString(offset + 9, $ship_loc_nm);
	}

	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public void ship_loc_nm(String value) {
		setConstString(offset + 9, $ship_loc_nm, value);
	}


	/**
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public String ship_str_ln_cd() {
		return getConstString(offset + 10, $ship_str_ln_cd);
	}

	/**
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public void ship_str_ln_cd(String value) {
		setConstString(offset + 10, $ship_str_ln_cd, value);
	}


	/**
	 * Shipping rack/line name 出荷棚・ライン名.<p>
	 *
	 */
	public String ship_str_ln_nm() {
		return getConstString(offset + 11, $ship_str_ln_nm);
	}

	/**
	 * Shipping rack/line name 出荷棚・ライン名.<p>
	 *
	 */
	public void ship_str_ln_nm(String value) {
		setConstString(offset + 11, $ship_str_ln_nm, value);
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 14, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 14, $ver_no, value);
	}


	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return getConstBoolean(offset + 15, $not_lot_mix_flg);
	}

	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 15, $not_lot_mix_flg, value);
	}


	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return getConstBoolean(offset + 16, $not_sublot_mix_flg);
	}

	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 16, $not_sublot_mix_flg, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 17, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 17, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 18, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 18, $wg_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 19, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 19, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 20, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 20, $site_nm, value);
	}


	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 21, $ship_fr_lg_grp_cd);
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 21, $ship_fr_lg_grp_cd, value);
	}


	/**
	 * Shipping point distribution group name 出荷元物流グループ名.<p>
	 *
	 */
	public String ship_fr_lg_grp_nm() {
		return getConstString(offset + 22, $ship_fr_lg_grp_nm);
	}

	/**
	 * Shipping point distribution group name 出荷元物流グループ名.<p>
	 *
	 */
	public void ship_fr_lg_grp_nm(String value) {
		setConstString(offset + 22, $ship_fr_lg_grp_nm, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 23, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 23, $alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 24, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 24, $alloc_grp_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 25, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 25, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 26, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 26, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 27, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 27, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 28, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 28, $stk_bp_nm, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 29, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 29, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 30, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 30, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 31, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 31, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 32, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 32, $sno4, value);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 33, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 33, $pack_unit_cd, value);
	}


	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 34, $pack_unit_nm);
	}

	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 34, $pack_unit_nm, value);
	}


	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_unit_dec_place() {
		return getConstNumber(offset + 35, $pack_unit_dec_place);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 35, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(int value) {
		setConstNumber(offset + 35, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(long value) {
		setConstNumber(offset + 35, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(float value) {
		setConstNumber(offset + 35, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(double value) {
		setConstNumber(offset + 35, $pack_unit_dec_place, value);
	}


	/**
	 * SKU denominator qty. 荷姿単位分母数量.<p>
	 *
	 */
	public MCNumber pack_unit_conv_base_qty() {
		return getConstNumber(offset + 36, $pack_unit_conv_base_qty);
	}

	/**
	 * SKU denominator qty. 荷姿単位分母数量.<p>
	 *
	 */
	public void pack_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 36, $pack_unit_conv_base_qty, value);
	}

	/**
	 * SKU denominator qty. 荷姿単位分母数量.<p>
	 *
	 */
	public void pack_unit_conv_base_qty(int value) {
		setConstNumber(offset + 36, $pack_unit_conv_base_qty, value);
	}

	/**
	 * SKU denominator qty. 荷姿単位分母数量.<p>
	 *
	 */
	public void pack_unit_conv_base_qty(long value) {
		setConstNumber(offset + 36, $pack_unit_conv_base_qty, value);
	}

	/**
	 * SKU denominator qty. 荷姿単位分母数量.<p>
	 *
	 */
	public void pack_unit_conv_base_qty(float value) {
		setConstNumber(offset + 36, $pack_unit_conv_base_qty, value);
	}

	/**
	 * SKU denominator qty. 荷姿単位分母数量.<p>
	 *
	 */
	public void pack_unit_conv_base_qty(double value) {
		setConstNumber(offset + 36, $pack_unit_conv_base_qty, value);
	}


	/**
	 * SKU conversion qty. 荷姿単位換算数量.<p>
	 *
	 */
	public MCNumber pack_unit_conv_qty() {
		return getConstNumber(offset + 37, $pack_unit_conv_qty);
	}

	/**
	 * SKU conversion qty. 荷姿単位換算数量.<p>
	 *
	 */
	public void pack_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 37, $pack_unit_conv_qty, value);
	}

	/**
	 * SKU conversion qty. 荷姿単位換算数量.<p>
	 *
	 */
	public void pack_unit_conv_qty(int value) {
		setConstNumber(offset + 37, $pack_unit_conv_qty, value);
	}

	/**
	 * SKU conversion qty. 荷姿単位換算数量.<p>
	 *
	 */
	public void pack_unit_conv_qty(long value) {
		setConstNumber(offset + 37, $pack_unit_conv_qty, value);
	}

	/**
	 * SKU conversion qty. 荷姿単位換算数量.<p>
	 *
	 */
	public void pack_unit_conv_qty(float value) {
		setConstNumber(offset + 37, $pack_unit_conv_qty, value);
	}

	/**
	 * SKU conversion qty. 荷姿単位換算数量.<p>
	 *
	 */
	public void pack_unit_conv_qty(double value) {
		setConstNumber(offset + 37, $pack_unit_conv_qty, value);
	}


	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public MCNumber alloc_abl_qty() {
		return getConstNumber(offset + 38, $alloc_abl_qty);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void alloc_abl_qty(MCNumber value) {
		setConstNumber(offset + 38, $alloc_abl_qty, value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void alloc_abl_qty(int value) {
		setConstNumber(offset + 38, $alloc_abl_qty, value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void alloc_abl_qty(long value) {
		setConstNumber(offset + 38, $alloc_abl_qty, value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void alloc_abl_qty(float value) {
		setConstNumber(offset + 38, $alloc_abl_qty, value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void alloc_abl_qty(double value) {
		setConstNumber(offset + 38, $alloc_abl_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 39, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 39, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 40, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 40, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 41, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 41, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 41, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 41, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 41, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 41, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 42, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 42, $base_unit_rnd_typ, value);
	}


	/**
	 * Base unit allocatable qty. 基準単位引当可能数量.<p>
	 *
	 */
	public MCNumber alloc_abl_base_unit_qty() {
		return getConstNumber(offset + 43, $alloc_abl_base_unit_qty);
	}

	/**
	 * Base unit allocatable qty. 基準単位引当可能数量.<p>
	 *
	 */
	public void alloc_abl_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 43, $alloc_abl_base_unit_qty, value);
	}

	/**
	 * Base unit allocatable qty. 基準単位引当可能数量.<p>
	 *
	 */
	public void alloc_abl_base_unit_qty(int value) {
		setConstNumber(offset + 43, $alloc_abl_base_unit_qty, value);
	}

	/**
	 * Base unit allocatable qty. 基準単位引当可能数量.<p>
	 *
	 */
	public void alloc_abl_base_unit_qty(long value) {
		setConstNumber(offset + 43, $alloc_abl_base_unit_qty, value);
	}

	/**
	 * Base unit allocatable qty. 基準単位引当可能数量.<p>
	 *
	 */
	public void alloc_abl_base_unit_qty(float value) {
		setConstNumber(offset + 43, $alloc_abl_base_unit_qty, value);
	}

	/**
	 * Base unit allocatable qty. 基準単位引当可能数量.<p>
	 *
	 */
	public void alloc_abl_base_unit_qty(double value) {
		setConstNumber(offset + 43, $alloc_abl_base_unit_qty, value);
	}


	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return getConstDate(offset + 44, $dlv_rqst_dt);
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 44, $dlv_rqst_dt, value);
	}


	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCDate dlv_rqst_hm() {
		return getConstDate(offset + 45, $dlv_rqst_hm);
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public void dlv_rqst_hm(MCDate value) {
		setConstDate(offset + 45, $dlv_rqst_hm, value);
	}


	/**
	 * Desired shipping date 出荷希望日.<p>
	 *
	 */
	public MCDate ship_rqst_dt() {
		return getConstDate(offset + 46, $ship_rqst_dt);
	}

	/**
	 * Desired shipping date 出荷希望日.<p>
	 *
	 */
	public void ship_rqst_dt(MCDate value) {
		setConstDate(offset + 46, $ship_rqst_dt, value);
	}


	/**
	 * Desired shipping time 出荷希望時刻.<p>
	 *
	 */
	public MCDate ship_rqst_hm() {
		return getConstDate(offset + 47, $ship_rqst_hm);
	}

	/**
	 * Desired shipping time 出荷希望時刻.<p>
	 *
	 */
	public void ship_rqst_hm(MCDate value) {
		setConstDate(offset + 47, $ship_rqst_hm, value);
	}


	/**
	 * Delivery request date 納品依頼日.<p>
	 *
	 */
	public MCDate pd_inst_dlv_dt() {
		return getConstDate(offset + 48, $pd_inst_dlv_dt);
	}

	/**
	 * Delivery request date 納品依頼日.<p>
	 *
	 */
	public void pd_inst_dlv_dt(MCDate value) {
		setConstDate(offset + 48, $pd_inst_dlv_dt, value);
	}


	/**
	 * Delivery request time 納品依頼時刻.<p>
	 *
	 */
	public MCDate pd_inst_dlv_hm() {
		return getConstDate(offset + 49, $pd_inst_dlv_hm);
	}

	/**
	 * Delivery request time 納品依頼時刻.<p>
	 *
	 */
	public void pd_inst_dlv_hm(MCDate value) {
		setConstDate(offset + 49, $pd_inst_dlv_hm, value);
	}


	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public MCDate dlv_inst_dt() {
		return getConstDate(offset + 50, $dlv_inst_dt);
	}

	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public void dlv_inst_dt(MCDate value) {
		setConstDate(offset + 50, $dlv_inst_dt, value);
	}


	/**
	 * Delivery order time 納入指示時刻.<p>
	 *
	 */
	public MCDate dlv_inst_hm() {
		return getConstDate(offset + 51, $dlv_inst_hm);
	}

	/**
	 * Delivery order time 納入指示時刻.<p>
	 *
	 */
	public void dlv_inst_hm(MCDate value) {
		setConstDate(offset + 51, $dlv_inst_hm, value);
	}


	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public MCDate ship_schd_dt() {
		return getConstDate(offset + 52, $ship_schd_dt);
	}

	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public void ship_schd_dt(MCDate value) {
		setConstDate(offset + 52, $ship_schd_dt, value);
	}


	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public MCDate ship_schd_hm() {
		return getConstDate(offset + 53, $ship_schd_hm);
	}

	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public void ship_schd_hm(MCDate value) {
		setConstDate(offset + 53, $ship_schd_hm, value);
	}


	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public MCDate dlv_schd_dt() {
		return getConstDate(offset + 54, $dlv_schd_dt);
	}

	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public void dlv_schd_dt(MCDate value) {
		setConstDate(offset + 54, $dlv_schd_dt, value);
	}


	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public MCDate dlv_schd_hm() {
		return getConstDate(offset + 55, $dlv_schd_hm);
	}

	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public void dlv_schd_hm(MCDate value) {
		setConstDate(offset + 55, $dlv_schd_hm, value);
	}


	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_usr_cd() {
		return getConstString(offset + 56, $rqst_usr_cd);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		setConstString(offset + 56, $rqst_usr_cd, value);
	}


	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public String rqst_usr_nm() {
		return getConstString(offset + 57, $rqst_usr_nm);
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public void rqst_usr_nm(String value) {
		setConstString(offset + 57, $rqst_usr_nm, value);
	}


	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return getConstString(offset + 58, $rqst_dpt_cd);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		setConstString(offset + 58, $rqst_dpt_cd, value);
	}


	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public String rqst_dpt_nm() {
		return getConstString(offset + 59, $rqst_dpt_nm);
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public void rqst_dpt_nm(String value) {
		setConstString(offset + 59, $rqst_dpt_nm, value);
	}


	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public String ship_to_id_typ() {
		return getConstString(offset + 60, $ship_to_id_typ);
	}

	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public void ship_to_id_typ(String value) {
		setConstString(offset + 60, $ship_to_id_typ, value);
	}


	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public String ship_to_id_typ_nm() {
		return getConstString(offset + 61, $ship_to_id_typ_nm);
	}

	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public void ship_to_id_typ_nm(String value) {
		setConstString(offset + 61, $ship_to_id_typ_nm, value);
	}


	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public String ship_to_id_cd() {
		return getConstString(offset + 62, $ship_to_id_cd);
	}

	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		setConstString(offset + 62, $ship_to_id_cd, value);
	}


	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public String ship_to_id_nm() {
		return getConstString(offset + 63, $ship_to_id_nm);
	}

	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public void ship_to_id_nm(String value) {
		setConstString(offset + 63, $ship_to_id_nm, value);
	}


	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public String alloc_scope_typ() {
		return getConstString(offset + 64, $alloc_scope_typ);
	}

	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public void alloc_scope_typ(String value) {
		setConstString(offset + 64, $alloc_scope_typ, value);
	}


	/**
	 * Allocation range type name 引当範囲区分名.<p>
	 *
	 */
	public String alloc_scope_typ_nm() {
		return getConstString(offset + 65, $alloc_scope_typ_nm);
	}

	/**
	 * Allocation range type name 引当範囲区分名.<p>
	 *
	 */
	public void alloc_scope_typ_nm(String value) {
		setConstString(offset + 65, $alloc_scope_typ_nm, value);
	}


	/**
	 * Prohibit mixed distribution G flg. 物流Ｇ混在不可ＦＬＧ.<p>
	 *
	 */
	public boolean not_lg_mix_flg() {
		return getConstBoolean(offset + 66, $not_lg_mix_flg);
	}

	/**
	 * Prohibit mixed distribution G flg. 物流Ｇ混在不可ＦＬＧ.<p>
	 *
	 */
	public void not_lg_mix_flg(boolean value) {
		setConstBoolean(offset + 66, $not_lg_mix_flg, value);
	}


	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public String ship_pr_no() {
		return getConstString(offset + 67, $ship_pr_no);
	}

	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public void ship_pr_no(String value) {
		setConstString(offset + 67, $ship_pr_no, value);
	}


	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public MCNumber ship_pr_upd_cntr() {
		return getConstNumber(offset + 68, $ship_pr_upd_cntr);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 68, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(int value) {
		setConstNumber(offset + 68, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(long value) {
		setConstNumber(offset + 68, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(float value) {
		setConstNumber(offset + 68, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(double value) {
		setConstNumber(offset + 68, $ship_pr_upd_cntr, value);
	}


	public String getString(String name) {
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			return ship_alloc_sts_no();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			return ship_loc_cd();
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			return ship_loc_nm();
		}
		if ($ship_str_ln_cd.equalsIgnoreCase(name)) {
			return ship_str_ln_cd();
		}
		if ($ship_str_ln_nm.equalsIgnoreCase(name)) {
			return ship_str_ln_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			return rqst_usr_nm();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_dpt_nm();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_to_id_typ_nm();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($alloc_scope_typ_nm.equalsIgnoreCase(name)) {
			return alloc_scope_typ_nm();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($pack_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return pack_unit_conv_base_qty();
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			return pack_unit_conv_qty();
		}
		if ($alloc_abl_qty.equalsIgnoreCase(name)) {
			return alloc_abl_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($alloc_abl_base_unit_qty.equalsIgnoreCase(name)) {
			return alloc_abl_base_unit_qty();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			return dlv_rqst_hm();
		}
		if ($ship_rqst_dt.equalsIgnoreCase(name)) {
			return ship_rqst_dt();
		}
		if ($ship_rqst_hm.equalsIgnoreCase(name)) {
			return ship_rqst_hm();
		}
		if ($pd_inst_dlv_dt.equalsIgnoreCase(name)) {
			return pd_inst_dlv_dt();
		}
		if ($pd_inst_dlv_hm.equalsIgnoreCase(name)) {
			return pd_inst_dlv_hm();
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			return dlv_inst_dt();
		}
		if ($dlv_inst_hm.equalsIgnoreCase(name)) {
			return dlv_inst_hm();
		}
		if ($ship_schd_dt.equalsIgnoreCase(name)) {
			return ship_schd_dt();
		}
		if ($ship_schd_hm.equalsIgnoreCase(name)) {
			return ship_schd_hm();
		}
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			return dlv_schd_dt();
		}
		if ($dlv_schd_hm.equalsIgnoreCase(name)) {
			return dlv_schd_hm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($vstk_in_schd_flg.equalsIgnoreCase(name)) {
			return vstk_in_schd_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			return ship_alloc_sts_no();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			return ship_loc_cd();
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			return ship_loc_nm();
		}
		if ($ship_str_ln_cd.equalsIgnoreCase(name)) {
			return ship_str_ln_cd();
		}
		if ($ship_str_ln_nm.equalsIgnoreCase(name)) {
			return ship_str_ln_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			return rqst_usr_nm();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_dpt_nm();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_to_id_typ_nm();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($alloc_scope_typ_nm.equalsIgnoreCase(name)) {
			return alloc_scope_typ_nm();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($pack_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return pack_unit_conv_base_qty();
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			return pack_unit_conv_qty();
		}
		if ($alloc_abl_qty.equalsIgnoreCase(name)) {
			return alloc_abl_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($alloc_abl_base_unit_qty.equalsIgnoreCase(name)) {
			return alloc_abl_base_unit_qty();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			return dlv_rqst_hm();
		}
		if ($ship_rqst_dt.equalsIgnoreCase(name)) {
			return ship_rqst_dt();
		}
		if ($ship_rqst_hm.equalsIgnoreCase(name)) {
			return ship_rqst_hm();
		}
		if ($pd_inst_dlv_dt.equalsIgnoreCase(name)) {
			return pd_inst_dlv_dt();
		}
		if ($pd_inst_dlv_hm.equalsIgnoreCase(name)) {
			return pd_inst_dlv_hm();
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			return dlv_inst_dt();
		}
		if ($dlv_inst_hm.equalsIgnoreCase(name)) {
			return dlv_inst_hm();
		}
		if ($ship_schd_dt.equalsIgnoreCase(name)) {
			return ship_schd_dt();
		}
		if ($ship_schd_hm.equalsIgnoreCase(name)) {
			return ship_schd_hm();
		}
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			return dlv_schd_dt();
		}
		if ($dlv_schd_hm.equalsIgnoreCase(name)) {
			return dlv_schd_hm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($vstk_in_schd_flg.equalsIgnoreCase(name)) {
			return vstk_in_schd_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			ship_alloc_sts_no(value);
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
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			ship_loc_cd(value);
			return;
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			ship_loc_nm(value);
			return;
		}
		if ($ship_str_ln_cd.equalsIgnoreCase(name)) {
			ship_str_ln_cd(value);
			return;
		}
		if ($ship_str_ln_nm.equalsIgnoreCase(name)) {
			ship_str_ln_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
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
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			rqst_usr_cd(value);
			return;
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			rqst_usr_nm(value);
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
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			ship_to_id_typ_nm(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($alloc_scope_typ_nm.equalsIgnoreCase(name)) {
			alloc_scope_typ_nm(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_base_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
			return;
		}
		if ($alloc_abl_qty.equalsIgnoreCase(name)) {
			alloc_abl_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($alloc_abl_base_unit_qty.equalsIgnoreCase(name)) {
			alloc_abl_base_unit_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_base_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
			return;
		}
		if ($alloc_abl_qty.equalsIgnoreCase(name)) {
			alloc_abl_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($alloc_abl_base_unit_qty.equalsIgnoreCase(name)) {
			alloc_abl_base_unit_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_base_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
			return;
		}
		if ($alloc_abl_qty.equalsIgnoreCase(name)) {
			alloc_abl_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($alloc_abl_base_unit_qty.equalsIgnoreCase(name)) {
			alloc_abl_base_unit_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_base_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
			return;
		}
		if ($alloc_abl_qty.equalsIgnoreCase(name)) {
			alloc_abl_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($alloc_abl_base_unit_qty.equalsIgnoreCase(name)) {
			alloc_abl_base_unit_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_base_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
			return;
		}
		if ($alloc_abl_qty.equalsIgnoreCase(name)) {
			alloc_abl_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($alloc_abl_base_unit_qty.equalsIgnoreCase(name)) {
			alloc_abl_base_unit_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			dlv_rqst_hm(value);
			return;
		}
		if ($ship_rqst_dt.equalsIgnoreCase(name)) {
			ship_rqst_dt(value);
			return;
		}
		if ($ship_rqst_hm.equalsIgnoreCase(name)) {
			ship_rqst_hm(value);
			return;
		}
		if ($pd_inst_dlv_dt.equalsIgnoreCase(name)) {
			pd_inst_dlv_dt(value);
			return;
		}
		if ($pd_inst_dlv_hm.equalsIgnoreCase(name)) {
			pd_inst_dlv_hm(value);
			return;
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			dlv_inst_dt(value);
			return;
		}
		if ($dlv_inst_hm.equalsIgnoreCase(name)) {
			dlv_inst_hm(value);
			return;
		}
		if ($ship_schd_dt.equalsIgnoreCase(name)) {
			ship_schd_dt(value);
			return;
		}
		if ($ship_schd_hm.equalsIgnoreCase(name)) {
			ship_schd_hm(value);
			return;
		}
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			dlv_schd_dt(value);
			return;
		}
		if ($dlv_schd_hm.equalsIgnoreCase(name)) {
			dlv_schd_hm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($vstk_in_schd_flg.equalsIgnoreCase(name)) {
			vstk_in_schd_flg(value);
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
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			ship_alloc_sts_no(value);
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
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			ship_loc_cd(value);
			return;
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			ship_loc_nm(value);
			return;
		}
		if ($ship_str_ln_cd.equalsIgnoreCase(name)) {
			ship_str_ln_cd(value);
			return;
		}
		if ($ship_str_ln_nm.equalsIgnoreCase(name)) {
			ship_str_ln_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
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
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			rqst_usr_cd(value);
			return;
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			rqst_usr_nm(value);
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
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			ship_to_id_typ_nm(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($alloc_scope_typ_nm.equalsIgnoreCase(name)) {
			alloc_scope_typ_nm(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_base_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
			return;
		}
		if ($alloc_abl_qty.equalsIgnoreCase(name)) {
			alloc_abl_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($alloc_abl_base_unit_qty.equalsIgnoreCase(name)) {
			alloc_abl_base_unit_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_base_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
			return;
		}
		if ($alloc_abl_qty.equalsIgnoreCase(name)) {
			alloc_abl_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($alloc_abl_base_unit_qty.equalsIgnoreCase(name)) {
			alloc_abl_base_unit_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_base_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
			return;
		}
		if ($alloc_abl_qty.equalsIgnoreCase(name)) {
			alloc_abl_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($alloc_abl_base_unit_qty.equalsIgnoreCase(name)) {
			alloc_abl_base_unit_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_base_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
			return;
		}
		if ($alloc_abl_qty.equalsIgnoreCase(name)) {
			alloc_abl_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($alloc_abl_base_unit_qty.equalsIgnoreCase(name)) {
			alloc_abl_base_unit_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_base_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
			return;
		}
		if ($alloc_abl_qty.equalsIgnoreCase(name)) {
			alloc_abl_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($alloc_abl_base_unit_qty.equalsIgnoreCase(name)) {
			alloc_abl_base_unit_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			dlv_rqst_hm(value);
			return;
		}
		if ($ship_rqst_dt.equalsIgnoreCase(name)) {
			ship_rqst_dt(value);
			return;
		}
		if ($ship_rqst_hm.equalsIgnoreCase(name)) {
			ship_rqst_hm(value);
			return;
		}
		if ($pd_inst_dlv_dt.equalsIgnoreCase(name)) {
			pd_inst_dlv_dt(value);
			return;
		}
		if ($pd_inst_dlv_hm.equalsIgnoreCase(name)) {
			pd_inst_dlv_hm(value);
			return;
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			dlv_inst_dt(value);
			return;
		}
		if ($dlv_inst_hm.equalsIgnoreCase(name)) {
			dlv_inst_hm(value);
			return;
		}
		if ($ship_schd_dt.equalsIgnoreCase(name)) {
			ship_schd_dt(value);
			return;
		}
		if ($ship_schd_hm.equalsIgnoreCase(name)) {
			ship_schd_hm(value);
			return;
		}
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			dlv_schd_dt(value);
			return;
		}
		if ($dlv_schd_hm.equalsIgnoreCase(name)) {
			dlv_schd_hm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($vstk_in_schd_flg.equalsIgnoreCase(name)) {
			vstk_in_schd_flg(value);
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
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

