package mcframe.serverMSBD.MSBDL5100;

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
 * ブロック"Po_Ins01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Po_Ins01_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
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
	 * Update PO item only flg. 発注明細のみ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $only_upd_pod_flg = "only_upd_pod_flg";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * PO date 発注日.<p>
	 *
	 */
	public static final String $po_dt = "po_dt";
	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $arr_pr_no = "arr_pr_no";
	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public static final String $arr_schd_no = "arr_schd_no";
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public static final String $purc_schd_no = "purc_schd_no";
	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Last cancel remaining flg. 前回打切ＦＬＧ.<p>
	 *
	 */
	public static final String $bef_abort_flg = "bef_abort_flg";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_cd = "purc_dpt_cd";
	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public static final String $purc_usr_cd = "purc_usr_cd";
	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public static final String $arr_cnt_rmrks = "arr_cnt_rmrks";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Subcontracting result prior flg. 外注実績先行ＦＬＧ.<p>
	 *
	 */
	public static final String $pre_outsrc_act_flg = "pre_outsrc_act_flg";
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
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Last base unit qty. 前回基準単位数量.<p>
	 *
	 */
	public static final String $bef_base_unit_qty = "bef_base_unit_qty";
	/**
	 * Last SEIBAN No. 1 前回手配ＮＯ１.<p>
	 *
	 */
	public static final String $bef_sno1 = "bef_sno1";
	/**
	 * Last SEIBAN No. 2 前回手配ＮＯ２.<p>
	 *
	 */
	public static final String $bef_sno2 = "bef_sno2";
	/**
	 * Last SEIBAN No. 3 前回手配ＮＯ３.<p>
	 *
	 */
	public static final String $bef_sno3 = "bef_sno3";
	/**
	 * Last SEIBAN No. 4 前回手配ＮＯ４.<p>
	 *
	 */
	public static final String $bef_sno4 = "bef_sno4";
	/**
	 * Last desired delivery date and time 前回納入希望日時.<p>
	 *
	 */
	public static final String $bef_dlv_rqst_tm = "bef_dlv_rqst_tm";
	/**
	 * Not to update receipt schedule 入荷予定更新対象外.<p>
	 *
	 */
	public static final String $not_upd_arr_schd_flg = "not_upd_arr_schd_flg";
	public static final String $pod = "pod";
	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 * Unplanned subcontracting order 計画外外注発注.<p>
	 *
	 */
	public static final String $uplnd_outsrc_flg = "uplnd_outsrc_flg";
	/**
	 * Cancel remaining receipt qty. 入荷残数打切.<p>
	 *
	 */
	public static final String $arr_rem_abort_flg = "arr_rem_abort_flg";
	/**
	 * Cancel remaining purchase qty. 仕入残数打切.<p>
	 *
	 */
	public static final String $purc_rem_abort_flg = "purc_rem_abort_flg";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public static final String $dlv_slip_seq = "dlv_slip_seq";
	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public static final String $dlv_slip_rev = "dlv_slip_rev";
	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_mng_no = "dlv_slip_mng_no";
	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public static final String $dlv_slip_mng_seq = "dlv_slip_mng_seq";
	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public static final String $purc_ddlv_dlv_slip_no = "purc_ddlv_dlv_slip_no";
	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public static final String $purc_ddlv_dlv_slip_rev = "purc_ddlv_dlv_slip_rev";

	public static final String $po_d_no = $pod + ".po_d_no";
	public static final String $po_no = $pod + ".po_no";
	public static final String $po_rev = $pod + ".po_rev";
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
	public static final String $dlv_slip_invalid_flg = $pod + ".dlv_slip_invalid_flg";
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
	public static final String $intr_rmrks = $pod + ".intr_rmrks";
	public static final String $trd_d_rmrks = $pod + ".trd_d_rmrks";
	public static final String $po_print_d_rmrks = $pod + ".po_print_d_rmrks";
	public static final String $dlv_slip_d_rmrks = $pod + ".dlv_slip_d_rmrks";
	public static final String $sub_char1 = $pod + ".sub_char1";
	public static final String $sub_char2 = $pod + ".sub_char2";
	public static final String $sub_char3 = $pod + ".sub_char3";
	public static final String $edi_sub_d_char1 = $pod + ".edi_sub_d_char1";
	public static final String $edi_sub_d_char2 = $pod + ".edi_sub_d_char2";
	public static final String $edi_sub_d_char3 = $pod + ".edi_sub_d_char3";
	public static final String $edi_sub_d_char4 = $pod + ".edi_sub_d_char4";
	public static final String $edi_sub_d_char5 = $pod + ".edi_sub_d_char5";
	public static final String $edi_sub_d_num1 = $pod + ".edi_sub_d_num1";
	public static final String $edi_sub_d_dt1 = $pod + ".edi_sub_d_dt1";
	public static final String $rqst_can_flg = $pod + ".rqst_can_flg";
	public static final String $rqst_slo_flg = $pod + ".rqst_slo_flg";
	public static final String $ext_po_d_no = $pod + ".ext_po_d_no";
	public static final String $purc_basis_typ = $pod + ".purc_basis_typ";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta only_upd_pod_flg_META = createCommonMeta($only_upd_pod_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta po_dt_META = createCommonMeta($po_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_pr_no_META = createCommonMeta($arr_pr_no, mcframe.commonMA.meta.MA_META.ARR_PR_NO);
	public static final MCMeta arr_schd_no_META = createCommonMeta($arr_schd_no, mcframe.commonMA.meta.MA_META.ARR_SCHD_NO);
	public static final MCMeta purc_schd_no_META = createCommonMeta($purc_schd_no, mcframe.commonMA.meta.MA_META.PURC_SCHD_NO);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bef_abort_flg_META = createCommonMeta($bef_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta purc_dpt_cd_META = createCommonMeta($purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta purc_usr_cd_META = createCommonMeta($purc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta arr_cnt_rmrks_META = createCommonMeta($arr_cnt_rmrks, mcframe.commonMS.meta.MS_META.ARR_CNT_RMRKS);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta pre_outsrc_act_flg_META = createCommonMeta($pre_outsrc_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta bef_base_unit_qty_META = createCommonMeta($bef_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta bef_sno1_META = createCommonMeta($bef_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta bef_sno2_META = createCommonMeta($bef_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta bef_sno3_META = createCommonMeta($bef_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta bef_sno4_META = createCommonMeta($bef_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta bef_dlv_rqst_tm_META = createCommonMeta($bef_dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta not_upd_arr_schd_flg_META = createCommonMeta($not_upd_arr_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pod_META = createInnerRowMeta($pod, mcframe.serverMS.dbc.MST_PO_D_R.class);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta uplnd_outsrc_flg_META = createCommonMeta($uplnd_outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_rem_abort_flg_META = createCommonMeta($arr_rem_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_rem_abort_flg_META = createCommonMeta($purc_rem_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_seq_META = createCommonMeta($dlv_slip_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dlv_slip_rev_META = createCommonMeta($dlv_slip_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta dlv_slip_mng_no_META = createCommonMeta($dlv_slip_mng_no, mcframe.commonMS.meta.MS_META.DLV_SLIP_MNG_NO);
	public static final MCMeta dlv_slip_mng_seq_META = createCommonMeta($dlv_slip_mng_seq, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta purc_ddlv_dlv_slip_no_META = createCommonMeta($purc_ddlv_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta purc_ddlv_dlv_slip_rev_META = createCommonMeta($purc_ddlv_dlv_slip_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);

	protected static final ConstMetaList<Po_Ins01_DtlR> constMetas = new ConstMetaList<Po_Ins01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			hdr_peg_no_META,
			err_flg_META,
			data_crud_typ_META,
			only_upd_pod_flg_META,
			sppl_cd_META,
			po_dt_META,
			arr_pr_no_META,
			arr_schd_no_META,
			purc_schd_no_META,
			abort_flg_META,
			bef_abort_flg_META,
			trd_cd_META,
			trd_ptn_typ_META,
			purc_dpt_cd_META,
			wg_cd_META,
			purc_usr_cd_META,
			arr_cnt_rmrks_META,
			mfg_inst_no_META,
			pre_outsrc_act_flg_META,
			lot_no_META,
			sublot_no_META,
			trd_cur_cd_META,
			bef_base_unit_qty_META,
			bef_sno1_META,
			bef_sno2_META,
			bef_sno3_META,
			bef_sno4_META,
			bef_dlv_rqst_tm_META,
			not_upd_arr_schd_flg_META,
			pod_META,
			inc_tax_flg_META,
			uplnd_outsrc_flg_META,
			arr_rem_abort_flg_META,
			purc_rem_abort_flg_META,
			dlv_slip_no_META,
			dlv_slip_seq_META,
			dlv_slip_rev_META,
			dlv_slip_mng_no_META,
			dlv_slip_mng_seq_META,
			purc_ddlv_dlv_slip_no_META,
			purc_ddlv_dlv_slip_rev_META
		},
		new String[][]{
			{
				"po_d_no",
				"po_no",
				"po_rev",
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
				"dlv_slip_invalid_flg",
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
				"intr_rmrks",
				"trd_d_rmrks",
				"po_print_d_rmrks",
				"dlv_slip_d_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"edi_sub_d_char1",
				"edi_sub_d_char2",
				"edi_sub_d_char3",
				"edi_sub_d_char4",
				"edi_sub_d_char5",
				"edi_sub_d_num1",
				"edi_sub_d_dt1",
				"rqst_can_flg",
				"rqst_slo_flg",
				"ext_po_d_no",
				"purc_basis_typ"
			},
			{
				$po_d_no,
				$po_no,
				$po_rev,
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
				$dlv_slip_invalid_flg,
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
				$intr_rmrks,
				$trd_d_rmrks,
				$po_print_d_rmrks,
				$dlv_slip_d_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$edi_sub_d_char1,
				$edi_sub_d_char2,
				$edi_sub_d_char3,
				$edi_sub_d_char4,
				$edi_sub_d_char5,
				$edi_sub_d_num1,
				$edi_sub_d_dt1,
				$rqst_can_flg,
				$rqst_slo_flg,
				$ext_po_d_no,
				$purc_basis_typ
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
	protected Po_Ins01_DtlR_MC_A(ConstMetaList<? extends Po_Ins01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Po_Ins01_DtlR clone() {
		return (Po_Ins01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Po_Ins01_DtlR createInstance() {
		return (Po_Ins01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Po_Ins01_DtlR getValues(String... names) {
		return (Po_Ins01_DtlR) super.getValues(names);
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
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 1, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
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
	 * Update PO item only flg. 発注明細のみ更新ＦＬＧ.<p>
	 *
	 */
	public boolean only_upd_pod_flg() {
		return getConstBoolean(offset + 4, $only_upd_pod_flg);
	}

	/**
	 * Update PO item only flg. 発注明細のみ更新ＦＬＧ.<p>
	 *
	 */
	public void only_upd_pod_flg(boolean value) {
		setConstBoolean(offset + 4, $only_upd_pod_flg, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 5, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 5, $sppl_cd, value);
	}


	/**
	 * PO date 発注日.<p>
	 *
	 */
	public MCDate po_dt() {
		return getConstDate(offset + 6, $po_dt);
	}

	/**
	 * PO date 発注日.<p>
	 *
	 */
	public void po_dt(MCDate value) {
		setConstDate(offset + 6, $po_dt, value);
	}


	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 7, $arr_pr_no);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 7, $arr_pr_no, value);
	}


	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return getConstString(offset + 8, $arr_schd_no);
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		setConstString(offset + 8, $arr_schd_no, value);
	}


	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public String purc_schd_no() {
		return getConstString(offset + 9, $purc_schd_no);
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public void purc_schd_no(String value) {
		setConstString(offset + 9, $purc_schd_no, value);
	}


	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 10, $abort_flg);
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 10, $abort_flg, value);
	}


	/**
	 * Last cancel remaining flg. 前回打切ＦＬＧ.<p>
	 *
	 */
	public boolean bef_abort_flg() {
		return getConstBoolean(offset + 11, $bef_abort_flg);
	}

	/**
	 * Last cancel remaining flg. 前回打切ＦＬＧ.<p>
	 *
	 */
	public void bef_abort_flg(boolean value) {
		setConstBoolean(offset + 11, $bef_abort_flg, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 12, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 12, $trd_cd, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 13, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 13, $trd_ptn_typ, value);
	}


	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return getConstString(offset + 14, $purc_dpt_cd);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		setConstString(offset + 14, $purc_dpt_cd, value);
	}


	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 15, $wg_cd);
	}

	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 15, $wg_cd, value);
	}


	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return getConstString(offset + 16, $purc_usr_cd);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		setConstString(offset + 16, $purc_usr_cd, value);
	}


	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public String arr_cnt_rmrks() {
		return getConstString(offset + 17, $arr_cnt_rmrks);
	}

	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public void arr_cnt_rmrks(String value) {
		setConstString(offset + 17, $arr_cnt_rmrks, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 18, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 18, $mfg_inst_no, value);
	}


	/**
	 * Subcontracting result prior flg. 外注実績先行ＦＬＧ.<p>
	 *
	 */
	public boolean pre_outsrc_act_flg() {
		return getConstBoolean(offset + 19, $pre_outsrc_act_flg);
	}

	/**
	 * Subcontracting result prior flg. 外注実績先行ＦＬＧ.<p>
	 *
	 */
	public void pre_outsrc_act_flg(boolean value) {
		setConstBoolean(offset + 19, $pre_outsrc_act_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 20, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 20, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 21, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 21, $sublot_no, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 22, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 22, $trd_cur_cd, value);
	}


	/**
	 * Last base unit qty. 前回基準単位数量.<p>
	 *
	 */
	public MCNumber bef_base_unit_qty() {
		return getConstNumber(offset + 23, $bef_base_unit_qty);
	}

	/**
	 * Last base unit qty. 前回基準単位数量.<p>
	 *
	 */
	public void bef_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 23, $bef_base_unit_qty, value);
	}

	/**
	 * Last base unit qty. 前回基準単位数量.<p>
	 *
	 */
	public void bef_base_unit_qty(int value) {
		setConstNumber(offset + 23, $bef_base_unit_qty, value);
	}

	/**
	 * Last base unit qty. 前回基準単位数量.<p>
	 *
	 */
	public void bef_base_unit_qty(long value) {
		setConstNumber(offset + 23, $bef_base_unit_qty, value);
	}

	/**
	 * Last base unit qty. 前回基準単位数量.<p>
	 *
	 */
	public void bef_base_unit_qty(float value) {
		setConstNumber(offset + 23, $bef_base_unit_qty, value);
	}

	/**
	 * Last base unit qty. 前回基準単位数量.<p>
	 *
	 */
	public void bef_base_unit_qty(double value) {
		setConstNumber(offset + 23, $bef_base_unit_qty, value);
	}


	/**
	 * Last SEIBAN No. 1 前回手配ＮＯ１.<p>
	 *
	 */
	public String bef_sno1() {
		return getConstString(offset + 24, $bef_sno1);
	}

	/**
	 * Last SEIBAN No. 1 前回手配ＮＯ１.<p>
	 *
	 */
	public void bef_sno1(String value) {
		setConstString(offset + 24, $bef_sno1, value);
	}


	/**
	 * Last SEIBAN No. 2 前回手配ＮＯ２.<p>
	 *
	 */
	public String bef_sno2() {
		return getConstString(offset + 25, $bef_sno2);
	}

	/**
	 * Last SEIBAN No. 2 前回手配ＮＯ２.<p>
	 *
	 */
	public void bef_sno2(String value) {
		setConstString(offset + 25, $bef_sno2, value);
	}


	/**
	 * Last SEIBAN No. 3 前回手配ＮＯ３.<p>
	 *
	 */
	public String bef_sno3() {
		return getConstString(offset + 26, $bef_sno3);
	}

	/**
	 * Last SEIBAN No. 3 前回手配ＮＯ３.<p>
	 *
	 */
	public void bef_sno3(String value) {
		setConstString(offset + 26, $bef_sno3, value);
	}


	/**
	 * Last SEIBAN No. 4 前回手配ＮＯ４.<p>
	 *
	 */
	public String bef_sno4() {
		return getConstString(offset + 27, $bef_sno4);
	}

	/**
	 * Last SEIBAN No. 4 前回手配ＮＯ４.<p>
	 *
	 */
	public void bef_sno4(String value) {
		setConstString(offset + 27, $bef_sno4, value);
	}


	/**
	 * Last desired delivery date and time 前回納入希望日時.<p>
	 *
	 */
	public MCDate bef_dlv_rqst_tm() {
		return getConstDate(offset + 28, $bef_dlv_rqst_tm);
	}

	/**
	 * Last desired delivery date and time 前回納入希望日時.<p>
	 *
	 */
	public void bef_dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 28, $bef_dlv_rqst_tm, value);
	}


	/**
	 * Not to update receipt schedule 入荷予定更新対象外.<p>
	 *
	 */
	public boolean not_upd_arr_schd_flg() {
		return getConstBoolean(offset + 29, $not_upd_arr_schd_flg);
	}

	/**
	 * Not to update receipt schedule 入荷予定更新対象外.<p>
	 *
	 */
	public void not_upd_arr_schd_flg(boolean value) {
		setConstBoolean(offset + 29, $not_upd_arr_schd_flg, value);
	}


	public mcframe.serverMS.dbc.MST_PO_D_R pod(){
		return (mcframe.serverMS.dbc.MST_PO_D_R) getConstInnerRow(offset + 30, $pod);
	}
	
	public void pod(mcframe.serverMS.dbc.MST_PO_D_R row){
		setConstInnerRow(offset + 30, $pod, row);
	}


	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 31, $inc_tax_flg);
	}

	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 31, $inc_tax_flg, value);
	}


	/**
	 * Unplanned subcontracting order 計画外外注発注.<p>
	 *
	 */
	public boolean uplnd_outsrc_flg() {
		return getConstBoolean(offset + 32, $uplnd_outsrc_flg);
	}

	/**
	 * Unplanned subcontracting order 計画外外注発注.<p>
	 *
	 */
	public void uplnd_outsrc_flg(boolean value) {
		setConstBoolean(offset + 32, $uplnd_outsrc_flg, value);
	}


	/**
	 * Cancel remaining receipt qty. 入荷残数打切.<p>
	 *
	 */
	public boolean arr_rem_abort_flg() {
		return getConstBoolean(offset + 33, $arr_rem_abort_flg);
	}

	/**
	 * Cancel remaining receipt qty. 入荷残数打切.<p>
	 *
	 */
	public void arr_rem_abort_flg(boolean value) {
		setConstBoolean(offset + 33, $arr_rem_abort_flg, value);
	}


	/**
	 * Cancel remaining purchase qty. 仕入残数打切.<p>
	 *
	 */
	public boolean purc_rem_abort_flg() {
		return getConstBoolean(offset + 34, $purc_rem_abort_flg);
	}

	/**
	 * Cancel remaining purchase qty. 仕入残数打切.<p>
	 *
	 */
	public void purc_rem_abort_flg(boolean value) {
		setConstBoolean(offset + 34, $purc_rem_abort_flg, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 35, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 35, $dlv_slip_no, value);
	}


	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return getConstNumber(offset + 36, $dlv_slip_seq);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		setConstNumber(offset + 36, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		setConstNumber(offset + 36, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		setConstNumber(offset + 36, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		setConstNumber(offset + 36, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		setConstNumber(offset + 36, $dlv_slip_seq, value);
	}


	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public MCNumber dlv_slip_rev() {
		return getConstNumber(offset + 37, $dlv_slip_rev);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(MCNumber value) {
		setConstNumber(offset + 37, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(int value) {
		setConstNumber(offset + 37, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(long value) {
		setConstNumber(offset + 37, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(float value) {
		setConstNumber(offset + 37, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(double value) {
		setConstNumber(offset + 37, $dlv_slip_rev, value);
	}


	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public String dlv_slip_mng_no() {
		return getConstString(offset + 38, $dlv_slip_mng_no);
	}

	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public void dlv_slip_mng_no(String value) {
		setConstString(offset + 38, $dlv_slip_mng_no, value);
	}


	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public MCNumber dlv_slip_mng_seq() {
		return getConstNumber(offset + 39, $dlv_slip_mng_seq);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(MCNumber value) {
		setConstNumber(offset + 39, $dlv_slip_mng_seq, value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(int value) {
		setConstNumber(offset + 39, $dlv_slip_mng_seq, value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(long value) {
		setConstNumber(offset + 39, $dlv_slip_mng_seq, value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(float value) {
		setConstNumber(offset + 39, $dlv_slip_mng_seq, value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(double value) {
		setConstNumber(offset + 39, $dlv_slip_mng_seq, value);
	}


	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public String purc_ddlv_dlv_slip_no() {
		return getConstString(offset + 40, $purc_ddlv_dlv_slip_no);
	}

	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_no(String value) {
		setConstString(offset + 40, $purc_ddlv_dlv_slip_no, value);
	}


	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public MCNumber purc_ddlv_dlv_slip_rev() {
		return getConstNumber(offset + 41, $purc_ddlv_dlv_slip_rev);
	}

	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_rev(MCNumber value) {
		setConstNumber(offset + 41, $purc_ddlv_dlv_slip_rev, value);
	}

	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_rev(int value) {
		setConstNumber(offset + 41, $purc_ddlv_dlv_slip_rev, value);
	}

	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_rev(long value) {
		setConstNumber(offset + 41, $purc_ddlv_dlv_slip_rev, value);
	}

	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_rev(float value) {
		setConstNumber(offset + 41, $purc_ddlv_dlv_slip_rev, value);
	}

	/**
	 * Direct delivery delivery note rev. number 仕入直送納品書改訂番号.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_rev(double value) {
		setConstNumber(offset + 41, $purc_ddlv_dlv_slip_rev, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($bef_sno1.equalsIgnoreCase(name)) {
			return bef_sno1();
		}
		if ($bef_sno2.equalsIgnoreCase(name)) {
			return bef_sno2();
		}
		if ($bef_sno3.equalsIgnoreCase(name)) {
			return bef_sno3();
		}
		if ($bef_sno4.equalsIgnoreCase(name)) {
			return bef_sno4();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			return dlv_slip_mng_no();
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($bef_base_unit_qty.equalsIgnoreCase(name)) {
			return bef_base_unit_qty();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			return dlv_slip_mng_seq();
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_rev();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($po_dt.equalsIgnoreCase(name)) {
			return po_dt();
		}
		if ($bef_dlv_rqst_tm.equalsIgnoreCase(name)) {
			return bef_dlv_rqst_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($only_upd_pod_flg.equalsIgnoreCase(name)) {
			return only_upd_pod_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			return bef_abort_flg();
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			return pre_outsrc_act_flg();
		}
		if ($not_upd_arr_schd_flg.equalsIgnoreCase(name)) {
			return not_upd_arr_schd_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($uplnd_outsrc_flg.equalsIgnoreCase(name)) {
			return uplnd_outsrc_flg();
		}
		if ($arr_rem_abort_flg.equalsIgnoreCase(name)) {
			return arr_rem_abort_flg();
		}
		if ($purc_rem_abort_flg.equalsIgnoreCase(name)) {
			return purc_rem_abort_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($bef_sno1.equalsIgnoreCase(name)) {
			return bef_sno1();
		}
		if ($bef_sno2.equalsIgnoreCase(name)) {
			return bef_sno2();
		}
		if ($bef_sno3.equalsIgnoreCase(name)) {
			return bef_sno3();
		}
		if ($bef_sno4.equalsIgnoreCase(name)) {
			return bef_sno4();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			return dlv_slip_mng_no();
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($bef_base_unit_qty.equalsIgnoreCase(name)) {
			return bef_base_unit_qty();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			return dlv_slip_mng_seq();
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_rev();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($po_dt.equalsIgnoreCase(name)) {
			return po_dt();
		}
		if ($bef_dlv_rqst_tm.equalsIgnoreCase(name)) {
			return bef_dlv_rqst_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($only_upd_pod_flg.equalsIgnoreCase(name)) {
			return only_upd_pod_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			return bef_abort_flg();
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			return pre_outsrc_act_flg();
		}
		if ($not_upd_arr_schd_flg.equalsIgnoreCase(name)) {
			return not_upd_arr_schd_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($uplnd_outsrc_flg.equalsIgnoreCase(name)) {
			return uplnd_outsrc_flg();
		}
		if ($arr_rem_abort_flg.equalsIgnoreCase(name)) {
			return arr_rem_abort_flg();
		}
		if ($purc_rem_abort_flg.equalsIgnoreCase(name)) {
			return purc_rem_abort_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($bef_sno1.equalsIgnoreCase(name)) {
			bef_sno1(value);
			return;
		}
		if ($bef_sno2.equalsIgnoreCase(name)) {
			bef_sno2(value);
			return;
		}
		if ($bef_sno3.equalsIgnoreCase(name)) {
			bef_sno3(value);
			return;
		}
		if ($bef_sno4.equalsIgnoreCase(name)) {
			bef_sno4(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			dlv_slip_mng_no(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($bef_base_unit_qty.equalsIgnoreCase(name)) {
			bef_base_unit_qty(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($bef_base_unit_qty.equalsIgnoreCase(name)) {
			bef_base_unit_qty(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($bef_base_unit_qty.equalsIgnoreCase(name)) {
			bef_base_unit_qty(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($bef_base_unit_qty.equalsIgnoreCase(name)) {
			bef_base_unit_qty(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($bef_base_unit_qty.equalsIgnoreCase(name)) {
			bef_base_unit_qty(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($po_dt.equalsIgnoreCase(name)) {
			po_dt(value);
			return;
		}
		if ($bef_dlv_rqst_tm.equalsIgnoreCase(name)) {
			bef_dlv_rqst_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($only_upd_pod_flg.equalsIgnoreCase(name)) {
			only_upd_pod_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			bef_abort_flg(value);
			return;
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			pre_outsrc_act_flg(value);
			return;
		}
		if ($not_upd_arr_schd_flg.equalsIgnoreCase(name)) {
			not_upd_arr_schd_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($uplnd_outsrc_flg.equalsIgnoreCase(name)) {
			uplnd_outsrc_flg(value);
			return;
		}
		if ($arr_rem_abort_flg.equalsIgnoreCase(name)) {
			arr_rem_abort_flg(value);
			return;
		}
		if ($purc_rem_abort_flg.equalsIgnoreCase(name)) {
			purc_rem_abort_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($bef_sno1.equalsIgnoreCase(name)) {
			bef_sno1(value);
			return;
		}
		if ($bef_sno2.equalsIgnoreCase(name)) {
			bef_sno2(value);
			return;
		}
		if ($bef_sno3.equalsIgnoreCase(name)) {
			bef_sno3(value);
			return;
		}
		if ($bef_sno4.equalsIgnoreCase(name)) {
			bef_sno4(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			dlv_slip_mng_no(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($bef_base_unit_qty.equalsIgnoreCase(name)) {
			bef_base_unit_qty(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($bef_base_unit_qty.equalsIgnoreCase(name)) {
			bef_base_unit_qty(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($bef_base_unit_qty.equalsIgnoreCase(name)) {
			bef_base_unit_qty(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($bef_base_unit_qty.equalsIgnoreCase(name)) {
			bef_base_unit_qty(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($bef_base_unit_qty.equalsIgnoreCase(name)) {
			bef_base_unit_qty(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_rev.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($po_dt.equalsIgnoreCase(name)) {
			po_dt(value);
			return;
		}
		if ($bef_dlv_rqst_tm.equalsIgnoreCase(name)) {
			bef_dlv_rqst_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($only_upd_pod_flg.equalsIgnoreCase(name)) {
			only_upd_pod_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			bef_abort_flg(value);
			return;
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			pre_outsrc_act_flg(value);
			return;
		}
		if ($not_upd_arr_schd_flg.equalsIgnoreCase(name)) {
			not_upd_arr_schd_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($uplnd_outsrc_flg.equalsIgnoreCase(name)) {
			uplnd_outsrc_flg(value);
			return;
		}
		if ($arr_rem_abort_flg.equalsIgnoreCase(name)) {
			arr_rem_abort_flg(value);
			return;
		}
		if ($purc_rem_abort_flg.equalsIgnoreCase(name)) {
			purc_rem_abort_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($pod.equalsIgnoreCase(name)) {
			return pod();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($pod.equalsIgnoreCase(name)) {
			pod(
				((MCContainerMeta) pod_META).castInnerRow(mcframe.serverMS.dbc.MST_PO_D_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
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
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return pod().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		pod().po_no(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public MCNumber po_rev() {
		return pod().po_rev();
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(MCNumber value) {
		pod().po_rev(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(int value) {
		pod().po_rev(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(long value) {
		pod().po_rev(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(float value) {
		pod().po_rev(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(double value) {
		pod().po_rev(value);
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
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return pod().sundry_itm_flg();
	}

	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
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
	 * Miscellaneous delivery destination flg. 納品先諸口ＦＬＧ.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return pod().dlv_sundry_flg();
	}

	/**
	 * Miscellaneous delivery destination flg. 納品先諸口ＦＬＧ.<p>
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
	 * Miscellaneous receiving point flg. 配送先諸口ＦＬＧ.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return pod().tdlv_sundry_flg();
	}

	/**
	 * Miscellaneous receiving point flg. 配送先諸口ＦＬＧ.<p>
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
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return pod().dlv_rqst_tm();
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
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
	 * Request source desired delivery date and time 依頼元納入希望日時.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_tm() {
		return pod().rqst_dlv_rqst_tm();
	}

	/**
	 * Request source desired delivery date and time 依頼元納入希望日時.<p>
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
	 * Simultaneous recording flg. 同時計上ＦＬＧ.<p>
	 *
	 */
	public boolean sync_flg() {
		return pod().sync_flg();
	}

	/**
	 * Simultaneous recording flg. 同時計上ＦＬＧ.<p>
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
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public boolean interim_flg() {
		return pod().interim_flg();
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		pod().interim_flg(value);
	}

	/**
	 * Not to reacquire unit price flg. 単価再取得対象外ＦＬＧ.<p>
	 *
	 */
	public boolean upri_not_tgt_flg() {
		return pod().upri_not_tgt_flg();
	}

	/**
	 * Not to reacquire unit price flg. 単価再取得対象外ＦＬＧ.<p>
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
	 * Tax specified flg. 税指定ＦＬＧ.<p>
	 *
	 */
	public boolean tax_fix_flg() {
		return pod().tax_fix_flg();
	}

	/**
	 * Tax specified flg. 税指定ＦＬＧ.<p>
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
	 * Aggregation flg. まとめＦＬＧ.<p>
	 *
	 */
	public boolean bndl_flg() {
		return pod().bndl_flg();
	}

	/**
	 * Aggregation flg. まとめＦＬＧ.<p>
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
	 * Subcontracting flg. 外注ＦＬＧ.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return pod().outsrc_flg();
	}

	/**
	 * Subcontracting flg. 外注ＦＬＧ.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		pod().outsrc_flg(value);
	}

	/**
	 * Unplanned flg. 計画外ＦＬＧ.<p>
	 *
	 */
	public boolean uplnd_flg() {
		return pod().uplnd_flg();
	}

	/**
	 * Unplanned flg. 計画外ＦＬＧ.<p>
	 *
	 */
	public void uplnd_flg(boolean value) {
		pod().uplnd_flg(value);
	}

	/**
	 * Plan changed flg. 計画変更ＦＬＧ.<p>
	 *
	 */
	public boolean schd_chg_flg() {
		return pod().schd_chg_flg();
	}

	/**
	 * Plan changed flg. 計画変更ＦＬＧ.<p>
	 *
	 */
	public void schd_chg_flg(boolean value) {
		pod().schd_chg_flg(value);
	}

	/**
	 * Confirmation received flg. 請書受領ＦＬＧ.<p>
	 *
	 */
	public boolean po_conf_rcpt_flg() {
		return pod().po_conf_rcpt_flg();
	}

	/**
	 * Confirmation received flg. 請書受領ＦＬＧ.<p>
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
	 * Print price flg. 価格印字ＦＬＧ.<p>
	 *
	 */
	public boolean pri_print_flg() {
		return pod().pri_print_flg();
	}

	/**
	 * Print price flg. 価格印字ＦＬＧ.<p>
	 *
	 */
	public void pri_print_flg(boolean value) {
		pod().pri_print_flg(value);
	}

	/**
	 * Not for delivery note flg. 納品書対象外ＦＬＧ.<p>
	 *
	 */
	public boolean dlv_slip_invalid_flg() {
		return pod().dlv_slip_invalid_flg();
	}

	/**
	 * Not for delivery note flg. 納品書対象外ＦＬＧ.<p>
	 *
	 */
	public void dlv_slip_invalid_flg(boolean value) {
		pod().dlv_slip_invalid_flg(value);
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
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public String bd_wg_cd() {
		return pod().bd_wg_cd();
	}

	/**
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
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
	public String intr_rmrks() {
		return pod().intr_rmrks();
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		pod().intr_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return pod().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
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
	public String sub_char1() {
		return pod().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		pod().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return pod().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		pod().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return pod().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
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

	/**
	 * Request source sales order 依頼元受注.<p>
	 *
	 */
	public boolean rqst_slo_flg() {
		return pod().rqst_slo_flg();
	}

	/**
	 * Request source sales order 依頼元受注.<p>
	 *
	 */
	public void rqst_slo_flg(boolean value) {
		pod().rqst_slo_flg(value);
	}

	/**
	 * External PO details No. 外部発注明細ＮＯ.<p>
	 *
	 */
	public String ext_po_d_no() {
		return pod().ext_po_d_no();
	}

	/**
	 * External PO details No. 外部発注明細ＮＯ.<p>
	 *
	 */
	public void ext_po_d_no(String value) {
		pod().ext_po_d_no(value);
	}

	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public String purc_basis_typ() {
		return pod().purc_basis_typ();
	}

	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public void purc_basis_typ(String value) {
		pod().purc_basis_typ(value);
	}

}

