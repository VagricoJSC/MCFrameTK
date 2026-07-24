package mcframe.serverMSBH.MSBHL0050;

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
 * ブロック"Srch02_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch02_RsltR_MC_A extends MCConstRow {

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd = "bsppl_dpt_cd";
	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public static final String $bsppl_dpt_nm = "bsppl_dpt_nm";
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
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public static final String $pay_schd_dt = "pay_schd_dt";
	/**
	 * Scheduled/Actual payment date 支払予定日／実績日.<p>
	 *
	 */
	public static final String $pay_schd_act_dt = "pay_schd_act_dt";
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
	 * Payment schedule amount 支払予定額.<p>
	 *
	 */
	public static final String $pay_schd_amt = "pay_schd_amt";
	/**
	 * Scheduled payment amount (Base currency) 基準通貨支払予定額.<p>
	 *
	 */
	public static final String $base_cur_pay_schd_amt = "base_cur_pay_schd_amt";
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
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $base_cur_amt_dec_place = "base_cur_amt_dec_place";
	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public static final String $pay_xrate = "pay_xrate";
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public static final String $pay_chk_no = "pay_chk_no";
	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public static final String $pay_schd_no = "pay_schd_no";
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
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
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
	 * Offset destination name (Master) 相殺先名（マスタ）.<p>
	 *
	 */
	public static final String $setoff_nm_bp = "setoff_nm_bp";
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
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Fee tax cd. 手数料税ＣＤ.<p>
	 *
	 */
	public static final String $com_paid_tax_cd = "com_paid_tax_cd";
	/**
	 * Fee tax name 手数料税名.<p>
	 *
	 */
	public static final String $com_paid_tax_nm = "com_paid_tax_nm";
	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public static final String $com_paid_tax_rate = "com_paid_tax_rate";
	/**
	 * Fee tax amount 手数料税額.<p>
	 *
	 */
	public static final String $com_paid_tax_amt = "com_paid_tax_amt";
	/**
	 * Fee amount without tax 手数料税抜額.<p>
	 *
	 */
	public static final String $exc_com_paid = "exc_com_paid";
	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public static final String $base_cur_com_paid_tax_amt = "base_cur_com_paid_tax_amt";
	/**
	 * Fee without tax (Base currency) 基準通貨手数料税抜額.<p>
	 *
	 */
	public static final String $base_cur_exc_com_paid = "base_cur_exc_com_paid";
	/**
	 * Counterpart invoice No. 相手先請求書ＮＯ.<p>
	 *
	 */
	public static final String $rcv_bill_no = "rcv_bill_no";
	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public static final String $adv_pay_act_no = "adv_pay_act_no";
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
	 * Payment due date 支払期日.<p>
	 *
	 */
	public static final String $due_dt = "due_dt";
	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public static final String $note_days = "note_days";
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
	 * Payment schedule table details 支払予定表備考.<p>
	 *
	 */
	public static final String $pay_schd_print_rmrks = "pay_schd_print_rmrks";
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
	 * Entry date 登録日.<p>
	 *
	 */
	public static final String $reg_dt = "reg_dt";
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


	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bsppl_dpt_nm_META = createCommonMeta($bsppl_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ap_typ_META = createCommonMeta($ap_typ, mcframe.commonMA.meta.MA_META.AP_TYP);
	public static final MCMeta ap_typ_nm_META = createCommonMeta($ap_typ_nm, mcframe.commonMA.meta.MA_META.AP_TYP_NM);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_nm_META = createCommonMeta($bsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta pay_schd_dt_META = createCommonMeta($pay_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_act_dt_META = createCommonMeta($pay_schd_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ap_sttl_cd_META = createCommonMeta($ap_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ap_sttl_nm_META = createCommonMeta($ap_sttl_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta ap_sttl_typ_META = createCommonMeta($ap_sttl_typ, mcframe.commonMA.meta.MA_META.AP_STTL_TYP);
	public static final MCMeta ap_sttl_typ_nm_META = createCommonMeta($ap_sttl_typ_nm, mcframe.commonMA.meta.MA_META.AP_STTL_TYP_NM);
	public static final MCMeta pay_schd_amt_META = createCommonMeta($pay_schd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_pay_schd_amt_META = createCommonMeta($base_cur_pay_schd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bsppl_cl_ym_META = createCommonMeta($bsppl_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta bsppl_cl_day_META = createCommonMeta($bsppl_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_amt_dec_place_META = createCommonMeta($base_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pay_xrate_META = createCommonMeta($pay_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_chk_no_META = createCommonMeta($pay_chk_no, mcframe.commonMA.meta.MA_META.PAY_CHK_NO);
	public static final MCMeta pay_schd_no_META = createCommonMeta($pay_schd_no, mcframe.commonMA.meta.MA_META.PAY_SCHD_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_nm_META = createCommonMeta($asppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta pay_sts_typ_META = createCommonMeta($pay_sts_typ, mcframe.commonMS.meta.MS_META.PAY_STS_TYP);
	public static final MCMeta pay_sts_typ_nm_META = createCommonMeta($pay_sts_typ_nm, mcframe.commonMS.meta.MS_META.PAY_STS_TYP_NM);
	public static final MCMeta sw_flg_META = createCommonMeta($sw_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta pay_bank_ac_cd_META = createCommonMeta($pay_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta pay_bank_ac_nm_META = createCommonMeta($pay_bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta bank_ac_nm_META = createCommonMeta($bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta ap_setoff_typ_META = createCommonMeta($ap_setoff_typ, mcframe.commonMA.meta.MA_META.AP_SETOFF_TYP);
	public static final MCMeta ap_setoff_typ_nm_META = createCommonMeta($ap_setoff_typ_nm, mcframe.commonMA.meta.MA_META.AP_SETOFF_TYP_NM);
	public static final MCMeta setoff_cd_META = createCommonMeta($setoff_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta setoff_nm_META = createCommonMeta($setoff_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta setoff_nm_bp_META = createCommonMeta($setoff_nm_bp, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta so_dpt_cd_META = createCommonMeta($so_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta so_dpt_nm_META = createCommonMeta($so_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta com_paid_tax_cd_META = createCommonMeta($com_paid_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta com_paid_tax_nm_META = createCommonMeta($com_paid_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta com_paid_tax_rate_META = createCommonMeta($com_paid_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta com_paid_tax_amt_META = createCommonMeta($com_paid_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta exc_com_paid_META = createCommonMeta($exc_com_paid, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_com_paid_tax_amt_META = createCommonMeta($base_cur_com_paid_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_exc_com_paid_META = createCommonMeta($base_cur_exc_com_paid, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_bill_no_META = createCommonMeta($rcv_bill_no, mcframe.commonMA.meta.MA_META.RCV_BILL_NO);
	public static final MCMeta adv_pay_act_no_META = createCommonMeta($adv_pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta note_no_META = createCommonMeta($note_no, mcframe.commonMA.meta.MA_META.NOTE_NO);
	public static final MCMeta note_typ_META = createCommonMeta($note_typ, mcframe.commonMA.meta.MA_META.NOTE_TYP);
	public static final MCMeta note_typ_nm_META = createCommonMeta($note_typ_nm, mcframe.commonMA.meta.MA_META.NOTE_TYP_NM);
	public static final MCMeta note_rsn_cd_META = createCommonMeta($note_rsn_cd, mcframe.commonMA.meta.MA_META.NOTE_RSN_CD);
	public static final MCMeta note_rsn_nm_META = createCommonMeta($note_rsn_nm, mcframe.commonMA.meta.MA_META.NOTE_RSN_NM);
	public static final MCMeta draw_dt_META = createCommonMeta($draw_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta due_dt_META = createCommonMeta($due_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta note_days_META = createCommonMeta($note_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta drawer_nm_META = createCommonMeta($drawer_nm, mcframe.commonMA.meta.MA_META.DRAWER_NM);
	public static final MCMeta draw_bank_cd_META = createCommonMeta($draw_bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta draw_bank_nm_META = createCommonMeta($draw_bank_nm, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta draw_branch_cd_META = createCommonMeta($draw_branch_cd, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta draw_branch_nm_META = createCommonMeta($draw_branch_nm, mcframe.commonMA.meta.MA_META.BANK_BRANCH_NM);
	public static final MCMeta endrsr_META = createCommonMeta($endrsr, mcframe.commonMA.meta.MA_META.NOTE_ENDRSR);
	public static final MCMeta accptr_META = createCommonMeta($accptr, mcframe.commonMA.meta.MA_META.NOTE_ACCPTR);
	public static final MCMeta pay_schd_print_rmrks_META = createCommonMeta($pay_schd_print_rmrks, mcframe.commonMS.meta.MS_META.PAY_SCHD_PRINT_RMRKS);
	public static final MCMeta pay_ntc_d_print_rmrks_META = createCommonMeta($pay_ntc_d_print_rmrks, mcframe.commonMS.meta.MS_META.PAY_NTC_D_PRINT_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PAY_SCHD_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PAY_SCHD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PAY_SCHD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PAY_SCHD_SUB_CHAR3);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_sts_typ_META = createCommonMeta($aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta aprv_sts_typ_nm_META = createCommonMeta($aprv_sts_typ_nm, mcframe.commonMA.meta.MA_META.APRV_STS_TYP_NM);
	public static final MCMeta aprv_flg_META = createCommonMeta($aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta psppl_nm_META = createCommonMeta($psppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta pay_dpt_cd_META = createCommonMeta($pay_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pay_dpt_nm_META = createCommonMeta($pay_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta reg_dt_META = createCommonMeta($reg_dt, mcframe.commonMA.meta.MA_META.DT);
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

	protected static final ConstMetaList<Srch02_RsltR> constMetas = new ConstMetaList<Srch02_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bsppl_dpt_cd_META,
			bsppl_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			ap_typ_META,
			ap_typ_nm_META,
			bsppl_cd_META,
			bsppl_nm_META,
			pay_schd_dt_META,
			pay_schd_act_dt_META,
			ap_sttl_cd_META,
			ap_sttl_nm_META,
			ap_sttl_typ_META,
			ap_sttl_typ_nm_META,
			pay_schd_amt_META,
			base_cur_pay_schd_amt_META,
			bsppl_cl_ym_META,
			bsppl_cl_day_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_cur_amt_dec_place_META,
			base_cur_amt_dec_place_META,
			pay_xrate_META,
			pay_chk_no_META,
			pay_schd_no_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			purc_act_no_META,
			wrk_no_META,
			wrk_nm_META,
			asppl_cd_META,
			asppl_nm_META,
			pay_sts_typ_META,
			pay_sts_typ_nm_META,
			sw_flg_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			pay_bank_ac_cd_META,
			pay_bank_ac_nm_META,
			bank_ac_cd_META,
			bank_ac_nm_META,
			ap_setoff_typ_META,
			ap_setoff_typ_nm_META,
			setoff_cd_META,
			setoff_nm_META,
			setoff_nm_bp_META,
			so_dpt_cd_META,
			so_dpt_nm_META,
			xrate_META,
			com_paid_tax_cd_META,
			com_paid_tax_nm_META,
			com_paid_tax_rate_META,
			com_paid_tax_amt_META,
			exc_com_paid_META,
			base_cur_com_paid_tax_amt_META,
			base_cur_exc_com_paid_META,
			rcv_bill_no_META,
			adv_pay_act_no_META,
			note_no_META,
			note_typ_META,
			note_typ_nm_META,
			note_rsn_cd_META,
			note_rsn_nm_META,
			draw_dt_META,
			due_dt_META,
			note_days_META,
			drawer_nm_META,
			draw_bank_cd_META,
			draw_bank_nm_META,
			draw_branch_cd_META,
			draw_branch_nm_META,
			endrsr_META,
			accptr_META,
			pay_schd_print_rmrks_META,
			pay_ntc_d_print_rmrks_META,
			trd_d_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			aprv_no_META,
			aprv_sts_typ_META,
			aprv_sts_typ_nm_META,
			aprv_flg_META,
			psppl_cd_META,
			psppl_nm_META,
			pay_dpt_cd_META,
			pay_dpt_nm_META,
			reg_dt_META,
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
			psppl_grp_nm10_META
		},
		new String[][]{
			{
			},
			{
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
				{$ap_typ, "MAC_AP_TYP"},	// ap_typ
				{$ap_sttl_typ, "MAC_AP_STTL_TYP"},	// ap_sttl_typ
				{$pay_sts_typ, "MSC_PAY_STS_TYP"},	// pay_sts_typ
				{$ap_setoff_typ, "MAC_AP_SETOFF_TYP"},	// ap_setoff_typ
				{$note_typ, "MAC_NOTE_TYP"},	// note_typ
				{$aprv_sts_typ, "MAC_APRV_STS_TYP"}	// aprv_sts_typ
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
	protected Srch02_RsltR_MC_A(ConstMetaList<? extends Srch02_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_RsltR clone() {
		return (Srch02_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_RsltR createInstance() {
		return (Srch02_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_RsltR getValues(String... names) {
		return (Srch02_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 0, $bsppl_dpt_cd);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 0, $bsppl_dpt_cd, value);
	}


	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public String bsppl_dpt_nm() {
		return getConstString(offset + 1, $bsppl_dpt_nm);
	}

	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public void bsppl_dpt_nm(String value) {
		setConstString(offset + 1, $bsppl_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 3, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 3, $wg_nm, value);
	}


	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public String ap_typ() {
		return getConstString(offset + 4, $ap_typ);
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public void ap_typ(String value) {
		setConstString(offset + 4, $ap_typ, value);
	}


	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public String ap_typ_nm() {
		return getConstString(offset + 5, $ap_typ_nm);
	}

	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public void ap_typ_nm(String value) {
		setConstString(offset + 5, $ap_typ_nm, value);
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


	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return getConstDate(offset + 8, $pay_schd_dt);
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		setConstDate(offset + 8, $pay_schd_dt, value);
	}


	/**
	 * Scheduled/Actual payment date 支払予定日／実績日.<p>
	 *
	 */
	public MCDate pay_schd_act_dt() {
		return getConstDate(offset + 9, $pay_schd_act_dt);
	}

	/**
	 * Scheduled/Actual payment date 支払予定日／実績日.<p>
	 *
	 */
	public void pay_schd_act_dt(MCDate value) {
		setConstDate(offset + 9, $pay_schd_act_dt, value);
	}


	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public String ap_sttl_cd() {
		return getConstString(offset + 10, $ap_sttl_cd);
	}

	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public void ap_sttl_cd(String value) {
		setConstString(offset + 10, $ap_sttl_cd, value);
	}


	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public String ap_sttl_nm() {
		return getConstString(offset + 11, $ap_sttl_nm);
	}

	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public void ap_sttl_nm(String value) {
		setConstString(offset + 11, $ap_sttl_nm, value);
	}


	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public String ap_sttl_typ() {
		return getConstString(offset + 12, $ap_sttl_typ);
	}

	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public void ap_sttl_typ(String value) {
		setConstString(offset + 12, $ap_sttl_typ, value);
	}


	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public String ap_sttl_typ_nm() {
		return getConstString(offset + 13, $ap_sttl_typ_nm);
	}

	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public void ap_sttl_typ_nm(String value) {
		setConstString(offset + 13, $ap_sttl_typ_nm, value);
	}


	/**
	 * Payment schedule amount 支払予定額.<p>
	 *
	 */
	public MCNumber pay_schd_amt() {
		return getConstNumber(offset + 14, $pay_schd_amt);
	}

	/**
	 * Payment schedule amount 支払予定額.<p>
	 *
	 */
	public void pay_schd_amt(MCNumber value) {
		setConstNumber(offset + 14, $pay_schd_amt, value);
	}

	/**
	 * Payment schedule amount 支払予定額.<p>
	 *
	 */
	public void pay_schd_amt(int value) {
		setConstNumber(offset + 14, $pay_schd_amt, value);
	}

	/**
	 * Payment schedule amount 支払予定額.<p>
	 *
	 */
	public void pay_schd_amt(long value) {
		setConstNumber(offset + 14, $pay_schd_amt, value);
	}

	/**
	 * Payment schedule amount 支払予定額.<p>
	 *
	 */
	public void pay_schd_amt(float value) {
		setConstNumber(offset + 14, $pay_schd_amt, value);
	}

	/**
	 * Payment schedule amount 支払予定額.<p>
	 *
	 */
	public void pay_schd_amt(double value) {
		setConstNumber(offset + 14, $pay_schd_amt, value);
	}


	/**
	 * Scheduled payment amount (Base currency) 基準通貨支払予定額.<p>
	 *
	 */
	public MCNumber base_cur_pay_schd_amt() {
		return getConstNumber(offset + 15, $base_cur_pay_schd_amt);
	}

	/**
	 * Scheduled payment amount (Base currency) 基準通貨支払予定額.<p>
	 *
	 */
	public void base_cur_pay_schd_amt(MCNumber value) {
		setConstNumber(offset + 15, $base_cur_pay_schd_amt, value);
	}

	/**
	 * Scheduled payment amount (Base currency) 基準通貨支払予定額.<p>
	 *
	 */
	public void base_cur_pay_schd_amt(int value) {
		setConstNumber(offset + 15, $base_cur_pay_schd_amt, value);
	}

	/**
	 * Scheduled payment amount (Base currency) 基準通貨支払予定額.<p>
	 *
	 */
	public void base_cur_pay_schd_amt(long value) {
		setConstNumber(offset + 15, $base_cur_pay_schd_amt, value);
	}

	/**
	 * Scheduled payment amount (Base currency) 基準通貨支払予定額.<p>
	 *
	 */
	public void base_cur_pay_schd_amt(float value) {
		setConstNumber(offset + 15, $base_cur_pay_schd_amt, value);
	}

	/**
	 * Scheduled payment amount (Base currency) 基準通貨支払予定額.<p>
	 *
	 */
	public void base_cur_pay_schd_amt(double value) {
		setConstNumber(offset + 15, $base_cur_pay_schd_amt, value);
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
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 18, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 18, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 19, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 19, $trd_cur_nm, value);
	}


	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 20, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 20, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 20, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 20, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 20, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 20, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_amt_dec_place() {
		return getConstNumber(offset + 21, $base_cur_amt_dec_place);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 21, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(int value) {
		setConstNumber(offset + 21, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(long value) {
		setConstNumber(offset + 21, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(float value) {
		setConstNumber(offset + 21, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(double value) {
		setConstNumber(offset + 21, $base_cur_amt_dec_place, value);
	}


	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public MCNumber pay_xrate() {
		return getConstNumber(offset + 22, $pay_xrate);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(MCNumber value) {
		setConstNumber(offset + 22, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(int value) {
		setConstNumber(offset + 22, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(long value) {
		setConstNumber(offset + 22, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(float value) {
		setConstNumber(offset + 22, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(double value) {
		setConstNumber(offset + 22, $pay_xrate, value);
	}


	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public String pay_chk_no() {
		return getConstString(offset + 23, $pay_chk_no);
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no(String value) {
		setConstString(offset + 23, $pay_chk_no, value);
	}


	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public String pay_schd_no() {
		return getConstString(offset + 24, $pay_schd_no);
	}

	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public void pay_schd_no(String value) {
		setConstString(offset + 24, $pay_schd_no, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 25, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 25, $rcpt_iv_no, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 26, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 26, $rcpt_iv_mng_no, value);
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
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 28, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 28, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 29, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 29, $wrk_nm, value);
	}


	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 30, $asppl_cd);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 30, $asppl_cd, value);
	}


	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public String asppl_nm() {
		return getConstString(offset + 31, $asppl_nm);
	}

	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public void asppl_nm(String value) {
		setConstString(offset + 31, $asppl_nm, value);
	}


	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public String pay_sts_typ() {
		return getConstString(offset + 32, $pay_sts_typ);
	}

	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public void pay_sts_typ(String value) {
		setConstString(offset + 32, $pay_sts_typ, value);
	}


	/**
	 * Payment status type name 支払状況区分名.<p>
	 *
	 */
	public String pay_sts_typ_nm() {
		return getConstString(offset + 33, $pay_sts_typ_nm);
	}

	/**
	 * Payment status type name 支払状況区分名.<p>
	 *
	 */
	public void pay_sts_typ_nm(String value) {
		setConstString(offset + 33, $pay_sts_typ_nm, value);
	}


	/**
	 * Transferred 振替済.<p>
	 *
	 */
	public boolean sw_flg() {
		return getConstBoolean(offset + 34, $sw_flg);
	}

	/**
	 * Transferred 振替済.<p>
	 *
	 */
	public void sw_flg(boolean value) {
		setConstBoolean(offset + 34, $sw_flg, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 35, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 35, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 36, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 36, $ap_dpt_nm, value);
	}


	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return getConstString(offset + 37, $pay_bank_ac_cd);
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		setConstString(offset + 37, $pay_bank_ac_cd, value);
	}


	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public String pay_bank_ac_nm() {
		return getConstString(offset + 38, $pay_bank_ac_nm);
	}

	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public void pay_bank_ac_nm(String value) {
		setConstString(offset + 38, $pay_bank_ac_nm, value);
	}


	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 39, $bank_ac_cd);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 39, $bank_ac_cd, value);
	}


	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public String bank_ac_nm() {
		return getConstString(offset + 40, $bank_ac_nm);
	}

	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public void bank_ac_nm(String value) {
		setConstString(offset + 40, $bank_ac_nm, value);
	}


	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public String ap_setoff_typ() {
		return getConstString(offset + 41, $ap_setoff_typ);
	}

	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public void ap_setoff_typ(String value) {
		setConstString(offset + 41, $ap_setoff_typ, value);
	}


	/**
	 * AP offset destination name 債務相殺先区分名.<p>
	 *
	 */
	public String ap_setoff_typ_nm() {
		return getConstString(offset + 42, $ap_setoff_typ_nm);
	}

	/**
	 * AP offset destination name 債務相殺先区分名.<p>
	 *
	 */
	public void ap_setoff_typ_nm(String value) {
		setConstString(offset + 42, $ap_setoff_typ_nm, value);
	}


	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public String setoff_cd() {
		return getConstString(offset + 43, $setoff_cd);
	}

	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public void setoff_cd(String value) {
		setConstString(offset + 43, $setoff_cd, value);
	}


	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public String setoff_nm() {
		return getConstString(offset + 44, $setoff_nm);
	}

	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public void setoff_nm(String value) {
		setConstString(offset + 44, $setoff_nm, value);
	}


	/**
	 * Offset destination name (Master) 相殺先名（マスタ）.<p>
	 *
	 */
	public String setoff_nm_bp() {
		return getConstString(offset + 45, $setoff_nm_bp);
	}

	/**
	 * Offset destination name (Master) 相殺先名（マスタ）.<p>
	 *
	 */
	public void setoff_nm_bp(String value) {
		setConstString(offset + 45, $setoff_nm_bp, value);
	}


	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public String so_dpt_cd() {
		return getConstString(offset + 46, $so_dpt_cd);
	}

	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public void so_dpt_cd(String value) {
		setConstString(offset + 46, $so_dpt_cd, value);
	}


	/**
	 * Offset dept. name 相殺部門名.<p>
	 *
	 */
	public String so_dpt_nm() {
		return getConstString(offset + 47, $so_dpt_nm);
	}

	/**
	 * Offset dept. name 相殺部門名.<p>
	 *
	 */
	public void so_dpt_nm(String value) {
		setConstString(offset + 47, $so_dpt_nm, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 48, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 48, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 48, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 48, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 48, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 48, $xrate, value);
	}


	/**
	 * Fee tax cd. 手数料税ＣＤ.<p>
	 *
	 */
	public String com_paid_tax_cd() {
		return getConstString(offset + 49, $com_paid_tax_cd);
	}

	/**
	 * Fee tax cd. 手数料税ＣＤ.<p>
	 *
	 */
	public void com_paid_tax_cd(String value) {
		setConstString(offset + 49, $com_paid_tax_cd, value);
	}


	/**
	 * Fee tax name 手数料税名.<p>
	 *
	 */
	public String com_paid_tax_nm() {
		return getConstString(offset + 50, $com_paid_tax_nm);
	}

	/**
	 * Fee tax name 手数料税名.<p>
	 *
	 */
	public void com_paid_tax_nm(String value) {
		setConstString(offset + 50, $com_paid_tax_nm, value);
	}


	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public MCNumber com_paid_tax_rate() {
		return getConstNumber(offset + 51, $com_paid_tax_rate);
	}

	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public void com_paid_tax_rate(MCNumber value) {
		setConstNumber(offset + 51, $com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public void com_paid_tax_rate(int value) {
		setConstNumber(offset + 51, $com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public void com_paid_tax_rate(long value) {
		setConstNumber(offset + 51, $com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public void com_paid_tax_rate(float value) {
		setConstNumber(offset + 51, $com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public void com_paid_tax_rate(double value) {
		setConstNumber(offset + 51, $com_paid_tax_rate, value);
	}


	/**
	 * Fee tax amount 手数料税額.<p>
	 *
	 */
	public MCNumber com_paid_tax_amt() {
		return getConstNumber(offset + 52, $com_paid_tax_amt);
	}

	/**
	 * Fee tax amount 手数料税額.<p>
	 *
	 */
	public void com_paid_tax_amt(MCNumber value) {
		setConstNumber(offset + 52, $com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount 手数料税額.<p>
	 *
	 */
	public void com_paid_tax_amt(int value) {
		setConstNumber(offset + 52, $com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount 手数料税額.<p>
	 *
	 */
	public void com_paid_tax_amt(long value) {
		setConstNumber(offset + 52, $com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount 手数料税額.<p>
	 *
	 */
	public void com_paid_tax_amt(float value) {
		setConstNumber(offset + 52, $com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount 手数料税額.<p>
	 *
	 */
	public void com_paid_tax_amt(double value) {
		setConstNumber(offset + 52, $com_paid_tax_amt, value);
	}


	/**
	 * Fee amount without tax 手数料税抜額.<p>
	 *
	 */
	public MCNumber exc_com_paid() {
		return getConstNumber(offset + 53, $exc_com_paid);
	}

	/**
	 * Fee amount without tax 手数料税抜額.<p>
	 *
	 */
	public void exc_com_paid(MCNumber value) {
		setConstNumber(offset + 53, $exc_com_paid, value);
	}

	/**
	 * Fee amount without tax 手数料税抜額.<p>
	 *
	 */
	public void exc_com_paid(int value) {
		setConstNumber(offset + 53, $exc_com_paid, value);
	}

	/**
	 * Fee amount without tax 手数料税抜額.<p>
	 *
	 */
	public void exc_com_paid(long value) {
		setConstNumber(offset + 53, $exc_com_paid, value);
	}

	/**
	 * Fee amount without tax 手数料税抜額.<p>
	 *
	 */
	public void exc_com_paid(float value) {
		setConstNumber(offset + 53, $exc_com_paid, value);
	}

	/**
	 * Fee amount without tax 手数料税抜額.<p>
	 *
	 */
	public void exc_com_paid(double value) {
		setConstNumber(offset + 53, $exc_com_paid, value);
	}


	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public MCNumber base_cur_com_paid_tax_amt() {
		return getConstNumber(offset + 54, $base_cur_com_paid_tax_amt);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(MCNumber value) {
		setConstNumber(offset + 54, $base_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(int value) {
		setConstNumber(offset + 54, $base_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(long value) {
		setConstNumber(offset + 54, $base_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(float value) {
		setConstNumber(offset + 54, $base_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(double value) {
		setConstNumber(offset + 54, $base_cur_com_paid_tax_amt, value);
	}


	/**
	 * Fee without tax (Base currency) 基準通貨手数料税抜額.<p>
	 *
	 */
	public MCNumber base_cur_exc_com_paid() {
		return getConstNumber(offset + 55, $base_cur_exc_com_paid);
	}

	/**
	 * Fee without tax (Base currency) 基準通貨手数料税抜額.<p>
	 *
	 */
	public void base_cur_exc_com_paid(MCNumber value) {
		setConstNumber(offset + 55, $base_cur_exc_com_paid, value);
	}

	/**
	 * Fee without tax (Base currency) 基準通貨手数料税抜額.<p>
	 *
	 */
	public void base_cur_exc_com_paid(int value) {
		setConstNumber(offset + 55, $base_cur_exc_com_paid, value);
	}

	/**
	 * Fee without tax (Base currency) 基準通貨手数料税抜額.<p>
	 *
	 */
	public void base_cur_exc_com_paid(long value) {
		setConstNumber(offset + 55, $base_cur_exc_com_paid, value);
	}

	/**
	 * Fee without tax (Base currency) 基準通貨手数料税抜額.<p>
	 *
	 */
	public void base_cur_exc_com_paid(float value) {
		setConstNumber(offset + 55, $base_cur_exc_com_paid, value);
	}

	/**
	 * Fee without tax (Base currency) 基準通貨手数料税抜額.<p>
	 *
	 */
	public void base_cur_exc_com_paid(double value) {
		setConstNumber(offset + 55, $base_cur_exc_com_paid, value);
	}


	/**
	 * Counterpart invoice No. 相手先請求書ＮＯ.<p>
	 *
	 */
	public String rcv_bill_no() {
		return getConstString(offset + 56, $rcv_bill_no);
	}

	/**
	 * Counterpart invoice No. 相手先請求書ＮＯ.<p>
	 *
	 */
	public void rcv_bill_no(String value) {
		setConstString(offset + 56, $rcv_bill_no, value);
	}


	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public String adv_pay_act_no() {
		return getConstString(offset + 57, $adv_pay_act_no);
	}

	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public void adv_pay_act_no(String value) {
		setConstString(offset + 57, $adv_pay_act_no, value);
	}


	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 58, $note_no);
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 58, $note_no, value);
	}


	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public String note_typ() {
		return getConstString(offset + 59, $note_typ);
	}

	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public void note_typ(String value) {
		setConstString(offset + 59, $note_typ, value);
	}


	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public String note_typ_nm() {
		return getConstString(offset + 60, $note_typ_nm);
	}

	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public void note_typ_nm(String value) {
		setConstString(offset + 60, $note_typ_nm, value);
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
	 * Drawing date 振出日.<p>
	 *
	 */
	public MCDate draw_dt() {
		return getConstDate(offset + 63, $draw_dt);
	}

	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public void draw_dt(MCDate value) {
		setConstDate(offset + 63, $draw_dt, value);
	}


	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public MCDate due_dt() {
		return getConstDate(offset + 64, $due_dt);
	}

	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public void due_dt(MCDate value) {
		setConstDate(offset + 64, $due_dt, value);
	}


	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public MCNumber note_days() {
		return getConstNumber(offset + 65, $note_days);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(MCNumber value) {
		setConstNumber(offset + 65, $note_days, value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(int value) {
		setConstNumber(offset + 65, $note_days, value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(long value) {
		setConstNumber(offset + 65, $note_days, value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(float value) {
		setConstNumber(offset + 65, $note_days, value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(double value) {
		setConstNumber(offset + 65, $note_days, value);
	}


	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public String drawer_nm() {
		return getConstString(offset + 66, $drawer_nm);
	}

	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public void drawer_nm(String value) {
		setConstString(offset + 66, $drawer_nm, value);
	}


	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public String draw_bank_cd() {
		return getConstString(offset + 67, $draw_bank_cd);
	}

	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public void draw_bank_cd(String value) {
		setConstString(offset + 67, $draw_bank_cd, value);
	}


	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public String draw_bank_nm() {
		return getConstString(offset + 68, $draw_bank_nm);
	}

	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public void draw_bank_nm(String value) {
		setConstString(offset + 68, $draw_bank_nm, value);
	}


	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public String draw_branch_cd() {
		return getConstString(offset + 69, $draw_branch_cd);
	}

	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public void draw_branch_cd(String value) {
		setConstString(offset + 69, $draw_branch_cd, value);
	}


	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public String draw_branch_nm() {
		return getConstString(offset + 70, $draw_branch_nm);
	}

	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public void draw_branch_nm(String value) {
		setConstString(offset + 70, $draw_branch_nm, value);
	}


	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public String endrsr() {
		return getConstString(offset + 71, $endrsr);
	}

	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public void endrsr(String value) {
		setConstString(offset + 71, $endrsr, value);
	}


	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public String accptr() {
		return getConstString(offset + 72, $accptr);
	}

	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public void accptr(String value) {
		setConstString(offset + 72, $accptr, value);
	}


	/**
	 * Payment schedule table details 支払予定表備考.<p>
	 *
	 */
	public String pay_schd_print_rmrks() {
		return getConstString(offset + 73, $pay_schd_print_rmrks);
	}

	/**
	 * Payment schedule table details 支払予定表備考.<p>
	 *
	 */
	public void pay_schd_print_rmrks(String value) {
		setConstString(offset + 73, $pay_schd_print_rmrks, value);
	}


	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public String pay_ntc_d_print_rmrks() {
		return getConstString(offset + 74, $pay_ntc_d_print_rmrks);
	}

	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public void pay_ntc_d_print_rmrks(String value) {
		setConstString(offset + 74, $pay_ntc_d_print_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 75, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 75, $trd_d_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 76, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 76, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 77, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 77, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 78, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 78, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 79, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 79, $sub_char3, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 80, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 80, $aprv_no, value);
	}


	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return getConstString(offset + 81, $aprv_sts_typ);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		setConstString(offset + 81, $aprv_sts_typ, value);
	}


	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public String aprv_sts_typ_nm() {
		return getConstString(offset + 82, $aprv_sts_typ_nm);
	}

	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public void aprv_sts_typ_nm(String value) {
		setConstString(offset + 82, $aprv_sts_typ_nm, value);
	}


	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 83, $aprv_flg);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 83, $aprv_flg, value);
	}


	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 84, $psppl_cd);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 84, $psppl_cd, value);
	}


	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public String psppl_nm() {
		return getConstString(offset + 85, $psppl_nm);
	}

	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public void psppl_nm(String value) {
		setConstString(offset + 85, $psppl_nm, value);
	}


	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public String pay_dpt_cd() {
		return getConstString(offset + 86, $pay_dpt_cd);
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public void pay_dpt_cd(String value) {
		setConstString(offset + 86, $pay_dpt_cd, value);
	}


	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public String pay_dpt_nm() {
		return getConstString(offset + 87, $pay_dpt_nm);
	}

	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public void pay_dpt_nm(String value) {
		setConstString(offset + 87, $pay_dpt_nm, value);
	}


	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCDate reg_dt() {
		return getConstDate(offset + 88, $reg_dt);
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public void reg_dt(MCDate value) {
		setConstDate(offset + 88, $reg_dt, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 89, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 89, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 90, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 90, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 91, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 91, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 92, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 92, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 93, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 93, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 94, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 94, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 95, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 95, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 96, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 96, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 97, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 97, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 98, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 98, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 99, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 99, $upd_srv_req_no, value);
	}


	/**
	 * Scheduled payee classification cd. 1 支払予定管理先分類ＣＤ１.<p>
	 *
	 */
	public String bsppl_grp_cd1() {
		return getConstString(offset + 100, $bsppl_grp_cd1);
	}

	/**
	 * Scheduled payee classification cd. 1 支払予定管理先分類ＣＤ１.<p>
	 *
	 */
	public void bsppl_grp_cd1(String value) {
		setConstString(offset + 100, $bsppl_grp_cd1, value);
	}


	/**
	 * Scheduled payee classification name 1 支払予定管理先分類名１.<p>
	 *
	 */
	public String bsppl_grp_nm1() {
		return getConstString(offset + 101, $bsppl_grp_nm1);
	}

	/**
	 * Scheduled payee classification name 1 支払予定管理先分類名１.<p>
	 *
	 */
	public void bsppl_grp_nm1(String value) {
		setConstString(offset + 101, $bsppl_grp_nm1, value);
	}


	/**
	 * Scheduled payee classification cd. 2 支払予定管理先分類ＣＤ２.<p>
	 *
	 */
	public String bsppl_grp_cd2() {
		return getConstString(offset + 102, $bsppl_grp_cd2);
	}

	/**
	 * Scheduled payee classification cd. 2 支払予定管理先分類ＣＤ２.<p>
	 *
	 */
	public void bsppl_grp_cd2(String value) {
		setConstString(offset + 102, $bsppl_grp_cd2, value);
	}


	/**
	 * Scheduled payee classification name 2 支払予定管理先分類名２.<p>
	 *
	 */
	public String bsppl_grp_nm2() {
		return getConstString(offset + 103, $bsppl_grp_nm2);
	}

	/**
	 * Scheduled payee classification name 2 支払予定管理先分類名２.<p>
	 *
	 */
	public void bsppl_grp_nm2(String value) {
		setConstString(offset + 103, $bsppl_grp_nm2, value);
	}


	/**
	 * Scheduled payee classification cd. 3 支払予定管理先分類ＣＤ３.<p>
	 *
	 */
	public String bsppl_grp_cd3() {
		return getConstString(offset + 104, $bsppl_grp_cd3);
	}

	/**
	 * Scheduled payee classification cd. 3 支払予定管理先分類ＣＤ３.<p>
	 *
	 */
	public void bsppl_grp_cd3(String value) {
		setConstString(offset + 104, $bsppl_grp_cd3, value);
	}


	/**
	 * Scheduled payee classification name 3 支払予定管理先分類名３.<p>
	 *
	 */
	public String bsppl_grp_nm3() {
		return getConstString(offset + 105, $bsppl_grp_nm3);
	}

	/**
	 * Scheduled payee classification name 3 支払予定管理先分類名３.<p>
	 *
	 */
	public void bsppl_grp_nm3(String value) {
		setConstString(offset + 105, $bsppl_grp_nm3, value);
	}


	/**
	 * Scheduled payee classification cd. 4 支払予定管理先分類ＣＤ４.<p>
	 *
	 */
	public String bsppl_grp_cd4() {
		return getConstString(offset + 106, $bsppl_grp_cd4);
	}

	/**
	 * Scheduled payee classification cd. 4 支払予定管理先分類ＣＤ４.<p>
	 *
	 */
	public void bsppl_grp_cd4(String value) {
		setConstString(offset + 106, $bsppl_grp_cd4, value);
	}


	/**
	 * Scheduled payee classification name 4 支払予定管理先分類名４.<p>
	 *
	 */
	public String bsppl_grp_nm4() {
		return getConstString(offset + 107, $bsppl_grp_nm4);
	}

	/**
	 * Scheduled payee classification name 4 支払予定管理先分類名４.<p>
	 *
	 */
	public void bsppl_grp_nm4(String value) {
		setConstString(offset + 107, $bsppl_grp_nm4, value);
	}


	/**
	 * Scheduled payee classification cd. 5 支払予定管理先分類ＣＤ５.<p>
	 *
	 */
	public String bsppl_grp_cd5() {
		return getConstString(offset + 108, $bsppl_grp_cd5);
	}

	/**
	 * Scheduled payee classification cd. 5 支払予定管理先分類ＣＤ５.<p>
	 *
	 */
	public void bsppl_grp_cd5(String value) {
		setConstString(offset + 108, $bsppl_grp_cd5, value);
	}


	/**
	 * Scheduled payee classification name 5 支払予定管理先分類名５.<p>
	 *
	 */
	public String bsppl_grp_nm5() {
		return getConstString(offset + 109, $bsppl_grp_nm5);
	}

	/**
	 * Scheduled payee classification name 5 支払予定管理先分類名５.<p>
	 *
	 */
	public void bsppl_grp_nm5(String value) {
		setConstString(offset + 109, $bsppl_grp_nm5, value);
	}


	/**
	 * Scheduled payee classification cd. 6 支払予定管理先分類ＣＤ６.<p>
	 *
	 */
	public String bsppl_grp_cd6() {
		return getConstString(offset + 110, $bsppl_grp_cd6);
	}

	/**
	 * Scheduled payee classification cd. 6 支払予定管理先分類ＣＤ６.<p>
	 *
	 */
	public void bsppl_grp_cd6(String value) {
		setConstString(offset + 110, $bsppl_grp_cd6, value);
	}


	/**
	 * Scheduled payee classification name 6 支払予定管理先分類名６.<p>
	 *
	 */
	public String bsppl_grp_nm6() {
		return getConstString(offset + 111, $bsppl_grp_nm6);
	}

	/**
	 * Scheduled payee classification name 6 支払予定管理先分類名６.<p>
	 *
	 */
	public void bsppl_grp_nm6(String value) {
		setConstString(offset + 111, $bsppl_grp_nm6, value);
	}


	/**
	 * Scheduled payee classification cd. 7 支払予定管理先分類ＣＤ７.<p>
	 *
	 */
	public String bsppl_grp_cd7() {
		return getConstString(offset + 112, $bsppl_grp_cd7);
	}

	/**
	 * Scheduled payee classification cd. 7 支払予定管理先分類ＣＤ７.<p>
	 *
	 */
	public void bsppl_grp_cd7(String value) {
		setConstString(offset + 112, $bsppl_grp_cd7, value);
	}


	/**
	 * Scheduled payee classification name 7 支払予定管理先分類名７.<p>
	 *
	 */
	public String bsppl_grp_nm7() {
		return getConstString(offset + 113, $bsppl_grp_nm7);
	}

	/**
	 * Scheduled payee classification name 7 支払予定管理先分類名７.<p>
	 *
	 */
	public void bsppl_grp_nm7(String value) {
		setConstString(offset + 113, $bsppl_grp_nm7, value);
	}


	/**
	 * Scheduled payee classification cd. 8 支払予定管理先分類ＣＤ８.<p>
	 *
	 */
	public String bsppl_grp_cd8() {
		return getConstString(offset + 114, $bsppl_grp_cd8);
	}

	/**
	 * Scheduled payee classification cd. 8 支払予定管理先分類ＣＤ８.<p>
	 *
	 */
	public void bsppl_grp_cd8(String value) {
		setConstString(offset + 114, $bsppl_grp_cd8, value);
	}


	/**
	 * Scheduled payee classification name 8 支払予定管理先分類名８.<p>
	 *
	 */
	public String bsppl_grp_nm8() {
		return getConstString(offset + 115, $bsppl_grp_nm8);
	}

	/**
	 * Scheduled payee classification name 8 支払予定管理先分類名８.<p>
	 *
	 */
	public void bsppl_grp_nm8(String value) {
		setConstString(offset + 115, $bsppl_grp_nm8, value);
	}


	/**
	 * Scheduled payee classification cd. 9 支払予定管理先分類ＣＤ９.<p>
	 *
	 */
	public String bsppl_grp_cd9() {
		return getConstString(offset + 116, $bsppl_grp_cd9);
	}

	/**
	 * Scheduled payee classification cd. 9 支払予定管理先分類ＣＤ９.<p>
	 *
	 */
	public void bsppl_grp_cd9(String value) {
		setConstString(offset + 116, $bsppl_grp_cd9, value);
	}


	/**
	 * Scheduled payee classification name 9 支払予定管理先分類名９.<p>
	 *
	 */
	public String bsppl_grp_nm9() {
		return getConstString(offset + 117, $bsppl_grp_nm9);
	}

	/**
	 * Scheduled payee classification name 9 支払予定管理先分類名９.<p>
	 *
	 */
	public void bsppl_grp_nm9(String value) {
		setConstString(offset + 117, $bsppl_grp_nm9, value);
	}


	/**
	 * Scheduled payee classification cd. 10 支払予定管理先分類ＣＤ１０.<p>
	 *
	 */
	public String bsppl_grp_cd10() {
		return getConstString(offset + 118, $bsppl_grp_cd10);
	}

	/**
	 * Scheduled payee classification cd. 10 支払予定管理先分類ＣＤ１０.<p>
	 *
	 */
	public void bsppl_grp_cd10(String value) {
		setConstString(offset + 118, $bsppl_grp_cd10, value);
	}


	/**
	 * Scheduled payee classification name 10 支払予定管理先分類名１０.<p>
	 *
	 */
	public String bsppl_grp_nm10() {
		return getConstString(offset + 119, $bsppl_grp_nm10);
	}

	/**
	 * Scheduled payee classification name 10 支払予定管理先分類名１０.<p>
	 *
	 */
	public void bsppl_grp_nm10(String value) {
		setConstString(offset + 119, $bsppl_grp_nm10, value);
	}


	/**
	 * Payee classification cd. 1 支払先分類ＣＤ１.<p>
	 *
	 */
	public String psppl_grp_cd1() {
		return getConstString(offset + 120, $psppl_grp_cd1);
	}

	/**
	 * Payee classification cd. 1 支払先分類ＣＤ１.<p>
	 *
	 */
	public void psppl_grp_cd1(String value) {
		setConstString(offset + 120, $psppl_grp_cd1, value);
	}


	/**
	 * Payee classification name 1 支払先分類名１.<p>
	 *
	 */
	public String psppl_grp_nm1() {
		return getConstString(offset + 121, $psppl_grp_nm1);
	}

	/**
	 * Payee classification name 1 支払先分類名１.<p>
	 *
	 */
	public void psppl_grp_nm1(String value) {
		setConstString(offset + 121, $psppl_grp_nm1, value);
	}


	/**
	 * Payee classification cd. 2 支払先分類ＣＤ２.<p>
	 *
	 */
	public String psppl_grp_cd2() {
		return getConstString(offset + 122, $psppl_grp_cd2);
	}

	/**
	 * Payee classification cd. 2 支払先分類ＣＤ２.<p>
	 *
	 */
	public void psppl_grp_cd2(String value) {
		setConstString(offset + 122, $psppl_grp_cd2, value);
	}


	/**
	 * Payee classification name 2 支払先分類名２.<p>
	 *
	 */
	public String psppl_grp_nm2() {
		return getConstString(offset + 123, $psppl_grp_nm2);
	}

	/**
	 * Payee classification name 2 支払先分類名２.<p>
	 *
	 */
	public void psppl_grp_nm2(String value) {
		setConstString(offset + 123, $psppl_grp_nm2, value);
	}


	/**
	 * Payee classification cd. 3 支払先分類ＣＤ３.<p>
	 *
	 */
	public String psppl_grp_cd3() {
		return getConstString(offset + 124, $psppl_grp_cd3);
	}

	/**
	 * Payee classification cd. 3 支払先分類ＣＤ３.<p>
	 *
	 */
	public void psppl_grp_cd3(String value) {
		setConstString(offset + 124, $psppl_grp_cd3, value);
	}


	/**
	 * Payee classification name 3 支払先分類名３.<p>
	 *
	 */
	public String psppl_grp_nm3() {
		return getConstString(offset + 125, $psppl_grp_nm3);
	}

	/**
	 * Payee classification name 3 支払先分類名３.<p>
	 *
	 */
	public void psppl_grp_nm3(String value) {
		setConstString(offset + 125, $psppl_grp_nm3, value);
	}


	/**
	 * Payee classification cd. 4 支払先分類ＣＤ４.<p>
	 *
	 */
	public String psppl_grp_cd4() {
		return getConstString(offset + 126, $psppl_grp_cd4);
	}

	/**
	 * Payee classification cd. 4 支払先分類ＣＤ４.<p>
	 *
	 */
	public void psppl_grp_cd4(String value) {
		setConstString(offset + 126, $psppl_grp_cd4, value);
	}


	/**
	 * Payee classification name 4 支払先分類名４.<p>
	 *
	 */
	public String psppl_grp_nm4() {
		return getConstString(offset + 127, $psppl_grp_nm4);
	}

	/**
	 * Payee classification name 4 支払先分類名４.<p>
	 *
	 */
	public void psppl_grp_nm4(String value) {
		setConstString(offset + 127, $psppl_grp_nm4, value);
	}


	/**
	 * Payee classification cd. 5 支払先分類ＣＤ５.<p>
	 *
	 */
	public String psppl_grp_cd5() {
		return getConstString(offset + 128, $psppl_grp_cd5);
	}

	/**
	 * Payee classification cd. 5 支払先分類ＣＤ５.<p>
	 *
	 */
	public void psppl_grp_cd5(String value) {
		setConstString(offset + 128, $psppl_grp_cd5, value);
	}


	/**
	 * Payee classification name 5 支払先分類名５.<p>
	 *
	 */
	public String psppl_grp_nm5() {
		return getConstString(offset + 129, $psppl_grp_nm5);
	}

	/**
	 * Payee classification name 5 支払先分類名５.<p>
	 *
	 */
	public void psppl_grp_nm5(String value) {
		setConstString(offset + 129, $psppl_grp_nm5, value);
	}


	/**
	 * Payee classification cd. 6 支払先分類ＣＤ６.<p>
	 *
	 */
	public String psppl_grp_cd6() {
		return getConstString(offset + 130, $psppl_grp_cd6);
	}

	/**
	 * Payee classification cd. 6 支払先分類ＣＤ６.<p>
	 *
	 */
	public void psppl_grp_cd6(String value) {
		setConstString(offset + 130, $psppl_grp_cd6, value);
	}


	/**
	 * Payee classification name 6 支払先分類名６.<p>
	 *
	 */
	public String psppl_grp_nm6() {
		return getConstString(offset + 131, $psppl_grp_nm6);
	}

	/**
	 * Payee classification name 6 支払先分類名６.<p>
	 *
	 */
	public void psppl_grp_nm6(String value) {
		setConstString(offset + 131, $psppl_grp_nm6, value);
	}


	/**
	 * Payee classification cd. 7 支払先分類ＣＤ７.<p>
	 *
	 */
	public String psppl_grp_cd7() {
		return getConstString(offset + 132, $psppl_grp_cd7);
	}

	/**
	 * Payee classification cd. 7 支払先分類ＣＤ７.<p>
	 *
	 */
	public void psppl_grp_cd7(String value) {
		setConstString(offset + 132, $psppl_grp_cd7, value);
	}


	/**
	 * Payee classification name 7 支払先分類名７.<p>
	 *
	 */
	public String psppl_grp_nm7() {
		return getConstString(offset + 133, $psppl_grp_nm7);
	}

	/**
	 * Payee classification name 7 支払先分類名７.<p>
	 *
	 */
	public void psppl_grp_nm7(String value) {
		setConstString(offset + 133, $psppl_grp_nm7, value);
	}


	/**
	 * Payee classification cd. 8 支払先分類ＣＤ８.<p>
	 *
	 */
	public String psppl_grp_cd8() {
		return getConstString(offset + 134, $psppl_grp_cd8);
	}

	/**
	 * Payee classification cd. 8 支払先分類ＣＤ８.<p>
	 *
	 */
	public void psppl_grp_cd8(String value) {
		setConstString(offset + 134, $psppl_grp_cd8, value);
	}


	/**
	 * Payee classification name 8 支払先分類名８.<p>
	 *
	 */
	public String psppl_grp_nm8() {
		return getConstString(offset + 135, $psppl_grp_nm8);
	}

	/**
	 * Payee classification name 8 支払先分類名８.<p>
	 *
	 */
	public void psppl_grp_nm8(String value) {
		setConstString(offset + 135, $psppl_grp_nm8, value);
	}


	/**
	 * Payee classification cd. 9 支払先分類ＣＤ９.<p>
	 *
	 */
	public String psppl_grp_cd9() {
		return getConstString(offset + 136, $psppl_grp_cd9);
	}

	/**
	 * Payee classification cd. 9 支払先分類ＣＤ９.<p>
	 *
	 */
	public void psppl_grp_cd9(String value) {
		setConstString(offset + 136, $psppl_grp_cd9, value);
	}


	/**
	 * Payee classification name 9 支払先分類名９.<p>
	 *
	 */
	public String psppl_grp_nm9() {
		return getConstString(offset + 137, $psppl_grp_nm9);
	}

	/**
	 * Payee classification name 9 支払先分類名９.<p>
	 *
	 */
	public void psppl_grp_nm9(String value) {
		setConstString(offset + 137, $psppl_grp_nm9, value);
	}


	/**
	 * Payee classification cd. 10 支払先分類ＣＤ１０.<p>
	 *
	 */
	public String psppl_grp_cd10() {
		return getConstString(offset + 138, $psppl_grp_cd10);
	}

	/**
	 * Payee classification cd. 10 支払先分類ＣＤ１０.<p>
	 *
	 */
	public void psppl_grp_cd10(String value) {
		setConstString(offset + 138, $psppl_grp_cd10, value);
	}


	/**
	 * Payee classification name 10 支払先分類名１０.<p>
	 *
	 */
	public String psppl_grp_nm10() {
		return getConstString(offset + 139, $psppl_grp_nm10);
	}

	/**
	 * Payee classification name 10 支払先分類名１０.<p>
	 *
	 */
	public void psppl_grp_nm10(String value) {
		setConstString(offset + 139, $psppl_grp_nm10, value);
	}


	public String getString(String name) {
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			return ap_typ_nm();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			return pay_schd_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			return pay_sts_typ();
		}
		if ($pay_sts_typ_nm.equalsIgnoreCase(name)) {
			return pay_sts_typ_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
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
		if ($setoff_nm_bp.equalsIgnoreCase(name)) {
			return setoff_nm_bp();
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			return so_dpt_cd();
		}
		if ($so_dpt_nm.equalsIgnoreCase(name)) {
			return so_dpt_nm();
		}
		if ($com_paid_tax_cd.equalsIgnoreCase(name)) {
			return com_paid_tax_cd();
		}
		if ($com_paid_tax_nm.equalsIgnoreCase(name)) {
			return com_paid_tax_nm();
		}
		if ($rcv_bill_no.equalsIgnoreCase(name)) {
			return rcv_bill_no();
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			return adv_pay_act_no();
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
		if ($pay_schd_print_rmrks.equalsIgnoreCase(name)) {
			return pay_schd_print_rmrks();
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_ntc_d_print_rmrks();
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
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return aprv_sts_typ_nm();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			return pay_dpt_nm();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			return pay_schd_amt();
		}
		if ($base_cur_pay_schd_amt.equalsIgnoreCase(name)) {
			return base_cur_pay_schd_amt();
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			return bsppl_cl_day();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			return pay_xrate();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($com_paid_tax_rate.equalsIgnoreCase(name)) {
			return com_paid_tax_rate();
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			return com_paid_tax_amt();
		}
		if ($exc_com_paid.equalsIgnoreCase(name)) {
			return exc_com_paid();
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_com_paid_tax_amt();
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			return base_cur_exc_com_paid();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($pay_schd_act_dt.equalsIgnoreCase(name)) {
			return pay_schd_act_dt();
		}
		if ($bsppl_cl_ym.equalsIgnoreCase(name)) {
			return bsppl_cl_ym();
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			return draw_dt();
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			return reg_dt();
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
		if ($sw_flg.equalsIgnoreCase(name)) {
			return sw_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			return ap_typ_nm();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			return pay_schd_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			return pay_sts_typ();
		}
		if ($pay_sts_typ_nm.equalsIgnoreCase(name)) {
			return pay_sts_typ_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
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
		if ($setoff_nm_bp.equalsIgnoreCase(name)) {
			return setoff_nm_bp();
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			return so_dpt_cd();
		}
		if ($so_dpt_nm.equalsIgnoreCase(name)) {
			return so_dpt_nm();
		}
		if ($com_paid_tax_cd.equalsIgnoreCase(name)) {
			return com_paid_tax_cd();
		}
		if ($com_paid_tax_nm.equalsIgnoreCase(name)) {
			return com_paid_tax_nm();
		}
		if ($rcv_bill_no.equalsIgnoreCase(name)) {
			return rcv_bill_no();
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			return adv_pay_act_no();
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
		if ($pay_schd_print_rmrks.equalsIgnoreCase(name)) {
			return pay_schd_print_rmrks();
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_ntc_d_print_rmrks();
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
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return aprv_sts_typ_nm();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			return pay_dpt_nm();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			return pay_schd_amt();
		}
		if ($base_cur_pay_schd_amt.equalsIgnoreCase(name)) {
			return base_cur_pay_schd_amt();
		}
		if ($bsppl_cl_day.equalsIgnoreCase(name)) {
			return bsppl_cl_day();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			return pay_xrate();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($com_paid_tax_rate.equalsIgnoreCase(name)) {
			return com_paid_tax_rate();
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			return com_paid_tax_amt();
		}
		if ($exc_com_paid.equalsIgnoreCase(name)) {
			return exc_com_paid();
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_com_paid_tax_amt();
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			return base_cur_exc_com_paid();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($pay_schd_act_dt.equalsIgnoreCase(name)) {
			return pay_schd_act_dt();
		}
		if ($bsppl_cl_ym.equalsIgnoreCase(name)) {
			return bsppl_cl_ym();
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			return draw_dt();
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			return reg_dt();
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
		if ($sw_flg.equalsIgnoreCase(name)) {
			return sw_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			bsppl_dpt_nm(value);
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
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			ap_typ_nm(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			pay_schd_no(value);
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			pay_sts_typ(value);
			return;
		}
		if ($pay_sts_typ_nm.equalsIgnoreCase(name)) {
			pay_sts_typ_nm(value);
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
		if ($setoff_nm_bp.equalsIgnoreCase(name)) {
			setoff_nm_bp(value);
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
		if ($com_paid_tax_cd.equalsIgnoreCase(name)) {
			com_paid_tax_cd(value);
			return;
		}
		if ($com_paid_tax_nm.equalsIgnoreCase(name)) {
			com_paid_tax_nm(value);
			return;
		}
		if ($rcv_bill_no.equalsIgnoreCase(name)) {
			rcv_bill_no(value);
			return;
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			adv_pay_act_no(value);
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
		if ($pay_schd_print_rmrks.equalsIgnoreCase(name)) {
			pay_schd_print_rmrks(value);
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
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			psppl_nm(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			pay_schd_amt(value);
			return;
		}
		if ($base_cur_pay_schd_amt.equalsIgnoreCase(name)) {
			base_cur_pay_schd_amt(value);
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
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($com_paid_tax_rate.equalsIgnoreCase(name)) {
			com_paid_tax_rate(value);
			return;
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			com_paid_tax_amt(value);
			return;
		}
		if ($exc_com_paid.equalsIgnoreCase(name)) {
			exc_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			base_cur_exc_com_paid(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			pay_schd_amt(value);
			return;
		}
		if ($base_cur_pay_schd_amt.equalsIgnoreCase(name)) {
			base_cur_pay_schd_amt(value);
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
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($com_paid_tax_rate.equalsIgnoreCase(name)) {
			com_paid_tax_rate(value);
			return;
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			com_paid_tax_amt(value);
			return;
		}
		if ($exc_com_paid.equalsIgnoreCase(name)) {
			exc_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			base_cur_exc_com_paid(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			pay_schd_amt(value);
			return;
		}
		if ($base_cur_pay_schd_amt.equalsIgnoreCase(name)) {
			base_cur_pay_schd_amt(value);
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
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($com_paid_tax_rate.equalsIgnoreCase(name)) {
			com_paid_tax_rate(value);
			return;
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			com_paid_tax_amt(value);
			return;
		}
		if ($exc_com_paid.equalsIgnoreCase(name)) {
			exc_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			base_cur_exc_com_paid(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			pay_schd_amt(value);
			return;
		}
		if ($base_cur_pay_schd_amt.equalsIgnoreCase(name)) {
			base_cur_pay_schd_amt(value);
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
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($com_paid_tax_rate.equalsIgnoreCase(name)) {
			com_paid_tax_rate(value);
			return;
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			com_paid_tax_amt(value);
			return;
		}
		if ($exc_com_paid.equalsIgnoreCase(name)) {
			exc_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			base_cur_exc_com_paid(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			pay_schd_amt(value);
			return;
		}
		if ($base_cur_pay_schd_amt.equalsIgnoreCase(name)) {
			base_cur_pay_schd_amt(value);
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
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($com_paid_tax_rate.equalsIgnoreCase(name)) {
			com_paid_tax_rate(value);
			return;
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			com_paid_tax_amt(value);
			return;
		}
		if ($exc_com_paid.equalsIgnoreCase(name)) {
			exc_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			base_cur_exc_com_paid(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		if ($pay_schd_act_dt.equalsIgnoreCase(name)) {
			pay_schd_act_dt(value);
			return;
		}
		if ($bsppl_cl_ym.equalsIgnoreCase(name)) {
			bsppl_cl_ym(value);
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
		if ($reg_dt.equalsIgnoreCase(name)) {
			reg_dt(value);
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
		if ($sw_flg.equalsIgnoreCase(name)) {
			sw_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			bsppl_dpt_nm(value);
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
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			ap_typ_nm(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			pay_schd_no(value);
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			pay_sts_typ(value);
			return;
		}
		if ($pay_sts_typ_nm.equalsIgnoreCase(name)) {
			pay_sts_typ_nm(value);
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
		if ($setoff_nm_bp.equalsIgnoreCase(name)) {
			setoff_nm_bp(value);
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
		if ($com_paid_tax_cd.equalsIgnoreCase(name)) {
			com_paid_tax_cd(value);
			return;
		}
		if ($com_paid_tax_nm.equalsIgnoreCase(name)) {
			com_paid_tax_nm(value);
			return;
		}
		if ($rcv_bill_no.equalsIgnoreCase(name)) {
			rcv_bill_no(value);
			return;
		}
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			adv_pay_act_no(value);
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
		if ($pay_schd_print_rmrks.equalsIgnoreCase(name)) {
			pay_schd_print_rmrks(value);
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
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			psppl_nm(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			pay_schd_amt(value);
			return;
		}
		if ($base_cur_pay_schd_amt.equalsIgnoreCase(name)) {
			base_cur_pay_schd_amt(value);
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
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($com_paid_tax_rate.equalsIgnoreCase(name)) {
			com_paid_tax_rate(value);
			return;
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			com_paid_tax_amt(value);
			return;
		}
		if ($exc_com_paid.equalsIgnoreCase(name)) {
			exc_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			base_cur_exc_com_paid(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			pay_schd_amt(value);
			return;
		}
		if ($base_cur_pay_schd_amt.equalsIgnoreCase(name)) {
			base_cur_pay_schd_amt(value);
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
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($com_paid_tax_rate.equalsIgnoreCase(name)) {
			com_paid_tax_rate(value);
			return;
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			com_paid_tax_amt(value);
			return;
		}
		if ($exc_com_paid.equalsIgnoreCase(name)) {
			exc_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			base_cur_exc_com_paid(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			pay_schd_amt(value);
			return;
		}
		if ($base_cur_pay_schd_amt.equalsIgnoreCase(name)) {
			base_cur_pay_schd_amt(value);
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
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($com_paid_tax_rate.equalsIgnoreCase(name)) {
			com_paid_tax_rate(value);
			return;
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			com_paid_tax_amt(value);
			return;
		}
		if ($exc_com_paid.equalsIgnoreCase(name)) {
			exc_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			base_cur_exc_com_paid(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			pay_schd_amt(value);
			return;
		}
		if ($base_cur_pay_schd_amt.equalsIgnoreCase(name)) {
			base_cur_pay_schd_amt(value);
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
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($com_paid_tax_rate.equalsIgnoreCase(name)) {
			com_paid_tax_rate(value);
			return;
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			com_paid_tax_amt(value);
			return;
		}
		if ($exc_com_paid.equalsIgnoreCase(name)) {
			exc_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			base_cur_exc_com_paid(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			pay_schd_amt(value);
			return;
		}
		if ($base_cur_pay_schd_amt.equalsIgnoreCase(name)) {
			base_cur_pay_schd_amt(value);
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
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($com_paid_tax_rate.equalsIgnoreCase(name)) {
			com_paid_tax_rate(value);
			return;
		}
		if ($com_paid_tax_amt.equalsIgnoreCase(name)) {
			com_paid_tax_amt(value);
			return;
		}
		if ($exc_com_paid.equalsIgnoreCase(name)) {
			exc_com_paid(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_exc_com_paid.equalsIgnoreCase(name)) {
			base_cur_exc_com_paid(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		if ($pay_schd_act_dt.equalsIgnoreCase(name)) {
			pay_schd_act_dt(value);
			return;
		}
		if ($bsppl_cl_ym.equalsIgnoreCase(name)) {
			bsppl_cl_ym(value);
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
		if ($reg_dt.equalsIgnoreCase(name)) {
			reg_dt(value);
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
		if ($sw_flg.equalsIgnoreCase(name)) {
			sw_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

