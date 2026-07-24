package mcframe.serverMSBE.MSBEL5740;

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
 * ブロック"RcptIv_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RcptIv_Chk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Pegging No. 紐付ＮＯ.<p>
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
	public static final String $ivd = "ivd";
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
	public static final String $ap_dpt_nm = "ap_dpt_nm";
	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
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
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public static final String $trd_cur_inc_tax_amt = "trd_cur_inc_tax_amt";
	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	public static final String $purc_dpt_nm = "purc_dpt_nm";
	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public static final String $bd_lot_mng_typ = "bd_lot_mng_typ";
	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public static final String $bd_sublot_mng_typ = "bd_sublot_mng_typ";
	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $bd_lot_no_typ = "bd_lot_no_typ";
	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $bd_sublot_no_typ = "bd_sublot_no_typ";
	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $bd_sno1_mng_typ = "bd_sno1_mng_typ";
	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $bd_sno2_mng_typ = "bd_sno2_mng_typ";
	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $bd_sno3_mng_typ = "bd_sno3_mng_typ";
	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $bd_sno4_mng_typ = "bd_sno4_mng_typ";
	public static final String $bd_dpt_nm = "bd_dpt_nm";
	/**
	 * Purchase invoice No. before change 変更前受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $old_rcpt_iv_no = "old_rcpt_iv_no";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public static final String $purc_amt_rnd_typ = "purc_amt_rnd_typ";
	/**
	 * Tax rounding type 消費税端数処理区分.<p>
	 *
	 */
	public static final String $purc_tax_rnd_typ = "purc_tax_rnd_typ";
	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public static final String $in_to_id_typ = "in_to_id_typ";
	/**
	 * Delivery destination identification cd. 納入先識別ＣＤ.<p>
	 *
	 */
	public static final String $in_to_id_cd = "in_to_id_cd";
	/**
	 * Delivery destination identification name 納入先識別名.<p>
	 *
	 */
	public static final String $in_to_id_nm = "in_to_id_nm";
	/**
	 * Delivery destination zip code 納入先郵便番号.<p>
	 *
	 */
	public static final String $in_to_zip_cd = "in_to_zip_cd";
	/**
	 * Delivery destination address1 納入先住所１.<p>
	 *
	 */
	public static final String $in_to_addr1 = "in_to_addr1";
	/**
	 * Delivery destination address2 納入先住所２.<p>
	 *
	 */
	public static final String $in_to_addr2 = "in_to_addr2";
	/**
	 * Delivery destination address3 納入先住所３.<p>
	 *
	 */
	public static final String $in_to_addr3 = "in_to_addr3";
	/**
	 * Delivery destination address4 納入先住所４.<p>
	 *
	 */
	public static final String $in_to_addr4 = "in_to_addr4";
	/**
	 * Delivery destination dept. 納入先部署.<p>
	 *
	 */
	public static final String $in_to_cntct_dpt = "in_to_cntct_dpt";
	/**
	 * Delivery destination PIC 納入先担当者.<p>
	 *
	 */
	public static final String $in_to_cntct_psn = "in_to_cntct_psn";
	/**
	 * Delivery destination TEL 納入先ＴＥＬ.<p>
	 *
	 */
	public static final String $in_to_tel = "in_to_tel";
	/**
	 * Delivery destination FAX 納入先ＦＡＸ.<p>
	 *
	 */
	public static final String $in_to_fax = "in_to_fax";
	/**
	 * Delivery destination country cd. 納入先国ＣＤ.<p>
	 *
	 */
	public static final String $in_to_cntry_cd = "in_to_cntry_cd";
	/**
	 * Miscellaneous delivery destination flg. 納入先諸口ＦＬＧ.<p>
	 *
	 */
	public static final String $in_to_sundry_flg = "in_to_sundry_flg";
	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $tterm_cd1 = "tterm_cd1";
	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public static final String $tterm_rmrks1 = "tterm_rmrks1";
	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $tterm_cd2 = "tterm_cd2";
	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public static final String $tterm_rmrks2 = "tterm_rmrks2";
	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $tterm_cd3 = "tterm_cd3";
	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public static final String $tterm_rmrks3 = "tterm_rmrks3";
	/**
	 * Customer invoice transaction flg. 得意先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_amt_dec_place = "trd_amt_dec_place";
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_upri_dec_place = "trd_upri_dec_place";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public static final String $ptax_cur_amt = "ptax_cur_amt";
	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public static final String $ptax_cur_tax_amt = "ptax_cur_tax_amt";
	/**
	 * Not for purchase flg. 仕入対象外ＦＬＧ.<p>
	 *
	 */
	public static final String $non_purc_flg = "non_purc_flg";
	/**
	 * PO transaction unit cd. 発注取引単位ＣＤ.<p>
	 *
	 */
	public static final String $po_trd_unit_cd = "po_trd_unit_cd";
	/**
	 * Transaction unit PO qty. 発注取引単位数量.<p>
	 *
	 */
	public static final String $po_trd_unit_qty = "po_trd_unit_qty";
	/**
	 * PO unit price 発注単価.<p>
	 *
	 */
	public static final String $po_trd_cur_upri = "po_trd_cur_upri";
	/**
	 * PO discount amount 発注値引額.<p>
	 *
	 */
	public static final String $po_trd_cur_dscnt_amt = "po_trd_cur_dscnt_amt";
	/**
	 * PO subcontracting unit price 発注加工単価.<p>
	 *
	 */
	public static final String $po_trd_cur_proc_upri = "po_trd_cur_proc_upri";
	/**
	 * PO chargeable supply unit price 発注有償支給単価.<p>
	 *
	 */
	public static final String $po_trd_cur_onr_prov_upri = "po_trd_cur_onr_prov_upri";
	/**
	 * PO amount 発注金額.<p>
	 *
	 */
	public static final String $po_trd_cur_amt = "po_trd_cur_amt";
	/**
	 * PO subcontracting amount 発注加工金額.<p>
	 *
	 */
	public static final String $po_trd_cur_proc_amt = "po_trd_cur_proc_amt";
	/**
	 * PO chargeable supply amount 発注有償支給金額.<p>
	 *
	 */
	public static final String $po_trd_cur_onr_prov_amt = "po_trd_cur_onr_prov_amt";
	/**
	 * PO tax amount 発注税額.<p>
	 *
	 */
	public static final String $po_trd_cur_tax_amt = "po_trd_cur_tax_amt";
	/**
	 * Tax included PO amount 発注税込金額.<p>
	 *
	 */
	public static final String $po_trd_cur_inc_ctax_amt = "po_trd_cur_inc_ctax_amt";
	/**
	 * Transaction unit PO conversion qty. 発注取引単位換算数量.<p>
	 *
	 */
	public static final String $po_trd_unit_conv_qty = "po_trd_unit_conv_qty";
	/**
	 * Transaction unit PO conversion base qty. 発注取引単位換算基準数量.<p>
	 *
	 */
	public static final String $po_trd_unit_conv_base_qty = "po_trd_unit_conv_base_qty";
	/**
	 * PO WG cd. 発注ＷＧ ＣＤ.<p>
	 *
	 */
	public static final String $po_wg_cd = "po_wg_cd";
	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public static final String $arr_schd_no = "arr_schd_no";
	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $arr_pr_no = "arr_pr_no";
	/**
	 * Sales order status type 受注状況区分.<p>
	 *
	 */
	public static final String $slo_sts_typ = "slo_sts_typ";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public static final String $qty = "qty";
	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public static final String $purc_qty = "purc_qty";
	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public static final String $base_unit_accpt_dfct_qty = "base_unit_accpt_dfct_qty";
	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public static final String $base_unit_abort_qty = "base_unit_abort_qty";
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public static final String $aprv_no = "aprv_no";
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public static final String $purc_schd_dt = "purc_schd_dt";
	/**
	 * Unpegged 紐切れ.<p>
	 *
	 */
	public static final String $rqst_can_flg = "rqst_can_flg";
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Discount item flg. 値引品ＦＬＧ.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Expenses purchasing flg. 経費購買ＦＬＧ.<p>
	 *
	 */
	public static final String $xpns_purc_flg = "xpns_purc_flg";
	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public static final String $sync_flg = "sync_flg";

	public static final String $rcpt_iv_d_no = $ivd + ".rcpt_iv_d_no";
	public static final String $rcpt_iv_mng_no = $ivd + ".rcpt_iv_mng_no";
	public static final String $rcpt_iv_rev = $ivd + ".rcpt_iv_rev";
	public static final String $po_no = $ivd + ".po_no";
	public static final String $po_d_no = $ivd + ".po_d_no";
	public static final String $purc_schd_no = $ivd + ".purc_schd_no";
	public static final String $trd_cd = $ivd + ".trd_cd";
	public static final String $trd_ptn_typ = $ivd + ".trd_ptn_typ";
	public static final String $itm_cd = $ivd + ".itm_cd";
	public static final String $itm_sub1 = $ivd + ".itm_sub1";
	public static final String $itm_sub2 = $ivd + ".itm_sub2";
	public static final String $itm_sub3 = $ivd + ".itm_sub3";
	public static final String $itm_nm = $ivd + ".itm_nm";
	public static final String $iv_itm_nm = $ivd + ".iv_itm_nm";
	public static final String $sno1 = $ivd + ".sno1";
	public static final String $sno2 = $ivd + ".sno2";
	public static final String $sno3 = $ivd + ".sno3";
	public static final String $sno4 = $ivd + ".sno4";
	public static final String $purc_rsn_cd = $ivd + ".purc_rsn_cd";
	public static final String $purc_id_typ = $ivd + ".purc_id_typ";
	public static final String $sundry_itm_flg = $ivd + ".sundry_itm_flg";
	public static final String $sppl_itm_cd = $ivd + ".sppl_itm_cd";
	public static final String $sppl_itm_nm = $ivd + ".sppl_itm_nm";
	public static final String $ap_dpt_cd = $ivd + ".ap_dpt_cd";
	public static final String $maker_cd = $ivd + ".maker_cd";
	public static final String $trd_unit_qty = $ivd + ".trd_unit_qty";
	public static final String $trd_unit_cd = $ivd + ".trd_unit_cd";
	public static final String $base_unit_qty = $ivd + ".base_unit_qty";
	public static final String $base_unit_cd = $ivd + ".base_unit_cd";
	public static final String $trd_cur_upri = $ivd + ".trd_cur_upri";
	public static final String $trd_cur_proc_upri = $ivd + ".trd_cur_proc_upri";
	public static final String $trd_cur_onr_prov_upri = $ivd + ".trd_cur_onr_prov_upri";
	public static final String $upri_not_tgt_flg = $ivd + ".upri_not_tgt_flg";
	public static final String $interim_flg = $ivd + ".interim_flg";
	public static final String $trd_cur_amt = $ivd + ".trd_cur_amt";
	public static final String $trd_cur_proc_amt = $ivd + ".trd_cur_proc_amt";
	public static final String $trd_cur_onr_prov_amt = $ivd + ".trd_cur_onr_prov_amt";
	public static final String $trd_cur_tax_amt = $ivd + ".trd_cur_tax_amt";
	public static final String $trd_cur_dscnt_amt = $ivd + ".trd_cur_dscnt_amt";
	public static final String $dscnt_rsn_cd = $ivd + ".dscnt_rsn_cd";
	public static final String $tax_fix_flg = $ivd + ".tax_fix_flg";
	public static final String $tax_cd = $ivd + ".tax_cd";
	public static final String $wtax_rate = $ivd + ".wtax_rate";
	public static final String $wtax_amt = $ivd + ".wtax_amt";
	public static final String $manual_add_flg = $ivd + ".manual_add_flg";
	public static final String $purc_dpt_cd = $ivd + ".purc_dpt_cd";
	public static final String $wg_cd = $ivd + ".wg_cd";
	public static final String $purc_usr_cd = $ivd + ".purc_usr_cd";
	public static final String $slo_no = $ivd + ".slo_no";
	public static final String $slo_d_no = $ivd + ".slo_d_no";
	public static final String $bd_itm_cd = $ivd + ".bd_itm_cd";
	public static final String $bd_itm_sub1 = $ivd + ".bd_itm_sub1";
	public static final String $bd_itm_sub2 = $ivd + ".bd_itm_sub2";
	public static final String $bd_itm_sub3 = $ivd + ".bd_itm_sub3";
	public static final String $bd_sno1 = $ivd + ".bd_sno1";
	public static final String $bd_sno2 = $ivd + ".bd_sno2";
	public static final String $bd_sno3 = $ivd + ".bd_sno3";
	public static final String $bd_sno4 = $ivd + ".bd_sno4";
	public static final String $bd_loc_cd = $ivd + ".bd_loc_cd";
	public static final String $bd_lot_no = $ivd + ".bd_lot_no";
	public static final String $bd_sublot_no = $ivd + ".bd_sublot_no";
	public static final String $bd_dpt_cd = $ivd + ".bd_dpt_cd";
	public static final String $bd_wg_cd = $ivd + ".bd_wg_cd";
	public static final String $bd_ctg_cd = $ivd + ".bd_ctg_cd";
	public static final String $bd_oper_cd = $ivd + ".bd_oper_cd";
	public static final String $bd_slo_no = $ivd + ".bd_slo_no";
	public static final String $bd_iv_no = $ivd + ".bd_iv_no";
	public static final String $bd_po_no = $ivd + ".bd_po_no";
	public static final String $bd_bp_cd = $ivd + ".bd_bp_cd";
	public static final String $ref_prms_rcpt_d_no = $ivd + ".ref_prms_rcpt_d_no";
	public static final String $ref_dlv_inst_d_no = $ivd + ".ref_dlv_inst_d_no";
	public static final String $intr_d_rmrks = $ivd + ".intr_d_rmrks";
	public static final String $trd_d_rmrks = $ivd + ".trd_d_rmrks";
	public static final String $sub_char1 = $ivd + ".sub_char1";
	public static final String $sub_char2 = $ivd + ".sub_char2";
	public static final String $sub_char3 = $ivd + ".sub_char3";
	public static final String $rcpt_iv_d_rmrks = $ivd + ".rcpt_iv_d_rmrks";

	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta ivd_META = createInnerRowMeta($ivd, mcframe.serverMS.dbc.MST_RCPT_IV_D_R.class);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_cur_inc_tax_amt_META = createCommonMeta($trd_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta purc_dpt_nm_META = createCommonMeta($purc_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta bd_lot_mng_typ_META = createCommonMeta($bd_lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta bd_sublot_mng_typ_META = createCommonMeta($bd_sublot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta bd_lot_no_typ_META = createCommonMeta($bd_lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta bd_sublot_no_typ_META = createCommonMeta($bd_sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta bd_sno1_mng_typ_META = createCommonMeta($bd_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno2_mng_typ_META = createCommonMeta($bd_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno3_mng_typ_META = createCommonMeta($bd_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno4_mng_typ_META = createCommonMeta($bd_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta old_rcpt_iv_no_META = createCommonMeta($old_rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta purc_amt_rnd_typ_META = createCommonMeta($purc_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_rnd_typ_META = createCommonMeta($purc_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta in_to_id_typ_META = createCommonMeta($in_to_id_typ, mcframe.commonMS.meta.MS_META.IN_TO_ID_TYP);
	public static final MCMeta in_to_id_cd_META = createCommonMeta($in_to_id_cd, mcframe.commonMS.meta.MS_META.IN_TO_ID_CD);
	public static final MCMeta in_to_id_nm_META = createCommonMeta($in_to_id_nm, mcframe.commonMS.meta.MS_META.IN_TO_ID_NM);
	public static final MCMeta in_to_zip_cd_META = createCommonMeta($in_to_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta in_to_addr1_META = createCommonMeta($in_to_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr2_META = createCommonMeta($in_to_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr3_META = createCommonMeta($in_to_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr4_META = createCommonMeta($in_to_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_cntct_dpt_META = createCommonMeta($in_to_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta in_to_cntct_psn_META = createCommonMeta($in_to_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta in_to_tel_META = createCommonMeta($in_to_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta in_to_fax_META = createCommonMeta($in_to_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta in_to_cntry_cd_META = createCommonMeta($in_to_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta in_to_sundry_flg_META = createCommonMeta($in_to_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_amt_dec_place_META = createCommonMeta($trd_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_upri_dec_place_META = createCommonMeta($trd_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_amt_META = createCommonMeta($ptax_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_tax_amt_META = createCommonMeta($ptax_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta non_purc_flg_META = createCommonMeta($non_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_trd_unit_cd_META = createCommonMeta($po_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta po_trd_unit_qty_META = createCommonMeta($po_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta po_trd_cur_upri_META = createCommonMeta($po_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta po_trd_cur_dscnt_amt_META = createCommonMeta($po_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta po_trd_cur_proc_upri_META = createCommonMeta($po_trd_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta po_trd_cur_onr_prov_upri_META = createCommonMeta($po_trd_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta po_trd_cur_amt_META = createCommonMeta($po_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta po_trd_cur_proc_amt_META = createCommonMeta($po_trd_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta po_trd_cur_onr_prov_amt_META = createCommonMeta($po_trd_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta po_trd_cur_tax_amt_META = createCommonMeta($po_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta po_trd_cur_inc_ctax_amt_META = createCommonMeta($po_trd_cur_inc_ctax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta po_trd_unit_conv_qty_META = createCommonMeta($po_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta po_trd_unit_conv_base_qty_META = createCommonMeta($po_trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta po_wg_cd_META = createCommonMeta($po_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta arr_schd_no_META = createCommonMeta($arr_schd_no, mcframe.commonMA.meta.MA_META.ARR_SCHD_NO);
	public static final MCMeta arr_pr_no_META = createCommonMeta($arr_pr_no, mcframe.commonMA.meta.MA_META.ARR_PR_NO);
	public static final MCMeta slo_sts_typ_META = createCommonMeta($slo_sts_typ, mcframe.commonMS.meta.MS_META.SLO_STS_TYP);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_qty_META = createCommonMeta($purc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_accpt_dfct_qty_META = createCommonMeta($base_unit_accpt_dfct_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_abort_qty_META = createCommonMeta($base_unit_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta purc_schd_dt_META = createCommonMeta($purc_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_can_flg_META = createCommonMeta($rqst_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xpns_purc_flg_META = createCommonMeta($xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sync_flg_META = createCommonMeta($sync_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<RcptIv_Chk01_DtlR> constMetas = new ConstMetaList<RcptIv_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			peg_no_META,
			err_flg_META,
			data_crud_typ_META,
			ivd_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			ap_dpt_nm_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_dec_place_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			trd_cur_inc_tax_amt_META,
			inc_tax_flg_META,
			tax_rate_META,
			purc_dpt_nm_META,
			bd_lot_mng_typ_META,
			bd_sublot_mng_typ_META,
			bd_lot_no_typ_META,
			bd_sublot_no_typ_META,
			bd_sno1_mng_typ_META,
			bd_sno2_mng_typ_META,
			bd_sno3_mng_typ_META,
			bd_sno4_mng_typ_META,
			bd_dpt_nm_META,
			old_rcpt_iv_no_META,
			sppl_cd_META,
			purc_amt_rnd_typ_META,
			purc_tax_rnd_typ_META,
			in_to_id_typ_META,
			in_to_id_cd_META,
			in_to_id_nm_META,
			in_to_zip_cd_META,
			in_to_addr1_META,
			in_to_addr2_META,
			in_to_addr3_META,
			in_to_addr4_META,
			in_to_cntct_dpt_META,
			in_to_cntct_psn_META,
			in_to_tel_META,
			in_to_fax_META,
			in_to_cntry_cd_META,
			in_to_sundry_flg_META,
			tterm_cd1_META,
			tterm_rmrks1_META,
			tterm_cd2_META,
			tterm_rmrks2_META,
			tterm_cd3_META,
			tterm_rmrks3_META,
			cst_iv_flg_META,
			trd_cur_cd_META,
			trd_amt_dec_place_META,
			trd_upri_dec_place_META,
			mfg_inst_no_META,
			base_cur_amt_META,
			base_cur_tax_amt_META,
			ptax_cur_amt_META,
			ptax_cur_tax_amt_META,
			non_purc_flg_META,
			po_trd_unit_cd_META,
			po_trd_unit_qty_META,
			po_trd_cur_upri_META,
			po_trd_cur_dscnt_amt_META,
			po_trd_cur_proc_upri_META,
			po_trd_cur_onr_prov_upri_META,
			po_trd_cur_amt_META,
			po_trd_cur_proc_amt_META,
			po_trd_cur_onr_prov_amt_META,
			po_trd_cur_tax_amt_META,
			po_trd_cur_inc_ctax_amt_META,
			po_trd_unit_conv_qty_META,
			po_trd_unit_conv_base_qty_META,
			po_wg_cd_META,
			arr_schd_no_META,
			arr_pr_no_META,
			slo_sts_typ_META,
			unit_cd_META,
			qty_META,
			purc_qty_META,
			base_unit_accpt_dfct_qty_META,
			base_unit_abort_qty_META,
			aprv_no_META,
			purc_schd_dt_META,
			rqst_can_flg_META,
			stk_mng_typ_META,
			asset_mng_typ_META,
			dscnt_itm_flg_META,
			xpns_purc_flg_META,
			abort_flg_META,
			sync_flg_META
		},
		new String[][]{
			{
				"rcpt_iv_d_no",
				"rcpt_iv_mng_no",
				"rcpt_iv_rev",
				"po_no",
				"po_d_no",
				"purc_schd_no",
				"trd_cd",
				"trd_ptn_typ",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
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
				"trd_unit_qty",
				"trd_unit_cd",
				"base_unit_qty",
				"base_unit_cd",
				"trd_cur_upri",
				"trd_cur_proc_upri",
				"trd_cur_onr_prov_upri",
				"upri_not_tgt_flg",
				"interim_flg",
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
				"manual_add_flg",
				"purc_dpt_cd",
				"wg_cd",
				"purc_usr_cd",
				"slo_no",
				"slo_d_no",
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
				"ref_prms_rcpt_d_no",
				"ref_dlv_inst_d_no",
				"intr_d_rmrks",
				"trd_d_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"rcpt_iv_d_rmrks"
			},
			{
				$rcpt_iv_d_no,
				$rcpt_iv_mng_no,
				$rcpt_iv_rev,
				$po_no,
				$po_d_no,
				$purc_schd_no,
				$trd_cd,
				$trd_ptn_typ,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
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
				$trd_unit_qty,
				$trd_unit_cd,
				$base_unit_qty,
				$base_unit_cd,
				$trd_cur_upri,
				$trd_cur_proc_upri,
				$trd_cur_onr_prov_upri,
				$upri_not_tgt_flg,
				$interim_flg,
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
				$manual_add_flg,
				$purc_dpt_cd,
				$wg_cd,
				$purc_usr_cd,
				$slo_no,
				$slo_d_no,
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
				$ref_prms_rcpt_d_no,
				$ref_dlv_inst_d_no,
				$intr_d_rmrks,
				$trd_d_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$rcpt_iv_d_rmrks
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
				{$ivd + ".trd_cd", "MA.MAUAL0010.Trd"},	// ivd.trd_cd
				{$ivd + ".itm_sub3", "MA.MAUAL0010.ItmSub3"},	// ivd.itm_sub3
				{$ivd + ".purc_rsn_cd", "MA.MAUAL0010.PurcBizRsn"},	// ivd.purc_rsn_cd
				{$ivd + ".ap_dpt_cd", "MA.MAUAL0010.Dpt"},	// ivd.ap_dpt_cd
				{$ivd + ".maker_cd", "MA.MAUAL0010.Bp"},	// ivd.maker_cd
				{$ivd + ".trd_unit_cd", "MA.MAUAL0010.ItmUnit"},	// ivd.trd_unit_cd
				{$ivd + ".dscnt_rsn_cd", "MA.MAUAL0010.PurcDscntBizRsn"},	// ivd.dscnt_rsn_cd
				{$ivd + ".tax_cd", "MA.MAUAL0010.PurcTax"},	// ivd.tax_cd
				{$ivd + ".purc_dpt_cd", "MA.MAUAL0010.Dpt"},	// ivd.purc_dpt_cd
				{$ivd + ".purc_usr_cd", "MA.MAUAL0010.Usr"},	// ivd.purc_usr_cd
				{$ivd + ".bd_itm_sub3", "MA.MAUAL0010.ItmSub3"},	// ivd.bd_itm_sub3
				{$ivd + ".bd_loc_cd", "MA.MAUAL0010.Loc"},	// ivd.bd_loc_cd
				{$ivd + ".bd_dpt_cd", "MA.MAUAL0010.Dpt"},	// ivd.bd_dpt_cd
				{$ivd + ".bd_ctg_cd", "MA.MAUAL0010.CostCtg"},	// ivd.bd_ctg_cd
				{$ivd + ".bd_oper_cd", "MA.MAUAL0010.Oper"}	// ivd.bd_oper_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$ivd + ".trd_cd", "trd_ptn_typ"},	// ivd.trd_cd
				{$ivd + ".itm_sub3", "sundry_itm_flg;stk_mng_typ;asset_mng_typ;dscnt_itm_flg;base_unit_cd;base_unit_dec_place;base_unit_rnd_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// ivd.itm_sub3
				{$ivd + ".purc_rsn_cd", "xpns_purc_flg"},	// ivd.purc_rsn_cd
				{$ivd + ".ap_dpt_cd", "ap_dpt_nm"},	// ivd.ap_dpt_cd
				{$ivd + ".trd_unit_cd", "trd_unit_conv_base_qty;trd_unit_conv_qty;trd_unit_dec_place"},	// ivd.trd_unit_cd
				{$ivd + ".tax_cd", "tax_rate;inc_tax_flg"},	// ivd.tax_cd
				{$ivd + ".purc_dpt_cd", "wg_cd;purc_dpt_nm"},	// ivd.purc_dpt_cd
				{$ivd + ".bd_itm_sub3", "bd_lot_mng_typ;bd_lot_no_typ;bd_sublot_mng_typ;bd_sublot_no_typ;bd_sno1_mng_typ;bd_sno2_mng_typ;bd_sno3_mng_typ;bd_sno4_mng_typ"},	// ivd.bd_itm_sub3
				{$ivd + ".bd_dpt_cd", "bd_wg_cd;bd_dpt_nm"}	// ivd.bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$ivd + ".trd_cd", "trd_ptn_typ"},	// ivd.trd_cd
				{$ivd + ".itm_sub3", "sundry_itm_flg;stk_mng_typ;asset_mng_typ;dscnt_itm_flg;unit_cd;dec_place;rnd_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// ivd.itm_sub3
				{$ivd + ".purc_rsn_cd", "xpns_purc_flg"},	// ivd.purc_rsn_cd
				{$ivd + ".ap_dpt_cd", "dpt_nm"},	// ivd.ap_dpt_cd
				{$ivd + ".trd_unit_cd", "conv_base_qty;conv_qty;dec_place"},	// ivd.trd_unit_cd
				{$ivd + ".tax_cd", "tax_rate;inc_tax_flg"},	// ivd.tax_cd
				{$ivd + ".purc_dpt_cd", "wg_cd;dpt_nm"},	// ivd.purc_dpt_cd
				{$ivd + ".bd_itm_sub3", "lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// ivd.bd_itm_sub3
				{$ivd + ".bd_dpt_cd", "wg_cd;dpt_nm"}	// ivd.bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$ivd + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"},	// ivd.itm_sub3
				{$ivd + ".ap_dpt_cd", "MAC_DPT_IS_SRCH_TYP.AP"},	// ivd.ap_dpt_cd
				{$ivd + ".maker_cd", "MAC_BP_IS_SRCH_TYP.MAKER;true"},	// ivd.maker_cd
				{$ivd + ".trd_unit_cd", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// ivd.trd_unit_cd
				{$ivd + ".purc_dpt_cd", "MAC_DPT_IS_SRCH_TYP.PURC;base_dt;purc_usr_cd"},	// ivd.purc_dpt_cd
				{$ivd + ".bd_itm_sub3", "MAC_ITM_IS_SRCH_TYP.ASSET1;bd_itm_cd;bd_itm_sub1;bd_itm_sub2"},	// ivd.bd_itm_sub3
				{$ivd + ".bd_loc_cd", "MAC_LOC_IS_SRCH_TYP.COMM"},	// ivd.bd_loc_cd
				{$ivd + ".bd_dpt_cd", "MAC_DPT_IS_SRCH_TYP.BD"}	// ivd.bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$ivd + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// ivd.itm_sub3
				{$ivd + ".ap_dpt_cd", "dpt_is_srch_typ"},	// ivd.ap_dpt_cd
				{$ivd + ".maker_cd", "bp_is_srch_typ;mode_nullval_flg"},	// ivd.maker_cd
				{$ivd + ".trd_unit_cd", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// ivd.trd_unit_cd
				{$ivd + ".purc_dpt_cd", "dpt_is_srch_typ;dt;usr_cd"},	// ivd.purc_dpt_cd
				{$ivd + ".bd_itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// ivd.bd_itm_sub3
				{$ivd + ".bd_loc_cd", "loc_is_srch_typ"},	// ivd.bd_loc_cd
				{$ivd + ".bd_dpt_cd", "dpt_is_srch_typ"}	// ivd.bd_dpt_cd
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
	protected RcptIv_Chk01_DtlR_MC_A(ConstMetaList<? extends RcptIv_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcptIv_Chk01_DtlR clone() {
		return (RcptIv_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcptIv_Chk01_DtlR createInstance() {
		return (RcptIv_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcptIv_Chk01_DtlR getValues(String... names) {
		return (RcptIv_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 0, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}


	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
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


	public mcframe.serverMS.dbc.MST_RCPT_IV_D_R ivd(){
		return (mcframe.serverMS.dbc.MST_RCPT_IV_D_R) getConstInnerRow(offset + 4, $ivd);
	}
	
	public void ivd(mcframe.serverMS.dbc.MST_RCPT_IV_D_R row){
		setConstInnerRow(offset + 4, $ivd, row);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 5, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 5, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 6, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 6, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 7, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 7, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 8, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 8, $sno4_mng_typ, value);
	}


	public String ap_dpt_nm() {
		return getConstString(offset + 9, $ap_dpt_nm);
	}

	public void ap_dpt_nm(String value) {
		setConstString(offset + 9, $ap_dpt_nm, value);
	}


	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 10, $trd_unit_conv_base_qty);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 10, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 10, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 10, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 10, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 10, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 11, $trd_unit_conv_qty);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 11, $trd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 11, $trd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 11, $trd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 11, $trd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 11, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 12, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 12, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 12, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 12, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 12, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 12, $trd_unit_dec_place, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 13, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 13, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 13, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 13, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 13, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 13, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 14, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 14, $base_unit_rnd_typ, value);
	}


	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public MCNumber trd_cur_inc_tax_amt() {
		return getConstNumber(offset + 15, $trd_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 15, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 15, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 15, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 15, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 15, $trd_cur_inc_tax_amt, value);
	}


	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 16, $inc_tax_flg);
	}

	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 16, $inc_tax_flg, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 17, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 17, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 17, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 17, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 17, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 17, $tax_rate, value);
	}


	public String purc_dpt_nm() {
		return getConstString(offset + 18, $purc_dpt_nm);
	}

	public void purc_dpt_nm(String value) {
		setConstString(offset + 18, $purc_dpt_nm, value);
	}


	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public String bd_lot_mng_typ() {
		return getConstString(offset + 19, $bd_lot_mng_typ);
	}

	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public void bd_lot_mng_typ(String value) {
		setConstString(offset + 19, $bd_lot_mng_typ, value);
	}


	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public String bd_sublot_mng_typ() {
		return getConstString(offset + 20, $bd_sublot_mng_typ);
	}

	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public void bd_sublot_mng_typ(String value) {
		setConstString(offset + 20, $bd_sublot_mng_typ, value);
	}


	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public String bd_lot_no_typ() {
		return getConstString(offset + 21, $bd_lot_no_typ);
	}

	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public void bd_lot_no_typ(String value) {
		setConstString(offset + 21, $bd_lot_no_typ, value);
	}


	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public String bd_sublot_no_typ() {
		return getConstString(offset + 22, $bd_sublot_no_typ);
	}

	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public void bd_sublot_no_typ(String value) {
		setConstString(offset + 22, $bd_sublot_no_typ, value);
	}


	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public String bd_sno1_mng_typ() {
		return getConstString(offset + 23, $bd_sno1_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public void bd_sno1_mng_typ(String value) {
		setConstString(offset + 23, $bd_sno1_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public String bd_sno2_mng_typ() {
		return getConstString(offset + 24, $bd_sno2_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public void bd_sno2_mng_typ(String value) {
		setConstString(offset + 24, $bd_sno2_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public String bd_sno3_mng_typ() {
		return getConstString(offset + 25, $bd_sno3_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public void bd_sno3_mng_typ(String value) {
		setConstString(offset + 25, $bd_sno3_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public String bd_sno4_mng_typ() {
		return getConstString(offset + 26, $bd_sno4_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public void bd_sno4_mng_typ(String value) {
		setConstString(offset + 26, $bd_sno4_mng_typ, value);
	}


	public String bd_dpt_nm() {
		return getConstString(offset + 27, $bd_dpt_nm);
	}

	public void bd_dpt_nm(String value) {
		setConstString(offset + 27, $bd_dpt_nm, value);
	}


	/**
	 * Purchase invoice No. before change 変更前受領インボイスＮＯ.<p>
	 *
	 */
	public String old_rcpt_iv_no() {
		return getConstString(offset + 28, $old_rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. before change 変更前受領インボイスＮＯ.<p>
	 *
	 */
	public void old_rcpt_iv_no(String value) {
		setConstString(offset + 28, $old_rcpt_iv_no, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 29, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 29, $sppl_cd, value);
	}


	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public String purc_amt_rnd_typ() {
		return getConstString(offset + 30, $purc_amt_rnd_typ);
	}

	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public void purc_amt_rnd_typ(String value) {
		setConstString(offset + 30, $purc_amt_rnd_typ, value);
	}


	/**
	 * Tax rounding type 消費税端数処理区分.<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return getConstString(offset + 31, $purc_tax_rnd_typ);
	}

	/**
	 * Tax rounding type 消費税端数処理区分.<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		setConstString(offset + 31, $purc_tax_rnd_typ, value);
	}


	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public String in_to_id_typ() {
		return getConstString(offset + 32, $in_to_id_typ);
	}

	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public void in_to_id_typ(String value) {
		setConstString(offset + 32, $in_to_id_typ, value);
	}


	/**
	 * Delivery destination identification cd. 納入先識別ＣＤ.<p>
	 *
	 */
	public String in_to_id_cd() {
		return getConstString(offset + 33, $in_to_id_cd);
	}

	/**
	 * Delivery destination identification cd. 納入先識別ＣＤ.<p>
	 *
	 */
	public void in_to_id_cd(String value) {
		setConstString(offset + 33, $in_to_id_cd, value);
	}


	/**
	 * Delivery destination identification name 納入先識別名.<p>
	 *
	 */
	public String in_to_id_nm() {
		return getConstString(offset + 34, $in_to_id_nm);
	}

	/**
	 * Delivery destination identification name 納入先識別名.<p>
	 *
	 */
	public void in_to_id_nm(String value) {
		setConstString(offset + 34, $in_to_id_nm, value);
	}


	/**
	 * Delivery destination zip code 納入先郵便番号.<p>
	 *
	 */
	public String in_to_zip_cd() {
		return getConstString(offset + 35, $in_to_zip_cd);
	}

	/**
	 * Delivery destination zip code 納入先郵便番号.<p>
	 *
	 */
	public void in_to_zip_cd(String value) {
		setConstString(offset + 35, $in_to_zip_cd, value);
	}


	/**
	 * Delivery destination address1 納入先住所１.<p>
	 *
	 */
	public String in_to_addr1() {
		return getConstString(offset + 36, $in_to_addr1);
	}

	/**
	 * Delivery destination address1 納入先住所１.<p>
	 *
	 */
	public void in_to_addr1(String value) {
		setConstString(offset + 36, $in_to_addr1, value);
	}


	/**
	 * Delivery destination address2 納入先住所２.<p>
	 *
	 */
	public String in_to_addr2() {
		return getConstString(offset + 37, $in_to_addr2);
	}

	/**
	 * Delivery destination address2 納入先住所２.<p>
	 *
	 */
	public void in_to_addr2(String value) {
		setConstString(offset + 37, $in_to_addr2, value);
	}


	/**
	 * Delivery destination address3 納入先住所３.<p>
	 *
	 */
	public String in_to_addr3() {
		return getConstString(offset + 38, $in_to_addr3);
	}

	/**
	 * Delivery destination address3 納入先住所３.<p>
	 *
	 */
	public void in_to_addr3(String value) {
		setConstString(offset + 38, $in_to_addr3, value);
	}


	/**
	 * Delivery destination address4 納入先住所４.<p>
	 *
	 */
	public String in_to_addr4() {
		return getConstString(offset + 39, $in_to_addr4);
	}

	/**
	 * Delivery destination address4 納入先住所４.<p>
	 *
	 */
	public void in_to_addr4(String value) {
		setConstString(offset + 39, $in_to_addr4, value);
	}


	/**
	 * Delivery destination dept. 納入先部署.<p>
	 *
	 */
	public String in_to_cntct_dpt() {
		return getConstString(offset + 40, $in_to_cntct_dpt);
	}

	/**
	 * Delivery destination dept. 納入先部署.<p>
	 *
	 */
	public void in_to_cntct_dpt(String value) {
		setConstString(offset + 40, $in_to_cntct_dpt, value);
	}


	/**
	 * Delivery destination PIC 納入先担当者.<p>
	 *
	 */
	public String in_to_cntct_psn() {
		return getConstString(offset + 41, $in_to_cntct_psn);
	}

	/**
	 * Delivery destination PIC 納入先担当者.<p>
	 *
	 */
	public void in_to_cntct_psn(String value) {
		setConstString(offset + 41, $in_to_cntct_psn, value);
	}


	/**
	 * Delivery destination TEL 納入先ＴＥＬ.<p>
	 *
	 */
	public String in_to_tel() {
		return getConstString(offset + 42, $in_to_tel);
	}

	/**
	 * Delivery destination TEL 納入先ＴＥＬ.<p>
	 *
	 */
	public void in_to_tel(String value) {
		setConstString(offset + 42, $in_to_tel, value);
	}


	/**
	 * Delivery destination FAX 納入先ＦＡＸ.<p>
	 *
	 */
	public String in_to_fax() {
		return getConstString(offset + 43, $in_to_fax);
	}

	/**
	 * Delivery destination FAX 納入先ＦＡＸ.<p>
	 *
	 */
	public void in_to_fax(String value) {
		setConstString(offset + 43, $in_to_fax, value);
	}


	/**
	 * Delivery destination country cd. 納入先国ＣＤ.<p>
	 *
	 */
	public String in_to_cntry_cd() {
		return getConstString(offset + 44, $in_to_cntry_cd);
	}

	/**
	 * Delivery destination country cd. 納入先国ＣＤ.<p>
	 *
	 */
	public void in_to_cntry_cd(String value) {
		setConstString(offset + 44, $in_to_cntry_cd, value);
	}


	/**
	 * Miscellaneous delivery destination flg. 納入先諸口ＦＬＧ.<p>
	 *
	 */
	public boolean in_to_sundry_flg() {
		return getConstBoolean(offset + 45, $in_to_sundry_flg);
	}

	/**
	 * Miscellaneous delivery destination flg. 納入先諸口ＦＬＧ.<p>
	 *
	 */
	public void in_to_sundry_flg(boolean value) {
		setConstBoolean(offset + 45, $in_to_sundry_flg, value);
	}


	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 46, $tterm_cd1);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 46, $tterm_cd1, value);
	}


	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 47, $tterm_rmrks1);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 47, $tterm_rmrks1, value);
	}


	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 48, $tterm_cd2);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 48, $tterm_cd2, value);
	}


	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 49, $tterm_rmrks2);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 49, $tterm_rmrks2, value);
	}


	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 50, $tterm_cd3);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 50, $tterm_cd3, value);
	}


	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 51, $tterm_rmrks3);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 51, $tterm_rmrks3, value);
	}


	/**
	 * Customer invoice transaction flg. 得意先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 52, $cst_iv_flg);
	}

	/**
	 * Customer invoice transaction flg. 得意先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 52, $cst_iv_flg, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 53, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 53, $trd_cur_cd, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_amt_dec_place() {
		return getConstNumber(offset + 54, $trd_amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 54, $trd_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(int value) {
		setConstNumber(offset + 54, $trd_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(long value) {
		setConstNumber(offset + 54, $trd_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(float value) {
		setConstNumber(offset + 54, $trd_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(double value) {
		setConstNumber(offset + 54, $trd_amt_dec_place, value);
	}


	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_upri_dec_place() {
		return getConstNumber(offset + 55, $trd_upri_dec_place);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void trd_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 55, $trd_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void trd_upri_dec_place(int value) {
		setConstNumber(offset + 55, $trd_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void trd_upri_dec_place(long value) {
		setConstNumber(offset + 55, $trd_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void trd_upri_dec_place(float value) {
		setConstNumber(offset + 55, $trd_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void trd_upri_dec_place(double value) {
		setConstNumber(offset + 55, $trd_upri_dec_place, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 56, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 56, $mfg_inst_no, value);
	}


	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 57, $base_cur_amt);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 57, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 57, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 57, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 57, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 57, $base_cur_amt, value);
	}


	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 58, $base_cur_tax_amt);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 58, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 58, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 58, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 58, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 58, $base_cur_tax_amt, value);
	}


	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return getConstNumber(offset + 59, $ptax_cur_amt);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		setConstNumber(offset + 59, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		setConstNumber(offset + 59, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		setConstNumber(offset + 59, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		setConstNumber(offset + 59, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		setConstNumber(offset + 59, $ptax_cur_amt, value);
	}


	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public MCNumber ptax_cur_tax_amt() {
		return getConstNumber(offset + 60, $ptax_cur_tax_amt);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 60, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(int value) {
		setConstNumber(offset + 60, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(long value) {
		setConstNumber(offset + 60, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(float value) {
		setConstNumber(offset + 60, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(double value) {
		setConstNumber(offset + 60, $ptax_cur_tax_amt, value);
	}


	/**
	 * Not for purchase flg. 仕入対象外ＦＬＧ.<p>
	 *
	 */
	public boolean non_purc_flg() {
		return getConstBoolean(offset + 61, $non_purc_flg);
	}

	/**
	 * Not for purchase flg. 仕入対象外ＦＬＧ.<p>
	 *
	 */
	public void non_purc_flg(boolean value) {
		setConstBoolean(offset + 61, $non_purc_flg, value);
	}


	/**
	 * PO transaction unit cd. 発注取引単位ＣＤ.<p>
	 *
	 */
	public String po_trd_unit_cd() {
		return getConstString(offset + 62, $po_trd_unit_cd);
	}

	/**
	 * PO transaction unit cd. 発注取引単位ＣＤ.<p>
	 *
	 */
	public void po_trd_unit_cd(String value) {
		setConstString(offset + 62, $po_trd_unit_cd, value);
	}


	/**
	 * Transaction unit PO qty. 発注取引単位数量.<p>
	 *
	 */
	public MCNumber po_trd_unit_qty() {
		return getConstNumber(offset + 63, $po_trd_unit_qty);
	}

	/**
	 * Transaction unit PO qty. 発注取引単位数量.<p>
	 *
	 */
	public void po_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 63, $po_trd_unit_qty, value);
	}

	/**
	 * Transaction unit PO qty. 発注取引単位数量.<p>
	 *
	 */
	public void po_trd_unit_qty(int value) {
		setConstNumber(offset + 63, $po_trd_unit_qty, value);
	}

	/**
	 * Transaction unit PO qty. 発注取引単位数量.<p>
	 *
	 */
	public void po_trd_unit_qty(long value) {
		setConstNumber(offset + 63, $po_trd_unit_qty, value);
	}

	/**
	 * Transaction unit PO qty. 発注取引単位数量.<p>
	 *
	 */
	public void po_trd_unit_qty(float value) {
		setConstNumber(offset + 63, $po_trd_unit_qty, value);
	}

	/**
	 * Transaction unit PO qty. 発注取引単位数量.<p>
	 *
	 */
	public void po_trd_unit_qty(double value) {
		setConstNumber(offset + 63, $po_trd_unit_qty, value);
	}


	/**
	 * PO unit price 発注単価.<p>
	 *
	 */
	public MCNumber po_trd_cur_upri() {
		return getConstNumber(offset + 64, $po_trd_cur_upri);
	}

	/**
	 * PO unit price 発注単価.<p>
	 *
	 */
	public void po_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 64, $po_trd_cur_upri, value);
	}

	/**
	 * PO unit price 発注単価.<p>
	 *
	 */
	public void po_trd_cur_upri(int value) {
		setConstNumber(offset + 64, $po_trd_cur_upri, value);
	}

	/**
	 * PO unit price 発注単価.<p>
	 *
	 */
	public void po_trd_cur_upri(long value) {
		setConstNumber(offset + 64, $po_trd_cur_upri, value);
	}

	/**
	 * PO unit price 発注単価.<p>
	 *
	 */
	public void po_trd_cur_upri(float value) {
		setConstNumber(offset + 64, $po_trd_cur_upri, value);
	}

	/**
	 * PO unit price 発注単価.<p>
	 *
	 */
	public void po_trd_cur_upri(double value) {
		setConstNumber(offset + 64, $po_trd_cur_upri, value);
	}


	/**
	 * PO discount amount 発注値引額.<p>
	 *
	 */
	public MCNumber po_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 65, $po_trd_cur_dscnt_amt);
	}

	/**
	 * PO discount amount 発注値引額.<p>
	 *
	 */
	public void po_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 65, $po_trd_cur_dscnt_amt, value);
	}

	/**
	 * PO discount amount 発注値引額.<p>
	 *
	 */
	public void po_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 65, $po_trd_cur_dscnt_amt, value);
	}

	/**
	 * PO discount amount 発注値引額.<p>
	 *
	 */
	public void po_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 65, $po_trd_cur_dscnt_amt, value);
	}

	/**
	 * PO discount amount 発注値引額.<p>
	 *
	 */
	public void po_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 65, $po_trd_cur_dscnt_amt, value);
	}

	/**
	 * PO discount amount 発注値引額.<p>
	 *
	 */
	public void po_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 65, $po_trd_cur_dscnt_amt, value);
	}


	/**
	 * PO subcontracting unit price 発注加工単価.<p>
	 *
	 */
	public MCNumber po_trd_cur_proc_upri() {
		return getConstNumber(offset + 66, $po_trd_cur_proc_upri);
	}

	/**
	 * PO subcontracting unit price 発注加工単価.<p>
	 *
	 */
	public void po_trd_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 66, $po_trd_cur_proc_upri, value);
	}

	/**
	 * PO subcontracting unit price 発注加工単価.<p>
	 *
	 */
	public void po_trd_cur_proc_upri(int value) {
		setConstNumber(offset + 66, $po_trd_cur_proc_upri, value);
	}

	/**
	 * PO subcontracting unit price 発注加工単価.<p>
	 *
	 */
	public void po_trd_cur_proc_upri(long value) {
		setConstNumber(offset + 66, $po_trd_cur_proc_upri, value);
	}

	/**
	 * PO subcontracting unit price 発注加工単価.<p>
	 *
	 */
	public void po_trd_cur_proc_upri(float value) {
		setConstNumber(offset + 66, $po_trd_cur_proc_upri, value);
	}

	/**
	 * PO subcontracting unit price 発注加工単価.<p>
	 *
	 */
	public void po_trd_cur_proc_upri(double value) {
		setConstNumber(offset + 66, $po_trd_cur_proc_upri, value);
	}


	/**
	 * PO chargeable supply unit price 発注有償支給単価.<p>
	 *
	 */
	public MCNumber po_trd_cur_onr_prov_upri() {
		return getConstNumber(offset + 67, $po_trd_cur_onr_prov_upri);
	}

	/**
	 * PO chargeable supply unit price 発注有償支給単価.<p>
	 *
	 */
	public void po_trd_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 67, $po_trd_cur_onr_prov_upri, value);
	}

	/**
	 * PO chargeable supply unit price 発注有償支給単価.<p>
	 *
	 */
	public void po_trd_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 67, $po_trd_cur_onr_prov_upri, value);
	}

	/**
	 * PO chargeable supply unit price 発注有償支給単価.<p>
	 *
	 */
	public void po_trd_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 67, $po_trd_cur_onr_prov_upri, value);
	}

	/**
	 * PO chargeable supply unit price 発注有償支給単価.<p>
	 *
	 */
	public void po_trd_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 67, $po_trd_cur_onr_prov_upri, value);
	}

	/**
	 * PO chargeable supply unit price 発注有償支給単価.<p>
	 *
	 */
	public void po_trd_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 67, $po_trd_cur_onr_prov_upri, value);
	}


	/**
	 * PO amount 発注金額.<p>
	 *
	 */
	public MCNumber po_trd_cur_amt() {
		return getConstNumber(offset + 68, $po_trd_cur_amt);
	}

	/**
	 * PO amount 発注金額.<p>
	 *
	 */
	public void po_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 68, $po_trd_cur_amt, value);
	}

	/**
	 * PO amount 発注金額.<p>
	 *
	 */
	public void po_trd_cur_amt(int value) {
		setConstNumber(offset + 68, $po_trd_cur_amt, value);
	}

	/**
	 * PO amount 発注金額.<p>
	 *
	 */
	public void po_trd_cur_amt(long value) {
		setConstNumber(offset + 68, $po_trd_cur_amt, value);
	}

	/**
	 * PO amount 発注金額.<p>
	 *
	 */
	public void po_trd_cur_amt(float value) {
		setConstNumber(offset + 68, $po_trd_cur_amt, value);
	}

	/**
	 * PO amount 発注金額.<p>
	 *
	 */
	public void po_trd_cur_amt(double value) {
		setConstNumber(offset + 68, $po_trd_cur_amt, value);
	}


	/**
	 * PO subcontracting amount 発注加工金額.<p>
	 *
	 */
	public MCNumber po_trd_cur_proc_amt() {
		return getConstNumber(offset + 69, $po_trd_cur_proc_amt);
	}

	/**
	 * PO subcontracting amount 発注加工金額.<p>
	 *
	 */
	public void po_trd_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 69, $po_trd_cur_proc_amt, value);
	}

	/**
	 * PO subcontracting amount 発注加工金額.<p>
	 *
	 */
	public void po_trd_cur_proc_amt(int value) {
		setConstNumber(offset + 69, $po_trd_cur_proc_amt, value);
	}

	/**
	 * PO subcontracting amount 発注加工金額.<p>
	 *
	 */
	public void po_trd_cur_proc_amt(long value) {
		setConstNumber(offset + 69, $po_trd_cur_proc_amt, value);
	}

	/**
	 * PO subcontracting amount 発注加工金額.<p>
	 *
	 */
	public void po_trd_cur_proc_amt(float value) {
		setConstNumber(offset + 69, $po_trd_cur_proc_amt, value);
	}

	/**
	 * PO subcontracting amount 発注加工金額.<p>
	 *
	 */
	public void po_trd_cur_proc_amt(double value) {
		setConstNumber(offset + 69, $po_trd_cur_proc_amt, value);
	}


	/**
	 * PO chargeable supply amount 発注有償支給金額.<p>
	 *
	 */
	public MCNumber po_trd_cur_onr_prov_amt() {
		return getConstNumber(offset + 70, $po_trd_cur_onr_prov_amt);
	}

	/**
	 * PO chargeable supply amount 発注有償支給金額.<p>
	 *
	 */
	public void po_trd_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 70, $po_trd_cur_onr_prov_amt, value);
	}

	/**
	 * PO chargeable supply amount 発注有償支給金額.<p>
	 *
	 */
	public void po_trd_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 70, $po_trd_cur_onr_prov_amt, value);
	}

	/**
	 * PO chargeable supply amount 発注有償支給金額.<p>
	 *
	 */
	public void po_trd_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 70, $po_trd_cur_onr_prov_amt, value);
	}

	/**
	 * PO chargeable supply amount 発注有償支給金額.<p>
	 *
	 */
	public void po_trd_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 70, $po_trd_cur_onr_prov_amt, value);
	}

	/**
	 * PO chargeable supply amount 発注有償支給金額.<p>
	 *
	 */
	public void po_trd_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 70, $po_trd_cur_onr_prov_amt, value);
	}


	/**
	 * PO tax amount 発注税額.<p>
	 *
	 */
	public MCNumber po_trd_cur_tax_amt() {
		return getConstNumber(offset + 71, $po_trd_cur_tax_amt);
	}

	/**
	 * PO tax amount 発注税額.<p>
	 *
	 */
	public void po_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 71, $po_trd_cur_tax_amt, value);
	}

	/**
	 * PO tax amount 発注税額.<p>
	 *
	 */
	public void po_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 71, $po_trd_cur_tax_amt, value);
	}

	/**
	 * PO tax amount 発注税額.<p>
	 *
	 */
	public void po_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 71, $po_trd_cur_tax_amt, value);
	}

	/**
	 * PO tax amount 発注税額.<p>
	 *
	 */
	public void po_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 71, $po_trd_cur_tax_amt, value);
	}

	/**
	 * PO tax amount 発注税額.<p>
	 *
	 */
	public void po_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 71, $po_trd_cur_tax_amt, value);
	}


	/**
	 * Tax included PO amount 発注税込金額.<p>
	 *
	 */
	public MCNumber po_trd_cur_inc_ctax_amt() {
		return getConstNumber(offset + 72, $po_trd_cur_inc_ctax_amt);
	}

	/**
	 * Tax included PO amount 発注税込金額.<p>
	 *
	 */
	public void po_trd_cur_inc_ctax_amt(MCNumber value) {
		setConstNumber(offset + 72, $po_trd_cur_inc_ctax_amt, value);
	}

	/**
	 * Tax included PO amount 発注税込金額.<p>
	 *
	 */
	public void po_trd_cur_inc_ctax_amt(int value) {
		setConstNumber(offset + 72, $po_trd_cur_inc_ctax_amt, value);
	}

	/**
	 * Tax included PO amount 発注税込金額.<p>
	 *
	 */
	public void po_trd_cur_inc_ctax_amt(long value) {
		setConstNumber(offset + 72, $po_trd_cur_inc_ctax_amt, value);
	}

	/**
	 * Tax included PO amount 発注税込金額.<p>
	 *
	 */
	public void po_trd_cur_inc_ctax_amt(float value) {
		setConstNumber(offset + 72, $po_trd_cur_inc_ctax_amt, value);
	}

	/**
	 * Tax included PO amount 発注税込金額.<p>
	 *
	 */
	public void po_trd_cur_inc_ctax_amt(double value) {
		setConstNumber(offset + 72, $po_trd_cur_inc_ctax_amt, value);
	}


	/**
	 * Transaction unit PO conversion qty. 発注取引単位換算数量.<p>
	 *
	 */
	public MCNumber po_trd_unit_conv_qty() {
		return getConstNumber(offset + 73, $po_trd_unit_conv_qty);
	}

	/**
	 * Transaction unit PO conversion qty. 発注取引単位換算数量.<p>
	 *
	 */
	public void po_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 73, $po_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit PO conversion qty. 発注取引単位換算数量.<p>
	 *
	 */
	public void po_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 73, $po_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit PO conversion qty. 発注取引単位換算数量.<p>
	 *
	 */
	public void po_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 73, $po_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit PO conversion qty. 発注取引単位換算数量.<p>
	 *
	 */
	public void po_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 73, $po_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit PO conversion qty. 発注取引単位換算数量.<p>
	 *
	 */
	public void po_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 73, $po_trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit PO conversion base qty. 発注取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber po_trd_unit_conv_base_qty() {
		return getConstNumber(offset + 74, $po_trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit PO conversion base qty. 発注取引単位換算基準数量.<p>
	 *
	 */
	public void po_trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 74, $po_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit PO conversion base qty. 発注取引単位換算基準数量.<p>
	 *
	 */
	public void po_trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 74, $po_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit PO conversion base qty. 発注取引単位換算基準数量.<p>
	 *
	 */
	public void po_trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 74, $po_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit PO conversion base qty. 発注取引単位換算基準数量.<p>
	 *
	 */
	public void po_trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 74, $po_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit PO conversion base qty. 発注取引単位換算基準数量.<p>
	 *
	 */
	public void po_trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 74, $po_trd_unit_conv_base_qty, value);
	}


	/**
	 * PO WG cd. 発注ＷＧ ＣＤ.<p>
	 *
	 */
	public String po_wg_cd() {
		return getConstString(offset + 75, $po_wg_cd);
	}

	/**
	 * PO WG cd. 発注ＷＧ ＣＤ.<p>
	 *
	 */
	public void po_wg_cd(String value) {
		setConstString(offset + 75, $po_wg_cd, value);
	}


	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return getConstString(offset + 76, $arr_schd_no);
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		setConstString(offset + 76, $arr_schd_no, value);
	}


	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 77, $arr_pr_no);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 77, $arr_pr_no, value);
	}


	/**
	 * Sales order status type 受注状況区分.<p>
	 *
	 */
	public String slo_sts_typ() {
		return getConstString(offset + 78, $slo_sts_typ);
	}

	/**
	 * Sales order status type 受注状況区分.<p>
	 *
	 */
	public void slo_sts_typ(String value) {
		setConstString(offset + 78, $slo_sts_typ, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 79, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 79, $unit_cd, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 80, $qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 80, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 80, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 80, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 80, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 80, $qty, value);
	}


	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public MCNumber purc_qty() {
		return getConstNumber(offset + 81, $purc_qty);
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public void purc_qty(MCNumber value) {
		setConstNumber(offset + 81, $purc_qty, value);
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public void purc_qty(int value) {
		setConstNumber(offset + 81, $purc_qty, value);
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public void purc_qty(long value) {
		setConstNumber(offset + 81, $purc_qty, value);
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public void purc_qty(float value) {
		setConstNumber(offset + 81, $purc_qty, value);
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public void purc_qty(double value) {
		setConstNumber(offset + 81, $purc_qty, value);
	}


	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public MCNumber base_unit_accpt_dfct_qty() {
		return getConstNumber(offset + 82, $base_unit_accpt_dfct_qty);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void base_unit_accpt_dfct_qty(MCNumber value) {
		setConstNumber(offset + 82, $base_unit_accpt_dfct_qty, value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void base_unit_accpt_dfct_qty(int value) {
		setConstNumber(offset + 82, $base_unit_accpt_dfct_qty, value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void base_unit_accpt_dfct_qty(long value) {
		setConstNumber(offset + 82, $base_unit_accpt_dfct_qty, value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void base_unit_accpt_dfct_qty(float value) {
		setConstNumber(offset + 82, $base_unit_accpt_dfct_qty, value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void base_unit_accpt_dfct_qty(double value) {
		setConstNumber(offset + 82, $base_unit_accpt_dfct_qty, value);
	}


	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public MCNumber base_unit_abort_qty() {
		return getConstNumber(offset + 83, $base_unit_abort_qty);
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public void base_unit_abort_qty(MCNumber value) {
		setConstNumber(offset + 83, $base_unit_abort_qty, value);
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public void base_unit_abort_qty(int value) {
		setConstNumber(offset + 83, $base_unit_abort_qty, value);
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public void base_unit_abort_qty(long value) {
		setConstNumber(offset + 83, $base_unit_abort_qty, value);
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public void base_unit_abort_qty(float value) {
		setConstNumber(offset + 83, $base_unit_abort_qty, value);
	}

	/**
	 * Cancelled remaining purchase qty. 仕入打切数量.<p>
	 *
	 */
	public void base_unit_abort_qty(double value) {
		setConstNumber(offset + 83, $base_unit_abort_qty, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 84, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 84, $aprv_no, value);
	}


	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return getConstDate(offset + 85, $purc_schd_dt);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		setConstDate(offset + 85, $purc_schd_dt, value);
	}


	/**
	 * Unpegged 紐切れ.<p>
	 *
	 */
	public boolean rqst_can_flg() {
		return getConstBoolean(offset + 86, $rqst_can_flg);
	}

	/**
	 * Unpegged 紐切れ.<p>
	 *
	 */
	public void rqst_can_flg(boolean value) {
		setConstBoolean(offset + 86, $rqst_can_flg, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 87, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 87, $stk_mng_typ, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 88, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 88, $asset_mng_typ, value);
	}


	/**
	 * Discount item flg. 値引品ＦＬＧ.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 89, $dscnt_itm_flg);
	}

	/**
	 * Discount item flg. 値引品ＦＬＧ.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 89, $dscnt_itm_flg, value);
	}


	/**
	 * Expenses purchasing flg. 経費購買ＦＬＧ.<p>
	 *
	 */
	public boolean xpns_purc_flg() {
		return getConstBoolean(offset + 90, $xpns_purc_flg);
	}

	/**
	 * Expenses purchasing flg. 経費購買ＦＬＧ.<p>
	 *
	 */
	public void xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 90, $xpns_purc_flg, value);
	}


	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 91, $abort_flg);
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 91, $abort_flg, value);
	}


	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public boolean sync_flg() {
		return getConstBoolean(offset + 92, $sync_flg);
	}

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		setConstBoolean(offset + 92, $sync_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
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
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($bd_lot_mng_typ.equalsIgnoreCase(name)) {
			return bd_lot_mng_typ();
		}
		if ($bd_sublot_mng_typ.equalsIgnoreCase(name)) {
			return bd_sublot_mng_typ();
		}
		if ($bd_lot_no_typ.equalsIgnoreCase(name)) {
			return bd_lot_no_typ();
		}
		if ($bd_sublot_no_typ.equalsIgnoreCase(name)) {
			return bd_sublot_no_typ();
		}
		if ($bd_sno1_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno1_mng_typ();
		}
		if ($bd_sno2_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno2_mng_typ();
		}
		if ($bd_sno3_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno3_mng_typ();
		}
		if ($bd_sno4_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno4_mng_typ();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($old_rcpt_iv_no.equalsIgnoreCase(name)) {
			return old_rcpt_iv_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			return in_to_id_typ();
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			return in_to_id_cd();
		}
		if ($in_to_id_nm.equalsIgnoreCase(name)) {
			return in_to_id_nm();
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			return in_to_zip_cd();
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			return in_to_addr1();
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			return in_to_addr2();
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			return in_to_addr3();
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			return in_to_addr4();
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			return in_to_cntct_dpt();
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			return in_to_cntct_psn();
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			return in_to_tel();
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			return in_to_fax();
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			return in_to_cntry_cd();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($po_trd_unit_cd.equalsIgnoreCase(name)) {
			return po_trd_unit_cd();
		}
		if ($po_wg_cd.equalsIgnoreCase(name)) {
			return po_wg_cd();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($slo_sts_typ.equalsIgnoreCase(name)) {
			return slo_sts_typ();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_amt_dec_place();
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_upri_dec_place();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_tax_amt();
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			return po_trd_unit_qty();
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			return po_trd_cur_upri();
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_dscnt_amt();
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return po_trd_cur_proc_upri();
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return po_trd_cur_onr_prov_upri();
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_amt();
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_proc_amt();
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_onr_prov_amt();
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_tax_amt();
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_inc_ctax_amt();
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return po_trd_unit_conv_qty();
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return po_trd_unit_conv_base_qty();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			return purc_qty();
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			return base_unit_accpt_dfct_qty();
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			return base_unit_abort_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($in_to_sundry_flg.equalsIgnoreCase(name)) {
			return in_to_sundry_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($non_purc_flg.equalsIgnoreCase(name)) {
			return non_purc_flg();
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			return rqst_can_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
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
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($bd_lot_mng_typ.equalsIgnoreCase(name)) {
			return bd_lot_mng_typ();
		}
		if ($bd_sublot_mng_typ.equalsIgnoreCase(name)) {
			return bd_sublot_mng_typ();
		}
		if ($bd_lot_no_typ.equalsIgnoreCase(name)) {
			return bd_lot_no_typ();
		}
		if ($bd_sublot_no_typ.equalsIgnoreCase(name)) {
			return bd_sublot_no_typ();
		}
		if ($bd_sno1_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno1_mng_typ();
		}
		if ($bd_sno2_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno2_mng_typ();
		}
		if ($bd_sno3_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno3_mng_typ();
		}
		if ($bd_sno4_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno4_mng_typ();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($old_rcpt_iv_no.equalsIgnoreCase(name)) {
			return old_rcpt_iv_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			return in_to_id_typ();
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			return in_to_id_cd();
		}
		if ($in_to_id_nm.equalsIgnoreCase(name)) {
			return in_to_id_nm();
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			return in_to_zip_cd();
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			return in_to_addr1();
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			return in_to_addr2();
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			return in_to_addr3();
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			return in_to_addr4();
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			return in_to_cntct_dpt();
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			return in_to_cntct_psn();
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			return in_to_tel();
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			return in_to_fax();
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			return in_to_cntry_cd();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($po_trd_unit_cd.equalsIgnoreCase(name)) {
			return po_trd_unit_cd();
		}
		if ($po_wg_cd.equalsIgnoreCase(name)) {
			return po_wg_cd();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($slo_sts_typ.equalsIgnoreCase(name)) {
			return slo_sts_typ();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_amt_dec_place();
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_upri_dec_place();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_tax_amt();
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			return po_trd_unit_qty();
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			return po_trd_cur_upri();
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_dscnt_amt();
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return po_trd_cur_proc_upri();
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return po_trd_cur_onr_prov_upri();
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_amt();
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_proc_amt();
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_onr_prov_amt();
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_tax_amt();
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_inc_ctax_amt();
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return po_trd_unit_conv_qty();
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return po_trd_unit_conv_base_qty();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			return purc_qty();
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			return base_unit_accpt_dfct_qty();
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			return base_unit_abort_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($in_to_sundry_flg.equalsIgnoreCase(name)) {
			return in_to_sundry_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($non_purc_flg.equalsIgnoreCase(name)) {
			return non_purc_flg();
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			return rqst_can_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
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
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
			return;
		}
		if ($bd_lot_mng_typ.equalsIgnoreCase(name)) {
			bd_lot_mng_typ(value);
			return;
		}
		if ($bd_sublot_mng_typ.equalsIgnoreCase(name)) {
			bd_sublot_mng_typ(value);
			return;
		}
		if ($bd_lot_no_typ.equalsIgnoreCase(name)) {
			bd_lot_no_typ(value);
			return;
		}
		if ($bd_sublot_no_typ.equalsIgnoreCase(name)) {
			bd_sublot_no_typ(value);
			return;
		}
		if ($bd_sno1_mng_typ.equalsIgnoreCase(name)) {
			bd_sno1_mng_typ(value);
			return;
		}
		if ($bd_sno2_mng_typ.equalsIgnoreCase(name)) {
			bd_sno2_mng_typ(value);
			return;
		}
		if ($bd_sno3_mng_typ.equalsIgnoreCase(name)) {
			bd_sno3_mng_typ(value);
			return;
		}
		if ($bd_sno4_mng_typ.equalsIgnoreCase(name)) {
			bd_sno4_mng_typ(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($old_rcpt_iv_no.equalsIgnoreCase(name)) {
			old_rcpt_iv_no(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			in_to_id_typ(value);
			return;
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			in_to_id_cd(value);
			return;
		}
		if ($in_to_id_nm.equalsIgnoreCase(name)) {
			in_to_id_nm(value);
			return;
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			in_to_zip_cd(value);
			return;
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			in_to_addr1(value);
			return;
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			in_to_addr2(value);
			return;
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			in_to_addr3(value);
			return;
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			in_to_addr4(value);
			return;
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			in_to_cntct_dpt(value);
			return;
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			in_to_cntct_psn(value);
			return;
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			in_to_tel(value);
			return;
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			in_to_fax(value);
			return;
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			in_to_cntry_cd(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			tterm_rmrks1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($po_trd_unit_cd.equalsIgnoreCase(name)) {
			po_trd_unit_cd(value);
			return;
		}
		if ($po_wg_cd.equalsIgnoreCase(name)) {
			po_wg_cd(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($slo_sts_typ.equalsIgnoreCase(name)) {
			slo_sts_typ(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			po_trd_unit_qty(value);
			return;
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			po_trd_cur_upri(value);
			return;
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			po_trd_cur_dscnt_amt(value);
			return;
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			po_trd_cur_proc_upri(value);
			return;
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			po_trd_cur_amt(value);
			return;
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			po_trd_cur_proc_amt(value);
			return;
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_tax_amt(value);
			return;
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_inc_ctax_amt(value);
			return;
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_qty(value);
			return;
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_base_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			base_unit_abort_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			po_trd_unit_qty(value);
			return;
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			po_trd_cur_upri(value);
			return;
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			po_trd_cur_dscnt_amt(value);
			return;
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			po_trd_cur_proc_upri(value);
			return;
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			po_trd_cur_amt(value);
			return;
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			po_trd_cur_proc_amt(value);
			return;
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_tax_amt(value);
			return;
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_inc_ctax_amt(value);
			return;
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_qty(value);
			return;
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_base_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			base_unit_abort_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			po_trd_unit_qty(value);
			return;
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			po_trd_cur_upri(value);
			return;
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			po_trd_cur_dscnt_amt(value);
			return;
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			po_trd_cur_proc_upri(value);
			return;
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			po_trd_cur_amt(value);
			return;
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			po_trd_cur_proc_amt(value);
			return;
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_tax_amt(value);
			return;
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_inc_ctax_amt(value);
			return;
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_qty(value);
			return;
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_base_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			base_unit_abort_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			po_trd_unit_qty(value);
			return;
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			po_trd_cur_upri(value);
			return;
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			po_trd_cur_dscnt_amt(value);
			return;
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			po_trd_cur_proc_upri(value);
			return;
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			po_trd_cur_amt(value);
			return;
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			po_trd_cur_proc_amt(value);
			return;
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_tax_amt(value);
			return;
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_inc_ctax_amt(value);
			return;
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_qty(value);
			return;
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_base_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			base_unit_abort_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			po_trd_unit_qty(value);
			return;
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			po_trd_cur_upri(value);
			return;
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			po_trd_cur_dscnt_amt(value);
			return;
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			po_trd_cur_proc_upri(value);
			return;
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			po_trd_cur_amt(value);
			return;
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			po_trd_cur_proc_amt(value);
			return;
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_tax_amt(value);
			return;
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_inc_ctax_amt(value);
			return;
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_qty(value);
			return;
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_base_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			base_unit_abort_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($in_to_sundry_flg.equalsIgnoreCase(name)) {
			in_to_sundry_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($non_purc_flg.equalsIgnoreCase(name)) {
			non_purc_flg(value);
			return;
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			rqst_can_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
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
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
			return;
		}
		if ($bd_lot_mng_typ.equalsIgnoreCase(name)) {
			bd_lot_mng_typ(value);
			return;
		}
		if ($bd_sublot_mng_typ.equalsIgnoreCase(name)) {
			bd_sublot_mng_typ(value);
			return;
		}
		if ($bd_lot_no_typ.equalsIgnoreCase(name)) {
			bd_lot_no_typ(value);
			return;
		}
		if ($bd_sublot_no_typ.equalsIgnoreCase(name)) {
			bd_sublot_no_typ(value);
			return;
		}
		if ($bd_sno1_mng_typ.equalsIgnoreCase(name)) {
			bd_sno1_mng_typ(value);
			return;
		}
		if ($bd_sno2_mng_typ.equalsIgnoreCase(name)) {
			bd_sno2_mng_typ(value);
			return;
		}
		if ($bd_sno3_mng_typ.equalsIgnoreCase(name)) {
			bd_sno3_mng_typ(value);
			return;
		}
		if ($bd_sno4_mng_typ.equalsIgnoreCase(name)) {
			bd_sno4_mng_typ(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($old_rcpt_iv_no.equalsIgnoreCase(name)) {
			old_rcpt_iv_no(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			in_to_id_typ(value);
			return;
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			in_to_id_cd(value);
			return;
		}
		if ($in_to_id_nm.equalsIgnoreCase(name)) {
			in_to_id_nm(value);
			return;
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			in_to_zip_cd(value);
			return;
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			in_to_addr1(value);
			return;
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			in_to_addr2(value);
			return;
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			in_to_addr3(value);
			return;
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			in_to_addr4(value);
			return;
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			in_to_cntct_dpt(value);
			return;
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			in_to_cntct_psn(value);
			return;
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			in_to_tel(value);
			return;
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			in_to_fax(value);
			return;
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			in_to_cntry_cd(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			tterm_rmrks1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($po_trd_unit_cd.equalsIgnoreCase(name)) {
			po_trd_unit_cd(value);
			return;
		}
		if ($po_wg_cd.equalsIgnoreCase(name)) {
			po_wg_cd(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($slo_sts_typ.equalsIgnoreCase(name)) {
			slo_sts_typ(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			po_trd_unit_qty(value);
			return;
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			po_trd_cur_upri(value);
			return;
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			po_trd_cur_dscnt_amt(value);
			return;
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			po_trd_cur_proc_upri(value);
			return;
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			po_trd_cur_amt(value);
			return;
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			po_trd_cur_proc_amt(value);
			return;
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_tax_amt(value);
			return;
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_inc_ctax_amt(value);
			return;
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_qty(value);
			return;
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_base_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			base_unit_abort_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			po_trd_unit_qty(value);
			return;
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			po_trd_cur_upri(value);
			return;
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			po_trd_cur_dscnt_amt(value);
			return;
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			po_trd_cur_proc_upri(value);
			return;
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			po_trd_cur_amt(value);
			return;
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			po_trd_cur_proc_amt(value);
			return;
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_tax_amt(value);
			return;
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_inc_ctax_amt(value);
			return;
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_qty(value);
			return;
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_base_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			base_unit_abort_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			po_trd_unit_qty(value);
			return;
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			po_trd_cur_upri(value);
			return;
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			po_trd_cur_dscnt_amt(value);
			return;
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			po_trd_cur_proc_upri(value);
			return;
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			po_trd_cur_amt(value);
			return;
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			po_trd_cur_proc_amt(value);
			return;
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_tax_amt(value);
			return;
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_inc_ctax_amt(value);
			return;
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_qty(value);
			return;
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_base_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			base_unit_abort_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			po_trd_unit_qty(value);
			return;
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			po_trd_cur_upri(value);
			return;
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			po_trd_cur_dscnt_amt(value);
			return;
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			po_trd_cur_proc_upri(value);
			return;
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			po_trd_cur_amt(value);
			return;
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			po_trd_cur_proc_amt(value);
			return;
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_tax_amt(value);
			return;
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_inc_ctax_amt(value);
			return;
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_qty(value);
			return;
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_base_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			base_unit_abort_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			po_trd_unit_qty(value);
			return;
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			po_trd_cur_upri(value);
			return;
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			po_trd_cur_dscnt_amt(value);
			return;
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			po_trd_cur_proc_upri(value);
			return;
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			po_trd_cur_amt(value);
			return;
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			po_trd_cur_proc_amt(value);
			return;
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_tax_amt(value);
			return;
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_inc_ctax_amt(value);
			return;
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_qty(value);
			return;
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_base_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($base_unit_abort_qty.equalsIgnoreCase(name)) {
			base_unit_abort_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($in_to_sundry_flg.equalsIgnoreCase(name)) {
			in_to_sundry_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($non_purc_flg.equalsIgnoreCase(name)) {
			non_purc_flg(value);
			return;
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			rqst_can_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ivd.equalsIgnoreCase(name)) {
			return ivd();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ivd.equalsIgnoreCase(name)) {
			ivd(
				((MCContainerMeta) ivd_META).castInnerRow(mcframe.serverMS.dbc.MST_RCPT_IV_D_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Purchase invoice details No. 受領インボイス明細ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_d_no() {
		return ivd().rcpt_iv_d_no();
	}

	/**
	 * Purchase invoice details No. 受領インボイス明細ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_d_no(String value) {
		ivd().rcpt_iv_d_no(value);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return ivd().rcpt_iv_mng_no();
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		ivd().rcpt_iv_mng_no(value);
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public MCNumber rcpt_iv_rev() {
		return ivd().rcpt_iv_rev();
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(MCNumber value) {
		ivd().rcpt_iv_rev(value);
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(int value) {
		ivd().rcpt_iv_rev(value);
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(long value) {
		ivd().rcpt_iv_rev(value);
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(float value) {
		ivd().rcpt_iv_rev(value);
	}

	/**
	 * Purchase invoice rev. number 受領インボイス改訂番号.<p>
	 *
	 */
	public void rcpt_iv_rev(double value) {
		ivd().rcpt_iv_rev(value);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return ivd().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		ivd().po_no(value);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return ivd().po_d_no();
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		ivd().po_d_no(value);
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public String purc_schd_no() {
		return ivd().purc_schd_no();
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public void purc_schd_no(String value) {
		ivd().purc_schd_no(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return ivd().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		ivd().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return ivd().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		ivd().trd_ptn_typ(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return ivd().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		ivd().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return ivd().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		ivd().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return ivd().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		ivd().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return ivd().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		ivd().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return ivd().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		ivd().itm_nm(value);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return ivd().iv_itm_nm();
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		ivd().iv_itm_nm(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return ivd().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		ivd().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return ivd().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		ivd().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return ivd().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		ivd().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return ivd().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		ivd().sno4(value);
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public String purc_rsn_cd() {
		return ivd().purc_rsn_cd();
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public void purc_rsn_cd(String value) {
		ivd().purc_rsn_cd(value);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return ivd().purc_id_typ();
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		ivd().purc_id_typ(value);
	}

	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return ivd().sundry_itm_flg();
	}

	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		ivd().sundry_itm_flg(value);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return ivd().sppl_itm_cd();
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		ivd().sppl_itm_cd(value);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return ivd().sppl_itm_nm();
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		ivd().sppl_itm_nm(value);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return ivd().ap_dpt_cd();
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		ivd().ap_dpt_cd(value);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return ivd().maker_cd();
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		ivd().maker_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return ivd().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		ivd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		ivd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		ivd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		ivd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		ivd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return ivd().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		ivd().trd_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return ivd().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		ivd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		ivd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		ivd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		ivd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		ivd().base_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return ivd().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		ivd().base_unit_cd(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return ivd().trd_cur_upri();
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		ivd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		ivd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		ivd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		ivd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		ivd().trd_cur_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public MCNumber trd_cur_proc_upri() {
		return ivd().trd_cur_proc_upri();
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(MCNumber value) {
		ivd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(int value) {
		ivd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(long value) {
		ivd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(float value) {
		ivd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(double value) {
		ivd().trd_cur_proc_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_upri() {
		return ivd().trd_cur_onr_prov_upri();
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(MCNumber value) {
		ivd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(int value) {
		ivd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(long value) {
		ivd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(float value) {
		ivd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(double value) {
		ivd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Not to acquire unit price flg. 単価取得対象外ＦＬＧ.<p>
	 *
	 */
	public boolean upri_not_tgt_flg() {
		return ivd().upri_not_tgt_flg();
	}

	/**
	 * Not to acquire unit price flg. 単価取得対象外ＦＬＧ.<p>
	 *
	 */
	public void upri_not_tgt_flg(boolean value) {
		ivd().upri_not_tgt_flg(value);
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public boolean interim_flg() {
		return ivd().interim_flg();
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		ivd().interim_flg(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return ivd().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		ivd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		ivd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		ivd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		ivd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		ivd().trd_cur_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return ivd().trd_cur_proc_amt();
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		ivd().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		ivd().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		ivd().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		ivd().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		ivd().trd_cur_proc_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return ivd().trd_cur_onr_prov_amt();
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		ivd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		ivd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		ivd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		ivd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		ivd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return ivd().trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		ivd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		ivd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		ivd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		ivd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		ivd().trd_cur_tax_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return ivd().trd_cur_dscnt_amt();
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		ivd().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		ivd().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		ivd().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		ivd().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		ivd().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return ivd().dscnt_rsn_cd();
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		ivd().dscnt_rsn_cd(value);
	}

	/**
	 * Tax specified flg. 税指定ＦＬＧ.<p>
	 *
	 */
	public boolean tax_fix_flg() {
		return ivd().tax_fix_flg();
	}

	/**
	 * Tax specified flg. 税指定ＦＬＧ.<p>
	 *
	 */
	public void tax_fix_flg(boolean value) {
		ivd().tax_fix_flg(value);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return ivd().tax_cd();
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		ivd().tax_cd(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return ivd().wtax_rate();
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		ivd().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		ivd().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		ivd().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		ivd().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		ivd().wtax_rate(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return ivd().wtax_amt();
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		ivd().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		ivd().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		ivd().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		ivd().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		ivd().wtax_amt(value);
	}

	/**
	 * Manual addition flg. マニュアル追加ＦＬＧ.<p>
	 *
	 */
	public boolean manual_add_flg() {
		return ivd().manual_add_flg();
	}

	/**
	 * Manual addition flg. マニュアル追加ＦＬＧ.<p>
	 *
	 */
	public void manual_add_flg(boolean value) {
		ivd().manual_add_flg(value);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return ivd().purc_dpt_cd();
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		ivd().purc_dpt_cd(value);
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return ivd().wg_cd();
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		ivd().wg_cd(value);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return ivd().purc_usr_cd();
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		ivd().purc_usr_cd(value);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return ivd().slo_no();
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		ivd().slo_no(value);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return ivd().slo_d_no();
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		ivd().slo_d_no(value);
	}

	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public String bd_itm_cd() {
		return ivd().bd_itm_cd();
	}

	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public void bd_itm_cd(String value) {
		ivd().bd_itm_cd(value);
	}

	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public String bd_itm_sub1() {
		return ivd().bd_itm_sub1();
	}

	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public void bd_itm_sub1(String value) {
		ivd().bd_itm_sub1(value);
	}

	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public String bd_itm_sub2() {
		return ivd().bd_itm_sub2();
	}

	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public void bd_itm_sub2(String value) {
		ivd().bd_itm_sub2(value);
	}

	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public String bd_itm_sub3() {
		return ivd().bd_itm_sub3();
	}

	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public void bd_itm_sub3(String value) {
		ivd().bd_itm_sub3(value);
	}

	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public String bd_sno1() {
		return ivd().bd_sno1();
	}

	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public void bd_sno1(String value) {
		ivd().bd_sno1(value);
	}

	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public String bd_sno2() {
		return ivd().bd_sno2();
	}

	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public void bd_sno2(String value) {
		ivd().bd_sno2(value);
	}

	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public String bd_sno3() {
		return ivd().bd_sno3();
	}

	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public void bd_sno3(String value) {
		ivd().bd_sno3(value);
	}

	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public String bd_sno4() {
		return ivd().bd_sno4();
	}

	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public void bd_sno4(String value) {
		ivd().bd_sno4(value);
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public String bd_loc_cd() {
		return ivd().bd_loc_cd();
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public void bd_loc_cd(String value) {
		ivd().bd_loc_cd(value);
	}

	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public String bd_lot_no() {
		return ivd().bd_lot_no();
	}

	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public void bd_lot_no(String value) {
		ivd().bd_lot_no(value);
	}

	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public String bd_sublot_no() {
		return ivd().bd_sublot_no();
	}

	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public void bd_sublot_no(String value) {
		ivd().bd_sublot_no(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return ivd().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		ivd().bd_dpt_cd(value);
	}

	/**
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public String bd_wg_cd() {
		return ivd().bd_wg_cd();
	}

	/**
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public void bd_wg_cd(String value) {
		ivd().bd_wg_cd(value);
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public String bd_ctg_cd() {
		return ivd().bd_ctg_cd();
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public void bd_ctg_cd(String value) {
		ivd().bd_ctg_cd(value);
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public String bd_oper_cd() {
		return ivd().bd_oper_cd();
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public void bd_oper_cd(String value) {
		ivd().bd_oper_cd(value);
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public String bd_slo_no() {
		return ivd().bd_slo_no();
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public void bd_slo_no(String value) {
		ivd().bd_slo_no(value);
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public String bd_iv_no() {
		return ivd().bd_iv_no();
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public void bd_iv_no(String value) {
		ivd().bd_iv_no(value);
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public String bd_po_no() {
		return ivd().bd_po_no();
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public void bd_po_no(String value) {
		ivd().bd_po_no(value);
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public String bd_bp_cd() {
		return ivd().bd_bp_cd();
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public void bd_bp_cd(String value) {
		ivd().bd_bp_cd(value);
	}

	/**
	 * Reference order promising result received details No. 参照納期回答受領明細ＮＯ.<p>
	 *
	 */
	public String ref_prms_rcpt_d_no() {
		return ivd().ref_prms_rcpt_d_no();
	}

	/**
	 * Reference order promising result received details No. 参照納期回答受領明細ＮＯ.<p>
	 *
	 */
	public void ref_prms_rcpt_d_no(String value) {
		ivd().ref_prms_rcpt_d_no(value);
	}

	/**
	 * Reference delivery order details No. 参照納入指示明細ＮＯ.<p>
	 *
	 */
	public String ref_dlv_inst_d_no() {
		return ivd().ref_dlv_inst_d_no();
	}

	/**
	 * Reference delivery order details No. 参照納入指示明細ＮＯ.<p>
	 *
	 */
	public void ref_dlv_inst_d_no(String value) {
		ivd().ref_dlv_inst_d_no(value);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return ivd().intr_d_rmrks();
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		ivd().intr_d_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return ivd().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		ivd().trd_d_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return ivd().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		ivd().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return ivd().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		ivd().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return ivd().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		ivd().sub_char3(value);
	}

	/**
	 * Purchase invoice details remarks 受領インボイス明細備考.<p>
	 *
	 */
	public String rcpt_iv_d_rmrks() {
		return ivd().rcpt_iv_d_rmrks();
	}

	/**
	 * Purchase invoice details remarks 受領インボイス明細備考.<p>
	 *
	 */
	public void rcpt_iv_d_rmrks(String value) {
		ivd().rcpt_iv_d_rmrks(value);
	}

}

