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
 * ブロック"Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrR_MC_A extends MCConstRow {

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
	 * Notice rev. number 通知書改訂番号.<p>
	 *
	 */
	public static final String $pay_ntc_rev = "pay_ntc_rev";
	/**
	 * Immediate issue 即時発行.<p>
	 *
	 */
	public static final String $prnt_out_flg = "prnt_out_flg";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";
	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public static final String $aprv_rvrs_flg = "aprv_rvrs_flg";
	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public static final String $aprv_flg = "aprv_flg";
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public static final String $aprv_no = "aprv_no";
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public static final String $aprv_sts_typ = "aprv_sts_typ";
	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public static final String $aprv_sts_typ_nm = "aprv_sts_typ_nm";
	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public static final String $aprv_upd_flg = "aprv_upd_flg";
	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public static final String $aprv_can_flg = "aprv_can_flg";
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
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public static final String $bsppl_nm = "bsppl_nm";
	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public static final String $pay_bank_ac_cd = "pay_bank_ac_cd";
	/**
	 * Scheduled payee closing year and month 支払予定管理先締年月.<p>
	 *
	 */
	public static final String $bsppl_cl_ym = "bsppl_cl_ym";
	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public static final String $bsppl_cl_day = "bsppl_cl_day";
	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締日年月日.<p>
	 *
	 */
	public static final String $bsppl_cl_dt = "bsppl_cl_dt";
	public static final String $usr_dpt_p = "usr_dpt_p";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Payment account cd. 支払口座ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public static final String $psppl_cd = "psppl_cd";
	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public static final String $psppl_nm = "psppl_nm";
	/**
	 * Payee remarks 支払先備考.<p>
	 *
	 */
	public static final String $psppl_rmrks = "psppl_rmrks";
	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public static final String $note_days = "note_days";
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	public static final String $wrk_no_p = "wrk_no_p";
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public static final String $pay_spot_flg = "pay_spot_flg";
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
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 * Payment exchange rate cd. 支払為替レートＣＤ.<p>
	 *
	 */
	public static final String $pay_xrate_cd = "pay_xrate_cd";
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
	public static final String $ap_amt_p = "ap_amt_p";
	public static final String $onr_prov_amt_p = "onr_prov_amt_p";
	public static final String $trd_cur_amt_p = "trd_cur_amt_p";
	public static final String $trd_cur_com_paid_amt_p = "trd_cur_com_paid_amt_p";
	public static final String $trd_cur_com_paid_tax_amt_p = "trd_cur_com_paid_tax_amt_p";
	public static final String $base_cur_amt_p = "base_cur_amt_p";
	public static final String $base_cur_com_paid_amt_p = "base_cur_com_paid_amt_p";
	public static final String $base_cur_com_paid_tax_amt_p = "base_cur_com_paid_tax_amt_p";
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
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public static final String $pay_schd_d_print_rmrks = "pay_schd_d_print_rmrks";
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
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public static final String $last_pay_schd_amt = "last_pay_schd_amt";
	/**
	 * Current payment amount 今回支払額.<p>
	 *
	 */
	public static final String $pay_amt = "pay_amt";
	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public static final String $sw_amt = "sw_amt";
	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public static final String $bfw_amt = "bfw_amt";
	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public static final String $purc_amt = "purc_amt";
	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public static final String $purc_ret_amt = "purc_ret_amt";
	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public static final String $purc_dscnt_amt = "purc_dscnt_amt";
	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public static final String $sw_to_amt = "sw_to_amt";
	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public static final String $schd_pay_amt = "schd_pay_amt";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Update counter (Payment collation header) 更新カウンタ(支払照合ヘッダ).<p>
	 *
	 */
	public static final String $pay_chk_upd_cntr = "pay_chk_upd_cntr";
	/**
	 * Scheduled payee closing year, month, and date FROM 支払予定管理先締年月日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $bsppl_cl_dt_fr = "bsppl_cl_dt_fr";
	/**
	 * Scheduled payee closing year, month, and date TO 支払予定管理先締年月日ＴＯ.<p>
	 *
	 */
	public static final String $bsppl_cl_dt_to = "bsppl_cl_dt_to";
	/**
	 * Issue payment schedule details 支払予定明細発行.<p>
	 *
	 */
	public static final String $pay_schd_dtl_prnt_btn_flg = "pay_schd_dtl_prnt_btn_flg";
	/**
	 * Issue payment notice 支払通知書発行.<p>
	 *
	 */
	public static final String $pay_ntc_prnt_btn_flg = "pay_ntc_prnt_btn_flg";

	public static final String $bsppl_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $bsppl_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $bsppl_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $bsppl_dpt_nm = $usr_dpt_p + ".dpt_nm";
	public static final String $wrk_no = $wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $wrk_no_p + ".wrk_nm";
	public static final String $ap_amt = $ap_amt_p + ".amt";
	public static final String $onr_prov_amt = $onr_prov_amt_p + ".amt";
	public static final String $trd_cur_amt = $trd_cur_amt_p + ".amt";
	public static final String $trd_cur_com_paid_amt = $trd_cur_com_paid_amt_p + ".amt";
	public static final String $trd_cur_com_paid_tax_amt = $trd_cur_com_paid_tax_amt_p + ".amt";
	public static final String $base_cur_amt = $base_cur_amt_p + ".amt";
	public static final String $base_cur_com_paid_amt = $base_cur_com_paid_amt_p + ".amt";
	public static final String $base_cur_com_paid_tax_amt = $base_cur_com_paid_tax_amt_p + ".amt";

	public static final MCMeta pay_chk_no_META = createCommonMeta($pay_chk_no, mcframe.commonMA.meta.MA_META.PAY_CHK_NO);
	public static final MCMeta pay_chk_mng_no_META = createCommonMeta($pay_chk_mng_no, mcframe.commonMA.meta.MA_META.PAY_CHK_MNG_NO);
	public static final MCMeta pay_ntc_rev_META = createCommonMeta($pay_ntc_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta prnt_out_flg_META = createCommonMeta($prnt_out_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_rvrs_flg_META = createCommonMeta($aprv_rvrs_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_flg_META = createCommonMeta($aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_sts_typ_META = createCommonMeta($aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta aprv_sts_typ_nm_META = createCommonMeta($aprv_sts_typ_nm, mcframe.commonMA.meta.MA_META.APRV_STS_TYP_NM);
	public static final MCMeta aprv_upd_flg_META = createCommonMeta($aprv_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_can_flg_META = createCommonMeta($aprv_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta reg_dt_META = createCommonMeta($reg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_nm_META = createCommonMeta($bsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta pay_bank_ac_cd_META = createCommonMeta($pay_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta bsppl_cl_ym_META = createCommonMeta($bsppl_cl_ym, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bsppl_cl_day_META = createCommonMeta($bsppl_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bsppl_cl_dt_META = createCommonMeta($bsppl_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta psppl_nm_META = createCommonMeta($psppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta psppl_rmrks_META = createCommonMeta($psppl_rmrks, mcframe.commonMA.meta.MA_META.PSPPL_RMRKS);
	public static final MCMeta note_days_META = createCommonMeta($note_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta wrk_no_p_META = createInnerRowMeta($wrk_no_p, mcframe.clientMSUB.MSUBP0010.WrkNoR.class);
	public static final MCMeta pay_spot_flg_META = createCommonMeta($pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_upri_dec_place_META = createCommonMeta($trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_amt_dec_place_META = createCommonMeta($base_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_upri_dec_place_META = createCommonMeta($base_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta pay_xrate_cd_META = createCommonMeta($pay_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta pay_xrate_META = createCommonMeta($pay_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xrate_base_dt_META = createCommonMeta($xrate_base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ap_amt_p_META = createInnerRowMeta($ap_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta onr_prov_amt_p_META = createInnerRowMeta($onr_prov_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta trd_cur_amt_p_META = createInnerRowMeta($trd_cur_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta trd_cur_com_paid_amt_p_META = createInnerRowMeta($trd_cur_com_paid_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta trd_cur_com_paid_tax_amt_p_META = createInnerRowMeta($trd_cur_com_paid_tax_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta base_cur_amt_p_META = createInnerRowMeta($base_cur_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta base_cur_com_paid_amt_p_META = createInnerRowMeta($base_cur_com_paid_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta base_cur_com_paid_tax_amt_p_META = createInnerRowMeta($base_cur_com_paid_tax_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta pay_sts_typ_META = createCommonMeta($pay_sts_typ, mcframe.commonMS.meta.MS_META.PAY_STS_TYP);
	public static final MCMeta pay_sts_typ_nm_META = createCommonMeta($pay_sts_typ_nm, mcframe.commonMS.meta.MS_META.PAY_STS_TYP_NM);
	public static final MCMeta pay_schd_d_print_rmrks_META = createCommonMeta($pay_schd_d_print_rmrks, mcframe.commonMS.meta.MS_META.PAY_SCHD_D_PRINT_HDR_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PAY_CHK_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PAY_CHK_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PAY_CHK_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PAY_CHK_SUB_CHAR3);
	public static final MCMeta last_pay_schd_amt_META = createCommonMeta($last_pay_schd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_amt_META = createCommonMeta($pay_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_amt_META = createCommonMeta($sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bfw_amt_META = createCommonMeta($bfw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_amt_META = createCommonMeta($purc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_ret_amt_META = createCommonMeta($purc_ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_dscnt_amt_META = createCommonMeta($purc_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_to_amt_META = createCommonMeta($sw_to_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_pay_amt_META = createCommonMeta($schd_pay_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta pay_chk_upd_cntr_META = createCommonMeta($pay_chk_upd_cntr, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta bsppl_cl_dt_fr_META = createCommonMeta($bsppl_cl_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bsppl_cl_dt_to_META = createCommonMeta($bsppl_cl_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_dtl_prnt_btn_flg_META = createCommonMeta($pay_schd_dtl_prnt_btn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_prnt_btn_flg_META = createCommonMeta($pay_ntc_prnt_btn_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			pay_chk_no_META,
			pay_chk_mng_no_META,
			pay_ntc_rev_META,
			prnt_out_flg_META,
			prnt_flg_META,
			aprv_rvrs_flg_META,
			aprv_flg_META,
			aprv_no_META,
			aprv_sts_typ_META,
			aprv_sts_typ_nm_META,
			aprv_upd_flg_META,
			aprv_can_flg_META,
			reg_dt_META,
			bsppl_cd_META,
			bsppl_nm_META,
			pay_bank_ac_cd_META,
			bsppl_cl_ym_META,
			bsppl_cl_day_META,
			bsppl_cl_dt_META,
			usr_dpt_p_META,
			wg_cd_META,
			wg_nm_META,
			bank_ac_cd_META,
			psppl_cd_META,
			psppl_nm_META,
			psppl_rmrks_META,
			note_days_META,
			purc_act_no_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			wrk_no_p_META,
			pay_spot_flg_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_cur_amt_dec_place_META,
			trd_cur_upri_dec_place_META,
			base_cur_cd_META,
			base_cur_nm_META,
			base_cur_amt_dec_place_META,
			base_cur_upri_dec_place_META,
			xrate_cd_META,
			pay_xrate_cd_META,
			pay_xrate_META,
			xrate_base_dt_META,
			ap_amt_p_META,
			onr_prov_amt_p_META,
			trd_cur_amt_p_META,
			trd_cur_com_paid_amt_p_META,
			trd_cur_com_paid_tax_amt_p_META,
			base_cur_amt_p_META,
			base_cur_com_paid_amt_p_META,
			base_cur_com_paid_tax_amt_p_META,
			pay_sts_typ_META,
			pay_sts_typ_nm_META,
			pay_schd_d_print_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			last_pay_schd_amt_META,
			pay_amt_META,
			sw_amt_META,
			bfw_amt_META,
			purc_amt_META,
			purc_ret_amt_META,
			purc_dscnt_amt_META,
			setoff_amt_META,
			tax_amt_META,
			sw_to_amt_META,
			schd_pay_amt_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			ins_ts_META,
			upd_ts_META,
			upd_srv_req_no_META,
			pay_chk_upd_cntr_META,
			bsppl_cl_dt_fr_META,
			bsppl_cl_dt_to_META,
			pay_schd_dtl_prnt_btn_flg_META,
			pay_ntc_prnt_btn_flg_META
		},
		new String[][]{
			{
				"bsppl_usr_cd",
				"bsppl_usr_nm",
				"bsppl_dpt_cd",
				"bsppl_dpt_nm",
				"wrk_no",
				"wrk_nm",
				"ap_amt",
				"onr_prov_amt",
				"trd_cur_amt",
				"trd_cur_com_paid_amt",
				"trd_cur_com_paid_tax_amt",
				"base_cur_amt",
				"base_cur_com_paid_amt",
				"base_cur_com_paid_tax_amt"
			},
			{
				$bsppl_usr_cd,
				$bsppl_usr_nm,
				$bsppl_dpt_cd,
				$bsppl_dpt_nm,
				$wrk_no,
				$wrk_nm,
				$ap_amt,
				$onr_prov_amt,
				$trd_cur_amt,
				$trd_cur_com_paid_amt,
				$trd_cur_com_paid_tax_amt,
				$base_cur_amt,
				$base_cur_com_paid_amt,
				$base_cur_com_paid_tax_amt
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
				{$bsppl_cd, "bp_nm;bsppl_dpt_cd;psppl_cd;pay_spot_flg;pay_bank_ac_cd"},	// bsppl_cd
				{$usr_dpt_p + ".dpt_cd", "dpt_nm;wg_cd;pay_bank_ac_cd"},	// usr_dpt_p.dpt_cd
				{$wg_cd, "wg_nm"},	// wg_cd
				{$psppl_cd, "bp_nm;psppl_rmrks;note_days"},	// psppl_cd
				{$wrk_no_p + ".wrk_no", "wrk_nm"},	// wrk_no_p.wrk_no
				{$trd_cur_cd, "cur_nm;amt_dec_place;upri_dec_place"},	// trd_cur_cd
				{$base_cur_cd, "cur_nm;amt_dec_place;upri_dec_place"}	// base_cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$bsppl_cd, "MAC_BP_IS_SRCH_TYP.BSPPL"},	// bsppl_cd
				{$bsppl_cl_day, "bsppl_cd"},	// bsppl_cl_day
				{$usr_dpt_p + ".usr_cd", "reg_dt"},	// usr_dpt_p.usr_cd
				{$usr_dpt_p + ".dpt_cd", "MAC_DPT_IS_SRCH_TYP.AP;bsppl_usr_cd;true"},	// usr_dpt_p.dpt_cd
				{$psppl_cd, "MAC_BP_IS_SRCH_TYP.PSPPL"},	// psppl_cd
				{$wrk_no_p + ".wrk_no", "true"}	// wrk_no_p.wrk_no
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$bsppl_cd, "bp_is_srch_typ"},	// bsppl_cd
				{$bsppl_cl_day, "bsppl_cd"},	// bsppl_cl_day
				{$usr_dpt_p + ".usr_cd", "dt"},	// usr_dpt_p.usr_cd
				{$usr_dpt_p + ".dpt_cd", "dpt_is_srch_typ;usr_cd;wr_flg"},	// usr_dpt_p.dpt_cd
				{$psppl_cd, "bp_is_srch_typ"},	// psppl_cd
				{$wrk_no_p + ".wrk_no", "mode_nullval_flg"}	// wrk_no_p.wrk_no
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$base_cur_cd, "BASE_CUR"},	// base_cur_cd
				{$base_cur_nm, "BASE_CUR"},	// base_cur_nm
				{$base_cur_amt_dec_place, "BASE_CUR"},	// base_cur_amt_dec_place
				{$base_cur_upri_dec_place, "BASE_CUR"},	// base_cur_upri_dec_place
				{$xrate_cd, "BASE_CUR"},	// xrate_cd
				{$pay_xrate_cd, "PAY_XRATE"},	// pay_xrate_cd
				{$pay_xrate, "PAY_XRATE"},	// pay_xrate
				{$base_cur_amt_p + ".amt", "BASE_CUR"},	// base_cur_amt_p.amt
				{$base_cur_com_paid_amt_p + ".amt", "BASE_CUR"},	// base_cur_com_paid_amt_p.amt
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
	protected HdrR_MC_A(ConstMetaList<? extends HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR clone() {
		return (HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR createInstance() {
		return (HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR getValues(String... names) {
		return (HdrR) super.getValues(names);
	}



	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public String pay_chk_no() {
		return getConstString(offset + 0, $pay_chk_no);
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no(String value) {
		setConstString(offset + 0, $pay_chk_no, value);
	}


	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public String pay_chk_mng_no() {
		return getConstString(offset + 1, $pay_chk_mng_no);
	}

	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public void pay_chk_mng_no(String value) {
		setConstString(offset + 1, $pay_chk_mng_no, value);
	}


	/**
	 * Notice rev. number 通知書改訂番号.<p>
	 *
	 */
	public MCNumber pay_ntc_rev() {
		return getConstNumber(offset + 2, $pay_ntc_rev);
	}

	/**
	 * Notice rev. number 通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(MCNumber value) {
		setConstNumber(offset + 2, $pay_ntc_rev, value);
	}

	/**
	 * Notice rev. number 通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(int value) {
		setConstNumber(offset + 2, $pay_ntc_rev, value);
	}

	/**
	 * Notice rev. number 通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(long value) {
		setConstNumber(offset + 2, $pay_ntc_rev, value);
	}

	/**
	 * Notice rev. number 通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(float value) {
		setConstNumber(offset + 2, $pay_ntc_rev, value);
	}

	/**
	 * Notice rev. number 通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(double value) {
		setConstNumber(offset + 2, $pay_ntc_rev, value);
	}


	/**
	 * Immediate issue 即時発行.<p>
	 *
	 */
	public boolean prnt_out_flg() {
		return getConstBoolean(offset + 3, $prnt_out_flg);
	}

	/**
	 * Immediate issue 即時発行.<p>
	 *
	 */
	public void prnt_out_flg(boolean value) {
		setConstBoolean(offset + 3, $prnt_out_flg, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 4, $prnt_flg);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 4, $prnt_flg, value);
	}


	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public boolean aprv_rvrs_flg() {
		return getConstBoolean(offset + 5, $aprv_rvrs_flg);
	}

	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public void aprv_rvrs_flg(boolean value) {
		setConstBoolean(offset + 5, $aprv_rvrs_flg, value);
	}


	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 6, $aprv_flg);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 6, $aprv_flg, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 7, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 7, $aprv_no, value);
	}


	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return getConstString(offset + 8, $aprv_sts_typ);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		setConstString(offset + 8, $aprv_sts_typ, value);
	}


	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public String aprv_sts_typ_nm() {
		return getConstString(offset + 9, $aprv_sts_typ_nm);
	}

	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public void aprv_sts_typ_nm(String value) {
		setConstString(offset + 9, $aprv_sts_typ_nm, value);
	}


	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public boolean aprv_upd_flg() {
		return getConstBoolean(offset + 10, $aprv_upd_flg);
	}

	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public void aprv_upd_flg(boolean value) {
		setConstBoolean(offset + 10, $aprv_upd_flg, value);
	}


	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public boolean aprv_can_flg() {
		return getConstBoolean(offset + 11, $aprv_can_flg);
	}

	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public void aprv_can_flg(boolean value) {
		setConstBoolean(offset + 11, $aprv_can_flg, value);
	}


	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCDate reg_dt() {
		return getConstDate(offset + 12, $reg_dt);
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public void reg_dt(MCDate value) {
		setConstDate(offset + 12, $reg_dt, value);
	}


	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 13, $bsppl_cd);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 13, $bsppl_cd, value);
	}


	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public String bsppl_nm() {
		return getConstString(offset + 14, $bsppl_nm);
	}

	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public void bsppl_nm(String value) {
		setConstString(offset + 14, $bsppl_nm, value);
	}


	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return getConstString(offset + 15, $pay_bank_ac_cd);
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		setConstString(offset + 15, $pay_bank_ac_cd, value);
	}


	/**
	 * Scheduled payee closing year and month 支払予定管理先締年月.<p>
	 *
	 */
	public MCDate bsppl_cl_ym() {
		return getConstDate(offset + 16, $bsppl_cl_ym);
	}

	/**
	 * Scheduled payee closing year and month 支払予定管理先締年月.<p>
	 *
	 */
	public void bsppl_cl_ym(MCDate value) {
		setConstDate(offset + 16, $bsppl_cl_ym, value);
	}


	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public MCNumber bsppl_cl_day() {
		return getConstNumber(offset + 17, $bsppl_cl_day);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(MCNumber value) {
		setConstNumber(offset + 17, $bsppl_cl_day, value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(int value) {
		setConstNumber(offset + 17, $bsppl_cl_day, value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(long value) {
		setConstNumber(offset + 17, $bsppl_cl_day, value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(float value) {
		setConstNumber(offset + 17, $bsppl_cl_day, value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(double value) {
		setConstNumber(offset + 17, $bsppl_cl_day, value);
	}


	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締日年月日.<p>
	 *
	 */
	public MCDate bsppl_cl_dt() {
		return getConstDate(offset + 18, $bsppl_cl_dt);
	}

	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締日年月日.<p>
	 *
	 */
	public void bsppl_cl_dt(MCDate value) {
		setConstDate(offset + 18, $bsppl_cl_dt, value);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 19, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 19, $usr_dpt_p, row);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 20, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 20, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 21, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 21, $wg_nm, value);
	}


	/**
	 * Payment account cd. 支払口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 22, $bank_ac_cd);
	}

	/**
	 * Payment account cd. 支払口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 22, $bank_ac_cd, value);
	}


	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 23, $psppl_cd);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 23, $psppl_cd, value);
	}


	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public String psppl_nm() {
		return getConstString(offset + 24, $psppl_nm);
	}

	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public void psppl_nm(String value) {
		setConstString(offset + 24, $psppl_nm, value);
	}


	/**
	 * Payee remarks 支払先備考.<p>
	 *
	 */
	public String psppl_rmrks() {
		return getConstString(offset + 25, $psppl_rmrks);
	}

	/**
	 * Payee remarks 支払先備考.<p>
	 *
	 */
	public void psppl_rmrks(String value) {
		setConstString(offset + 25, $psppl_rmrks, value);
	}


	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public MCNumber note_days() {
		return getConstNumber(offset + 26, $note_days);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(MCNumber value) {
		setConstNumber(offset + 26, $note_days, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(int value) {
		setConstNumber(offset + 26, $note_days, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(long value) {
		setConstNumber(offset + 26, $note_days, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(float value) {
		setConstNumber(offset + 26, $note_days, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(double value) {
		setConstNumber(offset + 26, $note_days, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 27, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 27, $purc_act_no, value);
	}


	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 28, $rcpt_iv_no);
	}

	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 28, $rcpt_iv_no, value);
	}


	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 29, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 29, $rcpt_iv_mng_no, value);
	}


	public mcframe.clientMSUB.MSUBP0010.WrkNoR wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP0010.WrkNoR) getConstInnerRow(offset + 30, $wrk_no_p);
	}
	
	public void wrk_no_p(mcframe.clientMSUB.MSUBP0010.WrkNoR row){
		setConstInnerRow(offset + 30, $wrk_no_p, row);
	}


	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public boolean pay_spot_flg() {
		return getConstBoolean(offset + 31, $pay_spot_flg);
	}

	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public void pay_spot_flg(boolean value) {
		setConstBoolean(offset + 31, $pay_spot_flg, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 32, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 32, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 33, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 33, $trd_cur_nm, value);
	}


	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 34, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 34, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 34, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 34, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 34, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 34, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_upri_dec_place() {
		return getConstNumber(offset + 35, $trd_cur_upri_dec_place);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 35, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 35, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 35, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 35, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 35, $trd_cur_upri_dec_place, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 36, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 36, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 37, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 37, $base_cur_nm, value);
	}


	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_amt_dec_place() {
		return getConstNumber(offset + 38, $base_cur_amt_dec_place);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 38, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(int value) {
		setConstNumber(offset + 38, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(long value) {
		setConstNumber(offset + 38, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(float value) {
		setConstNumber(offset + 38, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(double value) {
		setConstNumber(offset + 38, $base_cur_amt_dec_place, value);
	}


	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_upri_dec_place() {
		return getConstNumber(offset + 39, $base_cur_upri_dec_place);
	}

	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 39, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(int value) {
		setConstNumber(offset + 39, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(long value) {
		setConstNumber(offset + 39, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(float value) {
		setConstNumber(offset + 39, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(double value) {
		setConstNumber(offset + 39, $base_cur_upri_dec_place, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 40, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 40, $xrate_cd, value);
	}


	/**
	 * Payment exchange rate cd. 支払為替レートＣＤ.<p>
	 *
	 */
	public String pay_xrate_cd() {
		return getConstString(offset + 41, $pay_xrate_cd);
	}

	/**
	 * Payment exchange rate cd. 支払為替レートＣＤ.<p>
	 *
	 */
	public void pay_xrate_cd(String value) {
		setConstString(offset + 41, $pay_xrate_cd, value);
	}


	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public MCNumber pay_xrate() {
		return getConstNumber(offset + 42, $pay_xrate);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(MCNumber value) {
		setConstNumber(offset + 42, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(int value) {
		setConstNumber(offset + 42, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(long value) {
		setConstNumber(offset + 42, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(float value) {
		setConstNumber(offset + 42, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(double value) {
		setConstNumber(offset + 42, $pay_xrate, value);
	}


	/**
	 * Exchange rate base date 為替レート基準日.<p>
	 *
	 */
	public MCDate xrate_base_dt() {
		return getConstDate(offset + 43, $xrate_base_dt);
	}

	/**
	 * Exchange rate base date 為替レート基準日.<p>
	 *
	 */
	public void xrate_base_dt(MCDate value) {
		setConstDate(offset + 43, $xrate_base_dt, value);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ap_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 44, $ap_amt_p);
	}
	
	public void ap_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 44, $ap_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR onr_prov_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 45, $onr_prov_amt_p);
	}
	
	public void onr_prov_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 45, $onr_prov_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR trd_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 46, $trd_cur_amt_p);
	}
	
	public void trd_cur_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 46, $trd_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR trd_cur_com_paid_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 47, $trd_cur_com_paid_amt_p);
	}
	
	public void trd_cur_com_paid_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 47, $trd_cur_com_paid_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR trd_cur_com_paid_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 48, $trd_cur_com_paid_tax_amt_p);
	}
	
	public void trd_cur_com_paid_tax_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 48, $trd_cur_com_paid_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR base_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 49, $base_cur_amt_p);
	}
	
	public void base_cur_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 49, $base_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR base_cur_com_paid_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 50, $base_cur_com_paid_amt_p);
	}
	
	public void base_cur_com_paid_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 50, $base_cur_com_paid_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR base_cur_com_paid_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 51, $base_cur_com_paid_tax_amt_p);
	}
	
	public void base_cur_com_paid_tax_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 51, $base_cur_com_paid_tax_amt_p, row);
	}


	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public String pay_sts_typ() {
		return getConstString(offset + 52, $pay_sts_typ);
	}

	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public void pay_sts_typ(String value) {
		setConstString(offset + 52, $pay_sts_typ, value);
	}


	/**
	 * Payment status type name 支払状況区分名.<p>
	 *
	 */
	public String pay_sts_typ_nm() {
		return getConstString(offset + 53, $pay_sts_typ_nm);
	}

	/**
	 * Payment status type name 支払状況区分名.<p>
	 *
	 */
	public void pay_sts_typ_nm(String value) {
		setConstString(offset + 53, $pay_sts_typ_nm, value);
	}


	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public String pay_schd_d_print_rmrks() {
		return getConstString(offset + 54, $pay_schd_d_print_rmrks);
	}

	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public void pay_schd_d_print_rmrks(String value) {
		setConstString(offset + 54, $pay_schd_d_print_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 55, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 55, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 56, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 56, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 57, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 57, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 58, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 58, $sub_char3, value);
	}


	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public MCNumber last_pay_schd_amt() {
		return getConstNumber(offset + 59, $last_pay_schd_amt);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(MCNumber value) {
		setConstNumber(offset + 59, $last_pay_schd_amt, value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(int value) {
		setConstNumber(offset + 59, $last_pay_schd_amt, value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(long value) {
		setConstNumber(offset + 59, $last_pay_schd_amt, value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(float value) {
		setConstNumber(offset + 59, $last_pay_schd_amt, value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(double value) {
		setConstNumber(offset + 59, $last_pay_schd_amt, value);
	}


	/**
	 * Current payment amount 今回支払額.<p>
	 *
	 */
	public MCNumber pay_amt() {
		return getConstNumber(offset + 60, $pay_amt);
	}

	/**
	 * Current payment amount 今回支払額.<p>
	 *
	 */
	public void pay_amt(MCNumber value) {
		setConstNumber(offset + 60, $pay_amt, value);
	}

	/**
	 * Current payment amount 今回支払額.<p>
	 *
	 */
	public void pay_amt(int value) {
		setConstNumber(offset + 60, $pay_amt, value);
	}

	/**
	 * Current payment amount 今回支払額.<p>
	 *
	 */
	public void pay_amt(long value) {
		setConstNumber(offset + 60, $pay_amt, value);
	}

	/**
	 * Current payment amount 今回支払額.<p>
	 *
	 */
	public void pay_amt(float value) {
		setConstNumber(offset + 60, $pay_amt, value);
	}

	/**
	 * Current payment amount 今回支払額.<p>
	 *
	 */
	public void pay_amt(double value) {
		setConstNumber(offset + 60, $pay_amt, value);
	}


	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return getConstNumber(offset + 61, $sw_amt);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		setConstNumber(offset + 61, $sw_amt, value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(int value) {
		setConstNumber(offset + 61, $sw_amt, value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(long value) {
		setConstNumber(offset + 61, $sw_amt, value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(float value) {
		setConstNumber(offset + 61, $sw_amt, value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(double value) {
		setConstNumber(offset + 61, $sw_amt, value);
	}


	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public MCNumber bfw_amt() {
		return getConstNumber(offset + 62, $bfw_amt);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(MCNumber value) {
		setConstNumber(offset + 62, $bfw_amt, value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(int value) {
		setConstNumber(offset + 62, $bfw_amt, value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(long value) {
		setConstNumber(offset + 62, $bfw_amt, value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(float value) {
		setConstNumber(offset + 62, $bfw_amt, value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(double value) {
		setConstNumber(offset + 62, $bfw_amt, value);
	}


	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public MCNumber purc_amt() {
		return getConstNumber(offset + 63, $purc_amt);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(MCNumber value) {
		setConstNumber(offset + 63, $purc_amt, value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(int value) {
		setConstNumber(offset + 63, $purc_amt, value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(long value) {
		setConstNumber(offset + 63, $purc_amt, value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(float value) {
		setConstNumber(offset + 63, $purc_amt, value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(double value) {
		setConstNumber(offset + 63, $purc_amt, value);
	}


	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public MCNumber purc_ret_amt() {
		return getConstNumber(offset + 64, $purc_ret_amt);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void purc_ret_amt(MCNumber value) {
		setConstNumber(offset + 64, $purc_ret_amt, value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void purc_ret_amt(int value) {
		setConstNumber(offset + 64, $purc_ret_amt, value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void purc_ret_amt(long value) {
		setConstNumber(offset + 64, $purc_ret_amt, value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void purc_ret_amt(float value) {
		setConstNumber(offset + 64, $purc_ret_amt, value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void purc_ret_amt(double value) {
		setConstNumber(offset + 64, $purc_ret_amt, value);
	}


	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public MCNumber purc_dscnt_amt() {
		return getConstNumber(offset + 65, $purc_dscnt_amt);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 65, $purc_dscnt_amt, value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(int value) {
		setConstNumber(offset + 65, $purc_dscnt_amt, value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(long value) {
		setConstNumber(offset + 65, $purc_dscnt_amt, value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(float value) {
		setConstNumber(offset + 65, $purc_dscnt_amt, value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(double value) {
		setConstNumber(offset + 65, $purc_dscnt_amt, value);
	}


	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 66, $setoff_amt);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 66, $setoff_amt, value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 66, $setoff_amt, value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 66, $setoff_amt, value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 66, $setoff_amt, value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 66, $setoff_amt, value);
	}


	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 67, $tax_amt);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 67, $tax_amt, value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 67, $tax_amt, value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 67, $tax_amt, value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 67, $tax_amt, value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 67, $tax_amt, value);
	}


	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return getConstNumber(offset + 68, $sw_to_amt);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		setConstNumber(offset + 68, $sw_to_amt, value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		setConstNumber(offset + 68, $sw_to_amt, value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		setConstNumber(offset + 68, $sw_to_amt, value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		setConstNumber(offset + 68, $sw_to_amt, value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		setConstNumber(offset + 68, $sw_to_amt, value);
	}


	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public MCNumber schd_pay_amt() {
		return getConstNumber(offset + 69, $schd_pay_amt);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(MCNumber value) {
		setConstNumber(offset + 69, $schd_pay_amt, value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(int value) {
		setConstNumber(offset + 69, $schd_pay_amt, value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(long value) {
		setConstNumber(offset + 69, $schd_pay_amt, value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(float value) {
		setConstNumber(offset + 69, $schd_pay_amt, value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(double value) {
		setConstNumber(offset + 69, $schd_pay_amt, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 70, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 70, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 71, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 71, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 72, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 72, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 73, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 73, $ins_func_nm, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 74, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 74, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 75, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 75, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 76, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 76, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 77, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 77, $upd_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 78, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 78, $ins_ts, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 79, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 79, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 80, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 80, $upd_srv_req_no, value);
	}


	/**
	 * Update counter (Payment collation header) 更新カウンタ(支払照合ヘッダ).<p>
	 *
	 */
	public MCNumber pay_chk_upd_cntr() {
		return getConstNumber(offset + 81, $pay_chk_upd_cntr);
	}

	/**
	 * Update counter (Payment collation header) 更新カウンタ(支払照合ヘッダ).<p>
	 *
	 */
	public void pay_chk_upd_cntr(MCNumber value) {
		setConstNumber(offset + 81, $pay_chk_upd_cntr, value);
	}

	/**
	 * Update counter (Payment collation header) 更新カウンタ(支払照合ヘッダ).<p>
	 *
	 */
	public void pay_chk_upd_cntr(int value) {
		setConstNumber(offset + 81, $pay_chk_upd_cntr, value);
	}

	/**
	 * Update counter (Payment collation header) 更新カウンタ(支払照合ヘッダ).<p>
	 *
	 */
	public void pay_chk_upd_cntr(long value) {
		setConstNumber(offset + 81, $pay_chk_upd_cntr, value);
	}

	/**
	 * Update counter (Payment collation header) 更新カウンタ(支払照合ヘッダ).<p>
	 *
	 */
	public void pay_chk_upd_cntr(float value) {
		setConstNumber(offset + 81, $pay_chk_upd_cntr, value);
	}

	/**
	 * Update counter (Payment collation header) 更新カウンタ(支払照合ヘッダ).<p>
	 *
	 */
	public void pay_chk_upd_cntr(double value) {
		setConstNumber(offset + 81, $pay_chk_upd_cntr, value);
	}


	/**
	 * Scheduled payee closing year, month, and date FROM 支払予定管理先締年月日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate bsppl_cl_dt_fr() {
		return getConstDate(offset + 82, $bsppl_cl_dt_fr);
	}

	/**
	 * Scheduled payee closing year, month, and date FROM 支払予定管理先締年月日ＦＲＯＭ.<p>
	 *
	 */
	public void bsppl_cl_dt_fr(MCDate value) {
		setConstDate(offset + 82, $bsppl_cl_dt_fr, value);
	}


	/**
	 * Scheduled payee closing year, month, and date TO 支払予定管理先締年月日ＴＯ.<p>
	 *
	 */
	public MCDate bsppl_cl_dt_to() {
		return getConstDate(offset + 83, $bsppl_cl_dt_to);
	}

	/**
	 * Scheduled payee closing year, month, and date TO 支払予定管理先締年月日ＴＯ.<p>
	 *
	 */
	public void bsppl_cl_dt_to(MCDate value) {
		setConstDate(offset + 83, $bsppl_cl_dt_to, value);
	}


	/**
	 * Issue payment schedule details 支払予定明細発行.<p>
	 *
	 */
	public boolean pay_schd_dtl_prnt_btn_flg() {
		return getConstBoolean(offset + 84, $pay_schd_dtl_prnt_btn_flg);
	}

	/**
	 * Issue payment schedule details 支払予定明細発行.<p>
	 *
	 */
	public void pay_schd_dtl_prnt_btn_flg(boolean value) {
		setConstBoolean(offset + 84, $pay_schd_dtl_prnt_btn_flg, value);
	}


	/**
	 * Issue payment notice 支払通知書発行.<p>
	 *
	 */
	public boolean pay_ntc_prnt_btn_flg() {
		return getConstBoolean(offset + 85, $pay_ntc_prnt_btn_flg);
	}

	/**
	 * Issue payment notice 支払通知書発行.<p>
	 *
	 */
	public void pay_ntc_prnt_btn_flg(boolean value) {
		setConstBoolean(offset + 85, $pay_ntc_prnt_btn_flg, value);
	}


	public String getString(String name) {
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			return pay_chk_mng_no();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return aprv_sts_typ_nm();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			return psppl_rmrks();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
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
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($pay_xrate_cd.equalsIgnoreCase(name)) {
			return pay_xrate_cd();
		}
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			return pay_sts_typ();
		}
		if ($pay_sts_typ_nm.equalsIgnoreCase(name)) {
			return pay_sts_typ_nm();
		}
		if ($pay_schd_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_schd_d_print_rmrks();
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
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			return pay_ntc_rev();
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			return bsppl_cl_day();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return base_cur_upri_dec_place();
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			return pay_xrate();
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			return last_pay_schd_amt();
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			return pay_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			return bfw_amt();
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			return purc_amt();
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			return purc_ret_amt();
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_dscnt_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			return schd_pay_amt();
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			return pay_chk_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($reg_dt.equalsIgnoreCase(name)) {
			return reg_dt();
		}
		if ($bsppl_cl_ym.equalsIgnoreCase(name)) {
			return bsppl_cl_ym();
		}
		if ($bsppl_cl_dt.equalsIgnoreCase(name)) {
			return bsppl_cl_dt();
		}
		if ($xrate_base_dt.equalsIgnoreCase(name)) {
			return xrate_base_dt();
		}
		if ($bsppl_cl_dt_fr.equalsIgnoreCase(name)) {
			return bsppl_cl_dt_fr();
		}
		if ($bsppl_cl_dt_to.equalsIgnoreCase(name)) {
			return bsppl_cl_dt_to();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($prnt_out_flg.equalsIgnoreCase(name)) {
			return prnt_out_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($aprv_rvrs_flg.equalsIgnoreCase(name)) {
			return aprv_rvrs_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			return aprv_upd_flg();
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			return aprv_can_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($pay_schd_dtl_prnt_btn_flg.equalsIgnoreCase(name)) {
			return pay_schd_dtl_prnt_btn_flg();
		}
		if ($pay_ntc_prnt_btn_flg.equalsIgnoreCase(name)) {
			return pay_ntc_prnt_btn_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			return pay_chk_mng_no();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return aprv_sts_typ_nm();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			return psppl_rmrks();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
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
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($pay_xrate_cd.equalsIgnoreCase(name)) {
			return pay_xrate_cd();
		}
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			return pay_sts_typ();
		}
		if ($pay_sts_typ_nm.equalsIgnoreCase(name)) {
			return pay_sts_typ_nm();
		}
		if ($pay_schd_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_schd_d_print_rmrks();
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
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			return pay_ntc_rev();
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			return bsppl_cl_day();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return base_cur_upri_dec_place();
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			return pay_xrate();
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			return last_pay_schd_amt();
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			return pay_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			return bfw_amt();
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			return purc_amt();
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			return purc_ret_amt();
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_dscnt_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			return schd_pay_amt();
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			return pay_chk_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($reg_dt.equalsIgnoreCase(name)) {
			return reg_dt();
		}
		if ($bsppl_cl_ym.equalsIgnoreCase(name)) {
			return bsppl_cl_ym();
		}
		if ($bsppl_cl_dt.equalsIgnoreCase(name)) {
			return bsppl_cl_dt();
		}
		if ($xrate_base_dt.equalsIgnoreCase(name)) {
			return xrate_base_dt();
		}
		if ($bsppl_cl_dt_fr.equalsIgnoreCase(name)) {
			return bsppl_cl_dt_fr();
		}
		if ($bsppl_cl_dt_to.equalsIgnoreCase(name)) {
			return bsppl_cl_dt_to();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($prnt_out_flg.equalsIgnoreCase(name)) {
			return prnt_out_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($aprv_rvrs_flg.equalsIgnoreCase(name)) {
			return aprv_rvrs_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			return aprv_upd_flg();
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			return aprv_can_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($pay_schd_dtl_prnt_btn_flg.equalsIgnoreCase(name)) {
			return pay_schd_dtl_prnt_btn_flg();
		}
		if ($pay_ntc_prnt_btn_flg.equalsIgnoreCase(name)) {
			return pay_ntc_prnt_btn_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			pay_chk_mng_no(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			aprv_sts_typ(value);
			return;
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			aprv_sts_typ_nm(value);
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
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			psppl_nm(value);
			return;
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			psppl_rmrks(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
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
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($pay_xrate_cd.equalsIgnoreCase(name)) {
			pay_xrate_cd(value);
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
		if ($pay_schd_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_schd_d_print_rmrks(value);
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
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
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
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
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
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
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
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
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
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
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
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($reg_dt.equalsIgnoreCase(name)) {
			reg_dt(value);
			return;
		}
		if ($bsppl_cl_ym.equalsIgnoreCase(name)) {
			bsppl_cl_ym(value);
			return;
		}
		if ($bsppl_cl_dt.equalsIgnoreCase(name)) {
			bsppl_cl_dt(value);
			return;
		}
		if ($xrate_base_dt.equalsIgnoreCase(name)) {
			xrate_base_dt(value);
			return;
		}
		if ($bsppl_cl_dt_fr.equalsIgnoreCase(name)) {
			bsppl_cl_dt_fr(value);
			return;
		}
		if ($bsppl_cl_dt_to.equalsIgnoreCase(name)) {
			bsppl_cl_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($prnt_out_flg.equalsIgnoreCase(name)) {
			prnt_out_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($aprv_rvrs_flg.equalsIgnoreCase(name)) {
			aprv_rvrs_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			aprv_upd_flg(value);
			return;
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			aprv_can_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($pay_schd_dtl_prnt_btn_flg.equalsIgnoreCase(name)) {
			pay_schd_dtl_prnt_btn_flg(value);
			return;
		}
		if ($pay_ntc_prnt_btn_flg.equalsIgnoreCase(name)) {
			pay_ntc_prnt_btn_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			pay_chk_mng_no(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			aprv_sts_typ(value);
			return;
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			aprv_sts_typ_nm(value);
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
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			psppl_nm(value);
			return;
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			psppl_rmrks(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
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
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($pay_xrate_cd.equalsIgnoreCase(name)) {
			pay_xrate_cd(value);
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
		if ($pay_schd_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_schd_d_print_rmrks(value);
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
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
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
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
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
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
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
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
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
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
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
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($reg_dt.equalsIgnoreCase(name)) {
			reg_dt(value);
			return;
		}
		if ($bsppl_cl_ym.equalsIgnoreCase(name)) {
			bsppl_cl_ym(value);
			return;
		}
		if ($bsppl_cl_dt.equalsIgnoreCase(name)) {
			bsppl_cl_dt(value);
			return;
		}
		if ($xrate_base_dt.equalsIgnoreCase(name)) {
			xrate_base_dt(value);
			return;
		}
		if ($bsppl_cl_dt_fr.equalsIgnoreCase(name)) {
			bsppl_cl_dt_fr(value);
			return;
		}
		if ($bsppl_cl_dt_to.equalsIgnoreCase(name)) {
			bsppl_cl_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($prnt_out_flg.equalsIgnoreCase(name)) {
			prnt_out_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($aprv_rvrs_flg.equalsIgnoreCase(name)) {
			aprv_rvrs_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			aprv_upd_flg(value);
			return;
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			aprv_can_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($pay_schd_dtl_prnt_btn_flg.equalsIgnoreCase(name)) {
			pay_schd_dtl_prnt_btn_flg(value);
			return;
		}
		if ($pay_ntc_prnt_btn_flg.equalsIgnoreCase(name)) {
			pay_ntc_prnt_btn_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			return wrk_no_p();
		}
		if ($ap_amt_p.equalsIgnoreCase(name)) {
			return ap_amt_p();
		}
		if ($onr_prov_amt_p.equalsIgnoreCase(name)) {
			return onr_prov_amt_p();
		}
		if ($trd_cur_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_amt_p();
		}
		if ($trd_cur_com_paid_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_amt_p();
		}
		if ($trd_cur_com_paid_tax_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_amt_p();
		}
		if ($base_cur_amt_p.equalsIgnoreCase(name)) {
			return base_cur_amt_p();
		}
		if ($base_cur_com_paid_amt_p.equalsIgnoreCase(name)) {
			return base_cur_com_paid_amt_p();
		}
		if ($base_cur_com_paid_tax_amt_p.equalsIgnoreCase(name)) {
			return base_cur_com_paid_tax_amt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			usr_dpt_p(
				((MCContainerMeta) usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0320.UsrDptR.class, value)
			);
			return;
		}
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			wrk_no_p(
				((MCContainerMeta) wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0010.WrkNoR.class, value)
			);
			return;
		}
		if ($ap_amt_p.equalsIgnoreCase(name)) {
			ap_amt_p(
				((MCContainerMeta) ap_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($onr_prov_amt_p.equalsIgnoreCase(name)) {
			onr_prov_amt_p(
				((MCContainerMeta) onr_prov_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($trd_cur_amt_p.equalsIgnoreCase(name)) {
			trd_cur_amt_p(
				((MCContainerMeta) trd_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($trd_cur_com_paid_amt_p.equalsIgnoreCase(name)) {
			trd_cur_com_paid_amt_p(
				((MCContainerMeta) trd_cur_com_paid_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($trd_cur_com_paid_tax_amt_p.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt_p(
				((MCContainerMeta) trd_cur_com_paid_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_amt_p.equalsIgnoreCase(name)) {
			base_cur_amt_p(
				((MCContainerMeta) base_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_com_paid_amt_p.equalsIgnoreCase(name)) {
			base_cur_com_paid_amt_p(
				((MCContainerMeta) base_cur_com_paid_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_com_paid_tax_amt_p.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt_p(
				((MCContainerMeta) base_cur_com_paid_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Scheduled payee PIC cd. 支払予定管理先担当者ＣＤ.<p>
	 *
	 */
	public String bsppl_usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * Scheduled payee PIC cd. 支払予定管理先担当者ＣＤ.<p>
	 *
	 */
	public void bsppl_usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * Scheduled payee PIC name 支払予定管理先担当者名.<p>
	 *
	 */
	public String bsppl_usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * Scheduled payee PIC name 支払予定管理先担当者名.<p>
	 *
	 */
	public void bsppl_usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public String bsppl_dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public void bsppl_dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
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
	 * AP amount 買掛金額.<p>
	 *
	 */
	public MCNumber ap_amt() {
		return ap_amt_p().amt();
	}

	/**
	 * AP amount 買掛金額.<p>
	 *
	 */
	public void ap_amt(MCNumber value) {
		ap_amt_p().amt(value);
	}

	/**
	 * AP amount 買掛金額.<p>
	 *
	 */
	public void ap_amt(int value) {
		ap_amt_p().amt(value);
	}

	/**
	 * AP amount 買掛金額.<p>
	 *
	 */
	public void ap_amt(long value) {
		ap_amt_p().amt(value);
	}

	/**
	 * AP amount 買掛金額.<p>
	 *
	 */
	public void ap_amt(float value) {
		ap_amt_p().amt(value);
	}

	/**
	 * AP amount 買掛金額.<p>
	 *
	 */
	public void ap_amt(double value) {
		ap_amt_p().amt(value);
	}

	/**
	 * Current chargeable supply amount 今回有償支給額.<p>
	 *
	 */
	public MCNumber onr_prov_amt() {
		return onr_prov_amt_p().amt();
	}

	/**
	 * Current chargeable supply amount 今回有償支給額.<p>
	 *
	 */
	public void onr_prov_amt(MCNumber value) {
		onr_prov_amt_p().amt(value);
	}

	/**
	 * Current chargeable supply amount 今回有償支給額.<p>
	 *
	 */
	public void onr_prov_amt(int value) {
		onr_prov_amt_p().amt(value);
	}

	/**
	 * Current chargeable supply amount 今回有償支給額.<p>
	 *
	 */
	public void onr_prov_amt(long value) {
		onr_prov_amt_p().amt(value);
	}

	/**
	 * Current chargeable supply amount 今回有償支給額.<p>
	 *
	 */
	public void onr_prov_amt(float value) {
		onr_prov_amt_p().amt(value);
	}

	/**
	 * Current chargeable supply amount 今回有償支給額.<p>
	 *
	 */
	public void onr_prov_amt(double value) {
		onr_prov_amt_p().amt(value);
	}

	/**
	 * Amount total 金額計.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return trd_cur_amt_p().amt();
	}

	/**
	 * Amount total 金額計.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount total 金額計.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount total 金額計.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount total 金額計.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount total 金額計.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Total fee 手数料計.<p>
	 *
	 */
	public MCNumber trd_cur_com_paid_amt() {
		return trd_cur_com_paid_amt_p().amt();
	}

	/**
	 * Total fee 手数料計.<p>
	 *
	 */
	public void trd_cur_com_paid_amt(MCNumber value) {
		trd_cur_com_paid_amt_p().amt(value);
	}

	/**
	 * Total fee 手数料計.<p>
	 *
	 */
	public void trd_cur_com_paid_amt(int value) {
		trd_cur_com_paid_amt_p().amt(value);
	}

	/**
	 * Total fee 手数料計.<p>
	 *
	 */
	public void trd_cur_com_paid_amt(long value) {
		trd_cur_com_paid_amt_p().amt(value);
	}

	/**
	 * Total fee 手数料計.<p>
	 *
	 */
	public void trd_cur_com_paid_amt(float value) {
		trd_cur_com_paid_amt_p().amt(value);
	}

	/**
	 * Total fee 手数料計.<p>
	 *
	 */
	public void trd_cur_com_paid_amt(double value) {
		trd_cur_com_paid_amt_p().amt(value);
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public MCNumber trd_cur_com_paid_tax_amt() {
		return trd_cur_com_paid_tax_amt_p().amt();
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(MCNumber value) {
		trd_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(int value) {
		trd_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(long value) {
		trd_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(float value) {
		trd_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(double value) {
		trd_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Total amount (Base currency) 基準通貨金額計.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return base_cur_amt_p().amt();
	}

	/**
	 * Total amount (Base currency) 基準通貨金額計.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Total amount (Base currency) 基準通貨金額計.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Total amount (Base currency) 基準通貨金額計.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Total amount (Base currency) 基準通貨金額計.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Total amount (Base currency) 基準通貨金額計.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Total fee (Base currency) 基準通貨手数料計.<p>
	 *
	 */
	public MCNumber base_cur_com_paid_amt() {
		return base_cur_com_paid_amt_p().amt();
	}

	/**
	 * Total fee (Base currency) 基準通貨手数料計.<p>
	 *
	 */
	public void base_cur_com_paid_amt(MCNumber value) {
		base_cur_com_paid_amt_p().amt(value);
	}

	/**
	 * Total fee (Base currency) 基準通貨手数料計.<p>
	 *
	 */
	public void base_cur_com_paid_amt(int value) {
		base_cur_com_paid_amt_p().amt(value);
	}

	/**
	 * Total fee (Base currency) 基準通貨手数料計.<p>
	 *
	 */
	public void base_cur_com_paid_amt(long value) {
		base_cur_com_paid_amt_p().amt(value);
	}

	/**
	 * Total fee (Base currency) 基準通貨手数料計.<p>
	 *
	 */
	public void base_cur_com_paid_amt(float value) {
		base_cur_com_paid_amt_p().amt(value);
	}

	/**
	 * Total fee (Base currency) 基準通貨手数料計.<p>
	 *
	 */
	public void base_cur_com_paid_amt(double value) {
		base_cur_com_paid_amt_p().amt(value);
	}

	/**
	 * Total fee tax amount (Base currency) 基準通貨手数料税額計.<p>
	 *
	 */
	public MCNumber base_cur_com_paid_tax_amt() {
		return base_cur_com_paid_tax_amt_p().amt();
	}

	/**
	 * Total fee tax amount (Base currency) 基準通貨手数料税額計.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(MCNumber value) {
		base_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Total fee tax amount (Base currency) 基準通貨手数料税額計.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(int value) {
		base_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Total fee tax amount (Base currency) 基準通貨手数料税額計.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(long value) {
		base_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Total fee tax amount (Base currency) 基準通貨手数料税額計.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(float value) {
		base_cur_com_paid_tax_amt_p().amt(value);
	}

	/**
	 * Total fee tax amount (Base currency) 基準通貨手数料税額計.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(double value) {
		base_cur_com_paid_tax_amt_p().amt(value);
	}

}

