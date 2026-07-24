package mcframe.clientMSBH.MSBHP0090;

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
import mcframe.clientMSBH.MSBHP0090.MSBHP_PayActReg_MC.MS_MSBHL0090_Srch01Caller;
import mcframe.clientMSBH.MSBHP0090.MSBHP_PayActReg_MC.MS_MSBHL0090_Srch02Caller;
import mcframe.clientMSBH.MSBHP0090.MSBHP_PayActReg_MC.MS_MSBHL0090_Ins01Caller;
import mcframe.clientMSBH.MSBHP0090.MSBHP_PayActReg_MC.MS_MSBHL0090_Upd01Caller;
import mcframe.clientMSBH.MSBHP0090.MSBHP_PayActReg_MC.MS_MSBHL0090_Del01Caller;

/**
 * 画面"MSBHP_PayActReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHP_PayActReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBH";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBHP0090";

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
	public MCLabel Cnd_pay_act_no_Label = null;
	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_pay_act_no = null;
	/**
	 * Payment result revision number 支払実績改訂番号.<p>
	 *
	 */
	public MCNumberField Cnd_pay_act_rev = null;
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
	public MCLabel Hdr_pay_act_no_Label = null;
	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_pay_act_no = null;
	/**
	 * Payment result revision number 支払実績改訂番号.<p>
	 *
	 */
	public MCNumberField Hdr_pay_act_rev = null;
	/**
	 * Latest 最新.<p>
	 *
	 */
	public MCCheckBox Hdr_latest_flg = null;
	public MCLabel Hdr_ac_ym_Label = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDateField Hdr_ac_ym = null;
	public MCLabel Hdr_pay_act_dt_Label = null;
	/**
	 * Actual payment date 支払実績日.<p>
	 *
	 */
	public MCDateField Hdr_pay_act_dt = null;
	public MCLabel Hdr_pay_basis_dt_Label = null;
	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public MCDateField Hdr_pay_basis_dt = null;
	public mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H Hdr_ac_dt_p_PPanel;
	public MCDateField Hdr_ac_dt;	// [Hdr]の[ac_dt_p.ac_dt]を[Hdr_ac_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H Hdr_can_ac_dt_p_PPanel;
	public MCDateField Hdr_can_ac_dt_for_input;	// [Hdr]の[can_ac_dt_p.can_ac_dt_for_input]を[Hdr_can_ac_dt_for_input]としてエイリアス定義。
	public MCDateField Hdr_can_ac_dt;	// [Hdr]の[can_ac_dt_p.can_ac_dt_for_call]を[Hdr_can_ac_dt]としてエイリアス定義。
	public MCDateField Hdr_ac_dt_after_srch;	// [Hdr]の[can_ac_dt_p.ac_dt_after_srch]を[Hdr_ac_dt_after_srch]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H Hdr_usr_dpt_p_PPanel;
	public MCTextField Hdr_pay_usr_cd;	// [Hdr]の[usr_dpt_p.usr_cd]を[Hdr_pay_usr_cd]としてエイリアス定義。
	public MCTextField Hdr_pay_usr_nm;	// [Hdr]の[usr_dpt_p.usr_nm]を[Hdr_pay_usr_nm]としてエイリアス定義。
	public MCTextComboBox Hdr_pay_dpt_cd;	// [Hdr]の[usr_dpt_p.dpt_cd]を[Hdr_pay_dpt_cd]としてエイリアス定義。
	public MCTextField Hdr_pay_dpt_nm;	// [Hdr]の[usr_dpt_p.dpt_nm]を[Hdr_pay_dpt_nm]としてエイリアス定義。
	public MCLabel Hdr_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
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
	public MCLabel Hdr_psppl_cd_Label = null;
	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_psppl_cd = null;
	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public MCTextField Hdr_psppl_nm = null;
	public MCLabel Hdr_psppl_rmrks_Label = null;
	/**
	 * Payee remarks 支払先備考.<p>
	 *
	 */
	public MCTextField Hdr_psppl_rmrks = null;
	public MCLabel Hdr_trd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField Hdr_trd_cur_nm = null;
	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_trd_cur_amt_dec_place = null;
	public mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H Hdr_xrate_p_PPanel;
	public MCNumberField Hdr_xrate;	// [Hdr]の[xrate_p.xrate]を[Hdr_xrate]としてエイリアス定義。
	public MCLabel Hdr_base_cur_cd_Label = null;
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_base_cur_cd = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCTextField Hdr_base_cur_nm = null;
	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_base_cur_amt_dec_place = null;
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_xrate_cd = null;
	public MCLabel Hdr_ap_sttl_cd_Label = null;
	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_ap_sttl_cd = null;
	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public MCTextField Hdr_ap_sttl_nm = null;
	public MCLabel Hdr_ap_sttl_typ_Label = null;
	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public MCTextField Hdr_ap_sttl_typ = null;
	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public MCTextField Hdr_ap_sttl_typ_nm = null;
	public MCLabel Hdr_bank_ac_cd_Label = null;
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_bank_ac_cd = null;
	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public MCTextField Hdr_bank_ac_nm = null;
	public MCLabel Hdr_pay_bank_ac_cd_Label = null;
	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_pay_bank_ac_cd = null;
	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public MCTextField Hdr_pay_bank_ac_nm = null;
	public MCLabel Hdr_ap_setoff_typ_Label = null;
	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_ap_setoff_typ = null;
	/**
	 * AP offset destination name 債務相殺先区分名.<p>
	 *
	 */
	public MCTextField Hdr_ap_setoff_typ_nm = null;
	public MCLabel Hdr_setoff_cd_Label = null;
	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_setoff_cd = null;
	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public MCTextField Hdr_setoff_nm = null;
	public MCLabel Hdr_so_dpt_cd_Label = null;
	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_so_dpt_cd = null;
	/**
	 * Offset dept. name 相殺部門名.<p>
	 *
	 */
	public MCTextField Hdr_so_dpt_nm = null;
	public MCLabel Hdr_trd_rmrks_Label = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCTextField Hdr_trd_rmrks = null;
	public MCLabel Hdr_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Hdr_intr_rmrks = null;
	public MCLabel Hdr_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Hdr_sub_char1 = null;
	public MCLabel Hdr_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Hdr_sub_char2 = null;
	public MCLabel Hdr_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Hdr_sub_char3 = null;
	public MCLabel Hdr_note_no_Label = null;
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public MCTextField Hdr_note_no = null;
	public MCLabel Hdr_note_typ_Label = null;
	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_note_typ = null;
	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public MCTextField Hdr_note_typ_nm = null;
	public MCLabel Hdr_draw_dt_Label = null;
	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public MCDateField Hdr_draw_dt = null;
	public MCLabel Hdr_note_days_Label = null;
	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public MCNumberField Hdr_note_days = null;
	public MCLabel Hdr_due_dt_Label = null;
	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public MCDateField Hdr_due_dt = null;
	public MCLabel Hdr_drawer_nm_Label = null;
	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public MCTextField Hdr_drawer_nm = null;
	public MCLabel Hdr_endrsr_Label = null;
	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public MCTextField Hdr_endrsr = null;
	public MCLabel Hdr_accptr_Label = null;
	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public MCTextField Hdr_accptr = null;
	public MCLabel Hdr_draw_bank_cd_Label = null;
	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_draw_bank_cd = null;
	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public MCTextField Hdr_draw_bank_nm = null;
	public MCLabel Hdr_draw_branch_cd_Label = null;
	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_draw_branch_cd = null;
	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public MCTextField Hdr_draw_branch_nm = null;
	public MCLabel Hdr_note_rsn_cd_Label = null;
	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_note_rsn_cd = null;
	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public MCTextField Hdr_note_rsn_nm = null;
	public MCLabel Hdr_note_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Hdr_note_sub_char1 = null;
	public MCLabel Hdr_note_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Hdr_note_sub_char2 = null;
	public MCLabel Hdr_note_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Hdr_note_sub_char3 = null;
	/**
	 * Filter by payment dept. 支払部門で絞り込む.<p>
	 *
	 */
	public MCCheckBox Hdr_pay_dpt_narrow_down_flg = null;
	/**
	 * Filter by the AP settlement method 債務決済方法で絞り込む.<p>
	 *
	 */
	public MCCheckBox Hdr_ap_sttl_narrow_down_flg = null;
	public MCLabel Hdr_pay_schd_dt_Label = null;
	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDateField Hdr_pay_schd_dt = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Hdr_srch = null;
	// [Sys]ブロック関連のField定義
	public MCPanel SysPanel = null;
	// [Sys]ブロックの項目のField定義
	// [PayTab]ブロック関連のField定義
	public MCPanel PayTabPanel = null;
	public MCTabbedPane PayTabTab = null;
	// [PayTab]ブロックの項目のField定義
	// [Pay]ブロック関連のField定義
	public MCPanel PayPanel = null;
	// [Pay]ブロックの項目のField定義
	// [Note]ブロック関連のField定義
	public MCPanel NotePanel = null;
	// [Note]ブロックの項目のField定義
	// [DtlCnd]ブロック関連のField定義
	public MCPanel DtlCndPanel = null;
	public MCTitledBorder DtlCndTitledBorder = null;
	// [DtlCnd]ブロックの項目のField定義
	// [Total]ブロック関連のField定義
	public MCPanel TotalPanel = null;
	public MCTitledBorder TotalTitledBorder = null;
	// [Total]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Total_pay_amt_p_PPanel;
	public MCNumberField Total_pay_amt;	// [Total]の[pay_amt_p.amt]を[Total_pay_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Total_not_appl_bal_p_PPanel;
	public MCNumberField Total_not_appl_bal;	// [Total]の[not_appl_bal_p.amt]を[Total_not_appl_bal]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Total_ttl_s_amt_p_PPanel;
	public MCNumberField Total_ttl_s_amt;	// [Total]の[ttl_s_amt_p.amt]を[Total_ttl_s_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Total_ttl_s_com_paid_amt_p_PPanel;
	public MCNumberField Total_ttl_s_com_paid_amt;	// [Total]の[ttl_s_com_paid_amt_p.amt]を[Total_ttl_s_com_paid_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Total_ttl_s_com_paid_tax_amt_p_PPanel;
	public MCNumberField Total_ttl_s_com_paid_tax_amt;	// [Total]の[ttl_s_com_paid_tax_amt_p.amt]を[Total_ttl_s_com_paid_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Total_ttl_a_amt_p_PPanel;
	public MCNumberField Total_ttl_a_amt;	// [Total]の[ttl_a_amt_p.amt]を[Total_ttl_a_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Total_ttl_a_com_paid_amt_p_PPanel;
	public MCNumberField Total_ttl_a_com_paid_amt;	// [Total]の[ttl_a_com_paid_amt_p.amt]を[Total_ttl_a_com_paid_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Total_ttl_a_com_paid_tax_amt_p_PPanel;
	public MCNumberField Total_ttl_a_com_paid_tax_amt;	// [Total]の[ttl_a_com_paid_tax_amt_p.amt]を[Total_ttl_a_com_paid_tax_amt]としてエイリアス定義。
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBH.MSBHP0090.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Reconcile 消込.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_sttl_cd = null;
	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_sttl_nm = null;
	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_sttl_typ = null;
	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_sttl_typ_nm = null;
	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_schd_dt = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_pay_schd_amt_p_PPanel;
	public MCColumnConfig columnDtl_pay_schd_amt;// [Dtl]の[pay_schd_amt_p.amt]を[columnDtl_pay_schd_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_pay_schd_com_paid_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_pay_schd_com_paid_tax_amt;// [Dtl]の[pay_schd_com_paid_tax_amt_p.amt]を[columnDtl_pay_schd_com_paid_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_appl_ttl_amt_p_PPanel;
	public MCColumnConfig columnDtl_appl_ttl_amt;// [Dtl]の[appl_ttl_amt_p.amt]を[columnDtl_appl_ttl_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_trd_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_trd_cur_amt;// [Dtl]の[trd_cur_amt_p.amt]を[columnDtl_trd_cur_amt]としてエイリアス定義。
	/**
	 * Transaction currency tax cd. 取引通貨税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_com_paid_tax_cd = null;
	/**
	 * Transaction currency tax name 取引通貨税名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_com_paid_tax_nm = null;
	/**
	 * Transaction currency rate 取引通貨税率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_com_paid_tax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_trd_cur_com_paid_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_trd_cur_com_paid_tax_amt;// [Dtl]の[trd_cur_com_paid_tax_amt_p.amt]を[columnDtl_trd_cur_com_paid_tax_amt]としてエイリアス定義。
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bank_ac_cd = null;
	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bank_ac_nm = null;
	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_bank_ac_cd = null;
	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_bank_ac_nm = null;
	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_setoff_typ = null;
	/**
	 * AP offset destination name 債務相殺先区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_setoff_typ_nm = null;
	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_setoff_cd = null;
	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_setoff_nm = null;
	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_so_dpt_cd = null;
	/**
	 * Offset dept. name 相殺部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_so_dpt_nm = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_amt;// [Dtl]の[base_cur_amt_p.amt]を[columnDtl_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_com_paid_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_com_paid_tax_amt;// [Dtl]の[base_cur_com_paid_tax_amt_p.amt]を[columnDtl_base_cur_com_paid_tax_amt]としてエイリアス定義。
	/**
	 * Payment result details No. 支払実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_act_d_no = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_disp_seq = null;
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_chk_no = null;
	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_chk_mng_no = null;
	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_schd_no = null;
	/**
	 * AP reconciliation schedule No. 買掛消込予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_appl_schd_no = null;
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bsppl_cd = null;
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bsppl_nm = null;
	/**
	 * Scheduled payee dept. cd. 支払予定管理先部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bsppl_dpt_cd = null;
	/**
	 * Scheduled payee dept. name 支払予定管理先部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bsppl_dpt_nm = null;
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asppl_nm = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_dpt_nm = null;
	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_typ = null;
	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_typ_nm = null;
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_act_no = null;
	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcpt_iv_mng_no = null;
	/**
	 * Purchase I/V No. 受領Ｉ／ＶＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcpt_iv_no = null;
	public mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D Dtl_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl_wrk_no;// [Dtl]の[wrk_no_p.wrk_no]を[columnDtl_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_nm;// [Dtl]の[wrk_no_p.wrk_nm]を[columnDtl_wrk_nm]としてエイリアス定義。
	/**
	 * AP settlement method cd. at schedule 予定時債務決済方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_schd_ap_sttl_cd = null;
	/**
	 * AP settlement method name at schedule 予定時債務決済方法名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_schd_ap_sttl_nm = null;
	/**
	 * AP settlement type at schedule 予定時債務決済区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_schd_ap_sttl_typ = null;
	/**
	 * AP settlement type name at schedule 予定時債務決済区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_schd_ap_sttl_typ_nm = null;
	/**
	 * Transferred 振替済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sw_flg = null;
	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_ntc_d_print_rmrks = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_d_rmrks = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_intr_d_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char3 = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_old_pay_schd_amt_p_PPanel;
	public MCColumnConfig columnDtl_old_pay_schd_amt;// [Dtl]の[old_pay_schd_amt_p.amt]を[columnDtl_old_pay_schd_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_old_appl_ttl_amt_p_PPanel;
	public MCColumnConfig columnDtl_old_appl_ttl_amt;// [Dtl]の[old_appl_ttl_amt_p.amt]を[columnDtl_old_appl_ttl_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_old_trd_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_old_trd_cur_amt;// [Dtl]の[old_trd_cur_amt_p.amt]を[columnDtl_old_trd_cur_amt]としてエイリアス定義。
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
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btn_rcopy = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btn_rdel = null;
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
	/** [INS_SRCH]モードを表す定数 */
	public static final String INS_SRCH = "INS_SRCH";
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
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

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INS_SRCH, INS, SRCH, UPD, FIX_U, FIX_D, FIX_I, DEL, REF};
	
	/** [MS_MSBHL0090_Srch01]のCallerの作成 */
	protected MSBHP_PayActReg_MC.MS_MSBHL0090_Srch01Caller createMS_MSBHL0090_Srch01() {
		MSBHP_PayActReg_MC.MS_MSBHL0090_Srch01Caller<MSBHP_PayActReg, MS_MSBHL0090_Srch01Bridge>
		caller = ((MSBHP_PayActReg_MC)this).new MS_MSBHL0090_Srch01Caller<MSBHP_PayActReg, MS_MSBHL0090_Srch01Bridge>(
					(MSBHP_PayActReg)this, new MS_MSBHL0090_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBHL0090_Srch01]の呼び出し */
	protected void callMS_MSBHL0090_Srch01() {
		MCCaller caller = createMS_MSBHL0090_Srch01();
		caller.exec();
	}
	/** [MS_MSBHL0090_Srch02]のCallerの作成 */
	protected MSBHP_PayActReg_MC.MS_MSBHL0090_Srch02Caller createMS_MSBHL0090_Srch02() {
		MSBHP_PayActReg_MC.MS_MSBHL0090_Srch02Caller<MSBHP_PayActReg, MS_MSBHL0090_Srch02Bridge>
		caller = ((MSBHP_PayActReg_MC)this).new MS_MSBHL0090_Srch02Caller<MSBHP_PayActReg, MS_MSBHL0090_Srch02Bridge>(
					(MSBHP_PayActReg)this, new MS_MSBHL0090_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBHL0090_Srch02]の呼び出し */
	protected void callMS_MSBHL0090_Srch02() {
		MCCaller caller = createMS_MSBHL0090_Srch02();
		caller.exec();
	}
	/** [MS_MSBHL0090_Ins01]のCallerの作成 */
	protected MSBHP_PayActReg_MC.MS_MSBHL0090_Ins01Caller createMS_MSBHL0090_Ins01() {
		MSBHP_PayActReg_MC.MS_MSBHL0090_Ins01Caller<MSBHP_PayActReg, MS_MSBHL0090_Ins01Bridge>
		caller = ((MSBHP_PayActReg_MC)this).new MS_MSBHL0090_Ins01Caller<MSBHP_PayActReg, MS_MSBHL0090_Ins01Bridge>(
					(MSBHP_PayActReg)this, new MS_MSBHL0090_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBHL0090_Ins01]の呼び出し */
	protected void callMS_MSBHL0090_Ins01() {
		MCCaller caller = createMS_MSBHL0090_Ins01();
		caller.exec();
	}
	/** [MS_MSBHL0090_Upd01]のCallerの作成 */
	protected MSBHP_PayActReg_MC.MS_MSBHL0090_Upd01Caller createMS_MSBHL0090_Upd01() {
		MSBHP_PayActReg_MC.MS_MSBHL0090_Upd01Caller<MSBHP_PayActReg, MS_MSBHL0090_Upd01Bridge>
		caller = ((MSBHP_PayActReg_MC)this).new MS_MSBHL0090_Upd01Caller<MSBHP_PayActReg, MS_MSBHL0090_Upd01Bridge>(
					(MSBHP_PayActReg)this, new MS_MSBHL0090_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBHL0090_Upd01]の呼び出し */
	protected void callMS_MSBHL0090_Upd01() {
		MCCaller caller = createMS_MSBHL0090_Upd01();
		caller.exec();
	}
	/** [MS_MSBHL0090_Del01]のCallerの作成 */
	protected MSBHP_PayActReg_MC.MS_MSBHL0090_Del01Caller createMS_MSBHL0090_Del01() {
		MSBHP_PayActReg_MC.MS_MSBHL0090_Del01Caller<MSBHP_PayActReg, MS_MSBHL0090_Del01Bridge>
		caller = ((MSBHP_PayActReg_MC)this).new MS_MSBHL0090_Del01Caller<MSBHP_PayActReg, MS_MSBHL0090_Del01Bridge>(
					(MSBHP_PayActReg)this, new MS_MSBHL0090_Del01Bridge());
		return caller;
	}
	/** [MS_MSBHL0090_Del01]の呼び出し */
	protected void callMS_MSBHL0090_Del01() {
		MCCaller caller = createMS_MSBHL0090_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0090.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0090.HdrR aHdrR;
	/** [Total]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0090.TotalR aTotalR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBH.MSBHP0090.DtlR> aDtlL;
	/** [PaySchdTgt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBH.MSBHP0090.PaySchdTgtR> aPaySchdTgtL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBH.MSBHP0090.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0090.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0090.CndR createCndR() {
		return mcframe.clientMSBH.MSBHP0090.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBH.MSBHP0090.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBH.MSBHP0090.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBH.MSBHP0090.HdrR createHdrR() {
		return mcframe.clientMSBH.MSBHP0090.HdrR.create();
	}

	/**
	 * 項目コピーによってaTotalRを設定します。
	 *
	 * aTotalRのインスタンスは変更されません。
	 *
	 * @param row TotalR
	 */
	public void setTotalR(mcframe.clientMSBH.MSBHP0090.TotalR row) {
		if (row != null) {
			MCRow.copyall(getTotalR(), row);
		}
	}

	/**
	 * [Total]ブロックのコンテナaTotalRを返します。
	 *
	 * @return TotalR
	 */
	public mcframe.clientMSBH.MSBHP0090.TotalR getTotalR() {
		return aTotalR;
	}

	/**
	 * aTotalRを作成します。
	 *
	 * @return TotalR
	 */
	public mcframe.clientMSBH.MSBHP0090.TotalR createTotalR() {
		return mcframe.clientMSBH.MSBHP0090.TotalR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBH.MSBHP0090.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0090.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBH.MSBHP0090.DtlR createDtlR() {
		return mcframe.clientMSBH.MSBHP0090.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0090.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBH.MSBHP0090.DtlR.class);
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
	 * コピーによってaPaySchdTgtLを設定します。
	 *
	 * aPaySchdTgtLのインスタンスは変更されません。
	 *
	 * @param dataset PaySchdTgtL
	 */
	public void setPaySchdTgtL(MCList<mcframe.clientMSBH.MSBHP0090.PaySchdTgtR> aList) {
		if (getPaySchdTgtL() != aList) {
			getPaySchdTgtL().setAll(aList);
		}
	}

	/**
	 * [PaySchdTgt]ブロックのコンテナaPaySchdTgtLを返します。
	 *
	 * @return PaySchdTgtL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0090.PaySchdTgtR> getPaySchdTgtL() {
		return aPaySchdTgtL;
	}

	/**
	 * aPaySchdTgtRを作成します。
	 *
	 * @return PaySchdTgtR
	 */
	public mcframe.clientMSBH.MSBHP0090.PaySchdTgtR createPaySchdTgtR() {
		return mcframe.clientMSBH.MSBHP0090.PaySchdTgtR.create();
	}

	/**
	 * aPaySchdTgtLを作成します。
	 *
	 * @return PaySchdTgtL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0090.PaySchdTgtR> createPaySchdTgtL() {
		return MCList.create(mcframe.clientMSBH.MSBHP0090.PaySchdTgtR.class);
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
		if(!MCCollectionUtil.contains(ret, getTotalR())) ret.add(getTotalR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getPaySchdTgtL())) ret.add(getPaySchdTgtL());
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
		if(aCnt == getTotalR()) return "Total";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getPaySchdTgtL()) return "PaySchdTgt";
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
		if(bId.equals("Total")) return getTotalR();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("PaySchdTgt")) return getPaySchdTgtL();
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
		ret.add(PayTabPanel);
		ret.add(PayPanel);
		ret.add(NotePanel);
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
	public MSBHP_PayActReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aTotalR = createTotalR();
		aDtlL = createDtlL();
		aPaySchdTgtL = createPaySchdTgtL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBHP_PayActReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aTotalR = createTotalR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aPaySchdTgtL = createPaySchdTgtL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBHP_PayActReg_MC.jbCreateScreenOpe((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbCreateCnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbCreateHdrTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbCreateHdr((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbCreateSys((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbCreatePayTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbCreatePay((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbCreateNote((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbCreateDtlCnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbCreateTotal((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbCreateDtl((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbCreateBtn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbCreateEastBtn((MSBHP_PayActReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBHP_PayActReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBHP_PayActReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBHP_PayActReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBHP_PayActReg p) {
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
		p.Hdr_pay_usr_cd = p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.Hdr_pay_usr_cd.addAliasName("Hdr.pay_usr_cd", p);
		p.Hdr_pay_usr_nm = p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.Hdr_pay_usr_nm.addAliasName("Hdr.pay_usr_nm", p);
		p.Hdr_pay_dpt_cd = p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.Hdr_pay_dpt_cd.addAliasName("Hdr.pay_dpt_cd", p);
		p.Hdr_pay_dpt_nm = p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.Hdr_pay_dpt_nm.addAliasName("Hdr.pay_dpt_nm", p);
		p.Hdr_xrate_p_PPanel = mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.create(p.getHdrR().xrate_p());
		p.Hdr_xrate_p_PPanel.setName("Hdr.xrate_p");
		p.Hdr_xrate = p.Hdr_xrate_p_PPanel.Xrate_xrate;
		p.Hdr_xrate.addAliasName("Hdr.xrate", p);
	}

	/**
	 * [Sys]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSys(MSBHP_PayActReg p) {
	}

	/**
	 * [PayTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePayTab(MSBHP_PayActReg p) {
	}

	/**
	 * [Pay]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePay(MSBHP_PayActReg p) {
	}

	/**
	 * [Note]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateNote(MSBHP_PayActReg p) {
	}

	/**
	 * [DtlCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlCnd(MSBHP_PayActReg p) {
	}

	/**
	 * [Total]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTotal(MSBHP_PayActReg p) {
		p.Total_pay_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getTotalR().pay_amt_p());
		p.Total_pay_amt_p_PPanel.setName("Total.pay_amt_p");
		p.Total_pay_amt = p.Total_pay_amt_p_PPanel.Amt_amt;
		p.Total_pay_amt.addAliasName("Total.pay_amt", p);
		p.Total_not_appl_bal_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getTotalR().not_appl_bal_p());
		p.Total_not_appl_bal_p_PPanel.setName("Total.not_appl_bal_p");
		p.Total_not_appl_bal = p.Total_not_appl_bal_p_PPanel.Amt_amt;
		p.Total_not_appl_bal.addAliasName("Total.not_appl_bal", p);
		p.Total_ttl_s_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getTotalR().ttl_s_amt_p());
		p.Total_ttl_s_amt_p_PPanel.setName("Total.ttl_s_amt_p");
		p.Total_ttl_s_amt = p.Total_ttl_s_amt_p_PPanel.Amt_amt;
		p.Total_ttl_s_amt.addAliasName("Total.ttl_s_amt", p);
		p.Total_ttl_s_com_paid_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getTotalR().ttl_s_com_paid_amt_p());
		p.Total_ttl_s_com_paid_amt_p_PPanel.setName("Total.ttl_s_com_paid_amt_p");
		p.Total_ttl_s_com_paid_amt = p.Total_ttl_s_com_paid_amt_p_PPanel.Amt_amt;
		p.Total_ttl_s_com_paid_amt.addAliasName("Total.ttl_s_com_paid_amt", p);
		p.Total_ttl_s_com_paid_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getTotalR().ttl_s_com_paid_tax_amt_p());
		p.Total_ttl_s_com_paid_tax_amt_p_PPanel.setName("Total.ttl_s_com_paid_tax_amt_p");
		p.Total_ttl_s_com_paid_tax_amt = p.Total_ttl_s_com_paid_tax_amt_p_PPanel.Amt_amt;
		p.Total_ttl_s_com_paid_tax_amt.addAliasName("Total.ttl_s_com_paid_tax_amt", p);
		p.Total_ttl_a_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getTotalR().ttl_a_amt_p());
		p.Total_ttl_a_amt_p_PPanel.setName("Total.ttl_a_amt_p");
		p.Total_ttl_a_amt = p.Total_ttl_a_amt_p_PPanel.Amt_amt;
		p.Total_ttl_a_amt.addAliasName("Total.ttl_a_amt", p);
		p.Total_ttl_a_com_paid_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getTotalR().ttl_a_com_paid_amt_p());
		p.Total_ttl_a_com_paid_amt_p_PPanel.setName("Total.ttl_a_com_paid_amt_p");
		p.Total_ttl_a_com_paid_amt = p.Total_ttl_a_com_paid_amt_p_PPanel.Amt_amt;
		p.Total_ttl_a_com_paid_amt.addAliasName("Total.ttl_a_com_paid_amt", p);
		p.Total_ttl_a_com_paid_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getTotalR().ttl_a_com_paid_tax_amt_p());
		p.Total_ttl_a_com_paid_tax_amt_p_PPanel.setName("Total.ttl_a_com_paid_tax_amt_p");
		p.Total_ttl_a_com_paid_tax_amt = p.Total_ttl_a_com_paid_tax_amt_p_PPanel.Amt_amt;
		p.Total_ttl_a_com_paid_tax_amt.addAliasName("Total.ttl_a_com_paid_tax_amt", p);
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBHP_PayActReg p) {
		p.Dtl_pay_schd_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0090.DtlR.$pay_schd_amt_p);
		p.Dtl_pay_schd_amt_p_PPanel.setName("Dtl.pay_schd_amt_p");
		p.columnDtl_pay_schd_amt = p.Dtl_pay_schd_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_pay_schd_amt.addAliasName("Dtl.pay_schd_amt", p);
		p.Dtl_pay_schd_com_paid_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0090.DtlR.$pay_schd_com_paid_tax_amt_p);
		p.Dtl_pay_schd_com_paid_tax_amt_p_PPanel.setName("Dtl.pay_schd_com_paid_tax_amt_p");
		p.columnDtl_pay_schd_com_paid_tax_amt = p.Dtl_pay_schd_com_paid_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_pay_schd_com_paid_tax_amt.addAliasName("Dtl.pay_schd_com_paid_tax_amt", p);
		p.Dtl_appl_ttl_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0090.DtlR.$appl_ttl_amt_p);
		p.Dtl_appl_ttl_amt_p_PPanel.setName("Dtl.appl_ttl_amt_p");
		p.columnDtl_appl_ttl_amt = p.Dtl_appl_ttl_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_appl_ttl_amt.addAliasName("Dtl.appl_ttl_amt", p);
		p.Dtl_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0090.DtlR.$trd_cur_amt_p);
		p.Dtl_trd_cur_amt_p_PPanel.setName("Dtl.trd_cur_amt_p");
		p.columnDtl_trd_cur_amt = p.Dtl_trd_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_trd_cur_amt.addAliasName("Dtl.trd_cur_amt", p);
		p.Dtl_trd_cur_com_paid_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0090.DtlR.$trd_cur_com_paid_tax_amt_p);
		p.Dtl_trd_cur_com_paid_tax_amt_p_PPanel.setName("Dtl.trd_cur_com_paid_tax_amt_p");
		p.columnDtl_trd_cur_com_paid_tax_amt = p.Dtl_trd_cur_com_paid_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_trd_cur_com_paid_tax_amt.addAliasName("Dtl.trd_cur_com_paid_tax_amt", p);
		p.Dtl_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0090.DtlR.$base_cur_amt_p);
		p.Dtl_base_cur_amt_p_PPanel.setName("Dtl.base_cur_amt_p");
		p.columnDtl_base_cur_amt = p.Dtl_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_amt.addAliasName("Dtl.base_cur_amt", p);
		p.Dtl_base_cur_com_paid_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0090.DtlR.$base_cur_com_paid_tax_amt_p);
		p.Dtl_base_cur_com_paid_tax_amt_p_PPanel.setName("Dtl.base_cur_com_paid_tax_amt_p");
		p.columnDtl_base_cur_com_paid_tax_amt = p.Dtl_base_cur_com_paid_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_com_paid_tax_amt.addAliasName("Dtl.base_cur_com_paid_tax_amt", p);
		p.Dtl_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSBH.MSBHP0090.DtlR.$wrk_no_p);
		p.Dtl_wrk_no_p_PPanel.setName("Dtl.wrk_no_p");
		p.columnDtl_wrk_no = p.Dtl_wrk_no_p_PPanel.columnWrkNo_wrk_no;
		p.columnDtl_wrk_no.addAliasName("Dtl.wrk_no", p);
		p.columnDtl_wrk_nm = p.Dtl_wrk_no_p_PPanel.columnWrkNo_wrk_nm;
		p.columnDtl_wrk_nm.addAliasName("Dtl.wrk_nm", p);
		p.Dtl_old_pay_schd_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0090.DtlR.$old_pay_schd_amt_p);
		p.Dtl_old_pay_schd_amt_p_PPanel.setName("Dtl.old_pay_schd_amt_p");
		p.columnDtl_old_pay_schd_amt = p.Dtl_old_pay_schd_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_old_pay_schd_amt.addAliasName("Dtl.old_pay_schd_amt", p);
		p.Dtl_old_appl_ttl_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0090.DtlR.$old_appl_ttl_amt_p);
		p.Dtl_old_appl_ttl_amt_p_PPanel.setName("Dtl.old_appl_ttl_amt_p");
		p.columnDtl_old_appl_ttl_amt = p.Dtl_old_appl_ttl_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_old_appl_ttl_amt.addAliasName("Dtl.old_appl_ttl_amt", p);
		p.Dtl_old_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0090.DtlR.$old_trd_cur_amt_p);
		p.Dtl_old_trd_cur_amt_p_PPanel.setName("Dtl.old_trd_cur_amt_p");
		p.columnDtl_old_trd_cur_amt = p.Dtl_old_trd_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_old_trd_cur_amt.addAliasName("Dtl.old_trd_cur_amt", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBHP_PayActReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBHP_PayActReg p) {
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

	
	/** [Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "pay_dpt_cd", "pay_dpt_nm","wg_cd","wg_nm");
		}
		return Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Hdr_psppl_cd_ListPutter]の定義 */
	private MCListPutter Hdr_psppl_cd_p = null;

	/**
	 * [Hdr_psppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_psppl_cd_ListPutter() {
		if (Hdr_psppl_cd_p == null) {
			Hdr_psppl_cd_p = createHdr_psppl_cd_ListPutter(Hdr_psppl_cd, "psppl_cd", "psppl_nm","trd_cur_cd","psppl_rmrks");

		}
		return Hdr_psppl_cd_p;
	}
	
	
	/** [Hdr_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Hdr_trd_cur_cd_p = null;

	/**
	 * [Hdr_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_trd_cur_cd_ListPutter() {
		if (Hdr_trd_cur_cd_p == null) {
			Hdr_trd_cur_cd_p = createHdr_trd_cur_cd_ListPutter(Hdr_trd_cur_cd, "trd_cur_cd", "trd_cur_nm","trd_cur_amt_dec_place");

		}
		return Hdr_trd_cur_cd_p;
	}
	
	
	/** [Hdr_ap_sttl_cd_ListPutter]の定義 */
	private MCListPutter Hdr_ap_sttl_cd_p = null;

	/**
	 * [Hdr_ap_sttl_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_ap_sttl_cd_ListPutter() {
		if (Hdr_ap_sttl_cd_p == null) {
			Hdr_ap_sttl_cd_p = createHdr_ap_sttl_cd_ListPutter(Hdr_ap_sttl_cd, "ap_sttl_cd", "ap_sttl_nm","ap_sttl_typ");

		}
		return Hdr_ap_sttl_cd_p;
	}
	
	
	/** [Hdr_ap_sttl_typ_ListPutter]の定義 */
	private MCListPutter Hdr_ap_sttl_typ_p = null;

	/**
	 * [Hdr_ap_sttl_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_ap_sttl_typ_ListPutter() {
		if (Hdr_ap_sttl_typ_p == null) {
			Hdr_ap_sttl_typ_p = createHdr_ap_sttl_typ_ListPutter(Hdr_ap_sttl_typ, "ap_sttl_typ", "ap_sttl_typ_nm");

		}
		return Hdr_ap_sttl_typ_p;
	}
	
	
	/** [Hdr_bank_ac_cd_ListPutter]の定義 */
	private MCListPutter Hdr_bank_ac_cd_p = null;

	/**
	 * [Hdr_bank_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_bank_ac_cd_ListPutter() {
		if (Hdr_bank_ac_cd_p == null) {
			Hdr_bank_ac_cd_p = createHdr_bank_ac_cd_ListPutter(Hdr_bank_ac_cd, "bank_ac_cd", "bank_ac_nm");

		}
		return Hdr_bank_ac_cd_p;
	}
	
	
	/** [Hdr_pay_bank_ac_cd_ListPutter]の定義 */
	private MCListPutter Hdr_pay_bank_ac_cd_p = null;

	/**
	 * [Hdr_pay_bank_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_pay_bank_ac_cd_ListPutter() {
		if (Hdr_pay_bank_ac_cd_p == null) {
			Hdr_pay_bank_ac_cd_p = createHdr_pay_bank_ac_cd_ListPutter(Hdr_pay_bank_ac_cd, "pay_bank_ac_cd", "pay_bank_ac_nm");

		}
		return Hdr_pay_bank_ac_cd_p;
	}
	
	
	/** [Hdr_ap_setoff_typ_ListPutter]の定義 */
	private MCListPutter Hdr_ap_setoff_typ_p = null;

	/**
	 * [Hdr_ap_setoff_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_ap_setoff_typ_ListPutter() {
		if (Hdr_ap_setoff_typ_p == null) {
			Hdr_ap_setoff_typ_p = createHdr_ap_setoff_typ_ListPutter(Hdr_ap_setoff_typ, "ap_setoff_typ", "ap_setoff_typ_nm");

		}
		return Hdr_ap_setoff_typ_p;
	}
	
	
	/** [Hdr_setoff_cd_ListPutter]の定義 */
	private MCListPutter Hdr_setoff_cd_p = null;

	/**
	 * [Hdr_setoff_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_setoff_cd_ListPutter() {
		if (Hdr_setoff_cd_p == null) {
			Hdr_setoff_cd_p = createHdr_setoff_cd_ListPutter(Hdr_setoff_cd, "setoff_cd", "setoff_nm");

		}
		return Hdr_setoff_cd_p;
	}
	
	
	/** [Hdr_so_dpt_cd_ListPutter]の定義 */
	private MCListPutter Hdr_so_dpt_cd_p = null;

	/**
	 * [Hdr_so_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_so_dpt_cd_ListPutter() {
		if (Hdr_so_dpt_cd_p == null) {
			Hdr_so_dpt_cd_p = createHdr_so_dpt_cd_ListPutter(Hdr_so_dpt_cd, "so_dpt_cd", "so_dpt_nm");

		}
		return Hdr_so_dpt_cd_p;
	}
	
	
	/** [Hdr_note_typ_ListPutter]の定義 */
	private MCListPutter Hdr_note_typ_p = null;

	/**
	 * [Hdr_note_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_note_typ_ListPutter() {
		if (Hdr_note_typ_p == null) {
			Hdr_note_typ_p = createHdr_note_typ_ListPutter(Hdr_note_typ, "note_typ", "note_typ_nm");

		}
		return Hdr_note_typ_p;
	}
	
	
	/** [Hdr_draw_bank_cd_ListPutter]の定義 */
	private MCListPutter Hdr_draw_bank_cd_p = null;

	/**
	 * [Hdr_draw_bank_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_draw_bank_cd_ListPutter() {
		if (Hdr_draw_bank_cd_p == null) {
			Hdr_draw_bank_cd_p = createHdr_draw_bank_cd_ListPutter(Hdr_draw_bank_cd, "draw_bank_cd", "draw_bank_nm");

		}
		return Hdr_draw_bank_cd_p;
	}
	
	
	/** [Hdr_draw_branch_cd_ListPutter]の定義 */
	private MCListPutter Hdr_draw_branch_cd_p = null;

	/**
	 * [Hdr_draw_branch_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_draw_branch_cd_ListPutter() {
		if (Hdr_draw_branch_cd_p == null) {
			Hdr_draw_branch_cd_p = createHdr_draw_branch_cd_ListPutter(Hdr_draw_branch_cd, "draw_branch_cd", "draw_branch_nm");

		}
		return Hdr_draw_branch_cd_p;
	}
	
	
	/** [Hdr_note_rsn_cd_ListPutter]の定義 */
	private MCListPutter Hdr_note_rsn_cd_p = null;

	/**
	 * [Hdr_note_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_note_rsn_cd_ListPutter() {
		if (Hdr_note_rsn_cd_p == null) {
			Hdr_note_rsn_cd_p = createHdr_note_rsn_cd_ListPutter(Hdr_note_rsn_cd, "note_rsn_cd", "note_rsn_nm");

		}
		return Hdr_note_rsn_cd_p;
	}
	
	
	/** [Dtl_ap_sttl_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ap_sttl_cd_p = null;

	/**
	 * [Dtl_ap_sttl_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ap_sttl_cd_ListPutter() {
		if (Dtl_ap_sttl_cd_p == null) {
			Dtl_ap_sttl_cd_p = createDtl_ap_sttl_cd_ListPutter(columnDtl_ap_sttl_cd, "ap_sttl_cd", "ap_sttl_nm","ap_sttl_typ","ap_setoff_typ");

		}
		return Dtl_ap_sttl_cd_p;
	}
	
	
	/** [Dtl_ap_sttl_typ_ListPutter]の定義 */
	private MCListPutter Dtl_ap_sttl_typ_p = null;

	/**
	 * [Dtl_ap_sttl_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ap_sttl_typ_ListPutter() {
		if (Dtl_ap_sttl_typ_p == null) {
			Dtl_ap_sttl_typ_p = createDtl_ap_sttl_typ_ListPutter(columnDtl_ap_sttl_typ, "ap_sttl_typ", "ap_sttl_typ_nm");

		}
		return Dtl_ap_sttl_typ_p;
	}
	
	
	/** [Dtl_trd_cur_com_paid_tax_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_cur_com_paid_tax_cd_p = null;

	/**
	 * [Dtl_trd_cur_com_paid_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_cur_com_paid_tax_cd_ListPutter() {
		if (Dtl_trd_cur_com_paid_tax_cd_p == null) {
			Dtl_trd_cur_com_paid_tax_cd_p = createDtl_trd_cur_com_paid_tax_cd_ListPutter(columnDtl_trd_cur_com_paid_tax_cd, "trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_nm","trd_cur_com_paid_tax_rate");

		}
		return Dtl_trd_cur_com_paid_tax_cd_p;
	}
	
	
	/** [Dtl_bank_ac_cd_ListPutter]の定義 */
	private MCListPutter Dtl_bank_ac_cd_p = null;

	/**
	 * [Dtl_bank_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bank_ac_cd_ListPutter() {
		if (Dtl_bank_ac_cd_p == null) {
			Dtl_bank_ac_cd_p = createDtl_bank_ac_cd_ListPutter(columnDtl_bank_ac_cd, "bank_ac_cd", "bank_ac_nm");

		}
		return Dtl_bank_ac_cd_p;
	}
	
	
	/** [Dtl_pay_bank_ac_cd_ListPutter]の定義 */
	private MCListPutter Dtl_pay_bank_ac_cd_p = null;

	/**
	 * [Dtl_pay_bank_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_pay_bank_ac_cd_ListPutter() {
		if (Dtl_pay_bank_ac_cd_p == null) {
			Dtl_pay_bank_ac_cd_p = createDtl_pay_bank_ac_cd_ListPutter(columnDtl_pay_bank_ac_cd, "pay_bank_ac_cd", "pay_bank_ac_nm");

		}
		return Dtl_pay_bank_ac_cd_p;
	}
	
	
	/** [Dtl_ap_setoff_typ_ListPutter]の定義 */
	private MCListPutter Dtl_ap_setoff_typ_p = null;

	/**
	 * [Dtl_ap_setoff_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ap_setoff_typ_ListPutter() {
		if (Dtl_ap_setoff_typ_p == null) {
			Dtl_ap_setoff_typ_p = createDtl_ap_setoff_typ_ListPutter(columnDtl_ap_setoff_typ, "ap_setoff_typ", "ap_setoff_typ_nm");

		}
		return Dtl_ap_setoff_typ_p;
	}
	
	
	/** [Dtl_setoff_cd_ListPutter]の定義 */
	private MCListPutter Dtl_setoff_cd_p = null;

	/**
	 * [Dtl_setoff_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_setoff_cd_ListPutter() {
		if (Dtl_setoff_cd_p == null) {
			Dtl_setoff_cd_p = createDtl_setoff_cd_ListPutter(columnDtl_setoff_cd, "setoff_cd", "setoff_nm");

		}
		return Dtl_setoff_cd_p;
	}
	
	
	/** [Dtl_so_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_so_dpt_cd_p = null;

	/**
	 * [Dtl_so_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_so_dpt_cd_ListPutter() {
		if (Dtl_so_dpt_cd_p == null) {
			Dtl_so_dpt_cd_p = createDtl_so_dpt_cd_ListPutter(columnDtl_so_dpt_cd, "so_dpt_cd", "so_dpt_nm");

		}
		return Dtl_so_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_PayActReg create(){
		MSBHP_PayActReg p = new MSBHP_PayActReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_PayActReg create(String name){
		MSBHP_PayActReg p = new MSBHP_PayActReg(name);
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
		MSBHP_PayActReg_MC.jbfInitScreenOpe((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbfInitCnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbfInitHdrTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbfInitHdr((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbfInitSys((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbfInitPayTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbfInitPay((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbfInitNote((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbfInitDtlCnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbfInitTotal((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbfInitDtl((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbfInitBtn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbfInitEastBtn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbInitScreenOpe((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbInitCnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbInitHdrTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbInitHdr((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbInitSys((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbInitPayTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbInitPay((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbInitNote((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbInitDtlCnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbInitTotal((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbInitDtl((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbInitBtn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.jbInitEastBtn((MSBHP_PayActReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_pay_act_no_Label = p.beansFactory.createLabel("Cnd.pay_act_no_Label");
		p.Cnd_pay_act_no = p.beansFactory.createTextField("Cnd.pay_act_no");
		p.Cnd_pay_act_no.setLabel(p.Cnd_pay_act_no_Label);
		p.Cnd_pay_act_rev = p.beansFactory.createNumberField("Cnd.pay_act_rev");
		p.Cnd_latest_flg = p.beansFactory.createCheckBox("Cnd.latest_flg");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_pay_act_no_Label = p.beansFactory.createLabel("Hdr.pay_act_no_Label");
		p.Hdr_pay_act_no = p.beansFactory.createTextField("Hdr.pay_act_no");
		p.Hdr_pay_act_no.setLabel(p.Hdr_pay_act_no_Label);
		p.Hdr_pay_act_rev = p.beansFactory.createNumberField("Hdr.pay_act_rev");
		p.Hdr_latest_flg = p.beansFactory.createCheckBox("Hdr.latest_flg");
		p.Hdr_ac_ym_Label = p.beansFactory.createLabel("Hdr.ac_ym_Label");
		p.Hdr_ac_ym = p.beansFactory.createDateField("Hdr.ac_ym");
		p.Hdr_ac_ym.setLabel(p.Hdr_ac_ym_Label);
		p.Hdr_pay_act_dt_Label = p.beansFactory.createLabel("Hdr.pay_act_dt_Label");
		p.Hdr_pay_act_dt = p.beansFactory.createDateField("Hdr.pay_act_dt");
		p.Hdr_pay_act_dt.setLabel(p.Hdr_pay_act_dt_Label);
		p.Hdr_pay_basis_dt_Label = p.beansFactory.createLabel("Hdr.pay_basis_dt_Label");
		p.Hdr_pay_basis_dt = p.beansFactory.createDateField("Hdr.pay_basis_dt");
		p.Hdr_pay_basis_dt.setLabel(p.Hdr_pay_basis_dt_Label);
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
		p.Hdr_psppl_cd_Label = p.beansFactory.createLabel("Hdr.psppl_cd_Label");
		p.Hdr_psppl_cd = p.beansFactory.createTextField("Hdr.psppl_cd");
		p.Hdr_psppl_cd.setLabel(p.Hdr_psppl_cd_Label);
		p.Hdr_psppl_nm = p.beansFactory.createTextField("Hdr.psppl_nm");
		p.Hdr_psppl_rmrks_Label = p.beansFactory.createLabel("Hdr.psppl_rmrks_Label");
		p.Hdr_psppl_rmrks = p.beansFactory.createTextField("Hdr.psppl_rmrks");
		p.Hdr_psppl_rmrks.setLabel(p.Hdr_psppl_rmrks_Label);
		p.Hdr_trd_cur_cd_Label = p.beansFactory.createLabel("Hdr.trd_cur_cd_Label");
		p.Hdr_trd_cur_cd = p.beansFactory.createTextComboBox("Hdr.trd_cur_cd");
		p.Hdr_trd_cur_cd.setLabel(p.Hdr_trd_cur_cd_Label);
		p.Hdr_trd_cur_nm = p.beansFactory.createTextField("Hdr.trd_cur_nm");
		p.Hdr_trd_cur_amt_dec_place = p.beansFactory.createNumberField("Hdr.trd_cur_amt_dec_place");
		p.Hdr_base_cur_cd_Label = p.beansFactory.createLabel("Hdr.base_cur_cd_Label");
		p.Hdr_base_cur_cd = p.beansFactory.createTextField("Hdr.base_cur_cd");
		p.Hdr_base_cur_cd.setLabel(p.Hdr_base_cur_cd_Label);
		p.Hdr_base_cur_nm = p.beansFactory.createTextField("Hdr.base_cur_nm");
		p.Hdr_base_cur_amt_dec_place = p.beansFactory.createNumberField("Hdr.base_cur_amt_dec_place");
		p.Hdr_xrate_cd = p.beansFactory.createTextField("Hdr.xrate_cd");
		p.Hdr_ap_sttl_cd_Label = p.beansFactory.createLabel("Hdr.ap_sttl_cd_Label");
		p.Hdr_ap_sttl_cd = p.beansFactory.createTextComboBox("Hdr.ap_sttl_cd");
		p.Hdr_ap_sttl_cd.setLabel(p.Hdr_ap_sttl_cd_Label);
		p.Hdr_ap_sttl_nm = p.beansFactory.createTextField("Hdr.ap_sttl_nm");
		p.Hdr_ap_sttl_typ_Label = p.beansFactory.createLabel("Hdr.ap_sttl_typ_Label");
		p.Hdr_ap_sttl_typ = p.beansFactory.createTextField("Hdr.ap_sttl_typ");
		p.Hdr_ap_sttl_typ.setLabel(p.Hdr_ap_sttl_typ_Label);
		p.Hdr_ap_sttl_typ_nm = p.beansFactory.createTextField("Hdr.ap_sttl_typ_nm");
		p.Hdr_bank_ac_cd_Label = p.beansFactory.createLabel("Hdr.bank_ac_cd_Label");
		p.Hdr_bank_ac_cd = p.beansFactory.createTextComboBox("Hdr.bank_ac_cd");
		p.Hdr_bank_ac_cd.setLabel(p.Hdr_bank_ac_cd_Label);
		p.Hdr_bank_ac_nm = p.beansFactory.createTextField("Hdr.bank_ac_nm");
		p.Hdr_pay_bank_ac_cd_Label = p.beansFactory.createLabel("Hdr.pay_bank_ac_cd_Label");
		p.Hdr_pay_bank_ac_cd = p.beansFactory.createTextComboBox("Hdr.pay_bank_ac_cd");
		p.Hdr_pay_bank_ac_cd.setLabel(p.Hdr_pay_bank_ac_cd_Label);
		p.Hdr_pay_bank_ac_nm = p.beansFactory.createTextField("Hdr.pay_bank_ac_nm");
		p.Hdr_ap_setoff_typ_Label = p.beansFactory.createLabel("Hdr.ap_setoff_typ_Label");
		p.Hdr_ap_setoff_typ = p.beansFactory.createTextComboBox("Hdr.ap_setoff_typ");
		p.Hdr_ap_setoff_typ.setLabel(p.Hdr_ap_setoff_typ_Label);
		p.Hdr_ap_setoff_typ_nm = p.beansFactory.createTextField("Hdr.ap_setoff_typ_nm");
		p.Hdr_setoff_cd_Label = p.beansFactory.createLabel("Hdr.setoff_cd_Label");
		p.Hdr_setoff_cd = p.beansFactory.createTextField("Hdr.setoff_cd");
		p.Hdr_setoff_cd.setLabel(p.Hdr_setoff_cd_Label);
		p.Hdr_setoff_nm = p.beansFactory.createTextField("Hdr.setoff_nm");
		p.Hdr_so_dpt_cd_Label = p.beansFactory.createLabel("Hdr.so_dpt_cd_Label");
		p.Hdr_so_dpt_cd = p.beansFactory.createTextField("Hdr.so_dpt_cd");
		p.Hdr_so_dpt_cd.setLabel(p.Hdr_so_dpt_cd_Label);
		p.Hdr_so_dpt_nm = p.beansFactory.createTextField("Hdr.so_dpt_nm");
		p.Hdr_trd_rmrks_Label = p.beansFactory.createLabel("Hdr.trd_rmrks_Label");
		p.Hdr_trd_rmrks = p.beansFactory.createTextField("Hdr.trd_rmrks");
		p.Hdr_trd_rmrks.setLabel(p.Hdr_trd_rmrks_Label);
		p.Hdr_intr_rmrks_Label = p.beansFactory.createLabel("Hdr.intr_rmrks_Label");
		p.Hdr_intr_rmrks = p.beansFactory.createTextField("Hdr.intr_rmrks");
		p.Hdr_intr_rmrks.setLabel(p.Hdr_intr_rmrks_Label);
		p.Hdr_sub_char1_Label = p.beansFactory.createLabel("Hdr.sub_char1_Label");
		p.Hdr_sub_char1 = p.beansFactory.createTextField("Hdr.sub_char1");
		p.Hdr_sub_char1.setLabel(p.Hdr_sub_char1_Label);
		p.Hdr_sub_char2_Label = p.beansFactory.createLabel("Hdr.sub_char2_Label");
		p.Hdr_sub_char2 = p.beansFactory.createTextField("Hdr.sub_char2");
		p.Hdr_sub_char2.setLabel(p.Hdr_sub_char2_Label);
		p.Hdr_sub_char3_Label = p.beansFactory.createLabel("Hdr.sub_char3_Label");
		p.Hdr_sub_char3 = p.beansFactory.createTextField("Hdr.sub_char3");
		p.Hdr_sub_char3.setLabel(p.Hdr_sub_char3_Label);
		p.Hdr_note_no_Label = p.beansFactory.createLabel("Hdr.note_no_Label");
		p.Hdr_note_no = p.beansFactory.createTextField("Hdr.note_no");
		p.Hdr_note_no.setLabel(p.Hdr_note_no_Label);
		p.Hdr_note_typ_Label = p.beansFactory.createLabel("Hdr.note_typ_Label");
		p.Hdr_note_typ = p.beansFactory.createTextComboBox("Hdr.note_typ");
		p.Hdr_note_typ.setLabel(p.Hdr_note_typ_Label);
		p.Hdr_note_typ_nm = p.beansFactory.createTextField("Hdr.note_typ_nm");
		p.Hdr_draw_dt_Label = p.beansFactory.createLabel("Hdr.draw_dt_Label");
		p.Hdr_draw_dt = p.beansFactory.createDateField("Hdr.draw_dt");
		p.Hdr_draw_dt.setLabel(p.Hdr_draw_dt_Label);
		p.Hdr_note_days_Label = p.beansFactory.createLabel("Hdr.note_days_Label");
		p.Hdr_note_days = p.beansFactory.createNumberField("Hdr.note_days");
		p.Hdr_note_days.setLabel(p.Hdr_note_days_Label);
		p.Hdr_due_dt_Label = p.beansFactory.createLabel("Hdr.due_dt_Label");
		p.Hdr_due_dt = p.beansFactory.createDateField("Hdr.due_dt");
		p.Hdr_due_dt.setLabel(p.Hdr_due_dt_Label);
		p.Hdr_drawer_nm_Label = p.beansFactory.createLabel("Hdr.drawer_nm_Label");
		p.Hdr_drawer_nm = p.beansFactory.createTextField("Hdr.drawer_nm");
		p.Hdr_drawer_nm.setLabel(p.Hdr_drawer_nm_Label);
		p.Hdr_endrsr_Label = p.beansFactory.createLabel("Hdr.endrsr_Label");
		p.Hdr_endrsr = p.beansFactory.createTextField("Hdr.endrsr");
		p.Hdr_endrsr.setLabel(p.Hdr_endrsr_Label);
		p.Hdr_accptr_Label = p.beansFactory.createLabel("Hdr.accptr_Label");
		p.Hdr_accptr = p.beansFactory.createTextField("Hdr.accptr");
		p.Hdr_accptr.setLabel(p.Hdr_accptr_Label);
		p.Hdr_draw_bank_cd_Label = p.beansFactory.createLabel("Hdr.draw_bank_cd_Label");
		p.Hdr_draw_bank_cd = p.beansFactory.createTextComboBox("Hdr.draw_bank_cd");
		p.Hdr_draw_bank_cd.setLabel(p.Hdr_draw_bank_cd_Label);
		p.Hdr_draw_bank_nm = p.beansFactory.createTextField("Hdr.draw_bank_nm");
		p.Hdr_draw_branch_cd_Label = p.beansFactory.createLabel("Hdr.draw_branch_cd_Label");
		p.Hdr_draw_branch_cd = p.beansFactory.createTextComboBox("Hdr.draw_branch_cd");
		p.Hdr_draw_branch_cd.setLabel(p.Hdr_draw_branch_cd_Label);
		p.Hdr_draw_branch_nm = p.beansFactory.createTextField("Hdr.draw_branch_nm");
		p.Hdr_note_rsn_cd_Label = p.beansFactory.createLabel("Hdr.note_rsn_cd_Label");
		p.Hdr_note_rsn_cd = p.beansFactory.createTextComboBox("Hdr.note_rsn_cd");
		p.Hdr_note_rsn_cd.setLabel(p.Hdr_note_rsn_cd_Label);
		p.Hdr_note_rsn_nm = p.beansFactory.createTextField("Hdr.note_rsn_nm");
		p.Hdr_note_sub_char1_Label = p.beansFactory.createLabel("Hdr.note_sub_char1_Label");
		p.Hdr_note_sub_char1 = p.beansFactory.createTextField("Hdr.note_sub_char1");
		p.Hdr_note_sub_char1.setLabel(p.Hdr_note_sub_char1_Label);
		p.Hdr_note_sub_char2_Label = p.beansFactory.createLabel("Hdr.note_sub_char2_Label");
		p.Hdr_note_sub_char2 = p.beansFactory.createTextField("Hdr.note_sub_char2");
		p.Hdr_note_sub_char2.setLabel(p.Hdr_note_sub_char2_Label);
		p.Hdr_note_sub_char3_Label = p.beansFactory.createLabel("Hdr.note_sub_char3_Label");
		p.Hdr_note_sub_char3 = p.beansFactory.createTextField("Hdr.note_sub_char3");
		p.Hdr_note_sub_char3.setLabel(p.Hdr_note_sub_char3_Label);
		p.Hdr_pay_dpt_narrow_down_flg = p.beansFactory.createCheckBox("Hdr.pay_dpt_narrow_down_flg");
		p.Hdr_ap_sttl_narrow_down_flg = p.beansFactory.createCheckBox("Hdr.ap_sttl_narrow_down_flg");
		p.Hdr_pay_schd_dt_Label = p.beansFactory.createLabel("Hdr.pay_schd_dt_Label");
		p.Hdr_pay_schd_dt = p.beansFactory.createDateField("Hdr.pay_schd_dt");
		p.Hdr_pay_schd_dt.setLabel(p.Hdr_pay_schd_dt_Label);
		p.Hdr_srch = p.beansFactory.createButton("Hdr.srch", "srch");
	}

	/**
	 * [Sys]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSys(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		p.SysPanel = p.beansFactory.createPanel("Sys");
		// ブロックの項目の初期化
	}

	/**
	 * [PayTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPayTab(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		p.PayTabPanel = p.beansFactory.createPanel("PayTab");
		p.PayTabTab = p.beansFactory.createTabbedPane("PayTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Pay]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPay(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		p.PayPanel = p.beansFactory.createPanel("Pay");
		// ブロックの項目の初期化
	}

	/**
	 * [Note]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitNote(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		p.NotePanel = p.beansFactory.createPanel("Note");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlCnd(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		p.DtlCndPanel = p.beansFactory.createPanel("DtlCnd");
		p.DtlCndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Total]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTotal(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		p.TotalPanel = p.beansFactory.createPanel("Total");
		p.TotalTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_ap_sttl_cd = p.beansFactory.createTableColumn("Dtl.ap_sttl_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ap_sttl_nm = p.beansFactory.createTableColumn("Dtl.ap_sttl_nm", MCColumnType.TEXT);
		p.columnDtl_ap_sttl_typ = p.beansFactory.createTableColumn("Dtl.ap_sttl_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_ap_sttl_typ_nm = p.beansFactory.createTableColumn("Dtl.ap_sttl_typ_nm", MCColumnType.TEXT);
		p.columnDtl_pay_schd_dt = p.beansFactory.createTableColumn("Dtl.pay_schd_dt", MCColumnType.DATE);
		p.columnDtl_trd_cur_com_paid_tax_cd = p.beansFactory.createTableColumn("Dtl.trd_cur_com_paid_tax_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_trd_cur_com_paid_tax_nm = p.beansFactory.createTableColumn("Dtl.trd_cur_com_paid_tax_nm", MCColumnType.TEXT);
		p.columnDtl_trd_cur_com_paid_tax_rate = p.beansFactory.createTableColumn("Dtl.trd_cur_com_paid_tax_rate", MCColumnType.NUMBER);
		p.columnDtl_bank_ac_cd = p.beansFactory.createTableColumn("Dtl.bank_ac_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_bank_ac_nm = p.beansFactory.createTableColumn("Dtl.bank_ac_nm", MCColumnType.TEXT);
		p.columnDtl_pay_bank_ac_cd = p.beansFactory.createTableColumn("Dtl.pay_bank_ac_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_pay_bank_ac_nm = p.beansFactory.createTableColumn("Dtl.pay_bank_ac_nm", MCColumnType.TEXT);
		p.columnDtl_ap_setoff_typ = p.beansFactory.createTableColumn("Dtl.ap_setoff_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_ap_setoff_typ_nm = p.beansFactory.createTableColumn("Dtl.ap_setoff_typ_nm", MCColumnType.TEXT);
		p.columnDtl_setoff_cd = p.beansFactory.createTableColumn("Dtl.setoff_cd", MCColumnType.TEXT);
		p.columnDtl_setoff_nm = p.beansFactory.createTableColumn("Dtl.setoff_nm", MCColumnType.TEXT);
		p.columnDtl_so_dpt_cd = p.beansFactory.createTableColumn("Dtl.so_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_so_dpt_nm = p.beansFactory.createTableColumn("Dtl.so_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_pay_act_d_no = p.beansFactory.createTableColumn("Dtl.pay_act_d_no", MCColumnType.TEXT);
		p.columnDtl_disp_seq = p.beansFactory.createTableColumn("Dtl.disp_seq", MCColumnType.NUMBER);
		p.columnDtl_pay_chk_no = p.beansFactory.createTableColumn("Dtl.pay_chk_no", MCColumnType.TEXT);
		p.columnDtl_pay_chk_mng_no = p.beansFactory.createTableColumn("Dtl.pay_chk_mng_no", MCColumnType.TEXT);
		p.columnDtl_pay_schd_no = p.beansFactory.createTableColumn("Dtl.pay_schd_no", MCColumnType.TEXT);
		p.columnDtl_ap_appl_schd_no = p.beansFactory.createTableColumn("Dtl.ap_appl_schd_no", MCColumnType.TEXT);
		p.columnDtl_bsppl_cd = p.beansFactory.createTableColumn("Dtl.bsppl_cd", MCColumnType.TEXT);
		p.columnDtl_bsppl_nm = p.beansFactory.createTableColumn("Dtl.bsppl_nm", MCColumnType.TEXT);
		p.columnDtl_bsppl_dpt_cd = p.beansFactory.createTableColumn("Dtl.bsppl_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_bsppl_dpt_nm = p.beansFactory.createTableColumn("Dtl.bsppl_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_asppl_cd = p.beansFactory.createTableColumn("Dtl.asppl_cd", MCColumnType.TEXT);
		p.columnDtl_asppl_nm = p.beansFactory.createTableColumn("Dtl.asppl_nm", MCColumnType.TEXT);
		p.columnDtl_ap_dpt_cd = p.beansFactory.createTableColumn("Dtl.ap_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_ap_dpt_nm = p.beansFactory.createTableColumn("Dtl.ap_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_ap_typ = p.beansFactory.createTableColumn("Dtl.ap_typ", MCColumnType.TEXT);
		p.columnDtl_ap_typ_nm = p.beansFactory.createTableColumn("Dtl.ap_typ_nm", MCColumnType.TEXT);
		p.columnDtl_purc_act_no = p.beansFactory.createTableColumn("Dtl.purc_act_no", MCColumnType.TEXT);
		p.columnDtl_rcpt_iv_mng_no = p.beansFactory.createTableColumn("Dtl.rcpt_iv_mng_no", MCColumnType.TEXT);
		p.columnDtl_rcpt_iv_no = p.beansFactory.createTableColumn("Dtl.rcpt_iv_no", MCColumnType.TEXT);
		p.columnDtl_schd_ap_sttl_cd = p.beansFactory.createTableColumn("Dtl.schd_ap_sttl_cd", MCColumnType.TEXT);
		p.columnDtl_schd_ap_sttl_nm = p.beansFactory.createTableColumn("Dtl.schd_ap_sttl_nm", MCColumnType.TEXT);
		p.columnDtl_schd_ap_sttl_typ = p.beansFactory.createTableColumn("Dtl.schd_ap_sttl_typ", MCColumnType.TEXT);
		p.columnDtl_schd_ap_sttl_typ_nm = p.beansFactory.createTableColumn("Dtl.schd_ap_sttl_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sw_flg = p.beansFactory.createTableColumn("Dtl.sw_flg", MCColumnType.CHECK);
		p.columnDtl_pay_ntc_d_print_rmrks = p.beansFactory.createTableColumn("Dtl.pay_ntc_d_print_rmrks", MCColumnType.TEXT);
		p.columnDtl_trd_d_rmrks = p.beansFactory.createTableColumn("Dtl.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_intr_d_rmrks = p.beansFactory.createTableColumn("Dtl.intr_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBHP_PayActReg p) {
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
	protected static void jbInitCnd(MSBHP_PayActReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0090.CndR.ope_META);
		p.CndPanel.add(p.Cnd_pay_act_no_Label);
		p.CndPanel.add(p.Cnd_pay_act_no);
		p.CndPanel.setLastBeans(p.Cnd_pay_act_no);
		p.Cnd_pay_act_no.setNextBeans(p.Cnd_pay_act_rev);
		p.Cnd_pay_act_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0090.CndR.pay_act_no_META);
		p.CndPanel.add(p.Cnd_pay_act_rev);
		p.Cnd_pay_act_rev.setNextBeans(p.Cnd_latest_flg);
		p.Cnd_pay_act_rev.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0090.CndR.pay_act_rev_META);
		p.CndPanel.add(p.Cnd_latest_flg);
		p.Cnd_latest_flg.setNextBeans(p.Cnd_srch);
		p.Cnd_latest_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0090.CndR.latest_flg_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.PayTabPanel);
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
	protected static void jbInitHdr(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.SysPanel);
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_pay_act_no_Label);
		p.HdrPanel.add(p.Hdr_pay_act_no);
		p.HdrPanel.setLastBeans(p.Hdr_pay_act_no);
		p.Hdr_pay_act_no.setNextBeans(p.Hdr_pay_act_rev);
		p.Hdr_pay_act_no.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.pay_act_no_META);
		p.HdrPanel.add(p.Hdr_pay_act_rev);
		p.Hdr_pay_act_rev.setNextBeans(p.Hdr_latest_flg);
		p.Hdr_pay_act_rev.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.pay_act_rev_META);
		p.HdrPanel.add(p.Hdr_latest_flg);
		p.Hdr_latest_flg.setNextBeans(p.Hdr_ac_ym);
		p.Hdr_latest_flg.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.latest_flg_META);
		p.HdrPanel.add(p.Hdr_ac_ym_Label);
		p.HdrPanel.add(p.Hdr_ac_ym);
		p.Hdr_ac_ym.setNextBeans(p.Hdr_pay_act_dt);
		p.Hdr_ac_ym.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.ac_ym_META);
		p.Hdr_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.HdrPanel.add(p.Hdr_pay_act_dt_Label);
		p.HdrPanel.add(p.Hdr_pay_act_dt);
		p.Hdr_pay_act_dt.setNextBeans(p.Hdr_pay_basis_dt);
		p.Hdr_pay_act_dt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.pay_act_dt_META);
		p.Hdr_pay_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_pay_basis_dt_Label);
		p.HdrPanel.add(p.Hdr_pay_basis_dt);
		p.Hdr_pay_basis_dt.setNextBeans(p.Hdr_ac_dt_p_PPanel);
		p.Hdr_pay_basis_dt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.pay_basis_dt_META);
		p.Hdr_pay_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_ac_dt_p_PPanel);
		p.Hdr_ac_dt_p_PPanel.setNextBeans(p.Hdr_can_ac_dt_p_PPanel);
		p.HdrPanel.add(p.Hdr_can_ac_dt_p_PPanel);
		p.Hdr_can_ac_dt_p_PPanel.setNextBeans(p.Hdr_usr_dpt_p_PPanel);
		p.HdrPanel.add(p.Hdr_usr_dpt_p_PPanel);
		p.Hdr_usr_dpt_p_PPanel.setNextBeans(p.Hdr_wg_cd);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Hdr_pay_dpt_nm,p.Hdr_wg_cd,p.Hdr_wg_nm);
		p.HdrPanel.add(p.Hdr_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_wg_cd);
		p.Hdr_wg_cd.setNextBeans(p.Hdr_wg_nm);
		p.Hdr_wg_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.wg_cd_META);
		p.HdrPanel.add(p.Hdr_wg_nm);
		p.Hdr_wg_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.wg_nm_META);
		p.SysPanel.add(p.Hdr_ins_usr_id_Label);
		p.SysPanel.add(p.Hdr_ins_usr_id);
		p.SysPanel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.ins_usr_id_META);
		p.SysPanel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.ins_usr_nm_META);
		p.SysPanel.add(p.Hdr_ins_func_id_Label);
		p.SysPanel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.ins_func_id_META);
		p.SysPanel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.ins_func_nm_META);
		p.SysPanel.add(p.Hdr_upd_usr_id_Label);
		p.SysPanel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.upd_usr_id_META);
		p.SysPanel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.upd_usr_nm_META);
		p.SysPanel.add(p.Hdr_upd_func_id_Label);
		p.SysPanel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.upd_func_id_META);
		p.SysPanel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.upd_func_nm_META);
		p.SysPanel.add(p.Hdr_ins_ts_Label);
		p.SysPanel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.SysPanel.add(p.Hdr_upd_ts_Label);
		p.SysPanel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.SysPanel.add(p.Hdr_upd_srv_req_no_Label);
		p.SysPanel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.upd_srv_req_no_META);
		p.PayPanel.add(p.Hdr_psppl_cd_Label);
		p.PayPanel.add(p.Hdr_psppl_cd);
		p.PayPanel.setLastBeans(p.Hdr_psppl_cd);
		p.Hdr_psppl_cd.setNextBeans(p.Hdr_psppl_nm);
		p.Hdr_psppl_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.psppl_cd_META);
		p.Hdr_psppl_cd.addLinkBeans(p.Hdr_psppl_nm,p.Hdr_trd_cur_cd,p.Hdr_psppl_rmrks);
		p.Hdr_psppl_cd.setListType(MCListType.STRICT);
		p.PayPanel.add(p.Hdr_psppl_nm);
		p.Hdr_psppl_nm.setNextBeans(p.Hdr_psppl_rmrks);
		p.Hdr_psppl_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.psppl_nm_META);
		p.PayPanel.add(p.Hdr_psppl_rmrks_Label);
		p.PayPanel.add(p.Hdr_psppl_rmrks);
		p.Hdr_psppl_rmrks.setNextBeans(p.Hdr_trd_cur_cd);
		p.Hdr_psppl_rmrks.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.psppl_rmrks_META);
		p.Hdr_trd_cur_cd.setListType(MCListType.STRICT);
		p.Hdr_trd_cur_cd.setLinkBeans(p.Hdr_trd_cur_nm,p.Hdr_trd_cur_amt_dec_place);
		p.PayPanel.add(p.Hdr_trd_cur_cd_Label);
		p.PayPanel.add(p.Hdr_trd_cur_cd);
		p.Hdr_trd_cur_cd.setNextBeans(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.trd_cur_cd_META);
		p.PayPanel.add(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_nm.setNextBeans(p.Hdr_trd_cur_amt_dec_place);
		p.Hdr_trd_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.trd_cur_nm_META);
		p.PayPanel.add(p.Hdr_trd_cur_amt_dec_place);
		p.Hdr_trd_cur_amt_dec_place.setNextBeans(p.Hdr_xrate_p_PPanel);
		p.Hdr_trd_cur_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.trd_cur_amt_dec_place_META);
		p.PayPanel.add(p.Hdr_xrate_p_PPanel);
		p.Hdr_xrate_p_PPanel.setNextBeans(p.Hdr_base_cur_cd);
		p.PayPanel.add(p.Hdr_base_cur_cd_Label);
		p.PayPanel.add(p.Hdr_base_cur_cd);
		p.Hdr_base_cur_cd.setNextBeans(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.base_cur_cd_META);
		p.PayPanel.add(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_nm.setNextBeans(p.Hdr_base_cur_amt_dec_place);
		p.Hdr_base_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.base_cur_nm_META);
		p.PayPanel.add(p.Hdr_base_cur_amt_dec_place);
		p.Hdr_base_cur_amt_dec_place.setNextBeans(p.Hdr_xrate_cd);
		p.Hdr_base_cur_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.base_cur_amt_dec_place_META);
		p.PayPanel.add(p.Hdr_xrate_cd);
		p.Hdr_xrate_cd.setNextBeans(p.Hdr_ap_sttl_cd);
		p.Hdr_xrate_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.xrate_cd_META);
		p.Hdr_ap_sttl_cd.setListType(MCListType.STRICT);
		p.Hdr_ap_sttl_cd.setLinkBeans(p.Hdr_ap_sttl_nm,p.Hdr_ap_sttl_typ);
		p.PayPanel.add(p.Hdr_ap_sttl_cd_Label);
		p.PayPanel.add(p.Hdr_ap_sttl_cd);
		p.Hdr_ap_sttl_cd.setNextBeans(p.Hdr_ap_sttl_nm);
		p.Hdr_ap_sttl_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.ap_sttl_cd_META);
		p.PayPanel.add(p.Hdr_ap_sttl_nm);
		p.Hdr_ap_sttl_nm.setNextBeans(p.Hdr_ap_sttl_typ);
		p.Hdr_ap_sttl_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.ap_sttl_nm_META);
		p.PayPanel.add(p.Hdr_ap_sttl_typ_Label);
		p.PayPanel.add(p.Hdr_ap_sttl_typ);
		p.Hdr_ap_sttl_typ.setNextBeans(p.Hdr_ap_sttl_typ_nm);
		p.Hdr_ap_sttl_typ.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.ap_sttl_typ_META);
		p.Hdr_ap_sttl_typ.addLinkBeans(p.Hdr_ap_sttl_typ_nm);
		p.Hdr_ap_sttl_typ.setListType(MCListType.STRICT);
		p.PayPanel.add(p.Hdr_ap_sttl_typ_nm);
		p.Hdr_ap_sttl_typ_nm.setNextBeans(p.Hdr_bank_ac_cd);
		p.Hdr_ap_sttl_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.ap_sttl_typ_nm_META);
		p.Hdr_bank_ac_cd.setListType(MCListType.STRICT);
		p.Hdr_bank_ac_cd.setLinkBeans(p.Hdr_bank_ac_nm);
		p.PayPanel.add(p.Hdr_bank_ac_cd_Label);
		p.PayPanel.add(p.Hdr_bank_ac_cd);
		p.Hdr_bank_ac_cd.setNextBeans(p.Hdr_bank_ac_nm);
		p.Hdr_bank_ac_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.bank_ac_cd_META);
		p.PayPanel.add(p.Hdr_bank_ac_nm);
		p.Hdr_bank_ac_nm.setNextBeans(p.Hdr_pay_bank_ac_cd);
		p.Hdr_bank_ac_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.bank_ac_nm_META);
		p.Hdr_pay_bank_ac_cd.setListType(MCListType.STRICT);
		p.Hdr_pay_bank_ac_cd.setLinkBeans(p.Hdr_pay_bank_ac_nm);
		p.PayPanel.add(p.Hdr_pay_bank_ac_cd_Label);
		p.PayPanel.add(p.Hdr_pay_bank_ac_cd);
		p.Hdr_pay_bank_ac_cd.setNextBeans(p.Hdr_pay_bank_ac_nm);
		p.Hdr_pay_bank_ac_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.pay_bank_ac_cd_META);
		p.PayPanel.add(p.Hdr_pay_bank_ac_nm);
		p.Hdr_pay_bank_ac_nm.setNextBeans(p.Hdr_ap_setoff_typ);
		p.Hdr_pay_bank_ac_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.pay_bank_ac_nm_META);
		p.Hdr_ap_setoff_typ.setListType(MCListType.STRICT);
		p.Hdr_ap_setoff_typ.setLinkBeans(p.Hdr_ap_setoff_typ_nm);
		p.PayPanel.add(p.Hdr_ap_setoff_typ_Label);
		p.PayPanel.add(p.Hdr_ap_setoff_typ);
		p.Hdr_ap_setoff_typ.setNextBeans(p.Hdr_ap_setoff_typ_nm);
		p.Hdr_ap_setoff_typ.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.ap_setoff_typ_META);
		p.PayPanel.add(p.Hdr_ap_setoff_typ_nm);
		p.Hdr_ap_setoff_typ_nm.setNextBeans(p.Hdr_setoff_cd);
		p.Hdr_ap_setoff_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.ap_setoff_typ_nm_META);
		p.PayPanel.add(p.Hdr_setoff_cd_Label);
		p.PayPanel.add(p.Hdr_setoff_cd);
		p.Hdr_setoff_cd.setNextBeans(p.Hdr_setoff_nm);
		p.Hdr_setoff_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.setoff_cd_META);
		p.Hdr_setoff_cd.addLinkBeans(p.Hdr_setoff_nm);
		p.Hdr_setoff_cd.setListType(MCListType.FREE);
		p.PayPanel.add(p.Hdr_setoff_nm);
		p.Hdr_setoff_nm.setNextBeans(p.Hdr_so_dpt_cd);
		p.Hdr_setoff_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.setoff_nm_META);
		p.PayPanel.add(p.Hdr_so_dpt_cd_Label);
		p.PayPanel.add(p.Hdr_so_dpt_cd);
		p.Hdr_so_dpt_cd.setNextBeans(p.Hdr_so_dpt_nm);
		p.Hdr_so_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.so_dpt_cd_META);
		p.Hdr_so_dpt_cd.addLinkBeans(p.Hdr_so_dpt_nm);
		p.Hdr_so_dpt_cd.setListType(MCListType.STRICT);
		p.PayPanel.add(p.Hdr_so_dpt_nm);
		p.Hdr_so_dpt_nm.setNextBeans(p.Hdr_trd_rmrks);
		p.Hdr_so_dpt_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.so_dpt_nm_META);
		p.PayPanel.add(p.Hdr_trd_rmrks_Label);
		p.PayPanel.add(p.Hdr_trd_rmrks);
		p.Hdr_trd_rmrks.setNextBeans(p.Hdr_intr_rmrks);
		p.Hdr_trd_rmrks.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.trd_rmrks_META);
		p.PayPanel.add(p.Hdr_intr_rmrks_Label);
		p.PayPanel.add(p.Hdr_intr_rmrks);
		p.Hdr_intr_rmrks.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_intr_rmrks.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.intr_rmrks_META);
		p.PayPanel.add(p.Hdr_sub_char1_Label);
		p.PayPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.sub_char1_META);
		p.PayPanel.add(p.Hdr_sub_char2_Label);
		p.PayPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.sub_char2_META);
		p.PayPanel.add(p.Hdr_sub_char3_Label);
		p.PayPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.sub_char3_META);
		p.NotePanel.add(p.Hdr_note_no_Label);
		p.NotePanel.add(p.Hdr_note_no);
		p.NotePanel.setLastBeans(p.Hdr_note_no);
		p.Hdr_note_no.setNextBeans(p.Hdr_note_typ);
		p.Hdr_note_no.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.note_no_META);
		p.Hdr_note_typ.setListType(MCListType.STRICT);
		p.Hdr_note_typ.setLinkBeans(p.Hdr_note_typ_nm);
		p.NotePanel.add(p.Hdr_note_typ_Label);
		p.NotePanel.add(p.Hdr_note_typ);
		p.Hdr_note_typ.setNextBeans(p.Hdr_note_typ_nm);
		p.Hdr_note_typ.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.note_typ_META);
		p.NotePanel.add(p.Hdr_note_typ_nm);
		p.Hdr_note_typ_nm.setNextBeans(p.Hdr_draw_dt);
		p.Hdr_note_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.note_typ_nm_META);
		p.NotePanel.add(p.Hdr_draw_dt_Label);
		p.NotePanel.add(p.Hdr_draw_dt);
		p.Hdr_draw_dt.setNextBeans(p.Hdr_note_days);
		p.Hdr_draw_dt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.draw_dt_META);
		p.Hdr_draw_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.NotePanel.add(p.Hdr_note_days_Label);
		p.NotePanel.add(p.Hdr_note_days);
		p.Hdr_note_days.setNextBeans(p.Hdr_due_dt);
		p.Hdr_note_days.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.note_days_META);
		p.NotePanel.add(p.Hdr_due_dt_Label);
		p.NotePanel.add(p.Hdr_due_dt);
		p.Hdr_due_dt.setNextBeans(p.Hdr_drawer_nm);
		p.Hdr_due_dt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.due_dt_META);
		p.Hdr_due_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.NotePanel.add(p.Hdr_drawer_nm_Label);
		p.NotePanel.add(p.Hdr_drawer_nm);
		p.Hdr_drawer_nm.setNextBeans(p.Hdr_endrsr);
		p.Hdr_drawer_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.drawer_nm_META);
		p.NotePanel.add(p.Hdr_endrsr_Label);
		p.NotePanel.add(p.Hdr_endrsr);
		p.Hdr_endrsr.setNextBeans(p.Hdr_accptr);
		p.Hdr_endrsr.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.endrsr_META);
		p.NotePanel.add(p.Hdr_accptr_Label);
		p.NotePanel.add(p.Hdr_accptr);
		p.Hdr_accptr.setNextBeans(p.Hdr_draw_bank_cd);
		p.Hdr_accptr.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.accptr_META);
		p.Hdr_draw_bank_cd.setListType(MCListType.STRICT);
		p.Hdr_draw_bank_cd.setLinkBeans(p.Hdr_draw_bank_nm);
		p.NotePanel.add(p.Hdr_draw_bank_cd_Label);
		p.NotePanel.add(p.Hdr_draw_bank_cd);
		p.Hdr_draw_bank_cd.setNextBeans(p.Hdr_draw_bank_nm);
		p.Hdr_draw_bank_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.draw_bank_cd_META);
		p.NotePanel.add(p.Hdr_draw_bank_nm);
		p.Hdr_draw_bank_nm.setNextBeans(p.Hdr_draw_branch_cd);
		p.Hdr_draw_bank_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.draw_bank_nm_META);
		p.Hdr_draw_branch_cd.setListType(MCListType.STRICT);
		p.Hdr_draw_branch_cd.setLinkBeans(p.Hdr_draw_branch_nm);
		p.NotePanel.add(p.Hdr_draw_branch_cd_Label);
		p.NotePanel.add(p.Hdr_draw_branch_cd);
		p.Hdr_draw_branch_cd.setNextBeans(p.Hdr_draw_branch_nm);
		p.Hdr_draw_branch_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.draw_branch_cd_META);
		p.NotePanel.add(p.Hdr_draw_branch_nm);
		p.Hdr_draw_branch_nm.setNextBeans(p.Hdr_note_rsn_cd);
		p.Hdr_draw_branch_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.draw_branch_nm_META);
		p.Hdr_note_rsn_cd.setListType(MCListType.STRICT);
		p.Hdr_note_rsn_cd.setLinkBeans(p.Hdr_note_rsn_nm);
		p.NotePanel.add(p.Hdr_note_rsn_cd_Label);
		p.NotePanel.add(p.Hdr_note_rsn_cd);
		p.Hdr_note_rsn_cd.setNextBeans(p.Hdr_note_rsn_nm);
		p.Hdr_note_rsn_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.note_rsn_cd_META);
		p.NotePanel.add(p.Hdr_note_rsn_nm);
		p.Hdr_note_rsn_nm.setNextBeans(p.Hdr_note_sub_char1);
		p.Hdr_note_rsn_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.note_rsn_nm_META);
		p.NotePanel.add(p.Hdr_note_sub_char1_Label);
		p.NotePanel.add(p.Hdr_note_sub_char1);
		p.Hdr_note_sub_char1.setNextBeans(p.Hdr_note_sub_char2);
		p.Hdr_note_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.note_sub_char1_META);
		p.NotePanel.add(p.Hdr_note_sub_char2_Label);
		p.NotePanel.add(p.Hdr_note_sub_char2);
		p.Hdr_note_sub_char2.setNextBeans(p.Hdr_note_sub_char3);
		p.Hdr_note_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.note_sub_char2_META);
		p.NotePanel.add(p.Hdr_note_sub_char3_Label);
		p.NotePanel.add(p.Hdr_note_sub_char3);
		p.Hdr_note_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.note_sub_char3_META);
		p.DtlCndPanel.add(p.Hdr_pay_dpt_narrow_down_flg);
		p.DtlCndPanel.setLastBeans(p.Hdr_pay_dpt_narrow_down_flg);
		p.Hdr_pay_dpt_narrow_down_flg.setNextBeans(p.Hdr_ap_sttl_narrow_down_flg);
		p.Hdr_pay_dpt_narrow_down_flg.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.pay_dpt_narrow_down_flg_META);
		p.DtlCndPanel.add(p.Hdr_ap_sttl_narrow_down_flg);
		p.Hdr_ap_sttl_narrow_down_flg.setNextBeans(p.Hdr_pay_schd_dt);
		p.Hdr_ap_sttl_narrow_down_flg.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.ap_sttl_narrow_down_flg_META);
		p.DtlCndPanel.add(p.Hdr_pay_schd_dt_Label);
		p.DtlCndPanel.add(p.Hdr_pay_schd_dt);
		p.Hdr_pay_schd_dt.setNextBeans(p.Hdr_srch);
		p.Hdr_pay_schd_dt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0090.HdrR.pay_schd_dt_META);
		p.Hdr_pay_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr_srch.setIcon("SEARCH");
		p.Hdr_srch.setFunctionKey(MCFunctionKey.F4);
		p.DtlCndPanel.add(p.Hdr_srch);
	}

	/**
	 * [Sys]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSys(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [PayTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPayTab(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		p.add(p.PayTabPanel);
		p.PayTabPanel.setNextBeans(p.DtlCndPanel);
		p.PayTabPanel.add(p.PayTabTab);
		p.PayTabPanel.setLastBeans(p.PayTabTab);
		p.PayTabPanel.setLayoutPosition("CT");
		// ブロックの項目の初期化
		p.PayTabTab.add(p.PayPanel, "PayTab.tab1");
		p.PayTabTab.setLastBeans(p.PayPanel);
		p.PayPanel.setNextBeans(p.NotePanel);
		p.PayTabTab.add(p.NotePanel, "PayTab.tab2");
	}

	/**
	 * [Pay]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPay(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		p.PayPanel.setNextBeans(p.NotePanel);
		// ブロックの項目の初期化
	}

	/**
	 * [Note]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitNote(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [DtlCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlCnd(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		p.DtlCndPanel.setBorder(p.DtlCndTitledBorder);
		p.add(p.DtlCndPanel);
		p.DtlCndPanel.setNextBeans(p.TotalPanel);
		p.DtlCndPanel.setLayoutPosition("CTN");
		// ブロックの項目の初期化
	}

	/**
	 * [Total]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTotal(MSBHP_PayActReg p) {
		// ブロック関連の初期化
		p.TotalPanel.setBorder(p.TotalTitledBorder);
		p.add(p.TotalPanel);
		p.TotalPanel.setNextBeans(p.DtlPanel);
		p.TotalPanel.setLayoutPosition("CTC");
		// ブロックの項目の初期化
		p.TotalPanel.add(p.Total_pay_amt_p_PPanel);
		p.TotalPanel.setLastBeans(p.Total_pay_amt_p_PPanel);
		p.Total_pay_amt_p_PPanel.setNextBeans(p.Total_not_appl_bal_p_PPanel);
		p.Total_pay_amt_p_PPanel.Amt_amt.setMinusEnable(true);
		p.TotalPanel.add(p.Total_not_appl_bal_p_PPanel);
		p.Total_not_appl_bal_p_PPanel.setNextBeans(p.Total_ttl_s_amt_p_PPanel);
		p.Total_not_appl_bal_p_PPanel.Amt_amt.setMinusEnable(true);
		p.TotalPanel.add(p.Total_ttl_s_amt_p_PPanel);
		p.Total_ttl_s_amt_p_PPanel.setNextBeans(p.Total_ttl_s_com_paid_amt_p_PPanel);
		p.Total_ttl_s_amt_p_PPanel.Amt_amt.setMinusEnable(true);
		p.TotalPanel.add(p.Total_ttl_s_com_paid_amt_p_PPanel);
		p.Total_ttl_s_com_paid_amt_p_PPanel.setNextBeans(p.Total_ttl_s_com_paid_tax_amt_p_PPanel);
		p.Total_ttl_s_com_paid_amt_p_PPanel.Amt_amt.setMinusEnable(true);
		p.TotalPanel.add(p.Total_ttl_s_com_paid_tax_amt_p_PPanel);
		p.Total_ttl_s_com_paid_tax_amt_p_PPanel.setNextBeans(p.Total_ttl_a_amt_p_PPanel);
		p.Total_ttl_s_com_paid_tax_amt_p_PPanel.Amt_amt.setMinusEnable(true);
		p.TotalPanel.add(p.Total_ttl_a_amt_p_PPanel);
		p.Total_ttl_a_amt_p_PPanel.setNextBeans(p.Total_ttl_a_com_paid_amt_p_PPanel);
		p.Total_ttl_a_amt_p_PPanel.Amt_amt.setMinusEnable(true);
		p.TotalPanel.add(p.Total_ttl_a_com_paid_amt_p_PPanel);
		p.Total_ttl_a_com_paid_amt_p_PPanel.setNextBeans(p.Total_ttl_a_com_paid_tax_amt_p_PPanel);
		p.Total_ttl_a_com_paid_amt_p_PPanel.Amt_amt.setMinusEnable(true);
		p.TotalPanel.add(p.Total_ttl_a_com_paid_tax_amt_p_PPanel);
		p.Total_ttl_a_com_paid_tax_amt_p_PPanel.Amt_amt.setMinusEnable(true);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBHP_PayActReg p) {
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
	protected static void jbInitBtn(MSBHP_PayActReg p) {
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
		p.Btn_deselect_all.setNextBeans(p.Btn_rcopy);
		p.Btn_rcopy.setIcon("COPY_RECORD");
		p.Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_rcopy);
		p.Btn_rcopy.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_ins);
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
	protected static void jbInitEastBtn(MSBHP_PayActReg p) {
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
		MSBHP_PayActReg_MC.mcInitScreenOpe((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.mcInitCnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.mcInitHdrTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.mcInitHdr((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.mcInitSys((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.mcInitPayTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.mcInitPay((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.mcInitNote((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.mcInitDtlCnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.mcInitTotal((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.mcInitDtl((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.mcInitBtn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.mcInitEastBtn((MSBHP_PayActReg)this);

		// [INS_SRCH]ステータスのモードの設定
		MSBHP_PayActReg_MC.statusInitINS__SRCH_ScreenOpe((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS__SRCH_Cnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS__SRCH_HdrTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS__SRCH_Hdr((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS__SRCH_Sys((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS__SRCH_PayTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS__SRCH_Pay((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS__SRCH_Note((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS__SRCH_DtlCnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS__SRCH_Total((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS__SRCH_Dtl((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS__SRCH_Btn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS__SRCH_EastBtn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS__SRCH_PaySchdTgt((MSBHP_PayActReg)this);

		// [INS]ステータスのモードの設定
		MSBHP_PayActReg_MC.statusInitINS_ScreenOpe((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS_Cnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS_HdrTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS_Hdr((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS_Sys((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS_PayTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS_Pay((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS_Note((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS_DtlCnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS_Total((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS_Dtl((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS_Btn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS_EastBtn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitINS_PaySchdTgt((MSBHP_PayActReg)this);

		// [SRCH]ステータスのモードの設定
		MSBHP_PayActReg_MC.statusInitSRCH_ScreenOpe((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitSRCH_Cnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitSRCH_HdrTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitSRCH_Hdr((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitSRCH_Sys((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitSRCH_PayTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitSRCH_Pay((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitSRCH_Note((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitSRCH_DtlCnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitSRCH_Total((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitSRCH_Dtl((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitSRCH_Btn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitSRCH_EastBtn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitSRCH_PaySchdTgt((MSBHP_PayActReg)this);

		// [UPD]ステータスのモードの設定
		MSBHP_PayActReg_MC.statusInitUPD_ScreenOpe((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitUPD_Cnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitUPD_HdrTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitUPD_Hdr((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitUPD_Sys((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitUPD_PayTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitUPD_Pay((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitUPD_Note((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitUPD_DtlCnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitUPD_Total((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitUPD_Dtl((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitUPD_Btn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitUPD_EastBtn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitUPD_PaySchdTgt((MSBHP_PayActReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBHP_PayActReg_MC.statusInitFIX__U_ScreenOpe((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__U_Cnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__U_HdrTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__U_Hdr((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__U_Sys((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__U_PayTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__U_Pay((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__U_Note((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__U_DtlCnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__U_Total((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__U_Dtl((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__U_Btn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__U_EastBtn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__U_PaySchdTgt((MSBHP_PayActReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBHP_PayActReg_MC.statusInitFIX__D_ScreenOpe((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__D_Cnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__D_HdrTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__D_Hdr((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__D_Sys((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__D_PayTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__D_Pay((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__D_Note((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__D_DtlCnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__D_Total((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__D_Dtl((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__D_Btn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__D_EastBtn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__D_PaySchdTgt((MSBHP_PayActReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBHP_PayActReg_MC.statusInitFIX__I_ScreenOpe((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__I_Cnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__I_HdrTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__I_Hdr((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__I_Sys((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__I_PayTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__I_Pay((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__I_Note((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__I_DtlCnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__I_Total((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__I_Dtl((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__I_Btn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__I_EastBtn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitFIX__I_PaySchdTgt((MSBHP_PayActReg)this);

		// [DEL]ステータスのモードの設定
		MSBHP_PayActReg_MC.statusInitDEL_ScreenOpe((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitDEL_Cnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitDEL_HdrTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitDEL_Hdr((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitDEL_Sys((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitDEL_PayTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitDEL_Pay((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitDEL_Note((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitDEL_DtlCnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitDEL_Total((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitDEL_Dtl((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitDEL_Btn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitDEL_EastBtn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitDEL_PaySchdTgt((MSBHP_PayActReg)this);

		// [REF]ステータスのモードの設定
		MSBHP_PayActReg_MC.statusInitREF_ScreenOpe((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitREF_Cnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitREF_HdrTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitREF_Hdr((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitREF_Sys((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitREF_PayTab((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitREF_Pay((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitREF_Note((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitREF_DtlCnd((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitREF_Total((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitREF_Dtl((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitREF_Btn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitREF_EastBtn((MSBHP_PayActReg)this);
		MSBHP_PayActReg_MC.statusInitREF_PaySchdTgt((MSBHP_PayActReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBHP_PayActReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBHP_PayActReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_pay_act_no.setListListener(p);
		p.Cnd_pay_act_no.addAllListener(p);
		p.Cnd_pay_act_rev.setListListener(p);
		p.Cnd_pay_act_rev.addAllListener(p);
		p.Cnd_latest_flg.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBHP_PayActReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBHP_PayActReg p) {
		p.Hdr_pay_act_no.setListListener(p);
		p.Hdr_pay_act_no.addAllListener(p);
		p.Hdr_pay_act_rev.setListListener(p);
		p.Hdr_pay_act_rev.addAllListener(p);
		p.Hdr_latest_flg.addAllListener(p);
		p.Hdr_ac_ym.setListListener(p);
		p.Hdr_ac_ym.addAllListener(p);
		p.Hdr_pay_act_dt.setListListener(p);
		p.Hdr_pay_act_dt.addAllListener(p);
		p.Hdr_pay_basis_dt.setListListener(p);
		p.Hdr_pay_basis_dt.addAllListener(p);
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
		p.Hdr_psppl_cd.setListListener(p);
		p.Hdr_psppl_cd.addAllListener(p);
		p.Hdr_psppl_nm.setListListener(p);
		p.Hdr_psppl_nm.addAllListener(p);
		p.Hdr_psppl_rmrks.setListListener(p);
		p.Hdr_psppl_rmrks.addAllListener(p);
		p.Hdr_trd_cur_cd.setListListener(p);
		p.Hdr_trd_cur_cd.addAllListener(p);
		p.Hdr_trd_cur_nm.setListListener(p);
		p.Hdr_trd_cur_nm.addAllListener(p);
		p.Hdr_trd_cur_amt_dec_place.setListListener(p);
		p.Hdr_trd_cur_amt_dec_place.addAllListener(p);
		p.Hdr_base_cur_cd.setListListener(p);
		p.Hdr_base_cur_cd.addAllListener(p);
		p.Hdr_base_cur_nm.setListListener(p);
		p.Hdr_base_cur_nm.addAllListener(p);
		p.Hdr_base_cur_amt_dec_place.setListListener(p);
		p.Hdr_base_cur_amt_dec_place.addAllListener(p);
		p.Hdr_xrate_cd.setListListener(p);
		p.Hdr_xrate_cd.addAllListener(p);
		p.Hdr_ap_sttl_cd.setListListener(p);
		p.Hdr_ap_sttl_cd.addAllListener(p);
		p.Hdr_ap_sttl_nm.setListListener(p);
		p.Hdr_ap_sttl_nm.addAllListener(p);
		p.Hdr_ap_sttl_typ.setListListener(p);
		p.Hdr_ap_sttl_typ.addAllListener(p);
		p.Hdr_ap_sttl_typ_nm.setListListener(p);
		p.Hdr_ap_sttl_typ_nm.addAllListener(p);
		p.Hdr_bank_ac_cd.setListListener(p);
		p.Hdr_bank_ac_cd.addAllListener(p);
		p.Hdr_bank_ac_nm.setListListener(p);
		p.Hdr_bank_ac_nm.addAllListener(p);
		p.Hdr_pay_bank_ac_cd.setListListener(p);
		p.Hdr_pay_bank_ac_cd.addAllListener(p);
		p.Hdr_pay_bank_ac_nm.setListListener(p);
		p.Hdr_pay_bank_ac_nm.addAllListener(p);
		p.Hdr_ap_setoff_typ.setListListener(p);
		p.Hdr_ap_setoff_typ.addAllListener(p);
		p.Hdr_ap_setoff_typ_nm.setListListener(p);
		p.Hdr_ap_setoff_typ_nm.addAllListener(p);
		p.Hdr_setoff_cd.setListListener(p);
		p.Hdr_setoff_cd.addAllListener(p);
		p.Hdr_setoff_nm.setListListener(p);
		p.Hdr_setoff_nm.addAllListener(p);
		p.Hdr_so_dpt_cd.setListListener(p);
		p.Hdr_so_dpt_cd.addAllListener(p);
		p.Hdr_so_dpt_nm.setListListener(p);
		p.Hdr_so_dpt_nm.addAllListener(p);
		p.Hdr_trd_rmrks.setListListener(p);
		p.Hdr_trd_rmrks.addAllListener(p);
		p.Hdr_intr_rmrks.setListListener(p);
		p.Hdr_intr_rmrks.addAllListener(p);
		p.Hdr_sub_char1.setListListener(p);
		p.Hdr_sub_char1.addAllListener(p);
		p.Hdr_sub_char2.setListListener(p);
		p.Hdr_sub_char2.addAllListener(p);
		p.Hdr_sub_char3.setListListener(p);
		p.Hdr_sub_char3.addAllListener(p);
		p.Hdr_note_no.setListListener(p);
		p.Hdr_note_no.addAllListener(p);
		p.Hdr_note_typ.setListListener(p);
		p.Hdr_note_typ.addAllListener(p);
		p.Hdr_note_typ_nm.setListListener(p);
		p.Hdr_note_typ_nm.addAllListener(p);
		p.Hdr_draw_dt.setListListener(p);
		p.Hdr_draw_dt.addAllListener(p);
		p.Hdr_note_days.setListListener(p);
		p.Hdr_note_days.addAllListener(p);
		p.Hdr_due_dt.setListListener(p);
		p.Hdr_due_dt.addAllListener(p);
		p.Hdr_drawer_nm.setListListener(p);
		p.Hdr_drawer_nm.addAllListener(p);
		p.Hdr_endrsr.setListListener(p);
		p.Hdr_endrsr.addAllListener(p);
		p.Hdr_accptr.setListListener(p);
		p.Hdr_accptr.addAllListener(p);
		p.Hdr_draw_bank_cd.setListListener(p);
		p.Hdr_draw_bank_cd.addAllListener(p);
		p.Hdr_draw_bank_nm.setListListener(p);
		p.Hdr_draw_bank_nm.addAllListener(p);
		p.Hdr_draw_branch_cd.setListListener(p);
		p.Hdr_draw_branch_cd.addAllListener(p);
		p.Hdr_draw_branch_nm.setListListener(p);
		p.Hdr_draw_branch_nm.addAllListener(p);
		p.Hdr_note_rsn_cd.setListListener(p);
		p.Hdr_note_rsn_cd.addAllListener(p);
		p.Hdr_note_rsn_nm.setListListener(p);
		p.Hdr_note_rsn_nm.addAllListener(p);
		p.Hdr_note_sub_char1.setListListener(p);
		p.Hdr_note_sub_char1.addAllListener(p);
		p.Hdr_note_sub_char2.setListListener(p);
		p.Hdr_note_sub_char2.addAllListener(p);
		p.Hdr_note_sub_char3.setListListener(p);
		p.Hdr_note_sub_char3.addAllListener(p);
		p.Hdr_pay_dpt_narrow_down_flg.addAllListener(p);
		p.Hdr_ap_sttl_narrow_down_flg.addAllListener(p);
		p.Hdr_pay_schd_dt.setListListener(p);
		p.Hdr_pay_schd_dt.addAllListener(p);
		p.Hdr_srch.addAllListener(p);
		p.Hdr_srch.setAPMethodName("doHdr_srch");
	}

	/**
	 *  [Sys]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSys(MSBHP_PayActReg p) {
	}

	/**
	 *  [PayTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPayTab(MSBHP_PayActReg p) {
		p.PayTabTab.addAllListener(p);
	}

	/**
	 *  [Pay]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPay(MSBHP_PayActReg p) {
	}

	/**
	 *  [Note]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitNote(MSBHP_PayActReg p) {
	}

	/**
	 *  [DtlCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlCnd(MSBHP_PayActReg p) {
	}

	/**
	 *  [Total]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTotal(MSBHP_PayActReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBHP_PayActReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_ap_sttl_cd.addAllListener(p);
		p.columnDtl_ap_sttl_cd.setListListener(p);
		p.columnDtl_ap_sttl_nm.addAllListener(p);
		p.columnDtl_ap_sttl_nm.setListListener(p);
		p.columnDtl_ap_sttl_typ.addAllListener(p);
		p.columnDtl_ap_sttl_typ.setListListener(p);
		p.columnDtl_ap_sttl_typ_nm.addAllListener(p);
		p.columnDtl_ap_sttl_typ_nm.setListListener(p);
		p.columnDtl_pay_schd_dt.addAllListener(p);
		p.columnDtl_pay_schd_dt.setListListener(p);
		p.columnDtl_trd_cur_com_paid_tax_cd.addAllListener(p);
		p.columnDtl_trd_cur_com_paid_tax_cd.setListListener(p);
		p.columnDtl_trd_cur_com_paid_tax_nm.addAllListener(p);
		p.columnDtl_trd_cur_com_paid_tax_nm.setListListener(p);
		p.columnDtl_trd_cur_com_paid_tax_rate.addAllListener(p);
		p.columnDtl_trd_cur_com_paid_tax_rate.setListListener(p);
		p.columnDtl_bank_ac_cd.addAllListener(p);
		p.columnDtl_bank_ac_cd.setListListener(p);
		p.columnDtl_bank_ac_nm.addAllListener(p);
		p.columnDtl_bank_ac_nm.setListListener(p);
		p.columnDtl_pay_bank_ac_cd.addAllListener(p);
		p.columnDtl_pay_bank_ac_cd.setListListener(p);
		p.columnDtl_pay_bank_ac_nm.addAllListener(p);
		p.columnDtl_pay_bank_ac_nm.setListListener(p);
		p.columnDtl_ap_setoff_typ.addAllListener(p);
		p.columnDtl_ap_setoff_typ.setListListener(p);
		p.columnDtl_ap_setoff_typ_nm.addAllListener(p);
		p.columnDtl_ap_setoff_typ_nm.setListListener(p);
		p.columnDtl_setoff_cd.addAllListener(p);
		p.columnDtl_setoff_cd.setListListener(p);
		p.columnDtl_setoff_nm.addAllListener(p);
		p.columnDtl_setoff_nm.setListListener(p);
		p.columnDtl_so_dpt_cd.addAllListener(p);
		p.columnDtl_so_dpt_cd.setListListener(p);
		p.columnDtl_so_dpt_nm.addAllListener(p);
		p.columnDtl_so_dpt_nm.setListListener(p);
		p.columnDtl_pay_act_d_no.addAllListener(p);
		p.columnDtl_pay_act_d_no.setListListener(p);
		p.columnDtl_disp_seq.addAllListener(p);
		p.columnDtl_disp_seq.setListListener(p);
		p.columnDtl_pay_chk_no.addAllListener(p);
		p.columnDtl_pay_chk_no.setListListener(p);
		p.columnDtl_pay_chk_mng_no.addAllListener(p);
		p.columnDtl_pay_chk_mng_no.setListListener(p);
		p.columnDtl_pay_schd_no.addAllListener(p);
		p.columnDtl_pay_schd_no.setListListener(p);
		p.columnDtl_ap_appl_schd_no.addAllListener(p);
		p.columnDtl_ap_appl_schd_no.setListListener(p);
		p.columnDtl_bsppl_cd.addAllListener(p);
		p.columnDtl_bsppl_cd.setListListener(p);
		p.columnDtl_bsppl_nm.addAllListener(p);
		p.columnDtl_bsppl_nm.setListListener(p);
		p.columnDtl_bsppl_dpt_cd.addAllListener(p);
		p.columnDtl_bsppl_dpt_cd.setListListener(p);
		p.columnDtl_bsppl_dpt_nm.addAllListener(p);
		p.columnDtl_bsppl_dpt_nm.setListListener(p);
		p.columnDtl_asppl_cd.addAllListener(p);
		p.columnDtl_asppl_cd.setListListener(p);
		p.columnDtl_asppl_nm.addAllListener(p);
		p.columnDtl_asppl_nm.setListListener(p);
		p.columnDtl_ap_dpt_cd.addAllListener(p);
		p.columnDtl_ap_dpt_cd.setListListener(p);
		p.columnDtl_ap_dpt_nm.addAllListener(p);
		p.columnDtl_ap_dpt_nm.setListListener(p);
		p.columnDtl_ap_typ.addAllListener(p);
		p.columnDtl_ap_typ.setListListener(p);
		p.columnDtl_ap_typ_nm.addAllListener(p);
		p.columnDtl_ap_typ_nm.setListListener(p);
		p.columnDtl_purc_act_no.addAllListener(p);
		p.columnDtl_purc_act_no.setListListener(p);
		p.columnDtl_rcpt_iv_mng_no.addAllListener(p);
		p.columnDtl_rcpt_iv_mng_no.setListListener(p);
		p.columnDtl_rcpt_iv_no.addAllListener(p);
		p.columnDtl_rcpt_iv_no.setListListener(p);
		p.columnDtl_schd_ap_sttl_cd.addAllListener(p);
		p.columnDtl_schd_ap_sttl_cd.setListListener(p);
		p.columnDtl_schd_ap_sttl_nm.addAllListener(p);
		p.columnDtl_schd_ap_sttl_nm.setListListener(p);
		p.columnDtl_schd_ap_sttl_typ.addAllListener(p);
		p.columnDtl_schd_ap_sttl_typ.setListListener(p);
		p.columnDtl_schd_ap_sttl_typ_nm.addAllListener(p);
		p.columnDtl_schd_ap_sttl_typ_nm.setListListener(p);
		p.columnDtl_sw_flg.addAllListener(p);
		p.columnDtl_pay_ntc_d_print_rmrks.addAllListener(p);
		p.columnDtl_pay_ntc_d_print_rmrks.setListListener(p);
		p.columnDtl_trd_d_rmrks.addAllListener(p);
		p.columnDtl_trd_d_rmrks.setListListener(p);
		p.columnDtl_intr_d_rmrks.addAllListener(p);
		p.columnDtl_intr_d_rmrks.setListListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBHP_PayActReg p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
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
	protected static void mcInitEastBtn(MSBHP_PayActReg p) {
	}

	/**
	 * [INS_SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_ScreenOpe(MSBHP_PayActReg p){

	}

	/**
	 * [INS_SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_Cnd(MSBHP_PayActReg p){
		p.Cnd_ope_Group.putMode(p, INS_SRCH, MCMode.REQUIRED);
		p.Cnd_pay_act_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Cnd_pay_act_rev.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS_SRCH, MCMode.DISABLE);

	}

	/**
	 * [INS_SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_HdrTab(MSBHP_PayActReg p){

	}

	/**
	 * [INS_SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_Hdr(MSBHP_PayActReg p){
		p.Hdr_pay_act_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_act_rev.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_act_dt.putMode(p, INS_SRCH, MCMode.REQUIRED);
		p.Hdr_pay_basis_dt.putMode(p, INS_SRCH, MCMode.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, INS_SRCH, MCMode.REQUIRED);
		p.Hdr_wg_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_psppl_cd.putMode(p, INS_SRCH, MCMode.REQUIRED);
		p.Hdr_psppl_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_psppl_rmrks.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, INS_SRCH, MCMode.REQUIRED);
		p.Hdr_trd_cur_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_base_cur_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_xrate_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_ap_sttl_cd.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_ap_sttl_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_typ.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_typ_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_bank_ac_cd.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_bank_ac_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_cd.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_pay_bank_ac_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_typ.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_ap_setoff_typ_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_setoff_cd.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_setoff_nm.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_so_dpt_cd.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_so_dpt_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_note_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_note_typ.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_note_typ_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_draw_dt.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_note_days.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_due_dt.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_drawer_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_endrsr.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_accptr.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_draw_bank_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_draw_bank_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_draw_branch_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_draw_branch_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_note_rsn_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_note_rsn_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_note_sub_char1.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_note_sub_char2.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_note_sub_char3.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_dpt_narrow_down_flg.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_ap_sttl_narrow_down_flg.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_pay_schd_dt.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_srch.putMode(p, INS_SRCH, MCMode.ENABLE);

	}

	/**
	 * [INS_SRCH]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_Sys(MSBHP_PayActReg p){

	}

	/**
	 * [INS_SRCH]ステータスの[PayTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_PayTab(MSBHP_PayActReg p){

	}

	/**
	 * [INS_SRCH]ステータスの[Pay]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_Pay(MSBHP_PayActReg p){

	}

	/**
	 * [INS_SRCH]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_Note(MSBHP_PayActReg p){

	}

	/**
	 * [INS_SRCH]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_DtlCnd(MSBHP_PayActReg p){

	}

	/**
	 * [INS_SRCH]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_Total(MSBHP_PayActReg p){
		p.Total_pay_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_not_appl_bal_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_com_paid_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_com_paid_tax_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_com_paid_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_com_paid_tax_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [INS_SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_Dtl(MSBHP_PayActReg p){
		p.columnDtl_check.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_pay_schd_dt.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_pay_schd_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_pay_schd_com_paid_tax_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_rate.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_trd_cur_com_paid_tax_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bank_ac_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_bank_ac_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_setoff_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_setoff_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_so_dpt_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_so_dpt_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_com_paid_tax_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_pay_act_d_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_pay_chk_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_pay_chk_mng_no.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_pay_schd_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_appl_schd_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_bsppl_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_bsppl_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_asppl_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_asppl_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_typ.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_typ_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_mng_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_wrk_no_p_PPanel.putStatus(INS_SRCH, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl_schd_ap_sttl_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_typ.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_typ_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sw_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_pay_ntc_d_print_rmrks.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_old_pay_schd_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_old_appl_ttl_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_old_trd_cur_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);

	}

	/**
	 * [INS_SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_Btn(MSBHP_PayActReg p){
		p.Btn_select_all.putMode(p, INS_SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, INS_SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, INS_SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, INS_SRCH, MCMode.DISABLE);
		p.Btn_ins.putMode(p, INS_SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS_SRCH, MCMode.DISABLE);

	}

	/**
	 * [INS_SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_EastBtn(MSBHP_PayActReg p){

	}

	/**
	 * [INS_SRCH]ステータスの[PaySchdTgt]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_PaySchdTgt(MSBHP_PayActReg p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBHP_PayActReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBHP_PayActReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_pay_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_pay_act_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBHP_PayActReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBHP_PayActReg p){
		p.Hdr_pay_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_pay_act_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_pay_act_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_pay_basis_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
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
		p.Hdr_psppl_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_psppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_psppl_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_trd_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_base_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_xrate_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ap_sttl_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_ap_sttl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_bank_ac_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_bank_ac_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_pay_bank_ac_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_typ.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_ap_setoff_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_setoff_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_setoff_nm.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_so_dpt_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_so_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_note_no.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_note_typ.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_note_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_draw_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_note_days.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_due_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_drawer_nm.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_endrsr.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_accptr.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_draw_bank_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_draw_bank_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_draw_branch_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_draw_branch_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_note_rsn_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_note_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_note_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_note_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_note_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_pay_dpt_narrow_down_flg.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_ap_sttl_narrow_down_flg.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_pay_schd_dt.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_srch.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitINS_Sys(MSBHP_PayActReg p){

	}

	/**
	 * [INS]ステータスの[PayTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_PayTab(MSBHP_PayActReg p){

	}

	/**
	 * [INS]ステータスの[Pay]ブロックのモードの設定
	 */
	protected static void statusInitINS_Pay(MSBHP_PayActReg p){

	}

	/**
	 * [INS]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitINS_Note(MSBHP_PayActReg p){

	}

	/**
	 * [INS]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_DtlCnd(MSBHP_PayActReg p){

	}

	/**
	 * [INS]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitINS_Total(MSBHP_PayActReg p){
		p.Total_pay_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.ENABLE);
		p.Total_not_appl_bal_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_com_paid_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_com_paid_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_com_paid_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_com_paid_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl(MSBHP_PayActReg p){
		p.columnDtl_check.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_ap_sttl_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_ap_sttl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_pay_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_pay_schd_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_pay_schd_com_paid_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.columnDtl_trd_cur_com_paid_tax_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_trd_cur_com_paid_tax_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_rate.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_trd_cur_com_paid_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bank_ac_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_bank_ac_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_pay_bank_ac_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_ap_setoff_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_setoff_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_setoff_nm.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_so_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_so_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_com_paid_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_pay_act_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_pay_chk_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_pay_chk_mng_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_pay_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ap_appl_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bsppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bsppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_asppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_asppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ap_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ap_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_mng_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl_schd_ap_sttl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sw_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_pay_ntc_d_print_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_intr_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_old_pay_schd_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_old_appl_ttl_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_old_trd_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBHP_PayActReg p){
		p.Btn_select_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBHP_PayActReg p){

	}

	/**
	 * [INS]ステータスの[PaySchdTgt]ブロックのモードの設定
	 */
	protected static void statusInitINS_PaySchdTgt(MSBHP_PayActReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBHP_PayActReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBHP_PayActReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_pay_act_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_pay_act_rev.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_latest_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBHP_PayActReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBHP_PayActReg p){
		p.Hdr_pay_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_act_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_basis_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
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
		p.Hdr_psppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_psppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_psppl_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_xrate_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ap_sttl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bank_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bank_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_setoff_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_setoff_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_so_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_so_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_note_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_note_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_note_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_draw_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_note_days.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_due_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_drawer_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_endrsr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_accptr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_draw_bank_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_draw_bank_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_draw_branch_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_draw_branch_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_note_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_note_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_note_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_note_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_note_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_dpt_narrow_down_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_narrow_down_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_srch.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Sys(MSBHP_PayActReg p){

	}

	/**
	 * [SRCH]ステータスの[PayTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_PayTab(MSBHP_PayActReg p){

	}

	/**
	 * [SRCH]ステータスの[Pay]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Pay(MSBHP_PayActReg p){

	}

	/**
	 * [SRCH]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Note(MSBHP_PayActReg p){

	}

	/**
	 * [SRCH]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlCnd(MSBHP_PayActReg p){

	}

	/**
	 * [SRCH]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Total(MSBHP_PayActReg p){
		p.Total_pay_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_not_appl_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_com_paid_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_com_paid_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_com_paid_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_com_paid_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBHP_PayActReg p){
		p.columnDtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pay_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_pay_schd_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_pay_schd_com_paid_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_trd_cur_com_paid_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bank_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bank_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_setoff_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_setoff_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_so_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_so_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_com_paid_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_pay_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_pay_chk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pay_chk_mng_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_pay_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_appl_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bsppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bsppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_asppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_asppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_mng_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl_schd_ap_sttl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sw_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pay_ntc_d_print_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_old_pay_schd_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_old_appl_ttl_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_old_trd_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBHP_PayActReg p){
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBHP_PayActReg p){

	}

	/**
	 * [SRCH]ステータスの[PaySchdTgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_PaySchdTgt(MSBHP_PayActReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBHP_PayActReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBHP_PayActReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_pay_act_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_pay_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBHP_PayActReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBHP_PayActReg p){
		p.Hdr_pay_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_pay_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_pay_act_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_pay_basis_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
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
		p.Hdr_psppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_psppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_psppl_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_base_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ap_sttl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_ap_sttl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bank_ac_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_bank_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_bank_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_ap_setoff_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_setoff_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_setoff_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_so_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_so_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_note_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_note_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_note_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_draw_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_note_days.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_due_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_drawer_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_endrsr.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_accptr.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_draw_bank_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_draw_bank_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_draw_branch_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_draw_branch_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_note_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_note_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_note_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_note_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_note_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_dpt_narrow_down_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_ap_sttl_narrow_down_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_schd_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Sys(MSBHP_PayActReg p){

	}

	/**
	 * [UPD]ステータスの[PayTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_PayTab(MSBHP_PayActReg p){

	}

	/**
	 * [UPD]ステータスの[Pay]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Pay(MSBHP_PayActReg p){

	}

	/**
	 * [UPD]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Note(MSBHP_PayActReg p){

	}

	/**
	 * [UPD]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlCnd(MSBHP_PayActReg p){

	}

	/**
	 * [UPD]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Total(MSBHP_PayActReg p){
		p.Total_pay_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.ENABLE);
		p.Total_not_appl_bal_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_com_paid_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_com_paid_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_com_paid_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_com_paid_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBHP_PayActReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ap_sttl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ap_sttl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pay_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_pay_schd_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_pay_schd_com_paid_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.columnDtl_trd_cur_com_paid_tax_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_trd_cur_com_paid_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_rate.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_trd_cur_com_paid_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bank_ac_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bank_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_pay_bank_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ap_setoff_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_setoff_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_setoff_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_so_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_so_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_com_paid_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_pay_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pay_chk_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pay_chk_mng_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pay_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ap_appl_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bsppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bsppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ap_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ap_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_mng_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl_schd_ap_sttl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sw_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pay_ntc_d_print_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_intr_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_old_pay_schd_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_old_appl_ttl_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_old_trd_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBHP_PayActReg p){
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBHP_PayActReg p){

	}

	/**
	 * [UPD]ステータスの[PaySchdTgt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_PaySchdTgt(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBHP_PayActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_pay_act_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_pay_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBHP_PayActReg p){
		p.Hdr_pay_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_pay_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_pay_act_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_pay_basis_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
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
		p.Hdr_psppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_psppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_psppl_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_xrate_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ap_sttl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bank_ac_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bank_ac_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_setoff_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_setoff_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_so_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_so_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_note_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_note_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_note_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_draw_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_note_days.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_due_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_drawer_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_endrsr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_accptr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_draw_bank_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_draw_bank_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_draw_branch_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_draw_branch_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_note_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_note_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_note_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_note_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_note_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_pay_dpt_narrow_down_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_narrow_down_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_pay_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_srch.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Sys(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_U]ステータスの[PayTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_PayTab(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Pay]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Pay(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Note(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_U]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DtlCnd(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Total(MSBHP_PayActReg p){
		p.Total_pay_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_not_appl_bal_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_com_paid_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_com_paid_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_com_paid_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_com_paid_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBHP_PayActReg p){
		p.columnDtl_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pay_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_pay_schd_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_pay_schd_com_paid_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_trd_cur_com_paid_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bank_ac_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bank_ac_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_setoff_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_setoff_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_so_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_so_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_com_paid_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_pay_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_pay_chk_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pay_chk_mng_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_pay_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ap_appl_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bsppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bsppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_asppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_asppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ap_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ap_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_mng_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl_schd_ap_sttl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sw_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pay_ntc_d_print_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_old_pay_schd_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_old_appl_ttl_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_old_trd_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBHP_PayActReg p){
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_U]ステータスの[PaySchdTgt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_PaySchdTgt(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBHP_PayActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_pay_act_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_pay_act_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBHP_PayActReg p){
		p.Hdr_pay_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_pay_act_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_pay_act_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_pay_basis_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
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
		p.Hdr_psppl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_psppl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_psppl_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_xrate_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ap_sttl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bank_ac_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bank_ac_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_setoff_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_setoff_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_so_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_so_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_note_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_note_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_note_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_draw_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_note_days.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_due_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_drawer_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_endrsr.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_accptr.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_draw_bank_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_draw_bank_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_draw_branch_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_draw_branch_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_note_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_note_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_note_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_note_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_note_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_pay_dpt_narrow_down_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_narrow_down_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_pay_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_srch.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Sys(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_D]ステータスの[PayTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_PayTab(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Pay]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Pay(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Note(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_D]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_DtlCnd(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Total(MSBHP_PayActReg p){
		p.Total_pay_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_not_appl_bal_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_com_paid_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_com_paid_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_com_paid_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_com_paid_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MSBHP_PayActReg p){
		p.columnDtl_check.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_pay_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_pay_schd_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_pay_schd_com_paid_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_rate.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_trd_cur_com_paid_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bank_ac_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bank_ac_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_setoff_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_setoff_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_so_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_so_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_com_paid_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_pay_act_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_pay_chk_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_pay_chk_mng_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_pay_schd_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ap_appl_schd_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bsppl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bsppl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_asppl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_asppl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ap_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ap_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_mng_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl_schd_ap_sttl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sw_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_pay_ntc_d_print_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_old_pay_schd_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_old_appl_ttl_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_old_trd_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBHP_PayActReg p){
		p.Btn_select_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_D]ステータスの[PaySchdTgt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_PaySchdTgt(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBHP_PayActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_pay_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_pay_act_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBHP_PayActReg p){
		p.Hdr_pay_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pay_act_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pay_act_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pay_basis_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
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
		p.Hdr_psppl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_psppl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_psppl_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_xrate_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ap_sttl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_bank_ac_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_bank_ac_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_setoff_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_setoff_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_so_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_so_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_note_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_note_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_note_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_draw_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_note_days.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_due_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_drawer_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_endrsr.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_accptr.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_draw_bank_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_draw_bank_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_draw_branch_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_draw_branch_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_note_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_note_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_note_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_note_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_note_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pay_dpt_narrow_down_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_narrow_down_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pay_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_srch.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Sys(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_I]ステータスの[PayTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_PayTab(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Pay]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Pay(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Note(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_I]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_DtlCnd(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Total(MSBHP_PayActReg p){
		p.Total_pay_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_not_appl_bal_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_com_paid_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_com_paid_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_com_paid_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_com_paid_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl(MSBHP_PayActReg p){
		p.columnDtl_check.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_pay_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_pay_schd_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_pay_schd_com_paid_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_rate.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_trd_cur_com_paid_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bank_ac_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bank_ac_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_setoff_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_setoff_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_so_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_so_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_com_paid_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_pay_act_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_pay_chk_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_pay_chk_mng_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_pay_schd_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ap_appl_schd_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bsppl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bsppl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_asppl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_asppl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ap_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ap_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_mng_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl_schd_ap_sttl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sw_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_pay_ntc_d_print_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_old_pay_schd_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_old_appl_ttl_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_old_trd_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBHP_PayActReg p){
		p.Btn_select_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBHP_PayActReg p){

	}

	/**
	 * [FIX_I]ステータスの[PaySchdTgt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_PaySchdTgt(MSBHP_PayActReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBHP_PayActReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBHP_PayActReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_pay_act_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_pay_act_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBHP_PayActReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBHP_PayActReg p){
		p.Hdr_pay_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pay_act_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pay_act_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pay_basis_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
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
		p.Hdr_psppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_psppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_psppl_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_xrate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ap_sttl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bank_ac_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bank_ac_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_setoff_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_setoff_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_so_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_so_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_note_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_note_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_note_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_draw_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_note_days.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_due_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_drawer_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_endrsr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_accptr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_draw_bank_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_draw_bank_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_draw_branch_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_draw_branch_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_note_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_note_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_note_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_note_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_note_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pay_dpt_narrow_down_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_narrow_down_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pay_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_srch.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Sys(MSBHP_PayActReg p){

	}

	/**
	 * [DEL]ステータスの[PayTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_PayTab(MSBHP_PayActReg p){

	}

	/**
	 * [DEL]ステータスの[Pay]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Pay(MSBHP_PayActReg p){

	}

	/**
	 * [DEL]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Note(MSBHP_PayActReg p){

	}

	/**
	 * [DEL]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlCnd(MSBHP_PayActReg p){

	}

	/**
	 * [DEL]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Total(MSBHP_PayActReg p){
		p.Total_pay_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_not_appl_bal_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_com_paid_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_com_paid_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_com_paid_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_com_paid_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBHP_PayActReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pay_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_pay_schd_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_pay_schd_com_paid_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_trd_cur_com_paid_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bank_ac_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bank_ac_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_setoff_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_setoff_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_so_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_so_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_com_paid_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_pay_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_pay_chk_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pay_chk_mng_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_pay_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_appl_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bsppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bsppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_asppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_asppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_mng_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl_schd_ap_sttl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sw_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pay_ntc_d_print_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_old_pay_schd_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_old_appl_ttl_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_old_trd_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBHP_PayActReg p){
		p.Btn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBHP_PayActReg p){

	}

	/**
	 * [DEL]ステータスの[PaySchdTgt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_PaySchdTgt(MSBHP_PayActReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBHP_PayActReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBHP_PayActReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_pay_act_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_pay_act_rev.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_latest_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBHP_PayActReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBHP_PayActReg p){
		p.Hdr_pay_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_act_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_act_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_basis_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
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
		p.Hdr_psppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_psppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_psppl_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ap_sttl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_setoff_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_setoff_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_so_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_so_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_note_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_note_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_note_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_draw_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_note_days.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_due_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_drawer_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_endrsr.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_accptr.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_draw_bank_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_draw_bank_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_draw_branch_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_draw_branch_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_note_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_note_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_note_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_note_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_note_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_dpt_narrow_down_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ap_sttl_narrow_down_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_srch.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitREF_Sys(MSBHP_PayActReg p){

	}

	/**
	 * [REF]ステータスの[PayTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_PayTab(MSBHP_PayActReg p){

	}

	/**
	 * [REF]ステータスの[Pay]ブロックのモードの設定
	 */
	protected static void statusInitREF_Pay(MSBHP_PayActReg p){

	}

	/**
	 * [REF]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitREF_Note(MSBHP_PayActReg p){

	}

	/**
	 * [REF]ステータスの[DtlCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlCnd(MSBHP_PayActReg p){

	}

	/**
	 * [REF]ステータスの[Total]ブロックのモードの設定
	 */
	protected static void statusInitREF_Total(MSBHP_PayActReg p){
		p.Total_pay_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_not_appl_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_com_paid_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_s_com_paid_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_com_paid_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Total_ttl_a_com_paid_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBHP_PayActReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pay_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_pay_schd_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_pay_schd_com_paid_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_appl_ttl_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_com_paid_tax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_trd_cur_com_paid_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_setoff_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_setoff_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_so_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_so_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_com_paid_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_pay_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pay_chk_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pay_chk_mng_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pay_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_appl_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bsppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bsppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_mng_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl_schd_ap_sttl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_schd_ap_sttl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sw_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pay_ntc_d_print_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_old_pay_schd_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_old_appl_ttl_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_old_trd_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBHP_PayActReg p){
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_ins.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBHP_PayActReg p){

	}

	/**
	 * [REF]ステータスの[PaySchdTgt]ブロックのモードの設定
	 */
	protected static void statusInitREF_PaySchdTgt(MSBHP_PayActReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return INS_SRCH;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBHP_PayActReg_MC.setTableConfigDtl((MSBHP_PayActReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBHP_PayActReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_ap_sttl_cd.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.ap_sttl_cd_META);
		p.columnDtl_ap_sttl_cd.addLinkBeans(p.columnDtl_ap_sttl_nm,p.columnDtl_ap_sttl_typ,p.columnDtl_ap_setoff_typ);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_sttl_cd);
		p.columnDtl_ap_sttl_nm.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.ap_sttl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_sttl_nm);
		p.columnDtl_ap_sttl_typ.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.ap_sttl_typ_META);
		p.columnDtl_ap_sttl_typ.addLinkBeans(p.columnDtl_ap_sttl_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_sttl_typ);
		p.columnDtl_ap_sttl_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.ap_sttl_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_sttl_typ_nm);
		p.columnDtl_pay_schd_dt.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.pay_schd_dt_META);
		p.columnDtl_pay_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_schd_dt);
		p.DtlTable.addTable(p.Dtl_pay_schd_amt_p_PPanel.AmtTable);
		p.Dtl_pay_schd_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.DtlTable.addTable(p.Dtl_pay_schd_com_paid_tax_amt_p_PPanel.AmtTable);
		p.Dtl_pay_schd_com_paid_tax_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.DtlTable.addTable(p.Dtl_appl_ttl_amt_p_PPanel.AmtTable);
		p.Dtl_appl_ttl_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.DtlTable.addTable(p.Dtl_trd_cur_amt_p_PPanel.AmtTable);
		p.Dtl_trd_cur_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.columnDtl_trd_cur_com_paid_tax_cd.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.trd_cur_com_paid_tax_cd_META);
		p.columnDtl_trd_cur_com_paid_tax_cd.addLinkBeans(p.columnDtl_trd_cur_com_paid_tax_nm,p.columnDtl_trd_cur_com_paid_tax_rate);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_com_paid_tax_cd);
		p.columnDtl_trd_cur_com_paid_tax_nm.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.trd_cur_com_paid_tax_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_com_paid_tax_nm);
		p.columnDtl_trd_cur_com_paid_tax_rate.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.trd_cur_com_paid_tax_rate_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_com_paid_tax_rate);
		p.DtlTable.addTable(p.Dtl_trd_cur_com_paid_tax_amt_p_PPanel.AmtTable);
		p.Dtl_trd_cur_com_paid_tax_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.columnDtl_bank_ac_cd.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.bank_ac_cd_META);
		p.columnDtl_bank_ac_cd.addLinkBeans(p.columnDtl_bank_ac_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_bank_ac_cd);
		p.columnDtl_bank_ac_nm.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.bank_ac_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bank_ac_nm);
		p.columnDtl_pay_bank_ac_cd.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.pay_bank_ac_cd_META);
		p.columnDtl_pay_bank_ac_cd.addLinkBeans(p.columnDtl_pay_bank_ac_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_bank_ac_cd);
		p.columnDtl_pay_bank_ac_nm.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.pay_bank_ac_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_bank_ac_nm);
		p.columnDtl_ap_setoff_typ.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.ap_setoff_typ_META);
		p.columnDtl_ap_setoff_typ.addLinkBeans(p.columnDtl_ap_setoff_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_setoff_typ);
		p.columnDtl_ap_setoff_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.ap_setoff_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_setoff_typ_nm);
		p.columnDtl_setoff_cd.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.setoff_cd_META);
		p.columnDtl_setoff_cd.addLinkBeans(p.columnDtl_setoff_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_setoff_cd);
		p.columnDtl_setoff_nm.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.setoff_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_setoff_nm);
		p.columnDtl_so_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.so_dpt_cd_META);
		p.columnDtl_so_dpt_cd.setListType(MCListType.STRICT);
		p.columnDtl_so_dpt_cd.addLinkBeans(p.columnDtl_so_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_so_dpt_cd);
		p.columnDtl_so_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.so_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_so_dpt_nm);
		p.DtlTable.addTable(p.Dtl_base_cur_amt_p_PPanel.AmtTable);
		p.Dtl_base_cur_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.DtlTable.addTable(p.Dtl_base_cur_com_paid_tax_amt_p_PPanel.AmtTable);
		p.Dtl_base_cur_com_paid_tax_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.columnDtl_pay_act_d_no.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.pay_act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_act_d_no);
		p.columnDtl_disp_seq.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.disp_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_disp_seq);
		p.columnDtl_pay_chk_no.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.pay_chk_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_chk_no);
		p.columnDtl_pay_chk_mng_no.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.pay_chk_mng_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_chk_mng_no);
		p.columnDtl_pay_schd_no.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.pay_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_schd_no);
		p.columnDtl_ap_appl_schd_no.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.ap_appl_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_appl_schd_no);
		p.columnDtl_bsppl_cd.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.bsppl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bsppl_cd);
		p.columnDtl_bsppl_nm.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.bsppl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bsppl_nm);
		p.columnDtl_bsppl_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.bsppl_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bsppl_dpt_cd);
		p.columnDtl_bsppl_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.bsppl_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bsppl_dpt_nm);
		p.columnDtl_asppl_cd.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.asppl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asppl_cd);
		p.columnDtl_asppl_nm.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.asppl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asppl_nm);
		p.columnDtl_ap_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.ap_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_dpt_cd);
		p.columnDtl_ap_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.ap_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_dpt_nm);
		p.columnDtl_ap_typ.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.ap_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_typ);
		p.columnDtl_ap_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.ap_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_typ_nm);
		p.columnDtl_purc_act_no.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.purc_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_act_no);
		p.columnDtl_rcpt_iv_mng_no.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.rcpt_iv_mng_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rcpt_iv_mng_no);
		p.columnDtl_rcpt_iv_no.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.rcpt_iv_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rcpt_iv_no);
		p.DtlTable.addTable(p.Dtl_wrk_no_p_PPanel.WrkNoTable);
		p.columnDtl_schd_ap_sttl_cd.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.schd_ap_sttl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_schd_ap_sttl_cd);
		p.columnDtl_schd_ap_sttl_nm.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.schd_ap_sttl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_schd_ap_sttl_nm);
		p.columnDtl_schd_ap_sttl_typ.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.schd_ap_sttl_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_schd_ap_sttl_typ);
		p.columnDtl_schd_ap_sttl_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.schd_ap_sttl_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_schd_ap_sttl_typ_nm);
		p.columnDtl_sw_flg.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.sw_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sw_flg);
		p.columnDtl_pay_ntc_d_print_rmrks.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.pay_ntc_d_print_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_ntc_d_print_rmrks);
		p.columnDtl_trd_d_rmrks.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.trd_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_d_rmrks);
		p.columnDtl_intr_d_rmrks.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.intr_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_d_rmrks);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMSBH.MSBHP0090.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.DtlTable.addTable(p.Dtl_old_pay_schd_amt_p_PPanel.AmtTable);
		p.Dtl_old_pay_schd_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.DtlTable.addTable(p.Dtl_old_appl_ttl_amt_p_PPanel.AmtTable);
		p.Dtl_old_appl_ttl_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.DtlTable.addTable(p.Dtl_old_trd_cur_amt_p_PPanel.AmtTable);
		p.Dtl_old_trd_cur_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		Hdr_psppl_cd.getListConfig().setPutter(getHdr_psppl_cd_ListPutter());
		Hdr_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_trd_cur_cd.getListConfig().setPutter(getHdr_trd_cur_cd_ListPutter());
		Hdr_ap_sttl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_ap_sttl_cd.getListConfig().setPutter(getHdr_ap_sttl_cd_ListPutter());
		Hdr_ap_sttl_typ.getListConfig().setPutter(getHdr_ap_sttl_typ_ListPutter());
		Hdr_bank_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_bank_ac_cd.getListConfig().setPutter(getHdr_bank_ac_cd_ListPutter());
		Hdr_pay_bank_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_pay_bank_ac_cd.getListConfig().setPutter(getHdr_pay_bank_ac_cd_ListPutter());
		Hdr_ap_setoff_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_ap_setoff_typ.getListConfig().setPutter(getHdr_ap_setoff_typ_ListPutter());
		Hdr_setoff_cd.getListConfig().setPutter(getHdr_setoff_cd_ListPutter());
		Hdr_so_dpt_cd.getListConfig().setPutter(getHdr_so_dpt_cd_ListPutter());
		Hdr_note_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_note_typ.getListConfig().setPutter(getHdr_note_typ_ListPutter());
		Hdr_draw_bank_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_draw_bank_cd.getListConfig().setPutter(getHdr_draw_bank_cd_ListPutter());
		Hdr_draw_branch_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_draw_branch_cd.getListConfig().setPutter(getHdr_draw_branch_cd_ListPutter());
		Hdr_note_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_note_rsn_cd.getListConfig().setPutter(getHdr_note_rsn_cd_ListPutter());
		columnDtl_ap_sttl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ap_sttl_cd.getListConfig().setPutter(getDtl_ap_sttl_cd_ListPutter());
		columnDtl_ap_sttl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ap_sttl_typ.getListConfig().setPutter(getDtl_ap_sttl_typ_ListPutter());
		columnDtl_trd_cur_com_paid_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_trd_cur_com_paid_tax_cd.getListConfig().setPutter(getDtl_trd_cur_com_paid_tax_cd_ListPutter());
		columnDtl_bank_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bank_ac_cd.getListConfig().setPutter(getDtl_bank_ac_cd_ListPutter());
		columnDtl_pay_bank_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_pay_bank_ac_cd.getListConfig().setPutter(getDtl_pay_bank_ac_cd_ListPutter());
		columnDtl_ap_setoff_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ap_setoff_typ.getListConfig().setPutter(getDtl_ap_setoff_typ_ListPutter());
		columnDtl_setoff_cd.getListConfig().setPutter(getDtl_setoff_cd_ListPutter());
		columnDtl_so_dpt_cd.getListConfig().setPutter(getDtl_so_dpt_cd_ListPutter());
	}

	/**
	 * この画面を[INS_SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_SRCHStatus() {
		status = INS_SRCH;
		setAllStatus(status);
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (INS_SRCH.equals(status)) {
			setINS_SRCHStatus();
		}
		else if (INS.equals(status)) {
			setINSStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
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
	 * [Hdr_psppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_psppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Hdr_ap_sttl_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_ap_sttl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApSttl");
		return lp;
	}
	 
	/**
	 * [Hdr_ap_sttl_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_ap_sttl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApSttlTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_bank_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_bank_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IntBankAc");
		return lp;
	}
	 
	/**
	 * [Hdr_pay_bank_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_pay_bank_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExtBankAc");
		return lp;
	}
	 
	/**
	 * [Hdr_ap_setoff_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_ap_setoff_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApSetoffTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_setoff_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_setoff_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr_so_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_so_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Hdr_note_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_note_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NoteTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_draw_bank_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_draw_bank_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bank");
		return lp;
	}
	 
	/**
	 * [Hdr_draw_branch_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_draw_branch_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BankBranch");
		return lp;
	}
	 
	/**
	 * [Hdr_note_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_note_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NoteRsn");
		return lp;
	}
	 
	/**
	 * [Dtl_ap_sttl_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ap_sttl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApSttl");
		return lp;
	}
	 
	/**
	 * [Dtl_ap_sttl_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ap_sttl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApSttlTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_trd_cur_com_paid_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_cur_com_paid_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tax");
		return lp;
	}
	 
	/**
	 * [Dtl_bank_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bank_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IntBankAc");
		return lp;
	}
	 
	/**
	 * [Dtl_pay_bank_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_pay_bank_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExtBankAc");
		return lp;
	}
	 
	/**
	 * [Dtl_ap_setoff_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ap_setoff_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApSetoffTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_setoff_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_setoff_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl_so_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_so_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == Hdr_psppl_cd) return getHdr_psppl_cd(row, info);
		if(combo == Hdr_trd_cur_cd) return getHdr_trd_cur_cd(row, info);
		if(combo == Hdr_ap_sttl_cd) return getHdr_ap_sttl_cd(row, info);
		if(combo == Hdr_ap_sttl_typ) return getHdr_ap_sttl_typ(row, info);
		if(combo == Hdr_bank_ac_cd) return getHdr_bank_ac_cd(row, info);
		if(combo == Hdr_pay_bank_ac_cd) return getHdr_pay_bank_ac_cd(row, info);
		if(combo == Hdr_ap_setoff_typ) return getHdr_ap_setoff_typ(row, info);
		if(combo == Hdr_setoff_cd) return getHdr_setoff_cd(row, info);
		if(combo == Hdr_so_dpt_cd) return getHdr_so_dpt_cd(row, info);
		if(combo == Hdr_note_typ) return getHdr_note_typ(row, info);
		if(combo == Hdr_draw_bank_cd) return getHdr_draw_bank_cd(row, info);
		if(combo == Hdr_draw_branch_cd) return getHdr_draw_branch_cd(row, info);
		if(combo == Hdr_note_rsn_cd) return getHdr_note_rsn_cd(row, info);
		if(combo == columnDtl_ap_sttl_cd) return getDtl_ap_sttl_cd(row, info);
		if(combo == columnDtl_ap_sttl_typ) return getDtl_ap_sttl_typ(row, info);
		if(combo == columnDtl_trd_cur_com_paid_tax_cd) return getDtl_trd_cur_com_paid_tax_cd(row, info);
		if(combo == columnDtl_bank_ac_cd) return getDtl_bank_ac_cd(row, info);
		if(combo == columnDtl_pay_bank_ac_cd) return getDtl_pay_bank_ac_cd(row, info);
		if(combo == columnDtl_ap_setoff_typ) return getDtl_ap_setoff_typ(row, info);
		if(combo == columnDtl_setoff_cd) return getDtl_setoff_cd(row, info);
		if(combo == columnDtl_so_dpt_cd) return getDtl_so_dpt_cd(row, info);
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
		else if (ap == Hdr_srch) doHdr_srch(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Hdr]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doHdr_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

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
		if (vc == PayTabTab) return doPayTab_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_pay_act_no) return doCnd_pay_act_no_VC(info);
		if (vc == Cnd_pay_act_rev) return doCnd_pay_act_rev_VC(info);
		if (vc == Cnd_latest_flg) return doCnd_latest_flg_VC(info);
		if (vc == Hdr_pay_act_no) return doHdr_pay_act_no_VC(info);
		if (vc == Hdr_pay_act_rev) return doHdr_pay_act_rev_VC(info);
		if (vc == Hdr_latest_flg) return doHdr_latest_flg_VC(info);
		if (vc == Hdr_ac_ym) return doHdr_ac_ym_VC(info);
		if (vc == Hdr_pay_act_dt) return doHdr_pay_act_dt_VC(info);
		if (vc == Hdr_pay_basis_dt) return doHdr_pay_basis_dt_VC(info);
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
		if (vc == Hdr_psppl_cd) return doHdr_psppl_cd_VC(info);
		if (vc == Hdr_psppl_nm) return doHdr_psppl_nm_VC(info);
		if (vc == Hdr_psppl_rmrks) return doHdr_psppl_rmrks_VC(info);
		if (vc == Hdr_trd_cur_cd) return doHdr_trd_cur_cd_VC(info);
		if (vc == Hdr_trd_cur_nm) return doHdr_trd_cur_nm_VC(info);
		if (vc == Hdr_trd_cur_amt_dec_place) return doHdr_trd_cur_amt_dec_place_VC(info);
		if (vc == Hdr_base_cur_cd) return doHdr_base_cur_cd_VC(info);
		if (vc == Hdr_base_cur_nm) return doHdr_base_cur_nm_VC(info);
		if (vc == Hdr_base_cur_amt_dec_place) return doHdr_base_cur_amt_dec_place_VC(info);
		if (vc == Hdr_xrate_cd) return doHdr_xrate_cd_VC(info);
		if (vc == Hdr_ap_sttl_cd) return doHdr_ap_sttl_cd_VC(info);
		if (vc == Hdr_ap_sttl_nm) return doHdr_ap_sttl_nm_VC(info);
		if (vc == Hdr_ap_sttl_typ) return doHdr_ap_sttl_typ_VC(info);
		if (vc == Hdr_ap_sttl_typ_nm) return doHdr_ap_sttl_typ_nm_VC(info);
		if (vc == Hdr_bank_ac_cd) return doHdr_bank_ac_cd_VC(info);
		if (vc == Hdr_bank_ac_nm) return doHdr_bank_ac_nm_VC(info);
		if (vc == Hdr_pay_bank_ac_cd) return doHdr_pay_bank_ac_cd_VC(info);
		if (vc == Hdr_pay_bank_ac_nm) return doHdr_pay_bank_ac_nm_VC(info);
		if (vc == Hdr_ap_setoff_typ) return doHdr_ap_setoff_typ_VC(info);
		if (vc == Hdr_ap_setoff_typ_nm) return doHdr_ap_setoff_typ_nm_VC(info);
		if (vc == Hdr_setoff_cd) return doHdr_setoff_cd_VC(info);
		if (vc == Hdr_setoff_nm) return doHdr_setoff_nm_VC(info);
		if (vc == Hdr_so_dpt_cd) return doHdr_so_dpt_cd_VC(info);
		if (vc == Hdr_so_dpt_nm) return doHdr_so_dpt_nm_VC(info);
		if (vc == Hdr_trd_rmrks) return doHdr_trd_rmrks_VC(info);
		if (vc == Hdr_intr_rmrks) return doHdr_intr_rmrks_VC(info);
		if (vc == Hdr_sub_char1) return doHdr_sub_char1_VC(info);
		if (vc == Hdr_sub_char2) return doHdr_sub_char2_VC(info);
		if (vc == Hdr_sub_char3) return doHdr_sub_char3_VC(info);
		if (vc == Hdr_note_no) return doHdr_note_no_VC(info);
		if (vc == Hdr_note_typ) return doHdr_note_typ_VC(info);
		if (vc == Hdr_note_typ_nm) return doHdr_note_typ_nm_VC(info);
		if (vc == Hdr_draw_dt) return doHdr_draw_dt_VC(info);
		if (vc == Hdr_note_days) return doHdr_note_days_VC(info);
		if (vc == Hdr_due_dt) return doHdr_due_dt_VC(info);
		if (vc == Hdr_drawer_nm) return doHdr_drawer_nm_VC(info);
		if (vc == Hdr_endrsr) return doHdr_endrsr_VC(info);
		if (vc == Hdr_accptr) return doHdr_accptr_VC(info);
		if (vc == Hdr_draw_bank_cd) return doHdr_draw_bank_cd_VC(info);
		if (vc == Hdr_draw_bank_nm) return doHdr_draw_bank_nm_VC(info);
		if (vc == Hdr_draw_branch_cd) return doHdr_draw_branch_cd_VC(info);
		if (vc == Hdr_draw_branch_nm) return doHdr_draw_branch_nm_VC(info);
		if (vc == Hdr_note_rsn_cd) return doHdr_note_rsn_cd_VC(info);
		if (vc == Hdr_note_rsn_nm) return doHdr_note_rsn_nm_VC(info);
		if (vc == Hdr_note_sub_char1) return doHdr_note_sub_char1_VC(info);
		if (vc == Hdr_note_sub_char2) return doHdr_note_sub_char2_VC(info);
		if (vc == Hdr_note_sub_char3) return doHdr_note_sub_char3_VC(info);
		if (vc == Hdr_pay_dpt_narrow_down_flg) return doHdr_pay_dpt_narrow_down_flg_VC(info);
		if (vc == Hdr_ap_sttl_narrow_down_flg) return doHdr_ap_sttl_narrow_down_flg_VC(info);
		if (vc == Hdr_pay_schd_dt) return doHdr_pay_schd_dt_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_ap_sttl_cd) return doDtl_ap_sttl_cd_VC(info);
		if (vc == columnDtl_ap_sttl_nm) return doDtl_ap_sttl_nm_VC(info);
		if (vc == columnDtl_ap_sttl_typ) return doDtl_ap_sttl_typ_VC(info);
		if (vc == columnDtl_ap_sttl_typ_nm) return doDtl_ap_sttl_typ_nm_VC(info);
		if (vc == columnDtl_pay_schd_dt) return doDtl_pay_schd_dt_VC(info);
		if (vc == columnDtl_trd_cur_com_paid_tax_cd) return doDtl_trd_cur_com_paid_tax_cd_VC(info);
		if (vc == columnDtl_trd_cur_com_paid_tax_nm) return doDtl_trd_cur_com_paid_tax_nm_VC(info);
		if (vc == columnDtl_trd_cur_com_paid_tax_rate) return doDtl_trd_cur_com_paid_tax_rate_VC(info);
		if (vc == columnDtl_bank_ac_cd) return doDtl_bank_ac_cd_VC(info);
		if (vc == columnDtl_bank_ac_nm) return doDtl_bank_ac_nm_VC(info);
		if (vc == columnDtl_pay_bank_ac_cd) return doDtl_pay_bank_ac_cd_VC(info);
		if (vc == columnDtl_pay_bank_ac_nm) return doDtl_pay_bank_ac_nm_VC(info);
		if (vc == columnDtl_ap_setoff_typ) return doDtl_ap_setoff_typ_VC(info);
		if (vc == columnDtl_ap_setoff_typ_nm) return doDtl_ap_setoff_typ_nm_VC(info);
		if (vc == columnDtl_setoff_cd) return doDtl_setoff_cd_VC(info);
		if (vc == columnDtl_setoff_nm) return doDtl_setoff_nm_VC(info);
		if (vc == columnDtl_so_dpt_cd) return doDtl_so_dpt_cd_VC(info);
		if (vc == columnDtl_so_dpt_nm) return doDtl_so_dpt_nm_VC(info);
		if (vc == columnDtl_pay_act_d_no) return doDtl_pay_act_d_no_VC(info);
		if (vc == columnDtl_disp_seq) return doDtl_disp_seq_VC(info);
		if (vc == columnDtl_pay_chk_no) return doDtl_pay_chk_no_VC(info);
		if (vc == columnDtl_pay_chk_mng_no) return doDtl_pay_chk_mng_no_VC(info);
		if (vc == columnDtl_pay_schd_no) return doDtl_pay_schd_no_VC(info);
		if (vc == columnDtl_ap_appl_schd_no) return doDtl_ap_appl_schd_no_VC(info);
		if (vc == columnDtl_bsppl_cd) return doDtl_bsppl_cd_VC(info);
		if (vc == columnDtl_bsppl_nm) return doDtl_bsppl_nm_VC(info);
		if (vc == columnDtl_bsppl_dpt_cd) return doDtl_bsppl_dpt_cd_VC(info);
		if (vc == columnDtl_bsppl_dpt_nm) return doDtl_bsppl_dpt_nm_VC(info);
		if (vc == columnDtl_asppl_cd) return doDtl_asppl_cd_VC(info);
		if (vc == columnDtl_asppl_nm) return doDtl_asppl_nm_VC(info);
		if (vc == columnDtl_ap_dpt_cd) return doDtl_ap_dpt_cd_VC(info);
		if (vc == columnDtl_ap_dpt_nm) return doDtl_ap_dpt_nm_VC(info);
		if (vc == columnDtl_ap_typ) return doDtl_ap_typ_VC(info);
		if (vc == columnDtl_ap_typ_nm) return doDtl_ap_typ_nm_VC(info);
		if (vc == columnDtl_purc_act_no) return doDtl_purc_act_no_VC(info);
		if (vc == columnDtl_rcpt_iv_mng_no) return doDtl_rcpt_iv_mng_no_VC(info);
		if (vc == columnDtl_rcpt_iv_no) return doDtl_rcpt_iv_no_VC(info);
		if (vc == columnDtl_schd_ap_sttl_cd) return doDtl_schd_ap_sttl_cd_VC(info);
		if (vc == columnDtl_schd_ap_sttl_nm) return doDtl_schd_ap_sttl_nm_VC(info);
		if (vc == columnDtl_schd_ap_sttl_typ) return doDtl_schd_ap_sttl_typ_VC(info);
		if (vc == columnDtl_schd_ap_sttl_typ_nm) return doDtl_schd_ap_sttl_typ_nm_VC(info);
		if (vc == columnDtl_sw_flg) return doDtl_sw_flg_VC(info);
		if (vc == columnDtl_pay_ntc_d_print_rmrks) return doDtl_pay_ntc_d_print_rmrks_VC(info);
		if (vc == columnDtl_trd_d_rmrks) return doDtl_trd_d_rmrks_VC(info);
		if (vc == columnDtl_intr_d_rmrks) return doDtl_intr_d_rmrks_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
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
	 * [PayTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doPayTab_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_act_rev_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[pay_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_act_rev_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_act_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_basis_dt_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[psppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_psppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[psppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_psppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[psppl_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_psppl_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[base_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_base_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ap_sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ap_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ap_sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ap_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ap_sttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ap_sttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ap_sttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ap_sttl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ap_setoff_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ap_setoff_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ap_setoff_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ap_setoff_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[setoff_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_setoff_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[setoff_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_setoff_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[so_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_so_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[so_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_so_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[note_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_note_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[note_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_note_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[note_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_note_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[draw_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_draw_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[note_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_note_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[due_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_due_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[drawer_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_drawer_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[endrsr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_endrsr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[accptr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_accptr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[draw_bank_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_draw_bank_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[draw_bank_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_draw_bank_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[draw_branch_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_draw_branch_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[draw_branch_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_draw_branch_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[note_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_note_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[note_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_note_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[note_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_note_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[note_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_note_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[note_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_note_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_dpt_narrow_down_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_dpt_narrow_down_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ap_sttl_narrow_down_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ap_sttl_narrow_down_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_schd_dt_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ap_sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_sttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_sttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_sttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_sttl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cur_com_paid_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cur_com_paid_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cur_com_paid_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cur_com_paid_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cur_com_paid_tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cur_com_paid_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_setoff_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_setoff_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_setoff_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_setoff_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[setoff_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_setoff_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[setoff_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_setoff_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[so_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_so_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[so_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_so_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_chk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_chk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_chk_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_chk_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_appl_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_appl_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bsppl_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bsppl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcpt_iv_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcpt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[schd_ap_sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_schd_ap_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[schd_ap_sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_schd_ap_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[schd_ap_sttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_schd_ap_sttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[schd_ap_sttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_schd_ap_sttl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sw_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sw_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_ntc_d_print_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_ntc_d_print_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char3_VC(MCEventInfo info){
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
		else if (nc == PayTabTab) doPayTab_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_pay_act_no) doCnd_pay_act_no_NC(info);
		else if (nc == Cnd_pay_act_rev) doCnd_pay_act_rev_NC(info);
		else if (nc == Cnd_latest_flg) doCnd_latest_flg_NC(info);
		else if (nc == Hdr_pay_act_no) doHdr_pay_act_no_NC(info);
		else if (nc == Hdr_pay_act_rev) doHdr_pay_act_rev_NC(info);
		else if (nc == Hdr_latest_flg) doHdr_latest_flg_NC(info);
		else if (nc == Hdr_ac_ym) doHdr_ac_ym_NC(info);
		else if (nc == Hdr_pay_act_dt) doHdr_pay_act_dt_NC(info);
		else if (nc == Hdr_pay_basis_dt) doHdr_pay_basis_dt_NC(info);
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
		else if (nc == Hdr_psppl_cd) doHdr_psppl_cd_NC(info);
		else if (nc == Hdr_psppl_nm) doHdr_psppl_nm_NC(info);
		else if (nc == Hdr_psppl_rmrks) doHdr_psppl_rmrks_NC(info);
		else if (nc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NC(info);
		else if (nc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NC(info);
		else if (nc == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_NC(info);
		else if (nc == Hdr_base_cur_cd) doHdr_base_cur_cd_NC(info);
		else if (nc == Hdr_base_cur_nm) doHdr_base_cur_nm_NC(info);
		else if (nc == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_NC(info);
		else if (nc == Hdr_xrate_cd) doHdr_xrate_cd_NC(info);
		else if (nc == Hdr_ap_sttl_cd) doHdr_ap_sttl_cd_NC(info);
		else if (nc == Hdr_ap_sttl_nm) doHdr_ap_sttl_nm_NC(info);
		else if (nc == Hdr_ap_sttl_typ) doHdr_ap_sttl_typ_NC(info);
		else if (nc == Hdr_ap_sttl_typ_nm) doHdr_ap_sttl_typ_nm_NC(info);
		else if (nc == Hdr_bank_ac_cd) doHdr_bank_ac_cd_NC(info);
		else if (nc == Hdr_bank_ac_nm) doHdr_bank_ac_nm_NC(info);
		else if (nc == Hdr_pay_bank_ac_cd) doHdr_pay_bank_ac_cd_NC(info);
		else if (nc == Hdr_pay_bank_ac_nm) doHdr_pay_bank_ac_nm_NC(info);
		else if (nc == Hdr_ap_setoff_typ) doHdr_ap_setoff_typ_NC(info);
		else if (nc == Hdr_ap_setoff_typ_nm) doHdr_ap_setoff_typ_nm_NC(info);
		else if (nc == Hdr_setoff_cd) doHdr_setoff_cd_NC(info);
		else if (nc == Hdr_setoff_nm) doHdr_setoff_nm_NC(info);
		else if (nc == Hdr_so_dpt_cd) doHdr_so_dpt_cd_NC(info);
		else if (nc == Hdr_so_dpt_nm) doHdr_so_dpt_nm_NC(info);
		else if (nc == Hdr_trd_rmrks) doHdr_trd_rmrks_NC(info);
		else if (nc == Hdr_intr_rmrks) doHdr_intr_rmrks_NC(info);
		else if (nc == Hdr_sub_char1) doHdr_sub_char1_NC(info);
		else if (nc == Hdr_sub_char2) doHdr_sub_char2_NC(info);
		else if (nc == Hdr_sub_char3) doHdr_sub_char3_NC(info);
		else if (nc == Hdr_note_no) doHdr_note_no_NC(info);
		else if (nc == Hdr_note_typ) doHdr_note_typ_NC(info);
		else if (nc == Hdr_note_typ_nm) doHdr_note_typ_nm_NC(info);
		else if (nc == Hdr_draw_dt) doHdr_draw_dt_NC(info);
		else if (nc == Hdr_note_days) doHdr_note_days_NC(info);
		else if (nc == Hdr_due_dt) doHdr_due_dt_NC(info);
		else if (nc == Hdr_drawer_nm) doHdr_drawer_nm_NC(info);
		else if (nc == Hdr_endrsr) doHdr_endrsr_NC(info);
		else if (nc == Hdr_accptr) doHdr_accptr_NC(info);
		else if (nc == Hdr_draw_bank_cd) doHdr_draw_bank_cd_NC(info);
		else if (nc == Hdr_draw_bank_nm) doHdr_draw_bank_nm_NC(info);
		else if (nc == Hdr_draw_branch_cd) doHdr_draw_branch_cd_NC(info);
		else if (nc == Hdr_draw_branch_nm) doHdr_draw_branch_nm_NC(info);
		else if (nc == Hdr_note_rsn_cd) doHdr_note_rsn_cd_NC(info);
		else if (nc == Hdr_note_rsn_nm) doHdr_note_rsn_nm_NC(info);
		else if (nc == Hdr_note_sub_char1) doHdr_note_sub_char1_NC(info);
		else if (nc == Hdr_note_sub_char2) doHdr_note_sub_char2_NC(info);
		else if (nc == Hdr_note_sub_char3) doHdr_note_sub_char3_NC(info);
		else if (nc == Hdr_pay_dpt_narrow_down_flg) doHdr_pay_dpt_narrow_down_flg_NC(info);
		else if (nc == Hdr_ap_sttl_narrow_down_flg) doHdr_ap_sttl_narrow_down_flg_NC(info);
		else if (nc == Hdr_pay_schd_dt) doHdr_pay_schd_dt_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_ap_sttl_cd) doDtl_ap_sttl_cd_NC(info);
		else if (nc == columnDtl_ap_sttl_nm) doDtl_ap_sttl_nm_NC(info);
		else if (nc == columnDtl_ap_sttl_typ) doDtl_ap_sttl_typ_NC(info);
		else if (nc == columnDtl_ap_sttl_typ_nm) doDtl_ap_sttl_typ_nm_NC(info);
		else if (nc == columnDtl_pay_schd_dt) doDtl_pay_schd_dt_NC(info);
		else if (nc == columnDtl_trd_cur_com_paid_tax_cd) doDtl_trd_cur_com_paid_tax_cd_NC(info);
		else if (nc == columnDtl_trd_cur_com_paid_tax_nm) doDtl_trd_cur_com_paid_tax_nm_NC(info);
		else if (nc == columnDtl_trd_cur_com_paid_tax_rate) doDtl_trd_cur_com_paid_tax_rate_NC(info);
		else if (nc == columnDtl_bank_ac_cd) doDtl_bank_ac_cd_NC(info);
		else if (nc == columnDtl_bank_ac_nm) doDtl_bank_ac_nm_NC(info);
		else if (nc == columnDtl_pay_bank_ac_cd) doDtl_pay_bank_ac_cd_NC(info);
		else if (nc == columnDtl_pay_bank_ac_nm) doDtl_pay_bank_ac_nm_NC(info);
		else if (nc == columnDtl_ap_setoff_typ) doDtl_ap_setoff_typ_NC(info);
		else if (nc == columnDtl_ap_setoff_typ_nm) doDtl_ap_setoff_typ_nm_NC(info);
		else if (nc == columnDtl_setoff_cd) doDtl_setoff_cd_NC(info);
		else if (nc == columnDtl_setoff_nm) doDtl_setoff_nm_NC(info);
		else if (nc == columnDtl_so_dpt_cd) doDtl_so_dpt_cd_NC(info);
		else if (nc == columnDtl_so_dpt_nm) doDtl_so_dpt_nm_NC(info);
		else if (nc == columnDtl_pay_act_d_no) doDtl_pay_act_d_no_NC(info);
		else if (nc == columnDtl_disp_seq) doDtl_disp_seq_NC(info);
		else if (nc == columnDtl_pay_chk_no) doDtl_pay_chk_no_NC(info);
		else if (nc == columnDtl_pay_chk_mng_no) doDtl_pay_chk_mng_no_NC(info);
		else if (nc == columnDtl_pay_schd_no) doDtl_pay_schd_no_NC(info);
		else if (nc == columnDtl_ap_appl_schd_no) doDtl_ap_appl_schd_no_NC(info);
		else if (nc == columnDtl_bsppl_cd) doDtl_bsppl_cd_NC(info);
		else if (nc == columnDtl_bsppl_nm) doDtl_bsppl_nm_NC(info);
		else if (nc == columnDtl_bsppl_dpt_cd) doDtl_bsppl_dpt_cd_NC(info);
		else if (nc == columnDtl_bsppl_dpt_nm) doDtl_bsppl_dpt_nm_NC(info);
		else if (nc == columnDtl_asppl_cd) doDtl_asppl_cd_NC(info);
		else if (nc == columnDtl_asppl_nm) doDtl_asppl_nm_NC(info);
		else if (nc == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_NC(info);
		else if (nc == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_NC(info);
		else if (nc == columnDtl_ap_typ) doDtl_ap_typ_NC(info);
		else if (nc == columnDtl_ap_typ_nm) doDtl_ap_typ_nm_NC(info);
		else if (nc == columnDtl_purc_act_no) doDtl_purc_act_no_NC(info);
		else if (nc == columnDtl_rcpt_iv_mng_no) doDtl_rcpt_iv_mng_no_NC(info);
		else if (nc == columnDtl_rcpt_iv_no) doDtl_rcpt_iv_no_NC(info);
		else if (nc == columnDtl_schd_ap_sttl_cd) doDtl_schd_ap_sttl_cd_NC(info);
		else if (nc == columnDtl_schd_ap_sttl_nm) doDtl_schd_ap_sttl_nm_NC(info);
		else if (nc == columnDtl_schd_ap_sttl_typ) doDtl_schd_ap_sttl_typ_NC(info);
		else if (nc == columnDtl_schd_ap_sttl_typ_nm) doDtl_schd_ap_sttl_typ_nm_NC(info);
		else if (nc == columnDtl_sw_flg) doDtl_sw_flg_NC(info);
		else if (nc == columnDtl_pay_ntc_d_print_rmrks) doDtl_pay_ntc_d_print_rmrks_NC(info);
		else if (nc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NC(info);
		else if (nc == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NC(MCEventInfo info){
	}

	/**
	 * [PayTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPayTab_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_act_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_basis_dt_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[psppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_sttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_sttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_sttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_sttl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_setoff_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_setoff_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_setoff_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_setoff_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[setoff_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_setoff_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[setoff_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_setoff_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[so_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_so_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[so_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_so_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[draw_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_draw_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_days_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[due_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_due_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[drawer_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_drawer_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[endrsr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_endrsr_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[accptr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_accptr_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[draw_bank_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_draw_bank_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[draw_bank_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_draw_bank_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[draw_branch_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_draw_branch_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[draw_branch_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_draw_branch_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_dpt_narrow_down_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_dpt_narrow_down_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_sttl_narrow_down_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_sttl_narrow_down_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_com_paid_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_com_paid_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_com_paid_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_com_paid_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_com_paid_tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_com_paid_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_setoff_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_setoff_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_setoff_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_setoff_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[setoff_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_setoff_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[setoff_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_setoff_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[so_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_so_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[so_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_so_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_chk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_chk_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_chk_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_chk_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_appl_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_appl_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_ap_sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_ap_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_ap_sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_ap_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_ap_sttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_ap_sttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_ap_sttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_ap_sttl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sw_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sw_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_ntc_d_print_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_ntc_d_print_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NC(MCEventInfo info){
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
		else if (ne == PayTabTab) doPayTab_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_pay_act_no) doCnd_pay_act_no_NE(info);
		else if (ne == Cnd_pay_act_rev) doCnd_pay_act_rev_NE(info);
		else if (ne == Cnd_latest_flg) doCnd_latest_flg_NE(info);
		else if (ne == Hdr_pay_act_no) doHdr_pay_act_no_NE(info);
		else if (ne == Hdr_pay_act_rev) doHdr_pay_act_rev_NE(info);
		else if (ne == Hdr_latest_flg) doHdr_latest_flg_NE(info);
		else if (ne == Hdr_ac_ym) doHdr_ac_ym_NE(info);
		else if (ne == Hdr_pay_act_dt) doHdr_pay_act_dt_NE(info);
		else if (ne == Hdr_pay_basis_dt) doHdr_pay_basis_dt_NE(info);
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
		else if (ne == Hdr_psppl_cd) doHdr_psppl_cd_NE(info);
		else if (ne == Hdr_psppl_nm) doHdr_psppl_nm_NE(info);
		else if (ne == Hdr_psppl_rmrks) doHdr_psppl_rmrks_NE(info);
		else if (ne == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NE(info);
		else if (ne == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NE(info);
		else if (ne == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_NE(info);
		else if (ne == Hdr_base_cur_cd) doHdr_base_cur_cd_NE(info);
		else if (ne == Hdr_base_cur_nm) doHdr_base_cur_nm_NE(info);
		else if (ne == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_NE(info);
		else if (ne == Hdr_xrate_cd) doHdr_xrate_cd_NE(info);
		else if (ne == Hdr_ap_sttl_cd) doHdr_ap_sttl_cd_NE(info);
		else if (ne == Hdr_ap_sttl_nm) doHdr_ap_sttl_nm_NE(info);
		else if (ne == Hdr_ap_sttl_typ) doHdr_ap_sttl_typ_NE(info);
		else if (ne == Hdr_ap_sttl_typ_nm) doHdr_ap_sttl_typ_nm_NE(info);
		else if (ne == Hdr_bank_ac_cd) doHdr_bank_ac_cd_NE(info);
		else if (ne == Hdr_bank_ac_nm) doHdr_bank_ac_nm_NE(info);
		else if (ne == Hdr_pay_bank_ac_cd) doHdr_pay_bank_ac_cd_NE(info);
		else if (ne == Hdr_pay_bank_ac_nm) doHdr_pay_bank_ac_nm_NE(info);
		else if (ne == Hdr_ap_setoff_typ) doHdr_ap_setoff_typ_NE(info);
		else if (ne == Hdr_ap_setoff_typ_nm) doHdr_ap_setoff_typ_nm_NE(info);
		else if (ne == Hdr_setoff_cd) doHdr_setoff_cd_NE(info);
		else if (ne == Hdr_setoff_nm) doHdr_setoff_nm_NE(info);
		else if (ne == Hdr_so_dpt_cd) doHdr_so_dpt_cd_NE(info);
		else if (ne == Hdr_so_dpt_nm) doHdr_so_dpt_nm_NE(info);
		else if (ne == Hdr_trd_rmrks) doHdr_trd_rmrks_NE(info);
		else if (ne == Hdr_intr_rmrks) doHdr_intr_rmrks_NE(info);
		else if (ne == Hdr_sub_char1) doHdr_sub_char1_NE(info);
		else if (ne == Hdr_sub_char2) doHdr_sub_char2_NE(info);
		else if (ne == Hdr_sub_char3) doHdr_sub_char3_NE(info);
		else if (ne == Hdr_note_no) doHdr_note_no_NE(info);
		else if (ne == Hdr_note_typ) doHdr_note_typ_NE(info);
		else if (ne == Hdr_note_typ_nm) doHdr_note_typ_nm_NE(info);
		else if (ne == Hdr_draw_dt) doHdr_draw_dt_NE(info);
		else if (ne == Hdr_note_days) doHdr_note_days_NE(info);
		else if (ne == Hdr_due_dt) doHdr_due_dt_NE(info);
		else if (ne == Hdr_drawer_nm) doHdr_drawer_nm_NE(info);
		else if (ne == Hdr_endrsr) doHdr_endrsr_NE(info);
		else if (ne == Hdr_accptr) doHdr_accptr_NE(info);
		else if (ne == Hdr_draw_bank_cd) doHdr_draw_bank_cd_NE(info);
		else if (ne == Hdr_draw_bank_nm) doHdr_draw_bank_nm_NE(info);
		else if (ne == Hdr_draw_branch_cd) doHdr_draw_branch_cd_NE(info);
		else if (ne == Hdr_draw_branch_nm) doHdr_draw_branch_nm_NE(info);
		else if (ne == Hdr_note_rsn_cd) doHdr_note_rsn_cd_NE(info);
		else if (ne == Hdr_note_rsn_nm) doHdr_note_rsn_nm_NE(info);
		else if (ne == Hdr_note_sub_char1) doHdr_note_sub_char1_NE(info);
		else if (ne == Hdr_note_sub_char2) doHdr_note_sub_char2_NE(info);
		else if (ne == Hdr_note_sub_char3) doHdr_note_sub_char3_NE(info);
		else if (ne == Hdr_pay_dpt_narrow_down_flg) doHdr_pay_dpt_narrow_down_flg_NE(info);
		else if (ne == Hdr_ap_sttl_narrow_down_flg) doHdr_ap_sttl_narrow_down_flg_NE(info);
		else if (ne == Hdr_pay_schd_dt) doHdr_pay_schd_dt_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_ap_sttl_cd) doDtl_ap_sttl_cd_NE(info);
		else if (ne == columnDtl_ap_sttl_nm) doDtl_ap_sttl_nm_NE(info);
		else if (ne == columnDtl_ap_sttl_typ) doDtl_ap_sttl_typ_NE(info);
		else if (ne == columnDtl_ap_sttl_typ_nm) doDtl_ap_sttl_typ_nm_NE(info);
		else if (ne == columnDtl_pay_schd_dt) doDtl_pay_schd_dt_NE(info);
		else if (ne == columnDtl_trd_cur_com_paid_tax_cd) doDtl_trd_cur_com_paid_tax_cd_NE(info);
		else if (ne == columnDtl_trd_cur_com_paid_tax_nm) doDtl_trd_cur_com_paid_tax_nm_NE(info);
		else if (ne == columnDtl_trd_cur_com_paid_tax_rate) doDtl_trd_cur_com_paid_tax_rate_NE(info);
		else if (ne == columnDtl_bank_ac_cd) doDtl_bank_ac_cd_NE(info);
		else if (ne == columnDtl_bank_ac_nm) doDtl_bank_ac_nm_NE(info);
		else if (ne == columnDtl_pay_bank_ac_cd) doDtl_pay_bank_ac_cd_NE(info);
		else if (ne == columnDtl_pay_bank_ac_nm) doDtl_pay_bank_ac_nm_NE(info);
		else if (ne == columnDtl_ap_setoff_typ) doDtl_ap_setoff_typ_NE(info);
		else if (ne == columnDtl_ap_setoff_typ_nm) doDtl_ap_setoff_typ_nm_NE(info);
		else if (ne == columnDtl_setoff_cd) doDtl_setoff_cd_NE(info);
		else if (ne == columnDtl_setoff_nm) doDtl_setoff_nm_NE(info);
		else if (ne == columnDtl_so_dpt_cd) doDtl_so_dpt_cd_NE(info);
		else if (ne == columnDtl_so_dpt_nm) doDtl_so_dpt_nm_NE(info);
		else if (ne == columnDtl_pay_act_d_no) doDtl_pay_act_d_no_NE(info);
		else if (ne == columnDtl_disp_seq) doDtl_disp_seq_NE(info);
		else if (ne == columnDtl_pay_chk_no) doDtl_pay_chk_no_NE(info);
		else if (ne == columnDtl_pay_chk_mng_no) doDtl_pay_chk_mng_no_NE(info);
		else if (ne == columnDtl_pay_schd_no) doDtl_pay_schd_no_NE(info);
		else if (ne == columnDtl_ap_appl_schd_no) doDtl_ap_appl_schd_no_NE(info);
		else if (ne == columnDtl_bsppl_cd) doDtl_bsppl_cd_NE(info);
		else if (ne == columnDtl_bsppl_nm) doDtl_bsppl_nm_NE(info);
		else if (ne == columnDtl_bsppl_dpt_cd) doDtl_bsppl_dpt_cd_NE(info);
		else if (ne == columnDtl_bsppl_dpt_nm) doDtl_bsppl_dpt_nm_NE(info);
		else if (ne == columnDtl_asppl_cd) doDtl_asppl_cd_NE(info);
		else if (ne == columnDtl_asppl_nm) doDtl_asppl_nm_NE(info);
		else if (ne == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_NE(info);
		else if (ne == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_NE(info);
		else if (ne == columnDtl_ap_typ) doDtl_ap_typ_NE(info);
		else if (ne == columnDtl_ap_typ_nm) doDtl_ap_typ_nm_NE(info);
		else if (ne == columnDtl_purc_act_no) doDtl_purc_act_no_NE(info);
		else if (ne == columnDtl_rcpt_iv_mng_no) doDtl_rcpt_iv_mng_no_NE(info);
		else if (ne == columnDtl_rcpt_iv_no) doDtl_rcpt_iv_no_NE(info);
		else if (ne == columnDtl_schd_ap_sttl_cd) doDtl_schd_ap_sttl_cd_NE(info);
		else if (ne == columnDtl_schd_ap_sttl_nm) doDtl_schd_ap_sttl_nm_NE(info);
		else if (ne == columnDtl_schd_ap_sttl_typ) doDtl_schd_ap_sttl_typ_NE(info);
		else if (ne == columnDtl_schd_ap_sttl_typ_nm) doDtl_schd_ap_sttl_typ_nm_NE(info);
		else if (ne == columnDtl_sw_flg) doDtl_sw_flg_NE(info);
		else if (ne == columnDtl_pay_ntc_d_print_rmrks) doDtl_pay_ntc_d_print_rmrks_NE(info);
		else if (ne == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NE(info);
		else if (ne == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
	}

	/**
	 * [HdrTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NE(MCEventInfo info){
	}

	/**
	 * [PayTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPayTab_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_act_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_basis_dt_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[psppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_sttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_sttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_sttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_sttl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_setoff_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_setoff_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_setoff_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_setoff_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[setoff_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_setoff_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[setoff_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_setoff_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[so_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_so_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[so_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_so_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[draw_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_draw_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_days_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[due_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_due_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[drawer_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_drawer_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[endrsr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_endrsr_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[accptr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_accptr_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[draw_bank_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_draw_bank_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[draw_bank_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_draw_bank_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[draw_branch_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_draw_branch_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[draw_branch_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_draw_branch_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_dpt_narrow_down_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_dpt_narrow_down_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_sttl_narrow_down_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_sttl_narrow_down_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_com_paid_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_com_paid_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_com_paid_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_com_paid_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_com_paid_tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_com_paid_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_setoff_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_setoff_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_setoff_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_setoff_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[setoff_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_setoff_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[setoff_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_setoff_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[so_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_so_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[so_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_so_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_chk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_chk_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_chk_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_chk_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_appl_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_appl_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_ap_sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_ap_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_ap_sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_ap_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_ap_sttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_ap_sttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_ap_sttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_ap_sttl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sw_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sw_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_ntc_d_print_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_ntc_d_print_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NE(MCEventInfo info){
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
		else if (nx == PayTabTab) doPayTab_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_pay_act_no) doCnd_pay_act_no_NX(info);
		else if (nx == Cnd_pay_act_rev) doCnd_pay_act_rev_NX(info);
		else if (nx == Cnd_latest_flg) doCnd_latest_flg_NX(info);
		else if (nx == Hdr_pay_act_no) doHdr_pay_act_no_NX(info);
		else if (nx == Hdr_pay_act_rev) doHdr_pay_act_rev_NX(info);
		else if (nx == Hdr_latest_flg) doHdr_latest_flg_NX(info);
		else if (nx == Hdr_ac_ym) doHdr_ac_ym_NX(info);
		else if (nx == Hdr_pay_act_dt) doHdr_pay_act_dt_NX(info);
		else if (nx == Hdr_pay_basis_dt) doHdr_pay_basis_dt_NX(info);
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
		else if (nx == Hdr_psppl_cd) doHdr_psppl_cd_NX(info);
		else if (nx == Hdr_psppl_nm) doHdr_psppl_nm_NX(info);
		else if (nx == Hdr_psppl_rmrks) doHdr_psppl_rmrks_NX(info);
		else if (nx == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NX(info);
		else if (nx == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NX(info);
		else if (nx == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_NX(info);
		else if (nx == Hdr_base_cur_cd) doHdr_base_cur_cd_NX(info);
		else if (nx == Hdr_base_cur_nm) doHdr_base_cur_nm_NX(info);
		else if (nx == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_NX(info);
		else if (nx == Hdr_xrate_cd) doHdr_xrate_cd_NX(info);
		else if (nx == Hdr_ap_sttl_cd) doHdr_ap_sttl_cd_NX(info);
		else if (nx == Hdr_ap_sttl_nm) doHdr_ap_sttl_nm_NX(info);
		else if (nx == Hdr_ap_sttl_typ) doHdr_ap_sttl_typ_NX(info);
		else if (nx == Hdr_ap_sttl_typ_nm) doHdr_ap_sttl_typ_nm_NX(info);
		else if (nx == Hdr_bank_ac_cd) doHdr_bank_ac_cd_NX(info);
		else if (nx == Hdr_bank_ac_nm) doHdr_bank_ac_nm_NX(info);
		else if (nx == Hdr_pay_bank_ac_cd) doHdr_pay_bank_ac_cd_NX(info);
		else if (nx == Hdr_pay_bank_ac_nm) doHdr_pay_bank_ac_nm_NX(info);
		else if (nx == Hdr_ap_setoff_typ) doHdr_ap_setoff_typ_NX(info);
		else if (nx == Hdr_ap_setoff_typ_nm) doHdr_ap_setoff_typ_nm_NX(info);
		else if (nx == Hdr_setoff_cd) doHdr_setoff_cd_NX(info);
		else if (nx == Hdr_setoff_nm) doHdr_setoff_nm_NX(info);
		else if (nx == Hdr_so_dpt_cd) doHdr_so_dpt_cd_NX(info);
		else if (nx == Hdr_so_dpt_nm) doHdr_so_dpt_nm_NX(info);
		else if (nx == Hdr_trd_rmrks) doHdr_trd_rmrks_NX(info);
		else if (nx == Hdr_intr_rmrks) doHdr_intr_rmrks_NX(info);
		else if (nx == Hdr_sub_char1) doHdr_sub_char1_NX(info);
		else if (nx == Hdr_sub_char2) doHdr_sub_char2_NX(info);
		else if (nx == Hdr_sub_char3) doHdr_sub_char3_NX(info);
		else if (nx == Hdr_note_no) doHdr_note_no_NX(info);
		else if (nx == Hdr_note_typ) doHdr_note_typ_NX(info);
		else if (nx == Hdr_note_typ_nm) doHdr_note_typ_nm_NX(info);
		else if (nx == Hdr_draw_dt) doHdr_draw_dt_NX(info);
		else if (nx == Hdr_note_days) doHdr_note_days_NX(info);
		else if (nx == Hdr_due_dt) doHdr_due_dt_NX(info);
		else if (nx == Hdr_drawer_nm) doHdr_drawer_nm_NX(info);
		else if (nx == Hdr_endrsr) doHdr_endrsr_NX(info);
		else if (nx == Hdr_accptr) doHdr_accptr_NX(info);
		else if (nx == Hdr_draw_bank_cd) doHdr_draw_bank_cd_NX(info);
		else if (nx == Hdr_draw_bank_nm) doHdr_draw_bank_nm_NX(info);
		else if (nx == Hdr_draw_branch_cd) doHdr_draw_branch_cd_NX(info);
		else if (nx == Hdr_draw_branch_nm) doHdr_draw_branch_nm_NX(info);
		else if (nx == Hdr_note_rsn_cd) doHdr_note_rsn_cd_NX(info);
		else if (nx == Hdr_note_rsn_nm) doHdr_note_rsn_nm_NX(info);
		else if (nx == Hdr_note_sub_char1) doHdr_note_sub_char1_NX(info);
		else if (nx == Hdr_note_sub_char2) doHdr_note_sub_char2_NX(info);
		else if (nx == Hdr_note_sub_char3) doHdr_note_sub_char3_NX(info);
		else if (nx == Hdr_pay_dpt_narrow_down_flg) doHdr_pay_dpt_narrow_down_flg_NX(info);
		else if (nx == Hdr_ap_sttl_narrow_down_flg) doHdr_ap_sttl_narrow_down_flg_NX(info);
		else if (nx == Hdr_pay_schd_dt) doHdr_pay_schd_dt_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_ap_sttl_cd) doDtl_ap_sttl_cd_NX(info);
		else if (nx == columnDtl_ap_sttl_nm) doDtl_ap_sttl_nm_NX(info);
		else if (nx == columnDtl_ap_sttl_typ) doDtl_ap_sttl_typ_NX(info);
		else if (nx == columnDtl_ap_sttl_typ_nm) doDtl_ap_sttl_typ_nm_NX(info);
		else if (nx == columnDtl_pay_schd_dt) doDtl_pay_schd_dt_NX(info);
		else if (nx == columnDtl_trd_cur_com_paid_tax_cd) doDtl_trd_cur_com_paid_tax_cd_NX(info);
		else if (nx == columnDtl_trd_cur_com_paid_tax_nm) doDtl_trd_cur_com_paid_tax_nm_NX(info);
		else if (nx == columnDtl_trd_cur_com_paid_tax_rate) doDtl_trd_cur_com_paid_tax_rate_NX(info);
		else if (nx == columnDtl_bank_ac_cd) doDtl_bank_ac_cd_NX(info);
		else if (nx == columnDtl_bank_ac_nm) doDtl_bank_ac_nm_NX(info);
		else if (nx == columnDtl_pay_bank_ac_cd) doDtl_pay_bank_ac_cd_NX(info);
		else if (nx == columnDtl_pay_bank_ac_nm) doDtl_pay_bank_ac_nm_NX(info);
		else if (nx == columnDtl_ap_setoff_typ) doDtl_ap_setoff_typ_NX(info);
		else if (nx == columnDtl_ap_setoff_typ_nm) doDtl_ap_setoff_typ_nm_NX(info);
		else if (nx == columnDtl_setoff_cd) doDtl_setoff_cd_NX(info);
		else if (nx == columnDtl_setoff_nm) doDtl_setoff_nm_NX(info);
		else if (nx == columnDtl_so_dpt_cd) doDtl_so_dpt_cd_NX(info);
		else if (nx == columnDtl_so_dpt_nm) doDtl_so_dpt_nm_NX(info);
		else if (nx == columnDtl_pay_act_d_no) doDtl_pay_act_d_no_NX(info);
		else if (nx == columnDtl_disp_seq) doDtl_disp_seq_NX(info);
		else if (nx == columnDtl_pay_chk_no) doDtl_pay_chk_no_NX(info);
		else if (nx == columnDtl_pay_chk_mng_no) doDtl_pay_chk_mng_no_NX(info);
		else if (nx == columnDtl_pay_schd_no) doDtl_pay_schd_no_NX(info);
		else if (nx == columnDtl_ap_appl_schd_no) doDtl_ap_appl_schd_no_NX(info);
		else if (nx == columnDtl_bsppl_cd) doDtl_bsppl_cd_NX(info);
		else if (nx == columnDtl_bsppl_nm) doDtl_bsppl_nm_NX(info);
		else if (nx == columnDtl_bsppl_dpt_cd) doDtl_bsppl_dpt_cd_NX(info);
		else if (nx == columnDtl_bsppl_dpt_nm) doDtl_bsppl_dpt_nm_NX(info);
		else if (nx == columnDtl_asppl_cd) doDtl_asppl_cd_NX(info);
		else if (nx == columnDtl_asppl_nm) doDtl_asppl_nm_NX(info);
		else if (nx == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_NX(info);
		else if (nx == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_NX(info);
		else if (nx == columnDtl_ap_typ) doDtl_ap_typ_NX(info);
		else if (nx == columnDtl_ap_typ_nm) doDtl_ap_typ_nm_NX(info);
		else if (nx == columnDtl_purc_act_no) doDtl_purc_act_no_NX(info);
		else if (nx == columnDtl_rcpt_iv_mng_no) doDtl_rcpt_iv_mng_no_NX(info);
		else if (nx == columnDtl_rcpt_iv_no) doDtl_rcpt_iv_no_NX(info);
		else if (nx == columnDtl_schd_ap_sttl_cd) doDtl_schd_ap_sttl_cd_NX(info);
		else if (nx == columnDtl_schd_ap_sttl_nm) doDtl_schd_ap_sttl_nm_NX(info);
		else if (nx == columnDtl_schd_ap_sttl_typ) doDtl_schd_ap_sttl_typ_NX(info);
		else if (nx == columnDtl_schd_ap_sttl_typ_nm) doDtl_schd_ap_sttl_typ_nm_NX(info);
		else if (nx == columnDtl_sw_flg) doDtl_sw_flg_NX(info);
		else if (nx == columnDtl_pay_ntc_d_print_rmrks) doDtl_pay_ntc_d_print_rmrks_NX(info);
		else if (nx == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NX(info);
		else if (nx == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
	}

	/**
	 * [HdrTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NX(MCEventInfo info){
	}

	/**
	 * [PayTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doPayTab_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_act_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_basis_dt_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[psppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_sttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_sttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_sttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_sttl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_setoff_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_setoff_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_setoff_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_setoff_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[setoff_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_setoff_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[setoff_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_setoff_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[so_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_so_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[so_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_so_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[draw_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_draw_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_days_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[due_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_due_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[drawer_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_drawer_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[endrsr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_endrsr_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[accptr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_accptr_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[draw_bank_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_draw_bank_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[draw_bank_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_draw_bank_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[draw_branch_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_draw_branch_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[draw_branch_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_draw_branch_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_dpt_narrow_down_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_dpt_narrow_down_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_sttl_narrow_down_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_sttl_narrow_down_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_com_paid_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_com_paid_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_com_paid_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_com_paid_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_com_paid_tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_com_paid_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_setoff_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_setoff_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_setoff_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_setoff_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[setoff_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_setoff_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[setoff_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_setoff_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[so_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_so_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[so_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_so_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_chk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_chk_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_chk_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_chk_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_appl_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_appl_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_ap_sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_ap_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_ap_sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_ap_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_ap_sttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_ap_sttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_ap_sttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_ap_sttl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sw_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sw_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_ntc_d_print_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_ntc_d_print_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_pay_act_no) doCnd_pay_act_no_LC(info);
		else if (lc == Cnd_pay_act_rev) doCnd_pay_act_rev_LC(info);
		else if (lc == Hdr_pay_act_no) doHdr_pay_act_no_LC(info);
		else if (lc == Hdr_pay_act_rev) doHdr_pay_act_rev_LC(info);
		else if (lc == Hdr_ac_ym) doHdr_ac_ym_LC(info);
		else if (lc == Hdr_pay_act_dt) doHdr_pay_act_dt_LC(info);
		else if (lc == Hdr_pay_basis_dt) doHdr_pay_basis_dt_LC(info);
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
		else if (lc == Hdr_psppl_cd) doHdr_psppl_cd_LC(info);
		else if (lc == Hdr_psppl_nm) doHdr_psppl_nm_LC(info);
		else if (lc == Hdr_psppl_rmrks) doHdr_psppl_rmrks_LC(info);
		else if (lc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_LC(info);
		else if (lc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_LC(info);
		else if (lc == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_LC(info);
		else if (lc == Hdr_base_cur_cd) doHdr_base_cur_cd_LC(info);
		else if (lc == Hdr_base_cur_nm) doHdr_base_cur_nm_LC(info);
		else if (lc == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_LC(info);
		else if (lc == Hdr_xrate_cd) doHdr_xrate_cd_LC(info);
		else if (lc == Hdr_ap_sttl_cd) doHdr_ap_sttl_cd_LC(info);
		else if (lc == Hdr_ap_sttl_nm) doHdr_ap_sttl_nm_LC(info);
		else if (lc == Hdr_ap_sttl_typ) doHdr_ap_sttl_typ_LC(info);
		else if (lc == Hdr_ap_sttl_typ_nm) doHdr_ap_sttl_typ_nm_LC(info);
		else if (lc == Hdr_bank_ac_cd) doHdr_bank_ac_cd_LC(info);
		else if (lc == Hdr_bank_ac_nm) doHdr_bank_ac_nm_LC(info);
		else if (lc == Hdr_pay_bank_ac_cd) doHdr_pay_bank_ac_cd_LC(info);
		else if (lc == Hdr_pay_bank_ac_nm) doHdr_pay_bank_ac_nm_LC(info);
		else if (lc == Hdr_ap_setoff_typ) doHdr_ap_setoff_typ_LC(info);
		else if (lc == Hdr_ap_setoff_typ_nm) doHdr_ap_setoff_typ_nm_LC(info);
		else if (lc == Hdr_setoff_cd) doHdr_setoff_cd_LC(info);
		else if (lc == Hdr_setoff_nm) doHdr_setoff_nm_LC(info);
		else if (lc == Hdr_so_dpt_cd) doHdr_so_dpt_cd_LC(info);
		else if (lc == Hdr_so_dpt_nm) doHdr_so_dpt_nm_LC(info);
		else if (lc == Hdr_trd_rmrks) doHdr_trd_rmrks_LC(info);
		else if (lc == Hdr_intr_rmrks) doHdr_intr_rmrks_LC(info);
		else if (lc == Hdr_sub_char1) doHdr_sub_char1_LC(info);
		else if (lc == Hdr_sub_char2) doHdr_sub_char2_LC(info);
		else if (lc == Hdr_sub_char3) doHdr_sub_char3_LC(info);
		else if (lc == Hdr_note_no) doHdr_note_no_LC(info);
		else if (lc == Hdr_note_typ) doHdr_note_typ_LC(info);
		else if (lc == Hdr_note_typ_nm) doHdr_note_typ_nm_LC(info);
		else if (lc == Hdr_draw_dt) doHdr_draw_dt_LC(info);
		else if (lc == Hdr_note_days) doHdr_note_days_LC(info);
		else if (lc == Hdr_due_dt) doHdr_due_dt_LC(info);
		else if (lc == Hdr_drawer_nm) doHdr_drawer_nm_LC(info);
		else if (lc == Hdr_endrsr) doHdr_endrsr_LC(info);
		else if (lc == Hdr_accptr) doHdr_accptr_LC(info);
		else if (lc == Hdr_draw_bank_cd) doHdr_draw_bank_cd_LC(info);
		else if (lc == Hdr_draw_bank_nm) doHdr_draw_bank_nm_LC(info);
		else if (lc == Hdr_draw_branch_cd) doHdr_draw_branch_cd_LC(info);
		else if (lc == Hdr_draw_branch_nm) doHdr_draw_branch_nm_LC(info);
		else if (lc == Hdr_note_rsn_cd) doHdr_note_rsn_cd_LC(info);
		else if (lc == Hdr_note_rsn_nm) doHdr_note_rsn_nm_LC(info);
		else if (lc == Hdr_note_sub_char1) doHdr_note_sub_char1_LC(info);
		else if (lc == Hdr_note_sub_char2) doHdr_note_sub_char2_LC(info);
		else if (lc == Hdr_note_sub_char3) doHdr_note_sub_char3_LC(info);
		else if (lc == Hdr_pay_schd_dt) doHdr_pay_schd_dt_LC(info);
		else if (lc == columnDtl_ap_sttl_cd) doDtl_ap_sttl_cd_LC(info);
		else if (lc == columnDtl_ap_sttl_nm) doDtl_ap_sttl_nm_LC(info);
		else if (lc == columnDtl_ap_sttl_typ) doDtl_ap_sttl_typ_LC(info);
		else if (lc == columnDtl_ap_sttl_typ_nm) doDtl_ap_sttl_typ_nm_LC(info);
		else if (lc == columnDtl_pay_schd_dt) doDtl_pay_schd_dt_LC(info);
		else if (lc == columnDtl_trd_cur_com_paid_tax_cd) doDtl_trd_cur_com_paid_tax_cd_LC(info);
		else if (lc == columnDtl_trd_cur_com_paid_tax_nm) doDtl_trd_cur_com_paid_tax_nm_LC(info);
		else if (lc == columnDtl_trd_cur_com_paid_tax_rate) doDtl_trd_cur_com_paid_tax_rate_LC(info);
		else if (lc == columnDtl_bank_ac_cd) doDtl_bank_ac_cd_LC(info);
		else if (lc == columnDtl_bank_ac_nm) doDtl_bank_ac_nm_LC(info);
		else if (lc == columnDtl_pay_bank_ac_cd) doDtl_pay_bank_ac_cd_LC(info);
		else if (lc == columnDtl_pay_bank_ac_nm) doDtl_pay_bank_ac_nm_LC(info);
		else if (lc == columnDtl_ap_setoff_typ) doDtl_ap_setoff_typ_LC(info);
		else if (lc == columnDtl_ap_setoff_typ_nm) doDtl_ap_setoff_typ_nm_LC(info);
		else if (lc == columnDtl_setoff_cd) doDtl_setoff_cd_LC(info);
		else if (lc == columnDtl_setoff_nm) doDtl_setoff_nm_LC(info);
		else if (lc == columnDtl_so_dpt_cd) doDtl_so_dpt_cd_LC(info);
		else if (lc == columnDtl_so_dpt_nm) doDtl_so_dpt_nm_LC(info);
		else if (lc == columnDtl_pay_act_d_no) doDtl_pay_act_d_no_LC(info);
		else if (lc == columnDtl_disp_seq) doDtl_disp_seq_LC(info);
		else if (lc == columnDtl_pay_chk_no) doDtl_pay_chk_no_LC(info);
		else if (lc == columnDtl_pay_chk_mng_no) doDtl_pay_chk_mng_no_LC(info);
		else if (lc == columnDtl_pay_schd_no) doDtl_pay_schd_no_LC(info);
		else if (lc == columnDtl_ap_appl_schd_no) doDtl_ap_appl_schd_no_LC(info);
		else if (lc == columnDtl_bsppl_cd) doDtl_bsppl_cd_LC(info);
		else if (lc == columnDtl_bsppl_nm) doDtl_bsppl_nm_LC(info);
		else if (lc == columnDtl_bsppl_dpt_cd) doDtl_bsppl_dpt_cd_LC(info);
		else if (lc == columnDtl_bsppl_dpt_nm) doDtl_bsppl_dpt_nm_LC(info);
		else if (lc == columnDtl_asppl_cd) doDtl_asppl_cd_LC(info);
		else if (lc == columnDtl_asppl_nm) doDtl_asppl_nm_LC(info);
		else if (lc == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_LC(info);
		else if (lc == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_LC(info);
		else if (lc == columnDtl_ap_typ) doDtl_ap_typ_LC(info);
		else if (lc == columnDtl_ap_typ_nm) doDtl_ap_typ_nm_LC(info);
		else if (lc == columnDtl_purc_act_no) doDtl_purc_act_no_LC(info);
		else if (lc == columnDtl_rcpt_iv_mng_no) doDtl_rcpt_iv_mng_no_LC(info);
		else if (lc == columnDtl_rcpt_iv_no) doDtl_rcpt_iv_no_LC(info);
		else if (lc == columnDtl_schd_ap_sttl_cd) doDtl_schd_ap_sttl_cd_LC(info);
		else if (lc == columnDtl_schd_ap_sttl_nm) doDtl_schd_ap_sttl_nm_LC(info);
		else if (lc == columnDtl_schd_ap_sttl_typ) doDtl_schd_ap_sttl_typ_LC(info);
		else if (lc == columnDtl_schd_ap_sttl_typ_nm) doDtl_schd_ap_sttl_typ_nm_LC(info);
		else if (lc == columnDtl_pay_ntc_d_print_rmrks) doDtl_pay_ntc_d_print_rmrks_LC(info);
		else if (lc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_LC(info);
		else if (lc == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
	}

	/**
	 * [Cnd]パネルの[pay_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_act_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_basis_dt_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[psppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_sttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_sttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_sttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_sttl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bank_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_bank_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_setoff_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_setoff_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_setoff_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_setoff_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[setoff_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_setoff_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[setoff_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_setoff_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[so_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_so_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[so_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_so_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[draw_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_draw_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_days_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[due_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_due_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[drawer_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_drawer_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[endrsr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_endrsr_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[accptr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_accptr_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[draw_bank_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_draw_bank_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[draw_bank_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_draw_bank_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[draw_branch_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_draw_branch_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[draw_branch_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_draw_branch_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_com_paid_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_com_paid_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_com_paid_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_com_paid_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_com_paid_tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_com_paid_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bank_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_bank_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_setoff_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_setoff_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_setoff_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_setoff_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[setoff_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_setoff_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[setoff_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_setoff_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[so_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_so_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[so_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_so_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_chk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_chk_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_chk_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_chk_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_appl_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_appl_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_ap_sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_ap_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_ap_sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_ap_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_ap_sttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_ap_sttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_ap_sttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_ap_sttl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_ntc_d_print_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_ntc_d_print_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_psppl_cd]の作成メソッド
	 */
	public MCList getHdr_psppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_trd_cur_cd]の作成メソッド
	 */
	public MCList getHdr_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_ap_sttl_cd]の作成メソッド
	 */
	public MCList getHdr_ap_sttl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApSttl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_ap_sttl_typ]の作成メソッド
	 */
	public MCList getHdr_ap_sttl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApSttlTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_bank_ac_cd]の作成メソッド
	 */
	public MCList getHdr_bank_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIntBankAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_pay_bank_ac_cd]の作成メソッド
	 */
	public MCList getHdr_pay_bank_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExtBankAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_ap_setoff_typ]の作成メソッド
	 */
	public MCList getHdr_ap_setoff_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApSetoffTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_setoff_cd]の作成メソッド
	 */
	public MCList getHdr_setoff_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_so_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_so_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_note_typ]の作成メソッド
	 */
	public MCList getHdr_note_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNoteTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_draw_bank_cd]の作成メソッド
	 */
	public MCList getHdr_draw_bank_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBank(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_draw_branch_cd]の作成メソッド
	 */
	public MCList getHdr_draw_branch_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBankBranch(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_note_rsn_cd]の作成メソッド
	 */
	public MCList getHdr_note_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNoteRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ap_sttl_cd]の作成メソッド
	 */
	public MCList getDtl_ap_sttl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApSttl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ap_sttl_typ]の作成メソッド
	 */
	public MCList getDtl_ap_sttl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApSttlTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_trd_cur_com_paid_tax_cd]の作成メソッド
	 */
	public MCList getDtl_trd_cur_com_paid_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bank_ac_cd]の作成メソッド
	 */
	public MCList getDtl_bank_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIntBankAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_pay_bank_ac_cd]の作成メソッド
	 */
	public MCList getDtl_pay_bank_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExtBankAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ap_setoff_typ]の作成メソッド
	 */
	public MCList getDtl_ap_setoff_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApSetoffTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_setoff_cd]の作成メソッド
	 */
	public MCList getDtl_setoff_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_so_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_so_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBHL0090.Srch01")) {
			return new MS_MSBHL0090_Srch01Bridge();
		}
		if (id.equals("MS.MSBHL0090.Srch02")) {
			return new MS_MSBHL0090_Srch02Bridge();
		}
		if (id.equals("MS.MSBHL0090.Ins01")) {
			return new MS_MSBHL0090_Ins01Bridge();
		}
		if (id.equals("MS.MSBHL0090.Upd01")) {
			return new MS_MSBHL0090_Upd01Bridge();
		}
		if (id.equals("MS.MSBHL0090.Del01")) {
			return new MS_MSBHL0090_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBHL0090_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0090_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0090_Srch01;

		/** コンストラクタ */
		protected MS_MSBHL0090_Srch01Bridge() {
			p_MS_MSBHL0090_Srch01 = new MCParam(PDef.MS_MSBHL0090_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0090_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBH.MSBHP0090.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBH.MSBHP0090.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0090.DtlR.class));

			p_MS_MSBHL0090_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0090_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0090_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0090_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0090_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBH.MSBHP0090.CndR up0() {
			return (mcframe.clientMSBH.MSBHP0090.CndR)up(0);
		}

		protected mcframe.clientMSBH.MSBHP0090.HdrR down0() {
			return (mcframe.clientMSBH.MSBHP0090.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBH.MSBHP0090.DtlR> down1() {
			return (MCList<mcframe.clientMSBH.MSBHP0090.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0090_Srch01.addDownBlock(mcframe.clientMSBH.MSBHP0090.HdrR.create());
			p_MS_MSBHL0090_Srch01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0090.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0090_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBH.MSBHP0090.HdrR)p_MS_MSBHL0090_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBH.MSBHP0090.DtlR>)p_MS_MSBHL0090_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
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
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBHL0090_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0090_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0090_Srch02;

		/** コンストラクタ */
		protected MS_MSBHL0090_Srch02Bridge() {
			p_MS_MSBHL0090_Srch02 = new MCParam(PDef.MS_MSBHL0090_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0090_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBH.MSBHP0090.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBH.MSBHP0090.PaySchdTgtR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBH.MSBHP0090.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0090.DtlR.class));

			p_MS_MSBHL0090_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0090_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0090_Srch02.addUpBlock(getHdrR());
			p_MS_MSBHL0090_Srch02.addUpBlock(getPaySchdTgtL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0090_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0090_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBH.MSBHP0090.HdrR up0() {
			return (mcframe.clientMSBH.MSBHP0090.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBH.MSBHP0090.PaySchdTgtR> up1() {
			return (MCList<mcframe.clientMSBH.MSBHP0090.PaySchdTgtR>)up(1);
		}

		protected mcframe.clientMSBH.MSBHP0090.HdrR down0() {
			return (mcframe.clientMSBH.MSBHP0090.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBH.MSBHP0090.DtlR> down1() {
			return (MCList<mcframe.clientMSBH.MSBHP0090.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0090_Srch02.addDownBlock(mcframe.clientMSBH.MSBHP0090.HdrR.create());
			p_MS_MSBHL0090_Srch02.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0090.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0090_Srch02;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBH.MSBHP0090.HdrR)p_MS_MSBHL0090_Srch02.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBH.MSBHP0090.DtlR>)p_MS_MSBHL0090_Srch02.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getPaySchdTgtL());
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
	 * [MS_MSBHL0090_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0090_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0090_Ins01;

		/** コンストラクタ */
		protected MS_MSBHL0090_Ins01Bridge() {
			p_MS_MSBHL0090_Ins01 = new MCParam(PDef.MS_MSBHL0090_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0090_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBH.MSBHP0090.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBH.MSBHP0090.DtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBH.MSBHP0090.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0090.DtlR.class));

			p_MS_MSBHL0090_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0090_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0090_Ins01.addUpBlock(getHdrR());
			p_MS_MSBHL0090_Ins01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0090_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0090_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBH.MSBHP0090.HdrR up0() {
			return (mcframe.clientMSBH.MSBHP0090.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBH.MSBHP0090.DtlR> up1() {
			return (MCList<mcframe.clientMSBH.MSBHP0090.DtlR>)up(1);
		}

		protected mcframe.clientMSBH.MSBHP0090.HdrR down0() {
			return (mcframe.clientMSBH.MSBHP0090.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBH.MSBHP0090.DtlR> down1() {
			return (MCList<mcframe.clientMSBH.MSBHP0090.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0090_Ins01.addDownBlock(mcframe.clientMSBH.MSBHP0090.HdrR.create());
			p_MS_MSBHL0090_Ins01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0090.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0090_Ins01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBH.MSBHP0090.HdrR)p_MS_MSBHL0090_Ins01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBH.MSBHP0090.DtlR>)p_MS_MSBHL0090_Ins01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
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
	 * [MS_MSBHL0090_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0090_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0090_Upd01;

		/** コンストラクタ */
		protected MS_MSBHL0090_Upd01Bridge() {
			p_MS_MSBHL0090_Upd01 = new MCParam(PDef.MS_MSBHL0090_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0090_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBH.MSBHP0090.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBH.MSBHP0090.DtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBH.MSBHP0090.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0090.DtlR.class));

			p_MS_MSBHL0090_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0090_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0090_Upd01.addUpBlock(getHdrR());
			p_MS_MSBHL0090_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0090_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0090_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBH.MSBHP0090.HdrR up0() {
			return (mcframe.clientMSBH.MSBHP0090.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBH.MSBHP0090.DtlR> up1() {
			return (MCList<mcframe.clientMSBH.MSBHP0090.DtlR>)up(1);
		}

		protected mcframe.clientMSBH.MSBHP0090.HdrR down0() {
			return (mcframe.clientMSBH.MSBHP0090.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBH.MSBHP0090.DtlR> down1() {
			return (MCList<mcframe.clientMSBH.MSBHP0090.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0090_Upd01.addDownBlock(mcframe.clientMSBH.MSBHP0090.HdrR.create());
			p_MS_MSBHL0090_Upd01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0090.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0090_Upd01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBH.MSBHP0090.HdrR)p_MS_MSBHL0090_Upd01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBH.MSBHP0090.DtlR>)p_MS_MSBHL0090_Upd01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
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
	 * [MS_MSBHL0090_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0090_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0090_Del01;

		/** コンストラクタ */
		protected MS_MSBHL0090_Del01Bridge() {
			p_MS_MSBHL0090_Del01 = new MCParam(PDef.MS_MSBHL0090_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0090_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBH.MSBHP0090.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBH.MSBHP0090.DtlR.class));
			// Down

			p_MS_MSBHL0090_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0090_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0090_Del01.addUpBlock(getHdrR());
			p_MS_MSBHL0090_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0090_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0090_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBH.MSBHP0090.HdrR up0() {
			return (mcframe.clientMSBH.MSBHP0090.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBH.MSBHP0090.DtlR> up1() {
			return (MCList<mcframe.clientMSBH.MSBHP0090.DtlR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBHL0090_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}