package mcframe.serverMSBD.MSBDL5180;

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
 * ブロック"Purc_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Purc_Chk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Not for check flg. チェック対象外ＦＬＧ.<p>
	 *
	 */
	public static final String $no_chk_flg = "no_chk_flg";
	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public static final String $arr_ptn_typ = "arr_ptn_typ";
	/**
	 * Purchase result header 仕入実績ヘッダ.<p>
	 *
	 */
	public static final String $pa = "pa";
	public static final String $purc_tax_calc_typ = "purc_tax_calc_typ";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public static final String $arr_schd_no = "arr_schd_no";
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public static final String $arr_act_no = "arr_act_no";
	/**
	 * Purchase result details 仕入実績明細.<p>
	 *
	 */
	public static final String $pad = "pad";
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public static final String $pack_unit_qty = "pack_unit_qty";
	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public static final String $tax_typ = "tax_typ";
	/**
	 * Tax rate 税率.<p>
	 *
	 * 伝票単位の税計算に使用する
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public static final String $purc_tax_rnd_typ = "purc_tax_rnd_typ";
	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Expenses purchasing flg. 経費購買ＦＬＧ.<p>
	 *
	 */
	public static final String $xpns_po_flg = "xpns_po_flg";
	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public static final String $purc_cont_qty = "purc_cont_qty";
	/**
	 * Lot creation flg. ロット作成ＦＬＧ.<p>
	 *
	 */
	public static final String $crt_lot_flg = "crt_lot_flg";
	/**
	 * Grading before purchase recording cd. 仕入計上前格付ＣＤ.<p>
	 *
	 */
	public static final String $from_gd_cd = "from_gd_cd";
	/**
	 * Purchase GI location WG cd. 仕入出庫場所ＷＧ ＣＤ.<p>
	 *
	 */
	public static final String $gi_wg_cd = "gi_wg_cd";
	/**
	 * Purchase GI location cd. 仕入出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	/**
	 * Purchase GI rack/line cd. 仕入出庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gi_str_ln_cd = "gi_str_ln_cd";
	/**
	 * Purchase GI SKU cd. 仕入出庫荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $gi_unit_cd = "gi_unit_cd";
	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public static final String $ship_fr_valid_dt = "ship_fr_valid_dt";

	public static final String $trd_cd = $pa + ".trd_cd";
	public static final String $trd_ptn_typ = $pa + ".trd_ptn_typ";
	public static final String $po_no = $pa + ".po_no";
	public static final String $purc_dpt_cd = $pa + ".purc_dpt_cd";
	public static final String $purc_usr_cd = $pa + ".purc_usr_cd";
	public static final String $wg_cd = $pa + ".wg_cd";
	public static final String $sppl_cd = $pa + ".sppl_cd";
	public static final String $asppl_cd = $pa + ".asppl_cd";
	public static final String $bsppl_cd = $pa + ".bsppl_cd";
	public static final String $psppl_cd = $pa + ".psppl_cd";
	public static final String $cred_cd = $pa + ".cred_cd";
	public static final String $trd_cur_cd = $pa + ".trd_cur_cd";
	public static final String $ptax_cur_cd = $pa + ".ptax_cur_cd";
	public static final String $base_cur_cd = $pa + ".base_cur_cd";
	public static final String $purc_dt = $pa + ".purc_dt";
	public static final String $ac_dt = $pa + ".ac_dt";
	public static final String $pay_basis_dt = $pa + ".pay_basis_dt";
	public static final String $pay_schd_dt = $pa + ".pay_schd_dt";
	public static final String $rcpt_iv_no = $pa + ".rcpt_iv_no";
	public static final String $rcpt_iv_mng_no = $pa + ".rcpt_iv_mng_no";
	public static final String $rcpt_iv_rev = $pa + ".rcpt_iv_rev";
	public static final String $ref_rcpt_iv_no = $pa + ".ref_rcpt_iv_no";
	public static final String $purc_ret_act_no = $pa + ".purc_ret_act_no";
	public static final String $purc_ret_act_rev = $pa + ".purc_ret_act_rev";
	public static final String $xrate_cd = $pa + ".xrate_cd";
	public static final String $xrate = $pa + ".xrate";
	public static final String $ptax_dt = $pa + ".ptax_dt";
	public static final String $ptax_xrate = $pa + ".ptax_xrate";
	public static final String $intr_rmrks = $pa + ".intr_rmrks";
	public static final String $trd_rmrks = $pa + ".trd_rmrks";
	public static final String $sub_char1 = $pa + ".sub_char1";
	public static final String $sub_char2 = $pa + ".sub_char2";
	public static final String $sub_char3 = $pa + ".sub_char3";
	public static final String $tterm_cd1 = $pa + ".tterm_cd1";
	public static final String $tterm_rmrks1 = $pa + ".tterm_rmrks1";
	public static final String $tterm_cd2 = $pa + ".tterm_cd2";
	public static final String $tterm_rmrks2 = $pa + ".tterm_rmrks2";
	public static final String $tterm_cd3 = $pa + ".tterm_cd3";
	public static final String $tterm_rmrks3 = $pa + ".tterm_rmrks3";
	public static final String $purc_act_d_no = $pad + ".purc_act_d_no";
	public static final String $purc_act_d_seq = $pad + ".purc_act_d_seq";
	public static final String $purc_act_no = $pad + ".purc_act_no";
	public static final String $purc_act_seq = $pad + ".purc_act_seq";
	public static final String $po_d_no = $pad + ".po_d_no";
	public static final String $purc_schd_no = $pad + ".purc_schd_no";
	public static final String $rcpt_iv_d_no = $pad + ".rcpt_iv_d_no";
	public static final String $purc_src_typ = $pad + ".purc_src_typ";
	public static final String $purc_src_no = $pad + ".purc_src_no";
	public static final String $purc_ret_act_d_no = $pad + ".purc_ret_act_d_no";
	public static final String $sync_flg = $pad + ".sync_flg";
	public static final String $rsn_cd = $pad + ".rsn_cd";
	public static final String $ap_typ = $pad + ".ap_typ";
	public static final String $purc_id_typ = $pad + ".purc_id_typ";
	public static final String $purc_typ = $pad + ".purc_typ";
	public static final String $mfg_inst_no = $pad + ".mfg_inst_no";
	public static final String $itm_cd = $pad + ".itm_cd";
	public static final String $itm_sub1 = $pad + ".itm_sub1";
	public static final String $itm_sub2 = $pad + ".itm_sub2";
	public static final String $itm_sub3 = $pad + ".itm_sub3";
	public static final String $ver_no = $pad + ".ver_no";
	public static final String $itm_nm = $pad + ".itm_nm";
	public static final String $iv_itm_nm = $pad + ".iv_itm_nm";
	public static final String $sppl_itm_cd = $pad + ".sppl_itm_cd";
	public static final String $sppl_itm_nm = $pad + ".sppl_itm_nm";
	public static final String $sundry_itm_flg = $pad + ".sundry_itm_flg";
	public static final String $trd_unit_cd = $pad + ".trd_unit_cd";
	public static final String $trd_unit_qty = $pad + ".trd_unit_qty";
	public static final String $base_unit_cd = $pad + ".base_unit_cd";
	public static final String $base_unit_qty = $pad + ".base_unit_qty";
	public static final String $tax_cd = $pad + ".tax_cd";
	public static final String $accpt_dfct_flg = $pad + ".accpt_dfct_flg";
	public static final String $interim_flg = $pad + ".interim_flg";
	public static final String $trd_cur_upri = $pad + ".trd_cur_upri";
	public static final String $dscnt_rsn_cd = $pad + ".dscnt_rsn_cd";
	public static final String $trd_cur_dscnt_amt = $pad + ".trd_cur_dscnt_amt";
	public static final String $trd_cur_amt = $pad + ".trd_cur_amt";
	public static final String $trd_cur_tax_amt = $pad + ".trd_cur_tax_amt";
	public static final String $trd_cur_proc_upri = $pad + ".trd_cur_proc_upri";
	public static final String $trd_cur_proc_amt = $pad + ".trd_cur_proc_amt";
	public static final String $trd_cur_onr_prov_upri = $pad + ".trd_cur_onr_prov_upri";
	public static final String $trd_cur_onr_prov_amt = $pad + ".trd_cur_onr_prov_amt";
	public static final String $base_cur_upri = $pad + ".base_cur_upri";
	public static final String $base_cur_dscnt_amt = $pad + ".base_cur_dscnt_amt";
	public static final String $base_cur_amt = $pad + ".base_cur_amt";
	public static final String $base_cur_tax_amt = $pad + ".base_cur_tax_amt";
	public static final String $base_cur_proc_upri = $pad + ".base_cur_proc_upri";
	public static final String $base_cur_proc_amt = $pad + ".base_cur_proc_amt";
	public static final String $base_cur_onr_prov_upri = $pad + ".base_cur_onr_prov_upri";
	public static final String $base_cur_onr_prov_amt = $pad + ".base_cur_onr_prov_amt";
	public static final String $ptax_cur_upri = $pad + ".ptax_cur_upri";
	public static final String $ptax_cur_dscnt_amt = $pad + ".ptax_cur_dscnt_amt";
	public static final String $ptax_cur_amt = $pad + ".ptax_cur_amt";
	public static final String $ptax_cur_tax_amt = $pad + ".ptax_cur_tax_amt";
	public static final String $ptax_cur_proc_upri = $pad + ".ptax_cur_proc_upri";
	public static final String $ptax_cur_proc_amt = $pad + ".ptax_cur_proc_amt";
	public static final String $ptax_cur_onr_prov_upri = $pad + ".ptax_cur_onr_prov_upri";
	public static final String $ptax_cur_onr_prov_amt = $pad + ".ptax_cur_onr_prov_amt";
	public static final String $wtax_rate = $pad + ".wtax_rate";
	public static final String $wtax_amt = $pad + ".wtax_amt";
	public static final String $re_arr_flg = $pad + ".re_arr_flg";
	public static final String $re_arr_loc_cd = $pad + ".re_arr_loc_cd";
	public static final String $re_arr_loc_wg_cd = $pad + ".re_arr_loc_wg_cd";
	public static final String $re_arr_str_ln_cd = $pad + ".re_arr_str_ln_cd";
	public static final String $re_arr_sync_flg = $pad + ".re_arr_sync_flg";
	public static final String $re_arr_rqst_tm = $pad + ".re_arr_rqst_tm";
	public static final String $re_arr_purc_schd_dt = $pad + ".re_arr_purc_schd_dt";
	public static final String $trd_unit_re_arr_qty = $pad + ".trd_unit_re_arr_qty";
	public static final String $base_unit_re_arr_qty = $pad + ".base_unit_re_arr_qty";
	public static final String $ncv_flg = $pad + ".ncv_flg";
	public static final String $maker_cd = $pad + ".maker_cd";
	public static final String $ap_dpt_cd = $pad + ".ap_dpt_cd";
	public static final String $pay_crryovr_times = $pad + ".pay_crryovr_times";
	public static final String $bd_itm_cd = $pad + ".bd_itm_cd";
	public static final String $bd_itm_sub1 = $pad + ".bd_itm_sub1";
	public static final String $bd_itm_sub2 = $pad + ".bd_itm_sub2";
	public static final String $bd_itm_sub3 = $pad + ".bd_itm_sub3";
	public static final String $bd_sno1 = $pad + ".bd_sno1";
	public static final String $bd_sno2 = $pad + ".bd_sno2";
	public static final String $bd_sno3 = $pad + ".bd_sno3";
	public static final String $bd_sno4 = $pad + ".bd_sno4";
	public static final String $bd_lot_no = $pad + ".bd_lot_no";
	public static final String $bd_sublot_no = $pad + ".bd_sublot_no";
	public static final String $bd_ctg_cd = $pad + ".bd_ctg_cd";
	public static final String $bd_oper_cd = $pad + ".bd_oper_cd";
	public static final String $bd_iv_no = $pad + ".bd_iv_no";
	public static final String $bd_loc_cd = $pad + ".bd_loc_cd";
	public static final String $bd_po_no = $pad + ".bd_po_no";
	public static final String $bd_slo_no = $pad + ".bd_slo_no";
	public static final String $bd_dpt_cd = $pad + ".bd_dpt_cd";
	public static final String $bd_wg_cd = $pad + ".bd_wg_cd";
	public static final String $bd_bp_cd = $pad + ".bd_bp_cd";
	public static final String $intr_d_rmrks = $pad + ".intr_rmrks";
	public static final String $trd_d_rmrks = $pad + ".trd_d_rmrks";
	public static final String $sub_d_char1 = $pad + ".sub_char1";
	public static final String $sub_d_char2 = $pad + ".sub_char2";
	public static final String $sub_d_char3 = $pad + ".sub_char3";
	public static final String $ref_purc_act_no = $pad + ".ref_purc_act_no";
	public static final String $ref_purc_act_seq = $pad + ".ref_purc_act_seq";
	public static final String $ref_purc_act_d_no = $pad + ".ref_purc_act_d_no";
	public static final String $ref_purc_act_d_seq = $pad + ".ref_purc_act_d_seq";
	public static final String $base_purc_ac_dt = $pad + ".base_purc_ac_dt";
	public static final String $gd_cd = $pad + ".gd_cd";
	public static final String $sno1 = $pad + ".sno1";
	public static final String $sno2 = $pad + ".sno2";
	public static final String $sno3 = $pad + ".sno3";
	public static final String $sno4 = $pad + ".sno4";
	public static final String $in_to_loc_cd = $pad + ".in_to_loc_cd";
	public static final String $in_to_loc_wg_cd = $pad + ".in_to_loc_wg_cd";
	public static final String $str_ln_cd = $pad + ".str_ln_cd";
	public static final String $lot_no = $pad + ".lot_no";
	public static final String $sublot_no = $pad + ".sublot_no";
	public static final String $quality_typ = $pad + ".quality_typ";
	public static final String $stk_insp_typ = $pad + ".stk_insp_typ";
	public static final String $stk_id_typ = $pad + ".stk_id_typ";
	public static final String $bp_lot_no = $pad + ".bp_lot_no";
	public static final String $bp_dlv_slip_no = $pad + ".bp_dlv_slip_no";
	public static final String $bp_dlv_slip_d_no = $pad + ".bp_dlv_slip_d_no";
	public static final String $dscnt_po_no = $pad + ".po_no";
	public static final String $dscnt_slo_no = $pad + ".slo_no";
	public static final String $disp_seq = $pad + ".disp_seq";
	public static final String $edi_flg = $pad + ".edi_flg";
	public static final String $stk_mng_typ = $pad + ".stk_mng_typ";
	public static final String $upri_not_tgt_flg = $pad + ".upri_not_tgt_flg";

	public static final MCMeta no_chk_flg_META = createCommonMeta($no_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta arr_ptn_typ_META = createCommonMeta($arr_ptn_typ, mcframe.commonMA.meta.MA_META.ARR_PTN_TYP);
	public static final MCMeta pa_META = createInnerRowMeta($pa, mcframe.serverMS.dbc.MST_PURC_ACT_R.class);
	public static final MCMeta purc_tax_calc_typ_META = createCommonMeta($purc_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_schd_no_META = createCommonMeta($arr_schd_no, mcframe.commonMA.meta.MA_META.ARR_SCHD_NO);
	public static final MCMeta arr_act_no_META = createCommonMeta($arr_act_no, mcframe.commonMA.meta.MA_META.ARR_ACT_NO);
	public static final MCMeta pad_META = createInnerRowMeta($pad, mcframe.serverMS.dbc.MST_PURC_ACT_D_R.class);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_typ_META = createCommonMeta($tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta purc_tax_rnd_typ_META = createCommonMeta($purc_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta xpns_po_flg_META = createCommonMeta($xpns_po_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cont_qty_META = createCommonMeta($purc_cont_qty, mcframe.commonMA.meta.MA_META.PURC_CONT_QTY);
	public static final MCMeta crt_lot_flg_META = createCommonMeta($crt_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta from_gd_cd_META = createCommonMeta($from_gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gi_wg_cd_META = createCommonMeta($gi_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_str_ln_cd_META = createCommonMeta($gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gi_unit_cd_META = createCommonMeta($gi_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta ship_fr_valid_dt_META = createCommonMeta($ship_fr_valid_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<Purc_Chk01_DtlR> constMetas = new ConstMetaList<Purc_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			no_chk_flg_META,
			peg_no_META,
			err_flg_META,
			data_crud_typ_META,
			arr_ptn_typ_META,
			pa_META,
			purc_tax_calc_typ_META,
			amt_dec_place_META,
			can_ac_dt_META,
			arr_schd_no_META,
			arr_act_no_META,
			pad_META,
			pack_unit_cd_META,
			pack_unit_qty_META,
			inc_tax_flg_META,
			tax_typ_META,
			tax_rate_META,
			purc_tax_rnd_typ_META,
			abort_flg_META,
			asset_mng_typ_META,
			xpns_po_flg_META,
			purc_cont_qty_META,
			crt_lot_flg_META,
			from_gd_cd_META,
			gi_wg_cd_META,
			gi_loc_cd_META,
			gi_str_ln_cd_META,
			gi_unit_cd_META,
			ship_fr_valid_dt_META
		},
		new String[][]{
			{
				"trd_cd",
				"trd_ptn_typ",
				"po_no",
				"purc_dpt_cd",
				"purc_usr_cd",
				"wg_cd",
				"sppl_cd",
				"asppl_cd",
				"bsppl_cd",
				"psppl_cd",
				"cred_cd",
				"trd_cur_cd",
				"ptax_cur_cd",
				"base_cur_cd",
				"purc_dt",
				"ac_dt",
				"pay_basis_dt",
				"pay_schd_dt",
				"rcpt_iv_no",
				"rcpt_iv_mng_no",
				"rcpt_iv_rev",
				"ref_rcpt_iv_no",
				"purc_ret_act_no",
				"purc_ret_act_rev",
				"xrate_cd",
				"xrate",
				"ptax_dt",
				"ptax_xrate",
				"intr_rmrks",
				"trd_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"tterm_cd1",
				"tterm_rmrks1",
				"tterm_cd2",
				"tterm_rmrks2",
				"tterm_cd3",
				"tterm_rmrks3",
				"purc_act_d_no",
				"purc_act_d_seq",
				"purc_act_no",
				"purc_act_seq",
				"po_d_no",
				"purc_schd_no",
				"rcpt_iv_d_no",
				"purc_src_typ",
				"purc_src_no",
				"purc_ret_act_d_no",
				"sync_flg",
				"rsn_cd",
				"ap_typ",
				"purc_id_typ",
				"purc_typ",
				"mfg_inst_no",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"ver_no",
				"itm_nm",
				"iv_itm_nm",
				"sppl_itm_cd",
				"sppl_itm_nm",
				"sundry_itm_flg",
				"trd_unit_cd",
				"trd_unit_qty",
				"base_unit_cd",
				"base_unit_qty",
				"tax_cd",
				"accpt_dfct_flg",
				"interim_flg",
				"trd_cur_upri",
				"dscnt_rsn_cd",
				"trd_cur_dscnt_amt",
				"trd_cur_amt",
				"trd_cur_tax_amt",
				"trd_cur_proc_upri",
				"trd_cur_proc_amt",
				"trd_cur_onr_prov_upri",
				"trd_cur_onr_prov_amt",
				"base_cur_upri",
				"base_cur_dscnt_amt",
				"base_cur_amt",
				"base_cur_tax_amt",
				"base_cur_proc_upri",
				"base_cur_proc_amt",
				"base_cur_onr_prov_upri",
				"base_cur_onr_prov_amt",
				"ptax_cur_upri",
				"ptax_cur_dscnt_amt",
				"ptax_cur_amt",
				"ptax_cur_tax_amt",
				"ptax_cur_proc_upri",
				"ptax_cur_proc_amt",
				"ptax_cur_onr_prov_upri",
				"ptax_cur_onr_prov_amt",
				"wtax_rate",
				"wtax_amt",
				"re_arr_flg",
				"re_arr_loc_cd",
				"re_arr_loc_wg_cd",
				"re_arr_str_ln_cd",
				"re_arr_sync_flg",
				"re_arr_rqst_tm",
				"re_arr_purc_schd_dt",
				"trd_unit_re_arr_qty",
				"base_unit_re_arr_qty",
				"ncv_flg",
				"maker_cd",
				"ap_dpt_cd",
				"pay_crryovr_times",
				"bd_itm_cd",
				"bd_itm_sub1",
				"bd_itm_sub2",
				"bd_itm_sub3",
				"bd_sno1",
				"bd_sno2",
				"bd_sno3",
				"bd_sno4",
				"bd_lot_no",
				"bd_sublot_no",
				"bd_ctg_cd",
				"bd_oper_cd",
				"bd_iv_no",
				"bd_loc_cd",
				"bd_po_no",
				"bd_slo_no",
				"bd_dpt_cd",
				"bd_wg_cd",
				"bd_bp_cd",
				"intr_d_rmrks",
				"trd_d_rmrks",
				"sub_d_char1",
				"sub_d_char2",
				"sub_d_char3",
				"ref_purc_act_no",
				"ref_purc_act_seq",
				"ref_purc_act_d_no",
				"ref_purc_act_d_seq",
				"base_purc_ac_dt",
				"gd_cd",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"in_to_loc_cd",
				"in_to_loc_wg_cd",
				"str_ln_cd",
				"lot_no",
				"sublot_no",
				"quality_typ",
				"stk_insp_typ",
				"stk_id_typ",
				"bp_lot_no",
				"bp_dlv_slip_no",
				"bp_dlv_slip_d_no",
				"dscnt_po_no",
				"dscnt_slo_no",
				"disp_seq",
				"edi_flg",
				"stk_mng_typ",
				"upri_not_tgt_flg"
			},
			{
				$trd_cd,
				$trd_ptn_typ,
				$po_no,
				$purc_dpt_cd,
				$purc_usr_cd,
				$wg_cd,
				$sppl_cd,
				$asppl_cd,
				$bsppl_cd,
				$psppl_cd,
				$cred_cd,
				$trd_cur_cd,
				$ptax_cur_cd,
				$base_cur_cd,
				$purc_dt,
				$ac_dt,
				$pay_basis_dt,
				$pay_schd_dt,
				$rcpt_iv_no,
				$rcpt_iv_mng_no,
				$rcpt_iv_rev,
				$ref_rcpt_iv_no,
				$purc_ret_act_no,
				$purc_ret_act_rev,
				$xrate_cd,
				$xrate,
				$ptax_dt,
				$ptax_xrate,
				$intr_rmrks,
				$trd_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$tterm_cd1,
				$tterm_rmrks1,
				$tterm_cd2,
				$tterm_rmrks2,
				$tterm_cd3,
				$tterm_rmrks3,
				$purc_act_d_no,
				$purc_act_d_seq,
				$purc_act_no,
				$purc_act_seq,
				$po_d_no,
				$purc_schd_no,
				$rcpt_iv_d_no,
				$purc_src_typ,
				$purc_src_no,
				$purc_ret_act_d_no,
				$sync_flg,
				$rsn_cd,
				$ap_typ,
				$purc_id_typ,
				$purc_typ,
				$mfg_inst_no,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$ver_no,
				$itm_nm,
				$iv_itm_nm,
				$sppl_itm_cd,
				$sppl_itm_nm,
				$sundry_itm_flg,
				$trd_unit_cd,
				$trd_unit_qty,
				$base_unit_cd,
				$base_unit_qty,
				$tax_cd,
				$accpt_dfct_flg,
				$interim_flg,
				$trd_cur_upri,
				$dscnt_rsn_cd,
				$trd_cur_dscnt_amt,
				$trd_cur_amt,
				$trd_cur_tax_amt,
				$trd_cur_proc_upri,
				$trd_cur_proc_amt,
				$trd_cur_onr_prov_upri,
				$trd_cur_onr_prov_amt,
				$base_cur_upri,
				$base_cur_dscnt_amt,
				$base_cur_amt,
				$base_cur_tax_amt,
				$base_cur_proc_upri,
				$base_cur_proc_amt,
				$base_cur_onr_prov_upri,
				$base_cur_onr_prov_amt,
				$ptax_cur_upri,
				$ptax_cur_dscnt_amt,
				$ptax_cur_amt,
				$ptax_cur_tax_amt,
				$ptax_cur_proc_upri,
				$ptax_cur_proc_amt,
				$ptax_cur_onr_prov_upri,
				$ptax_cur_onr_prov_amt,
				$wtax_rate,
				$wtax_amt,
				$re_arr_flg,
				$re_arr_loc_cd,
				$re_arr_loc_wg_cd,
				$re_arr_str_ln_cd,
				$re_arr_sync_flg,
				$re_arr_rqst_tm,
				$re_arr_purc_schd_dt,
				$trd_unit_re_arr_qty,
				$base_unit_re_arr_qty,
				$ncv_flg,
				$maker_cd,
				$ap_dpt_cd,
				$pay_crryovr_times,
				$bd_itm_cd,
				$bd_itm_sub1,
				$bd_itm_sub2,
				$bd_itm_sub3,
				$bd_sno1,
				$bd_sno2,
				$bd_sno3,
				$bd_sno4,
				$bd_lot_no,
				$bd_sublot_no,
				$bd_ctg_cd,
				$bd_oper_cd,
				$bd_iv_no,
				$bd_loc_cd,
				$bd_po_no,
				$bd_slo_no,
				$bd_dpt_cd,
				$bd_wg_cd,
				$bd_bp_cd,
				$intr_d_rmrks,
				$trd_d_rmrks,
				$sub_d_char1,
				$sub_d_char2,
				$sub_d_char3,
				$ref_purc_act_no,
				$ref_purc_act_seq,
				$ref_purc_act_d_no,
				$ref_purc_act_d_seq,
				$base_purc_ac_dt,
				$gd_cd,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$in_to_loc_cd,
				$in_to_loc_wg_cd,
				$str_ln_cd,
				$lot_no,
				$sublot_no,
				$quality_typ,
				$stk_insp_typ,
				$stk_id_typ,
				$bp_lot_no,
				$bp_dlv_slip_no,
				$bp_dlv_slip_d_no,
				$dscnt_po_no,
				$dscnt_slo_no,
				$disp_seq,
				$edi_flg,
				$stk_mng_typ,
				$upri_not_tgt_flg
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
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
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
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
	protected Purc_Chk01_DtlR_MC_A(ConstMetaList<? extends Purc_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Purc_Chk01_DtlR clone() {
		return (Purc_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Purc_Chk01_DtlR createInstance() {
		return (Purc_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Purc_Chk01_DtlR getValues(String... names) {
		return (Purc_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Not for check flg. チェック対象外ＦＬＧ.<p>
	 *
	 */
	public boolean no_chk_flg() {
		return getConstBoolean(offset + 0, $no_chk_flg);
	}

	/**
	 * Not for check flg. チェック対象外ＦＬＧ.<p>
	 *
	 */
	public void no_chk_flg(boolean value) {
		setConstBoolean(offset + 0, $no_chk_flg, value);
	}


	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 1, $peg_no, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 2, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 2, $err_flg, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 3, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 3, $data_crud_typ, value);
	}


	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public String arr_ptn_typ() {
		return getConstString(offset + 4, $arr_ptn_typ);
	}

	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public void arr_ptn_typ(String value) {
		setConstString(offset + 4, $arr_ptn_typ, value);
	}


	/**
	 * Purchase result header 仕入実績ヘッダ.<p>
	 *
	 */
	public mcframe.serverMS.dbc.MST_PURC_ACT_R pa(){
		return (mcframe.serverMS.dbc.MST_PURC_ACT_R) getConstInnerRow(offset + 5, $pa);
	}
	
	/**
	 * Purchase result header 仕入実績ヘッダ.<p>
	 *
	 */
	public void pa(mcframe.serverMS.dbc.MST_PURC_ACT_R row){
		setConstInnerRow(offset + 5, $pa, row);
	}


	public String purc_tax_calc_typ() {
		return getConstString(offset + 6, $purc_tax_calc_typ);
	}

	public void purc_tax_calc_typ(String value) {
		setConstString(offset + 6, $purc_tax_calc_typ, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 7, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 7, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 7, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 7, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 7, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 7, $amt_dec_place, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 8, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 8, $can_ac_dt, value);
	}


	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return getConstString(offset + 9, $arr_schd_no);
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		setConstString(offset + 9, $arr_schd_no, value);
	}


	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public String arr_act_no() {
		return getConstString(offset + 10, $arr_act_no);
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public void arr_act_no(String value) {
		setConstString(offset + 10, $arr_act_no, value);
	}


	/**
	 * Purchase result details 仕入実績明細.<p>
	 *
	 */
	public mcframe.serverMS.dbc.MST_PURC_ACT_D_R pad(){
		return (mcframe.serverMS.dbc.MST_PURC_ACT_D_R) getConstInnerRow(offset + 11, $pad);
	}
	
	/**
	 * Purchase result details 仕入実績明細.<p>
	 *
	 */
	public void pad(mcframe.serverMS.dbc.MST_PURC_ACT_D_R row){
		setConstInnerRow(offset + 11, $pad, row);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 12, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 12, $pack_unit_cd, value);
	}


	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 13, $pack_unit_qty);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 13, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 13, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 13, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 13, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 13, $pack_unit_qty, value);
	}


	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 14, $inc_tax_flg);
	}

	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 14, $inc_tax_flg, value);
	}


	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public String tax_typ() {
		return getConstString(offset + 15, $tax_typ);
	}

	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public void tax_typ(String value) {
		setConstString(offset + 15, $tax_typ, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 * 伝票単位の税計算に使用する
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 16, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 * 伝票単位の税計算に使用する
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 16, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 * 伝票単位の税計算に使用する
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 16, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 * 伝票単位の税計算に使用する
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 16, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 * 伝票単位の税計算に使用する
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 16, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 * 伝票単位の税計算に使用する
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 16, $tax_rate, value);
	}


	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return getConstString(offset + 17, $purc_tax_rnd_typ);
	}

	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		setConstString(offset + 17, $purc_tax_rnd_typ, value);
	}


	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 18, $abort_flg);
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 18, $abort_flg, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 19, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 19, $asset_mng_typ, value);
	}


	/**
	 * Expenses purchasing flg. 経費購買ＦＬＧ.<p>
	 *
	 */
	public boolean xpns_po_flg() {
		return getConstBoolean(offset + 20, $xpns_po_flg);
	}

	/**
	 * Expenses purchasing flg. 経費購買ＦＬＧ.<p>
	 *
	 */
	public void xpns_po_flg(boolean value) {
		setConstBoolean(offset + 20, $xpns_po_flg, value);
	}


	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public MCNumber purc_cont_qty() {
		return getConstNumber(offset + 21, $purc_cont_qty);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(MCNumber value) {
		setConstNumber(offset + 21, $purc_cont_qty, value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(int value) {
		setConstNumber(offset + 21, $purc_cont_qty, value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(long value) {
		setConstNumber(offset + 21, $purc_cont_qty, value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(float value) {
		setConstNumber(offset + 21, $purc_cont_qty, value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(double value) {
		setConstNumber(offset + 21, $purc_cont_qty, value);
	}


	/**
	 * Lot creation flg. ロット作成ＦＬＧ.<p>
	 *
	 */
	public boolean crt_lot_flg() {
		return getConstBoolean(offset + 22, $crt_lot_flg);
	}

	/**
	 * Lot creation flg. ロット作成ＦＬＧ.<p>
	 *
	 */
	public void crt_lot_flg(boolean value) {
		setConstBoolean(offset + 22, $crt_lot_flg, value);
	}


	/**
	 * Grading before purchase recording cd. 仕入計上前格付ＣＤ.<p>
	 *
	 */
	public String from_gd_cd() {
		return getConstString(offset + 23, $from_gd_cd);
	}

	/**
	 * Grading before purchase recording cd. 仕入計上前格付ＣＤ.<p>
	 *
	 */
	public void from_gd_cd(String value) {
		setConstString(offset + 23, $from_gd_cd, value);
	}


	/**
	 * Purchase GI location WG cd. 仕入出庫場所ＷＧ ＣＤ.<p>
	 *
	 */
	public String gi_wg_cd() {
		return getConstString(offset + 24, $gi_wg_cd);
	}

	/**
	 * Purchase GI location WG cd. 仕入出庫場所ＷＧ ＣＤ.<p>
	 *
	 */
	public void gi_wg_cd(String value) {
		setConstString(offset + 24, $gi_wg_cd, value);
	}


	/**
	 * Purchase GI location cd. 仕入出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 25, $gi_loc_cd);
	}

	/**
	 * Purchase GI location cd. 仕入出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 25, $gi_loc_cd, value);
	}


	/**
	 * Purchase GI rack/line cd. 仕入出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return getConstString(offset + 26, $gi_str_ln_cd);
	}

	/**
	 * Purchase GI rack/line cd. 仕入出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		setConstString(offset + 26, $gi_str_ln_cd, value);
	}


	/**
	 * Purchase GI SKU cd. 仕入出庫荷姿単位ＣＤ.<p>
	 *
	 */
	public String gi_unit_cd() {
		return getConstString(offset + 27, $gi_unit_cd);
	}

	/**
	 * Purchase GI SKU cd. 仕入出庫荷姿単位ＣＤ.<p>
	 *
	 */
	public void gi_unit_cd(String value) {
		setConstString(offset + 27, $gi_unit_cd, value);
	}


	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public MCDate ship_fr_valid_dt() {
		return getConstDate(offset + 28, $ship_fr_valid_dt);
	}

	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public void ship_fr_valid_dt(MCDate value) {
		setConstDate(offset + 28, $ship_fr_valid_dt, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			return arr_ptn_typ();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($from_gd_cd.equalsIgnoreCase(name)) {
			return from_gd_cd();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_unit_cd.equalsIgnoreCase(name)) {
			return gi_unit_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			return purc_cont_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			return ship_fr_valid_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($no_chk_flg.equalsIgnoreCase(name)) {
			return no_chk_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($xpns_po_flg.equalsIgnoreCase(name)) {
			return xpns_po_flg();
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			return crt_lot_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			return arr_ptn_typ();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($from_gd_cd.equalsIgnoreCase(name)) {
			return from_gd_cd();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_unit_cd.equalsIgnoreCase(name)) {
			return gi_unit_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			return purc_cont_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			return ship_fr_valid_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($no_chk_flg.equalsIgnoreCase(name)) {
			return no_chk_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($xpns_po_flg.equalsIgnoreCase(name)) {
			return xpns_po_flg();
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			return crt_lot_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			arr_ptn_typ(value);
			return;
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($from_gd_cd.equalsIgnoreCase(name)) {
			from_gd_cd(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_unit_cd.equalsIgnoreCase(name)) {
			gi_unit_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			ship_fr_valid_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($no_chk_flg.equalsIgnoreCase(name)) {
			no_chk_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($xpns_po_flg.equalsIgnoreCase(name)) {
			xpns_po_flg(value);
			return;
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			crt_lot_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			arr_ptn_typ(value);
			return;
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($from_gd_cd.equalsIgnoreCase(name)) {
			from_gd_cd(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_unit_cd.equalsIgnoreCase(name)) {
			gi_unit_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			ship_fr_valid_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($no_chk_flg.equalsIgnoreCase(name)) {
			no_chk_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($xpns_po_flg.equalsIgnoreCase(name)) {
			xpns_po_flg(value);
			return;
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			crt_lot_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($pa.equalsIgnoreCase(name)) {
			return pa();
		}
		if ($pad.equalsIgnoreCase(name)) {
			return pad();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($pa.equalsIgnoreCase(name)) {
			pa(
				((MCContainerMeta) pa_META).castInnerRow(mcframe.serverMS.dbc.MST_PURC_ACT_R.class, value)
			);
			return;
		}
		if ($pad.equalsIgnoreCase(name)) {
			pad(
				((MCContainerMeta) pad_META).castInnerRow(mcframe.serverMS.dbc.MST_PURC_ACT_D_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return pa().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		pa().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return pa().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		pa().trd_ptn_typ(value);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return pa().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		pa().po_no(value);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return pa().purc_dpt_cd();
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		pa().purc_dpt_cd(value);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return pa().purc_usr_cd();
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		pa().purc_usr_cd(value);
	}

	/**
	 * WG cd. ＷＧ　ＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return pa().wg_cd();
	}

	/**
	 * WG cd. ＷＧ　ＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		pa().wg_cd(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return pa().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		pa().sppl_cd(value);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return pa().asppl_cd();
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		pa().asppl_cd(value);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return pa().bsppl_cd();
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		pa().bsppl_cd(value);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return pa().psppl_cd();
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		pa().psppl_cd(value);
	}

	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public String cred_cd() {
		return pa().cred_cd();
	}

	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public void cred_cd(String value) {
		pa().cred_cd(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return pa().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		pa().trd_cur_cd(value);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return pa().ptax_cur_cd();
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		pa().ptax_cur_cd(value);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return pa().base_cur_cd();
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		pa().base_cur_cd(value);
	}

	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public MCDate purc_dt() {
		return pa().purc_dt();
	}

	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public void purc_dt(MCDate value) {
		pa().purc_dt(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return pa().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		pa().ac_dt(value);
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public MCDate pay_basis_dt() {
		return pa().pay_basis_dt();
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public void pay_basis_dt(MCDate value) {
		pa().pay_basis_dt(value);
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return pa().pay_schd_dt();
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		pa().pay_schd_dt(value);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return pa().rcpt_iv_no();
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		pa().rcpt_iv_no(value);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return pa().rcpt_iv_mng_no();
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		pa().rcpt_iv_mng_no(value);
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public MCNumber rcpt_iv_rev() {
		return pa().rcpt_iv_rev();
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(MCNumber value) {
		pa().rcpt_iv_rev(value);
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(int value) {
		pa().rcpt_iv_rev(value);
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(long value) {
		pa().rcpt_iv_rev(value);
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(float value) {
		pa().rcpt_iv_rev(value);
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(double value) {
		pa().rcpt_iv_rev(value);
	}

	/**
	 * Corresponding purchase I/V No. 対応受領インボイスＮＯ.<p>
	 *
	 */
	public String ref_rcpt_iv_no() {
		return pa().ref_rcpt_iv_no();
	}

	/**
	 * Corresponding purchase I/V No. 対応受領インボイスＮＯ.<p>
	 *
	 */
	public void ref_rcpt_iv_no(String value) {
		pa().ref_rcpt_iv_no(value);
	}

	/**
	 * Purchase return result No. 仕入返品実績ＮＯ.<p>
	 *
	 */
	public String purc_ret_act_no() {
		return pa().purc_ret_act_no();
	}

	/**
	 * Purchase return result No. 仕入返品実績ＮＯ.<p>
	 *
	 */
	public void purc_ret_act_no(String value) {
		pa().purc_ret_act_no(value);
	}

	/**
	 * Purchase return result rev. number 仕入返品実績改訂番号.<p>
	 *
	 */
	public MCNumber purc_ret_act_rev() {
		return pa().purc_ret_act_rev();
	}

	/**
	 * Purchase return result rev. number 仕入返品実績改訂番号.<p>
	 *
	 */
	public void purc_ret_act_rev(MCNumber value) {
		pa().purc_ret_act_rev(value);
	}

	/**
	 * Purchase return result rev. number 仕入返品実績改訂番号.<p>
	 *
	 */
	public void purc_ret_act_rev(int value) {
		pa().purc_ret_act_rev(value);
	}

	/**
	 * Purchase return result rev. number 仕入返品実績改訂番号.<p>
	 *
	 */
	public void purc_ret_act_rev(long value) {
		pa().purc_ret_act_rev(value);
	}

	/**
	 * Purchase return result rev. number 仕入返品実績改訂番号.<p>
	 *
	 */
	public void purc_ret_act_rev(float value) {
		pa().purc_ret_act_rev(value);
	}

	/**
	 * Purchase return result rev. number 仕入返品実績改訂番号.<p>
	 *
	 */
	public void purc_ret_act_rev(double value) {
		pa().purc_ret_act_rev(value);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return pa().xrate_cd();
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		pa().xrate_cd(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return pa().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		pa().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		pa().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		pa().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		pa().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		pa().xrate(value);
	}

	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public MCDate ptax_dt() {
		return pa().ptax_dt();
	}

	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public void ptax_dt(MCDate value) {
		pa().ptax_dt(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return pa().ptax_xrate();
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		pa().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		pa().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		pa().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		pa().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		pa().ptax_xrate(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return pa().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		pa().intr_rmrks(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return pa().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		pa().trd_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return pa().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		pa().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return pa().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		pa().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return pa().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		pa().sub_char3(value);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return pa().tterm_cd1();
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		pa().tterm_cd1(value);
	}

	/**
	 * Transaction terms 1 remarks 取引条件１備考.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return pa().tterm_rmrks1();
	}

	/**
	 * Transaction terms 1 remarks 取引条件１備考.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		pa().tterm_rmrks1(value);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return pa().tterm_cd2();
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		pa().tterm_cd2(value);
	}

	/**
	 * Transaction terms 2 remarks 取引条件２備考.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return pa().tterm_rmrks2();
	}

	/**
	 * Transaction terms 2 remarks 取引条件２備考.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		pa().tterm_rmrks2(value);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return pa().tterm_cd3();
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		pa().tterm_cd3(value);
	}

	/**
	 * Transaction terms 3 remarks 取引条件３備考.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return pa().tterm_rmrks3();
	}

	/**
	 * Transaction terms 3 remarks 取引条件３備考.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		pa().tterm_rmrks3(value);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return pad().purc_act_d_no();
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		pad().purc_act_d_no(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public MCNumber purc_act_d_seq() {
		return pad().purc_act_d_seq();
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(MCNumber value) {
		pad().purc_act_d_seq(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(int value) {
		pad().purc_act_d_seq(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(long value) {
		pad().purc_act_d_seq(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(float value) {
		pad().purc_act_d_seq(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(double value) {
		pad().purc_act_d_seq(value);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return pad().purc_act_no();
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		pad().purc_act_no(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public MCNumber purc_act_seq() {
		return pad().purc_act_seq();
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(MCNumber value) {
		pad().purc_act_seq(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(int value) {
		pad().purc_act_seq(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(long value) {
		pad().purc_act_seq(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(float value) {
		pad().purc_act_seq(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(double value) {
		pad().purc_act_seq(value);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return pad().po_d_no();
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		pad().po_d_no(value);
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public String purc_schd_no() {
		return pad().purc_schd_no();
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public void purc_schd_no(String value) {
		pad().purc_schd_no(value);
	}

	/**
	 * Purchase invoice details No. 受領インボイス明細ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_d_no() {
		return pad().rcpt_iv_d_no();
	}

	/**
	 * Purchase invoice details No. 受領インボイス明細ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_d_no(String value) {
		pad().rcpt_iv_d_no(value);
	}

	/**
	 * Purchase source type 仕入作成元区分.<p>
	 *
	 */
	public String purc_src_typ() {
		return pad().purc_src_typ();
	}

	/**
	 * Purchase source type 仕入作成元区分.<p>
	 *
	 */
	public void purc_src_typ(String value) {
		pad().purc_src_typ(value);
	}

	/**
	 * Purchase source No. 仕入作成元ＮＯ.<p>
	 *
	 */
	public String purc_src_no() {
		return pad().purc_src_no();
	}

	/**
	 * Purchase source No. 仕入作成元ＮＯ.<p>
	 *
	 */
	public void purc_src_no(String value) {
		pad().purc_src_no(value);
	}

	/**
	 * Purchase return result details No. 仕入返品実績明細ＮＯ.<p>
	 *
	 */
	public String purc_ret_act_d_no() {
		return pad().purc_ret_act_d_no();
	}

	/**
	 * Purchase return result details No. 仕入返品実績明細ＮＯ.<p>
	 *
	 */
	public void purc_ret_act_d_no(String value) {
		pad().purc_ret_act_d_no(value);
	}

	/**
	 * Simultaneous recording flg. 同時計上ＦＬＧ.<p>
	 *
	 */
	public boolean sync_flg() {
		return pad().sync_flg();
	}

	/**
	 * Simultaneous recording flg. 同時計上ＦＬＧ.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		pad().sync_flg(value);
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return pad().rsn_cd();
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		pad().rsn_cd(value);
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public String ap_typ() {
		return pad().ap_typ();
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public void ap_typ(String value) {
		pad().ap_typ(value);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return pad().purc_id_typ();
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		pad().purc_id_typ(value);
	}

	/**
	 * Purchase type 購買区分.<p>
	 *
	 */
	public String purc_typ() {
		return pad().purc_typ();
	}

	/**
	 * Purchase type 購買区分.<p>
	 *
	 */
	public void purc_typ(String value) {
		pad().purc_typ(value);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return pad().mfg_inst_no();
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		pad().mfg_inst_no(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return pad().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		pad().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return pad().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		pad().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return pad().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		pad().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return pad().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		pad().itm_sub3(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return pad().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		pad().ver_no(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return pad().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		pad().itm_nm(value);
	}

	/**
	 * Item name for import 輸入用品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return pad().iv_itm_nm();
	}

	/**
	 * Item name for import 輸入用品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		pad().iv_itm_nm(value);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return pad().sppl_itm_cd();
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		pad().sppl_itm_cd(value);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return pad().sppl_itm_nm();
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		pad().sppl_itm_nm(value);
	}

	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return pad().sundry_itm_flg();
	}

	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		pad().sundry_itm_flg(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return pad().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		pad().trd_unit_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return pad().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		pad().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		pad().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		pad().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		pad().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		pad().trd_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return pad().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		pad().base_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return pad().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		pad().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		pad().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		pad().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		pad().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		pad().base_unit_qty(value);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return pad().tax_cd();
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		pad().tax_cd(value);
	}

	/**
	 * Acceptance defective flg. 検収不良ＦＬＧ.<p>
	 *
	 */
	public boolean accpt_dfct_flg() {
		return pad().accpt_dfct_flg();
	}

	/**
	 * Acceptance defective flg. 検収不良ＦＬＧ.<p>
	 *
	 */
	public void accpt_dfct_flg(boolean value) {
		pad().accpt_dfct_flg(value);
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public boolean interim_flg() {
		return pad().interim_flg();
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		pad().interim_flg(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return pad().trd_cur_upri();
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		pad().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		pad().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		pad().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		pad().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		pad().trd_cur_upri(value);
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return pad().dscnt_rsn_cd();
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		pad().dscnt_rsn_cd(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return pad().trd_cur_dscnt_amt();
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		pad().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		pad().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		pad().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		pad().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		pad().trd_cur_dscnt_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return pad().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		pad().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		pad().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		pad().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		pad().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		pad().trd_cur_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return pad().trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		pad().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		pad().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		pad().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		pad().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		pad().trd_cur_tax_amt(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public MCNumber trd_cur_proc_upri() {
		return pad().trd_cur_proc_upri();
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(MCNumber value) {
		pad().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(int value) {
		pad().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(long value) {
		pad().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(float value) {
		pad().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(double value) {
		pad().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return pad().trd_cur_proc_amt();
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		pad().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		pad().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		pad().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		pad().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		pad().trd_cur_proc_amt(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_upri() {
		return pad().trd_cur_onr_prov_upri();
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(MCNumber value) {
		pad().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(int value) {
		pad().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(long value) {
		pad().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(float value) {
		pad().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(double value) {
		pad().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return pad().trd_cur_onr_prov_amt();
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		pad().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		pad().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		pad().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		pad().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		pad().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return pad().base_cur_upri();
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		pad().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		pad().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		pad().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		pad().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		pad().base_cur_upri(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return pad().base_cur_dscnt_amt();
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		pad().base_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		pad().base_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		pad().base_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		pad().base_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		pad().base_cur_dscnt_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return pad().base_cur_amt();
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		pad().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		pad().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		pad().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		pad().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		pad().base_cur_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return pad().base_cur_tax_amt();
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		pad().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		pad().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		pad().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		pad().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		pad().base_cur_tax_amt(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public MCNumber base_cur_proc_upri() {
		return pad().base_cur_proc_upri();
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(MCNumber value) {
		pad().base_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(int value) {
		pad().base_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(long value) {
		pad().base_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(float value) {
		pad().base_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(double value) {
		pad().base_cur_proc_upri(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public MCNumber base_cur_proc_amt() {
		return pad().base_cur_proc_amt();
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(MCNumber value) {
		pad().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(int value) {
		pad().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(long value) {
		pad().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(float value) {
		pad().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(double value) {
		pad().base_cur_proc_amt(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_upri() {
		return pad().base_cur_onr_prov_upri();
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(MCNumber value) {
		pad().base_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(int value) {
		pad().base_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(long value) {
		pad().base_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(float value) {
		pad().base_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(double value) {
		pad().base_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_amt() {
		return pad().base_cur_onr_prov_amt();
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(MCNumber value) {
		pad().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(int value) {
		pad().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(long value) {
		pad().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(float value) {
		pad().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(double value) {
		pad().base_cur_onr_prov_amt(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public MCNumber ptax_cur_upri() {
		return pad().ptax_cur_upri();
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(MCNumber value) {
		pad().ptax_cur_upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(int value) {
		pad().ptax_cur_upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(long value) {
		pad().ptax_cur_upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(float value) {
		pad().ptax_cur_upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(double value) {
		pad().ptax_cur_upri(value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public MCNumber ptax_cur_dscnt_amt() {
		return pad().ptax_cur_dscnt_amt();
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(MCNumber value) {
		pad().ptax_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(int value) {
		pad().ptax_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(long value) {
		pad().ptax_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(float value) {
		pad().ptax_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(double value) {
		pad().ptax_cur_dscnt_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return pad().ptax_cur_amt();
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		pad().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		pad().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		pad().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		pad().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		pad().ptax_cur_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public MCNumber ptax_cur_tax_amt() {
		return pad().ptax_cur_tax_amt();
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(MCNumber value) {
		pad().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(int value) {
		pad().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(long value) {
		pad().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(float value) {
		pad().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(double value) {
		pad().ptax_cur_tax_amt(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public MCNumber ptax_cur_proc_upri() {
		return pad().ptax_cur_proc_upri();
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(MCNumber value) {
		pad().ptax_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(int value) {
		pad().ptax_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(long value) {
		pad().ptax_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(float value) {
		pad().ptax_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(double value) {
		pad().ptax_cur_proc_upri(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public MCNumber ptax_cur_proc_amt() {
		return pad().ptax_cur_proc_amt();
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(MCNumber value) {
		pad().ptax_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(int value) {
		pad().ptax_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(long value) {
		pad().ptax_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(float value) {
		pad().ptax_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(double value) {
		pad().ptax_cur_proc_amt(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public MCNumber ptax_cur_onr_prov_upri() {
		return pad().ptax_cur_onr_prov_upri();
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(MCNumber value) {
		pad().ptax_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(int value) {
		pad().ptax_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(long value) {
		pad().ptax_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(float value) {
		pad().ptax_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(double value) {
		pad().ptax_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public MCNumber ptax_cur_onr_prov_amt() {
		return pad().ptax_cur_onr_prov_amt();
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(MCNumber value) {
		pad().ptax_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(int value) {
		pad().ptax_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(long value) {
		pad().ptax_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(float value) {
		pad().ptax_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(double value) {
		pad().ptax_cur_onr_prov_amt(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return pad().wtax_rate();
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		pad().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		pad().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		pad().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		pad().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		pad().wtax_rate(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return pad().wtax_amt();
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		pad().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		pad().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		pad().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		pad().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		pad().wtax_amt(value);
	}

	/**
	 * Re-receipt flg. 再入荷ＦＬＧ.<p>
	 *
	 */
	public boolean re_arr_flg() {
		return pad().re_arr_flg();
	}

	/**
	 * Re-receipt flg. 再入荷ＦＬＧ.<p>
	 *
	 */
	public void re_arr_flg(boolean value) {
		pad().re_arr_flg(value);
	}

	/**
	 * Re-receipt location cd. 再入荷場所ＣＤ.<p>
	 *
	 */
	public String re_arr_loc_cd() {
		return pad().re_arr_loc_cd();
	}

	/**
	 * Re-receipt location cd. 再入荷場所ＣＤ.<p>
	 *
	 */
	public void re_arr_loc_cd(String value) {
		pad().re_arr_loc_cd(value);
	}

	/**
	 * Re-receipt location WG cd. 再入荷場所ＷＧ ＣＤ.<p>
	 *
	 */
	public String re_arr_loc_wg_cd() {
		return pad().re_arr_loc_wg_cd();
	}

	/**
	 * Re-receipt location WG cd. 再入荷場所ＷＧ ＣＤ.<p>
	 *
	 */
	public void re_arr_loc_wg_cd(String value) {
		pad().re_arr_loc_wg_cd(value);
	}

	/**
	 * Re-receipt rack/line cd. 再入荷棚・ラインＣＤ.<p>
	 *
	 */
	public String re_arr_str_ln_cd() {
		return pad().re_arr_str_ln_cd();
	}

	/**
	 * Re-receipt rack/line cd. 再入荷棚・ラインＣＤ.<p>
	 *
	 */
	public void re_arr_str_ln_cd(String value) {
		pad().re_arr_str_ln_cd(value);
	}

	/**
	 * Re-receipt simultaneously recording flg. 再入荷同時計上ＦＬＧ.<p>
	 *
	 */
	public boolean re_arr_sync_flg() {
		return pad().re_arr_sync_flg();
	}

	/**
	 * Re-receipt simultaneously recording flg. 再入荷同時計上ＦＬＧ.<p>
	 *
	 */
	public void re_arr_sync_flg(boolean value) {
		pad().re_arr_sync_flg(value);
	}

	/**
	 * Desired re-receipt date and time 再入荷希望日時.<p>
	 *
	 */
	public MCDate re_arr_rqst_tm() {
		return pad().re_arr_rqst_tm();
	}

	/**
	 * Desired re-receipt date and time 再入荷希望日時.<p>
	 *
	 */
	public void re_arr_rqst_tm(MCDate value) {
		pad().re_arr_rqst_tm(value);
	}

	/**
	 * Scheduled re-receipt purchase date 再入荷仕入予定日.<p>
	 *
	 */
	public MCDate re_arr_purc_schd_dt() {
		return pad().re_arr_purc_schd_dt();
	}

	/**
	 * Scheduled re-receipt purchase date 再入荷仕入予定日.<p>
	 *
	 */
	public void re_arr_purc_schd_dt(MCDate value) {
		pad().re_arr_purc_schd_dt(value);
	}

	/**
	 * Transaction unit re-receipt qty. 取引単位再入荷数量.<p>
	 *
	 */
	public MCNumber trd_unit_re_arr_qty() {
		return pad().trd_unit_re_arr_qty();
	}

	/**
	 * Transaction unit re-receipt qty. 取引単位再入荷数量.<p>
	 *
	 */
	public void trd_unit_re_arr_qty(MCNumber value) {
		pad().trd_unit_re_arr_qty(value);
	}

	/**
	 * Transaction unit re-receipt qty. 取引単位再入荷数量.<p>
	 *
	 */
	public void trd_unit_re_arr_qty(int value) {
		pad().trd_unit_re_arr_qty(value);
	}

	/**
	 * Transaction unit re-receipt qty. 取引単位再入荷数量.<p>
	 *
	 */
	public void trd_unit_re_arr_qty(long value) {
		pad().trd_unit_re_arr_qty(value);
	}

	/**
	 * Transaction unit re-receipt qty. 取引単位再入荷数量.<p>
	 *
	 */
	public void trd_unit_re_arr_qty(float value) {
		pad().trd_unit_re_arr_qty(value);
	}

	/**
	 * Transaction unit re-receipt qty. 取引単位再入荷数量.<p>
	 *
	 */
	public void trd_unit_re_arr_qty(double value) {
		pad().trd_unit_re_arr_qty(value);
	}

	/**
	 * Base unit re-receipt qty. 基準単位再入荷数量.<p>
	 *
	 */
	public MCNumber base_unit_re_arr_qty() {
		return pad().base_unit_re_arr_qty();
	}

	/**
	 * Base unit re-receipt qty. 基準単位再入荷数量.<p>
	 *
	 */
	public void base_unit_re_arr_qty(MCNumber value) {
		pad().base_unit_re_arr_qty(value);
	}

	/**
	 * Base unit re-receipt qty. 基準単位再入荷数量.<p>
	 *
	 */
	public void base_unit_re_arr_qty(int value) {
		pad().base_unit_re_arr_qty(value);
	}

	/**
	 * Base unit re-receipt qty. 基準単位再入荷数量.<p>
	 *
	 */
	public void base_unit_re_arr_qty(long value) {
		pad().base_unit_re_arr_qty(value);
	}

	/**
	 * Base unit re-receipt qty. 基準単位再入荷数量.<p>
	 *
	 */
	public void base_unit_re_arr_qty(float value) {
		pad().base_unit_re_arr_qty(value);
	}

	/**
	 * Base unit re-receipt qty. 基準単位再入荷数量.<p>
	 *
	 */
	public void base_unit_re_arr_qty(double value) {
		pad().base_unit_re_arr_qty(value);
	}

	/**
	 * Free of charge flg. 無償ＦＬＧ.<p>
	 *
	 */
	public boolean ncv_flg() {
		return pad().ncv_flg();
	}

	/**
	 * Free of charge flg. 無償ＦＬＧ.<p>
	 *
	 */
	public void ncv_flg(boolean value) {
		pad().ncv_flg(value);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return pad().maker_cd();
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		pad().maker_cd(value);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return pad().ap_dpt_cd();
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		pad().ap_dpt_cd(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return pad().pay_crryovr_times();
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		pad().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		pad().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		pad().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		pad().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		pad().pay_crryovr_times(value);
	}

	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public String bd_itm_cd() {
		return pad().bd_itm_cd();
	}

	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public void bd_itm_cd(String value) {
		pad().bd_itm_cd(value);
	}

	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public String bd_itm_sub1() {
		return pad().bd_itm_sub1();
	}

	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public void bd_itm_sub1(String value) {
		pad().bd_itm_sub1(value);
	}

	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public String bd_itm_sub2() {
		return pad().bd_itm_sub2();
	}

	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public void bd_itm_sub2(String value) {
		pad().bd_itm_sub2(value);
	}

	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public String bd_itm_sub3() {
		return pad().bd_itm_sub3();
	}

	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public void bd_itm_sub3(String value) {
		pad().bd_itm_sub3(value);
	}

	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public String bd_sno1() {
		return pad().bd_sno1();
	}

	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public void bd_sno1(String value) {
		pad().bd_sno1(value);
	}

	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public String bd_sno2() {
		return pad().bd_sno2();
	}

	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public void bd_sno2(String value) {
		pad().bd_sno2(value);
	}

	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public String bd_sno3() {
		return pad().bd_sno3();
	}

	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public void bd_sno3(String value) {
		pad().bd_sno3(value);
	}

	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public String bd_sno4() {
		return pad().bd_sno4();
	}

	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public void bd_sno4(String value) {
		pad().bd_sno4(value);
	}

	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public String bd_lot_no() {
		return pad().bd_lot_no();
	}

	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public void bd_lot_no(String value) {
		pad().bd_lot_no(value);
	}

	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public String bd_sublot_no() {
		return pad().bd_sublot_no();
	}

	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public void bd_sublot_no(String value) {
		pad().bd_sublot_no(value);
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public String bd_ctg_cd() {
		return pad().bd_ctg_cd();
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public void bd_ctg_cd(String value) {
		pad().bd_ctg_cd(value);
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public String bd_oper_cd() {
		return pad().bd_oper_cd();
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public void bd_oper_cd(String value) {
		pad().bd_oper_cd(value);
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public String bd_iv_no() {
		return pad().bd_iv_no();
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public void bd_iv_no(String value) {
		pad().bd_iv_no(value);
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public String bd_loc_cd() {
		return pad().bd_loc_cd();
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public void bd_loc_cd(String value) {
		pad().bd_loc_cd(value);
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public String bd_po_no() {
		return pad().bd_po_no();
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public void bd_po_no(String value) {
		pad().bd_po_no(value);
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public String bd_slo_no() {
		return pad().bd_slo_no();
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public void bd_slo_no(String value) {
		pad().bd_slo_no(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return pad().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		pad().bd_dpt_cd(value);
	}

	/**
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public String bd_wg_cd() {
		return pad().bd_wg_cd();
	}

	/**
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public void bd_wg_cd(String value) {
		pad().bd_wg_cd(value);
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public String bd_bp_cd() {
		return pad().bd_bp_cd();
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public void bd_bp_cd(String value) {
		pad().bd_bp_cd(value);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return pad().intr_rmrks();
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		pad().intr_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return pad().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		pad().trd_d_rmrks(value);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String sub_d_char1() {
		return pad().sub_char1();
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void sub_d_char1(String value) {
		pad().sub_char1(value);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String sub_d_char2() {
		return pad().sub_char2();
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void sub_d_char2(String value) {
		pad().sub_char2(value);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String sub_d_char3() {
		return pad().sub_char3();
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void sub_d_char3(String value) {
		pad().sub_char3(value);
	}

	/**
	 * Reference purchase result No. 参照仕入実績ＮＯ.<p>
	 *
	 */
	public String ref_purc_act_no() {
		return pad().ref_purc_act_no();
	}

	/**
	 * Reference purchase result No. 参照仕入実績ＮＯ.<p>
	 *
	 */
	public void ref_purc_act_no(String value) {
		pad().ref_purc_act_no(value);
	}

	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public MCNumber ref_purc_act_seq() {
		return pad().ref_purc_act_seq();
	}

	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public void ref_purc_act_seq(MCNumber value) {
		pad().ref_purc_act_seq(value);
	}

	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public void ref_purc_act_seq(int value) {
		pad().ref_purc_act_seq(value);
	}

	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public void ref_purc_act_seq(long value) {
		pad().ref_purc_act_seq(value);
	}

	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public void ref_purc_act_seq(float value) {
		pad().ref_purc_act_seq(value);
	}

	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public void ref_purc_act_seq(double value) {
		pad().ref_purc_act_seq(value);
	}

	/**
	 * Reference purchase result details No. 参照仕入実績明細ＮＯ.<p>
	 *
	 */
	public String ref_purc_act_d_no() {
		return pad().ref_purc_act_d_no();
	}

	/**
	 * Reference purchase result details No. 参照仕入実績明細ＮＯ.<p>
	 *
	 */
	public void ref_purc_act_d_no(String value) {
		pad().ref_purc_act_d_no(value);
	}

	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public MCNumber ref_purc_act_d_seq() {
		return pad().ref_purc_act_d_seq();
	}

	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public void ref_purc_act_d_seq(MCNumber value) {
		pad().ref_purc_act_d_seq(value);
	}

	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public void ref_purc_act_d_seq(int value) {
		pad().ref_purc_act_d_seq(value);
	}

	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public void ref_purc_act_d_seq(long value) {
		pad().ref_purc_act_d_seq(value);
	}

	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public void ref_purc_act_d_seq(float value) {
		pad().ref_purc_act_d_seq(value);
	}

	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public void ref_purc_act_d_seq(double value) {
		pad().ref_purc_act_d_seq(value);
	}

	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public MCDate base_purc_ac_dt() {
		return pad().base_purc_ac_dt();
	}

	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public void base_purc_ac_dt(MCDate value) {
		pad().base_purc_ac_dt(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return pad().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		pad().gd_cd(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return pad().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		pad().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return pad().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		pad().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return pad().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		pad().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return pad().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		pad().sno4(value);
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public String in_to_loc_cd() {
		return pad().in_to_loc_cd();
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public void in_to_loc_cd(String value) {
		pad().in_to_loc_cd(value);
	}

	/**
	 * Delivery location WG cd. 納入場所ＷＧ ＣＤ.<p>
	 *
	 */
	public String in_to_loc_wg_cd() {
		return pad().in_to_loc_wg_cd();
	}

	/**
	 * Delivery location WG cd. 納入場所ＷＧ ＣＤ.<p>
	 *
	 */
	public void in_to_loc_wg_cd(String value) {
		pad().in_to_loc_wg_cd(value);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return pad().str_ln_cd();
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		pad().str_ln_cd(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return pad().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		pad().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return pad().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		pad().sublot_no(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return pad().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		pad().quality_typ(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return pad().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		pad().stk_insp_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return pad().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		pad().stk_id_typ(value);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return pad().bp_lot_no();
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		pad().bp_lot_no(value);
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return pad().bp_dlv_slip_no();
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		pad().bp_dlv_slip_no(value);
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_d_no() {
		return pad().bp_dlv_slip_d_no();
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no(String value) {
		pad().bp_dlv_slip_d_no(value);
	}

	/**
	 * PO No. for discount 値引対象発注ＮＯ.<p>
	 *
	 */
	public String dscnt_po_no() {
		return pad().po_no();
	}

	/**
	 * PO No. for discount 値引対象発注ＮＯ.<p>
	 *
	 */
	public void dscnt_po_no(String value) {
		pad().po_no(value);
	}

	/**
	 * Sales order No. for discount 値引対象受注ＮＯ.<p>
	 *
	 */
	public String dscnt_slo_no() {
		return pad().slo_no();
	}

	/**
	 * Sales order No. for discount 値引対象受注ＮＯ.<p>
	 *
	 */
	public void dscnt_slo_no(String value) {
		pad().slo_no(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return pad().disp_seq();
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		pad().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		pad().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		pad().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		pad().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		pad().disp_seq(value);
	}

	/**
	 * EDI flg. ＥＤＩＦＬＧ.<p>
	 *
	 */
	public boolean edi_flg() {
		return pad().edi_flg();
	}

	/**
	 * EDI flg. ＥＤＩＦＬＧ.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		pad().edi_flg(value);
	}

	/**
	 * Inventory update management type 在庫更新管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return pad().stk_mng_typ();
	}

	/**
	 * Inventory update management type 在庫更新管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		pad().stk_mng_typ(value);
	}

	/**
	 * Not to reacquire unit price flg. 単価再取得対象外ＦＬＧ.<p>
	 *
	 */
	public boolean upri_not_tgt_flg() {
		return pad().upri_not_tgt_flg();
	}

	/**
	 * Not to reacquire unit price flg. 単価再取得対象外ＦＬＧ.<p>
	 *
	 */
	public void upri_not_tgt_flg(boolean value) {
		pad().upri_not_tgt_flg(value);
	}

}

