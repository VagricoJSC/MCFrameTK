package mcframe.clientMSBG.MSBGP0250;

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
import mcframe.clientMSBG.MSBGP0250.MSBGP_RcvActSrch_MC.MS_MSBGL0250_Srch01Caller;
import mcframe.clientMSBG.MSBGP0250.MSBGP_RcvActSrch_MC.MS_MSBGL0250_Prnt01Caller;

/**
 * 画面"MSBGP_RcvActSrch"パネルクラスです。<p>
 *
 * 入金実績を照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGP_RcvActSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBGP0250";

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
	// [Mode]ブロック関連のField定義
	public MCPanel ModePanel = null;
	public MCTitledBorder ModeTitledBorder = null;
	// [Mode]ブロックの項目のField定義
	// [Prnt]ブロック関連のField定義
	public MCPanel PrntPanel = null;
	public MCTitledBorder PrntTitledBorder = null;
	// [Prnt]ブロックの項目のField定義
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
	 * PRNT,Issue report;REF,View PRNT,帳票発行する;REF,参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_PRNT = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * AR reconciliation entry 売掛消込登録.<p>
	 *
	 */
	public MCCheckBox Cnd_ar_appl_flg = null;
	/**
	 * Advance/suspense received entry 前受仮受登録.<p>
	 *
	 */
	public MCCheckBox Cnd_susp_adv_flg = null;
	/**
	 * Transfer 振替.<p>
	 *
	 */
	public MCCheckBox Cnd_sw_flg = null;
	/**
	 * Tax variance 消費税差額.<p>
	 *
	 */
	public MCCheckBox Cnd_tax_diff_flg = null;
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
	public MCLabel Cnd_ac_dt_fr_Label = null;
	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ac_dt_fr = null;
	public MCLabel Cnd_ac_dt_to_Label = null;
	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ac_dt_to = null;
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
	public MCLabel Cnd_sw_to_bcst_cd_Label = null;
	/**
	 * Transfer cd. 振替先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sw_to_bcst_cd = null;
	/**
	 * Transfer name 振替先名.<p>
	 *
	 */
	public MCTextField Cnd_sw_to_bcst_nm = null;
	public MCLabel Cnd_usr_cd_Label = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCTextField Cnd_usr_nm = null;
	public MCLabel Cnd_dpt_cd_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_nm = null;
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
	public MCLabel Cnd_trd_rmrks_Label = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCTextField Cnd_trd_rmrks = null;
	public MCLabel Cnd_rcv_act_no_Label = null;
	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rcv_act_no = null;
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
	public MCLabel Cnd_sw_to_rcv_act_no_Label = null;
	/**
	 * Transfer payment received result No. 振替先入金実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_sw_to_rcv_act_no = null;
	public MCLabel Cnd_trd_cd_Label = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCTextField Cnd_trd_nm = null;
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
	public MCLabel Cnd_gen_rcv_no_Label = null;
	/**
	 * Source incoming payment result No. 発生入金ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_gen_rcv_no = null;
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
	 * Include invalid/cancel 無効・取消含む.<p>
	 *
	 */
	public MCCheckBox Cnd_can_flg = null;
	/**
	 * Auto-reconciliation only 入金自動消込のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_rcv_auto_appl_flg = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_rcst_grp_p_PPanel;
	public MCLabel Cnd_rcst_grp_lab1;	// [Cnd]の[rcst_grp_p.bp_grp_lab1]を[Cnd_rcst_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_rcst_grp_flg1;	// [Cnd]の[rcst_grp_p.bp_grp_flg1]を[Cnd_rcst_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_rcst_grp_cd1;	// [Cnd]の[rcst_grp_p.bp_grp_cd1]を[Cnd_rcst_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_rcst_grp_nm1;	// [Cnd]の[rcst_grp_p.bp_grp_nm1]を[Cnd_rcst_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_rcst_grp_lab2;	// [Cnd]の[rcst_grp_p.bp_grp_lab2]を[Cnd_rcst_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_rcst_grp_flg2;	// [Cnd]の[rcst_grp_p.bp_grp_flg2]を[Cnd_rcst_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_rcst_grp_cd2;	// [Cnd]の[rcst_grp_p.bp_grp_cd2]を[Cnd_rcst_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_rcst_grp_nm2;	// [Cnd]の[rcst_grp_p.bp_grp_nm2]を[Cnd_rcst_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_rcst_grp_lab3;	// [Cnd]の[rcst_grp_p.bp_grp_lab3]を[Cnd_rcst_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_rcst_grp_flg3;	// [Cnd]の[rcst_grp_p.bp_grp_flg3]を[Cnd_rcst_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_rcst_grp_cd3;	// [Cnd]の[rcst_grp_p.bp_grp_cd3]を[Cnd_rcst_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_rcst_grp_nm3;	// [Cnd]の[rcst_grp_p.bp_grp_nm3]を[Cnd_rcst_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_rcst_grp_lab4;	// [Cnd]の[rcst_grp_p.bp_grp_lab4]を[Cnd_rcst_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_rcst_grp_flg4;	// [Cnd]の[rcst_grp_p.bp_grp_flg4]を[Cnd_rcst_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_rcst_grp_cd4;	// [Cnd]の[rcst_grp_p.bp_grp_cd4]を[Cnd_rcst_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_rcst_grp_nm4;	// [Cnd]の[rcst_grp_p.bp_grp_nm4]を[Cnd_rcst_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_rcst_grp_lab5;	// [Cnd]の[rcst_grp_p.bp_grp_lab5]を[Cnd_rcst_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_rcst_grp_flg5;	// [Cnd]の[rcst_grp_p.bp_grp_flg5]を[Cnd_rcst_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_rcst_grp_cd5;	// [Cnd]の[rcst_grp_p.bp_grp_cd5]を[Cnd_rcst_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_rcst_grp_nm5;	// [Cnd]の[rcst_grp_p.bp_grp_nm5]を[Cnd_rcst_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_rcst_grp_lab6;	// [Cnd]の[rcst_grp_p.bp_grp_lab6]を[Cnd_rcst_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_rcst_grp_flg6;	// [Cnd]の[rcst_grp_p.bp_grp_flg6]を[Cnd_rcst_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_rcst_grp_cd6;	// [Cnd]の[rcst_grp_p.bp_grp_cd6]を[Cnd_rcst_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_rcst_grp_nm6;	// [Cnd]の[rcst_grp_p.bp_grp_nm6]を[Cnd_rcst_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_rcst_grp_lab7;	// [Cnd]の[rcst_grp_p.bp_grp_lab7]を[Cnd_rcst_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_rcst_grp_flg7;	// [Cnd]の[rcst_grp_p.bp_grp_flg7]を[Cnd_rcst_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_rcst_grp_cd7;	// [Cnd]の[rcst_grp_p.bp_grp_cd7]を[Cnd_rcst_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_rcst_grp_nm7;	// [Cnd]の[rcst_grp_p.bp_grp_nm7]を[Cnd_rcst_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_rcst_grp_lab8;	// [Cnd]の[rcst_grp_p.bp_grp_lab8]を[Cnd_rcst_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_rcst_grp_flg8;	// [Cnd]の[rcst_grp_p.bp_grp_flg8]を[Cnd_rcst_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_rcst_grp_cd8;	// [Cnd]の[rcst_grp_p.bp_grp_cd8]を[Cnd_rcst_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_rcst_grp_nm8;	// [Cnd]の[rcst_grp_p.bp_grp_nm8]を[Cnd_rcst_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_rcst_grp_lab9;	// [Cnd]の[rcst_grp_p.bp_grp_lab9]を[Cnd_rcst_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_rcst_grp_flg9;	// [Cnd]の[rcst_grp_p.bp_grp_flg9]を[Cnd_rcst_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_rcst_grp_cd9;	// [Cnd]の[rcst_grp_p.bp_grp_cd9]を[Cnd_rcst_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_rcst_grp_nm9;	// [Cnd]の[rcst_grp_p.bp_grp_nm9]を[Cnd_rcst_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_rcst_grp_lab10;	// [Cnd]の[rcst_grp_p.bp_grp_lab10]を[Cnd_rcst_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_rcst_grp_flg10;	// [Cnd]の[rcst_grp_p.bp_grp_flg10]を[Cnd_rcst_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_rcst_grp_cd10;	// [Cnd]の[rcst_grp_p.bp_grp_cd10]を[Cnd_rcst_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_rcst_grp_nm10;	// [Cnd]の[rcst_grp_p.bp_grp_nm10]を[Cnd_rcst_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_bcst_grp_p_PPanel;
	public MCLabel Cnd_bcst_grp_lab1;	// [Cnd]の[bcst_grp_p.bp_grp_lab1]を[Cnd_bcst_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg1;	// [Cnd]の[bcst_grp_p.bp_grp_flg1]を[Cnd_bcst_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd1;	// [Cnd]の[bcst_grp_p.bp_grp_cd1]を[Cnd_bcst_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm1;	// [Cnd]の[bcst_grp_p.bp_grp_nm1]を[Cnd_bcst_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab2;	// [Cnd]の[bcst_grp_p.bp_grp_lab2]を[Cnd_bcst_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg2;	// [Cnd]の[bcst_grp_p.bp_grp_flg2]を[Cnd_bcst_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd2;	// [Cnd]の[bcst_grp_p.bp_grp_cd2]を[Cnd_bcst_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm2;	// [Cnd]の[bcst_grp_p.bp_grp_nm2]を[Cnd_bcst_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab3;	// [Cnd]の[bcst_grp_p.bp_grp_lab3]を[Cnd_bcst_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg3;	// [Cnd]の[bcst_grp_p.bp_grp_flg3]を[Cnd_bcst_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd3;	// [Cnd]の[bcst_grp_p.bp_grp_cd3]を[Cnd_bcst_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm3;	// [Cnd]の[bcst_grp_p.bp_grp_nm3]を[Cnd_bcst_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab4;	// [Cnd]の[bcst_grp_p.bp_grp_lab4]を[Cnd_bcst_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg4;	// [Cnd]の[bcst_grp_p.bp_grp_flg4]を[Cnd_bcst_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd4;	// [Cnd]の[bcst_grp_p.bp_grp_cd4]を[Cnd_bcst_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm4;	// [Cnd]の[bcst_grp_p.bp_grp_nm4]を[Cnd_bcst_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab5;	// [Cnd]の[bcst_grp_p.bp_grp_lab5]を[Cnd_bcst_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg5;	// [Cnd]の[bcst_grp_p.bp_grp_flg5]を[Cnd_bcst_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd5;	// [Cnd]の[bcst_grp_p.bp_grp_cd5]を[Cnd_bcst_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm5;	// [Cnd]の[bcst_grp_p.bp_grp_nm5]を[Cnd_bcst_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab6;	// [Cnd]の[bcst_grp_p.bp_grp_lab6]を[Cnd_bcst_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg6;	// [Cnd]の[bcst_grp_p.bp_grp_flg6]を[Cnd_bcst_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd6;	// [Cnd]の[bcst_grp_p.bp_grp_cd6]を[Cnd_bcst_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm6;	// [Cnd]の[bcst_grp_p.bp_grp_nm6]を[Cnd_bcst_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab7;	// [Cnd]の[bcst_grp_p.bp_grp_lab7]を[Cnd_bcst_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg7;	// [Cnd]の[bcst_grp_p.bp_grp_flg7]を[Cnd_bcst_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd7;	// [Cnd]の[bcst_grp_p.bp_grp_cd7]を[Cnd_bcst_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm7;	// [Cnd]の[bcst_grp_p.bp_grp_nm7]を[Cnd_bcst_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab8;	// [Cnd]の[bcst_grp_p.bp_grp_lab8]を[Cnd_bcst_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg8;	// [Cnd]の[bcst_grp_p.bp_grp_flg8]を[Cnd_bcst_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd8;	// [Cnd]の[bcst_grp_p.bp_grp_cd8]を[Cnd_bcst_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm8;	// [Cnd]の[bcst_grp_p.bp_grp_nm8]を[Cnd_bcst_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab9;	// [Cnd]の[bcst_grp_p.bp_grp_lab9]を[Cnd_bcst_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg9;	// [Cnd]の[bcst_grp_p.bp_grp_flg9]を[Cnd_bcst_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd9;	// [Cnd]の[bcst_grp_p.bp_grp_cd9]を[Cnd_bcst_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm9;	// [Cnd]の[bcst_grp_p.bp_grp_nm9]を[Cnd_bcst_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab10;	// [Cnd]の[bcst_grp_p.bp_grp_lab10]を[Cnd_bcst_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg10;	// [Cnd]の[bcst_grp_p.bp_grp_flg10]を[Cnd_bcst_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd10;	// [Cnd]の[bcst_grp_p.bp_grp_cd10]を[Cnd_bcst_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm10;	// [Cnd]の[bcst_grp_p.bp_grp_nm10]を[Cnd_bcst_grp_nm10]としてエイリアス定義。
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
	public MCTable2<mcframe.clientMSBG.MSBGP0250.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slip_sts_typ = null;
	/**
	 * Slip status type name 伝票状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slip_sts_typ_nm = null;
	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_act_no = null;
	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_act_seq = null;
	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_act_rev = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_nm = null;
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_dt = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_ym = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_dt = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_ptn_typ = null;
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
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_sttl_cd1 = null;
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_sttl_nm1 = null;
	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_no = null;
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_no = null;
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
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_sttl_cd2 = null;
	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_sttl_nm2 = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_nm = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt_dec_place = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_subttl1_p_PPanel;
	public MCColumnConfig columnRslt_subttl1;// [Rslt]の[subttl1_p.amt]を[columnRslt_subttl1]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_subttl2_p_PPanel;
	public MCColumnConfig columnRslt_subttl2;// [Rslt]の[subttl2_p.amt]を[columnRslt_subttl2]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_tax_amt;// [Rslt]の[tax_amt_p.amt]を[columnRslt_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_tax_diff_amt_p_PPanel;
	public MCColumnConfig columnRslt_tax_diff_amt;// [Rslt]の[tax_diff_amt_p.amt]を[columnRslt_tax_diff_amt]としてエイリアス定義。
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_cd = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_nm = null;
	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_amt_dec_place = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_subttl1_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_subttl1;// [Rslt]の[base_cur_subttl1_p.amt]を[columnRslt_base_cur_subttl1]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_subttl2_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_subttl2;// [Rslt]の[base_cur_subttl2_p.amt]を[columnRslt_base_cur_subttl2]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_tax_amt;// [Rslt]の[base_cur_tax_amt_p.amt]を[columnRslt_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_tax_diff_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_tax_diff_amt;// [Rslt]の[base_cur_tax_diff_amt_p.amt]を[columnRslt_base_cur_tax_diff_amt]としてエイリアス定義。
	/**
	 * Transfer payment received result No. 振替先入金実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_to_rcv_act_no = null;
	/**
	 * Transfer transaction cd. 振替先取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_to_trd_cd = null;
	/**
	 * Transfer transaction name 振替先取引名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_to_trd_nm = null;
	/**
	 * Transfer cd. 振替先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_to_bcst_cd = null;
	/**
	 * Transfer name 振替先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_to_bcst_nm = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_nm = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_nm = null;
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
	 * Source incoming payment result No. 発生入金ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gen_rcv_no = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prnt_flg = null;
	/**
	 * Auto-reconciliation 入金自動消込.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_auto_appl_flg = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_rmrks = null;
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
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_rcst_grp_p_PPanel;
	public MCColumnConfig columnRslt_rcst_grp_cd1;// [Rslt]の[rcst_grp_p.bp_grp_cd1]を[columnRslt_rcst_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcst_grp_nm1;// [Rslt]の[rcst_grp_p.bp_grp_nm1]を[columnRslt_rcst_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcst_grp_cd2;// [Rslt]の[rcst_grp_p.bp_grp_cd2]を[columnRslt_rcst_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcst_grp_nm2;// [Rslt]の[rcst_grp_p.bp_grp_nm2]を[columnRslt_rcst_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcst_grp_cd3;// [Rslt]の[rcst_grp_p.bp_grp_cd3]を[columnRslt_rcst_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcst_grp_nm3;// [Rslt]の[rcst_grp_p.bp_grp_nm3]を[columnRslt_rcst_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcst_grp_cd4;// [Rslt]の[rcst_grp_p.bp_grp_cd4]を[columnRslt_rcst_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcst_grp_nm4;// [Rslt]の[rcst_grp_p.bp_grp_nm4]を[columnRslt_rcst_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcst_grp_cd5;// [Rslt]の[rcst_grp_p.bp_grp_cd5]を[columnRslt_rcst_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcst_grp_nm5;// [Rslt]の[rcst_grp_p.bp_grp_nm5]を[columnRslt_rcst_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcst_grp_cd6;// [Rslt]の[rcst_grp_p.bp_grp_cd6]を[columnRslt_rcst_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcst_grp_nm6;// [Rslt]の[rcst_grp_p.bp_grp_nm6]を[columnRslt_rcst_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcst_grp_cd7;// [Rslt]の[rcst_grp_p.bp_grp_cd7]を[columnRslt_rcst_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcst_grp_nm7;// [Rslt]の[rcst_grp_p.bp_grp_nm7]を[columnRslt_rcst_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcst_grp_cd8;// [Rslt]の[rcst_grp_p.bp_grp_cd8]を[columnRslt_rcst_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcst_grp_nm8;// [Rslt]の[rcst_grp_p.bp_grp_nm8]を[columnRslt_rcst_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcst_grp_cd9;// [Rslt]の[rcst_grp_p.bp_grp_cd9]を[columnRslt_rcst_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcst_grp_nm9;// [Rslt]の[rcst_grp_p.bp_grp_nm9]を[columnRslt_rcst_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcst_grp_cd10;// [Rslt]の[rcst_grp_p.bp_grp_cd10]を[columnRslt_rcst_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_rcst_grp_nm10;// [Rslt]の[rcst_grp_p.bp_grp_nm10]を[columnRslt_rcst_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_bcst_grp_p_PPanel;
	public MCColumnConfig columnRslt_bcst_grp_cd1;// [Rslt]の[bcst_grp_p.bp_grp_cd1]を[columnRslt_bcst_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_nm1;// [Rslt]の[bcst_grp_p.bp_grp_nm1]を[columnRslt_bcst_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_cd2;// [Rslt]の[bcst_grp_p.bp_grp_cd2]を[columnRslt_bcst_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_nm2;// [Rslt]の[bcst_grp_p.bp_grp_nm2]を[columnRslt_bcst_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_cd3;// [Rslt]の[bcst_grp_p.bp_grp_cd3]を[columnRslt_bcst_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_nm3;// [Rslt]の[bcst_grp_p.bp_grp_nm3]を[columnRslt_bcst_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_cd4;// [Rslt]の[bcst_grp_p.bp_grp_cd4]を[columnRslt_bcst_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_nm4;// [Rslt]の[bcst_grp_p.bp_grp_nm4]を[columnRslt_bcst_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_cd5;// [Rslt]の[bcst_grp_p.bp_grp_cd5]を[columnRslt_bcst_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_nm5;// [Rslt]の[bcst_grp_p.bp_grp_nm5]を[columnRslt_bcst_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_cd6;// [Rslt]の[bcst_grp_p.bp_grp_cd6]を[columnRslt_bcst_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_nm6;// [Rslt]の[bcst_grp_p.bp_grp_nm6]を[columnRslt_bcst_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_cd7;// [Rslt]の[bcst_grp_p.bp_grp_cd7]を[columnRslt_bcst_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_nm7;// [Rslt]の[bcst_grp_p.bp_grp_nm7]を[columnRslt_bcst_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_cd8;// [Rslt]の[bcst_grp_p.bp_grp_cd8]を[columnRslt_bcst_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_nm8;// [Rslt]の[bcst_grp_p.bp_grp_nm8]を[columnRslt_bcst_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_cd9;// [Rslt]の[bcst_grp_p.bp_grp_cd9]を[columnRslt_bcst_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_nm9;// [Rslt]の[bcst_grp_p.bp_grp_nm9]を[columnRslt_bcst_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_cd10;// [Rslt]の[bcst_grp_p.bp_grp_cd10]を[columnRslt_bcst_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_nm10;// [Rslt]の[bcst_grp_p.bp_grp_nm10]を[columnRslt_bcst_grp_nm10]としてエイリアス定義。
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
	 * AR slip report type 債権伝票.<p>
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
	/** [SRCH_REF]モードを表す定数 */
	public static final String SRCH_REF = "SRCH_REF";
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
	public static final String[] statusArray = new String[]{SRCH_REF, REF, SRCH_PRNT, PRNT};
	
	/** [MS_MSBGL0250_Srch01]のCallerの作成 */
	protected MSBGP_RcvActSrch_MC.MS_MSBGL0250_Srch01Caller createMS_MSBGL0250_Srch01() {
		MSBGP_RcvActSrch_MC.MS_MSBGL0250_Srch01Caller<MSBGP_RcvActSrch, MS_MSBGL0250_Srch01Bridge>
		caller = ((MSBGP_RcvActSrch_MC)this).new MS_MSBGL0250_Srch01Caller<MSBGP_RcvActSrch, MS_MSBGL0250_Srch01Bridge>(
					(MSBGP_RcvActSrch)this, new MS_MSBGL0250_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBGL0250_Srch01]の呼び出し */
	protected void callMS_MSBGL0250_Srch01() {
		MCCaller caller = createMS_MSBGL0250_Srch01();
		caller.exec();
	}
	/** [MS_MSBGL0250_Prnt01]のCallerの作成 */
	protected MSBGP_RcvActSrch_MC.MS_MSBGL0250_Prnt01Caller createMS_MSBGL0250_Prnt01() {
		MSBGP_RcvActSrch_MC.MS_MSBGL0250_Prnt01Caller<MSBGP_RcvActSrch, MS_MSBGL0250_Prnt01Bridge>
		caller = ((MSBGP_RcvActSrch_MC)this).new MS_MSBGL0250_Prnt01Caller<MSBGP_RcvActSrch, MS_MSBGL0250_Prnt01Bridge>(
					(MSBGP_RcvActSrch)this, new MS_MSBGL0250_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBGL0250_Prnt01]の呼び出し */
	protected void callMS_MSBGL0250_Prnt01() {
		MCCaller caller = createMS_MSBGL0250_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0250.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0250.RsltR> aRsltL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0250.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBG.MSBGP0250.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0250.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0250.CndR createCndR() {
		return mcframe.clientMSBG.MSBGP0250.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBG.MSBGP0250.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0250.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBG.MSBGP0250.RsltR createRsltR() {
		return mcframe.clientMSBG.MSBGP0250.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0250.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0250.RsltR.class);
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
	public void setBtnR(mcframe.clientMSBG.MSBGP0250.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBG.MSBGP0250.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBG.MSBGP0250.BtnR createBtnR() {
		return mcframe.clientMSBG.MSBGP0250.BtnR.create();
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
		ret.add(ModePanel);
		ret.add(PrntPanel);
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
	public MSBGP_RcvActSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBGP_RcvActSrch_MC_A(String name) {
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
		MSBGP_RcvActSrch_MC.jbCreateScreenOpe((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbCreateTop((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbCreateFold((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbCreateTab1((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbCreateMode((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbCreatePrnt((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbCreateTab2((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbCreateTab3((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbCreateRcstCnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbCreateBcstCnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbCreateCnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbCreateCtrl((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbCreateRPnl((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbCreateRslt((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbCreateBtn((MSBGP_RcvActSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBGP_RcvActSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBGP_RcvActSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBGP_RcvActSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBGP_RcvActSrch p) {
	}

	/**
	 * [Mode]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMode(MSBGP_RcvActSrch p) {
	}

	/**
	 * [Prnt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePrnt(MSBGP_RcvActSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBGP_RcvActSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBGP_RcvActSrch p) {
	}

	/**
	 * [RcstCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRcstCnd(MSBGP_RcvActSrch p) {
	}

	/**
	 * [BcstCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBcstCnd(MSBGP_RcvActSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBGP_RcvActSrch p) {
		p.Cnd_rcst_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().rcst_grp_p());
		p.Cnd_rcst_grp_p_PPanel.setName("Cnd.rcst_grp_p");
		p.Cnd_rcst_grp_lab1 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_rcst_grp_lab1.addAliasName("Cnd.rcst_grp_lab1", p);
		p.Cnd_rcst_grp_flg1 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_rcst_grp_flg1.addAliasName("Cnd.rcst_grp_flg1", p);
		p.Cnd_rcst_grp_cd1 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_rcst_grp_cd1.addAliasName("Cnd.rcst_grp_cd1", p);
		p.Cnd_rcst_grp_nm1 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_rcst_grp_nm1.addAliasName("Cnd.rcst_grp_nm1", p);
		p.Cnd_rcst_grp_lab2 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_rcst_grp_lab2.addAliasName("Cnd.rcst_grp_lab2", p);
		p.Cnd_rcst_grp_flg2 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_rcst_grp_flg2.addAliasName("Cnd.rcst_grp_flg2", p);
		p.Cnd_rcst_grp_cd2 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_rcst_grp_cd2.addAliasName("Cnd.rcst_grp_cd2", p);
		p.Cnd_rcst_grp_nm2 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_rcst_grp_nm2.addAliasName("Cnd.rcst_grp_nm2", p);
		p.Cnd_rcst_grp_lab3 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_rcst_grp_lab3.addAliasName("Cnd.rcst_grp_lab3", p);
		p.Cnd_rcst_grp_flg3 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_rcst_grp_flg3.addAliasName("Cnd.rcst_grp_flg3", p);
		p.Cnd_rcst_grp_cd3 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_rcst_grp_cd3.addAliasName("Cnd.rcst_grp_cd3", p);
		p.Cnd_rcst_grp_nm3 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_rcst_grp_nm3.addAliasName("Cnd.rcst_grp_nm3", p);
		p.Cnd_rcst_grp_lab4 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_rcst_grp_lab4.addAliasName("Cnd.rcst_grp_lab4", p);
		p.Cnd_rcst_grp_flg4 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_rcst_grp_flg4.addAliasName("Cnd.rcst_grp_flg4", p);
		p.Cnd_rcst_grp_cd4 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_rcst_grp_cd4.addAliasName("Cnd.rcst_grp_cd4", p);
		p.Cnd_rcst_grp_nm4 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_rcst_grp_nm4.addAliasName("Cnd.rcst_grp_nm4", p);
		p.Cnd_rcst_grp_lab5 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_rcst_grp_lab5.addAliasName("Cnd.rcst_grp_lab5", p);
		p.Cnd_rcst_grp_flg5 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_rcst_grp_flg5.addAliasName("Cnd.rcst_grp_flg5", p);
		p.Cnd_rcst_grp_cd5 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_rcst_grp_cd5.addAliasName("Cnd.rcst_grp_cd5", p);
		p.Cnd_rcst_grp_nm5 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_rcst_grp_nm5.addAliasName("Cnd.rcst_grp_nm5", p);
		p.Cnd_rcst_grp_lab6 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_rcst_grp_lab6.addAliasName("Cnd.rcst_grp_lab6", p);
		p.Cnd_rcst_grp_flg6 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_rcst_grp_flg6.addAliasName("Cnd.rcst_grp_flg6", p);
		p.Cnd_rcst_grp_cd6 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_rcst_grp_cd6.addAliasName("Cnd.rcst_grp_cd6", p);
		p.Cnd_rcst_grp_nm6 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_rcst_grp_nm6.addAliasName("Cnd.rcst_grp_nm6", p);
		p.Cnd_rcst_grp_lab7 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_rcst_grp_lab7.addAliasName("Cnd.rcst_grp_lab7", p);
		p.Cnd_rcst_grp_flg7 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_rcst_grp_flg7.addAliasName("Cnd.rcst_grp_flg7", p);
		p.Cnd_rcst_grp_cd7 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_rcst_grp_cd7.addAliasName("Cnd.rcst_grp_cd7", p);
		p.Cnd_rcst_grp_nm7 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_rcst_grp_nm7.addAliasName("Cnd.rcst_grp_nm7", p);
		p.Cnd_rcst_grp_lab8 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_rcst_grp_lab8.addAliasName("Cnd.rcst_grp_lab8", p);
		p.Cnd_rcst_grp_flg8 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_rcst_grp_flg8.addAliasName("Cnd.rcst_grp_flg8", p);
		p.Cnd_rcst_grp_cd8 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_rcst_grp_cd8.addAliasName("Cnd.rcst_grp_cd8", p);
		p.Cnd_rcst_grp_nm8 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_rcst_grp_nm8.addAliasName("Cnd.rcst_grp_nm8", p);
		p.Cnd_rcst_grp_lab9 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_rcst_grp_lab9.addAliasName("Cnd.rcst_grp_lab9", p);
		p.Cnd_rcst_grp_flg9 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_rcst_grp_flg9.addAliasName("Cnd.rcst_grp_flg9", p);
		p.Cnd_rcst_grp_cd9 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_rcst_grp_cd9.addAliasName("Cnd.rcst_grp_cd9", p);
		p.Cnd_rcst_grp_nm9 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_rcst_grp_nm9.addAliasName("Cnd.rcst_grp_nm9", p);
		p.Cnd_rcst_grp_lab10 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_rcst_grp_lab10.addAliasName("Cnd.rcst_grp_lab10", p);
		p.Cnd_rcst_grp_flg10 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_rcst_grp_flg10.addAliasName("Cnd.rcst_grp_flg10", p);
		p.Cnd_rcst_grp_cd10 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_rcst_grp_cd10.addAliasName("Cnd.rcst_grp_cd10", p);
		p.Cnd_rcst_grp_nm10 = p.Cnd_rcst_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_rcst_grp_nm10.addAliasName("Cnd.rcst_grp_nm10", p);
		p.Cnd_bcst_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().bcst_grp_p());
		p.Cnd_bcst_grp_p_PPanel.setName("Cnd.bcst_grp_p");
		p.Cnd_bcst_grp_lab1 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_bcst_grp_lab1.addAliasName("Cnd.bcst_grp_lab1", p);
		p.Cnd_bcst_grp_flg1 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_bcst_grp_flg1.addAliasName("Cnd.bcst_grp_flg1", p);
		p.Cnd_bcst_grp_cd1 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_bcst_grp_cd1.addAliasName("Cnd.bcst_grp_cd1", p);
		p.Cnd_bcst_grp_nm1 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_bcst_grp_nm1.addAliasName("Cnd.bcst_grp_nm1", p);
		p.Cnd_bcst_grp_lab2 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_bcst_grp_lab2.addAliasName("Cnd.bcst_grp_lab2", p);
		p.Cnd_bcst_grp_flg2 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_bcst_grp_flg2.addAliasName("Cnd.bcst_grp_flg2", p);
		p.Cnd_bcst_grp_cd2 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_bcst_grp_cd2.addAliasName("Cnd.bcst_grp_cd2", p);
		p.Cnd_bcst_grp_nm2 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_bcst_grp_nm2.addAliasName("Cnd.bcst_grp_nm2", p);
		p.Cnd_bcst_grp_lab3 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_bcst_grp_lab3.addAliasName("Cnd.bcst_grp_lab3", p);
		p.Cnd_bcst_grp_flg3 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_bcst_grp_flg3.addAliasName("Cnd.bcst_grp_flg3", p);
		p.Cnd_bcst_grp_cd3 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_bcst_grp_cd3.addAliasName("Cnd.bcst_grp_cd3", p);
		p.Cnd_bcst_grp_nm3 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_bcst_grp_nm3.addAliasName("Cnd.bcst_grp_nm3", p);
		p.Cnd_bcst_grp_lab4 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_bcst_grp_lab4.addAliasName("Cnd.bcst_grp_lab4", p);
		p.Cnd_bcst_grp_flg4 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_bcst_grp_flg4.addAliasName("Cnd.bcst_grp_flg4", p);
		p.Cnd_bcst_grp_cd4 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_bcst_grp_cd4.addAliasName("Cnd.bcst_grp_cd4", p);
		p.Cnd_bcst_grp_nm4 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_bcst_grp_nm4.addAliasName("Cnd.bcst_grp_nm4", p);
		p.Cnd_bcst_grp_lab5 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_bcst_grp_lab5.addAliasName("Cnd.bcst_grp_lab5", p);
		p.Cnd_bcst_grp_flg5 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_bcst_grp_flg5.addAliasName("Cnd.bcst_grp_flg5", p);
		p.Cnd_bcst_grp_cd5 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_bcst_grp_cd5.addAliasName("Cnd.bcst_grp_cd5", p);
		p.Cnd_bcst_grp_nm5 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_bcst_grp_nm5.addAliasName("Cnd.bcst_grp_nm5", p);
		p.Cnd_bcst_grp_lab6 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_bcst_grp_lab6.addAliasName("Cnd.bcst_grp_lab6", p);
		p.Cnd_bcst_grp_flg6 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_bcst_grp_flg6.addAliasName("Cnd.bcst_grp_flg6", p);
		p.Cnd_bcst_grp_cd6 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_bcst_grp_cd6.addAliasName("Cnd.bcst_grp_cd6", p);
		p.Cnd_bcst_grp_nm6 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_bcst_grp_nm6.addAliasName("Cnd.bcst_grp_nm6", p);
		p.Cnd_bcst_grp_lab7 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_bcst_grp_lab7.addAliasName("Cnd.bcst_grp_lab7", p);
		p.Cnd_bcst_grp_flg7 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_bcst_grp_flg7.addAliasName("Cnd.bcst_grp_flg7", p);
		p.Cnd_bcst_grp_cd7 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_bcst_grp_cd7.addAliasName("Cnd.bcst_grp_cd7", p);
		p.Cnd_bcst_grp_nm7 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_bcst_grp_nm7.addAliasName("Cnd.bcst_grp_nm7", p);
		p.Cnd_bcst_grp_lab8 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_bcst_grp_lab8.addAliasName("Cnd.bcst_grp_lab8", p);
		p.Cnd_bcst_grp_flg8 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_bcst_grp_flg8.addAliasName("Cnd.bcst_grp_flg8", p);
		p.Cnd_bcst_grp_cd8 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_bcst_grp_cd8.addAliasName("Cnd.bcst_grp_cd8", p);
		p.Cnd_bcst_grp_nm8 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_bcst_grp_nm8.addAliasName("Cnd.bcst_grp_nm8", p);
		p.Cnd_bcst_grp_lab9 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_bcst_grp_lab9.addAliasName("Cnd.bcst_grp_lab9", p);
		p.Cnd_bcst_grp_flg9 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_bcst_grp_flg9.addAliasName("Cnd.bcst_grp_flg9", p);
		p.Cnd_bcst_grp_cd9 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_bcst_grp_cd9.addAliasName("Cnd.bcst_grp_cd9", p);
		p.Cnd_bcst_grp_nm9 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_bcst_grp_nm9.addAliasName("Cnd.bcst_grp_nm9", p);
		p.Cnd_bcst_grp_lab10 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_bcst_grp_lab10.addAliasName("Cnd.bcst_grp_lab10", p);
		p.Cnd_bcst_grp_flg10 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_bcst_grp_flg10.addAliasName("Cnd.bcst_grp_flg10", p);
		p.Cnd_bcst_grp_cd10 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_bcst_grp_cd10.addAliasName("Cnd.bcst_grp_cd10", p);
		p.Cnd_bcst_grp_nm10 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_bcst_grp_nm10.addAliasName("Cnd.bcst_grp_nm10", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBGP_RcvActSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBGP_RcvActSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBGP_RcvActSrch p) {
		p.Rslt_subttl1_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0250.RsltR.$subttl1_p);
		p.Rslt_subttl1_p_PPanel.setName("Rslt.subttl1_p");
		p.columnRslt_subttl1 = p.Rslt_subttl1_p_PPanel.columnAmt_amt;
		p.columnRslt_subttl1.addAliasName("Rslt.subttl1", p);
		p.Rslt_subttl2_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0250.RsltR.$subttl2_p);
		p.Rslt_subttl2_p_PPanel.setName("Rslt.subttl2_p");
		p.columnRslt_subttl2 = p.Rslt_subttl2_p_PPanel.columnAmt_amt;
		p.columnRslt_subttl2.addAliasName("Rslt.subttl2", p);
		p.Rslt_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0250.RsltR.$tax_amt_p);
		p.Rslt_tax_amt_p_PPanel.setName("Rslt.tax_amt_p");
		p.columnRslt_tax_amt = p.Rslt_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_tax_amt.addAliasName("Rslt.tax_amt", p);
		p.Rslt_tax_diff_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0250.RsltR.$tax_diff_amt_p);
		p.Rslt_tax_diff_amt_p_PPanel.setName("Rslt.tax_diff_amt_p");
		p.columnRslt_tax_diff_amt = p.Rslt_tax_diff_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_tax_diff_amt.addAliasName("Rslt.tax_diff_amt", p);
		p.Rslt_base_cur_subttl1_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0250.RsltR.$base_cur_subttl1_p);
		p.Rslt_base_cur_subttl1_p_PPanel.setName("Rslt.base_cur_subttl1_p");
		p.columnRslt_base_cur_subttl1 = p.Rslt_base_cur_subttl1_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_subttl1.addAliasName("Rslt.base_cur_subttl1", p);
		p.Rslt_base_cur_subttl2_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0250.RsltR.$base_cur_subttl2_p);
		p.Rslt_base_cur_subttl2_p_PPanel.setName("Rslt.base_cur_subttl2_p");
		p.columnRslt_base_cur_subttl2 = p.Rslt_base_cur_subttl2_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_subttl2.addAliasName("Rslt.base_cur_subttl2", p);
		p.Rslt_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0250.RsltR.$base_cur_tax_amt_p);
		p.Rslt_base_cur_tax_amt_p_PPanel.setName("Rslt.base_cur_tax_amt_p");
		p.columnRslt_base_cur_tax_amt = p.Rslt_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_tax_amt.addAliasName("Rslt.base_cur_tax_amt", p);
		p.Rslt_base_cur_tax_diff_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0250.RsltR.$base_cur_tax_diff_amt_p);
		p.Rslt_base_cur_tax_diff_amt_p_PPanel.setName("Rslt.base_cur_tax_diff_amt_p");
		p.columnRslt_base_cur_tax_diff_amt = p.Rslt_base_cur_tax_diff_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_tax_diff_amt.addAliasName("Rslt.base_cur_tax_diff_amt", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBG.MSBGP0250.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
		p.Rslt_rcst_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBG.MSBGP0250.RsltR.$rcst_grp_p);
		p.Rslt_rcst_grp_p_PPanel.setName("Rslt.rcst_grp_p");
		p.columnRslt_rcst_grp_cd1 = p.Rslt_rcst_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_rcst_grp_cd1.addAliasName("Rslt.rcst_grp_cd1", p);
		p.columnRslt_rcst_grp_nm1 = p.Rslt_rcst_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_rcst_grp_nm1.addAliasName("Rslt.rcst_grp_nm1", p);
		p.columnRslt_rcst_grp_cd2 = p.Rslt_rcst_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_rcst_grp_cd2.addAliasName("Rslt.rcst_grp_cd2", p);
		p.columnRslt_rcst_grp_nm2 = p.Rslt_rcst_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_rcst_grp_nm2.addAliasName("Rslt.rcst_grp_nm2", p);
		p.columnRslt_rcst_grp_cd3 = p.Rslt_rcst_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_rcst_grp_cd3.addAliasName("Rslt.rcst_grp_cd3", p);
		p.columnRslt_rcst_grp_nm3 = p.Rslt_rcst_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_rcst_grp_nm3.addAliasName("Rslt.rcst_grp_nm3", p);
		p.columnRslt_rcst_grp_cd4 = p.Rslt_rcst_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_rcst_grp_cd4.addAliasName("Rslt.rcst_grp_cd4", p);
		p.columnRslt_rcst_grp_nm4 = p.Rslt_rcst_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_rcst_grp_nm4.addAliasName("Rslt.rcst_grp_nm4", p);
		p.columnRslt_rcst_grp_cd5 = p.Rslt_rcst_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_rcst_grp_cd5.addAliasName("Rslt.rcst_grp_cd5", p);
		p.columnRslt_rcst_grp_nm5 = p.Rslt_rcst_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_rcst_grp_nm5.addAliasName("Rslt.rcst_grp_nm5", p);
		p.columnRslt_rcst_grp_cd6 = p.Rslt_rcst_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_rcst_grp_cd6.addAliasName("Rslt.rcst_grp_cd6", p);
		p.columnRslt_rcst_grp_nm6 = p.Rslt_rcst_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_rcst_grp_nm6.addAliasName("Rslt.rcst_grp_nm6", p);
		p.columnRslt_rcst_grp_cd7 = p.Rslt_rcst_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_rcst_grp_cd7.addAliasName("Rslt.rcst_grp_cd7", p);
		p.columnRslt_rcst_grp_nm7 = p.Rslt_rcst_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_rcst_grp_nm7.addAliasName("Rslt.rcst_grp_nm7", p);
		p.columnRslt_rcst_grp_cd8 = p.Rslt_rcst_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_rcst_grp_cd8.addAliasName("Rslt.rcst_grp_cd8", p);
		p.columnRslt_rcst_grp_nm8 = p.Rslt_rcst_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_rcst_grp_nm8.addAliasName("Rslt.rcst_grp_nm8", p);
		p.columnRslt_rcst_grp_cd9 = p.Rslt_rcst_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_rcst_grp_cd9.addAliasName("Rslt.rcst_grp_cd9", p);
		p.columnRslt_rcst_grp_nm9 = p.Rslt_rcst_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_rcst_grp_nm9.addAliasName("Rslt.rcst_grp_nm9", p);
		p.columnRslt_rcst_grp_cd10 = p.Rslt_rcst_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_rcst_grp_cd10.addAliasName("Rslt.rcst_grp_cd10", p);
		p.columnRslt_rcst_grp_nm10 = p.Rslt_rcst_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_rcst_grp_nm10.addAliasName("Rslt.rcst_grp_nm10", p);
		p.Rslt_bcst_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBG.MSBGP0250.RsltR.$bcst_grp_p);
		p.Rslt_bcst_grp_p_PPanel.setName("Rslt.bcst_grp_p");
		p.columnRslt_bcst_grp_cd1 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_bcst_grp_cd1.addAliasName("Rslt.bcst_grp_cd1", p);
		p.columnRslt_bcst_grp_nm1 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_bcst_grp_nm1.addAliasName("Rslt.bcst_grp_nm1", p);
		p.columnRslt_bcst_grp_cd2 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_bcst_grp_cd2.addAliasName("Rslt.bcst_grp_cd2", p);
		p.columnRslt_bcst_grp_nm2 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_bcst_grp_nm2.addAliasName("Rslt.bcst_grp_nm2", p);
		p.columnRslt_bcst_grp_cd3 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_bcst_grp_cd3.addAliasName("Rslt.bcst_grp_cd3", p);
		p.columnRslt_bcst_grp_nm3 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_bcst_grp_nm3.addAliasName("Rslt.bcst_grp_nm3", p);
		p.columnRslt_bcst_grp_cd4 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_bcst_grp_cd4.addAliasName("Rslt.bcst_grp_cd4", p);
		p.columnRslt_bcst_grp_nm4 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_bcst_grp_nm4.addAliasName("Rslt.bcst_grp_nm4", p);
		p.columnRslt_bcst_grp_cd5 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_bcst_grp_cd5.addAliasName("Rslt.bcst_grp_cd5", p);
		p.columnRslt_bcst_grp_nm5 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_bcst_grp_nm5.addAliasName("Rslt.bcst_grp_nm5", p);
		p.columnRslt_bcst_grp_cd6 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_bcst_grp_cd6.addAliasName("Rslt.bcst_grp_cd6", p);
		p.columnRslt_bcst_grp_nm6 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_bcst_grp_nm6.addAliasName("Rslt.bcst_grp_nm6", p);
		p.columnRslt_bcst_grp_cd7 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_bcst_grp_cd7.addAliasName("Rslt.bcst_grp_cd7", p);
		p.columnRslt_bcst_grp_nm7 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_bcst_grp_nm7.addAliasName("Rslt.bcst_grp_nm7", p);
		p.columnRslt_bcst_grp_cd8 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_bcst_grp_cd8.addAliasName("Rslt.bcst_grp_cd8", p);
		p.columnRslt_bcst_grp_nm8 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_bcst_grp_nm8.addAliasName("Rslt.bcst_grp_nm8", p);
		p.columnRslt_bcst_grp_cd9 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_bcst_grp_cd9.addAliasName("Rslt.bcst_grp_cd9", p);
		p.columnRslt_bcst_grp_nm9 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_bcst_grp_nm9.addAliasName("Rslt.bcst_grp_nm9", p);
		p.columnRslt_bcst_grp_cd10 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_bcst_grp_cd10.addAliasName("Rslt.bcst_grp_cd10", p);
		p.columnRslt_bcst_grp_nm10 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_bcst_grp_nm10.addAliasName("Rslt.bcst_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBGP_RcvActSrch p) {
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
	
	
	/** [Cnd_sw_to_bcst_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sw_to_bcst_cd_p = null;

	/**
	 * [Cnd_sw_to_bcst_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sw_to_bcst_cd_ListPutter() {
		if (Cnd_sw_to_bcst_cd_p == null) {
			Cnd_sw_to_bcst_cd_p = createCnd_sw_to_bcst_cd_ListPutter(Cnd_sw_to_bcst_cd, "sw_to_bcst_cd", "sw_to_bcst_nm");

		}
		return Cnd_sw_to_bcst_cd_p;
	}
	
	
	/** [Cnd_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_usr_cd_p = null;

	/**
	 * [Cnd_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_usr_cd_ListPutter() {
		if (Cnd_usr_cd_p == null) {
			Cnd_usr_cd_p = createCnd_usr_cd_ListPutter(Cnd_usr_cd, "usr_cd", "usr_nm");

		}
		return Cnd_usr_cd_p;
	}
	
	
	/** [Cnd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dpt_cd_p = null;

	/**
	 * [Cnd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dpt_cd_ListPutter() {
		if (Cnd_dpt_cd_p == null) {
			Cnd_dpt_cd_p = createCnd_dpt_cd_ListPutter(Cnd_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return Cnd_dpt_cd_p;
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
	
	
	/** [Cnd_trd_cd_ListPutter]の定義 */
	private MCListPutter Cnd_trd_cd_p = null;

	/**
	 * [Cnd_trd_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_trd_cd_ListPutter() {
		if (Cnd_trd_cd_p == null) {
			Cnd_trd_cd_p = createCnd_trd_cd_ListPutter(Cnd_trd_cd, "trd_cd", "trd_nm");

		}
		return Cnd_trd_cd_p;
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_RcvActSrch create(){
		MSBGP_RcvActSrch p = new MSBGP_RcvActSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_RcvActSrch create(String name){
		MSBGP_RcvActSrch p = new MSBGP_RcvActSrch(name);
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
		MSBGP_RcvActSrch_MC.jbfInitScreenOpe((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbfInitTop((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbfInitFold((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbfInitTab1((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbfInitMode((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbfInitPrnt((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbfInitTab2((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbfInitTab3((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbfInitRcstCnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbfInitBcstCnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbfInitCnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbfInitCtrl((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbfInitRPnl((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbfInitRslt((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbfInitBtn((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbInitScreenOpe((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbInitTop((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbInitFold((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbInitTab1((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbInitMode((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbInitPrnt((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbInitTab2((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbInitTab3((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbInitRcstCnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbInitBcstCnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbInitCnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbInitCtrl((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbInitRPnl((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbInitRslt((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.jbInitBtn((MSBGP_RcvActSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBGP_RcvActSrch p) {
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
	protected static void jbfInitTab1(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Mode]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMode(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.ModePanel = p.beansFactory.createPanel("Mode");
		p.ModeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Prnt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPrnt(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.PrntPanel = p.beansFactory.createPanel("Prnt");
		p.PrntTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [RcstCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRcstCnd(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.RcstCndPanel = p.beansFactory.createPanel("RcstCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [BcstCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBcstCnd(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.BcstCndPanel = p.beansFactory.createPanel("BcstCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_PRNT = p.beansFactory.createRadioButton("Cnd.ope_PRNT");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ar_appl_flg = p.beansFactory.createCheckBox("Cnd.ar_appl_flg");
		p.Cnd_susp_adv_flg = p.beansFactory.createCheckBox("Cnd.susp_adv_flg");
		p.Cnd_sw_flg = p.beansFactory.createCheckBox("Cnd.sw_flg");
		p.Cnd_tax_diff_flg = p.beansFactory.createCheckBox("Cnd.tax_diff_flg");
		p.Cnd_not_prnt_flg = p.beansFactory.createCheckBox("Cnd.not_prnt_flg");
		p.Cnd_prnt_flg = p.beansFactory.createCheckBox("Cnd.prnt_flg");
		p.Cnd_rcv_dt_fr_Label = p.beansFactory.createLabel("Cnd.rcv_dt_fr_Label");
		p.Cnd_rcv_dt_fr = p.beansFactory.createDateField("Cnd.rcv_dt_fr");
		p.Cnd_rcv_dt_fr.setLabel(p.Cnd_rcv_dt_fr_Label);
		p.Cnd_rcv_dt_to_Label = p.beansFactory.createLabel("Cnd.rcv_dt_to_Label");
		p.Cnd_rcv_dt_to = p.beansFactory.createDateField("Cnd.rcv_dt_to");
		p.Cnd_rcv_dt_to.setLabel(p.Cnd_rcv_dt_to_Label);
		p.Cnd_ac_dt_fr_Label = p.beansFactory.createLabel("Cnd.ac_dt_fr_Label");
		p.Cnd_ac_dt_fr = p.beansFactory.createDateField("Cnd.ac_dt_fr");
		p.Cnd_ac_dt_fr.setLabel(p.Cnd_ac_dt_fr_Label);
		p.Cnd_ac_dt_to_Label = p.beansFactory.createLabel("Cnd.ac_dt_to_Label");
		p.Cnd_ac_dt_to = p.beansFactory.createDateField("Cnd.ac_dt_to");
		p.Cnd_ac_dt_to.setLabel(p.Cnd_ac_dt_to_Label);
		p.Cnd_rcst_cd_Label = p.beansFactory.createLabel("Cnd.rcst_cd_Label");
		p.Cnd_rcst_cd = p.beansFactory.createTextField("Cnd.rcst_cd");
		p.Cnd_rcst_cd.setLabel(p.Cnd_rcst_cd_Label);
		p.Cnd_rcst_nm = p.beansFactory.createTextField("Cnd.rcst_nm");
		p.Cnd_bcst_cd_Label = p.beansFactory.createLabel("Cnd.bcst_cd_Label");
		p.Cnd_bcst_cd = p.beansFactory.createTextField("Cnd.bcst_cd");
		p.Cnd_bcst_cd.setLabel(p.Cnd_bcst_cd_Label);
		p.Cnd_bcst_nm = p.beansFactory.createTextField("Cnd.bcst_nm");
		p.Cnd_sw_to_bcst_cd_Label = p.beansFactory.createLabel("Cnd.sw_to_bcst_cd_Label");
		p.Cnd_sw_to_bcst_cd = p.beansFactory.createTextField("Cnd.sw_to_bcst_cd");
		p.Cnd_sw_to_bcst_cd.setLabel(p.Cnd_sw_to_bcst_cd_Label);
		p.Cnd_sw_to_bcst_nm = p.beansFactory.createTextField("Cnd.sw_to_bcst_nm");
		p.Cnd_usr_cd_Label = p.beansFactory.createLabel("Cnd.usr_cd_Label");
		p.Cnd_usr_cd = p.beansFactory.createTextField("Cnd.usr_cd");
		p.Cnd_usr_cd.setLabel(p.Cnd_usr_cd_Label);
		p.Cnd_usr_nm = p.beansFactory.createTextField("Cnd.usr_nm");
		p.Cnd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.dpt_cd_Label");
		p.Cnd_dpt_cd = p.beansFactory.createTextField("Cnd.dpt_cd");
		p.Cnd_dpt_cd.setLabel(p.Cnd_dpt_cd_Label);
		p.Cnd_dpt_nm = p.beansFactory.createTextField("Cnd.dpt_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_trd_rmrks_Label = p.beansFactory.createLabel("Cnd.trd_rmrks_Label");
		p.Cnd_trd_rmrks = p.beansFactory.createTextField("Cnd.trd_rmrks");
		p.Cnd_trd_rmrks.setLabel(p.Cnd_trd_rmrks_Label);
		p.Cnd_rcv_act_no_Label = p.beansFactory.createLabel("Cnd.rcv_act_no_Label");
		p.Cnd_rcv_act_no = p.beansFactory.createTextField("Cnd.rcv_act_no");
		p.Cnd_rcv_act_no.setLabel(p.Cnd_rcv_act_no_Label);
		p.Cnd_rcv_no_Label = p.beansFactory.createLabel("Cnd.rcv_no_Label");
		p.Cnd_rcv_no = p.beansFactory.createTextField("Cnd.rcv_no");
		p.Cnd_rcv_no.setLabel(p.Cnd_rcv_no_Label);
		p.Cnd_note_no_Label = p.beansFactory.createLabel("Cnd.note_no_Label");
		p.Cnd_note_no = p.beansFactory.createTextField("Cnd.note_no");
		p.Cnd_note_no.setLabel(p.Cnd_note_no_Label);
		p.Cnd_sw_to_rcv_act_no_Label = p.beansFactory.createLabel("Cnd.sw_to_rcv_act_no_Label");
		p.Cnd_sw_to_rcv_act_no = p.beansFactory.createTextField("Cnd.sw_to_rcv_act_no");
		p.Cnd_sw_to_rcv_act_no.setLabel(p.Cnd_sw_to_rcv_act_no_Label);
		p.Cnd_trd_cd_Label = p.beansFactory.createLabel("Cnd.trd_cd_Label");
		p.Cnd_trd_cd = p.beansFactory.createTextComboBox("Cnd.trd_cd");
		p.Cnd_trd_cd.setLabel(p.Cnd_trd_cd_Label);
		p.Cnd_trd_nm = p.beansFactory.createTextField("Cnd.trd_nm");
		p.Cnd_cur_cd_Label = p.beansFactory.createLabel("Cnd.cur_cd_Label");
		p.Cnd_cur_cd = p.beansFactory.createTextComboBox("Cnd.cur_cd");
		p.Cnd_cur_cd.setLabel(p.Cnd_cur_cd_Label);
		p.Cnd_cur_nm = p.beansFactory.createTextField("Cnd.cur_nm");
		p.Cnd_bill_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bill_dpt_cd_Label");
		p.Cnd_bill_dpt_cd = p.beansFactory.createTextField("Cnd.bill_dpt_cd");
		p.Cnd_bill_dpt_cd.setLabel(p.Cnd_bill_dpt_cd_Label);
		p.Cnd_bill_dpt_nm = p.beansFactory.createTextField("Cnd.bill_dpt_nm");
		p.Cnd_gen_rcv_no_Label = p.beansFactory.createLabel("Cnd.gen_rcv_no_Label");
		p.Cnd_gen_rcv_no = p.beansFactory.createTextField("Cnd.gen_rcv_no");
		p.Cnd_gen_rcv_no.setLabel(p.Cnd_gen_rcv_no_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_can_flg = p.beansFactory.createCheckBox("Cnd.can_flg");
		p.Cnd_rcv_auto_appl_flg = p.beansFactory.createCheckBox("Cnd.rcv_auto_appl_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_slip_sts_typ = p.beansFactory.createTableColumn("Rslt.slip_sts_typ", MCColumnType.TEXT);
		p.columnRslt_slip_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_rcv_act_no = p.beansFactory.createTableColumn("Rslt.rcv_act_no", MCColumnType.TEXT);
		p.columnRslt_rcv_act_seq = p.beansFactory.createTableColumn("Rslt.rcv_act_seq", MCColumnType.NUMBER);
		p.columnRslt_rcv_act_rev = p.beansFactory.createTableColumn("Rslt.rcv_act_rev", MCColumnType.NUMBER);
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_rcv_dt = p.beansFactory.createTableColumn("Rslt.rcv_dt", MCColumnType.DATE);
		p.columnRslt_ac_ym = p.beansFactory.createTableColumn("Rslt.ac_ym", MCColumnType.DATE);
		p.columnRslt_ac_dt = p.beansFactory.createTableColumn("Rslt.ac_dt", MCColumnType.DATE);
		p.columnRslt_trd_ptn_typ = p.beansFactory.createTableColumn("Rslt.trd_ptn_typ", MCColumnType.TEXT);
		p.columnRslt_rcst_cd = p.beansFactory.createTableColumn("Rslt.rcst_cd", MCColumnType.TEXT);
		p.columnRslt_rcst_nm = p.beansFactory.createTableColumn("Rslt.rcst_nm", MCColumnType.TEXT);
		p.columnRslt_bcst_cd = p.beansFactory.createTableColumn("Rslt.bcst_cd", MCColumnType.TEXT);
		p.columnRslt_bcst_nm = p.beansFactory.createTableColumn("Rslt.bcst_nm", MCColumnType.TEXT);
		p.columnRslt_bill_dpt_cd = p.beansFactory.createTableColumn("Rslt.bill_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_bill_dpt_nm = p.beansFactory.createTableColumn("Rslt.bill_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_ar_sttl_cd1 = p.beansFactory.createTableColumn("Rslt.ar_sttl_cd1", MCColumnType.TEXT);
		p.columnRslt_ar_sttl_nm1 = p.beansFactory.createTableColumn("Rslt.ar_sttl_nm1", MCColumnType.TEXT);
		p.columnRslt_rcv_no = p.beansFactory.createTableColumn("Rslt.rcv_no", MCColumnType.TEXT);
		p.columnRslt_note_no = p.beansFactory.createTableColumn("Rslt.note_no", MCColumnType.TEXT);
		p.columnRslt_bank_ac_cd = p.beansFactory.createTableColumn("Rslt.bank_ac_cd", MCColumnType.TEXT);
		p.columnRslt_bank_ac_nm = p.beansFactory.createTableColumn("Rslt.bank_ac_nm", MCColumnType.TEXT);
		p.columnRslt_bank_ac_no = p.beansFactory.createTableColumn("Rslt.bank_ac_no", MCColumnType.TEXT);
		p.columnRslt_ar_sttl_cd2 = p.beansFactory.createTableColumn("Rslt.ar_sttl_cd2", MCColumnType.TEXT);
		p.columnRslt_ar_sttl_nm2 = p.beansFactory.createTableColumn("Rslt.ar_sttl_nm2", MCColumnType.TEXT);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_amt_dec_place = p.beansFactory.createTableColumn("Rslt.amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_nm = p.beansFactory.createTableColumn("Rslt.base_cur_nm", MCColumnType.TEXT);
		p.columnRslt_base_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.base_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_sw_to_rcv_act_no = p.beansFactory.createTableColumn("Rslt.sw_to_rcv_act_no", MCColumnType.TEXT);
		p.columnRslt_sw_to_trd_cd = p.beansFactory.createTableColumn("Rslt.sw_to_trd_cd", MCColumnType.TEXT);
		p.columnRslt_sw_to_trd_nm = p.beansFactory.createTableColumn("Rslt.sw_to_trd_nm", MCColumnType.TEXT);
		p.columnRslt_sw_to_bcst_cd = p.beansFactory.createTableColumn("Rslt.sw_to_bcst_cd", MCColumnType.TEXT);
		p.columnRslt_sw_to_bcst_nm = p.beansFactory.createTableColumn("Rslt.sw_to_bcst_nm", MCColumnType.TEXT);
		p.columnRslt_usr_cd = p.beansFactory.createTableColumn("Rslt.usr_cd", MCColumnType.TEXT);
		p.columnRslt_usr_nm = p.beansFactory.createTableColumn("Rslt.usr_nm", MCColumnType.TEXT);
		p.columnRslt_dpt_cd = p.beansFactory.createTableColumn("Rslt.dpt_cd", MCColumnType.TEXT);
		p.columnRslt_dpt_nm = p.beansFactory.createTableColumn("Rslt.dpt_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_gen_rcv_no = p.beansFactory.createTableColumn("Rslt.gen_rcv_no", MCColumnType.TEXT);
		p.columnRslt_prnt_flg = p.beansFactory.createTableColumn("Rslt.prnt_flg", MCColumnType.CHECK);
		p.columnRslt_rcv_auto_appl_flg = p.beansFactory.createTableColumn("Rslt.rcv_auto_appl_flg", MCColumnType.CHECK);
		p.columnRslt_trd_rmrks = p.beansFactory.createTableColumn("Rslt.trd_rmrks", MCColumnType.TEXT);
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
	protected static void jbfInitBtn(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBGP0210 = p.beansFactory.createButton("Btn.open_MSBGP0210", "open");
		p.Btn_open_MSBGP0200 = p.beansFactory.createButton("Btn.open_MSBGP0200", "open");
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_indiv_prnt_flg = p.beansFactory.createCheckBox("Btn.indiv_prnt_flg");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBGP_RcvActSrch p) {
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
	protected static void jbInitTop(MSBGP_RcvActSrch p) {
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
	protected static void jbInitFold(MSBGP_RcvActSrch p) {
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
	protected static void jbInitTab1(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.ModePanel, null);
		p.Tab1Panel.setLastBeans(p.ModePanel);
		p.ModePanel.setNextBeans(p.PrntPanel);
		p.Tab1Panel.add(p.PrntPanel, null);
		p.PrntPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Mode]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMode(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.ModePanel.setBorder(p.ModeTitledBorder);
		p.ModePanel.setValueCheck(false);
		p.ModePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ModePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Prnt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPrnt(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.PrntPanel.setBorder(p.PrntTitledBorder);
		p.PrntPanel.setValueCheck(false);
		p.PrntPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PrntPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBGP_RcvActSrch p) {
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
	protected static void jbInitTab3(MSBGP_RcvActSrch p) {
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
	protected static void jbInitRcstCnd(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.RcstCndPanel.setValueCheck(false);
		p.RcstCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RcstCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [BcstCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBcstCnd(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.BcstCndPanel.setValueCheck(false);
		p.BcstCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BcstCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NS");
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.ope_META);
		p.ModePanel.add(p.Cnd_ar_appl_flg);
		p.ModePanel.setLastBeans(p.Cnd_ar_appl_flg);
		p.Cnd_ar_appl_flg.setNextBeans(p.Cnd_susp_adv_flg);
		p.Cnd_ar_appl_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.ar_appl_flg_META);
		p.ModePanel.add(p.Cnd_susp_adv_flg);
		p.Cnd_susp_adv_flg.setNextBeans(p.Cnd_sw_flg);
		p.Cnd_susp_adv_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.susp_adv_flg_META);
		p.ModePanel.add(p.Cnd_sw_flg);
		p.Cnd_sw_flg.setNextBeans(p.Cnd_tax_diff_flg);
		p.Cnd_sw_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.sw_flg_META);
		p.ModePanel.add(p.Cnd_tax_diff_flg);
		p.Cnd_tax_diff_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.tax_diff_flg_META);
		p.PrntPanel.add(p.Cnd_not_prnt_flg);
		p.PrntPanel.setLastBeans(p.Cnd_not_prnt_flg);
		p.Cnd_not_prnt_flg.setNextBeans(p.Cnd_prnt_flg);
		p.Cnd_not_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.not_prnt_flg_META);
		p.PrntPanel.add(p.Cnd_prnt_flg);
		p.Cnd_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.prnt_flg_META);
		p.CndPanel.add(p.Cnd_rcv_dt_fr_Label);
		p.CndPanel.add(p.Cnd_rcv_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_rcv_dt_fr);
		p.Cnd_rcv_dt_fr.setNextBeans(p.Cnd_rcv_dt_to);
		p.Cnd_rcv_dt_fr.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.rcv_dt_fr_META);
		p.Cnd_rcv_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rcv_dt_to_Label);
		p.CndPanel.add(p.Cnd_rcv_dt_to);
		p.Cnd_rcv_dt_to.setNextBeans(p.Cnd_ac_dt_fr);
		p.Cnd_rcv_dt_to.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.rcv_dt_to_META);
		p.Cnd_rcv_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ac_dt_fr);
		p.Cnd_ac_dt_fr.setNextBeans(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.ac_dt_fr_META);
		p.Cnd_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_to.setNextBeans(p.Cnd_rcst_cd);
		p.Cnd_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.ac_dt_to_META);
		p.Cnd_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rcst_cd_Label);
		p.CndPanel.add(p.Cnd_rcst_cd);
		p.Cnd_rcst_cd.setNextBeans(p.Cnd_rcst_nm);
		p.Cnd_rcst_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.rcst_cd_META);
		p.Cnd_rcst_cd.addLinkBeans(p.Cnd_rcst_nm);
		p.Cnd_rcst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rcst_cd, true);
		p.CndPanel.add(p.Cnd_rcst_nm);
		p.Cnd_rcst_nm.setNextBeans(p.Cnd_bcst_cd);
		p.Cnd_rcst_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.rcst_nm_META);
		p.setPluralValueEnable(p.Cnd_rcst_nm, true);
		p.CndPanel.add(p.Cnd_bcst_cd_Label);
		p.CndPanel.add(p.Cnd_bcst_cd);
		p.Cnd_bcst_cd.setNextBeans(p.Cnd_bcst_nm);
		p.Cnd_bcst_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.bcst_cd_META);
		p.Cnd_bcst_cd.addLinkBeans(p.Cnd_bcst_nm);
		p.Cnd_bcst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bcst_cd, true);
		p.CndPanel.add(p.Cnd_bcst_nm);
		p.Cnd_bcst_nm.setNextBeans(p.Cnd_sw_to_bcst_cd);
		p.Cnd_bcst_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.bcst_nm_META);
		p.setPluralValueEnable(p.Cnd_bcst_nm, true);
		p.CndPanel.add(p.Cnd_sw_to_bcst_cd_Label);
		p.CndPanel.add(p.Cnd_sw_to_bcst_cd);
		p.Cnd_sw_to_bcst_cd.setNextBeans(p.Cnd_sw_to_bcst_nm);
		p.Cnd_sw_to_bcst_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.sw_to_bcst_cd_META);
		p.Cnd_sw_to_bcst_cd.addLinkBeans(p.Cnd_sw_to_bcst_nm);
		p.Cnd_sw_to_bcst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sw_to_bcst_cd, true);
		p.CndPanel.add(p.Cnd_sw_to_bcst_nm);
		p.Cnd_sw_to_bcst_nm.setNextBeans(p.Cnd_usr_cd);
		p.Cnd_sw_to_bcst_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.sw_to_bcst_nm_META);
		p.setPluralValueEnable(p.Cnd_sw_to_bcst_nm, true);
		p.CndPanel.add(p.Cnd_usr_cd_Label);
		p.CndPanel.add(p.Cnd_usr_cd);
		p.Cnd_usr_cd.setNextBeans(p.Cnd_usr_nm);
		p.Cnd_usr_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.usr_cd_META);
		p.Cnd_usr_cd.addLinkBeans(p.Cnd_usr_nm);
		p.Cnd_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_usr_cd, true);
		p.CndPanel.add(p.Cnd_usr_nm);
		p.Cnd_usr_nm.setNextBeans(p.Cnd_dpt_cd);
		p.Cnd_usr_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.usr_nm_META);
		p.setPluralValueEnable(p.Cnd_usr_nm, true);
		p.CndPanel.add(p.Cnd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.dpt_cd_META);
		p.Cnd_dpt_cd.addLinkBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd, true);
		p.CndPanel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_trd_rmrks);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_trd_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_rmrks);
		p.Cnd_trd_rmrks.setNextBeans(p.Cnd_rcv_act_no);
		p.Cnd_trd_rmrks.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.trd_rmrks_META);
		p.setPluralValueEnable(p.Cnd_trd_rmrks, true);
		p.CndPanel.add(p.Cnd_rcv_act_no_Label);
		p.CndPanel.add(p.Cnd_rcv_act_no);
		p.Cnd_rcv_act_no.setNextBeans(p.Cnd_rcv_no);
		p.Cnd_rcv_act_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.rcv_act_no_META);
		p.setPluralValueEnable(p.Cnd_rcv_act_no, true);
		p.CndPanel.add(p.Cnd_rcv_no_Label);
		p.CndPanel.add(p.Cnd_rcv_no);
		p.Cnd_rcv_no.setNextBeans(p.Cnd_note_no);
		p.Cnd_rcv_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.rcv_no_META);
		p.setPluralValueEnable(p.Cnd_rcv_no, true);
		p.CndPanel.add(p.Cnd_note_no_Label);
		p.CndPanel.add(p.Cnd_note_no);
		p.Cnd_note_no.setNextBeans(p.Cnd_sw_to_rcv_act_no);
		p.Cnd_note_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.note_no_META);
		p.setPluralValueEnable(p.Cnd_note_no, true);
		p.CndPanel.add(p.Cnd_sw_to_rcv_act_no_Label);
		p.CndPanel.add(p.Cnd_sw_to_rcv_act_no);
		p.Cnd_sw_to_rcv_act_no.setNextBeans(p.Cnd_trd_cd);
		p.Cnd_sw_to_rcv_act_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.sw_to_rcv_act_no_META);
		p.setPluralValueEnable(p.Cnd_sw_to_rcv_act_no, true);
		p.Cnd_trd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cd, true);
		p.Cnd_trd_cd.setLinkBeans(p.Cnd_trd_nm);
		p.CndPanel.add(p.Cnd_trd_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cd);
		p.Cnd_trd_cd.setNextBeans(p.Cnd_trd_nm);
		p.Cnd_trd_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.trd_cd_META);
		p.CndPanel.add(p.Cnd_trd_nm);
		p.Cnd_trd_nm.setNextBeans(p.Cnd_cur_cd);
		p.Cnd_trd_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.trd_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_nm, true);
		p.Cnd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cur_cd, true);
		p.Cnd_cur_cd.setLinkBeans(p.Cnd_cur_nm);
		p.CndPanel.add(p.Cnd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_cur_cd);
		p.Cnd_cur_cd.setNextBeans(p.Cnd_cur_nm);
		p.Cnd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.cur_cd_META);
		p.CndPanel.add(p.Cnd_cur_nm);
		p.Cnd_cur_nm.setNextBeans(p.Cnd_bill_dpt_cd);
		p.Cnd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.cur_nm_META);
		p.setPluralValueEnable(p.Cnd_cur_nm, true);
		p.CndPanel.add(p.Cnd_bill_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bill_dpt_cd);
		p.Cnd_bill_dpt_cd.setNextBeans(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.bill_dpt_cd_META);
		p.Cnd_bill_dpt_cd.addLinkBeans(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bill_dpt_cd, true);
		p.CndPanel.add(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_nm.setNextBeans(p.Cnd_gen_rcv_no);
		p.Cnd_bill_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.bill_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bill_dpt_nm, true);
		p.CndPanel.add(p.Cnd_gen_rcv_no_Label);
		p.CndPanel.add(p.Cnd_gen_rcv_no);
		p.Cnd_gen_rcv_no.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_gen_rcv_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.gen_rcv_no_META);
		p.setPluralValueEnable(p.Cnd_gen_rcv_no, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_can_flg);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_can_flg);
		p.Cnd_can_flg.setNextBeans(p.Cnd_rcv_auto_appl_flg);
		p.Cnd_can_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.can_flg_META);
		p.CndPanel.add(p.Cnd_rcv_auto_appl_flg);
		p.Cnd_rcv_auto_appl_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0250.CndR.rcv_auto_appl_flg_META);
		p.RcstCndPanel.add(p.Cnd_rcst_grp_p_PPanel);
		p.RcstCndPanel.setLastBeans(p.Cnd_rcst_grp_p_PPanel);
		p.BcstCndPanel.add(p.Cnd_bcst_grp_p_PPanel);
		p.BcstCndPanel.setLastBeans(p.Cnd_bcst_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBGP_RcvActSrch p) {
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
	protected static void jbInitRPnl(MSBGP_RcvActSrch p) {
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
	protected static void jbInitRslt(MSBGP_RcvActSrch p) {
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
	protected static void jbInitBtn(MSBGP_RcvActSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_open_MSBGP0210.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBGP0210);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBGP0210);
		p.Btn_open_MSBGP0210.setNextBeans(p.Btn_open_MSBGP0200);
		p.Btn_open_MSBGP0200.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBGP0200);
		p.Btn_open_MSBGP0200.setNextBeans(p.Btn_prnt);
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F7);
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
		p.Btn_indiv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBG.MSBGP0250.BtnR.indiv_prnt_flg_META);
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
		MSBGP_RcvActSrch_MC.mcInitScreenOpe((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.mcInitTop((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.mcInitFold((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.mcInitTab1((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.mcInitMode((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.mcInitPrnt((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.mcInitTab2((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.mcInitTab3((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.mcInitRcstCnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.mcInitBcstCnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.mcInitCnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.mcInitCtrl((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.mcInitRPnl((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.mcInitRslt((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.mcInitBtn((MSBGP_RcvActSrch)this);

		// [SRCH_REF]ステータスのモードの設定
		MSBGP_RcvActSrch_MC.statusInitSRCH__REF_ScreenOpe((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__REF_Top((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__REF_Fold((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__REF_Tab1((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__REF_Mode((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__REF_Prnt((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__REF_Tab2((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__REF_Tab3((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__REF_RcstCnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__REF_BcstCnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__REF_Cnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__REF_Ctrl((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__REF_RPnl((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__REF_Rslt((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__REF_Btn((MSBGP_RcvActSrch)this);

		// [REF]ステータスのモードの設定
		MSBGP_RcvActSrch_MC.statusInitREF_ScreenOpe((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitREF_Top((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitREF_Fold((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitREF_Tab1((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitREF_Mode((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitREF_Prnt((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitREF_Tab2((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitREF_Tab3((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitREF_RcstCnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitREF_BcstCnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitREF_Cnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitREF_Ctrl((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitREF_RPnl((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitREF_Rslt((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitREF_Btn((MSBGP_RcvActSrch)this);

		// [SRCH_PRNT]ステータスのモードの設定
		MSBGP_RcvActSrch_MC.statusInitSRCH__PRNT_ScreenOpe((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__PRNT_Top((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__PRNT_Fold((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__PRNT_Tab1((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__PRNT_Mode((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__PRNT_Prnt((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__PRNT_Tab2((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__PRNT_Tab3((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__PRNT_RcstCnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__PRNT_BcstCnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__PRNT_Cnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__PRNT_Ctrl((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__PRNT_RPnl((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__PRNT_Rslt((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitSRCH__PRNT_Btn((MSBGP_RcvActSrch)this);

		// [PRNT]ステータスのモードの設定
		MSBGP_RcvActSrch_MC.statusInitPRNT_ScreenOpe((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitPRNT_Top((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitPRNT_Fold((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitPRNT_Tab1((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitPRNT_Mode((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitPRNT_Prnt((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitPRNT_Tab2((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitPRNT_Tab3((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitPRNT_RcstCnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitPRNT_BcstCnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitPRNT_Cnd((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitPRNT_Ctrl((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitPRNT_RPnl((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitPRNT_Rslt((MSBGP_RcvActSrch)this);
		MSBGP_RcvActSrch_MC.statusInitPRNT_Btn((MSBGP_RcvActSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBGP_RcvActSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBGP_RcvActSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBGP_RcvActSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBGP_RcvActSrch p) {
	}

	/**
	 *  [Mode]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMode(MSBGP_RcvActSrch p) {
	}

	/**
	 *  [Prnt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPrnt(MSBGP_RcvActSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBGP_RcvActSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBGP_RcvActSrch p) {
	}

	/**
	 *  [RcstCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRcstCnd(MSBGP_RcvActSrch p) {
	}

	/**
	 *  [BcstCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBcstCnd(MSBGP_RcvActSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBGP_RcvActSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_PRNT.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ar_appl_flg.addAllListener(p);
		p.Cnd_susp_adv_flg.addAllListener(p);
		p.Cnd_sw_flg.addAllListener(p);
		p.Cnd_tax_diff_flg.addAllListener(p);
		p.Cnd_not_prnt_flg.addAllListener(p);
		p.Cnd_prnt_flg.addAllListener(p);
		p.Cnd_rcv_dt_fr.setListListener(p);
		p.Cnd_rcv_dt_fr.addAllListener(p);
		p.Cnd_rcv_dt_to.setListListener(p);
		p.Cnd_rcv_dt_to.addAllListener(p);
		p.Cnd_ac_dt_fr.setListListener(p);
		p.Cnd_ac_dt_fr.addAllListener(p);
		p.Cnd_ac_dt_to.setListListener(p);
		p.Cnd_ac_dt_to.addAllListener(p);
		p.Cnd_rcst_cd.setListListener(p);
		p.Cnd_rcst_cd.addAllListener(p);
		p.Cnd_rcst_nm.setListListener(p);
		p.Cnd_rcst_nm.addAllListener(p);
		p.Cnd_bcst_cd.setListListener(p);
		p.Cnd_bcst_cd.addAllListener(p);
		p.Cnd_bcst_nm.setListListener(p);
		p.Cnd_bcst_nm.addAllListener(p);
		p.Cnd_sw_to_bcst_cd.setListListener(p);
		p.Cnd_sw_to_bcst_cd.addAllListener(p);
		p.Cnd_sw_to_bcst_nm.setListListener(p);
		p.Cnd_sw_to_bcst_nm.addAllListener(p);
		p.Cnd_usr_cd.setListListener(p);
		p.Cnd_usr_cd.addAllListener(p);
		p.Cnd_usr_nm.setListListener(p);
		p.Cnd_usr_nm.addAllListener(p);
		p.Cnd_dpt_cd.setListListener(p);
		p.Cnd_dpt_cd.addAllListener(p);
		p.Cnd_dpt_nm.setListListener(p);
		p.Cnd_dpt_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_trd_rmrks.setListListener(p);
		p.Cnd_trd_rmrks.addAllListener(p);
		p.Cnd_rcv_act_no.setListListener(p);
		p.Cnd_rcv_act_no.addAllListener(p);
		p.Cnd_rcv_no.setListListener(p);
		p.Cnd_rcv_no.addAllListener(p);
		p.Cnd_note_no.setListListener(p);
		p.Cnd_note_no.addAllListener(p);
		p.Cnd_sw_to_rcv_act_no.setListListener(p);
		p.Cnd_sw_to_rcv_act_no.addAllListener(p);
		p.Cnd_trd_cd.setListListener(p);
		p.Cnd_trd_cd.addAllListener(p);
		p.Cnd_trd_nm.setListListener(p);
		p.Cnd_trd_nm.addAllListener(p);
		p.Cnd_cur_cd.setListListener(p);
		p.Cnd_cur_cd.addAllListener(p);
		p.Cnd_cur_nm.setListListener(p);
		p.Cnd_cur_nm.addAllListener(p);
		p.Cnd_bill_dpt_cd.setListListener(p);
		p.Cnd_bill_dpt_cd.addAllListener(p);
		p.Cnd_bill_dpt_nm.setListListener(p);
		p.Cnd_bill_dpt_nm.addAllListener(p);
		p.Cnd_gen_rcv_no.setListListener(p);
		p.Cnd_gen_rcv_no.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_can_flg.addAllListener(p);
		p.Cnd_rcv_auto_appl_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBGP_RcvActSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBGP_RcvActSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBGP_RcvActSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_slip_sts_typ.addAllListener(p);
		p.columnRslt_slip_sts_typ.setListListener(p);
		p.columnRslt_slip_sts_typ_nm.addAllListener(p);
		p.columnRslt_slip_sts_typ_nm.setListListener(p);
		p.columnRslt_rcv_act_no.addAllListener(p);
		p.columnRslt_rcv_act_no.setListListener(p);
		p.columnRslt_rcv_act_seq.addAllListener(p);
		p.columnRslt_rcv_act_seq.setListListener(p);
		p.columnRslt_rcv_act_rev.addAllListener(p);
		p.columnRslt_rcv_act_rev.setListListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_rcv_dt.addAllListener(p);
		p.columnRslt_rcv_dt.setListListener(p);
		p.columnRslt_ac_ym.addAllListener(p);
		p.columnRslt_ac_ym.setListListener(p);
		p.columnRslt_ac_dt.addAllListener(p);
		p.columnRslt_ac_dt.setListListener(p);
		p.columnRslt_trd_ptn_typ.addAllListener(p);
		p.columnRslt_trd_ptn_typ.setListListener(p);
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
		p.columnRslt_ar_sttl_cd1.addAllListener(p);
		p.columnRslt_ar_sttl_cd1.setListListener(p);
		p.columnRslt_ar_sttl_nm1.addAllListener(p);
		p.columnRslt_ar_sttl_nm1.setListListener(p);
		p.columnRslt_rcv_no.addAllListener(p);
		p.columnRslt_rcv_no.setListListener(p);
		p.columnRslt_note_no.addAllListener(p);
		p.columnRslt_note_no.setListListener(p);
		p.columnRslt_bank_ac_cd.addAllListener(p);
		p.columnRslt_bank_ac_cd.setListListener(p);
		p.columnRslt_bank_ac_nm.addAllListener(p);
		p.columnRslt_bank_ac_nm.setListListener(p);
		p.columnRslt_bank_ac_no.addAllListener(p);
		p.columnRslt_bank_ac_no.setListListener(p);
		p.columnRslt_ar_sttl_cd2.addAllListener(p);
		p.columnRslt_ar_sttl_cd2.setListListener(p);
		p.columnRslt_ar_sttl_nm2.addAllListener(p);
		p.columnRslt_ar_sttl_nm2.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_amt_dec_place.addAllListener(p);
		p.columnRslt_amt_dec_place.setListListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_nm.addAllListener(p);
		p.columnRslt_base_cur_nm.setListListener(p);
		p.columnRslt_base_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_base_cur_amt_dec_place.setListListener(p);
		p.columnRslt_sw_to_rcv_act_no.addAllListener(p);
		p.columnRslt_sw_to_rcv_act_no.setListListener(p);
		p.columnRslt_sw_to_trd_cd.addAllListener(p);
		p.columnRslt_sw_to_trd_cd.setListListener(p);
		p.columnRslt_sw_to_trd_nm.addAllListener(p);
		p.columnRslt_sw_to_trd_nm.setListListener(p);
		p.columnRslt_sw_to_bcst_cd.addAllListener(p);
		p.columnRslt_sw_to_bcst_cd.setListListener(p);
		p.columnRslt_sw_to_bcst_nm.addAllListener(p);
		p.columnRslt_sw_to_bcst_nm.setListListener(p);
		p.columnRslt_usr_cd.addAllListener(p);
		p.columnRslt_usr_cd.setListListener(p);
		p.columnRslt_usr_nm.addAllListener(p);
		p.columnRslt_usr_nm.setListListener(p);
		p.columnRslt_dpt_cd.addAllListener(p);
		p.columnRslt_dpt_cd.setListListener(p);
		p.columnRslt_dpt_nm.addAllListener(p);
		p.columnRslt_dpt_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_gen_rcv_no.addAllListener(p);
		p.columnRslt_gen_rcv_no.setListListener(p);
		p.columnRslt_prnt_flg.addAllListener(p);
		p.columnRslt_rcv_auto_appl_flg.addAllListener(p);
		p.columnRslt_trd_rmrks.addAllListener(p);
		p.columnRslt_trd_rmrks.setListListener(p);
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
	protected static void mcInitBtn(MSBGP_RcvActSrch p) {
		p.Btn_open_MSBGP0210.addAllListener(p);
		p.Btn_open_MSBGP0210.setAPMethodName("doBtn_open_MSBGP0210");
		p.Btn_open_MSBGP0200.addAllListener(p);
		p.Btn_open_MSBGP0200.setAPMethodName("doBtn_open_MSBGP0200");
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_indiv_prnt_flg.addAllListener(p);
	}

	/**
	 * [SRCH_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ScreenOpe(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Top(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Fold(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab1(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Mode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Mode(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Prnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Prnt(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab2(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab3(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[RcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_RcstCnd(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[BcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_BcstCnd(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd(MSBGP_RcvActSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_ar_appl_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_susp_adv_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_sw_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_tax_diff_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_not_prnt_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_prnt_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_rcv_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rcv_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rcst_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rcst_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sw_to_bcst_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sw_to_bcst_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_usr_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rcv_act_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rcv_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_note_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sw_to_rcv_act_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_gen_rcv_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_can_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_rcv_auto_appl_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_rcst_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bcst_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Ctrl(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_RPnl(MSBGP_RcvActSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_REF, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Rslt(MSBGP_RcvActSrch p){
		p.columnRslt_check.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_slip_sts_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_act_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_act_seq.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_rcv_act_rev.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_rcst_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rcst_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bcst_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bcst_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ar_sttl_cd1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ar_sttl_nm1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ar_sttl_cd2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ar_sttl_nm2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_subttl1_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_subttl2_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_tax_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_tax_diff_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_base_cur_subttl1_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_subttl2_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_diff_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_sw_to_rcv_act_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sw_to_trd_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sw_to_trd_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bcst_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bcst_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_gen_rcv_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_prnt_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_auto_appl_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_rcst_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_bcst_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Btn(MSBGP_RcvActSrch p){
		p.Btn_open_MSBGP0210.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_open_MSBGP0200.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBGP_RcvActSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBGP_RcvActSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBGP_RcvActSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBGP_RcvActSrch p){

	}

	/**
	 * [REF]ステータスの[Mode]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mode(MSBGP_RcvActSrch p){

	}

	/**
	 * [REF]ステータスの[Prnt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Prnt(MSBGP_RcvActSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBGP_RcvActSrch p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MSBGP_RcvActSrch p){

	}

	/**
	 * [REF]ステータスの[RcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_RcstCnd(MSBGP_RcvActSrch p){

	}

	/**
	 * [REF]ステータスの[BcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_BcstCnd(MSBGP_RcvActSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBGP_RcvActSrch p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ar_appl_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_susp_adv_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sw_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_tax_diff_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_not_prnt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_prnt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rcv_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sw_to_bcst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sw_to_bcst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_act_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_note_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sw_to_rcv_act_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gen_rcv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_can_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rcv_auto_appl_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rcst_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bcst_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBGP_RcvActSrch p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBGP_RcvActSrch p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBGP_RcvActSrch p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_slip_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_act_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_rcv_act_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_rcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ar_sttl_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ar_sttl_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ar_sttl_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ar_sttl_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_subttl1_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_subttl2_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_tax_diff_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_base_cur_subttl1_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_subttl2_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_diff_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_sw_to_rcv_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sw_to_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sw_to_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gen_rcv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_auto_appl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_rcst_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_bcst_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
	protected static void statusInitREF_Btn(MSBGP_RcvActSrch p){
		p.Btn_open_MSBGP0210.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBGP0200.putMode(p, REF, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_ScreenOpe(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Top(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Fold(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab1(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Mode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Mode(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Prnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Prnt(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab2(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab3(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[RcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_RcstCnd(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[BcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_BcstCnd(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Cnd(MSBGP_RcvActSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_ar_appl_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_susp_adv_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_sw_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_tax_diff_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_not_prnt_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_prnt_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_rcv_dt_fr.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcv_dt_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcst_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcst_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sw_to_bcst_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sw_to_bcst_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_usr_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcv_act_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcv_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_note_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sw_to_rcv_act_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_gen_rcv_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_can_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_rcv_auto_appl_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_rcst_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bcst_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Ctrl(MSBGP_RcvActSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_RPnl(MSBGP_RcvActSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_PRNT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Rslt(MSBGP_RcvActSrch p){
		p.columnRslt_check.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_slip_sts_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_act_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_act_seq.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_rcv_act_rev.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_rcst_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcst_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bcst_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bcst_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ar_sttl_cd1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ar_sttl_nm1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ar_sttl_cd2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ar_sttl_nm2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_subttl1_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_subttl2_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_tax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_tax_diff_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_base_cur_subttl1_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_subttl2_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_diff_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_sw_to_rcv_act_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_trd_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_trd_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bcst_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bcst_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_gen_rcv_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_prnt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_auto_appl_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_rcst_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_bcst_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
	protected static void statusInitSRCH__PRNT_Btn(MSBGP_RcvActSrch p){
		p.Btn_open_MSBGP0210.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_open_MSBGP0200.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ScreenOpe(MSBGP_RcvActSrch p){

	}

	/**
	 * [PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Top(MSBGP_RcvActSrch p){

	}

	/**
	 * [PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Fold(MSBGP_RcvActSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab1(MSBGP_RcvActSrch p){

	}

	/**
	 * [PRNT]ステータスの[Mode]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Mode(MSBGP_RcvActSrch p){

	}

	/**
	 * [PRNT]ステータスの[Prnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Prnt(MSBGP_RcvActSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab2(MSBGP_RcvActSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab3(MSBGP_RcvActSrch p){

	}

	/**
	 * [PRNT]ステータスの[RcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RcstCnd(MSBGP_RcvActSrch p){

	}

	/**
	 * [PRNT]ステータスの[BcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_BcstCnd(MSBGP_RcvActSrch p){

	}

	/**
	 * [PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd(MSBGP_RcvActSrch p){
		p.Cnd_ope_Group.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_ar_appl_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_susp_adv_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_sw_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_tax_diff_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_not_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_rcv_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcv_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcst_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcst_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sw_to_bcst_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sw_to_bcst_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_usr_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcv_act_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcv_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_note_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sw_to_rcv_act_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_gen_rcv_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_can_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_rcv_auto_appl_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_rcst_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bcst_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Ctrl(MSBGP_RcvActSrch p){

	}

	/**
	 * [PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RPnl(MSBGP_RcvActSrch p){
		p.RPnl_dwnld.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Rslt(MSBGP_RcvActSrch p){
		p.columnRslt_check.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnRslt_slip_sts_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_slip_sts_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_act_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_act_seq.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_rcv_act_rev.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_rcst_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcst_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bcst_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bcst_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ar_sttl_cd1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ar_sttl_nm1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ar_sttl_cd2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ar_sttl_nm2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_subttl1_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_subttl2_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_tax_diff_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_base_cur_subttl1_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_subttl2_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_diff_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_sw_to_rcv_act_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_trd_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_trd_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bcst_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bcst_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_gen_rcv_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_prnt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_auto_appl_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_rcst_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_bcst_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
	protected static void statusInitPRNT_Btn(MSBGP_RcvActSrch p){
		p.Btn_open_MSBGP0210.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_open_MSBGP0200.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_indiv_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_REF;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBGP_RcvActSrch_MC.setTableConfigRslt((MSBGP_RcvActSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBGP_RcvActSrch p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_slip_sts_typ.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.slip_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slip_sts_typ);
		p.columnRslt_slip_sts_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.slip_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slip_sts_typ_nm);
		p.columnRslt_rcv_act_no.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.rcv_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_act_no);
		p.columnRslt_rcv_act_seq.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.rcv_act_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_act_seq);
		p.columnRslt_rcv_act_rev.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.rcv_act_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_act_rev);
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.columnRslt_rcv_dt.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.rcv_dt_META);
		p.columnRslt_rcv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_dt);
		p.columnRslt_ac_ym.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.ac_ym_META);
		p.columnRslt_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_ym);
		p.columnRslt_ac_dt.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.ac_dt_META);
		p.columnRslt_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_dt);
		p.columnRslt_trd_ptn_typ.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.trd_ptn_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_ptn_typ);
		p.columnRslt_rcst_cd.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.rcst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcst_cd);
		p.columnRslt_rcst_nm.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.rcst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcst_nm);
		p.columnRslt_bcst_cd.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.bcst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bcst_cd);
		p.columnRslt_bcst_nm.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.bcst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bcst_nm);
		p.columnRslt_bill_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.bill_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_dpt_cd);
		p.columnRslt_bill_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.bill_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_dpt_nm);
		p.columnRslt_ar_sttl_cd1.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.ar_sttl_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_sttl_cd1);
		p.columnRslt_ar_sttl_nm1.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.ar_sttl_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_sttl_nm1);
		p.columnRslt_rcv_no.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.rcv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_no);
		p.columnRslt_note_no.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.note_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_no);
		p.columnRslt_bank_ac_cd.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.bank_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_cd);
		p.columnRslt_bank_ac_nm.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.bank_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_nm);
		p.columnRslt_bank_ac_no.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.bank_ac_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_no);
		p.columnRslt_ar_sttl_cd2.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.ar_sttl_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_sttl_cd2);
		p.columnRslt_ar_sttl_nm2.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.ar_sttl_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_sttl_nm2);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_amt_dec_place.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt_dec_place);
		p.RsltTable.addTable(p.Rslt_subttl1_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_subttl2_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_tax_diff_amt_p_PPanel.AmtTable);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_nm.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.base_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_nm);
		p.columnRslt_base_cur_amt_dec_place.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.base_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_amt_dec_place);
		p.RsltTable.addTable(p.Rslt_base_cur_subttl1_p_PPanel.AmtTable);
		p.Rslt_base_cur_subttl1_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.RsltTable.addTable(p.Rslt_base_cur_subttl2_p_PPanel.AmtTable);
		p.Rslt_base_cur_subttl2_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.RsltTable.addTable(p.Rslt_base_cur_tax_amt_p_PPanel.AmtTable);
		p.Rslt_base_cur_tax_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.RsltTable.addTable(p.Rslt_base_cur_tax_diff_amt_p_PPanel.AmtTable);
		p.Rslt_base_cur_tax_diff_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.columnRslt_sw_to_rcv_act_no.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.sw_to_rcv_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_to_rcv_act_no);
		p.columnRslt_sw_to_trd_cd.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.sw_to_trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_to_trd_cd);
		p.columnRslt_sw_to_trd_nm.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.sw_to_trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_to_trd_nm);
		p.columnRslt_sw_to_bcst_cd.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.sw_to_bcst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_to_bcst_cd);
		p.columnRslt_sw_to_bcst_nm.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.sw_to_bcst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_to_bcst_nm);
		p.columnRslt_usr_cd.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_cd);
		p.columnRslt_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_nm);
		p.columnRslt_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_cd);
		p.columnRslt_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_gen_rcv_no.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.gen_rcv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gen_rcv_no);
		p.columnRslt_prnt_flg.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prnt_flg);
		p.columnRslt_rcv_auto_appl_flg.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.rcv_auto_appl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_auto_appl_flg);
		p.columnRslt_trd_rmrks.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.RsltTable.addTable(p.Rslt_rcst_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_bcst_grp_p_PPanel.BpGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBG.MSBGP0250.RsltR.upd_srv_req_no_META);
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
		Cnd_sw_to_bcst_cd.getListConfig().setPutter(getCnd_sw_to_bcst_cd_ListPutter());
		Cnd_usr_cd.getListConfig().setPutter(getCnd_usr_cd_ListPutter());
		Cnd_dpt_cd.getListConfig().setPutter(getCnd_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cd.getListConfig().setPutter(getCnd_trd_cd_ListPutter());
		Cnd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cur_cd.getListConfig().setPutter(getCnd_cur_cd_ListPutter());
		Cnd_bill_dpt_cd.getListConfig().setPutter(getCnd_bill_dpt_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REFStatus() {
		status = SRCH_REF;
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
		if (SRCH_REF.equals(status)) {
			setSRCH_REFStatus();
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
	 * [Cnd_sw_to_bcst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sw_to_bcst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trd");
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_rcst_cd) return getCnd_rcst_cd(row, info);
		if(combo == Cnd_bcst_cd) return getCnd_bcst_cd(row, info);
		if(combo == Cnd_sw_to_bcst_cd) return getCnd_sw_to_bcst_cd(row, info);
		if(combo == Cnd_usr_cd) return getCnd_usr_cd(row, info);
		if(combo == Cnd_dpt_cd) return getCnd_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_trd_cd) return getCnd_trd_cd(row, info);
		if(combo == Cnd_cur_cd) return getCnd_cur_cd(row, info);
		if(combo == Cnd_bill_dpt_cd) return getCnd_bill_dpt_cd(row, info);
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
		if (vc == Cnd_ar_appl_flg) return doCnd_ar_appl_flg_VC(info);
		if (vc == Cnd_susp_adv_flg) return doCnd_susp_adv_flg_VC(info);
		if (vc == Cnd_sw_flg) return doCnd_sw_flg_VC(info);
		if (vc == Cnd_tax_diff_flg) return doCnd_tax_diff_flg_VC(info);
		if (vc == Cnd_not_prnt_flg) return doCnd_not_prnt_flg_VC(info);
		if (vc == Cnd_prnt_flg) return doCnd_prnt_flg_VC(info);
		if (vc == Cnd_rcv_dt_fr) return doCnd_rcv_dt_fr_VC(info);
		if (vc == Cnd_rcv_dt_to) return doCnd_rcv_dt_to_VC(info);
		if (vc == Cnd_ac_dt_fr) return doCnd_ac_dt_fr_VC(info);
		if (vc == Cnd_ac_dt_to) return doCnd_ac_dt_to_VC(info);
		if (vc == Cnd_rcst_cd) return doCnd_rcst_cd_VC(info);
		if (vc == Cnd_rcst_nm) return doCnd_rcst_nm_VC(info);
		if (vc == Cnd_bcst_cd) return doCnd_bcst_cd_VC(info);
		if (vc == Cnd_bcst_nm) return doCnd_bcst_nm_VC(info);
		if (vc == Cnd_sw_to_bcst_cd) return doCnd_sw_to_bcst_cd_VC(info);
		if (vc == Cnd_sw_to_bcst_nm) return doCnd_sw_to_bcst_nm_VC(info);
		if (vc == Cnd_usr_cd) return doCnd_usr_cd_VC(info);
		if (vc == Cnd_usr_nm) return doCnd_usr_nm_VC(info);
		if (vc == Cnd_dpt_cd) return doCnd_dpt_cd_VC(info);
		if (vc == Cnd_dpt_nm) return doCnd_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_trd_rmrks) return doCnd_trd_rmrks_VC(info);
		if (vc == Cnd_rcv_act_no) return doCnd_rcv_act_no_VC(info);
		if (vc == Cnd_rcv_no) return doCnd_rcv_no_VC(info);
		if (vc == Cnd_note_no) return doCnd_note_no_VC(info);
		if (vc == Cnd_sw_to_rcv_act_no) return doCnd_sw_to_rcv_act_no_VC(info);
		if (vc == Cnd_trd_cd) return doCnd_trd_cd_VC(info);
		if (vc == Cnd_trd_nm) return doCnd_trd_nm_VC(info);
		if (vc == Cnd_cur_cd) return doCnd_cur_cd_VC(info);
		if (vc == Cnd_cur_nm) return doCnd_cur_nm_VC(info);
		if (vc == Cnd_bill_dpt_cd) return doCnd_bill_dpt_cd_VC(info);
		if (vc == Cnd_bill_dpt_nm) return doCnd_bill_dpt_nm_VC(info);
		if (vc == Cnd_gen_rcv_no) return doCnd_gen_rcv_no_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_can_flg) return doCnd_can_flg_VC(info);
		if (vc == Cnd_rcv_auto_appl_flg) return doCnd_rcv_auto_appl_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_slip_sts_typ) return doRslt_slip_sts_typ_VC(info);
		if (vc == columnRslt_slip_sts_typ_nm) return doRslt_slip_sts_typ_nm_VC(info);
		if (vc == columnRslt_rcv_act_no) return doRslt_rcv_act_no_VC(info);
		if (vc == columnRslt_rcv_act_seq) return doRslt_rcv_act_seq_VC(info);
		if (vc == columnRslt_rcv_act_rev) return doRslt_rcv_act_rev_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_rcv_dt) return doRslt_rcv_dt_VC(info);
		if (vc == columnRslt_ac_ym) return doRslt_ac_ym_VC(info);
		if (vc == columnRslt_ac_dt) return doRslt_ac_dt_VC(info);
		if (vc == columnRslt_trd_ptn_typ) return doRslt_trd_ptn_typ_VC(info);
		if (vc == columnRslt_rcst_cd) return doRslt_rcst_cd_VC(info);
		if (vc == columnRslt_rcst_nm) return doRslt_rcst_nm_VC(info);
		if (vc == columnRslt_bcst_cd) return doRslt_bcst_cd_VC(info);
		if (vc == columnRslt_bcst_nm) return doRslt_bcst_nm_VC(info);
		if (vc == columnRslt_bill_dpt_cd) return doRslt_bill_dpt_cd_VC(info);
		if (vc == columnRslt_bill_dpt_nm) return doRslt_bill_dpt_nm_VC(info);
		if (vc == columnRslt_ar_sttl_cd1) return doRslt_ar_sttl_cd1_VC(info);
		if (vc == columnRslt_ar_sttl_nm1) return doRslt_ar_sttl_nm1_VC(info);
		if (vc == columnRslt_rcv_no) return doRslt_rcv_no_VC(info);
		if (vc == columnRslt_note_no) return doRslt_note_no_VC(info);
		if (vc == columnRslt_bank_ac_cd) return doRslt_bank_ac_cd_VC(info);
		if (vc == columnRslt_bank_ac_nm) return doRslt_bank_ac_nm_VC(info);
		if (vc == columnRslt_bank_ac_no) return doRslt_bank_ac_no_VC(info);
		if (vc == columnRslt_ar_sttl_cd2) return doRslt_ar_sttl_cd2_VC(info);
		if (vc == columnRslt_ar_sttl_nm2) return doRslt_ar_sttl_nm2_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_amt_dec_place) return doRslt_amt_dec_place_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_nm) return doRslt_base_cur_nm_VC(info);
		if (vc == columnRslt_base_cur_amt_dec_place) return doRslt_base_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_sw_to_rcv_act_no) return doRslt_sw_to_rcv_act_no_VC(info);
		if (vc == columnRslt_sw_to_trd_cd) return doRslt_sw_to_trd_cd_VC(info);
		if (vc == columnRslt_sw_to_trd_nm) return doRslt_sw_to_trd_nm_VC(info);
		if (vc == columnRslt_sw_to_bcst_cd) return doRslt_sw_to_bcst_cd_VC(info);
		if (vc == columnRslt_sw_to_bcst_nm) return doRslt_sw_to_bcst_nm_VC(info);
		if (vc == columnRslt_usr_cd) return doRslt_usr_cd_VC(info);
		if (vc == columnRslt_usr_nm) return doRslt_usr_nm_VC(info);
		if (vc == columnRslt_dpt_cd) return doRslt_dpt_cd_VC(info);
		if (vc == columnRslt_dpt_nm) return doRslt_dpt_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_gen_rcv_no) return doRslt_gen_rcv_no_VC(info);
		if (vc == columnRslt_prnt_flg) return doRslt_prnt_flg_VC(info);
		if (vc == columnRslt_rcv_auto_appl_flg) return doRslt_rcv_auto_appl_flg_VC(info);
		if (vc == columnRslt_trd_rmrks) return doRslt_trd_rmrks_VC(info);
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
	 * [Cnd]パネルの[ar_appl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ar_appl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[susp_adv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_susp_adv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sw_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sw_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tax_diff_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tax_diff_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sw_to_bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sw_to_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sw_to_bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sw_to_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sw_to_rcv_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sw_to_rcv_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[gen_rcv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gen_rcv_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcv_auto_appl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_auto_appl_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[slip_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slip_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slip_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcv_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_ptn_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_sttl_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_sttl_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ar_sttl_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_sttl_nm1_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[note_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_sttl_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_sttl_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ar_sttl_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_sttl_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_to_rcv_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_to_rcv_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_to_trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_to_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_to_trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_to_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_to_bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_to_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_to_bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_to_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[gen_rcv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gen_rcv_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcv_auto_appl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_auto_appl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_rmrks_VC(MCEventInfo info){
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
		else if (nc == Cnd_ar_appl_flg) doCnd_ar_appl_flg_NC(info);
		else if (nc == Cnd_susp_adv_flg) doCnd_susp_adv_flg_NC(info);
		else if (nc == Cnd_sw_flg) doCnd_sw_flg_NC(info);
		else if (nc == Cnd_tax_diff_flg) doCnd_tax_diff_flg_NC(info);
		else if (nc == Cnd_not_prnt_flg) doCnd_not_prnt_flg_NC(info);
		else if (nc == Cnd_prnt_flg) doCnd_prnt_flg_NC(info);
		else if (nc == Cnd_rcv_dt_fr) doCnd_rcv_dt_fr_NC(info);
		else if (nc == Cnd_rcv_dt_to) doCnd_rcv_dt_to_NC(info);
		else if (nc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NC(info);
		else if (nc == Cnd_ac_dt_to) doCnd_ac_dt_to_NC(info);
		else if (nc == Cnd_rcst_cd) doCnd_rcst_cd_NC(info);
		else if (nc == Cnd_rcst_nm) doCnd_rcst_nm_NC(info);
		else if (nc == Cnd_bcst_cd) doCnd_bcst_cd_NC(info);
		else if (nc == Cnd_bcst_nm) doCnd_bcst_nm_NC(info);
		else if (nc == Cnd_sw_to_bcst_cd) doCnd_sw_to_bcst_cd_NC(info);
		else if (nc == Cnd_sw_to_bcst_nm) doCnd_sw_to_bcst_nm_NC(info);
		else if (nc == Cnd_usr_cd) doCnd_usr_cd_NC(info);
		else if (nc == Cnd_usr_nm) doCnd_usr_nm_NC(info);
		else if (nc == Cnd_dpt_cd) doCnd_dpt_cd_NC(info);
		else if (nc == Cnd_dpt_nm) doCnd_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_trd_rmrks) doCnd_trd_rmrks_NC(info);
		else if (nc == Cnd_rcv_act_no) doCnd_rcv_act_no_NC(info);
		else if (nc == Cnd_rcv_no) doCnd_rcv_no_NC(info);
		else if (nc == Cnd_note_no) doCnd_note_no_NC(info);
		else if (nc == Cnd_sw_to_rcv_act_no) doCnd_sw_to_rcv_act_no_NC(info);
		else if (nc == Cnd_trd_cd) doCnd_trd_cd_NC(info);
		else if (nc == Cnd_trd_nm) doCnd_trd_nm_NC(info);
		else if (nc == Cnd_cur_cd) doCnd_cur_cd_NC(info);
		else if (nc == Cnd_cur_nm) doCnd_cur_nm_NC(info);
		else if (nc == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NC(info);
		else if (nc == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NC(info);
		else if (nc == Cnd_gen_rcv_no) doCnd_gen_rcv_no_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_can_flg) doCnd_can_flg_NC(info);
		else if (nc == Cnd_rcv_auto_appl_flg) doCnd_rcv_auto_appl_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_slip_sts_typ) doRslt_slip_sts_typ_NC(info);
		else if (nc == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_NC(info);
		else if (nc == columnRslt_rcv_act_no) doRslt_rcv_act_no_NC(info);
		else if (nc == columnRslt_rcv_act_seq) doRslt_rcv_act_seq_NC(info);
		else if (nc == columnRslt_rcv_act_rev) doRslt_rcv_act_rev_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_rcv_dt) doRslt_rcv_dt_NC(info);
		else if (nc == columnRslt_ac_ym) doRslt_ac_ym_NC(info);
		else if (nc == columnRslt_ac_dt) doRslt_ac_dt_NC(info);
		else if (nc == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NC(info);
		else if (nc == columnRslt_rcst_cd) doRslt_rcst_cd_NC(info);
		else if (nc == columnRslt_rcst_nm) doRslt_rcst_nm_NC(info);
		else if (nc == columnRslt_bcst_cd) doRslt_bcst_cd_NC(info);
		else if (nc == columnRslt_bcst_nm) doRslt_bcst_nm_NC(info);
		else if (nc == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NC(info);
		else if (nc == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_NC(info);
		else if (nc == columnRslt_ar_sttl_cd1) doRslt_ar_sttl_cd1_NC(info);
		else if (nc == columnRslt_ar_sttl_nm1) doRslt_ar_sttl_nm1_NC(info);
		else if (nc == columnRslt_rcv_no) doRslt_rcv_no_NC(info);
		else if (nc == columnRslt_note_no) doRslt_note_no_NC(info);
		else if (nc == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NC(info);
		else if (nc == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NC(info);
		else if (nc == columnRslt_bank_ac_no) doRslt_bank_ac_no_NC(info);
		else if (nc == columnRslt_ar_sttl_cd2) doRslt_ar_sttl_cd2_NC(info);
		else if (nc == columnRslt_ar_sttl_nm2) doRslt_ar_sttl_nm2_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_amt_dec_place) doRslt_amt_dec_place_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_nm) doRslt_base_cur_nm_NC(info);
		else if (nc == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_sw_to_rcv_act_no) doRslt_sw_to_rcv_act_no_NC(info);
		else if (nc == columnRslt_sw_to_trd_cd) doRslt_sw_to_trd_cd_NC(info);
		else if (nc == columnRslt_sw_to_trd_nm) doRslt_sw_to_trd_nm_NC(info);
		else if (nc == columnRslt_sw_to_bcst_cd) doRslt_sw_to_bcst_cd_NC(info);
		else if (nc == columnRslt_sw_to_bcst_nm) doRslt_sw_to_bcst_nm_NC(info);
		else if (nc == columnRslt_usr_cd) doRslt_usr_cd_NC(info);
		else if (nc == columnRslt_usr_nm) doRslt_usr_nm_NC(info);
		else if (nc == columnRslt_dpt_cd) doRslt_dpt_cd_NC(info);
		else if (nc == columnRslt_dpt_nm) doRslt_dpt_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_gen_rcv_no) doRslt_gen_rcv_no_NC(info);
		else if (nc == columnRslt_prnt_flg) doRslt_prnt_flg_NC(info);
		else if (nc == columnRslt_rcv_auto_appl_flg) doRslt_rcv_auto_appl_flg_NC(info);
		else if (nc == columnRslt_trd_rmrks) doRslt_trd_rmrks_NC(info);
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
	 * [Cnd]パネルの[ar_appl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_appl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[susp_adv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_susp_adv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sw_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sw_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_diff_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_diff_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sw_to_bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sw_to_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sw_to_bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sw_to_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_act_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sw_to_rcv_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sw_to_rcv_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[gen_rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gen_rcv_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_auto_appl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_auto_appl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_sttl_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_sttl_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_sttl_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_sttl_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_sttl_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_sttl_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_sttl_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_sttl_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_rcv_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_rcv_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[gen_rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gen_rcv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_auto_appl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_auto_appl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NC(MCEventInfo info){
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
		else if (ne == Cnd_ar_appl_flg) doCnd_ar_appl_flg_NE(info);
		else if (ne == Cnd_susp_adv_flg) doCnd_susp_adv_flg_NE(info);
		else if (ne == Cnd_sw_flg) doCnd_sw_flg_NE(info);
		else if (ne == Cnd_tax_diff_flg) doCnd_tax_diff_flg_NE(info);
		else if (ne == Cnd_not_prnt_flg) doCnd_not_prnt_flg_NE(info);
		else if (ne == Cnd_prnt_flg) doCnd_prnt_flg_NE(info);
		else if (ne == Cnd_rcv_dt_fr) doCnd_rcv_dt_fr_NE(info);
		else if (ne == Cnd_rcv_dt_to) doCnd_rcv_dt_to_NE(info);
		else if (ne == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NE(info);
		else if (ne == Cnd_ac_dt_to) doCnd_ac_dt_to_NE(info);
		else if (ne == Cnd_rcst_cd) doCnd_rcst_cd_NE(info);
		else if (ne == Cnd_rcst_nm) doCnd_rcst_nm_NE(info);
		else if (ne == Cnd_bcst_cd) doCnd_bcst_cd_NE(info);
		else if (ne == Cnd_bcst_nm) doCnd_bcst_nm_NE(info);
		else if (ne == Cnd_sw_to_bcst_cd) doCnd_sw_to_bcst_cd_NE(info);
		else if (ne == Cnd_sw_to_bcst_nm) doCnd_sw_to_bcst_nm_NE(info);
		else if (ne == Cnd_usr_cd) doCnd_usr_cd_NE(info);
		else if (ne == Cnd_usr_nm) doCnd_usr_nm_NE(info);
		else if (ne == Cnd_dpt_cd) doCnd_dpt_cd_NE(info);
		else if (ne == Cnd_dpt_nm) doCnd_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_trd_rmrks) doCnd_trd_rmrks_NE(info);
		else if (ne == Cnd_rcv_act_no) doCnd_rcv_act_no_NE(info);
		else if (ne == Cnd_rcv_no) doCnd_rcv_no_NE(info);
		else if (ne == Cnd_note_no) doCnd_note_no_NE(info);
		else if (ne == Cnd_sw_to_rcv_act_no) doCnd_sw_to_rcv_act_no_NE(info);
		else if (ne == Cnd_trd_cd) doCnd_trd_cd_NE(info);
		else if (ne == Cnd_trd_nm) doCnd_trd_nm_NE(info);
		else if (ne == Cnd_cur_cd) doCnd_cur_cd_NE(info);
		else if (ne == Cnd_cur_nm) doCnd_cur_nm_NE(info);
		else if (ne == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NE(info);
		else if (ne == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NE(info);
		else if (ne == Cnd_gen_rcv_no) doCnd_gen_rcv_no_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_can_flg) doCnd_can_flg_NE(info);
		else if (ne == Cnd_rcv_auto_appl_flg) doCnd_rcv_auto_appl_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_slip_sts_typ) doRslt_slip_sts_typ_NE(info);
		else if (ne == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_NE(info);
		else if (ne == columnRslt_rcv_act_no) doRslt_rcv_act_no_NE(info);
		else if (ne == columnRslt_rcv_act_seq) doRslt_rcv_act_seq_NE(info);
		else if (ne == columnRslt_rcv_act_rev) doRslt_rcv_act_rev_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_rcv_dt) doRslt_rcv_dt_NE(info);
		else if (ne == columnRslt_ac_ym) doRslt_ac_ym_NE(info);
		else if (ne == columnRslt_ac_dt) doRslt_ac_dt_NE(info);
		else if (ne == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NE(info);
		else if (ne == columnRslt_rcst_cd) doRslt_rcst_cd_NE(info);
		else if (ne == columnRslt_rcst_nm) doRslt_rcst_nm_NE(info);
		else if (ne == columnRslt_bcst_cd) doRslt_bcst_cd_NE(info);
		else if (ne == columnRslt_bcst_nm) doRslt_bcst_nm_NE(info);
		else if (ne == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NE(info);
		else if (ne == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_NE(info);
		else if (ne == columnRslt_ar_sttl_cd1) doRslt_ar_sttl_cd1_NE(info);
		else if (ne == columnRslt_ar_sttl_nm1) doRslt_ar_sttl_nm1_NE(info);
		else if (ne == columnRslt_rcv_no) doRslt_rcv_no_NE(info);
		else if (ne == columnRslt_note_no) doRslt_note_no_NE(info);
		else if (ne == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NE(info);
		else if (ne == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NE(info);
		else if (ne == columnRslt_bank_ac_no) doRslt_bank_ac_no_NE(info);
		else if (ne == columnRslt_ar_sttl_cd2) doRslt_ar_sttl_cd2_NE(info);
		else if (ne == columnRslt_ar_sttl_nm2) doRslt_ar_sttl_nm2_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_amt_dec_place) doRslt_amt_dec_place_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_nm) doRslt_base_cur_nm_NE(info);
		else if (ne == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_sw_to_rcv_act_no) doRslt_sw_to_rcv_act_no_NE(info);
		else if (ne == columnRslt_sw_to_trd_cd) doRslt_sw_to_trd_cd_NE(info);
		else if (ne == columnRslt_sw_to_trd_nm) doRslt_sw_to_trd_nm_NE(info);
		else if (ne == columnRslt_sw_to_bcst_cd) doRslt_sw_to_bcst_cd_NE(info);
		else if (ne == columnRslt_sw_to_bcst_nm) doRslt_sw_to_bcst_nm_NE(info);
		else if (ne == columnRslt_usr_cd) doRslt_usr_cd_NE(info);
		else if (ne == columnRslt_usr_nm) doRslt_usr_nm_NE(info);
		else if (ne == columnRslt_dpt_cd) doRslt_dpt_cd_NE(info);
		else if (ne == columnRslt_dpt_nm) doRslt_dpt_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_gen_rcv_no) doRslt_gen_rcv_no_NE(info);
		else if (ne == columnRslt_prnt_flg) doRslt_prnt_flg_NE(info);
		else if (ne == columnRslt_rcv_auto_appl_flg) doRslt_rcv_auto_appl_flg_NE(info);
		else if (ne == columnRslt_trd_rmrks) doRslt_trd_rmrks_NE(info);
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
	 * [Cnd]パネルの[ar_appl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_appl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[susp_adv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_susp_adv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sw_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sw_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_diff_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_diff_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sw_to_bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sw_to_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sw_to_bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sw_to_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_act_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sw_to_rcv_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sw_to_rcv_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[gen_rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gen_rcv_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_auto_appl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_auto_appl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_sttl_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_sttl_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_sttl_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_sttl_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_sttl_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_sttl_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_sttl_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_sttl_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_rcv_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_rcv_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[gen_rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gen_rcv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_auto_appl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_auto_appl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NE(MCEventInfo info){
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
		else if (nx == Cnd_ar_appl_flg) doCnd_ar_appl_flg_NX(info);
		else if (nx == Cnd_susp_adv_flg) doCnd_susp_adv_flg_NX(info);
		else if (nx == Cnd_sw_flg) doCnd_sw_flg_NX(info);
		else if (nx == Cnd_tax_diff_flg) doCnd_tax_diff_flg_NX(info);
		else if (nx == Cnd_not_prnt_flg) doCnd_not_prnt_flg_NX(info);
		else if (nx == Cnd_prnt_flg) doCnd_prnt_flg_NX(info);
		else if (nx == Cnd_rcv_dt_fr) doCnd_rcv_dt_fr_NX(info);
		else if (nx == Cnd_rcv_dt_to) doCnd_rcv_dt_to_NX(info);
		else if (nx == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NX(info);
		else if (nx == Cnd_ac_dt_to) doCnd_ac_dt_to_NX(info);
		else if (nx == Cnd_rcst_cd) doCnd_rcst_cd_NX(info);
		else if (nx == Cnd_rcst_nm) doCnd_rcst_nm_NX(info);
		else if (nx == Cnd_bcst_cd) doCnd_bcst_cd_NX(info);
		else if (nx == Cnd_bcst_nm) doCnd_bcst_nm_NX(info);
		else if (nx == Cnd_sw_to_bcst_cd) doCnd_sw_to_bcst_cd_NX(info);
		else if (nx == Cnd_sw_to_bcst_nm) doCnd_sw_to_bcst_nm_NX(info);
		else if (nx == Cnd_usr_cd) doCnd_usr_cd_NX(info);
		else if (nx == Cnd_usr_nm) doCnd_usr_nm_NX(info);
		else if (nx == Cnd_dpt_cd) doCnd_dpt_cd_NX(info);
		else if (nx == Cnd_dpt_nm) doCnd_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_trd_rmrks) doCnd_trd_rmrks_NX(info);
		else if (nx == Cnd_rcv_act_no) doCnd_rcv_act_no_NX(info);
		else if (nx == Cnd_rcv_no) doCnd_rcv_no_NX(info);
		else if (nx == Cnd_note_no) doCnd_note_no_NX(info);
		else if (nx == Cnd_sw_to_rcv_act_no) doCnd_sw_to_rcv_act_no_NX(info);
		else if (nx == Cnd_trd_cd) doCnd_trd_cd_NX(info);
		else if (nx == Cnd_trd_nm) doCnd_trd_nm_NX(info);
		else if (nx == Cnd_cur_cd) doCnd_cur_cd_NX(info);
		else if (nx == Cnd_cur_nm) doCnd_cur_nm_NX(info);
		else if (nx == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NX(info);
		else if (nx == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NX(info);
		else if (nx == Cnd_gen_rcv_no) doCnd_gen_rcv_no_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_can_flg) doCnd_can_flg_NX(info);
		else if (nx == Cnd_rcv_auto_appl_flg) doCnd_rcv_auto_appl_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_slip_sts_typ) doRslt_slip_sts_typ_NX(info);
		else if (nx == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_NX(info);
		else if (nx == columnRslt_rcv_act_no) doRslt_rcv_act_no_NX(info);
		else if (nx == columnRslt_rcv_act_seq) doRslt_rcv_act_seq_NX(info);
		else if (nx == columnRslt_rcv_act_rev) doRslt_rcv_act_rev_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_rcv_dt) doRslt_rcv_dt_NX(info);
		else if (nx == columnRslt_ac_ym) doRslt_ac_ym_NX(info);
		else if (nx == columnRslt_ac_dt) doRslt_ac_dt_NX(info);
		else if (nx == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NX(info);
		else if (nx == columnRslt_rcst_cd) doRslt_rcst_cd_NX(info);
		else if (nx == columnRslt_rcst_nm) doRslt_rcst_nm_NX(info);
		else if (nx == columnRslt_bcst_cd) doRslt_bcst_cd_NX(info);
		else if (nx == columnRslt_bcst_nm) doRslt_bcst_nm_NX(info);
		else if (nx == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NX(info);
		else if (nx == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_NX(info);
		else if (nx == columnRslt_ar_sttl_cd1) doRslt_ar_sttl_cd1_NX(info);
		else if (nx == columnRslt_ar_sttl_nm1) doRslt_ar_sttl_nm1_NX(info);
		else if (nx == columnRslt_rcv_no) doRslt_rcv_no_NX(info);
		else if (nx == columnRslt_note_no) doRslt_note_no_NX(info);
		else if (nx == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NX(info);
		else if (nx == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NX(info);
		else if (nx == columnRslt_bank_ac_no) doRslt_bank_ac_no_NX(info);
		else if (nx == columnRslt_ar_sttl_cd2) doRslt_ar_sttl_cd2_NX(info);
		else if (nx == columnRslt_ar_sttl_nm2) doRslt_ar_sttl_nm2_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_amt_dec_place) doRslt_amt_dec_place_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_nm) doRslt_base_cur_nm_NX(info);
		else if (nx == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_sw_to_rcv_act_no) doRslt_sw_to_rcv_act_no_NX(info);
		else if (nx == columnRslt_sw_to_trd_cd) doRslt_sw_to_trd_cd_NX(info);
		else if (nx == columnRslt_sw_to_trd_nm) doRslt_sw_to_trd_nm_NX(info);
		else if (nx == columnRslt_sw_to_bcst_cd) doRslt_sw_to_bcst_cd_NX(info);
		else if (nx == columnRslt_sw_to_bcst_nm) doRslt_sw_to_bcst_nm_NX(info);
		else if (nx == columnRslt_usr_cd) doRslt_usr_cd_NX(info);
		else if (nx == columnRslt_usr_nm) doRslt_usr_nm_NX(info);
		else if (nx == columnRslt_dpt_cd) doRslt_dpt_cd_NX(info);
		else if (nx == columnRslt_dpt_nm) doRslt_dpt_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_gen_rcv_no) doRslt_gen_rcv_no_NX(info);
		else if (nx == columnRslt_prnt_flg) doRslt_prnt_flg_NX(info);
		else if (nx == columnRslt_rcv_auto_appl_flg) doRslt_rcv_auto_appl_flg_NX(info);
		else if (nx == columnRslt_trd_rmrks) doRslt_trd_rmrks_NX(info);
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
	 * [Cnd]パネルの[ar_appl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_appl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[susp_adv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_susp_adv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sw_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sw_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_diff_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_diff_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sw_to_bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sw_to_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sw_to_bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sw_to_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_act_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sw_to_rcv_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sw_to_rcv_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[gen_rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gen_rcv_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_auto_appl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_auto_appl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_sttl_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_sttl_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_sttl_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_sttl_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_sttl_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_sttl_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_sttl_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_sttl_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_rcv_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_rcv_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[gen_rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gen_rcv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_auto_appl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_auto_appl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NX(MCEventInfo info){
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
		else if (lc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_LC(info);
		else if (lc == Cnd_ac_dt_to) doCnd_ac_dt_to_LC(info);
		else if (lc == Cnd_rcst_cd) doCnd_rcst_cd_LC(info);
		else if (lc == Cnd_rcst_nm) doCnd_rcst_nm_LC(info);
		else if (lc == Cnd_bcst_cd) doCnd_bcst_cd_LC(info);
		else if (lc == Cnd_bcst_nm) doCnd_bcst_nm_LC(info);
		else if (lc == Cnd_sw_to_bcst_cd) doCnd_sw_to_bcst_cd_LC(info);
		else if (lc == Cnd_sw_to_bcst_nm) doCnd_sw_to_bcst_nm_LC(info);
		else if (lc == Cnd_usr_cd) doCnd_usr_cd_LC(info);
		else if (lc == Cnd_usr_nm) doCnd_usr_nm_LC(info);
		else if (lc == Cnd_dpt_cd) doCnd_dpt_cd_LC(info);
		else if (lc == Cnd_dpt_nm) doCnd_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_trd_rmrks) doCnd_trd_rmrks_LC(info);
		else if (lc == Cnd_rcv_act_no) doCnd_rcv_act_no_LC(info);
		else if (lc == Cnd_rcv_no) doCnd_rcv_no_LC(info);
		else if (lc == Cnd_note_no) doCnd_note_no_LC(info);
		else if (lc == Cnd_sw_to_rcv_act_no) doCnd_sw_to_rcv_act_no_LC(info);
		else if (lc == Cnd_trd_cd) doCnd_trd_cd_LC(info);
		else if (lc == Cnd_trd_nm) doCnd_trd_nm_LC(info);
		else if (lc == Cnd_cur_cd) doCnd_cur_cd_LC(info);
		else if (lc == Cnd_cur_nm) doCnd_cur_nm_LC(info);
		else if (lc == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_LC(info);
		else if (lc == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_LC(info);
		else if (lc == Cnd_gen_rcv_no) doCnd_gen_rcv_no_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == columnRslt_slip_sts_typ) doRslt_slip_sts_typ_LC(info);
		else if (lc == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_LC(info);
		else if (lc == columnRslt_rcv_act_no) doRslt_rcv_act_no_LC(info);
		else if (lc == columnRslt_rcv_act_seq) doRslt_rcv_act_seq_LC(info);
		else if (lc == columnRslt_rcv_act_rev) doRslt_rcv_act_rev_LC(info);
		else if (lc == columnRslt_trd_cd) doRslt_trd_cd_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_rcv_dt) doRslt_rcv_dt_LC(info);
		else if (lc == columnRslt_ac_ym) doRslt_ac_ym_LC(info);
		else if (lc == columnRslt_ac_dt) doRslt_ac_dt_LC(info);
		else if (lc == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_LC(info);
		else if (lc == columnRslt_rcst_cd) doRslt_rcst_cd_LC(info);
		else if (lc == columnRslt_rcst_nm) doRslt_rcst_nm_LC(info);
		else if (lc == columnRslt_bcst_cd) doRslt_bcst_cd_LC(info);
		else if (lc == columnRslt_bcst_nm) doRslt_bcst_nm_LC(info);
		else if (lc == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_LC(info);
		else if (lc == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_LC(info);
		else if (lc == columnRslt_ar_sttl_cd1) doRslt_ar_sttl_cd1_LC(info);
		else if (lc == columnRslt_ar_sttl_nm1) doRslt_ar_sttl_nm1_LC(info);
		else if (lc == columnRslt_rcv_no) doRslt_rcv_no_LC(info);
		else if (lc == columnRslt_note_no) doRslt_note_no_LC(info);
		else if (lc == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_LC(info);
		else if (lc == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_LC(info);
		else if (lc == columnRslt_bank_ac_no) doRslt_bank_ac_no_LC(info);
		else if (lc == columnRslt_ar_sttl_cd2) doRslt_ar_sttl_cd2_LC(info);
		else if (lc == columnRslt_ar_sttl_nm2) doRslt_ar_sttl_nm2_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_amt_dec_place) doRslt_amt_dec_place_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_nm) doRslt_base_cur_nm_LC(info);
		else if (lc == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_sw_to_rcv_act_no) doRslt_sw_to_rcv_act_no_LC(info);
		else if (lc == columnRslt_sw_to_trd_cd) doRslt_sw_to_trd_cd_LC(info);
		else if (lc == columnRslt_sw_to_trd_nm) doRslt_sw_to_trd_nm_LC(info);
		else if (lc == columnRslt_sw_to_bcst_cd) doRslt_sw_to_bcst_cd_LC(info);
		else if (lc == columnRslt_sw_to_bcst_nm) doRslt_sw_to_bcst_nm_LC(info);
		else if (lc == columnRslt_usr_cd) doRslt_usr_cd_LC(info);
		else if (lc == columnRslt_usr_nm) doRslt_usr_nm_LC(info);
		else if (lc == columnRslt_dpt_cd) doRslt_dpt_cd_LC(info);
		else if (lc == columnRslt_dpt_nm) doRslt_dpt_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_gen_rcv_no) doRslt_gen_rcv_no_LC(info);
		else if (lc == columnRslt_trd_rmrks) doRslt_trd_rmrks_LC(info);
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
	 * [Cnd]パネルの[ac_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[sw_to_bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sw_to_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sw_to_bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sw_to_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_act_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[sw_to_rcv_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sw_to_rcv_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[gen_rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gen_rcv_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[slip_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_sttl_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_sttl_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_sttl_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_sttl_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_sttl_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_sttl_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_sttl_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_sttl_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_rcv_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_rcv_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[gen_rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gen_rcv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_sw_to_bcst_cd]の作成メソッド
	 */
	public MCList getCnd_sw_to_bcst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_usr_cd]の作成メソッド
	 */
	public MCList getCnd_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
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

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBGL0250.Srch01")) {
			return new MS_MSBGL0250_Srch01Bridge();
		}
		if (id.equals("MS.MSBGL0250.Prnt01")) {
			return new MS_MSBGL0250_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBGL0250_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0250_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0250_Srch01;

		/** コンストラクタ */
		protected MS_MSBGL0250_Srch01Bridge() {
			p_MS_MSBGL0250_Srch01 = new MCParam(PDef.MS_MSBGL0250_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0250_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0250.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0250.RsltR.class));

			p_MS_MSBGL0250_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0250_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0250_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0250_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0250_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0250.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0250.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBG.MSBGP0250.RsltR> down0() {
			return (MCList<mcframe.clientMSBG.MSBGP0250.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0250_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0250.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0250_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBG.MSBGP0250.RsltR>)p_MS_MSBGL0250_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBGL0250_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0250_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0250_Prnt01;

		/** コンストラクタ */
		protected MS_MSBGL0250_Prnt01Bridge() {
			p_MS_MSBGL0250_Prnt01 = new MCParam(PDef.MS_MSBGL0250_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0250_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBG.MSBGP0250.RsltR.class));
			param.addUpBlock(mcframe.clientMSBG.MSBGP0250.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0250.RsltR.class));

			p_MS_MSBGL0250_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0250_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0250_Prnt01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBGL0250_Prnt01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0250_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0250_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBG.MSBGP0250.RsltR> up0() {
			return (MCList<mcframe.clientMSBG.MSBGP0250.RsltR>)up(0);
		}
		protected mcframe.clientMSBG.MSBGP0250.BtnR up1() {
			return (mcframe.clientMSBG.MSBGP0250.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBG.MSBGP0250.RsltR> down0() {
			return (MCList<mcframe.clientMSBG.MSBGP0250.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0250_Prnt01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0250.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0250_Prnt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBG.MSBGP0250.RsltR>)p_MS_MSBGL0250_Prnt01.getContainerParam().getDownBlock(0));
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