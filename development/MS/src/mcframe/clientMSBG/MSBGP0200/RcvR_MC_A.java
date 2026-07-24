package mcframe.clientMSBG.MSBGP0200;

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
	 * Split 分割.<p>
	 *
	 */
	public static final String $div_flg = "div_flg";
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
	 * Payment received method type 入金方法区分.<p>
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
	 * Sales result 売上.<p>
	 *
	 */
	public static final String $purc_flg = "purc_flg";
	/**
	 * Purchase 仕入.<p>
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
	public static final String $debtor_id_typ = "debtor_id_typ";
	/**
	 * Debtor identification type name 借方先識別区分名.<p>
	 *
	 */
	public static final String $debtor_id_typ_nm = "debtor_id_typ_nm";
	/**
	 * Debtor cd. 借方先ＣＤ.<p>
	 *
	 */
	public static final String $debtor_id_cd = "debtor_id_cd";
	/**
	 * Debtor name 借方先名.<p>
	 *
	 */
	public static final String $debtor_nm = "debtor_nm";
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public static final String $debt_bd_dpt_cd = "debt_bd_dpt_cd";
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public static final String $debt_bd_dpt_nm = "debt_bd_dpt_nm";
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
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public static final String $ar_sttl_cd3 = "ar_sttl_cd3";
	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public static final String $ar_sttl_nm3 = "ar_sttl_nm3";
	/**
	 * Creditor identification type 貸方先識別区分.<p>
	 *
	 */
	public static final String $creditor_id_typ = "creditor_id_typ";
	/**
	 * Creditor identification type name 貸方先識別区分名.<p>
	 *
	 */
	public static final String $creditor_id_typ_nm = "creditor_id_typ_nm";
	/**
	 * Creditor cd. 貸方先ＣＤ.<p>
	 *
	 */
	public static final String $creditor_id_cd = "creditor_id_cd";
	/**
	 * Creditor name 貸方先名.<p>
	 *
	 */
	public static final String $creditor_nm = "creditor_nm";
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public static final String $cred_bd_dpt_cd = "cred_bd_dpt_cd";
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public static final String $cred_bd_dpt_nm = "cred_bd_dpt_nm";
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
	/**
	 * Payment received data type 入金データ区分.<p>
	 *
	 */
	public static final String $dat_typ = "dat_typ";
	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public static final String $bill_cl_typ = "bill_cl_typ";
	/**
	 * Display advance received on invoice 請求書前受金表示.<p>
	 *
	 */
	public static final String $bill_dtl_adv_flg = "bill_dtl_adv_flg";

	public static final String $xrate = $xrate_p + ".xrate";
	public static final String $rcv_amt = $rcv_amt_p + ".amt";
	public static final String $not_proc_bal = $not_proc_bal_p + ".amt";
	public static final String $not_proc_bal_w = $not_proc_bal_w_p + ".amt";

	public static final MCMeta rcv_no_META = createCommonMeta($rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta rcv_dt_META = createCommonMeta($rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_nm_META = createCommonMeta($rcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta old_rcst_cd_META = createCommonMeta($old_rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta div_flg_META = createCommonMeta($div_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta old_bcst_cd_META = createCommonMeta($old_bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_nm_META = createCommonMeta($bill_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta old_bill_dpt_cd_META = createCommonMeta($old_bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta upri_dec_place_META = createCommonMeta($upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
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
	public static final MCMeta ar_sttl_nm2_META = createCommonMeta($ar_sttl_nm2, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta sls_purc_typ2_META = createCommonMeta($sls_purc_typ2, mcframe.commonMA.meta.MA_META.SLS_PURC_TYP);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_cd_sub_META = createCommonMeta($tax_cd_sub, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta debtor_id_typ_META = createCommonMeta($debtor_id_typ, mcframe.commonMA.meta.MA_META.DEBT_CRED_ID_TYP);
	public static final MCMeta debtor_id_typ_nm_META = createCommonMeta($debtor_id_typ_nm, mcframe.commonMA.meta.MA_META.DEBT_CRED_ID_TYP_NM);
	public static final MCMeta debtor_id_cd_META = createCommonMeta($debtor_id_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta debtor_nm_META = createCommonMeta($debtor_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta debt_bd_dpt_cd_META = createCommonMeta($debt_bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta debt_bd_dpt_nm_META = createCommonMeta($debt_bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
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
	public static final MCMeta ar_sttl_cd3_META = createCommonMeta($ar_sttl_cd3, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_nm3_META = createCommonMeta($ar_sttl_nm3, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta creditor_id_typ_META = createCommonMeta($creditor_id_typ, mcframe.commonMA.meta.MA_META.DEBT_CRED_ID_TYP);
	public static final MCMeta creditor_id_typ_nm_META = createCommonMeta($creditor_id_typ_nm, mcframe.commonMA.meta.MA_META.DEBT_CRED_ID_TYP_NM);
	public static final MCMeta creditor_id_cd_META = createCommonMeta($creditor_id_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta creditor_nm_META = createCommonMeta($creditor_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cred_bd_dpt_cd_META = createCommonMeta($cred_bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta cred_bd_dpt_nm_META = createCommonMeta($cred_bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta rcv_act_no_META = createCommonMeta($rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta rcv_act_seq_META = createCommonMeta($rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dat_typ_META = createCommonMeta($dat_typ, mcframe.commonMS.meta.MS_META.RCV_DAT_TYP);
	public static final MCMeta bill_cl_typ_META = createCommonMeta($bill_cl_typ, mcframe.commonMA.meta.MA_META.BILL_CL_TYP);
	public static final MCMeta bill_dtl_adv_flg_META = createCommonMeta($bill_dtl_adv_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<RcvR> constMetas = new ConstMetaList<RcvR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rcv_no_META,
			slo_no_META,
			rcv_dt_META,
			rcst_cd_META,
			rcst_nm_META,
			old_rcst_cd_META,
			div_flg_META,
			bcst_cd_META,
			bcst_nm_META,
			old_bcst_cd_META,
			bill_dpt_cd_META,
			bill_dpt_nm_META,
			old_bill_dpt_cd_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			amt_dec_place_META,
			upri_dec_place_META,
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
			ar_sttl_nm2_META,
			sls_purc_typ2_META,
			purc_flg_META,
			sls_flg_META,
			tax_cd_sub_META,
			tax_cd_META,
			tax_nm_META,
			tax_rate_META,
			debtor_id_typ_META,
			debtor_id_typ_nm_META,
			debtor_id_cd_META,
			debtor_nm_META,
			debt_bd_dpt_cd_META,
			debt_bd_dpt_nm_META,
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
			ar_sttl_cd3_META,
			ar_sttl_nm3_META,
			creditor_id_typ_META,
			creditor_id_typ_nm_META,
			creditor_id_cd_META,
			creditor_nm_META,
			cred_bd_dpt_cd_META,
			cred_bd_dpt_nm_META,
			rcv_act_no_META,
			rcv_act_seq_META,
			ac_dt_META,
			dat_typ_META,
			bill_cl_typ_META,
			bill_dtl_adv_flg_META
		},
		new String[][]{
			{
				"xrate",
				"rcv_amt",
				"not_proc_bal",
				"not_proc_bal_w"
			},
			{
				$xrate,
				$rcv_amt,
				$not_proc_bal,
				$not_proc_bal_w
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
				{$bcst_cd, "bp_nm;bill_cl_typ;bill_dtl_adv_flg"},	// bcst_cd
				{$bill_dpt_cd, "dpt_nm"},	// bill_dpt_cd
				{$trd_cur_cd, "cur_nm;amt_dec_place;upri_dec_place"},	// trd_cur_cd
				{$ar_sttl_cd1, "sttl_nm;ar_sttl_typ;xfr_psn;ar_setoff_cd"},	// ar_sttl_cd1
				{$ar_sttl_cd2, "sttl_nm;sls_purc_typ;debt_cred_id_typ;tax_cd"},	// ar_sttl_cd2
				{$debtor_id_typ, "debt_cred_id_typ_nm"},	// debtor_id_typ
				{$debtor_id_cd, "bp_nm"},	// debtor_id_cd
				{$debt_bd_dpt_cd, "dpt_nm"},	// debt_bd_dpt_cd
				{$ar_sttl_cd3, "sttl_nm;debt_cred_id_typ"},	// ar_sttl_cd3
				{$creditor_id_typ, "debt_cred_id_typ_nm"},	// creditor_id_typ
				{$creditor_id_cd, "bp_nm"},	// creditor_id_cd
				{$cred_bd_dpt_cd, "dpt_nm"}	// cred_bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$rcst_cd, "MAC_BP_IS_SRCH_TYP.RCST"},	// rcst_cd
				{$bcst_cd, "MAC_BP_IS_SRCH_TYP.BCST_BY_RCST;rcst_cd"},	// bcst_cd
				{$bill_dpt_cd, "rcv_dt;bcst_cd;MAC_DPT_IS_SRCH_TYP.BCST"},	// bill_dpt_cd
				{$ar_sttl_cd1, "MAC_RCV_REG_TYP.NON;MAC_RCV_REG_TYP.ARB;rcst_cd;true"},	// ar_sttl_cd1
				{$ar_sttl_cd2, "MAC_AR_STTL_TYP.SETOFF_DR;rcv_dt"},	// ar_sttl_cd2
				{$tax_cd, "purc_flg;sls_flg;true"},	// tax_cd
				{$debtor_id_cd, "debtor_id_typ"},	// debtor_id_cd
				{$debt_bd_dpt_cd, "MAC_DPT_IS_SRCH_TYP.ARAPBD"},	// debt_bd_dpt_cd
				{$ar_sttl_cd3, "MAC_AR_STTL_TYP.SETOFF_CR"},	// ar_sttl_cd3
				{$creditor_id_cd, "creditor_id_typ"},	// creditor_id_cd
				{$cred_bd_dpt_cd, "MAC_DPT_IS_SRCH_TYP.ARAPBD"}	// cred_bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$rcst_cd, "bp_is_srch_typ"},	// rcst_cd
				{$bcst_cd, "bp_is_srch_typ;in_rcst_cd"},	// bcst_cd
				{$bill_dpt_cd, "dt;bcst_cd;dpt_is_srch_typ"},	// bill_dpt_cd
				{$ar_sttl_cd1, "rcv_reg_typ1;rcv_reg_typ2;rcst_cd;except_note_flg"},	// ar_sttl_cd1
				{$ar_sttl_cd2, "ar_sttl_typ;dt"},	// ar_sttl_cd2
				{$tax_cd, "purc_flg;sls_flg;inc_tax_flg"},	// tax_cd
				{$debtor_id_cd, "debt_cred_id_typ"},	// debtor_id_cd
				{$debt_bd_dpt_cd, "dpt_is_srch_typ"},	// debt_bd_dpt_cd
				{$ar_sttl_cd3, "ar_sttl_typ"},	// ar_sttl_cd3
				{$creditor_id_cd, "debt_cred_id_typ"},	// creditor_id_cd
				{$cred_bd_dpt_cd, "dpt_is_srch_typ"}	// cred_bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$xrate_p + ".xrate", "BASE_CUR"},	// xrate_p.xrate
				{$base_cur_cd, "BASE_CUR"},	// base_cur_cd
				{$xrate_cd, "BASE_CUR"}	// xrate_cd
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
	 * Split 分割.<p>
	 *
	 */
	public boolean div_flg() {
		return getConstBoolean(offset + 6, $div_flg);
	}

	/**
	 * Split 分割.<p>
	 *
	 */
	public void div_flg(boolean value) {
		setConstBoolean(offset + 6, $div_flg, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 7, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 7, $bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 8, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 8, $bcst_nm, value);
	}


	/**
	 * Original billing cd. 元請求先ＣＤ.<p>
	 *
	 */
	public String old_bcst_cd() {
		return getConstString(offset + 9, $old_bcst_cd);
	}

	/**
	 * Original billing cd. 元請求先ＣＤ.<p>
	 *
	 */
	public void old_bcst_cd(String value) {
		setConstString(offset + 9, $old_bcst_cd, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 10, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 10, $bill_dpt_cd, value);
	}


	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 11, $bill_dpt_nm);
	}

	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 11, $bill_dpt_nm, value);
	}


	/**
	 * Original billing dept. cd. 元請求部門ＣＤ.<p>
	 *
	 */
	public String old_bill_dpt_cd() {
		return getConstString(offset + 12, $old_bill_dpt_cd);
	}

	/**
	 * Original billing dept. cd. 元請求部門ＣＤ.<p>
	 *
	 */
	public void old_bill_dpt_cd(String value) {
		setConstString(offset + 12, $old_bill_dpt_cd, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 13, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 13, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 14, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 14, $trd_cur_nm, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 15, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 15, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 15, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 15, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 15, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 15, $amt_dec_place, value);
	}


	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber upri_dec_place() {
		return getConstNumber(offset + 16, $upri_dec_place);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(MCNumber value) {
		setConstNumber(offset + 16, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(int value) {
		setConstNumber(offset + 16, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(long value) {
		setConstNumber(offset + 16, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(float value) {
		setConstNumber(offset + 16, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(double value) {
		setConstNumber(offset + 16, $upri_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP0420.XrateR xrate_p(){
		return (mcframe.clientMAUB.MAUBP0420.XrateR) getConstInnerRow(offset + 17, $xrate_p);
	}
	
	public void xrate_p(mcframe.clientMAUB.MAUBP0420.XrateR row){
		setConstInnerRow(offset + 17, $xrate_p, row);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 18, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 18, $base_cur_cd, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 19, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 19, $xrate_cd, value);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR rcv_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 20, $rcv_amt_p);
	}
	
	public void rcv_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 20, $rcv_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR not_proc_bal_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 21, $not_proc_bal_p);
	}
	
	public void not_proc_bal_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 21, $not_proc_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR not_proc_bal_w_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 22, $not_proc_bal_w_p);
	}
	
	public void not_proc_bal_w_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 22, $not_proc_bal_w_p, row);
	}


	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public String ar_sttl_cd1() {
		return getConstString(offset + 23, $ar_sttl_cd1);
	}

	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public void ar_sttl_cd1(String value) {
		setConstString(offset + 23, $ar_sttl_cd1, value);
	}


	/**
	 * Payment received method type 入金方法区分.<p>
	 *
	 */
	public String ar_sttl_typ1() {
		return getConstString(offset + 24, $ar_sttl_typ1);
	}

	/**
	 * Payment received method type 入金方法区分.<p>
	 *
	 */
	public void ar_sttl_typ1(String value) {
		setConstString(offset + 24, $ar_sttl_typ1, value);
	}


	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public String ar_sttl_nm1() {
		return getConstString(offset + 25, $ar_sttl_nm1);
	}

	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public void ar_sttl_nm1(String value) {
		setConstString(offset + 25, $ar_sttl_nm1, value);
	}


	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 26, $bank_ac_cd);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 26, $bank_ac_cd, value);
	}


	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public String bank_ac_nm() {
		return getConstString(offset + 27, $bank_ac_nm);
	}

	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public void bank_ac_nm(String value) {
		setConstString(offset + 27, $bank_ac_nm, value);
	}


	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public String xfr_psn() {
		return getConstString(offset + 28, $xfr_psn);
	}

	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public void xfr_psn(String value) {
		setConstString(offset + 28, $xfr_psn, value);
	}


	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public String ar_sttl_cd2() {
		return getConstString(offset + 29, $ar_sttl_cd2);
	}

	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public void ar_sttl_cd2(String value) {
		setConstString(offset + 29, $ar_sttl_cd2, value);
	}


	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public String ar_sttl_nm2() {
		return getConstString(offset + 30, $ar_sttl_nm2);
	}

	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public void ar_sttl_nm2(String value) {
		setConstString(offset + 30, $ar_sttl_nm2, value);
	}


	/**
	 * Sales purchase tax type 売上仕入税区分.<p>
	 *
	 */
	public String sls_purc_typ2() {
		return getConstString(offset + 31, $sls_purc_typ2);
	}

	/**
	 * Sales purchase tax type 売上仕入税区分.<p>
	 *
	 */
	public void sls_purc_typ2(String value) {
		setConstString(offset + 31, $sls_purc_typ2, value);
	}


	/**
	 * Sales result 売上.<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 32, $purc_flg);
	}

	/**
	 * Sales result 売上.<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 32, $purc_flg, value);
	}


	/**
	 * Purchase 仕入.<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 33, $sls_flg);
	}

	/**
	 * Purchase 仕入.<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 33, $sls_flg, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd_sub() {
		return getConstString(offset + 34, $tax_cd_sub);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd_sub(String value) {
		setConstString(offset + 34, $tax_cd_sub, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 35, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 35, $tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 36, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 36, $tax_nm, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 37, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 37, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 37, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 37, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 37, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 37, $tax_rate, value);
	}


	/**
	 * Debtor identification type 借方先識別区分.<p>
	 *
	 */
	public String debtor_id_typ() {
		return getConstString(offset + 38, $debtor_id_typ);
	}

	/**
	 * Debtor identification type 借方先識別区分.<p>
	 *
	 */
	public void debtor_id_typ(String value) {
		setConstString(offset + 38, $debtor_id_typ, value);
	}


	/**
	 * Debtor identification type name 借方先識別区分名.<p>
	 *
	 */
	public String debtor_id_typ_nm() {
		return getConstString(offset + 39, $debtor_id_typ_nm);
	}

	/**
	 * Debtor identification type name 借方先識別区分名.<p>
	 *
	 */
	public void debtor_id_typ_nm(String value) {
		setConstString(offset + 39, $debtor_id_typ_nm, value);
	}


	/**
	 * Debtor cd. 借方先ＣＤ.<p>
	 *
	 */
	public String debtor_id_cd() {
		return getConstString(offset + 40, $debtor_id_cd);
	}

	/**
	 * Debtor cd. 借方先ＣＤ.<p>
	 *
	 */
	public void debtor_id_cd(String value) {
		setConstString(offset + 40, $debtor_id_cd, value);
	}


	/**
	 * Debtor name 借方先名.<p>
	 *
	 */
	public String debtor_nm() {
		return getConstString(offset + 41, $debtor_nm);
	}

	/**
	 * Debtor name 借方先名.<p>
	 *
	 */
	public void debtor_nm(String value) {
		setConstString(offset + 41, $debtor_nm, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String debt_bd_dpt_cd() {
		return getConstString(offset + 42, $debt_bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void debt_bd_dpt_cd(String value) {
		setConstString(offset + 42, $debt_bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String debt_bd_dpt_nm() {
		return getConstString(offset + 43, $debt_bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void debt_bd_dpt_nm(String value) {
		setConstString(offset + 43, $debt_bd_dpt_nm, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 44, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 44, $trd_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 45, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 45, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 46, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 46, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 47, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 47, $sub_char3, value);
	}


	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public MCNumber rcv_upd_cntr() {
		return getConstNumber(offset + 48, $rcv_upd_cntr);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void rcv_upd_cntr(MCNumber value) {
		setConstNumber(offset + 48, $rcv_upd_cntr, value);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void rcv_upd_cntr(int value) {
		setConstNumber(offset + 48, $rcv_upd_cntr, value);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void rcv_upd_cntr(long value) {
		setConstNumber(offset + 48, $rcv_upd_cntr, value);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void rcv_upd_cntr(float value) {
		setConstNumber(offset + 48, $rcv_upd_cntr, value);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void rcv_upd_cntr(double value) {
		setConstNumber(offset + 48, $rcv_upd_cntr, value);
	}


	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 49, $note_no);
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 49, $note_no, value);
	}


	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public String note_typ() {
		return getConstString(offset + 50, $note_typ);
	}

	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public void note_typ(String value) {
		setConstString(offset + 50, $note_typ, value);
	}


	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public String note_typ_nm() {
		return getConstString(offset + 51, $note_typ_nm);
	}

	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public void note_typ_nm(String value) {
		setConstString(offset + 51, $note_typ_nm, value);
	}


	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public MCDate draw_dt() {
		return getConstDate(offset + 52, $draw_dt);
	}

	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public void draw_dt(MCDate value) {
		setConstDate(offset + 52, $draw_dt, value);
	}


	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public MCDate due_dt() {
		return getConstDate(offset + 53, $due_dt);
	}

	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public void due_dt(MCDate value) {
		setConstDate(offset + 53, $due_dt, value);
	}


	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public String drawer_nm() {
		return getConstString(offset + 54, $drawer_nm);
	}

	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public void drawer_nm(String value) {
		setConstString(offset + 54, $drawer_nm, value);
	}


	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public String endrsr() {
		return getConstString(offset + 55, $endrsr);
	}

	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public void endrsr(String value) {
		setConstString(offset + 55, $endrsr, value);
	}


	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public String accptr() {
		return getConstString(offset + 56, $accptr);
	}

	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public void accptr(String value) {
		setConstString(offset + 56, $accptr, value);
	}


	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public String draw_bank_cd() {
		return getConstString(offset + 57, $draw_bank_cd);
	}

	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public void draw_bank_cd(String value) {
		setConstString(offset + 57, $draw_bank_cd, value);
	}


	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public String draw_bank_nm() {
		return getConstString(offset + 58, $draw_bank_nm);
	}

	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public void draw_bank_nm(String value) {
		setConstString(offset + 58, $draw_bank_nm, value);
	}


	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public String draw_branch_cd() {
		return getConstString(offset + 59, $draw_branch_cd);
	}

	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public void draw_branch_cd(String value) {
		setConstString(offset + 59, $draw_branch_cd, value);
	}


	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public String draw_branch_nm() {
		return getConstString(offset + 60, $draw_branch_nm);
	}

	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public void draw_branch_nm(String value) {
		setConstString(offset + 60, $draw_branch_nm, value);
	}


	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public String note_rsn_cd() {
		return getConstString(offset + 61, $note_rsn_cd);
	}

	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public void note_rsn_cd(String value) {
		setConstString(offset + 61, $note_rsn_cd, value);
	}


	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public String note_rsn_nm() {
		return getConstString(offset + 62, $note_rsn_nm);
	}

	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public void note_rsn_nm(String value) {
		setConstString(offset + 62, $note_rsn_nm, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String note_sub_char1() {
		return getConstString(offset + 63, $note_sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void note_sub_char1(String value) {
		setConstString(offset + 63, $note_sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String note_sub_char2() {
		return getConstString(offset + 64, $note_sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void note_sub_char2(String value) {
		setConstString(offset + 64, $note_sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String note_sub_char3() {
		return getConstString(offset + 65, $note_sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void note_sub_char3(String value) {
		setConstString(offset + 65, $note_sub_char3, value);
	}


	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public String ar_sttl_cd3() {
		return getConstString(offset + 66, $ar_sttl_cd3);
	}

	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public void ar_sttl_cd3(String value) {
		setConstString(offset + 66, $ar_sttl_cd3, value);
	}


	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public String ar_sttl_nm3() {
		return getConstString(offset + 67, $ar_sttl_nm3);
	}

	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public void ar_sttl_nm3(String value) {
		setConstString(offset + 67, $ar_sttl_nm3, value);
	}


	/**
	 * Creditor identification type 貸方先識別区分.<p>
	 *
	 */
	public String creditor_id_typ() {
		return getConstString(offset + 68, $creditor_id_typ);
	}

	/**
	 * Creditor identification type 貸方先識別区分.<p>
	 *
	 */
	public void creditor_id_typ(String value) {
		setConstString(offset + 68, $creditor_id_typ, value);
	}


	/**
	 * Creditor identification type name 貸方先識別区分名.<p>
	 *
	 */
	public String creditor_id_typ_nm() {
		return getConstString(offset + 69, $creditor_id_typ_nm);
	}

	/**
	 * Creditor identification type name 貸方先識別区分名.<p>
	 *
	 */
	public void creditor_id_typ_nm(String value) {
		setConstString(offset + 69, $creditor_id_typ_nm, value);
	}


	/**
	 * Creditor cd. 貸方先ＣＤ.<p>
	 *
	 */
	public String creditor_id_cd() {
		return getConstString(offset + 70, $creditor_id_cd);
	}

	/**
	 * Creditor cd. 貸方先ＣＤ.<p>
	 *
	 */
	public void creditor_id_cd(String value) {
		setConstString(offset + 70, $creditor_id_cd, value);
	}


	/**
	 * Creditor name 貸方先名.<p>
	 *
	 */
	public String creditor_nm() {
		return getConstString(offset + 71, $creditor_nm);
	}

	/**
	 * Creditor name 貸方先名.<p>
	 *
	 */
	public void creditor_nm(String value) {
		setConstString(offset + 71, $creditor_nm, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String cred_bd_dpt_cd() {
		return getConstString(offset + 72, $cred_bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void cred_bd_dpt_cd(String value) {
		setConstString(offset + 72, $cred_bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String cred_bd_dpt_nm() {
		return getConstString(offset + 73, $cred_bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void cred_bd_dpt_nm(String value) {
		setConstString(offset + 73, $cred_bd_dpt_nm, value);
	}


	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public String rcv_act_no() {
		return getConstString(offset + 74, $rcv_act_no);
	}

	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public void rcv_act_no(String value) {
		setConstString(offset + 74, $rcv_act_no, value);
	}


	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public MCNumber rcv_act_seq() {
		return getConstNumber(offset + 75, $rcv_act_seq);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 75, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(int value) {
		setConstNumber(offset + 75, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(long value) {
		setConstNumber(offset + 75, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(float value) {
		setConstNumber(offset + 75, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(double value) {
		setConstNumber(offset + 75, $rcv_act_seq, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 76, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 76, $ac_dt, value);
	}


	/**
	 * Payment received data type 入金データ区分.<p>
	 *
	 */
	public String dat_typ() {
		return getConstString(offset + 77, $dat_typ);
	}

	/**
	 * Payment received data type 入金データ区分.<p>
	 *
	 */
	public void dat_typ(String value) {
		setConstString(offset + 77, $dat_typ, value);
	}


	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public String bill_cl_typ() {
		return getConstString(offset + 78, $bill_cl_typ);
	}

	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public void bill_cl_typ(String value) {
		setConstString(offset + 78, $bill_cl_typ, value);
	}


	/**
	 * Display advance received on invoice 請求書前受金表示.<p>
	 *
	 */
	public boolean bill_dtl_adv_flg() {
		return getConstBoolean(offset + 79, $bill_dtl_adv_flg);
	}

	/**
	 * Display advance received on invoice 請求書前受金表示.<p>
	 *
	 */
	public void bill_dtl_adv_flg(boolean value) {
		setConstBoolean(offset + 79, $bill_dtl_adv_flg, value);
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
		if ($debtor_id_typ.equalsIgnoreCase(name)) {
			return debtor_id_typ();
		}
		if ($debtor_id_typ_nm.equalsIgnoreCase(name)) {
			return debtor_id_typ_nm();
		}
		if ($debtor_id_cd.equalsIgnoreCase(name)) {
			return debtor_id_cd();
		}
		if ($debtor_nm.equalsIgnoreCase(name)) {
			return debtor_nm();
		}
		if ($debt_bd_dpt_cd.equalsIgnoreCase(name)) {
			return debt_bd_dpt_cd();
		}
		if ($debt_bd_dpt_nm.equalsIgnoreCase(name)) {
			return debt_bd_dpt_nm();
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
		if ($ar_sttl_cd3.equalsIgnoreCase(name)) {
			return ar_sttl_cd3();
		}
		if ($ar_sttl_nm3.equalsIgnoreCase(name)) {
			return ar_sttl_nm3();
		}
		if ($creditor_id_typ.equalsIgnoreCase(name)) {
			return creditor_id_typ();
		}
		if ($creditor_id_typ_nm.equalsIgnoreCase(name)) {
			return creditor_id_typ_nm();
		}
		if ($creditor_id_cd.equalsIgnoreCase(name)) {
			return creditor_id_cd();
		}
		if ($creditor_nm.equalsIgnoreCase(name)) {
			return creditor_nm();
		}
		if ($cred_bd_dpt_cd.equalsIgnoreCase(name)) {
			return cred_bd_dpt_cd();
		}
		if ($cred_bd_dpt_nm.equalsIgnoreCase(name)) {
			return cred_bd_dpt_nm();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($dat_typ.equalsIgnoreCase(name)) {
			return dat_typ();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			return rcv_upd_cntr();
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($div_flg.equalsIgnoreCase(name)) {
			return div_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_adv_flg();
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
		if ($debtor_id_typ.equalsIgnoreCase(name)) {
			return debtor_id_typ();
		}
		if ($debtor_id_typ_nm.equalsIgnoreCase(name)) {
			return debtor_id_typ_nm();
		}
		if ($debtor_id_cd.equalsIgnoreCase(name)) {
			return debtor_id_cd();
		}
		if ($debtor_nm.equalsIgnoreCase(name)) {
			return debtor_nm();
		}
		if ($debt_bd_dpt_cd.equalsIgnoreCase(name)) {
			return debt_bd_dpt_cd();
		}
		if ($debt_bd_dpt_nm.equalsIgnoreCase(name)) {
			return debt_bd_dpt_nm();
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
		if ($ar_sttl_cd3.equalsIgnoreCase(name)) {
			return ar_sttl_cd3();
		}
		if ($ar_sttl_nm3.equalsIgnoreCase(name)) {
			return ar_sttl_nm3();
		}
		if ($creditor_id_typ.equalsIgnoreCase(name)) {
			return creditor_id_typ();
		}
		if ($creditor_id_typ_nm.equalsIgnoreCase(name)) {
			return creditor_id_typ_nm();
		}
		if ($creditor_id_cd.equalsIgnoreCase(name)) {
			return creditor_id_cd();
		}
		if ($creditor_nm.equalsIgnoreCase(name)) {
			return creditor_nm();
		}
		if ($cred_bd_dpt_cd.equalsIgnoreCase(name)) {
			return cred_bd_dpt_cd();
		}
		if ($cred_bd_dpt_nm.equalsIgnoreCase(name)) {
			return cred_bd_dpt_nm();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($dat_typ.equalsIgnoreCase(name)) {
			return dat_typ();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			return rcv_upd_cntr();
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($div_flg.equalsIgnoreCase(name)) {
			return div_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_adv_flg();
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
		if ($debtor_id_typ.equalsIgnoreCase(name)) {
			debtor_id_typ(value);
			return;
		}
		if ($debtor_id_typ_nm.equalsIgnoreCase(name)) {
			debtor_id_typ_nm(value);
			return;
		}
		if ($debtor_id_cd.equalsIgnoreCase(name)) {
			debtor_id_cd(value);
			return;
		}
		if ($debtor_nm.equalsIgnoreCase(name)) {
			debtor_nm(value);
			return;
		}
		if ($debt_bd_dpt_cd.equalsIgnoreCase(name)) {
			debt_bd_dpt_cd(value);
			return;
		}
		if ($debt_bd_dpt_nm.equalsIgnoreCase(name)) {
			debt_bd_dpt_nm(value);
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
		if ($ar_sttl_cd3.equalsIgnoreCase(name)) {
			ar_sttl_cd3(value);
			return;
		}
		if ($ar_sttl_nm3.equalsIgnoreCase(name)) {
			ar_sttl_nm3(value);
			return;
		}
		if ($creditor_id_typ.equalsIgnoreCase(name)) {
			creditor_id_typ(value);
			return;
		}
		if ($creditor_id_typ_nm.equalsIgnoreCase(name)) {
			creditor_id_typ_nm(value);
			return;
		}
		if ($creditor_id_cd.equalsIgnoreCase(name)) {
			creditor_id_cd(value);
			return;
		}
		if ($creditor_nm.equalsIgnoreCase(name)) {
			creditor_nm(value);
			return;
		}
		if ($cred_bd_dpt_cd.equalsIgnoreCase(name)) {
			cred_bd_dpt_cd(value);
			return;
		}
		if ($cred_bd_dpt_nm.equalsIgnoreCase(name)) {
			cred_bd_dpt_nm(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($dat_typ.equalsIgnoreCase(name)) {
			dat_typ(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($div_flg.equalsIgnoreCase(name)) {
			div_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			bill_dtl_adv_flg(value);
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
		if ($debtor_id_typ.equalsIgnoreCase(name)) {
			debtor_id_typ(value);
			return;
		}
		if ($debtor_id_typ_nm.equalsIgnoreCase(name)) {
			debtor_id_typ_nm(value);
			return;
		}
		if ($debtor_id_cd.equalsIgnoreCase(name)) {
			debtor_id_cd(value);
			return;
		}
		if ($debtor_nm.equalsIgnoreCase(name)) {
			debtor_nm(value);
			return;
		}
		if ($debt_bd_dpt_cd.equalsIgnoreCase(name)) {
			debt_bd_dpt_cd(value);
			return;
		}
		if ($debt_bd_dpt_nm.equalsIgnoreCase(name)) {
			debt_bd_dpt_nm(value);
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
		if ($ar_sttl_cd3.equalsIgnoreCase(name)) {
			ar_sttl_cd3(value);
			return;
		}
		if ($ar_sttl_nm3.equalsIgnoreCase(name)) {
			ar_sttl_nm3(value);
			return;
		}
		if ($creditor_id_typ.equalsIgnoreCase(name)) {
			creditor_id_typ(value);
			return;
		}
		if ($creditor_id_typ_nm.equalsIgnoreCase(name)) {
			creditor_id_typ_nm(value);
			return;
		}
		if ($creditor_id_cd.equalsIgnoreCase(name)) {
			creditor_id_cd(value);
			return;
		}
		if ($creditor_nm.equalsIgnoreCase(name)) {
			creditor_nm(value);
			return;
		}
		if ($cred_bd_dpt_cd.equalsIgnoreCase(name)) {
			cred_bd_dpt_cd(value);
			return;
		}
		if ($cred_bd_dpt_nm.equalsIgnoreCase(name)) {
			cred_bd_dpt_nm(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($dat_typ.equalsIgnoreCase(name)) {
			dat_typ(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($div_flg.equalsIgnoreCase(name)) {
			div_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			bill_dtl_adv_flg(value);
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
	 * Unreconciled balance work 未処理残高_ワーク.<p>
	 *
	 */
	public MCNumber not_proc_bal_w() {
		return not_proc_bal_w_p().amt();
	}

	/**
	 * Unreconciled balance work 未処理残高_ワーク.<p>
	 *
	 */
	public void not_proc_bal_w(MCNumber value) {
		not_proc_bal_w_p().amt(value);
	}

	/**
	 * Unreconciled balance work 未処理残高_ワーク.<p>
	 *
	 */
	public void not_proc_bal_w(int value) {
		not_proc_bal_w_p().amt(value);
	}

	/**
	 * Unreconciled balance work 未処理残高_ワーク.<p>
	 *
	 */
	public void not_proc_bal_w(long value) {
		not_proc_bal_w_p().amt(value);
	}

	/**
	 * Unreconciled balance work 未処理残高_ワーク.<p>
	 *
	 */
	public void not_proc_bal_w(float value) {
		not_proc_bal_w_p().amt(value);
	}

	/**
	 * Unreconciled balance work 未処理残高_ワーク.<p>
	 *
	 */
	public void not_proc_bal_w(double value) {
		not_proc_bal_w_p().amt(value);
	}

}

