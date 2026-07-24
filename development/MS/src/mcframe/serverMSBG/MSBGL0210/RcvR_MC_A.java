package mcframe.serverMSBG.MSBGL0210;

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
 * ブロック"Rcv"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RcvR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
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
	 * AR settlement method cd. 1 債権決済方法ＣＤ１.<p>
	 *
	 */
	public static final String $ar_sttl_cd1 = "ar_sttl_cd1";
	/**
	 * AR settlement type 1 債権決済区分１.<p>
	 *
	 */
	public static final String $ar_sttl_typ1 = "ar_sttl_typ1";
	/**
	 * AR settlement method cd. 2 債権決済方法ＣＤ２.<p>
	 *
	 */
	public static final String $ar_sttl_cd2 = "ar_sttl_cd2";
	/**
	 * AR settlement type 2 債権決済区分２.<p>
	 *
	 */
	public static final String $ar_sttl_typ2 = "ar_sttl_typ2";
	/**
	 * AR settlement method cd. 3 債権決済方法ＣＤ３.<p>
	 *
	 */
	public static final String $ar_sttl_cd3 = "ar_sttl_cd3";
	/**
	 * AR settlement type 3 債権決済区分３.<p>
	 *
	 */
	public static final String $ar_sttl_typ3 = "ar_sttl_typ3";
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
	 * Tax cd. 1 税ＣＤ１.<p>
	 *
	 */
	public static final String $tax_cd1 = "tax_cd1";
	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public static final String $tax_rate1 = "tax_rate1";
	/**
	 * Tax type 1 税区分１.<p>
	 *
	 */
	public static final String $tax_typ1 = "tax_typ1";
	/**
	 * Tax cd. 2 税ＣＤ２.<p>
	 *
	 */
	public static final String $tax_cd2 = "tax_cd2";
	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public static final String $tax_rate2 = "tax_rate2";
	/**
	 * Tax type 2 税区分２.<p>
	 *
	 */
	public static final String $tax_typ2 = "tax_typ2";
	/**
	 * Tax cd. 3 税ＣＤ３.<p>
	 *
	 */
	public static final String $tax_cd3 = "tax_cd3";
	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public static final String $tax_rate3 = "tax_rate3";
	/**
	 * Tax type 3 税区分３.<p>
	 *
	 */
	public static final String $tax_typ3 = "tax_typ3";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public static final String $rcv_amt = "rcv_amt";
	/**
	 * Unreconciled amount 未処理額.<p>
	 *
	 */
	public static final String $not_proc_bal = "not_proc_bal";
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public static final String $rcv_dt = "rcv_dt";
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public static final String $xfr_psn = "xfr_psn";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 * Debtor identification type 借方先識別区分.<p>
	 *
	 */
	public static final String $debt_cred_id_typ = "debt_cred_id_typ";
	/**
	 * Debtor identification cd. 借方先識別ＣＤ.<p>
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
	 * Note management No. 手形管理ＮＯ.<p>
	 *
	 */
	public static final String $note_mng_no = "note_mng_no";
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
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public static final String $draw_branch_cd = "draw_branch_cd";
	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public static final String $note_rsn_cd = "note_rsn_cd";
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
	 * Offset payment received No. 相殺入金ＮＯ.<p>
	 *
	 */
	public static final String $setoff_rcv_no = "setoff_rcv_no";
	/**
	 * Offset settlement method cd. 3 相殺取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $setoff_trd_cur_cd = "setoff_trd_cur_cd";
	/**
	 * Offset exchange rate 相殺為替レート.<p>
	 *
	 */
	public static final String $setoff_xrate = "setoff_xrate";
	/**
	 * Offset exchange rate cd. 相殺為替レートＣＤ.<p>
	 *
	 */
	public static final String $setoff_xrate_cd = "setoff_xrate_cd";
	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public static final String $setoff_rcv_amt = "setoff_rcv_amt";
	/**
	 * Offset outstanding amount 相殺未処理額.<p>
	 *
	 */
	public static final String $setoff_not_proc_bal = "setoff_not_proc_bal";
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
	 * Offset settlement method cd. 1 相殺決済方法ＣＤ１.<p>
	 *
	 */
	public static final String $setoff_sttl_cd1 = "setoff_sttl_cd1";
	/**
	 * Offset settlement type 1 相殺決済区分１.<p>
	 *
	 */
	public static final String $setoff_sttl_typ1 = "setoff_sttl_typ1";
	/**
	 * Offset settlement method cd. 2 相殺決済方法ＣＤ２.<p>
	 *
	 */
	public static final String $setoff_sttl_cd2 = "setoff_sttl_cd2";
	/**
	 * Offset settlement type 2 相殺決済区分２.<p>
	 *
	 */
	public static final String $setoff_sttl_typ2 = "setoff_sttl_typ2";
	/**
	 * Offset settlement method cd. 3 相殺決済方法ＣＤ３.<p>
	 *
	 */
	public static final String $setoff_sttl_cd3 = "setoff_sttl_cd3";
	/**
	 * Offset settlement type 3 相殺決済区分３.<p>
	 *
	 */
	public static final String $setoff_sttl_typ3 = "setoff_sttl_typ3";
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
	 * Offset tax cd. 1 相殺税ＣＤ１.<p>
	 *
	 */
	public static final String $setoff_tax_cd1 = "setoff_tax_cd1";
	/**
	 * Offset tax rate 1 相殺税率１.<p>
	 *
	 */
	public static final String $setoff_tax_rate1 = "setoff_tax_rate1";
	/**
	 * Offset tax type 1 相殺税区分１.<p>
	 *
	 */
	public static final String $setoff_tax_typ1 = "setoff_tax_typ1";
	/**
	 * Offset tax cd. 2 相殺税ＣＤ２.<p>
	 *
	 */
	public static final String $setoff_tax_cd2 = "setoff_tax_cd2";
	/**
	 * Offset tax rate 2 相殺税率２.<p>
	 *
	 */
	public static final String $setoff_tax_rate2 = "setoff_tax_rate2";
	/**
	 * Offset tax type 2 相殺税区分２.<p>
	 *
	 */
	public static final String $setoff_tax_typ2 = "setoff_tax_typ2";
	/**
	 * Offset tax cd. 3 相殺税ＣＤ３.<p>
	 *
	 */
	public static final String $setoff_tax_cd3 = "setoff_tax_cd3";
	/**
	 * Offset tax rate 3 相殺税率３.<p>
	 *
	 */
	public static final String $setoff_tax_rate3 = "setoff_tax_rate3";
	/**
	 * Offset tax type 3 相殺税区分３.<p>
	 *
	 */
	public static final String $setoff_tax_typ3 = "setoff_tax_typ3";
	/**
	 * Debtor identification type 借方先識別区分.<p>
	 *
	 */
	public static final String $setoff_debt_cred_id_typ = "setoff_debt_cred_id_typ";
	/**
	 * Debtor identification cd. 借方先識別ＣＤ.<p>
	 *
	 */
	public static final String $setoff_debt_cred_id_cd = "setoff_debt_cred_id_cd";
	/**
	 * Debtor remarks 借方先備考.<p>
	 *
	 */
	public static final String $setoff_debt_cred_nm = "setoff_debt_cred_nm";
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public static final String $setoff_bd_dpt_cd = "setoff_bd_dpt_cd";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_no_META = createCommonMeta($rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta ar_sttl_cd1_META = createCommonMeta($ar_sttl_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_typ1_META = createCommonMeta($ar_sttl_typ1, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta ar_sttl_cd2_META = createCommonMeta($ar_sttl_cd2, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_typ2_META = createCommonMeta($ar_sttl_typ2, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta ar_sttl_cd3_META = createCommonMeta($ar_sttl_cd3, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_typ3_META = createCommonMeta($ar_sttl_typ3, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta sls_purc_typ2_META = createCommonMeta($sls_purc_typ2, mcframe.commonMA.meta.MA_META.SLS_PURC_TYP);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_cd1_META = createCommonMeta($tax_cd1, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_rate1_META = createCommonMeta($tax_rate1, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_typ1_META = createCommonMeta($tax_typ1, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta tax_cd2_META = createCommonMeta($tax_cd2, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_rate2_META = createCommonMeta($tax_rate2, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_typ2_META = createCommonMeta($tax_typ2, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta tax_cd3_META = createCommonMeta($tax_cd3, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_rate3_META = createCommonMeta($tax_rate3, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_typ3_META = createCommonMeta($tax_typ3, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta rcv_amt_META = createCommonMeta($rcv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta not_proc_bal_META = createCommonMeta($not_proc_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_dt_META = createCommonMeta($rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta xfr_psn_META = createCommonMeta($xfr_psn, mcframe.commonMA.meta.MA_META.XFR_PSN);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta debt_cred_id_typ_META = createCommonMeta($debt_cred_id_typ, mcframe.commonMA.meta.MA_META.DEBT_CRED_ID_TYP);
	public static final MCMeta debt_cred_id_cd_META = createCommonMeta($debt_cred_id_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta debt_cred_nm_META = createCommonMeta($debt_cred_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR3);
	public static final MCMeta rcv_upd_cntr_META = createCommonMeta($rcv_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta note_mng_no_META = createCommonMeta($note_mng_no, mcframe.commonMA.meta.MA_META.NOTE_MNG_NO);
	public static final MCMeta note_no_META = createCommonMeta($note_no, mcframe.commonMA.meta.MA_META.NOTE_NO);
	public static final MCMeta note_typ_META = createCommonMeta($note_typ, mcframe.commonMA.meta.MA_META.NOTE_TYP);
	public static final MCMeta draw_dt_META = createCommonMeta($draw_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta due_dt_META = createCommonMeta($due_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta drawer_nm_META = createCommonMeta($drawer_nm, mcframe.commonMA.meta.MA_META.DRAWER_NM);
	public static final MCMeta endrsr_META = createCommonMeta($endrsr, mcframe.commonMA.meta.MA_META.NOTE_ENDRSR);
	public static final MCMeta accptr_META = createCommonMeta($accptr, mcframe.commonMA.meta.MA_META.NOTE_ACCPTR);
	public static final MCMeta draw_bank_cd_META = createCommonMeta($draw_bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta draw_branch_cd_META = createCommonMeta($draw_branch_cd, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta note_rsn_cd_META = createCommonMeta($note_rsn_cd, mcframe.commonMA.meta.MA_META.NOTE_RSN_CD);
	public static final MCMeta note_sub_char1_META = createCommonMeta($note_sub_char1, mcframe.commonMS.meta.MS_META.NOTE_SUB_CHAR1);
	public static final MCMeta note_sub_char2_META = createCommonMeta($note_sub_char2, mcframe.commonMS.meta.MS_META.NOTE_SUB_CHAR2);
	public static final MCMeta note_sub_char3_META = createCommonMeta($note_sub_char3, mcframe.commonMS.meta.MS_META.NOTE_SUB_CHAR3);
	public static final MCMeta setoff_rcv_no_META = createCommonMeta($setoff_rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta setoff_trd_cur_cd_META = createCommonMeta($setoff_trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta setoff_xrate_META = createCommonMeta($setoff_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_xrate_cd_META = createCommonMeta($setoff_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta setoff_rcv_amt_META = createCommonMeta($setoff_rcv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_not_proc_bal_META = createCommonMeta($setoff_not_proc_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_dt_META = createCommonMeta($setoff_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta setoff_bcst_cd_META = createCommonMeta($setoff_bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta setoff_trd_rmrks_META = createCommonMeta($setoff_trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta setoff_sub_char1_META = createCommonMeta($setoff_sub_char1, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR1);
	public static final MCMeta setoff_sub_char2_META = createCommonMeta($setoff_sub_char2, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR2);
	public static final MCMeta setoff_sub_char3_META = createCommonMeta($setoff_sub_char3, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR3);
	public static final MCMeta setoff_sttl_cd1_META = createCommonMeta($setoff_sttl_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta setoff_sttl_typ1_META = createCommonMeta($setoff_sttl_typ1, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta setoff_sttl_cd2_META = createCommonMeta($setoff_sttl_cd2, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta setoff_sttl_typ2_META = createCommonMeta($setoff_sttl_typ2, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta setoff_sttl_cd3_META = createCommonMeta($setoff_sttl_cd3, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta setoff_sttl_typ3_META = createCommonMeta($setoff_sttl_typ3, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta setoff_sls_purc_typ_META = createCommonMeta($setoff_sls_purc_typ, mcframe.commonMA.meta.MA_META.SLS_PURC_TYP);
	public static final MCMeta setoff_purc_flg_META = createCommonMeta($setoff_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta setoff_sls_flg_META = createCommonMeta($setoff_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta setoff_tax_cd1_META = createCommonMeta($setoff_tax_cd1, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta setoff_tax_rate1_META = createCommonMeta($setoff_tax_rate1, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta setoff_tax_typ1_META = createCommonMeta($setoff_tax_typ1, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta setoff_tax_cd2_META = createCommonMeta($setoff_tax_cd2, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta setoff_tax_rate2_META = createCommonMeta($setoff_tax_rate2, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta setoff_tax_typ2_META = createCommonMeta($setoff_tax_typ2, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta setoff_tax_cd3_META = createCommonMeta($setoff_tax_cd3, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta setoff_tax_rate3_META = createCommonMeta($setoff_tax_rate3, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta setoff_tax_typ3_META = createCommonMeta($setoff_tax_typ3, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta setoff_debt_cred_id_typ_META = createCommonMeta($setoff_debt_cred_id_typ, mcframe.commonMA.meta.MA_META.DEBT_CRED_ID_TYP);
	public static final MCMeta setoff_debt_cred_id_cd_META = createCommonMeta($setoff_debt_cred_id_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta setoff_debt_cred_nm_META = createCommonMeta($setoff_debt_cred_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta setoff_bd_dpt_cd_META = createCommonMeta($setoff_bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);

	protected static final ConstMetaList<RcvR> constMetas = new ConstMetaList<RcvR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			rcv_no_META,
			slo_no_META,
			ar_sttl_cd1_META,
			ar_sttl_typ1_META,
			ar_sttl_cd2_META,
			ar_sttl_typ2_META,
			ar_sttl_cd3_META,
			ar_sttl_typ3_META,
			sls_purc_typ2_META,
			purc_flg_META,
			sls_flg_META,
			tax_cd1_META,
			tax_rate1_META,
			tax_typ1_META,
			tax_cd2_META,
			tax_rate2_META,
			tax_typ2_META,
			tax_cd3_META,
			tax_rate3_META,
			tax_typ3_META,
			trd_cur_cd_META,
			rcv_amt_META,
			not_proc_bal_META,
			rcv_dt_META,
			bank_ac_cd_META,
			rcst_cd_META,
			bcst_cd_META,
			bill_dpt_cd_META,
			xfr_psn_META,
			xrate_META,
			xrate_cd_META,
			debt_cred_id_typ_META,
			debt_cred_id_cd_META,
			debt_cred_nm_META,
			bd_dpt_cd_META,
			trd_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			rcv_upd_cntr_META,
			note_mng_no_META,
			note_no_META,
			note_typ_META,
			draw_dt_META,
			due_dt_META,
			drawer_nm_META,
			endrsr_META,
			accptr_META,
			draw_bank_cd_META,
			draw_branch_cd_META,
			note_rsn_cd_META,
			note_sub_char1_META,
			note_sub_char2_META,
			note_sub_char3_META,
			setoff_rcv_no_META,
			setoff_trd_cur_cd_META,
			setoff_xrate_META,
			setoff_xrate_cd_META,
			setoff_rcv_amt_META,
			setoff_not_proc_bal_META,
			setoff_dt_META,
			setoff_bcst_cd_META,
			setoff_trd_rmrks_META,
			setoff_sub_char1_META,
			setoff_sub_char2_META,
			setoff_sub_char3_META,
			setoff_sttl_cd1_META,
			setoff_sttl_typ1_META,
			setoff_sttl_cd2_META,
			setoff_sttl_typ2_META,
			setoff_sttl_cd3_META,
			setoff_sttl_typ3_META,
			setoff_sls_purc_typ_META,
			setoff_purc_flg_META,
			setoff_sls_flg_META,
			setoff_tax_cd1_META,
			setoff_tax_rate1_META,
			setoff_tax_typ1_META,
			setoff_tax_cd2_META,
			setoff_tax_rate2_META,
			setoff_tax_typ2_META,
			setoff_tax_cd3_META,
			setoff_tax_rate3_META,
			setoff_tax_typ3_META,
			setoff_debt_cred_id_typ_META,
			setoff_debt_cred_id_cd_META,
			setoff_debt_cred_nm_META,
			setoff_bd_dpt_cd_META
		},
		new String[][]{
			{
			},
			{
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
				{$rcv_dt, "bfToday"},	// rcv_dt
				{$setoff_dt, "bfToday"}	// setoff_dt
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$rcv_dt, "draw_dt:AF"},	// rcv_dt
				{$draw_dt, "draw_dt:BF,due_dt:BF"},	// draw_dt
				{$due_dt, "due_dt:AF"}	// due_dt
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$ar_sttl_cd1, "MS.MSUAL0080.SttlRcv"},	// ar_sttl_cd1
				{$ar_sttl_cd2, "MA.MAUAL0010.ArSttlSetoffDrWtax"},	// ar_sttl_cd2
				{$trd_cur_cd, "MA.MAUAL0010.Cur"},	// trd_cur_cd
				{$bank_ac_cd, "MA.MAUAL0010.IntBankAc"},	// bank_ac_cd
				{$rcst_cd, "MA.MAUAL0010.Bp"},	// rcst_cd
				{$bcst_cd, "MA.MAUAL0010.Bp"},	// bcst_cd
				{$bill_dpt_cd, "MA.MAUAL0010.Dpt"},	// bill_dpt_cd
				{$bd_dpt_cd, "MA.MAUAL0010.Dpt"},	// bd_dpt_cd
				{$draw_bank_cd, "MA.MAUAL0010.Bank"},	// draw_bank_cd
				{$draw_branch_cd, "MA.MAUAL0010.BankBranch"},	// draw_branch_cd
				{$note_rsn_cd, "MA.MAUAL0010.NoteRsn"},	// note_rsn_cd
				{$setoff_trd_cur_cd, "MA.MAUAL0010.Cur"},	// setoff_trd_cur_cd
				{$setoff_bcst_cd, "MA.MAUAL0010.Bp"},	// setoff_bcst_cd
				{$setoff_sttl_cd1, "MA.MAUAL0010.ArSttlSetoffDrWtax"},	// setoff_sttl_cd1
				{$setoff_bd_dpt_cd, "MA.MAUAL0010.Dpt"}	// setoff_bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$ar_sttl_cd1, "ar_sttl_typ1"},	// ar_sttl_cd1
				{$ar_sttl_cd2, "sls_purc_typ2;ar_sttl_typ2"},	// ar_sttl_cd2
				{$setoff_sttl_cd1, "setoff_sls_purc_typ;setoff_sttl_typ1"}	// setoff_sttl_cd1
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$ar_sttl_cd1, "ar_sttl_typ"},	// ar_sttl_cd1
				{$ar_sttl_cd2, "sls_purc_typ;ar_sttl_typ"},	// ar_sttl_cd2
				{$setoff_sttl_cd1, "sls_purc_typ;ar_sttl_typ"}	// setoff_sttl_cd1
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$rcst_cd, "MAC_BP_IS_SRCH_TYP.RCST"},	// rcst_cd
				{$bcst_cd, "MAC_BP_IS_SRCH_TYP.BCST_BY_RCST;rcst_cd"},	// bcst_cd
				{$bill_dpt_cd, "bcst_cd;MAC_DPT_IS_SRCH_TYP.BCST"},	// bill_dpt_cd
				{$bd_dpt_cd, "MAC_DPT_IS_SRCH_TYP.ARAPBD"},	// bd_dpt_cd
				{$draw_branch_cd, "draw_bank_cd"},	// draw_branch_cd
				{$setoff_bcst_cd, "MAC_BP_IS_SRCH_TYP.BCST"},	// setoff_bcst_cd
				{$setoff_bd_dpt_cd, "MAC_DPT_IS_SRCH_TYP.ARAPBD"}	// setoff_bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$rcst_cd, "bp_is_srch_typ"},	// rcst_cd
				{$bcst_cd, "bp_is_srch_typ;in_rcst_cd"},	// bcst_cd
				{$bill_dpt_cd, "bcst_cd;dpt_is_srch_typ"},	// bill_dpt_cd
				{$bd_dpt_cd, "dpt_is_srch_typ"},	// bd_dpt_cd
				{$draw_branch_cd, "bank_cd"},	// draw_branch_cd
				{$setoff_bcst_cd, "bp_is_srch_typ"},	// setoff_bcst_cd
				{$setoff_bd_dpt_cd, "dpt_is_srch_typ"}	// setoff_bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$debt_cred_id_typ, "MAC_DEBT_CRED_ID_TYP"},	// debt_cred_id_typ
				{$setoff_debt_cred_id_typ, "MAC_DEBT_CRED_ID_TYP"}	// setoff_debt_cred_id_typ
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
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 2, $rcv_no);
	}

	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 2, $rcv_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 3, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 3, $slo_no, value);
	}


	/**
	 * AR settlement method cd. 1 債権決済方法ＣＤ１.<p>
	 *
	 */
	public String ar_sttl_cd1() {
		return getConstString(offset + 4, $ar_sttl_cd1);
	}

	/**
	 * AR settlement method cd. 1 債権決済方法ＣＤ１.<p>
	 *
	 */
	public void ar_sttl_cd1(String value) {
		setConstString(offset + 4, $ar_sttl_cd1, value);
	}


	/**
	 * AR settlement type 1 債権決済区分１.<p>
	 *
	 */
	public String ar_sttl_typ1() {
		return getConstString(offset + 5, $ar_sttl_typ1);
	}

	/**
	 * AR settlement type 1 債権決済区分１.<p>
	 *
	 */
	public void ar_sttl_typ1(String value) {
		setConstString(offset + 5, $ar_sttl_typ1, value);
	}


	/**
	 * AR settlement method cd. 2 債権決済方法ＣＤ２.<p>
	 *
	 */
	public String ar_sttl_cd2() {
		return getConstString(offset + 6, $ar_sttl_cd2);
	}

	/**
	 * AR settlement method cd. 2 債権決済方法ＣＤ２.<p>
	 *
	 */
	public void ar_sttl_cd2(String value) {
		setConstString(offset + 6, $ar_sttl_cd2, value);
	}


	/**
	 * AR settlement type 2 債権決済区分２.<p>
	 *
	 */
	public String ar_sttl_typ2() {
		return getConstString(offset + 7, $ar_sttl_typ2);
	}

	/**
	 * AR settlement type 2 債権決済区分２.<p>
	 *
	 */
	public void ar_sttl_typ2(String value) {
		setConstString(offset + 7, $ar_sttl_typ2, value);
	}


	/**
	 * AR settlement method cd. 3 債権決済方法ＣＤ３.<p>
	 *
	 */
	public String ar_sttl_cd3() {
		return getConstString(offset + 8, $ar_sttl_cd3);
	}

	/**
	 * AR settlement method cd. 3 債権決済方法ＣＤ３.<p>
	 *
	 */
	public void ar_sttl_cd3(String value) {
		setConstString(offset + 8, $ar_sttl_cd3, value);
	}


	/**
	 * AR settlement type 3 債権決済区分３.<p>
	 *
	 */
	public String ar_sttl_typ3() {
		return getConstString(offset + 9, $ar_sttl_typ3);
	}

	/**
	 * AR settlement type 3 債権決済区分３.<p>
	 *
	 */
	public void ar_sttl_typ3(String value) {
		setConstString(offset + 9, $ar_sttl_typ3, value);
	}


	/**
	 * Sales purchase tax type 売上仕入税区分.<p>
	 *
	 */
	public String sls_purc_typ2() {
		return getConstString(offset + 10, $sls_purc_typ2);
	}

	/**
	 * Sales purchase tax type 売上仕入税区分.<p>
	 *
	 */
	public void sls_purc_typ2(String value) {
		setConstString(offset + 10, $sls_purc_typ2, value);
	}


	/**
	 * Sales flg. 売上ＦＬＧ.<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 11, $purc_flg);
	}

	/**
	 * Sales flg. 売上ＦＬＧ.<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 11, $purc_flg, value);
	}


	/**
	 * Purchase flg. 仕入ＦＬＧ.<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 12, $sls_flg);
	}

	/**
	 * Purchase flg. 仕入ＦＬＧ.<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 12, $sls_flg, value);
	}


	/**
	 * Tax cd. 1 税ＣＤ１.<p>
	 *
	 */
	public String tax_cd1() {
		return getConstString(offset + 13, $tax_cd1);
	}

	/**
	 * Tax cd. 1 税ＣＤ１.<p>
	 *
	 */
	public void tax_cd1(String value) {
		setConstString(offset + 13, $tax_cd1, value);
	}


	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public MCNumber tax_rate1() {
		return getConstNumber(offset + 14, $tax_rate1);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(MCNumber value) {
		setConstNumber(offset + 14, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(int value) {
		setConstNumber(offset + 14, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(long value) {
		setConstNumber(offset + 14, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(float value) {
		setConstNumber(offset + 14, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(double value) {
		setConstNumber(offset + 14, $tax_rate1, value);
	}


	/**
	 * Tax type 1 税区分１.<p>
	 *
	 */
	public String tax_typ1() {
		return getConstString(offset + 15, $tax_typ1);
	}

	/**
	 * Tax type 1 税区分１.<p>
	 *
	 */
	public void tax_typ1(String value) {
		setConstString(offset + 15, $tax_typ1, value);
	}


	/**
	 * Tax cd. 2 税ＣＤ２.<p>
	 *
	 */
	public String tax_cd2() {
		return getConstString(offset + 16, $tax_cd2);
	}

	/**
	 * Tax cd. 2 税ＣＤ２.<p>
	 *
	 */
	public void tax_cd2(String value) {
		setConstString(offset + 16, $tax_cd2, value);
	}


	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public MCNumber tax_rate2() {
		return getConstNumber(offset + 17, $tax_rate2);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(MCNumber value) {
		setConstNumber(offset + 17, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(int value) {
		setConstNumber(offset + 17, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(long value) {
		setConstNumber(offset + 17, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(float value) {
		setConstNumber(offset + 17, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(double value) {
		setConstNumber(offset + 17, $tax_rate2, value);
	}


	/**
	 * Tax type 2 税区分２.<p>
	 *
	 */
	public String tax_typ2() {
		return getConstString(offset + 18, $tax_typ2);
	}

	/**
	 * Tax type 2 税区分２.<p>
	 *
	 */
	public void tax_typ2(String value) {
		setConstString(offset + 18, $tax_typ2, value);
	}


	/**
	 * Tax cd. 3 税ＣＤ３.<p>
	 *
	 */
	public String tax_cd3() {
		return getConstString(offset + 19, $tax_cd3);
	}

	/**
	 * Tax cd. 3 税ＣＤ３.<p>
	 *
	 */
	public void tax_cd3(String value) {
		setConstString(offset + 19, $tax_cd3, value);
	}


	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public MCNumber tax_rate3() {
		return getConstNumber(offset + 20, $tax_rate3);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(MCNumber value) {
		setConstNumber(offset + 20, $tax_rate3, value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(int value) {
		setConstNumber(offset + 20, $tax_rate3, value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(long value) {
		setConstNumber(offset + 20, $tax_rate3, value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(float value) {
		setConstNumber(offset + 20, $tax_rate3, value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(double value) {
		setConstNumber(offset + 20, $tax_rate3, value);
	}


	/**
	 * Tax type 3 税区分３.<p>
	 *
	 */
	public String tax_typ3() {
		return getConstString(offset + 21, $tax_typ3);
	}

	/**
	 * Tax type 3 税区分３.<p>
	 *
	 */
	public void tax_typ3(String value) {
		setConstString(offset + 21, $tax_typ3, value);
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
	 * Payment received amount 入金額.<p>
	 *
	 */
	public MCNumber rcv_amt() {
		return getConstNumber(offset + 23, $rcv_amt);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(MCNumber value) {
		setConstNumber(offset + 23, $rcv_amt, value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(int value) {
		setConstNumber(offset + 23, $rcv_amt, value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(long value) {
		setConstNumber(offset + 23, $rcv_amt, value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(float value) {
		setConstNumber(offset + 23, $rcv_amt, value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(double value) {
		setConstNumber(offset + 23, $rcv_amt, value);
	}


	/**
	 * Unreconciled amount 未処理額.<p>
	 *
	 */
	public MCNumber not_proc_bal() {
		return getConstNumber(offset + 24, $not_proc_bal);
	}

	/**
	 * Unreconciled amount 未処理額.<p>
	 *
	 */
	public void not_proc_bal(MCNumber value) {
		setConstNumber(offset + 24, $not_proc_bal, value);
	}

	/**
	 * Unreconciled amount 未処理額.<p>
	 *
	 */
	public void not_proc_bal(int value) {
		setConstNumber(offset + 24, $not_proc_bal, value);
	}

	/**
	 * Unreconciled amount 未処理額.<p>
	 *
	 */
	public void not_proc_bal(long value) {
		setConstNumber(offset + 24, $not_proc_bal, value);
	}

	/**
	 * Unreconciled amount 未処理額.<p>
	 *
	 */
	public void not_proc_bal(float value) {
		setConstNumber(offset + 24, $not_proc_bal, value);
	}

	/**
	 * Unreconciled amount 未処理額.<p>
	 *
	 */
	public void not_proc_bal(double value) {
		setConstNumber(offset + 24, $not_proc_bal, value);
	}


	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCDate rcv_dt() {
		return getConstDate(offset + 25, $rcv_dt);
	}

	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public void rcv_dt(MCDate value) {
		setConstDate(offset + 25, $rcv_dt, value);
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
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 27, $rcst_cd);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 27, $rcst_cd, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 28, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 28, $bcst_cd, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 29, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 29, $bill_dpt_cd, value);
	}


	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public String xfr_psn() {
		return getConstString(offset + 30, $xfr_psn);
	}

	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public void xfr_psn(String value) {
		setConstString(offset + 30, $xfr_psn, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 31, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 31, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 31, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 31, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 31, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 31, $xrate, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 32, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 32, $xrate_cd, value);
	}


	/**
	 * Debtor identification type 借方先識別区分.<p>
	 *
	 */
	public String debt_cred_id_typ() {
		return getConstString(offset + 33, $debt_cred_id_typ);
	}

	/**
	 * Debtor identification type 借方先識別区分.<p>
	 *
	 */
	public void debt_cred_id_typ(String value) {
		setConstString(offset + 33, $debt_cred_id_typ, value);
	}


	/**
	 * Debtor identification cd. 借方先識別ＣＤ.<p>
	 *
	 */
	public String debt_cred_id_cd() {
		return getConstString(offset + 34, $debt_cred_id_cd);
	}

	/**
	 * Debtor identification cd. 借方先識別ＣＤ.<p>
	 *
	 */
	public void debt_cred_id_cd(String value) {
		setConstString(offset + 34, $debt_cred_id_cd, value);
	}


	/**
	 * Debtor name 借方先名.<p>
	 *
	 */
	public String debt_cred_nm() {
		return getConstString(offset + 35, $debt_cred_nm);
	}

	/**
	 * Debtor name 借方先名.<p>
	 *
	 */
	public void debt_cred_nm(String value) {
		setConstString(offset + 35, $debt_cred_nm, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 36, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 36, $bd_dpt_cd, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 37, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 37, $trd_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 38, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 38, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 39, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 39, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 40, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 40, $sub_char3, value);
	}


	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public MCNumber rcv_upd_cntr() {
		return getConstNumber(offset + 41, $rcv_upd_cntr);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void rcv_upd_cntr(MCNumber value) {
		setConstNumber(offset + 41, $rcv_upd_cntr, value);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void rcv_upd_cntr(int value) {
		setConstNumber(offset + 41, $rcv_upd_cntr, value);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void rcv_upd_cntr(long value) {
		setConstNumber(offset + 41, $rcv_upd_cntr, value);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void rcv_upd_cntr(float value) {
		setConstNumber(offset + 41, $rcv_upd_cntr, value);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void rcv_upd_cntr(double value) {
		setConstNumber(offset + 41, $rcv_upd_cntr, value);
	}


	/**
	 * Note management No. 手形管理ＮＯ.<p>
	 *
	 */
	public String note_mng_no() {
		return getConstString(offset + 42, $note_mng_no);
	}

	/**
	 * Note management No. 手形管理ＮＯ.<p>
	 *
	 */
	public void note_mng_no(String value) {
		setConstString(offset + 42, $note_mng_no, value);
	}


	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 43, $note_no);
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 43, $note_no, value);
	}


	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public String note_typ() {
		return getConstString(offset + 44, $note_typ);
	}

	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public void note_typ(String value) {
		setConstString(offset + 44, $note_typ, value);
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
	 * Payment due date 支払期日.<p>
	 *
	 */
	public MCDate due_dt() {
		return getConstDate(offset + 46, $due_dt);
	}

	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public void due_dt(MCDate value) {
		setConstDate(offset + 46, $due_dt, value);
	}


	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public String drawer_nm() {
		return getConstString(offset + 47, $drawer_nm);
	}

	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public void drawer_nm(String value) {
		setConstString(offset + 47, $drawer_nm, value);
	}


	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public String endrsr() {
		return getConstString(offset + 48, $endrsr);
	}

	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public void endrsr(String value) {
		setConstString(offset + 48, $endrsr, value);
	}


	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public String accptr() {
		return getConstString(offset + 49, $accptr);
	}

	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public void accptr(String value) {
		setConstString(offset + 49, $accptr, value);
	}


	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public String draw_bank_cd() {
		return getConstString(offset + 50, $draw_bank_cd);
	}

	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public void draw_bank_cd(String value) {
		setConstString(offset + 50, $draw_bank_cd, value);
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
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public String note_rsn_cd() {
		return getConstString(offset + 52, $note_rsn_cd);
	}

	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public void note_rsn_cd(String value) {
		setConstString(offset + 52, $note_rsn_cd, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String note_sub_char1() {
		return getConstString(offset + 53, $note_sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void note_sub_char1(String value) {
		setConstString(offset + 53, $note_sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String note_sub_char2() {
		return getConstString(offset + 54, $note_sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void note_sub_char2(String value) {
		setConstString(offset + 54, $note_sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String note_sub_char3() {
		return getConstString(offset + 55, $note_sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void note_sub_char3(String value) {
		setConstString(offset + 55, $note_sub_char3, value);
	}


	/**
	 * Offset payment received No. 相殺入金ＮＯ.<p>
	 *
	 */
	public String setoff_rcv_no() {
		return getConstString(offset + 56, $setoff_rcv_no);
	}

	/**
	 * Offset payment received No. 相殺入金ＮＯ.<p>
	 *
	 */
	public void setoff_rcv_no(String value) {
		setConstString(offset + 56, $setoff_rcv_no, value);
	}


	/**
	 * Offset settlement method cd. 3 相殺取引通貨ＣＤ.<p>
	 *
	 */
	public String setoff_trd_cur_cd() {
		return getConstString(offset + 57, $setoff_trd_cur_cd);
	}

	/**
	 * Offset settlement method cd. 3 相殺取引通貨ＣＤ.<p>
	 *
	 */
	public void setoff_trd_cur_cd(String value) {
		setConstString(offset + 57, $setoff_trd_cur_cd, value);
	}


	/**
	 * Offset exchange rate 相殺為替レート.<p>
	 *
	 */
	public MCNumber setoff_xrate() {
		return getConstNumber(offset + 58, $setoff_xrate);
	}

	/**
	 * Offset exchange rate 相殺為替レート.<p>
	 *
	 */
	public void setoff_xrate(MCNumber value) {
		setConstNumber(offset + 58, $setoff_xrate, value);
	}

	/**
	 * Offset exchange rate 相殺為替レート.<p>
	 *
	 */
	public void setoff_xrate(int value) {
		setConstNumber(offset + 58, $setoff_xrate, value);
	}

	/**
	 * Offset exchange rate 相殺為替レート.<p>
	 *
	 */
	public void setoff_xrate(long value) {
		setConstNumber(offset + 58, $setoff_xrate, value);
	}

	/**
	 * Offset exchange rate 相殺為替レート.<p>
	 *
	 */
	public void setoff_xrate(float value) {
		setConstNumber(offset + 58, $setoff_xrate, value);
	}

	/**
	 * Offset exchange rate 相殺為替レート.<p>
	 *
	 */
	public void setoff_xrate(double value) {
		setConstNumber(offset + 58, $setoff_xrate, value);
	}


	/**
	 * Offset exchange rate cd. 相殺為替レートＣＤ.<p>
	 *
	 */
	public String setoff_xrate_cd() {
		return getConstString(offset + 59, $setoff_xrate_cd);
	}

	/**
	 * Offset exchange rate cd. 相殺為替レートＣＤ.<p>
	 *
	 */
	public void setoff_xrate_cd(String value) {
		setConstString(offset + 59, $setoff_xrate_cd, value);
	}


	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public MCNumber setoff_rcv_amt() {
		return getConstNumber(offset + 60, $setoff_rcv_amt);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_rcv_amt(MCNumber value) {
		setConstNumber(offset + 60, $setoff_rcv_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_rcv_amt(int value) {
		setConstNumber(offset + 60, $setoff_rcv_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_rcv_amt(long value) {
		setConstNumber(offset + 60, $setoff_rcv_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_rcv_amt(float value) {
		setConstNumber(offset + 60, $setoff_rcv_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_rcv_amt(double value) {
		setConstNumber(offset + 60, $setoff_rcv_amt, value);
	}


	/**
	 * Offset outstanding amount 相殺未処理額.<p>
	 *
	 */
	public MCNumber setoff_not_proc_bal() {
		return getConstNumber(offset + 61, $setoff_not_proc_bal);
	}

	/**
	 * Offset outstanding amount 相殺未処理額.<p>
	 *
	 */
	public void setoff_not_proc_bal(MCNumber value) {
		setConstNumber(offset + 61, $setoff_not_proc_bal, value);
	}

	/**
	 * Offset outstanding amount 相殺未処理額.<p>
	 *
	 */
	public void setoff_not_proc_bal(int value) {
		setConstNumber(offset + 61, $setoff_not_proc_bal, value);
	}

	/**
	 * Offset outstanding amount 相殺未処理額.<p>
	 *
	 */
	public void setoff_not_proc_bal(long value) {
		setConstNumber(offset + 61, $setoff_not_proc_bal, value);
	}

	/**
	 * Offset outstanding amount 相殺未処理額.<p>
	 *
	 */
	public void setoff_not_proc_bal(float value) {
		setConstNumber(offset + 61, $setoff_not_proc_bal, value);
	}

	/**
	 * Offset outstanding amount 相殺未処理額.<p>
	 *
	 */
	public void setoff_not_proc_bal(double value) {
		setConstNumber(offset + 61, $setoff_not_proc_bal, value);
	}


	/**
	 * Offset date 相殺日.<p>
	 *
	 */
	public MCDate setoff_dt() {
		return getConstDate(offset + 62, $setoff_dt);
	}

	/**
	 * Offset date 相殺日.<p>
	 *
	 */
	public void setoff_dt(MCDate value) {
		setConstDate(offset + 62, $setoff_dt, value);
	}


	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public String setoff_bcst_cd() {
		return getConstString(offset + 63, $setoff_bcst_cd);
	}

	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public void setoff_bcst_cd(String value) {
		setConstString(offset + 63, $setoff_bcst_cd, value);
	}


	/**
	 * Offsetting transaction remarks 相殺取引備考.<p>
	 *
	 */
	public String setoff_trd_rmrks() {
		return getConstString(offset + 64, $setoff_trd_rmrks);
	}

	/**
	 * Offsetting transaction remarks 相殺取引備考.<p>
	 *
	 */
	public void setoff_trd_rmrks(String value) {
		setConstString(offset + 64, $setoff_trd_rmrks, value);
	}


	/**
	 * Offset spare 1 相殺予備１.<p>
	 *
	 */
	public String setoff_sub_char1() {
		return getConstString(offset + 65, $setoff_sub_char1);
	}

	/**
	 * Offset spare 1 相殺予備１.<p>
	 *
	 */
	public void setoff_sub_char1(String value) {
		setConstString(offset + 65, $setoff_sub_char1, value);
	}


	/**
	 * Offset spare 2 相殺予備２.<p>
	 *
	 */
	public String setoff_sub_char2() {
		return getConstString(offset + 66, $setoff_sub_char2);
	}

	/**
	 * Offset spare 2 相殺予備２.<p>
	 *
	 */
	public void setoff_sub_char2(String value) {
		setConstString(offset + 66, $setoff_sub_char2, value);
	}


	/**
	 * Offset spare 3 相殺予備３.<p>
	 *
	 */
	public String setoff_sub_char3() {
		return getConstString(offset + 67, $setoff_sub_char3);
	}

	/**
	 * Offset spare 3 相殺予備３.<p>
	 *
	 */
	public void setoff_sub_char3(String value) {
		setConstString(offset + 67, $setoff_sub_char3, value);
	}


	/**
	 * Offset settlement method cd. 1 相殺決済方法ＣＤ１.<p>
	 *
	 */
	public String setoff_sttl_cd1() {
		return getConstString(offset + 68, $setoff_sttl_cd1);
	}

	/**
	 * Offset settlement method cd. 1 相殺決済方法ＣＤ１.<p>
	 *
	 */
	public void setoff_sttl_cd1(String value) {
		setConstString(offset + 68, $setoff_sttl_cd1, value);
	}


	/**
	 * Offset settlement type 1 相殺決済区分１.<p>
	 *
	 */
	public String setoff_sttl_typ1() {
		return getConstString(offset + 69, $setoff_sttl_typ1);
	}

	/**
	 * Offset settlement type 1 相殺決済区分１.<p>
	 *
	 */
	public void setoff_sttl_typ1(String value) {
		setConstString(offset + 69, $setoff_sttl_typ1, value);
	}


	/**
	 * Offset settlement method cd. 2 相殺決済方法ＣＤ２.<p>
	 *
	 */
	public String setoff_sttl_cd2() {
		return getConstString(offset + 70, $setoff_sttl_cd2);
	}

	/**
	 * Offset settlement method cd. 2 相殺決済方法ＣＤ２.<p>
	 *
	 */
	public void setoff_sttl_cd2(String value) {
		setConstString(offset + 70, $setoff_sttl_cd2, value);
	}


	/**
	 * Offset settlement type 2 相殺決済区分２.<p>
	 *
	 */
	public String setoff_sttl_typ2() {
		return getConstString(offset + 71, $setoff_sttl_typ2);
	}

	/**
	 * Offset settlement type 2 相殺決済区分２.<p>
	 *
	 */
	public void setoff_sttl_typ2(String value) {
		setConstString(offset + 71, $setoff_sttl_typ2, value);
	}


	/**
	 * Offset settlement method cd. 3 相殺決済方法ＣＤ３.<p>
	 *
	 */
	public String setoff_sttl_cd3() {
		return getConstString(offset + 72, $setoff_sttl_cd3);
	}

	/**
	 * Offset settlement method cd. 3 相殺決済方法ＣＤ３.<p>
	 *
	 */
	public void setoff_sttl_cd3(String value) {
		setConstString(offset + 72, $setoff_sttl_cd3, value);
	}


	/**
	 * Offset settlement type 3 相殺決済区分３.<p>
	 *
	 */
	public String setoff_sttl_typ3() {
		return getConstString(offset + 73, $setoff_sttl_typ3);
	}

	/**
	 * Offset settlement type 3 相殺決済区分３.<p>
	 *
	 */
	public void setoff_sttl_typ3(String value) {
		setConstString(offset + 73, $setoff_sttl_typ3, value);
	}


	/**
	 * Offset sales purchase tax type 相殺売上仕入税区分.<p>
	 *
	 */
	public String setoff_sls_purc_typ() {
		return getConstString(offset + 74, $setoff_sls_purc_typ);
	}

	/**
	 * Offset sales purchase tax type 相殺売上仕入税区分.<p>
	 *
	 */
	public void setoff_sls_purc_typ(String value) {
		setConstString(offset + 74, $setoff_sls_purc_typ, value);
	}


	/**
	 * Offset sales flg. 相殺売上ＦＬＧ.<p>
	 *
	 */
	public boolean setoff_purc_flg() {
		return getConstBoolean(offset + 75, $setoff_purc_flg);
	}

	/**
	 * Offset sales flg. 相殺売上ＦＬＧ.<p>
	 *
	 */
	public void setoff_purc_flg(boolean value) {
		setConstBoolean(offset + 75, $setoff_purc_flg, value);
	}


	/**
	 * Offset purchase flg. 相殺仕入ＦＬＧ.<p>
	 *
	 */
	public boolean setoff_sls_flg() {
		return getConstBoolean(offset + 76, $setoff_sls_flg);
	}

	/**
	 * Offset purchase flg. 相殺仕入ＦＬＧ.<p>
	 *
	 */
	public void setoff_sls_flg(boolean value) {
		setConstBoolean(offset + 76, $setoff_sls_flg, value);
	}


	/**
	 * Offset tax cd. 1 相殺税ＣＤ１.<p>
	 *
	 */
	public String setoff_tax_cd1() {
		return getConstString(offset + 77, $setoff_tax_cd1);
	}

	/**
	 * Offset tax cd. 1 相殺税ＣＤ１.<p>
	 *
	 */
	public void setoff_tax_cd1(String value) {
		setConstString(offset + 77, $setoff_tax_cd1, value);
	}


	/**
	 * Offset tax rate 1 相殺税率１.<p>
	 *
	 */
	public MCNumber setoff_tax_rate1() {
		return getConstNumber(offset + 78, $setoff_tax_rate1);
	}

	/**
	 * Offset tax rate 1 相殺税率１.<p>
	 *
	 */
	public void setoff_tax_rate1(MCNumber value) {
		setConstNumber(offset + 78, $setoff_tax_rate1, value);
	}

	/**
	 * Offset tax rate 1 相殺税率１.<p>
	 *
	 */
	public void setoff_tax_rate1(int value) {
		setConstNumber(offset + 78, $setoff_tax_rate1, value);
	}

	/**
	 * Offset tax rate 1 相殺税率１.<p>
	 *
	 */
	public void setoff_tax_rate1(long value) {
		setConstNumber(offset + 78, $setoff_tax_rate1, value);
	}

	/**
	 * Offset tax rate 1 相殺税率１.<p>
	 *
	 */
	public void setoff_tax_rate1(float value) {
		setConstNumber(offset + 78, $setoff_tax_rate1, value);
	}

	/**
	 * Offset tax rate 1 相殺税率１.<p>
	 *
	 */
	public void setoff_tax_rate1(double value) {
		setConstNumber(offset + 78, $setoff_tax_rate1, value);
	}


	/**
	 * Offset tax type 1 相殺税区分１.<p>
	 *
	 */
	public String setoff_tax_typ1() {
		return getConstString(offset + 79, $setoff_tax_typ1);
	}

	/**
	 * Offset tax type 1 相殺税区分１.<p>
	 *
	 */
	public void setoff_tax_typ1(String value) {
		setConstString(offset + 79, $setoff_tax_typ1, value);
	}


	/**
	 * Offset tax cd. 2 相殺税ＣＤ２.<p>
	 *
	 */
	public String setoff_tax_cd2() {
		return getConstString(offset + 80, $setoff_tax_cd2);
	}

	/**
	 * Offset tax cd. 2 相殺税ＣＤ２.<p>
	 *
	 */
	public void setoff_tax_cd2(String value) {
		setConstString(offset + 80, $setoff_tax_cd2, value);
	}


	/**
	 * Offset tax rate 2 相殺税率２.<p>
	 *
	 */
	public MCNumber setoff_tax_rate2() {
		return getConstNumber(offset + 81, $setoff_tax_rate2);
	}

	/**
	 * Offset tax rate 2 相殺税率２.<p>
	 *
	 */
	public void setoff_tax_rate2(MCNumber value) {
		setConstNumber(offset + 81, $setoff_tax_rate2, value);
	}

	/**
	 * Offset tax rate 2 相殺税率２.<p>
	 *
	 */
	public void setoff_tax_rate2(int value) {
		setConstNumber(offset + 81, $setoff_tax_rate2, value);
	}

	/**
	 * Offset tax rate 2 相殺税率２.<p>
	 *
	 */
	public void setoff_tax_rate2(long value) {
		setConstNumber(offset + 81, $setoff_tax_rate2, value);
	}

	/**
	 * Offset tax rate 2 相殺税率２.<p>
	 *
	 */
	public void setoff_tax_rate2(float value) {
		setConstNumber(offset + 81, $setoff_tax_rate2, value);
	}

	/**
	 * Offset tax rate 2 相殺税率２.<p>
	 *
	 */
	public void setoff_tax_rate2(double value) {
		setConstNumber(offset + 81, $setoff_tax_rate2, value);
	}


	/**
	 * Offset tax type 2 相殺税区分２.<p>
	 *
	 */
	public String setoff_tax_typ2() {
		return getConstString(offset + 82, $setoff_tax_typ2);
	}

	/**
	 * Offset tax type 2 相殺税区分２.<p>
	 *
	 */
	public void setoff_tax_typ2(String value) {
		setConstString(offset + 82, $setoff_tax_typ2, value);
	}


	/**
	 * Offset tax cd. 3 相殺税ＣＤ３.<p>
	 *
	 */
	public String setoff_tax_cd3() {
		return getConstString(offset + 83, $setoff_tax_cd3);
	}

	/**
	 * Offset tax cd. 3 相殺税ＣＤ３.<p>
	 *
	 */
	public void setoff_tax_cd3(String value) {
		setConstString(offset + 83, $setoff_tax_cd3, value);
	}


	/**
	 * Offset tax rate 3 相殺税率３.<p>
	 *
	 */
	public MCNumber setoff_tax_rate3() {
		return getConstNumber(offset + 84, $setoff_tax_rate3);
	}

	/**
	 * Offset tax rate 3 相殺税率３.<p>
	 *
	 */
	public void setoff_tax_rate3(MCNumber value) {
		setConstNumber(offset + 84, $setoff_tax_rate3, value);
	}

	/**
	 * Offset tax rate 3 相殺税率３.<p>
	 *
	 */
	public void setoff_tax_rate3(int value) {
		setConstNumber(offset + 84, $setoff_tax_rate3, value);
	}

	/**
	 * Offset tax rate 3 相殺税率３.<p>
	 *
	 */
	public void setoff_tax_rate3(long value) {
		setConstNumber(offset + 84, $setoff_tax_rate3, value);
	}

	/**
	 * Offset tax rate 3 相殺税率３.<p>
	 *
	 */
	public void setoff_tax_rate3(float value) {
		setConstNumber(offset + 84, $setoff_tax_rate3, value);
	}

	/**
	 * Offset tax rate 3 相殺税率３.<p>
	 *
	 */
	public void setoff_tax_rate3(double value) {
		setConstNumber(offset + 84, $setoff_tax_rate3, value);
	}


	/**
	 * Offset tax type 3 相殺税区分３.<p>
	 *
	 */
	public String setoff_tax_typ3() {
		return getConstString(offset + 85, $setoff_tax_typ3);
	}

	/**
	 * Offset tax type 3 相殺税区分３.<p>
	 *
	 */
	public void setoff_tax_typ3(String value) {
		setConstString(offset + 85, $setoff_tax_typ3, value);
	}


	/**
	 * Debtor identification type 借方先識別区分.<p>
	 *
	 */
	public String setoff_debt_cred_id_typ() {
		return getConstString(offset + 86, $setoff_debt_cred_id_typ);
	}

	/**
	 * Debtor identification type 借方先識別区分.<p>
	 *
	 */
	public void setoff_debt_cred_id_typ(String value) {
		setConstString(offset + 86, $setoff_debt_cred_id_typ, value);
	}


	/**
	 * Debtor identification cd. 借方先識別ＣＤ.<p>
	 *
	 */
	public String setoff_debt_cred_id_cd() {
		return getConstString(offset + 87, $setoff_debt_cred_id_cd);
	}

	/**
	 * Debtor identification cd. 借方先識別ＣＤ.<p>
	 *
	 */
	public void setoff_debt_cred_id_cd(String value) {
		setConstString(offset + 87, $setoff_debt_cred_id_cd, value);
	}


	/**
	 * Debtor remarks 借方先備考.<p>
	 *
	 */
	public String setoff_debt_cred_nm() {
		return getConstString(offset + 88, $setoff_debt_cred_nm);
	}

	/**
	 * Debtor remarks 借方先備考.<p>
	 *
	 */
	public void setoff_debt_cred_nm(String value) {
		setConstString(offset + 88, $setoff_debt_cred_nm, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String setoff_bd_dpt_cd() {
		return getConstString(offset + 89, $setoff_bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void setoff_bd_dpt_cd(String value) {
		setConstString(offset + 89, $setoff_bd_dpt_cd, value);
	}


	public String getString(String name) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			return ar_sttl_typ1();
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			return ar_sttl_cd2();
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			return ar_sttl_typ2();
		}
		if ($ar_sttl_cd3.equalsIgnoreCase(name)) {
			return ar_sttl_cd3();
		}
		if ($ar_sttl_typ3.equalsIgnoreCase(name)) {
			return ar_sttl_typ3();
		}
		if ($sls_purc_typ2.equalsIgnoreCase(name)) {
			return sls_purc_typ2();
		}
		if ($tax_cd1.equalsIgnoreCase(name)) {
			return tax_cd1();
		}
		if ($tax_typ1.equalsIgnoreCase(name)) {
			return tax_typ1();
		}
		if ($tax_cd2.equalsIgnoreCase(name)) {
			return tax_cd2();
		}
		if ($tax_typ2.equalsIgnoreCase(name)) {
			return tax_typ2();
		}
		if ($tax_cd3.equalsIgnoreCase(name)) {
			return tax_cd3();
		}
		if ($tax_typ3.equalsIgnoreCase(name)) {
			return tax_typ3();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			return debt_cred_id_typ();
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
		if ($note_mng_no.equalsIgnoreCase(name)) {
			return note_mng_no();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			return note_typ();
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
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			return draw_branch_cd();
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			return note_rsn_cd();
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
		if ($setoff_rcv_no.equalsIgnoreCase(name)) {
			return setoff_rcv_no();
		}
		if ($setoff_trd_cur_cd.equalsIgnoreCase(name)) {
			return setoff_trd_cur_cd();
		}
		if ($setoff_xrate_cd.equalsIgnoreCase(name)) {
			return setoff_xrate_cd();
		}
		if ($setoff_bcst_cd.equalsIgnoreCase(name)) {
			return setoff_bcst_cd();
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
		if ($setoff_sttl_cd1.equalsIgnoreCase(name)) {
			return setoff_sttl_cd1();
		}
		if ($setoff_sttl_typ1.equalsIgnoreCase(name)) {
			return setoff_sttl_typ1();
		}
		if ($setoff_sttl_cd2.equalsIgnoreCase(name)) {
			return setoff_sttl_cd2();
		}
		if ($setoff_sttl_typ2.equalsIgnoreCase(name)) {
			return setoff_sttl_typ2();
		}
		if ($setoff_sttl_cd3.equalsIgnoreCase(name)) {
			return setoff_sttl_cd3();
		}
		if ($setoff_sttl_typ3.equalsIgnoreCase(name)) {
			return setoff_sttl_typ3();
		}
		if ($setoff_sls_purc_typ.equalsIgnoreCase(name)) {
			return setoff_sls_purc_typ();
		}
		if ($setoff_tax_cd1.equalsIgnoreCase(name)) {
			return setoff_tax_cd1();
		}
		if ($setoff_tax_typ1.equalsIgnoreCase(name)) {
			return setoff_tax_typ1();
		}
		if ($setoff_tax_cd2.equalsIgnoreCase(name)) {
			return setoff_tax_cd2();
		}
		if ($setoff_tax_typ2.equalsIgnoreCase(name)) {
			return setoff_tax_typ2();
		}
		if ($setoff_tax_cd3.equalsIgnoreCase(name)) {
			return setoff_tax_cd3();
		}
		if ($setoff_tax_typ3.equalsIgnoreCase(name)) {
			return setoff_tax_typ3();
		}
		if ($setoff_debt_cred_id_typ.equalsIgnoreCase(name)) {
			return setoff_debt_cred_id_typ();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			return tax_rate1();
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			return tax_rate2();
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			return tax_rate3();
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			return rcv_amt();
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			return not_proc_bal();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			return rcv_upd_cntr();
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			return setoff_xrate();
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			return setoff_rcv_amt();
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			return setoff_not_proc_bal();
		}
		if ($setoff_tax_rate1.equalsIgnoreCase(name)) {
			return setoff_tax_rate1();
		}
		if ($setoff_tax_rate2.equalsIgnoreCase(name)) {
			return setoff_tax_rate2();
		}
		if ($setoff_tax_rate3.equalsIgnoreCase(name)) {
			return setoff_tax_rate3();
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
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
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
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			return ar_sttl_typ1();
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			return ar_sttl_cd2();
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			return ar_sttl_typ2();
		}
		if ($ar_sttl_cd3.equalsIgnoreCase(name)) {
			return ar_sttl_cd3();
		}
		if ($ar_sttl_typ3.equalsIgnoreCase(name)) {
			return ar_sttl_typ3();
		}
		if ($sls_purc_typ2.equalsIgnoreCase(name)) {
			return sls_purc_typ2();
		}
		if ($tax_cd1.equalsIgnoreCase(name)) {
			return tax_cd1();
		}
		if ($tax_typ1.equalsIgnoreCase(name)) {
			return tax_typ1();
		}
		if ($tax_cd2.equalsIgnoreCase(name)) {
			return tax_cd2();
		}
		if ($tax_typ2.equalsIgnoreCase(name)) {
			return tax_typ2();
		}
		if ($tax_cd3.equalsIgnoreCase(name)) {
			return tax_cd3();
		}
		if ($tax_typ3.equalsIgnoreCase(name)) {
			return tax_typ3();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			return debt_cred_id_typ();
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
		if ($note_mng_no.equalsIgnoreCase(name)) {
			return note_mng_no();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			return note_typ();
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
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			return draw_branch_cd();
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			return note_rsn_cd();
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
		if ($setoff_rcv_no.equalsIgnoreCase(name)) {
			return setoff_rcv_no();
		}
		if ($setoff_trd_cur_cd.equalsIgnoreCase(name)) {
			return setoff_trd_cur_cd();
		}
		if ($setoff_xrate_cd.equalsIgnoreCase(name)) {
			return setoff_xrate_cd();
		}
		if ($setoff_bcst_cd.equalsIgnoreCase(name)) {
			return setoff_bcst_cd();
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
		if ($setoff_sttl_cd1.equalsIgnoreCase(name)) {
			return setoff_sttl_cd1();
		}
		if ($setoff_sttl_typ1.equalsIgnoreCase(name)) {
			return setoff_sttl_typ1();
		}
		if ($setoff_sttl_cd2.equalsIgnoreCase(name)) {
			return setoff_sttl_cd2();
		}
		if ($setoff_sttl_typ2.equalsIgnoreCase(name)) {
			return setoff_sttl_typ2();
		}
		if ($setoff_sttl_cd3.equalsIgnoreCase(name)) {
			return setoff_sttl_cd3();
		}
		if ($setoff_sttl_typ3.equalsIgnoreCase(name)) {
			return setoff_sttl_typ3();
		}
		if ($setoff_sls_purc_typ.equalsIgnoreCase(name)) {
			return setoff_sls_purc_typ();
		}
		if ($setoff_tax_cd1.equalsIgnoreCase(name)) {
			return setoff_tax_cd1();
		}
		if ($setoff_tax_typ1.equalsIgnoreCase(name)) {
			return setoff_tax_typ1();
		}
		if ($setoff_tax_cd2.equalsIgnoreCase(name)) {
			return setoff_tax_cd2();
		}
		if ($setoff_tax_typ2.equalsIgnoreCase(name)) {
			return setoff_tax_typ2();
		}
		if ($setoff_tax_cd3.equalsIgnoreCase(name)) {
			return setoff_tax_cd3();
		}
		if ($setoff_tax_typ3.equalsIgnoreCase(name)) {
			return setoff_tax_typ3();
		}
		if ($setoff_debt_cred_id_typ.equalsIgnoreCase(name)) {
			return setoff_debt_cred_id_typ();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			return tax_rate1();
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			return tax_rate2();
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			return tax_rate3();
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			return rcv_amt();
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			return not_proc_bal();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			return rcv_upd_cntr();
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			return setoff_xrate();
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			return setoff_rcv_amt();
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			return setoff_not_proc_bal();
		}
		if ($setoff_tax_rate1.equalsIgnoreCase(name)) {
			return setoff_tax_rate1();
		}
		if ($setoff_tax_rate2.equalsIgnoreCase(name)) {
			return setoff_tax_rate2();
		}
		if ($setoff_tax_rate3.equalsIgnoreCase(name)) {
			return setoff_tax_rate3();
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
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
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
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			ar_sttl_typ1(value);
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
		if ($ar_sttl_cd3.equalsIgnoreCase(name)) {
			ar_sttl_cd3(value);
			return;
		}
		if ($ar_sttl_typ3.equalsIgnoreCase(name)) {
			ar_sttl_typ3(value);
			return;
		}
		if ($sls_purc_typ2.equalsIgnoreCase(name)) {
			sls_purc_typ2(value);
			return;
		}
		if ($tax_cd1.equalsIgnoreCase(name)) {
			tax_cd1(value);
			return;
		}
		if ($tax_typ1.equalsIgnoreCase(name)) {
			tax_typ1(value);
			return;
		}
		if ($tax_cd2.equalsIgnoreCase(name)) {
			tax_cd2(value);
			return;
		}
		if ($tax_typ2.equalsIgnoreCase(name)) {
			tax_typ2(value);
			return;
		}
		if ($tax_cd3.equalsIgnoreCase(name)) {
			tax_cd3(value);
			return;
		}
		if ($tax_typ3.equalsIgnoreCase(name)) {
			tax_typ3(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			debt_cred_id_typ(value);
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
		if ($note_mng_no.equalsIgnoreCase(name)) {
			note_mng_no(value);
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
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			draw_branch_cd(value);
			return;
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			note_rsn_cd(value);
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
		if ($setoff_rcv_no.equalsIgnoreCase(name)) {
			setoff_rcv_no(value);
			return;
		}
		if ($setoff_trd_cur_cd.equalsIgnoreCase(name)) {
			setoff_trd_cur_cd(value);
			return;
		}
		if ($setoff_xrate_cd.equalsIgnoreCase(name)) {
			setoff_xrate_cd(value);
			return;
		}
		if ($setoff_bcst_cd.equalsIgnoreCase(name)) {
			setoff_bcst_cd(value);
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
		if ($setoff_sttl_cd1.equalsIgnoreCase(name)) {
			setoff_sttl_cd1(value);
			return;
		}
		if ($setoff_sttl_typ1.equalsIgnoreCase(name)) {
			setoff_sttl_typ1(value);
			return;
		}
		if ($setoff_sttl_cd2.equalsIgnoreCase(name)) {
			setoff_sttl_cd2(value);
			return;
		}
		if ($setoff_sttl_typ2.equalsIgnoreCase(name)) {
			setoff_sttl_typ2(value);
			return;
		}
		if ($setoff_sttl_cd3.equalsIgnoreCase(name)) {
			setoff_sttl_cd3(value);
			return;
		}
		if ($setoff_sttl_typ3.equalsIgnoreCase(name)) {
			setoff_sttl_typ3(value);
			return;
		}
		if ($setoff_sls_purc_typ.equalsIgnoreCase(name)) {
			setoff_sls_purc_typ(value);
			return;
		}
		if ($setoff_tax_cd1.equalsIgnoreCase(name)) {
			setoff_tax_cd1(value);
			return;
		}
		if ($setoff_tax_typ1.equalsIgnoreCase(name)) {
			setoff_tax_typ1(value);
			return;
		}
		if ($setoff_tax_cd2.equalsIgnoreCase(name)) {
			setoff_tax_cd2(value);
			return;
		}
		if ($setoff_tax_typ2.equalsIgnoreCase(name)) {
			setoff_tax_typ2(value);
			return;
		}
		if ($setoff_tax_cd3.equalsIgnoreCase(name)) {
			setoff_tax_cd3(value);
			return;
		}
		if ($setoff_tax_typ3.equalsIgnoreCase(name)) {
			setoff_tax_typ3(value);
			return;
		}
		if ($setoff_debt_cred_id_typ.equalsIgnoreCase(name)) {
			setoff_debt_cred_id_typ(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			setoff_xrate(value);
			return;
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			setoff_rcv_amt(value);
			return;
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			setoff_not_proc_bal(value);
			return;
		}
		if ($setoff_tax_rate1.equalsIgnoreCase(name)) {
			setoff_tax_rate1(value);
			return;
		}
		if ($setoff_tax_rate2.equalsIgnoreCase(name)) {
			setoff_tax_rate2(value);
			return;
		}
		if ($setoff_tax_rate3.equalsIgnoreCase(name)) {
			setoff_tax_rate3(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			setoff_xrate(value);
			return;
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			setoff_rcv_amt(value);
			return;
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			setoff_not_proc_bal(value);
			return;
		}
		if ($setoff_tax_rate1.equalsIgnoreCase(name)) {
			setoff_tax_rate1(value);
			return;
		}
		if ($setoff_tax_rate2.equalsIgnoreCase(name)) {
			setoff_tax_rate2(value);
			return;
		}
		if ($setoff_tax_rate3.equalsIgnoreCase(name)) {
			setoff_tax_rate3(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			setoff_xrate(value);
			return;
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			setoff_rcv_amt(value);
			return;
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			setoff_not_proc_bal(value);
			return;
		}
		if ($setoff_tax_rate1.equalsIgnoreCase(name)) {
			setoff_tax_rate1(value);
			return;
		}
		if ($setoff_tax_rate2.equalsIgnoreCase(name)) {
			setoff_tax_rate2(value);
			return;
		}
		if ($setoff_tax_rate3.equalsIgnoreCase(name)) {
			setoff_tax_rate3(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			setoff_xrate(value);
			return;
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			setoff_rcv_amt(value);
			return;
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			setoff_not_proc_bal(value);
			return;
		}
		if ($setoff_tax_rate1.equalsIgnoreCase(name)) {
			setoff_tax_rate1(value);
			return;
		}
		if ($setoff_tax_rate2.equalsIgnoreCase(name)) {
			setoff_tax_rate2(value);
			return;
		}
		if ($setoff_tax_rate3.equalsIgnoreCase(name)) {
			setoff_tax_rate3(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			setoff_xrate(value);
			return;
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			setoff_rcv_amt(value);
			return;
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			setoff_not_proc_bal(value);
			return;
		}
		if ($setoff_tax_rate1.equalsIgnoreCase(name)) {
			setoff_tax_rate1(value);
			return;
		}
		if ($setoff_tax_rate2.equalsIgnoreCase(name)) {
			setoff_tax_rate2(value);
			return;
		}
		if ($setoff_tax_rate3.equalsIgnoreCase(name)) {
			setoff_tax_rate3(value);
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
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
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
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			ar_sttl_typ1(value);
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
		if ($ar_sttl_cd3.equalsIgnoreCase(name)) {
			ar_sttl_cd3(value);
			return;
		}
		if ($ar_sttl_typ3.equalsIgnoreCase(name)) {
			ar_sttl_typ3(value);
			return;
		}
		if ($sls_purc_typ2.equalsIgnoreCase(name)) {
			sls_purc_typ2(value);
			return;
		}
		if ($tax_cd1.equalsIgnoreCase(name)) {
			tax_cd1(value);
			return;
		}
		if ($tax_typ1.equalsIgnoreCase(name)) {
			tax_typ1(value);
			return;
		}
		if ($tax_cd2.equalsIgnoreCase(name)) {
			tax_cd2(value);
			return;
		}
		if ($tax_typ2.equalsIgnoreCase(name)) {
			tax_typ2(value);
			return;
		}
		if ($tax_cd3.equalsIgnoreCase(name)) {
			tax_cd3(value);
			return;
		}
		if ($tax_typ3.equalsIgnoreCase(name)) {
			tax_typ3(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			debt_cred_id_typ(value);
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
		if ($note_mng_no.equalsIgnoreCase(name)) {
			note_mng_no(value);
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
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			draw_branch_cd(value);
			return;
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			note_rsn_cd(value);
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
		if ($setoff_rcv_no.equalsIgnoreCase(name)) {
			setoff_rcv_no(value);
			return;
		}
		if ($setoff_trd_cur_cd.equalsIgnoreCase(name)) {
			setoff_trd_cur_cd(value);
			return;
		}
		if ($setoff_xrate_cd.equalsIgnoreCase(name)) {
			setoff_xrate_cd(value);
			return;
		}
		if ($setoff_bcst_cd.equalsIgnoreCase(name)) {
			setoff_bcst_cd(value);
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
		if ($setoff_sttl_cd1.equalsIgnoreCase(name)) {
			setoff_sttl_cd1(value);
			return;
		}
		if ($setoff_sttl_typ1.equalsIgnoreCase(name)) {
			setoff_sttl_typ1(value);
			return;
		}
		if ($setoff_sttl_cd2.equalsIgnoreCase(name)) {
			setoff_sttl_cd2(value);
			return;
		}
		if ($setoff_sttl_typ2.equalsIgnoreCase(name)) {
			setoff_sttl_typ2(value);
			return;
		}
		if ($setoff_sttl_cd3.equalsIgnoreCase(name)) {
			setoff_sttl_cd3(value);
			return;
		}
		if ($setoff_sttl_typ3.equalsIgnoreCase(name)) {
			setoff_sttl_typ3(value);
			return;
		}
		if ($setoff_sls_purc_typ.equalsIgnoreCase(name)) {
			setoff_sls_purc_typ(value);
			return;
		}
		if ($setoff_tax_cd1.equalsIgnoreCase(name)) {
			setoff_tax_cd1(value);
			return;
		}
		if ($setoff_tax_typ1.equalsIgnoreCase(name)) {
			setoff_tax_typ1(value);
			return;
		}
		if ($setoff_tax_cd2.equalsIgnoreCase(name)) {
			setoff_tax_cd2(value);
			return;
		}
		if ($setoff_tax_typ2.equalsIgnoreCase(name)) {
			setoff_tax_typ2(value);
			return;
		}
		if ($setoff_tax_cd3.equalsIgnoreCase(name)) {
			setoff_tax_cd3(value);
			return;
		}
		if ($setoff_tax_typ3.equalsIgnoreCase(name)) {
			setoff_tax_typ3(value);
			return;
		}
		if ($setoff_debt_cred_id_typ.equalsIgnoreCase(name)) {
			setoff_debt_cred_id_typ(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			setoff_xrate(value);
			return;
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			setoff_rcv_amt(value);
			return;
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			setoff_not_proc_bal(value);
			return;
		}
		if ($setoff_tax_rate1.equalsIgnoreCase(name)) {
			setoff_tax_rate1(value);
			return;
		}
		if ($setoff_tax_rate2.equalsIgnoreCase(name)) {
			setoff_tax_rate2(value);
			return;
		}
		if ($setoff_tax_rate3.equalsIgnoreCase(name)) {
			setoff_tax_rate3(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			setoff_xrate(value);
			return;
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			setoff_rcv_amt(value);
			return;
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			setoff_not_proc_bal(value);
			return;
		}
		if ($setoff_tax_rate1.equalsIgnoreCase(name)) {
			setoff_tax_rate1(value);
			return;
		}
		if ($setoff_tax_rate2.equalsIgnoreCase(name)) {
			setoff_tax_rate2(value);
			return;
		}
		if ($setoff_tax_rate3.equalsIgnoreCase(name)) {
			setoff_tax_rate3(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			setoff_xrate(value);
			return;
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			setoff_rcv_amt(value);
			return;
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			setoff_not_proc_bal(value);
			return;
		}
		if ($setoff_tax_rate1.equalsIgnoreCase(name)) {
			setoff_tax_rate1(value);
			return;
		}
		if ($setoff_tax_rate2.equalsIgnoreCase(name)) {
			setoff_tax_rate2(value);
			return;
		}
		if ($setoff_tax_rate3.equalsIgnoreCase(name)) {
			setoff_tax_rate3(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			setoff_xrate(value);
			return;
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			setoff_rcv_amt(value);
			return;
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			setoff_not_proc_bal(value);
			return;
		}
		if ($setoff_tax_rate1.equalsIgnoreCase(name)) {
			setoff_tax_rate1(value);
			return;
		}
		if ($setoff_tax_rate2.equalsIgnoreCase(name)) {
			setoff_tax_rate2(value);
			return;
		}
		if ($setoff_tax_rate3.equalsIgnoreCase(name)) {
			setoff_tax_rate3(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			setoff_xrate(value);
			return;
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			setoff_rcv_amt(value);
			return;
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			setoff_not_proc_bal(value);
			return;
		}
		if ($setoff_tax_rate1.equalsIgnoreCase(name)) {
			setoff_tax_rate1(value);
			return;
		}
		if ($setoff_tax_rate2.equalsIgnoreCase(name)) {
			setoff_tax_rate2(value);
			return;
		}
		if ($setoff_tax_rate3.equalsIgnoreCase(name)) {
			setoff_tax_rate3(value);
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
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
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



}

