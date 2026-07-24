package mcframe.serverMSBE.MSBEL2210;

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
 * ブロック"Iv_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Iv_Chk01_DtlR_MC_A extends MCConstRow {

	public static final String $pd = "pd";
	/**
	 * Not for purchase flg. 仕入対象外ＦＬＧ.<p>
	 *
	 */
	public static final String $non_purc_flg = "non_purc_flg";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	/**
	 * Purchase I/V details remarks 受領Ｉ／Ｖ明細備考.<p>
	 *
	 */
	public static final String $rcpt_iv_d_rmrks = "rcpt_iv_d_rmrks";
	/**
	 * Purchase I/V internal details remarks 受領Ｉ／Ｖ内部明細備考.<p>
	 *
	 */
	public static final String $rcpt_iv_intr_d_rmrks = "rcpt_iv_intr_d_rmrks";
	/**
	 * Purchase I/V details spare 1 受領Ｉ／Ｖ明細予備１.<p>
	 *
	 */
	public static final String $rcpt_iv_d_sub_char1 = "rcpt_iv_d_sub_char1";
	/**
	 * Purchase I/V details spare 2 受領Ｉ／Ｖ明細予備２.<p>
	 *
	 */
	public static final String $rcpt_iv_d_sub_char2 = "rcpt_iv_d_sub_char2";
	/**
	 * Purchase I/V details spare 3 受領Ｉ／Ｖ明細予備３.<p>
	 *
	 */
	public static final String $rcpt_iv_d_sub_char3 = "rcpt_iv_d_sub_char3";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Transaction unit cd. at PO 発注時取引単位ＣＤ.<p>
	 *
	 */
	public static final String $src_trd_unit_cd = "src_trd_unit_cd";
	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public static final String $src_trd_unit_conv_qty = "src_trd_unit_conv_qty";
	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public static final String $src_trd_unit_conv_base_qty = "src_trd_unit_conv_base_qty";
	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $src_trd_unit_dec_place = "src_trd_unit_dec_place";
	/**
	 * Transaction unit rounding type at PO 発注時取引単位端数処理区分.<p>
	 *
	 */
	public static final String $src_trd_unit_rnd_typ = "src_trd_unit_rnd_typ";
	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public static final String $src_trd_unit_qty = "src_trd_unit_qty";
	/**
	 * Unit qty. at PO 発注時基準単位数量.<p>
	 *
	 */
	public static final String $src_base_unit_qty = "src_base_unit_qty";
	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public static final String $src_trd_cur_upri = "src_trd_cur_upri";
	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public static final String $src_trd_cur_proc_upri = "src_trd_cur_proc_upri";
	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public static final String $src_trd_cur_onr_prov_upri = "src_trd_cur_onr_prov_upri";
	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public static final String $src_trd_cur_dscnt_amt = "src_trd_cur_dscnt_amt";
	/**
	 * PO amount (Transaction currency) 発注取引通貨金額.<p>
	 *
	 */
	public static final String $src_trd_cur_amt = "src_trd_cur_amt";
	/**
	 * Subcontracting amount at PO (Transaction currency) 発注取引通貨加工金額.<p>
	 *
	 */
	public static final String $src_trd_cur_proc_amt = "src_trd_cur_proc_amt";
	/**
	 * Chargeable supply amount (PO transaction currency) 発注取引通貨有償支給金額.<p>
	 *
	 */
	public static final String $src_trd_cur_onr_prov_amt = "src_trd_cur_onr_prov_amt";
	/**
	 * PO tax amount (Transaction currency) 発注取引通貨税額.<p>
	 *
	 */
	public static final String $src_trd_cur_tax_amt = "src_trd_cur_tax_amt";
	/**
	 * Temporary AP use flg. 暫定買掛使用ＦＬＧ.<p>
	 *
	 */
	public static final String $temp_ap_use_flg = "temp_ap_use_flg";
	/**
	 * Cancel remaining schedule flg. 予定打切ＦＬＧ.<p>
	 *
	 */
	public static final String $schd_abort_flg = "schd_abort_flg";

	public static final String $data_crud_typ = $pd + ".data_crud_typ";
	public static final String $peg_no = $pd + ".peg_no";
	public static final String $err_flg = $pd + ".err_flg";
	public static final String $trd_cd = $pd + ".trd_cd";
	public static final String $trd_ptn_typ = $pd + ".trd_ptn_typ";
	public static final String $arr_ptn_typ = $pd + ".arr_ptn_typ";
	public static final String $sync_flg = $pd + ".sync_flg";
	public static final String $temp_ap_flg = $pd + ".temp_ap_flg";
	public static final String $outsrc_flg = $pd + ".outsrc_flg";
	public static final String $po_no = $pd + ".po_no";
	public static final String $po_d_no = $pd + ".po_d_no";
	public static final String $rcpt_iv_d_no = $pd + ".rcpt_iv_d_no";
	public static final String $mfg_inst_no = $pd + ".mfg_inst_no";
	public static final String $mfg_loc_cd = $pd + ".mfg_loc_cd";
	public static final String $rqst_avl_rqst_dt = $pd + ".rqst_avl_rqst_dt";
	public static final String $purc_schd_no = $pd + ".purc_schd_no";
	public static final String $arr_schd_no = $pd + ".arr_schd_no";
	public static final String $purc_act_no = $pd + ".purc_act_no";
	public static final String $purc_act_seq = $pd + ".purc_act_seq";
	public static final String $purc_act_rev = $pd + ".purc_act_rev";
	public static final String $purc_act_d_no = $pd + ".purc_act_d_no";
	public static final String $purc_act_d_seq = $pd + ".purc_act_d_seq";
	public static final String $itm_cd = $pd + ".itm_cd";
	public static final String $itm_sub1 = $pd + ".itm_sub1";
	public static final String $itm_sub2 = $pd + ".itm_sub2";
	public static final String $itm_sub3 = $pd + ".itm_sub3";
	public static final String $itm_nm = $pd + ".itm_nm";
	public static final String $iv_itm_nm = $pd + ".iv_itm_nm";
	public static final String $cont_fctr_unit_cd = $pd + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_flg = $pd + ".cont_fctr_flg";
	public static final String $purc_cont_qty = $pd + ".purc_cont_qty";
	public static final String $asset_mng_typ = $pd + ".asset_mng_typ";
	public static final String $stk_mng_typ = $pd + ".stk_mng_typ";
	public static final String $sundry_itm_flg = $pd + ".sundry_itm_flg";
	public static final String $purc_upri_cng_flg = $pd + ".purc_upri_cng_flg";
	public static final String $ver_flg = $pd + ".ver_flg";
	public static final String $dscnt_itm_flg = $pd + ".dscnt_itm_flg";
	public static final String $bp_lot_flg = $pd + ".bp_lot_flg";
	public static final String $maker_cd = $pd + ".maker_cd";
	public static final String $accpt_dfct_flg = $pd + ".accpt_dfct_flg";
	public static final String $trd_unit_cd = $pd + ".trd_unit_cd";
	public static final String $trd_unit_qty = $pd + ".trd_unit_qty";
	public static final String $trd_unit_conv_base_qty = $pd + ".trd_unit_conv_base_qty";
	public static final String $trd_unit_conv_qty = $pd + ".trd_unit_conv_qty";
	public static final String $trd_unit_dec_place = $pd + ".trd_unit_dec_place";
	public static final String $trd_unit_rnd_typ = $pd + ".trd_unit_rnd_typ";
	public static final String $pack_flg = $pd + ".pack_flg";
	public static final String $base_unit_cd = $pd + ".base_unit_cd";
	public static final String $base_unit_qty = $pd + ".base_unit_qty";
	public static final String $base_unit_dec_place = $pd + ".base_unit_dec_place";
	public static final String $base_unit_rnd_typ = $pd + ".base_unit_rnd_typ";
	public static final String $abort_flg = $pd + ".abort_flg";
	public static final String $ncv_flg = $pd + ".ncv_flg";
	public static final String $gd_cd = $pd + ".gd_cd";
	public static final String $quality_typ = $pd + ".quality_typ";
	public static final String $sno1 = $pd + ".sno1";
	public static final String $sno2 = $pd + ".sno2";
	public static final String $sno3 = $pd + ".sno3";
	public static final String $sno4 = $pd + ".sno4";
	public static final String $dlv_loc_cd = $pd + ".dlv_loc_cd";
	public static final String $dlv_loc_mng_typ = $pd + ".dlv_loc_mng_typ";
	public static final String $dlv_loc_wg_cd = $pd + ".dlv_loc_wg_cd";
	public static final String $dlv_loc_sppl_cd = $pd + ".dlv_loc_sppl_cd";
	public static final String $str_ln_cd = $pd + ".str_ln_cd";
	public static final String $drct_dlv_typ = $pd + ".drct_dlv_typ";
	public static final String $scst_cd = $pd + ".scst_cd";
	public static final String $crt_lot_flg = $pd + ".crt_lot_flg";
	public static final String $lot_mng_typ = $pd + ".lot_mng_typ";
	public static final String $sublot_mng_typ = $pd + ".sublot_mng_typ";
	public static final String $lot_no_typ = $pd + ".lot_no_typ";
	public static final String $sublot_no_typ = $pd + ".sublot_no_typ";
	public static final String $lot_no = $pd + ".lot_no";
	public static final String $sublot_no = $pd + ".sublot_no";
	public static final String $ver_no = $pd + ".ver_no";
	public static final String $bp_lot_no = $pd + ".bp_lot_no";
	public static final String $bp_dlv_slip_no = $pd + ".bp_dlv_slip_no";
	public static final String $bp_dlv_slip_d_no = $pd + ".bp_dlv_slip_d_no";
	public static final String $ship_fr_valid_dt = $pd + ".ship_fr_valid_dt";
	public static final String $upri_not_tgt_flg = $pd + ".upri_not_tgt_flg";
	public static final String $purc_dtl_upd_flg = $pd + ".purc_dtl_upd_flg";
	public static final String $trd_cur_upri = $pd + ".trd_cur_upri";
	public static final String $trd_cur_proc_upri = $pd + ".trd_cur_proc_upri";
	public static final String $trd_cur_onr_prov_upri = $pd + ".trd_cur_onr_prov_upri";
	public static final String $interim_flg = $pd + ".interim_flg";
	public static final String $trd_cur_dscnt_amt = $pd + ".trd_cur_dscnt_amt";
	public static final String $dscnt_rsn_cd = $pd + ".dscnt_rsn_cd";
	public static final String $trd_cur_amt = $pd + ".trd_cur_amt";
	public static final String $trd_cur_proc_amt = $pd + ".trd_cur_proc_amt";
	public static final String $trd_cur_onr_prov_amt = $pd + ".trd_cur_onr_prov_amt";
	public static final String $tax_cd = $pd + ".tax_cd";
	public static final String $tax_rate = $pd + ".tax_rate";
	public static final String $tax_fix_flg = $pd + ".tax_fix_flg";
	public static final String $inc_tax_flg = $pd + ".inc_tax_flg";
	public static final String $trd_cur_tax_amt = $pd + ".trd_cur_tax_amt";
	public static final String $base_cur_upri = $pd + ".base_cur_upri";
	public static final String $base_cur_proc_upri = $pd + ".base_cur_proc_upri";
	public static final String $base_cur_onr_prov_upri = $pd + ".base_cur_onr_prov_upri";
	public static final String $base_cur_dscnt_amt = $pd + ".base_cur_dscnt_amt";
	public static final String $base_cur_amt = $pd + ".base_cur_amt";
	public static final String $base_cur_proc_amt = $pd + ".base_cur_proc_amt";
	public static final String $base_cur_onr_prov_amt = $pd + ".base_cur_onr_prov_amt";
	public static final String $base_cur_tax_amt = $pd + ".base_cur_tax_amt";
	public static final String $ptax_cur_upri = $pd + ".ptax_cur_upri";
	public static final String $ptax_cur_proc_upri = $pd + ".ptax_cur_proc_upri";
	public static final String $ptax_cur_onr_prov_upri = $pd + ".ptax_cur_onr_prov_upri";
	public static final String $ptax_cur_dscnt_amt = $pd + ".ptax_cur_dscnt_amt";
	public static final String $ptax_cur_amt = $pd + ".ptax_cur_amt";
	public static final String $ptax_cur_proc_amt = $pd + ".ptax_cur_proc_amt";
	public static final String $ptax_cur_onr_prov_amt = $pd + ".ptax_cur_onr_prov_amt";
	public static final String $ptax_cur_tax_amt = $pd + ".ptax_cur_tax_amt";
	public static final String $wtax_rate = $pd + ".wtax_rate";
	public static final String $trd_cur_wtax_amt = $pd + ".trd_cur_wtax_amt";
	public static final String $sppl_itm_cd = $pd + ".sppl_itm_cd";
	public static final String $sppl_itm_nm = $pd + ".sppl_itm_nm";
	public static final String $purc_id_typ = $pd + ".purc_id_typ";
	public static final String $purc_rsn_cd = $pd + ".purc_rsn_cd";
	public static final String $xpns_purc_flg = $pd + ".xpns_purc_flg";
	public static final String $ac_rsn_cd = $pd + ".ac_rsn_cd";
	public static final String $ap_dpt_cd = $pd + ".ap_dpt_cd";
	public static final String $ap_dpt_nm = $pd + ".ap_dpt_nm";
	public static final String $pay_crryovr_times = $pd + ".pay_crryovr_times";
	public static final String $purc_usr_cd = $pd + ".purc_usr_cd";
	public static final String $purc_dpt_cd = $pd + ".purc_dpt_cd";
	public static final String $purc_dpt_nm = $pd + ".purc_dpt_nm";
	public static final String $wg_cd = $pd + ".wg_cd";
	public static final String $bd_itm_cd = $pd + ".bd_itm_cd";
	public static final String $bd_itm_sub1 = $pd + ".bd_itm_sub1";
	public static final String $bd_itm_sub2 = $pd + ".bd_itm_sub2";
	public static final String $bd_itm_sub3 = $pd + ".bd_itm_sub3";
	public static final String $bd_lot_mng_typ = $pd + ".bd_lot_mng_typ";
	public static final String $bd_lot_no_typ = $pd + ".bd_lot_no_typ";
	public static final String $bd_sublot_mng_typ = $pd + ".bd_sublot_mng_typ";
	public static final String $bd_sublot_no_typ = $pd + ".bd_sublot_no_typ";
	public static final String $bd_sno1_mng_typ = $pd + ".bd_sno1_mng_typ";
	public static final String $bd_sno2_mng_typ = $pd + ".bd_sno2_mng_typ";
	public static final String $bd_sno3_mng_typ = $pd + ".bd_sno3_mng_typ";
	public static final String $bd_sno4_mng_typ = $pd + ".bd_sno4_mng_typ";
	public static final String $bd_sno1 = $pd + ".bd_sno1";
	public static final String $bd_sno2 = $pd + ".bd_sno2";
	public static final String $bd_sno3 = $pd + ".bd_sno3";
	public static final String $bd_sno4 = $pd + ".bd_sno4";
	public static final String $bd_loc_cd = $pd + ".bd_loc_cd";
	public static final String $bd_dpt_cd = $pd + ".bd_dpt_cd";
	public static final String $bd_dpt_nm = $pd + ".bd_dpt_nm";
	public static final String $bd_wg_cd = $pd + ".bd_wg_cd";
	public static final String $bd_bp_cd = $pd + ".bd_bp_cd";
	public static final String $bd_lot_no = $pd + ".bd_lot_no";
	public static final String $bd_sublot_no = $pd + ".bd_sublot_no";
	public static final String $bd_ctg_cd = $pd + ".bd_ctg_cd";
	public static final String $bd_oper_cd = $pd + ".bd_oper_cd";
	public static final String $bd_iv_no = $pd + ".bd_iv_no";
	public static final String $bd_po_no = $pd + ".bd_po_no";
	public static final String $bd_slo_no = $pd + ".bd_slo_no";
	public static final String $trd_d_rmrks = $pd + ".trd_d_rmrks";
	public static final String $intr_d_rmrks = $pd + ".intr_d_rmrks";
	public static final String $sub_char1 = $pd + ".sub_char1";
	public static final String $sub_char2 = $pd + ".sub_char2";
	public static final String $sub_char3 = $pd + ".sub_char3";
	public static final String $disp_seq = $pd + ".disp_seq";
	public static final String $arr_pr_no = $pd + ".arr_pr_no";
	public static final String $arr_pr_upd_cntr = $pd + ".arr_pr_upd_cntr";
	public static final String $tmp_quality_typ = $pd + ".tmp_quality_typ";
	public static final String $tmp_gd_cd = $pd + ".tmp_gd_cd";
	public static final String $purc_act_upd_cntr = $pd + ".purc_act_upd_cntr";
	public static final String $manual_add_flg = $pd + ".manual_add_flg";
	public static final String $ins_peg_no = $pd + ".ins_peg_no";
	public static final String $upd_peg_no = $pd + ".upd_peg_no";

	public static final MCMeta pd_META = createInnerRowMeta($pd, mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
	public static final MCMeta non_purc_flg_META = createCommonMeta($non_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta rcpt_iv_d_rmrks_META = createCommonMeta($rcpt_iv_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta rcpt_iv_intr_d_rmrks_META = createCommonMeta($rcpt_iv_intr_d_rmrks, mcframe.commonMS.meta.MS_META.RCPT_IV_INTR_D_RMRKS);
	public static final MCMeta rcpt_iv_d_sub_char1_META = createCommonMeta($rcpt_iv_d_sub_char1, mcframe.commonMS.meta.MS_META.RCPT_IV_D_SUB_CHAR1);
	public static final MCMeta rcpt_iv_d_sub_char2_META = createCommonMeta($rcpt_iv_d_sub_char2, mcframe.commonMS.meta.MS_META.RCPT_IV_D_SUB_CHAR2);
	public static final MCMeta rcpt_iv_d_sub_char3_META = createCommonMeta($rcpt_iv_d_sub_char3, mcframe.commonMS.meta.MS_META.RCPT_IV_D_SUB_CHAR3);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta src_trd_unit_cd_META = createCommonMeta($src_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta src_trd_unit_conv_qty_META = createCommonMeta($src_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta src_trd_unit_conv_base_qty_META = createCommonMeta($src_trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta src_trd_unit_dec_place_META = createCommonMeta($src_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta src_trd_unit_rnd_typ_META = createCommonMeta($src_trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta src_trd_unit_qty_META = createCommonMeta($src_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta src_base_unit_qty_META = createCommonMeta($src_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta src_trd_cur_upri_META = createCommonMeta($src_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_proc_upri_META = createCommonMeta($src_trd_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_onr_prov_upri_META = createCommonMeta($src_trd_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_dscnt_amt_META = createCommonMeta($src_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_amt_META = createCommonMeta($src_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_proc_amt_META = createCommonMeta($src_trd_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_onr_prov_amt_META = createCommonMeta($src_trd_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_tax_amt_META = createCommonMeta($src_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta temp_ap_use_flg_META = createCommonMeta($temp_ap_use_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_abort_flg_META = createCommonMeta($schd_abort_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Iv_Chk01_DtlR> constMetas = new ConstMetaList<Iv_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			pd_META,
			non_purc_flg_META,
			bom_ptn_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			rcpt_iv_d_rmrks_META,
			rcpt_iv_intr_d_rmrks_META,
			rcpt_iv_d_sub_char1_META,
			rcpt_iv_d_sub_char2_META,
			rcpt_iv_d_sub_char3_META,
			slo_d_no_META,
			slo_no_META,
			src_trd_unit_cd_META,
			src_trd_unit_conv_qty_META,
			src_trd_unit_conv_base_qty_META,
			src_trd_unit_dec_place_META,
			src_trd_unit_rnd_typ_META,
			src_trd_unit_qty_META,
			src_base_unit_qty_META,
			src_trd_cur_upri_META,
			src_trd_cur_proc_upri_META,
			src_trd_cur_onr_prov_upri_META,
			src_trd_cur_dscnt_amt_META,
			src_trd_cur_amt_META,
			src_trd_cur_proc_amt_META,
			src_trd_cur_onr_prov_amt_META,
			src_trd_cur_tax_amt_META,
			temp_ap_use_flg_META,
			schd_abort_flg_META
		},
		new String[][]{
			{
				"data_crud_typ",
				"peg_no",
				"err_flg",
				"trd_cd",
				"trd_ptn_typ",
				"arr_ptn_typ",
				"sync_flg",
				"temp_ap_flg",
				"outsrc_flg",
				"po_no",
				"po_d_no",
				"rcpt_iv_d_no",
				"mfg_inst_no",
				"mfg_loc_cd",
				"rqst_avl_rqst_dt",
				"purc_schd_no",
				"arr_schd_no",
				"purc_act_no",
				"purc_act_seq",
				"purc_act_rev",
				"purc_act_d_no",
				"purc_act_d_seq",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"iv_itm_nm",
				"cont_fctr_unit_cd",
				"cont_fctr_flg",
				"purc_cont_qty",
				"asset_mng_typ",
				"stk_mng_typ",
				"sundry_itm_flg",
				"purc_upri_cng_flg",
				"ver_flg",
				"dscnt_itm_flg",
				"bp_lot_flg",
				"maker_cd",
				"accpt_dfct_flg",
				"trd_unit_cd",
				"trd_unit_qty",
				"trd_unit_conv_base_qty",
				"trd_unit_conv_qty",
				"trd_unit_dec_place",
				"trd_unit_rnd_typ",
				"pack_flg",
				"base_unit_cd",
				"base_unit_qty",
				"base_unit_dec_place",
				"base_unit_rnd_typ",
				"abort_flg",
				"ncv_flg",
				"gd_cd",
				"quality_typ",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"dlv_loc_cd",
				"dlv_loc_mng_typ",
				"dlv_loc_wg_cd",
				"dlv_loc_sppl_cd",
				"str_ln_cd",
				"drct_dlv_typ",
				"scst_cd",
				"crt_lot_flg",
				"lot_mng_typ",
				"sublot_mng_typ",
				"lot_no_typ",
				"sublot_no_typ",
				"lot_no",
				"sublot_no",
				"ver_no",
				"bp_lot_no",
				"bp_dlv_slip_no",
				"bp_dlv_slip_d_no",
				"ship_fr_valid_dt",
				"upri_not_tgt_flg",
				"purc_dtl_upd_flg",
				"trd_cur_upri",
				"trd_cur_proc_upri",
				"trd_cur_onr_prov_upri",
				"interim_flg",
				"trd_cur_dscnt_amt",
				"dscnt_rsn_cd",
				"trd_cur_amt",
				"trd_cur_proc_amt",
				"trd_cur_onr_prov_amt",
				"tax_cd",
				"tax_rate",
				"tax_fix_flg",
				"inc_tax_flg",
				"trd_cur_tax_amt",
				"base_cur_upri",
				"base_cur_proc_upri",
				"base_cur_onr_prov_upri",
				"base_cur_dscnt_amt",
				"base_cur_amt",
				"base_cur_proc_amt",
				"base_cur_onr_prov_amt",
				"base_cur_tax_amt",
				"ptax_cur_upri",
				"ptax_cur_proc_upri",
				"ptax_cur_onr_prov_upri",
				"ptax_cur_dscnt_amt",
				"ptax_cur_amt",
				"ptax_cur_proc_amt",
				"ptax_cur_onr_prov_amt",
				"ptax_cur_tax_amt",
				"wtax_rate",
				"trd_cur_wtax_amt",
				"sppl_itm_cd",
				"sppl_itm_nm",
				"purc_id_typ",
				"purc_rsn_cd",
				"xpns_purc_flg",
				"ac_rsn_cd",
				"ap_dpt_cd",
				"ap_dpt_nm",
				"pay_crryovr_times",
				"purc_usr_cd",
				"purc_dpt_cd",
				"purc_dpt_nm",
				"wg_cd",
				"bd_itm_cd",
				"bd_itm_sub1",
				"bd_itm_sub2",
				"bd_itm_sub3",
				"bd_lot_mng_typ",
				"bd_lot_no_typ",
				"bd_sublot_mng_typ",
				"bd_sublot_no_typ",
				"bd_sno1_mng_typ",
				"bd_sno2_mng_typ",
				"bd_sno3_mng_typ",
				"bd_sno4_mng_typ",
				"bd_sno1",
				"bd_sno2",
				"bd_sno3",
				"bd_sno4",
				"bd_loc_cd",
				"bd_dpt_cd",
				"bd_dpt_nm",
				"bd_wg_cd",
				"bd_bp_cd",
				"bd_lot_no",
				"bd_sublot_no",
				"bd_ctg_cd",
				"bd_oper_cd",
				"bd_iv_no",
				"bd_po_no",
				"bd_slo_no",
				"trd_d_rmrks",
				"intr_d_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"disp_seq",
				"arr_pr_no",
				"arr_pr_upd_cntr",
				"tmp_quality_typ",
				"tmp_gd_cd",
				"purc_act_upd_cntr",
				"manual_add_flg",
				"ins_peg_no",
				"upd_peg_no"
			},
			{
				$data_crud_typ,
				$peg_no,
				$err_flg,
				$trd_cd,
				$trd_ptn_typ,
				$arr_ptn_typ,
				$sync_flg,
				$temp_ap_flg,
				$outsrc_flg,
				$po_no,
				$po_d_no,
				$rcpt_iv_d_no,
				$mfg_inst_no,
				$mfg_loc_cd,
				$rqst_avl_rqst_dt,
				$purc_schd_no,
				$arr_schd_no,
				$purc_act_no,
				$purc_act_seq,
				$purc_act_rev,
				$purc_act_d_no,
				$purc_act_d_seq,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$iv_itm_nm,
				$cont_fctr_unit_cd,
				$cont_fctr_flg,
				$purc_cont_qty,
				$asset_mng_typ,
				$stk_mng_typ,
				$sundry_itm_flg,
				$purc_upri_cng_flg,
				$ver_flg,
				$dscnt_itm_flg,
				$bp_lot_flg,
				$maker_cd,
				$accpt_dfct_flg,
				$trd_unit_cd,
				$trd_unit_qty,
				$trd_unit_conv_base_qty,
				$trd_unit_conv_qty,
				$trd_unit_dec_place,
				$trd_unit_rnd_typ,
				$pack_flg,
				$base_unit_cd,
				$base_unit_qty,
				$base_unit_dec_place,
				$base_unit_rnd_typ,
				$abort_flg,
				$ncv_flg,
				$gd_cd,
				$quality_typ,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$dlv_loc_cd,
				$dlv_loc_mng_typ,
				$dlv_loc_wg_cd,
				$dlv_loc_sppl_cd,
				$str_ln_cd,
				$drct_dlv_typ,
				$scst_cd,
				$crt_lot_flg,
				$lot_mng_typ,
				$sublot_mng_typ,
				$lot_no_typ,
				$sublot_no_typ,
				$lot_no,
				$sublot_no,
				$ver_no,
				$bp_lot_no,
				$bp_dlv_slip_no,
				$bp_dlv_slip_d_no,
				$ship_fr_valid_dt,
				$upri_not_tgt_flg,
				$purc_dtl_upd_flg,
				$trd_cur_upri,
				$trd_cur_proc_upri,
				$trd_cur_onr_prov_upri,
				$interim_flg,
				$trd_cur_dscnt_amt,
				$dscnt_rsn_cd,
				$trd_cur_amt,
				$trd_cur_proc_amt,
				$trd_cur_onr_prov_amt,
				$tax_cd,
				$tax_rate,
				$tax_fix_flg,
				$inc_tax_flg,
				$trd_cur_tax_amt,
				$base_cur_upri,
				$base_cur_proc_upri,
				$base_cur_onr_prov_upri,
				$base_cur_dscnt_amt,
				$base_cur_amt,
				$base_cur_proc_amt,
				$base_cur_onr_prov_amt,
				$base_cur_tax_amt,
				$ptax_cur_upri,
				$ptax_cur_proc_upri,
				$ptax_cur_onr_prov_upri,
				$ptax_cur_dscnt_amt,
				$ptax_cur_amt,
				$ptax_cur_proc_amt,
				$ptax_cur_onr_prov_amt,
				$ptax_cur_tax_amt,
				$wtax_rate,
				$trd_cur_wtax_amt,
				$sppl_itm_cd,
				$sppl_itm_nm,
				$purc_id_typ,
				$purc_rsn_cd,
				$xpns_purc_flg,
				$ac_rsn_cd,
				$ap_dpt_cd,
				$ap_dpt_nm,
				$pay_crryovr_times,
				$purc_usr_cd,
				$purc_dpt_cd,
				$purc_dpt_nm,
				$wg_cd,
				$bd_itm_cd,
				$bd_itm_sub1,
				$bd_itm_sub2,
				$bd_itm_sub3,
				$bd_lot_mng_typ,
				$bd_lot_no_typ,
				$bd_sublot_mng_typ,
				$bd_sublot_no_typ,
				$bd_sno1_mng_typ,
				$bd_sno2_mng_typ,
				$bd_sno3_mng_typ,
				$bd_sno4_mng_typ,
				$bd_sno1,
				$bd_sno2,
				$bd_sno3,
				$bd_sno4,
				$bd_loc_cd,
				$bd_dpt_cd,
				$bd_dpt_nm,
				$bd_wg_cd,
				$bd_bp_cd,
				$bd_lot_no,
				$bd_sublot_no,
				$bd_ctg_cd,
				$bd_oper_cd,
				$bd_iv_no,
				$bd_po_no,
				$bd_slo_no,
				$trd_d_rmrks,
				$intr_d_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$disp_seq,
				$arr_pr_no,
				$arr_pr_upd_cntr,
				$tmp_quality_typ,
				$tmp_gd_cd,
				$purc_act_upd_cntr,
				$manual_add_flg,
				$ins_peg_no,
				$upd_peg_no
			}
		}
	);

	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
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
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
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
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
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
	protected Iv_Chk01_DtlR_MC_A(ConstMetaList<? extends Iv_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Iv_Chk01_DtlR clone() {
		return (Iv_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Iv_Chk01_DtlR createInstance() {
		return (Iv_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Iv_Chk01_DtlR getValues(String... names) {
		return (Iv_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMSBD.MSBDL0140.Chk01_DtlR pd(){
		return (mcframe.serverMSBD.MSBDL0140.Chk01_DtlR) getConstInnerRow(offset + 0, $pd);
	}
	
	public void pd(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR row){
		setConstInnerRow(offset + 0, $pd, row);
	}


	/**
	 * Not for purchase flg. 仕入対象外ＦＬＧ.<p>
	 *
	 */
	public boolean non_purc_flg() {
		return getConstBoolean(offset + 1, $non_purc_flg);
	}

	/**
	 * Not for purchase flg. 仕入対象外ＦＬＧ.<p>
	 *
	 */
	public void non_purc_flg(boolean value) {
		setConstBoolean(offset + 1, $non_purc_flg, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 2, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 2, $bom_ptn, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 3, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 3, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 4, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 4, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 5, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 5, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 6, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 6, $sno4_mng_typ, value);
	}


	/**
	 * Purchase I/V details remarks 受領Ｉ／Ｖ明細備考.<p>
	 *
	 */
	public String rcpt_iv_d_rmrks() {
		return getConstString(offset + 7, $rcpt_iv_d_rmrks);
	}

	/**
	 * Purchase I/V details remarks 受領Ｉ／Ｖ明細備考.<p>
	 *
	 */
	public void rcpt_iv_d_rmrks(String value) {
		setConstString(offset + 7, $rcpt_iv_d_rmrks, value);
	}


	/**
	 * Purchase I/V internal details remarks 受領Ｉ／Ｖ内部明細備考.<p>
	 *
	 */
	public String rcpt_iv_intr_d_rmrks() {
		return getConstString(offset + 8, $rcpt_iv_intr_d_rmrks);
	}

	/**
	 * Purchase I/V internal details remarks 受領Ｉ／Ｖ内部明細備考.<p>
	 *
	 */
	public void rcpt_iv_intr_d_rmrks(String value) {
		setConstString(offset + 8, $rcpt_iv_intr_d_rmrks, value);
	}


	/**
	 * Purchase I/V details spare 1 受領Ｉ／Ｖ明細予備１.<p>
	 *
	 */
	public String rcpt_iv_d_sub_char1() {
		return getConstString(offset + 9, $rcpt_iv_d_sub_char1);
	}

	/**
	 * Purchase I/V details spare 1 受領Ｉ／Ｖ明細予備１.<p>
	 *
	 */
	public void rcpt_iv_d_sub_char1(String value) {
		setConstString(offset + 9, $rcpt_iv_d_sub_char1, value);
	}


	/**
	 * Purchase I/V details spare 2 受領Ｉ／Ｖ明細予備２.<p>
	 *
	 */
	public String rcpt_iv_d_sub_char2() {
		return getConstString(offset + 10, $rcpt_iv_d_sub_char2);
	}

	/**
	 * Purchase I/V details spare 2 受領Ｉ／Ｖ明細予備２.<p>
	 *
	 */
	public void rcpt_iv_d_sub_char2(String value) {
		setConstString(offset + 10, $rcpt_iv_d_sub_char2, value);
	}


	/**
	 * Purchase I/V details spare 3 受領Ｉ／Ｖ明細予備３.<p>
	 *
	 */
	public String rcpt_iv_d_sub_char3() {
		return getConstString(offset + 11, $rcpt_iv_d_sub_char3);
	}

	/**
	 * Purchase I/V details spare 3 受領Ｉ／Ｖ明細予備３.<p>
	 *
	 */
	public void rcpt_iv_d_sub_char3(String value) {
		setConstString(offset + 11, $rcpt_iv_d_sub_char3, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 12, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 12, $slo_d_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 13, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 13, $slo_no, value);
	}


	/**
	 * Transaction unit cd. at PO 発注時取引単位ＣＤ.<p>
	 *
	 */
	public String src_trd_unit_cd() {
		return getConstString(offset + 14, $src_trd_unit_cd);
	}

	/**
	 * Transaction unit cd. at PO 発注時取引単位ＣＤ.<p>
	 *
	 */
	public void src_trd_unit_cd(String value) {
		setConstString(offset + 14, $src_trd_unit_cd, value);
	}


	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public MCNumber src_trd_unit_conv_qty() {
		return getConstNumber(offset + 15, $src_trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public void src_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 15, $src_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public void src_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 15, $src_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public void src_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 15, $src_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public void src_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 15, $src_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public void src_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 15, $src_trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber src_trd_unit_conv_base_qty() {
		return getConstNumber(offset + 16, $src_trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public void src_trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 16, $src_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public void src_trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 16, $src_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public void src_trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 16, $src_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public void src_trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 16, $src_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public void src_trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 16, $src_trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber src_trd_unit_dec_place() {
		return getConstNumber(offset + 17, $src_trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public void src_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 17, $src_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public void src_trd_unit_dec_place(int value) {
		setConstNumber(offset + 17, $src_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public void src_trd_unit_dec_place(long value) {
		setConstNumber(offset + 17, $src_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public void src_trd_unit_dec_place(float value) {
		setConstNumber(offset + 17, $src_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public void src_trd_unit_dec_place(double value) {
		setConstNumber(offset + 17, $src_trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type at PO 発注時取引単位端数処理区分.<p>
	 *
	 */
	public String src_trd_unit_rnd_typ() {
		return getConstString(offset + 18, $src_trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type at PO 発注時取引単位端数処理区分.<p>
	 *
	 */
	public void src_trd_unit_rnd_typ(String value) {
		setConstString(offset + 18, $src_trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public MCNumber src_trd_unit_qty() {
		return getConstNumber(offset + 19, $src_trd_unit_qty);
	}

	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public void src_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 19, $src_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public void src_trd_unit_qty(int value) {
		setConstNumber(offset + 19, $src_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public void src_trd_unit_qty(long value) {
		setConstNumber(offset + 19, $src_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public void src_trd_unit_qty(float value) {
		setConstNumber(offset + 19, $src_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public void src_trd_unit_qty(double value) {
		setConstNumber(offset + 19, $src_trd_unit_qty, value);
	}


	/**
	 * Unit qty. at PO 発注時基準単位数量.<p>
	 *
	 */
	public MCNumber src_base_unit_qty() {
		return getConstNumber(offset + 20, $src_base_unit_qty);
	}

	/**
	 * Unit qty. at PO 発注時基準単位数量.<p>
	 *
	 */
	public void src_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 20, $src_base_unit_qty, value);
	}

	/**
	 * Unit qty. at PO 発注時基準単位数量.<p>
	 *
	 */
	public void src_base_unit_qty(int value) {
		setConstNumber(offset + 20, $src_base_unit_qty, value);
	}

	/**
	 * Unit qty. at PO 発注時基準単位数量.<p>
	 *
	 */
	public void src_base_unit_qty(long value) {
		setConstNumber(offset + 20, $src_base_unit_qty, value);
	}

	/**
	 * Unit qty. at PO 発注時基準単位数量.<p>
	 *
	 */
	public void src_base_unit_qty(float value) {
		setConstNumber(offset + 20, $src_base_unit_qty, value);
	}

	/**
	 * Unit qty. at PO 発注時基準単位数量.<p>
	 *
	 */
	public void src_base_unit_qty(double value) {
		setConstNumber(offset + 20, $src_base_unit_qty, value);
	}


	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public MCNumber src_trd_cur_upri() {
		return getConstNumber(offset + 21, $src_trd_cur_upri);
	}

	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public void src_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 21, $src_trd_cur_upri, value);
	}

	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public void src_trd_cur_upri(int value) {
		setConstNumber(offset + 21, $src_trd_cur_upri, value);
	}

	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public void src_trd_cur_upri(long value) {
		setConstNumber(offset + 21, $src_trd_cur_upri, value);
	}

	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public void src_trd_cur_upri(float value) {
		setConstNumber(offset + 21, $src_trd_cur_upri, value);
	}

	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public void src_trd_cur_upri(double value) {
		setConstNumber(offset + 21, $src_trd_cur_upri, value);
	}


	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public MCNumber src_trd_cur_proc_upri() {
		return getConstNumber(offset + 22, $src_trd_cur_proc_upri);
	}

	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public void src_trd_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 22, $src_trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public void src_trd_cur_proc_upri(int value) {
		setConstNumber(offset + 22, $src_trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public void src_trd_cur_proc_upri(long value) {
		setConstNumber(offset + 22, $src_trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public void src_trd_cur_proc_upri(float value) {
		setConstNumber(offset + 22, $src_trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public void src_trd_cur_proc_upri(double value) {
		setConstNumber(offset + 22, $src_trd_cur_proc_upri, value);
	}


	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber src_trd_cur_onr_prov_upri() {
		return getConstNumber(offset + 23, $src_trd_cur_onr_prov_upri);
	}

	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 23, $src_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 23, $src_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 23, $src_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 23, $src_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 23, $src_trd_cur_onr_prov_upri, value);
	}


	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public MCNumber src_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 24, $src_trd_cur_dscnt_amt);
	}

	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public void src_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 24, $src_trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public void src_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 24, $src_trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public void src_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 24, $src_trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public void src_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 24, $src_trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public void src_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 24, $src_trd_cur_dscnt_amt, value);
	}


	/**
	 * PO amount (Transaction currency) 発注取引通貨金額.<p>
	 *
	 */
	public MCNumber src_trd_cur_amt() {
		return getConstNumber(offset + 25, $src_trd_cur_amt);
	}

	/**
	 * PO amount (Transaction currency) 発注取引通貨金額.<p>
	 *
	 */
	public void src_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 25, $src_trd_cur_amt, value);
	}

	/**
	 * PO amount (Transaction currency) 発注取引通貨金額.<p>
	 *
	 */
	public void src_trd_cur_amt(int value) {
		setConstNumber(offset + 25, $src_trd_cur_amt, value);
	}

	/**
	 * PO amount (Transaction currency) 発注取引通貨金額.<p>
	 *
	 */
	public void src_trd_cur_amt(long value) {
		setConstNumber(offset + 25, $src_trd_cur_amt, value);
	}

	/**
	 * PO amount (Transaction currency) 発注取引通貨金額.<p>
	 *
	 */
	public void src_trd_cur_amt(float value) {
		setConstNumber(offset + 25, $src_trd_cur_amt, value);
	}

	/**
	 * PO amount (Transaction currency) 発注取引通貨金額.<p>
	 *
	 */
	public void src_trd_cur_amt(double value) {
		setConstNumber(offset + 25, $src_trd_cur_amt, value);
	}


	/**
	 * Subcontracting amount at PO (Transaction currency) 発注取引通貨加工金額.<p>
	 *
	 */
	public MCNumber src_trd_cur_proc_amt() {
		return getConstNumber(offset + 26, $src_trd_cur_proc_amt);
	}

	/**
	 * Subcontracting amount at PO (Transaction currency) 発注取引通貨加工金額.<p>
	 *
	 */
	public void src_trd_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 26, $src_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount at PO (Transaction currency) 発注取引通貨加工金額.<p>
	 *
	 */
	public void src_trd_cur_proc_amt(int value) {
		setConstNumber(offset + 26, $src_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount at PO (Transaction currency) 発注取引通貨加工金額.<p>
	 *
	 */
	public void src_trd_cur_proc_amt(long value) {
		setConstNumber(offset + 26, $src_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount at PO (Transaction currency) 発注取引通貨加工金額.<p>
	 *
	 */
	public void src_trd_cur_proc_amt(float value) {
		setConstNumber(offset + 26, $src_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount at PO (Transaction currency) 発注取引通貨加工金額.<p>
	 *
	 */
	public void src_trd_cur_proc_amt(double value) {
		setConstNumber(offset + 26, $src_trd_cur_proc_amt, value);
	}


	/**
	 * Chargeable supply amount (PO transaction currency) 発注取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber src_trd_cur_onr_prov_amt() {
		return getConstNumber(offset + 27, $src_trd_cur_onr_prov_amt);
	}

	/**
	 * Chargeable supply amount (PO transaction currency) 発注取引通貨有償支給金額.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 27, $src_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (PO transaction currency) 発注取引通貨有償支給金額.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 27, $src_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (PO transaction currency) 発注取引通貨有償支給金額.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 27, $src_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (PO transaction currency) 発注取引通貨有償支給金額.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 27, $src_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (PO transaction currency) 発注取引通貨有償支給金額.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 27, $src_trd_cur_onr_prov_amt, value);
	}


	/**
	 * PO tax amount (Transaction currency) 発注取引通貨税額.<p>
	 *
	 */
	public MCNumber src_trd_cur_tax_amt() {
		return getConstNumber(offset + 28, $src_trd_cur_tax_amt);
	}

	/**
	 * PO tax amount (Transaction currency) 発注取引通貨税額.<p>
	 *
	 */
	public void src_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 28, $src_trd_cur_tax_amt, value);
	}

	/**
	 * PO tax amount (Transaction currency) 発注取引通貨税額.<p>
	 *
	 */
	public void src_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 28, $src_trd_cur_tax_amt, value);
	}

	/**
	 * PO tax amount (Transaction currency) 発注取引通貨税額.<p>
	 *
	 */
	public void src_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 28, $src_trd_cur_tax_amt, value);
	}

	/**
	 * PO tax amount (Transaction currency) 発注取引通貨税額.<p>
	 *
	 */
	public void src_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 28, $src_trd_cur_tax_amt, value);
	}

	/**
	 * PO tax amount (Transaction currency) 発注取引通貨税額.<p>
	 *
	 */
	public void src_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 28, $src_trd_cur_tax_amt, value);
	}


	/**
	 * Temporary AP use flg. 暫定買掛使用ＦＬＧ.<p>
	 *
	 */
	public boolean temp_ap_use_flg() {
		return getConstBoolean(offset + 29, $temp_ap_use_flg);
	}

	/**
	 * Temporary AP use flg. 暫定買掛使用ＦＬＧ.<p>
	 *
	 */
	public void temp_ap_use_flg(boolean value) {
		setConstBoolean(offset + 29, $temp_ap_use_flg, value);
	}


	/**
	 * Cancel remaining schedule flg. 予定打切ＦＬＧ.<p>
	 *
	 */
	public boolean schd_abort_flg() {
		return getConstBoolean(offset + 30, $schd_abort_flg);
	}

	/**
	 * Cancel remaining schedule flg. 予定打切ＦＬＧ.<p>
	 *
	 */
	public void schd_abort_flg(boolean value) {
		setConstBoolean(offset + 30, $schd_abort_flg, value);
	}


	public String getString(String name) {
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($rcpt_iv_d_rmrks.equalsIgnoreCase(name)) {
			return rcpt_iv_d_rmrks();
		}
		if ($rcpt_iv_intr_d_rmrks.equalsIgnoreCase(name)) {
			return rcpt_iv_intr_d_rmrks();
		}
		if ($rcpt_iv_d_sub_char1.equalsIgnoreCase(name)) {
			return rcpt_iv_d_sub_char1();
		}
		if ($rcpt_iv_d_sub_char2.equalsIgnoreCase(name)) {
			return rcpt_iv_d_sub_char2();
		}
		if ($rcpt_iv_d_sub_char3.equalsIgnoreCase(name)) {
			return rcpt_iv_d_sub_char3();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($src_trd_unit_cd.equalsIgnoreCase(name)) {
			return src_trd_unit_cd();
		}
		if ($src_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return src_trd_unit_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_conv_qty();
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_conv_base_qty();
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return src_trd_unit_dec_place();
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_qty();
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			return src_base_unit_qty();
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			return src_trd_cur_upri();
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return src_trd_cur_proc_upri();
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return src_trd_cur_onr_prov_upri();
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_dscnt_amt();
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_amt();
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_proc_amt();
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_onr_prov_amt();
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_tax_amt();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($non_purc_flg.equalsIgnoreCase(name)) {
			return non_purc_flg();
		}
		if ($temp_ap_use_flg.equalsIgnoreCase(name)) {
			return temp_ap_use_flg();
		}
		if ($schd_abort_flg.equalsIgnoreCase(name)) {
			return schd_abort_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($rcpt_iv_d_rmrks.equalsIgnoreCase(name)) {
			return rcpt_iv_d_rmrks();
		}
		if ($rcpt_iv_intr_d_rmrks.equalsIgnoreCase(name)) {
			return rcpt_iv_intr_d_rmrks();
		}
		if ($rcpt_iv_d_sub_char1.equalsIgnoreCase(name)) {
			return rcpt_iv_d_sub_char1();
		}
		if ($rcpt_iv_d_sub_char2.equalsIgnoreCase(name)) {
			return rcpt_iv_d_sub_char2();
		}
		if ($rcpt_iv_d_sub_char3.equalsIgnoreCase(name)) {
			return rcpt_iv_d_sub_char3();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($src_trd_unit_cd.equalsIgnoreCase(name)) {
			return src_trd_unit_cd();
		}
		if ($src_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return src_trd_unit_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_conv_qty();
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_conv_base_qty();
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return src_trd_unit_dec_place();
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_qty();
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			return src_base_unit_qty();
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			return src_trd_cur_upri();
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return src_trd_cur_proc_upri();
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return src_trd_cur_onr_prov_upri();
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_dscnt_amt();
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_amt();
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_proc_amt();
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_onr_prov_amt();
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_tax_amt();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($non_purc_flg.equalsIgnoreCase(name)) {
			return non_purc_flg();
		}
		if ($temp_ap_use_flg.equalsIgnoreCase(name)) {
			return temp_ap_use_flg();
		}
		if ($schd_abort_flg.equalsIgnoreCase(name)) {
			return schd_abort_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($rcpt_iv_d_rmrks.equalsIgnoreCase(name)) {
			rcpt_iv_d_rmrks(value);
			return;
		}
		if ($rcpt_iv_intr_d_rmrks.equalsIgnoreCase(name)) {
			rcpt_iv_intr_d_rmrks(value);
			return;
		}
		if ($rcpt_iv_d_sub_char1.equalsIgnoreCase(name)) {
			rcpt_iv_d_sub_char1(value);
			return;
		}
		if ($rcpt_iv_d_sub_char2.equalsIgnoreCase(name)) {
			rcpt_iv_d_sub_char2(value);
			return;
		}
		if ($rcpt_iv_d_sub_char3.equalsIgnoreCase(name)) {
			rcpt_iv_d_sub_char3(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($src_trd_unit_cd.equalsIgnoreCase(name)) {
			src_trd_unit_cd(value);
			return;
		}
		if ($src_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			src_trd_unit_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			src_base_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			src_base_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			src_base_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			src_base_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			src_base_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($non_purc_flg.equalsIgnoreCase(name)) {
			non_purc_flg(value);
			return;
		}
		if ($temp_ap_use_flg.equalsIgnoreCase(name)) {
			temp_ap_use_flg(value);
			return;
		}
		if ($schd_abort_flg.equalsIgnoreCase(name)) {
			schd_abort_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($rcpt_iv_d_rmrks.equalsIgnoreCase(name)) {
			rcpt_iv_d_rmrks(value);
			return;
		}
		if ($rcpt_iv_intr_d_rmrks.equalsIgnoreCase(name)) {
			rcpt_iv_intr_d_rmrks(value);
			return;
		}
		if ($rcpt_iv_d_sub_char1.equalsIgnoreCase(name)) {
			rcpt_iv_d_sub_char1(value);
			return;
		}
		if ($rcpt_iv_d_sub_char2.equalsIgnoreCase(name)) {
			rcpt_iv_d_sub_char2(value);
			return;
		}
		if ($rcpt_iv_d_sub_char3.equalsIgnoreCase(name)) {
			rcpt_iv_d_sub_char3(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($src_trd_unit_cd.equalsIgnoreCase(name)) {
			src_trd_unit_cd(value);
			return;
		}
		if ($src_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			src_trd_unit_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			src_base_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			src_base_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			src_base_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			src_base_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			src_base_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($non_purc_flg.equalsIgnoreCase(name)) {
			non_purc_flg(value);
			return;
		}
		if ($temp_ap_use_flg.equalsIgnoreCase(name)) {
			temp_ap_use_flg(value);
			return;
		}
		if ($schd_abort_flg.equalsIgnoreCase(name)) {
			schd_abort_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($pd.equalsIgnoreCase(name)) {
			return pd();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($pd.equalsIgnoreCase(name)) {
			pd(
				((MCContainerMeta) pd_META).castInnerRow(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return pd().data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		pd().data_crud_typ(value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return pd().peg_no();
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		pd().peg_no(value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		pd().peg_no(value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		pd().peg_no(value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		pd().peg_no(value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		pd().peg_no(value);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return pd().err_flg();
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		pd().err_flg(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return pd().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		pd().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return pd().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		pd().trd_ptn_typ(value);
	}

	/**
	 * Receipt pattern 入荷パタン.<p>
	 *
	 */
	public String arr_ptn_typ() {
		return pd().arr_ptn_typ();
	}

	/**
	 * Receipt pattern 入荷パタン.<p>
	 *
	 */
	public void arr_ptn_typ(String value) {
		pd().arr_ptn_typ(value);
	}

	/**
	 * Receipt simultaneously recording flg. 入荷同時計上ＦＬＧ.<p>
	 *
	 */
	public boolean sync_flg() {
		return pd().sync_flg();
	}

	/**
	 * Receipt simultaneously recording flg. 入荷同時計上ＦＬＧ.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		pd().sync_flg(value);
	}

	/**
	 * Temporary flg. 暫定ＦＬＧ.<p>
	 *
	 */
	public boolean temp_ap_flg() {
		return pd().temp_ap_flg();
	}

	/**
	 * Temporary flg. 暫定ＦＬＧ.<p>
	 *
	 */
	public void temp_ap_flg(boolean value) {
		pd().temp_ap_flg(value);
	}

	/**
	 * Subcontracting flg. 外注ＦＬＧ.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return pd().outsrc_flg();
	}

	/**
	 * Subcontracting flg. 外注ＦＬＧ.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		pd().outsrc_flg(value);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return pd().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		pd().po_no(value);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return pd().po_d_no();
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		pd().po_d_no(value);
	}

	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_d_no() {
		return pd().rcpt_iv_d_no();
	}

	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_d_no(String value) {
		pd().rcpt_iv_d_no(value);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return pd().mfg_inst_no();
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		pd().mfg_inst_no(value);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return pd().mfg_loc_cd();
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		pd().mfg_loc_cd(value);
	}

	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public MCDate rqst_avl_rqst_dt() {
		return pd().rqst_avl_rqst_dt();
	}

	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public void rqst_avl_rqst_dt(MCDate value) {
		pd().rqst_avl_rqst_dt(value);
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public String purc_schd_no() {
		return pd().purc_schd_no();
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public void purc_schd_no(String value) {
		pd().purc_schd_no(value);
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return pd().arr_schd_no();
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		pd().arr_schd_no(value);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return pd().purc_act_no();
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		pd().purc_act_no(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public MCNumber purc_act_seq() {
		return pd().purc_act_seq();
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(MCNumber value) {
		pd().purc_act_seq(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(int value) {
		pd().purc_act_seq(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(long value) {
		pd().purc_act_seq(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(float value) {
		pd().purc_act_seq(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(double value) {
		pd().purc_act_seq(value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public MCNumber purc_act_rev() {
		return pd().purc_act_rev();
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(MCNumber value) {
		pd().purc_act_rev(value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(int value) {
		pd().purc_act_rev(value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(long value) {
		pd().purc_act_rev(value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(float value) {
		pd().purc_act_rev(value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(double value) {
		pd().purc_act_rev(value);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return pd().purc_act_d_no();
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		pd().purc_act_d_no(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public MCNumber purc_act_d_seq() {
		return pd().purc_act_d_seq();
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(MCNumber value) {
		pd().purc_act_d_seq(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(int value) {
		pd().purc_act_d_seq(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(long value) {
		pd().purc_act_d_seq(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(float value) {
		pd().purc_act_d_seq(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(double value) {
		pd().purc_act_d_seq(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return pd().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		pd().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return pd().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		pd().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return pd().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		pd().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return pd().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		pd().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return pd().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		pd().itm_nm(value);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return pd().iv_itm_nm();
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		pd().iv_itm_nm(value);
	}

	/**
	 * Active ingredient unit 有効成分単位.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return pd().cont_fctr_unit_cd();
	}

	/**
	 * Active ingredient unit 有効成分単位.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		pd().cont_fctr_unit_cd(value);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return pd().cont_fctr_flg();
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		pd().cont_fctr_flg(value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public MCNumber purc_cont_qty() {
		return pd().purc_cont_qty();
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(MCNumber value) {
		pd().purc_cont_qty(value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(int value) {
		pd().purc_cont_qty(value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(long value) {
		pd().purc_cont_qty(value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(float value) {
		pd().purc_cont_qty(value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(double value) {
		pd().purc_cont_qty(value);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return pd().asset_mng_typ();
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		pd().asset_mng_typ(value);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return pd().stk_mng_typ();
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		pd().stk_mng_typ(value);
	}

	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return pd().sundry_itm_flg();
	}

	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		pd().sundry_itm_flg(value);
	}

	/**
	 * Allow purchasing unit price change flg. 購買単価変更許可ＦＬＧ.<p>
	 *
	 */
	public boolean purc_upri_cng_flg() {
		return pd().purc_upri_cng_flg();
	}

	/**
	 * Allow purchasing unit price change flg. 購買単価変更許可ＦＬＧ.<p>
	 *
	 */
	public void purc_upri_cng_flg(boolean value) {
		pd().purc_upri_cng_flg(value);
	}

	/**
	 * For version control flg. 版管理対象ＦＬＧ.<p>
	 *
	 */
	public boolean ver_flg() {
		return pd().ver_flg();
	}

	/**
	 * For version control flg. 版管理対象ＦＬＧ.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		pd().ver_flg(value);
	}

	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return pd().dscnt_itm_flg();
	}

	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		pd().dscnt_itm_flg(value);
	}

	/**
	 * Vendor Lot No. required flg. 業者ロットＮＯ必須ＦＬＧ.<p>
	 *
	 */
	public boolean bp_lot_flg() {
		return pd().bp_lot_flg();
	}

	/**
	 * Vendor Lot No. required flg. 業者ロットＮＯ必須ＦＬＧ.<p>
	 *
	 */
	public void bp_lot_flg(boolean value) {
		pd().bp_lot_flg(value);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return pd().maker_cd();
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		pd().maker_cd(value);
	}

	/**
	 * Acceptance defective flg. 検収不良ＦＬＧ.<p>
	 *
	 */
	public boolean accpt_dfct_flg() {
		return pd().accpt_dfct_flg();
	}

	/**
	 * Acceptance defective flg. 検収不良ＦＬＧ.<p>
	 *
	 */
	public void accpt_dfct_flg(boolean value) {
		pd().accpt_dfct_flg(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return pd().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		pd().trd_unit_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return pd().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		pd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		pd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		pd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		pd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		pd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return pd().trd_unit_conv_base_qty();
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		pd().trd_unit_conv_base_qty(value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		pd().trd_unit_conv_base_qty(value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		pd().trd_unit_conv_base_qty(value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		pd().trd_unit_conv_base_qty(value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		pd().trd_unit_conv_base_qty(value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return pd().trd_unit_conv_qty();
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		pd().trd_unit_conv_qty(value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		pd().trd_unit_conv_qty(value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		pd().trd_unit_conv_qty(value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		pd().trd_unit_conv_qty(value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		pd().trd_unit_conv_qty(value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return pd().trd_unit_dec_place();
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		pd().trd_unit_dec_place(value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		pd().trd_unit_dec_place(value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		pd().trd_unit_dec_place(value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		pd().trd_unit_dec_place(value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		pd().trd_unit_dec_place(value);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return pd().trd_unit_rnd_typ();
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		pd().trd_unit_rnd_typ(value);
	}

	/**
	 * SKU flg. 荷姿ＦＬＧ.<p>
	 *
	 */
	public boolean pack_flg() {
		return pd().pack_flg();
	}

	/**
	 * SKU flg. 荷姿ＦＬＧ.<p>
	 *
	 */
	public void pack_flg(boolean value) {
		pd().pack_flg(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return pd().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		pd().base_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return pd().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		pd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		pd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		pd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		pd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		pd().base_unit_qty(value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return pd().base_unit_dec_place();
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		pd().base_unit_dec_place(value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		pd().base_unit_dec_place(value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		pd().base_unit_dec_place(value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		pd().base_unit_dec_place(value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		pd().base_unit_dec_place(value);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return pd().base_unit_rnd_typ();
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		pd().base_unit_rnd_typ(value);
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public boolean abort_flg() {
		return pd().abort_flg();
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		pd().abort_flg(value);
	}

	/**
	 * Free of charge flg. 無償ＦＬＧ.<p>
	 *
	 */
	public boolean ncv_flg() {
		return pd().ncv_flg();
	}

	/**
	 * Free of charge flg. 無償ＦＬＧ.<p>
	 *
	 */
	public void ncv_flg(boolean value) {
		pd().ncv_flg(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return pd().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		pd().gd_cd(value);
	}

	/**
	 * Inventory conforming type 在庫良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return pd().quality_typ();
	}

	/**
	 * Inventory conforming type 在庫良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		pd().quality_typ(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return pd().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		pd().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return pd().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		pd().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return pd().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		pd().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return pd().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		pd().sno4(value);
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public String dlv_loc_cd() {
		return pd().dlv_loc_cd();
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public void dlv_loc_cd(String value) {
		pd().dlv_loc_cd(value);
	}

	/**
	 * Delivery location controlling site type 納入場所管轄区分.<p>
	 *
	 */
	public String dlv_loc_mng_typ() {
		return pd().dlv_loc_mng_typ();
	}

	/**
	 * Delivery location controlling site type 納入場所管轄区分.<p>
	 *
	 */
	public void dlv_loc_mng_typ(String value) {
		pd().dlv_loc_mng_typ(value);
	}

	/**
	 * Delivery location WG 納入場所ＷＧ.<p>
	 *
	 */
	public String dlv_loc_wg_cd() {
		return pd().dlv_loc_wg_cd();
	}

	/**
	 * Delivery location WG 納入場所ＷＧ.<p>
	 *
	 */
	public void dlv_loc_wg_cd(String value) {
		pd().dlv_loc_wg_cd(value);
	}

	/**
	 * Delivery location supplier cd. 納入場所発注先ＣＤ.<p>
	 *
	 */
	public String dlv_loc_sppl_cd() {
		return pd().dlv_loc_sppl_cd();
	}

	/**
	 * Delivery location supplier cd. 納入場所発注先ＣＤ.<p>
	 *
	 */
	public void dlv_loc_sppl_cd(String value) {
		pd().dlv_loc_sppl_cd(value);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return pd().str_ln_cd();
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		pd().str_ln_cd(value);
	}

	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public String drct_dlv_typ() {
		return pd().drct_dlv_typ();
	}

	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public void drct_dlv_typ(String value) {
		pd().drct_dlv_typ(value);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String scst_cd() {
		return pd().scst_cd();
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void scst_cd(String value) {
		pd().scst_cd(value);
	}

	/**
	 * Lot creation flg. ロット作成ＦＬＧ.<p>
	 *
	 */
	public boolean crt_lot_flg() {
		return pd().crt_lot_flg();
	}

	/**
	 * Lot creation flg. ロット作成ＦＬＧ.<p>
	 *
	 */
	public void crt_lot_flg(boolean value) {
		pd().crt_lot_flg(value);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return pd().lot_mng_typ();
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		pd().lot_mng_typ(value);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return pd().sublot_mng_typ();
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		pd().sublot_mng_typ(value);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return pd().lot_no_typ();
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		pd().lot_no_typ(value);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return pd().sublot_no_typ();
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		pd().sublot_no_typ(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return pd().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		pd().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return pd().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		pd().sublot_no(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return pd().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		pd().ver_no(value);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return pd().bp_lot_no();
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		pd().bp_lot_no(value);
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return pd().bp_dlv_slip_no();
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		pd().bp_dlv_slip_no(value);
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_d_no() {
		return pd().bp_dlv_slip_d_no();
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no(String value) {
		pd().bp_dlv_slip_d_no(value);
	}

	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public MCDate ship_fr_valid_dt() {
		return pd().ship_fr_valid_dt();
	}

	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public void ship_fr_valid_dt(MCDate value) {
		pd().ship_fr_valid_dt(value);
	}

	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public boolean upri_not_tgt_flg() {
		return pd().upri_not_tgt_flg();
	}

	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public void upri_not_tgt_flg(boolean value) {
		pd().upri_not_tgt_flg(value);
	}

	/**
	 * Details correction flg. 明細訂正ＦＬＧ.<p>
	 *
	 */
	public boolean purc_dtl_upd_flg() {
		return pd().purc_dtl_upd_flg();
	}

	/**
	 * Details correction flg. 明細訂正ＦＬＧ.<p>
	 *
	 */
	public void purc_dtl_upd_flg(boolean value) {
		pd().purc_dtl_upd_flg(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return pd().trd_cur_upri();
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		pd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		pd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		pd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		pd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		pd().trd_cur_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public MCNumber trd_cur_proc_upri() {
		return pd().trd_cur_proc_upri();
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(MCNumber value) {
		pd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(int value) {
		pd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(long value) {
		pd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(float value) {
		pd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(double value) {
		pd().trd_cur_proc_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_upri() {
		return pd().trd_cur_onr_prov_upri();
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(MCNumber value) {
		pd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(int value) {
		pd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(long value) {
		pd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(float value) {
		pd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(double value) {
		pd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public boolean interim_flg() {
		return pd().interim_flg();
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		pd().interim_flg(value);
	}

	/**
	 * Details discount amount (Transaction currency) 取引通貨明細値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return pd().trd_cur_dscnt_amt();
	}

	/**
	 * Details discount amount (Transaction currency) 取引通貨明細値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		pd().trd_cur_dscnt_amt(value);
	}

	/**
	 * Details discount amount (Transaction currency) 取引通貨明細値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		pd().trd_cur_dscnt_amt(value);
	}

	/**
	 * Details discount amount (Transaction currency) 取引通貨明細値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		pd().trd_cur_dscnt_amt(value);
	}

	/**
	 * Details discount amount (Transaction currency) 取引通貨明細値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		pd().trd_cur_dscnt_amt(value);
	}

	/**
	 * Details discount amount (Transaction currency) 取引通貨明細値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		pd().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return pd().dscnt_rsn_cd();
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		pd().dscnt_rsn_cd(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return pd().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		pd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		pd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		pd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		pd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		pd().trd_cur_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return pd().trd_cur_proc_amt();
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		pd().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		pd().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		pd().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		pd().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		pd().trd_cur_proc_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return pd().trd_cur_onr_prov_amt();
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		pd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		pd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		pd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		pd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		pd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return pd().tax_cd();
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		pd().tax_cd(value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return pd().tax_rate();
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		pd().tax_rate(value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		pd().tax_rate(value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		pd().tax_rate(value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		pd().tax_rate(value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		pd().tax_rate(value);
	}

	/**
	 * Tax specified flg. 税指定ＦＬＧ.<p>
	 *
	 */
	public boolean tax_fix_flg() {
		return pd().tax_fix_flg();
	}

	/**
	 * Tax specified flg. 税指定ＦＬＧ.<p>
	 *
	 */
	public void tax_fix_flg(boolean value) {
		pd().tax_fix_flg(value);
	}

	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return pd().inc_tax_flg();
	}

	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		pd().inc_tax_flg(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return pd().trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		pd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		pd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		pd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		pd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		pd().trd_cur_tax_amt(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return pd().base_cur_upri();
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		pd().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		pd().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		pd().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		pd().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		pd().base_cur_upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public MCNumber base_cur_proc_upri() {
		return pd().base_cur_proc_upri();
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(MCNumber value) {
		pd().base_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(int value) {
		pd().base_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(long value) {
		pd().base_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(float value) {
		pd().base_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(double value) {
		pd().base_cur_proc_upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_upri() {
		return pd().base_cur_onr_prov_upri();
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(MCNumber value) {
		pd().base_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(int value) {
		pd().base_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(long value) {
		pd().base_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(float value) {
		pd().base_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(double value) {
		pd().base_cur_onr_prov_upri(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return pd().base_cur_dscnt_amt();
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		pd().base_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		pd().base_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		pd().base_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		pd().base_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		pd().base_cur_dscnt_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return pd().base_cur_amt();
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		pd().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		pd().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		pd().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		pd().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		pd().base_cur_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public MCNumber base_cur_proc_amt() {
		return pd().base_cur_proc_amt();
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(MCNumber value) {
		pd().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(int value) {
		pd().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(long value) {
		pd().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(float value) {
		pd().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(double value) {
		pd().base_cur_proc_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_amt() {
		return pd().base_cur_onr_prov_amt();
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(MCNumber value) {
		pd().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(int value) {
		pd().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(long value) {
		pd().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(float value) {
		pd().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(double value) {
		pd().base_cur_onr_prov_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return pd().base_cur_tax_amt();
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		pd().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		pd().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		pd().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		pd().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		pd().base_cur_tax_amt(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public MCNumber ptax_cur_upri() {
		return pd().ptax_cur_upri();
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(MCNumber value) {
		pd().ptax_cur_upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(int value) {
		pd().ptax_cur_upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(long value) {
		pd().ptax_cur_upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(float value) {
		pd().ptax_cur_upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(double value) {
		pd().ptax_cur_upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public MCNumber ptax_cur_proc_upri() {
		return pd().ptax_cur_proc_upri();
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(MCNumber value) {
		pd().ptax_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(int value) {
		pd().ptax_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(long value) {
		pd().ptax_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(float value) {
		pd().ptax_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(double value) {
		pd().ptax_cur_proc_upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public MCNumber ptax_cur_onr_prov_upri() {
		return pd().ptax_cur_onr_prov_upri();
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(MCNumber value) {
		pd().ptax_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(int value) {
		pd().ptax_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(long value) {
		pd().ptax_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(float value) {
		pd().ptax_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(double value) {
		pd().ptax_cur_onr_prov_upri(value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public MCNumber ptax_cur_dscnt_amt() {
		return pd().ptax_cur_dscnt_amt();
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(MCNumber value) {
		pd().ptax_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(int value) {
		pd().ptax_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(long value) {
		pd().ptax_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(float value) {
		pd().ptax_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(double value) {
		pd().ptax_cur_dscnt_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return pd().ptax_cur_amt();
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		pd().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		pd().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		pd().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		pd().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		pd().ptax_cur_amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public MCNumber ptax_cur_proc_amt() {
		return pd().ptax_cur_proc_amt();
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(MCNumber value) {
		pd().ptax_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(int value) {
		pd().ptax_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(long value) {
		pd().ptax_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(float value) {
		pd().ptax_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(double value) {
		pd().ptax_cur_proc_amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public MCNumber ptax_cur_onr_prov_amt() {
		return pd().ptax_cur_onr_prov_amt();
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(MCNumber value) {
		pd().ptax_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(int value) {
		pd().ptax_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(long value) {
		pd().ptax_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(float value) {
		pd().ptax_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(double value) {
		pd().ptax_cur_onr_prov_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public MCNumber ptax_cur_tax_amt() {
		return pd().ptax_cur_tax_amt();
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(MCNumber value) {
		pd().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(int value) {
		pd().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(long value) {
		pd().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(float value) {
		pd().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(double value) {
		pd().ptax_cur_tax_amt(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return pd().wtax_rate();
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		pd().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		pd().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		pd().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		pd().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		pd().wtax_rate(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber trd_cur_wtax_amt() {
		return pd().trd_cur_wtax_amt();
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void trd_cur_wtax_amt(MCNumber value) {
		pd().trd_cur_wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void trd_cur_wtax_amt(int value) {
		pd().trd_cur_wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void trd_cur_wtax_amt(long value) {
		pd().trd_cur_wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void trd_cur_wtax_amt(float value) {
		pd().trd_cur_wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void trd_cur_wtax_amt(double value) {
		pd().trd_cur_wtax_amt(value);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return pd().sppl_itm_cd();
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		pd().sppl_itm_cd(value);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return pd().sppl_itm_nm();
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		pd().sppl_itm_nm(value);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return pd().purc_id_typ();
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		pd().purc_id_typ(value);
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public String purc_rsn_cd() {
		return pd().purc_rsn_cd();
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public void purc_rsn_cd(String value) {
		pd().purc_rsn_cd(value);
	}

	/**
	 * Expenses purchasing flg. 経費購買ＦＬＧ.<p>
	 *
	 */
	public boolean xpns_purc_flg() {
		return pd().xpns_purc_flg();
	}

	/**
	 * Expenses purchasing flg. 経費購買ＦＬＧ.<p>
	 *
	 */
	public void xpns_purc_flg(boolean value) {
		pd().xpns_purc_flg(value);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return pd().ac_rsn_cd();
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		pd().ac_rsn_cd(value);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return pd().ap_dpt_cd();
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		pd().ap_dpt_cd(value);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return pd().ap_dpt_nm();
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		pd().ap_dpt_nm(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return pd().pay_crryovr_times();
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		pd().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		pd().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		pd().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		pd().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		pd().pay_crryovr_times(value);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return pd().purc_usr_cd();
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		pd().purc_usr_cd(value);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return pd().purc_dpt_cd();
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		pd().purc_dpt_cd(value);
	}

	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public String purc_dpt_nm() {
		return pd().purc_dpt_nm();
	}

	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public void purc_dpt_nm(String value) {
		pd().purc_dpt_nm(value);
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return pd().wg_cd();
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		pd().wg_cd(value);
	}

	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public String bd_itm_cd() {
		return pd().bd_itm_cd();
	}

	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public void bd_itm_cd(String value) {
		pd().bd_itm_cd(value);
	}

	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public String bd_itm_sub1() {
		return pd().bd_itm_sub1();
	}

	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public void bd_itm_sub1(String value) {
		pd().bd_itm_sub1(value);
	}

	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public String bd_itm_sub2() {
		return pd().bd_itm_sub2();
	}

	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public void bd_itm_sub2(String value) {
		pd().bd_itm_sub2(value);
	}

	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public String bd_itm_sub3() {
		return pd().bd_itm_sub3();
	}

	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public void bd_itm_sub3(String value) {
		pd().bd_itm_sub3(value);
	}

	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public String bd_lot_mng_typ() {
		return pd().bd_lot_mng_typ();
	}

	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public void bd_lot_mng_typ(String value) {
		pd().bd_lot_mng_typ(value);
	}

	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public String bd_lot_no_typ() {
		return pd().bd_lot_no_typ();
	}

	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public void bd_lot_no_typ(String value) {
		pd().bd_lot_no_typ(value);
	}

	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public String bd_sublot_mng_typ() {
		return pd().bd_sublot_mng_typ();
	}

	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public void bd_sublot_mng_typ(String value) {
		pd().bd_sublot_mng_typ(value);
	}

	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public String bd_sublot_no_typ() {
		return pd().bd_sublot_no_typ();
	}

	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public void bd_sublot_no_typ(String value) {
		pd().bd_sublot_no_typ(value);
	}

	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public String bd_sno1_mng_typ() {
		return pd().bd_sno1_mng_typ();
	}

	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public void bd_sno1_mng_typ(String value) {
		pd().bd_sno1_mng_typ(value);
	}

	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public String bd_sno2_mng_typ() {
		return pd().bd_sno2_mng_typ();
	}

	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public void bd_sno2_mng_typ(String value) {
		pd().bd_sno2_mng_typ(value);
	}

	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public String bd_sno3_mng_typ() {
		return pd().bd_sno3_mng_typ();
	}

	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public void bd_sno3_mng_typ(String value) {
		pd().bd_sno3_mng_typ(value);
	}

	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public String bd_sno4_mng_typ() {
		return pd().bd_sno4_mng_typ();
	}

	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public void bd_sno4_mng_typ(String value) {
		pd().bd_sno4_mng_typ(value);
	}

	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public String bd_sno1() {
		return pd().bd_sno1();
	}

	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public void bd_sno1(String value) {
		pd().bd_sno1(value);
	}

	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public String bd_sno2() {
		return pd().bd_sno2();
	}

	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public void bd_sno2(String value) {
		pd().bd_sno2(value);
	}

	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public String bd_sno3() {
		return pd().bd_sno3();
	}

	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public void bd_sno3(String value) {
		pd().bd_sno3(value);
	}

	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public String bd_sno4() {
		return pd().bd_sno4();
	}

	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public void bd_sno4(String value) {
		pd().bd_sno4(value);
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public String bd_loc_cd() {
		return pd().bd_loc_cd();
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public void bd_loc_cd(String value) {
		pd().bd_loc_cd(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return pd().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		pd().bd_dpt_cd(value);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return pd().bd_dpt_nm();
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		pd().bd_dpt_nm(value);
	}

	/**
	 * Charged dept. WG cd. 負担部門ＷＧＣＤ.<p>
	 *
	 */
	public String bd_wg_cd() {
		return pd().bd_wg_cd();
	}

	/**
	 * Charged dept. WG cd. 負担部門ＷＧＣＤ.<p>
	 *
	 */
	public void bd_wg_cd(String value) {
		pd().bd_wg_cd(value);
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public String bd_bp_cd() {
		return pd().bd_bp_cd();
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public void bd_bp_cd(String value) {
		pd().bd_bp_cd(value);
	}

	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public String bd_lot_no() {
		return pd().bd_lot_no();
	}

	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public void bd_lot_no(String value) {
		pd().bd_lot_no(value);
	}

	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public String bd_sublot_no() {
		return pd().bd_sublot_no();
	}

	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public void bd_sublot_no(String value) {
		pd().bd_sublot_no(value);
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public String bd_ctg_cd() {
		return pd().bd_ctg_cd();
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public void bd_ctg_cd(String value) {
		pd().bd_ctg_cd(value);
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public String bd_oper_cd() {
		return pd().bd_oper_cd();
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public void bd_oper_cd(String value) {
		pd().bd_oper_cd(value);
	}

	/**
	 * Charged I/V No. 負担Ｉ／ＶＮＯ.<p>
	 *
	 */
	public String bd_iv_no() {
		return pd().bd_iv_no();
	}

	/**
	 * Charged I/V No. 負担Ｉ／ＶＮＯ.<p>
	 *
	 */
	public void bd_iv_no(String value) {
		pd().bd_iv_no(value);
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public String bd_po_no() {
		return pd().bd_po_no();
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public void bd_po_no(String value) {
		pd().bd_po_no(value);
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public String bd_slo_no() {
		return pd().bd_slo_no();
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public void bd_slo_no(String value) {
		pd().bd_slo_no(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return pd().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		pd().trd_d_rmrks(value);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return pd().intr_d_rmrks();
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		pd().intr_d_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return pd().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		pd().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return pd().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		pd().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return pd().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		pd().sub_char3(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return pd().disp_seq();
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		pd().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		pd().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		pd().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		pd().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		pd().disp_seq(value);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return pd().arr_pr_no();
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		pd().arr_pr_no(value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public MCNumber arr_pr_upd_cntr() {
		return pd().arr_pr_upd_cntr();
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public void arr_pr_upd_cntr(MCNumber value) {
		pd().arr_pr_upd_cntr(value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public void arr_pr_upd_cntr(int value) {
		pd().arr_pr_upd_cntr(value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public void arr_pr_upd_cntr(long value) {
		pd().arr_pr_upd_cntr(value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public void arr_pr_upd_cntr(float value) {
		pd().arr_pr_upd_cntr(value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public void arr_pr_upd_cntr(double value) {
		pd().arr_pr_upd_cntr(value);
	}

	/**
	 * Conforming type for saving 退避用良品区分.<p>
	 *
	 */
	public String tmp_quality_typ() {
		return pd().tmp_quality_typ();
	}

	/**
	 * Conforming type for saving 退避用良品区分.<p>
	 *
	 */
	public void tmp_quality_typ(String value) {
		pd().tmp_quality_typ(value);
	}

	/**
	 * Rate for saving 退避用格付.<p>
	 *
	 */
	public String tmp_gd_cd() {
		return pd().tmp_gd_cd();
	}

	/**
	 * Rate for saving 退避用格付.<p>
	 *
	 */
	public void tmp_gd_cd(String value) {
		pd().tmp_gd_cd(value);
	}

	/**
	 * Update counter (Purchase result header) 更新カウンタ（仕入実績ヘッダ）.<p>
	 *
	 */
	public MCNumber purc_act_upd_cntr() {
		return pd().purc_act_upd_cntr();
	}

	/**
	 * Update counter (Purchase result header) 更新カウンタ（仕入実績ヘッダ）.<p>
	 *
	 */
	public void purc_act_upd_cntr(MCNumber value) {
		pd().purc_act_upd_cntr(value);
	}

	/**
	 * Update counter (Purchase result header) 更新カウンタ（仕入実績ヘッダ）.<p>
	 *
	 */
	public void purc_act_upd_cntr(int value) {
		pd().purc_act_upd_cntr(value);
	}

	/**
	 * Update counter (Purchase result header) 更新カウンタ（仕入実績ヘッダ）.<p>
	 *
	 */
	public void purc_act_upd_cntr(long value) {
		pd().purc_act_upd_cntr(value);
	}

	/**
	 * Update counter (Purchase result header) 更新カウンタ（仕入実績ヘッダ）.<p>
	 *
	 */
	public void purc_act_upd_cntr(float value) {
		pd().purc_act_upd_cntr(value);
	}

	/**
	 * Update counter (Purchase result header) 更新カウンタ（仕入実績ヘッダ）.<p>
	 *
	 */
	public void purc_act_upd_cntr(double value) {
		pd().purc_act_upd_cntr(value);
	}

	/**
	 * Manual add マニュアル追加.<p>
	 *
	 */
	public boolean manual_add_flg() {
		return pd().manual_add_flg();
	}

	/**
	 * Manual add マニュアル追加.<p>
	 *
	 */
	public void manual_add_flg(boolean value) {
		pd().manual_add_flg(value);
	}

	/**
	 * Entry row linked No. 登録行紐づけＮＯ.<p>
	 *
	 */
	public MCNumber ins_peg_no() {
		return pd().ins_peg_no();
	}

	/**
	 * Entry row linked No. 登録行紐づけＮＯ.<p>
	 *
	 */
	public void ins_peg_no(MCNumber value) {
		pd().ins_peg_no(value);
	}

	/**
	 * Entry row linked No. 登録行紐づけＮＯ.<p>
	 *
	 */
	public void ins_peg_no(int value) {
		pd().ins_peg_no(value);
	}

	/**
	 * Entry row linked No. 登録行紐づけＮＯ.<p>
	 *
	 */
	public void ins_peg_no(long value) {
		pd().ins_peg_no(value);
	}

	/**
	 * Entry row linked No. 登録行紐づけＮＯ.<p>
	 *
	 */
	public void ins_peg_no(float value) {
		pd().ins_peg_no(value);
	}

	/**
	 * Entry row linked No. 登録行紐づけＮＯ.<p>
	 *
	 */
	public void ins_peg_no(double value) {
		pd().ins_peg_no(value);
	}

	/**
	 * Correction row linked No. 訂正行紐づけＮＯ.<p>
	 *
	 */
	public MCNumber upd_peg_no() {
		return pd().upd_peg_no();
	}

	/**
	 * Correction row linked No. 訂正行紐づけＮＯ.<p>
	 *
	 */
	public void upd_peg_no(MCNumber value) {
		pd().upd_peg_no(value);
	}

	/**
	 * Correction row linked No. 訂正行紐づけＮＯ.<p>
	 *
	 */
	public void upd_peg_no(int value) {
		pd().upd_peg_no(value);
	}

	/**
	 * Correction row linked No. 訂正行紐づけＮＯ.<p>
	 *
	 */
	public void upd_peg_no(long value) {
		pd().upd_peg_no(value);
	}

	/**
	 * Correction row linked No. 訂正行紐づけＮＯ.<p>
	 *
	 */
	public void upd_peg_no(float value) {
		pd().upd_peg_no(value);
	}

	/**
	 * Correction row linked No. 訂正行紐づけＮＯ.<p>
	 *
	 */
	public void upd_peg_no(double value) {
		pd().upd_peg_no(value);
	}

}

