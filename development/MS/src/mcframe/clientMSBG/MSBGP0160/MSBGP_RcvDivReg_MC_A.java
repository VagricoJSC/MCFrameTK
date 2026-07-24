package mcframe.clientMSBG.MSBGP0160;

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
import mcframe.clientMSBG.MSBGP0160.MSBGP_RcvDivReg_MC.MS_MSBGL0160_Srch01Caller;
import mcframe.clientMSBG.MSBGP0160.MSBGP_RcvDivReg_MC.MS_MSBGL0160_Upd01Caller;

/**
 * 画面"MSBGP_RcvDivReg"パネルクラスです。<p>
 *
 * 入金を分割する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGP_RcvDivReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBGP0160";

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
	 * UPD,Create/Modify;REF,View UPD,登録・訂正する;REF,参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_rcv_no_Label = null;
	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rcv_no = null;
	public MCLabel Cnd_rcv_schd_dt_fr_Label = null;
	/**
	 * Scheduled payment receipt date FROM 入金予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_rcv_schd_dt_fr = null;
	public MCLabel Cnd_rcv_schd_dt_to_Label = null;
	/**
	 * Scheduled payment receipt date TO 入金予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_rcv_schd_dt_to = null;
	/**
	 * Include unbilled 未請求含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_not_cl_flg = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [HdrTab]ブロック関連のField定義
	public MCPanel HdrTabPanel = null;
	public MCTabbedPane HdrTabTab = null;
	// [HdrTab]ブロックの項目のField定義
	// [Hdr1]ブロック関連のField定義
	public MCPanel Hdr1Panel = null;
	// [Hdr1]ブロックの項目のField定義
	public MCLabel Hdr1_rcv_no_Label = null;
	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr1_rcv_no = null;
	public MCLabel Hdr1_rcv_dt_Label = null;
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCDateField Hdr1_rcv_dt = null;
	/**
	 * Split 分割済.<p>
	 *
	 */
	public MCCheckBox Hdr1_div_flg = null;
	public MCLabel Hdr1_rcv_usr_cd_Label = null;
	/**
	 * Payment received PIC cd. 入金担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_rcv_usr_cd = null;
	/**
	 * Payment received PIC name 入金担当者名.<p>
	 *
	 */
	public MCTextField Hdr1_rcv_usr_nm = null;
	public MCLabel Hdr1_rcv_dpt_cd_Label = null;
	/**
	 * Payment receiving dept. cd. 入金部門ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_rcv_dpt_cd = null;
	/**
	 * Payment receiving dept. name 入金部門名.<p>
	 *
	 */
	public MCTextField Hdr1_rcv_dpt_nm = null;
	public MCLabel Hdr1_wg_cd_Label = null;
	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_wg_cd = null;
	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public MCTextField Hdr1_wg_nm = null;
	public MCLabel Hdr1_rcst_cd_Label = null;
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_rcst_cd = null;
	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public MCTextField Hdr1_rcst_nm = null;
	public MCLabel Hdr1_bcst_cd_Label = null;
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_bcst_cd = null;
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public MCTextField Hdr1_bcst_nm = null;
	public MCLabel Hdr1_bill_dpt_cd_Label = null;
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_bill_dpt_cd = null;
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public MCTextField Hdr1_bill_dpt_nm = null;
	public MCLabel Hdr1_trd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField Hdr1_trd_cur_nm = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr1_amt_dec_place = null;
	public MCLabel Hdr1_xrate_Label = null;
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumberField Hdr1_xrate = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr1_rcv_amt_p_PPanel;
	public MCNumberField Hdr1_rcv_amt;	// [Hdr1]の[rcv_amt_p.amt]を[Hdr1_rcv_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr1_rcv_proc_amt_p_PPanel;
	public MCNumberField Hdr1_rcv_proc_amt;	// [Hdr1]の[rcv_proc_amt_p.amt]を[Hdr1_rcv_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr1_not_proc_bal_p_PPanel;
	public MCNumberField Hdr1_not_proc_bal;	// [Hdr1]の[not_proc_bal_p.amt]を[Hdr1_not_proc_bal]としてエイリアス定義。
	public MCLabel Hdr1_rcv_mtd_cd_Label = null;
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_rcv_mtd_cd = null;
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public MCTextField Hdr1_rcv_mtd_nm = null;
	public MCLabel Hdr1_bank_ac_cd_Label = null;
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_bank_ac_cd = null;
	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public MCTextField Hdr1_bank_ac_nm = null;
	public MCLabel Hdr1_xfr_psn_Label = null;
	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public MCTextField Hdr1_xfr_psn = null;
	public MCLabel Hdr1_rcv_rmrks_Label = null;
	/**
	 * Payment received remarks 入金備考.<p>
	 *
	 */
	public MCTextField Hdr1_rcv_rmrks = null;
	public MCLabel Hdr1_rcv_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Hdr1_rcv_sub_char1 = null;
	public MCLabel Hdr1_rcv_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Hdr1_rcv_sub_char2 = null;
	public MCLabel Hdr1_rcv_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Hdr1_rcv_sub_char3 = null;
	/**
	 * For auto-reconciliation 入金自動消込対象.<p>
	 *
	 */
	public MCCheckBox Hdr1_rcv_auto_appl_tgt_flg = null;
	public MCLabel Hdr1_auto_appl_basis_dt_Label = null;
	/**
	 * Auto-reconciliation base date 自動消込基準日.<p>
	 *
	 */
	public MCDateField Hdr1_auto_appl_basis_dt = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr1_com_paid_p_PPanel;
	public MCNumberField Hdr1_com_paid;	// [Hdr1]の[com_paid_p.amt]を[Hdr1_com_paid]としてエイリアス定義。
	public MCLabel Hdr1_auto_appl_sts_typ_Label = null;
	/**
	 * Auto-reconciliation status type 自動消込状況区分.<p>
	 *
	 */
	public MCTextField Hdr1_auto_appl_sts_typ = null;
	/**
	 * Auto-reconciliation status type name 自動消込状況区分名.<p>
	 *
	 */
	public MCTextField Hdr1_auto_appl_sts_typ_nm = null;
	public MCLabel Hdr1_note_no_Label = null;
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public MCTextField Hdr1_note_no = null;
	public MCLabel Hdr1_note_typ_Label = null;
	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public MCTextField Hdr1_note_typ = null;
	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public MCTextField Hdr1_note_typ_nm = null;
	public MCLabel Hdr1_draw_dt_Label = null;
	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public MCDateField Hdr1_draw_dt = null;
	public MCLabel Hdr1_due_dt_Label = null;
	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public MCDateField Hdr1_due_dt = null;
	public MCLabel Hdr1_drawer_nm_Label = null;
	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public MCTextField Hdr1_drawer_nm = null;
	public MCLabel Hdr1_endrsr_Label = null;
	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public MCTextField Hdr1_endrsr = null;
	public MCLabel Hdr1_accptr_Label = null;
	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public MCTextField Hdr1_accptr = null;
	public MCLabel Hdr1_draw_bank_cd_Label = null;
	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_draw_bank_cd = null;
	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public MCTextField Hdr1_draw_bank_nm = null;
	public MCLabel Hdr1_draw_branch_cd_Label = null;
	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_draw_branch_cd = null;
	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public MCTextField Hdr1_draw_branch_nm = null;
	public MCLabel Hdr1_note_rsn_cd_Label = null;
	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_note_rsn_cd = null;
	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public MCTextField Hdr1_note_rsn_nm = null;
	public MCLabel Hdr1_note_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Hdr1_note_sub_char1 = null;
	public MCLabel Hdr1_note_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Hdr1_note_sub_char2 = null;
	public MCLabel Hdr1_note_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Hdr1_note_sub_char3 = null;
	public MCLabel Hdr1_ins_usr_id_Label = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr1_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr1_ins_usr_nm = null;
	public MCLabel Hdr1_ins_func_id_Label = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCTextField Hdr1_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCTextField Hdr1_ins_func_nm = null;
	public MCLabel Hdr1_upd_usr_id_Label = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr1_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr1_upd_usr_nm = null;
	public MCLabel Hdr1_upd_func_id_Label = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCTextField Hdr1_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCTextField Hdr1_upd_func_nm = null;
	public MCLabel Hdr1_ins_ts_Label = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestampField Hdr1_ins_ts = null;
	public MCLabel Hdr1_upd_ts_Label = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestampField Hdr1_upd_ts = null;
	public MCLabel Hdr1_upd_srv_req_no_Label = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCTextField Hdr1_upd_srv_req_no = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr1_upri_dec_place = null;
	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public MCNumberField Hdr1_rcv_upd_cntr = null;
	/**
	 * Payment received data type 入金データ区分.<p>
	 *
	 */
	public MCTextField Hdr1_rcv_dat_typ = null;
	/**
	 * Payment received split source No. 分割元入金ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr1_div_src_rcv_no = null;
	// [Hdr2]ブロック関連のField定義
	public MCPanel Hdr2Panel = null;
	// [Hdr2]ブロックの項目のField定義
	// [Hdr3]ブロック関連のField定義
	public MCPanel Hdr3Panel = null;
	// [Hdr3]ブロックの項目のField定義
	// [LDtl]ブロック関連のField定義
	public MCPanel LDtlPanel = null;
	// [LDtl]ブロックの項目のField定義
	// [RcvSchd]ブロック関連のField定義
	public MCPanel RcvSchdPanel = null;
	public MCTitledBorder RcvSchdTitledBorder = null;
	public MCScrollPane RcvSchdScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0160.RcvSchdR> RcvSchdTable = null;
	// [RcvSchd]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRcvSchd_check = null;
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRcvSchd_bcst_cd = null;
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public MCColumnConfig columnRcvSchd_bcst_nm = null;
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRcvSchd_bill_dpt_cd = null;
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public MCColumnConfig columnRcvSchd_bill_dpt_nm = null;
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCColumnConfig columnRcvSchd_rcv_schd_dt = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRcvSchd_trd_cur_cd = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D RcvSchd_rcv_schd_amt_p_PPanel;
	public MCColumnConfig columnRcvSchd_rcv_schd_amt;// [RcvSchd]の[rcv_schd_amt_p.amt]を[columnRcvSchd_rcv_schd_amt]としてエイリアス定義。
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRcvSchd_bill_no = null;
	// [Btn1]ブロック関連のField定義
	public MCPanel Btn1Panel = null;
	// [Btn1]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Btn1_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Btn1_deselect_all = null;
	/**
	 * Apply 反映する.<p>
	 *
	 */
	public MCButton Btn1_reflection = null;
	// [RDtl]ブロック関連のField定義
	public MCPanel RDtlPanel = null;
	// [RDtl]ブロックの項目のField定義
	// [RcvDiv]ブロック関連のField定義
	public MCPanel RcvDivPanel = null;
	public MCTitledBorder RcvDivTitledBorder = null;
	public MCScrollPane RcvDivScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0160.RcvDivR> RcvDivTable = null;
	// [RcvDiv]ブロックの項目のField定義
	/**
	 * Split destination payment received No. 分割先入金ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRcvDiv_rcv_no = null;
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRcvDiv_bcst_cd = null;
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public MCColumnConfig columnRcvDiv_bcst_nm = null;
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRcvDiv_bill_dpt_cd = null;
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public MCColumnConfig columnRcvDiv_bill_dpt_nm = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D RcvDiv_rcv_amt_p_PPanel;
	public MCColumnConfig columnRcvDiv_rcv_amt;// [RcvDiv]の[rcv_amt_p.amt]を[columnRcvDiv_rcv_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D RcvDiv_rcv_proc_amt_p_PPanel;
	public MCColumnConfig columnRcvDiv_rcv_proc_amt;// [RcvDiv]の[rcv_proc_amt_p.amt]を[columnRcvDiv_rcv_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D RcvDiv_not_proc_amt_p_PPanel;
	public MCColumnConfig columnRcvDiv_not_proc_bal;// [RcvDiv]の[not_proc_amt_p.amt]を[columnRcvDiv_not_proc_bal]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D RcvDiv_com_paid_p_PPanel;
	public MCColumnConfig columnRcvDiv_com_paid;// [RcvDiv]の[com_paid_p.amt]を[columnRcvDiv_com_paid]としてエイリアス定義。
	/**
	 * Payment received remarks 入金備考.<p>
	 *
	 */
	public MCColumnConfig columnRcvDiv_rcv_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnRcvDiv_rcv_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnRcvDiv_rcv_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnRcvDiv_rcv_sub_char3 = null;
	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRcvDiv_div_src_rcv_upd_cntr = null;
	// [Btn2]ブロック関連のField定義
	public MCPanel Btn2Panel = null;
	// [Btn2]ブロックの項目のField定義
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btn2_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btn2_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btn2_rcopy = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Payment receipt schedule 入金予定一覧.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0070 = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, UPD, FIX_U, REF};
	
	/** [MS_MSBGL0160_Srch01]のCallerの作成 */
	protected MSBGP_RcvDivReg_MC.MS_MSBGL0160_Srch01Caller createMS_MSBGL0160_Srch01() {
		MSBGP_RcvDivReg_MC.MS_MSBGL0160_Srch01Caller<MSBGP_RcvDivReg, MS_MSBGL0160_Srch01Bridge>
		caller = ((MSBGP_RcvDivReg_MC)this).new MS_MSBGL0160_Srch01Caller<MSBGP_RcvDivReg, MS_MSBGL0160_Srch01Bridge>(
					(MSBGP_RcvDivReg)this, new MS_MSBGL0160_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBGL0160_Srch01]の呼び出し */
	protected void callMS_MSBGL0160_Srch01() {
		MCCaller caller = createMS_MSBGL0160_Srch01();
		caller.exec();
	}
	/** [MS_MSBGL0160_Upd01]のCallerの作成 */
	protected MSBGP_RcvDivReg_MC.MS_MSBGL0160_Upd01Caller createMS_MSBGL0160_Upd01() {
		MSBGP_RcvDivReg_MC.MS_MSBGL0160_Upd01Caller<MSBGP_RcvDivReg, MS_MSBGL0160_Upd01Bridge>
		caller = ((MSBGP_RcvDivReg_MC)this).new MS_MSBGL0160_Upd01Caller<MSBGP_RcvDivReg, MS_MSBGL0160_Upd01Bridge>(
					(MSBGP_RcvDivReg)this, new MS_MSBGL0160_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBGL0160_Upd01]の呼び出し */
	protected void callMS_MSBGL0160_Upd01() {
		MCCaller caller = createMS_MSBGL0160_Upd01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0160.CndR aCndR;
	/** [Hdr1]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0160.Hdr1R aHdr1R;
	/** [RcvSchd]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0160.RcvSchdR> aRcvSchdL;
	/** [RcvDiv]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0160.RcvDivR> aRcvDivL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBG.MSBGP0160.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0160.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0160.CndR createCndR() {
		return mcframe.clientMSBG.MSBGP0160.CndR.create();
	}

	/**
	 * 項目コピーによってaHdr1Rを設定します。
	 *
	 * aHdr1Rのインスタンスは変更されません。
	 *
	 * @param row Hdr1R
	 */
	public void setHdr1R(mcframe.clientMSBG.MSBGP0160.Hdr1R row) {
		if (row != null) {
			MCRow.copyall(getHdr1R(), row);
		}
	}

	/**
	 * [Hdr1]ブロックのコンテナaHdr1Rを返します。
	 *
	 * @return Hdr1R
	 */
	public mcframe.clientMSBG.MSBGP0160.Hdr1R getHdr1R() {
		return aHdr1R;
	}

	/**
	 * aHdr1Rを作成します。
	 *
	 * @return Hdr1R
	 */
	public mcframe.clientMSBG.MSBGP0160.Hdr1R createHdr1R() {
		return mcframe.clientMSBG.MSBGP0160.Hdr1R.create();
	}

	/**
	 * コピーによってaRcvSchdLを設定します。
	 *
	 * aRcvSchdLのインスタンスは変更されません。
	 *
	 * @param dataset RcvSchdL
	 */
	public void setRcvSchdL(MCList<mcframe.clientMSBG.MSBGP0160.RcvSchdR> aList) {
		if (getRcvSchdL() != aList) {
			getRcvSchdL().setAll(aList);
		}
	}

	/**
	 * [RcvSchd]ブロックのコンテナaRcvSchdLを返します。
	 *
	 * @return RcvSchdL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0160.RcvSchdR> getRcvSchdL() {
		return aRcvSchdL;
	}

	/**
	 * aRcvSchdRを作成します。
	 *
	 * @return RcvSchdR
	 */
	public mcframe.clientMSBG.MSBGP0160.RcvSchdR createRcvSchdR() {
		return mcframe.clientMSBG.MSBGP0160.RcvSchdR.create();
	}

	/**
	 * aRcvSchdLを作成します。
	 *
	 * @return RcvSchdL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0160.RcvSchdR> createRcvSchdL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0160.RcvSchdR.class);
	}

	/**
	 * RcvSchdTableを初期化します。
	 */
	protected void createRcvSchdTable(){
		if(RcvSchdTable == null){
			RcvSchdTable = beansFactory.createTable2("RcvSchd.table");
		}
	}

	/**
	 * コピーによってaRcvDivLを設定します。
	 *
	 * aRcvDivLのインスタンスは変更されません。
	 *
	 * @param dataset RcvDivL
	 */
	public void setRcvDivL(MCList<mcframe.clientMSBG.MSBGP0160.RcvDivR> aList) {
		if (getRcvDivL() != aList) {
			getRcvDivL().setAll(aList);
		}
	}

	/**
	 * [RcvDiv]ブロックのコンテナaRcvDivLを返します。
	 *
	 * @return RcvDivL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0160.RcvDivR> getRcvDivL() {
		return aRcvDivL;
	}

	/**
	 * aRcvDivRを作成します。
	 *
	 * @return RcvDivR
	 */
	public mcframe.clientMSBG.MSBGP0160.RcvDivR createRcvDivR() {
		return mcframe.clientMSBG.MSBGP0160.RcvDivR.create();
	}

	/**
	 * aRcvDivLを作成します。
	 *
	 * @return RcvDivL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0160.RcvDivR> createRcvDivL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0160.RcvDivR.class);
	}

	/**
	 * RcvDivTableを初期化します。
	 */
	protected void createRcvDivTable(){
		if(RcvDivTable == null){
			RcvDivTable = beansFactory.createTable2("RcvDiv.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdr1R())) ret.add(getHdr1R());
		if(!MCCollectionUtil.contains(ret, getRcvSchdL())) ret.add(getRcvSchdL());
		if(!MCCollectionUtil.contains(ret, getRcvDivL())) ret.add(getRcvDivL());
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
		if(aCnt == getHdr1R()) return "Hdr1";
		if(aCnt == getRcvSchdL()) return "RcvSchd";
		if(aCnt == getRcvDivL()) return "RcvDiv";
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
		if(bId.equals("Hdr1")) return getHdr1R();
		if(bId.equals("RcvSchd")) return getRcvSchdL();
		if(bId.equals("RcvDiv")) return getRcvDivL();
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
		ret.add(Hdr1Panel);
		ret.add(Hdr2Panel);
		ret.add(Hdr3Panel);
		ret.add(LDtlPanel);
		ret.add(RcvSchdPanel);
		ret.add(Btn1Panel);
		ret.add(RDtlPanel);
		ret.add(RcvDivPanel);
		ret.add(Btn2Panel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_RcvDivReg_MC_A() {
		aCndR = createCndR();
		aHdr1R = createHdr1R();
		aRcvSchdL = createRcvSchdL();
		aRcvDivL = createRcvDivL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBGP_RcvDivReg_MC_A(String name) {
		aCndR = createCndR();
		aHdr1R = createHdr1R();
		aRcvSchdL = createRcvSchdL();
		createRcvSchdTable();
		RcvSchdTable.setRowName(name);
		aRcvDivL = createRcvDivL();
		createRcvDivTable();
		RcvDivTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBGP_RcvDivReg_MC.jbCreateScreenOpe((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbCreateCnd((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbCreateHdrTab((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbCreateHdr1((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbCreateHdr2((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbCreateHdr3((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbCreateLDtl((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbCreateRcvSchd((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbCreateBtn1((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbCreateRDtl((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbCreateRcvDiv((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbCreateBtn2((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbCreateBtn((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbCreateEastBtn((MSBGP_RcvDivReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBGP_RcvDivReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBGP_RcvDivReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBGP_RcvDivReg p) {
	}

	/**
	 * [Hdr1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr1(MSBGP_RcvDivReg p) {
		p.Hdr1_rcv_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdr1R().rcv_amt_p());
		p.Hdr1_rcv_amt_p_PPanel.setName("Hdr1.rcv_amt_p");
		p.Hdr1_rcv_amt = p.Hdr1_rcv_amt_p_PPanel.Amt_amt;
		p.Hdr1_rcv_amt.addAliasName("Hdr1.rcv_amt", p);
		p.Hdr1_rcv_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdr1R().rcv_proc_amt_p());
		p.Hdr1_rcv_proc_amt_p_PPanel.setName("Hdr1.rcv_proc_amt_p");
		p.Hdr1_rcv_proc_amt = p.Hdr1_rcv_proc_amt_p_PPanel.Amt_amt;
		p.Hdr1_rcv_proc_amt.addAliasName("Hdr1.rcv_proc_amt", p);
		p.Hdr1_not_proc_bal_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdr1R().not_proc_bal_p());
		p.Hdr1_not_proc_bal_p_PPanel.setName("Hdr1.not_proc_bal_p");
		p.Hdr1_not_proc_bal = p.Hdr1_not_proc_bal_p_PPanel.Amt_amt;
		p.Hdr1_not_proc_bal.addAliasName("Hdr1.not_proc_bal", p);
		p.Hdr1_com_paid_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdr1R().com_paid_p());
		p.Hdr1_com_paid_p_PPanel.setName("Hdr1.com_paid_p");
		p.Hdr1_com_paid = p.Hdr1_com_paid_p_PPanel.Amt_amt;
		p.Hdr1_com_paid.addAliasName("Hdr1.com_paid", p);
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MSBGP_RcvDivReg p) {
	}

	/**
	 * [Hdr3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr3(MSBGP_RcvDivReg p) {
	}

	/**
	 * [LDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLDtl(MSBGP_RcvDivReg p) {
	}

	/**
	 * [RcvSchd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRcvSchd(MSBGP_RcvDivReg p) {
		p.RcvSchd_rcv_schd_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0160.RcvSchdR.$rcv_schd_amt_p);
		p.RcvSchd_rcv_schd_amt_p_PPanel.setName("RcvSchd.rcv_schd_amt_p");
		p.columnRcvSchd_rcv_schd_amt = p.RcvSchd_rcv_schd_amt_p_PPanel.columnAmt_amt;
		p.columnRcvSchd_rcv_schd_amt.addAliasName("RcvSchd.rcv_schd_amt", p);
	}

	/**
	 * [Btn1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn1(MSBGP_RcvDivReg p) {
	}

	/**
	 * [RDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRDtl(MSBGP_RcvDivReg p) {
	}

	/**
	 * [RcvDiv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRcvDiv(MSBGP_RcvDivReg p) {
		p.RcvDiv_rcv_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0160.RcvDivR.$rcv_amt_p);
		p.RcvDiv_rcv_amt_p_PPanel.setName("RcvDiv.rcv_amt_p");
		p.columnRcvDiv_rcv_amt = p.RcvDiv_rcv_amt_p_PPanel.columnAmt_amt;
		p.columnRcvDiv_rcv_amt.addAliasName("RcvDiv.rcv_amt", p);
		p.RcvDiv_rcv_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0160.RcvDivR.$rcv_proc_amt_p);
		p.RcvDiv_rcv_proc_amt_p_PPanel.setName("RcvDiv.rcv_proc_amt_p");
		p.columnRcvDiv_rcv_proc_amt = p.RcvDiv_rcv_proc_amt_p_PPanel.columnAmt_amt;
		p.columnRcvDiv_rcv_proc_amt.addAliasName("RcvDiv.rcv_proc_amt", p);
		p.RcvDiv_not_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0160.RcvDivR.$not_proc_amt_p);
		p.RcvDiv_not_proc_amt_p_PPanel.setName("RcvDiv.not_proc_amt_p");
		p.columnRcvDiv_not_proc_bal = p.RcvDiv_not_proc_amt_p_PPanel.columnAmt_amt;
		p.columnRcvDiv_not_proc_bal.addAliasName("RcvDiv.not_proc_bal", p);
		p.RcvDiv_com_paid_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0160.RcvDivR.$com_paid_p);
		p.RcvDiv_com_paid_p_PPanel.setName("RcvDiv.com_paid_p");
		p.columnRcvDiv_com_paid = p.RcvDiv_com_paid_p_PPanel.columnAmt_amt;
		p.columnRcvDiv_com_paid.addAliasName("RcvDiv.com_paid", p);
	}

	/**
	 * [Btn2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn2(MSBGP_RcvDivReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBGP_RcvDivReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBGP_RcvDivReg p) {
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

	
	/** [RcvDiv_bcst_cd_ListPutter]の定義 */
	private MCListPutter RcvDiv_bcst_cd_p = null;

	/**
	 * [RcvDiv_bcst_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcvDiv_bcst_cd_ListPutter() {
		if (RcvDiv_bcst_cd_p == null) {
			RcvDiv_bcst_cd_p = createRcvDiv_bcst_cd_ListPutter(columnRcvDiv_bcst_cd, "bcst_cd", "bcst_nm");

		}
		return RcvDiv_bcst_cd_p;
	}
	
	
	/** [RcvDiv_bill_dpt_cd_ListPutter]の定義 */
	private MCListPutter RcvDiv_bill_dpt_cd_p = null;

	/**
	 * [RcvDiv_bill_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRcvDiv_bill_dpt_cd_ListPutter() {
		if (RcvDiv_bill_dpt_cd_p == null) {
			RcvDiv_bill_dpt_cd_p = createRcvDiv_bill_dpt_cd_ListPutter(columnRcvDiv_bill_dpt_cd, "bill_dpt_cd", "bill_dpt_nm");

		}
		return RcvDiv_bill_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_RcvDivReg create(){
		MSBGP_RcvDivReg p = new MSBGP_RcvDivReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_RcvDivReg create(String name){
		MSBGP_RcvDivReg p = new MSBGP_RcvDivReg(name);
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
		MSBGP_RcvDivReg_MC.jbfInitScreenOpe((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbfInitCnd((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbfInitHdrTab((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbfInitHdr1((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbfInitHdr2((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbfInitHdr3((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbfInitLDtl((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbfInitRcvSchd((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbfInitBtn1((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbfInitRDtl((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbfInitRcvDiv((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbfInitBtn2((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbfInitBtn((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbfInitEastBtn((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbInitScreenOpe((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbInitCnd((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbInitHdrTab((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbInitHdr1((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbInitHdr2((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbInitHdr3((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbInitLDtl((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbInitRcvSchd((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbInitBtn1((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbInitRDtl((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbInitRcvDiv((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbInitBtn2((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbInitBtn((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.jbInitEastBtn((MSBGP_RcvDivReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_rcv_no_Label = p.beansFactory.createLabel("Cnd.rcv_no_Label");
		p.Cnd_rcv_no = p.beansFactory.createTextField("Cnd.rcv_no");
		p.Cnd_rcv_no.setLabel(p.Cnd_rcv_no_Label);
		p.Cnd_rcv_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.rcv_schd_dt_fr_Label");
		p.Cnd_rcv_schd_dt_fr = p.beansFactory.createDateField("Cnd.rcv_schd_dt_fr");
		p.Cnd_rcv_schd_dt_fr.setLabel(p.Cnd_rcv_schd_dt_fr_Label);
		p.Cnd_rcv_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.rcv_schd_dt_to_Label");
		p.Cnd_rcv_schd_dt_to = p.beansFactory.createDateField("Cnd.rcv_schd_dt_to");
		p.Cnd_rcv_schd_dt_to.setLabel(p.Cnd_rcv_schd_dt_to_Label);
		p.Cnd_inc_not_cl_flg = p.beansFactory.createCheckBox("Cnd.inc_not_cl_flg");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr1(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.Hdr1Panel = p.beansFactory.createPanel("Hdr1");
		// ブロックの項目の初期化
		p.Hdr1_rcv_no_Label = p.beansFactory.createLabel("Hdr1.rcv_no_Label");
		p.Hdr1_rcv_no = p.beansFactory.createTextField("Hdr1.rcv_no");
		p.Hdr1_rcv_no.setLabel(p.Hdr1_rcv_no_Label);
		p.Hdr1_rcv_dt_Label = p.beansFactory.createLabel("Hdr1.rcv_dt_Label");
		p.Hdr1_rcv_dt = p.beansFactory.createDateField("Hdr1.rcv_dt");
		p.Hdr1_rcv_dt.setLabel(p.Hdr1_rcv_dt_Label);
		p.Hdr1_div_flg = p.beansFactory.createCheckBox("Hdr1.div_flg");
		p.Hdr1_rcv_usr_cd_Label = p.beansFactory.createLabel("Hdr1.rcv_usr_cd_Label");
		p.Hdr1_rcv_usr_cd = p.beansFactory.createTextField("Hdr1.rcv_usr_cd");
		p.Hdr1_rcv_usr_cd.setLabel(p.Hdr1_rcv_usr_cd_Label);
		p.Hdr1_rcv_usr_nm = p.beansFactory.createTextField("Hdr1.rcv_usr_nm");
		p.Hdr1_rcv_dpt_cd_Label = p.beansFactory.createLabel("Hdr1.rcv_dpt_cd_Label");
		p.Hdr1_rcv_dpt_cd = p.beansFactory.createTextField("Hdr1.rcv_dpt_cd");
		p.Hdr1_rcv_dpt_cd.setLabel(p.Hdr1_rcv_dpt_cd_Label);
		p.Hdr1_rcv_dpt_nm = p.beansFactory.createTextField("Hdr1.rcv_dpt_nm");
		p.Hdr1_wg_cd_Label = p.beansFactory.createLabel("Hdr1.wg_cd_Label");
		p.Hdr1_wg_cd = p.beansFactory.createTextField("Hdr1.wg_cd");
		p.Hdr1_wg_cd.setLabel(p.Hdr1_wg_cd_Label);
		p.Hdr1_wg_nm = p.beansFactory.createTextField("Hdr1.wg_nm");
		p.Hdr1_rcst_cd_Label = p.beansFactory.createLabel("Hdr1.rcst_cd_Label");
		p.Hdr1_rcst_cd = p.beansFactory.createTextField("Hdr1.rcst_cd");
		p.Hdr1_rcst_cd.setLabel(p.Hdr1_rcst_cd_Label);
		p.Hdr1_rcst_nm = p.beansFactory.createTextField("Hdr1.rcst_nm");
		p.Hdr1_bcst_cd_Label = p.beansFactory.createLabel("Hdr1.bcst_cd_Label");
		p.Hdr1_bcst_cd = p.beansFactory.createTextField("Hdr1.bcst_cd");
		p.Hdr1_bcst_cd.setLabel(p.Hdr1_bcst_cd_Label);
		p.Hdr1_bcst_nm = p.beansFactory.createTextField("Hdr1.bcst_nm");
		p.Hdr1_bill_dpt_cd_Label = p.beansFactory.createLabel("Hdr1.bill_dpt_cd_Label");
		p.Hdr1_bill_dpt_cd = p.beansFactory.createTextField("Hdr1.bill_dpt_cd");
		p.Hdr1_bill_dpt_cd.setLabel(p.Hdr1_bill_dpt_cd_Label);
		p.Hdr1_bill_dpt_nm = p.beansFactory.createTextField("Hdr1.bill_dpt_nm");
		p.Hdr1_trd_cur_cd_Label = p.beansFactory.createLabel("Hdr1.trd_cur_cd_Label");
		p.Hdr1_trd_cur_cd = p.beansFactory.createTextField("Hdr1.trd_cur_cd");
		p.Hdr1_trd_cur_cd.setLabel(p.Hdr1_trd_cur_cd_Label);
		p.Hdr1_trd_cur_nm = p.beansFactory.createTextField("Hdr1.trd_cur_nm");
		p.Hdr1_amt_dec_place = p.beansFactory.createNumberField("Hdr1.amt_dec_place");
		p.Hdr1_xrate_Label = p.beansFactory.createLabel("Hdr1.xrate_Label");
		p.Hdr1_xrate = p.beansFactory.createNumberField("Hdr1.xrate");
		p.Hdr1_xrate.setLabel(p.Hdr1_xrate_Label);
		p.Hdr1_rcv_mtd_cd_Label = p.beansFactory.createLabel("Hdr1.rcv_mtd_cd_Label");
		p.Hdr1_rcv_mtd_cd = p.beansFactory.createTextField("Hdr1.rcv_mtd_cd");
		p.Hdr1_rcv_mtd_cd.setLabel(p.Hdr1_rcv_mtd_cd_Label);
		p.Hdr1_rcv_mtd_nm = p.beansFactory.createTextField("Hdr1.rcv_mtd_nm");
		p.Hdr1_bank_ac_cd_Label = p.beansFactory.createLabel("Hdr1.bank_ac_cd_Label");
		p.Hdr1_bank_ac_cd = p.beansFactory.createTextField("Hdr1.bank_ac_cd");
		p.Hdr1_bank_ac_cd.setLabel(p.Hdr1_bank_ac_cd_Label);
		p.Hdr1_bank_ac_nm = p.beansFactory.createTextField("Hdr1.bank_ac_nm");
		p.Hdr1_xfr_psn_Label = p.beansFactory.createLabel("Hdr1.xfr_psn_Label");
		p.Hdr1_xfr_psn = p.beansFactory.createTextField("Hdr1.xfr_psn");
		p.Hdr1_xfr_psn.setLabel(p.Hdr1_xfr_psn_Label);
		p.Hdr1_rcv_rmrks_Label = p.beansFactory.createLabel("Hdr1.rcv_rmrks_Label");
		p.Hdr1_rcv_rmrks = p.beansFactory.createTextField("Hdr1.rcv_rmrks");
		p.Hdr1_rcv_rmrks.setLabel(p.Hdr1_rcv_rmrks_Label);
		p.Hdr1_rcv_sub_char1_Label = p.beansFactory.createLabel("Hdr1.rcv_sub_char1_Label");
		p.Hdr1_rcv_sub_char1 = p.beansFactory.createTextField("Hdr1.rcv_sub_char1");
		p.Hdr1_rcv_sub_char1.setLabel(p.Hdr1_rcv_sub_char1_Label);
		p.Hdr1_rcv_sub_char2_Label = p.beansFactory.createLabel("Hdr1.rcv_sub_char2_Label");
		p.Hdr1_rcv_sub_char2 = p.beansFactory.createTextField("Hdr1.rcv_sub_char2");
		p.Hdr1_rcv_sub_char2.setLabel(p.Hdr1_rcv_sub_char2_Label);
		p.Hdr1_rcv_sub_char3_Label = p.beansFactory.createLabel("Hdr1.rcv_sub_char3_Label");
		p.Hdr1_rcv_sub_char3 = p.beansFactory.createTextField("Hdr1.rcv_sub_char3");
		p.Hdr1_rcv_sub_char3.setLabel(p.Hdr1_rcv_sub_char3_Label);
		p.Hdr1_rcv_auto_appl_tgt_flg = p.beansFactory.createCheckBox("Hdr1.rcv_auto_appl_tgt_flg");
		p.Hdr1_auto_appl_basis_dt_Label = p.beansFactory.createLabel("Hdr1.auto_appl_basis_dt_Label");
		p.Hdr1_auto_appl_basis_dt = p.beansFactory.createDateField("Hdr1.auto_appl_basis_dt");
		p.Hdr1_auto_appl_basis_dt.setLabel(p.Hdr1_auto_appl_basis_dt_Label);
		p.Hdr1_auto_appl_sts_typ_Label = p.beansFactory.createLabel("Hdr1.auto_appl_sts_typ_Label");
		p.Hdr1_auto_appl_sts_typ = p.beansFactory.createTextField("Hdr1.auto_appl_sts_typ");
		p.Hdr1_auto_appl_sts_typ.setLabel(p.Hdr1_auto_appl_sts_typ_Label);
		p.Hdr1_auto_appl_sts_typ_nm = p.beansFactory.createTextField("Hdr1.auto_appl_sts_typ_nm");
		p.Hdr1_note_no_Label = p.beansFactory.createLabel("Hdr1.note_no_Label");
		p.Hdr1_note_no = p.beansFactory.createTextField("Hdr1.note_no");
		p.Hdr1_note_no.setLabel(p.Hdr1_note_no_Label);
		p.Hdr1_note_typ_Label = p.beansFactory.createLabel("Hdr1.note_typ_Label");
		p.Hdr1_note_typ = p.beansFactory.createTextField("Hdr1.note_typ");
		p.Hdr1_note_typ.setLabel(p.Hdr1_note_typ_Label);
		p.Hdr1_note_typ_nm = p.beansFactory.createTextField("Hdr1.note_typ_nm");
		p.Hdr1_draw_dt_Label = p.beansFactory.createLabel("Hdr1.draw_dt_Label");
		p.Hdr1_draw_dt = p.beansFactory.createDateField("Hdr1.draw_dt");
		p.Hdr1_draw_dt.setLabel(p.Hdr1_draw_dt_Label);
		p.Hdr1_due_dt_Label = p.beansFactory.createLabel("Hdr1.due_dt_Label");
		p.Hdr1_due_dt = p.beansFactory.createDateField("Hdr1.due_dt");
		p.Hdr1_due_dt.setLabel(p.Hdr1_due_dt_Label);
		p.Hdr1_drawer_nm_Label = p.beansFactory.createLabel("Hdr1.drawer_nm_Label");
		p.Hdr1_drawer_nm = p.beansFactory.createTextField("Hdr1.drawer_nm");
		p.Hdr1_drawer_nm.setLabel(p.Hdr1_drawer_nm_Label);
		p.Hdr1_endrsr_Label = p.beansFactory.createLabel("Hdr1.endrsr_Label");
		p.Hdr1_endrsr = p.beansFactory.createTextField("Hdr1.endrsr");
		p.Hdr1_endrsr.setLabel(p.Hdr1_endrsr_Label);
		p.Hdr1_accptr_Label = p.beansFactory.createLabel("Hdr1.accptr_Label");
		p.Hdr1_accptr = p.beansFactory.createTextField("Hdr1.accptr");
		p.Hdr1_accptr.setLabel(p.Hdr1_accptr_Label);
		p.Hdr1_draw_bank_cd_Label = p.beansFactory.createLabel("Hdr1.draw_bank_cd_Label");
		p.Hdr1_draw_bank_cd = p.beansFactory.createTextField("Hdr1.draw_bank_cd");
		p.Hdr1_draw_bank_cd.setLabel(p.Hdr1_draw_bank_cd_Label);
		p.Hdr1_draw_bank_nm = p.beansFactory.createTextField("Hdr1.draw_bank_nm");
		p.Hdr1_draw_branch_cd_Label = p.beansFactory.createLabel("Hdr1.draw_branch_cd_Label");
		p.Hdr1_draw_branch_cd = p.beansFactory.createTextField("Hdr1.draw_branch_cd");
		p.Hdr1_draw_branch_cd.setLabel(p.Hdr1_draw_branch_cd_Label);
		p.Hdr1_draw_branch_nm = p.beansFactory.createTextField("Hdr1.draw_branch_nm");
		p.Hdr1_note_rsn_cd_Label = p.beansFactory.createLabel("Hdr1.note_rsn_cd_Label");
		p.Hdr1_note_rsn_cd = p.beansFactory.createTextField("Hdr1.note_rsn_cd");
		p.Hdr1_note_rsn_cd.setLabel(p.Hdr1_note_rsn_cd_Label);
		p.Hdr1_note_rsn_nm = p.beansFactory.createTextField("Hdr1.note_rsn_nm");
		p.Hdr1_note_sub_char1_Label = p.beansFactory.createLabel("Hdr1.note_sub_char1_Label");
		p.Hdr1_note_sub_char1 = p.beansFactory.createTextField("Hdr1.note_sub_char1");
		p.Hdr1_note_sub_char1.setLabel(p.Hdr1_note_sub_char1_Label);
		p.Hdr1_note_sub_char2_Label = p.beansFactory.createLabel("Hdr1.note_sub_char2_Label");
		p.Hdr1_note_sub_char2 = p.beansFactory.createTextField("Hdr1.note_sub_char2");
		p.Hdr1_note_sub_char2.setLabel(p.Hdr1_note_sub_char2_Label);
		p.Hdr1_note_sub_char3_Label = p.beansFactory.createLabel("Hdr1.note_sub_char3_Label");
		p.Hdr1_note_sub_char3 = p.beansFactory.createTextField("Hdr1.note_sub_char3");
		p.Hdr1_note_sub_char3.setLabel(p.Hdr1_note_sub_char3_Label);
		p.Hdr1_ins_usr_id_Label = p.beansFactory.createLabel("Hdr1.ins_usr_id_Label");
		p.Hdr1_ins_usr_id = p.beansFactory.createTextField("Hdr1.ins_usr_id");
		p.Hdr1_ins_usr_id.setLabel(p.Hdr1_ins_usr_id_Label);
		p.Hdr1_ins_usr_nm = p.beansFactory.createTextField("Hdr1.ins_usr_nm");
		p.Hdr1_ins_func_id_Label = p.beansFactory.createLabel("Hdr1.ins_func_id_Label");
		p.Hdr1_ins_func_id = p.beansFactory.createTextField("Hdr1.ins_func_id");
		p.Hdr1_ins_func_id.setLabel(p.Hdr1_ins_func_id_Label);
		p.Hdr1_ins_func_nm = p.beansFactory.createTextField("Hdr1.ins_func_nm");
		p.Hdr1_upd_usr_id_Label = p.beansFactory.createLabel("Hdr1.upd_usr_id_Label");
		p.Hdr1_upd_usr_id = p.beansFactory.createTextField("Hdr1.upd_usr_id");
		p.Hdr1_upd_usr_id.setLabel(p.Hdr1_upd_usr_id_Label);
		p.Hdr1_upd_usr_nm = p.beansFactory.createTextField("Hdr1.upd_usr_nm");
		p.Hdr1_upd_func_id_Label = p.beansFactory.createLabel("Hdr1.upd_func_id_Label");
		p.Hdr1_upd_func_id = p.beansFactory.createTextField("Hdr1.upd_func_id");
		p.Hdr1_upd_func_id.setLabel(p.Hdr1_upd_func_id_Label);
		p.Hdr1_upd_func_nm = p.beansFactory.createTextField("Hdr1.upd_func_nm");
		p.Hdr1_ins_ts_Label = p.beansFactory.createLabel("Hdr1.ins_ts_Label");
		p.Hdr1_ins_ts = p.beansFactory.createTimestampField("Hdr1.ins_ts");
		p.Hdr1_ins_ts.setLabel(p.Hdr1_ins_ts_Label);
		p.Hdr1_upd_ts_Label = p.beansFactory.createLabel("Hdr1.upd_ts_Label");
		p.Hdr1_upd_ts = p.beansFactory.createTimestampField("Hdr1.upd_ts");
		p.Hdr1_upd_ts.setLabel(p.Hdr1_upd_ts_Label);
		p.Hdr1_upd_srv_req_no_Label = p.beansFactory.createLabel("Hdr1.upd_srv_req_no_Label");
		p.Hdr1_upd_srv_req_no = p.beansFactory.createTextField("Hdr1.upd_srv_req_no");
		p.Hdr1_upd_srv_req_no.setLabel(p.Hdr1_upd_srv_req_no_Label);
		p.Hdr1_upri_dec_place = p.beansFactory.createNumberField("Hdr1.upri_dec_place");
		p.Hdr1_rcv_upd_cntr = p.beansFactory.createNumberField("Hdr1.rcv_upd_cntr");
		p.Hdr1_rcv_dat_typ = p.beansFactory.createTextField("Hdr1.rcv_dat_typ");
		p.Hdr1_div_src_rcv_no = p.beansFactory.createTextField("Hdr1.div_src_rcv_no");
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr2(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr3(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.Hdr3Panel = p.beansFactory.createPanel("Hdr3");
		// ブロックの項目の初期化
	}

	/**
	 * [LDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLDtl(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.LDtlPanel = p.beansFactory.createPanel("LDtl");
		// ブロックの項目の初期化
	}

	/**
	 * [RcvSchd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRcvSchd(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.RcvSchdPanel = p.beansFactory.createPanel("RcvSchd");
		p.RcvSchdTitledBorder = p.beansFactory.createTitledBorder();
		p.RcvSchdScrollPane = p.beansFactory.createScrollPane("RcvSchd.scroll");
		p.createRcvSchdTable();
		// ブロックの項目の初期化
		p.columnRcvSchd_check = p.beansFactory.createTableColumn("RcvSchd.check", MCColumnType.CHECK);
		p.columnRcvSchd_bcst_cd = p.beansFactory.createTableColumn("RcvSchd.bcst_cd", MCColumnType.TEXT);
		p.columnRcvSchd_bcst_nm = p.beansFactory.createTableColumn("RcvSchd.bcst_nm", MCColumnType.TEXT);
		p.columnRcvSchd_bill_dpt_cd = p.beansFactory.createTableColumn("RcvSchd.bill_dpt_cd", MCColumnType.TEXT);
		p.columnRcvSchd_bill_dpt_nm = p.beansFactory.createTableColumn("RcvSchd.bill_dpt_nm", MCColumnType.TEXT);
		p.columnRcvSchd_rcv_schd_dt = p.beansFactory.createTableColumn("RcvSchd.rcv_schd_dt", MCColumnType.DATE);
		p.columnRcvSchd_trd_cur_cd = p.beansFactory.createTableColumn("RcvSchd.trd_cur_cd", MCColumnType.TEXT);
		p.columnRcvSchd_bill_no = p.beansFactory.createTableColumn("RcvSchd.bill_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn1(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.Btn1Panel = p.beansFactory.createPanel("Btn1");
		// ブロックの項目の初期化
		p.Btn1_select_all = p.beansFactory.createButton("Btn1.select_all", "no_border");
		p.Btn1_deselect_all = p.beansFactory.createButton("Btn1.deselect_all", "no_border");
		p.Btn1_reflection = p.beansFactory.createButton("Btn1.reflection", "ref");
	}

	/**
	 * [RDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRDtl(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.RDtlPanel = p.beansFactory.createPanel("RDtl");
		// ブロックの項目の初期化
	}

	/**
	 * [RcvDiv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRcvDiv(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.RcvDivPanel = p.beansFactory.createPanel("RcvDiv");
		p.RcvDivTitledBorder = p.beansFactory.createTitledBorder();
		p.RcvDivScrollPane = p.beansFactory.createScrollPane("RcvDiv.scroll");
		p.createRcvDivTable();
		// ブロックの項目の初期化
		p.columnRcvDiv_rcv_no = p.beansFactory.createTableColumn("RcvDiv.rcv_no", MCColumnType.TEXT);
		p.columnRcvDiv_bcst_cd = p.beansFactory.createTableColumn("RcvDiv.bcst_cd", MCColumnType.TEXT_COMBO);
		p.columnRcvDiv_bcst_nm = p.beansFactory.createTableColumn("RcvDiv.bcst_nm", MCColumnType.TEXT);
		p.columnRcvDiv_bill_dpt_cd = p.beansFactory.createTableColumn("RcvDiv.bill_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnRcvDiv_bill_dpt_nm = p.beansFactory.createTableColumn("RcvDiv.bill_dpt_nm", MCColumnType.TEXT);
		p.columnRcvDiv_rcv_rmrks = p.beansFactory.createTableColumn("RcvDiv.rcv_rmrks", MCColumnType.TEXT);
		p.columnRcvDiv_rcv_sub_char1 = p.beansFactory.createTableColumn("RcvDiv.rcv_sub_char1", MCColumnType.TEXT);
		p.columnRcvDiv_rcv_sub_char2 = p.beansFactory.createTableColumn("RcvDiv.rcv_sub_char2", MCColumnType.TEXT);
		p.columnRcvDiv_rcv_sub_char3 = p.beansFactory.createTableColumn("RcvDiv.rcv_sub_char3", MCColumnType.TEXT);
		p.columnRcvDiv_div_src_rcv_upd_cntr = p.beansFactory.createTableColumn("RcvDiv.div_src_rcv_upd_cntr", MCColumnType.NUMBER);
	}

	/**
	 * [Btn2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn2(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.Btn2Panel = p.beansFactory.createPanel("Btn2");
		// ブロックの項目の初期化
		p.Btn2_radd = p.beansFactory.createButton("Btn2.radd", "no_border");
		p.Btn2_rdel = p.beansFactory.createButton("Btn2.rdel", "no_border");
		p.Btn2_rcopy = p.beansFactory.createButton("Btn2.rcopy", "no_border");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBGP0070 = p.beansFactory.createButton("Btn.open_MSBGP0070", "open");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBGP_RcvDivReg p) {
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
	protected static void jbInitCnd(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrTabPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0160.CndR.ope_META);
		p.CndPanel.add(p.Cnd_rcv_no_Label);
		p.CndPanel.add(p.Cnd_rcv_no);
		p.CndPanel.setLastBeans(p.Cnd_rcv_no);
		p.Cnd_rcv_no.setNextBeans(p.Cnd_rcv_schd_dt_fr);
		p.Cnd_rcv_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0160.CndR.rcv_no_META);
		p.CndPanel.add(p.Cnd_rcv_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_rcv_schd_dt_fr);
		p.Cnd_rcv_schd_dt_fr.setNextBeans(p.Cnd_rcv_schd_dt_to);
		p.Cnd_rcv_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0160.CndR.rcv_schd_dt_fr_META);
		p.Cnd_rcv_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rcv_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_rcv_schd_dt_to);
		p.Cnd_rcv_schd_dt_to.setNextBeans(p.Cnd_inc_not_cl_flg);
		p.Cnd_rcv_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0160.CndR.rcv_schd_dt_to_META);
		p.Cnd_rcv_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_inc_not_cl_flg);
		p.Cnd_inc_not_cl_flg.setNextBeans(p.Cnd_srch);
		p.Cnd_inc_not_cl_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0160.CndR.inc_not_cl_flg_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.LDtlPanel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("CT");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.Hdr1Panel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.Hdr1Panel);
		p.Hdr1Panel.setNextBeans(p.Hdr2Panel);
		p.HdrTabTab.add(p.Hdr2Panel, "HdrTab.tab2");
		p.Hdr2Panel.setNextBeans(p.Hdr3Panel);
		p.HdrTabTab.add(p.Hdr3Panel, "HdrTab.tab3");
	}

	/**
	 * [Hdr1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr1(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.Hdr1Panel.setNextBeans(p.Hdr2Panel);
		// ブロックの項目の初期化
		p.Hdr1Panel.add(p.Hdr1_rcv_no_Label);
		p.Hdr1Panel.add(p.Hdr1_rcv_no);
		p.Hdr1Panel.setLastBeans(p.Hdr1_rcv_no);
		p.Hdr1_rcv_no.setNextBeans(p.Hdr1_rcv_dt);
		p.Hdr1_rcv_no.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.rcv_no_META);
		p.Hdr1Panel.add(p.Hdr1_rcv_dt_Label);
		p.Hdr1Panel.add(p.Hdr1_rcv_dt);
		p.Hdr1_rcv_dt.setNextBeans(p.Hdr1_div_flg);
		p.Hdr1_rcv_dt.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.rcv_dt_META);
		p.Hdr1_rcv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_div_flg);
		p.Hdr1_div_flg.setNextBeans(p.Hdr1_rcv_usr_cd);
		p.Hdr1_div_flg.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.div_flg_META);
		p.Hdr1Panel.add(p.Hdr1_rcv_usr_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_rcv_usr_cd);
		p.Hdr1_rcv_usr_cd.setNextBeans(p.Hdr1_rcv_usr_nm);
		p.Hdr1_rcv_usr_cd.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.rcv_usr_cd_META);
		p.Hdr1Panel.add(p.Hdr1_rcv_usr_nm);
		p.Hdr1_rcv_usr_nm.setNextBeans(p.Hdr1_rcv_dpt_cd);
		p.Hdr1_rcv_usr_nm.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.rcv_usr_nm_META);
		p.Hdr1Panel.add(p.Hdr1_rcv_dpt_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_rcv_dpt_cd);
		p.Hdr1_rcv_dpt_cd.setNextBeans(p.Hdr1_rcv_dpt_nm);
		p.Hdr1_rcv_dpt_cd.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.rcv_dpt_cd_META);
		p.Hdr1Panel.add(p.Hdr1_rcv_dpt_nm);
		p.Hdr1_rcv_dpt_nm.setNextBeans(p.Hdr1_wg_cd);
		p.Hdr1_rcv_dpt_nm.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.rcv_dpt_nm_META);
		p.Hdr1Panel.add(p.Hdr1_wg_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_wg_cd);
		p.Hdr1_wg_cd.setNextBeans(p.Hdr1_wg_nm);
		p.Hdr1_wg_cd.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.wg_cd_META);
		p.Hdr1Panel.add(p.Hdr1_wg_nm);
		p.Hdr1_wg_nm.setNextBeans(p.Hdr1_rcst_cd);
		p.Hdr1_wg_nm.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.wg_nm_META);
		p.Hdr1Panel.add(p.Hdr1_rcst_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_rcst_cd);
		p.Hdr1_rcst_cd.setNextBeans(p.Hdr1_rcst_nm);
		p.Hdr1_rcst_cd.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.rcst_cd_META);
		p.Hdr1Panel.add(p.Hdr1_rcst_nm);
		p.Hdr1_rcst_nm.setNextBeans(p.Hdr1_bcst_cd);
		p.Hdr1_rcst_nm.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.rcst_nm_META);
		p.Hdr1Panel.add(p.Hdr1_bcst_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_bcst_cd);
		p.Hdr1_bcst_cd.setNextBeans(p.Hdr1_bcst_nm);
		p.Hdr1_bcst_cd.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.bcst_cd_META);
		p.Hdr1Panel.add(p.Hdr1_bcst_nm);
		p.Hdr1_bcst_nm.setNextBeans(p.Hdr1_bill_dpt_cd);
		p.Hdr1_bcst_nm.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.bcst_nm_META);
		p.Hdr1Panel.add(p.Hdr1_bill_dpt_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_bill_dpt_cd);
		p.Hdr1_bill_dpt_cd.setNextBeans(p.Hdr1_bill_dpt_nm);
		p.Hdr1_bill_dpt_cd.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.bill_dpt_cd_META);
		p.Hdr1Panel.add(p.Hdr1_bill_dpt_nm);
		p.Hdr1_bill_dpt_nm.setNextBeans(p.Hdr1_trd_cur_cd);
		p.Hdr1_bill_dpt_nm.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.bill_dpt_nm_META);
		p.Hdr1Panel.add(p.Hdr1_trd_cur_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_trd_cur_cd);
		p.Hdr1_trd_cur_cd.setNextBeans(p.Hdr1_trd_cur_nm);
		p.Hdr1_trd_cur_cd.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.trd_cur_cd_META);
		p.Hdr1Panel.add(p.Hdr1_trd_cur_nm);
		p.Hdr1_trd_cur_nm.setNextBeans(p.Hdr1_amt_dec_place);
		p.Hdr1_trd_cur_nm.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.trd_cur_nm_META);
		p.Hdr1Panel.add(p.Hdr1_amt_dec_place);
		p.Hdr1_amt_dec_place.setNextBeans(p.Hdr1_xrate);
		p.Hdr1_amt_dec_place.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.amt_dec_place_META);
		p.Hdr1Panel.add(p.Hdr1_xrate_Label);
		p.Hdr1Panel.add(p.Hdr1_xrate);
		p.Hdr1_xrate.setNextBeans(p.Hdr1_rcv_amt_p_PPanel);
		p.Hdr1_xrate.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.xrate_META);
		p.Hdr1Panel.add(p.Hdr1_rcv_amt_p_PPanel);
		p.Hdr1_rcv_amt_p_PPanel.setNextBeans(p.Hdr1_rcv_proc_amt_p_PPanel);
		p.Hdr1Panel.add(p.Hdr1_rcv_proc_amt_p_PPanel);
		p.Hdr1_rcv_proc_amt_p_PPanel.setNextBeans(p.Hdr1_not_proc_bal_p_PPanel);
		p.Hdr1Panel.add(p.Hdr1_not_proc_bal_p_PPanel);
		p.Hdr1_not_proc_bal_p_PPanel.setNextBeans(p.Hdr1_rcv_mtd_cd);
		p.Hdr1Panel.add(p.Hdr1_rcv_mtd_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_rcv_mtd_cd);
		p.Hdr1_rcv_mtd_cd.setNextBeans(p.Hdr1_rcv_mtd_nm);
		p.Hdr1_rcv_mtd_cd.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.rcv_mtd_cd_META);
		p.Hdr1Panel.add(p.Hdr1_rcv_mtd_nm);
		p.Hdr1_rcv_mtd_nm.setNextBeans(p.Hdr1_bank_ac_cd);
		p.Hdr1_rcv_mtd_nm.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.rcv_mtd_nm_META);
		p.Hdr1Panel.add(p.Hdr1_bank_ac_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_bank_ac_cd);
		p.Hdr1_bank_ac_cd.setNextBeans(p.Hdr1_bank_ac_nm);
		p.Hdr1_bank_ac_cd.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.bank_ac_cd_META);
		p.Hdr1Panel.add(p.Hdr1_bank_ac_nm);
		p.Hdr1_bank_ac_nm.setNextBeans(p.Hdr1_xfr_psn);
		p.Hdr1_bank_ac_nm.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.bank_ac_nm_META);
		p.Hdr1Panel.add(p.Hdr1_xfr_psn_Label);
		p.Hdr1Panel.add(p.Hdr1_xfr_psn);
		p.Hdr1_xfr_psn.setNextBeans(p.Hdr1_rcv_rmrks);
		p.Hdr1_xfr_psn.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.xfr_psn_META);
		p.Hdr1Panel.add(p.Hdr1_rcv_rmrks_Label);
		p.Hdr1Panel.add(p.Hdr1_rcv_rmrks);
		p.Hdr1_rcv_rmrks.setNextBeans(p.Hdr1_rcv_sub_char1);
		p.Hdr1_rcv_rmrks.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.rcv_rmrks_META);
		p.Hdr1Panel.add(p.Hdr1_rcv_sub_char1_Label);
		p.Hdr1Panel.add(p.Hdr1_rcv_sub_char1);
		p.Hdr1_rcv_sub_char1.setNextBeans(p.Hdr1_rcv_sub_char2);
		p.Hdr1_rcv_sub_char1.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.rcv_sub_char1_META);
		p.Hdr1Panel.add(p.Hdr1_rcv_sub_char2_Label);
		p.Hdr1Panel.add(p.Hdr1_rcv_sub_char2);
		p.Hdr1_rcv_sub_char2.setNextBeans(p.Hdr1_rcv_sub_char3);
		p.Hdr1_rcv_sub_char2.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.rcv_sub_char2_META);
		p.Hdr1Panel.add(p.Hdr1_rcv_sub_char3_Label);
		p.Hdr1Panel.add(p.Hdr1_rcv_sub_char3);
		p.Hdr1_rcv_sub_char3.setNextBeans(p.Hdr1_rcv_auto_appl_tgt_flg);
		p.Hdr1_rcv_sub_char3.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.rcv_sub_char3_META);
		p.Hdr1Panel.add(p.Hdr1_rcv_auto_appl_tgt_flg);
		p.Hdr1_rcv_auto_appl_tgt_flg.setNextBeans(p.Hdr1_auto_appl_basis_dt);
		p.Hdr1_rcv_auto_appl_tgt_flg.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.rcv_auto_appl_tgt_flg_META);
		p.Hdr1Panel.add(p.Hdr1_auto_appl_basis_dt_Label);
		p.Hdr1Panel.add(p.Hdr1_auto_appl_basis_dt);
		p.Hdr1_auto_appl_basis_dt.setNextBeans(p.Hdr1_com_paid_p_PPanel);
		p.Hdr1_auto_appl_basis_dt.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.auto_appl_basis_dt_META);
		p.Hdr1_auto_appl_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_com_paid_p_PPanel);
		p.Hdr1_com_paid_p_PPanel.setNextBeans(p.Hdr1_auto_appl_sts_typ);
		p.Hdr1Panel.add(p.Hdr1_auto_appl_sts_typ_Label);
		p.Hdr1Panel.add(p.Hdr1_auto_appl_sts_typ);
		p.Hdr1_auto_appl_sts_typ.setNextBeans(p.Hdr1_auto_appl_sts_typ_nm);
		p.Hdr1_auto_appl_sts_typ.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.auto_appl_sts_typ_META);
		p.Hdr1Panel.add(p.Hdr1_auto_appl_sts_typ_nm);
		p.Hdr1_auto_appl_sts_typ_nm.setNextBeans(p.Hdr1_upri_dec_place);
		p.Hdr1_auto_appl_sts_typ_nm.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.auto_appl_sts_typ_nm_META);
		p.Hdr2Panel.add(p.Hdr1_note_no_Label);
		p.Hdr2Panel.add(p.Hdr1_note_no);
		p.Hdr2Panel.setLastBeans(p.Hdr1_note_no);
		p.Hdr1_note_no.setNextBeans(p.Hdr1_note_typ);
		p.Hdr1_note_no.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.note_no_META);
		p.Hdr2Panel.add(p.Hdr1_note_typ_Label);
		p.Hdr2Panel.add(p.Hdr1_note_typ);
		p.Hdr1_note_typ.setNextBeans(p.Hdr1_note_typ_nm);
		p.Hdr1_note_typ.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.note_typ_META);
		p.Hdr2Panel.add(p.Hdr1_note_typ_nm);
		p.Hdr1_note_typ_nm.setNextBeans(p.Hdr1_draw_dt);
		p.Hdr1_note_typ_nm.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.note_typ_nm_META);
		p.Hdr2Panel.add(p.Hdr1_draw_dt_Label);
		p.Hdr2Panel.add(p.Hdr1_draw_dt);
		p.Hdr1_draw_dt.setNextBeans(p.Hdr1_due_dt);
		p.Hdr1_draw_dt.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.draw_dt_META);
		p.Hdr1_draw_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr2Panel.add(p.Hdr1_due_dt_Label);
		p.Hdr2Panel.add(p.Hdr1_due_dt);
		p.Hdr1_due_dt.setNextBeans(p.Hdr1_drawer_nm);
		p.Hdr1_due_dt.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.due_dt_META);
		p.Hdr1_due_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr2Panel.add(p.Hdr1_drawer_nm_Label);
		p.Hdr2Panel.add(p.Hdr1_drawer_nm);
		p.Hdr1_drawer_nm.setNextBeans(p.Hdr1_endrsr);
		p.Hdr1_drawer_nm.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.drawer_nm_META);
		p.Hdr2Panel.add(p.Hdr1_endrsr_Label);
		p.Hdr2Panel.add(p.Hdr1_endrsr);
		p.Hdr1_endrsr.setNextBeans(p.Hdr1_accptr);
		p.Hdr1_endrsr.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.endrsr_META);
		p.Hdr2Panel.add(p.Hdr1_accptr_Label);
		p.Hdr2Panel.add(p.Hdr1_accptr);
		p.Hdr1_accptr.setNextBeans(p.Hdr1_draw_bank_cd);
		p.Hdr1_accptr.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.accptr_META);
		p.Hdr2Panel.add(p.Hdr1_draw_bank_cd_Label);
		p.Hdr2Panel.add(p.Hdr1_draw_bank_cd);
		p.Hdr1_draw_bank_cd.setNextBeans(p.Hdr1_draw_bank_nm);
		p.Hdr1_draw_bank_cd.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.draw_bank_cd_META);
		p.Hdr2Panel.add(p.Hdr1_draw_bank_nm);
		p.Hdr1_draw_bank_nm.setNextBeans(p.Hdr1_draw_branch_cd);
		p.Hdr1_draw_bank_nm.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.draw_bank_nm_META);
		p.Hdr2Panel.add(p.Hdr1_draw_branch_cd_Label);
		p.Hdr2Panel.add(p.Hdr1_draw_branch_cd);
		p.Hdr1_draw_branch_cd.setNextBeans(p.Hdr1_draw_branch_nm);
		p.Hdr1_draw_branch_cd.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.draw_branch_cd_META);
		p.Hdr2Panel.add(p.Hdr1_draw_branch_nm);
		p.Hdr1_draw_branch_nm.setNextBeans(p.Hdr1_note_rsn_cd);
		p.Hdr1_draw_branch_nm.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.draw_branch_nm_META);
		p.Hdr2Panel.add(p.Hdr1_note_rsn_cd_Label);
		p.Hdr2Panel.add(p.Hdr1_note_rsn_cd);
		p.Hdr1_note_rsn_cd.setNextBeans(p.Hdr1_note_rsn_nm);
		p.Hdr1_note_rsn_cd.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.note_rsn_cd_META);
		p.Hdr2Panel.add(p.Hdr1_note_rsn_nm);
		p.Hdr1_note_rsn_nm.setNextBeans(p.Hdr1_note_sub_char1);
		p.Hdr1_note_rsn_nm.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.note_rsn_nm_META);
		p.Hdr2Panel.add(p.Hdr1_note_sub_char1_Label);
		p.Hdr2Panel.add(p.Hdr1_note_sub_char1);
		p.Hdr1_note_sub_char1.setNextBeans(p.Hdr1_note_sub_char2);
		p.Hdr1_note_sub_char1.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.note_sub_char1_META);
		p.Hdr2Panel.add(p.Hdr1_note_sub_char2_Label);
		p.Hdr2Panel.add(p.Hdr1_note_sub_char2);
		p.Hdr1_note_sub_char2.setNextBeans(p.Hdr1_note_sub_char3);
		p.Hdr1_note_sub_char2.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.note_sub_char2_META);
		p.Hdr2Panel.add(p.Hdr1_note_sub_char3_Label);
		p.Hdr2Panel.add(p.Hdr1_note_sub_char3);
		p.Hdr1_note_sub_char3.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.note_sub_char3_META);
		p.Hdr3Panel.add(p.Hdr1_ins_usr_id_Label);
		p.Hdr3Panel.add(p.Hdr1_ins_usr_id);
		p.Hdr3Panel.setLastBeans(p.Hdr1_ins_usr_id);
		p.Hdr1_ins_usr_id.setNextBeans(p.Hdr1_ins_usr_nm);
		p.Hdr1_ins_usr_id.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.ins_usr_id_META);
		p.Hdr3Panel.add(p.Hdr1_ins_usr_nm);
		p.Hdr1_ins_usr_nm.setNextBeans(p.Hdr1_ins_func_id);
		p.Hdr1_ins_usr_nm.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.ins_usr_nm_META);
		p.Hdr3Panel.add(p.Hdr1_ins_func_id_Label);
		p.Hdr3Panel.add(p.Hdr1_ins_func_id);
		p.Hdr1_ins_func_id.setNextBeans(p.Hdr1_ins_func_nm);
		p.Hdr1_ins_func_id.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.ins_func_id_META);
		p.Hdr3Panel.add(p.Hdr1_ins_func_nm);
		p.Hdr1_ins_func_nm.setNextBeans(p.Hdr1_upd_usr_id);
		p.Hdr1_ins_func_nm.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.ins_func_nm_META);
		p.Hdr3Panel.add(p.Hdr1_upd_usr_id_Label);
		p.Hdr3Panel.add(p.Hdr1_upd_usr_id);
		p.Hdr1_upd_usr_id.setNextBeans(p.Hdr1_upd_usr_nm);
		p.Hdr1_upd_usr_id.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.upd_usr_id_META);
		p.Hdr3Panel.add(p.Hdr1_upd_usr_nm);
		p.Hdr1_upd_usr_nm.setNextBeans(p.Hdr1_upd_func_id);
		p.Hdr1_upd_usr_nm.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.upd_usr_nm_META);
		p.Hdr3Panel.add(p.Hdr1_upd_func_id_Label);
		p.Hdr3Panel.add(p.Hdr1_upd_func_id);
		p.Hdr1_upd_func_id.setNextBeans(p.Hdr1_upd_func_nm);
		p.Hdr1_upd_func_id.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.upd_func_id_META);
		p.Hdr3Panel.add(p.Hdr1_upd_func_nm);
		p.Hdr1_upd_func_nm.setNextBeans(p.Hdr1_ins_ts);
		p.Hdr1_upd_func_nm.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.upd_func_nm_META);
		p.Hdr3Panel.add(p.Hdr1_ins_ts_Label);
		p.Hdr3Panel.add(p.Hdr1_ins_ts);
		p.Hdr1_ins_ts.setNextBeans(p.Hdr1_upd_ts);
		p.Hdr1_ins_ts.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.ins_ts_META);
		p.Hdr1_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr3Panel.add(p.Hdr1_upd_ts_Label);
		p.Hdr3Panel.add(p.Hdr1_upd_ts);
		p.Hdr1_upd_ts.setNextBeans(p.Hdr1_upd_srv_req_no);
		p.Hdr1_upd_ts.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.upd_ts_META);
		p.Hdr1_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr3Panel.add(p.Hdr1_upd_srv_req_no_Label);
		p.Hdr3Panel.add(p.Hdr1_upd_srv_req_no);
		p.Hdr1_upd_srv_req_no.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.upd_srv_req_no_META);
		p.Hdr1Panel.add(p.Hdr1_upri_dec_place);
		p.Hdr1_upri_dec_place.setNextBeans(p.Hdr1_rcv_upd_cntr);
		p.Hdr1_upri_dec_place.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.upri_dec_place_META);
		p.Hdr1Panel.add(p.Hdr1_rcv_upd_cntr);
		p.Hdr1_rcv_upd_cntr.setNextBeans(p.Hdr1_rcv_dat_typ);
		p.Hdr1_rcv_upd_cntr.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.rcv_upd_cntr_META);
		p.Hdr1Panel.add(p.Hdr1_rcv_dat_typ);
		p.Hdr1_rcv_dat_typ.setNextBeans(p.Hdr1_div_src_rcv_no);
		p.Hdr1_rcv_dat_typ.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.rcv_dat_typ_META);
		p.Hdr1Panel.add(p.Hdr1_div_src_rcv_no);
		p.Hdr1_div_src_rcv_no.setRow(p.getHdr1R(), mcframe.clientMSBG.MSBGP0160.Hdr1R.div_src_rcv_no_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel.setNextBeans(p.Hdr3Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr3(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [LDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLDtl(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.add(p.LDtlPanel);
		p.LDtlPanel.setNextBeans(p.RDtlPanel);
		p.LDtlPanel.setLayoutPosition("CBCLC+");
		// ブロックの項目の初期化
		p.LDtlPanel.add(p.RcvSchdPanel, null);
		p.LDtlPanel.setLastBeans(p.RcvSchdPanel);
		p.RcvSchdPanel.setNextBeans(p.Btn1Panel);
		p.LDtlPanel.add(p.Btn1Panel, null);
	}

	/**
	 * [RcvSchd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRcvSchd(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.RcvSchdPanel.setBorder(p.RcvSchdTitledBorder);
		p.RcvSchdPanel.add(p.RcvSchdScrollPane);
		p.RcvSchdPanel.setLastBeans(p.RcvSchdTable);
		p.RcvSchdScrollPane.setViewportView(p.RcvSchdTable);
		p.RcvSchdTable.setList(p.getRcvSchdL());
		p.RcvSchdTable.setStatusColumnVisible(false);
		p.RcvSchdPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn1(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.Btn1Panel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn1_select_all.setIcon("SELECT_ALL");
		p.Btn1_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Btn1Panel.add(p.Btn1_select_all);
		p.Btn1Panel.setLastBeans(p.Btn1_select_all);
		p.Btn1_select_all.setNextBeans(p.Btn1_deselect_all);
		p.Btn1_deselect_all.setIcon("DESELECT_ALL");
		p.Btn1_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Btn1Panel.add(p.Btn1_deselect_all);
		p.Btn1_deselect_all.setNextBeans(p.Btn1_reflection);
		p.Btn1_reflection.setFunctionKey(MCFunctionKey.F4);
		p.Btn1Panel.add(p.Btn1_reflection);
	}

	/**
	 * [RDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRDtl(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.add(p.RDtlPanel);
		p.RDtlPanel.setNextBeans(p.BtnPanel);
		p.RDtlPanel.setLayoutPosition("CBCRC+");
		// ブロックの項目の初期化
		p.RDtlPanel.add(p.RcvDivPanel, null);
		p.RDtlPanel.setLastBeans(p.RcvDivPanel);
		p.RcvDivPanel.setNextBeans(p.Btn2Panel);
		p.RDtlPanel.add(p.Btn2Panel, null);
	}

	/**
	 * [RcvDiv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRcvDiv(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.RcvDivPanel.setBorder(p.RcvDivTitledBorder);
		p.RcvDivPanel.add(p.RcvDivScrollPane);
		p.RcvDivPanel.setLastBeans(p.RcvDivTable);
		p.RcvDivScrollPane.setViewportView(p.RcvDivTable);
		p.RcvDivTable.setList(p.getRcvDivL());
		p.RcvDivPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn2(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.Btn2Panel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn2_radd.setIcon("INSERT_RECORD");
		p.Btn2_radd.setFunctionKey(MCFunctionKey.F5);
		p.Btn2Panel.add(p.Btn2_radd);
		p.Btn2Panel.setLastBeans(p.Btn2_radd);
		p.Btn2_radd.setNextBeans(p.Btn2_rdel);
		p.Btn2_rdel.setIcon("DELETE_RECORD");
		p.Btn2_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Btn2Panel.add(p.Btn2_rdel);
		p.Btn2_rdel.setNextBeans(p.Btn2_rcopy);
		p.Btn2_rcopy.setIcon("COPY_RECORD");
		p.Btn2_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Btn2Panel.add(p.Btn2_rcopy);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBGP_RcvDivReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBGP0070.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBGP0070);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBGP0070);
		p.Btn_open_MSBGP0070.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBGP_RcvDivReg p) {
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
		MSBGP_RcvDivReg_MC.mcInitScreenOpe((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.mcInitCnd((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.mcInitHdrTab((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.mcInitHdr1((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.mcInitHdr2((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.mcInitHdr3((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.mcInitLDtl((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.mcInitRcvSchd((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.mcInitBtn1((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.mcInitRDtl((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.mcInitRcvDiv((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.mcInitBtn2((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.mcInitBtn((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.mcInitEastBtn((MSBGP_RcvDivReg)this);

		// [SRCH]ステータスのモードの設定
		MSBGP_RcvDivReg_MC.statusInitSRCH_ScreenOpe((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitSRCH_Cnd((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitSRCH_HdrTab((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitSRCH_Hdr1((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitSRCH_Hdr2((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitSRCH_Hdr3((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitSRCH_LDtl((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitSRCH_RcvSchd((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitSRCH_Btn1((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitSRCH_RDtl((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitSRCH_RcvDiv((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitSRCH_Btn2((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitSRCH_Btn((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitSRCH_EastBtn((MSBGP_RcvDivReg)this);

		// [UPD]ステータスのモードの設定
		MSBGP_RcvDivReg_MC.statusInitUPD_ScreenOpe((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitUPD_Cnd((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitUPD_HdrTab((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitUPD_Hdr1((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitUPD_Hdr2((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitUPD_Hdr3((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitUPD_LDtl((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitUPD_RcvSchd((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitUPD_Btn1((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitUPD_RDtl((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitUPD_RcvDiv((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitUPD_Btn2((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitUPD_Btn((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitUPD_EastBtn((MSBGP_RcvDivReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBGP_RcvDivReg_MC.statusInitFIX__U_ScreenOpe((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitFIX__U_Cnd((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitFIX__U_HdrTab((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitFIX__U_Hdr1((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitFIX__U_Hdr2((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitFIX__U_Hdr3((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitFIX__U_LDtl((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitFIX__U_RcvSchd((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitFIX__U_Btn1((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitFIX__U_RDtl((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitFIX__U_RcvDiv((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitFIX__U_Btn2((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitFIX__U_Btn((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitFIX__U_EastBtn((MSBGP_RcvDivReg)this);

		// [REF]ステータスのモードの設定
		MSBGP_RcvDivReg_MC.statusInitREF_ScreenOpe((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitREF_Cnd((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitREF_HdrTab((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitREF_Hdr1((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitREF_Hdr2((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitREF_Hdr3((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitREF_LDtl((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitREF_RcvSchd((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitREF_Btn1((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitREF_RDtl((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitREF_RcvDiv((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitREF_Btn2((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitREF_Btn((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.statusInitREF_EastBtn((MSBGP_RcvDivReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBGP_RcvDivReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBGP_RcvDivReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_rcv_no.setListListener(p);
		p.Cnd_rcv_no.addAllListener(p);
		p.Cnd_rcv_schd_dt_fr.setListListener(p);
		p.Cnd_rcv_schd_dt_fr.addAllListener(p);
		p.Cnd_rcv_schd_dt_to.setListListener(p);
		p.Cnd_rcv_schd_dt_to.addAllListener(p);
		p.Cnd_inc_not_cl_flg.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBGP_RcvDivReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr1(MSBGP_RcvDivReg p) {
		p.Hdr1_rcv_no.setListListener(p);
		p.Hdr1_rcv_no.addAllListener(p);
		p.Hdr1_rcv_dt.setListListener(p);
		p.Hdr1_rcv_dt.addAllListener(p);
		p.Hdr1_div_flg.addAllListener(p);
		p.Hdr1_rcv_usr_cd.setListListener(p);
		p.Hdr1_rcv_usr_cd.addAllListener(p);
		p.Hdr1_rcv_usr_nm.setListListener(p);
		p.Hdr1_rcv_usr_nm.addAllListener(p);
		p.Hdr1_rcv_dpt_cd.setListListener(p);
		p.Hdr1_rcv_dpt_cd.addAllListener(p);
		p.Hdr1_rcv_dpt_nm.setListListener(p);
		p.Hdr1_rcv_dpt_nm.addAllListener(p);
		p.Hdr1_wg_cd.setListListener(p);
		p.Hdr1_wg_cd.addAllListener(p);
		p.Hdr1_wg_nm.setListListener(p);
		p.Hdr1_wg_nm.addAllListener(p);
		p.Hdr1_rcst_cd.setListListener(p);
		p.Hdr1_rcst_cd.addAllListener(p);
		p.Hdr1_rcst_nm.setListListener(p);
		p.Hdr1_rcst_nm.addAllListener(p);
		p.Hdr1_bcst_cd.setListListener(p);
		p.Hdr1_bcst_cd.addAllListener(p);
		p.Hdr1_bcst_nm.setListListener(p);
		p.Hdr1_bcst_nm.addAllListener(p);
		p.Hdr1_bill_dpt_cd.setListListener(p);
		p.Hdr1_bill_dpt_cd.addAllListener(p);
		p.Hdr1_bill_dpt_nm.setListListener(p);
		p.Hdr1_bill_dpt_nm.addAllListener(p);
		p.Hdr1_trd_cur_cd.setListListener(p);
		p.Hdr1_trd_cur_cd.addAllListener(p);
		p.Hdr1_trd_cur_nm.setListListener(p);
		p.Hdr1_trd_cur_nm.addAllListener(p);
		p.Hdr1_amt_dec_place.setListListener(p);
		p.Hdr1_amt_dec_place.addAllListener(p);
		p.Hdr1_xrate.setListListener(p);
		p.Hdr1_xrate.addAllListener(p);
		p.Hdr1_rcv_mtd_cd.setListListener(p);
		p.Hdr1_rcv_mtd_cd.addAllListener(p);
		p.Hdr1_rcv_mtd_nm.setListListener(p);
		p.Hdr1_rcv_mtd_nm.addAllListener(p);
		p.Hdr1_bank_ac_cd.setListListener(p);
		p.Hdr1_bank_ac_cd.addAllListener(p);
		p.Hdr1_bank_ac_nm.setListListener(p);
		p.Hdr1_bank_ac_nm.addAllListener(p);
		p.Hdr1_xfr_psn.setListListener(p);
		p.Hdr1_xfr_psn.addAllListener(p);
		p.Hdr1_rcv_rmrks.setListListener(p);
		p.Hdr1_rcv_rmrks.addAllListener(p);
		p.Hdr1_rcv_sub_char1.setListListener(p);
		p.Hdr1_rcv_sub_char1.addAllListener(p);
		p.Hdr1_rcv_sub_char2.setListListener(p);
		p.Hdr1_rcv_sub_char2.addAllListener(p);
		p.Hdr1_rcv_sub_char3.setListListener(p);
		p.Hdr1_rcv_sub_char3.addAllListener(p);
		p.Hdr1_rcv_auto_appl_tgt_flg.addAllListener(p);
		p.Hdr1_auto_appl_basis_dt.setListListener(p);
		p.Hdr1_auto_appl_basis_dt.addAllListener(p);
		p.Hdr1_auto_appl_sts_typ.setListListener(p);
		p.Hdr1_auto_appl_sts_typ.addAllListener(p);
		p.Hdr1_auto_appl_sts_typ_nm.setListListener(p);
		p.Hdr1_auto_appl_sts_typ_nm.addAllListener(p);
		p.Hdr1_note_no.setListListener(p);
		p.Hdr1_note_no.addAllListener(p);
		p.Hdr1_note_typ.setListListener(p);
		p.Hdr1_note_typ.addAllListener(p);
		p.Hdr1_note_typ_nm.setListListener(p);
		p.Hdr1_note_typ_nm.addAllListener(p);
		p.Hdr1_draw_dt.setListListener(p);
		p.Hdr1_draw_dt.addAllListener(p);
		p.Hdr1_due_dt.setListListener(p);
		p.Hdr1_due_dt.addAllListener(p);
		p.Hdr1_drawer_nm.setListListener(p);
		p.Hdr1_drawer_nm.addAllListener(p);
		p.Hdr1_endrsr.setListListener(p);
		p.Hdr1_endrsr.addAllListener(p);
		p.Hdr1_accptr.setListListener(p);
		p.Hdr1_accptr.addAllListener(p);
		p.Hdr1_draw_bank_cd.setListListener(p);
		p.Hdr1_draw_bank_cd.addAllListener(p);
		p.Hdr1_draw_bank_nm.setListListener(p);
		p.Hdr1_draw_bank_nm.addAllListener(p);
		p.Hdr1_draw_branch_cd.setListListener(p);
		p.Hdr1_draw_branch_cd.addAllListener(p);
		p.Hdr1_draw_branch_nm.setListListener(p);
		p.Hdr1_draw_branch_nm.addAllListener(p);
		p.Hdr1_note_rsn_cd.setListListener(p);
		p.Hdr1_note_rsn_cd.addAllListener(p);
		p.Hdr1_note_rsn_nm.setListListener(p);
		p.Hdr1_note_rsn_nm.addAllListener(p);
		p.Hdr1_note_sub_char1.setListListener(p);
		p.Hdr1_note_sub_char1.addAllListener(p);
		p.Hdr1_note_sub_char2.setListListener(p);
		p.Hdr1_note_sub_char2.addAllListener(p);
		p.Hdr1_note_sub_char3.setListListener(p);
		p.Hdr1_note_sub_char3.addAllListener(p);
		p.Hdr1_ins_usr_id.setListListener(p);
		p.Hdr1_ins_usr_id.addAllListener(p);
		p.Hdr1_ins_usr_nm.setListListener(p);
		p.Hdr1_ins_usr_nm.addAllListener(p);
		p.Hdr1_ins_func_id.setListListener(p);
		p.Hdr1_ins_func_id.addAllListener(p);
		p.Hdr1_ins_func_nm.setListListener(p);
		p.Hdr1_ins_func_nm.addAllListener(p);
		p.Hdr1_upd_usr_id.setListListener(p);
		p.Hdr1_upd_usr_id.addAllListener(p);
		p.Hdr1_upd_usr_nm.setListListener(p);
		p.Hdr1_upd_usr_nm.addAllListener(p);
		p.Hdr1_upd_func_id.setListListener(p);
		p.Hdr1_upd_func_id.addAllListener(p);
		p.Hdr1_upd_func_nm.setListListener(p);
		p.Hdr1_upd_func_nm.addAllListener(p);
		p.Hdr1_ins_ts.setListListener(p);
		p.Hdr1_ins_ts.addAllListener(p);
		p.Hdr1_upd_ts.setListListener(p);
		p.Hdr1_upd_ts.addAllListener(p);
		p.Hdr1_upd_srv_req_no.setListListener(p);
		p.Hdr1_upd_srv_req_no.addAllListener(p);
		p.Hdr1_upri_dec_place.setListListener(p);
		p.Hdr1_upri_dec_place.addAllListener(p);
		p.Hdr1_rcv_upd_cntr.setListListener(p);
		p.Hdr1_rcv_upd_cntr.addAllListener(p);
		p.Hdr1_rcv_dat_typ.setListListener(p);
		p.Hdr1_rcv_dat_typ.addAllListener(p);
		p.Hdr1_div_src_rcv_no.setListListener(p);
		p.Hdr1_div_src_rcv_no.addAllListener(p);
	}

	/**
	 *  [Hdr2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr2(MSBGP_RcvDivReg p) {
	}

	/**
	 *  [Hdr3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr3(MSBGP_RcvDivReg p) {
	}

	/**
	 *  [LDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLDtl(MSBGP_RcvDivReg p) {
	}

	/**
	 *  [RcvSchd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRcvSchd(MSBGP_RcvDivReg p) {
		p.RcvSchdTable.addAllListener(p);
		p.columnRcvSchd_check.addAllListener(p);
		p.columnRcvSchd_bcst_cd.addAllListener(p);
		p.columnRcvSchd_bcst_cd.setListListener(p);
		p.columnRcvSchd_bcst_nm.addAllListener(p);
		p.columnRcvSchd_bcst_nm.setListListener(p);
		p.columnRcvSchd_bill_dpt_cd.addAllListener(p);
		p.columnRcvSchd_bill_dpt_cd.setListListener(p);
		p.columnRcvSchd_bill_dpt_nm.addAllListener(p);
		p.columnRcvSchd_bill_dpt_nm.setListListener(p);
		p.columnRcvSchd_rcv_schd_dt.addAllListener(p);
		p.columnRcvSchd_rcv_schd_dt.setListListener(p);
		p.columnRcvSchd_trd_cur_cd.addAllListener(p);
		p.columnRcvSchd_trd_cur_cd.setListListener(p);
		p.columnRcvSchd_bill_no.addAllListener(p);
		p.columnRcvSchd_bill_no.setListListener(p);
	}

	/**
	 *  [Btn1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn1(MSBGP_RcvDivReg p) {
		p.Btn1_select_all.addAllListener(p);
		p.Btn1_select_all.setAPMethodName("doBtn1_select_all");
		p.Btn1_deselect_all.addAllListener(p);
		p.Btn1_deselect_all.setAPMethodName("doBtn1_deselect_all");
		p.Btn1_reflection.addAllListener(p);
		p.Btn1_reflection.setAPMethodName("doBtn1_reflection");
	}

	/**
	 *  [RDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRDtl(MSBGP_RcvDivReg p) {
	}

	/**
	 *  [RcvDiv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRcvDiv(MSBGP_RcvDivReg p) {
		p.RcvDivTable.addAllListener(p);
		p.columnRcvDiv_rcv_no.addAllListener(p);
		p.columnRcvDiv_rcv_no.setListListener(p);
		p.columnRcvDiv_bcst_cd.addAllListener(p);
		p.columnRcvDiv_bcst_cd.setListListener(p);
		p.columnRcvDiv_bcst_nm.addAllListener(p);
		p.columnRcvDiv_bcst_nm.setListListener(p);
		p.columnRcvDiv_bill_dpt_cd.addAllListener(p);
		p.columnRcvDiv_bill_dpt_cd.setListListener(p);
		p.columnRcvDiv_bill_dpt_nm.addAllListener(p);
		p.columnRcvDiv_bill_dpt_nm.setListListener(p);
		p.columnRcvDiv_rcv_rmrks.addAllListener(p);
		p.columnRcvDiv_rcv_rmrks.setListListener(p);
		p.columnRcvDiv_rcv_sub_char1.addAllListener(p);
		p.columnRcvDiv_rcv_sub_char1.setListListener(p);
		p.columnRcvDiv_rcv_sub_char2.addAllListener(p);
		p.columnRcvDiv_rcv_sub_char2.setListListener(p);
		p.columnRcvDiv_rcv_sub_char3.addAllListener(p);
		p.columnRcvDiv_rcv_sub_char3.setListListener(p);
		p.columnRcvDiv_div_src_rcv_upd_cntr.addAllListener(p);
		p.columnRcvDiv_div_src_rcv_upd_cntr.setListListener(p);
	}

	/**
	 *  [Btn2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn2(MSBGP_RcvDivReg p) {
		p.Btn2_radd.addAllListener(p);
		p.Btn2_radd.setAPMethodName("doBtn2_radd");
		p.Btn2_rdel.addAllListener(p);
		p.Btn2_rdel.setAPMethodName("doBtn2_rdel");
		p.Btn2_rcopy.addAllListener(p);
		p.Btn2_rcopy.setAPMethodName("doBtn2_rcopy");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBGP_RcvDivReg p) {
		p.Btn_open_MSBGP0070.addAllListener(p);
		p.Btn_open_MSBGP0070.setAPMethodName("doBtn_open_MSBGP0070");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBGP_RcvDivReg p) {
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBGP_RcvDivReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBGP_RcvDivReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rcv_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rcv_schd_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_schd_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_inc_not_cl_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBGP_RcvDivReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr1(MSBGP_RcvDivReg p){
		p.Hdr1_rcv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_div_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcv_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcv_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcv_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcv_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_bcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_bcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_bill_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_bill_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcv_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_rcv_proc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_not_proc_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_rcv_mtd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcv_mtd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_bank_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_bank_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_xfr_psn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcv_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcv_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcv_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcv_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcv_auto_appl_tgt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_auto_appl_basis_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_com_paid_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_auto_appl_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_auto_appl_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_note_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_note_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_note_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_draw_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_due_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_drawer_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_endrsr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_accptr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_draw_bank_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_draw_bank_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_draw_branch_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_draw_branch_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_note_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_note_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_note_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_note_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_note_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_rcv_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_rcv_dat_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_div_src_rcv_no.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr2(MSBGP_RcvDivReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr3(MSBGP_RcvDivReg p){

	}

	/**
	 * [SRCH]ステータスの[LDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LDtl(MSBGP_RcvDivReg p){

	}

	/**
	 * [SRCH]ステータスの[RcvSchd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RcvSchd(MSBGP_RcvDivReg p){
		p.columnRcvSchd_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRcvSchd_bcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRcvSchd_bcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRcvSchd_bill_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRcvSchd_bill_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRcvSchd_rcv_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRcvSchd_trd_cur_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.RcvSchd_rcv_schd_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRcvSchd_bill_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn1(MSBGP_RcvDivReg p){
		p.Btn1_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn1_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn1_reflection.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[RDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RDtl(MSBGP_RcvDivReg p){

	}

	/**
	 * [SRCH]ステータスの[RcvDiv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RcvDiv(MSBGP_RcvDivReg p){
		p.columnRcvDiv_rcv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRcvDiv_bcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRcvDiv_bcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRcvDiv_bill_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRcvDiv_bill_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvDiv_rcv_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.RcvDiv_rcv_proc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.RcvDiv_not_proc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.RcvDiv_com_paid_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRcvDiv_rcv_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRcvDiv_rcv_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRcvDiv_rcv_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRcvDiv_rcv_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRcvDiv_div_src_rcv_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn2(MSBGP_RcvDivReg p){
		p.Btn2_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn2_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn2_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBGP_RcvDivReg p){
		p.Btn_open_MSBGP0070.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBGP_RcvDivReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBGP_RcvDivReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBGP_RcvDivReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_rcv_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_rcv_schd_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rcv_schd_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_inc_not_cl_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBGP_RcvDivReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr1(MSBGP_RcvDivReg p){
		p.Hdr1_rcv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcv_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_div_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcv_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcv_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcv_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcv_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_bcst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_bcst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_bill_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_bill_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_xrate.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcv_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_rcv_proc_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_not_proc_bal_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_rcv_mtd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcv_mtd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_bank_ac_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_bank_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_xfr_psn.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcv_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcv_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcv_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcv_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcv_auto_appl_tgt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_auto_appl_basis_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_com_paid_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_auto_appl_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_auto_appl_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_note_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_note_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_note_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_draw_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_due_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_drawer_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_endrsr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_accptr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_draw_bank_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_draw_bank_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_draw_branch_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_draw_branch_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_note_rsn_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_note_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_note_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_note_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_note_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_rcv_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_rcv_dat_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_div_src_rcv_no.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr2(MSBGP_RcvDivReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr3(MSBGP_RcvDivReg p){

	}

	/**
	 * [UPD]ステータスの[LDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LDtl(MSBGP_RcvDivReg p){

	}

	/**
	 * [UPD]ステータスの[RcvSchd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RcvSchd(MSBGP_RcvDivReg p){
		p.columnRcvSchd_check.putMode(p, UPD, MCMode.ENABLE);
		p.columnRcvSchd_bcst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRcvSchd_bcst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRcvSchd_bill_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRcvSchd_bill_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRcvSchd_rcv_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRcvSchd_trd_cur_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.RcvSchd_rcv_schd_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRcvSchd_bill_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn1(MSBGP_RcvDivReg p){
		p.Btn1_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn1_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn1_reflection.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[RDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RDtl(MSBGP_RcvDivReg p){

	}

	/**
	 * [UPD]ステータスの[RcvDiv]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RcvDiv(MSBGP_RcvDivReg p){
		p.columnRcvDiv_rcv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRcvDiv_bcst_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRcvDiv_bcst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRcvDiv_bill_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRcvDiv_bill_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvDiv_rcv_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.RcvDiv_rcv_proc_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.RcvDiv_not_proc_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.RcvDiv_com_paid_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.ENABLE);
		p.columnRcvDiv_rcv_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRcvDiv_rcv_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRcvDiv_rcv_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRcvDiv_rcv_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnRcvDiv_div_src_rcv_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn2(MSBGP_RcvDivReg p){
		p.Btn2_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn2_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn2_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBGP_RcvDivReg p){
		p.Btn_open_MSBGP0070.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBGP_RcvDivReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBGP_RcvDivReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBGP_RcvDivReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_rcv_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_rcv_schd_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rcv_schd_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_inc_not_cl_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBGP_RcvDivReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr1(MSBGP_RcvDivReg p){
		p.Hdr1_rcv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_rcv_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_div_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_rcv_usr_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_rcv_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_rcv_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_rcv_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_rcst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_rcst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_bcst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_bcst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_bill_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_bill_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_xrate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_rcv_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_rcv_proc_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_not_proc_bal_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_rcv_mtd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_rcv_mtd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_bank_ac_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_bank_ac_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_xfr_psn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_rcv_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_rcv_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_rcv_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_rcv_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_rcv_auto_appl_tgt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_auto_appl_basis_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_com_paid_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_auto_appl_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_auto_appl_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_note_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_note_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_note_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_draw_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_due_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_drawer_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_endrsr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_accptr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_draw_bank_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_draw_bank_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_draw_branch_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_draw_branch_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_note_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_note_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_note_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_note_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_note_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_rcv_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_rcv_dat_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_div_src_rcv_no.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr2(MSBGP_RcvDivReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr3(MSBGP_RcvDivReg p){

	}

	/**
	 * [FIX_U]ステータスの[LDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_LDtl(MSBGP_RcvDivReg p){

	}

	/**
	 * [FIX_U]ステータスの[RcvSchd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RcvSchd(MSBGP_RcvDivReg p){
		p.columnRcvSchd_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRcvSchd_bcst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRcvSchd_bcst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRcvSchd_bill_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRcvSchd_bill_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRcvSchd_rcv_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRcvSchd_trd_cur_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.RcvSchd_rcv_schd_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRcvSchd_bill_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn1(MSBGP_RcvDivReg p){
		p.Btn1_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn1_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn1_reflection.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[RDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RDtl(MSBGP_RcvDivReg p){

	}

	/**
	 * [FIX_U]ステータスの[RcvDiv]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RcvDiv(MSBGP_RcvDivReg p){
		p.columnRcvDiv_rcv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRcvDiv_bcst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRcvDiv_bcst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRcvDiv_bill_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRcvDiv_bill_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvDiv_rcv_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.RcvDiv_rcv_proc_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.RcvDiv_not_proc_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.RcvDiv_com_paid_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRcvDiv_rcv_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRcvDiv_rcv_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRcvDiv_rcv_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRcvDiv_rcv_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRcvDiv_div_src_rcv_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn2(MSBGP_RcvDivReg p){
		p.Btn2_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn2_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn2_rcopy.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBGP_RcvDivReg p){
		p.Btn_open_MSBGP0070.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBGP_RcvDivReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBGP_RcvDivReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBGP_RcvDivReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rcv_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rcv_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_inc_not_cl_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBGP_RcvDivReg p){

	}

	/**
	 * [REF]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr1(MSBGP_RcvDivReg p){
		p.Hdr1_rcv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_rcv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_div_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_rcv_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_rcv_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_rcv_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_rcv_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_rcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_rcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_bcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_bcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_bill_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_bill_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_rcv_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_rcv_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_not_proc_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_rcv_mtd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_rcv_mtd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_xfr_psn.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_rcv_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_rcv_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_rcv_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_rcv_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_rcv_auto_appl_tgt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_auto_appl_basis_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_com_paid_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_auto_appl_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_auto_appl_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_note_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_note_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_note_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_draw_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_due_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_drawer_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_endrsr.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_accptr.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_draw_bank_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_draw_bank_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_draw_branch_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_draw_branch_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_note_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_note_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_note_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_note_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_note_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_rcv_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_rcv_dat_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_div_src_rcv_no.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr2(MSBGP_RcvDivReg p){

	}

	/**
	 * [REF]ステータスの[Hdr3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr3(MSBGP_RcvDivReg p){

	}

	/**
	 * [REF]ステータスの[LDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_LDtl(MSBGP_RcvDivReg p){

	}

	/**
	 * [REF]ステータスの[RcvSchd]ブロックのモードの設定
	 */
	protected static void statusInitREF_RcvSchd(MSBGP_RcvDivReg p){
		p.columnRcvSchd_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRcvSchd_bcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRcvSchd_bcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRcvSchd_bill_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRcvSchd_bill_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRcvSchd_rcv_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRcvSchd_trd_cur_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.RcvSchd_rcv_schd_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRcvSchd_bill_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn1(MSBGP_RcvDivReg p){
		p.Btn1_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn1_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn1_reflection.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[RDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RDtl(MSBGP_RcvDivReg p){

	}

	/**
	 * [REF]ステータスの[RcvDiv]ブロックのモードの設定
	 */
	protected static void statusInitREF_RcvDiv(MSBGP_RcvDivReg p){
		p.columnRcvDiv_rcv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRcvDiv_bcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRcvDiv_bcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRcvDiv_bill_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRcvDiv_bill_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvDiv_rcv_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.RcvDiv_rcv_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.RcvDiv_not_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.RcvDiv_com_paid_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRcvDiv_rcv_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRcvDiv_rcv_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRcvDiv_rcv_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRcvDiv_rcv_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRcvDiv_div_src_rcv_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn2(MSBGP_RcvDivReg p){
		p.Btn2_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn2_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn2_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBGP_RcvDivReg p){
		p.Btn_open_MSBGP0070.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBGP_RcvDivReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBGP_RcvDivReg_MC.setTableConfigRcvSchd((MSBGP_RcvDivReg)this);
		MSBGP_RcvDivReg_MC.setTableConfigRcvDiv((MSBGP_RcvDivReg)this);
	}

	/**
	 * [RcvSchd]ブロックのTableの設定
	 */
	protected static void setTableConfigRcvSchd(MSBGP_RcvDivReg p) {
		p.columnRcvSchd_check.setMeta(mcframe.clientMSBG.MSBGP0160.RcvSchdR.check_META);
		p.RcvSchdTable.addColumnConfig(p.columnRcvSchd_check);
		p.columnRcvSchd_bcst_cd.setMeta(mcframe.clientMSBG.MSBGP0160.RcvSchdR.bcst_cd_META);
		p.RcvSchdTable.addColumnConfig(p.columnRcvSchd_bcst_cd);
		p.columnRcvSchd_bcst_nm.setMeta(mcframe.clientMSBG.MSBGP0160.RcvSchdR.bcst_nm_META);
		p.RcvSchdTable.addColumnConfig(p.columnRcvSchd_bcst_nm);
		p.columnRcvSchd_bill_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0160.RcvSchdR.bill_dpt_cd_META);
		p.RcvSchdTable.addColumnConfig(p.columnRcvSchd_bill_dpt_cd);
		p.columnRcvSchd_bill_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0160.RcvSchdR.bill_dpt_nm_META);
		p.RcvSchdTable.addColumnConfig(p.columnRcvSchd_bill_dpt_nm);
		p.columnRcvSchd_rcv_schd_dt.setMeta(mcframe.clientMSBG.MSBGP0160.RcvSchdR.rcv_schd_dt_META);
		p.columnRcvSchd_rcv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RcvSchdTable.addColumnConfig(p.columnRcvSchd_rcv_schd_dt);
		p.columnRcvSchd_trd_cur_cd.setMeta(mcframe.clientMSBG.MSBGP0160.RcvSchdR.trd_cur_cd_META);
		p.RcvSchdTable.addColumnConfig(p.columnRcvSchd_trd_cur_cd);
		p.RcvSchdTable.addTable(p.RcvSchd_rcv_schd_amt_p_PPanel.AmtTable);
		p.columnRcvSchd_bill_no.setMeta(mcframe.clientMSBG.MSBGP0160.RcvSchdR.bill_no_META);
		p.RcvSchdTable.addColumnConfig(p.columnRcvSchd_bill_no);
	}

	/**
	 * [RcvDiv]ブロックのTableの設定
	 */
	protected static void setTableConfigRcvDiv(MSBGP_RcvDivReg p) {
		p.columnRcvDiv_rcv_no.setMeta(mcframe.clientMSBG.MSBGP0160.RcvDivR.rcv_no_META);
		p.RcvDivTable.addColumnConfig(p.columnRcvDiv_rcv_no);
		p.columnRcvDiv_bcst_cd.setMeta(mcframe.clientMSBG.MSBGP0160.RcvDivR.bcst_cd_META);
		p.columnRcvDiv_bcst_cd.addLinkBeans(p.columnRcvDiv_bcst_nm);
		p.RcvDivTable.addColumnConfig(p.columnRcvDiv_bcst_cd);
		p.columnRcvDiv_bcst_nm.setMeta(mcframe.clientMSBG.MSBGP0160.RcvDivR.bcst_nm_META);
		p.RcvDivTable.addColumnConfig(p.columnRcvDiv_bcst_nm);
		p.columnRcvDiv_bill_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0160.RcvDivR.bill_dpt_cd_META);
		p.columnRcvDiv_bill_dpt_cd.addLinkBeans(p.columnRcvDiv_bill_dpt_nm);
		p.RcvDivTable.addColumnConfig(p.columnRcvDiv_bill_dpt_cd);
		p.columnRcvDiv_bill_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0160.RcvDivR.bill_dpt_nm_META);
		p.RcvDivTable.addColumnConfig(p.columnRcvDiv_bill_dpt_nm);
		p.RcvDivTable.addTable(p.RcvDiv_rcv_amt_p_PPanel.AmtTable);
		p.RcvDivTable.addTable(p.RcvDiv_rcv_proc_amt_p_PPanel.AmtTable);
		p.RcvDivTable.addTable(p.RcvDiv_not_proc_amt_p_PPanel.AmtTable);
		p.RcvDivTable.addTable(p.RcvDiv_com_paid_p_PPanel.AmtTable);
		p.columnRcvDiv_rcv_rmrks.setMeta(mcframe.clientMSBG.MSBGP0160.RcvDivR.rcv_rmrks_META);
		p.RcvDivTable.addColumnConfig(p.columnRcvDiv_rcv_rmrks);
		p.columnRcvDiv_rcv_sub_char1.setMeta(mcframe.clientMSBG.MSBGP0160.RcvDivR.rcv_sub_char1_META);
		p.RcvDivTable.addColumnConfig(p.columnRcvDiv_rcv_sub_char1);
		p.columnRcvDiv_rcv_sub_char2.setMeta(mcframe.clientMSBG.MSBGP0160.RcvDivR.rcv_sub_char2_META);
		p.RcvDivTable.addColumnConfig(p.columnRcvDiv_rcv_sub_char2);
		p.columnRcvDiv_rcv_sub_char3.setMeta(mcframe.clientMSBG.MSBGP0160.RcvDivR.rcv_sub_char3_META);
		p.RcvDivTable.addColumnConfig(p.columnRcvDiv_rcv_sub_char3);
		p.columnRcvDiv_div_src_rcv_upd_cntr.setMeta(mcframe.clientMSBG.MSBGP0160.RcvDivR.div_src_rcv_upd_cntr_META);
		p.RcvDivTable.addColumnConfig(p.columnRcvDiv_div_src_rcv_upd_cntr);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnRcvDiv_bcst_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRcvDiv_bcst_cd.getListConfig().setPutter(getRcvDiv_bcst_cd_ListPutter());
		columnRcvDiv_bill_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRcvDiv_bill_dpt_cd.getListConfig().setPutter(getRcvDiv_bill_dpt_cd_ListPutter());
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
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [RcvDiv_bcst_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcvDiv_bcst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [RcvDiv_bill_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRcvDiv_bill_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == columnRcvDiv_bcst_cd) return getRcvDiv_bcst_cd(row, info);
		if(combo == columnRcvDiv_bill_dpt_cd) return getRcvDiv_bill_dpt_cd(row, info);
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
		else if (ap == Btn1_select_all) doBtn1_select_all(info);
		else if (ap == Btn1_deselect_all) doBtn1_deselect_all(info);
		else if (ap == Btn1_reflection) doBtn1_reflection(info);
		else if (ap == Btn2_radd) doBtn2_radd(info);
		else if (ap == Btn2_rdel) doBtn2_rdel(info);
		else if (ap == Btn2_rcopy) doBtn2_rcopy(info);
		else if (ap == Btn_open_MSBGP0070) doBtn_open_MSBGP0070(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Btn1]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn1_select_all(MCEventInfo info);

	/**
	 * [Btn1]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn1_deselect_all(MCEventInfo info);

	/**
	 * [Btn1]パネルの[reflection]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn1_reflection(MCEventInfo info);

	/**
	 * [Btn2]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn2_radd(MCEventInfo info);

	/**
	 * [Btn2]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn2_rdel(MCEventInfo info);

	/**
	 * [Btn2]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn2_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBGP0070]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0070(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

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
		if (vc == RcvSchdTable) return doRcvSchd_VC(info);
		if (vc == RcvDivTable) return doRcvDiv_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_rcv_no) return doCnd_rcv_no_VC(info);
		if (vc == Cnd_rcv_schd_dt_fr) return doCnd_rcv_schd_dt_fr_VC(info);
		if (vc == Cnd_rcv_schd_dt_to) return doCnd_rcv_schd_dt_to_VC(info);
		if (vc == Cnd_inc_not_cl_flg) return doCnd_inc_not_cl_flg_VC(info);
		if (vc == Hdr1_rcv_no) return doHdr1_rcv_no_VC(info);
		if (vc == Hdr1_rcv_dt) return doHdr1_rcv_dt_VC(info);
		if (vc == Hdr1_div_flg) return doHdr1_div_flg_VC(info);
		if (vc == Hdr1_rcv_usr_cd) return doHdr1_rcv_usr_cd_VC(info);
		if (vc == Hdr1_rcv_usr_nm) return doHdr1_rcv_usr_nm_VC(info);
		if (vc == Hdr1_rcv_dpt_cd) return doHdr1_rcv_dpt_cd_VC(info);
		if (vc == Hdr1_rcv_dpt_nm) return doHdr1_rcv_dpt_nm_VC(info);
		if (vc == Hdr1_wg_cd) return doHdr1_wg_cd_VC(info);
		if (vc == Hdr1_wg_nm) return doHdr1_wg_nm_VC(info);
		if (vc == Hdr1_rcst_cd) return doHdr1_rcst_cd_VC(info);
		if (vc == Hdr1_rcst_nm) return doHdr1_rcst_nm_VC(info);
		if (vc == Hdr1_bcst_cd) return doHdr1_bcst_cd_VC(info);
		if (vc == Hdr1_bcst_nm) return doHdr1_bcst_nm_VC(info);
		if (vc == Hdr1_bill_dpt_cd) return doHdr1_bill_dpt_cd_VC(info);
		if (vc == Hdr1_bill_dpt_nm) return doHdr1_bill_dpt_nm_VC(info);
		if (vc == Hdr1_trd_cur_cd) return doHdr1_trd_cur_cd_VC(info);
		if (vc == Hdr1_trd_cur_nm) return doHdr1_trd_cur_nm_VC(info);
		if (vc == Hdr1_amt_dec_place) return doHdr1_amt_dec_place_VC(info);
		if (vc == Hdr1_xrate) return doHdr1_xrate_VC(info);
		if (vc == Hdr1_rcv_mtd_cd) return doHdr1_rcv_mtd_cd_VC(info);
		if (vc == Hdr1_rcv_mtd_nm) return doHdr1_rcv_mtd_nm_VC(info);
		if (vc == Hdr1_bank_ac_cd) return doHdr1_bank_ac_cd_VC(info);
		if (vc == Hdr1_bank_ac_nm) return doHdr1_bank_ac_nm_VC(info);
		if (vc == Hdr1_xfr_psn) return doHdr1_xfr_psn_VC(info);
		if (vc == Hdr1_rcv_rmrks) return doHdr1_rcv_rmrks_VC(info);
		if (vc == Hdr1_rcv_sub_char1) return doHdr1_rcv_sub_char1_VC(info);
		if (vc == Hdr1_rcv_sub_char2) return doHdr1_rcv_sub_char2_VC(info);
		if (vc == Hdr1_rcv_sub_char3) return doHdr1_rcv_sub_char3_VC(info);
		if (vc == Hdr1_rcv_auto_appl_tgt_flg) return doHdr1_rcv_auto_appl_tgt_flg_VC(info);
		if (vc == Hdr1_auto_appl_basis_dt) return doHdr1_auto_appl_basis_dt_VC(info);
		if (vc == Hdr1_auto_appl_sts_typ) return doHdr1_auto_appl_sts_typ_VC(info);
		if (vc == Hdr1_auto_appl_sts_typ_nm) return doHdr1_auto_appl_sts_typ_nm_VC(info);
		if (vc == Hdr1_note_no) return doHdr1_note_no_VC(info);
		if (vc == Hdr1_note_typ) return doHdr1_note_typ_VC(info);
		if (vc == Hdr1_note_typ_nm) return doHdr1_note_typ_nm_VC(info);
		if (vc == Hdr1_draw_dt) return doHdr1_draw_dt_VC(info);
		if (vc == Hdr1_due_dt) return doHdr1_due_dt_VC(info);
		if (vc == Hdr1_drawer_nm) return doHdr1_drawer_nm_VC(info);
		if (vc == Hdr1_endrsr) return doHdr1_endrsr_VC(info);
		if (vc == Hdr1_accptr) return doHdr1_accptr_VC(info);
		if (vc == Hdr1_draw_bank_cd) return doHdr1_draw_bank_cd_VC(info);
		if (vc == Hdr1_draw_bank_nm) return doHdr1_draw_bank_nm_VC(info);
		if (vc == Hdr1_draw_branch_cd) return doHdr1_draw_branch_cd_VC(info);
		if (vc == Hdr1_draw_branch_nm) return doHdr1_draw_branch_nm_VC(info);
		if (vc == Hdr1_note_rsn_cd) return doHdr1_note_rsn_cd_VC(info);
		if (vc == Hdr1_note_rsn_nm) return doHdr1_note_rsn_nm_VC(info);
		if (vc == Hdr1_note_sub_char1) return doHdr1_note_sub_char1_VC(info);
		if (vc == Hdr1_note_sub_char2) return doHdr1_note_sub_char2_VC(info);
		if (vc == Hdr1_note_sub_char3) return doHdr1_note_sub_char3_VC(info);
		if (vc == Hdr1_ins_usr_id) return doHdr1_ins_usr_id_VC(info);
		if (vc == Hdr1_ins_usr_nm) return doHdr1_ins_usr_nm_VC(info);
		if (vc == Hdr1_ins_func_id) return doHdr1_ins_func_id_VC(info);
		if (vc == Hdr1_ins_func_nm) return doHdr1_ins_func_nm_VC(info);
		if (vc == Hdr1_upd_usr_id) return doHdr1_upd_usr_id_VC(info);
		if (vc == Hdr1_upd_usr_nm) return doHdr1_upd_usr_nm_VC(info);
		if (vc == Hdr1_upd_func_id) return doHdr1_upd_func_id_VC(info);
		if (vc == Hdr1_upd_func_nm) return doHdr1_upd_func_nm_VC(info);
		if (vc == Hdr1_ins_ts) return doHdr1_ins_ts_VC(info);
		if (vc == Hdr1_upd_ts) return doHdr1_upd_ts_VC(info);
		if (vc == Hdr1_upd_srv_req_no) return doHdr1_upd_srv_req_no_VC(info);
		if (vc == Hdr1_upri_dec_place) return doHdr1_upri_dec_place_VC(info);
		if (vc == Hdr1_rcv_upd_cntr) return doHdr1_rcv_upd_cntr_VC(info);
		if (vc == Hdr1_rcv_dat_typ) return doHdr1_rcv_dat_typ_VC(info);
		if (vc == Hdr1_div_src_rcv_no) return doHdr1_div_src_rcv_no_VC(info);
		if (vc == columnRcvSchd_check) return doRcvSchd_check_VC(info);
		if (vc == columnRcvSchd_bcst_cd) return doRcvSchd_bcst_cd_VC(info);
		if (vc == columnRcvSchd_bcst_nm) return doRcvSchd_bcst_nm_VC(info);
		if (vc == columnRcvSchd_bill_dpt_cd) return doRcvSchd_bill_dpt_cd_VC(info);
		if (vc == columnRcvSchd_bill_dpt_nm) return doRcvSchd_bill_dpt_nm_VC(info);
		if (vc == columnRcvSchd_rcv_schd_dt) return doRcvSchd_rcv_schd_dt_VC(info);
		if (vc == columnRcvSchd_trd_cur_cd) return doRcvSchd_trd_cur_cd_VC(info);
		if (vc == columnRcvSchd_bill_no) return doRcvSchd_bill_no_VC(info);
		if (vc == columnRcvDiv_rcv_no) return doRcvDiv_rcv_no_VC(info);
		if (vc == columnRcvDiv_bcst_cd) return doRcvDiv_bcst_cd_VC(info);
		if (vc == columnRcvDiv_bcst_nm) return doRcvDiv_bcst_nm_VC(info);
		if (vc == columnRcvDiv_bill_dpt_cd) return doRcvDiv_bill_dpt_cd_VC(info);
		if (vc == columnRcvDiv_bill_dpt_nm) return doRcvDiv_bill_dpt_nm_VC(info);
		if (vc == columnRcvDiv_rcv_rmrks) return doRcvDiv_rcv_rmrks_VC(info);
		if (vc == columnRcvDiv_rcv_sub_char1) return doRcvDiv_rcv_sub_char1_VC(info);
		if (vc == columnRcvDiv_rcv_sub_char2) return doRcvDiv_rcv_sub_char2_VC(info);
		if (vc == columnRcvDiv_rcv_sub_char3) return doRcvDiv_rcv_sub_char3_VC(info);
		if (vc == columnRcvDiv_div_src_rcv_upd_cntr) return doRcvDiv_div_src_rcv_upd_cntr_VC(info);
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
	 * [RcvSchd]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvSchd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvDiv]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvDiv_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcv_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcv_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inc_not_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_not_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[div_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_div_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[bill_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_bill_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[bill_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_bill_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_mtd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_mtd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_mtd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_mtd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[xfr_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_xfr_psn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_auto_appl_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_auto_appl_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[auto_appl_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_auto_appl_basis_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[auto_appl_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_auto_appl_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[auto_appl_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_auto_appl_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[note_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_note_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[note_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_note_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[note_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_note_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[draw_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_draw_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[due_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_due_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[drawer_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_drawer_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[endrsr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_endrsr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[accptr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_accptr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[draw_bank_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_draw_bank_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[draw_bank_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_draw_bank_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[draw_branch_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_draw_branch_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[draw_branch_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_draw_branch_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[note_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_note_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[note_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_note_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[note_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_note_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[note_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_note_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[note_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_note_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_dat_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_dat_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[div_src_rcv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_div_src_rcv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvSchd]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvSchd_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvSchd]パネルの[bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvSchd_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvSchd]パネルの[bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvSchd_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvSchd]パネルの[bill_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvSchd_bill_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvSchd]パネルの[bill_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvSchd_bill_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvSchd]パネルの[rcv_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvSchd_rcv_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvSchd]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvSchd_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvSchd]パネルの[bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvSchd_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvDiv]パネルの[rcv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvDiv_rcv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvDiv]パネルの[bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvDiv_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvDiv]パネルの[bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvDiv_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvDiv]パネルの[bill_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvDiv_bill_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvDiv]パネルの[bill_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvDiv_bill_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvDiv]パネルの[rcv_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvDiv_rcv_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvDiv]パネルの[rcv_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvDiv_rcv_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvDiv]パネルの[rcv_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvDiv_rcv_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvDiv]パネルの[rcv_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvDiv_rcv_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvDiv]パネルの[div_src_rcv_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvDiv_div_src_rcv_upd_cntr_VC(MCEventInfo info){
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
		else if (nc == RcvSchdTable) doRcvSchd_NC(info);
		else if (nc == RcvDivTable) doRcvDiv_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_rcv_no) doCnd_rcv_no_NC(info);
		else if (nc == Cnd_rcv_schd_dt_fr) doCnd_rcv_schd_dt_fr_NC(info);
		else if (nc == Cnd_rcv_schd_dt_to) doCnd_rcv_schd_dt_to_NC(info);
		else if (nc == Cnd_inc_not_cl_flg) doCnd_inc_not_cl_flg_NC(info);
		else if (nc == Hdr1_rcv_no) doHdr1_rcv_no_NC(info);
		else if (nc == Hdr1_rcv_dt) doHdr1_rcv_dt_NC(info);
		else if (nc == Hdr1_div_flg) doHdr1_div_flg_NC(info);
		else if (nc == Hdr1_rcv_usr_cd) doHdr1_rcv_usr_cd_NC(info);
		else if (nc == Hdr1_rcv_usr_nm) doHdr1_rcv_usr_nm_NC(info);
		else if (nc == Hdr1_rcv_dpt_cd) doHdr1_rcv_dpt_cd_NC(info);
		else if (nc == Hdr1_rcv_dpt_nm) doHdr1_rcv_dpt_nm_NC(info);
		else if (nc == Hdr1_wg_cd) doHdr1_wg_cd_NC(info);
		else if (nc == Hdr1_wg_nm) doHdr1_wg_nm_NC(info);
		else if (nc == Hdr1_rcst_cd) doHdr1_rcst_cd_NC(info);
		else if (nc == Hdr1_rcst_nm) doHdr1_rcst_nm_NC(info);
		else if (nc == Hdr1_bcst_cd) doHdr1_bcst_cd_NC(info);
		else if (nc == Hdr1_bcst_nm) doHdr1_bcst_nm_NC(info);
		else if (nc == Hdr1_bill_dpt_cd) doHdr1_bill_dpt_cd_NC(info);
		else if (nc == Hdr1_bill_dpt_nm) doHdr1_bill_dpt_nm_NC(info);
		else if (nc == Hdr1_trd_cur_cd) doHdr1_trd_cur_cd_NC(info);
		else if (nc == Hdr1_trd_cur_nm) doHdr1_trd_cur_nm_NC(info);
		else if (nc == Hdr1_amt_dec_place) doHdr1_amt_dec_place_NC(info);
		else if (nc == Hdr1_xrate) doHdr1_xrate_NC(info);
		else if (nc == Hdr1_rcv_mtd_cd) doHdr1_rcv_mtd_cd_NC(info);
		else if (nc == Hdr1_rcv_mtd_nm) doHdr1_rcv_mtd_nm_NC(info);
		else if (nc == Hdr1_bank_ac_cd) doHdr1_bank_ac_cd_NC(info);
		else if (nc == Hdr1_bank_ac_nm) doHdr1_bank_ac_nm_NC(info);
		else if (nc == Hdr1_xfr_psn) doHdr1_xfr_psn_NC(info);
		else if (nc == Hdr1_rcv_rmrks) doHdr1_rcv_rmrks_NC(info);
		else if (nc == Hdr1_rcv_sub_char1) doHdr1_rcv_sub_char1_NC(info);
		else if (nc == Hdr1_rcv_sub_char2) doHdr1_rcv_sub_char2_NC(info);
		else if (nc == Hdr1_rcv_sub_char3) doHdr1_rcv_sub_char3_NC(info);
		else if (nc == Hdr1_rcv_auto_appl_tgt_flg) doHdr1_rcv_auto_appl_tgt_flg_NC(info);
		else if (nc == Hdr1_auto_appl_basis_dt) doHdr1_auto_appl_basis_dt_NC(info);
		else if (nc == Hdr1_auto_appl_sts_typ) doHdr1_auto_appl_sts_typ_NC(info);
		else if (nc == Hdr1_auto_appl_sts_typ_nm) doHdr1_auto_appl_sts_typ_nm_NC(info);
		else if (nc == Hdr1_note_no) doHdr1_note_no_NC(info);
		else if (nc == Hdr1_note_typ) doHdr1_note_typ_NC(info);
		else if (nc == Hdr1_note_typ_nm) doHdr1_note_typ_nm_NC(info);
		else if (nc == Hdr1_draw_dt) doHdr1_draw_dt_NC(info);
		else if (nc == Hdr1_due_dt) doHdr1_due_dt_NC(info);
		else if (nc == Hdr1_drawer_nm) doHdr1_drawer_nm_NC(info);
		else if (nc == Hdr1_endrsr) doHdr1_endrsr_NC(info);
		else if (nc == Hdr1_accptr) doHdr1_accptr_NC(info);
		else if (nc == Hdr1_draw_bank_cd) doHdr1_draw_bank_cd_NC(info);
		else if (nc == Hdr1_draw_bank_nm) doHdr1_draw_bank_nm_NC(info);
		else if (nc == Hdr1_draw_branch_cd) doHdr1_draw_branch_cd_NC(info);
		else if (nc == Hdr1_draw_branch_nm) doHdr1_draw_branch_nm_NC(info);
		else if (nc == Hdr1_note_rsn_cd) doHdr1_note_rsn_cd_NC(info);
		else if (nc == Hdr1_note_rsn_nm) doHdr1_note_rsn_nm_NC(info);
		else if (nc == Hdr1_note_sub_char1) doHdr1_note_sub_char1_NC(info);
		else if (nc == Hdr1_note_sub_char2) doHdr1_note_sub_char2_NC(info);
		else if (nc == Hdr1_note_sub_char3) doHdr1_note_sub_char3_NC(info);
		else if (nc == Hdr1_ins_usr_id) doHdr1_ins_usr_id_NC(info);
		else if (nc == Hdr1_ins_usr_nm) doHdr1_ins_usr_nm_NC(info);
		else if (nc == Hdr1_ins_func_id) doHdr1_ins_func_id_NC(info);
		else if (nc == Hdr1_ins_func_nm) doHdr1_ins_func_nm_NC(info);
		else if (nc == Hdr1_upd_usr_id) doHdr1_upd_usr_id_NC(info);
		else if (nc == Hdr1_upd_usr_nm) doHdr1_upd_usr_nm_NC(info);
		else if (nc == Hdr1_upd_func_id) doHdr1_upd_func_id_NC(info);
		else if (nc == Hdr1_upd_func_nm) doHdr1_upd_func_nm_NC(info);
		else if (nc == Hdr1_ins_ts) doHdr1_ins_ts_NC(info);
		else if (nc == Hdr1_upd_ts) doHdr1_upd_ts_NC(info);
		else if (nc == Hdr1_upd_srv_req_no) doHdr1_upd_srv_req_no_NC(info);
		else if (nc == Hdr1_upri_dec_place) doHdr1_upri_dec_place_NC(info);
		else if (nc == Hdr1_rcv_upd_cntr) doHdr1_rcv_upd_cntr_NC(info);
		else if (nc == Hdr1_rcv_dat_typ) doHdr1_rcv_dat_typ_NC(info);
		else if (nc == Hdr1_div_src_rcv_no) doHdr1_div_src_rcv_no_NC(info);
		else if (nc == columnRcvSchd_check) doRcvSchd_check_NC(info);
		else if (nc == columnRcvSchd_bcst_cd) doRcvSchd_bcst_cd_NC(info);
		else if (nc == columnRcvSchd_bcst_nm) doRcvSchd_bcst_nm_NC(info);
		else if (nc == columnRcvSchd_bill_dpt_cd) doRcvSchd_bill_dpt_cd_NC(info);
		else if (nc == columnRcvSchd_bill_dpt_nm) doRcvSchd_bill_dpt_nm_NC(info);
		else if (nc == columnRcvSchd_rcv_schd_dt) doRcvSchd_rcv_schd_dt_NC(info);
		else if (nc == columnRcvSchd_trd_cur_cd) doRcvSchd_trd_cur_cd_NC(info);
		else if (nc == columnRcvSchd_bill_no) doRcvSchd_bill_no_NC(info);
		else if (nc == columnRcvDiv_rcv_no) doRcvDiv_rcv_no_NC(info);
		else if (nc == columnRcvDiv_bcst_cd) doRcvDiv_bcst_cd_NC(info);
		else if (nc == columnRcvDiv_bcst_nm) doRcvDiv_bcst_nm_NC(info);
		else if (nc == columnRcvDiv_bill_dpt_cd) doRcvDiv_bill_dpt_cd_NC(info);
		else if (nc == columnRcvDiv_bill_dpt_nm) doRcvDiv_bill_dpt_nm_NC(info);
		else if (nc == columnRcvDiv_rcv_rmrks) doRcvDiv_rcv_rmrks_NC(info);
		else if (nc == columnRcvDiv_rcv_sub_char1) doRcvDiv_rcv_sub_char1_NC(info);
		else if (nc == columnRcvDiv_rcv_sub_char2) doRcvDiv_rcv_sub_char2_NC(info);
		else if (nc == columnRcvDiv_rcv_sub_char3) doRcvDiv_rcv_sub_char3_NC(info);
		else if (nc == columnRcvDiv_div_src_rcv_upd_cntr) doRcvDiv_div_src_rcv_upd_cntr_NC(info);
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NC(MCEventInfo info){
	}

	/**
	 * [RcvSchd]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_NC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcv_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_not_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_not_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[div_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_div_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_mtd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_mtd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_mtd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_mtd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[xfr_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_xfr_psn_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_auto_appl_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_auto_appl_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[auto_appl_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_auto_appl_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[auto_appl_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_auto_appl_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[auto_appl_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_auto_appl_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[draw_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_draw_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[due_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_due_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[drawer_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_drawer_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[endrsr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_endrsr_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[accptr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_accptr_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[draw_bank_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_draw_bank_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[draw_bank_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_draw_bank_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[draw_branch_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_draw_branch_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[draw_branch_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_draw_branch_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_dat_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_dat_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[div_src_rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_div_src_rcv_no_NC(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_check_NC(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[bill_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_bill_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[bill_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_bill_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[rcv_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_rcv_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_rcv_no_NC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[bill_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_bill_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[bill_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_bill_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[rcv_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_rcv_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[rcv_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_rcv_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[rcv_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_rcv_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[rcv_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_rcv_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[div_src_rcv_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_div_src_rcv_upd_cntr_NC(MCEventInfo info){
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
		else if (ne == RcvSchdTable) doRcvSchd_NE(info);
		else if (ne == RcvDivTable) doRcvDiv_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_rcv_no) doCnd_rcv_no_NE(info);
		else if (ne == Cnd_rcv_schd_dt_fr) doCnd_rcv_schd_dt_fr_NE(info);
		else if (ne == Cnd_rcv_schd_dt_to) doCnd_rcv_schd_dt_to_NE(info);
		else if (ne == Cnd_inc_not_cl_flg) doCnd_inc_not_cl_flg_NE(info);
		else if (ne == Hdr1_rcv_no) doHdr1_rcv_no_NE(info);
		else if (ne == Hdr1_rcv_dt) doHdr1_rcv_dt_NE(info);
		else if (ne == Hdr1_div_flg) doHdr1_div_flg_NE(info);
		else if (ne == Hdr1_rcv_usr_cd) doHdr1_rcv_usr_cd_NE(info);
		else if (ne == Hdr1_rcv_usr_nm) doHdr1_rcv_usr_nm_NE(info);
		else if (ne == Hdr1_rcv_dpt_cd) doHdr1_rcv_dpt_cd_NE(info);
		else if (ne == Hdr1_rcv_dpt_nm) doHdr1_rcv_dpt_nm_NE(info);
		else if (ne == Hdr1_wg_cd) doHdr1_wg_cd_NE(info);
		else if (ne == Hdr1_wg_nm) doHdr1_wg_nm_NE(info);
		else if (ne == Hdr1_rcst_cd) doHdr1_rcst_cd_NE(info);
		else if (ne == Hdr1_rcst_nm) doHdr1_rcst_nm_NE(info);
		else if (ne == Hdr1_bcst_cd) doHdr1_bcst_cd_NE(info);
		else if (ne == Hdr1_bcst_nm) doHdr1_bcst_nm_NE(info);
		else if (ne == Hdr1_bill_dpt_cd) doHdr1_bill_dpt_cd_NE(info);
		else if (ne == Hdr1_bill_dpt_nm) doHdr1_bill_dpt_nm_NE(info);
		else if (ne == Hdr1_trd_cur_cd) doHdr1_trd_cur_cd_NE(info);
		else if (ne == Hdr1_trd_cur_nm) doHdr1_trd_cur_nm_NE(info);
		else if (ne == Hdr1_amt_dec_place) doHdr1_amt_dec_place_NE(info);
		else if (ne == Hdr1_xrate) doHdr1_xrate_NE(info);
		else if (ne == Hdr1_rcv_mtd_cd) doHdr1_rcv_mtd_cd_NE(info);
		else if (ne == Hdr1_rcv_mtd_nm) doHdr1_rcv_mtd_nm_NE(info);
		else if (ne == Hdr1_bank_ac_cd) doHdr1_bank_ac_cd_NE(info);
		else if (ne == Hdr1_bank_ac_nm) doHdr1_bank_ac_nm_NE(info);
		else if (ne == Hdr1_xfr_psn) doHdr1_xfr_psn_NE(info);
		else if (ne == Hdr1_rcv_rmrks) doHdr1_rcv_rmrks_NE(info);
		else if (ne == Hdr1_rcv_sub_char1) doHdr1_rcv_sub_char1_NE(info);
		else if (ne == Hdr1_rcv_sub_char2) doHdr1_rcv_sub_char2_NE(info);
		else if (ne == Hdr1_rcv_sub_char3) doHdr1_rcv_sub_char3_NE(info);
		else if (ne == Hdr1_rcv_auto_appl_tgt_flg) doHdr1_rcv_auto_appl_tgt_flg_NE(info);
		else if (ne == Hdr1_auto_appl_basis_dt) doHdr1_auto_appl_basis_dt_NE(info);
		else if (ne == Hdr1_auto_appl_sts_typ) doHdr1_auto_appl_sts_typ_NE(info);
		else if (ne == Hdr1_auto_appl_sts_typ_nm) doHdr1_auto_appl_sts_typ_nm_NE(info);
		else if (ne == Hdr1_note_no) doHdr1_note_no_NE(info);
		else if (ne == Hdr1_note_typ) doHdr1_note_typ_NE(info);
		else if (ne == Hdr1_note_typ_nm) doHdr1_note_typ_nm_NE(info);
		else if (ne == Hdr1_draw_dt) doHdr1_draw_dt_NE(info);
		else if (ne == Hdr1_due_dt) doHdr1_due_dt_NE(info);
		else if (ne == Hdr1_drawer_nm) doHdr1_drawer_nm_NE(info);
		else if (ne == Hdr1_endrsr) doHdr1_endrsr_NE(info);
		else if (ne == Hdr1_accptr) doHdr1_accptr_NE(info);
		else if (ne == Hdr1_draw_bank_cd) doHdr1_draw_bank_cd_NE(info);
		else if (ne == Hdr1_draw_bank_nm) doHdr1_draw_bank_nm_NE(info);
		else if (ne == Hdr1_draw_branch_cd) doHdr1_draw_branch_cd_NE(info);
		else if (ne == Hdr1_draw_branch_nm) doHdr1_draw_branch_nm_NE(info);
		else if (ne == Hdr1_note_rsn_cd) doHdr1_note_rsn_cd_NE(info);
		else if (ne == Hdr1_note_rsn_nm) doHdr1_note_rsn_nm_NE(info);
		else if (ne == Hdr1_note_sub_char1) doHdr1_note_sub_char1_NE(info);
		else if (ne == Hdr1_note_sub_char2) doHdr1_note_sub_char2_NE(info);
		else if (ne == Hdr1_note_sub_char3) doHdr1_note_sub_char3_NE(info);
		else if (ne == Hdr1_ins_usr_id) doHdr1_ins_usr_id_NE(info);
		else if (ne == Hdr1_ins_usr_nm) doHdr1_ins_usr_nm_NE(info);
		else if (ne == Hdr1_ins_func_id) doHdr1_ins_func_id_NE(info);
		else if (ne == Hdr1_ins_func_nm) doHdr1_ins_func_nm_NE(info);
		else if (ne == Hdr1_upd_usr_id) doHdr1_upd_usr_id_NE(info);
		else if (ne == Hdr1_upd_usr_nm) doHdr1_upd_usr_nm_NE(info);
		else if (ne == Hdr1_upd_func_id) doHdr1_upd_func_id_NE(info);
		else if (ne == Hdr1_upd_func_nm) doHdr1_upd_func_nm_NE(info);
		else if (ne == Hdr1_ins_ts) doHdr1_ins_ts_NE(info);
		else if (ne == Hdr1_upd_ts) doHdr1_upd_ts_NE(info);
		else if (ne == Hdr1_upd_srv_req_no) doHdr1_upd_srv_req_no_NE(info);
		else if (ne == Hdr1_upri_dec_place) doHdr1_upri_dec_place_NE(info);
		else if (ne == Hdr1_rcv_upd_cntr) doHdr1_rcv_upd_cntr_NE(info);
		else if (ne == Hdr1_rcv_dat_typ) doHdr1_rcv_dat_typ_NE(info);
		else if (ne == Hdr1_div_src_rcv_no) doHdr1_div_src_rcv_no_NE(info);
		else if (ne == columnRcvSchd_check) doRcvSchd_check_NE(info);
		else if (ne == columnRcvSchd_bcst_cd) doRcvSchd_bcst_cd_NE(info);
		else if (ne == columnRcvSchd_bcst_nm) doRcvSchd_bcst_nm_NE(info);
		else if (ne == columnRcvSchd_bill_dpt_cd) doRcvSchd_bill_dpt_cd_NE(info);
		else if (ne == columnRcvSchd_bill_dpt_nm) doRcvSchd_bill_dpt_nm_NE(info);
		else if (ne == columnRcvSchd_rcv_schd_dt) doRcvSchd_rcv_schd_dt_NE(info);
		else if (ne == columnRcvSchd_trd_cur_cd) doRcvSchd_trd_cur_cd_NE(info);
		else if (ne == columnRcvSchd_bill_no) doRcvSchd_bill_no_NE(info);
		else if (ne == columnRcvDiv_rcv_no) doRcvDiv_rcv_no_NE(info);
		else if (ne == columnRcvDiv_bcst_cd) doRcvDiv_bcst_cd_NE(info);
		else if (ne == columnRcvDiv_bcst_nm) doRcvDiv_bcst_nm_NE(info);
		else if (ne == columnRcvDiv_bill_dpt_cd) doRcvDiv_bill_dpt_cd_NE(info);
		else if (ne == columnRcvDiv_bill_dpt_nm) doRcvDiv_bill_dpt_nm_NE(info);
		else if (ne == columnRcvDiv_rcv_rmrks) doRcvDiv_rcv_rmrks_NE(info);
		else if (ne == columnRcvDiv_rcv_sub_char1) doRcvDiv_rcv_sub_char1_NE(info);
		else if (ne == columnRcvDiv_rcv_sub_char2) doRcvDiv_rcv_sub_char2_NE(info);
		else if (ne == columnRcvDiv_rcv_sub_char3) doRcvDiv_rcv_sub_char3_NE(info);
		else if (ne == columnRcvDiv_div_src_rcv_upd_cntr) doRcvDiv_div_src_rcv_upd_cntr_NE(info);
	}

	/**
	 * [HdrTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NE(MCEventInfo info){
	}

	/**
	 * [RcvSchd]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_NE(MCEventInfo info){
	}

	/**
	 * [RcvDiv]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[rcv_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_not_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_not_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[div_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_div_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_mtd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_mtd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_mtd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_mtd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[xfr_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_xfr_psn_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_auto_appl_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_auto_appl_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[auto_appl_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_auto_appl_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[auto_appl_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_auto_appl_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[auto_appl_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_auto_appl_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[draw_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_draw_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[due_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_due_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[drawer_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_drawer_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[endrsr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_endrsr_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[accptr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_accptr_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[draw_bank_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_draw_bank_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[draw_bank_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_draw_bank_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[draw_branch_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_draw_branch_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[draw_branch_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_draw_branch_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_dat_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_dat_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[div_src_rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_div_src_rcv_no_NE(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_check_NE(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[bill_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_bill_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[bill_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_bill_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[rcv_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_rcv_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_rcv_no_NE(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[bill_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_bill_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[bill_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_bill_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[rcv_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_rcv_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[rcv_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_rcv_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[rcv_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_rcv_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[rcv_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_rcv_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[div_src_rcv_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_div_src_rcv_upd_cntr_NE(MCEventInfo info){
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
		else if (nx == RcvSchdTable) doRcvSchd_NX(info);
		else if (nx == RcvDivTable) doRcvDiv_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_rcv_no) doCnd_rcv_no_NX(info);
		else if (nx == Cnd_rcv_schd_dt_fr) doCnd_rcv_schd_dt_fr_NX(info);
		else if (nx == Cnd_rcv_schd_dt_to) doCnd_rcv_schd_dt_to_NX(info);
		else if (nx == Cnd_inc_not_cl_flg) doCnd_inc_not_cl_flg_NX(info);
		else if (nx == Hdr1_rcv_no) doHdr1_rcv_no_NX(info);
		else if (nx == Hdr1_rcv_dt) doHdr1_rcv_dt_NX(info);
		else if (nx == Hdr1_div_flg) doHdr1_div_flg_NX(info);
		else if (nx == Hdr1_rcv_usr_cd) doHdr1_rcv_usr_cd_NX(info);
		else if (nx == Hdr1_rcv_usr_nm) doHdr1_rcv_usr_nm_NX(info);
		else if (nx == Hdr1_rcv_dpt_cd) doHdr1_rcv_dpt_cd_NX(info);
		else if (nx == Hdr1_rcv_dpt_nm) doHdr1_rcv_dpt_nm_NX(info);
		else if (nx == Hdr1_wg_cd) doHdr1_wg_cd_NX(info);
		else if (nx == Hdr1_wg_nm) doHdr1_wg_nm_NX(info);
		else if (nx == Hdr1_rcst_cd) doHdr1_rcst_cd_NX(info);
		else if (nx == Hdr1_rcst_nm) doHdr1_rcst_nm_NX(info);
		else if (nx == Hdr1_bcst_cd) doHdr1_bcst_cd_NX(info);
		else if (nx == Hdr1_bcst_nm) doHdr1_bcst_nm_NX(info);
		else if (nx == Hdr1_bill_dpt_cd) doHdr1_bill_dpt_cd_NX(info);
		else if (nx == Hdr1_bill_dpt_nm) doHdr1_bill_dpt_nm_NX(info);
		else if (nx == Hdr1_trd_cur_cd) doHdr1_trd_cur_cd_NX(info);
		else if (nx == Hdr1_trd_cur_nm) doHdr1_trd_cur_nm_NX(info);
		else if (nx == Hdr1_amt_dec_place) doHdr1_amt_dec_place_NX(info);
		else if (nx == Hdr1_xrate) doHdr1_xrate_NX(info);
		else if (nx == Hdr1_rcv_mtd_cd) doHdr1_rcv_mtd_cd_NX(info);
		else if (nx == Hdr1_rcv_mtd_nm) doHdr1_rcv_mtd_nm_NX(info);
		else if (nx == Hdr1_bank_ac_cd) doHdr1_bank_ac_cd_NX(info);
		else if (nx == Hdr1_bank_ac_nm) doHdr1_bank_ac_nm_NX(info);
		else if (nx == Hdr1_xfr_psn) doHdr1_xfr_psn_NX(info);
		else if (nx == Hdr1_rcv_rmrks) doHdr1_rcv_rmrks_NX(info);
		else if (nx == Hdr1_rcv_sub_char1) doHdr1_rcv_sub_char1_NX(info);
		else if (nx == Hdr1_rcv_sub_char2) doHdr1_rcv_sub_char2_NX(info);
		else if (nx == Hdr1_rcv_sub_char3) doHdr1_rcv_sub_char3_NX(info);
		else if (nx == Hdr1_rcv_auto_appl_tgt_flg) doHdr1_rcv_auto_appl_tgt_flg_NX(info);
		else if (nx == Hdr1_auto_appl_basis_dt) doHdr1_auto_appl_basis_dt_NX(info);
		else if (nx == Hdr1_auto_appl_sts_typ) doHdr1_auto_appl_sts_typ_NX(info);
		else if (nx == Hdr1_auto_appl_sts_typ_nm) doHdr1_auto_appl_sts_typ_nm_NX(info);
		else if (nx == Hdr1_note_no) doHdr1_note_no_NX(info);
		else if (nx == Hdr1_note_typ) doHdr1_note_typ_NX(info);
		else if (nx == Hdr1_note_typ_nm) doHdr1_note_typ_nm_NX(info);
		else if (nx == Hdr1_draw_dt) doHdr1_draw_dt_NX(info);
		else if (nx == Hdr1_due_dt) doHdr1_due_dt_NX(info);
		else if (nx == Hdr1_drawer_nm) doHdr1_drawer_nm_NX(info);
		else if (nx == Hdr1_endrsr) doHdr1_endrsr_NX(info);
		else if (nx == Hdr1_accptr) doHdr1_accptr_NX(info);
		else if (nx == Hdr1_draw_bank_cd) doHdr1_draw_bank_cd_NX(info);
		else if (nx == Hdr1_draw_bank_nm) doHdr1_draw_bank_nm_NX(info);
		else if (nx == Hdr1_draw_branch_cd) doHdr1_draw_branch_cd_NX(info);
		else if (nx == Hdr1_draw_branch_nm) doHdr1_draw_branch_nm_NX(info);
		else if (nx == Hdr1_note_rsn_cd) doHdr1_note_rsn_cd_NX(info);
		else if (nx == Hdr1_note_rsn_nm) doHdr1_note_rsn_nm_NX(info);
		else if (nx == Hdr1_note_sub_char1) doHdr1_note_sub_char1_NX(info);
		else if (nx == Hdr1_note_sub_char2) doHdr1_note_sub_char2_NX(info);
		else if (nx == Hdr1_note_sub_char3) doHdr1_note_sub_char3_NX(info);
		else if (nx == Hdr1_ins_usr_id) doHdr1_ins_usr_id_NX(info);
		else if (nx == Hdr1_ins_usr_nm) doHdr1_ins_usr_nm_NX(info);
		else if (nx == Hdr1_ins_func_id) doHdr1_ins_func_id_NX(info);
		else if (nx == Hdr1_ins_func_nm) doHdr1_ins_func_nm_NX(info);
		else if (nx == Hdr1_upd_usr_id) doHdr1_upd_usr_id_NX(info);
		else if (nx == Hdr1_upd_usr_nm) doHdr1_upd_usr_nm_NX(info);
		else if (nx == Hdr1_upd_func_id) doHdr1_upd_func_id_NX(info);
		else if (nx == Hdr1_upd_func_nm) doHdr1_upd_func_nm_NX(info);
		else if (nx == Hdr1_ins_ts) doHdr1_ins_ts_NX(info);
		else if (nx == Hdr1_upd_ts) doHdr1_upd_ts_NX(info);
		else if (nx == Hdr1_upd_srv_req_no) doHdr1_upd_srv_req_no_NX(info);
		else if (nx == Hdr1_upri_dec_place) doHdr1_upri_dec_place_NX(info);
		else if (nx == Hdr1_rcv_upd_cntr) doHdr1_rcv_upd_cntr_NX(info);
		else if (nx == Hdr1_rcv_dat_typ) doHdr1_rcv_dat_typ_NX(info);
		else if (nx == Hdr1_div_src_rcv_no) doHdr1_div_src_rcv_no_NX(info);
		else if (nx == columnRcvSchd_check) doRcvSchd_check_NX(info);
		else if (nx == columnRcvSchd_bcst_cd) doRcvSchd_bcst_cd_NX(info);
		else if (nx == columnRcvSchd_bcst_nm) doRcvSchd_bcst_nm_NX(info);
		else if (nx == columnRcvSchd_bill_dpt_cd) doRcvSchd_bill_dpt_cd_NX(info);
		else if (nx == columnRcvSchd_bill_dpt_nm) doRcvSchd_bill_dpt_nm_NX(info);
		else if (nx == columnRcvSchd_rcv_schd_dt) doRcvSchd_rcv_schd_dt_NX(info);
		else if (nx == columnRcvSchd_trd_cur_cd) doRcvSchd_trd_cur_cd_NX(info);
		else if (nx == columnRcvSchd_bill_no) doRcvSchd_bill_no_NX(info);
		else if (nx == columnRcvDiv_rcv_no) doRcvDiv_rcv_no_NX(info);
		else if (nx == columnRcvDiv_bcst_cd) doRcvDiv_bcst_cd_NX(info);
		else if (nx == columnRcvDiv_bcst_nm) doRcvDiv_bcst_nm_NX(info);
		else if (nx == columnRcvDiv_bill_dpt_cd) doRcvDiv_bill_dpt_cd_NX(info);
		else if (nx == columnRcvDiv_bill_dpt_nm) doRcvDiv_bill_dpt_nm_NX(info);
		else if (nx == columnRcvDiv_rcv_rmrks) doRcvDiv_rcv_rmrks_NX(info);
		else if (nx == columnRcvDiv_rcv_sub_char1) doRcvDiv_rcv_sub_char1_NX(info);
		else if (nx == columnRcvDiv_rcv_sub_char2) doRcvDiv_rcv_sub_char2_NX(info);
		else if (nx == columnRcvDiv_rcv_sub_char3) doRcvDiv_rcv_sub_char3_NX(info);
		else if (nx == columnRcvDiv_div_src_rcv_upd_cntr) doRcvDiv_div_src_rcv_upd_cntr_NX(info);
	}

	/**
	 * [HdrTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NX(MCEventInfo info){
	}

	/**
	 * [RcvSchd]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_NX(MCEventInfo info){
	}

	/**
	 * [RcvDiv]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[rcv_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_not_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_not_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[div_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_div_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_mtd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_mtd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_mtd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_mtd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[xfr_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_xfr_psn_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_auto_appl_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_auto_appl_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[auto_appl_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_auto_appl_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[auto_appl_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_auto_appl_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[auto_appl_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_auto_appl_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[draw_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_draw_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[due_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_due_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[drawer_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_drawer_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[endrsr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_endrsr_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[accptr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_accptr_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[draw_bank_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_draw_bank_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[draw_bank_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_draw_bank_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[draw_branch_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_draw_branch_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[draw_branch_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_draw_branch_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_dat_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_dat_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[div_src_rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_div_src_rcv_no_NX(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_check_NX(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[bill_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_bill_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[bill_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_bill_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[rcv_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_rcv_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_rcv_no_NX(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[bill_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_bill_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[bill_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_bill_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[rcv_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_rcv_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[rcv_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_rcv_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[rcv_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_rcv_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[rcv_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_rcv_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[div_src_rcv_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_div_src_rcv_upd_cntr_NX(MCEventInfo info){
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
		else if (lc == Cnd_rcv_schd_dt_fr) doCnd_rcv_schd_dt_fr_LC(info);
		else if (lc == Cnd_rcv_schd_dt_to) doCnd_rcv_schd_dt_to_LC(info);
		else if (lc == Hdr1_rcv_no) doHdr1_rcv_no_LC(info);
		else if (lc == Hdr1_rcv_dt) doHdr1_rcv_dt_LC(info);
		else if (lc == Hdr1_rcv_usr_cd) doHdr1_rcv_usr_cd_LC(info);
		else if (lc == Hdr1_rcv_usr_nm) doHdr1_rcv_usr_nm_LC(info);
		else if (lc == Hdr1_rcv_dpt_cd) doHdr1_rcv_dpt_cd_LC(info);
		else if (lc == Hdr1_rcv_dpt_nm) doHdr1_rcv_dpt_nm_LC(info);
		else if (lc == Hdr1_wg_cd) doHdr1_wg_cd_LC(info);
		else if (lc == Hdr1_wg_nm) doHdr1_wg_nm_LC(info);
		else if (lc == Hdr1_rcst_cd) doHdr1_rcst_cd_LC(info);
		else if (lc == Hdr1_rcst_nm) doHdr1_rcst_nm_LC(info);
		else if (lc == Hdr1_bcst_cd) doHdr1_bcst_cd_LC(info);
		else if (lc == Hdr1_bcst_nm) doHdr1_bcst_nm_LC(info);
		else if (lc == Hdr1_bill_dpt_cd) doHdr1_bill_dpt_cd_LC(info);
		else if (lc == Hdr1_bill_dpt_nm) doHdr1_bill_dpt_nm_LC(info);
		else if (lc == Hdr1_trd_cur_cd) doHdr1_trd_cur_cd_LC(info);
		else if (lc == Hdr1_trd_cur_nm) doHdr1_trd_cur_nm_LC(info);
		else if (lc == Hdr1_amt_dec_place) doHdr1_amt_dec_place_LC(info);
		else if (lc == Hdr1_xrate) doHdr1_xrate_LC(info);
		else if (lc == Hdr1_rcv_mtd_cd) doHdr1_rcv_mtd_cd_LC(info);
		else if (lc == Hdr1_rcv_mtd_nm) doHdr1_rcv_mtd_nm_LC(info);
		else if (lc == Hdr1_bank_ac_cd) doHdr1_bank_ac_cd_LC(info);
		else if (lc == Hdr1_bank_ac_nm) doHdr1_bank_ac_nm_LC(info);
		else if (lc == Hdr1_xfr_psn) doHdr1_xfr_psn_LC(info);
		else if (lc == Hdr1_rcv_rmrks) doHdr1_rcv_rmrks_LC(info);
		else if (lc == Hdr1_rcv_sub_char1) doHdr1_rcv_sub_char1_LC(info);
		else if (lc == Hdr1_rcv_sub_char2) doHdr1_rcv_sub_char2_LC(info);
		else if (lc == Hdr1_rcv_sub_char3) doHdr1_rcv_sub_char3_LC(info);
		else if (lc == Hdr1_auto_appl_basis_dt) doHdr1_auto_appl_basis_dt_LC(info);
		else if (lc == Hdr1_auto_appl_sts_typ) doHdr1_auto_appl_sts_typ_LC(info);
		else if (lc == Hdr1_auto_appl_sts_typ_nm) doHdr1_auto_appl_sts_typ_nm_LC(info);
		else if (lc == Hdr1_note_no) doHdr1_note_no_LC(info);
		else if (lc == Hdr1_note_typ) doHdr1_note_typ_LC(info);
		else if (lc == Hdr1_note_typ_nm) doHdr1_note_typ_nm_LC(info);
		else if (lc == Hdr1_draw_dt) doHdr1_draw_dt_LC(info);
		else if (lc == Hdr1_due_dt) doHdr1_due_dt_LC(info);
		else if (lc == Hdr1_drawer_nm) doHdr1_drawer_nm_LC(info);
		else if (lc == Hdr1_endrsr) doHdr1_endrsr_LC(info);
		else if (lc == Hdr1_accptr) doHdr1_accptr_LC(info);
		else if (lc == Hdr1_draw_bank_cd) doHdr1_draw_bank_cd_LC(info);
		else if (lc == Hdr1_draw_bank_nm) doHdr1_draw_bank_nm_LC(info);
		else if (lc == Hdr1_draw_branch_cd) doHdr1_draw_branch_cd_LC(info);
		else if (lc == Hdr1_draw_branch_nm) doHdr1_draw_branch_nm_LC(info);
		else if (lc == Hdr1_note_rsn_cd) doHdr1_note_rsn_cd_LC(info);
		else if (lc == Hdr1_note_rsn_nm) doHdr1_note_rsn_nm_LC(info);
		else if (lc == Hdr1_note_sub_char1) doHdr1_note_sub_char1_LC(info);
		else if (lc == Hdr1_note_sub_char2) doHdr1_note_sub_char2_LC(info);
		else if (lc == Hdr1_note_sub_char3) doHdr1_note_sub_char3_LC(info);
		else if (lc == Hdr1_ins_usr_id) doHdr1_ins_usr_id_LC(info);
		else if (lc == Hdr1_ins_usr_nm) doHdr1_ins_usr_nm_LC(info);
		else if (lc == Hdr1_ins_func_id) doHdr1_ins_func_id_LC(info);
		else if (lc == Hdr1_ins_func_nm) doHdr1_ins_func_nm_LC(info);
		else if (lc == Hdr1_upd_usr_id) doHdr1_upd_usr_id_LC(info);
		else if (lc == Hdr1_upd_usr_nm) doHdr1_upd_usr_nm_LC(info);
		else if (lc == Hdr1_upd_func_id) doHdr1_upd_func_id_LC(info);
		else if (lc == Hdr1_upd_func_nm) doHdr1_upd_func_nm_LC(info);
		else if (lc == Hdr1_ins_ts) doHdr1_ins_ts_LC(info);
		else if (lc == Hdr1_upd_ts) doHdr1_upd_ts_LC(info);
		else if (lc == Hdr1_upd_srv_req_no) doHdr1_upd_srv_req_no_LC(info);
		else if (lc == Hdr1_upri_dec_place) doHdr1_upri_dec_place_LC(info);
		else if (lc == Hdr1_rcv_upd_cntr) doHdr1_rcv_upd_cntr_LC(info);
		else if (lc == Hdr1_rcv_dat_typ) doHdr1_rcv_dat_typ_LC(info);
		else if (lc == Hdr1_div_src_rcv_no) doHdr1_div_src_rcv_no_LC(info);
		else if (lc == columnRcvSchd_bcst_cd) doRcvSchd_bcst_cd_LC(info);
		else if (lc == columnRcvSchd_bcst_nm) doRcvSchd_bcst_nm_LC(info);
		else if (lc == columnRcvSchd_bill_dpt_cd) doRcvSchd_bill_dpt_cd_LC(info);
		else if (lc == columnRcvSchd_bill_dpt_nm) doRcvSchd_bill_dpt_nm_LC(info);
		else if (lc == columnRcvSchd_rcv_schd_dt) doRcvSchd_rcv_schd_dt_LC(info);
		else if (lc == columnRcvSchd_trd_cur_cd) doRcvSchd_trd_cur_cd_LC(info);
		else if (lc == columnRcvSchd_bill_no) doRcvSchd_bill_no_LC(info);
		else if (lc == columnRcvDiv_rcv_no) doRcvDiv_rcv_no_LC(info);
		else if (lc == columnRcvDiv_bcst_cd) doRcvDiv_bcst_cd_LC(info);
		else if (lc == columnRcvDiv_bcst_nm) doRcvDiv_bcst_nm_LC(info);
		else if (lc == columnRcvDiv_bill_dpt_cd) doRcvDiv_bill_dpt_cd_LC(info);
		else if (lc == columnRcvDiv_bill_dpt_nm) doRcvDiv_bill_dpt_nm_LC(info);
		else if (lc == columnRcvDiv_rcv_rmrks) doRcvDiv_rcv_rmrks_LC(info);
		else if (lc == columnRcvDiv_rcv_sub_char1) doRcvDiv_rcv_sub_char1_LC(info);
		else if (lc == columnRcvDiv_rcv_sub_char2) doRcvDiv_rcv_sub_char2_LC(info);
		else if (lc == columnRcvDiv_rcv_sub_char3) doRcvDiv_rcv_sub_char3_LC(info);
		else if (lc == columnRcvDiv_div_src_rcv_upd_cntr) doRcvDiv_div_src_rcv_upd_cntr_LC(info);
	}

	/**
	 * [Cnd]パネルの[rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_mtd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_mtd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_mtd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_mtd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bank_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[xfr_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_xfr_psn_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[auto_appl_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_auto_appl_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[auto_appl_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_auto_appl_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[auto_appl_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_auto_appl_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[draw_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_draw_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[due_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_due_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[drawer_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_drawer_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[endrsr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_endrsr_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[accptr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_accptr_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[draw_bank_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_draw_bank_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[draw_bank_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_draw_bank_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[draw_branch_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_draw_branch_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[draw_branch_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_draw_branch_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[note_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_note_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_dat_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_dat_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[div_src_rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_div_src_rcv_no_LC(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[bill_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_bill_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[bill_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_bill_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[rcv_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_rcv_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [RcvSchd]パネルの[bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvSchd_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_rcv_no_LC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[bill_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_bill_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[bill_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_bill_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[rcv_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_rcv_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[rcv_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_rcv_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[rcv_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_rcv_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[rcv_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_rcv_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [RcvDiv]パネルの[div_src_rcv_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvDiv_div_src_rcv_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnRcvDiv_bcst_cd]の作成メソッド
	 */
	public MCList getRcvDiv_bcst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRcvDiv_bill_dpt_cd]の作成メソッド
	 */
	public MCList getRcvDiv_bill_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBGL0160.Srch01")) {
			return new MS_MSBGL0160_Srch01Bridge();
		}
		if (id.equals("MS.MSBGL0160.Upd01")) {
			return new MS_MSBGL0160_Upd01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBGL0160_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0160_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0160_Srch01;

		/** コンストラクタ */
		protected MS_MSBGL0160_Srch01Bridge() {
			p_MS_MSBGL0160_Srch01 = new MCParam(PDef.MS_MSBGL0160_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0160_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0160.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0160.Hdr1R.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0160.RcvDivR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0160.RcvSchdR.class));

			p_MS_MSBGL0160_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0160_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0160_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0160_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0160_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0160.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0160.CndR)up(0);
		}

		protected mcframe.clientMSBG.MSBGP0160.Hdr1R down0() {
			return (mcframe.clientMSBG.MSBGP0160.Hdr1R)down(0);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0160.RcvDivR> down1() {
			return (MCList<mcframe.clientMSBG.MSBGP0160.RcvDivR>)down(1);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0160.RcvSchdR> down2() {
			return (MCList<mcframe.clientMSBG.MSBGP0160.RcvSchdR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0160_Srch01.addDownBlock(mcframe.clientMSBG.MSBGP0160.Hdr1R.create());
			p_MS_MSBGL0160_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0160.RcvDivR.class));
			p_MS_MSBGL0160_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0160.RcvSchdR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0160_Srch01;
		}

		protected void show() {
			setHdr1R((mcframe.clientMSBG.MSBGP0160.Hdr1R)p_MS_MSBGL0160_Srch01.getContainerParam().getDownBlock(0));
			setRcvDivL((MCList<mcframe.clientMSBG.MSBGP0160.RcvDivR>)p_MS_MSBGL0160_Srch01.getContainerParam().getDownBlock(1));
			setRcvSchdL((MCList<mcframe.clientMSBG.MSBGP0160.RcvSchdR>)p_MS_MSBGL0160_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdr1R().clear();
			getRcvDivL().clear();
			getRcvSchdL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			result.add(getRcvDivL());
			result.add(getRcvSchdL());
			return result;
		}
	}
	/**
	 * [MS_MSBGL0160_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0160_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0160_Upd01;

		/** コンストラクタ */
		protected MS_MSBGL0160_Upd01Bridge() {
			p_MS_MSBGL0160_Upd01 = new MCParam(PDef.MS_MSBGL0160_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0160_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0160.Hdr1R.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBG.MSBGP0160.RcvDivR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0160.Hdr1R.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0160.RcvDivR.class));

			p_MS_MSBGL0160_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0160_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0160_Upd01.addUpBlock(getHdr1R());
			p_MS_MSBGL0160_Upd01.addUpBlock(getRcvDivL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0160_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0160_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0160.Hdr1R up0() {
			return (mcframe.clientMSBG.MSBGP0160.Hdr1R)up(0);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0160.RcvDivR> up1() {
			return (MCList<mcframe.clientMSBG.MSBGP0160.RcvDivR>)up(1);
		}

		protected mcframe.clientMSBG.MSBGP0160.Hdr1R down0() {
			return (mcframe.clientMSBG.MSBGP0160.Hdr1R)down(0);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0160.RcvDivR> down1() {
			return (MCList<mcframe.clientMSBG.MSBGP0160.RcvDivR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0160_Upd01.addDownBlock(mcframe.clientMSBG.MSBGP0160.Hdr1R.create());
			p_MS_MSBGL0160_Upd01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0160.RcvDivR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0160_Upd01;
		}

		protected void show() {
			setHdr1R((mcframe.clientMSBG.MSBGP0160.Hdr1R)p_MS_MSBGL0160_Upd01.getContainerParam().getDownBlock(0));
			setRcvDivL((MCList<mcframe.clientMSBG.MSBGP0160.RcvDivR>)p_MS_MSBGL0160_Upd01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdr1R().clear();
			getRcvDivL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			result.add(getRcvDivL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			result.add(getRcvDivL());
			return result;
		}
	}
}