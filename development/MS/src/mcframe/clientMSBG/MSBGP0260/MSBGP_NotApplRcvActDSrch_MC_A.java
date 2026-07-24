package mcframe.clientMSBG.MSBGP0260;

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
import mcframe.clientMSBG.MSBGP0260.MSBGP_NotApplRcvActDSrch_MC.MS_MSBGL0260_Srch01Caller;

/**
 * 画面"MSBGP_NotApplRcvActDSrch"パネルクラスです。<p>
 *
 * まだ売掛明細消込されていない入金実績（売掛消込情報）を照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGP_NotApplRcvActDSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBGP0260";

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
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [Tab4]ブロック関連のField定義
	public MCPanel Tab4Panel = null;
	// [Tab4]ブロックの項目のField定義
	// [AcstCnd]ブロック関連のField定義
	public MCPanel AcstCndPanel = null;
	// [AcstCnd]ブロックの項目のField定義
	// [RcstCnd]ブロック関連のField定義
	public MCPanel RcstCndPanel = null;
	// [RcstCnd]ブロックの項目のField定義
	// [BcstCnd]ブロック関連のField定義
	public MCPanel BcstCndPanel = null;
	// [BcstCnd]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
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
	public MCLabel Cnd_acst_cd_Label = null;
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_acst_cd = null;
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public MCTextField Cnd_acst_nm = null;
	public MCLabel Cnd_ar_dpt_cd_Label = null;
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ar_dpt_cd = null;
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public MCTextField Cnd_ar_dpt_nm = null;
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
	public MCLabel Cnd_iv_no_Label = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_iv_no = null;
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
	public MCLabel Cnd_trd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField Cnd_trd_cur_nm = null;
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
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Cnd_wrk_no_p_PPanel;
	public MCTextField Cnd_wrk_no;	// [Cnd]の[wrk_no_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[wrk_no_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_ar_typ_Label = null;
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ar_typ = null;
	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public MCTextField Cnd_ar_typ_nm = null;
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
	 * Include reconciled 消込完了含む.<p>
	 *
	 */
	public MCCheckBox Cnd_appl_cmpl_flg = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_acst_grp_p_PPanel;
	public MCLabel Cnd_acst_grp_lab1;	// [Cnd]の[acst_grp_p.bp_grp_lab1]を[Cnd_acst_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg1;	// [Cnd]の[acst_grp_p.bp_grp_flg1]を[Cnd_acst_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd1;	// [Cnd]の[acst_grp_p.bp_grp_cd1]を[Cnd_acst_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm1;	// [Cnd]の[acst_grp_p.bp_grp_nm1]を[Cnd_acst_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab2;	// [Cnd]の[acst_grp_p.bp_grp_lab2]を[Cnd_acst_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg2;	// [Cnd]の[acst_grp_p.bp_grp_flg2]を[Cnd_acst_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd2;	// [Cnd]の[acst_grp_p.bp_grp_cd2]を[Cnd_acst_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm2;	// [Cnd]の[acst_grp_p.bp_grp_nm2]を[Cnd_acst_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab3;	// [Cnd]の[acst_grp_p.bp_grp_lab3]を[Cnd_acst_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg3;	// [Cnd]の[acst_grp_p.bp_grp_flg3]を[Cnd_acst_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd3;	// [Cnd]の[acst_grp_p.bp_grp_cd3]を[Cnd_acst_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm3;	// [Cnd]の[acst_grp_p.bp_grp_nm3]を[Cnd_acst_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab4;	// [Cnd]の[acst_grp_p.bp_grp_lab4]を[Cnd_acst_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg4;	// [Cnd]の[acst_grp_p.bp_grp_flg4]を[Cnd_acst_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd4;	// [Cnd]の[acst_grp_p.bp_grp_cd4]を[Cnd_acst_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm4;	// [Cnd]の[acst_grp_p.bp_grp_nm4]を[Cnd_acst_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab5;	// [Cnd]の[acst_grp_p.bp_grp_lab5]を[Cnd_acst_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg5;	// [Cnd]の[acst_grp_p.bp_grp_flg5]を[Cnd_acst_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd5;	// [Cnd]の[acst_grp_p.bp_grp_cd5]を[Cnd_acst_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm5;	// [Cnd]の[acst_grp_p.bp_grp_nm5]を[Cnd_acst_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab6;	// [Cnd]の[acst_grp_p.bp_grp_lab6]を[Cnd_acst_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg6;	// [Cnd]の[acst_grp_p.bp_grp_flg6]を[Cnd_acst_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd6;	// [Cnd]の[acst_grp_p.bp_grp_cd6]を[Cnd_acst_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm6;	// [Cnd]の[acst_grp_p.bp_grp_nm6]を[Cnd_acst_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab7;	// [Cnd]の[acst_grp_p.bp_grp_lab7]を[Cnd_acst_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg7;	// [Cnd]の[acst_grp_p.bp_grp_flg7]を[Cnd_acst_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd7;	// [Cnd]の[acst_grp_p.bp_grp_cd7]を[Cnd_acst_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm7;	// [Cnd]の[acst_grp_p.bp_grp_nm7]を[Cnd_acst_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab8;	// [Cnd]の[acst_grp_p.bp_grp_lab8]を[Cnd_acst_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg8;	// [Cnd]の[acst_grp_p.bp_grp_flg8]を[Cnd_acst_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd8;	// [Cnd]の[acst_grp_p.bp_grp_cd8]を[Cnd_acst_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm8;	// [Cnd]の[acst_grp_p.bp_grp_nm8]を[Cnd_acst_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab9;	// [Cnd]の[acst_grp_p.bp_grp_lab9]を[Cnd_acst_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg9;	// [Cnd]の[acst_grp_p.bp_grp_flg9]を[Cnd_acst_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd9;	// [Cnd]の[acst_grp_p.bp_grp_cd9]を[Cnd_acst_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm9;	// [Cnd]の[acst_grp_p.bp_grp_nm9]を[Cnd_acst_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab10;	// [Cnd]の[acst_grp_p.bp_grp_lab10]を[Cnd_acst_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg10;	// [Cnd]の[acst_grp_p.bp_grp_flg10]を[Cnd_acst_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd10;	// [Cnd]の[acst_grp_p.bp_grp_cd10]を[Cnd_acst_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm10;	// [Cnd]の[acst_grp_p.bp_grp_nm10]を[Cnd_acst_grp_nm10]としてエイリアス定義。
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
	public MCTable2<mcframe.clientMSBG.MSBGP0260.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
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
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_act_no = null;
	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_act_d_no = null;
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
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_dpt_cd = null;
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_dpt_nm = null;
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
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_no = null;
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
	public mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D Rslt_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_typ = null;
	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_tgt_appl_amt_p_PPanel;
	public MCColumnConfig columnRslt_tgt_appl_amt;// [Rslt]の[tgt_appl_amt_p.amt]を[columnRslt_tgt_appl_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_appl_amt_p_PPanel;
	public MCColumnConfig columnRslt_appl_amt;// [Rslt]の[appl_amt_p.amt]を[columnRslt_appl_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_not_appl_bal_p_PPanel;
	public MCColumnConfig columnRslt_not_appl_bal;// [Rslt]の[not_appl_bal_p.amt]を[columnRslt_not_appl_bal]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_amt1_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_amt1;// [Rslt]の[trd_cur_amt1_p.amt]を[columnRslt_trd_cur_amt1]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_amt2_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_amt2;// [Rslt]の[trd_cur_amt2_p.amt]を[columnRslt_trd_cur_amt2]としてエイリアス定義。
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
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_d_rmrks = null;
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
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_disp_seq = null;
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_acst_grp_p_PPanel;
	public MCColumnConfig columnRslt_acst_grp_cd1;// [Rslt]の[acst_grp_p.bp_grp_cd1]を[columnRslt_acst_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm1;// [Rslt]の[acst_grp_p.bp_grp_nm1]を[columnRslt_acst_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd2;// [Rslt]の[acst_grp_p.bp_grp_cd2]を[columnRslt_acst_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm2;// [Rslt]の[acst_grp_p.bp_grp_nm2]を[columnRslt_acst_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd3;// [Rslt]の[acst_grp_p.bp_grp_cd3]を[columnRslt_acst_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm3;// [Rslt]の[acst_grp_p.bp_grp_nm3]を[columnRslt_acst_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd4;// [Rslt]の[acst_grp_p.bp_grp_cd4]を[columnRslt_acst_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm4;// [Rslt]の[acst_grp_p.bp_grp_nm4]を[columnRslt_acst_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd5;// [Rslt]の[acst_grp_p.bp_grp_cd5]を[columnRslt_acst_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm5;// [Rslt]の[acst_grp_p.bp_grp_nm5]を[columnRslt_acst_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd6;// [Rslt]の[acst_grp_p.bp_grp_cd6]を[columnRslt_acst_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm6;// [Rslt]の[acst_grp_p.bp_grp_nm6]を[columnRslt_acst_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd7;// [Rslt]の[acst_grp_p.bp_grp_cd7]を[columnRslt_acst_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm7;// [Rslt]の[acst_grp_p.bp_grp_nm7]を[columnRslt_acst_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd8;// [Rslt]の[acst_grp_p.bp_grp_cd8]を[columnRslt_acst_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm8;// [Rslt]の[acst_grp_p.bp_grp_nm8]を[columnRslt_acst_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd9;// [Rslt]の[acst_grp_p.bp_grp_cd9]を[columnRslt_acst_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm9;// [Rslt]の[acst_grp_p.bp_grp_nm9]を[columnRslt_acst_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd10;// [Rslt]の[acst_grp_p.bp_grp_cd10]を[columnRslt_acst_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm10;// [Rslt]の[acst_grp_p.bp_grp_nm10]を[columnRslt_acst_grp_nm10]としてエイリアス定義。
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
	 * AR details reconciliation 売掛明細消込.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0220 = null;
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
	
	/** [MS_MSBGL0260_Srch01]のCallerの作成 */
	protected MSBGP_NotApplRcvActDSrch_MC.MS_MSBGL0260_Srch01Caller createMS_MSBGL0260_Srch01() {
		MSBGP_NotApplRcvActDSrch_MC.MS_MSBGL0260_Srch01Caller<MSBGP_NotApplRcvActDSrch, MS_MSBGL0260_Srch01Bridge>
		caller = ((MSBGP_NotApplRcvActDSrch_MC)this).new MS_MSBGL0260_Srch01Caller<MSBGP_NotApplRcvActDSrch, MS_MSBGL0260_Srch01Bridge>(
					(MSBGP_NotApplRcvActDSrch)this, new MS_MSBGL0260_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBGL0260_Srch01]の呼び出し */
	protected void callMS_MSBGL0260_Srch01() {
		MCCaller caller = createMS_MSBGL0260_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0260.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0260.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBG.MSBGP0260.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0260.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0260.CndR createCndR() {
		return mcframe.clientMSBG.MSBGP0260.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBG.MSBGP0260.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0260.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBG.MSBGP0260.RsltR createRsltR() {
		return mcframe.clientMSBG.MSBGP0260.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0260.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0260.RsltR.class);
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
		ret.add(Tab3Panel);
		ret.add(Tab4Panel);
		ret.add(AcstCndPanel);
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
	public MSBGP_NotApplRcvActDSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBGP_NotApplRcvActDSrch_MC_A(String name) {
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
		MSBGP_NotApplRcvActDSrch_MC.jbCreateTop((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbCreateFold((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbCreateTab1((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbCreateTab2((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbCreateTab3((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbCreateTab4((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbCreateAcstCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbCreateRcstCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbCreateBcstCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbCreateCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbCreateCtrl((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbCreateRPnl((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbCreateRslt((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbCreateBtn((MSBGP_NotApplRcvActDSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBGP_NotApplRcvActDSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBGP_NotApplRcvActDSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBGP_NotApplRcvActDSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBGP_NotApplRcvActDSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBGP_NotApplRcvActDSrch p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MSBGP_NotApplRcvActDSrch p) {
	}

	/**
	 * [AcstCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAcstCnd(MSBGP_NotApplRcvActDSrch p) {
	}

	/**
	 * [RcstCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRcstCnd(MSBGP_NotApplRcvActDSrch p) {
	}

	/**
	 * [BcstCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBcstCnd(MSBGP_NotApplRcvActDSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBGP_NotApplRcvActDSrch p) {
		p.Cnd_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getCndR().wrk_no_p());
		p.Cnd_wrk_no_p_PPanel.setName("Cnd.wrk_no_p");
		p.Cnd_wrk_no = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
		p.Cnd_acst_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().acst_grp_p());
		p.Cnd_acst_grp_p_PPanel.setName("Cnd.acst_grp_p");
		p.Cnd_acst_grp_lab1 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_acst_grp_lab1.addAliasName("Cnd.acst_grp_lab1", p);
		p.Cnd_acst_grp_flg1 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_acst_grp_flg1.addAliasName("Cnd.acst_grp_flg1", p);
		p.Cnd_acst_grp_cd1 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_acst_grp_cd1.addAliasName("Cnd.acst_grp_cd1", p);
		p.Cnd_acst_grp_nm1 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_acst_grp_nm1.addAliasName("Cnd.acst_grp_nm1", p);
		p.Cnd_acst_grp_lab2 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_acst_grp_lab2.addAliasName("Cnd.acst_grp_lab2", p);
		p.Cnd_acst_grp_flg2 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_acst_grp_flg2.addAliasName("Cnd.acst_grp_flg2", p);
		p.Cnd_acst_grp_cd2 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_acst_grp_cd2.addAliasName("Cnd.acst_grp_cd2", p);
		p.Cnd_acst_grp_nm2 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_acst_grp_nm2.addAliasName("Cnd.acst_grp_nm2", p);
		p.Cnd_acst_grp_lab3 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_acst_grp_lab3.addAliasName("Cnd.acst_grp_lab3", p);
		p.Cnd_acst_grp_flg3 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_acst_grp_flg3.addAliasName("Cnd.acst_grp_flg3", p);
		p.Cnd_acst_grp_cd3 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_acst_grp_cd3.addAliasName("Cnd.acst_grp_cd3", p);
		p.Cnd_acst_grp_nm3 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_acst_grp_nm3.addAliasName("Cnd.acst_grp_nm3", p);
		p.Cnd_acst_grp_lab4 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_acst_grp_lab4.addAliasName("Cnd.acst_grp_lab4", p);
		p.Cnd_acst_grp_flg4 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_acst_grp_flg4.addAliasName("Cnd.acst_grp_flg4", p);
		p.Cnd_acst_grp_cd4 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_acst_grp_cd4.addAliasName("Cnd.acst_grp_cd4", p);
		p.Cnd_acst_grp_nm4 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_acst_grp_nm4.addAliasName("Cnd.acst_grp_nm4", p);
		p.Cnd_acst_grp_lab5 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_acst_grp_lab5.addAliasName("Cnd.acst_grp_lab5", p);
		p.Cnd_acst_grp_flg5 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_acst_grp_flg5.addAliasName("Cnd.acst_grp_flg5", p);
		p.Cnd_acst_grp_cd5 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_acst_grp_cd5.addAliasName("Cnd.acst_grp_cd5", p);
		p.Cnd_acst_grp_nm5 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_acst_grp_nm5.addAliasName("Cnd.acst_grp_nm5", p);
		p.Cnd_acst_grp_lab6 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_acst_grp_lab6.addAliasName("Cnd.acst_grp_lab6", p);
		p.Cnd_acst_grp_flg6 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_acst_grp_flg6.addAliasName("Cnd.acst_grp_flg6", p);
		p.Cnd_acst_grp_cd6 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_acst_grp_cd6.addAliasName("Cnd.acst_grp_cd6", p);
		p.Cnd_acst_grp_nm6 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_acst_grp_nm6.addAliasName("Cnd.acst_grp_nm6", p);
		p.Cnd_acst_grp_lab7 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_acst_grp_lab7.addAliasName("Cnd.acst_grp_lab7", p);
		p.Cnd_acst_grp_flg7 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_acst_grp_flg7.addAliasName("Cnd.acst_grp_flg7", p);
		p.Cnd_acst_grp_cd7 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_acst_grp_cd7.addAliasName("Cnd.acst_grp_cd7", p);
		p.Cnd_acst_grp_nm7 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_acst_grp_nm7.addAliasName("Cnd.acst_grp_nm7", p);
		p.Cnd_acst_grp_lab8 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_acst_grp_lab8.addAliasName("Cnd.acst_grp_lab8", p);
		p.Cnd_acst_grp_flg8 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_acst_grp_flg8.addAliasName("Cnd.acst_grp_flg8", p);
		p.Cnd_acst_grp_cd8 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_acst_grp_cd8.addAliasName("Cnd.acst_grp_cd8", p);
		p.Cnd_acst_grp_nm8 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_acst_grp_nm8.addAliasName("Cnd.acst_grp_nm8", p);
		p.Cnd_acst_grp_lab9 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_acst_grp_lab9.addAliasName("Cnd.acst_grp_lab9", p);
		p.Cnd_acst_grp_flg9 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_acst_grp_flg9.addAliasName("Cnd.acst_grp_flg9", p);
		p.Cnd_acst_grp_cd9 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_acst_grp_cd9.addAliasName("Cnd.acst_grp_cd9", p);
		p.Cnd_acst_grp_nm9 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_acst_grp_nm9.addAliasName("Cnd.acst_grp_nm9", p);
		p.Cnd_acst_grp_lab10 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_acst_grp_lab10.addAliasName("Cnd.acst_grp_lab10", p);
		p.Cnd_acst_grp_flg10 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_acst_grp_flg10.addAliasName("Cnd.acst_grp_flg10", p);
		p.Cnd_acst_grp_cd10 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_acst_grp_cd10.addAliasName("Cnd.acst_grp_cd10", p);
		p.Cnd_acst_grp_nm10 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_acst_grp_nm10.addAliasName("Cnd.acst_grp_nm10", p);
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
	protected static void jbCreateCtrl(MSBGP_NotApplRcvActDSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBGP_NotApplRcvActDSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBGP_NotApplRcvActDSrch p) {
		p.Rslt_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSBG.MSBGP0260.RsltR.$wrk_no_p);
		p.Rslt_wrk_no_p_PPanel.setName("Rslt.wrk_no_p");
		p.columnRslt_wrk_no = p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_tgt_appl_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0260.RsltR.$tgt_appl_amt_p);
		p.Rslt_tgt_appl_amt_p_PPanel.setName("Rslt.tgt_appl_amt_p");
		p.columnRslt_tgt_appl_amt = p.Rslt_tgt_appl_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_tgt_appl_amt.addAliasName("Rslt.tgt_appl_amt", p);
		p.Rslt_appl_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0260.RsltR.$appl_amt_p);
		p.Rslt_appl_amt_p_PPanel.setName("Rslt.appl_amt_p");
		p.columnRslt_appl_amt = p.Rslt_appl_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_appl_amt.addAliasName("Rslt.appl_amt", p);
		p.Rslt_not_appl_bal_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0260.RsltR.$not_appl_bal_p);
		p.Rslt_not_appl_bal_p_PPanel.setName("Rslt.not_appl_bal_p");
		p.columnRslt_not_appl_bal = p.Rslt_not_appl_bal_p_PPanel.columnAmt_amt;
		p.columnRslt_not_appl_bal.addAliasName("Rslt.not_appl_bal", p);
		p.Rslt_trd_cur_amt1_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0260.RsltR.$trd_cur_amt1_p);
		p.Rslt_trd_cur_amt1_p_PPanel.setName("Rslt.trd_cur_amt1_p");
		p.columnRslt_trd_cur_amt1 = p.Rslt_trd_cur_amt1_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_amt1.addAliasName("Rslt.trd_cur_amt1", p);
		p.Rslt_trd_cur_amt2_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0260.RsltR.$trd_cur_amt2_p);
		p.Rslt_trd_cur_amt2_p_PPanel.setName("Rslt.trd_cur_amt2_p");
		p.columnRslt_trd_cur_amt2 = p.Rslt_trd_cur_amt2_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_amt2.addAliasName("Rslt.trd_cur_amt2", p);
		p.Rslt_acst_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBG.MSBGP0260.RsltR.$acst_grp_p);
		p.Rslt_acst_grp_p_PPanel.setName("Rslt.acst_grp_p");
		p.columnRslt_acst_grp_cd1 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_acst_grp_cd1.addAliasName("Rslt.acst_grp_cd1", p);
		p.columnRslt_acst_grp_nm1 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_acst_grp_nm1.addAliasName("Rslt.acst_grp_nm1", p);
		p.columnRslt_acst_grp_cd2 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_acst_grp_cd2.addAliasName("Rslt.acst_grp_cd2", p);
		p.columnRslt_acst_grp_nm2 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_acst_grp_nm2.addAliasName("Rslt.acst_grp_nm2", p);
		p.columnRslt_acst_grp_cd3 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_acst_grp_cd3.addAliasName("Rslt.acst_grp_cd3", p);
		p.columnRslt_acst_grp_nm3 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_acst_grp_nm3.addAliasName("Rslt.acst_grp_nm3", p);
		p.columnRslt_acst_grp_cd4 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_acst_grp_cd4.addAliasName("Rslt.acst_grp_cd4", p);
		p.columnRslt_acst_grp_nm4 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_acst_grp_nm4.addAliasName("Rslt.acst_grp_nm4", p);
		p.columnRslt_acst_grp_cd5 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_acst_grp_cd5.addAliasName("Rslt.acst_grp_cd5", p);
		p.columnRslt_acst_grp_nm5 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_acst_grp_nm5.addAliasName("Rslt.acst_grp_nm5", p);
		p.columnRslt_acst_grp_cd6 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_acst_grp_cd6.addAliasName("Rslt.acst_grp_cd6", p);
		p.columnRslt_acst_grp_nm6 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_acst_grp_nm6.addAliasName("Rslt.acst_grp_nm6", p);
		p.columnRslt_acst_grp_cd7 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_acst_grp_cd7.addAliasName("Rslt.acst_grp_cd7", p);
		p.columnRslt_acst_grp_nm7 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_acst_grp_nm7.addAliasName("Rslt.acst_grp_nm7", p);
		p.columnRslt_acst_grp_cd8 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_acst_grp_cd8.addAliasName("Rslt.acst_grp_cd8", p);
		p.columnRslt_acst_grp_nm8 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_acst_grp_nm8.addAliasName("Rslt.acst_grp_nm8", p);
		p.columnRslt_acst_grp_cd9 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_acst_grp_cd9.addAliasName("Rslt.acst_grp_cd9", p);
		p.columnRslt_acst_grp_nm9 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_acst_grp_nm9.addAliasName("Rslt.acst_grp_nm9", p);
		p.columnRslt_acst_grp_cd10 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_acst_grp_cd10.addAliasName("Rslt.acst_grp_cd10", p);
		p.columnRslt_acst_grp_nm10 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_acst_grp_nm10.addAliasName("Rslt.acst_grp_nm10", p);
		p.Rslt_rcst_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBG.MSBGP0260.RsltR.$rcst_grp_p);
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
		p.Rslt_bcst_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBG.MSBGP0260.RsltR.$bcst_grp_p);
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
	protected static void jbCreateBtn(MSBGP_NotApplRcvActDSrch p) {
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
	
	
	/** [Cnd_acst_cd_ListPutter]の定義 */
	private MCListPutter Cnd_acst_cd_p = null;

	/**
	 * [Cnd_acst_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_acst_cd_ListPutter() {
		if (Cnd_acst_cd_p == null) {
			Cnd_acst_cd_p = createCnd_acst_cd_ListPutter(Cnd_acst_cd, "acst_cd", "acst_nm");

		}
		return Cnd_acst_cd_p;
	}
	
	
	/** [Cnd_ar_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ar_dpt_cd_p = null;

	/**
	 * [Cnd_ar_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ar_dpt_cd_ListPutter() {
		if (Cnd_ar_dpt_cd_p == null) {
			Cnd_ar_dpt_cd_p = createCnd_ar_dpt_cd_ListPutter(Cnd_ar_dpt_cd, "ar_dpt_cd", "ar_dpt_nm");

		}
		return Cnd_ar_dpt_cd_p;
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
	
	
	/** [Cnd_ar_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ar_typ_p = null;

	/**
	 * [Cnd_ar_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ar_typ_ListPutter() {
		if (Cnd_ar_typ_p == null) {
			Cnd_ar_typ_p = createCnd_ar_typ_ListPutter(Cnd_ar_typ, "ar_typ", "ar_typ_nm");

		}
		return Cnd_ar_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_NotApplRcvActDSrch create(){
		MSBGP_NotApplRcvActDSrch p = new MSBGP_NotApplRcvActDSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_NotApplRcvActDSrch create(String name){
		MSBGP_NotApplRcvActDSrch p = new MSBGP_NotApplRcvActDSrch(name);
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
		MSBGP_NotApplRcvActDSrch_MC.jbfInitTop((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbfInitFold((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbfInitTab1((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbfInitTab2((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbfInitTab3((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbfInitTab4((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbfInitAcstCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbfInitRcstCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbfInitBcstCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbfInitCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbfInitCtrl((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbfInitRPnl((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbfInitRslt((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbfInitBtn((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbInitTop((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbInitFold((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbInitTab1((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbInitTab2((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbInitTab3((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbInitTab4((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbInitAcstCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbInitRcstCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbInitBcstCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbInitCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbInitCtrl((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbInitRPnl((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbInitRslt((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.jbInitBtn((MSBGP_NotApplRcvActDSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBGP_NotApplRcvActDSrch p) {
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
	protected static void jbfInitTab1(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [AcstCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAcstCnd(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.AcstCndPanel = p.beansFactory.createPanel("AcstCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [RcstCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRcstCnd(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.RcstCndPanel = p.beansFactory.createPanel("RcstCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [BcstCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBcstCnd(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.BcstCndPanel = p.beansFactory.createPanel("BcstCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
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
		p.Cnd_acst_cd_Label = p.beansFactory.createLabel("Cnd.acst_cd_Label");
		p.Cnd_acst_cd = p.beansFactory.createTextField("Cnd.acst_cd");
		p.Cnd_acst_cd.setLabel(p.Cnd_acst_cd_Label);
		p.Cnd_acst_nm = p.beansFactory.createTextField("Cnd.acst_nm");
		p.Cnd_ar_dpt_cd_Label = p.beansFactory.createLabel("Cnd.ar_dpt_cd_Label");
		p.Cnd_ar_dpt_cd = p.beansFactory.createTextField("Cnd.ar_dpt_cd");
		p.Cnd_ar_dpt_cd.setLabel(p.Cnd_ar_dpt_cd_Label);
		p.Cnd_ar_dpt_nm = p.beansFactory.createTextField("Cnd.ar_dpt_nm");
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
		p.Cnd_iv_no_Label = p.beansFactory.createLabel("Cnd.iv_no_Label");
		p.Cnd_iv_no = p.beansFactory.createTextField("Cnd.iv_no");
		p.Cnd_iv_no.setLabel(p.Cnd_iv_no_Label);
		p.Cnd_trd_cd_Label = p.beansFactory.createLabel("Cnd.trd_cd_Label");
		p.Cnd_trd_cd = p.beansFactory.createTextComboBox("Cnd.trd_cd");
		p.Cnd_trd_cd.setLabel(p.Cnd_trd_cd_Label);
		p.Cnd_trd_nm = p.beansFactory.createTextField("Cnd.trd_nm");
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_bill_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bill_dpt_cd_Label");
		p.Cnd_bill_dpt_cd = p.beansFactory.createTextField("Cnd.bill_dpt_cd");
		p.Cnd_bill_dpt_cd.setLabel(p.Cnd_bill_dpt_cd_Label);
		p.Cnd_bill_dpt_nm = p.beansFactory.createTextField("Cnd.bill_dpt_nm");
		p.Cnd_ar_typ_Label = p.beansFactory.createLabel("Cnd.ar_typ_Label");
		p.Cnd_ar_typ = p.beansFactory.createTextComboBox("Cnd.ar_typ");
		p.Cnd_ar_typ.setLabel(p.Cnd_ar_typ_Label);
		p.Cnd_ar_typ_nm = p.beansFactory.createTextField("Cnd.ar_typ_nm");
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_appl_cmpl_flg = p.beansFactory.createCheckBox("Cnd.appl_cmpl_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_rcv_act_no = p.beansFactory.createTableColumn("Rslt.rcv_act_no", MCColumnType.TEXT);
		p.columnRslt_rcv_act_d_no = p.beansFactory.createTableColumn("Rslt.rcv_act_d_no", MCColumnType.TEXT);
		p.columnRslt_ac_ym = p.beansFactory.createTableColumn("Rslt.ac_ym", MCColumnType.DATE);
		p.columnRslt_ac_dt = p.beansFactory.createTableColumn("Rslt.ac_dt", MCColumnType.DATE);
		p.columnRslt_rcv_dt = p.beansFactory.createTableColumn("Rslt.rcv_dt", MCColumnType.DATE);
		p.columnRslt_rcst_cd = p.beansFactory.createTableColumn("Rslt.rcst_cd", MCColumnType.TEXT);
		p.columnRslt_rcst_nm = p.beansFactory.createTableColumn("Rslt.rcst_nm", MCColumnType.TEXT);
		p.columnRslt_bcst_cd = p.beansFactory.createTableColumn("Rslt.bcst_cd", MCColumnType.TEXT);
		p.columnRslt_bcst_nm = p.beansFactory.createTableColumn("Rslt.bcst_nm", MCColumnType.TEXT);
		p.columnRslt_bill_dpt_cd = p.beansFactory.createTableColumn("Rslt.bill_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_bill_dpt_nm = p.beansFactory.createTableColumn("Rslt.bill_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_ar_dpt_cd = p.beansFactory.createTableColumn("Rslt.ar_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_ar_dpt_nm = p.beansFactory.createTableColumn("Rslt.ar_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_acst_cd = p.beansFactory.createTableColumn("Rslt.acst_cd", MCColumnType.TEXT);
		p.columnRslt_acst_nm = p.beansFactory.createTableColumn("Rslt.acst_nm", MCColumnType.TEXT);
		p.columnRslt_iv_no = p.beansFactory.createTableColumn("Rslt.iv_no", MCColumnType.TEXT);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_amt_dec_place = p.beansFactory.createTableColumn("Rslt.amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ar_typ = p.beansFactory.createTableColumn("Rslt.ar_typ", MCColumnType.TEXT);
		p.columnRslt_ar_typ_nm = p.beansFactory.createTableColumn("Rslt.ar_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ar_sttl_cd1 = p.beansFactory.createTableColumn("Rslt.ar_sttl_cd1", MCColumnType.TEXT);
		p.columnRslt_ar_sttl_nm1 = p.beansFactory.createTableColumn("Rslt.ar_sttl_nm1", MCColumnType.TEXT);
		p.columnRslt_rcv_no = p.beansFactory.createTableColumn("Rslt.rcv_no", MCColumnType.TEXT);
		p.columnRslt_note_no = p.beansFactory.createTableColumn("Rslt.note_no", MCColumnType.TEXT);
		p.columnRslt_bank_ac_cd = p.beansFactory.createTableColumn("Rslt.bank_ac_cd", MCColumnType.TEXT);
		p.columnRslt_bank_ac_nm = p.beansFactory.createTableColumn("Rslt.bank_ac_nm", MCColumnType.TEXT);
		p.columnRslt_bank_ac_no = p.beansFactory.createTableColumn("Rslt.bank_ac_no", MCColumnType.TEXT);
		p.columnRslt_ar_sttl_cd2 = p.beansFactory.createTableColumn("Rslt.ar_sttl_cd2", MCColumnType.TEXT);
		p.columnRslt_ar_sttl_nm2 = p.beansFactory.createTableColumn("Rslt.ar_sttl_nm2", MCColumnType.TEXT);
		p.columnRslt_rcv_auto_appl_flg = p.beansFactory.createTableColumn("Rslt.rcv_auto_appl_flg", MCColumnType.CHECK);
		p.columnRslt_trd_rmrks = p.beansFactory.createTableColumn("Rslt.trd_rmrks", MCColumnType.TEXT);
		p.columnRslt_bill_d_rmrks = p.beansFactory.createTableColumn("Rslt.bill_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_disp_seq = p.beansFactory.createTableColumn("Rslt.disp_seq", MCColumnType.NUMBER);
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
	protected static void jbfInitBtn(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBGP0210 = p.beansFactory.createButton("Btn.open_MSBGP0210", "open");
		p.Btn_open_MSBGP0220 = p.beansFactory.createButton("Btn.open_MSBGP0220", "open");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBGP_NotApplRcvActDSrch p) {
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
	protected static void jbInitFold(MSBGP_NotApplRcvActDSrch p) {
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
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.FoldTab.add(p.Tab4Panel, "Fold.tab4");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.AcstCndPanel, null);
		p.Tab2Panel.setLastBeans(p.AcstCndPanel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.RcstCndPanel, null);
		p.Tab3Panel.setLastBeans(p.RcstCndPanel);
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab4(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab4Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.BcstCndPanel, null);
		p.Tab4Panel.setLastBeans(p.BcstCndPanel);
	}

	/**
	 * [AcstCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAcstCnd(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.AcstCndPanel.setValueCheck(false);
		p.AcstCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.AcstCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [RcstCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRcstCnd(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.RcstCndPanel.setValueCheck(false);
		p.RcstCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RcstCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [BcstCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBcstCnd(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.BcstCndPanel.setValueCheck(false);
		p.BcstCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BcstCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_rcv_dt_fr_Label);
		p.CndPanel.add(p.Cnd_rcv_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_rcv_dt_fr);
		p.Cnd_rcv_dt_fr.setNextBeans(p.Cnd_rcv_dt_to);
		p.Cnd_rcv_dt_fr.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.rcv_dt_fr_META);
		p.Cnd_rcv_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rcv_dt_to_Label);
		p.CndPanel.add(p.Cnd_rcv_dt_to);
		p.Cnd_rcv_dt_to.setNextBeans(p.Cnd_ac_dt_fr);
		p.Cnd_rcv_dt_to.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.rcv_dt_to_META);
		p.Cnd_rcv_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ac_dt_fr);
		p.Cnd_ac_dt_fr.setNextBeans(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.ac_dt_fr_META);
		p.Cnd_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_to.setNextBeans(p.Cnd_rcst_cd);
		p.Cnd_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.ac_dt_to_META);
		p.Cnd_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rcst_cd_Label);
		p.CndPanel.add(p.Cnd_rcst_cd);
		p.Cnd_rcst_cd.setNextBeans(p.Cnd_rcst_nm);
		p.Cnd_rcst_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.rcst_cd_META);
		p.Cnd_rcst_cd.addLinkBeans(p.Cnd_rcst_nm);
		p.Cnd_rcst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rcst_cd, true);
		p.CndPanel.add(p.Cnd_rcst_nm);
		p.Cnd_rcst_nm.setNextBeans(p.Cnd_bcst_cd);
		p.Cnd_rcst_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.rcst_nm_META);
		p.setPluralValueEnable(p.Cnd_rcst_nm, true);
		p.CndPanel.add(p.Cnd_bcst_cd_Label);
		p.CndPanel.add(p.Cnd_bcst_cd);
		p.Cnd_bcst_cd.setNextBeans(p.Cnd_bcst_nm);
		p.Cnd_bcst_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.bcst_cd_META);
		p.Cnd_bcst_cd.addLinkBeans(p.Cnd_bcst_nm);
		p.Cnd_bcst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bcst_cd, true);
		p.CndPanel.add(p.Cnd_bcst_nm);
		p.Cnd_bcst_nm.setNextBeans(p.Cnd_acst_cd);
		p.Cnd_bcst_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.bcst_nm_META);
		p.setPluralValueEnable(p.Cnd_bcst_nm, true);
		p.CndPanel.add(p.Cnd_acst_cd_Label);
		p.CndPanel.add(p.Cnd_acst_cd);
		p.Cnd_acst_cd.setNextBeans(p.Cnd_acst_nm);
		p.Cnd_acst_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.acst_cd_META);
		p.Cnd_acst_cd.addLinkBeans(p.Cnd_acst_nm);
		p.Cnd_acst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_acst_cd, true);
		p.CndPanel.add(p.Cnd_acst_nm);
		p.Cnd_acst_nm.setNextBeans(p.Cnd_ar_dpt_cd);
		p.Cnd_acst_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.acst_nm_META);
		p.setPluralValueEnable(p.Cnd_acst_nm, true);
		p.CndPanel.add(p.Cnd_ar_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_ar_dpt_cd);
		p.Cnd_ar_dpt_cd.setNextBeans(p.Cnd_ar_dpt_nm);
		p.Cnd_ar_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.ar_dpt_cd_META);
		p.Cnd_ar_dpt_cd.addLinkBeans(p.Cnd_ar_dpt_nm);
		p.Cnd_ar_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ar_dpt_cd, true);
		p.CndPanel.add(p.Cnd_ar_dpt_nm);
		p.Cnd_ar_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_ar_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.ar_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_ar_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_trd_rmrks);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_trd_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_rmrks);
		p.Cnd_trd_rmrks.setNextBeans(p.Cnd_rcv_act_no);
		p.Cnd_trd_rmrks.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.trd_rmrks_META);
		p.setPluralValueEnable(p.Cnd_trd_rmrks, true);
		p.CndPanel.add(p.Cnd_rcv_act_no_Label);
		p.CndPanel.add(p.Cnd_rcv_act_no);
		p.Cnd_rcv_act_no.setNextBeans(p.Cnd_iv_no);
		p.Cnd_rcv_act_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.rcv_act_no_META);
		p.setPluralValueEnable(p.Cnd_rcv_act_no, true);
		p.CndPanel.add(p.Cnd_iv_no_Label);
		p.CndPanel.add(p.Cnd_iv_no);
		p.Cnd_iv_no.setNextBeans(p.Cnd_trd_cd);
		p.Cnd_iv_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.iv_no_META);
		p.setPluralValueEnable(p.Cnd_iv_no, true);
		p.Cnd_trd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cd, true);
		p.Cnd_trd_cd.setLinkBeans(p.Cnd_trd_nm);
		p.CndPanel.add(p.Cnd_trd_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cd);
		p.Cnd_trd_cd.setNextBeans(p.Cnd_trd_nm);
		p.Cnd_trd_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.trd_cd_META);
		p.CndPanel.add(p.Cnd_trd_nm);
		p.Cnd_trd_nm.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_trd_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.trd_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_nm, true);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_bill_dpt_cd);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.CndPanel.add(p.Cnd_bill_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bill_dpt_cd);
		p.Cnd_bill_dpt_cd.setNextBeans(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.bill_dpt_cd_META);
		p.Cnd_bill_dpt_cd.addLinkBeans(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bill_dpt_cd, true);
		p.CndPanel.add(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_nm.setNextBeans(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_bill_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.bill_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bill_dpt_nm, true);
		p.CndPanel.add(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_wrk_no_p_PPanel.setNextBeans(p.Cnd_ar_typ);
		p.Cnd_ar_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ar_typ, true);
		p.Cnd_ar_typ.setLinkBeans(p.Cnd_ar_typ_nm);
		p.CndPanel.add(p.Cnd_ar_typ_Label);
		p.CndPanel.add(p.Cnd_ar_typ);
		p.Cnd_ar_typ.setNextBeans(p.Cnd_ar_typ_nm);
		p.Cnd_ar_typ.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.ar_typ_META);
		p.CndPanel.add(p.Cnd_ar_typ_nm);
		p.Cnd_ar_typ_nm.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_ar_typ_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.ar_typ_nm_META);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_appl_cmpl_flg);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_appl_cmpl_flg);
		p.Cnd_appl_cmpl_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0260.CndR.appl_cmpl_flg_META);
		p.AcstCndPanel.add(p.Cnd_acst_grp_p_PPanel);
		p.AcstCndPanel.setLastBeans(p.Cnd_acst_grp_p_PPanel);
		p.RcstCndPanel.add(p.Cnd_rcst_grp_p_PPanel);
		p.RcstCndPanel.setLastBeans(p.Cnd_rcst_grp_p_PPanel);
		p.BcstCndPanel.add(p.Cnd_bcst_grp_p_PPanel);
		p.BcstCndPanel.setLastBeans(p.Cnd_bcst_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBGP_NotApplRcvActDSrch p) {
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
	protected static void jbInitRPnl(MSBGP_NotApplRcvActDSrch p) {
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
	protected static void jbInitRslt(MSBGP_NotApplRcvActDSrch p) {
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
	protected static void jbInitBtn(MSBGP_NotApplRcvActDSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_open_MSBGP0210.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBGP0210);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBGP0210);
		p.Btn_open_MSBGP0210.setNextBeans(p.Btn_open_MSBGP0220);
		p.Btn_open_MSBGP0220.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBGP0220);
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
		MSBGP_NotApplRcvActDSrch_MC.mcInitTop((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.mcInitFold((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.mcInitTab1((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.mcInitTab2((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.mcInitTab3((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.mcInitTab4((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.mcInitAcstCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.mcInitRcstCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.mcInitBcstCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.mcInitCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.mcInitCtrl((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.mcInitRPnl((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.mcInitRslt((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.mcInitBtn((MSBGP_NotApplRcvActDSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBGP_NotApplRcvActDSrch_MC.statusInitSRCH_Top((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitSRCH_Fold((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitSRCH_Tab1((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitSRCH_Tab2((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitSRCH_Tab3((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitSRCH_Tab4((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitSRCH_AcstCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitSRCH_RcstCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitSRCH_BcstCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitSRCH_Cnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitSRCH_Ctrl((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitSRCH_RPnl((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitSRCH_Rslt((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitSRCH_Btn((MSBGP_NotApplRcvActDSrch)this);

		// [REF]ステータスのモードの設定
		MSBGP_NotApplRcvActDSrch_MC.statusInitREF_Top((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitREF_Fold((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitREF_Tab1((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitREF_Tab2((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitREF_Tab3((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitREF_Tab4((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitREF_AcstCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitREF_RcstCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitREF_BcstCnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitREF_Cnd((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitREF_Ctrl((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitREF_RPnl((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitREF_Rslt((MSBGP_NotApplRcvActDSrch)this);
		MSBGP_NotApplRcvActDSrch_MC.statusInitREF_Btn((MSBGP_NotApplRcvActDSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBGP_NotApplRcvActDSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBGP_NotApplRcvActDSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBGP_NotApplRcvActDSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBGP_NotApplRcvActDSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBGP_NotApplRcvActDSrch p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MSBGP_NotApplRcvActDSrch p) {
	}

	/**
	 *  [AcstCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAcstCnd(MSBGP_NotApplRcvActDSrch p) {
	}

	/**
	 *  [RcstCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRcstCnd(MSBGP_NotApplRcvActDSrch p) {
	}

	/**
	 *  [BcstCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBcstCnd(MSBGP_NotApplRcvActDSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBGP_NotApplRcvActDSrch p) {
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
		p.Cnd_acst_cd.setListListener(p);
		p.Cnd_acst_cd.addAllListener(p);
		p.Cnd_acst_nm.setListListener(p);
		p.Cnd_acst_nm.addAllListener(p);
		p.Cnd_ar_dpt_cd.setListListener(p);
		p.Cnd_ar_dpt_cd.addAllListener(p);
		p.Cnd_ar_dpt_nm.setListListener(p);
		p.Cnd_ar_dpt_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_trd_rmrks.setListListener(p);
		p.Cnd_trd_rmrks.addAllListener(p);
		p.Cnd_rcv_act_no.setListListener(p);
		p.Cnd_rcv_act_no.addAllListener(p);
		p.Cnd_iv_no.setListListener(p);
		p.Cnd_iv_no.addAllListener(p);
		p.Cnd_trd_cd.setListListener(p);
		p.Cnd_trd_cd.addAllListener(p);
		p.Cnd_trd_nm.setListListener(p);
		p.Cnd_trd_nm.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_bill_dpt_cd.setListListener(p);
		p.Cnd_bill_dpt_cd.addAllListener(p);
		p.Cnd_bill_dpt_nm.setListListener(p);
		p.Cnd_bill_dpt_nm.addAllListener(p);
		p.Cnd_ar_typ.setListListener(p);
		p.Cnd_ar_typ.addAllListener(p);
		p.Cnd_ar_typ_nm.setListListener(p);
		p.Cnd_ar_typ_nm.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_appl_cmpl_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBGP_NotApplRcvActDSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBGP_NotApplRcvActDSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBGP_NotApplRcvActDSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_rcv_act_no.addAllListener(p);
		p.columnRslt_rcv_act_no.setListListener(p);
		p.columnRslt_rcv_act_d_no.addAllListener(p);
		p.columnRslt_rcv_act_d_no.setListListener(p);
		p.columnRslt_ac_ym.addAllListener(p);
		p.columnRslt_ac_ym.setListListener(p);
		p.columnRslt_ac_dt.addAllListener(p);
		p.columnRslt_ac_dt.setListListener(p);
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
		p.columnRslt_ar_dpt_cd.addAllListener(p);
		p.columnRslt_ar_dpt_cd.setListListener(p);
		p.columnRslt_ar_dpt_nm.addAllListener(p);
		p.columnRslt_ar_dpt_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_acst_cd.addAllListener(p);
		p.columnRslt_acst_cd.setListListener(p);
		p.columnRslt_acst_nm.addAllListener(p);
		p.columnRslt_acst_nm.setListListener(p);
		p.columnRslt_iv_no.addAllListener(p);
		p.columnRslt_iv_no.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_amt_dec_place.addAllListener(p);
		p.columnRslt_amt_dec_place.setListListener(p);
		p.columnRslt_ar_typ.addAllListener(p);
		p.columnRslt_ar_typ.setListListener(p);
		p.columnRslt_ar_typ_nm.addAllListener(p);
		p.columnRslt_ar_typ_nm.setListListener(p);
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
		p.columnRslt_rcv_auto_appl_flg.addAllListener(p);
		p.columnRslt_trd_rmrks.addAllListener(p);
		p.columnRslt_trd_rmrks.setListListener(p);
		p.columnRslt_bill_d_rmrks.addAllListener(p);
		p.columnRslt_bill_d_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_disp_seq.addAllListener(p);
		p.columnRslt_disp_seq.setListListener(p);
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
	protected static void mcInitBtn(MSBGP_NotApplRcvActDSrch p) {
		p.Btn_open_MSBGP0210.addAllListener(p);
		p.Btn_open_MSBGP0210.setAPMethodName("doBtn_open_MSBGP0210");
		p.Btn_open_MSBGP0220.addAllListener(p);
		p.Btn_open_MSBGP0220.setAPMethodName("doBtn_open_MSBGP0220");
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBGP_NotApplRcvActDSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBGP_NotApplRcvActDSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBGP_NotApplRcvActDSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBGP_NotApplRcvActDSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MSBGP_NotApplRcvActDSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab4(MSBGP_NotApplRcvActDSrch p){

	}

	/**
	 * [SRCH]ステータスの[AcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_AcstCnd(MSBGP_NotApplRcvActDSrch p){

	}

	/**
	 * [SRCH]ステータスの[RcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RcstCnd(MSBGP_NotApplRcvActDSrch p){

	}

	/**
	 * [SRCH]ステータスの[BcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BcstCnd(MSBGP_NotApplRcvActDSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBGP_NotApplRcvActDSrch p){
		p.Cnd_rcv_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_acst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_acst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ar_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ar_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_act_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_ar_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ar_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_appl_cmpl_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_acst_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_rcst_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bcst_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBGP_NotApplRcvActDSrch p){

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBGP_NotApplRcvActDSrch p){
		p.RPnl_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBGP_NotApplRcvActDSrch p){
		p.columnRslt_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_ar_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ar_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_tgt_appl_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_appl_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_not_appl_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ar_sttl_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ar_sttl_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt1_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ar_sttl_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ar_sttl_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt2_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_rcv_auto_appl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_acst_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_rcst_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_bcst_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
	protected static void statusInitSRCH_Btn(MSBGP_NotApplRcvActDSrch p){
		p.Btn_open_MSBGP0210.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBGP0220.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBGP_NotApplRcvActDSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBGP_NotApplRcvActDSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBGP_NotApplRcvActDSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBGP_NotApplRcvActDSrch p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MSBGP_NotApplRcvActDSrch p){

	}

	/**
	 * [REF]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab4(MSBGP_NotApplRcvActDSrch p){

	}

	/**
	 * [REF]ステータスの[AcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_AcstCnd(MSBGP_NotApplRcvActDSrch p){

	}

	/**
	 * [REF]ステータスの[RcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_RcstCnd(MSBGP_NotApplRcvActDSrch p){

	}

	/**
	 * [REF]ステータスの[BcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_BcstCnd(MSBGP_NotApplRcvActDSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBGP_NotApplRcvActDSrch p){
		p.Cnd_rcv_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_acst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_acst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ar_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ar_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_act_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_ar_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ar_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_appl_cmpl_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_acst_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_rcst_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bcst_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBGP_NotApplRcvActDSrch p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBGP_NotApplRcvActDSrch p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBGP_NotApplRcvActDSrch p){
		p.columnRslt_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_ar_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ar_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_tgt_appl_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_appl_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_not_appl_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ar_sttl_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ar_sttl_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt1_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ar_sttl_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ar_sttl_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt2_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_rcv_auto_appl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_acst_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
	protected static void statusInitREF_Btn(MSBGP_NotApplRcvActDSrch p){
		p.Btn_open_MSBGP0210.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBGP0220.putMode(p, REF, MCMode.ENABLE);

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
		MSBGP_NotApplRcvActDSrch_MC.setTableConfigRslt((MSBGP_NotApplRcvActDSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBGP_NotApplRcvActDSrch p) {
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.columnRslt_rcv_act_no.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.rcv_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_act_no);
		p.columnRslt_rcv_act_d_no.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.rcv_act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_act_d_no);
		p.columnRslt_ac_ym.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.ac_ym_META);
		p.columnRslt_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_ym);
		p.columnRslt_ac_dt.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.ac_dt_META);
		p.columnRslt_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_dt);
		p.columnRslt_rcv_dt.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.rcv_dt_META);
		p.columnRslt_rcv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_dt);
		p.columnRslt_rcst_cd.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.rcst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcst_cd);
		p.columnRslt_rcst_nm.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.rcst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcst_nm);
		p.columnRslt_bcst_cd.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.bcst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bcst_cd);
		p.columnRslt_bcst_nm.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.bcst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bcst_nm);
		p.columnRslt_bill_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.bill_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_dpt_cd);
		p.columnRslt_bill_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.bill_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_dpt_nm);
		p.columnRslt_ar_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.ar_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_dpt_cd);
		p.columnRslt_ar_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.ar_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_dpt_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_acst_cd.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.acst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acst_cd);
		p.columnRslt_acst_nm.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.acst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acst_nm);
		p.columnRslt_iv_no.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_no);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_amt_dec_place.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt_dec_place);
		p.RsltTable.addTable(p.Rslt_wrk_no_p_PPanel.WrkNoTable);
		p.columnRslt_ar_typ.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.ar_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_typ);
		p.columnRslt_ar_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.ar_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_typ_nm);
		p.RsltTable.addTable(p.Rslt_tgt_appl_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_appl_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_not_appl_bal_p_PPanel.AmtTable);
		p.columnRslt_ar_sttl_cd1.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.ar_sttl_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_sttl_cd1);
		p.columnRslt_ar_sttl_nm1.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.ar_sttl_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_sttl_nm1);
		p.columnRslt_rcv_no.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.rcv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_no);
		p.columnRslt_note_no.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.note_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_no);
		p.columnRslt_bank_ac_cd.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.bank_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_cd);
		p.columnRslt_bank_ac_nm.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.bank_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_nm);
		p.columnRslt_bank_ac_no.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.bank_ac_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_no);
		p.RsltTable.addTable(p.Rslt_trd_cur_amt1_p_PPanel.AmtTable);
		p.columnRslt_ar_sttl_cd2.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.ar_sttl_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_sttl_cd2);
		p.columnRslt_ar_sttl_nm2.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.ar_sttl_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_sttl_nm2);
		p.RsltTable.addTable(p.Rslt_trd_cur_amt2_p_PPanel.AmtTable);
		p.columnRslt_rcv_auto_appl_flg.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.rcv_auto_appl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_auto_appl_flg);
		p.columnRslt_trd_rmrks.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_rmrks);
		p.columnRslt_bill_d_rmrks.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.bill_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_d_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_disp_seq.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.disp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_seq);
		p.RsltTable.addTable(p.Rslt_acst_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_rcst_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_bcst_grp_p_PPanel.BpGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBG.MSBGP0260.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_rcst_cd.getListConfig().setPutter(getCnd_rcst_cd_ListPutter());
		Cnd_bcst_cd.getListConfig().setPutter(getCnd_bcst_cd_ListPutter());
		Cnd_acst_cd.getListConfig().setPutter(getCnd_acst_cd_ListPutter());
		Cnd_ar_dpt_cd.getListConfig().setPutter(getCnd_ar_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cd.getListConfig().setPutter(getCnd_trd_cd_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
		Cnd_bill_dpt_cd.getListConfig().setPutter(getCnd_bill_dpt_cd_ListPutter());
		Cnd_ar_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ar_typ.getListConfig().setPutter(getCnd_ar_typ_ListPutter());
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
	 * [Cnd_bcst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bcst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_acst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_acst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_ar_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ar_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_ar_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ar_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ArTyp");
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
		if(combo == Cnd_acst_cd) return getCnd_acst_cd(row, info);
		if(combo == Cnd_ar_dpt_cd) return getCnd_ar_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_trd_cd) return getCnd_trd_cd(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
		if(combo == Cnd_bill_dpt_cd) return getCnd_bill_dpt_cd(row, info);
		if(combo == Cnd_ar_typ) return getCnd_ar_typ(row, info);
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
		else if (ap == Btn_open_MSBGP0220) doBtn_open_MSBGP0220(info);
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
	 * [Btn]パネルの[open_MSBGP0220]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0220(MCEventInfo info);

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
		if (vc == Cnd_rcv_dt_fr) return doCnd_rcv_dt_fr_VC(info);
		if (vc == Cnd_rcv_dt_to) return doCnd_rcv_dt_to_VC(info);
		if (vc == Cnd_ac_dt_fr) return doCnd_ac_dt_fr_VC(info);
		if (vc == Cnd_ac_dt_to) return doCnd_ac_dt_to_VC(info);
		if (vc == Cnd_rcst_cd) return doCnd_rcst_cd_VC(info);
		if (vc == Cnd_rcst_nm) return doCnd_rcst_nm_VC(info);
		if (vc == Cnd_bcst_cd) return doCnd_bcst_cd_VC(info);
		if (vc == Cnd_bcst_nm) return doCnd_bcst_nm_VC(info);
		if (vc == Cnd_acst_cd) return doCnd_acst_cd_VC(info);
		if (vc == Cnd_acst_nm) return doCnd_acst_nm_VC(info);
		if (vc == Cnd_ar_dpt_cd) return doCnd_ar_dpt_cd_VC(info);
		if (vc == Cnd_ar_dpt_nm) return doCnd_ar_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_trd_rmrks) return doCnd_trd_rmrks_VC(info);
		if (vc == Cnd_rcv_act_no) return doCnd_rcv_act_no_VC(info);
		if (vc == Cnd_iv_no) return doCnd_iv_no_VC(info);
		if (vc == Cnd_trd_cd) return doCnd_trd_cd_VC(info);
		if (vc == Cnd_trd_nm) return doCnd_trd_nm_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_bill_dpt_cd) return doCnd_bill_dpt_cd_VC(info);
		if (vc == Cnd_bill_dpt_nm) return doCnd_bill_dpt_nm_VC(info);
		if (vc == Cnd_ar_typ) return doCnd_ar_typ_VC(info);
		if (vc == Cnd_ar_typ_nm) return doCnd_ar_typ_nm_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_appl_cmpl_flg) return doCnd_appl_cmpl_flg_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_rcv_act_no) return doRslt_rcv_act_no_VC(info);
		if (vc == columnRslt_rcv_act_d_no) return doRslt_rcv_act_d_no_VC(info);
		if (vc == columnRslt_ac_ym) return doRslt_ac_ym_VC(info);
		if (vc == columnRslt_ac_dt) return doRslt_ac_dt_VC(info);
		if (vc == columnRslt_rcv_dt) return doRslt_rcv_dt_VC(info);
		if (vc == columnRslt_rcst_cd) return doRslt_rcst_cd_VC(info);
		if (vc == columnRslt_rcst_nm) return doRslt_rcst_nm_VC(info);
		if (vc == columnRslt_bcst_cd) return doRslt_bcst_cd_VC(info);
		if (vc == columnRslt_bcst_nm) return doRslt_bcst_nm_VC(info);
		if (vc == columnRslt_bill_dpt_cd) return doRslt_bill_dpt_cd_VC(info);
		if (vc == columnRslt_bill_dpt_nm) return doRslt_bill_dpt_nm_VC(info);
		if (vc == columnRslt_ar_dpt_cd) return doRslt_ar_dpt_cd_VC(info);
		if (vc == columnRslt_ar_dpt_nm) return doRslt_ar_dpt_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_acst_cd) return doRslt_acst_cd_VC(info);
		if (vc == columnRslt_acst_nm) return doRslt_acst_nm_VC(info);
		if (vc == columnRslt_iv_no) return doRslt_iv_no_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_amt_dec_place) return doRslt_amt_dec_place_VC(info);
		if (vc == columnRslt_ar_typ) return doRslt_ar_typ_VC(info);
		if (vc == columnRslt_ar_typ_nm) return doRslt_ar_typ_nm_VC(info);
		if (vc == columnRslt_ar_sttl_cd1) return doRslt_ar_sttl_cd1_VC(info);
		if (vc == columnRslt_ar_sttl_nm1) return doRslt_ar_sttl_nm1_VC(info);
		if (vc == columnRslt_rcv_no) return doRslt_rcv_no_VC(info);
		if (vc == columnRslt_note_no) return doRslt_note_no_VC(info);
		if (vc == columnRslt_bank_ac_cd) return doRslt_bank_ac_cd_VC(info);
		if (vc == columnRslt_bank_ac_nm) return doRslt_bank_ac_nm_VC(info);
		if (vc == columnRslt_bank_ac_no) return doRslt_bank_ac_no_VC(info);
		if (vc == columnRslt_ar_sttl_cd2) return doRslt_ar_sttl_cd2_VC(info);
		if (vc == columnRslt_ar_sttl_nm2) return doRslt_ar_sttl_nm2_VC(info);
		if (vc == columnRslt_rcv_auto_appl_flg) return doRslt_rcv_auto_appl_flg_VC(info);
		if (vc == columnRslt_trd_rmrks) return doRslt_trd_rmrks_VC(info);
		if (vc == columnRslt_bill_d_rmrks) return doRslt_bill_d_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_disp_seq) return doRslt_disp_seq_VC(info);
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
	 * [Cnd]パネルの[acst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_acst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[acst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_acst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ar_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ar_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ar_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ar_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ar_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ar_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[appl_cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_appl_cmpl_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcv_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_act_d_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_dpt_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ar_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_d_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_seq_VC(MCEventInfo info){
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
		else if (nc == Cnd_rcv_dt_fr) doCnd_rcv_dt_fr_NC(info);
		else if (nc == Cnd_rcv_dt_to) doCnd_rcv_dt_to_NC(info);
		else if (nc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NC(info);
		else if (nc == Cnd_ac_dt_to) doCnd_ac_dt_to_NC(info);
		else if (nc == Cnd_rcst_cd) doCnd_rcst_cd_NC(info);
		else if (nc == Cnd_rcst_nm) doCnd_rcst_nm_NC(info);
		else if (nc == Cnd_bcst_cd) doCnd_bcst_cd_NC(info);
		else if (nc == Cnd_bcst_nm) doCnd_bcst_nm_NC(info);
		else if (nc == Cnd_acst_cd) doCnd_acst_cd_NC(info);
		else if (nc == Cnd_acst_nm) doCnd_acst_nm_NC(info);
		else if (nc == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_NC(info);
		else if (nc == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_trd_rmrks) doCnd_trd_rmrks_NC(info);
		else if (nc == Cnd_rcv_act_no) doCnd_rcv_act_no_NC(info);
		else if (nc == Cnd_iv_no) doCnd_iv_no_NC(info);
		else if (nc == Cnd_trd_cd) doCnd_trd_cd_NC(info);
		else if (nc == Cnd_trd_nm) doCnd_trd_nm_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NC(info);
		else if (nc == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NC(info);
		else if (nc == Cnd_ar_typ) doCnd_ar_typ_NC(info);
		else if (nc == Cnd_ar_typ_nm) doCnd_ar_typ_nm_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_appl_cmpl_flg) doCnd_appl_cmpl_flg_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_rcv_act_no) doRslt_rcv_act_no_NC(info);
		else if (nc == columnRslt_rcv_act_d_no) doRslt_rcv_act_d_no_NC(info);
		else if (nc == columnRslt_ac_ym) doRslt_ac_ym_NC(info);
		else if (nc == columnRslt_ac_dt) doRslt_ac_dt_NC(info);
		else if (nc == columnRslt_rcv_dt) doRslt_rcv_dt_NC(info);
		else if (nc == columnRslt_rcst_cd) doRslt_rcst_cd_NC(info);
		else if (nc == columnRslt_rcst_nm) doRslt_rcst_nm_NC(info);
		else if (nc == columnRslt_bcst_cd) doRslt_bcst_cd_NC(info);
		else if (nc == columnRslt_bcst_nm) doRslt_bcst_nm_NC(info);
		else if (nc == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NC(info);
		else if (nc == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_NC(info);
		else if (nc == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NC(info);
		else if (nc == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_acst_cd) doRslt_acst_cd_NC(info);
		else if (nc == columnRslt_acst_nm) doRslt_acst_nm_NC(info);
		else if (nc == columnRslt_iv_no) doRslt_iv_no_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_amt_dec_place) doRslt_amt_dec_place_NC(info);
		else if (nc == columnRslt_ar_typ) doRslt_ar_typ_NC(info);
		else if (nc == columnRslt_ar_typ_nm) doRslt_ar_typ_nm_NC(info);
		else if (nc == columnRslt_ar_sttl_cd1) doRslt_ar_sttl_cd1_NC(info);
		else if (nc == columnRslt_ar_sttl_nm1) doRslt_ar_sttl_nm1_NC(info);
		else if (nc == columnRslt_rcv_no) doRslt_rcv_no_NC(info);
		else if (nc == columnRslt_note_no) doRslt_note_no_NC(info);
		else if (nc == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NC(info);
		else if (nc == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NC(info);
		else if (nc == columnRslt_bank_ac_no) doRslt_bank_ac_no_NC(info);
		else if (nc == columnRslt_ar_sttl_cd2) doRslt_ar_sttl_cd2_NC(info);
		else if (nc == columnRslt_ar_sttl_nm2) doRslt_ar_sttl_nm2_NC(info);
		else if (nc == columnRslt_rcv_auto_appl_flg) doRslt_rcv_auto_appl_flg_NC(info);
		else if (nc == columnRslt_trd_rmrks) doRslt_trd_rmrks_NC(info);
		else if (nc == columnRslt_bill_d_rmrks) doRslt_bill_d_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_disp_seq) doRslt_disp_seq_NC(info);
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
	 * [Cnd]パネルの[acst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ar_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[appl_cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_appl_cmpl_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcv_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_d_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_d_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NC(MCEventInfo info){
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
		else if (ne == Cnd_rcv_dt_fr) doCnd_rcv_dt_fr_NE(info);
		else if (ne == Cnd_rcv_dt_to) doCnd_rcv_dt_to_NE(info);
		else if (ne == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NE(info);
		else if (ne == Cnd_ac_dt_to) doCnd_ac_dt_to_NE(info);
		else if (ne == Cnd_rcst_cd) doCnd_rcst_cd_NE(info);
		else if (ne == Cnd_rcst_nm) doCnd_rcst_nm_NE(info);
		else if (ne == Cnd_bcst_cd) doCnd_bcst_cd_NE(info);
		else if (ne == Cnd_bcst_nm) doCnd_bcst_nm_NE(info);
		else if (ne == Cnd_acst_cd) doCnd_acst_cd_NE(info);
		else if (ne == Cnd_acst_nm) doCnd_acst_nm_NE(info);
		else if (ne == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_NE(info);
		else if (ne == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_trd_rmrks) doCnd_trd_rmrks_NE(info);
		else if (ne == Cnd_rcv_act_no) doCnd_rcv_act_no_NE(info);
		else if (ne == Cnd_iv_no) doCnd_iv_no_NE(info);
		else if (ne == Cnd_trd_cd) doCnd_trd_cd_NE(info);
		else if (ne == Cnd_trd_nm) doCnd_trd_nm_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NE(info);
		else if (ne == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NE(info);
		else if (ne == Cnd_ar_typ) doCnd_ar_typ_NE(info);
		else if (ne == Cnd_ar_typ_nm) doCnd_ar_typ_nm_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_appl_cmpl_flg) doCnd_appl_cmpl_flg_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_rcv_act_no) doRslt_rcv_act_no_NE(info);
		else if (ne == columnRslt_rcv_act_d_no) doRslt_rcv_act_d_no_NE(info);
		else if (ne == columnRslt_ac_ym) doRslt_ac_ym_NE(info);
		else if (ne == columnRslt_ac_dt) doRslt_ac_dt_NE(info);
		else if (ne == columnRslt_rcv_dt) doRslt_rcv_dt_NE(info);
		else if (ne == columnRslt_rcst_cd) doRslt_rcst_cd_NE(info);
		else if (ne == columnRslt_rcst_nm) doRslt_rcst_nm_NE(info);
		else if (ne == columnRslt_bcst_cd) doRslt_bcst_cd_NE(info);
		else if (ne == columnRslt_bcst_nm) doRslt_bcst_nm_NE(info);
		else if (ne == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NE(info);
		else if (ne == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_NE(info);
		else if (ne == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NE(info);
		else if (ne == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_acst_cd) doRslt_acst_cd_NE(info);
		else if (ne == columnRslt_acst_nm) doRslt_acst_nm_NE(info);
		else if (ne == columnRslt_iv_no) doRslt_iv_no_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_amt_dec_place) doRslt_amt_dec_place_NE(info);
		else if (ne == columnRslt_ar_typ) doRslt_ar_typ_NE(info);
		else if (ne == columnRslt_ar_typ_nm) doRslt_ar_typ_nm_NE(info);
		else if (ne == columnRslt_ar_sttl_cd1) doRslt_ar_sttl_cd1_NE(info);
		else if (ne == columnRslt_ar_sttl_nm1) doRslt_ar_sttl_nm1_NE(info);
		else if (ne == columnRslt_rcv_no) doRslt_rcv_no_NE(info);
		else if (ne == columnRslt_note_no) doRslt_note_no_NE(info);
		else if (ne == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NE(info);
		else if (ne == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NE(info);
		else if (ne == columnRslt_bank_ac_no) doRslt_bank_ac_no_NE(info);
		else if (ne == columnRslt_ar_sttl_cd2) doRslt_ar_sttl_cd2_NE(info);
		else if (ne == columnRslt_ar_sttl_nm2) doRslt_ar_sttl_nm2_NE(info);
		else if (ne == columnRslt_rcv_auto_appl_flg) doRslt_rcv_auto_appl_flg_NE(info);
		else if (ne == columnRslt_trd_rmrks) doRslt_trd_rmrks_NE(info);
		else if (ne == columnRslt_bill_d_rmrks) doRslt_bill_d_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_disp_seq) doRslt_disp_seq_NE(info);
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
	 * [Cnd]パネルの[acst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ar_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[appl_cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_appl_cmpl_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[rcv_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_d_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_d_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NE(MCEventInfo info){
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
		else if (nx == Cnd_rcv_dt_fr) doCnd_rcv_dt_fr_NX(info);
		else if (nx == Cnd_rcv_dt_to) doCnd_rcv_dt_to_NX(info);
		else if (nx == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NX(info);
		else if (nx == Cnd_ac_dt_to) doCnd_ac_dt_to_NX(info);
		else if (nx == Cnd_rcst_cd) doCnd_rcst_cd_NX(info);
		else if (nx == Cnd_rcst_nm) doCnd_rcst_nm_NX(info);
		else if (nx == Cnd_bcst_cd) doCnd_bcst_cd_NX(info);
		else if (nx == Cnd_bcst_nm) doCnd_bcst_nm_NX(info);
		else if (nx == Cnd_acst_cd) doCnd_acst_cd_NX(info);
		else if (nx == Cnd_acst_nm) doCnd_acst_nm_NX(info);
		else if (nx == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_NX(info);
		else if (nx == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_trd_rmrks) doCnd_trd_rmrks_NX(info);
		else if (nx == Cnd_rcv_act_no) doCnd_rcv_act_no_NX(info);
		else if (nx == Cnd_iv_no) doCnd_iv_no_NX(info);
		else if (nx == Cnd_trd_cd) doCnd_trd_cd_NX(info);
		else if (nx == Cnd_trd_nm) doCnd_trd_nm_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NX(info);
		else if (nx == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NX(info);
		else if (nx == Cnd_ar_typ) doCnd_ar_typ_NX(info);
		else if (nx == Cnd_ar_typ_nm) doCnd_ar_typ_nm_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_appl_cmpl_flg) doCnd_appl_cmpl_flg_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_rcv_act_no) doRslt_rcv_act_no_NX(info);
		else if (nx == columnRslt_rcv_act_d_no) doRslt_rcv_act_d_no_NX(info);
		else if (nx == columnRslt_ac_ym) doRslt_ac_ym_NX(info);
		else if (nx == columnRslt_ac_dt) doRslt_ac_dt_NX(info);
		else if (nx == columnRslt_rcv_dt) doRslt_rcv_dt_NX(info);
		else if (nx == columnRslt_rcst_cd) doRslt_rcst_cd_NX(info);
		else if (nx == columnRslt_rcst_nm) doRslt_rcst_nm_NX(info);
		else if (nx == columnRslt_bcst_cd) doRslt_bcst_cd_NX(info);
		else if (nx == columnRslt_bcst_nm) doRslt_bcst_nm_NX(info);
		else if (nx == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NX(info);
		else if (nx == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_NX(info);
		else if (nx == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NX(info);
		else if (nx == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_acst_cd) doRslt_acst_cd_NX(info);
		else if (nx == columnRslt_acst_nm) doRslt_acst_nm_NX(info);
		else if (nx == columnRslt_iv_no) doRslt_iv_no_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_amt_dec_place) doRslt_amt_dec_place_NX(info);
		else if (nx == columnRslt_ar_typ) doRslt_ar_typ_NX(info);
		else if (nx == columnRslt_ar_typ_nm) doRslt_ar_typ_nm_NX(info);
		else if (nx == columnRslt_ar_sttl_cd1) doRslt_ar_sttl_cd1_NX(info);
		else if (nx == columnRslt_ar_sttl_nm1) doRslt_ar_sttl_nm1_NX(info);
		else if (nx == columnRslt_rcv_no) doRslt_rcv_no_NX(info);
		else if (nx == columnRslt_note_no) doRslt_note_no_NX(info);
		else if (nx == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NX(info);
		else if (nx == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NX(info);
		else if (nx == columnRslt_bank_ac_no) doRslt_bank_ac_no_NX(info);
		else if (nx == columnRslt_ar_sttl_cd2) doRslt_ar_sttl_cd2_NX(info);
		else if (nx == columnRslt_ar_sttl_nm2) doRslt_ar_sttl_nm2_NX(info);
		else if (nx == columnRslt_rcv_auto_appl_flg) doRslt_rcv_auto_appl_flg_NX(info);
		else if (nx == columnRslt_trd_rmrks) doRslt_trd_rmrks_NX(info);
		else if (nx == columnRslt_bill_d_rmrks) doRslt_bill_d_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_disp_seq) doRslt_disp_seq_NX(info);
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
	 * [Cnd]パネルの[acst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ar_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[appl_cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_appl_cmpl_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[rcv_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_d_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_d_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NX(MCEventInfo info){
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
		else if (lc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_LC(info);
		else if (lc == Cnd_ac_dt_to) doCnd_ac_dt_to_LC(info);
		else if (lc == Cnd_rcst_cd) doCnd_rcst_cd_LC(info);
		else if (lc == Cnd_rcst_nm) doCnd_rcst_nm_LC(info);
		else if (lc == Cnd_bcst_cd) doCnd_bcst_cd_LC(info);
		else if (lc == Cnd_bcst_nm) doCnd_bcst_nm_LC(info);
		else if (lc == Cnd_acst_cd) doCnd_acst_cd_LC(info);
		else if (lc == Cnd_acst_nm) doCnd_acst_nm_LC(info);
		else if (lc == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_LC(info);
		else if (lc == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_trd_rmrks) doCnd_trd_rmrks_LC(info);
		else if (lc == Cnd_rcv_act_no) doCnd_rcv_act_no_LC(info);
		else if (lc == Cnd_iv_no) doCnd_iv_no_LC(info);
		else if (lc == Cnd_trd_cd) doCnd_trd_cd_LC(info);
		else if (lc == Cnd_trd_nm) doCnd_trd_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_LC(info);
		else if (lc == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_LC(info);
		else if (lc == Cnd_ar_typ) doCnd_ar_typ_LC(info);
		else if (lc == Cnd_ar_typ_nm) doCnd_ar_typ_nm_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == columnRslt_trd_cd) doRslt_trd_cd_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_rcv_act_no) doRslt_rcv_act_no_LC(info);
		else if (lc == columnRslt_rcv_act_d_no) doRslt_rcv_act_d_no_LC(info);
		else if (lc == columnRslt_ac_ym) doRslt_ac_ym_LC(info);
		else if (lc == columnRslt_ac_dt) doRslt_ac_dt_LC(info);
		else if (lc == columnRslt_rcv_dt) doRslt_rcv_dt_LC(info);
		else if (lc == columnRslt_rcst_cd) doRslt_rcst_cd_LC(info);
		else if (lc == columnRslt_rcst_nm) doRslt_rcst_nm_LC(info);
		else if (lc == columnRslt_bcst_cd) doRslt_bcst_cd_LC(info);
		else if (lc == columnRslt_bcst_nm) doRslt_bcst_nm_LC(info);
		else if (lc == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_LC(info);
		else if (lc == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_LC(info);
		else if (lc == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_LC(info);
		else if (lc == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_acst_cd) doRslt_acst_cd_LC(info);
		else if (lc == columnRslt_acst_nm) doRslt_acst_nm_LC(info);
		else if (lc == columnRslt_iv_no) doRslt_iv_no_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_amt_dec_place) doRslt_amt_dec_place_LC(info);
		else if (lc == columnRslt_ar_typ) doRslt_ar_typ_LC(info);
		else if (lc == columnRslt_ar_typ_nm) doRslt_ar_typ_nm_LC(info);
		else if (lc == columnRslt_ar_sttl_cd1) doRslt_ar_sttl_cd1_LC(info);
		else if (lc == columnRslt_ar_sttl_nm1) doRslt_ar_sttl_nm1_LC(info);
		else if (lc == columnRslt_rcv_no) doRslt_rcv_no_LC(info);
		else if (lc == columnRslt_note_no) doRslt_note_no_LC(info);
		else if (lc == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_LC(info);
		else if (lc == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_LC(info);
		else if (lc == columnRslt_bank_ac_no) doRslt_bank_ac_no_LC(info);
		else if (lc == columnRslt_ar_sttl_cd2) doRslt_ar_sttl_cd2_LC(info);
		else if (lc == columnRslt_ar_sttl_nm2) doRslt_ar_sttl_nm2_LC(info);
		else if (lc == columnRslt_trd_rmrks) doRslt_trd_rmrks_LC(info);
		else if (lc == columnRslt_bill_d_rmrks) doRslt_bill_d_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_disp_seq) doRslt_disp_seq_LC(info);
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
	 * [Cnd]パネルの[acst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ar_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcv_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_act_d_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_d_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_acst_cd]の作成メソッド
	 */
	public MCList getCnd_acst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ar_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_ar_dpt_cd(MCRow row, MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_trd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bill_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_bill_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ar_typ]の作成メソッド
	 */
	public MCList getCnd_ar_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBGL0260.Srch01")) {
			return new MS_MSBGL0260_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBGL0260_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0260_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0260_Srch01;

		/** コンストラクタ */
		protected MS_MSBGL0260_Srch01Bridge() {
			p_MS_MSBGL0260_Srch01 = new MCParam(PDef.MS_MSBGL0260_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0260_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0260.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0260.RsltR.class));

			p_MS_MSBGL0260_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0260_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0260_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0260_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0260_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0260.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0260.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBG.MSBGP0260.RsltR> down0() {
			return (MCList<mcframe.clientMSBG.MSBGP0260.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0260_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0260.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0260_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBG.MSBGP0260.RsltR>)p_MS_MSBGL0260_Srch01.getContainerParam().getDownBlock(0));
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