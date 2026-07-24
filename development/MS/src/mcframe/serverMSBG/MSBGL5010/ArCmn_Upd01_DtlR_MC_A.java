package mcframe.serverMSBG.MSBGL5010;

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
 * ブロック"ArCmn_Upd01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ArCmn_Upd01_DtlR_MC_A extends MCConstRow {

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public static final String $act_no = "act_no";
	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public static final String $act_seq = "act_seq";
	/**
	 * Header rev. number ヘッダ改訂番号.<p>
	 *
	 */
	public static final String $act_rev = "act_rev";
	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public static final String $act_d_no = "act_d_no";
	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public static final String $act_d_seq = "act_d_seq";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";
	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public static final String $ar_trd_grp_typ = "ar_trd_grp_typ";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * AR settlement type 1 債権決済区分１.<p>
	 *
	 */
	public static final String $rcv_typ = "rcv_typ";
	/**
	 * AR settlement method 1 債権決済方法１.<p>
	 *
	 */
	public static final String $rcv_mtd_cd = "rcv_mtd_cd";
	/**
	 * AR reconciliation schedule No. 売掛消込予定ＮＯ.<p>
	 *
	 */
	public static final String $ar_appl_schd_no = "ar_appl_schd_no";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 * Miscellaneous delivery destination flg. 納品先諸口ＦＬＧ.<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * Input recording date 入力計上日.<p>
	 *
	 */
	public static final String $inpt_ac_dt = "inpt_ac_dt";
	/**
	 * Input recording month 入力計上年月.<p>
	 *
	 */
	public static final String $inpt_ac_ym = "inpt_ac_ym";
	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public static final String $dlv_dt = "dlv_dt";
	/**
	 * Sales recording date (Base) 売上計上日（基）.<p>
	 *
	 */
	public static final String $base_sls_ac_dt = "base_sls_ac_dt";
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public static final String $bill_basis_dt = "bill_basis_dt";
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public static final String $rcv_dt = "rcv_dt";
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public static final String $bill_crryovr_times = "bill_crryovr_times";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public static final String $sls_usr_cd = "sls_usr_cd";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public static final String $ship_dlv_slip_no = "ship_dlv_slip_no";
	/**
	 * Delivery note details No. at shipping 出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $ship_dlv_slip_d_no = "ship_dlv_slip_d_no";
	/**
	 * Multiple delivery note details at shipping flg. 出荷時納品書明細複数ＦＬＧ.<p>
	 *
	 */
	public static final String $ship_dlv_slip_multi_flg = "ship_dlv_slip_multi_flg";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Billing invoice No. 請求インボイスＮＯ.<p>
	 *
	 */
	public static final String $bill_iv_no = "bill_iv_no";
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
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_no = "cst_po_no";
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_d_no = "cst_po_d_no";
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
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * Customer item 得意先品目.<p>
	 *
	 */
	public static final String $cst_itm_cd = "cst_itm_cd";
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public static final String $cst_itm_nm = "cst_itm_nm";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public static final String $trd_cur_amt1 = "trd_cur_amt1";
	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public static final String $trd_cur_amt2 = "trd_cur_amt2";
	/**
	 * Amount 3 (Transaction currency) 取引通貨金額３.<p>
	 *
	 */
	public static final String $trd_cur_amt3 = "trd_cur_amt3";
	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public static final String $base_cur_upri = "base_cur_upri";
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	/**
	 * Amount 1 (Base currency) 基準通貨金額１.<p>
	 *
	 */
	public static final String $base_cur_amt1 = "base_cur_amt1";
	/**
	 * Amount 2 (Base currency) 基準通貨金額２.<p>
	 *
	 */
	public static final String $base_cur_amt2 = "base_cur_amt2";
	/**
	 * Amount 3 (Base currency) 基準通貨金額３.<p>
	 *
	 */
	public static final String $base_cur_amt3 = "base_cur_amt3";
	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public static final String $base_cur_dscnt_amt = "base_cur_dscnt_amt";
	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public static final String $tax_typ = "tax_typ";
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public static final String $wtax_amt = "wtax_amt";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public static final String $bill_d_rmrks = "bill_d_rmrks";
	/**
	 * Parent result No. 親実績ＮＯ.<p>
	 *
	 */
	public static final String $par_act_no = "par_act_no";
	/**
	 * Parent result sequence number 親実績連番.<p>
	 *
	 */
	public static final String $par_act_seq = "par_act_seq";
	/**
	 * Billing details type 請求明細区分.<p>
	 *
	 */
	public static final String $bill_d_typ = "bill_d_typ";
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	/**
	 * Corresponding I/V No. 対応インボイスＮＯ.<p>
	 *
	 */
	public static final String $ref_iv_no = "ref_iv_no";
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public static final String $rcv_schd_dt = "rcv_schd_dt";
	/**
	 * For tax variance flg. 税差額対象ＦＬＧ.<p>
	 *
	 */
	public static final String $tgt_flg = "tgt_flg";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	/**
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public static final String $bill_cl_dt = "bill_cl_dt";
	/**
	 * AR project No. 債権案件ＮＯ.<p>
	 *
	 */
	public static final String $ar_wrk_no = "ar_wrk_no";
	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public static final String $exc_gain_loss = "exc_gain_loss";
	/**
	 * AR management by sales project flg. (Customer) 案件別債権管理ＦＬＧ（得意先）.<p>
	 *
	 */
	public static final String $cst_wrk_ar_flg = "cst_wrk_ar_flg";
	/**
	 * AR management by sales project flg. (Sales project) 案件別債権管理ＦＬＧ（案件）.<p>
	 *
	 */
	public static final String $wrk_ar_flg = "wrk_ar_flg";
	/**
	 * Discount item flg. 値引品目ＦＬＧ.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public static final String $bill_dpt_typ = "bill_dpt_typ";
	/**
	 * Billing dept. cd. before change 変更前請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bef_bill_dpt_cd = "bef_bill_dpt_cd";
	/**
	 * Billing dept. base date 請求部門基準日.<p>
	 *
	 */
	public static final String $bill_dpt_base_dt = "bill_dpt_base_dt";
	public static final String $bill_d_no = "bill_d_no";
	/**
	 * Tax inclusive amount 1 (Transaction currency) 取引通貨内税額１.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt1 = "trd_cur_tax_amt1";
	/**
	 * Tax inclusive amount 2 (Transaction currency) 取引通貨内税額２.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt2 = "trd_cur_tax_amt2";
	/**
	 * Tax inclusive amount 3 (Transaction currency) 取引通貨内税額３.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt3 = "trd_cur_tax_amt3";
	/**
	 * Tax inclusive amount 1 (Base currency) 基準通貨内税額１.<p>
	 *
	 */
	public static final String $base_cur_tax_amt1 = "base_cur_tax_amt1";
	/**
	 * Tax inclusive amount 2 (Base currency) 基準通貨内税額２.<p>
	 *
	 */
	public static final String $base_cur_tax_amt2 = "base_cur_tax_amt2";
	/**
	 * Tax inclusive amount 3 (Base currency) 基準通貨内税額３.<p>
	 *
	 */
	public static final String $base_cur_tax_amt3 = "base_cur_tax_amt3";


	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta act_no_META = createCommonMeta($act_no, mcframe.commonMA.meta.MA_META.ACT_NO);
	public static final MCMeta act_seq_META = createCommonMeta($act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta act_rev_META = createCommonMeta($act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta act_d_no_META = createCommonMeta($act_d_no, mcframe.commonMA.meta.MA_META.ACT_D_NO);
	public static final MCMeta act_d_seq_META = createCommonMeta($act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta ar_trd_grp_typ_META = createCommonMeta($ar_trd_grp_typ, mcframe.commonMA.meta.MA_META.AR_TRD_GRP_TYP);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta rcv_typ_META = createCommonMeta($rcv_typ, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta rcv_mtd_cd_META = createCommonMeta($rcv_mtd_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_appl_schd_no_META = createCommonMeta($ar_appl_schd_no, mcframe.commonMA.meta.MA_META.AR_APPL_SCHD_NO);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta inpt_ac_dt_META = createCommonMeta($inpt_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inpt_ac_ym_META = createCommonMeta($inpt_ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta dlv_dt_META = createCommonMeta($dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta base_sls_ac_dt_META = createCommonMeta($base_sls_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_basis_dt_META = createCommonMeta($bill_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_dt_META = createCommonMeta($rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_ID);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta ship_dlv_slip_no_META = createCommonMeta($ship_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta ship_dlv_slip_d_no_META = createCommonMeta($ship_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta ship_dlv_slip_multi_flg_META = createCommonMeta($ship_dlv_slip_multi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta bill_iv_no_META = createCommonMeta($bill_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt1_META = createCommonMeta($trd_cur_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt2_META = createCommonMeta($trd_cur_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt3_META = createCommonMeta($trd_cur_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.XRATE);
	public static final MCMeta base_cur_upri_META = createCommonMeta($base_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt1_META = createCommonMeta($base_cur_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt2_META = createCommonMeta($base_cur_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt3_META = createCommonMeta($base_cur_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_dscnt_amt_META = createCommonMeta($base_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_typ_META = createCommonMeta($tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_META = createCommonMeta($wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta bill_d_rmrks_META = createCommonMeta($bill_d_rmrks, mcframe.commonMS.meta.MS_META.BILL_D_RMRKS);
	public static final MCMeta par_act_no_META = createCommonMeta($par_act_no, mcframe.commonMA.meta.MA_META.ACT_NO);
	public static final MCMeta par_act_seq_META = createCommonMeta($par_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta bill_d_typ_META = createCommonMeta($bill_d_typ, mcframe.commonMS.meta.MS_META.BILL_D_TYP);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta ref_iv_no_META = createCommonMeta($ref_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcv_schd_dt_META = createCommonMeta($rcv_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta tgt_flg_META = createCommonMeta($tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta bill_cl_dt_META = createCommonMeta($bill_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ar_wrk_no_META = createCommonMeta($ar_wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta exc_gain_loss_META = createCommonMeta($exc_gain_loss, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cst_wrk_ar_flg_META = createCommonMeta($cst_wrk_ar_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_ar_flg_META = createCommonMeta($wrk_ar_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dpt_typ_META = createCommonMeta($bill_dpt_typ, mcframe.commonMA.meta.MA_META.BILL_DPT_TYP);
	public static final MCMeta bef_bill_dpt_cd_META = createCommonMeta($bef_bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_base_dt_META = createCommonMeta($bill_dpt_base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_d_no_META = createCommonMeta($bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta trd_cur_tax_amt1_META = createCommonMeta($trd_cur_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt2_META = createCommonMeta($trd_cur_tax_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt3_META = createCommonMeta($trd_cur_tax_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt1_META = createCommonMeta($base_cur_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt2_META = createCommonMeta($base_cur_tax_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt3_META = createCommonMeta($base_cur_tax_amt3, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<ArCmn_Upd01_DtlR> constMetas = new ConstMetaList<ArCmn_Upd01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			trd_cd_META,
			act_no_META,
			act_seq_META,
			act_rev_META,
			act_d_no_META,
			act_d_seq_META,
			trd_cur_cd_META,
			bill_mng_no_META,
			ar_trd_grp_typ_META,
			trd_ptn_typ_META,
			rcv_typ_META,
			rcv_mtd_cd_META,
			ar_appl_schd_no_META,
			bcst_cd_META,
			acst_cd_META,
			cst_cd_META,
			dlv_cd_META,
			dlv_nm_META,
			dlv_sundry_flg_META,
			dest_cd1_META,
			dest_cd2_META,
			dest_cd3_META,
			ac_dt_META,
			ac_ym_META,
			inpt_ac_dt_META,
			inpt_ac_ym_META,
			dlv_dt_META,
			base_sls_ac_dt_META,
			bill_basis_dt_META,
			rcv_dt_META,
			bill_crryovr_times_META,
			ar_dpt_cd_META,
			sls_dpt_cd_META,
			bill_dpt_cd_META,
			sls_usr_cd_META,
			dlv_slip_no_META,
			dlv_slip_d_no_META,
			ship_dlv_slip_no_META,
			ship_dlv_slip_d_no_META,
			ship_dlv_slip_multi_flg_META,
			iv_no_META,
			bill_iv_no_META,
			slo_no_META,
			slo_d_no_META,
			cst_po_no_META,
			cst_po_d_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			itm_nm_META,
			sundry_itm_flg_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			trd_unit_cd_META,
			trd_unit_qty_META,
			base_unit_cd_META,
			base_unit_qty_META,
			trd_cur_upri_META,
			inc_tax_flg_META,
			interim_flg_META,
			trd_cur_amt_META,
			trd_cur_amt1_META,
			trd_cur_amt2_META,
			trd_cur_amt3_META,
			trd_cur_dscnt_amt_META,
			xrate_META,
			base_cur_upri_META,
			base_cur_amt_META,
			base_cur_amt1_META,
			base_cur_amt2_META,
			base_cur_amt3_META,
			base_cur_dscnt_amt_META,
			base_cur_tax_amt_META,
			tax_typ_META,
			tax_rate_META,
			trd_cur_tax_amt_META,
			tax_cd_META,
			wtax_rate_META,
			wtax_amt_META,
			trd_d_rmrks_META,
			bill_d_rmrks_META,
			par_act_no_META,
			par_act_seq_META,
			bill_d_typ_META,
			slip_sts_typ_META,
			ref_iv_no_META,
			rcv_schd_dt_META,
			tgt_flg_META,
			wrk_no_META,
			ar_typ_META,
			bill_cl_dt_META,
			ar_wrk_no_META,
			exc_gain_loss_META,
			cst_wrk_ar_flg_META,
			wrk_ar_flg_META,
			dscnt_itm_flg_META,
			bill_dpt_typ_META,
			bef_bill_dpt_cd_META,
			bill_dpt_base_dt_META,
			bill_d_no_META,
			trd_cur_tax_amt1_META,
			trd_cur_tax_amt2_META,
			trd_cur_tax_amt3_META,
			base_cur_tax_amt1_META,
			base_cur_tax_amt2_META,
			base_cur_tax_amt3_META
		},
		new String[][]{
			{
			},
			{
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
	protected ArCmn_Upd01_DtlR_MC_A(ConstMetaList<? extends ArCmn_Upd01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArCmn_Upd01_DtlR clone() {
		return (ArCmn_Upd01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArCmn_Upd01_DtlR createInstance() {
		return (ArCmn_Upd01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArCmn_Upd01_DtlR getValues(String... names) {
		return (ArCmn_Upd01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 0, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 0, $trd_cd, value);
	}


	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public String act_no() {
		return getConstString(offset + 1, $act_no);
	}

	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public void act_no(String value) {
		setConstString(offset + 1, $act_no, value);
	}


	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public MCNumber act_seq() {
		return getConstNumber(offset + 2, $act_seq);
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public void act_seq(MCNumber value) {
		setConstNumber(offset + 2, $act_seq, value);
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public void act_seq(int value) {
		setConstNumber(offset + 2, $act_seq, value);
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public void act_seq(long value) {
		setConstNumber(offset + 2, $act_seq, value);
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public void act_seq(float value) {
		setConstNumber(offset + 2, $act_seq, value);
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public void act_seq(double value) {
		setConstNumber(offset + 2, $act_seq, value);
	}


	/**
	 * Header rev. number ヘッダ改訂番号.<p>
	 *
	 */
	public MCNumber act_rev() {
		return getConstNumber(offset + 3, $act_rev);
	}

	/**
	 * Header rev. number ヘッダ改訂番号.<p>
	 *
	 */
	public void act_rev(MCNumber value) {
		setConstNumber(offset + 3, $act_rev, value);
	}

	/**
	 * Header rev. number ヘッダ改訂番号.<p>
	 *
	 */
	public void act_rev(int value) {
		setConstNumber(offset + 3, $act_rev, value);
	}

	/**
	 * Header rev. number ヘッダ改訂番号.<p>
	 *
	 */
	public void act_rev(long value) {
		setConstNumber(offset + 3, $act_rev, value);
	}

	/**
	 * Header rev. number ヘッダ改訂番号.<p>
	 *
	 */
	public void act_rev(float value) {
		setConstNumber(offset + 3, $act_rev, value);
	}

	/**
	 * Header rev. number ヘッダ改訂番号.<p>
	 *
	 */
	public void act_rev(double value) {
		setConstNumber(offset + 3, $act_rev, value);
	}


	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public String act_d_no() {
		return getConstString(offset + 4, $act_d_no);
	}

	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public void act_d_no(String value) {
		setConstString(offset + 4, $act_d_no, value);
	}


	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public MCNumber act_d_seq() {
		return getConstNumber(offset + 5, $act_d_seq);
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public void act_d_seq(MCNumber value) {
		setConstNumber(offset + 5, $act_d_seq, value);
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public void act_d_seq(int value) {
		setConstNumber(offset + 5, $act_d_seq, value);
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public void act_d_seq(long value) {
		setConstNumber(offset + 5, $act_d_seq, value);
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public void act_d_seq(float value) {
		setConstNumber(offset + 5, $act_d_seq, value);
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public void act_d_seq(double value) {
		setConstNumber(offset + 5, $act_d_seq, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 6, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 6, $trd_cur_cd, value);
	}


	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 7, $bill_mng_no);
	}

	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 7, $bill_mng_no, value);
	}


	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public String ar_trd_grp_typ() {
		return getConstString(offset + 8, $ar_trd_grp_typ);
	}

	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public void ar_trd_grp_typ(String value) {
		setConstString(offset + 8, $ar_trd_grp_typ, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 9, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 9, $trd_ptn_typ, value);
	}


	/**
	 * AR settlement type 1 債権決済区分１.<p>
	 *
	 */
	public String rcv_typ() {
		return getConstString(offset + 10, $rcv_typ);
	}

	/**
	 * AR settlement type 1 債権決済区分１.<p>
	 *
	 */
	public void rcv_typ(String value) {
		setConstString(offset + 10, $rcv_typ, value);
	}


	/**
	 * AR settlement method 1 債権決済方法１.<p>
	 *
	 */
	public String rcv_mtd_cd() {
		return getConstString(offset + 11, $rcv_mtd_cd);
	}

	/**
	 * AR settlement method 1 債権決済方法１.<p>
	 *
	 */
	public void rcv_mtd_cd(String value) {
		setConstString(offset + 11, $rcv_mtd_cd, value);
	}


	/**
	 * AR reconciliation schedule No. 売掛消込予定ＮＯ.<p>
	 *
	 */
	public String ar_appl_schd_no() {
		return getConstString(offset + 12, $ar_appl_schd_no);
	}

	/**
	 * AR reconciliation schedule No. 売掛消込予定ＮＯ.<p>
	 *
	 */
	public void ar_appl_schd_no(String value) {
		setConstString(offset + 12, $ar_appl_schd_no, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 13, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 13, $bcst_cd, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 14, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 14, $acst_cd, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 15, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 15, $cst_cd, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 16, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 16, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 17, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 17, $dlv_nm, value);
	}


	/**
	 * Miscellaneous delivery destination flg. 納品先諸口ＦＬＧ.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 18, $dlv_sundry_flg);
	}

	/**
	 * Miscellaneous delivery destination flg. 納品先諸口ＦＬＧ.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 18, $dlv_sundry_flg, value);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 19, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 19, $dest_cd1, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 20, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 20, $dest_cd2, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 21, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 21, $dest_cd3, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 22, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 22, $ac_dt, value);
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 23, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 23, $ac_ym, value);
	}


	/**
	 * Input recording date 入力計上日.<p>
	 *
	 */
	public MCDate inpt_ac_dt() {
		return getConstDate(offset + 24, $inpt_ac_dt);
	}

	/**
	 * Input recording date 入力計上日.<p>
	 *
	 */
	public void inpt_ac_dt(MCDate value) {
		setConstDate(offset + 24, $inpt_ac_dt, value);
	}


	/**
	 * Input recording month 入力計上年月.<p>
	 *
	 */
	public MCDate inpt_ac_ym() {
		return getConstDate(offset + 25, $inpt_ac_ym);
	}

	/**
	 * Input recording month 入力計上年月.<p>
	 *
	 */
	public void inpt_ac_ym(MCDate value) {
		setConstDate(offset + 25, $inpt_ac_ym, value);
	}


	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public MCDate dlv_dt() {
		return getConstDate(offset + 26, $dlv_dt);
	}

	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public void dlv_dt(MCDate value) {
		setConstDate(offset + 26, $dlv_dt, value);
	}


	/**
	 * Sales recording date (Base) 売上計上日（基）.<p>
	 *
	 */
	public MCDate base_sls_ac_dt() {
		return getConstDate(offset + 27, $base_sls_ac_dt);
	}

	/**
	 * Sales recording date (Base) 売上計上日（基）.<p>
	 *
	 */
	public void base_sls_ac_dt(MCDate value) {
		setConstDate(offset + 27, $base_sls_ac_dt, value);
	}


	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDate bill_basis_dt() {
		return getConstDate(offset + 28, $bill_basis_dt);
	}

	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public void bill_basis_dt(MCDate value) {
		setConstDate(offset + 28, $bill_basis_dt, value);
	}


	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCDate rcv_dt() {
		return getConstDate(offset + 29, $rcv_dt);
	}

	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public void rcv_dt(MCDate value) {
		setConstDate(offset + 29, $rcv_dt, value);
	}


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 30, $bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 30, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 30, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 30, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 30, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 30, $bill_crryovr_times, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 31, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 31, $ar_dpt_cd, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 32, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 32, $sls_dpt_cd, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 33, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 33, $bill_dpt_cd, value);
	}


	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 34, $sls_usr_cd);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 34, $sls_usr_cd, value);
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
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 36, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 36, $dlv_slip_d_no, value);
	}


	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public String ship_dlv_slip_no() {
		return getConstString(offset + 37, $ship_dlv_slip_no);
	}

	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public void ship_dlv_slip_no(String value) {
		setConstString(offset + 37, $ship_dlv_slip_no, value);
	}


	/**
	 * Delivery note details No. at shipping 出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public String ship_dlv_slip_d_no() {
		return getConstString(offset + 38, $ship_dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. at shipping 出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public void ship_dlv_slip_d_no(String value) {
		setConstString(offset + 38, $ship_dlv_slip_d_no, value);
	}


	/**
	 * Multiple delivery note details at shipping flg. 出荷時納品書明細複数ＦＬＧ.<p>
	 *
	 */
	public boolean ship_dlv_slip_multi_flg() {
		return getConstBoolean(offset + 39, $ship_dlv_slip_multi_flg);
	}

	/**
	 * Multiple delivery note details at shipping flg. 出荷時納品書明細複数ＦＬＧ.<p>
	 *
	 */
	public void ship_dlv_slip_multi_flg(boolean value) {
		setConstBoolean(offset + 39, $ship_dlv_slip_multi_flg, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 40, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 40, $iv_no, value);
	}


	/**
	 * Billing invoice No. 請求インボイスＮＯ.<p>
	 *
	 */
	public String bill_iv_no() {
		return getConstString(offset + 41, $bill_iv_no);
	}

	/**
	 * Billing invoice No. 請求インボイスＮＯ.<p>
	 *
	 */
	public void bill_iv_no(String value) {
		setConstString(offset + 41, $bill_iv_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 42, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 42, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 43, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 43, $slo_d_no, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 44, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 44, $cst_po_no, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 45, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 45, $cst_po_d_no, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 46, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 46, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 47, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 47, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 48, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 48, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 49, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 49, $itm_sub3, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 50, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 50, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 51, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 51, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 52, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 52, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 53, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 53, $sno4, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 54, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 54, $itm_nm, value);
	}


	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 55, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 55, $sundry_itm_flg, value);
	}


	/**
	 * Customer item 得意先品目.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 56, $cst_itm_cd);
	}

	/**
	 * Customer item 得意先品目.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 56, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 57, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 57, $cst_itm_nm, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 58, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 58, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 59, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 59, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 59, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 59, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 59, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 59, $trd_unit_qty, value);
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
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 61, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 61, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 61, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 61, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 61, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 61, $base_unit_qty, value);
	}


	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 62, $trd_cur_upri);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 62, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 62, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 62, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 62, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 62, $trd_cur_upri, value);
	}


	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 63, $inc_tax_flg);
	}

	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 63, $inc_tax_flg, value);
	}


	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 64, $interim_flg);
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 64, $interim_flg, value);
	}


	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 65, $trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 65, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 65, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 65, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 65, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 65, $trd_cur_amt, value);
	}


	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public MCNumber trd_cur_amt1() {
		return getConstNumber(offset + 66, $trd_cur_amt1);
	}

	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public void trd_cur_amt1(MCNumber value) {
		setConstNumber(offset + 66, $trd_cur_amt1, value);
	}

	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public void trd_cur_amt1(int value) {
		setConstNumber(offset + 66, $trd_cur_amt1, value);
	}

	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public void trd_cur_amt1(long value) {
		setConstNumber(offset + 66, $trd_cur_amt1, value);
	}

	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public void trd_cur_amt1(float value) {
		setConstNumber(offset + 66, $trd_cur_amt1, value);
	}

	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public void trd_cur_amt1(double value) {
		setConstNumber(offset + 66, $trd_cur_amt1, value);
	}


	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public MCNumber trd_cur_amt2() {
		return getConstNumber(offset + 67, $trd_cur_amt2);
	}

	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public void trd_cur_amt2(MCNumber value) {
		setConstNumber(offset + 67, $trd_cur_amt2, value);
	}

	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public void trd_cur_amt2(int value) {
		setConstNumber(offset + 67, $trd_cur_amt2, value);
	}

	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public void trd_cur_amt2(long value) {
		setConstNumber(offset + 67, $trd_cur_amt2, value);
	}

	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public void trd_cur_amt2(float value) {
		setConstNumber(offset + 67, $trd_cur_amt2, value);
	}

	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public void trd_cur_amt2(double value) {
		setConstNumber(offset + 67, $trd_cur_amt2, value);
	}


	/**
	 * Amount 3 (Transaction currency) 取引通貨金額３.<p>
	 *
	 */
	public MCNumber trd_cur_amt3() {
		return getConstNumber(offset + 68, $trd_cur_amt3);
	}

	/**
	 * Amount 3 (Transaction currency) 取引通貨金額３.<p>
	 *
	 */
	public void trd_cur_amt3(MCNumber value) {
		setConstNumber(offset + 68, $trd_cur_amt3, value);
	}

	/**
	 * Amount 3 (Transaction currency) 取引通貨金額３.<p>
	 *
	 */
	public void trd_cur_amt3(int value) {
		setConstNumber(offset + 68, $trd_cur_amt3, value);
	}

	/**
	 * Amount 3 (Transaction currency) 取引通貨金額３.<p>
	 *
	 */
	public void trd_cur_amt3(long value) {
		setConstNumber(offset + 68, $trd_cur_amt3, value);
	}

	/**
	 * Amount 3 (Transaction currency) 取引通貨金額３.<p>
	 *
	 */
	public void trd_cur_amt3(float value) {
		setConstNumber(offset + 68, $trd_cur_amt3, value);
	}

	/**
	 * Amount 3 (Transaction currency) 取引通貨金額３.<p>
	 *
	 */
	public void trd_cur_amt3(double value) {
		setConstNumber(offset + 68, $trd_cur_amt3, value);
	}


	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 69, $trd_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 69, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 69, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 69, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 69, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 69, $trd_cur_dscnt_amt, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 70, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 70, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 70, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 70, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 70, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 70, $xrate, value);
	}


	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return getConstNumber(offset + 71, $base_cur_upri);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		setConstNumber(offset + 71, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		setConstNumber(offset + 71, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		setConstNumber(offset + 71, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		setConstNumber(offset + 71, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		setConstNumber(offset + 71, $base_cur_upri, value);
	}


	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 72, $base_cur_amt);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 72, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 72, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 72, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 72, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 72, $base_cur_amt, value);
	}


	/**
	 * Amount 1 (Base currency) 基準通貨金額１.<p>
	 *
	 */
	public MCNumber base_cur_amt1() {
		return getConstNumber(offset + 73, $base_cur_amt1);
	}

	/**
	 * Amount 1 (Base currency) 基準通貨金額１.<p>
	 *
	 */
	public void base_cur_amt1(MCNumber value) {
		setConstNumber(offset + 73, $base_cur_amt1, value);
	}

	/**
	 * Amount 1 (Base currency) 基準通貨金額１.<p>
	 *
	 */
	public void base_cur_amt1(int value) {
		setConstNumber(offset + 73, $base_cur_amt1, value);
	}

	/**
	 * Amount 1 (Base currency) 基準通貨金額１.<p>
	 *
	 */
	public void base_cur_amt1(long value) {
		setConstNumber(offset + 73, $base_cur_amt1, value);
	}

	/**
	 * Amount 1 (Base currency) 基準通貨金額１.<p>
	 *
	 */
	public void base_cur_amt1(float value) {
		setConstNumber(offset + 73, $base_cur_amt1, value);
	}

	/**
	 * Amount 1 (Base currency) 基準通貨金額１.<p>
	 *
	 */
	public void base_cur_amt1(double value) {
		setConstNumber(offset + 73, $base_cur_amt1, value);
	}


	/**
	 * Amount 2 (Base currency) 基準通貨金額２.<p>
	 *
	 */
	public MCNumber base_cur_amt2() {
		return getConstNumber(offset + 74, $base_cur_amt2);
	}

	/**
	 * Amount 2 (Base currency) 基準通貨金額２.<p>
	 *
	 */
	public void base_cur_amt2(MCNumber value) {
		setConstNumber(offset + 74, $base_cur_amt2, value);
	}

	/**
	 * Amount 2 (Base currency) 基準通貨金額２.<p>
	 *
	 */
	public void base_cur_amt2(int value) {
		setConstNumber(offset + 74, $base_cur_amt2, value);
	}

	/**
	 * Amount 2 (Base currency) 基準通貨金額２.<p>
	 *
	 */
	public void base_cur_amt2(long value) {
		setConstNumber(offset + 74, $base_cur_amt2, value);
	}

	/**
	 * Amount 2 (Base currency) 基準通貨金額２.<p>
	 *
	 */
	public void base_cur_amt2(float value) {
		setConstNumber(offset + 74, $base_cur_amt2, value);
	}

	/**
	 * Amount 2 (Base currency) 基準通貨金額２.<p>
	 *
	 */
	public void base_cur_amt2(double value) {
		setConstNumber(offset + 74, $base_cur_amt2, value);
	}


	/**
	 * Amount 3 (Base currency) 基準通貨金額３.<p>
	 *
	 */
	public MCNumber base_cur_amt3() {
		return getConstNumber(offset + 75, $base_cur_amt3);
	}

	/**
	 * Amount 3 (Base currency) 基準通貨金額３.<p>
	 *
	 */
	public void base_cur_amt3(MCNumber value) {
		setConstNumber(offset + 75, $base_cur_amt3, value);
	}

	/**
	 * Amount 3 (Base currency) 基準通貨金額３.<p>
	 *
	 */
	public void base_cur_amt3(int value) {
		setConstNumber(offset + 75, $base_cur_amt3, value);
	}

	/**
	 * Amount 3 (Base currency) 基準通貨金額３.<p>
	 *
	 */
	public void base_cur_amt3(long value) {
		setConstNumber(offset + 75, $base_cur_amt3, value);
	}

	/**
	 * Amount 3 (Base currency) 基準通貨金額３.<p>
	 *
	 */
	public void base_cur_amt3(float value) {
		setConstNumber(offset + 75, $base_cur_amt3, value);
	}

	/**
	 * Amount 3 (Base currency) 基準通貨金額３.<p>
	 *
	 */
	public void base_cur_amt3(double value) {
		setConstNumber(offset + 75, $base_cur_amt3, value);
	}


	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return getConstNumber(offset + 76, $base_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 76, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		setConstNumber(offset + 76, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		setConstNumber(offset + 76, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		setConstNumber(offset + 76, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		setConstNumber(offset + 76, $base_cur_dscnt_amt, value);
	}


	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 77, $base_cur_tax_amt);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 77, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 77, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 77, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 77, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 77, $base_cur_tax_amt, value);
	}


	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public String tax_typ() {
		return getConstString(offset + 78, $tax_typ);
	}

	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public void tax_typ(String value) {
		setConstString(offset + 78, $tax_typ, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 79, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 79, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 79, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 79, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 79, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 79, $tax_rate, value);
	}


	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 80, $trd_cur_tax_amt);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 80, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 80, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 80, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 80, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 80, $trd_cur_tax_amt, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 81, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 81, $tax_cd, value);
	}


	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 82, $wtax_rate);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 82, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 82, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 82, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 82, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 82, $wtax_rate, value);
	}


	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return getConstNumber(offset + 83, $wtax_amt);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		setConstNumber(offset + 83, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		setConstNumber(offset + 83, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		setConstNumber(offset + 83, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		setConstNumber(offset + 83, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		setConstNumber(offset + 83, $wtax_amt, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 84, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 84, $trd_d_rmrks, value);
	}


	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public String bill_d_rmrks() {
		return getConstString(offset + 85, $bill_d_rmrks);
	}

	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public void bill_d_rmrks(String value) {
		setConstString(offset + 85, $bill_d_rmrks, value);
	}


	/**
	 * Parent result No. 親実績ＮＯ.<p>
	 *
	 */
	public String par_act_no() {
		return getConstString(offset + 86, $par_act_no);
	}

	/**
	 * Parent result No. 親実績ＮＯ.<p>
	 *
	 */
	public void par_act_no(String value) {
		setConstString(offset + 86, $par_act_no, value);
	}


	/**
	 * Parent result sequence number 親実績連番.<p>
	 *
	 */
	public MCNumber par_act_seq() {
		return getConstNumber(offset + 87, $par_act_seq);
	}

	/**
	 * Parent result sequence number 親実績連番.<p>
	 *
	 */
	public void par_act_seq(MCNumber value) {
		setConstNumber(offset + 87, $par_act_seq, value);
	}

	/**
	 * Parent result sequence number 親実績連番.<p>
	 *
	 */
	public void par_act_seq(int value) {
		setConstNumber(offset + 87, $par_act_seq, value);
	}

	/**
	 * Parent result sequence number 親実績連番.<p>
	 *
	 */
	public void par_act_seq(long value) {
		setConstNumber(offset + 87, $par_act_seq, value);
	}

	/**
	 * Parent result sequence number 親実績連番.<p>
	 *
	 */
	public void par_act_seq(float value) {
		setConstNumber(offset + 87, $par_act_seq, value);
	}

	/**
	 * Parent result sequence number 親実績連番.<p>
	 *
	 */
	public void par_act_seq(double value) {
		setConstNumber(offset + 87, $par_act_seq, value);
	}


	/**
	 * Billing details type 請求明細区分.<p>
	 *
	 */
	public String bill_d_typ() {
		return getConstString(offset + 88, $bill_d_typ);
	}

	/**
	 * Billing details type 請求明細区分.<p>
	 *
	 */
	public void bill_d_typ(String value) {
		setConstString(offset + 88, $bill_d_typ, value);
	}


	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 89, $slip_sts_typ);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 89, $slip_sts_typ, value);
	}


	/**
	 * Corresponding I/V No. 対応インボイスＮＯ.<p>
	 *
	 */
	public String ref_iv_no() {
		return getConstString(offset + 90, $ref_iv_no);
	}

	/**
	 * Corresponding I/V No. 対応インボイスＮＯ.<p>
	 *
	 */
	public void ref_iv_no(String value) {
		setConstString(offset + 90, $ref_iv_no, value);
	}


	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDate rcv_schd_dt() {
		return getConstDate(offset + 91, $rcv_schd_dt);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_schd_dt(MCDate value) {
		setConstDate(offset + 91, $rcv_schd_dt, value);
	}


	/**
	 * For tax variance flg. 税差額対象ＦＬＧ.<p>
	 *
	 */
	public boolean tgt_flg() {
		return getConstBoolean(offset + 92, $tgt_flg);
	}

	/**
	 * For tax variance flg. 税差額対象ＦＬＧ.<p>
	 *
	 */
	public void tgt_flg(boolean value) {
		setConstBoolean(offset + 92, $tgt_flg, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 93, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 93, $wrk_no, value);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 94, $ar_typ);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 94, $ar_typ, value);
	}


	/**
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public MCDate bill_cl_dt() {
		return getConstDate(offset + 95, $bill_cl_dt);
	}

	/**
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public void bill_cl_dt(MCDate value) {
		setConstDate(offset + 95, $bill_cl_dt, value);
	}


	/**
	 * AR project No. 債権案件ＮＯ.<p>
	 *
	 */
	public String ar_wrk_no() {
		return getConstString(offset + 96, $ar_wrk_no);
	}

	/**
	 * AR project No. 債権案件ＮＯ.<p>
	 *
	 */
	public void ar_wrk_no(String value) {
		setConstString(offset + 96, $ar_wrk_no, value);
	}


	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public MCNumber exc_gain_loss() {
		return getConstNumber(offset + 97, $exc_gain_loss);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(MCNumber value) {
		setConstNumber(offset + 97, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(int value) {
		setConstNumber(offset + 97, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(long value) {
		setConstNumber(offset + 97, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(float value) {
		setConstNumber(offset + 97, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(double value) {
		setConstNumber(offset + 97, $exc_gain_loss, value);
	}


	/**
	 * AR management by sales project flg. (Customer) 案件別債権管理ＦＬＧ（得意先）.<p>
	 *
	 */
	public boolean cst_wrk_ar_flg() {
		return getConstBoolean(offset + 98, $cst_wrk_ar_flg);
	}

	/**
	 * AR management by sales project flg. (Customer) 案件別債権管理ＦＬＧ（得意先）.<p>
	 *
	 */
	public void cst_wrk_ar_flg(boolean value) {
		setConstBoolean(offset + 98, $cst_wrk_ar_flg, value);
	}


	/**
	 * AR management by sales project flg. (Sales project) 案件別債権管理ＦＬＧ（案件）.<p>
	 *
	 */
	public boolean wrk_ar_flg() {
		return getConstBoolean(offset + 99, $wrk_ar_flg);
	}

	/**
	 * AR management by sales project flg. (Sales project) 案件別債権管理ＦＬＧ（案件）.<p>
	 *
	 */
	public void wrk_ar_flg(boolean value) {
		setConstBoolean(offset + 99, $wrk_ar_flg, value);
	}


	/**
	 * Discount item flg. 値引品目ＦＬＧ.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 100, $dscnt_itm_flg);
	}

	/**
	 * Discount item flg. 値引品目ＦＬＧ.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 100, $dscnt_itm_flg, value);
	}


	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public String bill_dpt_typ() {
		return getConstString(offset + 101, $bill_dpt_typ);
	}

	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public void bill_dpt_typ(String value) {
		setConstString(offset + 101, $bill_dpt_typ, value);
	}


	/**
	 * Billing dept. cd. before change 変更前請求部門ＣＤ.<p>
	 *
	 */
	public String bef_bill_dpt_cd() {
		return getConstString(offset + 102, $bef_bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. before change 変更前請求部門ＣＤ.<p>
	 *
	 */
	public void bef_bill_dpt_cd(String value) {
		setConstString(offset + 102, $bef_bill_dpt_cd, value);
	}


	/**
	 * Billing dept. base date 請求部門基準日.<p>
	 *
	 */
	public MCDate bill_dpt_base_dt() {
		return getConstDate(offset + 103, $bill_dpt_base_dt);
	}

	/**
	 * Billing dept. base date 請求部門基準日.<p>
	 *
	 */
	public void bill_dpt_base_dt(MCDate value) {
		setConstDate(offset + 103, $bill_dpt_base_dt, value);
	}


	public String bill_d_no() {
		return getConstString(offset + 104, $bill_d_no);
	}

	public void bill_d_no(String value) {
		setConstString(offset + 104, $bill_d_no, value);
	}


	/**
	 * Tax inclusive amount 1 (Transaction currency) 取引通貨内税額１.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt1() {
		return getConstNumber(offset + 105, $trd_cur_tax_amt1);
	}

	/**
	 * Tax inclusive amount 1 (Transaction currency) 取引通貨内税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(MCNumber value) {
		setConstNumber(offset + 105, $trd_cur_tax_amt1, value);
	}

	/**
	 * Tax inclusive amount 1 (Transaction currency) 取引通貨内税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(int value) {
		setConstNumber(offset + 105, $trd_cur_tax_amt1, value);
	}

	/**
	 * Tax inclusive amount 1 (Transaction currency) 取引通貨内税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(long value) {
		setConstNumber(offset + 105, $trd_cur_tax_amt1, value);
	}

	/**
	 * Tax inclusive amount 1 (Transaction currency) 取引通貨内税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(float value) {
		setConstNumber(offset + 105, $trd_cur_tax_amt1, value);
	}

	/**
	 * Tax inclusive amount 1 (Transaction currency) 取引通貨内税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(double value) {
		setConstNumber(offset + 105, $trd_cur_tax_amt1, value);
	}


	/**
	 * Tax inclusive amount 2 (Transaction currency) 取引通貨内税額２.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt2() {
		return getConstNumber(offset + 106, $trd_cur_tax_amt2);
	}

	/**
	 * Tax inclusive amount 2 (Transaction currency) 取引通貨内税額２.<p>
	 *
	 */
	public void trd_cur_tax_amt2(MCNumber value) {
		setConstNumber(offset + 106, $trd_cur_tax_amt2, value);
	}

	/**
	 * Tax inclusive amount 2 (Transaction currency) 取引通貨内税額２.<p>
	 *
	 */
	public void trd_cur_tax_amt2(int value) {
		setConstNumber(offset + 106, $trd_cur_tax_amt2, value);
	}

	/**
	 * Tax inclusive amount 2 (Transaction currency) 取引通貨内税額２.<p>
	 *
	 */
	public void trd_cur_tax_amt2(long value) {
		setConstNumber(offset + 106, $trd_cur_tax_amt2, value);
	}

	/**
	 * Tax inclusive amount 2 (Transaction currency) 取引通貨内税額２.<p>
	 *
	 */
	public void trd_cur_tax_amt2(float value) {
		setConstNumber(offset + 106, $trd_cur_tax_amt2, value);
	}

	/**
	 * Tax inclusive amount 2 (Transaction currency) 取引通貨内税額２.<p>
	 *
	 */
	public void trd_cur_tax_amt2(double value) {
		setConstNumber(offset + 106, $trd_cur_tax_amt2, value);
	}


	/**
	 * Tax inclusive amount 3 (Transaction currency) 取引通貨内税額３.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt3() {
		return getConstNumber(offset + 107, $trd_cur_tax_amt3);
	}

	/**
	 * Tax inclusive amount 3 (Transaction currency) 取引通貨内税額３.<p>
	 *
	 */
	public void trd_cur_tax_amt3(MCNumber value) {
		setConstNumber(offset + 107, $trd_cur_tax_amt3, value);
	}

	/**
	 * Tax inclusive amount 3 (Transaction currency) 取引通貨内税額３.<p>
	 *
	 */
	public void trd_cur_tax_amt3(int value) {
		setConstNumber(offset + 107, $trd_cur_tax_amt3, value);
	}

	/**
	 * Tax inclusive amount 3 (Transaction currency) 取引通貨内税額３.<p>
	 *
	 */
	public void trd_cur_tax_amt3(long value) {
		setConstNumber(offset + 107, $trd_cur_tax_amt3, value);
	}

	/**
	 * Tax inclusive amount 3 (Transaction currency) 取引通貨内税額３.<p>
	 *
	 */
	public void trd_cur_tax_amt3(float value) {
		setConstNumber(offset + 107, $trd_cur_tax_amt3, value);
	}

	/**
	 * Tax inclusive amount 3 (Transaction currency) 取引通貨内税額３.<p>
	 *
	 */
	public void trd_cur_tax_amt3(double value) {
		setConstNumber(offset + 107, $trd_cur_tax_amt3, value);
	}


	/**
	 * Tax inclusive amount 1 (Base currency) 基準通貨内税額１.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt1() {
		return getConstNumber(offset + 108, $base_cur_tax_amt1);
	}

	/**
	 * Tax inclusive amount 1 (Base currency) 基準通貨内税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(MCNumber value) {
		setConstNumber(offset + 108, $base_cur_tax_amt1, value);
	}

	/**
	 * Tax inclusive amount 1 (Base currency) 基準通貨内税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(int value) {
		setConstNumber(offset + 108, $base_cur_tax_amt1, value);
	}

	/**
	 * Tax inclusive amount 1 (Base currency) 基準通貨内税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(long value) {
		setConstNumber(offset + 108, $base_cur_tax_amt1, value);
	}

	/**
	 * Tax inclusive amount 1 (Base currency) 基準通貨内税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(float value) {
		setConstNumber(offset + 108, $base_cur_tax_amt1, value);
	}

	/**
	 * Tax inclusive amount 1 (Base currency) 基準通貨内税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(double value) {
		setConstNumber(offset + 108, $base_cur_tax_amt1, value);
	}


	/**
	 * Tax inclusive amount 2 (Base currency) 基準通貨内税額２.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt2() {
		return getConstNumber(offset + 109, $base_cur_tax_amt2);
	}

	/**
	 * Tax inclusive amount 2 (Base currency) 基準通貨内税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(MCNumber value) {
		setConstNumber(offset + 109, $base_cur_tax_amt2, value);
	}

	/**
	 * Tax inclusive amount 2 (Base currency) 基準通貨内税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(int value) {
		setConstNumber(offset + 109, $base_cur_tax_amt2, value);
	}

	/**
	 * Tax inclusive amount 2 (Base currency) 基準通貨内税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(long value) {
		setConstNumber(offset + 109, $base_cur_tax_amt2, value);
	}

	/**
	 * Tax inclusive amount 2 (Base currency) 基準通貨内税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(float value) {
		setConstNumber(offset + 109, $base_cur_tax_amt2, value);
	}

	/**
	 * Tax inclusive amount 2 (Base currency) 基準通貨内税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(double value) {
		setConstNumber(offset + 109, $base_cur_tax_amt2, value);
	}


	/**
	 * Tax inclusive amount 3 (Base currency) 基準通貨内税額３.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt3() {
		return getConstNumber(offset + 110, $base_cur_tax_amt3);
	}

	/**
	 * Tax inclusive amount 3 (Base currency) 基準通貨内税額３.<p>
	 *
	 */
	public void base_cur_tax_amt3(MCNumber value) {
		setConstNumber(offset + 110, $base_cur_tax_amt3, value);
	}

	/**
	 * Tax inclusive amount 3 (Base currency) 基準通貨内税額３.<p>
	 *
	 */
	public void base_cur_tax_amt3(int value) {
		setConstNumber(offset + 110, $base_cur_tax_amt3, value);
	}

	/**
	 * Tax inclusive amount 3 (Base currency) 基準通貨内税額３.<p>
	 *
	 */
	public void base_cur_tax_amt3(long value) {
		setConstNumber(offset + 110, $base_cur_tax_amt3, value);
	}

	/**
	 * Tax inclusive amount 3 (Base currency) 基準通貨内税額３.<p>
	 *
	 */
	public void base_cur_tax_amt3(float value) {
		setConstNumber(offset + 110, $base_cur_tax_amt3, value);
	}

	/**
	 * Tax inclusive amount 3 (Base currency) 基準通貨内税額３.<p>
	 *
	 */
	public void base_cur_tax_amt3(double value) {
		setConstNumber(offset + 110, $base_cur_tax_amt3, value);
	}


	public String getString(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($rcv_typ.equalsIgnoreCase(name)) {
			return rcv_typ();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($ar_appl_schd_no.equalsIgnoreCase(name)) {
			return ar_appl_schd_no();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_no();
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_d_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($bill_iv_no.equalsIgnoreCase(name)) {
			return bill_iv_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			return bill_d_rmrks();
		}
		if ($par_act_no.equalsIgnoreCase(name)) {
			return par_act_no();
		}
		if ($bill_d_typ.equalsIgnoreCase(name)) {
			return bill_d_typ();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($ref_iv_no.equalsIgnoreCase(name)) {
			return ref_iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_wrk_no.equalsIgnoreCase(name)) {
			return ar_wrk_no();
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			return bill_dpt_typ();
		}
		if ($bef_bill_dpt_cd.equalsIgnoreCase(name)) {
			return bef_bill_dpt_cd();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($act_seq.equalsIgnoreCase(name)) {
			return act_seq();
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			return act_rev();
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			return act_d_seq();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			return trd_cur_amt1();
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			return trd_cur_amt2();
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			return trd_cur_amt3();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			return base_cur_amt1();
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			return base_cur_amt2();
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			return base_cur_amt3();
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($par_act_seq.equalsIgnoreCase(name)) {
			return par_act_seq();
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			return exc_gain_loss();
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt1();
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt2();
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt3();
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			return base_cur_tax_amt1();
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			return base_cur_tax_amt2();
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			return base_cur_tax_amt3();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($inpt_ac_dt.equalsIgnoreCase(name)) {
			return inpt_ac_dt();
		}
		if ($inpt_ac_ym.equalsIgnoreCase(name)) {
			return inpt_ac_ym();
		}
		if ($dlv_dt.equalsIgnoreCase(name)) {
			return dlv_dt();
		}
		if ($base_sls_ac_dt.equalsIgnoreCase(name)) {
			return base_sls_ac_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			return bill_cl_dt();
		}
		if ($bill_dpt_base_dt.equalsIgnoreCase(name)) {
			return bill_dpt_base_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($ship_dlv_slip_multi_flg.equalsIgnoreCase(name)) {
			return ship_dlv_slip_multi_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($tgt_flg.equalsIgnoreCase(name)) {
			return tgt_flg();
		}
		if ($cst_wrk_ar_flg.equalsIgnoreCase(name)) {
			return cst_wrk_ar_flg();
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			return wrk_ar_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($rcv_typ.equalsIgnoreCase(name)) {
			return rcv_typ();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($ar_appl_schd_no.equalsIgnoreCase(name)) {
			return ar_appl_schd_no();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_no();
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_d_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($bill_iv_no.equalsIgnoreCase(name)) {
			return bill_iv_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			return bill_d_rmrks();
		}
		if ($par_act_no.equalsIgnoreCase(name)) {
			return par_act_no();
		}
		if ($bill_d_typ.equalsIgnoreCase(name)) {
			return bill_d_typ();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($ref_iv_no.equalsIgnoreCase(name)) {
			return ref_iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_wrk_no.equalsIgnoreCase(name)) {
			return ar_wrk_no();
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			return bill_dpt_typ();
		}
		if ($bef_bill_dpt_cd.equalsIgnoreCase(name)) {
			return bef_bill_dpt_cd();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($act_seq.equalsIgnoreCase(name)) {
			return act_seq();
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			return act_rev();
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			return act_d_seq();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			return trd_cur_amt1();
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			return trd_cur_amt2();
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			return trd_cur_amt3();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			return base_cur_amt1();
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			return base_cur_amt2();
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			return base_cur_amt3();
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($par_act_seq.equalsIgnoreCase(name)) {
			return par_act_seq();
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			return exc_gain_loss();
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt1();
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt2();
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt3();
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			return base_cur_tax_amt1();
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			return base_cur_tax_amt2();
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			return base_cur_tax_amt3();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($inpt_ac_dt.equalsIgnoreCase(name)) {
			return inpt_ac_dt();
		}
		if ($inpt_ac_ym.equalsIgnoreCase(name)) {
			return inpt_ac_ym();
		}
		if ($dlv_dt.equalsIgnoreCase(name)) {
			return dlv_dt();
		}
		if ($base_sls_ac_dt.equalsIgnoreCase(name)) {
			return base_sls_ac_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			return bill_cl_dt();
		}
		if ($bill_dpt_base_dt.equalsIgnoreCase(name)) {
			return bill_dpt_base_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($ship_dlv_slip_multi_flg.equalsIgnoreCase(name)) {
			return ship_dlv_slip_multi_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($tgt_flg.equalsIgnoreCase(name)) {
			return tgt_flg();
		}
		if ($cst_wrk_ar_flg.equalsIgnoreCase(name)) {
			return cst_wrk_ar_flg();
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			return wrk_ar_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($rcv_typ.equalsIgnoreCase(name)) {
			rcv_typ(value);
			return;
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			rcv_mtd_cd(value);
			return;
		}
		if ($ar_appl_schd_no.equalsIgnoreCase(name)) {
			ar_appl_schd_no(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_no(value);
			return;
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_d_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($bill_iv_no.equalsIgnoreCase(name)) {
			bill_iv_no(value);
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
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			bill_d_rmrks(value);
			return;
		}
		if ($par_act_no.equalsIgnoreCase(name)) {
			par_act_no(value);
			return;
		}
		if ($bill_d_typ.equalsIgnoreCase(name)) {
			bill_d_typ(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($ref_iv_no.equalsIgnoreCase(name)) {
			ref_iv_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_wrk_no.equalsIgnoreCase(name)) {
			ar_wrk_no(value);
			return;
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			bill_dpt_typ(value);
			return;
		}
		if ($bef_bill_dpt_cd.equalsIgnoreCase(name)) {
			bef_bill_dpt_cd(value);
			return;
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($par_act_seq.equalsIgnoreCase(name)) {
			par_act_seq(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($par_act_seq.equalsIgnoreCase(name)) {
			par_act_seq(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($par_act_seq.equalsIgnoreCase(name)) {
			par_act_seq(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($par_act_seq.equalsIgnoreCase(name)) {
			par_act_seq(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($par_act_seq.equalsIgnoreCase(name)) {
			par_act_seq(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($inpt_ac_dt.equalsIgnoreCase(name)) {
			inpt_ac_dt(value);
			return;
		}
		if ($inpt_ac_ym.equalsIgnoreCase(name)) {
			inpt_ac_ym(value);
			return;
		}
		if ($dlv_dt.equalsIgnoreCase(name)) {
			dlv_dt(value);
			return;
		}
		if ($base_sls_ac_dt.equalsIgnoreCase(name)) {
			base_sls_ac_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			bill_cl_dt(value);
			return;
		}
		if ($bill_dpt_base_dt.equalsIgnoreCase(name)) {
			bill_dpt_base_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($ship_dlv_slip_multi_flg.equalsIgnoreCase(name)) {
			ship_dlv_slip_multi_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($tgt_flg.equalsIgnoreCase(name)) {
			tgt_flg(value);
			return;
		}
		if ($cst_wrk_ar_flg.equalsIgnoreCase(name)) {
			cst_wrk_ar_flg(value);
			return;
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			wrk_ar_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($rcv_typ.equalsIgnoreCase(name)) {
			rcv_typ(value);
			return;
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			rcv_mtd_cd(value);
			return;
		}
		if ($ar_appl_schd_no.equalsIgnoreCase(name)) {
			ar_appl_schd_no(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_no(value);
			return;
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_d_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($bill_iv_no.equalsIgnoreCase(name)) {
			bill_iv_no(value);
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
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			bill_d_rmrks(value);
			return;
		}
		if ($par_act_no.equalsIgnoreCase(name)) {
			par_act_no(value);
			return;
		}
		if ($bill_d_typ.equalsIgnoreCase(name)) {
			bill_d_typ(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($ref_iv_no.equalsIgnoreCase(name)) {
			ref_iv_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_wrk_no.equalsIgnoreCase(name)) {
			ar_wrk_no(value);
			return;
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			bill_dpt_typ(value);
			return;
		}
		if ($bef_bill_dpt_cd.equalsIgnoreCase(name)) {
			bef_bill_dpt_cd(value);
			return;
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($par_act_seq.equalsIgnoreCase(name)) {
			par_act_seq(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($par_act_seq.equalsIgnoreCase(name)) {
			par_act_seq(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($par_act_seq.equalsIgnoreCase(name)) {
			par_act_seq(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($par_act_seq.equalsIgnoreCase(name)) {
			par_act_seq(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($par_act_seq.equalsIgnoreCase(name)) {
			par_act_seq(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($inpt_ac_dt.equalsIgnoreCase(name)) {
			inpt_ac_dt(value);
			return;
		}
		if ($inpt_ac_ym.equalsIgnoreCase(name)) {
			inpt_ac_ym(value);
			return;
		}
		if ($dlv_dt.equalsIgnoreCase(name)) {
			dlv_dt(value);
			return;
		}
		if ($base_sls_ac_dt.equalsIgnoreCase(name)) {
			base_sls_ac_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			bill_cl_dt(value);
			return;
		}
		if ($bill_dpt_base_dt.equalsIgnoreCase(name)) {
			bill_dpt_base_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($ship_dlv_slip_multi_flg.equalsIgnoreCase(name)) {
			ship_dlv_slip_multi_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($tgt_flg.equalsIgnoreCase(name)) {
			tgt_flg(value);
			return;
		}
		if ($cst_wrk_ar_flg.equalsIgnoreCase(name)) {
			cst_wrk_ar_flg(value);
			return;
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			wrk_ar_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

