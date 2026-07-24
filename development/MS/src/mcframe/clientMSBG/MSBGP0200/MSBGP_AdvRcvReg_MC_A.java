package mcframe.clientMSBG.MSBGP0200;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.text.*;
import mcframe.clientCore.beans.list.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.param.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.commonCore.meta.MCMeta;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.beans.popup.MCTextPopupMenuItem;
import mcframe.clientCore.beans.text.MCInputMethodType;
import mcframe.clientMSBG.MSBGP0200.MSBGP_AdvRcvReg_MC.MS_MSBGL0200_Srch01Caller;
import mcframe.clientMSBG.MSBGP0200.MSBGP_AdvRcvReg_MC.MS_MSBGL0200_Srch02Caller;
import mcframe.clientMSBG.MSBGP0200.MSBGP_AdvRcvReg_MC.MS_MSBGL0200_Ins01Caller;
import mcframe.clientMSBG.MSBGP0200.MSBGP_AdvRcvReg_MC.MS_MSBGL0200_Upd01Caller;
import mcframe.clientMSBG.MSBGP0200.MSBGP_AdvRcvReg_MC.MS_MSBGL0200_Del01Caller;

/**
 * 画面"MSBGP_AdvRcvReg"パネルクラスです。<p>
 *
 * 前受金もしく仮受金を登録する。仮受金を前受金もしくはその他勘定に振り替える。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGP_AdvRcvReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBG";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBGP0200";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [ScreenOpe]ブロック関連のField定義
	public MCPanel ScreenOpePanel = null;
	public MCTitledBorder ScreenOpeTitledBorder = null;
	// [ScreenOpe]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * INS,Create;UPD,Modify;DEL,Cancel;REF,View INS,登録する;UPD,訂正する;DEL,取り消す;REF,参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_rcv_act_no_Label = null;
	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rcv_act_no = null;
	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public MCNumberField Cnd_rcv_act_rev = null;
	/**
	 * Latest 最新.<p>
	 *
	 */
	public MCCheckBox Cnd_latest_flg = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [HdrTab]ブロック関連のField定義
	public MCPanel HdrTabPanel = null;
	public MCTabbedPane HdrTabTab = null;
	// [HdrTab]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_trd_cd_Label = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_trd_cd = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCTextField Hdr_trd_ptn_typ = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCTextField Hdr_trd_nm = null;
	public MCLabel Hdr_ac_ym_Label = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDateField Hdr_ac_ym = null;
	public MCLabel Hdr_rcv_act_no_Label = null;
	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_rcv_act_no = null;
	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public MCNumberField Hdr_rcv_act_rev = null;
	/**
	 * Status 状況.<p>
	 *
	 */
	public MCTextField Hdr_slip_sts_typ = null;
	/**
	 * Latest 最新.<p>
	 *
	 */
	public MCCheckBox Hdr_latest_flg = null;
	public mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H Hdr_ac_dt_p_PPanel;
	public MCDateField Hdr_ac_dt;	// [Hdr]の[ac_dt_p.ac_dt]を[Hdr_ac_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H Hdr_can_ac_dt_p_PPanel;
	public MCDateField Hdr_can_ac_dt_for_input;	// [Hdr]の[can_ac_dt_p.can_ac_dt_for_input]を[Hdr_can_ac_dt_for_input]としてエイリアス定義。
	public MCDateField Hdr_can_ac_dt;	// [Hdr]の[can_ac_dt_p.can_ac_dt_for_call]を[Hdr_can_ac_dt]としてエイリアス定義。
	public MCDateField Hdr_ac_dt_after_srch;	// [Hdr]の[can_ac_dt_p.ac_dt_after_srch]を[Hdr_ac_dt_after_srch]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H Hdr_usr_dpt_p_PPanel;
	public MCTextField Hdr_usr_cd;	// [Hdr]の[usr_dpt_p.usr_cd]を[Hdr_usr_cd]としてエイリアス定義。
	public MCTextField Hdr_usr_nm;	// [Hdr]の[usr_dpt_p.usr_nm]を[Hdr_usr_nm]としてエイリアス定義。
	public MCTextComboBox Hdr_dpt_cd;	// [Hdr]の[usr_dpt_p.dpt_cd]を[Hdr_dpt_cd]としてエイリアス定義。
	public MCTextField Hdr_dpt_nm;	// [Hdr]の[usr_dpt_p.dpt_nm]を[Hdr_dpt_nm]としてエイリアス定義。
	/**
	 * Default account cd. デフォルト口座ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_def_bank_ac_cd = null;
	public MCLabel Hdr_wg_cd_Label = null;
	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_wg_cd = null;
	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public MCTextField Hdr_wg_nm = null;
	public MCLabel Hdr_ins_usr_id_Label = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr_ins_usr_nm = null;
	public MCLabel Hdr_ins_func_id_Label = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCTextField Hdr_ins_func_nm = null;
	public MCLabel Hdr_upd_usr_id_Label = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr_upd_usr_nm = null;
	public MCLabel Hdr_upd_func_id_Label = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCTextField Hdr_upd_func_nm = null;
	public MCLabel Hdr_ins_ts_Label = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestampField Hdr_ins_ts = null;
	public MCLabel Hdr_upd_ts_Label = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestampField Hdr_upd_ts = null;
	public MCLabel Hdr_upd_srv_req_no_Label = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_upd_srv_req_no = null;
	// [Sys]ブロック関連のField定義
	public MCPanel SysPanel = null;
	// [Sys]ブロックの項目のField定義
	// [RcvTab]ブロック関連のField定義
	public MCPanel RcvTabPanel = null;
	public MCTabbedPane RcvTabTab = null;
	// [RcvTab]ブロックの項目のField定義
	// [Rcv]ブロック関連のField定義
	public MCPanel RcvPanel = null;
	// [Rcv]ブロックの項目のField定義
	public MCLabel Rcv_rcv_no_Label = null;
	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public MCTextField Rcv_rcv_no = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Rcv_srch = null;
	public MCLabel Rcv_slo_no_Label = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCTextField Rcv_slo_no = null;
	public MCLabel Rcv_rcv_dt_Label = null;
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCDateField Rcv_rcv_dt = null;
	public MCLabel Rcv_rcst_cd_Label = null;
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public MCTextField Rcv_rcst_cd = null;
	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public MCTextField Rcv_rcst_nm = null;
	public MCLabel Rcv_bcst_cd_Label = null;
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rcv_bcst_cd = null;
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public MCTextField Rcv_bcst_nm = null;
	public MCLabel Rcv_bill_dpt_cd_Label = null;
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rcv_bill_dpt_cd = null;
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public MCTextField Rcv_bill_dpt_nm = null;
	public MCLabel Rcv_trd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rcv_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField Rcv_trd_cur_nm = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Rcv_amt_dec_place = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Rcv_upri_dec_place = null;
	public mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H Rcv_xrate_p_PPanel;
	public MCNumberField Rcv_xrate;	// [Rcv]の[xrate_p.xrate]を[Rcv_xrate]としてエイリアス定義。
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Rcv_base_cur_cd = null;
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCTextField Rcv_xrate_cd = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Rcv_rcv_amt_p_PPanel;
	public MCNumberField Rcv_rcv_amt;	// [Rcv]の[rcv_amt_p.amt]を[Rcv_rcv_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Rcv_not_proc_bal_p_PPanel;
	public MCNumberField Rcv_not_proc_bal;	// [Rcv]の[not_proc_bal_p.amt]を[Rcv_not_proc_bal]としてエイリアス定義。
	public MCLabel Rcv_ar_sttl_cd1_Label = null;
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rcv_ar_sttl_cd1 = null;
	/**
	 * Payment received method type 入金方法区分.<p>
	 *
	 */
	public MCTextField Rcv_ar_sttl_typ1 = null;
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public MCTextField Rcv_ar_sttl_nm1 = null;
	public MCLabel Rcv_bank_ac_cd_Label = null;
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rcv_bank_ac_cd = null;
	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public MCTextField Rcv_bank_ac_nm = null;
	public MCLabel Rcv_xfr_psn_Label = null;
	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public MCTextField Rcv_xfr_psn = null;
	public MCLabel Rcv_ar_sttl_cd2_Label = null;
	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rcv_ar_sttl_cd2 = null;
	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public MCTextField Rcv_ar_sttl_nm2 = null;
	/**
	 * Sales purchase tax type 売上仕入税区分.<p>
	 *
	 */
	public MCTextField Rcv_sls_purc_typ2 = null;
	/**
	 * Sales result 売上.<p>
	 *
	 */
	public MCCheckBox Rcv_purc_flg = null;
	/**
	 * Purchase 仕入.<p>
	 *
	 */
	public MCCheckBox Rcv_sls_flg = null;
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCTextField Rcv_tax_cd_sub = null;
	public MCLabel Rcv_tax_cd_Label = null;
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rcv_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCTextField Rcv_tax_nm = null;
	public MCLabel Rcv_tax_rate_Label = null;
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumberField Rcv_tax_rate = null;
	public MCLabel Rcv_debtor_id_typ_Label = null;
	/**
	 * Debtor identification type 借方先識別区分.<p>
	 *
	 */
	public MCTextComboBox Rcv_debtor_id_typ = null;
	/**
	 * Debtor identification type name 借方先識別区分名.<p>
	 *
	 */
	public MCTextField Rcv_debtor_id_typ_nm = null;
	/**
	 * Debtor cd. 借方先ＣＤ.<p>
	 *
	 */
	public MCTextField Rcv_debtor_id_cd = null;
	/**
	 * Debtor name 借方先名.<p>
	 *
	 */
	public MCTextField Rcv_debtor_nm = null;
	public MCLabel Rcv_debt_bd_dpt_cd_Label = null;
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public MCTextField Rcv_debt_bd_dpt_cd = null;
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public MCTextField Rcv_debt_bd_dpt_nm = null;
	public MCLabel Rcv_trd_rmrks_Label = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCTextField Rcv_trd_rmrks = null;
	public MCLabel Rcv_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Rcv_sub_char1 = null;
	public MCLabel Rcv_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Rcv_sub_char2 = null;
	public MCLabel Rcv_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Rcv_sub_char3 = null;
	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public MCNumberField Rcv_rcv_upd_cntr = null;
	public MCLabel Rcv_note_no_Label = null;
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public MCTextField Rcv_note_no = null;
	public MCLabel Rcv_note_typ_Label = null;
	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public MCTextField Rcv_note_typ = null;
	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public MCTextField Rcv_note_typ_nm = null;
	public MCLabel Rcv_draw_dt_Label = null;
	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public MCDateField Rcv_draw_dt = null;
	public MCLabel Rcv_due_dt_Label = null;
	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public MCDateField Rcv_due_dt = null;
	public MCLabel Rcv_drawer_nm_Label = null;
	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public MCTextField Rcv_drawer_nm = null;
	public MCLabel Rcv_endrsr_Label = null;
	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public MCTextField Rcv_endrsr = null;
	public MCLabel Rcv_accptr_Label = null;
	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public MCTextField Rcv_accptr = null;
	public MCLabel Rcv_draw_bank_cd_Label = null;
	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public MCTextField Rcv_draw_bank_cd = null;
	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public MCTextField Rcv_draw_bank_nm = null;
	public MCLabel Rcv_draw_branch_cd_Label = null;
	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public MCTextField Rcv_draw_branch_cd = null;
	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public MCTextField Rcv_draw_branch_nm = null;
	public MCLabel Rcv_note_rsn_cd_Label = null;
	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public MCTextField Rcv_note_rsn_cd = null;
	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public MCTextField Rcv_note_rsn_nm = null;
	public MCLabel Rcv_note_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Rcv_note_sub_char1 = null;
	public MCLabel Rcv_note_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Rcv_note_sub_char2 = null;
	public MCLabel Rcv_note_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Rcv_note_sub_char3 = null;
	public MCLabel Rcv_ar_sttl_cd3_Label = null;
	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rcv_ar_sttl_cd3 = null;
	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public MCTextField Rcv_ar_sttl_nm3 = null;
	public MCLabel Rcv_creditor_id_typ_Label = null;
	/**
	 * Creditor identification type 貸方先識別区分.<p>
	 *
	 */
	public MCTextComboBox Rcv_creditor_id_typ = null;
	/**
	 * Creditor identification type name 貸方先識別区分名.<p>
	 *
	 */
	public MCTextField Rcv_creditor_id_typ_nm = null;
	/**
	 * Creditor cd. 貸方先ＣＤ.<p>
	 *
	 */
	public MCTextField Rcv_creditor_id_cd = null;
	/**
	 * Creditor name 貸方先名.<p>
	 *
	 */
	public MCTextField Rcv_creditor_nm = null;
	public MCLabel Rcv_cred_bd_dpt_cd_Label = null;
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public MCTextField Rcv_cred_bd_dpt_cd = null;
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public MCTextField Rcv_cred_bd_dpt_nm = null;
	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public MCTextField Rcv_bill_cl_typ = null;
	/**
	 * Display advance received on invoice 請求書前受金表示.<p>
	 *
	 */
	public MCCheckBox Rcv_bill_dtl_adv_flg = null;
	// [Note]ブロック関連のField定義
	public MCPanel NotePanel = null;
	// [Note]ブロックの項目のField定義
	// [Setoff]ブロック関連のField定義
	public MCPanel SetoffPanel = null;
	// [Setoff]ブロックの項目のField定義
	// [AdvRcv]ブロック関連のField定義
	public MCPanel AdvRcvPanel = null;
	public MCTitledBorder AdvRcvTitledBorder = null;
	// [AdvRcv]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H AdvRcv_amt1_p_PPanel;
	public MCNumberField AdvRcv_amt1;	// [AdvRcv]の[amt1_p.amt]を[AdvRcv_amt1]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H AdvRcv_amt2_p_PPanel;
	public MCNumberField AdvRcv_amt2;	// [AdvRcv]の[amt2_p.amt]を[AdvRcv_amt2]としてエイリアス定義。
	public MCLabel AdvRcv_rcv_no_Label = null;
	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public MCTextField AdvRcv_rcv_no = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H AdvRcv_appl_amt_p_PPanel;
	public MCNumberField AdvRcv_appl_amt;	// [AdvRcv]の[appl_amt_p.amt]を[AdvRcv_appl_amt]としてエイリアス定義。
	/**
	 * Split 分割.<p>
	 *
	 */
	public MCCheckBox AdvRcv_div_flg = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_ins = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [SRCH_NEW_RCV]モードを表す定数 */
	public static final String SRCH_NEW_RCV = "SRCH_NEW_RCV";
	/** [REF_NEW_RCV]モードを表す定数 */
	public static final String REF_NEW_RCV = "REF_NEW_RCV";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [SRCH_RCV]モードを表す定数 */
	public static final String SRCH_RCV = "SRCH_RCV";
	/** [REF_RCV]モードを表す定数 */
	public static final String REF_RCV = "REF_RCV";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [NO_SLIP_CD]モードを表す定数 */
	public static final String NO_SLIP_CD = "NO_SLIP_CD";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INS, SRCH_NEW_RCV, REF_NEW_RCV, SRCH, UPD, SRCH_RCV, REF_RCV, FIX_U, FIX_I, REF, NO_SLIP_CD, DEL, FIX_D};
	
	/** [MS_MSBGL0200_Srch01]のCallerの作成 */
	protected MSBGP_AdvRcvReg_MC.MS_MSBGL0200_Srch01Caller createMS_MSBGL0200_Srch01() {
		MSBGP_AdvRcvReg_MC.MS_MSBGL0200_Srch01Caller<MSBGP_AdvRcvReg, MS_MSBGL0200_Srch01Bridge>
		caller = ((MSBGP_AdvRcvReg_MC)this).new MS_MSBGL0200_Srch01Caller<MSBGP_AdvRcvReg, MS_MSBGL0200_Srch01Bridge>(
					(MSBGP_AdvRcvReg)this, new MS_MSBGL0200_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBGL0200_Srch01]の呼び出し */
	protected void callMS_MSBGL0200_Srch01() {
		MCCaller caller = createMS_MSBGL0200_Srch01();
		caller.exec();
	}
	/** [MS_MSBGL0200_Srch02]のCallerの作成 */
	protected MSBGP_AdvRcvReg_MC.MS_MSBGL0200_Srch02Caller createMS_MSBGL0200_Srch02() {
		MSBGP_AdvRcvReg_MC.MS_MSBGL0200_Srch02Caller<MSBGP_AdvRcvReg, MS_MSBGL0200_Srch02Bridge>
		caller = ((MSBGP_AdvRcvReg_MC)this).new MS_MSBGL0200_Srch02Caller<MSBGP_AdvRcvReg, MS_MSBGL0200_Srch02Bridge>(
					(MSBGP_AdvRcvReg)this, new MS_MSBGL0200_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBGL0200_Srch02]の呼び出し */
	protected void callMS_MSBGL0200_Srch02() {
		MCCaller caller = createMS_MSBGL0200_Srch02();
		caller.exec();
	}
	/** [MS_MSBGL0200_Ins01]のCallerの作成 */
	protected MSBGP_AdvRcvReg_MC.MS_MSBGL0200_Ins01Caller createMS_MSBGL0200_Ins01() {
		MSBGP_AdvRcvReg_MC.MS_MSBGL0200_Ins01Caller<MSBGP_AdvRcvReg, MS_MSBGL0200_Ins01Bridge>
		caller = ((MSBGP_AdvRcvReg_MC)this).new MS_MSBGL0200_Ins01Caller<MSBGP_AdvRcvReg, MS_MSBGL0200_Ins01Bridge>(
					(MSBGP_AdvRcvReg)this, new MS_MSBGL0200_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBGL0200_Ins01]の呼び出し */
	protected void callMS_MSBGL0200_Ins01() {
		MCCaller caller = createMS_MSBGL0200_Ins01();
		caller.exec();
	}
	/** [MS_MSBGL0200_Upd01]のCallerの作成 */
	protected MSBGP_AdvRcvReg_MC.MS_MSBGL0200_Upd01Caller createMS_MSBGL0200_Upd01() {
		MSBGP_AdvRcvReg_MC.MS_MSBGL0200_Upd01Caller<MSBGP_AdvRcvReg, MS_MSBGL0200_Upd01Bridge>
		caller = ((MSBGP_AdvRcvReg_MC)this).new MS_MSBGL0200_Upd01Caller<MSBGP_AdvRcvReg, MS_MSBGL0200_Upd01Bridge>(
					(MSBGP_AdvRcvReg)this, new MS_MSBGL0200_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBGL0200_Upd01]の呼び出し */
	protected void callMS_MSBGL0200_Upd01() {
		MCCaller caller = createMS_MSBGL0200_Upd01();
		caller.exec();
	}
	/** [MS_MSBGL0200_Del01]のCallerの作成 */
	protected MSBGP_AdvRcvReg_MC.MS_MSBGL0200_Del01Caller createMS_MSBGL0200_Del01() {
		MSBGP_AdvRcvReg_MC.MS_MSBGL0200_Del01Caller<MSBGP_AdvRcvReg, MS_MSBGL0200_Del01Bridge>
		caller = ((MSBGP_AdvRcvReg_MC)this).new MS_MSBGL0200_Del01Caller<MSBGP_AdvRcvReg, MS_MSBGL0200_Del01Bridge>(
					(MSBGP_AdvRcvReg)this, new MS_MSBGL0200_Del01Bridge());
		return caller;
	}
	/** [MS_MSBGL0200_Del01]の呼び出し */
	protected void callMS_MSBGL0200_Del01() {
		MCCaller caller = createMS_MSBGL0200_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0200.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0200.HdrR aHdrR;
	/** [Rcv]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0200.RcvR aRcvR;
	/** [AdvRcv]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0200.AdvRcvR aAdvRcvR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBG.MSBGP0200.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0200.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0200.CndR createCndR() {
		return mcframe.clientMSBG.MSBGP0200.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBG.MSBGP0200.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBG.MSBGP0200.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBG.MSBGP0200.HdrR createHdrR() {
		return mcframe.clientMSBG.MSBGP0200.HdrR.create();
	}

	/**
	 * 項目コピーによってaRcvRを設定します。
	 *
	 * aRcvRのインスタンスは変更されません。
	 *
	 * @param row RcvR
	 */
	public void setRcvR(mcframe.clientMSBG.MSBGP0200.RcvR row) {
		if (row != null) {
			MCRow.copyall(getRcvR(), row);
		}
	}

	/**
	 * [Rcv]ブロックのコンテナaRcvRを返します。
	 *
	 * @return RcvR
	 */
	public mcframe.clientMSBG.MSBGP0200.RcvR getRcvR() {
		return aRcvR;
	}

	/**
	 * aRcvRを作成します。
	 *
	 * @return RcvR
	 */
	public mcframe.clientMSBG.MSBGP0200.RcvR createRcvR() {
		return mcframe.clientMSBG.MSBGP0200.RcvR.create();
	}

	/**
	 * 項目コピーによってaAdvRcvRを設定します。
	 *
	 * aAdvRcvRのインスタンスは変更されません。
	 *
	 * @param row AdvRcvR
	 */
	public void setAdvRcvR(mcframe.clientMSBG.MSBGP0200.AdvRcvR row) {
		if (row != null) {
			MCRow.copyall(getAdvRcvR(), row);
		}
	}

	/**
	 * [AdvRcv]ブロックのコンテナaAdvRcvRを返します。
	 *
	 * @return AdvRcvR
	 */
	public mcframe.clientMSBG.MSBGP0200.AdvRcvR getAdvRcvR() {
		return aAdvRcvR;
	}

	/**
	 * aAdvRcvRを作成します。
	 *
	 * @return AdvRcvR
	 */
	public mcframe.clientMSBG.MSBGP0200.AdvRcvR createAdvRcvR() {
		return mcframe.clientMSBG.MSBGP0200.AdvRcvR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getRcvR())) ret.add(getRcvR());
		if(!MCCollectionUtil.contains(ret, getAdvRcvR())) ret.add(getAdvRcvR());
		return ret;
	}

	/**
	 * コンテナに対応したブロックのIDを返します。
	 *
	 * 引数のコンテナに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return ブロックID
	 */
	public String getBlockId(MCContainer aCnt){
		if(aCnt == null) return null;
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getRcvR()) return "Rcv";
		if(aCnt == getAdvRcvR()) return "AdvRcv";
		return super.getBlockId(aCnt);
	}

	/**
	 * ブロックIDに対応したコンテナを返します。
	 *
	 * 引数のブロックIDに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return コンテナ
	 */
	public MCContainer getContainer(String bId){
		if(bId == null) return null;
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("Rcv")) return getRcvR();
		if(bId.equals("AdvRcv")) return getAdvRcvR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(ScreenOpePanel);
		ret.add(CndPanel);
		ret.add(HdrTabPanel);
		ret.add(HdrPanel);
		ret.add(SysPanel);
		ret.add(RcvTabPanel);
		ret.add(RcvPanel);
		ret.add(NotePanel);
		ret.add(SetoffPanel);
		ret.add(AdvRcvPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_AdvRcvReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aRcvR = createRcvR();
		aAdvRcvR = createAdvRcvR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBGP_AdvRcvReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aRcvR = createRcvR();
		aAdvRcvR = createAdvRcvR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBGP_AdvRcvReg_MC.jbCreateScreenOpe((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbCreateCnd((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbCreateHdrTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbCreateHdr((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbCreateSys((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbCreateRcvTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbCreateRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbCreateNote((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbCreateSetoff((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbCreateAdvRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbCreateBtn((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbCreateEastBtn((MSBGP_AdvRcvReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBGP_AdvRcvReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBGP_AdvRcvReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBGP_AdvRcvReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBGP_AdvRcvReg p) {
		p.Hdr_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.create(p.getHdrR().ac_dt_p());
		p.Hdr_ac_dt_p_PPanel.setName("Hdr.ac_dt_p");
		p.Hdr_ac_dt = p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt;
		p.Hdr_ac_dt.addAliasName("Hdr.ac_dt", p);
		p.Hdr_can_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.create(p.getHdrR().can_ac_dt_p());
		p.Hdr_can_ac_dt_p_PPanel.setName("Hdr.can_ac_dt_p");
		p.Hdr_can_ac_dt_for_input = p.Hdr_can_ac_dt_p_PPanel.CanAcDt_can_ac_dt_for_input;
		p.Hdr_can_ac_dt_for_input.addAliasName("Hdr.can_ac_dt_for_input", p);
		p.Hdr_can_ac_dt = p.Hdr_can_ac_dt_p_PPanel.CanAcDt_can_ac_dt_for_call;
		p.Hdr_can_ac_dt.addAliasName("Hdr.can_ac_dt", p);
		p.Hdr_ac_dt_after_srch = p.Hdr_can_ac_dt_p_PPanel.CanAcDt_ac_dt_after_srch;
		p.Hdr_ac_dt_after_srch.addAliasName("Hdr.ac_dt_after_srch", p);
		p.Hdr_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getHdrR().usr_dpt_p());
		p.Hdr_usr_dpt_p_PPanel.setName("Hdr.usr_dpt_p");
		p.Hdr_usr_cd = p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.Hdr_usr_cd.addAliasName("Hdr.usr_cd", p);
		p.Hdr_usr_nm = p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.Hdr_usr_nm.addAliasName("Hdr.usr_nm", p);
		p.Hdr_dpt_cd = p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.Hdr_dpt_cd.addAliasName("Hdr.dpt_cd", p);
		p.Hdr_dpt_nm = p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.Hdr_dpt_nm.addAliasName("Hdr.dpt_nm", p);
	}

	/**
	 * [Sys]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSys(MSBGP_AdvRcvReg p) {
	}

	/**
	 * [RcvTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRcvTab(MSBGP_AdvRcvReg p) {
	}

	/**
	 * [Rcv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRcv(MSBGP_AdvRcvReg p) {
		p.Rcv_xrate_p_PPanel = mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.create(p.getRcvR().xrate_p());
		p.Rcv_xrate_p_PPanel.setName("Rcv.xrate_p");
		p.Rcv_xrate = p.Rcv_xrate_p_PPanel.Xrate_xrate;
		p.Rcv_xrate.addAliasName("Rcv.xrate", p);
		p.Rcv_rcv_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getRcvR().rcv_amt_p());
		p.Rcv_rcv_amt_p_PPanel.setName("Rcv.rcv_amt_p");
		p.Rcv_rcv_amt = p.Rcv_rcv_amt_p_PPanel.Amt_amt;
		p.Rcv_rcv_amt.addAliasName("Rcv.rcv_amt", p);
		p.Rcv_not_proc_bal_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getRcvR().not_proc_bal_p());
		p.Rcv_not_proc_bal_p_PPanel.setName("Rcv.not_proc_bal_p");
		p.Rcv_not_proc_bal = p.Rcv_not_proc_bal_p_PPanel.Amt_amt;
		p.Rcv_not_proc_bal.addAliasName("Rcv.not_proc_bal", p);
	}

	/**
	 * [Note]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateNote(MSBGP_AdvRcvReg p) {
	}

	/**
	 * [Setoff]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSetoff(MSBGP_AdvRcvReg p) {
	}

	/**
	 * [AdvRcv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAdvRcv(MSBGP_AdvRcvReg p) {
		p.AdvRcv_amt1_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getAdvRcvR().amt1_p());
		p.AdvRcv_amt1_p_PPanel.setName("AdvRcv.amt1_p");
		p.AdvRcv_amt1 = p.AdvRcv_amt1_p_PPanel.Amt_amt;
		p.AdvRcv_amt1.addAliasName("AdvRcv.amt1", p);
		p.AdvRcv_amt2_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getAdvRcvR().amt2_p());
		p.AdvRcv_amt2_p_PPanel.setName("AdvRcv.amt2_p");
		p.AdvRcv_amt2 = p.AdvRcv_amt2_p_PPanel.Amt_amt;
		p.AdvRcv_amt2.addAliasName("AdvRcv.amt2", p);
		p.AdvRcv_appl_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getAdvRcvR().appl_amt_p());
		p.AdvRcv_appl_amt_p_PPanel.setName("AdvRcv.appl_amt_p");
		p.AdvRcv_appl_amt = p.AdvRcv_appl_amt_p_PPanel.Amt_amt;
		p.AdvRcv_appl_amt.addAliasName("AdvRcv.appl_amt", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBGP_AdvRcvReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBGP_AdvRcvReg p) {
	}

	/**
	 * この画面のステータスのSet集合を返します。
	 * 
	 * @return ステータスのSet
	 */
	@Override
	public Set<String> getStatusSet(){
		Set<String> sSet = super.getStatusSet();
		for(String aStr : statusArray) sSet.add(aStr);
		return sSet;
	}

	
	/** [Hdr_trd_cd_ListPutter]の定義 */
	private MCListPutter Hdr_trd_cd_p = null;

	/**
	 * [Hdr_trd_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_trd_cd_ListPutter() {
		if (Hdr_trd_cd_p == null) {
			Hdr_trd_cd_p = createHdr_trd_cd_ListPutter(Hdr_trd_cd, "trd_cd", "trd_ptn_typ","trd_nm");

		}
		return Hdr_trd_cd_p;
	}
	
	
	/** [Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "dpt_cd", "dpt_nm","wg_cd","wg_nm","def_bank_ac_cd");
		}
		return Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Rcv_slo_no_ListPutter]の定義 */
	private MCListPutter Rcv_slo_no_p = null;

	/**
	 * [Rcv_slo_no_ListPutter]の取得
	 */
	protected MCListPutter getRcv_slo_no_ListPutter() {
		if (Rcv_slo_no_p == null) {
			Rcv_slo_no_p = createRcv_slo_no_ListPutter(Rcv_slo_no, "slo_no");

		}
		return Rcv_slo_no_p;
	}
	
	
	/** [Rcv_rcst_cd_ListPutter]の定義 */
	private MCListPutter Rcv_rcst_cd_p = null;

	/**
	 * [Rcv_rcst_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcv_rcst_cd_ListPutter() {
		if (Rcv_rcst_cd_p == null) {
			Rcv_rcst_cd_p = createRcv_rcst_cd_ListPutter(Rcv_rcst_cd, "rcst_cd", "rcst_nm","xfr_psn");

		}
		return Rcv_rcst_cd_p;
	}
	
	
	/** [Rcv_bcst_cd_ListPutter]の定義 */
	private MCListPutter Rcv_bcst_cd_p = null;

	/**
	 * [Rcv_bcst_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcv_bcst_cd_ListPutter() {
		if (Rcv_bcst_cd_p == null) {
			Rcv_bcst_cd_p = createRcv_bcst_cd_ListPutter(Rcv_bcst_cd, "bcst_cd", "bcst_nm","bill_cl_typ","bill_dtl_adv_flg");

		}
		return Rcv_bcst_cd_p;
	}
	
	
	/** [Rcv_bill_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rcv_bill_dpt_cd_p = null;

	/**
	 * [Rcv_bill_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcv_bill_dpt_cd_ListPutter() {
		if (Rcv_bill_dpt_cd_p == null) {
			Rcv_bill_dpt_cd_p = createRcv_bill_dpt_cd_ListPutter(Rcv_bill_dpt_cd, "bill_dpt_cd", "bill_dpt_nm");

		}
		return Rcv_bill_dpt_cd_p;
	}
	
	
	/** [Rcv_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Rcv_trd_cur_cd_p = null;

	/**
	 * [Rcv_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcv_trd_cur_cd_ListPutter() {
		if (Rcv_trd_cur_cd_p == null) {
			Rcv_trd_cur_cd_p = createRcv_trd_cur_cd_ListPutter(Rcv_trd_cur_cd, "trd_cur_cd", "trd_cur_nm","amt_dec_place","upri_dec_place");

		}
		return Rcv_trd_cur_cd_p;
	}
	
	
	/** [Rcv_ar_sttl_cd1_ListPutter]の定義 */
	private MCListPutter Rcv_ar_sttl_cd1_p = null;

	/**
	 * [Rcv_ar_sttl_cd1_ListPutter]の取得
	 */
	protected MCListPutter getRcv_ar_sttl_cd1_ListPutter() {
		if (Rcv_ar_sttl_cd1_p == null) {
			Rcv_ar_sttl_cd1_p = createRcv_ar_sttl_cd1_ListPutter(Rcv_ar_sttl_cd1, "ar_sttl_cd1", "ar_sttl_nm1","ar_sttl_typ1","xfr_psn","ar_sttl_cd2");

		}
		return Rcv_ar_sttl_cd1_p;
	}
	
	
	/** [Rcv_bank_ac_cd_ListPutter]の定義 */
	private MCListPutter Rcv_bank_ac_cd_p = null;

	/**
	 * [Rcv_bank_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcv_bank_ac_cd_ListPutter() {
		if (Rcv_bank_ac_cd_p == null) {
			Rcv_bank_ac_cd_p = createRcv_bank_ac_cd_ListPutter(Rcv_bank_ac_cd, "bank_ac_cd", "bank_ac_nm");

		}
		return Rcv_bank_ac_cd_p;
	}
	
	
	/** [Rcv_ar_sttl_cd2_ListPutter]の定義 */
	private MCListPutter Rcv_ar_sttl_cd2_p = null;

	/**
	 * [Rcv_ar_sttl_cd2_ListPutter]の取得
	 */
	protected MCListPutter getRcv_ar_sttl_cd2_ListPutter() {
		if (Rcv_ar_sttl_cd2_p == null) {
			Rcv_ar_sttl_cd2_p = createRcv_ar_sttl_cd2_ListPutter(Rcv_ar_sttl_cd2, "ar_sttl_cd2", "ar_sttl_nm2","sls_purc_typ2","debtor_id_typ","tax_cd_sub");

		}
		return Rcv_ar_sttl_cd2_p;
	}
	
	
	/** [Rcv_tax_cd_ListPutter]の定義 */
	private MCListPutter Rcv_tax_cd_p = null;

	/**
	 * [Rcv_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcv_tax_cd_ListPutter() {
		if (Rcv_tax_cd_p == null) {
			Rcv_tax_cd_p = createRcv_tax_cd_ListPutter(Rcv_tax_cd, "tax_cd", "tax_nm","tax_rate");

		}
		return Rcv_tax_cd_p;
	}
	
	
	/** [Rcv_debtor_id_typ_ListPutter]の定義 */
	private MCListPutter Rcv_debtor_id_typ_p = null;

	/**
	 * [Rcv_debtor_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getRcv_debtor_id_typ_ListPutter() {
		if (Rcv_debtor_id_typ_p == null) {
			Rcv_debtor_id_typ_p = createRcv_debtor_id_typ_ListPutter(Rcv_debtor_id_typ, "debtor_id_typ", "debtor_id_typ_nm");

		}
		return Rcv_debtor_id_typ_p;
	}
	
	
	/** [Rcv_debtor_id_cd_ListPutter]の定義 */
	private MCListPutter Rcv_debtor_id_cd_p = null;

	/**
	 * [Rcv_debtor_id_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcv_debtor_id_cd_ListPutter() {
		if (Rcv_debtor_id_cd_p == null) {
			Rcv_debtor_id_cd_p = createRcv_debtor_id_cd_ListPutter(Rcv_debtor_id_cd, "debtor_id_cd", "debtor_nm");

		}
		return Rcv_debtor_id_cd_p;
	}
	
	
	/** [Rcv_debt_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rcv_debt_bd_dpt_cd_p = null;

	/**
	 * [Rcv_debt_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcv_debt_bd_dpt_cd_ListPutter() {
		if (Rcv_debt_bd_dpt_cd_p == null) {
			Rcv_debt_bd_dpt_cd_p = createRcv_debt_bd_dpt_cd_ListPutter(Rcv_debt_bd_dpt_cd, "debt_bd_dpt_cd", "debt_bd_dpt_nm");

		}
		return Rcv_debt_bd_dpt_cd_p;
	}
	
	
	/** [Rcv_ar_sttl_cd3_ListPutter]の定義 */
	private MCListPutter Rcv_ar_sttl_cd3_p = null;

	/**
	 * [Rcv_ar_sttl_cd3_ListPutter]の取得
	 */
	protected MCListPutter getRcv_ar_sttl_cd3_ListPutter() {
		if (Rcv_ar_sttl_cd3_p == null) {
			Rcv_ar_sttl_cd3_p = createRcv_ar_sttl_cd3_ListPutter(Rcv_ar_sttl_cd3, "ar_sttl_cd3", "ar_sttl_nm3","creditor_id_typ");

		}
		return Rcv_ar_sttl_cd3_p;
	}
	
	
	/** [Rcv_creditor_id_typ_ListPutter]の定義 */
	private MCListPutter Rcv_creditor_id_typ_p = null;

	/**
	 * [Rcv_creditor_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getRcv_creditor_id_typ_ListPutter() {
		if (Rcv_creditor_id_typ_p == null) {
			Rcv_creditor_id_typ_p = createRcv_creditor_id_typ_ListPutter(Rcv_creditor_id_typ, "creditor_id_typ", "creditor_id_typ_nm");

		}
		return Rcv_creditor_id_typ_p;
	}
	
	
	/** [Rcv_creditor_id_cd_ListPutter]の定義 */
	private MCListPutter Rcv_creditor_id_cd_p = null;

	/**
	 * [Rcv_creditor_id_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcv_creditor_id_cd_ListPutter() {
		if (Rcv_creditor_id_cd_p == null) {
			Rcv_creditor_id_cd_p = createRcv_creditor_id_cd_ListPutter(Rcv_creditor_id_cd, "creditor_id_cd", "creditor_nm");

		}
		return Rcv_creditor_id_cd_p;
	}
	
	
	/** [Rcv_cred_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rcv_cred_bd_dpt_cd_p = null;

	/**
	 * [Rcv_cred_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcv_cred_bd_dpt_cd_ListPutter() {
		if (Rcv_cred_bd_dpt_cd_p == null) {
			Rcv_cred_bd_dpt_cd_p = createRcv_cred_bd_dpt_cd_ListPutter(Rcv_cred_bd_dpt_cd, "cred_bd_dpt_cd", "cred_bd_dpt_nm");

		}
		return Rcv_cred_bd_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_AdvRcvReg create(){
		MSBGP_AdvRcvReg p = new MSBGP_AdvRcvReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_AdvRcvReg create(String name){
		MSBGP_AdvRcvReg p = new MSBGP_AdvRcvReg(name);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * 画面部品初期設定
	 */
	protected void jbInit() {
		super.jbInit();
		MSBGP_AdvRcvReg_MC.jbfInitScreenOpe((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbfInitCnd((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbfInitHdrTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbfInitHdr((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbfInitSys((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbfInitRcvTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbfInitRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbfInitNote((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbfInitSetoff((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbfInitAdvRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbfInitBtn((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbfInitEastBtn((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbInitScreenOpe((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbInitCnd((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbInitHdrTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbInitHdr((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbInitSys((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbInitRcvTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbInitRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbInitNote((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbInitSetoff((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbInitAdvRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbInitBtn((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.jbInitEastBtn((MSBGP_AdvRcvReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_rcv_act_no_Label = p.beansFactory.createLabel("Cnd.rcv_act_no_Label");
		p.Cnd_rcv_act_no = p.beansFactory.createTextField("Cnd.rcv_act_no");
		p.Cnd_rcv_act_no.setLabel(p.Cnd_rcv_act_no_Label);
		p.Cnd_rcv_act_rev = p.beansFactory.createNumberField("Cnd.rcv_act_rev");
		p.Cnd_latest_flg = p.beansFactory.createCheckBox("Cnd.latest_flg");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_trd_cd_Label = p.beansFactory.createLabel("Hdr.trd_cd_Label");
		p.Hdr_trd_cd = p.beansFactory.createTextComboBox("Hdr.trd_cd");
		p.Hdr_trd_cd.setLabel(p.Hdr_trd_cd_Label);
		p.Hdr_trd_ptn_typ = p.beansFactory.createTextField("Hdr.trd_ptn_typ");
		p.Hdr_trd_nm = p.beansFactory.createTextField("Hdr.trd_nm");
		p.Hdr_ac_ym_Label = p.beansFactory.createLabel("Hdr.ac_ym_Label");
		p.Hdr_ac_ym = p.beansFactory.createDateField("Hdr.ac_ym");
		p.Hdr_ac_ym.setLabel(p.Hdr_ac_ym_Label);
		p.Hdr_rcv_act_no_Label = p.beansFactory.createLabel("Hdr.rcv_act_no_Label");
		p.Hdr_rcv_act_no = p.beansFactory.createTextField("Hdr.rcv_act_no");
		p.Hdr_rcv_act_no.setLabel(p.Hdr_rcv_act_no_Label);
		p.Hdr_rcv_act_rev = p.beansFactory.createNumberField("Hdr.rcv_act_rev");
		p.Hdr_slip_sts_typ = p.beansFactory.createTextField("Hdr.slip_sts_typ");
		p.Hdr_latest_flg = p.beansFactory.createCheckBox("Hdr.latest_flg");
		p.Hdr_def_bank_ac_cd = p.beansFactory.createTextField("Hdr.def_bank_ac_cd");
		p.Hdr_wg_cd_Label = p.beansFactory.createLabel("Hdr.wg_cd_Label");
		p.Hdr_wg_cd = p.beansFactory.createTextField("Hdr.wg_cd");
		p.Hdr_wg_cd.setLabel(p.Hdr_wg_cd_Label);
		p.Hdr_wg_nm = p.beansFactory.createTextField("Hdr.wg_nm");
		p.Hdr_ins_usr_id_Label = p.beansFactory.createLabel("Hdr.ins_usr_id_Label");
		p.Hdr_ins_usr_id = p.beansFactory.createTextField("Hdr.ins_usr_id");
		p.Hdr_ins_usr_id.setLabel(p.Hdr_ins_usr_id_Label);
		p.Hdr_ins_usr_nm = p.beansFactory.createTextField("Hdr.ins_usr_nm");
		p.Hdr_ins_func_id_Label = p.beansFactory.createLabel("Hdr.ins_func_id_Label");
		p.Hdr_ins_func_id = p.beansFactory.createTextField("Hdr.ins_func_id");
		p.Hdr_ins_func_id.setLabel(p.Hdr_ins_func_id_Label);
		p.Hdr_ins_func_nm = p.beansFactory.createTextField("Hdr.ins_func_nm");
		p.Hdr_upd_usr_id_Label = p.beansFactory.createLabel("Hdr.upd_usr_id_Label");
		p.Hdr_upd_usr_id = p.beansFactory.createTextField("Hdr.upd_usr_id");
		p.Hdr_upd_usr_id.setLabel(p.Hdr_upd_usr_id_Label);
		p.Hdr_upd_usr_nm = p.beansFactory.createTextField("Hdr.upd_usr_nm");
		p.Hdr_upd_func_id_Label = p.beansFactory.createLabel("Hdr.upd_func_id_Label");
		p.Hdr_upd_func_id = p.beansFactory.createTextField("Hdr.upd_func_id");
		p.Hdr_upd_func_id.setLabel(p.Hdr_upd_func_id_Label);
		p.Hdr_upd_func_nm = p.beansFactory.createTextField("Hdr.upd_func_nm");
		p.Hdr_ins_ts_Label = p.beansFactory.createLabel("Hdr.ins_ts_Label");
		p.Hdr_ins_ts = p.beansFactory.createTimestampField("Hdr.ins_ts");
		p.Hdr_ins_ts.setLabel(p.Hdr_ins_ts_Label);
		p.Hdr_upd_ts_Label = p.beansFactory.createLabel("Hdr.upd_ts_Label");
		p.Hdr_upd_ts = p.beansFactory.createTimestampField("Hdr.upd_ts");
		p.Hdr_upd_ts.setLabel(p.Hdr_upd_ts_Label);
		p.Hdr_upd_srv_req_no_Label = p.beansFactory.createLabel("Hdr.upd_srv_req_no_Label");
		p.Hdr_upd_srv_req_no = p.beansFactory.createTextField("Hdr.upd_srv_req_no");
		p.Hdr_upd_srv_req_no.setLabel(p.Hdr_upd_srv_req_no_Label);
	}

	/**
	 * [Sys]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSys(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.SysPanel = p.beansFactory.createPanel("Sys");
		// ブロックの項目の初期化
	}

	/**
	 * [RcvTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRcvTab(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.RcvTabPanel = p.beansFactory.createPanel("RcvTab");
		p.RcvTabTab = p.beansFactory.createTabbedPane("RcvTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Rcv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRcv(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.RcvPanel = p.beansFactory.createPanel("Rcv");
		// ブロックの項目の初期化
		p.Rcv_rcv_no_Label = p.beansFactory.createLabel("Rcv.rcv_no_Label");
		p.Rcv_rcv_no = p.beansFactory.createTextField("Rcv.rcv_no");
		p.Rcv_rcv_no.setLabel(p.Rcv_rcv_no_Label);
		p.Rcv_srch = p.beansFactory.createButton("Rcv.srch", "srch");
		p.Rcv_slo_no_Label = p.beansFactory.createLabel("Rcv.slo_no_Label");
		p.Rcv_slo_no = p.beansFactory.createTextField("Rcv.slo_no");
		p.Rcv_slo_no.setLabel(p.Rcv_slo_no_Label);
		p.Rcv_rcv_dt_Label = p.beansFactory.createLabel("Rcv.rcv_dt_Label");
		p.Rcv_rcv_dt = p.beansFactory.createDateField("Rcv.rcv_dt");
		p.Rcv_rcv_dt.setLabel(p.Rcv_rcv_dt_Label);
		p.Rcv_rcst_cd_Label = p.beansFactory.createLabel("Rcv.rcst_cd_Label");
		p.Rcv_rcst_cd = p.beansFactory.createTextField("Rcv.rcst_cd");
		p.Rcv_rcst_cd.setLabel(p.Rcv_rcst_cd_Label);
		p.Rcv_rcst_nm = p.beansFactory.createTextField("Rcv.rcst_nm");
		p.Rcv_bcst_cd_Label = p.beansFactory.createLabel("Rcv.bcst_cd_Label");
		p.Rcv_bcst_cd = p.beansFactory.createTextComboBox("Rcv.bcst_cd");
		p.Rcv_bcst_cd.setLabel(p.Rcv_bcst_cd_Label);
		p.Rcv_bcst_nm = p.beansFactory.createTextField("Rcv.bcst_nm");
		p.Rcv_bill_dpt_cd_Label = p.beansFactory.createLabel("Rcv.bill_dpt_cd_Label");
		p.Rcv_bill_dpt_cd = p.beansFactory.createTextComboBox("Rcv.bill_dpt_cd");
		p.Rcv_bill_dpt_cd.setLabel(p.Rcv_bill_dpt_cd_Label);
		p.Rcv_bill_dpt_nm = p.beansFactory.createTextField("Rcv.bill_dpt_nm");
		p.Rcv_trd_cur_cd_Label = p.beansFactory.createLabel("Rcv.trd_cur_cd_Label");
		p.Rcv_trd_cur_cd = p.beansFactory.createTextComboBox("Rcv.trd_cur_cd");
		p.Rcv_trd_cur_cd.setLabel(p.Rcv_trd_cur_cd_Label);
		p.Rcv_trd_cur_nm = p.beansFactory.createTextField("Rcv.trd_cur_nm");
		p.Rcv_amt_dec_place = p.beansFactory.createNumberField("Rcv.amt_dec_place");
		p.Rcv_upri_dec_place = p.beansFactory.createNumberField("Rcv.upri_dec_place");
		p.Rcv_base_cur_cd = p.beansFactory.createTextField("Rcv.base_cur_cd");
		p.Rcv_xrate_cd = p.beansFactory.createTextField("Rcv.xrate_cd");
		p.Rcv_ar_sttl_cd1_Label = p.beansFactory.createLabel("Rcv.ar_sttl_cd1_Label");
		p.Rcv_ar_sttl_cd1 = p.beansFactory.createTextComboBox("Rcv.ar_sttl_cd1");
		p.Rcv_ar_sttl_cd1.setLabel(p.Rcv_ar_sttl_cd1_Label);
		p.Rcv_ar_sttl_typ1 = p.beansFactory.createTextField("Rcv.ar_sttl_typ1");
		p.Rcv_ar_sttl_nm1 = p.beansFactory.createTextField("Rcv.ar_sttl_nm1");
		p.Rcv_bank_ac_cd_Label = p.beansFactory.createLabel("Rcv.bank_ac_cd_Label");
		p.Rcv_bank_ac_cd = p.beansFactory.createTextComboBox("Rcv.bank_ac_cd");
		p.Rcv_bank_ac_cd.setLabel(p.Rcv_bank_ac_cd_Label);
		p.Rcv_bank_ac_nm = p.beansFactory.createTextField("Rcv.bank_ac_nm");
		p.Rcv_xfr_psn_Label = p.beansFactory.createLabel("Rcv.xfr_psn_Label");
		p.Rcv_xfr_psn = p.beansFactory.createTextField("Rcv.xfr_psn");
		p.Rcv_xfr_psn.setLabel(p.Rcv_xfr_psn_Label);
		p.Rcv_ar_sttl_cd2_Label = p.beansFactory.createLabel("Rcv.ar_sttl_cd2_Label");
		p.Rcv_ar_sttl_cd2 = p.beansFactory.createTextComboBox("Rcv.ar_sttl_cd2");
		p.Rcv_ar_sttl_cd2.setLabel(p.Rcv_ar_sttl_cd2_Label);
		p.Rcv_ar_sttl_nm2 = p.beansFactory.createTextField("Rcv.ar_sttl_nm2");
		p.Rcv_sls_purc_typ2 = p.beansFactory.createTextField("Rcv.sls_purc_typ2");
		p.Rcv_purc_flg = p.beansFactory.createCheckBox("Rcv.purc_flg");
		p.Rcv_sls_flg = p.beansFactory.createCheckBox("Rcv.sls_flg");
		p.Rcv_tax_cd_sub = p.beansFactory.createTextField("Rcv.tax_cd_sub");
		p.Rcv_tax_cd_Label = p.beansFactory.createLabel("Rcv.tax_cd_Label");
		p.Rcv_tax_cd = p.beansFactory.createTextComboBox("Rcv.tax_cd");
		p.Rcv_tax_cd.setLabel(p.Rcv_tax_cd_Label);
		p.Rcv_tax_nm = p.beansFactory.createTextField("Rcv.tax_nm");
		p.Rcv_tax_rate_Label = p.beansFactory.createLabel("Rcv.tax_rate_Label");
		p.Rcv_tax_rate = p.beansFactory.createNumberField("Rcv.tax_rate");
		p.Rcv_tax_rate.setLabel(p.Rcv_tax_rate_Label);
		p.Rcv_debtor_id_typ_Label = p.beansFactory.createLabel("Rcv.debtor_id_typ_Label");
		p.Rcv_debtor_id_typ = p.beansFactory.createTextComboBox("Rcv.debtor_id_typ");
		p.Rcv_debtor_id_typ.setLabel(p.Rcv_debtor_id_typ_Label);
		p.Rcv_debtor_id_typ_nm = p.beansFactory.createTextField("Rcv.debtor_id_typ_nm");
		p.Rcv_debtor_id_cd = p.beansFactory.createTextField("Rcv.debtor_id_cd");
		p.Rcv_debtor_nm = p.beansFactory.createTextField("Rcv.debtor_nm");
		p.Rcv_debt_bd_dpt_cd_Label = p.beansFactory.createLabel("Rcv.debt_bd_dpt_cd_Label");
		p.Rcv_debt_bd_dpt_cd = p.beansFactory.createTextField("Rcv.debt_bd_dpt_cd");
		p.Rcv_debt_bd_dpt_cd.setLabel(p.Rcv_debt_bd_dpt_cd_Label);
		p.Rcv_debt_bd_dpt_nm = p.beansFactory.createTextField("Rcv.debt_bd_dpt_nm");
		p.Rcv_trd_rmrks_Label = p.beansFactory.createLabel("Rcv.trd_rmrks_Label");
		p.Rcv_trd_rmrks = p.beansFactory.createTextField("Rcv.trd_rmrks");
		p.Rcv_trd_rmrks.setLabel(p.Rcv_trd_rmrks_Label);
		p.Rcv_sub_char1_Label = p.beansFactory.createLabel("Rcv.sub_char1_Label");
		p.Rcv_sub_char1 = p.beansFactory.createTextField("Rcv.sub_char1");
		p.Rcv_sub_char1.setLabel(p.Rcv_sub_char1_Label);
		p.Rcv_sub_char2_Label = p.beansFactory.createLabel("Rcv.sub_char2_Label");
		p.Rcv_sub_char2 = p.beansFactory.createTextField("Rcv.sub_char2");
		p.Rcv_sub_char2.setLabel(p.Rcv_sub_char2_Label);
		p.Rcv_sub_char3_Label = p.beansFactory.createLabel("Rcv.sub_char3_Label");
		p.Rcv_sub_char3 = p.beansFactory.createTextField("Rcv.sub_char3");
		p.Rcv_sub_char3.setLabel(p.Rcv_sub_char3_Label);
		p.Rcv_rcv_upd_cntr = p.beansFactory.createNumberField("Rcv.rcv_upd_cntr");
		p.Rcv_note_no_Label = p.beansFactory.createLabel("Rcv.note_no_Label");
		p.Rcv_note_no = p.beansFactory.createTextField("Rcv.note_no");
		p.Rcv_note_no.setLabel(p.Rcv_note_no_Label);
		p.Rcv_note_typ_Label = p.beansFactory.createLabel("Rcv.note_typ_Label");
		p.Rcv_note_typ = p.beansFactory.createTextField("Rcv.note_typ");
		p.Rcv_note_typ.setLabel(p.Rcv_note_typ_Label);
		p.Rcv_note_typ_nm = p.beansFactory.createTextField("Rcv.note_typ_nm");
		p.Rcv_draw_dt_Label = p.beansFactory.createLabel("Rcv.draw_dt_Label");
		p.Rcv_draw_dt = p.beansFactory.createDateField("Rcv.draw_dt");
		p.Rcv_draw_dt.setLabel(p.Rcv_draw_dt_Label);
		p.Rcv_due_dt_Label = p.beansFactory.createLabel("Rcv.due_dt_Label");
		p.Rcv_due_dt = p.beansFactory.createDateField("Rcv.due_dt");
		p.Rcv_due_dt.setLabel(p.Rcv_due_dt_Label);
		p.Rcv_drawer_nm_Label = p.beansFactory.createLabel("Rcv.drawer_nm_Label");
		p.Rcv_drawer_nm = p.beansFactory.createTextField("Rcv.drawer_nm");
		p.Rcv_drawer_nm.setLabel(p.Rcv_drawer_nm_Label);
		p.Rcv_endrsr_Label = p.beansFactory.createLabel("Rcv.endrsr_Label");
		p.Rcv_endrsr = p.beansFactory.createTextField("Rcv.endrsr");
		p.Rcv_endrsr.setLabel(p.Rcv_endrsr_Label);
		p.Rcv_accptr_Label = p.beansFactory.createLabel("Rcv.accptr_Label");
		p.Rcv_accptr = p.beansFactory.createTextField("Rcv.accptr");
		p.Rcv_accptr.setLabel(p.Rcv_accptr_Label);
		p.Rcv_draw_bank_cd_Label = p.beansFactory.createLabel("Rcv.draw_bank_cd_Label");
		p.Rcv_draw_bank_cd = p.beansFactory.createTextField("Rcv.draw_bank_cd");
		p.Rcv_draw_bank_cd.setLabel(p.Rcv_draw_bank_cd_Label);
		p.Rcv_draw_bank_nm = p.beansFactory.createTextField("Rcv.draw_bank_nm");
		p.Rcv_draw_branch_cd_Label = p.beansFactory.createLabel("Rcv.draw_branch_cd_Label");
		p.Rcv_draw_branch_cd = p.beansFactory.createTextField("Rcv.draw_branch_cd");
		p.Rcv_draw_branch_cd.setLabel(p.Rcv_draw_branch_cd_Label);
		p.Rcv_draw_branch_nm = p.beansFactory.createTextField("Rcv.draw_branch_nm");
		p.Rcv_note_rsn_cd_Label = p.beansFactory.createLabel("Rcv.note_rsn_cd_Label");
		p.Rcv_note_rsn_cd = p.beansFactory.createTextField("Rcv.note_rsn_cd");
		p.Rcv_note_rsn_cd.setLabel(p.Rcv_note_rsn_cd_Label);
		p.Rcv_note_rsn_nm = p.beansFactory.createTextField("Rcv.note_rsn_nm");
		p.Rcv_note_sub_char1_Label = p.beansFactory.createLabel("Rcv.note_sub_char1_Label");
		p.Rcv_note_sub_char1 = p.beansFactory.createTextField("Rcv.note_sub_char1");
		p.Rcv_note_sub_char1.setLabel(p.Rcv_note_sub_char1_Label);
		p.Rcv_note_sub_char2_Label = p.beansFactory.createLabel("Rcv.note_sub_char2_Label");
		p.Rcv_note_sub_char2 = p.beansFactory.createTextField("Rcv.note_sub_char2");
		p.Rcv_note_sub_char2.setLabel(p.Rcv_note_sub_char2_Label);
		p.Rcv_note_sub_char3_Label = p.beansFactory.createLabel("Rcv.note_sub_char3_Label");
		p.Rcv_note_sub_char3 = p.beansFactory.createTextField("Rcv.note_sub_char3");
		p.Rcv_note_sub_char3.setLabel(p.Rcv_note_sub_char3_Label);
		p.Rcv_ar_sttl_cd3_Label = p.beansFactory.createLabel("Rcv.ar_sttl_cd3_Label");
		p.Rcv_ar_sttl_cd3 = p.beansFactory.createTextComboBox("Rcv.ar_sttl_cd3");
		p.Rcv_ar_sttl_cd3.setLabel(p.Rcv_ar_sttl_cd3_Label);
		p.Rcv_ar_sttl_nm3 = p.beansFactory.createTextField("Rcv.ar_sttl_nm3");
		p.Rcv_creditor_id_typ_Label = p.beansFactory.createLabel("Rcv.creditor_id_typ_Label");
		p.Rcv_creditor_id_typ = p.beansFactory.createTextComboBox("Rcv.creditor_id_typ");
		p.Rcv_creditor_id_typ.setLabel(p.Rcv_creditor_id_typ_Label);
		p.Rcv_creditor_id_typ_nm = p.beansFactory.createTextField("Rcv.creditor_id_typ_nm");
		p.Rcv_creditor_id_cd = p.beansFactory.createTextField("Rcv.creditor_id_cd");
		p.Rcv_creditor_nm = p.beansFactory.createTextField("Rcv.creditor_nm");
		p.Rcv_cred_bd_dpt_cd_Label = p.beansFactory.createLabel("Rcv.cred_bd_dpt_cd_Label");
		p.Rcv_cred_bd_dpt_cd = p.beansFactory.createTextField("Rcv.cred_bd_dpt_cd");
		p.Rcv_cred_bd_dpt_cd.setLabel(p.Rcv_cred_bd_dpt_cd_Label);
		p.Rcv_cred_bd_dpt_nm = p.beansFactory.createTextField("Rcv.cred_bd_dpt_nm");
		p.Rcv_bill_cl_typ = p.beansFactory.createTextField("Rcv.bill_cl_typ");
		p.Rcv_bill_dtl_adv_flg = p.beansFactory.createCheckBox("Rcv.bill_dtl_adv_flg");
	}

	/**
	 * [Note]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitNote(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.NotePanel = p.beansFactory.createPanel("Note");
		// ブロックの項目の初期化
	}

	/**
	 * [Setoff]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSetoff(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.SetoffPanel = p.beansFactory.createPanel("Setoff");
		// ブロックの項目の初期化
	}

	/**
	 * [AdvRcv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAdvRcv(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.AdvRcvPanel = p.beansFactory.createPanel("AdvRcv");
		p.AdvRcvTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.AdvRcv_rcv_no_Label = p.beansFactory.createLabel("AdvRcv.rcv_no_Label");
		p.AdvRcv_rcv_no = p.beansFactory.createTextField("AdvRcv.rcv_no");
		p.AdvRcv_rcv_no.setLabel(p.AdvRcv_rcv_no_Label);
		p.AdvRcv_div_flg = p.beansFactory.createCheckBox("AdvRcv.div_flg");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.CndPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrTabPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS);
		p.ScreenOpePanel.add(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setNextBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0200.CndR.ope_META);
		p.CndPanel.add(p.Cnd_rcv_act_no_Label);
		p.CndPanel.add(p.Cnd_rcv_act_no);
		p.CndPanel.setLastBeans(p.Cnd_rcv_act_no);
		p.Cnd_rcv_act_no.setNextBeans(p.Cnd_rcv_act_rev);
		p.Cnd_rcv_act_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0200.CndR.rcv_act_no_META);
		p.CndPanel.add(p.Cnd_rcv_act_rev);
		p.Cnd_rcv_act_rev.setNextBeans(p.Cnd_latest_flg);
		p.Cnd_rcv_act_rev.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0200.CndR.rcv_act_rev_META);
		p.CndPanel.add(p.Cnd_latest_flg);
		p.Cnd_latest_flg.setNextBeans(p.Cnd_srch);
		p.Cnd_latest_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0200.CndR.latest_flg_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.RcvTabPanel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.HdrPanel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.SysPanel);
		p.HdrTabTab.add(p.SysPanel, "HdrTab.tab2");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.SysPanel);
		// ブロックの項目の初期化
		p.Hdr_trd_cd.setListType(MCListType.STRICT);
		p.Hdr_trd_cd.setLinkBeans(p.Hdr_trd_ptn_typ,p.Hdr_trd_nm);
		p.HdrPanel.add(p.Hdr_trd_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cd);
		p.HdrPanel.setLastBeans(p.Hdr_trd_cd);
		p.Hdr_trd_cd.setNextBeans(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.trd_cd_META);
		p.HdrPanel.add(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_ptn_typ.setNextBeans(p.Hdr_trd_nm);
		p.Hdr_trd_ptn_typ.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.trd_ptn_typ_META);
		p.HdrPanel.add(p.Hdr_trd_nm);
		p.Hdr_trd_nm.setNextBeans(p.Hdr_ac_ym);
		p.Hdr_trd_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.trd_nm_META);
		p.HdrPanel.add(p.Hdr_ac_ym_Label);
		p.HdrPanel.add(p.Hdr_ac_ym);
		p.Hdr_ac_ym.setNextBeans(p.Hdr_rcv_act_no);
		p.Hdr_ac_ym.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.ac_ym_META);
		p.Hdr_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.HdrPanel.add(p.Hdr_rcv_act_no_Label);
		p.HdrPanel.add(p.Hdr_rcv_act_no);
		p.Hdr_rcv_act_no.setNextBeans(p.Hdr_rcv_act_rev);
		p.Hdr_rcv_act_no.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.rcv_act_no_META);
		p.HdrPanel.add(p.Hdr_rcv_act_rev);
		p.Hdr_rcv_act_rev.setNextBeans(p.Hdr_slip_sts_typ);
		p.Hdr_rcv_act_rev.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.rcv_act_rev_META);
		p.HdrPanel.add(p.Hdr_slip_sts_typ);
		p.Hdr_slip_sts_typ.setNextBeans(p.Hdr_latest_flg);
		p.Hdr_slip_sts_typ.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.slip_sts_typ_META);
		p.HdrPanel.add(p.Hdr_latest_flg);
		p.Hdr_latest_flg.setNextBeans(p.Hdr_ac_dt_p_PPanel);
		p.Hdr_latest_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.latest_flg_META);
		p.HdrPanel.add(p.Hdr_ac_dt_p_PPanel);
		p.Hdr_ac_dt_p_PPanel.setNextBeans(p.Hdr_can_ac_dt_p_PPanel);
		p.HdrPanel.add(p.Hdr_can_ac_dt_p_PPanel);
		p.Hdr_can_ac_dt_p_PPanel.setNextBeans(p.Hdr_usr_dpt_p_PPanel);
		p.HdrPanel.add(p.Hdr_usr_dpt_p_PPanel);
		p.Hdr_usr_dpt_p_PPanel.setNextBeans(p.Hdr_def_bank_ac_cd);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Hdr_dpt_nm,p.Hdr_wg_cd,p.Hdr_wg_nm,p.Hdr_def_bank_ac_cd);
		p.HdrPanel.add(p.Hdr_def_bank_ac_cd);
		p.Hdr_def_bank_ac_cd.setNextBeans(p.Hdr_wg_cd);
		p.Hdr_def_bank_ac_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.def_bank_ac_cd_META);
		p.HdrPanel.add(p.Hdr_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_wg_cd);
		p.Hdr_wg_cd.setNextBeans(p.Hdr_wg_nm);
		p.Hdr_wg_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.wg_cd_META);
		p.HdrPanel.add(p.Hdr_wg_nm);
		p.Hdr_wg_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.wg_nm_META);
		p.SysPanel.add(p.Hdr_ins_usr_id_Label);
		p.SysPanel.add(p.Hdr_ins_usr_id);
		p.SysPanel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.ins_usr_id_META);
		p.SysPanel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.ins_usr_nm_META);
		p.SysPanel.add(p.Hdr_ins_func_id_Label);
		p.SysPanel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.ins_func_id_META);
		p.SysPanel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.ins_func_nm_META);
		p.SysPanel.add(p.Hdr_upd_usr_id_Label);
		p.SysPanel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.upd_usr_id_META);
		p.SysPanel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.upd_usr_nm_META);
		p.SysPanel.add(p.Hdr_upd_func_id_Label);
		p.SysPanel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.upd_func_id_META);
		p.SysPanel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.upd_func_nm_META);
		p.SysPanel.add(p.Hdr_ins_ts_Label);
		p.SysPanel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.SysPanel.add(p.Hdr_upd_ts_Label);
		p.SysPanel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.SysPanel.add(p.Hdr_upd_srv_req_no_Label);
		p.SysPanel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0200.HdrR.upd_srv_req_no_META);
	}

	/**
	 * [Sys]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSys(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [RcvTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRcvTab(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.add(p.RcvTabPanel);
		p.RcvTabPanel.setNextBeans(p.AdvRcvPanel);
		p.RcvTabPanel.add(p.RcvTabTab);
		p.RcvTabPanel.setLastBeans(p.RcvTabTab);
		p.RcvTabPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.RcvTabTab.add(p.RcvPanel, "RcvTab.tab1");
		p.RcvTabTab.setLastBeans(p.RcvPanel);
		p.RcvPanel.setNextBeans(p.NotePanel);
		p.RcvTabTab.add(p.NotePanel, "RcvTab.tab2");
		p.NotePanel.setNextBeans(p.SetoffPanel);
		p.RcvTabTab.add(p.SetoffPanel, "RcvTab.tab3");
	}

	/**
	 * [Rcv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRcv(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.RcvPanel.setNextBeans(p.NotePanel);
		// ブロックの項目の初期化
		p.RcvPanel.add(p.Rcv_rcv_no_Label);
		p.RcvPanel.add(p.Rcv_rcv_no);
		p.RcvPanel.setLastBeans(p.Rcv_rcv_no);
		p.Rcv_rcv_no.setNextBeans(p.Rcv_srch);
		p.Rcv_rcv_no.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.rcv_no_META);
		p.Rcv_srch.setIcon("SEARCH");
		p.Rcv_srch.setFunctionKey(MCFunctionKey.F3);
		p.RcvPanel.add(p.Rcv_srch);
		p.Rcv_srch.setNextBeans(p.Rcv_slo_no);
		p.RcvPanel.add(p.Rcv_slo_no_Label);
		p.RcvPanel.add(p.Rcv_slo_no);
		p.Rcv_slo_no.setNextBeans(p.Rcv_rcv_dt);
		p.Rcv_slo_no.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.slo_no_META);
		p.Rcv_slo_no.setListType(MCListType.STRICT);
		p.RcvPanel.add(p.Rcv_rcv_dt_Label);
		p.RcvPanel.add(p.Rcv_rcv_dt);
		p.Rcv_rcv_dt.setNextBeans(p.Rcv_rcst_cd);
		p.Rcv_rcv_dt.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.rcv_dt_META);
		p.Rcv_rcv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RcvPanel.add(p.Rcv_rcst_cd_Label);
		p.RcvPanel.add(p.Rcv_rcst_cd);
		p.Rcv_rcst_cd.setNextBeans(p.Rcv_rcst_nm);
		p.Rcv_rcst_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.rcst_cd_META);
		p.Rcv_rcst_cd.addLinkBeans(p.Rcv_rcst_nm,p.Rcv_xfr_psn);
		p.Rcv_rcst_cd.setListType(MCListType.STRICT);
		p.RcvPanel.add(p.Rcv_rcst_nm);
		p.Rcv_rcst_nm.setNextBeans(p.Rcv_bcst_cd);
		p.Rcv_rcst_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.rcst_nm_META);
		p.Rcv_bcst_cd.setListType(MCListType.STRICT);
		p.Rcv_bcst_cd.setLinkBeans(p.Rcv_bcst_nm,p.Rcv_bill_cl_typ,p.Rcv_bill_dtl_adv_flg);
		p.RcvPanel.add(p.Rcv_bcst_cd_Label);
		p.RcvPanel.add(p.Rcv_bcst_cd);
		p.Rcv_bcst_cd.setNextBeans(p.Rcv_bcst_nm);
		p.Rcv_bcst_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.bcst_cd_META);
		p.RcvPanel.add(p.Rcv_bcst_nm);
		p.Rcv_bcst_nm.setNextBeans(p.Rcv_bill_dpt_cd);
		p.Rcv_bcst_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.bcst_nm_META);
		p.Rcv_bill_dpt_cd.setListType(MCListType.STRICT);
		p.Rcv_bill_dpt_cd.setLinkBeans(p.Rcv_bill_dpt_nm);
		p.RcvPanel.add(p.Rcv_bill_dpt_cd_Label);
		p.RcvPanel.add(p.Rcv_bill_dpt_cd);
		p.Rcv_bill_dpt_cd.setNextBeans(p.Rcv_bill_dpt_nm);
		p.Rcv_bill_dpt_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.bill_dpt_cd_META);
		p.RcvPanel.add(p.Rcv_bill_dpt_nm);
		p.Rcv_bill_dpt_nm.setNextBeans(p.Rcv_trd_cur_cd);
		p.Rcv_bill_dpt_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.bill_dpt_nm_META);
		p.Rcv_trd_cur_cd.setListType(MCListType.STRICT);
		p.Rcv_trd_cur_cd.setLinkBeans(p.Rcv_trd_cur_nm,p.Rcv_amt_dec_place,p.Rcv_upri_dec_place);
		p.RcvPanel.add(p.Rcv_trd_cur_cd_Label);
		p.RcvPanel.add(p.Rcv_trd_cur_cd);
		p.Rcv_trd_cur_cd.setNextBeans(p.Rcv_trd_cur_nm);
		p.Rcv_trd_cur_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.trd_cur_cd_META);
		p.RcvPanel.add(p.Rcv_trd_cur_nm);
		p.Rcv_trd_cur_nm.setNextBeans(p.Rcv_amt_dec_place);
		p.Rcv_trd_cur_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.trd_cur_nm_META);
		p.RcvPanel.add(p.Rcv_amt_dec_place);
		p.Rcv_amt_dec_place.setNextBeans(p.Rcv_upri_dec_place);
		p.Rcv_amt_dec_place.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.amt_dec_place_META);
		p.RcvPanel.add(p.Rcv_upri_dec_place);
		p.Rcv_upri_dec_place.setNextBeans(p.Rcv_xrate_p_PPanel);
		p.Rcv_upri_dec_place.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.upri_dec_place_META);
		p.RcvPanel.add(p.Rcv_xrate_p_PPanel);
		p.Rcv_xrate_p_PPanel.setNextBeans(p.Rcv_base_cur_cd);
		p.RcvPanel.add(p.Rcv_base_cur_cd);
		p.Rcv_base_cur_cd.setNextBeans(p.Rcv_xrate_cd);
		p.Rcv_base_cur_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.base_cur_cd_META);
		p.RcvPanel.add(p.Rcv_xrate_cd);
		p.Rcv_xrate_cd.setNextBeans(p.Rcv_rcv_amt_p_PPanel);
		p.Rcv_xrate_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.xrate_cd_META);
		p.RcvPanel.add(p.Rcv_rcv_amt_p_PPanel);
		p.Rcv_rcv_amt_p_PPanel.setNextBeans(p.Rcv_not_proc_bal_p_PPanel);
		p.RcvPanel.add(p.Rcv_not_proc_bal_p_PPanel);
		p.Rcv_not_proc_bal_p_PPanel.setNextBeans(p.Rcv_ar_sttl_cd1);
		p.Rcv_ar_sttl_cd1.setListType(MCListType.STRICT);
		p.Rcv_ar_sttl_cd1.setLinkBeans(p.Rcv_ar_sttl_nm1,p.Rcv_ar_sttl_typ1,p.Rcv_xfr_psn,p.Rcv_ar_sttl_cd2);
		p.RcvPanel.add(p.Rcv_ar_sttl_cd1_Label);
		p.RcvPanel.add(p.Rcv_ar_sttl_cd1);
		p.Rcv_ar_sttl_cd1.setNextBeans(p.Rcv_ar_sttl_typ1);
		p.Rcv_ar_sttl_cd1.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.ar_sttl_cd1_META);
		p.RcvPanel.add(p.Rcv_ar_sttl_typ1);
		p.Rcv_ar_sttl_typ1.setNextBeans(p.Rcv_ar_sttl_nm1);
		p.Rcv_ar_sttl_typ1.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.ar_sttl_typ1_META);
		p.RcvPanel.add(p.Rcv_ar_sttl_nm1);
		p.Rcv_ar_sttl_nm1.setNextBeans(p.Rcv_bank_ac_cd);
		p.Rcv_ar_sttl_nm1.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.ar_sttl_nm1_META);
		p.Rcv_bank_ac_cd.setListType(MCListType.STRICT);
		p.Rcv_bank_ac_cd.setLinkBeans(p.Rcv_bank_ac_nm);
		p.RcvPanel.add(p.Rcv_bank_ac_cd_Label);
		p.RcvPanel.add(p.Rcv_bank_ac_cd);
		p.Rcv_bank_ac_cd.setNextBeans(p.Rcv_bank_ac_nm);
		p.Rcv_bank_ac_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.bank_ac_cd_META);
		p.RcvPanel.add(p.Rcv_bank_ac_nm);
		p.Rcv_bank_ac_nm.setNextBeans(p.Rcv_xfr_psn);
		p.Rcv_bank_ac_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.bank_ac_nm_META);
		p.RcvPanel.add(p.Rcv_xfr_psn_Label);
		p.RcvPanel.add(p.Rcv_xfr_psn);
		p.Rcv_xfr_psn.setNextBeans(p.Rcv_ar_sttl_cd2);
		p.Rcv_xfr_psn.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.xfr_psn_META);
		p.Rcv_ar_sttl_cd2.setListType(MCListType.STRICT);
		p.Rcv_ar_sttl_cd2.setLinkBeans(p.Rcv_ar_sttl_nm2,p.Rcv_sls_purc_typ2,p.Rcv_debtor_id_typ,p.Rcv_tax_cd_sub);
		p.RcvPanel.add(p.Rcv_ar_sttl_cd2_Label);
		p.RcvPanel.add(p.Rcv_ar_sttl_cd2);
		p.Rcv_ar_sttl_cd2.setNextBeans(p.Rcv_ar_sttl_nm2);
		p.Rcv_ar_sttl_cd2.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.ar_sttl_cd2_META);
		p.RcvPanel.add(p.Rcv_ar_sttl_nm2);
		p.Rcv_ar_sttl_nm2.setNextBeans(p.Rcv_sls_purc_typ2);
		p.Rcv_ar_sttl_nm2.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.ar_sttl_nm2_META);
		p.RcvPanel.add(p.Rcv_sls_purc_typ2);
		p.Rcv_sls_purc_typ2.setNextBeans(p.Rcv_purc_flg);
		p.Rcv_sls_purc_typ2.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.sls_purc_typ2_META);
		p.RcvPanel.add(p.Rcv_purc_flg);
		p.Rcv_purc_flg.setNextBeans(p.Rcv_sls_flg);
		p.Rcv_purc_flg.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.purc_flg_META);
		p.RcvPanel.add(p.Rcv_sls_flg);
		p.Rcv_sls_flg.setNextBeans(p.Rcv_tax_cd_sub);
		p.Rcv_sls_flg.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.sls_flg_META);
		p.RcvPanel.add(p.Rcv_tax_cd_sub);
		p.Rcv_tax_cd_sub.setNextBeans(p.Rcv_tax_cd);
		p.Rcv_tax_cd_sub.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.tax_cd_sub_META);
		p.Rcv_tax_cd.setListType(MCListType.STRICT);
		p.Rcv_tax_cd.setLinkBeans(p.Rcv_tax_nm,p.Rcv_tax_rate);
		p.RcvPanel.add(p.Rcv_tax_cd_Label);
		p.RcvPanel.add(p.Rcv_tax_cd);
		p.Rcv_tax_cd.setNextBeans(p.Rcv_tax_nm);
		p.Rcv_tax_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.tax_cd_META);
		p.RcvPanel.add(p.Rcv_tax_nm);
		p.Rcv_tax_nm.setNextBeans(p.Rcv_tax_rate);
		p.Rcv_tax_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.tax_nm_META);
		p.RcvPanel.add(p.Rcv_tax_rate_Label);
		p.RcvPanel.add(p.Rcv_tax_rate);
		p.Rcv_tax_rate.setNextBeans(p.Rcv_debtor_id_typ);
		p.Rcv_tax_rate.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.tax_rate_META);
		p.Rcv_debtor_id_typ.setListType(MCListType.STRICT);
		p.Rcv_debtor_id_typ.setLinkBeans(p.Rcv_debtor_id_typ_nm);
		p.RcvPanel.add(p.Rcv_debtor_id_typ_Label);
		p.RcvPanel.add(p.Rcv_debtor_id_typ);
		p.Rcv_debtor_id_typ.setNextBeans(p.Rcv_debtor_id_typ_nm);
		p.Rcv_debtor_id_typ.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.debtor_id_typ_META);
		p.RcvPanel.add(p.Rcv_debtor_id_typ_nm);
		p.Rcv_debtor_id_typ_nm.setNextBeans(p.Rcv_debtor_id_cd);
		p.Rcv_debtor_id_typ_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.debtor_id_typ_nm_META);
		p.RcvPanel.add(p.Rcv_debtor_id_cd);
		p.Rcv_debtor_id_cd.setNextBeans(p.Rcv_debtor_nm);
		p.Rcv_debtor_id_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.debtor_id_cd_META);
		p.Rcv_debtor_id_cd.addLinkBeans(p.Rcv_debtor_nm);
		p.Rcv_debtor_id_cd.setListType(MCListType.STRICT);
		p.RcvPanel.add(p.Rcv_debtor_nm);
		p.Rcv_debtor_nm.setNextBeans(p.Rcv_debt_bd_dpt_cd);
		p.Rcv_debtor_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.debtor_nm_META);
		p.RcvPanel.add(p.Rcv_debt_bd_dpt_cd_Label);
		p.RcvPanel.add(p.Rcv_debt_bd_dpt_cd);
		p.Rcv_debt_bd_dpt_cd.setNextBeans(p.Rcv_debt_bd_dpt_nm);
		p.Rcv_debt_bd_dpt_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.debt_bd_dpt_cd_META);
		p.Rcv_debt_bd_dpt_cd.addLinkBeans(p.Rcv_debt_bd_dpt_nm);
		p.Rcv_debt_bd_dpt_cd.setListType(MCListType.STRICT);
		p.RcvPanel.add(p.Rcv_debt_bd_dpt_nm);
		p.Rcv_debt_bd_dpt_nm.setNextBeans(p.Rcv_trd_rmrks);
		p.Rcv_debt_bd_dpt_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.debt_bd_dpt_nm_META);
		p.RcvPanel.add(p.Rcv_trd_rmrks_Label);
		p.RcvPanel.add(p.Rcv_trd_rmrks);
		p.Rcv_trd_rmrks.setNextBeans(p.Rcv_sub_char1);
		p.Rcv_trd_rmrks.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.trd_rmrks_META);
		p.RcvPanel.add(p.Rcv_sub_char1_Label);
		p.RcvPanel.add(p.Rcv_sub_char1);
		p.Rcv_sub_char1.setNextBeans(p.Rcv_sub_char2);
		p.Rcv_sub_char1.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.sub_char1_META);
		p.RcvPanel.add(p.Rcv_sub_char2_Label);
		p.RcvPanel.add(p.Rcv_sub_char2);
		p.Rcv_sub_char2.setNextBeans(p.Rcv_sub_char3);
		p.Rcv_sub_char2.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.sub_char2_META);
		p.RcvPanel.add(p.Rcv_sub_char3_Label);
		p.RcvPanel.add(p.Rcv_sub_char3);
		p.Rcv_sub_char3.setNextBeans(p.Rcv_rcv_upd_cntr);
		p.Rcv_sub_char3.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.sub_char3_META);
		p.RcvPanel.add(p.Rcv_rcv_upd_cntr);
		p.Rcv_rcv_upd_cntr.setNextBeans(p.Rcv_bill_cl_typ);
		p.Rcv_rcv_upd_cntr.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.rcv_upd_cntr_META);
		p.NotePanel.add(p.Rcv_note_no_Label);
		p.NotePanel.add(p.Rcv_note_no);
		p.NotePanel.setLastBeans(p.Rcv_note_no);
		p.Rcv_note_no.setNextBeans(p.Rcv_note_typ);
		p.Rcv_note_no.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.note_no_META);
		p.NotePanel.add(p.Rcv_note_typ_Label);
		p.NotePanel.add(p.Rcv_note_typ);
		p.Rcv_note_typ.setNextBeans(p.Rcv_note_typ_nm);
		p.Rcv_note_typ.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.note_typ_META);
		p.NotePanel.add(p.Rcv_note_typ_nm);
		p.Rcv_note_typ_nm.setNextBeans(p.Rcv_draw_dt);
		p.Rcv_note_typ_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.note_typ_nm_META);
		p.NotePanel.add(p.Rcv_draw_dt_Label);
		p.NotePanel.add(p.Rcv_draw_dt);
		p.Rcv_draw_dt.setNextBeans(p.Rcv_due_dt);
		p.Rcv_draw_dt.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.draw_dt_META);
		p.Rcv_draw_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.NotePanel.add(p.Rcv_due_dt_Label);
		p.NotePanel.add(p.Rcv_due_dt);
		p.Rcv_due_dt.setNextBeans(p.Rcv_drawer_nm);
		p.Rcv_due_dt.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.due_dt_META);
		p.Rcv_due_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.NotePanel.add(p.Rcv_drawer_nm_Label);
		p.NotePanel.add(p.Rcv_drawer_nm);
		p.Rcv_drawer_nm.setNextBeans(p.Rcv_endrsr);
		p.Rcv_drawer_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.drawer_nm_META);
		p.NotePanel.add(p.Rcv_endrsr_Label);
		p.NotePanel.add(p.Rcv_endrsr);
		p.Rcv_endrsr.setNextBeans(p.Rcv_accptr);
		p.Rcv_endrsr.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.endrsr_META);
		p.NotePanel.add(p.Rcv_accptr_Label);
		p.NotePanel.add(p.Rcv_accptr);
		p.Rcv_accptr.setNextBeans(p.Rcv_draw_bank_cd);
		p.Rcv_accptr.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.accptr_META);
		p.NotePanel.add(p.Rcv_draw_bank_cd_Label);
		p.NotePanel.add(p.Rcv_draw_bank_cd);
		p.Rcv_draw_bank_cd.setNextBeans(p.Rcv_draw_bank_nm);
		p.Rcv_draw_bank_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.draw_bank_cd_META);
		p.NotePanel.add(p.Rcv_draw_bank_nm);
		p.Rcv_draw_bank_nm.setNextBeans(p.Rcv_draw_branch_cd);
		p.Rcv_draw_bank_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.draw_bank_nm_META);
		p.NotePanel.add(p.Rcv_draw_branch_cd_Label);
		p.NotePanel.add(p.Rcv_draw_branch_cd);
		p.Rcv_draw_branch_cd.setNextBeans(p.Rcv_draw_branch_nm);
		p.Rcv_draw_branch_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.draw_branch_cd_META);
		p.NotePanel.add(p.Rcv_draw_branch_nm);
		p.Rcv_draw_branch_nm.setNextBeans(p.Rcv_note_rsn_cd);
		p.Rcv_draw_branch_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.draw_branch_nm_META);
		p.NotePanel.add(p.Rcv_note_rsn_cd_Label);
		p.NotePanel.add(p.Rcv_note_rsn_cd);
		p.Rcv_note_rsn_cd.setNextBeans(p.Rcv_note_rsn_nm);
		p.Rcv_note_rsn_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.note_rsn_cd_META);
		p.NotePanel.add(p.Rcv_note_rsn_nm);
		p.Rcv_note_rsn_nm.setNextBeans(p.Rcv_note_sub_char1);
		p.Rcv_note_rsn_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.note_rsn_nm_META);
		p.NotePanel.add(p.Rcv_note_sub_char1_Label);
		p.NotePanel.add(p.Rcv_note_sub_char1);
		p.Rcv_note_sub_char1.setNextBeans(p.Rcv_note_sub_char2);
		p.Rcv_note_sub_char1.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.note_sub_char1_META);
		p.NotePanel.add(p.Rcv_note_sub_char2_Label);
		p.NotePanel.add(p.Rcv_note_sub_char2);
		p.Rcv_note_sub_char2.setNextBeans(p.Rcv_note_sub_char3);
		p.Rcv_note_sub_char2.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.note_sub_char2_META);
		p.NotePanel.add(p.Rcv_note_sub_char3_Label);
		p.NotePanel.add(p.Rcv_note_sub_char3);
		p.Rcv_note_sub_char3.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.note_sub_char3_META);
		p.Rcv_ar_sttl_cd3.setListType(MCListType.STRICT);
		p.Rcv_ar_sttl_cd3.setLinkBeans(p.Rcv_ar_sttl_nm3,p.Rcv_creditor_id_typ);
		p.SetoffPanel.add(p.Rcv_ar_sttl_cd3_Label);
		p.SetoffPanel.add(p.Rcv_ar_sttl_cd3);
		p.SetoffPanel.setLastBeans(p.Rcv_ar_sttl_cd3);
		p.Rcv_ar_sttl_cd3.setNextBeans(p.Rcv_ar_sttl_nm3);
		p.Rcv_ar_sttl_cd3.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.ar_sttl_cd3_META);
		p.SetoffPanel.add(p.Rcv_ar_sttl_nm3);
		p.Rcv_ar_sttl_nm3.setNextBeans(p.Rcv_creditor_id_typ);
		p.Rcv_ar_sttl_nm3.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.ar_sttl_nm3_META);
		p.Rcv_creditor_id_typ.setListType(MCListType.STRICT);
		p.Rcv_creditor_id_typ.setLinkBeans(p.Rcv_creditor_id_typ_nm);
		p.SetoffPanel.add(p.Rcv_creditor_id_typ_Label);
		p.SetoffPanel.add(p.Rcv_creditor_id_typ);
		p.Rcv_creditor_id_typ.setNextBeans(p.Rcv_creditor_id_typ_nm);
		p.Rcv_creditor_id_typ.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.creditor_id_typ_META);
		p.SetoffPanel.add(p.Rcv_creditor_id_typ_nm);
		p.Rcv_creditor_id_typ_nm.setNextBeans(p.Rcv_creditor_id_cd);
		p.Rcv_creditor_id_typ_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.creditor_id_typ_nm_META);
		p.SetoffPanel.add(p.Rcv_creditor_id_cd);
		p.Rcv_creditor_id_cd.setNextBeans(p.Rcv_creditor_nm);
		p.Rcv_creditor_id_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.creditor_id_cd_META);
		p.Rcv_creditor_id_cd.addLinkBeans(p.Rcv_creditor_nm);
		p.Rcv_creditor_id_cd.setListType(MCListType.STRICT);
		p.SetoffPanel.add(p.Rcv_creditor_nm);
		p.Rcv_creditor_nm.setNextBeans(p.Rcv_cred_bd_dpt_cd);
		p.Rcv_creditor_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.creditor_nm_META);
		p.SetoffPanel.add(p.Rcv_cred_bd_dpt_cd_Label);
		p.SetoffPanel.add(p.Rcv_cred_bd_dpt_cd);
		p.Rcv_cred_bd_dpt_cd.setNextBeans(p.Rcv_cred_bd_dpt_nm);
		p.Rcv_cred_bd_dpt_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.cred_bd_dpt_cd_META);
		p.Rcv_cred_bd_dpt_cd.addLinkBeans(p.Rcv_cred_bd_dpt_nm);
		p.Rcv_cred_bd_dpt_cd.setListType(MCListType.STRICT);
		p.SetoffPanel.add(p.Rcv_cred_bd_dpt_nm);
		p.Rcv_cred_bd_dpt_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.cred_bd_dpt_nm_META);
		p.RcvPanel.add(p.Rcv_bill_cl_typ);
		p.Rcv_bill_cl_typ.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.bill_cl_typ_META);
		p.AdvRcvPanel.add(p.Rcv_bill_dtl_adv_flg);
		p.Rcv_bill_dtl_adv_flg.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0200.RcvR.bill_dtl_adv_flg_META);
	}

	/**
	 * [Note]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitNote(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.NotePanel.setNextBeans(p.SetoffPanel);
		// ブロックの項目の初期化
	}

	/**
	 * [Setoff]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSetoff(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [AdvRcv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAdvRcv(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.AdvRcvPanel.setBorder(p.AdvRcvTitledBorder);
		p.add(p.AdvRcvPanel);
		p.AdvRcvPanel.setNextBeans(p.BtnPanel);
		p.AdvRcvPanel.setLayoutPosition("CS");
		// ブロックの項目の初期化
		p.AdvRcvPanel.add(p.AdvRcv_amt1_p_PPanel);
		p.AdvRcvPanel.setLastBeans(p.AdvRcv_amt1_p_PPanel);
		p.AdvRcv_amt1_p_PPanel.setNextBeans(p.AdvRcv_amt2_p_PPanel);
		p.AdvRcvPanel.add(p.AdvRcv_amt2_p_PPanel);
		p.AdvRcv_amt2_p_PPanel.setNextBeans(p.AdvRcv_rcv_no);
		p.AdvRcvPanel.add(p.AdvRcv_rcv_no_Label);
		p.AdvRcvPanel.add(p.AdvRcv_rcv_no);
		p.AdvRcv_rcv_no.setNextBeans(p.AdvRcv_appl_amt_p_PPanel);
		p.AdvRcv_rcv_no.setRow(p.getAdvRcvR(), mcframe.clientMSBG.MSBGP0200.AdvRcvR.rcv_no_META);
		p.AdvRcvPanel.add(p.AdvRcv_appl_amt_p_PPanel);
		p.AdvRcv_appl_amt_p_PPanel.setNextBeans(p.AdvRcv_div_flg);
		p.AdvRcvPanel.add(p.AdvRcv_div_flg);
		p.AdvRcv_div_flg.setNextBeans(p.Rcv_bill_dtl_adv_flg);
		p.AdvRcv_div_flg.setRow(p.getAdvRcvR(), mcframe.clientMSBG.MSBGP0200.AdvRcvR.div_flg_META);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
		p.BtnPanel.setLastBeans(p.Btn_ins);
		p.Btn_ins.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBGP_AdvRcvReg p) {
		// ブロック関連の初期化
		p.add(p.EastBtnPanel);
		p.EastBtnPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSBGP_AdvRcvReg_MC.mcInitScreenOpe((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.mcInitCnd((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.mcInitHdrTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.mcInitHdr((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.mcInitSys((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.mcInitRcvTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.mcInitRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.mcInitNote((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.mcInitSetoff((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.mcInitAdvRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.mcInitBtn((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.mcInitEastBtn((MSBGP_AdvRcvReg)this);

		// [INS]ステータスのモードの設定
		MSBGP_AdvRcvReg_MC.statusInitINS_ScreenOpe((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitINS_Cnd((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitINS_HdrTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitINS_Hdr((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitINS_Sys((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitINS_RcvTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitINS_Rcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitINS_Note((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitINS_Setoff((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitINS_AdvRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitINS_Btn((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitINS_EastBtn((MSBGP_AdvRcvReg)this);

		// [SRCH_NEW_RCV]ステータスのモードの設定
		MSBGP_AdvRcvReg_MC.statusInitSRCH__NEW__RCV_ScreenOpe((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__NEW__RCV_Cnd((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__NEW__RCV_HdrTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__NEW__RCV_Hdr((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__NEW__RCV_Sys((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__NEW__RCV_RcvTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__NEW__RCV_Rcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__NEW__RCV_Note((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__NEW__RCV_Setoff((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__NEW__RCV_AdvRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__NEW__RCV_Btn((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__NEW__RCV_EastBtn((MSBGP_AdvRcvReg)this);

		// [REF_NEW_RCV]ステータスのモードの設定
		MSBGP_AdvRcvReg_MC.statusInitREF__NEW__RCV_ScreenOpe((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__NEW__RCV_Cnd((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__NEW__RCV_HdrTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__NEW__RCV_Hdr((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__NEW__RCV_Sys((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__NEW__RCV_RcvTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__NEW__RCV_Rcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__NEW__RCV_Note((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__NEW__RCV_Setoff((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__NEW__RCV_AdvRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__NEW__RCV_Btn((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__NEW__RCV_EastBtn((MSBGP_AdvRcvReg)this);

		// [SRCH]ステータスのモードの設定
		MSBGP_AdvRcvReg_MC.statusInitSRCH_ScreenOpe((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH_Cnd((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH_HdrTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH_Hdr((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH_Sys((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH_RcvTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH_Rcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH_Note((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH_Setoff((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH_AdvRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH_Btn((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH_EastBtn((MSBGP_AdvRcvReg)this);

		// [UPD]ステータスのモードの設定
		MSBGP_AdvRcvReg_MC.statusInitUPD_ScreenOpe((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitUPD_Cnd((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitUPD_HdrTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitUPD_Hdr((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitUPD_Sys((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitUPD_RcvTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitUPD_Rcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitUPD_Note((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitUPD_Setoff((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitUPD_AdvRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitUPD_Btn((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitUPD_EastBtn((MSBGP_AdvRcvReg)this);

		// [SRCH_RCV]ステータスのモードの設定
		MSBGP_AdvRcvReg_MC.statusInitSRCH__RCV_ScreenOpe((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__RCV_Cnd((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__RCV_HdrTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__RCV_Hdr((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__RCV_Sys((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__RCV_RcvTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__RCV_Rcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__RCV_Note((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__RCV_Setoff((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__RCV_AdvRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__RCV_Btn((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitSRCH__RCV_EastBtn((MSBGP_AdvRcvReg)this);

		// [REF_RCV]ステータスのモードの設定
		MSBGP_AdvRcvReg_MC.statusInitREF__RCV_ScreenOpe((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__RCV_Cnd((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__RCV_HdrTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__RCV_Hdr((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__RCV_Sys((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__RCV_RcvTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__RCV_Rcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__RCV_Note((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__RCV_Setoff((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__RCV_AdvRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__RCV_Btn((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF__RCV_EastBtn((MSBGP_AdvRcvReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBGP_AdvRcvReg_MC.statusInitFIX__U_ScreenOpe((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__U_Cnd((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__U_HdrTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__U_Hdr((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__U_Sys((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__U_RcvTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__U_Rcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__U_Note((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__U_Setoff((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__U_AdvRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__U_Btn((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__U_EastBtn((MSBGP_AdvRcvReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBGP_AdvRcvReg_MC.statusInitFIX__I_ScreenOpe((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__I_Cnd((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__I_HdrTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__I_Hdr((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__I_Sys((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__I_RcvTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__I_Rcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__I_Note((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__I_Setoff((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__I_AdvRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__I_Btn((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__I_EastBtn((MSBGP_AdvRcvReg)this);

		// [REF]ステータスのモードの設定
		MSBGP_AdvRcvReg_MC.statusInitREF_ScreenOpe((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF_Cnd((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF_HdrTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF_Hdr((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF_Sys((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF_RcvTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF_Rcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF_Note((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF_Setoff((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF_AdvRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF_Btn((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitREF_EastBtn((MSBGP_AdvRcvReg)this);

		// [NO_SLIP_CD]ステータスのモードの設定
		MSBGP_AdvRcvReg_MC.statusInitNO__SLIP__CD_ScreenOpe((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitNO__SLIP__CD_Cnd((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitNO__SLIP__CD_HdrTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitNO__SLIP__CD_Hdr((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitNO__SLIP__CD_Sys((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitNO__SLIP__CD_RcvTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitNO__SLIP__CD_Rcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitNO__SLIP__CD_Note((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitNO__SLIP__CD_Setoff((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitNO__SLIP__CD_AdvRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitNO__SLIP__CD_Btn((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitNO__SLIP__CD_EastBtn((MSBGP_AdvRcvReg)this);

		// [DEL]ステータスのモードの設定
		MSBGP_AdvRcvReg_MC.statusInitDEL_ScreenOpe((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitDEL_Cnd((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitDEL_HdrTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitDEL_Hdr((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitDEL_Sys((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitDEL_RcvTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitDEL_Rcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitDEL_Note((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitDEL_Setoff((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitDEL_AdvRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitDEL_Btn((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitDEL_EastBtn((MSBGP_AdvRcvReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBGP_AdvRcvReg_MC.statusInitFIX__D_ScreenOpe((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__D_Cnd((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__D_HdrTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__D_Hdr((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__D_Sys((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__D_RcvTab((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__D_Rcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__D_Note((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__D_Setoff((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__D_AdvRcv((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__D_Btn((MSBGP_AdvRcvReg)this);
		MSBGP_AdvRcvReg_MC.statusInitFIX__D_EastBtn((MSBGP_AdvRcvReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBGP_AdvRcvReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBGP_AdvRcvReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_rcv_act_no.setListListener(p);
		p.Cnd_rcv_act_no.addAllListener(p);
		p.Cnd_rcv_act_rev.setListListener(p);
		p.Cnd_rcv_act_rev.addAllListener(p);
		p.Cnd_latest_flg.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBGP_AdvRcvReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBGP_AdvRcvReg p) {
		p.Hdr_trd_cd.setListListener(p);
		p.Hdr_trd_cd.addAllListener(p);
		p.Hdr_trd_ptn_typ.setListListener(p);
		p.Hdr_trd_ptn_typ.addAllListener(p);
		p.Hdr_trd_nm.setListListener(p);
		p.Hdr_trd_nm.addAllListener(p);
		p.Hdr_ac_ym.setListListener(p);
		p.Hdr_ac_ym.addAllListener(p);
		p.Hdr_rcv_act_no.setListListener(p);
		p.Hdr_rcv_act_no.addAllListener(p);
		p.Hdr_rcv_act_rev.setListListener(p);
		p.Hdr_rcv_act_rev.addAllListener(p);
		p.Hdr_slip_sts_typ.setListListener(p);
		p.Hdr_slip_sts_typ.addAllListener(p);
		p.Hdr_latest_flg.addAllListener(p);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_def_bank_ac_cd.setListListener(p);
		p.Hdr_def_bank_ac_cd.addAllListener(p);
		p.Hdr_wg_cd.setListListener(p);
		p.Hdr_wg_cd.addAllListener(p);
		p.Hdr_wg_nm.setListListener(p);
		p.Hdr_wg_nm.addAllListener(p);
		p.Hdr_ins_usr_id.setListListener(p);
		p.Hdr_ins_usr_id.addAllListener(p);
		p.Hdr_ins_usr_nm.setListListener(p);
		p.Hdr_ins_usr_nm.addAllListener(p);
		p.Hdr_ins_func_id.setListListener(p);
		p.Hdr_ins_func_id.addAllListener(p);
		p.Hdr_ins_func_nm.setListListener(p);
		p.Hdr_ins_func_nm.addAllListener(p);
		p.Hdr_upd_usr_id.setListListener(p);
		p.Hdr_upd_usr_id.addAllListener(p);
		p.Hdr_upd_usr_nm.setListListener(p);
		p.Hdr_upd_usr_nm.addAllListener(p);
		p.Hdr_upd_func_id.setListListener(p);
		p.Hdr_upd_func_id.addAllListener(p);
		p.Hdr_upd_func_nm.setListListener(p);
		p.Hdr_upd_func_nm.addAllListener(p);
		p.Hdr_ins_ts.setListListener(p);
		p.Hdr_ins_ts.addAllListener(p);
		p.Hdr_upd_ts.setListListener(p);
		p.Hdr_upd_ts.addAllListener(p);
		p.Hdr_upd_srv_req_no.setListListener(p);
		p.Hdr_upd_srv_req_no.addAllListener(p);
	}

	/**
	 *  [Sys]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSys(MSBGP_AdvRcvReg p) {
	}

	/**
	 *  [RcvTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRcvTab(MSBGP_AdvRcvReg p) {
		p.RcvTabTab.addAllListener(p);
	}

	/**
	 *  [Rcv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRcv(MSBGP_AdvRcvReg p) {
		p.Rcv_rcv_no.setListListener(p);
		p.Rcv_rcv_no.addAllListener(p);
		p.Rcv_srch.addAllListener(p);
		p.Rcv_srch.setAPMethodName("doRcv_srch");
		p.Rcv_slo_no.setListListener(p);
		p.Rcv_slo_no.addAllListener(p);
		p.Rcv_rcv_dt.setListListener(p);
		p.Rcv_rcv_dt.addAllListener(p);
		p.Rcv_rcst_cd.setListListener(p);
		p.Rcv_rcst_cd.addAllListener(p);
		p.Rcv_rcst_nm.setListListener(p);
		p.Rcv_rcst_nm.addAllListener(p);
		p.Rcv_bcst_cd.setListListener(p);
		p.Rcv_bcst_cd.addAllListener(p);
		p.Rcv_bcst_nm.setListListener(p);
		p.Rcv_bcst_nm.addAllListener(p);
		p.Rcv_bill_dpt_cd.setListListener(p);
		p.Rcv_bill_dpt_cd.addAllListener(p);
		p.Rcv_bill_dpt_nm.setListListener(p);
		p.Rcv_bill_dpt_nm.addAllListener(p);
		p.Rcv_trd_cur_cd.setListListener(p);
		p.Rcv_trd_cur_cd.addAllListener(p);
		p.Rcv_trd_cur_nm.setListListener(p);
		p.Rcv_trd_cur_nm.addAllListener(p);
		p.Rcv_amt_dec_place.setListListener(p);
		p.Rcv_amt_dec_place.addAllListener(p);
		p.Rcv_upri_dec_place.setListListener(p);
		p.Rcv_upri_dec_place.addAllListener(p);
		p.Rcv_base_cur_cd.setListListener(p);
		p.Rcv_base_cur_cd.addAllListener(p);
		p.Rcv_xrate_cd.setListListener(p);
		p.Rcv_xrate_cd.addAllListener(p);
		p.Rcv_ar_sttl_cd1.setListListener(p);
		p.Rcv_ar_sttl_cd1.addAllListener(p);
		p.Rcv_ar_sttl_typ1.setListListener(p);
		p.Rcv_ar_sttl_typ1.addAllListener(p);
		p.Rcv_ar_sttl_nm1.setListListener(p);
		p.Rcv_ar_sttl_nm1.addAllListener(p);
		p.Rcv_bank_ac_cd.setListListener(p);
		p.Rcv_bank_ac_cd.addAllListener(p);
		p.Rcv_bank_ac_nm.setListListener(p);
		p.Rcv_bank_ac_nm.addAllListener(p);
		p.Rcv_xfr_psn.setListListener(p);
		p.Rcv_xfr_psn.addAllListener(p);
		p.Rcv_ar_sttl_cd2.setListListener(p);
		p.Rcv_ar_sttl_cd2.addAllListener(p);
		p.Rcv_ar_sttl_nm2.setListListener(p);
		p.Rcv_ar_sttl_nm2.addAllListener(p);
		p.Rcv_sls_purc_typ2.setListListener(p);
		p.Rcv_sls_purc_typ2.addAllListener(p);
		p.Rcv_purc_flg.addAllListener(p);
		p.Rcv_sls_flg.addAllListener(p);
		p.Rcv_tax_cd_sub.setListListener(p);
		p.Rcv_tax_cd_sub.addAllListener(p);
		p.Rcv_tax_cd.setListListener(p);
		p.Rcv_tax_cd.addAllListener(p);
		p.Rcv_tax_nm.setListListener(p);
		p.Rcv_tax_nm.addAllListener(p);
		p.Rcv_tax_rate.setListListener(p);
		p.Rcv_tax_rate.addAllListener(p);
		p.Rcv_debtor_id_typ.setListListener(p);
		p.Rcv_debtor_id_typ.addAllListener(p);
		p.Rcv_debtor_id_typ_nm.setListListener(p);
		p.Rcv_debtor_id_typ_nm.addAllListener(p);
		p.Rcv_debtor_id_cd.setListListener(p);
		p.Rcv_debtor_id_cd.addAllListener(p);
		p.Rcv_debtor_nm.setListListener(p);
		p.Rcv_debtor_nm.addAllListener(p);
		p.Rcv_debt_bd_dpt_cd.setListListener(p);
		p.Rcv_debt_bd_dpt_cd.addAllListener(p);
		p.Rcv_debt_bd_dpt_nm.setListListener(p);
		p.Rcv_debt_bd_dpt_nm.addAllListener(p);
		p.Rcv_trd_rmrks.setListListener(p);
		p.Rcv_trd_rmrks.addAllListener(p);
		p.Rcv_sub_char1.setListListener(p);
		p.Rcv_sub_char1.addAllListener(p);
		p.Rcv_sub_char2.setListListener(p);
		p.Rcv_sub_char2.addAllListener(p);
		p.Rcv_sub_char3.setListListener(p);
		p.Rcv_sub_char3.addAllListener(p);
		p.Rcv_rcv_upd_cntr.setListListener(p);
		p.Rcv_rcv_upd_cntr.addAllListener(p);
		p.Rcv_note_no.setListListener(p);
		p.Rcv_note_no.addAllListener(p);
		p.Rcv_note_typ.setListListener(p);
		p.Rcv_note_typ.addAllListener(p);
		p.Rcv_note_typ_nm.setListListener(p);
		p.Rcv_note_typ_nm.addAllListener(p);
		p.Rcv_draw_dt.setListListener(p);
		p.Rcv_draw_dt.addAllListener(p);
		p.Rcv_due_dt.setListListener(p);
		p.Rcv_due_dt.addAllListener(p);
		p.Rcv_drawer_nm.setListListener(p);
		p.Rcv_drawer_nm.addAllListener(p);
		p.Rcv_endrsr.setListListener(p);
		p.Rcv_endrsr.addAllListener(p);
		p.Rcv_accptr.setListListener(p);
		p.Rcv_accptr.addAllListener(p);
		p.Rcv_draw_bank_cd.setListListener(p);
		p.Rcv_draw_bank_cd.addAllListener(p);
		p.Rcv_draw_bank_nm.setListListener(p);
		p.Rcv_draw_bank_nm.addAllListener(p);
		p.Rcv_draw_branch_cd.setListListener(p);
		p.Rcv_draw_branch_cd.addAllListener(p);
		p.Rcv_draw_branch_nm.setListListener(p);
		p.Rcv_draw_branch_nm.addAllListener(p);
		p.Rcv_note_rsn_cd.setListListener(p);
		p.Rcv_note_rsn_cd.addAllListener(p);
		p.Rcv_note_rsn_nm.setListListener(p);
		p.Rcv_note_rsn_nm.addAllListener(p);
		p.Rcv_note_sub_char1.setListListener(p);
		p.Rcv_note_sub_char1.addAllListener(p);
		p.Rcv_note_sub_char2.setListListener(p);
		p.Rcv_note_sub_char2.addAllListener(p);
		p.Rcv_note_sub_char3.setListListener(p);
		p.Rcv_note_sub_char3.addAllListener(p);
		p.Rcv_ar_sttl_cd3.setListListener(p);
		p.Rcv_ar_sttl_cd3.addAllListener(p);
		p.Rcv_ar_sttl_nm3.setListListener(p);
		p.Rcv_ar_sttl_nm3.addAllListener(p);
		p.Rcv_creditor_id_typ.setListListener(p);
		p.Rcv_creditor_id_typ.addAllListener(p);
		p.Rcv_creditor_id_typ_nm.setListListener(p);
		p.Rcv_creditor_id_typ_nm.addAllListener(p);
		p.Rcv_creditor_id_cd.setListListener(p);
		p.Rcv_creditor_id_cd.addAllListener(p);
		p.Rcv_creditor_nm.setListListener(p);
		p.Rcv_creditor_nm.addAllListener(p);
		p.Rcv_cred_bd_dpt_cd.setListListener(p);
		p.Rcv_cred_bd_dpt_cd.addAllListener(p);
		p.Rcv_cred_bd_dpt_nm.setListListener(p);
		p.Rcv_cred_bd_dpt_nm.addAllListener(p);
		p.Rcv_bill_cl_typ.setListListener(p);
		p.Rcv_bill_cl_typ.addAllListener(p);
		p.Rcv_bill_dtl_adv_flg.addAllListener(p);
	}

	/**
	 *  [Note]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitNote(MSBGP_AdvRcvReg p) {
	}

	/**
	 *  [Setoff]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSetoff(MSBGP_AdvRcvReg p) {
	}

	/**
	 *  [AdvRcv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAdvRcv(MSBGP_AdvRcvReg p) {
		p.AdvRcv_rcv_no.setListListener(p);
		p.AdvRcv_rcv_no.addAllListener(p);
		p.AdvRcv_div_flg.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBGP_AdvRcvReg p) {
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBGP_AdvRcvReg p) {
	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBGP_AdvRcvReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBGP_AdvRcvReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_rcv_act_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBGP_AdvRcvReg p){
		p.Hdr_trd_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_trd_ptn_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_slip_sts_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_def_bank_ac_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitINS_Sys(MSBGP_AdvRcvReg p){

	}

	/**
	 * [INS]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_RcvTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [INS]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rcv(MSBGP_AdvRcvReg p){
		p.Rcv_rcv_no.putMode(p, INS, MCMode.ENABLE);
		p.Rcv_srch.putMode(p, INS, MCMode.ENABLE);
		p.Rcv_slo_no.putMode(p, INS, MCMode.ENABLE);
		p.Rcv_rcv_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Rcv_rcst_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Rcv_rcst_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, INS, MCMode.ENABLE);
		p.Rcv_bcst_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, INS, MCMode.ENABLE);
		p.Rcv_bill_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Rcv_trd_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Rcv_base_cur_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.REQUIRED);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, INS, MCMode.REQUIRED);
		p.Rcv_ar_sttl_typ1.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Rcv_bank_ac_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, INS, MCMode.ENABLE);
		p.Rcv_ar_sttl_nm2.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, INS, MCMode.ENABLE);
		p.Rcv_tax_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ.putMode(p, INS, MCMode.REQUIRED);
		p.Rcv_debtor_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_debtor_id_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Rcv_debtor_nm.putMode(p, INS, MCMode.REQUIRED);
		p.Rcv_debt_bd_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Rcv_debt_bd_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Rcv_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Rcv_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Rcv_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Rcv_rcv_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_note_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd3.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm3.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_creditor_id_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_creditor_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_bill_cl_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_bill_dtl_adv_flg.putMode(p, INS, MCMode.REQUIRED);

	}

	/**
	 * [INS]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitINS_Note(MSBGP_AdvRcvReg p){

	}

	/**
	 * [INS]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitINS_Setoff(MSBGP_AdvRcvReg p){

	}

	/**
	 * [INS]ステータスの[AdvRcv]ブロックのモードの設定
	 */
	protected static void statusInitINS_AdvRcv(MSBGP_AdvRcvReg p){
		p.AdvRcv_amt1_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_amt2_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_rcv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.AdvRcv_appl_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_div_flg.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBGP_AdvRcvReg p){
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH_NEW_RCV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NEW__RCV_ScreenOpe(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH_NEW_RCV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NEW__RCV_Cnd(MSBGP_AdvRcvReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_NEW_RCV, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Cnd_rcv_act_rev.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, SRCH_NEW_RCV, MCMode.DISABLE);

	}

	/**
	 * [SRCH_NEW_RCV]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NEW__RCV_HdrTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH_NEW_RCV]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NEW__RCV_Hdr(MSBGP_AdvRcvReg p){
		p.Hdr_trd_cd.putMode(p, SRCH_NEW_RCV, MCMode.REQUIRED);
		p.Hdr_trd_ptn_typ.putMode(p, SRCH_NEW_RCV, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_slip_sts_typ.putMode(p, SRCH_NEW_RCV, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(SRCH_NEW_RCV, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(SRCH_NEW_RCV, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(SRCH_NEW_RCV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, SRCH_NEW_RCV, MCMode.ENABLE);
		p.Hdr_def_bank_ac_cd.putMode(p, SRCH_NEW_RCV, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_NEW_RCV]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NEW__RCV_Sys(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH_NEW_RCV]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NEW__RCV_RcvTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH_NEW_RCV]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NEW__RCV_Rcv(MSBGP_AdvRcvReg p){
		p.Rcv_rcv_no.putMode(p, SRCH_NEW_RCV, MCMode.ENABLE);
		p.Rcv_srch.putMode(p, SRCH_NEW_RCV, MCMode.ENABLE);
		p.Rcv_slo_no.putMode(p, SRCH_NEW_RCV, MCMode.ENABLE);
		p.Rcv_rcv_dt.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, SRCH_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, SRCH_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_xrate_p_PPanel.putStatus(SRCH_NEW_RCV, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, SRCH_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, SRCH_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(SRCH_NEW_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(SRCH_NEW_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, SRCH_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm2.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, SRCH_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, SRCH_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, SRCH_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, SRCH_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_debtor_id_cd.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_debtor_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_debt_bd_dpt_cd.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_debt_bd_dpt_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, SRCH_NEW_RCV, MCMode.ENABLE);
		p.Rcv_sub_char1.putMode(p, SRCH_NEW_RCV, MCMode.ENABLE);
		p.Rcv_sub_char2.putMode(p, SRCH_NEW_RCV, MCMode.ENABLE);
		p.Rcv_sub_char3.putMode(p, SRCH_NEW_RCV, MCMode.ENABLE);
		p.Rcv_rcv_upd_cntr.putMode(p, SRCH_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_note_no.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd3.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm3.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_creditor_id_cd.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_creditor_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_cd.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_nm.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_bill_cl_typ.putMode(p, SRCH_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_bill_dtl_adv_flg.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_NEW_RCV]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NEW__RCV_Note(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH_NEW_RCV]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NEW__RCV_Setoff(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH_NEW_RCV]ステータスの[AdvRcv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NEW__RCV_AdvRcv(MSBGP_AdvRcvReg p){
		p.AdvRcv_amt1_p_PPanel.putStatus(SRCH_NEW_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_amt2_p_PPanel.putStatus(SRCH_NEW_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_rcv_no.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);
		p.AdvRcv_appl_amt_p_PPanel.putStatus(SRCH_NEW_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_div_flg.putMode(p, SRCH_NEW_RCV, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_NEW_RCV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NEW__RCV_Btn(MSBGP_AdvRcvReg p){
		p.Btn_ins.putMode(p, SRCH_NEW_RCV, MCMode.ENABLE);
		p.Btn_upd.putMode(p, SRCH_NEW_RCV, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_NEW_RCV, MCMode.DISABLE);

	}

	/**
	 * [SRCH_NEW_RCV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NEW__RCV_EastBtn(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF_NEW_RCV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__NEW__RCV_ScreenOpe(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF_NEW_RCV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__NEW__RCV_Cnd(MSBGP_AdvRcvReg p){
		p.Cnd_ope_Group.putMode(p, REF_NEW_RCV, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Cnd_rcv_act_rev.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, REF_NEW_RCV, MCMode.DISABLE);

	}

	/**
	 * [REF_NEW_RCV]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF__NEW__RCV_HdrTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF_NEW_RCV]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF__NEW__RCV_Hdr(MSBGP_AdvRcvReg p){
		p.Hdr_trd_cd.putMode(p, REF_NEW_RCV, MCMode.REQUIRED);
		p.Hdr_trd_ptn_typ.putMode(p, REF_NEW_RCV, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_slip_sts_typ.putMode(p, REF_NEW_RCV, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(REF_NEW_RCV, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(REF_NEW_RCV, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(REF_NEW_RCV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, REF_NEW_RCV, MCMode.ENABLE);
		p.Hdr_def_bank_ac_cd.putMode(p, REF_NEW_RCV, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);

	}

	/**
	 * [REF_NEW_RCV]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitREF__NEW__RCV_Sys(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF_NEW_RCV]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitREF__NEW__RCV_RcvTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF_NEW_RCV]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitREF__NEW__RCV_Rcv(MSBGP_AdvRcvReg p){
		p.Rcv_rcv_no.putMode(p, REF_NEW_RCV, MCMode.ENABLE);
		p.Rcv_srch.putMode(p, REF_NEW_RCV, MCMode.ENABLE);
		p.Rcv_slo_no.putMode(p, REF_NEW_RCV, MCMode.ENABLE);
		p.Rcv_rcv_dt.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, REF_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, REF_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_xrate_p_PPanel.putStatus(REF_NEW_RCV, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, REF_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, REF_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(REF_NEW_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(REF_NEW_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, REF_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, REF_NEW_RCV, MCMode.ENABLE);
		p.Rcv_ar_sttl_nm2.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, REF_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, REF_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, REF_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, REF_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, REF_NEW_RCV, MCMode.ENABLE);
		p.Rcv_tax_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ.putMode(p, REF_NEW_RCV, MCMode.REQUIRED);
		p.Rcv_debtor_id_typ_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_debtor_id_cd.putMode(p, REF_NEW_RCV, MCMode.REQUIRED);
		p.Rcv_debtor_nm.putMode(p, REF_NEW_RCV, MCMode.REQUIRED);
		p.Rcv_debt_bd_dpt_cd.putMode(p, REF_NEW_RCV, MCMode.REQUIRED);
		p.Rcv_debt_bd_dpt_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, REF_NEW_RCV, MCMode.ENABLE);
		p.Rcv_sub_char1.putMode(p, REF_NEW_RCV, MCMode.ENABLE);
		p.Rcv_sub_char2.putMode(p, REF_NEW_RCV, MCMode.ENABLE);
		p.Rcv_sub_char3.putMode(p, REF_NEW_RCV, MCMode.ENABLE);
		p.Rcv_rcv_upd_cntr.putMode(p, REF_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_note_no.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd3.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm3.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_creditor_id_cd.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_creditor_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_cd.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_nm.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.Rcv_bill_cl_typ.putMode(p, REF_NEW_RCV, MCMode.INVISIBLE);
		p.Rcv_bill_dtl_adv_flg.putMode(p, REF_NEW_RCV, MCMode.REQUIRED);

	}

	/**
	 * [REF_NEW_RCV]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitREF__NEW__RCV_Note(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF_NEW_RCV]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitREF__NEW__RCV_Setoff(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF_NEW_RCV]ステータスの[AdvRcv]ブロックのモードの設定
	 */
	protected static void statusInitREF__NEW__RCV_AdvRcv(MSBGP_AdvRcvReg p){
		p.AdvRcv_amt1_p_PPanel.putStatus(REF_NEW_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.REQUIRED);
		p.AdvRcv_amt2_p_PPanel.putStatus(REF_NEW_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_rcv_no.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);
		p.AdvRcv_appl_amt_p_PPanel.putStatus(REF_NEW_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_div_flg.putMode(p, REF_NEW_RCV, MCMode.READ_ONLY);

	}

	/**
	 * [REF_NEW_RCV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__NEW__RCV_Btn(MSBGP_AdvRcvReg p){
		p.Btn_ins.putMode(p, REF_NEW_RCV, MCMode.ENABLE);
		p.Btn_upd.putMode(p, REF_NEW_RCV, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, REF_NEW_RCV, MCMode.DISABLE);

	}

	/**
	 * [REF_NEW_RCV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__NEW__RCV_EastBtn(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBGP_AdvRcvReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rcv_act_rev.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_latest_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBGP_AdvRcvReg p){
		p.Hdr_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_slip_sts_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_def_bank_ac_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Sys(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RcvTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rcv(MSBGP_AdvRcvReg p){
		p.Rcv_rcv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_srch.putMode(p, SRCH, MCMode.DISABLE);
		p.Rcv_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_rcv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_debtor_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_debtor_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_debt_bd_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_debt_bd_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_rcv_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_note_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_creditor_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_creditor_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_bill_cl_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_bill_dtl_adv_flg.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Note(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Setoff(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH]ステータスの[AdvRcv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_AdvRcv(MSBGP_AdvRcvReg p){
		p.AdvRcv_amt1_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_amt2_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_rcv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.AdvRcv_appl_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_div_flg.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBGP_AdvRcvReg p){
		p.Btn_ins.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBGP_AdvRcvReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBGP_AdvRcvReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBGP_AdvRcvReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_rcv_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBGP_AdvRcvReg p){
		p.Hdr_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_slip_sts_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_def_bank_ac_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Sys(MSBGP_AdvRcvReg p){

	}

	/**
	 * [UPD]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RcvTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [UPD]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rcv(MSBGP_AdvRcvReg p){
		p.Rcv_rcv_no.putMode(p, UPD, MCMode.ENABLE);
		p.Rcv_srch.putMode(p, UPD, MCMode.ENABLE);
		p.Rcv_slo_no.putMode(p, UPD, MCMode.ENABLE);
		p.Rcv_rcv_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Rcv_rcst_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rcv_rcst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Rcv_bcst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Rcv_bill_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rcv_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Rcv_base_cur_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.REQUIRED);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, UPD, MCMode.REQUIRED);
		p.Rcv_ar_sttl_typ1.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rcv_bank_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Rcv_ar_sttl_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Rcv_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Rcv_debtor_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_debtor_id_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rcv_debtor_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.Rcv_debt_bd_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rcv_debt_bd_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Rcv_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Rcv_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Rcv_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Rcv_rcv_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_note_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_creditor_id_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_creditor_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_bill_cl_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_bill_dtl_adv_flg.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Note(MSBGP_AdvRcvReg p){

	}

	/**
	 * [UPD]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Setoff(MSBGP_AdvRcvReg p){

	}

	/**
	 * [UPD]ステータスの[AdvRcv]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AdvRcv(MSBGP_AdvRcvReg p){
		p.AdvRcv_amt1_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.REQUIRED);
		p.AdvRcv_amt2_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_rcv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.AdvRcv_appl_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_div_flg.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBGP_AdvRcvReg p){
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH_RCV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RCV_ScreenOpe(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH_RCV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RCV_Cnd(MSBGP_AdvRcvReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_RCV, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, SRCH_RCV, MCMode.REQUIRED);
		p.Cnd_rcv_act_rev.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, SRCH_RCV, MCMode.ENABLE);

	}

	/**
	 * [SRCH_RCV]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RCV_HdrTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH_RCV]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RCV_Hdr(MSBGP_AdvRcvReg p){
		p.Hdr_trd_cd.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, SRCH_RCV, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_slip_sts_typ.putMode(p, SRCH_RCV, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(SRCH_RCV, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(SRCH_RCV, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.putStatus(SRCH_RCV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, SRCH_RCV, MCMode.ENABLE);
		p.Hdr_def_bank_ac_cd.putMode(p, SRCH_RCV, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, SRCH_RCV, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_RCV]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RCV_Sys(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH_RCV]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RCV_RcvTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH_RCV]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RCV_Rcv(MSBGP_AdvRcvReg p){
		p.Rcv_rcv_no.putMode(p, SRCH_RCV, MCMode.ENABLE);
		p.Rcv_srch.putMode(p, SRCH_RCV, MCMode.ENABLE);
		p.Rcv_slo_no.putMode(p, SRCH_RCV, MCMode.ENABLE);
		p.Rcv_rcv_dt.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_xrate_p_PPanel.putStatus(SRCH_RCV, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm2.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_debtor_id_cd.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_debtor_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_debt_bd_dpt_cd.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_debt_bd_dpt_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, SRCH_RCV, MCMode.ENABLE);
		p.Rcv_sub_char1.putMode(p, SRCH_RCV, MCMode.ENABLE);
		p.Rcv_sub_char2.putMode(p, SRCH_RCV, MCMode.ENABLE);
		p.Rcv_sub_char3.putMode(p, SRCH_RCV, MCMode.ENABLE);
		p.Rcv_rcv_upd_cntr.putMode(p, SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_note_no.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd3.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm3.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_creditor_id_cd.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_creditor_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_cd.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_nm.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bill_cl_typ.putMode(p, SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_bill_dtl_adv_flg.putMode(p, SRCH_RCV, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_RCV]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RCV_Note(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH_RCV]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RCV_Setoff(MSBGP_AdvRcvReg p){

	}

	/**
	 * [SRCH_RCV]ステータスの[AdvRcv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RCV_AdvRcv(MSBGP_AdvRcvReg p){
		p.AdvRcv_amt1_p_PPanel.putStatus(SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_amt2_p_PPanel.putStatus(SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_rcv_no.putMode(p, SRCH_RCV, MCMode.READ_ONLY);
		p.AdvRcv_appl_amt_p_PPanel.putStatus(SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_div_flg.putMode(p, SRCH_RCV, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_RCV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RCV_Btn(MSBGP_AdvRcvReg p){
		p.Btn_ins.putMode(p, SRCH_RCV, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SRCH_RCV, MCMode.ENABLE);
		p.Btn_del.putMode(p, SRCH_RCV, MCMode.DISABLE);

	}

	/**
	 * [SRCH_RCV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RCV_EastBtn(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF_RCV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__RCV_ScreenOpe(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF_RCV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__RCV_Cnd(MSBGP_AdvRcvReg p){
		p.Cnd_ope_Group.putMode(p, REF_RCV, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, REF_RCV, MCMode.REQUIRED);
		p.Cnd_rcv_act_rev.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, REF_RCV, MCMode.ENABLE);

	}

	/**
	 * [REF_RCV]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF__RCV_HdrTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF_RCV]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF__RCV_Hdr(MSBGP_AdvRcvReg p){
		p.Hdr_trd_cd.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, REF_RCV, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Hdr_slip_sts_typ.putMode(p, REF_RCV, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(REF_RCV, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(REF_RCV, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.putStatus(REF_RCV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, REF_RCV, MCMode.ENABLE);
		p.Hdr_def_bank_ac_cd.putMode(p, REF_RCV, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, REF_RCV, MCMode.READ_ONLY);

	}

	/**
	 * [REF_RCV]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitREF__RCV_Sys(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF_RCV]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitREF__RCV_RcvTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF_RCV]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitREF__RCV_Rcv(MSBGP_AdvRcvReg p){
		p.Rcv_rcv_no.putMode(p, REF_RCV, MCMode.ENABLE);
		p.Rcv_srch.putMode(p, REF_RCV, MCMode.ENABLE);
		p.Rcv_slo_no.putMode(p, REF_RCV, MCMode.ENABLE);
		p.Rcv_rcv_dt.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, REF_RCV, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, REF_RCV, MCMode.INVISIBLE);
		p.Rcv_xrate_p_PPanel.putStatus(REF_RCV, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, REF_RCV, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, REF_RCV, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, REF_RCV, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, REF_RCV, MCMode.ENABLE);
		p.Rcv_ar_sttl_nm2.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, REF_RCV, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, REF_RCV, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, REF_RCV, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, REF_RCV, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, REF_RCV, MCMode.ENABLE);
		p.Rcv_tax_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ.putMode(p, REF_RCV, MCMode.REQUIRED);
		p.Rcv_debtor_id_typ_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_debtor_id_cd.putMode(p, REF_RCV, MCMode.REQUIRED);
		p.Rcv_debtor_nm.putMode(p, REF_RCV, MCMode.REQUIRED);
		p.Rcv_debt_bd_dpt_cd.putMode(p, REF_RCV, MCMode.REQUIRED);
		p.Rcv_debt_bd_dpt_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, REF_RCV, MCMode.ENABLE);
		p.Rcv_sub_char1.putMode(p, REF_RCV, MCMode.ENABLE);
		p.Rcv_sub_char2.putMode(p, REF_RCV, MCMode.ENABLE);
		p.Rcv_sub_char3.putMode(p, REF_RCV, MCMode.ENABLE);
		p.Rcv_rcv_upd_cntr.putMode(p, REF_RCV, MCMode.INVISIBLE);
		p.Rcv_note_no.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd3.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm3.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_creditor_id_cd.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_creditor_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_cd.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_nm.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bill_cl_typ.putMode(p, REF_RCV, MCMode.INVISIBLE);
		p.Rcv_bill_dtl_adv_flg.putMode(p, REF_RCV, MCMode.REQUIRED);

	}

	/**
	 * [REF_RCV]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitREF__RCV_Note(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF_RCV]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitREF__RCV_Setoff(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF_RCV]ステータスの[AdvRcv]ブロックのモードの設定
	 */
	protected static void statusInitREF__RCV_AdvRcv(MSBGP_AdvRcvReg p){
		p.AdvRcv_amt1_p_PPanel.putStatus(REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.REQUIRED);
		p.AdvRcv_amt2_p_PPanel.putStatus(REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_rcv_no.putMode(p, REF_RCV, MCMode.READ_ONLY);
		p.AdvRcv_appl_amt_p_PPanel.putStatus(REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_div_flg.putMode(p, REF_RCV, MCMode.READ_ONLY);

	}

	/**
	 * [REF_RCV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__RCV_Btn(MSBGP_AdvRcvReg p){
		p.Btn_ins.putMode(p, REF_RCV, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, REF_RCV, MCMode.ENABLE);
		p.Btn_del.putMode(p, REF_RCV, MCMode.DISABLE);

	}

	/**
	 * [REF_RCV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__RCV_EastBtn(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBGP_AdvRcvReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_rcv_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBGP_AdvRcvReg p){
		p.Hdr_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_slip_sts_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_def_bank_ac_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Sys(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_U]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RcvTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_U]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rcv(MSBGP_AdvRcvReg p){
		p.Rcv_rcv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_srch.putMode(p, FIX_U, MCMode.DISABLE);
		p.Rcv_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_rcv_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_debtor_id_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_debtor_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_debt_bd_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_debt_bd_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_rcv_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_note_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_creditor_id_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_creditor_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_bill_cl_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_bill_dtl_adv_flg.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Note(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_U]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Setoff(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_U]ステータスの[AdvRcv]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_AdvRcv(MSBGP_AdvRcvReg p){
		p.AdvRcv_amt1_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_amt2_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_rcv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.AdvRcv_appl_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_div_flg.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBGP_AdvRcvReg p){
		p.Btn_ins.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBGP_AdvRcvReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_rcv_act_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_I, MCMode.ENABLE);

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBGP_AdvRcvReg p){
		p.Hdr_trd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_slip_sts_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_def_bank_ac_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Sys(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_I]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_RcvTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_I]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Rcv(MSBGP_AdvRcvReg p){
		p.Rcv_rcv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_srch.putMode(p, FIX_I, MCMode.DISABLE);
		p.Rcv_slo_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_rcv_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_debtor_id_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_debtor_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_debt_bd_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_debt_bd_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_rcv_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_note_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_creditor_id_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_creditor_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_bill_cl_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_bill_dtl_adv_flg.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Note(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_I]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Setoff(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_I]ステータスの[AdvRcv]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_AdvRcv(MSBGP_AdvRcvReg p){
		p.AdvRcv_amt1_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_amt2_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_rcv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.AdvRcv_appl_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_div_flg.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBGP_AdvRcvReg p){
		p.Btn_ins.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBGP_AdvRcvReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rcv_act_rev.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_latest_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBGP_AdvRcvReg p){
		p.Hdr_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_slip_sts_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_def_bank_ac_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitREF_Sys(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_RcvTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rcv(MSBGP_AdvRcvReg p){
		p.Rcv_rcv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_srch.putMode(p, REF, MCMode.DISABLE);
		p.Rcv_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_rcv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_debtor_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_debtor_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_debt_bd_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_debt_bd_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_rcv_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_note_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_creditor_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_creditor_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_bill_cl_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_bill_dtl_adv_flg.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitREF_Note(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitREF_Setoff(MSBGP_AdvRcvReg p){

	}

	/**
	 * [REF]ステータスの[AdvRcv]ブロックのモードの設定
	 */
	protected static void statusInitREF_AdvRcv(MSBGP_AdvRcvReg p){
		p.AdvRcv_amt1_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_amt2_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_rcv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.AdvRcv_appl_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_div_flg.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBGP_AdvRcvReg p){
		p.Btn_ins.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBGP_AdvRcvReg p){

	}

	/**
	 * [NO_SLIP_CD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_ScreenOpe(MSBGP_AdvRcvReg p){

	}

	/**
	 * [NO_SLIP_CD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_Cnd(MSBGP_AdvRcvReg p){
		p.Cnd_ope_Group.putMode(p, NO_SLIP_CD, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Cnd_rcv_act_rev.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, NO_SLIP_CD, MCMode.DISABLE);

	}

	/**
	 * [NO_SLIP_CD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_HdrTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [NO_SLIP_CD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_Hdr(MSBGP_AdvRcvReg p){
		p.Hdr_trd_cd.putMode(p, NO_SLIP_CD, MCMode.REQUIRED);
		p.Hdr_trd_ptn_typ.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_slip_sts_typ.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_def_bank_ac_cd.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);

	}

	/**
	 * [NO_SLIP_CD]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_Sys(MSBGP_AdvRcvReg p){

	}

	/**
	 * [NO_SLIP_CD]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_RcvTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [NO_SLIP_CD]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_Rcv(MSBGP_AdvRcvReg p){
		p.Rcv_rcv_no.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_srch.putMode(p, NO_SLIP_CD, MCMode.DISABLE);
		p.Rcv_slo_no.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_rcv_dt.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_xrate_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm2.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_debtor_id_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_debtor_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_debt_bd_dpt_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_debt_bd_dpt_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_rcv_upd_cntr.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_note_no.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd3.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm3.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_creditor_id_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_creditor_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_bill_cl_typ.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_bill_dtl_adv_flg.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);

	}

	/**
	 * [NO_SLIP_CD]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_Note(MSBGP_AdvRcvReg p){

	}

	/**
	 * [NO_SLIP_CD]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_Setoff(MSBGP_AdvRcvReg p){

	}

	/**
	 * [NO_SLIP_CD]ステータスの[AdvRcv]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_AdvRcv(MSBGP_AdvRcvReg p){
		p.AdvRcv_amt1_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_amt2_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_rcv_no.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.AdvRcv_appl_amt_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_div_flg.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);

	}

	/**
	 * [NO_SLIP_CD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_Btn(MSBGP_AdvRcvReg p){
		p.Btn_ins.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, NO_SLIP_CD, MCMode.DISABLE);
		p.Btn_del.putMode(p, NO_SLIP_CD, MCMode.DISABLE);

	}

	/**
	 * [NO_SLIP_CD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_EastBtn(MSBGP_AdvRcvReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBGP_AdvRcvReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBGP_AdvRcvReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_rcv_act_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBGP_AdvRcvReg p){
		p.Hdr_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_slip_sts_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_def_bank_ac_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Sys(MSBGP_AdvRcvReg p){

	}

	/**
	 * [DEL]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RcvTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [DEL]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rcv(MSBGP_AdvRcvReg p){
		p.Rcv_rcv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_srch.putMode(p, DEL, MCMode.DISABLE);
		p.Rcv_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_rcv_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_debtor_id_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_debtor_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_debt_bd_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_debt_bd_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_rcv_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_note_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_creditor_id_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_creditor_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_bill_cl_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_bill_dtl_adv_flg.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Note(MSBGP_AdvRcvReg p){

	}

	/**
	 * [DEL]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Setoff(MSBGP_AdvRcvReg p){

	}

	/**
	 * [DEL]ステータスの[AdvRcv]ブロックのモードの設定
	 */
	protected static void statusInitDEL_AdvRcv(MSBGP_AdvRcvReg p){
		p.AdvRcv_amt1_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_amt2_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_rcv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.AdvRcv_appl_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_div_flg.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBGP_AdvRcvReg p){
		p.Btn_ins.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBGP_AdvRcvReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_rcv_act_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBGP_AdvRcvReg p){
		p.Hdr_trd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_slip_sts_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_def_bank_ac_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Sys(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_D]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_RcvTab(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_D]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Rcv(MSBGP_AdvRcvReg p){
		p.Rcv_rcv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_srch.putMode(p, FIX_D, MCMode.DISABLE);
		p.Rcv_slo_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_rcv_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_debtor_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_debtor_id_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_debtor_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_debt_bd_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_debt_bd_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_rcv_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_note_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_nm3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_creditor_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_creditor_id_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_creditor_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_cred_bd_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_bill_cl_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_bill_dtl_adv_flg.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Note(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_D]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Setoff(MSBGP_AdvRcvReg p){

	}

	/**
	 * [FIX_D]ステータスの[AdvRcv]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_AdvRcv(MSBGP_AdvRcvReg p){
		p.AdvRcv_amt1_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_amt2_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_rcv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.AdvRcv_appl_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.AdvRcv_div_flg.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBGP_AdvRcvReg p){
		p.Btn_ins.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBGP_AdvRcvReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return INS;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Hdr_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_trd_cd.getListConfig().setPutter(getHdr_trd_cd_ListPutter());
		Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		Rcv_slo_no.getListConfig().setPutter(getRcv_slo_no_ListPutter());
		Rcv_rcst_cd.getListConfig().setPutter(getRcv_rcst_cd_ListPutter());
		Rcv_bcst_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rcv_bcst_cd.getListConfig().setPutter(getRcv_bcst_cd_ListPutter());
		Rcv_bill_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rcv_bill_dpt_cd.getListConfig().setPutter(getRcv_bill_dpt_cd_ListPutter());
		Rcv_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rcv_trd_cur_cd.getListConfig().setPutter(getRcv_trd_cur_cd_ListPutter());
		Rcv_ar_sttl_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rcv_ar_sttl_cd1.getListConfig().setPutter(getRcv_ar_sttl_cd1_ListPutter());
		Rcv_bank_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rcv_bank_ac_cd.getListConfig().setPutter(getRcv_bank_ac_cd_ListPutter());
		Rcv_ar_sttl_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rcv_ar_sttl_cd2.getListConfig().setPutter(getRcv_ar_sttl_cd2_ListPutter());
		Rcv_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rcv_tax_cd.getListConfig().setPutter(getRcv_tax_cd_ListPutter());
		Rcv_debtor_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rcv_debtor_id_typ.getListConfig().setPutter(getRcv_debtor_id_typ_ListPutter());
		Rcv_debtor_id_cd.getListConfig().setPutter(getRcv_debtor_id_cd_ListPutter());
		Rcv_debt_bd_dpt_cd.getListConfig().setPutter(getRcv_debt_bd_dpt_cd_ListPutter());
		Rcv_ar_sttl_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rcv_ar_sttl_cd3.getListConfig().setPutter(getRcv_ar_sttl_cd3_ListPutter());
		Rcv_creditor_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rcv_creditor_id_typ.getListConfig().setPutter(getRcv_creditor_id_typ_ListPutter());
		Rcv_creditor_id_cd.getListConfig().setPutter(getRcv_creditor_id_cd_ListPutter());
		Rcv_cred_bd_dpt_cd.getListConfig().setPutter(getRcv_cred_bd_dpt_cd_ListPutter());
	}

	/**
	 * この画面を[INS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSStatus() {
		status = INS;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_NEW_RCV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_NEW_RCVStatus() {
		status = SRCH_NEW_RCV;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_NEW_RCV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_NEW_RCVStatus() {
		status = REF_NEW_RCV;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCHStatus() {
		status = SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPDStatus() {
		status = UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_RCV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_RCVStatus() {
		status = SRCH_RCV;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_RCV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_RCVStatus() {
		status = REF_RCV;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_U]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_UStatus() {
		status = FIX_U;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_I]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_IStatus() {
		status = FIX_I;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
		setAllStatus(status);
	}

	/**
	 * この画面を[NO_SLIP_CD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setNO_SLIP_CDStatus() {
		status = NO_SLIP_CD;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_D]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_DStatus() {
		status = FIX_D;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (INS.equals(status)) {
			setINSStatus();
		}
		else if (SRCH_NEW_RCV.equals(status)) {
			setSRCH_NEW_RCVStatus();
		}
		else if (REF_NEW_RCV.equals(status)) {
			setREF_NEW_RCVStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (SRCH_RCV.equals(status)) {
			setSRCH_RCVStatus();
		}
		else if (REF_RCV.equals(status)) {
			setREF_RCVStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (NO_SLIP_CD.equals(status)) {
			setNO_SLIP_CDStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
		}
	}

	/**
	 * [Hdr_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trd");
		return lp;
	}
	 
	/**
	 * [Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Rcv_slo_no_ListPutter]の作成
	 */
	protected MCListPutter createRcv_slo_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.SloNo");
		return lp;
	}
	 
	/**
	 * [Rcv_rcst_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcv_rcst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Rcv_bcst_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcv_bcst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Rcv_bill_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcv_bill_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Rcv_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcv_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Rcv_ar_sttl_cd1_ListPutter]の作成
	 */
	protected MCListPutter createRcv_ar_sttl_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0080.SttlRcv");
		return lp;
	}
	 
	/**
	 * [Rcv_bank_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcv_bank_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IntBankAc");
		return lp;
	}
	 
	/**
	 * [Rcv_ar_sttl_cd2_ListPutter]の作成
	 */
	protected MCListPutter createRcv_ar_sttl_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Sttl");
		return lp;
	}
	 
	/**
	 * [Rcv_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcv_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tax");
		return lp;
	}
	 
	/**
	 * [Rcv_debtor_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createRcv_debtor_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DebtCredIdTyp");
		return lp;
	}
	 
	/**
	 * [Rcv_debtor_id_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcv_debtor_id_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Rcv_debt_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcv_debt_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Rcv_ar_sttl_cd3_ListPutter]の作成
	 */
	protected MCListPutter createRcv_ar_sttl_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Sttl");
		return lp;
	}
	 
	/**
	 * [Rcv_creditor_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createRcv_creditor_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DebtCredIdTyp");
		return lp;
	}
	 
	/**
	 * [Rcv_creditor_id_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcv_creditor_id_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Rcv_cred_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcv_cred_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Hdr_trd_cd) return getHdr_trd_cd(row, info);
		if(combo == Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == Rcv_slo_no) return getRcv_slo_no(row, info);
		if(combo == Rcv_rcst_cd) return getRcv_rcst_cd(row, info);
		if(combo == Rcv_bcst_cd) return getRcv_bcst_cd(row, info);
		if(combo == Rcv_bill_dpt_cd) return getRcv_bill_dpt_cd(row, info);
		if(combo == Rcv_trd_cur_cd) return getRcv_trd_cur_cd(row, info);
		if(combo == Rcv_ar_sttl_cd1) return getRcv_ar_sttl_cd1(row, info);
		if(combo == Rcv_bank_ac_cd) return getRcv_bank_ac_cd(row, info);
		if(combo == Rcv_ar_sttl_cd2) return getRcv_ar_sttl_cd2(row, info);
		if(combo == Rcv_tax_cd) return getRcv_tax_cd(row, info);
		if(combo == Rcv_debtor_id_typ) return getRcv_debtor_id_typ(row, info);
		if(combo == Rcv_debtor_id_cd) return getRcv_debtor_id_cd(row, info);
		if(combo == Rcv_debt_bd_dpt_cd) return getRcv_debt_bd_dpt_cd(row, info);
		if(combo == Rcv_ar_sttl_cd3) return getRcv_ar_sttl_cd3(row, info);
		if(combo == Rcv_creditor_id_typ) return getRcv_creditor_id_typ(row, info);
		if(combo == Rcv_creditor_id_cd) return getRcv_creditor_id_cd(row, info);
		if(combo == Rcv_cred_bd_dpt_cd) return getRcv_cred_bd_dpt_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch) doCnd_srch(info);
		else if (ap == Rcv_srch) doRcv_srch(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Rcv]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRcv_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

	/**
	 * ValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param vc イベント対象のGUI部品
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (!super.doVCEvent(vc, info)) {
			return false;
		}
		if (vc == HdrTabTab) return doHdrTab_VC(info);
		if (vc == RcvTabTab) return doRcvTab_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_rcv_act_no) return doCnd_rcv_act_no_VC(info);
		if (vc == Cnd_rcv_act_rev) return doCnd_rcv_act_rev_VC(info);
		if (vc == Cnd_latest_flg) return doCnd_latest_flg_VC(info);
		if (vc == Hdr_trd_cd) return doHdr_trd_cd_VC(info);
		if (vc == Hdr_trd_ptn_typ) return doHdr_trd_ptn_typ_VC(info);
		if (vc == Hdr_trd_nm) return doHdr_trd_nm_VC(info);
		if (vc == Hdr_ac_ym) return doHdr_ac_ym_VC(info);
		if (vc == Hdr_rcv_act_no) return doHdr_rcv_act_no_VC(info);
		if (vc == Hdr_rcv_act_rev) return doHdr_rcv_act_rev_VC(info);
		if (vc == Hdr_slip_sts_typ) return doHdr_slip_sts_typ_VC(info);
		if (vc == Hdr_latest_flg) return doHdr_latest_flg_VC(info);
		if (vc == Hdr_def_bank_ac_cd) return doHdr_def_bank_ac_cd_VC(info);
		if (vc == Hdr_wg_cd) return doHdr_wg_cd_VC(info);
		if (vc == Hdr_wg_nm) return doHdr_wg_nm_VC(info);
		if (vc == Hdr_ins_usr_id) return doHdr_ins_usr_id_VC(info);
		if (vc == Hdr_ins_usr_nm) return doHdr_ins_usr_nm_VC(info);
		if (vc == Hdr_ins_func_id) return doHdr_ins_func_id_VC(info);
		if (vc == Hdr_ins_func_nm) return doHdr_ins_func_nm_VC(info);
		if (vc == Hdr_upd_usr_id) return doHdr_upd_usr_id_VC(info);
		if (vc == Hdr_upd_usr_nm) return doHdr_upd_usr_nm_VC(info);
		if (vc == Hdr_upd_func_id) return doHdr_upd_func_id_VC(info);
		if (vc == Hdr_upd_func_nm) return doHdr_upd_func_nm_VC(info);
		if (vc == Hdr_ins_ts) return doHdr_ins_ts_VC(info);
		if (vc == Hdr_upd_ts) return doHdr_upd_ts_VC(info);
		if (vc == Hdr_upd_srv_req_no) return doHdr_upd_srv_req_no_VC(info);
		if (vc == Rcv_rcv_no) return doRcv_rcv_no_VC(info);
		if (vc == Rcv_slo_no) return doRcv_slo_no_VC(info);
		if (vc == Rcv_rcv_dt) return doRcv_rcv_dt_VC(info);
		if (vc == Rcv_rcst_cd) return doRcv_rcst_cd_VC(info);
		if (vc == Rcv_rcst_nm) return doRcv_rcst_nm_VC(info);
		if (vc == Rcv_bcst_cd) return doRcv_bcst_cd_VC(info);
		if (vc == Rcv_bcst_nm) return doRcv_bcst_nm_VC(info);
		if (vc == Rcv_bill_dpt_cd) return doRcv_bill_dpt_cd_VC(info);
		if (vc == Rcv_bill_dpt_nm) return doRcv_bill_dpt_nm_VC(info);
		if (vc == Rcv_trd_cur_cd) return doRcv_trd_cur_cd_VC(info);
		if (vc == Rcv_trd_cur_nm) return doRcv_trd_cur_nm_VC(info);
		if (vc == Rcv_amt_dec_place) return doRcv_amt_dec_place_VC(info);
		if (vc == Rcv_upri_dec_place) return doRcv_upri_dec_place_VC(info);
		if (vc == Rcv_base_cur_cd) return doRcv_base_cur_cd_VC(info);
		if (vc == Rcv_xrate_cd) return doRcv_xrate_cd_VC(info);
		if (vc == Rcv_ar_sttl_cd1) return doRcv_ar_sttl_cd1_VC(info);
		if (vc == Rcv_ar_sttl_typ1) return doRcv_ar_sttl_typ1_VC(info);
		if (vc == Rcv_ar_sttl_nm1) return doRcv_ar_sttl_nm1_VC(info);
		if (vc == Rcv_bank_ac_cd) return doRcv_bank_ac_cd_VC(info);
		if (vc == Rcv_bank_ac_nm) return doRcv_bank_ac_nm_VC(info);
		if (vc == Rcv_xfr_psn) return doRcv_xfr_psn_VC(info);
		if (vc == Rcv_ar_sttl_cd2) return doRcv_ar_sttl_cd2_VC(info);
		if (vc == Rcv_ar_sttl_nm2) return doRcv_ar_sttl_nm2_VC(info);
		if (vc == Rcv_sls_purc_typ2) return doRcv_sls_purc_typ2_VC(info);
		if (vc == Rcv_purc_flg) return doRcv_purc_flg_VC(info);
		if (vc == Rcv_sls_flg) return doRcv_sls_flg_VC(info);
		if (vc == Rcv_tax_cd_sub) return doRcv_tax_cd_sub_VC(info);
		if (vc == Rcv_tax_cd) return doRcv_tax_cd_VC(info);
		if (vc == Rcv_tax_nm) return doRcv_tax_nm_VC(info);
		if (vc == Rcv_tax_rate) return doRcv_tax_rate_VC(info);
		if (vc == Rcv_debtor_id_typ) return doRcv_debtor_id_typ_VC(info);
		if (vc == Rcv_debtor_id_typ_nm) return doRcv_debtor_id_typ_nm_VC(info);
		if (vc == Rcv_debtor_id_cd) return doRcv_debtor_id_cd_VC(info);
		if (vc == Rcv_debtor_nm) return doRcv_debtor_nm_VC(info);
		if (vc == Rcv_debt_bd_dpt_cd) return doRcv_debt_bd_dpt_cd_VC(info);
		if (vc == Rcv_debt_bd_dpt_nm) return doRcv_debt_bd_dpt_nm_VC(info);
		if (vc == Rcv_trd_rmrks) return doRcv_trd_rmrks_VC(info);
		if (vc == Rcv_sub_char1) return doRcv_sub_char1_VC(info);
		if (vc == Rcv_sub_char2) return doRcv_sub_char2_VC(info);
		if (vc == Rcv_sub_char3) return doRcv_sub_char3_VC(info);
		if (vc == Rcv_rcv_upd_cntr) return doRcv_rcv_upd_cntr_VC(info);
		if (vc == Rcv_note_no) return doRcv_note_no_VC(info);
		if (vc == Rcv_note_typ) return doRcv_note_typ_VC(info);
		if (vc == Rcv_note_typ_nm) return doRcv_note_typ_nm_VC(info);
		if (vc == Rcv_draw_dt) return doRcv_draw_dt_VC(info);
		if (vc == Rcv_due_dt) return doRcv_due_dt_VC(info);
		if (vc == Rcv_drawer_nm) return doRcv_drawer_nm_VC(info);
		if (vc == Rcv_endrsr) return doRcv_endrsr_VC(info);
		if (vc == Rcv_accptr) return doRcv_accptr_VC(info);
		if (vc == Rcv_draw_bank_cd) return doRcv_draw_bank_cd_VC(info);
		if (vc == Rcv_draw_bank_nm) return doRcv_draw_bank_nm_VC(info);
		if (vc == Rcv_draw_branch_cd) return doRcv_draw_branch_cd_VC(info);
		if (vc == Rcv_draw_branch_nm) return doRcv_draw_branch_nm_VC(info);
		if (vc == Rcv_note_rsn_cd) return doRcv_note_rsn_cd_VC(info);
		if (vc == Rcv_note_rsn_nm) return doRcv_note_rsn_nm_VC(info);
		if (vc == Rcv_note_sub_char1) return doRcv_note_sub_char1_VC(info);
		if (vc == Rcv_note_sub_char2) return doRcv_note_sub_char2_VC(info);
		if (vc == Rcv_note_sub_char3) return doRcv_note_sub_char3_VC(info);
		if (vc == Rcv_ar_sttl_cd3) return doRcv_ar_sttl_cd3_VC(info);
		if (vc == Rcv_ar_sttl_nm3) return doRcv_ar_sttl_nm3_VC(info);
		if (vc == Rcv_creditor_id_typ) return doRcv_creditor_id_typ_VC(info);
		if (vc == Rcv_creditor_id_typ_nm) return doRcv_creditor_id_typ_nm_VC(info);
		if (vc == Rcv_creditor_id_cd) return doRcv_creditor_id_cd_VC(info);
		if (vc == Rcv_creditor_nm) return doRcv_creditor_nm_VC(info);
		if (vc == Rcv_cred_bd_dpt_cd) return doRcv_cred_bd_dpt_cd_VC(info);
		if (vc == Rcv_cred_bd_dpt_nm) return doRcv_cred_bd_dpt_nm_VC(info);
		if (vc == Rcv_bill_cl_typ) return doRcv_bill_cl_typ_VC(info);
		if (vc == Rcv_bill_dtl_adv_flg) return doRcv_bill_dtl_adv_flg_VC(info);
		if (vc == AdvRcv_rcv_no) return doAdvRcv_rcv_no_VC(info);
		if (vc == AdvRcv_div_flg) return doAdvRcv_div_flg_VC(info);
		return true;
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcv_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcv_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[latest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_latest_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcv_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcv_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcv_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcv_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[slip_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_slip_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[latest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_latest_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[def_bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_def_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[rcv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_rcv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[rcv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_rcv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[rcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_rcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[rcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_rcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[bill_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_bill_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[bill_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_bill_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[ar_sttl_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_ar_sttl_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[ar_sttl_typ1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_ar_sttl_typ1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[ar_sttl_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_ar_sttl_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[xfr_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_xfr_psn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[ar_sttl_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_ar_sttl_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[ar_sttl_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_ar_sttl_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[sls_purc_typ2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_sls_purc_typ2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[tax_cd_sub]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_tax_cd_sub_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[debtor_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_debtor_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[debtor_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_debtor_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[debtor_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_debtor_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[debtor_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_debtor_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[debt_bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_debt_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[debt_bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_debt_bd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[rcv_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_rcv_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[note_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_note_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[note_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_note_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[note_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_note_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[draw_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_draw_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[due_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_due_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[drawer_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_drawer_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[endrsr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_endrsr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[accptr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_accptr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[draw_bank_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_draw_bank_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[draw_bank_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_draw_bank_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[draw_branch_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_draw_branch_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[draw_branch_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_draw_branch_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[note_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_note_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[note_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_note_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[note_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_note_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[note_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_note_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[note_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_note_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[ar_sttl_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_ar_sttl_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[ar_sttl_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_ar_sttl_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[creditor_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_creditor_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[creditor_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_creditor_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[creditor_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_creditor_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[creditor_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_creditor_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[cred_bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_cred_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[cred_bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_cred_bd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[bill_cl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_bill_cl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[bill_dtl_adv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_bill_dtl_adv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdvRcv]パネルの[rcv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdvRcv_rcv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdvRcv]パネルの[div_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdvRcv_div_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == HdrTabTab) doHdrTab_NC(info);
		else if (nc == RcvTabTab) doRcvTab_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_rcv_act_no) doCnd_rcv_act_no_NC(info);
		else if (nc == Cnd_rcv_act_rev) doCnd_rcv_act_rev_NC(info);
		else if (nc == Cnd_latest_flg) doCnd_latest_flg_NC(info);
		else if (nc == Hdr_trd_cd) doHdr_trd_cd_NC(info);
		else if (nc == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NC(info);
		else if (nc == Hdr_trd_nm) doHdr_trd_nm_NC(info);
		else if (nc == Hdr_ac_ym) doHdr_ac_ym_NC(info);
		else if (nc == Hdr_rcv_act_no) doHdr_rcv_act_no_NC(info);
		else if (nc == Hdr_rcv_act_rev) doHdr_rcv_act_rev_NC(info);
		else if (nc == Hdr_slip_sts_typ) doHdr_slip_sts_typ_NC(info);
		else if (nc == Hdr_latest_flg) doHdr_latest_flg_NC(info);
		else if (nc == Hdr_def_bank_ac_cd) doHdr_def_bank_ac_cd_NC(info);
		else if (nc == Hdr_wg_cd) doHdr_wg_cd_NC(info);
		else if (nc == Hdr_wg_nm) doHdr_wg_nm_NC(info);
		else if (nc == Hdr_ins_usr_id) doHdr_ins_usr_id_NC(info);
		else if (nc == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NC(info);
		else if (nc == Hdr_ins_func_id) doHdr_ins_func_id_NC(info);
		else if (nc == Hdr_ins_func_nm) doHdr_ins_func_nm_NC(info);
		else if (nc == Hdr_upd_usr_id) doHdr_upd_usr_id_NC(info);
		else if (nc == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NC(info);
		else if (nc == Hdr_upd_func_id) doHdr_upd_func_id_NC(info);
		else if (nc == Hdr_upd_func_nm) doHdr_upd_func_nm_NC(info);
		else if (nc == Hdr_ins_ts) doHdr_ins_ts_NC(info);
		else if (nc == Hdr_upd_ts) doHdr_upd_ts_NC(info);
		else if (nc == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NC(info);
		else if (nc == Rcv_rcv_no) doRcv_rcv_no_NC(info);
		else if (nc == Rcv_slo_no) doRcv_slo_no_NC(info);
		else if (nc == Rcv_rcv_dt) doRcv_rcv_dt_NC(info);
		else if (nc == Rcv_rcst_cd) doRcv_rcst_cd_NC(info);
		else if (nc == Rcv_rcst_nm) doRcv_rcst_nm_NC(info);
		else if (nc == Rcv_bcst_cd) doRcv_bcst_cd_NC(info);
		else if (nc == Rcv_bcst_nm) doRcv_bcst_nm_NC(info);
		else if (nc == Rcv_bill_dpt_cd) doRcv_bill_dpt_cd_NC(info);
		else if (nc == Rcv_bill_dpt_nm) doRcv_bill_dpt_nm_NC(info);
		else if (nc == Rcv_trd_cur_cd) doRcv_trd_cur_cd_NC(info);
		else if (nc == Rcv_trd_cur_nm) doRcv_trd_cur_nm_NC(info);
		else if (nc == Rcv_amt_dec_place) doRcv_amt_dec_place_NC(info);
		else if (nc == Rcv_upri_dec_place) doRcv_upri_dec_place_NC(info);
		else if (nc == Rcv_base_cur_cd) doRcv_base_cur_cd_NC(info);
		else if (nc == Rcv_xrate_cd) doRcv_xrate_cd_NC(info);
		else if (nc == Rcv_ar_sttl_cd1) doRcv_ar_sttl_cd1_NC(info);
		else if (nc == Rcv_ar_sttl_typ1) doRcv_ar_sttl_typ1_NC(info);
		else if (nc == Rcv_ar_sttl_nm1) doRcv_ar_sttl_nm1_NC(info);
		else if (nc == Rcv_bank_ac_cd) doRcv_bank_ac_cd_NC(info);
		else if (nc == Rcv_bank_ac_nm) doRcv_bank_ac_nm_NC(info);
		else if (nc == Rcv_xfr_psn) doRcv_xfr_psn_NC(info);
		else if (nc == Rcv_ar_sttl_cd2) doRcv_ar_sttl_cd2_NC(info);
		else if (nc == Rcv_ar_sttl_nm2) doRcv_ar_sttl_nm2_NC(info);
		else if (nc == Rcv_sls_purc_typ2) doRcv_sls_purc_typ2_NC(info);
		else if (nc == Rcv_purc_flg) doRcv_purc_flg_NC(info);
		else if (nc == Rcv_sls_flg) doRcv_sls_flg_NC(info);
		else if (nc == Rcv_tax_cd_sub) doRcv_tax_cd_sub_NC(info);
		else if (nc == Rcv_tax_cd) doRcv_tax_cd_NC(info);
		else if (nc == Rcv_tax_nm) doRcv_tax_nm_NC(info);
		else if (nc == Rcv_tax_rate) doRcv_tax_rate_NC(info);
		else if (nc == Rcv_debtor_id_typ) doRcv_debtor_id_typ_NC(info);
		else if (nc == Rcv_debtor_id_typ_nm) doRcv_debtor_id_typ_nm_NC(info);
		else if (nc == Rcv_debtor_id_cd) doRcv_debtor_id_cd_NC(info);
		else if (nc == Rcv_debtor_nm) doRcv_debtor_nm_NC(info);
		else if (nc == Rcv_debt_bd_dpt_cd) doRcv_debt_bd_dpt_cd_NC(info);
		else if (nc == Rcv_debt_bd_dpt_nm) doRcv_debt_bd_dpt_nm_NC(info);
		else if (nc == Rcv_trd_rmrks) doRcv_trd_rmrks_NC(info);
		else if (nc == Rcv_sub_char1) doRcv_sub_char1_NC(info);
		else if (nc == Rcv_sub_char2) doRcv_sub_char2_NC(info);
		else if (nc == Rcv_sub_char3) doRcv_sub_char3_NC(info);
		else if (nc == Rcv_rcv_upd_cntr) doRcv_rcv_upd_cntr_NC(info);
		else if (nc == Rcv_note_no) doRcv_note_no_NC(info);
		else if (nc == Rcv_note_typ) doRcv_note_typ_NC(info);
		else if (nc == Rcv_note_typ_nm) doRcv_note_typ_nm_NC(info);
		else if (nc == Rcv_draw_dt) doRcv_draw_dt_NC(info);
		else if (nc == Rcv_due_dt) doRcv_due_dt_NC(info);
		else if (nc == Rcv_drawer_nm) doRcv_drawer_nm_NC(info);
		else if (nc == Rcv_endrsr) doRcv_endrsr_NC(info);
		else if (nc == Rcv_accptr) doRcv_accptr_NC(info);
		else if (nc == Rcv_draw_bank_cd) doRcv_draw_bank_cd_NC(info);
		else if (nc == Rcv_draw_bank_nm) doRcv_draw_bank_nm_NC(info);
		else if (nc == Rcv_draw_branch_cd) doRcv_draw_branch_cd_NC(info);
		else if (nc == Rcv_draw_branch_nm) doRcv_draw_branch_nm_NC(info);
		else if (nc == Rcv_note_rsn_cd) doRcv_note_rsn_cd_NC(info);
		else if (nc == Rcv_note_rsn_nm) doRcv_note_rsn_nm_NC(info);
		else if (nc == Rcv_note_sub_char1) doRcv_note_sub_char1_NC(info);
		else if (nc == Rcv_note_sub_char2) doRcv_note_sub_char2_NC(info);
		else if (nc == Rcv_note_sub_char3) doRcv_note_sub_char3_NC(info);
		else if (nc == Rcv_ar_sttl_cd3) doRcv_ar_sttl_cd3_NC(info);
		else if (nc == Rcv_ar_sttl_nm3) doRcv_ar_sttl_nm3_NC(info);
		else if (nc == Rcv_creditor_id_typ) doRcv_creditor_id_typ_NC(info);
		else if (nc == Rcv_creditor_id_typ_nm) doRcv_creditor_id_typ_nm_NC(info);
		else if (nc == Rcv_creditor_id_cd) doRcv_creditor_id_cd_NC(info);
		else if (nc == Rcv_creditor_nm) doRcv_creditor_nm_NC(info);
		else if (nc == Rcv_cred_bd_dpt_cd) doRcv_cred_bd_dpt_cd_NC(info);
		else if (nc == Rcv_cred_bd_dpt_nm) doRcv_cred_bd_dpt_nm_NC(info);
		else if (nc == Rcv_bill_cl_typ) doRcv_bill_cl_typ_NC(info);
		else if (nc == Rcv_bill_dtl_adv_flg) doRcv_bill_dtl_adv_flg_NC(info);
		else if (nc == AdvRcv_rcv_no) doAdvRcv_rcv_no_NC(info);
		else if (nc == AdvRcv_div_flg) doAdvRcv_div_flg_NC(info);
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NC(MCEventInfo info){
	}

	/**
	 * [RcvTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvTab_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slip_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slip_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bill_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bill_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bill_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bill_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_typ1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_typ1_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[xfr_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_xfr_psn_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[sls_purc_typ2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_sls_purc_typ2_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[tax_cd_sub]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_tax_cd_sub_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debtor_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debtor_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debtor_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debtor_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debtor_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debtor_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debtor_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debtor_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debt_bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debt_bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcv_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcv_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_no_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[draw_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_draw_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[due_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_due_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[drawer_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_drawer_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[endrsr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_endrsr_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[accptr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_accptr_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[draw_bank_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_draw_bank_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[draw_bank_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_draw_bank_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[draw_branch_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_draw_branch_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[draw_branch_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_draw_branch_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[creditor_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_creditor_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[creditor_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_creditor_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[creditor_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_creditor_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[creditor_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_creditor_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[cred_bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_cred_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[cred_bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_cred_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bill_cl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bill_cl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bill_dtl_adv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bill_dtl_adv_flg_NC(MCEventInfo info){
	}

	/**
	 * [AdvRcv]パネルの[rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdvRcv_rcv_no_NC(MCEventInfo info){
	}

	/**
	 * [AdvRcv]パネルの[div_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdvRcv_div_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == HdrTabTab) doHdrTab_NE(info);
		else if (ne == RcvTabTab) doRcvTab_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_rcv_act_no) doCnd_rcv_act_no_NE(info);
		else if (ne == Cnd_rcv_act_rev) doCnd_rcv_act_rev_NE(info);
		else if (ne == Cnd_latest_flg) doCnd_latest_flg_NE(info);
		else if (ne == Hdr_trd_cd) doHdr_trd_cd_NE(info);
		else if (ne == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NE(info);
		else if (ne == Hdr_trd_nm) doHdr_trd_nm_NE(info);
		else if (ne == Hdr_ac_ym) doHdr_ac_ym_NE(info);
		else if (ne == Hdr_rcv_act_no) doHdr_rcv_act_no_NE(info);
		else if (ne == Hdr_rcv_act_rev) doHdr_rcv_act_rev_NE(info);
		else if (ne == Hdr_slip_sts_typ) doHdr_slip_sts_typ_NE(info);
		else if (ne == Hdr_latest_flg) doHdr_latest_flg_NE(info);
		else if (ne == Hdr_def_bank_ac_cd) doHdr_def_bank_ac_cd_NE(info);
		else if (ne == Hdr_wg_cd) doHdr_wg_cd_NE(info);
		else if (ne == Hdr_wg_nm) doHdr_wg_nm_NE(info);
		else if (ne == Hdr_ins_usr_id) doHdr_ins_usr_id_NE(info);
		else if (ne == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NE(info);
		else if (ne == Hdr_ins_func_id) doHdr_ins_func_id_NE(info);
		else if (ne == Hdr_ins_func_nm) doHdr_ins_func_nm_NE(info);
		else if (ne == Hdr_upd_usr_id) doHdr_upd_usr_id_NE(info);
		else if (ne == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NE(info);
		else if (ne == Hdr_upd_func_id) doHdr_upd_func_id_NE(info);
		else if (ne == Hdr_upd_func_nm) doHdr_upd_func_nm_NE(info);
		else if (ne == Hdr_ins_ts) doHdr_ins_ts_NE(info);
		else if (ne == Hdr_upd_ts) doHdr_upd_ts_NE(info);
		else if (ne == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NE(info);
		else if (ne == Rcv_rcv_no) doRcv_rcv_no_NE(info);
		else if (ne == Rcv_slo_no) doRcv_slo_no_NE(info);
		else if (ne == Rcv_rcv_dt) doRcv_rcv_dt_NE(info);
		else if (ne == Rcv_rcst_cd) doRcv_rcst_cd_NE(info);
		else if (ne == Rcv_rcst_nm) doRcv_rcst_nm_NE(info);
		else if (ne == Rcv_bcst_cd) doRcv_bcst_cd_NE(info);
		else if (ne == Rcv_bcst_nm) doRcv_bcst_nm_NE(info);
		else if (ne == Rcv_bill_dpt_cd) doRcv_bill_dpt_cd_NE(info);
		else if (ne == Rcv_bill_dpt_nm) doRcv_bill_dpt_nm_NE(info);
		else if (ne == Rcv_trd_cur_cd) doRcv_trd_cur_cd_NE(info);
		else if (ne == Rcv_trd_cur_nm) doRcv_trd_cur_nm_NE(info);
		else if (ne == Rcv_amt_dec_place) doRcv_amt_dec_place_NE(info);
		else if (ne == Rcv_upri_dec_place) doRcv_upri_dec_place_NE(info);
		else if (ne == Rcv_base_cur_cd) doRcv_base_cur_cd_NE(info);
		else if (ne == Rcv_xrate_cd) doRcv_xrate_cd_NE(info);
		else if (ne == Rcv_ar_sttl_cd1) doRcv_ar_sttl_cd1_NE(info);
		else if (ne == Rcv_ar_sttl_typ1) doRcv_ar_sttl_typ1_NE(info);
		else if (ne == Rcv_ar_sttl_nm1) doRcv_ar_sttl_nm1_NE(info);
		else if (ne == Rcv_bank_ac_cd) doRcv_bank_ac_cd_NE(info);
		else if (ne == Rcv_bank_ac_nm) doRcv_bank_ac_nm_NE(info);
		else if (ne == Rcv_xfr_psn) doRcv_xfr_psn_NE(info);
		else if (ne == Rcv_ar_sttl_cd2) doRcv_ar_sttl_cd2_NE(info);
		else if (ne == Rcv_ar_sttl_nm2) doRcv_ar_sttl_nm2_NE(info);
		else if (ne == Rcv_sls_purc_typ2) doRcv_sls_purc_typ2_NE(info);
		else if (ne == Rcv_purc_flg) doRcv_purc_flg_NE(info);
		else if (ne == Rcv_sls_flg) doRcv_sls_flg_NE(info);
		else if (ne == Rcv_tax_cd_sub) doRcv_tax_cd_sub_NE(info);
		else if (ne == Rcv_tax_cd) doRcv_tax_cd_NE(info);
		else if (ne == Rcv_tax_nm) doRcv_tax_nm_NE(info);
		else if (ne == Rcv_tax_rate) doRcv_tax_rate_NE(info);
		else if (ne == Rcv_debtor_id_typ) doRcv_debtor_id_typ_NE(info);
		else if (ne == Rcv_debtor_id_typ_nm) doRcv_debtor_id_typ_nm_NE(info);
		else if (ne == Rcv_debtor_id_cd) doRcv_debtor_id_cd_NE(info);
		else if (ne == Rcv_debtor_nm) doRcv_debtor_nm_NE(info);
		else if (ne == Rcv_debt_bd_dpt_cd) doRcv_debt_bd_dpt_cd_NE(info);
		else if (ne == Rcv_debt_bd_dpt_nm) doRcv_debt_bd_dpt_nm_NE(info);
		else if (ne == Rcv_trd_rmrks) doRcv_trd_rmrks_NE(info);
		else if (ne == Rcv_sub_char1) doRcv_sub_char1_NE(info);
		else if (ne == Rcv_sub_char2) doRcv_sub_char2_NE(info);
		else if (ne == Rcv_sub_char3) doRcv_sub_char3_NE(info);
		else if (ne == Rcv_rcv_upd_cntr) doRcv_rcv_upd_cntr_NE(info);
		else if (ne == Rcv_note_no) doRcv_note_no_NE(info);
		else if (ne == Rcv_note_typ) doRcv_note_typ_NE(info);
		else if (ne == Rcv_note_typ_nm) doRcv_note_typ_nm_NE(info);
		else if (ne == Rcv_draw_dt) doRcv_draw_dt_NE(info);
		else if (ne == Rcv_due_dt) doRcv_due_dt_NE(info);
		else if (ne == Rcv_drawer_nm) doRcv_drawer_nm_NE(info);
		else if (ne == Rcv_endrsr) doRcv_endrsr_NE(info);
		else if (ne == Rcv_accptr) doRcv_accptr_NE(info);
		else if (ne == Rcv_draw_bank_cd) doRcv_draw_bank_cd_NE(info);
		else if (ne == Rcv_draw_bank_nm) doRcv_draw_bank_nm_NE(info);
		else if (ne == Rcv_draw_branch_cd) doRcv_draw_branch_cd_NE(info);
		else if (ne == Rcv_draw_branch_nm) doRcv_draw_branch_nm_NE(info);
		else if (ne == Rcv_note_rsn_cd) doRcv_note_rsn_cd_NE(info);
		else if (ne == Rcv_note_rsn_nm) doRcv_note_rsn_nm_NE(info);
		else if (ne == Rcv_note_sub_char1) doRcv_note_sub_char1_NE(info);
		else if (ne == Rcv_note_sub_char2) doRcv_note_sub_char2_NE(info);
		else if (ne == Rcv_note_sub_char3) doRcv_note_sub_char3_NE(info);
		else if (ne == Rcv_ar_sttl_cd3) doRcv_ar_sttl_cd3_NE(info);
		else if (ne == Rcv_ar_sttl_nm3) doRcv_ar_sttl_nm3_NE(info);
		else if (ne == Rcv_creditor_id_typ) doRcv_creditor_id_typ_NE(info);
		else if (ne == Rcv_creditor_id_typ_nm) doRcv_creditor_id_typ_nm_NE(info);
		else if (ne == Rcv_creditor_id_cd) doRcv_creditor_id_cd_NE(info);
		else if (ne == Rcv_creditor_nm) doRcv_creditor_nm_NE(info);
		else if (ne == Rcv_cred_bd_dpt_cd) doRcv_cred_bd_dpt_cd_NE(info);
		else if (ne == Rcv_cred_bd_dpt_nm) doRcv_cred_bd_dpt_nm_NE(info);
		else if (ne == Rcv_bill_cl_typ) doRcv_bill_cl_typ_NE(info);
		else if (ne == Rcv_bill_dtl_adv_flg) doRcv_bill_dtl_adv_flg_NE(info);
		else if (ne == AdvRcv_rcv_no) doAdvRcv_rcv_no_NE(info);
		else if (ne == AdvRcv_div_flg) doAdvRcv_div_flg_NE(info);
	}

	/**
	 * [HdrTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NE(MCEventInfo info){
	}

	/**
	 * [RcvTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvTab_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slip_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slip_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bill_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bill_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bill_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bill_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_typ1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_typ1_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[xfr_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_xfr_psn_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[sls_purc_typ2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_sls_purc_typ2_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[tax_cd_sub]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_tax_cd_sub_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debtor_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debtor_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debtor_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debtor_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debtor_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debtor_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debtor_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debtor_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debt_bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debt_bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcv_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcv_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_no_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[draw_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_draw_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[due_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_due_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[drawer_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_drawer_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[endrsr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_endrsr_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[accptr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_accptr_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[draw_bank_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_draw_bank_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[draw_bank_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_draw_bank_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[draw_branch_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_draw_branch_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[draw_branch_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_draw_branch_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[creditor_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_creditor_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[creditor_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_creditor_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[creditor_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_creditor_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[creditor_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_creditor_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[cred_bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_cred_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[cred_bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_cred_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bill_cl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bill_cl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bill_dtl_adv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bill_dtl_adv_flg_NE(MCEventInfo info){
	}

	/**
	 * [AdvRcv]パネルの[rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdvRcv_rcv_no_NE(MCEventInfo info){
	}

	/**
	 * [AdvRcv]パネルの[div_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdvRcv_div_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == HdrTabTab) doHdrTab_NX(info);
		else if (nx == RcvTabTab) doRcvTab_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_rcv_act_no) doCnd_rcv_act_no_NX(info);
		else if (nx == Cnd_rcv_act_rev) doCnd_rcv_act_rev_NX(info);
		else if (nx == Cnd_latest_flg) doCnd_latest_flg_NX(info);
		else if (nx == Hdr_trd_cd) doHdr_trd_cd_NX(info);
		else if (nx == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NX(info);
		else if (nx == Hdr_trd_nm) doHdr_trd_nm_NX(info);
		else if (nx == Hdr_ac_ym) doHdr_ac_ym_NX(info);
		else if (nx == Hdr_rcv_act_no) doHdr_rcv_act_no_NX(info);
		else if (nx == Hdr_rcv_act_rev) doHdr_rcv_act_rev_NX(info);
		else if (nx == Hdr_slip_sts_typ) doHdr_slip_sts_typ_NX(info);
		else if (nx == Hdr_latest_flg) doHdr_latest_flg_NX(info);
		else if (nx == Hdr_def_bank_ac_cd) doHdr_def_bank_ac_cd_NX(info);
		else if (nx == Hdr_wg_cd) doHdr_wg_cd_NX(info);
		else if (nx == Hdr_wg_nm) doHdr_wg_nm_NX(info);
		else if (nx == Hdr_ins_usr_id) doHdr_ins_usr_id_NX(info);
		else if (nx == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NX(info);
		else if (nx == Hdr_ins_func_id) doHdr_ins_func_id_NX(info);
		else if (nx == Hdr_ins_func_nm) doHdr_ins_func_nm_NX(info);
		else if (nx == Hdr_upd_usr_id) doHdr_upd_usr_id_NX(info);
		else if (nx == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NX(info);
		else if (nx == Hdr_upd_func_id) doHdr_upd_func_id_NX(info);
		else if (nx == Hdr_upd_func_nm) doHdr_upd_func_nm_NX(info);
		else if (nx == Hdr_ins_ts) doHdr_ins_ts_NX(info);
		else if (nx == Hdr_upd_ts) doHdr_upd_ts_NX(info);
		else if (nx == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NX(info);
		else if (nx == Rcv_rcv_no) doRcv_rcv_no_NX(info);
		else if (nx == Rcv_slo_no) doRcv_slo_no_NX(info);
		else if (nx == Rcv_rcv_dt) doRcv_rcv_dt_NX(info);
		else if (nx == Rcv_rcst_cd) doRcv_rcst_cd_NX(info);
		else if (nx == Rcv_rcst_nm) doRcv_rcst_nm_NX(info);
		else if (nx == Rcv_bcst_cd) doRcv_bcst_cd_NX(info);
		else if (nx == Rcv_bcst_nm) doRcv_bcst_nm_NX(info);
		else if (nx == Rcv_bill_dpt_cd) doRcv_bill_dpt_cd_NX(info);
		else if (nx == Rcv_bill_dpt_nm) doRcv_bill_dpt_nm_NX(info);
		else if (nx == Rcv_trd_cur_cd) doRcv_trd_cur_cd_NX(info);
		else if (nx == Rcv_trd_cur_nm) doRcv_trd_cur_nm_NX(info);
		else if (nx == Rcv_amt_dec_place) doRcv_amt_dec_place_NX(info);
		else if (nx == Rcv_upri_dec_place) doRcv_upri_dec_place_NX(info);
		else if (nx == Rcv_base_cur_cd) doRcv_base_cur_cd_NX(info);
		else if (nx == Rcv_xrate_cd) doRcv_xrate_cd_NX(info);
		else if (nx == Rcv_ar_sttl_cd1) doRcv_ar_sttl_cd1_NX(info);
		else if (nx == Rcv_ar_sttl_typ1) doRcv_ar_sttl_typ1_NX(info);
		else if (nx == Rcv_ar_sttl_nm1) doRcv_ar_sttl_nm1_NX(info);
		else if (nx == Rcv_bank_ac_cd) doRcv_bank_ac_cd_NX(info);
		else if (nx == Rcv_bank_ac_nm) doRcv_bank_ac_nm_NX(info);
		else if (nx == Rcv_xfr_psn) doRcv_xfr_psn_NX(info);
		else if (nx == Rcv_ar_sttl_cd2) doRcv_ar_sttl_cd2_NX(info);
		else if (nx == Rcv_ar_sttl_nm2) doRcv_ar_sttl_nm2_NX(info);
		else if (nx == Rcv_sls_purc_typ2) doRcv_sls_purc_typ2_NX(info);
		else if (nx == Rcv_purc_flg) doRcv_purc_flg_NX(info);
		else if (nx == Rcv_sls_flg) doRcv_sls_flg_NX(info);
		else if (nx == Rcv_tax_cd_sub) doRcv_tax_cd_sub_NX(info);
		else if (nx == Rcv_tax_cd) doRcv_tax_cd_NX(info);
		else if (nx == Rcv_tax_nm) doRcv_tax_nm_NX(info);
		else if (nx == Rcv_tax_rate) doRcv_tax_rate_NX(info);
		else if (nx == Rcv_debtor_id_typ) doRcv_debtor_id_typ_NX(info);
		else if (nx == Rcv_debtor_id_typ_nm) doRcv_debtor_id_typ_nm_NX(info);
		else if (nx == Rcv_debtor_id_cd) doRcv_debtor_id_cd_NX(info);
		else if (nx == Rcv_debtor_nm) doRcv_debtor_nm_NX(info);
		else if (nx == Rcv_debt_bd_dpt_cd) doRcv_debt_bd_dpt_cd_NX(info);
		else if (nx == Rcv_debt_bd_dpt_nm) doRcv_debt_bd_dpt_nm_NX(info);
		else if (nx == Rcv_trd_rmrks) doRcv_trd_rmrks_NX(info);
		else if (nx == Rcv_sub_char1) doRcv_sub_char1_NX(info);
		else if (nx == Rcv_sub_char2) doRcv_sub_char2_NX(info);
		else if (nx == Rcv_sub_char3) doRcv_sub_char3_NX(info);
		else if (nx == Rcv_rcv_upd_cntr) doRcv_rcv_upd_cntr_NX(info);
		else if (nx == Rcv_note_no) doRcv_note_no_NX(info);
		else if (nx == Rcv_note_typ) doRcv_note_typ_NX(info);
		else if (nx == Rcv_note_typ_nm) doRcv_note_typ_nm_NX(info);
		else if (nx == Rcv_draw_dt) doRcv_draw_dt_NX(info);
		else if (nx == Rcv_due_dt) doRcv_due_dt_NX(info);
		else if (nx == Rcv_drawer_nm) doRcv_drawer_nm_NX(info);
		else if (nx == Rcv_endrsr) doRcv_endrsr_NX(info);
		else if (nx == Rcv_accptr) doRcv_accptr_NX(info);
		else if (nx == Rcv_draw_bank_cd) doRcv_draw_bank_cd_NX(info);
		else if (nx == Rcv_draw_bank_nm) doRcv_draw_bank_nm_NX(info);
		else if (nx == Rcv_draw_branch_cd) doRcv_draw_branch_cd_NX(info);
		else if (nx == Rcv_draw_branch_nm) doRcv_draw_branch_nm_NX(info);
		else if (nx == Rcv_note_rsn_cd) doRcv_note_rsn_cd_NX(info);
		else if (nx == Rcv_note_rsn_nm) doRcv_note_rsn_nm_NX(info);
		else if (nx == Rcv_note_sub_char1) doRcv_note_sub_char1_NX(info);
		else if (nx == Rcv_note_sub_char2) doRcv_note_sub_char2_NX(info);
		else if (nx == Rcv_note_sub_char3) doRcv_note_sub_char3_NX(info);
		else if (nx == Rcv_ar_sttl_cd3) doRcv_ar_sttl_cd3_NX(info);
		else if (nx == Rcv_ar_sttl_nm3) doRcv_ar_sttl_nm3_NX(info);
		else if (nx == Rcv_creditor_id_typ) doRcv_creditor_id_typ_NX(info);
		else if (nx == Rcv_creditor_id_typ_nm) doRcv_creditor_id_typ_nm_NX(info);
		else if (nx == Rcv_creditor_id_cd) doRcv_creditor_id_cd_NX(info);
		else if (nx == Rcv_creditor_nm) doRcv_creditor_nm_NX(info);
		else if (nx == Rcv_cred_bd_dpt_cd) doRcv_cred_bd_dpt_cd_NX(info);
		else if (nx == Rcv_cred_bd_dpt_nm) doRcv_cred_bd_dpt_nm_NX(info);
		else if (nx == Rcv_bill_cl_typ) doRcv_bill_cl_typ_NX(info);
		else if (nx == Rcv_bill_dtl_adv_flg) doRcv_bill_dtl_adv_flg_NX(info);
		else if (nx == AdvRcv_rcv_no) doAdvRcv_rcv_no_NX(info);
		else if (nx == AdvRcv_div_flg) doAdvRcv_div_flg_NX(info);
	}

	/**
	 * [HdrTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NX(MCEventInfo info){
	}

	/**
	 * [RcvTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvTab_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slip_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slip_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bill_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bill_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bill_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bill_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_typ1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_typ1_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[xfr_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_xfr_psn_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[sls_purc_typ2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_sls_purc_typ2_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[tax_cd_sub]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_tax_cd_sub_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debtor_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debtor_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debtor_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debtor_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debtor_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debtor_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debtor_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debtor_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debt_bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debt_bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcv_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcv_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_no_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[draw_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_draw_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[due_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_due_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[drawer_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_drawer_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[endrsr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_endrsr_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[accptr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_accptr_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[draw_bank_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_draw_bank_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[draw_bank_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_draw_bank_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[draw_branch_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_draw_branch_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[draw_branch_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_draw_branch_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[creditor_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_creditor_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[creditor_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_creditor_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[creditor_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_creditor_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[creditor_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_creditor_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[cred_bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_cred_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[cred_bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_cred_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bill_cl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bill_cl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bill_dtl_adv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bill_dtl_adv_flg_NX(MCEventInfo info){
	}

	/**
	 * [AdvRcv]パネルの[rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdvRcv_rcv_no_NX(MCEventInfo info){
	}

	/**
	 * [AdvRcv]パネルの[div_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdvRcv_div_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_rcv_act_no) doCnd_rcv_act_no_LC(info);
		else if (lc == Cnd_rcv_act_rev) doCnd_rcv_act_rev_LC(info);
		else if (lc == Hdr_trd_cd) doHdr_trd_cd_LC(info);
		else if (lc == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_LC(info);
		else if (lc == Hdr_trd_nm) doHdr_trd_nm_LC(info);
		else if (lc == Hdr_ac_ym) doHdr_ac_ym_LC(info);
		else if (lc == Hdr_rcv_act_no) doHdr_rcv_act_no_LC(info);
		else if (lc == Hdr_rcv_act_rev) doHdr_rcv_act_rev_LC(info);
		else if (lc == Hdr_slip_sts_typ) doHdr_slip_sts_typ_LC(info);
		else if (lc == Hdr_def_bank_ac_cd) doHdr_def_bank_ac_cd_LC(info);
		else if (lc == Hdr_wg_cd) doHdr_wg_cd_LC(info);
		else if (lc == Hdr_wg_nm) doHdr_wg_nm_LC(info);
		else if (lc == Hdr_ins_usr_id) doHdr_ins_usr_id_LC(info);
		else if (lc == Hdr_ins_usr_nm) doHdr_ins_usr_nm_LC(info);
		else if (lc == Hdr_ins_func_id) doHdr_ins_func_id_LC(info);
		else if (lc == Hdr_ins_func_nm) doHdr_ins_func_nm_LC(info);
		else if (lc == Hdr_upd_usr_id) doHdr_upd_usr_id_LC(info);
		else if (lc == Hdr_upd_usr_nm) doHdr_upd_usr_nm_LC(info);
		else if (lc == Hdr_upd_func_id) doHdr_upd_func_id_LC(info);
		else if (lc == Hdr_upd_func_nm) doHdr_upd_func_nm_LC(info);
		else if (lc == Hdr_ins_ts) doHdr_ins_ts_LC(info);
		else if (lc == Hdr_upd_ts) doHdr_upd_ts_LC(info);
		else if (lc == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_LC(info);
		else if (lc == Rcv_rcv_no) doRcv_rcv_no_LC(info);
		else if (lc == Rcv_slo_no) doRcv_slo_no_LC(info);
		else if (lc == Rcv_rcv_dt) doRcv_rcv_dt_LC(info);
		else if (lc == Rcv_rcst_cd) doRcv_rcst_cd_LC(info);
		else if (lc == Rcv_rcst_nm) doRcv_rcst_nm_LC(info);
		else if (lc == Rcv_bcst_cd) doRcv_bcst_cd_LC(info);
		else if (lc == Rcv_bcst_nm) doRcv_bcst_nm_LC(info);
		else if (lc == Rcv_bill_dpt_cd) doRcv_bill_dpt_cd_LC(info);
		else if (lc == Rcv_bill_dpt_nm) doRcv_bill_dpt_nm_LC(info);
		else if (lc == Rcv_trd_cur_cd) doRcv_trd_cur_cd_LC(info);
		else if (lc == Rcv_trd_cur_nm) doRcv_trd_cur_nm_LC(info);
		else if (lc == Rcv_amt_dec_place) doRcv_amt_dec_place_LC(info);
		else if (lc == Rcv_upri_dec_place) doRcv_upri_dec_place_LC(info);
		else if (lc == Rcv_base_cur_cd) doRcv_base_cur_cd_LC(info);
		else if (lc == Rcv_xrate_cd) doRcv_xrate_cd_LC(info);
		else if (lc == Rcv_ar_sttl_cd1) doRcv_ar_sttl_cd1_LC(info);
		else if (lc == Rcv_ar_sttl_typ1) doRcv_ar_sttl_typ1_LC(info);
		else if (lc == Rcv_ar_sttl_nm1) doRcv_ar_sttl_nm1_LC(info);
		else if (lc == Rcv_bank_ac_cd) doRcv_bank_ac_cd_LC(info);
		else if (lc == Rcv_bank_ac_nm) doRcv_bank_ac_nm_LC(info);
		else if (lc == Rcv_xfr_psn) doRcv_xfr_psn_LC(info);
		else if (lc == Rcv_ar_sttl_cd2) doRcv_ar_sttl_cd2_LC(info);
		else if (lc == Rcv_ar_sttl_nm2) doRcv_ar_sttl_nm2_LC(info);
		else if (lc == Rcv_sls_purc_typ2) doRcv_sls_purc_typ2_LC(info);
		else if (lc == Rcv_tax_cd_sub) doRcv_tax_cd_sub_LC(info);
		else if (lc == Rcv_tax_cd) doRcv_tax_cd_LC(info);
		else if (lc == Rcv_tax_nm) doRcv_tax_nm_LC(info);
		else if (lc == Rcv_tax_rate) doRcv_tax_rate_LC(info);
		else if (lc == Rcv_debtor_id_typ) doRcv_debtor_id_typ_LC(info);
		else if (lc == Rcv_debtor_id_typ_nm) doRcv_debtor_id_typ_nm_LC(info);
		else if (lc == Rcv_debtor_id_cd) doRcv_debtor_id_cd_LC(info);
		else if (lc == Rcv_debtor_nm) doRcv_debtor_nm_LC(info);
		else if (lc == Rcv_debt_bd_dpt_cd) doRcv_debt_bd_dpt_cd_LC(info);
		else if (lc == Rcv_debt_bd_dpt_nm) doRcv_debt_bd_dpt_nm_LC(info);
		else if (lc == Rcv_trd_rmrks) doRcv_trd_rmrks_LC(info);
		else if (lc == Rcv_sub_char1) doRcv_sub_char1_LC(info);
		else if (lc == Rcv_sub_char2) doRcv_sub_char2_LC(info);
		else if (lc == Rcv_sub_char3) doRcv_sub_char3_LC(info);
		else if (lc == Rcv_rcv_upd_cntr) doRcv_rcv_upd_cntr_LC(info);
		else if (lc == Rcv_note_no) doRcv_note_no_LC(info);
		else if (lc == Rcv_note_typ) doRcv_note_typ_LC(info);
		else if (lc == Rcv_note_typ_nm) doRcv_note_typ_nm_LC(info);
		else if (lc == Rcv_draw_dt) doRcv_draw_dt_LC(info);
		else if (lc == Rcv_due_dt) doRcv_due_dt_LC(info);
		else if (lc == Rcv_drawer_nm) doRcv_drawer_nm_LC(info);
		else if (lc == Rcv_endrsr) doRcv_endrsr_LC(info);
		else if (lc == Rcv_accptr) doRcv_accptr_LC(info);
		else if (lc == Rcv_draw_bank_cd) doRcv_draw_bank_cd_LC(info);
		else if (lc == Rcv_draw_bank_nm) doRcv_draw_bank_nm_LC(info);
		else if (lc == Rcv_draw_branch_cd) doRcv_draw_branch_cd_LC(info);
		else if (lc == Rcv_draw_branch_nm) doRcv_draw_branch_nm_LC(info);
		else if (lc == Rcv_note_rsn_cd) doRcv_note_rsn_cd_LC(info);
		else if (lc == Rcv_note_rsn_nm) doRcv_note_rsn_nm_LC(info);
		else if (lc == Rcv_note_sub_char1) doRcv_note_sub_char1_LC(info);
		else if (lc == Rcv_note_sub_char2) doRcv_note_sub_char2_LC(info);
		else if (lc == Rcv_note_sub_char3) doRcv_note_sub_char3_LC(info);
		else if (lc == Rcv_ar_sttl_cd3) doRcv_ar_sttl_cd3_LC(info);
		else if (lc == Rcv_ar_sttl_nm3) doRcv_ar_sttl_nm3_LC(info);
		else if (lc == Rcv_creditor_id_typ) doRcv_creditor_id_typ_LC(info);
		else if (lc == Rcv_creditor_id_typ_nm) doRcv_creditor_id_typ_nm_LC(info);
		else if (lc == Rcv_creditor_id_cd) doRcv_creditor_id_cd_LC(info);
		else if (lc == Rcv_creditor_nm) doRcv_creditor_nm_LC(info);
		else if (lc == Rcv_cred_bd_dpt_cd) doRcv_cred_bd_dpt_cd_LC(info);
		else if (lc == Rcv_cred_bd_dpt_nm) doRcv_cred_bd_dpt_nm_LC(info);
		else if (lc == Rcv_bill_cl_typ) doRcv_bill_cl_typ_LC(info);
		else if (lc == AdvRcv_rcv_no) doAdvRcv_rcv_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[rcv_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slip_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slip_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcv_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bill_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bill_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bill_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bill_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_typ1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_typ1_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bank_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[xfr_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_xfr_psn_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[sls_purc_typ2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_sls_purc_typ2_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[tax_cd_sub]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_tax_cd_sub_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debtor_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debtor_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debtor_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debtor_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debtor_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debtor_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debtor_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debtor_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debt_bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debt_bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcv_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcv_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_no_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[draw_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_draw_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[due_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_due_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[drawer_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_drawer_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[endrsr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_endrsr_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[accptr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_accptr_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[draw_bank_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_draw_bank_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[draw_bank_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_draw_bank_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[draw_branch_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_draw_branch_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[draw_branch_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_draw_branch_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[note_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_note_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[ar_sttl_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[creditor_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_creditor_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[creditor_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_creditor_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[creditor_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_creditor_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[creditor_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_creditor_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[cred_bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_cred_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[cred_bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_cred_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bill_cl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bill_cl_typ_LC(MCEventInfo info){
	}

	/**
	 * [AdvRcv]パネルの[rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdvRcv_rcv_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Hdr_trd_cd]の作成メソッド
	 */
	public MCList getHdr_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_slo_no]の作成メソッド
	 */
	public MCList getRcv_slo_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getSloNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_rcst_cd]の作成メソッド
	 */
	public MCList getRcv_rcst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_bcst_cd]の作成メソッド
	 */
	public MCList getRcv_bcst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_bill_dpt_cd]の作成メソッド
	 */
	public MCList getRcv_bill_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_trd_cur_cd]の作成メソッド
	 */
	public MCList getRcv_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_ar_sttl_cd1]の作成メソッド
	 */
	public MCList getRcv_ar_sttl_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0080.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0080.MSUAP_List", this)).getSttlRcv(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_bank_ac_cd]の作成メソッド
	 */
	public MCList getRcv_bank_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIntBankAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_ar_sttl_cd2]の作成メソッド
	 */
	public MCList getRcv_ar_sttl_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSttl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_tax_cd]の作成メソッド
	 */
	public MCList getRcv_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_debtor_id_typ]の作成メソッド
	 */
	public MCList getRcv_debtor_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDebtCredIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_debtor_id_cd]の作成メソッド
	 */
	public MCList getRcv_debtor_id_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_debt_bd_dpt_cd]の作成メソッド
	 */
	public MCList getRcv_debt_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_ar_sttl_cd3]の作成メソッド
	 */
	public MCList getRcv_ar_sttl_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSttl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_creditor_id_typ]の作成メソッド
	 */
	public MCList getRcv_creditor_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDebtCredIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_creditor_id_cd]の作成メソッド
	 */
	public MCList getRcv_creditor_id_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_cred_bd_dpt_cd]の作成メソッド
	 */
	public MCList getRcv_cred_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBGL0200.Srch01")) {
			return new MS_MSBGL0200_Srch01Bridge();
		}
		if (id.equals("MS.MSBGL0200.Srch02")) {
			return new MS_MSBGL0200_Srch02Bridge();
		}
		if (id.equals("MS.MSBGL0200.Ins01")) {
			return new MS_MSBGL0200_Ins01Bridge();
		}
		if (id.equals("MS.MSBGL0200.Upd01")) {
			return new MS_MSBGL0200_Upd01Bridge();
		}
		if (id.equals("MS.MSBGL0200.Del01")) {
			return new MS_MSBGL0200_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBGL0200_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0200_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0200_Srch01;

		/** コンストラクタ */
		protected MS_MSBGL0200_Srch01Bridge() {
			p_MS_MSBGL0200_Srch01 = new MCParam(PDef.MS_MSBGL0200_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0200_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0200.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0200.HdrR.create());
			param.addDownBlock(mcframe.clientMSBG.MSBGP0200.RcvR.create());
			param.addDownBlock(mcframe.clientMSBG.MSBGP0200.AdvRcvR.create());

			p_MS_MSBGL0200_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0200_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0200_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0200_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0200_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0200.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0200.CndR)up(0);
		}

		protected mcframe.clientMSBG.MSBGP0200.HdrR down0() {
			return (mcframe.clientMSBG.MSBGP0200.HdrR)down(0);
		}
		protected mcframe.clientMSBG.MSBGP0200.RcvR down1() {
			return (mcframe.clientMSBG.MSBGP0200.RcvR)down(1);
		}
		protected mcframe.clientMSBG.MSBGP0200.AdvRcvR down2() {
			return (mcframe.clientMSBG.MSBGP0200.AdvRcvR)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0200_Srch01.addDownBlock(mcframe.clientMSBG.MSBGP0200.HdrR.create());
			p_MS_MSBGL0200_Srch01.addDownBlock(mcframe.clientMSBG.MSBGP0200.RcvR.create());
			p_MS_MSBGL0200_Srch01.addDownBlock(mcframe.clientMSBG.MSBGP0200.AdvRcvR.create());
		}
		protected MCParam param() {
			return p_MS_MSBGL0200_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBG.MSBGP0200.HdrR)p_MS_MSBGL0200_Srch01.getContainerParam().getDownBlock(0));
			setRcvR((mcframe.clientMSBG.MSBGP0200.RcvR)p_MS_MSBGL0200_Srch01.getContainerParam().getDownBlock(1));
			setAdvRcvR((mcframe.clientMSBG.MSBGP0200.AdvRcvR)p_MS_MSBGL0200_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getRcvR().clear();
			getAdvRcvR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getRcvR());
			result.add(getAdvRcvR());
			return result;
		}
	}
	/**
	 * [MS_MSBGL0200_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0200_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0200_Srch02;

		/** コンストラクタ */
		protected MS_MSBGL0200_Srch02Bridge() {
			p_MS_MSBGL0200_Srch02 = new MCParam(PDef.MS_MSBGL0200_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0200_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0200.RcvR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0200.RcvR.create());

			p_MS_MSBGL0200_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0200_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0200_Srch02.addUpBlock(getRcvR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0200_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0200_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0200.RcvR up0() {
			return (mcframe.clientMSBG.MSBGP0200.RcvR)up(0);
		}

		protected mcframe.clientMSBG.MSBGP0200.RcvR down0() {
			return (mcframe.clientMSBG.MSBGP0200.RcvR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0200_Srch02.addDownBlock(mcframe.clientMSBG.MSBGP0200.RcvR.create());
		}
		protected MCParam param() {
			return p_MS_MSBGL0200_Srch02;
		}

		protected void show() {
			setRcvR((mcframe.clientMSBG.MSBGP0200.RcvR)p_MS_MSBGL0200_Srch02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRcvR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRcvR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRcvR());
			return result;
		}
	}
	/**
	 * [MS_MSBGL0200_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0200_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0200_Ins01;

		/** コンストラクタ */
		protected MS_MSBGL0200_Ins01Bridge() {
			p_MS_MSBGL0200_Ins01 = new MCParam(PDef.MS_MSBGL0200_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0200_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0200.HdrR.create());
			param.addUpBlock(mcframe.clientMSBG.MSBGP0200.RcvR.create());
			param.addUpBlock(mcframe.clientMSBG.MSBGP0200.AdvRcvR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0200.HdrR.create());
			param.addDownBlock(mcframe.clientMSBG.MSBGP0200.AdvRcvR.create());

			p_MS_MSBGL0200_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0200_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0200_Ins01.addUpBlock(getHdrR());
			p_MS_MSBGL0200_Ins01.addUpBlock(getRcvR());
			p_MS_MSBGL0200_Ins01.addUpBlock(getAdvRcvR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0200_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0200_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0200.HdrR up0() {
			return (mcframe.clientMSBG.MSBGP0200.HdrR)up(0);
		}
		protected mcframe.clientMSBG.MSBGP0200.RcvR up1() {
			return (mcframe.clientMSBG.MSBGP0200.RcvR)up(1);
		}
		protected mcframe.clientMSBG.MSBGP0200.AdvRcvR up2() {
			return (mcframe.clientMSBG.MSBGP0200.AdvRcvR)up(2);
		}

		protected mcframe.clientMSBG.MSBGP0200.HdrR down0() {
			return (mcframe.clientMSBG.MSBGP0200.HdrR)down(0);
		}
		protected mcframe.clientMSBG.MSBGP0200.AdvRcvR down1() {
			return (mcframe.clientMSBG.MSBGP0200.AdvRcvR)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0200_Ins01.addDownBlock(mcframe.clientMSBG.MSBGP0200.HdrR.create());
			p_MS_MSBGL0200_Ins01.addDownBlock(mcframe.clientMSBG.MSBGP0200.AdvRcvR.create());
		}
		protected MCParam param() {
			return p_MS_MSBGL0200_Ins01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBG.MSBGP0200.HdrR)p_MS_MSBGL0200_Ins01.getContainerParam().getDownBlock(0));
			setAdvRcvR((mcframe.clientMSBG.MSBGP0200.AdvRcvR)p_MS_MSBGL0200_Ins01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getAdvRcvR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getRcvR());
			result.add(getAdvRcvR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getAdvRcvR());
			return result;
		}
	}
	/**
	 * [MS_MSBGL0200_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0200_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0200_Upd01;

		/** コンストラクタ */
		protected MS_MSBGL0200_Upd01Bridge() {
			p_MS_MSBGL0200_Upd01 = new MCParam(PDef.MS_MSBGL0200_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0200_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0200.HdrR.create());
			param.addUpBlock(mcframe.clientMSBG.MSBGP0200.RcvR.create());
			param.addUpBlock(mcframe.clientMSBG.MSBGP0200.AdvRcvR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0200.HdrR.create());
			param.addDownBlock(mcframe.clientMSBG.MSBGP0200.AdvRcvR.create());

			p_MS_MSBGL0200_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0200_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0200_Upd01.addUpBlock(getHdrR());
			p_MS_MSBGL0200_Upd01.addUpBlock(getRcvR());
			p_MS_MSBGL0200_Upd01.addUpBlock(getAdvRcvR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0200_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0200_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0200.HdrR up0() {
			return (mcframe.clientMSBG.MSBGP0200.HdrR)up(0);
		}
		protected mcframe.clientMSBG.MSBGP0200.RcvR up1() {
			return (mcframe.clientMSBG.MSBGP0200.RcvR)up(1);
		}
		protected mcframe.clientMSBG.MSBGP0200.AdvRcvR up2() {
			return (mcframe.clientMSBG.MSBGP0200.AdvRcvR)up(2);
		}

		protected mcframe.clientMSBG.MSBGP0200.HdrR down0() {
			return (mcframe.clientMSBG.MSBGP0200.HdrR)down(0);
		}
		protected mcframe.clientMSBG.MSBGP0200.AdvRcvR down1() {
			return (mcframe.clientMSBG.MSBGP0200.AdvRcvR)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0200_Upd01.addDownBlock(mcframe.clientMSBG.MSBGP0200.HdrR.create());
			p_MS_MSBGL0200_Upd01.addDownBlock(mcframe.clientMSBG.MSBGP0200.AdvRcvR.create());
		}
		protected MCParam param() {
			return p_MS_MSBGL0200_Upd01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBG.MSBGP0200.HdrR)p_MS_MSBGL0200_Upd01.getContainerParam().getDownBlock(0));
			setAdvRcvR((mcframe.clientMSBG.MSBGP0200.AdvRcvR)p_MS_MSBGL0200_Upd01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getAdvRcvR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getRcvR());
			result.add(getAdvRcvR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getAdvRcvR());
			return result;
		}
	}
	/**
	 * [MS_MSBGL0200_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0200_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0200_Del01;

		/** コンストラクタ */
		protected MS_MSBGL0200_Del01Bridge() {
			p_MS_MSBGL0200_Del01 = new MCParam(PDef.MS_MSBGL0200_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0200_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0200.HdrR.create());
			param.addUpBlock(mcframe.clientMSBG.MSBGP0200.RcvR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0200.HdrR.create());

			p_MS_MSBGL0200_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0200_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0200_Del01.addUpBlock(getHdrR());
			p_MS_MSBGL0200_Del01.addUpBlock(getRcvR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0200_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0200_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0200.HdrR up0() {
			return (mcframe.clientMSBG.MSBGP0200.HdrR)up(0);
		}
		protected mcframe.clientMSBG.MSBGP0200.RcvR up1() {
			return (mcframe.clientMSBG.MSBGP0200.RcvR)up(1);
		}

		protected mcframe.clientMSBG.MSBGP0200.HdrR down0() {
			return (mcframe.clientMSBG.MSBGP0200.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0200_Del01.addDownBlock(mcframe.clientMSBG.MSBGP0200.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBGL0200_Del01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBG.MSBGP0200.HdrR)p_MS_MSBGL0200_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdrR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getRcvR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
	}
}