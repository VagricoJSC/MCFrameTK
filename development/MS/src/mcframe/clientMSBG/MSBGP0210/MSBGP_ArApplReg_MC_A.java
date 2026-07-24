package mcframe.clientMSBG.MSBGP0210;

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
import mcframe.clientMSBG.MSBGP0210.MSBGP_ArApplReg_MC.MS_MSBGL0210_Srch01Caller;
import mcframe.clientMSBG.MSBGP0210.MSBGP_ArApplReg_MC.MS_MSBGL0210_Srch02Caller;
import mcframe.clientMSBG.MSBGP0210.MSBGP_ArApplReg_MC.MS_MSBGL0210_Srch03Caller;
import mcframe.clientMSBG.MSBGP0210.MSBGP_ArApplReg_MC.MS_MSBGL0210_Srch04Caller;
import mcframe.clientMSBG.MSBGP0210.MSBGP_ArApplReg_MC.MS_MSBGL0210_Ins01Caller;
import mcframe.clientMSBG.MSBGP0210.MSBGP_ArApplReg_MC.MS_MSBGL0210_Upd01Caller;
import mcframe.clientMSBG.MSBGP0210.MSBGP_ArApplReg_MC.MS_MSBGL0210_Del01Caller;

/**
 * 画面"MSBGP_ArApplReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGP_ArApplReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBGP0210";

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
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public MCTextField Hdr_ar_trd_grp_typ = null;
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
	 * Latest 最新.<p>
	 *
	 */
	public MCCheckBox Hdr_latest_flg = null;
	public MCLabel Hdr_ac_dt_Label = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDateField Hdr_ac_dt = null;
	public mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H Hdr_can_ac_dt_p_PPanel;
	public MCDateField Hdr_can_ac_dt_for_input;	// [Hdr]の[can_ac_dt_p.can_ac_dt_for_input]を[Hdr_can_ac_dt_for_input]としてエイリアス定義。
	public MCDateField Hdr_can_ac_dt;	// [Hdr]の[can_ac_dt_p.can_ac_dt_for_call]を[Hdr_can_ac_dt]としてエイリアス定義。
	public MCDateField Hdr_ac_dt_after_srch;	// [Hdr]の[can_ac_dt_p.ac_dt_after_srch]を[Hdr_ac_dt_after_srch]としてエイリアス定義。
	public MCLabel Hdr_bill_basis_dt_Label = null;
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDateField Hdr_bill_basis_dt = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H Hdr_usr_dpt_p_PPanel;
	public MCTextField Hdr_usr_cd;	// [Hdr]の[usr_dpt_p.usr_cd]を[Hdr_usr_cd]としてエイリアス定義。
	public MCTextField Hdr_usr_nm;	// [Hdr]の[usr_dpt_p.usr_nm]を[Hdr_usr_nm]としてエイリアス定義。
	public MCTextComboBox Hdr_dpt_cd;	// [Hdr]の[usr_dpt_p.dpt_cd]を[Hdr_dpt_cd]としてエイリアス定義。
	public MCTextField Hdr_dpt_nm;	// [Hdr]の[usr_dpt_p.dpt_nm]を[Hdr_dpt_nm]としてエイリアス定義。
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
	/**
	 * Default account cd. デフォルト口座ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_def_bank_ac_cd = null;
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
	 * Payment received type 入金区分.<p>
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
	 * AR settlement type 2 債権決済区分２.<p>
	 *
	 */
	public MCTextField Rcv_ar_sttl_typ2 = null;
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
	 * Sales flg. 売上ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Rcv_purc_flg = null;
	/**
	 * Purchase flg. 仕入ＦＬＧ.<p>
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
	public MCLabel Rcv_debt_cred_id_typ_Label = null;
	/**
	 * Debtor identification type 借方先識別区分.<p>
	 *
	 */
	public MCTextComboBox Rcv_debt_cred_id_typ = null;
	/**
	 * Debtor identification type name 借方先識別区分名.<p>
	 *
	 */
	public MCTextField Rcv_debt_cred_id_typ_nm = null;
	/**
	 * Debtor cd. 借方先ＣＤ.<p>
	 *
	 */
	public MCTextField Rcv_debt_cred_id_cd = null;
	/**
	 * Debtor name 借方先名.<p>
	 *
	 */
	public MCTextField Rcv_debt_cred_nm = null;
	public MCLabel Rcv_bd_dpt_cd_Label = null;
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public MCTextField Rcv_bd_dpt_cd = null;
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public MCTextField Rcv_bd_dpt_nm = null;
	public MCLabel Rcv_rcv_dat_typ_Label = null;
	/**
	 * Payment received info. type 入金情報区分.<p>
	 *
	 */
	public MCTextField Rcv_rcv_dat_typ = null;
	/**
	 * Payment received info. type name 入金情報区分名.<p>
	 *
	 */
	public MCTextField Rcv_rcv_dat_typ_nm = null;
	public MCLabel Rcv_adv_trd_cd_Label = null;
	/**
	 * Advance/suspense received corresponding transaction 前受仮受対応取引.<p>
	 *
	 */
	public MCTextField Rcv_adv_trd_cd = null;
	/**
	 * Advance/suspense received corresponding transaction name 前受仮受対応取引名.<p>
	 *
	 */
	public MCTextField Rcv_adv_trd_nm = null;
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
	public MCTextComboBox Rcv_note_typ = null;
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
	 * Drawing bank 振出銀行.<p>
	 *
	 */
	public MCTextComboBox Rcv_draw_bank_cd = null;
	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public MCTextField Rcv_draw_bank_nm = null;
	public MCLabel Rcv_draw_branch_cd_Label = null;
	/**
	 * Drawing branch 振出支店.<p>
	 *
	 */
	public MCTextComboBox Rcv_draw_branch_cd = null;
	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public MCTextField Rcv_draw_branch_nm = null;
	public MCLabel Rcv_note_rsn_cd_Label = null;
	/**
	 * Note reason 手形理由.<p>
	 *
	 */
	public MCTextComboBox Rcv_note_rsn_cd = null;
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
	public MCLabel Rcv_setoff_rcv_no_Label = null;
	/**
	 * Offset payment received No. 相殺入金ＮＯ.<p>
	 *
	 */
	public MCTextField Rcv_setoff_rcv_no = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Rcv_setoff_srch = null;
	public MCLabel Rcv_setoff_dt_Label = null;
	/**
	 * Offset date 相殺日.<p>
	 *
	 */
	public MCDateField Rcv_setoff_dt = null;
	public MCLabel Rcv_setoff_bcst_cd_Label = null;
	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public MCTextField Rcv_setoff_bcst_cd = null;
	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public MCTextField Rcv_setoff_bcst_nm = null;
	public MCLabel Rcv_setoff_trd_cur_cd_Label = null;
	/**
	 * Offset currency cd. 相殺通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rcv_setoff_trd_cur_cd = null;
	/**
	 * Offset currency name 相殺通貨名.<p>
	 *
	 */
	public MCTextField Rcv_setoff_trd_cur_nm = null;
	public mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H Rcv_setoff_xrate_p_PPanel;
	public MCNumberField Rcv_setoff_xrate;	// [Rcv]の[setoff_xrate_p.xrate]を[Rcv_setoff_xrate]としてエイリアス定義。
	/**
	 * Offset exchange rate cd. 相殺為替レートＣＤ.<p>
	 *
	 */
	public MCTextField Rcv_setoff_xrate_cd = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Rcv_setoff_rcv_amt_p_PPanel;
	public MCNumberField Rcv_setoff_rcv_amt;	// [Rcv]の[setoff_rcv_amt_p.amt]を[Rcv_setoff_rcv_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Rcv_setoff_not_proc_bal_p_PPanel;
	public MCNumberField Rcv_setoff_not_proc_bal;	// [Rcv]の[setoff_not_proc_bal_p.amt]を[Rcv_setoff_not_proc_bal]としてエイリアス定義。
	public MCLabel Rcv_setoff_sttl_cd1_Label = null;
	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rcv_setoff_sttl_cd1 = null;
	/**
	 * Offset AR settlement type 相殺債権決済区分.<p>
	 *
	 */
	public MCTextField Rcv_setoff_sttl_typ1 = null;
	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public MCTextField Rcv_setoff_sttl_nm1 = null;
	/**
	 * Offset sales purchase tax type 相殺売上仕入税区分.<p>
	 *
	 */
	public MCTextField Rcv_setoff_sls_purc_typ = null;
	/**
	 * Offset sales flg. 相殺売上ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Rcv_setoff_purc_flg = null;
	/**
	 * Offset purchase flg. 相殺仕入ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Rcv_setoff_sls_flg = null;
	/**
	 * Offset tax cd. 相殺税ＣＤ.<p>
	 *
	 */
	public MCTextField Rcv_setoff_tax_cd_sub = null;
	public MCLabel Rcv_setoff_tax_cd_Label = null;
	/**
	 * Offset tax cd. 相殺税ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rcv_setoff_tax_cd = null;
	/**
	 * Offset tax name 相殺税名.<p>
	 *
	 */
	public MCTextField Rcv_setoff_tax_nm = null;
	public MCLabel Rcv_setoff_tax_rate_Label = null;
	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public MCNumberField Rcv_setoff_tax_rate = null;
	public MCLabel Rcv_setoff_debt_cred_id_typ_Label = null;
	/**
	 * Offset debtor identification type 相殺借方先識別区分.<p>
	 *
	 */
	public MCTextComboBox Rcv_setoff_debt_cred_id_typ = null;
	/**
	 * Offset debtor identification type name 相殺借方先識別区分名.<p>
	 *
	 */
	public MCTextField Rcv_setoff_debt_cred_id_typ_nm = null;
	/**
	 * Offset debtor cd. 相殺借方先ＣＤ.<p>
	 *
	 */
	public MCTextField Rcv_setoff_debt_cred_id_cd = null;
	/**
	 * Offset debtor name 相殺借方先名.<p>
	 *
	 */
	public MCTextField Rcv_setoff_debt_cred_nm = null;
	public MCLabel Rcv_setoff_bd_dpt_cd_Label = null;
	/**
	 * Offset charged dept. cd. 相殺負担部門ＣＤ.<p>
	 *
	 */
	public MCTextField Rcv_setoff_bd_dpt_cd = null;
	/**
	 * Offset charged dept. name 相殺負担部門名.<p>
	 *
	 */
	public MCTextField Rcv_setoff_bd_dpt_nm = null;
	public MCLabel Rcv_setoff_rcv_dat_typ_Label = null;
	/**
	 * Offset payment received info. type 相殺入金情報区分.<p>
	 *
	 */
	public MCTextField Rcv_setoff_rcv_dat_typ = null;
	/**
	 * Offset payment received info. type name 相殺入金情報区分名.<p>
	 *
	 */
	public MCTextField Rcv_setoff_rcv_dat_typ_nm = null;
	public MCLabel Rcv_setoff_trd_rmrks_Label = null;
	/**
	 * Offsetting transaction remarks 相殺取引備考.<p>
	 *
	 */
	public MCTextField Rcv_setoff_trd_rmrks = null;
	public MCLabel Rcv_setoff_sub_char1_Label = null;
	/**
	 * Offset spare 1 相殺予備１.<p>
	 *
	 */
	public MCTextField Rcv_setoff_sub_char1 = null;
	public MCLabel Rcv_setoff_sub_char2_Label = null;
	/**
	 * Offset spare 2 相殺予備２.<p>
	 *
	 */
	public MCTextField Rcv_setoff_sub_char2 = null;
	public MCLabel Rcv_setoff_sub_char3_Label = null;
	/**
	 * Offset spare 3 相殺予備３.<p>
	 *
	 */
	public MCTextField Rcv_setoff_sub_char3 = null;
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
	// [Note]ブロック関連のField定義
	public MCPanel NotePanel = null;
	// [Note]ブロックの項目のField定義
	// [Setoff]ブロック関連のField定義
	public MCPanel SetoffPanel = null;
	// [Setoff]ブロックの項目のField定義
	// [DtlCnd]ブロック関連のField定義
	public MCPanel DtlCndPanel = null;
	public MCTitledBorder DtlCndTitledBorder = null;
	// [DtlCnd]ブロックの項目のField定義
	/**
	 * Filter by payment received method 入金方法で絞り込む.<p>
	 *
	 */
	public MCCheckBox DtlCnd_narrow_down_flg = null;
	/**
	 * Include unbilled 未請求含む.<p>
	 *
	 */
	public MCCheckBox DtlCnd_not_bill_flg = null;
	/**
	 * Include reconciled details 消込済明細含む.<p>
	 *
	 */
	public MCCheckBox DtlCnd_incl_appl_flg = null;
	/**
	 * Display zero ０表示.<p>
	 *
	 */
	public MCCheckBox DtlCnd_zero_flg = null;
	/**
	 * Include other sales orders 他の受注含む.<p>
	 *
	 */
	public MCCheckBox DtlCnd_slo_flg = null;
	public MCLabel DtlCnd_rcv_schd_dt_Label = null;
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDateField DtlCnd_rcv_schd_dt = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton DtlCnd_srch = null;
	// [Total]ブロック関連のField定義
	public MCPanel TotalPanel = null;
	public MCTitledBorder TotalTitledBorder = null;
	// [Total]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Total_total_rcv_amt_p_PPanel;
	public MCNumberField Total_total_rcv_amt;	// [Total]の[total_rcv_amt_p.amt]を[Total_total_rcv_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Total_total_setoff_rcv_amt_p_PPanel;
	public MCNumberField Total_total_setoff_rcv_amt;	// [Total]の[total_setoff_rcv_amt_p.amt]を[Total_total_setoff_rcv_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Total_total_setoff_rcv_amt2_p_PPanel;
	public MCNumberField Total_total_setoff_rcv_amt2;	// [Total]の[total_setoff_rcv_amt2_p.amt]を[Total_total_setoff_rcv_amt2]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Total_total_appl_amt_p_PPanel;
	public MCNumberField Total_total_appl_amt;	// [Total]の[total_appl_amt_p.amt]を[Total_total_appl_amt]としてエイリアス定義。
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0210.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Reconcile 消込.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_appl_tgt_amt_p_PPanel;
	public MCColumnConfig columnDtl_appl_tgt_amt;// [Dtl]の[appl_tgt_amt_p.amt]を[columnDtl_appl_tgt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_appl_ttl_amt_p_PPanel;
	public MCColumnConfig columnDtl_appl_ttl_amt;// [Dtl]の[appl_ttl_amt_p.amt]を[columnDtl_appl_ttl_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_amt1_p_PPanel;
	public MCColumnConfig columnDtl_amt1;// [Dtl]の[amt1_p.amt]を[columnDtl_amt1]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_amt2_p_PPanel;
	public MCColumnConfig columnDtl_amt2;// [Dtl]の[amt2_p.amt]を[columnDtl_amt2]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_amt4_p_PPanel;
	public MCColumnConfig columnDtl_amt4;// [Dtl]の[amt4_p.amt]を[columnDtl_amt4]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_not_appl_bal_p_PPanel;
	public MCColumnConfig columnDtl_not_appl_bal;// [Dtl]の[not_appl_bal_p.amt]を[columnDtl_not_appl_bal]としてエイリアス定義。
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcv_schd_dt = null;
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_sttl_cd1 = null;
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_sttl_nm1 = null;
	/**
	 * AR settlement type 債権決済区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_sttl_typ1 = null;
	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_no = null;
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wrk_no = null;
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wrk_nm = null;
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_acst_cd = null;
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_acst_nm = null;
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_dpt_cd = null;
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_dpt_nm = null;
	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_cd = null;
	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_nm = null;
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_typ = null;
	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_typ_nm = null;
	/**
	 * Billing closing month 請求締年月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_ym = null;
	/**
	 * Billing closing day 請求締日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_cl_day = null;
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_no = null;
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bcst_cd = null;
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bcst_nm = null;
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_dpt_cd = null;
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_dpt_nm = null;
	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_d_rmrks = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Btn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Btn_deselect_all = null;
	/**
	 * AR details reconciliation 売掛明細消込.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0220 = null;
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
	/** [INS_SRCH_RCV]モードを表す定数 */
	public static final String INS_SRCH_RCV = "INS_SRCH_RCV";
	/** [INS_REF_RCV]モードを表す定数 */
	public static final String INS_REF_RCV = "INS_REF_RCV";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [UPD_SRCH_RCV]モードを表す定数 */
	public static final String UPD_SRCH_RCV = "UPD_SRCH_RCV";
	/** [UPD_REF_RCV]モードを表す定数 */
	public static final String UPD_REF_RCV = "UPD_REF_RCV";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [NO_SLIP_CD]モードを表す定数 */
	public static final String NO_SLIP_CD = "NO_SLIP_CD";
	/** [INS_SETOFF]モードを表す定数 */
	public static final String INS_SETOFF = "INS_SETOFF";
	/** [INS_SRCH_RCV_SETOFF]モードを表す定数 */
	public static final String INS_SRCH_RCV_SETOFF = "INS_SRCH_RCV_SETOFF";
	/** [INS_REF_RCV_SETOFF]モードを表す定数 */
	public static final String INS_REF_RCV_SETOFF = "INS_REF_RCV_SETOFF";
	/** [UPD_SETOFF]モードを表す定数 */
	public static final String UPD_SETOFF = "UPD_SETOFF";
	/** [UPD_SRCH_RCV_SETOFF]モードを表す定数 */
	public static final String UPD_SRCH_RCV_SETOFF = "UPD_SRCH_RCV_SETOFF";
	/** [UPD_REF_RCV_SETOFF]モードを表す定数 */
	public static final String UPD_REF_RCV_SETOFF = "UPD_REF_RCV_SETOFF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INS, INS_SRCH_RCV, INS_REF_RCV, SRCH, UPD, UPD_SRCH_RCV, UPD_REF_RCV, FIX_U, FIX_D, FIX_I, DEL, REF, NO_SLIP_CD, INS_SETOFF, INS_SRCH_RCV_SETOFF, INS_REF_RCV_SETOFF, UPD_SETOFF, UPD_SRCH_RCV_SETOFF, UPD_REF_RCV_SETOFF};
	
	/** [MS_MSBGL0210_Srch01]のCallerの作成 */
	protected MSBGP_ArApplReg_MC.MS_MSBGL0210_Srch01Caller createMS_MSBGL0210_Srch01() {
		MSBGP_ArApplReg_MC.MS_MSBGL0210_Srch01Caller<MSBGP_ArApplReg, MS_MSBGL0210_Srch01Bridge>
		caller = ((MSBGP_ArApplReg_MC)this).new MS_MSBGL0210_Srch01Caller<MSBGP_ArApplReg, MS_MSBGL0210_Srch01Bridge>(
					(MSBGP_ArApplReg)this, new MS_MSBGL0210_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBGL0210_Srch01]の呼び出し */
	protected void callMS_MSBGL0210_Srch01() {
		MCCaller caller = createMS_MSBGL0210_Srch01();
		caller.exec();
	}
	/** [MS_MSBGL0210_Srch02]のCallerの作成 */
	protected MSBGP_ArApplReg_MC.MS_MSBGL0210_Srch02Caller createMS_MSBGL0210_Srch02() {
		MSBGP_ArApplReg_MC.MS_MSBGL0210_Srch02Caller<MSBGP_ArApplReg, MS_MSBGL0210_Srch02Bridge>
		caller = ((MSBGP_ArApplReg_MC)this).new MS_MSBGL0210_Srch02Caller<MSBGP_ArApplReg, MS_MSBGL0210_Srch02Bridge>(
					(MSBGP_ArApplReg)this, new MS_MSBGL0210_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBGL0210_Srch02]の呼び出し */
	protected void callMS_MSBGL0210_Srch02() {
		MCCaller caller = createMS_MSBGL0210_Srch02();
		caller.exec();
	}
	/** [MS_MSBGL0210_Srch03]のCallerの作成 */
	protected MSBGP_ArApplReg_MC.MS_MSBGL0210_Srch03Caller createMS_MSBGL0210_Srch03() {
		MSBGP_ArApplReg_MC.MS_MSBGL0210_Srch03Caller<MSBGP_ArApplReg, MS_MSBGL0210_Srch03Bridge>
		caller = ((MSBGP_ArApplReg_MC)this).new MS_MSBGL0210_Srch03Caller<MSBGP_ArApplReg, MS_MSBGL0210_Srch03Bridge>(
					(MSBGP_ArApplReg)this, new MS_MSBGL0210_Srch03Bridge());
		return caller;
	}
	/** [MS_MSBGL0210_Srch03]の呼び出し */
	protected void callMS_MSBGL0210_Srch03() {
		MCCaller caller = createMS_MSBGL0210_Srch03();
		caller.exec();
	}
	/** [MS_MSBGL0210_Srch04]のCallerの作成 */
	protected MSBGP_ArApplReg_MC.MS_MSBGL0210_Srch04Caller createMS_MSBGL0210_Srch04() {
		MSBGP_ArApplReg_MC.MS_MSBGL0210_Srch04Caller<MSBGP_ArApplReg, MS_MSBGL0210_Srch04Bridge>
		caller = ((MSBGP_ArApplReg_MC)this).new MS_MSBGL0210_Srch04Caller<MSBGP_ArApplReg, MS_MSBGL0210_Srch04Bridge>(
					(MSBGP_ArApplReg)this, new MS_MSBGL0210_Srch04Bridge());
		return caller;
	}
	/** [MS_MSBGL0210_Srch04]の呼び出し */
	protected void callMS_MSBGL0210_Srch04() {
		MCCaller caller = createMS_MSBGL0210_Srch04();
		caller.exec();
	}
	/** [MS_MSBGL0210_Ins01]のCallerの作成 */
	protected MSBGP_ArApplReg_MC.MS_MSBGL0210_Ins01Caller createMS_MSBGL0210_Ins01() {
		MSBGP_ArApplReg_MC.MS_MSBGL0210_Ins01Caller<MSBGP_ArApplReg, MS_MSBGL0210_Ins01Bridge>
		caller = ((MSBGP_ArApplReg_MC)this).new MS_MSBGL0210_Ins01Caller<MSBGP_ArApplReg, MS_MSBGL0210_Ins01Bridge>(
					(MSBGP_ArApplReg)this, new MS_MSBGL0210_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBGL0210_Ins01]の呼び出し */
	protected void callMS_MSBGL0210_Ins01() {
		MCCaller caller = createMS_MSBGL0210_Ins01();
		caller.exec();
	}
	/** [MS_MSBGL0210_Upd01]のCallerの作成 */
	protected MSBGP_ArApplReg_MC.MS_MSBGL0210_Upd01Caller createMS_MSBGL0210_Upd01() {
		MSBGP_ArApplReg_MC.MS_MSBGL0210_Upd01Caller<MSBGP_ArApplReg, MS_MSBGL0210_Upd01Bridge>
		caller = ((MSBGP_ArApplReg_MC)this).new MS_MSBGL0210_Upd01Caller<MSBGP_ArApplReg, MS_MSBGL0210_Upd01Bridge>(
					(MSBGP_ArApplReg)this, new MS_MSBGL0210_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBGL0210_Upd01]の呼び出し */
	protected void callMS_MSBGL0210_Upd01() {
		MCCaller caller = createMS_MSBGL0210_Upd01();
		caller.exec();
	}
	/** [MS_MSBGL0210_Del01]のCallerの作成 */
	protected MSBGP_ArApplReg_MC.MS_MSBGL0210_Del01Caller createMS_MSBGL0210_Del01() {
		MSBGP_ArApplReg_MC.MS_MSBGL0210_Del01Caller<MSBGP_ArApplReg, MS_MSBGL0210_Del01Bridge>
		caller = ((MSBGP_ArApplReg_MC)this).new MS_MSBGL0210_Del01Caller<MSBGP_ArApplReg, MS_MSBGL0210_Del01Bridge>(
					(MSBGP_ArApplReg)this, new MS_MSBGL0210_Del01Bridge());
		return caller;
	}
	/** [MS_MSBGL0210_Del01]の呼び出し */
	protected void callMS_MSBGL0210_Del01() {
		MCCaller caller = createMS_MSBGL0210_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0210.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0210.HdrR aHdrR;
	/** [Rcv]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0210.RcvR aRcvR;
	/** [DtlCnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0210.DtlCndR aDtlCndR;
	/** [Total]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0210.TotalR aTotalR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0210.DtlR> aDtlL;
	/** [BillD]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0210.BillDR> aBillDL;
	/** [Srch_Cnd]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0210.Srch_CndR> aSrch_CndL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBG.MSBGP0210.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0210.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0210.CndR createCndR() {
		return mcframe.clientMSBG.MSBGP0210.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBG.MSBGP0210.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBG.MSBGP0210.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBG.MSBGP0210.HdrR createHdrR() {
		return mcframe.clientMSBG.MSBGP0210.HdrR.create();
	}

	/**
	 * 項目コピーによってaRcvRを設定します。
	 *
	 * aRcvRのインスタンスは変更されません。
	 *
	 * @param row RcvR
	 */
	public void setRcvR(mcframe.clientMSBG.MSBGP0210.RcvR row) {
		if (row != null) {
			MCRow.copyall(getRcvR(), row);
		}
	}

	/**
	 * [Rcv]ブロックのコンテナaRcvRを返します。
	 *
	 * @return RcvR
	 */
	public mcframe.clientMSBG.MSBGP0210.RcvR getRcvR() {
		return aRcvR;
	}

	/**
	 * aRcvRを作成します。
	 *
	 * @return RcvR
	 */
	public mcframe.clientMSBG.MSBGP0210.RcvR createRcvR() {
		return mcframe.clientMSBG.MSBGP0210.RcvR.create();
	}

	/**
	 * 項目コピーによってaDtlCndRを設定します。
	 *
	 * aDtlCndRのインスタンスは変更されません。
	 *
	 * @param row DtlCndR
	 */
	public void setDtlCndR(mcframe.clientMSBG.MSBGP0210.DtlCndR row) {
		if (row != null) {
			MCRow.copyall(getDtlCndR(), row);
		}
	}

	/**
	 * [DtlCnd]ブロックのコンテナaDtlCndRを返します。
	 *
	 * @return DtlCndR
	 */
	public mcframe.clientMSBG.MSBGP0210.DtlCndR getDtlCndR() {
		return aDtlCndR;
	}

	/**
	 * aDtlCndRを作成します。
	 *
	 * @return DtlCndR
	 */
	public mcframe.clientMSBG.MSBGP0210.DtlCndR createDtlCndR() {
		return mcframe.clientMSBG.MSBGP0210.DtlCndR.create();
	}

	/**
	 * 項目コピーによってaTotalRを設定します。
	 *
	 * aTotalRのインスタンスは変更されません。
	 *
	 * @param row TotalR
	 */
	public void setTotalR(mcframe.clientMSBG.MSBGP0210.TotalR row) {
		if (row != null) {
			MCRow.copyall(getTotalR(), row);
		}
	}

	/**
	 * [Total]ブロックのコンテナaTotalRを返します。
	 *
	 * @return TotalR
	 */
	public mcframe.clientMSBG.MSBGP0210.TotalR getTotalR() {
		return aTotalR;
	}

	/**
	 * aTotalRを作成します。
	 *
	 * @return TotalR
	 */
	public mcframe.clientMSBG.MSBGP0210.TotalR createTotalR() {
		return mcframe.clientMSBG.MSBGP0210.TotalR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBG.MSBGP0210.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0210.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBG.MSBGP0210.DtlR createDtlR() {
		return mcframe.clientMSBG.MSBGP0210.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0210.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0210.DtlR.class);
	}

	/**
	 * DtlTableを初期化します。
	 */
	protected void createDtlTable(){
		if(DtlTable == null){
			DtlTable = beansFactory.createTable2("Dtl.table");
		}
	}

	/**
	 * コピーによってaBillDLを設定します。
	 *
	 * aBillDLのインスタンスは変更されません。
	 *
	 * @param dataset BillDL
	 */
	public void setBillDL(MCList<mcframe.clientMSBG.MSBGP0210.BillDR> aList) {
		if (getBillDL() != aList) {
			getBillDL().setAll(aList);
		}
	}

	/**
	 * [BillD]ブロックのコンテナaBillDLを返します。
	 *
	 * @return BillDL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0210.BillDR> getBillDL() {
		return aBillDL;
	}

	/**
	 * aBillDRを作成します。
	 *
	 * @return BillDR
	 */
	public mcframe.clientMSBG.MSBGP0210.BillDR createBillDR() {
		return mcframe.clientMSBG.MSBGP0210.BillDR.create();
	}

	/**
	 * aBillDLを作成します。
	 *
	 * @return BillDL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0210.BillDR> createBillDL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0210.BillDR.class);
	}

	/**
	 * コピーによってaSrch_CndLを設定します。
	 *
	 * aSrch_CndLのインスタンスは変更されません。
	 *
	 * @param dataset Srch_CndL
	 */
	public void setSrch_CndL(MCList<mcframe.clientMSBG.MSBGP0210.Srch_CndR> aList) {
		if (getSrch_CndL() != aList) {
			getSrch_CndL().setAll(aList);
		}
	}

	/**
	 * [Srch_Cnd]ブロックのコンテナaSrch_CndLを返します。
	 *
	 * @return Srch_CndL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0210.Srch_CndR> getSrch_CndL() {
		return aSrch_CndL;
	}

	/**
	 * aSrch_CndRを作成します。
	 *
	 * @return Srch_CndR
	 */
	public mcframe.clientMSBG.MSBGP0210.Srch_CndR createSrch_CndR() {
		return mcframe.clientMSBG.MSBGP0210.Srch_CndR.create();
	}

	/**
	 * aSrch_CndLを作成します。
	 *
	 * @return Srch_CndL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0210.Srch_CndR> createSrch_CndL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0210.Srch_CndR.class);
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
		if(!MCCollectionUtil.contains(ret, getDtlCndR())) ret.add(getDtlCndR());
		if(!MCCollectionUtil.contains(ret, getTotalR())) ret.add(getTotalR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getBillDL())) ret.add(getBillDL());
		if(!MCCollectionUtil.contains(ret, getSrch_CndL())) ret.add(getSrch_CndL());
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
		if(aCnt == getDtlCndR()) return "DtlCnd";
		if(aCnt == getTotalR()) return "Total";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getBillDL()) return "BillD";
		if(aCnt == getSrch_CndL()) return "Srch_Cnd";
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
		if(bId.equals("DtlCnd")) return getDtlCndR();
		if(bId.equals("Total")) return getTotalR();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("BillD")) return getBillDL();
		if(bId.equals("Srch_Cnd")) return getSrch_CndL();
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
		ret.add(DtlCndPanel);
		ret.add(TotalPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_ArApplReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aRcvR = createRcvR();
		aDtlCndR = createDtlCndR();
		aTotalR = createTotalR();
		aDtlL = createDtlL();
		aBillDL = createBillDL();
		aSrch_CndL = createSrch_CndL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBGP_ArApplReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aRcvR = createRcvR();
		aDtlCndR = createDtlCndR();
		aTotalR = createTotalR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aBillDL = createBillDL();
		aSrch_CndL = createSrch_CndL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBGP_ArApplReg_MC.jbCreateScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbCreateCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbCreateHdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbCreateHdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbCreateSys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbCreateRcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbCreateRcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbCreateNote((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbCreateSetoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbCreateDtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbCreateTotal((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbCreateDtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbCreateBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbCreateEastBtn((MSBGP_ArApplReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBGP_ArApplReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBGP_ArApplReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBGP_ArApplReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBGP_ArApplReg p) {
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
	protected static void jbCreateSys(MSBGP_ArApplReg p) {
	}

	/**
	 * [RcvTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRcvTab(MSBGP_ArApplReg p) {
	}

	/**
	 * [Rcv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRcv(MSBGP_ArApplReg p) {
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
		p.Rcv_setoff_xrate_p_PPanel = mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.create(p.getRcvR().setoff_xrate_p());
		p.Rcv_setoff_xrate_p_PPanel.setName("Rcv.setoff_xrate_p");
		p.Rcv_setoff_xrate = p.Rcv_setoff_xrate_p_PPanel.Xrate_xrate;
		p.Rcv_setoff_xrate.addAliasName("Rcv.setoff_xrate", p);
		p.Rcv_setoff_rcv_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getRcvR().setoff_rcv_amt_p());
		p.Rcv_setoff_rcv_amt_p_PPanel.setName("Rcv.setoff_rcv_amt_p");
		p.Rcv_setoff_rcv_amt = p.Rcv_setoff_rcv_amt_p_PPanel.Amt_amt;
		p.Rcv_setoff_rcv_amt.addAliasName("Rcv.setoff_rcv_amt", p);
		p.Rcv_setoff_not_proc_bal_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getRcvR().setoff_not_proc_bal_p());
		p.Rcv_setoff_not_proc_bal_p_PPanel.setName("Rcv.setoff_not_proc_bal_p");
		p.Rcv_setoff_not_proc_bal = p.Rcv_setoff_not_proc_bal_p_PPanel.Amt_amt;
		p.Rcv_setoff_not_proc_bal.addAliasName("Rcv.setoff_not_proc_bal", p);
	}

	/**
	 * [Note]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateNote(MSBGP_ArApplReg p) {
	}

	/**
	 * [Setoff]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSetoff(MSBGP_ArApplReg p) {
	}

	/**
	 * [DtlCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlCnd(MSBGP_ArApplReg p) {
	}

	/**
	 * [Total]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTotal(MSBGP_ArApplReg p) {
		p.Total_total_rcv_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getTotalR().total_rcv_amt_p());
		p.Total_total_rcv_amt_p_PPanel.setName("Total.total_rcv_amt_p");
		p.Total_total_rcv_amt = p.Total_total_rcv_amt_p_PPanel.Amt_amt;
		p.Total_total_rcv_amt.addAliasName("Total.total_rcv_amt", p);
		p.Total_total_setoff_rcv_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getTotalR().total_setoff_rcv_amt_p());
		p.Total_total_setoff_rcv_amt_p_PPanel.setName("Total.total_setoff_rcv_amt_p");
		p.Total_total_setoff_rcv_amt = p.Total_total_setoff_rcv_amt_p_PPanel.Amt_amt;
		p.Total_total_setoff_rcv_amt.addAliasName("Total.total_setoff_rcv_amt", p);
		p.Total_total_setoff_rcv_amt2_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getTotalR().total_setoff_rcv_amt2_p());
		p.Total_total_setoff_rcv_amt2_p_PPanel.setName("Total.total_setoff_rcv_amt2_p");
		p.Total_total_setoff_rcv_amt2 = p.Total_total_setoff_rcv_amt2_p_PPanel.Amt_amt;
		p.Total_total_setoff_rcv_amt2.addAliasName("Total.total_setoff_rcv_amt2", p);
		p.Total_total_appl_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getTotalR().total_appl_amt_p());
		p.Total_total_appl_amt_p_PPanel.setName("Total.total_appl_amt_p");
		p.Total_total_appl_amt = p.Total_total_appl_amt_p_PPanel.Amt_amt;
		p.Total_total_appl_amt.addAliasName("Total.total_appl_amt", p);
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBGP_ArApplReg p) {
		p.Dtl_appl_tgt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0210.DtlR.$appl_tgt_amt_p);
		p.Dtl_appl_tgt_amt_p_PPanel.setName("Dtl.appl_tgt_amt_p");
		p.columnDtl_appl_tgt_amt = p.Dtl_appl_tgt_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_appl_tgt_amt.addAliasName("Dtl.appl_tgt_amt", p);
		p.Dtl_appl_ttl_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0210.DtlR.$appl_ttl_amt_p);
		p.Dtl_appl_ttl_amt_p_PPanel.setName("Dtl.appl_ttl_amt_p");
		p.columnDtl_appl_ttl_amt = p.Dtl_appl_ttl_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_appl_ttl_amt.addAliasName("Dtl.appl_ttl_amt", p);
		p.Dtl_amt1_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0210.DtlR.$amt1_p);
		p.Dtl_amt1_p_PPanel.setName("Dtl.amt1_p");
		p.columnDtl_amt1 = p.Dtl_amt1_p_PPanel.columnAmt_amt;
		p.columnDtl_amt1.addAliasName("Dtl.amt1", p);
		p.Dtl_amt2_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0210.DtlR.$amt2_p);
		p.Dtl_amt2_p_PPanel.setName("Dtl.amt2_p");
		p.columnDtl_amt2 = p.Dtl_amt2_p_PPanel.columnAmt_amt;
		p.columnDtl_amt2.addAliasName("Dtl.amt2", p);
		p.Dtl_amt4_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0210.DtlR.$amt4_p);
		p.Dtl_amt4_p_PPanel.setName("Dtl.amt4_p");
		p.columnDtl_amt4 = p.Dtl_amt4_p_PPanel.columnAmt_amt;
		p.columnDtl_amt4.addAliasName("Dtl.amt4", p);
		p.Dtl_not_appl_bal_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0210.DtlR.$not_appl_bal_p);
		p.Dtl_not_appl_bal_p_PPanel.setName("Dtl.not_appl_bal_p");
		p.columnDtl_not_appl_bal = p.Dtl_not_appl_bal_p_PPanel.columnAmt_amt;
		p.columnDtl_not_appl_bal.addAliasName("Dtl.not_appl_bal", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBGP_ArApplReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBGP_ArApplReg p) {
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
			Hdr_trd_cd_p = createHdr_trd_cd_ListPutter(Hdr_trd_cd, "trd_cd", "trd_nm","trd_ptn_typ","ar_trd_grp_typ");

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
			Rcv_bcst_cd_p = createRcv_bcst_cd_ListPutter(Rcv_bcst_cd, "bcst_cd", "bcst_nm");

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
			Rcv_trd_cur_cd_p = createRcv_trd_cur_cd_ListPutter(Rcv_trd_cur_cd, "trd_cur_cd", "trd_cur_nm","amt_dec_place");

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
			Rcv_ar_sttl_cd2_p = createRcv_ar_sttl_cd2_ListPutter(Rcv_ar_sttl_cd2, "ar_sttl_cd2", "ar_sttl_nm2","sls_purc_typ2","ar_sttl_typ2","debt_cred_id_typ","tax_cd_sub");

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
	
	
	/** [Rcv_debt_cred_id_typ_ListPutter]の定義 */
	private MCListPutter Rcv_debt_cred_id_typ_p = null;

	/**
	 * [Rcv_debt_cred_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getRcv_debt_cred_id_typ_ListPutter() {
		if (Rcv_debt_cred_id_typ_p == null) {
			Rcv_debt_cred_id_typ_p = createRcv_debt_cred_id_typ_ListPutter(Rcv_debt_cred_id_typ, "debt_cred_id_typ", "debt_cred_id_typ_nm");

		}
		return Rcv_debt_cred_id_typ_p;
	}
	
	
	/** [Rcv_debt_cred_id_cd_ListPutter]の定義 */
	private MCListPutter Rcv_debt_cred_id_cd_p = null;

	/**
	 * [Rcv_debt_cred_id_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcv_debt_cred_id_cd_ListPutter() {
		if (Rcv_debt_cred_id_cd_p == null) {
			Rcv_debt_cred_id_cd_p = createRcv_debt_cred_id_cd_ListPutter(Rcv_debt_cred_id_cd, "debt_cred_id_cd", "debt_cred_nm");

		}
		return Rcv_debt_cred_id_cd_p;
	}
	
	
	/** [Rcv_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rcv_bd_dpt_cd_p = null;

	/**
	 * [Rcv_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcv_bd_dpt_cd_ListPutter() {
		if (Rcv_bd_dpt_cd_p == null) {
			Rcv_bd_dpt_cd_p = createRcv_bd_dpt_cd_ListPutter(Rcv_bd_dpt_cd, "bd_dpt_cd", "bd_dpt_nm");

		}
		return Rcv_bd_dpt_cd_p;
	}
	
	
	/** [Rcv_note_typ_ListPutter]の定義 */
	private MCListPutter Rcv_note_typ_p = null;

	/**
	 * [Rcv_note_typ_ListPutter]の取得
	 */
	protected MCListPutter getRcv_note_typ_ListPutter() {
		if (Rcv_note_typ_p == null) {
			Rcv_note_typ_p = createRcv_note_typ_ListPutter(Rcv_note_typ, "note_typ", "note_typ_nm");

		}
		return Rcv_note_typ_p;
	}
	
	
	/** [Rcv_draw_bank_cd_ListPutter]の定義 */
	private MCListPutter Rcv_draw_bank_cd_p = null;

	/**
	 * [Rcv_draw_bank_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcv_draw_bank_cd_ListPutter() {
		if (Rcv_draw_bank_cd_p == null) {
			Rcv_draw_bank_cd_p = createRcv_draw_bank_cd_ListPutter(Rcv_draw_bank_cd, "draw_bank_cd", "draw_bank_nm");

		}
		return Rcv_draw_bank_cd_p;
	}
	
	
	/** [Rcv_draw_branch_cd_ListPutter]の定義 */
	private MCListPutter Rcv_draw_branch_cd_p = null;

	/**
	 * [Rcv_draw_branch_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcv_draw_branch_cd_ListPutter() {
		if (Rcv_draw_branch_cd_p == null) {
			Rcv_draw_branch_cd_p = createRcv_draw_branch_cd_ListPutter(Rcv_draw_branch_cd, "draw_branch_cd", "draw_branch_nm");

		}
		return Rcv_draw_branch_cd_p;
	}
	
	
	/** [Rcv_note_rsn_cd_ListPutter]の定義 */
	private MCListPutter Rcv_note_rsn_cd_p = null;

	/**
	 * [Rcv_note_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcv_note_rsn_cd_ListPutter() {
		if (Rcv_note_rsn_cd_p == null) {
			Rcv_note_rsn_cd_p = createRcv_note_rsn_cd_ListPutter(Rcv_note_rsn_cd, "note_rsn_cd", "note_rsn_nm");

		}
		return Rcv_note_rsn_cd_p;
	}
	
	
	/** [Rcv_setoff_bcst_cd_ListPutter]の定義 */
	private MCListPutter Rcv_setoff_bcst_cd_p = null;

	/**
	 * [Rcv_setoff_bcst_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcv_setoff_bcst_cd_ListPutter() {
		if (Rcv_setoff_bcst_cd_p == null) {
			Rcv_setoff_bcst_cd_p = createRcv_setoff_bcst_cd_ListPutter(Rcv_setoff_bcst_cd, "setoff_bcst_cd", "setoff_bcst_nm");

		}
		return Rcv_setoff_bcst_cd_p;
	}
	
	
	/** [Rcv_setoff_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Rcv_setoff_trd_cur_cd_p = null;

	/**
	 * [Rcv_setoff_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcv_setoff_trd_cur_cd_ListPutter() {
		if (Rcv_setoff_trd_cur_cd_p == null) {
			Rcv_setoff_trd_cur_cd_p = createRcv_setoff_trd_cur_cd_ListPutter(Rcv_setoff_trd_cur_cd, "setoff_trd_cur_cd", "setoff_trd_cur_nm","amt_dec_place");

		}
		return Rcv_setoff_trd_cur_cd_p;
	}
	
	
	/** [Rcv_setoff_sttl_cd1_ListPutter]の定義 */
	private MCListPutter Rcv_setoff_sttl_cd1_p = null;

	/**
	 * [Rcv_setoff_sttl_cd1_ListPutter]の取得
	 */
	protected MCListPutter getRcv_setoff_sttl_cd1_ListPutter() {
		if (Rcv_setoff_sttl_cd1_p == null) {
			Rcv_setoff_sttl_cd1_p = createRcv_setoff_sttl_cd1_ListPutter(Rcv_setoff_sttl_cd1, "setoff_sttl_cd1", "setoff_sttl_nm1","setoff_sls_purc_typ","setoff_sttl_typ1","setoff_debt_cred_id_typ","setoff_tax_cd_sub");

		}
		return Rcv_setoff_sttl_cd1_p;
	}
	
	
	/** [Rcv_setoff_tax_cd_ListPutter]の定義 */
	private MCListPutter Rcv_setoff_tax_cd_p = null;

	/**
	 * [Rcv_setoff_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcv_setoff_tax_cd_ListPutter() {
		if (Rcv_setoff_tax_cd_p == null) {
			Rcv_setoff_tax_cd_p = createRcv_setoff_tax_cd_ListPutter(Rcv_setoff_tax_cd, "setoff_tax_cd", "setoff_tax_nm","setoff_tax_rate");

		}
		return Rcv_setoff_tax_cd_p;
	}
	
	
	/** [Rcv_setoff_debt_cred_id_typ_ListPutter]の定義 */
	private MCListPutter Rcv_setoff_debt_cred_id_typ_p = null;

	/**
	 * [Rcv_setoff_debt_cred_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getRcv_setoff_debt_cred_id_typ_ListPutter() {
		if (Rcv_setoff_debt_cred_id_typ_p == null) {
			Rcv_setoff_debt_cred_id_typ_p = createRcv_setoff_debt_cred_id_typ_ListPutter(Rcv_setoff_debt_cred_id_typ, "setoff_debt_cred_id_typ", "setoff_debt_cred_id_typ_nm");

		}
		return Rcv_setoff_debt_cred_id_typ_p;
	}
	
	
	/** [Rcv_setoff_debt_cred_id_cd_ListPutter]の定義 */
	private MCListPutter Rcv_setoff_debt_cred_id_cd_p = null;

	/**
	 * [Rcv_setoff_debt_cred_id_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcv_setoff_debt_cred_id_cd_ListPutter() {
		if (Rcv_setoff_debt_cred_id_cd_p == null) {
			Rcv_setoff_debt_cred_id_cd_p = createRcv_setoff_debt_cred_id_cd_ListPutter(Rcv_setoff_debt_cred_id_cd, "setoff_debt_cred_id_cd", "setoff_debt_cred_nm");

		}
		return Rcv_setoff_debt_cred_id_cd_p;
	}
	
	
	/** [Rcv_setoff_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rcv_setoff_bd_dpt_cd_p = null;

	/**
	 * [Rcv_setoff_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcv_setoff_bd_dpt_cd_ListPutter() {
		if (Rcv_setoff_bd_dpt_cd_p == null) {
			Rcv_setoff_bd_dpt_cd_p = createRcv_setoff_bd_dpt_cd_ListPutter(Rcv_setoff_bd_dpt_cd, "setoff_bd_dpt_cd", "setoff_bd_dpt_nm");

		}
		return Rcv_setoff_bd_dpt_cd_p;
	}
	
	
	/** [Dtl_ar_typ_ListPutter]の定義 */
	private MCListPutter Dtl_ar_typ_p = null;

	/**
	 * [Dtl_ar_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ar_typ_ListPutter() {
		if (Dtl_ar_typ_p == null) {
			Dtl_ar_typ_p = createDtl_ar_typ_ListPutter(columnDtl_ar_typ, "ar_typ");

		}
		return Dtl_ar_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_ArApplReg create(){
		MSBGP_ArApplReg p = new MSBGP_ArApplReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_ArApplReg create(String name){
		MSBGP_ArApplReg p = new MSBGP_ArApplReg(name);
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
		MSBGP_ArApplReg_MC.jbfInitScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbfInitCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbfInitHdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbfInitHdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbfInitSys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbfInitRcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbfInitRcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbfInitNote((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbfInitSetoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbfInitDtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbfInitTotal((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbfInitDtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbfInitBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbfInitEastBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbInitScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbInitCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbInitHdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbInitHdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbInitSys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbInitRcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbInitRcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbInitNote((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbInitSetoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbInitDtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbInitTotal((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbInitDtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbInitBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.jbInitEastBtn((MSBGP_ArApplReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBGP_ArApplReg p) {
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
	protected static void jbfInitHdrTab(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_trd_cd_Label = p.beansFactory.createLabel("Hdr.trd_cd_Label");
		p.Hdr_trd_cd = p.beansFactory.createTextComboBox("Hdr.trd_cd");
		p.Hdr_trd_cd.setLabel(p.Hdr_trd_cd_Label);
		p.Hdr_trd_ptn_typ = p.beansFactory.createTextField("Hdr.trd_ptn_typ");
		p.Hdr_ar_trd_grp_typ = p.beansFactory.createTextField("Hdr.ar_trd_grp_typ");
		p.Hdr_trd_nm = p.beansFactory.createTextField("Hdr.trd_nm");
		p.Hdr_ac_ym_Label = p.beansFactory.createLabel("Hdr.ac_ym_Label");
		p.Hdr_ac_ym = p.beansFactory.createDateField("Hdr.ac_ym");
		p.Hdr_ac_ym.setLabel(p.Hdr_ac_ym_Label);
		p.Hdr_rcv_act_no_Label = p.beansFactory.createLabel("Hdr.rcv_act_no_Label");
		p.Hdr_rcv_act_no = p.beansFactory.createTextField("Hdr.rcv_act_no");
		p.Hdr_rcv_act_no.setLabel(p.Hdr_rcv_act_no_Label);
		p.Hdr_rcv_act_rev = p.beansFactory.createNumberField("Hdr.rcv_act_rev");
		p.Hdr_latest_flg = p.beansFactory.createCheckBox("Hdr.latest_flg");
		p.Hdr_ac_dt_Label = p.beansFactory.createLabel("Hdr.ac_dt_Label");
		p.Hdr_ac_dt = p.beansFactory.createDateField("Hdr.ac_dt");
		p.Hdr_ac_dt.setLabel(p.Hdr_ac_dt_Label);
		p.Hdr_bill_basis_dt_Label = p.beansFactory.createLabel("Hdr.bill_basis_dt_Label");
		p.Hdr_bill_basis_dt = p.beansFactory.createDateField("Hdr.bill_basis_dt");
		p.Hdr_bill_basis_dt.setLabel(p.Hdr_bill_basis_dt_Label);
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
		p.Hdr_def_bank_ac_cd = p.beansFactory.createTextField("Hdr.def_bank_ac_cd");
	}

	/**
	 * [Sys]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSys(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.SysPanel = p.beansFactory.createPanel("Sys");
		// ブロックの項目の初期化
	}

	/**
	 * [RcvTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRcvTab(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.RcvTabPanel = p.beansFactory.createPanel("RcvTab");
		p.RcvTabTab = p.beansFactory.createTabbedPane("RcvTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Rcv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRcv(MSBGP_ArApplReg p) {
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
		p.Rcv_ar_sttl_typ2 = p.beansFactory.createTextField("Rcv.ar_sttl_typ2");
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
		p.Rcv_debt_cred_id_typ_Label = p.beansFactory.createLabel("Rcv.debt_cred_id_typ_Label");
		p.Rcv_debt_cred_id_typ = p.beansFactory.createTextComboBox("Rcv.debt_cred_id_typ");
		p.Rcv_debt_cred_id_typ.setLabel(p.Rcv_debt_cred_id_typ_Label);
		p.Rcv_debt_cred_id_typ_nm = p.beansFactory.createTextField("Rcv.debt_cred_id_typ_nm");
		p.Rcv_debt_cred_id_cd = p.beansFactory.createTextField("Rcv.debt_cred_id_cd");
		p.Rcv_debt_cred_nm = p.beansFactory.createTextField("Rcv.debt_cred_nm");
		p.Rcv_bd_dpt_cd_Label = p.beansFactory.createLabel("Rcv.bd_dpt_cd_Label");
		p.Rcv_bd_dpt_cd = p.beansFactory.createTextField("Rcv.bd_dpt_cd");
		p.Rcv_bd_dpt_cd.setLabel(p.Rcv_bd_dpt_cd_Label);
		p.Rcv_bd_dpt_nm = p.beansFactory.createTextField("Rcv.bd_dpt_nm");
		p.Rcv_rcv_dat_typ_Label = p.beansFactory.createLabel("Rcv.rcv_dat_typ_Label");
		p.Rcv_rcv_dat_typ = p.beansFactory.createTextField("Rcv.rcv_dat_typ");
		p.Rcv_rcv_dat_typ.setLabel(p.Rcv_rcv_dat_typ_Label);
		p.Rcv_rcv_dat_typ_nm = p.beansFactory.createTextField("Rcv.rcv_dat_typ_nm");
		p.Rcv_adv_trd_cd_Label = p.beansFactory.createLabel("Rcv.adv_trd_cd_Label");
		p.Rcv_adv_trd_cd = p.beansFactory.createTextField("Rcv.adv_trd_cd");
		p.Rcv_adv_trd_cd.setLabel(p.Rcv_adv_trd_cd_Label);
		p.Rcv_adv_trd_nm = p.beansFactory.createTextField("Rcv.adv_trd_nm");
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
		p.Rcv_note_no_Label = p.beansFactory.createLabel("Rcv.note_no_Label");
		p.Rcv_note_no = p.beansFactory.createTextField("Rcv.note_no");
		p.Rcv_note_no.setLabel(p.Rcv_note_no_Label);
		p.Rcv_note_typ_Label = p.beansFactory.createLabel("Rcv.note_typ_Label");
		p.Rcv_note_typ = p.beansFactory.createTextComboBox("Rcv.note_typ");
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
		p.Rcv_draw_bank_cd = p.beansFactory.createTextComboBox("Rcv.draw_bank_cd");
		p.Rcv_draw_bank_cd.setLabel(p.Rcv_draw_bank_cd_Label);
		p.Rcv_draw_bank_nm = p.beansFactory.createTextField("Rcv.draw_bank_nm");
		p.Rcv_draw_branch_cd_Label = p.beansFactory.createLabel("Rcv.draw_branch_cd_Label");
		p.Rcv_draw_branch_cd = p.beansFactory.createTextComboBox("Rcv.draw_branch_cd");
		p.Rcv_draw_branch_cd.setLabel(p.Rcv_draw_branch_cd_Label);
		p.Rcv_draw_branch_nm = p.beansFactory.createTextField("Rcv.draw_branch_nm");
		p.Rcv_note_rsn_cd_Label = p.beansFactory.createLabel("Rcv.note_rsn_cd_Label");
		p.Rcv_note_rsn_cd = p.beansFactory.createTextComboBox("Rcv.note_rsn_cd");
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
		p.Rcv_setoff_rcv_no_Label = p.beansFactory.createLabel("Rcv.setoff_rcv_no_Label");
		p.Rcv_setoff_rcv_no = p.beansFactory.createTextField("Rcv.setoff_rcv_no");
		p.Rcv_setoff_rcv_no.setLabel(p.Rcv_setoff_rcv_no_Label);
		p.Rcv_setoff_srch = p.beansFactory.createButton("Rcv.setoff_srch", "srch");
		p.Rcv_setoff_dt_Label = p.beansFactory.createLabel("Rcv.setoff_dt_Label");
		p.Rcv_setoff_dt = p.beansFactory.createDateField("Rcv.setoff_dt");
		p.Rcv_setoff_dt.setLabel(p.Rcv_setoff_dt_Label);
		p.Rcv_setoff_bcst_cd_Label = p.beansFactory.createLabel("Rcv.setoff_bcst_cd_Label");
		p.Rcv_setoff_bcst_cd = p.beansFactory.createTextField("Rcv.setoff_bcst_cd");
		p.Rcv_setoff_bcst_cd.setLabel(p.Rcv_setoff_bcst_cd_Label);
		p.Rcv_setoff_bcst_nm = p.beansFactory.createTextField("Rcv.setoff_bcst_nm");
		p.Rcv_setoff_trd_cur_cd_Label = p.beansFactory.createLabel("Rcv.setoff_trd_cur_cd_Label");
		p.Rcv_setoff_trd_cur_cd = p.beansFactory.createTextComboBox("Rcv.setoff_trd_cur_cd");
		p.Rcv_setoff_trd_cur_cd.setLabel(p.Rcv_setoff_trd_cur_cd_Label);
		p.Rcv_setoff_trd_cur_nm = p.beansFactory.createTextField("Rcv.setoff_trd_cur_nm");
		p.Rcv_setoff_xrate_cd = p.beansFactory.createTextField("Rcv.setoff_xrate_cd");
		p.Rcv_setoff_sttl_cd1_Label = p.beansFactory.createLabel("Rcv.setoff_sttl_cd1_Label");
		p.Rcv_setoff_sttl_cd1 = p.beansFactory.createTextComboBox("Rcv.setoff_sttl_cd1");
		p.Rcv_setoff_sttl_cd1.setLabel(p.Rcv_setoff_sttl_cd1_Label);
		p.Rcv_setoff_sttl_typ1 = p.beansFactory.createTextField("Rcv.setoff_sttl_typ1");
		p.Rcv_setoff_sttl_nm1 = p.beansFactory.createTextField("Rcv.setoff_sttl_nm1");
		p.Rcv_setoff_sls_purc_typ = p.beansFactory.createTextField("Rcv.setoff_sls_purc_typ");
		p.Rcv_setoff_purc_flg = p.beansFactory.createCheckBox("Rcv.setoff_purc_flg");
		p.Rcv_setoff_sls_flg = p.beansFactory.createCheckBox("Rcv.setoff_sls_flg");
		p.Rcv_setoff_tax_cd_sub = p.beansFactory.createTextField("Rcv.setoff_tax_cd_sub");
		p.Rcv_setoff_tax_cd_Label = p.beansFactory.createLabel("Rcv.setoff_tax_cd_Label");
		p.Rcv_setoff_tax_cd = p.beansFactory.createTextComboBox("Rcv.setoff_tax_cd");
		p.Rcv_setoff_tax_cd.setLabel(p.Rcv_setoff_tax_cd_Label);
		p.Rcv_setoff_tax_nm = p.beansFactory.createTextField("Rcv.setoff_tax_nm");
		p.Rcv_setoff_tax_rate_Label = p.beansFactory.createLabel("Rcv.setoff_tax_rate_Label");
		p.Rcv_setoff_tax_rate = p.beansFactory.createNumberField("Rcv.setoff_tax_rate");
		p.Rcv_setoff_tax_rate.setLabel(p.Rcv_setoff_tax_rate_Label);
		p.Rcv_setoff_debt_cred_id_typ_Label = p.beansFactory.createLabel("Rcv.setoff_debt_cred_id_typ_Label");
		p.Rcv_setoff_debt_cred_id_typ = p.beansFactory.createTextComboBox("Rcv.setoff_debt_cred_id_typ");
		p.Rcv_setoff_debt_cred_id_typ.setLabel(p.Rcv_setoff_debt_cred_id_typ_Label);
		p.Rcv_setoff_debt_cred_id_typ_nm = p.beansFactory.createTextField("Rcv.setoff_debt_cred_id_typ_nm");
		p.Rcv_setoff_debt_cred_id_cd = p.beansFactory.createTextField("Rcv.setoff_debt_cred_id_cd");
		p.Rcv_setoff_debt_cred_nm = p.beansFactory.createTextField("Rcv.setoff_debt_cred_nm");
		p.Rcv_setoff_bd_dpt_cd_Label = p.beansFactory.createLabel("Rcv.setoff_bd_dpt_cd_Label");
		p.Rcv_setoff_bd_dpt_cd = p.beansFactory.createTextField("Rcv.setoff_bd_dpt_cd");
		p.Rcv_setoff_bd_dpt_cd.setLabel(p.Rcv_setoff_bd_dpt_cd_Label);
		p.Rcv_setoff_bd_dpt_nm = p.beansFactory.createTextField("Rcv.setoff_bd_dpt_nm");
		p.Rcv_setoff_rcv_dat_typ_Label = p.beansFactory.createLabel("Rcv.setoff_rcv_dat_typ_Label");
		p.Rcv_setoff_rcv_dat_typ = p.beansFactory.createTextField("Rcv.setoff_rcv_dat_typ");
		p.Rcv_setoff_rcv_dat_typ.setLabel(p.Rcv_setoff_rcv_dat_typ_Label);
		p.Rcv_setoff_rcv_dat_typ_nm = p.beansFactory.createTextField("Rcv.setoff_rcv_dat_typ_nm");
		p.Rcv_setoff_trd_rmrks_Label = p.beansFactory.createLabel("Rcv.setoff_trd_rmrks_Label");
		p.Rcv_setoff_trd_rmrks = p.beansFactory.createTextField("Rcv.setoff_trd_rmrks");
		p.Rcv_setoff_trd_rmrks.setLabel(p.Rcv_setoff_trd_rmrks_Label);
		p.Rcv_setoff_sub_char1_Label = p.beansFactory.createLabel("Rcv.setoff_sub_char1_Label");
		p.Rcv_setoff_sub_char1 = p.beansFactory.createTextField("Rcv.setoff_sub_char1");
		p.Rcv_setoff_sub_char1.setLabel(p.Rcv_setoff_sub_char1_Label);
		p.Rcv_setoff_sub_char2_Label = p.beansFactory.createLabel("Rcv.setoff_sub_char2_Label");
		p.Rcv_setoff_sub_char2 = p.beansFactory.createTextField("Rcv.setoff_sub_char2");
		p.Rcv_setoff_sub_char2.setLabel(p.Rcv_setoff_sub_char2_Label);
		p.Rcv_setoff_sub_char3_Label = p.beansFactory.createLabel("Rcv.setoff_sub_char3_Label");
		p.Rcv_setoff_sub_char3 = p.beansFactory.createTextField("Rcv.setoff_sub_char3");
		p.Rcv_setoff_sub_char3.setLabel(p.Rcv_setoff_sub_char3_Label);
		p.Rcv_amt_dec_place = p.beansFactory.createNumberField("Rcv.amt_dec_place");
		p.Rcv_upri_dec_place = p.beansFactory.createNumberField("Rcv.upri_dec_place");
	}

	/**
	 * [Note]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitNote(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.NotePanel = p.beansFactory.createPanel("Note");
		// ブロックの項目の初期化
	}

	/**
	 * [Setoff]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSetoff(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.SetoffPanel = p.beansFactory.createPanel("Setoff");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlCnd(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.DtlCndPanel = p.beansFactory.createPanel("DtlCnd");
		p.DtlCndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.DtlCnd_narrow_down_flg = p.beansFactory.createCheckBox("DtlCnd.narrow_down_flg");
		p.DtlCnd_not_bill_flg = p.beansFactory.createCheckBox("DtlCnd.not_bill_flg");
		p.DtlCnd_incl_appl_flg = p.beansFactory.createCheckBox("DtlCnd.incl_appl_flg");
		p.DtlCnd_zero_flg = p.beansFactory.createCheckBox("DtlCnd.zero_flg");
		p.DtlCnd_slo_flg = p.beansFactory.createCheckBox("DtlCnd.slo_flg");
		p.DtlCnd_rcv_schd_dt_Label = p.beansFactory.createLabel("DtlCnd.rcv_schd_dt_Label");
		p.DtlCnd_rcv_schd_dt = p.beansFactory.createDateField("DtlCnd.rcv_schd_dt");
		p.DtlCnd_rcv_schd_dt.setLabel(p.DtlCnd_rcv_schd_dt_Label);
		p.DtlCnd_srch = p.beansFactory.createButton("DtlCnd.srch", "srch");
	}

	/**
	 * [Total]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTotal(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.TotalPanel = p.beansFactory.createPanel("Total");
		p.TotalTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_rcv_schd_dt = p.beansFactory.createTableColumn("Dtl.rcv_schd_dt", MCColumnType.DATE);
		p.columnDtl_ar_sttl_cd1 = p.beansFactory.createTableColumn("Dtl.ar_sttl_cd1", MCColumnType.TEXT);
		p.columnDtl_ar_sttl_nm1 = p.beansFactory.createTableColumn("Dtl.ar_sttl_nm1", MCColumnType.TEXT);
		p.columnDtl_ar_sttl_typ1 = p.beansFactory.createTableColumn("Dtl.ar_sttl_typ1", MCColumnType.TEXT);
		p.columnDtl_iv_no = p.beansFactory.createTableColumn("Dtl.iv_no", MCColumnType.TEXT);
		p.columnDtl_wrk_no = p.beansFactory.createTableColumn("Dtl.wrk_no", MCColumnType.TEXT);
		p.columnDtl_wrk_nm = p.beansFactory.createTableColumn("Dtl.wrk_nm", MCColumnType.TEXT);
		p.columnDtl_acst_cd = p.beansFactory.createTableColumn("Dtl.acst_cd", MCColumnType.TEXT);
		p.columnDtl_acst_nm = p.beansFactory.createTableColumn("Dtl.acst_nm", MCColumnType.TEXT);
		p.columnDtl_ar_dpt_cd = p.beansFactory.createTableColumn("Dtl.ar_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_ar_dpt_nm = p.beansFactory.createTableColumn("Dtl.ar_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
		p.columnDtl_ar_typ = p.beansFactory.createTableColumn("Dtl.ar_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_ar_typ_nm = p.beansFactory.createTableColumn("Dtl.ar_typ_nm", MCColumnType.TEXT);
		p.columnDtl_bill_ym = p.beansFactory.createTableColumn("Dtl.bill_ym", MCColumnType.DATE);
		p.columnDtl_bill_cl_day = p.beansFactory.createTableColumn("Dtl.bill_cl_day", MCColumnType.NUMBER);
		p.columnDtl_bill_no = p.beansFactory.createTableColumn("Dtl.bill_no", MCColumnType.TEXT);
		p.columnDtl_bcst_cd = p.beansFactory.createTableColumn("Dtl.bcst_cd", MCColumnType.TEXT);
		p.columnDtl_bcst_nm = p.beansFactory.createTableColumn("Dtl.bcst_nm", MCColumnType.TEXT);
		p.columnDtl_bill_dpt_cd = p.beansFactory.createTableColumn("Dtl.bill_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_bill_dpt_nm = p.beansFactory.createTableColumn("Dtl.bill_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_bill_d_rmrks = p.beansFactory.createTableColumn("Dtl.bill_d_rmrks", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_open_MSBGP0220 = p.beansFactory.createButton("Btn.open_MSBGP0220", "open");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.CndPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NNW");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrTabPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NNC");
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0210.CndR.ope_META);
		p.CndPanel.add(p.Cnd_rcv_act_no_Label);
		p.CndPanel.add(p.Cnd_rcv_act_no);
		p.CndPanel.setLastBeans(p.Cnd_rcv_act_no);
		p.Cnd_rcv_act_no.setNextBeans(p.Cnd_rcv_act_rev);
		p.Cnd_rcv_act_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0210.CndR.rcv_act_no_META);
		p.CndPanel.add(p.Cnd_rcv_act_rev);
		p.Cnd_rcv_act_rev.setNextBeans(p.Cnd_latest_flg);
		p.Cnd_rcv_act_rev.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0210.CndR.rcv_act_rev_META);
		p.CndPanel.add(p.Cnd_latest_flg);
		p.Cnd_latest_flg.setNextBeans(p.Cnd_srch);
		p.Cnd_latest_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0210.CndR.latest_flg_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.RcvTabPanel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.HdrPanel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.SysPanel);
		p.HdrTabTab.add(p.SysPanel, "HdrTab.tab2");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.SysPanel);
		// ブロックの項目の初期化
		p.Hdr_trd_cd.setListType(MCListType.STRICT);
		p.Hdr_trd_cd.setLinkBeans(p.Hdr_trd_nm,p.Hdr_trd_ptn_typ,p.Hdr_ar_trd_grp_typ);
		p.HdrPanel.add(p.Hdr_trd_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cd);
		p.HdrPanel.setLastBeans(p.Hdr_trd_cd);
		p.Hdr_trd_cd.setNextBeans(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.trd_cd_META);
		p.HdrPanel.add(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_ptn_typ.setNextBeans(p.Hdr_ar_trd_grp_typ);
		p.Hdr_trd_ptn_typ.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.trd_ptn_typ_META);
		p.HdrPanel.add(p.Hdr_ar_trd_grp_typ);
		p.Hdr_ar_trd_grp_typ.setNextBeans(p.Hdr_trd_nm);
		p.Hdr_ar_trd_grp_typ.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.ar_trd_grp_typ_META);
		p.HdrPanel.add(p.Hdr_trd_nm);
		p.Hdr_trd_nm.setNextBeans(p.Hdr_ac_ym);
		p.Hdr_trd_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.trd_nm_META);
		p.HdrPanel.add(p.Hdr_ac_ym_Label);
		p.HdrPanel.add(p.Hdr_ac_ym);
		p.Hdr_ac_ym.setNextBeans(p.Hdr_rcv_act_no);
		p.Hdr_ac_ym.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.ac_ym_META);
		p.Hdr_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.HdrPanel.add(p.Hdr_rcv_act_no_Label);
		p.HdrPanel.add(p.Hdr_rcv_act_no);
		p.Hdr_rcv_act_no.setNextBeans(p.Hdr_rcv_act_rev);
		p.Hdr_rcv_act_no.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.rcv_act_no_META);
		p.HdrPanel.add(p.Hdr_rcv_act_rev);
		p.Hdr_rcv_act_rev.setNextBeans(p.Hdr_latest_flg);
		p.Hdr_rcv_act_rev.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.rcv_act_rev_META);
		p.HdrPanel.add(p.Hdr_latest_flg);
		p.Hdr_latest_flg.setNextBeans(p.Hdr_ac_dt);
		p.Hdr_latest_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.latest_flg_META);
		p.HdrPanel.add(p.Hdr_ac_dt_Label);
		p.HdrPanel.add(p.Hdr_ac_dt);
		p.Hdr_ac_dt.setNextBeans(p.Hdr_can_ac_dt_p_PPanel);
		p.Hdr_ac_dt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.ac_dt_META);
		p.Hdr_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_can_ac_dt_p_PPanel);
		p.Hdr_can_ac_dt_p_PPanel.setNextBeans(p.Hdr_bill_basis_dt);
		p.HdrPanel.add(p.Hdr_bill_basis_dt_Label);
		p.HdrPanel.add(p.Hdr_bill_basis_dt);
		p.Hdr_bill_basis_dt.setNextBeans(p.Hdr_usr_dpt_p_PPanel);
		p.Hdr_bill_basis_dt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.bill_basis_dt_META);
		p.Hdr_bill_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_usr_dpt_p_PPanel);
		p.Hdr_usr_dpt_p_PPanel.setNextBeans(p.Hdr_wg_cd);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Hdr_dpt_nm,p.Hdr_wg_cd,p.Hdr_wg_nm,p.Hdr_def_bank_ac_cd);
		p.HdrPanel.add(p.Hdr_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_wg_cd);
		p.Hdr_wg_cd.setNextBeans(p.Hdr_wg_nm);
		p.Hdr_wg_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.wg_cd_META);
		p.HdrPanel.add(p.Hdr_wg_nm);
		p.Hdr_wg_nm.setNextBeans(p.Hdr_def_bank_ac_cd);
		p.Hdr_wg_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.wg_nm_META);
		p.SysPanel.add(p.Hdr_ins_usr_id_Label);
		p.SysPanel.add(p.Hdr_ins_usr_id);
		p.SysPanel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.ins_usr_id_META);
		p.SysPanel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.ins_usr_nm_META);
		p.SysPanel.add(p.Hdr_ins_func_id_Label);
		p.SysPanel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.ins_func_id_META);
		p.SysPanel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.ins_func_nm_META);
		p.SysPanel.add(p.Hdr_upd_usr_id_Label);
		p.SysPanel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.upd_usr_id_META);
		p.SysPanel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.upd_usr_nm_META);
		p.SysPanel.add(p.Hdr_upd_func_id_Label);
		p.SysPanel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.upd_func_id_META);
		p.SysPanel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.upd_func_nm_META);
		p.SysPanel.add(p.Hdr_ins_ts_Label);
		p.SysPanel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.SysPanel.add(p.Hdr_upd_ts_Label);
		p.SysPanel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.SysPanel.add(p.Hdr_upd_srv_req_no_Label);
		p.SysPanel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.upd_srv_req_no_META);
		p.HdrPanel.add(p.Hdr_def_bank_ac_cd);
		p.Hdr_def_bank_ac_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0210.HdrR.def_bank_ac_cd_META);
	}

	/**
	 * [Sys]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSys(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [RcvTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRcvTab(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.add(p.RcvTabPanel);
		p.RcvTabPanel.setNextBeans(p.DtlCndPanel);
		p.RcvTabPanel.add(p.RcvTabTab);
		p.RcvTabPanel.setLastBeans(p.RcvTabTab);
		p.RcvTabPanel.setLayoutPosition("CT");
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
	protected static void jbInitRcv(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.RcvPanel.setNextBeans(p.NotePanel);
		// ブロックの項目の初期化
		p.RcvPanel.add(p.Rcv_rcv_no_Label);
		p.RcvPanel.add(p.Rcv_rcv_no);
		p.RcvPanel.setLastBeans(p.Rcv_rcv_no);
		p.Rcv_rcv_no.setNextBeans(p.Rcv_srch);
		p.Rcv_rcv_no.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.rcv_no_META);
		p.Rcv_srch.setIcon("SEARCH");
		p.Rcv_srch.setFunctionKey(MCFunctionKey.F3);
		p.RcvPanel.add(p.Rcv_srch);
		p.Rcv_srch.setNextBeans(p.Rcv_slo_no);
		p.RcvPanel.add(p.Rcv_slo_no_Label);
		p.RcvPanel.add(p.Rcv_slo_no);
		p.Rcv_slo_no.setNextBeans(p.Rcv_rcv_dt);
		p.Rcv_slo_no.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.slo_no_META);
		p.RcvPanel.add(p.Rcv_rcv_dt_Label);
		p.RcvPanel.add(p.Rcv_rcv_dt);
		p.Rcv_rcv_dt.setNextBeans(p.Rcv_rcst_cd);
		p.Rcv_rcv_dt.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.rcv_dt_META);
		p.Rcv_rcv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RcvPanel.add(p.Rcv_rcst_cd_Label);
		p.RcvPanel.add(p.Rcv_rcst_cd);
		p.Rcv_rcst_cd.setNextBeans(p.Rcv_rcst_nm);
		p.Rcv_rcst_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.rcst_cd_META);
		p.Rcv_rcst_cd.addLinkBeans(p.Rcv_rcst_nm,p.Rcv_xfr_psn);
		p.Rcv_rcst_cd.setListType(MCListType.STRICT);
		p.RcvPanel.add(p.Rcv_rcst_nm);
		p.Rcv_rcst_nm.setNextBeans(p.Rcv_bcst_cd);
		p.Rcv_rcst_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.rcst_nm_META);
		p.Rcv_bcst_cd.setListType(MCListType.STRICT);
		p.Rcv_bcst_cd.setLinkBeans(p.Rcv_bcst_nm);
		p.RcvPanel.add(p.Rcv_bcst_cd_Label);
		p.RcvPanel.add(p.Rcv_bcst_cd);
		p.Rcv_bcst_cd.setNextBeans(p.Rcv_bcst_nm);
		p.Rcv_bcst_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.bcst_cd_META);
		p.RcvPanel.add(p.Rcv_bcst_nm);
		p.Rcv_bcst_nm.setNextBeans(p.Rcv_bill_dpt_cd);
		p.Rcv_bcst_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.bcst_nm_META);
		p.Rcv_bill_dpt_cd.setListType(MCListType.STRICT);
		p.Rcv_bill_dpt_cd.setLinkBeans(p.Rcv_bill_dpt_nm);
		p.RcvPanel.add(p.Rcv_bill_dpt_cd_Label);
		p.RcvPanel.add(p.Rcv_bill_dpt_cd);
		p.Rcv_bill_dpt_cd.setNextBeans(p.Rcv_bill_dpt_nm);
		p.Rcv_bill_dpt_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.bill_dpt_cd_META);
		p.RcvPanel.add(p.Rcv_bill_dpt_nm);
		p.Rcv_bill_dpt_nm.setNextBeans(p.Rcv_trd_cur_cd);
		p.Rcv_bill_dpt_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.bill_dpt_nm_META);
		p.Rcv_trd_cur_cd.setListType(MCListType.STRICT);
		p.Rcv_trd_cur_cd.setLinkBeans(p.Rcv_trd_cur_nm,p.Rcv_amt_dec_place);
		p.RcvPanel.add(p.Rcv_trd_cur_cd_Label);
		p.RcvPanel.add(p.Rcv_trd_cur_cd);
		p.Rcv_trd_cur_cd.setNextBeans(p.Rcv_trd_cur_nm);
		p.Rcv_trd_cur_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.trd_cur_cd_META);
		p.RcvPanel.add(p.Rcv_trd_cur_nm);
		p.Rcv_trd_cur_nm.setNextBeans(p.Rcv_xrate_p_PPanel);
		p.Rcv_trd_cur_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.trd_cur_nm_META);
		p.RcvPanel.add(p.Rcv_xrate_p_PPanel);
		p.Rcv_xrate_p_PPanel.setNextBeans(p.Rcv_base_cur_cd);
		p.RcvPanel.add(p.Rcv_base_cur_cd);
		p.Rcv_base_cur_cd.setNextBeans(p.Rcv_xrate_cd);
		p.Rcv_base_cur_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.base_cur_cd_META);
		p.RcvPanel.add(p.Rcv_xrate_cd);
		p.Rcv_xrate_cd.setNextBeans(p.Rcv_rcv_amt_p_PPanel);
		p.Rcv_xrate_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.xrate_cd_META);
		p.RcvPanel.add(p.Rcv_rcv_amt_p_PPanel);
		p.Rcv_rcv_amt_p_PPanel.setNextBeans(p.Rcv_not_proc_bal_p_PPanel);
		p.RcvPanel.add(p.Rcv_not_proc_bal_p_PPanel);
		p.Rcv_not_proc_bal_p_PPanel.setNextBeans(p.Rcv_ar_sttl_cd1);
		p.Rcv_ar_sttl_cd1.setListType(MCListType.STRICT);
		p.Rcv_ar_sttl_cd1.setLinkBeans(p.Rcv_ar_sttl_nm1,p.Rcv_ar_sttl_typ1,p.Rcv_xfr_psn,p.Rcv_ar_sttl_cd2);
		p.RcvPanel.add(p.Rcv_ar_sttl_cd1_Label);
		p.RcvPanel.add(p.Rcv_ar_sttl_cd1);
		p.Rcv_ar_sttl_cd1.setNextBeans(p.Rcv_ar_sttl_typ1);
		p.Rcv_ar_sttl_cd1.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.ar_sttl_cd1_META);
		p.RcvPanel.add(p.Rcv_ar_sttl_typ1);
		p.Rcv_ar_sttl_typ1.setNextBeans(p.Rcv_ar_sttl_nm1);
		p.Rcv_ar_sttl_typ1.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.ar_sttl_typ1_META);
		p.RcvPanel.add(p.Rcv_ar_sttl_nm1);
		p.Rcv_ar_sttl_nm1.setNextBeans(p.Rcv_bank_ac_cd);
		p.Rcv_ar_sttl_nm1.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.ar_sttl_nm1_META);
		p.Rcv_bank_ac_cd.setListType(MCListType.STRICT);
		p.Rcv_bank_ac_cd.setLinkBeans(p.Rcv_bank_ac_nm);
		p.RcvPanel.add(p.Rcv_bank_ac_cd_Label);
		p.RcvPanel.add(p.Rcv_bank_ac_cd);
		p.Rcv_bank_ac_cd.setNextBeans(p.Rcv_bank_ac_nm);
		p.Rcv_bank_ac_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.bank_ac_cd_META);
		p.RcvPanel.add(p.Rcv_bank_ac_nm);
		p.Rcv_bank_ac_nm.setNextBeans(p.Rcv_xfr_psn);
		p.Rcv_bank_ac_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.bank_ac_nm_META);
		p.RcvPanel.add(p.Rcv_xfr_psn_Label);
		p.RcvPanel.add(p.Rcv_xfr_psn);
		p.Rcv_xfr_psn.setNextBeans(p.Rcv_ar_sttl_cd2);
		p.Rcv_xfr_psn.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.xfr_psn_META);
		p.Rcv_ar_sttl_cd2.setListType(MCListType.STRICT);
		p.Rcv_ar_sttl_cd2.setLinkBeans(p.Rcv_ar_sttl_nm2,p.Rcv_sls_purc_typ2,p.Rcv_ar_sttl_typ2,p.Rcv_debt_cred_id_typ,p.Rcv_tax_cd_sub);
		p.RcvPanel.add(p.Rcv_ar_sttl_cd2_Label);
		p.RcvPanel.add(p.Rcv_ar_sttl_cd2);
		p.Rcv_ar_sttl_cd2.setNextBeans(p.Rcv_ar_sttl_typ2);
		p.Rcv_ar_sttl_cd2.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.ar_sttl_cd2_META);
		p.RcvPanel.add(p.Rcv_ar_sttl_typ2);
		p.Rcv_ar_sttl_typ2.setNextBeans(p.Rcv_ar_sttl_nm2);
		p.Rcv_ar_sttl_typ2.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.ar_sttl_typ2_META);
		p.RcvPanel.add(p.Rcv_ar_sttl_nm2);
		p.Rcv_ar_sttl_nm2.setNextBeans(p.Rcv_sls_purc_typ2);
		p.Rcv_ar_sttl_nm2.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.ar_sttl_nm2_META);
		p.RcvPanel.add(p.Rcv_sls_purc_typ2);
		p.Rcv_sls_purc_typ2.setNextBeans(p.Rcv_purc_flg);
		p.Rcv_sls_purc_typ2.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.sls_purc_typ2_META);
		p.RcvPanel.add(p.Rcv_purc_flg);
		p.Rcv_purc_flg.setNextBeans(p.Rcv_sls_flg);
		p.Rcv_purc_flg.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.purc_flg_META);
		p.RcvPanel.add(p.Rcv_sls_flg);
		p.Rcv_sls_flg.setNextBeans(p.Rcv_tax_cd_sub);
		p.Rcv_sls_flg.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.sls_flg_META);
		p.RcvPanel.add(p.Rcv_tax_cd_sub);
		p.Rcv_tax_cd_sub.setNextBeans(p.Rcv_tax_cd);
		p.Rcv_tax_cd_sub.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.tax_cd_sub_META);
		p.Rcv_tax_cd.setListType(MCListType.STRICT);
		p.Rcv_tax_cd.setLinkBeans(p.Rcv_tax_nm,p.Rcv_tax_rate);
		p.RcvPanel.add(p.Rcv_tax_cd_Label);
		p.RcvPanel.add(p.Rcv_tax_cd);
		p.Rcv_tax_cd.setNextBeans(p.Rcv_tax_nm);
		p.Rcv_tax_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.tax_cd_META);
		p.RcvPanel.add(p.Rcv_tax_nm);
		p.Rcv_tax_nm.setNextBeans(p.Rcv_tax_rate);
		p.Rcv_tax_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.tax_nm_META);
		p.RcvPanel.add(p.Rcv_tax_rate_Label);
		p.RcvPanel.add(p.Rcv_tax_rate);
		p.Rcv_tax_rate.setNextBeans(p.Rcv_debt_cred_id_typ);
		p.Rcv_tax_rate.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.tax_rate_META);
		p.Rcv_debt_cred_id_typ.setListType(MCListType.STRICT);
		p.Rcv_debt_cred_id_typ.setLinkBeans(p.Rcv_debt_cred_id_typ_nm);
		p.RcvPanel.add(p.Rcv_debt_cred_id_typ_Label);
		p.RcvPanel.add(p.Rcv_debt_cred_id_typ);
		p.Rcv_debt_cred_id_typ.setNextBeans(p.Rcv_debt_cred_id_typ_nm);
		p.Rcv_debt_cred_id_typ.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.debt_cred_id_typ_META);
		p.RcvPanel.add(p.Rcv_debt_cred_id_typ_nm);
		p.Rcv_debt_cred_id_typ_nm.setNextBeans(p.Rcv_debt_cred_id_cd);
		p.Rcv_debt_cred_id_typ_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.debt_cred_id_typ_nm_META);
		p.RcvPanel.add(p.Rcv_debt_cred_id_cd);
		p.Rcv_debt_cred_id_cd.setNextBeans(p.Rcv_debt_cred_nm);
		p.Rcv_debt_cred_id_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.debt_cred_id_cd_META);
		p.Rcv_debt_cred_id_cd.addLinkBeans(p.Rcv_debt_cred_nm);
		p.Rcv_debt_cred_id_cd.setListType(MCListType.STRICT);
		p.RcvPanel.add(p.Rcv_debt_cred_nm);
		p.Rcv_debt_cred_nm.setNextBeans(p.Rcv_bd_dpt_cd);
		p.Rcv_debt_cred_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.debt_cred_nm_META);
		p.RcvPanel.add(p.Rcv_bd_dpt_cd_Label);
		p.RcvPanel.add(p.Rcv_bd_dpt_cd);
		p.Rcv_bd_dpt_cd.setNextBeans(p.Rcv_bd_dpt_nm);
		p.Rcv_bd_dpt_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.bd_dpt_cd_META);
		p.Rcv_bd_dpt_cd.addLinkBeans(p.Rcv_bd_dpt_nm);
		p.Rcv_bd_dpt_cd.setListType(MCListType.STRICT);
		p.RcvPanel.add(p.Rcv_bd_dpt_nm);
		p.Rcv_bd_dpt_nm.setNextBeans(p.Rcv_rcv_dat_typ);
		p.Rcv_bd_dpt_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.bd_dpt_nm_META);
		p.RcvPanel.add(p.Rcv_rcv_dat_typ_Label);
		p.RcvPanel.add(p.Rcv_rcv_dat_typ);
		p.Rcv_rcv_dat_typ.setNextBeans(p.Rcv_rcv_dat_typ_nm);
		p.Rcv_rcv_dat_typ.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.rcv_dat_typ_META);
		p.RcvPanel.add(p.Rcv_rcv_dat_typ_nm);
		p.Rcv_rcv_dat_typ_nm.setNextBeans(p.Rcv_adv_trd_cd);
		p.Rcv_rcv_dat_typ_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.rcv_dat_typ_nm_META);
		p.RcvPanel.add(p.Rcv_adv_trd_cd_Label);
		p.RcvPanel.add(p.Rcv_adv_trd_cd);
		p.Rcv_adv_trd_cd.setNextBeans(p.Rcv_adv_trd_nm);
		p.Rcv_adv_trd_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.adv_trd_cd_META);
		p.RcvPanel.add(p.Rcv_adv_trd_nm);
		p.Rcv_adv_trd_nm.setNextBeans(p.Rcv_trd_rmrks);
		p.Rcv_adv_trd_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.adv_trd_nm_META);
		p.RcvPanel.add(p.Rcv_trd_rmrks_Label);
		p.RcvPanel.add(p.Rcv_trd_rmrks);
		p.Rcv_trd_rmrks.setNextBeans(p.Rcv_sub_char1);
		p.Rcv_trd_rmrks.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.trd_rmrks_META);
		p.RcvPanel.add(p.Rcv_sub_char1_Label);
		p.RcvPanel.add(p.Rcv_sub_char1);
		p.Rcv_sub_char1.setNextBeans(p.Rcv_sub_char2);
		p.Rcv_sub_char1.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.sub_char1_META);
		p.RcvPanel.add(p.Rcv_sub_char2_Label);
		p.RcvPanel.add(p.Rcv_sub_char2);
		p.Rcv_sub_char2.setNextBeans(p.Rcv_sub_char3);
		p.Rcv_sub_char2.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.sub_char2_META);
		p.RcvPanel.add(p.Rcv_sub_char3_Label);
		p.RcvPanel.add(p.Rcv_sub_char3);
		p.Rcv_sub_char3.setNextBeans(p.Rcv_setoff_xrate_cd);
		p.Rcv_sub_char3.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.sub_char3_META);
		p.NotePanel.add(p.Rcv_note_no_Label);
		p.NotePanel.add(p.Rcv_note_no);
		p.NotePanel.setLastBeans(p.Rcv_note_no);
		p.Rcv_note_no.setNextBeans(p.Rcv_note_typ);
		p.Rcv_note_no.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.note_no_META);
		p.Rcv_note_typ.setListType(MCListType.STRICT);
		p.Rcv_note_typ.setLinkBeans(p.Rcv_note_typ_nm);
		p.NotePanel.add(p.Rcv_note_typ_Label);
		p.NotePanel.add(p.Rcv_note_typ);
		p.Rcv_note_typ.setNextBeans(p.Rcv_note_typ_nm);
		p.Rcv_note_typ.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.note_typ_META);
		p.NotePanel.add(p.Rcv_note_typ_nm);
		p.Rcv_note_typ_nm.setNextBeans(p.Rcv_draw_dt);
		p.Rcv_note_typ_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.note_typ_nm_META);
		p.NotePanel.add(p.Rcv_draw_dt_Label);
		p.NotePanel.add(p.Rcv_draw_dt);
		p.Rcv_draw_dt.setNextBeans(p.Rcv_due_dt);
		p.Rcv_draw_dt.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.draw_dt_META);
		p.Rcv_draw_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.NotePanel.add(p.Rcv_due_dt_Label);
		p.NotePanel.add(p.Rcv_due_dt);
		p.Rcv_due_dt.setNextBeans(p.Rcv_drawer_nm);
		p.Rcv_due_dt.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.due_dt_META);
		p.Rcv_due_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.NotePanel.add(p.Rcv_drawer_nm_Label);
		p.NotePanel.add(p.Rcv_drawer_nm);
		p.Rcv_drawer_nm.setNextBeans(p.Rcv_endrsr);
		p.Rcv_drawer_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.drawer_nm_META);
		p.NotePanel.add(p.Rcv_endrsr_Label);
		p.NotePanel.add(p.Rcv_endrsr);
		p.Rcv_endrsr.setNextBeans(p.Rcv_accptr);
		p.Rcv_endrsr.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.endrsr_META);
		p.NotePanel.add(p.Rcv_accptr_Label);
		p.NotePanel.add(p.Rcv_accptr);
		p.Rcv_accptr.setNextBeans(p.Rcv_draw_bank_cd);
		p.Rcv_accptr.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.accptr_META);
		p.Rcv_draw_bank_cd.setListType(MCListType.STRICT);
		p.Rcv_draw_bank_cd.setLinkBeans(p.Rcv_draw_bank_nm);
		p.NotePanel.add(p.Rcv_draw_bank_cd_Label);
		p.NotePanel.add(p.Rcv_draw_bank_cd);
		p.Rcv_draw_bank_cd.setNextBeans(p.Rcv_draw_bank_nm);
		p.Rcv_draw_bank_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.draw_bank_cd_META);
		p.NotePanel.add(p.Rcv_draw_bank_nm);
		p.Rcv_draw_bank_nm.setNextBeans(p.Rcv_draw_branch_cd);
		p.Rcv_draw_bank_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.draw_bank_nm_META);
		p.Rcv_draw_branch_cd.setListType(MCListType.STRICT);
		p.Rcv_draw_branch_cd.setLinkBeans(p.Rcv_draw_branch_nm);
		p.NotePanel.add(p.Rcv_draw_branch_cd_Label);
		p.NotePanel.add(p.Rcv_draw_branch_cd);
		p.Rcv_draw_branch_cd.setNextBeans(p.Rcv_draw_branch_nm);
		p.Rcv_draw_branch_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.draw_branch_cd_META);
		p.NotePanel.add(p.Rcv_draw_branch_nm);
		p.Rcv_draw_branch_nm.setNextBeans(p.Rcv_note_rsn_cd);
		p.Rcv_draw_branch_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.draw_branch_nm_META);
		p.Rcv_note_rsn_cd.setListType(MCListType.STRICT);
		p.Rcv_note_rsn_cd.setLinkBeans(p.Rcv_note_rsn_nm);
		p.NotePanel.add(p.Rcv_note_rsn_cd_Label);
		p.NotePanel.add(p.Rcv_note_rsn_cd);
		p.Rcv_note_rsn_cd.setNextBeans(p.Rcv_note_rsn_nm);
		p.Rcv_note_rsn_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.note_rsn_cd_META);
		p.NotePanel.add(p.Rcv_note_rsn_nm);
		p.Rcv_note_rsn_nm.setNextBeans(p.Rcv_note_sub_char1);
		p.Rcv_note_rsn_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.note_rsn_nm_META);
		p.NotePanel.add(p.Rcv_note_sub_char1_Label);
		p.NotePanel.add(p.Rcv_note_sub_char1);
		p.Rcv_note_sub_char1.setNextBeans(p.Rcv_note_sub_char2);
		p.Rcv_note_sub_char1.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.note_sub_char1_META);
		p.NotePanel.add(p.Rcv_note_sub_char2_Label);
		p.NotePanel.add(p.Rcv_note_sub_char2);
		p.Rcv_note_sub_char2.setNextBeans(p.Rcv_note_sub_char3);
		p.Rcv_note_sub_char2.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.note_sub_char2_META);
		p.NotePanel.add(p.Rcv_note_sub_char3_Label);
		p.NotePanel.add(p.Rcv_note_sub_char3);
		p.Rcv_note_sub_char3.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.note_sub_char3_META);
		p.SetoffPanel.add(p.Rcv_setoff_rcv_no_Label);
		p.SetoffPanel.add(p.Rcv_setoff_rcv_no);
		p.SetoffPanel.setLastBeans(p.Rcv_setoff_rcv_no);
		p.Rcv_setoff_rcv_no.setNextBeans(p.Rcv_setoff_srch);
		p.Rcv_setoff_rcv_no.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_rcv_no_META);
		p.Rcv_setoff_srch.setIcon("SEARCH");
		p.Rcv_setoff_srch.setFunctionKey(MCFunctionKey.F3);
		p.SetoffPanel.add(p.Rcv_setoff_srch);
		p.Rcv_setoff_srch.setNextBeans(p.Rcv_setoff_dt);
		p.SetoffPanel.add(p.Rcv_setoff_dt_Label);
		p.SetoffPanel.add(p.Rcv_setoff_dt);
		p.Rcv_setoff_dt.setNextBeans(p.Rcv_setoff_bcst_cd);
		p.Rcv_setoff_dt.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_dt_META);
		p.Rcv_setoff_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.SetoffPanel.add(p.Rcv_setoff_bcst_cd_Label);
		p.SetoffPanel.add(p.Rcv_setoff_bcst_cd);
		p.Rcv_setoff_bcst_cd.setNextBeans(p.Rcv_setoff_bcst_nm);
		p.Rcv_setoff_bcst_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_bcst_cd_META);
		p.Rcv_setoff_bcst_cd.addLinkBeans(p.Rcv_setoff_bcst_nm);
		p.Rcv_setoff_bcst_cd.setListType(MCListType.STRICT);
		p.SetoffPanel.add(p.Rcv_setoff_bcst_nm);
		p.Rcv_setoff_bcst_nm.setNextBeans(p.Rcv_setoff_trd_cur_cd);
		p.Rcv_setoff_bcst_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_bcst_nm_META);
		p.Rcv_setoff_trd_cur_cd.setListType(MCListType.STRICT);
		p.Rcv_setoff_trd_cur_cd.setLinkBeans(p.Rcv_setoff_trd_cur_nm,p.Rcv_amt_dec_place);
		p.SetoffPanel.add(p.Rcv_setoff_trd_cur_cd_Label);
		p.SetoffPanel.add(p.Rcv_setoff_trd_cur_cd);
		p.Rcv_setoff_trd_cur_cd.setNextBeans(p.Rcv_setoff_trd_cur_nm);
		p.Rcv_setoff_trd_cur_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_trd_cur_cd_META);
		p.SetoffPanel.add(p.Rcv_setoff_trd_cur_nm);
		p.Rcv_setoff_trd_cur_nm.setNextBeans(p.Rcv_setoff_xrate_p_PPanel);
		p.Rcv_setoff_trd_cur_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_trd_cur_nm_META);
		p.SetoffPanel.add(p.Rcv_setoff_xrate_p_PPanel);
		p.Rcv_setoff_xrate_p_PPanel.setNextBeans(p.Rcv_setoff_rcv_amt_p_PPanel);
		p.RcvPanel.add(p.Rcv_setoff_xrate_cd);
		p.Rcv_setoff_xrate_cd.setNextBeans(p.Rcv_setoff_sls_purc_typ);
		p.Rcv_setoff_xrate_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_xrate_cd_META);
		p.SetoffPanel.add(p.Rcv_setoff_rcv_amt_p_PPanel);
		p.Rcv_setoff_rcv_amt_p_PPanel.setNextBeans(p.Rcv_setoff_not_proc_bal_p_PPanel);
		p.Rcv_setoff_rcv_amt_p_PPanel.Amt_amt.setMinusEnable(true);
		p.SetoffPanel.add(p.Rcv_setoff_not_proc_bal_p_PPanel);
		p.Rcv_setoff_not_proc_bal_p_PPanel.setNextBeans(p.Rcv_setoff_sttl_cd1);
		p.Rcv_setoff_sttl_cd1.setListType(MCListType.STRICT);
		p.Rcv_setoff_sttl_cd1.setLinkBeans(p.Rcv_setoff_sttl_nm1,p.Rcv_setoff_sls_purc_typ,p.Rcv_setoff_sttl_typ1,p.Rcv_setoff_debt_cred_id_typ,p.Rcv_setoff_tax_cd_sub);
		p.SetoffPanel.add(p.Rcv_setoff_sttl_cd1_Label);
		p.SetoffPanel.add(p.Rcv_setoff_sttl_cd1);
		p.Rcv_setoff_sttl_cd1.setNextBeans(p.Rcv_setoff_sttl_typ1);
		p.Rcv_setoff_sttl_cd1.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_sttl_cd1_META);
		p.SetoffPanel.add(p.Rcv_setoff_sttl_typ1);
		p.Rcv_setoff_sttl_typ1.setNextBeans(p.Rcv_setoff_sttl_nm1);
		p.Rcv_setoff_sttl_typ1.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_sttl_typ1_META);
		p.SetoffPanel.add(p.Rcv_setoff_sttl_nm1);
		p.Rcv_setoff_sttl_nm1.setNextBeans(p.Rcv_setoff_tax_cd_sub);
		p.Rcv_setoff_sttl_nm1.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_sttl_nm1_META);
		p.RcvPanel.add(p.Rcv_setoff_sls_purc_typ);
		p.Rcv_setoff_sls_purc_typ.setNextBeans(p.Rcv_setoff_purc_flg);
		p.Rcv_setoff_sls_purc_typ.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_sls_purc_typ_META);
		p.RcvPanel.add(p.Rcv_setoff_purc_flg);
		p.Rcv_setoff_purc_flg.setNextBeans(p.Rcv_setoff_sls_flg);
		p.Rcv_setoff_purc_flg.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_purc_flg_META);
		p.RcvPanel.add(p.Rcv_setoff_sls_flg);
		p.Rcv_setoff_sls_flg.setNextBeans(p.Rcv_amt_dec_place);
		p.Rcv_setoff_sls_flg.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_sls_flg_META);
		p.SetoffPanel.add(p.Rcv_setoff_tax_cd_sub);
		p.Rcv_setoff_tax_cd_sub.setNextBeans(p.Rcv_setoff_tax_cd);
		p.Rcv_setoff_tax_cd_sub.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_tax_cd_sub_META);
		p.Rcv_setoff_tax_cd.setListType(MCListType.STRICT);
		p.Rcv_setoff_tax_cd.setLinkBeans(p.Rcv_setoff_tax_nm,p.Rcv_setoff_tax_rate);
		p.SetoffPanel.add(p.Rcv_setoff_tax_cd_Label);
		p.SetoffPanel.add(p.Rcv_setoff_tax_cd);
		p.Rcv_setoff_tax_cd.setNextBeans(p.Rcv_setoff_tax_nm);
		p.Rcv_setoff_tax_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_tax_cd_META);
		p.SetoffPanel.add(p.Rcv_setoff_tax_nm);
		p.Rcv_setoff_tax_nm.setNextBeans(p.Rcv_setoff_tax_rate);
		p.Rcv_setoff_tax_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_tax_nm_META);
		p.SetoffPanel.add(p.Rcv_setoff_tax_rate_Label);
		p.SetoffPanel.add(p.Rcv_setoff_tax_rate);
		p.Rcv_setoff_tax_rate.setNextBeans(p.Rcv_setoff_debt_cred_id_typ);
		p.Rcv_setoff_tax_rate.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_tax_rate_META);
		p.Rcv_setoff_debt_cred_id_typ.setListType(MCListType.STRICT);
		p.Rcv_setoff_debt_cred_id_typ.setLinkBeans(p.Rcv_setoff_debt_cred_id_typ_nm);
		p.SetoffPanel.add(p.Rcv_setoff_debt_cred_id_typ_Label);
		p.SetoffPanel.add(p.Rcv_setoff_debt_cred_id_typ);
		p.Rcv_setoff_debt_cred_id_typ.setNextBeans(p.Rcv_setoff_debt_cred_id_typ_nm);
		p.Rcv_setoff_debt_cred_id_typ.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_debt_cred_id_typ_META);
		p.SetoffPanel.add(p.Rcv_setoff_debt_cred_id_typ_nm);
		p.Rcv_setoff_debt_cred_id_typ_nm.setNextBeans(p.Rcv_setoff_debt_cred_id_cd);
		p.Rcv_setoff_debt_cred_id_typ_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_debt_cred_id_typ_nm_META);
		p.SetoffPanel.add(p.Rcv_setoff_debt_cred_id_cd);
		p.Rcv_setoff_debt_cred_id_cd.setNextBeans(p.Rcv_setoff_debt_cred_nm);
		p.Rcv_setoff_debt_cred_id_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_debt_cred_id_cd_META);
		p.Rcv_setoff_debt_cred_id_cd.addLinkBeans(p.Rcv_setoff_debt_cred_nm);
		p.Rcv_setoff_debt_cred_id_cd.setListType(MCListType.STRICT);
		p.SetoffPanel.add(p.Rcv_setoff_debt_cred_nm);
		p.Rcv_setoff_debt_cred_nm.setNextBeans(p.Rcv_setoff_bd_dpt_cd);
		p.Rcv_setoff_debt_cred_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_debt_cred_nm_META);
		p.SetoffPanel.add(p.Rcv_setoff_bd_dpt_cd_Label);
		p.SetoffPanel.add(p.Rcv_setoff_bd_dpt_cd);
		p.Rcv_setoff_bd_dpt_cd.setNextBeans(p.Rcv_setoff_bd_dpt_nm);
		p.Rcv_setoff_bd_dpt_cd.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_bd_dpt_cd_META);
		p.Rcv_setoff_bd_dpt_cd.addLinkBeans(p.Rcv_setoff_bd_dpt_nm);
		p.Rcv_setoff_bd_dpt_cd.setListType(MCListType.STRICT);
		p.SetoffPanel.add(p.Rcv_setoff_bd_dpt_nm);
		p.Rcv_setoff_bd_dpt_nm.setNextBeans(p.Rcv_setoff_rcv_dat_typ);
		p.Rcv_setoff_bd_dpt_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_bd_dpt_nm_META);
		p.SetoffPanel.add(p.Rcv_setoff_rcv_dat_typ_Label);
		p.SetoffPanel.add(p.Rcv_setoff_rcv_dat_typ);
		p.Rcv_setoff_rcv_dat_typ.setNextBeans(p.Rcv_setoff_rcv_dat_typ_nm);
		p.Rcv_setoff_rcv_dat_typ.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_rcv_dat_typ_META);
		p.SetoffPanel.add(p.Rcv_setoff_rcv_dat_typ_nm);
		p.Rcv_setoff_rcv_dat_typ_nm.setNextBeans(p.Rcv_setoff_trd_rmrks);
		p.Rcv_setoff_rcv_dat_typ_nm.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_rcv_dat_typ_nm_META);
		p.SetoffPanel.add(p.Rcv_setoff_trd_rmrks_Label);
		p.SetoffPanel.add(p.Rcv_setoff_trd_rmrks);
		p.Rcv_setoff_trd_rmrks.setNextBeans(p.Rcv_setoff_sub_char1);
		p.Rcv_setoff_trd_rmrks.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_trd_rmrks_META);
		p.SetoffPanel.add(p.Rcv_setoff_sub_char1_Label);
		p.SetoffPanel.add(p.Rcv_setoff_sub_char1);
		p.Rcv_setoff_sub_char1.setNextBeans(p.Rcv_setoff_sub_char2);
		p.Rcv_setoff_sub_char1.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_sub_char1_META);
		p.SetoffPanel.add(p.Rcv_setoff_sub_char2_Label);
		p.SetoffPanel.add(p.Rcv_setoff_sub_char2);
		p.Rcv_setoff_sub_char2.setNextBeans(p.Rcv_setoff_sub_char3);
		p.Rcv_setoff_sub_char2.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_sub_char2_META);
		p.SetoffPanel.add(p.Rcv_setoff_sub_char3_Label);
		p.SetoffPanel.add(p.Rcv_setoff_sub_char3);
		p.Rcv_setoff_sub_char3.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.setoff_sub_char3_META);
		p.RcvPanel.add(p.Rcv_amt_dec_place);
		p.Rcv_amt_dec_place.setNextBeans(p.Rcv_upri_dec_place);
		p.Rcv_amt_dec_place.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.amt_dec_place_META);
		p.RcvPanel.add(p.Rcv_upri_dec_place);
		p.Rcv_upri_dec_place.setRow(p.getRcvR(), mcframe.clientMSBG.MSBGP0210.RcvR.upri_dec_place_META);
	}

	/**
	 * [Note]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitNote(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.NotePanel.setNextBeans(p.SetoffPanel);
		// ブロックの項目の初期化
	}

	/**
	 * [Setoff]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSetoff(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [DtlCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlCnd(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.DtlCndPanel.setBorder(p.DtlCndTitledBorder);
		p.add(p.DtlCndPanel);
		p.DtlCndPanel.setNextBeans(p.TotalPanel);
		p.DtlCndPanel.setLayoutPosition("CTN");
		// ブロックの項目の初期化
		p.DtlCndPanel.add(p.DtlCnd_narrow_down_flg);
		p.DtlCndPanel.setLastBeans(p.DtlCnd_narrow_down_flg);
		p.DtlCnd_narrow_down_flg.setNextBeans(p.DtlCnd_not_bill_flg);
		p.DtlCnd_narrow_down_flg.setRow(p.getDtlCndR(), mcframe.clientMSBG.MSBGP0210.DtlCndR.narrow_down_flg_META);
		p.DtlCndPanel.add(p.DtlCnd_not_bill_flg);
		p.DtlCnd_not_bill_flg.setNextBeans(p.DtlCnd_incl_appl_flg);
		p.DtlCnd_not_bill_flg.setRow(p.getDtlCndR(), mcframe.clientMSBG.MSBGP0210.DtlCndR.not_bill_flg_META);
		p.DtlCndPanel.add(p.DtlCnd_incl_appl_flg);
		p.DtlCnd_incl_appl_flg.setNextBeans(p.DtlCnd_zero_flg);
		p.DtlCnd_incl_appl_flg.setRow(p.getDtlCndR(), mcframe.clientMSBG.MSBGP0210.DtlCndR.incl_appl_flg_META);
		p.DtlCndPanel.add(p.DtlCnd_zero_flg);
		p.DtlCnd_zero_flg.setNextBeans(p.DtlCnd_slo_flg);
		p.DtlCnd_zero_flg.setRow(p.getDtlCndR(), mcframe.clientMSBG.MSBGP0210.DtlCndR.zero_flg_META);
		p.DtlCndPanel.add(p.DtlCnd_slo_flg);
		p.DtlCnd_slo_flg.setNextBeans(p.DtlCnd_rcv_schd_dt);
		p.DtlCnd_slo_flg.setRow(p.getDtlCndR(), mcframe.clientMSBG.MSBGP0210.DtlCndR.slo_flg_META);
		p.DtlCndPanel.add(p.DtlCnd_rcv_schd_dt_Label);
		p.DtlCndPanel.add(p.DtlCnd_rcv_schd_dt);
		p.DtlCnd_rcv_schd_dt.setNextBeans(p.DtlCnd_srch);
		p.DtlCnd_rcv_schd_dt.setRow(p.getDtlCndR(), mcframe.clientMSBG.MSBGP0210.DtlCndR.rcv_schd_dt_META);
		p.DtlCnd_rcv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlCnd_srch.setIcon("SEARCH");
		p.DtlCnd_srch.setFunctionKey(MCFunctionKey.F4);
		p.DtlCndPanel.add(p.DtlCnd_srch);
	}

	/**
	 * [Total]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTotal(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.TotalPanel.setBorder(p.TotalTitledBorder);
		p.add(p.TotalPanel);
		p.TotalPanel.setNextBeans(p.DtlPanel);
		p.TotalPanel.setLayoutPosition("CTC");
		// ブロックの項目の初期化
		p.TotalPanel.add(p.Total_total_rcv_amt_p_PPanel);
		p.TotalPanel.setLastBeans(p.Total_total_rcv_amt_p_PPanel);
		p.Total_total_rcv_amt_p_PPanel.setNextBeans(p.Total_total_setoff_rcv_amt_p_PPanel);
		p.TotalPanel.add(p.Total_total_setoff_rcv_amt_p_PPanel);
		p.Total_total_setoff_rcv_amt_p_PPanel.setNextBeans(p.Total_total_setoff_rcv_amt2_p_PPanel);
		p.TotalPanel.add(p.Total_total_setoff_rcv_amt2_p_PPanel);
		p.Total_total_setoff_rcv_amt2_p_PPanel.setNextBeans(p.Total_total_appl_amt_p_PPanel);
		p.TotalPanel.add(p.Total_total_appl_amt_p_PPanel);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBS");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBGP_ArApplReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.BtnPanel.setLastBeans(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_open_MSBGP0220);
		p.Btn_open_MSBGP0220.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBGP0220);
		p.Btn_open_MSBGP0220.setNextBeans(p.Btn_ins);
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
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
	protected static void jbInitEastBtn(MSBGP_ArApplReg p) {
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
		MSBGP_ArApplReg_MC.mcInitScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.mcInitCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.mcInitHdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.mcInitHdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.mcInitSys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.mcInitRcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.mcInitRcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.mcInitNote((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.mcInitSetoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.mcInitDtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.mcInitTotal((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.mcInitDtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.mcInitBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.mcInitEastBtn((MSBGP_ArApplReg)this);

		// [INS]ステータスのモードの設定
		MSBGP_ArApplReg_MC.statusInitINS_ScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS_Cnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS_HdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS_Hdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS_Sys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS_RcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS_Rcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS_Note((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS_Setoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS_DtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS_Total((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS_Dtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS_BillD((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS_Btn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS_EastBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS_Srch__Cnd((MSBGP_ArApplReg)this);

		// [INS_SRCH_RCV]ステータスのモードの設定
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV_ScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV_Cnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV_HdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV_Hdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV_Sys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV_RcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV_Rcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV_Note((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV_Setoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV_DtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV_Total((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV_Dtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV_BillD((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV_Btn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV_EastBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV_Srch__Cnd((MSBGP_ArApplReg)this);

		// [INS_REF_RCV]ステータスのモードの設定
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV_ScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV_Cnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV_HdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV_Hdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV_Sys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV_RcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV_Rcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV_Note((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV_Setoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV_DtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV_Total((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV_Dtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV_BillD((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV_Btn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV_EastBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV_Srch__Cnd((MSBGP_ArApplReg)this);

		// [SRCH]ステータスのモードの設定
		MSBGP_ArApplReg_MC.statusInitSRCH_ScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitSRCH_Cnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitSRCH_HdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitSRCH_Hdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitSRCH_Sys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitSRCH_RcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitSRCH_Rcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitSRCH_Note((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitSRCH_Setoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitSRCH_DtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitSRCH_Total((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitSRCH_Dtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitSRCH_BillD((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitSRCH_Btn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitSRCH_EastBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitSRCH_Srch__Cnd((MSBGP_ArApplReg)this);

		// [UPD]ステータスのモードの設定
		MSBGP_ArApplReg_MC.statusInitUPD_ScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD_Cnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD_HdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD_Hdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD_Sys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD_RcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD_Rcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD_Note((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD_Setoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD_DtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD_Total((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD_Dtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD_BillD((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD_Btn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD_EastBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD_Srch__Cnd((MSBGP_ArApplReg)this);

		// [UPD_SRCH_RCV]ステータスのモードの設定
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV_ScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV_Cnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV_HdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV_Hdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV_Sys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV_RcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV_Rcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV_Note((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV_Setoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV_DtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV_Total((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV_Dtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV_BillD((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV_Btn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV_EastBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV_Srch__Cnd((MSBGP_ArApplReg)this);

		// [UPD_REF_RCV]ステータスのモードの設定
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV_ScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV_Cnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV_HdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV_Hdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV_Sys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV_RcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV_Rcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV_Note((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV_Setoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV_DtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV_Total((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV_Dtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV_BillD((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV_Btn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV_EastBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV_Srch__Cnd((MSBGP_ArApplReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBGP_ArApplReg_MC.statusInitFIX__U_ScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__U_Cnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__U_HdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__U_Hdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__U_Sys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__U_RcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__U_Rcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__U_Note((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__U_Setoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__U_DtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__U_Total((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__U_Dtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__U_BillD((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__U_Btn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__U_EastBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__U_Srch__Cnd((MSBGP_ArApplReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBGP_ArApplReg_MC.statusInitFIX__D_ScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__D_Cnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__D_HdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__D_Hdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__D_Sys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__D_RcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__D_Rcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__D_Note((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__D_Setoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__D_DtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__D_Total((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__D_Dtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__D_BillD((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__D_Btn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__D_EastBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__D_Srch__Cnd((MSBGP_ArApplReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBGP_ArApplReg_MC.statusInitFIX__I_ScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__I_Cnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__I_HdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__I_Hdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__I_Sys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__I_RcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__I_Rcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__I_Note((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__I_Setoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__I_DtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__I_Total((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__I_Dtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__I_BillD((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__I_Btn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__I_EastBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitFIX__I_Srch__Cnd((MSBGP_ArApplReg)this);

		// [DEL]ステータスのモードの設定
		MSBGP_ArApplReg_MC.statusInitDEL_ScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitDEL_Cnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitDEL_HdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitDEL_Hdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitDEL_Sys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitDEL_RcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitDEL_Rcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitDEL_Note((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitDEL_Setoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitDEL_DtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitDEL_Total((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitDEL_Dtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitDEL_BillD((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitDEL_Btn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitDEL_EastBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitDEL_Srch__Cnd((MSBGP_ArApplReg)this);

		// [REF]ステータスのモードの設定
		MSBGP_ArApplReg_MC.statusInitREF_ScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitREF_Cnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitREF_HdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitREF_Hdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitREF_Sys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitREF_RcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitREF_Rcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitREF_Note((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitREF_Setoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitREF_DtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitREF_Total((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitREF_Dtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitREF_BillD((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitREF_Btn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitREF_EastBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitREF_Srch__Cnd((MSBGP_ArApplReg)this);

		// [NO_SLIP_CD]ステータスのモードの設定
		MSBGP_ArApplReg_MC.statusInitNO__SLIP__CD_ScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitNO__SLIP__CD_Cnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitNO__SLIP__CD_HdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitNO__SLIP__CD_Hdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitNO__SLIP__CD_Sys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitNO__SLIP__CD_RcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitNO__SLIP__CD_Rcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitNO__SLIP__CD_Note((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitNO__SLIP__CD_Setoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitNO__SLIP__CD_DtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitNO__SLIP__CD_Total((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitNO__SLIP__CD_Dtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitNO__SLIP__CD_BillD((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitNO__SLIP__CD_Btn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitNO__SLIP__CD_EastBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitNO__SLIP__CD_Srch__Cnd((MSBGP_ArApplReg)this);

		// [INS_SETOFF]ステータスのモードの設定
		MSBGP_ArApplReg_MC.statusInitINS__SETOFF_ScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SETOFF_Cnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SETOFF_HdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SETOFF_Hdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SETOFF_Sys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SETOFF_RcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SETOFF_Rcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SETOFF_Note((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SETOFF_Setoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SETOFF_DtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SETOFF_Total((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SETOFF_Dtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SETOFF_BillD((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SETOFF_Btn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SETOFF_EastBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SETOFF_Srch__Cnd((MSBGP_ArApplReg)this);

		// [INS_SRCH_RCV_SETOFF]ステータスのモードの設定
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV__SETOFF_ScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV__SETOFF_Cnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV__SETOFF_HdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV__SETOFF_Hdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV__SETOFF_Sys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV__SETOFF_RcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV__SETOFF_Rcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV__SETOFF_Note((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV__SETOFF_Setoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV__SETOFF_DtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV__SETOFF_Total((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV__SETOFF_Dtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV__SETOFF_BillD((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV__SETOFF_Btn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV__SETOFF_EastBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__SRCH__RCV__SETOFF_Srch__Cnd((MSBGP_ArApplReg)this);

		// [INS_REF_RCV_SETOFF]ステータスのモードの設定
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV__SETOFF_ScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV__SETOFF_Cnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV__SETOFF_HdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV__SETOFF_Hdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV__SETOFF_Sys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV__SETOFF_RcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV__SETOFF_Rcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV__SETOFF_Note((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV__SETOFF_Setoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV__SETOFF_DtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV__SETOFF_Total((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV__SETOFF_Dtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV__SETOFF_BillD((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV__SETOFF_Btn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV__SETOFF_EastBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitINS__REF__RCV__SETOFF_Srch__Cnd((MSBGP_ArApplReg)this);

		// [UPD_SETOFF]ステータスのモードの設定
		MSBGP_ArApplReg_MC.statusInitUPD__SETOFF_ScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SETOFF_Cnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SETOFF_HdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SETOFF_Hdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SETOFF_Sys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SETOFF_RcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SETOFF_Rcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SETOFF_Note((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SETOFF_Setoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SETOFF_DtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SETOFF_Total((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SETOFF_Dtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SETOFF_BillD((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SETOFF_Btn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SETOFF_EastBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SETOFF_Srch__Cnd((MSBGP_ArApplReg)this);

		// [UPD_SRCH_RCV_SETOFF]ステータスのモードの設定
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV__SETOFF_ScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV__SETOFF_Cnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV__SETOFF_HdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV__SETOFF_Hdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV__SETOFF_Sys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV__SETOFF_RcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV__SETOFF_Rcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV__SETOFF_Note((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV__SETOFF_Setoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV__SETOFF_DtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV__SETOFF_Total((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV__SETOFF_Dtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV__SETOFF_BillD((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV__SETOFF_Btn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV__SETOFF_EastBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__SRCH__RCV__SETOFF_Srch__Cnd((MSBGP_ArApplReg)this);

		// [UPD_REF_RCV_SETOFF]ステータスのモードの設定
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV__SETOFF_ScreenOpe((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV__SETOFF_Cnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV__SETOFF_HdrTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV__SETOFF_Hdr((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV__SETOFF_Sys((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV__SETOFF_RcvTab((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV__SETOFF_Rcv((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV__SETOFF_Note((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV__SETOFF_Setoff((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV__SETOFF_DtlCnd((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV__SETOFF_Total((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV__SETOFF_Dtl((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV__SETOFF_BillD((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV__SETOFF_Btn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV__SETOFF_EastBtn((MSBGP_ArApplReg)this);
		MSBGP_ArApplReg_MC.statusInitUPD__REF__RCV__SETOFF_Srch__Cnd((MSBGP_ArApplReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBGP_ArApplReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBGP_ArApplReg p) {
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
	protected static void mcInitHdrTab(MSBGP_ArApplReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBGP_ArApplReg p) {
		p.Hdr_trd_cd.setListListener(p);
		p.Hdr_trd_cd.addAllListener(p);
		p.Hdr_trd_ptn_typ.setListListener(p);
		p.Hdr_trd_ptn_typ.addAllListener(p);
		p.Hdr_ar_trd_grp_typ.setListListener(p);
		p.Hdr_ar_trd_grp_typ.addAllListener(p);
		p.Hdr_trd_nm.setListListener(p);
		p.Hdr_trd_nm.addAllListener(p);
		p.Hdr_ac_ym.setListListener(p);
		p.Hdr_ac_ym.addAllListener(p);
		p.Hdr_rcv_act_no.setListListener(p);
		p.Hdr_rcv_act_no.addAllListener(p);
		p.Hdr_rcv_act_rev.setListListener(p);
		p.Hdr_rcv_act_rev.addAllListener(p);
		p.Hdr_latest_flg.addAllListener(p);
		p.Hdr_ac_dt.setListListener(p);
		p.Hdr_ac_dt.addAllListener(p);
		p.Hdr_bill_basis_dt.setListListener(p);
		p.Hdr_bill_basis_dt.addAllListener(p);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
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
		p.Hdr_def_bank_ac_cd.setListListener(p);
		p.Hdr_def_bank_ac_cd.addAllListener(p);
	}

	/**
	 *  [Sys]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSys(MSBGP_ArApplReg p) {
	}

	/**
	 *  [RcvTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRcvTab(MSBGP_ArApplReg p) {
		p.RcvTabTab.addAllListener(p);
	}

	/**
	 *  [Rcv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRcv(MSBGP_ArApplReg p) {
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
		p.Rcv_ar_sttl_typ2.setListListener(p);
		p.Rcv_ar_sttl_typ2.addAllListener(p);
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
		p.Rcv_debt_cred_id_typ.setListListener(p);
		p.Rcv_debt_cred_id_typ.addAllListener(p);
		p.Rcv_debt_cred_id_typ_nm.setListListener(p);
		p.Rcv_debt_cred_id_typ_nm.addAllListener(p);
		p.Rcv_debt_cred_id_cd.setListListener(p);
		p.Rcv_debt_cred_id_cd.addAllListener(p);
		p.Rcv_debt_cred_nm.setListListener(p);
		p.Rcv_debt_cred_nm.addAllListener(p);
		p.Rcv_bd_dpt_cd.setListListener(p);
		p.Rcv_bd_dpt_cd.addAllListener(p);
		p.Rcv_bd_dpt_nm.setListListener(p);
		p.Rcv_bd_dpt_nm.addAllListener(p);
		p.Rcv_rcv_dat_typ.setListListener(p);
		p.Rcv_rcv_dat_typ.addAllListener(p);
		p.Rcv_rcv_dat_typ_nm.setListListener(p);
		p.Rcv_rcv_dat_typ_nm.addAllListener(p);
		p.Rcv_adv_trd_cd.setListListener(p);
		p.Rcv_adv_trd_cd.addAllListener(p);
		p.Rcv_adv_trd_nm.setListListener(p);
		p.Rcv_adv_trd_nm.addAllListener(p);
		p.Rcv_trd_rmrks.setListListener(p);
		p.Rcv_trd_rmrks.addAllListener(p);
		p.Rcv_sub_char1.setListListener(p);
		p.Rcv_sub_char1.addAllListener(p);
		p.Rcv_sub_char2.setListListener(p);
		p.Rcv_sub_char2.addAllListener(p);
		p.Rcv_sub_char3.setListListener(p);
		p.Rcv_sub_char3.addAllListener(p);
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
		p.Rcv_setoff_rcv_no.setListListener(p);
		p.Rcv_setoff_rcv_no.addAllListener(p);
		p.Rcv_setoff_srch.addAllListener(p);
		p.Rcv_setoff_srch.setAPMethodName("doRcv_setoff_srch");
		p.Rcv_setoff_dt.setListListener(p);
		p.Rcv_setoff_dt.addAllListener(p);
		p.Rcv_setoff_bcst_cd.setListListener(p);
		p.Rcv_setoff_bcst_cd.addAllListener(p);
		p.Rcv_setoff_bcst_nm.setListListener(p);
		p.Rcv_setoff_bcst_nm.addAllListener(p);
		p.Rcv_setoff_trd_cur_cd.setListListener(p);
		p.Rcv_setoff_trd_cur_cd.addAllListener(p);
		p.Rcv_setoff_trd_cur_nm.setListListener(p);
		p.Rcv_setoff_trd_cur_nm.addAllListener(p);
		p.Rcv_setoff_xrate_cd.setListListener(p);
		p.Rcv_setoff_xrate_cd.addAllListener(p);
		p.Rcv_setoff_sttl_cd1.setListListener(p);
		p.Rcv_setoff_sttl_cd1.addAllListener(p);
		p.Rcv_setoff_sttl_typ1.setListListener(p);
		p.Rcv_setoff_sttl_typ1.addAllListener(p);
		p.Rcv_setoff_sttl_nm1.setListListener(p);
		p.Rcv_setoff_sttl_nm1.addAllListener(p);
		p.Rcv_setoff_sls_purc_typ.setListListener(p);
		p.Rcv_setoff_sls_purc_typ.addAllListener(p);
		p.Rcv_setoff_purc_flg.addAllListener(p);
		p.Rcv_setoff_sls_flg.addAllListener(p);
		p.Rcv_setoff_tax_cd_sub.setListListener(p);
		p.Rcv_setoff_tax_cd_sub.addAllListener(p);
		p.Rcv_setoff_tax_cd.setListListener(p);
		p.Rcv_setoff_tax_cd.addAllListener(p);
		p.Rcv_setoff_tax_nm.setListListener(p);
		p.Rcv_setoff_tax_nm.addAllListener(p);
		p.Rcv_setoff_tax_rate.setListListener(p);
		p.Rcv_setoff_tax_rate.addAllListener(p);
		p.Rcv_setoff_debt_cred_id_typ.setListListener(p);
		p.Rcv_setoff_debt_cred_id_typ.addAllListener(p);
		p.Rcv_setoff_debt_cred_id_typ_nm.setListListener(p);
		p.Rcv_setoff_debt_cred_id_typ_nm.addAllListener(p);
		p.Rcv_setoff_debt_cred_id_cd.setListListener(p);
		p.Rcv_setoff_debt_cred_id_cd.addAllListener(p);
		p.Rcv_setoff_debt_cred_nm.setListListener(p);
		p.Rcv_setoff_debt_cred_nm.addAllListener(p);
		p.Rcv_setoff_bd_dpt_cd.setListListener(p);
		p.Rcv_setoff_bd_dpt_cd.addAllListener(p);
		p.Rcv_setoff_bd_dpt_nm.setListListener(p);
		p.Rcv_setoff_bd_dpt_nm.addAllListener(p);
		p.Rcv_setoff_rcv_dat_typ.setListListener(p);
		p.Rcv_setoff_rcv_dat_typ.addAllListener(p);
		p.Rcv_setoff_rcv_dat_typ_nm.setListListener(p);
		p.Rcv_setoff_rcv_dat_typ_nm.addAllListener(p);
		p.Rcv_setoff_trd_rmrks.setListListener(p);
		p.Rcv_setoff_trd_rmrks.addAllListener(p);
		p.Rcv_setoff_sub_char1.setListListener(p);
		p.Rcv_setoff_sub_char1.addAllListener(p);
		p.Rcv_setoff_sub_char2.setListListener(p);
		p.Rcv_setoff_sub_char2.addAllListener(p);
		p.Rcv_setoff_sub_char3.setListListener(p);
		p.Rcv_setoff_sub_char3.addAllListener(p);
		p.Rcv_amt_dec_place.setListListener(p);
		p.Rcv_amt_dec_place.addAllListener(p);
		p.Rcv_upri_dec_place.setListListener(p);
		p.Rcv_upri_dec_place.addAllListener(p);
	}

	/**
	 *  [Note]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitNote(MSBGP_ArApplReg p) {
	}

	/**
	 *  [Setoff]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSetoff(MSBGP_ArApplReg p) {
	}

	/**
	 *  [DtlCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlCnd(MSBGP_ArApplReg p) {
		p.DtlCnd_narrow_down_flg.addAllListener(p);
		p.DtlCnd_not_bill_flg.addAllListener(p);
		p.DtlCnd_incl_appl_flg.addAllListener(p);
		p.DtlCnd_zero_flg.addAllListener(p);
		p.DtlCnd_slo_flg.addAllListener(p);
		p.DtlCnd_rcv_schd_dt.setListListener(p);
		p.DtlCnd_rcv_schd_dt.addAllListener(p);
		p.DtlCnd_srch.addAllListener(p);
		p.DtlCnd_srch.setAPMethodName("doDtlCnd_srch");
	}

	/**
	 *  [Total]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTotal(MSBGP_ArApplReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBGP_ArApplReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_rcv_schd_dt.addAllListener(p);
		p.columnDtl_rcv_schd_dt.setListListener(p);
		p.columnDtl_ar_sttl_cd1.addAllListener(p);
		p.columnDtl_ar_sttl_cd1.setListListener(p);
		p.columnDtl_ar_sttl_nm1.addAllListener(p);
		p.columnDtl_ar_sttl_nm1.setListListener(p);
		p.columnDtl_ar_sttl_typ1.addAllListener(p);
		p.columnDtl_ar_sttl_typ1.setListListener(p);
		p.columnDtl_iv_no.addAllListener(p);
		p.columnDtl_iv_no.setListListener(p);
		p.columnDtl_wrk_no.addAllListener(p);
		p.columnDtl_wrk_no.setListListener(p);
		p.columnDtl_wrk_nm.addAllListener(p);
		p.columnDtl_wrk_nm.setListListener(p);
		p.columnDtl_acst_cd.addAllListener(p);
		p.columnDtl_acst_cd.setListListener(p);
		p.columnDtl_acst_nm.addAllListener(p);
		p.columnDtl_acst_nm.setListListener(p);
		p.columnDtl_ar_dpt_cd.addAllListener(p);
		p.columnDtl_ar_dpt_cd.setListListener(p);
		p.columnDtl_ar_dpt_nm.addAllListener(p);
		p.columnDtl_ar_dpt_nm.setListListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_wg_nm.addAllListener(p);
		p.columnDtl_wg_nm.setListListener(p);
		p.columnDtl_ar_typ.addAllListener(p);
		p.columnDtl_ar_typ.setListListener(p);
		p.columnDtl_ar_typ_nm.addAllListener(p);
		p.columnDtl_ar_typ_nm.setListListener(p);
		p.columnDtl_bill_ym.addAllListener(p);
		p.columnDtl_bill_ym.setListListener(p);
		p.columnDtl_bill_cl_day.addAllListener(p);
		p.columnDtl_bill_cl_day.setListListener(p);
		p.columnDtl_bill_no.addAllListener(p);
		p.columnDtl_bill_no.setListListener(p);
		p.columnDtl_bcst_cd.addAllListener(p);
		p.columnDtl_bcst_cd.setListListener(p);
		p.columnDtl_bcst_nm.addAllListener(p);
		p.columnDtl_bcst_nm.setListListener(p);
		p.columnDtl_bill_dpt_cd.addAllListener(p);
		p.columnDtl_bill_dpt_cd.setListListener(p);
		p.columnDtl_bill_dpt_nm.addAllListener(p);
		p.columnDtl_bill_dpt_nm.setListListener(p);
		p.columnDtl_bill_d_rmrks.addAllListener(p);
		p.columnDtl_bill_d_rmrks.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBGP_ArApplReg p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_open_MSBGP0220.addAllListener(p);
		p.Btn_open_MSBGP0220.setAPMethodName("doBtn_open_MSBGP0220");
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
	protected static void mcInitEastBtn(MSBGP_ArApplReg p) {
	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBGP_ArApplReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBGP_ArApplReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_rcv_act_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBGP_ArApplReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBGP_ArApplReg p){
		p.Hdr_trd_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_trd_ptn_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ar_trd_grp_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, INS, MCMode.ENABLE);
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
		p.Hdr_def_bank_ac_cd.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitINS_Sys(MSBGP_ArApplReg p){

	}

	/**
	 * [INS]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_RcvTab(MSBGP_ArApplReg p){

	}

	/**
	 * [INS]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rcv(MSBGP_ArApplReg p){
		p.Rcv_rcv_no.putMode(p, INS, MCMode.ENABLE);
		p.Rcv_srch.putMode(p, INS, MCMode.ENABLE);
		p.Rcv_slo_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_rcv_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Rcv_rcst_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Rcv_rcst_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Rcv_trd_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
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
		p.Rcv_xfr_psn.putMode(p, INS, MCMode.ENABLE);
		p.Rcv_ar_sttl_cd2.putMode(p, INS, MCMode.ENABLE);
		p.Rcv_ar_sttl_typ2.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm2.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, INS, MCMode.ENABLE);
		p.Rcv_tax_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ.putMode(p, INS, MCMode.REQUIRED);
		p.Rcv_debt_cred_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Rcv_debt_cred_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Rcv_bd_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_adv_trd_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_adv_trd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Rcv_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Rcv_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Rcv_sub_char3.putMode(p, INS, MCMode.ENABLE);
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
		p.Rcv_setoff_rcv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_srch.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_setoff_xrate_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_setoff_rcv_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_not_proc_bal_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_sttl_cd1.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_sttl_typ1.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_setoff_sttl_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_sls_purc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_setoff_purc_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_setoff_sls_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd_sub.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_rate.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitINS_Note(MSBGP_ArApplReg p){

	}

	/**
	 * [INS]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitINS_Setoff(MSBGP_ArApplReg p){

	}

	/**
	 * [INS]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_DtlCnd(MSBGP_ArApplReg p){
		p.DtlCnd_narrow_down_flg.putMode(p, INS, MCMode.ENABLE);
		p.DtlCnd_not_bill_flg.putMode(p, INS, MCMode.ENABLE);
		p.DtlCnd_incl_appl_flg.putMode(p, INS, MCMode.ENABLE);
		p.DtlCnd_zero_flg.putMode(p, INS, MCMode.ENABLE);
		p.DtlCnd_slo_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.DtlCnd_rcv_schd_dt.putMode(p, INS, MCMode.ENABLE);
		p.DtlCnd_srch.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitINS_Total(MSBGP_ArApplReg p){
		p.Total_total_rcv_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt2_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_appl_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl(MSBGP_ArApplReg p){
		p.columnDtl_check.putMode(p, INS, MCMode.REQUIRED);
		p.Dtl_appl_tgt_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt1_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Dtl_amt2_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt4_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_not_appl_bal_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_cd1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ1.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_wrk_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_wrk_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ar_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ar_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bill_ym.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bill_cl_day.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bill_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bill_d_rmrks.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[BillD]ブロックのモードの設定
	 */
	protected static void statusInitINS_BillD(MSBGP_ArApplReg p){

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBGP_ArApplReg p){
		p.Btn_select_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_MSBGP0220.putMode(p, INS, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS, MCMode.DISABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBGP_ArApplReg p){

	}

	/**
	 * [INS]ステータスの[Srch_Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Srch__Cnd(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SRCH_RCV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV_ScreenOpe(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SRCH_RCV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV_Cnd(MSBGP_ArApplReg p){
		p.Cnd_ope_Group.putMode(p, INS_SRCH_RCV, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Cnd_rcv_act_rev.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS_SRCH_RCV, MCMode.DISABLE);

	}

	/**
	 * [INS_SRCH_RCV]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV_HdrTab(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SRCH_RCV]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV_Hdr(MSBGP_ArApplReg p){
		p.Hdr_trd_cd.putMode(p, INS_SRCH_RCV, MCMode.REQUIRED);
		p.Hdr_trd_ptn_typ.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);
		p.Hdr_ar_trd_grp_typ.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, INS_SRCH_RCV, MCMode.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS_SRCH_RCV, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, INS_SRCH_RCV, MCMode.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.putStatus(INS_SRCH_RCV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, INS_SRCH_RCV, MCMode.ENABLE);
		p.Hdr_wg_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_def_bank_ac_cd.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);

	}

	/**
	 * [INS_SRCH_RCV]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV_Sys(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SRCH_RCV]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV_RcvTab(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SRCH_RCV]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV_Rcv(MSBGP_ArApplReg p){
		p.Rcv_rcv_no.putMode(p, INS_SRCH_RCV, MCMode.ENABLE);
		p.Rcv_srch.putMode(p, INS_SRCH_RCV, MCMode.ENABLE);
		p.Rcv_slo_no.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_rcv_dt.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_xrate_p_PPanel.putStatus(INS_SRCH_RCV, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(INS_SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(INS_SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ2.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm2.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_debt_cred_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_adv_trd_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_adv_trd_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, INS_SRCH_RCV, MCMode.ENABLE);
		p.Rcv_sub_char1.putMode(p, INS_SRCH_RCV, MCMode.ENABLE);
		p.Rcv_sub_char2.putMode(p, INS_SRCH_RCV, MCMode.ENABLE);
		p.Rcv_sub_char3.putMode(p, INS_SRCH_RCV, MCMode.ENABLE);
		p.Rcv_note_no.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_no.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_srch.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_dt.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_xrate_p_PPanel.putStatus(INS_SRCH_RCV, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_setoff_xrate_cd.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_rcv_amt_p_PPanel.putStatus(INS_SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_not_proc_bal_p_PPanel.putStatus(INS_SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_sttl_cd1.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_sttl_typ1.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_sttl_nm1.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_sls_purc_typ.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_purc_flg.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_sls_flg.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd_sub.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_rate.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_rmrks.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char1.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char2.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char3.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);

	}

	/**
	 * [INS_SRCH_RCV]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV_Note(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SRCH_RCV]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV_Setoff(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SRCH_RCV]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV_DtlCnd(MSBGP_ArApplReg p){
		p.DtlCnd_narrow_down_flg.putMode(p, INS_SRCH_RCV, MCMode.ENABLE);
		p.DtlCnd_not_bill_flg.putMode(p, INS_SRCH_RCV, MCMode.ENABLE);
		p.DtlCnd_incl_appl_flg.putMode(p, INS_SRCH_RCV, MCMode.ENABLE);
		p.DtlCnd_zero_flg.putMode(p, INS_SRCH_RCV, MCMode.ENABLE);
		p.DtlCnd_slo_flg.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.DtlCnd_rcv_schd_dt.putMode(p, INS_SRCH_RCV, MCMode.ENABLE);
		p.DtlCnd_srch.putMode(p, INS_SRCH_RCV, MCMode.ENABLE);

	}

	/**
	 * [INS_SRCH_RCV]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV_Total(MSBGP_ArApplReg p){
		p.Total_total_rcv_amt_p_PPanel.putStatus(INS_SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt_p_PPanel.putStatus(INS_SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt2_p_PPanel.putStatus(INS_SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.INVISIBLE);
		p.Total_total_appl_amt_p_PPanel.putStatus(INS_SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [INS_SRCH_RCV]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV_Dtl(MSBGP_ArApplReg p){
		p.columnDtl_check.putMode(p, INS_SRCH_RCV, MCMode.REQUIRED);
		p.Dtl_appl_tgt_amt_p_PPanel.putStatus(INS_SRCH_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(INS_SRCH_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt1_p_PPanel.putStatus(INS_SRCH_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt2_p_PPanel.putStatus(INS_SRCH_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt4_p_PPanel.putStatus(INS_SRCH_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_not_appl_bal_p_PPanel.putStatus(INS_SRCH_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_cd1.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_nm1.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ1.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_wrk_no.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_wrk_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_typ.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_typ_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_ym.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_cl_day.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_no.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_cd.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_nm.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_d_rmrks.putMode(p, INS_SRCH_RCV, MCMode.READ_ONLY);

	}

	/**
	 * [INS_SRCH_RCV]ステータスの[BillD]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV_BillD(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SRCH_RCV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV_Btn(MSBGP_ArApplReg p){
		p.Btn_select_all.putMode(p, INS_SRCH_RCV, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS_SRCH_RCV, MCMode.ENABLE);
		p.Btn_open_MSBGP0220.putMode(p, INS_SRCH_RCV, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS_SRCH_RCV, MCMode.DISABLE);
		p.Btn_upd.putMode(p, INS_SRCH_RCV, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS_SRCH_RCV, MCMode.DISABLE);

	}

	/**
	 * [INS_SRCH_RCV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV_EastBtn(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SRCH_RCV]ステータスの[Srch_Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV_Srch__Cnd(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_REF_RCV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV_ScreenOpe(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_REF_RCV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV_Cnd(MSBGP_ArApplReg p){
		p.Cnd_ope_Group.putMode(p, INS_REF_RCV, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Cnd_rcv_act_rev.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS_REF_RCV, MCMode.DISABLE);

	}

	/**
	 * [INS_REF_RCV]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV_HdrTab(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_REF_RCV]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV_Hdr(MSBGP_ArApplReg p){
		p.Hdr_trd_cd.putMode(p, INS_REF_RCV, MCMode.REQUIRED);
		p.Hdr_trd_ptn_typ.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);
		p.Hdr_ar_trd_grp_typ.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, INS_REF_RCV, MCMode.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS_REF_RCV, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, INS_REF_RCV, MCMode.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.putStatus(INS_REF_RCV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, INS_REF_RCV, MCMode.ENABLE);
		p.Hdr_wg_cd.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_def_bank_ac_cd.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);

	}

	/**
	 * [INS_REF_RCV]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV_Sys(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_REF_RCV]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV_RcvTab(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_REF_RCV]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV_Rcv(MSBGP_ArApplReg p){
		p.Rcv_rcv_no.putMode(p, INS_REF_RCV, MCMode.ENABLE);
		p.Rcv_srch.putMode(p, INS_REF_RCV, MCMode.ENABLE);
		p.Rcv_slo_no.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_rcv_dt.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_xrate_p_PPanel.putStatus(INS_REF_RCV, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(INS_REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(INS_REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, INS_REF_RCV, MCMode.ENABLE);
		p.Rcv_ar_sttl_typ2.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm2.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, INS_REF_RCV, MCMode.ENABLE);
		p.Rcv_tax_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ.putMode(p, INS_REF_RCV, MCMode.REQUIRED);
		p.Rcv_debt_cred_id_typ_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_cd.putMode(p, INS_REF_RCV, MCMode.REQUIRED);
		p.Rcv_debt_cred_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_cd.putMode(p, INS_REF_RCV, MCMode.REQUIRED);
		p.Rcv_bd_dpt_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_adv_trd_cd.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_adv_trd_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, INS_REF_RCV, MCMode.ENABLE);
		p.Rcv_sub_char1.putMode(p, INS_REF_RCV, MCMode.ENABLE);
		p.Rcv_sub_char2.putMode(p, INS_REF_RCV, MCMode.ENABLE);
		p.Rcv_sub_char3.putMode(p, INS_REF_RCV, MCMode.ENABLE);
		p.Rcv_note_no.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_no.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_srch.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_dt.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_cd.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_cd.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_xrate_p_PPanel.putStatus(INS_REF_RCV, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_setoff_xrate_cd.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_rcv_amt_p_PPanel.putStatus(INS_REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_not_proc_bal_p_PPanel.putStatus(INS_REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_sttl_cd1.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_sttl_typ1.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_sttl_nm1.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_sls_purc_typ.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_purc_flg.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_sls_flg.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd_sub.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_rate.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_cd.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_cd.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_rmrks.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char1.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char2.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char3.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);

	}

	/**
	 * [INS_REF_RCV]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV_Note(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_REF_RCV]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV_Setoff(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_REF_RCV]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV_DtlCnd(MSBGP_ArApplReg p){
		p.DtlCnd_narrow_down_flg.putMode(p, INS_REF_RCV, MCMode.ENABLE);
		p.DtlCnd_not_bill_flg.putMode(p, INS_REF_RCV, MCMode.ENABLE);
		p.DtlCnd_incl_appl_flg.putMode(p, INS_REF_RCV, MCMode.ENABLE);
		p.DtlCnd_zero_flg.putMode(p, INS_REF_RCV, MCMode.ENABLE);
		p.DtlCnd_slo_flg.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.DtlCnd_rcv_schd_dt.putMode(p, INS_REF_RCV, MCMode.ENABLE);
		p.DtlCnd_srch.putMode(p, INS_REF_RCV, MCMode.ENABLE);

	}

	/**
	 * [INS_REF_RCV]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV_Total(MSBGP_ArApplReg p){
		p.Total_total_rcv_amt_p_PPanel.putStatus(INS_REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt_p_PPanel.putStatus(INS_REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt2_p_PPanel.putStatus(INS_REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.INVISIBLE);
		p.Total_total_appl_amt_p_PPanel.putStatus(INS_REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [INS_REF_RCV]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV_Dtl(MSBGP_ArApplReg p){
		p.columnDtl_check.putMode(p, INS_REF_RCV, MCMode.REQUIRED);
		p.Dtl_appl_tgt_amt_p_PPanel.putStatus(INS_REF_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(INS_REF_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt1_p_PPanel.putStatus(INS_REF_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Dtl_amt2_p_PPanel.putStatus(INS_REF_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt4_p_PPanel.putStatus(INS_REF_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_not_appl_bal_p_PPanel.putStatus(INS_REF_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_cd1.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_nm1.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ1.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_wrk_no.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_wrk_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_typ.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_typ_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_ym.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_cl_day.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_no.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_cd.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_nm.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_d_rmrks.putMode(p, INS_REF_RCV, MCMode.READ_ONLY);

	}

	/**
	 * [INS_REF_RCV]ステータスの[BillD]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV_BillD(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_REF_RCV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV_Btn(MSBGP_ArApplReg p){
		p.Btn_select_all.putMode(p, INS_REF_RCV, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS_REF_RCV, MCMode.ENABLE);
		p.Btn_open_MSBGP0220.putMode(p, INS_REF_RCV, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS_REF_RCV, MCMode.DISABLE);
		p.Btn_upd.putMode(p, INS_REF_RCV, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS_REF_RCV, MCMode.DISABLE);

	}

	/**
	 * [INS_REF_RCV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV_EastBtn(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_REF_RCV]ステータスの[Srch_Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV_Srch__Cnd(MSBGP_ArApplReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBGP_ArApplReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBGP_ArApplReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rcv_act_rev.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_latest_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBGP_ArApplReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBGP_ArApplReg p){
		p.Hdr_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ar_trd_grp_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
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
		p.Hdr_def_bank_ac_cd.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Sys(MSBGP_ArApplReg p){

	}

	/**
	 * [SRCH]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RcvTab(MSBGP_ArApplReg p){

	}

	/**
	 * [SRCH]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rcv(MSBGP_ArApplReg p){
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
		p.Rcv_ar_sttl_typ2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_debt_cred_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_adv_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_adv_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.Rcv_setoff_rcv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_srch.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_setoff_xrate_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_setoff_rcv_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_not_proc_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_sttl_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_sttl_typ1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_setoff_sttl_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_sls_purc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_setoff_purc_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_setoff_sls_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd_sub.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Note(MSBGP_ArApplReg p){

	}

	/**
	 * [SRCH]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Setoff(MSBGP_ArApplReg p){

	}

	/**
	 * [SRCH]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlCnd(MSBGP_ArApplReg p){
		p.DtlCnd_narrow_down_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlCnd_not_bill_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlCnd_incl_appl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlCnd_zero_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlCnd_slo_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlCnd_rcv_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlCnd_srch.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Total(MSBGP_ArApplReg p){
		p.Total_total_rcv_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt2_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_appl_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBGP_ArApplReg p){
		p.columnDtl_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.Dtl_appl_tgt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt1_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt2_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt4_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_not_appl_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wrk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wrk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ar_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ar_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bill_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bill_cl_day.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bill_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bill_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[BillD]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BillD(MSBGP_ArApplReg p){

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBGP_ArApplReg p){
		p.Btn_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_open_MSBGP0220.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_ins.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBGP_ArApplReg p){

	}

	/**
	 * [SRCH]ステータスの[Srch_Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Srch__Cnd(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBGP_ArApplReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_rcv_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBGP_ArApplReg p){
		p.Hdr_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ar_trd_grp_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_bill_basis_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, UPD, MCMode.ENABLE);
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
		p.Hdr_def_bank_ac_cd.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Sys(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RcvTab(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rcv(MSBGP_ArApplReg p){
		p.Rcv_rcv_no.putMode(p, UPD, MCMode.ENABLE);
		p.Rcv_srch.putMode(p, UPD, MCMode.ENABLE);
		p.Rcv_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_rcv_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Rcv_rcst_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rcv_rcst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rcv_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
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
		p.Rcv_xfr_psn.putMode(p, UPD, MCMode.ENABLE);
		p.Rcv_ar_sttl_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Rcv_ar_sttl_typ2.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Rcv_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Rcv_debt_cred_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rcv_debt_cred_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rcv_bd_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_adv_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_adv_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Rcv_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Rcv_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Rcv_sub_char3.putMode(p, UPD, MCMode.ENABLE);
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
		p.Rcv_setoff_rcv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_srch.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_setoff_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_setoff_rcv_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_not_proc_bal_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_sttl_cd1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_sttl_typ1.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_setoff_sttl_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_sls_purc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_setoff_purc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_setoff_sls_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd_sub.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_rate.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Note(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Setoff(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlCnd(MSBGP_ArApplReg p){
		p.DtlCnd_narrow_down_flg.putMode(p, UPD, MCMode.ENABLE);
		p.DtlCnd_not_bill_flg.putMode(p, UPD, MCMode.ENABLE);
		p.DtlCnd_incl_appl_flg.putMode(p, UPD, MCMode.ENABLE);
		p.DtlCnd_zero_flg.putMode(p, UPD, MCMode.ENABLE);
		p.DtlCnd_slo_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlCnd_rcv_schd_dt.putMode(p, UPD, MCMode.ENABLE);
		p.DtlCnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Total(MSBGP_ArApplReg p){
		p.Total_total_rcv_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt2_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.INVISIBLE);
		p.Total_total_appl_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBGP_ArApplReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_appl_tgt_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt1_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Dtl_amt2_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt4_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_not_appl_bal_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_cd1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wrk_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wrk_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ar_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ar_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bill_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bill_cl_day.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bill_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bill_d_rmrks.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[BillD]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BillD(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBGP_ArApplReg p){
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MSBGP0220.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD]ステータスの[Srch_Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Srch__Cnd(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SRCH_RCV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV_ScreenOpe(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SRCH_RCV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV_Cnd(MSBGP_ArApplReg p){
		p.Cnd_ope_Group.putMode(p, UPD_SRCH_RCV, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, UPD_SRCH_RCV, MCMode.REQUIRED);
		p.Cnd_rcv_act_rev.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD_SRCH_RCV, MCMode.ENABLE);

	}

	/**
	 * [UPD_SRCH_RCV]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV_HdrTab(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SRCH_RCV]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV_Hdr(MSBGP_ArApplReg p){
		p.Hdr_trd_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);
		p.Hdr_ar_trd_grp_typ.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, UPD_SRCH_RCV, MCMode.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(UPD_SRCH_RCV, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_bill_basis_dt.putMode(p, UPD_SRCH_RCV, MCMode.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.putStatus(UPD_SRCH_RCV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, UPD_SRCH_RCV, MCMode.ENABLE);
		p.Hdr_wg_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Hdr_def_bank_ac_cd.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_SRCH_RCV]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV_Sys(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SRCH_RCV]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV_RcvTab(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SRCH_RCV]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV_Rcv(MSBGP_ArApplReg p){
		p.Rcv_rcv_no.putMode(p, UPD_SRCH_RCV, MCMode.ENABLE);
		p.Rcv_srch.putMode(p, UPD_SRCH_RCV, MCMode.ENABLE);
		p.Rcv_slo_no.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_rcv_dt.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_xrate_p_PPanel.putStatus(UPD_SRCH_RCV, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(UPD_SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(UPD_SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ2.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm2.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_debt_cred_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_adv_trd_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_adv_trd_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_no.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_no.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_srch.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_dt.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_xrate_p_PPanel.putStatus(UPD_SRCH_RCV, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_setoff_xrate_cd.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_rcv_amt_p_PPanel.putStatus(UPD_SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_not_proc_bal_p_PPanel.putStatus(UPD_SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_sttl_cd1.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_sttl_typ1.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_sttl_nm1.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_sls_purc_typ.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_purc_flg.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_sls_flg.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd_sub.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_rate.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_rmrks.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char1.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char2.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char3.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_SRCH_RCV]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV_Note(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SRCH_RCV]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV_Setoff(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SRCH_RCV]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV_DtlCnd(MSBGP_ArApplReg p){
		p.DtlCnd_narrow_down_flg.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.DtlCnd_not_bill_flg.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.DtlCnd_incl_appl_flg.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.DtlCnd_zero_flg.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.DtlCnd_slo_flg.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.DtlCnd_rcv_schd_dt.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.DtlCnd_srch.putMode(p, UPD_SRCH_RCV, MCMode.DISABLE);

	}

	/**
	 * [UPD_SRCH_RCV]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV_Total(MSBGP_ArApplReg p){
		p.Total_total_rcv_amt_p_PPanel.putStatus(UPD_SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt_p_PPanel.putStatus(UPD_SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt2_p_PPanel.putStatus(UPD_SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.INVISIBLE);
		p.Total_total_appl_amt_p_PPanel.putStatus(UPD_SRCH_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [UPD_SRCH_RCV]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV_Dtl(MSBGP_ArApplReg p){
		p.columnDtl_check.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.Dtl_appl_tgt_amt_p_PPanel.putStatus(UPD_SRCH_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(UPD_SRCH_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt1_p_PPanel.putStatus(UPD_SRCH_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt2_p_PPanel.putStatus(UPD_SRCH_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt4_p_PPanel.putStatus(UPD_SRCH_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_not_appl_bal_p_PPanel.putStatus(UPD_SRCH_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_cd1.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_nm1.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ1.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_wrk_no.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_wrk_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_typ.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_typ_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_ym.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_cl_day.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_no.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_cd.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_nm.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_d_rmrks.putMode(p, UPD_SRCH_RCV, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_SRCH_RCV]ステータスの[BillD]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV_BillD(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SRCH_RCV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV_Btn(MSBGP_ArApplReg p){
		p.Btn_select_all.putMode(p, UPD_SRCH_RCV, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_SRCH_RCV, MCMode.ENABLE);
		p.Btn_open_MSBGP0220.putMode(p, UPD_SRCH_RCV, MCMode.ENABLE);
		p.Btn_ins.putMode(p, UPD_SRCH_RCV, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_SRCH_RCV, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD_SRCH_RCV, MCMode.DISABLE);

	}

	/**
	 * [UPD_SRCH_RCV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV_EastBtn(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SRCH_RCV]ステータスの[Srch_Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV_Srch__Cnd(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_REF_RCV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV_ScreenOpe(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_REF_RCV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV_Cnd(MSBGP_ArApplReg p){
		p.Cnd_ope_Group.putMode(p, UPD_REF_RCV, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, UPD_REF_RCV, MCMode.REQUIRED);
		p.Cnd_rcv_act_rev.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD_REF_RCV, MCMode.ENABLE);

	}

	/**
	 * [UPD_REF_RCV]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV_HdrTab(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_REF_RCV]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV_Hdr(MSBGP_ArApplReg p){
		p.Hdr_trd_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);
		p.Hdr_ar_trd_grp_typ.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, UPD_REF_RCV, MCMode.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(UPD_REF_RCV, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_bill_basis_dt.putMode(p, UPD_REF_RCV, MCMode.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.putStatus(UPD_REF_RCV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, UPD_REF_RCV, MCMode.ENABLE);
		p.Hdr_wg_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Hdr_def_bank_ac_cd.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_REF_RCV]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV_Sys(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_REF_RCV]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV_RcvTab(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_REF_RCV]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV_Rcv(MSBGP_ArApplReg p){
		p.Rcv_rcv_no.putMode(p, UPD_REF_RCV, MCMode.ENABLE);
		p.Rcv_srch.putMode(p, UPD_REF_RCV, MCMode.ENABLE);
		p.Rcv_slo_no.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_rcv_dt.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_xrate_p_PPanel.putStatus(UPD_REF_RCV, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(UPD_REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(UPD_REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, UPD_REF_RCV, MCMode.ENABLE);
		p.Rcv_ar_sttl_typ2.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm2.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, UPD_REF_RCV, MCMode.ENABLE);
		p.Rcv_tax_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ.putMode(p, UPD_REF_RCV, MCMode.REQUIRED);
		p.Rcv_debt_cred_id_typ_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_cd.putMode(p, UPD_REF_RCV, MCMode.REQUIRED);
		p.Rcv_debt_cred_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_cd.putMode(p, UPD_REF_RCV, MCMode.REQUIRED);
		p.Rcv_bd_dpt_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_adv_trd_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_adv_trd_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, UPD_REF_RCV, MCMode.ENABLE);
		p.Rcv_sub_char1.putMode(p, UPD_REF_RCV, MCMode.ENABLE);
		p.Rcv_sub_char2.putMode(p, UPD_REF_RCV, MCMode.ENABLE);
		p.Rcv_sub_char3.putMode(p, UPD_REF_RCV, MCMode.ENABLE);
		p.Rcv_note_no.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_no.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_srch.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_dt.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_xrate_p_PPanel.putStatus(UPD_REF_RCV, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_setoff_xrate_cd.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_rcv_amt_p_PPanel.putStatus(UPD_REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_not_proc_bal_p_PPanel.putStatus(UPD_REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_sttl_cd1.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_sttl_typ1.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_sttl_nm1.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_sls_purc_typ.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_purc_flg.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_sls_flg.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd_sub.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_rate.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_rmrks.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char1.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char2.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char3.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_REF_RCV]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV_Note(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_REF_RCV]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV_Setoff(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_REF_RCV]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV_DtlCnd(MSBGP_ArApplReg p){
		p.DtlCnd_narrow_down_flg.putMode(p, UPD_REF_RCV, MCMode.ENABLE);
		p.DtlCnd_not_bill_flg.putMode(p, UPD_REF_RCV, MCMode.ENABLE);
		p.DtlCnd_incl_appl_flg.putMode(p, UPD_REF_RCV, MCMode.ENABLE);
		p.DtlCnd_zero_flg.putMode(p, UPD_REF_RCV, MCMode.ENABLE);
		p.DtlCnd_slo_flg.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.DtlCnd_rcv_schd_dt.putMode(p, UPD_REF_RCV, MCMode.ENABLE);
		p.DtlCnd_srch.putMode(p, UPD_REF_RCV, MCMode.ENABLE);

	}

	/**
	 * [UPD_REF_RCV]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV_Total(MSBGP_ArApplReg p){
		p.Total_total_rcv_amt_p_PPanel.putStatus(UPD_REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt_p_PPanel.putStatus(UPD_REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt2_p_PPanel.putStatus(UPD_REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.INVISIBLE);
		p.Total_total_appl_amt_p_PPanel.putStatus(UPD_REF_RCV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [UPD_REF_RCV]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV_Dtl(MSBGP_ArApplReg p){
		p.columnDtl_check.putMode(p, UPD_REF_RCV, MCMode.REQUIRED);
		p.Dtl_appl_tgt_amt_p_PPanel.putStatus(UPD_REF_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(UPD_REF_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt1_p_PPanel.putStatus(UPD_REF_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Dtl_amt2_p_PPanel.putStatus(UPD_REF_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt4_p_PPanel.putStatus(UPD_REF_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_not_appl_bal_p_PPanel.putStatus(UPD_REF_RCV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_cd1.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_nm1.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ1.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_wrk_no.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_wrk_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_typ.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_ar_typ_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_ym.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_cl_day.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_no.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_cd.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_nm.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);
		p.columnDtl_bill_d_rmrks.putMode(p, UPD_REF_RCV, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_REF_RCV]ステータスの[BillD]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV_BillD(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_REF_RCV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV_Btn(MSBGP_ArApplReg p){
		p.Btn_select_all.putMode(p, UPD_REF_RCV, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_REF_RCV, MCMode.ENABLE);
		p.Btn_open_MSBGP0220.putMode(p, UPD_REF_RCV, MCMode.ENABLE);
		p.Btn_ins.putMode(p, UPD_REF_RCV, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_REF_RCV, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD_REF_RCV, MCMode.DISABLE);

	}

	/**
	 * [UPD_REF_RCV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV_EastBtn(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_REF_RCV]ステータスの[Srch_Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV_Srch__Cnd(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBGP_ArApplReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_rcv_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBGP_ArApplReg p){
		p.Hdr_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ar_trd_grp_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
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
		p.Hdr_def_bank_ac_cd.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Sys(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_U]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RcvTab(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_U]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rcv(MSBGP_ArApplReg p){
		p.Rcv_rcv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_srch.putMode(p, FIX_U, MCMode.READ_ONLY);
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
		p.Rcv_ar_sttl_typ2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_debt_cred_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_adv_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_adv_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
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
		p.Rcv_setoff_rcv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_srch.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_setoff_xrate_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_setoff_rcv_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_not_proc_bal_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_sttl_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_sttl_typ1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_setoff_sttl_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_sls_purc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_setoff_purc_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_setoff_sls_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd_sub.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Note(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_U]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Setoff(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_U]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DtlCnd(MSBGP_ArApplReg p){
		p.DtlCnd_narrow_down_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlCnd_not_bill_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlCnd_incl_appl_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlCnd_zero_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlCnd_slo_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlCnd_rcv_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlCnd_srch.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Total(MSBGP_ArApplReg p){
		p.Total_total_rcv_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt2_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_appl_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBGP_ArApplReg p){
		p.columnDtl_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_appl_tgt_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt1_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt2_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt4_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_not_appl_bal_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_wrk_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_wrk_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ar_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ar_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bill_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bill_cl_day.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bill_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bill_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[BillD]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BillD(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBGP_ArApplReg p){
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_open_MSBGP0220.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_ins.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_U]ステータスの[Srch_Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Srch__Cnd(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBGP_ArApplReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_rcv_act_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBGP_ArApplReg p){
		p.Hdr_trd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ar_trd_grp_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
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
		p.Hdr_def_bank_ac_cd.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Sys(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_D]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_RcvTab(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_D]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Rcv(MSBGP_ArApplReg p){
		p.Rcv_rcv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_srch.putMode(p, FIX_D, MCMode.READ_ONLY);
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
		p.Rcv_ar_sttl_typ2.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_debt_cred_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_adv_trd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_adv_trd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
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
		p.Rcv_setoff_rcv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_srch.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_setoff_xrate_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_setoff_rcv_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_not_proc_bal_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_sttl_cd1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_sttl_typ1.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_setoff_sttl_nm1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_sls_purc_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_setoff_purc_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_setoff_sls_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd_sub.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_rate.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Note(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_D]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Setoff(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_D]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_DtlCnd(MSBGP_ArApplReg p){
		p.DtlCnd_narrow_down_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlCnd_not_bill_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlCnd_incl_appl_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlCnd_zero_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlCnd_slo_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlCnd_rcv_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlCnd_srch.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Total(MSBGP_ArApplReg p){
		p.Total_total_rcv_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt2_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_appl_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MSBGP_ArApplReg p){
		p.columnDtl_check.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_appl_tgt_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt1_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt2_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt4_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_not_appl_bal_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_cd1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_nm1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ1.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_wrk_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_wrk_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ar_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ar_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bill_ym.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bill_cl_day.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bill_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bill_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[BillD]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_BillD(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBGP_ArApplReg p){
		p.Btn_select_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_open_MSBGP0220.putMode(p, FIX_D, MCMode.ENABLE);
		p.Btn_ins.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_D]ステータスの[Srch_Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Srch__Cnd(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBGP_ArApplReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_rcv_act_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBGP_ArApplReg p){
		p.Hdr_trd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ar_trd_grp_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
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
		p.Hdr_def_bank_ac_cd.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Sys(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_I]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_RcvTab(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_I]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Rcv(MSBGP_ArApplReg p){
		p.Rcv_rcv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_srch.putMode(p, FIX_I, MCMode.READ_ONLY);
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
		p.Rcv_ar_sttl_typ2.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_debt_cred_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_adv_trd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_adv_trd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
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
		p.Rcv_setoff_rcv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_srch.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_setoff_xrate_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_setoff_rcv_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_not_proc_bal_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_sttl_cd1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_sttl_typ1.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_setoff_sttl_nm1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_sls_purc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_setoff_purc_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_setoff_sls_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd_sub.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_rate.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Note(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_I]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Setoff(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_I]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_DtlCnd(MSBGP_ArApplReg p){
		p.DtlCnd_narrow_down_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlCnd_not_bill_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlCnd_incl_appl_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlCnd_zero_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlCnd_slo_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlCnd_rcv_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlCnd_srch.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Total(MSBGP_ArApplReg p){
		p.Total_total_rcv_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt2_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_appl_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl(MSBGP_ArApplReg p){
		p.columnDtl_check.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_appl_tgt_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt1_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt2_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt4_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_not_appl_bal_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_cd1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_nm1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ1.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_wrk_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_wrk_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ar_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ar_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bill_ym.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bill_cl_day.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bill_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bill_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[BillD]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_BillD(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBGP_ArApplReg p){
		p.Btn_select_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_open_MSBGP0220.putMode(p, FIX_I, MCMode.ENABLE);
		p.Btn_ins.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBGP_ArApplReg p){

	}

	/**
	 * [FIX_I]ステータスの[Srch_Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Srch__Cnd(MSBGP_ArApplReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBGP_ArApplReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBGP_ArApplReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_rcv_act_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBGP_ArApplReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBGP_ArApplReg p){
		p.Hdr_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ar_trd_grp_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_bill_basis_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
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
		p.Hdr_def_bank_ac_cd.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Sys(MSBGP_ArApplReg p){

	}

	/**
	 * [DEL]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RcvTab(MSBGP_ArApplReg p){

	}

	/**
	 * [DEL]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rcv(MSBGP_ArApplReg p){
		p.Rcv_rcv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_srch.putMode(p, DEL, MCMode.READ_ONLY);
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
		p.Rcv_ar_sttl_typ2.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_debt_cred_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_adv_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_adv_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
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
		p.Rcv_setoff_rcv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_srch.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_setoff_xrate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_setoff_rcv_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_not_proc_bal_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_sttl_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_sttl_typ1.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_setoff_sttl_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_sls_purc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_setoff_purc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_setoff_sls_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd_sub.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Note(MSBGP_ArApplReg p){

	}

	/**
	 * [DEL]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Setoff(MSBGP_ArApplReg p){

	}

	/**
	 * [DEL]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlCnd(MSBGP_ArApplReg p){
		p.DtlCnd_narrow_down_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlCnd_not_bill_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlCnd_incl_appl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlCnd_zero_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlCnd_slo_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlCnd_rcv_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlCnd_srch.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Total(MSBGP_ArApplReg p){
		p.Total_total_rcv_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt2_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_appl_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBGP_ArApplReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_appl_tgt_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt1_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt2_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt4_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_not_appl_bal_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ1.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wrk_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wrk_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ar_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ar_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bill_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bill_cl_day.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bill_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bill_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[BillD]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BillD(MSBGP_ArApplReg p){

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBGP_ArApplReg p){
		p.Btn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_open_MSBGP0220.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBGP_ArApplReg p){

	}

	/**
	 * [DEL]ステータスの[Srch_Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Srch__Cnd(MSBGP_ArApplReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBGP_ArApplReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBGP_ArApplReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rcv_act_rev.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_latest_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBGP_ArApplReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBGP_ArApplReg p){
		p.Hdr_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ar_trd_grp_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
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
		p.Hdr_def_bank_ac_cd.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitREF_Sys(MSBGP_ArApplReg p){

	}

	/**
	 * [REF]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_RcvTab(MSBGP_ArApplReg p){

	}

	/**
	 * [REF]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rcv(MSBGP_ArApplReg p){
		p.Rcv_rcv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_srch.putMode(p, REF, MCMode.READ_ONLY);
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
		p.Rcv_ar_sttl_typ2.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_adv_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_adv_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
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
		p.Rcv_setoff_rcv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_srch.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_setoff_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_setoff_rcv_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_not_proc_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_sttl_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_sttl_typ1.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_setoff_sttl_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_sls_purc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_setoff_purc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_setoff_sls_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd_sub.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitREF_Note(MSBGP_ArApplReg p){

	}

	/**
	 * [REF]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitREF_Setoff(MSBGP_ArApplReg p){

	}

	/**
	 * [REF]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlCnd(MSBGP_ArApplReg p){
		p.DtlCnd_narrow_down_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlCnd_not_bill_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlCnd_incl_appl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlCnd_zero_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlCnd_slo_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlCnd_rcv_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlCnd_srch.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitREF_Total(MSBGP_ArApplReg p){
		p.Total_total_rcv_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt2_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_appl_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBGP_ArApplReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_appl_tgt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt1_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt2_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt4_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_not_appl_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wrk_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wrk_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ar_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ar_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bill_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bill_cl_day.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bill_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bill_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[BillD]ブロックのモードの設定
	 */
	protected static void statusInitREF_BillD(MSBGP_ArApplReg p){

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBGP_ArApplReg p){
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_open_MSBGP0220.putMode(p, REF, MCMode.ENABLE);
		p.Btn_ins.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBGP_ArApplReg p){

	}

	/**
	 * [REF]ステータスの[Srch_Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Srch__Cnd(MSBGP_ArApplReg p){

	}

	/**
	 * [NO_SLIP_CD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_ScreenOpe(MSBGP_ArApplReg p){

	}

	/**
	 * [NO_SLIP_CD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_Cnd(MSBGP_ArApplReg p){
		p.Cnd_ope_Group.putMode(p, NO_SLIP_CD, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Cnd_rcv_act_rev.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, NO_SLIP_CD, MCMode.DISABLE);

	}

	/**
	 * [NO_SLIP_CD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_HdrTab(MSBGP_ArApplReg p){

	}

	/**
	 * [NO_SLIP_CD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_Hdr(MSBGP_ArApplReg p){
		p.Hdr_trd_cd.putMode(p, NO_SLIP_CD, MCMode.REQUIRED);
		p.Hdr_trd_ptn_typ.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Hdr_ar_trd_grp_typ.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, NO_SLIP_CD, MCMode.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, NO_SLIP_CD, MCMode.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, NO_SLIP_CD, MCMode.ENABLE);
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
		p.Hdr_def_bank_ac_cd.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);

	}

	/**
	 * [NO_SLIP_CD]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_Sys(MSBGP_ArApplReg p){

	}

	/**
	 * [NO_SLIP_CD]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_RcvTab(MSBGP_ArApplReg p){

	}

	/**
	 * [NO_SLIP_CD]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_Rcv(MSBGP_ArApplReg p){
		p.Rcv_rcv_no.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_srch.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
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
		p.Rcv_ar_sttl_typ2.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm2.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_debt_cred_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_adv_trd_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_adv_trd_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
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
		p.Rcv_setoff_rcv_no.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_srch.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_dt.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_xrate_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_setoff_xrate_cd.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_setoff_rcv_amt_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_not_proc_bal_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_sttl_cd1.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_sttl_typ1.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_setoff_sttl_nm1.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_sls_purc_typ.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_setoff_purc_flg.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_setoff_sls_flg.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd_sub.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_rate.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_rmrks.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char1.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char2.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_setoff_sub_char3.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Rcv_amt_dec_place.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);

	}

	/**
	 * [NO_SLIP_CD]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_Note(MSBGP_ArApplReg p){

	}

	/**
	 * [NO_SLIP_CD]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_Setoff(MSBGP_ArApplReg p){

	}

	/**
	 * [NO_SLIP_CD]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_DtlCnd(MSBGP_ArApplReg p){
		p.DtlCnd_narrow_down_flg.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.DtlCnd_not_bill_flg.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.DtlCnd_incl_appl_flg.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.DtlCnd_zero_flg.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.DtlCnd_slo_flg.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.DtlCnd_rcv_schd_dt.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.DtlCnd_srch.putMode(p, NO_SLIP_CD, MCMode.DISABLE);

	}

	/**
	 * [NO_SLIP_CD]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_Total(MSBGP_ArApplReg p){
		p.Total_total_rcv_amt_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_setoff_rcv_amt2_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_appl_amt_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [NO_SLIP_CD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_Dtl(MSBGP_ArApplReg p){
		p.columnDtl_check.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.Dtl_appl_tgt_amt_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt1_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt2_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt4_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_not_appl_bal_p_PPanel.putStatus(NO_SLIP_CD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_cd1.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_nm1.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ1.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_wrk_no.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_wrk_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_ar_typ.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_ar_typ_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_bill_ym.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_bill_cl_day.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_bill_no.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_cd.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_nm.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);
		p.columnDtl_bill_d_rmrks.putMode(p, NO_SLIP_CD, MCMode.READ_ONLY);

	}

	/**
	 * [NO_SLIP_CD]ステータスの[BillD]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_BillD(MSBGP_ArApplReg p){

	}

	/**
	 * [NO_SLIP_CD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_Btn(MSBGP_ArApplReg p){
		p.Btn_select_all.putMode(p, NO_SLIP_CD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, NO_SLIP_CD, MCMode.DISABLE);
		p.Btn_open_MSBGP0220.putMode(p, NO_SLIP_CD, MCMode.DISABLE);
		p.Btn_ins.putMode(p, NO_SLIP_CD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, NO_SLIP_CD, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, NO_SLIP_CD, MCMode.DISABLE);

	}

	/**
	 * [NO_SLIP_CD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_EastBtn(MSBGP_ArApplReg p){

	}

	/**
	 * [NO_SLIP_CD]ステータスの[Srch_Cnd]ブロックのモードの設定
	 */
	protected static void statusInitNO__SLIP__CD_Srch__Cnd(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SETOFF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__SETOFF_ScreenOpe(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SETOFF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__SETOFF_Cnd(MSBGP_ArApplReg p){
		p.Cnd_ope_Group.putMode(p, INS_SETOFF, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Cnd_rcv_act_rev.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS_SETOFF, MCMode.DISABLE);

	}

	/**
	 * [INS_SETOFF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__SETOFF_HdrTab(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SETOFF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__SETOFF_Hdr(MSBGP_ArApplReg p){
		p.Hdr_trd_cd.putMode(p, INS_SETOFF, MCMode.REQUIRED);
		p.Hdr_trd_ptn_typ.putMode(p, INS_SETOFF, MCMode.INVISIBLE);
		p.Hdr_ar_trd_grp_typ.putMode(p, INS_SETOFF, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, INS_SETOFF, MCMode.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS_SETOFF, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, INS_SETOFF, MCMode.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.putStatus(INS_SETOFF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, INS_SETOFF, MCMode.ENABLE);
		p.Hdr_wg_cd.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Hdr_def_bank_ac_cd.putMode(p, INS_SETOFF, MCMode.INVISIBLE);

	}

	/**
	 * [INS_SETOFF]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitINS__SETOFF_Sys(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SETOFF]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__SETOFF_RcvTab(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SETOFF]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitINS__SETOFF_Rcv(MSBGP_ArApplReg p){
		p.Rcv_rcv_no.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_srch.putMode(p, INS_SETOFF, MCMode.DISABLE);
		p.Rcv_slo_no.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcv_dt.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_xrate_p_PPanel.putStatus(INS_SETOFF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, INS_SETOFF, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, INS_SETOFF, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(INS_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(INS_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, INS_SETOFF, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ2.putMode(p, INS_SETOFF, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm2.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, INS_SETOFF, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, INS_SETOFF, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, INS_SETOFF, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, INS_SETOFF, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_cd.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_cd.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_adv_trd_cd.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_adv_trd_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_no.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_no.putMode(p, INS_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_srch.putMode(p, INS_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_dt.putMode(p, INS_SETOFF, MCMode.REQUIRED);
		p.Rcv_setoff_bcst_cd.putMode(p, INS_SETOFF, MCMode.REQUIRED);
		p.Rcv_setoff_bcst_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_cd.putMode(p, INS_SETOFF, MCMode.REQUIRED);
		p.Rcv_setoff_trd_cur_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_xrate_p_PPanel.putStatus(INS_SETOFF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Rcv_setoff_xrate_cd.putMode(p, INS_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_rcv_amt_p_PPanel.putStatus(INS_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.REQUIRED);
		p.Rcv_setoff_not_proc_bal_p_PPanel.putStatus(INS_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_sttl_cd1.putMode(p, INS_SETOFF, MCMode.REQUIRED);
		p.Rcv_setoff_sttl_typ1.putMode(p, INS_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_sttl_nm1.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_sls_purc_typ.putMode(p, INS_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_purc_flg.putMode(p, INS_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_sls_flg.putMode(p, INS_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd_sub.putMode(p, INS_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd.putMode(p, INS_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_tax_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_rate.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ.putMode(p, INS_SETOFF, MCMode.REQUIRED);
		p.Rcv_setoff_debt_cred_id_typ_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_cd.putMode(p, INS_SETOFF, MCMode.REQUIRED);
		p.Rcv_setoff_debt_cred_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_cd.putMode(p, INS_SETOFF, MCMode.REQUIRED);
		p.Rcv_setoff_bd_dpt_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_rmrks.putMode(p, INS_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_sub_char1.putMode(p, INS_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_sub_char2.putMode(p, INS_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_sub_char3.putMode(p, INS_SETOFF, MCMode.ENABLE);
		p.Rcv_amt_dec_place.putMode(p, INS_SETOFF, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, INS_SETOFF, MCMode.INVISIBLE);

	}

	/**
	 * [INS_SETOFF]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitINS__SETOFF_Note(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SETOFF]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitINS__SETOFF_Setoff(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SETOFF]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__SETOFF_DtlCnd(MSBGP_ArApplReg p){
		p.DtlCnd_narrow_down_flg.putMode(p, INS_SETOFF, MCMode.ENABLE);
		p.DtlCnd_not_bill_flg.putMode(p, INS_SETOFF, MCMode.ENABLE);
		p.DtlCnd_incl_appl_flg.putMode(p, INS_SETOFF, MCMode.ENABLE);
		p.DtlCnd_zero_flg.putMode(p, INS_SETOFF, MCMode.ENABLE);
		p.DtlCnd_slo_flg.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.DtlCnd_rcv_schd_dt.putMode(p, INS_SETOFF, MCMode.ENABLE);
		p.DtlCnd_srch.putMode(p, INS_SETOFF, MCMode.ENABLE);

	}

	/**
	 * [INS_SETOFF]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitINS__SETOFF_Total(MSBGP_ArApplReg p){
		p.Total_total_rcv_amt_p_PPanel.putStatus(INS_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.INVISIBLE);
		p.Total_total_setoff_rcv_amt_p_PPanel.putStatus(INS_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.INVISIBLE);
		p.Total_total_setoff_rcv_amt2_p_PPanel.putStatus(INS_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_appl_amt_p_PPanel.putStatus(INS_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [INS_SETOFF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__SETOFF_Dtl(MSBGP_ArApplReg p){
		p.columnDtl_check.putMode(p, INS_SETOFF, MCMode.REQUIRED);
		p.Dtl_appl_tgt_amt_p_PPanel.putStatus(INS_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(INS_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt1_p_PPanel.putStatus(INS_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_amt2_p_PPanel.putStatus(INS_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_amt4_p_PPanel.putStatus(INS_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Dtl_not_appl_bal_p_PPanel.putStatus(INS_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_cd1.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_nm1.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ1.putMode(p, INS_SETOFF, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wrk_no.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wrk_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_typ.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_typ_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_ym.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_cl_day.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_no.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_cd.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_nm.putMode(p, INS_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_d_rmrks.putMode(p, INS_SETOFF, MCMode.ENABLE);

	}

	/**
	 * [INS_SETOFF]ステータスの[BillD]ブロックのモードの設定
	 */
	protected static void statusInitINS__SETOFF_BillD(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SETOFF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__SETOFF_Btn(MSBGP_ArApplReg p){
		p.Btn_select_all.putMode(p, INS_SETOFF, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS_SETOFF, MCMode.ENABLE);
		p.Btn_open_MSBGP0220.putMode(p, INS_SETOFF, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS_SETOFF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, INS_SETOFF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS_SETOFF, MCMode.DISABLE);

	}

	/**
	 * [INS_SETOFF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__SETOFF_EastBtn(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SETOFF]ステータスの[Srch_Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__SETOFF_Srch__Cnd(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SRCH_RCV_SETOFF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV__SETOFF_ScreenOpe(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SRCH_RCV_SETOFF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV__SETOFF_Cnd(MSBGP_ArApplReg p){
		p.Cnd_ope_Group.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Cnd_rcv_act_rev.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.DISABLE);

	}

	/**
	 * [INS_SRCH_RCV_SETOFF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV__SETOFF_HdrTab(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SRCH_RCV_SETOFF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV__SETOFF_Hdr(MSBGP_ArApplReg p){
		p.Hdr_trd_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.REQUIRED);
		p.Hdr_trd_ptn_typ.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Hdr_ar_trd_grp_typ.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.putStatus(INS_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Hdr_wg_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_def_bank_ac_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);

	}

	/**
	 * [INS_SRCH_RCV_SETOFF]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV__SETOFF_Sys(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SRCH_RCV_SETOFF]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV__SETOFF_RcvTab(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SRCH_RCV_SETOFF]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV__SETOFF_Rcv(MSBGP_ArApplReg p){
		p.Rcv_rcv_no.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_srch.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.DISABLE);
		p.Rcv_slo_no.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcv_dt.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_xrate_p_PPanel.putStatus(INS_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(INS_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(INS_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ2.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm2.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_adv_trd_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_adv_trd_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_no.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_no.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_srch.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_dt.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_xrate_p_PPanel.putStatus(INS_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_setoff_xrate_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_rcv_amt_p_PPanel.putStatus(INS_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_not_proc_bal_p_PPanel.putStatus(INS_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_sttl_cd1.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_sttl_typ1.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_sttl_nm1.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_sls_purc_typ.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_purc_flg.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_sls_flg.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd_sub.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_rate.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_rmrks.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_sub_char1.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_sub_char2.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_sub_char3.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_amt_dec_place.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);

	}

	/**
	 * [INS_SRCH_RCV_SETOFF]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV__SETOFF_Note(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SRCH_RCV_SETOFF]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV__SETOFF_Setoff(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SRCH_RCV_SETOFF]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV__SETOFF_DtlCnd(MSBGP_ArApplReg p){
		p.DtlCnd_narrow_down_flg.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.DtlCnd_not_bill_flg.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.DtlCnd_incl_appl_flg.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.DtlCnd_zero_flg.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.DtlCnd_slo_flg.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.DtlCnd_rcv_schd_dt.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.DtlCnd_srch.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);

	}

	/**
	 * [INS_SRCH_RCV_SETOFF]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV__SETOFF_Total(MSBGP_ArApplReg p){
		p.Total_total_rcv_amt_p_PPanel.putStatus(INS_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.INVISIBLE);
		p.Total_total_setoff_rcv_amt_p_PPanel.putStatus(INS_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.INVISIBLE);
		p.Total_total_setoff_rcv_amt2_p_PPanel.putStatus(INS_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_appl_amt_p_PPanel.putStatus(INS_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [INS_SRCH_RCV_SETOFF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV__SETOFF_Dtl(MSBGP_ArApplReg p){
		p.columnDtl_check.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.REQUIRED);
		p.Dtl_appl_tgt_amt_p_PPanel.putStatus(INS_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(INS_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt1_p_PPanel.putStatus(INS_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_amt2_p_PPanel.putStatus(INS_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_amt4_p_PPanel.putStatus(INS_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_not_appl_bal_p_PPanel.putStatus(INS_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_cd1.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_nm1.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ1.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wrk_no.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wrk_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_typ.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_typ_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_ym.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_cl_day.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_no.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_cd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_nm.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_d_rmrks.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.READ_ONLY);

	}

	/**
	 * [INS_SRCH_RCV_SETOFF]ステータスの[BillD]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV__SETOFF_BillD(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SRCH_RCV_SETOFF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV__SETOFF_Btn(MSBGP_ArApplReg p){
		p.Btn_select_all.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Btn_open_MSBGP0220.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS_SRCH_RCV_SETOFF, MCMode.DISABLE);

	}

	/**
	 * [INS_SRCH_RCV_SETOFF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV__SETOFF_EastBtn(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_SRCH_RCV_SETOFF]ステータスの[Srch_Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH__RCV__SETOFF_Srch__Cnd(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_REF_RCV_SETOFF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV__SETOFF_ScreenOpe(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_REF_RCV_SETOFF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV__SETOFF_Cnd(MSBGP_ArApplReg p){
		p.Cnd_ope_Group.putMode(p, INS_REF_RCV_SETOFF, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Cnd_rcv_act_rev.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS_REF_RCV_SETOFF, MCMode.DISABLE);

	}

	/**
	 * [INS_REF_RCV_SETOFF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV__SETOFF_HdrTab(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_REF_RCV_SETOFF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV__SETOFF_Hdr(MSBGP_ArApplReg p){
		p.Hdr_trd_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.REQUIRED);
		p.Hdr_trd_ptn_typ.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Hdr_ar_trd_grp_typ.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, INS_REF_RCV_SETOFF, MCMode.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.putStatus(INS_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Hdr_wg_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_def_bank_ac_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);

	}

	/**
	 * [INS_REF_RCV_SETOFF]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV__SETOFF_Sys(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_REF_RCV_SETOFF]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV__SETOFF_RcvTab(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_REF_RCV_SETOFF]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV__SETOFF_Rcv(MSBGP_ArApplReg p){
		p.Rcv_rcv_no.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_srch.putMode(p, INS_REF_RCV_SETOFF, MCMode.DISABLE);
		p.Rcv_slo_no.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcv_dt.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_xrate_p_PPanel.putStatus(INS_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(INS_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(INS_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ2.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm2.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_adv_trd_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_adv_trd_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_no.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_no.putMode(p, INS_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_srch.putMode(p, INS_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_dt.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_xrate_p_PPanel.putStatus(INS_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_setoff_xrate_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_rcv_amt_p_PPanel.putStatus(INS_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_not_proc_bal_p_PPanel.putStatus(INS_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_sttl_cd1.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_sttl_typ1.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_sttl_nm1.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_sls_purc_typ.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_purc_flg.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_sls_flg.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd_sub.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_rate.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.REQUIRED);
		p.Rcv_setoff_bd_dpt_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_rmrks.putMode(p, INS_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_sub_char1.putMode(p, INS_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_sub_char2.putMode(p, INS_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_sub_char3.putMode(p, INS_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_amt_dec_place.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);

	}

	/**
	 * [INS_REF_RCV_SETOFF]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV__SETOFF_Note(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_REF_RCV_SETOFF]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV__SETOFF_Setoff(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_REF_RCV_SETOFF]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV__SETOFF_DtlCnd(MSBGP_ArApplReg p){
		p.DtlCnd_narrow_down_flg.putMode(p, INS_REF_RCV_SETOFF, MCMode.ENABLE);
		p.DtlCnd_not_bill_flg.putMode(p, INS_REF_RCV_SETOFF, MCMode.ENABLE);
		p.DtlCnd_incl_appl_flg.putMode(p, INS_REF_RCV_SETOFF, MCMode.ENABLE);
		p.DtlCnd_zero_flg.putMode(p, INS_REF_RCV_SETOFF, MCMode.ENABLE);
		p.DtlCnd_slo_flg.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.DtlCnd_rcv_schd_dt.putMode(p, INS_REF_RCV_SETOFF, MCMode.ENABLE);
		p.DtlCnd_srch.putMode(p, INS_REF_RCV_SETOFF, MCMode.ENABLE);

	}

	/**
	 * [INS_REF_RCV_SETOFF]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV__SETOFF_Total(MSBGP_ArApplReg p){
		p.Total_total_rcv_amt_p_PPanel.putStatus(INS_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.INVISIBLE);
		p.Total_total_setoff_rcv_amt_p_PPanel.putStatus(INS_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.INVISIBLE);
		p.Total_total_setoff_rcv_amt2_p_PPanel.putStatus(INS_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_appl_amt_p_PPanel.putStatus(INS_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [INS_REF_RCV_SETOFF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV__SETOFF_Dtl(MSBGP_ArApplReg p){
		p.columnDtl_check.putMode(p, INS_REF_RCV_SETOFF, MCMode.REQUIRED);
		p.Dtl_appl_tgt_amt_p_PPanel.putStatus(INS_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(INS_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt1_p_PPanel.putStatus(INS_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_amt2_p_PPanel.putStatus(INS_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_amt4_p_PPanel.putStatus(INS_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Dtl_not_appl_bal_p_PPanel.putStatus(INS_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_cd1.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_nm1.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ1.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wrk_no.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wrk_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_typ.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_typ_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_ym.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_cl_day.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_no.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_cd.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_nm.putMode(p, INS_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_d_rmrks.putMode(p, INS_REF_RCV_SETOFF, MCMode.ENABLE);

	}

	/**
	 * [INS_REF_RCV_SETOFF]ステータスの[BillD]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV__SETOFF_BillD(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_REF_RCV_SETOFF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV__SETOFF_Btn(MSBGP_ArApplReg p){
		p.Btn_select_all.putMode(p, INS_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Btn_open_MSBGP0220.putMode(p, INS_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS_REF_RCV_SETOFF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, INS_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS_REF_RCV_SETOFF, MCMode.DISABLE);

	}

	/**
	 * [INS_REF_RCV_SETOFF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV__SETOFF_EastBtn(MSBGP_ArApplReg p){

	}

	/**
	 * [INS_REF_RCV_SETOFF]ステータスの[Srch_Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF__RCV__SETOFF_Srch__Cnd(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SETOFF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SETOFF_ScreenOpe(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SETOFF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SETOFF_Cnd(MSBGP_ArApplReg p){
		p.Cnd_ope_Group.putMode(p, UPD_SETOFF, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, UPD_SETOFF, MCMode.REQUIRED);
		p.Cnd_rcv_act_rev.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD_SETOFF, MCMode.ENABLE);

	}

	/**
	 * [UPD_SETOFF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SETOFF_HdrTab(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SETOFF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SETOFF_Hdr(MSBGP_ArApplReg p){
		p.Hdr_trd_cd.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);
		p.Hdr_ar_trd_grp_typ.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, UPD_SETOFF, MCMode.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(UPD_SETOFF, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_bill_basis_dt.putMode(p, UPD_SETOFF, MCMode.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.putStatus(UPD_SETOFF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, UPD_SETOFF, MCMode.ENABLE);
		p.Hdr_wg_cd.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Hdr_def_bank_ac_cd.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_SETOFF]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SETOFF_Sys(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SETOFF]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SETOFF_RcvTab(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SETOFF]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SETOFF_Rcv(MSBGP_ArApplReg p){
		p.Rcv_rcv_no.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_srch.putMode(p, UPD_SETOFF, MCMode.DISABLE);
		p.Rcv_slo_no.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcv_dt.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_xrate_p_PPanel.putStatus(UPD_SETOFF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(UPD_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(UPD_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ2.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm2.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_cd.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_cd.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_adv_trd_cd.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_adv_trd_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_no.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_no.putMode(p, UPD_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_srch.putMode(p, UPD_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_dt.putMode(p, UPD_SETOFF, MCMode.REQUIRED);
		p.Rcv_setoff_bcst_cd.putMode(p, UPD_SETOFF, MCMode.REQUIRED);
		p.Rcv_setoff_bcst_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_cd.putMode(p, UPD_SETOFF, MCMode.REQUIRED);
		p.Rcv_setoff_trd_cur_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_xrate_p_PPanel.putStatus(UPD_SETOFF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Rcv_setoff_xrate_cd.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_rcv_amt_p_PPanel.putStatus(UPD_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.REQUIRED);
		p.Rcv_setoff_not_proc_bal_p_PPanel.putStatus(UPD_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_sttl_cd1.putMode(p, UPD_SETOFF, MCMode.REQUIRED);
		p.Rcv_setoff_sttl_typ1.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_sttl_nm1.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_sls_purc_typ.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_purc_flg.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_sls_flg.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd_sub.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd.putMode(p, UPD_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_tax_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_rate.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ.putMode(p, UPD_SETOFF, MCMode.REQUIRED);
		p.Rcv_setoff_debt_cred_id_typ_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_cd.putMode(p, UPD_SETOFF, MCMode.REQUIRED);
		p.Rcv_setoff_debt_cred_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_cd.putMode(p, UPD_SETOFF, MCMode.REQUIRED);
		p.Rcv_setoff_bd_dpt_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_rmrks.putMode(p, UPD_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_sub_char1.putMode(p, UPD_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_sub_char2.putMode(p, UPD_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_sub_char3.putMode(p, UPD_SETOFF, MCMode.ENABLE);
		p.Rcv_amt_dec_place.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_SETOFF]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SETOFF_Note(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SETOFF]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SETOFF_Setoff(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SETOFF]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SETOFF_DtlCnd(MSBGP_ArApplReg p){
		p.DtlCnd_narrow_down_flg.putMode(p, UPD_SETOFF, MCMode.ENABLE);
		p.DtlCnd_not_bill_flg.putMode(p, UPD_SETOFF, MCMode.ENABLE);
		p.DtlCnd_incl_appl_flg.putMode(p, UPD_SETOFF, MCMode.ENABLE);
		p.DtlCnd_zero_flg.putMode(p, UPD_SETOFF, MCMode.ENABLE);
		p.DtlCnd_slo_flg.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.DtlCnd_rcv_schd_dt.putMode(p, UPD_SETOFF, MCMode.ENABLE);
		p.DtlCnd_srch.putMode(p, UPD_SETOFF, MCMode.ENABLE);

	}

	/**
	 * [UPD_SETOFF]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SETOFF_Total(MSBGP_ArApplReg p){
		p.Total_total_rcv_amt_p_PPanel.putStatus(UPD_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.INVISIBLE);
		p.Total_total_setoff_rcv_amt_p_PPanel.putStatus(UPD_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.INVISIBLE);
		p.Total_total_setoff_rcv_amt2_p_PPanel.putStatus(UPD_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_appl_amt_p_PPanel.putStatus(UPD_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [UPD_SETOFF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SETOFF_Dtl(MSBGP_ArApplReg p){
		p.columnDtl_check.putMode(p, UPD_SETOFF, MCMode.REQUIRED);
		p.Dtl_appl_tgt_amt_p_PPanel.putStatus(UPD_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(UPD_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt1_p_PPanel.putStatus(UPD_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_amt2_p_PPanel.putStatus(UPD_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_amt4_p_PPanel.putStatus(UPD_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Dtl_not_appl_bal_p_PPanel.putStatus(UPD_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_cd1.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_nm1.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ1.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wrk_no.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wrk_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_typ.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_typ_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_ym.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_cl_day.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_no.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_cd.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_nm.putMode(p, UPD_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_d_rmrks.putMode(p, UPD_SETOFF, MCMode.ENABLE);

	}

	/**
	 * [UPD_SETOFF]ステータスの[BillD]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SETOFF_BillD(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SETOFF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SETOFF_Btn(MSBGP_ArApplReg p){
		p.Btn_select_all.putMode(p, UPD_SETOFF, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_SETOFF, MCMode.ENABLE);
		p.Btn_open_MSBGP0220.putMode(p, UPD_SETOFF, MCMode.ENABLE);
		p.Btn_ins.putMode(p, UPD_SETOFF, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_SETOFF, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD_SETOFF, MCMode.DISABLE);

	}

	/**
	 * [UPD_SETOFF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SETOFF_EastBtn(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SETOFF]ステータスの[Srch_Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SETOFF_Srch__Cnd(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SRCH_RCV_SETOFF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV__SETOFF_ScreenOpe(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SRCH_RCV_SETOFF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV__SETOFF_Cnd(MSBGP_ArApplReg p){
		p.Cnd_ope_Group.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.REQUIRED);
		p.Cnd_rcv_act_rev.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.ENABLE);

	}

	/**
	 * [UPD_SRCH_RCV_SETOFF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV__SETOFF_HdrTab(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SRCH_RCV_SETOFF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV__SETOFF_Hdr(MSBGP_ArApplReg p){
		p.Hdr_trd_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Hdr_ar_trd_grp_typ.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(UPD_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_bill_basis_dt.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.putStatus(UPD_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Hdr_wg_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_def_bank_ac_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_SRCH_RCV_SETOFF]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV__SETOFF_Sys(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SRCH_RCV_SETOFF]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV__SETOFF_RcvTab(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SRCH_RCV_SETOFF]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV__SETOFF_Rcv(MSBGP_ArApplReg p){
		p.Rcv_rcv_no.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_srch.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.DISABLE);
		p.Rcv_slo_no.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcv_dt.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_xrate_p_PPanel.putStatus(UPD_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(UPD_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(UPD_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ2.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm2.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_adv_trd_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_adv_trd_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_no.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_no.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_srch.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_dt.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_xrate_p_PPanel.putStatus(UPD_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_setoff_xrate_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_rcv_amt_p_PPanel.putStatus(UPD_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_not_proc_bal_p_PPanel.putStatus(UPD_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_sttl_cd1.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_sttl_typ1.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_sttl_nm1.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_sls_purc_typ.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_purc_flg.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_sls_flg.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd_sub.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_rate.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_rmrks.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_sub_char1.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_sub_char2.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_sub_char3.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_amt_dec_place.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_SRCH_RCV_SETOFF]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV__SETOFF_Note(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SRCH_RCV_SETOFF]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV__SETOFF_Setoff(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SRCH_RCV_SETOFF]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV__SETOFF_DtlCnd(MSBGP_ArApplReg p){
		p.DtlCnd_narrow_down_flg.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.DtlCnd_not_bill_flg.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.DtlCnd_incl_appl_flg.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.DtlCnd_zero_flg.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.DtlCnd_slo_flg.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.DtlCnd_rcv_schd_dt.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.DtlCnd_srch.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_SRCH_RCV_SETOFF]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV__SETOFF_Total(MSBGP_ArApplReg p){
		p.Total_total_rcv_amt_p_PPanel.putStatus(UPD_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.INVISIBLE);
		p.Total_total_setoff_rcv_amt_p_PPanel.putStatus(UPD_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.INVISIBLE);
		p.Total_total_setoff_rcv_amt2_p_PPanel.putStatus(UPD_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_appl_amt_p_PPanel.putStatus(UPD_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [UPD_SRCH_RCV_SETOFF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV__SETOFF_Dtl(MSBGP_ArApplReg p){
		p.columnDtl_check.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.Dtl_appl_tgt_amt_p_PPanel.putStatus(UPD_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(UPD_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt1_p_PPanel.putStatus(UPD_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_amt2_p_PPanel.putStatus(UPD_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_amt4_p_PPanel.putStatus(UPD_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_not_appl_bal_p_PPanel.putStatus(UPD_SRCH_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_cd1.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_nm1.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ1.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wrk_no.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wrk_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_typ.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_typ_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_ym.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_cl_day.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_no.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_cd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_nm.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_d_rmrks.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_SRCH_RCV_SETOFF]ステータスの[BillD]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV__SETOFF_BillD(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SRCH_RCV_SETOFF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV__SETOFF_Btn(MSBGP_ArApplReg p){
		p.Btn_select_all.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Btn_open_MSBGP0220.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Btn_ins.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD_SRCH_RCV_SETOFF, MCMode.DISABLE);

	}

	/**
	 * [UPD_SRCH_RCV_SETOFF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV__SETOFF_EastBtn(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_SRCH_RCV_SETOFF]ステータスの[Srch_Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH__RCV__SETOFF_Srch__Cnd(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_REF_RCV_SETOFF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV__SETOFF_ScreenOpe(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_REF_RCV_SETOFF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV__SETOFF_Cnd(MSBGP_ArApplReg p){
		p.Cnd_ope_Group.putMode(p, UPD_REF_RCV_SETOFF, MCMode.REQUIRED);
		p.Cnd_rcv_act_no.putMode(p, UPD_REF_RCV_SETOFF, MCMode.REQUIRED);
		p.Cnd_rcv_act_rev.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD_REF_RCV_SETOFF, MCMode.ENABLE);

	}

	/**
	 * [UPD_REF_RCV_SETOFF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV__SETOFF_HdrTab(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_REF_RCV_SETOFF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV__SETOFF_Hdr(MSBGP_ArApplReg p){
		p.Hdr_trd_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Hdr_ar_trd_grp_typ.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_rcv_act_no.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_rcv_act_rev.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(UPD_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_bill_basis_dt.putMode(p, UPD_REF_RCV_SETOFF, MCMode.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.putStatus(UPD_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Hdr_wg_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Hdr_def_bank_ac_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_REF_RCV_SETOFF]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV__SETOFF_Sys(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_REF_RCV_SETOFF]ステータスの[RcvTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV__SETOFF_RcvTab(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_REF_RCV_SETOFF]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV__SETOFF_Rcv(MSBGP_ArApplReg p){
		p.Rcv_rcv_no.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_srch.putMode(p, UPD_REF_RCV_SETOFF, MCMode.DISABLE);
		p.Rcv_slo_no.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcv_dt.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcst_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcst_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bcst_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bcst_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bill_dpt_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_trd_cur_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_trd_cur_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_xrate_p_PPanel.putStatus(UPD_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_base_cur_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_xrate_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_rcv_amt_p_PPanel.putStatus(UPD_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_not_proc_bal_p_PPanel.putStatus(UPD_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_ar_sttl_cd1.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ1.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm1.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bank_ac_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bank_ac_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_xfr_psn.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_cd2.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_ar_sttl_typ2.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_ar_sttl_nm2.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sls_purc_typ2.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_purc_flg.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_sls_flg.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_tax_cd_sub.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_tax_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_tax_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_tax_rate.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_typ_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_id_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_debt_cred_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_bd_dpt_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_rcv_dat_typ_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_adv_trd_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_adv_trd_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_trd_rmrks.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sub_char1.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sub_char2.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_sub_char3.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_no.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_typ.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_typ_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_dt.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_due_dt.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_drawer_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_endrsr.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_accptr.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_bank_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_bank_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_branch_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_draw_branch_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_rsn_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_rsn_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char1.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char2.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_note_sub_char3.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_no.putMode(p, UPD_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_srch.putMode(p, UPD_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_dt.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_bcst_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_cur_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_xrate_p_PPanel.putStatus(UPD_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Rcv_setoff_xrate_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_rcv_amt_p_PPanel.putStatus(UPD_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_not_proc_bal_p_PPanel.putStatus(UPD_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Rcv_setoff_sttl_cd1.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_sttl_typ1.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_sttl_nm1.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_sls_purc_typ.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_purc_flg.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_sls_flg.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd_sub.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_setoff_tax_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_tax_rate.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_typ_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_id_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_debt_cred_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_bd_dpt_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.REQUIRED);
		p.Rcv_setoff_bd_dpt_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_rcv_dat_typ_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Rcv_setoff_trd_rmrks.putMode(p, UPD_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_sub_char1.putMode(p, UPD_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_sub_char2.putMode(p, UPD_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_setoff_sub_char3.putMode(p, UPD_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Rcv_amt_dec_place.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Rcv_upri_dec_place.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_REF_RCV_SETOFF]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV__SETOFF_Note(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_REF_RCV_SETOFF]ステータスの[Setoff]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV__SETOFF_Setoff(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_REF_RCV_SETOFF]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV__SETOFF_DtlCnd(MSBGP_ArApplReg p){
		p.DtlCnd_narrow_down_flg.putMode(p, UPD_REF_RCV_SETOFF, MCMode.ENABLE);
		p.DtlCnd_not_bill_flg.putMode(p, UPD_REF_RCV_SETOFF, MCMode.ENABLE);
		p.DtlCnd_incl_appl_flg.putMode(p, UPD_REF_RCV_SETOFF, MCMode.ENABLE);
		p.DtlCnd_zero_flg.putMode(p, UPD_REF_RCV_SETOFF, MCMode.ENABLE);
		p.DtlCnd_slo_flg.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.DtlCnd_rcv_schd_dt.putMode(p, UPD_REF_RCV_SETOFF, MCMode.ENABLE);
		p.DtlCnd_srch.putMode(p, UPD_REF_RCV_SETOFF, MCMode.ENABLE);

	}

	/**
	 * [UPD_REF_RCV_SETOFF]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV__SETOFF_Total(MSBGP_ArApplReg p){
		p.Total_total_rcv_amt_p_PPanel.putStatus(UPD_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.INVISIBLE);
		p.Total_total_setoff_rcv_amt_p_PPanel.putStatus(UPD_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.INVISIBLE);
		p.Total_total_setoff_rcv_amt2_p_PPanel.putStatus(UPD_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_total_appl_amt_p_PPanel.putStatus(UPD_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [UPD_REF_RCV_SETOFF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV__SETOFF_Dtl(MSBGP_ArApplReg p){
		p.columnDtl_check.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.Dtl_appl_tgt_amt_p_PPanel.putStatus(UPD_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(UPD_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_amt1_p_PPanel.putStatus(UPD_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_amt2_p_PPanel.putStatus(UPD_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_amt4_p_PPanel.putStatus(UPD_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Dtl_not_appl_bal_p_PPanel.putStatus(UPD_REF_RCV_SETOFF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_rcv_schd_dt.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_cd1.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_nm1.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ1.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.columnDtl_iv_no.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wrk_no.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wrk_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_typ.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_ar_typ_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_ym.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_cl_day.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_no.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bcst_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bcst_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_cd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_dpt_nm.putMode(p, UPD_REF_RCV_SETOFF, MCMode.READ_ONLY);
		p.columnDtl_bill_d_rmrks.putMode(p, UPD_REF_RCV_SETOFF, MCMode.ENABLE);

	}

	/**
	 * [UPD_REF_RCV_SETOFF]ステータスの[BillD]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV__SETOFF_BillD(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_REF_RCV_SETOFF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV__SETOFF_Btn(MSBGP_ArApplReg p){
		p.Btn_select_all.putMode(p, UPD_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Btn_open_MSBGP0220.putMode(p, UPD_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Btn_ins.putMode(p, UPD_REF_RCV_SETOFF, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_REF_RCV_SETOFF, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD_REF_RCV_SETOFF, MCMode.DISABLE);

	}

	/**
	 * [UPD_REF_RCV_SETOFF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV__SETOFF_EastBtn(MSBGP_ArApplReg p){

	}

	/**
	 * [UPD_REF_RCV_SETOFF]ステータスの[Srch_Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__REF__RCV__SETOFF_Srch__Cnd(MSBGP_ArApplReg p){

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
		MSBGP_ArApplReg_MC.setTableConfigDtl((MSBGP_ArApplReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBGP_ArApplReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.DtlTable.addTable(p.Dtl_appl_tgt_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_appl_ttl_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_amt1_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_amt2_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_amt4_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_not_appl_bal_p_PPanel.AmtTable);
		p.columnDtl_rcv_schd_dt.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.rcv_schd_dt_META);
		p.columnDtl_rcv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_rcv_schd_dt);
		p.columnDtl_ar_sttl_cd1.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.ar_sttl_cd1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_sttl_cd1);
		p.columnDtl_ar_sttl_nm1.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.ar_sttl_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_sttl_nm1);
		p.columnDtl_ar_sttl_typ1.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.ar_sttl_typ1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_sttl_typ1);
		p.columnDtl_iv_no.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.iv_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_no);
		p.columnDtl_wrk_no.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.wrk_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wrk_no);
		p.columnDtl_wrk_nm.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.wrk_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wrk_nm);
		p.columnDtl_acst_cd.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.acst_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_acst_cd);
		p.columnDtl_acst_nm.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.acst_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_acst_nm);
		p.columnDtl_ar_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.ar_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_dpt_cd);
		p.columnDtl_ar_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.ar_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_dpt_nm);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		p.columnDtl_ar_typ.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.ar_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_typ);
		p.columnDtl_ar_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.ar_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_typ_nm);
		p.columnDtl_bill_ym.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.bill_ym_META);
		p.columnDtl_bill_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_ym);
		p.columnDtl_bill_cl_day.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.bill_cl_day_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_cl_day);
		p.columnDtl_bill_no.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.bill_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_no);
		p.columnDtl_bcst_cd.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.bcst_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bcst_cd);
		p.columnDtl_bcst_nm.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.bcst_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bcst_nm);
		p.columnDtl_bill_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.bill_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_dpt_cd);
		p.columnDtl_bill_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.bill_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_dpt_nm);
		p.columnDtl_bill_d_rmrks.setMeta(mcframe.clientMSBG.MSBGP0210.DtlR.bill_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_d_rmrks);
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
		Rcv_debt_cred_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rcv_debt_cred_id_typ.getListConfig().setPutter(getRcv_debt_cred_id_typ_ListPutter());
		Rcv_debt_cred_id_cd.getListConfig().setPutter(getRcv_debt_cred_id_cd_ListPutter());
		Rcv_bd_dpt_cd.getListConfig().setPutter(getRcv_bd_dpt_cd_ListPutter());
		Rcv_note_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rcv_note_typ.getListConfig().setPutter(getRcv_note_typ_ListPutter());
		Rcv_draw_bank_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rcv_draw_bank_cd.getListConfig().setPutter(getRcv_draw_bank_cd_ListPutter());
		Rcv_draw_branch_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rcv_draw_branch_cd.getListConfig().setPutter(getRcv_draw_branch_cd_ListPutter());
		Rcv_note_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rcv_note_rsn_cd.getListConfig().setPutter(getRcv_note_rsn_cd_ListPutter());
		Rcv_setoff_bcst_cd.getListConfig().setPutter(getRcv_setoff_bcst_cd_ListPutter());
		Rcv_setoff_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rcv_setoff_trd_cur_cd.getListConfig().setPutter(getRcv_setoff_trd_cur_cd_ListPutter());
		Rcv_setoff_sttl_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rcv_setoff_sttl_cd1.getListConfig().setPutter(getRcv_setoff_sttl_cd1_ListPutter());
		Rcv_setoff_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rcv_setoff_tax_cd.getListConfig().setPutter(getRcv_setoff_tax_cd_ListPutter());
		Rcv_setoff_debt_cred_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rcv_setoff_debt_cred_id_typ.getListConfig().setPutter(getRcv_setoff_debt_cred_id_typ_ListPutter());
		Rcv_setoff_debt_cred_id_cd.getListConfig().setPutter(getRcv_setoff_debt_cred_id_cd_ListPutter());
		Rcv_setoff_bd_dpt_cd.getListConfig().setPutter(getRcv_setoff_bd_dpt_cd_ListPutter());
		columnDtl_ar_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ar_typ.getListConfig().setPutter(getDtl_ar_typ_ListPutter());
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
	 * この画面を[INS_SRCH_RCV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_SRCH_RCVStatus() {
		status = INS_SRCH_RCV;
		setAllStatus(status);
	}

	/**
	 * この画面を[INS_REF_RCV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_REF_RCVStatus() {
		status = INS_REF_RCV;
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
	 * この画面を[UPD_SRCH_RCV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_SRCH_RCVStatus() {
		status = UPD_SRCH_RCV;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_REF_RCV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_REF_RCVStatus() {
		status = UPD_REF_RCV;
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
	 * この画面を[FIX_D]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_DStatus() {
		status = FIX_D;
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
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
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
	 * この画面を[INS_SETOFF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_SETOFFStatus() {
		status = INS_SETOFF;
		setAllStatus(status);
	}

	/**
	 * この画面を[INS_SRCH_RCV_SETOFF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_SRCH_RCV_SETOFFStatus() {
		status = INS_SRCH_RCV_SETOFF;
		setAllStatus(status);
	}

	/**
	 * この画面を[INS_REF_RCV_SETOFF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_REF_RCV_SETOFFStatus() {
		status = INS_REF_RCV_SETOFF;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_SETOFF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_SETOFFStatus() {
		status = UPD_SETOFF;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_SRCH_RCV_SETOFF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_SRCH_RCV_SETOFFStatus() {
		status = UPD_SRCH_RCV_SETOFF;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_REF_RCV_SETOFF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_REF_RCV_SETOFFStatus() {
		status = UPD_REF_RCV_SETOFF;
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
		else if (INS_SRCH_RCV.equals(status)) {
			setINS_SRCH_RCVStatus();
		}
		else if (INS_REF_RCV.equals(status)) {
			setINS_REF_RCVStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (UPD_SRCH_RCV.equals(status)) {
			setUPD_SRCH_RCVStatus();
		}
		else if (UPD_REF_RCV.equals(status)) {
			setUPD_REF_RCVStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (NO_SLIP_CD.equals(status)) {
			setNO_SLIP_CDStatus();
		}
		else if (INS_SETOFF.equals(status)) {
			setINS_SETOFFStatus();
		}
		else if (INS_SRCH_RCV_SETOFF.equals(status)) {
			setINS_SRCH_RCV_SETOFFStatus();
		}
		else if (INS_REF_RCV_SETOFF.equals(status)) {
			setINS_REF_RCV_SETOFFStatus();
		}
		else if (UPD_SETOFF.equals(status)) {
			setUPD_SETOFFStatus();
		}
		else if (UPD_SRCH_RCV_SETOFF.equals(status)) {
			setUPD_SRCH_RCV_SETOFFStatus();
		}
		else if (UPD_REF_RCV_SETOFF.equals(status)) {
			setUPD_REF_RCV_SETOFFStatus();
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
		lp.setListLogicId("MA.MAUAP0010.ArSttlSetoffDrWtax");
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
	 * [Rcv_debt_cred_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createRcv_debt_cred_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DebtCredIdTyp");
		return lp;
	}
	 
	/**
	 * [Rcv_debt_cred_id_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcv_debt_cred_id_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Rcv_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcv_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Rcv_note_typ_ListPutter]の作成
	 */
	protected MCListPutter createRcv_note_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NoteTyp");
		return lp;
	}
	 
	/**
	 * [Rcv_draw_bank_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcv_draw_bank_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bank");
		return lp;
	}
	 
	/**
	 * [Rcv_draw_branch_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcv_draw_branch_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BankBranch");
		return lp;
	}
	 
	/**
	 * [Rcv_note_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcv_note_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NoteRsn");
		return lp;
	}
	 
	/**
	 * [Rcv_setoff_bcst_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcv_setoff_bcst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Rcv_setoff_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcv_setoff_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Rcv_setoff_sttl_cd1_ListPutter]の作成
	 */
	protected MCListPutter createRcv_setoff_sttl_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ArSttlSetoffDrWtax");
		return lp;
	}
	 
	/**
	 * [Rcv_setoff_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcv_setoff_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tax");
		return lp;
	}
	 
	/**
	 * [Rcv_setoff_debt_cred_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createRcv_setoff_debt_cred_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DebtCredIdTyp");
		return lp;
	}
	 
	/**
	 * [Rcv_setoff_debt_cred_id_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcv_setoff_debt_cred_id_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Rcv_setoff_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcv_setoff_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_ar_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ar_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
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
		if(combo == Rcv_rcst_cd) return getRcv_rcst_cd(row, info);
		if(combo == Rcv_bcst_cd) return getRcv_bcst_cd(row, info);
		if(combo == Rcv_bill_dpt_cd) return getRcv_bill_dpt_cd(row, info);
		if(combo == Rcv_trd_cur_cd) return getRcv_trd_cur_cd(row, info);
		if(combo == Rcv_ar_sttl_cd1) return getRcv_ar_sttl_cd1(row, info);
		if(combo == Rcv_bank_ac_cd) return getRcv_bank_ac_cd(row, info);
		if(combo == Rcv_ar_sttl_cd2) return getRcv_ar_sttl_cd2(row, info);
		if(combo == Rcv_tax_cd) return getRcv_tax_cd(row, info);
		if(combo == Rcv_debt_cred_id_typ) return getRcv_debt_cred_id_typ(row, info);
		if(combo == Rcv_debt_cred_id_cd) return getRcv_debt_cred_id_cd(row, info);
		if(combo == Rcv_bd_dpt_cd) return getRcv_bd_dpt_cd(row, info);
		if(combo == Rcv_note_typ) return getRcv_note_typ(row, info);
		if(combo == Rcv_draw_bank_cd) return getRcv_draw_bank_cd(row, info);
		if(combo == Rcv_draw_branch_cd) return getRcv_draw_branch_cd(row, info);
		if(combo == Rcv_note_rsn_cd) return getRcv_note_rsn_cd(row, info);
		if(combo == Rcv_setoff_bcst_cd) return getRcv_setoff_bcst_cd(row, info);
		if(combo == Rcv_setoff_trd_cur_cd) return getRcv_setoff_trd_cur_cd(row, info);
		if(combo == Rcv_setoff_sttl_cd1) return getRcv_setoff_sttl_cd1(row, info);
		if(combo == Rcv_setoff_tax_cd) return getRcv_setoff_tax_cd(row, info);
		if(combo == Rcv_setoff_debt_cred_id_typ) return getRcv_setoff_debt_cred_id_typ(row, info);
		if(combo == Rcv_setoff_debt_cred_id_cd) return getRcv_setoff_debt_cred_id_cd(row, info);
		if(combo == Rcv_setoff_bd_dpt_cd) return getRcv_setoff_bd_dpt_cd(row, info);
		if(combo == columnDtl_ar_typ) return getDtl_ar_typ(row, info);
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
		else if (ap == Rcv_setoff_srch) doRcv_setoff_srch(info);
		else if (ap == DtlCnd_srch) doDtlCnd_srch(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_open_MSBGP0220) doBtn_open_MSBGP0220(info);
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
	 * [Rcv]パネルの[setoff_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRcv_setoff_srch(MCEventInfo info);

	/**
	 * [DtlCnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlCnd_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBGP0220]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0220(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_rcv_act_no) return doCnd_rcv_act_no_VC(info);
		if (vc == Cnd_rcv_act_rev) return doCnd_rcv_act_rev_VC(info);
		if (vc == Cnd_latest_flg) return doCnd_latest_flg_VC(info);
		if (vc == Hdr_trd_cd) return doHdr_trd_cd_VC(info);
		if (vc == Hdr_trd_ptn_typ) return doHdr_trd_ptn_typ_VC(info);
		if (vc == Hdr_ar_trd_grp_typ) return doHdr_ar_trd_grp_typ_VC(info);
		if (vc == Hdr_trd_nm) return doHdr_trd_nm_VC(info);
		if (vc == Hdr_ac_ym) return doHdr_ac_ym_VC(info);
		if (vc == Hdr_rcv_act_no) return doHdr_rcv_act_no_VC(info);
		if (vc == Hdr_rcv_act_rev) return doHdr_rcv_act_rev_VC(info);
		if (vc == Hdr_latest_flg) return doHdr_latest_flg_VC(info);
		if (vc == Hdr_ac_dt) return doHdr_ac_dt_VC(info);
		if (vc == Hdr_bill_basis_dt) return doHdr_bill_basis_dt_VC(info);
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
		if (vc == Hdr_def_bank_ac_cd) return doHdr_def_bank_ac_cd_VC(info);
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
		if (vc == Rcv_base_cur_cd) return doRcv_base_cur_cd_VC(info);
		if (vc == Rcv_xrate_cd) return doRcv_xrate_cd_VC(info);
		if (vc == Rcv_ar_sttl_cd1) return doRcv_ar_sttl_cd1_VC(info);
		if (vc == Rcv_ar_sttl_typ1) return doRcv_ar_sttl_typ1_VC(info);
		if (vc == Rcv_ar_sttl_nm1) return doRcv_ar_sttl_nm1_VC(info);
		if (vc == Rcv_bank_ac_cd) return doRcv_bank_ac_cd_VC(info);
		if (vc == Rcv_bank_ac_nm) return doRcv_bank_ac_nm_VC(info);
		if (vc == Rcv_xfr_psn) return doRcv_xfr_psn_VC(info);
		if (vc == Rcv_ar_sttl_cd2) return doRcv_ar_sttl_cd2_VC(info);
		if (vc == Rcv_ar_sttl_typ2) return doRcv_ar_sttl_typ2_VC(info);
		if (vc == Rcv_ar_sttl_nm2) return doRcv_ar_sttl_nm2_VC(info);
		if (vc == Rcv_sls_purc_typ2) return doRcv_sls_purc_typ2_VC(info);
		if (vc == Rcv_purc_flg) return doRcv_purc_flg_VC(info);
		if (vc == Rcv_sls_flg) return doRcv_sls_flg_VC(info);
		if (vc == Rcv_tax_cd_sub) return doRcv_tax_cd_sub_VC(info);
		if (vc == Rcv_tax_cd) return doRcv_tax_cd_VC(info);
		if (vc == Rcv_tax_nm) return doRcv_tax_nm_VC(info);
		if (vc == Rcv_tax_rate) return doRcv_tax_rate_VC(info);
		if (vc == Rcv_debt_cred_id_typ) return doRcv_debt_cred_id_typ_VC(info);
		if (vc == Rcv_debt_cred_id_typ_nm) return doRcv_debt_cred_id_typ_nm_VC(info);
		if (vc == Rcv_debt_cred_id_cd) return doRcv_debt_cred_id_cd_VC(info);
		if (vc == Rcv_debt_cred_nm) return doRcv_debt_cred_nm_VC(info);
		if (vc == Rcv_bd_dpt_cd) return doRcv_bd_dpt_cd_VC(info);
		if (vc == Rcv_bd_dpt_nm) return doRcv_bd_dpt_nm_VC(info);
		if (vc == Rcv_rcv_dat_typ) return doRcv_rcv_dat_typ_VC(info);
		if (vc == Rcv_rcv_dat_typ_nm) return doRcv_rcv_dat_typ_nm_VC(info);
		if (vc == Rcv_adv_trd_cd) return doRcv_adv_trd_cd_VC(info);
		if (vc == Rcv_adv_trd_nm) return doRcv_adv_trd_nm_VC(info);
		if (vc == Rcv_trd_rmrks) return doRcv_trd_rmrks_VC(info);
		if (vc == Rcv_sub_char1) return doRcv_sub_char1_VC(info);
		if (vc == Rcv_sub_char2) return doRcv_sub_char2_VC(info);
		if (vc == Rcv_sub_char3) return doRcv_sub_char3_VC(info);
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
		if (vc == Rcv_setoff_rcv_no) return doRcv_setoff_rcv_no_VC(info);
		if (vc == Rcv_setoff_dt) return doRcv_setoff_dt_VC(info);
		if (vc == Rcv_setoff_bcst_cd) return doRcv_setoff_bcst_cd_VC(info);
		if (vc == Rcv_setoff_bcst_nm) return doRcv_setoff_bcst_nm_VC(info);
		if (vc == Rcv_setoff_trd_cur_cd) return doRcv_setoff_trd_cur_cd_VC(info);
		if (vc == Rcv_setoff_trd_cur_nm) return doRcv_setoff_trd_cur_nm_VC(info);
		if (vc == Rcv_setoff_xrate_cd) return doRcv_setoff_xrate_cd_VC(info);
		if (vc == Rcv_setoff_sttl_cd1) return doRcv_setoff_sttl_cd1_VC(info);
		if (vc == Rcv_setoff_sttl_typ1) return doRcv_setoff_sttl_typ1_VC(info);
		if (vc == Rcv_setoff_sttl_nm1) return doRcv_setoff_sttl_nm1_VC(info);
		if (vc == Rcv_setoff_sls_purc_typ) return doRcv_setoff_sls_purc_typ_VC(info);
		if (vc == Rcv_setoff_purc_flg) return doRcv_setoff_purc_flg_VC(info);
		if (vc == Rcv_setoff_sls_flg) return doRcv_setoff_sls_flg_VC(info);
		if (vc == Rcv_setoff_tax_cd_sub) return doRcv_setoff_tax_cd_sub_VC(info);
		if (vc == Rcv_setoff_tax_cd) return doRcv_setoff_tax_cd_VC(info);
		if (vc == Rcv_setoff_tax_nm) return doRcv_setoff_tax_nm_VC(info);
		if (vc == Rcv_setoff_tax_rate) return doRcv_setoff_tax_rate_VC(info);
		if (vc == Rcv_setoff_debt_cred_id_typ) return doRcv_setoff_debt_cred_id_typ_VC(info);
		if (vc == Rcv_setoff_debt_cred_id_typ_nm) return doRcv_setoff_debt_cred_id_typ_nm_VC(info);
		if (vc == Rcv_setoff_debt_cred_id_cd) return doRcv_setoff_debt_cred_id_cd_VC(info);
		if (vc == Rcv_setoff_debt_cred_nm) return doRcv_setoff_debt_cred_nm_VC(info);
		if (vc == Rcv_setoff_bd_dpt_cd) return doRcv_setoff_bd_dpt_cd_VC(info);
		if (vc == Rcv_setoff_bd_dpt_nm) return doRcv_setoff_bd_dpt_nm_VC(info);
		if (vc == Rcv_setoff_rcv_dat_typ) return doRcv_setoff_rcv_dat_typ_VC(info);
		if (vc == Rcv_setoff_rcv_dat_typ_nm) return doRcv_setoff_rcv_dat_typ_nm_VC(info);
		if (vc == Rcv_setoff_trd_rmrks) return doRcv_setoff_trd_rmrks_VC(info);
		if (vc == Rcv_setoff_sub_char1) return doRcv_setoff_sub_char1_VC(info);
		if (vc == Rcv_setoff_sub_char2) return doRcv_setoff_sub_char2_VC(info);
		if (vc == Rcv_setoff_sub_char3) return doRcv_setoff_sub_char3_VC(info);
		if (vc == Rcv_amt_dec_place) return doRcv_amt_dec_place_VC(info);
		if (vc == Rcv_upri_dec_place) return doRcv_upri_dec_place_VC(info);
		if (vc == DtlCnd_narrow_down_flg) return doDtlCnd_narrow_down_flg_VC(info);
		if (vc == DtlCnd_not_bill_flg) return doDtlCnd_not_bill_flg_VC(info);
		if (vc == DtlCnd_incl_appl_flg) return doDtlCnd_incl_appl_flg_VC(info);
		if (vc == DtlCnd_zero_flg) return doDtlCnd_zero_flg_VC(info);
		if (vc == DtlCnd_slo_flg) return doDtlCnd_slo_flg_VC(info);
		if (vc == DtlCnd_rcv_schd_dt) return doDtlCnd_rcv_schd_dt_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_rcv_schd_dt) return doDtl_rcv_schd_dt_VC(info);
		if (vc == columnDtl_ar_sttl_cd1) return doDtl_ar_sttl_cd1_VC(info);
		if (vc == columnDtl_ar_sttl_nm1) return doDtl_ar_sttl_nm1_VC(info);
		if (vc == columnDtl_ar_sttl_typ1) return doDtl_ar_sttl_typ1_VC(info);
		if (vc == columnDtl_iv_no) return doDtl_iv_no_VC(info);
		if (vc == columnDtl_wrk_no) return doDtl_wrk_no_VC(info);
		if (vc == columnDtl_wrk_nm) return doDtl_wrk_nm_VC(info);
		if (vc == columnDtl_acst_cd) return doDtl_acst_cd_VC(info);
		if (vc == columnDtl_acst_nm) return doDtl_acst_nm_VC(info);
		if (vc == columnDtl_ar_dpt_cd) return doDtl_ar_dpt_cd_VC(info);
		if (vc == columnDtl_ar_dpt_nm) return doDtl_ar_dpt_nm_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnDtl_ar_typ) return doDtl_ar_typ_VC(info);
		if (vc == columnDtl_ar_typ_nm) return doDtl_ar_typ_nm_VC(info);
		if (vc == columnDtl_bill_ym) return doDtl_bill_ym_VC(info);
		if (vc == columnDtl_bill_cl_day) return doDtl_bill_cl_day_VC(info);
		if (vc == columnDtl_bill_no) return doDtl_bill_no_VC(info);
		if (vc == columnDtl_bcst_cd) return doDtl_bcst_cd_VC(info);
		if (vc == columnDtl_bcst_nm) return doDtl_bcst_nm_VC(info);
		if (vc == columnDtl_bill_dpt_cd) return doDtl_bill_dpt_cd_VC(info);
		if (vc == columnDtl_bill_dpt_nm) return doDtl_bill_dpt_nm_VC(info);
		if (vc == columnDtl_bill_d_rmrks) return doDtl_bill_d_rmrks_VC(info);
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
	 * [Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[ar_trd_grp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ar_trd_grp_typ_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[latest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_latest_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_basis_dt_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[def_bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_def_bank_ac_cd_VC(MCEventInfo info){
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
	 * [Rcv]パネルの[ar_sttl_typ2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_ar_sttl_typ2_VC(MCEventInfo info){
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
	 * [Rcv]パネルの[debt_cred_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_debt_cred_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[debt_cred_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_debt_cred_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[debt_cred_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_debt_cred_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[debt_cred_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_debt_cred_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_bd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[rcv_dat_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_rcv_dat_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[rcv_dat_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_rcv_dat_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[adv_trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_adv_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[adv_trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_adv_trd_nm_VC(MCEventInfo info){
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
	 * [Rcv]パネルの[setoff_rcv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_rcv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_sttl_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_sttl_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_sttl_typ1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_sttl_typ1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_sttl_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_sttl_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_sls_purc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_sls_purc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_tax_cd_sub]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_tax_cd_sub_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_debt_cred_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_debt_cred_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_debt_cred_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_debt_cred_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_debt_cred_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_debt_cred_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_debt_cred_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_debt_cred_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_bd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_rcv_dat_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_rcv_dat_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_rcv_dat_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_rcv_dat_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rcv]パネルの[setoff_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcv_setoff_sub_char3_VC(MCEventInfo info){
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
	 * [DtlCnd]パネルの[narrow_down_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlCnd_narrow_down_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlCnd]パネルの[not_bill_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlCnd_not_bill_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlCnd]パネルの[incl_appl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlCnd_incl_appl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlCnd]パネルの[zero_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlCnd_zero_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlCnd]パネルの[slo_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlCnd_slo_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlCnd]パネルの[rcv_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlCnd_rcv_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcv_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcv_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_sttl_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_sttl_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_sttl_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_sttl_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_sttl_typ1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_sttl_typ1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wrk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wrk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[acst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_acst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[acst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_acst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_cl_day]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_cl_day_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_d_rmrks_VC(MCEventInfo info){
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
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_rcv_act_no) doCnd_rcv_act_no_NC(info);
		else if (nc == Cnd_rcv_act_rev) doCnd_rcv_act_rev_NC(info);
		else if (nc == Cnd_latest_flg) doCnd_latest_flg_NC(info);
		else if (nc == Hdr_trd_cd) doHdr_trd_cd_NC(info);
		else if (nc == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NC(info);
		else if (nc == Hdr_ar_trd_grp_typ) doHdr_ar_trd_grp_typ_NC(info);
		else if (nc == Hdr_trd_nm) doHdr_trd_nm_NC(info);
		else if (nc == Hdr_ac_ym) doHdr_ac_ym_NC(info);
		else if (nc == Hdr_rcv_act_no) doHdr_rcv_act_no_NC(info);
		else if (nc == Hdr_rcv_act_rev) doHdr_rcv_act_rev_NC(info);
		else if (nc == Hdr_latest_flg) doHdr_latest_flg_NC(info);
		else if (nc == Hdr_ac_dt) doHdr_ac_dt_NC(info);
		else if (nc == Hdr_bill_basis_dt) doHdr_bill_basis_dt_NC(info);
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
		else if (nc == Hdr_def_bank_ac_cd) doHdr_def_bank_ac_cd_NC(info);
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
		else if (nc == Rcv_base_cur_cd) doRcv_base_cur_cd_NC(info);
		else if (nc == Rcv_xrate_cd) doRcv_xrate_cd_NC(info);
		else if (nc == Rcv_ar_sttl_cd1) doRcv_ar_sttl_cd1_NC(info);
		else if (nc == Rcv_ar_sttl_typ1) doRcv_ar_sttl_typ1_NC(info);
		else if (nc == Rcv_ar_sttl_nm1) doRcv_ar_sttl_nm1_NC(info);
		else if (nc == Rcv_bank_ac_cd) doRcv_bank_ac_cd_NC(info);
		else if (nc == Rcv_bank_ac_nm) doRcv_bank_ac_nm_NC(info);
		else if (nc == Rcv_xfr_psn) doRcv_xfr_psn_NC(info);
		else if (nc == Rcv_ar_sttl_cd2) doRcv_ar_sttl_cd2_NC(info);
		else if (nc == Rcv_ar_sttl_typ2) doRcv_ar_sttl_typ2_NC(info);
		else if (nc == Rcv_ar_sttl_nm2) doRcv_ar_sttl_nm2_NC(info);
		else if (nc == Rcv_sls_purc_typ2) doRcv_sls_purc_typ2_NC(info);
		else if (nc == Rcv_purc_flg) doRcv_purc_flg_NC(info);
		else if (nc == Rcv_sls_flg) doRcv_sls_flg_NC(info);
		else if (nc == Rcv_tax_cd_sub) doRcv_tax_cd_sub_NC(info);
		else if (nc == Rcv_tax_cd) doRcv_tax_cd_NC(info);
		else if (nc == Rcv_tax_nm) doRcv_tax_nm_NC(info);
		else if (nc == Rcv_tax_rate) doRcv_tax_rate_NC(info);
		else if (nc == Rcv_debt_cred_id_typ) doRcv_debt_cred_id_typ_NC(info);
		else if (nc == Rcv_debt_cred_id_typ_nm) doRcv_debt_cred_id_typ_nm_NC(info);
		else if (nc == Rcv_debt_cred_id_cd) doRcv_debt_cred_id_cd_NC(info);
		else if (nc == Rcv_debt_cred_nm) doRcv_debt_cred_nm_NC(info);
		else if (nc == Rcv_bd_dpt_cd) doRcv_bd_dpt_cd_NC(info);
		else if (nc == Rcv_bd_dpt_nm) doRcv_bd_dpt_nm_NC(info);
		else if (nc == Rcv_rcv_dat_typ) doRcv_rcv_dat_typ_NC(info);
		else if (nc == Rcv_rcv_dat_typ_nm) doRcv_rcv_dat_typ_nm_NC(info);
		else if (nc == Rcv_adv_trd_cd) doRcv_adv_trd_cd_NC(info);
		else if (nc == Rcv_adv_trd_nm) doRcv_adv_trd_nm_NC(info);
		else if (nc == Rcv_trd_rmrks) doRcv_trd_rmrks_NC(info);
		else if (nc == Rcv_sub_char1) doRcv_sub_char1_NC(info);
		else if (nc == Rcv_sub_char2) doRcv_sub_char2_NC(info);
		else if (nc == Rcv_sub_char3) doRcv_sub_char3_NC(info);
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
		else if (nc == Rcv_setoff_rcv_no) doRcv_setoff_rcv_no_NC(info);
		else if (nc == Rcv_setoff_dt) doRcv_setoff_dt_NC(info);
		else if (nc == Rcv_setoff_bcst_cd) doRcv_setoff_bcst_cd_NC(info);
		else if (nc == Rcv_setoff_bcst_nm) doRcv_setoff_bcst_nm_NC(info);
		else if (nc == Rcv_setoff_trd_cur_cd) doRcv_setoff_trd_cur_cd_NC(info);
		else if (nc == Rcv_setoff_trd_cur_nm) doRcv_setoff_trd_cur_nm_NC(info);
		else if (nc == Rcv_setoff_xrate_cd) doRcv_setoff_xrate_cd_NC(info);
		else if (nc == Rcv_setoff_sttl_cd1) doRcv_setoff_sttl_cd1_NC(info);
		else if (nc == Rcv_setoff_sttl_typ1) doRcv_setoff_sttl_typ1_NC(info);
		else if (nc == Rcv_setoff_sttl_nm1) doRcv_setoff_sttl_nm1_NC(info);
		else if (nc == Rcv_setoff_sls_purc_typ) doRcv_setoff_sls_purc_typ_NC(info);
		else if (nc == Rcv_setoff_purc_flg) doRcv_setoff_purc_flg_NC(info);
		else if (nc == Rcv_setoff_sls_flg) doRcv_setoff_sls_flg_NC(info);
		else if (nc == Rcv_setoff_tax_cd_sub) doRcv_setoff_tax_cd_sub_NC(info);
		else if (nc == Rcv_setoff_tax_cd) doRcv_setoff_tax_cd_NC(info);
		else if (nc == Rcv_setoff_tax_nm) doRcv_setoff_tax_nm_NC(info);
		else if (nc == Rcv_setoff_tax_rate) doRcv_setoff_tax_rate_NC(info);
		else if (nc == Rcv_setoff_debt_cred_id_typ) doRcv_setoff_debt_cred_id_typ_NC(info);
		else if (nc == Rcv_setoff_debt_cred_id_typ_nm) doRcv_setoff_debt_cred_id_typ_nm_NC(info);
		else if (nc == Rcv_setoff_debt_cred_id_cd) doRcv_setoff_debt_cred_id_cd_NC(info);
		else if (nc == Rcv_setoff_debt_cred_nm) doRcv_setoff_debt_cred_nm_NC(info);
		else if (nc == Rcv_setoff_bd_dpt_cd) doRcv_setoff_bd_dpt_cd_NC(info);
		else if (nc == Rcv_setoff_bd_dpt_nm) doRcv_setoff_bd_dpt_nm_NC(info);
		else if (nc == Rcv_setoff_rcv_dat_typ) doRcv_setoff_rcv_dat_typ_NC(info);
		else if (nc == Rcv_setoff_rcv_dat_typ_nm) doRcv_setoff_rcv_dat_typ_nm_NC(info);
		else if (nc == Rcv_setoff_trd_rmrks) doRcv_setoff_trd_rmrks_NC(info);
		else if (nc == Rcv_setoff_sub_char1) doRcv_setoff_sub_char1_NC(info);
		else if (nc == Rcv_setoff_sub_char2) doRcv_setoff_sub_char2_NC(info);
		else if (nc == Rcv_setoff_sub_char3) doRcv_setoff_sub_char3_NC(info);
		else if (nc == Rcv_amt_dec_place) doRcv_amt_dec_place_NC(info);
		else if (nc == Rcv_upri_dec_place) doRcv_upri_dec_place_NC(info);
		else if (nc == DtlCnd_narrow_down_flg) doDtlCnd_narrow_down_flg_NC(info);
		else if (nc == DtlCnd_not_bill_flg) doDtlCnd_not_bill_flg_NC(info);
		else if (nc == DtlCnd_incl_appl_flg) doDtlCnd_incl_appl_flg_NC(info);
		else if (nc == DtlCnd_zero_flg) doDtlCnd_zero_flg_NC(info);
		else if (nc == DtlCnd_slo_flg) doDtlCnd_slo_flg_NC(info);
		else if (nc == DtlCnd_rcv_schd_dt) doDtlCnd_rcv_schd_dt_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_rcv_schd_dt) doDtl_rcv_schd_dt_NC(info);
		else if (nc == columnDtl_ar_sttl_cd1) doDtl_ar_sttl_cd1_NC(info);
		else if (nc == columnDtl_ar_sttl_nm1) doDtl_ar_sttl_nm1_NC(info);
		else if (nc == columnDtl_ar_sttl_typ1) doDtl_ar_sttl_typ1_NC(info);
		else if (nc == columnDtl_iv_no) doDtl_iv_no_NC(info);
		else if (nc == columnDtl_wrk_no) doDtl_wrk_no_NC(info);
		else if (nc == columnDtl_wrk_nm) doDtl_wrk_nm_NC(info);
		else if (nc == columnDtl_acst_cd) doDtl_acst_cd_NC(info);
		else if (nc == columnDtl_acst_nm) doDtl_acst_nm_NC(info);
		else if (nc == columnDtl_ar_dpt_cd) doDtl_ar_dpt_cd_NC(info);
		else if (nc == columnDtl_ar_dpt_nm) doDtl_ar_dpt_nm_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnDtl_ar_typ) doDtl_ar_typ_NC(info);
		else if (nc == columnDtl_ar_typ_nm) doDtl_ar_typ_nm_NC(info);
		else if (nc == columnDtl_bill_ym) doDtl_bill_ym_NC(info);
		else if (nc == columnDtl_bill_cl_day) doDtl_bill_cl_day_NC(info);
		else if (nc == columnDtl_bill_no) doDtl_bill_no_NC(info);
		else if (nc == columnDtl_bcst_cd) doDtl_bcst_cd_NC(info);
		else if (nc == columnDtl_bcst_nm) doDtl_bcst_nm_NC(info);
		else if (nc == columnDtl_bill_dpt_cd) doDtl_bill_dpt_cd_NC(info);
		else if (nc == columnDtl_bill_dpt_nm) doDtl_bill_dpt_nm_NC(info);
		else if (nc == columnDtl_bill_d_rmrks) doDtl_bill_d_rmrks_NC(info);
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
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[ar_trd_grp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_trd_grp_typ_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_basis_dt_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[def_bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_bank_ac_cd_NC(MCEventInfo info){
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
	 * [Rcv]パネルの[ar_sttl_typ2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_typ2_NC(MCEventInfo info){
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
	 * [Rcv]パネルの[debt_cred_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_cred_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debt_cred_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_cred_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debt_cred_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_cred_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debt_cred_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_cred_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcv_dat_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcv_dat_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcv_dat_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcv_dat_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[adv_trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_adv_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[adv_trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_adv_trd_nm_NC(MCEventInfo info){
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
	 * [Rcv]パネルの[setoff_rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_rcv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sttl_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sttl_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sttl_typ1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sttl_typ1_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sttl_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sttl_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sls_purc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sls_purc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_tax_cd_sub]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_tax_cd_sub_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_debt_cred_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_debt_cred_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_debt_cred_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_debt_cred_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_debt_cred_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_debt_cred_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_debt_cred_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_debt_cred_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_rcv_dat_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_rcv_dat_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_rcv_dat_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_rcv_dat_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sub_char3_NC(MCEventInfo info){
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
	 * [DtlCnd]パネルの[narrow_down_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlCnd_narrow_down_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlCnd]パネルの[not_bill_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlCnd_not_bill_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlCnd]パネルの[incl_appl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlCnd_incl_appl_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlCnd]パネルの[zero_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlCnd_zero_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlCnd]パネルの[slo_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlCnd_slo_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlCnd]パネルの[rcv_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlCnd_rcv_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_typ1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_typ1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wrk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wrk_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_ym_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_cl_day]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_cl_day_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_d_rmrks_NC(MCEventInfo info){
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
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_rcv_act_no) doCnd_rcv_act_no_NE(info);
		else if (ne == Cnd_rcv_act_rev) doCnd_rcv_act_rev_NE(info);
		else if (ne == Cnd_latest_flg) doCnd_latest_flg_NE(info);
		else if (ne == Hdr_trd_cd) doHdr_trd_cd_NE(info);
		else if (ne == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NE(info);
		else if (ne == Hdr_ar_trd_grp_typ) doHdr_ar_trd_grp_typ_NE(info);
		else if (ne == Hdr_trd_nm) doHdr_trd_nm_NE(info);
		else if (ne == Hdr_ac_ym) doHdr_ac_ym_NE(info);
		else if (ne == Hdr_rcv_act_no) doHdr_rcv_act_no_NE(info);
		else if (ne == Hdr_rcv_act_rev) doHdr_rcv_act_rev_NE(info);
		else if (ne == Hdr_latest_flg) doHdr_latest_flg_NE(info);
		else if (ne == Hdr_ac_dt) doHdr_ac_dt_NE(info);
		else if (ne == Hdr_bill_basis_dt) doHdr_bill_basis_dt_NE(info);
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
		else if (ne == Hdr_def_bank_ac_cd) doHdr_def_bank_ac_cd_NE(info);
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
		else if (ne == Rcv_base_cur_cd) doRcv_base_cur_cd_NE(info);
		else if (ne == Rcv_xrate_cd) doRcv_xrate_cd_NE(info);
		else if (ne == Rcv_ar_sttl_cd1) doRcv_ar_sttl_cd1_NE(info);
		else if (ne == Rcv_ar_sttl_typ1) doRcv_ar_sttl_typ1_NE(info);
		else if (ne == Rcv_ar_sttl_nm1) doRcv_ar_sttl_nm1_NE(info);
		else if (ne == Rcv_bank_ac_cd) doRcv_bank_ac_cd_NE(info);
		else if (ne == Rcv_bank_ac_nm) doRcv_bank_ac_nm_NE(info);
		else if (ne == Rcv_xfr_psn) doRcv_xfr_psn_NE(info);
		else if (ne == Rcv_ar_sttl_cd2) doRcv_ar_sttl_cd2_NE(info);
		else if (ne == Rcv_ar_sttl_typ2) doRcv_ar_sttl_typ2_NE(info);
		else if (ne == Rcv_ar_sttl_nm2) doRcv_ar_sttl_nm2_NE(info);
		else if (ne == Rcv_sls_purc_typ2) doRcv_sls_purc_typ2_NE(info);
		else if (ne == Rcv_purc_flg) doRcv_purc_flg_NE(info);
		else if (ne == Rcv_sls_flg) doRcv_sls_flg_NE(info);
		else if (ne == Rcv_tax_cd_sub) doRcv_tax_cd_sub_NE(info);
		else if (ne == Rcv_tax_cd) doRcv_tax_cd_NE(info);
		else if (ne == Rcv_tax_nm) doRcv_tax_nm_NE(info);
		else if (ne == Rcv_tax_rate) doRcv_tax_rate_NE(info);
		else if (ne == Rcv_debt_cred_id_typ) doRcv_debt_cred_id_typ_NE(info);
		else if (ne == Rcv_debt_cred_id_typ_nm) doRcv_debt_cred_id_typ_nm_NE(info);
		else if (ne == Rcv_debt_cred_id_cd) doRcv_debt_cred_id_cd_NE(info);
		else if (ne == Rcv_debt_cred_nm) doRcv_debt_cred_nm_NE(info);
		else if (ne == Rcv_bd_dpt_cd) doRcv_bd_dpt_cd_NE(info);
		else if (ne == Rcv_bd_dpt_nm) doRcv_bd_dpt_nm_NE(info);
		else if (ne == Rcv_rcv_dat_typ) doRcv_rcv_dat_typ_NE(info);
		else if (ne == Rcv_rcv_dat_typ_nm) doRcv_rcv_dat_typ_nm_NE(info);
		else if (ne == Rcv_adv_trd_cd) doRcv_adv_trd_cd_NE(info);
		else if (ne == Rcv_adv_trd_nm) doRcv_adv_trd_nm_NE(info);
		else if (ne == Rcv_trd_rmrks) doRcv_trd_rmrks_NE(info);
		else if (ne == Rcv_sub_char1) doRcv_sub_char1_NE(info);
		else if (ne == Rcv_sub_char2) doRcv_sub_char2_NE(info);
		else if (ne == Rcv_sub_char3) doRcv_sub_char3_NE(info);
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
		else if (ne == Rcv_setoff_rcv_no) doRcv_setoff_rcv_no_NE(info);
		else if (ne == Rcv_setoff_dt) doRcv_setoff_dt_NE(info);
		else if (ne == Rcv_setoff_bcst_cd) doRcv_setoff_bcst_cd_NE(info);
		else if (ne == Rcv_setoff_bcst_nm) doRcv_setoff_bcst_nm_NE(info);
		else if (ne == Rcv_setoff_trd_cur_cd) doRcv_setoff_trd_cur_cd_NE(info);
		else if (ne == Rcv_setoff_trd_cur_nm) doRcv_setoff_trd_cur_nm_NE(info);
		else if (ne == Rcv_setoff_xrate_cd) doRcv_setoff_xrate_cd_NE(info);
		else if (ne == Rcv_setoff_sttl_cd1) doRcv_setoff_sttl_cd1_NE(info);
		else if (ne == Rcv_setoff_sttl_typ1) doRcv_setoff_sttl_typ1_NE(info);
		else if (ne == Rcv_setoff_sttl_nm1) doRcv_setoff_sttl_nm1_NE(info);
		else if (ne == Rcv_setoff_sls_purc_typ) doRcv_setoff_sls_purc_typ_NE(info);
		else if (ne == Rcv_setoff_purc_flg) doRcv_setoff_purc_flg_NE(info);
		else if (ne == Rcv_setoff_sls_flg) doRcv_setoff_sls_flg_NE(info);
		else if (ne == Rcv_setoff_tax_cd_sub) doRcv_setoff_tax_cd_sub_NE(info);
		else if (ne == Rcv_setoff_tax_cd) doRcv_setoff_tax_cd_NE(info);
		else if (ne == Rcv_setoff_tax_nm) doRcv_setoff_tax_nm_NE(info);
		else if (ne == Rcv_setoff_tax_rate) doRcv_setoff_tax_rate_NE(info);
		else if (ne == Rcv_setoff_debt_cred_id_typ) doRcv_setoff_debt_cred_id_typ_NE(info);
		else if (ne == Rcv_setoff_debt_cred_id_typ_nm) doRcv_setoff_debt_cred_id_typ_nm_NE(info);
		else if (ne == Rcv_setoff_debt_cred_id_cd) doRcv_setoff_debt_cred_id_cd_NE(info);
		else if (ne == Rcv_setoff_debt_cred_nm) doRcv_setoff_debt_cred_nm_NE(info);
		else if (ne == Rcv_setoff_bd_dpt_cd) doRcv_setoff_bd_dpt_cd_NE(info);
		else if (ne == Rcv_setoff_bd_dpt_nm) doRcv_setoff_bd_dpt_nm_NE(info);
		else if (ne == Rcv_setoff_rcv_dat_typ) doRcv_setoff_rcv_dat_typ_NE(info);
		else if (ne == Rcv_setoff_rcv_dat_typ_nm) doRcv_setoff_rcv_dat_typ_nm_NE(info);
		else if (ne == Rcv_setoff_trd_rmrks) doRcv_setoff_trd_rmrks_NE(info);
		else if (ne == Rcv_setoff_sub_char1) doRcv_setoff_sub_char1_NE(info);
		else if (ne == Rcv_setoff_sub_char2) doRcv_setoff_sub_char2_NE(info);
		else if (ne == Rcv_setoff_sub_char3) doRcv_setoff_sub_char3_NE(info);
		else if (ne == Rcv_amt_dec_place) doRcv_amt_dec_place_NE(info);
		else if (ne == Rcv_upri_dec_place) doRcv_upri_dec_place_NE(info);
		else if (ne == DtlCnd_narrow_down_flg) doDtlCnd_narrow_down_flg_NE(info);
		else if (ne == DtlCnd_not_bill_flg) doDtlCnd_not_bill_flg_NE(info);
		else if (ne == DtlCnd_incl_appl_flg) doDtlCnd_incl_appl_flg_NE(info);
		else if (ne == DtlCnd_zero_flg) doDtlCnd_zero_flg_NE(info);
		else if (ne == DtlCnd_slo_flg) doDtlCnd_slo_flg_NE(info);
		else if (ne == DtlCnd_rcv_schd_dt) doDtlCnd_rcv_schd_dt_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_rcv_schd_dt) doDtl_rcv_schd_dt_NE(info);
		else if (ne == columnDtl_ar_sttl_cd1) doDtl_ar_sttl_cd1_NE(info);
		else if (ne == columnDtl_ar_sttl_nm1) doDtl_ar_sttl_nm1_NE(info);
		else if (ne == columnDtl_ar_sttl_typ1) doDtl_ar_sttl_typ1_NE(info);
		else if (ne == columnDtl_iv_no) doDtl_iv_no_NE(info);
		else if (ne == columnDtl_wrk_no) doDtl_wrk_no_NE(info);
		else if (ne == columnDtl_wrk_nm) doDtl_wrk_nm_NE(info);
		else if (ne == columnDtl_acst_cd) doDtl_acst_cd_NE(info);
		else if (ne == columnDtl_acst_nm) doDtl_acst_nm_NE(info);
		else if (ne == columnDtl_ar_dpt_cd) doDtl_ar_dpt_cd_NE(info);
		else if (ne == columnDtl_ar_dpt_nm) doDtl_ar_dpt_nm_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnDtl_ar_typ) doDtl_ar_typ_NE(info);
		else if (ne == columnDtl_ar_typ_nm) doDtl_ar_typ_nm_NE(info);
		else if (ne == columnDtl_bill_ym) doDtl_bill_ym_NE(info);
		else if (ne == columnDtl_bill_cl_day) doDtl_bill_cl_day_NE(info);
		else if (ne == columnDtl_bill_no) doDtl_bill_no_NE(info);
		else if (ne == columnDtl_bcst_cd) doDtl_bcst_cd_NE(info);
		else if (ne == columnDtl_bcst_nm) doDtl_bcst_nm_NE(info);
		else if (ne == columnDtl_bill_dpt_cd) doDtl_bill_dpt_cd_NE(info);
		else if (ne == columnDtl_bill_dpt_nm) doDtl_bill_dpt_nm_NE(info);
		else if (ne == columnDtl_bill_d_rmrks) doDtl_bill_d_rmrks_NE(info);
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
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[ar_trd_grp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_trd_grp_typ_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_basis_dt_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[def_bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_bank_ac_cd_NE(MCEventInfo info){
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
	 * [Rcv]パネルの[ar_sttl_typ2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_typ2_NE(MCEventInfo info){
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
	 * [Rcv]パネルの[debt_cred_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_cred_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debt_cred_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_cred_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debt_cred_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_cred_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debt_cred_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_cred_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcv_dat_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcv_dat_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcv_dat_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcv_dat_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[adv_trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_adv_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[adv_trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_adv_trd_nm_NE(MCEventInfo info){
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
	 * [Rcv]パネルの[setoff_rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_rcv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sttl_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sttl_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sttl_typ1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sttl_typ1_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sttl_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sttl_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sls_purc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sls_purc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_tax_cd_sub]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_tax_cd_sub_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_debt_cred_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_debt_cred_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_debt_cred_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_debt_cred_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_debt_cred_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_debt_cred_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_debt_cred_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_debt_cred_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_rcv_dat_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_rcv_dat_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_rcv_dat_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_rcv_dat_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sub_char3_NE(MCEventInfo info){
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
	 * [DtlCnd]パネルの[narrow_down_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlCnd_narrow_down_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlCnd]パネルの[not_bill_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlCnd_not_bill_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlCnd]パネルの[incl_appl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlCnd_incl_appl_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlCnd]パネルの[zero_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlCnd_zero_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlCnd]パネルの[slo_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlCnd_slo_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlCnd]パネルの[rcv_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlCnd_rcv_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_typ1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_typ1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wrk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wrk_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_ym_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_cl_day]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_cl_day_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_d_rmrks_NE(MCEventInfo info){
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
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_rcv_act_no) doCnd_rcv_act_no_NX(info);
		else if (nx == Cnd_rcv_act_rev) doCnd_rcv_act_rev_NX(info);
		else if (nx == Cnd_latest_flg) doCnd_latest_flg_NX(info);
		else if (nx == Hdr_trd_cd) doHdr_trd_cd_NX(info);
		else if (nx == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NX(info);
		else if (nx == Hdr_ar_trd_grp_typ) doHdr_ar_trd_grp_typ_NX(info);
		else if (nx == Hdr_trd_nm) doHdr_trd_nm_NX(info);
		else if (nx == Hdr_ac_ym) doHdr_ac_ym_NX(info);
		else if (nx == Hdr_rcv_act_no) doHdr_rcv_act_no_NX(info);
		else if (nx == Hdr_rcv_act_rev) doHdr_rcv_act_rev_NX(info);
		else if (nx == Hdr_latest_flg) doHdr_latest_flg_NX(info);
		else if (nx == Hdr_ac_dt) doHdr_ac_dt_NX(info);
		else if (nx == Hdr_bill_basis_dt) doHdr_bill_basis_dt_NX(info);
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
		else if (nx == Hdr_def_bank_ac_cd) doHdr_def_bank_ac_cd_NX(info);
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
		else if (nx == Rcv_base_cur_cd) doRcv_base_cur_cd_NX(info);
		else if (nx == Rcv_xrate_cd) doRcv_xrate_cd_NX(info);
		else if (nx == Rcv_ar_sttl_cd1) doRcv_ar_sttl_cd1_NX(info);
		else if (nx == Rcv_ar_sttl_typ1) doRcv_ar_sttl_typ1_NX(info);
		else if (nx == Rcv_ar_sttl_nm1) doRcv_ar_sttl_nm1_NX(info);
		else if (nx == Rcv_bank_ac_cd) doRcv_bank_ac_cd_NX(info);
		else if (nx == Rcv_bank_ac_nm) doRcv_bank_ac_nm_NX(info);
		else if (nx == Rcv_xfr_psn) doRcv_xfr_psn_NX(info);
		else if (nx == Rcv_ar_sttl_cd2) doRcv_ar_sttl_cd2_NX(info);
		else if (nx == Rcv_ar_sttl_typ2) doRcv_ar_sttl_typ2_NX(info);
		else if (nx == Rcv_ar_sttl_nm2) doRcv_ar_sttl_nm2_NX(info);
		else if (nx == Rcv_sls_purc_typ2) doRcv_sls_purc_typ2_NX(info);
		else if (nx == Rcv_purc_flg) doRcv_purc_flg_NX(info);
		else if (nx == Rcv_sls_flg) doRcv_sls_flg_NX(info);
		else if (nx == Rcv_tax_cd_sub) doRcv_tax_cd_sub_NX(info);
		else if (nx == Rcv_tax_cd) doRcv_tax_cd_NX(info);
		else if (nx == Rcv_tax_nm) doRcv_tax_nm_NX(info);
		else if (nx == Rcv_tax_rate) doRcv_tax_rate_NX(info);
		else if (nx == Rcv_debt_cred_id_typ) doRcv_debt_cred_id_typ_NX(info);
		else if (nx == Rcv_debt_cred_id_typ_nm) doRcv_debt_cred_id_typ_nm_NX(info);
		else if (nx == Rcv_debt_cred_id_cd) doRcv_debt_cred_id_cd_NX(info);
		else if (nx == Rcv_debt_cred_nm) doRcv_debt_cred_nm_NX(info);
		else if (nx == Rcv_bd_dpt_cd) doRcv_bd_dpt_cd_NX(info);
		else if (nx == Rcv_bd_dpt_nm) doRcv_bd_dpt_nm_NX(info);
		else if (nx == Rcv_rcv_dat_typ) doRcv_rcv_dat_typ_NX(info);
		else if (nx == Rcv_rcv_dat_typ_nm) doRcv_rcv_dat_typ_nm_NX(info);
		else if (nx == Rcv_adv_trd_cd) doRcv_adv_trd_cd_NX(info);
		else if (nx == Rcv_adv_trd_nm) doRcv_adv_trd_nm_NX(info);
		else if (nx == Rcv_trd_rmrks) doRcv_trd_rmrks_NX(info);
		else if (nx == Rcv_sub_char1) doRcv_sub_char1_NX(info);
		else if (nx == Rcv_sub_char2) doRcv_sub_char2_NX(info);
		else if (nx == Rcv_sub_char3) doRcv_sub_char3_NX(info);
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
		else if (nx == Rcv_setoff_rcv_no) doRcv_setoff_rcv_no_NX(info);
		else if (nx == Rcv_setoff_dt) doRcv_setoff_dt_NX(info);
		else if (nx == Rcv_setoff_bcst_cd) doRcv_setoff_bcst_cd_NX(info);
		else if (nx == Rcv_setoff_bcst_nm) doRcv_setoff_bcst_nm_NX(info);
		else if (nx == Rcv_setoff_trd_cur_cd) doRcv_setoff_trd_cur_cd_NX(info);
		else if (nx == Rcv_setoff_trd_cur_nm) doRcv_setoff_trd_cur_nm_NX(info);
		else if (nx == Rcv_setoff_xrate_cd) doRcv_setoff_xrate_cd_NX(info);
		else if (nx == Rcv_setoff_sttl_cd1) doRcv_setoff_sttl_cd1_NX(info);
		else if (nx == Rcv_setoff_sttl_typ1) doRcv_setoff_sttl_typ1_NX(info);
		else if (nx == Rcv_setoff_sttl_nm1) doRcv_setoff_sttl_nm1_NX(info);
		else if (nx == Rcv_setoff_sls_purc_typ) doRcv_setoff_sls_purc_typ_NX(info);
		else if (nx == Rcv_setoff_purc_flg) doRcv_setoff_purc_flg_NX(info);
		else if (nx == Rcv_setoff_sls_flg) doRcv_setoff_sls_flg_NX(info);
		else if (nx == Rcv_setoff_tax_cd_sub) doRcv_setoff_tax_cd_sub_NX(info);
		else if (nx == Rcv_setoff_tax_cd) doRcv_setoff_tax_cd_NX(info);
		else if (nx == Rcv_setoff_tax_nm) doRcv_setoff_tax_nm_NX(info);
		else if (nx == Rcv_setoff_tax_rate) doRcv_setoff_tax_rate_NX(info);
		else if (nx == Rcv_setoff_debt_cred_id_typ) doRcv_setoff_debt_cred_id_typ_NX(info);
		else if (nx == Rcv_setoff_debt_cred_id_typ_nm) doRcv_setoff_debt_cred_id_typ_nm_NX(info);
		else if (nx == Rcv_setoff_debt_cred_id_cd) doRcv_setoff_debt_cred_id_cd_NX(info);
		else if (nx == Rcv_setoff_debt_cred_nm) doRcv_setoff_debt_cred_nm_NX(info);
		else if (nx == Rcv_setoff_bd_dpt_cd) doRcv_setoff_bd_dpt_cd_NX(info);
		else if (nx == Rcv_setoff_bd_dpt_nm) doRcv_setoff_bd_dpt_nm_NX(info);
		else if (nx == Rcv_setoff_rcv_dat_typ) doRcv_setoff_rcv_dat_typ_NX(info);
		else if (nx == Rcv_setoff_rcv_dat_typ_nm) doRcv_setoff_rcv_dat_typ_nm_NX(info);
		else if (nx == Rcv_setoff_trd_rmrks) doRcv_setoff_trd_rmrks_NX(info);
		else if (nx == Rcv_setoff_sub_char1) doRcv_setoff_sub_char1_NX(info);
		else if (nx == Rcv_setoff_sub_char2) doRcv_setoff_sub_char2_NX(info);
		else if (nx == Rcv_setoff_sub_char3) doRcv_setoff_sub_char3_NX(info);
		else if (nx == Rcv_amt_dec_place) doRcv_amt_dec_place_NX(info);
		else if (nx == Rcv_upri_dec_place) doRcv_upri_dec_place_NX(info);
		else if (nx == DtlCnd_narrow_down_flg) doDtlCnd_narrow_down_flg_NX(info);
		else if (nx == DtlCnd_not_bill_flg) doDtlCnd_not_bill_flg_NX(info);
		else if (nx == DtlCnd_incl_appl_flg) doDtlCnd_incl_appl_flg_NX(info);
		else if (nx == DtlCnd_zero_flg) doDtlCnd_zero_flg_NX(info);
		else if (nx == DtlCnd_slo_flg) doDtlCnd_slo_flg_NX(info);
		else if (nx == DtlCnd_rcv_schd_dt) doDtlCnd_rcv_schd_dt_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_rcv_schd_dt) doDtl_rcv_schd_dt_NX(info);
		else if (nx == columnDtl_ar_sttl_cd1) doDtl_ar_sttl_cd1_NX(info);
		else if (nx == columnDtl_ar_sttl_nm1) doDtl_ar_sttl_nm1_NX(info);
		else if (nx == columnDtl_ar_sttl_typ1) doDtl_ar_sttl_typ1_NX(info);
		else if (nx == columnDtl_iv_no) doDtl_iv_no_NX(info);
		else if (nx == columnDtl_wrk_no) doDtl_wrk_no_NX(info);
		else if (nx == columnDtl_wrk_nm) doDtl_wrk_nm_NX(info);
		else if (nx == columnDtl_acst_cd) doDtl_acst_cd_NX(info);
		else if (nx == columnDtl_acst_nm) doDtl_acst_nm_NX(info);
		else if (nx == columnDtl_ar_dpt_cd) doDtl_ar_dpt_cd_NX(info);
		else if (nx == columnDtl_ar_dpt_nm) doDtl_ar_dpt_nm_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnDtl_ar_typ) doDtl_ar_typ_NX(info);
		else if (nx == columnDtl_ar_typ_nm) doDtl_ar_typ_nm_NX(info);
		else if (nx == columnDtl_bill_ym) doDtl_bill_ym_NX(info);
		else if (nx == columnDtl_bill_cl_day) doDtl_bill_cl_day_NX(info);
		else if (nx == columnDtl_bill_no) doDtl_bill_no_NX(info);
		else if (nx == columnDtl_bcst_cd) doDtl_bcst_cd_NX(info);
		else if (nx == columnDtl_bcst_nm) doDtl_bcst_nm_NX(info);
		else if (nx == columnDtl_bill_dpt_cd) doDtl_bill_dpt_cd_NX(info);
		else if (nx == columnDtl_bill_dpt_nm) doDtl_bill_dpt_nm_NX(info);
		else if (nx == columnDtl_bill_d_rmrks) doDtl_bill_d_rmrks_NX(info);
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
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[ar_trd_grp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_trd_grp_typ_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_basis_dt_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[def_bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_bank_ac_cd_NX(MCEventInfo info){
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
	 * [Rcv]パネルの[ar_sttl_typ2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_typ2_NX(MCEventInfo info){
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
	 * [Rcv]パネルの[debt_cred_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_cred_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debt_cred_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_cred_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debt_cred_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_cred_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debt_cred_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_cred_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcv_dat_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcv_dat_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcv_dat_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcv_dat_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[adv_trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_adv_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[adv_trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_adv_trd_nm_NX(MCEventInfo info){
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
	 * [Rcv]パネルの[setoff_rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_rcv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sttl_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sttl_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sttl_typ1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sttl_typ1_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sttl_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sttl_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sls_purc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sls_purc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_tax_cd_sub]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_tax_cd_sub_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_debt_cred_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_debt_cred_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_debt_cred_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_debt_cred_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_debt_cred_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_debt_cred_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_debt_cred_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_debt_cred_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_rcv_dat_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_rcv_dat_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_rcv_dat_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_rcv_dat_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sub_char3_NX(MCEventInfo info){
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
	 * [DtlCnd]パネルの[narrow_down_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlCnd_narrow_down_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlCnd]パネルの[not_bill_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlCnd_not_bill_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlCnd]パネルの[incl_appl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlCnd_incl_appl_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlCnd]パネルの[zero_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlCnd_zero_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlCnd]パネルの[slo_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlCnd_slo_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlCnd]パネルの[rcv_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlCnd_rcv_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_typ1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_typ1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wrk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wrk_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_ym_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_cl_day]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_cl_day_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_d_rmrks_NX(MCEventInfo info){
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
		else if (lc == Hdr_ar_trd_grp_typ) doHdr_ar_trd_grp_typ_LC(info);
		else if (lc == Hdr_trd_nm) doHdr_trd_nm_LC(info);
		else if (lc == Hdr_ac_ym) doHdr_ac_ym_LC(info);
		else if (lc == Hdr_rcv_act_no) doHdr_rcv_act_no_LC(info);
		else if (lc == Hdr_rcv_act_rev) doHdr_rcv_act_rev_LC(info);
		else if (lc == Hdr_ac_dt) doHdr_ac_dt_LC(info);
		else if (lc == Hdr_bill_basis_dt) doHdr_bill_basis_dt_LC(info);
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
		else if (lc == Hdr_def_bank_ac_cd) doHdr_def_bank_ac_cd_LC(info);
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
		else if (lc == Rcv_base_cur_cd) doRcv_base_cur_cd_LC(info);
		else if (lc == Rcv_xrate_cd) doRcv_xrate_cd_LC(info);
		else if (lc == Rcv_ar_sttl_cd1) doRcv_ar_sttl_cd1_LC(info);
		else if (lc == Rcv_ar_sttl_typ1) doRcv_ar_sttl_typ1_LC(info);
		else if (lc == Rcv_ar_sttl_nm1) doRcv_ar_sttl_nm1_LC(info);
		else if (lc == Rcv_bank_ac_cd) doRcv_bank_ac_cd_LC(info);
		else if (lc == Rcv_bank_ac_nm) doRcv_bank_ac_nm_LC(info);
		else if (lc == Rcv_xfr_psn) doRcv_xfr_psn_LC(info);
		else if (lc == Rcv_ar_sttl_cd2) doRcv_ar_sttl_cd2_LC(info);
		else if (lc == Rcv_ar_sttl_typ2) doRcv_ar_sttl_typ2_LC(info);
		else if (lc == Rcv_ar_sttl_nm2) doRcv_ar_sttl_nm2_LC(info);
		else if (lc == Rcv_sls_purc_typ2) doRcv_sls_purc_typ2_LC(info);
		else if (lc == Rcv_tax_cd_sub) doRcv_tax_cd_sub_LC(info);
		else if (lc == Rcv_tax_cd) doRcv_tax_cd_LC(info);
		else if (lc == Rcv_tax_nm) doRcv_tax_nm_LC(info);
		else if (lc == Rcv_tax_rate) doRcv_tax_rate_LC(info);
		else if (lc == Rcv_debt_cred_id_typ) doRcv_debt_cred_id_typ_LC(info);
		else if (lc == Rcv_debt_cred_id_typ_nm) doRcv_debt_cred_id_typ_nm_LC(info);
		else if (lc == Rcv_debt_cred_id_cd) doRcv_debt_cred_id_cd_LC(info);
		else if (lc == Rcv_debt_cred_nm) doRcv_debt_cred_nm_LC(info);
		else if (lc == Rcv_bd_dpt_cd) doRcv_bd_dpt_cd_LC(info);
		else if (lc == Rcv_bd_dpt_nm) doRcv_bd_dpt_nm_LC(info);
		else if (lc == Rcv_rcv_dat_typ) doRcv_rcv_dat_typ_LC(info);
		else if (lc == Rcv_rcv_dat_typ_nm) doRcv_rcv_dat_typ_nm_LC(info);
		else if (lc == Rcv_adv_trd_cd) doRcv_adv_trd_cd_LC(info);
		else if (lc == Rcv_adv_trd_nm) doRcv_adv_trd_nm_LC(info);
		else if (lc == Rcv_trd_rmrks) doRcv_trd_rmrks_LC(info);
		else if (lc == Rcv_sub_char1) doRcv_sub_char1_LC(info);
		else if (lc == Rcv_sub_char2) doRcv_sub_char2_LC(info);
		else if (lc == Rcv_sub_char3) doRcv_sub_char3_LC(info);
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
		else if (lc == Rcv_setoff_rcv_no) doRcv_setoff_rcv_no_LC(info);
		else if (lc == Rcv_setoff_dt) doRcv_setoff_dt_LC(info);
		else if (lc == Rcv_setoff_bcst_cd) doRcv_setoff_bcst_cd_LC(info);
		else if (lc == Rcv_setoff_bcst_nm) doRcv_setoff_bcst_nm_LC(info);
		else if (lc == Rcv_setoff_trd_cur_cd) doRcv_setoff_trd_cur_cd_LC(info);
		else if (lc == Rcv_setoff_trd_cur_nm) doRcv_setoff_trd_cur_nm_LC(info);
		else if (lc == Rcv_setoff_xrate_cd) doRcv_setoff_xrate_cd_LC(info);
		else if (lc == Rcv_setoff_sttl_cd1) doRcv_setoff_sttl_cd1_LC(info);
		else if (lc == Rcv_setoff_sttl_typ1) doRcv_setoff_sttl_typ1_LC(info);
		else if (lc == Rcv_setoff_sttl_nm1) doRcv_setoff_sttl_nm1_LC(info);
		else if (lc == Rcv_setoff_sls_purc_typ) doRcv_setoff_sls_purc_typ_LC(info);
		else if (lc == Rcv_setoff_tax_cd_sub) doRcv_setoff_tax_cd_sub_LC(info);
		else if (lc == Rcv_setoff_tax_cd) doRcv_setoff_tax_cd_LC(info);
		else if (lc == Rcv_setoff_tax_nm) doRcv_setoff_tax_nm_LC(info);
		else if (lc == Rcv_setoff_tax_rate) doRcv_setoff_tax_rate_LC(info);
		else if (lc == Rcv_setoff_debt_cred_id_typ) doRcv_setoff_debt_cred_id_typ_LC(info);
		else if (lc == Rcv_setoff_debt_cred_id_typ_nm) doRcv_setoff_debt_cred_id_typ_nm_LC(info);
		else if (lc == Rcv_setoff_debt_cred_id_cd) doRcv_setoff_debt_cred_id_cd_LC(info);
		else if (lc == Rcv_setoff_debt_cred_nm) doRcv_setoff_debt_cred_nm_LC(info);
		else if (lc == Rcv_setoff_bd_dpt_cd) doRcv_setoff_bd_dpt_cd_LC(info);
		else if (lc == Rcv_setoff_bd_dpt_nm) doRcv_setoff_bd_dpt_nm_LC(info);
		else if (lc == Rcv_setoff_rcv_dat_typ) doRcv_setoff_rcv_dat_typ_LC(info);
		else if (lc == Rcv_setoff_rcv_dat_typ_nm) doRcv_setoff_rcv_dat_typ_nm_LC(info);
		else if (lc == Rcv_setoff_trd_rmrks) doRcv_setoff_trd_rmrks_LC(info);
		else if (lc == Rcv_setoff_sub_char1) doRcv_setoff_sub_char1_LC(info);
		else if (lc == Rcv_setoff_sub_char2) doRcv_setoff_sub_char2_LC(info);
		else if (lc == Rcv_setoff_sub_char3) doRcv_setoff_sub_char3_LC(info);
		else if (lc == Rcv_amt_dec_place) doRcv_amt_dec_place_LC(info);
		else if (lc == Rcv_upri_dec_place) doRcv_upri_dec_place_LC(info);
		else if (lc == DtlCnd_rcv_schd_dt) doDtlCnd_rcv_schd_dt_LC(info);
		else if (lc == columnDtl_rcv_schd_dt) doDtl_rcv_schd_dt_LC(info);
		else if (lc == columnDtl_ar_sttl_cd1) doDtl_ar_sttl_cd1_LC(info);
		else if (lc == columnDtl_ar_sttl_nm1) doDtl_ar_sttl_nm1_LC(info);
		else if (lc == columnDtl_ar_sttl_typ1) doDtl_ar_sttl_typ1_LC(info);
		else if (lc == columnDtl_iv_no) doDtl_iv_no_LC(info);
		else if (lc == columnDtl_wrk_no) doDtl_wrk_no_LC(info);
		else if (lc == columnDtl_wrk_nm) doDtl_wrk_nm_LC(info);
		else if (lc == columnDtl_acst_cd) doDtl_acst_cd_LC(info);
		else if (lc == columnDtl_acst_nm) doDtl_acst_nm_LC(info);
		else if (lc == columnDtl_ar_dpt_cd) doDtl_ar_dpt_cd_LC(info);
		else if (lc == columnDtl_ar_dpt_nm) doDtl_ar_dpt_nm_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnDtl_ar_typ) doDtl_ar_typ_LC(info);
		else if (lc == columnDtl_ar_typ_nm) doDtl_ar_typ_nm_LC(info);
		else if (lc == columnDtl_bill_ym) doDtl_bill_ym_LC(info);
		else if (lc == columnDtl_bill_cl_day) doDtl_bill_cl_day_LC(info);
		else if (lc == columnDtl_bill_no) doDtl_bill_no_LC(info);
		else if (lc == columnDtl_bcst_cd) doDtl_bcst_cd_LC(info);
		else if (lc == columnDtl_bcst_nm) doDtl_bcst_nm_LC(info);
		else if (lc == columnDtl_bill_dpt_cd) doDtl_bill_dpt_cd_LC(info);
		else if (lc == columnDtl_bill_dpt_nm) doDtl_bill_dpt_nm_LC(info);
		else if (lc == columnDtl_bill_d_rmrks) doDtl_bill_d_rmrks_LC(info);
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
	 * [Hdr]パネルの[ar_trd_grp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_trd_grp_typ_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_basis_dt_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[def_bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_bank_ac_cd_LC(MCEventInfo info){
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
	 * [Rcv]パネルの[ar_sttl_typ2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_ar_sttl_typ2_LC(MCEventInfo info){
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
	 * [Rcv]パネルの[debt_cred_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_cred_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debt_cred_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_cred_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debt_cred_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_cred_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[debt_cred_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_debt_cred_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcv_dat_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcv_dat_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[rcv_dat_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_rcv_dat_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[adv_trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_adv_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[adv_trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_adv_trd_nm_LC(MCEventInfo info){
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
	 * [Rcv]パネルの[setoff_rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_rcv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sttl_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sttl_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sttl_typ1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sttl_typ1_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sttl_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sttl_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sls_purc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sls_purc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_tax_cd_sub]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_tax_cd_sub_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_debt_cred_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_debt_cred_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_debt_cred_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_debt_cred_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_debt_cred_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_debt_cred_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_debt_cred_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_debt_cred_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_rcv_dat_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_rcv_dat_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_rcv_dat_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_rcv_dat_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rcv]パネルの[setoff_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcv_setoff_sub_char3_LC(MCEventInfo info){
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
	 * [DtlCnd]パネルの[rcv_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlCnd_rcv_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_typ1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_typ1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wrk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wrk_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_ym_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_cl_day]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_cl_day_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_d_rmrks_LC(MCEventInfo info){
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
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArSttlSetoffDrWtax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_tax_cd]の作成メソッド
	 */
	public MCList getRcv_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_debt_cred_id_typ]の作成メソッド
	 */
	public MCList getRcv_debt_cred_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDebtCredIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_debt_cred_id_cd]の作成メソッド
	 */
	public MCList getRcv_debt_cred_id_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_bd_dpt_cd]の作成メソッド
	 */
	public MCList getRcv_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_note_typ]の作成メソッド
	 */
	public MCList getRcv_note_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNoteTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_draw_bank_cd]の作成メソッド
	 */
	public MCList getRcv_draw_bank_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBank(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_draw_branch_cd]の作成メソッド
	 */
	public MCList getRcv_draw_branch_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBankBranch(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_note_rsn_cd]の作成メソッド
	 */
	public MCList getRcv_note_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNoteRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_setoff_bcst_cd]の作成メソッド
	 */
	public MCList getRcv_setoff_bcst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_setoff_trd_cur_cd]の作成メソッド
	 */
	public MCList getRcv_setoff_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_setoff_sttl_cd1]の作成メソッド
	 */
	public MCList getRcv_setoff_sttl_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArSttlSetoffDrWtax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_setoff_tax_cd]の作成メソッド
	 */
	public MCList getRcv_setoff_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_setoff_debt_cred_id_typ]の作成メソッド
	 */
	public MCList getRcv_setoff_debt_cred_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDebtCredIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_setoff_debt_cred_id_cd]の作成メソッド
	 */
	public MCList getRcv_setoff_debt_cred_id_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rcv_setoff_bd_dpt_cd]の作成メソッド
	 */
	public MCList getRcv_setoff_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ar_typ]の作成メソッド
	 */
	public MCList getDtl_ar_typ(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBGL0210.Srch01")) {
			return new MS_MSBGL0210_Srch01Bridge();
		}
		if (id.equals("MS.MSBGL0210.Srch02")) {
			return new MS_MSBGL0210_Srch02Bridge();
		}
		if (id.equals("MS.MSBGL0210.Srch03")) {
			return new MS_MSBGL0210_Srch03Bridge();
		}
		if (id.equals("MS.MSBGL0210.Srch04")) {
			return new MS_MSBGL0210_Srch04Bridge();
		}
		if (id.equals("MS.MSBGL0210.Ins01")) {
			return new MS_MSBGL0210_Ins01Bridge();
		}
		if (id.equals("MS.MSBGL0210.Upd01")) {
			return new MS_MSBGL0210_Upd01Bridge();
		}
		if (id.equals("MS.MSBGL0210.Del01")) {
			return new MS_MSBGL0210_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBGL0210_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0210_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0210_Srch01;

		/** コンストラクタ */
		protected MS_MSBGL0210_Srch01Bridge() {
			p_MS_MSBGL0210_Srch01 = new MCParam(PDef.MS_MSBGL0210_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0210_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0210.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0210.HdrR.create());
			param.addDownBlock(mcframe.clientMSBG.MSBGP0210.RcvR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0210.DtlR.class));

			p_MS_MSBGL0210_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0210_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0210_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0210_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0210_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0210.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0210.CndR)up(0);
		}

		protected mcframe.clientMSBG.MSBGP0210.HdrR down0() {
			return (mcframe.clientMSBG.MSBGP0210.HdrR)down(0);
		}
		protected mcframe.clientMSBG.MSBGP0210.RcvR down1() {
			return (mcframe.clientMSBG.MSBGP0210.RcvR)down(1);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0210.DtlR> down2() {
			return (MCList<mcframe.clientMSBG.MSBGP0210.DtlR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0210_Srch01.addDownBlock(mcframe.clientMSBG.MSBGP0210.HdrR.create());
			p_MS_MSBGL0210_Srch01.addDownBlock(mcframe.clientMSBG.MSBGP0210.RcvR.create());
			p_MS_MSBGL0210_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0210.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0210_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBG.MSBGP0210.HdrR)p_MS_MSBGL0210_Srch01.getContainerParam().getDownBlock(0));
			setRcvR((mcframe.clientMSBG.MSBGP0210.RcvR)p_MS_MSBGL0210_Srch01.getContainerParam().getDownBlock(1));
			setDtlL((MCList<mcframe.clientMSBG.MSBGP0210.DtlR>)p_MS_MSBGL0210_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getRcvR().clear();
			getDtlL().clear();
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
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBGL0210_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0210_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0210_Srch02;

		/** コンストラクタ */
		protected MS_MSBGL0210_Srch02Bridge() {
			p_MS_MSBGL0210_Srch02 = new MCParam(PDef.MS_MSBGL0210_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0210_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0210.RcvR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0210.RcvR.create());

			p_MS_MSBGL0210_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0210_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0210_Srch02.addUpBlock(getRcvR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0210_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0210_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0210.RcvR up0() {
			return (mcframe.clientMSBG.MSBGP0210.RcvR)up(0);
		}

		protected mcframe.clientMSBG.MSBGP0210.RcvR down0() {
			return (mcframe.clientMSBG.MSBGP0210.RcvR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0210_Srch02.addDownBlock(mcframe.clientMSBG.MSBGP0210.RcvR.create());
		}
		protected MCParam param() {
			return p_MS_MSBGL0210_Srch02;
		}

		protected void show() {
			setRcvR((mcframe.clientMSBG.MSBGP0210.RcvR)p_MS_MSBGL0210_Srch02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBGL0210_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0210_Srch03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0210_Srch03;

		/** コンストラクタ */
		protected MS_MSBGL0210_Srch03Bridge() {
			p_MS_MSBGL0210_Srch03 = new MCParam(PDef.MS_MSBGL0210_Srch03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0210_Srch03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0210.DtlCndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0210.DtlR.class));

			p_MS_MSBGL0210_Srch03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0210_Srch03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0210_Srch03.addUpBlock(getDtlCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0210_Srch03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0210_Srch03.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0210.DtlCndR up0() {
			return (mcframe.clientMSBG.MSBGP0210.DtlCndR)up(0);
		}

		protected MCList<mcframe.clientMSBG.MSBGP0210.DtlR> down0() {
			return (MCList<mcframe.clientMSBG.MSBGP0210.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0210_Srch03.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0210.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0210_Srch03;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBG.MSBGP0210.DtlR>)p_MS_MSBGL0210_Srch03.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBGL0210_Srch04]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0210_Srch04Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0210_Srch04;

		/** コンストラクタ */
		protected MS_MSBGL0210_Srch04Bridge() {
			p_MS_MSBGL0210_Srch04 = new MCParam(PDef.MS_MSBGL0210_Srch04_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0210_Srch04_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0210.RcvR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0210.RcvR.create());

			p_MS_MSBGL0210_Srch04 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0210_Srch04.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0210_Srch04.addUpBlock(getRcvR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0210_Srch04.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0210_Srch04.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0210.RcvR up0() {
			return (mcframe.clientMSBG.MSBGP0210.RcvR)up(0);
		}

		protected mcframe.clientMSBG.MSBGP0210.RcvR down0() {
			return (mcframe.clientMSBG.MSBGP0210.RcvR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0210_Srch04.addDownBlock(mcframe.clientMSBG.MSBGP0210.RcvR.create());
		}
		protected MCParam param() {
			return p_MS_MSBGL0210_Srch04;
		}

		protected void show() {
			setRcvR((mcframe.clientMSBG.MSBGP0210.RcvR)p_MS_MSBGL0210_Srch04.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBGL0210_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0210_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0210_Ins01;

		/** コンストラクタ */
		protected MS_MSBGL0210_Ins01Bridge() {
			p_MS_MSBGL0210_Ins01 = new MCParam(PDef.MS_MSBGL0210_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0210_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0210.HdrR.create());
			param.addUpBlock(mcframe.clientMSBG.MSBGP0210.RcvR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBG.MSBGP0210.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBG.MSBGP0210.BillDR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0210.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0210.DtlR.class));

			p_MS_MSBGL0210_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0210_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0210_Ins01.addUpBlock(getHdrR());
			p_MS_MSBGL0210_Ins01.addUpBlock(getRcvR());
			p_MS_MSBGL0210_Ins01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBGL0210_Ins01.addUpBlock(getBillDL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0210_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0210_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0210.HdrR up0() {
			return (mcframe.clientMSBG.MSBGP0210.HdrR)up(0);
		}
		protected mcframe.clientMSBG.MSBGP0210.RcvR up1() {
			return (mcframe.clientMSBG.MSBGP0210.RcvR)up(1);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0210.DtlR> up2() {
			return (MCList<mcframe.clientMSBG.MSBGP0210.DtlR>)up(2);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0210.BillDR> up3() {
			return (MCList<mcframe.clientMSBG.MSBGP0210.BillDR>)up(3);
		}

		protected mcframe.clientMSBG.MSBGP0210.HdrR down0() {
			return (mcframe.clientMSBG.MSBGP0210.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0210.DtlR> down1() {
			return (MCList<mcframe.clientMSBG.MSBGP0210.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0210_Ins01.addDownBlock(mcframe.clientMSBG.MSBGP0210.HdrR.create());
			p_MS_MSBGL0210_Ins01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0210.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0210_Ins01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBG.MSBGP0210.HdrR)p_MS_MSBGL0210_Ins01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBG.MSBGP0210.DtlR>)p_MS_MSBGL0210_Ins01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getRcvR());
			result.add(getDtlL());
			result.add(getBillDL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBGL0210_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0210_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0210_Upd01;

		/** コンストラクタ */
		protected MS_MSBGL0210_Upd01Bridge() {
			p_MS_MSBGL0210_Upd01 = new MCParam(PDef.MS_MSBGL0210_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0210_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0210.HdrR.create());
			param.addUpBlock(mcframe.clientMSBG.MSBGP0210.RcvR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBG.MSBGP0210.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBG.MSBGP0210.BillDR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0210.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0210.DtlR.class));

			p_MS_MSBGL0210_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0210_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0210_Upd01.addUpBlock(getHdrR());
			p_MS_MSBGL0210_Upd01.addUpBlock(getRcvR());
			p_MS_MSBGL0210_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBGL0210_Upd01.addUpBlock(getBillDL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0210_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0210_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0210.HdrR up0() {
			return (mcframe.clientMSBG.MSBGP0210.HdrR)up(0);
		}
		protected mcframe.clientMSBG.MSBGP0210.RcvR up1() {
			return (mcframe.clientMSBG.MSBGP0210.RcvR)up(1);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0210.DtlR> up2() {
			return (MCList<mcframe.clientMSBG.MSBGP0210.DtlR>)up(2);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0210.BillDR> up3() {
			return (MCList<mcframe.clientMSBG.MSBGP0210.BillDR>)up(3);
		}

		protected mcframe.clientMSBG.MSBGP0210.HdrR down0() {
			return (mcframe.clientMSBG.MSBGP0210.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0210.DtlR> down1() {
			return (MCList<mcframe.clientMSBG.MSBGP0210.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0210_Upd01.addDownBlock(mcframe.clientMSBG.MSBGP0210.HdrR.create());
			p_MS_MSBGL0210_Upd01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0210.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0210_Upd01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBG.MSBGP0210.HdrR)p_MS_MSBGL0210_Upd01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBG.MSBGP0210.DtlR>)p_MS_MSBGL0210_Upd01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getRcvR());
			result.add(getDtlL());
			result.add(getBillDL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBGL0210_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0210_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0210_Del01;

		/** コンストラクタ */
		protected MS_MSBGL0210_Del01Bridge() {
			p_MS_MSBGL0210_Del01 = new MCParam(PDef.MS_MSBGL0210_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0210_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0210.HdrR.create());
			param.addUpBlock(mcframe.clientMSBG.MSBGP0210.RcvR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBG.MSBGP0210.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBG.MSBGP0210.BillDR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0210.HdrR.create());

			p_MS_MSBGL0210_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0210_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0210_Del01.addUpBlock(getHdrR());
			p_MS_MSBGL0210_Del01.addUpBlock(getRcvR());
			p_MS_MSBGL0210_Del01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBGL0210_Del01.addUpBlock(getBillDL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0210_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0210_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0210.HdrR up0() {
			return (mcframe.clientMSBG.MSBGP0210.HdrR)up(0);
		}
		protected mcframe.clientMSBG.MSBGP0210.RcvR up1() {
			return (mcframe.clientMSBG.MSBGP0210.RcvR)up(1);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0210.DtlR> up2() {
			return (MCList<mcframe.clientMSBG.MSBGP0210.DtlR>)up(2);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0210.BillDR> up3() {
			return (MCList<mcframe.clientMSBG.MSBGP0210.BillDR>)up(3);
		}

		protected mcframe.clientMSBG.MSBGP0210.HdrR down0() {
			return (mcframe.clientMSBG.MSBGP0210.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0210_Del01.addDownBlock(mcframe.clientMSBG.MSBGP0210.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBGL0210_Del01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBG.MSBGP0210.HdrR)p_MS_MSBGL0210_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdrR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getRcvR());
			result.add(getDtlL());
			result.add(getBillDL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
	}
}