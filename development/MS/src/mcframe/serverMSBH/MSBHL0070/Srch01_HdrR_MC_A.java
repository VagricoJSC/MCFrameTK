package mcframe.serverMSBH.MSBHL0070;

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
 * ブロック"Srch01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_HdrR_MC_A extends MCConstRow {

	/**
	 * Advance payment result No. 前渡金実績ＮＯ.<p>
	 *
	 */
	public static final String $adv_pay_act_no = "adv_pay_act_no";
	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public static final String $adv_pay_act_seq = "adv_pay_act_seq";
	/**
	 * Advance payment result revision number 前渡金実績改訂番号.<p>
	 *
	 */
	public static final String $adv_pay_act_rev = "adv_pay_act_rev";
	/**
	 * Latest 最新.<p>
	 *
	 */
	public static final String $latest_flg = "latest_flg";
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
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
	 * Actual payment date 支払実績日.<p>
	 *
	 */
	public static final String $pay_act_dt = "pay_act_dt";
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Payment PIC cd. 支払担当者ＣＤ.<p>
	 *
	 */
	public static final String $pay_usr_cd = "pay_usr_cd";
	/**
	 * Payment PIC name 支払担当者名.<p>
	 *
	 */
	public static final String $pay_usr_nm = "pay_usr_nm";
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
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
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
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $base_cur_amt_dec_place = "base_cur_amt_dec_place";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Offset target amount (Transaction currency) 取引通貨相殺対象額.<p>
	 *
	 */
	public static final String $trd_cur_setoff_tgt_amt = "trd_cur_setoff_tgt_amt";
	/**
	 * Offset schedule amount (Transaction currency) 取引通貨相殺予定額.<p>
	 *
	 */
	public static final String $trd_cur_setoff_schd_amt = "trd_cur_setoff_schd_amt";
	/**
	 * Offset result amount (Transaction currency) 取引通貨相殺実績額.<p>
	 *
	 */
	public static final String $trd_cur_setoff_act_amt = "trd_cur_setoff_act_amt";
	/**
	 * Unreconciled balance (Transaction currency) 取引通貨未処理残高.<p>
	 *
	 */
	public static final String $trd_cur_not_proc_bal = "trd_cur_not_proc_bal";
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
	 * Payment per transaction flg. 都度支払ＦＬＧ.<p>
	 *
	 */
	public static final String $pay_spot_flg = "pay_spot_flg";
	/**
	 * Display advance payment on payment notice 支払通知書前渡金表示.<p>
	 *
	 */
	public static final String $pay_ntc_adv_pay_flg = "pay_ntc_adv_pay_flg";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
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
	 * Fee AP settlement method cd. 手数料債務決済方法ＣＤ.<p>
	 *
	 */
	public static final String $com_paid_ap_sttl_cd = "com_paid_ap_sttl_cd";
	/**
	 * Fee AP settlement method name 手数料債務決済方法名.<p>
	 *
	 */
	public static final String $com_paid_ap_sttl_nm = "com_paid_ap_sttl_nm";
	/**
	 * Fee AP settlement type 手数料債務決済区分.<p>
	 *
	 */
	public static final String $com_paid_ap_sttl_typ = "com_paid_ap_sttl_typ";
	/**
	 * Fee AP settlement type name 手数料債務決済区分名.<p>
	 *
	 */
	public static final String $com_paid_ap_sttl_typ_nm = "com_paid_ap_sttl_typ_nm";
	/**
	 * Fee amount (Transaction currency) 取引通貨手数料金額.<p>
	 *
	 */
	public static final String $trd_cur_com_paid = "trd_cur_com_paid";
	/**
	 * Fee tax cd. 手数料税ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_cd = "trd_cur_com_paid_tax_cd";
	/**
	 * Fee tax name 手数料税名.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_nm = "trd_cur_com_paid_tax_nm";
	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_rate = "trd_cur_com_paid_tax_rate";
	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_amt = "trd_cur_com_paid_tax_amt";
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
	 * Note spare 1 手形予備１.<p>
	 *
	 */
	public static final String $note_sub_char1 = "note_sub_char1";
	/**
	 * Note spare 2 手形予備２.<p>
	 *
	 */
	public static final String $note_sub_char2 = "note_sub_char2";
	/**
	 * Note spare 3 手形予備３.<p>
	 *
	 */
	public static final String $note_sub_char3 = "note_sub_char3";
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $adv_pay_upd_cntr = "adv_pay_upd_cntr";


	public static final MCMeta adv_pay_act_no_META = createCommonMeta($adv_pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta adv_pay_act_seq_META = createCommonMeta($adv_pay_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta adv_pay_act_rev_META = createCommonMeta($adv_pay_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta latest_flg_META = createCommonMeta($latest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_nm_META = createCommonMeta($bsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bsppl_dpt_nm_META = createCommonMeta($bsppl_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta psppl_nm_META = createCommonMeta($psppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta psppl_rmrks_META = createCommonMeta($psppl_rmrks, mcframe.commonMA.meta.MA_META.PSPPL_RMRKS);
	public static final MCMeta pay_act_dt_META = createCommonMeta($pay_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_usr_cd_META = createCommonMeta($pay_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta pay_usr_nm_META = createCommonMeta($pay_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta pay_dpt_cd_META = createCommonMeta($pay_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pay_dpt_nm_META = createCommonMeta($pay_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_amt_dec_place_META = createCommonMeta($base_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_setoff_tgt_amt_META = createCommonMeta($trd_cur_setoff_tgt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_setoff_schd_amt_META = createCommonMeta($trd_cur_setoff_schd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_setoff_act_amt_META = createCommonMeta($trd_cur_setoff_act_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_not_proc_bal_META = createCommonMeta($trd_cur_not_proc_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ap_sttl_cd_META = createCommonMeta($ap_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ap_sttl_nm_META = createCommonMeta($ap_sttl_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta ap_sttl_typ_META = createCommonMeta($ap_sttl_typ, mcframe.commonMA.meta.MA_META.AP_STTL_TYP);
	public static final MCMeta ap_sttl_typ_nm_META = createCommonMeta($ap_sttl_typ_nm, mcframe.commonMA.meta.MA_META.AP_STTL_TYP_NM);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta bank_ac_nm_META = createCommonMeta($bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta pay_bank_ac_cd_META = createCommonMeta($pay_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta pay_bank_ac_nm_META = createCommonMeta($pay_bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta pay_spot_flg_META = createCommonMeta($pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_adv_pay_flg_META = createCommonMeta($pay_ntc_adv_pay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.ADV_PAY_ACT_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.ADV_PAY_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.ADV_PAY_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.ADV_PAY_ACT_SUB_CHAR3);
	public static final MCMeta com_paid_ap_sttl_cd_META = createCommonMeta($com_paid_ap_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta com_paid_ap_sttl_nm_META = createCommonMeta($com_paid_ap_sttl_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta com_paid_ap_sttl_typ_META = createCommonMeta($com_paid_ap_sttl_typ, mcframe.commonMA.meta.MA_META.AP_STTL_TYP);
	public static final MCMeta com_paid_ap_sttl_typ_nm_META = createCommonMeta($com_paid_ap_sttl_typ_nm, mcframe.commonMA.meta.MA_META.AP_STTL_TYP_NM);
	public static final MCMeta trd_cur_com_paid_META = createCommonMeta($trd_cur_com_paid, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_com_paid_tax_cd_META = createCommonMeta($trd_cur_com_paid_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta trd_cur_com_paid_tax_nm_META = createCommonMeta($trd_cur_com_paid_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta trd_cur_com_paid_tax_rate_META = createCommonMeta($trd_cur_com_paid_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta trd_cur_com_paid_tax_amt_META = createCommonMeta($trd_cur_com_paid_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta note_no_META = createCommonMeta($note_no, mcframe.commonMA.meta.MA_META.NOTE_NO);
	public static final MCMeta note_typ_META = createCommonMeta($note_typ, mcframe.commonMA.meta.MA_META.NOTE_TYP);
	public static final MCMeta note_typ_nm_META = createCommonMeta($note_typ_nm, mcframe.commonMA.meta.MA_META.NOTE_TYP_NM);
	public static final MCMeta draw_dt_META = createCommonMeta($draw_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta note_days_META = createCommonMeta($note_days, mcframe.commonMA.meta.MA_META.DAYS);
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
	public static final MCMeta note_sub_char1_META = createCommonMeta($note_sub_char1, mcframe.commonMS.meta.MS_META.PAY_NOTE_SUB_CHAR1);
	public static final MCMeta note_sub_char2_META = createCommonMeta($note_sub_char2, mcframe.commonMS.meta.MS_META.PAY_NOTE_SUB_CHAR2);
	public static final MCMeta note_sub_char3_META = createCommonMeta($note_sub_char3, mcframe.commonMS.meta.MS_META.PAY_NOTE_SUB_CHAR3);
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
	public static final MCMeta adv_pay_upd_cntr_META = createCommonMeta($adv_pay_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Srch01_HdrR> constMetas = new ConstMetaList<Srch01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			adv_pay_act_no_META,
			adv_pay_act_seq_META,
			adv_pay_act_rev_META,
			latest_flg_META,
			slip_sts_typ_META,
			bsppl_cd_META,
			bsppl_nm_META,
			bsppl_dpt_cd_META,
			bsppl_dpt_nm_META,
			psppl_cd_META,
			psppl_nm_META,
			psppl_rmrks_META,
			pay_act_dt_META,
			ac_ym_META,
			ac_dt_META,
			pay_usr_cd_META,
			pay_usr_nm_META,
			pay_dpt_cd_META,
			pay_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_cur_amt_dec_place_META,
			xrate_META,
			base_cur_cd_META,
			base_cur_nm_META,
			base_cur_amt_dec_place_META,
			xrate_cd_META,
			trd_cur_amt_META,
			trd_cur_setoff_tgt_amt_META,
			trd_cur_setoff_schd_amt_META,
			trd_cur_setoff_act_amt_META,
			trd_cur_not_proc_bal_META,
			ap_sttl_cd_META,
			ap_sttl_nm_META,
			ap_sttl_typ_META,
			ap_sttl_typ_nm_META,
			bank_ac_cd_META,
			bank_ac_nm_META,
			pay_bank_ac_cd_META,
			pay_bank_ac_nm_META,
			pay_spot_flg_META,
			pay_ntc_adv_pay_flg_META,
			trd_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			com_paid_ap_sttl_cd_META,
			com_paid_ap_sttl_nm_META,
			com_paid_ap_sttl_typ_META,
			com_paid_ap_sttl_typ_nm_META,
			trd_cur_com_paid_META,
			trd_cur_com_paid_tax_cd_META,
			trd_cur_com_paid_tax_nm_META,
			trd_cur_com_paid_tax_rate_META,
			trd_cur_com_paid_tax_amt_META,
			note_no_META,
			note_typ_META,
			note_typ_nm_META,
			draw_dt_META,
			note_days_META,
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
			adv_pay_upd_cntr_META
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
				{$ap_sttl_typ, "MAC_AP_STTL_TYP"},	// ap_sttl_typ
				{$com_paid_ap_sttl_typ, "MAC_AP_STTL_TYP"},	// com_paid_ap_sttl_typ
				{$note_typ, "MAC_NOTE_TYP"}	// note_typ
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
	protected Srch01_HdrR_MC_A(ConstMetaList<? extends Srch01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_HdrR clone() {
		return (Srch01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_HdrR createInstance() {
		return (Srch01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_HdrR getValues(String... names) {
		return (Srch01_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Advance payment result No. 前渡金実績ＮＯ.<p>
	 *
	 */
	public String adv_pay_act_no() {
		return getConstString(offset + 0, $adv_pay_act_no);
	}

	/**
	 * Advance payment result No. 前渡金実績ＮＯ.<p>
	 *
	 */
	public void adv_pay_act_no(String value) {
		setConstString(offset + 0, $adv_pay_act_no, value);
	}


	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public MCNumber adv_pay_act_seq() {
		return getConstNumber(offset + 1, $adv_pay_act_seq);
	}

	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(MCNumber value) {
		setConstNumber(offset + 1, $adv_pay_act_seq, value);
	}

	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(int value) {
		setConstNumber(offset + 1, $adv_pay_act_seq, value);
	}

	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(long value) {
		setConstNumber(offset + 1, $adv_pay_act_seq, value);
	}

	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(float value) {
		setConstNumber(offset + 1, $adv_pay_act_seq, value);
	}

	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public void adv_pay_act_seq(double value) {
		setConstNumber(offset + 1, $adv_pay_act_seq, value);
	}


	/**
	 * Advance payment result revision number 前渡金実績改訂番号.<p>
	 *
	 */
	public MCNumber adv_pay_act_rev() {
		return getConstNumber(offset + 2, $adv_pay_act_rev);
	}

	/**
	 * Advance payment result revision number 前渡金実績改訂番号.<p>
	 *
	 */
	public void adv_pay_act_rev(MCNumber value) {
		setConstNumber(offset + 2, $adv_pay_act_rev, value);
	}

	/**
	 * Advance payment result revision number 前渡金実績改訂番号.<p>
	 *
	 */
	public void adv_pay_act_rev(int value) {
		setConstNumber(offset + 2, $adv_pay_act_rev, value);
	}

	/**
	 * Advance payment result revision number 前渡金実績改訂番号.<p>
	 *
	 */
	public void adv_pay_act_rev(long value) {
		setConstNumber(offset + 2, $adv_pay_act_rev, value);
	}

	/**
	 * Advance payment result revision number 前渡金実績改訂番号.<p>
	 *
	 */
	public void adv_pay_act_rev(float value) {
		setConstNumber(offset + 2, $adv_pay_act_rev, value);
	}

	/**
	 * Advance payment result revision number 前渡金実績改訂番号.<p>
	 *
	 */
	public void adv_pay_act_rev(double value) {
		setConstNumber(offset + 2, $adv_pay_act_rev, value);
	}


	/**
	 * Latest 最新.<p>
	 *
	 */
	public boolean latest_flg() {
		return getConstBoolean(offset + 3, $latest_flg);
	}

	/**
	 * Latest 最新.<p>
	 *
	 */
	public void latest_flg(boolean value) {
		setConstBoolean(offset + 3, $latest_flg, value);
	}


	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 4, $slip_sts_typ);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 4, $slip_sts_typ, value);
	}


	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 5, $bsppl_cd);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 5, $bsppl_cd, value);
	}


	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public String bsppl_nm() {
		return getConstString(offset + 6, $bsppl_nm);
	}

	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public void bsppl_nm(String value) {
		setConstString(offset + 6, $bsppl_nm, value);
	}


	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 7, $bsppl_dpt_cd);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 7, $bsppl_dpt_cd, value);
	}


	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public String bsppl_dpt_nm() {
		return getConstString(offset + 8, $bsppl_dpt_nm);
	}

	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public void bsppl_dpt_nm(String value) {
		setConstString(offset + 8, $bsppl_dpt_nm, value);
	}


	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 9, $psppl_cd);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 9, $psppl_cd, value);
	}


	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public String psppl_nm() {
		return getConstString(offset + 10, $psppl_nm);
	}

	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public void psppl_nm(String value) {
		setConstString(offset + 10, $psppl_nm, value);
	}


	/**
	 * Payee remarks 支払先備考.<p>
	 *
	 */
	public String psppl_rmrks() {
		return getConstString(offset + 11, $psppl_rmrks);
	}

	/**
	 * Payee remarks 支払先備考.<p>
	 *
	 */
	public void psppl_rmrks(String value) {
		setConstString(offset + 11, $psppl_rmrks, value);
	}


	/**
	 * Actual payment date 支払実績日.<p>
	 *
	 */
	public MCDate pay_act_dt() {
		return getConstDate(offset + 12, $pay_act_dt);
	}

	/**
	 * Actual payment date 支払実績日.<p>
	 *
	 */
	public void pay_act_dt(MCDate value) {
		setConstDate(offset + 12, $pay_act_dt, value);
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 13, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 13, $ac_ym, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 14, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 14, $ac_dt, value);
	}


	/**
	 * Payment PIC cd. 支払担当者ＣＤ.<p>
	 *
	 */
	public String pay_usr_cd() {
		return getConstString(offset + 15, $pay_usr_cd);
	}

	/**
	 * Payment PIC cd. 支払担当者ＣＤ.<p>
	 *
	 */
	public void pay_usr_cd(String value) {
		setConstString(offset + 15, $pay_usr_cd, value);
	}


	/**
	 * Payment PIC name 支払担当者名.<p>
	 *
	 */
	public String pay_usr_nm() {
		return getConstString(offset + 16, $pay_usr_nm);
	}

	/**
	 * Payment PIC name 支払担当者名.<p>
	 *
	 */
	public void pay_usr_nm(String value) {
		setConstString(offset + 16, $pay_usr_nm, value);
	}


	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public String pay_dpt_cd() {
		return getConstString(offset + 17, $pay_dpt_cd);
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public void pay_dpt_cd(String value) {
		setConstString(offset + 17, $pay_dpt_cd, value);
	}


	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public String pay_dpt_nm() {
		return getConstString(offset + 18, $pay_dpt_nm);
	}

	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public void pay_dpt_nm(String value) {
		setConstString(offset + 18, $pay_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 19, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 19, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 20, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 20, $wg_nm, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 21, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 21, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 22, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 22, $bd_dpt_nm, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 23, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 23, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 24, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 24, $trd_cur_nm, value);
	}


	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 25, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 25, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 25, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 25, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 25, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 25, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 26, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 26, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 26, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 26, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 26, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 26, $xrate, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 27, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 27, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 28, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 28, $base_cur_nm, value);
	}


	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_amt_dec_place() {
		return getConstNumber(offset + 29, $base_cur_amt_dec_place);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 29, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(int value) {
		setConstNumber(offset + 29, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(long value) {
		setConstNumber(offset + 29, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(float value) {
		setConstNumber(offset + 29, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(double value) {
		setConstNumber(offset + 29, $base_cur_amt_dec_place, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 30, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 30, $xrate_cd, value);
	}


	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 31, $trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 31, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 31, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 31, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 31, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 31, $trd_cur_amt, value);
	}


	/**
	 * Offset target amount (Transaction currency) 取引通貨相殺対象額.<p>
	 *
	 */
	public MCNumber trd_cur_setoff_tgt_amt() {
		return getConstNumber(offset + 32, $trd_cur_setoff_tgt_amt);
	}

	/**
	 * Offset target amount (Transaction currency) 取引通貨相殺対象額.<p>
	 *
	 */
	public void trd_cur_setoff_tgt_amt(MCNumber value) {
		setConstNumber(offset + 32, $trd_cur_setoff_tgt_amt, value);
	}

	/**
	 * Offset target amount (Transaction currency) 取引通貨相殺対象額.<p>
	 *
	 */
	public void trd_cur_setoff_tgt_amt(int value) {
		setConstNumber(offset + 32, $trd_cur_setoff_tgt_amt, value);
	}

	/**
	 * Offset target amount (Transaction currency) 取引通貨相殺対象額.<p>
	 *
	 */
	public void trd_cur_setoff_tgt_amt(long value) {
		setConstNumber(offset + 32, $trd_cur_setoff_tgt_amt, value);
	}

	/**
	 * Offset target amount (Transaction currency) 取引通貨相殺対象額.<p>
	 *
	 */
	public void trd_cur_setoff_tgt_amt(float value) {
		setConstNumber(offset + 32, $trd_cur_setoff_tgt_amt, value);
	}

	/**
	 * Offset target amount (Transaction currency) 取引通貨相殺対象額.<p>
	 *
	 */
	public void trd_cur_setoff_tgt_amt(double value) {
		setConstNumber(offset + 32, $trd_cur_setoff_tgt_amt, value);
	}


	/**
	 * Offset schedule amount (Transaction currency) 取引通貨相殺予定額.<p>
	 *
	 */
	public MCNumber trd_cur_setoff_schd_amt() {
		return getConstNumber(offset + 33, $trd_cur_setoff_schd_amt);
	}

	/**
	 * Offset schedule amount (Transaction currency) 取引通貨相殺予定額.<p>
	 *
	 */
	public void trd_cur_setoff_schd_amt(MCNumber value) {
		setConstNumber(offset + 33, $trd_cur_setoff_schd_amt, value);
	}

	/**
	 * Offset schedule amount (Transaction currency) 取引通貨相殺予定額.<p>
	 *
	 */
	public void trd_cur_setoff_schd_amt(int value) {
		setConstNumber(offset + 33, $trd_cur_setoff_schd_amt, value);
	}

	/**
	 * Offset schedule amount (Transaction currency) 取引通貨相殺予定額.<p>
	 *
	 */
	public void trd_cur_setoff_schd_amt(long value) {
		setConstNumber(offset + 33, $trd_cur_setoff_schd_amt, value);
	}

	/**
	 * Offset schedule amount (Transaction currency) 取引通貨相殺予定額.<p>
	 *
	 */
	public void trd_cur_setoff_schd_amt(float value) {
		setConstNumber(offset + 33, $trd_cur_setoff_schd_amt, value);
	}

	/**
	 * Offset schedule amount (Transaction currency) 取引通貨相殺予定額.<p>
	 *
	 */
	public void trd_cur_setoff_schd_amt(double value) {
		setConstNumber(offset + 33, $trd_cur_setoff_schd_amt, value);
	}


	/**
	 * Offset result amount (Transaction currency) 取引通貨相殺実績額.<p>
	 *
	 */
	public MCNumber trd_cur_setoff_act_amt() {
		return getConstNumber(offset + 34, $trd_cur_setoff_act_amt);
	}

	/**
	 * Offset result amount (Transaction currency) 取引通貨相殺実績額.<p>
	 *
	 */
	public void trd_cur_setoff_act_amt(MCNumber value) {
		setConstNumber(offset + 34, $trd_cur_setoff_act_amt, value);
	}

	/**
	 * Offset result amount (Transaction currency) 取引通貨相殺実績額.<p>
	 *
	 */
	public void trd_cur_setoff_act_amt(int value) {
		setConstNumber(offset + 34, $trd_cur_setoff_act_amt, value);
	}

	/**
	 * Offset result amount (Transaction currency) 取引通貨相殺実績額.<p>
	 *
	 */
	public void trd_cur_setoff_act_amt(long value) {
		setConstNumber(offset + 34, $trd_cur_setoff_act_amt, value);
	}

	/**
	 * Offset result amount (Transaction currency) 取引通貨相殺実績額.<p>
	 *
	 */
	public void trd_cur_setoff_act_amt(float value) {
		setConstNumber(offset + 34, $trd_cur_setoff_act_amt, value);
	}

	/**
	 * Offset result amount (Transaction currency) 取引通貨相殺実績額.<p>
	 *
	 */
	public void trd_cur_setoff_act_amt(double value) {
		setConstNumber(offset + 34, $trd_cur_setoff_act_amt, value);
	}


	/**
	 * Unreconciled balance (Transaction currency) 取引通貨未処理残高.<p>
	 *
	 */
	public MCNumber trd_cur_not_proc_bal() {
		return getConstNumber(offset + 35, $trd_cur_not_proc_bal);
	}

	/**
	 * Unreconciled balance (Transaction currency) 取引通貨未処理残高.<p>
	 *
	 */
	public void trd_cur_not_proc_bal(MCNumber value) {
		setConstNumber(offset + 35, $trd_cur_not_proc_bal, value);
	}

	/**
	 * Unreconciled balance (Transaction currency) 取引通貨未処理残高.<p>
	 *
	 */
	public void trd_cur_not_proc_bal(int value) {
		setConstNumber(offset + 35, $trd_cur_not_proc_bal, value);
	}

	/**
	 * Unreconciled balance (Transaction currency) 取引通貨未処理残高.<p>
	 *
	 */
	public void trd_cur_not_proc_bal(long value) {
		setConstNumber(offset + 35, $trd_cur_not_proc_bal, value);
	}

	/**
	 * Unreconciled balance (Transaction currency) 取引通貨未処理残高.<p>
	 *
	 */
	public void trd_cur_not_proc_bal(float value) {
		setConstNumber(offset + 35, $trd_cur_not_proc_bal, value);
	}

	/**
	 * Unreconciled balance (Transaction currency) 取引通貨未処理残高.<p>
	 *
	 */
	public void trd_cur_not_proc_bal(double value) {
		setConstNumber(offset + 35, $trd_cur_not_proc_bal, value);
	}


	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public String ap_sttl_cd() {
		return getConstString(offset + 36, $ap_sttl_cd);
	}

	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public void ap_sttl_cd(String value) {
		setConstString(offset + 36, $ap_sttl_cd, value);
	}


	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public String ap_sttl_nm() {
		return getConstString(offset + 37, $ap_sttl_nm);
	}

	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public void ap_sttl_nm(String value) {
		setConstString(offset + 37, $ap_sttl_nm, value);
	}


	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public String ap_sttl_typ() {
		return getConstString(offset + 38, $ap_sttl_typ);
	}

	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public void ap_sttl_typ(String value) {
		setConstString(offset + 38, $ap_sttl_typ, value);
	}


	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public String ap_sttl_typ_nm() {
		return getConstString(offset + 39, $ap_sttl_typ_nm);
	}

	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public void ap_sttl_typ_nm(String value) {
		setConstString(offset + 39, $ap_sttl_typ_nm, value);
	}


	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 40, $bank_ac_cd);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 40, $bank_ac_cd, value);
	}


	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public String bank_ac_nm() {
		return getConstString(offset + 41, $bank_ac_nm);
	}

	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public void bank_ac_nm(String value) {
		setConstString(offset + 41, $bank_ac_nm, value);
	}


	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return getConstString(offset + 42, $pay_bank_ac_cd);
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		setConstString(offset + 42, $pay_bank_ac_cd, value);
	}


	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public String pay_bank_ac_nm() {
		return getConstString(offset + 43, $pay_bank_ac_nm);
	}

	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public void pay_bank_ac_nm(String value) {
		setConstString(offset + 43, $pay_bank_ac_nm, value);
	}


	/**
	 * Payment per transaction flg. 都度支払ＦＬＧ.<p>
	 *
	 */
	public boolean pay_spot_flg() {
		return getConstBoolean(offset + 44, $pay_spot_flg);
	}

	/**
	 * Payment per transaction flg. 都度支払ＦＬＧ.<p>
	 *
	 */
	public void pay_spot_flg(boolean value) {
		setConstBoolean(offset + 44, $pay_spot_flg, value);
	}


	/**
	 * Display advance payment on payment notice 支払通知書前渡金表示.<p>
	 *
	 */
	public boolean pay_ntc_adv_pay_flg() {
		return getConstBoolean(offset + 45, $pay_ntc_adv_pay_flg);
	}

	/**
	 * Display advance payment on payment notice 支払通知書前渡金表示.<p>
	 *
	 */
	public void pay_ntc_adv_pay_flg(boolean value) {
		setConstBoolean(offset + 45, $pay_ntc_adv_pay_flg, value);
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
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 47, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 47, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 48, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 48, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 49, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 49, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 50, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 50, $sub_char3, value);
	}


	/**
	 * Fee AP settlement method cd. 手数料債務決済方法ＣＤ.<p>
	 *
	 */
	public String com_paid_ap_sttl_cd() {
		return getConstString(offset + 51, $com_paid_ap_sttl_cd);
	}

	/**
	 * Fee AP settlement method cd. 手数料債務決済方法ＣＤ.<p>
	 *
	 */
	public void com_paid_ap_sttl_cd(String value) {
		setConstString(offset + 51, $com_paid_ap_sttl_cd, value);
	}


	/**
	 * Fee AP settlement method name 手数料債務決済方法名.<p>
	 *
	 */
	public String com_paid_ap_sttl_nm() {
		return getConstString(offset + 52, $com_paid_ap_sttl_nm);
	}

	/**
	 * Fee AP settlement method name 手数料債務決済方法名.<p>
	 *
	 */
	public void com_paid_ap_sttl_nm(String value) {
		setConstString(offset + 52, $com_paid_ap_sttl_nm, value);
	}


	/**
	 * Fee AP settlement type 手数料債務決済区分.<p>
	 *
	 */
	public String com_paid_ap_sttl_typ() {
		return getConstString(offset + 53, $com_paid_ap_sttl_typ);
	}

	/**
	 * Fee AP settlement type 手数料債務決済区分.<p>
	 *
	 */
	public void com_paid_ap_sttl_typ(String value) {
		setConstString(offset + 53, $com_paid_ap_sttl_typ, value);
	}


	/**
	 * Fee AP settlement type name 手数料債務決済区分名.<p>
	 *
	 */
	public String com_paid_ap_sttl_typ_nm() {
		return getConstString(offset + 54, $com_paid_ap_sttl_typ_nm);
	}

	/**
	 * Fee AP settlement type name 手数料債務決済区分名.<p>
	 *
	 */
	public void com_paid_ap_sttl_typ_nm(String value) {
		setConstString(offset + 54, $com_paid_ap_sttl_typ_nm, value);
	}


	/**
	 * Fee amount (Transaction currency) 取引通貨手数料金額.<p>
	 *
	 */
	public MCNumber trd_cur_com_paid() {
		return getConstNumber(offset + 55, $trd_cur_com_paid);
	}

	/**
	 * Fee amount (Transaction currency) 取引通貨手数料金額.<p>
	 *
	 */
	public void trd_cur_com_paid(MCNumber value) {
		setConstNumber(offset + 55, $trd_cur_com_paid, value);
	}

	/**
	 * Fee amount (Transaction currency) 取引通貨手数料金額.<p>
	 *
	 */
	public void trd_cur_com_paid(int value) {
		setConstNumber(offset + 55, $trd_cur_com_paid, value);
	}

	/**
	 * Fee amount (Transaction currency) 取引通貨手数料金額.<p>
	 *
	 */
	public void trd_cur_com_paid(long value) {
		setConstNumber(offset + 55, $trd_cur_com_paid, value);
	}

	/**
	 * Fee amount (Transaction currency) 取引通貨手数料金額.<p>
	 *
	 */
	public void trd_cur_com_paid(float value) {
		setConstNumber(offset + 55, $trd_cur_com_paid, value);
	}

	/**
	 * Fee amount (Transaction currency) 取引通貨手数料金額.<p>
	 *
	 */
	public void trd_cur_com_paid(double value) {
		setConstNumber(offset + 55, $trd_cur_com_paid, value);
	}


	/**
	 * Fee tax cd. 手数料税ＣＤ.<p>
	 *
	 */
	public String trd_cur_com_paid_tax_cd() {
		return getConstString(offset + 56, $trd_cur_com_paid_tax_cd);
	}

	/**
	 * Fee tax cd. 手数料税ＣＤ.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_cd(String value) {
		setConstString(offset + 56, $trd_cur_com_paid_tax_cd, value);
	}


	/**
	 * Fee tax name 手数料税名.<p>
	 *
	 */
	public String trd_cur_com_paid_tax_nm() {
		return getConstString(offset + 57, $trd_cur_com_paid_tax_nm);
	}

	/**
	 * Fee tax name 手数料税名.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_nm(String value) {
		setConstString(offset + 57, $trd_cur_com_paid_tax_nm, value);
	}


	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public MCNumber trd_cur_com_paid_tax_rate() {
		return getConstNumber(offset + 58, $trd_cur_com_paid_tax_rate);
	}

	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(MCNumber value) {
		setConstNumber(offset + 58, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(int value) {
		setConstNumber(offset + 58, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(long value) {
		setConstNumber(offset + 58, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(float value) {
		setConstNumber(offset + 58, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(double value) {
		setConstNumber(offset + 58, $trd_cur_com_paid_tax_rate, value);
	}


	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public MCNumber trd_cur_com_paid_tax_amt() {
		return getConstNumber(offset + 59, $trd_cur_com_paid_tax_amt);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(MCNumber value) {
		setConstNumber(offset + 59, $trd_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(int value) {
		setConstNumber(offset + 59, $trd_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(long value) {
		setConstNumber(offset + 59, $trd_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(float value) {
		setConstNumber(offset + 59, $trd_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(double value) {
		setConstNumber(offset + 59, $trd_cur_com_paid_tax_amt, value);
	}


	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 60, $note_no);
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 60, $note_no, value);
	}


	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public String note_typ() {
		return getConstString(offset + 61, $note_typ);
	}

	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public void note_typ(String value) {
		setConstString(offset + 61, $note_typ, value);
	}


	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public String note_typ_nm() {
		return getConstString(offset + 62, $note_typ_nm);
	}

	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public void note_typ_nm(String value) {
		setConstString(offset + 62, $note_typ_nm, value);
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
	 * Note sight 手形サイト.<p>
	 *
	 */
	public MCNumber note_days() {
		return getConstNumber(offset + 64, $note_days);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(MCNumber value) {
		setConstNumber(offset + 64, $note_days, value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(int value) {
		setConstNumber(offset + 64, $note_days, value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(long value) {
		setConstNumber(offset + 64, $note_days, value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(float value) {
		setConstNumber(offset + 64, $note_days, value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(double value) {
		setConstNumber(offset + 64, $note_days, value);
	}


	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public MCDate due_dt() {
		return getConstDate(offset + 65, $due_dt);
	}

	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public void due_dt(MCDate value) {
		setConstDate(offset + 65, $due_dt, value);
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
	 * Endorser 裏書人.<p>
	 *
	 */
	public String endrsr() {
		return getConstString(offset + 67, $endrsr);
	}

	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public void endrsr(String value) {
		setConstString(offset + 67, $endrsr, value);
	}


	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public String accptr() {
		return getConstString(offset + 68, $accptr);
	}

	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public void accptr(String value) {
		setConstString(offset + 68, $accptr, value);
	}


	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public String draw_bank_cd() {
		return getConstString(offset + 69, $draw_bank_cd);
	}

	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public void draw_bank_cd(String value) {
		setConstString(offset + 69, $draw_bank_cd, value);
	}


	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public String draw_bank_nm() {
		return getConstString(offset + 70, $draw_bank_nm);
	}

	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public void draw_bank_nm(String value) {
		setConstString(offset + 70, $draw_bank_nm, value);
	}


	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public String draw_branch_cd() {
		return getConstString(offset + 71, $draw_branch_cd);
	}

	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public void draw_branch_cd(String value) {
		setConstString(offset + 71, $draw_branch_cd, value);
	}


	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public String draw_branch_nm() {
		return getConstString(offset + 72, $draw_branch_nm);
	}

	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public void draw_branch_nm(String value) {
		setConstString(offset + 72, $draw_branch_nm, value);
	}


	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public String note_rsn_cd() {
		return getConstString(offset + 73, $note_rsn_cd);
	}

	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public void note_rsn_cd(String value) {
		setConstString(offset + 73, $note_rsn_cd, value);
	}


	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public String note_rsn_nm() {
		return getConstString(offset + 74, $note_rsn_nm);
	}

	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public void note_rsn_nm(String value) {
		setConstString(offset + 74, $note_rsn_nm, value);
	}


	/**
	 * Note spare 1 手形予備１.<p>
	 *
	 */
	public String note_sub_char1() {
		return getConstString(offset + 75, $note_sub_char1);
	}

	/**
	 * Note spare 1 手形予備１.<p>
	 *
	 */
	public void note_sub_char1(String value) {
		setConstString(offset + 75, $note_sub_char1, value);
	}


	/**
	 * Note spare 2 手形予備２.<p>
	 *
	 */
	public String note_sub_char2() {
		return getConstString(offset + 76, $note_sub_char2);
	}

	/**
	 * Note spare 2 手形予備２.<p>
	 *
	 */
	public void note_sub_char2(String value) {
		setConstString(offset + 76, $note_sub_char2, value);
	}


	/**
	 * Note spare 3 手形予備３.<p>
	 *
	 */
	public String note_sub_char3() {
		return getConstString(offset + 77, $note_sub_char3);
	}

	/**
	 * Note spare 3 手形予備３.<p>
	 *
	 */
	public void note_sub_char3(String value) {
		setConstString(offset + 77, $note_sub_char3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 78, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 78, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 79, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 79, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 80, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 80, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 81, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 81, $ins_func_nm, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 82, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 82, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 83, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 83, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 84, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 84, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 85, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 85, $upd_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 86, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 86, $ins_ts, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 87, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 87, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 88, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 88, $upd_srv_req_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber adv_pay_upd_cntr() {
		return getConstNumber(offset + 89, $adv_pay_upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void adv_pay_upd_cntr(MCNumber value) {
		setConstNumber(offset + 89, $adv_pay_upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void adv_pay_upd_cntr(int value) {
		setConstNumber(offset + 89, $adv_pay_upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void adv_pay_upd_cntr(long value) {
		setConstNumber(offset + 89, $adv_pay_upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void adv_pay_upd_cntr(float value) {
		setConstNumber(offset + 89, $adv_pay_upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void adv_pay_upd_cntr(double value) {
		setConstNumber(offset + 89, $adv_pay_upd_cntr, value);
	}


	public String getString(String name) {
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			return adv_pay_act_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
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
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			return psppl_rmrks();
		}
		if ($pay_usr_cd.equalsIgnoreCase(name)) {
			return pay_usr_cd();
		}
		if ($pay_usr_nm.equalsIgnoreCase(name)) {
			return pay_usr_nm();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			return pay_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
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
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
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
		if ($com_paid_ap_sttl_cd.equalsIgnoreCase(name)) {
			return com_paid_ap_sttl_cd();
		}
		if ($com_paid_ap_sttl_nm.equalsIgnoreCase(name)) {
			return com_paid_ap_sttl_nm();
		}
		if ($com_paid_ap_sttl_typ.equalsIgnoreCase(name)) {
			return com_paid_ap_sttl_typ();
		}
		if ($com_paid_ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			return com_paid_ap_sttl_typ_nm();
		}
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_cd();
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_nm();
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
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			return adv_pay_act_seq();
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			return adv_pay_act_rev();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			return trd_cur_setoff_tgt_amt();
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			return trd_cur_setoff_schd_amt();
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			return trd_cur_setoff_act_amt();
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			return trd_cur_not_proc_bal();
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			return trd_cur_com_paid();
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_rate();
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_amt();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			return adv_pay_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			return pay_act_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			return draw_dt();
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			return pay_ntc_adv_pay_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			return adv_pay_act_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
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
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			return psppl_rmrks();
		}
		if ($pay_usr_cd.equalsIgnoreCase(name)) {
			return pay_usr_cd();
		}
		if ($pay_usr_nm.equalsIgnoreCase(name)) {
			return pay_usr_nm();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			return pay_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
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
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
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
		if ($com_paid_ap_sttl_cd.equalsIgnoreCase(name)) {
			return com_paid_ap_sttl_cd();
		}
		if ($com_paid_ap_sttl_nm.equalsIgnoreCase(name)) {
			return com_paid_ap_sttl_nm();
		}
		if ($com_paid_ap_sttl_typ.equalsIgnoreCase(name)) {
			return com_paid_ap_sttl_typ();
		}
		if ($com_paid_ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			return com_paid_ap_sttl_typ_nm();
		}
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_cd();
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_nm();
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
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			return adv_pay_act_seq();
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			return adv_pay_act_rev();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			return trd_cur_setoff_tgt_amt();
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			return trd_cur_setoff_schd_amt();
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			return trd_cur_setoff_act_amt();
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			return trd_cur_not_proc_bal();
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			return trd_cur_com_paid();
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_rate();
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_amt();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			return adv_pay_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			return pay_act_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			return draw_dt();
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			return pay_ntc_adv_pay_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			adv_pay_act_no(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
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
		if ($pay_usr_cd.equalsIgnoreCase(name)) {
			pay_usr_cd(value);
			return;
		}
		if ($pay_usr_nm.equalsIgnoreCase(name)) {
			pay_usr_nm(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
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
		if ($com_paid_ap_sttl_cd.equalsIgnoreCase(name)) {
			com_paid_ap_sttl_cd(value);
			return;
		}
		if ($com_paid_ap_sttl_nm.equalsIgnoreCase(name)) {
			com_paid_ap_sttl_nm(value);
			return;
		}
		if ($com_paid_ap_sttl_typ.equalsIgnoreCase(name)) {
			com_paid_ap_sttl_typ(value);
			return;
		}
		if ($com_paid_ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			com_paid_ap_sttl_typ_nm(value);
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
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			adv_pay_act_rev(value);
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
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_tgt_amt(value);
			return;
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_schd_amt(value);
			return;
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_act_amt(value);
			return;
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			trd_cur_not_proc_bal(value);
			return;
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			adv_pay_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			adv_pay_act_rev(value);
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
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_tgt_amt(value);
			return;
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_schd_amt(value);
			return;
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_act_amt(value);
			return;
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			trd_cur_not_proc_bal(value);
			return;
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			adv_pay_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			adv_pay_act_rev(value);
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
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_tgt_amt(value);
			return;
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_schd_amt(value);
			return;
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_act_amt(value);
			return;
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			trd_cur_not_proc_bal(value);
			return;
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			adv_pay_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			adv_pay_act_rev(value);
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
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_tgt_amt(value);
			return;
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_schd_amt(value);
			return;
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_act_amt(value);
			return;
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			trd_cur_not_proc_bal(value);
			return;
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			adv_pay_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			adv_pay_act_rev(value);
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
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_tgt_amt(value);
			return;
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_schd_amt(value);
			return;
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_act_amt(value);
			return;
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			trd_cur_not_proc_bal(value);
			return;
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			adv_pay_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			pay_act_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			pay_ntc_adv_pay_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($adv_pay_act_no.equalsIgnoreCase(name)) {
			adv_pay_act_no(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
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
		if ($pay_usr_cd.equalsIgnoreCase(name)) {
			pay_usr_cd(value);
			return;
		}
		if ($pay_usr_nm.equalsIgnoreCase(name)) {
			pay_usr_nm(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
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
		if ($com_paid_ap_sttl_cd.equalsIgnoreCase(name)) {
			com_paid_ap_sttl_cd(value);
			return;
		}
		if ($com_paid_ap_sttl_nm.equalsIgnoreCase(name)) {
			com_paid_ap_sttl_nm(value);
			return;
		}
		if ($com_paid_ap_sttl_typ.equalsIgnoreCase(name)) {
			com_paid_ap_sttl_typ(value);
			return;
		}
		if ($com_paid_ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			com_paid_ap_sttl_typ_nm(value);
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
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			adv_pay_act_rev(value);
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
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_tgt_amt(value);
			return;
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_schd_amt(value);
			return;
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_act_amt(value);
			return;
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			trd_cur_not_proc_bal(value);
			return;
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			adv_pay_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			adv_pay_act_rev(value);
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
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_tgt_amt(value);
			return;
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_schd_amt(value);
			return;
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_act_amt(value);
			return;
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			trd_cur_not_proc_bal(value);
			return;
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			adv_pay_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			adv_pay_act_rev(value);
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
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_tgt_amt(value);
			return;
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_schd_amt(value);
			return;
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_act_amt(value);
			return;
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			trd_cur_not_proc_bal(value);
			return;
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			adv_pay_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			adv_pay_act_rev(value);
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
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_tgt_amt(value);
			return;
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_schd_amt(value);
			return;
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_act_amt(value);
			return;
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			trd_cur_not_proc_bal(value);
			return;
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			adv_pay_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($adv_pay_act_seq.equalsIgnoreCase(name)) {
			adv_pay_act_seq(value);
			return;
		}
		if ($adv_pay_act_rev.equalsIgnoreCase(name)) {
			adv_pay_act_rev(value);
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
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_setoff_tgt_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_tgt_amt(value);
			return;
		}
		if ($trd_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_schd_amt(value);
			return;
		}
		if ($trd_cur_setoff_act_amt.equalsIgnoreCase(name)) {
			trd_cur_setoff_act_amt(value);
			return;
		}
		if ($trd_cur_not_proc_bal.equalsIgnoreCase(name)) {
			trd_cur_not_proc_bal(value);
			return;
		}
		if ($trd_cur_com_paid.equalsIgnoreCase(name)) {
			trd_cur_com_paid(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($adv_pay_upd_cntr.equalsIgnoreCase(name)) {
			adv_pay_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			pay_act_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			pay_ntc_adv_pay_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

