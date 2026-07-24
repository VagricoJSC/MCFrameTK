package mcframe.serverMSBE.MSBEL5500;

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
 * ブロック"ShipPr_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ShipPr_DtlR_MC_A extends MCConstRow {

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Data pegging branch number データ紐付け枝番.<p>
	 *
	 */
	public static final String $peg_seq = "peg_seq";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Shipping progress 出荷進捗.<p>
	 *
	 */
	public static final String $sp = "sp";
	/**
	 * Shipping schedule 出荷予定.<p>
	 *
	 */
	public static final String $ss = "ss";
	/**
	 * Expiration date copy G 有効期限継承Ｇ.<p>
	 *
	 */
	public static final String $valid_dt_fr_grp = "valid_dt_fr_grp";
	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public static final String $vmi_flg = "vmi_flg";
	/**
	 * Caller shipping order service 呼出元出荷指図サービス.<p>
	 *
	 */
	public static final String $is_src_ship_inst_flg = "is_src_ship_inst_flg";
	/**
	 * Update invoice shipping scheduled qty. インボイス出荷予定数量更新.<p>
	 *
	 */
	public static final String $iv_schd_qty_upd_flg = "iv_schd_qty_upd_flg";
	/**
	 * Change caller shipping schedule 呼出元出荷予定変更.<p>
	 *
	 */
	public static final String $is_src_ship_schd_flg = "is_src_ship_schd_flg";
	/**
	 * Caller sales order promising entry 呼出元販売納期調整登録.<p>
	 *
	 */
	public static final String $is_src_sls_dlv_dt_adjst_flg = "is_src_sls_dlv_dt_adjst_flg";
	public static final String $ship_term_cd_restore_flg = "ship_term_cd_restore_flg";
	public static final String $ship_wk_cd_restore_flg = "ship_wk_cd_restore_flg";
	/**
	 * Invoice check not required インボイスチェック不要.<p>
	 *
	 */
	public static final String $iv_chk_skip_flg = "iv_chk_skip_flg";
	/**
	 * Order qty. (Base unit) 指図数量（基準単位）.<p>
	 *
	 */
	public static final String $inst_qty = "inst_qty";
	/**
	 * Order unit cd. 指図単位ＣＤ.<p>
	 *
	 */
	public static final String $inst_unit_cd = "inst_unit_cd";
	/**
	 * Scheduled order shipping date and time 指図出荷予定日時.<p>
	 *
	 */
	public static final String $inst_ship_schd_tm = "inst_ship_schd_tm";
	/**
	 * Scheduled order delivery date and time 指図納品予定日時.<p>
	 *
	 */
	public static final String $inst_dlv_schd_tm = "inst_dlv_schd_tm";
	/**
	 * Split shipping schedule 出荷予定分割.<p>
	 *
	 */
	public static final String $ship_schd_split_flg = "ship_schd_split_flg";
	/**
	 * Shipping decision 出荷判定.<p>
	 *
	 */
	public static final String $ship_judge_flg = "ship_judge_flg";
	/**
	 * Update shipping schedule 出荷予定更新.<p>
	 *
	 */
	public static final String $upd02_flg = "upd02_flg";
	/**
	 * No credit update 与信更新無.<p>
	 *
	 */
	public static final String $cred_no_up_flg = "cred_no_up_flg";
	/**
	 * Order Entered 指図登録済.<p>
	 *
	 */
	public static final String $ship_inst_flg = "ship_inst_flg";
	/**
	 * Result entered 実績登録済.<p>
	 *
	 */
	public static final String $ship_act_flg = "ship_act_flg";
	/**
	 * Recalculate scheduled date 予定日再計算.<p>
	 *
	 */
	public static final String $dt_recalc_flg = "dt_recalc_flg";
	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public static final String $wms_flg = "wms_flg";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Cancel remaining qty. 残数打切.<p>
	 *
	 */
	public static final String $rem_abort_flg = "rem_abort_flg";

	public static final String $ship_pr_no = $sp + ".ship_pr_no";
	public static final String $trd_cd = $sp + ".trd_cd";
	public static final String $trd_ptn_typ = $sp + ".trd_ptn_typ";
	public static final String $slo_d_no = $sp + ".slo_d_no";
	public static final String $xfr_schd_no = $sp + ".xfr_schd_no";
	public static final String $rqst_dpt_cd = $sp + ".rqst_dpt_cd";
	public static final String $rqst_usr_cd = $sp + ".rqst_usr_cd";
	public static final String $cst_cd = $sp + ".cst_cd";
	public static final String $ship_rqst_tm = $sp + ".ship_rqst_tm";
	public static final String $dlv_rqst_tm = $sp + ".dlv_rqst_tm";
	public static final String $prms_dt = $sp + ".prms_dt";
	public static final String $prms_dlv_dt = $sp + ".prms_dlv_dt";
	public static final String $dlv_inst_rcpt_dt = $sp + ".dlv_inst_rcpt_dt";
	public static final String $dlv_inst_prms_dt = $sp + ".dlv_inst_prms_dt";
	public static final String $ship_to_lg_grp_cd = $sp + ".ship_to_lg_grp_cd";
	public static final String $dlv_id_typ = $sp + ".dlv_id_typ";
	public static final String $dlv_id_cd = $sp + ".dlv_id_cd";
	public static final String $dlv_id_nm = $sp + ".dlv_id_nm";
	public static final String $dlv_zip_cd = $sp + ".dlv_zip_cd";
	public static final String $dlv_addr1 = $sp + ".dlv_addr1";
	public static final String $dlv_addr2 = $sp + ".dlv_addr2";
	public static final String $dlv_addr3 = $sp + ".dlv_addr3";
	public static final String $dlv_addr4 = $sp + ".dlv_addr4";
	public static final String $dlv_cntct_dpt = $sp + ".dlv_cntct_dpt";
	public static final String $dlv_cntct_psn = $sp + ".dlv_cntct_psn";
	public static final String $dlv_tel = $sp + ".dlv_tel";
	public static final String $dlv_fax = $sp + ".dlv_fax";
	public static final String $dlv_sundry_flg = $sp + ".dlv_sundry_flg";
	public static final String $dlv_str_ln_cd = $sp + ".dlv_str_ln_cd";
	public static final String $ship_to_id_typ = $sp + ".ship_to_id_typ";
	public static final String $ship_to_id_cd = $sp + ".ship_to_id_cd";
	public static final String $ship_to_id_nm = $sp + ".ship_to_id_nm";
	public static final String $ship_to_zip_cd = $sp + ".ship_to_zip_cd";
	public static final String $ship_to_addr1 = $sp + ".ship_to_addr1";
	public static final String $ship_to_addr2 = $sp + ".ship_to_addr2";
	public static final String $ship_to_addr3 = $sp + ".ship_to_addr3";
	public static final String $ship_to_addr4 = $sp + ".ship_to_addr4";
	public static final String $ship_to_cntct_dpt = $sp + ".ship_to_cntct_dpt";
	public static final String $ship_to_cntct_psn = $sp + ".ship_to_cntct_psn";
	public static final String $ship_to_tel = $sp + ".ship_to_tel";
	public static final String $ship_to_fax = $sp + ".ship_to_fax";
	public static final String $ship_to_sundry_flg = $sp + ".ship_to_sundry_flg";
	public static final String $via_dlv_typ = $sp + ".via_dlv_typ";
	public static final String $trd_unit_qty = $sp + ".trd_unit_qty";
	public static final String $trd_unit_cd = $sp + ".trd_unit_cd";
	public static final String $base_unit_qty = $sp + ".base_unit_qty";
	public static final String $base_unit_cd = $sp + ".base_unit_cd";
	public static final String $prms_qty = $sp + ".prms_qty";
	public static final String $dlv_inst_rcpt_qty = $sp + ".dlv_inst_rcpt_qty";
	public static final String $dlv_inst_prms_qty = $sp + ".dlv_inst_prms_qty";
	public static final String $abort_flg = $sp + ".abort_flg";
	public static final String $rsn_cd = $sp + ".rsn_cd";
	public static final String $bd_dpt_cd = $sp + ".bd_dpt_cd";
	public static final String $ship_term_cd = $sp + ".ship_term_cd";
	public static final String $ship_inst_typ = $sp + ".ship_inst_typ";
	public static final String $purc_ddlv_flg = $sp + ".purc_ddlv_flg";
	public static final String $ship_schd_split_typ = $sp + ".ship_schd_split_typ";
	public static final String $alloc_scope_typ = $sp + ".alloc_scope_typ";
	public static final String $not_lg_mix_flg = $sp + ".not_lg_mix_flg";
	public static final String $alloc_typ = $sp + ".alloc_typ";
	public static final String $alloc_grp_cd = $sp + ".alloc_grp_cd";
	public static final String $ship_lg_grp_cd = $sp + ".ship_lg_grp_cd";
	public static final String $def_loc_cd = $sp + ".def_loc_cd";
	public static final String $loc_cd = $sp + ".loc_cd";
	public static final String $str_ln_cd = $sp + ".str_ln_cd";
	public static final String $period_block_flg = $sp + ".period_block_flg";
	public static final String $ship_cnt_rmrks = $sp + ".ship_cnt_rmrks";
	public static final String $io_schd_pr_no = $sp + ".io_schd_pr_no";
	public static final String $sub_char1 = $sp + ".sub_char1";
	public static final String $sub_char2 = $sp + ".sub_char2";
	public static final String $sub_char3 = $sp + ".sub_char3";
	public static final String $ship_schd_no = $ss + ".ship_schd_no";
	public static final String $ship_inst_d_no = $ss + ".ship_inst_d_no";
	public static final String $dlv_inst_rcpt_no = $ss + ".dlv_inst_rcpt_no";
	public static final String $slo_prms_no = $ss + ".slo_prms_no";
	public static final String $sls_act_d_no = $ss + ".sls_act_d_no";
	public static final String $ship_fr_lg_grp_cd = $ss + ".ship_fr_lg_grp_cd";
	public static final String $wg_cd = $ss + ".wg_cd";
	public static final String $ship_schd_tm = $ss + ".ship_schd_tm";
	public static final String $dlv_schd_tm = $ss + ".dlv_schd_tm";
	public static final String $ship_wk_cd = $ss + ".ship_wk_cd";
	public static final String $itm_cd = $ss + ".itm_cd";
	public static final String $itm_sub1 = $ss + ".itm_sub1";
	public static final String $itm_sub2 = $ss + ".itm_sub2";
	public static final String $itm_sub3 = $ss + ".itm_sub3";
	public static final String $itm_nm = $ss + ".itm_nm";
	public static final String $iv_itm_nm = $ss + ".iv_itm_nm";
	public static final String $sundry_itm_flg = $ss + ".sundry_itm_flg";
	public static final String $sno1 = $ss + ".sno1";
	public static final String $sno1_null_flg = $ss + ".sno1_null_flg";
	public static final String $sno2 = $ss + ".sno2";
	public static final String $sno2_null_flg = $ss + ".sno2_null_flg";
	public static final String $sno3 = $ss + ".sno3";
	public static final String $sno3_null_flg = $ss + ".sno3_null_flg";
	public static final String $sno4 = $ss + ".sno4";
	public static final String $sno4_null_flg = $ss + ".sno4_null_flg";
	public static final String $lot_no = $ss + ".lot_no";
	public static final String $sublot_no = $ss + ".sublot_no";
	public static final String $ver_no = $ss + ".ver_no";
	public static final String $stk_arrv_bp_cd = $ss + ".stk_arrv_bp_cd";
	public static final String $gd_cd = $ss + ".gd_cd";
	public static final String $quality_typ = $ss + ".quality_typ";
	public static final String $stk_id_typ = $ss + ".stk_id_typ";
	public static final String $stk_bp_cd = $ss + ".stk_bp_cd";
	public static final String $not_dt_calc_flg = $ss + ".not_dt_calc_flg";
	public static final String $ship_block_flg = $ss + ".ship_block_flg";
	public static final String $not_lot_mix_flg = $ss + ".not_lot_mix_flg";
	public static final String $not_sublot_mix_flg = $ss + ".not_sublot_mix_flg";
	public static final String $vld_dt_fr = $ss + ".vld_dt_fr";
	public static final String $vld_dt_to = $ss + ".vld_dt_to";
	public static final String $base_dlv_slip_no = $ss + ".base_dlv_slip_no";
	public static final String $base_prov_act_no = $ss + ".base_prov_act_no";
	public static final String $base_ac_dt = $ss + ".base_ac_dt";
	public static final String $intr_rmrks = $ss + ".intr_rmrks";
	public static final String $trd_rmrks = $ss + ".trd_rmrks";
	public static final String $trd_d_rmrks = $ss + ".trd_d_rmrks";
	public static final String $ship_schd_sub_char1 = $ss + ".sub_char1";
	public static final String $ship_schd_sub_char2 = $ss + ".sub_char2";
	public static final String $ship_schd_sub_char3 = $ss + ".sub_char3";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_seq_META = createCommonMeta($peg_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta sp_META = createInnerRowMeta($sp, mcframe.serverMS.dbc.MST_SHIP_PR_R.class);
	public static final MCMeta ss_META = createInnerRowMeta($ss, mcframe.serverMS.dbc.MST_SHIP_SCHD_R.class);
	public static final MCMeta valid_dt_fr_grp_META = createCommonMeta($valid_dt_fr_grp, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta vmi_flg_META = createCommonMeta($vmi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_ship_inst_flg_META = createCommonMeta($is_src_ship_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_schd_qty_upd_flg_META = createCommonMeta($iv_schd_qty_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_ship_schd_flg_META = createCommonMeta($is_src_ship_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_sls_dlv_dt_adjst_flg_META = createCommonMeta($is_src_sls_dlv_dt_adjst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_term_cd_restore_flg_META = createCommonMeta($ship_term_cd_restore_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_wk_cd_restore_flg_META = createCommonMeta($ship_wk_cd_restore_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_chk_skip_flg_META = createCommonMeta($iv_chk_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_qty_META = createCommonMeta($inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta inst_unit_cd_META = createCommonMeta($inst_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta inst_ship_schd_tm_META = createCommonMeta($inst_ship_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta inst_dlv_schd_tm_META = createCommonMeta($inst_dlv_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ship_schd_split_flg_META = createCommonMeta($ship_schd_split_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_judge_flg_META = createCommonMeta($ship_judge_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upd02_flg_META = createCommonMeta($upd02_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_no_up_flg_META = createCommonMeta($cred_no_up_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_inst_flg_META = createCommonMeta($ship_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_act_flg_META = createCommonMeta($ship_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dt_recalc_flg_META = createCommonMeta($dt_recalc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wms_flg_META = createCommonMeta($wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rem_abort_flg_META = createCommonMeta($rem_abort_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ShipPr_DtlR> constMetas = new ConstMetaList<ShipPr_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			peg_seq_META,
			data_crud_typ_META,
			sp_META,
			ss_META,
			valid_dt_fr_grp_META,
			vmi_flg_META,
			is_src_ship_inst_flg_META,
			iv_schd_qty_upd_flg_META,
			is_src_ship_schd_flg_META,
			is_src_sls_dlv_dt_adjst_flg_META,
			ship_term_cd_restore_flg_META,
			ship_wk_cd_restore_flg_META,
			iv_chk_skip_flg_META,
			inst_qty_META,
			inst_unit_cd_META,
			inst_ship_schd_tm_META,
			inst_dlv_schd_tm_META,
			ship_schd_split_flg_META,
			ship_judge_flg_META,
			upd02_flg_META,
			cred_no_up_flg_META,
			ship_inst_flg_META,
			ship_act_flg_META,
			dt_recalc_flg_META,
			wms_flg_META,
			err_flg_META,
			rem_abort_flg_META
		},
		new String[][]{
			{
				"ship_pr_no",
				"trd_cd",
				"trd_ptn_typ",
				"slo_d_no",
				"xfr_schd_no",
				"rqst_dpt_cd",
				"rqst_usr_cd",
				"cst_cd",
				"ship_rqst_tm",
				"dlv_rqst_tm",
				"prms_dt",
				"prms_dlv_dt",
				"dlv_inst_rcpt_dt",
				"dlv_inst_prms_dt",
				"ship_to_lg_grp_cd",
				"dlv_id_typ",
				"dlv_id_cd",
				"dlv_id_nm",
				"dlv_zip_cd",
				"dlv_addr1",
				"dlv_addr2",
				"dlv_addr3",
				"dlv_addr4",
				"dlv_cntct_dpt",
				"dlv_cntct_psn",
				"dlv_tel",
				"dlv_fax",
				"dlv_sundry_flg",
				"dlv_str_ln_cd",
				"ship_to_id_typ",
				"ship_to_id_cd",
				"ship_to_id_nm",
				"ship_to_zip_cd",
				"ship_to_addr1",
				"ship_to_addr2",
				"ship_to_addr3",
				"ship_to_addr4",
				"ship_to_cntct_dpt",
				"ship_to_cntct_psn",
				"ship_to_tel",
				"ship_to_fax",
				"ship_to_sundry_flg",
				"via_dlv_typ",
				"trd_unit_qty",
				"trd_unit_cd",
				"base_unit_qty",
				"base_unit_cd",
				"prms_qty",
				"dlv_inst_rcpt_qty",
				"dlv_inst_prms_qty",
				"abort_flg",
				"rsn_cd",
				"bd_dpt_cd",
				"ship_term_cd",
				"ship_inst_typ",
				"purc_ddlv_flg",
				"ship_schd_split_typ",
				"alloc_scope_typ",
				"not_lg_mix_flg",
				"alloc_typ",
				"alloc_grp_cd",
				"ship_lg_grp_cd",
				"def_loc_cd",
				"loc_cd",
				"str_ln_cd",
				"period_block_flg",
				"ship_cnt_rmrks",
				"io_schd_pr_no",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"ship_schd_no",
				"ship_inst_d_no",
				"dlv_inst_rcpt_no",
				"slo_prms_no",
				"sls_act_d_no",
				"ship_fr_lg_grp_cd",
				"wg_cd",
				"ship_schd_tm",
				"dlv_schd_tm",
				"ship_wk_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"iv_itm_nm",
				"sundry_itm_flg",
				"sno1",
				"sno1_null_flg",
				"sno2",
				"sno2_null_flg",
				"sno3",
				"sno3_null_flg",
				"sno4",
				"sno4_null_flg",
				"lot_no",
				"sublot_no",
				"ver_no",
				"stk_arrv_bp_cd",
				"gd_cd",
				"quality_typ",
				"stk_id_typ",
				"stk_bp_cd",
				"not_dt_calc_flg",
				"ship_block_flg",
				"not_lot_mix_flg",
				"not_sublot_mix_flg",
				"vld_dt_fr",
				"vld_dt_to",
				"base_dlv_slip_no",
				"base_prov_act_no",
				"base_ac_dt",
				"intr_rmrks",
				"trd_rmrks",
				"trd_d_rmrks",
				"ship_schd_sub_char1",
				"ship_schd_sub_char2",
				"ship_schd_sub_char3"
			},
			{
				$ship_pr_no,
				$trd_cd,
				$trd_ptn_typ,
				$slo_d_no,
				$xfr_schd_no,
				$rqst_dpt_cd,
				$rqst_usr_cd,
				$cst_cd,
				$ship_rqst_tm,
				$dlv_rqst_tm,
				$prms_dt,
				$prms_dlv_dt,
				$dlv_inst_rcpt_dt,
				$dlv_inst_prms_dt,
				$ship_to_lg_grp_cd,
				$dlv_id_typ,
				$dlv_id_cd,
				$dlv_id_nm,
				$dlv_zip_cd,
				$dlv_addr1,
				$dlv_addr2,
				$dlv_addr3,
				$dlv_addr4,
				$dlv_cntct_dpt,
				$dlv_cntct_psn,
				$dlv_tel,
				$dlv_fax,
				$dlv_sundry_flg,
				$dlv_str_ln_cd,
				$ship_to_id_typ,
				$ship_to_id_cd,
				$ship_to_id_nm,
				$ship_to_zip_cd,
				$ship_to_addr1,
				$ship_to_addr2,
				$ship_to_addr3,
				$ship_to_addr4,
				$ship_to_cntct_dpt,
				$ship_to_cntct_psn,
				$ship_to_tel,
				$ship_to_fax,
				$ship_to_sundry_flg,
				$via_dlv_typ,
				$trd_unit_qty,
				$trd_unit_cd,
				$base_unit_qty,
				$base_unit_cd,
				$prms_qty,
				$dlv_inst_rcpt_qty,
				$dlv_inst_prms_qty,
				$abort_flg,
				$rsn_cd,
				$bd_dpt_cd,
				$ship_term_cd,
				$ship_inst_typ,
				$purc_ddlv_flg,
				$ship_schd_split_typ,
				$alloc_scope_typ,
				$not_lg_mix_flg,
				$alloc_typ,
				$alloc_grp_cd,
				$ship_lg_grp_cd,
				$def_loc_cd,
				$loc_cd,
				$str_ln_cd,
				$period_block_flg,
				$ship_cnt_rmrks,
				$io_schd_pr_no,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$ship_schd_no,
				$ship_inst_d_no,
				$dlv_inst_rcpt_no,
				$slo_prms_no,
				$sls_act_d_no,
				$ship_fr_lg_grp_cd,
				$wg_cd,
				$ship_schd_tm,
				$dlv_schd_tm,
				$ship_wk_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$iv_itm_nm,
				$sundry_itm_flg,
				$sno1,
				$sno1_null_flg,
				$sno2,
				$sno2_null_flg,
				$sno3,
				$sno3_null_flg,
				$sno4,
				$sno4_null_flg,
				$lot_no,
				$sublot_no,
				$ver_no,
				$stk_arrv_bp_cd,
				$gd_cd,
				$quality_typ,
				$stk_id_typ,
				$stk_bp_cd,
				$not_dt_calc_flg,
				$ship_block_flg,
				$not_lot_mix_flg,
				$not_sublot_mix_flg,
				$vld_dt_fr,
				$vld_dt_to,
				$base_dlv_slip_no,
				$base_prov_act_no,
				$base_ac_dt,
				$intr_rmrks,
				$trd_rmrks,
				$trd_d_rmrks,
				$ship_schd_sub_char1,
				$ship_schd_sub_char2,
				$ship_schd_sub_char3
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected ShipPr_DtlR_MC_A(ConstMetaList<? extends ShipPr_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipPr_DtlR clone() {
		return (ShipPr_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipPr_DtlR createInstance() {
		return (ShipPr_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipPr_DtlR getValues(String... names) {
		return (ShipPr_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Data pegging branch number データ紐付け枝番.<p>
	 *
	 */
	public MCNumber peg_seq() {
		return getConstNumber(offset + 1, $peg_seq);
	}

	/**
	 * Data pegging branch number データ紐付け枝番.<p>
	 *
	 */
	public void peg_seq(MCNumber value) {
		setConstNumber(offset + 1, $peg_seq, value);
	}

	/**
	 * Data pegging branch number データ紐付け枝番.<p>
	 *
	 */
	public void peg_seq(int value) {
		setConstNumber(offset + 1, $peg_seq, value);
	}

	/**
	 * Data pegging branch number データ紐付け枝番.<p>
	 *
	 */
	public void peg_seq(long value) {
		setConstNumber(offset + 1, $peg_seq, value);
	}

	/**
	 * Data pegging branch number データ紐付け枝番.<p>
	 *
	 */
	public void peg_seq(float value) {
		setConstNumber(offset + 1, $peg_seq, value);
	}

	/**
	 * Data pegging branch number データ紐付け枝番.<p>
	 *
	 */
	public void peg_seq(double value) {
		setConstNumber(offset + 1, $peg_seq, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 2, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 2, $data_crud_typ, value);
	}


	/**
	 * Shipping progress 出荷進捗.<p>
	 *
	 */
	public mcframe.serverMS.dbc.MST_SHIP_PR_R sp(){
		return (mcframe.serverMS.dbc.MST_SHIP_PR_R) getConstInnerRow(offset + 3, $sp);
	}
	
	/**
	 * Shipping progress 出荷進捗.<p>
	 *
	 */
	public void sp(mcframe.serverMS.dbc.MST_SHIP_PR_R row){
		setConstInnerRow(offset + 3, $sp, row);
	}


	/**
	 * Shipping schedule 出荷予定.<p>
	 *
	 */
	public mcframe.serverMS.dbc.MST_SHIP_SCHD_R ss(){
		return (mcframe.serverMS.dbc.MST_SHIP_SCHD_R) getConstInnerRow(offset + 4, $ss);
	}
	
	/**
	 * Shipping schedule 出荷予定.<p>
	 *
	 */
	public void ss(mcframe.serverMS.dbc.MST_SHIP_SCHD_R row){
		setConstInnerRow(offset + 4, $ss, row);
	}


	/**
	 * Expiration date copy G 有効期限継承Ｇ.<p>
	 *
	 */
	public MCNumber valid_dt_fr_grp() {
		return getConstNumber(offset + 5, $valid_dt_fr_grp);
	}

	/**
	 * Expiration date copy G 有効期限継承Ｇ.<p>
	 *
	 */
	public void valid_dt_fr_grp(MCNumber value) {
		setConstNumber(offset + 5, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date copy G 有効期限継承Ｇ.<p>
	 *
	 */
	public void valid_dt_fr_grp(int value) {
		setConstNumber(offset + 5, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date copy G 有効期限継承Ｇ.<p>
	 *
	 */
	public void valid_dt_fr_grp(long value) {
		setConstNumber(offset + 5, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date copy G 有効期限継承Ｇ.<p>
	 *
	 */
	public void valid_dt_fr_grp(float value) {
		setConstNumber(offset + 5, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date copy G 有効期限継承Ｇ.<p>
	 *
	 */
	public void valid_dt_fr_grp(double value) {
		setConstNumber(offset + 5, $valid_dt_fr_grp, value);
	}


	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public boolean vmi_flg() {
		return getConstBoolean(offset + 6, $vmi_flg);
	}

	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public void vmi_flg(boolean value) {
		setConstBoolean(offset + 6, $vmi_flg, value);
	}


	/**
	 * Caller shipping order service 呼出元出荷指図サービス.<p>
	 *
	 */
	public boolean is_src_ship_inst_flg() {
		return getConstBoolean(offset + 7, $is_src_ship_inst_flg);
	}

	/**
	 * Caller shipping order service 呼出元出荷指図サービス.<p>
	 *
	 */
	public void is_src_ship_inst_flg(boolean value) {
		setConstBoolean(offset + 7, $is_src_ship_inst_flg, value);
	}


	/**
	 * Update invoice shipping scheduled qty. インボイス出荷予定数量更新.<p>
	 *
	 */
	public boolean iv_schd_qty_upd_flg() {
		return getConstBoolean(offset + 8, $iv_schd_qty_upd_flg);
	}

	/**
	 * Update invoice shipping scheduled qty. インボイス出荷予定数量更新.<p>
	 *
	 */
	public void iv_schd_qty_upd_flg(boolean value) {
		setConstBoolean(offset + 8, $iv_schd_qty_upd_flg, value);
	}


	/**
	 * Change caller shipping schedule 呼出元出荷予定変更.<p>
	 *
	 */
	public boolean is_src_ship_schd_flg() {
		return getConstBoolean(offset + 9, $is_src_ship_schd_flg);
	}

	/**
	 * Change caller shipping schedule 呼出元出荷予定変更.<p>
	 *
	 */
	public void is_src_ship_schd_flg(boolean value) {
		setConstBoolean(offset + 9, $is_src_ship_schd_flg, value);
	}


	/**
	 * Caller sales order promising entry 呼出元販売納期調整登録.<p>
	 *
	 */
	public boolean is_src_sls_dlv_dt_adjst_flg() {
		return getConstBoolean(offset + 10, $is_src_sls_dlv_dt_adjst_flg);
	}

	/**
	 * Caller sales order promising entry 呼出元販売納期調整登録.<p>
	 *
	 */
	public void is_src_sls_dlv_dt_adjst_flg(boolean value) {
		setConstBoolean(offset + 10, $is_src_sls_dlv_dt_adjst_flg, value);
	}


	public boolean ship_term_cd_restore_flg() {
		return getConstBoolean(offset + 11, $ship_term_cd_restore_flg);
	}

	public void ship_term_cd_restore_flg(boolean value) {
		setConstBoolean(offset + 11, $ship_term_cd_restore_flg, value);
	}


	public boolean ship_wk_cd_restore_flg() {
		return getConstBoolean(offset + 12, $ship_wk_cd_restore_flg);
	}

	public void ship_wk_cd_restore_flg(boolean value) {
		setConstBoolean(offset + 12, $ship_wk_cd_restore_flg, value);
	}


	/**
	 * Invoice check not required インボイスチェック不要.<p>
	 *
	 */
	public boolean iv_chk_skip_flg() {
		return getConstBoolean(offset + 13, $iv_chk_skip_flg);
	}

	/**
	 * Invoice check not required インボイスチェック不要.<p>
	 *
	 */
	public void iv_chk_skip_flg(boolean value) {
		setConstBoolean(offset + 13, $iv_chk_skip_flg, value);
	}


	/**
	 * Order qty. (Base unit) 指図数量（基準単位）.<p>
	 *
	 */
	public MCNumber inst_qty() {
		return getConstNumber(offset + 14, $inst_qty);
	}

	/**
	 * Order qty. (Base unit) 指図数量（基準単位）.<p>
	 *
	 */
	public void inst_qty(MCNumber value) {
		setConstNumber(offset + 14, $inst_qty, value);
	}

	/**
	 * Order qty. (Base unit) 指図数量（基準単位）.<p>
	 *
	 */
	public void inst_qty(int value) {
		setConstNumber(offset + 14, $inst_qty, value);
	}

	/**
	 * Order qty. (Base unit) 指図数量（基準単位）.<p>
	 *
	 */
	public void inst_qty(long value) {
		setConstNumber(offset + 14, $inst_qty, value);
	}

	/**
	 * Order qty. (Base unit) 指図数量（基準単位）.<p>
	 *
	 */
	public void inst_qty(float value) {
		setConstNumber(offset + 14, $inst_qty, value);
	}

	/**
	 * Order qty. (Base unit) 指図数量（基準単位）.<p>
	 *
	 */
	public void inst_qty(double value) {
		setConstNumber(offset + 14, $inst_qty, value);
	}


	/**
	 * Order unit cd. 指図単位ＣＤ.<p>
	 *
	 */
	public String inst_unit_cd() {
		return getConstString(offset + 15, $inst_unit_cd);
	}

	/**
	 * Order unit cd. 指図単位ＣＤ.<p>
	 *
	 */
	public void inst_unit_cd(String value) {
		setConstString(offset + 15, $inst_unit_cd, value);
	}


	/**
	 * Scheduled order shipping date and time 指図出荷予定日時.<p>
	 *
	 */
	public MCDate inst_ship_schd_tm() {
		return getConstDate(offset + 16, $inst_ship_schd_tm);
	}

	/**
	 * Scheduled order shipping date and time 指図出荷予定日時.<p>
	 *
	 */
	public void inst_ship_schd_tm(MCDate value) {
		setConstDate(offset + 16, $inst_ship_schd_tm, value);
	}


	/**
	 * Scheduled order delivery date and time 指図納品予定日時.<p>
	 *
	 */
	public MCDate inst_dlv_schd_tm() {
		return getConstDate(offset + 17, $inst_dlv_schd_tm);
	}

	/**
	 * Scheduled order delivery date and time 指図納品予定日時.<p>
	 *
	 */
	public void inst_dlv_schd_tm(MCDate value) {
		setConstDate(offset + 17, $inst_dlv_schd_tm, value);
	}


	/**
	 * Split shipping schedule 出荷予定分割.<p>
	 *
	 */
	public boolean ship_schd_split_flg() {
		return getConstBoolean(offset + 18, $ship_schd_split_flg);
	}

	/**
	 * Split shipping schedule 出荷予定分割.<p>
	 *
	 */
	public void ship_schd_split_flg(boolean value) {
		setConstBoolean(offset + 18, $ship_schd_split_flg, value);
	}


	/**
	 * Shipping decision 出荷判定.<p>
	 *
	 */
	public boolean ship_judge_flg() {
		return getConstBoolean(offset + 19, $ship_judge_flg);
	}

	/**
	 * Shipping decision 出荷判定.<p>
	 *
	 */
	public void ship_judge_flg(boolean value) {
		setConstBoolean(offset + 19, $ship_judge_flg, value);
	}


	/**
	 * Update shipping schedule 出荷予定更新.<p>
	 *
	 */
	public boolean upd02_flg() {
		return getConstBoolean(offset + 20, $upd02_flg);
	}

	/**
	 * Update shipping schedule 出荷予定更新.<p>
	 *
	 */
	public void upd02_flg(boolean value) {
		setConstBoolean(offset + 20, $upd02_flg, value);
	}


	/**
	 * No credit update 与信更新無.<p>
	 *
	 */
	public boolean cred_no_up_flg() {
		return getConstBoolean(offset + 21, $cred_no_up_flg);
	}

	/**
	 * No credit update 与信更新無.<p>
	 *
	 */
	public void cred_no_up_flg(boolean value) {
		setConstBoolean(offset + 21, $cred_no_up_flg, value);
	}


	/**
	 * Order Entered 指図登録済.<p>
	 *
	 */
	public boolean ship_inst_flg() {
		return getConstBoolean(offset + 22, $ship_inst_flg);
	}

	/**
	 * Order Entered 指図登録済.<p>
	 *
	 */
	public void ship_inst_flg(boolean value) {
		setConstBoolean(offset + 22, $ship_inst_flg, value);
	}


	/**
	 * Result entered 実績登録済.<p>
	 *
	 */
	public boolean ship_act_flg() {
		return getConstBoolean(offset + 23, $ship_act_flg);
	}

	/**
	 * Result entered 実績登録済.<p>
	 *
	 */
	public void ship_act_flg(boolean value) {
		setConstBoolean(offset + 23, $ship_act_flg, value);
	}


	/**
	 * Recalculate scheduled date 予定日再計算.<p>
	 *
	 */
	public boolean dt_recalc_flg() {
		return getConstBoolean(offset + 24, $dt_recalc_flg);
	}

	/**
	 * Recalculate scheduled date 予定日再計算.<p>
	 *
	 */
	public void dt_recalc_flg(boolean value) {
		setConstBoolean(offset + 24, $dt_recalc_flg, value);
	}


	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public boolean wms_flg() {
		return getConstBoolean(offset + 25, $wms_flg);
	}

	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		setConstBoolean(offset + 25, $wms_flg, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 26, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 26, $err_flg, value);
	}


	/**
	 * Cancel remaining qty. 残数打切.<p>
	 *
	 */
	public boolean rem_abort_flg() {
		return getConstBoolean(offset + 27, $rem_abort_flg);
	}

	/**
	 * Cancel remaining qty. 残数打切.<p>
	 *
	 */
	public void rem_abort_flg(boolean value) {
		setConstBoolean(offset + 27, $rem_abort_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($inst_unit_cd.equalsIgnoreCase(name)) {
			return inst_unit_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($peg_seq.equalsIgnoreCase(name)) {
			return peg_seq();
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			return valid_dt_fr_grp();
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			return inst_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($inst_ship_schd_tm.equalsIgnoreCase(name)) {
			return inst_ship_schd_tm();
		}
		if ($inst_dlv_schd_tm.equalsIgnoreCase(name)) {
			return inst_dlv_schd_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($vmi_flg.equalsIgnoreCase(name)) {
			return vmi_flg();
		}
		if ($is_src_ship_inst_flg.equalsIgnoreCase(name)) {
			return is_src_ship_inst_flg();
		}
		if ($iv_schd_qty_upd_flg.equalsIgnoreCase(name)) {
			return iv_schd_qty_upd_flg();
		}
		if ($is_src_ship_schd_flg.equalsIgnoreCase(name)) {
			return is_src_ship_schd_flg();
		}
		if ($is_src_sls_dlv_dt_adjst_flg.equalsIgnoreCase(name)) {
			return is_src_sls_dlv_dt_adjst_flg();
		}
		if ($ship_term_cd_restore_flg.equalsIgnoreCase(name)) {
			return ship_term_cd_restore_flg();
		}
		if ($ship_wk_cd_restore_flg.equalsIgnoreCase(name)) {
			return ship_wk_cd_restore_flg();
		}
		if ($iv_chk_skip_flg.equalsIgnoreCase(name)) {
			return iv_chk_skip_flg();
		}
		if ($ship_schd_split_flg.equalsIgnoreCase(name)) {
			return ship_schd_split_flg();
		}
		if ($ship_judge_flg.equalsIgnoreCase(name)) {
			return ship_judge_flg();
		}
		if ($upd02_flg.equalsIgnoreCase(name)) {
			return upd02_flg();
		}
		if ($cred_no_up_flg.equalsIgnoreCase(name)) {
			return cred_no_up_flg();
		}
		if ($ship_inst_flg.equalsIgnoreCase(name)) {
			return ship_inst_flg();
		}
		if ($ship_act_flg.equalsIgnoreCase(name)) {
			return ship_act_flg();
		}
		if ($dt_recalc_flg.equalsIgnoreCase(name)) {
			return dt_recalc_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			return rem_abort_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($inst_unit_cd.equalsIgnoreCase(name)) {
			return inst_unit_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($peg_seq.equalsIgnoreCase(name)) {
			return peg_seq();
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			return valid_dt_fr_grp();
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			return inst_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($inst_ship_schd_tm.equalsIgnoreCase(name)) {
			return inst_ship_schd_tm();
		}
		if ($inst_dlv_schd_tm.equalsIgnoreCase(name)) {
			return inst_dlv_schd_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($vmi_flg.equalsIgnoreCase(name)) {
			return vmi_flg();
		}
		if ($is_src_ship_inst_flg.equalsIgnoreCase(name)) {
			return is_src_ship_inst_flg();
		}
		if ($iv_schd_qty_upd_flg.equalsIgnoreCase(name)) {
			return iv_schd_qty_upd_flg();
		}
		if ($is_src_ship_schd_flg.equalsIgnoreCase(name)) {
			return is_src_ship_schd_flg();
		}
		if ($is_src_sls_dlv_dt_adjst_flg.equalsIgnoreCase(name)) {
			return is_src_sls_dlv_dt_adjst_flg();
		}
		if ($ship_term_cd_restore_flg.equalsIgnoreCase(name)) {
			return ship_term_cd_restore_flg();
		}
		if ($ship_wk_cd_restore_flg.equalsIgnoreCase(name)) {
			return ship_wk_cd_restore_flg();
		}
		if ($iv_chk_skip_flg.equalsIgnoreCase(name)) {
			return iv_chk_skip_flg();
		}
		if ($ship_schd_split_flg.equalsIgnoreCase(name)) {
			return ship_schd_split_flg();
		}
		if ($ship_judge_flg.equalsIgnoreCase(name)) {
			return ship_judge_flg();
		}
		if ($upd02_flg.equalsIgnoreCase(name)) {
			return upd02_flg();
		}
		if ($cred_no_up_flg.equalsIgnoreCase(name)) {
			return cred_no_up_flg();
		}
		if ($ship_inst_flg.equalsIgnoreCase(name)) {
			return ship_inst_flg();
		}
		if ($ship_act_flg.equalsIgnoreCase(name)) {
			return ship_act_flg();
		}
		if ($dt_recalc_flg.equalsIgnoreCase(name)) {
			return dt_recalc_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			return rem_abort_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($inst_unit_cd.equalsIgnoreCase(name)) {
			inst_unit_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_seq.equalsIgnoreCase(name)) {
			peg_seq(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_seq.equalsIgnoreCase(name)) {
			peg_seq(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_seq.equalsIgnoreCase(name)) {
			peg_seq(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_seq.equalsIgnoreCase(name)) {
			peg_seq(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_seq.equalsIgnoreCase(name)) {
			peg_seq(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($inst_ship_schd_tm.equalsIgnoreCase(name)) {
			inst_ship_schd_tm(value);
			return;
		}
		if ($inst_dlv_schd_tm.equalsIgnoreCase(name)) {
			inst_dlv_schd_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($vmi_flg.equalsIgnoreCase(name)) {
			vmi_flg(value);
			return;
		}
		if ($is_src_ship_inst_flg.equalsIgnoreCase(name)) {
			is_src_ship_inst_flg(value);
			return;
		}
		if ($iv_schd_qty_upd_flg.equalsIgnoreCase(name)) {
			iv_schd_qty_upd_flg(value);
			return;
		}
		if ($is_src_ship_schd_flg.equalsIgnoreCase(name)) {
			is_src_ship_schd_flg(value);
			return;
		}
		if ($is_src_sls_dlv_dt_adjst_flg.equalsIgnoreCase(name)) {
			is_src_sls_dlv_dt_adjst_flg(value);
			return;
		}
		if ($ship_term_cd_restore_flg.equalsIgnoreCase(name)) {
			ship_term_cd_restore_flg(value);
			return;
		}
		if ($ship_wk_cd_restore_flg.equalsIgnoreCase(name)) {
			ship_wk_cd_restore_flg(value);
			return;
		}
		if ($iv_chk_skip_flg.equalsIgnoreCase(name)) {
			iv_chk_skip_flg(value);
			return;
		}
		if ($ship_schd_split_flg.equalsIgnoreCase(name)) {
			ship_schd_split_flg(value);
			return;
		}
		if ($ship_judge_flg.equalsIgnoreCase(name)) {
			ship_judge_flg(value);
			return;
		}
		if ($upd02_flg.equalsIgnoreCase(name)) {
			upd02_flg(value);
			return;
		}
		if ($cred_no_up_flg.equalsIgnoreCase(name)) {
			cred_no_up_flg(value);
			return;
		}
		if ($ship_inst_flg.equalsIgnoreCase(name)) {
			ship_inst_flg(value);
			return;
		}
		if ($ship_act_flg.equalsIgnoreCase(name)) {
			ship_act_flg(value);
			return;
		}
		if ($dt_recalc_flg.equalsIgnoreCase(name)) {
			dt_recalc_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			rem_abort_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($inst_unit_cd.equalsIgnoreCase(name)) {
			inst_unit_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_seq.equalsIgnoreCase(name)) {
			peg_seq(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_seq.equalsIgnoreCase(name)) {
			peg_seq(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_seq.equalsIgnoreCase(name)) {
			peg_seq(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_seq.equalsIgnoreCase(name)) {
			peg_seq(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_seq.equalsIgnoreCase(name)) {
			peg_seq(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($inst_ship_schd_tm.equalsIgnoreCase(name)) {
			inst_ship_schd_tm(value);
			return;
		}
		if ($inst_dlv_schd_tm.equalsIgnoreCase(name)) {
			inst_dlv_schd_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($vmi_flg.equalsIgnoreCase(name)) {
			vmi_flg(value);
			return;
		}
		if ($is_src_ship_inst_flg.equalsIgnoreCase(name)) {
			is_src_ship_inst_flg(value);
			return;
		}
		if ($iv_schd_qty_upd_flg.equalsIgnoreCase(name)) {
			iv_schd_qty_upd_flg(value);
			return;
		}
		if ($is_src_ship_schd_flg.equalsIgnoreCase(name)) {
			is_src_ship_schd_flg(value);
			return;
		}
		if ($is_src_sls_dlv_dt_adjst_flg.equalsIgnoreCase(name)) {
			is_src_sls_dlv_dt_adjst_flg(value);
			return;
		}
		if ($ship_term_cd_restore_flg.equalsIgnoreCase(name)) {
			ship_term_cd_restore_flg(value);
			return;
		}
		if ($ship_wk_cd_restore_flg.equalsIgnoreCase(name)) {
			ship_wk_cd_restore_flg(value);
			return;
		}
		if ($iv_chk_skip_flg.equalsIgnoreCase(name)) {
			iv_chk_skip_flg(value);
			return;
		}
		if ($ship_schd_split_flg.equalsIgnoreCase(name)) {
			ship_schd_split_flg(value);
			return;
		}
		if ($ship_judge_flg.equalsIgnoreCase(name)) {
			ship_judge_flg(value);
			return;
		}
		if ($upd02_flg.equalsIgnoreCase(name)) {
			upd02_flg(value);
			return;
		}
		if ($cred_no_up_flg.equalsIgnoreCase(name)) {
			cred_no_up_flg(value);
			return;
		}
		if ($ship_inst_flg.equalsIgnoreCase(name)) {
			ship_inst_flg(value);
			return;
		}
		if ($ship_act_flg.equalsIgnoreCase(name)) {
			ship_act_flg(value);
			return;
		}
		if ($dt_recalc_flg.equalsIgnoreCase(name)) {
			dt_recalc_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			rem_abort_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($sp.equalsIgnoreCase(name)) {
			return sp();
		}
		if ($ss.equalsIgnoreCase(name)) {
			return ss();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($sp.equalsIgnoreCase(name)) {
			sp(
				((MCContainerMeta) sp_META).castInnerRow(mcframe.serverMS.dbc.MST_SHIP_PR_R.class, value)
			);
			return;
		}
		if ($ss.equalsIgnoreCase(name)) {
			ss(
				((MCContainerMeta) ss_META).castInnerRow(mcframe.serverMS.dbc.MST_SHIP_SCHD_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public String ship_pr_no() {
		return sp().ship_pr_no();
	}

	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public void ship_pr_no(String value) {
		sp().ship_pr_no(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return sp().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		sp().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return sp().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		sp().trd_ptn_typ(value);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return sp().slo_d_no();
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		sp().slo_d_no(value);
	}

	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public String xfr_schd_no() {
		return sp().xfr_schd_no();
	}

	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public void xfr_schd_no(String value) {
		sp().xfr_schd_no(value);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return sp().rqst_dpt_cd();
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		sp().rqst_dpt_cd(value);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_usr_cd() {
		return sp().rqst_usr_cd();
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		sp().rqst_usr_cd(value);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return sp().cst_cd();
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		sp().cst_cd(value);
	}

	/**
	 * Desired shipping date and time 出荷希望日時.<p>
	 *
	 */
	public MCDate ship_rqst_tm() {
		return sp().ship_rqst_tm();
	}

	/**
	 * Desired shipping date and time 出荷希望日時.<p>
	 *
	 */
	public void ship_rqst_tm(MCDate value) {
		sp().ship_rqst_tm(value);
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return sp().dlv_rqst_tm();
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		sp().dlv_rqst_tm(value);
	}

	/**
	 * order promising date 納期回答日.<p>
	 *
	 */
	public MCDate prms_dt() {
		return sp().prms_dt();
	}

	/**
	 * order promising date 納期回答日.<p>
	 *
	 */
	public void prms_dt(MCDate value) {
		sp().prms_dt(value);
	}

	/**
	 * Replied delivery date 回答納入日.<p>
	 *
	 */
	public MCDate prms_dlv_dt() {
		return sp().prms_dlv_dt();
	}

	/**
	 * Replied delivery date 回答納入日.<p>
	 *
	 */
	public void prms_dlv_dt(MCDate value) {
		sp().prms_dlv_dt(value);
	}

	/**
	 * Delivery order received date 納入指示受領日.<p>
	 *
	 */
	public MCDate dlv_inst_rcpt_dt() {
		return sp().dlv_inst_rcpt_dt();
	}

	/**
	 * Delivery order received date 納入指示受領日.<p>
	 *
	 */
	public void dlv_inst_rcpt_dt(MCDate value) {
		sp().dlv_inst_rcpt_dt(value);
	}

	/**
	 * Delivery order replied date 納入指示回答日.<p>
	 *
	 */
	public MCDate dlv_inst_prms_dt() {
		return sp().dlv_inst_prms_dt();
	}

	/**
	 * Delivery order replied date 納入指示回答日.<p>
	 *
	 */
	public void dlv_inst_prms_dt(MCDate value) {
		sp().dlv_inst_prms_dt(value);
	}

	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public String ship_to_lg_grp_cd() {
		return sp().ship_to_lg_grp_cd();
	}

	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public void ship_to_lg_grp_cd(String value) {
		sp().ship_to_lg_grp_cd(value);
	}

	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public String dlv_id_typ() {
		return sp().dlv_id_typ();
	}

	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		sp().dlv_id_typ(value);
	}

	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return sp().dlv_id_cd();
	}

	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		sp().dlv_id_cd(value);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return sp().dlv_id_nm();
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		sp().dlv_id_nm(value);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return sp().dlv_zip_cd();
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		sp().dlv_zip_cd(value);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所1.<p>
	 *
	 */
	public String dlv_addr1() {
		return sp().dlv_addr1();
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所1.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		sp().dlv_addr1(value);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所2.<p>
	 *
	 */
	public String dlv_addr2() {
		return sp().dlv_addr2();
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所2.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		sp().dlv_addr2(value);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所3.<p>
	 *
	 */
	public String dlv_addr3() {
		return sp().dlv_addr3();
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所3.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		sp().dlv_addr3(value);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所4.<p>
	 *
	 */
	public String dlv_addr4() {
		return sp().dlv_addr4();
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所4.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		sp().dlv_addr4(value);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return sp().dlv_cntct_dpt();
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		sp().dlv_cntct_dpt(value);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return sp().dlv_cntct_psn();
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		sp().dlv_cntct_psn(value);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return sp().dlv_tel();
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		sp().dlv_tel(value);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return sp().dlv_fax();
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		sp().dlv_fax(value);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return sp().dlv_sundry_flg();
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		sp().dlv_sundry_flg(value);
	}

	/**
	 * Delivery destination rack/line cd. 納品先棚・ラインＣＤ.<p>
	 *
	 */
	public String dlv_str_ln_cd() {
		return sp().dlv_str_ln_cd();
	}

	/**
	 * Delivery destination rack/line cd. 納品先棚・ラインＣＤ.<p>
	 *
	 */
	public void dlv_str_ln_cd(String value) {
		sp().dlv_str_ln_cd(value);
	}

	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public String ship_to_id_typ() {
		return sp().ship_to_id_typ();
	}

	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public void ship_to_id_typ(String value) {
		sp().ship_to_id_typ(value);
	}

	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public String ship_to_id_cd() {
		return sp().ship_to_id_cd();
	}

	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		sp().ship_to_id_cd(value);
	}

	/**
	 * Receiving point name 送付先名.<p>
	 *
	 */
	public String ship_to_id_nm() {
		return sp().ship_to_id_nm();
	}

	/**
	 * Receiving point name 送付先名.<p>
	 *
	 */
	public void ship_to_id_nm(String value) {
		sp().ship_to_id_nm(value);
	}

	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public String ship_to_zip_cd() {
		return sp().ship_to_zip_cd();
	}

	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public void ship_to_zip_cd(String value) {
		sp().ship_to_zip_cd(value);
	}

	/**
	 * Receiving point address 1 送付先住所1.<p>
	 *
	 */
	public String ship_to_addr1() {
		return sp().ship_to_addr1();
	}

	/**
	 * Receiving point address 1 送付先住所1.<p>
	 *
	 */
	public void ship_to_addr1(String value) {
		sp().ship_to_addr1(value);
	}

	/**
	 * Receiving point address 2 送付先住所2.<p>
	 *
	 */
	public String ship_to_addr2() {
		return sp().ship_to_addr2();
	}

	/**
	 * Receiving point address 2 送付先住所2.<p>
	 *
	 */
	public void ship_to_addr2(String value) {
		sp().ship_to_addr2(value);
	}

	/**
	 * Receiving point address 3 送付先住所3.<p>
	 *
	 */
	public String ship_to_addr3() {
		return sp().ship_to_addr3();
	}

	/**
	 * Receiving point address 3 送付先住所3.<p>
	 *
	 */
	public void ship_to_addr3(String value) {
		sp().ship_to_addr3(value);
	}

	/**
	 * Receiving point address 4 送付先住所4.<p>
	 *
	 */
	public String ship_to_addr4() {
		return sp().ship_to_addr4();
	}

	/**
	 * Receiving point address 4 送付先住所4.<p>
	 *
	 */
	public void ship_to_addr4(String value) {
		sp().ship_to_addr4(value);
	}

	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public String ship_to_cntct_dpt() {
		return sp().ship_to_cntct_dpt();
	}

	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public void ship_to_cntct_dpt(String value) {
		sp().ship_to_cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public String ship_to_cntct_psn() {
		return sp().ship_to_cntct_psn();
	}

	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public void ship_to_cntct_psn(String value) {
		sp().ship_to_cntct_psn(value);
	}

	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public String ship_to_tel() {
		return sp().ship_to_tel();
	}

	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public void ship_to_tel(String value) {
		sp().ship_to_tel(value);
	}

	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public String ship_to_fax() {
		return sp().ship_to_fax();
	}

	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public void ship_to_fax(String value) {
		sp().ship_to_fax(value);
	}

	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public boolean ship_to_sundry_flg() {
		return sp().ship_to_sundry_flg();
	}

	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public void ship_to_sundry_flg(boolean value) {
		sp().ship_to_sundry_flg(value);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return sp().via_dlv_typ();
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		sp().via_dlv_typ(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return sp().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		sp().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		sp().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		sp().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		sp().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		sp().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return sp().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		sp().trd_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return sp().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		sp().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		sp().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		sp().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		sp().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		sp().base_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return sp().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		sp().base_unit_cd(value);
	}

	/**
	 * Order promising qty. 納期回答数量.<p>
	 *
	 */
	public MCNumber prms_qty() {
		return sp().prms_qty();
	}

	/**
	 * Order promising qty. 納期回答数量.<p>
	 *
	 */
	public void prms_qty(MCNumber value) {
		sp().prms_qty(value);
	}

	/**
	 * Order promising qty. 納期回答数量.<p>
	 *
	 */
	public void prms_qty(int value) {
		sp().prms_qty(value);
	}

	/**
	 * Order promising qty. 納期回答数量.<p>
	 *
	 */
	public void prms_qty(long value) {
		sp().prms_qty(value);
	}

	/**
	 * Order promising qty. 納期回答数量.<p>
	 *
	 */
	public void prms_qty(float value) {
		sp().prms_qty(value);
	}

	/**
	 * Order promising qty. 納期回答数量.<p>
	 *
	 */
	public void prms_qty(double value) {
		sp().prms_qty(value);
	}

	/**
	 * Delivery order received qty. 納入指示受領数量.<p>
	 *
	 */
	public MCNumber dlv_inst_rcpt_qty() {
		return sp().dlv_inst_rcpt_qty();
	}

	/**
	 * Delivery order received qty. 納入指示受領数量.<p>
	 *
	 */
	public void dlv_inst_rcpt_qty(MCNumber value) {
		sp().dlv_inst_rcpt_qty(value);
	}

	/**
	 * Delivery order received qty. 納入指示受領数量.<p>
	 *
	 */
	public void dlv_inst_rcpt_qty(int value) {
		sp().dlv_inst_rcpt_qty(value);
	}

	/**
	 * Delivery order received qty. 納入指示受領数量.<p>
	 *
	 */
	public void dlv_inst_rcpt_qty(long value) {
		sp().dlv_inst_rcpt_qty(value);
	}

	/**
	 * Delivery order received qty. 納入指示受領数量.<p>
	 *
	 */
	public void dlv_inst_rcpt_qty(float value) {
		sp().dlv_inst_rcpt_qty(value);
	}

	/**
	 * Delivery order received qty. 納入指示受領数量.<p>
	 *
	 */
	public void dlv_inst_rcpt_qty(double value) {
		sp().dlv_inst_rcpt_qty(value);
	}

	/**
	 * Delivery order replied qty. 納入指示回答数量.<p>
	 *
	 */
	public MCNumber dlv_inst_prms_qty() {
		return sp().dlv_inst_prms_qty();
	}

	/**
	 * Delivery order replied qty. 納入指示回答数量.<p>
	 *
	 */
	public void dlv_inst_prms_qty(MCNumber value) {
		sp().dlv_inst_prms_qty(value);
	}

	/**
	 * Delivery order replied qty. 納入指示回答数量.<p>
	 *
	 */
	public void dlv_inst_prms_qty(int value) {
		sp().dlv_inst_prms_qty(value);
	}

	/**
	 * Delivery order replied qty. 納入指示回答数量.<p>
	 *
	 */
	public void dlv_inst_prms_qty(long value) {
		sp().dlv_inst_prms_qty(value);
	}

	/**
	 * Delivery order replied qty. 納入指示回答数量.<p>
	 *
	 */
	public void dlv_inst_prms_qty(float value) {
		sp().dlv_inst_prms_qty(value);
	}

	/**
	 * Delivery order replied qty. 納入指示回答数量.<p>
	 *
	 */
	public void dlv_inst_prms_qty(double value) {
		sp().dlv_inst_prms_qty(value);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return sp().abort_flg();
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		sp().abort_flg(value);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return sp().rsn_cd();
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		sp().rsn_cd(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return sp().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		sp().bd_dpt_cd(value);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return sp().ship_term_cd();
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		sp().ship_term_cd(value);
	}

	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public String ship_inst_typ() {
		return sp().ship_inst_typ();
	}

	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public void ship_inst_typ(String value) {
		sp().ship_inst_typ(value);
	}

	/**
	 * Direct delivery 仕入直送.<p>
	 *
	 */
	public boolean purc_ddlv_flg() {
		return sp().purc_ddlv_flg();
	}

	/**
	 * Direct delivery 仕入直送.<p>
	 *
	 */
	public void purc_ddlv_flg(boolean value) {
		sp().purc_ddlv_flg(value);
	}

	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public String ship_schd_split_typ() {
		return sp().ship_schd_split_typ();
	}

	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public void ship_schd_split_typ(String value) {
		sp().ship_schd_split_typ(value);
	}

	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public String alloc_scope_typ() {
		return sp().alloc_scope_typ();
	}

	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public void alloc_scope_typ(String value) {
		sp().alloc_scope_typ(value);
	}

	/**
	 * Prohibit mixed distribution G 物流Ｇ混在不可.<p>
	 *
	 */
	public boolean not_lg_mix_flg() {
		return sp().not_lg_mix_flg();
	}

	/**
	 * Prohibit mixed distribution G 物流Ｇ混在不可.<p>
	 *
	 */
	public void not_lg_mix_flg(boolean value) {
		sp().not_lg_mix_flg(value);
	}

	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public String alloc_typ() {
		return sp().alloc_typ();
	}

	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public void alloc_typ(String value) {
		sp().alloc_typ(value);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return sp().alloc_grp_cd();
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		sp().alloc_grp_cd(value);
	}

	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public String ship_lg_grp_cd() {
		return sp().ship_lg_grp_cd();
	}

	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public void ship_lg_grp_cd(String value) {
		sp().ship_lg_grp_cd(value);
	}

	/**
	 * Default location cd. デフォルト場所ＣＤ.<p>
	 *
	 */
	public String def_loc_cd() {
		return sp().def_loc_cd();
	}

	/**
	 * Default location cd. デフォルト場所ＣＤ.<p>
	 *
	 */
	public void def_loc_cd(String value) {
		sp().def_loc_cd(value);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return sp().loc_cd();
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		sp().loc_cd(value);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return sp().str_ln_cd();
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		sp().str_ln_cd(value);
	}

	/**
	 * Allocation period pending 引当期間保留.<p>
	 *
	 */
	public boolean period_block_flg() {
		return sp().period_block_flg();
	}

	/**
	 * Allocation period pending 引当期間保留.<p>
	 *
	 */
	public void period_block_flg(boolean value) {
		sp().period_block_flg(value);
	}

	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public String ship_cnt_rmrks() {
		return sp().ship_cnt_rmrks();
	}

	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public void ship_cnt_rmrks(String value) {
		sp().ship_cnt_rmrks(value);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return sp().io_schd_pr_no();
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		sp().io_schd_pr_no(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return sp().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		sp().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return sp().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		sp().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return sp().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		sp().sub_char3(value);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return ss().ship_schd_no();
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		ss().ship_schd_no(value);
	}

	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public String ship_inst_d_no() {
		return ss().ship_inst_d_no();
	}

	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public void ship_inst_d_no(String value) {
		ss().ship_inst_d_no(value);
	}

	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public String dlv_inst_rcpt_no() {
		return ss().dlv_inst_rcpt_no();
	}

	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public void dlv_inst_rcpt_no(String value) {
		ss().dlv_inst_rcpt_no(value);
	}

	/**
	 * Sales order promising No. 受注納期回答ＮＯ.<p>
	 *
	 */
	public String slo_prms_no() {
		return ss().slo_prms_no();
	}

	/**
	 * Sales order promising No. 受注納期回答ＮＯ.<p>
	 *
	 */
	public void slo_prms_no(String value) {
		ss().slo_prms_no(value);
	}

	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public String sls_act_d_no() {
		return ss().sls_act_d_no();
	}

	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public void sls_act_d_no(String value) {
		ss().sls_act_d_no(value);
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return ss().ship_fr_lg_grp_cd();
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		ss().ship_fr_lg_grp_cd(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return ss().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		ss().wg_cd(value);
	}

	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public MCDate ship_schd_tm() {
		return ss().ship_schd_tm();
	}

	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public void ship_schd_tm(MCDate value) {
		ss().ship_schd_tm(value);
	}

	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public MCDate dlv_schd_tm() {
		return ss().dlv_schd_tm();
	}

	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public void dlv_schd_tm(MCDate value) {
		ss().dlv_schd_tm(value);
	}

	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public String ship_wk_cd() {
		return ss().ship_wk_cd();
	}

	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public void ship_wk_cd(String value) {
		ss().ship_wk_cd(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return ss().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		ss().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return ss().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		ss().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return ss().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		ss().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return ss().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		ss().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return ss().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		ss().itm_nm(value);
	}

	/**
	 * Item name for invoice インボイス表記用品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return ss().iv_itm_nm();
	}

	/**
	 * Item name for invoice インボイス表記用品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		ss().iv_itm_nm(value);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return ss().sundry_itm_flg();
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		ss().sundry_itm_flg(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return ss().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		ss().sno1(value);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return ss().sno1_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		ss().sno1_null_flg(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return ss().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		ss().sno2(value);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return ss().sno2_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		ss().sno2_null_flg(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return ss().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		ss().sno3(value);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return ss().sno3_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		ss().sno3_null_flg(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return ss().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		ss().sno4(value);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return ss().sno4_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		ss().sno4_null_flg(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return ss().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		ss().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return ss().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		ss().sublot_no(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return ss().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		ss().ver_no(value);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return ss().stk_arrv_bp_cd();
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		ss().stk_arrv_bp_cd(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return ss().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		ss().gd_cd(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return ss().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		ss().quality_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return ss().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		ss().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return ss().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		ss().stk_bp_cd(value);
	}

	/**
	 * Not to calculate scheduled date 予定日計算対象外.<p>
	 *
	 */
	public boolean not_dt_calc_flg() {
		return ss().not_dt_calc_flg();
	}

	/**
	 * Not to calculate scheduled date 予定日計算対象外.<p>
	 *
	 */
	public void not_dt_calc_flg(boolean value) {
		ss().not_dt_calc_flg(value);
	}

	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public boolean ship_block_flg() {
		return ss().ship_block_flg();
	}

	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public void ship_block_flg(boolean value) {
		ss().ship_block_flg(value);
	}

	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return ss().not_lot_mix_flg();
	}

	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		ss().not_lot_mix_flg(value);
	}

	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return ss().not_sublot_mix_flg();
	}

	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		ss().not_sublot_mix_flg(value);
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate vld_dt_fr() {
		return ss().vld_dt_fr();
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public void vld_dt_fr(MCDate value) {
		ss().vld_dt_fr(value);
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCDate vld_dt_to() {
		return ss().vld_dt_to();
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public void vld_dt_to(MCDate value) {
		ss().vld_dt_to(value);
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public String base_dlv_slip_no() {
		return ss().base_dlv_slip_no();
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public void base_dlv_slip_no(String value) {
		ss().base_dlv_slip_no(value);
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public String base_prov_act_no() {
		return ss().base_prov_act_no();
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public void base_prov_act_no(String value) {
		ss().base_prov_act_no(value);
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return ss().base_ac_dt();
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		ss().base_ac_dt(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return ss().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		ss().intr_rmrks(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return ss().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		ss().trd_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return ss().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		ss().trd_d_rmrks(value);
	}

	/**
	 * Shipping schedule spare 1 出荷予定予備１.<p>
	 *
	 */
	public String ship_schd_sub_char1() {
		return ss().sub_char1();
	}

	/**
	 * Shipping schedule spare 1 出荷予定予備１.<p>
	 *
	 */
	public void ship_schd_sub_char1(String value) {
		ss().sub_char1(value);
	}

	/**
	 * Shipping schedule spare 2 出荷予定予備２.<p>
	 *
	 */
	public String ship_schd_sub_char2() {
		return ss().sub_char2();
	}

	/**
	 * Shipping schedule spare 2 出荷予定予備２.<p>
	 *
	 */
	public void ship_schd_sub_char2(String value) {
		ss().sub_char2(value);
	}

	/**
	 * Shipping schedule spare 3 出荷予定予備３.<p>
	 *
	 */
	public String ship_schd_sub_char3() {
		return ss().sub_char3();
	}

	/**
	 * Shipping schedule spare 3 出荷予定予備３.<p>
	 *
	 */
	public void ship_schd_sub_char3(String value) {
		ss().sub_char3(value);
	}

}

