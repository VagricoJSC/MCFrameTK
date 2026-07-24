package mcframe.serverMSBH.MSBHL0020;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public static final String $reg_dt = "reg_dt";
	public static final String $ap_d = "ap_d";
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
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public static final String $bsppl_nm = "bsppl_nm";
	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public static final String $bsppl_dpt_nm = "bsppl_dpt_nm";
	/**
	 * Scheduled payee PIC cd. 支払予定管理先担当者ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_usr_cd = "bsppl_usr_cd";
	/**
	 * Scheduled payee PIC name 支払予定管理先担当者名.<p>
	 *
	 */
	public static final String $bsppl_usr_nm = "bsppl_usr_nm";
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
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 * Scheduled payee closing year and month 支払予定管理先締年月.<p>
	 *
	 */
	public static final String $bsppl_cl_ym = "bsppl_cl_ym";
	/**
	 * AP amount 買掛金額.<p>
	 *
	 */
	public static final String $amt = "amt";
	/**
	 * Total fee 手数料計.<p>
	 *
	 */
	public static final String $com_paid = "com_paid";
	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public static final String $com_paid_tax_amt = "com_paid_tax_amt";
	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public static final String $last_pay_schd_amt = "last_pay_schd_amt";
	/**
	 * Current payment amount from deposit 今回預金支払額.<p>
	 *
	 */
	public static final String $account_amt = "account_amt";
	/**
	 * Current cash payment amount 今回現金支払額.<p>
	 *
	 */
	public static final String $cash_amt = "cash_amt";
	/**
	 * Current notes payment amount 今回手形支払額.<p>
	 *
	 */
	public static final String $note_amt = "note_amt";
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
	 * Current purchase return amount 今回仕入返品額.<p>
	 *
	 */
	public static final String $purc_ret_amt = "purc_ret_amt";
	/**
	 * Current purchase discount amount 今回仕入値引額.<p>
	 *
	 */
	public static final String $purc_dscnt_amt = "purc_dscnt_amt";
	/**
	 * Current offset payment amount 今回相殺支払額.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	/**
	 * Current offset payment tax amount 今回相殺支払額税額.<p>
	 *
	 */
	public static final String $setoff_tax_amt = "setoff_tax_amt";
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
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public static final String $adv_pay_bal = "adv_pay_bal";
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
	 * Base unit currency cd. 基準単位通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Payment collation exchange rate cd. 支払照合為替レートＣＤ.<p>
	 *
	 */
	public static final String $pay_xrate_cd = "pay_xrate_cd";
	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public static final String $pay_xrate = "pay_xrate";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";
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
	 * Scheduled payee classification cd. 1 支払予定管理先分類ＣＤ１.<p>
	 *
	 */
	public static final String $bsppl_grp_cd1 = "bsppl_grp_cd1";
	/**
	 * Scheduled payee classification name 1 支払予定管理先分類名１.<p>
	 *
	 */
	public static final String $bsppl_grp_nm1 = "bsppl_grp_nm1";
	/**
	 * Scheduled payee classification cd. 2 支払予定管理先分類ＣＤ２.<p>
	 *
	 */
	public static final String $bsppl_grp_cd2 = "bsppl_grp_cd2";
	/**
	 * Scheduled payee classification name 2 支払予定管理先分類名２.<p>
	 *
	 */
	public static final String $bsppl_grp_nm2 = "bsppl_grp_nm2";
	/**
	 * Scheduled payee classification cd. 3 支払予定管理先分類ＣＤ３.<p>
	 *
	 */
	public static final String $bsppl_grp_cd3 = "bsppl_grp_cd3";
	/**
	 * Scheduled payee classification name 3 支払予定管理先分類名３.<p>
	 *
	 */
	public static final String $bsppl_grp_nm3 = "bsppl_grp_nm3";
	/**
	 * Scheduled payee classification cd. 4 支払予定管理先分類ＣＤ４.<p>
	 *
	 */
	public static final String $bsppl_grp_cd4 = "bsppl_grp_cd4";
	/**
	 * Scheduled payee classification name 4 支払予定管理先分類名４.<p>
	 *
	 */
	public static final String $bsppl_grp_nm4 = "bsppl_grp_nm4";
	/**
	 * Scheduled payee classification cd. 5 支払予定管理先分類ＣＤ５.<p>
	 *
	 */
	public static final String $bsppl_grp_cd5 = "bsppl_grp_cd5";
	/**
	 * Scheduled payee classification name 5 支払予定管理先分類名５.<p>
	 *
	 */
	public static final String $bsppl_grp_nm5 = "bsppl_grp_nm5";
	/**
	 * Scheduled payee classification cd. 6 支払予定管理先分類ＣＤ６.<p>
	 *
	 */
	public static final String $bsppl_grp_cd6 = "bsppl_grp_cd6";
	/**
	 * Scheduled payee classification name 6 支払予定管理先分類名６.<p>
	 *
	 */
	public static final String $bsppl_grp_nm6 = "bsppl_grp_nm6";
	/**
	 * Scheduled payee classification cd. 7 支払予定管理先分類ＣＤ７.<p>
	 *
	 */
	public static final String $bsppl_grp_cd7 = "bsppl_grp_cd7";
	/**
	 * Scheduled payee classification name 7 支払予定管理先分類名７.<p>
	 *
	 */
	public static final String $bsppl_grp_nm7 = "bsppl_grp_nm7";
	/**
	 * Scheduled payee classification cd. 8 支払予定管理先分類ＣＤ８.<p>
	 *
	 */
	public static final String $bsppl_grp_cd8 = "bsppl_grp_cd8";
	/**
	 * Scheduled payee classification name 8 支払予定管理先分類名８.<p>
	 *
	 */
	public static final String $bsppl_grp_nm8 = "bsppl_grp_nm8";
	/**
	 * Scheduled payee classification cd. 9 支払予定管理先分類ＣＤ９.<p>
	 *
	 */
	public static final String $bsppl_grp_cd9 = "bsppl_grp_cd9";
	/**
	 * Scheduled payee classification name 9 支払予定管理先分類名９.<p>
	 *
	 */
	public static final String $bsppl_grp_nm9 = "bsppl_grp_nm9";
	/**
	 * Scheduled payee classification cd. 10 支払予定管理先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $bsppl_grp_cd10 = "bsppl_grp_cd10";
	/**
	 * Scheduled payee classification name 10 支払予定管理先分類名１０.<p>
	 *
	 */
	public static final String $bsppl_grp_nm10 = "bsppl_grp_nm10";
	/**
	 * Payee classification cd. 1 支払先分類ＣＤ１.<p>
	 *
	 */
	public static final String $psppl_grp_cd1 = "psppl_grp_cd1";
	/**
	 * Payee classification name 1 支払先分類名１.<p>
	 *
	 */
	public static final String $psppl_grp_nm1 = "psppl_grp_nm1";
	/**
	 * Payee classification cd. 2 支払先分類ＣＤ２.<p>
	 *
	 */
	public static final String $psppl_grp_cd2 = "psppl_grp_cd2";
	/**
	 * Payee classification name 2 支払先分類名２.<p>
	 *
	 */
	public static final String $psppl_grp_nm2 = "psppl_grp_nm2";
	/**
	 * Payee classification cd. 3 支払先分類ＣＤ３.<p>
	 *
	 */
	public static final String $psppl_grp_cd3 = "psppl_grp_cd3";
	/**
	 * Payee classification name 3 支払先分類名３.<p>
	 *
	 */
	public static final String $psppl_grp_nm3 = "psppl_grp_nm3";
	/**
	 * Payee classification cd. 4 支払先分類ＣＤ４.<p>
	 *
	 */
	public static final String $psppl_grp_cd4 = "psppl_grp_cd4";
	/**
	 * Payee classification name 4 支払先分類名４.<p>
	 *
	 */
	public static final String $psppl_grp_nm4 = "psppl_grp_nm4";
	/**
	 * Payee classification cd. 5 支払先分類ＣＤ５.<p>
	 *
	 */
	public static final String $psppl_grp_cd5 = "psppl_grp_cd5";
	/**
	 * Payee classification name 5 支払先分類名５.<p>
	 *
	 */
	public static final String $psppl_grp_nm5 = "psppl_grp_nm5";
	/**
	 * Payee classification cd. 6 支払先分類ＣＤ６.<p>
	 *
	 */
	public static final String $psppl_grp_cd6 = "psppl_grp_cd6";
	/**
	 * Payee classification name 6 支払先分類名６.<p>
	 *
	 */
	public static final String $psppl_grp_nm6 = "psppl_grp_nm6";
	/**
	 * Payee classification cd. 7 支払先分類ＣＤ７.<p>
	 *
	 */
	public static final String $psppl_grp_cd7 = "psppl_grp_cd7";
	/**
	 * Payee classification name 7 支払先分類名７.<p>
	 *
	 */
	public static final String $psppl_grp_nm7 = "psppl_grp_nm7";
	/**
	 * Payee classification cd. 8 支払先分類ＣＤ８.<p>
	 *
	 */
	public static final String $psppl_grp_cd8 = "psppl_grp_cd8";
	/**
	 * Payee classification name 8 支払先分類名８.<p>
	 *
	 */
	public static final String $psppl_grp_nm8 = "psppl_grp_nm8";
	/**
	 * Payee classification cd. 9 支払先分類ＣＤ９.<p>
	 *
	 */
	public static final String $psppl_grp_cd9 = "psppl_grp_cd9";
	/**
	 * Payee classification name 9 支払先分類名９.<p>
	 *
	 */
	public static final String $psppl_grp_nm9 = "psppl_grp_nm9";
	/**
	 * Payee classification cd. 10 支払先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $psppl_grp_cd10 = "psppl_grp_cd10";
	/**
	 * Payee classification name 10 支払先分類名１０.<p>
	 *
	 */
	public static final String $psppl_grp_nm10 = "psppl_grp_nm10";
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

	public static final String $ap_d_no = $ap_d + ".ap_d_no";
	public static final String $sppl_cd = $ap_d + ".sppl_cd";
	public static final String $bsppl_cd = $ap_d + ".bsppl_cd";
	public static final String $bsppl_dpt_cd = $ap_d + ".bsppl_dpt_cd";
	public static final String $purc_act_no = $ap_d + ".purc_act_no";
	public static final String $rcpt_iv_mng_no = $ap_d + ".rcpt_iv_mng_no";
	public static final String $rcpt_iv_no = $ap_d + ".rcpt_iv_no";
	public static final String $trd_cur_cd = $ap_d + ".trd_cur_cd";
	public static final String $pay_basis_dt = $ap_d + ".pay_basis_dt";
	public static final String $pay_schd_dt = $ap_d + ".pay_schd_dt";
	public static final String $bsppl_cl_dt = $ap_d + ".bsppl_cl_dt";
	public static final String $bsppl_cl_day = $ap_d + ".bsppl_cl_day";
	public static final String $wrk_no = $ap_d + ".wrk_no";
	public static final String $trd_ptn_typ = $ap_d + ".trd_ptn_typ";
	public static final String $itm_cd = $ap_d + ".itm_cd";
	public static final String $itm_sub1 = $ap_d + ".itm_sub1";
	public static final String $itm_sub2 = $ap_d + ".itm_sub2";
	public static final String $itm_sub3 = $ap_d + ".itm_sub3";
	public static final String $trd_cur_amt = $ap_d + ".trd_cur_amt";
	public static final String $trd_cur_tax_amt = $ap_d + ".trd_cur_tax_amt";
	public static final String $interim_flg = $ap_d + ".interim_flg";
	public static final String $ac_dt = $ap_d + ".ac_dt";
	public static final String $upd_cntr = $ap_d + ".upd_cntr";

	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta reg_dt_META = createCommonMeta($reg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ap_d_META = createInnerRowMeta($ap_d, mcframe.serverMS.dbc.MST_AP_D_R.class);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta psppl_nm_META = createCommonMeta($psppl_nm, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bsppl_nm_META = createCommonMeta($bsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_dpt_nm_META = createCommonMeta($bsppl_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta bsppl_usr_cd_META = createCommonMeta($bsppl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta bsppl_usr_nm_META = createCommonMeta($bsppl_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta bsppl_cl_ym_META = createCommonMeta($bsppl_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta com_paid_META = createCommonMeta($com_paid, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta com_paid_tax_amt_META = createCommonMeta($com_paid_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta last_pay_schd_amt_META = createCommonMeta($last_pay_schd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta account_amt_META = createCommonMeta($account_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cash_amt_META = createCommonMeta($cash_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta note_amt_META = createCommonMeta($note_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_amt_META = createCommonMeta($sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bfw_amt_META = createCommonMeta($bfw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_amt_META = createCommonMeta($purc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_ret_amt_META = createCommonMeta($purc_ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_dscnt_amt_META = createCommonMeta($purc_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_tax_amt_META = createCommonMeta($setoff_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_to_amt_META = createCommonMeta($sw_to_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_pay_amt_META = createCommonMeta($schd_pay_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_pay_bal_META = createCommonMeta($adv_pay_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_xrate_cd_META = createCommonMeta($pay_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta pay_xrate_META = createCommonMeta($pay_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta min_ac_dt_META = createCommonMeta($min_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta max_ac_dt_META = createCommonMeta($max_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bsppl_grp_cd1_META = createCommonMeta($bsppl_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bsppl_grp_nm1_META = createCommonMeta($bsppl_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bsppl_grp_cd2_META = createCommonMeta($bsppl_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bsppl_grp_nm2_META = createCommonMeta($bsppl_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bsppl_grp_cd3_META = createCommonMeta($bsppl_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bsppl_grp_nm3_META = createCommonMeta($bsppl_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bsppl_grp_cd4_META = createCommonMeta($bsppl_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bsppl_grp_nm4_META = createCommonMeta($bsppl_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bsppl_grp_cd5_META = createCommonMeta($bsppl_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bsppl_grp_nm5_META = createCommonMeta($bsppl_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bsppl_grp_cd6_META = createCommonMeta($bsppl_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bsppl_grp_nm6_META = createCommonMeta($bsppl_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bsppl_grp_cd7_META = createCommonMeta($bsppl_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bsppl_grp_nm7_META = createCommonMeta($bsppl_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bsppl_grp_cd8_META = createCommonMeta($bsppl_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bsppl_grp_nm8_META = createCommonMeta($bsppl_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bsppl_grp_cd9_META = createCommonMeta($bsppl_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bsppl_grp_nm9_META = createCommonMeta($bsppl_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bsppl_grp_cd10_META = createCommonMeta($bsppl_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bsppl_grp_nm10_META = createCommonMeta($bsppl_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta psppl_grp_cd1_META = createCommonMeta($psppl_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta psppl_grp_nm1_META = createCommonMeta($psppl_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta psppl_grp_cd2_META = createCommonMeta($psppl_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta psppl_grp_nm2_META = createCommonMeta($psppl_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta psppl_grp_cd3_META = createCommonMeta($psppl_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta psppl_grp_nm3_META = createCommonMeta($psppl_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta psppl_grp_cd4_META = createCommonMeta($psppl_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta psppl_grp_nm4_META = createCommonMeta($psppl_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta psppl_grp_cd5_META = createCommonMeta($psppl_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta psppl_grp_nm5_META = createCommonMeta($psppl_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta psppl_grp_cd6_META = createCommonMeta($psppl_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta psppl_grp_nm6_META = createCommonMeta($psppl_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta psppl_grp_cd7_META = createCommonMeta($psppl_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta psppl_grp_nm7_META = createCommonMeta($psppl_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta psppl_grp_cd8_META = createCommonMeta($psppl_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta psppl_grp_nm8_META = createCommonMeta($psppl_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta psppl_grp_cd9_META = createCommonMeta($psppl_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta psppl_grp_nm9_META = createCommonMeta($psppl_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta psppl_grp_cd10_META = createCommonMeta($psppl_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta psppl_grp_nm10_META = createCommonMeta($psppl_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
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

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			reg_dt_META,
			ap_d_META,
			psppl_cd_META,
			psppl_nm_META,
			bsppl_nm_META,
			bsppl_dpt_nm_META,
			bsppl_usr_cd_META,
			bsppl_usr_nm_META,
			wg_cd_META,
			wg_nm_META,
			wrk_nm_META,
			bsppl_cl_ym_META,
			amt_META,
			com_paid_META,
			com_paid_tax_amt_META,
			last_pay_schd_amt_META,
			account_amt_META,
			cash_amt_META,
			note_amt_META,
			sw_amt_META,
			bfw_amt_META,
			purc_amt_META,
			purc_ret_amt_META,
			purc_dscnt_amt_META,
			setoff_amt_META,
			setoff_tax_amt_META,
			tax_amt_META,
			sw_to_amt_META,
			schd_pay_amt_META,
			adv_pay_bal_META,
			trd_cur_nm_META,
			trd_cur_amt_dec_place_META,
			base_cur_cd_META,
			xrate_cd_META,
			xrate_META,
			pay_xrate_cd_META,
			pay_xrate_META,
			prnt_flg_META,
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
			min_ac_dt_META,
			max_ac_dt_META,
			bsppl_grp_cd1_META,
			bsppl_grp_nm1_META,
			bsppl_grp_cd2_META,
			bsppl_grp_nm2_META,
			bsppl_grp_cd3_META,
			bsppl_grp_nm3_META,
			bsppl_grp_cd4_META,
			bsppl_grp_nm4_META,
			bsppl_grp_cd5_META,
			bsppl_grp_nm5_META,
			bsppl_grp_cd6_META,
			bsppl_grp_nm6_META,
			bsppl_grp_cd7_META,
			bsppl_grp_nm7_META,
			bsppl_grp_cd8_META,
			bsppl_grp_nm8_META,
			bsppl_grp_cd9_META,
			bsppl_grp_nm9_META,
			bsppl_grp_cd10_META,
			bsppl_grp_nm10_META,
			psppl_grp_cd1_META,
			psppl_grp_nm1_META,
			psppl_grp_cd2_META,
			psppl_grp_nm2_META,
			psppl_grp_cd3_META,
			psppl_grp_nm3_META,
			psppl_grp_cd4_META,
			psppl_grp_nm4_META,
			psppl_grp_cd5_META,
			psppl_grp_nm5_META,
			psppl_grp_cd6_META,
			psppl_grp_nm6_META,
			psppl_grp_cd7_META,
			psppl_grp_nm7_META,
			psppl_grp_cd8_META,
			psppl_grp_nm8_META,
			psppl_grp_cd9_META,
			psppl_grp_nm9_META,
			psppl_grp_cd10_META,
			psppl_grp_nm10_META,
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
			upd_srv_req_no_META
		},
		new String[][]{
			{
				"ap_d_no",
				"sppl_cd",
				"bsppl_cd",
				"bsppl_dpt_cd",
				"purc_act_no",
				"rcpt_iv_mng_no",
				"rcpt_iv_no",
				"trd_cur_cd",
				"pay_basis_dt",
				"pay_schd_dt",
				"bsppl_cl_dt",
				"bsppl_cl_day",
				"wrk_no",
				"trd_ptn_typ",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"trd_cur_amt",
				"trd_cur_tax_amt",
				"interim_flg",
				"ac_dt",
				"upd_cntr"
			},
			{
				$ap_d_no,
				$sppl_cd,
				$bsppl_cd,
				$bsppl_dpt_cd,
				$purc_act_no,
				$rcpt_iv_mng_no,
				$rcpt_iv_no,
				$trd_cur_cd,
				$pay_basis_dt,
				$pay_schd_dt,
				$bsppl_cl_dt,
				$bsppl_cl_day,
				$wrk_no,
				$trd_ptn_typ,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$trd_cur_amt,
				$trd_cur_tax_amt,
				$interim_flg,
				$ac_dt,
				$upd_cntr
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$aprv_sts_typ, "MAC_APRV_STS_TYP"},	// aprv_sts_typ
				{$pay_sts_typ, "MSC_PAY_STS_TYP"}	// pay_sts_typ
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
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
	 * Entry date 登録日.<p>
	 *
	 */
	public MCDate reg_dt() {
		return getConstDate(offset + 1, $reg_dt);
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public void reg_dt(MCDate value) {
		setConstDate(offset + 1, $reg_dt, value);
	}


	public mcframe.serverMS.dbc.MST_AP_D_R ap_d(){
		return (mcframe.serverMS.dbc.MST_AP_D_R) getConstInnerRow(offset + 2, $ap_d);
	}
	
	public void ap_d(mcframe.serverMS.dbc.MST_AP_D_R row){
		setConstInnerRow(offset + 2, $ap_d, row);
	}


	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 3, $psppl_cd);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 3, $psppl_cd, value);
	}


	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public String psppl_nm() {
		return getConstString(offset + 4, $psppl_nm);
	}

	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public void psppl_nm(String value) {
		setConstString(offset + 4, $psppl_nm, value);
	}


	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public String bsppl_nm() {
		return getConstString(offset + 5, $bsppl_nm);
	}

	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public void bsppl_nm(String value) {
		setConstString(offset + 5, $bsppl_nm, value);
	}


	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public String bsppl_dpt_nm() {
		return getConstString(offset + 6, $bsppl_dpt_nm);
	}

	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public void bsppl_dpt_nm(String value) {
		setConstString(offset + 6, $bsppl_dpt_nm, value);
	}


	/**
	 * Scheduled payee PIC cd. 支払予定管理先担当者ＣＤ.<p>
	 *
	 */
	public String bsppl_usr_cd() {
		return getConstString(offset + 7, $bsppl_usr_cd);
	}

	/**
	 * Scheduled payee PIC cd. 支払予定管理先担当者ＣＤ.<p>
	 *
	 */
	public void bsppl_usr_cd(String value) {
		setConstString(offset + 7, $bsppl_usr_cd, value);
	}


	/**
	 * Scheduled payee PIC name 支払予定管理先担当者名.<p>
	 *
	 */
	public String bsppl_usr_nm() {
		return getConstString(offset + 8, $bsppl_usr_nm);
	}

	/**
	 * Scheduled payee PIC name 支払予定管理先担当者名.<p>
	 *
	 */
	public void bsppl_usr_nm(String value) {
		setConstString(offset + 8, $bsppl_usr_nm, value);
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
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 11, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 11, $wrk_nm, value);
	}


	/**
	 * Scheduled payee closing year and month 支払予定管理先締年月.<p>
	 *
	 */
	public MCDate bsppl_cl_ym() {
		return getConstDate(offset + 12, $bsppl_cl_ym);
	}

	/**
	 * Scheduled payee closing year and month 支払予定管理先締年月.<p>
	 *
	 */
	public void bsppl_cl_ym(MCDate value) {
		setConstDate(offset + 12, $bsppl_cl_ym, value);
	}


	/**
	 * AP amount 買掛金額.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 13, $amt);
	}

	/**
	 * AP amount 買掛金額.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 13, $amt, value);
	}

	/**
	 * AP amount 買掛金額.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 13, $amt, value);
	}

	/**
	 * AP amount 買掛金額.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 13, $amt, value);
	}

	/**
	 * AP amount 買掛金額.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 13, $amt, value);
	}

	/**
	 * AP amount 買掛金額.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 13, $amt, value);
	}


	/**
	 * Total fee 手数料計.<p>
	 *
	 */
	public MCNumber com_paid() {
		return getConstNumber(offset + 14, $com_paid);
	}

	/**
	 * Total fee 手数料計.<p>
	 *
	 */
	public void com_paid(MCNumber value) {
		setConstNumber(offset + 14, $com_paid, value);
	}

	/**
	 * Total fee 手数料計.<p>
	 *
	 */
	public void com_paid(int value) {
		setConstNumber(offset + 14, $com_paid, value);
	}

	/**
	 * Total fee 手数料計.<p>
	 *
	 */
	public void com_paid(long value) {
		setConstNumber(offset + 14, $com_paid, value);
	}

	/**
	 * Total fee 手数料計.<p>
	 *
	 */
	public void com_paid(float value) {
		setConstNumber(offset + 14, $com_paid, value);
	}

	/**
	 * Total fee 手数料計.<p>
	 *
	 */
	public void com_paid(double value) {
		setConstNumber(offset + 14, $com_paid, value);
	}


	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public MCNumber com_paid_tax_amt() {
		return getConstNumber(offset + 15, $com_paid_tax_amt);
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public void com_paid_tax_amt(MCNumber value) {
		setConstNumber(offset + 15, $com_paid_tax_amt, value);
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public void com_paid_tax_amt(int value) {
		setConstNumber(offset + 15, $com_paid_tax_amt, value);
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public void com_paid_tax_amt(long value) {
		setConstNumber(offset + 15, $com_paid_tax_amt, value);
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public void com_paid_tax_amt(float value) {
		setConstNumber(offset + 15, $com_paid_tax_amt, value);
	}

	/**
	 * Total fee tax amount 手数料税額計.<p>
	 *
	 */
	public void com_paid_tax_amt(double value) {
		setConstNumber(offset + 15, $com_paid_tax_amt, value);
	}


	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public MCNumber last_pay_schd_amt() {
		return getConstNumber(offset + 16, $last_pay_schd_amt);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(MCNumber value) {
		setConstNumber(offset + 16, $last_pay_schd_amt, value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(int value) {
		setConstNumber(offset + 16, $last_pay_schd_amt, value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(long value) {
		setConstNumber(offset + 16, $last_pay_schd_amt, value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(float value) {
		setConstNumber(offset + 16, $last_pay_schd_amt, value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(double value) {
		setConstNumber(offset + 16, $last_pay_schd_amt, value);
	}


	/**
	 * Current payment amount from deposit 今回預金支払額.<p>
	 *
	 */
	public MCNumber account_amt() {
		return getConstNumber(offset + 17, $account_amt);
	}

	/**
	 * Current payment amount from deposit 今回預金支払額.<p>
	 *
	 */
	public void account_amt(MCNumber value) {
		setConstNumber(offset + 17, $account_amt, value);
	}

	/**
	 * Current payment amount from deposit 今回預金支払額.<p>
	 *
	 */
	public void account_amt(int value) {
		setConstNumber(offset + 17, $account_amt, value);
	}

	/**
	 * Current payment amount from deposit 今回預金支払額.<p>
	 *
	 */
	public void account_amt(long value) {
		setConstNumber(offset + 17, $account_amt, value);
	}

	/**
	 * Current payment amount from deposit 今回預金支払額.<p>
	 *
	 */
	public void account_amt(float value) {
		setConstNumber(offset + 17, $account_amt, value);
	}

	/**
	 * Current payment amount from deposit 今回預金支払額.<p>
	 *
	 */
	public void account_amt(double value) {
		setConstNumber(offset + 17, $account_amt, value);
	}


	/**
	 * Current cash payment amount 今回現金支払額.<p>
	 *
	 */
	public MCNumber cash_amt() {
		return getConstNumber(offset + 18, $cash_amt);
	}

	/**
	 * Current cash payment amount 今回現金支払額.<p>
	 *
	 */
	public void cash_amt(MCNumber value) {
		setConstNumber(offset + 18, $cash_amt, value);
	}

	/**
	 * Current cash payment amount 今回現金支払額.<p>
	 *
	 */
	public void cash_amt(int value) {
		setConstNumber(offset + 18, $cash_amt, value);
	}

	/**
	 * Current cash payment amount 今回現金支払額.<p>
	 *
	 */
	public void cash_amt(long value) {
		setConstNumber(offset + 18, $cash_amt, value);
	}

	/**
	 * Current cash payment amount 今回現金支払額.<p>
	 *
	 */
	public void cash_amt(float value) {
		setConstNumber(offset + 18, $cash_amt, value);
	}

	/**
	 * Current cash payment amount 今回現金支払額.<p>
	 *
	 */
	public void cash_amt(double value) {
		setConstNumber(offset + 18, $cash_amt, value);
	}


	/**
	 * Current notes payment amount 今回手形支払額.<p>
	 *
	 */
	public MCNumber note_amt() {
		return getConstNumber(offset + 19, $note_amt);
	}

	/**
	 * Current notes payment amount 今回手形支払額.<p>
	 *
	 */
	public void note_amt(MCNumber value) {
		setConstNumber(offset + 19, $note_amt, value);
	}

	/**
	 * Current notes payment amount 今回手形支払額.<p>
	 *
	 */
	public void note_amt(int value) {
		setConstNumber(offset + 19, $note_amt, value);
	}

	/**
	 * Current notes payment amount 今回手形支払額.<p>
	 *
	 */
	public void note_amt(long value) {
		setConstNumber(offset + 19, $note_amt, value);
	}

	/**
	 * Current notes payment amount 今回手形支払額.<p>
	 *
	 */
	public void note_amt(float value) {
		setConstNumber(offset + 19, $note_amt, value);
	}

	/**
	 * Current notes payment amount 今回手形支払額.<p>
	 *
	 */
	public void note_amt(double value) {
		setConstNumber(offset + 19, $note_amt, value);
	}


	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return getConstNumber(offset + 20, $sw_amt);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		setConstNumber(offset + 20, $sw_amt, value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(int value) {
		setConstNumber(offset + 20, $sw_amt, value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(long value) {
		setConstNumber(offset + 20, $sw_amt, value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(float value) {
		setConstNumber(offset + 20, $sw_amt, value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(double value) {
		setConstNumber(offset + 20, $sw_amt, value);
	}


	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public MCNumber bfw_amt() {
		return getConstNumber(offset + 21, $bfw_amt);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(MCNumber value) {
		setConstNumber(offset + 21, $bfw_amt, value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(int value) {
		setConstNumber(offset + 21, $bfw_amt, value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(long value) {
		setConstNumber(offset + 21, $bfw_amt, value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(float value) {
		setConstNumber(offset + 21, $bfw_amt, value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(double value) {
		setConstNumber(offset + 21, $bfw_amt, value);
	}


	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public MCNumber purc_amt() {
		return getConstNumber(offset + 22, $purc_amt);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(MCNumber value) {
		setConstNumber(offset + 22, $purc_amt, value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(int value) {
		setConstNumber(offset + 22, $purc_amt, value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(long value) {
		setConstNumber(offset + 22, $purc_amt, value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(float value) {
		setConstNumber(offset + 22, $purc_amt, value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(double value) {
		setConstNumber(offset + 22, $purc_amt, value);
	}


	/**
	 * Current purchase return amount 今回仕入返品額.<p>
	 *
	 */
	public MCNumber purc_ret_amt() {
		return getConstNumber(offset + 23, $purc_ret_amt);
	}

	/**
	 * Current purchase return amount 今回仕入返品額.<p>
	 *
	 */
	public void purc_ret_amt(MCNumber value) {
		setConstNumber(offset + 23, $purc_ret_amt, value);
	}

	/**
	 * Current purchase return amount 今回仕入返品額.<p>
	 *
	 */
	public void purc_ret_amt(int value) {
		setConstNumber(offset + 23, $purc_ret_amt, value);
	}

	/**
	 * Current purchase return amount 今回仕入返品額.<p>
	 *
	 */
	public void purc_ret_amt(long value) {
		setConstNumber(offset + 23, $purc_ret_amt, value);
	}

	/**
	 * Current purchase return amount 今回仕入返品額.<p>
	 *
	 */
	public void purc_ret_amt(float value) {
		setConstNumber(offset + 23, $purc_ret_amt, value);
	}

	/**
	 * Current purchase return amount 今回仕入返品額.<p>
	 *
	 */
	public void purc_ret_amt(double value) {
		setConstNumber(offset + 23, $purc_ret_amt, value);
	}


	/**
	 * Current purchase discount amount 今回仕入値引額.<p>
	 *
	 */
	public MCNumber purc_dscnt_amt() {
		return getConstNumber(offset + 24, $purc_dscnt_amt);
	}

	/**
	 * Current purchase discount amount 今回仕入値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 24, $purc_dscnt_amt, value);
	}

	/**
	 * Current purchase discount amount 今回仕入値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(int value) {
		setConstNumber(offset + 24, $purc_dscnt_amt, value);
	}

	/**
	 * Current purchase discount amount 今回仕入値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(long value) {
		setConstNumber(offset + 24, $purc_dscnt_amt, value);
	}

	/**
	 * Current purchase discount amount 今回仕入値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(float value) {
		setConstNumber(offset + 24, $purc_dscnt_amt, value);
	}

	/**
	 * Current purchase discount amount 今回仕入値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(double value) {
		setConstNumber(offset + 24, $purc_dscnt_amt, value);
	}


	/**
	 * Current offset payment amount 今回相殺支払額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 25, $setoff_amt);
	}

	/**
	 * Current offset payment amount 今回相殺支払額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 25, $setoff_amt, value);
	}

	/**
	 * Current offset payment amount 今回相殺支払額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 25, $setoff_amt, value);
	}

	/**
	 * Current offset payment amount 今回相殺支払額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 25, $setoff_amt, value);
	}

	/**
	 * Current offset payment amount 今回相殺支払額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 25, $setoff_amt, value);
	}

	/**
	 * Current offset payment amount 今回相殺支払額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 25, $setoff_amt, value);
	}


	/**
	 * Current offset payment tax amount 今回相殺支払額税額.<p>
	 *
	 */
	public MCNumber setoff_tax_amt() {
		return getConstNumber(offset + 26, $setoff_tax_amt);
	}

	/**
	 * Current offset payment tax amount 今回相殺支払額税額.<p>
	 *
	 */
	public void setoff_tax_amt(MCNumber value) {
		setConstNumber(offset + 26, $setoff_tax_amt, value);
	}

	/**
	 * Current offset payment tax amount 今回相殺支払額税額.<p>
	 *
	 */
	public void setoff_tax_amt(int value) {
		setConstNumber(offset + 26, $setoff_tax_amt, value);
	}

	/**
	 * Current offset payment tax amount 今回相殺支払額税額.<p>
	 *
	 */
	public void setoff_tax_amt(long value) {
		setConstNumber(offset + 26, $setoff_tax_amt, value);
	}

	/**
	 * Current offset payment tax amount 今回相殺支払額税額.<p>
	 *
	 */
	public void setoff_tax_amt(float value) {
		setConstNumber(offset + 26, $setoff_tax_amt, value);
	}

	/**
	 * Current offset payment tax amount 今回相殺支払額税額.<p>
	 *
	 */
	public void setoff_tax_amt(double value) {
		setConstNumber(offset + 26, $setoff_tax_amt, value);
	}


	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 27, $tax_amt);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 27, $tax_amt, value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 27, $tax_amt, value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 27, $tax_amt, value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 27, $tax_amt, value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 27, $tax_amt, value);
	}


	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return getConstNumber(offset + 28, $sw_to_amt);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		setConstNumber(offset + 28, $sw_to_amt, value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		setConstNumber(offset + 28, $sw_to_amt, value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		setConstNumber(offset + 28, $sw_to_amt, value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		setConstNumber(offset + 28, $sw_to_amt, value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		setConstNumber(offset + 28, $sw_to_amt, value);
	}


	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public MCNumber schd_pay_amt() {
		return getConstNumber(offset + 29, $schd_pay_amt);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(MCNumber value) {
		setConstNumber(offset + 29, $schd_pay_amt, value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(int value) {
		setConstNumber(offset + 29, $schd_pay_amt, value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(long value) {
		setConstNumber(offset + 29, $schd_pay_amt, value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(float value) {
		setConstNumber(offset + 29, $schd_pay_amt, value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(double value) {
		setConstNumber(offset + 29, $schd_pay_amt, value);
	}


	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public MCNumber adv_pay_bal() {
		return getConstNumber(offset + 30, $adv_pay_bal);
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(MCNumber value) {
		setConstNumber(offset + 30, $adv_pay_bal, value);
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(int value) {
		setConstNumber(offset + 30, $adv_pay_bal, value);
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(long value) {
		setConstNumber(offset + 30, $adv_pay_bal, value);
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(float value) {
		setConstNumber(offset + 30, $adv_pay_bal, value);
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(double value) {
		setConstNumber(offset + 30, $adv_pay_bal, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 31, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 31, $trd_cur_nm, value);
	}


	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 32, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 32, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 32, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 32, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 32, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 32, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Base unit currency cd. 基準単位通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 33, $base_cur_cd);
	}

	/**
	 * Base unit currency cd. 基準単位通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 33, $base_cur_cd, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 34, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 34, $xrate_cd, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 35, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 35, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 35, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 35, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 35, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 35, $xrate, value);
	}


	/**
	 * Payment collation exchange rate cd. 支払照合為替レートＣＤ.<p>
	 *
	 */
	public String pay_xrate_cd() {
		return getConstString(offset + 36, $pay_xrate_cd);
	}

	/**
	 * Payment collation exchange rate cd. 支払照合為替レートＣＤ.<p>
	 *
	 */
	public void pay_xrate_cd(String value) {
		setConstString(offset + 36, $pay_xrate_cd, value);
	}


	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public MCNumber pay_xrate() {
		return getConstNumber(offset + 37, $pay_xrate);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(MCNumber value) {
		setConstNumber(offset + 37, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(int value) {
		setConstNumber(offset + 37, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(long value) {
		setConstNumber(offset + 37, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(float value) {
		setConstNumber(offset + 37, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(double value) {
		setConstNumber(offset + 37, $pay_xrate, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 38, $prnt_flg);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 38, $prnt_flg, value);
	}


	/**
	 * With temporary unit price 仮単価あり.<p>
	 *
	 */
	public boolean inc_interim_flg() {
		return getConstBoolean(offset + 39, $inc_interim_flg);
	}

	/**
	 * With temporary unit price 仮単価あり.<p>
	 *
	 */
	public void inc_interim_flg(boolean value) {
		setConstBoolean(offset + 39, $inc_interim_flg, value);
	}


	/**
	 * Purchase temporary unit price closing 仕入仮単価締.<p>
	 *
	 */
	public boolean purc_interim_cl_flg() {
		return getConstBoolean(offset + 40, $purc_interim_cl_flg);
	}

	/**
	 * Purchase temporary unit price closing 仕入仮単価締.<p>
	 *
	 */
	public void purc_interim_cl_flg(boolean value) {
		setConstBoolean(offset + 40, $purc_interim_cl_flg, value);
	}


	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public String pay_chk_no() {
		return getConstString(offset + 41, $pay_chk_no);
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no(String value) {
		setConstString(offset + 41, $pay_chk_no, value);
	}


	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public String pay_chk_mng_no() {
		return getConstString(offset + 42, $pay_chk_mng_no);
	}

	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public void pay_chk_mng_no(String value) {
		setConstString(offset + 42, $pay_chk_mng_no, value);
	}


	/**
	 * Notice rev. number 通知書改訂番号.<p>
	 *
	 */
	public MCNumber pay_ntc_rev() {
		return getConstNumber(offset + 43, $pay_ntc_rev);
	}

	/**
	 * Notice rev. number 通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(MCNumber value) {
		setConstNumber(offset + 43, $pay_ntc_rev, value);
	}

	/**
	 * Notice rev. number 通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(int value) {
		setConstNumber(offset + 43, $pay_ntc_rev, value);
	}

	/**
	 * Notice rev. number 通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(long value) {
		setConstNumber(offset + 43, $pay_ntc_rev, value);
	}

	/**
	 * Notice rev. number 通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(float value) {
		setConstNumber(offset + 43, $pay_ntc_rev, value);
	}

	/**
	 * Notice rev. number 通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(double value) {
		setConstNumber(offset + 43, $pay_ntc_rev, value);
	}


	/**
	 * Uncollated 未照合.<p>
	 *
	 */
	public boolean unchk_flg() {
		return getConstBoolean(offset + 44, $unchk_flg);
	}

	/**
	 * Uncollated 未照合.<p>
	 *
	 */
	public void unchk_flg(boolean value) {
		setConstBoolean(offset + 44, $unchk_flg, value);
	}


	/**
	 * Schedule 予定.<p>
	 *
	 */
	public boolean schd_flg() {
		return getConstBoolean(offset + 45, $schd_flg);
	}

	/**
	 * Schedule 予定.<p>
	 *
	 */
	public void schd_flg(boolean value) {
		setConstBoolean(offset + 45, $schd_flg, value);
	}


	/**
	 * Paid 支払済.<p>
	 *
	 */
	public boolean act_flg() {
		return getConstBoolean(offset + 46, $act_flg);
	}

	/**
	 * Paid 支払済.<p>
	 *
	 */
	public void act_flg(boolean value) {
		setConstBoolean(offset + 46, $act_flg, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 47, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 47, $aprv_no, value);
	}


	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return getConstString(offset + 48, $aprv_sts_typ);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		setConstString(offset + 48, $aprv_sts_typ, value);
	}


	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public String aprv_sts_typ_nm() {
		return getConstString(offset + 49, $aprv_sts_typ_nm);
	}

	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public void aprv_sts_typ_nm(String value) {
		setConstString(offset + 49, $aprv_sts_typ_nm, value);
	}


	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 50, $aprv_flg);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 50, $aprv_flg, value);
	}


	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public boolean aprv_upd_flg() {
		return getConstBoolean(offset + 51, $aprv_upd_flg);
	}

	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public void aprv_upd_flg(boolean value) {
		setConstBoolean(offset + 51, $aprv_upd_flg, value);
	}


	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public boolean aprv_can_flg() {
		return getConstBoolean(offset + 52, $aprv_can_flg);
	}

	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public void aprv_can_flg(boolean value) {
		setConstBoolean(offset + 52, $aprv_can_flg, value);
	}


	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public String pay_sts_typ() {
		return getConstString(offset + 53, $pay_sts_typ);
	}

	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public void pay_sts_typ(String value) {
		setConstString(offset + 53, $pay_sts_typ, value);
	}


	/**
	 * Payment status type name 支払状況区分名.<p>
	 *
	 */
	public String pay_sts_typ_nm() {
		return getConstString(offset + 54, $pay_sts_typ_nm);
	}

	/**
	 * Payment status type name 支払状況区分名.<p>
	 *
	 */
	public void pay_sts_typ_nm(String value) {
		setConstString(offset + 54, $pay_sts_typ_nm, value);
	}


	/**
	 * Payment unit tax 支払単位税.<p>
	 *
	 */
	public boolean tax_on_pay_flg() {
		return getConstBoolean(offset + 55, $tax_on_pay_flg);
	}

	/**
	 * Payment unit tax 支払単位税.<p>
	 *
	 */
	public void tax_on_pay_flg(boolean value) {
		setConstBoolean(offset + 55, $tax_on_pay_flg, value);
	}


	/**
	 * Manual マニュアル.<p>
	 *
	 */
	public boolean manual_flg() {
		return getConstBoolean(offset + 56, $manual_flg);
	}

	/**
	 * Manual マニュアル.<p>
	 *
	 */
	public void manual_flg(boolean value) {
		setConstBoolean(offset + 56, $manual_flg, value);
	}


	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public boolean pay_spot_flg() {
		return getConstBoolean(offset + 57, $pay_spot_flg);
	}

	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public void pay_spot_flg(boolean value) {
		setConstBoolean(offset + 57, $pay_spot_flg, value);
	}


	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public boolean batch_pay_schd_cl_flg() {
		return getConstBoolean(offset + 58, $batch_pay_schd_cl_flg);
	}

	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public void batch_pay_schd_cl_flg(boolean value) {
		setConstBoolean(offset + 58, $batch_pay_schd_cl_flg, value);
	}


	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public String pay_schd_d_print_rmrks() {
		return getConstString(offset + 59, $pay_schd_d_print_rmrks);
	}

	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public void pay_schd_d_print_rmrks(String value) {
		setConstString(offset + 59, $pay_schd_d_print_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 60, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 60, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 61, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 61, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 62, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 62, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 63, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 63, $sub_char3, value);
	}


	/**
	 * Min. recording date 最小計上日.<p>
	 *
	 */
	public MCDate min_ac_dt() {
		return getConstDate(offset + 64, $min_ac_dt);
	}

	/**
	 * Min. recording date 最小計上日.<p>
	 *
	 */
	public void min_ac_dt(MCDate value) {
		setConstDate(offset + 64, $min_ac_dt, value);
	}


	/**
	 * Max. recording date 最大計上日.<p>
	 *
	 */
	public MCDate max_ac_dt() {
		return getConstDate(offset + 65, $max_ac_dt);
	}

	/**
	 * Max. recording date 最大計上日.<p>
	 *
	 */
	public void max_ac_dt(MCDate value) {
		setConstDate(offset + 65, $max_ac_dt, value);
	}


	/**
	 * Scheduled payee classification cd. 1 支払予定管理先分類ＣＤ１.<p>
	 *
	 */
	public String bsppl_grp_cd1() {
		return getConstString(offset + 66, $bsppl_grp_cd1);
	}

	/**
	 * Scheduled payee classification cd. 1 支払予定管理先分類ＣＤ１.<p>
	 *
	 */
	public void bsppl_grp_cd1(String value) {
		setConstString(offset + 66, $bsppl_grp_cd1, value);
	}


	/**
	 * Scheduled payee classification name 1 支払予定管理先分類名１.<p>
	 *
	 */
	public String bsppl_grp_nm1() {
		return getConstString(offset + 67, $bsppl_grp_nm1);
	}

	/**
	 * Scheduled payee classification name 1 支払予定管理先分類名１.<p>
	 *
	 */
	public void bsppl_grp_nm1(String value) {
		setConstString(offset + 67, $bsppl_grp_nm1, value);
	}


	/**
	 * Scheduled payee classification cd. 2 支払予定管理先分類ＣＤ２.<p>
	 *
	 */
	public String bsppl_grp_cd2() {
		return getConstString(offset + 68, $bsppl_grp_cd2);
	}

	/**
	 * Scheduled payee classification cd. 2 支払予定管理先分類ＣＤ２.<p>
	 *
	 */
	public void bsppl_grp_cd2(String value) {
		setConstString(offset + 68, $bsppl_grp_cd2, value);
	}


	/**
	 * Scheduled payee classification name 2 支払予定管理先分類名２.<p>
	 *
	 */
	public String bsppl_grp_nm2() {
		return getConstString(offset + 69, $bsppl_grp_nm2);
	}

	/**
	 * Scheduled payee classification name 2 支払予定管理先分類名２.<p>
	 *
	 */
	public void bsppl_grp_nm2(String value) {
		setConstString(offset + 69, $bsppl_grp_nm2, value);
	}


	/**
	 * Scheduled payee classification cd. 3 支払予定管理先分類ＣＤ３.<p>
	 *
	 */
	public String bsppl_grp_cd3() {
		return getConstString(offset + 70, $bsppl_grp_cd3);
	}

	/**
	 * Scheduled payee classification cd. 3 支払予定管理先分類ＣＤ３.<p>
	 *
	 */
	public void bsppl_grp_cd3(String value) {
		setConstString(offset + 70, $bsppl_grp_cd3, value);
	}


	/**
	 * Scheduled payee classification name 3 支払予定管理先分類名３.<p>
	 *
	 */
	public String bsppl_grp_nm3() {
		return getConstString(offset + 71, $bsppl_grp_nm3);
	}

	/**
	 * Scheduled payee classification name 3 支払予定管理先分類名３.<p>
	 *
	 */
	public void bsppl_grp_nm3(String value) {
		setConstString(offset + 71, $bsppl_grp_nm3, value);
	}


	/**
	 * Scheduled payee classification cd. 4 支払予定管理先分類ＣＤ４.<p>
	 *
	 */
	public String bsppl_grp_cd4() {
		return getConstString(offset + 72, $bsppl_grp_cd4);
	}

	/**
	 * Scheduled payee classification cd. 4 支払予定管理先分類ＣＤ４.<p>
	 *
	 */
	public void bsppl_grp_cd4(String value) {
		setConstString(offset + 72, $bsppl_grp_cd4, value);
	}


	/**
	 * Scheduled payee classification name 4 支払予定管理先分類名４.<p>
	 *
	 */
	public String bsppl_grp_nm4() {
		return getConstString(offset + 73, $bsppl_grp_nm4);
	}

	/**
	 * Scheduled payee classification name 4 支払予定管理先分類名４.<p>
	 *
	 */
	public void bsppl_grp_nm4(String value) {
		setConstString(offset + 73, $bsppl_grp_nm4, value);
	}


	/**
	 * Scheduled payee classification cd. 5 支払予定管理先分類ＣＤ５.<p>
	 *
	 */
	public String bsppl_grp_cd5() {
		return getConstString(offset + 74, $bsppl_grp_cd5);
	}

	/**
	 * Scheduled payee classification cd. 5 支払予定管理先分類ＣＤ５.<p>
	 *
	 */
	public void bsppl_grp_cd5(String value) {
		setConstString(offset + 74, $bsppl_grp_cd5, value);
	}


	/**
	 * Scheduled payee classification name 5 支払予定管理先分類名５.<p>
	 *
	 */
	public String bsppl_grp_nm5() {
		return getConstString(offset + 75, $bsppl_grp_nm5);
	}

	/**
	 * Scheduled payee classification name 5 支払予定管理先分類名５.<p>
	 *
	 */
	public void bsppl_grp_nm5(String value) {
		setConstString(offset + 75, $bsppl_grp_nm5, value);
	}


	/**
	 * Scheduled payee classification cd. 6 支払予定管理先分類ＣＤ６.<p>
	 *
	 */
	public String bsppl_grp_cd6() {
		return getConstString(offset + 76, $bsppl_grp_cd6);
	}

	/**
	 * Scheduled payee classification cd. 6 支払予定管理先分類ＣＤ６.<p>
	 *
	 */
	public void bsppl_grp_cd6(String value) {
		setConstString(offset + 76, $bsppl_grp_cd6, value);
	}


	/**
	 * Scheduled payee classification name 6 支払予定管理先分類名６.<p>
	 *
	 */
	public String bsppl_grp_nm6() {
		return getConstString(offset + 77, $bsppl_grp_nm6);
	}

	/**
	 * Scheduled payee classification name 6 支払予定管理先分類名６.<p>
	 *
	 */
	public void bsppl_grp_nm6(String value) {
		setConstString(offset + 77, $bsppl_grp_nm6, value);
	}


	/**
	 * Scheduled payee classification cd. 7 支払予定管理先分類ＣＤ７.<p>
	 *
	 */
	public String bsppl_grp_cd7() {
		return getConstString(offset + 78, $bsppl_grp_cd7);
	}

	/**
	 * Scheduled payee classification cd. 7 支払予定管理先分類ＣＤ７.<p>
	 *
	 */
	public void bsppl_grp_cd7(String value) {
		setConstString(offset + 78, $bsppl_grp_cd7, value);
	}


	/**
	 * Scheduled payee classification name 7 支払予定管理先分類名７.<p>
	 *
	 */
	public String bsppl_grp_nm7() {
		return getConstString(offset + 79, $bsppl_grp_nm7);
	}

	/**
	 * Scheduled payee classification name 7 支払予定管理先分類名７.<p>
	 *
	 */
	public void bsppl_grp_nm7(String value) {
		setConstString(offset + 79, $bsppl_grp_nm7, value);
	}


	/**
	 * Scheduled payee classification cd. 8 支払予定管理先分類ＣＤ８.<p>
	 *
	 */
	public String bsppl_grp_cd8() {
		return getConstString(offset + 80, $bsppl_grp_cd8);
	}

	/**
	 * Scheduled payee classification cd. 8 支払予定管理先分類ＣＤ８.<p>
	 *
	 */
	public void bsppl_grp_cd8(String value) {
		setConstString(offset + 80, $bsppl_grp_cd8, value);
	}


	/**
	 * Scheduled payee classification name 8 支払予定管理先分類名８.<p>
	 *
	 */
	public String bsppl_grp_nm8() {
		return getConstString(offset + 81, $bsppl_grp_nm8);
	}

	/**
	 * Scheduled payee classification name 8 支払予定管理先分類名８.<p>
	 *
	 */
	public void bsppl_grp_nm8(String value) {
		setConstString(offset + 81, $bsppl_grp_nm8, value);
	}


	/**
	 * Scheduled payee classification cd. 9 支払予定管理先分類ＣＤ９.<p>
	 *
	 */
	public String bsppl_grp_cd9() {
		return getConstString(offset + 82, $bsppl_grp_cd9);
	}

	/**
	 * Scheduled payee classification cd. 9 支払予定管理先分類ＣＤ９.<p>
	 *
	 */
	public void bsppl_grp_cd9(String value) {
		setConstString(offset + 82, $bsppl_grp_cd9, value);
	}


	/**
	 * Scheduled payee classification name 9 支払予定管理先分類名９.<p>
	 *
	 */
	public String bsppl_grp_nm9() {
		return getConstString(offset + 83, $bsppl_grp_nm9);
	}

	/**
	 * Scheduled payee classification name 9 支払予定管理先分類名９.<p>
	 *
	 */
	public void bsppl_grp_nm9(String value) {
		setConstString(offset + 83, $bsppl_grp_nm9, value);
	}


	/**
	 * Scheduled payee classification cd. 10 支払予定管理先分類ＣＤ１０.<p>
	 *
	 */
	public String bsppl_grp_cd10() {
		return getConstString(offset + 84, $bsppl_grp_cd10);
	}

	/**
	 * Scheduled payee classification cd. 10 支払予定管理先分類ＣＤ１０.<p>
	 *
	 */
	public void bsppl_grp_cd10(String value) {
		setConstString(offset + 84, $bsppl_grp_cd10, value);
	}


	/**
	 * Scheduled payee classification name 10 支払予定管理先分類名１０.<p>
	 *
	 */
	public String bsppl_grp_nm10() {
		return getConstString(offset + 85, $bsppl_grp_nm10);
	}

	/**
	 * Scheduled payee classification name 10 支払予定管理先分類名１０.<p>
	 *
	 */
	public void bsppl_grp_nm10(String value) {
		setConstString(offset + 85, $bsppl_grp_nm10, value);
	}


	/**
	 * Payee classification cd. 1 支払先分類ＣＤ１.<p>
	 *
	 */
	public String psppl_grp_cd1() {
		return getConstString(offset + 86, $psppl_grp_cd1);
	}

	/**
	 * Payee classification cd. 1 支払先分類ＣＤ１.<p>
	 *
	 */
	public void psppl_grp_cd1(String value) {
		setConstString(offset + 86, $psppl_grp_cd1, value);
	}


	/**
	 * Payee classification name 1 支払先分類名１.<p>
	 *
	 */
	public String psppl_grp_nm1() {
		return getConstString(offset + 87, $psppl_grp_nm1);
	}

	/**
	 * Payee classification name 1 支払先分類名１.<p>
	 *
	 */
	public void psppl_grp_nm1(String value) {
		setConstString(offset + 87, $psppl_grp_nm1, value);
	}


	/**
	 * Payee classification cd. 2 支払先分類ＣＤ２.<p>
	 *
	 */
	public String psppl_grp_cd2() {
		return getConstString(offset + 88, $psppl_grp_cd2);
	}

	/**
	 * Payee classification cd. 2 支払先分類ＣＤ２.<p>
	 *
	 */
	public void psppl_grp_cd2(String value) {
		setConstString(offset + 88, $psppl_grp_cd2, value);
	}


	/**
	 * Payee classification name 2 支払先分類名２.<p>
	 *
	 */
	public String psppl_grp_nm2() {
		return getConstString(offset + 89, $psppl_grp_nm2);
	}

	/**
	 * Payee classification name 2 支払先分類名２.<p>
	 *
	 */
	public void psppl_grp_nm2(String value) {
		setConstString(offset + 89, $psppl_grp_nm2, value);
	}


	/**
	 * Payee classification cd. 3 支払先分類ＣＤ３.<p>
	 *
	 */
	public String psppl_grp_cd3() {
		return getConstString(offset + 90, $psppl_grp_cd3);
	}

	/**
	 * Payee classification cd. 3 支払先分類ＣＤ３.<p>
	 *
	 */
	public void psppl_grp_cd3(String value) {
		setConstString(offset + 90, $psppl_grp_cd3, value);
	}


	/**
	 * Payee classification name 3 支払先分類名３.<p>
	 *
	 */
	public String psppl_grp_nm3() {
		return getConstString(offset + 91, $psppl_grp_nm3);
	}

	/**
	 * Payee classification name 3 支払先分類名３.<p>
	 *
	 */
	public void psppl_grp_nm3(String value) {
		setConstString(offset + 91, $psppl_grp_nm3, value);
	}


	/**
	 * Payee classification cd. 4 支払先分類ＣＤ４.<p>
	 *
	 */
	public String psppl_grp_cd4() {
		return getConstString(offset + 92, $psppl_grp_cd4);
	}

	/**
	 * Payee classification cd. 4 支払先分類ＣＤ４.<p>
	 *
	 */
	public void psppl_grp_cd4(String value) {
		setConstString(offset + 92, $psppl_grp_cd4, value);
	}


	/**
	 * Payee classification name 4 支払先分類名４.<p>
	 *
	 */
	public String psppl_grp_nm4() {
		return getConstString(offset + 93, $psppl_grp_nm4);
	}

	/**
	 * Payee classification name 4 支払先分類名４.<p>
	 *
	 */
	public void psppl_grp_nm4(String value) {
		setConstString(offset + 93, $psppl_grp_nm4, value);
	}


	/**
	 * Payee classification cd. 5 支払先分類ＣＤ５.<p>
	 *
	 */
	public String psppl_grp_cd5() {
		return getConstString(offset + 94, $psppl_grp_cd5);
	}

	/**
	 * Payee classification cd. 5 支払先分類ＣＤ５.<p>
	 *
	 */
	public void psppl_grp_cd5(String value) {
		setConstString(offset + 94, $psppl_grp_cd5, value);
	}


	/**
	 * Payee classification name 5 支払先分類名５.<p>
	 *
	 */
	public String psppl_grp_nm5() {
		return getConstString(offset + 95, $psppl_grp_nm5);
	}

	/**
	 * Payee classification name 5 支払先分類名５.<p>
	 *
	 */
	public void psppl_grp_nm5(String value) {
		setConstString(offset + 95, $psppl_grp_nm5, value);
	}


	/**
	 * Payee classification cd. 6 支払先分類ＣＤ６.<p>
	 *
	 */
	public String psppl_grp_cd6() {
		return getConstString(offset + 96, $psppl_grp_cd6);
	}

	/**
	 * Payee classification cd. 6 支払先分類ＣＤ６.<p>
	 *
	 */
	public void psppl_grp_cd6(String value) {
		setConstString(offset + 96, $psppl_grp_cd6, value);
	}


	/**
	 * Payee classification name 6 支払先分類名６.<p>
	 *
	 */
	public String psppl_grp_nm6() {
		return getConstString(offset + 97, $psppl_grp_nm6);
	}

	/**
	 * Payee classification name 6 支払先分類名６.<p>
	 *
	 */
	public void psppl_grp_nm6(String value) {
		setConstString(offset + 97, $psppl_grp_nm6, value);
	}


	/**
	 * Payee classification cd. 7 支払先分類ＣＤ７.<p>
	 *
	 */
	public String psppl_grp_cd7() {
		return getConstString(offset + 98, $psppl_grp_cd7);
	}

	/**
	 * Payee classification cd. 7 支払先分類ＣＤ７.<p>
	 *
	 */
	public void psppl_grp_cd7(String value) {
		setConstString(offset + 98, $psppl_grp_cd7, value);
	}


	/**
	 * Payee classification name 7 支払先分類名７.<p>
	 *
	 */
	public String psppl_grp_nm7() {
		return getConstString(offset + 99, $psppl_grp_nm7);
	}

	/**
	 * Payee classification name 7 支払先分類名７.<p>
	 *
	 */
	public void psppl_grp_nm7(String value) {
		setConstString(offset + 99, $psppl_grp_nm7, value);
	}


	/**
	 * Payee classification cd. 8 支払先分類ＣＤ８.<p>
	 *
	 */
	public String psppl_grp_cd8() {
		return getConstString(offset + 100, $psppl_grp_cd8);
	}

	/**
	 * Payee classification cd. 8 支払先分類ＣＤ８.<p>
	 *
	 */
	public void psppl_grp_cd8(String value) {
		setConstString(offset + 100, $psppl_grp_cd8, value);
	}


	/**
	 * Payee classification name 8 支払先分類名８.<p>
	 *
	 */
	public String psppl_grp_nm8() {
		return getConstString(offset + 101, $psppl_grp_nm8);
	}

	/**
	 * Payee classification name 8 支払先分類名８.<p>
	 *
	 */
	public void psppl_grp_nm8(String value) {
		setConstString(offset + 101, $psppl_grp_nm8, value);
	}


	/**
	 * Payee classification cd. 9 支払先分類ＣＤ９.<p>
	 *
	 */
	public String psppl_grp_cd9() {
		return getConstString(offset + 102, $psppl_grp_cd9);
	}

	/**
	 * Payee classification cd. 9 支払先分類ＣＤ９.<p>
	 *
	 */
	public void psppl_grp_cd9(String value) {
		setConstString(offset + 102, $psppl_grp_cd9, value);
	}


	/**
	 * Payee classification name 9 支払先分類名９.<p>
	 *
	 */
	public String psppl_grp_nm9() {
		return getConstString(offset + 103, $psppl_grp_nm9);
	}

	/**
	 * Payee classification name 9 支払先分類名９.<p>
	 *
	 */
	public void psppl_grp_nm9(String value) {
		setConstString(offset + 103, $psppl_grp_nm9, value);
	}


	/**
	 * Payee classification cd. 10 支払先分類ＣＤ１０.<p>
	 *
	 */
	public String psppl_grp_cd10() {
		return getConstString(offset + 104, $psppl_grp_cd10);
	}

	/**
	 * Payee classification cd. 10 支払先分類ＣＤ１０.<p>
	 *
	 */
	public void psppl_grp_cd10(String value) {
		setConstString(offset + 104, $psppl_grp_cd10, value);
	}


	/**
	 * Payee classification name 10 支払先分類名１０.<p>
	 *
	 */
	public String psppl_grp_nm10() {
		return getConstString(offset + 105, $psppl_grp_nm10);
	}

	/**
	 * Payee classification name 10 支払先分類名１０.<p>
	 *
	 */
	public void psppl_grp_nm10(String value) {
		setConstString(offset + 105, $psppl_grp_nm10, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 106, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 106, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 107, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 107, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 108, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 108, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 109, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 109, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 110, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 110, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 111, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 111, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 112, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 112, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 113, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 113, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 114, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 114, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 115, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 115, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 116, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 116, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($bsppl_usr_cd.equalsIgnoreCase(name)) {
			return bsppl_usr_cd();
		}
		if ($bsppl_usr_nm.equalsIgnoreCase(name)) {
			return bsppl_usr_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		if ($pay_xrate_cd.equalsIgnoreCase(name)) {
			return pay_xrate_cd();
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
		if ($bsppl_grp_cd1.equalsIgnoreCase(name)) {
			return bsppl_grp_cd1();
		}
		if ($bsppl_grp_nm1.equalsIgnoreCase(name)) {
			return bsppl_grp_nm1();
		}
		if ($bsppl_grp_cd2.equalsIgnoreCase(name)) {
			return bsppl_grp_cd2();
		}
		if ($bsppl_grp_nm2.equalsIgnoreCase(name)) {
			return bsppl_grp_nm2();
		}
		if ($bsppl_grp_cd3.equalsIgnoreCase(name)) {
			return bsppl_grp_cd3();
		}
		if ($bsppl_grp_nm3.equalsIgnoreCase(name)) {
			return bsppl_grp_nm3();
		}
		if ($bsppl_grp_cd4.equalsIgnoreCase(name)) {
			return bsppl_grp_cd4();
		}
		if ($bsppl_grp_nm4.equalsIgnoreCase(name)) {
			return bsppl_grp_nm4();
		}
		if ($bsppl_grp_cd5.equalsIgnoreCase(name)) {
			return bsppl_grp_cd5();
		}
		if ($bsppl_grp_nm5.equalsIgnoreCase(name)) {
			return bsppl_grp_nm5();
		}
		if ($bsppl_grp_cd6.equalsIgnoreCase(name)) {
			return bsppl_grp_cd6();
		}
		if ($bsppl_grp_nm6.equalsIgnoreCase(name)) {
			return bsppl_grp_nm6();
		}
		if ($bsppl_grp_cd7.equalsIgnoreCase(name)) {
			return bsppl_grp_cd7();
		}
		if ($bsppl_grp_nm7.equalsIgnoreCase(name)) {
			return bsppl_grp_nm7();
		}
		if ($bsppl_grp_cd8.equalsIgnoreCase(name)) {
			return bsppl_grp_cd8();
		}
		if ($bsppl_grp_nm8.equalsIgnoreCase(name)) {
			return bsppl_grp_nm8();
		}
		if ($bsppl_grp_cd9.equalsIgnoreCase(name)) {
			return bsppl_grp_cd9();
		}
		if ($bsppl_grp_nm9.equalsIgnoreCase(name)) {
			return bsppl_grp_nm9();
		}
		if ($bsppl_grp_cd10.equalsIgnoreCase(name)) {
			return bsppl_grp_cd10();
		}
		if ($bsppl_grp_nm10.equalsIgnoreCase(name)) {
			return bsppl_grp_nm10();
		}
		if ($psppl_grp_cd1.equalsIgnoreCase(name)) {
			return psppl_grp_cd1();
		}
		if ($psppl_grp_nm1.equalsIgnoreCase(name)) {
			return psppl_grp_nm1();
		}
		if ($psppl_grp_cd2.equalsIgnoreCase(name)) {
			return psppl_grp_cd2();
		}
		if ($psppl_grp_nm2.equalsIgnoreCase(name)) {
			return psppl_grp_nm2();
		}
		if ($psppl_grp_cd3.equalsIgnoreCase(name)) {
			return psppl_grp_cd3();
		}
		if ($psppl_grp_nm3.equalsIgnoreCase(name)) {
			return psppl_grp_nm3();
		}
		if ($psppl_grp_cd4.equalsIgnoreCase(name)) {
			return psppl_grp_cd4();
		}
		if ($psppl_grp_nm4.equalsIgnoreCase(name)) {
			return psppl_grp_nm4();
		}
		if ($psppl_grp_cd5.equalsIgnoreCase(name)) {
			return psppl_grp_cd5();
		}
		if ($psppl_grp_nm5.equalsIgnoreCase(name)) {
			return psppl_grp_nm5();
		}
		if ($psppl_grp_cd6.equalsIgnoreCase(name)) {
			return psppl_grp_cd6();
		}
		if ($psppl_grp_nm6.equalsIgnoreCase(name)) {
			return psppl_grp_nm6();
		}
		if ($psppl_grp_cd7.equalsIgnoreCase(name)) {
			return psppl_grp_cd7();
		}
		if ($psppl_grp_nm7.equalsIgnoreCase(name)) {
			return psppl_grp_nm7();
		}
		if ($psppl_grp_cd8.equalsIgnoreCase(name)) {
			return psppl_grp_cd8();
		}
		if ($psppl_grp_nm8.equalsIgnoreCase(name)) {
			return psppl_grp_nm8();
		}
		if ($psppl_grp_cd9.equalsIgnoreCase(name)) {
			return psppl_grp_cd9();
		}
		if ($psppl_grp_nm9.equalsIgnoreCase(name)) {
			return psppl_grp_nm9();
		}
		if ($psppl_grp_cd10.equalsIgnoreCase(name)) {
			return psppl_grp_cd10();
		}
		if ($psppl_grp_nm10.equalsIgnoreCase(name)) {
			return psppl_grp_nm10();
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			return com_paid();
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			return com_paid_tax_amt();
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			return last_pay_schd_amt();
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			return account_amt();
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			return cash_amt();
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			return note_amt();
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			return setoff_tax_amt();
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			return adv_pay_bal();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			return pay_xrate();
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			return pay_ntc_rev();
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
		if ($min_ac_dt.equalsIgnoreCase(name)) {
			return min_ac_dt();
		}
		if ($max_ac_dt.equalsIgnoreCase(name)) {
			return max_ac_dt();
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
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($bsppl_usr_cd.equalsIgnoreCase(name)) {
			return bsppl_usr_cd();
		}
		if ($bsppl_usr_nm.equalsIgnoreCase(name)) {
			return bsppl_usr_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		if ($pay_xrate_cd.equalsIgnoreCase(name)) {
			return pay_xrate_cd();
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
		if ($bsppl_grp_cd1.equalsIgnoreCase(name)) {
			return bsppl_grp_cd1();
		}
		if ($bsppl_grp_nm1.equalsIgnoreCase(name)) {
			return bsppl_grp_nm1();
		}
		if ($bsppl_grp_cd2.equalsIgnoreCase(name)) {
			return bsppl_grp_cd2();
		}
		if ($bsppl_grp_nm2.equalsIgnoreCase(name)) {
			return bsppl_grp_nm2();
		}
		if ($bsppl_grp_cd3.equalsIgnoreCase(name)) {
			return bsppl_grp_cd3();
		}
		if ($bsppl_grp_nm3.equalsIgnoreCase(name)) {
			return bsppl_grp_nm3();
		}
		if ($bsppl_grp_cd4.equalsIgnoreCase(name)) {
			return bsppl_grp_cd4();
		}
		if ($bsppl_grp_nm4.equalsIgnoreCase(name)) {
			return bsppl_grp_nm4();
		}
		if ($bsppl_grp_cd5.equalsIgnoreCase(name)) {
			return bsppl_grp_cd5();
		}
		if ($bsppl_grp_nm5.equalsIgnoreCase(name)) {
			return bsppl_grp_nm5();
		}
		if ($bsppl_grp_cd6.equalsIgnoreCase(name)) {
			return bsppl_grp_cd6();
		}
		if ($bsppl_grp_nm6.equalsIgnoreCase(name)) {
			return bsppl_grp_nm6();
		}
		if ($bsppl_grp_cd7.equalsIgnoreCase(name)) {
			return bsppl_grp_cd7();
		}
		if ($bsppl_grp_nm7.equalsIgnoreCase(name)) {
			return bsppl_grp_nm7();
		}
		if ($bsppl_grp_cd8.equalsIgnoreCase(name)) {
			return bsppl_grp_cd8();
		}
		if ($bsppl_grp_nm8.equalsIgnoreCase(name)) {
			return bsppl_grp_nm8();
		}
		if ($bsppl_grp_cd9.equalsIgnoreCase(name)) {
			return bsppl_grp_cd9();
		}
		if ($bsppl_grp_nm9.equalsIgnoreCase(name)) {
			return bsppl_grp_nm9();
		}
		if ($bsppl_grp_cd10.equalsIgnoreCase(name)) {
			return bsppl_grp_cd10();
		}
		if ($bsppl_grp_nm10.equalsIgnoreCase(name)) {
			return bsppl_grp_nm10();
		}
		if ($psppl_grp_cd1.equalsIgnoreCase(name)) {
			return psppl_grp_cd1();
		}
		if ($psppl_grp_nm1.equalsIgnoreCase(name)) {
			return psppl_grp_nm1();
		}
		if ($psppl_grp_cd2.equalsIgnoreCase(name)) {
			return psppl_grp_cd2();
		}
		if ($psppl_grp_nm2.equalsIgnoreCase(name)) {
			return psppl_grp_nm2();
		}
		if ($psppl_grp_cd3.equalsIgnoreCase(name)) {
			return psppl_grp_cd3();
		}
		if ($psppl_grp_nm3.equalsIgnoreCase(name)) {
			return psppl_grp_nm3();
		}
		if ($psppl_grp_cd4.equalsIgnoreCase(name)) {
			return psppl_grp_cd4();
		}
		if ($psppl_grp_nm4.equalsIgnoreCase(name)) {
			return psppl_grp_nm4();
		}
		if ($psppl_grp_cd5.equalsIgnoreCase(name)) {
			return psppl_grp_cd5();
		}
		if ($psppl_grp_nm5.equalsIgnoreCase(name)) {
			return psppl_grp_nm5();
		}
		if ($psppl_grp_cd6.equalsIgnoreCase(name)) {
			return psppl_grp_cd6();
		}
		if ($psppl_grp_nm6.equalsIgnoreCase(name)) {
			return psppl_grp_nm6();
		}
		if ($psppl_grp_cd7.equalsIgnoreCase(name)) {
			return psppl_grp_cd7();
		}
		if ($psppl_grp_nm7.equalsIgnoreCase(name)) {
			return psppl_grp_nm7();
		}
		if ($psppl_grp_cd8.equalsIgnoreCase(name)) {
			return psppl_grp_cd8();
		}
		if ($psppl_grp_nm8.equalsIgnoreCase(name)) {
			return psppl_grp_nm8();
		}
		if ($psppl_grp_cd9.equalsIgnoreCase(name)) {
			return psppl_grp_cd9();
		}
		if ($psppl_grp_nm9.equalsIgnoreCase(name)) {
			return psppl_grp_nm9();
		}
		if ($psppl_grp_cd10.equalsIgnoreCase(name)) {
			return psppl_grp_cd10();
		}
		if ($psppl_grp_nm10.equalsIgnoreCase(name)) {
			return psppl_grp_nm10();
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			return com_paid();
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			return com_paid_tax_amt();
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			return last_pay_schd_amt();
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			return account_amt();
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			return cash_amt();
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			return note_amt();
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			return setoff_tax_amt();
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			return adv_pay_bal();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			return pay_xrate();
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			return pay_ntc_rev();
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
		if ($min_ac_dt.equalsIgnoreCase(name)) {
			return min_ac_dt();
		}
		if ($max_ac_dt.equalsIgnoreCase(name)) {
			return max_ac_dt();
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
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
			return;
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			bsppl_dpt_nm(value);
			return;
		}
		if ($bsppl_usr_cd.equalsIgnoreCase(name)) {
			bsppl_usr_cd(value);
			return;
		}
		if ($bsppl_usr_nm.equalsIgnoreCase(name)) {
			bsppl_usr_nm(value);
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
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($pay_xrate_cd.equalsIgnoreCase(name)) {
			pay_xrate_cd(value);
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
		if ($bsppl_grp_cd1.equalsIgnoreCase(name)) {
			bsppl_grp_cd1(value);
			return;
		}
		if ($bsppl_grp_nm1.equalsIgnoreCase(name)) {
			bsppl_grp_nm1(value);
			return;
		}
		if ($bsppl_grp_cd2.equalsIgnoreCase(name)) {
			bsppl_grp_cd2(value);
			return;
		}
		if ($bsppl_grp_nm2.equalsIgnoreCase(name)) {
			bsppl_grp_nm2(value);
			return;
		}
		if ($bsppl_grp_cd3.equalsIgnoreCase(name)) {
			bsppl_grp_cd3(value);
			return;
		}
		if ($bsppl_grp_nm3.equalsIgnoreCase(name)) {
			bsppl_grp_nm3(value);
			return;
		}
		if ($bsppl_grp_cd4.equalsIgnoreCase(name)) {
			bsppl_grp_cd4(value);
			return;
		}
		if ($bsppl_grp_nm4.equalsIgnoreCase(name)) {
			bsppl_grp_nm4(value);
			return;
		}
		if ($bsppl_grp_cd5.equalsIgnoreCase(name)) {
			bsppl_grp_cd5(value);
			return;
		}
		if ($bsppl_grp_nm5.equalsIgnoreCase(name)) {
			bsppl_grp_nm5(value);
			return;
		}
		if ($bsppl_grp_cd6.equalsIgnoreCase(name)) {
			bsppl_grp_cd6(value);
			return;
		}
		if ($bsppl_grp_nm6.equalsIgnoreCase(name)) {
			bsppl_grp_nm6(value);
			return;
		}
		if ($bsppl_grp_cd7.equalsIgnoreCase(name)) {
			bsppl_grp_cd7(value);
			return;
		}
		if ($bsppl_grp_nm7.equalsIgnoreCase(name)) {
			bsppl_grp_nm7(value);
			return;
		}
		if ($bsppl_grp_cd8.equalsIgnoreCase(name)) {
			bsppl_grp_cd8(value);
			return;
		}
		if ($bsppl_grp_nm8.equalsIgnoreCase(name)) {
			bsppl_grp_nm8(value);
			return;
		}
		if ($bsppl_grp_cd9.equalsIgnoreCase(name)) {
			bsppl_grp_cd9(value);
			return;
		}
		if ($bsppl_grp_nm9.equalsIgnoreCase(name)) {
			bsppl_grp_nm9(value);
			return;
		}
		if ($bsppl_grp_cd10.equalsIgnoreCase(name)) {
			bsppl_grp_cd10(value);
			return;
		}
		if ($bsppl_grp_nm10.equalsIgnoreCase(name)) {
			bsppl_grp_nm10(value);
			return;
		}
		if ($psppl_grp_cd1.equalsIgnoreCase(name)) {
			psppl_grp_cd1(value);
			return;
		}
		if ($psppl_grp_nm1.equalsIgnoreCase(name)) {
			psppl_grp_nm1(value);
			return;
		}
		if ($psppl_grp_cd2.equalsIgnoreCase(name)) {
			psppl_grp_cd2(value);
			return;
		}
		if ($psppl_grp_nm2.equalsIgnoreCase(name)) {
			psppl_grp_nm2(value);
			return;
		}
		if ($psppl_grp_cd3.equalsIgnoreCase(name)) {
			psppl_grp_cd3(value);
			return;
		}
		if ($psppl_grp_nm3.equalsIgnoreCase(name)) {
			psppl_grp_nm3(value);
			return;
		}
		if ($psppl_grp_cd4.equalsIgnoreCase(name)) {
			psppl_grp_cd4(value);
			return;
		}
		if ($psppl_grp_nm4.equalsIgnoreCase(name)) {
			psppl_grp_nm4(value);
			return;
		}
		if ($psppl_grp_cd5.equalsIgnoreCase(name)) {
			psppl_grp_cd5(value);
			return;
		}
		if ($psppl_grp_nm5.equalsIgnoreCase(name)) {
			psppl_grp_nm5(value);
			return;
		}
		if ($psppl_grp_cd6.equalsIgnoreCase(name)) {
			psppl_grp_cd6(value);
			return;
		}
		if ($psppl_grp_nm6.equalsIgnoreCase(name)) {
			psppl_grp_nm6(value);
			return;
		}
		if ($psppl_grp_cd7.equalsIgnoreCase(name)) {
			psppl_grp_cd7(value);
			return;
		}
		if ($psppl_grp_nm7.equalsIgnoreCase(name)) {
			psppl_grp_nm7(value);
			return;
		}
		if ($psppl_grp_cd8.equalsIgnoreCase(name)) {
			psppl_grp_cd8(value);
			return;
		}
		if ($psppl_grp_nm8.equalsIgnoreCase(name)) {
			psppl_grp_nm8(value);
			return;
		}
		if ($psppl_grp_cd9.equalsIgnoreCase(name)) {
			psppl_grp_cd9(value);
			return;
		}
		if ($psppl_grp_nm9.equalsIgnoreCase(name)) {
			psppl_grp_nm9(value);
			return;
		}
		if ($psppl_grp_cd10.equalsIgnoreCase(name)) {
			psppl_grp_cd10(value);
			return;
		}
		if ($psppl_grp_nm10.equalsIgnoreCase(name)) {
			psppl_grp_nm10(value);
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			com_paid_tax_amt(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			com_paid_tax_amt(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			com_paid_tax_amt(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			com_paid_tax_amt(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			com_paid_tax_amt(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
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
		if ($min_ac_dt.equalsIgnoreCase(name)) {
			min_ac_dt(value);
			return;
		}
		if ($max_ac_dt.equalsIgnoreCase(name)) {
			max_ac_dt(value);
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
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
			return;
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			bsppl_dpt_nm(value);
			return;
		}
		if ($bsppl_usr_cd.equalsIgnoreCase(name)) {
			bsppl_usr_cd(value);
			return;
		}
		if ($bsppl_usr_nm.equalsIgnoreCase(name)) {
			bsppl_usr_nm(value);
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
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($pay_xrate_cd.equalsIgnoreCase(name)) {
			pay_xrate_cd(value);
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
		if ($bsppl_grp_cd1.equalsIgnoreCase(name)) {
			bsppl_grp_cd1(value);
			return;
		}
		if ($bsppl_grp_nm1.equalsIgnoreCase(name)) {
			bsppl_grp_nm1(value);
			return;
		}
		if ($bsppl_grp_cd2.equalsIgnoreCase(name)) {
			bsppl_grp_cd2(value);
			return;
		}
		if ($bsppl_grp_nm2.equalsIgnoreCase(name)) {
			bsppl_grp_nm2(value);
			return;
		}
		if ($bsppl_grp_cd3.equalsIgnoreCase(name)) {
			bsppl_grp_cd3(value);
			return;
		}
		if ($bsppl_grp_nm3.equalsIgnoreCase(name)) {
			bsppl_grp_nm3(value);
			return;
		}
		if ($bsppl_grp_cd4.equalsIgnoreCase(name)) {
			bsppl_grp_cd4(value);
			return;
		}
		if ($bsppl_grp_nm4.equalsIgnoreCase(name)) {
			bsppl_grp_nm4(value);
			return;
		}
		if ($bsppl_grp_cd5.equalsIgnoreCase(name)) {
			bsppl_grp_cd5(value);
			return;
		}
		if ($bsppl_grp_nm5.equalsIgnoreCase(name)) {
			bsppl_grp_nm5(value);
			return;
		}
		if ($bsppl_grp_cd6.equalsIgnoreCase(name)) {
			bsppl_grp_cd6(value);
			return;
		}
		if ($bsppl_grp_nm6.equalsIgnoreCase(name)) {
			bsppl_grp_nm6(value);
			return;
		}
		if ($bsppl_grp_cd7.equalsIgnoreCase(name)) {
			bsppl_grp_cd7(value);
			return;
		}
		if ($bsppl_grp_nm7.equalsIgnoreCase(name)) {
			bsppl_grp_nm7(value);
			return;
		}
		if ($bsppl_grp_cd8.equalsIgnoreCase(name)) {
			bsppl_grp_cd8(value);
			return;
		}
		if ($bsppl_grp_nm8.equalsIgnoreCase(name)) {
			bsppl_grp_nm8(value);
			return;
		}
		if ($bsppl_grp_cd9.equalsIgnoreCase(name)) {
			bsppl_grp_cd9(value);
			return;
		}
		if ($bsppl_grp_nm9.equalsIgnoreCase(name)) {
			bsppl_grp_nm9(value);
			return;
		}
		if ($bsppl_grp_cd10.equalsIgnoreCase(name)) {
			bsppl_grp_cd10(value);
			return;
		}
		if ($bsppl_grp_nm10.equalsIgnoreCase(name)) {
			bsppl_grp_nm10(value);
			return;
		}
		if ($psppl_grp_cd1.equalsIgnoreCase(name)) {
			psppl_grp_cd1(value);
			return;
		}
		if ($psppl_grp_nm1.equalsIgnoreCase(name)) {
			psppl_grp_nm1(value);
			return;
		}
		if ($psppl_grp_cd2.equalsIgnoreCase(name)) {
			psppl_grp_cd2(value);
			return;
		}
		if ($psppl_grp_nm2.equalsIgnoreCase(name)) {
			psppl_grp_nm2(value);
			return;
		}
		if ($psppl_grp_cd3.equalsIgnoreCase(name)) {
			psppl_grp_cd3(value);
			return;
		}
		if ($psppl_grp_nm3.equalsIgnoreCase(name)) {
			psppl_grp_nm3(value);
			return;
		}
		if ($psppl_grp_cd4.equalsIgnoreCase(name)) {
			psppl_grp_cd4(value);
			return;
		}
		if ($psppl_grp_nm4.equalsIgnoreCase(name)) {
			psppl_grp_nm4(value);
			return;
		}
		if ($psppl_grp_cd5.equalsIgnoreCase(name)) {
			psppl_grp_cd5(value);
			return;
		}
		if ($psppl_grp_nm5.equalsIgnoreCase(name)) {
			psppl_grp_nm5(value);
			return;
		}
		if ($psppl_grp_cd6.equalsIgnoreCase(name)) {
			psppl_grp_cd6(value);
			return;
		}
		if ($psppl_grp_nm6.equalsIgnoreCase(name)) {
			psppl_grp_nm6(value);
			return;
		}
		if ($psppl_grp_cd7.equalsIgnoreCase(name)) {
			psppl_grp_cd7(value);
			return;
		}
		if ($psppl_grp_nm7.equalsIgnoreCase(name)) {
			psppl_grp_nm7(value);
			return;
		}
		if ($psppl_grp_cd8.equalsIgnoreCase(name)) {
			psppl_grp_cd8(value);
			return;
		}
		if ($psppl_grp_nm8.equalsIgnoreCase(name)) {
			psppl_grp_nm8(value);
			return;
		}
		if ($psppl_grp_cd9.equalsIgnoreCase(name)) {
			psppl_grp_cd9(value);
			return;
		}
		if ($psppl_grp_nm9.equalsIgnoreCase(name)) {
			psppl_grp_nm9(value);
			return;
		}
		if ($psppl_grp_cd10.equalsIgnoreCase(name)) {
			psppl_grp_cd10(value);
			return;
		}
		if ($psppl_grp_nm10.equalsIgnoreCase(name)) {
			psppl_grp_nm10(value);
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			com_paid_tax_amt(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			com_paid_tax_amt(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			com_paid_tax_amt(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			com_paid_tax_amt(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			com_paid_tax_amt(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
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
		if ($min_ac_dt.equalsIgnoreCase(name)) {
			min_ac_dt(value);
			return;
		}
		if ($max_ac_dt.equalsIgnoreCase(name)) {
			max_ac_dt(value);
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
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ap_d.equalsIgnoreCase(name)) {
			return ap_d();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ap_d.equalsIgnoreCase(name)) {
			ap_d(
				((MCContainerMeta) ap_d_META).castInnerRow(mcframe.serverMS.dbc.MST_AP_D_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public String ap_d_no() {
		return ap_d().ap_d_no();
	}

	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public void ap_d_no(String value) {
		ap_d().ap_d_no(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return ap_d().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		ap_d().sppl_cd(value);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return ap_d().bsppl_cd();
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		ap_d().bsppl_cd(value);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return ap_d().bsppl_dpt_cd();
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		ap_d().bsppl_dpt_cd(value);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return ap_d().purc_act_no();
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		ap_d().purc_act_no(value);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return ap_d().rcpt_iv_mng_no();
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		ap_d().rcpt_iv_mng_no(value);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return ap_d().rcpt_iv_no();
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		ap_d().rcpt_iv_no(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return ap_d().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		ap_d().trd_cur_cd(value);
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public MCDate pay_basis_dt() {
		return ap_d().pay_basis_dt();
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public void pay_basis_dt(MCDate value) {
		ap_d().pay_basis_dt(value);
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return ap_d().pay_schd_dt();
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		ap_d().pay_schd_dt(value);
	}

	/**
	 * Closing year and month 締年月日.<p>
	 *
	 */
	public MCDate bsppl_cl_dt() {
		return ap_d().bsppl_cl_dt();
	}

	/**
	 * Closing year and month 締年月日.<p>
	 *
	 */
	public void bsppl_cl_dt(MCDate value) {
		ap_d().bsppl_cl_dt(value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCNumber bsppl_cl_day() {
		return ap_d().bsppl_cl_day();
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bsppl_cl_day(MCNumber value) {
		ap_d().bsppl_cl_day(value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bsppl_cl_day(int value) {
		ap_d().bsppl_cl_day(value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bsppl_cl_day(long value) {
		ap_d().bsppl_cl_day(value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bsppl_cl_day(float value) {
		ap_d().bsppl_cl_day(value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bsppl_cl_day(double value) {
		ap_d().bsppl_cl_day(value);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return ap_d().wrk_no();
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		ap_d().wrk_no(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return ap_d().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		ap_d().trd_ptn_typ(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return ap_d().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		ap_d().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return ap_d().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		ap_d().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return ap_d().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		ap_d().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return ap_d().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		ap_d().itm_sub3(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return ap_d().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		ap_d().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		ap_d().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		ap_d().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		ap_d().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		ap_d().trd_cur_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return ap_d().trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		ap_d().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		ap_d().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		ap_d().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		ap_d().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		ap_d().trd_cur_tax_amt(value);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return ap_d().interim_flg();
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		ap_d().interim_flg(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return ap_d().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		ap_d().ac_dt(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return ap_d().upd_cntr();
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		ap_d().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		ap_d().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		ap_d().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		ap_d().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		ap_d().upd_cntr(value);
	}

}

