package mcframe.clientMSBG.MSBGP0210;

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
 * ブロック"Rcv"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RcvR_MC_A extends MCConstRow {

	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public static final String $rcv_no = "rcv_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public static final String $rcv_dt = "rcv_dt";
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public static final String $rcst_nm = "rcst_nm";
	/**
	 * Original payer cd. 元入金先ＣＤ.<p>
	 *
	 */
	public static final String $old_rcst_cd = "old_rcst_cd";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public static final String $bcst_nm = "bcst_nm";
	/**
	 * Original billing cd. 元請求先ＣＤ.<p>
	 *
	 */
	public static final String $old_bcst_cd = "old_bcst_cd";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public static final String $bill_dpt_nm = "bill_dpt_nm";
	/**
	 * Original billing dept. cd. 元請求部門ＣＤ.<p>
	 *
	 */
	public static final String $old_bill_dpt_cd = "old_bill_dpt_cd";
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
	public static final String $xrate_p = "xrate_p";
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	public static final String $rcv_amt_p = "rcv_amt_p";
	public static final String $not_proc_bal_p = "not_proc_bal_p";
	public static final String $not_proc_bal_w_p = "not_proc_bal_w_p";
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public static final String $ar_sttl_cd1 = "ar_sttl_cd1";
	/**
	 * Payment received type 入金区分.<p>
	 *
	 */
	public static final String $ar_sttl_typ1 = "ar_sttl_typ1";
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public static final String $ar_sttl_nm1 = "ar_sttl_nm1";
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public static final String $bank_ac_nm = "bank_ac_nm";
	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public static final String $xfr_psn = "xfr_psn";
	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public static final String $ar_sttl_cd2 = "ar_sttl_cd2";
	/**
	 * AR settlement type 2 債権決済区分２.<p>
	 *
	 */
	public static final String $ar_sttl_typ2 = "ar_sttl_typ2";
	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public static final String $ar_sttl_nm2 = "ar_sttl_nm2";
	/**
	 * Sales purchase tax type 売上仕入税区分.<p>
	 *
	 */
	public static final String $sls_purc_typ2 = "sls_purc_typ2";
	/**
	 * Sales flg. 売上ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_flg = "purc_flg";
	/**
	 * Purchase flg. 仕入ＦＬＧ.<p>
	 *
	 */
	public static final String $sls_flg = "sls_flg";
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd_sub = "tax_cd_sub";
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
	 * Debtor identification type 借方先識別区分.<p>
	 *
	 */
	public static final String $debt_cred_id_typ = "debt_cred_id_typ";
	/**
	 * Debtor identification type name 借方先識別区分名.<p>
	 *
	 */
	public static final String $debt_cred_id_typ_nm = "debt_cred_id_typ_nm";
	/**
	 * Debtor cd. 借方先ＣＤ.<p>
	 *
	 */
	public static final String $debt_cred_id_cd = "debt_cred_id_cd";
	/**
	 * Debtor name 借方先名.<p>
	 *
	 */
	public static final String $debt_cred_nm = "debt_cred_nm";
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public static final String $bd_dpt_nm = "bd_dpt_nm";
	/**
	 * Payment received info. type 入金情報区分.<p>
	 *
	 */
	public static final String $rcv_dat_typ = "rcv_dat_typ";
	/**
	 * Payment received info. type name 入金情報区分名.<p>
	 *
	 */
	public static final String $rcv_dat_typ_nm = "rcv_dat_typ_nm";
	/**
	 * Advance/suspense received corresponding transaction 前受仮受対応取引.<p>
	 *
	 */
	public static final String $adv_trd_cd = "adv_trd_cd";
	/**
	 * Advance/suspense received corresponding transaction name 前受仮受対応取引名.<p>
	 *
	 */
	public static final String $adv_trd_nm = "adv_trd_nm";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
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
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public static final String $rcv_upd_cntr = "rcv_upd_cntr";
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public static final String $note_no = "note_no";
	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public static final String $note_typ = "note_typ";
	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public static final String $note_typ_nm = "note_typ_nm";
	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public static final String $draw_dt = "draw_dt";
	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public static final String $due_dt = "due_dt";
	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public static final String $drawer_nm = "drawer_nm";
	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public static final String $endrsr = "endrsr";
	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public static final String $accptr = "accptr";
	/**
	 * Drawing bank 振出銀行.<p>
	 *
	 */
	public static final String $draw_bank_cd = "draw_bank_cd";
	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public static final String $draw_bank_nm = "draw_bank_nm";
	/**
	 * Drawing branch 振出支店.<p>
	 *
	 */
	public static final String $draw_branch_cd = "draw_branch_cd";
	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public static final String $draw_branch_nm = "draw_branch_nm";
	/**
	 * Note reason 手形理由.<p>
	 *
	 */
	public static final String $note_rsn_cd = "note_rsn_cd";
	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public static final String $note_rsn_nm = "note_rsn_nm";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $note_sub_char1 = "note_sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $note_sub_char2 = "note_sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $note_sub_char3 = "note_sub_char3";
	/**
	 * Note management No. 手形管理ＮＯ.<p>
	 *
	 */
	public static final String $note_mng_no = "note_mng_no";
	/**
	 * Offset payment received No. 相殺入金ＮＯ.<p>
	 *
	 */
	public static final String $setoff_rcv_no = "setoff_rcv_no";
	/**
	 * Offset date 相殺日.<p>
	 *
	 */
	public static final String $setoff_dt = "setoff_dt";
	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public static final String $setoff_bcst_cd = "setoff_bcst_cd";
	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public static final String $setoff_bcst_nm = "setoff_bcst_nm";
	/**
	 * Original offset destination cd. 元相殺先ＣＤ.<p>
	 *
	 */
	public static final String $old_setoff_bcst_cd = "old_setoff_bcst_cd";
	/**
	 * Offset currency cd. 相殺通貨ＣＤ.<p>
	 *
	 */
	public static final String $setoff_trd_cur_cd = "setoff_trd_cur_cd";
	/**
	 * Offset currency name 相殺通貨名.<p>
	 *
	 */
	public static final String $setoff_trd_cur_nm = "setoff_trd_cur_nm";
	public static final String $setoff_xrate_p = "setoff_xrate_p";
	/**
	 * Offset exchange rate cd. 相殺為替レートＣＤ.<p>
	 *
	 */
	public static final String $setoff_xrate_cd = "setoff_xrate_cd";
	public static final String $setoff_rcv_amt_p = "setoff_rcv_amt_p";
	public static final String $setoff_not_proc_bal_p = "setoff_not_proc_bal_p";
	public static final String $setoff_not_proc_bal_w_p = "setoff_not_proc_bal_w_p";
	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public static final String $setoff_sttl_cd1 = "setoff_sttl_cd1";
	/**
	 * Offset AR settlement type 相殺債権決済区分.<p>
	 *
	 */
	public static final String $setoff_sttl_typ1 = "setoff_sttl_typ1";
	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public static final String $setoff_sttl_nm1 = "setoff_sttl_nm1";
	/**
	 * Offset sales purchase tax type 相殺売上仕入税区分.<p>
	 *
	 */
	public static final String $setoff_sls_purc_typ = "setoff_sls_purc_typ";
	/**
	 * Offset sales flg. 相殺売上ＦＬＧ.<p>
	 *
	 */
	public static final String $setoff_purc_flg = "setoff_purc_flg";
	/**
	 * Offset purchase flg. 相殺仕入ＦＬＧ.<p>
	 *
	 */
	public static final String $setoff_sls_flg = "setoff_sls_flg";
	/**
	 * Offset tax cd. 相殺税ＣＤ.<p>
	 *
	 */
	public static final String $setoff_tax_cd_sub = "setoff_tax_cd_sub";
	/**
	 * Offset tax cd. 相殺税ＣＤ.<p>
	 *
	 */
	public static final String $setoff_tax_cd = "setoff_tax_cd";
	/**
	 * Offset tax name 相殺税名.<p>
	 *
	 */
	public static final String $setoff_tax_nm = "setoff_tax_nm";
	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public static final String $setoff_tax_rate = "setoff_tax_rate";
	/**
	 * Offset debtor identification type 相殺借方先識別区分.<p>
	 *
	 */
	public static final String $setoff_debt_cred_id_typ = "setoff_debt_cred_id_typ";
	/**
	 * Offset debtor identification type name 相殺借方先識別区分名.<p>
	 *
	 */
	public static final String $setoff_debt_cred_id_typ_nm = "setoff_debt_cred_id_typ_nm";
	/**
	 * Offset debtor cd. 相殺借方先ＣＤ.<p>
	 *
	 */
	public static final String $setoff_debt_cred_id_cd = "setoff_debt_cred_id_cd";
	/**
	 * Offset debtor name 相殺借方先名.<p>
	 *
	 */
	public static final String $setoff_debt_cred_nm = "setoff_debt_cred_nm";
	/**
	 * Offset charged dept. cd. 相殺負担部門ＣＤ.<p>
	 *
	 */
	public static final String $setoff_bd_dpt_cd = "setoff_bd_dpt_cd";
	/**
	 * Offset charged dept. name 相殺負担部門名.<p>
	 *
	 */
	public static final String $setoff_bd_dpt_nm = "setoff_bd_dpt_nm";
	/**
	 * Offset payment received info. type 相殺入金情報区分.<p>
	 *
	 */
	public static final String $setoff_rcv_dat_typ = "setoff_rcv_dat_typ";
	/**
	 * Offset payment received info. type name 相殺入金情報区分名.<p>
	 *
	 */
	public static final String $setoff_rcv_dat_typ_nm = "setoff_rcv_dat_typ_nm";
	/**
	 * Offsetting transaction remarks 相殺取引備考.<p>
	 *
	 */
	public static final String $setoff_trd_rmrks = "setoff_trd_rmrks";
	/**
	 * Offset spare 1 相殺予備１.<p>
	 *
	 */
	public static final String $setoff_sub_char1 = "setoff_sub_char1";
	/**
	 * Offset spare 2 相殺予備２.<p>
	 *
	 */
	public static final String $setoff_sub_char2 = "setoff_sub_char2";
	/**
	 * Offset spare 3 相殺予備３.<p>
	 *
	 */
	public static final String $setoff_sub_char3 = "setoff_sub_char3";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public static final String $upri_dec_place = "upri_dec_place";
	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_no = "rcv_act_no";
	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public static final String $rcv_act_seq = "rcv_act_seq";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";

	public static final String $xrate = $xrate_p + ".xrate";
	public static final String $rcv_amt = $rcv_amt_p + ".amt";
	public static final String $not_proc_bal = $not_proc_bal_p + ".amt";
	public static final String $not_proc_bal_w = $not_proc_bal_w_p + ".amt";
	public static final String $setoff_xrate = $setoff_xrate_p + ".xrate";
	public static final String $setoff_rcv_amt = $setoff_rcv_amt_p + ".amt";
	public static final String $setoff_not_proc_bal = $setoff_not_proc_bal_p + ".amt";
	public static final String $setoff_not_proc_bal_w = $setoff_not_proc_bal_w_p + ".amt";

	public static final MCMeta rcv_no_META = createCommonMeta($rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta rcv_dt_META = createCommonMeta($rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_nm_META = createCommonMeta($rcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta old_rcst_cd_META = createCommonMeta($old_rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta old_bcst_cd_META = createCommonMeta($old_bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_nm_META = createCommonMeta($bill_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta old_bill_dpt_cd_META = createCommonMeta($old_bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta xrate_p_META = createInnerRowMeta($xrate_p, mcframe.clientMAUB.MAUBP0420.XrateR.class);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta rcv_amt_p_META = createInnerRowMeta($rcv_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta not_proc_bal_p_META = createInnerRowMeta($not_proc_bal_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta not_proc_bal_w_p_META = createInnerRowMeta($not_proc_bal_w_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ar_sttl_cd1_META = createCommonMeta($ar_sttl_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_typ1_META = createCommonMeta($ar_sttl_typ1, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta ar_sttl_nm1_META = createCommonMeta($ar_sttl_nm1, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta bank_ac_nm_META = createCommonMeta($bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta xfr_psn_META = createCommonMeta($xfr_psn, mcframe.commonMA.meta.MA_META.XFR_PSN);
	public static final MCMeta ar_sttl_cd2_META = createCommonMeta($ar_sttl_cd2, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_typ2_META = createCommonMeta($ar_sttl_typ2, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta ar_sttl_nm2_META = createCommonMeta($ar_sttl_nm2, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta sls_purc_typ2_META = createCommonMeta($sls_purc_typ2, mcframe.commonMA.meta.MA_META.SLS_PURC_TYP);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_cd_sub_META = createCommonMeta($tax_cd_sub, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta debt_cred_id_typ_META = createCommonMeta($debt_cred_id_typ, mcframe.commonMA.meta.MA_META.DEBT_CRED_ID_TYP);
	public static final MCMeta debt_cred_id_typ_nm_META = createCommonMeta($debt_cred_id_typ_nm, mcframe.commonMA.meta.MA_META.DEBT_CRED_ID_TYP_NM);
	public static final MCMeta debt_cred_id_cd_META = createCommonMeta($debt_cred_id_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta debt_cred_nm_META = createCommonMeta($debt_cred_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta rcv_dat_typ_META = createCommonMeta($rcv_dat_typ, mcframe.commonMS.meta.MS_META.RCV_DAT_TYP);
	public static final MCMeta rcv_dat_typ_nm_META = createCommonMeta($rcv_dat_typ_nm, mcframe.commonMS.meta.MS_META.RCV_DAT_TYP_NM);
	public static final MCMeta adv_trd_cd_META = createCommonMeta($adv_trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta adv_trd_nm_META = createCommonMeta($adv_trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR3);
	public static final MCMeta rcv_upd_cntr_META = createCommonMeta($rcv_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta note_no_META = createCommonMeta($note_no, mcframe.commonMA.meta.MA_META.NOTE_NO);
	public static final MCMeta note_typ_META = createCommonMeta($note_typ, mcframe.commonMA.meta.MA_META.NOTE_TYP);
	public static final MCMeta note_typ_nm_META = createCommonMeta($note_typ_nm, mcframe.commonMA.meta.MA_META.NOTE_TYP_NM);
	public static final MCMeta draw_dt_META = createCommonMeta($draw_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta due_dt_META = createCommonMeta($due_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta drawer_nm_META = createCommonMeta($drawer_nm, mcframe.commonMA.meta.MA_META.DRAWER_NM);
	public static final MCMeta endrsr_META = createCommonMeta($endrsr, mcframe.commonMA.meta.MA_META.NOTE_ENDRSR);
	public static final MCMeta accptr_META = createCommonMeta($accptr, mcframe.commonMA.meta.MA_META.NOTE_ACCPTR);
	public static final MCMeta draw_bank_cd_META = createCommonMeta($draw_bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta draw_bank_nm_META = createCommonMeta($draw_bank_nm, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta draw_branch_cd_META = createCommonMeta($draw_branch_cd, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta draw_branch_nm_META = createCommonMeta($draw_branch_nm, mcframe.commonMA.meta.MA_META.BANK_BRANCH_NM);
	public static final MCMeta note_rsn_cd_META = createCommonMeta($note_rsn_cd, mcframe.commonMA.meta.MA_META.NOTE_RSN_CD);
	public static final MCMeta note_rsn_nm_META = createCommonMeta($note_rsn_nm, mcframe.commonMA.meta.MA_META.NOTE_RSN_NM);
	public static final MCMeta note_sub_char1_META = createCommonMeta($note_sub_char1, mcframe.commonMS.meta.MS_META.NOTE_SUB_CHAR1);
	public static final MCMeta note_sub_char2_META = createCommonMeta($note_sub_char2, mcframe.commonMS.meta.MS_META.NOTE_SUB_CHAR2);
	public static final MCMeta note_sub_char3_META = createCommonMeta($note_sub_char3, mcframe.commonMS.meta.MS_META.NOTE_SUB_CHAR3);
	public static final MCMeta note_mng_no_META = createCommonMeta($note_mng_no, mcframe.commonMA.meta.MA_META.NOTE_MNG_NO);
	public static final MCMeta setoff_rcv_no_META = createCommonMeta($setoff_rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta setoff_dt_META = createCommonMeta($setoff_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta setoff_bcst_cd_META = createCommonMeta($setoff_bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta setoff_bcst_nm_META = createCommonMeta($setoff_bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta old_setoff_bcst_cd_META = createCommonMeta($old_setoff_bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta setoff_trd_cur_cd_META = createCommonMeta($setoff_trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta setoff_trd_cur_nm_META = createCommonMeta($setoff_trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta setoff_xrate_p_META = createInnerRowMeta($setoff_xrate_p, mcframe.clientMAUB.MAUBP0420.XrateR.class);
	public static final MCMeta setoff_xrate_cd_META = createCommonMeta($setoff_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta setoff_rcv_amt_p_META = createInnerRowMeta($setoff_rcv_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta setoff_not_proc_bal_p_META = createInnerRowMeta($setoff_not_proc_bal_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta setoff_not_proc_bal_w_p_META = createInnerRowMeta($setoff_not_proc_bal_w_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta setoff_sttl_cd1_META = createCommonMeta($setoff_sttl_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta setoff_sttl_typ1_META = createCommonMeta($setoff_sttl_typ1, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta setoff_sttl_nm1_META = createCommonMeta($setoff_sttl_nm1, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta setoff_sls_purc_typ_META = createCommonMeta($setoff_sls_purc_typ, mcframe.commonMA.meta.MA_META.SLS_PURC_TYP);
	public static final MCMeta setoff_purc_flg_META = createCommonMeta($setoff_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta setoff_sls_flg_META = createCommonMeta($setoff_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta setoff_tax_cd_sub_META = createCommonMeta($setoff_tax_cd_sub, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta setoff_tax_cd_META = createCommonMeta($setoff_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta setoff_tax_nm_META = createCommonMeta($setoff_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta setoff_tax_rate_META = createCommonMeta($setoff_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta setoff_debt_cred_id_typ_META = createCommonMeta($setoff_debt_cred_id_typ, mcframe.commonMA.meta.MA_META.DEBT_CRED_ID_TYP);
	public static final MCMeta setoff_debt_cred_id_typ_nm_META = createCommonMeta($setoff_debt_cred_id_typ_nm, mcframe.commonMA.meta.MA_META.DEBT_CRED_ID_TYP_NM);
	public static final MCMeta setoff_debt_cred_id_cd_META = createCommonMeta($setoff_debt_cred_id_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta setoff_debt_cred_nm_META = createCommonMeta($setoff_debt_cred_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta setoff_bd_dpt_cd_META = createCommonMeta($setoff_bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta setoff_bd_dpt_nm_META = createCommonMeta($setoff_bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta setoff_rcv_dat_typ_META = createCommonMeta($setoff_rcv_dat_typ, mcframe.commonMS.meta.MS_META.RCV_DAT_TYP);
	public static final MCMeta setoff_rcv_dat_typ_nm_META = createCommonMeta($setoff_rcv_dat_typ_nm, mcframe.commonMS.meta.MS_META.RCV_DAT_TYP_NM);
	public static final MCMeta setoff_trd_rmrks_META = createCommonMeta($setoff_trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta setoff_sub_char1_META = createCommonMeta($setoff_sub_char1, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR1);
	public static final MCMeta setoff_sub_char2_META = createCommonMeta($setoff_sub_char2, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR2);
	public static final MCMeta setoff_sub_char3_META = createCommonMeta($setoff_sub_char3, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR3);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta upri_dec_place_META = createCommonMeta($upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rcv_act_no_META = createCommonMeta($rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta rcv_act_seq_META = createCommonMeta($rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<RcvR> constMetas = new ConstMetaList<RcvR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rcv_no_META,
			slo_no_META,
			rcv_dt_META,
			rcst_cd_META,
			rcst_nm_META,
			old_rcst_cd_META,
			bcst_cd_META,
			bcst_nm_META,
			old_bcst_cd_META,
			bill_dpt_cd_META,
			bill_dpt_nm_META,
			old_bill_dpt_cd_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			xrate_p_META,
			base_cur_cd_META,
			xrate_cd_META,
			rcv_amt_p_META,
			not_proc_bal_p_META,
			not_proc_bal_w_p_META,
			ar_sttl_cd1_META,
			ar_sttl_typ1_META,
			ar_sttl_nm1_META,
			bank_ac_cd_META,
			bank_ac_nm_META,
			xfr_psn_META,
			ar_sttl_cd2_META,
			ar_sttl_typ2_META,
			ar_sttl_nm2_META,
			sls_purc_typ2_META,
			purc_flg_META,
			sls_flg_META,
			tax_cd_sub_META,
			tax_cd_META,
			tax_nm_META,
			tax_rate_META,
			debt_cred_id_typ_META,
			debt_cred_id_typ_nm_META,
			debt_cred_id_cd_META,
			debt_cred_nm_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			rcv_dat_typ_META,
			rcv_dat_typ_nm_META,
			adv_trd_cd_META,
			adv_trd_nm_META,
			trd_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			rcv_upd_cntr_META,
			note_no_META,
			note_typ_META,
			note_typ_nm_META,
			draw_dt_META,
			due_dt_META,
			drawer_nm_META,
			endrsr_META,
			accptr_META,
			draw_bank_cd_META,
			draw_bank_nm_META,
			draw_branch_cd_META,
			draw_branch_nm_META,
			note_rsn_cd_META,
			note_rsn_nm_META,
			note_sub_char1_META,
			note_sub_char2_META,
			note_sub_char3_META,
			note_mng_no_META,
			setoff_rcv_no_META,
			setoff_dt_META,
			setoff_bcst_cd_META,
			setoff_bcst_nm_META,
			old_setoff_bcst_cd_META,
			setoff_trd_cur_cd_META,
			setoff_trd_cur_nm_META,
			setoff_xrate_p_META,
			setoff_xrate_cd_META,
			setoff_rcv_amt_p_META,
			setoff_not_proc_bal_p_META,
			setoff_not_proc_bal_w_p_META,
			setoff_sttl_cd1_META,
			setoff_sttl_typ1_META,
			setoff_sttl_nm1_META,
			setoff_sls_purc_typ_META,
			setoff_purc_flg_META,
			setoff_sls_flg_META,
			setoff_tax_cd_sub_META,
			setoff_tax_cd_META,
			setoff_tax_nm_META,
			setoff_tax_rate_META,
			setoff_debt_cred_id_typ_META,
			setoff_debt_cred_id_typ_nm_META,
			setoff_debt_cred_id_cd_META,
			setoff_debt_cred_nm_META,
			setoff_bd_dpt_cd_META,
			setoff_bd_dpt_nm_META,
			setoff_rcv_dat_typ_META,
			setoff_rcv_dat_typ_nm_META,
			setoff_trd_rmrks_META,
			setoff_sub_char1_META,
			setoff_sub_char2_META,
			setoff_sub_char3_META,
			amt_dec_place_META,
			upri_dec_place_META,
			rcv_act_no_META,
			rcv_act_seq_META,
			ac_dt_META
		},
		new String[][]{
			{
				"xrate",
				"rcv_amt",
				"not_proc_bal",
				"not_proc_bal_w",
				"setoff_xrate",
				"setoff_rcv_amt",
				"setoff_not_proc_bal",
				"setoff_not_proc_bal_w"
			},
			{
				$xrate,
				$rcv_amt,
				$not_proc_bal,
				$not_proc_bal_w,
				$setoff_xrate,
				$setoff_rcv_amt,
				$setoff_not_proc_bal,
				$setoff_not_proc_bal_w
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
				{$rcst_cd, "bp_nm;xfr_psn"},	// rcst_cd
				{$bcst_cd, "bp_nm"},	// bcst_cd
				{$bill_dpt_cd, "dpt_nm"},	// bill_dpt_cd
				{$trd_cur_cd, "cur_nm;amt_dec_place"},	// trd_cur_cd
				{$ar_sttl_cd1, "sttl_nm;ar_sttl_typ;xfr_psn;ar_setoff_cd"},	// ar_sttl_cd1
				{$ar_sttl_cd2, "sttl_nm;sls_purc_typ;ar_sttl_typ;debt_cred_id_typ;tax_cd"},	// ar_sttl_cd2
				{$debt_cred_id_typ, "debt_cred_id_typ_nm"},	// debt_cred_id_typ
				{$debt_cred_id_cd, "bp_nm"},	// debt_cred_id_cd
				{$bd_dpt_cd, "dpt_nm"},	// bd_dpt_cd
				{$draw_bank_cd, "bank_nm"},	// draw_bank_cd
				{$draw_branch_cd, "branch_nm"},	// draw_branch_cd
				{$setoff_bcst_cd, "bp_nm"},	// setoff_bcst_cd
				{$setoff_trd_cur_cd, "cur_nm;amt_dec_place"},	// setoff_trd_cur_cd
				{$setoff_sttl_cd1, "sttl_nm;sls_purc_typ;ar_sttl_typ;debt_cred_id_typ;tax_cd"},	// setoff_sttl_cd1
				{$setoff_tax_cd, "tax_nm;tax_rate"},	// setoff_tax_cd
				{$setoff_debt_cred_id_typ, "debt_cred_id_typ_nm"},	// setoff_debt_cred_id_typ
				{$setoff_debt_cred_id_cd, "bp_nm"},	// setoff_debt_cred_id_cd
				{$setoff_bd_dpt_cd, "dpt_nm"}	// setoff_bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$rcst_cd, "MAC_BP_IS_SRCH_TYP.RCST"},	// rcst_cd
				{$bcst_cd, "MAC_BP_IS_SRCH_TYP.BCST_BY_RCST;rcst_cd"},	// bcst_cd
				{$bill_dpt_cd, "bcst_cd;MAC_DPT_IS_SRCH_TYP.BCST"},	// bill_dpt_cd
				{$ar_sttl_cd1, "MAC_RCV_REG_TYP.NON;MAC_RCV_REG_TYP.ARB;rcst_cd"},	// ar_sttl_cd1
				{$ar_sttl_cd2, "rcv_dt"},	// ar_sttl_cd2
				{$tax_cd, "purc_flg;sls_flg;true"},	// tax_cd
				{$debt_cred_id_cd, "debt_cred_id_typ"},	// debt_cred_id_cd
				{$bd_dpt_cd, "MAC_DPT_IS_SRCH_TYP.ARAPBD"},	// bd_dpt_cd
				{$draw_branch_cd, "draw_bank_cd"},	// draw_branch_cd
				{$setoff_bcst_cd, "MAC_BP_IS_SRCH_TYP.BCST"},	// setoff_bcst_cd
				{$setoff_sttl_cd1, "setoff_dt"},	// setoff_sttl_cd1
				{$setoff_tax_cd, "setoff_purc_flg;setoff_sls_flg;true"},	// setoff_tax_cd
				{$setoff_debt_cred_id_cd, "setoff_debt_cred_id_typ"},	// setoff_debt_cred_id_cd
				{$setoff_bd_dpt_cd, "MAC_DPT_IS_SRCH_TYP.ARAPBD"}	// setoff_bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$rcst_cd, "bp_is_srch_typ"},	// rcst_cd
				{$bcst_cd, "bp_is_srch_typ;in_rcst_cd"},	// bcst_cd
				{$bill_dpt_cd, "bcst_cd;dpt_is_srch_typ"},	// bill_dpt_cd
				{$ar_sttl_cd1, "rcv_reg_typ1;rcv_reg_typ2;rcst_cd"},	// ar_sttl_cd1
				{$ar_sttl_cd2, "dt"},	// ar_sttl_cd2
				{$tax_cd, "purc_flg;sls_flg;inc_tax_flg"},	// tax_cd
				{$debt_cred_id_cd, "debt_cred_id_typ"},	// debt_cred_id_cd
				{$bd_dpt_cd, "dpt_is_srch_typ"},	// bd_dpt_cd
				{$draw_branch_cd, "bank_cd"},	// draw_branch_cd
				{$setoff_bcst_cd, "bp_is_srch_typ"},	// setoff_bcst_cd
				{$setoff_sttl_cd1, "dt"},	// setoff_sttl_cd1
				{$setoff_tax_cd, "purc_flg;sls_flg;inc_tax_flg"},	// setoff_tax_cd
				{$setoff_debt_cred_id_cd, "debt_cred_id_typ"},	// setoff_debt_cred_id_cd
				{$setoff_bd_dpt_cd, "dpt_is_srch_typ"}	// setoff_bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$xrate_p + ".xrate", "BASE_CUR"},	// xrate_p.xrate
				{$base_cur_cd, "BASE_CUR"},	// base_cur_cd
				{$xrate_cd, "BASE_CUR"},	// xrate_cd
				{$setoff_xrate_p + ".xrate", "BASE_CUR"},	// setoff_xrate_p.xrate
				{$setoff_xrate_cd, "BASE_CUR"}	// setoff_xrate_cd
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
	protected RcvR_MC_A(ConstMetaList<? extends RcvR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvR clone() {
		return (RcvR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvR createInstance() {
		return (RcvR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvR getValues(String... names) {
		return (RcvR) super.getValues(names);
	}



	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 0, $rcv_no);
	}

	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 0, $rcv_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 1, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 1, $slo_no, value);
	}


	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCDate rcv_dt() {
		return getConstDate(offset + 2, $rcv_dt);
	}

	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public void rcv_dt(MCDate value) {
		setConstDate(offset + 2, $rcv_dt, value);
	}


	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 3, $rcst_cd);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 3, $rcst_cd, value);
	}


	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public String rcst_nm() {
		return getConstString(offset + 4, $rcst_nm);
	}

	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public void rcst_nm(String value) {
		setConstString(offset + 4, $rcst_nm, value);
	}


	/**
	 * Original payer cd. 元入金先ＣＤ.<p>
	 *
	 */
	public String old_rcst_cd() {
		return getConstString(offset + 5, $old_rcst_cd);
	}

	/**
	 * Original payer cd. 元入金先ＣＤ.<p>
	 *
	 */
	public void old_rcst_cd(String value) {
		setConstString(offset + 5, $old_rcst_cd, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 6, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 6, $bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 7, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 7, $bcst_nm, value);
	}


	/**
	 * Original billing cd. 元請求先ＣＤ.<p>
	 *
	 */
	public String old_bcst_cd() {
		return getConstString(offset + 8, $old_bcst_cd);
	}

	/**
	 * Original billing cd. 元請求先ＣＤ.<p>
	 *
	 */
	public void old_bcst_cd(String value) {
		setConstString(offset + 8, $old_bcst_cd, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 9, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 9, $bill_dpt_cd, value);
	}


	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 10, $bill_dpt_nm);
	}

	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 10, $bill_dpt_nm, value);
	}


	/**
	 * Original billing dept. cd. 元請求部門ＣＤ.<p>
	 *
	 */
	public String old_bill_dpt_cd() {
		return getConstString(offset + 11, $old_bill_dpt_cd);
	}

	/**
	 * Original billing dept. cd. 元請求部門ＣＤ.<p>
	 *
	 */
	public void old_bill_dpt_cd(String value) {
		setConstString(offset + 11, $old_bill_dpt_cd, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 12, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 12, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 13, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 13, $trd_cur_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0420.XrateR xrate_p(){
		return (mcframe.clientMAUB.MAUBP0420.XrateR) getConstInnerRow(offset + 14, $xrate_p);
	}
	
	public void xrate_p(mcframe.clientMAUB.MAUBP0420.XrateR row){
		setConstInnerRow(offset + 14, $xrate_p, row);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 15, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 15, $base_cur_cd, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 16, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 16, $xrate_cd, value);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR rcv_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 17, $rcv_amt_p);
	}
	
	public void rcv_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 17, $rcv_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR not_proc_bal_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 18, $not_proc_bal_p);
	}
	
	public void not_proc_bal_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 18, $not_proc_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR not_proc_bal_w_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 19, $not_proc_bal_w_p);
	}
	
	public void not_proc_bal_w_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 19, $not_proc_bal_w_p, row);
	}


	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public String ar_sttl_cd1() {
		return getConstString(offset + 20, $ar_sttl_cd1);
	}

	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public void ar_sttl_cd1(String value) {
		setConstString(offset + 20, $ar_sttl_cd1, value);
	}


	/**
	 * Payment received type 入金区分.<p>
	 *
	 */
	public String ar_sttl_typ1() {
		return getConstString(offset + 21, $ar_sttl_typ1);
	}

	/**
	 * Payment received type 入金区分.<p>
	 *
	 */
	public void ar_sttl_typ1(String value) {
		setConstString(offset + 21, $ar_sttl_typ1, value);
	}


	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public String ar_sttl_nm1() {
		return getConstString(offset + 22, $ar_sttl_nm1);
	}

	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public void ar_sttl_nm1(String value) {
		setConstString(offset + 22, $ar_sttl_nm1, value);
	}


	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 23, $bank_ac_cd);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 23, $bank_ac_cd, value);
	}


	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public String bank_ac_nm() {
		return getConstString(offset + 24, $bank_ac_nm);
	}

	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public void bank_ac_nm(String value) {
		setConstString(offset + 24, $bank_ac_nm, value);
	}


	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public String xfr_psn() {
		return getConstString(offset + 25, $xfr_psn);
	}

	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public void xfr_psn(String value) {
		setConstString(offset + 25, $xfr_psn, value);
	}


	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public String ar_sttl_cd2() {
		return getConstString(offset + 26, $ar_sttl_cd2);
	}

	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public void ar_sttl_cd2(String value) {
		setConstString(offset + 26, $ar_sttl_cd2, value);
	}


	/**
	 * AR settlement type 2 債権決済区分２.<p>
	 *
	 */
	public String ar_sttl_typ2() {
		return getConstString(offset + 27, $ar_sttl_typ2);
	}

	/**
	 * AR settlement type 2 債権決済区分２.<p>
	 *
	 */
	public void ar_sttl_typ2(String value) {
		setConstString(offset + 27, $ar_sttl_typ2, value);
	}


	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public String ar_sttl_nm2() {
		return getConstString(offset + 28, $ar_sttl_nm2);
	}

	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public void ar_sttl_nm2(String value) {
		setConstString(offset + 28, $ar_sttl_nm2, value);
	}


	/**
	 * Sales purchase tax type 売上仕入税区分.<p>
	 *
	 */
	public String sls_purc_typ2() {
		return getConstString(offset + 29, $sls_purc_typ2);
	}

	/**
	 * Sales purchase tax type 売上仕入税区分.<p>
	 *
	 */
	public void sls_purc_typ2(String value) {
		setConstString(offset + 29, $sls_purc_typ2, value);
	}


	/**
	 * Sales flg. 売上ＦＬＧ.<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 30, $purc_flg);
	}

	/**
	 * Sales flg. 売上ＦＬＧ.<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 30, $purc_flg, value);
	}


	/**
	 * Purchase flg. 仕入ＦＬＧ.<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 31, $sls_flg);
	}

	/**
	 * Purchase flg. 仕入ＦＬＧ.<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 31, $sls_flg, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd_sub() {
		return getConstString(offset + 32, $tax_cd_sub);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd_sub(String value) {
		setConstString(offset + 32, $tax_cd_sub, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 33, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 33, $tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 34, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 34, $tax_nm, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 35, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 35, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 35, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 35, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 35, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 35, $tax_rate, value);
	}


	/**
	 * Debtor identification type 借方先識別区分.<p>
	 *
	 */
	public String debt_cred_id_typ() {
		return getConstString(offset + 36, $debt_cred_id_typ);
	}

	/**
	 * Debtor identification type 借方先識別区分.<p>
	 *
	 */
	public void debt_cred_id_typ(String value) {
		setConstString(offset + 36, $debt_cred_id_typ, value);
	}


	/**
	 * Debtor identification type name 借方先識別区分名.<p>
	 *
	 */
	public String debt_cred_id_typ_nm() {
		return getConstString(offset + 37, $debt_cred_id_typ_nm);
	}

	/**
	 * Debtor identification type name 借方先識別区分名.<p>
	 *
	 */
	public void debt_cred_id_typ_nm(String value) {
		setConstString(offset + 37, $debt_cred_id_typ_nm, value);
	}


	/**
	 * Debtor cd. 借方先ＣＤ.<p>
	 *
	 */
	public String debt_cred_id_cd() {
		return getConstString(offset + 38, $debt_cred_id_cd);
	}

	/**
	 * Debtor cd. 借方先ＣＤ.<p>
	 *
	 */
	public void debt_cred_id_cd(String value) {
		setConstString(offset + 38, $debt_cred_id_cd, value);
	}


	/**
	 * Debtor name 借方先名.<p>
	 *
	 */
	public String debt_cred_nm() {
		return getConstString(offset + 39, $debt_cred_nm);
	}

	/**
	 * Debtor name 借方先名.<p>
	 *
	 */
	public void debt_cred_nm(String value) {
		setConstString(offset + 39, $debt_cred_nm, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 40, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 40, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 41, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 41, $bd_dpt_nm, value);
	}


	/**
	 * Payment received info. type 入金情報区分.<p>
	 *
	 */
	public String rcv_dat_typ() {
		return getConstString(offset + 42, $rcv_dat_typ);
	}

	/**
	 * Payment received info. type 入金情報区分.<p>
	 *
	 */
	public void rcv_dat_typ(String value) {
		setConstString(offset + 42, $rcv_dat_typ, value);
	}


	/**
	 * Payment received info. type name 入金情報区分名.<p>
	 *
	 */
	public String rcv_dat_typ_nm() {
		return getConstString(offset + 43, $rcv_dat_typ_nm);
	}

	/**
	 * Payment received info. type name 入金情報区分名.<p>
	 *
	 */
	public void rcv_dat_typ_nm(String value) {
		setConstString(offset + 43, $rcv_dat_typ_nm, value);
	}


	/**
	 * Advance/suspense received corresponding transaction 前受仮受対応取引.<p>
	 *
	 */
	public String adv_trd_cd() {
		return getConstString(offset + 44, $adv_trd_cd);
	}

	/**
	 * Advance/suspense received corresponding transaction 前受仮受対応取引.<p>
	 *
	 */
	public void adv_trd_cd(String value) {
		setConstString(offset + 44, $adv_trd_cd, value);
	}


	/**
	 * Advance/suspense received corresponding transaction name 前受仮受対応取引名.<p>
	 *
	 */
	public String adv_trd_nm() {
		return getConstString(offset + 45, $adv_trd_nm);
	}

	/**
	 * Advance/suspense received corresponding transaction name 前受仮受対応取引名.<p>
	 *
	 */
	public void adv_trd_nm(String value) {
		setConstString(offset + 45, $adv_trd_nm, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 46, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 46, $trd_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 47, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 47, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 48, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 48, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 49, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 49, $sub_char3, value);
	}


	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public MCNumber rcv_upd_cntr() {
		return getConstNumber(offset + 50, $rcv_upd_cntr);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void rcv_upd_cntr(MCNumber value) {
		setConstNumber(offset + 50, $rcv_upd_cntr, value);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void rcv_upd_cntr(int value) {
		setConstNumber(offset + 50, $rcv_upd_cntr, value);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void rcv_upd_cntr(long value) {
		setConstNumber(offset + 50, $rcv_upd_cntr, value);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void rcv_upd_cntr(float value) {
		setConstNumber(offset + 50, $rcv_upd_cntr, value);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void rcv_upd_cntr(double value) {
		setConstNumber(offset + 50, $rcv_upd_cntr, value);
	}


	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 51, $note_no);
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 51, $note_no, value);
	}


	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public String note_typ() {
		return getConstString(offset + 52, $note_typ);
	}

	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public void note_typ(String value) {
		setConstString(offset + 52, $note_typ, value);
	}


	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public String note_typ_nm() {
		return getConstString(offset + 53, $note_typ_nm);
	}

	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public void note_typ_nm(String value) {
		setConstString(offset + 53, $note_typ_nm, value);
	}


	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public MCDate draw_dt() {
		return getConstDate(offset + 54, $draw_dt);
	}

	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public void draw_dt(MCDate value) {
		setConstDate(offset + 54, $draw_dt, value);
	}


	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public MCDate due_dt() {
		return getConstDate(offset + 55, $due_dt);
	}

	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public void due_dt(MCDate value) {
		setConstDate(offset + 55, $due_dt, value);
	}


	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public String drawer_nm() {
		return getConstString(offset + 56, $drawer_nm);
	}

	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public void drawer_nm(String value) {
		setConstString(offset + 56, $drawer_nm, value);
	}


	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public String endrsr() {
		return getConstString(offset + 57, $endrsr);
	}

	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public void endrsr(String value) {
		setConstString(offset + 57, $endrsr, value);
	}


	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public String accptr() {
		return getConstString(offset + 58, $accptr);
	}

	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public void accptr(String value) {
		setConstString(offset + 58, $accptr, value);
	}


	/**
	 * Drawing bank 振出銀行.<p>
	 *
	 */
	public String draw_bank_cd() {
		return getConstString(offset + 59, $draw_bank_cd);
	}

	/**
	 * Drawing bank 振出銀行.<p>
	 *
	 */
	public void draw_bank_cd(String value) {
		setConstString(offset + 59, $draw_bank_cd, value);
	}


	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public String draw_bank_nm() {
		return getConstString(offset + 60, $draw_bank_nm);
	}

	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public void draw_bank_nm(String value) {
		setConstString(offset + 60, $draw_bank_nm, value);
	}


	/**
	 * Drawing branch 振出支店.<p>
	 *
	 */
	public String draw_branch_cd() {
		return getConstString(offset + 61, $draw_branch_cd);
	}

	/**
	 * Drawing branch 振出支店.<p>
	 *
	 */
	public void draw_branch_cd(String value) {
		setConstString(offset + 61, $draw_branch_cd, value);
	}


	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public String draw_branch_nm() {
		return getConstString(offset + 62, $draw_branch_nm);
	}

	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public void draw_branch_nm(String value) {
		setConstString(offset + 62, $draw_branch_nm, value);
	}


	/**
	 * Note reason 手形理由.<p>
	 *
	 */
	public String note_rsn_cd() {
		return getConstString(offset + 63, $note_rsn_cd);
	}

	/**
	 * Note reason 手形理由.<p>
	 *
	 */
	public void note_rsn_cd(String value) {
		setConstString(offset + 63, $note_rsn_cd, value);
	}


	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public String note_rsn_nm() {
		return getConstString(offset + 64, $note_rsn_nm);
	}

	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public void note_rsn_nm(String value) {
		setConstString(offset + 64, $note_rsn_nm, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String note_sub_char1() {
		return getConstString(offset + 65, $note_sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void note_sub_char1(String value) {
		setConstString(offset + 65, $note_sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String note_sub_char2() {
		return getConstString(offset + 66, $note_sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void note_sub_char2(String value) {
		setConstString(offset + 66, $note_sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String note_sub_char3() {
		return getConstString(offset + 67, $note_sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void note_sub_char3(String value) {
		setConstString(offset + 67, $note_sub_char3, value);
	}


	/**
	 * Note management No. 手形管理ＮＯ.<p>
	 *
	 */
	public String note_mng_no() {
		return getConstString(offset + 68, $note_mng_no);
	}

	/**
	 * Note management No. 手形管理ＮＯ.<p>
	 *
	 */
	public void note_mng_no(String value) {
		setConstString(offset + 68, $note_mng_no, value);
	}


	/**
	 * Offset payment received No. 相殺入金ＮＯ.<p>
	 *
	 */
	public String setoff_rcv_no() {
		return getConstString(offset + 69, $setoff_rcv_no);
	}

	/**
	 * Offset payment received No. 相殺入金ＮＯ.<p>
	 *
	 */
	public void setoff_rcv_no(String value) {
		setConstString(offset + 69, $setoff_rcv_no, value);
	}


	/**
	 * Offset date 相殺日.<p>
	 *
	 */
	public MCDate setoff_dt() {
		return getConstDate(offset + 70, $setoff_dt);
	}

	/**
	 * Offset date 相殺日.<p>
	 *
	 */
	public void setoff_dt(MCDate value) {
		setConstDate(offset + 70, $setoff_dt, value);
	}


	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public String setoff_bcst_cd() {
		return getConstString(offset + 71, $setoff_bcst_cd);
	}

	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public void setoff_bcst_cd(String value) {
		setConstString(offset + 71, $setoff_bcst_cd, value);
	}


	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public String setoff_bcst_nm() {
		return getConstString(offset + 72, $setoff_bcst_nm);
	}

	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public void setoff_bcst_nm(String value) {
		setConstString(offset + 72, $setoff_bcst_nm, value);
	}


	/**
	 * Original offset destination cd. 元相殺先ＣＤ.<p>
	 *
	 */
	public String old_setoff_bcst_cd() {
		return getConstString(offset + 73, $old_setoff_bcst_cd);
	}

	/**
	 * Original offset destination cd. 元相殺先ＣＤ.<p>
	 *
	 */
	public void old_setoff_bcst_cd(String value) {
		setConstString(offset + 73, $old_setoff_bcst_cd, value);
	}


	/**
	 * Offset currency cd. 相殺通貨ＣＤ.<p>
	 *
	 */
	public String setoff_trd_cur_cd() {
		return getConstString(offset + 74, $setoff_trd_cur_cd);
	}

	/**
	 * Offset currency cd. 相殺通貨ＣＤ.<p>
	 *
	 */
	public void setoff_trd_cur_cd(String value) {
		setConstString(offset + 74, $setoff_trd_cur_cd, value);
	}


	/**
	 * Offset currency name 相殺通貨名.<p>
	 *
	 */
	public String setoff_trd_cur_nm() {
		return getConstString(offset + 75, $setoff_trd_cur_nm);
	}

	/**
	 * Offset currency name 相殺通貨名.<p>
	 *
	 */
	public void setoff_trd_cur_nm(String value) {
		setConstString(offset + 75, $setoff_trd_cur_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0420.XrateR setoff_xrate_p(){
		return (mcframe.clientMAUB.MAUBP0420.XrateR) getConstInnerRow(offset + 76, $setoff_xrate_p);
	}
	
	public void setoff_xrate_p(mcframe.clientMAUB.MAUBP0420.XrateR row){
		setConstInnerRow(offset + 76, $setoff_xrate_p, row);
	}


	/**
	 * Offset exchange rate cd. 相殺為替レートＣＤ.<p>
	 *
	 */
	public String setoff_xrate_cd() {
		return getConstString(offset + 77, $setoff_xrate_cd);
	}

	/**
	 * Offset exchange rate cd. 相殺為替レートＣＤ.<p>
	 *
	 */
	public void setoff_xrate_cd(String value) {
		setConstString(offset + 77, $setoff_xrate_cd, value);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR setoff_rcv_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 78, $setoff_rcv_amt_p);
	}
	
	public void setoff_rcv_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 78, $setoff_rcv_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR setoff_not_proc_bal_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 79, $setoff_not_proc_bal_p);
	}
	
	public void setoff_not_proc_bal_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 79, $setoff_not_proc_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR setoff_not_proc_bal_w_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 80, $setoff_not_proc_bal_w_p);
	}
	
	public void setoff_not_proc_bal_w_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 80, $setoff_not_proc_bal_w_p, row);
	}


	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public String setoff_sttl_cd1() {
		return getConstString(offset + 81, $setoff_sttl_cd1);
	}

	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public void setoff_sttl_cd1(String value) {
		setConstString(offset + 81, $setoff_sttl_cd1, value);
	}


	/**
	 * Offset AR settlement type 相殺債権決済区分.<p>
	 *
	 */
	public String setoff_sttl_typ1() {
		return getConstString(offset + 82, $setoff_sttl_typ1);
	}

	/**
	 * Offset AR settlement type 相殺債権決済区分.<p>
	 *
	 */
	public void setoff_sttl_typ1(String value) {
		setConstString(offset + 82, $setoff_sttl_typ1, value);
	}


	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public String setoff_sttl_nm1() {
		return getConstString(offset + 83, $setoff_sttl_nm1);
	}

	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public void setoff_sttl_nm1(String value) {
		setConstString(offset + 83, $setoff_sttl_nm1, value);
	}


	/**
	 * Offset sales purchase tax type 相殺売上仕入税区分.<p>
	 *
	 */
	public String setoff_sls_purc_typ() {
		return getConstString(offset + 84, $setoff_sls_purc_typ);
	}

	/**
	 * Offset sales purchase tax type 相殺売上仕入税区分.<p>
	 *
	 */
	public void setoff_sls_purc_typ(String value) {
		setConstString(offset + 84, $setoff_sls_purc_typ, value);
	}


	/**
	 * Offset sales flg. 相殺売上ＦＬＧ.<p>
	 *
	 */
	public boolean setoff_purc_flg() {
		return getConstBoolean(offset + 85, $setoff_purc_flg);
	}

	/**
	 * Offset sales flg. 相殺売上ＦＬＧ.<p>
	 *
	 */
	public void setoff_purc_flg(boolean value) {
		setConstBoolean(offset + 85, $setoff_purc_flg, value);
	}


	/**
	 * Offset purchase flg. 相殺仕入ＦＬＧ.<p>
	 *
	 */
	public boolean setoff_sls_flg() {
		return getConstBoolean(offset + 86, $setoff_sls_flg);
	}

	/**
	 * Offset purchase flg. 相殺仕入ＦＬＧ.<p>
	 *
	 */
	public void setoff_sls_flg(boolean value) {
		setConstBoolean(offset + 86, $setoff_sls_flg, value);
	}


	/**
	 * Offset tax cd. 相殺税ＣＤ.<p>
	 *
	 */
	public String setoff_tax_cd_sub() {
		return getConstString(offset + 87, $setoff_tax_cd_sub);
	}

	/**
	 * Offset tax cd. 相殺税ＣＤ.<p>
	 *
	 */
	public void setoff_tax_cd_sub(String value) {
		setConstString(offset + 87, $setoff_tax_cd_sub, value);
	}


	/**
	 * Offset tax cd. 相殺税ＣＤ.<p>
	 *
	 */
	public String setoff_tax_cd() {
		return getConstString(offset + 88, $setoff_tax_cd);
	}

	/**
	 * Offset tax cd. 相殺税ＣＤ.<p>
	 *
	 */
	public void setoff_tax_cd(String value) {
		setConstString(offset + 88, $setoff_tax_cd, value);
	}


	/**
	 * Offset tax name 相殺税名.<p>
	 *
	 */
	public String setoff_tax_nm() {
		return getConstString(offset + 89, $setoff_tax_nm);
	}

	/**
	 * Offset tax name 相殺税名.<p>
	 *
	 */
	public void setoff_tax_nm(String value) {
		setConstString(offset + 89, $setoff_tax_nm, value);
	}


	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public MCNumber setoff_tax_rate() {
		return getConstNumber(offset + 90, $setoff_tax_rate);
	}

	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public void setoff_tax_rate(MCNumber value) {
		setConstNumber(offset + 90, $setoff_tax_rate, value);
	}

	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public void setoff_tax_rate(int value) {
		setConstNumber(offset + 90, $setoff_tax_rate, value);
	}

	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public void setoff_tax_rate(long value) {
		setConstNumber(offset + 90, $setoff_tax_rate, value);
	}

	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public void setoff_tax_rate(float value) {
		setConstNumber(offset + 90, $setoff_tax_rate, value);
	}

	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public void setoff_tax_rate(double value) {
		setConstNumber(offset + 90, $setoff_tax_rate, value);
	}


	/**
	 * Offset debtor identification type 相殺借方先識別区分.<p>
	 *
	 */
	public String setoff_debt_cred_id_typ() {
		return getConstString(offset + 91, $setoff_debt_cred_id_typ);
	}

	/**
	 * Offset debtor identification type 相殺借方先識別区分.<p>
	 *
	 */
	public void setoff_debt_cred_id_typ(String value) {
		setConstString(offset + 91, $setoff_debt_cred_id_typ, value);
	}


	/**
	 * Offset debtor identification type name 相殺借方先識別区分名.<p>
	 *
	 */
	public String setoff_debt_cred_id_typ_nm() {
		return getConstString(offset + 92, $setoff_debt_cred_id_typ_nm);
	}

	/**
	 * Offset debtor identification type name 相殺借方先識別区分名.<p>
	 *
	 */
	public void setoff_debt_cred_id_typ_nm(String value) {
		setConstString(offset + 92, $setoff_debt_cred_id_typ_nm, value);
	}


	/**
	 * Offset debtor cd. 相殺借方先ＣＤ.<p>
	 *
	 */
	public String setoff_debt_cred_id_cd() {
		return getConstString(offset + 93, $setoff_debt_cred_id_cd);
	}

	/**
	 * Offset debtor cd. 相殺借方先ＣＤ.<p>
	 *
	 */
	public void setoff_debt_cred_id_cd(String value) {
		setConstString(offset + 93, $setoff_debt_cred_id_cd, value);
	}


	/**
	 * Offset debtor name 相殺借方先名.<p>
	 *
	 */
	public String setoff_debt_cred_nm() {
		return getConstString(offset + 94, $setoff_debt_cred_nm);
	}

	/**
	 * Offset debtor name 相殺借方先名.<p>
	 *
	 */
	public void setoff_debt_cred_nm(String value) {
		setConstString(offset + 94, $setoff_debt_cred_nm, value);
	}


	/**
	 * Offset charged dept. cd. 相殺負担部門ＣＤ.<p>
	 *
	 */
	public String setoff_bd_dpt_cd() {
		return getConstString(offset + 95, $setoff_bd_dpt_cd);
	}

	/**
	 * Offset charged dept. cd. 相殺負担部門ＣＤ.<p>
	 *
	 */
	public void setoff_bd_dpt_cd(String value) {
		setConstString(offset + 95, $setoff_bd_dpt_cd, value);
	}


	/**
	 * Offset charged dept. name 相殺負担部門名.<p>
	 *
	 */
	public String setoff_bd_dpt_nm() {
		return getConstString(offset + 96, $setoff_bd_dpt_nm);
	}

	/**
	 * Offset charged dept. name 相殺負担部門名.<p>
	 *
	 */
	public void setoff_bd_dpt_nm(String value) {
		setConstString(offset + 96, $setoff_bd_dpt_nm, value);
	}


	/**
	 * Offset payment received info. type 相殺入金情報区分.<p>
	 *
	 */
	public String setoff_rcv_dat_typ() {
		return getConstString(offset + 97, $setoff_rcv_dat_typ);
	}

	/**
	 * Offset payment received info. type 相殺入金情報区分.<p>
	 *
	 */
	public void setoff_rcv_dat_typ(String value) {
		setConstString(offset + 97, $setoff_rcv_dat_typ, value);
	}


	/**
	 * Offset payment received info. type name 相殺入金情報区分名.<p>
	 *
	 */
	public String setoff_rcv_dat_typ_nm() {
		return getConstString(offset + 98, $setoff_rcv_dat_typ_nm);
	}

	/**
	 * Offset payment received info. type name 相殺入金情報区分名.<p>
	 *
	 */
	public void setoff_rcv_dat_typ_nm(String value) {
		setConstString(offset + 98, $setoff_rcv_dat_typ_nm, value);
	}


	/**
	 * Offsetting transaction remarks 相殺取引備考.<p>
	 *
	 */
	public String setoff_trd_rmrks() {
		return getConstString(offset + 99, $setoff_trd_rmrks);
	}

	/**
	 * Offsetting transaction remarks 相殺取引備考.<p>
	 *
	 */
	public void setoff_trd_rmrks(String value) {
		setConstString(offset + 99, $setoff_trd_rmrks, value);
	}


	/**
	 * Offset spare 1 相殺予備１.<p>
	 *
	 */
	public String setoff_sub_char1() {
		return getConstString(offset + 100, $setoff_sub_char1);
	}

	/**
	 * Offset spare 1 相殺予備１.<p>
	 *
	 */
	public void setoff_sub_char1(String value) {
		setConstString(offset + 100, $setoff_sub_char1, value);
	}


	/**
	 * Offset spare 2 相殺予備２.<p>
	 *
	 */
	public String setoff_sub_char2() {
		return getConstString(offset + 101, $setoff_sub_char2);
	}

	/**
	 * Offset spare 2 相殺予備２.<p>
	 *
	 */
	public void setoff_sub_char2(String value) {
		setConstString(offset + 101, $setoff_sub_char2, value);
	}


	/**
	 * Offset spare 3 相殺予備３.<p>
	 *
	 */
	public String setoff_sub_char3() {
		return getConstString(offset + 102, $setoff_sub_char3);
	}

	/**
	 * Offset spare 3 相殺予備３.<p>
	 *
	 */
	public void setoff_sub_char3(String value) {
		setConstString(offset + 102, $setoff_sub_char3, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 103, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 103, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 103, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 103, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 103, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 103, $amt_dec_place, value);
	}


	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber upri_dec_place() {
		return getConstNumber(offset + 104, $upri_dec_place);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(MCNumber value) {
		setConstNumber(offset + 104, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(int value) {
		setConstNumber(offset + 104, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(long value) {
		setConstNumber(offset + 104, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(float value) {
		setConstNumber(offset + 104, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(double value) {
		setConstNumber(offset + 104, $upri_dec_place, value);
	}


	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public String rcv_act_no() {
		return getConstString(offset + 105, $rcv_act_no);
	}

	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public void rcv_act_no(String value) {
		setConstString(offset + 105, $rcv_act_no, value);
	}


	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public MCNumber rcv_act_seq() {
		return getConstNumber(offset + 106, $rcv_act_seq);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 106, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(int value) {
		setConstNumber(offset + 106, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(long value) {
		setConstNumber(offset + 106, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(float value) {
		setConstNumber(offset + 106, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(double value) {
		setConstNumber(offset + 106, $rcv_act_seq, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 107, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 107, $ac_dt, value);
	}


	public String getString(String name) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($old_rcst_cd.equalsIgnoreCase(name)) {
			return old_rcst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($old_bcst_cd.equalsIgnoreCase(name)) {
			return old_bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($old_bill_dpt_cd.equalsIgnoreCase(name)) {
			return old_bill_dpt_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			return ar_sttl_typ1();
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			return ar_sttl_nm1();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			return ar_sttl_cd2();
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			return ar_sttl_typ2();
		}
		if ($ar_sttl_nm2.equalsIgnoreCase(name)) {
			return ar_sttl_nm2();
		}
		if ($sls_purc_typ2.equalsIgnoreCase(name)) {
			return sls_purc_typ2();
		}
		if ($tax_cd_sub.equalsIgnoreCase(name)) {
			return tax_cd_sub();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			return debt_cred_id_typ();
		}
		if ($debt_cred_id_typ_nm.equalsIgnoreCase(name)) {
			return debt_cred_id_typ_nm();
		}
		if ($debt_cred_id_cd.equalsIgnoreCase(name)) {
			return debt_cred_id_cd();
		}
		if ($debt_cred_nm.equalsIgnoreCase(name)) {
			return debt_cred_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($rcv_dat_typ.equalsIgnoreCase(name)) {
			return rcv_dat_typ();
		}
		if ($rcv_dat_typ_nm.equalsIgnoreCase(name)) {
			return rcv_dat_typ_nm();
		}
		if ($adv_trd_cd.equalsIgnoreCase(name)) {
			return adv_trd_cd();
		}
		if ($adv_trd_nm.equalsIgnoreCase(name)) {
			return adv_trd_nm();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
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
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			return note_typ();
		}
		if ($note_typ_nm.equalsIgnoreCase(name)) {
			return note_typ_nm();
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			return drawer_nm();
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			return endrsr();
		}
		if ($accptr.equalsIgnoreCase(name)) {
			return accptr();
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			return draw_bank_cd();
		}
		if ($draw_bank_nm.equalsIgnoreCase(name)) {
			return draw_bank_nm();
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			return draw_branch_cd();
		}
		if ($draw_branch_nm.equalsIgnoreCase(name)) {
			return draw_branch_nm();
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			return note_rsn_cd();
		}
		if ($note_rsn_nm.equalsIgnoreCase(name)) {
			return note_rsn_nm();
		}
		if ($note_sub_char1.equalsIgnoreCase(name)) {
			return note_sub_char1();
		}
		if ($note_sub_char2.equalsIgnoreCase(name)) {
			return note_sub_char2();
		}
		if ($note_sub_char3.equalsIgnoreCase(name)) {
			return note_sub_char3();
		}
		if ($note_mng_no.equalsIgnoreCase(name)) {
			return note_mng_no();
		}
		if ($setoff_rcv_no.equalsIgnoreCase(name)) {
			return setoff_rcv_no();
		}
		if ($setoff_bcst_cd.equalsIgnoreCase(name)) {
			return setoff_bcst_cd();
		}
		if ($setoff_bcst_nm.equalsIgnoreCase(name)) {
			return setoff_bcst_nm();
		}
		if ($old_setoff_bcst_cd.equalsIgnoreCase(name)) {
			return old_setoff_bcst_cd();
		}
		if ($setoff_trd_cur_cd.equalsIgnoreCase(name)) {
			return setoff_trd_cur_cd();
		}
		if ($setoff_trd_cur_nm.equalsIgnoreCase(name)) {
			return setoff_trd_cur_nm();
		}
		if ($setoff_xrate_cd.equalsIgnoreCase(name)) {
			return setoff_xrate_cd();
		}
		if ($setoff_sttl_cd1.equalsIgnoreCase(name)) {
			return setoff_sttl_cd1();
		}
		if ($setoff_sttl_typ1.equalsIgnoreCase(name)) {
			return setoff_sttl_typ1();
		}
		if ($setoff_sttl_nm1.equalsIgnoreCase(name)) {
			return setoff_sttl_nm1();
		}
		if ($setoff_sls_purc_typ.equalsIgnoreCase(name)) {
			return setoff_sls_purc_typ();
		}
		if ($setoff_tax_cd_sub.equalsIgnoreCase(name)) {
			return setoff_tax_cd_sub();
		}
		if ($setoff_tax_cd.equalsIgnoreCase(name)) {
			return setoff_tax_cd();
		}
		if ($setoff_tax_nm.equalsIgnoreCase(name)) {
			return setoff_tax_nm();
		}
		if ($setoff_debt_cred_id_typ.equalsIgnoreCase(name)) {
			return setoff_debt_cred_id_typ();
		}
		if ($setoff_debt_cred_id_typ_nm.equalsIgnoreCase(name)) {
			return setoff_debt_cred_id_typ_nm();
		}
		if ($setoff_debt_cred_id_cd.equalsIgnoreCase(name)) {
			return setoff_debt_cred_id_cd();
		}
		if ($setoff_debt_cred_nm.equalsIgnoreCase(name)) {
			return setoff_debt_cred_nm();
		}
		if ($setoff_bd_dpt_cd.equalsIgnoreCase(name)) {
			return setoff_bd_dpt_cd();
		}
		if ($setoff_bd_dpt_nm.equalsIgnoreCase(name)) {
			return setoff_bd_dpt_nm();
		}
		if ($setoff_rcv_dat_typ.equalsIgnoreCase(name)) {
			return setoff_rcv_dat_typ();
		}
		if ($setoff_rcv_dat_typ_nm.equalsIgnoreCase(name)) {
			return setoff_rcv_dat_typ_nm();
		}
		if ($setoff_trd_rmrks.equalsIgnoreCase(name)) {
			return setoff_trd_rmrks();
		}
		if ($setoff_sub_char1.equalsIgnoreCase(name)) {
			return setoff_sub_char1();
		}
		if ($setoff_sub_char2.equalsIgnoreCase(name)) {
			return setoff_sub_char2();
		}
		if ($setoff_sub_char3.equalsIgnoreCase(name)) {
			return setoff_sub_char3();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			return rcv_upd_cntr();
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			return setoff_tax_rate();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			return draw_dt();
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		if ($setoff_dt.equalsIgnoreCase(name)) {
			return setoff_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($setoff_purc_flg.equalsIgnoreCase(name)) {
			return setoff_purc_flg();
		}
		if ($setoff_sls_flg.equalsIgnoreCase(name)) {
			return setoff_sls_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($old_rcst_cd.equalsIgnoreCase(name)) {
			return old_rcst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($old_bcst_cd.equalsIgnoreCase(name)) {
			return old_bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($old_bill_dpt_cd.equalsIgnoreCase(name)) {
			return old_bill_dpt_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			return ar_sttl_typ1();
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			return ar_sttl_nm1();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			return ar_sttl_cd2();
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			return ar_sttl_typ2();
		}
		if ($ar_sttl_nm2.equalsIgnoreCase(name)) {
			return ar_sttl_nm2();
		}
		if ($sls_purc_typ2.equalsIgnoreCase(name)) {
			return sls_purc_typ2();
		}
		if ($tax_cd_sub.equalsIgnoreCase(name)) {
			return tax_cd_sub();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			return debt_cred_id_typ();
		}
		if ($debt_cred_id_typ_nm.equalsIgnoreCase(name)) {
			return debt_cred_id_typ_nm();
		}
		if ($debt_cred_id_cd.equalsIgnoreCase(name)) {
			return debt_cred_id_cd();
		}
		if ($debt_cred_nm.equalsIgnoreCase(name)) {
			return debt_cred_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($rcv_dat_typ.equalsIgnoreCase(name)) {
			return rcv_dat_typ();
		}
		if ($rcv_dat_typ_nm.equalsIgnoreCase(name)) {
			return rcv_dat_typ_nm();
		}
		if ($adv_trd_cd.equalsIgnoreCase(name)) {
			return adv_trd_cd();
		}
		if ($adv_trd_nm.equalsIgnoreCase(name)) {
			return adv_trd_nm();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
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
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			return note_typ();
		}
		if ($note_typ_nm.equalsIgnoreCase(name)) {
			return note_typ_nm();
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			return drawer_nm();
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			return endrsr();
		}
		if ($accptr.equalsIgnoreCase(name)) {
			return accptr();
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			return draw_bank_cd();
		}
		if ($draw_bank_nm.equalsIgnoreCase(name)) {
			return draw_bank_nm();
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			return draw_branch_cd();
		}
		if ($draw_branch_nm.equalsIgnoreCase(name)) {
			return draw_branch_nm();
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			return note_rsn_cd();
		}
		if ($note_rsn_nm.equalsIgnoreCase(name)) {
			return note_rsn_nm();
		}
		if ($note_sub_char1.equalsIgnoreCase(name)) {
			return note_sub_char1();
		}
		if ($note_sub_char2.equalsIgnoreCase(name)) {
			return note_sub_char2();
		}
		if ($note_sub_char3.equalsIgnoreCase(name)) {
			return note_sub_char3();
		}
		if ($note_mng_no.equalsIgnoreCase(name)) {
			return note_mng_no();
		}
		if ($setoff_rcv_no.equalsIgnoreCase(name)) {
			return setoff_rcv_no();
		}
		if ($setoff_bcst_cd.equalsIgnoreCase(name)) {
			return setoff_bcst_cd();
		}
		if ($setoff_bcst_nm.equalsIgnoreCase(name)) {
			return setoff_bcst_nm();
		}
		if ($old_setoff_bcst_cd.equalsIgnoreCase(name)) {
			return old_setoff_bcst_cd();
		}
		if ($setoff_trd_cur_cd.equalsIgnoreCase(name)) {
			return setoff_trd_cur_cd();
		}
		if ($setoff_trd_cur_nm.equalsIgnoreCase(name)) {
			return setoff_trd_cur_nm();
		}
		if ($setoff_xrate_cd.equalsIgnoreCase(name)) {
			return setoff_xrate_cd();
		}
		if ($setoff_sttl_cd1.equalsIgnoreCase(name)) {
			return setoff_sttl_cd1();
		}
		if ($setoff_sttl_typ1.equalsIgnoreCase(name)) {
			return setoff_sttl_typ1();
		}
		if ($setoff_sttl_nm1.equalsIgnoreCase(name)) {
			return setoff_sttl_nm1();
		}
		if ($setoff_sls_purc_typ.equalsIgnoreCase(name)) {
			return setoff_sls_purc_typ();
		}
		if ($setoff_tax_cd_sub.equalsIgnoreCase(name)) {
			return setoff_tax_cd_sub();
		}
		if ($setoff_tax_cd.equalsIgnoreCase(name)) {
			return setoff_tax_cd();
		}
		if ($setoff_tax_nm.equalsIgnoreCase(name)) {
			return setoff_tax_nm();
		}
		if ($setoff_debt_cred_id_typ.equalsIgnoreCase(name)) {
			return setoff_debt_cred_id_typ();
		}
		if ($setoff_debt_cred_id_typ_nm.equalsIgnoreCase(name)) {
			return setoff_debt_cred_id_typ_nm();
		}
		if ($setoff_debt_cred_id_cd.equalsIgnoreCase(name)) {
			return setoff_debt_cred_id_cd();
		}
		if ($setoff_debt_cred_nm.equalsIgnoreCase(name)) {
			return setoff_debt_cred_nm();
		}
		if ($setoff_bd_dpt_cd.equalsIgnoreCase(name)) {
			return setoff_bd_dpt_cd();
		}
		if ($setoff_bd_dpt_nm.equalsIgnoreCase(name)) {
			return setoff_bd_dpt_nm();
		}
		if ($setoff_rcv_dat_typ.equalsIgnoreCase(name)) {
			return setoff_rcv_dat_typ();
		}
		if ($setoff_rcv_dat_typ_nm.equalsIgnoreCase(name)) {
			return setoff_rcv_dat_typ_nm();
		}
		if ($setoff_trd_rmrks.equalsIgnoreCase(name)) {
			return setoff_trd_rmrks();
		}
		if ($setoff_sub_char1.equalsIgnoreCase(name)) {
			return setoff_sub_char1();
		}
		if ($setoff_sub_char2.equalsIgnoreCase(name)) {
			return setoff_sub_char2();
		}
		if ($setoff_sub_char3.equalsIgnoreCase(name)) {
			return setoff_sub_char3();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			return rcv_upd_cntr();
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			return setoff_tax_rate();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			return draw_dt();
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		if ($setoff_dt.equalsIgnoreCase(name)) {
			return setoff_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($setoff_purc_flg.equalsIgnoreCase(name)) {
			return setoff_purc_flg();
		}
		if ($setoff_sls_flg.equalsIgnoreCase(name)) {
			return setoff_sls_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($old_rcst_cd.equalsIgnoreCase(name)) {
			old_rcst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($old_bcst_cd.equalsIgnoreCase(name)) {
			old_bcst_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($old_bill_dpt_cd.equalsIgnoreCase(name)) {
			old_bill_dpt_cd(value);
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
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			ar_sttl_typ1(value);
			return;
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			ar_sttl_nm1(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			ar_sttl_cd2(value);
			return;
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			ar_sttl_typ2(value);
			return;
		}
		if ($ar_sttl_nm2.equalsIgnoreCase(name)) {
			ar_sttl_nm2(value);
			return;
		}
		if ($sls_purc_typ2.equalsIgnoreCase(name)) {
			sls_purc_typ2(value);
			return;
		}
		if ($tax_cd_sub.equalsIgnoreCase(name)) {
			tax_cd_sub(value);
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
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			debt_cred_id_typ(value);
			return;
		}
		if ($debt_cred_id_typ_nm.equalsIgnoreCase(name)) {
			debt_cred_id_typ_nm(value);
			return;
		}
		if ($debt_cred_id_cd.equalsIgnoreCase(name)) {
			debt_cred_id_cd(value);
			return;
		}
		if ($debt_cred_nm.equalsIgnoreCase(name)) {
			debt_cred_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($rcv_dat_typ.equalsIgnoreCase(name)) {
			rcv_dat_typ(value);
			return;
		}
		if ($rcv_dat_typ_nm.equalsIgnoreCase(name)) {
			rcv_dat_typ_nm(value);
			return;
		}
		if ($adv_trd_cd.equalsIgnoreCase(name)) {
			adv_trd_cd(value);
			return;
		}
		if ($adv_trd_nm.equalsIgnoreCase(name)) {
			adv_trd_nm(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
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
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			note_typ(value);
			return;
		}
		if ($note_typ_nm.equalsIgnoreCase(name)) {
			note_typ_nm(value);
			return;
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			drawer_nm(value);
			return;
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			endrsr(value);
			return;
		}
		if ($accptr.equalsIgnoreCase(name)) {
			accptr(value);
			return;
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			draw_bank_cd(value);
			return;
		}
		if ($draw_bank_nm.equalsIgnoreCase(name)) {
			draw_bank_nm(value);
			return;
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			draw_branch_cd(value);
			return;
		}
		if ($draw_branch_nm.equalsIgnoreCase(name)) {
			draw_branch_nm(value);
			return;
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			note_rsn_cd(value);
			return;
		}
		if ($note_rsn_nm.equalsIgnoreCase(name)) {
			note_rsn_nm(value);
			return;
		}
		if ($note_sub_char1.equalsIgnoreCase(name)) {
			note_sub_char1(value);
			return;
		}
		if ($note_sub_char2.equalsIgnoreCase(name)) {
			note_sub_char2(value);
			return;
		}
		if ($note_sub_char3.equalsIgnoreCase(name)) {
			note_sub_char3(value);
			return;
		}
		if ($note_mng_no.equalsIgnoreCase(name)) {
			note_mng_no(value);
			return;
		}
		if ($setoff_rcv_no.equalsIgnoreCase(name)) {
			setoff_rcv_no(value);
			return;
		}
		if ($setoff_bcst_cd.equalsIgnoreCase(name)) {
			setoff_bcst_cd(value);
			return;
		}
		if ($setoff_bcst_nm.equalsIgnoreCase(name)) {
			setoff_bcst_nm(value);
			return;
		}
		if ($old_setoff_bcst_cd.equalsIgnoreCase(name)) {
			old_setoff_bcst_cd(value);
			return;
		}
		if ($setoff_trd_cur_cd.equalsIgnoreCase(name)) {
			setoff_trd_cur_cd(value);
			return;
		}
		if ($setoff_trd_cur_nm.equalsIgnoreCase(name)) {
			setoff_trd_cur_nm(value);
			return;
		}
		if ($setoff_xrate_cd.equalsIgnoreCase(name)) {
			setoff_xrate_cd(value);
			return;
		}
		if ($setoff_sttl_cd1.equalsIgnoreCase(name)) {
			setoff_sttl_cd1(value);
			return;
		}
		if ($setoff_sttl_typ1.equalsIgnoreCase(name)) {
			setoff_sttl_typ1(value);
			return;
		}
		if ($setoff_sttl_nm1.equalsIgnoreCase(name)) {
			setoff_sttl_nm1(value);
			return;
		}
		if ($setoff_sls_purc_typ.equalsIgnoreCase(name)) {
			setoff_sls_purc_typ(value);
			return;
		}
		if ($setoff_tax_cd_sub.equalsIgnoreCase(name)) {
			setoff_tax_cd_sub(value);
			return;
		}
		if ($setoff_tax_cd.equalsIgnoreCase(name)) {
			setoff_tax_cd(value);
			return;
		}
		if ($setoff_tax_nm.equalsIgnoreCase(name)) {
			setoff_tax_nm(value);
			return;
		}
		if ($setoff_debt_cred_id_typ.equalsIgnoreCase(name)) {
			setoff_debt_cred_id_typ(value);
			return;
		}
		if ($setoff_debt_cred_id_typ_nm.equalsIgnoreCase(name)) {
			setoff_debt_cred_id_typ_nm(value);
			return;
		}
		if ($setoff_debt_cred_id_cd.equalsIgnoreCase(name)) {
			setoff_debt_cred_id_cd(value);
			return;
		}
		if ($setoff_debt_cred_nm.equalsIgnoreCase(name)) {
			setoff_debt_cred_nm(value);
			return;
		}
		if ($setoff_bd_dpt_cd.equalsIgnoreCase(name)) {
			setoff_bd_dpt_cd(value);
			return;
		}
		if ($setoff_bd_dpt_nm.equalsIgnoreCase(name)) {
			setoff_bd_dpt_nm(value);
			return;
		}
		if ($setoff_rcv_dat_typ.equalsIgnoreCase(name)) {
			setoff_rcv_dat_typ(value);
			return;
		}
		if ($setoff_rcv_dat_typ_nm.equalsIgnoreCase(name)) {
			setoff_rcv_dat_typ_nm(value);
			return;
		}
		if ($setoff_trd_rmrks.equalsIgnoreCase(name)) {
			setoff_trd_rmrks(value);
			return;
		}
		if ($setoff_sub_char1.equalsIgnoreCase(name)) {
			setoff_sub_char1(value);
			return;
		}
		if ($setoff_sub_char2.equalsIgnoreCase(name)) {
			setoff_sub_char2(value);
			return;
		}
		if ($setoff_sub_char3.equalsIgnoreCase(name)) {
			setoff_sub_char3(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			draw_dt(value);
			return;
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			due_dt(value);
			return;
		}
		if ($setoff_dt.equalsIgnoreCase(name)) {
			setoff_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($setoff_purc_flg.equalsIgnoreCase(name)) {
			setoff_purc_flg(value);
			return;
		}
		if ($setoff_sls_flg.equalsIgnoreCase(name)) {
			setoff_sls_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($old_rcst_cd.equalsIgnoreCase(name)) {
			old_rcst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($old_bcst_cd.equalsIgnoreCase(name)) {
			old_bcst_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($old_bill_dpt_cd.equalsIgnoreCase(name)) {
			old_bill_dpt_cd(value);
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
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			ar_sttl_typ1(value);
			return;
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			ar_sttl_nm1(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			ar_sttl_cd2(value);
			return;
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			ar_sttl_typ2(value);
			return;
		}
		if ($ar_sttl_nm2.equalsIgnoreCase(name)) {
			ar_sttl_nm2(value);
			return;
		}
		if ($sls_purc_typ2.equalsIgnoreCase(name)) {
			sls_purc_typ2(value);
			return;
		}
		if ($tax_cd_sub.equalsIgnoreCase(name)) {
			tax_cd_sub(value);
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
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			debt_cred_id_typ(value);
			return;
		}
		if ($debt_cred_id_typ_nm.equalsIgnoreCase(name)) {
			debt_cred_id_typ_nm(value);
			return;
		}
		if ($debt_cred_id_cd.equalsIgnoreCase(name)) {
			debt_cred_id_cd(value);
			return;
		}
		if ($debt_cred_nm.equalsIgnoreCase(name)) {
			debt_cred_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($rcv_dat_typ.equalsIgnoreCase(name)) {
			rcv_dat_typ(value);
			return;
		}
		if ($rcv_dat_typ_nm.equalsIgnoreCase(name)) {
			rcv_dat_typ_nm(value);
			return;
		}
		if ($adv_trd_cd.equalsIgnoreCase(name)) {
			adv_trd_cd(value);
			return;
		}
		if ($adv_trd_nm.equalsIgnoreCase(name)) {
			adv_trd_nm(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
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
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			note_typ(value);
			return;
		}
		if ($note_typ_nm.equalsIgnoreCase(name)) {
			note_typ_nm(value);
			return;
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			drawer_nm(value);
			return;
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			endrsr(value);
			return;
		}
		if ($accptr.equalsIgnoreCase(name)) {
			accptr(value);
			return;
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			draw_bank_cd(value);
			return;
		}
		if ($draw_bank_nm.equalsIgnoreCase(name)) {
			draw_bank_nm(value);
			return;
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			draw_branch_cd(value);
			return;
		}
		if ($draw_branch_nm.equalsIgnoreCase(name)) {
			draw_branch_nm(value);
			return;
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			note_rsn_cd(value);
			return;
		}
		if ($note_rsn_nm.equalsIgnoreCase(name)) {
			note_rsn_nm(value);
			return;
		}
		if ($note_sub_char1.equalsIgnoreCase(name)) {
			note_sub_char1(value);
			return;
		}
		if ($note_sub_char2.equalsIgnoreCase(name)) {
			note_sub_char2(value);
			return;
		}
		if ($note_sub_char3.equalsIgnoreCase(name)) {
			note_sub_char3(value);
			return;
		}
		if ($note_mng_no.equalsIgnoreCase(name)) {
			note_mng_no(value);
			return;
		}
		if ($setoff_rcv_no.equalsIgnoreCase(name)) {
			setoff_rcv_no(value);
			return;
		}
		if ($setoff_bcst_cd.equalsIgnoreCase(name)) {
			setoff_bcst_cd(value);
			return;
		}
		if ($setoff_bcst_nm.equalsIgnoreCase(name)) {
			setoff_bcst_nm(value);
			return;
		}
		if ($old_setoff_bcst_cd.equalsIgnoreCase(name)) {
			old_setoff_bcst_cd(value);
			return;
		}
		if ($setoff_trd_cur_cd.equalsIgnoreCase(name)) {
			setoff_trd_cur_cd(value);
			return;
		}
		if ($setoff_trd_cur_nm.equalsIgnoreCase(name)) {
			setoff_trd_cur_nm(value);
			return;
		}
		if ($setoff_xrate_cd.equalsIgnoreCase(name)) {
			setoff_xrate_cd(value);
			return;
		}
		if ($setoff_sttl_cd1.equalsIgnoreCase(name)) {
			setoff_sttl_cd1(value);
			return;
		}
		if ($setoff_sttl_typ1.equalsIgnoreCase(name)) {
			setoff_sttl_typ1(value);
			return;
		}
		if ($setoff_sttl_nm1.equalsIgnoreCase(name)) {
			setoff_sttl_nm1(value);
			return;
		}
		if ($setoff_sls_purc_typ.equalsIgnoreCase(name)) {
			setoff_sls_purc_typ(value);
			return;
		}
		if ($setoff_tax_cd_sub.equalsIgnoreCase(name)) {
			setoff_tax_cd_sub(value);
			return;
		}
		if ($setoff_tax_cd.equalsIgnoreCase(name)) {
			setoff_tax_cd(value);
			return;
		}
		if ($setoff_tax_nm.equalsIgnoreCase(name)) {
			setoff_tax_nm(value);
			return;
		}
		if ($setoff_debt_cred_id_typ.equalsIgnoreCase(name)) {
			setoff_debt_cred_id_typ(value);
			return;
		}
		if ($setoff_debt_cred_id_typ_nm.equalsIgnoreCase(name)) {
			setoff_debt_cred_id_typ_nm(value);
			return;
		}
		if ($setoff_debt_cred_id_cd.equalsIgnoreCase(name)) {
			setoff_debt_cred_id_cd(value);
			return;
		}
		if ($setoff_debt_cred_nm.equalsIgnoreCase(name)) {
			setoff_debt_cred_nm(value);
			return;
		}
		if ($setoff_bd_dpt_cd.equalsIgnoreCase(name)) {
			setoff_bd_dpt_cd(value);
			return;
		}
		if ($setoff_bd_dpt_nm.equalsIgnoreCase(name)) {
			setoff_bd_dpt_nm(value);
			return;
		}
		if ($setoff_rcv_dat_typ.equalsIgnoreCase(name)) {
			setoff_rcv_dat_typ(value);
			return;
		}
		if ($setoff_rcv_dat_typ_nm.equalsIgnoreCase(name)) {
			setoff_rcv_dat_typ_nm(value);
			return;
		}
		if ($setoff_trd_rmrks.equalsIgnoreCase(name)) {
			setoff_trd_rmrks(value);
			return;
		}
		if ($setoff_sub_char1.equalsIgnoreCase(name)) {
			setoff_sub_char1(value);
			return;
		}
		if ($setoff_sub_char2.equalsIgnoreCase(name)) {
			setoff_sub_char2(value);
			return;
		}
		if ($setoff_sub_char3.equalsIgnoreCase(name)) {
			setoff_sub_char3(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			draw_dt(value);
			return;
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			due_dt(value);
			return;
		}
		if ($setoff_dt.equalsIgnoreCase(name)) {
			setoff_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($setoff_purc_flg.equalsIgnoreCase(name)) {
			setoff_purc_flg(value);
			return;
		}
		if ($setoff_sls_flg.equalsIgnoreCase(name)) {
			setoff_sls_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($xrate_p.equalsIgnoreCase(name)) {
			return xrate_p();
		}
		if ($rcv_amt_p.equalsIgnoreCase(name)) {
			return rcv_amt_p();
		}
		if ($not_proc_bal_p.equalsIgnoreCase(name)) {
			return not_proc_bal_p();
		}
		if ($not_proc_bal_w_p.equalsIgnoreCase(name)) {
			return not_proc_bal_w_p();
		}
		if ($setoff_xrate_p.equalsIgnoreCase(name)) {
			return setoff_xrate_p();
		}
		if ($setoff_rcv_amt_p.equalsIgnoreCase(name)) {
			return setoff_rcv_amt_p();
		}
		if ($setoff_not_proc_bal_p.equalsIgnoreCase(name)) {
			return setoff_not_proc_bal_p();
		}
		if ($setoff_not_proc_bal_w_p.equalsIgnoreCase(name)) {
			return setoff_not_proc_bal_w_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($xrate_p.equalsIgnoreCase(name)) {
			xrate_p(
				((MCContainerMeta) xrate_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0420.XrateR.class, value)
			);
			return;
		}
		if ($rcv_amt_p.equalsIgnoreCase(name)) {
			rcv_amt_p(
				((MCContainerMeta) rcv_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($not_proc_bal_p.equalsIgnoreCase(name)) {
			not_proc_bal_p(
				((MCContainerMeta) not_proc_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($not_proc_bal_w_p.equalsIgnoreCase(name)) {
			not_proc_bal_w_p(
				((MCContainerMeta) not_proc_bal_w_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($setoff_xrate_p.equalsIgnoreCase(name)) {
			setoff_xrate_p(
				((MCContainerMeta) setoff_xrate_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0420.XrateR.class, value)
			);
			return;
		}
		if ($setoff_rcv_amt_p.equalsIgnoreCase(name)) {
			setoff_rcv_amt_p(
				((MCContainerMeta) setoff_rcv_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($setoff_not_proc_bal_p.equalsIgnoreCase(name)) {
			setoff_not_proc_bal_p(
				((MCContainerMeta) setoff_not_proc_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($setoff_not_proc_bal_w_p.equalsIgnoreCase(name)) {
			setoff_not_proc_bal_w_p(
				((MCContainerMeta) setoff_not_proc_bal_w_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCNumber xrate() {
		return xrate_p().xrate();
	}

	public void xrate(MCNumber value) {
		xrate_p().xrate(value);
	}

	public void xrate(int value) {
		xrate_p().xrate(value);
	}

	public void xrate(long value) {
		xrate_p().xrate(value);
	}

	public void xrate(float value) {
		xrate_p().xrate(value);
	}

	public void xrate(double value) {
		xrate_p().xrate(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public MCNumber rcv_amt() {
		return rcv_amt_p().amt();
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(MCNumber value) {
		rcv_amt_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(int value) {
		rcv_amt_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(long value) {
		rcv_amt_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(float value) {
		rcv_amt_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(double value) {
		rcv_amt_p().amt(value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public MCNumber not_proc_bal() {
		return not_proc_bal_p().amt();
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(MCNumber value) {
		not_proc_bal_p().amt(value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(int value) {
		not_proc_bal_p().amt(value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(long value) {
		not_proc_bal_p().amt(value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(float value) {
		not_proc_bal_p().amt(value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(double value) {
		not_proc_bal_p().amt(value);
	}

	/**
	 * Unreconciled balance work 未処理残高ワーク.<p>
	 *
	 */
	public MCNumber not_proc_bal_w() {
		return not_proc_bal_w_p().amt();
	}

	/**
	 * Unreconciled balance work 未処理残高ワーク.<p>
	 *
	 */
	public void not_proc_bal_w(MCNumber value) {
		not_proc_bal_w_p().amt(value);
	}

	/**
	 * Unreconciled balance work 未処理残高ワーク.<p>
	 *
	 */
	public void not_proc_bal_w(int value) {
		not_proc_bal_w_p().amt(value);
	}

	/**
	 * Unreconciled balance work 未処理残高ワーク.<p>
	 *
	 */
	public void not_proc_bal_w(long value) {
		not_proc_bal_w_p().amt(value);
	}

	/**
	 * Unreconciled balance work 未処理残高ワーク.<p>
	 *
	 */
	public void not_proc_bal_w(float value) {
		not_proc_bal_w_p().amt(value);
	}

	/**
	 * Unreconciled balance work 未処理残高ワーク.<p>
	 *
	 */
	public void not_proc_bal_w(double value) {
		not_proc_bal_w_p().amt(value);
	}

	/**
	 * Offset exchange rate 相殺為替レート.<p>
	 *
	 */
	public MCNumber setoff_xrate() {
		return setoff_xrate_p().xrate();
	}

	/**
	 * Offset exchange rate 相殺為替レート.<p>
	 *
	 */
	public void setoff_xrate(MCNumber value) {
		setoff_xrate_p().xrate(value);
	}

	/**
	 * Offset exchange rate 相殺為替レート.<p>
	 *
	 */
	public void setoff_xrate(int value) {
		setoff_xrate_p().xrate(value);
	}

	/**
	 * Offset exchange rate 相殺為替レート.<p>
	 *
	 */
	public void setoff_xrate(long value) {
		setoff_xrate_p().xrate(value);
	}

	/**
	 * Offset exchange rate 相殺為替レート.<p>
	 *
	 */
	public void setoff_xrate(float value) {
		setoff_xrate_p().xrate(value);
	}

	/**
	 * Offset exchange rate 相殺為替レート.<p>
	 *
	 */
	public void setoff_xrate(double value) {
		setoff_xrate_p().xrate(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public MCNumber setoff_rcv_amt() {
		return setoff_rcv_amt_p().amt();
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_rcv_amt(MCNumber value) {
		setoff_rcv_amt_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_rcv_amt(int value) {
		setoff_rcv_amt_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_rcv_amt(long value) {
		setoff_rcv_amt_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_rcv_amt(float value) {
		setoff_rcv_amt_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_rcv_amt(double value) {
		setoff_rcv_amt_p().amt(value);
	}

	/**
	 * Offset outstanding balance 相殺未処理残高.<p>
	 *
	 */
	public MCNumber setoff_not_proc_bal() {
		return setoff_not_proc_bal_p().amt();
	}

	/**
	 * Offset outstanding balance 相殺未処理残高.<p>
	 *
	 */
	public void setoff_not_proc_bal(MCNumber value) {
		setoff_not_proc_bal_p().amt(value);
	}

	/**
	 * Offset outstanding balance 相殺未処理残高.<p>
	 *
	 */
	public void setoff_not_proc_bal(int value) {
		setoff_not_proc_bal_p().amt(value);
	}

	/**
	 * Offset outstanding balance 相殺未処理残高.<p>
	 *
	 */
	public void setoff_not_proc_bal(long value) {
		setoff_not_proc_bal_p().amt(value);
	}

	/**
	 * Offset outstanding balance 相殺未処理残高.<p>
	 *
	 */
	public void setoff_not_proc_bal(float value) {
		setoff_not_proc_bal_p().amt(value);
	}

	/**
	 * Offset outstanding balance 相殺未処理残高.<p>
	 *
	 */
	public void setoff_not_proc_bal(double value) {
		setoff_not_proc_bal_p().amt(value);
	}

	/**
	 * Offset outstanding balance work 相殺未処理残高ワーク.<p>
	 *
	 */
	public MCNumber setoff_not_proc_bal_w() {
		return setoff_not_proc_bal_w_p().amt();
	}

	/**
	 * Offset outstanding balance work 相殺未処理残高ワーク.<p>
	 *
	 */
	public void setoff_not_proc_bal_w(MCNumber value) {
		setoff_not_proc_bal_w_p().amt(value);
	}

	/**
	 * Offset outstanding balance work 相殺未処理残高ワーク.<p>
	 *
	 */
	public void setoff_not_proc_bal_w(int value) {
		setoff_not_proc_bal_w_p().amt(value);
	}

	/**
	 * Offset outstanding balance work 相殺未処理残高ワーク.<p>
	 *
	 */
	public void setoff_not_proc_bal_w(long value) {
		setoff_not_proc_bal_w_p().amt(value);
	}

	/**
	 * Offset outstanding balance work 相殺未処理残高ワーク.<p>
	 *
	 */
	public void setoff_not_proc_bal_w(float value) {
		setoff_not_proc_bal_w_p().amt(value);
	}

	/**
	 * Offset outstanding balance work 相殺未処理残高ワーク.<p>
	 *
	 */
	public void setoff_not_proc_bal_w(double value) {
		setoff_not_proc_bal_w_p().amt(value);
	}

}

