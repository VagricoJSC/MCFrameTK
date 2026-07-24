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
 * ブロック"DtlSchd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlSchdR_MC_A extends MCConstRow {

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public static final String $pay_schd_dt = "pay_schd_dt";
	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public static final String $ap_sttl_cd = "ap_sttl_cd";
	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public static final String $ap_sttl_nm = "ap_sttl_nm";
	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public static final String $ap_sttl_typ = "ap_sttl_typ";
	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public static final String $ap_sttl_typ_nm = "ap_sttl_typ_nm";
	/**
	 * AP offset result recording flg. 債務相殺実績計上ＦＬＧ.<p>
	 *
	 */
	public static final String $ap_setoff_act_flg = "ap_setoff_act_flg";
	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public static final String $pay_bank_ac_cd = "pay_bank_ac_cd";
	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public static final String $pay_bank_ac_nm = "pay_bank_ac_nm";
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
	 * Fee cd. (Transaction currency) 取引通貨手数料税ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_cd = "trd_cur_com_paid_tax_cd";
	/**
	 * Fee tax name (Transaction currency) 取引通貨手数料税名.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_nm = "trd_cur_com_paid_tax_nm";
	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_rate = "trd_cur_com_paid_tax_rate";
	public static final String $trd_cur_amt_p = "trd_cur_amt_p";
	public static final String $trd_cur_com_paid_tax_amt_p = "trd_cur_com_paid_tax_amt_p";
	public static final String $xrate_p = "xrate_p";
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
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public static final String $pay_dpt_cd = "pay_dpt_cd";
	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public static final String $pay_dpt_nm = "pay_dpt_nm";
	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public static final String $ap_setoff_typ = "ap_setoff_typ";
	/**
	 * AP offset destination name 債務相殺先区分名.<p>
	 *
	 */
	public static final String $ap_setoff_typ_nm = "ap_setoff_typ_nm";
	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public static final String $setoff_cd = "setoff_cd";
	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public static final String $setoff_nm = "setoff_nm";
	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public static final String $so_dpt_cd = "so_dpt_cd";
	/**
	 * Offset dept. name 相殺部門名.<p>
	 *
	 */
	public static final String $so_dpt_nm = "so_dpt_nm";
	public static final String $setoff_limit_amt_p = "setoff_limit_amt_p";
	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public static final String $adv_pay_act_no = "adv_pay_act_no";
	public static final String $adv_amt_p = "adv_amt_p";
	public static final String $setoff_schd_amt_p = "setoff_schd_amt_p";
	public static final String $setoff_act_amt_p = "setoff_act_amt_p";
	public static final String $not_proc_bal_p = "not_proc_bal_p";
	public static final String $base_cur_amt_p = "base_cur_amt_p";
	public static final String $base_cur_com_paid_tax_amt_p = "base_cur_com_paid_tax_amt_p";
	/**
	 * Counterpart invoice No. 相手先請求書ＮＯ.<p>
	 *
	 */
	public static final String $rcv_bill_no = "rcv_bill_no";
	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public static final String $pay_schd_no = "pay_schd_no";
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
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public static final String $note_rsn_cd = "note_rsn_cd";
	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public static final String $note_rsn_nm = "note_rsn_nm";
	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public static final String $draw_dt = "draw_dt";
	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public static final String $note_days = "note_days";
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
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public static final String $draw_bank_cd = "draw_bank_cd";
	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public static final String $draw_bank_nm = "draw_bank_nm";
	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public static final String $draw_branch_cd = "draw_branch_cd";
	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public static final String $draw_branch_nm = "draw_branch_nm";
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
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public static final String $pay_sts_typ = "pay_sts_typ";
	/**
	 * Payment status type name 支払状況区分名.<p>
	 *
	 */
	public static final String $pay_sts_typ_nm = "pay_sts_typ_nm";
	/**
	 * Transferred 振替済.<p>
	 *
	 */
	public static final String $sw_flg = "sw_flg";
	/**
	 * Reconciled amount (Transaction currency) 取引通貨消込額.<p>
	 *
	 */
	public static final String $trd_cur_appl_amt = "trd_cur_appl_amt";
	/**
	 * Offset result creation 相殺実績作成.<p>
	 *
	 */
	public static final String $setoff_act_flg = "setoff_act_flg";
	/**
	 * Last offset result creation 前回相殺実績作成.<p>
	 *
	 */
	public static final String $last_setoff_act_flg = "last_setoff_act_flg";
	/**
	 * Cancellation recording date (For work) 取消計上日(作業用).<p>
	 *
	 */
	public static final String $can_ac_dt_dummy = "can_ac_dt_dummy";
	public static final String $can_ac_dt_p = "can_ac_dt_p";
	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public static final String $pay_ntc_d_print_rmrks = "pay_ntc_d_print_rmrks";
	/**
	 * Payment schedule table details 支払予定表備考.<p>
	 *
	 */
	public static final String $pay_schd_print_rmrks = "pay_schd_print_rmrks";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
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
	 * AP settlement method cd. (For work) 債務決済方法ＣＤ(作業用).<p>
	 *
	 */
	public static final String $ap_sttl_cd_dummy = "ap_sttl_cd_dummy";
	/**
	 * Payee cd. (For work) 支払先ＣＤ(作業用).<p>
	 *
	 */
	public static final String $psppl_cd_dummy = "psppl_cd_dummy";
	/**
	 * Amount (Transaction currency) (Before change) 取引通貨金額(変更前).<p>
	 *
	 */
	public static final String $old_trd_cur_amt = "old_trd_cur_amt";
	/**
	 * AP offset destination type (Before change) 債務相殺先区分(変更前).<p>
	 *
	 */
	public static final String $old_ap_setoff_typ = "old_ap_setoff_typ";
	/**
	 * AP offset destination cd. (Before change) 債務相殺先ＣＤ(変更前).<p>
	 *
	 */
	public static final String $old_setoff_cd = "old_setoff_cd";
	/**
	 * AP offset dept. cd. (Before change) 債務相殺部門ＣＤ(変更前).<p>
	 *
	 */
	public static final String $old_so_dpt_cd = "old_so_dpt_cd";
	/**
	 * Balance to be offset (Before change) 相殺対象残高(変更前).<p>
	 *
	 */
	public static final String $old_setoff_limit_amt = "old_setoff_limit_amt";
	/**
	 * Advance payment amount payment result No. (Before change) 前渡金支払実績ＮＯ(変更前).<p>
	 *
	 */
	public static final String $old_adv_pay_act_no = "old_adv_pay_act_no";
	/**
	 * Scheduled advance payment offset amount (Before change) 前渡金相殺予定額(変更前).<p>
	 *
	 */
	public static final String $old_setoff_schd_amt = "old_setoff_schd_amt";
	public static final String $ar_typ = "ar_typ";
	public static final String $old_ar_typ = "old_ar_typ";

	public static final String $trd_cur_amt = $trd_cur_amt_p + ".amt";
	public static final String $trd_cur_com_paid_tax_amt = $trd_cur_com_paid_tax_amt_p + ".amt";
	public static final String $xrate = $xrate_p + ".xrate";
	public static final String $setoff_limit_amt = $setoff_limit_amt_p + ".amt";
	public static final String $adv_amt = $adv_amt_p + ".amt";
	public static final String $setoff_schd_amt = $setoff_schd_amt_p + ".amt";
	public static final String $setoff_act_amt = $setoff_act_amt_p + ".amt";
	public static final String $not_proc_bal = $not_proc_bal_p + ".amt";
	public static final String $base_cur_amt = $base_cur_amt_p + ".amt";
	public static final String $base_cur_com_paid_tax_amt = $base_cur_com_paid_tax_amt_p + ".amt";
	public static final String $can_ac_dt_for_input = $can_ac_dt_p + ".can_ac_dt_for_input";
	public static final String $can_ac_dt = $can_ac_dt_p + ".can_ac_dt_for_call";
	public static final String $ac_dt_after_srch = $can_ac_dt_p + ".ac_dt_after_srch";

	public static final MCMeta pay_schd_dt_META = createCommonMeta($pay_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ap_sttl_cd_META = createCommonMeta($ap_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ap_sttl_nm_META = createCommonMeta($ap_sttl_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta ap_sttl_typ_META = createCommonMeta($ap_sttl_typ, mcframe.commonMA.meta.MA_META.AP_STTL_TYP);
	public static final MCMeta ap_sttl_typ_nm_META = createCommonMeta($ap_sttl_typ_nm, mcframe.commonMA.meta.MA_META.AP_STTL_TYP_NM);
	public static final MCMeta ap_setoff_act_flg_META = createCommonMeta($ap_setoff_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_bank_ac_cd_META = createCommonMeta($pay_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta pay_bank_ac_nm_META = createCommonMeta($pay_bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta bank_ac_nm_META = createCommonMeta($bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta trd_cur_com_paid_tax_cd_META = createCommonMeta($trd_cur_com_paid_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta trd_cur_com_paid_tax_nm_META = createCommonMeta($trd_cur_com_paid_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta trd_cur_com_paid_tax_rate_META = createCommonMeta($trd_cur_com_paid_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta trd_cur_amt_p_META = createInnerRowMeta($trd_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta trd_cur_com_paid_tax_amt_p_META = createInnerRowMeta($trd_cur_com_paid_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xrate_p_META = createInnerRowMeta($xrate_p, mcframe.clientMAUB.MAUBP5390.XrateR.class);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_nm_META = createCommonMeta($asppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ap_typ_META = createCommonMeta($ap_typ, mcframe.commonMA.meta.MA_META.AP_TYP);
	public static final MCMeta ap_typ_nm_META = createCommonMeta($ap_typ_nm, mcframe.commonMA.meta.MA_META.AP_TYP_NM);
	public static final MCMeta pay_dpt_cd_META = createCommonMeta($pay_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pay_dpt_nm_META = createCommonMeta($pay_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ap_setoff_typ_META = createCommonMeta($ap_setoff_typ, mcframe.commonMA.meta.MA_META.AP_SETOFF_TYP);
	public static final MCMeta ap_setoff_typ_nm_META = createCommonMeta($ap_setoff_typ_nm, mcframe.commonMA.meta.MA_META.AP_SETOFF_TYP_NM);
	public static final MCMeta setoff_cd_META = createCommonMeta($setoff_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta setoff_nm_META = createCommonMeta($setoff_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta so_dpt_cd_META = createCommonMeta($so_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta so_dpt_nm_META = createCommonMeta($so_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta setoff_limit_amt_p_META = createInnerRowMeta($setoff_limit_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta adv_pay_act_no_META = createCommonMeta($adv_pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta adv_amt_p_META = createInnerRowMeta($adv_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta setoff_schd_amt_p_META = createInnerRowMeta($setoff_schd_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta setoff_act_amt_p_META = createInnerRowMeta($setoff_act_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta not_proc_bal_p_META = createInnerRowMeta($not_proc_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_amt_p_META = createInnerRowMeta($base_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_com_paid_tax_amt_p_META = createInnerRowMeta($base_cur_com_paid_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta rcv_bill_no_META = createCommonMeta($rcv_bill_no, mcframe.commonMA.meta.MA_META.RCV_BILL_NO);
	public static final MCMeta pay_schd_no_META = createCommonMeta($pay_schd_no, mcframe.commonMA.meta.MA_META.PAY_SCHD_NO);
	public static final MCMeta note_no_META = createCommonMeta($note_no, mcframe.commonMA.meta.MA_META.NOTE_NO);
	public static final MCMeta note_typ_META = createCommonMeta($note_typ, mcframe.commonMA.meta.MA_META.NOTE_TYP);
	public static final MCMeta note_typ_nm_META = createCommonMeta($note_typ_nm, mcframe.commonMA.meta.MA_META.NOTE_TYP_NM);
	public static final MCMeta note_rsn_cd_META = createCommonMeta($note_rsn_cd, mcframe.commonMA.meta.MA_META.NOTE_RSN_CD);
	public static final MCMeta note_rsn_nm_META = createCommonMeta($note_rsn_nm, mcframe.commonMA.meta.MA_META.NOTE_RSN_NM);
	public static final MCMeta draw_dt_META = createCommonMeta($draw_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta note_days_META = createCommonMeta($note_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta due_dt_META = createCommonMeta($due_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta drawer_nm_META = createCommonMeta($drawer_nm, mcframe.commonMA.meta.MA_META.DRAWER_NM);
	public static final MCMeta draw_bank_cd_META = createCommonMeta($draw_bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta draw_bank_nm_META = createCommonMeta($draw_bank_nm, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta draw_branch_cd_META = createCommonMeta($draw_branch_cd, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta draw_branch_nm_META = createCommonMeta($draw_branch_nm, mcframe.commonMA.meta.MA_META.BANK_BRANCH_NM);
	public static final MCMeta endrsr_META = createCommonMeta($endrsr, mcframe.commonMA.meta.MA_META.NOTE_ENDRSR);
	public static final MCMeta accptr_META = createCommonMeta($accptr, mcframe.commonMA.meta.MA_META.NOTE_ACCPTR);
	public static final MCMeta pay_sts_typ_META = createCommonMeta($pay_sts_typ, mcframe.commonMS.meta.MS_META.PAY_STS_TYP);
	public static final MCMeta pay_sts_typ_nm_META = createCommonMeta($pay_sts_typ_nm, mcframe.commonMS.meta.MS_META.PAY_STS_TYP_NM);
	public static final MCMeta sw_flg_META = createCommonMeta($sw_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_appl_amt_META = createCommonMeta($trd_cur_appl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_act_flg_META = createCommonMeta($setoff_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta last_setoff_act_flg_META = createCommonMeta($last_setoff_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_ac_dt_dummy_META = createCommonMeta($can_ac_dt_dummy, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_ac_dt_p_META = createInnerRowMeta($can_ac_dt_p, mcframe.clientMAUB.MAUBP5240.CanAcDtR.class);
	public static final MCMeta pay_ntc_d_print_rmrks_META = createCommonMeta($pay_ntc_d_print_rmrks, mcframe.commonMS.meta.MS_META.PAY_NTC_D_PRINT_RMRKS);
	public static final MCMeta pay_schd_print_rmrks_META = createCommonMeta($pay_schd_print_rmrks, mcframe.commonMS.meta.MS_META.PAY_SCHD_PRINT_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PAY_SCHD_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PAY_SCHD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PAY_SCHD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PAY_SCHD_SUB_CHAR3);
	public static final MCMeta ap_sttl_cd_dummy_META = createCommonMeta($ap_sttl_cd_dummy, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta psppl_cd_dummy_META = createCommonMeta($psppl_cd_dummy, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta old_trd_cur_amt_META = createCommonMeta($old_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_ap_setoff_typ_META = createCommonMeta($old_ap_setoff_typ, mcframe.commonMA.meta.MA_META.AP_SETOFF_TYP);
	public static final MCMeta old_setoff_cd_META = createCommonMeta($old_setoff_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta old_so_dpt_cd_META = createCommonMeta($old_so_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta old_setoff_limit_amt_META = createCommonMeta($old_setoff_limit_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_adv_pay_act_no_META = createCommonMeta($old_adv_pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta old_setoff_schd_amt_META = createCommonMeta($old_setoff_schd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta old_ar_typ_META = createCommonMeta($old_ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);

	protected static final ConstMetaList<DtlSchdR> constMetas = new ConstMetaList<DtlSchdR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			pay_schd_dt_META,
			ap_sttl_cd_META,
			ap_sttl_nm_META,
			ap_sttl_typ_META,
			ap_sttl_typ_nm_META,
			ap_setoff_act_flg_META,
			pay_bank_ac_cd_META,
			pay_bank_ac_nm_META,
			bank_ac_cd_META,
			bank_ac_nm_META,
			trd_cur_com_paid_tax_cd_META,
			trd_cur_com_paid_tax_nm_META,
			trd_cur_com_paid_tax_rate_META,
			trd_cur_amt_p_META,
			trd_cur_com_paid_tax_amt_p_META,
			xrate_p_META,
			asppl_cd_META,
			asppl_nm_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			ap_typ_META,
			ap_typ_nm_META,
			pay_dpt_cd_META,
			pay_dpt_nm_META,
			ap_setoff_typ_META,
			ap_setoff_typ_nm_META,
			setoff_cd_META,
			setoff_nm_META,
			so_dpt_cd_META,
			so_dpt_nm_META,
			setoff_limit_amt_p_META,
			adv_pay_act_no_META,
			adv_amt_p_META,
			setoff_schd_amt_p_META,
			setoff_act_amt_p_META,
			not_proc_bal_p_META,
			base_cur_amt_p_META,
			base_cur_com_paid_tax_amt_p_META,
			rcv_bill_no_META,
			pay_schd_no_META,
			note_no_META,
			note_typ_META,
			note_typ_nm_META,
			note_rsn_cd_META,
			note_rsn_nm_META,
			draw_dt_META,
			note_days_META,
			due_dt_META,
			drawer_nm_META,
			draw_bank_cd_META,
			draw_bank_nm_META,
			draw_branch_cd_META,
			draw_branch_nm_META,
			endrsr_META,
			accptr_META,
			pay_sts_typ_META,
			pay_sts_typ_nm_META,
			sw_flg_META,
			trd_cur_appl_amt_META,
			setoff_act_flg_META,
			last_setoff_act_flg_META,
			can_ac_dt_dummy_META,
			can_ac_dt_p_META,
			pay_ntc_d_print_rmrks_META,
			pay_schd_print_rmrks_META,
			trd_d_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			ap_sttl_cd_dummy_META,
			psppl_cd_dummy_META,
			old_trd_cur_amt_META,
			old_ap_setoff_typ_META,
			old_setoff_cd_META,
			old_so_dpt_cd_META,
			old_setoff_limit_amt_META,
			old_adv_pay_act_no_META,
			old_setoff_schd_amt_META,
			ar_typ_META,
			old_ar_typ_META
		},
		new String[][]{
			{
				"trd_cur_amt",
				"trd_cur_com_paid_tax_amt",
				"xrate",
				"setoff_limit_amt",
				"adv_amt",
				"setoff_schd_amt",
				"setoff_act_amt",
				"not_proc_bal",
				"base_cur_amt",
				"base_cur_com_paid_tax_amt",
				"can_ac_dt_for_input",
				"can_ac_dt",
				"ac_dt_after_srch"
			},
			{
				$trd_cur_amt,
				$trd_cur_com_paid_tax_amt,
				$xrate,
				$setoff_limit_amt,
				$adv_amt,
				$setoff_schd_amt,
				$setoff_act_amt,
				$not_proc_bal,
				$base_cur_amt,
				$base_cur_com_paid_tax_amt,
				$can_ac_dt_for_input,
				$can_ac_dt,
				$ac_dt_after_srch
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
				{$ap_sttl_cd, "sttl_nm;ap_sttl_typ;ap_setoff_typ;ap_setoff_act_flg;tax_cd"},	// ap_sttl_cd
				{$ap_sttl_typ, "ap_sttl_typ_nm"},	// ap_sttl_typ
				{$pay_bank_ac_cd, "bank_ac_nm"},	// pay_bank_ac_cd
				{$bank_ac_cd, "bank_ac_nm"},	// bank_ac_cd
				{$trd_cur_com_paid_tax_cd, "tax_nm;tax_rate"},	// trd_cur_com_paid_tax_cd
				{$asppl_cd, "asppl_nm"},	// asppl_cd
				{$ap_dpt_cd, "dpt_nm"},	// ap_dpt_cd
				{$ap_typ, "ap_typ_nm"},	// ap_typ
				{$pay_dpt_cd, "dpt_nm"},	// pay_dpt_cd
				{$ap_setoff_typ, "ap_setoff_typ_nm"},	// ap_setoff_typ
				{$setoff_cd, "bp_nm"},	// setoff_cd
				{$so_dpt_cd, "dpt_nm"},	// so_dpt_cd
				{$adv_pay_act_no, "trd_cur_setoff_tgt_amt;trd_cur_setoff_schd_amt;trd_cur_setoff_act_amt;trd_cur_not_proc_bal;xrate;bd_dpt_cd;note_no;note_typ;note_typ_nm;note_rsn_cd;note_rsn_nm;draw_dt;due_dt;drawer_nm;draw_bank_cd;draw_bank_nm;draw_branch_cd;draw_branch_nm;endrsr;accptr"},	// adv_pay_act_no
				{$note_typ, "note_typ_nm"},	// note_typ
				{$note_rsn_cd, "note_rsn_nm"},	// note_rsn_cd
				{$draw_bank_cd, "bank_nm"},	// draw_bank_cd
				{$draw_branch_cd, "branch_nm"},	// draw_branch_cd
				{$ap_sttl_cd_dummy, "tax_cd"},	// ap_sttl_cd_dummy
				{$psppl_cd_dummy, "pay_dpt_cd"}	// psppl_cd_dummy
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$ap_sttl_cd, "pay_schd_dt"},	// ap_sttl_cd
				{$trd_cur_com_paid_tax_cd, "true;true"},	// trd_cur_com_paid_tax_cd
				{$ap_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP;pay_schd_dt"},	// ap_dpt_cd
				{$pay_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP;pay_schd_dt"},	// pay_dpt_cd
				{$so_dpt_cd, "pay_schd_dt"},	// so_dpt_cd
				{$adv_pay_act_no, "ap_dpt_cd"},	// adv_pay_act_no
				{$draw_branch_cd, "draw_bank_cd"},	// draw_branch_cd
				{$ap_sttl_cd_dummy, "pay_schd_dt"},	// ap_sttl_cd_dummy
				{$psppl_cd_dummy, "pay_schd_dt"}	// psppl_cd_dummy
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$ap_sttl_cd, "dt"},	// ap_sttl_cd
				{$trd_cur_com_paid_tax_cd, "inc_tax_flg;purc_flg"},	// trd_cur_com_paid_tax_cd
				{$ap_dpt_cd, "dpt_is_srch_typ;dt"},	// ap_dpt_cd
				{$pay_dpt_cd, "dpt_is_srch_typ;dt"},	// pay_dpt_cd
				{$so_dpt_cd, "dt"},	// so_dpt_cd
				{$adv_pay_act_no, "bd_dpt_cd"},	// adv_pay_act_no
				{$draw_branch_cd, "bank_cd"},	// draw_branch_cd
				{$ap_sttl_cd_dummy, "dt"},	// ap_sttl_cd_dummy
				{$psppl_cd_dummy, "dt"}	// psppl_cd_dummy
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$xrate_p + ".xrate", "BASE_CUR"},	// xrate_p.xrate
				{$base_cur_amt_p + ".amt", "BASE_CUR"},	// base_cur_amt_p.amt
				{$base_cur_com_paid_tax_amt_p + ".amt", "BASE_CUR"}	// base_cur_com_paid_tax_amt_p.amt
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
	protected DtlSchdR_MC_A(ConstMetaList<? extends DtlSchdR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlSchdR clone() {
		return (DtlSchdR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlSchdR createInstance() {
		return (DtlSchdR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlSchdR getValues(String... names) {
		return (DtlSchdR) super.getValues(names);
	}



	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return getConstDate(offset + 0, $pay_schd_dt);
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		setConstDate(offset + 0, $pay_schd_dt, value);
	}


	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public String ap_sttl_cd() {
		return getConstString(offset + 1, $ap_sttl_cd);
	}

	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public void ap_sttl_cd(String value) {
		setConstString(offset + 1, $ap_sttl_cd, value);
	}


	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public String ap_sttl_nm() {
		return getConstString(offset + 2, $ap_sttl_nm);
	}

	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public void ap_sttl_nm(String value) {
		setConstString(offset + 2, $ap_sttl_nm, value);
	}


	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public String ap_sttl_typ() {
		return getConstString(offset + 3, $ap_sttl_typ);
	}

	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public void ap_sttl_typ(String value) {
		setConstString(offset + 3, $ap_sttl_typ, value);
	}


	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public String ap_sttl_typ_nm() {
		return getConstString(offset + 4, $ap_sttl_typ_nm);
	}

	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public void ap_sttl_typ_nm(String value) {
		setConstString(offset + 4, $ap_sttl_typ_nm, value);
	}


	/**
	 * AP offset result recording flg. 債務相殺実績計上ＦＬＧ.<p>
	 *
	 */
	public boolean ap_setoff_act_flg() {
		return getConstBoolean(offset + 5, $ap_setoff_act_flg);
	}

	/**
	 * AP offset result recording flg. 債務相殺実績計上ＦＬＧ.<p>
	 *
	 */
	public void ap_setoff_act_flg(boolean value) {
		setConstBoolean(offset + 5, $ap_setoff_act_flg, value);
	}


	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return getConstString(offset + 6, $pay_bank_ac_cd);
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		setConstString(offset + 6, $pay_bank_ac_cd, value);
	}


	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public String pay_bank_ac_nm() {
		return getConstString(offset + 7, $pay_bank_ac_nm);
	}

	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public void pay_bank_ac_nm(String value) {
		setConstString(offset + 7, $pay_bank_ac_nm, value);
	}


	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 8, $bank_ac_cd);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 8, $bank_ac_cd, value);
	}


	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public String bank_ac_nm() {
		return getConstString(offset + 9, $bank_ac_nm);
	}

	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public void bank_ac_nm(String value) {
		setConstString(offset + 9, $bank_ac_nm, value);
	}


	/**
	 * Fee cd. (Transaction currency) 取引通貨手数料税ＣＤ.<p>
	 *
	 */
	public String trd_cur_com_paid_tax_cd() {
		return getConstString(offset + 10, $trd_cur_com_paid_tax_cd);
	}

	/**
	 * Fee cd. (Transaction currency) 取引通貨手数料税ＣＤ.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_cd(String value) {
		setConstString(offset + 10, $trd_cur_com_paid_tax_cd, value);
	}


	/**
	 * Fee tax name (Transaction currency) 取引通貨手数料税名.<p>
	 *
	 */
	public String trd_cur_com_paid_tax_nm() {
		return getConstString(offset + 11, $trd_cur_com_paid_tax_nm);
	}

	/**
	 * Fee tax name (Transaction currency) 取引通貨手数料税名.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_nm(String value) {
		setConstString(offset + 11, $trd_cur_com_paid_tax_nm, value);
	}


	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public MCNumber trd_cur_com_paid_tax_rate() {
		return getConstNumber(offset + 12, $trd_cur_com_paid_tax_rate);
	}

	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(MCNumber value) {
		setConstNumber(offset + 12, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(int value) {
		setConstNumber(offset + 12, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(long value) {
		setConstNumber(offset + 12, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(float value) {
		setConstNumber(offset + 12, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(double value) {
		setConstNumber(offset + 12, $trd_cur_com_paid_tax_rate, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 13, $trd_cur_amt_p);
	}
	
	public void trd_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 13, $trd_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_com_paid_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 14, $trd_cur_com_paid_tax_amt_p);
	}
	
	public void trd_cur_com_paid_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 14, $trd_cur_com_paid_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5390.XrateR xrate_p(){
		return (mcframe.clientMAUB.MAUBP5390.XrateR) getConstInnerRow(offset + 15, $xrate_p);
	}
	
	public void xrate_p(mcframe.clientMAUB.MAUBP5390.XrateR row){
		setConstInnerRow(offset + 15, $xrate_p, row);
	}


	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 16, $asppl_cd);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 16, $asppl_cd, value);
	}


	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public String asppl_nm() {
		return getConstString(offset + 17, $asppl_nm);
	}

	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public void asppl_nm(String value) {
		setConstString(offset + 17, $asppl_nm, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 18, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 18, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 19, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 19, $ap_dpt_nm, value);
	}


	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public String ap_typ() {
		return getConstString(offset + 20, $ap_typ);
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public void ap_typ(String value) {
		setConstString(offset + 20, $ap_typ, value);
	}


	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public String ap_typ_nm() {
		return getConstString(offset + 21, $ap_typ_nm);
	}

	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public void ap_typ_nm(String value) {
		setConstString(offset + 21, $ap_typ_nm, value);
	}


	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public String pay_dpt_cd() {
		return getConstString(offset + 22, $pay_dpt_cd);
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public void pay_dpt_cd(String value) {
		setConstString(offset + 22, $pay_dpt_cd, value);
	}


	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public String pay_dpt_nm() {
		return getConstString(offset + 23, $pay_dpt_nm);
	}

	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public void pay_dpt_nm(String value) {
		setConstString(offset + 23, $pay_dpt_nm, value);
	}


	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public String ap_setoff_typ() {
		return getConstString(offset + 24, $ap_setoff_typ);
	}

	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public void ap_setoff_typ(String value) {
		setConstString(offset + 24, $ap_setoff_typ, value);
	}


	/**
	 * AP offset destination name 債務相殺先区分名.<p>
	 *
	 */
	public String ap_setoff_typ_nm() {
		return getConstString(offset + 25, $ap_setoff_typ_nm);
	}

	/**
	 * AP offset destination name 債務相殺先区分名.<p>
	 *
	 */
	public void ap_setoff_typ_nm(String value) {
		setConstString(offset + 25, $ap_setoff_typ_nm, value);
	}


	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public String setoff_cd() {
		return getConstString(offset + 26, $setoff_cd);
	}

	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public void setoff_cd(String value) {
		setConstString(offset + 26, $setoff_cd, value);
	}


	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public String setoff_nm() {
		return getConstString(offset + 27, $setoff_nm);
	}

	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public void setoff_nm(String value) {
		setConstString(offset + 27, $setoff_nm, value);
	}


	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public String so_dpt_cd() {
		return getConstString(offset + 28, $so_dpt_cd);
	}

	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public void so_dpt_cd(String value) {
		setConstString(offset + 28, $so_dpt_cd, value);
	}


	/**
	 * Offset dept. name 相殺部門名.<p>
	 *
	 */
	public String so_dpt_nm() {
		return getConstString(offset + 29, $so_dpt_nm);
	}

	/**
	 * Offset dept. name 相殺部門名.<p>
	 *
	 */
	public void so_dpt_nm(String value) {
		setConstString(offset + 29, $so_dpt_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR setoff_limit_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 30, $setoff_limit_amt_p);
	}
	
	public void setoff_limit_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 30, $setoff_limit_amt_p, row);
	}


	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public String adv_pay_act_no() {
		return getConstString(offset + 31, $adv_pay_act_no);
	}

	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public void adv_pay_act_no(String value) {
		setConstString(offset + 31, $adv_pay_act_no, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR adv_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 32, $adv_amt_p);
	}
	
	public void adv_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 32, $adv_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR setoff_schd_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 33, $setoff_schd_amt_p);
	}
	
	public void setoff_schd_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 33, $setoff_schd_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR setoff_act_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 34, $setoff_act_amt_p);
	}
	
	public void setoff_act_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 34, $setoff_act_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR not_proc_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 35, $not_proc_bal_p);
	}
	
	public void not_proc_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 35, $not_proc_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 36, $base_cur_amt_p);
	}
	
	public void base_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 36, $base_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_com_paid_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 37, $base_cur_com_paid_tax_amt_p);
	}
	
	public void base_cur_com_paid_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 37, $base_cur_com_paid_tax_amt_p, row);
	}


	/**
	 * Counterpart invoice No. 相手先請求書ＮＯ.<p>
	 *
	 */
	public String rcv_bill_no() {
		return getConstString(offset + 38, $rcv_bill_no);
	}

	/**
	 * Counterpart invoice No. 相手先請求書ＮＯ.<p>
	 *
	 */
	public void rcv_bill_no(String value) {
		setConstString(offset + 38, $rcv_bill_no, value);
	}


	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public String pay_schd_no() {
		return getConstString(offset + 39, $pay_schd_no);
	}

	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public void pay_schd_no(String value) {
		setConstString(offset + 39, $pay_schd_no, value);
	}


	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 40, $note_no);
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 40, $note_no, value);
	}


	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public String note_typ() {
		return getConstString(offset + 41, $note_typ);
	}

	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public void note_typ(String value) {
		setConstString(offset + 41, $note_typ, value);
	}


	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public String note_typ_nm() {
		return getConstString(offset + 42, $note_typ_nm);
	}

	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public void note_typ_nm(String value) {
		setConstString(offset + 42, $note_typ_nm, value);
	}


	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public String note_rsn_cd() {
		return getConstString(offset + 43, $note_rsn_cd);
	}

	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public void note_rsn_cd(String value) {
		setConstString(offset + 43, $note_rsn_cd, value);
	}


	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public String note_rsn_nm() {
		return getConstString(offset + 44, $note_rsn_nm);
	}

	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public void note_rsn_nm(String value) {
		setConstString(offset + 44, $note_rsn_nm, value);
	}


	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public MCDate draw_dt() {
		return getConstDate(offset + 45, $draw_dt);
	}

	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public void draw_dt(MCDate value) {
		setConstDate(offset + 45, $draw_dt, value);
	}


	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public MCNumber note_days() {
		return getConstNumber(offset + 46, $note_days);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(MCNumber value) {
		setConstNumber(offset + 46, $note_days, value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(int value) {
		setConstNumber(offset + 46, $note_days, value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(long value) {
		setConstNumber(offset + 46, $note_days, value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(float value) {
		setConstNumber(offset + 46, $note_days, value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(double value) {
		setConstNumber(offset + 46, $note_days, value);
	}


	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public MCDate due_dt() {
		return getConstDate(offset + 47, $due_dt);
	}

	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public void due_dt(MCDate value) {
		setConstDate(offset + 47, $due_dt, value);
	}


	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public String drawer_nm() {
		return getConstString(offset + 48, $drawer_nm);
	}

	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public void drawer_nm(String value) {
		setConstString(offset + 48, $drawer_nm, value);
	}


	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public String draw_bank_cd() {
		return getConstString(offset + 49, $draw_bank_cd);
	}

	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public void draw_bank_cd(String value) {
		setConstString(offset + 49, $draw_bank_cd, value);
	}


	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public String draw_bank_nm() {
		return getConstString(offset + 50, $draw_bank_nm);
	}

	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public void draw_bank_nm(String value) {
		setConstString(offset + 50, $draw_bank_nm, value);
	}


	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public String draw_branch_cd() {
		return getConstString(offset + 51, $draw_branch_cd);
	}

	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public void draw_branch_cd(String value) {
		setConstString(offset + 51, $draw_branch_cd, value);
	}


	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public String draw_branch_nm() {
		return getConstString(offset + 52, $draw_branch_nm);
	}

	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public void draw_branch_nm(String value) {
		setConstString(offset + 52, $draw_branch_nm, value);
	}


	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public String endrsr() {
		return getConstString(offset + 53, $endrsr);
	}

	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public void endrsr(String value) {
		setConstString(offset + 53, $endrsr, value);
	}


	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public String accptr() {
		return getConstString(offset + 54, $accptr);
	}

	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public void accptr(String value) {
		setConstString(offset + 54, $accptr, value);
	}


	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public String pay_sts_typ() {
		return getConstString(offset + 55, $pay_sts_typ);
	}

	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public void pay_sts_typ(String value) {
		setConstString(offset + 55, $pay_sts_typ, value);
	}


	/**
	 * Payment status type name 支払状況区分名.<p>
	 *
	 */
	public String pay_sts_typ_nm() {
		return getConstString(offset + 56, $pay_sts_typ_nm);
	}

	/**
	 * Payment status type name 支払状況区分名.<p>
	 *
	 */
	public void pay_sts_typ_nm(String value) {
		setConstString(offset + 56, $pay_sts_typ_nm, value);
	}


	/**
	 * Transferred 振替済.<p>
	 *
	 */
	public boolean sw_flg() {
		return getConstBoolean(offset + 57, $sw_flg);
	}

	/**
	 * Transferred 振替済.<p>
	 *
	 */
	public void sw_flg(boolean value) {
		setConstBoolean(offset + 57, $sw_flg, value);
	}


	/**
	 * Reconciled amount (Transaction currency) 取引通貨消込額.<p>
	 *
	 */
	public MCNumber trd_cur_appl_amt() {
		return getConstNumber(offset + 58, $trd_cur_appl_amt);
	}

	/**
	 * Reconciled amount (Transaction currency) 取引通貨消込額.<p>
	 *
	 */
	public void trd_cur_appl_amt(MCNumber value) {
		setConstNumber(offset + 58, $trd_cur_appl_amt, value);
	}

	/**
	 * Reconciled amount (Transaction currency) 取引通貨消込額.<p>
	 *
	 */
	public void trd_cur_appl_amt(int value) {
		setConstNumber(offset + 58, $trd_cur_appl_amt, value);
	}

	/**
	 * Reconciled amount (Transaction currency) 取引通貨消込額.<p>
	 *
	 */
	public void trd_cur_appl_amt(long value) {
		setConstNumber(offset + 58, $trd_cur_appl_amt, value);
	}

	/**
	 * Reconciled amount (Transaction currency) 取引通貨消込額.<p>
	 *
	 */
	public void trd_cur_appl_amt(float value) {
		setConstNumber(offset + 58, $trd_cur_appl_amt, value);
	}

	/**
	 * Reconciled amount (Transaction currency) 取引通貨消込額.<p>
	 *
	 */
	public void trd_cur_appl_amt(double value) {
		setConstNumber(offset + 58, $trd_cur_appl_amt, value);
	}


	/**
	 * Offset result creation 相殺実績作成.<p>
	 *
	 */
	public boolean setoff_act_flg() {
		return getConstBoolean(offset + 59, $setoff_act_flg);
	}

	/**
	 * Offset result creation 相殺実績作成.<p>
	 *
	 */
	public void setoff_act_flg(boolean value) {
		setConstBoolean(offset + 59, $setoff_act_flg, value);
	}


	/**
	 * Last offset result creation 前回相殺実績作成.<p>
	 *
	 */
	public boolean last_setoff_act_flg() {
		return getConstBoolean(offset + 60, $last_setoff_act_flg);
	}

	/**
	 * Last offset result creation 前回相殺実績作成.<p>
	 *
	 */
	public void last_setoff_act_flg(boolean value) {
		setConstBoolean(offset + 60, $last_setoff_act_flg, value);
	}


	/**
	 * Cancellation recording date (For work) 取消計上日(作業用).<p>
	 *
	 */
	public MCDate can_ac_dt_dummy() {
		return getConstDate(offset + 61, $can_ac_dt_dummy);
	}

	/**
	 * Cancellation recording date (For work) 取消計上日(作業用).<p>
	 *
	 */
	public void can_ac_dt_dummy(MCDate value) {
		setConstDate(offset + 61, $can_ac_dt_dummy, value);
	}


	public mcframe.clientMAUB.MAUBP5240.CanAcDtR can_ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP5240.CanAcDtR) getConstInnerRow(offset + 62, $can_ac_dt_p);
	}
	
	public void can_ac_dt_p(mcframe.clientMAUB.MAUBP5240.CanAcDtR row){
		setConstInnerRow(offset + 62, $can_ac_dt_p, row);
	}


	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public String pay_ntc_d_print_rmrks() {
		return getConstString(offset + 63, $pay_ntc_d_print_rmrks);
	}

	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public void pay_ntc_d_print_rmrks(String value) {
		setConstString(offset + 63, $pay_ntc_d_print_rmrks, value);
	}


	/**
	 * Payment schedule table details 支払予定表備考.<p>
	 *
	 */
	public String pay_schd_print_rmrks() {
		return getConstString(offset + 64, $pay_schd_print_rmrks);
	}

	/**
	 * Payment schedule table details 支払予定表備考.<p>
	 *
	 */
	public void pay_schd_print_rmrks(String value) {
		setConstString(offset + 64, $pay_schd_print_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 65, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 65, $trd_d_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 66, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 66, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 67, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 67, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 68, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 68, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 69, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 69, $sub_char3, value);
	}


	/**
	 * AP settlement method cd. (For work) 債務決済方法ＣＤ(作業用).<p>
	 *
	 */
	public String ap_sttl_cd_dummy() {
		return getConstString(offset + 70, $ap_sttl_cd_dummy);
	}

	/**
	 * AP settlement method cd. (For work) 債務決済方法ＣＤ(作業用).<p>
	 *
	 */
	public void ap_sttl_cd_dummy(String value) {
		setConstString(offset + 70, $ap_sttl_cd_dummy, value);
	}


	/**
	 * Payee cd. (For work) 支払先ＣＤ(作業用).<p>
	 *
	 */
	public String psppl_cd_dummy() {
		return getConstString(offset + 71, $psppl_cd_dummy);
	}

	/**
	 * Payee cd. (For work) 支払先ＣＤ(作業用).<p>
	 *
	 */
	public void psppl_cd_dummy(String value) {
		setConstString(offset + 71, $psppl_cd_dummy, value);
	}


	/**
	 * Amount (Transaction currency) (Before change) 取引通貨金額(変更前).<p>
	 *
	 */
	public MCNumber old_trd_cur_amt() {
		return getConstNumber(offset + 72, $old_trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) (Before change) 取引通貨金額(変更前).<p>
	 *
	 */
	public void old_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 72, $old_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) (Before change) 取引通貨金額(変更前).<p>
	 *
	 */
	public void old_trd_cur_amt(int value) {
		setConstNumber(offset + 72, $old_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) (Before change) 取引通貨金額(変更前).<p>
	 *
	 */
	public void old_trd_cur_amt(long value) {
		setConstNumber(offset + 72, $old_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) (Before change) 取引通貨金額(変更前).<p>
	 *
	 */
	public void old_trd_cur_amt(float value) {
		setConstNumber(offset + 72, $old_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) (Before change) 取引通貨金額(変更前).<p>
	 *
	 */
	public void old_trd_cur_amt(double value) {
		setConstNumber(offset + 72, $old_trd_cur_amt, value);
	}


	/**
	 * AP offset destination type (Before change) 債務相殺先区分(変更前).<p>
	 *
	 */
	public String old_ap_setoff_typ() {
		return getConstString(offset + 73, $old_ap_setoff_typ);
	}

	/**
	 * AP offset destination type (Before change) 債務相殺先区分(変更前).<p>
	 *
	 */
	public void old_ap_setoff_typ(String value) {
		setConstString(offset + 73, $old_ap_setoff_typ, value);
	}


	/**
	 * AP offset destination cd. (Before change) 債務相殺先ＣＤ(変更前).<p>
	 *
	 */
	public String old_setoff_cd() {
		return getConstString(offset + 74, $old_setoff_cd);
	}

	/**
	 * AP offset destination cd. (Before change) 債務相殺先ＣＤ(変更前).<p>
	 *
	 */
	public void old_setoff_cd(String value) {
		setConstString(offset + 74, $old_setoff_cd, value);
	}


	/**
	 * AP offset dept. cd. (Before change) 債務相殺部門ＣＤ(変更前).<p>
	 *
	 */
	public String old_so_dpt_cd() {
		return getConstString(offset + 75, $old_so_dpt_cd);
	}

	/**
	 * AP offset dept. cd. (Before change) 債務相殺部門ＣＤ(変更前).<p>
	 *
	 */
	public void old_so_dpt_cd(String value) {
		setConstString(offset + 75, $old_so_dpt_cd, value);
	}


	/**
	 * Balance to be offset (Before change) 相殺対象残高(変更前).<p>
	 *
	 */
	public MCNumber old_setoff_limit_amt() {
		return getConstNumber(offset + 76, $old_setoff_limit_amt);
	}

	/**
	 * Balance to be offset (Before change) 相殺対象残高(変更前).<p>
	 *
	 */
	public void old_setoff_limit_amt(MCNumber value) {
		setConstNumber(offset + 76, $old_setoff_limit_amt, value);
	}

	/**
	 * Balance to be offset (Before change) 相殺対象残高(変更前).<p>
	 *
	 */
	public void old_setoff_limit_amt(int value) {
		setConstNumber(offset + 76, $old_setoff_limit_amt, value);
	}

	/**
	 * Balance to be offset (Before change) 相殺対象残高(変更前).<p>
	 *
	 */
	public void old_setoff_limit_amt(long value) {
		setConstNumber(offset + 76, $old_setoff_limit_amt, value);
	}

	/**
	 * Balance to be offset (Before change) 相殺対象残高(変更前).<p>
	 *
	 */
	public void old_setoff_limit_amt(float value) {
		setConstNumber(offset + 76, $old_setoff_limit_amt, value);
	}

	/**
	 * Balance to be offset (Before change) 相殺対象残高(変更前).<p>
	 *
	 */
	public void old_setoff_limit_amt(double value) {
		setConstNumber(offset + 76, $old_setoff_limit_amt, value);
	}


	/**
	 * Advance payment amount payment result No. (Before change) 前渡金支払実績ＮＯ(変更前).<p>
	 *
	 */
	public String old_adv_pay_act_no() {
		return getConstString(offset + 77, $old_adv_pay_act_no);
	}

	/**
	 * Advance payment amount payment result No. (Before change) 前渡金支払実績ＮＯ(変更前).<p>
	 *
	 */
	public void old_adv_pay_act_no(String value) {
		setConstString(offset + 77, $old_adv_pay_act_no, value);
	}


	/**
	 * Scheduled advance payment offset amount (Before change) 前渡金相殺予定額(変更前).<p>
	 *
	 */
	public MCNumber old_setoff_schd_amt() {
		return getConstNumber(offset + 78, $old_setoff_schd_amt);
	}

	/**
	 * Scheduled advance payment offset amount (Before change) 前渡金相殺予定額(変更前).<p>
	 *
	 */
	public void old_setoff_schd_amt(MCNumber value) {
		setConstNumber(offset + 78, $old_setoff_schd_amt, value);
	}

	/**
	 * Scheduled advance payment offset amount (Before change) 前渡金相殺予定額(変更前).<p>
	 *
	 */
	public void old_setoff_schd_amt(int value) {
		setConstNumber(offset + 78, $old_setoff_schd_amt, value);
	}

	/**
	 * Scheduled advance payment offset amount (Before change) 前渡金相殺予定額(変更前).<p>
	 *
	 */
	public void old_setoff_schd_amt(long value) {
		setConstNumber(offset + 78, $old_setoff_schd_amt, value);
	}

	/**
	 * Scheduled advance payment offset amount (Before change) 前渡金相殺予定額(変更前).<p>
	 *
	 */
	public void old_setoff_schd_amt(float value) {
		setConstNumber(offset + 78, $old_setoff_schd_amt, value);
	}

	/**
	 * Scheduled advance payment offset amount (Before change) 前渡金相殺予定額(変更前).<p>
	 *
	 */
	public void old_setoff_schd_amt(double value) {
		setConstNumber(offset + 78, $old_setoff_schd_amt, value);
	}


	public String ar_typ() {
		return getConstString(offset + 79, $ar_typ);
	}

	public void ar_typ(String value) {
		setConstString(offset + 79, $ar_typ, value);
	}


	public String old_ar_typ() {
		return getConstString(offset + 80, $old_ar_typ);
	}

	public void old_ar_typ(String value) {
		setConstString(offset + 80, $old_ar_typ, value);
	}


	public String getString(String name) {
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			return ap_sttl_nm();
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			return ap_sttl_typ();
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			return ap_sttl_typ_nm();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			return pay_bank_ac_nm();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_cd();
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_nm();
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
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			return pay_dpt_nm();
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			return ap_setoff_typ();
		}
		if ($ap_setoff_typ_nm.equalsIgnoreCase(name)) {
			return ap_setoff_typ_nm();
		}
		if ($setoff_cd.equalsIgnoreCase(name)) {
			return setoff_cd();
		}
		if ($setoff_nm.equalsIgnoreCase(name)) {
			return setoff_nm();
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			return so_dpt_cd();
		}
		if ($so_dpt_nm.equalsIgnoreCase(name)) {
			return so_dpt_nm();
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			return adv_pay_act_no();
		}
		if ($rcv_bill_no.equalsIgnoreCase(name)) {
			return rcv_bill_no();
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			return pay_schd_no();
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
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			return note_rsn_cd();
		}
		if ($note_rsn_nm.equalsIgnoreCase(name)) {
			return note_rsn_nm();
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			return drawer_nm();
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
		if ($endrsr.equalsIgnoreCase(name)) {
			return endrsr();
		}
		if ($accptr.equalsIgnoreCase(name)) {
			return accptr();
		}
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			return pay_sts_typ();
		}
		if ($pay_sts_typ_nm.equalsIgnoreCase(name)) {
			return pay_sts_typ_nm();
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_ntc_d_print_rmrks();
		}
		if ($pay_schd_print_rmrks.equalsIgnoreCase(name)) {
			return pay_schd_print_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
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
		if ($ap_sttl_cd_dummy.equalsIgnoreCase(name)) {
			return ap_sttl_cd_dummy();
		}
		if ($psppl_cd_dummy.equalsIgnoreCase(name)) {
			return psppl_cd_dummy();
		}
		if ($old_ap_setoff_typ.equalsIgnoreCase(name)) {
			return old_ap_setoff_typ();
		}
		if ($old_setoff_cd.equalsIgnoreCase(name)) {
			return old_setoff_cd();
		}
		if ($old_so_dpt_cd.equalsIgnoreCase(name)) {
			return old_so_dpt_cd();
		}
		if ($old_adv_pay_act_no.equalsIgnoreCase(name)) {
			return old_adv_pay_act_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($old_ar_typ.equalsIgnoreCase(name)) {
			return old_ar_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_rate();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			return trd_cur_appl_amt();
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			return old_trd_cur_amt();
		}
		if ($old_setoff_limit_amt.equalsIgnoreCase(name)) {
			return old_setoff_limit_amt();
		}
		if ($old_setoff_schd_amt.equalsIgnoreCase(name)) {
			return old_setoff_schd_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			return draw_dt();
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		if ($can_ac_dt_dummy.equalsIgnoreCase(name)) {
			return can_ac_dt_dummy();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($ap_setoff_act_flg.equalsIgnoreCase(name)) {
			return ap_setoff_act_flg();
		}
		if ($sw_flg.equalsIgnoreCase(name)) {
			return sw_flg();
		}
		if ($setoff_act_flg.equalsIgnoreCase(name)) {
			return setoff_act_flg();
		}
		if ($last_setoff_act_flg.equalsIgnoreCase(name)) {
			return last_setoff_act_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			return ap_sttl_nm();
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			return ap_sttl_typ();
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			return ap_sttl_typ_nm();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			return pay_bank_ac_nm();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_cd();
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_nm();
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
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			return pay_dpt_nm();
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			return ap_setoff_typ();
		}
		if ($ap_setoff_typ_nm.equalsIgnoreCase(name)) {
			return ap_setoff_typ_nm();
		}
		if ($setoff_cd.equalsIgnoreCase(name)) {
			return setoff_cd();
		}
		if ($setoff_nm.equalsIgnoreCase(name)) {
			return setoff_nm();
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			return so_dpt_cd();
		}
		if ($so_dpt_nm.equalsIgnoreCase(name)) {
			return so_dpt_nm();
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			return adv_pay_act_no();
		}
		if ($rcv_bill_no.equalsIgnoreCase(name)) {
			return rcv_bill_no();
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			return pay_schd_no();
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
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			return note_rsn_cd();
		}
		if ($note_rsn_nm.equalsIgnoreCase(name)) {
			return note_rsn_nm();
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			return drawer_nm();
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
		if ($endrsr.equalsIgnoreCase(name)) {
			return endrsr();
		}
		if ($accptr.equalsIgnoreCase(name)) {
			return accptr();
		}
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			return pay_sts_typ();
		}
		if ($pay_sts_typ_nm.equalsIgnoreCase(name)) {
			return pay_sts_typ_nm();
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_ntc_d_print_rmrks();
		}
		if ($pay_schd_print_rmrks.equalsIgnoreCase(name)) {
			return pay_schd_print_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
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
		if ($ap_sttl_cd_dummy.equalsIgnoreCase(name)) {
			return ap_sttl_cd_dummy();
		}
		if ($psppl_cd_dummy.equalsIgnoreCase(name)) {
			return psppl_cd_dummy();
		}
		if ($old_ap_setoff_typ.equalsIgnoreCase(name)) {
			return old_ap_setoff_typ();
		}
		if ($old_setoff_cd.equalsIgnoreCase(name)) {
			return old_setoff_cd();
		}
		if ($old_so_dpt_cd.equalsIgnoreCase(name)) {
			return old_so_dpt_cd();
		}
		if ($old_adv_pay_act_no.equalsIgnoreCase(name)) {
			return old_adv_pay_act_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($old_ar_typ.equalsIgnoreCase(name)) {
			return old_ar_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_rate();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			return trd_cur_appl_amt();
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			return old_trd_cur_amt();
		}
		if ($old_setoff_limit_amt.equalsIgnoreCase(name)) {
			return old_setoff_limit_amt();
		}
		if ($old_setoff_schd_amt.equalsIgnoreCase(name)) {
			return old_setoff_schd_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			return draw_dt();
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		if ($can_ac_dt_dummy.equalsIgnoreCase(name)) {
			return can_ac_dt_dummy();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ap_setoff_act_flg.equalsIgnoreCase(name)) {
			return ap_setoff_act_flg();
		}
		if ($sw_flg.equalsIgnoreCase(name)) {
			return sw_flg();
		}
		if ($setoff_act_flg.equalsIgnoreCase(name)) {
			return setoff_act_flg();
		}
		if ($last_setoff_act_flg.equalsIgnoreCase(name)) {
			return last_setoff_act_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			ap_sttl_cd(value);
			return;
		}
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			ap_sttl_nm(value);
			return;
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			ap_sttl_typ(value);
			return;
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			ap_sttl_typ_nm(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			pay_bank_ac_nm(value);
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
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_cd(value);
			return;
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_nm(value);
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
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			pay_dpt_cd(value);
			return;
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			pay_dpt_nm(value);
			return;
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			ap_setoff_typ(value);
			return;
		}
		if ($ap_setoff_typ_nm.equalsIgnoreCase(name)) {
			ap_setoff_typ_nm(value);
			return;
		}
		if ($setoff_cd.equalsIgnoreCase(name)) {
			setoff_cd(value);
			return;
		}
		if ($setoff_nm.equalsIgnoreCase(name)) {
			setoff_nm(value);
			return;
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			so_dpt_cd(value);
			return;
		}
		if ($so_dpt_nm.equalsIgnoreCase(name)) {
			so_dpt_nm(value);
			return;
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			adv_pay_act_no(value);
			return;
		}
		if ($rcv_bill_no.equalsIgnoreCase(name)) {
			rcv_bill_no(value);
			return;
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			pay_schd_no(value);
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
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			note_rsn_cd(value);
			return;
		}
		if ($note_rsn_nm.equalsIgnoreCase(name)) {
			note_rsn_nm(value);
			return;
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			drawer_nm(value);
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
		if ($endrsr.equalsIgnoreCase(name)) {
			endrsr(value);
			return;
		}
		if ($accptr.equalsIgnoreCase(name)) {
			accptr(value);
			return;
		}
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			pay_sts_typ(value);
			return;
		}
		if ($pay_sts_typ_nm.equalsIgnoreCase(name)) {
			pay_sts_typ_nm(value);
			return;
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_ntc_d_print_rmrks(value);
			return;
		}
		if ($pay_schd_print_rmrks.equalsIgnoreCase(name)) {
			pay_schd_print_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
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
		if ($ap_sttl_cd_dummy.equalsIgnoreCase(name)) {
			ap_sttl_cd_dummy(value);
			return;
		}
		if ($psppl_cd_dummy.equalsIgnoreCase(name)) {
			psppl_cd_dummy(value);
			return;
		}
		if ($old_ap_setoff_typ.equalsIgnoreCase(name)) {
			old_ap_setoff_typ(value);
			return;
		}
		if ($old_setoff_cd.equalsIgnoreCase(name)) {
			old_setoff_cd(value);
			return;
		}
		if ($old_so_dpt_cd.equalsIgnoreCase(name)) {
			old_so_dpt_cd(value);
			return;
		}
		if ($old_adv_pay_act_no.equalsIgnoreCase(name)) {
			old_adv_pay_act_no(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($old_ar_typ.equalsIgnoreCase(name)) {
			old_ar_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			trd_cur_appl_amt(value);
			return;
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			old_trd_cur_amt(value);
			return;
		}
		if ($old_setoff_limit_amt.equalsIgnoreCase(name)) {
			old_setoff_limit_amt(value);
			return;
		}
		if ($old_setoff_schd_amt.equalsIgnoreCase(name)) {
			old_setoff_schd_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			trd_cur_appl_amt(value);
			return;
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			old_trd_cur_amt(value);
			return;
		}
		if ($old_setoff_limit_amt.equalsIgnoreCase(name)) {
			old_setoff_limit_amt(value);
			return;
		}
		if ($old_setoff_schd_amt.equalsIgnoreCase(name)) {
			old_setoff_schd_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			trd_cur_appl_amt(value);
			return;
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			old_trd_cur_amt(value);
			return;
		}
		if ($old_setoff_limit_amt.equalsIgnoreCase(name)) {
			old_setoff_limit_amt(value);
			return;
		}
		if ($old_setoff_schd_amt.equalsIgnoreCase(name)) {
			old_setoff_schd_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			trd_cur_appl_amt(value);
			return;
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			old_trd_cur_amt(value);
			return;
		}
		if ($old_setoff_limit_amt.equalsIgnoreCase(name)) {
			old_setoff_limit_amt(value);
			return;
		}
		if ($old_setoff_schd_amt.equalsIgnoreCase(name)) {
			old_setoff_schd_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			trd_cur_appl_amt(value);
			return;
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			old_trd_cur_amt(value);
			return;
		}
		if ($old_setoff_limit_amt.equalsIgnoreCase(name)) {
			old_setoff_limit_amt(value);
			return;
		}
		if ($old_setoff_schd_amt.equalsIgnoreCase(name)) {
			old_setoff_schd_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
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
		if ($can_ac_dt_dummy.equalsIgnoreCase(name)) {
			can_ac_dt_dummy(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($ap_setoff_act_flg.equalsIgnoreCase(name)) {
			ap_setoff_act_flg(value);
			return;
		}
		if ($sw_flg.equalsIgnoreCase(name)) {
			sw_flg(value);
			return;
		}
		if ($setoff_act_flg.equalsIgnoreCase(name)) {
			setoff_act_flg(value);
			return;
		}
		if ($last_setoff_act_flg.equalsIgnoreCase(name)) {
			last_setoff_act_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			ap_sttl_cd(value);
			return;
		}
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			ap_sttl_nm(value);
			return;
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			ap_sttl_typ(value);
			return;
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			ap_sttl_typ_nm(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			pay_bank_ac_nm(value);
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
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_cd(value);
			return;
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_nm(value);
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
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			pay_dpt_cd(value);
			return;
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			pay_dpt_nm(value);
			return;
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			ap_setoff_typ(value);
			return;
		}
		if ($ap_setoff_typ_nm.equalsIgnoreCase(name)) {
			ap_setoff_typ_nm(value);
			return;
		}
		if ($setoff_cd.equalsIgnoreCase(name)) {
			setoff_cd(value);
			return;
		}
		if ($setoff_nm.equalsIgnoreCase(name)) {
			setoff_nm(value);
			return;
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			so_dpt_cd(value);
			return;
		}
		if ($so_dpt_nm.equalsIgnoreCase(name)) {
			so_dpt_nm(value);
			return;
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			adv_pay_act_no(value);
			return;
		}
		if ($rcv_bill_no.equalsIgnoreCase(name)) {
			rcv_bill_no(value);
			return;
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			pay_schd_no(value);
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
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			note_rsn_cd(value);
			return;
		}
		if ($note_rsn_nm.equalsIgnoreCase(name)) {
			note_rsn_nm(value);
			return;
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			drawer_nm(value);
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
		if ($endrsr.equalsIgnoreCase(name)) {
			endrsr(value);
			return;
		}
		if ($accptr.equalsIgnoreCase(name)) {
			accptr(value);
			return;
		}
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			pay_sts_typ(value);
			return;
		}
		if ($pay_sts_typ_nm.equalsIgnoreCase(name)) {
			pay_sts_typ_nm(value);
			return;
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_ntc_d_print_rmrks(value);
			return;
		}
		if ($pay_schd_print_rmrks.equalsIgnoreCase(name)) {
			pay_schd_print_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
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
		if ($ap_sttl_cd_dummy.equalsIgnoreCase(name)) {
			ap_sttl_cd_dummy(value);
			return;
		}
		if ($psppl_cd_dummy.equalsIgnoreCase(name)) {
			psppl_cd_dummy(value);
			return;
		}
		if ($old_ap_setoff_typ.equalsIgnoreCase(name)) {
			old_ap_setoff_typ(value);
			return;
		}
		if ($old_setoff_cd.equalsIgnoreCase(name)) {
			old_setoff_cd(value);
			return;
		}
		if ($old_so_dpt_cd.equalsIgnoreCase(name)) {
			old_so_dpt_cd(value);
			return;
		}
		if ($old_adv_pay_act_no.equalsIgnoreCase(name)) {
			old_adv_pay_act_no(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($old_ar_typ.equalsIgnoreCase(name)) {
			old_ar_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			trd_cur_appl_amt(value);
			return;
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			old_trd_cur_amt(value);
			return;
		}
		if ($old_setoff_limit_amt.equalsIgnoreCase(name)) {
			old_setoff_limit_amt(value);
			return;
		}
		if ($old_setoff_schd_amt.equalsIgnoreCase(name)) {
			old_setoff_schd_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			trd_cur_appl_amt(value);
			return;
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			old_trd_cur_amt(value);
			return;
		}
		if ($old_setoff_limit_amt.equalsIgnoreCase(name)) {
			old_setoff_limit_amt(value);
			return;
		}
		if ($old_setoff_schd_amt.equalsIgnoreCase(name)) {
			old_setoff_schd_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			trd_cur_appl_amt(value);
			return;
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			old_trd_cur_amt(value);
			return;
		}
		if ($old_setoff_limit_amt.equalsIgnoreCase(name)) {
			old_setoff_limit_amt(value);
			return;
		}
		if ($old_setoff_schd_amt.equalsIgnoreCase(name)) {
			old_setoff_schd_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			trd_cur_appl_amt(value);
			return;
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			old_trd_cur_amt(value);
			return;
		}
		if ($old_setoff_limit_amt.equalsIgnoreCase(name)) {
			old_setoff_limit_amt(value);
			return;
		}
		if ($old_setoff_schd_amt.equalsIgnoreCase(name)) {
			old_setoff_schd_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($trd_cur_appl_amt.equalsIgnoreCase(name)) {
			trd_cur_appl_amt(value);
			return;
		}
		if ($old_trd_cur_amt.equalsIgnoreCase(name)) {
			old_trd_cur_amt(value);
			return;
		}
		if ($old_setoff_limit_amt.equalsIgnoreCase(name)) {
			old_setoff_limit_amt(value);
			return;
		}
		if ($old_setoff_schd_amt.equalsIgnoreCase(name)) {
			old_setoff_schd_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
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
		if ($can_ac_dt_dummy.equalsIgnoreCase(name)) {
			can_ac_dt_dummy(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($ap_setoff_act_flg.equalsIgnoreCase(name)) {
			ap_setoff_act_flg(value);
			return;
		}
		if ($sw_flg.equalsIgnoreCase(name)) {
			sw_flg(value);
			return;
		}
		if ($setoff_act_flg.equalsIgnoreCase(name)) {
			setoff_act_flg(value);
			return;
		}
		if ($last_setoff_act_flg.equalsIgnoreCase(name)) {
			last_setoff_act_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($trd_cur_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_amt_p();
		}
		if ($trd_cur_com_paid_tax_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_amt_p();
		}
		if ($xrate_p.equalsIgnoreCase(name)) {
			return xrate_p();
		}
		if ($setoff_limit_amt_p.equalsIgnoreCase(name)) {
			return setoff_limit_amt_p();
		}
		if ($adv_amt_p.equalsIgnoreCase(name)) {
			return adv_amt_p();
		}
		if ($setoff_schd_amt_p.equalsIgnoreCase(name)) {
			return setoff_schd_amt_p();
		}
		if ($setoff_act_amt_p.equalsIgnoreCase(name)) {
			return setoff_act_amt_p();
		}
		if ($not_proc_bal_p.equalsIgnoreCase(name)) {
			return not_proc_bal_p();
		}
		if ($base_cur_amt_p.equalsIgnoreCase(name)) {
			return base_cur_amt_p();
		}
		if ($base_cur_com_paid_tax_amt_p.equalsIgnoreCase(name)) {
			return base_cur_com_paid_tax_amt_p();
		}
		if ($can_ac_dt_p.equalsIgnoreCase(name)) {
			return can_ac_dt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($trd_cur_amt_p.equalsIgnoreCase(name)) {
			trd_cur_amt_p(
				((MCContainerMeta) trd_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($trd_cur_com_paid_tax_amt_p.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt_p(
				((MCContainerMeta) trd_cur_com_paid_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xrate_p.equalsIgnoreCase(name)) {
			xrate_p(
				((MCContainerMeta) xrate_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5390.XrateR.class, value)
			);
			return;
		}
		if ($setoff_limit_amt_p.equalsIgnoreCase(name)) {
			setoff_limit_amt_p(
				((MCContainerMeta) setoff_limit_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($adv_amt_p.equalsIgnoreCase(name)) {
			adv_amt_p(
				((MCContainerMeta) adv_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($setoff_schd_amt_p.equalsIgnoreCase(name)) {
			setoff_schd_amt_p(
				((MCContainerMeta) setoff_schd_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($setoff_act_amt_p.equalsIgnoreCase(name)) {
			setoff_act_amt_p(
				((MCContainerMeta) setoff_act_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($not_proc_bal_p.equalsIgnoreCase(name)) {
			not_proc_bal_p(
				((MCContainerMeta) not_proc_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_amt_p.equalsIgnoreCase(name)) {
			base_cur_amt_p(
				((MCContainerMeta) base_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_com_paid_tax_amt_p.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt_p(
				((MCContainerMeta) base_cur_com_paid_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($can_ac_dt_p.equalsIgnoreCase(name)) {
			can_ac_dt_p(
				((MCContainerMeta) can_ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5240.CanAcDtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
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
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public MCNumber trd_cur_com_paid_tax_amt() {
		return trd_cur_com_paid_tax_amt_p().amt();
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(MCNumber value) {
		trd_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(int value) {
		trd_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(long value) {
		trd_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(float value) {
		trd_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(double value) {
		trd_cur_com_paid_tax_amt_p().amt(value);
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
	 * Balance to be offset 相殺対象残高.<p>
	 *
	 */
	public MCNumber setoff_limit_amt() {
		return setoff_limit_amt_p().amt();
	}

	/**
	 * Balance to be offset 相殺対象残高.<p>
	 *
	 */
	public void setoff_limit_amt(MCNumber value) {
		setoff_limit_amt_p().amt(value);
	}

	/**
	 * Balance to be offset 相殺対象残高.<p>
	 *
	 */
	public void setoff_limit_amt(int value) {
		setoff_limit_amt_p().amt(value);
	}

	/**
	 * Balance to be offset 相殺対象残高.<p>
	 *
	 */
	public void setoff_limit_amt(long value) {
		setoff_limit_amt_p().amt(value);
	}

	/**
	 * Balance to be offset 相殺対象残高.<p>
	 *
	 */
	public void setoff_limit_amt(float value) {
		setoff_limit_amt_p().amt(value);
	}

	/**
	 * Balance to be offset 相殺対象残高.<p>
	 *
	 */
	public void setoff_limit_amt(double value) {
		setoff_limit_amt_p().amt(value);
	}

	/**
	 * Advance payment amount 前渡金額.<p>
	 *
	 */
	public MCNumber adv_amt() {
		return adv_amt_p().amt();
	}

	/**
	 * Advance payment amount 前渡金額.<p>
	 *
	 */
	public void adv_amt(MCNumber value) {
		adv_amt_p().amt(value);
	}

	/**
	 * Advance payment amount 前渡金額.<p>
	 *
	 */
	public void adv_amt(int value) {
		adv_amt_p().amt(value);
	}

	/**
	 * Advance payment amount 前渡金額.<p>
	 *
	 */
	public void adv_amt(long value) {
		adv_amt_p().amt(value);
	}

	/**
	 * Advance payment amount 前渡金額.<p>
	 *
	 */
	public void adv_amt(float value) {
		adv_amt_p().amt(value);
	}

	/**
	 * Advance payment amount 前渡金額.<p>
	 *
	 */
	public void adv_amt(double value) {
		adv_amt_p().amt(value);
	}

	/**
	 * Scheduled advance payment offset amount 前渡金相殺予定額.<p>
	 *
	 */
	public MCNumber setoff_schd_amt() {
		return setoff_schd_amt_p().amt();
	}

	/**
	 * Scheduled advance payment offset amount 前渡金相殺予定額.<p>
	 *
	 */
	public void setoff_schd_amt(MCNumber value) {
		setoff_schd_amt_p().amt(value);
	}

	/**
	 * Scheduled advance payment offset amount 前渡金相殺予定額.<p>
	 *
	 */
	public void setoff_schd_amt(int value) {
		setoff_schd_amt_p().amt(value);
	}

	/**
	 * Scheduled advance payment offset amount 前渡金相殺予定額.<p>
	 *
	 */
	public void setoff_schd_amt(long value) {
		setoff_schd_amt_p().amt(value);
	}

	/**
	 * Scheduled advance payment offset amount 前渡金相殺予定額.<p>
	 *
	 */
	public void setoff_schd_amt(float value) {
		setoff_schd_amt_p().amt(value);
	}

	/**
	 * Scheduled advance payment offset amount 前渡金相殺予定額.<p>
	 *
	 */
	public void setoff_schd_amt(double value) {
		setoff_schd_amt_p().amt(value);
	}

	/**
	 * Advance payment offset result amount 前渡金相殺実績額.<p>
	 *
	 */
	public MCNumber setoff_act_amt() {
		return setoff_act_amt_p().amt();
	}

	/**
	 * Advance payment offset result amount 前渡金相殺実績額.<p>
	 *
	 */
	public void setoff_act_amt(MCNumber value) {
		setoff_act_amt_p().amt(value);
	}

	/**
	 * Advance payment offset result amount 前渡金相殺実績額.<p>
	 *
	 */
	public void setoff_act_amt(int value) {
		setoff_act_amt_p().amt(value);
	}

	/**
	 * Advance payment offset result amount 前渡金相殺実績額.<p>
	 *
	 */
	public void setoff_act_amt(long value) {
		setoff_act_amt_p().amt(value);
	}

	/**
	 * Advance payment offset result amount 前渡金相殺実績額.<p>
	 *
	 */
	public void setoff_act_amt(float value) {
		setoff_act_amt_p().amt(value);
	}

	/**
	 * Advance payment offset result amount 前渡金相殺実績額.<p>
	 *
	 */
	public void setoff_act_amt(double value) {
		setoff_act_amt_p().amt(value);
	}

	/**
	 * Advance payment unreconciled balance 前渡金未消込残高.<p>
	 *
	 */
	public MCNumber not_proc_bal() {
		return not_proc_bal_p().amt();
	}

	/**
	 * Advance payment unreconciled balance 前渡金未消込残高.<p>
	 *
	 */
	public void not_proc_bal(MCNumber value) {
		not_proc_bal_p().amt(value);
	}

	/**
	 * Advance payment unreconciled balance 前渡金未消込残高.<p>
	 *
	 */
	public void not_proc_bal(int value) {
		not_proc_bal_p().amt(value);
	}

	/**
	 * Advance payment unreconciled balance 前渡金未消込残高.<p>
	 *
	 */
	public void not_proc_bal(long value) {
		not_proc_bal_p().amt(value);
	}

	/**
	 * Advance payment unreconciled balance 前渡金未消込残高.<p>
	 *
	 */
	public void not_proc_bal(float value) {
		not_proc_bal_p().amt(value);
	}

	/**
	 * Advance payment unreconciled balance 前渡金未消込残高.<p>
	 *
	 */
	public void not_proc_bal(double value) {
		not_proc_bal_p().amt(value);
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
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public MCNumber base_cur_com_paid_tax_amt() {
		return base_cur_com_paid_tax_amt_p().amt();
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(MCNumber value) {
		base_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(int value) {
		base_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(long value) {
		base_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(float value) {
		base_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(double value) {
		base_cur_com_paid_tax_amt_p().amt(value);
	}

	public MCDate can_ac_dt_for_input() {
		return can_ac_dt_p().can_ac_dt_for_input();
	}

	public void can_ac_dt_for_input(MCDate value) {
		can_ac_dt_p().can_ac_dt_for_input(value);
	}

	public MCDate can_ac_dt() {
		return can_ac_dt_p().can_ac_dt_for_call();
	}

	public void can_ac_dt(MCDate value) {
		can_ac_dt_p().can_ac_dt_for_call(value);
	}

	public MCDate ac_dt_after_srch() {
		return can_ac_dt_p().ac_dt_after_srch();
	}

	public void ac_dt_after_srch(MCDate value) {
		can_ac_dt_p().ac_dt_after_srch(value);
	}

}

