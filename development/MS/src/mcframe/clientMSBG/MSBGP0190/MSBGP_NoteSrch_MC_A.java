package mcframe.clientMSBG.MSBGP0190;

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
import mcframe.clientMSBG.MSBGP0190.MSBGP_NoteSrch_MC.MS_MSBGL0190_Srch01Caller;

/**
 * 画面"MSBGP_NoteSrch"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGP_NoteSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBGP0190";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
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
	// [Mode]ブロック関連のField定義
	public MCPanel ModePanel = null;
	public MCTitledBorder ModeTitledBorder = null;
	// [Mode]ブロックの項目のField定義
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
	 * Outstanding 未決済.<p>
	 *
	 */
	public MCCheckBox Cnd_not_mat_flg = null;
	/**
	 * Settlement 決済.<p>
	 *
	 */
	public MCCheckBox Cnd_mat_flg = null;
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
	public MCLabel Cnd_draw_dt_fr_Label = null;
	/**
	 * Drawing date FROM 振出日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_draw_dt_fr = null;
	public MCLabel Cnd_draw_dt_to_Label = null;
	/**
	 * Drawing date TO 振出日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_draw_dt_to = null;
	public MCLabel Cnd_due_dt_fr_Label = null;
	/**
	 * Payment due date FROM 支払期日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_due_dt_fr = null;
	public MCLabel Cnd_due_dt_to_Label = null;
	/**
	 * Payment due date TO 支払期日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_due_dt_to = null;
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
	public MCLabel Cnd_note_no_Label = null;
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public MCTextField Cnd_note_no = null;
	public MCLabel Cnd_note_typ_Label = null;
	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_note_typ = null;
	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public MCTextField Cnd_note_typ_nm = null;
	public MCLabel Cnd_drawer_nm_Label = null;
	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public MCTextField Cnd_drawer_nm = null;
	public MCLabel Cnd_note_rsn_cd_Label = null;
	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_note_rsn_cd = null;
	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public MCTextField Cnd_note_rsn_nm = null;
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
	public MCLabel Cnd_rcv_no_Label = null;
	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rcv_no = null;
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
	public MCLabel Cnd_rcv_act_no_Label = null;
	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rcv_act_no = null;
	public MCLabel Cnd_sub_char1_Label = null;
	/**
	 * Note spare 1 手形予備１.<p>
	 *
	 */
	public MCTextField Cnd_sub_char1 = null;
	public MCLabel Cnd_sub_char2_Label = null;
	/**
	 * Note spare 2 手形予備２.<p>
	 *
	 */
	public MCTextField Cnd_sub_char2 = null;
	public MCLabel Cnd_sub_char3_Label = null;
	/**
	 * Note spare 3 手形予備３.<p>
	 *
	 */
	public MCTextField Cnd_sub_char3 = null;
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
	public MCTable2<mcframe.clientMSBG.MSBGP0190.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Settlement 決済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mat_flg = null;
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
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_no = null;
	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_typ = null;
	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_typ_nm = null;
	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_draw_dt = null;
	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_due_dt = null;
	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_drawer_nm = null;
	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public MCColumnConfig columnRslt_endrsr = null;
	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public MCColumnConfig columnRslt_accptr = null;
	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_draw_bank_cd = null;
	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_draw_bank_nm = null;
	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_draw_branch_cd = null;
	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_draw_branch_nm = null;
	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_rsn_cd = null;
	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_rsn_nm = null;
	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_no = null;
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
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_act_no = null;
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
	 * Note spare 1 手形予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char1 = null;
	/**
	 * Note spare 2 手形予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char2 = null;
	/**
	 * Note spare 3 手形予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char3 = null;
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
	 * Payment received entry 入金登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0140 = null;
	/**
	 * AR reconciliation entry 売掛消込登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0210 = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, REF};
	
	/** [MS_MSBGL0190_Srch01]のCallerの作成 */
	protected MSBGP_NoteSrch_MC.MS_MSBGL0190_Srch01Caller createMS_MSBGL0190_Srch01() {
		MSBGP_NoteSrch_MC.MS_MSBGL0190_Srch01Caller<MSBGP_NoteSrch, MS_MSBGL0190_Srch01Bridge>
		caller = ((MSBGP_NoteSrch_MC)this).new MS_MSBGL0190_Srch01Caller<MSBGP_NoteSrch, MS_MSBGL0190_Srch01Bridge>(
					(MSBGP_NoteSrch)this, new MS_MSBGL0190_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBGL0190_Srch01]の呼び出し */
	protected void callMS_MSBGL0190_Srch01() {
		MCCaller caller = createMS_MSBGL0190_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0190.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0190.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBG.MSBGP0190.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0190.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0190.CndR createCndR() {
		return mcframe.clientMSBG.MSBGP0190.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBG.MSBGP0190.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0190.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBG.MSBGP0190.RsltR createRsltR() {
		return mcframe.clientMSBG.MSBGP0190.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0190.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0190.RsltR.class);
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
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
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
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(ModePanel);
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
	public MSBGP_NoteSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBGP_NoteSrch_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBGP_NoteSrch_MC.jbCreateTop((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbCreateFold((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbCreateTab1((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbCreateMode((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbCreateFbTgt((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbCreateTab2((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbCreateTab3((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbCreateRcstCnd((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbCreateBcstCnd((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbCreateCnd((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbCreateCtrl((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbCreateRPnl((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbCreateRslt((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbCreateBtn((MSBGP_NoteSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBGP_NoteSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBGP_NoteSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBGP_NoteSrch p) {
	}

	/**
	 * [Mode]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMode(MSBGP_NoteSrch p) {
	}

	/**
	 * [FbTgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFbTgt(MSBGP_NoteSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBGP_NoteSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBGP_NoteSrch p) {
	}

	/**
	 * [RcstCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRcstCnd(MSBGP_NoteSrch p) {
	}

	/**
	 * [BcstCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBcstCnd(MSBGP_NoteSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBGP_NoteSrch p) {
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
	protected static void jbCreateCtrl(MSBGP_NoteSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBGP_NoteSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBGP_NoteSrch p) {
		p.Rslt_rcv_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0190.RsltR.$rcv_amt_p);
		p.Rslt_rcv_amt_p_PPanel.setName("Rslt.rcv_amt_p");
		p.columnRslt_rcv_amt = p.Rslt_rcv_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_rcv_amt.addAliasName("Rslt.rcv_amt", p);
		p.Rslt_rcv_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBG.MSBGP0190.RsltR.$rcv_grp_p);
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
		p.Rslt_bill_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBG.MSBGP0190.RsltR.$bill_grp_p);
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
	protected static void jbCreateBtn(MSBGP_NoteSrch p) {
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
	
	
	/** [Cnd_note_typ_ListPutter]の定義 */
	private MCListPutter Cnd_note_typ_p = null;

	/**
	 * [Cnd_note_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_note_typ_ListPutter() {
		if (Cnd_note_typ_p == null) {
			Cnd_note_typ_p = createCnd_note_typ_ListPutter(Cnd_note_typ, "note_typ", "note_typ_nm");

		}
		return Cnd_note_typ_p;
	}
	
	
	/** [Cnd_note_rsn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_note_rsn_cd_p = null;

	/**
	 * [Cnd_note_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_note_rsn_cd_ListPutter() {
		if (Cnd_note_rsn_cd_p == null) {
			Cnd_note_rsn_cd_p = createCnd_note_rsn_cd_ListPutter(Cnd_note_rsn_cd, "note_rsn_cd", "note_rsn_nm");

		}
		return Cnd_note_rsn_cd_p;
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_NoteSrch create(){
		MSBGP_NoteSrch p = new MSBGP_NoteSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_NoteSrch create(String name){
		MSBGP_NoteSrch p = new MSBGP_NoteSrch(name);
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
		MSBGP_NoteSrch_MC.jbfInitTop((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbfInitFold((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbfInitTab1((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbfInitMode((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbfInitFbTgt((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbfInitTab2((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbfInitTab3((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbfInitRcstCnd((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbfInitBcstCnd((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbfInitCnd((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbfInitCtrl((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbfInitRPnl((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbfInitRslt((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbfInitBtn((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbInitTop((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbInitFold((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbInitTab1((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbInitMode((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbInitFbTgt((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbInitTab2((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbInitTab3((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbInitRcstCnd((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbInitBcstCnd((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbInitCnd((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbInitCtrl((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbInitRPnl((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbInitRslt((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.jbInitBtn((MSBGP_NoteSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBGP_NoteSrch p) {
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
	protected static void jbfInitTab1(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Mode]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMode(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.ModePanel = p.beansFactory.createPanel("Mode");
		p.ModeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [FbTgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFbTgt(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.FbTgtPanel = p.beansFactory.createPanel("FbTgt");
		p.FbTgtTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [RcstCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRcstCnd(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.RcstCndPanel = p.beansFactory.createPanel("RcstCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [BcstCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBcstCnd(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.BcstCndPanel = p.beansFactory.createPanel("BcstCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_not_mat_flg = p.beansFactory.createCheckBox("Cnd.not_mat_flg");
		p.Cnd_mat_flg = p.beansFactory.createCheckBox("Cnd.mat_flg");
		p.Cnd_fb_t_flg = p.beansFactory.createCheckBox("Cnd.fb_t_flg");
		p.Cnd_fb_f_flg = p.beansFactory.createCheckBox("Cnd.fb_f_flg");
		p.Cnd_rcv_dt_fr_Label = p.beansFactory.createLabel("Cnd.rcv_dt_fr_Label");
		p.Cnd_rcv_dt_fr = p.beansFactory.createDateField("Cnd.rcv_dt_fr");
		p.Cnd_rcv_dt_fr.setLabel(p.Cnd_rcv_dt_fr_Label);
		p.Cnd_rcv_dt_to_Label = p.beansFactory.createLabel("Cnd.rcv_dt_to_Label");
		p.Cnd_rcv_dt_to = p.beansFactory.createDateField("Cnd.rcv_dt_to");
		p.Cnd_rcv_dt_to.setLabel(p.Cnd_rcv_dt_to_Label);
		p.Cnd_draw_dt_fr_Label = p.beansFactory.createLabel("Cnd.draw_dt_fr_Label");
		p.Cnd_draw_dt_fr = p.beansFactory.createDateField("Cnd.draw_dt_fr");
		p.Cnd_draw_dt_fr.setLabel(p.Cnd_draw_dt_fr_Label);
		p.Cnd_draw_dt_to_Label = p.beansFactory.createLabel("Cnd.draw_dt_to_Label");
		p.Cnd_draw_dt_to = p.beansFactory.createDateField("Cnd.draw_dt_to");
		p.Cnd_draw_dt_to.setLabel(p.Cnd_draw_dt_to_Label);
		p.Cnd_due_dt_fr_Label = p.beansFactory.createLabel("Cnd.due_dt_fr_Label");
		p.Cnd_due_dt_fr = p.beansFactory.createDateField("Cnd.due_dt_fr");
		p.Cnd_due_dt_fr.setLabel(p.Cnd_due_dt_fr_Label);
		p.Cnd_due_dt_to_Label = p.beansFactory.createLabel("Cnd.due_dt_to_Label");
		p.Cnd_due_dt_to = p.beansFactory.createDateField("Cnd.due_dt_to");
		p.Cnd_due_dt_to.setLabel(p.Cnd_due_dt_to_Label);
		p.Cnd_rcst_cd_Label = p.beansFactory.createLabel("Cnd.rcst_cd_Label");
		p.Cnd_rcst_cd = p.beansFactory.createTextField("Cnd.rcst_cd");
		p.Cnd_rcst_cd.setLabel(p.Cnd_rcst_cd_Label);
		p.Cnd_rcst_nm = p.beansFactory.createTextField("Cnd.rcst_nm");
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
		p.Cnd_bcst_cd_Label = p.beansFactory.createLabel("Cnd.bcst_cd_Label");
		p.Cnd_bcst_cd = p.beansFactory.createTextField("Cnd.bcst_cd");
		p.Cnd_bcst_cd.setLabel(p.Cnd_bcst_cd_Label);
		p.Cnd_bcst_nm = p.beansFactory.createTextField("Cnd.bcst_nm");
		p.Cnd_bill_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bill_dpt_cd_Label");
		p.Cnd_bill_dpt_cd = p.beansFactory.createTextField("Cnd.bill_dpt_cd");
		p.Cnd_bill_dpt_cd.setLabel(p.Cnd_bill_dpt_cd_Label);
		p.Cnd_bill_dpt_nm = p.beansFactory.createTextField("Cnd.bill_dpt_nm");
		p.Cnd_note_no_Label = p.beansFactory.createLabel("Cnd.note_no_Label");
		p.Cnd_note_no = p.beansFactory.createTextField("Cnd.note_no");
		p.Cnd_note_no.setLabel(p.Cnd_note_no_Label);
		p.Cnd_note_typ_Label = p.beansFactory.createLabel("Cnd.note_typ_Label");
		p.Cnd_note_typ = p.beansFactory.createTextComboBox("Cnd.note_typ");
		p.Cnd_note_typ.setLabel(p.Cnd_note_typ_Label);
		p.Cnd_note_typ_nm = p.beansFactory.createTextField("Cnd.note_typ_nm");
		p.Cnd_drawer_nm_Label = p.beansFactory.createLabel("Cnd.drawer_nm_Label");
		p.Cnd_drawer_nm = p.beansFactory.createTextField("Cnd.drawer_nm");
		p.Cnd_drawer_nm.setLabel(p.Cnd_drawer_nm_Label);
		p.Cnd_note_rsn_cd_Label = p.beansFactory.createLabel("Cnd.note_rsn_cd_Label");
		p.Cnd_note_rsn_cd = p.beansFactory.createTextComboBox("Cnd.note_rsn_cd");
		p.Cnd_note_rsn_cd.setLabel(p.Cnd_note_rsn_cd_Label);
		p.Cnd_note_rsn_nm = p.beansFactory.createTextField("Cnd.note_rsn_nm");
		p.Cnd_cur_cd_Label = p.beansFactory.createLabel("Cnd.cur_cd_Label");
		p.Cnd_cur_cd = p.beansFactory.createTextComboBox("Cnd.cur_cd");
		p.Cnd_cur_cd.setLabel(p.Cnd_cur_cd_Label);
		p.Cnd_cur_nm = p.beansFactory.createTextField("Cnd.cur_nm");
		p.Cnd_rcv_no_Label = p.beansFactory.createLabel("Cnd.rcv_no_Label");
		p.Cnd_rcv_no = p.beansFactory.createTextField("Cnd.rcv_no");
		p.Cnd_rcv_no.setLabel(p.Cnd_rcv_no_Label);
		p.Cnd_rcv_mtd_cd_Label = p.beansFactory.createLabel("Cnd.rcv_mtd_cd_Label");
		p.Cnd_rcv_mtd_cd = p.beansFactory.createTextComboBox("Cnd.rcv_mtd_cd");
		p.Cnd_rcv_mtd_cd.setLabel(p.Cnd_rcv_mtd_cd_Label);
		p.Cnd_rcv_mtd_nm = p.beansFactory.createTextField("Cnd.rcv_mtd_nm");
		p.Cnd_rcv_act_no_Label = p.beansFactory.createLabel("Cnd.rcv_act_no_Label");
		p.Cnd_rcv_act_no = p.beansFactory.createTextField("Cnd.rcv_act_no");
		p.Cnd_rcv_act_no.setLabel(p.Cnd_rcv_act_no_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_mat_flg = p.beansFactory.createTableColumn("Rslt.mat_flg", MCColumnType.CHECK);
		p.columnRslt_rcv_dpt_cd = p.beansFactory.createTableColumn("Rslt.rcv_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_rcv_dpt_nm = p.beansFactory.createTableColumn("Rslt.rcv_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_rcv_usr_cd = p.beansFactory.createTableColumn("Rslt.rcv_usr_cd", MCColumnType.TEXT);
		p.columnRslt_rcv_usr_nm = p.beansFactory.createTableColumn("Rslt.rcv_usr_nm", MCColumnType.TEXT);
		p.columnRslt_rcv_dt = p.beansFactory.createTableColumn("Rslt.rcv_dt", MCColumnType.DATE);
		p.columnRslt_rcst_cd = p.beansFactory.createTableColumn("Rslt.rcst_cd", MCColumnType.TEXT);
		p.columnRslt_rcst_nm = p.beansFactory.createTableColumn("Rslt.rcst_nm", MCColumnType.TEXT);
		p.columnRslt_bcst_cd = p.beansFactory.createTableColumn("Rslt.bcst_cd", MCColumnType.TEXT);
		p.columnRslt_bcst_nm = p.beansFactory.createTableColumn("Rslt.bcst_nm", MCColumnType.TEXT);
		p.columnRslt_bill_dpt_cd = p.beansFactory.createTableColumn("Rslt.bill_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_bill_dpt_nm = p.beansFactory.createTableColumn("Rslt.bill_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_cur_cd = p.beansFactory.createTableColumn("Rslt.cur_cd", MCColumnType.TEXT);
		p.columnRslt_cur_nm = p.beansFactory.createTableColumn("Rslt.cur_nm", MCColumnType.TEXT);
		p.columnRslt_amt_dec_place = p.beansFactory.createTableColumn("Rslt.amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_note_no = p.beansFactory.createTableColumn("Rslt.note_no", MCColumnType.TEXT);
		p.columnRslt_note_typ = p.beansFactory.createTableColumn("Rslt.note_typ", MCColumnType.TEXT);
		p.columnRslt_note_typ_nm = p.beansFactory.createTableColumn("Rslt.note_typ_nm", MCColumnType.TEXT);
		p.columnRslt_draw_dt = p.beansFactory.createTableColumn("Rslt.draw_dt", MCColumnType.DATE);
		p.columnRslt_due_dt = p.beansFactory.createTableColumn("Rslt.due_dt", MCColumnType.DATE);
		p.columnRslt_drawer_nm = p.beansFactory.createTableColumn("Rslt.drawer_nm", MCColumnType.TEXT);
		p.columnRslt_endrsr = p.beansFactory.createTableColumn("Rslt.endrsr", MCColumnType.TEXT);
		p.columnRslt_accptr = p.beansFactory.createTableColumn("Rslt.accptr", MCColumnType.TEXT);
		p.columnRslt_draw_bank_cd = p.beansFactory.createTableColumn("Rslt.draw_bank_cd", MCColumnType.TEXT);
		p.columnRslt_draw_bank_nm = p.beansFactory.createTableColumn("Rslt.draw_bank_nm", MCColumnType.TEXT);
		p.columnRslt_draw_branch_cd = p.beansFactory.createTableColumn("Rslt.draw_branch_cd", MCColumnType.TEXT);
		p.columnRslt_draw_branch_nm = p.beansFactory.createTableColumn("Rslt.draw_branch_nm", MCColumnType.TEXT);
		p.columnRslt_note_rsn_cd = p.beansFactory.createTableColumn("Rslt.note_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_note_rsn_nm = p.beansFactory.createTableColumn("Rslt.note_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_rcv_no = p.beansFactory.createTableColumn("Rslt.rcv_no", MCColumnType.TEXT);
		p.columnRslt_rcv_mtd_cd = p.beansFactory.createTableColumn("Rslt.rcv_mtd_cd", MCColumnType.TEXT);
		p.columnRslt_rcv_mtd_nm = p.beansFactory.createTableColumn("Rslt.rcv_mtd_nm", MCColumnType.TEXT);
		p.columnRslt_rcv_act_no = p.beansFactory.createTableColumn("Rslt.rcv_act_no", MCColumnType.TEXT);
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
	protected static void jbfInitBtn(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBGP0140 = p.beansFactory.createButton("Btn.open_MSBGP0140", "open");
		p.Btn_open_MSBGP0210 = p.beansFactory.createButton("Btn.open_MSBGP0210", "open");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
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
	protected static void jbInitFold(MSBGP_NoteSrch p) {
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
	protected static void jbInitTab1(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.ModePanel, null);
		p.Tab1Panel.setLastBeans(p.ModePanel);
		p.ModePanel.setNextBeans(p.FbTgtPanel);
		p.Tab1Panel.add(p.FbTgtPanel, null);
		p.FbTgtPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Mode]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMode(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.ModePanel.setBorder(p.ModeTitledBorder);
		p.ModePanel.setValueCheck(false);
		p.ModePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ModePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [FbTgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFbTgt(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.FbTgtPanel.setBorder(p.FbTgtTitledBorder);
		p.FbTgtPanel.setValueCheck(false);
		p.FbTgtPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FbTgtPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBGP_NoteSrch p) {
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
	protected static void jbInitTab3(MSBGP_NoteSrch p) {
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
	protected static void jbInitRcstCnd(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.RcstCndPanel.setValueCheck(false);
		p.RcstCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RcstCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [BcstCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBcstCnd(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.BcstCndPanel.setValueCheck(false);
		p.BcstCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BcstCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ModePanel.add(p.Cnd_not_mat_flg);
		p.ModePanel.setLastBeans(p.Cnd_not_mat_flg);
		p.Cnd_not_mat_flg.setNextBeans(p.Cnd_mat_flg);
		p.Cnd_not_mat_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.not_mat_flg_META);
		p.ModePanel.add(p.Cnd_mat_flg);
		p.Cnd_mat_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.mat_flg_META);
		p.FbTgtPanel.add(p.Cnd_fb_t_flg);
		p.FbTgtPanel.setLastBeans(p.Cnd_fb_t_flg);
		p.Cnd_fb_t_flg.setNextBeans(p.Cnd_fb_f_flg);
		p.Cnd_fb_t_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.fb_t_flg_META);
		p.FbTgtPanel.add(p.Cnd_fb_f_flg);
		p.Cnd_fb_f_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.fb_f_flg_META);
		p.CndPanel.add(p.Cnd_rcv_dt_fr_Label);
		p.CndPanel.add(p.Cnd_rcv_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_rcv_dt_fr);
		p.Cnd_rcv_dt_fr.setNextBeans(p.Cnd_rcv_dt_to);
		p.Cnd_rcv_dt_fr.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.rcv_dt_fr_META);
		p.Cnd_rcv_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rcv_dt_to_Label);
		p.CndPanel.add(p.Cnd_rcv_dt_to);
		p.Cnd_rcv_dt_to.setNextBeans(p.Cnd_draw_dt_fr);
		p.Cnd_rcv_dt_to.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.rcv_dt_to_META);
		p.Cnd_rcv_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_draw_dt_fr_Label);
		p.CndPanel.add(p.Cnd_draw_dt_fr);
		p.Cnd_draw_dt_fr.setNextBeans(p.Cnd_draw_dt_to);
		p.Cnd_draw_dt_fr.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.draw_dt_fr_META);
		p.Cnd_draw_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_draw_dt_to_Label);
		p.CndPanel.add(p.Cnd_draw_dt_to);
		p.Cnd_draw_dt_to.setNextBeans(p.Cnd_due_dt_fr);
		p.Cnd_draw_dt_to.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.draw_dt_to_META);
		p.Cnd_draw_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_due_dt_fr_Label);
		p.CndPanel.add(p.Cnd_due_dt_fr);
		p.Cnd_due_dt_fr.setNextBeans(p.Cnd_due_dt_to);
		p.Cnd_due_dt_fr.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.due_dt_fr_META);
		p.Cnd_due_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_due_dt_to_Label);
		p.CndPanel.add(p.Cnd_due_dt_to);
		p.Cnd_due_dt_to.setNextBeans(p.Cnd_rcst_cd);
		p.Cnd_due_dt_to.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.due_dt_to_META);
		p.Cnd_due_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rcst_cd_Label);
		p.CndPanel.add(p.Cnd_rcst_cd);
		p.Cnd_rcst_cd.setNextBeans(p.Cnd_rcst_nm);
		p.Cnd_rcst_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.rcst_cd_META);
		p.Cnd_rcst_cd.addLinkBeans(p.Cnd_rcst_nm);
		p.Cnd_rcst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rcst_cd, true);
		p.CndPanel.add(p.Cnd_rcst_nm);
		p.Cnd_rcst_nm.setNextBeans(p.Cnd_rcv_usr_cd);
		p.Cnd_rcst_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.rcst_nm_META);
		p.setPluralValueEnable(p.Cnd_rcst_nm, true);
		p.CndPanel.add(p.Cnd_rcv_usr_cd_Label);
		p.CndPanel.add(p.Cnd_rcv_usr_cd);
		p.Cnd_rcv_usr_cd.setNextBeans(p.Cnd_rcv_usr_nm);
		p.Cnd_rcv_usr_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.rcv_usr_cd_META);
		p.Cnd_rcv_usr_cd.addLinkBeans(p.Cnd_rcv_usr_nm);
		p.Cnd_rcv_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rcv_usr_cd, true);
		p.CndPanel.add(p.Cnd_rcv_usr_nm);
		p.Cnd_rcv_usr_nm.setNextBeans(p.Cnd_rcv_dpt_cd);
		p.Cnd_rcv_usr_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.rcv_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_rcv_usr_nm, true);
		p.CndPanel.add(p.Cnd_rcv_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_rcv_dpt_cd);
		p.Cnd_rcv_dpt_cd.setNextBeans(p.Cnd_rcv_dpt_nm);
		p.Cnd_rcv_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.rcv_dpt_cd_META);
		p.Cnd_rcv_dpt_cd.addLinkBeans(p.Cnd_rcv_dpt_nm);
		p.Cnd_rcv_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rcv_dpt_cd, true);
		p.CndPanel.add(p.Cnd_rcv_dpt_nm);
		p.Cnd_rcv_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_rcv_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.rcv_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_rcv_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_bcst_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_bcst_cd_Label);
		p.CndPanel.add(p.Cnd_bcst_cd);
		p.Cnd_bcst_cd.setNextBeans(p.Cnd_bcst_nm);
		p.Cnd_bcst_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.bcst_cd_META);
		p.Cnd_bcst_cd.addLinkBeans(p.Cnd_bcst_nm);
		p.Cnd_bcst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bcst_cd, true);
		p.CndPanel.add(p.Cnd_bcst_nm);
		p.Cnd_bcst_nm.setNextBeans(p.Cnd_bill_dpt_cd);
		p.Cnd_bcst_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.bcst_nm_META);
		p.setPluralValueEnable(p.Cnd_bcst_nm, true);
		p.CndPanel.add(p.Cnd_bill_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bill_dpt_cd);
		p.Cnd_bill_dpt_cd.setNextBeans(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.bill_dpt_cd_META);
		p.Cnd_bill_dpt_cd.addLinkBeans(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bill_dpt_cd, true);
		p.CndPanel.add(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_nm.setNextBeans(p.Cnd_note_no);
		p.Cnd_bill_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.bill_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bill_dpt_nm, true);
		p.CndPanel.add(p.Cnd_note_no_Label);
		p.CndPanel.add(p.Cnd_note_no);
		p.Cnd_note_no.setNextBeans(p.Cnd_note_typ);
		p.Cnd_note_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.note_no_META);
		p.setPluralValueEnable(p.Cnd_note_no, true);
		p.Cnd_note_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_note_typ, true);
		p.Cnd_note_typ.setLinkBeans(p.Cnd_note_typ_nm);
		p.CndPanel.add(p.Cnd_note_typ_Label);
		p.CndPanel.add(p.Cnd_note_typ);
		p.Cnd_note_typ.setNextBeans(p.Cnd_note_typ_nm);
		p.Cnd_note_typ.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.note_typ_META);
		p.CndPanel.add(p.Cnd_note_typ_nm);
		p.Cnd_note_typ_nm.setNextBeans(p.Cnd_drawer_nm);
		p.Cnd_note_typ_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.note_typ_nm_META);
		p.CndPanel.add(p.Cnd_drawer_nm_Label);
		p.CndPanel.add(p.Cnd_drawer_nm);
		p.Cnd_drawer_nm.setNextBeans(p.Cnd_note_rsn_cd);
		p.Cnd_drawer_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.drawer_nm_META);
		p.setPluralValueEnable(p.Cnd_drawer_nm, true);
		p.Cnd_note_rsn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_note_rsn_cd, true);
		p.Cnd_note_rsn_cd.setLinkBeans(p.Cnd_note_rsn_nm);
		p.CndPanel.add(p.Cnd_note_rsn_cd_Label);
		p.CndPanel.add(p.Cnd_note_rsn_cd);
		p.Cnd_note_rsn_cd.setNextBeans(p.Cnd_note_rsn_nm);
		p.Cnd_note_rsn_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.note_rsn_cd_META);
		p.CndPanel.add(p.Cnd_note_rsn_nm);
		p.Cnd_note_rsn_nm.setNextBeans(p.Cnd_cur_cd);
		p.Cnd_note_rsn_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.note_rsn_nm_META);
		p.setPluralValueEnable(p.Cnd_note_rsn_nm, true);
		p.Cnd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cur_cd, true);
		p.Cnd_cur_cd.setLinkBeans(p.Cnd_cur_nm);
		p.CndPanel.add(p.Cnd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_cur_cd);
		p.Cnd_cur_cd.setNextBeans(p.Cnd_cur_nm);
		p.Cnd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.cur_cd_META);
		p.CndPanel.add(p.Cnd_cur_nm);
		p.Cnd_cur_nm.setNextBeans(p.Cnd_rcv_no);
		p.Cnd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.cur_nm_META);
		p.setPluralValueEnable(p.Cnd_cur_nm, true);
		p.CndPanel.add(p.Cnd_rcv_no_Label);
		p.CndPanel.add(p.Cnd_rcv_no);
		p.Cnd_rcv_no.setNextBeans(p.Cnd_rcv_mtd_cd);
		p.Cnd_rcv_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.rcv_no_META);
		p.setPluralValueEnable(p.Cnd_rcv_no, true);
		p.Cnd_rcv_mtd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rcv_mtd_cd, true);
		p.Cnd_rcv_mtd_cd.setLinkBeans(p.Cnd_rcv_mtd_nm);
		p.CndPanel.add(p.Cnd_rcv_mtd_cd_Label);
		p.CndPanel.add(p.Cnd_rcv_mtd_cd);
		p.Cnd_rcv_mtd_cd.setNextBeans(p.Cnd_rcv_mtd_nm);
		p.Cnd_rcv_mtd_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.rcv_mtd_cd_META);
		p.CndPanel.add(p.Cnd_rcv_mtd_nm);
		p.Cnd_rcv_mtd_nm.setNextBeans(p.Cnd_rcv_act_no);
		p.Cnd_rcv_mtd_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.rcv_mtd_nm_META);
		p.setPluralValueEnable(p.Cnd_rcv_mtd_nm, true);
		p.CndPanel.add(p.Cnd_rcv_act_no_Label);
		p.CndPanel.add(p.Cnd_rcv_act_no);
		p.Cnd_rcv_act_no.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_rcv_act_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.rcv_act_no_META);
		p.setPluralValueEnable(p.Cnd_rcv_act_no, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0190.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.RcstCndPanel.add(p.Cnd_rcv_grp_PPanel);
		p.RcstCndPanel.setLastBeans(p.Cnd_rcv_grp_PPanel);
		p.BcstCndPanel.add(p.Cnd_bill_grp_PPanel);
		p.BcstCndPanel.setLastBeans(p.Cnd_bill_grp_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBGP_NoteSrch p) {
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
	protected static void jbInitRPnl(MSBGP_NoteSrch p) {
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
	protected static void jbInitRslt(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBGP_NoteSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBGP0140.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBGP0140);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBGP0140);
		p.Btn_open_MSBGP0140.setNextBeans(p.Btn_open_MSBGP0210);
		p.Btn_open_MSBGP0210.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBGP0210);
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
		MSBGP_NoteSrch_MC.mcInitTop((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.mcInitFold((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.mcInitTab1((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.mcInitMode((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.mcInitFbTgt((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.mcInitTab2((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.mcInitTab3((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.mcInitRcstCnd((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.mcInitBcstCnd((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.mcInitCnd((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.mcInitCtrl((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.mcInitRPnl((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.mcInitRslt((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.mcInitBtn((MSBGP_NoteSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBGP_NoteSrch_MC.statusInitSRCH_Top((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitSRCH_Fold((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitSRCH_Tab1((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitSRCH_Mode((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitSRCH_FbTgt((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitSRCH_Tab2((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitSRCH_Tab3((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitSRCH_RcstCnd((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitSRCH_BcstCnd((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitSRCH_Cnd((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitSRCH_Ctrl((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitSRCH_RPnl((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitSRCH_Rslt((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitSRCH_Btn((MSBGP_NoteSrch)this);

		// [REF]ステータスのモードの設定
		MSBGP_NoteSrch_MC.statusInitREF_Top((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitREF_Fold((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitREF_Tab1((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitREF_Mode((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitREF_FbTgt((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitREF_Tab2((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitREF_Tab3((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitREF_RcstCnd((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitREF_BcstCnd((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitREF_Cnd((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitREF_Ctrl((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitREF_RPnl((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitREF_Rslt((MSBGP_NoteSrch)this);
		MSBGP_NoteSrch_MC.statusInitREF_Btn((MSBGP_NoteSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBGP_NoteSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBGP_NoteSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBGP_NoteSrch p) {
	}

	/**
	 *  [Mode]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMode(MSBGP_NoteSrch p) {
	}

	/**
	 *  [FbTgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFbTgt(MSBGP_NoteSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBGP_NoteSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBGP_NoteSrch p) {
	}

	/**
	 *  [RcstCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRcstCnd(MSBGP_NoteSrch p) {
	}

	/**
	 *  [BcstCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBcstCnd(MSBGP_NoteSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBGP_NoteSrch p) {
		p.Cnd_not_mat_flg.addAllListener(p);
		p.Cnd_mat_flg.addAllListener(p);
		p.Cnd_fb_t_flg.addAllListener(p);
		p.Cnd_fb_f_flg.addAllListener(p);
		p.Cnd_rcv_dt_fr.setListListener(p);
		p.Cnd_rcv_dt_fr.addAllListener(p);
		p.Cnd_rcv_dt_to.setListListener(p);
		p.Cnd_rcv_dt_to.addAllListener(p);
		p.Cnd_draw_dt_fr.setListListener(p);
		p.Cnd_draw_dt_fr.addAllListener(p);
		p.Cnd_draw_dt_to.setListListener(p);
		p.Cnd_draw_dt_to.addAllListener(p);
		p.Cnd_due_dt_fr.setListListener(p);
		p.Cnd_due_dt_fr.addAllListener(p);
		p.Cnd_due_dt_to.setListListener(p);
		p.Cnd_due_dt_to.addAllListener(p);
		p.Cnd_rcst_cd.setListListener(p);
		p.Cnd_rcst_cd.addAllListener(p);
		p.Cnd_rcst_nm.setListListener(p);
		p.Cnd_rcst_nm.addAllListener(p);
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
		p.Cnd_bcst_cd.setListListener(p);
		p.Cnd_bcst_cd.addAllListener(p);
		p.Cnd_bcst_nm.setListListener(p);
		p.Cnd_bcst_nm.addAllListener(p);
		p.Cnd_bill_dpt_cd.setListListener(p);
		p.Cnd_bill_dpt_cd.addAllListener(p);
		p.Cnd_bill_dpt_nm.setListListener(p);
		p.Cnd_bill_dpt_nm.addAllListener(p);
		p.Cnd_note_no.setListListener(p);
		p.Cnd_note_no.addAllListener(p);
		p.Cnd_note_typ.setListListener(p);
		p.Cnd_note_typ.addAllListener(p);
		p.Cnd_note_typ_nm.setListListener(p);
		p.Cnd_note_typ_nm.addAllListener(p);
		p.Cnd_drawer_nm.setListListener(p);
		p.Cnd_drawer_nm.addAllListener(p);
		p.Cnd_note_rsn_cd.setListListener(p);
		p.Cnd_note_rsn_cd.addAllListener(p);
		p.Cnd_note_rsn_nm.setListListener(p);
		p.Cnd_note_rsn_nm.addAllListener(p);
		p.Cnd_cur_cd.setListListener(p);
		p.Cnd_cur_cd.addAllListener(p);
		p.Cnd_cur_nm.setListListener(p);
		p.Cnd_cur_nm.addAllListener(p);
		p.Cnd_rcv_no.setListListener(p);
		p.Cnd_rcv_no.addAllListener(p);
		p.Cnd_rcv_mtd_cd.setListListener(p);
		p.Cnd_rcv_mtd_cd.addAllListener(p);
		p.Cnd_rcv_mtd_nm.setListListener(p);
		p.Cnd_rcv_mtd_nm.addAllListener(p);
		p.Cnd_rcv_act_no.setListListener(p);
		p.Cnd_rcv_act_no.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBGP_NoteSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBGP_NoteSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBGP_NoteSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_mat_flg.addAllListener(p);
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
		p.columnRslt_cur_cd.addAllListener(p);
		p.columnRslt_cur_cd.setListListener(p);
		p.columnRslt_cur_nm.addAllListener(p);
		p.columnRslt_cur_nm.setListListener(p);
		p.columnRslt_amt_dec_place.addAllListener(p);
		p.columnRslt_amt_dec_place.setListListener(p);
		p.columnRslt_note_no.addAllListener(p);
		p.columnRslt_note_no.setListListener(p);
		p.columnRslt_note_typ.addAllListener(p);
		p.columnRslt_note_typ.setListListener(p);
		p.columnRslt_note_typ_nm.addAllListener(p);
		p.columnRslt_note_typ_nm.setListListener(p);
		p.columnRslt_draw_dt.addAllListener(p);
		p.columnRslt_draw_dt.setListListener(p);
		p.columnRslt_due_dt.addAllListener(p);
		p.columnRslt_due_dt.setListListener(p);
		p.columnRslt_drawer_nm.addAllListener(p);
		p.columnRslt_drawer_nm.setListListener(p);
		p.columnRslt_endrsr.addAllListener(p);
		p.columnRslt_endrsr.setListListener(p);
		p.columnRslt_accptr.addAllListener(p);
		p.columnRslt_accptr.setListListener(p);
		p.columnRslt_draw_bank_cd.addAllListener(p);
		p.columnRslt_draw_bank_cd.setListListener(p);
		p.columnRslt_draw_bank_nm.addAllListener(p);
		p.columnRslt_draw_bank_nm.setListListener(p);
		p.columnRslt_draw_branch_cd.addAllListener(p);
		p.columnRslt_draw_branch_cd.setListListener(p);
		p.columnRslt_draw_branch_nm.addAllListener(p);
		p.columnRslt_draw_branch_nm.setListListener(p);
		p.columnRslt_note_rsn_cd.addAllListener(p);
		p.columnRslt_note_rsn_cd.setListListener(p);
		p.columnRslt_note_rsn_nm.addAllListener(p);
		p.columnRslt_note_rsn_nm.setListListener(p);
		p.columnRslt_rcv_no.addAllListener(p);
		p.columnRslt_rcv_no.setListListener(p);
		p.columnRslt_rcv_mtd_cd.addAllListener(p);
		p.columnRslt_rcv_mtd_cd.setListListener(p);
		p.columnRslt_rcv_mtd_nm.addAllListener(p);
		p.columnRslt_rcv_mtd_nm.setListListener(p);
		p.columnRslt_rcv_act_no.addAllListener(p);
		p.columnRslt_rcv_act_no.setListListener(p);
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
	protected static void mcInitBtn(MSBGP_NoteSrch p) {
		p.Btn_open_MSBGP0140.addAllListener(p);
		p.Btn_open_MSBGP0140.setAPMethodName("doBtn_open_MSBGP0140");
		p.Btn_open_MSBGP0210.addAllListener(p);
		p.Btn_open_MSBGP0210.setAPMethodName("doBtn_open_MSBGP0210");
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBGP_NoteSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBGP_NoteSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBGP_NoteSrch p){

	}

	/**
	 * [SRCH]ステータスの[Mode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Mode(MSBGP_NoteSrch p){

	}

	/**
	 * [SRCH]ステータスの[FbTgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_FbTgt(MSBGP_NoteSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBGP_NoteSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MSBGP_NoteSrch p){

	}

	/**
	 * [SRCH]ステータスの[RcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RcstCnd(MSBGP_NoteSrch p){

	}

	/**
	 * [SRCH]ステータスの[BcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BcstCnd(MSBGP_NoteSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBGP_NoteSrch p){
		p.Cnd_not_mat_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_mat_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_fb_t_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_fb_f_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_draw_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_draw_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_due_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_due_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_note_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_note_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_note_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_drawer_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_note_rsn_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_note_rsn_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_mtd_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_mtd_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_act_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_grp_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bill_grp_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBGP_NoteSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBGP_NoteSrch p){
		p.RPnl_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBGP_NoteSrch p){
		p.columnRslt_mat_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_rcv_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_note_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_draw_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_drawer_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_endrsr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_accptr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_mtd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_mtd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_fb_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ext_rcv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
	protected static void statusInitSRCH_Btn(MSBGP_NoteSrch p){
		p.Btn_open_MSBGP0140.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBGP0210.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBGP_NoteSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBGP_NoteSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBGP_NoteSrch p){

	}

	/**
	 * [REF]ステータスの[Mode]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mode(MSBGP_NoteSrch p){

	}

	/**
	 * [REF]ステータスの[FbTgt]ブロックのモードの設定
	 */
	protected static void statusInitREF_FbTgt(MSBGP_NoteSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBGP_NoteSrch p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MSBGP_NoteSrch p){

	}

	/**
	 * [REF]ステータスの[RcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_RcstCnd(MSBGP_NoteSrch p){

	}

	/**
	 * [REF]ステータスの[BcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_BcstCnd(MSBGP_NoteSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBGP_NoteSrch p){
		p.Cnd_not_mat_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_mat_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_fb_t_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_fb_f_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_draw_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_draw_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_due_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_due_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_note_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_note_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_note_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_drawer_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_note_rsn_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_note_rsn_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_mtd_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_mtd_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_act_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_grp_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bill_grp_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBGP_NoteSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBGP_NoteSrch p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBGP_NoteSrch p){
		p.columnRslt_mat_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_rcv_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_note_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_note_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_note_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_draw_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_drawer_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_endrsr.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_accptr.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_mtd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_mtd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_fb_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ext_rcv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rcv_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_bill_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
	protected static void statusInitREF_Btn(MSBGP_NoteSrch p){
		p.Btn_open_MSBGP0140.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBGP0210.putMode(p, REF, MCMode.ENABLE);

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
		MSBGP_NoteSrch_MC.setTableConfigRslt((MSBGP_NoteSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBGP_NoteSrch p) {
		p.columnRslt_mat_flg.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.mat_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mat_flg);
		p.columnRslt_rcv_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.rcv_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_dpt_cd);
		p.columnRslt_rcv_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.rcv_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_dpt_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_rcv_usr_cd.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.rcv_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_usr_cd);
		p.columnRslt_rcv_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.rcv_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_usr_nm);
		p.columnRslt_rcv_dt.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.rcv_dt_META);
		p.columnRslt_rcv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_dt);
		p.columnRslt_rcst_cd.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.rcst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcst_cd);
		p.columnRslt_rcst_nm.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.rcst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcst_nm);
		p.columnRslt_bcst_cd.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.bcst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bcst_cd);
		p.columnRslt_bcst_nm.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.bcst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bcst_nm);
		p.columnRslt_bill_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.bill_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_dpt_cd);
		p.columnRslt_bill_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.bill_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_dpt_nm);
		p.columnRslt_cur_cd.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cur_cd);
		p.columnRslt_cur_nm.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cur_nm);
		p.columnRslt_amt_dec_place.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt_dec_place);
		p.RsltTable.addTable(p.Rslt_rcv_amt_p_PPanel.AmtTable);
		p.columnRslt_note_no.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.note_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_no);
		p.columnRslt_note_typ.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.note_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_typ);
		p.columnRslt_note_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.note_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_typ_nm);
		p.columnRslt_draw_dt.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.draw_dt_META);
		p.columnRslt_draw_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_dt);
		p.columnRslt_due_dt.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.due_dt_META);
		p.columnRslt_due_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_due_dt);
		p.columnRslt_drawer_nm.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.drawer_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_drawer_nm);
		p.columnRslt_endrsr.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.endrsr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_endrsr);
		p.columnRslt_accptr.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.accptr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_accptr);
		p.columnRslt_draw_bank_cd.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.draw_bank_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_bank_cd);
		p.columnRslt_draw_bank_nm.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.draw_bank_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_bank_nm);
		p.columnRslt_draw_branch_cd.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.draw_branch_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_branch_cd);
		p.columnRslt_draw_branch_nm.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.draw_branch_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_branch_nm);
		p.columnRslt_note_rsn_cd.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.note_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_rsn_cd);
		p.columnRslt_note_rsn_nm.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.note_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_rsn_nm);
		p.columnRslt_rcv_no.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.rcv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_no);
		p.columnRslt_rcv_mtd_cd.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.rcv_mtd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_mtd_cd);
		p.columnRslt_rcv_mtd_nm.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.rcv_mtd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_mtd_nm);
		p.columnRslt_rcv_act_no.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.rcv_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_act_no);
		p.columnRslt_fb_flg.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.fb_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fb_flg);
		p.columnRslt_ext_sys_cd.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.ext_sys_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_cd);
		p.columnRslt_ext_sys_nm.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.ext_sys_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_nm);
		p.columnRslt_ext_rcv_no.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.ext_rcv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_rcv_no);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.RsltTable.addTable(p.Rslt_rcv_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_bill_grp_p_PPanel.BpGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBG.MSBGP0190.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_rcst_cd.getListConfig().setPutter(getCnd_rcst_cd_ListPutter());
		Cnd_rcv_usr_cd.getListConfig().setPutter(getCnd_rcv_usr_cd_ListPutter());
		Cnd_rcv_dpt_cd.getListConfig().setPutter(getCnd_rcv_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_bcst_cd.getListConfig().setPutter(getCnd_bcst_cd_ListPutter());
		Cnd_bill_dpt_cd.getListConfig().setPutter(getCnd_bill_dpt_cd_ListPutter());
		Cnd_note_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_note_typ.getListConfig().setPutter(getCnd_note_typ_ListPutter());
		Cnd_note_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_note_rsn_cd.getListConfig().setPutter(getCnd_note_rsn_cd_ListPutter());
		Cnd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cur_cd.getListConfig().setPutter(getCnd_cur_cd_ListPutter());
		Cnd_rcv_mtd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rcv_mtd_cd.getListConfig().setPutter(getCnd_rcv_mtd_cd_ListPutter());
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
	 * [Cnd_bcst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bcst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
	 * [Cnd_note_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_note_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NoteTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_note_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_note_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NoteRsn");
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
	 * [Cnd_rcv_mtd_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rcv_mtd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0080.SttlRcv");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_rcst_cd) return getCnd_rcst_cd(row, info);
		if(combo == Cnd_rcv_usr_cd) return getCnd_rcv_usr_cd(row, info);
		if(combo == Cnd_rcv_dpt_cd) return getCnd_rcv_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_bcst_cd) return getCnd_bcst_cd(row, info);
		if(combo == Cnd_bill_dpt_cd) return getCnd_bill_dpt_cd(row, info);
		if(combo == Cnd_note_typ) return getCnd_note_typ(row, info);
		if(combo == Cnd_note_rsn_cd) return getCnd_note_rsn_cd(row, info);
		if(combo == Cnd_cur_cd) return getCnd_cur_cd(row, info);
		if(combo == Cnd_rcv_mtd_cd) return getCnd_rcv_mtd_cd(row, info);
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
		else if (ap == Btn_open_MSBGP0140) doBtn_open_MSBGP0140(info);
		else if (ap == Btn_open_MSBGP0210) doBtn_open_MSBGP0210(info);
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
	 * [Btn]パネルの[open_MSBGP0140]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0140(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBGP0210]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0210(MCEventInfo info);

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
		if (vc == Cnd_not_mat_flg) return doCnd_not_mat_flg_VC(info);
		if (vc == Cnd_mat_flg) return doCnd_mat_flg_VC(info);
		if (vc == Cnd_fb_t_flg) return doCnd_fb_t_flg_VC(info);
		if (vc == Cnd_fb_f_flg) return doCnd_fb_f_flg_VC(info);
		if (vc == Cnd_rcv_dt_fr) return doCnd_rcv_dt_fr_VC(info);
		if (vc == Cnd_rcv_dt_to) return doCnd_rcv_dt_to_VC(info);
		if (vc == Cnd_draw_dt_fr) return doCnd_draw_dt_fr_VC(info);
		if (vc == Cnd_draw_dt_to) return doCnd_draw_dt_to_VC(info);
		if (vc == Cnd_due_dt_fr) return doCnd_due_dt_fr_VC(info);
		if (vc == Cnd_due_dt_to) return doCnd_due_dt_to_VC(info);
		if (vc == Cnd_rcst_cd) return doCnd_rcst_cd_VC(info);
		if (vc == Cnd_rcst_nm) return doCnd_rcst_nm_VC(info);
		if (vc == Cnd_rcv_usr_cd) return doCnd_rcv_usr_cd_VC(info);
		if (vc == Cnd_rcv_usr_nm) return doCnd_rcv_usr_nm_VC(info);
		if (vc == Cnd_rcv_dpt_cd) return doCnd_rcv_dpt_cd_VC(info);
		if (vc == Cnd_rcv_dpt_nm) return doCnd_rcv_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_bcst_cd) return doCnd_bcst_cd_VC(info);
		if (vc == Cnd_bcst_nm) return doCnd_bcst_nm_VC(info);
		if (vc == Cnd_bill_dpt_cd) return doCnd_bill_dpt_cd_VC(info);
		if (vc == Cnd_bill_dpt_nm) return doCnd_bill_dpt_nm_VC(info);
		if (vc == Cnd_note_no) return doCnd_note_no_VC(info);
		if (vc == Cnd_note_typ) return doCnd_note_typ_VC(info);
		if (vc == Cnd_note_typ_nm) return doCnd_note_typ_nm_VC(info);
		if (vc == Cnd_drawer_nm) return doCnd_drawer_nm_VC(info);
		if (vc == Cnd_note_rsn_cd) return doCnd_note_rsn_cd_VC(info);
		if (vc == Cnd_note_rsn_nm) return doCnd_note_rsn_nm_VC(info);
		if (vc == Cnd_cur_cd) return doCnd_cur_cd_VC(info);
		if (vc == Cnd_cur_nm) return doCnd_cur_nm_VC(info);
		if (vc == Cnd_rcv_no) return doCnd_rcv_no_VC(info);
		if (vc == Cnd_rcv_mtd_cd) return doCnd_rcv_mtd_cd_VC(info);
		if (vc == Cnd_rcv_mtd_nm) return doCnd_rcv_mtd_nm_VC(info);
		if (vc == Cnd_rcv_act_no) return doCnd_rcv_act_no_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == columnRslt_mat_flg) return doRslt_mat_flg_VC(info);
		if (vc == columnRslt_rcv_dpt_cd) return doRslt_rcv_dpt_cd_VC(info);
		if (vc == columnRslt_rcv_dpt_nm) return doRslt_rcv_dpt_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_rcv_usr_cd) return doRslt_rcv_usr_cd_VC(info);
		if (vc == columnRslt_rcv_usr_nm) return doRslt_rcv_usr_nm_VC(info);
		if (vc == columnRslt_rcv_dt) return doRslt_rcv_dt_VC(info);
		if (vc == columnRslt_rcst_cd) return doRslt_rcst_cd_VC(info);
		if (vc == columnRslt_rcst_nm) return doRslt_rcst_nm_VC(info);
		if (vc == columnRslt_bcst_cd) return doRslt_bcst_cd_VC(info);
		if (vc == columnRslt_bcst_nm) return doRslt_bcst_nm_VC(info);
		if (vc == columnRslt_bill_dpt_cd) return doRslt_bill_dpt_cd_VC(info);
		if (vc == columnRslt_bill_dpt_nm) return doRslt_bill_dpt_nm_VC(info);
		if (vc == columnRslt_cur_cd) return doRslt_cur_cd_VC(info);
		if (vc == columnRslt_cur_nm) return doRslt_cur_nm_VC(info);
		if (vc == columnRslt_amt_dec_place) return doRslt_amt_dec_place_VC(info);
		if (vc == columnRslt_note_no) return doRslt_note_no_VC(info);
		if (vc == columnRslt_note_typ) return doRslt_note_typ_VC(info);
		if (vc == columnRslt_note_typ_nm) return doRslt_note_typ_nm_VC(info);
		if (vc == columnRslt_draw_dt) return doRslt_draw_dt_VC(info);
		if (vc == columnRslt_due_dt) return doRslt_due_dt_VC(info);
		if (vc == columnRslt_drawer_nm) return doRslt_drawer_nm_VC(info);
		if (vc == columnRslt_endrsr) return doRslt_endrsr_VC(info);
		if (vc == columnRslt_accptr) return doRslt_accptr_VC(info);
		if (vc == columnRslt_draw_bank_cd) return doRslt_draw_bank_cd_VC(info);
		if (vc == columnRslt_draw_bank_nm) return doRslt_draw_bank_nm_VC(info);
		if (vc == columnRslt_draw_branch_cd) return doRslt_draw_branch_cd_VC(info);
		if (vc == columnRslt_draw_branch_nm) return doRslt_draw_branch_nm_VC(info);
		if (vc == columnRslt_note_rsn_cd) return doRslt_note_rsn_cd_VC(info);
		if (vc == columnRslt_note_rsn_nm) return doRslt_note_rsn_nm_VC(info);
		if (vc == columnRslt_rcv_no) return doRslt_rcv_no_VC(info);
		if (vc == columnRslt_rcv_mtd_cd) return doRslt_rcv_mtd_cd_VC(info);
		if (vc == columnRslt_rcv_mtd_nm) return doRslt_rcv_mtd_nm_VC(info);
		if (vc == columnRslt_rcv_act_no) return doRslt_rcv_act_no_VC(info);
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
	 * [Cnd]パネルの[not_mat_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_mat_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mat_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mat_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[draw_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_draw_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[draw_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_draw_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[due_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_due_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[due_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_due_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[note_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_note_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[note_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_note_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[note_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_note_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[drawer_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_drawer_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[note_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_note_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[note_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_note_rsn_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcv_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_act_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[mat_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mat_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[note_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[draw_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_draw_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[due_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_due_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_drawer_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[endrsr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_endrsr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[accptr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_accptr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[draw_bank_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_draw_bank_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[draw_bank_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_draw_bank_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[draw_branch_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_draw_branch_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[draw_branch_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_draw_branch_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_rsn_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcv_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_act_no_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_not_mat_flg) doCnd_not_mat_flg_NC(info);
		else if (nc == Cnd_mat_flg) doCnd_mat_flg_NC(info);
		else if (nc == Cnd_fb_t_flg) doCnd_fb_t_flg_NC(info);
		else if (nc == Cnd_fb_f_flg) doCnd_fb_f_flg_NC(info);
		else if (nc == Cnd_rcv_dt_fr) doCnd_rcv_dt_fr_NC(info);
		else if (nc == Cnd_rcv_dt_to) doCnd_rcv_dt_to_NC(info);
		else if (nc == Cnd_draw_dt_fr) doCnd_draw_dt_fr_NC(info);
		else if (nc == Cnd_draw_dt_to) doCnd_draw_dt_to_NC(info);
		else if (nc == Cnd_due_dt_fr) doCnd_due_dt_fr_NC(info);
		else if (nc == Cnd_due_dt_to) doCnd_due_dt_to_NC(info);
		else if (nc == Cnd_rcst_cd) doCnd_rcst_cd_NC(info);
		else if (nc == Cnd_rcst_nm) doCnd_rcst_nm_NC(info);
		else if (nc == Cnd_rcv_usr_cd) doCnd_rcv_usr_cd_NC(info);
		else if (nc == Cnd_rcv_usr_nm) doCnd_rcv_usr_nm_NC(info);
		else if (nc == Cnd_rcv_dpt_cd) doCnd_rcv_dpt_cd_NC(info);
		else if (nc == Cnd_rcv_dpt_nm) doCnd_rcv_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_bcst_cd) doCnd_bcst_cd_NC(info);
		else if (nc == Cnd_bcst_nm) doCnd_bcst_nm_NC(info);
		else if (nc == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NC(info);
		else if (nc == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NC(info);
		else if (nc == Cnd_note_no) doCnd_note_no_NC(info);
		else if (nc == Cnd_note_typ) doCnd_note_typ_NC(info);
		else if (nc == Cnd_note_typ_nm) doCnd_note_typ_nm_NC(info);
		else if (nc == Cnd_drawer_nm) doCnd_drawer_nm_NC(info);
		else if (nc == Cnd_note_rsn_cd) doCnd_note_rsn_cd_NC(info);
		else if (nc == Cnd_note_rsn_nm) doCnd_note_rsn_nm_NC(info);
		else if (nc == Cnd_cur_cd) doCnd_cur_cd_NC(info);
		else if (nc == Cnd_cur_nm) doCnd_cur_nm_NC(info);
		else if (nc == Cnd_rcv_no) doCnd_rcv_no_NC(info);
		else if (nc == Cnd_rcv_mtd_cd) doCnd_rcv_mtd_cd_NC(info);
		else if (nc == Cnd_rcv_mtd_nm) doCnd_rcv_mtd_nm_NC(info);
		else if (nc == Cnd_rcv_act_no) doCnd_rcv_act_no_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == columnRslt_mat_flg) doRslt_mat_flg_NC(info);
		else if (nc == columnRslt_rcv_dpt_cd) doRslt_rcv_dpt_cd_NC(info);
		else if (nc == columnRslt_rcv_dpt_nm) doRslt_rcv_dpt_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_rcv_usr_cd) doRslt_rcv_usr_cd_NC(info);
		else if (nc == columnRslt_rcv_usr_nm) doRslt_rcv_usr_nm_NC(info);
		else if (nc == columnRslt_rcv_dt) doRslt_rcv_dt_NC(info);
		else if (nc == columnRslt_rcst_cd) doRslt_rcst_cd_NC(info);
		else if (nc == columnRslt_rcst_nm) doRslt_rcst_nm_NC(info);
		else if (nc == columnRslt_bcst_cd) doRslt_bcst_cd_NC(info);
		else if (nc == columnRslt_bcst_nm) doRslt_bcst_nm_NC(info);
		else if (nc == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NC(info);
		else if (nc == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_NC(info);
		else if (nc == columnRslt_cur_cd) doRslt_cur_cd_NC(info);
		else if (nc == columnRslt_cur_nm) doRslt_cur_nm_NC(info);
		else if (nc == columnRslt_amt_dec_place) doRslt_amt_dec_place_NC(info);
		else if (nc == columnRslt_note_no) doRslt_note_no_NC(info);
		else if (nc == columnRslt_note_typ) doRslt_note_typ_NC(info);
		else if (nc == columnRslt_note_typ_nm) doRslt_note_typ_nm_NC(info);
		else if (nc == columnRslt_draw_dt) doRslt_draw_dt_NC(info);
		else if (nc == columnRslt_due_dt) doRslt_due_dt_NC(info);
		else if (nc == columnRslt_drawer_nm) doRslt_drawer_nm_NC(info);
		else if (nc == columnRslt_endrsr) doRslt_endrsr_NC(info);
		else if (nc == columnRslt_accptr) doRslt_accptr_NC(info);
		else if (nc == columnRslt_draw_bank_cd) doRslt_draw_bank_cd_NC(info);
		else if (nc == columnRslt_draw_bank_nm) doRslt_draw_bank_nm_NC(info);
		else if (nc == columnRslt_draw_branch_cd) doRslt_draw_branch_cd_NC(info);
		else if (nc == columnRslt_draw_branch_nm) doRslt_draw_branch_nm_NC(info);
		else if (nc == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_NC(info);
		else if (nc == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_NC(info);
		else if (nc == columnRslt_rcv_no) doRslt_rcv_no_NC(info);
		else if (nc == columnRslt_rcv_mtd_cd) doRslt_rcv_mtd_cd_NC(info);
		else if (nc == columnRslt_rcv_mtd_nm) doRslt_rcv_mtd_nm_NC(info);
		else if (nc == columnRslt_rcv_act_no) doRslt_rcv_act_no_NC(info);
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
	 * [Cnd]パネルの[not_mat_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_mat_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mat_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mat_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[draw_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_draw_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[draw_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_draw_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[due_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_due_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[due_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_due_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[note_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[drawer_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_drawer_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcv_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_act_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[mat_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mat_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[note_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accptr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accptr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcv_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_no_NC(MCEventInfo info){
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
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == FoldTab) doFold_NE(info);
		else if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_not_mat_flg) doCnd_not_mat_flg_NE(info);
		else if (ne == Cnd_mat_flg) doCnd_mat_flg_NE(info);
		else if (ne == Cnd_fb_t_flg) doCnd_fb_t_flg_NE(info);
		else if (ne == Cnd_fb_f_flg) doCnd_fb_f_flg_NE(info);
		else if (ne == Cnd_rcv_dt_fr) doCnd_rcv_dt_fr_NE(info);
		else if (ne == Cnd_rcv_dt_to) doCnd_rcv_dt_to_NE(info);
		else if (ne == Cnd_draw_dt_fr) doCnd_draw_dt_fr_NE(info);
		else if (ne == Cnd_draw_dt_to) doCnd_draw_dt_to_NE(info);
		else if (ne == Cnd_due_dt_fr) doCnd_due_dt_fr_NE(info);
		else if (ne == Cnd_due_dt_to) doCnd_due_dt_to_NE(info);
		else if (ne == Cnd_rcst_cd) doCnd_rcst_cd_NE(info);
		else if (ne == Cnd_rcst_nm) doCnd_rcst_nm_NE(info);
		else if (ne == Cnd_rcv_usr_cd) doCnd_rcv_usr_cd_NE(info);
		else if (ne == Cnd_rcv_usr_nm) doCnd_rcv_usr_nm_NE(info);
		else if (ne == Cnd_rcv_dpt_cd) doCnd_rcv_dpt_cd_NE(info);
		else if (ne == Cnd_rcv_dpt_nm) doCnd_rcv_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_bcst_cd) doCnd_bcst_cd_NE(info);
		else if (ne == Cnd_bcst_nm) doCnd_bcst_nm_NE(info);
		else if (ne == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NE(info);
		else if (ne == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NE(info);
		else if (ne == Cnd_note_no) doCnd_note_no_NE(info);
		else if (ne == Cnd_note_typ) doCnd_note_typ_NE(info);
		else if (ne == Cnd_note_typ_nm) doCnd_note_typ_nm_NE(info);
		else if (ne == Cnd_drawer_nm) doCnd_drawer_nm_NE(info);
		else if (ne == Cnd_note_rsn_cd) doCnd_note_rsn_cd_NE(info);
		else if (ne == Cnd_note_rsn_nm) doCnd_note_rsn_nm_NE(info);
		else if (ne == Cnd_cur_cd) doCnd_cur_cd_NE(info);
		else if (ne == Cnd_cur_nm) doCnd_cur_nm_NE(info);
		else if (ne == Cnd_rcv_no) doCnd_rcv_no_NE(info);
		else if (ne == Cnd_rcv_mtd_cd) doCnd_rcv_mtd_cd_NE(info);
		else if (ne == Cnd_rcv_mtd_nm) doCnd_rcv_mtd_nm_NE(info);
		else if (ne == Cnd_rcv_act_no) doCnd_rcv_act_no_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == columnRslt_mat_flg) doRslt_mat_flg_NE(info);
		else if (ne == columnRslt_rcv_dpt_cd) doRslt_rcv_dpt_cd_NE(info);
		else if (ne == columnRslt_rcv_dpt_nm) doRslt_rcv_dpt_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_rcv_usr_cd) doRslt_rcv_usr_cd_NE(info);
		else if (ne == columnRslt_rcv_usr_nm) doRslt_rcv_usr_nm_NE(info);
		else if (ne == columnRslt_rcv_dt) doRslt_rcv_dt_NE(info);
		else if (ne == columnRslt_rcst_cd) doRslt_rcst_cd_NE(info);
		else if (ne == columnRslt_rcst_nm) doRslt_rcst_nm_NE(info);
		else if (ne == columnRslt_bcst_cd) doRslt_bcst_cd_NE(info);
		else if (ne == columnRslt_bcst_nm) doRslt_bcst_nm_NE(info);
		else if (ne == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NE(info);
		else if (ne == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_NE(info);
		else if (ne == columnRslt_cur_cd) doRslt_cur_cd_NE(info);
		else if (ne == columnRslt_cur_nm) doRslt_cur_nm_NE(info);
		else if (ne == columnRslt_amt_dec_place) doRslt_amt_dec_place_NE(info);
		else if (ne == columnRslt_note_no) doRslt_note_no_NE(info);
		else if (ne == columnRslt_note_typ) doRslt_note_typ_NE(info);
		else if (ne == columnRslt_note_typ_nm) doRslt_note_typ_nm_NE(info);
		else if (ne == columnRslt_draw_dt) doRslt_draw_dt_NE(info);
		else if (ne == columnRslt_due_dt) doRslt_due_dt_NE(info);
		else if (ne == columnRslt_drawer_nm) doRslt_drawer_nm_NE(info);
		else if (ne == columnRslt_endrsr) doRslt_endrsr_NE(info);
		else if (ne == columnRslt_accptr) doRslt_accptr_NE(info);
		else if (ne == columnRslt_draw_bank_cd) doRslt_draw_bank_cd_NE(info);
		else if (ne == columnRslt_draw_bank_nm) doRslt_draw_bank_nm_NE(info);
		else if (ne == columnRslt_draw_branch_cd) doRslt_draw_branch_cd_NE(info);
		else if (ne == columnRslt_draw_branch_nm) doRslt_draw_branch_nm_NE(info);
		else if (ne == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_NE(info);
		else if (ne == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_NE(info);
		else if (ne == columnRslt_rcv_no) doRslt_rcv_no_NE(info);
		else if (ne == columnRslt_rcv_mtd_cd) doRslt_rcv_mtd_cd_NE(info);
		else if (ne == columnRslt_rcv_mtd_nm) doRslt_rcv_mtd_nm_NE(info);
		else if (ne == columnRslt_rcv_act_no) doRslt_rcv_act_no_NE(info);
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
	 * [Cnd]パネルの[not_mat_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_mat_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mat_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mat_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[draw_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_draw_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[draw_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_draw_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[due_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_due_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[due_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_due_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[note_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[drawer_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_drawer_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[rcv_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_act_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[mat_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mat_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[note_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accptr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accptr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[rcv_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_no_NE(MCEventInfo info){
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
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == FoldTab) doFold_NX(info);
		else if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_not_mat_flg) doCnd_not_mat_flg_NX(info);
		else if (nx == Cnd_mat_flg) doCnd_mat_flg_NX(info);
		else if (nx == Cnd_fb_t_flg) doCnd_fb_t_flg_NX(info);
		else if (nx == Cnd_fb_f_flg) doCnd_fb_f_flg_NX(info);
		else if (nx == Cnd_rcv_dt_fr) doCnd_rcv_dt_fr_NX(info);
		else if (nx == Cnd_rcv_dt_to) doCnd_rcv_dt_to_NX(info);
		else if (nx == Cnd_draw_dt_fr) doCnd_draw_dt_fr_NX(info);
		else if (nx == Cnd_draw_dt_to) doCnd_draw_dt_to_NX(info);
		else if (nx == Cnd_due_dt_fr) doCnd_due_dt_fr_NX(info);
		else if (nx == Cnd_due_dt_to) doCnd_due_dt_to_NX(info);
		else if (nx == Cnd_rcst_cd) doCnd_rcst_cd_NX(info);
		else if (nx == Cnd_rcst_nm) doCnd_rcst_nm_NX(info);
		else if (nx == Cnd_rcv_usr_cd) doCnd_rcv_usr_cd_NX(info);
		else if (nx == Cnd_rcv_usr_nm) doCnd_rcv_usr_nm_NX(info);
		else if (nx == Cnd_rcv_dpt_cd) doCnd_rcv_dpt_cd_NX(info);
		else if (nx == Cnd_rcv_dpt_nm) doCnd_rcv_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_bcst_cd) doCnd_bcst_cd_NX(info);
		else if (nx == Cnd_bcst_nm) doCnd_bcst_nm_NX(info);
		else if (nx == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NX(info);
		else if (nx == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NX(info);
		else if (nx == Cnd_note_no) doCnd_note_no_NX(info);
		else if (nx == Cnd_note_typ) doCnd_note_typ_NX(info);
		else if (nx == Cnd_note_typ_nm) doCnd_note_typ_nm_NX(info);
		else if (nx == Cnd_drawer_nm) doCnd_drawer_nm_NX(info);
		else if (nx == Cnd_note_rsn_cd) doCnd_note_rsn_cd_NX(info);
		else if (nx == Cnd_note_rsn_nm) doCnd_note_rsn_nm_NX(info);
		else if (nx == Cnd_cur_cd) doCnd_cur_cd_NX(info);
		else if (nx == Cnd_cur_nm) doCnd_cur_nm_NX(info);
		else if (nx == Cnd_rcv_no) doCnd_rcv_no_NX(info);
		else if (nx == Cnd_rcv_mtd_cd) doCnd_rcv_mtd_cd_NX(info);
		else if (nx == Cnd_rcv_mtd_nm) doCnd_rcv_mtd_nm_NX(info);
		else if (nx == Cnd_rcv_act_no) doCnd_rcv_act_no_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == columnRslt_mat_flg) doRslt_mat_flg_NX(info);
		else if (nx == columnRslt_rcv_dpt_cd) doRslt_rcv_dpt_cd_NX(info);
		else if (nx == columnRslt_rcv_dpt_nm) doRslt_rcv_dpt_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_rcv_usr_cd) doRslt_rcv_usr_cd_NX(info);
		else if (nx == columnRslt_rcv_usr_nm) doRslt_rcv_usr_nm_NX(info);
		else if (nx == columnRslt_rcv_dt) doRslt_rcv_dt_NX(info);
		else if (nx == columnRslt_rcst_cd) doRslt_rcst_cd_NX(info);
		else if (nx == columnRslt_rcst_nm) doRslt_rcst_nm_NX(info);
		else if (nx == columnRslt_bcst_cd) doRslt_bcst_cd_NX(info);
		else if (nx == columnRslt_bcst_nm) doRslt_bcst_nm_NX(info);
		else if (nx == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NX(info);
		else if (nx == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_NX(info);
		else if (nx == columnRslt_cur_cd) doRslt_cur_cd_NX(info);
		else if (nx == columnRslt_cur_nm) doRslt_cur_nm_NX(info);
		else if (nx == columnRslt_amt_dec_place) doRslt_amt_dec_place_NX(info);
		else if (nx == columnRslt_note_no) doRslt_note_no_NX(info);
		else if (nx == columnRslt_note_typ) doRslt_note_typ_NX(info);
		else if (nx == columnRslt_note_typ_nm) doRslt_note_typ_nm_NX(info);
		else if (nx == columnRslt_draw_dt) doRslt_draw_dt_NX(info);
		else if (nx == columnRslt_due_dt) doRslt_due_dt_NX(info);
		else if (nx == columnRslt_drawer_nm) doRslt_drawer_nm_NX(info);
		else if (nx == columnRslt_endrsr) doRslt_endrsr_NX(info);
		else if (nx == columnRslt_accptr) doRslt_accptr_NX(info);
		else if (nx == columnRslt_draw_bank_cd) doRslt_draw_bank_cd_NX(info);
		else if (nx == columnRslt_draw_bank_nm) doRslt_draw_bank_nm_NX(info);
		else if (nx == columnRslt_draw_branch_cd) doRslt_draw_branch_cd_NX(info);
		else if (nx == columnRslt_draw_branch_nm) doRslt_draw_branch_nm_NX(info);
		else if (nx == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_NX(info);
		else if (nx == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_NX(info);
		else if (nx == columnRslt_rcv_no) doRslt_rcv_no_NX(info);
		else if (nx == columnRslt_rcv_mtd_cd) doRslt_rcv_mtd_cd_NX(info);
		else if (nx == columnRslt_rcv_mtd_nm) doRslt_rcv_mtd_nm_NX(info);
		else if (nx == columnRslt_rcv_act_no) doRslt_rcv_act_no_NX(info);
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
	 * [Cnd]パネルの[not_mat_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_mat_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mat_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mat_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[draw_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_draw_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[draw_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_draw_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[due_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_due_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[due_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_due_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[note_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[drawer_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_drawer_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[rcv_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_act_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[mat_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mat_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[note_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accptr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accptr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[rcv_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_no_NX(MCEventInfo info){
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
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_rcv_dt_fr) doCnd_rcv_dt_fr_LC(info);
		else if (lc == Cnd_rcv_dt_to) doCnd_rcv_dt_to_LC(info);
		else if (lc == Cnd_draw_dt_fr) doCnd_draw_dt_fr_LC(info);
		else if (lc == Cnd_draw_dt_to) doCnd_draw_dt_to_LC(info);
		else if (lc == Cnd_due_dt_fr) doCnd_due_dt_fr_LC(info);
		else if (lc == Cnd_due_dt_to) doCnd_due_dt_to_LC(info);
		else if (lc == Cnd_rcst_cd) doCnd_rcst_cd_LC(info);
		else if (lc == Cnd_rcst_nm) doCnd_rcst_nm_LC(info);
		else if (lc == Cnd_rcv_usr_cd) doCnd_rcv_usr_cd_LC(info);
		else if (lc == Cnd_rcv_usr_nm) doCnd_rcv_usr_nm_LC(info);
		else if (lc == Cnd_rcv_dpt_cd) doCnd_rcv_dpt_cd_LC(info);
		else if (lc == Cnd_rcv_dpt_nm) doCnd_rcv_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_bcst_cd) doCnd_bcst_cd_LC(info);
		else if (lc == Cnd_bcst_nm) doCnd_bcst_nm_LC(info);
		else if (lc == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_LC(info);
		else if (lc == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_LC(info);
		else if (lc == Cnd_note_no) doCnd_note_no_LC(info);
		else if (lc == Cnd_note_typ) doCnd_note_typ_LC(info);
		else if (lc == Cnd_note_typ_nm) doCnd_note_typ_nm_LC(info);
		else if (lc == Cnd_drawer_nm) doCnd_drawer_nm_LC(info);
		else if (lc == Cnd_note_rsn_cd) doCnd_note_rsn_cd_LC(info);
		else if (lc == Cnd_note_rsn_nm) doCnd_note_rsn_nm_LC(info);
		else if (lc == Cnd_cur_cd) doCnd_cur_cd_LC(info);
		else if (lc == Cnd_cur_nm) doCnd_cur_nm_LC(info);
		else if (lc == Cnd_rcv_no) doCnd_rcv_no_LC(info);
		else if (lc == Cnd_rcv_mtd_cd) doCnd_rcv_mtd_cd_LC(info);
		else if (lc == Cnd_rcv_mtd_nm) doCnd_rcv_mtd_nm_LC(info);
		else if (lc == Cnd_rcv_act_no) doCnd_rcv_act_no_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == columnRslt_rcv_dpt_cd) doRslt_rcv_dpt_cd_LC(info);
		else if (lc == columnRslt_rcv_dpt_nm) doRslt_rcv_dpt_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_rcv_usr_cd) doRslt_rcv_usr_cd_LC(info);
		else if (lc == columnRslt_rcv_usr_nm) doRslt_rcv_usr_nm_LC(info);
		else if (lc == columnRslt_rcv_dt) doRslt_rcv_dt_LC(info);
		else if (lc == columnRslt_rcst_cd) doRslt_rcst_cd_LC(info);
		else if (lc == columnRslt_rcst_nm) doRslt_rcst_nm_LC(info);
		else if (lc == columnRslt_bcst_cd) doRslt_bcst_cd_LC(info);
		else if (lc == columnRslt_bcst_nm) doRslt_bcst_nm_LC(info);
		else if (lc == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_LC(info);
		else if (lc == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_LC(info);
		else if (lc == columnRslt_cur_cd) doRslt_cur_cd_LC(info);
		else if (lc == columnRslt_cur_nm) doRslt_cur_nm_LC(info);
		else if (lc == columnRslt_amt_dec_place) doRslt_amt_dec_place_LC(info);
		else if (lc == columnRslt_note_no) doRslt_note_no_LC(info);
		else if (lc == columnRslt_note_typ) doRslt_note_typ_LC(info);
		else if (lc == columnRslt_note_typ_nm) doRslt_note_typ_nm_LC(info);
		else if (lc == columnRslt_draw_dt) doRslt_draw_dt_LC(info);
		else if (lc == columnRslt_due_dt) doRslt_due_dt_LC(info);
		else if (lc == columnRslt_drawer_nm) doRslt_drawer_nm_LC(info);
		else if (lc == columnRslt_endrsr) doRslt_endrsr_LC(info);
		else if (lc == columnRslt_accptr) doRslt_accptr_LC(info);
		else if (lc == columnRslt_draw_bank_cd) doRslt_draw_bank_cd_LC(info);
		else if (lc == columnRslt_draw_bank_nm) doRslt_draw_bank_nm_LC(info);
		else if (lc == columnRslt_draw_branch_cd) doRslt_draw_branch_cd_LC(info);
		else if (lc == columnRslt_draw_branch_nm) doRslt_draw_branch_nm_LC(info);
		else if (lc == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_LC(info);
		else if (lc == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_LC(info);
		else if (lc == columnRslt_rcv_no) doRslt_rcv_no_LC(info);
		else if (lc == columnRslt_rcv_mtd_cd) doRslt_rcv_mtd_cd_LC(info);
		else if (lc == columnRslt_rcv_mtd_nm) doRslt_rcv_mtd_nm_LC(info);
		else if (lc == columnRslt_rcv_act_no) doRslt_rcv_act_no_LC(info);
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
	 * [Cnd]パネルの[draw_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_draw_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[draw_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_draw_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[due_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_due_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[due_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_due_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[note_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[drawer_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_drawer_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_rsn_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcv_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_act_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[note_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accptr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accptr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcv_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_no_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_bcst_cd]の作成メソッド
	 */
	public MCList getCnd_bcst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bill_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_bill_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_note_typ]の作成メソッド
	 */
	public MCList getCnd_note_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNoteTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_note_rsn_cd]の作成メソッド
	 */
	public MCList getCnd_note_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNoteRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rcv_mtd_cd]の作成メソッド
	 */
	public MCList getCnd_rcv_mtd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0080.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0080.MSUAP_List", this)).getSttlRcv(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBGL0190.Srch01")) {
			return new MS_MSBGL0190_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBGL0190_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0190_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0190_Srch01;

		/** コンストラクタ */
		protected MS_MSBGL0190_Srch01Bridge() {
			p_MS_MSBGL0190_Srch01 = new MCParam(PDef.MS_MSBGL0190_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0190_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0190.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0190.RsltR.class));

			p_MS_MSBGL0190_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0190_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0190_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0190_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0190_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0190.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0190.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBG.MSBGP0190.RsltR> down0() {
			return (MCList<mcframe.clientMSBG.MSBGP0190.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0190_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0190.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0190_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBG.MSBGP0190.RsltR>)p_MS_MSBGL0190_Srch01.getContainerParam().getDownBlock(0));
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
}