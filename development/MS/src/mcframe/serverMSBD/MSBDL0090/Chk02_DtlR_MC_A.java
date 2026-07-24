package mcframe.serverMSBD.MSBDL0090;

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
 * ブロック"Chk02_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk02_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Process result status type name 処理結果状況区分名.<p>
	 *
	 */
	public static final String $rtn_sts_typ_nm = "rtn_sts_typ_nm";
	/**
	 * Process result info. ID 処理結果情報ＩＤ.<p>
	 *
	 */
	public static final String $msg_id = "msg_id";
	/**
	 * Process result info. 処理結果情報.<p>
	 *
	 */
	public static final String $msg = "msg";
	/**
	 * PO update counter 発注更新カウンタ.<p>
	 *
	 */
	public static final String $po_upd_cntr = "po_upd_cntr";
	/**
	 * Header cancellation ヘッダ取消.<p>
	 *
	 */
	public static final String $slip_del_flg = "slip_del_flg";
	/**
	 * Update PO item only 発注明細のみ更新.<p>
	 *
	 */
	public static final String $only_upd_pod_flg = "only_upd_pod_flg";
	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public static final String $aprv_rvrs_flg = "aprv_rvrs_flg";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public static final String $arr_cnt_rmrks = "arr_cnt_rmrks";
	/**
	 * Request 上り.<p>
	 *
	 */
	public static final String $up_flg = "up_flg";
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
	/**
	 * Delivery note at PO 発注時納品書.<p>
	 *
	 */
	public static final String $po_dlv_slip_flg = "po_dlv_slip_flg";
	public static final String $hdr = "hdr";
	public static final String $pod = "pod";
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";

	public static final String $po_no = $hdr + ".po_no";
	public static final String $po_rev = $hdr + ".po_rev";
	public static final String $trd_cd = $hdr + ".trd_cd";
	public static final String $trd_ptn_typ = $hdr + ".trd_ptn_typ";
	public static final String $purc_dpt_cd = $hdr + ".purc_dpt_cd";
	public static final String $purc_dpt_wg_cd = $hdr + ".wg_cd";
	public static final String $purc_usr_cd = $hdr + ".purc_usr_cd";
	public static final String $sppl_cd = $hdr + ".sppl_cd";
	public static final String $sppl_cntct_dpt = $hdr + ".sppl_cntct_dpt";
	public static final String $sppl_cntct_psn = $hdr + ".sppl_cntct_psn";
	public static final String $sppl_zip_cd = $hdr + ".sppl_zip_cd";
	public static final String $sppl_addr1 = $hdr + ".sppl_addr1";
	public static final String $sppl_addr2 = $hdr + ".sppl_addr2";
	public static final String $sppl_addr3 = $hdr + ".sppl_addr3";
	public static final String $sppl_addr4 = $hdr + ".sppl_addr4";
	public static final String $sppl_tel = $hdr + ".sppl_tel";
	public static final String $sppl_fax = $hdr + ".sppl_fax";
	public static final String $po_dt = $hdr + ".po_dt";
	public static final String $upd_po_print_schd_dt = $hdr + ".upd_po_print_schd_dt";
	public static final String $po_print_flg = $hdr + ".po_print_flg";
	public static final String $last_po_rev = $hdr + ".last_po_rev";
	public static final String $trd_cur_cd = $hdr + ".trd_cur_cd";
	public static final String $xrate = $hdr + ".xrate";
	public static final String $xrate_inpt_flg = $hdr + ".xrate_inpt_flg";
	public static final String $ptax_xrate = $hdr + ".ptax_xrate";
	public static final String $ptax_xrate_inpt_flg = $hdr + ".ptax_xrate_inpt_flg";
	public static final String $crct_rsn_cd = $hdr + ".crct_rsn_cd";
	public static final String $po_print_cd = $hdr + ".po_print_cd";
	public static final String $wrk_no = $hdr + ".wrk_no";
	public static final String $tterm_cd1 = $hdr + ".tterm_cd1";
	public static final String $tterm_rmrks1 = $hdr + ".tterm_rmrks1";
	public static final String $tterm_cd2 = $hdr + ".tterm_cd2";
	public static final String $tterm_rmrks2 = $hdr + ".tterm_rmrks2";
	public static final String $tterm_cd3 = $hdr + ".tterm_cd3";
	public static final String $tterm_rmrks3 = $hdr + ".tterm_rmrks3";
	public static final String $edi_flg = $hdr + ".edi_flg";
	public static final String $aprv_flg = $hdr + ".aprv_flg";
	public static final String $aprv_no = $hdr + ".aprv_no";
	public static final String $aprv_sts_typ = $hdr + ".aprv_sts_typ";
	public static final String $trd_rmrks = $hdr + ".trd_rmrks";
	public static final String $intr_rmrks = $hdr + ".intr_rmrks";
	public static final String $po_print_rmrks = $hdr + ".po_print_rmrks";
	public static final String $dlv_slip_rmrks = $hdr + ".dlv_slip_rmrks";
	public static final String $sub_char1 = $hdr + ".sub_char1";
	public static final String $sub_char2 = $hdr + ".sub_char2";
	public static final String $sub_char3 = $hdr + ".sub_char3";
	public static final String $edi_sub_char1 = $hdr + ".edi_sub_char1";
	public static final String $edi_sub_char2 = $hdr + ".edi_sub_char2";
	public static final String $edi_sub_char3 = $hdr + ".edi_sub_char3";
	public static final String $edi_sub_char4 = $hdr + ".edi_sub_char4";
	public static final String $edi_sub_char5 = $hdr + ".edi_sub_char5";
	public static final String $edi_sub_num1 = $hdr + ".edi_sub_num1";
	public static final String $edi_sub_dt1 = $hdr + ".edi_sub_dt1";
	public static final String $po_d_no = $pod + ".po_d_no";
	public static final String $po_schd_no = $pod + ".po_schd_no";
	public static final String $disp_seq = $pod + ".disp_seq";
	public static final String $itm_cd = $pod + ".itm_cd";
	public static final String $itm_sub1 = $pod + ".itm_sub1";
	public static final String $itm_sub2 = $pod + ".itm_sub2";
	public static final String $itm_sub3 = $pod + ".itm_sub3";
	public static final String $ver_no = $pod + ".ver_no";
	public static final String $itm_nm = $pod + ".itm_nm";
	public static final String $iv_itm_nm = $pod + ".iv_itm_nm";
	public static final String $sno1 = $pod + ".sno1";
	public static final String $sno2 = $pod + ".sno2";
	public static final String $sno3 = $pod + ".sno3";
	public static final String $sno4 = $pod + ".sno4";
	public static final String $purc_rsn_cd = $pod + ".purc_rsn_cd";
	public static final String $purc_id_typ = $pod + ".purc_id_typ";
	public static final String $sundry_itm_flg = $pod + ".sundry_itm_flg";
	public static final String $sppl_itm_cd = $pod + ".sppl_itm_cd";
	public static final String $sppl_itm_nm = $pod + ".sppl_itm_nm";
	public static final String $ap_dpt_cd = $pod + ".ap_dpt_cd";
	public static final String $maker_cd = $pod + ".maker_cd";
	public static final String $bp_lot_no = $pod + ".bp_lot_no";
	public static final String $in_to_loc_cd = $pod + ".in_to_loc_cd";
	public static final String $str_ln_cd = $pod + ".str_ln_cd";
	public static final String $dlv_cd = $pod + ".dlv_cd";
	public static final String $dlv_sundry_flg = $pod + ".dlv_sundry_flg";
	public static final String $dlv_nm = $pod + ".dlv_nm";
	public static final String $dlv_cntct_dpt = $pod + ".dlv_cntct_dpt";
	public static final String $dlv_cntct_psn = $pod + ".dlv_cntct_psn";
	public static final String $dlv_zip_cd = $pod + ".dlv_zip_cd";
	public static final String $dlv_addr1 = $pod + ".dlv_addr1";
	public static final String $dlv_addr2 = $pod + ".dlv_addr2";
	public static final String $dlv_addr3 = $pod + ".dlv_addr3";
	public static final String $dlv_addr4 = $pod + ".dlv_addr4";
	public static final String $dlv_tel = $pod + ".dlv_tel";
	public static final String $dlv_fax = $pod + ".dlv_fax";
	public static final String $tdlv_cd = $pod + ".tdlv_cd";
	public static final String $tdlv_sundry_flg = $pod + ".tdlv_sundry_flg";
	public static final String $tdlv_nm = $pod + ".tdlv_nm";
	public static final String $tdlv_cntct_dpt = $pod + ".tdlv_cntct_dpt";
	public static final String $tdlv_cntct_psn = $pod + ".tdlv_cntct_psn";
	public static final String $tdlv_zip_cd = $pod + ".tdlv_zip_cd";
	public static final String $tdlv_addr1 = $pod + ".tdlv_addr1";
	public static final String $tdlv_addr2 = $pod + ".tdlv_addr2";
	public static final String $tdlv_addr3 = $pod + ".tdlv_addr3";
	public static final String $tdlv_addr4 = $pod + ".tdlv_addr4";
	public static final String $tdlv_tel = $pod + ".tdlv_tel";
	public static final String $tdlv_fax = $pod + ".tdlv_fax";
	public static final String $dlv_rqst_tm = $pod + ".dlv_rqst_tm";
	public static final String $purc_lt = $pod + ".purc_lt";
	public static final String $rqst_dlv_rqst_tm = $pod + ".rqst_dlv_rqst_tm";
	public static final String $purc_schd_dt = $pod + ".purc_schd_dt";
	public static final String $rqst_avl_rqst_dt = $pod + ".rqst_avl_rqst_dt";
	public static final String $sync_flg = $pod + ".sync_flg";
	public static final String $purc_upri_req_typ = $pod + ".purc_upri_req_typ";
	public static final String $trd_unit_qty = $pod + ".trd_unit_qty";
	public static final String $trd_unit_cd = $pod + ".trd_unit_cd";
	public static final String $base_unit_qty = $pod + ".base_unit_qty";
	public static final String $base_unit_cd = $pod + ".base_unit_cd";
	public static final String $interim_flg = $pod + ".interim_flg";
	public static final String $upri_not_tgt_flg = $pod + ".upri_not_tgt_flg";
	public static final String $trd_cur_upri = $pod + ".trd_cur_upri";
	public static final String $trd_cur_proc_upri = $pod + ".trd_cur_proc_upri";
	public static final String $trd_cur_onr_prov_upri = $pod + ".trd_cur_onr_prov_upri";
	public static final String $trd_cur_amt = $pod + ".trd_cur_amt";
	public static final String $trd_cur_proc_amt = $pod + ".trd_cur_proc_amt";
	public static final String $trd_cur_onr_prov_amt = $pod + ".trd_cur_onr_prov_amt";
	public static final String $trd_cur_tax_amt = $pod + ".trd_cur_tax_amt";
	public static final String $trd_cur_dscnt_amt = $pod + ".trd_cur_dscnt_amt";
	public static final String $dscnt_rsn_cd = $pod + ".dscnt_rsn_cd";
	public static final String $tax_fix_flg = $pod + ".tax_fix_flg";
	public static final String $tax_cd = $pod + ".tax_cd";
	public static final String $wtax_rate = $pod + ".wtax_rate";
	public static final String $wtax_amt = $pod + ".wtax_amt";
	public static final String $drct_dlv_typ = $pod + ".drct_dlv_typ";
	public static final String $mfg_loc_cd = $pod + ".mfg_loc_cd";
	public static final String $bom_ptn = $pod + ".bom_ptn";
	public static final String $bndl_flg = $pod + ".bndl_flg";
	public static final String $outsrc_itm_ord_no = $pod + ".outsrc_itm_ord_no";
	public static final String $outsrc_flg = $pod + ".outsrc_flg";
	public static final String $uplnd_flg = $pod + ".uplnd_flg";
	public static final String $schd_chg_flg = $pod + ".schd_chg_flg";
	public static final String $po_conf_rcpt_flg = $pod + ".po_conf_rcpt_flg";
	public static final String $po_conf_rcpt_dt = $pod + ".po_conf_rcpt_dt";
	public static final String $pri_print_flg = $pod + ".pri_print_flg";
	public static final String $pay_crryovr_times = $pod + ".pay_crryovr_times";
	public static final String $slo_no = $pod + ".slo_no";
	public static final String $slo_d_no = $pod + ".slo_d_no";
	public static final String $io_schd_pr_no = $pod + ".io_schd_pr_no";
	public static final String $bd_itm_cd = $pod + ".bd_itm_cd";
	public static final String $bd_itm_sub1 = $pod + ".bd_itm_sub1";
	public static final String $bd_itm_sub2 = $pod + ".bd_itm_sub2";
	public static final String $bd_itm_sub3 = $pod + ".bd_itm_sub3";
	public static final String $bd_sno1 = $pod + ".bd_sno1";
	public static final String $bd_sno2 = $pod + ".bd_sno2";
	public static final String $bd_sno3 = $pod + ".bd_sno3";
	public static final String $bd_sno4 = $pod + ".bd_sno4";
	public static final String $bd_loc_cd = $pod + ".bd_loc_cd";
	public static final String $bd_lot_no = $pod + ".bd_lot_no";
	public static final String $bd_sublot_no = $pod + ".bd_sublot_no";
	public static final String $bd_dpt_cd = $pod + ".bd_dpt_cd";
	public static final String $bd_wg_cd = $pod + ".bd_wg_cd";
	public static final String $bd_ctg_cd = $pod + ".bd_ctg_cd";
	public static final String $bd_oper_cd = $pod + ".bd_oper_cd";
	public static final String $bd_slo_no = $pod + ".bd_slo_no";
	public static final String $bd_iv_no = $pod + ".bd_iv_no";
	public static final String $bd_po_no = $pod + ".bd_po_no";
	public static final String $bd_bp_cd = $pod + ".bd_bp_cd";
	public static final String $dtl_intr_rmrks = $pod + ".intr_rmrks";
	public static final String $dtl_trd_d_rmrks = $pod + ".trd_d_rmrks";
	public static final String $po_print_d_rmrks = $pod + ".po_print_d_rmrks";
	public static final String $dlv_slip_d_rmrks = $pod + ".dlv_slip_d_rmrks";
	public static final String $dtl_sub_char1 = $pod + ".sub_char1";
	public static final String $dtl_sub_char2 = $pod + ".sub_char2";
	public static final String $dtl_sub_char3 = $pod + ".sub_char3";
	public static final String $edi_sub_d_char1 = $pod + ".edi_sub_d_char1";
	public static final String $edi_sub_d_char2 = $pod + ".edi_sub_d_char2";
	public static final String $edi_sub_d_char3 = $pod + ".edi_sub_d_char3";
	public static final String $edi_sub_d_char4 = $pod + ".edi_sub_d_char4";
	public static final String $edi_sub_d_char5 = $pod + ".edi_sub_d_char5";
	public static final String $edi_sub_d_num1 = $pod + ".edi_sub_d_num1";
	public static final String $edi_sub_d_dt1 = $pod + ".edi_sub_d_dt1";
	public static final String $rqst_can_flg = $pod + ".rqst_can_flg";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta rtn_sts_typ_nm_META = createCommonMeta($rtn_sts_typ_nm, mcframe.commonMA.meta.MA_META.RTN_STS_TYP_NM);
	public static final MCMeta msg_id_META = createCommonMeta($msg_id, mcframe.commonMA.meta.MA_META.MSG_ID);
	public static final MCMeta msg_META = createCommonMeta($msg, mcframe.commonMA.meta.MA_META.MSG);
	public static final MCMeta po_upd_cntr_META = createCommonMeta($po_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta slip_del_flg_META = createCommonMeta($slip_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta only_upd_pod_flg_META = createCommonMeta($only_upd_pod_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_rvrs_flg_META = createCommonMeta($aprv_rvrs_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_cnt_rmrks_META = createCommonMeta($arr_cnt_rmrks, mcframe.commonMS.meta.MS_META.ARR_CNT_RMRKS);
	public static final MCMeta up_flg_META = createCommonMeta($up_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_dlv_slip_flg_META = createCommonMeta($po_dlv_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta hdr_META = createInnerRowMeta($hdr, mcframe.serverMS.dbc.MST_PO_R.class);
	public static final MCMeta pod_META = createInnerRowMeta($pod, mcframe.serverMS.dbc.MST_PO_D_R.class);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Chk02_DtlR> constMetas = new ConstMetaList<Chk02_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			data_crud_typ_META,
			rtn_sts_typ_META,
			rtn_sts_typ_nm_META,
			msg_id_META,
			msg_META,
			po_upd_cntr_META,
			slip_del_flg_META,
			only_upd_pod_flg_META,
			aprv_rvrs_flg_META,
			abort_flg_META,
			arr_cnt_rmrks_META,
			up_flg_META,
			subcon_flg_META,
			po_dlv_slip_flg_META,
			hdr_META,
			pod_META,
			inc_tax_flg_META
		},
		new String[][]{
			{
				"po_no",
				"po_rev",
				"trd_cd",
				"trd_ptn_typ",
				"purc_dpt_cd",
				"purc_dpt_wg_cd",
				"purc_usr_cd",
				"sppl_cd",
				"sppl_cntct_dpt",
				"sppl_cntct_psn",
				"sppl_zip_cd",
				"sppl_addr1",
				"sppl_addr2",
				"sppl_addr3",
				"sppl_addr4",
				"sppl_tel",
				"sppl_fax",
				"po_dt",
				"upd_po_print_schd_dt",
				"po_print_flg",
				"last_po_rev",
				"trd_cur_cd",
				"xrate",
				"xrate_inpt_flg",
				"ptax_xrate",
				"ptax_xrate_inpt_flg",
				"crct_rsn_cd",
				"po_print_cd",
				"wrk_no",
				"tterm_cd1",
				"tterm_rmrks1",
				"tterm_cd2",
				"tterm_rmrks2",
				"tterm_cd3",
				"tterm_rmrks3",
				"edi_flg",
				"aprv_flg",
				"aprv_no",
				"aprv_sts_typ",
				"trd_rmrks",
				"intr_rmrks",
				"po_print_rmrks",
				"dlv_slip_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"edi_sub_char1",
				"edi_sub_char2",
				"edi_sub_char3",
				"edi_sub_char4",
				"edi_sub_char5",
				"edi_sub_num1",
				"edi_sub_dt1",
				"po_d_no",
				"po_schd_no",
				"disp_seq",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"ver_no",
				"itm_nm",
				"iv_itm_nm",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"purc_rsn_cd",
				"purc_id_typ",
				"sundry_itm_flg",
				"sppl_itm_cd",
				"sppl_itm_nm",
				"ap_dpt_cd",
				"maker_cd",
				"bp_lot_no",
				"in_to_loc_cd",
				"str_ln_cd",
				"dlv_cd",
				"dlv_sundry_flg",
				"dlv_nm",
				"dlv_cntct_dpt",
				"dlv_cntct_psn",
				"dlv_zip_cd",
				"dlv_addr1",
				"dlv_addr2",
				"dlv_addr3",
				"dlv_addr4",
				"dlv_tel",
				"dlv_fax",
				"tdlv_cd",
				"tdlv_sundry_flg",
				"tdlv_nm",
				"tdlv_cntct_dpt",
				"tdlv_cntct_psn",
				"tdlv_zip_cd",
				"tdlv_addr1",
				"tdlv_addr2",
				"tdlv_addr3",
				"tdlv_addr4",
				"tdlv_tel",
				"tdlv_fax",
				"dlv_rqst_tm",
				"purc_lt",
				"rqst_dlv_rqst_tm",
				"purc_schd_dt",
				"rqst_avl_rqst_dt",
				"sync_flg",
				"purc_upri_req_typ",
				"trd_unit_qty",
				"trd_unit_cd",
				"base_unit_qty",
				"base_unit_cd",
				"interim_flg",
				"upri_not_tgt_flg",
				"trd_cur_upri",
				"trd_cur_proc_upri",
				"trd_cur_onr_prov_upri",
				"trd_cur_amt",
				"trd_cur_proc_amt",
				"trd_cur_onr_prov_amt",
				"trd_cur_tax_amt",
				"trd_cur_dscnt_amt",
				"dscnt_rsn_cd",
				"tax_fix_flg",
				"tax_cd",
				"wtax_rate",
				"wtax_amt",
				"drct_dlv_typ",
				"mfg_loc_cd",
				"bom_ptn",
				"bndl_flg",
				"outsrc_itm_ord_no",
				"outsrc_flg",
				"uplnd_flg",
				"schd_chg_flg",
				"po_conf_rcpt_flg",
				"po_conf_rcpt_dt",
				"pri_print_flg",
				"pay_crryovr_times",
				"slo_no",
				"slo_d_no",
				"io_schd_pr_no",
				"bd_itm_cd",
				"bd_itm_sub1",
				"bd_itm_sub2",
				"bd_itm_sub3",
				"bd_sno1",
				"bd_sno2",
				"bd_sno3",
				"bd_sno4",
				"bd_loc_cd",
				"bd_lot_no",
				"bd_sublot_no",
				"bd_dpt_cd",
				"bd_wg_cd",
				"bd_ctg_cd",
				"bd_oper_cd",
				"bd_slo_no",
				"bd_iv_no",
				"bd_po_no",
				"bd_bp_cd",
				"dtl_intr_rmrks",
				"dtl_trd_d_rmrks",
				"po_print_d_rmrks",
				"dlv_slip_d_rmrks",
				"dtl_sub_char1",
				"dtl_sub_char2",
				"dtl_sub_char3",
				"edi_sub_d_char1",
				"edi_sub_d_char2",
				"edi_sub_d_char3",
				"edi_sub_d_char4",
				"edi_sub_d_char5",
				"edi_sub_d_num1",
				"edi_sub_d_dt1",
				"rqst_can_flg"
			},
			{
				$po_no,
				$po_rev,
				$trd_cd,
				$trd_ptn_typ,
				$purc_dpt_cd,
				$purc_dpt_wg_cd,
				$purc_usr_cd,
				$sppl_cd,
				$sppl_cntct_dpt,
				$sppl_cntct_psn,
				$sppl_zip_cd,
				$sppl_addr1,
				$sppl_addr2,
				$sppl_addr3,
				$sppl_addr4,
				$sppl_tel,
				$sppl_fax,
				$po_dt,
				$upd_po_print_schd_dt,
				$po_print_flg,
				$last_po_rev,
				$trd_cur_cd,
				$xrate,
				$xrate_inpt_flg,
				$ptax_xrate,
				$ptax_xrate_inpt_flg,
				$crct_rsn_cd,
				$po_print_cd,
				$wrk_no,
				$tterm_cd1,
				$tterm_rmrks1,
				$tterm_cd2,
				$tterm_rmrks2,
				$tterm_cd3,
				$tterm_rmrks3,
				$edi_flg,
				$aprv_flg,
				$aprv_no,
				$aprv_sts_typ,
				$trd_rmrks,
				$intr_rmrks,
				$po_print_rmrks,
				$dlv_slip_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$edi_sub_char1,
				$edi_sub_char2,
				$edi_sub_char3,
				$edi_sub_char4,
				$edi_sub_char5,
				$edi_sub_num1,
				$edi_sub_dt1,
				$po_d_no,
				$po_schd_no,
				$disp_seq,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$ver_no,
				$itm_nm,
				$iv_itm_nm,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$purc_rsn_cd,
				$purc_id_typ,
				$sundry_itm_flg,
				$sppl_itm_cd,
				$sppl_itm_nm,
				$ap_dpt_cd,
				$maker_cd,
				$bp_lot_no,
				$in_to_loc_cd,
				$str_ln_cd,
				$dlv_cd,
				$dlv_sundry_flg,
				$dlv_nm,
				$dlv_cntct_dpt,
				$dlv_cntct_psn,
				$dlv_zip_cd,
				$dlv_addr1,
				$dlv_addr2,
				$dlv_addr3,
				$dlv_addr4,
				$dlv_tel,
				$dlv_fax,
				$tdlv_cd,
				$tdlv_sundry_flg,
				$tdlv_nm,
				$tdlv_cntct_dpt,
				$tdlv_cntct_psn,
				$tdlv_zip_cd,
				$tdlv_addr1,
				$tdlv_addr2,
				$tdlv_addr3,
				$tdlv_addr4,
				$tdlv_tel,
				$tdlv_fax,
				$dlv_rqst_tm,
				$purc_lt,
				$rqst_dlv_rqst_tm,
				$purc_schd_dt,
				$rqst_avl_rqst_dt,
				$sync_flg,
				$purc_upri_req_typ,
				$trd_unit_qty,
				$trd_unit_cd,
				$base_unit_qty,
				$base_unit_cd,
				$interim_flg,
				$upri_not_tgt_flg,
				$trd_cur_upri,
				$trd_cur_proc_upri,
				$trd_cur_onr_prov_upri,
				$trd_cur_amt,
				$trd_cur_proc_amt,
				$trd_cur_onr_prov_amt,
				$trd_cur_tax_amt,
				$trd_cur_dscnt_amt,
				$dscnt_rsn_cd,
				$tax_fix_flg,
				$tax_cd,
				$wtax_rate,
				$wtax_amt,
				$drct_dlv_typ,
				$mfg_loc_cd,
				$bom_ptn,
				$bndl_flg,
				$outsrc_itm_ord_no,
				$outsrc_flg,
				$uplnd_flg,
				$schd_chg_flg,
				$po_conf_rcpt_flg,
				$po_conf_rcpt_dt,
				$pri_print_flg,
				$pay_crryovr_times,
				$slo_no,
				$slo_d_no,
				$io_schd_pr_no,
				$bd_itm_cd,
				$bd_itm_sub1,
				$bd_itm_sub2,
				$bd_itm_sub3,
				$bd_sno1,
				$bd_sno2,
				$bd_sno3,
				$bd_sno4,
				$bd_loc_cd,
				$bd_lot_no,
				$bd_sublot_no,
				$bd_dpt_cd,
				$bd_wg_cd,
				$bd_ctg_cd,
				$bd_oper_cd,
				$bd_slo_no,
				$bd_iv_no,
				$bd_po_no,
				$bd_bp_cd,
				$dtl_intr_rmrks,
				$dtl_trd_d_rmrks,
				$po_print_d_rmrks,
				$dlv_slip_d_rmrks,
				$dtl_sub_char1,
				$dtl_sub_char2,
				$dtl_sub_char3,
				$edi_sub_d_char1,
				$edi_sub_d_char2,
				$edi_sub_d_char3,
				$edi_sub_d_char4,
				$edi_sub_d_char5,
				$edi_sub_d_num1,
				$edi_sub_d_dt1,
				$rqst_can_flg
			}
		}
	);

	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[UPD_CNT_CHK]のキー定数 */
	public static final String $$UPD_CNT_CHK = "UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$hdr + ".crct_rsn_cd", "MS.MSUAL0050.PoCrctRsn"},	// hdr.crct_rsn_cd
				{$hdr + ".po_print_cd", "MA.MAUAL0010.PoPrint"}	// hdr.po_print_cd
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
	protected Chk02_DtlR_MC_A(ConstMetaList<? extends Chk02_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR clone() {
		return (Chk02_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR createInstance() {
		return (Chk02_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR getValues(String... names) {
		return (Chk02_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
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
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 3, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 3, $rtn_sts_typ, value);
	}


	/**
	 * Process result status type name 処理結果状況区分名.<p>
	 *
	 */
	public String rtn_sts_typ_nm() {
		return getConstString(offset + 4, $rtn_sts_typ_nm);
	}

	/**
	 * Process result status type name 処理結果状況区分名.<p>
	 *
	 */
	public void rtn_sts_typ_nm(String value) {
		setConstString(offset + 4, $rtn_sts_typ_nm, value);
	}


	/**
	 * Process result info. ID 処理結果情報ＩＤ.<p>
	 *
	 */
	public String msg_id() {
		return getConstString(offset + 5, $msg_id);
	}

	/**
	 * Process result info. ID 処理結果情報ＩＤ.<p>
	 *
	 */
	public void msg_id(String value) {
		setConstString(offset + 5, $msg_id, value);
	}


	/**
	 * Process result info. 処理結果情報.<p>
	 *
	 */
	public String msg() {
		return getConstString(offset + 6, $msg);
	}

	/**
	 * Process result info. 処理結果情報.<p>
	 *
	 */
	public void msg(String value) {
		setConstString(offset + 6, $msg, value);
	}


	/**
	 * PO update counter 発注更新カウンタ.<p>
	 *
	 */
	public MCNumber po_upd_cntr() {
		return getConstNumber(offset + 7, $po_upd_cntr);
	}

	/**
	 * PO update counter 発注更新カウンタ.<p>
	 *
	 */
	public void po_upd_cntr(MCNumber value) {
		setConstNumber(offset + 7, $po_upd_cntr, value);
	}

	/**
	 * PO update counter 発注更新カウンタ.<p>
	 *
	 */
	public void po_upd_cntr(int value) {
		setConstNumber(offset + 7, $po_upd_cntr, value);
	}

	/**
	 * PO update counter 発注更新カウンタ.<p>
	 *
	 */
	public void po_upd_cntr(long value) {
		setConstNumber(offset + 7, $po_upd_cntr, value);
	}

	/**
	 * PO update counter 発注更新カウンタ.<p>
	 *
	 */
	public void po_upd_cntr(float value) {
		setConstNumber(offset + 7, $po_upd_cntr, value);
	}

	/**
	 * PO update counter 発注更新カウンタ.<p>
	 *
	 */
	public void po_upd_cntr(double value) {
		setConstNumber(offset + 7, $po_upd_cntr, value);
	}


	/**
	 * Header cancellation ヘッダ取消.<p>
	 *
	 */
	public boolean slip_del_flg() {
		return getConstBoolean(offset + 8, $slip_del_flg);
	}

	/**
	 * Header cancellation ヘッダ取消.<p>
	 *
	 */
	public void slip_del_flg(boolean value) {
		setConstBoolean(offset + 8, $slip_del_flg, value);
	}


	/**
	 * Update PO item only 発注明細のみ更新.<p>
	 *
	 */
	public boolean only_upd_pod_flg() {
		return getConstBoolean(offset + 9, $only_upd_pod_flg);
	}

	/**
	 * Update PO item only 発注明細のみ更新.<p>
	 *
	 */
	public void only_upd_pod_flg(boolean value) {
		setConstBoolean(offset + 9, $only_upd_pod_flg, value);
	}


	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public boolean aprv_rvrs_flg() {
		return getConstBoolean(offset + 10, $aprv_rvrs_flg);
	}

	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public void aprv_rvrs_flg(boolean value) {
		setConstBoolean(offset + 10, $aprv_rvrs_flg, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 11, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 11, $abort_flg, value);
	}


	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public String arr_cnt_rmrks() {
		return getConstString(offset + 12, $arr_cnt_rmrks);
	}

	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public void arr_cnt_rmrks(String value) {
		setConstString(offset + 12, $arr_cnt_rmrks, value);
	}


	/**
	 * Request 上り.<p>
	 *
	 */
	public boolean up_flg() {
		return getConstBoolean(offset + 13, $up_flg);
	}

	/**
	 * Request 上り.<p>
	 *
	 */
	public void up_flg(boolean value) {
		setConstBoolean(offset + 13, $up_flg, value);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 14, $subcon_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 14, $subcon_flg, value);
	}


	/**
	 * Delivery note at PO 発注時納品書.<p>
	 *
	 */
	public boolean po_dlv_slip_flg() {
		return getConstBoolean(offset + 15, $po_dlv_slip_flg);
	}

	/**
	 * Delivery note at PO 発注時納品書.<p>
	 *
	 */
	public void po_dlv_slip_flg(boolean value) {
		setConstBoolean(offset + 15, $po_dlv_slip_flg, value);
	}


	public mcframe.serverMS.dbc.MST_PO_R hdr(){
		return (mcframe.serverMS.dbc.MST_PO_R) getConstInnerRow(offset + 16, $hdr);
	}
	
	public void hdr(mcframe.serverMS.dbc.MST_PO_R row){
		setConstInnerRow(offset + 16, $hdr, row);
	}


	public mcframe.serverMS.dbc.MST_PO_D_R pod(){
		return (mcframe.serverMS.dbc.MST_PO_D_R) getConstInnerRow(offset + 17, $pod);
	}
	
	public void pod(mcframe.serverMS.dbc.MST_PO_D_R row){
		setConstInnerRow(offset + 17, $pod, row);
	}


	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 18, $inc_tax_flg);
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 18, $inc_tax_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($rtn_sts_typ_nm.equalsIgnoreCase(name)) {
			return rtn_sts_typ_nm();
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			return msg_id();
		}
		if ($msg.equalsIgnoreCase(name)) {
			return msg();
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($po_upd_cntr.equalsIgnoreCase(name)) {
			return po_upd_cntr();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($slip_del_flg.equalsIgnoreCase(name)) {
			return slip_del_flg();
		}
		if ($only_upd_pod_flg.equalsIgnoreCase(name)) {
			return only_upd_pod_flg();
		}
		if ($aprv_rvrs_flg.equalsIgnoreCase(name)) {
			return aprv_rvrs_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($up_flg.equalsIgnoreCase(name)) {
			return up_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($po_dlv_slip_flg.equalsIgnoreCase(name)) {
			return po_dlv_slip_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($rtn_sts_typ_nm.equalsIgnoreCase(name)) {
			return rtn_sts_typ_nm();
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			return msg_id();
		}
		if ($msg.equalsIgnoreCase(name)) {
			return msg();
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($po_upd_cntr.equalsIgnoreCase(name)) {
			return po_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($slip_del_flg.equalsIgnoreCase(name)) {
			return slip_del_flg();
		}
		if ($only_upd_pod_flg.equalsIgnoreCase(name)) {
			return only_upd_pod_flg();
		}
		if ($aprv_rvrs_flg.equalsIgnoreCase(name)) {
			return aprv_rvrs_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($up_flg.equalsIgnoreCase(name)) {
			return up_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($po_dlv_slip_flg.equalsIgnoreCase(name)) {
			return po_dlv_slip_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($rtn_sts_typ_nm.equalsIgnoreCase(name)) {
			rtn_sts_typ_nm(value);
			return;
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			msg_id(value);
			return;
		}
		if ($msg.equalsIgnoreCase(name)) {
			msg(value);
			return;
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_upd_cntr.equalsIgnoreCase(name)) {
			po_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_upd_cntr.equalsIgnoreCase(name)) {
			po_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_upd_cntr.equalsIgnoreCase(name)) {
			po_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_upd_cntr.equalsIgnoreCase(name)) {
			po_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_upd_cntr.equalsIgnoreCase(name)) {
			po_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($slip_del_flg.equalsIgnoreCase(name)) {
			slip_del_flg(value);
			return;
		}
		if ($only_upd_pod_flg.equalsIgnoreCase(name)) {
			only_upd_pod_flg(value);
			return;
		}
		if ($aprv_rvrs_flg.equalsIgnoreCase(name)) {
			aprv_rvrs_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($up_flg.equalsIgnoreCase(name)) {
			up_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($po_dlv_slip_flg.equalsIgnoreCase(name)) {
			po_dlv_slip_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($rtn_sts_typ_nm.equalsIgnoreCase(name)) {
			rtn_sts_typ_nm(value);
			return;
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			msg_id(value);
			return;
		}
		if ($msg.equalsIgnoreCase(name)) {
			msg(value);
			return;
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_upd_cntr.equalsIgnoreCase(name)) {
			po_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_upd_cntr.equalsIgnoreCase(name)) {
			po_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_upd_cntr.equalsIgnoreCase(name)) {
			po_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_upd_cntr.equalsIgnoreCase(name)) {
			po_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_upd_cntr.equalsIgnoreCase(name)) {
			po_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($slip_del_flg.equalsIgnoreCase(name)) {
			slip_del_flg(value);
			return;
		}
		if ($only_upd_pod_flg.equalsIgnoreCase(name)) {
			only_upd_pod_flg(value);
			return;
		}
		if ($aprv_rvrs_flg.equalsIgnoreCase(name)) {
			aprv_rvrs_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($up_flg.equalsIgnoreCase(name)) {
			up_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($po_dlv_slip_flg.equalsIgnoreCase(name)) {
			po_dlv_slip_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($hdr.equalsIgnoreCase(name)) {
			return hdr();
		}
		if ($pod.equalsIgnoreCase(name)) {
			return pod();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($hdr.equalsIgnoreCase(name)) {
			hdr(
				((MCContainerMeta) hdr_META).castInnerRow(mcframe.serverMS.dbc.MST_PO_R.class, value)
			);
			return;
		}
		if ($pod.equalsIgnoreCase(name)) {
			pod(
				((MCContainerMeta) pod_META).castInnerRow(mcframe.serverMS.dbc.MST_PO_D_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return hdr().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		hdr().po_no(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public MCNumber po_rev() {
		return hdr().po_rev();
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(MCNumber value) {
		hdr().po_rev(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(int value) {
		hdr().po_rev(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(long value) {
		hdr().po_rev(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(float value) {
		hdr().po_rev(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(double value) {
		hdr().po_rev(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return hdr().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		hdr().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return hdr().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		hdr().trd_ptn_typ(value);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return hdr().purc_dpt_cd();
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		hdr().purc_dpt_cd(value);
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public String purc_dpt_wg_cd() {
		return hdr().wg_cd();
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public void purc_dpt_wg_cd(String value) {
		hdr().wg_cd(value);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return hdr().purc_usr_cd();
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		hdr().purc_usr_cd(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return hdr().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		hdr().sppl_cd(value);
	}

	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public String sppl_cntct_dpt() {
		return hdr().sppl_cntct_dpt();
	}

	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public void sppl_cntct_dpt(String value) {
		hdr().sppl_cntct_dpt(value);
	}

	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public String sppl_cntct_psn() {
		return hdr().sppl_cntct_psn();
	}

	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public void sppl_cntct_psn(String value) {
		hdr().sppl_cntct_psn(value);
	}

	/**
	 * Supplier zip code 発注先郵便番号.<p>
	 *
	 */
	public String sppl_zip_cd() {
		return hdr().sppl_zip_cd();
	}

	/**
	 * Supplier zip code 発注先郵便番号.<p>
	 *
	 */
	public void sppl_zip_cd(String value) {
		hdr().sppl_zip_cd(value);
	}

	/**
	 * Supplier address 1 発注先住所１.<p>
	 *
	 */
	public String sppl_addr1() {
		return hdr().sppl_addr1();
	}

	/**
	 * Supplier address 1 発注先住所１.<p>
	 *
	 */
	public void sppl_addr1(String value) {
		hdr().sppl_addr1(value);
	}

	/**
	 * Supplier address 2 発注先住所２.<p>
	 *
	 */
	public String sppl_addr2() {
		return hdr().sppl_addr2();
	}

	/**
	 * Supplier address 2 発注先住所２.<p>
	 *
	 */
	public void sppl_addr2(String value) {
		hdr().sppl_addr2(value);
	}

	/**
	 * Supplier address 3 発注先住所３.<p>
	 *
	 */
	public String sppl_addr3() {
		return hdr().sppl_addr3();
	}

	/**
	 * Supplier address 3 発注先住所３.<p>
	 *
	 */
	public void sppl_addr3(String value) {
		hdr().sppl_addr3(value);
	}

	/**
	 * Supplier address 4 発注先住所４.<p>
	 *
	 */
	public String sppl_addr4() {
		return hdr().sppl_addr4();
	}

	/**
	 * Supplier address 4 発注先住所４.<p>
	 *
	 */
	public void sppl_addr4(String value) {
		hdr().sppl_addr4(value);
	}

	/**
	 * Supplier TEL 発注先ＴＥＬ.<p>
	 *
	 */
	public String sppl_tel() {
		return hdr().sppl_tel();
	}

	/**
	 * Supplier TEL 発注先ＴＥＬ.<p>
	 *
	 */
	public void sppl_tel(String value) {
		hdr().sppl_tel(value);
	}

	/**
	 * Supplier FAX 発注先ＦＡＸ.<p>
	 *
	 */
	public String sppl_fax() {
		return hdr().sppl_fax();
	}

	/**
	 * Supplier FAX 発注先ＦＡＸ.<p>
	 *
	 */
	public void sppl_fax(String value) {
		hdr().sppl_fax(value);
	}

	/**
	 * PO date 発注日.<p>
	 *
	 */
	public MCDate po_dt() {
		return hdr().po_dt();
	}

	/**
	 * PO date 発注日.<p>
	 *
	 */
	public void po_dt(MCDate value) {
		hdr().po_dt(value);
	}

	/**
	 * Scheduled change PO sheet issue date after change 変更注文書発行予定日.<p>
	 *
	 */
	public MCDate upd_po_print_schd_dt() {
		return hdr().upd_po_print_schd_dt();
	}

	/**
	 * Scheduled change PO sheet issue date after change 変更注文書発行予定日.<p>
	 *
	 */
	public void upd_po_print_schd_dt(MCDate value) {
		hdr().upd_po_print_schd_dt(value);
	}

	/**
	 * PO sheet issued 注文書発行済.<p>
	 *
	 */
	public boolean po_print_flg() {
		return hdr().po_print_flg();
	}

	/**
	 * PO sheet issued 注文書発行済.<p>
	 *
	 */
	public void po_print_flg(boolean value) {
		hdr().po_print_flg(value);
	}

	/**
	 * Latest PO rev. number 最新発注改訂番号.<p>
	 *
	 */
	public MCNumber last_po_rev() {
		return hdr().last_po_rev();
	}

	/**
	 * Latest PO rev. number 最新発注改訂番号.<p>
	 *
	 */
	public void last_po_rev(MCNumber value) {
		hdr().last_po_rev(value);
	}

	/**
	 * Latest PO rev. number 最新発注改訂番号.<p>
	 *
	 */
	public void last_po_rev(int value) {
		hdr().last_po_rev(value);
	}

	/**
	 * Latest PO rev. number 最新発注改訂番号.<p>
	 *
	 */
	public void last_po_rev(long value) {
		hdr().last_po_rev(value);
	}

	/**
	 * Latest PO rev. number 最新発注改訂番号.<p>
	 *
	 */
	public void last_po_rev(float value) {
		hdr().last_po_rev(value);
	}

	/**
	 * Latest PO rev. number 最新発注改訂番号.<p>
	 *
	 */
	public void last_po_rev(double value) {
		hdr().last_po_rev(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return hdr().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		hdr().trd_cur_cd(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return hdr().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		hdr().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		hdr().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		hdr().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		hdr().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		hdr().xrate(value);
	}

	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return hdr().xrate_inpt_flg();
	}

	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		hdr().xrate_inpt_flg(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return hdr().ptax_xrate();
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		hdr().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		hdr().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		hdr().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		hdr().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		hdr().ptax_xrate(value);
	}

	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return hdr().ptax_xrate_inpt_flg();
	}

	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		hdr().ptax_xrate_inpt_flg(value);
	}

	/**
	 * Correction reason cd. 訂正理由ＣＤ.<p>
	 *
	 */
	public String crct_rsn_cd() {
		return hdr().crct_rsn_cd();
	}

	/**
	 * Correction reason cd. 訂正理由ＣＤ.<p>
	 *
	 */
	public void crct_rsn_cd(String value) {
		hdr().crct_rsn_cd(value);
	}

	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public String po_print_cd() {
		return hdr().po_print_cd();
	}

	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public void po_print_cd(String value) {
		hdr().po_print_cd(value);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return hdr().wrk_no();
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		hdr().wrk_no(value);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return hdr().tterm_cd1();
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		hdr().tterm_cd1(value);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return hdr().tterm_rmrks1();
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		hdr().tterm_rmrks1(value);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return hdr().tterm_cd2();
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		hdr().tterm_cd2(value);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return hdr().tterm_rmrks2();
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		hdr().tterm_rmrks2(value);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return hdr().tterm_cd3();
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		hdr().tterm_cd3(value);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return hdr().tterm_rmrks3();
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		hdr().tterm_rmrks3(value);
	}

	/**
	 * Current EDI 今回ＥＤＩ.<p>
	 *
	 */
	public boolean edi_flg() {
		return hdr().edi_flg();
	}

	/**
	 * Current EDI 今回ＥＤＩ.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		hdr().edi_flg(value);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean aprv_flg() {
		return hdr().aprv_flg();
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		hdr().aprv_flg(value);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return hdr().aprv_no();
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		hdr().aprv_no(value);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return hdr().aprv_sts_typ();
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		hdr().aprv_sts_typ(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return hdr().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		hdr().trd_rmrks(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return hdr().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		hdr().intr_rmrks(value);
	}

	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public String po_print_rmrks() {
		return hdr().po_print_rmrks();
	}

	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public void po_print_rmrks(String value) {
		hdr().po_print_rmrks(value);
	}

	/**
	 * Delivery note remarks 納品書備考.<p>
	 *
	 */
	public String dlv_slip_rmrks() {
		return hdr().dlv_slip_rmrks();
	}

	/**
	 * Delivery note remarks 納品書備考.<p>
	 *
	 */
	public void dlv_slip_rmrks(String value) {
		hdr().dlv_slip_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return hdr().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		hdr().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return hdr().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		hdr().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return hdr().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		hdr().sub_char3(value);
	}

	/**
	 * EDI spare character string 1 ＥＤＩ予備文字列１.<p>
	 *
	 */
	public String edi_sub_char1() {
		return hdr().edi_sub_char1();
	}

	/**
	 * EDI spare character string 1 ＥＤＩ予備文字列１.<p>
	 *
	 */
	public void edi_sub_char1(String value) {
		hdr().edi_sub_char1(value);
	}

	/**
	 * EDI spare character string 2 ＥＤＩ予備文字列２.<p>
	 *
	 */
	public String edi_sub_char2() {
		return hdr().edi_sub_char2();
	}

	/**
	 * EDI spare character string 2 ＥＤＩ予備文字列２.<p>
	 *
	 */
	public void edi_sub_char2(String value) {
		hdr().edi_sub_char2(value);
	}

	/**
	 * EDI spare character string 3 ＥＤＩ予備文字列３.<p>
	 *
	 */
	public String edi_sub_char3() {
		return hdr().edi_sub_char3();
	}

	/**
	 * EDI spare character string 3 ＥＤＩ予備文字列３.<p>
	 *
	 */
	public void edi_sub_char3(String value) {
		hdr().edi_sub_char3(value);
	}

	/**
	 * EDI spare character string 4 ＥＤＩ予備文字列４.<p>
	 *
	 */
	public String edi_sub_char4() {
		return hdr().edi_sub_char4();
	}

	/**
	 * EDI spare character string 4 ＥＤＩ予備文字列４.<p>
	 *
	 */
	public void edi_sub_char4(String value) {
		hdr().edi_sub_char4(value);
	}

	/**
	 * EDI spare character string 5 ＥＤＩ予備文字列５.<p>
	 *
	 */
	public String edi_sub_char5() {
		return hdr().edi_sub_char5();
	}

	/**
	 * EDI spare character string 5 ＥＤＩ予備文字列５.<p>
	 *
	 */
	public void edi_sub_char5(String value) {
		hdr().edi_sub_char5(value);
	}

	/**
	 * EDI spare numerical value ＥＤＩ予備数値.<p>
	 *
	 */
	public MCNumber edi_sub_num1() {
		return hdr().edi_sub_num1();
	}

	/**
	 * EDI spare numerical value ＥＤＩ予備数値.<p>
	 *
	 */
	public void edi_sub_num1(MCNumber value) {
		hdr().edi_sub_num1(value);
	}

	/**
	 * EDI spare numerical value ＥＤＩ予備数値.<p>
	 *
	 */
	public void edi_sub_num1(int value) {
		hdr().edi_sub_num1(value);
	}

	/**
	 * EDI spare numerical value ＥＤＩ予備数値.<p>
	 *
	 */
	public void edi_sub_num1(long value) {
		hdr().edi_sub_num1(value);
	}

	/**
	 * EDI spare numerical value ＥＤＩ予備数値.<p>
	 *
	 */
	public void edi_sub_num1(float value) {
		hdr().edi_sub_num1(value);
	}

	/**
	 * EDI spare numerical value ＥＤＩ予備数値.<p>
	 *
	 */
	public void edi_sub_num1(double value) {
		hdr().edi_sub_num1(value);
	}

	/**
	 * EDI spare date ＥＤＩ予備日付.<p>
	 *
	 */
	public MCDate edi_sub_dt1() {
		return hdr().edi_sub_dt1();
	}

	/**
	 * EDI spare date ＥＤＩ予備日付.<p>
	 *
	 */
	public void edi_sub_dt1(MCDate value) {
		hdr().edi_sub_dt1(value);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return pod().po_d_no();
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		pod().po_d_no(value);
	}

	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public String po_schd_no() {
		return pod().po_schd_no();
	}

	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public void po_schd_no(String value) {
		pod().po_schd_no(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return pod().disp_seq();
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		pod().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		pod().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		pod().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		pod().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		pod().disp_seq(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return pod().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		pod().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return pod().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		pod().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return pod().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		pod().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return pod().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		pod().itm_sub3(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return pod().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		pod().ver_no(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return pod().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		pod().itm_nm(value);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return pod().iv_itm_nm();
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		pod().iv_itm_nm(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return pod().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		pod().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return pod().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		pod().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return pod().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		pod().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return pod().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		pod().sno4(value);
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public String purc_rsn_cd() {
		return pod().purc_rsn_cd();
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public void purc_rsn_cd(String value) {
		pod().purc_rsn_cd(value);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return pod().purc_id_typ();
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		pod().purc_id_typ(value);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return pod().sundry_itm_flg();
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		pod().sundry_itm_flg(value);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return pod().sppl_itm_cd();
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		pod().sppl_itm_cd(value);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return pod().sppl_itm_nm();
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		pod().sppl_itm_nm(value);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return pod().ap_dpt_cd();
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		pod().ap_dpt_cd(value);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return pod().maker_cd();
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		pod().maker_cd(value);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return pod().bp_lot_no();
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		pod().bp_lot_no(value);
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public String in_to_loc_cd() {
		return pod().in_to_loc_cd();
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public void in_to_loc_cd(String value) {
		pod().in_to_loc_cd(value);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return pod().str_ln_cd();
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		pod().str_ln_cd(value);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return pod().dlv_cd();
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		pod().dlv_cd(value);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return pod().dlv_sundry_flg();
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		pod().dlv_sundry_flg(value);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return pod().dlv_nm();
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		pod().dlv_nm(value);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return pod().dlv_cntct_dpt();
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		pod().dlv_cntct_dpt(value);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return pod().dlv_cntct_psn();
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		pod().dlv_cntct_psn(value);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return pod().dlv_zip_cd();
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		pod().dlv_zip_cd(value);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return pod().dlv_addr1();
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		pod().dlv_addr1(value);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return pod().dlv_addr2();
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		pod().dlv_addr2(value);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return pod().dlv_addr3();
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		pod().dlv_addr3(value);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return pod().dlv_addr4();
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		pod().dlv_addr4(value);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return pod().dlv_tel();
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		pod().dlv_tel(value);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return pod().dlv_fax();
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		pod().dlv_fax(value);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return pod().tdlv_cd();
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		pod().tdlv_cd(value);
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return pod().tdlv_sundry_flg();
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		pod().tdlv_sundry_flg(value);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return pod().tdlv_nm();
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		pod().tdlv_nm(value);
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return pod().tdlv_cntct_dpt();
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		pod().tdlv_cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return pod().tdlv_cntct_psn();
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		pod().tdlv_cntct_psn(value);
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return pod().tdlv_zip_cd();
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		pod().tdlv_zip_cd(value);
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return pod().tdlv_addr1();
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		pod().tdlv_addr1(value);
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return pod().tdlv_addr2();
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		pod().tdlv_addr2(value);
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return pod().tdlv_addr3();
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		pod().tdlv_addr3(value);
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return pod().tdlv_addr4();
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		pod().tdlv_addr4(value);
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return pod().tdlv_tel();
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		pod().tdlv_tel(value);
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return pod().tdlv_fax();
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		pod().tdlv_fax(value);
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return pod().dlv_rqst_tm();
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		pod().dlv_rqst_tm(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public MCNumber purc_lt() {
		return pod().purc_lt();
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(MCNumber value) {
		pod().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(int value) {
		pod().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(long value) {
		pod().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(float value) {
		pod().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(double value) {
		pod().purc_lt(value);
	}

	/**
	 * Request source desired delivery date 依頼元納入希望日.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_tm() {
		return pod().rqst_dlv_rqst_tm();
	}

	/**
	 * Request source desired delivery date 依頼元納入希望日.<p>
	 *
	 */
	public void rqst_dlv_rqst_tm(MCDate value) {
		pod().rqst_dlv_rqst_tm(value);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return pod().purc_schd_dt();
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		pod().purc_schd_dt(value);
	}

	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public MCDate rqst_avl_rqst_dt() {
		return pod().rqst_avl_rqst_dt();
	}

	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public void rqst_avl_rqst_dt(MCDate value) {
		pod().rqst_avl_rqst_dt(value);
	}

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public boolean sync_flg() {
		return pod().sync_flg();
	}

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		pod().sync_flg(value);
	}

	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public String purc_upri_req_typ() {
		return pod().purc_upri_req_typ();
	}

	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public void purc_upri_req_typ(String value) {
		pod().purc_upri_req_typ(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return pod().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		pod().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		pod().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		pod().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		pod().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		pod().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return pod().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		pod().trd_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return pod().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		pod().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		pod().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		pod().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		pod().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		pod().base_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return pod().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		pod().base_unit_cd(value);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return pod().interim_flg();
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		pod().interim_flg(value);
	}

	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public boolean upri_not_tgt_flg() {
		return pod().upri_not_tgt_flg();
	}

	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public void upri_not_tgt_flg(boolean value) {
		pod().upri_not_tgt_flg(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return pod().trd_cur_upri();
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		pod().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		pod().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		pod().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		pod().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		pod().trd_cur_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public MCNumber trd_cur_proc_upri() {
		return pod().trd_cur_proc_upri();
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(MCNumber value) {
		pod().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(int value) {
		pod().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(long value) {
		pod().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(float value) {
		pod().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(double value) {
		pod().trd_cur_proc_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_upri() {
		return pod().trd_cur_onr_prov_upri();
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(MCNumber value) {
		pod().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(int value) {
		pod().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(long value) {
		pod().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(float value) {
		pod().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(double value) {
		pod().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return pod().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		pod().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		pod().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		pod().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		pod().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		pod().trd_cur_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return pod().trd_cur_proc_amt();
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		pod().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		pod().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		pod().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		pod().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		pod().trd_cur_proc_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return pod().trd_cur_onr_prov_amt();
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		pod().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		pod().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		pod().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		pod().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		pod().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return pod().trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		pod().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		pod().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		pod().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		pod().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		pod().trd_cur_tax_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return pod().trd_cur_dscnt_amt();
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		pod().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		pod().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		pod().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		pod().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		pod().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return pod().dscnt_rsn_cd();
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		pod().dscnt_rsn_cd(value);
	}

	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public boolean tax_fix_flg() {
		return pod().tax_fix_flg();
	}

	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public void tax_fix_flg(boolean value) {
		pod().tax_fix_flg(value);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return pod().tax_cd();
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		pod().tax_cd(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return pod().wtax_rate();
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		pod().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		pod().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		pod().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		pod().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		pod().wtax_rate(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return pod().wtax_amt();
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		pod().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		pod().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		pod().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		pod().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		pod().wtax_amt(value);
	}

	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public String drct_dlv_typ() {
		return pod().drct_dlv_typ();
	}

	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public void drct_dlv_typ(String value) {
		pod().drct_dlv_typ(value);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return pod().mfg_loc_cd();
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		pod().mfg_loc_cd(value);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return pod().bom_ptn();
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		pod().bom_ptn(value);
	}

	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public boolean bndl_flg() {
		return pod().bndl_flg();
	}

	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public void bndl_flg(boolean value) {
		pod().bndl_flg(value);
	}

	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public String outsrc_itm_ord_no() {
		return pod().outsrc_itm_ord_no();
	}

	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public void outsrc_itm_ord_no(String value) {
		pod().outsrc_itm_ord_no(value);
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return pod().outsrc_flg();
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		pod().outsrc_flg(value);
	}

	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public boolean uplnd_flg() {
		return pod().uplnd_flg();
	}

	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public void uplnd_flg(boolean value) {
		pod().uplnd_flg(value);
	}

	/**
	 * Plan changed 計画変更.<p>
	 *
	 */
	public boolean schd_chg_flg() {
		return pod().schd_chg_flg();
	}

	/**
	 * Plan changed 計画変更.<p>
	 *
	 */
	public void schd_chg_flg(boolean value) {
		pod().schd_chg_flg(value);
	}

	/**
	 * Confirmation received 請書受領.<p>
	 *
	 */
	public boolean po_conf_rcpt_flg() {
		return pod().po_conf_rcpt_flg();
	}

	/**
	 * Confirmation received 請書受領.<p>
	 *
	 */
	public void po_conf_rcpt_flg(boolean value) {
		pod().po_conf_rcpt_flg(value);
	}

	/**
	 * Confirmation received date 請書受領日.<p>
	 *
	 */
	public MCDate po_conf_rcpt_dt() {
		return pod().po_conf_rcpt_dt();
	}

	/**
	 * Confirmation received date 請書受領日.<p>
	 *
	 */
	public void po_conf_rcpt_dt(MCDate value) {
		pod().po_conf_rcpt_dt(value);
	}

	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public boolean pri_print_flg() {
		return pod().pri_print_flg();
	}

	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public void pri_print_flg(boolean value) {
		pod().pri_print_flg(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return pod().pay_crryovr_times();
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		pod().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		pod().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		pod().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		pod().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		pod().pay_crryovr_times(value);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return pod().slo_no();
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		pod().slo_no(value);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return pod().slo_d_no();
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		pod().slo_d_no(value);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return pod().io_schd_pr_no();
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		pod().io_schd_pr_no(value);
	}

	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public String bd_itm_cd() {
		return pod().bd_itm_cd();
	}

	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public void bd_itm_cd(String value) {
		pod().bd_itm_cd(value);
	}

	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public String bd_itm_sub1() {
		return pod().bd_itm_sub1();
	}

	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public void bd_itm_sub1(String value) {
		pod().bd_itm_sub1(value);
	}

	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public String bd_itm_sub2() {
		return pod().bd_itm_sub2();
	}

	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public void bd_itm_sub2(String value) {
		pod().bd_itm_sub2(value);
	}

	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public String bd_itm_sub3() {
		return pod().bd_itm_sub3();
	}

	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public void bd_itm_sub3(String value) {
		pod().bd_itm_sub3(value);
	}

	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public String bd_sno1() {
		return pod().bd_sno1();
	}

	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public void bd_sno1(String value) {
		pod().bd_sno1(value);
	}

	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public String bd_sno2() {
		return pod().bd_sno2();
	}

	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public void bd_sno2(String value) {
		pod().bd_sno2(value);
	}

	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public String bd_sno3() {
		return pod().bd_sno3();
	}

	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public void bd_sno3(String value) {
		pod().bd_sno3(value);
	}

	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public String bd_sno4() {
		return pod().bd_sno4();
	}

	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public void bd_sno4(String value) {
		pod().bd_sno4(value);
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public String bd_loc_cd() {
		return pod().bd_loc_cd();
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public void bd_loc_cd(String value) {
		pod().bd_loc_cd(value);
	}

	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public String bd_lot_no() {
		return pod().bd_lot_no();
	}

	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public void bd_lot_no(String value) {
		pod().bd_lot_no(value);
	}

	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public String bd_sublot_no() {
		return pod().bd_sublot_no();
	}

	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public void bd_sublot_no(String value) {
		pod().bd_sublot_no(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return pod().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		pod().bd_dpt_cd(value);
	}

	/**
	 * Charged WG cd. 負担WGＣＤ.<p>
	 *
	 */
	public String bd_wg_cd() {
		return pod().bd_wg_cd();
	}

	/**
	 * Charged WG cd. 負担WGＣＤ.<p>
	 *
	 */
	public void bd_wg_cd(String value) {
		pod().bd_wg_cd(value);
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public String bd_ctg_cd() {
		return pod().bd_ctg_cd();
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public void bd_ctg_cd(String value) {
		pod().bd_ctg_cd(value);
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public String bd_oper_cd() {
		return pod().bd_oper_cd();
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public void bd_oper_cd(String value) {
		pod().bd_oper_cd(value);
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public String bd_slo_no() {
		return pod().bd_slo_no();
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public void bd_slo_no(String value) {
		pod().bd_slo_no(value);
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public String bd_iv_no() {
		return pod().bd_iv_no();
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public void bd_iv_no(String value) {
		pod().bd_iv_no(value);
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public String bd_po_no() {
		return pod().bd_po_no();
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public void bd_po_no(String value) {
		pod().bd_po_no(value);
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public String bd_bp_cd() {
		return pod().bd_bp_cd();
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public void bd_bp_cd(String value) {
		pod().bd_bp_cd(value);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String dtl_intr_rmrks() {
		return pod().intr_rmrks();
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void dtl_intr_rmrks(String value) {
		pod().intr_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String dtl_trd_d_rmrks() {
		return pod().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void dtl_trd_d_rmrks(String value) {
		pod().trd_d_rmrks(value);
	}

	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public String po_print_d_rmrks() {
		return pod().po_print_d_rmrks();
	}

	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public void po_print_d_rmrks(String value) {
		pod().po_print_d_rmrks(value);
	}

	/**
	 * Delivery note details remarks 納品書明細備考.<p>
	 *
	 */
	public String dlv_slip_d_rmrks() {
		return pod().dlv_slip_d_rmrks();
	}

	/**
	 * Delivery note details remarks 納品書明細備考.<p>
	 *
	 */
	public void dlv_slip_d_rmrks(String value) {
		pod().dlv_slip_d_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String dtl_sub_char1() {
		return pod().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void dtl_sub_char1(String value) {
		pod().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String dtl_sub_char2() {
		return pod().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void dtl_sub_char2(String value) {
		pod().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String dtl_sub_char3() {
		return pod().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void dtl_sub_char3(String value) {
		pod().sub_char3(value);
	}

	/**
	 * EDI details spare character string 1 ＥＤＩ明細予備文字列１.<p>
	 *
	 */
	public String edi_sub_d_char1() {
		return pod().edi_sub_d_char1();
	}

	/**
	 * EDI details spare character string 1 ＥＤＩ明細予備文字列１.<p>
	 *
	 */
	public void edi_sub_d_char1(String value) {
		pod().edi_sub_d_char1(value);
	}

	/**
	 * EDI details spare character string 2 ＥＤＩ明細予備文字列２.<p>
	 *
	 */
	public String edi_sub_d_char2() {
		return pod().edi_sub_d_char2();
	}

	/**
	 * EDI details spare character string 2 ＥＤＩ明細予備文字列２.<p>
	 *
	 */
	public void edi_sub_d_char2(String value) {
		pod().edi_sub_d_char2(value);
	}

	/**
	 * EDI details spare character string 3 ＥＤＩ明細予備文字列３.<p>
	 *
	 */
	public String edi_sub_d_char3() {
		return pod().edi_sub_d_char3();
	}

	/**
	 * EDI details spare character string 3 ＥＤＩ明細予備文字列３.<p>
	 *
	 */
	public void edi_sub_d_char3(String value) {
		pod().edi_sub_d_char3(value);
	}

	/**
	 * EDI details spare character string 4 ＥＤＩ明細予備文字列４.<p>
	 *
	 */
	public String edi_sub_d_char4() {
		return pod().edi_sub_d_char4();
	}

	/**
	 * EDI details spare character string 4 ＥＤＩ明細予備文字列４.<p>
	 *
	 */
	public void edi_sub_d_char4(String value) {
		pod().edi_sub_d_char4(value);
	}

	/**
	 * EDI details spare character string 5 ＥＤＩ明細予備文字列５.<p>
	 *
	 */
	public String edi_sub_d_char5() {
		return pod().edi_sub_d_char5();
	}

	/**
	 * EDI details spare character string 5 ＥＤＩ明細予備文字列５.<p>
	 *
	 */
	public void edi_sub_d_char5(String value) {
		pod().edi_sub_d_char5(value);
	}

	/**
	 * EDI details spare numerical value ＥＤＩ明細予備数値.<p>
	 *
	 */
	public MCNumber edi_sub_d_num1() {
		return pod().edi_sub_d_num1();
	}

	/**
	 * EDI details spare numerical value ＥＤＩ明細予備数値.<p>
	 *
	 */
	public void edi_sub_d_num1(MCNumber value) {
		pod().edi_sub_d_num1(value);
	}

	/**
	 * EDI details spare numerical value ＥＤＩ明細予備数値.<p>
	 *
	 */
	public void edi_sub_d_num1(int value) {
		pod().edi_sub_d_num1(value);
	}

	/**
	 * EDI details spare numerical value ＥＤＩ明細予備数値.<p>
	 *
	 */
	public void edi_sub_d_num1(long value) {
		pod().edi_sub_d_num1(value);
	}

	/**
	 * EDI details spare numerical value ＥＤＩ明細予備数値.<p>
	 *
	 */
	public void edi_sub_d_num1(float value) {
		pod().edi_sub_d_num1(value);
	}

	/**
	 * EDI details spare numerical value ＥＤＩ明細予備数値.<p>
	 *
	 */
	public void edi_sub_d_num1(double value) {
		pod().edi_sub_d_num1(value);
	}

	/**
	 * EDI details spare date ＥＤＩ明細予備日付.<p>
	 *
	 */
	public MCDate edi_sub_d_dt1() {
		return pod().edi_sub_d_dt1();
	}

	/**
	 * EDI details spare date ＥＤＩ明細予備日付.<p>
	 *
	 */
	public void edi_sub_d_dt1(MCDate value) {
		pod().edi_sub_d_dt1(value);
	}

	/**
	 * Unpegged 紐切れ.<p>
	 *
	 */
	public boolean rqst_can_flg() {
		return pod().rqst_can_flg();
	}

	/**
	 * Unpegged 紐切れ.<p>
	 *
	 */
	public void rqst_can_flg(boolean value) {
		pod().rqst_can_flg(value);
	}

}

