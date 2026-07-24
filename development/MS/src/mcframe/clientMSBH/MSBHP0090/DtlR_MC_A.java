package mcframe.clientMSBH.MSBHP0090;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Reconcile 消込.<p>
	 *
	 */
	public static final String $check = "check";
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
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public static final String $pay_schd_dt = "pay_schd_dt";
	public static final String $pay_schd_amt_p = "pay_schd_amt_p";
	public static final String $pay_schd_com_paid_tax_amt_p = "pay_schd_com_paid_tax_amt_p";
	public static final String $appl_ttl_amt_p = "appl_ttl_amt_p";
	public static final String $trd_cur_amt_p = "trd_cur_amt_p";
	/**
	 * Transaction currency tax cd. 取引通貨税ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_cd = "trd_cur_com_paid_tax_cd";
	/**
	 * Transaction currency tax name 取引通貨税名.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_nm = "trd_cur_com_paid_tax_nm";
	/**
	 * Transaction currency rate 取引通貨税率.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_rate = "trd_cur_com_paid_tax_rate";
	public static final String $trd_cur_com_paid_tax_amt_p = "trd_cur_com_paid_tax_amt_p";
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
	public static final String $base_cur_amt_p = "base_cur_amt_p";
	public static final String $base_cur_com_paid_tax_amt_p = "base_cur_com_paid_tax_amt_p";
	/**
	 * Payment result details No. 支払実績明細ＮＯ.<p>
	 *
	 */
	public static final String $pay_act_d_no = "pay_act_d_no";
	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public static final String $pay_act_d_seq = "pay_act_d_seq";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public static final String $pay_chk_no = "pay_chk_no";
	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public static final String $pay_chk_mng_no = "pay_chk_mng_no";
	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public static final String $pay_schd_no = "pay_schd_no";
	/**
	 * AP reconciliation schedule No. 買掛消込予定ＮＯ.<p>
	 *
	 */
	public static final String $ap_appl_schd_no = "ap_appl_schd_no";
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public static final String $bsppl_nm = "bsppl_nm";
	/**
	 * Scheduled payee dept. cd. 支払予定管理先部門ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd = "bsppl_dpt_cd";
	/**
	 * Scheduled payee dept. name 支払予定管理先部門名.<p>
	 *
	 */
	public static final String $bsppl_dpt_nm = "bsppl_dpt_nm";
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
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	/**
	 * Purchase I/V No. 受領Ｉ／ＶＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	public static final String $wrk_no_p = "wrk_no_p";
	/**
	 * AP settlement method cd. at schedule 予定時債務決済方法ＣＤ.<p>
	 *
	 */
	public static final String $schd_ap_sttl_cd = "schd_ap_sttl_cd";
	/**
	 * AP settlement method name at schedule 予定時債務決済方法名.<p>
	 *
	 */
	public static final String $schd_ap_sttl_nm = "schd_ap_sttl_nm";
	/**
	 * AP settlement type at schedule 予定時債務決済区分.<p>
	 *
	 */
	public static final String $schd_ap_sttl_typ = "schd_ap_sttl_typ";
	/**
	 * AP settlement type name at schedule 予定時債務決済区分名.<p>
	 *
	 */
	public static final String $schd_ap_sttl_typ_nm = "schd_ap_sttl_typ_nm";
	/**
	 * Transferred 振替済.<p>
	 *
	 */
	public static final String $sw_flg = "sw_flg";
	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public static final String $pay_ntc_d_print_rmrks = "pay_ntc_d_print_rmrks";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_d_rmrks = "intr_d_rmrks";
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
	 * Payment collation update counter 支払照合更新カウンタ.<p>
	 *
	 */
	public static final String $pay_chk_upd_cntr = "pay_chk_upd_cntr";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Reconcile (For saving) 消込(保存用).<p>
	 *
	 */
	public static final String $old_check = "old_check";
	/**
	 * Scheduled payment date (For saving) 支払予定日(保存用).<p>
	 *
	 */
	public static final String $old_pay_schd_dt = "old_pay_schd_dt";
	public static final String $old_pay_schd_amt_p = "old_pay_schd_amt_p";
	public static final String $old_appl_ttl_amt_p = "old_appl_ttl_amt_p";
	public static final String $old_trd_cur_amt_p = "old_trd_cur_amt_p";
	/**
	 * Payment collation No. (For saving) 支払照合ＮＯ(保存用).<p>
	 *
	 */
	public static final String $old_pay_chk_no = "old_pay_chk_no";
	/**
	 * Payment collation management No. (For saving) 支払照合管理ＮＯ(保存用).<p>
	 *
	 */
	public static final String $old_pay_chk_mng_no = "old_pay_chk_mng_no";
	/**
	 * Payment schedule No. (For saving) 支払予定ＮＯ(保存用).<p>
	 *
	 */
	public static final String $old_pay_schd_no = "old_pay_schd_no";
	/**
	 * AP reconciliation schedule No. (For saving) 買掛消込予定ＮＯ(保存用).<p>
	 *
	 */
	public static final String $old_ap_appl_schd_no = "old_ap_appl_schd_no";
	/**
	 * AP settlement method cd. at schedule (For saving) 予定時債務決済方法ＣＤ(保存用).<p>
	 *
	 */
	public static final String $old_schd_ap_sttl_cd = "old_schd_ap_sttl_cd";
	/**
	 * AP settlement method name at schedule (For saving) 予定時債務決済方法名(保存用).<p>
	 *
	 */
	public static final String $old_schd_ap_sttl_nm = "old_schd_ap_sttl_nm";
	/**
	 * AP settlement type at schedule (For saving) 予定時債務決済区分(保存用).<p>
	 *
	 */
	public static final String $old_schd_ap_sttl_typ = "old_schd_ap_sttl_typ";
	/**
	 * AP settlement type name at schedule (For saving) 予定時債務決済区分名(保存用).<p>
	 *
	 */
	public static final String $old_schd_ap_sttl_typ_nm = "old_schd_ap_sttl_typ_nm";

	public static final String $pay_schd_amt = $pay_schd_amt_p + ".amt";
	public static final String $pay_schd_com_paid_tax_amt = $pay_schd_com_paid_tax_amt_p + ".amt";
	public static final String $appl_ttl_amt = $appl_ttl_amt_p + ".amt";
	public static final String $trd_cur_amt = $trd_cur_amt_p + ".amt";
	public static final String $trd_cur_com_paid_tax_amt = $trd_cur_com_paid_tax_amt_p + ".amt";
	public static final String $base_cur_amt = $base_cur_amt_p + ".amt";
	public static final String $base_cur_com_paid_tax_amt = $base_cur_com_paid_tax_amt_p + ".amt";
	public static final String $wrk_no = $wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $wrk_no_p + ".wrk_nm";
	public static final String $old_pay_schd_amt = $old_pay_schd_amt_p + ".amt";
	public static final String $old_appl_ttl_amt = $old_appl_ttl_amt_p + ".amt";
	public static final String $old_trd_cur_amt = $old_trd_cur_amt_p + ".amt";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_sttl_cd_META = createCommonMeta($ap_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ap_sttl_nm_META = createCommonMeta($ap_sttl_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta ap_sttl_typ_META = createCommonMeta($ap_sttl_typ, mcframe.commonMA.meta.MA_META.AP_STTL_TYP);
	public static final MCMeta ap_sttl_typ_nm_META = createCommonMeta($ap_sttl_typ_nm, mcframe.commonMA.meta.MA_META.AP_STTL_TYP_NM);
	public static final MCMeta pay_schd_dt_META = createCommonMeta($pay_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt_p_META = createInnerRowMeta($pay_schd_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta pay_schd_com_paid_tax_amt_p_META = createInnerRowMeta($pay_schd_com_paid_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta appl_ttl_amt_p_META = createInnerRowMeta($appl_ttl_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta trd_cur_amt_p_META = createInnerRowMeta($trd_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta trd_cur_com_paid_tax_cd_META = createCommonMeta($trd_cur_com_paid_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta trd_cur_com_paid_tax_nm_META = createCommonMeta($trd_cur_com_paid_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta trd_cur_com_paid_tax_rate_META = createCommonMeta($trd_cur_com_paid_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta trd_cur_com_paid_tax_amt_p_META = createInnerRowMeta($trd_cur_com_paid_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta bank_ac_nm_META = createCommonMeta($bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta pay_bank_ac_cd_META = createCommonMeta($pay_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta pay_bank_ac_nm_META = createCommonMeta($pay_bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta ap_setoff_typ_META = createCommonMeta($ap_setoff_typ, mcframe.commonMA.meta.MA_META.AP_SETOFF_TYP);
	public static final MCMeta ap_setoff_typ_nm_META = createCommonMeta($ap_setoff_typ_nm, mcframe.commonMA.meta.MA_META.AP_SETOFF_TYP_NM);
	public static final MCMeta setoff_cd_META = createCommonMeta($setoff_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta setoff_nm_META = createCommonMeta($setoff_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta so_dpt_cd_META = createCommonMeta($so_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta so_dpt_nm_META = createCommonMeta($so_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta base_cur_amt_p_META = createInnerRowMeta($base_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_com_paid_tax_amt_p_META = createInnerRowMeta($base_cur_com_paid_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta pay_act_d_no_META = createCommonMeta($pay_act_d_no, mcframe.commonMA.meta.MA_META.PAY_ACT_D_NO);
	public static final MCMeta pay_act_d_seq_META = createCommonMeta($pay_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta pay_chk_no_META = createCommonMeta($pay_chk_no, mcframe.commonMA.meta.MA_META.PAY_CHK_NO);
	public static final MCMeta pay_chk_mng_no_META = createCommonMeta($pay_chk_mng_no, mcframe.commonMA.meta.MA_META.PAY_CHK_MNG_NO);
	public static final MCMeta pay_schd_no_META = createCommonMeta($pay_schd_no, mcframe.commonMA.meta.MA_META.PAY_SCHD_NO);
	public static final MCMeta ap_appl_schd_no_META = createCommonMeta($ap_appl_schd_no, mcframe.commonMA.meta.MA_META.AP_APPL_SCHD_NO);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_nm_META = createCommonMeta($bsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bsppl_dpt_nm_META = createCommonMeta($bsppl_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_nm_META = createCommonMeta($asppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ap_typ_META = createCommonMeta($ap_typ, mcframe.commonMA.meta.MA_META.AP_TYP);
	public static final MCMeta ap_typ_nm_META = createCommonMeta($ap_typ_nm, mcframe.commonMA.meta.MA_META.AP_TYP_NM);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta wrk_no_p_META = createInnerRowMeta($wrk_no_p, mcframe.clientMSUB.MSUBP5010.WrkNoR.class);
	public static final MCMeta schd_ap_sttl_cd_META = createCommonMeta($schd_ap_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta schd_ap_sttl_nm_META = createCommonMeta($schd_ap_sttl_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta schd_ap_sttl_typ_META = createCommonMeta($schd_ap_sttl_typ, mcframe.commonMA.meta.MA_META.AP_STTL_TYP);
	public static final MCMeta schd_ap_sttl_typ_nm_META = createCommonMeta($schd_ap_sttl_typ_nm, mcframe.commonMA.meta.MA_META.AP_STTL_TYP_NM);
	public static final MCMeta sw_flg_META = createCommonMeta($sw_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_d_print_rmrks_META = createCommonMeta($pay_ntc_d_print_rmrks, mcframe.commonMS.meta.MS_META.PAY_NTC_D_PRINT_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_d_rmrks_META = createCommonMeta($intr_d_rmrks, mcframe.commonMS.meta.MS_META.PAY_ACT_D_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PAY_ACT_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PAY_ACT_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PAY_ACT_D_SUB_CHAR3);
	public static final MCMeta pay_chk_upd_cntr_META = createCommonMeta($pay_chk_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta old_check_META = createCommonMeta($old_check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_pay_schd_dt_META = createCommonMeta($old_pay_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta old_pay_schd_amt_p_META = createInnerRowMeta($old_pay_schd_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta old_appl_ttl_amt_p_META = createInnerRowMeta($old_appl_ttl_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta old_trd_cur_amt_p_META = createInnerRowMeta($old_trd_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta old_pay_chk_no_META = createCommonMeta($old_pay_chk_no, mcframe.commonMA.meta.MA_META.PAY_CHK_NO);
	public static final MCMeta old_pay_chk_mng_no_META = createCommonMeta($old_pay_chk_mng_no, mcframe.commonMA.meta.MA_META.PAY_CHK_MNG_NO);
	public static final MCMeta old_pay_schd_no_META = createCommonMeta($old_pay_schd_no, mcframe.commonMA.meta.MA_META.PAY_SCHD_NO);
	public static final MCMeta old_ap_appl_schd_no_META = createCommonMeta($old_ap_appl_schd_no, mcframe.commonMA.meta.MA_META.AP_APPL_SCHD_NO);
	public static final MCMeta old_schd_ap_sttl_cd_META = createCommonMeta($old_schd_ap_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta old_schd_ap_sttl_nm_META = createCommonMeta($old_schd_ap_sttl_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta old_schd_ap_sttl_typ_META = createCommonMeta($old_schd_ap_sttl_typ, mcframe.commonMA.meta.MA_META.AP_STTL_TYP);
	public static final MCMeta old_schd_ap_sttl_typ_nm_META = createCommonMeta($old_schd_ap_sttl_typ_nm, mcframe.commonMA.meta.MA_META.AP_STTL_TYP_NM);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			ap_sttl_cd_META,
			ap_sttl_nm_META,
			ap_sttl_typ_META,
			ap_sttl_typ_nm_META,
			pay_schd_dt_META,
			pay_schd_amt_p_META,
			pay_schd_com_paid_tax_amt_p_META,
			appl_ttl_amt_p_META,
			trd_cur_amt_p_META,
			trd_cur_com_paid_tax_cd_META,
			trd_cur_com_paid_tax_nm_META,
			trd_cur_com_paid_tax_rate_META,
			trd_cur_com_paid_tax_amt_p_META,
			bank_ac_cd_META,
			bank_ac_nm_META,
			pay_bank_ac_cd_META,
			pay_bank_ac_nm_META,
			ap_setoff_typ_META,
			ap_setoff_typ_nm_META,
			setoff_cd_META,
			setoff_nm_META,
			so_dpt_cd_META,
			so_dpt_nm_META,
			base_cur_amt_p_META,
			base_cur_com_paid_tax_amt_p_META,
			pay_act_d_no_META,
			pay_act_d_seq_META,
			disp_seq_META,
			pay_chk_no_META,
			pay_chk_mng_no_META,
			pay_schd_no_META,
			ap_appl_schd_no_META,
			bsppl_cd_META,
			bsppl_nm_META,
			bsppl_dpt_cd_META,
			bsppl_dpt_nm_META,
			asppl_cd_META,
			asppl_nm_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			ap_typ_META,
			ap_typ_nm_META,
			purc_act_no_META,
			rcpt_iv_mng_no_META,
			rcpt_iv_no_META,
			wrk_no_p_META,
			schd_ap_sttl_cd_META,
			schd_ap_sttl_nm_META,
			schd_ap_sttl_typ_META,
			schd_ap_sttl_typ_nm_META,
			sw_flg_META,
			pay_ntc_d_print_rmrks_META,
			trd_d_rmrks_META,
			intr_d_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			pay_chk_upd_cntr_META,
			data_crud_typ_META,
			old_check_META,
			old_pay_schd_dt_META,
			old_pay_schd_amt_p_META,
			old_appl_ttl_amt_p_META,
			old_trd_cur_amt_p_META,
			old_pay_chk_no_META,
			old_pay_chk_mng_no_META,
			old_pay_schd_no_META,
			old_ap_appl_schd_no_META,
			old_schd_ap_sttl_cd_META,
			old_schd_ap_sttl_nm_META,
			old_schd_ap_sttl_typ_META,
			old_schd_ap_sttl_typ_nm_META
		},
		new String[][]{
			{
				"pay_schd_amt",
				"pay_schd_com_paid_tax_amt",
				"appl_ttl_amt",
				"trd_cur_amt",
				"trd_cur_com_paid_tax_amt",
				"base_cur_amt",
				"base_cur_com_paid_tax_amt",
				"wrk_no",
				"wrk_nm",
				"old_pay_schd_amt",
				"old_appl_ttl_amt",
				"old_trd_cur_amt"
			},
			{
				$pay_schd_amt,
				$pay_schd_com_paid_tax_amt,
				$appl_ttl_amt,
				$trd_cur_amt,
				$trd_cur_com_paid_tax_amt,
				$base_cur_amt,
				$base_cur_com_paid_tax_amt,
				$wrk_no,
				$wrk_nm,
				$old_pay_schd_amt,
				$old_appl_ttl_amt,
				$old_trd_cur_amt
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
				{$ap_sttl_cd, "sttl_nm;ap_sttl_typ;ap_setoff_typ"},	// ap_sttl_cd
				{$ap_sttl_typ, "ap_sttl_typ_nm"},	// ap_sttl_typ
				{$trd_cur_com_paid_tax_cd, "tax_nm;tax_rate"},	// trd_cur_com_paid_tax_cd
				{$bank_ac_cd, "bank_ac_nm"},	// bank_ac_cd
				{$pay_bank_ac_cd, "bank_ac_nm"},	// pay_bank_ac_cd
				{$ap_setoff_typ, "ap_setoff_typ_nm"},	// ap_setoff_typ
				{$setoff_cd, "bp_nm"},	// setoff_cd
				{$so_dpt_cd, "dpt_nm"}	// so_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$trd_cur_com_paid_tax_cd, "true;true"}	// trd_cur_com_paid_tax_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$trd_cur_com_paid_tax_cd, "inc_tax_flg;purc_flg"}	// trd_cur_com_paid_tax_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}



	/**
	 * Reconcile 消込.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Reconcile 消込.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
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
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return getConstDate(offset + 5, $pay_schd_dt);
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		setConstDate(offset + 5, $pay_schd_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR pay_schd_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 6, $pay_schd_amt_p);
	}
	
	public void pay_schd_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 6, $pay_schd_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR pay_schd_com_paid_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 7, $pay_schd_com_paid_tax_amt_p);
	}
	
	public void pay_schd_com_paid_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 7, $pay_schd_com_paid_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR appl_ttl_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 8, $appl_ttl_amt_p);
	}
	
	public void appl_ttl_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 8, $appl_ttl_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 9, $trd_cur_amt_p);
	}
	
	public void trd_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 9, $trd_cur_amt_p, row);
	}


	/**
	 * Transaction currency tax cd. 取引通貨税ＣＤ.<p>
	 *
	 */
	public String trd_cur_com_paid_tax_cd() {
		return getConstString(offset + 10, $trd_cur_com_paid_tax_cd);
	}

	/**
	 * Transaction currency tax cd. 取引通貨税ＣＤ.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_cd(String value) {
		setConstString(offset + 10, $trd_cur_com_paid_tax_cd, value);
	}


	/**
	 * Transaction currency tax name 取引通貨税名.<p>
	 *
	 */
	public String trd_cur_com_paid_tax_nm() {
		return getConstString(offset + 11, $trd_cur_com_paid_tax_nm);
	}

	/**
	 * Transaction currency tax name 取引通貨税名.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_nm(String value) {
		setConstString(offset + 11, $trd_cur_com_paid_tax_nm, value);
	}


	/**
	 * Transaction currency rate 取引通貨税率.<p>
	 *
	 */
	public MCNumber trd_cur_com_paid_tax_rate() {
		return getConstNumber(offset + 12, $trd_cur_com_paid_tax_rate);
	}

	/**
	 * Transaction currency rate 取引通貨税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(MCNumber value) {
		setConstNumber(offset + 12, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Transaction currency rate 取引通貨税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(int value) {
		setConstNumber(offset + 12, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Transaction currency rate 取引通貨税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(long value) {
		setConstNumber(offset + 12, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Transaction currency rate 取引通貨税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(float value) {
		setConstNumber(offset + 12, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Transaction currency rate 取引通貨税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(double value) {
		setConstNumber(offset + 12, $trd_cur_com_paid_tax_rate, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_com_paid_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 13, $trd_cur_com_paid_tax_amt_p);
	}
	
	public void trd_cur_com_paid_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 13, $trd_cur_com_paid_tax_amt_p, row);
	}


	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 14, $bank_ac_cd);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 14, $bank_ac_cd, value);
	}


	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public String bank_ac_nm() {
		return getConstString(offset + 15, $bank_ac_nm);
	}

	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public void bank_ac_nm(String value) {
		setConstString(offset + 15, $bank_ac_nm, value);
	}


	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return getConstString(offset + 16, $pay_bank_ac_cd);
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		setConstString(offset + 16, $pay_bank_ac_cd, value);
	}


	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public String pay_bank_ac_nm() {
		return getConstString(offset + 17, $pay_bank_ac_nm);
	}

	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public void pay_bank_ac_nm(String value) {
		setConstString(offset + 17, $pay_bank_ac_nm, value);
	}


	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public String ap_setoff_typ() {
		return getConstString(offset + 18, $ap_setoff_typ);
	}

	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public void ap_setoff_typ(String value) {
		setConstString(offset + 18, $ap_setoff_typ, value);
	}


	/**
	 * AP offset destination name 債務相殺先区分名.<p>
	 *
	 */
	public String ap_setoff_typ_nm() {
		return getConstString(offset + 19, $ap_setoff_typ_nm);
	}

	/**
	 * AP offset destination name 債務相殺先区分名.<p>
	 *
	 */
	public void ap_setoff_typ_nm(String value) {
		setConstString(offset + 19, $ap_setoff_typ_nm, value);
	}


	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public String setoff_cd() {
		return getConstString(offset + 20, $setoff_cd);
	}

	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public void setoff_cd(String value) {
		setConstString(offset + 20, $setoff_cd, value);
	}


	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public String setoff_nm() {
		return getConstString(offset + 21, $setoff_nm);
	}

	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public void setoff_nm(String value) {
		setConstString(offset + 21, $setoff_nm, value);
	}


	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public String so_dpt_cd() {
		return getConstString(offset + 22, $so_dpt_cd);
	}

	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public void so_dpt_cd(String value) {
		setConstString(offset + 22, $so_dpt_cd, value);
	}


	/**
	 * Offset dept. name 相殺部門名.<p>
	 *
	 */
	public String so_dpt_nm() {
		return getConstString(offset + 23, $so_dpt_nm);
	}

	/**
	 * Offset dept. name 相殺部門名.<p>
	 *
	 */
	public void so_dpt_nm(String value) {
		setConstString(offset + 23, $so_dpt_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 24, $base_cur_amt_p);
	}
	
	public void base_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 24, $base_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_com_paid_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 25, $base_cur_com_paid_tax_amt_p);
	}
	
	public void base_cur_com_paid_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 25, $base_cur_com_paid_tax_amt_p, row);
	}


	/**
	 * Payment result details No. 支払実績明細ＮＯ.<p>
	 *
	 */
	public String pay_act_d_no() {
		return getConstString(offset + 26, $pay_act_d_no);
	}

	/**
	 * Payment result details No. 支払実績明細ＮＯ.<p>
	 *
	 */
	public void pay_act_d_no(String value) {
		setConstString(offset + 26, $pay_act_d_no, value);
	}


	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public MCNumber pay_act_d_seq() {
		return getConstNumber(offset + 27, $pay_act_d_seq);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(MCNumber value) {
		setConstNumber(offset + 27, $pay_act_d_seq, value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(int value) {
		setConstNumber(offset + 27, $pay_act_d_seq, value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(long value) {
		setConstNumber(offset + 27, $pay_act_d_seq, value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(float value) {
		setConstNumber(offset + 27, $pay_act_d_seq, value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(double value) {
		setConstNumber(offset + 27, $pay_act_d_seq, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 28, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 28, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 28, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 28, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 28, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 28, $disp_seq, value);
	}


	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public String pay_chk_no() {
		return getConstString(offset + 29, $pay_chk_no);
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no(String value) {
		setConstString(offset + 29, $pay_chk_no, value);
	}


	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public String pay_chk_mng_no() {
		return getConstString(offset + 30, $pay_chk_mng_no);
	}

	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public void pay_chk_mng_no(String value) {
		setConstString(offset + 30, $pay_chk_mng_no, value);
	}


	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public String pay_schd_no() {
		return getConstString(offset + 31, $pay_schd_no);
	}

	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public void pay_schd_no(String value) {
		setConstString(offset + 31, $pay_schd_no, value);
	}


	/**
	 * AP reconciliation schedule No. 買掛消込予定ＮＯ.<p>
	 *
	 */
	public String ap_appl_schd_no() {
		return getConstString(offset + 32, $ap_appl_schd_no);
	}

	/**
	 * AP reconciliation schedule No. 買掛消込予定ＮＯ.<p>
	 *
	 */
	public void ap_appl_schd_no(String value) {
		setConstString(offset + 32, $ap_appl_schd_no, value);
	}


	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 33, $bsppl_cd);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 33, $bsppl_cd, value);
	}


	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public String bsppl_nm() {
		return getConstString(offset + 34, $bsppl_nm);
	}

	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public void bsppl_nm(String value) {
		setConstString(offset + 34, $bsppl_nm, value);
	}


	/**
	 * Scheduled payee dept. cd. 支払予定管理先部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 35, $bsppl_dpt_cd);
	}

	/**
	 * Scheduled payee dept. cd. 支払予定管理先部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 35, $bsppl_dpt_cd, value);
	}


	/**
	 * Scheduled payee dept. name 支払予定管理先部門名.<p>
	 *
	 */
	public String bsppl_dpt_nm() {
		return getConstString(offset + 36, $bsppl_dpt_nm);
	}

	/**
	 * Scheduled payee dept. name 支払予定管理先部門名.<p>
	 *
	 */
	public void bsppl_dpt_nm(String value) {
		setConstString(offset + 36, $bsppl_dpt_nm, value);
	}


	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 37, $asppl_cd);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 37, $asppl_cd, value);
	}


	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public String asppl_nm() {
		return getConstString(offset + 38, $asppl_nm);
	}

	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public void asppl_nm(String value) {
		setConstString(offset + 38, $asppl_nm, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 39, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 39, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 40, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 40, $ap_dpt_nm, value);
	}


	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public String ap_typ() {
		return getConstString(offset + 41, $ap_typ);
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public void ap_typ(String value) {
		setConstString(offset + 41, $ap_typ, value);
	}


	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public String ap_typ_nm() {
		return getConstString(offset + 42, $ap_typ_nm);
	}

	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public void ap_typ_nm(String value) {
		setConstString(offset + 42, $ap_typ_nm, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 43, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 43, $purc_act_no, value);
	}


	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 44, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 44, $rcpt_iv_mng_no, value);
	}


	/**
	 * Purchase I/V No. 受領Ｉ／ＶＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 45, $rcpt_iv_no);
	}

	/**
	 * Purchase I/V No. 受領Ｉ／ＶＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 45, $rcpt_iv_no, value);
	}


	public mcframe.clientMSUB.MSUBP5010.WrkNoR wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5010.WrkNoR) getConstInnerRow(offset + 46, $wrk_no_p);
	}
	
	public void wrk_no_p(mcframe.clientMSUB.MSUBP5010.WrkNoR row){
		setConstInnerRow(offset + 46, $wrk_no_p, row);
	}


	/**
	 * AP settlement method cd. at schedule 予定時債務決済方法ＣＤ.<p>
	 *
	 */
	public String schd_ap_sttl_cd() {
		return getConstString(offset + 47, $schd_ap_sttl_cd);
	}

	/**
	 * AP settlement method cd. at schedule 予定時債務決済方法ＣＤ.<p>
	 *
	 */
	public void schd_ap_sttl_cd(String value) {
		setConstString(offset + 47, $schd_ap_sttl_cd, value);
	}


	/**
	 * AP settlement method name at schedule 予定時債務決済方法名.<p>
	 *
	 */
	public String schd_ap_sttl_nm() {
		return getConstString(offset + 48, $schd_ap_sttl_nm);
	}

	/**
	 * AP settlement method name at schedule 予定時債務決済方法名.<p>
	 *
	 */
	public void schd_ap_sttl_nm(String value) {
		setConstString(offset + 48, $schd_ap_sttl_nm, value);
	}


	/**
	 * AP settlement type at schedule 予定時債務決済区分.<p>
	 *
	 */
	public String schd_ap_sttl_typ() {
		return getConstString(offset + 49, $schd_ap_sttl_typ);
	}

	/**
	 * AP settlement type at schedule 予定時債務決済区分.<p>
	 *
	 */
	public void schd_ap_sttl_typ(String value) {
		setConstString(offset + 49, $schd_ap_sttl_typ, value);
	}


	/**
	 * AP settlement type name at schedule 予定時債務決済区分名.<p>
	 *
	 */
	public String schd_ap_sttl_typ_nm() {
		return getConstString(offset + 50, $schd_ap_sttl_typ_nm);
	}

	/**
	 * AP settlement type name at schedule 予定時債務決済区分名.<p>
	 *
	 */
	public void schd_ap_sttl_typ_nm(String value) {
		setConstString(offset + 50, $schd_ap_sttl_typ_nm, value);
	}


	/**
	 * Transferred 振替済.<p>
	 *
	 */
	public boolean sw_flg() {
		return getConstBoolean(offset + 51, $sw_flg);
	}

	/**
	 * Transferred 振替済.<p>
	 *
	 */
	public void sw_flg(boolean value) {
		setConstBoolean(offset + 51, $sw_flg, value);
	}


	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public String pay_ntc_d_print_rmrks() {
		return getConstString(offset + 52, $pay_ntc_d_print_rmrks);
	}

	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public void pay_ntc_d_print_rmrks(String value) {
		setConstString(offset + 52, $pay_ntc_d_print_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 53, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 53, $trd_d_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 54, $intr_d_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 54, $intr_d_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 55, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 55, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 56, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 56, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 57, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 57, $sub_char3, value);
	}


	/**
	 * Payment collation update counter 支払照合更新カウンタ.<p>
	 *
	 */
	public MCNumber pay_chk_upd_cntr() {
		return getConstNumber(offset + 58, $pay_chk_upd_cntr);
	}

	/**
	 * Payment collation update counter 支払照合更新カウンタ.<p>
	 *
	 */
	public void pay_chk_upd_cntr(MCNumber value) {
		setConstNumber(offset + 58, $pay_chk_upd_cntr, value);
	}

	/**
	 * Payment collation update counter 支払照合更新カウンタ.<p>
	 *
	 */
	public void pay_chk_upd_cntr(int value) {
		setConstNumber(offset + 58, $pay_chk_upd_cntr, value);
	}

	/**
	 * Payment collation update counter 支払照合更新カウンタ.<p>
	 *
	 */
	public void pay_chk_upd_cntr(long value) {
		setConstNumber(offset + 58, $pay_chk_upd_cntr, value);
	}

	/**
	 * Payment collation update counter 支払照合更新カウンタ.<p>
	 *
	 */
	public void pay_chk_upd_cntr(float value) {
		setConstNumber(offset + 58, $pay_chk_upd_cntr, value);
	}

	/**
	 * Payment collation update counter 支払照合更新カウンタ.<p>
	 *
	 */
	public void pay_chk_upd_cntr(double value) {
		setConstNumber(offset + 58, $pay_chk_upd_cntr, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 59, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 59, $data_crud_typ, value);
	}


	/**
	 * Reconcile (For saving) 消込(保存用).<p>
	 *
	 */
	public boolean old_check() {
		return getConstBoolean(offset + 60, $old_check);
	}

	/**
	 * Reconcile (For saving) 消込(保存用).<p>
	 *
	 */
	public void old_check(boolean value) {
		setConstBoolean(offset + 60, $old_check, value);
	}


	/**
	 * Scheduled payment date (For saving) 支払予定日(保存用).<p>
	 *
	 */
	public MCDate old_pay_schd_dt() {
		return getConstDate(offset + 61, $old_pay_schd_dt);
	}

	/**
	 * Scheduled payment date (For saving) 支払予定日(保存用).<p>
	 *
	 */
	public void old_pay_schd_dt(MCDate value) {
		setConstDate(offset + 61, $old_pay_schd_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR old_pay_schd_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 62, $old_pay_schd_amt_p);
	}
	
	public void old_pay_schd_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 62, $old_pay_schd_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR old_appl_ttl_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 63, $old_appl_ttl_amt_p);
	}
	
	public void old_appl_ttl_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 63, $old_appl_ttl_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR old_trd_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 64, $old_trd_cur_amt_p);
	}
	
	public void old_trd_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 64, $old_trd_cur_amt_p, row);
	}


	/**
	 * Payment collation No. (For saving) 支払照合ＮＯ(保存用).<p>
	 *
	 */
	public String old_pay_chk_no() {
		return getConstString(offset + 65, $old_pay_chk_no);
	}

	/**
	 * Payment collation No. (For saving) 支払照合ＮＯ(保存用).<p>
	 *
	 */
	public void old_pay_chk_no(String value) {
		setConstString(offset + 65, $old_pay_chk_no, value);
	}


	/**
	 * Payment collation management No. (For saving) 支払照合管理ＮＯ(保存用).<p>
	 *
	 */
	public String old_pay_chk_mng_no() {
		return getConstString(offset + 66, $old_pay_chk_mng_no);
	}

	/**
	 * Payment collation management No. (For saving) 支払照合管理ＮＯ(保存用).<p>
	 *
	 */
	public void old_pay_chk_mng_no(String value) {
		setConstString(offset + 66, $old_pay_chk_mng_no, value);
	}


	/**
	 * Payment schedule No. (For saving) 支払予定ＮＯ(保存用).<p>
	 *
	 */
	public String old_pay_schd_no() {
		return getConstString(offset + 67, $old_pay_schd_no);
	}

	/**
	 * Payment schedule No. (For saving) 支払予定ＮＯ(保存用).<p>
	 *
	 */
	public void old_pay_schd_no(String value) {
		setConstString(offset + 67, $old_pay_schd_no, value);
	}


	/**
	 * AP reconciliation schedule No. (For saving) 買掛消込予定ＮＯ(保存用).<p>
	 *
	 */
	public String old_ap_appl_schd_no() {
		return getConstString(offset + 68, $old_ap_appl_schd_no);
	}

	/**
	 * AP reconciliation schedule No. (For saving) 買掛消込予定ＮＯ(保存用).<p>
	 *
	 */
	public void old_ap_appl_schd_no(String value) {
		setConstString(offset + 68, $old_ap_appl_schd_no, value);
	}


	/**
	 * AP settlement method cd. at schedule (For saving) 予定時債務決済方法ＣＤ(保存用).<p>
	 *
	 */
	public String old_schd_ap_sttl_cd() {
		return getConstString(offset + 69, $old_schd_ap_sttl_cd);
	}

	/**
	 * AP settlement method cd. at schedule (For saving) 予定時債務決済方法ＣＤ(保存用).<p>
	 *
	 */
	public void old_schd_ap_sttl_cd(String value) {
		setConstString(offset + 69, $old_schd_ap_sttl_cd, value);
	}


	/**
	 * AP settlement method name at schedule (For saving) 予定時債務決済方法名(保存用).<p>
	 *
	 */
	public String old_schd_ap_sttl_nm() {
		return getConstString(offset + 70, $old_schd_ap_sttl_nm);
	}

	/**
	 * AP settlement method name at schedule (For saving) 予定時債務決済方法名(保存用).<p>
	 *
	 */
	public void old_schd_ap_sttl_nm(String value) {
		setConstString(offset + 70, $old_schd_ap_sttl_nm, value);
	}


	/**
	 * AP settlement type at schedule (For saving) 予定時債務決済区分(保存用).<p>
	 *
	 */
	public String old_schd_ap_sttl_typ() {
		return getConstString(offset + 71, $old_schd_ap_sttl_typ);
	}

	/**
	 * AP settlement type at schedule (For saving) 予定時債務決済区分(保存用).<p>
	 *
	 */
	public void old_schd_ap_sttl_typ(String value) {
		setConstString(offset + 71, $old_schd_ap_sttl_typ, value);
	}


	/**
	 * AP settlement type name at schedule (For saving) 予定時債務決済区分名(保存用).<p>
	 *
	 */
	public String old_schd_ap_sttl_typ_nm() {
		return getConstString(offset + 72, $old_schd_ap_sttl_typ_nm);
	}

	/**
	 * AP settlement type name at schedule (For saving) 予定時債務決済区分名(保存用).<p>
	 *
	 */
	public void old_schd_ap_sttl_typ_nm(String value) {
		setConstString(offset + 72, $old_schd_ap_sttl_typ_nm, value);
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
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_cd();
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_nm();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			return pay_bank_ac_nm();
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
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			return pay_act_d_no();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			return pay_chk_mng_no();
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			return pay_schd_no();
		}
		if ($ap_appl_schd_no.equalsIgnoreCase(name)) {
			return ap_appl_schd_no();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($schd_ap_sttl_cd.equalsIgnoreCase(name)) {
			return schd_ap_sttl_cd();
		}
		if ($schd_ap_sttl_nm.equalsIgnoreCase(name)) {
			return schd_ap_sttl_nm();
		}
		if ($schd_ap_sttl_typ.equalsIgnoreCase(name)) {
			return schd_ap_sttl_typ();
		}
		if ($schd_ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			return schd_ap_sttl_typ_nm();
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_ntc_d_print_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($old_pay_chk_no.equalsIgnoreCase(name)) {
			return old_pay_chk_no();
		}
		if ($old_pay_chk_mng_no.equalsIgnoreCase(name)) {
			return old_pay_chk_mng_no();
		}
		if ($old_pay_schd_no.equalsIgnoreCase(name)) {
			return old_pay_schd_no();
		}
		if ($old_ap_appl_schd_no.equalsIgnoreCase(name)) {
			return old_ap_appl_schd_no();
		}
		if ($old_schd_ap_sttl_cd.equalsIgnoreCase(name)) {
			return old_schd_ap_sttl_cd();
		}
		if ($old_schd_ap_sttl_nm.equalsIgnoreCase(name)) {
			return old_schd_ap_sttl_nm();
		}
		if ($old_schd_ap_sttl_typ.equalsIgnoreCase(name)) {
			return old_schd_ap_sttl_typ();
		}
		if ($old_schd_ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			return old_schd_ap_sttl_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_rate();
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			return pay_act_d_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			return pay_chk_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($old_pay_schd_dt.equalsIgnoreCase(name)) {
			return old_pay_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($sw_flg.equalsIgnoreCase(name)) {
			return sw_flg();
		}
		if ($old_check.equalsIgnoreCase(name)) {
			return old_check();
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
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_cd();
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_nm();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			return pay_bank_ac_nm();
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
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			return pay_act_d_no();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			return pay_chk_mng_no();
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			return pay_schd_no();
		}
		if ($ap_appl_schd_no.equalsIgnoreCase(name)) {
			return ap_appl_schd_no();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($schd_ap_sttl_cd.equalsIgnoreCase(name)) {
			return schd_ap_sttl_cd();
		}
		if ($schd_ap_sttl_nm.equalsIgnoreCase(name)) {
			return schd_ap_sttl_nm();
		}
		if ($schd_ap_sttl_typ.equalsIgnoreCase(name)) {
			return schd_ap_sttl_typ();
		}
		if ($schd_ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			return schd_ap_sttl_typ_nm();
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_ntc_d_print_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($old_pay_chk_no.equalsIgnoreCase(name)) {
			return old_pay_chk_no();
		}
		if ($old_pay_chk_mng_no.equalsIgnoreCase(name)) {
			return old_pay_chk_mng_no();
		}
		if ($old_pay_schd_no.equalsIgnoreCase(name)) {
			return old_pay_schd_no();
		}
		if ($old_ap_appl_schd_no.equalsIgnoreCase(name)) {
			return old_ap_appl_schd_no();
		}
		if ($old_schd_ap_sttl_cd.equalsIgnoreCase(name)) {
			return old_schd_ap_sttl_cd();
		}
		if ($old_schd_ap_sttl_nm.equalsIgnoreCase(name)) {
			return old_schd_ap_sttl_nm();
		}
		if ($old_schd_ap_sttl_typ.equalsIgnoreCase(name)) {
			return old_schd_ap_sttl_typ();
		}
		if ($old_schd_ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			return old_schd_ap_sttl_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_rate();
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			return pay_act_d_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			return pay_chk_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($old_pay_schd_dt.equalsIgnoreCase(name)) {
			return old_pay_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($sw_flg.equalsIgnoreCase(name)) {
			return sw_flg();
		}
		if ($old_check.equalsIgnoreCase(name)) {
			return old_check();
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
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_cd(value);
			return;
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_nm(value);
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
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			pay_bank_ac_nm(value);
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
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			pay_act_d_no(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			pay_chk_mng_no(value);
			return;
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			pay_schd_no(value);
			return;
		}
		if ($ap_appl_schd_no.equalsIgnoreCase(name)) {
			ap_appl_schd_no(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			bsppl_dpt_nm(value);
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($schd_ap_sttl_cd.equalsIgnoreCase(name)) {
			schd_ap_sttl_cd(value);
			return;
		}
		if ($schd_ap_sttl_nm.equalsIgnoreCase(name)) {
			schd_ap_sttl_nm(value);
			return;
		}
		if ($schd_ap_sttl_typ.equalsIgnoreCase(name)) {
			schd_ap_sttl_typ(value);
			return;
		}
		if ($schd_ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			schd_ap_sttl_typ_nm(value);
			return;
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_ntc_d_print_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($old_pay_chk_no.equalsIgnoreCase(name)) {
			old_pay_chk_no(value);
			return;
		}
		if ($old_pay_chk_mng_no.equalsIgnoreCase(name)) {
			old_pay_chk_mng_no(value);
			return;
		}
		if ($old_pay_schd_no.equalsIgnoreCase(name)) {
			old_pay_schd_no(value);
			return;
		}
		if ($old_ap_appl_schd_no.equalsIgnoreCase(name)) {
			old_ap_appl_schd_no(value);
			return;
		}
		if ($old_schd_ap_sttl_cd.equalsIgnoreCase(name)) {
			old_schd_ap_sttl_cd(value);
			return;
		}
		if ($old_schd_ap_sttl_nm.equalsIgnoreCase(name)) {
			old_schd_ap_sttl_nm(value);
			return;
		}
		if ($old_schd_ap_sttl_typ.equalsIgnoreCase(name)) {
			old_schd_ap_sttl_typ(value);
			return;
		}
		if ($old_schd_ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			old_schd_ap_sttl_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		if ($old_pay_schd_dt.equalsIgnoreCase(name)) {
			old_pay_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($sw_flg.equalsIgnoreCase(name)) {
			sw_flg(value);
			return;
		}
		if ($old_check.equalsIgnoreCase(name)) {
			old_check(value);
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
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_cd(value);
			return;
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_nm(value);
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
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			pay_bank_ac_nm(value);
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
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			pay_act_d_no(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			pay_chk_mng_no(value);
			return;
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			pay_schd_no(value);
			return;
		}
		if ($ap_appl_schd_no.equalsIgnoreCase(name)) {
			ap_appl_schd_no(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			bsppl_dpt_nm(value);
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($schd_ap_sttl_cd.equalsIgnoreCase(name)) {
			schd_ap_sttl_cd(value);
			return;
		}
		if ($schd_ap_sttl_nm.equalsIgnoreCase(name)) {
			schd_ap_sttl_nm(value);
			return;
		}
		if ($schd_ap_sttl_typ.equalsIgnoreCase(name)) {
			schd_ap_sttl_typ(value);
			return;
		}
		if ($schd_ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			schd_ap_sttl_typ_nm(value);
			return;
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_ntc_d_print_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($old_pay_chk_no.equalsIgnoreCase(name)) {
			old_pay_chk_no(value);
			return;
		}
		if ($old_pay_chk_mng_no.equalsIgnoreCase(name)) {
			old_pay_chk_mng_no(value);
			return;
		}
		if ($old_pay_schd_no.equalsIgnoreCase(name)) {
			old_pay_schd_no(value);
			return;
		}
		if ($old_ap_appl_schd_no.equalsIgnoreCase(name)) {
			old_ap_appl_schd_no(value);
			return;
		}
		if ($old_schd_ap_sttl_cd.equalsIgnoreCase(name)) {
			old_schd_ap_sttl_cd(value);
			return;
		}
		if ($old_schd_ap_sttl_nm.equalsIgnoreCase(name)) {
			old_schd_ap_sttl_nm(value);
			return;
		}
		if ($old_schd_ap_sttl_typ.equalsIgnoreCase(name)) {
			old_schd_ap_sttl_typ(value);
			return;
		}
		if ($old_schd_ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			old_schd_ap_sttl_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		if ($old_pay_schd_dt.equalsIgnoreCase(name)) {
			old_pay_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($sw_flg.equalsIgnoreCase(name)) {
			sw_flg(value);
			return;
		}
		if ($old_check.equalsIgnoreCase(name)) {
			old_check(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($pay_schd_amt_p.equalsIgnoreCase(name)) {
			return pay_schd_amt_p();
		}
		if ($pay_schd_com_paid_tax_amt_p.equalsIgnoreCase(name)) {
			return pay_schd_com_paid_tax_amt_p();
		}
		if ($appl_ttl_amt_p.equalsIgnoreCase(name)) {
			return appl_ttl_amt_p();
		}
		if ($trd_cur_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_amt_p();
		}
		if ($trd_cur_com_paid_tax_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_amt_p();
		}
		if ($base_cur_amt_p.equalsIgnoreCase(name)) {
			return base_cur_amt_p();
		}
		if ($base_cur_com_paid_tax_amt_p.equalsIgnoreCase(name)) {
			return base_cur_com_paid_tax_amt_p();
		}
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			return wrk_no_p();
		}
		if ($old_pay_schd_amt_p.equalsIgnoreCase(name)) {
			return old_pay_schd_amt_p();
		}
		if ($old_appl_ttl_amt_p.equalsIgnoreCase(name)) {
			return old_appl_ttl_amt_p();
		}
		if ($old_trd_cur_amt_p.equalsIgnoreCase(name)) {
			return old_trd_cur_amt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($pay_schd_amt_p.equalsIgnoreCase(name)) {
			pay_schd_amt_p(
				((MCContainerMeta) pay_schd_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($pay_schd_com_paid_tax_amt_p.equalsIgnoreCase(name)) {
			pay_schd_com_paid_tax_amt_p(
				((MCContainerMeta) pay_schd_com_paid_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($appl_ttl_amt_p.equalsIgnoreCase(name)) {
			appl_ttl_amt_p(
				((MCContainerMeta) appl_ttl_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
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
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			wrk_no_p(
				((MCContainerMeta) wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5010.WrkNoR.class, value)
			);
			return;
		}
		if ($old_pay_schd_amt_p.equalsIgnoreCase(name)) {
			old_pay_schd_amt_p(
				((MCContainerMeta) old_pay_schd_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($old_appl_ttl_amt_p.equalsIgnoreCase(name)) {
			old_appl_ttl_amt_p(
				((MCContainerMeta) old_appl_ttl_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($old_trd_cur_amt_p.equalsIgnoreCase(name)) {
			old_trd_cur_amt_p(
				((MCContainerMeta) old_trd_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Payment schedule amount 支払予定額.<p>
	 *
	 */
	public MCNumber pay_schd_amt() {
		return pay_schd_amt_p().amt();
	}

	/**
	 * Payment schedule amount 支払予定額.<p>
	 *
	 */
	public void pay_schd_amt(MCNumber value) {
		pay_schd_amt_p().amt(value);
	}

	/**
	 * Payment schedule amount 支払予定額.<p>
	 *
	 */
	public void pay_schd_amt(int value) {
		pay_schd_amt_p().amt(value);
	}

	/**
	 * Payment schedule amount 支払予定額.<p>
	 *
	 */
	public void pay_schd_amt(long value) {
		pay_schd_amt_p().amt(value);
	}

	/**
	 * Payment schedule amount 支払予定額.<p>
	 *
	 */
	public void pay_schd_amt(float value) {
		pay_schd_amt_p().amt(value);
	}

	/**
	 * Payment schedule amount 支払予定額.<p>
	 *
	 */
	public void pay_schd_amt(double value) {
		pay_schd_amt_p().amt(value);
	}

	/**
	 * Payment schedule fee tax amount 支払予定手数料税額.<p>
	 *
	 */
	public MCNumber pay_schd_com_paid_tax_amt() {
		return pay_schd_com_paid_tax_amt_p().amt();
	}

	/**
	 * Payment schedule fee tax amount 支払予定手数料税額.<p>
	 *
	 */
	public void pay_schd_com_paid_tax_amt(MCNumber value) {
		pay_schd_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Payment schedule fee tax amount 支払予定手数料税額.<p>
	 *
	 */
	public void pay_schd_com_paid_tax_amt(int value) {
		pay_schd_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Payment schedule fee tax amount 支払予定手数料税額.<p>
	 *
	 */
	public void pay_schd_com_paid_tax_amt(long value) {
		pay_schd_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Payment schedule fee tax amount 支払予定手数料税額.<p>
	 *
	 */
	public void pay_schd_com_paid_tax_amt(float value) {
		pay_schd_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Payment schedule fee tax amount 支払予定手数料税額.<p>
	 *
	 */
	public void pay_schd_com_paid_tax_amt(double value) {
		pay_schd_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Total reconciled amount 消込累計額.<p>
	 *
	 */
	public MCNumber appl_ttl_amt() {
		return appl_ttl_amt_p().amt();
	}

	/**
	 * Total reconciled amount 消込累計額.<p>
	 *
	 */
	public void appl_ttl_amt(MCNumber value) {
		appl_ttl_amt_p().amt(value);
	}

	/**
	 * Total reconciled amount 消込累計額.<p>
	 *
	 */
	public void appl_ttl_amt(int value) {
		appl_ttl_amt_p().amt(value);
	}

	/**
	 * Total reconciled amount 消込累計額.<p>
	 *
	 */
	public void appl_ttl_amt(long value) {
		appl_ttl_amt_p().amt(value);
	}

	/**
	 * Total reconciled amount 消込累計額.<p>
	 *
	 */
	public void appl_ttl_amt(float value) {
		appl_ttl_amt_p().amt(value);
	}

	/**
	 * Total reconciled amount 消込累計額.<p>
	 *
	 */
	public void appl_ttl_amt(double value) {
		appl_ttl_amt_p().amt(value);
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
	public MCNumber trd_cur_com_paid_tax_amt() {
		return trd_cur_com_paid_tax_amt_p().amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(MCNumber value) {
		trd_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(int value) {
		trd_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(long value) {
		trd_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(float value) {
		trd_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(double value) {
		trd_cur_com_paid_tax_amt_p().amt(value);
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
	public MCNumber base_cur_com_paid_tax_amt() {
		return base_cur_com_paid_tax_amt_p().amt();
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(MCNumber value) {
		base_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(int value) {
		base_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(long value) {
		base_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(float value) {
		base_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(double value) {
		base_cur_com_paid_tax_amt_p().amt(value);
	}

	public String wrk_no() {
		return wrk_no_p().wrk_no();
	}

	public void wrk_no(String value) {
		wrk_no_p().wrk_no(value);
	}

	public String wrk_nm() {
		return wrk_no_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		wrk_no_p().wrk_nm(value);
	}

	/**
	 * Payment schedule amount (For saving) 支払予定額(保存用).<p>
	 *
	 */
	public MCNumber old_pay_schd_amt() {
		return old_pay_schd_amt_p().amt();
	}

	/**
	 * Payment schedule amount (For saving) 支払予定額(保存用).<p>
	 *
	 */
	public void old_pay_schd_amt(MCNumber value) {
		old_pay_schd_amt_p().amt(value);
	}

	/**
	 * Payment schedule amount (For saving) 支払予定額(保存用).<p>
	 *
	 */
	public void old_pay_schd_amt(int value) {
		old_pay_schd_amt_p().amt(value);
	}

	/**
	 * Payment schedule amount (For saving) 支払予定額(保存用).<p>
	 *
	 */
	public void old_pay_schd_amt(long value) {
		old_pay_schd_amt_p().amt(value);
	}

	/**
	 * Payment schedule amount (For saving) 支払予定額(保存用).<p>
	 *
	 */
	public void old_pay_schd_amt(float value) {
		old_pay_schd_amt_p().amt(value);
	}

	/**
	 * Payment schedule amount (For saving) 支払予定額(保存用).<p>
	 *
	 */
	public void old_pay_schd_amt(double value) {
		old_pay_schd_amt_p().amt(value);
	}

	/**
	 * Total reconciled amount (For saving) 消込累計額(保存用).<p>
	 *
	 */
	public MCNumber old_appl_ttl_amt() {
		return old_appl_ttl_amt_p().amt();
	}

	/**
	 * Total reconciled amount (For saving) 消込累計額(保存用).<p>
	 *
	 */
	public void old_appl_ttl_amt(MCNumber value) {
		old_appl_ttl_amt_p().amt(value);
	}

	/**
	 * Total reconciled amount (For saving) 消込累計額(保存用).<p>
	 *
	 */
	public void old_appl_ttl_amt(int value) {
		old_appl_ttl_amt_p().amt(value);
	}

	/**
	 * Total reconciled amount (For saving) 消込累計額(保存用).<p>
	 *
	 */
	public void old_appl_ttl_amt(long value) {
		old_appl_ttl_amt_p().amt(value);
	}

	/**
	 * Total reconciled amount (For saving) 消込累計額(保存用).<p>
	 *
	 */
	public void old_appl_ttl_amt(float value) {
		old_appl_ttl_amt_p().amt(value);
	}

	/**
	 * Total reconciled amount (For saving) 消込累計額(保存用).<p>
	 *
	 */
	public void old_appl_ttl_amt(double value) {
		old_appl_ttl_amt_p().amt(value);
	}

	/**
	 * Amount (For saving) (Transaction currency) 取引通貨金額(保存用).<p>
	 *
	 */
	public MCNumber old_trd_cur_amt() {
		return old_trd_cur_amt_p().amt();
	}

	/**
	 * Amount (For saving) (Transaction currency) 取引通貨金額(保存用).<p>
	 *
	 */
	public void old_trd_cur_amt(MCNumber value) {
		old_trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount (For saving) (Transaction currency) 取引通貨金額(保存用).<p>
	 *
	 */
	public void old_trd_cur_amt(int value) {
		old_trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount (For saving) (Transaction currency) 取引通貨金額(保存用).<p>
	 *
	 */
	public void old_trd_cur_amt(long value) {
		old_trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount (For saving) (Transaction currency) 取引通貨金額(保存用).<p>
	 *
	 */
	public void old_trd_cur_amt(float value) {
		old_trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount (For saving) (Transaction currency) 取引通貨金額(保存用).<p>
	 *
	 */
	public void old_trd_cur_amt(double value) {
		old_trd_cur_amt_p().amt(value);
	}

}

