package mcframe.clientMSBH.MSBHP0080;

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
import mcframe.clientMSBH.MSBHP0080.MSBHP_AdvPaySrch_MC.MS_MSBHL0080_Srch01Caller;

/**
 * 画面"MSBHP_AdvPaySrch"パネルクラスです。<p>
 *
 * 未消込の買掛金を明細単位の一覧形式で照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHP_AdvPaySrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBHP0080";

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
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Psppl]ブロック関連のField定義
	public MCPanel PspplPanel = null;
	// [Psppl]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [Bsppl]ブロック関連のField定義
	public MCPanel BspplPanel = null;
	// [Bsppl]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_pay_act_dt_fr_Label = null;
	/**
	 * Actual payment date FROM 支払実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_pay_act_dt_fr = null;
	public MCLabel Cnd_pay_act_dt_to_Label = null;
	/**
	 * Actual payment date TO 支払実績日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_pay_act_dt_to = null;
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
	public MCLabel Cnd_psppl_cd_Label = null;
	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_psppl_cd = null;
	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public MCTextField Cnd_psppl_nm = null;
	public MCLabel Cnd_bsppl_cd_Label = null;
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_cd = null;
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_nm = null;
	public MCLabel Cnd_bsppl_dpt_cd_Label = null;
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_dpt_cd = null;
	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_dpt_nm = null;
	public MCLabel Cnd_bd_dpt_cd_Label = null;
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bd_dpt_cd = null;
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public MCTextField Cnd_bd_dpt_nm = null;
	public MCLabel Cnd_pay_dpt_cd_Label = null;
	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_pay_dpt_cd = null;
	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public MCTextField Cnd_pay_dpt_nm = null;
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
	public MCLabel Cnd_pay_usr_cd_Label = null;
	/**
	 * Payment PIC cd. 支払担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_pay_usr_cd = null;
	/**
	 * Payment PIC name 支払担当者名.<p>
	 *
	 */
	public MCTextField Cnd_pay_usr_nm = null;
	public MCLabel Cnd_adv_pay_act_no_Label = null;
	/**
	 * Advance payment result No. 前渡金実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_adv_pay_act_no = null;
	public MCLabel Cnd_note_no_Label = null;
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public MCTextField Cnd_note_no = null;
	public MCLabel Cnd_ap_sttl_cd_Label = null;
	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ap_sttl_cd = null;
	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public MCTextField Cnd_ap_sttl_nm = null;
	public MCLabel Cnd_trd_cur_cd_Label = null;
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_trd_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCTextField Cnd_trd_cur_nm = null;
	/**
	 * Include processed 処理済含む.<p>
	 *
	 */
	public MCCheckBox Cnd_incl_appl_flg = null;
	/**
	 * Include invalid/cancel 無効・取消含む.<p>
	 *
	 */
	public MCCheckBox Cnd_incl_can_red_flg = null;
	public MCLabel Cnd_trd_rmrks_Label = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCTextField Cnd_trd_rmrks = null;
	public MCLabel Cnd_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Cnd_intr_rmrks = null;
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
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_psppl_grp_p_PPanel;
	public MCLabel Cnd_psppl_grp_lab1;	// [Cnd]の[psppl_grp_p.bp_grp_lab1]を[Cnd_psppl_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_psppl_grp_flg1;	// [Cnd]の[psppl_grp_p.bp_grp_flg1]を[Cnd_psppl_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_psppl_grp_cd1;	// [Cnd]の[psppl_grp_p.bp_grp_cd1]を[Cnd_psppl_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_psppl_grp_nm1;	// [Cnd]の[psppl_grp_p.bp_grp_nm1]を[Cnd_psppl_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_psppl_grp_lab2;	// [Cnd]の[psppl_grp_p.bp_grp_lab2]を[Cnd_psppl_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_psppl_grp_flg2;	// [Cnd]の[psppl_grp_p.bp_grp_flg2]を[Cnd_psppl_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_psppl_grp_cd2;	// [Cnd]の[psppl_grp_p.bp_grp_cd2]を[Cnd_psppl_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_psppl_grp_nm2;	// [Cnd]の[psppl_grp_p.bp_grp_nm2]を[Cnd_psppl_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_psppl_grp_lab3;	// [Cnd]の[psppl_grp_p.bp_grp_lab3]を[Cnd_psppl_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_psppl_grp_flg3;	// [Cnd]の[psppl_grp_p.bp_grp_flg3]を[Cnd_psppl_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_psppl_grp_cd3;	// [Cnd]の[psppl_grp_p.bp_grp_cd3]を[Cnd_psppl_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_psppl_grp_nm3;	// [Cnd]の[psppl_grp_p.bp_grp_nm3]を[Cnd_psppl_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_psppl_grp_lab4;	// [Cnd]の[psppl_grp_p.bp_grp_lab4]を[Cnd_psppl_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_psppl_grp_flg4;	// [Cnd]の[psppl_grp_p.bp_grp_flg4]を[Cnd_psppl_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_psppl_grp_cd4;	// [Cnd]の[psppl_grp_p.bp_grp_cd4]を[Cnd_psppl_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_psppl_grp_nm4;	// [Cnd]の[psppl_grp_p.bp_grp_nm4]を[Cnd_psppl_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_psppl_grp_lab5;	// [Cnd]の[psppl_grp_p.bp_grp_lab5]を[Cnd_psppl_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_psppl_grp_flg5;	// [Cnd]の[psppl_grp_p.bp_grp_flg5]を[Cnd_psppl_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_psppl_grp_cd5;	// [Cnd]の[psppl_grp_p.bp_grp_cd5]を[Cnd_psppl_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_psppl_grp_nm5;	// [Cnd]の[psppl_grp_p.bp_grp_nm5]を[Cnd_psppl_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_psppl_grp_lab6;	// [Cnd]の[psppl_grp_p.bp_grp_lab6]を[Cnd_psppl_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_psppl_grp_flg6;	// [Cnd]の[psppl_grp_p.bp_grp_flg6]を[Cnd_psppl_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_psppl_grp_cd6;	// [Cnd]の[psppl_grp_p.bp_grp_cd6]を[Cnd_psppl_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_psppl_grp_nm6;	// [Cnd]の[psppl_grp_p.bp_grp_nm6]を[Cnd_psppl_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_psppl_grp_lab7;	// [Cnd]の[psppl_grp_p.bp_grp_lab7]を[Cnd_psppl_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_psppl_grp_flg7;	// [Cnd]の[psppl_grp_p.bp_grp_flg7]を[Cnd_psppl_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_psppl_grp_cd7;	// [Cnd]の[psppl_grp_p.bp_grp_cd7]を[Cnd_psppl_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_psppl_grp_nm7;	// [Cnd]の[psppl_grp_p.bp_grp_nm7]を[Cnd_psppl_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_psppl_grp_lab8;	// [Cnd]の[psppl_grp_p.bp_grp_lab8]を[Cnd_psppl_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_psppl_grp_flg8;	// [Cnd]の[psppl_grp_p.bp_grp_flg8]を[Cnd_psppl_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_psppl_grp_cd8;	// [Cnd]の[psppl_grp_p.bp_grp_cd8]を[Cnd_psppl_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_psppl_grp_nm8;	// [Cnd]の[psppl_grp_p.bp_grp_nm8]を[Cnd_psppl_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_psppl_grp_lab9;	// [Cnd]の[psppl_grp_p.bp_grp_lab9]を[Cnd_psppl_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_psppl_grp_flg9;	// [Cnd]の[psppl_grp_p.bp_grp_flg9]を[Cnd_psppl_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_psppl_grp_cd9;	// [Cnd]の[psppl_grp_p.bp_grp_cd9]を[Cnd_psppl_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_psppl_grp_nm9;	// [Cnd]の[psppl_grp_p.bp_grp_nm9]を[Cnd_psppl_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_psppl_grp_lab10;	// [Cnd]の[psppl_grp_p.bp_grp_lab10]を[Cnd_psppl_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_psppl_grp_flg10;	// [Cnd]の[psppl_grp_p.bp_grp_flg10]を[Cnd_psppl_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_psppl_grp_cd10;	// [Cnd]の[psppl_grp_p.bp_grp_cd10]を[Cnd_psppl_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_psppl_grp_nm10;	// [Cnd]の[psppl_grp_p.bp_grp_nm10]を[Cnd_psppl_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_bsppl_grp_p_PPanel;
	public MCLabel Cnd_bsppl_grp_lab1;	// [Cnd]の[bsppl_grp_p.bp_grp_lab1]を[Cnd_bsppl_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg1;	// [Cnd]の[bsppl_grp_p.bp_grp_flg1]を[Cnd_bsppl_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd1;	// [Cnd]の[bsppl_grp_p.bp_grp_cd1]を[Cnd_bsppl_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm1;	// [Cnd]の[bsppl_grp_p.bp_grp_nm1]を[Cnd_bsppl_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab2;	// [Cnd]の[bsppl_grp_p.bp_grp_lab2]を[Cnd_bsppl_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg2;	// [Cnd]の[bsppl_grp_p.bp_grp_flg2]を[Cnd_bsppl_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd2;	// [Cnd]の[bsppl_grp_p.bp_grp_cd2]を[Cnd_bsppl_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm2;	// [Cnd]の[bsppl_grp_p.bp_grp_nm2]を[Cnd_bsppl_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab3;	// [Cnd]の[bsppl_grp_p.bp_grp_lab3]を[Cnd_bsppl_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg3;	// [Cnd]の[bsppl_grp_p.bp_grp_flg3]を[Cnd_bsppl_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd3;	// [Cnd]の[bsppl_grp_p.bp_grp_cd3]を[Cnd_bsppl_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm3;	// [Cnd]の[bsppl_grp_p.bp_grp_nm3]を[Cnd_bsppl_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab4;	// [Cnd]の[bsppl_grp_p.bp_grp_lab4]を[Cnd_bsppl_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg4;	// [Cnd]の[bsppl_grp_p.bp_grp_flg4]を[Cnd_bsppl_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd4;	// [Cnd]の[bsppl_grp_p.bp_grp_cd4]を[Cnd_bsppl_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm4;	// [Cnd]の[bsppl_grp_p.bp_grp_nm4]を[Cnd_bsppl_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab5;	// [Cnd]の[bsppl_grp_p.bp_grp_lab5]を[Cnd_bsppl_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg5;	// [Cnd]の[bsppl_grp_p.bp_grp_flg5]を[Cnd_bsppl_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd5;	// [Cnd]の[bsppl_grp_p.bp_grp_cd5]を[Cnd_bsppl_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm5;	// [Cnd]の[bsppl_grp_p.bp_grp_nm5]を[Cnd_bsppl_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab6;	// [Cnd]の[bsppl_grp_p.bp_grp_lab6]を[Cnd_bsppl_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg6;	// [Cnd]の[bsppl_grp_p.bp_grp_flg6]を[Cnd_bsppl_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd6;	// [Cnd]の[bsppl_grp_p.bp_grp_cd6]を[Cnd_bsppl_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm6;	// [Cnd]の[bsppl_grp_p.bp_grp_nm6]を[Cnd_bsppl_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab7;	// [Cnd]の[bsppl_grp_p.bp_grp_lab7]を[Cnd_bsppl_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg7;	// [Cnd]の[bsppl_grp_p.bp_grp_flg7]を[Cnd_bsppl_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd7;	// [Cnd]の[bsppl_grp_p.bp_grp_cd7]を[Cnd_bsppl_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm7;	// [Cnd]の[bsppl_grp_p.bp_grp_nm7]を[Cnd_bsppl_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab8;	// [Cnd]の[bsppl_grp_p.bp_grp_lab8]を[Cnd_bsppl_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg8;	// [Cnd]の[bsppl_grp_p.bp_grp_flg8]を[Cnd_bsppl_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd8;	// [Cnd]の[bsppl_grp_p.bp_grp_cd8]を[Cnd_bsppl_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm8;	// [Cnd]の[bsppl_grp_p.bp_grp_nm8]を[Cnd_bsppl_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab9;	// [Cnd]の[bsppl_grp_p.bp_grp_lab9]を[Cnd_bsppl_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg9;	// [Cnd]の[bsppl_grp_p.bp_grp_flg9]を[Cnd_bsppl_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd9;	// [Cnd]の[bsppl_grp_p.bp_grp_cd9]を[Cnd_bsppl_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm9;	// [Cnd]の[bsppl_grp_p.bp_grp_nm9]を[Cnd_bsppl_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab10;	// [Cnd]の[bsppl_grp_p.bp_grp_lab10]を[Cnd_bsppl_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg10;	// [Cnd]の[bsppl_grp_p.bp_grp_flg10]を[Cnd_bsppl_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd10;	// [Cnd]の[bsppl_grp_p.bp_grp_cd10]を[Cnd_bsppl_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm10;	// [Cnd]の[bsppl_grp_p.bp_grp_nm10]を[Cnd_bsppl_grp_nm10]としてエイリアス定義。
	// [LPnl]ブロック関連のField定義
	public MCPanel LPnlPanel = null;
	// [LPnl]ブロックの項目のField定義
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
	public MCTable2<mcframe.clientMSBH.MSBHP0080.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_psppl_cd = null;
	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_psppl_nm = null;
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
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_dpt_cd = null;
	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_dpt_nm = null;
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_dpt_cd = null;
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_dpt_nm = null;
	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_dpt_cd = null;
	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_dpt_nm = null;
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
	 * Payment PIC cd. 支払担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_usr_cd = null;
	/**
	 * Payment PIC name 支払担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_usr_nm = null;
	/**
	 * Actual payment date 支払実績日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_act_dt = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_dt = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_ym = null;
	/**
	 * Status 状況.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slip_sts_typ_nm = null;
	/**
	 * Advance payment result No. 前渡金実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_adv_pay_act_no = null;
	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_adv_pay_act_seq = null;
	/**
	 * Advance payment result revision number 前渡金実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_adv_pay_act_rev = null;
	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_sttl_cd = null;
	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_sttl_nm = null;
	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_sttl_typ = null;
	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_sttl_typ_nm = null;
	/**
	 * Fee AP settlement method cd. 手数料債務決済方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_com_paid_ap_sttl_cd = null;
	/**
	 * Fee AP settlement method name 手数料債務決済方法名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_com_paid_ap_sttl_nm = null;
	/**
	 * Fee AP settlement type 手数料債務決済区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_com_paid_ap_sttl_typ = null;
	/**
	 * Fee AP settlement type name 手数料債務決済区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_com_paid_ap_sttl_typ_nm = null;
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
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_bank_ac_cd = null;
	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_bank_ac_nm = null;
	/**
	 * Display advance payment on payment notice 支払通知書前渡金表示.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_ntc_adv_pay_flg = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_amt;// [Rslt]の[trd_cur_amt_p.amt]を[columnRslt_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_com_paid_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_com_paid;// [Rslt]の[trd_cur_com_paid_p.amt]を[columnRslt_trd_cur_com_paid]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_com_paid_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_com_paid_tax_amt;// [Rslt]の[trd_cur_com_paid_tax_amt_p.amt]を[columnRslt_trd_cur_com_paid_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_exc_com_paid_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_exc_com_paid;// [Rslt]の[trd_cur_exc_com_paid_p.amt]を[columnRslt_trd_cur_exc_com_paid]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_setoff_tgt_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_setoff_tgt_amt;// [Rslt]の[trd_cur_setoff_tgt_amt_p.amt]を[columnRslt_trd_cur_setoff_tgt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_setoff_schd_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_setoff_schd_amt;// [Rslt]の[trd_cur_setoff_schd_amt_p.amt]を[columnRslt_trd_cur_setoff_schd_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_setoff_act_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_setoff_act_amt;// [Rslt]の[trd_cur_setoff_act_amt_p.amt]を[columnRslt_trd_cur_setoff_act_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_not_proc_bal_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_not_proc_bal;// [Rslt]の[trd_cur_not_proc_bal_p.amt]を[columnRslt_trd_cur_not_proc_bal]としてエイリアス定義。
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_nm = null;
	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_amt_dec_place = null;
	/**
	 * Fee tax cd. 手数料税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_com_paid_tax_cd = null;
	/**
	 * Fee tax name 手数料税名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_com_paid_tax_nm = null;
	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_com_paid_tax_rate = null;
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate_cd = null;
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_amt;// [Rslt]の[base_cur_amt_p.amt]を[columnRslt_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_com_paid_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_com_paid;// [Rslt]の[base_cur_com_paid_p.amt]を[columnRslt_base_cur_com_paid]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_com_paid_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_com_paid_tax_amt;// [Rslt]の[base_cur_com_paid_tax_amt_p.amt]を[columnRslt_base_cur_com_paid_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_exc_com_paid_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_exc_com_paid;// [Rslt]の[base_cur_exc_com_paid_p.amt]を[columnRslt_base_cur_exc_com_paid]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_setoff_tgt_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_setoff_tgt_amt;// [Rslt]の[base_cur_setoff_tgt_amt_p.amt]を[columnRslt_base_cur_setoff_tgt_amt]としてエイリアス定義。
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
	 * Note sight 手形サイト.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_days = null;
	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_drawer_nm = null;
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
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_rmrks = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_intr_rmrks = null;
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
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_psppl_grp_p_PPanel;
	public MCColumnConfig columnRslt_psppl_grp_cd1;// [Rslt]の[psppl_grp_p.bp_grp_cd1]を[columnRslt_psppl_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_nm1;// [Rslt]の[psppl_grp_p.bp_grp_nm1]を[columnRslt_psppl_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_cd2;// [Rslt]の[psppl_grp_p.bp_grp_cd2]を[columnRslt_psppl_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_nm2;// [Rslt]の[psppl_grp_p.bp_grp_nm2]を[columnRslt_psppl_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_cd3;// [Rslt]の[psppl_grp_p.bp_grp_cd3]を[columnRslt_psppl_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_nm3;// [Rslt]の[psppl_grp_p.bp_grp_nm3]を[columnRslt_psppl_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_cd4;// [Rslt]の[psppl_grp_p.bp_grp_cd4]を[columnRslt_psppl_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_nm4;// [Rslt]の[psppl_grp_p.bp_grp_nm4]を[columnRslt_psppl_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_cd5;// [Rslt]の[psppl_grp_p.bp_grp_cd5]を[columnRslt_psppl_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_nm5;// [Rslt]の[psppl_grp_p.bp_grp_nm5]を[columnRslt_psppl_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_cd6;// [Rslt]の[psppl_grp_p.bp_grp_cd6]を[columnRslt_psppl_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_nm6;// [Rslt]の[psppl_grp_p.bp_grp_nm6]を[columnRslt_psppl_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_cd7;// [Rslt]の[psppl_grp_p.bp_grp_cd7]を[columnRslt_psppl_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_nm7;// [Rslt]の[psppl_grp_p.bp_grp_nm7]を[columnRslt_psppl_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_cd8;// [Rslt]の[psppl_grp_p.bp_grp_cd8]を[columnRslt_psppl_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_nm8;// [Rslt]の[psppl_grp_p.bp_grp_nm8]を[columnRslt_psppl_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_cd9;// [Rslt]の[psppl_grp_p.bp_grp_cd9]を[columnRslt_psppl_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_nm9;// [Rslt]の[psppl_grp_p.bp_grp_nm9]を[columnRslt_psppl_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_cd10;// [Rslt]の[psppl_grp_p.bp_grp_cd10]を[columnRslt_psppl_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_nm10;// [Rslt]の[psppl_grp_p.bp_grp_nm10]を[columnRslt_psppl_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_bsppl_grp_p_PPanel;
	public MCColumnConfig columnRslt_bsppl_grp_cd1;// [Rslt]の[bsppl_grp_p.bp_grp_cd1]を[columnRslt_bsppl_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm1;// [Rslt]の[bsppl_grp_p.bp_grp_nm1]を[columnRslt_bsppl_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd2;// [Rslt]の[bsppl_grp_p.bp_grp_cd2]を[columnRslt_bsppl_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm2;// [Rslt]の[bsppl_grp_p.bp_grp_nm2]を[columnRslt_bsppl_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd3;// [Rslt]の[bsppl_grp_p.bp_grp_cd3]を[columnRslt_bsppl_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm3;// [Rslt]の[bsppl_grp_p.bp_grp_nm3]を[columnRslt_bsppl_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd4;// [Rslt]の[bsppl_grp_p.bp_grp_cd4]を[columnRslt_bsppl_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm4;// [Rslt]の[bsppl_grp_p.bp_grp_nm4]を[columnRslt_bsppl_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd5;// [Rslt]の[bsppl_grp_p.bp_grp_cd5]を[columnRslt_bsppl_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm5;// [Rslt]の[bsppl_grp_p.bp_grp_nm5]を[columnRslt_bsppl_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd6;// [Rslt]の[bsppl_grp_p.bp_grp_cd6]を[columnRslt_bsppl_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm6;// [Rslt]の[bsppl_grp_p.bp_grp_nm6]を[columnRslt_bsppl_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd7;// [Rslt]の[bsppl_grp_p.bp_grp_cd7]を[columnRslt_bsppl_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm7;// [Rslt]の[bsppl_grp_p.bp_grp_nm7]を[columnRslt_bsppl_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd8;// [Rslt]の[bsppl_grp_p.bp_grp_cd8]を[columnRslt_bsppl_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm8;// [Rslt]の[bsppl_grp_p.bp_grp_nm8]を[columnRslt_bsppl_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd9;// [Rslt]の[bsppl_grp_p.bp_grp_cd9]を[columnRslt_bsppl_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm9;// [Rslt]の[bsppl_grp_p.bp_grp_nm9]を[columnRslt_bsppl_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd10;// [Rslt]の[bsppl_grp_p.bp_grp_cd10]を[columnRslt_bsppl_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm10;// [Rslt]の[bsppl_grp_p.bp_grp_nm10]を[columnRslt_bsppl_grp_nm10]としてエイリアス定義。
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
	 * Advance payment entry 前渡金登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBHP0070 = null;
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
	
	/** [MS_MSBHL0080_Srch01]のCallerの作成 */
	protected MSBHP_AdvPaySrch_MC.MS_MSBHL0080_Srch01Caller createMS_MSBHL0080_Srch01() {
		MSBHP_AdvPaySrch_MC.MS_MSBHL0080_Srch01Caller<MSBHP_AdvPaySrch, MS_MSBHL0080_Srch01Bridge>
		caller = ((MSBHP_AdvPaySrch_MC)this).new MS_MSBHL0080_Srch01Caller<MSBHP_AdvPaySrch, MS_MSBHL0080_Srch01Bridge>(
					(MSBHP_AdvPaySrch)this, new MS_MSBHL0080_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBHL0080_Srch01]の呼び出し */
	protected void callMS_MSBHL0080_Srch01() {
		MCCaller caller = createMS_MSBHL0080_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0080.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBH.MSBHP0080.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBH.MSBHP0080.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0080.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0080.CndR createCndR() {
		return mcframe.clientMSBH.MSBHP0080.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBH.MSBHP0080.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0080.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBH.MSBHP0080.RsltR createRsltR() {
		return mcframe.clientMSBH.MSBHP0080.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0080.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBH.MSBHP0080.RsltR.class);
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
		ret.add(Tab2Panel);
		ret.add(PspplPanel);
		ret.add(Tab3Panel);
		ret.add(BspplPanel);
		ret.add(CndPanel);
		ret.add(LPnlPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_AdvPaySrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBHP_AdvPaySrch_MC_A(String name) {
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
		MSBHP_AdvPaySrch_MC.jbCreateTop((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbCreateFold((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbCreateTab1((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbCreateTab2((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbCreatePsppl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbCreateTab3((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbCreateBsppl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbCreateCnd((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbCreateLPnl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbCreateCtrl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbCreateRPnl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbCreateRslt((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbCreateBtn((MSBHP_AdvPaySrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBHP_AdvPaySrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBHP_AdvPaySrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBHP_AdvPaySrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBHP_AdvPaySrch p) {
	}

	/**
	 * [Psppl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePsppl(MSBHP_AdvPaySrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBHP_AdvPaySrch p) {
	}

	/**
	 * [Bsppl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBsppl(MSBHP_AdvPaySrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBHP_AdvPaySrch p) {
		p.Cnd_psppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().psppl_grp_p());
		p.Cnd_psppl_grp_p_PPanel.setName("Cnd.psppl_grp_p");
		p.Cnd_psppl_grp_lab1 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_psppl_grp_lab1.addAliasName("Cnd.psppl_grp_lab1", p);
		p.Cnd_psppl_grp_flg1 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_psppl_grp_flg1.addAliasName("Cnd.psppl_grp_flg1", p);
		p.Cnd_psppl_grp_cd1 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_psppl_grp_cd1.addAliasName("Cnd.psppl_grp_cd1", p);
		p.Cnd_psppl_grp_nm1 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_psppl_grp_nm1.addAliasName("Cnd.psppl_grp_nm1", p);
		p.Cnd_psppl_grp_lab2 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_psppl_grp_lab2.addAliasName("Cnd.psppl_grp_lab2", p);
		p.Cnd_psppl_grp_flg2 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_psppl_grp_flg2.addAliasName("Cnd.psppl_grp_flg2", p);
		p.Cnd_psppl_grp_cd2 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_psppl_grp_cd2.addAliasName("Cnd.psppl_grp_cd2", p);
		p.Cnd_psppl_grp_nm2 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_psppl_grp_nm2.addAliasName("Cnd.psppl_grp_nm2", p);
		p.Cnd_psppl_grp_lab3 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_psppl_grp_lab3.addAliasName("Cnd.psppl_grp_lab3", p);
		p.Cnd_psppl_grp_flg3 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_psppl_grp_flg3.addAliasName("Cnd.psppl_grp_flg3", p);
		p.Cnd_psppl_grp_cd3 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_psppl_grp_cd3.addAliasName("Cnd.psppl_grp_cd3", p);
		p.Cnd_psppl_grp_nm3 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_psppl_grp_nm3.addAliasName("Cnd.psppl_grp_nm3", p);
		p.Cnd_psppl_grp_lab4 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_psppl_grp_lab4.addAliasName("Cnd.psppl_grp_lab4", p);
		p.Cnd_psppl_grp_flg4 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_psppl_grp_flg4.addAliasName("Cnd.psppl_grp_flg4", p);
		p.Cnd_psppl_grp_cd4 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_psppl_grp_cd4.addAliasName("Cnd.psppl_grp_cd4", p);
		p.Cnd_psppl_grp_nm4 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_psppl_grp_nm4.addAliasName("Cnd.psppl_grp_nm4", p);
		p.Cnd_psppl_grp_lab5 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_psppl_grp_lab5.addAliasName("Cnd.psppl_grp_lab5", p);
		p.Cnd_psppl_grp_flg5 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_psppl_grp_flg5.addAliasName("Cnd.psppl_grp_flg5", p);
		p.Cnd_psppl_grp_cd5 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_psppl_grp_cd5.addAliasName("Cnd.psppl_grp_cd5", p);
		p.Cnd_psppl_grp_nm5 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_psppl_grp_nm5.addAliasName("Cnd.psppl_grp_nm5", p);
		p.Cnd_psppl_grp_lab6 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_psppl_grp_lab6.addAliasName("Cnd.psppl_grp_lab6", p);
		p.Cnd_psppl_grp_flg6 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_psppl_grp_flg6.addAliasName("Cnd.psppl_grp_flg6", p);
		p.Cnd_psppl_grp_cd6 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_psppl_grp_cd6.addAliasName("Cnd.psppl_grp_cd6", p);
		p.Cnd_psppl_grp_nm6 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_psppl_grp_nm6.addAliasName("Cnd.psppl_grp_nm6", p);
		p.Cnd_psppl_grp_lab7 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_psppl_grp_lab7.addAliasName("Cnd.psppl_grp_lab7", p);
		p.Cnd_psppl_grp_flg7 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_psppl_grp_flg7.addAliasName("Cnd.psppl_grp_flg7", p);
		p.Cnd_psppl_grp_cd7 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_psppl_grp_cd7.addAliasName("Cnd.psppl_grp_cd7", p);
		p.Cnd_psppl_grp_nm7 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_psppl_grp_nm7.addAliasName("Cnd.psppl_grp_nm7", p);
		p.Cnd_psppl_grp_lab8 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_psppl_grp_lab8.addAliasName("Cnd.psppl_grp_lab8", p);
		p.Cnd_psppl_grp_flg8 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_psppl_grp_flg8.addAliasName("Cnd.psppl_grp_flg8", p);
		p.Cnd_psppl_grp_cd8 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_psppl_grp_cd8.addAliasName("Cnd.psppl_grp_cd8", p);
		p.Cnd_psppl_grp_nm8 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_psppl_grp_nm8.addAliasName("Cnd.psppl_grp_nm8", p);
		p.Cnd_psppl_grp_lab9 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_psppl_grp_lab9.addAliasName("Cnd.psppl_grp_lab9", p);
		p.Cnd_psppl_grp_flg9 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_psppl_grp_flg9.addAliasName("Cnd.psppl_grp_flg9", p);
		p.Cnd_psppl_grp_cd9 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_psppl_grp_cd9.addAliasName("Cnd.psppl_grp_cd9", p);
		p.Cnd_psppl_grp_nm9 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_psppl_grp_nm9.addAliasName("Cnd.psppl_grp_nm9", p);
		p.Cnd_psppl_grp_lab10 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_psppl_grp_lab10.addAliasName("Cnd.psppl_grp_lab10", p);
		p.Cnd_psppl_grp_flg10 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_psppl_grp_flg10.addAliasName("Cnd.psppl_grp_flg10", p);
		p.Cnd_psppl_grp_cd10 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_psppl_grp_cd10.addAliasName("Cnd.psppl_grp_cd10", p);
		p.Cnd_psppl_grp_nm10 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_psppl_grp_nm10.addAliasName("Cnd.psppl_grp_nm10", p);
		p.Cnd_bsppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().bsppl_grp_p());
		p.Cnd_bsppl_grp_p_PPanel.setName("Cnd.bsppl_grp_p");
		p.Cnd_bsppl_grp_lab1 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_bsppl_grp_lab1.addAliasName("Cnd.bsppl_grp_lab1", p);
		p.Cnd_bsppl_grp_flg1 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_bsppl_grp_flg1.addAliasName("Cnd.bsppl_grp_flg1", p);
		p.Cnd_bsppl_grp_cd1 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_bsppl_grp_cd1.addAliasName("Cnd.bsppl_grp_cd1", p);
		p.Cnd_bsppl_grp_nm1 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_bsppl_grp_nm1.addAliasName("Cnd.bsppl_grp_nm1", p);
		p.Cnd_bsppl_grp_lab2 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_bsppl_grp_lab2.addAliasName("Cnd.bsppl_grp_lab2", p);
		p.Cnd_bsppl_grp_flg2 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_bsppl_grp_flg2.addAliasName("Cnd.bsppl_grp_flg2", p);
		p.Cnd_bsppl_grp_cd2 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_bsppl_grp_cd2.addAliasName("Cnd.bsppl_grp_cd2", p);
		p.Cnd_bsppl_grp_nm2 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_bsppl_grp_nm2.addAliasName("Cnd.bsppl_grp_nm2", p);
		p.Cnd_bsppl_grp_lab3 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_bsppl_grp_lab3.addAliasName("Cnd.bsppl_grp_lab3", p);
		p.Cnd_bsppl_grp_flg3 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_bsppl_grp_flg3.addAliasName("Cnd.bsppl_grp_flg3", p);
		p.Cnd_bsppl_grp_cd3 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_bsppl_grp_cd3.addAliasName("Cnd.bsppl_grp_cd3", p);
		p.Cnd_bsppl_grp_nm3 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_bsppl_grp_nm3.addAliasName("Cnd.bsppl_grp_nm3", p);
		p.Cnd_bsppl_grp_lab4 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_bsppl_grp_lab4.addAliasName("Cnd.bsppl_grp_lab4", p);
		p.Cnd_bsppl_grp_flg4 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_bsppl_grp_flg4.addAliasName("Cnd.bsppl_grp_flg4", p);
		p.Cnd_bsppl_grp_cd4 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_bsppl_grp_cd4.addAliasName("Cnd.bsppl_grp_cd4", p);
		p.Cnd_bsppl_grp_nm4 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_bsppl_grp_nm4.addAliasName("Cnd.bsppl_grp_nm4", p);
		p.Cnd_bsppl_grp_lab5 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_bsppl_grp_lab5.addAliasName("Cnd.bsppl_grp_lab5", p);
		p.Cnd_bsppl_grp_flg5 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_bsppl_grp_flg5.addAliasName("Cnd.bsppl_grp_flg5", p);
		p.Cnd_bsppl_grp_cd5 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_bsppl_grp_cd5.addAliasName("Cnd.bsppl_grp_cd5", p);
		p.Cnd_bsppl_grp_nm5 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_bsppl_grp_nm5.addAliasName("Cnd.bsppl_grp_nm5", p);
		p.Cnd_bsppl_grp_lab6 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_bsppl_grp_lab6.addAliasName("Cnd.bsppl_grp_lab6", p);
		p.Cnd_bsppl_grp_flg6 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_bsppl_grp_flg6.addAliasName("Cnd.bsppl_grp_flg6", p);
		p.Cnd_bsppl_grp_cd6 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_bsppl_grp_cd6.addAliasName("Cnd.bsppl_grp_cd6", p);
		p.Cnd_bsppl_grp_nm6 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_bsppl_grp_nm6.addAliasName("Cnd.bsppl_grp_nm6", p);
		p.Cnd_bsppl_grp_lab7 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_bsppl_grp_lab7.addAliasName("Cnd.bsppl_grp_lab7", p);
		p.Cnd_bsppl_grp_flg7 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_bsppl_grp_flg7.addAliasName("Cnd.bsppl_grp_flg7", p);
		p.Cnd_bsppl_grp_cd7 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_bsppl_grp_cd7.addAliasName("Cnd.bsppl_grp_cd7", p);
		p.Cnd_bsppl_grp_nm7 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_bsppl_grp_nm7.addAliasName("Cnd.bsppl_grp_nm7", p);
		p.Cnd_bsppl_grp_lab8 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_bsppl_grp_lab8.addAliasName("Cnd.bsppl_grp_lab8", p);
		p.Cnd_bsppl_grp_flg8 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_bsppl_grp_flg8.addAliasName("Cnd.bsppl_grp_flg8", p);
		p.Cnd_bsppl_grp_cd8 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_bsppl_grp_cd8.addAliasName("Cnd.bsppl_grp_cd8", p);
		p.Cnd_bsppl_grp_nm8 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_bsppl_grp_nm8.addAliasName("Cnd.bsppl_grp_nm8", p);
		p.Cnd_bsppl_grp_lab9 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_bsppl_grp_lab9.addAliasName("Cnd.bsppl_grp_lab9", p);
		p.Cnd_bsppl_grp_flg9 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_bsppl_grp_flg9.addAliasName("Cnd.bsppl_grp_flg9", p);
		p.Cnd_bsppl_grp_cd9 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_bsppl_grp_cd9.addAliasName("Cnd.bsppl_grp_cd9", p);
		p.Cnd_bsppl_grp_nm9 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_bsppl_grp_nm9.addAliasName("Cnd.bsppl_grp_nm9", p);
		p.Cnd_bsppl_grp_lab10 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_bsppl_grp_lab10.addAliasName("Cnd.bsppl_grp_lab10", p);
		p.Cnd_bsppl_grp_flg10 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_bsppl_grp_flg10.addAliasName("Cnd.bsppl_grp_flg10", p);
		p.Cnd_bsppl_grp_cd10 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_bsppl_grp_cd10.addAliasName("Cnd.bsppl_grp_cd10", p);
		p.Cnd_bsppl_grp_nm10 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_bsppl_grp_nm10.addAliasName("Cnd.bsppl_grp_nm10", p);
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MSBHP_AdvPaySrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBHP_AdvPaySrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBHP_AdvPaySrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBHP_AdvPaySrch p) {
		p.Rslt_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0080.RsltR.$trd_cur_amt_p);
		p.Rslt_trd_cur_amt_p_PPanel.setName("Rslt.trd_cur_amt_p");
		p.columnRslt_trd_cur_amt = p.Rslt_trd_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_amt.addAliasName("Rslt.trd_cur_amt", p);
		p.Rslt_trd_cur_com_paid_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0080.RsltR.$trd_cur_com_paid_p);
		p.Rslt_trd_cur_com_paid_p_PPanel.setName("Rslt.trd_cur_com_paid_p");
		p.columnRslt_trd_cur_com_paid = p.Rslt_trd_cur_com_paid_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_com_paid.addAliasName("Rslt.trd_cur_com_paid", p);
		p.Rslt_trd_cur_com_paid_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0080.RsltR.$trd_cur_com_paid_tax_amt_p);
		p.Rslt_trd_cur_com_paid_tax_amt_p_PPanel.setName("Rslt.trd_cur_com_paid_tax_amt_p");
		p.columnRslt_trd_cur_com_paid_tax_amt = p.Rslt_trd_cur_com_paid_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_com_paid_tax_amt.addAliasName("Rslt.trd_cur_com_paid_tax_amt", p);
		p.Rslt_trd_cur_exc_com_paid_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0080.RsltR.$trd_cur_exc_com_paid_p);
		p.Rslt_trd_cur_exc_com_paid_p_PPanel.setName("Rslt.trd_cur_exc_com_paid_p");
		p.columnRslt_trd_cur_exc_com_paid = p.Rslt_trd_cur_exc_com_paid_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_exc_com_paid.addAliasName("Rslt.trd_cur_exc_com_paid", p);
		p.Rslt_trd_cur_setoff_tgt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0080.RsltR.$trd_cur_setoff_tgt_amt_p);
		p.Rslt_trd_cur_setoff_tgt_amt_p_PPanel.setName("Rslt.trd_cur_setoff_tgt_amt_p");
		p.columnRslt_trd_cur_setoff_tgt_amt = p.Rslt_trd_cur_setoff_tgt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_setoff_tgt_amt.addAliasName("Rslt.trd_cur_setoff_tgt_amt", p);
		p.Rslt_trd_cur_setoff_schd_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0080.RsltR.$trd_cur_setoff_schd_amt_p);
		p.Rslt_trd_cur_setoff_schd_amt_p_PPanel.setName("Rslt.trd_cur_setoff_schd_amt_p");
		p.columnRslt_trd_cur_setoff_schd_amt = p.Rslt_trd_cur_setoff_schd_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_setoff_schd_amt.addAliasName("Rslt.trd_cur_setoff_schd_amt", p);
		p.Rslt_trd_cur_setoff_act_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0080.RsltR.$trd_cur_setoff_act_amt_p);
		p.Rslt_trd_cur_setoff_act_amt_p_PPanel.setName("Rslt.trd_cur_setoff_act_amt_p");
		p.columnRslt_trd_cur_setoff_act_amt = p.Rslt_trd_cur_setoff_act_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_setoff_act_amt.addAliasName("Rslt.trd_cur_setoff_act_amt", p);
		p.Rslt_trd_cur_not_proc_bal_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0080.RsltR.$trd_cur_not_proc_bal_p);
		p.Rslt_trd_cur_not_proc_bal_p_PPanel.setName("Rslt.trd_cur_not_proc_bal_p");
		p.columnRslt_trd_cur_not_proc_bal = p.Rslt_trd_cur_not_proc_bal_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_not_proc_bal.addAliasName("Rslt.trd_cur_not_proc_bal", p);
		p.Rslt_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0080.RsltR.$base_cur_amt_p);
		p.Rslt_base_cur_amt_p_PPanel.setName("Rslt.base_cur_amt_p");
		p.columnRslt_base_cur_amt = p.Rslt_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_amt.addAliasName("Rslt.base_cur_amt", p);
		p.Rslt_base_cur_com_paid_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0080.RsltR.$base_cur_com_paid_p);
		p.Rslt_base_cur_com_paid_p_PPanel.setName("Rslt.base_cur_com_paid_p");
		p.columnRslt_base_cur_com_paid = p.Rslt_base_cur_com_paid_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_com_paid.addAliasName("Rslt.base_cur_com_paid", p);
		p.Rslt_base_cur_com_paid_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0080.RsltR.$base_cur_com_paid_tax_amt_p);
		p.Rslt_base_cur_com_paid_tax_amt_p_PPanel.setName("Rslt.base_cur_com_paid_tax_amt_p");
		p.columnRslt_base_cur_com_paid_tax_amt = p.Rslt_base_cur_com_paid_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_com_paid_tax_amt.addAliasName("Rslt.base_cur_com_paid_tax_amt", p);
		p.Rslt_base_cur_exc_com_paid_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0080.RsltR.$base_cur_exc_com_paid_p);
		p.Rslt_base_cur_exc_com_paid_p_PPanel.setName("Rslt.base_cur_exc_com_paid_p");
		p.columnRslt_base_cur_exc_com_paid = p.Rslt_base_cur_exc_com_paid_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_exc_com_paid.addAliasName("Rslt.base_cur_exc_com_paid", p);
		p.Rslt_base_cur_setoff_tgt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0080.RsltR.$base_cur_setoff_tgt_amt_p);
		p.Rslt_base_cur_setoff_tgt_amt_p_PPanel.setName("Rslt.base_cur_setoff_tgt_amt_p");
		p.columnRslt_base_cur_setoff_tgt_amt = p.Rslt_base_cur_setoff_tgt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_setoff_tgt_amt.addAliasName("Rslt.base_cur_setoff_tgt_amt", p);
		p.Rslt_psppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBH.MSBHP0080.RsltR.$psppl_grp_p);
		p.Rslt_psppl_grp_p_PPanel.setName("Rslt.psppl_grp_p");
		p.columnRslt_psppl_grp_cd1 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_psppl_grp_cd1.addAliasName("Rslt.psppl_grp_cd1", p);
		p.columnRslt_psppl_grp_nm1 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_psppl_grp_nm1.addAliasName("Rslt.psppl_grp_nm1", p);
		p.columnRslt_psppl_grp_cd2 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_psppl_grp_cd2.addAliasName("Rslt.psppl_grp_cd2", p);
		p.columnRslt_psppl_grp_nm2 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_psppl_grp_nm2.addAliasName("Rslt.psppl_grp_nm2", p);
		p.columnRslt_psppl_grp_cd3 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_psppl_grp_cd3.addAliasName("Rslt.psppl_grp_cd3", p);
		p.columnRslt_psppl_grp_nm3 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_psppl_grp_nm3.addAliasName("Rslt.psppl_grp_nm3", p);
		p.columnRslt_psppl_grp_cd4 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_psppl_grp_cd4.addAliasName("Rslt.psppl_grp_cd4", p);
		p.columnRslt_psppl_grp_nm4 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_psppl_grp_nm4.addAliasName("Rslt.psppl_grp_nm4", p);
		p.columnRslt_psppl_grp_cd5 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_psppl_grp_cd5.addAliasName("Rslt.psppl_grp_cd5", p);
		p.columnRslt_psppl_grp_nm5 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_psppl_grp_nm5.addAliasName("Rslt.psppl_grp_nm5", p);
		p.columnRslt_psppl_grp_cd6 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_psppl_grp_cd6.addAliasName("Rslt.psppl_grp_cd6", p);
		p.columnRslt_psppl_grp_nm6 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_psppl_grp_nm6.addAliasName("Rslt.psppl_grp_nm6", p);
		p.columnRslt_psppl_grp_cd7 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_psppl_grp_cd7.addAliasName("Rslt.psppl_grp_cd7", p);
		p.columnRslt_psppl_grp_nm7 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_psppl_grp_nm7.addAliasName("Rslt.psppl_grp_nm7", p);
		p.columnRslt_psppl_grp_cd8 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_psppl_grp_cd8.addAliasName("Rslt.psppl_grp_cd8", p);
		p.columnRslt_psppl_grp_nm8 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_psppl_grp_nm8.addAliasName("Rslt.psppl_grp_nm8", p);
		p.columnRslt_psppl_grp_cd9 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_psppl_grp_cd9.addAliasName("Rslt.psppl_grp_cd9", p);
		p.columnRslt_psppl_grp_nm9 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_psppl_grp_nm9.addAliasName("Rslt.psppl_grp_nm9", p);
		p.columnRslt_psppl_grp_cd10 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_psppl_grp_cd10.addAliasName("Rslt.psppl_grp_cd10", p);
		p.columnRslt_psppl_grp_nm10 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_psppl_grp_nm10.addAliasName("Rslt.psppl_grp_nm10", p);
		p.Rslt_bsppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBH.MSBHP0080.RsltR.$bsppl_grp_p);
		p.Rslt_bsppl_grp_p_PPanel.setName("Rslt.bsppl_grp_p");
		p.columnRslt_bsppl_grp_cd1 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_bsppl_grp_cd1.addAliasName("Rslt.bsppl_grp_cd1", p);
		p.columnRslt_bsppl_grp_nm1 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_bsppl_grp_nm1.addAliasName("Rslt.bsppl_grp_nm1", p);
		p.columnRslt_bsppl_grp_cd2 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_bsppl_grp_cd2.addAliasName("Rslt.bsppl_grp_cd2", p);
		p.columnRslt_bsppl_grp_nm2 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_bsppl_grp_nm2.addAliasName("Rslt.bsppl_grp_nm2", p);
		p.columnRslt_bsppl_grp_cd3 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_bsppl_grp_cd3.addAliasName("Rslt.bsppl_grp_cd3", p);
		p.columnRslt_bsppl_grp_nm3 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_bsppl_grp_nm3.addAliasName("Rslt.bsppl_grp_nm3", p);
		p.columnRslt_bsppl_grp_cd4 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_bsppl_grp_cd4.addAliasName("Rslt.bsppl_grp_cd4", p);
		p.columnRslt_bsppl_grp_nm4 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_bsppl_grp_nm4.addAliasName("Rslt.bsppl_grp_nm4", p);
		p.columnRslt_bsppl_grp_cd5 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_bsppl_grp_cd5.addAliasName("Rslt.bsppl_grp_cd5", p);
		p.columnRslt_bsppl_grp_nm5 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_bsppl_grp_nm5.addAliasName("Rslt.bsppl_grp_nm5", p);
		p.columnRslt_bsppl_grp_cd6 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_bsppl_grp_cd6.addAliasName("Rslt.bsppl_grp_cd6", p);
		p.columnRslt_bsppl_grp_nm6 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_bsppl_grp_nm6.addAliasName("Rslt.bsppl_grp_nm6", p);
		p.columnRslt_bsppl_grp_cd7 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_bsppl_grp_cd7.addAliasName("Rslt.bsppl_grp_cd7", p);
		p.columnRslt_bsppl_grp_nm7 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_bsppl_grp_nm7.addAliasName("Rslt.bsppl_grp_nm7", p);
		p.columnRslt_bsppl_grp_cd8 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_bsppl_grp_cd8.addAliasName("Rslt.bsppl_grp_cd8", p);
		p.columnRslt_bsppl_grp_nm8 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_bsppl_grp_nm8.addAliasName("Rslt.bsppl_grp_nm8", p);
		p.columnRslt_bsppl_grp_cd9 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_bsppl_grp_cd9.addAliasName("Rslt.bsppl_grp_cd9", p);
		p.columnRslt_bsppl_grp_nm9 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_bsppl_grp_nm9.addAliasName("Rslt.bsppl_grp_nm9", p);
		p.columnRslt_bsppl_grp_cd10 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_bsppl_grp_cd10.addAliasName("Rslt.bsppl_grp_cd10", p);
		p.columnRslt_bsppl_grp_nm10 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_bsppl_grp_nm10.addAliasName("Rslt.bsppl_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBHP_AdvPaySrch p) {
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

	
	/** [Cnd_psppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_psppl_cd_p = null;

	/**
	 * [Cnd_psppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_psppl_cd_ListPutter() {
		if (Cnd_psppl_cd_p == null) {
			Cnd_psppl_cd_p = createCnd_psppl_cd_ListPutter(Cnd_psppl_cd, "psppl_cd", "psppl_nm");

		}
		return Cnd_psppl_cd_p;
	}
	
	
	/** [Cnd_bsppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bsppl_cd_p = null;

	/**
	 * [Cnd_bsppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bsppl_cd_ListPutter() {
		if (Cnd_bsppl_cd_p == null) {
			Cnd_bsppl_cd_p = createCnd_bsppl_cd_ListPutter(Cnd_bsppl_cd, "bsppl_cd", "bsppl_nm");

		}
		return Cnd_bsppl_cd_p;
	}
	
	
	/** [Cnd_bsppl_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bsppl_dpt_cd_p = null;

	/**
	 * [Cnd_bsppl_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bsppl_dpt_cd_ListPutter() {
		if (Cnd_bsppl_dpt_cd_p == null) {
			Cnd_bsppl_dpt_cd_p = createCnd_bsppl_dpt_cd_ListPutter(Cnd_bsppl_dpt_cd, "bsppl_dpt_cd", "bsppl_dpt_nm");

		}
		return Cnd_bsppl_dpt_cd_p;
	}
	
	
	/** [Cnd_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bd_dpt_cd_p = null;

	/**
	 * [Cnd_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bd_dpt_cd_ListPutter() {
		if (Cnd_bd_dpt_cd_p == null) {
			Cnd_bd_dpt_cd_p = createCnd_bd_dpt_cd_ListPutter(Cnd_bd_dpt_cd, "bd_dpt_cd", "bd_dpt_nm");

		}
		return Cnd_bd_dpt_cd_p;
	}
	
	
	/** [Cnd_pay_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pay_dpt_cd_p = null;

	/**
	 * [Cnd_pay_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pay_dpt_cd_ListPutter() {
		if (Cnd_pay_dpt_cd_p == null) {
			Cnd_pay_dpt_cd_p = createCnd_pay_dpt_cd_ListPutter(Cnd_pay_dpt_cd, "pay_dpt_cd", "pay_dpt_nm");

		}
		return Cnd_pay_dpt_cd_p;
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
	
	
	/** [Cnd_pay_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pay_usr_cd_p = null;

	/**
	 * [Cnd_pay_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pay_usr_cd_ListPutter() {
		if (Cnd_pay_usr_cd_p == null) {
			Cnd_pay_usr_cd_p = createCnd_pay_usr_cd_ListPutter(Cnd_pay_usr_cd, "pay_usr_cd", "pay_usr_nm");

		}
		return Cnd_pay_usr_cd_p;
	}
	
	
	/** [Cnd_ap_sttl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ap_sttl_cd_p = null;

	/**
	 * [Cnd_ap_sttl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ap_sttl_cd_ListPutter() {
		if (Cnd_ap_sttl_cd_p == null) {
			Cnd_ap_sttl_cd_p = createCnd_ap_sttl_cd_ListPutter(Cnd_ap_sttl_cd, "ap_sttl_cd", "ap_sttl_nm");

		}
		return Cnd_ap_sttl_cd_p;
	}
	
	
	/** [Cnd_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Cnd_trd_cur_cd_p = null;

	/**
	 * [Cnd_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_trd_cur_cd_ListPutter() {
		if (Cnd_trd_cur_cd_p == null) {
			Cnd_trd_cur_cd_p = createCnd_trd_cur_cd_ListPutter(Cnd_trd_cur_cd, "trd_cur_cd", "trd_cur_nm");

		}
		return Cnd_trd_cur_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_AdvPaySrch create(){
		MSBHP_AdvPaySrch p = new MSBHP_AdvPaySrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_AdvPaySrch create(String name){
		MSBHP_AdvPaySrch p = new MSBHP_AdvPaySrch(name);
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
		MSBHP_AdvPaySrch_MC.jbfInitTop((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbfInitFold((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbfInitTab1((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbfInitTab2((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbfInitPsppl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbfInitTab3((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbfInitBsppl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbfInitCnd((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbfInitLPnl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbfInitCtrl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbfInitRPnl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbfInitRslt((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbfInitBtn((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbInitTop((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbInitFold((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbInitTab1((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbInitTab2((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbInitPsppl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbInitTab3((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbInitBsppl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbInitCnd((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbInitLPnl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbInitCtrl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbInitRPnl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbInitRslt((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.jbInitBtn((MSBHP_AdvPaySrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBHP_AdvPaySrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBHP_AdvPaySrch p) {
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
	protected static void jbfInitTab1(MSBHP_AdvPaySrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBHP_AdvPaySrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Psppl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPsppl(MSBHP_AdvPaySrch p) {
		// ブロック関連の初期化
		p.PspplPanel = p.beansFactory.createPanel("Psppl");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBHP_AdvPaySrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Bsppl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBsppl(MSBHP_AdvPaySrch p) {
		// ブロック関連の初期化
		p.BspplPanel = p.beansFactory.createPanel("Bsppl");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBHP_AdvPaySrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_pay_act_dt_fr_Label = p.beansFactory.createLabel("Cnd.pay_act_dt_fr_Label");
		p.Cnd_pay_act_dt_fr = p.beansFactory.createDateField("Cnd.pay_act_dt_fr");
		p.Cnd_pay_act_dt_fr.setLabel(p.Cnd_pay_act_dt_fr_Label);
		p.Cnd_pay_act_dt_to_Label = p.beansFactory.createLabel("Cnd.pay_act_dt_to_Label");
		p.Cnd_pay_act_dt_to = p.beansFactory.createDateField("Cnd.pay_act_dt_to");
		p.Cnd_pay_act_dt_to.setLabel(p.Cnd_pay_act_dt_to_Label);
		p.Cnd_ac_dt_fr_Label = p.beansFactory.createLabel("Cnd.ac_dt_fr_Label");
		p.Cnd_ac_dt_fr = p.beansFactory.createDateField("Cnd.ac_dt_fr");
		p.Cnd_ac_dt_fr.setLabel(p.Cnd_ac_dt_fr_Label);
		p.Cnd_ac_dt_to_Label = p.beansFactory.createLabel("Cnd.ac_dt_to_Label");
		p.Cnd_ac_dt_to = p.beansFactory.createDateField("Cnd.ac_dt_to");
		p.Cnd_ac_dt_to.setLabel(p.Cnd_ac_dt_to_Label);
		p.Cnd_psppl_cd_Label = p.beansFactory.createLabel("Cnd.psppl_cd_Label");
		p.Cnd_psppl_cd = p.beansFactory.createTextField("Cnd.psppl_cd");
		p.Cnd_psppl_cd.setLabel(p.Cnd_psppl_cd_Label);
		p.Cnd_psppl_nm = p.beansFactory.createTextField("Cnd.psppl_nm");
		p.Cnd_bsppl_cd_Label = p.beansFactory.createLabel("Cnd.bsppl_cd_Label");
		p.Cnd_bsppl_cd = p.beansFactory.createTextField("Cnd.bsppl_cd");
		p.Cnd_bsppl_cd.setLabel(p.Cnd_bsppl_cd_Label);
		p.Cnd_bsppl_nm = p.beansFactory.createTextField("Cnd.bsppl_nm");
		p.Cnd_bsppl_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bsppl_dpt_cd_Label");
		p.Cnd_bsppl_dpt_cd = p.beansFactory.createTextField("Cnd.bsppl_dpt_cd");
		p.Cnd_bsppl_dpt_cd.setLabel(p.Cnd_bsppl_dpt_cd_Label);
		p.Cnd_bsppl_dpt_nm = p.beansFactory.createTextField("Cnd.bsppl_dpt_nm");
		p.Cnd_bd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bd_dpt_cd_Label");
		p.Cnd_bd_dpt_cd = p.beansFactory.createTextField("Cnd.bd_dpt_cd");
		p.Cnd_bd_dpt_cd.setLabel(p.Cnd_bd_dpt_cd_Label);
		p.Cnd_bd_dpt_nm = p.beansFactory.createTextField("Cnd.bd_dpt_nm");
		p.Cnd_pay_dpt_cd_Label = p.beansFactory.createLabel("Cnd.pay_dpt_cd_Label");
		p.Cnd_pay_dpt_cd = p.beansFactory.createTextField("Cnd.pay_dpt_cd");
		p.Cnd_pay_dpt_cd.setLabel(p.Cnd_pay_dpt_cd_Label);
		p.Cnd_pay_dpt_nm = p.beansFactory.createTextField("Cnd.pay_dpt_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_pay_usr_cd_Label = p.beansFactory.createLabel("Cnd.pay_usr_cd_Label");
		p.Cnd_pay_usr_cd = p.beansFactory.createTextField("Cnd.pay_usr_cd");
		p.Cnd_pay_usr_cd.setLabel(p.Cnd_pay_usr_cd_Label);
		p.Cnd_pay_usr_nm = p.beansFactory.createTextField("Cnd.pay_usr_nm");
		p.Cnd_adv_pay_act_no_Label = p.beansFactory.createLabel("Cnd.adv_pay_act_no_Label");
		p.Cnd_adv_pay_act_no = p.beansFactory.createTextField("Cnd.adv_pay_act_no");
		p.Cnd_adv_pay_act_no.setLabel(p.Cnd_adv_pay_act_no_Label);
		p.Cnd_note_no_Label = p.beansFactory.createLabel("Cnd.note_no_Label");
		p.Cnd_note_no = p.beansFactory.createTextField("Cnd.note_no");
		p.Cnd_note_no.setLabel(p.Cnd_note_no_Label);
		p.Cnd_ap_sttl_cd_Label = p.beansFactory.createLabel("Cnd.ap_sttl_cd_Label");
		p.Cnd_ap_sttl_cd = p.beansFactory.createTextComboBox("Cnd.ap_sttl_cd");
		p.Cnd_ap_sttl_cd.setLabel(p.Cnd_ap_sttl_cd_Label);
		p.Cnd_ap_sttl_nm = p.beansFactory.createTextField("Cnd.ap_sttl_nm");
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_incl_appl_flg = p.beansFactory.createCheckBox("Cnd.incl_appl_flg");
		p.Cnd_incl_can_red_flg = p.beansFactory.createCheckBox("Cnd.incl_can_red_flg");
		p.Cnd_trd_rmrks_Label = p.beansFactory.createLabel("Cnd.trd_rmrks_Label");
		p.Cnd_trd_rmrks = p.beansFactory.createTextField("Cnd.trd_rmrks");
		p.Cnd_trd_rmrks.setLabel(p.Cnd_trd_rmrks_Label);
		p.Cnd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_rmrks_Label");
		p.Cnd_intr_rmrks = p.beansFactory.createTextField("Cnd.intr_rmrks");
		p.Cnd_intr_rmrks.setLabel(p.Cnd_intr_rmrks_Label);
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
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MSBHP_AdvPaySrch p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBHP_AdvPaySrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBHP_AdvPaySrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBHP_AdvPaySrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_psppl_cd = p.beansFactory.createTableColumn("Rslt.psppl_cd", MCColumnType.TEXT);
		p.columnRslt_psppl_nm = p.beansFactory.createTableColumn("Rslt.psppl_nm", MCColumnType.TEXT);
		p.columnRslt_bsppl_cd = p.beansFactory.createTableColumn("Rslt.bsppl_cd", MCColumnType.TEXT);
		p.columnRslt_bsppl_nm = p.beansFactory.createTableColumn("Rslt.bsppl_nm", MCColumnType.TEXT);
		p.columnRslt_bsppl_dpt_cd = p.beansFactory.createTableColumn("Rslt.bsppl_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_bsppl_dpt_nm = p.beansFactory.createTableColumn("Rslt.bsppl_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_bd_dpt_cd = p.beansFactory.createTableColumn("Rslt.bd_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_bd_dpt_nm = p.beansFactory.createTableColumn("Rslt.bd_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_pay_dpt_cd = p.beansFactory.createTableColumn("Rslt.pay_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_pay_dpt_nm = p.beansFactory.createTableColumn("Rslt.pay_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_pay_usr_cd = p.beansFactory.createTableColumn("Rslt.pay_usr_cd", MCColumnType.TEXT);
		p.columnRslt_pay_usr_nm = p.beansFactory.createTableColumn("Rslt.pay_usr_nm", MCColumnType.TEXT);
		p.columnRslt_pay_act_dt = p.beansFactory.createTableColumn("Rslt.pay_act_dt", MCColumnType.DATE);
		p.columnRslt_ac_dt = p.beansFactory.createTableColumn("Rslt.ac_dt", MCColumnType.DATE);
		p.columnRslt_ac_ym = p.beansFactory.createTableColumn("Rslt.ac_ym", MCColumnType.DATE);
		p.columnRslt_slip_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_adv_pay_act_no = p.beansFactory.createTableColumn("Rslt.adv_pay_act_no", MCColumnType.TEXT);
		p.columnRslt_adv_pay_act_seq = p.beansFactory.createTableColumn("Rslt.adv_pay_act_seq", MCColumnType.NUMBER);
		p.columnRslt_adv_pay_act_rev = p.beansFactory.createTableColumn("Rslt.adv_pay_act_rev", MCColumnType.NUMBER);
		p.columnRslt_ap_sttl_cd = p.beansFactory.createTableColumn("Rslt.ap_sttl_cd", MCColumnType.TEXT);
		p.columnRslt_ap_sttl_nm = p.beansFactory.createTableColumn("Rslt.ap_sttl_nm", MCColumnType.TEXT);
		p.columnRslt_ap_sttl_typ = p.beansFactory.createTableColumn("Rslt.ap_sttl_typ", MCColumnType.TEXT);
		p.columnRslt_ap_sttl_typ_nm = p.beansFactory.createTableColumn("Rslt.ap_sttl_typ_nm", MCColumnType.TEXT);
		p.columnRslt_com_paid_ap_sttl_cd = p.beansFactory.createTableColumn("Rslt.com_paid_ap_sttl_cd", MCColumnType.TEXT);
		p.columnRslt_com_paid_ap_sttl_nm = p.beansFactory.createTableColumn("Rslt.com_paid_ap_sttl_nm", MCColumnType.TEXT);
		p.columnRslt_com_paid_ap_sttl_typ = p.beansFactory.createTableColumn("Rslt.com_paid_ap_sttl_typ", MCColumnType.TEXT);
		p.columnRslt_com_paid_ap_sttl_typ_nm = p.beansFactory.createTableColumn("Rslt.com_paid_ap_sttl_typ_nm", MCColumnType.TEXT);
		p.columnRslt_bank_ac_cd = p.beansFactory.createTableColumn("Rslt.bank_ac_cd", MCColumnType.TEXT);
		p.columnRslt_bank_ac_nm = p.beansFactory.createTableColumn("Rslt.bank_ac_nm", MCColumnType.TEXT);
		p.columnRslt_pay_bank_ac_cd = p.beansFactory.createTableColumn("Rslt.pay_bank_ac_cd", MCColumnType.TEXT);
		p.columnRslt_pay_bank_ac_nm = p.beansFactory.createTableColumn("Rslt.pay_bank_ac_nm", MCColumnType.TEXT);
		p.columnRslt_pay_ntc_adv_pay_flg = p.beansFactory.createTableColumn("Rslt.pay_ntc_adv_pay_flg", MCColumnType.CHECK);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.trd_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_com_paid_tax_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_com_paid_tax_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_com_paid_tax_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_com_paid_tax_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cur_com_paid_tax_rate = p.beansFactory.createTableColumn("Rslt.trd_cur_com_paid_tax_rate", MCColumnType.NUMBER);
		p.columnRslt_xrate_cd = p.beansFactory.createTableColumn("Rslt.xrate_cd", MCColumnType.TEXT);
		p.columnRslt_xrate = p.beansFactory.createTableColumn("Rslt.xrate", MCColumnType.NUMBER);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_nm = p.beansFactory.createTableColumn("Rslt.base_cur_nm", MCColumnType.TEXT);
		p.columnRslt_base_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.base_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_note_no = p.beansFactory.createTableColumn("Rslt.note_no", MCColumnType.TEXT);
		p.columnRslt_note_typ = p.beansFactory.createTableColumn("Rslt.note_typ", MCColumnType.TEXT);
		p.columnRslt_note_typ_nm = p.beansFactory.createTableColumn("Rslt.note_typ_nm", MCColumnType.TEXT);
		p.columnRslt_note_rsn_cd = p.beansFactory.createTableColumn("Rslt.note_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_note_rsn_nm = p.beansFactory.createTableColumn("Rslt.note_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_draw_dt = p.beansFactory.createTableColumn("Rslt.draw_dt", MCColumnType.DATE);
		p.columnRslt_due_dt = p.beansFactory.createTableColumn("Rslt.due_dt", MCColumnType.DATE);
		p.columnRslt_note_days = p.beansFactory.createTableColumn("Rslt.note_days", MCColumnType.NUMBER);
		p.columnRslt_drawer_nm = p.beansFactory.createTableColumn("Rslt.drawer_nm", MCColumnType.TEXT);
		p.columnRslt_draw_bank_cd = p.beansFactory.createTableColumn("Rslt.draw_bank_cd", MCColumnType.TEXT);
		p.columnRslt_draw_bank_nm = p.beansFactory.createTableColumn("Rslt.draw_bank_nm", MCColumnType.TEXT);
		p.columnRslt_draw_branch_cd = p.beansFactory.createTableColumn("Rslt.draw_branch_cd", MCColumnType.TEXT);
		p.columnRslt_draw_branch_nm = p.beansFactory.createTableColumn("Rslt.draw_branch_nm", MCColumnType.TEXT);
		p.columnRslt_endrsr = p.beansFactory.createTableColumn("Rslt.endrsr", MCColumnType.TEXT);
		p.columnRslt_accptr = p.beansFactory.createTableColumn("Rslt.accptr", MCColumnType.TEXT);
		p.columnRslt_trd_rmrks = p.beansFactory.createTableColumn("Rslt.trd_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
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
	protected static void jbfInitBtn(MSBHP_AdvPaySrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBHP0070 = p.beansFactory.createButton("Btn.open_MSBHP0070", "open");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBHP_AdvPaySrch p) {
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
		p.FoldPanel.setNextBeans(p.LPnlPanel);
		p.TopPanel.add(p.LPnlPanel, null);
		p.LPnlPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
		p.CtrlPanel.setNextBeans(p.RPnlPanel);
		p.TopPanel.add(p.RPnlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBHP_AdvPaySrch p) {
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
	protected static void jbInitTab1(MSBHP_AdvPaySrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBHP_AdvPaySrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.PspplPanel, null);
		p.Tab2Panel.setLastBeans(p.PspplPanel);
	}

	/**
	 * [Psppl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPsppl(MSBHP_AdvPaySrch p) {
		// ブロック関連の初期化
		p.PspplPanel.setValueCheck(false);
		p.PspplPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PspplPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBHP_AdvPaySrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.BspplPanel, null);
		p.Tab3Panel.setLastBeans(p.BspplPanel);
	}

	/**
	 * [Bsppl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBsppl(MSBHP_AdvPaySrch p) {
		// ブロック関連の初期化
		p.BspplPanel.setValueCheck(false);
		p.BspplPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BspplPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBHP_AdvPaySrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_pay_act_dt_fr_Label);
		p.CndPanel.add(p.Cnd_pay_act_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_pay_act_dt_fr);
		p.Cnd_pay_act_dt_fr.setNextBeans(p.Cnd_pay_act_dt_to);
		p.Cnd_pay_act_dt_fr.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.pay_act_dt_fr_META);
		p.Cnd_pay_act_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_pay_act_dt_to_Label);
		p.CndPanel.add(p.Cnd_pay_act_dt_to);
		p.Cnd_pay_act_dt_to.setNextBeans(p.Cnd_ac_dt_fr);
		p.Cnd_pay_act_dt_to.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.pay_act_dt_to_META);
		p.Cnd_pay_act_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ac_dt_fr);
		p.Cnd_ac_dt_fr.setNextBeans(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.ac_dt_fr_META);
		p.Cnd_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_to.setNextBeans(p.Cnd_psppl_cd);
		p.Cnd_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.ac_dt_to_META);
		p.Cnd_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_psppl_cd_Label);
		p.CndPanel.add(p.Cnd_psppl_cd);
		p.Cnd_psppl_cd.setNextBeans(p.Cnd_psppl_nm);
		p.Cnd_psppl_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.psppl_cd_META);
		p.Cnd_psppl_cd.addLinkBeans(p.Cnd_psppl_nm);
		p.Cnd_psppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_psppl_cd, true);
		p.CndPanel.add(p.Cnd_psppl_nm);
		p.Cnd_psppl_nm.setNextBeans(p.Cnd_bsppl_cd);
		p.Cnd_psppl_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.psppl_nm_META);
		p.setPluralValueEnable(p.Cnd_psppl_nm, true);
		p.CndPanel.add(p.Cnd_bsppl_cd_Label);
		p.CndPanel.add(p.Cnd_bsppl_cd);
		p.Cnd_bsppl_cd.setNextBeans(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.bsppl_cd_META);
		p.Cnd_bsppl_cd.addLinkBeans(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bsppl_cd, true);
		p.CndPanel.add(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_nm.setNextBeans(p.Cnd_bsppl_dpt_cd);
		p.Cnd_bsppl_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.bsppl_nm_META);
		p.setPluralValueEnable(p.Cnd_bsppl_nm, true);
		p.CndPanel.add(p.Cnd_bsppl_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bsppl_dpt_cd);
		p.Cnd_bsppl_dpt_cd.setNextBeans(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.bsppl_dpt_cd_META);
		p.Cnd_bsppl_dpt_cd.addLinkBeans(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bsppl_dpt_cd, true);
		p.CndPanel.add(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_nm.setNextBeans(p.Cnd_bd_dpt_cd);
		p.Cnd_bsppl_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.bsppl_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bsppl_dpt_nm, true);
		p.CndPanel.add(p.Cnd_bd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bd_dpt_cd);
		p.Cnd_bd_dpt_cd.setNextBeans(p.Cnd_bd_dpt_nm);
		p.Cnd_bd_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.bd_dpt_cd_META);
		p.Cnd_bd_dpt_cd.addLinkBeans(p.Cnd_bd_dpt_nm);
		p.Cnd_bd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bd_dpt_cd, true);
		p.CndPanel.add(p.Cnd_bd_dpt_nm);
		p.Cnd_bd_dpt_nm.setNextBeans(p.Cnd_pay_dpt_cd);
		p.Cnd_bd_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.bd_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bd_dpt_nm, true);
		p.CndPanel.add(p.Cnd_pay_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_pay_dpt_cd);
		p.Cnd_pay_dpt_cd.setNextBeans(p.Cnd_pay_dpt_nm);
		p.Cnd_pay_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.pay_dpt_cd_META);
		p.Cnd_pay_dpt_cd.addLinkBeans(p.Cnd_pay_dpt_nm);
		p.Cnd_pay_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pay_dpt_cd, true);
		p.CndPanel.add(p.Cnd_pay_dpt_nm);
		p.Cnd_pay_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_pay_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.pay_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_pay_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_pay_usr_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_pay_usr_cd_Label);
		p.CndPanel.add(p.Cnd_pay_usr_cd);
		p.Cnd_pay_usr_cd.setNextBeans(p.Cnd_pay_usr_nm);
		p.Cnd_pay_usr_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.pay_usr_cd_META);
		p.Cnd_pay_usr_cd.addLinkBeans(p.Cnd_pay_usr_nm);
		p.Cnd_pay_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pay_usr_cd, true);
		p.CndPanel.add(p.Cnd_pay_usr_nm);
		p.Cnd_pay_usr_nm.setNextBeans(p.Cnd_adv_pay_act_no);
		p.Cnd_pay_usr_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.pay_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_pay_usr_nm, true);
		p.CndPanel.add(p.Cnd_adv_pay_act_no_Label);
		p.CndPanel.add(p.Cnd_adv_pay_act_no);
		p.Cnd_adv_pay_act_no.setNextBeans(p.Cnd_note_no);
		p.Cnd_adv_pay_act_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.adv_pay_act_no_META);
		p.setPluralValueEnable(p.Cnd_adv_pay_act_no, true);
		p.CndPanel.add(p.Cnd_note_no_Label);
		p.CndPanel.add(p.Cnd_note_no);
		p.Cnd_note_no.setNextBeans(p.Cnd_ap_sttl_cd);
		p.Cnd_note_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.note_no_META);
		p.setPluralValueEnable(p.Cnd_note_no, true);
		p.Cnd_ap_sttl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ap_sttl_cd, true);
		p.Cnd_ap_sttl_cd.setLinkBeans(p.Cnd_ap_sttl_nm);
		p.CndPanel.add(p.Cnd_ap_sttl_cd_Label);
		p.CndPanel.add(p.Cnd_ap_sttl_cd);
		p.Cnd_ap_sttl_cd.setNextBeans(p.Cnd_ap_sttl_nm);
		p.Cnd_ap_sttl_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.ap_sttl_cd_META);
		p.CndPanel.add(p.Cnd_ap_sttl_nm);
		p.Cnd_ap_sttl_nm.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_ap_sttl_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.ap_sttl_nm_META);
		p.setPluralValueEnable(p.Cnd_ap_sttl_nm, true);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_incl_appl_flg);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.CndPanel.add(p.Cnd_incl_appl_flg);
		p.Cnd_incl_appl_flg.setNextBeans(p.Cnd_incl_can_red_flg);
		p.Cnd_incl_appl_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.incl_appl_flg_META);
		p.CndPanel.add(p.Cnd_incl_can_red_flg);
		p.Cnd_incl_can_red_flg.setNextBeans(p.Cnd_trd_rmrks);
		p.Cnd_incl_can_red_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.incl_can_red_flg_META);
		p.CndPanel.add(p.Cnd_trd_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_rmrks);
		p.Cnd_trd_rmrks.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_trd_rmrks.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.trd_rmrks_META);
		p.setPluralValueEnable(p.Cnd_trd_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0080.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.PspplPanel.add(p.Cnd_psppl_grp_p_PPanel);
		p.PspplPanel.setLastBeans(p.Cnd_psppl_grp_p_PPanel);
		p.BspplPanel.add(p.Cnd_bsppl_grp_p_PPanel);
		p.BspplPanel.setLastBeans(p.Cnd_bsppl_grp_p_PPanel);
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MSBHP_AdvPaySrch p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBHP_AdvPaySrch p) {
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
	protected static void jbInitRPnl(MSBHP_AdvPaySrch p) {
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
	protected static void jbInitRslt(MSBHP_AdvPaySrch p) {
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
	protected static void jbInitBtn(MSBHP_AdvPaySrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_open_MSBHP0070.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBHP0070);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBHP0070);
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
		MSBHP_AdvPaySrch_MC.mcInitTop((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.mcInitFold((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.mcInitTab1((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.mcInitTab2((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.mcInitPsppl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.mcInitTab3((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.mcInitBsppl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.mcInitCnd((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.mcInitLPnl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.mcInitCtrl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.mcInitRPnl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.mcInitRslt((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.mcInitBtn((MSBHP_AdvPaySrch)this);

		// [SRCH]ステータスのモードの設定
		MSBHP_AdvPaySrch_MC.statusInitSRCH_Top((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitSRCH_Fold((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitSRCH_Tab1((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitSRCH_Tab2((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitSRCH_Psppl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitSRCH_Tab3((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitSRCH_Bsppl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitSRCH_Cnd((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitSRCH_LPnl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitSRCH_Ctrl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitSRCH_RPnl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitSRCH_Rslt((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitSRCH_Btn((MSBHP_AdvPaySrch)this);

		// [REF]ステータスのモードの設定
		MSBHP_AdvPaySrch_MC.statusInitREF_Top((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitREF_Fold((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitREF_Tab1((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitREF_Tab2((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitREF_Psppl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitREF_Tab3((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitREF_Bsppl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitREF_Cnd((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitREF_LPnl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitREF_Ctrl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitREF_RPnl((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitREF_Rslt((MSBHP_AdvPaySrch)this);
		MSBHP_AdvPaySrch_MC.statusInitREF_Btn((MSBHP_AdvPaySrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBHP_AdvPaySrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBHP_AdvPaySrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBHP_AdvPaySrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBHP_AdvPaySrch p) {
	}

	/**
	 *  [Psppl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPsppl(MSBHP_AdvPaySrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBHP_AdvPaySrch p) {
	}

	/**
	 *  [Bsppl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBsppl(MSBHP_AdvPaySrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBHP_AdvPaySrch p) {
		p.Cnd_pay_act_dt_fr.setListListener(p);
		p.Cnd_pay_act_dt_fr.addAllListener(p);
		p.Cnd_pay_act_dt_to.setListListener(p);
		p.Cnd_pay_act_dt_to.addAllListener(p);
		p.Cnd_ac_dt_fr.setListListener(p);
		p.Cnd_ac_dt_fr.addAllListener(p);
		p.Cnd_ac_dt_to.setListListener(p);
		p.Cnd_ac_dt_to.addAllListener(p);
		p.Cnd_psppl_cd.setListListener(p);
		p.Cnd_psppl_cd.addAllListener(p);
		p.Cnd_psppl_nm.setListListener(p);
		p.Cnd_psppl_nm.addAllListener(p);
		p.Cnd_bsppl_cd.setListListener(p);
		p.Cnd_bsppl_cd.addAllListener(p);
		p.Cnd_bsppl_nm.setListListener(p);
		p.Cnd_bsppl_nm.addAllListener(p);
		p.Cnd_bsppl_dpt_cd.setListListener(p);
		p.Cnd_bsppl_dpt_cd.addAllListener(p);
		p.Cnd_bsppl_dpt_nm.setListListener(p);
		p.Cnd_bsppl_dpt_nm.addAllListener(p);
		p.Cnd_bd_dpt_cd.setListListener(p);
		p.Cnd_bd_dpt_cd.addAllListener(p);
		p.Cnd_bd_dpt_nm.setListListener(p);
		p.Cnd_bd_dpt_nm.addAllListener(p);
		p.Cnd_pay_dpt_cd.setListListener(p);
		p.Cnd_pay_dpt_cd.addAllListener(p);
		p.Cnd_pay_dpt_nm.setListListener(p);
		p.Cnd_pay_dpt_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_pay_usr_cd.setListListener(p);
		p.Cnd_pay_usr_cd.addAllListener(p);
		p.Cnd_pay_usr_nm.setListListener(p);
		p.Cnd_pay_usr_nm.addAllListener(p);
		p.Cnd_adv_pay_act_no.setListListener(p);
		p.Cnd_adv_pay_act_no.addAllListener(p);
		p.Cnd_note_no.setListListener(p);
		p.Cnd_note_no.addAllListener(p);
		p.Cnd_ap_sttl_cd.setListListener(p);
		p.Cnd_ap_sttl_cd.addAllListener(p);
		p.Cnd_ap_sttl_nm.setListListener(p);
		p.Cnd_ap_sttl_nm.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_incl_appl_flg.addAllListener(p);
		p.Cnd_incl_can_red_flg.addAllListener(p);
		p.Cnd_trd_rmrks.setListListener(p);
		p.Cnd_trd_rmrks.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MSBHP_AdvPaySrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBHP_AdvPaySrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBHP_AdvPaySrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBHP_AdvPaySrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_psppl_cd.addAllListener(p);
		p.columnRslt_psppl_cd.setListListener(p);
		p.columnRslt_psppl_nm.addAllListener(p);
		p.columnRslt_psppl_nm.setListListener(p);
		p.columnRslt_bsppl_cd.addAllListener(p);
		p.columnRslt_bsppl_cd.setListListener(p);
		p.columnRslt_bsppl_nm.addAllListener(p);
		p.columnRslt_bsppl_nm.setListListener(p);
		p.columnRslt_bsppl_dpt_cd.addAllListener(p);
		p.columnRslt_bsppl_dpt_cd.setListListener(p);
		p.columnRslt_bsppl_dpt_nm.addAllListener(p);
		p.columnRslt_bsppl_dpt_nm.setListListener(p);
		p.columnRslt_bd_dpt_cd.addAllListener(p);
		p.columnRslt_bd_dpt_cd.setListListener(p);
		p.columnRslt_bd_dpt_nm.addAllListener(p);
		p.columnRslt_bd_dpt_nm.setListListener(p);
		p.columnRslt_pay_dpt_cd.addAllListener(p);
		p.columnRslt_pay_dpt_cd.setListListener(p);
		p.columnRslt_pay_dpt_nm.addAllListener(p);
		p.columnRslt_pay_dpt_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_pay_usr_cd.addAllListener(p);
		p.columnRslt_pay_usr_cd.setListListener(p);
		p.columnRslt_pay_usr_nm.addAllListener(p);
		p.columnRslt_pay_usr_nm.setListListener(p);
		p.columnRslt_pay_act_dt.addAllListener(p);
		p.columnRslt_pay_act_dt.setListListener(p);
		p.columnRslt_ac_dt.addAllListener(p);
		p.columnRslt_ac_dt.setListListener(p);
		p.columnRslt_ac_ym.addAllListener(p);
		p.columnRslt_ac_ym.setListListener(p);
		p.columnRslt_slip_sts_typ_nm.addAllListener(p);
		p.columnRslt_slip_sts_typ_nm.setListListener(p);
		p.columnRslt_adv_pay_act_no.addAllListener(p);
		p.columnRslt_adv_pay_act_no.setListListener(p);
		p.columnRslt_adv_pay_act_seq.addAllListener(p);
		p.columnRslt_adv_pay_act_seq.setListListener(p);
		p.columnRslt_adv_pay_act_rev.addAllListener(p);
		p.columnRslt_adv_pay_act_rev.setListListener(p);
		p.columnRslt_ap_sttl_cd.addAllListener(p);
		p.columnRslt_ap_sttl_cd.setListListener(p);
		p.columnRslt_ap_sttl_nm.addAllListener(p);
		p.columnRslt_ap_sttl_nm.setListListener(p);
		p.columnRslt_ap_sttl_typ.addAllListener(p);
		p.columnRslt_ap_sttl_typ.setListListener(p);
		p.columnRslt_ap_sttl_typ_nm.addAllListener(p);
		p.columnRslt_ap_sttl_typ_nm.setListListener(p);
		p.columnRslt_com_paid_ap_sttl_cd.addAllListener(p);
		p.columnRslt_com_paid_ap_sttl_cd.setListListener(p);
		p.columnRslt_com_paid_ap_sttl_nm.addAllListener(p);
		p.columnRslt_com_paid_ap_sttl_nm.setListListener(p);
		p.columnRslt_com_paid_ap_sttl_typ.addAllListener(p);
		p.columnRslt_com_paid_ap_sttl_typ.setListListener(p);
		p.columnRslt_com_paid_ap_sttl_typ_nm.addAllListener(p);
		p.columnRslt_com_paid_ap_sttl_typ_nm.setListListener(p);
		p.columnRslt_bank_ac_cd.addAllListener(p);
		p.columnRslt_bank_ac_cd.setListListener(p);
		p.columnRslt_bank_ac_nm.addAllListener(p);
		p.columnRslt_bank_ac_nm.setListListener(p);
		p.columnRslt_pay_bank_ac_cd.addAllListener(p);
		p.columnRslt_pay_bank_ac_cd.setListListener(p);
		p.columnRslt_pay_bank_ac_nm.addAllListener(p);
		p.columnRslt_pay_bank_ac_nm.setListListener(p);
		p.columnRslt_pay_ntc_adv_pay_flg.addAllListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_trd_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_trd_cur_amt_dec_place.setListListener(p);
		p.columnRslt_trd_cur_com_paid_tax_cd.addAllListener(p);
		p.columnRslt_trd_cur_com_paid_tax_cd.setListListener(p);
		p.columnRslt_trd_cur_com_paid_tax_nm.addAllListener(p);
		p.columnRslt_trd_cur_com_paid_tax_nm.setListListener(p);
		p.columnRslt_trd_cur_com_paid_tax_rate.addAllListener(p);
		p.columnRslt_trd_cur_com_paid_tax_rate.setListListener(p);
		p.columnRslt_xrate_cd.addAllListener(p);
		p.columnRslt_xrate_cd.setListListener(p);
		p.columnRslt_xrate.addAllListener(p);
		p.columnRslt_xrate.setListListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_nm.addAllListener(p);
		p.columnRslt_base_cur_nm.setListListener(p);
		p.columnRslt_base_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_base_cur_amt_dec_place.setListListener(p);
		p.columnRslt_note_no.addAllListener(p);
		p.columnRslt_note_no.setListListener(p);
		p.columnRslt_note_typ.addAllListener(p);
		p.columnRslt_note_typ.setListListener(p);
		p.columnRslt_note_typ_nm.addAllListener(p);
		p.columnRslt_note_typ_nm.setListListener(p);
		p.columnRslt_note_rsn_cd.addAllListener(p);
		p.columnRslt_note_rsn_cd.setListListener(p);
		p.columnRslt_note_rsn_nm.addAllListener(p);
		p.columnRslt_note_rsn_nm.setListListener(p);
		p.columnRslt_draw_dt.addAllListener(p);
		p.columnRslt_draw_dt.setListListener(p);
		p.columnRslt_due_dt.addAllListener(p);
		p.columnRslt_due_dt.setListListener(p);
		p.columnRslt_note_days.addAllListener(p);
		p.columnRslt_note_days.setListListener(p);
		p.columnRslt_drawer_nm.addAllListener(p);
		p.columnRslt_drawer_nm.setListListener(p);
		p.columnRslt_draw_bank_cd.addAllListener(p);
		p.columnRslt_draw_bank_cd.setListListener(p);
		p.columnRslt_draw_bank_nm.addAllListener(p);
		p.columnRslt_draw_bank_nm.setListListener(p);
		p.columnRslt_draw_branch_cd.addAllListener(p);
		p.columnRslt_draw_branch_cd.setListListener(p);
		p.columnRslt_draw_branch_nm.addAllListener(p);
		p.columnRslt_draw_branch_nm.setListListener(p);
		p.columnRslt_endrsr.addAllListener(p);
		p.columnRslt_endrsr.setListListener(p);
		p.columnRslt_accptr.addAllListener(p);
		p.columnRslt_accptr.setListListener(p);
		p.columnRslt_trd_rmrks.addAllListener(p);
		p.columnRslt_trd_rmrks.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
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
	protected static void mcInitBtn(MSBHP_AdvPaySrch p) {
		p.Btn_open_MSBHP0070.addAllListener(p);
		p.Btn_open_MSBHP0070.setAPMethodName("doBtn_open_MSBHP0070");
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBHP_AdvPaySrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBHP_AdvPaySrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBHP_AdvPaySrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBHP_AdvPaySrch p){

	}

	/**
	 * [SRCH]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Psppl(MSBHP_AdvPaySrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MSBHP_AdvPaySrch p){

	}

	/**
	 * [SRCH]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Bsppl(MSBHP_AdvPaySrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBHP_AdvPaySrch p){
		p.Cnd_pay_act_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pay_act_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_psppl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bd_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bd_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pay_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pay_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pay_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pay_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_adv_pay_act_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_note_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_sttl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_sttl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_incl_appl_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_incl_can_red_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_psppl_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LPnl(MSBHP_AdvPaySrch p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBHP_AdvPaySrch p){

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBHP_AdvPaySrch p){
		p.RPnl_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBHP_AdvPaySrch p){
		p.columnRslt_psppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_act_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_adv_pay_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_adv_pay_act_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_adv_pay_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_com_paid_ap_sttl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_com_paid_ap_sttl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_com_paid_ap_sttl_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_com_paid_ap_sttl_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_ntc_adv_pay_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_com_paid_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_com_paid_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_exc_com_paid_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_setoff_tgt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_setoff_schd_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_setoff_act_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_not_proc_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_com_paid_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_com_paid_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_com_paid_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_exc_com_paid_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_setoff_tgt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_note_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_draw_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_days.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_drawer_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_endrsr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_accptr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_psppl_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
	protected static void statusInitSRCH_Btn(MSBHP_AdvPaySrch p){
		p.Btn_open_MSBHP0070.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBHP_AdvPaySrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBHP_AdvPaySrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBHP_AdvPaySrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBHP_AdvPaySrch p){

	}

	/**
	 * [REF]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Psppl(MSBHP_AdvPaySrch p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MSBHP_AdvPaySrch p){

	}

	/**
	 * [REF]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Bsppl(MSBHP_AdvPaySrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBHP_AdvPaySrch p){
		p.Cnd_pay_act_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_pay_act_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_psppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bd_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bd_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_pay_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_pay_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_pay_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_pay_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_adv_pay_act_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_note_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ap_sttl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ap_sttl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_incl_appl_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_incl_can_red_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_psppl_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_LPnl(MSBHP_AdvPaySrch p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBHP_AdvPaySrch p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBHP_AdvPaySrch p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBHP_AdvPaySrch p){
		p.columnRslt_psppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_act_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_adv_pay_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_adv_pay_act_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_adv_pay_act_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_com_paid_ap_sttl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_com_paid_ap_sttl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_com_paid_ap_sttl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_com_paid_ap_sttl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_ntc_adv_pay_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_com_paid_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_com_paid_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_exc_com_paid_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_setoff_tgt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_setoff_schd_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_setoff_act_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_not_proc_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_com_paid_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_com_paid_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_com_paid_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_exc_com_paid_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_setoff_tgt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_note_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_note_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_note_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_draw_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_note_days.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_drawer_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_endrsr.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_accptr.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_psppl_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
	protected static void statusInitREF_Btn(MSBHP_AdvPaySrch p){
		p.Btn_open_MSBHP0070.putMode(p, REF, MCMode.ENABLE);

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
		MSBHP_AdvPaySrch_MC.setTableConfigRslt((MSBHP_AdvPaySrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBHP_AdvPaySrch p) {
		p.columnRslt_psppl_cd.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.psppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_psppl_cd);
		p.columnRslt_psppl_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.psppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_psppl_nm);
		p.columnRslt_bsppl_cd.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.bsppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_cd);
		p.columnRslt_bsppl_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.bsppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_nm);
		p.columnRslt_bsppl_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.bsppl_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_dpt_cd);
		p.columnRslt_bsppl_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.bsppl_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_dpt_nm);
		p.columnRslt_bd_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.bd_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_dpt_cd);
		p.columnRslt_bd_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.bd_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_dpt_nm);
		p.columnRslt_pay_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.pay_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_dpt_cd);
		p.columnRslt_pay_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.pay_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_dpt_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_pay_usr_cd.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.pay_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_usr_cd);
		p.columnRslt_pay_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.pay_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_usr_nm);
		p.columnRslt_pay_act_dt.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.pay_act_dt_META);
		p.columnRslt_pay_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_act_dt);
		p.columnRslt_ac_dt.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.ac_dt_META);
		p.columnRslt_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_dt);
		p.columnRslt_ac_ym.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.ac_ym_META);
		p.columnRslt_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_ym);
		p.columnRslt_slip_sts_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.slip_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slip_sts_typ_nm);
		p.columnRslt_adv_pay_act_no.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.adv_pay_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_adv_pay_act_no);
		p.columnRslt_adv_pay_act_seq.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.adv_pay_act_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_adv_pay_act_seq);
		p.columnRslt_adv_pay_act_rev.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.adv_pay_act_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_adv_pay_act_rev);
		p.columnRslt_ap_sttl_cd.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.ap_sttl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_sttl_cd);
		p.columnRslt_ap_sttl_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.ap_sttl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_sttl_nm);
		p.columnRslt_ap_sttl_typ.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.ap_sttl_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_sttl_typ);
		p.columnRslt_ap_sttl_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.ap_sttl_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_sttl_typ_nm);
		p.columnRslt_com_paid_ap_sttl_cd.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.com_paid_ap_sttl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_com_paid_ap_sttl_cd);
		p.columnRslt_com_paid_ap_sttl_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.com_paid_ap_sttl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_com_paid_ap_sttl_nm);
		p.columnRslt_com_paid_ap_sttl_typ.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.com_paid_ap_sttl_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_com_paid_ap_sttl_typ);
		p.columnRslt_com_paid_ap_sttl_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.com_paid_ap_sttl_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_com_paid_ap_sttl_typ_nm);
		p.columnRslt_bank_ac_cd.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.bank_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_cd);
		p.columnRslt_bank_ac_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.bank_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_nm);
		p.columnRslt_pay_bank_ac_cd.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.pay_bank_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_bank_ac_cd);
		p.columnRslt_pay_bank_ac_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.pay_bank_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_bank_ac_nm);
		p.columnRslt_pay_ntc_adv_pay_flg.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.pay_ntc_adv_pay_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_ntc_adv_pay_flg);
		p.RsltTable.addTable(p.Rslt_trd_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_com_paid_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_com_paid_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_exc_com_paid_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_setoff_tgt_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_setoff_schd_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_setoff_act_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_not_proc_bal_p_PPanel.AmtTable);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_trd_cur_amt_dec_place.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.trd_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_amt_dec_place);
		p.columnRslt_trd_cur_com_paid_tax_cd.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.trd_cur_com_paid_tax_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_com_paid_tax_cd);
		p.columnRslt_trd_cur_com_paid_tax_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.trd_cur_com_paid_tax_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_com_paid_tax_nm);
		p.columnRslt_trd_cur_com_paid_tax_rate.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.trd_cur_com_paid_tax_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_com_paid_tax_rate);
		p.columnRslt_xrate_cd.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.xrate_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_cd);
		p.columnRslt_xrate.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate);
		p.RsltTable.addTable(p.Rslt_base_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_com_paid_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_com_paid_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_exc_com_paid_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_setoff_tgt_amt_p_PPanel.AmtTable);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.base_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_nm);
		p.columnRslt_base_cur_amt_dec_place.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.base_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_amt_dec_place);
		p.columnRslt_note_no.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.note_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_no);
		p.columnRslt_note_typ.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.note_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_typ);
		p.columnRslt_note_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.note_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_typ_nm);
		p.columnRslt_note_rsn_cd.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.note_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_rsn_cd);
		p.columnRslt_note_rsn_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.note_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_rsn_nm);
		p.columnRslt_draw_dt.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.draw_dt_META);
		p.columnRslt_draw_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_dt);
		p.columnRslt_due_dt.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.due_dt_META);
		p.columnRslt_due_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_due_dt);
		p.columnRslt_note_days.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.note_days_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_days);
		p.columnRslt_drawer_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.drawer_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_drawer_nm);
		p.columnRslt_draw_bank_cd.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.draw_bank_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_bank_cd);
		p.columnRslt_draw_bank_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.draw_bank_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_bank_nm);
		p.columnRslt_draw_branch_cd.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.draw_branch_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_branch_cd);
		p.columnRslt_draw_branch_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.draw_branch_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_branch_nm);
		p.columnRslt_endrsr.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.endrsr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_endrsr);
		p.columnRslt_accptr.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.accptr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_accptr);
		p.columnRslt_trd_rmrks.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_rmrks);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.RsltTable.addTable(p.Rslt_psppl_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_bsppl_grp_p_PPanel.BpGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBH.MSBHP0080.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_psppl_cd.getListConfig().setPutter(getCnd_psppl_cd_ListPutter());
		Cnd_bsppl_cd.getListConfig().setPutter(getCnd_bsppl_cd_ListPutter());
		Cnd_bsppl_dpt_cd.getListConfig().setPutter(getCnd_bsppl_dpt_cd_ListPutter());
		Cnd_bd_dpt_cd.getListConfig().setPutter(getCnd_bd_dpt_cd_ListPutter());
		Cnd_pay_dpt_cd.getListConfig().setPutter(getCnd_pay_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_pay_usr_cd.getListConfig().setPutter(getCnd_pay_usr_cd_ListPutter());
		Cnd_ap_sttl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ap_sttl_cd.getListConfig().setPutter(getCnd_ap_sttl_cd_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
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
	 * [Cnd_psppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_psppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_bsppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bsppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_bsppl_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bsppl_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_pay_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pay_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApWg");
		return lp;
	}
	 
	/**
	 * [Cnd_pay_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pay_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_ap_sttl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ap_sttl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApSttl");
		return lp;
	}
	 
	/**
	 * [Cnd_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_psppl_cd) return getCnd_psppl_cd(row, info);
		if(combo == Cnd_bsppl_cd) return getCnd_bsppl_cd(row, info);
		if(combo == Cnd_bsppl_dpt_cd) return getCnd_bsppl_dpt_cd(row, info);
		if(combo == Cnd_bd_dpt_cd) return getCnd_bd_dpt_cd(row, info);
		if(combo == Cnd_pay_dpt_cd) return getCnd_pay_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_pay_usr_cd) return getCnd_pay_usr_cd(row, info);
		if(combo == Cnd_ap_sttl_cd) return getCnd_ap_sttl_cd(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
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
		else if (ap == Btn_open_MSBHP0070) doBtn_open_MSBHP0070(info);
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
	 * [Btn]パネルの[open_MSBHP0070]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBHP0070(MCEventInfo info);

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
		if (vc == Cnd_pay_act_dt_fr) return doCnd_pay_act_dt_fr_VC(info);
		if (vc == Cnd_pay_act_dt_to) return doCnd_pay_act_dt_to_VC(info);
		if (vc == Cnd_ac_dt_fr) return doCnd_ac_dt_fr_VC(info);
		if (vc == Cnd_ac_dt_to) return doCnd_ac_dt_to_VC(info);
		if (vc == Cnd_psppl_cd) return doCnd_psppl_cd_VC(info);
		if (vc == Cnd_psppl_nm) return doCnd_psppl_nm_VC(info);
		if (vc == Cnd_bsppl_cd) return doCnd_bsppl_cd_VC(info);
		if (vc == Cnd_bsppl_nm) return doCnd_bsppl_nm_VC(info);
		if (vc == Cnd_bsppl_dpt_cd) return doCnd_bsppl_dpt_cd_VC(info);
		if (vc == Cnd_bsppl_dpt_nm) return doCnd_bsppl_dpt_nm_VC(info);
		if (vc == Cnd_bd_dpt_cd) return doCnd_bd_dpt_cd_VC(info);
		if (vc == Cnd_bd_dpt_nm) return doCnd_bd_dpt_nm_VC(info);
		if (vc == Cnd_pay_dpt_cd) return doCnd_pay_dpt_cd_VC(info);
		if (vc == Cnd_pay_dpt_nm) return doCnd_pay_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_pay_usr_cd) return doCnd_pay_usr_cd_VC(info);
		if (vc == Cnd_pay_usr_nm) return doCnd_pay_usr_nm_VC(info);
		if (vc == Cnd_adv_pay_act_no) return doCnd_adv_pay_act_no_VC(info);
		if (vc == Cnd_note_no) return doCnd_note_no_VC(info);
		if (vc == Cnd_ap_sttl_cd) return doCnd_ap_sttl_cd_VC(info);
		if (vc == Cnd_ap_sttl_nm) return doCnd_ap_sttl_nm_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_incl_appl_flg) return doCnd_incl_appl_flg_VC(info);
		if (vc == Cnd_incl_can_red_flg) return doCnd_incl_can_red_flg_VC(info);
		if (vc == Cnd_trd_rmrks) return doCnd_trd_rmrks_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == columnRslt_psppl_cd) return doRslt_psppl_cd_VC(info);
		if (vc == columnRslt_psppl_nm) return doRslt_psppl_nm_VC(info);
		if (vc == columnRslt_bsppl_cd) return doRslt_bsppl_cd_VC(info);
		if (vc == columnRslt_bsppl_nm) return doRslt_bsppl_nm_VC(info);
		if (vc == columnRslt_bsppl_dpt_cd) return doRslt_bsppl_dpt_cd_VC(info);
		if (vc == columnRslt_bsppl_dpt_nm) return doRslt_bsppl_dpt_nm_VC(info);
		if (vc == columnRslt_bd_dpt_cd) return doRslt_bd_dpt_cd_VC(info);
		if (vc == columnRslt_bd_dpt_nm) return doRslt_bd_dpt_nm_VC(info);
		if (vc == columnRslt_pay_dpt_cd) return doRslt_pay_dpt_cd_VC(info);
		if (vc == columnRslt_pay_dpt_nm) return doRslt_pay_dpt_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_pay_usr_cd) return doRslt_pay_usr_cd_VC(info);
		if (vc == columnRslt_pay_usr_nm) return doRslt_pay_usr_nm_VC(info);
		if (vc == columnRslt_pay_act_dt) return doRslt_pay_act_dt_VC(info);
		if (vc == columnRslt_ac_dt) return doRslt_ac_dt_VC(info);
		if (vc == columnRslt_ac_ym) return doRslt_ac_ym_VC(info);
		if (vc == columnRslt_slip_sts_typ_nm) return doRslt_slip_sts_typ_nm_VC(info);
		if (vc == columnRslt_adv_pay_act_no) return doRslt_adv_pay_act_no_VC(info);
		if (vc == columnRslt_adv_pay_act_seq) return doRslt_adv_pay_act_seq_VC(info);
		if (vc == columnRslt_adv_pay_act_rev) return doRslt_adv_pay_act_rev_VC(info);
		if (vc == columnRslt_ap_sttl_cd) return doRslt_ap_sttl_cd_VC(info);
		if (vc == columnRslt_ap_sttl_nm) return doRslt_ap_sttl_nm_VC(info);
		if (vc == columnRslt_ap_sttl_typ) return doRslt_ap_sttl_typ_VC(info);
		if (vc == columnRslt_ap_sttl_typ_nm) return doRslt_ap_sttl_typ_nm_VC(info);
		if (vc == columnRslt_com_paid_ap_sttl_cd) return doRslt_com_paid_ap_sttl_cd_VC(info);
		if (vc == columnRslt_com_paid_ap_sttl_nm) return doRslt_com_paid_ap_sttl_nm_VC(info);
		if (vc == columnRslt_com_paid_ap_sttl_typ) return doRslt_com_paid_ap_sttl_typ_VC(info);
		if (vc == columnRslt_com_paid_ap_sttl_typ_nm) return doRslt_com_paid_ap_sttl_typ_nm_VC(info);
		if (vc == columnRslt_bank_ac_cd) return doRslt_bank_ac_cd_VC(info);
		if (vc == columnRslt_bank_ac_nm) return doRslt_bank_ac_nm_VC(info);
		if (vc == columnRslt_pay_bank_ac_cd) return doRslt_pay_bank_ac_cd_VC(info);
		if (vc == columnRslt_pay_bank_ac_nm) return doRslt_pay_bank_ac_nm_VC(info);
		if (vc == columnRslt_pay_ntc_adv_pay_flg) return doRslt_pay_ntc_adv_pay_flg_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_trd_cur_amt_dec_place) return doRslt_trd_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_trd_cur_com_paid_tax_cd) return doRslt_trd_cur_com_paid_tax_cd_VC(info);
		if (vc == columnRslt_trd_cur_com_paid_tax_nm) return doRslt_trd_cur_com_paid_tax_nm_VC(info);
		if (vc == columnRslt_trd_cur_com_paid_tax_rate) return doRslt_trd_cur_com_paid_tax_rate_VC(info);
		if (vc == columnRslt_xrate_cd) return doRslt_xrate_cd_VC(info);
		if (vc == columnRslt_xrate) return doRslt_xrate_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_nm) return doRslt_base_cur_nm_VC(info);
		if (vc == columnRslt_base_cur_amt_dec_place) return doRslt_base_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_note_no) return doRslt_note_no_VC(info);
		if (vc == columnRslt_note_typ) return doRslt_note_typ_VC(info);
		if (vc == columnRslt_note_typ_nm) return doRslt_note_typ_nm_VC(info);
		if (vc == columnRslt_note_rsn_cd) return doRslt_note_rsn_cd_VC(info);
		if (vc == columnRslt_note_rsn_nm) return doRslt_note_rsn_nm_VC(info);
		if (vc == columnRslt_draw_dt) return doRslt_draw_dt_VC(info);
		if (vc == columnRslt_due_dt) return doRslt_due_dt_VC(info);
		if (vc == columnRslt_note_days) return doRslt_note_days_VC(info);
		if (vc == columnRslt_drawer_nm) return doRslt_drawer_nm_VC(info);
		if (vc == columnRslt_draw_bank_cd) return doRslt_draw_bank_cd_VC(info);
		if (vc == columnRslt_draw_bank_nm) return doRslt_draw_bank_nm_VC(info);
		if (vc == columnRslt_draw_branch_cd) return doRslt_draw_branch_cd_VC(info);
		if (vc == columnRslt_draw_branch_nm) return doRslt_draw_branch_nm_VC(info);
		if (vc == columnRslt_endrsr) return doRslt_endrsr_VC(info);
		if (vc == columnRslt_accptr) return doRslt_accptr_VC(info);
		if (vc == columnRslt_trd_rmrks) return doRslt_trd_rmrks_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
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
	 * [Cnd]パネルの[pay_act_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_act_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_act_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[psppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_psppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[psppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_psppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[adv_pay_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_adv_pay_act_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ap_sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[incl_appl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_incl_appl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[incl_can_red_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_incl_can_red_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_intr_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[psppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_psppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[psppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_psppl_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_dpt_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_act_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_ym_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[adv_pay_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_adv_pay_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_adv_pay_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_adv_pay_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_sttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_sttl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[com_paid_ap_sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_com_paid_ap_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[com_paid_ap_sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_com_paid_ap_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[com_paid_ap_sttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_com_paid_ap_sttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[com_paid_ap_sttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_com_paid_ap_sttl_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_ntc_adv_pay_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_ntc_adv_pay_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_com_paid_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_com_paid_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_com_paid_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[note_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_days_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_intr_rmrks_VC(MCEventInfo info){
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
		else if (nc == Cnd_pay_act_dt_fr) doCnd_pay_act_dt_fr_NC(info);
		else if (nc == Cnd_pay_act_dt_to) doCnd_pay_act_dt_to_NC(info);
		else if (nc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NC(info);
		else if (nc == Cnd_ac_dt_to) doCnd_ac_dt_to_NC(info);
		else if (nc == Cnd_psppl_cd) doCnd_psppl_cd_NC(info);
		else if (nc == Cnd_psppl_nm) doCnd_psppl_nm_NC(info);
		else if (nc == Cnd_bsppl_cd) doCnd_bsppl_cd_NC(info);
		else if (nc == Cnd_bsppl_nm) doCnd_bsppl_nm_NC(info);
		else if (nc == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NC(info);
		else if (nc == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NC(info);
		else if (nc == Cnd_bd_dpt_cd) doCnd_bd_dpt_cd_NC(info);
		else if (nc == Cnd_bd_dpt_nm) doCnd_bd_dpt_nm_NC(info);
		else if (nc == Cnd_pay_dpt_cd) doCnd_pay_dpt_cd_NC(info);
		else if (nc == Cnd_pay_dpt_nm) doCnd_pay_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_pay_usr_cd) doCnd_pay_usr_cd_NC(info);
		else if (nc == Cnd_pay_usr_nm) doCnd_pay_usr_nm_NC(info);
		else if (nc == Cnd_adv_pay_act_no) doCnd_adv_pay_act_no_NC(info);
		else if (nc == Cnd_note_no) doCnd_note_no_NC(info);
		else if (nc == Cnd_ap_sttl_cd) doCnd_ap_sttl_cd_NC(info);
		else if (nc == Cnd_ap_sttl_nm) doCnd_ap_sttl_nm_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_incl_appl_flg) doCnd_incl_appl_flg_NC(info);
		else if (nc == Cnd_incl_can_red_flg) doCnd_incl_can_red_flg_NC(info);
		else if (nc == Cnd_trd_rmrks) doCnd_trd_rmrks_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == columnRslt_psppl_cd) doRslt_psppl_cd_NC(info);
		else if (nc == columnRslt_psppl_nm) doRslt_psppl_nm_NC(info);
		else if (nc == columnRslt_bsppl_cd) doRslt_bsppl_cd_NC(info);
		else if (nc == columnRslt_bsppl_nm) doRslt_bsppl_nm_NC(info);
		else if (nc == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_NC(info);
		else if (nc == columnRslt_bsppl_dpt_nm) doRslt_bsppl_dpt_nm_NC(info);
		else if (nc == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NC(info);
		else if (nc == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NC(info);
		else if (nc == columnRslt_pay_dpt_cd) doRslt_pay_dpt_cd_NC(info);
		else if (nc == columnRslt_pay_dpt_nm) doRslt_pay_dpt_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_pay_usr_cd) doRslt_pay_usr_cd_NC(info);
		else if (nc == columnRslt_pay_usr_nm) doRslt_pay_usr_nm_NC(info);
		else if (nc == columnRslt_pay_act_dt) doRslt_pay_act_dt_NC(info);
		else if (nc == columnRslt_ac_dt) doRslt_ac_dt_NC(info);
		else if (nc == columnRslt_ac_ym) doRslt_ac_ym_NC(info);
		else if (nc == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_NC(info);
		else if (nc == columnRslt_adv_pay_act_no) doRslt_adv_pay_act_no_NC(info);
		else if (nc == columnRslt_adv_pay_act_seq) doRslt_adv_pay_act_seq_NC(info);
		else if (nc == columnRslt_adv_pay_act_rev) doRslt_adv_pay_act_rev_NC(info);
		else if (nc == columnRslt_ap_sttl_cd) doRslt_ap_sttl_cd_NC(info);
		else if (nc == columnRslt_ap_sttl_nm) doRslt_ap_sttl_nm_NC(info);
		else if (nc == columnRslt_ap_sttl_typ) doRslt_ap_sttl_typ_NC(info);
		else if (nc == columnRslt_ap_sttl_typ_nm) doRslt_ap_sttl_typ_nm_NC(info);
		else if (nc == columnRslt_com_paid_ap_sttl_cd) doRslt_com_paid_ap_sttl_cd_NC(info);
		else if (nc == columnRslt_com_paid_ap_sttl_nm) doRslt_com_paid_ap_sttl_nm_NC(info);
		else if (nc == columnRslt_com_paid_ap_sttl_typ) doRslt_com_paid_ap_sttl_typ_NC(info);
		else if (nc == columnRslt_com_paid_ap_sttl_typ_nm) doRslt_com_paid_ap_sttl_typ_nm_NC(info);
		else if (nc == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NC(info);
		else if (nc == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NC(info);
		else if (nc == columnRslt_pay_bank_ac_cd) doRslt_pay_bank_ac_cd_NC(info);
		else if (nc == columnRslt_pay_bank_ac_nm) doRslt_pay_bank_ac_nm_NC(info);
		else if (nc == columnRslt_pay_ntc_adv_pay_flg) doRslt_pay_ntc_adv_pay_flg_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_trd_cur_com_paid_tax_cd) doRslt_trd_cur_com_paid_tax_cd_NC(info);
		else if (nc == columnRslt_trd_cur_com_paid_tax_nm) doRslt_trd_cur_com_paid_tax_nm_NC(info);
		else if (nc == columnRslt_trd_cur_com_paid_tax_rate) doRslt_trd_cur_com_paid_tax_rate_NC(info);
		else if (nc == columnRslt_xrate_cd) doRslt_xrate_cd_NC(info);
		else if (nc == columnRslt_xrate) doRslt_xrate_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_nm) doRslt_base_cur_nm_NC(info);
		else if (nc == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_note_no) doRslt_note_no_NC(info);
		else if (nc == columnRslt_note_typ) doRslt_note_typ_NC(info);
		else if (nc == columnRslt_note_typ_nm) doRslt_note_typ_nm_NC(info);
		else if (nc == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_NC(info);
		else if (nc == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_NC(info);
		else if (nc == columnRslt_draw_dt) doRslt_draw_dt_NC(info);
		else if (nc == columnRslt_due_dt) doRslt_due_dt_NC(info);
		else if (nc == columnRslt_note_days) doRslt_note_days_NC(info);
		else if (nc == columnRslt_drawer_nm) doRslt_drawer_nm_NC(info);
		else if (nc == columnRslt_draw_bank_cd) doRslt_draw_bank_cd_NC(info);
		else if (nc == columnRslt_draw_bank_nm) doRslt_draw_bank_nm_NC(info);
		else if (nc == columnRslt_draw_branch_cd) doRslt_draw_branch_cd_NC(info);
		else if (nc == columnRslt_draw_branch_nm) doRslt_draw_branch_nm_NC(info);
		else if (nc == columnRslt_endrsr) doRslt_endrsr_NC(info);
		else if (nc == columnRslt_accptr) doRslt_accptr_NC(info);
		else if (nc == columnRslt_trd_rmrks) doRslt_trd_rmrks_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
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
	 * [Cnd]パネルの[pay_act_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[psppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_pay_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_pay_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[incl_appl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_appl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[incl_can_red_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_can_red_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[psppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_pay_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_pay_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_pay_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_ap_sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_ap_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_ap_sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_ap_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_ap_sttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_ap_sttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_ap_sttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_ap_sttl_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_ntc_adv_pay_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_ntc_adv_pay_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[note_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_days_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NC(MCEventInfo info){
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
		else if (ne == Cnd_pay_act_dt_fr) doCnd_pay_act_dt_fr_NE(info);
		else if (ne == Cnd_pay_act_dt_to) doCnd_pay_act_dt_to_NE(info);
		else if (ne == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NE(info);
		else if (ne == Cnd_ac_dt_to) doCnd_ac_dt_to_NE(info);
		else if (ne == Cnd_psppl_cd) doCnd_psppl_cd_NE(info);
		else if (ne == Cnd_psppl_nm) doCnd_psppl_nm_NE(info);
		else if (ne == Cnd_bsppl_cd) doCnd_bsppl_cd_NE(info);
		else if (ne == Cnd_bsppl_nm) doCnd_bsppl_nm_NE(info);
		else if (ne == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NE(info);
		else if (ne == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NE(info);
		else if (ne == Cnd_bd_dpt_cd) doCnd_bd_dpt_cd_NE(info);
		else if (ne == Cnd_bd_dpt_nm) doCnd_bd_dpt_nm_NE(info);
		else if (ne == Cnd_pay_dpt_cd) doCnd_pay_dpt_cd_NE(info);
		else if (ne == Cnd_pay_dpt_nm) doCnd_pay_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_pay_usr_cd) doCnd_pay_usr_cd_NE(info);
		else if (ne == Cnd_pay_usr_nm) doCnd_pay_usr_nm_NE(info);
		else if (ne == Cnd_adv_pay_act_no) doCnd_adv_pay_act_no_NE(info);
		else if (ne == Cnd_note_no) doCnd_note_no_NE(info);
		else if (ne == Cnd_ap_sttl_cd) doCnd_ap_sttl_cd_NE(info);
		else if (ne == Cnd_ap_sttl_nm) doCnd_ap_sttl_nm_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_incl_appl_flg) doCnd_incl_appl_flg_NE(info);
		else if (ne == Cnd_incl_can_red_flg) doCnd_incl_can_red_flg_NE(info);
		else if (ne == Cnd_trd_rmrks) doCnd_trd_rmrks_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == columnRslt_psppl_cd) doRslt_psppl_cd_NE(info);
		else if (ne == columnRslt_psppl_nm) doRslt_psppl_nm_NE(info);
		else if (ne == columnRslt_bsppl_cd) doRslt_bsppl_cd_NE(info);
		else if (ne == columnRslt_bsppl_nm) doRslt_bsppl_nm_NE(info);
		else if (ne == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_NE(info);
		else if (ne == columnRslt_bsppl_dpt_nm) doRslt_bsppl_dpt_nm_NE(info);
		else if (ne == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NE(info);
		else if (ne == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NE(info);
		else if (ne == columnRslt_pay_dpt_cd) doRslt_pay_dpt_cd_NE(info);
		else if (ne == columnRslt_pay_dpt_nm) doRslt_pay_dpt_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_pay_usr_cd) doRslt_pay_usr_cd_NE(info);
		else if (ne == columnRslt_pay_usr_nm) doRslt_pay_usr_nm_NE(info);
		else if (ne == columnRslt_pay_act_dt) doRslt_pay_act_dt_NE(info);
		else if (ne == columnRslt_ac_dt) doRslt_ac_dt_NE(info);
		else if (ne == columnRslt_ac_ym) doRslt_ac_ym_NE(info);
		else if (ne == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_NE(info);
		else if (ne == columnRslt_adv_pay_act_no) doRslt_adv_pay_act_no_NE(info);
		else if (ne == columnRslt_adv_pay_act_seq) doRslt_adv_pay_act_seq_NE(info);
		else if (ne == columnRslt_adv_pay_act_rev) doRslt_adv_pay_act_rev_NE(info);
		else if (ne == columnRslt_ap_sttl_cd) doRslt_ap_sttl_cd_NE(info);
		else if (ne == columnRslt_ap_sttl_nm) doRslt_ap_sttl_nm_NE(info);
		else if (ne == columnRslt_ap_sttl_typ) doRslt_ap_sttl_typ_NE(info);
		else if (ne == columnRslt_ap_sttl_typ_nm) doRslt_ap_sttl_typ_nm_NE(info);
		else if (ne == columnRslt_com_paid_ap_sttl_cd) doRslt_com_paid_ap_sttl_cd_NE(info);
		else if (ne == columnRslt_com_paid_ap_sttl_nm) doRslt_com_paid_ap_sttl_nm_NE(info);
		else if (ne == columnRslt_com_paid_ap_sttl_typ) doRslt_com_paid_ap_sttl_typ_NE(info);
		else if (ne == columnRslt_com_paid_ap_sttl_typ_nm) doRslt_com_paid_ap_sttl_typ_nm_NE(info);
		else if (ne == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NE(info);
		else if (ne == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NE(info);
		else if (ne == columnRslt_pay_bank_ac_cd) doRslt_pay_bank_ac_cd_NE(info);
		else if (ne == columnRslt_pay_bank_ac_nm) doRslt_pay_bank_ac_nm_NE(info);
		else if (ne == columnRslt_pay_ntc_adv_pay_flg) doRslt_pay_ntc_adv_pay_flg_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_trd_cur_com_paid_tax_cd) doRslt_trd_cur_com_paid_tax_cd_NE(info);
		else if (ne == columnRslt_trd_cur_com_paid_tax_nm) doRslt_trd_cur_com_paid_tax_nm_NE(info);
		else if (ne == columnRslt_trd_cur_com_paid_tax_rate) doRslt_trd_cur_com_paid_tax_rate_NE(info);
		else if (ne == columnRslt_xrate_cd) doRslt_xrate_cd_NE(info);
		else if (ne == columnRslt_xrate) doRslt_xrate_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_nm) doRslt_base_cur_nm_NE(info);
		else if (ne == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_note_no) doRslt_note_no_NE(info);
		else if (ne == columnRslt_note_typ) doRslt_note_typ_NE(info);
		else if (ne == columnRslt_note_typ_nm) doRslt_note_typ_nm_NE(info);
		else if (ne == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_NE(info);
		else if (ne == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_NE(info);
		else if (ne == columnRslt_draw_dt) doRslt_draw_dt_NE(info);
		else if (ne == columnRslt_due_dt) doRslt_due_dt_NE(info);
		else if (ne == columnRslt_note_days) doRslt_note_days_NE(info);
		else if (ne == columnRslt_drawer_nm) doRslt_drawer_nm_NE(info);
		else if (ne == columnRslt_draw_bank_cd) doRslt_draw_bank_cd_NE(info);
		else if (ne == columnRslt_draw_bank_nm) doRslt_draw_bank_nm_NE(info);
		else if (ne == columnRslt_draw_branch_cd) doRslt_draw_branch_cd_NE(info);
		else if (ne == columnRslt_draw_branch_nm) doRslt_draw_branch_nm_NE(info);
		else if (ne == columnRslt_endrsr) doRslt_endrsr_NE(info);
		else if (ne == columnRslt_accptr) doRslt_accptr_NE(info);
		else if (ne == columnRslt_trd_rmrks) doRslt_trd_rmrks_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
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
	 * [Cnd]パネルの[pay_act_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[psppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_pay_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_pay_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[incl_appl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_appl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[incl_can_red_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_can_red_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[psppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_pay_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_pay_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_pay_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_ap_sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_ap_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_ap_sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_ap_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_ap_sttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_ap_sttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_ap_sttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_ap_sttl_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_ntc_adv_pay_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_ntc_adv_pay_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[note_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_days_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NE(MCEventInfo info){
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
		else if (nx == Cnd_pay_act_dt_fr) doCnd_pay_act_dt_fr_NX(info);
		else if (nx == Cnd_pay_act_dt_to) doCnd_pay_act_dt_to_NX(info);
		else if (nx == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NX(info);
		else if (nx == Cnd_ac_dt_to) doCnd_ac_dt_to_NX(info);
		else if (nx == Cnd_psppl_cd) doCnd_psppl_cd_NX(info);
		else if (nx == Cnd_psppl_nm) doCnd_psppl_nm_NX(info);
		else if (nx == Cnd_bsppl_cd) doCnd_bsppl_cd_NX(info);
		else if (nx == Cnd_bsppl_nm) doCnd_bsppl_nm_NX(info);
		else if (nx == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NX(info);
		else if (nx == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NX(info);
		else if (nx == Cnd_bd_dpt_cd) doCnd_bd_dpt_cd_NX(info);
		else if (nx == Cnd_bd_dpt_nm) doCnd_bd_dpt_nm_NX(info);
		else if (nx == Cnd_pay_dpt_cd) doCnd_pay_dpt_cd_NX(info);
		else if (nx == Cnd_pay_dpt_nm) doCnd_pay_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_pay_usr_cd) doCnd_pay_usr_cd_NX(info);
		else if (nx == Cnd_pay_usr_nm) doCnd_pay_usr_nm_NX(info);
		else if (nx == Cnd_adv_pay_act_no) doCnd_adv_pay_act_no_NX(info);
		else if (nx == Cnd_note_no) doCnd_note_no_NX(info);
		else if (nx == Cnd_ap_sttl_cd) doCnd_ap_sttl_cd_NX(info);
		else if (nx == Cnd_ap_sttl_nm) doCnd_ap_sttl_nm_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_incl_appl_flg) doCnd_incl_appl_flg_NX(info);
		else if (nx == Cnd_incl_can_red_flg) doCnd_incl_can_red_flg_NX(info);
		else if (nx == Cnd_trd_rmrks) doCnd_trd_rmrks_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == columnRslt_psppl_cd) doRslt_psppl_cd_NX(info);
		else if (nx == columnRslt_psppl_nm) doRslt_psppl_nm_NX(info);
		else if (nx == columnRslt_bsppl_cd) doRslt_bsppl_cd_NX(info);
		else if (nx == columnRslt_bsppl_nm) doRslt_bsppl_nm_NX(info);
		else if (nx == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_NX(info);
		else if (nx == columnRslt_bsppl_dpt_nm) doRslt_bsppl_dpt_nm_NX(info);
		else if (nx == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NX(info);
		else if (nx == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NX(info);
		else if (nx == columnRslt_pay_dpt_cd) doRslt_pay_dpt_cd_NX(info);
		else if (nx == columnRslt_pay_dpt_nm) doRslt_pay_dpt_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_pay_usr_cd) doRslt_pay_usr_cd_NX(info);
		else if (nx == columnRslt_pay_usr_nm) doRslt_pay_usr_nm_NX(info);
		else if (nx == columnRslt_pay_act_dt) doRslt_pay_act_dt_NX(info);
		else if (nx == columnRslt_ac_dt) doRslt_ac_dt_NX(info);
		else if (nx == columnRslt_ac_ym) doRslt_ac_ym_NX(info);
		else if (nx == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_NX(info);
		else if (nx == columnRslt_adv_pay_act_no) doRslt_adv_pay_act_no_NX(info);
		else if (nx == columnRslt_adv_pay_act_seq) doRslt_adv_pay_act_seq_NX(info);
		else if (nx == columnRslt_adv_pay_act_rev) doRslt_adv_pay_act_rev_NX(info);
		else if (nx == columnRslt_ap_sttl_cd) doRslt_ap_sttl_cd_NX(info);
		else if (nx == columnRslt_ap_sttl_nm) doRslt_ap_sttl_nm_NX(info);
		else if (nx == columnRslt_ap_sttl_typ) doRslt_ap_sttl_typ_NX(info);
		else if (nx == columnRslt_ap_sttl_typ_nm) doRslt_ap_sttl_typ_nm_NX(info);
		else if (nx == columnRslt_com_paid_ap_sttl_cd) doRslt_com_paid_ap_sttl_cd_NX(info);
		else if (nx == columnRslt_com_paid_ap_sttl_nm) doRslt_com_paid_ap_sttl_nm_NX(info);
		else if (nx == columnRslt_com_paid_ap_sttl_typ) doRslt_com_paid_ap_sttl_typ_NX(info);
		else if (nx == columnRslt_com_paid_ap_sttl_typ_nm) doRslt_com_paid_ap_sttl_typ_nm_NX(info);
		else if (nx == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NX(info);
		else if (nx == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NX(info);
		else if (nx == columnRslt_pay_bank_ac_cd) doRslt_pay_bank_ac_cd_NX(info);
		else if (nx == columnRslt_pay_bank_ac_nm) doRslt_pay_bank_ac_nm_NX(info);
		else if (nx == columnRslt_pay_ntc_adv_pay_flg) doRslt_pay_ntc_adv_pay_flg_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_trd_cur_com_paid_tax_cd) doRslt_trd_cur_com_paid_tax_cd_NX(info);
		else if (nx == columnRslt_trd_cur_com_paid_tax_nm) doRslt_trd_cur_com_paid_tax_nm_NX(info);
		else if (nx == columnRslt_trd_cur_com_paid_tax_rate) doRslt_trd_cur_com_paid_tax_rate_NX(info);
		else if (nx == columnRslt_xrate_cd) doRslt_xrate_cd_NX(info);
		else if (nx == columnRslt_xrate) doRslt_xrate_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_nm) doRslt_base_cur_nm_NX(info);
		else if (nx == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_note_no) doRslt_note_no_NX(info);
		else if (nx == columnRslt_note_typ) doRslt_note_typ_NX(info);
		else if (nx == columnRslt_note_typ_nm) doRslt_note_typ_nm_NX(info);
		else if (nx == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_NX(info);
		else if (nx == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_NX(info);
		else if (nx == columnRslt_draw_dt) doRslt_draw_dt_NX(info);
		else if (nx == columnRslt_due_dt) doRslt_due_dt_NX(info);
		else if (nx == columnRslt_note_days) doRslt_note_days_NX(info);
		else if (nx == columnRslt_drawer_nm) doRslt_drawer_nm_NX(info);
		else if (nx == columnRslt_draw_bank_cd) doRslt_draw_bank_cd_NX(info);
		else if (nx == columnRslt_draw_bank_nm) doRslt_draw_bank_nm_NX(info);
		else if (nx == columnRslt_draw_branch_cd) doRslt_draw_branch_cd_NX(info);
		else if (nx == columnRslt_draw_branch_nm) doRslt_draw_branch_nm_NX(info);
		else if (nx == columnRslt_endrsr) doRslt_endrsr_NX(info);
		else if (nx == columnRslt_accptr) doRslt_accptr_NX(info);
		else if (nx == columnRslt_trd_rmrks) doRslt_trd_rmrks_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
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
	 * [Cnd]パネルの[pay_act_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[psppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_pay_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_pay_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[incl_appl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_appl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[incl_can_red_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_can_red_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[psppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_pay_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_pay_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_pay_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_ap_sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_ap_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_ap_sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_ap_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_ap_sttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_ap_sttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_ap_sttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_ap_sttl_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_ntc_adv_pay_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_ntc_adv_pay_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[note_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_days_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NX(MCEventInfo info){
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
		if (lc == Cnd_pay_act_dt_fr) doCnd_pay_act_dt_fr_LC(info);
		else if (lc == Cnd_pay_act_dt_to) doCnd_pay_act_dt_to_LC(info);
		else if (lc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_LC(info);
		else if (lc == Cnd_ac_dt_to) doCnd_ac_dt_to_LC(info);
		else if (lc == Cnd_psppl_cd) doCnd_psppl_cd_LC(info);
		else if (lc == Cnd_psppl_nm) doCnd_psppl_nm_LC(info);
		else if (lc == Cnd_bsppl_cd) doCnd_bsppl_cd_LC(info);
		else if (lc == Cnd_bsppl_nm) doCnd_bsppl_nm_LC(info);
		else if (lc == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_LC(info);
		else if (lc == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_LC(info);
		else if (lc == Cnd_bd_dpt_cd) doCnd_bd_dpt_cd_LC(info);
		else if (lc == Cnd_bd_dpt_nm) doCnd_bd_dpt_nm_LC(info);
		else if (lc == Cnd_pay_dpt_cd) doCnd_pay_dpt_cd_LC(info);
		else if (lc == Cnd_pay_dpt_nm) doCnd_pay_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_pay_usr_cd) doCnd_pay_usr_cd_LC(info);
		else if (lc == Cnd_pay_usr_nm) doCnd_pay_usr_nm_LC(info);
		else if (lc == Cnd_adv_pay_act_no) doCnd_adv_pay_act_no_LC(info);
		else if (lc == Cnd_note_no) doCnd_note_no_LC(info);
		else if (lc == Cnd_ap_sttl_cd) doCnd_ap_sttl_cd_LC(info);
		else if (lc == Cnd_ap_sttl_nm) doCnd_ap_sttl_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_trd_rmrks) doCnd_trd_rmrks_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == columnRslt_psppl_cd) doRslt_psppl_cd_LC(info);
		else if (lc == columnRslt_psppl_nm) doRslt_psppl_nm_LC(info);
		else if (lc == columnRslt_bsppl_cd) doRslt_bsppl_cd_LC(info);
		else if (lc == columnRslt_bsppl_nm) doRslt_bsppl_nm_LC(info);
		else if (lc == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_LC(info);
		else if (lc == columnRslt_bsppl_dpt_nm) doRslt_bsppl_dpt_nm_LC(info);
		else if (lc == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_LC(info);
		else if (lc == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_LC(info);
		else if (lc == columnRslt_pay_dpt_cd) doRslt_pay_dpt_cd_LC(info);
		else if (lc == columnRslt_pay_dpt_nm) doRslt_pay_dpt_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_pay_usr_cd) doRslt_pay_usr_cd_LC(info);
		else if (lc == columnRslt_pay_usr_nm) doRslt_pay_usr_nm_LC(info);
		else if (lc == columnRslt_pay_act_dt) doRslt_pay_act_dt_LC(info);
		else if (lc == columnRslt_ac_dt) doRslt_ac_dt_LC(info);
		else if (lc == columnRslt_ac_ym) doRslt_ac_ym_LC(info);
		else if (lc == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_LC(info);
		else if (lc == columnRslt_adv_pay_act_no) doRslt_adv_pay_act_no_LC(info);
		else if (lc == columnRslt_adv_pay_act_seq) doRslt_adv_pay_act_seq_LC(info);
		else if (lc == columnRslt_adv_pay_act_rev) doRslt_adv_pay_act_rev_LC(info);
		else if (lc == columnRslt_ap_sttl_cd) doRslt_ap_sttl_cd_LC(info);
		else if (lc == columnRslt_ap_sttl_nm) doRslt_ap_sttl_nm_LC(info);
		else if (lc == columnRslt_ap_sttl_typ) doRslt_ap_sttl_typ_LC(info);
		else if (lc == columnRslt_ap_sttl_typ_nm) doRslt_ap_sttl_typ_nm_LC(info);
		else if (lc == columnRslt_com_paid_ap_sttl_cd) doRslt_com_paid_ap_sttl_cd_LC(info);
		else if (lc == columnRslt_com_paid_ap_sttl_nm) doRslt_com_paid_ap_sttl_nm_LC(info);
		else if (lc == columnRslt_com_paid_ap_sttl_typ) doRslt_com_paid_ap_sttl_typ_LC(info);
		else if (lc == columnRslt_com_paid_ap_sttl_typ_nm) doRslt_com_paid_ap_sttl_typ_nm_LC(info);
		else if (lc == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_LC(info);
		else if (lc == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_LC(info);
		else if (lc == columnRslt_pay_bank_ac_cd) doRslt_pay_bank_ac_cd_LC(info);
		else if (lc == columnRslt_pay_bank_ac_nm) doRslt_pay_bank_ac_nm_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_trd_cur_com_paid_tax_cd) doRslt_trd_cur_com_paid_tax_cd_LC(info);
		else if (lc == columnRslt_trd_cur_com_paid_tax_nm) doRslt_trd_cur_com_paid_tax_nm_LC(info);
		else if (lc == columnRslt_trd_cur_com_paid_tax_rate) doRslt_trd_cur_com_paid_tax_rate_LC(info);
		else if (lc == columnRslt_xrate_cd) doRslt_xrate_cd_LC(info);
		else if (lc == columnRslt_xrate) doRslt_xrate_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_nm) doRslt_base_cur_nm_LC(info);
		else if (lc == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_note_no) doRslt_note_no_LC(info);
		else if (lc == columnRslt_note_typ) doRslt_note_typ_LC(info);
		else if (lc == columnRslt_note_typ_nm) doRslt_note_typ_nm_LC(info);
		else if (lc == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_LC(info);
		else if (lc == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_LC(info);
		else if (lc == columnRslt_draw_dt) doRslt_draw_dt_LC(info);
		else if (lc == columnRslt_due_dt) doRslt_due_dt_LC(info);
		else if (lc == columnRslt_note_days) doRslt_note_days_LC(info);
		else if (lc == columnRslt_drawer_nm) doRslt_drawer_nm_LC(info);
		else if (lc == columnRslt_draw_bank_cd) doRslt_draw_bank_cd_LC(info);
		else if (lc == columnRslt_draw_bank_nm) doRslt_draw_bank_nm_LC(info);
		else if (lc == columnRslt_draw_branch_cd) doRslt_draw_branch_cd_LC(info);
		else if (lc == columnRslt_draw_branch_nm) doRslt_draw_branch_nm_LC(info);
		else if (lc == columnRslt_endrsr) doRslt_endrsr_LC(info);
		else if (lc == columnRslt_accptr) doRslt_accptr_LC(info);
		else if (lc == columnRslt_trd_rmrks) doRslt_trd_rmrks_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
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
	 * [Cnd]パネルの[pay_act_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[psppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_pay_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_pay_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[psppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_pay_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_pay_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_pay_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_ap_sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_ap_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_ap_sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_ap_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_ap_sttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_ap_sttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_ap_sttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_ap_sttl_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[note_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_days_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_psppl_cd]の作成メソッド
	 */
	public MCList getCnd_psppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bsppl_cd]の作成メソッド
	 */
	public MCList getCnd_bsppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bsppl_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_bsppl_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pay_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_pay_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pay_usr_cd]の作成メソッド
	 */
	public MCList getCnd_pay_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ap_sttl_cd]の作成メソッド
	 */
	public MCList getCnd_ap_sttl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApSttl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBHL0080.Srch01")) {
			return new MS_MSBHL0080_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBHL0080_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0080_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0080_Srch01;

		/** コンストラクタ */
		protected MS_MSBHL0080_Srch01Bridge() {
			p_MS_MSBHL0080_Srch01 = new MCParam(PDef.MS_MSBHL0080_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0080_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBH.MSBHP0080.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0080.RsltR.class));

			p_MS_MSBHL0080_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0080_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0080_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0080_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0080_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBH.MSBHP0080.CndR up0() {
			return (mcframe.clientMSBH.MSBHP0080.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBH.MSBHP0080.RsltR> down0() {
			return (MCList<mcframe.clientMSBH.MSBHP0080.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0080_Srch01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0080.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0080_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBH.MSBHP0080.RsltR>)p_MS_MSBHL0080_Srch01.getContainerParam().getDownBlock(0));
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