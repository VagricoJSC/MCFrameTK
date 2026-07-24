package mcframe.clientMSBH.MSBHP0030;

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
 * ブロック"DtlApd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlApdR_MC_A extends MCConstRow {

	public static final String $itm_p = "itm_p";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public static final String $pay_mtd_typ = "pay_mtd_typ";
	/**
	 * Payment method type name 支払方式区分名.<p>
	 *
	 */
	public static final String $pay_mtd_typ_nm = "pay_mtd_typ_nm";
	public static final String $trd_cur_amt_p = "trd_cur_amt_p";
	public static final String $trd_cur_tax_amt_p = "trd_cur_tax_amt_p";
	public static final String $trd_cur_inc_tax_amt_p = "trd_cur_inc_tax_amt_p";
	public static final String $trd_cur_dscnt_amt_p = "trd_cur_dscnt_amt_p";
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public static final String $outsrc_flg = "outsrc_flg";
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public static final String $repurc_obli_flg = "repurc_obli_flg";
	public static final String $trd_cur_proc_amt_p = "trd_cur_proc_amt_p";
	public static final String $trd_cur_onr_prov_amt_p = "trd_cur_onr_prov_amt_p";
	public static final String $trd_cur_upri_p = "trd_cur_upri_p";
	public static final String $trd_cur_proc_upri_p = "trd_cur_proc_upri_p";
	public static final String $trd_cur_onr_prov_upri_p = "trd_cur_onr_prov_upri_p";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_upri_dec_place = "trd_cur_upri_dec_place";
	/**
	 * Current carry-over count 今回繰越回数.<p>
	 *
	 */
	public static final String $crryovr_times = "crryovr_times";
	/**
	 * Closing year and month after carry-over 繰越後締年月.<p>
	 *
	 */
	public static final String $co_bsppl_cl_ym = "co_bsppl_cl_ym";
	/**
	 * Closing day after carry-over 繰越後締日.<p>
	 *
	 */
	public static final String $co_bsppl_cl_day = "co_bsppl_cl_day";
	/**
	 * Closing year, month and date after carry-over 繰越後締年月日.<p>
	 *
	 */
	public static final String $co_bsppl_cl_dt = "co_bsppl_cl_dt";
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	public static final String $xrate_p = "xrate_p";
	public static final String $base_cur_amt_p = "base_cur_amt_p";
	public static final String $base_cur_tax_amt_p = "base_cur_tax_amt_p";
	public static final String $base_cur_inc_tax_amt_p = "base_cur_inc_tax_amt_p";
	public static final String $base_cur_dscnt_amt_p = "base_cur_dscnt_amt_p";
	public static final String $base_cur_proc_amt_p = "base_cur_proc_amt_p";
	public static final String $base_cur_onr_prov_amt_p = "base_cur_onr_prov_amt_p";
	public static final String $base_cur_upri_p = "base_cur_upri_p";
	public static final String $base_cur_proc_upri_p = "base_cur_proc_upri_p";
	public static final String $base_cur_onr_prov_upri_p = "base_cur_onr_prov_upri_p";
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public static final String $base_cur_amt_dec_place = "base_cur_amt_dec_place";
	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public static final String $base_cur_upri_dec_place = "base_cur_upri_dec_place";
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	public static final String $wtax_amt_p = "wtax_amt_p";
	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public static final String $bsppl_cl_day = "bsppl_cl_day";
	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public static final String $bsppl_cl_dt = "bsppl_cl_dt";
	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public static final String $pay_crryovr_times = "pay_crryovr_times";
	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public static final String $pay_basis_dt = "pay_basis_dt";
	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public static final String $pay_schd_dt = "pay_schd_dt";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public static final String $purc_tax_rnd_typ = "purc_tax_rnd_typ";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public static final String $sppl_itm_cd = "sppl_itm_cd";
	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public static final String $sppl_itm_nm = "sppl_itm_nm";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $trd_unit_rnd_typ = "trd_unit_rnd_typ";
	public static final String $trd_unit_qty_p = "trd_unit_qty_p";
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
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	public static final String $base_unit_qty_p = "base_unit_qty_p";
	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public static final String $bp_dlv_slip_no = "bp_dlv_slip_no";
	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $bp_dlv_slip_d_no = "bp_dlv_slip_d_no";
	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public static final String $act_dt = "act_dt";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public static final String $asppl_nm = "asppl_nm";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public static final String $ap_dpt_nm = "ap_dpt_nm";
	/**
	 * Carry-over 繰越分.<p>
	 *
	 */
	public static final String $crryovr_flg = "crryovr_flg";
	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public static final String $ap_typ = "ap_typ";
	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public static final String $ap_typ_nm = "ap_typ_nm";
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
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	/**
	 * Status 状況.<p>
	 *
	 */
	public static final String $slip_sts_typ_nm = "slip_sts_typ_nm";
	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public static final String $ap_d_no = "ap_d_no";
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public static final String $pay_chk_no = "pay_chk_no";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_d_no = "purc_act_d_no";
	/**
	 * Purchase I/V No. 受領Ｉ／ＶＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	/**
	 * Original AP details No. 元買掛明細ＮＯ.<p>
	 *
	 */
	public static final String $org_ap_d_no = "org_ap_d_no";
	/**
	 * Carry-over destination AP details No. 繰越先買掛明細ＮＯ.<p>
	 *
	 */
	public static final String $crryovr_ap_d_no = "crryovr_ap_d_no";
	/**
	 * Carry-over source AP details No. 繰越元買掛明細ＮＯ.<p>
	 *
	 */
	public static final String $crryovr_src_ap_d_no = "crryovr_src_ap_d_no";
	/**
	 * Transfer source payment schedule No. 振替元支払予定ＮＯ.<p>
	 *
	 */
	public static final String $sw_src_pay_schd_no = "sw_src_pay_schd_no";
	/**
	 * Transfer source counterpart invoice No. 振替元相手先請求書ＮＯ.<p>
	 *
	 */
	public static final String $sw_src_rcv_bill_no = "sw_src_rcv_bill_no";
	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public static final String $base_purc_ac_dt = "base_purc_ac_dt";
	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public static final String $pay_schd_d_print_rmrks = "pay_schd_d_print_rmrks";
	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public static final String $pay_ntc_d_print_rmrks = "pay_ntc_d_print_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
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
	 * Update counter (AP details) 更新カウンタ(買掛明細).<p>
	 *
	 */
	public static final String $ap_d_upd_cntr = "ap_d_upd_cntr";
	/**
	 * Reference AP details No. 参照買掛明細ＮＯ.<p>
	 *
	 */
	public static final String $ref_ap_d_no = "ref_ap_d_no";
	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public static final String $reg_dt = "reg_dt";
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd = "bsppl_dpt_cd";
	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public static final String $hdr_bsppl_cl_dt = "hdr_bsppl_cl_dt";
	/**
	 * Amount (Transaction currency) (Before change) 取引通貨金額(変更前).<p>
	 *
	 */
	public static final String $old_trd_cur_amt = "old_trd_cur_amt";
	/**
	 * Tax amount (Transaction currency) (Before change) 取引通貨税額(変更前).<p>
	 *
	 */
	public static final String $old_trd_cur_tax_amt = "old_trd_cur_tax_amt";
	/**
	 * Tax included amount (Transaction currency) (Before change) 取引通貨税込額(変更前).<p>
	 *
	 */
	public static final String $old_trd_cur_inc_tax_amt = "old_trd_cur_inc_tax_amt";
	/**
	 * Subcontracting amount (Transaction currency) (Before change) 取引通貨加工金額(変更前).<p>
	 *
	 */
	public static final String $old_trd_cur_proc_amt = "old_trd_cur_proc_amt";
	/**
	 * Chargeable supply amount (Transaction currency) (Before change) 取引通貨有償支給金額(変更前).<p>
	 *
	 */
	public static final String $old_trd_cur_onr_prov_amt = "old_trd_cur_onr_prov_amt";
	/**
	 * Amount (Transaction currency) (For acquiring tax variance) 取引通貨金額(消費税差額取得用).<p>
	 *
	 */
	public static final String $trd_cur_amt_tax_diff = "trd_cur_amt_tax_diff";
	/**
	 * Amount (Transaction currency) (For update) 取引通貨金額(更新用).<p>
	 *
	 */
	public static final String $up_trd_cur_amt = "up_trd_cur_amt";
	/**
	 * Tax amount (Transaction currency) (For update) 取引通貨税額(更新用).<p>
	 *
	 */
	public static final String $up_trd_cur_tax_amt = "up_trd_cur_tax_amt";
	/**
	 * Withholding tax amount (For update) 源泉税額(更新用).<p>
	 *
	 */
	public static final String $up_wtax_amt = "up_wtax_amt";
	/**
	 * Subcontracting amount (Transaction currency) (For update) 取引通貨加工金額(更新用).<p>
	 *
	 */
	public static final String $up_trd_cur_proc_amt = "up_trd_cur_proc_amt";
	/**
	 * Chargeable supply amount (Transaction currency) (For update) 取引通貨有償支給金額(更新用).<p>
	 *
	 */
	public static final String $up_trd_cur_onr_prov_amt = "up_trd_cur_onr_prov_amt";
	/**
	 * Carry-over source transaction currency amount 繰越元取引通貨金額.<p>
	 *
	 */
	public static final String $co_src_trd_cur_amt = "co_src_trd_cur_amt";
	/**
	 * Carry-over source transaction currency tax amount 繰越元取引通貨税額.<p>
	 *
	 */
	public static final String $co_src_trd_cur_tax_amt = "co_src_trd_cur_tax_amt";
	/**
	 * Carry-over source transaction currency subcontracting amount 繰越元取引通貨加工金額.<p>
	 *
	 */
	public static final String $co_src_trd_cur_proc_amt = "co_src_trd_cur_proc_amt";
	/**
	 * Carry-over source transaction currency chargeable supply amount 繰越元取引通貨有償支給金額.<p>
	 *
	 */
	public static final String $co_src_trd_cur_onr_prov_amt = "co_src_trd_cur_onr_prov_amt";
	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public static final String $amt_disp_pm = "amt_disp_pm";
	/**
	 * Add 追加.<p>
	 *
	 */
	public static final String $add_flg = "add_flg";
	/**
	 * Current chargeable supply amount 今回有償支給額.<p>
	 *
	 */
	public static final String $onr_prov_amt = "onr_prov_amt";
	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public static final String $pay_xrate = "pay_xrate";
	/**
	 * Exchange rate base date 為替レート基準日.<p>
	 *
	 */
	public static final String $xrate_base_dt = "xrate_base_dt";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $trd_cur_amt = $trd_cur_amt_p + ".amt";
	public static final String $trd_cur_tax_amt = $trd_cur_tax_amt_p + ".amt";
	public static final String $trd_cur_inc_tax_amt = $trd_cur_inc_tax_amt_p + ".amt";
	public static final String $trd_cur_dscnt_amt = $trd_cur_dscnt_amt_p + ".amt";
	public static final String $trd_cur_proc_amt = $trd_cur_proc_amt_p + ".amt";
	public static final String $trd_cur_onr_prov_amt = $trd_cur_onr_prov_amt_p + ".amt";
	public static final String $trd_cur_upri = $trd_cur_upri_p + ".upri";
	public static final String $trd_cur_proc_upri = $trd_cur_proc_upri_p + ".upri";
	public static final String $trd_cur_onr_prov_upri = $trd_cur_onr_prov_upri_p + ".upri";
	public static final String $xrate = $xrate_p + ".xrate";
	public static final String $base_cur_amt = $base_cur_amt_p + ".amt";
	public static final String $base_cur_tax_amt = $base_cur_tax_amt_p + ".amt";
	public static final String $base_cur_inc_tax_amt = $base_cur_inc_tax_amt_p + ".amt";
	public static final String $base_cur_dscnt_amt = $base_cur_dscnt_amt_p + ".amt";
	public static final String $base_cur_proc_amt = $base_cur_proc_amt_p + ".amt";
	public static final String $base_cur_onr_prov_amt = $base_cur_onr_prov_amt_p + ".amt";
	public static final String $base_cur_upri = $base_cur_upri_p + ".upri";
	public static final String $base_cur_proc_upri = $base_cur_proc_upri_p + ".upri";
	public static final String $base_cur_onr_prov_upri = $base_cur_onr_prov_upri_p + ".upri";
	public static final String $wtax_amt = $wtax_amt_p + ".amt";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $trd_unit_qty = $trd_unit_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";

	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_mtd_typ_META = createCommonMeta($pay_mtd_typ, mcframe.commonMS.meta.MS_META.PAY_MTD_TYP);
	public static final MCMeta pay_mtd_typ_nm_META = createCommonMeta($pay_mtd_typ_nm, mcframe.commonMS.meta.MS_META.PAY_MTD_TYP_NM);
	public static final MCMeta trd_cur_amt_p_META = createInnerRowMeta($trd_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta trd_cur_tax_amt_p_META = createInnerRowMeta($trd_cur_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta trd_cur_inc_tax_amt_p_META = createInnerRowMeta($trd_cur_inc_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta trd_cur_dscnt_amt_p_META = createInnerRowMeta($trd_cur_dscnt_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_proc_amt_p_META = createInnerRowMeta($trd_cur_proc_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta trd_cur_onr_prov_amt_p_META = createInnerRowMeta($trd_cur_onr_prov_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta trd_cur_upri_p_META = createInnerRowMeta($trd_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta trd_cur_proc_upri_p_META = createInnerRowMeta($trd_cur_proc_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta trd_cur_onr_prov_upri_p_META = createInnerRowMeta($trd_cur_onr_prov_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_upri_dec_place_META = createCommonMeta($trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta crryovr_times_META = createCommonMeta($crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta co_bsppl_cl_ym_META = createCommonMeta($co_bsppl_cl_ym, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta co_bsppl_cl_day_META = createCommonMeta($co_bsppl_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta co_bsppl_cl_dt_META = createCommonMeta($co_bsppl_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_p_META = createInnerRowMeta($xrate_p, mcframe.clientMAUB.MAUBP5390.XrateR.class);
	public static final MCMeta base_cur_amt_p_META = createInnerRowMeta($base_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_tax_amt_p_META = createInnerRowMeta($base_cur_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_inc_tax_amt_p_META = createInnerRowMeta($base_cur_inc_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_dscnt_amt_p_META = createInnerRowMeta($base_cur_dscnt_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_proc_amt_p_META = createInnerRowMeta($base_cur_proc_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_onr_prov_amt_p_META = createInnerRowMeta($base_cur_onr_prov_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_upri_p_META = createInnerRowMeta($base_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta base_cur_proc_upri_p_META = createInnerRowMeta($base_cur_proc_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta base_cur_onr_prov_upri_p_META = createInnerRowMeta($base_cur_onr_prov_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_amt_dec_place_META = createCommonMeta($base_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_upri_dec_place_META = createCommonMeta($base_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_p_META = createInnerRowMeta($wtax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta bsppl_cl_day_META = createCommonMeta($bsppl_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bsppl_cl_dt_META = createCommonMeta($bsppl_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_crryovr_times_META = createCommonMeta($pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta pay_basis_dt_META = createCommonMeta($pay_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_dt_META = createCommonMeta($pay_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta purc_tax_rnd_typ_META = createCommonMeta($purc_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_unit_qty_p_META = createInnerRowMeta($trd_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta bp_dlv_slip_no_META = createCommonMeta($bp_dlv_slip_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_NO);
	public static final MCMeta bp_dlv_slip_d_no_META = createCommonMeta($bp_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_D_NO);
	public static final MCMeta act_dt_META = createCommonMeta($act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_nm_META = createCommonMeta($asppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta crryovr_flg_META = createCommonMeta($crryovr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_typ_META = createCommonMeta($ap_typ, mcframe.commonMA.meta.MA_META.AP_TYP);
	public static final MCMeta ap_typ_nm_META = createCommonMeta($ap_typ_nm, mcframe.commonMA.meta.MA_META.AP_TYP_NM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta slip_sts_typ_nm_META = createCommonMeta($slip_sts_typ_nm, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP_NM);
	public static final MCMeta ap_d_no_META = createCommonMeta($ap_d_no, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta pay_chk_no_META = createCommonMeta($pay_chk_no, mcframe.commonMA.meta.MA_META.PAY_CHK_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta org_ap_d_no_META = createCommonMeta($org_ap_d_no, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta crryovr_ap_d_no_META = createCommonMeta($crryovr_ap_d_no, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta crryovr_src_ap_d_no_META = createCommonMeta($crryovr_src_ap_d_no, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta sw_src_pay_schd_no_META = createCommonMeta($sw_src_pay_schd_no, mcframe.commonMA.meta.MA_META.PAY_SCHD_NO);
	public static final MCMeta sw_src_rcv_bill_no_META = createCommonMeta($sw_src_rcv_bill_no, mcframe.commonMA.meta.MA_META.RCV_BILL_NO);
	public static final MCMeta base_purc_ac_dt_META = createCommonMeta($base_purc_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_d_print_rmrks_META = createCommonMeta($pay_schd_d_print_rmrks, mcframe.commonMS.meta.MS_META.PAY_SCHD_D_PRINT_RMRKS);
	public static final MCMeta pay_ntc_d_print_rmrks_META = createCommonMeta($pay_ntc_d_print_rmrks, mcframe.commonMS.meta.MS_META.PAY_NTC_D_PRINT_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.AP_D_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.AP_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.AP_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.AP_D_SUB_CHAR3);
	public static final MCMeta ap_d_upd_cntr_META = createCommonMeta($ap_d_upd_cntr, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ref_ap_d_no_META = createCommonMeta($ref_ap_d_no, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta reg_dt_META = createCommonMeta($reg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta hdr_bsppl_cl_dt_META = createCommonMeta($hdr_bsppl_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta old_trd_cur_amt_META = createCommonMeta($old_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_trd_cur_tax_amt_META = createCommonMeta($old_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_trd_cur_inc_tax_amt_META = createCommonMeta($old_trd_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_trd_cur_proc_amt_META = createCommonMeta($old_trd_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_trd_cur_onr_prov_amt_META = createCommonMeta($old_trd_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_tax_diff_META = createCommonMeta($trd_cur_amt_tax_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta up_trd_cur_amt_META = createCommonMeta($up_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta up_trd_cur_tax_amt_META = createCommonMeta($up_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta up_wtax_amt_META = createCommonMeta($up_wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta up_trd_cur_proc_amt_META = createCommonMeta($up_trd_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta up_trd_cur_onr_prov_amt_META = createCommonMeta($up_trd_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta co_src_trd_cur_amt_META = createCommonMeta($co_src_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta co_src_trd_cur_tax_amt_META = createCommonMeta($co_src_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta co_src_trd_cur_proc_amt_META = createCommonMeta($co_src_trd_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta co_src_trd_cur_onr_prov_amt_META = createCommonMeta($co_src_trd_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt_disp_pm_META = createCommonMeta($amt_disp_pm, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta add_flg_META = createCommonMeta($add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta onr_prov_amt_META = createCommonMeta($onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_xrate_META = createCommonMeta($pay_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xrate_base_dt_META = createCommonMeta($xrate_base_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<DtlApdR> constMetas = new ConstMetaList<DtlApdR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_p_META,
			sundry_itm_flg_META,
			pay_mtd_typ_META,
			pay_mtd_typ_nm_META,
			trd_cur_amt_p_META,
			trd_cur_tax_amt_p_META,
			trd_cur_inc_tax_amt_p_META,
			trd_cur_dscnt_amt_p_META,
			inc_tax_flg_META,
			outsrc_flg_META,
			repurc_obli_flg_META,
			trd_cur_proc_amt_p_META,
			trd_cur_onr_prov_amt_p_META,
			trd_cur_upri_p_META,
			trd_cur_proc_upri_p_META,
			trd_cur_onr_prov_upri_p_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_cur_amt_dec_place_META,
			trd_cur_upri_dec_place_META,
			crryovr_times_META,
			co_bsppl_cl_ym_META,
			co_bsppl_cl_day_META,
			co_bsppl_cl_dt_META,
			tax_cd_META,
			tax_nm_META,
			tax_rate_META,
			interim_flg_META,
			xrate_p_META,
			base_cur_amt_p_META,
			base_cur_tax_amt_p_META,
			base_cur_inc_tax_amt_p_META,
			base_cur_dscnt_amt_p_META,
			base_cur_proc_amt_p_META,
			base_cur_onr_prov_amt_p_META,
			base_cur_upri_p_META,
			base_cur_proc_upri_p_META,
			base_cur_onr_prov_upri_p_META,
			base_cur_cd_META,
			base_cur_nm_META,
			base_cur_amt_dec_place_META,
			base_cur_upri_dec_place_META,
			wtax_rate_META,
			wtax_amt_p_META,
			bsppl_cl_day_META,
			bsppl_cl_dt_META,
			pay_crryovr_times_META,
			pay_basis_dt_META,
			pay_schd_dt_META,
			sppl_cd_META,
			sppl_nm_META,
			purc_tax_rnd_typ_META,
			sno_wrk_no_p_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			trd_unit_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_qty_p_META,
			bp_dlv_slip_no_META,
			bp_dlv_slip_d_no_META,
			act_dt_META,
			ac_dt_META,
			asppl_cd_META,
			asppl_nm_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			crryovr_flg_META,
			ap_typ_META,
			ap_typ_nm_META,
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			slip_sts_typ_META,
			slip_sts_typ_nm_META,
			ap_d_no_META,
			pay_chk_no_META,
			po_no_META,
			po_d_no_META,
			purc_act_no_META,
			purc_act_d_no_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			org_ap_d_no_META,
			crryovr_ap_d_no_META,
			crryovr_src_ap_d_no_META,
			sw_src_pay_schd_no_META,
			sw_src_rcv_bill_no_META,
			base_purc_ac_dt_META,
			pay_schd_d_print_rmrks_META,
			pay_ntc_d_print_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			ap_d_upd_cntr_META,
			ref_ap_d_no_META,
			reg_dt_META,
			bsppl_cd_META,
			bsppl_dpt_cd_META,
			hdr_bsppl_cl_dt_META,
			old_trd_cur_amt_META,
			old_trd_cur_tax_amt_META,
			old_trd_cur_inc_tax_amt_META,
			old_trd_cur_proc_amt_META,
			old_trd_cur_onr_prov_amt_META,
			trd_cur_amt_tax_diff_META,
			up_trd_cur_amt_META,
			up_trd_cur_tax_amt_META,
			up_wtax_amt_META,
			up_trd_cur_proc_amt_META,
			up_trd_cur_onr_prov_amt_META,
			co_src_trd_cur_amt_META,
			co_src_trd_cur_tax_amt_META,
			co_src_trd_cur_proc_amt_META,
			co_src_trd_cur_onr_prov_amt_META,
			amt_disp_pm_META,
			add_flg_META,
			onr_prov_amt_META,
			pay_xrate_META,
			xrate_base_dt_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"trd_cur_amt",
				"trd_cur_tax_amt",
				"trd_cur_inc_tax_amt",
				"trd_cur_dscnt_amt",
				"trd_cur_proc_amt",
				"trd_cur_onr_prov_amt",
				"trd_cur_upri",
				"trd_cur_proc_upri",
				"trd_cur_onr_prov_upri",
				"xrate",
				"base_cur_amt",
				"base_cur_tax_amt",
				"base_cur_inc_tax_amt",
				"base_cur_dscnt_amt",
				"base_cur_proc_amt",
				"base_cur_onr_prov_amt",
				"base_cur_upri",
				"base_cur_proc_upri",
				"base_cur_onr_prov_upri",
				"wtax_amt",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"trd_unit_qty",
				"base_unit_qty"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$trd_cur_amt,
				$trd_cur_tax_amt,
				$trd_cur_inc_tax_amt,
				$trd_cur_dscnt_amt,
				$trd_cur_proc_amt,
				$trd_cur_onr_prov_amt,
				$trd_cur_upri,
				$trd_cur_proc_upri,
				$trd_cur_onr_prov_upri,
				$xrate,
				$base_cur_amt,
				$base_cur_tax_amt,
				$base_cur_inc_tax_amt,
				$base_cur_dscnt_amt,
				$base_cur_proc_amt,
				$base_cur_onr_prov_amt,
				$base_cur_upri,
				$base_cur_proc_upri,
				$base_cur_onr_prov_upri,
				$wtax_amt,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$trd_unit_qty,
				$base_unit_qty
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
				{$pay_mtd_typ, "pay_mtd_typ_nm"},	// pay_mtd_typ
				{$tax_cd, "tax_nm;tax_rate;inc_tax_flg"},	// tax_cd
				{$sppl_cd, "bp_nm;purc_tax_rnd_typ"},	// sppl_cd
				{$trd_unit_cd, "unit_nm;dec_place;rnd_typ"},	// trd_unit_cd
				{$base_unit_cd, "unit_nm;dec_place;rnd_typ"},	// base_unit_cd
				{$asppl_cd, "bp_nm"},	// asppl_cd
				{$ap_dpt_cd, "dpt_nm"},	// ap_dpt_cd
				{$trd_cd, "trd_nm"}	// trd_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL;reg_dt"},	// sppl_cd
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$base_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// base_unit_cd
				{$asppl_cd, "MAC_BP_IS_SRCH_TYP.ASPPL;ac_dt"},	// asppl_cd
				{$ap_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP;ac_dt"}	// ap_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$sppl_cd, "bp_is_srch_typ;dt"},	// sppl_cd
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$base_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// base_unit_cd
				{$asppl_cd, "bp_is_srch_typ;dt"},	// asppl_cd
				{$ap_dpt_cd, "dpt_is_srch_typ;dt"}	// ap_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$xrate_p + ".xrate", "BASE_CUR"},	// xrate_p.xrate
				{$base_cur_amt_p + ".amt", "BASE_CUR"},	// base_cur_amt_p.amt
				{$base_cur_tax_amt_p + ".amt", "BASE_CUR"},	// base_cur_tax_amt_p.amt
				{$base_cur_inc_tax_amt_p + ".amt", "BASE_CUR"},	// base_cur_inc_tax_amt_p.amt
				{$base_cur_dscnt_amt_p + ".amt", "BASE_CUR"},	// base_cur_dscnt_amt_p.amt
				{$base_cur_proc_amt_p + ".amt", "BASE_CUR"},	// base_cur_proc_amt_p.amt
				{$base_cur_onr_prov_amt_p + ".amt", "BASE_CUR"},	// base_cur_onr_prov_amt_p.amt
				{$base_cur_upri_p + ".upri", "BASE_CUR"},	// base_cur_upri_p.upri
				{$base_cur_proc_upri_p + ".upri", "BASE_CUR"},	// base_cur_proc_upri_p.upri
				{$base_cur_onr_prov_upri_p + ".upri", "BASE_CUR"},	// base_cur_onr_prov_upri_p.upri
				{$base_cur_cd, "BASE_CUR"},	// base_cur_cd
				{$base_cur_nm, "BASE_CUR"},	// base_cur_nm
				{$base_cur_amt_dec_place, "BASE_CUR"},	// base_cur_amt_dec_place
				{$base_cur_upri_dec_place, "BASE_CUR"},	// base_cur_upri_dec_place
				{$wtax_rate, "WTAX"},	// wtax_rate
				{$wtax_amt_p + ".amt", "WTAX"},	// wtax_amt_p.amt
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_rnd_typ, "BASE_UNIT"},	// base_unit_rnd_typ
				{$base_unit_qty_p + ".qty", "BASE_UNIT"}	// base_unit_qty_p.qty
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
	protected DtlApdR_MC_A(ConstMetaList<? extends DtlApdR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlApdR clone() {
		return (DtlApdR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlApdR createInstance() {
		return (DtlApdR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlApdR getValues(String... names) {
		return (DtlApdR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 0, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 0, $itm_p, row);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 1, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 1, $sundry_itm_flg, value);
	}


	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public String pay_mtd_typ() {
		return getConstString(offset + 2, $pay_mtd_typ);
	}

	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public void pay_mtd_typ(String value) {
		setConstString(offset + 2, $pay_mtd_typ, value);
	}


	/**
	 * Payment method type name 支払方式区分名.<p>
	 *
	 */
	public String pay_mtd_typ_nm() {
		return getConstString(offset + 3, $pay_mtd_typ_nm);
	}

	/**
	 * Payment method type name 支払方式区分名.<p>
	 *
	 */
	public void pay_mtd_typ_nm(String value) {
		setConstString(offset + 3, $pay_mtd_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 4, $trd_cur_amt_p);
	}
	
	public void trd_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 4, $trd_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 5, $trd_cur_tax_amt_p);
	}
	
	public void trd_cur_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 5, $trd_cur_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 6, $trd_cur_inc_tax_amt_p);
	}
	
	public void trd_cur_inc_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 6, $trd_cur_inc_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_dscnt_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 7, $trd_cur_dscnt_amt_p);
	}
	
	public void trd_cur_dscnt_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 7, $trd_cur_dscnt_amt_p, row);
	}


	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 8, $inc_tax_flg);
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 8, $inc_tax_flg, value);
	}


	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return getConstBoolean(offset + 9, $outsrc_flg);
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		setConstBoolean(offset + 9, $outsrc_flg, value);
	}


	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 10, $repurc_obli_flg);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 10, $repurc_obli_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_proc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 11, $trd_cur_proc_amt_p);
	}
	
	public void trd_cur_proc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 11, $trd_cur_proc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_onr_prov_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 12, $trd_cur_onr_prov_amt_p);
	}
	
	public void trd_cur_onr_prov_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 12, $trd_cur_onr_prov_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR trd_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 13, $trd_cur_upri_p);
	}
	
	public void trd_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 13, $trd_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR trd_cur_proc_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 14, $trd_cur_proc_upri_p);
	}
	
	public void trd_cur_proc_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 14, $trd_cur_proc_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR trd_cur_onr_prov_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 15, $trd_cur_onr_prov_upri_p);
	}
	
	public void trd_cur_onr_prov_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 15, $trd_cur_onr_prov_upri_p, row);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 16, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 16, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 17, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 17, $trd_cur_nm, value);
	}


	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 18, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 18, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 18, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 18, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 18, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 18, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_upri_dec_place() {
		return getConstNumber(offset + 19, $trd_cur_upri_dec_place);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 19, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 19, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 19, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 19, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 19, $trd_cur_upri_dec_place, value);
	}


	/**
	 * Current carry-over count 今回繰越回数.<p>
	 *
	 */
	public MCNumber crryovr_times() {
		return getConstNumber(offset + 20, $crryovr_times);
	}

	/**
	 * Current carry-over count 今回繰越回数.<p>
	 *
	 */
	public void crryovr_times(MCNumber value) {
		setConstNumber(offset + 20, $crryovr_times, value);
	}

	/**
	 * Current carry-over count 今回繰越回数.<p>
	 *
	 */
	public void crryovr_times(int value) {
		setConstNumber(offset + 20, $crryovr_times, value);
	}

	/**
	 * Current carry-over count 今回繰越回数.<p>
	 *
	 */
	public void crryovr_times(long value) {
		setConstNumber(offset + 20, $crryovr_times, value);
	}

	/**
	 * Current carry-over count 今回繰越回数.<p>
	 *
	 */
	public void crryovr_times(float value) {
		setConstNumber(offset + 20, $crryovr_times, value);
	}

	/**
	 * Current carry-over count 今回繰越回数.<p>
	 *
	 */
	public void crryovr_times(double value) {
		setConstNumber(offset + 20, $crryovr_times, value);
	}


	/**
	 * Closing year and month after carry-over 繰越後締年月.<p>
	 *
	 */
	public MCDate co_bsppl_cl_ym() {
		return getConstDate(offset + 21, $co_bsppl_cl_ym);
	}

	/**
	 * Closing year and month after carry-over 繰越後締年月.<p>
	 *
	 */
	public void co_bsppl_cl_ym(MCDate value) {
		setConstDate(offset + 21, $co_bsppl_cl_ym, value);
	}


	/**
	 * Closing day after carry-over 繰越後締日.<p>
	 *
	 */
	public MCNumber co_bsppl_cl_day() {
		return getConstNumber(offset + 22, $co_bsppl_cl_day);
	}

	/**
	 * Closing day after carry-over 繰越後締日.<p>
	 *
	 */
	public void co_bsppl_cl_day(MCNumber value) {
		setConstNumber(offset + 22, $co_bsppl_cl_day, value);
	}

	/**
	 * Closing day after carry-over 繰越後締日.<p>
	 *
	 */
	public void co_bsppl_cl_day(int value) {
		setConstNumber(offset + 22, $co_bsppl_cl_day, value);
	}

	/**
	 * Closing day after carry-over 繰越後締日.<p>
	 *
	 */
	public void co_bsppl_cl_day(long value) {
		setConstNumber(offset + 22, $co_bsppl_cl_day, value);
	}

	/**
	 * Closing day after carry-over 繰越後締日.<p>
	 *
	 */
	public void co_bsppl_cl_day(float value) {
		setConstNumber(offset + 22, $co_bsppl_cl_day, value);
	}

	/**
	 * Closing day after carry-over 繰越後締日.<p>
	 *
	 */
	public void co_bsppl_cl_day(double value) {
		setConstNumber(offset + 22, $co_bsppl_cl_day, value);
	}


	/**
	 * Closing year, month and date after carry-over 繰越後締年月日.<p>
	 *
	 */
	public MCDate co_bsppl_cl_dt() {
		return getConstDate(offset + 23, $co_bsppl_cl_dt);
	}

	/**
	 * Closing year, month and date after carry-over 繰越後締年月日.<p>
	 *
	 */
	public void co_bsppl_cl_dt(MCDate value) {
		setConstDate(offset + 23, $co_bsppl_cl_dt, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 24, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 24, $tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 25, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 25, $tax_nm, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 26, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 26, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 26, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 26, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 26, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 26, $tax_rate, value);
	}


	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 27, $interim_flg);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 27, $interim_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5390.XrateR xrate_p(){
		return (mcframe.clientMAUB.MAUBP5390.XrateR) getConstInnerRow(offset + 28, $xrate_p);
	}
	
	public void xrate_p(mcframe.clientMAUB.MAUBP5390.XrateR row){
		setConstInnerRow(offset + 28, $xrate_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 29, $base_cur_amt_p);
	}
	
	public void base_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 29, $base_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 30, $base_cur_tax_amt_p);
	}
	
	public void base_cur_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 30, $base_cur_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 31, $base_cur_inc_tax_amt_p);
	}
	
	public void base_cur_inc_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 31, $base_cur_inc_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_dscnt_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 32, $base_cur_dscnt_amt_p);
	}
	
	public void base_cur_dscnt_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 32, $base_cur_dscnt_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_proc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 33, $base_cur_proc_amt_p);
	}
	
	public void base_cur_proc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 33, $base_cur_proc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_onr_prov_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 34, $base_cur_onr_prov_amt_p);
	}
	
	public void base_cur_onr_prov_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 34, $base_cur_onr_prov_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR base_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 35, $base_cur_upri_p);
	}
	
	public void base_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 35, $base_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR base_cur_proc_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 36, $base_cur_proc_upri_p);
	}
	
	public void base_cur_proc_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 36, $base_cur_proc_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR base_cur_onr_prov_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 37, $base_cur_onr_prov_upri_p);
	}
	
	public void base_cur_onr_prov_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 37, $base_cur_onr_prov_upri_p, row);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 38, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 38, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 39, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 39, $base_cur_nm, value);
	}


	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_amt_dec_place() {
		return getConstNumber(offset + 40, $base_cur_amt_dec_place);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 40, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(int value) {
		setConstNumber(offset + 40, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(long value) {
		setConstNumber(offset + 40, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(float value) {
		setConstNumber(offset + 40, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(double value) {
		setConstNumber(offset + 40, $base_cur_amt_dec_place, value);
	}


	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_upri_dec_place() {
		return getConstNumber(offset + 41, $base_cur_upri_dec_place);
	}

	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 41, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(int value) {
		setConstNumber(offset + 41, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(long value) {
		setConstNumber(offset + 41, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(float value) {
		setConstNumber(offset + 41, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(double value) {
		setConstNumber(offset + 41, $base_cur_upri_dec_place, value);
	}


	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 42, $wtax_rate);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 42, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 42, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 42, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 42, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 42, $wtax_rate, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR wtax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 43, $wtax_amt_p);
	}
	
	public void wtax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 43, $wtax_amt_p, row);
	}


	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public MCNumber bsppl_cl_day() {
		return getConstNumber(offset + 44, $bsppl_cl_day);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(MCNumber value) {
		setConstNumber(offset + 44, $bsppl_cl_day, value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(int value) {
		setConstNumber(offset + 44, $bsppl_cl_day, value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(long value) {
		setConstNumber(offset + 44, $bsppl_cl_day, value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(float value) {
		setConstNumber(offset + 44, $bsppl_cl_day, value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(double value) {
		setConstNumber(offset + 44, $bsppl_cl_day, value);
	}


	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public MCDate bsppl_cl_dt() {
		return getConstDate(offset + 45, $bsppl_cl_dt);
	}

	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public void bsppl_cl_dt(MCDate value) {
		setConstDate(offset + 45, $bsppl_cl_dt, value);
	}


	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return getConstNumber(offset + 46, $pay_crryovr_times);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 46, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		setConstNumber(offset + 46, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		setConstNumber(offset + 46, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		setConstNumber(offset + 46, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		setConstNumber(offset + 46, $pay_crryovr_times, value);
	}


	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public MCDate pay_basis_dt() {
		return getConstDate(offset + 47, $pay_basis_dt);
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public void pay_basis_dt(MCDate value) {
		setConstDate(offset + 47, $pay_basis_dt, value);
	}


	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return getConstDate(offset + 48, $pay_schd_dt);
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		setConstDate(offset + 48, $pay_schd_dt, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 49, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 49, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 50, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 50, $sppl_nm, value);
	}


	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return getConstString(offset + 51, $purc_tax_rnd_typ);
	}

	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		setConstString(offset + 51, $purc_tax_rnd_typ, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 52, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 52, $sno_wrk_no_p, row);
	}


	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 53, $sppl_itm_cd);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 53, $sppl_itm_cd, value);
	}


	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 54, $sppl_itm_nm);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 54, $sppl_itm_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 55, $trd_unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 55, $trd_unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 56, $trd_unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 56, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 57, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 57, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 57, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 57, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 57, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 57, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 58, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 58, $trd_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 59, $trd_unit_qty_p);
	}
	
	public void trd_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 59, $trd_unit_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 60, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 60, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 61, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 61, $base_unit_nm, value);
	}


	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 62, $base_unit_dec_place);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 62, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 62, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 62, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 62, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 62, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 63, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 63, $base_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 64, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 64, $base_unit_qty_p, row);
	}


	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return getConstString(offset + 65, $bp_dlv_slip_no);
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		setConstString(offset + 65, $bp_dlv_slip_no, value);
	}


	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_d_no() {
		return getConstString(offset + 66, $bp_dlv_slip_d_no);
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no(String value) {
		setConstString(offset + 66, $bp_dlv_slip_d_no, value);
	}


	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public MCDate act_dt() {
		return getConstDate(offset + 67, $act_dt);
	}

	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public void act_dt(MCDate value) {
		setConstDate(offset + 67, $act_dt, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 68, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 68, $ac_dt, value);
	}


	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 69, $asppl_cd);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 69, $asppl_cd, value);
	}


	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public String asppl_nm() {
		return getConstString(offset + 70, $asppl_nm);
	}

	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public void asppl_nm(String value) {
		setConstString(offset + 70, $asppl_nm, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 71, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 71, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 72, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 72, $ap_dpt_nm, value);
	}


	/**
	 * Carry-over 繰越分.<p>
	 *
	 */
	public boolean crryovr_flg() {
		return getConstBoolean(offset + 73, $crryovr_flg);
	}

	/**
	 * Carry-over 繰越分.<p>
	 *
	 */
	public void crryovr_flg(boolean value) {
		setConstBoolean(offset + 73, $crryovr_flg, value);
	}


	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public String ap_typ() {
		return getConstString(offset + 74, $ap_typ);
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public void ap_typ(String value) {
		setConstString(offset + 74, $ap_typ, value);
	}


	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public String ap_typ_nm() {
		return getConstString(offset + 75, $ap_typ_nm);
	}

	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public void ap_typ_nm(String value) {
		setConstString(offset + 75, $ap_typ_nm, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 76, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 76, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 77, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 77, $trd_nm, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 78, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 78, $trd_ptn_typ, value);
	}


	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 79, $slip_sts_typ);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 79, $slip_sts_typ, value);
	}


	/**
	 * Status 状況.<p>
	 *
	 */
	public String slip_sts_typ_nm() {
		return getConstString(offset + 80, $slip_sts_typ_nm);
	}

	/**
	 * Status 状況.<p>
	 *
	 */
	public void slip_sts_typ_nm(String value) {
		setConstString(offset + 80, $slip_sts_typ_nm, value);
	}


	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public String ap_d_no() {
		return getConstString(offset + 81, $ap_d_no);
	}

	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public void ap_d_no(String value) {
		setConstString(offset + 81, $ap_d_no, value);
	}


	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public String pay_chk_no() {
		return getConstString(offset + 82, $pay_chk_no);
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no(String value) {
		setConstString(offset + 82, $pay_chk_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 83, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 83, $po_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 84, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 84, $po_d_no, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 85, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 85, $purc_act_no, value);
	}


	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 86, $purc_act_d_no);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 86, $purc_act_d_no, value);
	}


	/**
	 * Purchase I/V No. 受領Ｉ／ＶＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 87, $rcpt_iv_no);
	}

	/**
	 * Purchase I/V No. 受領Ｉ／ＶＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 87, $rcpt_iv_no, value);
	}


	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 88, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 88, $rcpt_iv_mng_no, value);
	}


	/**
	 * Original AP details No. 元買掛明細ＮＯ.<p>
	 *
	 */
	public String org_ap_d_no() {
		return getConstString(offset + 89, $org_ap_d_no);
	}

	/**
	 * Original AP details No. 元買掛明細ＮＯ.<p>
	 *
	 */
	public void org_ap_d_no(String value) {
		setConstString(offset + 89, $org_ap_d_no, value);
	}


	/**
	 * Carry-over destination AP details No. 繰越先買掛明細ＮＯ.<p>
	 *
	 */
	public String crryovr_ap_d_no() {
		return getConstString(offset + 90, $crryovr_ap_d_no);
	}

	/**
	 * Carry-over destination AP details No. 繰越先買掛明細ＮＯ.<p>
	 *
	 */
	public void crryovr_ap_d_no(String value) {
		setConstString(offset + 90, $crryovr_ap_d_no, value);
	}


	/**
	 * Carry-over source AP details No. 繰越元買掛明細ＮＯ.<p>
	 *
	 */
	public String crryovr_src_ap_d_no() {
		return getConstString(offset + 91, $crryovr_src_ap_d_no);
	}

	/**
	 * Carry-over source AP details No. 繰越元買掛明細ＮＯ.<p>
	 *
	 */
	public void crryovr_src_ap_d_no(String value) {
		setConstString(offset + 91, $crryovr_src_ap_d_no, value);
	}


	/**
	 * Transfer source payment schedule No. 振替元支払予定ＮＯ.<p>
	 *
	 */
	public String sw_src_pay_schd_no() {
		return getConstString(offset + 92, $sw_src_pay_schd_no);
	}

	/**
	 * Transfer source payment schedule No. 振替元支払予定ＮＯ.<p>
	 *
	 */
	public void sw_src_pay_schd_no(String value) {
		setConstString(offset + 92, $sw_src_pay_schd_no, value);
	}


	/**
	 * Transfer source counterpart invoice No. 振替元相手先請求書ＮＯ.<p>
	 *
	 */
	public String sw_src_rcv_bill_no() {
		return getConstString(offset + 93, $sw_src_rcv_bill_no);
	}

	/**
	 * Transfer source counterpart invoice No. 振替元相手先請求書ＮＯ.<p>
	 *
	 */
	public void sw_src_rcv_bill_no(String value) {
		setConstString(offset + 93, $sw_src_rcv_bill_no, value);
	}


	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public MCDate base_purc_ac_dt() {
		return getConstDate(offset + 94, $base_purc_ac_dt);
	}

	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public void base_purc_ac_dt(MCDate value) {
		setConstDate(offset + 94, $base_purc_ac_dt, value);
	}


	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public String pay_schd_d_print_rmrks() {
		return getConstString(offset + 95, $pay_schd_d_print_rmrks);
	}

	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public void pay_schd_d_print_rmrks(String value) {
		setConstString(offset + 95, $pay_schd_d_print_rmrks, value);
	}


	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public String pay_ntc_d_print_rmrks() {
		return getConstString(offset + 96, $pay_ntc_d_print_rmrks);
	}

	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public void pay_ntc_d_print_rmrks(String value) {
		setConstString(offset + 96, $pay_ntc_d_print_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 97, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 97, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 98, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 98, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 99, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 99, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 100, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 100, $sub_char3, value);
	}


	/**
	 * Update counter (AP details) 更新カウンタ(買掛明細).<p>
	 *
	 */
	public MCNumber ap_d_upd_cntr() {
		return getConstNumber(offset + 101, $ap_d_upd_cntr);
	}

	/**
	 * Update counter (AP details) 更新カウンタ(買掛明細).<p>
	 *
	 */
	public void ap_d_upd_cntr(MCNumber value) {
		setConstNumber(offset + 101, $ap_d_upd_cntr, value);
	}

	/**
	 * Update counter (AP details) 更新カウンタ(買掛明細).<p>
	 *
	 */
	public void ap_d_upd_cntr(int value) {
		setConstNumber(offset + 101, $ap_d_upd_cntr, value);
	}

	/**
	 * Update counter (AP details) 更新カウンタ(買掛明細).<p>
	 *
	 */
	public void ap_d_upd_cntr(long value) {
		setConstNumber(offset + 101, $ap_d_upd_cntr, value);
	}

	/**
	 * Update counter (AP details) 更新カウンタ(買掛明細).<p>
	 *
	 */
	public void ap_d_upd_cntr(float value) {
		setConstNumber(offset + 101, $ap_d_upd_cntr, value);
	}

	/**
	 * Update counter (AP details) 更新カウンタ(買掛明細).<p>
	 *
	 */
	public void ap_d_upd_cntr(double value) {
		setConstNumber(offset + 101, $ap_d_upd_cntr, value);
	}


	/**
	 * Reference AP details No. 参照買掛明細ＮＯ.<p>
	 *
	 */
	public String ref_ap_d_no() {
		return getConstString(offset + 102, $ref_ap_d_no);
	}

	/**
	 * Reference AP details No. 参照買掛明細ＮＯ.<p>
	 *
	 */
	public void ref_ap_d_no(String value) {
		setConstString(offset + 102, $ref_ap_d_no, value);
	}


	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCDate reg_dt() {
		return getConstDate(offset + 103, $reg_dt);
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public void reg_dt(MCDate value) {
		setConstDate(offset + 103, $reg_dt, value);
	}


	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 104, $bsppl_cd);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 104, $bsppl_cd, value);
	}


	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 105, $bsppl_dpt_cd);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 105, $bsppl_dpt_cd, value);
	}


	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public MCDate hdr_bsppl_cl_dt() {
		return getConstDate(offset + 106, $hdr_bsppl_cl_dt);
	}

	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public void hdr_bsppl_cl_dt(MCDate value) {
		setConstDate(offset + 106, $hdr_bsppl_cl_dt, value);
	}


	/**
	 * Amount (Transaction currency) (Before change) 取引通貨金額(変更前).<p>
	 *
	 */
	public MCNumber old_trd_cur_amt() {
		return getConstNumber(offset + 107, $old_trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) (Before change) 取引通貨金額(変更前).<p>
	 *
	 */
	public void old_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 107, $old_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) (Before change) 取引通貨金額(変更前).<p>
	 *
	 */
	public void old_trd_cur_amt(int value) {
		setConstNumber(offset + 107, $old_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) (Before change) 取引通貨金額(変更前).<p>
	 *
	 */
	public void old_trd_cur_amt(long value) {
		setConstNumber(offset + 107, $old_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) (Before change) 取引通貨金額(変更前).<p>
	 *
	 */
	public void old_trd_cur_amt(float value) {
		setConstNumber(offset + 107, $old_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) (Before change) 取引通貨金額(変更前).<p>
	 *
	 */
	public void old_trd_cur_amt(double value) {
		setConstNumber(offset + 107, $old_trd_cur_amt, value);
	}


	/**
	 * Tax amount (Transaction currency) (Before change) 取引通貨税額(変更前).<p>
	 *
	 */
	public MCNumber old_trd_cur_tax_amt() {
		return getConstNumber(offset + 108, $old_trd_cur_tax_amt);
	}

	/**
	 * Tax amount (Transaction currency) (Before change) 取引通貨税額(変更前).<p>
	 *
	 */
	public void old_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 108, $old_trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) (Before change) 取引通貨税額(変更前).<p>
	 *
	 */
	public void old_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 108, $old_trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) (Before change) 取引通貨税額(変更前).<p>
	 *
	 */
	public void old_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 108, $old_trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) (Before change) 取引通貨税額(変更前).<p>
	 *
	 */
	public void old_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 108, $old_trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) (Before change) 取引通貨税額(変更前).<p>
	 *
	 */
	public void old_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 108, $old_trd_cur_tax_amt, value);
	}


	/**
	 * Tax included amount (Transaction currency) (Before change) 取引通貨税込額(変更前).<p>
	 *
	 */
	public MCNumber old_trd_cur_inc_tax_amt() {
		return getConstNumber(offset + 109, $old_trd_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Transaction currency) (Before change) 取引通貨税込額(変更前).<p>
	 *
	 */
	public void old_trd_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 109, $old_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) (Before change) 取引通貨税込額(変更前).<p>
	 *
	 */
	public void old_trd_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 109, $old_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) (Before change) 取引通貨税込額(変更前).<p>
	 *
	 */
	public void old_trd_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 109, $old_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) (Before change) 取引通貨税込額(変更前).<p>
	 *
	 */
	public void old_trd_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 109, $old_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) (Before change) 取引通貨税込額(変更前).<p>
	 *
	 */
	public void old_trd_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 109, $old_trd_cur_inc_tax_amt, value);
	}


	/**
	 * Subcontracting amount (Transaction currency) (Before change) 取引通貨加工金額(変更前).<p>
	 *
	 */
	public MCNumber old_trd_cur_proc_amt() {
		return getConstNumber(offset + 110, $old_trd_cur_proc_amt);
	}

	/**
	 * Subcontracting amount (Transaction currency) (Before change) 取引通貨加工金額(変更前).<p>
	 *
	 */
	public void old_trd_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 110, $old_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) (Before change) 取引通貨加工金額(変更前).<p>
	 *
	 */
	public void old_trd_cur_proc_amt(int value) {
		setConstNumber(offset + 110, $old_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) (Before change) 取引通貨加工金額(変更前).<p>
	 *
	 */
	public void old_trd_cur_proc_amt(long value) {
		setConstNumber(offset + 110, $old_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) (Before change) 取引通貨加工金額(変更前).<p>
	 *
	 */
	public void old_trd_cur_proc_amt(float value) {
		setConstNumber(offset + 110, $old_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) (Before change) 取引通貨加工金額(変更前).<p>
	 *
	 */
	public void old_trd_cur_proc_amt(double value) {
		setConstNumber(offset + 110, $old_trd_cur_proc_amt, value);
	}


	/**
	 * Chargeable supply amount (Transaction currency) (Before change) 取引通貨有償支給金額(変更前).<p>
	 *
	 */
	public MCNumber old_trd_cur_onr_prov_amt() {
		return getConstNumber(offset + 111, $old_trd_cur_onr_prov_amt);
	}

	/**
	 * Chargeable supply amount (Transaction currency) (Before change) 取引通貨有償支給金額(変更前).<p>
	 *
	 */
	public void old_trd_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 111, $old_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) (Before change) 取引通貨有償支給金額(変更前).<p>
	 *
	 */
	public void old_trd_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 111, $old_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) (Before change) 取引通貨有償支給金額(変更前).<p>
	 *
	 */
	public void old_trd_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 111, $old_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) (Before change) 取引通貨有償支給金額(変更前).<p>
	 *
	 */
	public void old_trd_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 111, $old_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) (Before change) 取引通貨有償支給金額(変更前).<p>
	 *
	 */
	public void old_trd_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 111, $old_trd_cur_onr_prov_amt, value);
	}


	/**
	 * Amount (Transaction currency) (For acquiring tax variance) 取引通貨金額(消費税差額取得用).<p>
	 *
	 */
	public MCNumber trd_cur_amt_tax_diff() {
		return getConstNumber(offset + 112, $trd_cur_amt_tax_diff);
	}

	/**
	 * Amount (Transaction currency) (For acquiring tax variance) 取引通貨金額(消費税差額取得用).<p>
	 *
	 */
	public void trd_cur_amt_tax_diff(MCNumber value) {
		setConstNumber(offset + 112, $trd_cur_amt_tax_diff, value);
	}

	/**
	 * Amount (Transaction currency) (For acquiring tax variance) 取引通貨金額(消費税差額取得用).<p>
	 *
	 */
	public void trd_cur_amt_tax_diff(int value) {
		setConstNumber(offset + 112, $trd_cur_amt_tax_diff, value);
	}

	/**
	 * Amount (Transaction currency) (For acquiring tax variance) 取引通貨金額(消費税差額取得用).<p>
	 *
	 */
	public void trd_cur_amt_tax_diff(long value) {
		setConstNumber(offset + 112, $trd_cur_amt_tax_diff, value);
	}

	/**
	 * Amount (Transaction currency) (For acquiring tax variance) 取引通貨金額(消費税差額取得用).<p>
	 *
	 */
	public void trd_cur_amt_tax_diff(float value) {
		setConstNumber(offset + 112, $trd_cur_amt_tax_diff, value);
	}

	/**
	 * Amount (Transaction currency) (For acquiring tax variance) 取引通貨金額(消費税差額取得用).<p>
	 *
	 */
	public void trd_cur_amt_tax_diff(double value) {
		setConstNumber(offset + 112, $trd_cur_amt_tax_diff, value);
	}


	/**
	 * Amount (Transaction currency) (For update) 取引通貨金額(更新用).<p>
	 *
	 */
	public MCNumber up_trd_cur_amt() {
		return getConstNumber(offset + 113, $up_trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) (For update) 取引通貨金額(更新用).<p>
	 *
	 */
	public void up_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 113, $up_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) (For update) 取引通貨金額(更新用).<p>
	 *
	 */
	public void up_trd_cur_amt(int value) {
		setConstNumber(offset + 113, $up_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) (For update) 取引通貨金額(更新用).<p>
	 *
	 */
	public void up_trd_cur_amt(long value) {
		setConstNumber(offset + 113, $up_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) (For update) 取引通貨金額(更新用).<p>
	 *
	 */
	public void up_trd_cur_amt(float value) {
		setConstNumber(offset + 113, $up_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) (For update) 取引通貨金額(更新用).<p>
	 *
	 */
	public void up_trd_cur_amt(double value) {
		setConstNumber(offset + 113, $up_trd_cur_amt, value);
	}


	/**
	 * Tax amount (Transaction currency) (For update) 取引通貨税額(更新用).<p>
	 *
	 */
	public MCNumber up_trd_cur_tax_amt() {
		return getConstNumber(offset + 114, $up_trd_cur_tax_amt);
	}

	/**
	 * Tax amount (Transaction currency) (For update) 取引通貨税額(更新用).<p>
	 *
	 */
	public void up_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 114, $up_trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) (For update) 取引通貨税額(更新用).<p>
	 *
	 */
	public void up_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 114, $up_trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) (For update) 取引通貨税額(更新用).<p>
	 *
	 */
	public void up_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 114, $up_trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) (For update) 取引通貨税額(更新用).<p>
	 *
	 */
	public void up_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 114, $up_trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) (For update) 取引通貨税額(更新用).<p>
	 *
	 */
	public void up_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 114, $up_trd_cur_tax_amt, value);
	}


	/**
	 * Withholding tax amount (For update) 源泉税額(更新用).<p>
	 *
	 */
	public MCNumber up_wtax_amt() {
		return getConstNumber(offset + 115, $up_wtax_amt);
	}

	/**
	 * Withholding tax amount (For update) 源泉税額(更新用).<p>
	 *
	 */
	public void up_wtax_amt(MCNumber value) {
		setConstNumber(offset + 115, $up_wtax_amt, value);
	}

	/**
	 * Withholding tax amount (For update) 源泉税額(更新用).<p>
	 *
	 */
	public void up_wtax_amt(int value) {
		setConstNumber(offset + 115, $up_wtax_amt, value);
	}

	/**
	 * Withholding tax amount (For update) 源泉税額(更新用).<p>
	 *
	 */
	public void up_wtax_amt(long value) {
		setConstNumber(offset + 115, $up_wtax_amt, value);
	}

	/**
	 * Withholding tax amount (For update) 源泉税額(更新用).<p>
	 *
	 */
	public void up_wtax_amt(float value) {
		setConstNumber(offset + 115, $up_wtax_amt, value);
	}

	/**
	 * Withholding tax amount (For update) 源泉税額(更新用).<p>
	 *
	 */
	public void up_wtax_amt(double value) {
		setConstNumber(offset + 115, $up_wtax_amt, value);
	}


	/**
	 * Subcontracting amount (Transaction currency) (For update) 取引通貨加工金額(更新用).<p>
	 *
	 */
	public MCNumber up_trd_cur_proc_amt() {
		return getConstNumber(offset + 116, $up_trd_cur_proc_amt);
	}

	/**
	 * Subcontracting amount (Transaction currency) (For update) 取引通貨加工金額(更新用).<p>
	 *
	 */
	public void up_trd_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 116, $up_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) (For update) 取引通貨加工金額(更新用).<p>
	 *
	 */
	public void up_trd_cur_proc_amt(int value) {
		setConstNumber(offset + 116, $up_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) (For update) 取引通貨加工金額(更新用).<p>
	 *
	 */
	public void up_trd_cur_proc_amt(long value) {
		setConstNumber(offset + 116, $up_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) (For update) 取引通貨加工金額(更新用).<p>
	 *
	 */
	public void up_trd_cur_proc_amt(float value) {
		setConstNumber(offset + 116, $up_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) (For update) 取引通貨加工金額(更新用).<p>
	 *
	 */
	public void up_trd_cur_proc_amt(double value) {
		setConstNumber(offset + 116, $up_trd_cur_proc_amt, value);
	}


	/**
	 * Chargeable supply amount (Transaction currency) (For update) 取引通貨有償支給金額(更新用).<p>
	 *
	 */
	public MCNumber up_trd_cur_onr_prov_amt() {
		return getConstNumber(offset + 117, $up_trd_cur_onr_prov_amt);
	}

	/**
	 * Chargeable supply amount (Transaction currency) (For update) 取引通貨有償支給金額(更新用).<p>
	 *
	 */
	public void up_trd_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 117, $up_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) (For update) 取引通貨有償支給金額(更新用).<p>
	 *
	 */
	public void up_trd_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 117, $up_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) (For update) 取引通貨有償支給金額(更新用).<p>
	 *
	 */
	public void up_trd_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 117, $up_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) (For update) 取引通貨有償支給金額(更新用).<p>
	 *
	 */
	public void up_trd_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 117, $up_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) (For update) 取引通貨有償支給金額(更新用).<p>
	 *
	 */
	public void up_trd_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 117, $up_trd_cur_onr_prov_amt, value);
	}


	/**
	 * Carry-over source transaction currency amount 繰越元取引通貨金額.<p>
	 *
	 */
	public MCNumber co_src_trd_cur_amt() {
		return getConstNumber(offset + 118, $co_src_trd_cur_amt);
	}

	/**
	 * Carry-over source transaction currency amount 繰越元取引通貨金額.<p>
	 *
	 */
	public void co_src_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 118, $co_src_trd_cur_amt, value);
	}

	/**
	 * Carry-over source transaction currency amount 繰越元取引通貨金額.<p>
	 *
	 */
	public void co_src_trd_cur_amt(int value) {
		setConstNumber(offset + 118, $co_src_trd_cur_amt, value);
	}

	/**
	 * Carry-over source transaction currency amount 繰越元取引通貨金額.<p>
	 *
	 */
	public void co_src_trd_cur_amt(long value) {
		setConstNumber(offset + 118, $co_src_trd_cur_amt, value);
	}

	/**
	 * Carry-over source transaction currency amount 繰越元取引通貨金額.<p>
	 *
	 */
	public void co_src_trd_cur_amt(float value) {
		setConstNumber(offset + 118, $co_src_trd_cur_amt, value);
	}

	/**
	 * Carry-over source transaction currency amount 繰越元取引通貨金額.<p>
	 *
	 */
	public void co_src_trd_cur_amt(double value) {
		setConstNumber(offset + 118, $co_src_trd_cur_amt, value);
	}


	/**
	 * Carry-over source transaction currency tax amount 繰越元取引通貨税額.<p>
	 *
	 */
	public MCNumber co_src_trd_cur_tax_amt() {
		return getConstNumber(offset + 119, $co_src_trd_cur_tax_amt);
	}

	/**
	 * Carry-over source transaction currency tax amount 繰越元取引通貨税額.<p>
	 *
	 */
	public void co_src_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 119, $co_src_trd_cur_tax_amt, value);
	}

	/**
	 * Carry-over source transaction currency tax amount 繰越元取引通貨税額.<p>
	 *
	 */
	public void co_src_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 119, $co_src_trd_cur_tax_amt, value);
	}

	/**
	 * Carry-over source transaction currency tax amount 繰越元取引通貨税額.<p>
	 *
	 */
	public void co_src_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 119, $co_src_trd_cur_tax_amt, value);
	}

	/**
	 * Carry-over source transaction currency tax amount 繰越元取引通貨税額.<p>
	 *
	 */
	public void co_src_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 119, $co_src_trd_cur_tax_amt, value);
	}

	/**
	 * Carry-over source transaction currency tax amount 繰越元取引通貨税額.<p>
	 *
	 */
	public void co_src_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 119, $co_src_trd_cur_tax_amt, value);
	}


	/**
	 * Carry-over source transaction currency subcontracting amount 繰越元取引通貨加工金額.<p>
	 *
	 */
	public MCNumber co_src_trd_cur_proc_amt() {
		return getConstNumber(offset + 120, $co_src_trd_cur_proc_amt);
	}

	/**
	 * Carry-over source transaction currency subcontracting amount 繰越元取引通貨加工金額.<p>
	 *
	 */
	public void co_src_trd_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 120, $co_src_trd_cur_proc_amt, value);
	}

	/**
	 * Carry-over source transaction currency subcontracting amount 繰越元取引通貨加工金額.<p>
	 *
	 */
	public void co_src_trd_cur_proc_amt(int value) {
		setConstNumber(offset + 120, $co_src_trd_cur_proc_amt, value);
	}

	/**
	 * Carry-over source transaction currency subcontracting amount 繰越元取引通貨加工金額.<p>
	 *
	 */
	public void co_src_trd_cur_proc_amt(long value) {
		setConstNumber(offset + 120, $co_src_trd_cur_proc_amt, value);
	}

	/**
	 * Carry-over source transaction currency subcontracting amount 繰越元取引通貨加工金額.<p>
	 *
	 */
	public void co_src_trd_cur_proc_amt(float value) {
		setConstNumber(offset + 120, $co_src_trd_cur_proc_amt, value);
	}

	/**
	 * Carry-over source transaction currency subcontracting amount 繰越元取引通貨加工金額.<p>
	 *
	 */
	public void co_src_trd_cur_proc_amt(double value) {
		setConstNumber(offset + 120, $co_src_trd_cur_proc_amt, value);
	}


	/**
	 * Carry-over source transaction currency chargeable supply amount 繰越元取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber co_src_trd_cur_onr_prov_amt() {
		return getConstNumber(offset + 121, $co_src_trd_cur_onr_prov_amt);
	}

	/**
	 * Carry-over source transaction currency chargeable supply amount 繰越元取引通貨有償支給金額.<p>
	 *
	 */
	public void co_src_trd_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 121, $co_src_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Carry-over source transaction currency chargeable supply amount 繰越元取引通貨有償支給金額.<p>
	 *
	 */
	public void co_src_trd_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 121, $co_src_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Carry-over source transaction currency chargeable supply amount 繰越元取引通貨有償支給金額.<p>
	 *
	 */
	public void co_src_trd_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 121, $co_src_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Carry-over source transaction currency chargeable supply amount 繰越元取引通貨有償支給金額.<p>
	 *
	 */
	public void co_src_trd_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 121, $co_src_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Carry-over source transaction currency chargeable supply amount 繰越元取引通貨有償支給金額.<p>
	 *
	 */
	public void co_src_trd_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 121, $co_src_trd_cur_onr_prov_amt, value);
	}


	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public MCNumber amt_disp_pm() {
		return getConstNumber(offset + 122, $amt_disp_pm);
	}

	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public void amt_disp_pm(MCNumber value) {
		setConstNumber(offset + 122, $amt_disp_pm, value);
	}

	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public void amt_disp_pm(int value) {
		setConstNumber(offset + 122, $amt_disp_pm, value);
	}

	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public void amt_disp_pm(long value) {
		setConstNumber(offset + 122, $amt_disp_pm, value);
	}

	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public void amt_disp_pm(float value) {
		setConstNumber(offset + 122, $amt_disp_pm, value);
	}

	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public void amt_disp_pm(double value) {
		setConstNumber(offset + 122, $amt_disp_pm, value);
	}


	/**
	 * Add 追加.<p>
	 *
	 */
	public boolean add_flg() {
		return getConstBoolean(offset + 123, $add_flg);
	}

	/**
	 * Add 追加.<p>
	 *
	 */
	public void add_flg(boolean value) {
		setConstBoolean(offset + 123, $add_flg, value);
	}


	/**
	 * Current chargeable supply amount 今回有償支給額.<p>
	 *
	 */
	public MCNumber onr_prov_amt() {
		return getConstNumber(offset + 124, $onr_prov_amt);
	}

	/**
	 * Current chargeable supply amount 今回有償支給額.<p>
	 *
	 */
	public void onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 124, $onr_prov_amt, value);
	}

	/**
	 * Current chargeable supply amount 今回有償支給額.<p>
	 *
	 */
	public void onr_prov_amt(int value) {
		setConstNumber(offset + 124, $onr_prov_amt, value);
	}

	/**
	 * Current chargeable supply amount 今回有償支給額.<p>
	 *
	 */
	public void onr_prov_amt(long value) {
		setConstNumber(offset + 124, $onr_prov_amt, value);
	}

	/**
	 * Current chargeable supply amount 今回有償支給額.<p>
	 *
	 */
	public void onr_prov_amt(float value) {
		setConstNumber(offset + 124, $onr_prov_amt, value);
	}

	/**
	 * Current chargeable supply amount 今回有償支給額.<p>
	 *
	 */
	public void onr_prov_amt(double value) {
		setConstNumber(offset + 124, $onr_prov_amt, value);
	}


	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public MCNumber pay_xrate() {
		return getConstNumber(offset + 125, $pay_xrate);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(MCNumber value) {
		setConstNumber(offset + 125, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(int value) {
		setConstNumber(offset + 125, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(long value) {
		setConstNumber(offset + 125, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(float value) {
		setConstNumber(offset + 125, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(double value) {
		setConstNumber(offset + 125, $pay_xrate, value);
	}


	/**
	 * Exchange rate base date 為替レート基準日.<p>
	 *
	 */
	public MCDate xrate_base_dt() {
		return getConstDate(offset + 126, $xrate_base_dt);
	}

	/**
	 * Exchange rate base date 為替レート基準日.<p>
	 *
	 */
	public void xrate_base_dt(MCDate value) {
		setConstDate(offset + 126, $xrate_base_dt, value);
	}


	public String getString(String name) {
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			return pay_mtd_typ();
		}
		if ($pay_mtd_typ_nm.equalsIgnoreCase(name)) {
			return pay_mtd_typ_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
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
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_d_no();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			return ap_typ_nm();
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
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($ap_d_no.equalsIgnoreCase(name)) {
			return ap_d_no();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($org_ap_d_no.equalsIgnoreCase(name)) {
			return org_ap_d_no();
		}
		if ($crryovr_ap_d_no.equalsIgnoreCase(name)) {
			return crryovr_ap_d_no();
		}
		if ($crryovr_src_ap_d_no.equalsIgnoreCase(name)) {
			return crryovr_src_ap_d_no();
		}
		if ($sw_src_pay_schd_no.equalsIgnoreCase(name)) {
			return sw_src_pay_schd_no();
		}
		if ($sw_src_rcv_bill_no.equalsIgnoreCase(name)) {
			return sw_src_rcv_bill_no();
		}
		if ($pay_schd_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_schd_d_print_rmrks();
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_ntc_d_print_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($ref_ap_d_no.equalsIgnoreCase(name)) {
			return ref_ap_d_no();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($crryovr_times.equalsIgnoreCase(name)) {
			return crryovr_times();
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			return co_bsppl_cl_day();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return base_cur_upri_dec_place();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			return bsppl_cl_day();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($ap_d_upd_cntr.equalsIgnoreCase(name)) {
			return ap_d_upd_cntr();
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			return old_trd_cur_amt();
		}
		if ($old_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return old_trd_cur_tax_amt();
		}
		if ($old_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return old_trd_cur_inc_tax_amt();
		}
		if ($old_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return old_trd_cur_proc_amt();
		}
		if ($old_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return old_trd_cur_onr_prov_amt();
		}
		if ($trd_cur_amt_tax_diff.equalsIgnoreCase(name)) {
			return trd_cur_amt_tax_diff();
		}
		if ($up_trd_cur_amt.equalsIgnoreCase(name)) {
			return up_trd_cur_amt();
		}
		if ($up_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return up_trd_cur_tax_amt();
		}
		if ($up_wtax_amt.equalsIgnoreCase(name)) {
			return up_wtax_amt();
		}
		if ($up_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return up_trd_cur_proc_amt();
		}
		if ($up_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return up_trd_cur_onr_prov_amt();
		}
		if ($co_src_trd_cur_amt.equalsIgnoreCase(name)) {
			return co_src_trd_cur_amt();
		}
		if ($co_src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return co_src_trd_cur_tax_amt();
		}
		if ($co_src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return co_src_trd_cur_proc_amt();
		}
		if ($co_src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return co_src_trd_cur_onr_prov_amt();
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			return amt_disp_pm();
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			return onr_prov_amt();
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			return pay_xrate();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($co_bsppl_cl_ym.equalsIgnoreCase(name)) {
			return co_bsppl_cl_ym();
		}
		if ($co_bsppl_cl_dt.equalsIgnoreCase(name)) {
			return co_bsppl_cl_dt();
		}
		if ($bsppl_cl_dt.equalsIgnoreCase(name)) {
			return bsppl_cl_dt();
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			return pay_basis_dt();
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($act_dt.equalsIgnoreCase(name)) {
			return act_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			return base_purc_ac_dt();
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			return reg_dt();
		}
		if ($hdr_bsppl_cl_dt.equalsIgnoreCase(name)) {
			return hdr_bsppl_cl_dt();
		}
		if ($xrate_base_dt.equalsIgnoreCase(name)) {
			return xrate_base_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($crryovr_flg.equalsIgnoreCase(name)) {
			return crryovr_flg();
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			return add_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			return pay_mtd_typ();
		}
		if ($pay_mtd_typ_nm.equalsIgnoreCase(name)) {
			return pay_mtd_typ_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
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
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_d_no();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			return ap_typ_nm();
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
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($ap_d_no.equalsIgnoreCase(name)) {
			return ap_d_no();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($org_ap_d_no.equalsIgnoreCase(name)) {
			return org_ap_d_no();
		}
		if ($crryovr_ap_d_no.equalsIgnoreCase(name)) {
			return crryovr_ap_d_no();
		}
		if ($crryovr_src_ap_d_no.equalsIgnoreCase(name)) {
			return crryovr_src_ap_d_no();
		}
		if ($sw_src_pay_schd_no.equalsIgnoreCase(name)) {
			return sw_src_pay_schd_no();
		}
		if ($sw_src_rcv_bill_no.equalsIgnoreCase(name)) {
			return sw_src_rcv_bill_no();
		}
		if ($pay_schd_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_schd_d_print_rmrks();
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_ntc_d_print_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($ref_ap_d_no.equalsIgnoreCase(name)) {
			return ref_ap_d_no();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($crryovr_times.equalsIgnoreCase(name)) {
			return crryovr_times();
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			return co_bsppl_cl_day();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return base_cur_upri_dec_place();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			return bsppl_cl_day();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($ap_d_upd_cntr.equalsIgnoreCase(name)) {
			return ap_d_upd_cntr();
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			return old_trd_cur_amt();
		}
		if ($old_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return old_trd_cur_tax_amt();
		}
		if ($old_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return old_trd_cur_inc_tax_amt();
		}
		if ($old_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return old_trd_cur_proc_amt();
		}
		if ($old_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return old_trd_cur_onr_prov_amt();
		}
		if ($trd_cur_amt_tax_diff.equalsIgnoreCase(name)) {
			return trd_cur_amt_tax_diff();
		}
		if ($up_trd_cur_amt.equalsIgnoreCase(name)) {
			return up_trd_cur_amt();
		}
		if ($up_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return up_trd_cur_tax_amt();
		}
		if ($up_wtax_amt.equalsIgnoreCase(name)) {
			return up_wtax_amt();
		}
		if ($up_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return up_trd_cur_proc_amt();
		}
		if ($up_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return up_trd_cur_onr_prov_amt();
		}
		if ($co_src_trd_cur_amt.equalsIgnoreCase(name)) {
			return co_src_trd_cur_amt();
		}
		if ($co_src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return co_src_trd_cur_tax_amt();
		}
		if ($co_src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return co_src_trd_cur_proc_amt();
		}
		if ($co_src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return co_src_trd_cur_onr_prov_amt();
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			return amt_disp_pm();
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			return onr_prov_amt();
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			return pay_xrate();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($co_bsppl_cl_ym.equalsIgnoreCase(name)) {
			return co_bsppl_cl_ym();
		}
		if ($co_bsppl_cl_dt.equalsIgnoreCase(name)) {
			return co_bsppl_cl_dt();
		}
		if ($bsppl_cl_dt.equalsIgnoreCase(name)) {
			return bsppl_cl_dt();
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			return pay_basis_dt();
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($act_dt.equalsIgnoreCase(name)) {
			return act_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			return base_purc_ac_dt();
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			return reg_dt();
		}
		if ($hdr_bsppl_cl_dt.equalsIgnoreCase(name)) {
			return hdr_bsppl_cl_dt();
		}
		if ($xrate_base_dt.equalsIgnoreCase(name)) {
			return xrate_base_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($crryovr_flg.equalsIgnoreCase(name)) {
			return crryovr_flg();
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			return add_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			pay_mtd_typ(value);
			return;
		}
		if ($pay_mtd_typ_nm.equalsIgnoreCase(name)) {
			pay_mtd_typ_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
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
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_no(value);
			return;
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_d_no(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			ap_typ_nm(value);
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
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
			return;
		}
		if ($ap_d_no.equalsIgnoreCase(name)) {
			ap_d_no(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($org_ap_d_no.equalsIgnoreCase(name)) {
			org_ap_d_no(value);
			return;
		}
		if ($crryovr_ap_d_no.equalsIgnoreCase(name)) {
			crryovr_ap_d_no(value);
			return;
		}
		if ($crryovr_src_ap_d_no.equalsIgnoreCase(name)) {
			crryovr_src_ap_d_no(value);
			return;
		}
		if ($sw_src_pay_schd_no.equalsIgnoreCase(name)) {
			sw_src_pay_schd_no(value);
			return;
		}
		if ($sw_src_rcv_bill_no.equalsIgnoreCase(name)) {
			sw_src_rcv_bill_no(value);
			return;
		}
		if ($pay_schd_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_schd_d_print_rmrks(value);
			return;
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_ntc_d_print_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($ref_ap_d_no.equalsIgnoreCase(name)) {
			ref_ap_d_no(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($crryovr_times.equalsIgnoreCase(name)) {
			crryovr_times(value);
			return;
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			co_bsppl_cl_day(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($ap_d_upd_cntr.equalsIgnoreCase(name)) {
			ap_d_upd_cntr(value);
			return;
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			old_trd_cur_amt(value);
			return;
		}
		if ($old_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			old_trd_cur_tax_amt(value);
			return;
		}
		if ($old_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			old_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($old_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			old_trd_cur_proc_amt(value);
			return;
		}
		if ($old_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_amt_tax_diff.equalsIgnoreCase(name)) {
			trd_cur_amt_tax_diff(value);
			return;
		}
		if ($up_trd_cur_amt.equalsIgnoreCase(name)) {
			up_trd_cur_amt(value);
			return;
		}
		if ($up_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			up_trd_cur_tax_amt(value);
			return;
		}
		if ($up_wtax_amt.equalsIgnoreCase(name)) {
			up_wtax_amt(value);
			return;
		}
		if ($up_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			up_trd_cur_proc_amt(value);
			return;
		}
		if ($up_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			up_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($co_src_trd_cur_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_amt(value);
			return;
		}
		if ($co_src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_tax_amt(value);
			return;
		}
		if ($co_src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_proc_amt(value);
			return;
		}
		if ($co_src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($crryovr_times.equalsIgnoreCase(name)) {
			crryovr_times(value);
			return;
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			co_bsppl_cl_day(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($ap_d_upd_cntr.equalsIgnoreCase(name)) {
			ap_d_upd_cntr(value);
			return;
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			old_trd_cur_amt(value);
			return;
		}
		if ($old_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			old_trd_cur_tax_amt(value);
			return;
		}
		if ($old_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			old_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($old_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			old_trd_cur_proc_amt(value);
			return;
		}
		if ($old_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_amt_tax_diff.equalsIgnoreCase(name)) {
			trd_cur_amt_tax_diff(value);
			return;
		}
		if ($up_trd_cur_amt.equalsIgnoreCase(name)) {
			up_trd_cur_amt(value);
			return;
		}
		if ($up_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			up_trd_cur_tax_amt(value);
			return;
		}
		if ($up_wtax_amt.equalsIgnoreCase(name)) {
			up_wtax_amt(value);
			return;
		}
		if ($up_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			up_trd_cur_proc_amt(value);
			return;
		}
		if ($up_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			up_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($co_src_trd_cur_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_amt(value);
			return;
		}
		if ($co_src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_tax_amt(value);
			return;
		}
		if ($co_src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_proc_amt(value);
			return;
		}
		if ($co_src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($crryovr_times.equalsIgnoreCase(name)) {
			crryovr_times(value);
			return;
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			co_bsppl_cl_day(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($ap_d_upd_cntr.equalsIgnoreCase(name)) {
			ap_d_upd_cntr(value);
			return;
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			old_trd_cur_amt(value);
			return;
		}
		if ($old_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			old_trd_cur_tax_amt(value);
			return;
		}
		if ($old_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			old_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($old_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			old_trd_cur_proc_amt(value);
			return;
		}
		if ($old_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_amt_tax_diff.equalsIgnoreCase(name)) {
			trd_cur_amt_tax_diff(value);
			return;
		}
		if ($up_trd_cur_amt.equalsIgnoreCase(name)) {
			up_trd_cur_amt(value);
			return;
		}
		if ($up_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			up_trd_cur_tax_amt(value);
			return;
		}
		if ($up_wtax_amt.equalsIgnoreCase(name)) {
			up_wtax_amt(value);
			return;
		}
		if ($up_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			up_trd_cur_proc_amt(value);
			return;
		}
		if ($up_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			up_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($co_src_trd_cur_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_amt(value);
			return;
		}
		if ($co_src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_tax_amt(value);
			return;
		}
		if ($co_src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_proc_amt(value);
			return;
		}
		if ($co_src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($crryovr_times.equalsIgnoreCase(name)) {
			crryovr_times(value);
			return;
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			co_bsppl_cl_day(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($ap_d_upd_cntr.equalsIgnoreCase(name)) {
			ap_d_upd_cntr(value);
			return;
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			old_trd_cur_amt(value);
			return;
		}
		if ($old_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			old_trd_cur_tax_amt(value);
			return;
		}
		if ($old_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			old_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($old_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			old_trd_cur_proc_amt(value);
			return;
		}
		if ($old_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_amt_tax_diff.equalsIgnoreCase(name)) {
			trd_cur_amt_tax_diff(value);
			return;
		}
		if ($up_trd_cur_amt.equalsIgnoreCase(name)) {
			up_trd_cur_amt(value);
			return;
		}
		if ($up_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			up_trd_cur_tax_amt(value);
			return;
		}
		if ($up_wtax_amt.equalsIgnoreCase(name)) {
			up_wtax_amt(value);
			return;
		}
		if ($up_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			up_trd_cur_proc_amt(value);
			return;
		}
		if ($up_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			up_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($co_src_trd_cur_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_amt(value);
			return;
		}
		if ($co_src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_tax_amt(value);
			return;
		}
		if ($co_src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_proc_amt(value);
			return;
		}
		if ($co_src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($crryovr_times.equalsIgnoreCase(name)) {
			crryovr_times(value);
			return;
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			co_bsppl_cl_day(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($ap_d_upd_cntr.equalsIgnoreCase(name)) {
			ap_d_upd_cntr(value);
			return;
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			old_trd_cur_amt(value);
			return;
		}
		if ($old_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			old_trd_cur_tax_amt(value);
			return;
		}
		if ($old_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			old_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($old_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			old_trd_cur_proc_amt(value);
			return;
		}
		if ($old_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_amt_tax_diff.equalsIgnoreCase(name)) {
			trd_cur_amt_tax_diff(value);
			return;
		}
		if ($up_trd_cur_amt.equalsIgnoreCase(name)) {
			up_trd_cur_amt(value);
			return;
		}
		if ($up_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			up_trd_cur_tax_amt(value);
			return;
		}
		if ($up_wtax_amt.equalsIgnoreCase(name)) {
			up_wtax_amt(value);
			return;
		}
		if ($up_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			up_trd_cur_proc_amt(value);
			return;
		}
		if ($up_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			up_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($co_src_trd_cur_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_amt(value);
			return;
		}
		if ($co_src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_tax_amt(value);
			return;
		}
		if ($co_src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_proc_amt(value);
			return;
		}
		if ($co_src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($co_bsppl_cl_ym.equalsIgnoreCase(name)) {
			co_bsppl_cl_ym(value);
			return;
		}
		if ($co_bsppl_cl_dt.equalsIgnoreCase(name)) {
			co_bsppl_cl_dt(value);
			return;
		}
		if ($bsppl_cl_dt.equalsIgnoreCase(name)) {
			bsppl_cl_dt(value);
			return;
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			pay_basis_dt(value);
			return;
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		if ($act_dt.equalsIgnoreCase(name)) {
			act_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			base_purc_ac_dt(value);
			return;
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			reg_dt(value);
			return;
		}
		if ($hdr_bsppl_cl_dt.equalsIgnoreCase(name)) {
			hdr_bsppl_cl_dt(value);
			return;
		}
		if ($xrate_base_dt.equalsIgnoreCase(name)) {
			xrate_base_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($crryovr_flg.equalsIgnoreCase(name)) {
			crryovr_flg(value);
			return;
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			add_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			pay_mtd_typ(value);
			return;
		}
		if ($pay_mtd_typ_nm.equalsIgnoreCase(name)) {
			pay_mtd_typ_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
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
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_no(value);
			return;
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_d_no(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			ap_typ_nm(value);
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
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
			return;
		}
		if ($ap_d_no.equalsIgnoreCase(name)) {
			ap_d_no(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($org_ap_d_no.equalsIgnoreCase(name)) {
			org_ap_d_no(value);
			return;
		}
		if ($crryovr_ap_d_no.equalsIgnoreCase(name)) {
			crryovr_ap_d_no(value);
			return;
		}
		if ($crryovr_src_ap_d_no.equalsIgnoreCase(name)) {
			crryovr_src_ap_d_no(value);
			return;
		}
		if ($sw_src_pay_schd_no.equalsIgnoreCase(name)) {
			sw_src_pay_schd_no(value);
			return;
		}
		if ($sw_src_rcv_bill_no.equalsIgnoreCase(name)) {
			sw_src_rcv_bill_no(value);
			return;
		}
		if ($pay_schd_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_schd_d_print_rmrks(value);
			return;
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_ntc_d_print_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($ref_ap_d_no.equalsIgnoreCase(name)) {
			ref_ap_d_no(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($crryovr_times.equalsIgnoreCase(name)) {
			crryovr_times(value);
			return;
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			co_bsppl_cl_day(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($ap_d_upd_cntr.equalsIgnoreCase(name)) {
			ap_d_upd_cntr(value);
			return;
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			old_trd_cur_amt(value);
			return;
		}
		if ($old_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			old_trd_cur_tax_amt(value);
			return;
		}
		if ($old_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			old_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($old_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			old_trd_cur_proc_amt(value);
			return;
		}
		if ($old_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_amt_tax_diff.equalsIgnoreCase(name)) {
			trd_cur_amt_tax_diff(value);
			return;
		}
		if ($up_trd_cur_amt.equalsIgnoreCase(name)) {
			up_trd_cur_amt(value);
			return;
		}
		if ($up_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			up_trd_cur_tax_amt(value);
			return;
		}
		if ($up_wtax_amt.equalsIgnoreCase(name)) {
			up_wtax_amt(value);
			return;
		}
		if ($up_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			up_trd_cur_proc_amt(value);
			return;
		}
		if ($up_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			up_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($co_src_trd_cur_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_amt(value);
			return;
		}
		if ($co_src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_tax_amt(value);
			return;
		}
		if ($co_src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_proc_amt(value);
			return;
		}
		if ($co_src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($crryovr_times.equalsIgnoreCase(name)) {
			crryovr_times(value);
			return;
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			co_bsppl_cl_day(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($ap_d_upd_cntr.equalsIgnoreCase(name)) {
			ap_d_upd_cntr(value);
			return;
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			old_trd_cur_amt(value);
			return;
		}
		if ($old_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			old_trd_cur_tax_amt(value);
			return;
		}
		if ($old_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			old_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($old_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			old_trd_cur_proc_amt(value);
			return;
		}
		if ($old_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_amt_tax_diff.equalsIgnoreCase(name)) {
			trd_cur_amt_tax_diff(value);
			return;
		}
		if ($up_trd_cur_amt.equalsIgnoreCase(name)) {
			up_trd_cur_amt(value);
			return;
		}
		if ($up_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			up_trd_cur_tax_amt(value);
			return;
		}
		if ($up_wtax_amt.equalsIgnoreCase(name)) {
			up_wtax_amt(value);
			return;
		}
		if ($up_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			up_trd_cur_proc_amt(value);
			return;
		}
		if ($up_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			up_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($co_src_trd_cur_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_amt(value);
			return;
		}
		if ($co_src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_tax_amt(value);
			return;
		}
		if ($co_src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_proc_amt(value);
			return;
		}
		if ($co_src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($crryovr_times.equalsIgnoreCase(name)) {
			crryovr_times(value);
			return;
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			co_bsppl_cl_day(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($ap_d_upd_cntr.equalsIgnoreCase(name)) {
			ap_d_upd_cntr(value);
			return;
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			old_trd_cur_amt(value);
			return;
		}
		if ($old_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			old_trd_cur_tax_amt(value);
			return;
		}
		if ($old_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			old_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($old_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			old_trd_cur_proc_amt(value);
			return;
		}
		if ($old_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_amt_tax_diff.equalsIgnoreCase(name)) {
			trd_cur_amt_tax_diff(value);
			return;
		}
		if ($up_trd_cur_amt.equalsIgnoreCase(name)) {
			up_trd_cur_amt(value);
			return;
		}
		if ($up_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			up_trd_cur_tax_amt(value);
			return;
		}
		if ($up_wtax_amt.equalsIgnoreCase(name)) {
			up_wtax_amt(value);
			return;
		}
		if ($up_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			up_trd_cur_proc_amt(value);
			return;
		}
		if ($up_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			up_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($co_src_trd_cur_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_amt(value);
			return;
		}
		if ($co_src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_tax_amt(value);
			return;
		}
		if ($co_src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_proc_amt(value);
			return;
		}
		if ($co_src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($crryovr_times.equalsIgnoreCase(name)) {
			crryovr_times(value);
			return;
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			co_bsppl_cl_day(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($ap_d_upd_cntr.equalsIgnoreCase(name)) {
			ap_d_upd_cntr(value);
			return;
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			old_trd_cur_amt(value);
			return;
		}
		if ($old_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			old_trd_cur_tax_amt(value);
			return;
		}
		if ($old_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			old_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($old_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			old_trd_cur_proc_amt(value);
			return;
		}
		if ($old_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_amt_tax_diff.equalsIgnoreCase(name)) {
			trd_cur_amt_tax_diff(value);
			return;
		}
		if ($up_trd_cur_amt.equalsIgnoreCase(name)) {
			up_trd_cur_amt(value);
			return;
		}
		if ($up_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			up_trd_cur_tax_amt(value);
			return;
		}
		if ($up_wtax_amt.equalsIgnoreCase(name)) {
			up_wtax_amt(value);
			return;
		}
		if ($up_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			up_trd_cur_proc_amt(value);
			return;
		}
		if ($up_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			up_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($co_src_trd_cur_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_amt(value);
			return;
		}
		if ($co_src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_tax_amt(value);
			return;
		}
		if ($co_src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_proc_amt(value);
			return;
		}
		if ($co_src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($crryovr_times.equalsIgnoreCase(name)) {
			crryovr_times(value);
			return;
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			co_bsppl_cl_day(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($ap_d_upd_cntr.equalsIgnoreCase(name)) {
			ap_d_upd_cntr(value);
			return;
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			old_trd_cur_amt(value);
			return;
		}
		if ($old_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			old_trd_cur_tax_amt(value);
			return;
		}
		if ($old_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			old_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($old_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			old_trd_cur_proc_amt(value);
			return;
		}
		if ($old_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_amt_tax_diff.equalsIgnoreCase(name)) {
			trd_cur_amt_tax_diff(value);
			return;
		}
		if ($up_trd_cur_amt.equalsIgnoreCase(name)) {
			up_trd_cur_amt(value);
			return;
		}
		if ($up_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			up_trd_cur_tax_amt(value);
			return;
		}
		if ($up_wtax_amt.equalsIgnoreCase(name)) {
			up_wtax_amt(value);
			return;
		}
		if ($up_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			up_trd_cur_proc_amt(value);
			return;
		}
		if ($up_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			up_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($co_src_trd_cur_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_amt(value);
			return;
		}
		if ($co_src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_tax_amt(value);
			return;
		}
		if ($co_src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_proc_amt(value);
			return;
		}
		if ($co_src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			co_src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($co_bsppl_cl_ym.equalsIgnoreCase(name)) {
			co_bsppl_cl_ym(value);
			return;
		}
		if ($co_bsppl_cl_dt.equalsIgnoreCase(name)) {
			co_bsppl_cl_dt(value);
			return;
		}
		if ($bsppl_cl_dt.equalsIgnoreCase(name)) {
			bsppl_cl_dt(value);
			return;
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			pay_basis_dt(value);
			return;
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		if ($act_dt.equalsIgnoreCase(name)) {
			act_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			base_purc_ac_dt(value);
			return;
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			reg_dt(value);
			return;
		}
		if ($hdr_bsppl_cl_dt.equalsIgnoreCase(name)) {
			hdr_bsppl_cl_dt(value);
			return;
		}
		if ($xrate_base_dt.equalsIgnoreCase(name)) {
			xrate_base_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($crryovr_flg.equalsIgnoreCase(name)) {
			crryovr_flg(value);
			return;
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			add_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($trd_cur_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_amt_p();
		}
		if ($trd_cur_tax_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt_p();
		}
		if ($trd_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt_p();
		}
		if ($trd_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt_p();
		}
		if ($trd_cur_proc_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_proc_amt_p();
		}
		if ($trd_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_amt_p();
		}
		if ($trd_cur_upri_p.equalsIgnoreCase(name)) {
			return trd_cur_upri_p();
		}
		if ($trd_cur_proc_upri_p.equalsIgnoreCase(name)) {
			return trd_cur_proc_upri_p();
		}
		if ($trd_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_upri_p();
		}
		if ($xrate_p.equalsIgnoreCase(name)) {
			return xrate_p();
		}
		if ($base_cur_amt_p.equalsIgnoreCase(name)) {
			return base_cur_amt_p();
		}
		if ($base_cur_tax_amt_p.equalsIgnoreCase(name)) {
			return base_cur_tax_amt_p();
		}
		if ($base_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			return base_cur_inc_tax_amt_p();
		}
		if ($base_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt_p();
		}
		if ($base_cur_proc_amt_p.equalsIgnoreCase(name)) {
			return base_cur_proc_amt_p();
		}
		if ($base_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_amt_p();
		}
		if ($base_cur_upri_p.equalsIgnoreCase(name)) {
			return base_cur_upri_p();
		}
		if ($base_cur_proc_upri_p.equalsIgnoreCase(name)) {
			return base_cur_proc_upri_p();
		}
		if ($base_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_upri_p();
		}
		if ($wtax_amt_p.equalsIgnoreCase(name)) {
			return wtax_amt_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($trd_unit_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_qty_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
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
		if ($trd_cur_amt_p.equalsIgnoreCase(name)) {
			trd_cur_amt_p(
				((MCContainerMeta) trd_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($trd_cur_tax_amt_p.equalsIgnoreCase(name)) {
			trd_cur_tax_amt_p(
				((MCContainerMeta) trd_cur_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($trd_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt_p(
				((MCContainerMeta) trd_cur_inc_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($trd_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt_p(
				((MCContainerMeta) trd_cur_dscnt_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($trd_cur_proc_amt_p.equalsIgnoreCase(name)) {
			trd_cur_proc_amt_p(
				((MCContainerMeta) trd_cur_proc_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($trd_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt_p(
				((MCContainerMeta) trd_cur_onr_prov_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($trd_cur_upri_p.equalsIgnoreCase(name)) {
			trd_cur_upri_p(
				((MCContainerMeta) trd_cur_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($trd_cur_proc_upri_p.equalsIgnoreCase(name)) {
			trd_cur_proc_upri_p(
				((MCContainerMeta) trd_cur_proc_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($trd_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri_p(
				((MCContainerMeta) trd_cur_onr_prov_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($xrate_p.equalsIgnoreCase(name)) {
			xrate_p(
				((MCContainerMeta) xrate_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5390.XrateR.class, value)
			);
			return;
		}
		if ($base_cur_amt_p.equalsIgnoreCase(name)) {
			base_cur_amt_p(
				((MCContainerMeta) base_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_tax_amt_p.equalsIgnoreCase(name)) {
			base_cur_tax_amt_p(
				((MCContainerMeta) base_cur_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt_p(
				((MCContainerMeta) base_cur_inc_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt_p(
				((MCContainerMeta) base_cur_dscnt_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_proc_amt_p.equalsIgnoreCase(name)) {
			base_cur_proc_amt_p(
				((MCContainerMeta) base_cur_proc_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt_p(
				((MCContainerMeta) base_cur_onr_prov_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_upri_p.equalsIgnoreCase(name)) {
			base_cur_upri_p(
				((MCContainerMeta) base_cur_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($base_cur_proc_upri_p.equalsIgnoreCase(name)) {
			base_cur_proc_upri_p(
				((MCContainerMeta) base_cur_proc_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($base_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri_p(
				((MCContainerMeta) base_cur_onr_prov_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($wtax_amt_p.equalsIgnoreCase(name)) {
			wtax_amt_p(
				((MCContainerMeta) wtax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($trd_unit_qty_p.equalsIgnoreCase(name)) {
			trd_unit_qty_p(
				((MCContainerMeta) trd_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			base_unit_qty_p(
				((MCContainerMeta) base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
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

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return trd_cur_amt_p().amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return trd_cur_tax_amt_p().amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		trd_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		trd_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		trd_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		trd_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		trd_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public MCNumber trd_cur_inc_tax_amt() {
		return trd_cur_inc_tax_amt_p().amt();
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(MCNumber value) {
		trd_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(int value) {
		trd_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(long value) {
		trd_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(float value) {
		trd_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(double value) {
		trd_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return trd_cur_dscnt_amt_p().amt();
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		trd_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		trd_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		trd_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		trd_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		trd_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return trd_cur_proc_amt_p().amt();
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		trd_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		trd_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		trd_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		trd_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		trd_cur_proc_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return trd_cur_onr_prov_amt_p().amt();
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		trd_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		trd_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		trd_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		trd_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		trd_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return trd_cur_upri_p().upri();
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		trd_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		trd_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		trd_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		trd_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		trd_cur_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public MCNumber trd_cur_proc_upri() {
		return trd_cur_proc_upri_p().upri();
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(MCNumber value) {
		trd_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(int value) {
		trd_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(long value) {
		trd_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(float value) {
		trd_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(double value) {
		trd_cur_proc_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_upri() {
		return trd_cur_onr_prov_upri_p().upri();
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(MCNumber value) {
		trd_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(int value) {
		trd_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(long value) {
		trd_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(float value) {
		trd_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(double value) {
		trd_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return xrate_p().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		xrate_p().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		xrate_p().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		xrate_p().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		xrate_p().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		xrate_p().xrate(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return base_cur_amt_p().amt();
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return base_cur_tax_amt_p().amt();
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public MCNumber base_cur_inc_tax_amt() {
		return base_cur_inc_tax_amt_p().amt();
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(MCNumber value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(int value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(long value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(float value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(double value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return base_cur_dscnt_amt_p().amt();
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public MCNumber base_cur_proc_amt() {
		return base_cur_proc_amt_p().amt();
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(MCNumber value) {
		base_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(int value) {
		base_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(long value) {
		base_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(float value) {
		base_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(double value) {
		base_cur_proc_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_amt() {
		return base_cur_onr_prov_amt_p().amt();
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(MCNumber value) {
		base_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(int value) {
		base_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(long value) {
		base_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(float value) {
		base_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(double value) {
		base_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return base_cur_upri_p().upri();
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public MCNumber base_cur_proc_upri() {
		return base_cur_proc_upri_p().upri();
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(MCNumber value) {
		base_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(int value) {
		base_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(long value) {
		base_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(float value) {
		base_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(double value) {
		base_cur_proc_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_upri() {
		return base_cur_onr_prov_upri_p().upri();
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(MCNumber value) {
		base_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(int value) {
		base_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(long value) {
		base_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(float value) {
		base_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(double value) {
		base_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return wtax_amt_p().amt();
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		wtax_amt_p().amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		wtax_amt_p().amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		wtax_amt_p().amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		wtax_amt_p().amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		wtax_amt_p().amt(value);
	}

	public String sno1() {
		return sno_wrk_no_p().sno1();
	}

	public void sno1(String value) {
		sno_wrk_no_p().sno1(value);
	}

	public String sno2() {
		return sno_wrk_no_p().sno2();
	}

	public void sno2(String value) {
		sno_wrk_no_p().sno2(value);
	}

	public String sno3() {
		return sno_wrk_no_p().sno3();
	}

	public void sno3(String value) {
		sno_wrk_no_p().sno3(value);
	}

	public String sno4() {
		return sno_wrk_no_p().sno4();
	}

	public void sno4(String value) {
		sno_wrk_no_p().sno4(value);
	}

	public String wrk_no() {
		return sno_wrk_no_p().wrk_no();
	}

	public void wrk_no(String value) {
		sno_wrk_no_p().wrk_no(value);
	}

	public String wrk_nm() {
		return sno_wrk_no_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		sno_wrk_no_p().wrk_nm(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return trd_unit_qty_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return base_unit_qty_p().qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		base_unit_qty_p().qty(value);
	}

}

