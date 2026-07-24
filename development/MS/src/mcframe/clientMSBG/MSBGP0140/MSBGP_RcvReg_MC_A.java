package mcframe.clientMSBG.MSBGP0140;

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
import mcframe.clientMSBG.MSBGP0140.MSBGP_RcvReg_MC.MS_MSBGL0140_Srch01Caller;
import mcframe.clientMSBG.MSBGP0140.MSBGP_RcvReg_MC.MS_MSBGL0140_Ins01Caller;
import mcframe.clientMSBG.MSBGP0140.MSBGP_RcvReg_MC.MS_MSBGL0140_Upd01Caller;
import mcframe.clientMSBG.MSBGP0140.MSBGP_RcvReg_MC.MS_MSBGL0140_Del01Caller;
import mcframe.clientMSBG.MSBGP0140.MSBGP_RcvReg_MC.MS_MSBGL0140_Prnt01Caller;

/**
 * 画面"MSBGP_RcvReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGP_RcvReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBGP0140";

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
	 * INS,Create,0;UPD,Modify,1;DEL,Cancel,2;REF,View,3 INS,登録する,0;UPD,訂正する,1;DEL,取り消す,2;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_rcv_no_Label = null;
	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rcv_no = null;
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
	public MCLabel Hdr_rcv_no_Label = null;
	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_rcv_no = null;
	public MCLabel Hdr_rcv_dt_Label = null;
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCDateField Hdr_rcv_dt = null;
	/**
	 * Split 分割.<p>
	 *
	 */
	public MCCheckBox Hdr_div_flg = null;
	/**
	 * Payment received slip immediate issue 入金管理票即時発行.<p>
	 *
	 */
	public MCCheckBox Hdr_opn_flg = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCCheckBox Hdr_prnt_flg = null;
	/**
	 * FB ＦＢ.<p>
	 *
	 */
	public MCCheckBox Hdr_fb_flg = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H Hdr_usr_dpt_p_PPanel;
	public MCTextField Hdr_rcv_usr_cd;	// [Hdr]の[usr_dpt_p.usr_cd]を[Hdr_rcv_usr_cd]としてエイリアス定義。
	public MCTextField Hdr_rcv_usr_nm;	// [Hdr]の[usr_dpt_p.usr_nm]を[Hdr_rcv_usr_nm]としてエイリアス定義。
	public MCTextComboBox Hdr_rcv_dpt_cd;	// [Hdr]の[usr_dpt_p.dpt_cd]を[Hdr_rcv_dpt_cd]としてエイリアス定義。
	public MCTextField Hdr_rcv_dpt_nm;	// [Hdr]の[usr_dpt_p.dpt_nm]を[Hdr_rcv_dpt_nm]としてエイリアス定義。
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
	public MCLabel Hdr_rcst_cd_Label = null;
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_rcst_cd = null;
	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public MCTextField Hdr_rcst_nm = null;
	public MCLabel Hdr_bcst_cd_Label = null;
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_bcst_cd = null;
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public MCTextField Hdr_bcst_nm = null;
	public MCLabel Hdr_bill_dpt_cd_Label = null;
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_bill_dpt_cd = null;
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public MCTextField Hdr_bill_dpt_nm = null;
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
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_amt_dec_place = null;
	public mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H Hdr_xrate_p_PPanel;
	public MCNumberField Hdr_xrate;	// [Hdr]の[xrate_p.xrate]を[Hdr_xrate]としてエイリアス定義。
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_base_cur_cd = null;
	public MCLabel Hdr_xrate_cd_Label = null;
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_xrate_cd = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_rcv_amt_p_PPanel;
	public MCNumberField Hdr_rcv_amt;	// [Hdr]の[rcv_amt_p.amt]を[Hdr_rcv_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_rcv_proc_amt_p_PPanel;
	public MCNumberField Hdr_rcv_proc_amt;	// [Hdr]の[rcv_proc_amt_p.amt]を[Hdr_rcv_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_not_proc_bal_p_PPanel;
	public MCNumberField Hdr_not_proc_bal;	// [Hdr]の[not_proc_bal_p.amt]を[Hdr_not_proc_bal]としてエイリアス定義。
	public MCLabel Hdr_rcv_mtd_cd_Label = null;
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_rcv_mtd_cd = null;
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public MCTextField Hdr_rcv_mtd_nm = null;
	/**
	 * Payment received type 入金区分.<p>
	 *
	 */
	public MCTextField Hdr_rcv_typ = null;
	/**
	 * Default account cd. デフォルト口座ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_def_bank_ac_cd = null;
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
	public MCLabel Hdr_xfr_psn_Label = null;
	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public MCTextField Hdr_xfr_psn = null;
	public MCLabel Hdr_ext_sys_cd_Label = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCTextField Hdr_ext_sys_nm = null;
	public MCLabel Hdr_ext_rcv_no_Label = null;
	/**
	 * External payment received No. 外部入金ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_ext_rcv_no = null;
	public MCLabel Hdr_rcv_rmrks_Label = null;
	/**
	 * Payment received remarks 入金備考.<p>
	 *
	 */
	public MCTextField Hdr_rcv_rmrks = null;
	public MCLabel Hdr_rcv_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Hdr_rcv_sub_char1 = null;
	public MCLabel Hdr_rcv_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Hdr_rcv_sub_char2 = null;
	public MCLabel Hdr_rcv_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Hdr_rcv_sub_char3 = null;
	/**
	 * For auto-reconciliation 入金自動消込対象.<p>
	 *
	 */
	public MCCheckBox Hdr_rcv_auto_appl_tgt_flg = null;
	public MCLabel Hdr_auto_appl_basis_dt_Label = null;
	/**
	 * Auto-reconciliation base date 自動消込基準日.<p>
	 *
	 */
	public MCDateField Hdr_auto_appl_basis_dt = null;
	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public MCNumberField Hdr_auto_appl_delay_days = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_com_paid_p_PPanel;
	public MCNumberField Hdr_com_paid;	// [Hdr]の[com_paid_p.amt]を[Hdr_com_paid]としてエイリアス定義。
	public MCLabel Hdr_auto_appl_sts_typ_Label = null;
	/**
	 * Auto-reconciliation status type 自動消込状況区分.<p>
	 *
	 */
	public MCTextField Hdr_auto_appl_sts_typ = null;
	/**
	 * Auto-reconciliation status type name 自動消込状況区分名.<p>
	 *
	 */
	public MCTextField Hdr_auto_appl_sts_typ_nm = null;
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
	// [Hdr2]ブロック関連のField定義
	public MCPanel Hdr2Panel = null;
	// [Hdr2]ブロックの項目のField定義
	// [Note]ブロック関連のField定義
	public MCPanel NotePanel = null;
	public MCTitledBorder NoteTitledBorder = null;
	// [Note]ブロックの項目のField定義
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Advance/suspense received entry 前受仮受登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0200 = null;
	/**
	 * AR reconciliation entry 売掛消込登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0210 = null;
	/**
	 * Payment received split 入金分割登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0160 = null;
	/**
	 * Reconciled payment received list 入金実績一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0250 = null;
	/**
	 * Payment received slip 入金管理票.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
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
	/** [INS_NOTE]モードを表す定数 */
	public static final String INS_NOTE = "INS_NOTE";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [UPD_NOTE]モードを表す定数 */
	public static final String UPD_NOTE = "UPD_NOTE";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INS, INS_NOTE, FIX_I, SRCH, UPD, UPD_NOTE, FIX_U, DEL, FIX_D, REF};
	
	/** [MS_MSBGL0140_Srch01]のCallerの作成 */
	protected MSBGP_RcvReg_MC.MS_MSBGL0140_Srch01Caller createMS_MSBGL0140_Srch01() {
		MSBGP_RcvReg_MC.MS_MSBGL0140_Srch01Caller<MSBGP_RcvReg, MS_MSBGL0140_Srch01Bridge>
		caller = ((MSBGP_RcvReg_MC)this).new MS_MSBGL0140_Srch01Caller<MSBGP_RcvReg, MS_MSBGL0140_Srch01Bridge>(
					(MSBGP_RcvReg)this, new MS_MSBGL0140_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBGL0140_Srch01]の呼び出し */
	protected void callMS_MSBGL0140_Srch01() {
		MCCaller caller = createMS_MSBGL0140_Srch01();
		caller.exec();
	}
	/** [MS_MSBGL0140_Ins01]のCallerの作成 */
	protected MSBGP_RcvReg_MC.MS_MSBGL0140_Ins01Caller createMS_MSBGL0140_Ins01() {
		MSBGP_RcvReg_MC.MS_MSBGL0140_Ins01Caller<MSBGP_RcvReg, MS_MSBGL0140_Ins01Bridge>
		caller = ((MSBGP_RcvReg_MC)this).new MS_MSBGL0140_Ins01Caller<MSBGP_RcvReg, MS_MSBGL0140_Ins01Bridge>(
					(MSBGP_RcvReg)this, new MS_MSBGL0140_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBGL0140_Ins01]の呼び出し */
	protected void callMS_MSBGL0140_Ins01() {
		MCCaller caller = createMS_MSBGL0140_Ins01();
		caller.exec();
	}
	/** [MS_MSBGL0140_Upd01]のCallerの作成 */
	protected MSBGP_RcvReg_MC.MS_MSBGL0140_Upd01Caller createMS_MSBGL0140_Upd01() {
		MSBGP_RcvReg_MC.MS_MSBGL0140_Upd01Caller<MSBGP_RcvReg, MS_MSBGL0140_Upd01Bridge>
		caller = ((MSBGP_RcvReg_MC)this).new MS_MSBGL0140_Upd01Caller<MSBGP_RcvReg, MS_MSBGL0140_Upd01Bridge>(
					(MSBGP_RcvReg)this, new MS_MSBGL0140_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBGL0140_Upd01]の呼び出し */
	protected void callMS_MSBGL0140_Upd01() {
		MCCaller caller = createMS_MSBGL0140_Upd01();
		caller.exec();
	}
	/** [MS_MSBGL0140_Del01]のCallerの作成 */
	protected MSBGP_RcvReg_MC.MS_MSBGL0140_Del01Caller createMS_MSBGL0140_Del01() {
		MSBGP_RcvReg_MC.MS_MSBGL0140_Del01Caller<MSBGP_RcvReg, MS_MSBGL0140_Del01Bridge>
		caller = ((MSBGP_RcvReg_MC)this).new MS_MSBGL0140_Del01Caller<MSBGP_RcvReg, MS_MSBGL0140_Del01Bridge>(
					(MSBGP_RcvReg)this, new MS_MSBGL0140_Del01Bridge());
		return caller;
	}
	/** [MS_MSBGL0140_Del01]の呼び出し */
	protected void callMS_MSBGL0140_Del01() {
		MCCaller caller = createMS_MSBGL0140_Del01();
		caller.exec();
	}
	/** [MS_MSBGL0140_Prnt01]のCallerの作成 */
	protected MSBGP_RcvReg_MC.MS_MSBGL0140_Prnt01Caller createMS_MSBGL0140_Prnt01() {
		MSBGP_RcvReg_MC.MS_MSBGL0140_Prnt01Caller<MSBGP_RcvReg, MS_MSBGL0140_Prnt01Bridge>
		caller = ((MSBGP_RcvReg_MC)this).new MS_MSBGL0140_Prnt01Caller<MSBGP_RcvReg, MS_MSBGL0140_Prnt01Bridge>(
					(MSBGP_RcvReg)this, new MS_MSBGL0140_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBGL0140_Prnt01]の呼び出し */
	protected void callMS_MSBGL0140_Prnt01() {
		MCCaller caller = createMS_MSBGL0140_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0140.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0140.HdrR aHdrR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBG.MSBGP0140.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0140.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0140.CndR createCndR() {
		return mcframe.clientMSBG.MSBGP0140.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBG.MSBGP0140.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBG.MSBGP0140.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBG.MSBGP0140.HdrR createHdrR() {
		return mcframe.clientMSBG.MSBGP0140.HdrR.create();
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
		ret.add(Hdr2Panel);
		ret.add(NotePanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_RcvReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBGP_RcvReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBGP_RcvReg_MC.jbCreateScreenOpe((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbCreateCnd((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbCreateHdrTab((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbCreateHdr((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbCreateHdr2((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbCreateNote((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbCreateBtn((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbCreateEastBtn((MSBGP_RcvReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBGP_RcvReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBGP_RcvReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBGP_RcvReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBGP_RcvReg p) {
		p.Hdr_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getHdrR().usr_dpt_p());
		p.Hdr_usr_dpt_p_PPanel.setName("Hdr.usr_dpt_p");
		p.Hdr_rcv_usr_cd = p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.Hdr_rcv_usr_cd.addAliasName("Hdr.rcv_usr_cd", p);
		p.Hdr_rcv_usr_nm = p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.Hdr_rcv_usr_nm.addAliasName("Hdr.rcv_usr_nm", p);
		p.Hdr_rcv_dpt_cd = p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.Hdr_rcv_dpt_cd.addAliasName("Hdr.rcv_dpt_cd", p);
		p.Hdr_rcv_dpt_nm = p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.Hdr_rcv_dpt_nm.addAliasName("Hdr.rcv_dpt_nm", p);
		p.Hdr_xrate_p_PPanel = mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.create(p.getHdrR().xrate_p());
		p.Hdr_xrate_p_PPanel.setName("Hdr.xrate_p");
		p.Hdr_xrate = p.Hdr_xrate_p_PPanel.Xrate_xrate;
		p.Hdr_xrate.addAliasName("Hdr.xrate", p);
		p.Hdr_rcv_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().rcv_amt_p());
		p.Hdr_rcv_amt_p_PPanel.setName("Hdr.rcv_amt_p");
		p.Hdr_rcv_amt = p.Hdr_rcv_amt_p_PPanel.Amt_amt;
		p.Hdr_rcv_amt.addAliasName("Hdr.rcv_amt", p);
		p.Hdr_rcv_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().rcv_proc_amt_p());
		p.Hdr_rcv_proc_amt_p_PPanel.setName("Hdr.rcv_proc_amt_p");
		p.Hdr_rcv_proc_amt = p.Hdr_rcv_proc_amt_p_PPanel.Amt_amt;
		p.Hdr_rcv_proc_amt.addAliasName("Hdr.rcv_proc_amt", p);
		p.Hdr_not_proc_bal_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().not_proc_bal_p());
		p.Hdr_not_proc_bal_p_PPanel.setName("Hdr.not_proc_bal_p");
		p.Hdr_not_proc_bal = p.Hdr_not_proc_bal_p_PPanel.Amt_amt;
		p.Hdr_not_proc_bal.addAliasName("Hdr.not_proc_bal", p);
		p.Hdr_com_paid_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().com_paid_p());
		p.Hdr_com_paid_p_PPanel.setName("Hdr.com_paid_p");
		p.Hdr_com_paid = p.Hdr_com_paid_p_PPanel.Amt_amt;
		p.Hdr_com_paid.addAliasName("Hdr.com_paid", p);
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MSBGP_RcvReg p) {
	}

	/**
	 * [Note]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateNote(MSBGP_RcvReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBGP_RcvReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBGP_RcvReg p) {
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
			Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "rcv_dpt_cd", "rcv_dpt_nm","wg_cd","wg_nm","def_bank_ac_cd");
		}
		return Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Hdr_rcst_cd_ListPutter]の定義 */
	private MCListPutter Hdr_rcst_cd_p = null;

	/**
	 * [Hdr_rcst_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_rcst_cd_ListPutter() {
		if (Hdr_rcst_cd_p == null) {
			Hdr_rcst_cd_p = createHdr_rcst_cd_ListPutter(Hdr_rcst_cd, "rcst_cd", "rcst_nm","rcv_auto_appl_tgt_flg","auto_appl_delay_days","xfr_psn");

		}
		return Hdr_rcst_cd_p;
	}
	
	
	/** [Hdr_bcst_cd_ListPutter]の定義 */
	private MCListPutter Hdr_bcst_cd_p = null;

	/**
	 * [Hdr_bcst_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_bcst_cd_ListPutter() {
		if (Hdr_bcst_cd_p == null) {
			Hdr_bcst_cd_p = createHdr_bcst_cd_ListPutter(Hdr_bcst_cd, "bcst_cd", "bcst_nm");

		}
		return Hdr_bcst_cd_p;
	}
	
	
	/** [Hdr_bill_dpt_cd_ListPutter]の定義 */
	private MCListPutter Hdr_bill_dpt_cd_p = null;

	/**
	 * [Hdr_bill_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_bill_dpt_cd_ListPutter() {
		if (Hdr_bill_dpt_cd_p == null) {
			Hdr_bill_dpt_cd_p = createHdr_bill_dpt_cd_ListPutter(Hdr_bill_dpt_cd, "bill_dpt_cd", "bill_dpt_nm");

		}
		return Hdr_bill_dpt_cd_p;
	}
	
	
	/** [Hdr_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Hdr_trd_cur_cd_p = null;

	/**
	 * [Hdr_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_trd_cur_cd_ListPutter() {
		if (Hdr_trd_cur_cd_p == null) {
			Hdr_trd_cur_cd_p = createHdr_trd_cur_cd_ListPutter(Hdr_trd_cur_cd, "trd_cur_cd", "trd_cur_nm","amt_dec_place");

		}
		return Hdr_trd_cur_cd_p;
	}
	
	
	/** [Hdr_rcv_mtd_cd_ListPutter]の定義 */
	private MCListPutter Hdr_rcv_mtd_cd_p = null;

	/**
	 * [Hdr_rcv_mtd_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_rcv_mtd_cd_ListPutter() {
		if (Hdr_rcv_mtd_cd_p == null) {
			Hdr_rcv_mtd_cd_p = createHdr_rcv_mtd_cd_ListPutter(Hdr_rcv_mtd_cd, "rcv_mtd_cd", "rcv_mtd_nm","rcv_typ","xfr_psn");

		}
		return Hdr_rcv_mtd_cd_p;
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
	
	
	/** [Hdr_auto_appl_sts_typ_ListPutter]の定義 */
	private MCListPutter Hdr_auto_appl_sts_typ_p = null;

	/**
	 * [Hdr_auto_appl_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_auto_appl_sts_typ_ListPutter() {
		if (Hdr_auto_appl_sts_typ_p == null) {
			Hdr_auto_appl_sts_typ_p = createHdr_auto_appl_sts_typ_ListPutter(Hdr_auto_appl_sts_typ, "auto_appl_sts_typ", "auto_appl_sts_typ_nm");

		}
		return Hdr_auto_appl_sts_typ_p;
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_RcvReg create(){
		MSBGP_RcvReg p = new MSBGP_RcvReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_RcvReg create(String name){
		MSBGP_RcvReg p = new MSBGP_RcvReg(name);
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
		MSBGP_RcvReg_MC.jbfInitScreenOpe((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbfInitCnd((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbfInitHdrTab((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbfInitHdr((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbfInitHdr2((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbfInitNote((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbfInitBtn((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbfInitEastBtn((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbInitScreenOpe((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbInitCnd((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbInitHdrTab((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbInitHdr((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbInitHdr2((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbInitNote((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbInitBtn((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.jbInitEastBtn((MSBGP_RcvReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBGP_RcvReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBGP_RcvReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_rcv_no_Label = p.beansFactory.createLabel("Cnd.rcv_no_Label");
		p.Cnd_rcv_no = p.beansFactory.createTextField("Cnd.rcv_no");
		p.Cnd_rcv_no.setLabel(p.Cnd_rcv_no_Label);
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBGP_RcvReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBGP_RcvReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_rcv_no_Label = p.beansFactory.createLabel("Hdr.rcv_no_Label");
		p.Hdr_rcv_no = p.beansFactory.createTextField("Hdr.rcv_no");
		p.Hdr_rcv_no.setLabel(p.Hdr_rcv_no_Label);
		p.Hdr_rcv_dt_Label = p.beansFactory.createLabel("Hdr.rcv_dt_Label");
		p.Hdr_rcv_dt = p.beansFactory.createDateField("Hdr.rcv_dt");
		p.Hdr_rcv_dt.setLabel(p.Hdr_rcv_dt_Label);
		p.Hdr_div_flg = p.beansFactory.createCheckBox("Hdr.div_flg");
		p.Hdr_opn_flg = p.beansFactory.createCheckBox("Hdr.opn_flg");
		p.Hdr_prnt_flg = p.beansFactory.createCheckBox("Hdr.prnt_flg");
		p.Hdr_fb_flg = p.beansFactory.createCheckBox("Hdr.fb_flg");
		p.Hdr_wg_cd_Label = p.beansFactory.createLabel("Hdr.wg_cd_Label");
		p.Hdr_wg_cd = p.beansFactory.createTextField("Hdr.wg_cd");
		p.Hdr_wg_cd.setLabel(p.Hdr_wg_cd_Label);
		p.Hdr_wg_nm = p.beansFactory.createTextField("Hdr.wg_nm");
		p.Hdr_rcst_cd_Label = p.beansFactory.createLabel("Hdr.rcst_cd_Label");
		p.Hdr_rcst_cd = p.beansFactory.createTextField("Hdr.rcst_cd");
		p.Hdr_rcst_cd.setLabel(p.Hdr_rcst_cd_Label);
		p.Hdr_rcst_nm = p.beansFactory.createTextField("Hdr.rcst_nm");
		p.Hdr_bcst_cd_Label = p.beansFactory.createLabel("Hdr.bcst_cd_Label");
		p.Hdr_bcst_cd = p.beansFactory.createTextComboBox("Hdr.bcst_cd");
		p.Hdr_bcst_cd.setLabel(p.Hdr_bcst_cd_Label);
		p.Hdr_bcst_nm = p.beansFactory.createTextField("Hdr.bcst_nm");
		p.Hdr_bill_dpt_cd_Label = p.beansFactory.createLabel("Hdr.bill_dpt_cd_Label");
		p.Hdr_bill_dpt_cd = p.beansFactory.createTextComboBox("Hdr.bill_dpt_cd");
		p.Hdr_bill_dpt_cd.setLabel(p.Hdr_bill_dpt_cd_Label);
		p.Hdr_bill_dpt_nm = p.beansFactory.createTextField("Hdr.bill_dpt_nm");
		p.Hdr_trd_cur_cd_Label = p.beansFactory.createLabel("Hdr.trd_cur_cd_Label");
		p.Hdr_trd_cur_cd = p.beansFactory.createTextComboBox("Hdr.trd_cur_cd");
		p.Hdr_trd_cur_cd.setLabel(p.Hdr_trd_cur_cd_Label);
		p.Hdr_trd_cur_nm = p.beansFactory.createTextField("Hdr.trd_cur_nm");
		p.Hdr_amt_dec_place = p.beansFactory.createNumberField("Hdr.amt_dec_place");
		p.Hdr_base_cur_cd = p.beansFactory.createTextField("Hdr.base_cur_cd");
		p.Hdr_xrate_cd_Label = p.beansFactory.createLabel("Hdr.xrate_cd_Label");
		p.Hdr_xrate_cd = p.beansFactory.createTextField("Hdr.xrate_cd");
		p.Hdr_xrate_cd.setLabel(p.Hdr_xrate_cd_Label);
		p.Hdr_rcv_mtd_cd_Label = p.beansFactory.createLabel("Hdr.rcv_mtd_cd_Label");
		p.Hdr_rcv_mtd_cd = p.beansFactory.createTextComboBox("Hdr.rcv_mtd_cd");
		p.Hdr_rcv_mtd_cd.setLabel(p.Hdr_rcv_mtd_cd_Label);
		p.Hdr_rcv_mtd_nm = p.beansFactory.createTextField("Hdr.rcv_mtd_nm");
		p.Hdr_rcv_typ = p.beansFactory.createTextField("Hdr.rcv_typ");
		p.Hdr_def_bank_ac_cd = p.beansFactory.createTextField("Hdr.def_bank_ac_cd");
		p.Hdr_bank_ac_cd_Label = p.beansFactory.createLabel("Hdr.bank_ac_cd_Label");
		p.Hdr_bank_ac_cd = p.beansFactory.createTextComboBox("Hdr.bank_ac_cd");
		p.Hdr_bank_ac_cd.setLabel(p.Hdr_bank_ac_cd_Label);
		p.Hdr_bank_ac_nm = p.beansFactory.createTextField("Hdr.bank_ac_nm");
		p.Hdr_xfr_psn_Label = p.beansFactory.createLabel("Hdr.xfr_psn_Label");
		p.Hdr_xfr_psn = p.beansFactory.createTextField("Hdr.xfr_psn");
		p.Hdr_xfr_psn.setLabel(p.Hdr_xfr_psn_Label);
		p.Hdr_ext_sys_cd_Label = p.beansFactory.createLabel("Hdr.ext_sys_cd_Label");
		p.Hdr_ext_sys_cd = p.beansFactory.createTextField("Hdr.ext_sys_cd");
		p.Hdr_ext_sys_cd.setLabel(p.Hdr_ext_sys_cd_Label);
		p.Hdr_ext_sys_nm = p.beansFactory.createTextField("Hdr.ext_sys_nm");
		p.Hdr_ext_rcv_no_Label = p.beansFactory.createLabel("Hdr.ext_rcv_no_Label");
		p.Hdr_ext_rcv_no = p.beansFactory.createTextField("Hdr.ext_rcv_no");
		p.Hdr_ext_rcv_no.setLabel(p.Hdr_ext_rcv_no_Label);
		p.Hdr_rcv_rmrks_Label = p.beansFactory.createLabel("Hdr.rcv_rmrks_Label");
		p.Hdr_rcv_rmrks = p.beansFactory.createTextField("Hdr.rcv_rmrks");
		p.Hdr_rcv_rmrks.setLabel(p.Hdr_rcv_rmrks_Label);
		p.Hdr_rcv_sub_char1_Label = p.beansFactory.createLabel("Hdr.rcv_sub_char1_Label");
		p.Hdr_rcv_sub_char1 = p.beansFactory.createTextField("Hdr.rcv_sub_char1");
		p.Hdr_rcv_sub_char1.setLabel(p.Hdr_rcv_sub_char1_Label);
		p.Hdr_rcv_sub_char2_Label = p.beansFactory.createLabel("Hdr.rcv_sub_char2_Label");
		p.Hdr_rcv_sub_char2 = p.beansFactory.createTextField("Hdr.rcv_sub_char2");
		p.Hdr_rcv_sub_char2.setLabel(p.Hdr_rcv_sub_char2_Label);
		p.Hdr_rcv_sub_char3_Label = p.beansFactory.createLabel("Hdr.rcv_sub_char3_Label");
		p.Hdr_rcv_sub_char3 = p.beansFactory.createTextField("Hdr.rcv_sub_char3");
		p.Hdr_rcv_sub_char3.setLabel(p.Hdr_rcv_sub_char3_Label);
		p.Hdr_rcv_auto_appl_tgt_flg = p.beansFactory.createCheckBox("Hdr.rcv_auto_appl_tgt_flg");
		p.Hdr_auto_appl_basis_dt_Label = p.beansFactory.createLabel("Hdr.auto_appl_basis_dt_Label");
		p.Hdr_auto_appl_basis_dt = p.beansFactory.createDateField("Hdr.auto_appl_basis_dt");
		p.Hdr_auto_appl_basis_dt.setLabel(p.Hdr_auto_appl_basis_dt_Label);
		p.Hdr_auto_appl_delay_days = p.beansFactory.createNumberField("Hdr.auto_appl_delay_days");
		p.Hdr_auto_appl_sts_typ_Label = p.beansFactory.createLabel("Hdr.auto_appl_sts_typ_Label");
		p.Hdr_auto_appl_sts_typ = p.beansFactory.createTextField("Hdr.auto_appl_sts_typ");
		p.Hdr_auto_appl_sts_typ.setLabel(p.Hdr_auto_appl_sts_typ_Label);
		p.Hdr_auto_appl_sts_typ_nm = p.beansFactory.createTextField("Hdr.auto_appl_sts_typ_nm");
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
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr2(MSBGP_RcvReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [Note]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitNote(MSBGP_RcvReg p) {
		// ブロック関連の初期化
		p.NotePanel = p.beansFactory.createPanel("Note");
		p.NoteTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBGP_RcvReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBGP0200 = p.beansFactory.createButton("Btn.open_MSBGP0200", "open");
		p.Btn_open_MSBGP0210 = p.beansFactory.createButton("Btn.open_MSBGP0210", "open");
		p.Btn_open_MSBGP0160 = p.beansFactory.createButton("Btn.open_MSBGP0160", "open");
		p.Btn_open_MSBGP0250 = p.beansFactory.createButton("Btn.open_MSBGP0250", "open");
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBGP_RcvReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBGP_RcvReg p) {
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
	protected static void jbInitCnd(MSBGP_RcvReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0140.CndR.ope_META);
		p.CndPanel.add(p.Cnd_rcv_no_Label);
		p.CndPanel.add(p.Cnd_rcv_no);
		p.CndPanel.setLastBeans(p.Cnd_rcv_no);
		p.Cnd_rcv_no.setNextBeans(p.Cnd_srch);
		p.Cnd_rcv_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0140.CndR.rcv_no_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBGP_RcvReg p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.NotePanel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.HdrPanel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		p.HdrTabTab.add(p.Hdr2Panel, "HdrTab.tab2");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBGP_RcvReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		p.HdrPanel.setValueCheck(false);
		p.HdrPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_rcv_no_Label);
		p.HdrPanel.add(p.Hdr_rcv_no);
		p.HdrPanel.setLastBeans(p.Hdr_rcv_no);
		p.Hdr_rcv_no.setNextBeans(p.Hdr_rcv_dt);
		p.Hdr_rcv_no.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.rcv_no_META);
		p.HdrPanel.add(p.Hdr_rcv_dt_Label);
		p.HdrPanel.add(p.Hdr_rcv_dt);
		p.Hdr_rcv_dt.setNextBeans(p.Hdr_div_flg);
		p.Hdr_rcv_dt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.rcv_dt_META);
		p.Hdr_rcv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_div_flg);
		p.Hdr_div_flg.setNextBeans(p.Hdr_opn_flg);
		p.Hdr_div_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.div_flg_META);
		p.HdrPanel.add(p.Hdr_opn_flg);
		p.Hdr_opn_flg.setNextBeans(p.Hdr_prnt_flg);
		p.Hdr_opn_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.opn_flg_META);
		p.HdrPanel.add(p.Hdr_prnt_flg);
		p.Hdr_prnt_flg.setNextBeans(p.Hdr_fb_flg);
		p.Hdr_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.prnt_flg_META);
		p.HdrPanel.add(p.Hdr_fb_flg);
		p.Hdr_fb_flg.setNextBeans(p.Hdr_usr_dpt_p_PPanel);
		p.Hdr_fb_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.fb_flg_META);
		p.HdrPanel.add(p.Hdr_usr_dpt_p_PPanel);
		p.Hdr_usr_dpt_p_PPanel.setNextBeans(p.Hdr_wg_cd);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Hdr_rcv_dpt_nm,p.Hdr_wg_cd,p.Hdr_wg_nm,p.Hdr_def_bank_ac_cd);
		p.HdrPanel.add(p.Hdr_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_wg_cd);
		p.Hdr_wg_cd.setNextBeans(p.Hdr_wg_nm);
		p.Hdr_wg_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.wg_cd_META);
		p.HdrPanel.add(p.Hdr_wg_nm);
		p.Hdr_wg_nm.setNextBeans(p.Hdr_rcst_cd);
		p.Hdr_wg_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.wg_nm_META);
		p.HdrPanel.add(p.Hdr_rcst_cd_Label);
		p.HdrPanel.add(p.Hdr_rcst_cd);
		p.Hdr_rcst_cd.setNextBeans(p.Hdr_rcst_nm);
		p.Hdr_rcst_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.rcst_cd_META);
		p.Hdr_rcst_cd.addLinkBeans(p.Hdr_rcst_nm,p.Hdr_rcv_auto_appl_tgt_flg,p.Hdr_auto_appl_delay_days,p.Hdr_xfr_psn);
		p.Hdr_rcst_cd.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_rcst_nm);
		p.Hdr_rcst_nm.setNextBeans(p.Hdr_bcst_cd);
		p.Hdr_rcst_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.rcst_nm_META);
		p.Hdr_bcst_cd.setListType(MCListType.STRICT);
		p.Hdr_bcst_cd.setLinkBeans(p.Hdr_bcst_nm);
		p.HdrPanel.add(p.Hdr_bcst_cd_Label);
		p.HdrPanel.add(p.Hdr_bcst_cd);
		p.Hdr_bcst_cd.setNextBeans(p.Hdr_bcst_nm);
		p.Hdr_bcst_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.bcst_cd_META);
		p.HdrPanel.add(p.Hdr_bcst_nm);
		p.Hdr_bcst_nm.setNextBeans(p.Hdr_bill_dpt_cd);
		p.Hdr_bcst_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.bcst_nm_META);
		p.Hdr_bill_dpt_cd.setListType(MCListType.STRICT);
		p.Hdr_bill_dpt_cd.setLinkBeans(p.Hdr_bill_dpt_nm);
		p.HdrPanel.add(p.Hdr_bill_dpt_cd_Label);
		p.HdrPanel.add(p.Hdr_bill_dpt_cd);
		p.Hdr_bill_dpt_cd.setNextBeans(p.Hdr_bill_dpt_nm);
		p.Hdr_bill_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.bill_dpt_cd_META);
		p.HdrPanel.add(p.Hdr_bill_dpt_nm);
		p.Hdr_bill_dpt_nm.setNextBeans(p.Hdr_trd_cur_cd);
		p.Hdr_bill_dpt_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.bill_dpt_nm_META);
		p.Hdr_trd_cur_cd.setListType(MCListType.STRICT);
		p.Hdr_trd_cur_cd.setLinkBeans(p.Hdr_trd_cur_nm,p.Hdr_amt_dec_place);
		p.HdrPanel.add(p.Hdr_trd_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cur_cd);
		p.Hdr_trd_cur_cd.setNextBeans(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.trd_cur_cd_META);
		p.HdrPanel.add(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_nm.setNextBeans(p.Hdr_amt_dec_place);
		p.Hdr_trd_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.trd_cur_nm_META);
		p.HdrPanel.add(p.Hdr_amt_dec_place);
		p.Hdr_amt_dec_place.setNextBeans(p.Hdr_xrate_p_PPanel);
		p.Hdr_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_xrate_p_PPanel);
		p.Hdr_xrate_p_PPanel.setNextBeans(p.Hdr_base_cur_cd);
		p.HdrPanel.add(p.Hdr_base_cur_cd);
		p.Hdr_base_cur_cd.setNextBeans(p.Hdr_xrate_cd);
		p.Hdr_base_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.base_cur_cd_META);
		p.HdrPanel.add(p.Hdr_xrate_cd_Label);
		p.HdrPanel.add(p.Hdr_xrate_cd);
		p.Hdr_xrate_cd.setNextBeans(p.Hdr_rcv_amt_p_PPanel);
		p.Hdr_xrate_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.xrate_cd_META);
		p.HdrPanel.add(p.Hdr_rcv_amt_p_PPanel);
		p.Hdr_rcv_amt_p_PPanel.setNextBeans(p.Hdr_rcv_proc_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_rcv_proc_amt_p_PPanel);
		p.Hdr_rcv_proc_amt_p_PPanel.setNextBeans(p.Hdr_not_proc_bal_p_PPanel);
		p.HdrPanel.add(p.Hdr_not_proc_bal_p_PPanel);
		p.Hdr_not_proc_bal_p_PPanel.setNextBeans(p.Hdr_rcv_mtd_cd);
		p.Hdr_rcv_mtd_cd.setListType(MCListType.STRICT);
		p.Hdr_rcv_mtd_cd.setLinkBeans(p.Hdr_rcv_mtd_nm,p.Hdr_rcv_typ,p.Hdr_xfr_psn);
		p.HdrPanel.add(p.Hdr_rcv_mtd_cd_Label);
		p.HdrPanel.add(p.Hdr_rcv_mtd_cd);
		p.Hdr_rcv_mtd_cd.setNextBeans(p.Hdr_rcv_mtd_nm);
		p.Hdr_rcv_mtd_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.rcv_mtd_cd_META);
		p.HdrPanel.add(p.Hdr_rcv_mtd_nm);
		p.Hdr_rcv_mtd_nm.setNextBeans(p.Hdr_rcv_typ);
		p.Hdr_rcv_mtd_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.rcv_mtd_nm_META);
		p.HdrPanel.add(p.Hdr_rcv_typ);
		p.Hdr_rcv_typ.setNextBeans(p.Hdr_def_bank_ac_cd);
		p.Hdr_rcv_typ.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.rcv_typ_META);
		p.HdrPanel.add(p.Hdr_def_bank_ac_cd);
		p.Hdr_def_bank_ac_cd.setNextBeans(p.Hdr_bank_ac_cd);
		p.Hdr_def_bank_ac_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.def_bank_ac_cd_META);
		p.Hdr_bank_ac_cd.setListType(MCListType.STRICT);
		p.Hdr_bank_ac_cd.setLinkBeans(p.Hdr_bank_ac_nm);
		p.HdrPanel.add(p.Hdr_bank_ac_cd_Label);
		p.HdrPanel.add(p.Hdr_bank_ac_cd);
		p.Hdr_bank_ac_cd.setNextBeans(p.Hdr_bank_ac_nm);
		p.Hdr_bank_ac_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.bank_ac_cd_META);
		p.HdrPanel.add(p.Hdr_bank_ac_nm);
		p.Hdr_bank_ac_nm.setNextBeans(p.Hdr_xfr_psn);
		p.Hdr_bank_ac_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.bank_ac_nm_META);
		p.HdrPanel.add(p.Hdr_xfr_psn_Label);
		p.HdrPanel.add(p.Hdr_xfr_psn);
		p.Hdr_xfr_psn.setNextBeans(p.Hdr_ext_sys_cd);
		p.Hdr_xfr_psn.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.xfr_psn_META);
		p.HdrPanel.add(p.Hdr_ext_sys_cd_Label);
		p.HdrPanel.add(p.Hdr_ext_sys_cd);
		p.Hdr_ext_sys_cd.setNextBeans(p.Hdr_ext_sys_nm);
		p.Hdr_ext_sys_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.ext_sys_cd_META);
		p.HdrPanel.add(p.Hdr_ext_sys_nm);
		p.Hdr_ext_sys_nm.setNextBeans(p.Hdr_ext_rcv_no);
		p.Hdr_ext_sys_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.ext_sys_nm_META);
		p.HdrPanel.add(p.Hdr_ext_rcv_no_Label);
		p.HdrPanel.add(p.Hdr_ext_rcv_no);
		p.Hdr_ext_rcv_no.setNextBeans(p.Hdr_rcv_rmrks);
		p.Hdr_ext_rcv_no.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.ext_rcv_no_META);
		p.HdrPanel.add(p.Hdr_rcv_rmrks_Label);
		p.HdrPanel.add(p.Hdr_rcv_rmrks);
		p.Hdr_rcv_rmrks.setNextBeans(p.Hdr_rcv_sub_char1);
		p.Hdr_rcv_rmrks.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.rcv_rmrks_META);
		p.HdrPanel.add(p.Hdr_rcv_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_rcv_sub_char1);
		p.Hdr_rcv_sub_char1.setNextBeans(p.Hdr_rcv_sub_char2);
		p.Hdr_rcv_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.rcv_sub_char1_META);
		p.HdrPanel.add(p.Hdr_rcv_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_rcv_sub_char2);
		p.Hdr_rcv_sub_char2.setNextBeans(p.Hdr_rcv_sub_char3);
		p.Hdr_rcv_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.rcv_sub_char2_META);
		p.HdrPanel.add(p.Hdr_rcv_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_rcv_sub_char3);
		p.Hdr_rcv_sub_char3.setNextBeans(p.Hdr_rcv_auto_appl_tgt_flg);
		p.Hdr_rcv_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.rcv_sub_char3_META);
		p.HdrPanel.add(p.Hdr_rcv_auto_appl_tgt_flg);
		p.Hdr_rcv_auto_appl_tgt_flg.setNextBeans(p.Hdr_auto_appl_basis_dt);
		p.Hdr_rcv_auto_appl_tgt_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.rcv_auto_appl_tgt_flg_META);
		p.HdrPanel.add(p.Hdr_auto_appl_basis_dt_Label);
		p.HdrPanel.add(p.Hdr_auto_appl_basis_dt);
		p.Hdr_auto_appl_basis_dt.setNextBeans(p.Hdr_auto_appl_delay_days);
		p.Hdr_auto_appl_basis_dt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.auto_appl_basis_dt_META);
		p.Hdr_auto_appl_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_auto_appl_delay_days);
		p.Hdr_auto_appl_delay_days.setNextBeans(p.Hdr_com_paid_p_PPanel);
		p.Hdr_auto_appl_delay_days.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.auto_appl_delay_days_META);
		p.HdrPanel.add(p.Hdr_com_paid_p_PPanel);
		p.Hdr_com_paid_p_PPanel.setNextBeans(p.Hdr_auto_appl_sts_typ);
		p.HdrPanel.add(p.Hdr_auto_appl_sts_typ_Label);
		p.HdrPanel.add(p.Hdr_auto_appl_sts_typ);
		p.Hdr_auto_appl_sts_typ.setNextBeans(p.Hdr_auto_appl_sts_typ_nm);
		p.Hdr_auto_appl_sts_typ.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.auto_appl_sts_typ_META);
		p.Hdr_auto_appl_sts_typ.addLinkBeans(p.Hdr_auto_appl_sts_typ_nm);
		p.Hdr_auto_appl_sts_typ.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_auto_appl_sts_typ_nm);
		p.Hdr_auto_appl_sts_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.auto_appl_sts_typ_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.upd_srv_req_no_META);
		p.NotePanel.add(p.Hdr_note_no_Label);
		p.NotePanel.add(p.Hdr_note_no);
		p.NotePanel.setLastBeans(p.Hdr_note_no);
		p.Hdr_note_no.setNextBeans(p.Hdr_note_typ);
		p.Hdr_note_no.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.note_no_META);
		p.Hdr_note_typ.setListType(MCListType.STRICT);
		p.Hdr_note_typ.setLinkBeans(p.Hdr_note_typ_nm);
		p.NotePanel.add(p.Hdr_note_typ_Label);
		p.NotePanel.add(p.Hdr_note_typ);
		p.Hdr_note_typ.setNextBeans(p.Hdr_note_typ_nm);
		p.Hdr_note_typ.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.note_typ_META);
		p.NotePanel.add(p.Hdr_note_typ_nm);
		p.Hdr_note_typ_nm.setNextBeans(p.Hdr_draw_dt);
		p.Hdr_note_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.note_typ_nm_META);
		p.NotePanel.add(p.Hdr_draw_dt_Label);
		p.NotePanel.add(p.Hdr_draw_dt);
		p.Hdr_draw_dt.setNextBeans(p.Hdr_due_dt);
		p.Hdr_draw_dt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.draw_dt_META);
		p.Hdr_draw_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.NotePanel.add(p.Hdr_due_dt_Label);
		p.NotePanel.add(p.Hdr_due_dt);
		p.Hdr_due_dt.setNextBeans(p.Hdr_drawer_nm);
		p.Hdr_due_dt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.due_dt_META);
		p.Hdr_due_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.NotePanel.add(p.Hdr_drawer_nm_Label);
		p.NotePanel.add(p.Hdr_drawer_nm);
		p.Hdr_drawer_nm.setNextBeans(p.Hdr_endrsr);
		p.Hdr_drawer_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.drawer_nm_META);
		p.NotePanel.add(p.Hdr_endrsr_Label);
		p.NotePanel.add(p.Hdr_endrsr);
		p.Hdr_endrsr.setNextBeans(p.Hdr_accptr);
		p.Hdr_endrsr.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.endrsr_META);
		p.NotePanel.add(p.Hdr_accptr_Label);
		p.NotePanel.add(p.Hdr_accptr);
		p.Hdr_accptr.setNextBeans(p.Hdr_draw_bank_cd);
		p.Hdr_accptr.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.accptr_META);
		p.Hdr_draw_bank_cd.setListType(MCListType.STRICT);
		p.Hdr_draw_bank_cd.setLinkBeans(p.Hdr_draw_bank_nm);
		p.NotePanel.add(p.Hdr_draw_bank_cd_Label);
		p.NotePanel.add(p.Hdr_draw_bank_cd);
		p.Hdr_draw_bank_cd.setNextBeans(p.Hdr_draw_bank_nm);
		p.Hdr_draw_bank_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.draw_bank_cd_META);
		p.NotePanel.add(p.Hdr_draw_bank_nm);
		p.Hdr_draw_bank_nm.setNextBeans(p.Hdr_draw_branch_cd);
		p.Hdr_draw_bank_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.draw_bank_nm_META);
		p.Hdr_draw_branch_cd.setListType(MCListType.STRICT);
		p.Hdr_draw_branch_cd.setLinkBeans(p.Hdr_draw_branch_nm);
		p.NotePanel.add(p.Hdr_draw_branch_cd_Label);
		p.NotePanel.add(p.Hdr_draw_branch_cd);
		p.Hdr_draw_branch_cd.setNextBeans(p.Hdr_draw_branch_nm);
		p.Hdr_draw_branch_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.draw_branch_cd_META);
		p.NotePanel.add(p.Hdr_draw_branch_nm);
		p.Hdr_draw_branch_nm.setNextBeans(p.Hdr_note_rsn_cd);
		p.Hdr_draw_branch_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.draw_branch_nm_META);
		p.Hdr_note_rsn_cd.setListType(MCListType.STRICT);
		p.Hdr_note_rsn_cd.setLinkBeans(p.Hdr_note_rsn_nm);
		p.NotePanel.add(p.Hdr_note_rsn_cd_Label);
		p.NotePanel.add(p.Hdr_note_rsn_cd);
		p.Hdr_note_rsn_cd.setNextBeans(p.Hdr_note_rsn_nm);
		p.Hdr_note_rsn_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.note_rsn_cd_META);
		p.NotePanel.add(p.Hdr_note_rsn_nm);
		p.Hdr_note_rsn_nm.setNextBeans(p.Hdr_note_sub_char1);
		p.Hdr_note_rsn_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.note_rsn_nm_META);
		p.NotePanel.add(p.Hdr_note_sub_char1_Label);
		p.NotePanel.add(p.Hdr_note_sub_char1);
		p.Hdr_note_sub_char1.setNextBeans(p.Hdr_note_sub_char2);
		p.Hdr_note_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.note_sub_char1_META);
		p.NotePanel.add(p.Hdr_note_sub_char2_Label);
		p.NotePanel.add(p.Hdr_note_sub_char2);
		p.Hdr_note_sub_char2.setNextBeans(p.Hdr_note_sub_char3);
		p.Hdr_note_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.note_sub_char2_META);
		p.NotePanel.add(p.Hdr_note_sub_char3_Label);
		p.NotePanel.add(p.Hdr_note_sub_char3);
		p.Hdr_note_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0140.HdrR.note_sub_char3_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBGP_RcvReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Note]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitNote(MSBGP_RcvReg p) {
		// ブロック関連の初期化
		p.NotePanel.setBorder(p.NoteTitledBorder);
		p.add(p.NotePanel);
		p.NotePanel.setNextBeans(p.BtnPanel);
		p.NotePanel.setLayoutPosition("CS");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBGP_RcvReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBGP0200.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBGP0200);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBGP0200);
		p.Btn_open_MSBGP0200.setNextBeans(p.Btn_open_MSBGP0210);
		p.Btn_open_MSBGP0210.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBGP0210);
		p.Btn_open_MSBGP0210.setNextBeans(p.Btn_open_MSBGP0160);
		p.Btn_open_MSBGP0160.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBGP0160);
		p.Btn_open_MSBGP0160.setNextBeans(p.Btn_open_MSBGP0250);
		p.Btn_open_MSBGP0250.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_open_MSBGP0250);
		p.Btn_open_MSBGP0250.setNextBeans(p.Btn_prnt);
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_ins);
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
	protected static void jbInitEastBtn(MSBGP_RcvReg p) {
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
		MSBGP_RcvReg_MC.mcInitScreenOpe((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.mcInitCnd((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.mcInitHdrTab((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.mcInitHdr((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.mcInitHdr2((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.mcInitNote((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.mcInitBtn((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.mcInitEastBtn((MSBGP_RcvReg)this);

		// [INS]ステータスのモードの設定
		MSBGP_RcvReg_MC.statusInitINS_ScreenOpe((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitINS_Cnd((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitINS_HdrTab((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitINS_Hdr((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitINS_Hdr2((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitINS_Note((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitINS_Btn((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitINS_EastBtn((MSBGP_RcvReg)this);

		// [INS_NOTE]ステータスのモードの設定
		MSBGP_RcvReg_MC.statusInitINS__NOTE_ScreenOpe((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitINS__NOTE_Cnd((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitINS__NOTE_HdrTab((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitINS__NOTE_Hdr((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitINS__NOTE_Hdr2((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitINS__NOTE_Note((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitINS__NOTE_Btn((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitINS__NOTE_EastBtn((MSBGP_RcvReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBGP_RcvReg_MC.statusInitFIX__I_ScreenOpe((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__I_Cnd((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__I_HdrTab((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__I_Hdr((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__I_Hdr2((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__I_Note((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__I_Btn((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__I_EastBtn((MSBGP_RcvReg)this);

		// [SRCH]ステータスのモードの設定
		MSBGP_RcvReg_MC.statusInitSRCH_ScreenOpe((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitSRCH_Cnd((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitSRCH_HdrTab((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitSRCH_Hdr((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitSRCH_Hdr2((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitSRCH_Note((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitSRCH_Btn((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitSRCH_EastBtn((MSBGP_RcvReg)this);

		// [UPD]ステータスのモードの設定
		MSBGP_RcvReg_MC.statusInitUPD_ScreenOpe((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitUPD_Cnd((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitUPD_HdrTab((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitUPD_Hdr((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitUPD_Hdr2((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitUPD_Note((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitUPD_Btn((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitUPD_EastBtn((MSBGP_RcvReg)this);

		// [UPD_NOTE]ステータスのモードの設定
		MSBGP_RcvReg_MC.statusInitUPD__NOTE_ScreenOpe((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitUPD__NOTE_Cnd((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitUPD__NOTE_HdrTab((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitUPD__NOTE_Hdr((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitUPD__NOTE_Hdr2((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitUPD__NOTE_Note((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitUPD__NOTE_Btn((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitUPD__NOTE_EastBtn((MSBGP_RcvReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBGP_RcvReg_MC.statusInitFIX__U_ScreenOpe((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__U_Cnd((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__U_HdrTab((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__U_Hdr((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__U_Hdr2((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__U_Note((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__U_Btn((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__U_EastBtn((MSBGP_RcvReg)this);

		// [DEL]ステータスのモードの設定
		MSBGP_RcvReg_MC.statusInitDEL_ScreenOpe((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitDEL_Cnd((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitDEL_HdrTab((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitDEL_Hdr((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitDEL_Hdr2((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitDEL_Note((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitDEL_Btn((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitDEL_EastBtn((MSBGP_RcvReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBGP_RcvReg_MC.statusInitFIX__D_ScreenOpe((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__D_Cnd((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__D_HdrTab((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__D_Hdr((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__D_Hdr2((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__D_Note((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__D_Btn((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitFIX__D_EastBtn((MSBGP_RcvReg)this);

		// [REF]ステータスのモードの設定
		MSBGP_RcvReg_MC.statusInitREF_ScreenOpe((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitREF_Cnd((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitREF_HdrTab((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitREF_Hdr((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitREF_Hdr2((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitREF_Note((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitREF_Btn((MSBGP_RcvReg)this);
		MSBGP_RcvReg_MC.statusInitREF_EastBtn((MSBGP_RcvReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBGP_RcvReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBGP_RcvReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_rcv_no.setListListener(p);
		p.Cnd_rcv_no.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBGP_RcvReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBGP_RcvReg p) {
		p.Hdr_rcv_no.setListListener(p);
		p.Hdr_rcv_no.addAllListener(p);
		p.Hdr_rcv_dt.setListListener(p);
		p.Hdr_rcv_dt.addAllListener(p);
		p.Hdr_div_flg.addAllListener(p);
		p.Hdr_opn_flg.addAllListener(p);
		p.Hdr_prnt_flg.addAllListener(p);
		p.Hdr_fb_flg.addAllListener(p);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_wg_cd.setListListener(p);
		p.Hdr_wg_cd.addAllListener(p);
		p.Hdr_wg_nm.setListListener(p);
		p.Hdr_wg_nm.addAllListener(p);
		p.Hdr_rcst_cd.setListListener(p);
		p.Hdr_rcst_cd.addAllListener(p);
		p.Hdr_rcst_nm.setListListener(p);
		p.Hdr_rcst_nm.addAllListener(p);
		p.Hdr_bcst_cd.setListListener(p);
		p.Hdr_bcst_cd.addAllListener(p);
		p.Hdr_bcst_nm.setListListener(p);
		p.Hdr_bcst_nm.addAllListener(p);
		p.Hdr_bill_dpt_cd.setListListener(p);
		p.Hdr_bill_dpt_cd.addAllListener(p);
		p.Hdr_bill_dpt_nm.setListListener(p);
		p.Hdr_bill_dpt_nm.addAllListener(p);
		p.Hdr_trd_cur_cd.setListListener(p);
		p.Hdr_trd_cur_cd.addAllListener(p);
		p.Hdr_trd_cur_nm.setListListener(p);
		p.Hdr_trd_cur_nm.addAllListener(p);
		p.Hdr_amt_dec_place.setListListener(p);
		p.Hdr_amt_dec_place.addAllListener(p);
		p.Hdr_base_cur_cd.setListListener(p);
		p.Hdr_base_cur_cd.addAllListener(p);
		p.Hdr_xrate_cd.setListListener(p);
		p.Hdr_xrate_cd.addAllListener(p);
		p.Hdr_rcv_mtd_cd.setListListener(p);
		p.Hdr_rcv_mtd_cd.addAllListener(p);
		p.Hdr_rcv_mtd_nm.setListListener(p);
		p.Hdr_rcv_mtd_nm.addAllListener(p);
		p.Hdr_rcv_typ.setListListener(p);
		p.Hdr_rcv_typ.addAllListener(p);
		p.Hdr_def_bank_ac_cd.setListListener(p);
		p.Hdr_def_bank_ac_cd.addAllListener(p);
		p.Hdr_bank_ac_cd.setListListener(p);
		p.Hdr_bank_ac_cd.addAllListener(p);
		p.Hdr_bank_ac_nm.setListListener(p);
		p.Hdr_bank_ac_nm.addAllListener(p);
		p.Hdr_xfr_psn.setListListener(p);
		p.Hdr_xfr_psn.addAllListener(p);
		p.Hdr_ext_sys_cd.setListListener(p);
		p.Hdr_ext_sys_cd.addAllListener(p);
		p.Hdr_ext_sys_nm.setListListener(p);
		p.Hdr_ext_sys_nm.addAllListener(p);
		p.Hdr_ext_rcv_no.setListListener(p);
		p.Hdr_ext_rcv_no.addAllListener(p);
		p.Hdr_rcv_rmrks.setListListener(p);
		p.Hdr_rcv_rmrks.addAllListener(p);
		p.Hdr_rcv_sub_char1.setListListener(p);
		p.Hdr_rcv_sub_char1.addAllListener(p);
		p.Hdr_rcv_sub_char2.setListListener(p);
		p.Hdr_rcv_sub_char2.addAllListener(p);
		p.Hdr_rcv_sub_char3.setListListener(p);
		p.Hdr_rcv_sub_char3.addAllListener(p);
		p.Hdr_rcv_auto_appl_tgt_flg.addAllListener(p);
		p.Hdr_auto_appl_basis_dt.setListListener(p);
		p.Hdr_auto_appl_basis_dt.addAllListener(p);
		p.Hdr_auto_appl_delay_days.setListListener(p);
		p.Hdr_auto_appl_delay_days.addAllListener(p);
		p.Hdr_auto_appl_sts_typ.setListListener(p);
		p.Hdr_auto_appl_sts_typ.addAllListener(p);
		p.Hdr_auto_appl_sts_typ_nm.setListListener(p);
		p.Hdr_auto_appl_sts_typ_nm.addAllListener(p);
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
		p.Hdr_note_no.setListListener(p);
		p.Hdr_note_no.addAllListener(p);
		p.Hdr_note_typ.setListListener(p);
		p.Hdr_note_typ.addAllListener(p);
		p.Hdr_note_typ_nm.setListListener(p);
		p.Hdr_note_typ_nm.addAllListener(p);
		p.Hdr_draw_dt.setListListener(p);
		p.Hdr_draw_dt.addAllListener(p);
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
	}

	/**
	 *  [Hdr2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr2(MSBGP_RcvReg p) {
	}

	/**
	 *  [Note]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitNote(MSBGP_RcvReg p) {
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBGP_RcvReg p) {
		p.Btn_open_MSBGP0200.addAllListener(p);
		p.Btn_open_MSBGP0200.setAPMethodName("doBtn_open_MSBGP0200");
		p.Btn_open_MSBGP0210.addAllListener(p);
		p.Btn_open_MSBGP0210.setAPMethodName("doBtn_open_MSBGP0210");
		p.Btn_open_MSBGP0160.addAllListener(p);
		p.Btn_open_MSBGP0160.setAPMethodName("doBtn_open_MSBGP0160");
		p.Btn_open_MSBGP0250.addAllListener(p);
		p.Btn_open_MSBGP0250.setAPMethodName("doBtn_open_MSBGP0250");
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
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
	protected static void mcInitEastBtn(MSBGP_RcvReg p) {
	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBGP_RcvReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBGP_RcvReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_rcv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBGP_RcvReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBGP_RcvReg p){
		p.Hdr_rcv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_rcv_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_div_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_opn_flg.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_prnt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_fb_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_rcst_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_rcst_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_bcst_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_bcst_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_trd_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_base_cur_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_xrate_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_rcv_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.REQUIRED);
		p.Hdr_rcv_proc_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_not_proc_bal_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_mtd_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_rcv_mtd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_rcv_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_def_bank_ac_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_bank_ac_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_bank_ac_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_xfr_psn.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_ext_sys_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ext_rcv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_rcv_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_rcv_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_rcv_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_rcv_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_rcv_auto_appl_tgt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_auto_appl_basis_dt.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_auto_appl_delay_days.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_com_paid_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.ENABLE);
		p.Hdr_auto_appl_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_auto_appl_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
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
		p.Hdr_note_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_note_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_note_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_draw_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_due_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_drawer_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_endrsr.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_accptr.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_draw_bank_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_draw_bank_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_draw_branch_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_draw_branch_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_note_rsn_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_note_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_note_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_note_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_note_sub_char3.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr2(MSBGP_RcvReg p){

	}

	/**
	 * [INS]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitINS_Note(MSBGP_RcvReg p){

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBGP_RcvReg p){
		p.Btn_open_MSBGP0200.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MSBGP0210.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MSBGP0160.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MSBGP0250.putMode(p, INS, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, INS, MCMode.DISABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBGP_RcvReg p){

	}

	/**
	 * [INS_NOTE]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__NOTE_ScreenOpe(MSBGP_RcvReg p){

	}

	/**
	 * [INS_NOTE]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__NOTE_Cnd(MSBGP_RcvReg p){
		p.Cnd_ope_Group.putMode(p, INS_NOTE, MCMode.REQUIRED);
		p.Cnd_rcv_no.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS_NOTE, MCMode.DISABLE);

	}

	/**
	 * [INS_NOTE]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__NOTE_HdrTab(MSBGP_RcvReg p){

	}

	/**
	 * [INS_NOTE]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__NOTE_Hdr(MSBGP_RcvReg p){
		p.Hdr_rcv_no.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_rcv_dt.putMode(p, INS_NOTE, MCMode.REQUIRED);
		p.Hdr_div_flg.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_opn_flg.putMode(p, INS_NOTE, MCMode.ENABLE);
		p.Hdr_prnt_flg.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_fb_flg.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(INS_NOTE, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, INS_NOTE, MCMode.ENABLE);
		p.Hdr_wg_cd.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_rcst_cd.putMode(p, INS_NOTE, MCMode.ENABLE);
		p.Hdr_rcst_nm.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_bcst_cd.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_bcst_nm.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_cd.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_nm.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, INS_NOTE, MCMode.REQUIRED);
		p.Hdr_trd_cur_nm.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, INS_NOTE, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(INS_NOTE, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_base_cur_cd.putMode(p, INS_NOTE, MCMode.INVISIBLE);
		p.Hdr_xrate_cd.putMode(p, INS_NOTE, MCMode.INVISIBLE);
		p.Hdr_rcv_amt_p_PPanel.putStatus(INS_NOTE, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.REQUIRED);
		p.Hdr_rcv_proc_amt_p_PPanel.putStatus(INS_NOTE, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_not_proc_bal_p_PPanel.putStatus(INS_NOTE, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_mtd_cd.putMode(p, INS_NOTE, MCMode.REQUIRED);
		p.Hdr_rcv_mtd_nm.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_rcv_typ.putMode(p, INS_NOTE, MCMode.INVISIBLE);
		p.Hdr_def_bank_ac_cd.putMode(p, INS_NOTE, MCMode.INVISIBLE);
		p.Hdr_bank_ac_cd.putMode(p, INS_NOTE, MCMode.ENABLE);
		p.Hdr_bank_ac_nm.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_xfr_psn.putMode(p, INS_NOTE, MCMode.ENABLE);
		p.Hdr_ext_sys_cd.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_ext_rcv_no.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_rcv_rmrks.putMode(p, INS_NOTE, MCMode.ENABLE);
		p.Hdr_rcv_sub_char1.putMode(p, INS_NOTE, MCMode.ENABLE);
		p.Hdr_rcv_sub_char2.putMode(p, INS_NOTE, MCMode.ENABLE);
		p.Hdr_rcv_sub_char3.putMode(p, INS_NOTE, MCMode.ENABLE);
		p.Hdr_rcv_auto_appl_tgt_flg.putMode(p, INS_NOTE, MCMode.REQUIRED);
		p.Hdr_auto_appl_basis_dt.putMode(p, INS_NOTE, MCMode.ENABLE);
		p.Hdr_auto_appl_delay_days.putMode(p, INS_NOTE, MCMode.INVISIBLE);
		p.Hdr_com_paid_p_PPanel.putStatus(INS_NOTE, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.ENABLE);
		p.Hdr_auto_appl_sts_typ.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_auto_appl_sts_typ_nm.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_note_no.putMode(p, INS_NOTE, MCMode.REQUIRED);
		p.Hdr_note_typ.putMode(p, INS_NOTE, MCMode.REQUIRED);
		p.Hdr_note_typ_nm.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_draw_dt.putMode(p, INS_NOTE, MCMode.REQUIRED);
		p.Hdr_due_dt.putMode(p, INS_NOTE, MCMode.REQUIRED);
		p.Hdr_drawer_nm.putMode(p, INS_NOTE, MCMode.REQUIRED);
		p.Hdr_endrsr.putMode(p, INS_NOTE, MCMode.ENABLE);
		p.Hdr_accptr.putMode(p, INS_NOTE, MCMode.REQUIRED);
		p.Hdr_draw_bank_cd.putMode(p, INS_NOTE, MCMode.REQUIRED);
		p.Hdr_draw_bank_nm.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_draw_branch_cd.putMode(p, INS_NOTE, MCMode.REQUIRED);
		p.Hdr_draw_branch_nm.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_note_rsn_cd.putMode(p, INS_NOTE, MCMode.ENABLE);
		p.Hdr_note_rsn_nm.putMode(p, INS_NOTE, MCMode.READ_ONLY);
		p.Hdr_note_sub_char1.putMode(p, INS_NOTE, MCMode.ENABLE);
		p.Hdr_note_sub_char2.putMode(p, INS_NOTE, MCMode.ENABLE);
		p.Hdr_note_sub_char3.putMode(p, INS_NOTE, MCMode.ENABLE);

	}

	/**
	 * [INS_NOTE]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS__NOTE_Hdr2(MSBGP_RcvReg p){

	}

	/**
	 * [INS_NOTE]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitINS__NOTE_Note(MSBGP_RcvReg p){

	}

	/**
	 * [INS_NOTE]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__NOTE_Btn(MSBGP_RcvReg p){
		p.Btn_open_MSBGP0200.putMode(p, INS_NOTE, MCMode.DISABLE);
		p.Btn_open_MSBGP0210.putMode(p, INS_NOTE, MCMode.DISABLE);
		p.Btn_open_MSBGP0160.putMode(p, INS_NOTE, MCMode.DISABLE);
		p.Btn_open_MSBGP0250.putMode(p, INS_NOTE, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, INS_NOTE, MCMode.DISABLE);
		p.Btn_ins.putMode(p, INS_NOTE, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS_NOTE, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS_NOTE, MCMode.DISABLE);

	}

	/**
	 * [INS_NOTE]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__NOTE_EastBtn(MSBGP_RcvReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBGP_RcvReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBGP_RcvReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_rcv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBGP_RcvReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBGP_RcvReg p){
		p.Hdr_rcv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcv_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_div_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_opn_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_fb_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcst_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcst_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_bcst_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_bcst_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_xrate_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_rcv_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_proc_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_not_proc_bal_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_mtd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcv_mtd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcv_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_def_bank_ac_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_bank_ac_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_bank_ac_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_xfr_psn.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ext_rcv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcv_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcv_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcv_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcv_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcv_auto_appl_tgt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_auto_appl_basis_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_auto_appl_delay_days.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_com_paid_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_auto_appl_sts_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_auto_appl_sts_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
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
		p.Hdr_note_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_note_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_note_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_draw_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
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

	}

	/**
	 * [FIX_I]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr2(MSBGP_RcvReg p){

	}

	/**
	 * [FIX_I]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Note(MSBGP_RcvReg p){

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBGP_RcvReg p){
		p.Btn_open_MSBGP0200.putMode(p, FIX_I, MCMode.ENABLE);
		p.Btn_open_MSBGP0210.putMode(p, FIX_I, MCMode.ENABLE);
		p.Btn_open_MSBGP0160.putMode(p, FIX_I, MCMode.ENABLE);
		p.Btn_open_MSBGP0250.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBGP_RcvReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBGP_RcvReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBGP_RcvReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rcv_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBGP_RcvReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBGP_RcvReg p){
		p.Hdr_rcv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_div_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_opn_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_fb_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_xrate_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_rcv_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_proc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_not_proc_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_mtd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcv_mtd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcv_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_def_bank_ac_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_bank_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bank_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_xfr_psn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ext_rcv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcv_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcv_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcv_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcv_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcv_auto_appl_tgt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_auto_appl_basis_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_auto_appl_delay_days.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_com_paid_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_auto_appl_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_auto_appl_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.Hdr_note_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_note_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_note_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_draw_dt.putMode(p, SRCH, MCMode.READ_ONLY);
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

	}

	/**
	 * [SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr2(MSBGP_RcvReg p){

	}

	/**
	 * [SRCH]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Note(MSBGP_RcvReg p){

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBGP_RcvReg p){
		p.Btn_open_MSBGP0200.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_open_MSBGP0210.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_open_MSBGP0160.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_open_MSBGP0250.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_ins.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBGP_RcvReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBGP_RcvReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBGP_RcvReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_rcv_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBGP_RcvReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBGP_RcvReg p){
		p.Hdr_rcv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rcv_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_div_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_opn_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_prnt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_fb_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rcst_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_rcst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bcst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bcst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_base_cur_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_rcv_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.REQUIRED);
		p.Hdr_rcv_proc_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_not_proc_bal_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_mtd_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_rcv_mtd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rcv_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_def_bank_ac_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_bank_ac_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_bank_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_xfr_psn.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_ext_sys_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ext_rcv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rcv_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_rcv_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_rcv_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_rcv_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_rcv_auto_appl_tgt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_auto_appl_basis_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_auto_appl_delay_days.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_com_paid_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.ENABLE);
		p.Hdr_auto_appl_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_auto_appl_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
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
		p.Hdr_note_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_note_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_note_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_draw_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_due_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_drawer_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_endrsr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_accptr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_draw_bank_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_draw_bank_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_draw_branch_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_draw_branch_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_note_rsn_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_note_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_note_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_note_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_note_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr2(MSBGP_RcvReg p){

	}

	/**
	 * [UPD]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Note(MSBGP_RcvReg p){

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBGP_RcvReg p){
		p.Btn_open_MSBGP0200.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_open_MSBGP0210.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_open_MSBGP0160.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_open_MSBGP0250.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBGP_RcvReg p){

	}

	/**
	 * [UPD_NOTE]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NOTE_ScreenOpe(MSBGP_RcvReg p){

	}

	/**
	 * [UPD_NOTE]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NOTE_Cnd(MSBGP_RcvReg p){
		p.Cnd_ope_Group.putMode(p, UPD_NOTE, MCMode.REQUIRED);
		p.Cnd_rcv_no.putMode(p, UPD_NOTE, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD_NOTE, MCMode.ENABLE);

	}

	/**
	 * [UPD_NOTE]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NOTE_HdrTab(MSBGP_RcvReg p){

	}

	/**
	 * [UPD_NOTE]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NOTE_Hdr(MSBGP_RcvReg p){
		p.Hdr_rcv_no.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_rcv_dt.putMode(p, UPD_NOTE, MCMode.REQUIRED);
		p.Hdr_div_flg.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_opn_flg.putMode(p, UPD_NOTE, MCMode.ENABLE);
		p.Hdr_prnt_flg.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_fb_flg.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(UPD_NOTE, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, UPD_NOTE, MCMode.ENABLE);
		p.Hdr_wg_cd.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_rcst_cd.putMode(p, UPD_NOTE, MCMode.ENABLE);
		p.Hdr_rcst_nm.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_bcst_cd.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_bcst_nm.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_cd.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_nm.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, UPD_NOTE, MCMode.REQUIRED);
		p.Hdr_trd_cur_nm.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, UPD_NOTE, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(UPD_NOTE, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_base_cur_cd.putMode(p, UPD_NOTE, MCMode.INVISIBLE);
		p.Hdr_xrate_cd.putMode(p, UPD_NOTE, MCMode.INVISIBLE);
		p.Hdr_rcv_amt_p_PPanel.putStatus(UPD_NOTE, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.REQUIRED);
		p.Hdr_rcv_proc_amt_p_PPanel.putStatus(UPD_NOTE, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_not_proc_bal_p_PPanel.putStatus(UPD_NOTE, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_mtd_cd.putMode(p, UPD_NOTE, MCMode.REQUIRED);
		p.Hdr_rcv_mtd_nm.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_rcv_typ.putMode(p, UPD_NOTE, MCMode.INVISIBLE);
		p.Hdr_def_bank_ac_cd.putMode(p, UPD_NOTE, MCMode.INVISIBLE);
		p.Hdr_bank_ac_cd.putMode(p, UPD_NOTE, MCMode.ENABLE);
		p.Hdr_bank_ac_nm.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_xfr_psn.putMode(p, UPD_NOTE, MCMode.ENABLE);
		p.Hdr_ext_sys_cd.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_ext_rcv_no.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_rcv_rmrks.putMode(p, UPD_NOTE, MCMode.ENABLE);
		p.Hdr_rcv_sub_char1.putMode(p, UPD_NOTE, MCMode.ENABLE);
		p.Hdr_rcv_sub_char2.putMode(p, UPD_NOTE, MCMode.ENABLE);
		p.Hdr_rcv_sub_char3.putMode(p, UPD_NOTE, MCMode.ENABLE);
		p.Hdr_rcv_auto_appl_tgt_flg.putMode(p, UPD_NOTE, MCMode.REQUIRED);
		p.Hdr_auto_appl_basis_dt.putMode(p, UPD_NOTE, MCMode.ENABLE);
		p.Hdr_auto_appl_delay_days.putMode(p, UPD_NOTE, MCMode.INVISIBLE);
		p.Hdr_com_paid_p_PPanel.putStatus(UPD_NOTE, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.ENABLE);
		p.Hdr_auto_appl_sts_typ.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_auto_appl_sts_typ_nm.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_note_no.putMode(p, UPD_NOTE, MCMode.REQUIRED);
		p.Hdr_note_typ.putMode(p, UPD_NOTE, MCMode.REQUIRED);
		p.Hdr_note_typ_nm.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_draw_dt.putMode(p, UPD_NOTE, MCMode.REQUIRED);
		p.Hdr_due_dt.putMode(p, UPD_NOTE, MCMode.REQUIRED);
		p.Hdr_drawer_nm.putMode(p, UPD_NOTE, MCMode.REQUIRED);
		p.Hdr_endrsr.putMode(p, UPD_NOTE, MCMode.ENABLE);
		p.Hdr_accptr.putMode(p, UPD_NOTE, MCMode.REQUIRED);
		p.Hdr_draw_bank_cd.putMode(p, UPD_NOTE, MCMode.REQUIRED);
		p.Hdr_draw_bank_nm.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_draw_branch_cd.putMode(p, UPD_NOTE, MCMode.REQUIRED);
		p.Hdr_draw_branch_nm.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_note_rsn_cd.putMode(p, UPD_NOTE, MCMode.ENABLE);
		p.Hdr_note_rsn_nm.putMode(p, UPD_NOTE, MCMode.READ_ONLY);
		p.Hdr_note_sub_char1.putMode(p, UPD_NOTE, MCMode.ENABLE);
		p.Hdr_note_sub_char2.putMode(p, UPD_NOTE, MCMode.ENABLE);
		p.Hdr_note_sub_char3.putMode(p, UPD_NOTE, MCMode.ENABLE);

	}

	/**
	 * [UPD_NOTE]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NOTE_Hdr2(MSBGP_RcvReg p){

	}

	/**
	 * [UPD_NOTE]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NOTE_Note(MSBGP_RcvReg p){

	}

	/**
	 * [UPD_NOTE]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NOTE_Btn(MSBGP_RcvReg p){
		p.Btn_open_MSBGP0200.putMode(p, UPD_NOTE, MCMode.DISABLE);
		p.Btn_open_MSBGP0210.putMode(p, UPD_NOTE, MCMode.DISABLE);
		p.Btn_open_MSBGP0160.putMode(p, UPD_NOTE, MCMode.DISABLE);
		p.Btn_open_MSBGP0250.putMode(p, UPD_NOTE, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, UPD_NOTE, MCMode.DISABLE);
		p.Btn_ins.putMode(p, UPD_NOTE, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_NOTE, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD_NOTE, MCMode.DISABLE);

	}

	/**
	 * [UPD_NOTE]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NOTE_EastBtn(MSBGP_RcvReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBGP_RcvReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBGP_RcvReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_rcv_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBGP_RcvReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBGP_RcvReg p){
		p.Hdr_rcv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcv_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_div_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_opn_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_fb_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bcst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bcst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_xrate_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_rcv_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_proc_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_not_proc_bal_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_mtd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcv_mtd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcv_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_def_bank_ac_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_bank_ac_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bank_ac_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_xfr_psn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ext_rcv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcv_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcv_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcv_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcv_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcv_auto_appl_tgt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_auto_appl_basis_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_auto_appl_delay_days.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_com_paid_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_auto_appl_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_auto_appl_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
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
		p.Hdr_note_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_note_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_note_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_draw_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
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

	}

	/**
	 * [FIX_U]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr2(MSBGP_RcvReg p){

	}

	/**
	 * [FIX_U]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Note(MSBGP_RcvReg p){

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBGP_RcvReg p){
		p.Btn_open_MSBGP0200.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MSBGP0210.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MSBGP0160.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MSBGP0250.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBGP_RcvReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBGP_RcvReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBGP_RcvReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_rcv_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBGP_RcvReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBGP_RcvReg p){
		p.Hdr_rcv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcv_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_div_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_opn_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_fb_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bcst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bcst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_xrate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_rcv_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_proc_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_not_proc_bal_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_mtd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcv_mtd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcv_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_def_bank_ac_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_bank_ac_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bank_ac_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_xfr_psn.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ext_rcv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcv_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcv_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcv_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcv_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcv_auto_appl_tgt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_auto_appl_basis_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_auto_appl_delay_days.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_com_paid_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_auto_appl_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_auto_appl_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
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
		p.Hdr_note_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_note_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_note_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_draw_dt.putMode(p, DEL, MCMode.READ_ONLY);
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

	}

	/**
	 * [DEL]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr2(MSBGP_RcvReg p){

	}

	/**
	 * [DEL]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Note(MSBGP_RcvReg p){

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBGP_RcvReg p){
		p.Btn_open_MSBGP0200.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_open_MSBGP0210.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_open_MSBGP0160.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_open_MSBGP0250.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBGP_RcvReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBGP_RcvReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBGP_RcvReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_rcv_no.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBGP_RcvReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBGP_RcvReg p){
		p.Hdr_rcv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcv_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_div_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_opn_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_fb_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcst_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcst_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bcst_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bcst_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_xrate_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_rcv_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_proc_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_not_proc_bal_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_mtd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcv_mtd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcv_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_def_bank_ac_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_bank_ac_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bank_ac_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_xfr_psn.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ext_rcv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcv_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcv_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcv_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcv_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcv_auto_appl_tgt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_auto_appl_basis_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_auto_appl_delay_days.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_com_paid_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_auto_appl_sts_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_auto_appl_sts_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
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
		p.Hdr_note_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_note_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_note_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_draw_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
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

	}

	/**
	 * [FIX_D]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr2(MSBGP_RcvReg p){

	}

	/**
	 * [FIX_D]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Note(MSBGP_RcvReg p){

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBGP_RcvReg p){
		p.Btn_open_MSBGP0200.putMode(p, FIX_D, MCMode.ENABLE);
		p.Btn_open_MSBGP0210.putMode(p, FIX_D, MCMode.ENABLE);
		p.Btn_open_MSBGP0160.putMode(p, FIX_D, MCMode.ENABLE);
		p.Btn_open_MSBGP0250.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBGP_RcvReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBGP_RcvReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBGP_RcvReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rcv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBGP_RcvReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBGP_RcvReg p){
		p.Hdr_rcv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_div_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_opn_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_fb_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_rcv_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_not_proc_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_mtd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcv_mtd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcv_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_def_bank_ac_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_xfr_psn.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ext_rcv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcv_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcv_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcv_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcv_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcv_auto_appl_tgt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_auto_appl_basis_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_auto_appl_delay_days.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_com_paid_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_auto_appl_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_auto_appl_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
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
		p.Hdr_note_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_note_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_note_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_draw_dt.putMode(p, REF, MCMode.READ_ONLY);
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

	}

	/**
	 * [REF]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr2(MSBGP_RcvReg p){

	}

	/**
	 * [REF]ステータスの[Note]ブロックのモードの設定
	 */
	protected static void statusInitREF_Note(MSBGP_RcvReg p){

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBGP_RcvReg p){
		p.Btn_open_MSBGP0200.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBGP0210.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBGP0160.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBGP0250.putMode(p, REF, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, REF, MCMode.ENABLE);
		p.Btn_ins.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBGP_RcvReg p){

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
		Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		Hdr_rcst_cd.getListConfig().setPutter(getHdr_rcst_cd_ListPutter());
		Hdr_bcst_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_bcst_cd.getListConfig().setPutter(getHdr_bcst_cd_ListPutter());
		Hdr_bill_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_bill_dpt_cd.getListConfig().setPutter(getHdr_bill_dpt_cd_ListPutter());
		Hdr_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_trd_cur_cd.getListConfig().setPutter(getHdr_trd_cur_cd_ListPutter());
		Hdr_rcv_mtd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_rcv_mtd_cd.getListConfig().setPutter(getHdr_rcv_mtd_cd_ListPutter());
		Hdr_bank_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_bank_ac_cd.getListConfig().setPutter(getHdr_bank_ac_cd_ListPutter());
		Hdr_auto_appl_sts_typ.getListConfig().setPutter(getHdr_auto_appl_sts_typ_ListPutter());
		Hdr_note_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_note_typ.getListConfig().setPutter(getHdr_note_typ_ListPutter());
		Hdr_draw_bank_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_draw_bank_cd.getListConfig().setPutter(getHdr_draw_bank_cd_ListPutter());
		Hdr_draw_branch_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_draw_branch_cd.getListConfig().setPutter(getHdr_draw_branch_cd_ListPutter());
		Hdr_note_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_note_rsn_cd.getListConfig().setPutter(getHdr_note_rsn_cd_ListPutter());
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
	 * この画面を[INS_NOTE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_NOTEStatus() {
		status = INS_NOTE;
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
	 * この画面を[UPD_NOTE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_NOTEStatus() {
		status = UPD_NOTE;
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
		if (INS.equals(status)) {
			setINSStatus();
		}
		else if (INS_NOTE.equals(status)) {
			setINS_NOTEStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (UPD_NOTE.equals(status)) {
			setUPD_NOTEStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
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
	 * [Hdr_rcst_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_rcst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr_bcst_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_bcst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr_bill_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_bill_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
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
	 * [Hdr_rcv_mtd_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_rcv_mtd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0080.SttlRcv");
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
	 * [Hdr_auto_appl_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_auto_appl_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.AutoApplStsTyp");
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == Hdr_rcst_cd) return getHdr_rcst_cd(row, info);
		if(combo == Hdr_bcst_cd) return getHdr_bcst_cd(row, info);
		if(combo == Hdr_bill_dpt_cd) return getHdr_bill_dpt_cd(row, info);
		if(combo == Hdr_trd_cur_cd) return getHdr_trd_cur_cd(row, info);
		if(combo == Hdr_rcv_mtd_cd) return getHdr_rcv_mtd_cd(row, info);
		if(combo == Hdr_bank_ac_cd) return getHdr_bank_ac_cd(row, info);
		if(combo == Hdr_auto_appl_sts_typ) return getHdr_auto_appl_sts_typ(row, info);
		if(combo == Hdr_note_typ) return getHdr_note_typ(row, info);
		if(combo == Hdr_draw_bank_cd) return getHdr_draw_bank_cd(row, info);
		if(combo == Hdr_draw_branch_cd) return getHdr_draw_branch_cd(row, info);
		if(combo == Hdr_note_rsn_cd) return getHdr_note_rsn_cd(row, info);
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
		else if (ap == Btn_open_MSBGP0200) doBtn_open_MSBGP0200(info);
		else if (ap == Btn_open_MSBGP0210) doBtn_open_MSBGP0210(info);
		else if (ap == Btn_open_MSBGP0160) doBtn_open_MSBGP0160(info);
		else if (ap == Btn_open_MSBGP0250) doBtn_open_MSBGP0250(info);
		else if (ap == Btn_prnt) doBtn_prnt(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBGP0200]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0200(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBGP0210]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0210(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBGP0160]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0160(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBGP0250]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0250(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt(MCEventInfo info);

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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_rcv_no) return doCnd_rcv_no_VC(info);
		if (vc == Hdr_rcv_no) return doHdr_rcv_no_VC(info);
		if (vc == Hdr_rcv_dt) return doHdr_rcv_dt_VC(info);
		if (vc == Hdr_div_flg) return doHdr_div_flg_VC(info);
		if (vc == Hdr_opn_flg) return doHdr_opn_flg_VC(info);
		if (vc == Hdr_prnt_flg) return doHdr_prnt_flg_VC(info);
		if (vc == Hdr_fb_flg) return doHdr_fb_flg_VC(info);
		if (vc == Hdr_wg_cd) return doHdr_wg_cd_VC(info);
		if (vc == Hdr_wg_nm) return doHdr_wg_nm_VC(info);
		if (vc == Hdr_rcst_cd) return doHdr_rcst_cd_VC(info);
		if (vc == Hdr_rcst_nm) return doHdr_rcst_nm_VC(info);
		if (vc == Hdr_bcst_cd) return doHdr_bcst_cd_VC(info);
		if (vc == Hdr_bcst_nm) return doHdr_bcst_nm_VC(info);
		if (vc == Hdr_bill_dpt_cd) return doHdr_bill_dpt_cd_VC(info);
		if (vc == Hdr_bill_dpt_nm) return doHdr_bill_dpt_nm_VC(info);
		if (vc == Hdr_trd_cur_cd) return doHdr_trd_cur_cd_VC(info);
		if (vc == Hdr_trd_cur_nm) return doHdr_trd_cur_nm_VC(info);
		if (vc == Hdr_amt_dec_place) return doHdr_amt_dec_place_VC(info);
		if (vc == Hdr_base_cur_cd) return doHdr_base_cur_cd_VC(info);
		if (vc == Hdr_xrate_cd) return doHdr_xrate_cd_VC(info);
		if (vc == Hdr_rcv_mtd_cd) return doHdr_rcv_mtd_cd_VC(info);
		if (vc == Hdr_rcv_mtd_nm) return doHdr_rcv_mtd_nm_VC(info);
		if (vc == Hdr_rcv_typ) return doHdr_rcv_typ_VC(info);
		if (vc == Hdr_def_bank_ac_cd) return doHdr_def_bank_ac_cd_VC(info);
		if (vc == Hdr_bank_ac_cd) return doHdr_bank_ac_cd_VC(info);
		if (vc == Hdr_bank_ac_nm) return doHdr_bank_ac_nm_VC(info);
		if (vc == Hdr_xfr_psn) return doHdr_xfr_psn_VC(info);
		if (vc == Hdr_ext_sys_cd) return doHdr_ext_sys_cd_VC(info);
		if (vc == Hdr_ext_sys_nm) return doHdr_ext_sys_nm_VC(info);
		if (vc == Hdr_ext_rcv_no) return doHdr_ext_rcv_no_VC(info);
		if (vc == Hdr_rcv_rmrks) return doHdr_rcv_rmrks_VC(info);
		if (vc == Hdr_rcv_sub_char1) return doHdr_rcv_sub_char1_VC(info);
		if (vc == Hdr_rcv_sub_char2) return doHdr_rcv_sub_char2_VC(info);
		if (vc == Hdr_rcv_sub_char3) return doHdr_rcv_sub_char3_VC(info);
		if (vc == Hdr_rcv_auto_appl_tgt_flg) return doHdr_rcv_auto_appl_tgt_flg_VC(info);
		if (vc == Hdr_auto_appl_basis_dt) return doHdr_auto_appl_basis_dt_VC(info);
		if (vc == Hdr_auto_appl_delay_days) return doHdr_auto_appl_delay_days_VC(info);
		if (vc == Hdr_auto_appl_sts_typ) return doHdr_auto_appl_sts_typ_VC(info);
		if (vc == Hdr_auto_appl_sts_typ_nm) return doHdr_auto_appl_sts_typ_nm_VC(info);
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
		if (vc == Hdr_note_no) return doHdr_note_no_VC(info);
		if (vc == Hdr_note_typ) return doHdr_note_typ_VC(info);
		if (vc == Hdr_note_typ_nm) return doHdr_note_typ_nm_VC(info);
		if (vc == Hdr_draw_dt) return doHdr_draw_dt_VC(info);
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[div_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_div_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[opn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_opn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[fb_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_fb_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[rcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_dpt_nm_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_amt_dec_place_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcv_mtd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcv_mtd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcv_mtd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcv_mtd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcv_typ_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[xfr_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_xfr_psn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ext_rcv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ext_rcv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcv_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcv_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcv_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcv_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcv_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcv_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcv_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcv_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcv_auto_appl_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcv_auto_appl_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[auto_appl_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_auto_appl_basis_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[auto_appl_delay_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_auto_appl_delay_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[auto_appl_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_auto_appl_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[auto_appl_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_auto_appl_sts_typ_nm_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == HdrTabTab) doHdrTab_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_rcv_no) doCnd_rcv_no_NC(info);
		else if (nc == Hdr_rcv_no) doHdr_rcv_no_NC(info);
		else if (nc == Hdr_rcv_dt) doHdr_rcv_dt_NC(info);
		else if (nc == Hdr_div_flg) doHdr_div_flg_NC(info);
		else if (nc == Hdr_opn_flg) doHdr_opn_flg_NC(info);
		else if (nc == Hdr_prnt_flg) doHdr_prnt_flg_NC(info);
		else if (nc == Hdr_fb_flg) doHdr_fb_flg_NC(info);
		else if (nc == Hdr_wg_cd) doHdr_wg_cd_NC(info);
		else if (nc == Hdr_wg_nm) doHdr_wg_nm_NC(info);
		else if (nc == Hdr_rcst_cd) doHdr_rcst_cd_NC(info);
		else if (nc == Hdr_rcst_nm) doHdr_rcst_nm_NC(info);
		else if (nc == Hdr_bcst_cd) doHdr_bcst_cd_NC(info);
		else if (nc == Hdr_bcst_nm) doHdr_bcst_nm_NC(info);
		else if (nc == Hdr_bill_dpt_cd) doHdr_bill_dpt_cd_NC(info);
		else if (nc == Hdr_bill_dpt_nm) doHdr_bill_dpt_nm_NC(info);
		else if (nc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NC(info);
		else if (nc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NC(info);
		else if (nc == Hdr_amt_dec_place) doHdr_amt_dec_place_NC(info);
		else if (nc == Hdr_base_cur_cd) doHdr_base_cur_cd_NC(info);
		else if (nc == Hdr_xrate_cd) doHdr_xrate_cd_NC(info);
		else if (nc == Hdr_rcv_mtd_cd) doHdr_rcv_mtd_cd_NC(info);
		else if (nc == Hdr_rcv_mtd_nm) doHdr_rcv_mtd_nm_NC(info);
		else if (nc == Hdr_rcv_typ) doHdr_rcv_typ_NC(info);
		else if (nc == Hdr_def_bank_ac_cd) doHdr_def_bank_ac_cd_NC(info);
		else if (nc == Hdr_bank_ac_cd) doHdr_bank_ac_cd_NC(info);
		else if (nc == Hdr_bank_ac_nm) doHdr_bank_ac_nm_NC(info);
		else if (nc == Hdr_xfr_psn) doHdr_xfr_psn_NC(info);
		else if (nc == Hdr_ext_sys_cd) doHdr_ext_sys_cd_NC(info);
		else if (nc == Hdr_ext_sys_nm) doHdr_ext_sys_nm_NC(info);
		else if (nc == Hdr_ext_rcv_no) doHdr_ext_rcv_no_NC(info);
		else if (nc == Hdr_rcv_rmrks) doHdr_rcv_rmrks_NC(info);
		else if (nc == Hdr_rcv_sub_char1) doHdr_rcv_sub_char1_NC(info);
		else if (nc == Hdr_rcv_sub_char2) doHdr_rcv_sub_char2_NC(info);
		else if (nc == Hdr_rcv_sub_char3) doHdr_rcv_sub_char3_NC(info);
		else if (nc == Hdr_rcv_auto_appl_tgt_flg) doHdr_rcv_auto_appl_tgt_flg_NC(info);
		else if (nc == Hdr_auto_appl_basis_dt) doHdr_auto_appl_basis_dt_NC(info);
		else if (nc == Hdr_auto_appl_delay_days) doHdr_auto_appl_delay_days_NC(info);
		else if (nc == Hdr_auto_appl_sts_typ) doHdr_auto_appl_sts_typ_NC(info);
		else if (nc == Hdr_auto_appl_sts_typ_nm) doHdr_auto_appl_sts_typ_nm_NC(info);
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
		else if (nc == Hdr_note_no) doHdr_note_no_NC(info);
		else if (nc == Hdr_note_typ) doHdr_note_typ_NC(info);
		else if (nc == Hdr_note_typ_nm) doHdr_note_typ_nm_NC(info);
		else if (nc == Hdr_draw_dt) doHdr_draw_dt_NC(info);
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
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[div_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_div_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[opn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_opn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[fb_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_fb_flg_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[rcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_nm_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_mtd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_mtd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_mtd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_mtd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_bank_ac_cd_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[xfr_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xfr_psn_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_rcv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_auto_appl_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_auto_appl_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_appl_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_appl_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_appl_delay_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_appl_delay_days_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_appl_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_appl_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_appl_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_appl_sts_typ_nm_NC(MCEventInfo info){
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
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == HdrTabTab) doHdrTab_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_rcv_no) doCnd_rcv_no_NE(info);
		else if (ne == Hdr_rcv_no) doHdr_rcv_no_NE(info);
		else if (ne == Hdr_rcv_dt) doHdr_rcv_dt_NE(info);
		else if (ne == Hdr_div_flg) doHdr_div_flg_NE(info);
		else if (ne == Hdr_opn_flg) doHdr_opn_flg_NE(info);
		else if (ne == Hdr_prnt_flg) doHdr_prnt_flg_NE(info);
		else if (ne == Hdr_fb_flg) doHdr_fb_flg_NE(info);
		else if (ne == Hdr_wg_cd) doHdr_wg_cd_NE(info);
		else if (ne == Hdr_wg_nm) doHdr_wg_nm_NE(info);
		else if (ne == Hdr_rcst_cd) doHdr_rcst_cd_NE(info);
		else if (ne == Hdr_rcst_nm) doHdr_rcst_nm_NE(info);
		else if (ne == Hdr_bcst_cd) doHdr_bcst_cd_NE(info);
		else if (ne == Hdr_bcst_nm) doHdr_bcst_nm_NE(info);
		else if (ne == Hdr_bill_dpt_cd) doHdr_bill_dpt_cd_NE(info);
		else if (ne == Hdr_bill_dpt_nm) doHdr_bill_dpt_nm_NE(info);
		else if (ne == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NE(info);
		else if (ne == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NE(info);
		else if (ne == Hdr_amt_dec_place) doHdr_amt_dec_place_NE(info);
		else if (ne == Hdr_base_cur_cd) doHdr_base_cur_cd_NE(info);
		else if (ne == Hdr_xrate_cd) doHdr_xrate_cd_NE(info);
		else if (ne == Hdr_rcv_mtd_cd) doHdr_rcv_mtd_cd_NE(info);
		else if (ne == Hdr_rcv_mtd_nm) doHdr_rcv_mtd_nm_NE(info);
		else if (ne == Hdr_rcv_typ) doHdr_rcv_typ_NE(info);
		else if (ne == Hdr_def_bank_ac_cd) doHdr_def_bank_ac_cd_NE(info);
		else if (ne == Hdr_bank_ac_cd) doHdr_bank_ac_cd_NE(info);
		else if (ne == Hdr_bank_ac_nm) doHdr_bank_ac_nm_NE(info);
		else if (ne == Hdr_xfr_psn) doHdr_xfr_psn_NE(info);
		else if (ne == Hdr_ext_sys_cd) doHdr_ext_sys_cd_NE(info);
		else if (ne == Hdr_ext_sys_nm) doHdr_ext_sys_nm_NE(info);
		else if (ne == Hdr_ext_rcv_no) doHdr_ext_rcv_no_NE(info);
		else if (ne == Hdr_rcv_rmrks) doHdr_rcv_rmrks_NE(info);
		else if (ne == Hdr_rcv_sub_char1) doHdr_rcv_sub_char1_NE(info);
		else if (ne == Hdr_rcv_sub_char2) doHdr_rcv_sub_char2_NE(info);
		else if (ne == Hdr_rcv_sub_char3) doHdr_rcv_sub_char3_NE(info);
		else if (ne == Hdr_rcv_auto_appl_tgt_flg) doHdr_rcv_auto_appl_tgt_flg_NE(info);
		else if (ne == Hdr_auto_appl_basis_dt) doHdr_auto_appl_basis_dt_NE(info);
		else if (ne == Hdr_auto_appl_delay_days) doHdr_auto_appl_delay_days_NE(info);
		else if (ne == Hdr_auto_appl_sts_typ) doHdr_auto_appl_sts_typ_NE(info);
		else if (ne == Hdr_auto_appl_sts_typ_nm) doHdr_auto_appl_sts_typ_nm_NE(info);
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
		else if (ne == Hdr_note_no) doHdr_note_no_NE(info);
		else if (ne == Hdr_note_typ) doHdr_note_typ_NE(info);
		else if (ne == Hdr_note_typ_nm) doHdr_note_typ_nm_NE(info);
		else if (ne == Hdr_draw_dt) doHdr_draw_dt_NE(info);
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
	}

	/**
	 * [HdrTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[div_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_div_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[opn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_opn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[fb_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_fb_flg_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[rcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_nm_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_mtd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_mtd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_mtd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_mtd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_bank_ac_cd_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[xfr_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xfr_psn_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_rcv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_auto_appl_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_auto_appl_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_appl_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_appl_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_appl_delay_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_appl_delay_days_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_appl_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_appl_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_appl_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_appl_sts_typ_nm_NE(MCEventInfo info){
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
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == HdrTabTab) doHdrTab_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_rcv_no) doCnd_rcv_no_NX(info);
		else if (nx == Hdr_rcv_no) doHdr_rcv_no_NX(info);
		else if (nx == Hdr_rcv_dt) doHdr_rcv_dt_NX(info);
		else if (nx == Hdr_div_flg) doHdr_div_flg_NX(info);
		else if (nx == Hdr_opn_flg) doHdr_opn_flg_NX(info);
		else if (nx == Hdr_prnt_flg) doHdr_prnt_flg_NX(info);
		else if (nx == Hdr_fb_flg) doHdr_fb_flg_NX(info);
		else if (nx == Hdr_wg_cd) doHdr_wg_cd_NX(info);
		else if (nx == Hdr_wg_nm) doHdr_wg_nm_NX(info);
		else if (nx == Hdr_rcst_cd) doHdr_rcst_cd_NX(info);
		else if (nx == Hdr_rcst_nm) doHdr_rcst_nm_NX(info);
		else if (nx == Hdr_bcst_cd) doHdr_bcst_cd_NX(info);
		else if (nx == Hdr_bcst_nm) doHdr_bcst_nm_NX(info);
		else if (nx == Hdr_bill_dpt_cd) doHdr_bill_dpt_cd_NX(info);
		else if (nx == Hdr_bill_dpt_nm) doHdr_bill_dpt_nm_NX(info);
		else if (nx == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NX(info);
		else if (nx == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NX(info);
		else if (nx == Hdr_amt_dec_place) doHdr_amt_dec_place_NX(info);
		else if (nx == Hdr_base_cur_cd) doHdr_base_cur_cd_NX(info);
		else if (nx == Hdr_xrate_cd) doHdr_xrate_cd_NX(info);
		else if (nx == Hdr_rcv_mtd_cd) doHdr_rcv_mtd_cd_NX(info);
		else if (nx == Hdr_rcv_mtd_nm) doHdr_rcv_mtd_nm_NX(info);
		else if (nx == Hdr_rcv_typ) doHdr_rcv_typ_NX(info);
		else if (nx == Hdr_def_bank_ac_cd) doHdr_def_bank_ac_cd_NX(info);
		else if (nx == Hdr_bank_ac_cd) doHdr_bank_ac_cd_NX(info);
		else if (nx == Hdr_bank_ac_nm) doHdr_bank_ac_nm_NX(info);
		else if (nx == Hdr_xfr_psn) doHdr_xfr_psn_NX(info);
		else if (nx == Hdr_ext_sys_cd) doHdr_ext_sys_cd_NX(info);
		else if (nx == Hdr_ext_sys_nm) doHdr_ext_sys_nm_NX(info);
		else if (nx == Hdr_ext_rcv_no) doHdr_ext_rcv_no_NX(info);
		else if (nx == Hdr_rcv_rmrks) doHdr_rcv_rmrks_NX(info);
		else if (nx == Hdr_rcv_sub_char1) doHdr_rcv_sub_char1_NX(info);
		else if (nx == Hdr_rcv_sub_char2) doHdr_rcv_sub_char2_NX(info);
		else if (nx == Hdr_rcv_sub_char3) doHdr_rcv_sub_char3_NX(info);
		else if (nx == Hdr_rcv_auto_appl_tgt_flg) doHdr_rcv_auto_appl_tgt_flg_NX(info);
		else if (nx == Hdr_auto_appl_basis_dt) doHdr_auto_appl_basis_dt_NX(info);
		else if (nx == Hdr_auto_appl_delay_days) doHdr_auto_appl_delay_days_NX(info);
		else if (nx == Hdr_auto_appl_sts_typ) doHdr_auto_appl_sts_typ_NX(info);
		else if (nx == Hdr_auto_appl_sts_typ_nm) doHdr_auto_appl_sts_typ_nm_NX(info);
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
		else if (nx == Hdr_note_no) doHdr_note_no_NX(info);
		else if (nx == Hdr_note_typ) doHdr_note_typ_NX(info);
		else if (nx == Hdr_note_typ_nm) doHdr_note_typ_nm_NX(info);
		else if (nx == Hdr_draw_dt) doHdr_draw_dt_NX(info);
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
	}

	/**
	 * [HdrTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[div_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_div_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[opn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_opn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[fb_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_fb_flg_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[rcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_nm_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_mtd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_mtd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_mtd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_mtd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_bank_ac_cd_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[xfr_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xfr_psn_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_rcv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_auto_appl_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_auto_appl_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_appl_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_appl_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_appl_delay_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_appl_delay_days_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_appl_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_appl_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_appl_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_appl_sts_typ_nm_NX(MCEventInfo info){
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
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_rcv_no) doCnd_rcv_no_LC(info);
		else if (lc == Hdr_rcv_no) doHdr_rcv_no_LC(info);
		else if (lc == Hdr_rcv_dt) doHdr_rcv_dt_LC(info);
		else if (lc == Hdr_wg_cd) doHdr_wg_cd_LC(info);
		else if (lc == Hdr_wg_nm) doHdr_wg_nm_LC(info);
		else if (lc == Hdr_rcst_cd) doHdr_rcst_cd_LC(info);
		else if (lc == Hdr_rcst_nm) doHdr_rcst_nm_LC(info);
		else if (lc == Hdr_bcst_cd) doHdr_bcst_cd_LC(info);
		else if (lc == Hdr_bcst_nm) doHdr_bcst_nm_LC(info);
		else if (lc == Hdr_bill_dpt_cd) doHdr_bill_dpt_cd_LC(info);
		else if (lc == Hdr_bill_dpt_nm) doHdr_bill_dpt_nm_LC(info);
		else if (lc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_LC(info);
		else if (lc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_LC(info);
		else if (lc == Hdr_amt_dec_place) doHdr_amt_dec_place_LC(info);
		else if (lc == Hdr_base_cur_cd) doHdr_base_cur_cd_LC(info);
		else if (lc == Hdr_xrate_cd) doHdr_xrate_cd_LC(info);
		else if (lc == Hdr_rcv_mtd_cd) doHdr_rcv_mtd_cd_LC(info);
		else if (lc == Hdr_rcv_mtd_nm) doHdr_rcv_mtd_nm_LC(info);
		else if (lc == Hdr_rcv_typ) doHdr_rcv_typ_LC(info);
		else if (lc == Hdr_def_bank_ac_cd) doHdr_def_bank_ac_cd_LC(info);
		else if (lc == Hdr_bank_ac_cd) doHdr_bank_ac_cd_LC(info);
		else if (lc == Hdr_bank_ac_nm) doHdr_bank_ac_nm_LC(info);
		else if (lc == Hdr_xfr_psn) doHdr_xfr_psn_LC(info);
		else if (lc == Hdr_ext_sys_cd) doHdr_ext_sys_cd_LC(info);
		else if (lc == Hdr_ext_sys_nm) doHdr_ext_sys_nm_LC(info);
		else if (lc == Hdr_ext_rcv_no) doHdr_ext_rcv_no_LC(info);
		else if (lc == Hdr_rcv_rmrks) doHdr_rcv_rmrks_LC(info);
		else if (lc == Hdr_rcv_sub_char1) doHdr_rcv_sub_char1_LC(info);
		else if (lc == Hdr_rcv_sub_char2) doHdr_rcv_sub_char2_LC(info);
		else if (lc == Hdr_rcv_sub_char3) doHdr_rcv_sub_char3_LC(info);
		else if (lc == Hdr_auto_appl_basis_dt) doHdr_auto_appl_basis_dt_LC(info);
		else if (lc == Hdr_auto_appl_delay_days) doHdr_auto_appl_delay_days_LC(info);
		else if (lc == Hdr_auto_appl_sts_typ) doHdr_auto_appl_sts_typ_LC(info);
		else if (lc == Hdr_auto_appl_sts_typ_nm) doHdr_auto_appl_sts_typ_nm_LC(info);
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
		else if (lc == Hdr_note_no) doHdr_note_no_LC(info);
		else if (lc == Hdr_note_typ) doHdr_note_typ_LC(info);
		else if (lc == Hdr_note_typ_nm) doHdr_note_typ_nm_LC(info);
		else if (lc == Hdr_draw_dt) doHdr_draw_dt_LC(info);
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
	}

	/**
	 * [Cnd]パネルの[rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_dt_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[rcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_nm_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_mtd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_mtd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_mtd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_mtd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_bank_ac_cd_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[xfr_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xfr_psn_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_rcv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_appl_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_appl_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_appl_delay_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_appl_delay_days_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_appl_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_appl_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_appl_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_appl_sts_typ_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_rcst_cd]の作成メソッド
	 */
	public MCList getHdr_rcst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_bcst_cd]の作成メソッド
	 */
	public MCList getHdr_bcst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_bill_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_bill_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_trd_cur_cd]の作成メソッド
	 */
	public MCList getHdr_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_rcv_mtd_cd]の作成メソッド
	 */
	public MCList getHdr_rcv_mtd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0080.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0080.MSUAP_List", this)).getSttlRcv(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_bank_ac_cd]の作成メソッド
	 */
	public MCList getHdr_bank_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIntBankAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_auto_appl_sts_typ]の作成メソッド
	 */
	public MCList getHdr_auto_appl_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getAutoApplStsTyp(row, info);
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

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBGL0140.Srch01")) {
			return new MS_MSBGL0140_Srch01Bridge();
		}
		if (id.equals("MS.MSBGL0140.Ins01")) {
			return new MS_MSBGL0140_Ins01Bridge();
		}
		if (id.equals("MS.MSBGL0140.Upd01")) {
			return new MS_MSBGL0140_Upd01Bridge();
		}
		if (id.equals("MS.MSBGL0140.Del01")) {
			return new MS_MSBGL0140_Del01Bridge();
		}
		if (id.equals("MS.MSBGL0140.Prnt01")) {
			return new MS_MSBGL0140_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBGL0140_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0140_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0140_Srch01;

		/** コンストラクタ */
		protected MS_MSBGL0140_Srch01Bridge() {
			p_MS_MSBGL0140_Srch01 = new MCParam(PDef.MS_MSBGL0140_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0140_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0140.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0140.HdrR.create());

			p_MS_MSBGL0140_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0140_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0140_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0140_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0140_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0140.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0140.CndR)up(0);
		}

		protected mcframe.clientMSBG.MSBGP0140.HdrR down0() {
			return (mcframe.clientMSBG.MSBGP0140.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0140_Srch01.addDownBlock(mcframe.clientMSBG.MSBGP0140.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBGL0140_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBG.MSBGP0140.HdrR)p_MS_MSBGL0140_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdrR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
	}
	/**
	 * [MS_MSBGL0140_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0140_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0140_Ins01;

		/** コンストラクタ */
		protected MS_MSBGL0140_Ins01Bridge() {
			p_MS_MSBGL0140_Ins01 = new MCParam(PDef.MS_MSBGL0140_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0140_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0140.HdrR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0140.HdrR.create());

			p_MS_MSBGL0140_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0140_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0140_Ins01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0140_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0140_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0140.HdrR up0() {
			return (mcframe.clientMSBG.MSBGP0140.HdrR)up(0);
		}

		protected mcframe.clientMSBG.MSBGP0140.HdrR down0() {
			return (mcframe.clientMSBG.MSBGP0140.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0140_Ins01.addDownBlock(mcframe.clientMSBG.MSBGP0140.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBGL0140_Ins01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBG.MSBGP0140.HdrR)p_MS_MSBGL0140_Ins01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdrR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
	}
	/**
	 * [MS_MSBGL0140_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0140_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0140_Upd01;

		/** コンストラクタ */
		protected MS_MSBGL0140_Upd01Bridge() {
			p_MS_MSBGL0140_Upd01 = new MCParam(PDef.MS_MSBGL0140_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0140_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0140.HdrR.create());
			// Down

			p_MS_MSBGL0140_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0140_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0140_Upd01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0140_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0140_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0140.HdrR up0() {
			return (mcframe.clientMSBG.MSBGP0140.HdrR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBGL0140_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MS_MSBGL0140_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0140_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0140_Del01;

		/** コンストラクタ */
		protected MS_MSBGL0140_Del01Bridge() {
			p_MS_MSBGL0140_Del01 = new MCParam(PDef.MS_MSBGL0140_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0140_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0140.HdrR.create());
			// Down

			p_MS_MSBGL0140_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0140_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0140_Del01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0140_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0140_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0140.HdrR up0() {
			return (mcframe.clientMSBG.MSBGP0140.HdrR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBGL0140_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MS_MSBGL0140_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0140_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0140_Prnt01;

		/** コンストラクタ */
		protected MS_MSBGL0140_Prnt01Bridge() {
			p_MS_MSBGL0140_Prnt01 = new MCParam(PDef.MS_MSBGL0140_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0140_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0140.HdrR.create());
			// Down

			p_MS_MSBGL0140_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0140_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0140_Prnt01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0140_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0140_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0140.HdrR up0() {
			return (mcframe.clientMSBG.MSBGP0140.HdrR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBGL0140_Prnt01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}