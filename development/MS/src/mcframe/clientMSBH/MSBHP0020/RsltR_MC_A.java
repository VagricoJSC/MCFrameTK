package mcframe.clientMSBH.MSBHP0020;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";
	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public static final String $reg_dt = "reg_dt";
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
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public static final String $bsppl_nm = "bsppl_nm";
	public static final String $bsppl_usr_dpt_p = "bsppl_usr_dpt_p";
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
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	public static final String $wrk_no_p = "wrk_no_p";
	/**
	 * Scheduled payee closing year and month 支払予定管理先締年月.<p>
	 *
	 */
	public static final String $bsppl_cl_ym = "bsppl_cl_ym";
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public static final String $bsppl_cl_day = "bsppl_cl_day";
	/**
	 * Closing year and month 締年月日.<p>
	 *
	 */
	public static final String $bsppl_cl_dt = "bsppl_cl_dt";
	public static final String $amt_p = "amt_p";
	public static final String $com_paid_p = "com_paid_p";
	public static final String $last_pay_schd_amt_p = "last_pay_schd_amt_p";
	public static final String $account_amt_p = "account_amt_p";
	public static final String $cash_amt_p = "cash_amt_p";
	public static final String $note_amt_p = "note_amt_p";
	public static final String $sw_amt_p = "sw_amt_p";
	public static final String $bfw_amt_p = "bfw_amt_p";
	public static final String $purc_amt_p = "purc_amt_p";
	public static final String $purc_ret_amt_p = "purc_ret_amt_p";
	public static final String $purc_dscnt_amt_p = "purc_dscnt_amt_p";
	public static final String $setoff_amt_p = "setoff_amt_p";
	public static final String $setoff_tax_amt_p = "setoff_tax_amt_p";
	public static final String $tax_amt_p = "tax_amt_p";
	public static final String $sw_to_amt_p = "sw_to_amt_p";
	public static final String $schd_pay_amt_p = "schd_pay_amt_p";
	public static final String $adv_pay_bal_p = "adv_pay_bal_p";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
	/**
	 * Base unit transaction currency cd. 基準単位取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Payment collation exchange rate cd. 支払照合為替レートＣＤ.<p>
	 *
	 */
	public static final String $pay_xrate_cd = "pay_xrate_cd";
	public static final String $pay_xrate_p = "pay_xrate_p";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	public static final String $xrate_p = "xrate_p";
	/**
	 * With temporary unit price 仮単価あり.<p>
	 *
	 */
	public static final String $inc_interim_flg = "inc_interim_flg";
	/**
	 * Purchase temporary unit price closing 仕入仮単価締.<p>
	 *
	 */
	public static final String $purc_interim_cl_flg = "purc_interim_cl_flg";
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
	 * Uncollated 未照合.<p>
	 *
	 */
	public static final String $unchk_flg = "unchk_flg";
	/**
	 * Schedule 予定.<p>
	 *
	 */
	public static final String $schd_flg = "schd_flg";
	/**
	 * Paid 支払済.<p>
	 *
	 */
	public static final String $act_flg = "act_flg";
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
	 * Payment unit tax 支払単位税.<p>
	 *
	 */
	public static final String $tax_on_pay_flg = "tax_on_pay_flg";
	/**
	 * Manual マニュアル.<p>
	 *
	 */
	public static final String $manual_flg = "manual_flg";
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public static final String $pay_spot_flg = "pay_spot_flg";
	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public static final String $batch_pay_schd_cl_flg = "batch_pay_schd_cl_flg";
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
	public static final String $rts_msg_p = "rts_msg_p";
	public static final String $bsppl_grp_p = "bsppl_grp_p";
	public static final String $psppl_grp_p = "psppl_grp_p";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Min. recording date 最小計上日.<p>
	 *
	 */
	public static final String $min_ac_dt = "min_ac_dt";
	/**
	 * Max. recording date 最大計上日.<p>
	 *
	 */
	public static final String $max_ac_dt = "max_ac_dt";
	/**
	 * Not reacquire payment result flg. 支払実績再取得しないＦＬＧ.<p>
	 *
	 */
	public static final String $pay_act_not_ref_flg = "pay_act_not_ref_flg";
	/**
	 * Cd. of dept. in charge of scheduled payee_before change 支払予定管理先担当部門ＣＤ_変更前.<p>
	 *
	 */
	public static final String $old_bsppl_dpt_cd = "old_bsppl_dpt_cd";
	/**
	 * Closing date_before change 締年月日_変更前.<p>
	 *
	 */
	public static final String $old_bsppl_cl_dt = "old_bsppl_cl_dt";
	/**
	 * Last payment schedule amount_before change 前回支払予定額_変更前.<p>
	 *
	 */
	public static final String $old_last_pay_schd_amt = "old_last_pay_schd_amt";
	/**
	 * Current carry-over amount_before change 今回繰越額_変更前.<p>
	 *
	 */
	public static final String $old_bfw_amt = "old_bfw_amt";
	/**
	 * Current payment amount from deposit_before change 今回預金支払額_変更前.<p>
	 *
	 */
	public static final String $old_account_amt = "old_account_amt";
	/**
	 * Current cash payment amount_before change 今回現金支払額_変更前.<p>
	 *
	 */
	public static final String $old_cash_amt = "old_cash_amt";
	/**
	 * Current notes payment amount_before change 今回手形支払額_変更前.<p>
	 *
	 */
	public static final String $old_note_amt = "old_note_amt";
	/**
	 * Current offset payment amount_before change 今回相殺支払額_変更前.<p>
	 *
	 */
	public static final String $old_setoff_amt = "old_setoff_amt";
	/**
	 * Current scheduled payment amount_before change 今回支払予定額_変更前.<p>
	 *
	 */
	public static final String $old_schd_pay_amt = "old_schd_pay_amt";
	/**
	 * Payment received result input target 前受金実績登録対象.<p>
	 *
	 */
	public static final String $adv_pay_act_tgt_flg = "adv_pay_act_tgt_flg";
	/**
	 * Exchange rate base date 為替レート基準日.<p>
	 *
	 */
	public static final String $xrate_base_dt = "xrate_base_dt";

	public static final String $bsppl_usr_cd = $bsppl_usr_dpt_p + ".usr_cd";
	public static final String $bsppl_usr_nm = $bsppl_usr_dpt_p + ".usr_nm";
	public static final String $bsppl_dpt_cd = $bsppl_usr_dpt_p + ".dpt_cd";
	public static final String $bsppl_dpt_nm = $bsppl_usr_dpt_p + ".dpt_nm";
	public static final String $wrk_no = $wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $wrk_no_p + ".wrk_nm";
	public static final String $amt = $amt_p + ".amt";
	public static final String $com_paid = $com_paid_p + ".amt";
	public static final String $com_paid_tax_amt = $com_paid_p + ".tax_amt";
	public static final String $last_pay_schd_amt = $last_pay_schd_amt_p + ".amt";
	public static final String $account_amt = $account_amt_p + ".amt";
	public static final String $cash_amt = $cash_amt_p + ".amt";
	public static final String $note_amt = $note_amt_p + ".amt";
	public static final String $sw_amt = $sw_amt_p + ".amt";
	public static final String $bfw_amt = $bfw_amt_p + ".amt";
	public static final String $purc_amt = $purc_amt_p + ".amt";
	public static final String $purc_ret_amt = $purc_ret_amt_p + ".amt";
	public static final String $purc_dscnt_amt = $purc_dscnt_amt_p + ".amt";
	public static final String $setoff_amt = $setoff_amt_p + ".amt";
	public static final String $setoff_tax_amt = $setoff_tax_amt_p + ".amt";
	public static final String $tax_amt = $tax_amt_p + ".amt";
	public static final String $sw_to_amt = $sw_to_amt_p + ".amt";
	public static final String $schd_pay_amt = $schd_pay_amt_p + ".amt";
	public static final String $adv_pay_bal = $adv_pay_bal_p + ".amt";
	public static final String $pay_xrate = $pay_xrate_p + ".xrate";
	public static final String $xrate = $xrate_p + ".xrate";
	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";
	public static final String $bsppl_grp_cd1 = $bsppl_grp_p + ".bp_grp_cd1";
	public static final String $bsppl_grp_nm1 = $bsppl_grp_p + ".bp_grp_nm1";
	public static final String $bsppl_grp_cd2 = $bsppl_grp_p + ".bp_grp_cd2";
	public static final String $bsppl_grp_nm2 = $bsppl_grp_p + ".bp_grp_nm2";
	public static final String $bsppl_grp_cd3 = $bsppl_grp_p + ".bp_grp_cd3";
	public static final String $bsppl_grp_nm3 = $bsppl_grp_p + ".bp_grp_nm3";
	public static final String $bsppl_grp_cd4 = $bsppl_grp_p + ".bp_grp_cd4";
	public static final String $bsppl_grp_nm4 = $bsppl_grp_p + ".bp_grp_nm4";
	public static final String $bsppl_grp_cd5 = $bsppl_grp_p + ".bp_grp_cd5";
	public static final String $bsppl_grp_nm5 = $bsppl_grp_p + ".bp_grp_nm5";
	public static final String $bsppl_grp_cd6 = $bsppl_grp_p + ".bp_grp_cd6";
	public static final String $bsppl_grp_nm6 = $bsppl_grp_p + ".bp_grp_nm6";
	public static final String $bsppl_grp_cd7 = $bsppl_grp_p + ".bp_grp_cd7";
	public static final String $bsppl_grp_nm7 = $bsppl_grp_p + ".bp_grp_nm7";
	public static final String $bsppl_grp_cd8 = $bsppl_grp_p + ".bp_grp_cd8";
	public static final String $bsppl_grp_nm8 = $bsppl_grp_p + ".bp_grp_nm8";
	public static final String $bsppl_grp_cd9 = $bsppl_grp_p + ".bp_grp_cd9";
	public static final String $bsppl_grp_nm9 = $bsppl_grp_p + ".bp_grp_nm9";
	public static final String $bsppl_grp_cd10 = $bsppl_grp_p + ".bp_grp_cd10";
	public static final String $bsppl_grp_nm10 = $bsppl_grp_p + ".bp_grp_nm10";
	public static final String $psppl_grp_cd1 = $psppl_grp_p + ".bp_grp_cd1";
	public static final String $psppl_grp_nm1 = $psppl_grp_p + ".bp_grp_nm1";
	public static final String $psppl_grp_cd2 = $psppl_grp_p + ".bp_grp_cd2";
	public static final String $psppl_grp_nm2 = $psppl_grp_p + ".bp_grp_nm2";
	public static final String $psppl_grp_cd3 = $psppl_grp_p + ".bp_grp_cd3";
	public static final String $psppl_grp_nm3 = $psppl_grp_p + ".bp_grp_nm3";
	public static final String $psppl_grp_cd4 = $psppl_grp_p + ".bp_grp_cd4";
	public static final String $psppl_grp_nm4 = $psppl_grp_p + ".bp_grp_nm4";
	public static final String $psppl_grp_cd5 = $psppl_grp_p + ".bp_grp_cd5";
	public static final String $psppl_grp_nm5 = $psppl_grp_p + ".bp_grp_nm5";
	public static final String $psppl_grp_cd6 = $psppl_grp_p + ".bp_grp_cd6";
	public static final String $psppl_grp_nm6 = $psppl_grp_p + ".bp_grp_nm6";
	public static final String $psppl_grp_cd7 = $psppl_grp_p + ".bp_grp_cd7";
	public static final String $psppl_grp_nm7 = $psppl_grp_p + ".bp_grp_nm7";
	public static final String $psppl_grp_cd8 = $psppl_grp_p + ".bp_grp_cd8";
	public static final String $psppl_grp_nm8 = $psppl_grp_p + ".bp_grp_nm8";
	public static final String $psppl_grp_cd9 = $psppl_grp_p + ".bp_grp_cd9";
	public static final String $psppl_grp_nm9 = $psppl_grp_p + ".bp_grp_nm9";
	public static final String $psppl_grp_cd10 = $psppl_grp_p + ".bp_grp_cd10";
	public static final String $psppl_grp_nm10 = $psppl_grp_p + ".bp_grp_nm10";

	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta reg_dt_META = createCommonMeta($reg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta psppl_nm_META = createCommonMeta($psppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_nm_META = createCommonMeta($bsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_usr_dpt_p_META = createInnerRowMeta($bsppl_usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta wrk_no_p_META = createInnerRowMeta($wrk_no_p, mcframe.clientMSUB.MSUBP5010.WrkNoR.class);
	public static final MCMeta bsppl_cl_ym_META = createCommonMeta($bsppl_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta bsppl_cl_day_META = createCommonMeta($bsppl_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bsppl_cl_dt_META = createCommonMeta($bsppl_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta amt_p_META = createInnerRowMeta($amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta com_paid_p_META = createInnerRowMeta($com_paid_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta last_pay_schd_amt_p_META = createInnerRowMeta($last_pay_schd_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta account_amt_p_META = createInnerRowMeta($account_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta cash_amt_p_META = createInnerRowMeta($cash_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta note_amt_p_META = createInnerRowMeta($note_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta sw_amt_p_META = createInnerRowMeta($sw_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta bfw_amt_p_META = createInnerRowMeta($bfw_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta purc_amt_p_META = createInnerRowMeta($purc_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta purc_ret_amt_p_META = createInnerRowMeta($purc_ret_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta purc_dscnt_amt_p_META = createInnerRowMeta($purc_dscnt_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta setoff_amt_p_META = createInnerRowMeta($setoff_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta setoff_tax_amt_p_META = createInnerRowMeta($setoff_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta tax_amt_p_META = createInnerRowMeta($tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta sw_to_amt_p_META = createInnerRowMeta($sw_to_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta schd_pay_amt_p_META = createInnerRowMeta($schd_pay_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta adv_pay_bal_p_META = createInnerRowMeta($adv_pay_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta pay_xrate_cd_META = createCommonMeta($pay_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta pay_xrate_p_META = createInnerRowMeta($pay_xrate_p, mcframe.clientMAUB.MAUBP5390.XrateR.class);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_p_META = createInnerRowMeta($xrate_p, mcframe.clientMAUB.MAUBP5390.XrateR.class);
	public static final MCMeta inc_interim_flg_META = createCommonMeta($inc_interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_interim_cl_flg_META = createCommonMeta($purc_interim_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_chk_no_META = createCommonMeta($pay_chk_no, mcframe.commonMA.meta.MA_META.PAY_CHK_NO);
	public static final MCMeta pay_chk_mng_no_META = createCommonMeta($pay_chk_mng_no, mcframe.commonMA.meta.MA_META.PAY_CHK_MNG_NO);
	public static final MCMeta pay_ntc_rev_META = createCommonMeta($pay_ntc_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta unchk_flg_META = createCommonMeta($unchk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_flg_META = createCommonMeta($schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_flg_META = createCommonMeta($act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_sts_typ_META = createCommonMeta($aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta aprv_sts_typ_nm_META = createCommonMeta($aprv_sts_typ_nm, mcframe.commonMA.meta.MA_META.APRV_STS_TYP_NM);
	public static final MCMeta aprv_rvrs_flg_META = createCommonMeta($aprv_rvrs_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_flg_META = createCommonMeta($aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_upd_flg_META = createCommonMeta($aprv_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_can_flg_META = createCommonMeta($aprv_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_sts_typ_META = createCommonMeta($pay_sts_typ, mcframe.commonMS.meta.MS_META.PAY_STS_TYP);
	public static final MCMeta pay_sts_typ_nm_META = createCommonMeta($pay_sts_typ_nm, mcframe.commonMS.meta.MS_META.PAY_STS_TYP_NM);
	public static final MCMeta tax_on_pay_flg_META = createCommonMeta($tax_on_pay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta manual_flg_META = createCommonMeta($manual_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_spot_flg_META = createCommonMeta($pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta batch_pay_schd_cl_flg_META = createCommonMeta($batch_pay_schd_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_schd_d_print_rmrks_META = createCommonMeta($pay_schd_d_print_rmrks, mcframe.commonMS.meta.MS_META.PAY_SCHD_D_PRINT_HDR_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PAY_CHK_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PAY_CHK_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PAY_CHK_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PAY_CHK_SUB_CHAR3);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta bsppl_grp_p_META = createInnerRowMeta($bsppl_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta psppl_grp_p_META = createInnerRowMeta($psppl_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta min_ac_dt_META = createCommonMeta($min_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta max_ac_dt_META = createCommonMeta($max_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_act_not_ref_flg_META = createCommonMeta($pay_act_not_ref_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_bsppl_dpt_cd_META = createCommonMeta($old_bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta old_bsppl_cl_dt_META = createCommonMeta($old_bsppl_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta old_last_pay_schd_amt_META = createCommonMeta($old_last_pay_schd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_bfw_amt_META = createCommonMeta($old_bfw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_account_amt_META = createCommonMeta($old_account_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_cash_amt_META = createCommonMeta($old_cash_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_note_amt_META = createCommonMeta($old_note_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_setoff_amt_META = createCommonMeta($old_setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_schd_pay_amt_META = createCommonMeta($old_schd_pay_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_pay_act_tgt_flg_META = createCommonMeta($adv_pay_act_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_base_dt_META = createCommonMeta($xrate_base_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			check_META,
			prnt_flg_META,
			reg_dt_META,
			psppl_cd_META,
			psppl_nm_META,
			bsppl_cd_META,
			bsppl_nm_META,
			bsppl_usr_dpt_p_META,
			wg_cd_META,
			wg_nm_META,
			purc_act_no_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			wrk_no_p_META,
			bsppl_cl_ym_META,
			bsppl_cl_day_META,
			bsppl_cl_dt_META,
			amt_p_META,
			com_paid_p_META,
			last_pay_schd_amt_p_META,
			account_amt_p_META,
			cash_amt_p_META,
			note_amt_p_META,
			sw_amt_p_META,
			bfw_amt_p_META,
			purc_amt_p_META,
			purc_ret_amt_p_META,
			purc_dscnt_amt_p_META,
			setoff_amt_p_META,
			setoff_tax_amt_p_META,
			tax_amt_p_META,
			sw_to_amt_p_META,
			schd_pay_amt_p_META,
			adv_pay_bal_p_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_cur_amt_dec_place_META,
			base_cur_cd_META,
			pay_xrate_cd_META,
			pay_xrate_p_META,
			xrate_cd_META,
			xrate_p_META,
			inc_interim_flg_META,
			purc_interim_cl_flg_META,
			pay_chk_no_META,
			pay_chk_mng_no_META,
			pay_ntc_rev_META,
			unchk_flg_META,
			schd_flg_META,
			act_flg_META,
			aprv_no_META,
			aprv_sts_typ_META,
			aprv_sts_typ_nm_META,
			aprv_rvrs_flg_META,
			aprv_flg_META,
			aprv_upd_flg_META,
			aprv_can_flg_META,
			pay_sts_typ_META,
			pay_sts_typ_nm_META,
			tax_on_pay_flg_META,
			manual_flg_META,
			pay_spot_flg_META,
			batch_pay_schd_cl_flg_META,
			pay_schd_d_print_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			rts_msg_p_META,
			bsppl_grp_p_META,
			psppl_grp_p_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META,
			upd_cntr_META,
			min_ac_dt_META,
			max_ac_dt_META,
			pay_act_not_ref_flg_META,
			old_bsppl_dpt_cd_META,
			old_bsppl_cl_dt_META,
			old_last_pay_schd_amt_META,
			old_bfw_amt_META,
			old_account_amt_META,
			old_cash_amt_META,
			old_note_amt_META,
			old_setoff_amt_META,
			old_schd_pay_amt_META,
			adv_pay_act_tgt_flg_META,
			xrate_base_dt_META
		},
		new String[][]{
			{
				"bsppl_usr_cd",
				"bsppl_usr_nm",
				"bsppl_dpt_cd",
				"bsppl_dpt_nm",
				"wrk_no",
				"wrk_nm",
				"amt",
				"com_paid",
				"com_paid_tax_amt",
				"last_pay_schd_amt",
				"account_amt",
				"cash_amt",
				"note_amt",
				"sw_amt",
				"bfw_amt",
				"purc_amt",
				"purc_ret_amt",
				"purc_dscnt_amt",
				"setoff_amt",
				"setoff_tax_amt",
				"tax_amt",
				"sw_to_amt",
				"schd_pay_amt",
				"adv_pay_bal",
				"pay_xrate",
				"xrate",
				"rtn_sts_typ",
				"bsppl_grp_cd1",
				"bsppl_grp_nm1",
				"bsppl_grp_cd2",
				"bsppl_grp_nm2",
				"bsppl_grp_cd3",
				"bsppl_grp_nm3",
				"bsppl_grp_cd4",
				"bsppl_grp_nm4",
				"bsppl_grp_cd5",
				"bsppl_grp_nm5",
				"bsppl_grp_cd6",
				"bsppl_grp_nm6",
				"bsppl_grp_cd7",
				"bsppl_grp_nm7",
				"bsppl_grp_cd8",
				"bsppl_grp_nm8",
				"bsppl_grp_cd9",
				"bsppl_grp_nm9",
				"bsppl_grp_cd10",
				"bsppl_grp_nm10",
				"psppl_grp_cd1",
				"psppl_grp_nm1",
				"psppl_grp_cd2",
				"psppl_grp_nm2",
				"psppl_grp_cd3",
				"psppl_grp_nm3",
				"psppl_grp_cd4",
				"psppl_grp_nm4",
				"psppl_grp_cd5",
				"psppl_grp_nm5",
				"psppl_grp_cd6",
				"psppl_grp_nm6",
				"psppl_grp_cd7",
				"psppl_grp_nm7",
				"psppl_grp_cd8",
				"psppl_grp_nm8",
				"psppl_grp_cd9",
				"psppl_grp_nm9",
				"psppl_grp_cd10",
				"psppl_grp_nm10"
			},
			{
				$bsppl_usr_cd,
				$bsppl_usr_nm,
				$bsppl_dpt_cd,
				$bsppl_dpt_nm,
				$wrk_no,
				$wrk_nm,
				$amt,
				$com_paid,
				$com_paid_tax_amt,
				$last_pay_schd_amt,
				$account_amt,
				$cash_amt,
				$note_amt,
				$sw_amt,
				$bfw_amt,
				$purc_amt,
				$purc_ret_amt,
				$purc_dscnt_amt,
				$setoff_amt,
				$setoff_tax_amt,
				$tax_amt,
				$sw_to_amt,
				$schd_pay_amt,
				$adv_pay_bal,
				$pay_xrate,
				$xrate,
				$rtn_sts_typ,
				$bsppl_grp_cd1,
				$bsppl_grp_nm1,
				$bsppl_grp_cd2,
				$bsppl_grp_nm2,
				$bsppl_grp_cd3,
				$bsppl_grp_nm3,
				$bsppl_grp_cd4,
				$bsppl_grp_nm4,
				$bsppl_grp_cd5,
				$bsppl_grp_nm5,
				$bsppl_grp_cd6,
				$bsppl_grp_nm6,
				$bsppl_grp_cd7,
				$bsppl_grp_nm7,
				$bsppl_grp_cd8,
				$bsppl_grp_nm8,
				$bsppl_grp_cd9,
				$bsppl_grp_nm9,
				$bsppl_grp_cd10,
				$bsppl_grp_nm10,
				$psppl_grp_cd1,
				$psppl_grp_nm1,
				$psppl_grp_cd2,
				$psppl_grp_nm2,
				$psppl_grp_cd3,
				$psppl_grp_nm3,
				$psppl_grp_cd4,
				$psppl_grp_nm4,
				$psppl_grp_cd5,
				$psppl_grp_nm5,
				$psppl_grp_cd6,
				$psppl_grp_nm6,
				$psppl_grp_cd7,
				$psppl_grp_nm7,
				$psppl_grp_cd8,
				$psppl_grp_nm8,
				$psppl_grp_cd9,
				$psppl_grp_nm9,
				$psppl_grp_cd10,
				$psppl_grp_nm10
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
				{$bsppl_usr_dpt_p + ".dpt_cd", "dpt_nm;wg_cd"}	// bsppl_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$bsppl_usr_dpt_p + ".dpt_cd", "reg_dt;bsppl_usr_cd;MAC_DPT_IS_SRCH_TYP.AP;true"},	// bsppl_usr_dpt_p.dpt_cd
				{$bsppl_cl_day, "bsppl_cd"}	// bsppl_cl_day
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$bsppl_usr_dpt_p + ".dpt_cd", "dt;usr_cd;dpt_is_srch_typ;wr_flg"}	// bsppl_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$base_cur_cd, "BASE_CUR"},	// base_cur_cd
				{$xrate_cd, "BASE_CUR"},	// xrate_cd
				{$xrate_p + ".xrate", "BASE_CUR"}	// xrate_p.xrate
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}



	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 0, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}


	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 1, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 1, $check, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 2, $prnt_flg);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 2, $prnt_flg, value);
	}


	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCDate reg_dt() {
		return getConstDate(offset + 3, $reg_dt);
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public void reg_dt(MCDate value) {
		setConstDate(offset + 3, $reg_dt, value);
	}


	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 4, $psppl_cd);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 4, $psppl_cd, value);
	}


	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public String psppl_nm() {
		return getConstString(offset + 5, $psppl_nm);
	}

	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public void psppl_nm(String value) {
		setConstString(offset + 5, $psppl_nm, value);
	}


	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 6, $bsppl_cd);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 6, $bsppl_cd, value);
	}


	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public String bsppl_nm() {
		return getConstString(offset + 7, $bsppl_nm);
	}

	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public void bsppl_nm(String value) {
		setConstString(offset + 7, $bsppl_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR bsppl_usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 8, $bsppl_usr_dpt_p);
	}
	
	public void bsppl_usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 8, $bsppl_usr_dpt_p, row);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 9, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 9, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 10, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 10, $wg_nm, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 11, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 11, $purc_act_no, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 12, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 12, $rcpt_iv_no, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 13, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 13, $rcpt_iv_mng_no, value);
	}


	public mcframe.clientMSUB.MSUBP5010.WrkNoR wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5010.WrkNoR) getConstInnerRow(offset + 14, $wrk_no_p);
	}
	
	public void wrk_no_p(mcframe.clientMSUB.MSUBP5010.WrkNoR row){
		setConstInnerRow(offset + 14, $wrk_no_p, row);
	}


	/**
	 * Scheduled payee closing year and month 支払予定管理先締年月.<p>
	 *
	 */
	public MCDate bsppl_cl_ym() {
		return getConstDate(offset + 15, $bsppl_cl_ym);
	}

	/**
	 * Scheduled payee closing year and month 支払予定管理先締年月.<p>
	 *
	 */
	public void bsppl_cl_ym(MCDate value) {
		setConstDate(offset + 15, $bsppl_cl_ym, value);
	}


	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCNumber bsppl_cl_day() {
		return getConstNumber(offset + 16, $bsppl_cl_day);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bsppl_cl_day(MCNumber value) {
		setConstNumber(offset + 16, $bsppl_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bsppl_cl_day(int value) {
		setConstNumber(offset + 16, $bsppl_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bsppl_cl_day(long value) {
		setConstNumber(offset + 16, $bsppl_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bsppl_cl_day(float value) {
		setConstNumber(offset + 16, $bsppl_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bsppl_cl_day(double value) {
		setConstNumber(offset + 16, $bsppl_cl_day, value);
	}


	/**
	 * Closing year and month 締年月日.<p>
	 *
	 */
	public MCDate bsppl_cl_dt() {
		return getConstDate(offset + 17, $bsppl_cl_dt);
	}

	/**
	 * Closing year and month 締年月日.<p>
	 *
	 */
	public void bsppl_cl_dt(MCDate value) {
		setConstDate(offset + 17, $bsppl_cl_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 18, $amt_p);
	}
	
	public void amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 18, $amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR com_paid_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 19, $com_paid_p);
	}
	
	public void com_paid_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 19, $com_paid_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR last_pay_schd_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 20, $last_pay_schd_amt_p);
	}
	
	public void last_pay_schd_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 20, $last_pay_schd_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR account_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 21, $account_amt_p);
	}
	
	public void account_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 21, $account_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR cash_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 22, $cash_amt_p);
	}
	
	public void cash_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 22, $cash_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR note_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 23, $note_amt_p);
	}
	
	public void note_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 23, $note_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR sw_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 24, $sw_amt_p);
	}
	
	public void sw_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 24, $sw_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR bfw_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 25, $bfw_amt_p);
	}
	
	public void bfw_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 25, $bfw_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR purc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 26, $purc_amt_p);
	}
	
	public void purc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 26, $purc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR purc_ret_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 27, $purc_ret_amt_p);
	}
	
	public void purc_ret_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 27, $purc_ret_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR purc_dscnt_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 28, $purc_dscnt_amt_p);
	}
	
	public void purc_dscnt_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 28, $purc_dscnt_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR setoff_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 29, $setoff_amt_p);
	}
	
	public void setoff_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 29, $setoff_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR setoff_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 30, $setoff_tax_amt_p);
	}
	
	public void setoff_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 30, $setoff_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 31, $tax_amt_p);
	}
	
	public void tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 31, $tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR sw_to_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 32, $sw_to_amt_p);
	}
	
	public void sw_to_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 32, $sw_to_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR schd_pay_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 33, $schd_pay_amt_p);
	}
	
	public void schd_pay_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 33, $schd_pay_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR adv_pay_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 34, $adv_pay_bal_p);
	}
	
	public void adv_pay_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 34, $adv_pay_bal_p, row);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 35, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 35, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 36, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 36, $trd_cur_nm, value);
	}


	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 37, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 37, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 37, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 37, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 37, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 37, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Base unit transaction currency cd. 基準単位取引通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 38, $base_cur_cd);
	}

	/**
	 * Base unit transaction currency cd. 基準単位取引通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 38, $base_cur_cd, value);
	}


	/**
	 * Payment collation exchange rate cd. 支払照合為替レートＣＤ.<p>
	 *
	 */
	public String pay_xrate_cd() {
		return getConstString(offset + 39, $pay_xrate_cd);
	}

	/**
	 * Payment collation exchange rate cd. 支払照合為替レートＣＤ.<p>
	 *
	 */
	public void pay_xrate_cd(String value) {
		setConstString(offset + 39, $pay_xrate_cd, value);
	}


	public mcframe.clientMAUB.MAUBP5390.XrateR pay_xrate_p(){
		return (mcframe.clientMAUB.MAUBP5390.XrateR) getConstInnerRow(offset + 40, $pay_xrate_p);
	}
	
	public void pay_xrate_p(mcframe.clientMAUB.MAUBP5390.XrateR row){
		setConstInnerRow(offset + 40, $pay_xrate_p, row);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 41, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 41, $xrate_cd, value);
	}


	public mcframe.clientMAUB.MAUBP5390.XrateR xrate_p(){
		return (mcframe.clientMAUB.MAUBP5390.XrateR) getConstInnerRow(offset + 42, $xrate_p);
	}
	
	public void xrate_p(mcframe.clientMAUB.MAUBP5390.XrateR row){
		setConstInnerRow(offset + 42, $xrate_p, row);
	}


	/**
	 * With temporary unit price 仮単価あり.<p>
	 *
	 */
	public boolean inc_interim_flg() {
		return getConstBoolean(offset + 43, $inc_interim_flg);
	}

	/**
	 * With temporary unit price 仮単価あり.<p>
	 *
	 */
	public void inc_interim_flg(boolean value) {
		setConstBoolean(offset + 43, $inc_interim_flg, value);
	}


	/**
	 * Purchase temporary unit price closing 仕入仮単価締.<p>
	 *
	 */
	public boolean purc_interim_cl_flg() {
		return getConstBoolean(offset + 44, $purc_interim_cl_flg);
	}

	/**
	 * Purchase temporary unit price closing 仕入仮単価締.<p>
	 *
	 */
	public void purc_interim_cl_flg(boolean value) {
		setConstBoolean(offset + 44, $purc_interim_cl_flg, value);
	}


	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public String pay_chk_no() {
		return getConstString(offset + 45, $pay_chk_no);
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no(String value) {
		setConstString(offset + 45, $pay_chk_no, value);
	}


	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public String pay_chk_mng_no() {
		return getConstString(offset + 46, $pay_chk_mng_no);
	}

	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public void pay_chk_mng_no(String value) {
		setConstString(offset + 46, $pay_chk_mng_no, value);
	}


	/**
	 * Notice rev. number 通知書改訂番号.<p>
	 *
	 */
	public MCNumber pay_ntc_rev() {
		return getConstNumber(offset + 47, $pay_ntc_rev);
	}

	/**
	 * Notice rev. number 通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(MCNumber value) {
		setConstNumber(offset + 47, $pay_ntc_rev, value);
	}

	/**
	 * Notice rev. number 通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(int value) {
		setConstNumber(offset + 47, $pay_ntc_rev, value);
	}

	/**
	 * Notice rev. number 通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(long value) {
		setConstNumber(offset + 47, $pay_ntc_rev, value);
	}

	/**
	 * Notice rev. number 通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(float value) {
		setConstNumber(offset + 47, $pay_ntc_rev, value);
	}

	/**
	 * Notice rev. number 通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(double value) {
		setConstNumber(offset + 47, $pay_ntc_rev, value);
	}


	/**
	 * Uncollated 未照合.<p>
	 *
	 */
	public boolean unchk_flg() {
		return getConstBoolean(offset + 48, $unchk_flg);
	}

	/**
	 * Uncollated 未照合.<p>
	 *
	 */
	public void unchk_flg(boolean value) {
		setConstBoolean(offset + 48, $unchk_flg, value);
	}


	/**
	 * Schedule 予定.<p>
	 *
	 */
	public boolean schd_flg() {
		return getConstBoolean(offset + 49, $schd_flg);
	}

	/**
	 * Schedule 予定.<p>
	 *
	 */
	public void schd_flg(boolean value) {
		setConstBoolean(offset + 49, $schd_flg, value);
	}


	/**
	 * Paid 支払済.<p>
	 *
	 */
	public boolean act_flg() {
		return getConstBoolean(offset + 50, $act_flg);
	}

	/**
	 * Paid 支払済.<p>
	 *
	 */
	public void act_flg(boolean value) {
		setConstBoolean(offset + 50, $act_flg, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 51, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 51, $aprv_no, value);
	}


	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return getConstString(offset + 52, $aprv_sts_typ);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		setConstString(offset + 52, $aprv_sts_typ, value);
	}


	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public String aprv_sts_typ_nm() {
		return getConstString(offset + 53, $aprv_sts_typ_nm);
	}

	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public void aprv_sts_typ_nm(String value) {
		setConstString(offset + 53, $aprv_sts_typ_nm, value);
	}


	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public boolean aprv_rvrs_flg() {
		return getConstBoolean(offset + 54, $aprv_rvrs_flg);
	}

	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public void aprv_rvrs_flg(boolean value) {
		setConstBoolean(offset + 54, $aprv_rvrs_flg, value);
	}


	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 55, $aprv_flg);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 55, $aprv_flg, value);
	}


	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public boolean aprv_upd_flg() {
		return getConstBoolean(offset + 56, $aprv_upd_flg);
	}

	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public void aprv_upd_flg(boolean value) {
		setConstBoolean(offset + 56, $aprv_upd_flg, value);
	}


	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public boolean aprv_can_flg() {
		return getConstBoolean(offset + 57, $aprv_can_flg);
	}

	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public void aprv_can_flg(boolean value) {
		setConstBoolean(offset + 57, $aprv_can_flg, value);
	}


	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public String pay_sts_typ() {
		return getConstString(offset + 58, $pay_sts_typ);
	}

	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public void pay_sts_typ(String value) {
		setConstString(offset + 58, $pay_sts_typ, value);
	}


	/**
	 * Payment status type name 支払状況区分名.<p>
	 *
	 */
	public String pay_sts_typ_nm() {
		return getConstString(offset + 59, $pay_sts_typ_nm);
	}

	/**
	 * Payment status type name 支払状況区分名.<p>
	 *
	 */
	public void pay_sts_typ_nm(String value) {
		setConstString(offset + 59, $pay_sts_typ_nm, value);
	}


	/**
	 * Payment unit tax 支払単位税.<p>
	 *
	 */
	public boolean tax_on_pay_flg() {
		return getConstBoolean(offset + 60, $tax_on_pay_flg);
	}

	/**
	 * Payment unit tax 支払単位税.<p>
	 *
	 */
	public void tax_on_pay_flg(boolean value) {
		setConstBoolean(offset + 60, $tax_on_pay_flg, value);
	}


	/**
	 * Manual マニュアル.<p>
	 *
	 */
	public boolean manual_flg() {
		return getConstBoolean(offset + 61, $manual_flg);
	}

	/**
	 * Manual マニュアル.<p>
	 *
	 */
	public void manual_flg(boolean value) {
		setConstBoolean(offset + 61, $manual_flg, value);
	}


	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public boolean pay_spot_flg() {
		return getConstBoolean(offset + 62, $pay_spot_flg);
	}

	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public void pay_spot_flg(boolean value) {
		setConstBoolean(offset + 62, $pay_spot_flg, value);
	}


	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public boolean batch_pay_schd_cl_flg() {
		return getConstBoolean(offset + 63, $batch_pay_schd_cl_flg);
	}

	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public void batch_pay_schd_cl_flg(boolean value) {
		setConstBoolean(offset + 63, $batch_pay_schd_cl_flg, value);
	}


	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public String pay_schd_d_print_rmrks() {
		return getConstString(offset + 64, $pay_schd_d_print_rmrks);
	}

	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public void pay_schd_d_print_rmrks(String value) {
		setConstString(offset + 64, $pay_schd_d_print_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 65, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 65, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 66, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 66, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 67, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 67, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 68, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 68, $sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 69, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 69, $rts_msg_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR bsppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 70, $bsppl_grp_p);
	}
	
	public void bsppl_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 70, $bsppl_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR psppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 71, $psppl_grp_p);
	}
	
	public void psppl_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 71, $psppl_grp_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 72, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 72, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 73, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 73, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 74, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 74, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 75, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 75, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 76, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 76, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 77, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 77, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 78, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 78, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 79, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 79, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 80, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 80, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 81, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 81, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 82, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 82, $upd_srv_req_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 83, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 83, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 83, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 83, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 83, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 83, $upd_cntr, value);
	}


	/**
	 * Min. recording date 最小計上日.<p>
	 *
	 */
	public MCDate min_ac_dt() {
		return getConstDate(offset + 84, $min_ac_dt);
	}

	/**
	 * Min. recording date 最小計上日.<p>
	 *
	 */
	public void min_ac_dt(MCDate value) {
		setConstDate(offset + 84, $min_ac_dt, value);
	}


	/**
	 * Max. recording date 最大計上日.<p>
	 *
	 */
	public MCDate max_ac_dt() {
		return getConstDate(offset + 85, $max_ac_dt);
	}

	/**
	 * Max. recording date 最大計上日.<p>
	 *
	 */
	public void max_ac_dt(MCDate value) {
		setConstDate(offset + 85, $max_ac_dt, value);
	}


	/**
	 * Not reacquire payment result flg. 支払実績再取得しないＦＬＧ.<p>
	 *
	 */
	public boolean pay_act_not_ref_flg() {
		return getConstBoolean(offset + 86, $pay_act_not_ref_flg);
	}

	/**
	 * Not reacquire payment result flg. 支払実績再取得しないＦＬＧ.<p>
	 *
	 */
	public void pay_act_not_ref_flg(boolean value) {
		setConstBoolean(offset + 86, $pay_act_not_ref_flg, value);
	}


	/**
	 * Cd. of dept. in charge of scheduled payee_before change 支払予定管理先担当部門ＣＤ_変更前.<p>
	 *
	 */
	public String old_bsppl_dpt_cd() {
		return getConstString(offset + 87, $old_bsppl_dpt_cd);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee_before change 支払予定管理先担当部門ＣＤ_変更前.<p>
	 *
	 */
	public void old_bsppl_dpt_cd(String value) {
		setConstString(offset + 87, $old_bsppl_dpt_cd, value);
	}


	/**
	 * Closing date_before change 締年月日_変更前.<p>
	 *
	 */
	public MCDate old_bsppl_cl_dt() {
		return getConstDate(offset + 88, $old_bsppl_cl_dt);
	}

	/**
	 * Closing date_before change 締年月日_変更前.<p>
	 *
	 */
	public void old_bsppl_cl_dt(MCDate value) {
		setConstDate(offset + 88, $old_bsppl_cl_dt, value);
	}


	/**
	 * Last payment schedule amount_before change 前回支払予定額_変更前.<p>
	 *
	 */
	public MCNumber old_last_pay_schd_amt() {
		return getConstNumber(offset + 89, $old_last_pay_schd_amt);
	}

	/**
	 * Last payment schedule amount_before change 前回支払予定額_変更前.<p>
	 *
	 */
	public void old_last_pay_schd_amt(MCNumber value) {
		setConstNumber(offset + 89, $old_last_pay_schd_amt, value);
	}

	/**
	 * Last payment schedule amount_before change 前回支払予定額_変更前.<p>
	 *
	 */
	public void old_last_pay_schd_amt(int value) {
		setConstNumber(offset + 89, $old_last_pay_schd_amt, value);
	}

	/**
	 * Last payment schedule amount_before change 前回支払予定額_変更前.<p>
	 *
	 */
	public void old_last_pay_schd_amt(long value) {
		setConstNumber(offset + 89, $old_last_pay_schd_amt, value);
	}

	/**
	 * Last payment schedule amount_before change 前回支払予定額_変更前.<p>
	 *
	 */
	public void old_last_pay_schd_amt(float value) {
		setConstNumber(offset + 89, $old_last_pay_schd_amt, value);
	}

	/**
	 * Last payment schedule amount_before change 前回支払予定額_変更前.<p>
	 *
	 */
	public void old_last_pay_schd_amt(double value) {
		setConstNumber(offset + 89, $old_last_pay_schd_amt, value);
	}


	/**
	 * Current carry-over amount_before change 今回繰越額_変更前.<p>
	 *
	 */
	public MCNumber old_bfw_amt() {
		return getConstNumber(offset + 90, $old_bfw_amt);
	}

	/**
	 * Current carry-over amount_before change 今回繰越額_変更前.<p>
	 *
	 */
	public void old_bfw_amt(MCNumber value) {
		setConstNumber(offset + 90, $old_bfw_amt, value);
	}

	/**
	 * Current carry-over amount_before change 今回繰越額_変更前.<p>
	 *
	 */
	public void old_bfw_amt(int value) {
		setConstNumber(offset + 90, $old_bfw_amt, value);
	}

	/**
	 * Current carry-over amount_before change 今回繰越額_変更前.<p>
	 *
	 */
	public void old_bfw_amt(long value) {
		setConstNumber(offset + 90, $old_bfw_amt, value);
	}

	/**
	 * Current carry-over amount_before change 今回繰越額_変更前.<p>
	 *
	 */
	public void old_bfw_amt(float value) {
		setConstNumber(offset + 90, $old_bfw_amt, value);
	}

	/**
	 * Current carry-over amount_before change 今回繰越額_変更前.<p>
	 *
	 */
	public void old_bfw_amt(double value) {
		setConstNumber(offset + 90, $old_bfw_amt, value);
	}


	/**
	 * Current payment amount from deposit_before change 今回預金支払額_変更前.<p>
	 *
	 */
	public MCNumber old_account_amt() {
		return getConstNumber(offset + 91, $old_account_amt);
	}

	/**
	 * Current payment amount from deposit_before change 今回預金支払額_変更前.<p>
	 *
	 */
	public void old_account_amt(MCNumber value) {
		setConstNumber(offset + 91, $old_account_amt, value);
	}

	/**
	 * Current payment amount from deposit_before change 今回預金支払額_変更前.<p>
	 *
	 */
	public void old_account_amt(int value) {
		setConstNumber(offset + 91, $old_account_amt, value);
	}

	/**
	 * Current payment amount from deposit_before change 今回預金支払額_変更前.<p>
	 *
	 */
	public void old_account_amt(long value) {
		setConstNumber(offset + 91, $old_account_amt, value);
	}

	/**
	 * Current payment amount from deposit_before change 今回預金支払額_変更前.<p>
	 *
	 */
	public void old_account_amt(float value) {
		setConstNumber(offset + 91, $old_account_amt, value);
	}

	/**
	 * Current payment amount from deposit_before change 今回預金支払額_変更前.<p>
	 *
	 */
	public void old_account_amt(double value) {
		setConstNumber(offset + 91, $old_account_amt, value);
	}


	/**
	 * Current cash payment amount_before change 今回現金支払額_変更前.<p>
	 *
	 */
	public MCNumber old_cash_amt() {
		return getConstNumber(offset + 92, $old_cash_amt);
	}

	/**
	 * Current cash payment amount_before change 今回現金支払額_変更前.<p>
	 *
	 */
	public void old_cash_amt(MCNumber value) {
		setConstNumber(offset + 92, $old_cash_amt, value);
	}

	/**
	 * Current cash payment amount_before change 今回現金支払額_変更前.<p>
	 *
	 */
	public void old_cash_amt(int value) {
		setConstNumber(offset + 92, $old_cash_amt, value);
	}

	/**
	 * Current cash payment amount_before change 今回現金支払額_変更前.<p>
	 *
	 */
	public void old_cash_amt(long value) {
		setConstNumber(offset + 92, $old_cash_amt, value);
	}

	/**
	 * Current cash payment amount_before change 今回現金支払額_変更前.<p>
	 *
	 */
	public void old_cash_amt(float value) {
		setConstNumber(offset + 92, $old_cash_amt, value);
	}

	/**
	 * Current cash payment amount_before change 今回現金支払額_変更前.<p>
	 *
	 */
	public void old_cash_amt(double value) {
		setConstNumber(offset + 92, $old_cash_amt, value);
	}


	/**
	 * Current notes payment amount_before change 今回手形支払額_変更前.<p>
	 *
	 */
	public MCNumber old_note_amt() {
		return getConstNumber(offset + 93, $old_note_amt);
	}

	/**
	 * Current notes payment amount_before change 今回手形支払額_変更前.<p>
	 *
	 */
	public void old_note_amt(MCNumber value) {
		setConstNumber(offset + 93, $old_note_amt, value);
	}

	/**
	 * Current notes payment amount_before change 今回手形支払額_変更前.<p>
	 *
	 */
	public void old_note_amt(int value) {
		setConstNumber(offset + 93, $old_note_amt, value);
	}

	/**
	 * Current notes payment amount_before change 今回手形支払額_変更前.<p>
	 *
	 */
	public void old_note_amt(long value) {
		setConstNumber(offset + 93, $old_note_amt, value);
	}

	/**
	 * Current notes payment amount_before change 今回手形支払額_変更前.<p>
	 *
	 */
	public void old_note_amt(float value) {
		setConstNumber(offset + 93, $old_note_amt, value);
	}

	/**
	 * Current notes payment amount_before change 今回手形支払額_変更前.<p>
	 *
	 */
	public void old_note_amt(double value) {
		setConstNumber(offset + 93, $old_note_amt, value);
	}


	/**
	 * Current offset payment amount_before change 今回相殺支払額_変更前.<p>
	 *
	 */
	public MCNumber old_setoff_amt() {
		return getConstNumber(offset + 94, $old_setoff_amt);
	}

	/**
	 * Current offset payment amount_before change 今回相殺支払額_変更前.<p>
	 *
	 */
	public void old_setoff_amt(MCNumber value) {
		setConstNumber(offset + 94, $old_setoff_amt, value);
	}

	/**
	 * Current offset payment amount_before change 今回相殺支払額_変更前.<p>
	 *
	 */
	public void old_setoff_amt(int value) {
		setConstNumber(offset + 94, $old_setoff_amt, value);
	}

	/**
	 * Current offset payment amount_before change 今回相殺支払額_変更前.<p>
	 *
	 */
	public void old_setoff_amt(long value) {
		setConstNumber(offset + 94, $old_setoff_amt, value);
	}

	/**
	 * Current offset payment amount_before change 今回相殺支払額_変更前.<p>
	 *
	 */
	public void old_setoff_amt(float value) {
		setConstNumber(offset + 94, $old_setoff_amt, value);
	}

	/**
	 * Current offset payment amount_before change 今回相殺支払額_変更前.<p>
	 *
	 */
	public void old_setoff_amt(double value) {
		setConstNumber(offset + 94, $old_setoff_amt, value);
	}


	/**
	 * Current scheduled payment amount_before change 今回支払予定額_変更前.<p>
	 *
	 */
	public MCNumber old_schd_pay_amt() {
		return getConstNumber(offset + 95, $old_schd_pay_amt);
	}

	/**
	 * Current scheduled payment amount_before change 今回支払予定額_変更前.<p>
	 *
	 */
	public void old_schd_pay_amt(MCNumber value) {
		setConstNumber(offset + 95, $old_schd_pay_amt, value);
	}

	/**
	 * Current scheduled payment amount_before change 今回支払予定額_変更前.<p>
	 *
	 */
	public void old_schd_pay_amt(int value) {
		setConstNumber(offset + 95, $old_schd_pay_amt, value);
	}

	/**
	 * Current scheduled payment amount_before change 今回支払予定額_変更前.<p>
	 *
	 */
	public void old_schd_pay_amt(long value) {
		setConstNumber(offset + 95, $old_schd_pay_amt, value);
	}

	/**
	 * Current scheduled payment amount_before change 今回支払予定額_変更前.<p>
	 *
	 */
	public void old_schd_pay_amt(float value) {
		setConstNumber(offset + 95, $old_schd_pay_amt, value);
	}

	/**
	 * Current scheduled payment amount_before change 今回支払予定額_変更前.<p>
	 *
	 */
	public void old_schd_pay_amt(double value) {
		setConstNumber(offset + 95, $old_schd_pay_amt, value);
	}


	/**
	 * Payment received result input target 前受金実績登録対象.<p>
	 *
	 */
	public boolean adv_pay_act_tgt_flg() {
		return getConstBoolean(offset + 96, $adv_pay_act_tgt_flg);
	}

	/**
	 * Payment received result input target 前受金実績登録対象.<p>
	 *
	 */
	public void adv_pay_act_tgt_flg(boolean value) {
		setConstBoolean(offset + 96, $adv_pay_act_tgt_flg, value);
	}


	/**
	 * Exchange rate base date 為替レート基準日.<p>
	 *
	 */
	public MCDate xrate_base_dt() {
		return getConstDate(offset + 97, $xrate_base_dt);
	}

	/**
	 * Exchange rate base date 為替レート基準日.<p>
	 *
	 */
	public void xrate_base_dt(MCDate value) {
		setConstDate(offset + 97, $xrate_base_dt, value);
	}


	public String getString(String name) {
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($pay_xrate_cd.equalsIgnoreCase(name)) {
			return pay_xrate_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
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
		if ($old_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return old_bsppl_dpt_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			return bsppl_cl_day();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			return pay_ntc_rev();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($old_last_pay_schd_amt.equalsIgnoreCase(name)) {
			return old_last_pay_schd_amt();
		}
		if ($old_bfw_amt.equalsIgnoreCase(name)) {
			return old_bfw_amt();
		}
		if ($old_account_amt.equalsIgnoreCase(name)) {
			return old_account_amt();
		}
		if ($old_cash_amt.equalsIgnoreCase(name)) {
			return old_cash_amt();
		}
		if ($old_note_amt.equalsIgnoreCase(name)) {
			return old_note_amt();
		}
		if ($old_setoff_amt.equalsIgnoreCase(name)) {
			return old_setoff_amt();
		}
		if ($old_schd_pay_amt.equalsIgnoreCase(name)) {
			return old_schd_pay_amt();
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
		if ($min_ac_dt.equalsIgnoreCase(name)) {
			return min_ac_dt();
		}
		if ($max_ac_dt.equalsIgnoreCase(name)) {
			return max_ac_dt();
		}
		if ($old_bsppl_cl_dt.equalsIgnoreCase(name)) {
			return old_bsppl_cl_dt();
		}
		if ($xrate_base_dt.equalsIgnoreCase(name)) {
			return xrate_base_dt();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($inc_interim_flg.equalsIgnoreCase(name)) {
			return inc_interim_flg();
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			return purc_interim_cl_flg();
		}
		if ($unchk_flg.equalsIgnoreCase(name)) {
			return unchk_flg();
		}
		if ($schd_flg.equalsIgnoreCase(name)) {
			return schd_flg();
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
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
		if ($tax_on_pay_flg.equalsIgnoreCase(name)) {
			return tax_on_pay_flg();
		}
		if ($manual_flg.equalsIgnoreCase(name)) {
			return manual_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			return batch_pay_schd_cl_flg();
		}
		if ($pay_act_not_ref_flg.equalsIgnoreCase(name)) {
			return pay_act_not_ref_flg();
		}
		if ($adv_pay_act_tgt_flg.equalsIgnoreCase(name)) {
			return adv_pay_act_tgt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($pay_xrate_cd.equalsIgnoreCase(name)) {
			return pay_xrate_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
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
		if ($old_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return old_bsppl_dpt_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			return bsppl_cl_day();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			return pay_ntc_rev();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($old_last_pay_schd_amt.equalsIgnoreCase(name)) {
			return old_last_pay_schd_amt();
		}
		if ($old_bfw_amt.equalsIgnoreCase(name)) {
			return old_bfw_amt();
		}
		if ($old_account_amt.equalsIgnoreCase(name)) {
			return old_account_amt();
		}
		if ($old_cash_amt.equalsIgnoreCase(name)) {
			return old_cash_amt();
		}
		if ($old_note_amt.equalsIgnoreCase(name)) {
			return old_note_amt();
		}
		if ($old_setoff_amt.equalsIgnoreCase(name)) {
			return old_setoff_amt();
		}
		if ($old_schd_pay_amt.equalsIgnoreCase(name)) {
			return old_schd_pay_amt();
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
		if ($min_ac_dt.equalsIgnoreCase(name)) {
			return min_ac_dt();
		}
		if ($max_ac_dt.equalsIgnoreCase(name)) {
			return max_ac_dt();
		}
		if ($old_bsppl_cl_dt.equalsIgnoreCase(name)) {
			return old_bsppl_cl_dt();
		}
		if ($xrate_base_dt.equalsIgnoreCase(name)) {
			return xrate_base_dt();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($inc_interim_flg.equalsIgnoreCase(name)) {
			return inc_interim_flg();
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			return purc_interim_cl_flg();
		}
		if ($unchk_flg.equalsIgnoreCase(name)) {
			return unchk_flg();
		}
		if ($schd_flg.equalsIgnoreCase(name)) {
			return schd_flg();
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
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
		if ($tax_on_pay_flg.equalsIgnoreCase(name)) {
			return tax_on_pay_flg();
		}
		if ($manual_flg.equalsIgnoreCase(name)) {
			return manual_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			return batch_pay_schd_cl_flg();
		}
		if ($pay_act_not_ref_flg.equalsIgnoreCase(name)) {
			return pay_act_not_ref_flg();
		}
		if ($adv_pay_act_tgt_flg.equalsIgnoreCase(name)) {
			return adv_pay_act_tgt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			psppl_nm(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($pay_xrate_cd.equalsIgnoreCase(name)) {
			pay_xrate_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
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
		if ($old_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			old_bsppl_dpt_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($old_last_pay_schd_amt.equalsIgnoreCase(name)) {
			old_last_pay_schd_amt(value);
			return;
		}
		if ($old_bfw_amt.equalsIgnoreCase(name)) {
			old_bfw_amt(value);
			return;
		}
		if ($old_account_amt.equalsIgnoreCase(name)) {
			old_account_amt(value);
			return;
		}
		if ($old_cash_amt.equalsIgnoreCase(name)) {
			old_cash_amt(value);
			return;
		}
		if ($old_note_amt.equalsIgnoreCase(name)) {
			old_note_amt(value);
			return;
		}
		if ($old_setoff_amt.equalsIgnoreCase(name)) {
			old_setoff_amt(value);
			return;
		}
		if ($old_schd_pay_amt.equalsIgnoreCase(name)) {
			old_schd_pay_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($old_last_pay_schd_amt.equalsIgnoreCase(name)) {
			old_last_pay_schd_amt(value);
			return;
		}
		if ($old_bfw_amt.equalsIgnoreCase(name)) {
			old_bfw_amt(value);
			return;
		}
		if ($old_account_amt.equalsIgnoreCase(name)) {
			old_account_amt(value);
			return;
		}
		if ($old_cash_amt.equalsIgnoreCase(name)) {
			old_cash_amt(value);
			return;
		}
		if ($old_note_amt.equalsIgnoreCase(name)) {
			old_note_amt(value);
			return;
		}
		if ($old_setoff_amt.equalsIgnoreCase(name)) {
			old_setoff_amt(value);
			return;
		}
		if ($old_schd_pay_amt.equalsIgnoreCase(name)) {
			old_schd_pay_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($old_last_pay_schd_amt.equalsIgnoreCase(name)) {
			old_last_pay_schd_amt(value);
			return;
		}
		if ($old_bfw_amt.equalsIgnoreCase(name)) {
			old_bfw_amt(value);
			return;
		}
		if ($old_account_amt.equalsIgnoreCase(name)) {
			old_account_amt(value);
			return;
		}
		if ($old_cash_amt.equalsIgnoreCase(name)) {
			old_cash_amt(value);
			return;
		}
		if ($old_note_amt.equalsIgnoreCase(name)) {
			old_note_amt(value);
			return;
		}
		if ($old_setoff_amt.equalsIgnoreCase(name)) {
			old_setoff_amt(value);
			return;
		}
		if ($old_schd_pay_amt.equalsIgnoreCase(name)) {
			old_schd_pay_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($old_last_pay_schd_amt.equalsIgnoreCase(name)) {
			old_last_pay_schd_amt(value);
			return;
		}
		if ($old_bfw_amt.equalsIgnoreCase(name)) {
			old_bfw_amt(value);
			return;
		}
		if ($old_account_amt.equalsIgnoreCase(name)) {
			old_account_amt(value);
			return;
		}
		if ($old_cash_amt.equalsIgnoreCase(name)) {
			old_cash_amt(value);
			return;
		}
		if ($old_note_amt.equalsIgnoreCase(name)) {
			old_note_amt(value);
			return;
		}
		if ($old_setoff_amt.equalsIgnoreCase(name)) {
			old_setoff_amt(value);
			return;
		}
		if ($old_schd_pay_amt.equalsIgnoreCase(name)) {
			old_schd_pay_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($old_last_pay_schd_amt.equalsIgnoreCase(name)) {
			old_last_pay_schd_amt(value);
			return;
		}
		if ($old_bfw_amt.equalsIgnoreCase(name)) {
			old_bfw_amt(value);
			return;
		}
		if ($old_account_amt.equalsIgnoreCase(name)) {
			old_account_amt(value);
			return;
		}
		if ($old_cash_amt.equalsIgnoreCase(name)) {
			old_cash_amt(value);
			return;
		}
		if ($old_note_amt.equalsIgnoreCase(name)) {
			old_note_amt(value);
			return;
		}
		if ($old_setoff_amt.equalsIgnoreCase(name)) {
			old_setoff_amt(value);
			return;
		}
		if ($old_schd_pay_amt.equalsIgnoreCase(name)) {
			old_schd_pay_amt(value);
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
		if ($min_ac_dt.equalsIgnoreCase(name)) {
			min_ac_dt(value);
			return;
		}
		if ($max_ac_dt.equalsIgnoreCase(name)) {
			max_ac_dt(value);
			return;
		}
		if ($old_bsppl_cl_dt.equalsIgnoreCase(name)) {
			old_bsppl_cl_dt(value);
			return;
		}
		if ($xrate_base_dt.equalsIgnoreCase(name)) {
			xrate_base_dt(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($inc_interim_flg.equalsIgnoreCase(name)) {
			inc_interim_flg(value);
			return;
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			purc_interim_cl_flg(value);
			return;
		}
		if ($unchk_flg.equalsIgnoreCase(name)) {
			unchk_flg(value);
			return;
		}
		if ($schd_flg.equalsIgnoreCase(name)) {
			schd_flg(value);
			return;
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
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
		if ($tax_on_pay_flg.equalsIgnoreCase(name)) {
			tax_on_pay_flg(value);
			return;
		}
		if ($manual_flg.equalsIgnoreCase(name)) {
			manual_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			batch_pay_schd_cl_flg(value);
			return;
		}
		if ($pay_act_not_ref_flg.equalsIgnoreCase(name)) {
			pay_act_not_ref_flg(value);
			return;
		}
		if ($adv_pay_act_tgt_flg.equalsIgnoreCase(name)) {
			adv_pay_act_tgt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			psppl_nm(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($pay_xrate_cd.equalsIgnoreCase(name)) {
			pay_xrate_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
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
		if ($old_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			old_bsppl_dpt_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($old_last_pay_schd_amt.equalsIgnoreCase(name)) {
			old_last_pay_schd_amt(value);
			return;
		}
		if ($old_bfw_amt.equalsIgnoreCase(name)) {
			old_bfw_amt(value);
			return;
		}
		if ($old_account_amt.equalsIgnoreCase(name)) {
			old_account_amt(value);
			return;
		}
		if ($old_cash_amt.equalsIgnoreCase(name)) {
			old_cash_amt(value);
			return;
		}
		if ($old_note_amt.equalsIgnoreCase(name)) {
			old_note_amt(value);
			return;
		}
		if ($old_setoff_amt.equalsIgnoreCase(name)) {
			old_setoff_amt(value);
			return;
		}
		if ($old_schd_pay_amt.equalsIgnoreCase(name)) {
			old_schd_pay_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($old_last_pay_schd_amt.equalsIgnoreCase(name)) {
			old_last_pay_schd_amt(value);
			return;
		}
		if ($old_bfw_amt.equalsIgnoreCase(name)) {
			old_bfw_amt(value);
			return;
		}
		if ($old_account_amt.equalsIgnoreCase(name)) {
			old_account_amt(value);
			return;
		}
		if ($old_cash_amt.equalsIgnoreCase(name)) {
			old_cash_amt(value);
			return;
		}
		if ($old_note_amt.equalsIgnoreCase(name)) {
			old_note_amt(value);
			return;
		}
		if ($old_setoff_amt.equalsIgnoreCase(name)) {
			old_setoff_amt(value);
			return;
		}
		if ($old_schd_pay_amt.equalsIgnoreCase(name)) {
			old_schd_pay_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($old_last_pay_schd_amt.equalsIgnoreCase(name)) {
			old_last_pay_schd_amt(value);
			return;
		}
		if ($old_bfw_amt.equalsIgnoreCase(name)) {
			old_bfw_amt(value);
			return;
		}
		if ($old_account_amt.equalsIgnoreCase(name)) {
			old_account_amt(value);
			return;
		}
		if ($old_cash_amt.equalsIgnoreCase(name)) {
			old_cash_amt(value);
			return;
		}
		if ($old_note_amt.equalsIgnoreCase(name)) {
			old_note_amt(value);
			return;
		}
		if ($old_setoff_amt.equalsIgnoreCase(name)) {
			old_setoff_amt(value);
			return;
		}
		if ($old_schd_pay_amt.equalsIgnoreCase(name)) {
			old_schd_pay_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($old_last_pay_schd_amt.equalsIgnoreCase(name)) {
			old_last_pay_schd_amt(value);
			return;
		}
		if ($old_bfw_amt.equalsIgnoreCase(name)) {
			old_bfw_amt(value);
			return;
		}
		if ($old_account_amt.equalsIgnoreCase(name)) {
			old_account_amt(value);
			return;
		}
		if ($old_cash_amt.equalsIgnoreCase(name)) {
			old_cash_amt(value);
			return;
		}
		if ($old_note_amt.equalsIgnoreCase(name)) {
			old_note_amt(value);
			return;
		}
		if ($old_setoff_amt.equalsIgnoreCase(name)) {
			old_setoff_amt(value);
			return;
		}
		if ($old_schd_pay_amt.equalsIgnoreCase(name)) {
			old_schd_pay_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			bsppl_cl_day(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($old_last_pay_schd_amt.equalsIgnoreCase(name)) {
			old_last_pay_schd_amt(value);
			return;
		}
		if ($old_bfw_amt.equalsIgnoreCase(name)) {
			old_bfw_amt(value);
			return;
		}
		if ($old_account_amt.equalsIgnoreCase(name)) {
			old_account_amt(value);
			return;
		}
		if ($old_cash_amt.equalsIgnoreCase(name)) {
			old_cash_amt(value);
			return;
		}
		if ($old_note_amt.equalsIgnoreCase(name)) {
			old_note_amt(value);
			return;
		}
		if ($old_setoff_amt.equalsIgnoreCase(name)) {
			old_setoff_amt(value);
			return;
		}
		if ($old_schd_pay_amt.equalsIgnoreCase(name)) {
			old_schd_pay_amt(value);
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
		if ($min_ac_dt.equalsIgnoreCase(name)) {
			min_ac_dt(value);
			return;
		}
		if ($max_ac_dt.equalsIgnoreCase(name)) {
			max_ac_dt(value);
			return;
		}
		if ($old_bsppl_cl_dt.equalsIgnoreCase(name)) {
			old_bsppl_cl_dt(value);
			return;
		}
		if ($xrate_base_dt.equalsIgnoreCase(name)) {
			xrate_base_dt(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($inc_interim_flg.equalsIgnoreCase(name)) {
			inc_interim_flg(value);
			return;
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			purc_interim_cl_flg(value);
			return;
		}
		if ($unchk_flg.equalsIgnoreCase(name)) {
			unchk_flg(value);
			return;
		}
		if ($schd_flg.equalsIgnoreCase(name)) {
			schd_flg(value);
			return;
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
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
		if ($tax_on_pay_flg.equalsIgnoreCase(name)) {
			tax_on_pay_flg(value);
			return;
		}
		if ($manual_flg.equalsIgnoreCase(name)) {
			manual_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			batch_pay_schd_cl_flg(value);
			return;
		}
		if ($pay_act_not_ref_flg.equalsIgnoreCase(name)) {
			pay_act_not_ref_flg(value);
			return;
		}
		if ($adv_pay_act_tgt_flg.equalsIgnoreCase(name)) {
			adv_pay_act_tgt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($bsppl_usr_dpt_p.equalsIgnoreCase(name)) {
			return bsppl_usr_dpt_p();
		}
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			return wrk_no_p();
		}
		if ($amt_p.equalsIgnoreCase(name)) {
			return amt_p();
		}
		if ($com_paid_p.equalsIgnoreCase(name)) {
			return com_paid_p();
		}
		if ($last_pay_schd_amt_p.equalsIgnoreCase(name)) {
			return last_pay_schd_amt_p();
		}
		if ($account_amt_p.equalsIgnoreCase(name)) {
			return account_amt_p();
		}
		if ($cash_amt_p.equalsIgnoreCase(name)) {
			return cash_amt_p();
		}
		if ($note_amt_p.equalsIgnoreCase(name)) {
			return note_amt_p();
		}
		if ($sw_amt_p.equalsIgnoreCase(name)) {
			return sw_amt_p();
		}
		if ($bfw_amt_p.equalsIgnoreCase(name)) {
			return bfw_amt_p();
		}
		if ($purc_amt_p.equalsIgnoreCase(name)) {
			return purc_amt_p();
		}
		if ($purc_ret_amt_p.equalsIgnoreCase(name)) {
			return purc_ret_amt_p();
		}
		if ($purc_dscnt_amt_p.equalsIgnoreCase(name)) {
			return purc_dscnt_amt_p();
		}
		if ($setoff_amt_p.equalsIgnoreCase(name)) {
			return setoff_amt_p();
		}
		if ($setoff_tax_amt_p.equalsIgnoreCase(name)) {
			return setoff_tax_amt_p();
		}
		if ($tax_amt_p.equalsIgnoreCase(name)) {
			return tax_amt_p();
		}
		if ($sw_to_amt_p.equalsIgnoreCase(name)) {
			return sw_to_amt_p();
		}
		if ($schd_pay_amt_p.equalsIgnoreCase(name)) {
			return schd_pay_amt_p();
		}
		if ($adv_pay_bal_p.equalsIgnoreCase(name)) {
			return adv_pay_bal_p();
		}
		if ($pay_xrate_p.equalsIgnoreCase(name)) {
			return pay_xrate_p();
		}
		if ($xrate_p.equalsIgnoreCase(name)) {
			return xrate_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
		}
		if ($bsppl_grp_p.equalsIgnoreCase(name)) {
			return bsppl_grp_p();
		}
		if ($psppl_grp_p.equalsIgnoreCase(name)) {
			return psppl_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($bsppl_usr_dpt_p.equalsIgnoreCase(name)) {
			bsppl_usr_dpt_p(
				((MCContainerMeta) bsppl_usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			wrk_no_p(
				((MCContainerMeta) wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5010.WrkNoR.class, value)
			);
			return;
		}
		if ($amt_p.equalsIgnoreCase(name)) {
			amt_p(
				((MCContainerMeta) amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($com_paid_p.equalsIgnoreCase(name)) {
			com_paid_p(
				((MCContainerMeta) com_paid_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($last_pay_schd_amt_p.equalsIgnoreCase(name)) {
			last_pay_schd_amt_p(
				((MCContainerMeta) last_pay_schd_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($account_amt_p.equalsIgnoreCase(name)) {
			account_amt_p(
				((MCContainerMeta) account_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($cash_amt_p.equalsIgnoreCase(name)) {
			cash_amt_p(
				((MCContainerMeta) cash_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($note_amt_p.equalsIgnoreCase(name)) {
			note_amt_p(
				((MCContainerMeta) note_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($sw_amt_p.equalsIgnoreCase(name)) {
			sw_amt_p(
				((MCContainerMeta) sw_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($bfw_amt_p.equalsIgnoreCase(name)) {
			bfw_amt_p(
				((MCContainerMeta) bfw_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($purc_amt_p.equalsIgnoreCase(name)) {
			purc_amt_p(
				((MCContainerMeta) purc_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($purc_ret_amt_p.equalsIgnoreCase(name)) {
			purc_ret_amt_p(
				((MCContainerMeta) purc_ret_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($purc_dscnt_amt_p.equalsIgnoreCase(name)) {
			purc_dscnt_amt_p(
				((MCContainerMeta) purc_dscnt_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($setoff_amt_p.equalsIgnoreCase(name)) {
			setoff_amt_p(
				((MCContainerMeta) setoff_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($setoff_tax_amt_p.equalsIgnoreCase(name)) {
			setoff_tax_amt_p(
				((MCContainerMeta) setoff_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($tax_amt_p.equalsIgnoreCase(name)) {
			tax_amt_p(
				((MCContainerMeta) tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($sw_to_amt_p.equalsIgnoreCase(name)) {
			sw_to_amt_p(
				((MCContainerMeta) sw_to_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($schd_pay_amt_p.equalsIgnoreCase(name)) {
			schd_pay_amt_p(
				((MCContainerMeta) schd_pay_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($adv_pay_bal_p.equalsIgnoreCase(name)) {
			adv_pay_bal_p(
				((MCContainerMeta) adv_pay_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($pay_xrate_p.equalsIgnoreCase(name)) {
			pay_xrate_p(
				((MCContainerMeta) pay_xrate_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5390.XrateR.class, value)
			);
			return;
		}
		if ($xrate_p.equalsIgnoreCase(name)) {
			xrate_p(
				((MCContainerMeta) xrate_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5390.XrateR.class, value)
			);
			return;
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
			);
			return;
		}
		if ($bsppl_grp_p.equalsIgnoreCase(name)) {
			bsppl_grp_p(
				((MCContainerMeta) bsppl_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		if ($psppl_grp_p.equalsIgnoreCase(name)) {
			psppl_grp_p(
				((MCContainerMeta) psppl_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
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
		return bsppl_usr_dpt_p().usr_cd();
	}

	/**
	 * Scheduled payee PIC cd. 支払予定管理先担当者ＣＤ.<p>
	 *
	 */
	public void bsppl_usr_cd(String value) {
		bsppl_usr_dpt_p().usr_cd(value);
	}

	/**
	 * Scheduled payee PIC name 支払予定管理先担当者名.<p>
	 *
	 */
	public String bsppl_usr_nm() {
		return bsppl_usr_dpt_p().usr_nm();
	}

	/**
	 * Scheduled payee PIC name 支払予定管理先担当者名.<p>
	 *
	 */
	public void bsppl_usr_nm(String value) {
		bsppl_usr_dpt_p().usr_nm(value);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return bsppl_usr_dpt_p().dpt_cd();
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		bsppl_usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public String bsppl_dpt_nm() {
		return bsppl_usr_dpt_p().dpt_nm();
	}

	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public void bsppl_dpt_nm(String value) {
		bsppl_usr_dpt_p().dpt_nm(value);
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
	public MCNumber amt() {
		return amt_p().amt();
	}

	/**
	 * AP amount 買掛金額.<p>
	 *
	 */
	public void amt(MCNumber value) {
		amt_p().amt(value);
	}

	/**
	 * AP amount 買掛金額.<p>
	 *
	 */
	public void amt(int value) {
		amt_p().amt(value);
	}

	/**
	 * AP amount 買掛金額.<p>
	 *
	 */
	public void amt(long value) {
		amt_p().amt(value);
	}

	/**
	 * AP amount 買掛金額.<p>
	 *
	 */
	public void amt(float value) {
		amt_p().amt(value);
	}

	/**
	 * AP amount 買掛金額.<p>
	 *
	 */
	public void amt(double value) {
		amt_p().amt(value);
	}

	/**
	 * Total fee 手数料計.<p>
	 *
	 */
	public MCNumber com_paid() {
		return com_paid_p().amt();
	}

	/**
	 * Total fee 手数料計.<p>
	 *
	 */
	public void com_paid(MCNumber value) {
		com_paid_p().amt(value);
	}

	/**
	 * Total fee 手数料計.<p>
	 *
	 */
	public void com_paid(int value) {
		com_paid_p().amt(value);
	}

	/**
	 * Total fee 手数料計.<p>
	 *
	 */
	public void com_paid(long value) {
		com_paid_p().amt(value);
	}

	/**
	 * Total fee 手数料計.<p>
	 *
	 */
	public void com_paid(float value) {
		com_paid_p().amt(value);
	}

	/**
	 * Total fee 手数料計.<p>
	 *
	 */
	public void com_paid(double value) {
		com_paid_p().amt(value);
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public MCNumber com_paid_tax_amt() {
		return com_paid_p().tax_amt();
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public void com_paid_tax_amt(MCNumber value) {
		com_paid_p().tax_amt(value);
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public void com_paid_tax_amt(int value) {
		com_paid_p().tax_amt(value);
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public void com_paid_tax_amt(long value) {
		com_paid_p().tax_amt(value);
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public void com_paid_tax_amt(float value) {
		com_paid_p().tax_amt(value);
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public void com_paid_tax_amt(double value) {
		com_paid_p().tax_amt(value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public MCNumber last_pay_schd_amt() {
		return last_pay_schd_amt_p().amt();
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(MCNumber value) {
		last_pay_schd_amt_p().amt(value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(int value) {
		last_pay_schd_amt_p().amt(value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(long value) {
		last_pay_schd_amt_p().amt(value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(float value) {
		last_pay_schd_amt_p().amt(value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(double value) {
		last_pay_schd_amt_p().amt(value);
	}

	/**
	 * Current payment amount from deposit 今回預金支払額.<p>
	 *
	 */
	public MCNumber account_amt() {
		return account_amt_p().amt();
	}

	/**
	 * Current payment amount from deposit 今回預金支払額.<p>
	 *
	 */
	public void account_amt(MCNumber value) {
		account_amt_p().amt(value);
	}

	/**
	 * Current payment amount from deposit 今回預金支払額.<p>
	 *
	 */
	public void account_amt(int value) {
		account_amt_p().amt(value);
	}

	/**
	 * Current payment amount from deposit 今回預金支払額.<p>
	 *
	 */
	public void account_amt(long value) {
		account_amt_p().amt(value);
	}

	/**
	 * Current payment amount from deposit 今回預金支払額.<p>
	 *
	 */
	public void account_amt(float value) {
		account_amt_p().amt(value);
	}

	/**
	 * Current payment amount from deposit 今回預金支払額.<p>
	 *
	 */
	public void account_amt(double value) {
		account_amt_p().amt(value);
	}

	/**
	 * Current cash payment amount 今回現金支払額.<p>
	 *
	 */
	public MCNumber cash_amt() {
		return cash_amt_p().amt();
	}

	/**
	 * Current cash payment amount 今回現金支払額.<p>
	 *
	 */
	public void cash_amt(MCNumber value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Current cash payment amount 今回現金支払額.<p>
	 *
	 */
	public void cash_amt(int value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Current cash payment amount 今回現金支払額.<p>
	 *
	 */
	public void cash_amt(long value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Current cash payment amount 今回現金支払額.<p>
	 *
	 */
	public void cash_amt(float value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Current cash payment amount 今回現金支払額.<p>
	 *
	 */
	public void cash_amt(double value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Current notes payment amount 今回手形支払額.<p>
	 *
	 */
	public MCNumber note_amt() {
		return note_amt_p().amt();
	}

	/**
	 * Current notes payment amount 今回手形支払額.<p>
	 *
	 */
	public void note_amt(MCNumber value) {
		note_amt_p().amt(value);
	}

	/**
	 * Current notes payment amount 今回手形支払額.<p>
	 *
	 */
	public void note_amt(int value) {
		note_amt_p().amt(value);
	}

	/**
	 * Current notes payment amount 今回手形支払額.<p>
	 *
	 */
	public void note_amt(long value) {
		note_amt_p().amt(value);
	}

	/**
	 * Current notes payment amount 今回手形支払額.<p>
	 *
	 */
	public void note_amt(float value) {
		note_amt_p().amt(value);
	}

	/**
	 * Current notes payment amount 今回手形支払額.<p>
	 *
	 */
	public void note_amt(double value) {
		note_amt_p().amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return sw_amt_p().amt();
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		sw_amt_p().amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(int value) {
		sw_amt_p().amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(long value) {
		sw_amt_p().amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(float value) {
		sw_amt_p().amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(double value) {
		sw_amt_p().amt(value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public MCNumber bfw_amt() {
		return bfw_amt_p().amt();
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(MCNumber value) {
		bfw_amt_p().amt(value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(int value) {
		bfw_amt_p().amt(value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(long value) {
		bfw_amt_p().amt(value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(float value) {
		bfw_amt_p().amt(value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(double value) {
		bfw_amt_p().amt(value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public MCNumber purc_amt() {
		return purc_amt_p().amt();
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(MCNumber value) {
		purc_amt_p().amt(value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(int value) {
		purc_amt_p().amt(value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(long value) {
		purc_amt_p().amt(value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(float value) {
		purc_amt_p().amt(value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(double value) {
		purc_amt_p().amt(value);
	}

	/**
	 * Current purchase return amount 今回仕入返品額.<p>
	 *
	 */
	public MCNumber purc_ret_amt() {
		return purc_ret_amt_p().amt();
	}

	/**
	 * Current purchase return amount 今回仕入返品額.<p>
	 *
	 */
	public void purc_ret_amt(MCNumber value) {
		purc_ret_amt_p().amt(value);
	}

	/**
	 * Current purchase return amount 今回仕入返品額.<p>
	 *
	 */
	public void purc_ret_amt(int value) {
		purc_ret_amt_p().amt(value);
	}

	/**
	 * Current purchase return amount 今回仕入返品額.<p>
	 *
	 */
	public void purc_ret_amt(long value) {
		purc_ret_amt_p().amt(value);
	}

	/**
	 * Current purchase return amount 今回仕入返品額.<p>
	 *
	 */
	public void purc_ret_amt(float value) {
		purc_ret_amt_p().amt(value);
	}

	/**
	 * Current purchase return amount 今回仕入返品額.<p>
	 *
	 */
	public void purc_ret_amt(double value) {
		purc_ret_amt_p().amt(value);
	}

	/**
	 * Current purchase discount amount 今回仕入値引額.<p>
	 *
	 */
	public MCNumber purc_dscnt_amt() {
		return purc_dscnt_amt_p().amt();
	}

	/**
	 * Current purchase discount amount 今回仕入値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(MCNumber value) {
		purc_dscnt_amt_p().amt(value);
	}

	/**
	 * Current purchase discount amount 今回仕入値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(int value) {
		purc_dscnt_amt_p().amt(value);
	}

	/**
	 * Current purchase discount amount 今回仕入値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(long value) {
		purc_dscnt_amt_p().amt(value);
	}

	/**
	 * Current purchase discount amount 今回仕入値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(float value) {
		purc_dscnt_amt_p().amt(value);
	}

	/**
	 * Current purchase discount amount 今回仕入値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(double value) {
		purc_dscnt_amt_p().amt(value);
	}

	/**
	 * Current offset payment amount 今回相殺支払額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return setoff_amt_p().amt();
	}

	/**
	 * Current offset payment amount 今回相殺支払額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Current offset payment amount 今回相殺支払額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Current offset payment amount 今回相殺支払額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Current offset payment amount 今回相殺支払額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Current offset payment amount 今回相殺支払額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Current offset payment tax amount 今回相殺支払税額.<p>
	 *
	 */
	public MCNumber setoff_tax_amt() {
		return setoff_tax_amt_p().amt();
	}

	/**
	 * Current offset payment tax amount 今回相殺支払税額.<p>
	 *
	 */
	public void setoff_tax_amt(MCNumber value) {
		setoff_tax_amt_p().amt(value);
	}

	/**
	 * Current offset payment tax amount 今回相殺支払税額.<p>
	 *
	 */
	public void setoff_tax_amt(int value) {
		setoff_tax_amt_p().amt(value);
	}

	/**
	 * Current offset payment tax amount 今回相殺支払税額.<p>
	 *
	 */
	public void setoff_tax_amt(long value) {
		setoff_tax_amt_p().amt(value);
	}

	/**
	 * Current offset payment tax amount 今回相殺支払税額.<p>
	 *
	 */
	public void setoff_tax_amt(float value) {
		setoff_tax_amt_p().amt(value);
	}

	/**
	 * Current offset payment tax amount 今回相殺支払税額.<p>
	 *
	 */
	public void setoff_tax_amt(double value) {
		setoff_tax_amt_p().amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return tax_amt_p().amt();
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return sw_to_amt_p().amt();
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		sw_to_amt_p().amt(value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		sw_to_amt_p().amt(value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		sw_to_amt_p().amt(value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		sw_to_amt_p().amt(value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		sw_to_amt_p().amt(value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public MCNumber schd_pay_amt() {
		return schd_pay_amt_p().amt();
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(MCNumber value) {
		schd_pay_amt_p().amt(value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(int value) {
		schd_pay_amt_p().amt(value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(long value) {
		schd_pay_amt_p().amt(value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(float value) {
		schd_pay_amt_p().amt(value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(double value) {
		schd_pay_amt_p().amt(value);
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public MCNumber adv_pay_bal() {
		return adv_pay_bal_p().amt();
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(MCNumber value) {
		adv_pay_bal_p().amt(value);
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(int value) {
		adv_pay_bal_p().amt(value);
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(long value) {
		adv_pay_bal_p().amt(value);
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(float value) {
		adv_pay_bal_p().amt(value);
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(double value) {
		adv_pay_bal_p().amt(value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public MCNumber pay_xrate() {
		return pay_xrate_p().xrate();
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(MCNumber value) {
		pay_xrate_p().xrate(value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(int value) {
		pay_xrate_p().xrate(value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(long value) {
		pay_xrate_p().xrate(value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(float value) {
		pay_xrate_p().xrate(value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(double value) {
		pay_xrate_p().xrate(value);
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

	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
	}

	/**
	 * Scheduled payee classification cd. 1 支払予定管理先分類ＣＤ１.<p>
	 *
	 */
	public String bsppl_grp_cd1() {
		return bsppl_grp_p().bp_grp_cd1();
	}

	/**
	 * Scheduled payee classification cd. 1 支払予定管理先分類ＣＤ１.<p>
	 *
	 */
	public void bsppl_grp_cd1(String value) {
		bsppl_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Scheduled payee classification name 1 支払予定管理先分類名１.<p>
	 *
	 */
	public String bsppl_grp_nm1() {
		return bsppl_grp_p().bp_grp_nm1();
	}

	/**
	 * Scheduled payee classification name 1 支払予定管理先分類名１.<p>
	 *
	 */
	public void bsppl_grp_nm1(String value) {
		bsppl_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Scheduled payee classification cd. 2 支払予定管理先分類ＣＤ２.<p>
	 *
	 */
	public String bsppl_grp_cd2() {
		return bsppl_grp_p().bp_grp_cd2();
	}

	/**
	 * Scheduled payee classification cd. 2 支払予定管理先分類ＣＤ２.<p>
	 *
	 */
	public void bsppl_grp_cd2(String value) {
		bsppl_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Scheduled payee classification name 2 支払予定管理先分類名２.<p>
	 *
	 */
	public String bsppl_grp_nm2() {
		return bsppl_grp_p().bp_grp_nm2();
	}

	/**
	 * Scheduled payee classification name 2 支払予定管理先分類名２.<p>
	 *
	 */
	public void bsppl_grp_nm2(String value) {
		bsppl_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Scheduled payee classification cd. 3 支払予定管理先分類ＣＤ３.<p>
	 *
	 */
	public String bsppl_grp_cd3() {
		return bsppl_grp_p().bp_grp_cd3();
	}

	/**
	 * Scheduled payee classification cd. 3 支払予定管理先分類ＣＤ３.<p>
	 *
	 */
	public void bsppl_grp_cd3(String value) {
		bsppl_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Scheduled payee classification name 3 支払予定管理先分類名３.<p>
	 *
	 */
	public String bsppl_grp_nm3() {
		return bsppl_grp_p().bp_grp_nm3();
	}

	/**
	 * Scheduled payee classification name 3 支払予定管理先分類名３.<p>
	 *
	 */
	public void bsppl_grp_nm3(String value) {
		bsppl_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Scheduled payee classification cd. 4 支払予定管理先分類ＣＤ４.<p>
	 *
	 */
	public String bsppl_grp_cd4() {
		return bsppl_grp_p().bp_grp_cd4();
	}

	/**
	 * Scheduled payee classification cd. 4 支払予定管理先分類ＣＤ４.<p>
	 *
	 */
	public void bsppl_grp_cd4(String value) {
		bsppl_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Scheduled payee classification name 4 支払予定管理先分類名４.<p>
	 *
	 */
	public String bsppl_grp_nm4() {
		return bsppl_grp_p().bp_grp_nm4();
	}

	/**
	 * Scheduled payee classification name 4 支払予定管理先分類名４.<p>
	 *
	 */
	public void bsppl_grp_nm4(String value) {
		bsppl_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Scheduled payee classification cd. 5 支払予定管理先分類ＣＤ５.<p>
	 *
	 */
	public String bsppl_grp_cd5() {
		return bsppl_grp_p().bp_grp_cd5();
	}

	/**
	 * Scheduled payee classification cd. 5 支払予定管理先分類ＣＤ５.<p>
	 *
	 */
	public void bsppl_grp_cd5(String value) {
		bsppl_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Scheduled payee classification name 5 支払予定管理先分類名５.<p>
	 *
	 */
	public String bsppl_grp_nm5() {
		return bsppl_grp_p().bp_grp_nm5();
	}

	/**
	 * Scheduled payee classification name 5 支払予定管理先分類名５.<p>
	 *
	 */
	public void bsppl_grp_nm5(String value) {
		bsppl_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Scheduled payee classification cd. 6 支払予定管理先分類ＣＤ６.<p>
	 *
	 */
	public String bsppl_grp_cd6() {
		return bsppl_grp_p().bp_grp_cd6();
	}

	/**
	 * Scheduled payee classification cd. 6 支払予定管理先分類ＣＤ６.<p>
	 *
	 */
	public void bsppl_grp_cd6(String value) {
		bsppl_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Scheduled payee classification name 6 支払予定管理先分類名６.<p>
	 *
	 */
	public String bsppl_grp_nm6() {
		return bsppl_grp_p().bp_grp_nm6();
	}

	/**
	 * Scheduled payee classification name 6 支払予定管理先分類名６.<p>
	 *
	 */
	public void bsppl_grp_nm6(String value) {
		bsppl_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Scheduled payee classification cd. 7 支払予定管理先分類ＣＤ７.<p>
	 *
	 */
	public String bsppl_grp_cd7() {
		return bsppl_grp_p().bp_grp_cd7();
	}

	/**
	 * Scheduled payee classification cd. 7 支払予定管理先分類ＣＤ７.<p>
	 *
	 */
	public void bsppl_grp_cd7(String value) {
		bsppl_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Scheduled payee classification name 7 支払予定管理先分類名７.<p>
	 *
	 */
	public String bsppl_grp_nm7() {
		return bsppl_grp_p().bp_grp_nm7();
	}

	/**
	 * Scheduled payee classification name 7 支払予定管理先分類名７.<p>
	 *
	 */
	public void bsppl_grp_nm7(String value) {
		bsppl_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Scheduled payee classification cd. 8 支払予定管理先分類ＣＤ８.<p>
	 *
	 */
	public String bsppl_grp_cd8() {
		return bsppl_grp_p().bp_grp_cd8();
	}

	/**
	 * Scheduled payee classification cd. 8 支払予定管理先分類ＣＤ８.<p>
	 *
	 */
	public void bsppl_grp_cd8(String value) {
		bsppl_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Scheduled payee classification name 8 支払予定管理先分類名８.<p>
	 *
	 */
	public String bsppl_grp_nm8() {
		return bsppl_grp_p().bp_grp_nm8();
	}

	/**
	 * Scheduled payee classification name 8 支払予定管理先分類名８.<p>
	 *
	 */
	public void bsppl_grp_nm8(String value) {
		bsppl_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Scheduled payee classification cd. 9 支払予定管理先分類ＣＤ９.<p>
	 *
	 */
	public String bsppl_grp_cd9() {
		return bsppl_grp_p().bp_grp_cd9();
	}

	/**
	 * Scheduled payee classification cd. 9 支払予定管理先分類ＣＤ９.<p>
	 *
	 */
	public void bsppl_grp_cd9(String value) {
		bsppl_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Scheduled payee classification name 9 支払予定管理先分類名９.<p>
	 *
	 */
	public String bsppl_grp_nm9() {
		return bsppl_grp_p().bp_grp_nm9();
	}

	/**
	 * Scheduled payee classification name 9 支払予定管理先分類名９.<p>
	 *
	 */
	public void bsppl_grp_nm9(String value) {
		bsppl_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Scheduled payee classification cd. 10 支払予定管理先分類ＣＤ１０.<p>
	 *
	 */
	public String bsppl_grp_cd10() {
		return bsppl_grp_p().bp_grp_cd10();
	}

	/**
	 * Scheduled payee classification cd. 10 支払予定管理先分類ＣＤ１０.<p>
	 *
	 */
	public void bsppl_grp_cd10(String value) {
		bsppl_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Scheduled payee classification name 10 支払予定管理先分類名１０.<p>
	 *
	 */
	public String bsppl_grp_nm10() {
		return bsppl_grp_p().bp_grp_nm10();
	}

	/**
	 * Scheduled payee classification name 10 支払予定管理先分類名１０.<p>
	 *
	 */
	public void bsppl_grp_nm10(String value) {
		bsppl_grp_p().bp_grp_nm10(value);
	}

	/**
	 * Payee classification cd. 1 支払先分類ＣＤ１.<p>
	 *
	 */
	public String psppl_grp_cd1() {
		return psppl_grp_p().bp_grp_cd1();
	}

	/**
	 * Payee classification cd. 1 支払先分類ＣＤ１.<p>
	 *
	 */
	public void psppl_grp_cd1(String value) {
		psppl_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Payee classification name 1 支払先分類名１.<p>
	 *
	 */
	public String psppl_grp_nm1() {
		return psppl_grp_p().bp_grp_nm1();
	}

	/**
	 * Payee classification name 1 支払先分類名１.<p>
	 *
	 */
	public void psppl_grp_nm1(String value) {
		psppl_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Payee classification cd. 2 支払先分類ＣＤ２.<p>
	 *
	 */
	public String psppl_grp_cd2() {
		return psppl_grp_p().bp_grp_cd2();
	}

	/**
	 * Payee classification cd. 2 支払先分類ＣＤ２.<p>
	 *
	 */
	public void psppl_grp_cd2(String value) {
		psppl_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Payee classification name 2 支払先分類名２.<p>
	 *
	 */
	public String psppl_grp_nm2() {
		return psppl_grp_p().bp_grp_nm2();
	}

	/**
	 * Payee classification name 2 支払先分類名２.<p>
	 *
	 */
	public void psppl_grp_nm2(String value) {
		psppl_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Payee classification cd. 3 支払先分類ＣＤ３.<p>
	 *
	 */
	public String psppl_grp_cd3() {
		return psppl_grp_p().bp_grp_cd3();
	}

	/**
	 * Payee classification cd. 3 支払先分類ＣＤ３.<p>
	 *
	 */
	public void psppl_grp_cd3(String value) {
		psppl_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Payee classification name 3 支払先分類名３.<p>
	 *
	 */
	public String psppl_grp_nm3() {
		return psppl_grp_p().bp_grp_nm3();
	}

	/**
	 * Payee classification name 3 支払先分類名３.<p>
	 *
	 */
	public void psppl_grp_nm3(String value) {
		psppl_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Payee classification cd. 4 支払先分類ＣＤ４.<p>
	 *
	 */
	public String psppl_grp_cd4() {
		return psppl_grp_p().bp_grp_cd4();
	}

	/**
	 * Payee classification cd. 4 支払先分類ＣＤ４.<p>
	 *
	 */
	public void psppl_grp_cd4(String value) {
		psppl_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Payee classification name 4 支払先分類名４.<p>
	 *
	 */
	public String psppl_grp_nm4() {
		return psppl_grp_p().bp_grp_nm4();
	}

	/**
	 * Payee classification name 4 支払先分類名４.<p>
	 *
	 */
	public void psppl_grp_nm4(String value) {
		psppl_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Payee classification cd. 5 支払先分類ＣＤ５.<p>
	 *
	 */
	public String psppl_grp_cd5() {
		return psppl_grp_p().bp_grp_cd5();
	}

	/**
	 * Payee classification cd. 5 支払先分類ＣＤ５.<p>
	 *
	 */
	public void psppl_grp_cd5(String value) {
		psppl_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Payee classification name 5 支払先分類名５.<p>
	 *
	 */
	public String psppl_grp_nm5() {
		return psppl_grp_p().bp_grp_nm5();
	}

	/**
	 * Payee classification name 5 支払先分類名５.<p>
	 *
	 */
	public void psppl_grp_nm5(String value) {
		psppl_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Payee classification cd. 6 支払先分類ＣＤ６.<p>
	 *
	 */
	public String psppl_grp_cd6() {
		return psppl_grp_p().bp_grp_cd6();
	}

	/**
	 * Payee classification cd. 6 支払先分類ＣＤ６.<p>
	 *
	 */
	public void psppl_grp_cd6(String value) {
		psppl_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Payee classification name 6 支払先分類名６.<p>
	 *
	 */
	public String psppl_grp_nm6() {
		return psppl_grp_p().bp_grp_nm6();
	}

	/**
	 * Payee classification name 6 支払先分類名６.<p>
	 *
	 */
	public void psppl_grp_nm6(String value) {
		psppl_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Payee classification cd. 7 支払先分類ＣＤ７.<p>
	 *
	 */
	public String psppl_grp_cd7() {
		return psppl_grp_p().bp_grp_cd7();
	}

	/**
	 * Payee classification cd. 7 支払先分類ＣＤ７.<p>
	 *
	 */
	public void psppl_grp_cd7(String value) {
		psppl_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Payee classification name 7 支払先分類名７.<p>
	 *
	 */
	public String psppl_grp_nm7() {
		return psppl_grp_p().bp_grp_nm7();
	}

	/**
	 * Payee classification name 7 支払先分類名７.<p>
	 *
	 */
	public void psppl_grp_nm7(String value) {
		psppl_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Payee classification cd. 8 支払先分類ＣＤ８.<p>
	 *
	 */
	public String psppl_grp_cd8() {
		return psppl_grp_p().bp_grp_cd8();
	}

	/**
	 * Payee classification cd. 8 支払先分類ＣＤ８.<p>
	 *
	 */
	public void psppl_grp_cd8(String value) {
		psppl_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Payee classification name 8 支払先分類名８.<p>
	 *
	 */
	public String psppl_grp_nm8() {
		return psppl_grp_p().bp_grp_nm8();
	}

	/**
	 * Payee classification name 8 支払先分類名８.<p>
	 *
	 */
	public void psppl_grp_nm8(String value) {
		psppl_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Payee classification cd. 9 支払先分類ＣＤ９.<p>
	 *
	 */
	public String psppl_grp_cd9() {
		return psppl_grp_p().bp_grp_cd9();
	}

	/**
	 * Payee classification cd. 9 支払先分類ＣＤ９.<p>
	 *
	 */
	public void psppl_grp_cd9(String value) {
		psppl_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Payee classification name 9 支払先分類名９.<p>
	 *
	 */
	public String psppl_grp_nm9() {
		return psppl_grp_p().bp_grp_nm9();
	}

	/**
	 * Payee classification name 9 支払先分類名９.<p>
	 *
	 */
	public void psppl_grp_nm9(String value) {
		psppl_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Payee classification cd. 10 支払先分類ＣＤ１０.<p>
	 *
	 */
	public String psppl_grp_cd10() {
		return psppl_grp_p().bp_grp_cd10();
	}

	/**
	 * Payee classification cd. 10 支払先分類ＣＤ１０.<p>
	 *
	 */
	public void psppl_grp_cd10(String value) {
		psppl_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Payee classification name 10 支払先分類名１０.<p>
	 *
	 */
	public String psppl_grp_nm10() {
		return psppl_grp_p().bp_grp_nm10();
	}

	/**
	 * Payee classification name 10 支払先分類名１０.<p>
	 *
	 */
	public void psppl_grp_nm10(String value) {
		psppl_grp_p().bp_grp_nm10(value);
	}

}

