package mcframe.clientMSBG.MSBGP0150;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
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
import mcframe.clientMSBG.MSBGP0150.MSBGP_NotApplSrch_MC.MS_MSBGL0150_Srch01Caller;
import mcframe.clientMSBG.MSBGP0150.MSBGP_NotApplSrch_MC.MS_MSBGL0150_Prnt01Caller;

/**
 * 画面"MSBGP_NotApplSrch"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGP_NotApplSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBGP0150";

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
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCTabbedPane FoldTab = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [RcvIfTyp]ブロック関連のField定義
	public MCPanel RcvIfTypPanel = null;
	public MCTitledBorder RcvIfTypTitledBorder = null;
	// [RcvIfTyp]ブロックの項目のField定義
	// [RcvPrnt]ブロック関連のField定義
	public MCPanel RcvPrntPanel = null;
	public MCTitledBorder RcvPrntTitledBorder = null;
	// [RcvPrnt]ブロックの項目のField定義
	// [FbTgt]ブロック関連のField定義
	public MCPanel FbTgtPanel = null;
	public MCTitledBorder FbTgtTitledBorder = null;
	// [FbTgt]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [RcstCnd]ブロック関連のField定義
	public MCPanel RcstCndPanel = null;
	// [RcstCnd]ブロックの項目のField定義
	// [BcstCnd]ブロック関連のField定義
	public MCPanel BcstCndPanel = null;
	// [BcstCnd]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * PRNT,Issue report,0;REF,View,1 PRNT,帳票発行する,0;REF,参照する,1.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_PRNT = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * Payment received 入金.<p>
	 *
	 */
	public MCCheckBox Cnd_rcv_flg = null;
	/**
	 * Suspense received 仮受金.<p>
	 *
	 */
	public MCCheckBox Cnd_susp_flg = null;
	/**
	 * Advance received 前受金.<p>
	 *
	 */
	public MCCheckBox Cnd_adv_flg = null;
	/**
	 * AP amount offset 買掛金相殺.<p>
	 *
	 */
	public MCCheckBox Cnd_ap_flg = null;
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public MCCheckBox Cnd_not_prnt_flg = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCCheckBox Cnd_prnt_flg = null;
	/**
	 * Target 対象.<p>
	 *
	 */
	public MCCheckBox Cnd_fb_t_flg = null;
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_fb_f_flg = null;
	public MCLabel Cnd_rcv_dt_fr_Label = null;
	/**
	 * Payment received date FROM 入金日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_rcv_dt_fr = null;
	public MCLabel Cnd_rcv_dt_to_Label = null;
	/**
	 * Payment received date 入金日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_rcv_dt_to = null;
	public MCLabel Cnd_rcst_cd_Label = null;
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_rcst_cd = null;
	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public MCTextField Cnd_rcst_nm = null;
	public MCLabel Cnd_bcst_cd_Label = null;
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bcst_cd = null;
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public MCTextField Cnd_bcst_nm = null;
	public MCLabel Cnd_rcv_usr_cd_Label = null;
	/**
	 * Payment received PIC cd. 入金担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_rcv_usr_cd = null;
	/**
	 * Payment received PIC name 入金担当者名.<p>
	 *
	 */
	public MCTextField Cnd_rcv_usr_nm = null;
	public MCLabel Cnd_rcv_dpt_cd_Label = null;
	/**
	 * Payment receiving dept. cd. 入金部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_rcv_dpt_cd = null;
	/**
	 * Payment receiving dept. name 入金部門名.<p>
	 *
	 */
	public MCTextField Cnd_rcv_dpt_nm = null;
	public MCLabel Cnd_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_wg_nm = null;
	public MCLabel Cnd_rcv_rmrks_Label = null;
	/**
	 * Payment received remarks 入金備考.<p>
	 *
	 */
	public MCTextField Cnd_rcv_rmrks = null;
	public MCLabel Cnd_rcv_no_Label = null;
	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rcv_no = null;
	public MCLabel Cnd_note_no_Label = null;
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public MCTextField Cnd_note_no = null;
	public MCLabel Cnd_pay_act_no_Label = null;
	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_pay_act_no = null;
	public MCLabel Cnd_rcv_mtd_cd_Label = null;
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_rcv_mtd_cd = null;
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public MCTextField Cnd_rcv_mtd_nm = null;
	public MCLabel Cnd_bank_ac_cd_Label = null;
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_bank_ac_cd = null;
	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public MCTextField Cnd_bank_ac_nm = null;
	public MCLabel Cnd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField Cnd_cur_nm = null;
	public MCLabel Cnd_bill_dpt_cd_Label = null;
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bill_dpt_cd = null;
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public MCTextField Cnd_bill_dpt_nm = null;
	public MCLabel Cnd_auto_appl_sts_typ_Label = null;
	/**
	 * Auto-reconciliation status type 自動消込状況区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_auto_appl_sts_typ = null;
	/**
	 * Auto-reconciliation status type name 自動消込状況区分名.<p>
	 *
	 */
	public MCTextField Cnd_auto_appl_sts_typ_nm = null;
	/**
	 * IF payment received No. ＩＦ入金ＮＯ.<p>
	 *
	 */
	public MCNumberField Cnd_if_rcv_no = null;
	public MCLabel Cnd_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Cnd_sub_char1 = null;
	public MCLabel Cnd_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Cnd_sub_char2 = null;
	public MCLabel Cnd_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Cnd_sub_char3 = null;
	/**
	 * Include processed 処理済含む.<p>
	 *
	 */
	public MCCheckBox Cnd_proc_flg = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_rcv_grp_PPanel;
	public MCLabel Cnd_rcv_grp_lab1;	// [Cnd]の[rcv_grp.bp_grp_lab1]を[Cnd_rcv_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_rcv_grp_flg1;	// [Cnd]の[rcv_grp.bp_grp_flg1]を[Cnd_rcv_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_rcv_grp_cd1;	// [Cnd]の[rcv_grp.bp_grp_cd1]を[Cnd_rcv_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_rcv_grp_nm1;	// [Cnd]の[rcv_grp.bp_grp_nm1]を[Cnd_rcv_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_rcv_grp_lab2;	// [Cnd]の[rcv_grp.bp_grp_lab2]を[Cnd_rcv_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_rcv_grp_flg2;	// [Cnd]の[rcv_grp.bp_grp_flg2]を[Cnd_rcv_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_rcv_grp_cd2;	// [Cnd]の[rcv_grp.bp_grp_cd2]を[Cnd_rcv_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_rcv_grp_nm2;	// [Cnd]の[rcv_grp.bp_grp_nm2]を[Cnd_rcv_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_rcv_grp_lab3;	// [Cnd]の[rcv_grp.bp_grp_lab3]を[Cnd_rcv_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_rcv_grp_flg3;	// [Cnd]の[rcv_grp.bp_grp_flg3]を[Cnd_rcv_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_rcv_grp_cd3;	// [Cnd]の[rcv_grp.bp_grp_cd3]を[Cnd_rcv_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_rcv_grp_nm3;	// [Cnd]の[rcv_grp.bp_grp_nm3]を[Cnd_rcv_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_rcv_grp_lab4;	// [Cnd]の[rcv_grp.bp_grp_lab4]を[Cnd_rcv_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_rcv_grp_flg4;	// [Cnd]の[rcv_grp.bp_grp_flg4]を[Cnd_rcv_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_rcv_grp_cd4;	// [Cnd]の[rcv_grp.bp_grp_cd4]を[Cnd_rcv_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_rcv_grp_nm4;	// [Cnd]の[rcv_grp.bp_grp_nm4]を[Cnd_rcv_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_rcv_grp_lab5;	// [Cnd]の[rcv_grp.bp_grp_lab5]を[Cnd_rcv_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_rcv_grp_flg5;	// [Cnd]の[rcv_grp.bp_grp_flg5]を[Cnd_rcv_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_rcv_grp_cd5;	// [Cnd]の[rcv_grp.bp_grp_cd5]を[Cnd_rcv_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_rcv_grp_nm5;	// [Cnd]の[rcv_grp.bp_grp_nm5]を[Cnd_rcv_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_rcv_grp_lab6;	// [Cnd]の[rcv_grp.bp_grp_lab6]を[Cnd_rcv_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_rcv_grp_flg6;	// [Cnd]の[rcv_grp.bp_grp_flg6]を[Cnd_rcv_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_rcv_grp_cd6;	// [Cnd]の[rcv_grp.bp_grp_cd6]を[Cnd_rcv_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_rcv_grp_nm6;	// [Cnd]の[rcv_grp.bp_grp_nm6]を[Cnd_rcv_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_rcv_grp_lab7;	// [Cnd]の[rcv_grp.bp_grp_lab7]を[Cnd_rcv_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_rcv_grp_flg7;	// [Cnd]の[rcv_grp.bp_grp_flg7]を[Cnd_rcv_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_rcv_grp_cd7;	// [Cnd]の[rcv_grp.bp_grp_cd7]を[Cnd_rcv_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_rcv_grp_nm7;	// [Cnd]の[rcv_grp.bp_grp_nm7]を[Cnd_rcv_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_rcv_grp_lab8;	// [Cnd]の[rcv_grp.bp_grp_lab8]を[Cnd_rcv_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_rcv_grp_flg8;	// [Cnd]の[rcv_grp.bp_grp_flg8]を[Cnd_rcv_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_rcv_grp_cd8;	// [Cnd]の[rcv_grp.bp_grp_cd8]を[Cnd_rcv_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_rcv_grp_nm8;	// [Cnd]の[rcv_grp.bp_grp_nm8]を[Cnd_rcv_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_rcv_grp_lab9;	// [Cnd]の[rcv_grp.bp_grp_lab9]を[Cnd_rcv_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_rcv_grp_flg9;	// [Cnd]の[rcv_grp.bp_grp_flg9]を[Cnd_rcv_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_rcv_grp_cd9;	// [Cnd]の[rcv_grp.bp_grp_cd9]を[Cnd_rcv_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_rcv_grp_nm9;	// [Cnd]の[rcv_grp.bp_grp_nm9]を[Cnd_rcv_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_rcv_grp_lab10;	// [Cnd]の[rcv_grp.bp_grp_lab10]を[Cnd_rcv_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_rcv_grp_flg10;	// [Cnd]の[rcv_grp.bp_grp_flg10]を[Cnd_rcv_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_rcv_grp_cd10;	// [Cnd]の[rcv_grp.bp_grp_cd10]を[Cnd_rcv_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_rcv_grp_nm10;	// [Cnd]の[rcv_grp.bp_grp_nm10]を[Cnd_rcv_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_bill_grp_PPanel;
	public MCLabel Cnd_bill_grp_lab1;	// [Cnd]の[bill_grp.bp_grp_lab1]を[Cnd_bill_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_bill_grp_flg1;	// [Cnd]の[bill_grp.bp_grp_flg1]を[Cnd_bill_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_bill_grp_cd1;	// [Cnd]の[bill_grp.bp_grp_cd1]を[Cnd_bill_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_bill_grp_nm1;	// [Cnd]の[bill_grp.bp_grp_nm1]を[Cnd_bill_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_bill_grp_lab2;	// [Cnd]の[bill_grp.bp_grp_lab2]を[Cnd_bill_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_bill_grp_flg2;	// [Cnd]の[bill_grp.bp_grp_flg2]を[Cnd_bill_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_bill_grp_cd2;	// [Cnd]の[bill_grp.bp_grp_cd2]を[Cnd_bill_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_bill_grp_nm2;	// [Cnd]の[bill_grp.bp_grp_nm2]を[Cnd_bill_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_bill_grp_lab3;	// [Cnd]の[bill_grp.bp_grp_lab3]を[Cnd_bill_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_bill_grp_flg3;	// [Cnd]の[bill_grp.bp_grp_flg3]を[Cnd_bill_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_bill_grp_cd3;	// [Cnd]の[bill_grp.bp_grp_cd3]を[Cnd_bill_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_bill_grp_nm3;	// [Cnd]の[bill_grp.bp_grp_nm3]を[Cnd_bill_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_bill_grp_lab4;	// [Cnd]の[bill_grp.bp_grp_lab4]を[Cnd_bill_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_bill_grp_flg4;	// [Cnd]の[bill_grp.bp_grp_flg4]を[Cnd_bill_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_bill_grp_cd4;	// [Cnd]の[bill_grp.bp_grp_cd4]を[Cnd_bill_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_bill_grp_nm4;	// [Cnd]の[bill_grp.bp_grp_nm4]を[Cnd_bill_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_bill_grp_lab5;	// [Cnd]の[bill_grp.bp_grp_lab5]を[Cnd_bill_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_bill_grp_flg5;	// [Cnd]の[bill_grp.bp_grp_flg5]を[Cnd_bill_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_bill_grp_cd5;	// [Cnd]の[bill_grp.bp_grp_cd5]を[Cnd_bill_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_bill_grp_nm5;	// [Cnd]の[bill_grp.bp_grp_nm5]を[Cnd_bill_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_bill_grp_lab6;	// [Cnd]の[bill_grp.bp_grp_lab6]を[Cnd_bill_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_bill_grp_flg6;	// [Cnd]の[bill_grp.bp_grp_flg6]を[Cnd_bill_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_bill_grp_cd6;	// [Cnd]の[bill_grp.bp_grp_cd6]を[Cnd_bill_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_bill_grp_nm6;	// [Cnd]の[bill_grp.bp_grp_nm6]を[Cnd_bill_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_bill_grp_lab7;	// [Cnd]の[bill_grp.bp_grp_lab7]を[Cnd_bill_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_bill_grp_flg7;	// [Cnd]の[bill_grp.bp_grp_flg7]を[Cnd_bill_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_bill_grp_cd7;	// [Cnd]の[bill_grp.bp_grp_cd7]を[Cnd_bill_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_bill_grp_nm7;	// [Cnd]の[bill_grp.bp_grp_nm7]を[Cnd_bill_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_bill_grp_lab8;	// [Cnd]の[bill_grp.bp_grp_lab8]を[Cnd_bill_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_bill_grp_flg8;	// [Cnd]の[bill_grp.bp_grp_flg8]を[Cnd_bill_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_bill_grp_cd8;	// [Cnd]の[bill_grp.bp_grp_cd8]を[Cnd_bill_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_bill_grp_nm8;	// [Cnd]の[bill_grp.bp_grp_nm8]を[Cnd_bill_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_bill_grp_lab9;	// [Cnd]の[bill_grp.bp_grp_lab9]を[Cnd_bill_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_bill_grp_flg9;	// [Cnd]の[bill_grp.bp_grp_flg9]を[Cnd_bill_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_bill_grp_cd9;	// [Cnd]の[bill_grp.bp_grp_cd9]を[Cnd_bill_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_bill_grp_nm9;	// [Cnd]の[bill_grp.bp_grp_nm9]を[Cnd_bill_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_bill_grp_lab10;	// [Cnd]の[bill_grp.bp_grp_lab10]を[Cnd_bill_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_bill_grp_flg10;	// [Cnd]の[bill_grp.bp_grp_flg10]を[Cnd_bill_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_bill_grp_cd10;	// [Cnd]の[bill_grp.bp_grp_cd10]を[Cnd_bill_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_bill_grp_nm10;	// [Cnd]の[bill_grp.bp_grp_nm10]を[Cnd_bill_grp_nm10]としてエイリアス定義。
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [RPnl]ブロック関連のField定義
	public MCPanel RPnlPanel = null;
	// [RPnl]ブロックの項目のField定義
	/**
	 * Download ダウンロードする.<p>
	 *
	 */
	public MCButton RPnl_dwnld = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0150.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Payment received info. type 入金情報区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_dat_typ = null;
	/**
	 * Payment received info. type name 入金情報区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_dat_typ_nm = null;
	/**
	 * Payment receiving dept. cd. 入金部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_dpt_cd = null;
	/**
	 * Payment receiving dept. name 入金部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_dpt_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_nm = null;
	/**
	 * Payment received PIC cd. 入金担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_usr_cd = null;
	/**
	 * Payment received PIC name 入金担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_usr_nm = null;
	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_no = null;
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_dt = null;
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcst_cd = null;
	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcst_nm = null;
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bcst_cd = null;
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bcst_nm = null;
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_dpt_cd = null;
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_dpt_nm = null;
	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xfr_psn = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cur_nm = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt_dec_place = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_rcv_amt_p_PPanel;
	public MCColumnConfig columnRslt_rcv_amt;// [Rslt]の[rcv_amt_p.amt]を[columnRslt_rcv_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_roc_bal_p_PPanel;
	public MCColumnConfig columnRslt_not_proc_bal;// [Rslt]の[roc_bal_p.amt]を[columnRslt_not_proc_bal]としてエイリアス定義。
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bank_ac_cd = null;
	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bank_ac_nm = null;
	/**
	 * Bank account number 口座番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bank_ac_no = null;
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_mtd_cd = null;
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_mtd_nm = null;
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_no = null;
	/**
	 * Auto-reconciliation status type 自動消込状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_auto_appl_sts_typ = null;
	/**
	 * Auto-reconciliation status type name 自動消込状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_auto_appl_sts_typ_nm = null;
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asppl_nm = null;
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_cd = null;
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_nm = null;
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acst_cd = null;
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acst_nm = null;
	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_act_no = null;
	/**
	 * Payment received remarks 入金備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_rmrks = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prnt_flg = null;
	/**
	 * Split 分割.<p>
	 *
	 */
	public MCColumnConfig columnRslt_div_flg = null;
	/**
	 * Payment received split source No. 分割元入金ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_div_src_rcv_no = null;
	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_src_rcv_act_no = null;
	/**
	 * IF payment received No. ＩＦ入金ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_if_rcv_no = null;
	/**
	 * FB ＦＢ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fb_flg = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_sys_nm = null;
	/**
	 * External payment received No. 外部入金ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_rcv_no = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char3 = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_rcv_grp_p_PPanel;
	public MCColumnConfig columnRslt_rcv_grp_cd1;// [Rslt]の[rcv_grp_p.bp_grp_cd1]を[columnRslt_rcv_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcv_grp_nm1;// [Rslt]の[rcv_grp_p.bp_grp_nm1]を[columnRslt_rcv_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcv_grp_cd2;// [Rslt]の[rcv_grp_p.bp_grp_cd2]を[columnRslt_rcv_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcv_grp_nm2;// [Rslt]の[rcv_grp_p.bp_grp_nm2]を[columnRslt_rcv_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcv_grp_cd3;// [Rslt]の[rcv_grp_p.bp_grp_cd3]を[columnRslt_rcv_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcv_grp_nm3;// [Rslt]の[rcv_grp_p.bp_grp_nm3]を[columnRslt_rcv_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcv_grp_cd4;// [Rslt]の[rcv_grp_p.bp_grp_cd4]を[columnRslt_rcv_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcv_grp_nm4;// [Rslt]の[rcv_grp_p.bp_grp_nm4]を[columnRslt_rcv_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcv_grp_cd5;// [Rslt]の[rcv_grp_p.bp_grp_cd5]を[columnRslt_rcv_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcv_grp_nm5;// [Rslt]の[rcv_grp_p.bp_grp_nm5]を[columnRslt_rcv_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcv_grp_cd6;// [Rslt]の[rcv_grp_p.bp_grp_cd6]を[columnRslt_rcv_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcv_grp_nm6;// [Rslt]の[rcv_grp_p.bp_grp_nm6]を[columnRslt_rcv_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcv_grp_cd7;// [Rslt]の[rcv_grp_p.bp_grp_cd7]を[columnRslt_rcv_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcv_grp_nm7;// [Rslt]の[rcv_grp_p.bp_grp_nm7]を[columnRslt_rcv_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcv_grp_cd8;// [Rslt]の[rcv_grp_p.bp_grp_cd8]を[columnRslt_rcv_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcv_grp_nm8;// [Rslt]の[rcv_grp_p.bp_grp_nm8]を[columnRslt_rcv_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcv_grp_cd9;// [Rslt]の[rcv_grp_p.bp_grp_cd9]を[columnRslt_rcv_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcv_grp_nm9;// [Rslt]の[rcv_grp_p.bp_grp_nm9]を[columnRslt_rcv_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcv_grp_cd10;// [Rslt]の[rcv_grp_p.bp_grp_cd10]を[columnRslt_rcv_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcv_grp_nm10;// [Rslt]の[rcv_grp_p.bp_grp_nm10]を[columnRslt_rcv_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_bill_grp_p_PPanel;
	public MCColumnConfig columnRslt_bill_grp_cd1;// [Rslt]の[bill_grp_p.bp_grp_cd1]を[columnRslt_bill_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bill_grp_nm1;// [Rslt]の[bill_grp_p.bp_grp_nm1]を[columnRslt_bill_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bill_grp_cd2;// [Rslt]の[bill_grp_p.bp_grp_cd2]を[columnRslt_bill_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bill_grp_nm2;// [Rslt]の[bill_grp_p.bp_grp_nm2]を[columnRslt_bill_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bill_grp_cd3;// [Rslt]の[bill_grp_p.bp_grp_cd3]を[columnRslt_bill_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bill_grp_nm3;// [Rslt]の[bill_grp_p.bp_grp_nm3]を[columnRslt_bill_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bill_grp_cd4;// [Rslt]の[bill_grp_p.bp_grp_cd4]を[columnRslt_bill_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bill_grp_nm4;// [Rslt]の[bill_grp_p.bp_grp_nm4]を[columnRslt_bill_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bill_grp_cd5;// [Rslt]の[bill_grp_p.bp_grp_cd5]を[columnRslt_bill_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bill_grp_nm5;// [Rslt]の[bill_grp_p.bp_grp_nm5]を[columnRslt_bill_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bill_grp_cd6;// [Rslt]の[bill_grp_p.bp_grp_cd6]を[columnRslt_bill_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bill_grp_nm6;// [Rslt]の[bill_grp_p.bp_grp_nm6]を[columnRslt_bill_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bill_grp_cd7;// [Rslt]の[bill_grp_p.bp_grp_cd7]を[columnRslt_bill_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bill_grp_nm7;// [Rslt]の[bill_grp_p.bp_grp_nm7]を[columnRslt_bill_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bill_grp_cd8;// [Rslt]の[bill_grp_p.bp_grp_cd8]を[columnRslt_bill_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bill_grp_nm8;// [Rslt]の[bill_grp_p.bp_grp_nm8]を[columnRslt_bill_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bill_grp_cd9;// [Rslt]の[bill_grp_p.bp_grp_cd9]を[columnRslt_bill_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bill_grp_nm9;// [Rslt]の[bill_grp_p.bp_grp_nm9]を[columnRslt_bill_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bill_grp_cd10;// [Rslt]の[bill_grp_p.bp_grp_cd10]を[columnRslt_bill_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_bill_grp_nm10;// [Rslt]の[bill_grp_p.bp_grp_nm10]を[columnRslt_bill_grp_nm10]としてエイリアス定義。
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_srv_req_no = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * AR reconciliation entry 売掛消込登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0210 = null;
	/**
	 * Advance/suspense received entry 前受仮受登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0200 = null;
	/**
	 * Payment received result 入金実績一覧.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0250 = null;
	/**
	 * Payment received entry 入金登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0140 = null;
	/**
	 * Payment received split 入金分割登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0160 = null;
	/**
	 * Payment received slip 入金管理票.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
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
	 * Individual issue 個別発行.<p>
	 *
	 */
	public MCCheckBox Btn_indiv_prnt_flg = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [SRCH_PRNT]モードを表す定数 */
	public static final String SRCH_PRNT = "SRCH_PRNT";
	/** [PRNT]モードを表す定数 */
	public static final String PRNT = "PRNT";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, REF, SRCH_PRNT, PRNT};
	
	/** [MS_MSBGL0150_Srch01]のCallerの作成 */
	protected MSBGP_NotApplSrch_MC.MS_MSBGL0150_Srch01Caller createMS_MSBGL0150_Srch01() {
		MSBGP_NotApplSrch_MC.MS_MSBGL0150_Srch01Caller<MSBGP_NotApplSrch, MS_MSBGL0150_Srch01Bridge>
		caller = ((MSBGP_NotApplSrch_MC)this).new MS_MSBGL0150_Srch01Caller<MSBGP_NotApplSrch, MS_MSBGL0150_Srch01Bridge>(
					(MSBGP_NotApplSrch)this, new MS_MSBGL0150_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBGL0150_Srch01]の呼び出し */
	protected void callMS_MSBGL0150_Srch01() {
		MCCaller caller = createMS_MSBGL0150_Srch01();
		caller.exec();
	}
	/** [MS_MSBGL0150_Prnt01]のCallerの作成 */
	protected MSBGP_NotApplSrch_MC.MS_MSBGL0150_Prnt01Caller createMS_MSBGL0150_Prnt01() {
		MSBGP_NotApplSrch_MC.MS_MSBGL0150_Prnt01Caller<MSBGP_NotApplSrch, MS_MSBGL0150_Prnt01Bridge>
		caller = ((MSBGP_NotApplSrch_MC)this).new MS_MSBGL0150_Prnt01Caller<MSBGP_NotApplSrch, MS_MSBGL0150_Prnt01Bridge>(
					(MSBGP_NotApplSrch)this, new MS_MSBGL0150_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBGL0150_Prnt01]の呼び出し */
	protected void callMS_MSBGL0150_Prnt01() {
		MCCaller caller = createMS_MSBGL0150_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0150.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0150.RsltR> aRsltL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0150.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBG.MSBGP0150.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0150.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0150.CndR createCndR() {
		return mcframe.clientMSBG.MSBGP0150.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBG.MSBGP0150.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0150.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBG.MSBGP0150.RsltR createRsltR() {
		return mcframe.clientMSBG.MSBGP0150.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0150.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0150.RsltR.class);
	}

	/**
	 * RsltTableを初期化します。
	 */
	protected void createRsltTable(){
		if(RsltTable == null){
			RsltTable = beansFactory.createTable2("Rslt.table");
		}
	}

	/**
	 * 項目コピーによってaBtnRを設定します。
	 *
	 * aBtnRのインスタンスは変更されません。
	 *
	 * @param row BtnR
	 */
	public void setBtnR(mcframe.clientMSBG.MSBGP0150.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBG.MSBGP0150.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBG.MSBGP0150.BtnR createBtnR() {
		return mcframe.clientMSBG.MSBGP0150.BtnR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
		if(!MCCollectionUtil.contains(ret, getBtnR())) ret.add(getBtnR());
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
		if(aCnt == getRsltL()) return "Rslt";
		if(aCnt == getBtnR()) return "Btn";
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
		if(bId.equals("Rslt")) return getRsltL();
		if(bId.equals("Btn")) return getBtnR();
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(RcvIfTypPanel);
		ret.add(RcvPrntPanel);
		ret.add(FbTgtPanel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(RcstCndPanel);
		ret.add(BcstCndPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_NotApplSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBGP_NotApplSrch_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aBtnR = createBtnR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBGP_NotApplSrch_MC.jbCreateScreenOpe((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbCreateTop((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbCreateFold((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbCreateTab1((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbCreateRcvIfTyp((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbCreateRcvPrnt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbCreateFbTgt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbCreateTab2((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbCreateTab3((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbCreateRcstCnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbCreateBcstCnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbCreateCnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbCreateCtrl((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbCreateRPnl((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbCreateRslt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbCreateBtn((MSBGP_NotApplSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBGP_NotApplSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBGP_NotApplSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBGP_NotApplSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBGP_NotApplSrch p) {
	}

	/**
	 * [RcvIfTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRcvIfTyp(MSBGP_NotApplSrch p) {
	}

	/**
	 * [RcvPrnt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRcvPrnt(MSBGP_NotApplSrch p) {
	}

	/**
	 * [FbTgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFbTgt(MSBGP_NotApplSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBGP_NotApplSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBGP_NotApplSrch p) {
	}

	/**
	 * [RcstCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRcstCnd(MSBGP_NotApplSrch p) {
	}

	/**
	 * [BcstCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBcstCnd(MSBGP_NotApplSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBGP_NotApplSrch p) {
		p.Cnd_rcv_grp_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().rcv_grp());
		p.Cnd_rcv_grp_PPanel.setName("Cnd.rcv_grp");
		p.Cnd_rcv_grp_lab1 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_rcv_grp_lab1.addAliasName("Cnd.rcv_grp_lab1", p);
		p.Cnd_rcv_grp_flg1 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_rcv_grp_flg1.addAliasName("Cnd.rcv_grp_flg1", p);
		p.Cnd_rcv_grp_cd1 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_rcv_grp_cd1.addAliasName("Cnd.rcv_grp_cd1", p);
		p.Cnd_rcv_grp_nm1 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_rcv_grp_nm1.addAliasName("Cnd.rcv_grp_nm1", p);
		p.Cnd_rcv_grp_lab2 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_rcv_grp_lab2.addAliasName("Cnd.rcv_grp_lab2", p);
		p.Cnd_rcv_grp_flg2 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_rcv_grp_flg2.addAliasName("Cnd.rcv_grp_flg2", p);
		p.Cnd_rcv_grp_cd2 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_rcv_grp_cd2.addAliasName("Cnd.rcv_grp_cd2", p);
		p.Cnd_rcv_grp_nm2 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_rcv_grp_nm2.addAliasName("Cnd.rcv_grp_nm2", p);
		p.Cnd_rcv_grp_lab3 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_rcv_grp_lab3.addAliasName("Cnd.rcv_grp_lab3", p);
		p.Cnd_rcv_grp_flg3 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_rcv_grp_flg3.addAliasName("Cnd.rcv_grp_flg3", p);
		p.Cnd_rcv_grp_cd3 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_rcv_grp_cd3.addAliasName("Cnd.rcv_grp_cd3", p);
		p.Cnd_rcv_grp_nm3 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_rcv_grp_nm3.addAliasName("Cnd.rcv_grp_nm3", p);
		p.Cnd_rcv_grp_lab4 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_rcv_grp_lab4.addAliasName("Cnd.rcv_grp_lab4", p);
		p.Cnd_rcv_grp_flg4 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_rcv_grp_flg4.addAliasName("Cnd.rcv_grp_flg4", p);
		p.Cnd_rcv_grp_cd4 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_rcv_grp_cd4.addAliasName("Cnd.rcv_grp_cd4", p);
		p.Cnd_rcv_grp_nm4 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_rcv_grp_nm4.addAliasName("Cnd.rcv_grp_nm4", p);
		p.Cnd_rcv_grp_lab5 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_rcv_grp_lab5.addAliasName("Cnd.rcv_grp_lab5", p);
		p.Cnd_rcv_grp_flg5 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_rcv_grp_flg5.addAliasName("Cnd.rcv_grp_flg5", p);
		p.Cnd_rcv_grp_cd5 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_rcv_grp_cd5.addAliasName("Cnd.rcv_grp_cd5", p);
		p.Cnd_rcv_grp_nm5 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_rcv_grp_nm5.addAliasName("Cnd.rcv_grp_nm5", p);
		p.Cnd_rcv_grp_lab6 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_rcv_grp_lab6.addAliasName("Cnd.rcv_grp_lab6", p);
		p.Cnd_rcv_grp_flg6 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_rcv_grp_flg6.addAliasName("Cnd.rcv_grp_flg6", p);
		p.Cnd_rcv_grp_cd6 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_rcv_grp_cd6.addAliasName("Cnd.rcv_grp_cd6", p);
		p.Cnd_rcv_grp_nm6 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_rcv_grp_nm6.addAliasName("Cnd.rcv_grp_nm6", p);
		p.Cnd_rcv_grp_lab7 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_rcv_grp_lab7.addAliasName("Cnd.rcv_grp_lab7", p);
		p.Cnd_rcv_grp_flg7 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_rcv_grp_flg7.addAliasName("Cnd.rcv_grp_flg7", p);
		p.Cnd_rcv_grp_cd7 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_rcv_grp_cd7.addAliasName("Cnd.rcv_grp_cd7", p);
		p.Cnd_rcv_grp_nm7 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_rcv_grp_nm7.addAliasName("Cnd.rcv_grp_nm7", p);
		p.Cnd_rcv_grp_lab8 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_rcv_grp_lab8.addAliasName("Cnd.rcv_grp_lab8", p);
		p.Cnd_rcv_grp_flg8 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_rcv_grp_flg8.addAliasName("Cnd.rcv_grp_flg8", p);
		p.Cnd_rcv_grp_cd8 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_rcv_grp_cd8.addAliasName("Cnd.rcv_grp_cd8", p);
		p.Cnd_rcv_grp_nm8 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_rcv_grp_nm8.addAliasName("Cnd.rcv_grp_nm8", p);
		p.Cnd_rcv_grp_lab9 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_rcv_grp_lab9.addAliasName("Cnd.rcv_grp_lab9", p);
		p.Cnd_rcv_grp_flg9 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_rcv_grp_flg9.addAliasName("Cnd.rcv_grp_flg9", p);
		p.Cnd_rcv_grp_cd9 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_rcv_grp_cd9.addAliasName("Cnd.rcv_grp_cd9", p);
		p.Cnd_rcv_grp_nm9 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_rcv_grp_nm9.addAliasName("Cnd.rcv_grp_nm9", p);
		p.Cnd_rcv_grp_lab10 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_rcv_grp_lab10.addAliasName("Cnd.rcv_grp_lab10", p);
		p.Cnd_rcv_grp_flg10 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_rcv_grp_flg10.addAliasName("Cnd.rcv_grp_flg10", p);
		p.Cnd_rcv_grp_cd10 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_rcv_grp_cd10.addAliasName("Cnd.rcv_grp_cd10", p);
		p.Cnd_rcv_grp_nm10 = p.Cnd_rcv_grp_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_rcv_grp_nm10.addAliasName("Cnd.rcv_grp_nm10", p);
		p.Cnd_bill_grp_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().bill_grp());
		p.Cnd_bill_grp_PPanel.setName("Cnd.bill_grp");
		p.Cnd_bill_grp_lab1 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_bill_grp_lab1.addAliasName("Cnd.bill_grp_lab1", p);
		p.Cnd_bill_grp_flg1 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_bill_grp_flg1.addAliasName("Cnd.bill_grp_flg1", p);
		p.Cnd_bill_grp_cd1 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_bill_grp_cd1.addAliasName("Cnd.bill_grp_cd1", p);
		p.Cnd_bill_grp_nm1 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_bill_grp_nm1.addAliasName("Cnd.bill_grp_nm1", p);
		p.Cnd_bill_grp_lab2 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_bill_grp_lab2.addAliasName("Cnd.bill_grp_lab2", p);
		p.Cnd_bill_grp_flg2 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_bill_grp_flg2.addAliasName("Cnd.bill_grp_flg2", p);
		p.Cnd_bill_grp_cd2 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_bill_grp_cd2.addAliasName("Cnd.bill_grp_cd2", p);
		p.Cnd_bill_grp_nm2 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_bill_grp_nm2.addAliasName("Cnd.bill_grp_nm2", p);
		p.Cnd_bill_grp_lab3 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_bill_grp_lab3.addAliasName("Cnd.bill_grp_lab3", p);
		p.Cnd_bill_grp_flg3 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_bill_grp_flg3.addAliasName("Cnd.bill_grp_flg3", p);
		p.Cnd_bill_grp_cd3 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_bill_grp_cd3.addAliasName("Cnd.bill_grp_cd3", p);
		p.Cnd_bill_grp_nm3 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_bill_grp_nm3.addAliasName("Cnd.bill_grp_nm3", p);
		p.Cnd_bill_grp_lab4 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_bill_grp_lab4.addAliasName("Cnd.bill_grp_lab4", p);
		p.Cnd_bill_grp_flg4 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_bill_grp_flg4.addAliasName("Cnd.bill_grp_flg4", p);
		p.Cnd_bill_grp_cd4 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_bill_grp_cd4.addAliasName("Cnd.bill_grp_cd4", p);
		p.Cnd_bill_grp_nm4 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_bill_grp_nm4.addAliasName("Cnd.bill_grp_nm4", p);
		p.Cnd_bill_grp_lab5 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_bill_grp_lab5.addAliasName("Cnd.bill_grp_lab5", p);
		p.Cnd_bill_grp_flg5 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_bill_grp_flg5.addAliasName("Cnd.bill_grp_flg5", p);
		p.Cnd_bill_grp_cd5 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_bill_grp_cd5.addAliasName("Cnd.bill_grp_cd5", p);
		p.Cnd_bill_grp_nm5 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_bill_grp_nm5.addAliasName("Cnd.bill_grp_nm5", p);
		p.Cnd_bill_grp_lab6 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_bill_grp_lab6.addAliasName("Cnd.bill_grp_lab6", p);
		p.Cnd_bill_grp_flg6 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_bill_grp_flg6.addAliasName("Cnd.bill_grp_flg6", p);
		p.Cnd_bill_grp_cd6 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_bill_grp_cd6.addAliasName("Cnd.bill_grp_cd6", p);
		p.Cnd_bill_grp_nm6 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_bill_grp_nm6.addAliasName("Cnd.bill_grp_nm6", p);
		p.Cnd_bill_grp_lab7 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_bill_grp_lab7.addAliasName("Cnd.bill_grp_lab7", p);
		p.Cnd_bill_grp_flg7 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_bill_grp_flg7.addAliasName("Cnd.bill_grp_flg7", p);
		p.Cnd_bill_grp_cd7 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_bill_grp_cd7.addAliasName("Cnd.bill_grp_cd7", p);
		p.Cnd_bill_grp_nm7 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_bill_grp_nm7.addAliasName("Cnd.bill_grp_nm7", p);
		p.Cnd_bill_grp_lab8 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_bill_grp_lab8.addAliasName("Cnd.bill_grp_lab8", p);
		p.Cnd_bill_grp_flg8 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_bill_grp_flg8.addAliasName("Cnd.bill_grp_flg8", p);
		p.Cnd_bill_grp_cd8 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_bill_grp_cd8.addAliasName("Cnd.bill_grp_cd8", p);
		p.Cnd_bill_grp_nm8 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_bill_grp_nm8.addAliasName("Cnd.bill_grp_nm8", p);
		p.Cnd_bill_grp_lab9 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_bill_grp_lab9.addAliasName("Cnd.bill_grp_lab9", p);
		p.Cnd_bill_grp_flg9 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_bill_grp_flg9.addAliasName("Cnd.bill_grp_flg9", p);
		p.Cnd_bill_grp_cd9 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_bill_grp_cd9.addAliasName("Cnd.bill_grp_cd9", p);
		p.Cnd_bill_grp_nm9 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_bill_grp_nm9.addAliasName("Cnd.bill_grp_nm9", p);
		p.Cnd_bill_grp_lab10 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_bill_grp_lab10.addAliasName("Cnd.bill_grp_lab10", p);
		p.Cnd_bill_grp_flg10 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_bill_grp_flg10.addAliasName("Cnd.bill_grp_flg10", p);
		p.Cnd_bill_grp_cd10 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_bill_grp_cd10.addAliasName("Cnd.bill_grp_cd10", p);
		p.Cnd_bill_grp_nm10 = p.Cnd_bill_grp_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_bill_grp_nm10.addAliasName("Cnd.bill_grp_nm10", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBGP_NotApplSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBGP_NotApplSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBGP_NotApplSrch p) {
		p.Rslt_rcv_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0150.RsltR.$rcv_amt_p);
		p.Rslt_rcv_amt_p_PPanel.setName("Rslt.rcv_amt_p");
		p.columnRslt_rcv_amt = p.Rslt_rcv_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_rcv_amt.addAliasName("Rslt.rcv_amt", p);
		p.Rslt_roc_bal_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0150.RsltR.$roc_bal_p);
		p.Rslt_roc_bal_p_PPanel.setName("Rslt.roc_bal_p");
		p.columnRslt_not_proc_bal = p.Rslt_roc_bal_p_PPanel.columnAmt_amt;
		p.columnRslt_not_proc_bal.addAliasName("Rslt.not_proc_bal", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBG.MSBGP0150.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
		p.Rslt_rcv_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBG.MSBGP0150.RsltR.$rcv_grp_p);
		p.Rslt_rcv_grp_p_PPanel.setName("Rslt.rcv_grp_p");
		p.columnRslt_rcv_grp_cd1 = p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_rcv_grp_cd1.addAliasName("Rslt.rcv_grp_cd1", p);
		p.columnRslt_rcv_grp_nm1 = p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_rcv_grp_nm1.addAliasName("Rslt.rcv_grp_nm1", p);
		p.columnRslt_rcv_grp_cd2 = p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_rcv_grp_cd2.addAliasName("Rslt.rcv_grp_cd2", p);
		p.columnRslt_rcv_grp_nm2 = p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_rcv_grp_nm2.addAliasName("Rslt.rcv_grp_nm2", p);
		p.columnRslt_rcv_grp_cd3 = p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_rcv_grp_cd3.addAliasName("Rslt.rcv_grp_cd3", p);
		p.columnRslt_rcv_grp_nm3 = p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_rcv_grp_nm3.addAliasName("Rslt.rcv_grp_nm3", p);
		p.columnRslt_rcv_grp_cd4 = p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_rcv_grp_cd4.addAliasName("Rslt.rcv_grp_cd4", p);
		p.columnRslt_rcv_grp_nm4 = p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_rcv_grp_nm4.addAliasName("Rslt.rcv_grp_nm4", p);
		p.columnRslt_rcv_grp_cd5 = p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_rcv_grp_cd5.addAliasName("Rslt.rcv_grp_cd5", p);
		p.columnRslt_rcv_grp_nm5 = p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_rcv_grp_nm5.addAliasName("Rslt.rcv_grp_nm5", p);
		p.columnRslt_rcv_grp_cd6 = p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_rcv_grp_cd6.addAliasName("Rslt.rcv_grp_cd6", p);
		p.columnRslt_rcv_grp_nm6 = p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_rcv_grp_nm6.addAliasName("Rslt.rcv_grp_nm6", p);
		p.columnRslt_rcv_grp_cd7 = p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_rcv_grp_cd7.addAliasName("Rslt.rcv_grp_cd7", p);
		p.columnRslt_rcv_grp_nm7 = p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_rcv_grp_nm7.addAliasName("Rslt.rcv_grp_nm7", p);
		p.columnRslt_rcv_grp_cd8 = p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_rcv_grp_cd8.addAliasName("Rslt.rcv_grp_cd8", p);
		p.columnRslt_rcv_grp_nm8 = p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_rcv_grp_nm8.addAliasName("Rslt.rcv_grp_nm8", p);
		p.columnRslt_rcv_grp_cd9 = p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_rcv_grp_cd9.addAliasName("Rslt.rcv_grp_cd9", p);
		p.columnRslt_rcv_grp_nm9 = p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_rcv_grp_nm9.addAliasName("Rslt.rcv_grp_nm9", p);
		p.columnRslt_rcv_grp_cd10 = p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_rcv_grp_cd10.addAliasName("Rslt.rcv_grp_cd10", p);
		p.columnRslt_rcv_grp_nm10 = p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_rcv_grp_nm10.addAliasName("Rslt.rcv_grp_nm10", p);
		p.Rslt_bill_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBG.MSBGP0150.RsltR.$bill_grp_p);
		p.Rslt_bill_grp_p_PPanel.setName("Rslt.bill_grp_p");
		p.columnRslt_bill_grp_cd1 = p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_bill_grp_cd1.addAliasName("Rslt.bill_grp_cd1", p);
		p.columnRslt_bill_grp_nm1 = p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_bill_grp_nm1.addAliasName("Rslt.bill_grp_nm1", p);
		p.columnRslt_bill_grp_cd2 = p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_bill_grp_cd2.addAliasName("Rslt.bill_grp_cd2", p);
		p.columnRslt_bill_grp_nm2 = p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_bill_grp_nm2.addAliasName("Rslt.bill_grp_nm2", p);
		p.columnRslt_bill_grp_cd3 = p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_bill_grp_cd3.addAliasName("Rslt.bill_grp_cd3", p);
		p.columnRslt_bill_grp_nm3 = p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_bill_grp_nm3.addAliasName("Rslt.bill_grp_nm3", p);
		p.columnRslt_bill_grp_cd4 = p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_bill_grp_cd4.addAliasName("Rslt.bill_grp_cd4", p);
		p.columnRslt_bill_grp_nm4 = p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_bill_grp_nm4.addAliasName("Rslt.bill_grp_nm4", p);
		p.columnRslt_bill_grp_cd5 = p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_bill_grp_cd5.addAliasName("Rslt.bill_grp_cd5", p);
		p.columnRslt_bill_grp_nm5 = p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_bill_grp_nm5.addAliasName("Rslt.bill_grp_nm5", p);
		p.columnRslt_bill_grp_cd6 = p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_bill_grp_cd6.addAliasName("Rslt.bill_grp_cd6", p);
		p.columnRslt_bill_grp_nm6 = p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_bill_grp_nm6.addAliasName("Rslt.bill_grp_nm6", p);
		p.columnRslt_bill_grp_cd7 = p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_bill_grp_cd7.addAliasName("Rslt.bill_grp_cd7", p);
		p.columnRslt_bill_grp_nm7 = p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_bill_grp_nm7.addAliasName("Rslt.bill_grp_nm7", p);
		p.columnRslt_bill_grp_cd8 = p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_bill_grp_cd8.addAliasName("Rslt.bill_grp_cd8", p);
		p.columnRslt_bill_grp_nm8 = p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_bill_grp_nm8.addAliasName("Rslt.bill_grp_nm8", p);
		p.columnRslt_bill_grp_cd9 = p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_bill_grp_cd9.addAliasName("Rslt.bill_grp_cd9", p);
		p.columnRslt_bill_grp_nm9 = p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_bill_grp_nm9.addAliasName("Rslt.bill_grp_nm9", p);
		p.columnRslt_bill_grp_cd10 = p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_bill_grp_cd10.addAliasName("Rslt.bill_grp_cd10", p);
		p.columnRslt_bill_grp_nm10 = p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_bill_grp_nm10.addAliasName("Rslt.bill_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBGP_NotApplSrch p) {
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

	
	/** [Cnd_rcst_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rcst_cd_p = null;

	/**
	 * [Cnd_rcst_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rcst_cd_ListPutter() {
		if (Cnd_rcst_cd_p == null) {
			Cnd_rcst_cd_p = createCnd_rcst_cd_ListPutter(Cnd_rcst_cd, "rcst_cd", "rcst_nm");

		}
		return Cnd_rcst_cd_p;
	}
	
	
	/** [Cnd_bcst_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bcst_cd_p = null;

	/**
	 * [Cnd_bcst_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bcst_cd_ListPutter() {
		if (Cnd_bcst_cd_p == null) {
			Cnd_bcst_cd_p = createCnd_bcst_cd_ListPutter(Cnd_bcst_cd, "bcst_cd", "bcst_nm");

		}
		return Cnd_bcst_cd_p;
	}
	
	
	/** [Cnd_rcv_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rcv_usr_cd_p = null;

	/**
	 * [Cnd_rcv_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rcv_usr_cd_ListPutter() {
		if (Cnd_rcv_usr_cd_p == null) {
			Cnd_rcv_usr_cd_p = createCnd_rcv_usr_cd_ListPutter(Cnd_rcv_usr_cd, "rcv_usr_cd", "rcv_usr_nm");

		}
		return Cnd_rcv_usr_cd_p;
	}
	
	
	/** [Cnd_rcv_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rcv_dpt_cd_p = null;

	/**
	 * [Cnd_rcv_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rcv_dpt_cd_ListPutter() {
		if (Cnd_rcv_dpt_cd_p == null) {
			Cnd_rcv_dpt_cd_p = createCnd_rcv_dpt_cd_ListPutter(Cnd_rcv_dpt_cd, "rcv_dpt_cd", "rcv_dpt_nm");

		}
		return Cnd_rcv_dpt_cd_p;
	}
	
	
	/** [Cnd_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_wg_cd_p = null;

	/**
	 * [Cnd_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wg_cd_ListPutter() {
		if (Cnd_wg_cd_p == null) {
			Cnd_wg_cd_p = createCnd_wg_cd_ListPutter(Cnd_wg_cd, "wg_cd", "wg_nm");

		}
		return Cnd_wg_cd_p;
	}
	
	
	/** [Cnd_rcv_mtd_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rcv_mtd_cd_p = null;

	/**
	 * [Cnd_rcv_mtd_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rcv_mtd_cd_ListPutter() {
		if (Cnd_rcv_mtd_cd_p == null) {
			Cnd_rcv_mtd_cd_p = createCnd_rcv_mtd_cd_ListPutter(Cnd_rcv_mtd_cd, "rcv_mtd_cd", "rcv_mtd_nm");

		}
		return Cnd_rcv_mtd_cd_p;
	}
	
	
	/** [Cnd_bank_ac_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bank_ac_cd_p = null;

	/**
	 * [Cnd_bank_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bank_ac_cd_ListPutter() {
		if (Cnd_bank_ac_cd_p == null) {
			Cnd_bank_ac_cd_p = createCnd_bank_ac_cd_ListPutter(Cnd_bank_ac_cd, "bank_ac_cd", "bank_ac_nm");

		}
		return Cnd_bank_ac_cd_p;
	}
	
	
	/** [Cnd_cur_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cur_cd_p = null;

	/**
	 * [Cnd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cur_cd_ListPutter() {
		if (Cnd_cur_cd_p == null) {
			Cnd_cur_cd_p = createCnd_cur_cd_ListPutter(Cnd_cur_cd, "cur_cd", "cur_nm");

		}
		return Cnd_cur_cd_p;
	}
	
	
	/** [Cnd_bill_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bill_dpt_cd_p = null;

	/**
	 * [Cnd_bill_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bill_dpt_cd_ListPutter() {
		if (Cnd_bill_dpt_cd_p == null) {
			Cnd_bill_dpt_cd_p = createCnd_bill_dpt_cd_ListPutter(Cnd_bill_dpt_cd, "bill_dpt_cd", "bill_dpt_nm");

		}
		return Cnd_bill_dpt_cd_p;
	}
	
	
	/** [Cnd_auto_appl_sts_typ_ListPutter]の定義 */
	private MCListPutter Cnd_auto_appl_sts_typ_p = null;

	/**
	 * [Cnd_auto_appl_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_auto_appl_sts_typ_ListPutter() {
		if (Cnd_auto_appl_sts_typ_p == null) {
			Cnd_auto_appl_sts_typ_p = createCnd_auto_appl_sts_typ_ListPutter(Cnd_auto_appl_sts_typ, "auto_appl_sts_typ", "auto_appl_sts_typ_nm");

		}
		return Cnd_auto_appl_sts_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_NotApplSrch create(){
		MSBGP_NotApplSrch p = new MSBGP_NotApplSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_NotApplSrch create(String name){
		MSBGP_NotApplSrch p = new MSBGP_NotApplSrch(name);
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
		MSBGP_NotApplSrch_MC.jbfInitScreenOpe((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbfInitTop((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbfInitFold((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbfInitTab1((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbfInitRcvIfTyp((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbfInitRcvPrnt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbfInitFbTgt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbfInitTab2((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbfInitTab3((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbfInitRcstCnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbfInitBcstCnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbfInitCnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbfInitCtrl((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbfInitRPnl((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbfInitRslt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbfInitBtn((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbInitScreenOpe((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbInitTop((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbInitFold((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbInitTab1((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbInitRcvIfTyp((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbInitRcvPrnt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbInitFbTgt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbInitTab2((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbInitTab3((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbInitRcstCnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbInitBcstCnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbInitCnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbInitCtrl((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbInitRPnl((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbInitRslt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.jbInitBtn((MSBGP_NotApplSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldTab = p.beansFactory.createTabbedPane("Fold.tab");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [RcvIfTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRcvIfTyp(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.RcvIfTypPanel = p.beansFactory.createPanel("RcvIfTyp");
		p.RcvIfTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [RcvPrnt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRcvPrnt(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.RcvPrntPanel = p.beansFactory.createPanel("RcvPrnt");
		p.RcvPrntTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [FbTgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFbTgt(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.FbTgtPanel = p.beansFactory.createPanel("FbTgt");
		p.FbTgtTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [RcstCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRcstCnd(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.RcstCndPanel = p.beansFactory.createPanel("RcstCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [BcstCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBcstCnd(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.BcstCndPanel = p.beansFactory.createPanel("BcstCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_PRNT = p.beansFactory.createRadioButton("Cnd.ope_PRNT");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_rcv_flg = p.beansFactory.createCheckBox("Cnd.rcv_flg");
		p.Cnd_susp_flg = p.beansFactory.createCheckBox("Cnd.susp_flg");
		p.Cnd_adv_flg = p.beansFactory.createCheckBox("Cnd.adv_flg");
		p.Cnd_ap_flg = p.beansFactory.createCheckBox("Cnd.ap_flg");
		p.Cnd_not_prnt_flg = p.beansFactory.createCheckBox("Cnd.not_prnt_flg");
		p.Cnd_prnt_flg = p.beansFactory.createCheckBox("Cnd.prnt_flg");
		p.Cnd_fb_t_flg = p.beansFactory.createCheckBox("Cnd.fb_t_flg");
		p.Cnd_fb_f_flg = p.beansFactory.createCheckBox("Cnd.fb_f_flg");
		p.Cnd_rcv_dt_fr_Label = p.beansFactory.createLabel("Cnd.rcv_dt_fr_Label");
		p.Cnd_rcv_dt_fr = p.beansFactory.createDateField("Cnd.rcv_dt_fr");
		p.Cnd_rcv_dt_fr.setLabel(p.Cnd_rcv_dt_fr_Label);
		p.Cnd_rcv_dt_to_Label = p.beansFactory.createLabel("Cnd.rcv_dt_to_Label");
		p.Cnd_rcv_dt_to = p.beansFactory.createDateField("Cnd.rcv_dt_to");
		p.Cnd_rcv_dt_to.setLabel(p.Cnd_rcv_dt_to_Label);
		p.Cnd_rcst_cd_Label = p.beansFactory.createLabel("Cnd.rcst_cd_Label");
		p.Cnd_rcst_cd = p.beansFactory.createTextField("Cnd.rcst_cd");
		p.Cnd_rcst_cd.setLabel(p.Cnd_rcst_cd_Label);
		p.Cnd_rcst_nm = p.beansFactory.createTextField("Cnd.rcst_nm");
		p.Cnd_bcst_cd_Label = p.beansFactory.createLabel("Cnd.bcst_cd_Label");
		p.Cnd_bcst_cd = p.beansFactory.createTextField("Cnd.bcst_cd");
		p.Cnd_bcst_cd.setLabel(p.Cnd_bcst_cd_Label);
		p.Cnd_bcst_nm = p.beansFactory.createTextField("Cnd.bcst_nm");
		p.Cnd_rcv_usr_cd_Label = p.beansFactory.createLabel("Cnd.rcv_usr_cd_Label");
		p.Cnd_rcv_usr_cd = p.beansFactory.createTextField("Cnd.rcv_usr_cd");
		p.Cnd_rcv_usr_cd.setLabel(p.Cnd_rcv_usr_cd_Label);
		p.Cnd_rcv_usr_nm = p.beansFactory.createTextField("Cnd.rcv_usr_nm");
		p.Cnd_rcv_dpt_cd_Label = p.beansFactory.createLabel("Cnd.rcv_dpt_cd_Label");
		p.Cnd_rcv_dpt_cd = p.beansFactory.createTextField("Cnd.rcv_dpt_cd");
		p.Cnd_rcv_dpt_cd.setLabel(p.Cnd_rcv_dpt_cd_Label);
		p.Cnd_rcv_dpt_nm = p.beansFactory.createTextField("Cnd.rcv_dpt_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_rcv_rmrks_Label = p.beansFactory.createLabel("Cnd.rcv_rmrks_Label");
		p.Cnd_rcv_rmrks = p.beansFactory.createTextField("Cnd.rcv_rmrks");
		p.Cnd_rcv_rmrks.setLabel(p.Cnd_rcv_rmrks_Label);
		p.Cnd_rcv_no_Label = p.beansFactory.createLabel("Cnd.rcv_no_Label");
		p.Cnd_rcv_no = p.beansFactory.createTextField("Cnd.rcv_no");
		p.Cnd_rcv_no.setLabel(p.Cnd_rcv_no_Label);
		p.Cnd_note_no_Label = p.beansFactory.createLabel("Cnd.note_no_Label");
		p.Cnd_note_no = p.beansFactory.createTextField("Cnd.note_no");
		p.Cnd_note_no.setLabel(p.Cnd_note_no_Label);
		p.Cnd_pay_act_no_Label = p.beansFactory.createLabel("Cnd.pay_act_no_Label");
		p.Cnd_pay_act_no = p.beansFactory.createTextField("Cnd.pay_act_no");
		p.Cnd_pay_act_no.setLabel(p.Cnd_pay_act_no_Label);
		p.Cnd_rcv_mtd_cd_Label = p.beansFactory.createLabel("Cnd.rcv_mtd_cd_Label");
		p.Cnd_rcv_mtd_cd = p.beansFactory.createTextComboBox("Cnd.rcv_mtd_cd");
		p.Cnd_rcv_mtd_cd.setLabel(p.Cnd_rcv_mtd_cd_Label);
		p.Cnd_rcv_mtd_nm = p.beansFactory.createTextField("Cnd.rcv_mtd_nm");
		p.Cnd_bank_ac_cd_Label = p.beansFactory.createLabel("Cnd.bank_ac_cd_Label");
		p.Cnd_bank_ac_cd = p.beansFactory.createTextComboBox("Cnd.bank_ac_cd");
		p.Cnd_bank_ac_cd.setLabel(p.Cnd_bank_ac_cd_Label);
		p.Cnd_bank_ac_nm = p.beansFactory.createTextField("Cnd.bank_ac_nm");
		p.Cnd_cur_cd_Label = p.beansFactory.createLabel("Cnd.cur_cd_Label");
		p.Cnd_cur_cd = p.beansFactory.createTextComboBox("Cnd.cur_cd");
		p.Cnd_cur_cd.setLabel(p.Cnd_cur_cd_Label);
		p.Cnd_cur_nm = p.beansFactory.createTextField("Cnd.cur_nm");
		p.Cnd_bill_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bill_dpt_cd_Label");
		p.Cnd_bill_dpt_cd = p.beansFactory.createTextField("Cnd.bill_dpt_cd");
		p.Cnd_bill_dpt_cd.setLabel(p.Cnd_bill_dpt_cd_Label);
		p.Cnd_bill_dpt_nm = p.beansFactory.createTextField("Cnd.bill_dpt_nm");
		p.Cnd_auto_appl_sts_typ_Label = p.beansFactory.createLabel("Cnd.auto_appl_sts_typ_Label");
		p.Cnd_auto_appl_sts_typ = p.beansFactory.createTextComboBox("Cnd.auto_appl_sts_typ");
		p.Cnd_auto_appl_sts_typ.setLabel(p.Cnd_auto_appl_sts_typ_Label);
		p.Cnd_auto_appl_sts_typ_nm = p.beansFactory.createTextField("Cnd.auto_appl_sts_typ_nm");
		p.Cnd_if_rcv_no = p.beansFactory.createNumberField("Cnd.if_rcv_no");
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_proc_flg = p.beansFactory.createCheckBox("Cnd.proc_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_rcv_dat_typ = p.beansFactory.createTableColumn("Rslt.rcv_dat_typ", MCColumnType.TEXT);
		p.columnRslt_rcv_dat_typ_nm = p.beansFactory.createTableColumn("Rslt.rcv_dat_typ_nm", MCColumnType.TEXT);
		p.columnRslt_rcv_dpt_cd = p.beansFactory.createTableColumn("Rslt.rcv_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_rcv_dpt_nm = p.beansFactory.createTableColumn("Rslt.rcv_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_rcv_usr_cd = p.beansFactory.createTableColumn("Rslt.rcv_usr_cd", MCColumnType.TEXT);
		p.columnRslt_rcv_usr_nm = p.beansFactory.createTableColumn("Rslt.rcv_usr_nm", MCColumnType.TEXT);
		p.columnRslt_rcv_no = p.beansFactory.createTableColumn("Rslt.rcv_no", MCColumnType.TEXT);
		p.columnRslt_rcv_dt = p.beansFactory.createTableColumn("Rslt.rcv_dt", MCColumnType.DATE);
		p.columnRslt_rcst_cd = p.beansFactory.createTableColumn("Rslt.rcst_cd", MCColumnType.TEXT);
		p.columnRslt_rcst_nm = p.beansFactory.createTableColumn("Rslt.rcst_nm", MCColumnType.TEXT);
		p.columnRslt_bcst_cd = p.beansFactory.createTableColumn("Rslt.bcst_cd", MCColumnType.TEXT);
		p.columnRslt_bcst_nm = p.beansFactory.createTableColumn("Rslt.bcst_nm", MCColumnType.TEXT);
		p.columnRslt_bill_dpt_cd = p.beansFactory.createTableColumn("Rslt.bill_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_bill_dpt_nm = p.beansFactory.createTableColumn("Rslt.bill_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_xfr_psn = p.beansFactory.createTableColumn("Rslt.xfr_psn", MCColumnType.TEXT);
		p.columnRslt_cur_cd = p.beansFactory.createTableColumn("Rslt.cur_cd", MCColumnType.TEXT);
		p.columnRslt_cur_nm = p.beansFactory.createTableColumn("Rslt.cur_nm", MCColumnType.TEXT);
		p.columnRslt_amt_dec_place = p.beansFactory.createTableColumn("Rslt.amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_bank_ac_cd = p.beansFactory.createTableColumn("Rslt.bank_ac_cd", MCColumnType.TEXT);
		p.columnRslt_bank_ac_nm = p.beansFactory.createTableColumn("Rslt.bank_ac_nm", MCColumnType.TEXT);
		p.columnRslt_bank_ac_no = p.beansFactory.createTableColumn("Rslt.bank_ac_no", MCColumnType.TEXT);
		p.columnRslt_rcv_mtd_cd = p.beansFactory.createTableColumn("Rslt.rcv_mtd_cd", MCColumnType.TEXT);
		p.columnRslt_rcv_mtd_nm = p.beansFactory.createTableColumn("Rslt.rcv_mtd_nm", MCColumnType.TEXT);
		p.columnRslt_note_no = p.beansFactory.createTableColumn("Rslt.note_no", MCColumnType.TEXT);
		p.columnRslt_auto_appl_sts_typ = p.beansFactory.createTableColumn("Rslt.auto_appl_sts_typ", MCColumnType.TEXT);
		p.columnRslt_auto_appl_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.auto_appl_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_asppl_cd = p.beansFactory.createTableColumn("Rslt.asppl_cd", MCColumnType.TEXT);
		p.columnRslt_asppl_nm = p.beansFactory.createTableColumn("Rslt.asppl_nm", MCColumnType.TEXT);
		p.columnRslt_bsppl_cd = p.beansFactory.createTableColumn("Rslt.bsppl_cd", MCColumnType.TEXT);
		p.columnRslt_bsppl_nm = p.beansFactory.createTableColumn("Rslt.bsppl_nm", MCColumnType.TEXT);
		p.columnRslt_acst_cd = p.beansFactory.createTableColumn("Rslt.acst_cd", MCColumnType.TEXT);
		p.columnRslt_acst_nm = p.beansFactory.createTableColumn("Rslt.acst_nm", MCColumnType.TEXT);
		p.columnRslt_pay_act_no = p.beansFactory.createTableColumn("Rslt.pay_act_no", MCColumnType.TEXT);
		p.columnRslt_rcv_rmrks = p.beansFactory.createTableColumn("Rslt.rcv_rmrks", MCColumnType.TEXT);
		p.columnRslt_prnt_flg = p.beansFactory.createTableColumn("Rslt.prnt_flg", MCColumnType.CHECK);
		p.columnRslt_div_flg = p.beansFactory.createTableColumn("Rslt.div_flg", MCColumnType.CHECK);
		p.columnRslt_div_src_rcv_no = p.beansFactory.createTableColumn("Rslt.div_src_rcv_no", MCColumnType.TEXT);
		p.columnRslt_src_rcv_act_no = p.beansFactory.createTableColumn("Rslt.src_rcv_act_no", MCColumnType.TEXT);
		p.columnRslt_if_rcv_no = p.beansFactory.createTableColumn("Rslt.if_rcv_no", MCColumnType.NUMBER);
		p.columnRslt_fb_flg = p.beansFactory.createTableColumn("Rslt.fb_flg", MCColumnType.CHECK);
		p.columnRslt_ext_sys_cd = p.beansFactory.createTableColumn("Rslt.ext_sys_cd", MCColumnType.TEXT);
		p.columnRslt_ext_sys_nm = p.beansFactory.createTableColumn("Rslt.ext_sys_nm", MCColumnType.TEXT);
		p.columnRslt_ext_rcv_no = p.beansFactory.createTableColumn("Rslt.ext_rcv_no", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBGP0210 = p.beansFactory.createButton("Btn.open_MSBGP0210", "open");
		p.Btn_open_MSBGP0200 = p.beansFactory.createButton("Btn.open_MSBGP0200", "open");
		p.Btn_open_MSBGP0250 = p.beansFactory.createButton("Btn.open_MSBGP0250", "open");
		p.Btn_open_MSBGP0140 = p.beansFactory.createButton("Btn.open_MSBGP0140", "open");
		p.Btn_open_MSBGP0160 = p.beansFactory.createButton("Btn.open_MSBGP0160", "open");
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_indiv_prnt_flg = p.beansFactory.createCheckBox("Btn.indiv_prnt_flg");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.FoldBasePanel);
		p.FoldBasePanel.add(p.FoldScrollPane);
		p.FoldScrollPane.setBorder(null);
		p.FoldScrollPane.setViewportView(p.FoldPanel);
		p.FoldBasePanel.setLayoutPosition("C");
		p.TopPanel.setLastBeans(p.FoldPanel);
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
		p.CtrlPanel.setNextBeans(p.RPnlPanel);
		p.TopPanel.add(p.RPnlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.add(p.FoldTab);
		p.FoldPanel.setLastBeans(p.FoldTab);
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldTab.add(p.Tab1Panel, "Fold.tab1");
		p.FoldTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.FoldTab.add(p.Tab2Panel, "Fold.tab2");
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.FoldTab.add(p.Tab3Panel, "Fold.tab3");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.RcvIfTypPanel, null);
		p.Tab1Panel.setLastBeans(p.RcvIfTypPanel);
		p.RcvIfTypPanel.setNextBeans(p.RcvPrntPanel);
		p.Tab1Panel.add(p.RcvPrntPanel, null);
		p.RcvPrntPanel.setNextBeans(p.FbTgtPanel);
		p.Tab1Panel.add(p.FbTgtPanel, null);
		p.FbTgtPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [RcvIfTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRcvIfTyp(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.RcvIfTypPanel.setBorder(p.RcvIfTypTitledBorder);
		p.RcvIfTypPanel.setValueCheck(false);
		p.RcvIfTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RcvIfTypPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [RcvPrnt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRcvPrnt(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.RcvPrntPanel.setBorder(p.RcvPrntTitledBorder);
		p.RcvPrntPanel.setValueCheck(false);
		p.RcvPrntPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RcvPrntPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [FbTgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFbTgt(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.FbTgtPanel.setBorder(p.FbTgtTitledBorder);
		p.FbTgtPanel.setValueCheck(false);
		p.FbTgtPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FbTgtPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.RcstCndPanel, null);
		p.Tab2Panel.setLastBeans(p.RcstCndPanel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.BcstCndPanel, null);
		p.Tab3Panel.setLastBeans(p.BcstCndPanel);
	}

	/**
	 * [RcstCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRcstCnd(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.RcstCndPanel.setValueCheck(false);
		p.RcstCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RcstCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [BcstCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBcstCnd(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.BcstCndPanel.setValueCheck(false);
		p.BcstCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BcstCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_PRNT);
		p.ScreenOpePanel.add(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.ope_META);
		p.RcvIfTypPanel.add(p.Cnd_rcv_flg);
		p.RcvIfTypPanel.setLastBeans(p.Cnd_rcv_flg);
		p.Cnd_rcv_flg.setNextBeans(p.Cnd_susp_flg);
		p.Cnd_rcv_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.rcv_flg_META);
		p.RcvIfTypPanel.add(p.Cnd_susp_flg);
		p.Cnd_susp_flg.setNextBeans(p.Cnd_adv_flg);
		p.Cnd_susp_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.susp_flg_META);
		p.RcvIfTypPanel.add(p.Cnd_adv_flg);
		p.Cnd_adv_flg.setNextBeans(p.Cnd_ap_flg);
		p.Cnd_adv_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.adv_flg_META);
		p.RcvIfTypPanel.add(p.Cnd_ap_flg);
		p.Cnd_ap_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.ap_flg_META);
		p.RcvPrntPanel.add(p.Cnd_not_prnt_flg);
		p.RcvPrntPanel.setLastBeans(p.Cnd_not_prnt_flg);
		p.Cnd_not_prnt_flg.setNextBeans(p.Cnd_prnt_flg);
		p.Cnd_not_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.not_prnt_flg_META);
		p.RcvPrntPanel.add(p.Cnd_prnt_flg);
		p.Cnd_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.prnt_flg_META);
		p.FbTgtPanel.add(p.Cnd_fb_t_flg);
		p.FbTgtPanel.setLastBeans(p.Cnd_fb_t_flg);
		p.Cnd_fb_t_flg.setNextBeans(p.Cnd_fb_f_flg);
		p.Cnd_fb_t_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.fb_t_flg_META);
		p.FbTgtPanel.add(p.Cnd_fb_f_flg);
		p.Cnd_fb_f_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.fb_f_flg_META);
		p.CndPanel.add(p.Cnd_rcv_dt_fr_Label);
		p.CndPanel.add(p.Cnd_rcv_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_rcv_dt_fr);
		p.Cnd_rcv_dt_fr.setNextBeans(p.Cnd_rcv_dt_to);
		p.Cnd_rcv_dt_fr.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.rcv_dt_fr_META);
		p.Cnd_rcv_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rcv_dt_to_Label);
		p.CndPanel.add(p.Cnd_rcv_dt_to);
		p.Cnd_rcv_dt_to.setNextBeans(p.Cnd_rcst_cd);
		p.Cnd_rcv_dt_to.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.rcv_dt_to_META);
		p.Cnd_rcv_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rcst_cd_Label);
		p.CndPanel.add(p.Cnd_rcst_cd);
		p.Cnd_rcst_cd.setNextBeans(p.Cnd_rcst_nm);
		p.Cnd_rcst_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.rcst_cd_META);
		p.Cnd_rcst_cd.addLinkBeans(p.Cnd_rcst_nm);
		p.Cnd_rcst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rcst_cd, true);
		p.CndPanel.add(p.Cnd_rcst_nm);
		p.Cnd_rcst_nm.setNextBeans(p.Cnd_bcst_cd);
		p.Cnd_rcst_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.rcst_nm_META);
		p.setPluralValueEnable(p.Cnd_rcst_nm, true);
		p.CndPanel.add(p.Cnd_bcst_cd_Label);
		p.CndPanel.add(p.Cnd_bcst_cd);
		p.Cnd_bcst_cd.setNextBeans(p.Cnd_bcst_nm);
		p.Cnd_bcst_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.bcst_cd_META);
		p.Cnd_bcst_cd.addLinkBeans(p.Cnd_bcst_nm);
		p.Cnd_bcst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bcst_cd, true);
		p.CndPanel.add(p.Cnd_bcst_nm);
		p.Cnd_bcst_nm.setNextBeans(p.Cnd_rcv_usr_cd);
		p.Cnd_bcst_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.bcst_nm_META);
		p.setPluralValueEnable(p.Cnd_bcst_nm, true);
		p.CndPanel.add(p.Cnd_rcv_usr_cd_Label);
		p.CndPanel.add(p.Cnd_rcv_usr_cd);
		p.Cnd_rcv_usr_cd.setNextBeans(p.Cnd_rcv_usr_nm);
		p.Cnd_rcv_usr_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.rcv_usr_cd_META);
		p.Cnd_rcv_usr_cd.addLinkBeans(p.Cnd_rcv_usr_nm);
		p.Cnd_rcv_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rcv_usr_cd, true);
		p.CndPanel.add(p.Cnd_rcv_usr_nm);
		p.Cnd_rcv_usr_nm.setNextBeans(p.Cnd_rcv_dpt_cd);
		p.Cnd_rcv_usr_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.rcv_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_rcv_usr_nm, true);
		p.CndPanel.add(p.Cnd_rcv_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_rcv_dpt_cd);
		p.Cnd_rcv_dpt_cd.setNextBeans(p.Cnd_rcv_dpt_nm);
		p.Cnd_rcv_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.rcv_dpt_cd_META);
		p.Cnd_rcv_dpt_cd.addLinkBeans(p.Cnd_rcv_dpt_nm);
		p.Cnd_rcv_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rcv_dpt_cd, true);
		p.CndPanel.add(p.Cnd_rcv_dpt_nm);
		p.Cnd_rcv_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_rcv_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.rcv_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_rcv_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_rcv_rmrks);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_rcv_rmrks_Label);
		p.CndPanel.add(p.Cnd_rcv_rmrks);
		p.Cnd_rcv_rmrks.setNextBeans(p.Cnd_rcv_no);
		p.Cnd_rcv_rmrks.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.rcv_rmrks_META);
		p.setPluralValueEnable(p.Cnd_rcv_rmrks, true);
		p.CndPanel.add(p.Cnd_rcv_no_Label);
		p.CndPanel.add(p.Cnd_rcv_no);
		p.Cnd_rcv_no.setNextBeans(p.Cnd_note_no);
		p.Cnd_rcv_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.rcv_no_META);
		p.setPluralValueEnable(p.Cnd_rcv_no, true);
		p.CndPanel.add(p.Cnd_note_no_Label);
		p.CndPanel.add(p.Cnd_note_no);
		p.Cnd_note_no.setNextBeans(p.Cnd_pay_act_no);
		p.Cnd_note_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.note_no_META);
		p.setPluralValueEnable(p.Cnd_note_no, true);
		p.CndPanel.add(p.Cnd_pay_act_no_Label);
		p.CndPanel.add(p.Cnd_pay_act_no);
		p.Cnd_pay_act_no.setNextBeans(p.Cnd_rcv_mtd_cd);
		p.Cnd_pay_act_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.pay_act_no_META);
		p.setPluralValueEnable(p.Cnd_pay_act_no, true);
		p.Cnd_rcv_mtd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rcv_mtd_cd, true);
		p.Cnd_rcv_mtd_cd.setLinkBeans(p.Cnd_rcv_mtd_nm);
		p.CndPanel.add(p.Cnd_rcv_mtd_cd_Label);
		p.CndPanel.add(p.Cnd_rcv_mtd_cd);
		p.Cnd_rcv_mtd_cd.setNextBeans(p.Cnd_rcv_mtd_nm);
		p.Cnd_rcv_mtd_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.rcv_mtd_cd_META);
		p.CndPanel.add(p.Cnd_rcv_mtd_nm);
		p.Cnd_rcv_mtd_nm.setNextBeans(p.Cnd_bank_ac_cd);
		p.Cnd_rcv_mtd_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.rcv_mtd_nm_META);
		p.setPluralValueEnable(p.Cnd_rcv_mtd_nm, true);
		p.Cnd_bank_ac_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bank_ac_cd, true);
		p.Cnd_bank_ac_cd.setLinkBeans(p.Cnd_bank_ac_nm);
		p.CndPanel.add(p.Cnd_bank_ac_cd_Label);
		p.CndPanel.add(p.Cnd_bank_ac_cd);
		p.Cnd_bank_ac_cd.setNextBeans(p.Cnd_bank_ac_nm);
		p.Cnd_bank_ac_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.bank_ac_cd_META);
		p.CndPanel.add(p.Cnd_bank_ac_nm);
		p.Cnd_bank_ac_nm.setNextBeans(p.Cnd_cur_cd);
		p.Cnd_bank_ac_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.bank_ac_nm_META);
		p.setPluralValueEnable(p.Cnd_bank_ac_nm, true);
		p.Cnd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cur_cd, true);
		p.Cnd_cur_cd.setLinkBeans(p.Cnd_cur_nm);
		p.CndPanel.add(p.Cnd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_cur_cd);
		p.Cnd_cur_cd.setNextBeans(p.Cnd_cur_nm);
		p.Cnd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.cur_cd_META);
		p.CndPanel.add(p.Cnd_cur_nm);
		p.Cnd_cur_nm.setNextBeans(p.Cnd_bill_dpt_cd);
		p.Cnd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.cur_nm_META);
		p.setPluralValueEnable(p.Cnd_cur_nm, true);
		p.CndPanel.add(p.Cnd_bill_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bill_dpt_cd);
		p.Cnd_bill_dpt_cd.setNextBeans(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.bill_dpt_cd_META);
		p.Cnd_bill_dpt_cd.addLinkBeans(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bill_dpt_cd, true);
		p.CndPanel.add(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_nm.setNextBeans(p.Cnd_auto_appl_sts_typ);
		p.Cnd_bill_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.bill_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bill_dpt_nm, true);
		p.Cnd_auto_appl_sts_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_auto_appl_sts_typ, true);
		p.Cnd_auto_appl_sts_typ.setLinkBeans(p.Cnd_auto_appl_sts_typ_nm);
		p.CndPanel.add(p.Cnd_auto_appl_sts_typ_Label);
		p.CndPanel.add(p.Cnd_auto_appl_sts_typ);
		p.Cnd_auto_appl_sts_typ.setNextBeans(p.Cnd_auto_appl_sts_typ_nm);
		p.Cnd_auto_appl_sts_typ.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.auto_appl_sts_typ_META);
		p.CndPanel.add(p.Cnd_auto_appl_sts_typ_nm);
		p.Cnd_auto_appl_sts_typ_nm.setNextBeans(p.Cnd_if_rcv_no);
		p.Cnd_auto_appl_sts_typ_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.auto_appl_sts_typ_nm_META);
		p.CndPanel.add(p.Cnd_if_rcv_no);
		p.Cnd_if_rcv_no.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_if_rcv_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.if_rcv_no_META);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_proc_flg);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_proc_flg);
		p.Cnd_proc_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0150.CndR.proc_flg_META);
		p.RcstCndPanel.add(p.Cnd_rcv_grp_PPanel);
		p.RcstCndPanel.setLastBeans(p.Cnd_rcv_grp_PPanel);
		p.BcstCndPanel.add(p.Cnd_bill_grp_PPanel);
		p.BcstCndPanel.setLastBeans(p.Cnd_bill_grp_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRPnl(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel.setValueCheck(false);
		p.RPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RPnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.RPnl_dwnld.setIcon("DWNLD");
		p.RPnl_dwnld.setFunctionKey(MCFunctionKey.F11);
		p.RPnlPanel.add(p.RPnl_dwnld);
		p.RPnlPanel.setLastBeans(p.RPnl_dwnld);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBGP_NotApplSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBGP0210.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBGP0210);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBGP0210);
		p.Btn_open_MSBGP0210.setNextBeans(p.Btn_open_MSBGP0200);
		p.Btn_open_MSBGP0200.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBGP0200);
		p.Btn_open_MSBGP0200.setNextBeans(p.Btn_open_MSBGP0250);
		p.Btn_open_MSBGP0250.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBGP0250);
		p.Btn_open_MSBGP0250.setNextBeans(p.Btn_open_MSBGP0140);
		p.Btn_open_MSBGP0140.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_open_MSBGP0140);
		p.Btn_open_MSBGP0140.setNextBeans(p.Btn_open_MSBGP0160);
		p.Btn_open_MSBGP0160.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_open_MSBGP0160);
		p.Btn_open_MSBGP0160.setNextBeans(p.Btn_prnt);
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_indiv_prnt_flg);
		p.BtnPanel.add(p.Btn_indiv_prnt_flg);
		p.Btn_indiv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBG.MSBGP0150.BtnR.indiv_prnt_flg_META);
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		Ctrl_ctrl_PPanel.expandInit();
		Ctrl_ctrl_PPanel.setDefaultDividerLocation();
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSBGP_NotApplSrch_MC.mcInitScreenOpe((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.mcInitTop((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.mcInitFold((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.mcInitTab1((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.mcInitRcvIfTyp((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.mcInitRcvPrnt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.mcInitFbTgt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.mcInitTab2((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.mcInitTab3((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.mcInitRcstCnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.mcInitBcstCnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.mcInitCnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.mcInitCtrl((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.mcInitRPnl((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.mcInitRslt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.mcInitBtn((MSBGP_NotApplSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBGP_NotApplSrch_MC.statusInitSRCH_ScreenOpe((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH_Top((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH_Fold((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH_Tab1((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH_RcvIfTyp((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH_RcvPrnt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH_FbTgt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH_Tab2((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH_Tab3((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH_RcstCnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH_BcstCnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH_Cnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH_Ctrl((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH_RPnl((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH_Rslt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH_Btn((MSBGP_NotApplSrch)this);

		// [REF]ステータスのモードの設定
		MSBGP_NotApplSrch_MC.statusInitREF_ScreenOpe((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitREF_Top((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitREF_Fold((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitREF_Tab1((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitREF_RcvIfTyp((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitREF_RcvPrnt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitREF_FbTgt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitREF_Tab2((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitREF_Tab3((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitREF_RcstCnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitREF_BcstCnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitREF_Cnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitREF_Ctrl((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitREF_RPnl((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitREF_Rslt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitREF_Btn((MSBGP_NotApplSrch)this);

		// [SRCH_PRNT]ステータスのモードの設定
		MSBGP_NotApplSrch_MC.statusInitSRCH__PRNT_ScreenOpe((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH__PRNT_Top((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH__PRNT_Fold((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH__PRNT_Tab1((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH__PRNT_RcvIfTyp((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH__PRNT_RcvPrnt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH__PRNT_FbTgt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH__PRNT_Tab2((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH__PRNT_Tab3((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH__PRNT_RcstCnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH__PRNT_BcstCnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH__PRNT_Cnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH__PRNT_Ctrl((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH__PRNT_RPnl((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH__PRNT_Rslt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitSRCH__PRNT_Btn((MSBGP_NotApplSrch)this);

		// [PRNT]ステータスのモードの設定
		MSBGP_NotApplSrch_MC.statusInitPRNT_ScreenOpe((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitPRNT_Top((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitPRNT_Fold((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitPRNT_Tab1((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitPRNT_RcvIfTyp((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitPRNT_RcvPrnt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitPRNT_FbTgt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitPRNT_Tab2((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitPRNT_Tab3((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitPRNT_RcstCnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitPRNT_BcstCnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitPRNT_Cnd((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitPRNT_Ctrl((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitPRNT_RPnl((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitPRNT_Rslt((MSBGP_NotApplSrch)this);
		MSBGP_NotApplSrch_MC.statusInitPRNT_Btn((MSBGP_NotApplSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBGP_NotApplSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBGP_NotApplSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBGP_NotApplSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBGP_NotApplSrch p) {
	}

	/**
	 *  [RcvIfTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRcvIfTyp(MSBGP_NotApplSrch p) {
	}

	/**
	 *  [RcvPrnt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRcvPrnt(MSBGP_NotApplSrch p) {
	}

	/**
	 *  [FbTgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFbTgt(MSBGP_NotApplSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBGP_NotApplSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBGP_NotApplSrch p) {
	}

	/**
	 *  [RcstCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRcstCnd(MSBGP_NotApplSrch p) {
	}

	/**
	 *  [BcstCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBcstCnd(MSBGP_NotApplSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBGP_NotApplSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_PRNT.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_rcv_flg.addAllListener(p);
		p.Cnd_susp_flg.addAllListener(p);
		p.Cnd_adv_flg.addAllListener(p);
		p.Cnd_ap_flg.addAllListener(p);
		p.Cnd_not_prnt_flg.addAllListener(p);
		p.Cnd_prnt_flg.addAllListener(p);
		p.Cnd_fb_t_flg.addAllListener(p);
		p.Cnd_fb_f_flg.addAllListener(p);
		p.Cnd_rcv_dt_fr.setListListener(p);
		p.Cnd_rcv_dt_fr.addAllListener(p);
		p.Cnd_rcv_dt_to.setListListener(p);
		p.Cnd_rcv_dt_to.addAllListener(p);
		p.Cnd_rcst_cd.setListListener(p);
		p.Cnd_rcst_cd.addAllListener(p);
		p.Cnd_rcst_nm.setListListener(p);
		p.Cnd_rcst_nm.addAllListener(p);
		p.Cnd_bcst_cd.setListListener(p);
		p.Cnd_bcst_cd.addAllListener(p);
		p.Cnd_bcst_nm.setListListener(p);
		p.Cnd_bcst_nm.addAllListener(p);
		p.Cnd_rcv_usr_cd.setListListener(p);
		p.Cnd_rcv_usr_cd.addAllListener(p);
		p.Cnd_rcv_usr_nm.setListListener(p);
		p.Cnd_rcv_usr_nm.addAllListener(p);
		p.Cnd_rcv_dpt_cd.setListListener(p);
		p.Cnd_rcv_dpt_cd.addAllListener(p);
		p.Cnd_rcv_dpt_nm.setListListener(p);
		p.Cnd_rcv_dpt_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_rcv_rmrks.setListListener(p);
		p.Cnd_rcv_rmrks.addAllListener(p);
		p.Cnd_rcv_no.setListListener(p);
		p.Cnd_rcv_no.addAllListener(p);
		p.Cnd_note_no.setListListener(p);
		p.Cnd_note_no.addAllListener(p);
		p.Cnd_pay_act_no.setListListener(p);
		p.Cnd_pay_act_no.addAllListener(p);
		p.Cnd_rcv_mtd_cd.setListListener(p);
		p.Cnd_rcv_mtd_cd.addAllListener(p);
		p.Cnd_rcv_mtd_nm.setListListener(p);
		p.Cnd_rcv_mtd_nm.addAllListener(p);
		p.Cnd_bank_ac_cd.setListListener(p);
		p.Cnd_bank_ac_cd.addAllListener(p);
		p.Cnd_bank_ac_nm.setListListener(p);
		p.Cnd_bank_ac_nm.addAllListener(p);
		p.Cnd_cur_cd.setListListener(p);
		p.Cnd_cur_cd.addAllListener(p);
		p.Cnd_cur_nm.setListListener(p);
		p.Cnd_cur_nm.addAllListener(p);
		p.Cnd_bill_dpt_cd.setListListener(p);
		p.Cnd_bill_dpt_cd.addAllListener(p);
		p.Cnd_bill_dpt_nm.setListListener(p);
		p.Cnd_bill_dpt_nm.addAllListener(p);
		p.Cnd_auto_appl_sts_typ.setListListener(p);
		p.Cnd_auto_appl_sts_typ.addAllListener(p);
		p.Cnd_auto_appl_sts_typ_nm.setListListener(p);
		p.Cnd_auto_appl_sts_typ_nm.addAllListener(p);
		p.Cnd_if_rcv_no.setListListener(p);
		p.Cnd_if_rcv_no.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_proc_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBGP_NotApplSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBGP_NotApplSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBGP_NotApplSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_rcv_dat_typ.addAllListener(p);
		p.columnRslt_rcv_dat_typ.setListListener(p);
		p.columnRslt_rcv_dat_typ_nm.addAllListener(p);
		p.columnRslt_rcv_dat_typ_nm.setListListener(p);
		p.columnRslt_rcv_dpt_cd.addAllListener(p);
		p.columnRslt_rcv_dpt_cd.setListListener(p);
		p.columnRslt_rcv_dpt_nm.addAllListener(p);
		p.columnRslt_rcv_dpt_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_rcv_usr_cd.addAllListener(p);
		p.columnRslt_rcv_usr_cd.setListListener(p);
		p.columnRslt_rcv_usr_nm.addAllListener(p);
		p.columnRslt_rcv_usr_nm.setListListener(p);
		p.columnRslt_rcv_no.addAllListener(p);
		p.columnRslt_rcv_no.setListListener(p);
		p.columnRslt_rcv_dt.addAllListener(p);
		p.columnRslt_rcv_dt.setListListener(p);
		p.columnRslt_rcst_cd.addAllListener(p);
		p.columnRslt_rcst_cd.setListListener(p);
		p.columnRslt_rcst_nm.addAllListener(p);
		p.columnRslt_rcst_nm.setListListener(p);
		p.columnRslt_bcst_cd.addAllListener(p);
		p.columnRslt_bcst_cd.setListListener(p);
		p.columnRslt_bcst_nm.addAllListener(p);
		p.columnRslt_bcst_nm.setListListener(p);
		p.columnRslt_bill_dpt_cd.addAllListener(p);
		p.columnRslt_bill_dpt_cd.setListListener(p);
		p.columnRslt_bill_dpt_nm.addAllListener(p);
		p.columnRslt_bill_dpt_nm.setListListener(p);
		p.columnRslt_xfr_psn.addAllListener(p);
		p.columnRslt_xfr_psn.setListListener(p);
		p.columnRslt_cur_cd.addAllListener(p);
		p.columnRslt_cur_cd.setListListener(p);
		p.columnRslt_cur_nm.addAllListener(p);
		p.columnRslt_cur_nm.setListListener(p);
		p.columnRslt_amt_dec_place.addAllListener(p);
		p.columnRslt_amt_dec_place.setListListener(p);
		p.columnRslt_bank_ac_cd.addAllListener(p);
		p.columnRslt_bank_ac_cd.setListListener(p);
		p.columnRslt_bank_ac_nm.addAllListener(p);
		p.columnRslt_bank_ac_nm.setListListener(p);
		p.columnRslt_bank_ac_no.addAllListener(p);
		p.columnRslt_bank_ac_no.setListListener(p);
		p.columnRslt_rcv_mtd_cd.addAllListener(p);
		p.columnRslt_rcv_mtd_cd.setListListener(p);
		p.columnRslt_rcv_mtd_nm.addAllListener(p);
		p.columnRslt_rcv_mtd_nm.setListListener(p);
		p.columnRslt_note_no.addAllListener(p);
		p.columnRslt_note_no.setListListener(p);
		p.columnRslt_auto_appl_sts_typ.addAllListener(p);
		p.columnRslt_auto_appl_sts_typ.setListListener(p);
		p.columnRslt_auto_appl_sts_typ_nm.addAllListener(p);
		p.columnRslt_auto_appl_sts_typ_nm.setListListener(p);
		p.columnRslt_asppl_cd.addAllListener(p);
		p.columnRslt_asppl_cd.setListListener(p);
		p.columnRslt_asppl_nm.addAllListener(p);
		p.columnRslt_asppl_nm.setListListener(p);
		p.columnRslt_bsppl_cd.addAllListener(p);
		p.columnRslt_bsppl_cd.setListListener(p);
		p.columnRslt_bsppl_nm.addAllListener(p);
		p.columnRslt_bsppl_nm.setListListener(p);
		p.columnRslt_acst_cd.addAllListener(p);
		p.columnRslt_acst_cd.setListListener(p);
		p.columnRslt_acst_nm.addAllListener(p);
		p.columnRslt_acst_nm.setListListener(p);
		p.columnRslt_pay_act_no.addAllListener(p);
		p.columnRslt_pay_act_no.setListListener(p);
		p.columnRslt_rcv_rmrks.addAllListener(p);
		p.columnRslt_rcv_rmrks.setListListener(p);
		p.columnRslt_prnt_flg.addAllListener(p);
		p.columnRslt_div_flg.addAllListener(p);
		p.columnRslt_div_src_rcv_no.addAllListener(p);
		p.columnRslt_div_src_rcv_no.setListListener(p);
		p.columnRslt_src_rcv_act_no.addAllListener(p);
		p.columnRslt_src_rcv_act_no.setListListener(p);
		p.columnRslt_if_rcv_no.addAllListener(p);
		p.columnRslt_if_rcv_no.setListListener(p);
		p.columnRslt_fb_flg.addAllListener(p);
		p.columnRslt_ext_sys_cd.addAllListener(p);
		p.columnRslt_ext_sys_cd.setListListener(p);
		p.columnRslt_ext_sys_nm.addAllListener(p);
		p.columnRslt_ext_sys_nm.setListListener(p);
		p.columnRslt_ext_rcv_no.addAllListener(p);
		p.columnRslt_ext_rcv_no.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_ins_usr_id.addAllListener(p);
		p.columnRslt_ins_usr_id.setListListener(p);
		p.columnRslt_ins_usr_nm.addAllListener(p);
		p.columnRslt_ins_usr_nm.setListListener(p);
		p.columnRslt_ins_func_id.addAllListener(p);
		p.columnRslt_ins_func_id.setListListener(p);
		p.columnRslt_ins_func_nm.addAllListener(p);
		p.columnRslt_ins_func_nm.setListListener(p);
		p.columnRslt_ins_ts.addAllListener(p);
		p.columnRslt_ins_ts.setListListener(p);
		p.columnRslt_upd_usr_id.addAllListener(p);
		p.columnRslt_upd_usr_id.setListListener(p);
		p.columnRslt_upd_usr_nm.addAllListener(p);
		p.columnRslt_upd_usr_nm.setListListener(p);
		p.columnRslt_upd_func_id.addAllListener(p);
		p.columnRslt_upd_func_id.setListListener(p);
		p.columnRslt_upd_func_nm.addAllListener(p);
		p.columnRslt_upd_func_nm.setListListener(p);
		p.columnRslt_upd_ts.addAllListener(p);
		p.columnRslt_upd_ts.setListListener(p);
		p.columnRslt_upd_srv_req_no.addAllListener(p);
		p.columnRslt_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBGP_NotApplSrch p) {
		p.Btn_open_MSBGP0210.addAllListener(p);
		p.Btn_open_MSBGP0210.setAPMethodName("doBtn_open_MSBGP0210");
		p.Btn_open_MSBGP0200.addAllListener(p);
		p.Btn_open_MSBGP0200.setAPMethodName("doBtn_open_MSBGP0200");
		p.Btn_open_MSBGP0250.addAllListener(p);
		p.Btn_open_MSBGP0250.setAPMethodName("doBtn_open_MSBGP0250");
		p.Btn_open_MSBGP0140.addAllListener(p);
		p.Btn_open_MSBGP0140.setAPMethodName("doBtn_open_MSBGP0140");
		p.Btn_open_MSBGP0160.addAllListener(p);
		p.Btn_open_MSBGP0160.setAPMethodName("doBtn_open_MSBGP0160");
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_indiv_prnt_flg.addAllListener(p);
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH]ステータスの[RcvIfTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RcvIfTyp(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH]ステータスの[RcvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RcvPrnt(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH]ステータスの[FbTgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_FbTgt(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH]ステータスの[RcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RcstCnd(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH]ステータスの[BcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BcstCnd(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBGP_NotApplSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rcv_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_susp_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_adv_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ap_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_not_prnt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_prnt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_fb_t_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_fb_f_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rcv_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_note_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pay_act_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_mtd_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_mtd_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bank_ac_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bank_ac_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_auto_appl_sts_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_auto_appl_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_if_rcv_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_proc_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_grp_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bill_grp_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBGP_NotApplSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBGP_NotApplSrch p){
		p.RPnl_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBGP_NotApplSrch p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_dat_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_dat_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_xfr_psn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_rcv_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_roc_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_mtd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_mtd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_auto_appl_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_auto_appl_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_div_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_div_src_rcv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_src_rcv_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_if_rcv_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_fb_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ext_rcv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_rcv_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBGP_NotApplSrch p){
		p.Btn_open_MSBGP0210.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBGP0200.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBGP0250.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBGP0140.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBGP0160.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBGP_NotApplSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBGP_NotApplSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBGP_NotApplSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBGP_NotApplSrch p){

	}

	/**
	 * [REF]ステータスの[RcvIfTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF_RcvIfTyp(MSBGP_NotApplSrch p){

	}

	/**
	 * [REF]ステータスの[RcvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF_RcvPrnt(MSBGP_NotApplSrch p){

	}

	/**
	 * [REF]ステータスの[FbTgt]ブロックのモードの設定
	 */
	protected static void statusInitREF_FbTgt(MSBGP_NotApplSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBGP_NotApplSrch p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MSBGP_NotApplSrch p){

	}

	/**
	 * [REF]ステータスの[RcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_RcstCnd(MSBGP_NotApplSrch p){

	}

	/**
	 * [REF]ステータスの[BcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_BcstCnd(MSBGP_NotApplSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBGP_NotApplSrch p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rcv_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_susp_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_adv_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ap_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_not_prnt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_prnt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_fb_t_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_fb_f_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rcv_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_note_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_pay_act_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_mtd_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_mtd_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bank_ac_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bank_ac_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_auto_appl_sts_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_auto_appl_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_if_rcv_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_proc_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_grp_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bill_grp_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBGP_NotApplSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBGP_NotApplSrch p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBGP_NotApplSrch p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_dat_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_dat_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xfr_psn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_rcv_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_roc_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_mtd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_mtd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_auto_appl_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_auto_appl_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_div_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_div_src_rcv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_src_rcv_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_if_rcv_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_fb_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ext_rcv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_rcv_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd6.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd7.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd8.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd9.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd10.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm10.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd6.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd7.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd8.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd9.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd10.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBGP_NotApplSrch p){
		p.Btn_open_MSBGP0210.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBGP0200.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBGP0250.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBGP0140.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBGP0160.putMode(p, REF, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_ScreenOpe(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Top(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Fold(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab1(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[RcvIfTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_RcvIfTyp(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[RcvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_RcvPrnt(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[FbTgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_FbTgt(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab2(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab3(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[RcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_RcstCnd(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[BcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_BcstCnd(MSBGP_NotApplSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Cnd(MSBGP_NotApplSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_rcv_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_susp_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_adv_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_ap_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_not_prnt_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_prnt_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_fb_t_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_fb_f_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_rcv_dt_fr.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcv_dt_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcst_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcst_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcv_usr_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcv_usr_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcv_dpt_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcv_dpt_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcv_rmrks.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcv_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_note_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_pay_act_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcv_mtd_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcv_mtd_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bank_ac_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bank_ac_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_auto_appl_sts_typ.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_auto_appl_sts_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_if_rcv_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Cnd_sub_char1.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_proc_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcv_grp_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bill_grp_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Ctrl(MSBGP_NotApplSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_PRNT, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_RPnl(MSBGP_NotApplSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_PRNT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Rslt(MSBGP_NotApplSrch p){
		p.columnRslt_check.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_dat_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_dat_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_dpt_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_dpt_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_usr_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_usr_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcst_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcst_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bcst_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bcst_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_xfr_psn.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_rcv_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_roc_bal_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_mtd_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_mtd_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_auto_appl_sts_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_auto_appl_sts_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_act_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_prnt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_div_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_div_src_rcv_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_src_rcv_act_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_if_rcv_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_fb_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ext_rcv_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd4.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm4.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd5.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm5.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd6.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm6.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd7.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm7.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd8.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm8.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd9.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm9.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd10.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm10.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd4.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm4.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd5.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm5.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd6.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm6.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd7.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm7.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd8.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm8.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd9.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm9.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd10.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm10.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Btn(MSBGP_NotApplSrch p){
		p.Btn_open_MSBGP0210.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_open_MSBGP0200.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_open_MSBGP0250.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_open_MSBGP0140.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_open_MSBGP0160.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ScreenOpe(MSBGP_NotApplSrch p){

	}

	/**
	 * [PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Top(MSBGP_NotApplSrch p){

	}

	/**
	 * [PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Fold(MSBGP_NotApplSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab1(MSBGP_NotApplSrch p){

	}

	/**
	 * [PRNT]ステータスの[RcvIfTyp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RcvIfTyp(MSBGP_NotApplSrch p){

	}

	/**
	 * [PRNT]ステータスの[RcvPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RcvPrnt(MSBGP_NotApplSrch p){

	}

	/**
	 * [PRNT]ステータスの[FbTgt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_FbTgt(MSBGP_NotApplSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab2(MSBGP_NotApplSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab3(MSBGP_NotApplSrch p){

	}

	/**
	 * [PRNT]ステータスの[RcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RcstCnd(MSBGP_NotApplSrch p){

	}

	/**
	 * [PRNT]ステータスの[BcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_BcstCnd(MSBGP_NotApplSrch p){

	}

	/**
	 * [PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd(MSBGP_NotApplSrch p){
		p.Cnd_ope_Group.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_rcv_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_susp_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_adv_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ap_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_not_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_fb_t_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_fb_f_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_rcv_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcv_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcst_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcst_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcv_usr_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcv_usr_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcv_dpt_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcv_dpt_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcv_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcv_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_note_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_pay_act_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcv_mtd_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcv_mtd_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bank_ac_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bank_ac_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_auto_appl_sts_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_auto_appl_sts_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_if_rcv_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Cnd_sub_char1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_proc_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcv_grp_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bill_grp_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Ctrl(MSBGP_NotApplSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(PRNT, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RPnl(MSBGP_NotApplSrch p){
		p.RPnl_dwnld.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Rslt(MSBGP_NotApplSrch p){
		p.columnRslt_check.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnRslt_rcv_dat_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_dat_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_dpt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_dpt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_usr_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcst_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcst_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bcst_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bcst_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_xfr_psn.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_rcv_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_roc_bal_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_mtd_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_mtd_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_auto_appl_sts_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_auto_appl_sts_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_act_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_prnt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_div_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_div_src_rcv_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_src_rcv_act_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_if_rcv_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_fb_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ext_rcv_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd4.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm4.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd5.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm5.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd6.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm6.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd7.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm7.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd8.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm8.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd9.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm9.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_cd10.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.columnBpGrp_bp_grp_nm10.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd4.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm4.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd5.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm5.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd6.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm6.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd7.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm7.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd8.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm8.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd9.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm9.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_cd10.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.columnBpGrp_bp_grp_nm10.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, PRNT, MCMode.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Btn(MSBGP_NotApplSrch p){
		p.Btn_open_MSBGP0210.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_open_MSBGP0200.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_open_MSBGP0250.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_open_MSBGP0140.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_open_MSBGP0160.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_indiv_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);

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
		MSBGP_NotApplSrch_MC.setTableConfigRslt((MSBGP_NotApplSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBGP_NotApplSrch p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_rcv_dat_typ.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.rcv_dat_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_dat_typ);
		p.columnRslt_rcv_dat_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.rcv_dat_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_dat_typ_nm);
		p.columnRslt_rcv_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.rcv_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_dpt_cd);
		p.columnRslt_rcv_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.rcv_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_dpt_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_rcv_usr_cd.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.rcv_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_usr_cd);
		p.columnRslt_rcv_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.rcv_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_usr_nm);
		p.columnRslt_rcv_no.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.rcv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_no);
		p.columnRslt_rcv_dt.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.rcv_dt_META);
		p.columnRslt_rcv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_dt);
		p.columnRslt_rcst_cd.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.rcst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcst_cd);
		p.columnRslt_rcst_nm.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.rcst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcst_nm);
		p.columnRslt_bcst_cd.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.bcst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bcst_cd);
		p.columnRslt_bcst_nm.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.bcst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bcst_nm);
		p.columnRslt_bill_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.bill_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_dpt_cd);
		p.columnRslt_bill_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.bill_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_dpt_nm);
		p.columnRslt_xfr_psn.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.xfr_psn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xfr_psn);
		p.columnRslt_cur_cd.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cur_cd);
		p.columnRslt_cur_nm.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cur_nm);
		p.columnRslt_amt_dec_place.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt_dec_place);
		p.RsltTable.addTable(p.Rslt_rcv_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_roc_bal_p_PPanel.AmtTable);
		p.columnRslt_bank_ac_cd.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.bank_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_cd);
		p.columnRslt_bank_ac_nm.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.bank_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_nm);
		p.columnRslt_bank_ac_no.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.bank_ac_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_no);
		p.columnRslt_rcv_mtd_cd.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.rcv_mtd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_mtd_cd);
		p.columnRslt_rcv_mtd_nm.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.rcv_mtd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_mtd_nm);
		p.columnRslt_note_no.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.note_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_no);
		p.columnRslt_auto_appl_sts_typ.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.auto_appl_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_auto_appl_sts_typ);
		p.columnRslt_auto_appl_sts_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.auto_appl_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_auto_appl_sts_typ_nm);
		p.columnRslt_asppl_cd.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.asppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asppl_cd);
		p.columnRslt_asppl_nm.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.asppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asppl_nm);
		p.columnRslt_bsppl_cd.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.bsppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_cd);
		p.columnRslt_bsppl_nm.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.bsppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_nm);
		p.columnRslt_acst_cd.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.acst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acst_cd);
		p.columnRslt_acst_nm.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.acst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acst_nm);
		p.columnRslt_pay_act_no.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.pay_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_act_no);
		p.columnRslt_rcv_rmrks.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.rcv_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_rmrks);
		p.columnRslt_prnt_flg.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prnt_flg);
		p.columnRslt_div_flg.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.div_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_div_flg);
		p.columnRslt_div_src_rcv_no.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.div_src_rcv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_div_src_rcv_no);
		p.columnRslt_src_rcv_act_no.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.src_rcv_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_src_rcv_act_no);
		p.columnRslt_if_rcv_no.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.if_rcv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_if_rcv_no);
		p.columnRslt_fb_flg.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.fb_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fb_flg);
		p.columnRslt_ext_sys_cd.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.ext_sys_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_cd);
		p.columnRslt_ext_sys_nm.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.ext_sys_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_nm);
		p.columnRslt_ext_rcv_no.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.ext_rcv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_rcv_no);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.RsltTable.addTable(p.Rslt_rcv_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_bill_grp_p_PPanel.BpGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBG.MSBGP0150.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_rcst_cd.getListConfig().setPutter(getCnd_rcst_cd_ListPutter());
		Cnd_bcst_cd.getListConfig().setPutter(getCnd_bcst_cd_ListPutter());
		Cnd_rcv_usr_cd.getListConfig().setPutter(getCnd_rcv_usr_cd_ListPutter());
		Cnd_rcv_dpt_cd.getListConfig().setPutter(getCnd_rcv_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_rcv_mtd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rcv_mtd_cd.getListConfig().setPutter(getCnd_rcv_mtd_cd_ListPutter());
		Cnd_bank_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bank_ac_cd.getListConfig().setPutter(getCnd_bank_ac_cd_ListPutter());
		Cnd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cur_cd.getListConfig().setPutter(getCnd_cur_cd_ListPutter());
		Cnd_bill_dpt_cd.getListConfig().setPutter(getCnd_bill_dpt_cd_ListPutter());
		Cnd_auto_appl_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_auto_appl_sts_typ.getListConfig().setPutter(getCnd_auto_appl_sts_typ_ListPutter());
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
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_PRNT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_PRNTStatus() {
		status = SRCH_PRNT;
		setAllStatus(status);
	}

	/**
	 * この画面を[PRNT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setPRNTStatus() {
		status = PRNT;
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
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (SRCH_PRNT.equals(status)) {
			setSRCH_PRNTStatus();
		}
		else if (PRNT.equals(status)) {
			setPRNTStatus();
		}
	}

	/**
	 * [Cnd_rcst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rcst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_bcst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bcst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_rcv_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rcv_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_rcv_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rcv_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ArWg");
		return lp;
	}
	 
	/**
	 * [Cnd_rcv_mtd_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rcv_mtd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0080.SttlRcv");
		return lp;
	}
	 
	/**
	 * [Cnd_bank_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bank_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BankAc");
		return lp;
	}
	 
	/**
	 * [Cnd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Cnd_bill_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bill_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_auto_appl_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_auto_appl_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.AutoApplStsTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_rcst_cd) return getCnd_rcst_cd(row, info);
		if(combo == Cnd_bcst_cd) return getCnd_bcst_cd(row, info);
		if(combo == Cnd_rcv_usr_cd) return getCnd_rcv_usr_cd(row, info);
		if(combo == Cnd_rcv_dpt_cd) return getCnd_rcv_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_rcv_mtd_cd) return getCnd_rcv_mtd_cd(row, info);
		if(combo == Cnd_bank_ac_cd) return getCnd_bank_ac_cd(row, info);
		if(combo == Cnd_cur_cd) return getCnd_cur_cd(row, info);
		if(combo == Cnd_bill_dpt_cd) return getCnd_bill_dpt_cd(row, info);
		if(combo == Cnd_auto_appl_sts_typ) return getCnd_auto_appl_sts_typ(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == RPnl_dwnld) doRPnl_dwnld(info);
		else if (ap == Btn_open_MSBGP0210) doBtn_open_MSBGP0210(info);
		else if (ap == Btn_open_MSBGP0200) doBtn_open_MSBGP0200(info);
		else if (ap == Btn_open_MSBGP0250) doBtn_open_MSBGP0250(info);
		else if (ap == Btn_open_MSBGP0140) doBtn_open_MSBGP0140(info);
		else if (ap == Btn_open_MSBGP0160) doBtn_open_MSBGP0160(info);
		else if (ap == Btn_prnt) doBtn_prnt(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [RPnl]パネルの[dwnld]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRPnl_dwnld(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBGP0210]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0210(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBGP0200]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0200(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBGP0250]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0250(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBGP0140]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0140(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBGP0160]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0160(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

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
		if (vc == FoldTab) return doFold_VC(info);
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_rcv_flg) return doCnd_rcv_flg_VC(info);
		if (vc == Cnd_susp_flg) return doCnd_susp_flg_VC(info);
		if (vc == Cnd_adv_flg) return doCnd_adv_flg_VC(info);
		if (vc == Cnd_ap_flg) return doCnd_ap_flg_VC(info);
		if (vc == Cnd_not_prnt_flg) return doCnd_not_prnt_flg_VC(info);
		if (vc == Cnd_prnt_flg) return doCnd_prnt_flg_VC(info);
		if (vc == Cnd_fb_t_flg) return doCnd_fb_t_flg_VC(info);
		if (vc == Cnd_fb_f_flg) return doCnd_fb_f_flg_VC(info);
		if (vc == Cnd_rcv_dt_fr) return doCnd_rcv_dt_fr_VC(info);
		if (vc == Cnd_rcv_dt_to) return doCnd_rcv_dt_to_VC(info);
		if (vc == Cnd_rcst_cd) return doCnd_rcst_cd_VC(info);
		if (vc == Cnd_rcst_nm) return doCnd_rcst_nm_VC(info);
		if (vc == Cnd_bcst_cd) return doCnd_bcst_cd_VC(info);
		if (vc == Cnd_bcst_nm) return doCnd_bcst_nm_VC(info);
		if (vc == Cnd_rcv_usr_cd) return doCnd_rcv_usr_cd_VC(info);
		if (vc == Cnd_rcv_usr_nm) return doCnd_rcv_usr_nm_VC(info);
		if (vc == Cnd_rcv_dpt_cd) return doCnd_rcv_dpt_cd_VC(info);
		if (vc == Cnd_rcv_dpt_nm) return doCnd_rcv_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_rcv_rmrks) return doCnd_rcv_rmrks_VC(info);
		if (vc == Cnd_rcv_no) return doCnd_rcv_no_VC(info);
		if (vc == Cnd_note_no) return doCnd_note_no_VC(info);
		if (vc == Cnd_pay_act_no) return doCnd_pay_act_no_VC(info);
		if (vc == Cnd_rcv_mtd_cd) return doCnd_rcv_mtd_cd_VC(info);
		if (vc == Cnd_rcv_mtd_nm) return doCnd_rcv_mtd_nm_VC(info);
		if (vc == Cnd_bank_ac_cd) return doCnd_bank_ac_cd_VC(info);
		if (vc == Cnd_bank_ac_nm) return doCnd_bank_ac_nm_VC(info);
		if (vc == Cnd_cur_cd) return doCnd_cur_cd_VC(info);
		if (vc == Cnd_cur_nm) return doCnd_cur_nm_VC(info);
		if (vc == Cnd_bill_dpt_cd) return doCnd_bill_dpt_cd_VC(info);
		if (vc == Cnd_bill_dpt_nm) return doCnd_bill_dpt_nm_VC(info);
		if (vc == Cnd_auto_appl_sts_typ) return doCnd_auto_appl_sts_typ_VC(info);
		if (vc == Cnd_auto_appl_sts_typ_nm) return doCnd_auto_appl_sts_typ_nm_VC(info);
		if (vc == Cnd_if_rcv_no) return doCnd_if_rcv_no_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_proc_flg) return doCnd_proc_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_rcv_dat_typ) return doRslt_rcv_dat_typ_VC(info);
		if (vc == columnRslt_rcv_dat_typ_nm) return doRslt_rcv_dat_typ_nm_VC(info);
		if (vc == columnRslt_rcv_dpt_cd) return doRslt_rcv_dpt_cd_VC(info);
		if (vc == columnRslt_rcv_dpt_nm) return doRslt_rcv_dpt_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_rcv_usr_cd) return doRslt_rcv_usr_cd_VC(info);
		if (vc == columnRslt_rcv_usr_nm) return doRslt_rcv_usr_nm_VC(info);
		if (vc == columnRslt_rcv_no) return doRslt_rcv_no_VC(info);
		if (vc == columnRslt_rcv_dt) return doRslt_rcv_dt_VC(info);
		if (vc == columnRslt_rcst_cd) return doRslt_rcst_cd_VC(info);
		if (vc == columnRslt_rcst_nm) return doRslt_rcst_nm_VC(info);
		if (vc == columnRslt_bcst_cd) return doRslt_bcst_cd_VC(info);
		if (vc == columnRslt_bcst_nm) return doRslt_bcst_nm_VC(info);
		if (vc == columnRslt_bill_dpt_cd) return doRslt_bill_dpt_cd_VC(info);
		if (vc == columnRslt_bill_dpt_nm) return doRslt_bill_dpt_nm_VC(info);
		if (vc == columnRslt_xfr_psn) return doRslt_xfr_psn_VC(info);
		if (vc == columnRslt_cur_cd) return doRslt_cur_cd_VC(info);
		if (vc == columnRslt_cur_nm) return doRslt_cur_nm_VC(info);
		if (vc == columnRslt_amt_dec_place) return doRslt_amt_dec_place_VC(info);
		if (vc == columnRslt_bank_ac_cd) return doRslt_bank_ac_cd_VC(info);
		if (vc == columnRslt_bank_ac_nm) return doRslt_bank_ac_nm_VC(info);
		if (vc == columnRslt_bank_ac_no) return doRslt_bank_ac_no_VC(info);
		if (vc == columnRslt_rcv_mtd_cd) return doRslt_rcv_mtd_cd_VC(info);
		if (vc == columnRslt_rcv_mtd_nm) return doRslt_rcv_mtd_nm_VC(info);
		if (vc == columnRslt_note_no) return doRslt_note_no_VC(info);
		if (vc == columnRslt_auto_appl_sts_typ) return doRslt_auto_appl_sts_typ_VC(info);
		if (vc == columnRslt_auto_appl_sts_typ_nm) return doRslt_auto_appl_sts_typ_nm_VC(info);
		if (vc == columnRslt_asppl_cd) return doRslt_asppl_cd_VC(info);
		if (vc == columnRslt_asppl_nm) return doRslt_asppl_nm_VC(info);
		if (vc == columnRslt_bsppl_cd) return doRslt_bsppl_cd_VC(info);
		if (vc == columnRslt_bsppl_nm) return doRslt_bsppl_nm_VC(info);
		if (vc == columnRslt_acst_cd) return doRslt_acst_cd_VC(info);
		if (vc == columnRslt_acst_nm) return doRslt_acst_nm_VC(info);
		if (vc == columnRslt_pay_act_no) return doRslt_pay_act_no_VC(info);
		if (vc == columnRslt_rcv_rmrks) return doRslt_rcv_rmrks_VC(info);
		if (vc == columnRslt_prnt_flg) return doRslt_prnt_flg_VC(info);
		if (vc == columnRslt_div_flg) return doRslt_div_flg_VC(info);
		if (vc == columnRslt_div_src_rcv_no) return doRslt_div_src_rcv_no_VC(info);
		if (vc == columnRslt_src_rcv_act_no) return doRslt_src_rcv_act_no_VC(info);
		if (vc == columnRslt_if_rcv_no) return doRslt_if_rcv_no_VC(info);
		if (vc == columnRslt_fb_flg) return doRslt_fb_flg_VC(info);
		if (vc == columnRslt_ext_sys_cd) return doRslt_ext_sys_cd_VC(info);
		if (vc == columnRslt_ext_sys_nm) return doRslt_ext_sys_nm_VC(info);
		if (vc == columnRslt_ext_rcv_no) return doRslt_ext_rcv_no_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		if (vc == Btn_indiv_prnt_flg) return doBtn_indiv_prnt_flg_VC(info);
		return true;
	}

	/**
	 * [Fold]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFold_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[susp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_susp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[adv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_adv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fb_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fb_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fb_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fb_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcv_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcv_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcv_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcv_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcv_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcv_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcv_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[note_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_note_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcv_mtd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_mtd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcv_mtd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_mtd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[auto_appl_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_auto_appl_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[auto_appl_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_auto_appl_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[if_rcv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_if_rcv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[proc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_proc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_dat_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_dat_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_dat_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_dat_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xfr_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xfr_psn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bank_ac_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bank_ac_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_mtd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_mtd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_mtd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_mtd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[auto_appl_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_auto_appl_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[auto_appl_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_auto_appl_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[div_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_div_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[div_src_rcv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_div_src_rcv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[src_rcv_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_src_rcv_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[if_rcv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_if_rcv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fb_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fb_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ext_rcv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_rcv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_indiv_prnt_flg_VC(MCEventInfo info){
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
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_rcv_flg) doCnd_rcv_flg_NC(info);
		else if (nc == Cnd_susp_flg) doCnd_susp_flg_NC(info);
		else if (nc == Cnd_adv_flg) doCnd_adv_flg_NC(info);
		else if (nc == Cnd_ap_flg) doCnd_ap_flg_NC(info);
		else if (nc == Cnd_not_prnt_flg) doCnd_not_prnt_flg_NC(info);
		else if (nc == Cnd_prnt_flg) doCnd_prnt_flg_NC(info);
		else if (nc == Cnd_fb_t_flg) doCnd_fb_t_flg_NC(info);
		else if (nc == Cnd_fb_f_flg) doCnd_fb_f_flg_NC(info);
		else if (nc == Cnd_rcv_dt_fr) doCnd_rcv_dt_fr_NC(info);
		else if (nc == Cnd_rcv_dt_to) doCnd_rcv_dt_to_NC(info);
		else if (nc == Cnd_rcst_cd) doCnd_rcst_cd_NC(info);
		else if (nc == Cnd_rcst_nm) doCnd_rcst_nm_NC(info);
		else if (nc == Cnd_bcst_cd) doCnd_bcst_cd_NC(info);
		else if (nc == Cnd_bcst_nm) doCnd_bcst_nm_NC(info);
		else if (nc == Cnd_rcv_usr_cd) doCnd_rcv_usr_cd_NC(info);
		else if (nc == Cnd_rcv_usr_nm) doCnd_rcv_usr_nm_NC(info);
		else if (nc == Cnd_rcv_dpt_cd) doCnd_rcv_dpt_cd_NC(info);
		else if (nc == Cnd_rcv_dpt_nm) doCnd_rcv_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_rcv_rmrks) doCnd_rcv_rmrks_NC(info);
		else if (nc == Cnd_rcv_no) doCnd_rcv_no_NC(info);
		else if (nc == Cnd_note_no) doCnd_note_no_NC(info);
		else if (nc == Cnd_pay_act_no) doCnd_pay_act_no_NC(info);
		else if (nc == Cnd_rcv_mtd_cd) doCnd_rcv_mtd_cd_NC(info);
		else if (nc == Cnd_rcv_mtd_nm) doCnd_rcv_mtd_nm_NC(info);
		else if (nc == Cnd_bank_ac_cd) doCnd_bank_ac_cd_NC(info);
		else if (nc == Cnd_bank_ac_nm) doCnd_bank_ac_nm_NC(info);
		else if (nc == Cnd_cur_cd) doCnd_cur_cd_NC(info);
		else if (nc == Cnd_cur_nm) doCnd_cur_nm_NC(info);
		else if (nc == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NC(info);
		else if (nc == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NC(info);
		else if (nc == Cnd_auto_appl_sts_typ) doCnd_auto_appl_sts_typ_NC(info);
		else if (nc == Cnd_auto_appl_sts_typ_nm) doCnd_auto_appl_sts_typ_nm_NC(info);
		else if (nc == Cnd_if_rcv_no) doCnd_if_rcv_no_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_proc_flg) doCnd_proc_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_rcv_dat_typ) doRslt_rcv_dat_typ_NC(info);
		else if (nc == columnRslt_rcv_dat_typ_nm) doRslt_rcv_dat_typ_nm_NC(info);
		else if (nc == columnRslt_rcv_dpt_cd) doRslt_rcv_dpt_cd_NC(info);
		else if (nc == columnRslt_rcv_dpt_nm) doRslt_rcv_dpt_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_rcv_usr_cd) doRslt_rcv_usr_cd_NC(info);
		else if (nc == columnRslt_rcv_usr_nm) doRslt_rcv_usr_nm_NC(info);
		else if (nc == columnRslt_rcv_no) doRslt_rcv_no_NC(info);
		else if (nc == columnRslt_rcv_dt) doRslt_rcv_dt_NC(info);
		else if (nc == columnRslt_rcst_cd) doRslt_rcst_cd_NC(info);
		else if (nc == columnRslt_rcst_nm) doRslt_rcst_nm_NC(info);
		else if (nc == columnRslt_bcst_cd) doRslt_bcst_cd_NC(info);
		else if (nc == columnRslt_bcst_nm) doRslt_bcst_nm_NC(info);
		else if (nc == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NC(info);
		else if (nc == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_NC(info);
		else if (nc == columnRslt_xfr_psn) doRslt_xfr_psn_NC(info);
		else if (nc == columnRslt_cur_cd) doRslt_cur_cd_NC(info);
		else if (nc == columnRslt_cur_nm) doRslt_cur_nm_NC(info);
		else if (nc == columnRslt_amt_dec_place) doRslt_amt_dec_place_NC(info);
		else if (nc == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NC(info);
		else if (nc == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NC(info);
		else if (nc == columnRslt_bank_ac_no) doRslt_bank_ac_no_NC(info);
		else if (nc == columnRslt_rcv_mtd_cd) doRslt_rcv_mtd_cd_NC(info);
		else if (nc == columnRslt_rcv_mtd_nm) doRslt_rcv_mtd_nm_NC(info);
		else if (nc == columnRslt_note_no) doRslt_note_no_NC(info);
		else if (nc == columnRslt_auto_appl_sts_typ) doRslt_auto_appl_sts_typ_NC(info);
		else if (nc == columnRslt_auto_appl_sts_typ_nm) doRslt_auto_appl_sts_typ_nm_NC(info);
		else if (nc == columnRslt_asppl_cd) doRslt_asppl_cd_NC(info);
		else if (nc == columnRslt_asppl_nm) doRslt_asppl_nm_NC(info);
		else if (nc == columnRslt_bsppl_cd) doRslt_bsppl_cd_NC(info);
		else if (nc == columnRslt_bsppl_nm) doRslt_bsppl_nm_NC(info);
		else if (nc == columnRslt_acst_cd) doRslt_acst_cd_NC(info);
		else if (nc == columnRslt_acst_nm) doRslt_acst_nm_NC(info);
		else if (nc == columnRslt_pay_act_no) doRslt_pay_act_no_NC(info);
		else if (nc == columnRslt_rcv_rmrks) doRslt_rcv_rmrks_NC(info);
		else if (nc == columnRslt_prnt_flg) doRslt_prnt_flg_NC(info);
		else if (nc == columnRslt_div_flg) doRslt_div_flg_NC(info);
		else if (nc == columnRslt_div_src_rcv_no) doRslt_div_src_rcv_no_NC(info);
		else if (nc == columnRslt_src_rcv_act_no) doRslt_src_rcv_act_no_NC(info);
		else if (nc == columnRslt_if_rcv_no) doRslt_if_rcv_no_NC(info);
		else if (nc == columnRslt_fb_flg) doRslt_fb_flg_NC(info);
		else if (nc == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NC(info);
		else if (nc == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NC(info);
		else if (nc == columnRslt_ext_rcv_no) doRslt_ext_rcv_no_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
		else if (nc == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[susp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_susp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fb_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fb_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fb_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fb_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_mtd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_mtd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_mtd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_mtd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[auto_appl_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_auto_appl_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[auto_appl_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_auto_appl_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[if_rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_if_rcv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dat_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dat_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dat_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dat_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_psn_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_mtd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_mtd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_mtd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_mtd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[auto_appl_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_auto_appl_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[auto_appl_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_auto_appl_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_src_rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_src_rcv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_rcv_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_rcv_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_rcv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fb_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fb_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_rcv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == FoldTab) doFold_NE(info);
		else if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_rcv_flg) doCnd_rcv_flg_NE(info);
		else if (ne == Cnd_susp_flg) doCnd_susp_flg_NE(info);
		else if (ne == Cnd_adv_flg) doCnd_adv_flg_NE(info);
		else if (ne == Cnd_ap_flg) doCnd_ap_flg_NE(info);
		else if (ne == Cnd_not_prnt_flg) doCnd_not_prnt_flg_NE(info);
		else if (ne == Cnd_prnt_flg) doCnd_prnt_flg_NE(info);
		else if (ne == Cnd_fb_t_flg) doCnd_fb_t_flg_NE(info);
		else if (ne == Cnd_fb_f_flg) doCnd_fb_f_flg_NE(info);
		else if (ne == Cnd_rcv_dt_fr) doCnd_rcv_dt_fr_NE(info);
		else if (ne == Cnd_rcv_dt_to) doCnd_rcv_dt_to_NE(info);
		else if (ne == Cnd_rcst_cd) doCnd_rcst_cd_NE(info);
		else if (ne == Cnd_rcst_nm) doCnd_rcst_nm_NE(info);
		else if (ne == Cnd_bcst_cd) doCnd_bcst_cd_NE(info);
		else if (ne == Cnd_bcst_nm) doCnd_bcst_nm_NE(info);
		else if (ne == Cnd_rcv_usr_cd) doCnd_rcv_usr_cd_NE(info);
		else if (ne == Cnd_rcv_usr_nm) doCnd_rcv_usr_nm_NE(info);
		else if (ne == Cnd_rcv_dpt_cd) doCnd_rcv_dpt_cd_NE(info);
		else if (ne == Cnd_rcv_dpt_nm) doCnd_rcv_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_rcv_rmrks) doCnd_rcv_rmrks_NE(info);
		else if (ne == Cnd_rcv_no) doCnd_rcv_no_NE(info);
		else if (ne == Cnd_note_no) doCnd_note_no_NE(info);
		else if (ne == Cnd_pay_act_no) doCnd_pay_act_no_NE(info);
		else if (ne == Cnd_rcv_mtd_cd) doCnd_rcv_mtd_cd_NE(info);
		else if (ne == Cnd_rcv_mtd_nm) doCnd_rcv_mtd_nm_NE(info);
		else if (ne == Cnd_bank_ac_cd) doCnd_bank_ac_cd_NE(info);
		else if (ne == Cnd_bank_ac_nm) doCnd_bank_ac_nm_NE(info);
		else if (ne == Cnd_cur_cd) doCnd_cur_cd_NE(info);
		else if (ne == Cnd_cur_nm) doCnd_cur_nm_NE(info);
		else if (ne == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NE(info);
		else if (ne == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NE(info);
		else if (ne == Cnd_auto_appl_sts_typ) doCnd_auto_appl_sts_typ_NE(info);
		else if (ne == Cnd_auto_appl_sts_typ_nm) doCnd_auto_appl_sts_typ_nm_NE(info);
		else if (ne == Cnd_if_rcv_no) doCnd_if_rcv_no_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_proc_flg) doCnd_proc_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_rcv_dat_typ) doRslt_rcv_dat_typ_NE(info);
		else if (ne == columnRslt_rcv_dat_typ_nm) doRslt_rcv_dat_typ_nm_NE(info);
		else if (ne == columnRslt_rcv_dpt_cd) doRslt_rcv_dpt_cd_NE(info);
		else if (ne == columnRslt_rcv_dpt_nm) doRslt_rcv_dpt_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_rcv_usr_cd) doRslt_rcv_usr_cd_NE(info);
		else if (ne == columnRslt_rcv_usr_nm) doRslt_rcv_usr_nm_NE(info);
		else if (ne == columnRslt_rcv_no) doRslt_rcv_no_NE(info);
		else if (ne == columnRslt_rcv_dt) doRslt_rcv_dt_NE(info);
		else if (ne == columnRslt_rcst_cd) doRslt_rcst_cd_NE(info);
		else if (ne == columnRslt_rcst_nm) doRslt_rcst_nm_NE(info);
		else if (ne == columnRslt_bcst_cd) doRslt_bcst_cd_NE(info);
		else if (ne == columnRslt_bcst_nm) doRslt_bcst_nm_NE(info);
		else if (ne == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NE(info);
		else if (ne == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_NE(info);
		else if (ne == columnRslt_xfr_psn) doRslt_xfr_psn_NE(info);
		else if (ne == columnRslt_cur_cd) doRslt_cur_cd_NE(info);
		else if (ne == columnRslt_cur_nm) doRslt_cur_nm_NE(info);
		else if (ne == columnRslt_amt_dec_place) doRslt_amt_dec_place_NE(info);
		else if (ne == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NE(info);
		else if (ne == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NE(info);
		else if (ne == columnRslt_bank_ac_no) doRslt_bank_ac_no_NE(info);
		else if (ne == columnRslt_rcv_mtd_cd) doRslt_rcv_mtd_cd_NE(info);
		else if (ne == columnRslt_rcv_mtd_nm) doRslt_rcv_mtd_nm_NE(info);
		else if (ne == columnRslt_note_no) doRslt_note_no_NE(info);
		else if (ne == columnRslt_auto_appl_sts_typ) doRslt_auto_appl_sts_typ_NE(info);
		else if (ne == columnRslt_auto_appl_sts_typ_nm) doRslt_auto_appl_sts_typ_nm_NE(info);
		else if (ne == columnRslt_asppl_cd) doRslt_asppl_cd_NE(info);
		else if (ne == columnRslt_asppl_nm) doRslt_asppl_nm_NE(info);
		else if (ne == columnRslt_bsppl_cd) doRslt_bsppl_cd_NE(info);
		else if (ne == columnRslt_bsppl_nm) doRslt_bsppl_nm_NE(info);
		else if (ne == columnRslt_acst_cd) doRslt_acst_cd_NE(info);
		else if (ne == columnRslt_acst_nm) doRslt_acst_nm_NE(info);
		else if (ne == columnRslt_pay_act_no) doRslt_pay_act_no_NE(info);
		else if (ne == columnRslt_rcv_rmrks) doRslt_rcv_rmrks_NE(info);
		else if (ne == columnRslt_prnt_flg) doRslt_prnt_flg_NE(info);
		else if (ne == columnRslt_div_flg) doRslt_div_flg_NE(info);
		else if (ne == columnRslt_div_src_rcv_no) doRslt_div_src_rcv_no_NE(info);
		else if (ne == columnRslt_src_rcv_act_no) doRslt_src_rcv_act_no_NE(info);
		else if (ne == columnRslt_if_rcv_no) doRslt_if_rcv_no_NE(info);
		else if (ne == columnRslt_fb_flg) doRslt_fb_flg_NE(info);
		else if (ne == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NE(info);
		else if (ne == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NE(info);
		else if (ne == columnRslt_ext_rcv_no) doRslt_ext_rcv_no_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
		else if (ne == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[susp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_susp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fb_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fb_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fb_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fb_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_mtd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_mtd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_mtd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_mtd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[auto_appl_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_auto_appl_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[auto_appl_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_auto_appl_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[if_rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_if_rcv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dat_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dat_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dat_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dat_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_psn_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_mtd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_mtd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_mtd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_mtd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[auto_appl_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_auto_appl_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[auto_appl_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_auto_appl_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_src_rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_src_rcv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_rcv_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_rcv_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_rcv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fb_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fb_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_rcv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == FoldTab) doFold_NX(info);
		else if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_rcv_flg) doCnd_rcv_flg_NX(info);
		else if (nx == Cnd_susp_flg) doCnd_susp_flg_NX(info);
		else if (nx == Cnd_adv_flg) doCnd_adv_flg_NX(info);
		else if (nx == Cnd_ap_flg) doCnd_ap_flg_NX(info);
		else if (nx == Cnd_not_prnt_flg) doCnd_not_prnt_flg_NX(info);
		else if (nx == Cnd_prnt_flg) doCnd_prnt_flg_NX(info);
		else if (nx == Cnd_fb_t_flg) doCnd_fb_t_flg_NX(info);
		else if (nx == Cnd_fb_f_flg) doCnd_fb_f_flg_NX(info);
		else if (nx == Cnd_rcv_dt_fr) doCnd_rcv_dt_fr_NX(info);
		else if (nx == Cnd_rcv_dt_to) doCnd_rcv_dt_to_NX(info);
		else if (nx == Cnd_rcst_cd) doCnd_rcst_cd_NX(info);
		else if (nx == Cnd_rcst_nm) doCnd_rcst_nm_NX(info);
		else if (nx == Cnd_bcst_cd) doCnd_bcst_cd_NX(info);
		else if (nx == Cnd_bcst_nm) doCnd_bcst_nm_NX(info);
		else if (nx == Cnd_rcv_usr_cd) doCnd_rcv_usr_cd_NX(info);
		else if (nx == Cnd_rcv_usr_nm) doCnd_rcv_usr_nm_NX(info);
		else if (nx == Cnd_rcv_dpt_cd) doCnd_rcv_dpt_cd_NX(info);
		else if (nx == Cnd_rcv_dpt_nm) doCnd_rcv_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_rcv_rmrks) doCnd_rcv_rmrks_NX(info);
		else if (nx == Cnd_rcv_no) doCnd_rcv_no_NX(info);
		else if (nx == Cnd_note_no) doCnd_note_no_NX(info);
		else if (nx == Cnd_pay_act_no) doCnd_pay_act_no_NX(info);
		else if (nx == Cnd_rcv_mtd_cd) doCnd_rcv_mtd_cd_NX(info);
		else if (nx == Cnd_rcv_mtd_nm) doCnd_rcv_mtd_nm_NX(info);
		else if (nx == Cnd_bank_ac_cd) doCnd_bank_ac_cd_NX(info);
		else if (nx == Cnd_bank_ac_nm) doCnd_bank_ac_nm_NX(info);
		else if (nx == Cnd_cur_cd) doCnd_cur_cd_NX(info);
		else if (nx == Cnd_cur_nm) doCnd_cur_nm_NX(info);
		else if (nx == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NX(info);
		else if (nx == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NX(info);
		else if (nx == Cnd_auto_appl_sts_typ) doCnd_auto_appl_sts_typ_NX(info);
		else if (nx == Cnd_auto_appl_sts_typ_nm) doCnd_auto_appl_sts_typ_nm_NX(info);
		else if (nx == Cnd_if_rcv_no) doCnd_if_rcv_no_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_proc_flg) doCnd_proc_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_rcv_dat_typ) doRslt_rcv_dat_typ_NX(info);
		else if (nx == columnRslt_rcv_dat_typ_nm) doRslt_rcv_dat_typ_nm_NX(info);
		else if (nx == columnRslt_rcv_dpt_cd) doRslt_rcv_dpt_cd_NX(info);
		else if (nx == columnRslt_rcv_dpt_nm) doRslt_rcv_dpt_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_rcv_usr_cd) doRslt_rcv_usr_cd_NX(info);
		else if (nx == columnRslt_rcv_usr_nm) doRslt_rcv_usr_nm_NX(info);
		else if (nx == columnRslt_rcv_no) doRslt_rcv_no_NX(info);
		else if (nx == columnRslt_rcv_dt) doRslt_rcv_dt_NX(info);
		else if (nx == columnRslt_rcst_cd) doRslt_rcst_cd_NX(info);
		else if (nx == columnRslt_rcst_nm) doRslt_rcst_nm_NX(info);
		else if (nx == columnRslt_bcst_cd) doRslt_bcst_cd_NX(info);
		else if (nx == columnRslt_bcst_nm) doRslt_bcst_nm_NX(info);
		else if (nx == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NX(info);
		else if (nx == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_NX(info);
		else if (nx == columnRslt_xfr_psn) doRslt_xfr_psn_NX(info);
		else if (nx == columnRslt_cur_cd) doRslt_cur_cd_NX(info);
		else if (nx == columnRslt_cur_nm) doRslt_cur_nm_NX(info);
		else if (nx == columnRslt_amt_dec_place) doRslt_amt_dec_place_NX(info);
		else if (nx == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NX(info);
		else if (nx == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NX(info);
		else if (nx == columnRslt_bank_ac_no) doRslt_bank_ac_no_NX(info);
		else if (nx == columnRslt_rcv_mtd_cd) doRslt_rcv_mtd_cd_NX(info);
		else if (nx == columnRslt_rcv_mtd_nm) doRslt_rcv_mtd_nm_NX(info);
		else if (nx == columnRslt_note_no) doRslt_note_no_NX(info);
		else if (nx == columnRslt_auto_appl_sts_typ) doRslt_auto_appl_sts_typ_NX(info);
		else if (nx == columnRslt_auto_appl_sts_typ_nm) doRslt_auto_appl_sts_typ_nm_NX(info);
		else if (nx == columnRslt_asppl_cd) doRslt_asppl_cd_NX(info);
		else if (nx == columnRslt_asppl_nm) doRslt_asppl_nm_NX(info);
		else if (nx == columnRslt_bsppl_cd) doRslt_bsppl_cd_NX(info);
		else if (nx == columnRslt_bsppl_nm) doRslt_bsppl_nm_NX(info);
		else if (nx == columnRslt_acst_cd) doRslt_acst_cd_NX(info);
		else if (nx == columnRslt_acst_nm) doRslt_acst_nm_NX(info);
		else if (nx == columnRslt_pay_act_no) doRslt_pay_act_no_NX(info);
		else if (nx == columnRslt_rcv_rmrks) doRslt_rcv_rmrks_NX(info);
		else if (nx == columnRslt_prnt_flg) doRslt_prnt_flg_NX(info);
		else if (nx == columnRslt_div_flg) doRslt_div_flg_NX(info);
		else if (nx == columnRslt_div_src_rcv_no) doRslt_div_src_rcv_no_NX(info);
		else if (nx == columnRslt_src_rcv_act_no) doRslt_src_rcv_act_no_NX(info);
		else if (nx == columnRslt_if_rcv_no) doRslt_if_rcv_no_NX(info);
		else if (nx == columnRslt_fb_flg) doRslt_fb_flg_NX(info);
		else if (nx == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NX(info);
		else if (nx == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NX(info);
		else if (nx == columnRslt_ext_rcv_no) doRslt_ext_rcv_no_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
		else if (nx == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[susp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_susp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fb_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fb_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fb_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fb_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_mtd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_mtd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_mtd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_mtd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[auto_appl_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_auto_appl_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[auto_appl_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_auto_appl_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[if_rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_if_rcv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dat_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dat_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dat_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dat_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_psn_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_mtd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_mtd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_mtd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_mtd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[auto_appl_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_auto_appl_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[auto_appl_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_auto_appl_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_src_rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_src_rcv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_rcv_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_rcv_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_rcv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fb_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fb_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_rcv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_rcv_dt_fr) doCnd_rcv_dt_fr_LC(info);
		else if (lc == Cnd_rcv_dt_to) doCnd_rcv_dt_to_LC(info);
		else if (lc == Cnd_rcst_cd) doCnd_rcst_cd_LC(info);
		else if (lc == Cnd_rcst_nm) doCnd_rcst_nm_LC(info);
		else if (lc == Cnd_bcst_cd) doCnd_bcst_cd_LC(info);
		else if (lc == Cnd_bcst_nm) doCnd_bcst_nm_LC(info);
		else if (lc == Cnd_rcv_usr_cd) doCnd_rcv_usr_cd_LC(info);
		else if (lc == Cnd_rcv_usr_nm) doCnd_rcv_usr_nm_LC(info);
		else if (lc == Cnd_rcv_dpt_cd) doCnd_rcv_dpt_cd_LC(info);
		else if (lc == Cnd_rcv_dpt_nm) doCnd_rcv_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_rcv_rmrks) doCnd_rcv_rmrks_LC(info);
		else if (lc == Cnd_rcv_no) doCnd_rcv_no_LC(info);
		else if (lc == Cnd_note_no) doCnd_note_no_LC(info);
		else if (lc == Cnd_pay_act_no) doCnd_pay_act_no_LC(info);
		else if (lc == Cnd_rcv_mtd_cd) doCnd_rcv_mtd_cd_LC(info);
		else if (lc == Cnd_rcv_mtd_nm) doCnd_rcv_mtd_nm_LC(info);
		else if (lc == Cnd_bank_ac_cd) doCnd_bank_ac_cd_LC(info);
		else if (lc == Cnd_bank_ac_nm) doCnd_bank_ac_nm_LC(info);
		else if (lc == Cnd_cur_cd) doCnd_cur_cd_LC(info);
		else if (lc == Cnd_cur_nm) doCnd_cur_nm_LC(info);
		else if (lc == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_LC(info);
		else if (lc == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_LC(info);
		else if (lc == Cnd_auto_appl_sts_typ) doCnd_auto_appl_sts_typ_LC(info);
		else if (lc == Cnd_auto_appl_sts_typ_nm) doCnd_auto_appl_sts_typ_nm_LC(info);
		else if (lc == Cnd_if_rcv_no) doCnd_if_rcv_no_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == columnRslt_rcv_dat_typ) doRslt_rcv_dat_typ_LC(info);
		else if (lc == columnRslt_rcv_dat_typ_nm) doRslt_rcv_dat_typ_nm_LC(info);
		else if (lc == columnRslt_rcv_dpt_cd) doRslt_rcv_dpt_cd_LC(info);
		else if (lc == columnRslt_rcv_dpt_nm) doRslt_rcv_dpt_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_rcv_usr_cd) doRslt_rcv_usr_cd_LC(info);
		else if (lc == columnRslt_rcv_usr_nm) doRslt_rcv_usr_nm_LC(info);
		else if (lc == columnRslt_rcv_no) doRslt_rcv_no_LC(info);
		else if (lc == columnRslt_rcv_dt) doRslt_rcv_dt_LC(info);
		else if (lc == columnRslt_rcst_cd) doRslt_rcst_cd_LC(info);
		else if (lc == columnRslt_rcst_nm) doRslt_rcst_nm_LC(info);
		else if (lc == columnRslt_bcst_cd) doRslt_bcst_cd_LC(info);
		else if (lc == columnRslt_bcst_nm) doRslt_bcst_nm_LC(info);
		else if (lc == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_LC(info);
		else if (lc == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_LC(info);
		else if (lc == columnRslt_xfr_psn) doRslt_xfr_psn_LC(info);
		else if (lc == columnRslt_cur_cd) doRslt_cur_cd_LC(info);
		else if (lc == columnRslt_cur_nm) doRslt_cur_nm_LC(info);
		else if (lc == columnRslt_amt_dec_place) doRslt_amt_dec_place_LC(info);
		else if (lc == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_LC(info);
		else if (lc == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_LC(info);
		else if (lc == columnRslt_bank_ac_no) doRslt_bank_ac_no_LC(info);
		else if (lc == columnRslt_rcv_mtd_cd) doRslt_rcv_mtd_cd_LC(info);
		else if (lc == columnRslt_rcv_mtd_nm) doRslt_rcv_mtd_nm_LC(info);
		else if (lc == columnRslt_note_no) doRslt_note_no_LC(info);
		else if (lc == columnRslt_auto_appl_sts_typ) doRslt_auto_appl_sts_typ_LC(info);
		else if (lc == columnRslt_auto_appl_sts_typ_nm) doRslt_auto_appl_sts_typ_nm_LC(info);
		else if (lc == columnRslt_asppl_cd) doRslt_asppl_cd_LC(info);
		else if (lc == columnRslt_asppl_nm) doRslt_asppl_nm_LC(info);
		else if (lc == columnRslt_bsppl_cd) doRslt_bsppl_cd_LC(info);
		else if (lc == columnRslt_bsppl_nm) doRslt_bsppl_nm_LC(info);
		else if (lc == columnRslt_acst_cd) doRslt_acst_cd_LC(info);
		else if (lc == columnRslt_acst_nm) doRslt_acst_nm_LC(info);
		else if (lc == columnRslt_pay_act_no) doRslt_pay_act_no_LC(info);
		else if (lc == columnRslt_rcv_rmrks) doRslt_rcv_rmrks_LC(info);
		else if (lc == columnRslt_div_src_rcv_no) doRslt_div_src_rcv_no_LC(info);
		else if (lc == columnRslt_src_rcv_act_no) doRslt_src_rcv_act_no_LC(info);
		else if (lc == columnRslt_if_rcv_no) doRslt_if_rcv_no_LC(info);
		else if (lc == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_LC(info);
		else if (lc == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_LC(info);
		else if (lc == columnRslt_ext_rcv_no) doRslt_ext_rcv_no_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[rcv_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_mtd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_mtd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_mtd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_mtd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bank_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[auto_appl_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_auto_appl_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[auto_appl_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_auto_appl_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[if_rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_if_rcv_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dat_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dat_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dat_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dat_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_psn_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_mtd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_mtd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_mtd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_mtd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[auto_appl_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_auto_appl_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[auto_appl_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_auto_appl_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_src_rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_src_rcv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_rcv_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_rcv_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[if_rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_if_rcv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_rcv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_rcst_cd]の作成メソッド
	 */
	public MCList getCnd_rcst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bcst_cd]の作成メソッド
	 */
	public MCList getCnd_bcst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rcv_usr_cd]の作成メソッド
	 */
	public MCList getCnd_rcv_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rcv_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_rcv_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rcv_mtd_cd]の作成メソッド
	 */
	public MCList getCnd_rcv_mtd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0080.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0080.MSUAP_List", this)).getSttlRcv(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bank_ac_cd]の作成メソッド
	 */
	public MCList getCnd_bank_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBankAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bill_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_bill_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_auto_appl_sts_typ]の作成メソッド
	 */
	public MCList getCnd_auto_appl_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getAutoApplStsTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBGL0150.Srch01")) {
			return new MS_MSBGL0150_Srch01Bridge();
		}
		if (id.equals("MS.MSBGL0150.Prnt01")) {
			return new MS_MSBGL0150_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBGL0150_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0150_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0150_Srch01;

		/** コンストラクタ */
		protected MS_MSBGL0150_Srch01Bridge() {
			p_MS_MSBGL0150_Srch01 = new MCParam(PDef.MS_MSBGL0150_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0150_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0150.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0150.RsltR.class));

			p_MS_MSBGL0150_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0150_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0150_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0150_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0150_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0150.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0150.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBG.MSBGP0150.RsltR> down0() {
			return (MCList<mcframe.clientMSBG.MSBGP0150.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0150_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0150.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0150_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBG.MSBGP0150.RsltR>)p_MS_MSBGL0150_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBGL0150_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0150_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0150_Prnt01;

		/** コンストラクタ */
		protected MS_MSBGL0150_Prnt01Bridge() {
			p_MS_MSBGL0150_Prnt01 = new MCParam(PDef.MS_MSBGL0150_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0150_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBG.MSBGP0150.RsltR.class));
			param.addUpBlock(mcframe.clientMSBG.MSBGP0150.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0150.RsltR.class));

			p_MS_MSBGL0150_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0150_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0150_Prnt01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBGL0150_Prnt01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0150_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0150_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBG.MSBGP0150.RsltR> up0() {
			return (MCList<mcframe.clientMSBG.MSBGP0150.RsltR>)up(0);
		}
		protected mcframe.clientMSBG.MSBGP0150.BtnR up1() {
			return (mcframe.clientMSBG.MSBGP0150.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBG.MSBGP0150.RsltR> down0() {
			return (MCList<mcframe.clientMSBG.MSBGP0150.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0150_Prnt01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0150.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0150_Prnt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBG.MSBGP0150.RsltR>)p_MS_MSBGL0150_Prnt01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}